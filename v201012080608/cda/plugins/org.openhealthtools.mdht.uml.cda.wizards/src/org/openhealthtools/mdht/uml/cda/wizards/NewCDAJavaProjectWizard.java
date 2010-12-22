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
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

@SuppressWarnings("restriction")
public class NewCDAJavaProjectWizard extends CDAWizard {

	public IWizardPage getNextPage(IWizardPage page) {
		return super.getNextPage(page);
	}

	WizardNewProjectCreationPage newProjectPage;

	NewCDAJavaPage newCDATemplatePage;

	public void addPages() {

		loadCDAModels();

		newCDATemplatePage = new NewCDAJavaPage("MDHT CDA Model", "Open Health Tools ", null, cdaDocuments);

		newCDATemplatePage.setDescription("Creates the CDA Hello CDA Java Project");

		newCDATemplatePage.setMessage("Use to create CDA Hello CDA Java Project");

		newProjectPage = new WizardNewProjectCreationPage("MDHT CDA Model");

		newProjectPage.setTitle("Open Health Tools ");

		newProjectPage.setDescription("Use to create CDA Hello CDA Java Project");

		addPage(newCDATemplatePage);

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

			createJavaHelloWorld(project);

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

	void createJavaHelloWorld(IProject project) {

		String[] s = newCDATemplatePage.getCDADocument().split("::");

		String packageName = "org.openhealthtools.mdht.cda" + (s[0].equals("cda") ? "." : "." + s[0] + ".") + "examples.hellocdaworld";

		String packageFolder = "src/org/openhealthtools/mdht/cda" + (s[0].equals("cda") ? "/" : "/" + s[0] + "/") + "examples/hellocdaworld";

		String[] s1 = packageFolder.split("/");
		String currentFolder = "";
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

		writer.println("import org.eclipse.emf.common.util.Diagnostic;");

		writer.println("import org.openhealthtools.mdht.uml.cda.util.*;");

		for (String cdaPackage : references.keySet()) {
			writer.println("import " + cdaPackage + ".*;");
		}
		
		
		writer.println("");
		writer.println("public class HelloCDAWorld {");
		writer.println("	public static void main(String[] args) throws Exception {");
		writer.println("");

		if (s[0].equals("cda")) {
			writer.println("		ClinicalDocument clinicalDocument = " + s[0].toUpperCase() + "Factory.eINSTANCE.create" + s[1] + "();");
		} else {
			writer.println("		" + s[1] + " clinicalDocument = " + s[0].toUpperCase() + "Factory.eINSTANCE.create" + s[1] + "().init();");
		}

		writer.println("");
		writer.println("		System.out.println(\"***** Constructed example *****\");");
		writer.println("		CDAUtil.save(clinicalDocument, System.out);");
		writer.println("		System.out.println();");
		writer.println("");
		writer.println("		System.out.println(\"***** Sample validation results *****\");");
		writer.println("		boolean valid = CDAUtil.validate(clinicalDocument, new BasicValidationHandler() {");
		writer.println("			@Override");
		writer.println("			public void handleError(Diagnostic diagnostic) {");
		writer.println("				System.out.println(\"ERROR: \" + diagnostic.getMessage());");
		writer.println("			}");
		writer.println("			@Override");
		writer.println("			public void handleWarning(Diagnostic diagnostic) {");
		writer.println("				System.out.println(\"WARNING: \" + diagnostic.getMessage());");
		writer.println("			}");
		writer.println("		});");
		writer.println("		");
		writer.println("		if (valid) {");
		writer.println("			System.out.println(\"Document is valid\");");
		writer.println("		} else {");
		writer.println("			System.out.println(\"Document is invalid\");");
		writer.println("		}");
		writer.println("	}");
		writer.println("}");

		writer.flush();

		try {
			swriter.close();

			InputStream is = new ByteArrayInputStream(swriter.toString().getBytes("UTF-8"));

			createFile(project, packageFolder + "/HelloCDAWorld.java", is);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	void createManifest(IProject project) {

		try {

			String[] s = newCDATemplatePage.getCDADocument().split("::");

			String symbolicName = "org.openhealthtools.mdht.cda." + (s[0].equals("cda") ? "" : s[0]) + ".examples.cda."+name;

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
