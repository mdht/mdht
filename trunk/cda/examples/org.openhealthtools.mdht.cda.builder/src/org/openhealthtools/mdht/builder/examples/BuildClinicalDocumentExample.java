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
package org.openhealthtools.mdht.builder.examples;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import org.openhealthtools.mdht.builder.ccd.helpers.BuildPatient;
import org.openhealthtools.mdht.builder.cda.ArrayBuilder;
import org.openhealthtools.mdht.builder.cda.Builder;
import org.openhealthtools.mdht.builder.cda.DocumentBuilder;
import org.openhealthtools.mdht.builder.cda.SectionBuilder;
import org.openhealthtools.mdht.builder.cda.helpers.BuildAuthor;
import org.openhealthtools.mdht.builder.cda.helpers.BuilderUtil;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood;

public class BuildClinicalDocumentExample {

	public static class BuildActs extends ArrayBuilder<Act> {

		@Override
		public ArrayList<Act> construct() {

			ArrayList<Act> acts = new ArrayList<Act>();

			Act act = CDAFactory.eINSTANCE.createAct();

			act.setMoodCode(x_DocumentActMood.EVN);

			act.setClassCode(x_ActClassDocumentEntryAct.ACCM);

			act.setNullFlavor(NullFlavor.NASK);

			acts.add(act);

			return acts;
		}

	}

	public static class BuildSection extends SectionBuilder {
		@Override
		public ArrayBuilder<Act> getActBuilder() {

			return new BuildActs();
		}

	}

	public static void main(String[] args) {

		DocumentBuilder exampleClinicalDocumentBuilder = new DocumentBuilder() {

			@Override
			public Builder<II> getDocumentIdBuilder() {
				return new BuilderUtil.BuildII("2.16.840.1.113883.19.4", "c266");
			}

			@Override
			public ArrayBuilder<II> getDocumentTemplateIdBuilder() {
				return new BuilderUtil.BuildTemplateId("2.16.840.1.113883.3.27.1776");
			}

			@Override
			public Builder<TS> getDocumentEffectiveTimeBuilder() {
				return new BuilderUtil.BuildEffectiveTime(new GregorianCalendar(1999, 12, 31));
			}

			@Override
			public Builder<ST> getDocumentTitleBuilder() {
				return new BuilderUtil.BuildST("Good Health Clinic Consultation Note");
			}

			@Override
			public ArrayBuilder<Author> getAuthorBuilder() {
				return new BuildAuthor("Bob", "Dolin", "MD");
			}

			@Override
			public Builder<Patient> getPatientBuilder() {
				return new BuildPatient("fname", "lname", "III", "19500515", "M");
			}

			@Override
			public SectionBuilder getSectionBuilder() {
				return new BuildSection();
			}

		};

		try {
			CDAUtil.save(exampleClinicalDocumentBuilder.buildDocument(), System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
