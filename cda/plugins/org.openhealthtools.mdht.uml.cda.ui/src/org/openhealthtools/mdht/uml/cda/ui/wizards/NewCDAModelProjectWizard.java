/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir - initial API and implementation
 *     IBM Corporation - fixed issue related to project manifests (artf2756)
 *    
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.pde.internal.ui.wizards.IProjectProvider;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationOperation;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CopyFilesAndFoldersOperation;
import org.eclipse.ui.ide.IDE;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate;
import org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport;
import org.openhealthtools.mdht.uml.cda.ui.internal.Activator;
import org.openhealthtools.mdht.uml.cda.ui.internal.Logger;
import org.openhealthtools.mdht.uml.cda.ui.util.CDAUIUtil;
import org.osgi.framework.Bundle;

public class NewCDAModelProjectWizard extends CDAWizard {

	NewCDAModelPage newCDATemplatePage;

	private boolean checkForSpaces() {
		Bundle bundle = Platform.getBundle(org.openhealthtools.mdht.uml.cda.ui.internal.Activator.PLUGIN_ID);

		URL url = bundle.getEntry("/");

		if (url.getPath().indexOf(" ") >= 0) {
			return true;
		}

		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		IWorkspaceRoot root = workspace.getRoot();

		IPath rootPath = root.getLocation();
		if (rootPath.toOSString().indexOf(" ") >= 0) {
			return true;
		}

		return false;
	}

	@Override
	public void addPages() {

		loadCDAModels();

		if (cdaDocuments.isEmpty()) {
			MessageDialog.openWarning(
				getShell(), "MDHT CDA Project Wizard Exception",
				"Unable to create CDA Project, No Available CDA Documents in Workspace!");
			return;
		}

		if (checkForSpaces()) {
			MessageDialog.openWarning(
				getShell(), "MDHT CDA Project Wizard Exception",
				"Unable to create CDA Project, Unable to support Spaces ' ' within installation or workspace location");
			return;
		}

		newCDATemplatePage = new NewCDAModelPage("MDHT CDA Model", "Open Health Tools ", null, cdaDocuments);
		newCDATemplatePage.setDescription("Creates the CDA Model");
		newCDATemplatePage.setMessage("Use to create CDA Implementation Guide Model Project");
		addPage(newCDATemplatePage);
	}

	@Override
	public boolean performFinish() {

		try {

			ProgressMonitorDialog pd = new ProgressMonitorDialog(getShell());

			IWorkspace workspace = ResourcesPlugin.getWorkspace();

			IWorkspaceRoot root = workspace.getRoot();

			final String modelName = newCDATemplatePage.getModelName().toLowerCase();

			modelProject = root.getProject(String.format("org.openhealthtools.mdht.uml.cda.%s.model", modelName));
			generatedProject = root.getProject(String.format("org.openhealthtools.mdht.uml.cda.%s", modelName));
			docProject = root.getProject(String.format("org.openhealthtools.mdht.uml.cda.%s.doc", modelName));

			int modelVersionCounter = 1;
			while (modelProject.exists() || generatedProject.exists() || docProject.exists()) {
				modelProject = root.getProject(String.format(
					"org.openhealthtools.mdht.uml.cda.%s%d.model", modelName, modelVersionCounter));
				generatedProject = root.getProject(String.format(
					"org.openhealthtools.mdht.uml.cda.%s%d", modelName, modelVersionCounter));
				docProject = root.getProject(String.format(
					"org.openhealthtools.mdht.uml.cda.%s%d.doc", modelName, modelVersionCounter));
				modelVersionCounter++;
			}

			pd.run(false, false, new IRunnableWithProgress() {

				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

					monitor.beginTask("Creating Projects", 9);

					try {
						modelProject.create(monitor);

						modelProject.open(monitor);

						generatedProject.create(monitor);

						generatedProject.open(monitor);

						docProject.create(monitor);

						docProject.open(monitor);

						// Use pde internal functionality to create plugin

						IProjectProvider generatedProjectProvider = new IProjectProvider() {

							public IProject getProject() {

								return generatedProject;
							}

							public String getProjectName() {

								return generatedProject.getName();
							}

							public IPath getLocationPath() {

								return generatedProject.getFullPath();
							}

						};

						getContainer().run(
							false, true,
							new NewProjectCreationOperation(fPluginData, generatedProjectProvider, contentWizard));

						IProjectProvider docProjectProvider = new IProjectProvider() {

							public IProject getProject() {

								return docProject;
							}

							public String getProjectName() {

								return docProject.getName();
							}

							public IPath getLocationPath() {

								return docProject.getFullPath();
							}

						};

						getContainer().run(
							false, true,
							new NewProjectCreationOperation(fPluginData, docProjectProvider, contentWizard));

						monitor.worked(1);

						monitor.setTaskName("Create Manifest for Generated Project");
						createManifest(generatedProject, modelName);
						monitor.worked(1);

						monitor.setTaskName("Create Manifest for Doc Project");
						createManifest(docProject, modelName);
						monitor.worked(1);

						monitor.setTaskName("Create css");
						createFolder(docProject, "css");

						monitor.setTaskName("Create dita");
						createFolder(docProject, "dita");

						createDocProject(docProject, modelName);

						createPluginProperties(docProject, modelName);
						updateBuildProperties(docProject);
						createDitaProperties(docProject, modelName);

						monitor.setTaskName("Create UML Model");
						createFolder(modelProject, "model");

						createUMLModel(modelProject, modelName);
						monitor.worked(1);

						monitor.setTaskName("Create Transformation XML");
						createTransformation(generatedProject, modelName);
						monitor.worked(1);

						monitor.setTaskName("Add Properties");
						createPluginProperties(generatedProject, modelName);
						updateBuildProperties(generatedProject);

						monitor.setTaskName("Run MDHT Transformation");
						org.openhealthtools.mdht.uml.cda.ui.builder.CDABuilder.runTransformation(
							generatedProject, monitor);
						monitor.worked(1);

						monitor.setTaskName("Create GenModel");
						org.openhealthtools.mdht.uml.cda.ui.builder.CDABuilder.createGenModel(generatedProject, monitor);
						monitor.worked(1);

						monitor.setTaskName("Generate");
						org.openhealthtools.mdht.uml.cda.ui.builder.CDABuilder.runGenerate(
							false, generatedProject, monitor);
						monitor.worked(1);
						generatedProject.build(IncrementalProjectBuilder.INCREMENTAL_BUILD, monitor);

						monitor.setTaskName("Toggle Build Nature");
						org.openhealthtools.mdht.uml.cda.ui.builder.ToggleNatureAction.toggleNature(generatedProject);
						org.openhealthtools.mdht.uml.cda.ui.builder.ToggleNatureAction.toggleNature(docProject);
						monitor.worked(1);

						setupWorkspace(modelProject, modelName);

					} catch (Exception exception) {
						monitor.setCanceled(true);

						Logger.logException(exception);

						throw new InvocationTargetException(exception);

					}

				}
			});

			docProject.refreshLocal(IResource.DEPTH_INFINITE, null);
			modelProject.refreshLocal(IResource.DEPTH_INFINITE, null);
			generatedProject.refreshLocal(IResource.DEPTH_INFINITE, null);

		} catch (InvocationTargetException exception) {

			Logger.logException(exception);

			Status status = new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, 0, exception.getCause().getLocalizedMessage(), exception.getCause());

			ErrorDialog.openError(
				getShell(), "MDHT CDA Project Wizard Exception", "Unable to create new CDA Project", status);

			try {
				docProject.delete(true, null);
				modelProject.delete(true, null);
				generatedProject.delete(true, null);
			} catch (CoreException coreException) {
				Logger.logException(coreException);
			}

		} catch (InterruptedException interruptedException) {
			Logger.logException(interruptedException);
		} catch (CoreException coreException) {
			Logger.logException(coreException);
		}

		return true;
	}

	private void setupWorkspace(IProject modelProject, String modelName) throws Exception {
		IWorkbench workbench = PlatformUI.getWorkbench();
		final IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();
		activePage.closeEditors(activePage.getEditorReferences(), true);

		IFileStore fileStore = EFS.getLocalFileSystem().getStore(
			modelProject.getFolder("model").getFile(modelName + ".uml").getLocation());
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

		IDE.openEditorOnFileStore(page, fileStore);

	}

	@SuppressWarnings("unchecked")
	void createDocProject(IProject project, String modelName) throws Exception {

		CopyFilesAndFoldersOperation copyOperation = new CopyFilesAndFoldersOperation(this.getShell());
		Bundle bundle = Platform.getBundle(org.openhealthtools.mdht.uml.cda.ui.internal.Activator.PLUGIN_ID);
		ArrayList<java.net.URI> elements = new ArrayList<java.net.URI>();

		Enumeration<Object> entries = bundle.findEntries("resources/dita", "*", true);

		while (entries.hasMoreElements()) {

			elements.add(FileLocator.toFileURL(
				new URL(bundle.getEntry("/"), ((java.net.URL) entries.nextElement()).getPath())).toURI());

		}

		java.net.URI[] ditauris = new java.net.URI[elements.size()];
		elements.toArray(ditauris);
		copyOperation.copyFiles(ditauris, project.getFolder(new Path("dita")));

		entries = bundle.findEntries("resources/css", "*", true);
		elements.clear();
		while (entries.hasMoreElements()) {

			elements.add(FileLocator.toFileURL(
				new URL(bundle.getEntry("/"), ((java.net.URL) entries.nextElement()).getPath())).toURI());

		}

		java.net.URI[] cssuris = new java.net.URI[elements.size()];
		elements.toArray(cssuris);

		copyOperation.copyFiles(cssuris, project.getFolder(new Path("css")));

		entries = bundle.findEntries("resources", "dita-transform.xml", false);
		elements.clear();
		while (entries.hasMoreElements()) {

			elements.add(FileLocator.toFileURL(
				new URL(bundle.getEntry("/"), ((java.net.URL) entries.nextElement()).getPath())).toURI());

		}

		java.net.URI[] transformuris = new java.net.URI[elements.size()];
		elements.toArray(transformuris);
		copyOperation.copyFiles(transformuris, project);

		IProjectDescription description;

		description = project.getDescription();
		String[] newNatures = new String[0];
		description.setNatureIds(newNatures);
		project.setDescription(description, null);

		IFolder srcFolder = project.getFolder("src");

		if (srcFolder.exists()) {

			srcFolder.delete(true, null);

		}

		IFolder binFolder = project.getFolder("bin");

		if (binFolder.exists()) {

			binFolder.delete(true, null);

		}

	}

	private Package cloneModel(IProject project, ResourceSet resourceSet, Map<String, String> options,
			String sourcePathName, String clonePath, String packageName) throws IOException {

		URI cloneModelURI = URI.createPlatformPluginURI(sourcePathName, false);

		Package sourcePackage = (Package) EcoreUtil.getObjectByType(
			resourceSet.getResource(cloneModelURI, true).getContents(), UMLPackage.eINSTANCE.getPackageableElement());

		Package clonedPackage = EcoreUtil.copy(sourcePackage);

		clonedPackage.setName(packageName);

		IPath cloneFilePath = new Path(clonePath);

		IFile file = CDAUIUtil.getBundleRelativeFile(project, cloneFilePath);

		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

		String cdaUMLPath = myWorkspaceRoot.getLocation().toOSString() + file.getFullPath().toOSString();

		URI targetModelURI = URI.createFileURI(cdaUMLPath);

		Resource umlResource = UML22UMLResource.Factory.INSTANCE.createResource(targetModelURI);

		umlResource.getContents().add(clonedPackage);

		umlResource.save(options);

		return clonedPackage;
	}

	private final String TEMPLATEURI = String.format("%s/resources/model/%s", Activator.PLUGIN_ID, "example.uml");

	private final String VOCABURI = String.format("%s/resources/model/%s", Activator.PLUGIN_ID, "example-vocab.uml");

	void createUMLModel(IProject project, String modelName) throws Exception {

		ResourceSet resourceSet = new ResourceSetImpl();

		Map<String, String> options = new HashMap<String, String>();

		Package templatePackage = cloneModel(
			project, resourceSet, options, TEMPLATEURI, String.format("model/%s.uml", modelName.toLowerCase()),
			modelName.toLowerCase());

		Package vocabPackage = cloneModel(
			project, resourceSet, options, VOCABURI, String.format("model/%s-vocab.uml", modelName.toLowerCase()),
			String.format("%s-vocab", modelName.toLowerCase()));

		CodegenSupport codegenSupport = (CodegenSupport) templatePackage.applyStereotype(templatePackage.getApplicableStereotype("CDA::CodegenSupport"));

		codegenSupport.setBase_Namespace(templatePackage);

		codegenSupport.setBasePackage("org.openhealthtools.mdht.uml.cda");

		codegenSupport.setNsURI("http://www.openhealthtools.org/mdht/uml/cda/" + modelName.toLowerCase());

		codegenSupport.setNsPrefix(modelName.toLowerCase());

		codegenSupport.setPackageName(modelName.toLowerCase());

		codegenSupport.setPrefix(modelName);

		Class cdaClass = templatePackage.createOwnedClass(newCDATemplatePage.getCDADocumentName(), false);

		CDATemplate template = (CDATemplate) cdaClass.applyStereotype(cdaClass.getApplicableStereotype("CDA::CDATemplate"));

		template.setBase_Class(cdaClass);

		template.setTemplateId(newCDATemplatePage.getTemplateId());

		template.setAssigningAuthorityName(newCDATemplatePage.getTemplateAssigningAuthority());

		Type t = cdaDocuments.get(newCDATemplatePage.getCDADocument());

		if (t instanceof Class) {
			Class documentClass = (Class) t;
			cdaClass.createGeneralization(documentClass);
			Package documentPackage = documentClass.getNearestPackage();
			EcoreUtil.resolveAll(documentPackage);
			templatePackage.createPackageImport(documentClass.getNearestPackage());
			for (Package importedPackage : documentPackage.getImportedPackages()) {
				templatePackage.createPackageImport(importedPackage);
			}
		}

		templatePackage.createPackageImport(vocabPackage);

		templatePackage.eResource().save(options);

	}

	void createTransformation(IProject project, String modelName) throws Exception {

		StringWriter swriter = new StringWriter();

		PrintWriter writer = new PrintWriter(swriter);

		writer.println("<?eclipse version=\"3.0\"?>");
		writer.println("<project name=\"CDA Model Transformation\"  basedir=\".\" default=\"all\">");
		writer.println("<property name=\"cdaPluginPath\" location=\"${basedir}/../org.openhealthtools.mdht.uml.cda\"/>");
		writer.println("<property name=\"modelName\" value=\"" + modelName.toLowerCase() + "\"/>");
		writer.println("<macrodef name=\"convertEcorePaths\">");
		writer.println("<attribute name=\"filePath\"/>");
		writer.println("<sequential>");

		for (String cdaPackage : cdaPackages.keySet()) {
			if (!"cda".equals(cdaPackage)) {
				writer.println("<replace file=\"@{filePath}\" token=\".model/model/" + cdaPackage +
						".uml\" value=\"/model/" + cdaPackage + "_Ecore.uml\"/>");

				if (cdaPackages.get(cdaPackage).eResource() != null) {
					for (Resource controlledResource : org.openhealthtools.mdht.uml.common.util.UMLUtil.getControlledResources(cdaPackages.get(
						cdaPackage).eResource())) {

						writer.println(String.format(
							"<replace file=\"@{filePath}\" token=\".model/model/.controlled/%s\" value=\"/model/%s_Ecore.uml\"/>",
							controlledResource.getURI().lastSegment(), cdaPackage));
					}
				}

			}
		}

		writer.println("</sequential>");
		writer.println("</macrodef>");

		writer.println("<import file=\"${cdaPluginPath}/transform-common.xml\"/>");
		writer.println("</project>");

		writer.flush();

		swriter.close();

		InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));

		createFile(project, "transform.xml", is);

	}

	void createDitaProperties(IProject project, String modelName) throws Exception {

		StringWriter swriter = new StringWriter();

		PrintWriter writer = new PrintWriter(swriter);

		writer.println("projectName = " + modelName);
		writer.println("modelName = " + modelName);
		writer.flush();

		swriter.close();

		InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));

		createFile(project, "dita.properties", is);

	}

	void createPluginProperties(IProject project, String modelName) throws Exception {

		StringWriter swriter = new StringWriter();

		PrintWriter writer = new PrintWriter(swriter);

		writer.println("pluginName = " + modelName + " Model");
		writer.println("providerName = Provider Name Here");

		writer.flush();

		swriter.close();

		InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));

		createFile(project, "plugin.properties", is);

	}

	void updateBuildProperties(IProject project) throws Exception {

		StringWriter swriter = new StringWriter();
		PrintWriter writer = new PrintWriter(swriter);
		writer.println("source.. = src/");
		writer.println("output.. = bin/");
		if (project.equals(docProject)) {
			writer.println("bin.includes = META-INF/,\\");
		} else {
			writer.println("bin.includes = plugin.xml,\\");
			writer.println("               META-INF/,\\");
		}
		writer.println("               .,\\");
		writer.println("               plugin.properties");
		writer.flush();
		swriter.close();
		InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));
		IPath path = new Path("build.properties");
		IFile file = CDAUIUtil.getBundleRelativeFile(project, path);
		file.setContents(is, true, false, null);

	}

	void createManifest(IProject project, String modelName) throws Exception {

		IFile manfiestFile = cdaDocumentsManifest.get(newCDATemplatePage.getCDADocument());

		InputStream input = new FileInputStream(manfiestFile.getRawLocation().toOSString());

		Manifest projectManifest = new Manifest(input);

		Attributes attributes = projectManifest.getMainAttributes();

		IFile manifest = CDAUIUtil.getManifest(project);

		StringWriter swriter = new StringWriter();

		PrintWriter writer = new PrintWriter(swriter);

		writer.println("Bundle-Name: %pluginName");

		if (project.equals(generatedProject)) {
			writer.println(String.format(
				"Bundle-SymbolicName: org.openhealthtools.mdht.uml.cda.%s;singleton:=true", modelName));
			writer.println("Bundle-ActivationPolicy: lazy");
			writer.println(String.format(
				"Bundle-Activator: org.openhealthtools.mdht.uml.cda.%s.%sPlugin$Implementation", modelName,
				modelName.substring(0, 1).toUpperCase() + modelName.substring(1)));
		} else if (project.equals(docProject)) {
			writer.println(String.format(
				"Bundle-SymbolicName: org.openhealthtools.mdht.uml.cda.%s.doc;singleton:=true", modelName));
		}

		// writer.println("Bundle-Version: 0.7.0.qualifier");

		writer.println("Bundle-ClassPath: .");
		writer.println("Bundle-Vendor: %providerName");
		writer.println("Bundle-Localization: plugin");
		// writer.println("Bundle-RequiredExecutionEnvironment: J2SE-1.5");

		String requiredBundles = attributes.getValue("Require-Bundle");

		if (!project.getName().endsWith(".doc")) {

			String sourceBundle = attributes.getValue("Bundle-SymbolicName");

			String rb[] = requiredBundles.split(",");

			String sb[] = sourceBundle.split(";");

			for (int index = 0; index < rb.length; index++) {

				if (index == 0) {
					writer.print("Require-Bundle: " + rb[index]);
				} else {

					if (index > 0) {
						writer.println(",");
						writer.print(" " + rb[index]);
					}
				}

			}

			if (sb.length > 0) {
				writer.println(",");
				writer.println(" " + sb[0] + ";visibility:=reexport");
			}

			writer.println(String.format("Export-Package: org.openhealthtools.mdht.uml.cda.%s,", modelName));
			writer.println(String.format(" org.openhealthtools.mdht.uml.cda.%s.impl,", modelName));
			writer.println(String.format(" org.openhealthtools.mdht.uml.cda.%s.operations,", modelName));
			writer.println(String.format(" org.openhealthtools.mdht.uml.cda.%s.util", modelName));
		}

		writer.flush();

		swriter.close();

		InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));

		manifest.appendContents(is, true, false, null);

	}

}
