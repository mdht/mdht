/*******************************************************************************
 * Copyright (c) 2011 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.dita.actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.management.ManagementFactory;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.ant.internal.launching.launchConfigurations.AntHomeClasspathEntry;
import org.eclipse.ant.internal.launching.launchConfigurations.ContributedClasspathEntriesEntry;
import org.eclipse.ant.launching.IAntLaunchConstants;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.osgi.framework.Bundle;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

@SuppressWarnings("restriction")
public class PublishModelAction implements IObjectActionDelegate {

	protected IWorkbenchPart activePart;

	protected ISelection currentSelection;

	public PublishModelAction() {

	}

	private String getFileNameFromMap(String ditaMapPath) {

		String fileName = null;

		try {

			FileInputStream ditaMapStream;

			ditaMapStream = new FileInputStream(ditaMapPath);

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

			factory.setNamespaceAware(true);

			factory.setValidating(false);

			factory.setFeature("http://xml.org/sax/features/namespaces", false);
			factory.setFeature("http://xml.org/sax/features/validation", false);
			factory.setFeature("http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
			factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);

			DocumentBuilder builder;

			Document doc = null;

			XPathExpression expr = null;

			builder = factory.newDocumentBuilder();

			doc = builder.parse(new InputSource(ditaMapStream)); // zipFile.getInputStream(pluginEntry)));

			XPathFactory xFactory = XPathFactory.newInstance();

			XPath xpath = xFactory.newXPath();

			expr = xpath.compile("//bookmap/booktitle/mainbooktitle");

			Node result = (Node) expr.evaluate(doc, XPathConstants.NODE);

			if (result != null) {

				fileName = result.getTextContent();
			} else {

				expr = xpath.compile("/bookmap");

				result = (Node) expr.evaluate(doc, XPathConstants.NODE);

				if (result != null) {
					fileName = result.getAttributes().getNamedItem("id").getTextContent();
				}
			}

			// If there is any issue parsing - we use the project name
		} catch (FileNotFoundException e) {
		} catch (ParserConfigurationException e) {
		} catch (SAXException e) {
		} catch (IOException e) {
		} catch (XPathExpressionException e) {
		}
		return fileName;
	}

	public void run(IAction action) {
		try {
			runPublishDita();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}

	}

	private void runPublishDita() throws IOException, CoreException, URISyntaxException {
		IProject ditaProject = null;

		IFolder ditaFolder = null;

		IFile ditaMapFile = null;

		if (currentSelection instanceof TreeSelection) {
			TreeSelection treeSelection = (TreeSelection) currentSelection;

			for (TreePath treePath : treeSelection.getPaths()) {
				if (treePath.getFirstSegment() instanceof IProject) {
					ditaProject = (IProject) treePath.getFirstSegment();
				}

				if (treePath.getSegmentCount() > 2) {
					if (treePath.getSegment(treePath.getSegmentCount() - 2) instanceof IFolder) {
						ditaFolder = (IFolder) treePath.getSegment(treePath.getSegmentCount() - 2);
					}
				}

				if (treePath.getLastSegment() instanceof IFile) {
					ditaMapFile = (IFile) treePath.getLastSegment();
				}
			}

		}

		// ManagementFactory.getRuntimeMXBean().
		StringBuffer jvmArguments = new StringBuffer();
		for (String arg : ManagementFactory.getRuntimeMXBean().getInputArguments()) {
			if (arg.startsWith("-X")) {
				jvmArguments.append(arg);
				jvmArguments.append(" ");
			}
		}

		jvmArguments.append("-Dfile.encoding=UTF-8 ");

		String[] segments = ditaMapFile.getName().split("\\.");

		String ditaMapFileRoot = segments[0];

		// Assume pdf target ,developer-pdf
		String antTargets = "standards-pdf,developer-pdf";

		if (ditaMapFile.getName().endsWith("-web.ditamap")) {
			antTargets = "standards-eclipsehelp";
		}

		Bundle bundle = Platform.getBundle("org.openhealthtools.mdht.uml.cda.dita");

		Path path = new Path("META-INF/MANIFEST.MF");

		URL fileURL = FileLocator.find(bundle, path, null);

		Path ditadirPath = new Path("DITA-OT");

		URL ditadirURL = FileLocator.find(bundle, ditadirPath, null);

		ditadirURL = FileLocator.toFileURL(ditadirURL);

		InputStream in = fileURL.openStream();

		Manifest ditaPluginManifest = new Manifest(in);

		Attributes attributes = ditaPluginManifest.getMainAttributes();

		String ditaClassPath = attributes.getValue("Bundle-ClassPath");

		List<String> classpath = new ArrayList<String>();

		for (String classPath : ditaClassPath.split(",")) {
			if (".".equals(classPath)) {
				URL url = FileLocator.find(bundle, new Path(""), null);
				url = FileLocator.toFileURL(url);
				IRuntimeClasspathEntry pluginEntry = JavaRuntime.newRuntimeContainerClasspathEntry(
					new Path(url.getPath()), IRuntimeClasspathEntry.USER_CLASSES);
				classpath.add(pluginEntry.getMemento());
			} else {
				URL url = FileLocator.find(bundle, new Path(classPath), null);
				url = FileLocator.toFileURL(url);
				IRuntimeClasspathEntry toolsEntry = JavaRuntime.newArchiveRuntimeClasspathEntry(new Path(url.getPath()));
				toolsEntry.setClasspathProperty(IRuntimeClasspathEntry.USER_CLASSES);
				classpath.add(toolsEntry.getMemento());
			}
		}

		ContributedClasspathEntriesEntry ccee = new ContributedClasspathEntriesEntry();

		AntHomeClasspathEntry ace = new AntHomeClasspathEntry();

		classpath.add(ace.getMemento());

		classpath.add(ccee.getMemento());

		ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();

		ILaunchConfigurationType type = launchManager.getLaunchConfigurationType(IAntLaunchConstants.ID_ANT_LAUNCH_CONFIGURATION_TYPE);

		URL ditaPublishBuildFileURL = fileURL = FileLocator.find(bundle, new Path("dita-publish.xml"), null);

		ditaPublishBuildFileURL = FileLocator.toFileURL(ditaPublishBuildFileURL);

		String name = launchManager.generateLaunchConfigurationName("Publish CDA");

		ILaunchConfigurationWorkingCopy workingCopy = type.newInstance(null, name);

		workingCopy.setAttribute("org.eclipse.ui.externaltools.ATTR_LOCATION", ditaPublishBuildFileURL.getPath());

		IVMInstall jre = JavaRuntime.getDefaultVMInstall();

		workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_JRE_CONTAINER_PATH, jre.getName());

		workingCopy.setAttribute(
			IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS,
			"-Djavax.xml.transform.TransformerFactory=net.sf.saxon.TransformerFactoryImpl");

		Map<String, String> antProperties = new HashMap<String, String>();

		antProperties.put("dita.dir", ditadirURL.getPath());
		antProperties.put("ditaMapFile", ditaMapFile.getLocation().toOSString());
		antProperties.put("outputLocation", ditaProject.getLocation().toOSString());
		antProperties.put(
			"pdf.output",
			org.openhealthtools.mdht.uml.cda.dita.internal.Activator.getDefault().getStateLocation().append("pdf").toOSString());
		antProperties.put("ditaMapFileRoot", ditaMapFileRoot);

		String fileName = getFileNameFromMap(ditaMapFile.getLocation().toOSString());
		if (fileName == null) {
			fileName = ditaProject.getName();
		}

		antProperties.put("fileName", fileName);
		antProperties.put("args.debug", "no");
		antProperties.put("ditaFilePath", ditaFolder.getLocation().toOSString());
		antProperties.put(
			"tempFilePath",
			org.openhealthtools.mdht.uml.cda.dita.internal.Activator.getDefault().getStateLocation().append("temp").toOSString());
		antProperties.put("docProject", ditaProject.getLocation().toOSString());

		String pdfFileLocation = ditaMapFile.getName();
		pdfFileLocation = pdfFileLocation.replaceFirst(".ditamap", ".pdf");
		antProperties.put("pdflocation", pdfFileLocation);

		workingCopy.setAttribute("process_factory_id", "org.eclipse.ant.ui.remoteAntProcessFactory");
		workingCopy.setAttribute(
			IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME,
			"org.eclipse.ant.internal.ui.antsupport.InternalAntRunner");

		workingCopy.setAttribute(
			org.eclipse.core.externaltools.internal.IExternalToolConstants.ATTR_WORKING_DIRECTORY,
			ditaProject.getLocation().toOSString());
		workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_VM_ARGUMENTS, jvmArguments.toString());
		workingCopy.setAttribute(org.eclipse.ant.launching.IAntLaunchConstants.ATTR_ANT_TARGETS, antTargets);
		workingCopy.setAttribute(IAntLaunchConstants.ATTR_ANT_PROPERTIES, antProperties);
		workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_CLASSPATH, classpath);
		workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_DEFAULT_CLASSPATH, false);
		workingCopy.setAttribute(IDebugUIConstants.ATTR_CONSOLE_PROCESS, false);
		workingCopy.setAttribute(
			IJavaLaunchConfigurationConstants.ATTR_CLASSPATH_PROVIDER, "org.eclipse.ant.ui.AntClasspathProvider");
		workingCopy.setAttribute(IDebugUIConstants.ATTR_LAUNCH_IN_BACKGROUND, true);

		workingCopy.setAttribute(DebugPlugin.ATTR_CONSOLE_ENCODING, "UTF-8");

		workingCopy.migrate();

		workingCopy.doSave();

		workingCopy.launch(ILaunchManager.RUN_MODE, null, false, true);

	}

	/**
	 * @throws URISyntaxException
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		currentSelection = selection;
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;

	}

}
