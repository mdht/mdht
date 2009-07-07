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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ccd.C;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

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
		
		CDAUtil.save(doc, System.out);
		
		CDAUtil.validate(doc, new BasicValidationHandler() {
			@Override
			public void handleError(Diagnostic diagnostic) {
				System.out.println("ERROR: " + diagnostic.getMessage());
			}
		});
	}
}
