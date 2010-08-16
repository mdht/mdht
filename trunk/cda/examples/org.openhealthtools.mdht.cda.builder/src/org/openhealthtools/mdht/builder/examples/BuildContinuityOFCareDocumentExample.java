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

import org.openhealthtools.mdht.builder.ccd.DocumentBuilder;
import org.openhealthtools.mdht.builder.ccd.helpers.BuildPatient;
import org.openhealthtools.mdht.builder.cda.ArrayBuilder;
import org.openhealthtools.mdht.builder.cda.Builder;
import org.openhealthtools.mdht.builder.cda.helpers.BuildAuthor;
import org.openhealthtools.mdht.builder.cda.helpers.BuilderUtil;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

public class BuildContinuityOFCareDocumentExample {

	public static void main(String[] args) {

		DocumentBuilder exampleClinicalDocumentBuilder = new DocumentBuilder() {

			@Override
			public ResultsSectionBuilder getResultsSectionBuilder() {
				return new ResultsSectionBuilder() {

					@Override
					public ArrayBuilder<Organizer> getOrganizerBuilder() {

						return new ArrayBuilder<Organizer>() {

							@Override
							public ArrayList<Organizer> construct() {

								ArrayList<Organizer> organizers = new ArrayList<Organizer>();

								ResultOrganizer resultOrganizer = CCDFactory.eINSTANCE.createResultOrganizer().init();

								ResultObservation resultObservation = CCDFactory.eINSTANCE.createResultObservation().init();

								resultOrganizer.addObservation(resultObservation);

								organizers.add(resultOrganizer);

								return organizers;
							}

						};
					}

				};
			}

			@Override
			public ProblemSectionBuilder getProblemSectionBuilder() {
				return new ProblemSectionBuilder() {

					@Override
					public ArrayBuilder<Observation> getObservationBuilder() {
						return new ArrayBuilder<Observation>() {

							@Override
							public ArrayList<Observation> construct() {

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
							public ArrayList<ProblemAct> construct() {

								ArrayList<ProblemAct> problemActs = new ArrayList<ProblemAct>();

								ProblemAct problemAct = CCDFactory.eINSTANCE.createProblemAct().init();

								ProblemObservation problemObservation = CCDFactory.eINSTANCE.createProblemObservation().init();

								problemAct.addObservation(problemObservation);

								problemActs.add(problemAct);

								return problemActs;
							}

						};
					}

				};
			}

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
