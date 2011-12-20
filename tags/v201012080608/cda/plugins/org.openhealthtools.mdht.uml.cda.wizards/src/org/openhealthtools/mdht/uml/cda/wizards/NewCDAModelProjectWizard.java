package org.openhealthtools.mdht.uml.cda.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.ManifestElement;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginReference;
import org.eclipse.pde.internal.core.ICoreConstants;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.ui.wizards.IProjectProvider;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationOperation;
import org.eclipse.pde.internal.ui.wizards.plugin.PluginFieldData;
import org.eclipse.pde.ui.IFieldData;
import org.eclipse.pde.ui.IPluginContentWizard;
import org.eclipse.pde.ui.templates.PluginReference;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate;
import org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;
import org.osgi.framework.Constants;

@SuppressWarnings("restriction")
public class NewCDAModelProjectWizard extends CDAWizard {

	

	
	public IWizardPage getNextPage(IWizardPage page) {
		return super.getNextPage(page);
	}


	WizardNewProjectCreationPage newProjectPage;
	
	
	NewCDAModelPage newCDATemplatePage;
	
	   public void addPages() {

		   loadCDAModels();
		   
		   newCDATemplatePage = new NewCDAModelPage("MDHT CDA Model","Open Health Tools ",null, cdaDocuments);
		   
		   newCDATemplatePage.setDescription("Creates the CDA Model");
		   
		   newCDATemplatePage.setMessage("Use to create CDA Implementation Guide Model Project");

		   newProjectPage = new WizardNewProjectCreationPage("MDHT CDA Model");
		   
		   newProjectPage.setTitle("Open Health Tools ");
		   
		   newProjectPage.setDescription("Use to create CDA Implementation Guide Model Project");

		

		   addPage(newCDATemplatePage );
		   addPage(newProjectPage);   

	   }
	   

	   
	
	public boolean performFinish() {
		
		
		name = newProjectPage.getProjectName();
				
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		
		IWorkspaceRoot root = workspace.getRoot();
		
		project = root.getProject(name);
		
		try {
			
			project.create(null);
			
			project.open(null);
			
		
			
		} catch (CoreException e) {
			e.printStackTrace();
		}
		


		try {
			
			// Use pde internal functionality to create plugin 
			getContainer().run(false, true, new NewProjectCreationOperation(fPluginData, fProjectProvider, contentWizard));

			createPluginXML(project);

			createManifest(project);

			createFolder(project, "model");

			createUMLModel(project);

			createTransformation(project);

			createPluginProperties(project);
			
			createReadME( project);

		} catch (InvocationTargetException e) {
			
			e.printStackTrace();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		try {
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
			
		
		} catch (CoreException e) {
			e.printStackTrace();
		}


		return true;
	}

	
	void createUMLModel(IProject project) {

		ResourceSet resourceSet = new ResourceSetImpl();
		try {

			URI niemCoreModelURI = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/model/example.uml", false);

			PackageableElement niemCoreModel = (PackageableElement) EcoreUtil.getObjectByType(resourceSet.getResource(niemCoreModelURI, true).getContents(),
					UMLPackage.eINSTANCE.getPackageableElement());

			PackageableElement cloneModel = EcoreUtil.copy(niemCoreModel);

			IPath filePath = new Path("model/" + newCDATemplatePage.getModelName().toLowerCase() + ".uml");

			IFile file = getBundleRelativeFile(project, filePath);

			IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

			String hl7Path = myWorkspaceRoot.getLocation().toOSString() + file.getFullPath().toOSString();

			URI niemModelURI = URI.createFileURI(hl7Path);

			Resource umlResource = UML22UMLResource.Factory.INSTANCE.createResource(niemModelURI);

			umlResource.getContents().add(cloneModel);

			Map<String, String> options = new HashMap<String, String>();

			// Save initial clone model - This is required to allow uml2 stereotypes to actually be applied
			umlResource.save(options);
			
			if (cloneModel instanceof Package) {
				
				Package clonePackage = (Package) cloneModel;
				
				CodegenSupport codegenSupport= (CodegenSupport)clonePackage.applyStereotype(clonePackage.getApplicableStereotype("CDA::CodegenSupport"));
				
				
				codegenSupport.setBase_Namespace(clonePackage);
				
				codegenSupport.setBasePackage("org.openhealthtools.mdht.uml.cda");

				codegenSupport.setNsURI("http://www.openhealthtools.org/mdht/uml/cda/"+newCDATemplatePage.getModelName().toLowerCase());
			
				codegenSupport.setNsPrefix(newCDATemplatePage.getModelName().toLowerCase());
				
				codegenSupport.setPackageName(newCDATemplatePage.getModelName().toLowerCase());

				codegenSupport.setPrefix(newCDATemplatePage.getModelName());
	
				clonePackage.setName(newCDATemplatePage.getModelName().toLowerCase());

				Class cdaClass = clonePackage.createOwnedClass(newCDATemplatePage.getCDADocumentName(), false);
				
				CDATemplate template = (CDATemplate)cdaClass.applyStereotype(cdaClass.getApplicableStereotype("CDA::CDATemplate"));

				template.setBase_Class(cdaClass);
					
				template.setTemplateId(newCDATemplatePage.getTemplateId());
				
				template.setAssigningAuthorityName(newCDATemplatePage.getTemplateAssigningAuthority());
				
				Type t = cdaDocuments.get(newCDATemplatePage.getCDADocument());

				if (t instanceof Class) {
					Class documentClass = (Class) t;

					cdaClass.createGeneralization((Classifier) documentClass);

					clonePackage.createPackageImport(documentClass.getNearestPackage());

				}

			}

			umlResource.save(options);

		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	
	

	
	void createTransformation(IProject project) {

		try {

			StringWriter swriter = new StringWriter();
			
			PrintWriter writer = new PrintWriter(swriter);

			writer.println("<?eclipse version=\"3.0\"?>");		
			writer.println("<project name=\"CDA Model Transformation\"  basedir=\".\" default=\"all\">");
			writer.println("<property name=\"cdaPluginPath\" location=\"${basedir}/../org.openhealthtools.mdht.uml.cda\"/>");			
			writer.println("<property name=\"modelName\" value=\""+ newCDATemplatePage.getModelName().toLowerCase() +"\"/>");
			writer.println("<macrodef name=\"convertEcorePaths\">");			
			writer.println("<attribute name=\"filePath\"/>");
			writer.println("<sequential>");
			
			
			
			for (String cdaPackage : cdaPackages.keySet())
			{
				writer.println("<replace file=\"@{filePath}\" token=\"/"+cdaPackage+".uml\" value=\"/"+cdaPackage+"_Ecore.uml\"/>");
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
	
	
	void createPluginProperties(IProject project) {

		try {

			StringWriter swriter = new StringWriter();
			
			PrintWriter writer = new PrintWriter(swriter);

			writer.println("pluginName = "+ newCDATemplatePage.getModelName()+" Model");
			writer.println("providerName = Provider Name Here");

			writer.flush();

			swriter.close();

			InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));

			createFile(project, "plugin.properties", is);

		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	
	void createPluginXML(IProject project) {

		try {
			
			IFile pluginXml = getPluginXml(project);

			StringWriter swriter = new StringWriter();

			PrintWriter writer = new PrintWriter(swriter);

			writer.println("<?eclipse version=\"3.0\"?>");
			writer.println("");
			writer.println("");
			writer.println("");
			writer.println("");
			writer.println("<plugin>");
			writer.println("        <extension point=\"org.eclipse.emf.ecore.generated_package\">");
			writer.println("                  <package class=\"org.openhealthtools.mdht.uml.cda."+newCDATemplatePage.getModelName().toLowerCase() +"."+newCDATemplatePage.getModelName()+"Package\" genModel=\"model/"+newCDATemplatePage.getModelName().toLowerCase() +".genmodel\" uri=\"http://www.openhealthtools.org/mdht/uml/cda/"+newCDATemplatePage.getModelName().toLowerCase() +"\"/>");
			writer.println("        </extension>");
			writer.println("</plugin>");

			writer.flush();

			swriter.close();

			InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));

			pluginXml.create(is, true, null);
			
		} catch (CoreException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	
	void createReadME(IProject project)
	{
		
		StringWriter swriter = new StringWriter();

		PrintWriter writer = new PrintWriter(swriter);

		writer.println("In order to properly generate the corresponding Java Library,"); 
		writer.println("the following steps are need to be taken"); 
		writer.println("");
		writer.println("Generate for the First Time");
		writer.println("1) Run transform.xml to create ecore uml model"); 
		writer.println("	a) Right Click on transform.xml"); 
		writer.println("	b) Select Run As.."); 
		writer.println("	c) Use Option 2, Ant Build.."); 
		writer.println("	d) Select JRE Tab"); 
		writer.println("	e) Select 'Run in the same JRE as the Workspace' radio button"); 
		writer.println("	f) Hit Run Button"); 
		writer.println("");	
		writer.println("2) Create EMF GenModel");	
		writer.println("    a) Right Click on "+newCDATemplatePage.getModelName().toLowerCase() +"_ECore.uml");	
		writer.println("	b) Select New/Other..");	
		writer.println("	c) Browse to Eclipse Modeling Framework");	
		writer.println("	d) Select EMF Generator Model Wizard");	
		writer.println("	e) Hit Next on EMF Generator Page");	
		writer.println("	f) Hit Next on Select a Model Importer");	
		writer.println("	g) On UML Process Page");	
		writer.println("		g.1) Press 'Process All' option");	
		writer.println("		g.2) Set 'Derived Features' to Ignore");	
		writer.println("		g.3) Set 'Camel Case Names' to Ignore");	
		writer.println("		g.4) Press Load Button");	
		writer.println("		g.5) Hit Next");	
		writer.println("	h) On UML Package Selection Page");
		writer.println("		h.1) First Select all models Referenced Models List (Bottom of Dialog)");	 
		writer.println("		h.2) Select Model in Packages (Top of Dialog)");
		writer.println("		h.2) Hit Finish");
		writer.println("		h.4) EMF Genmodel should open");	
		writer.println("");	
		writer.println("3) Configure EMF GenModel");	
		writer.println("	a) Set Invariant Prefix property to 'validate' on "+newCDATemplatePage.getModelName().toLowerCase() +"_ECore");	
		writer.println("	b) Set Operations Package property to org.openhealthtools.mdht.uml.cda."+newCDATemplatePage.getModelName().toLowerCase() +".operations");
		writer.println("");
		writer.println("4) Generate Source Code");
		writer.println("	a) Right Click on "+newCDATemplatePage.getModelName().toLowerCase() +"_ECore");			
		writer.println("	a) Select 'Generate Model Code'");
		writer.println("");
		writer.println("ReGenerate After Changes to the Model");
		writer.println("1) Run transform.xml to create ecore uml model"); 
		writer.println("	a) Right Click on transform.xml"); 
		writer.println("	b) Select Run As.."); 
		writer.println("	c) Use Option 2, Ant Build.."); 
		writer.println("	d) Select JRE Tab"); 
		writer.println("	e) Select 'Run in the same JRE as the Workspace' radio button"); 
		writer.println("	f) Hit Run Button"); 
		writer.println("2) Reload EMF GenModel");	
		writer.println("    a) Right Click on "+newCDATemplatePage.getModelName().toLowerCase() +"_ECore.genmodel");
		writer.println("	b) Select Reload.."); 
		writer.println("	c) Hit Next  'Select a Model Importer Page'");	
		writer.println("	c) Hit Next 'Uml Import Page'");	
		writer.println("	c) Hit Finish on 'Package Selection Page'");
		
		InputStream is;
		try {
			is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));
			createFile(project, "codegeneration.readme", is);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	
				
			

			
			
			
	}
	
	
	void createManifest(IProject project) {

		try {
			
			IFile manifest = getManifest(project);

			StringWriter swriter = new StringWriter();

			PrintWriter writer = new PrintWriter(swriter);

			writer.println("Bundle-Name: %pluginName");
			writer.println("Bundle-SymbolicName: org.openhealthtools.mdht.uml.cda."+newCDATemplatePage.getModelName().toLowerCase() +";singleton:=true");		
			writer.println("Bundle-Version: 0.7.0.qualifier");

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