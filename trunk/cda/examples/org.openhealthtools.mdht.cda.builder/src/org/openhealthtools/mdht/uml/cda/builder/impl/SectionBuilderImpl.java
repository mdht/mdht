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
package org.openhealthtools.mdht.uml.cda.builder.impl;

import java.util.ArrayList;
import java.util.List;

import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Entry;
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
import org.openhealthtools.mdht.uml.cda.builder.SectionBuilder;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClass;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentProcedureMood;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;

@SuppressWarnings("rawtypes")
public abstract class SectionBuilderImpl<SectionTarget> implements SectionBuilder {

	List<Act> acts = new ArrayList<Act>();

	List<Encounter> encounters = new ArrayList<Encounter>();

	List<Entry> entries = new ArrayList<Entry>();

	II id = null;

	List<ObservationMedia> observationMedias = new ArrayList<ObservationMedia>();

	List<Observation> observations = new ArrayList<Observation>();

	List<Organizer> organizers = new ArrayList<Organizer>();

	List<Procedure> procedures = new ArrayList<Procedure>();

	List<RegionOfInterest> regionsOfInterest = new ArrayList<RegionOfInterest>();

	ActClass sectionClassCode = null;

	CE sectionConfidentialityCode = null;

	String sectionId = null;

	CS sectionLanguageCode = null;

	ActMood sectionMoodCode = null;

	NullFlavor sectionNullFlavor = null;

	InfrastructureRootTypeId sectionTypeId = null;

	StrucDocText strucDocText = null;

	Subject subject = null;

	List<Section> subSections = new ArrayList<Section>();

	List<SubstanceAdministration> substanceAdministrations = new ArrayList<SubstanceAdministration>();

	List<Supply> supplies = new ArrayList<Supply>();

	ST title = null;

	public abstract SectionTarget buildSection();

	public void construct(Section section) {

		if (this.sectionClassCode != null) {
			section.setClassCode(sectionClassCode);
		}
		if (sectionConfidentialityCode != null) {
			section.setConfidentialityCode(sectionConfidentialityCode);
		}

		if (id != null) {
			section.setId(id);
		}

		if (sectionLanguageCode != null) {
			section.setLanguageCode(sectionLanguageCode);
		}

		if (sectionMoodCode != null) {
			section.setMoodCode(sectionMoodCode);
		}

		if (sectionNullFlavor != null) {
			section.setNullFlavor(sectionNullFlavor);
		}

		if (sectionId != null) {
			section.setSectionId(sectionId);
		}

		if (subject != null) {
			section.setSubject(subject);
		}

		if (strucDocText != null) {
			section.setText(strucDocText);
		}

		if (title != null) {
			section.setTitle(title);
		}

		if (sectionTypeId != null) {
			section.setTypeId(sectionTypeId);
		}

		for (Act act : acts) {
			section.addAct(act);
		}

		for (Encounter encounter : encounters) {

			section.addEncounter(encounter);

		}

		for (Observation observation : observations) {

			section.addObservation(observation);

		}

		for (ObservationMedia observationMedia : observationMedias) {

			section.addObservationMedia(observationMedia);

		}

		for (Organizer organizer : organizers) {

			section.addOrganizer(organizer);

		}

		for (RegionOfInterest regionOfInterest : regionsOfInterest) {

			section.addRegionOfInterest(regionOfInterest);

		}

		for (Section subSection : subSections) {

			section.addSection(subSection);

		}

		for (SubstanceAdministration substanceAdministration : substanceAdministrations) {

			substanceAdministration.setMoodCode(x_DocumentSubstanceMood.EVN);

			section.addSubstanceAdministration(substanceAdministration);

		}

		for (Supply supply : supplies) {

			section.addSupply(supply);

		}

		for (Entry entry : entries) {
			section.getEntries().add(entry);
		}

		for (Procedure procedure : procedures) {
			procedure.setClassCode(ActClass.PROC);

			procedure.setMoodCode(x_DocumentProcedureMood.EVN);

			section.addProcedure(procedure);
		}

	}

	public SectionBuilderImpl<SectionTarget> with(Act act) {
		this.acts.add(act);
		return this;
	}

	public SectionBuilderImpl<SectionTarget> with(Encounter encounter) {
		this.encounters.add(encounter);
		return this;
	}

	public SectionBuilderImpl<SectionTarget> with(Entry entry) {
		this.entries.add(entry);
		return this;
	}

	public SectionBuilderImpl<SectionTarget> with(InfrastructureRootTypeId sectionTypeId) {
		this.sectionTypeId = sectionTypeId;
		return this;
	}

	public SectionBuilderImpl<SectionTarget> with(Observation observation) {
		this.observations.add(observation);
		return this;
	}

	public SectionBuilderImpl<SectionTarget> with(ObservationMedia observationMedia) {
		this.observationMedias.add(observationMedia);
		return this;
	}

	public SectionBuilderImpl<SectionTarget> with(Organizer organizer) {
		this.organizers.add(organizer);
		return this;
	}

	public SectionBuilderImpl<SectionTarget> with(Procedure procedure) {
		this.procedures.add(procedure);
		return this;
	}

	public SectionBuilderImpl<SectionTarget> with(RegionOfInterest regionOfInterest) {
		this.regionsOfInterest.add(regionOfInterest);
		return this;
	}

	public SectionBuilderImpl<SectionTarget> with(Section section) {
		this.subSections.add(section);
		return this;
	}

	public SectionBuilderImpl<SectionTarget> with(ST title) {
		this.title = title;
		return this;
	}

	public SectionBuilderImpl<SectionTarget> with(StrucDocText strucDocText) {
		this.strucDocText = strucDocText;
		return this;
	}

	public SectionBuilderImpl<SectionTarget> with(Subject subject) {
		this.subject = subject;
		return this;
	}

	public SectionBuilderImpl<SectionTarget> with(SubstanceAdministration substanceAdministration) {
		this.substanceAdministrations.add(substanceAdministration);
		return this;
	}

	public SectionBuilderImpl<SectionTarget> with(Supply supply) {
		this.supplies.add(supply);
		return this;
	}

	public SectionBuilderImpl<SectionTarget> withId(II id) {
		this.id = id;
		return this;
	}

	public SectionBuilderImpl<SectionTarget> withSectionClassCode(ActClass sectionClassCode) {
		this.sectionClassCode = sectionClassCode;
		return this;
	}

	public SectionBuilderImpl<SectionTarget> withSectionConfidentialityCode(CE sectionConfidentialityCode) {
		this.sectionConfidentialityCode = sectionConfidentialityCode;
		return this;
	}

	public SectionBuilderImpl<SectionTarget> withSectionId(String sectionId) {
		this.sectionId = sectionId;
		return this;
	}

	public SectionBuilderImpl<SectionTarget> withSectionLanguageCode(CS sectionLanguageCode) {
		this.sectionLanguageCode = sectionLanguageCode;
		return this;
	}

	public SectionBuilderImpl<SectionTarget> withSectionMoodCode(ActMood sectionMoodCode) {
		this.sectionMoodCode = sectionMoodCode;
		return this;
	}

	public SectionBuilderImpl<SectionTarget> withSectionNullFlavor(NullFlavor sectionNullFlavor) {
		this.sectionNullFlavor = sectionNullFlavor;
		return this;
	}

}
