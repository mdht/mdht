package org.openhealthtools.mdht.uml.cda.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

@SuppressWarnings("restriction")
public class NewC32ProjectWizard extends CDAWizard {

	WizardNewProjectCreationPage newProjectPage;

	NewC32PageOne c32Page1;

	NewC32PageTwo c32Page2;

	public void addPages() {

		loadCDAModels();

		c32Page1 = new NewC32PageOne("MDHT CDA Model", "Open Health Tools ", null, cdaDocuments);

		c32Page1.setDescription("Creates the CDA Model");

		c32Page1.setMessage("Use to create Initial C32 Project");

		newProjectPage = new WizardNewProjectCreationPage("MDHT CDA Model");

		newProjectPage.setTitle("Open Health Tools ");

		newProjectPage.setDescription("Use to create Initial C32 Project");

		c32Page2 = new NewC32PageTwo("MDHT CDA Model", "Open Health Tools ", null, cdaDocuments);

		addPage(c32Page1);
		
		addPage(c32Page2);
		
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

			createManifest(project);

			createCDABuilder(project);
	
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

	void createCDABuilder(IProject project) {

		String[] s = "hitsp::PatientSummary".split("::");

		String packageName = "org.openhealthtools.mdht.cda" + (s[0].equals("cda") ? "." : "." + s[0] + ".") + "examples.builder";
		String packageFolder = "org/openhealthtools/mdht/cda" + (s[0].equals("cda") ? "/" : "/" + s[0] + "/") + "examples/builder";
		String packageSrcFolder = "src/" + packageFolder;

		String[] s1 = packageFolder.split("/");
		String currentFolder = "src/";
		for (String s3 : s1) {
			currentFolder += s3;
			System.out.println(currentFolder);
			createFolder(project, currentFolder);
			currentFolder += "/";
		}

		StringWriter swriter = new StringWriter();

		PrintWriter writer = new PrintWriter(swriter);

		writer.println("package " + packageName + ";");
		writer.println("");
		writer.println("");

		writer.println("import java.util.ArrayList;");
		writer.println("import java.util.List;");
		writer.println("import org.openhealthtools.mdht.builder.hitsp.C32DocumentBuilder;");
		writer.println("import org.openhealthtools.mdht.builder.hitsp.PatientSummaryBuilder;");
		writer.println("import org.openhealthtools.mdht.builder.hitsp.PatientSummaryBuilder.AllergiesReactionSectionDirector;");
		writer.println("import org.openhealthtools.mdht.uml.cda.Act;");
		writer.println("import org.openhealthtools.mdht.uml.cda.ClinicalDocument;");
		writer.println("import org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity;");
		writer.println("import org.openhealthtools.mdht.uml.cda.util.CDAUtil;");
		writer.println("import org.openhealthtools.mdht.uml.hl7.datatypes.CD;");
		writer.println("import org.openhealthtools.mdht.uml.hl7.datatypes.CE;");
		writer.println("import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;");

		writer.println("public class C32Example {");
		writer.println("");
		if (c32Page1.sections.get(NewC32PageOne.ALLERGIES).getSelection()) {

			writer.println("	public static class C32AllergiesReactionSectionDirector extends AllergiesReactionSectionDirector {");
			writer.println("");
			writer.println("		@Override");
			writer.println("		public List<Act> buildActs() {");
			writer.println("");
			writer.println("			List<Act> acts = new ArrayList<Act>();");
			writer.println("");
			writer.println("			CE drug = DatatypesFactory.eINSTANCE.createCE(\"70618\", PatientSummaryBuilder.RXNORM, \"\", \"Penicillin\");");
			writer.println("");
			writer.println("			CD reaction = DatatypesFactory.eINSTANCE.createCD(\"247472004\", PatientSummaryBuilder.SNOMEDCT, \"\", \"Hives\");");
			writer.println("");
			writer.println("			AllergyDrugSensitivity allergyDrugSensitivity = PatientSummaryBuilder.createActiveAllergyDrugSensitivity(drug, new CD[] {reaction});");
			writer.println("");
			writer.println("			acts.add(allergyDrugSensitivity);");
			writer.println("");
			writer.println("			return acts;");
			writer.println("		}");
			writer.println("	}");
		}

		writer.println("	public static void main(String[] args) {");
		writer.println("");
		writer.println("		C32DocumentBuilder exampleHITSPC32 = new C32DocumentBuilder() {");
		writer.println("");
		if (c32Page1.sections.get(NewC32PageOne.ALLERGIES).getSelection()) {

			writer.println("			@Override");
			writer.println("			public AllergiesReactionSectionDirector getAllergiesReactionSectionDirector() {");
			writer.println("				return new C32AllergiesReactionSectionDirector();");
			writer.println("			}");
		}
		writer.println("");
		writer.println("		};");
		writer.println("");
		writer.println("		try {");
		writer.println("");
		writer.println("			System.out.println(\"Start C32 Document Build Example\");");
		writer.println("");
		writer.println("			ClinicalDocument clinicalDocument = exampleHITSPC32.buildDocument();");
		writer.println("");
		writer.println("			CDAUtil.save(clinicalDocument, System.out);");
		writer.println("");
		writer.println("			System.out.println(\"Completed C32 Document Build Example\");");
		writer.println("");
		writer.println("		} catch (Exception e) {");
		writer.println("			e.printStackTrace();");
		writer.println("		}");
		writer.println("");
		writer.println("	}");
		writer.println("}");

		writer.flush();

		try {
			swriter.close();

			InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));

			createFile(project, packageSrcFolder + "/C32Example.java", is);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	void createReadME(IProject project) {

	}

	void createManifest(IProject project) {

		try {

			String[] s = "hitsp::PatientSummary".split("::");

			String symbolicName = "org.openhealthtools.mdht.cda." + (s[0].equals("cda") ? "" : s[0]) + ".examples.c32."+name;

			IFile manifest = getManifest(project);

			StringWriter swriter = new StringWriter();

			PrintWriter writer = new PrintWriter(swriter);

			writer.println("Bundle-Name: %pluginName");
			writer.println("Bundle-SymbolicName: " + symbolicName + ";singleton:=true");
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
