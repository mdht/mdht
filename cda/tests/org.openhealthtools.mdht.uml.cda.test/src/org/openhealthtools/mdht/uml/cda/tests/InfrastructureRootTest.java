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

import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssignedEntity;

/**
 * This tests the BN class against the validations to make sure that they
 * are functioning correctly.
 * 
 * @author Les Westberg
 *
 */
public class InfrastructureRootTest 
{
	/**
	 * This method tests the isDefined() method on the InfrastructureRoot class.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testIsDefined()
	{
		boolean bItWorked = true;
		
		AssignedEntity oAssignedEntity = CDAFactory.eINSTANCE.createAssignedEntity();
		if (oAssignedEntity.isDefined("classCode"))
		{
			bItWorked = false;
		}
		
		oAssignedEntity.setClassCode(RoleClassAssignedEntity.ASSIGNED);
		if (!oAssignedEntity.isDefined("classCode"))
		{
			bItWorked = false;
		}
		
		return bItWorked;
	}

    
    public static void main(String[] args) throws Exception 
	{
        boolean bFailure = false;
        
		if (!testIsDefined())
		{
		    bFailure = true;
			System.out.println("testIsDefined failed!");
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
