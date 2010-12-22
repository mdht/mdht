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
package org.openhealthtools.mdht.builder.cda;

import java.util.ArrayList;
import java.util.List;

import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
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
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClass;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentProcedureMood;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;

public class SectionDirector {
	
//	public List<Act> getActBuilder() {
//		return new ArrayBuilder<Act>();
//	}
	
	public  List <Act>  buildActs() {
		return new ArrayBuilder<Act>().construct();
	}
	

	public List<Encounter> buildEncounters() {
		return new ArrayBuilder<Encounter>().construct();
	}

	public List<Observation> buildObservations() {
		return new ArrayBuilder<Observation>().construct();
	}

	public List<ObservationMedia> buildObservationMedia() {
		return new ArrayBuilder<ObservationMedia>().construct();
	}

	public List<Organizer> buildOrganizers() {
		return new ArrayBuilder<Organizer>().construct();
	}

//	public List<Organizer> buildOrganizers() {
//		return null;
//	}

	public List<Procedure> buildProcedures() {
		return new ArrayBuilder<Procedure>().construct();
	}

	public List<RegionOfInterest> buildRegionsOfInterest() {
		return new ArrayBuilder<RegionOfInterest>().construct();
	}

	public List<Section> buildSubSections() {
		return new ArrayBuilder<Section>().construct();
	}

	public List<SubstanceAdministration> buildSubstanceAdministrations() {
		return new ArrayBuilder<SubstanceAdministration>().construct();
	}

	public List<Supply> buildSupplies() {
		return new ArrayBuilder<Supply>().construct();
	}

	public ActClass getSectionClassCode() {
		return null;
	}

	public CE buildSectionConfidentialityCode() {
		return null;
	}

	public II buildId() {
		return null;
	}

	public CS buildSectionLanguageCode() {
		return null;
	}

	public ActMood buildSectionMoodCode() {
		return null;
	}

	public NullFlavor buildSectionNullFlavor() {
		return null;
	}

	public String buildSectionId() {
		return null;
	}

	public Subject buildSectionSubject() {
		return null;
	}

	public StrucDocText buildSectionText() {
		return null;
	}

	public ST buildSectionTitle() {
		return null;
	}

	public InfrastructureRootTypeId buildSectionTypeId() {
		return null;
	}

	public List<Entry> getEntry() {
		return new ArrayBuilder<Entry>().construct(); 
	}

	
	protected void construct(Section section) {

		section.setClassCode(getSectionClassCode());

		section.setConfidentialityCode(buildSectionConfidentialityCode());

		section.setId(buildId());

		section.setLanguageCode(buildSectionLanguageCode());

		section.setMoodCode(buildSectionMoodCode());

		section.setNullFlavor(buildSectionNullFlavor());

		section.setSectionId(buildSectionId());

		section.setSubject(buildSectionSubject());

		section.setText(buildSectionText());

		section.setTitle(buildSectionTitle());

		section.setTypeId(buildSectionTypeId());

		
		for (Act act : buildActs()) {
			section.addAct(act);
		}
		
		for (Encounter encounter : buildEncounters()) {

			section.addEncounter(encounter);

		}

		for (Observation observation : buildObservations()) {

			section.addObservation(observation);

		}

		for (ObservationMedia observationMedia : buildObservationMedia()) {

			section.addObservationMedia(observationMedia);

		}

		for (Organizer organizer : buildOrganizers()) {

			section.addOrganizer(organizer);

		}

		for (RegionOfInterest regionOfInterest : buildRegionsOfInterest()) {

			section.addRegionOfInterest(regionOfInterest);

		}

		for (Section subSection : buildSubSections()) {

			section.addSection(subSection);

		}

		for (SubstanceAdministration substanceAdministration : buildSubstanceAdministrations()) {

			
			substanceAdministration.setMoodCode(x_DocumentSubstanceMood.EVN);
			
			section.addSubstanceAdministration(substanceAdministration);

		}

		for (Supply supply : buildSupplies()) {

			section.addSupply(supply);

		}
		
		for (Entry entry : getEntry())
		{
			section.getEntries().add(entry );
		}
		
		
		for (Procedure procedure : buildProcedures())
		{
			procedure.setClassCode(ActClass.PROC);
			
			procedure.setMoodCode(x_DocumentProcedureMood.EVN);
			
			section.addProcedure(procedure);
		}
		
		
		

	}


	public List<Section> constructSections() {

		ArrayList<Section> sections = new ArrayList<Section>();

		Section section = CDAFactory.eINSTANCE.createSection();

		construct(section);

		sections.add(section);

		return sections;

	}

}
