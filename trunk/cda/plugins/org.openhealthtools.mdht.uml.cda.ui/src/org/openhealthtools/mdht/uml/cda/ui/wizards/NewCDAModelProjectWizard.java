package org.openhealthtools.mdht.uml.cda.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.pde.internal.ui.wizards.IProjectProvider;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationOperation;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CopyFilesAndFoldersOperation;
import org.eclipse.ui.ide.IDE;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate;
import org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport;
import org.openhealthtools.mdht.uml.cda.ui.internal.Activator;
import org.openhealthtools.mdht.uml.cda.ui.util.CDAUIUtil;
import org.osgi.framework.Bundle;

@SuppressWarnings("restriction")
public class NewCDAModelProjectWizard extends CDAWizard  {


	NewCDAModelPage newCDATemplatePage;


	public void addPages() {

		loadCDAModels();

		newCDATemplatePage = new NewCDAModelPage("MDHT CDA Model", "Open Health Tools ", null, cdaDocuments);
		newCDATemplatePage.setDescription("Creates the CDA Model");
		newCDATemplatePage.setMessage("Use to create CDA Implementation Guide Model Project");
		addPage(newCDATemplatePage);
	}

	public boolean performFinish() {

		try {

			ProgressMonitorDialog pd = new ProgressMonitorDialog(getShell());

			IWorkspace workspace = ResourcesPlugin.getWorkspace();

			IWorkspaceRoot root = workspace.getRoot();
			
			final String modelName=newCDATemplatePage.getModelName().toLowerCase();

			modelProject = root.getProject(String.format("org.openhealthtools.mdht.uml.cda.%s.model", modelName));
			generatedProject = root.getProject(String.format("org.openhealthtools.mdht.uml.cda.%s", modelName));
			docProject = root.getProject(String.format("org.openhealthtools.mdht.uml.cda.%s.doc", modelName));

			int modelVersionCounter = 1;
			while (modelProject.exists() || generatedProject.exists() || docProject.exists()) {
				modelProject = root.getProject(String.format("org.openhealthtools.mdht.uml.cda.%s%d.model", modelName, modelVersionCounter));
				generatedProject = root.getProject(String.format("org.openhealthtools.mdht.uml.cda.%s%d", modelName, modelVersionCounter));
				docProject = root.getProject(String.format("org.openhealthtools.mdht.uml.cda.%s%d.doc", modelName, modelVersionCounter));
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
						
						getContainer().run(false, true, new NewProjectCreationOperation(fPluginData, generatedProjectProvider, contentWizard));
						
						
						
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
						
						getContainer().run(false, true, new NewProjectCreationOperation(fPluginData, docProjectProvider, contentWizard));

						monitor.worked(1);

						monitor.setTaskName("Create Manifest for Generated Project");
						createManifest(generatedProject,modelName);
						monitor.worked(1);

						monitor.setTaskName("Create Manifest for Doc Project");
						createManifest(docProject,modelName);
						monitor.worked(1);
						
						monitor.setTaskName("Create css");
						createFolder(docProject, "css");
						
						monitor.setTaskName("Create dita");
						createFolder(docProject, "dita");
						
						createDocProject(docProject,modelName);
						
						createDitaProperties(docProject,modelName);
						
						monitor.setTaskName("Create UML Model");
						createFolder(modelProject, "model");

						createUMLModel(modelProject,modelName);
						monitor.worked(1);

						monitor.setTaskName("Create Transformation XML");
						createTransformation(generatedProject,modelName);
						monitor.worked(1);
					
						monitor.setTaskName("Add Properties");
						createPluginProperties(generatedProject,modelName);


						monitor.setTaskName("Run MDHT Transformation");
						org.openhealthtools.mdht.uml.cda.ui.builder.CDABuilder.runTransformation(generatedProject, monitor);
						monitor.worked(1);

						monitor.setTaskName("Create GenModel");
						org.openhealthtools.mdht.uml.cda.ui.builder.CDABuilder.createGenModel(generatedProject, monitor);
						monitor.worked(1);

						
						monitor.setTaskName("Generate");
						org.openhealthtools.mdht.uml.cda.ui.builder.CDABuilder.runGenerate(generatedProject, monitor);
						monitor.worked(1);
						generatedProject.build(IncrementalProjectBuilder.INCREMENTAL_BUILD, monitor);

						
						monitor.setTaskName("Toggle Build Nature");
						org.openhealthtools.mdht.uml.cda.ui.builder.ToggleNatureAction.toggleNature(generatedProject);
						org.openhealthtools.mdht.uml.cda.ui.builder.ToggleNatureAction.toggleNature(docProject);
						monitor.worked(1);
						
						
						
						setupWorkspace(modelProject,modelName);
						
//						generatedProject.build(IncrementalProjectBuilder.FULL_BUILD, monitor);

					} catch (CoreException e) {
						monitor.setCanceled(true);
					}

				}
			});

			docProject.refreshLocal(IResource.DEPTH_INFINITE, null);
			modelProject.refreshLocal(IResource.DEPTH_INFINITE, null);
			generatedProject.refreshLocal(IResource.DEPTH_INFINITE, null);

		} catch (InvocationTargetException e) {

			e.printStackTrace();
		} catch (InterruptedException e) {

			e.printStackTrace();
		} catch (CoreException e) {			
			e.printStackTrace();
		}

		return true;
	}
	
	
	private void setupWorkspace(IProject modelProject, String modelName)
	{
		IWorkbench workbench = PlatformUI.getWorkbench();
		final IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();
        activePage.closeEditors( activePage.getEditorReferences(), true);
		
            IFileStore fileStore = EFS.getLocalFileSystem().getStore(modelProject.getFolder("model").getFile(modelName + ".uml").getLocation());
            IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
         
            try {
                IDE.openEditorOnFileStore( page, fileStore );
            } catch ( PartInitException e ) {
            }
	}
	
	@SuppressWarnings("unchecked")
	void createDocProject(IProject project,String modelName)
	{
		
		
		CopyFilesAndFoldersOperation copyOperation = new CopyFilesAndFoldersOperation(this.getShell());
		Bundle bundle = Platform.getBundle(org.openhealthtools.mdht.uml.cda.ui.internal.Activator.PLUGIN_ID);
		ArrayList<java.net.URI> elements = new ArrayList<java.net.URI>();

		Enumeration<Object> entries = bundle.findEntries("resources/dita", "*", true);

		while (entries.hasMoreElements()) {
			try {
				java.net.URL url = (java.net.URL) entries.nextElement();
				elements.add(FileLocator.toFileURL(FileLocator.resolve(url)).toURI());
			} catch (URISyntaxException e1) {
			} catch (IOException es) {

			}
		}

		java.net.URI[] ditauris = new java.net.URI[elements.size()];
		elements.toArray(ditauris);
		copyOperation.copyFiles(ditauris, project.getFolder(new Path("dita")));

		entries = bundle.findEntries("resources/css", "*", true);
		elements.clear();
		while (entries.hasMoreElements()) {
			try {
				java.net.URL url = (java.net.URL) entries.nextElement();
				elements.add(FileLocator.toFileURL(FileLocator.resolve(url)).toURI());
			} catch (URISyntaxException e1) {
			} catch (IOException es) {

			}
		}

		java.net.URI[] cssuris = new java.net.URI[elements.size()];
		elements.toArray(cssuris);

		copyOperation.copyFiles(cssuris, project.getFolder(new Path("css")));

		entries = bundle.findEntries("resources", "dita-transform.xml", false);
		elements.clear();
		while (entries.hasMoreElements()) {
			try {
				java.net.URL url = (java.net.URL) entries.nextElement();
				elements.add(FileLocator.toFileURL(FileLocator.resolve(url)).toURI());
			} catch (URISyntaxException e1) {
			} catch (IOException es) {

			}
		}

		java.net.URI[] transformuris = new java.net.URI[elements.size()];
		elements.toArray(transformuris);
		copyOperation.copyFiles(transformuris, project);
		
	}

	void createUMLModel(IProject project,String modelName) {

		try {

			ResourceSet resourceSet = new ResourceSetImpl();

			URI cdaTemplateModelURI = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/resources/model/example.uml", false);

			PackageableElement cdaTemplateModel = (PackageableElement) EcoreUtil.getObjectByType(resourceSet.getResource(cdaTemplateModelURI, true).getContents(),
					UMLPackage.eINSTANCE.getPackageableElement());

			PackageableElement clonedModel = EcoreUtil.copy(cdaTemplateModel);

			IPath filePath = new Path("model/" + modelName.toLowerCase() + ".uml");

			IFile file = CDAUIUtil.getBundleRelativeFile(project, filePath);

			IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

			String cdaUMLPath = myWorkspaceRoot.getLocation().toOSString() + file.getFullPath().toOSString();

			URI cdaUMLURI = URI.createFileURI(cdaUMLPath);

			Resource umlResource = UML22UMLResource.Factory.INSTANCE.createResource(cdaUMLURI);

			umlResource.getContents().add(clonedModel);

			Map<String, String> options = new HashMap<String, String>();

			// Save initial clone model - This is required to allow uml2
			// stereotypes to actually be applied
			umlResource.save(options);

			if (clonedModel instanceof Package) {

				Package clonePackage = (Package) clonedModel;

				CodegenSupport codegenSupport = (CodegenSupport) clonePackage.applyStereotype(clonePackage.getApplicableStereotype("CDA::CodegenSupport"));

				codegenSupport.setBase_Namespace(clonePackage);

				codegenSupport.setBasePackage("org.openhealthtools.mdht.uml.cda");

				codegenSupport.setNsURI("http://www.openhealthtools.org/mdht/uml/cda/" + modelName.toLowerCase());

				codegenSupport.setNsPrefix(modelName.toLowerCase());

				codegenSupport.setPackageName(modelName.toLowerCase());

				codegenSupport.setPrefix(modelName);

				clonePackage.setName(modelName.toLowerCase());

				Class cdaClass = clonePackage.createOwnedClass(newCDATemplatePage.getCDADocumentName(), false);

				CDATemplate template = (CDATemplate) cdaClass.applyStereotype(cdaClass.getApplicableStereotype("CDA::CDATemplate"));

				template.setBase_Class(cdaClass);

				template.setTemplateId(newCDATemplatePage.getTemplateId());

				template.setAssigningAuthorityName(newCDATemplatePage.getTemplateAssigningAuthority());

				Type t = cdaDocuments.get(newCDATemplatePage.getCDADocument());

				if (t instanceof Class) {
					Class documentClass = (Class) t;

					cdaClass.createGeneralization((Classifier) documentClass);				
					Package documentPackage = documentClass.getNearestPackage();
					EcoreUtil.resolveAll(documentPackage); 					
					clonePackage.createPackageImport(documentClass.getNearestPackage());
					for (Package importedPackage : documentPackage.getImportedPackages())
					{
						clonePackage.createPackageImport(importedPackage);
					}
				}

			}

			umlResource.save(options);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	void createTransformation(IProject project,String modelName) {

		try {

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
					writer.println("<replace file=\"@{filePath}\" token=\".model/model/" + cdaPackage + ".uml\" value=\"/model/" + cdaPackage + "_Ecore.uml\"/>");

					if (cdaPackages.get(cdaPackage).eResource() != null) {
						for (Resource controlledResource : org.openhealthtools.mdht.uml.common.util.UMLUtil.getControlledResources(cdaPackages.get(cdaPackage).eResource())) {

							writer.println(String.format("<replace file=\"@{filePath}\" token=\".model/model/.controlled/%s.uml\" value=\"/model/%s_Ecore.uml\"/>",
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

		} catch (IOException e) {

			e.printStackTrace();
		}

	}


	void createDitaProperties(IProject project,String modelName) {

		try {

			StringWriter swriter = new StringWriter();

			PrintWriter writer = new PrintWriter(swriter);

			writer.println("projectName = " + modelName);
			writer.println("modelName = " + modelName);
			writer.flush();

			swriter.close();

			InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));

			createFile(project, "dita.properties", is);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	

	void createPluginProperties(IProject project,String modelName) {

		try {

			StringWriter swriter = new StringWriter();

			PrintWriter writer = new PrintWriter(swriter);

			writer.println("pluginName = " + modelName + " Model");
			writer.println("providerName = Provider Name Here");

			writer.flush();

			swriter.close();

			InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));

			createFile(project, "plugin.properties", is);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}


	void createManifest(IProject project,String modelName) {

		try {

			IFile manfiestFile = cdaDocumentsManfiest.get(newCDATemplatePage.getCDADocument());

			InputStream input = new FileInputStream(manfiestFile.getRawLocation().toOSString());

			Manifest projectManifest = new Manifest(input);

			Attributes attributes = projectManifest.getMainAttributes();

			IFile manifest = CDAUIUtil.getManifest(project);

			StringWriter swriter = new StringWriter();

			PrintWriter writer = new PrintWriter(swriter);

			writer.println("Bundle-Name: %pluginName");

			writer.println( String.format("Bundle-SymbolicName: org.openhealthtools.mdht.uml.cda.%s;singleton:=true",modelName ));

			writer.println("Bundle-Version: 0.7.0.qualifier");

			writer.println("Bundle-ClassPath: .");
			writer.println("Bundle-Vendor: %providerName");
			writer.println("Bundle-Localization: plugin");
			writer.println("Bundle-RequiredExecutionEnvironment: J2SE-1.5");

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
			
			
			writer.println(String.format("Export-Package: org.openhealthtools.mdht.uml.cda.%s,", modelName ));
			writer.println(String.format(" org.openhealthtools.mdht.uml.cda.%s.impl,",modelName));
			writer.println(String.format(" org.openhealthtools.mdht.uml.cda.%s.operations,",modelName));
			writer.println(String.format(" org.openhealthtools.mdht.uml.cda.%s.util",modelName));
			}

			writer.flush();

			swriter.close();

			InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));

			manifest.appendContents(is, true, false, null);

		} catch (CoreException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}



}
