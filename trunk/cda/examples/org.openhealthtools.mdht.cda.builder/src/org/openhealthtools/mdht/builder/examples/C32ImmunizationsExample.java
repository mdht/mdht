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
import org.openhealthtools.mdht.builder.hitsp.DocumentBuilder;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Material;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.Immunization;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

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

public class C32ImmunizationsExample {

	public static void main(String[] args) {

		/*
		 * Define and override various builders
		 */
		DocumentBuilder exampleHITSPC32 = new C32DocumentBuilder() {

			@Override
			public ImmunizationsSectionDirector getImmunizationsSectionDirector() {
				return new ImmunizationsSectionDirector() {

					@Override
					public List<SubstanceAdministration> buildSubstanceAdministrations() {
						
								ArrayList<SubstanceAdministration> immunizations = new ArrayList<SubstanceAdministration>();

								Immunization immunization = HITSPFactory.eINSTANCE.createImmunization().init();

								immunization.setNegationInd(false);

								immunization.getIds().add(DatatypesFactory.eINSTANCE.createII(java.util.UUID.randomUUID().toString()));

								immunization.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								SXCM_TS effectiveTime = DatatypesFactory.eINSTANCE.createSXCM_TS();

								effectiveTime.setNullFlavor(NullFlavor.UNK);

								immunization.getEffectiveTimes().add(effectiveTime);

								immunization.setCode(DatatypesFactory.eINSTANCE.createCD("IMMUNIZ", "2.16.840.1.113883.5.4", "ActCode", ""));

								Consumable consumable = CDAFactory.eINSTANCE.createConsumable();

								Product product = IHEFactory.eINSTANCE.createProductEntry().init();

								Material material = CDAFactory.eINSTANCE.createMaterial();

								material.setCode(DatatypesFactory.eINSTANCE.createCE());

								material.getCode().setOriginalText(DatatypesFactory.eINSTANCE.createED("Required Text"));

								// material.getCode().getTranslations().add(BuilderUtil.createCDCCVXCE(translationCode));

								product.setManufacturedMaterial(material);

								consumable.setManufacturedProduct(product);

								immunization.setConsumable(consumable);

								immunizations.add(immunization);

								return immunizations;
						
					}

				};
			}

		};

		try {

			System.out.println("Start C32 Document Build Example");

			ClinicalDocument clinicalDocument = exampleHITSPC32.buildDocument();

			CDAUtil.save(clinicalDocument, new FileOutputStream("ExampleC32Immunizations.xml"));

			System.out.println("Completed C32 Document Build Example");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
