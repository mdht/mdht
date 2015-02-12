/*******************************************************************************
 * Copyright (c) 2010, 2011 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.builder;

import java.util.List;

import org.openhealthtools.mdht.uml.cda.Birthplace;
import org.openhealthtools.mdht.uml.cda.Guardian;
import org.openhealthtools.mdht.uml.cda.LanguageCommunication;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminer;

public interface PatientBuilder {

	public Patient build();

	public PatientBuilder withAdministrativeGender(CE administrativeGender);

	public PatientBuilder withBirthplace(Birthplace birthplace);

	public PatientBuilder withBirthTime(TS birthTime);

	public PatientBuilder withEntityDeterminer(EntityDeterminer entityDeterminer);

	public PatientBuilder withEthnicGroup(CE ethnicGroup);

	public PatientBuilder withGuardian(Guardian guardian);

	public PatientBuilder withGuardians(List<Guardian> guardians);

	public PatientBuilder withId(II id);

	public PatientBuilder withLanguageCommunication(LanguageCommunication languageCommunication);

	public PatientBuilder withLanguageCommunications(List<LanguageCommunication> languageCommunications);

	public PatientBuilder withMaritalStatus(CE maritalStatus);

	public PatientBuilder withName(PN pn);

	public PatientBuilder withNames(List<PN> pns);

	public PatientBuilder withRaceCode(CE raceCode);

	public PatientBuilder withReligiousAffiliation(CE religiousAffiliation);

	public PatientBuilder withSDTCRaceCode(CE raceCode);

	public PatientBuilder withSDTCRaceCodes(List<CE> raceCodes);

}
