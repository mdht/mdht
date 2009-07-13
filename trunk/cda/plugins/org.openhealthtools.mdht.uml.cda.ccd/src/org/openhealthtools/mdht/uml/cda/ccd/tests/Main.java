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
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatus;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatus;
import org.openhealthtools.mdht.uml.cda.resource.CDAResource;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.w3c.dom.Document;

public class Main {
	public static void main(String[] args) throws Exception {	
		ProblemAct problemAct = CCDFactory.eINSTANCE.createProblemAct().init();
		ProblemObservation problemObservation = CCDFactory.eINSTANCE.createProblemObservation().init();	
		ProblemStatus problemStatus = CCDFactory.eINSTANCE.createProblemStatus().init();
		ProblemHealthStatus problemHealthStatus = CCDFactory.eINSTANCE.createProblemHealthStatus().init();
		EpisodeObservation episodeObservation = CCDFactory.eINSTANCE.createEpisodeObservation().init();
		
		Section sect = CDAFactory.eINSTANCE.createSection();
		sect.addAct(problemAct);
		sect.addObservation(problemObservation);
		sect.addObservation(problemStatus);
		sect.addObservation(problemHealthStatus);
		sect.addObservation(episodeObservation);
		
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
