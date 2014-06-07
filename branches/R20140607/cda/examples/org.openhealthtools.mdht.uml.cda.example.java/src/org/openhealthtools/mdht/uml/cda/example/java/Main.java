/*******************************************************************************
 * Copyright (c) 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
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
