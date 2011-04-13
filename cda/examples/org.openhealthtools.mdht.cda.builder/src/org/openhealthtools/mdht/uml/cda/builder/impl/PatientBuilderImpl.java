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
package org.openhealthtools.mdht.uml.cda.builder.impl;

import java.util.ArrayList;
import java.util.List;

import org.openhealthtools.mdht.uml.cda.Birthplace;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Guardian;
import org.openhealthtools.mdht.uml.cda.LanguageCommunication;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.builder.PatientBuilder;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminer;

public class PatientBuilderImpl implements PatientBuilder {

	List<PN> names = new ArrayList<PN>();
	List<CE> SDTCRaceCodes = new ArrayList<CE>();
	List<Guardian> guardians = new ArrayList<Guardian>();
	List<LanguageCommunication> languageCommunications = new ArrayList<LanguageCommunication>();
	
	II id;
	TS birthTime;
	CE administrativeGender;
	CE maritalStatus;
	CE religiousAffiliation;
	CE raceCode;
	CE ethnicGroup;
	Birthplace birthplace;
	EntityDeterminer entityDeterminer;

	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilder#build()
	 */
	@Override
	public Patient build() {

		Patient patient = CDAFactory.eINSTANCE.createPatient();

		patient.getNames().addAll(names);

		patient.getSDTCRaceCodes().addAll(SDTCRaceCodes);

		patient.getGuardians().addAll(guardians);

		patient.getLanguageCommunications().addAll(languageCommunications);

	
		if (id != null) {
			patient.setId(id);
		}
		if (administrativeGender != null) {
			patient.setAdministrativeGenderCode(administrativeGender);
		}

		if (birthTime != null) {
			patient.setBirthTime(birthTime);
		}

		if (maritalStatus != null) {
			patient.setMaritalStatusCode(maritalStatus);
		}

		if (religiousAffiliation != null) {
			patient.setReligiousAffiliationCode(religiousAffiliation);
		}

		if (raceCode != null) {
			patient.setRaceCode(raceCode);
		}

		if (ethnicGroup != null) {
			patient.setEthnicGroupCode(ethnicGroup);
		}

		if (birthplace != null) {
			patient.setBirthplace(birthplace);
		}

		if (entityDeterminer != null) {
			patient.setDeterminerCode(entityDeterminer);
		}

		return patient;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilder#withAdministrativeGender(org.openhealthtools.mdht.uml.hl7.datatypes.CE)
	 */
	@Override
	public PatientBuilder withAdministrativeGender(CE administrativeGender) {
		this.administrativeGender = administrativeGender;
		return this;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilder#withBirthplace(org.openhealthtools.mdht.uml.cda.Birthplace)
	 */
	@Override
	public PatientBuilder withBirthplace(Birthplace birthplace) {
		this.birthplace = birthplace;
		return this;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilder#withBirthTime(org.openhealthtools.mdht.uml.hl7.datatypes.TS)
	 */
	@Override
	public PatientBuilder withBirthTime(TS birthTime) {
		this.birthTime = birthTime;
		return this;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilder#withEntityDeterminer(org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminer)
	 */
	@Override
	public PatientBuilder withEntityDeterminer(EntityDeterminer entityDeterminer) {
		this.entityDeterminer = entityDeterminer;
		return this;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilder#withEthnicGroup(org.openhealthtools.mdht.uml.hl7.datatypes.CE)
	 */
	@Override
	public PatientBuilder withEthnicGroup(CE ethnicGroup) {
		this.ethnicGroup = ethnicGroup;
		return this;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilder#withGuardian(org.openhealthtools.mdht.uml.cda.Guardian)
	 */
	@Override
	public PatientBuilder withGuardian(Guardian guardian) {
		this.guardians.add(guardian);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilder#withGuardians(java.util.List)
	 */
	@Override
	public PatientBuilder withGuardians(List<Guardian> guardians) {
		this.guardians.addAll(guardians);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilder#withId(org.openhealthtools.mdht.uml.hl7.datatypes.II)
	 */
	@Override
	public PatientBuilder withId(II id) {
		this.id = id;
		return this;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilder#withLanguageCommunication(org.openhealthtools.mdht.uml.cda.LanguageCommunication)
	 */
	@Override
	public PatientBuilder withLanguageCommunication(LanguageCommunication languageCommunication) {
		this.languageCommunications.add(languageCommunication);
		return this;
	}
	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilder#withLanguageCommunications(java.util.List)
	 */
	@Override
	public PatientBuilder withLanguageCommunications(List<LanguageCommunication> languageCommunications) {
		this.languageCommunications.addAll(languageCommunications);
		return this;
	}
	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilder#withMaritalStatus(org.openhealthtools.mdht.uml.hl7.datatypes.CE)
	 */
	@Override
	public PatientBuilder withMaritalStatus(CE maritalStatus) {
		this.maritalStatus = maritalStatus;
		return this;
	}
	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilder#withName(org.openhealthtools.mdht.uml.hl7.datatypes.PN)
	 */
	@Override
	public PatientBuilder withName(PN pn) {
		this.names.add(pn);
		return this;
	}
	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilder#withNames(java.util.List)
	 */
	@Override
	public PatientBuilder withNames(List<PN> pns) {
		this.names.addAll(pns);
		return this;
	}
	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilder#withRaceCode(org.openhealthtools.mdht.uml.hl7.datatypes.CE)
	 */
	@Override
	public PatientBuilder withRaceCode(CE raceCode) {
		this.raceCode = raceCode;
		return this;
	}
	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilder#withReligiousAffiliation(org.openhealthtools.mdht.uml.hl7.datatypes.CE)
	 */
	@Override
	public PatientBuilder withReligiousAffiliation(CE religiousAffiliation) {
		this.religiousAffiliation = religiousAffiliation;
		return this;
	}
	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilder#withSDTCRaceCode(org.openhealthtools.mdht.uml.hl7.datatypes.CE)
	 */
	@Override
	public PatientBuilder withSDTCRaceCode(CE raceCode) {
		this.SDTCRaceCodes.add(raceCode);
		return this;
	}

	/* (non-Javadoc)
	 * @see org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilder#withSDTCRaceCodes(java.util.List)
	 */
	@Override
	public PatientBuilder withSDTCRaceCodes(List<CE> raceCodes) {
		this.SDTCRaceCodes.addAll(raceCodes);
		return this;
	}

}
