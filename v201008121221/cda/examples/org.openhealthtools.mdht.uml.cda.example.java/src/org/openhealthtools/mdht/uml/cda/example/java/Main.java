package org.openhealthtools.mdht.uml.cda.example.java;

import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.Package;

public class Main {

	public static void main(String[] args) {
		CreateModel modelFactory = new CreateModel();
		
		String filePath = System.getProperty("user.home") + "/MyCDA.uml";
		
		URI fileURI = URI.createFileURI(filePath);
		Package model = modelFactory.createModel(fileURI);
		modelFactory.saveModel(model);

	}

}
