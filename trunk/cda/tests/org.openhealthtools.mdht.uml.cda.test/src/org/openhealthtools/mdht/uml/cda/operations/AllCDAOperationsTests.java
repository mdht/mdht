/**
 * Copyright (c) 2010 IBM Corporation
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
package org.openhealthtools.mdht.uml.cda.operations;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This class represents a suite of JUnit 4 test cases for CDA document
 * processing.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ActOperationsTest.class,
	AssignedAuthorOperationsTest.class,
	ClinicalDocumentOperationsTest.class,
	ClinicalStatementOperationsTest.class, Component2OperationsTest.class,
	Component4OperationsTest.class, EncounterOperationsTest.class,
	EntryOperationsTest.class, EntryRelationshipOperationsTest.class,
	GuardianOperationsTest.class, Informant12OperationsTest.class,
	ManufacturedProductOperationsTest.class,
	ObservationMediaOperationsTest.class, ObservationOperationsTest.class,
	OrganizerOperationsTest.class, ParticipantRoleOperationsTest.class,
	ProcedureOperationsTest.class, ReferenceOperationsTest.class,
	RegionOfInterestOperationsTest.class, SectionOperationsTest.class,
	StrucDocTextOperationsTest.class,
	SubstanceAdministrationOperationsTest.class, SupplyOperationsTest.class })
	public class AllCDAOperationsTests {
	// Nothing
} // AllCDATests