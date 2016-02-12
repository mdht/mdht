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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

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
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
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
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil.FindResourcesByNameVisitor;
import org.openhealthtools.mdht.uml.cda.ui.actions.ImportDitaReferences;
import org.openhealthtools.mdht.uml.cda.ui.editors.MDHTPreferences;
import org.openhealthtools.mdht.uml.cda.ui.internal.Activator;
import org.openhealthtools.mdht.uml.cda.ui.util.CDAUIUtil;

public class CDABuilder extends IncrementalProjectBuilder {

	private static final QualifiedName cleanStatus = new QualifiedName(
		"org.openhealthtools.mdht.uml.cda.ui.builder", "status");

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

	class CheckForDitaDelete implements IResourceDeltaVisitor {

		public ArrayList<String> deletedDitaFolders = new ArrayList<String>();

		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			if (delta.getKind() == IResourceDelta.REMOVED && resource instanceof IFolder &&
					resource.getName().endsWith(".doc")) {
				deletedDitaFolders.add(resource.getName());
			}
			return true;
		}
	}

	public static final String BUILDER_ID = "org.openhealthtools.mdht.uml.cda.ui.org.openhealthtools.mdht.uml.cda.builder.id";

	private static final String ANNOTATIONSOURCE = "http://www.eclipse.org/emf/2002/GenModel/importer/org.eclipse.uml2.uml.ecore.importer";

	private static final String ECOREIMPORTER = "org.eclipse.uml2.uml.ecore.importer";

	private static final String VALIDATEPREFIX = "validate";

	private static final String TEMPLATESDIR = "/org.openhealthtools.mdht.uml.cda/templates";

	private static boolean checkBuildStatus(IProject modelProject, IProject project) {
		long modelModification = IResource.NULL_STAMP;

		long lastGenerated = IResource.NULL_STAMP;
		try {

			Boolean projectStatus = (Boolean) project.getSessionProperty(cleanStatus);

			if (projectStatus != null && projectStatus.equals(Boolean.TRUE)) {
				project.setSessionProperty(cleanStatus, Boolean.FALSE);
				return true;
			}

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
			return true;
		}

		return modelModification > lastGenerated;

	}

	/**
	 * getTemplatesDirectory returns the templates directory where the cda.uml model is found
	 * This is to support extensions
	 *
	 * @return
	 */
	private static String getTemplatesDirectory() {

		try {
			FindResourcesByNameVisitor visitor = new FindResourcesByNameVisitor("cda.uml");

			IWorkspace iw = org.eclipse.core.resources.ResourcesPlugin.getWorkspace();

			iw.getRoot().accept(visitor);

			if (!visitor.getResources().isEmpty() && visitor.getResources().size() == 1) {
				return "/" + visitor.getResources().get(0).getProject().getName() + "/templates";
			}

		} catch (CoreException e) {

		}

		return TEMPLATESDIR;
	}

	public static class CollectGenPackages implements IResourceVisitor {

		/**
		 * @param resourceSet
		 */
		public CollectGenPackages(ResourceSet resourceSet) {
			super();
			this.resourceSet = resourceSet;
		}

		Set<org.eclipse.emf.codegen.ecore.genmodel.GenPackage> genPackages = new LinkedHashSet<org.eclipse.emf.codegen.ecore.genmodel.GenPackage>();

		private ResourceSet resourceSet = null;

		public boolean visit(IResource resource) throws CoreException {

			if (resource.getFileExtension() != null && "genmodel".equals(resource.getFileExtension())) {
				GenModel sourceGenModel = (GenModel) EcoreUtil.getObjectByType(
					resourceSet.getResource(
						URI.createPlatformResourceURI(resource.getFullPath().toString(), true), true).getContents(),
					GenModelPackage.eINSTANCE.getGenModel());

				if (sourceGenModel != null) {
					for (org.eclipse.emf.codegen.ecore.genmodel.GenPackage usedGenPackage : sourceGenModel.getAllGenAndUsedGenPackagesWithClassifiers()) {
						if (genPackages.add(usedGenPackage)) {
						}
					}
				}
			}
			return true;
		}

	}

	public static void createGenModel(IProject project, IProgressMonitor monitor) {

		EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);

		ResourceSet resourceSet = new ResourceSetImpl();

		URI umlEcoreModelURI = CDAUIUtil.getUMLEcoreModel(project);

		org.eclipse.uml2.uml.Package pe = (org.eclipse.uml2.uml.Package) EcoreUtil.getObjectByType(
			resourceSet.getResource(umlEcoreModelURI, true).getContents(), UMLPackage.eINSTANCE.getPackage());

		String basePackage = (String) pe.getValue(pe.getAppliedStereotype("Ecore::EPackage"), "basePackage");

		String nsPrefix = (String) pe.getValue(pe.getAppliedStereotype("Ecore::EPackage"), "nsPrefix");

		String nsURI = (String) pe.getValue(pe.getAppliedStereotype("Ecore::EPackage"), "nsURI");

		String prefix = (String) pe.getValue(pe.getAppliedStereotype("Ecore::EPackage"), "prefix");

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
		genmodel.setModelPluginClass(prefix + "Plugin");
		genmodel.setModelPluginID(basePackage + "." + modelName);
		genmodel.setImporterID(ECOREIMPORTER);
		genmodel.setInvariantPrefix(VALIDATEPREFIX);
		genmodel.setCopyrightFields(false);
		genmodel.setComplianceLevel(GenJDKLevel.JDK70_LITERAL);
		genmodel.setRuntimeVersion(GenRuntimeVersion.EMF25);
		genmodel.setTemplateDirectory(getTemplatesDirectory());
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

		CollectGenPackages lgmv = new CollectGenPackages(resourceSet);

		try {
			project.getWorkspace().getRoot().accept(lgmv);
			for (org.eclipse.emf.codegen.ecore.genmodel.GenPackage genPackage : lgmv.genPackages) {
				genmodel.getUsedGenPackages().add(genPackage);
			}
		} catch (CoreException e2) {

		}

		GenPackage genPackage = GenModelFactory.eINSTANCE.createGenPackage();

		genPackage.setDisposableProviderFactory(true);

		genPackage.setBasePackage(basePackage);

		genPackage.setOperationsPackage(String.format("%s.%s.operations", basePackage, modelName));

		genPackage.setPrefix(prefix);

		EPackage value = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEPackage();
		value.setName(modelName);
		value.setNsPrefix(nsPrefix);
		value.setNsURI(nsURI);

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
				IProject testProject = project.getWorkspace().getRoot().getProject(project.getName() + ".tests");

				if (testProject.isOpen()) {
					generator.generate(genmodel, GenBaseGeneratorAdapter.TESTS_PROJECT_TYPE, umlImportMonitor);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	private static void runPublishDita(IProject project, IProgressMonitor monitor) throws IOException, CoreException,
			URISyntaxException {

		IFile ditaMapFile = CDAUIUtil.getProjectFile(project, CDAUIUtil.DITA_PATH, "book.ditamap");

		// should PDF and DITA-OT be skipped for this build
		boolean disablePdf = Activator.getDefault().getPreferenceStore().getBoolean(MDHTPreferences.PDF_GEN_STORE_VALUE);

		if (ditaMapFile != null && !disablePdf) {
			DitaUtil.publish(ditaMapFile, "pdf,eclipsehelp");
		}
	}

	private static final ArrayList<String> EMPTYLIST = new ArrayList<String>();

	public static void runTransformation(IProject project, IProgressMonitor monitor) {
		runTransformation(project, monitor, EMPTYLIST);
	}

	private static void runTransformation(IProject project, IProgressMonitor monitor, ArrayList<String> deleteDitaFolder) {

		try {
			String antFileName = null;
			if (project.getName().endsWith(".doc")) {
				antFileName = "dita-transform.xml";
			} else {
				antFileName = "transform.xml";
			}

			ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();

			String launchMemento = String.format("%s.%s", project.getName(), antFileName);

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
			String name = launchMemento; // launchManager.generateLaunchConfigurationName(launchMemento);
			ILaunchConfigurationWorkingCopy workingCopy = type.newInstance(null, name);

			workingCopy.setAttribute(
				"org.eclipse.ui.externaltools.ATTR_LOCATION", transformxml.getLocation().toOSString());
			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, project.getName());
			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_DEFAULT_CLASSPATH, true);
			workingCopy.setAttribute(IDebugUIConstants.ATTR_CONSOLE_PROCESS, false);
			workingCopy.setAttribute(IDebugUIConstants.ATTR_LAUNCH_IN_BACKGROUND, false);
			workingCopy.setAttribute(IDebugUIConstants.PREF_BUILD_BEFORE_LAUNCH, false);
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
			workingCopy.delete();
		} catch (CoreException e) {
			e.printStackTrace();
		}

		// Reimport dita references
		if (project.getName().endsWith(".doc")) {
			IFolder ditaGeneratedFolder = project.getFolder("dita/classes");
			if (ditaGeneratedFolder.exists()) {
				try {
					for (IResource member : ditaGeneratedFolder.members()) {
						if (member.exists() && member instanceof IFolder &&
								!deleteDitaFolder.contains(member.getName())) {
							IProject sourceProject = project.getWorkspace().getRoot().getProject(member.getName());
							if (sourceProject.exists() && sourceProject.isOpen()) {
								ImportDitaReferences.importDitaProject(project.getWorkspace(), sourceProject, project);
							}
						}
					}
				} catch (CoreException e) {
					// If issues, ignore
				}

			}
		}

	}

	/**
	 * Opens .modelStatus file which is created by the validateModel ant task
	 * This is needed currently because unable to get anything other then success from
	 * ant tasks running during build
	 *
	 * @param modelProject
	 * @return
	 */
	boolean isModelValid(IProject modelProject) {

		boolean status = true;
		IFile statusFile = modelProject.getFile(new Path("model/.modelStatus"));

		if (statusFile != null) {
			try {
				statusFile.refreshLocal(IResource.DEPTH_ZERO, null);
				BufferedReader reader = new BufferedReader(new InputStreamReader(statusFile.getContents()));
				StringBuilder out = new StringBuilder();
				String line;
				while ((line = reader.readLine()) != null) {
					out.append(line);
				}
				if (Integer.valueOf(out.toString()) > 1) {
					status = false;
				}
				reader.close();
			} catch (Exception e) {
				// e.printStackTrace();
			}

		}
		return status;

	}

	@Override
	@SuppressWarnings("rawtypes")
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		boolean isDocumentProject = false;
		String modelProjectName = null;
		IResourceDelta docProjectDelta = null;
		CheckForDitaDelete cfdd = new CheckForDitaDelete();
		if (getProject().getName().endsWith(".doc")) {
			docProjectDelta = getDelta(getProject());
			if (docProjectDelta != null) {
				docProjectDelta.accept(cfdd);
			}
			modelProjectName = getProject().getName().replace(".doc", ".model");
			isDocumentProject = true;
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
			// If this is clean or generate project, always run,
			// if increment build and Document project make sure the model is valid; This way the modeler can see the issues
			//
			if (IncrementalProjectBuilder.FULL_BUILD == kind || !isDocumentProject || isModelValid(modelProject)) {
				runTransformation(getProject(), monitor, cfdd.deletedDitaFolders);
				runGenerate(IncrementalProjectBuilder.FULL_BUILD == kind, getProject(), monitor);
			}
		}

		return projects;
	}

	@Override
	protected void clean(IProgressMonitor monitor) throws CoreException {
		getProject().setSessionProperty(cleanStatus, Boolean.TRUE);
	}

}
