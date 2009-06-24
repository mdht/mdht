/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.openhealthtools.mdht.uml.cda.ccd.C;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.resource.CDAResource;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.w3c.dom.Document;

public class Main {
	public static void main(String[] args) throws Exception {
		ProblemObservation problemObservation = CCDFactory.eINSTANCE.createProblemObservation().init();		
		ProblemAct problemAct = CCDFactory.eINSTANCE.createProblemAct().init();
		C c = CCDFactory.eINSTANCE.createC().init();
		
		Section sect = CDAFactory.eINSTANCE.createSection();
		sect.addObservation(problemObservation);
		sect.addAct(problemAct);
		sect.addAct(c);
		
		ClinicalDocument doc = CDAFactory.eINSTANCE.createClinicalDocument();
		doc.addSection(sect);
		
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(doc);
		System.out.println(diagnostic);
		if (diagnostic.getSeverity() == Diagnostic.OK) {
			System.out.println("Document is valid CCD!");
		} else {
			System.out.println("Document is invalid CCD!");
		}

		Resource.Factory factory = CDAResource.Factory.INSTANCE;
		XMLResource resource = (XMLResource) factory.createResource(URI.createURI(CDAPackage.eNS_URI));
		resource.getContents().add(doc);

		Document document = resource.save(null, null, null);
		CDAUtil.printDocument(document, System.out);

		resource = (XMLResource) factory.createResource(URI.createURI(CDAPackage.eNS_URI));
		resource.load(document, null);
		CDAUtil.printDocument(document, System.out);
		
		ClinicalDocument clinicalDocument = (ClinicalDocument) resource.getContents().get(0);
		System.out.println(clinicalDocument.getComponent().getStructuredBody().getComponent().get(0).getSection().getEntry().get(0).getObservation());
	}
}
