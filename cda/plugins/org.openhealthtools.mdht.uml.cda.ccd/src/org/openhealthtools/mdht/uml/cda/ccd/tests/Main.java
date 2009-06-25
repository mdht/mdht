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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ccd.C;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
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
		
		ContinuityOfCareDocument doc = CCDFactory.eINSTANCE.createContinuityOfCareDocument().init();
		doc.addSection(sect);

		Resource.Factory factory = CDAResource.Factory.INSTANCE;
		CDAResource resource = (CDAResource) factory.createResource(URI.createURI(CDAPackage.eNS_URI));
		resource.getContents().add(doc);
		
		Document document = CDAUtil.newDocument();
		resource.save(document, null, null);
		CDAUtil.adjustNamespace(document);
		CDAUtil.setSchemaLocation(document);
		CDAUtil.writeDocument(document, System.out);
		
		resource = (CDAResource) factory.createResource(URI.createURI(CDAPackage.eNS_URI));
		resource.load(document, null);
		CDAUtil.writeDocument(document, System.out);
		
		System.out.println(resource.getContents().get(0));
	}
}
