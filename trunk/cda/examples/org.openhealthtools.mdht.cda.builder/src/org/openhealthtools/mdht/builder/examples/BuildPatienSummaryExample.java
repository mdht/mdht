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


public class BuildPatienSummaryExample {
//
//	static class ProblemListSectionBuilderExample extends ProblemListSectionBuilder {
//		@Override
//		public ST buildSectionTitle() {
//			return new BuilderUtil.BuildST("Problem List Section Example");
//		}
//
//		@Override
//		public ArrayBuilder<Act> getActBuilder() {
//			return new ArrayBuilder<Act>() {
//
//				@Override
//				public List<Act> construct() {
//					ArrayList<Act> acts = new ArrayList<Act>();
//
//					Condition condition = HITSPFactory.eINSTANCE.createCondition().init();
//					condition.getIds().add(DatatypesFactory.eINSTANCE.createII("ec8a6ff8-ed4b-4f7e-82c3-e98e58b45de7"));
//
//					IVL_TS effectiveTime = DatatypesFactory.eINSTANCE.createIVL_TS();
//					effectiveTime.setLow(BuilderUtil.getTS_UNK());
//					condition.setEffectiveTime(effectiveTime);
//
//					ConditionEntry problemEntry = condition.createConditionEntry();
//					problemEntry.getIds().add(DatatypesFactory.eINSTANCE.createII("ab1791b0-5c71-11db-b0de-0800200c9a66"));
//					problemEntry.setCode(DatatypesFactory.eINSTANCE.createCD("64572001", "2.16.840.1.113883.6.96", "SNOMED-CT", "Condition"));
//					problemEntry.getValues().add(DatatypesFactory.eINSTANCE.createCD("233604007", "2.16.840.1.113883.6.96", "SNOMED-CT", "Pneumonia"));
//					effectiveTime = DatatypesFactory.eINSTANCE.createIVL_TS("199701", null);
//					effectiveTime.setHigh(BuilderUtil.getTS_UNK());
//					problemEntry.setEffectiveTime(effectiveTime);
//
//					ProblemHealthStatusObservation healthStatus = CCDFactory.eINSTANCE.createProblemHealthStatusObservation().init();
//					problemEntry.addObservation(healthStatus);
//					CE healthStatusValue = DatatypesFactory.eINSTANCE.createCE("xyz", "2.16.840.1.113883.1.11.20.12", "ProblemHealthStatusCode", null);
//					healthStatusValue.setCodeSystemVersion("20061017");
//					healthStatus.getValues().add(healthStatusValue);
//
//					acts.add(condition);
//
//					return acts;
//				}
//
//			};
//		}
//	}
//
//	static class ResultsSectionBuilderExample extends ResultsSectionBuilder {
//		@Override
//		public ST buildSectionTitle() {
//			return new BuilderUtil.BuildST("Results Section Example");
//		}
//
//		@Override
//		public List<Organizer> buildOrganizers() {
//
//			return new ArrayBuilder<Organizer>() {
//
//				@Override
//				public List<Organizer> construct() {
//
//					ArrayList<Organizer> organizers = new ArrayList<Organizer>();
//
//					ResultOrganizer resultOrganizer = CCDFactory.eINSTANCE.createResultOrganizer().init();
//
//					ResultObservation resultObservation = CCDFactory.eINSTANCE.createResultObservation().init();
//
//					resultOrganizer.addObservation(resultObservation);
//
//					organizers.add(resultOrganizer);
//
//					return organizers;
//				}
//
//			};
//		}
//
//	}
//
//	static class ProblemSectionBuilderExample extends ProblemSectionBuilder {
//
//		@Override
//		public ST buildSectionTitle() {
//			return new BuilderUtil.BuildST("Problem Section Example");
//		}
//
//		@Override
//		public List<Observation> buildObservations() {
//			return new ArrayBuilder<Observation>() {
//
//				@Override
//				public List<Observation> construct() {
//
//					ArrayList<Observation> observations = new ArrayList<Observation>();
//
//					ProblemStatusObservation problemStatus = CCDFactory.eINSTANCE.createProblemStatusObservation().init();
//
//					ProblemHealthStatusObservation problemHealthStatus = CCDFactory.eINSTANCE.createProblemHealthStatusObservation().init();
//
//					EpisodeObservation episodeObservation = CCDFactory.eINSTANCE.createEpisodeObservation().init();
//
//					observations.add(problemStatus);
//
//					observations.add(problemHealthStatus);
//
//					observations.add(episodeObservation);
//
//					return observations;
//				}
//
//			};
//		}
//
//		@Override
//		public ArrayBuilder<ProblemAct> getProblemActBuilder() {
//			return new ArrayBuilder<ProblemAct>() {
//
//				@Override
//				public List<ProblemAct> construct() {
//
//					ArrayList<ProblemAct> problemActs = new ArrayList<ProblemAct>();
//
//					ProblemAct problemAct = CCDFactory.eINSTANCE.createProblemAct().init();
//
//					ProblemObservation problemObservation = CCDFactory.eINSTANCE.createProblemObservation().init();
//
//					problemAct.addObservation(problemObservation);
//
//					problemActs.add(problemAct);
//
//					return problemActs;
//				}
//
//			};
//		}
//
//	}
//
//	public static void main(String[] args) {
//
//		DocumentBuilder exampleClinicalDocumentBuilder = new DocumentBuilder() {
//
//			@Override
//			public ProblemListSectionBuilder getProblemListSectionBuilder() {
//				return new ProblemListSectionBuilderExample();
//			}
//
//			@Override
//			public ResultsSectionBuilder getResultsSectionBuilder() {
//				return new ResultsSectionBuilderExample();
//			}
//
//			// @Override
//			// public ProblemSectionBuilder getProblemSectionDirector() {
//			// return new ProblemSectionBuilderExample();
//			// }
//
//			@Override
//			public II buildDocumentId() {
//				return new BuilderUtil.BuildII("2.16.840.1.113883.19.4", "c266");
//			}
//
//			@Override
//			public TS buildDocumentEffectiveTime() {
//				return new BuilderUtil.BuildEffectiveTime();
//			}
//
//			@Override
//			public List<Author> buildAuthors() {
//				return new BuildAuthor("Bob", "Dolin", "MD");
//			}
//
//			@Override
//			public PatientRole buildPatientRole() {
//				return new BuilderUtil.BuildPatientRole("2.16.840.1.113883.19.5");
//			}
//
//			@Override
//			public Patient buildPatient() {
//				return new BuildPatient("Henry", "Levin", "7th", "19320924", "M");
//			}
//
//		};
//
//		try {
//			CDAUtil.save(exampleClinicalDocumentBuilder.buildDocument(), System.out);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
}
