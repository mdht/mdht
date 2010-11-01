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

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.openhealthtools.mdht.builder.hitsp.C32DocumentBuilder;
import org.openhealthtools.mdht.builder.hitsp.PatientSummaryBuilder;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * C32Example is an example implementation of the MDHT DocumentBuilder based on
 * the GOF BuilderPattern. see http://en.wikipedia.org/wiki/Builder_pattern
 * 
 * The DocumentBuilder orchestrates the various CDA Builder components in order
 * to build a complete CDA document. The DocumentBuilder provides default
 * behavior requiring only the need to override the builder you need to created
 * the document while ignoring others.
 * 
 * 
 * This example uses C32DocumentBuilder which creates the minimum structures to
 * create valid (no errors) C32 V2.5
 * 
 */
public class C32EncountersExample {

	public static void main(String[] args) {

		/*
		 * Define and override various builders
		 */
		PatientSummaryBuilder c32EncountersExample = new C32DocumentBuilder() {

			@Override
			public EncoutersSectionDirector getEncoutersSection() {
				return new EncoutersSectionDirector() {

					public List<Encounter> buildEncounters() {

						ArrayList<Encounter> encounters = new ArrayList<Encounter>();

						EncountersActivity encountersActivity = CCDFactory.eINSTANCE.createEncountersActivity().init();

						encountersActivity.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.88.11.83.16"));

						encountersActivity.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("1.3.6.1.4.1.19376.1.5.3.1.4.14"));

						encountersActivity.getIds().add(DatatypesFactory.eINSTANCE.createII(java.util.UUID.randomUUID().toString()));

						encountersActivity.setText(DatatypesFactory.eINSTANCE.createED("Required Text"));

						encounters.add(encountersActivity);

						return encounters;

					}

				};
			}

		};

		try {

			System.out.println("Start C32 Document Build Example");

			ClinicalDocument clinicalDocument = c32EncountersExample.buildDocument();

			CDAUtil.save(clinicalDocument, new FileOutputStream("ExampleC32Encounters.xml"));

			System.out.println("Completed C32 Document Build Example");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
