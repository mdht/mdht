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

import java.math.BigInteger;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;

public class BigIntegerTest 
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
	 * This method tests the INT::value to make sure it is now working correctly with
	 * BigInteger with backward compatibility with Integer. 
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testINTValue()
	{
		boolean bResult = true;			// Assume we are working correctly.
		
		INT oINT = DatatypesFactory.eINSTANCE.createINT();
		oINT.setValue(new BigInteger("123456"));
		if (! oINT.getValue().equals(new BigInteger("123456")))
		{
			System.out.println("Failed to set/retrieve INT::value using BigInteger initializer.");
			bResult = false;
		}
		
		oINT = DatatypesFactory.eINSTANCE.createINT();
		oINT.setValue(new Integer("4567"));
		if (! oINT.getValue().equals(new BigInteger("4567")))
		{
			System.out.println("Failed to set/retrieve INT::value using Double initializer.");
			bResult = false;
		}

		return bResult;
	}
	
	public static void main(String[] args) throws Exception 
	{
        boolean bFailure = false;
        
		if (!testINTValue())
		{
		    bFailure = true;
			System.out.println("testINTValue failed!");
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
