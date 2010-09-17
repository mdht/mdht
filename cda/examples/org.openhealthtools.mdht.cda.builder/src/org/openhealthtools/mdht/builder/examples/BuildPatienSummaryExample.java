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
package org.openhealthtools.mdht.builder.examples;

import java.util.ArrayList;
import java.util.List;

import org.openhealthtools.mdht.builder.ccd.DocumentBuilder.ProblemSectionBuilder;
import org.openhealthtools.mdht.builder.ccd.DocumentBuilder.ResultsSectionBuilder;
import org.openhealthtools.mdht.builder.ccd.helpers.BuildPatient;
import org.openhealthtools.mdht.builder.cda.ArrayBuilder;
import org.openhealthtools.mdht.builder.cda.Builder;
import org.openhealthtools.mdht.builder.cda.helpers.BuildAuthor;
import org.openhealthtools.mdht.builder.cda.helpers.BuilderUtil;
import org.openhealthtools.mdht.builder.hitsp.DocumentBuilder;
import org.openhealthtools.mdht.builder.hitsp.DocumentBuilder.ProblemListSectionBuilder;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

public class BuildPatienSummaryExample {

	static class ProblemListSectionBuilderExample extends ProblemListSectionBuilder {
		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Problem List Section Example");
		}

		@Override
		public ArrayBuilder<Act> getActBuilder() {
			return new ArrayBuilder<Act>() {

				@Override
				public List<Act> construct() {
					ArrayList<Act> acts = new ArrayList<Act>();

					Condition condition = HITSPFactory.eINSTANCE.createCondition().init();
					condition.getIds().add(DatatypesFactory.eINSTANCE.createII("ec8a6ff8-ed4b-4f7e-82c3-e98e58b45de7"));

					IVL_TS effectiveTime = DatatypesFactory.eINSTANCE.createIVL_TS();
					effectiveTime.setLow(BuilderUtil.getTS_UNK());
					condition.setEffectiveTime(effectiveTime);

					ConditionEntry problemEntry = condition.createConditionEntry();
					problemEntry.getIds().add(DatatypesFactory.eINSTANCE.createII("ab1791b0-5c71-11db-b0de-0800200c9a66"));
					problemEntry.setCode(DatatypesFactory.eINSTANCE.createCD("64572001", "2.16.840.1.113883.6.96", "SNOMED-CT", "Condition"));
					problemEntry.getValues().add(DatatypesFactory.eINSTANCE.createCD("233604007", "2.16.840.1.113883.6.96", "SNOMED-CT", "Pneumonia"));
					effectiveTime = DatatypesFactory.eINSTANCE.createIVL_TS("199701", null);
					effectiveTime.setHigh(BuilderUtil.getTS_UNK());
					problemEntry.setEffectiveTime(effectiveTime);

					ProblemHealthStatusObservation healthStatus = CCDFactory.eINSTANCE.createProblemHealthStatusObservation().init();
					problemEntry.addObservation(healthStatus);
					CE healthStatusValue = DatatypesFactory.eINSTANCE.createCE("xyz", "2.16.840.1.113883.1.11.20.12", "ProblemHealthStatusCode", null);
					healthStatusValue.setCodeSystemVersion("20061017");
					healthStatus.getValues().add(healthStatusValue);

					acts.add(condition);

					return acts;
				}

			};
		}
	}

	static class ResultsSectionBuilderExample extends ResultsSectionBuilder {
		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Results Section Example");
		}

		@Override
		public ArrayBuilder<Organizer> getOrganizerBuilder() {

			return new ArrayBuilder<Organizer>() {

				@Override
				public List<Organizer> construct() {

					ArrayList<Organizer> organizers = new ArrayList<Organizer>();

					ResultOrganizer resultOrganizer = CCDFactory.eINSTANCE.createResultOrganizer().init();

					ResultObservation resultObservation = CCDFactory.eINSTANCE.createResultObservation().init();

					resultOrganizer.addObservation(resultObservation);

					organizers.add(resultOrganizer);

					return organizers;
				}

			};
		}

	}

	static class ProblemSectionBuilderExample extends ProblemSectionBuilder {

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Problem Section Example");
		}

		@Override
		public ArrayBuilder<Observation> getObservationBuilder() {
			return new ArrayBuilder<Observation>() {

				@Override
				public List<Observation> construct() {

					ArrayList<Observation> observations = new ArrayList<Observation>();

					ProblemStatusObservation problemStatus = CCDFactory.eINSTANCE.createProblemStatusObservation().init();

					ProblemHealthStatusObservation problemHealthStatus = CCDFactory.eINSTANCE.createProblemHealthStatusObservation().init();

					EpisodeObservation episodeObservation = CCDFactory.eINSTANCE.createEpisodeObservation().init();

					observations.add(problemStatus);

					observations.add(problemHealthStatus);

					observations.add(episodeObservation);

					return observations;
				}

			};
		}

		@Override
		public ArrayBuilder<ProblemAct> getProblemActBuilder() {
			return new ArrayBuilder<ProblemAct>() {

				@Override
				public List<ProblemAct> construct() {

					ArrayList<ProblemAct> problemActs = new ArrayList<ProblemAct>();

					ProblemAct problemAct = CCDFactory.eINSTANCE.createProblemAct().init();

					ProblemObservation problemObservation = CCDFactory.eINSTANCE.createProblemObservation().init();

					problemAct.addObservation(problemObservation);

					problemActs.add(problemAct);

					return problemActs;
				}

			};
		}

	}

	public static void main(String[] args) {

		DocumentBuilder exampleClinicalDocumentBuilder = new DocumentBuilder() {

			@Override
			public ProblemListSectionBuilder getProblemListSectionBuilder() {
				return new ProblemListSectionBuilderExample();
			}

			@Override
			public ResultsSectionBuilder getResultsSectionBuilder() {
				return new ResultsSectionBuilderExample();
			}

			// @Override
			// public ProblemSectionBuilder getProblemSectionBuilder() {
			// return new ProblemSectionBuilderExample();
			// }

			@Override
			public Builder<II> getDocumentIdBuilder() {
				return new BuilderUtil.BuildII("2.16.840.1.113883.19.4", "c266");
			}

			@Override
			public Builder<TS> getDocumentEffectiveTimeBuilder() {
				return new BuilderUtil.BuildEffectiveTime();
			}

			@Override
			public ArrayBuilder<Author> getAuthorBuilder() {
				return new BuildAuthor("Bob", "Dolin", "MD");
			}

			@Override
			public Builder<PatientRole> getPatientRoleBuilder() {
				return new BuilderUtil.BuildPatientRole("2.16.840.1.113883.19.5");
			}

			@Override
			public Builder<Patient> getPatientBuilder() {
				return new BuildPatient("Henry", "Levin", "7th", "19320924", "M");
			}

		};

		try {
			CDAUtil.save(exampleClinicalDocumentBuilder.buildDocument(), System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
