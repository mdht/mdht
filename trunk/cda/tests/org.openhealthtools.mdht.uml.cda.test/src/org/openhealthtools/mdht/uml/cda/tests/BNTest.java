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
import org.openhealthtools.mdht.uml.hl7.datatypes.BN;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * This tests the BN class against the validations to make sure that they
 * are functioning correctly.
 * 
 * @author Les Westberg
 *
 */
public class BNTest 
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
	 * This method tests BN when NullFlavor is not set.  This should work.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testWithNullFlavorNotSet()
	{
		BN oBn = DatatypesFactory.eINSTANCE.createBN();
		oBn.setValue(true);
		Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oBn);
		return processDiagnostics(oDiagnostic);
	}

    /**
     * This method tests BN when setting nullFlavor.  This should not be set
     * on a BN - An error should occur.  We need to make sure it does.
     * 
     * @return boolean True if the test was successful.
     */
    public static boolean testBNWithNullFlavor_FailureCase()
    {
        boolean bResult = true;         // assume everything is OK...
        
        BN oBn = DatatypesFactory.eINSTANCE.createBN();
        oBn.setNullFlavor(NullFlavor.NA);

        Diagnostic oDiagnostic = Diagnostician.INSTANCE.validate(oBn);
        if (!diagnosticsHaveErrors(oDiagnostic))
        {
            System.out.println("There should have been a validation error but was not one.");
            bResult = false;
        }
        
        return bResult;
    }
    
    public static void main(String[] args) throws Exception 
	{
        boolean bFailure = false;
        
		if (!testWithNullFlavorNotSet())
		{
		    bFailure = true;
			System.out.println("testWithNullFlavorNotSet failed!");
		}
        if (!testBNWithNullFlavor_FailureCase())
        {
            bFailure = true;
            System.out.println("testBNWithNullFlavor_FailureCase failed!");
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
