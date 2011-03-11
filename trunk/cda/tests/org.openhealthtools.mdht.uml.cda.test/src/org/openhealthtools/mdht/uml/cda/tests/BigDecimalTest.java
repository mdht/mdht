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

import java.math.BigDecimal;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.MO;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQR;
import org.openhealthtools.mdht.uml.hl7.datatypes.REAL;

public class BigDecimalTest 
{
    /**
     * This method returns true if there are no errors.
     * 
     * @param oDiagnostic The diagnostic information.
     * @return TRUE if there are errors.  FALSE if there are none.
     */
    private static boolean diagnosticsHaveErrors(Diagnostic oDiagnostic)
    {
        return (oDiagnostic.getSeverity() != Diagnostic.OK);
    }
    
    /**
     * This method processes and outputs the diagnostic information if there 
     * were any errors.  It returns true if no errors exist.
     * 
     * @param oDiagnostic The diagnostic information.
     * @return TRUE if there are no errors.
     */
    private static boolean processDiagnostics(Diagnostic oDiagnostic)
	{
		boolean bResult = true;           // Assume no errors
		
		if (diagnosticsHaveErrors(oDiagnostic))
		{
			SystemOutValidationHandler oValHandler = new SystemOutValidationHandler();
			DiagnosticOutputHelper.processDiagnostic(oDiagnostic, oValHandler);
			bResult = false;
		}
		
		return bResult;
	}
    
	/**
	 * This method tests the MO::value to make sure it is now working correctly with
	 * BigDecimal with backward compatibility with Double. 
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testMOValue()
	{
		boolean bResult = true;			// Assume we are working correctly.
		
		MO oMO = DatatypesFactory.eINSTANCE.createMO();
		oMO.setValue(new BigDecimal("100.12345678"));
		if (! oMO.getValue().equals(new BigDecimal("100.12345678")))
		{
			System.out.println("Failed to set/retrieve MO::value using BigDecimal initializer.");
			bResult = false;
		}
		
		oMO = DatatypesFactory.eINSTANCE.createMO();
		oMO.setValue(new Double("123.23"));
		if (! oMO.getValue().equals(new BigDecimal("123.23")))
		{
			System.out.println("Failed to set/retrieve MO::value using Double initializer.");
			bResult = false;
		}

		return bResult;
	}
	
	/**
	 * This method tests the PQ::value to make sure it is now working correctly with
	 * BigDecimal with backward compatibility with Double. 
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testPQValue()
	{
		boolean bResult = true;			// Assume we are working correctly.
		
		PQ oPQ = DatatypesFactory.eINSTANCE.createPQ();
		oPQ.setValue(new BigDecimal("100.12345678"));
		if (! oPQ.getValue().equals(new BigDecimal("100.12345678")))
		{
			System.out.println("Failed to set/retrieve PQ::value using BigDecimal initializer.");
			bResult = false;
		}
		
		oPQ = DatatypesFactory.eINSTANCE.createPQ();
		oPQ.setValue(new Double("123.23"));
		if (! oPQ.getValue().equals(new BigDecimal("123.23")))
		{
			System.out.println("Failed to set/retrieve PQ::value using Double initializer.");
			bResult = false;
		}

		return bResult;
	}
	
	/**
	 * This method tests the PQR::value to make sure it is now working correctly with
	 * BigDecimal with backward compatibility with Double. 
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testPQRValue()
	{
		boolean bResult = true;			// Assume we are working correctly.
		
		PQR oPQR = DatatypesFactory.eINSTANCE.createPQR();
		oPQR.setValue(new BigDecimal("100.12345678"));
		if (! oPQR.getValue().equals(new BigDecimal("100.12345678")))
		{
			System.out.println("Failed to set/retrieve PQR::value using BigDecimal initializer.");
			bResult = false;
		}
		
		oPQR = DatatypesFactory.eINSTANCE.createPQR();
		oPQR.setValue(new Double("123.23"));
		if (! oPQR.getValue().equals(new BigDecimal("123.23")))
		{
			System.out.println("Failed to set/retrieve PQR::value using Double initializer.");
			bResult = false;
		}

		return bResult;
	}

	/**
	 * This method tests the REAL::value to make sure it is now working correctly with
	 * BigDecimal with backward compatibility with Double. 
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testREALValue()
	{
		boolean bResult = true;			// Assume we are working correctly.
		
		REAL oREAL = DatatypesFactory.eINSTANCE.createREAL();
		oREAL.setValue(new BigDecimal("100.12345678"));
		if (! oREAL.getValue().equals(new BigDecimal("100.12345678")))
		{
			System.out.println("Failed to set/retrieve REAL::value using BigDecimal initializer.");
			bResult = false;
		}
		
		oREAL = DatatypesFactory.eINSTANCE.createREAL();
		oREAL.setValue(new Double("123.23"));
		if (! oREAL.getValue().equals(new BigDecimal("123.23")))
		{
			System.out.println("Failed to set/retrieve REAL::value using Double initializer.");
			bResult = false;
		}

		return bResult;
	}
	
	public static void main(String[] args) throws Exception 
	{
        boolean bFailure = false;
        
		if (!testMOValue())
		{
		    bFailure = true;
			System.out.println("testMOValue failed!");
		}
		if (!testPQValue())
		{
		    bFailure = true;
			System.out.println("testPQValue failed!");
		}
		if (!testPQRValue())
		{
		    bFailure = true;
			System.out.println("testPQRValue failed!");
		}
		if (!testREALValue())
		{
		    bFailure = true;
			System.out.println("testREALValue failed!");
		}
		
        if (bFailure)
        {
            System.out.println("One or more tests Failed!!!");
        }
        else
        {
            System.out.println("All tests completed successfully...");
        }
	}
}
