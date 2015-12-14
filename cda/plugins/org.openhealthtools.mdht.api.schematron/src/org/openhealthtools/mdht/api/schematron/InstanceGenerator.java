/*******************************************************************************
 * Copyright (c) 2010, 2012 David A Carlson an*d others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Sean Muir (JKM Software) - Add support for inline class generation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.api.schematron;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.uml2.uml.Class;
import org.openhealthtools.mdht.uml.cda.core.util.CDACommonUtils;
import org.openhealthtools.mdht.uml.cda.core.util.ClinicalDocumentCreator;
import org.openhealthtools.mdht.uml.cda.core.util.ModelStatus;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

public class InstanceGenerator {

	private boolean standalone;

	public InstanceGenerator() {
		CDAUtil.loadPackages();
	}

	public InstanceGenerator(boolean standalone) {
		this.standalone = standalone;
		CDAUtil.loadPackages();
	}

	private ClinicalDocumentCreator creator;

	@SuppressWarnings("unchecked")
	public EObject createInstance(Class umlClass, int levels) {
		ResourceSet resourceSet = umlClass.eResource().getResourceSet();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Class umlClinicalDocument = CDACommonUtils.getClinicalDocument(umlClass);
		creator = new ClinicalDocumentCreator(umlClinicalDocument, resourceSet, new ArrayList<ModelStatus>());
		creator.enableSampleData(true);
		creator.enableSampleDataExpansion(true);
		EObject newObject = creator.initializeSnippet(umlClass);
		return newObject;
	}

	public void save(EObject eObject, Writer writer) {
		String xml = creator.toXMLString(eObject, null);
		try {
			writer.write(xml);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
