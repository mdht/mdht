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
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;

/**
 * This tests the IVL_PQ class against the validations to make sure that they
 * are functioning correctly.
 * 
 * @author Les Westberg
 *
 */
public class IVLPQTest {
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
	 * This method tests option one of the HL7 choice - specifically
	 * where "Low" exists and neither width or high are filled in.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testOption1LowOnly() {
		IVL_PQ oIvlPq = DatatypesFactory.eINSTANCE.createIVL_PQ();
		IVXB_PQ oLow = DatatypesFactory.eINSTANCE.createIVXB_PQ();
		oIvlPq.setLow(oLow);
		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oIvlPq);
		return processDiagnostics(oDiagnostic);
	}

	/**
	 * This method tests option one of the HL7 choice - specifically
	 * where "Low" exists and width exists.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testOption1LowWithWidth() {
		IVL_PQ oIvlPq = DatatypesFactory.eINSTANCE.createIVL_PQ();
		IVXB_PQ oLow = DatatypesFactory.eINSTANCE.createIVXB_PQ();
		oIvlPq.setLow(oLow);
		PQ oWidth = DatatypesFactory.eINSTANCE.createPQ();
		oIvlPq.setWidth(oWidth);

		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oIvlPq);
		return processDiagnostics(oDiagnostic);
	}

	/**
	 * This method tests option one of the HL7 choice - specifically
	 * where "Low" exists and high exists.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testOption1LowWithHigh() {
		IVL_PQ oIvlPq = DatatypesFactory.eINSTANCE.createIVL_PQ();
		IVXB_PQ oLow = DatatypesFactory.eINSTANCE.createIVXB_PQ();
		oIvlPq.setLow(oLow);
		IVXB_PQ oHigh = DatatypesFactory.eINSTANCE.createIVXB_PQ();
		oIvlPq.setHigh(oHigh);

		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oIvlPq);
		return processDiagnostics(oDiagnostic);
	}

	/**
	 * This method tests option one of the HL7 choice - specifically
	 * where "Low" exists and both width and high exists.  This should 
	 * fail.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testOption1LowWithWidthAndHigh_FailureCase() {
		boolean bResult = true; // assume everything is OK...

		IVL_PQ oIvlPq = DatatypesFactory.eINSTANCE.createIVL_PQ();
		IVXB_PQ oLow = DatatypesFactory.eINSTANCE.createIVXB_PQ();
		oIvlPq.setLow(oLow);

		PQ oWidth = DatatypesFactory.eINSTANCE.createPQ();
		oIvlPq.setWidth(oWidth);

		IVXB_PQ oHigh = DatatypesFactory.eINSTANCE.createIVXB_PQ();
		oIvlPq.setHigh(oHigh);

		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oIvlPq);
		if (!diagnosticsHaveErrors(oDiagnostic)) {
			System.out.println("There should have been a validation error but was not one.");
			bResult = false;
		}

		return bResult;
	}

	/**
	 * This method tests option two of the HL7 choice - specifically
	 * where "High" exists and nothing else.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testOption2HighOnly() {
		IVL_PQ oIvlPq = DatatypesFactory.eINSTANCE.createIVL_PQ();
		IVXB_PQ oHigh = DatatypesFactory.eINSTANCE.createIVXB_PQ();
		oIvlPq.setHigh(oHigh);

		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oIvlPq);
		return processDiagnostics(oDiagnostic);
	}

	/**
	 * This method tests option two of the HL7 choice - specifically
	 * where "High" exists and nothing else.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testOption2HighWithCenter_FailureCase() {
		boolean bResult = true; // assume everything is OK...

		IVL_PQ oIvlPq = DatatypesFactory.eINSTANCE.createIVL_PQ();
		IVXB_PQ oHigh = DatatypesFactory.eINSTANCE.createIVXB_PQ();
		oIvlPq.setHigh(oHigh);

		PQ oCenter = DatatypesFactory.eINSTANCE.createPQ();
		oIvlPq.setCenter(oCenter);

		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oIvlPq);
		if (!diagnosticsHaveErrors(oDiagnostic)) {
			System.out.println("There should have been a validation error but was not one.");
			bResult = false;
		}

		return bResult;
	}

	/**
	 * This method tests option three of the HL7 choice - specifically
	 * where "Width" exists and nothing else.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testOption3WidthOnly() {
		IVL_PQ oIvlPq = DatatypesFactory.eINSTANCE.createIVL_PQ();
		PQ oWidth = DatatypesFactory.eINSTANCE.createPQ();
		oIvlPq.setWidth(oWidth);

		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oIvlPq);
		return processDiagnostics(oDiagnostic);
	}

	/**
	 * This method tests option three of the HL7 choice - specifically
	 * where "Width" exists and high exists.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testOption3WidthAndHigh() {
		IVL_PQ oIvlPq = DatatypesFactory.eINSTANCE.createIVL_PQ();
		PQ oWidth = DatatypesFactory.eINSTANCE.createPQ();
		oIvlPq.setWidth(oWidth);

		IVXB_PQ oHigh = DatatypesFactory.eINSTANCE.createIVXB_PQ();
		oIvlPq.setHigh(oHigh);

		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oIvlPq);
		return processDiagnostics(oDiagnostic);
	}

	/**
	 * This method tests option four of the HL7 choice - specifically
	 * where "Center" exists and nothing else.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testOption4CenterOnly() {
		IVL_PQ oIvlPq = DatatypesFactory.eINSTANCE.createIVL_PQ();
		PQ oCenter = DatatypesFactory.eINSTANCE.createPQ();
		oIvlPq.setCenter(oCenter);

		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oIvlPq);
		return processDiagnostics(oDiagnostic);
	}

	/**
	 * This method tests option four of the HL7 choice - specifically
	 * where "Center" exists and width exists.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testOption4CenterAndWidth() {
		IVL_PQ oIvlPq = DatatypesFactory.eINSTANCE.createIVL_PQ();
		PQ oCenter = DatatypesFactory.eINSTANCE.createPQ();
		oIvlPq.setCenter(oCenter);

		PQ oWidth = DatatypesFactory.eINSTANCE.createPQ();
		oIvlPq.setWidth(oWidth);

		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oIvlPq);
		return processDiagnostics(oDiagnostic);
	}

	/**
	 * This method tests option four of the HL7 choice - specifically
	 * where "Center" exists and low exists - This should be a failure.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testOption4CenterAndLow_FailureCase() {
		boolean bResult = true; // assume everything is OK...

		IVL_PQ oIvlPq = DatatypesFactory.eINSTANCE.createIVL_PQ();
		PQ oCenter = DatatypesFactory.eINSTANCE.createPQ();
		oIvlPq.setCenter(oCenter);

		IVXB_PQ oLow = DatatypesFactory.eINSTANCE.createIVXB_PQ();
		oIvlPq.setLow(oLow);

		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oIvlPq);
		if (!diagnosticsHaveErrors(oDiagnostic)) {
			System.out.println("There should have been a validation error but was not one.");
			bResult = false;
		}

		return bResult;
	}

	public static void main(String[] args) throws Exception {
		boolean bFailure = false;

		if (!testOption1LowOnly()) {
			bFailure = true;
			System.out.println("testOption1LowOnly failed!");
		}
		if (!testOption1LowWithWidth()) {
			bFailure = true;
			System.out.println("testOption1LowWithWidth failed!");
		}
		if (!testOption1LowWithHigh()) {
			bFailure = true;
			System.out.println("testOption1LowWithHigh failed!");
		}
		if (!testOption1LowWithWidthAndHigh_FailureCase()) {
			bFailure = true;
			System.out.println("testOption1LowWithWidthAndHigh_FailureCase failed!");
		}
		if (!testOption2HighOnly()) {
			bFailure = true;
			System.out.println("testOption2HighOnly failed!");
		}
		if (!testOption2HighWithCenter_FailureCase()) {
			bFailure = true;
			System.out.println("testOption1LowWithWidthAndHigh_FailureCase failed!");
		}
		if (!testOption3WidthOnly()) {
			bFailure = true;
			System.out.println("testOption3WidthOnly failed!");
		}
		if (!testOption3WidthAndHigh()) {
			bFailure = true;
			System.out.println("testOption3WidthAndHigh failed!");
		}
		if (!testOption4CenterOnly()) {
			bFailure = true;
			System.out.println("testOption4CenterOnly failed!");
		}
		if (!testOption4CenterAndWidth()) {
			bFailure = true;
			System.out.println("testOption4CenterAndWidth failed!");
		}
		if (!testOption4CenterAndLow_FailureCase()) {
			bFailure = true;
			System.out.println("testOption4CenterAndLow_FailureCase failed!");
		}

		if (bFailure) {
			System.out.println("One or more tests Failed!!!");
		} else {
			System.out.println("All tests completed successfully...");
		}
	}
}
