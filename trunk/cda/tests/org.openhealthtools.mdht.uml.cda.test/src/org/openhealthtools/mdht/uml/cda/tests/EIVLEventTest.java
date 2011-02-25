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
package org.openhealthtools.mdht.uml.cda.tests;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CR;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event;

public class EIVLEventTest 
{
	public static void main(String[] args) throws Exception 
	{
		SystemOutValidationHandler oValHandler = new SystemOutValidationHandler();
		EIVL_event oEivlEvent = DatatypesFactory.eINSTANCE.createEIVL_event();
		oEivlEvent.setCode("AC");
		//oEivlEvent.setCodeSystem("2.16.840.1.113883.5.139");  	// Valid
		oEivlEvent.setCodeSystem("2.16.840.1.113883.4.139");	// Invalid
		//oEivlEvent.setCodeSystemName("TimingEvent");			// Valid
		oEivlEvent.setCodeSystemName("TimingEvent1");			// Invalid
		oEivlEvent.setDisplayName("AC");
		
		ED originalText = DatatypesFactory.eINSTANCE.createED();		// Invalid
		oEivlEvent.setOriginalText(originalText);
		CR qualifier = DatatypesFactory.eINSTANCE.createCR();			// Invalid
		oEivlEvent.getQualifiers().add(qualifier);
		CD translation = DatatypesFactory.eINSTANCE.createCD();			// Invalid
		oEivlEvent.getTranslations().add(translation);	
		
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(oEivlEvent);
		if (diagnostic.getSeverity() != Diagnostic.OK)
		{
			DiagnosticOutputHelper.processDiagnostic(diagnostic, oValHandler);
		}
		else
		{
			System.out.println("Everything is OK, no validation errors.");
		}
		
		System.out.println("Note this test is successful if there are 5 specific validation errors displayed plus the one generic error.");
		
		
		System.out.println();
	}
}
