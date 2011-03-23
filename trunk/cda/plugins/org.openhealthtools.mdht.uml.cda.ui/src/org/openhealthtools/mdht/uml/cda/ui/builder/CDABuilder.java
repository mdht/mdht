package org.openhealthtools.mdht.uml.cda.ui.builder;

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
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.uml2.uml.ecore.importer.UMLImporter;
import org.openhealthtools.mdht.uml.cda.ui.internal.Activator;
import org.openhealthtools.mdht.uml.cda.ui.util.CDAUIUtil;
import org.osgi.framework.Bundle;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

@SuppressWarnings("restriction")
public class CDABuilder extends IncrementalProjectBuilder {

	class CheckForModelChanged implements IResourceDeltaVisitor {
		public boolean hasModelChanged = false;

		public boolean visit(IResourceDelta delta) throws CoreException {

			IResource resource = delta.getResource();

			if (delta.getKind() == IResourceDelta.CHANGED && resource.getName().endsWith(".uml")) {
				hasModelChanged = true;
			}

			return true;

		}
	}

	public static final String BUILDER_ID = "org.openhealthtools.mdht.uml.cda.ui.org.openhealthtools.mdht.uml.cda.builder.id";

	@SuppressWarnings("rawtypes")
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		String modelProjectName = null;
		if (getProject().getName().endsWith(".doc")) {
			modelProjectName = getProject().getName().replace(".doc", ".model");
		} else
		{
			modelProjectName = getProject().getName() + ".model";
		}
		IProject modelProject = root.getProject(modelProjectName);

		IProject[] projects = new IProject[] { modelProject };

		IResourceDelta modelProjectDelta = getDelta(modelProject);

		if (modelProjectDelta != null) {

			CheckForModelChanged cfmc = new CheckForModelChanged();

			modelProjectDelta.accept(cfmc);

			if (cfmc.hasModelChanged) {
				runTransformation(getProject(), monitor);
				runGenerate(getProject(), monitor);
			}

		}

		return projects;
	}

	private void runTransformation(IProject project, IProgressMonitor monitor) {

		try {
			String antFileName = null;
			if (project.getName().endsWith(".doc")) {
				antFileName = "dita-transform.xml";
			} else {
				antFileName = "transform.xml";
			}

			ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();

			ILaunchConfigurationType type = launchManager.getLaunchConfigurationType(IAntLaunchConstants.ID_ANT_LAUNCH_CONFIGURATION_TYPE);

			IFile transformxml = project.getFile(antFileName);
			String name = launchManager.generateLaunchConfigurationName(project.getName() + transformxml.getName());
			ILaunchConfigurationWorkingCopy workingCopy = type.newInstance(null, name);
			workingCopy.setAttribute("org.eclipse.ui.externaltools.ATTR_LOCATION", transformxml.getLocation().toOSString());
			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, project.getName());
			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_DEFAULT_CLASSPATH, true);
			workingCopy.setAttribute(IDebugUIConstants.ATTR_CONSOLE_PROCESS, false);
			workingCopy.setAttribute(IDebugUIConstants.ATTR_LAUNCH_IN_BACKGROUND, false);
			ILaunch launch = workingCopy.launch(ILaunchManager.RUN_MODE, monitor);

			boolean terminated = false;
			while (!terminated) {
				for (IProcess process : launch.getProcesses()) {
					terminated = process.isTerminated();
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					terminated = true;
				}
			}

		} catch (CoreException e) {
			e.printStackTrace();
		}

	}

	private void runGenerate(IProject project, IProgressMonitor monitor) {

		if (project.getName().endsWith(".doc")) {
			try {
				runPublishDita(project,monitor);
			} catch (IOException e) {
			
			} catch (CoreException e) {
				
			} catch (URISyntaxException e) {
			
			}
		} else {
			UMLImporter umlImporter = new UMLImporter();

			try {
				org.eclipse.emf.common.util.Monitor umlImportMonitor = BasicMonitor.toMonitor(monitor);
				umlImporter.setGenModelProjectLocation(project.getFullPath());
				umlImporter.defineOriginalGenModelPath(CDAUIUtil.getGeneratorModelFile(project));
				umlImporter.computeEPackages(umlImportMonitor);

				for (EPackage ePackage : umlImporter.getEPackages()) {
					EcoreUtil.resolveAll(ePackage);
				}

				umlImporter.prepareGenModelAndEPackages(umlImportMonitor);
				umlImporter.saveGenModelAndEPackages(umlImportMonitor);
				org.eclipse.emf.codegen.ecore.genmodel.GenModel genmodel = umlImporter.getGenModel();
				genmodel.setCanGenerate(true);
				Generator generator = new Generator();
				generator.setInput(umlImporter.getGenModel());
				genmodel.setCanGenerate(true);
				generator.generate(genmodel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, umlImportMonitor);

			} catch (Exception e) {

			}
		}

	}
	
	
	
	
	private void runPublishDita(IProject project, IProgressMonitor monitor) throws IOException, CoreException, URISyntaxException {

		IFolder ditaFolder = project.getFolder("dita");

		IFile ditaMapFile =  CDAUIUtil.getProjectFile(project,CDAUIUtil.DITA_PATH, "book.ditamap");
		
		if (ditaMapFile == null)
		{
			return;
		}
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
				IRuntimeClasspathEntry pluginEntry = JavaRuntime.newRuntimeContainerClasspathEntry(new Path(url.getPath()), IRuntimeClasspathEntry.USER_CLASSES);
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

		workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, "-Djavax.xml.transform.TransformerFactory=net.sf.saxon.TransformerFactoryImpl");

		Map<String, String> antProperties = new HashMap<String, String>();

		antProperties.put("dita.dir", ditadirURL.toURI().getRawPath());
		antProperties.put("ditaMapFile", ditaMapFile.getLocation().toOSString());
		antProperties.put("outputLocation", project.getLocation().toOSString());
		antProperties.put("pdf.output", Activator.getDefault().getStateLocation().append("pdf").toOSString());
		antProperties.put("ditaMapFileRoot", ditaMapFileRoot);

		String fileName = getFileNameFromMap(ditaMapFile.getLocation().toOSString());
		if (fileName == null) {
			fileName = project.getName();
		}

		antProperties.put("fileName", fileName);
		antProperties.put("args.debug", "no");
		antProperties.put("ditaFilePath", ditaFolder.getLocation().toOSString());
		antProperties.put("tempFilePath", Activator.getDefault().getStateLocation().append("temp").toOSString());
		antProperties.put("docProject", project.getLocation().toOSString());


	    String pdfFileLocation =  ditaMapFile.getName();
		pdfFileLocation = pdfFileLocation.replaceFirst(".ditamap", ".pdf");
		antProperties.put("pdflocation", pdfFileLocation);
		

		workingCopy.setAttribute("process_factory_id", "org.eclipse.ant.ui.remoteAntProcessFactory");
		workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, "org.eclipse.ant.internal.ui.antsupport.InternalAntRunner");

		workingCopy.setAttribute(org.eclipse.core.externaltools.internal.IExternalToolConstants.ATTR_WORKING_DIRECTORY, project.getLocation().toOSString());
		workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_VM_ARGUMENTS, jvmArguments.toString());
		workingCopy.setAttribute(org.eclipse.ant.launching.IAntLaunchConstants.ATTR_ANT_TARGETS, antTargets);
		workingCopy.setAttribute(IAntLaunchConstants.ATTR_ANT_PROPERTIES, antProperties);
		workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_CLASSPATH, classpath);
		workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_DEFAULT_CLASSPATH, false);
		workingCopy.setAttribute(IDebugUIConstants.ATTR_CONSOLE_PROCESS, false);
		workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_CLASSPATH_PROVIDER, "org.eclipse.ant.ui.AntClasspathProvider");
		workingCopy.setAttribute(IDebugUIConstants.ATTR_LAUNCH_IN_BACKGROUND, false);

		workingCopy.setAttribute(DebugPlugin.ATTR_CONSOLE_ENCODING, "UTF-8");

		workingCopy.migrate();

		workingCopy.launch(ILaunchManager.RUN_MODE, monitor, false, true);

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
}
