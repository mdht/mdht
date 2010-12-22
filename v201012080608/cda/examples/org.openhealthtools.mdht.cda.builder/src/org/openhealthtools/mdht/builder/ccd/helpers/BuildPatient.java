/*******************************************************************************
 * Copyright (c) 2010 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Sean Muir (JKM Software) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.builder.ccd.helpers;

import org.openhealthtools.mdht.builder.cda.Builder;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

public class BuildPatient extends Builder<Patient> {

	String[] givenNames;

	String familyName;

	String suffix;

	String gender;

	String dob;

	public BuildPatient(String givenName, String familyName, String suffix, String dob, String gender) {
		super();
		this.givenNames = new String[] { givenName };
		this.familyName = familyName;
		this.suffix = suffix;
		this.dob = dob;
		this.gender = gender;
	}

	
	public BuildPatient(String[] givenNames, String familyName, String suffix, String dob, String gender) {
		super();
		this.givenNames = givenNames;
		this.familyName = familyName;
		this.suffix = suffix;
		this.dob = dob;
		this.gender = gender;
	}

	@Override
	public Patient construct() {

		Patient patient = CDAFactory.eINSTANCE.createPatient();

		PN name = DatatypesFactory.eINSTANCE.createPN();

		for (String givenName: givenNames) {
			name.addGiven(givenName);	
		}
		
		name.addFamily(familyName).addSuffix(suffix);

		patient.getNames().add(name);

		CE administrativeGenderCode = DatatypesFactory.eINSTANCE.createCE(gender, "2.16.840.1.113883.5.1");

		patient.setAdministrativeGenderCode(administrativeGenderCode);

		TS birthTime = DatatypesFactory.eINSTANCE.createTS(dob);

		patient.setBirthTime(birthTime);

		return patient;
	}

}
