/*******************************************************************************
 * Copyright (c) 2012 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir - initial API and implementation
 *
 *
 * $Id$
 *******************************************************************************/
package org.dita.dost.util;

import java.io.File;
import java.io.FileInputStream;
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

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.lang.StringUtils;
import org.apache.xerces.util.XMLCatalogResolver;
import org.eclipse.ant.internal.launching.launchConfigurations.AntHomeClasspathEntry;
import org.eclipse.ant.internal.launching.launchConfigurations.ContributedClasspathEntriesEntry;
import org.eclipse.ant.launching.IAntLaunchConstants;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.osgi.framework.Bundle;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class DitaUtil {

	public static void validate(IPath tmpFileInWorkspaceDir) throws IOException, ParserConfigurationException,
			SAXException, URISyntaxException {

		// TODO delete commented out code which was used for debugging (debug code needs to stay at least two releases after 2.5.9)
		// Get the XSD file
		Bundle bundle = Platform.getBundle("org.dita.dost");
		// Path ditaSchemadirPath = new Path("DITA-OT/schema/technicalContent/xsd/topic.xsd");
		// URL ditaXSD = FileLocator.toFileURL(FileLocator.find(bundle, ditaSchemadirPath, null));
		Path ditaFolderPath = new Path("DITA-OT");
		URL ditaFolder = FileLocator.toFileURL(FileLocator.find(bundle, ditaFolderPath, null));
		// System.out.println(ditaFolder);

		// Create DBF and ignore DTD
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		dbf.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
		DocumentBuilder parser = dbf.newDocumentBuilder();
		Document document = parser.parse(tmpFileInWorkspaceDir.toFile());

		// create a SchemaFactory capable of understanding WXS schemas
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

		// Use catalog
		// Path ditaCatalogPath = new Path("DITA-OT/schema/catalog.xml");
		// URL ditaCatalog = FileLocator.toFileURL(FileLocator.find(bundle, ditaCatalogPath, null));
		File ditaCatalogFile = new File(ditaFolder.getFile(), "schema/catalog.xml");
		// System.out.println(ditaCatalogFile);
		// System.out.println(ditaCatalogFile.exists());
		XMLCatalogResolver resolver = new XMLCatalogResolver(new String[] { ditaCatalogFile.getAbsolutePath() });
		schemaFactory.setResourceResolver(resolver);

		// load a WXS schema, represented by a Schema instance
		File ditaSchemaFile = new File(ditaFolder.getFile(), "schema/technicalContent/xsd/topic.xsd");

		// System.out.println(ditaSchemaFile);
		// System.out.println(ditaSchemaFile.exists());
		Source schemaFile = new StreamSource(ditaSchemaFile);
		Schema schema = schemaFactory.newSchema(schemaFile);
		Validator validator = schema.newValidator();

		DOMSource dom = new DOMSource(document);
		validator.validate(dom);
	}

	public static ILaunch publish(IFile ditaMapFile, String antTargets) throws IOException, CoreException,
			URISyntaxException {
		return publish(ditaMapFile, antTargets, "ditaval.xml");
	}

	public static ILaunch publish(IFile ditaMapFile, String antTargets, String ditavalFileName) throws IOException,
			CoreException, URISyntaxException {

		IProject ditaProject = ditaMapFile.getProject();

		IFolder ditaFolder = ditaProject.getFolder(new Path("dita"));

		IFile ditaValFile = ditaFolder.getFile(ditavalFileName);

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

		Bundle bundle = Platform.getBundle("org.dita.dost");

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

		String ditaRequiredBundles = attributes.getValue("Require-Bundle");

		for (String requiredBundleSymbolicName : ditaRequiredBundles.split(",")) {

			// get before ;
			Bundle requiredBundle = Platform.getBundle(requiredBundleSymbolicName.split(";")[0]);

			// Assume the bundle is optional if null
			if (requiredBundle != null) {
				File file = FileLocator.getBundleFile(requiredBundle);

				IRuntimeClasspathEntry requiredBundleEntry = JavaRuntime.newArchiveRuntimeClasspathEntry(new Path(
					file.getPath()));
				requiredBundleEntry.setClasspathProperty(IRuntimeClasspathEntry.USER_CLASSES);
				classpath.add(requiredBundleEntry.getMemento());
			}
		}

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

		String name = launchManager.generateLaunchConfigurationName("Publish DITA");

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

		if (ditaValFile != null) {
			antProperties.put("args.filter", ditaValFile.getLocation().toOSString());

		}

		antProperties.put(
			"ditaMapFileName",
			ditaMapFile.getName().substring(0, ditaMapFile.getName().length() - ditaMapFile.getFileExtension().length()));

		// antProperties.put("outputLocation", ditaProject.getLocation().toOSString());
		antProperties.put("dita.output", ditaProject.getLocation().append(antTargets).toOSString());
		antProperties.put("ditaMapFileRoot", ditaMapFileRoot);

		String fileName = getFileNameFromMap(ditaMapFile.getLocation().toOSString());
		if (StringUtils.isEmpty(fileName)) {
			fileName = ditaMapFile.getName().replace("." + ditaMapFile.getFileExtension(), "");
		}

		antProperties.put("fileName", fileName);
		antProperties.put("args.debug", "no");
		antProperties.put("ditaFilePath", ditaFolder.getLocation().toOSString());
		antProperties.put(
			"tempFilePath",
			org.dita.dost.internal.Activator.getDefault().getStateLocation().append("temp").toOSString());
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

		return workingCopy.launch(ILaunchManager.RUN_MODE, null, false, true);
	}

	private static String getFileNameFromMap(String ditaMapPath) {

		StringBuffer fileName = new StringBuffer();

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

			doc = builder.parse(new InputSource(ditaMapStream));

			XPathFactory xFactory = XPathFactory.newInstance();

			XPath xpath = xFactory.newXPath();

			expr = xpath.compile("//bookmap/bookmeta/prodinfo/prodname");

			Node prodNameNode = (Node) expr.evaluate(doc, XPathConstants.NODE);

			if (prodNameNode != null) {

				fileName.append(prodNameNode.getTextContent());

				expr = xpath.compile("//bookmap/bookmeta/prodinfo/vrmlist");

				Element vrmlistNode = (Element) expr.evaluate(doc, XPathConstants.NODE);

				if (vrmlistNode != null) {
					NodeList versions = vrmlistNode.getElementsByTagName("vrm");
					if (versions.getLength() > 0) {

						NamedNodeMap versionAttributes = versions.item(0).getAttributes();
						Attr releaseAttr = (Attr) versionAttributes.getNamedItem("release");

						if (releaseAttr != null) {
							fileName.append(String.format("_%s", releaseAttr.getValue()));
						}

						Attr versionAttr = (Attr) versionAttributes.getNamedItem("version");

						if (versionAttr != null) {
							fileName.append(String.format("_%s", versionAttr.getValue()));
						}
					}
				}
			} else {
				expr = xpath.compile("/bookmap");
				prodNameNode = (Node) expr.evaluate(doc, XPathConstants.NODE);
				if (prodNameNode != null) {
					Node node = prodNameNode.getAttributes().getNamedItem("id");
					if (node != null) {
						fileName.append(node.getTextContent());
					}
				} else {
					expr = xpath.compile("/map");
					prodNameNode = (Node) expr.evaluate(doc, XPathConstants.NODE);
					if (prodNameNode != null) {
						Node node = prodNameNode.getAttributes().getNamedItem("title");
						if (node != null) {
							fileName.append(node.getTextContent());
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println();
		}
		return fileName.toString();
	}

}
