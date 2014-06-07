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
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClass;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

public interface SectionBuilder<SectionTarget> {

	public SectionTarget buildSection();

	public void construct(Section section);

	public SectionBuilder<SectionTarget> with(Act act);

	public SectionBuilder<SectionTarget> with(Encounter encounter);

	public SectionBuilder<SectionTarget> with(Entry entry);

	public SectionBuilder<SectionTarget> with(InfrastructureRootTypeId sectionTypeId);

	public SectionBuilder<SectionTarget> with(Observation observation);

	public SectionBuilder<SectionTarget> with(ObservationMedia observationMedia);

	public SectionBuilder<SectionTarget> with(Organizer organizer);

	public SectionBuilder<SectionTarget> with(Procedure procedure);

	public SectionBuilder<SectionTarget> with(RegionOfInterest regionOfInterest);

	public SectionBuilder<SectionTarget> with(Section section);

	public SectionBuilder<SectionTarget> with(ST title);

	public SectionBuilder<SectionTarget> with(StrucDocText strucDocText);

	public SectionBuilder<SectionTarget> with(Subject subject);

	public SectionBuilder<SectionTarget> with(SubstanceAdministration substanceAdministration);

	public SectionBuilder<SectionTarget> with(Supply supply);

	public SectionBuilder<SectionTarget> withId(II id);

	public SectionBuilder<SectionTarget> withSectionClassCode(ActClass sectionClassCode);

	public SectionBuilder<SectionTarget> withSectionConfidentialityCode(CE sectionConfidentialityCode);

	public SectionBuilder<SectionTarget> withSectionId(String sectionId);

	public SectionBuilder<SectionTarget> withSectionLanguageCode(CS sectionLanguageCode);

	public SectionBuilder<SectionTarget> withSectionMoodCode(ActMood sectionMoodCode);

	public SectionBuilder<SectionTarget> withSectionNullFlavor(NullFlavor sectionNullFlavor);

}
