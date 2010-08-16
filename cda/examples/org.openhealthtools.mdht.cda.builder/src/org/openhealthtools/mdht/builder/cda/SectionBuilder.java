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
package org.openhealthtools.mdht.builder.cda;

import java.util.ArrayList;

import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ObservationMedia;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.RegionOfInterest;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.Subject;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClass;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

public class SectionBuilder {

	public ArrayBuilder<Act> getActBuilder() {
		return new ArrayBuilder<Act>();
	}

	public ArrayBuilder<Encounter> getEncounterBuilder() {
		return new ArrayBuilder<Encounter>();
	}

	public ArrayBuilder<Observation> getObservationBuilder() {
		return new ArrayBuilder<Observation>();
	}

	public ArrayBuilder<ObservationMedia> getObservationMediaBuilder() {
		return new ArrayBuilder<ObservationMedia>();
	}

	public ArrayBuilder<Organizer> getOrganizerBuilder() {
		return new ArrayBuilder<Organizer>();
	}

	public ArrayList<Organizer> buildOrganizers() {
		return null;
	}

	public ArrayBuilder<Procedure> getProcedureBuilder() {
		return new ArrayBuilder<Procedure>();
	}

	public ArrayBuilder<RegionOfInterest> getRegionOfInterestBuilder() {
		return new ArrayBuilder<RegionOfInterest>();
	}

	public ArrayBuilder<Section> getSectionBuilder() {
		return new ArrayBuilder<Section>();
	}

	public ArrayBuilder<SubstanceAdministration> getSubstanceAdministrationBuilder() {
		return new ArrayBuilder<SubstanceAdministration>();
	}

	public ArrayBuilder<Supply> getSupplyBuilder() {
		return new ArrayBuilder<Supply>();
	}

	public Builder<ActClass> getSectionClassCodeBuilder() {
		return new Builder<ActClass>();
	}

	public Builder<CE> getSectionConfidentialityCodeBuilder() {
		return new Builder<CE>();
	}

	public Builder<II> getIdBuilder() {
		return new Builder<II>();
	}

	public Builder<CS> getSectionLanguageCodeBuilder() {
		return new Builder<CS>();
	}

	public Builder<ActMood> getSectionMoodCodeBuilder() {
		return new Builder<ActMood>();
	}

	public Builder<NullFlavor> getSectionNullFlavorBuilder() {
		return new Builder<NullFlavor>();
	}

	public Builder<String> getSectionIdBuilder() {
		return new Builder<String>();
	}

	public Builder<Subject> getSectionSubjectBuilder() {
		return new Builder<Subject>();
	}

	public Builder<StrucDocText> getSectionTextBuilder() {
		return new Builder<StrucDocText>();
	}

	public Builder<ST> getSectionTitleBuilder() {
		return new Builder<ST>();
	}

	public Builder<InfrastructureRootTypeId> getSectionTypeIdBuilder() {
		return new Builder<InfrastructureRootTypeId>();
	}

	protected void construct(Section section) {

		section.setClassCode(getSectionClassCodeBuilder().construct());

		section.setConfidentialityCode(getSectionConfidentialityCodeBuilder().construct());

		section.setId(getIdBuilder().construct());

		section.setLanguageCode(getSectionLanguageCodeBuilder().construct());

		section.setMoodCode(getSectionMoodCodeBuilder().construct());

		section.setNullFlavor(getSectionNullFlavorBuilder().construct());

		section.setSectionId(getSectionIdBuilder().construct());

		section.setSubject(getSectionSubjectBuilder().construct());

		section.setText(getSectionTextBuilder().construct());

		section.setTitle(getSectionTitleBuilder().construct());

		section.setTypeId(getSectionTypeIdBuilder().construct());

		for (Act act : getActBuilder().construct()) {

			section.addAct(act);

		}

		for (Encounter encounter : getEncounterBuilder().construct()) {

			section.addEncounter(encounter);

		}

		for (Observation observation : getObservationBuilder().construct()) {

			section.addObservation(observation);

		}

		for (ObservationMedia observationMedia : getObservationMediaBuilder().construct()) {

			section.addObservationMedia(observationMedia);

		}

		for (Organizer organizer : getOrganizerBuilder().construct()) {

			section.addOrganizer(organizer);

		}

		for (RegionOfInterest regionOfInterest : getRegionOfInterestBuilder().construct()) {

			section.addRegionOfInterest(regionOfInterest);

		}

		for (Section subSection : getSectionBuilder().construct()) {

			section.addSection(subSection);

		}

		for (SubstanceAdministration substanceAdministration : getSubstanceAdministrationBuilder().construct()) {

			section.addSubstanceAdministration(substanceAdministration);

		}

		for (Supply supply : getSupplyBuilder().construct()) {

			section.addSupply(supply);

		}

	}

	public ArrayList<Section> constructSections() {

		ArrayList<Section> sections = new ArrayList<Section>();

		Section section = CDAFactory.eINSTANCE.createSection();

		construct(section);

		sections.add(section);

		return sections;

	}

}
