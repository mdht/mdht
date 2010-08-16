/*******************************************************************************
2 	* Copyright (c) 2010 Sean Muir.
3 	* All rights reserved. This program and the accompanying materials
4 	* are made available under the terms of the Eclipse Public License v1.0
5 	* which accompanies this distribution, and is available at
6 	* http://www.eclipse.org/legal/epl-v10.html
7 	*
8 	* Contributors:
9 	* Sean Muir (JKM Software) - initial API and implementation
10 	*
11 	* $Id$
12 	*******************************************************************************/
package org.openhealthtools.mdht.builder.ccd.helpers;

import org.openhealthtools.mdht.builder.cda.Builder;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

public class BuildPatient extends Builder<Patient> {

	String givenName;

	String familyName;

	String suffix;

	String gender;

	String dob;

	public BuildPatient(String givenName, String familyName, String suffix, String dob, String gender) {
		super();
		this.givenName = givenName;
		this.familyName = familyName;
		this.suffix = suffix;
		this.dob = dob;
		this.gender = gender;
	}

	@Override
	public Patient construct() {

		Patient patient = CDAFactory.eINSTANCE.createPatient();

		PN name = DatatypesFactory.eINSTANCE.createPN();

		name.addGiven(givenName).addFamily(familyName).addSuffix(suffix);

		patient.getNames().add(name);

		CE administrativeGenderCode = DatatypesFactory.eINSTANCE.createCE(gender, "2.16.840.1.113883.5.1");

		patient.setAdministrativeGenderCode(administrativeGenderCode);

		TS birthTime = DatatypesFactory.eINSTANCE.createTS(dob);

		patient.setBirthTime(birthTime);

		return patient;
	}

}
