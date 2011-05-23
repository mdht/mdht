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

import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.Authenticator;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.AuthoringDevice;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.ContextControl;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminer;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssignedEntity;

/**
 * This tests the BN class against the validations to make sure that they
 * are functioning correctly.
 * 
 * @author Les Westberg
 *
 */
public class InfrastructureRootTest {
	/**
	 * This method tests the isDefined() method on the InfrastructureRoot class.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testIsDefined() {
		boolean bItWorked = true;

		AssignedEntity oAssignedEntity = CDAFactory.eINSTANCE.createAssignedEntity();
		if (oAssignedEntity.isDefined("classCode")) {
			bItWorked = false;
		}

		oAssignedEntity.setClassCode(RoleClassAssignedEntity.ASSIGNED);
		if (!oAssignedEntity.isDefined("classCode")) {
			bItWorked = false;
		}

		return bItWorked;
	}

	/**
	 * This method tests the isClassCodeDefined() method on the InfrastructureRoot class.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testIsClassCodeDefined() {
		boolean bItWorked = true;

		AssignedEntity oAssignedEntity = CDAFactory.eINSTANCE.createAssignedEntity();
		if (oAssignedEntity.isClassCodeDefined()) {
			bItWorked = false;
		}

		oAssignedEntity.setClassCode(RoleClassAssignedEntity.ASSIGNED);
		if (!oAssignedEntity.isClassCodeDefined()) {
			bItWorked = false;
		}

		return bItWorked;
	}

	/**
	 * This method tests the isTypeCodeDefined() method on the InfrastructureRoot class.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testIsTypeCodeDefined() {
		boolean bItWorked = true;

		Authenticator oAuthenticator = CDAFactory.eINSTANCE.createAuthenticator();
		if (oAuthenticator.isTypeCodeDefined()) {
			bItWorked = false;
		}

		oAuthenticator.setTypeCode(ParticipationType.ADM);
		if (!oAuthenticator.isTypeCodeDefined()) {
			bItWorked = false;
		}

		return bItWorked;
	}

	/**
	 * This method tests the isContextControlCodeDefined() method on the InfrastructureRoot class.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testIsContextControlCodeDefined() {
		boolean bItWorked = true;

		Author oAuthor = CDAFactory.eINSTANCE.createAuthor();
		if (oAuthor.isContextControlCodeDefined()) {
			bItWorked = false;
		}

		oAuthor.setContextControlCode(ContextControl.AN);
		if (!oAuthor.isContextControlCodeDefined()) {
			bItWorked = false;
		}

		return bItWorked;
	}

	/**
	 * This method tests the isDeterminerCodeDefined() method on the InfrastructureRoot class.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testIsDeterminerCodeDefined() {
		boolean bItWorked = true;

		AuthoringDevice oAuthoringDevice = CDAFactory.eINSTANCE.createAuthoringDevice();
		if (oAuthoringDevice.isDeterminerCodeDefined()) {
			bItWorked = false;
		}

		oAuthoringDevice.setDeterminerCode(EntityDeterminer.INSTANCE);
		if (!oAuthoringDevice.isDeterminerCodeDefined()) {
			bItWorked = false;
		}

		return bItWorked;
	}

	/**
	 * This method tests the isMoodCodeDefined() method on the InfrastructureRoot class.
	 * 
	 * @return boolean True if the test was successful.
	 */
	public static boolean testIsMoodCodeDefined() {
		boolean bItWorked = true;

		ClinicalDocument oClinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
		if (oClinicalDocument.isMoodCodeDefined()) {
			bItWorked = false;
		}

		oClinicalDocument.setMoodCode(ActMood.APT);
		if (!oClinicalDocument.isMoodCodeDefined()) {
			bItWorked = false;
		}

		return bItWorked;
	}

	public static void main(String[] args) throws Exception {
		boolean bFailure = false;

		if (!testIsDefined()) {
			bFailure = true;
			System.out.println("testIsDefined failed!");
		}

		if (!testIsClassCodeDefined()) {
			bFailure = true;
			System.out.println("testIsClassCodeDefined failed!");
		}

		if (!testIsTypeCodeDefined()) {
			bFailure = true;
			System.out.println("testIsTypeCodeDefined failed!");
		}

		if (!testIsContextControlCodeDefined()) {
			bFailure = true;
			System.out.println("testIsTypeCodeDefined failed!");
		}

		if (!testIsDeterminerCodeDefined()) {
			bFailure = true;
			System.out.println("testIsDeterminerCodeDefined failed!");
		}

		if (!testIsMoodCodeDefined()) {
			bFailure = true;
			System.out.println("testIsMoodCodeDefined failed!");
		}

		if (bFailure) {
			System.out.println("One or more tests Failed!!!");
		} else {
			System.out.println("All tests completed successfully...");
		}
	}
}
