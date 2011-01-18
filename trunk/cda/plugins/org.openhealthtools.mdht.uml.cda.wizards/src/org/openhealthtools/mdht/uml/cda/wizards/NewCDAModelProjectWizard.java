package org.openhealthtools.mdht.uml.cda.wizards;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenAnnotation;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenResourceKind;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.uml2.codegen.ecore.genmodel.GenFeature;
import org.eclipse.uml2.codegen.ecore.genmodel.GenPackage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate;
import org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport;
import org.openhealthtools.mdht.uml.cda.transform.EcoreTransformer;
import org.openhealthtools.mdht.uml.cda.transform.EcoreTransformerOptions;

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
			
			createGenModel(project); 

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

		
		try {

			ResourceSet resourceSet = new ResourceSetImpl();
			
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
	
	
	/**
	 * TODO Get proper static for annotation source -swm
	 */
	private static final String ANNOTATIONSOURCE="http://www.eclipse.org/emf/2002/GenModel/importer/org.eclipse.uml2.uml.ecore.importer";
	
	
	void createGenModel(IProject project) {
		
		loadGenModelsfromWorkspace();
		
		EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);

		ResourceSet resourceSet = new ResourceSetImpl();

		IPath filePath = new Path("model/" + newCDATemplatePage.getModelName().toLowerCase() + ".genmodel");

		IFile file = getBundleRelativeFile(project, filePath);

		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

		String genmodelPath = myWorkspaceRoot.getLocation().toOSString() + file.getFullPath().toOSString();

		URI genmodelURI = URI.createFileURI(genmodelPath);
		
		Resource genmodelResource =  resourceSet.createResource(genmodelURI);
		
		org.eclipse.uml2.codegen.ecore.genmodel.GenModel genmodel = org.eclipse.uml2.codegen.ecore.genmodel.GenModelFactory.eINSTANCE.createGenModel(); //GenModelFactory.eINSTANCE.createGenModel();
		
		genmodel.setModelName(newCDATemplatePage.getModelName().toLowerCase() +"_Ecore");
		
		genmodel.setModelDirectory(project.getName()+"/src");
		
		genmodel.setModelPluginID(newCDATemplatePage.getModelName());
		
		genmodel.setImporterID("org.eclipse.uml2.uml.ecore.importer");
		
		genmodel.setInvariantPrefix("validate");

		genmodel.setCopyrightFields(false);
		
		genmodel.setComplianceLevel(GenJDKLevel.JDK50_LITERAL);
		
		genmodel.getForeignModel().add(genmodel.getModelName()+".uml");
	
		
		GenAnnotation ga = org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory.eINSTANCE.createGenAnnotation();
		ga.setSource(ANNOTATIONSOURCE);
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__UNION_PROPERTIES, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURES, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__COMMENTS, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__ANNOTATION_DETAILS, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__DERIVED_FEATURES, "IGNORE");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__OPERATION_BODIES, "PROCESS");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__CAMEL_CASE_NAMES, "IGNORE");
		ga.getDetails().put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER, "PROCESS");		
		
		genmodel.getGenAnnotations().add(ga);
		
		for(GenModel up : genPackages)
		{			
			for (org.eclipse.emf.codegen.ecore.genmodel.GenPackage uup : up.getGenPackages())
			{
				genmodel.getUsedGenPackages().add(uup);	
			}
		
		}

		GenPackage gp = org.eclipse.uml2.codegen.ecore.genmodel.GenModelFactory.eINSTANCE.createGenPackage(); 
		
		gp.setPrefix(newCDATemplatePage.getModelName());
		
		gp.setResource(GenResourceKind.XMI_LITERAL);
		
		gp.setBasePackage("org.openhealthtools.mdht.uml.cda");
		
		gp.setDisposableProviderFactory(true);

		gp.setOperationsPackage("org.openhealthtools.mdht.uml.cda."+newCDATemplatePage.getModelName().toLowerCase()+".operations");

		genmodel.getGenPackages().add(gp);

		genmodelResource.getContents().add(genmodel);
		
		try {
			genmodelResource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	   private void transformToUML(IProgressMonitor monitor) {
		   
	    }

	
	void createManifest(IProject project) {

		try {
			
			IFile manfiestFile =	cdaDocumentsManfiest.get(newCDATemplatePage.getCDADocument());
		
			InputStream input = new FileInputStream(ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString()+manfiestFile.getFullPath().toOSString());
			
			Manifest projectManifest = new Manifest(input);
						
			Attributes attributes = projectManifest.getMainAttributes();

			IFile manifest = getManifest(project);

			StringWriter swriter = new StringWriter();

			PrintWriter writer = new PrintWriter(swriter);

			writer.println("Bundle-Name: %pluginName");

			writer.println("Bundle-SymbolicName: org.openhealthtools.mdht.uml.cda."+newCDATemplatePage.getModelName().toLowerCase() +";singleton:=true");		
			
			writer.println("Bundle-Version: 0.7.0.qualifier");
			
			writer.println("Bundle-ClassPath: .");
			writer.println("Bundle-Vendor: %providerName");
			writer.println("Bundle-Localization: plugin");
			writer.println("Bundle-RequiredExecutionEnvironment: J2SE-1.5");
			
//			writer.println("Export-Package: "+project.getName()+",");
//			writer.println(" "+project.getName()+".impl,");
//			writer.println(" "+project.getName()+".operations,");
//			writer.println(" "+project.getName()+".util");
			
			String requiredBundles = attributes.getValue("Require-Bundle");
			
			String sourceBundle = attributes.getValue("Bundle-SymbolicName");
			
			String rb[] = requiredBundles.split(",");
			
			String sb[] = sourceBundle.split(";");
			
			for (int index = 0; index < rb.length; index++) {

				if (index == 0) {
					writer.print("Require-Bundle: " + rb[index]);
				} else {

					if (index > 0) {
						writer.println(",");
						writer.print(" "+rb[index]);
					}
				}

			}
			if (sb.length>0){
				writer.println(",");
				writer.println(" "+sb[0]+";visibility:=reexport");
			}
			
			
//			
//			for (String value : requiredBundles.split(","))
//			{
//				
//			}
			
			

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
	
	ArrayList<GenModel > genPackages = new ArrayList<GenModel >();
	
	void loadGenModelsfromWorkspace() {
	
		ResourceSet resourceSet = new ResourceSetImpl();
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		IWorkspaceRoot root = workspace.getRoot();
		
		Path model = new Path("model");

		for (IProject project : root.getProjects())
		{
			if (project.exists(model))
			{
				IFolder folder = project.getFolder(model);
				try {
					for (IResource resource : folder.members())
					{
						
						if (resource.getName().endsWith(".genmodel") )
						{
							URI genmodelFile = URI.createFileURI(project.getFolder(model).getFile(resource.getName()).getRawLocation().toOSString());
							
							GenModel foo2 = (GenModel ) EcoreUtil.getObjectByType(resourceSet.getResource(genmodelFile, true).getContents(),GenModelPackage.eINSTANCE.getGenModel ());
//							
							if (foo2 != null)
							{
								genPackages.add(foo2);				
							}
						}	
					}
					
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		}
	}			
}
