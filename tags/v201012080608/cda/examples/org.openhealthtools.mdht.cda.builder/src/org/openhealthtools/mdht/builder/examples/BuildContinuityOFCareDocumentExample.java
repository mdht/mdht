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

import org.openhealthtools.mdht.builder.ccd.ContinuitOfCareDocumentBuilder;
import org.openhealthtools.mdht.builder.ccd.helpers.BuildPatient;
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

		ContinuitOfCareDocumentBuilder exampleClinicalDocumentBuilder = new ContinuitOfCareDocumentBuilder() {
			
			
			

			@Override
			public ResultsSectionDirector getResultsSectionDirector() {
				return new ResultsSectionDirector() {

					@Override
					public List<Organizer> buildOrganizers() {

								ArrayList<Organizer> organizers = new ArrayList<Organizer>();

								ResultOrganizer resultOrganizer = CCDFactory.eINSTANCE.createResultOrganizer().init();

								ResultObservation resultObservation = CCDFactory.eINSTANCE.createResultObservation().init();

								resultOrganizer.addObservation(resultObservation);

								organizers.add(resultOrganizer);

								return organizers;
					}

				};
			}

			@Override
			public ProblemSectionDirector getProblemSectionDirector() {
				return new ProblemSectionDirector() {

					@Override
					public List<Observation> buildObservations() {

								ArrayList<Observation> observations = new ArrayList<Observation>();

								ProblemStatusObservation problemStatus = CCDFactory.eINSTANCE.createProblemStatusObservation().init();

								ProblemHealthStatusObservation problemHealthStatus = CCDFactory.eINSTANCE.createProblemHealthStatusObservation().init();

								EpisodeObservation episodeObservation = CCDFactory.eINSTANCE.createEpisodeObservation().init();

								observations.add(problemStatus);

								observations.add(problemHealthStatus);

								observations.add(episodeObservation);

								return observations;
					}

					@Override
					public List<ProblemAct> buildProblemActs() {

								ArrayList<ProblemAct> problemActs = new ArrayList<ProblemAct>();

								ProblemAct problemAct = CCDFactory.eINSTANCE.createProblemAct().init();

								ProblemObservation problemObservation = CCDFactory.eINSTANCE.createProblemObservation().init();

								problemAct.addObservation(problemObservation);

								problemActs.add(problemAct);

								return problemActs;
					}

				};
			}

			@Override
			public II buildDocumentId() {
				return new BuilderUtil.BuildII("2.16.840.1.113883.19.4", "c266").construct();
			}

			@Override
			public TS buildDocumentEffectiveTime() {
				return new BuilderUtil.BuildEffectiveTime().construct();
			}

			@Override
			public List<Author> buildAuthors() {
				return new BuildAuthor("Bob", "Dolin", "MD").construct();
			}

			@Override
			public Patient buildPatient() {
				return new BuildPatient("Henry", "Levin", "7th", "19320924", "M").construct();
			}

		};

		try {
			CDAUtil.save(exampleClinicalDocumentBuilder.buildDocument(), System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
