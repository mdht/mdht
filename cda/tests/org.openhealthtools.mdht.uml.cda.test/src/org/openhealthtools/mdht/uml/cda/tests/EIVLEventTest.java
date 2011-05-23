/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.tests;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CR;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event;

public class EIVLEventTest {
	/**
	 * This method returns true if there are no errors.
	 * 
	 * @param oDiagnostic The diagnostic information.
	 * @return TRUE if there are errors.  FALSE if there are none.
	 */
	private static boolean diagnosticsHaveErrors(Diagnostic oDiagnostic) {
		return (oDiagnostic.getSeverity() != Diagnostic.OK);
	}

	/**
	 * This method processes and outputs the diagnostic information if there 
	 * were any errors.  It returns true if no errors exist.
	 * 
	 * @param oDiagnostic The diagnostic information.
	 * @return TRUE if there are no errors.
	 */
	private static boolean processDiagnostics(Diagnostic oDiagnostic) {
		boolean bResult = true; // Assume no errors

		if (diagnosticsHaveErrors(oDiagnostic)) {
			SystemOutValidationHandler oValHandler = new SystemOutValidationHandler();
			DiagnosticOutputHelper.processDiagnostic(oDiagnostic, oValHandler);
			bResult = false;
		}

		return bResult;
	}

	/**
	 * This method tests code with a valid value.  One that is part of the 
	 * TimingEvent enumerated type.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testCodeValidValue() {
		EIVL_event oEivlEvent = DatatypesFactory.eINSTANCE.createEIVL_event();
		oEivlEvent.setCode("AC");
		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oEivlEvent);
		return processDiagnostics(oDiagnostic);
	}

	/**
	 * This method tests setting code with a value that is invalid.  An invalid code
	 * is one that is not part of the TimingEvent enumerated type.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testCodeInvalidValue_FailureCase() {
		boolean bResult = true; // assume everything is OK...

		EIVL_event oEivlEvent = DatatypesFactory.eINSTANCE.createEIVL_event();
		oEivlEvent.setCode("ZZZ");

		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oEivlEvent);
		if (!diagnosticsHaveErrors(oDiagnostic)) {
			System.out.println("There should have been a validation error but was not one.");
			bResult = false;
		}
		// processDiagnostics(oDiagnostic); - Uncomment to see the error printed out...

		return bResult;
	}

	/**
	 * This method tests code system with a valid value.  The valid value is:
	 * 2.16.840.1.113883.5.139
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testCodeSystemValidValue() {
		EIVL_event oEivlEvent = DatatypesFactory.eINSTANCE.createEIVL_event();
		oEivlEvent.setCodeSystem("2.16.840.1.113883.5.139");
		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oEivlEvent);
		return processDiagnostics(oDiagnostic);
	}

	/**
	 * This method tests code system with an invalid value.  The valid value is:
	 * 2.16.840.1.113883.5.139  - Everything else is invalid.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testCodeSystemInvalidValue_FailureCase() {
		boolean bResult = true; // assume everything is OK...

		EIVL_event oEivlEvent = DatatypesFactory.eINSTANCE.createEIVL_event();
		oEivlEvent.setCodeSystem("2.16.840.1.113883.4.139");

		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oEivlEvent);
		if (!diagnosticsHaveErrors(oDiagnostic)) {
			System.out.println("There should have been a validation error but was not one.");
			bResult = false;
		}
		// processDiagnostics(oDiagnostic); - Uncomment to see the error printed out...

		return bResult;
	}

	/**
	 * This method tests code system name with a valid value.  The valid value is:
	 * TimingEvent
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testCodeSystemNameValidValue() {
		EIVL_event oEivlEvent = DatatypesFactory.eINSTANCE.createEIVL_event();
		oEivlEvent.setCodeSystemName("TimingEvent");
		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oEivlEvent);
		return processDiagnostics(oDiagnostic);
	}

	/**
	 * This method tests code system name with an invalid value.  The valid value is:
	 * TimingEvent  - Everything else is invalid.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testCodeSystemNameInvalidValue_FailureCase() {
		boolean bResult = true; // assume everything is OK...

		EIVL_event oEivlEvent = DatatypesFactory.eINSTANCE.createEIVL_event();
		oEivlEvent.setCodeSystemName("SomethingElse");

		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oEivlEvent);
		if (!diagnosticsHaveErrors(oDiagnostic)) {
			System.out.println("There should have been a validation error but was not one.");
			bResult = false;
		}
		// processDiagnostics(oDiagnostic); - Uncomment to see the error printed out...

		return bResult;
	}

	/**
	 * This method tests display name with a valid value.  A valid value is anything that
	 * has at least one character.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testDisplayNameValidValue() {
		EIVL_event oEivlEvent = DatatypesFactory.eINSTANCE.createEIVL_event();
		oEivlEvent.setDisplayName("AC");
		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oEivlEvent);
		return processDiagnostics(oDiagnostic);
	}

	/**
	 * This method tests display name with an invalid value.  The only really invalid
	 * value is an empty string.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testDisplayNameInvalidValue_FailureCase() {
		boolean bResult = true; // assume everything is OK...

		EIVL_event oEivlEvent = DatatypesFactory.eINSTANCE.createEIVL_event();
		oEivlEvent.setDisplayName("");

		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oEivlEvent);
		if (!diagnosticsHaveErrors(oDiagnostic)) {
			System.out.println("There should have been a validation error but was not one.");
			bResult = false;
		}
		// processDiagnostics(oDiagnostic); - Uncomment to see the error printed out...

		return bResult;
	}

	/**
	 * This method tests original text.  Based on this type as a restriction of CE/CD,
	 * this value should not be present.  So setting it should trigger an error.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testOriginalTextInvalidValue_FailureCase() {
		boolean bResult = true; // assume everything is OK...

		EIVL_event oEivlEvent = DatatypesFactory.eINSTANCE.createEIVL_event();
		ED originalText = DatatypesFactory.eINSTANCE.createED();
		oEivlEvent.setOriginalText(originalText);

		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oEivlEvent);
		if (!diagnosticsHaveErrors(oDiagnostic)) {
			System.out.println("There should have been a validation error but was not one.");
			bResult = false;
		}
		// processDiagnostics(oDiagnostic); - Uncomment to see the error printed out...

		return bResult;
	}

	/**
	 * This method tests qualifier text.  Based on this type as a restriction of CE/CD,
	 * this value should not be present.  So setting it should trigger an error.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testQualifierInvalidValue_FailureCase() {
		boolean bResult = true; // assume everything is OK...

		EIVL_event oEivlEvent = DatatypesFactory.eINSTANCE.createEIVL_event();
		CR qualifier = DatatypesFactory.eINSTANCE.createCR();
		oEivlEvent.getQualifiers().add(qualifier);

		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oEivlEvent);
		if (!diagnosticsHaveErrors(oDiagnostic)) {
			System.out.println("There should have been a validation error but was not one.");
			bResult = false;
		}
		// processDiagnostics(oDiagnostic); - Uncomment to see the error printed out...

		return bResult;
	}

	/**
	 * This method tests translation text.  Based on this type as a restriction of CE/CD,
	 * this value should not be present.  So setting it should trigger an error.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testTranslationInvalidValue_FailureCase() {
		boolean bResult = true; // assume everything is OK...

		EIVL_event oEivlEvent = DatatypesFactory.eINSTANCE.createEIVL_event();
		CD translation = DatatypesFactory.eINSTANCE.createCD();
		oEivlEvent.getTranslations().add(translation);

		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oEivlEvent);
		if (!diagnosticsHaveErrors(oDiagnostic)) {
			System.out.println("There should have been a validation error but was not one.");
			bResult = false;
		}
		// processDiagnostics(oDiagnostic); - Uncomment to see the error printed out...

		return bResult;
	}

	public static void main(String[] args) throws Exception {
		boolean bFailure = false;

		if (!testCodeValidValue()) {
			bFailure = true;
			System.out.println("testCodeValidValue failed!");
		}
		if (!testCodeInvalidValue_FailureCase()) {
			bFailure = true;
			System.out.println("testCodeInvalidValue failed!");
		}
		if (!testCodeSystemValidValue()) {
			bFailure = true;
			System.out.println("testCodeSystemValidValue failed!");
		}
		if (!testCodeSystemInvalidValue_FailureCase()) {
			bFailure = true;
			System.out.println("testCodeSystemInvalidValue failed!");
		}
		if (!testCodeSystemNameValidValue()) {
			bFailure = true;
			System.out.println("testCodeSystemNameValidValue failed!");
		}
		if (!testCodeSystemNameInvalidValue_FailureCase()) {
			bFailure = true;
			System.out.println("testCodeSystemNameInvalidValue failed!");
		}
		if (!testDisplayNameValidValue()) {
			bFailure = true;
			System.out.println("testDisplayNameValidValue failed!");
		}
		if (!testDisplayNameInvalidValue_FailureCase()) {
			bFailure = true;
			System.out.println("testDisplayNameInvalidValue failed!");
		}
		if (!testOriginalTextInvalidValue_FailureCase()) {
			bFailure = true;
			System.out.println("testOriginalTextInvalidValue failed!");
		}
		if (!testQualifierInvalidValue_FailureCase()) {
			bFailure = true;
			System.out.println("testQualifierInvalidValue failed!");
		}
		if (!testTranslationInvalidValue_FailureCase()) {
			bFailure = true;
			System.out.println("testQualifierInvalidValue failed!");
		}

		if (bFailure) {
			System.out.println("One or more tests Failed!!!");
		} else {
			System.out.println("All tests completed successfully...");
		}
	}
}
