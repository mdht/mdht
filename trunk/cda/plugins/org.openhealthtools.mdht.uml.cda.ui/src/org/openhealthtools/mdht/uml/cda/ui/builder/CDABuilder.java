/*******************************************************************************
 * Copyright (c) 2010 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir - initial API and implementation
 *    
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ui.builder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.dita.dost.util.DitaUtil;
import org.eclipse.ant.core.AntCorePlugin;
import org.eclipse.ant.core.IAntClasspathEntry;
import org.eclipse.ant.internal.core.AntClasspathEntry;
import org.eclipse.ant.launching.IAntLaunchConstants;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenAnnotation;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenRuntimeVersion;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.uml2.codegen.ecore.genmodel.GenPackage;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ecore.importer.UMLImporter;
import org.openhealthtools.mdht.uml.cda.ui.util.CDAUIUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

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

	private static final String ANNOTATIONSOURCE = "http://www.eclipse.org/emf/2002/GenModel/importer/org.eclipse.uml2.uml.ecore.importer";

	private static final String ECOREIMPORTER = "org.eclipse.uml2.uml.ecore.importer";

	private static final String VALIDATEPREFIX = "validate";

	private static final String TEMPLATESDIR = "/org.openhealthtools.mdht.uml.cda/templates";

	private static final String CDABASE = "org.openhealthtools.mdht.uml.cda";

	private static boolean checkBuildStatus(IProject modelProject, IProject project) {
		long modelModification = IResource.NULL_STAMP;

		long lastGenerated = IResource.NULL_STAMP;
		try {
			for (IResource umlResources : modelProject.getFolder(new Path("model")).members()) {
				if (umlResources.getName().endsWith(".uml")) {

					if (umlResources.getLocalTimeStamp() > modelModification) {
						modelModification = umlResources.getLocalTimeStamp();
					}

				}
			}

			if (project.getName().endsWith(".doc")) {
				for (IResource pdfResources : project.getFolder(new Path("dita/classes/generated")).members()) {
					if (pdfResources.getName().endsWith(".dita")) {
						if (pdfResources.getLocalTimeStamp() > lastGenerated) {
							lastGenerated = pdfResources.getLocalTimeStamp();
						}

					}
				}
			} else {
				for (IResource ecoreUMLResources : project.getFolder(new Path("model")).members()) {
					if (ecoreUMLResources.getName().endsWith("_Ecore.uml")) {
						if (ecoreUMLResources.getLocalTimeStamp() > lastGenerated) {
							lastGenerated = ecoreUMLResources.getLocalTimeStamp();
						}

					}
				}
			}

		} catch (CoreException e) {

		}

		return modelModification > lastGenerated;

	}

	public static void createGenModel(IProject project, IProgressMonitor monitor) {

		EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);

		ResourceSet resourceSet = new ResourceSetImpl();

		URI umlEcoreModelURI = CDAUIUtil.getUMLEcoreModel(project);

		org.eclipse.uml2.uml.Package pe = (org.eclipse.uml2.uml.Package) EcoreUtil.getObjectByType(
			resourceSet.getResource(umlEcoreModelURI, true).getContents(), UMLPackage.eINSTANCE.getPackage());

		String modelName = pe.getName();

		IPath filePath = new Path(String.format("model/%s.genmodel", modelName));

		IFile file = CDAUIUtil.getBundleRelativeFile(project, filePath);

		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

		String genmodelPath = myWorkspaceRoot.getLocation().toOSString() + file.getFullPath().toOSString();

		URI genmodelURI = URI.createFileURI(genmodelPath);

		Resource genmodelResource = resourceSet.createResource(genmodelURI);

		org.eclipse.uml2.codegen.ecore.genmodel.GenModel genmodel = org.eclipse.uml2.codegen.ecore.genmodel.GenModelFactory.eINSTANCE.createGenModel();

		genmodel.setModelName(String.format("%s_Ecore", modelName));
		genmodel.setModelDirectory(String.format("%s/src", project.getName()));
		genmodel.setModelPluginClass(modelName.substring(0, 1).toUpperCase() + modelName.substring(1) + "Plugin");
		genmodel.setModelPluginID(CDABASE + "." + modelName);
		genmodel.setImporterID(ECOREIMPORTER);
		genmodel.setInvariantPrefix(VALIDATEPREFIX);
		genmodel.setCopyrightFields(false);
		genmodel.setComplianceLevel(GenJDKLevel.JDK50_LITERAL);
		genmodel.setRuntimeVersion(GenRuntimeVersion.EMF25);
		genmodel.setTemplateDirectory(TEMPLATESDIR);
		genmodel.setDynamicTemplates(true);
		genmodel.getForeignModel().add(String.format("%s.uml", genmodel.getModelName()));
		genmodel.setPluralizedGetters(true);

		GenAnnotation ga = org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory.eINSTANCE.createGenAnnotation();
		ga.setSource(ANNOTATIONSOURCE);
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__UNION_PROPERTIES, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURES, "PROCESS");
		ga.getDetails().put(
			org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__COMMENTS, "PROCESS");
		ga.getDetails().put(
			org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE, "PROCESS");
		ga.getDetails().put(
			org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS, "PROCESS");
		ga.getDetails().put(
			org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS, "PROCESS");
		ga.getDetails().put(
			org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__ANNOTATION_DETAILS, "PROCESS");
		ga.getDetails().put(
			org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE, "PROCESS");
		ga.getDetails().put(
			org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__DERIVED_FEATURES, "IGNORE");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__OPERATION_BODIES, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__CAMEL_CASE_NAMES, "IGNORE");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER, "PROCESS");

		genmodel.getGenAnnotations().add(ga);

		for (org.eclipse.emf.codegen.ecore.genmodel.GenPackage genPackage : getGenModel(project).values()) {
			genmodel.getUsedGenPackages().add(genPackage);
		}

		GenPackage genPackage = GenModelFactory.eINSTANCE.createGenPackage();

		genPackage.setDisposableProviderFactory(true);

		genPackage.setBasePackage(CDABASE);

		genPackage.setOperationsPackage(String.format("org.openhealthtools.mdht.uml.cda.%s.operations", modelName));

		EPackage value = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEPackage();
		value.setName(modelName);
		value.setNsPrefix(modelName);
		value.setNsURI(String.format("http://www.openhealthtools.org/mdht/uml/cda/%s", modelName));

		IPath epackageFilePath = new Path(String.format("model/%s.ecore", modelName));

		IFile epackage = CDAUIUtil.getBundleRelativeFile(project, epackageFilePath);

		String epackagePath = myWorkspaceRoot.getLocation().toOSString() + epackage.getFullPath().toOSString();

		URI epackageURI = URI.createFileURI(epackagePath);

		Resource ecoreResource = resourceSet.createResource(epackageURI);

		ecoreResource.getContents().add(value);

		try {
			ecoreResource.save(null);
		} catch (IOException e1) {

		}

		genPackage.setEcorePackage(value);
		genmodel.getGenPackages().add(genPackage);
		genmodelResource.getContents().add(genmodel);

		try {
			ecoreResource.save(null);
			genmodelResource.save(null);
		} catch (IOException e) {

		}

	}

	private static String getFileNameFromMap(String ditaMapPath) {

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

	private static HashMap<org.eclipse.emf.codegen.ecore.genmodel.GenPackage, org.eclipse.emf.codegen.ecore.genmodel.GenPackage> getGenModel(
			IProject modelProject) {

		HashMap<org.eclipse.emf.codegen.ecore.genmodel.GenPackage, org.eclipse.emf.codegen.ecore.genmodel.GenPackage> genPackages = new HashMap<org.eclipse.emf.codegen.ecore.genmodel.GenPackage, org.eclipse.emf.codegen.ecore.genmodel.GenPackage>();

		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		ResourceSet resourceSet = new ResourceSetImpl();

		IWorkspaceRoot root = workspace.getRoot();

		for (IProject project : root.getProjects()) {

			if (!modelProject.getName().equals(project.getName())) {
				URI genmodelFile = CDAUIUtil.getGeneratorModel(project);
				if (genmodelFile != null) {
					GenModel sourceGenModel = (GenModel) EcoreUtil.getObjectByType(
						resourceSet.getResource(genmodelFile, true).getContents(),
						GenModelPackage.eINSTANCE.getGenModel());

					if (sourceGenModel != null) {
						for (org.eclipse.emf.codegen.ecore.genmodel.GenPackage usedGenPackage : sourceGenModel.getUsedGenPackages()) {
							genPackages.put(usedGenPackage, usedGenPackage);
						}

						for (org.eclipse.emf.codegen.ecore.genmodel.GenPackage usedGenPackage : sourceGenModel.getGenPackages()) {
							genPackages.put(usedGenPackage, usedGenPackage);
						}
					}

				}
			}

		}

		return genPackages;
	}

	public static void runGenerate(boolean cleanBuild, IProject project, IProgressMonitor monitor) {

		if (project.getName().endsWith(".doc")) {
			if (cleanBuild) {
				try {
					runPublishDita(project, monitor);

					project.refreshLocal(IResource.DEPTH_INFINITE, monitor);

				} catch (IOException e) {

				} catch (CoreException e) {

				} catch (URISyntaxException e) {

				}
			}
		} else {
			UMLImporter umlImporter = new UMLImporter();

			try {
				org.eclipse.emf.common.util.Monitor umlImportMonitor = BasicMonitor.toMonitor(monitor);
				if (CDAUIUtil.getGeneratorModelFile(project) == null) {
					createGenModel(project, monitor);
				}
				umlImporter.setGenModelProjectLocation(project.getFullPath());
				umlImporter.defineOriginalGenModelPath(CDAUIUtil.getGeneratorModelFile(project));
				umlImporter.computeEPackages(umlImportMonitor);
				for (EPackage ePackage : umlImporter.getEPackages()) {
					EcoreUtil.resolveAll(ePackage);
				}
				umlImporter.prepareGenModelAndEPackages(umlImportMonitor);
				umlImporter.saveGenModelAndEPackages(umlImportMonitor);
				org.eclipse.emf.codegen.ecore.genmodel.GenModel genmodel = umlImporter.getGenModel();

				genmodel.setUpdateClasspath(false);
				genmodel.setCanGenerate(true);
				Generator generator = new Generator();
				generator.setInput(umlImporter.getGenModel());

				genmodel.setCanGenerate(true);

				generator.generate(genmodel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, umlImportMonitor);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	private static void runPublishDita(IProject project, IProgressMonitor monitor) throws IOException, CoreException,
			URISyntaxException {

		IFile ditaMapFile = CDAUIUtil.getProjectFile(project, CDAUIUtil.DITA_PATH, "book.ditamap");

		if (ditaMapFile != null) {
			DitaUtil.publish(ditaMapFile, "pdf");
		}
	}

	public static void runTransformation(IProject project, IProgressMonitor monitor) {

		try {
			String antFileName = null;
			if (project.getName().endsWith(".doc")) {
				antFileName = "dita-transform.xml";
			} else {
				antFileName = "transform.xml";
			}

			ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();

			String launchMemento = String.format("%s.%s", project.getName(), antFileName);

			try {
				ILaunchConfiguration oldLaunchConfiguration = launchManager.getLaunchConfiguration(launchMemento);
				if (oldLaunchConfiguration != null) {
					oldLaunchConfiguration.delete();
				}
			} catch (CoreException ce) {
				// Ignore exception, keep going
			}

			ArrayList<IAntClasspathEntry> classpathEntries = new ArrayList<IAntClasspathEntry>();

			IAntClasspathEntry[] additionalClassPathEntries = AntCorePlugin.getPlugin().getPreferences().getAdditionalClasspathEntries();

			if (additionalClassPathEntries != null) {
				for (IAntClasspathEntry antClasspathEntry : additionalClassPathEntries) {
					classpathEntries.add(antClasspathEntry);
				}
			}

			final String BIN = "bin";
			for (IProject wsProject : project.getWorkspace().getRoot().getProjects()) {
				if (wsProject.isOpen() && !wsProject.getName().startsWith(".")) {
					IFolder binFolder = wsProject.getFolder(BIN);
					if (binFolder.exists()) {
						String binFolderString = binFolder.getLocation().toOSString();
						// check to see if the entry exists
						boolean needToAdd = true;
						for (IAntClasspathEntry antClasspathEntry : classpathEntries) {
							if (antClasspathEntry.getEntryURL().toString().endsWith(binFolderString)) {
								needToAdd = false;
								break;
							}

						}
						if (needToAdd) {
							classpathEntries.add(new AntClasspathEntry(binFolderString + "/"));
						}
					}
				}

			}

			AntCorePlugin.getPlugin().getPreferences().setAdditionalClasspathEntries(
				classpathEntries.toArray(new IAntClasspathEntry[classpathEntries.size()]));

			ILaunchConfigurationType type = launchManager.getLaunchConfigurationType(IAntLaunchConstants.ID_ANT_LAUNCH_CONFIGURATION_TYPE);

			IFile transformxml = project.getFile(antFileName);
			String name = launchManager.generateLaunchConfigurationName(launchMemento);
			ILaunchConfigurationWorkingCopy workingCopy = type.newInstance(null, name);
			workingCopy.setAttribute(
				"org.eclipse.ui.externaltools.ATTR_LOCATION", transformxml.getLocation().toOSString());
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

	@Override
	@SuppressWarnings("rawtypes")
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		String modelProjectName = null;
		if (getProject().getName().endsWith(".doc")) {
			modelProjectName = getProject().getName().replace(".doc", ".model");
		} else {
			modelProjectName = getProject().getName() + ".model";
		}
		IProject modelProject = root.getProject(modelProjectName);

		IProject[] projects = new IProject[] { modelProject };

		IResourceDelta modelProjectDelta = getDelta(modelProject);

		CheckForModelChanged cfmc = new CheckForModelChanged();

		if (modelProjectDelta != null) {
			modelProjectDelta.accept(cfmc);

		}

		if (cfmc.hasModelChanged || checkBuildStatus(modelProject, getProject())) {
			runTransformation(getProject(), monitor);
			runGenerate(IncrementalProjectBuilder.FULL_BUILD == kind, getProject(), monitor);
		}

		return projects;
	}

	@Override
	protected void clean(IProgressMonitor monitor) throws CoreException {
		runTransformation(getProject(), monitor);
		runGenerate(true, getProject(), monitor);
	}

}
