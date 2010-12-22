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

import org.openhealthtools.mdht.builder.cda.helpers.BuilderUtil;
import org.openhealthtools.mdht.builder.hitsp.C32DocumentBuilder;
import org.openhealthtools.mdht.builder.hitsp.PatientSummaryBuilder;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Criterion;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Material;
import org.openhealthtools.mdht.uml.cda.Precondition;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.Medication;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipType;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

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

/*
 * 					<entry typeCode="DRIV">
						<substanceAdministration classCode="SBADM" moodCode="EVN">
							<templateId root="2.16.840.1.113883.10.20.1.24" assigningAuthorityName="CCD"/>
							<templateId root="1.3.6.1.4.1.19376.1.5.3.1.4.7.1" assigningAuthorityName="IHE PCC"/>
							<!--Medication activity template -->
							<id root="cdbd33f0-6cde-11db-9fe1-0800200c9a66"/>
							<statusCode code="active"/>
							<effectiveTime xsi:type="IVL_TS">
								<low value="2005"/>
								<high nullFlavor="UNK"/>
							</effectiveTime>
							<effectiveTime xsi:type="PIVL_TS">
								<period value="6" unit="h"/>
							</effectiveTime>
							<routeCode code="IPINHL" codeSystem="2.16.840.1.113883.5.112" codeSystemName="HL7 RouteOfAdministration" displayName="Inhalation, oral">
								<!--IHE/PCC recommends that the routeCode be taken from the HL7 RouteOfAdministration code system. However, HITSP/C32, C83 and C80 recommend that for the U.S. Realm it be taken from the FDA RouteOfAdministration code system.-->
								<translation/>
							</routeCode>
							<doseQuantity value="2"/>
							<administrationUnitCode code="415215001" codeSystem="2.16.840.1.113883.6.96" displayName="Puff"/>
							<consumable>
								<manufacturedProduct>
									<templateId root="2.16.840.1.113883.10.20.1.53"/>
									<!-- Product template -->
									<manufacturedMaterial>
										<code code="307782" codeSystem="2.16.840.1.113883.6.88" displayName="Albuterol 0.09 MG/ACTUAT inhalant solution" codeSystemName="RxNorm">
											<originalText>Albuterol inhalant</originalText>
										</code>
									</manufacturedMaterial>
								</manufacturedProduct>
							</consumable>
							
							        <observation classCode="OBS" moodCode="EVN">
                  <templateId root="2.16.840.1.113883.10.20.1.57"/>
                  <templateId root="2.16.840.1.113883.10.20.1.47"/>
                  <code code="33999-4" codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC" displayName="Status"/>
                  <statusCode code="completed"/>
                  <value xsi:type="CE" code="55561003" codeSystem="2.16.840.1.113883.6.96" codeSystemName="" displayName="Active"/>
                </observation>
              </entryRelationship>
              
							<entryRelationship typeCode="REFR">
								<observation classCode="OBS" moodCode="EVN">
									<templateId root="2.16.840.1.113883.10.20.1.47"/>
									<code code="33999-4" displayName="Status" codeSystem="2.16.840.1.113883.6.1" codeSystemName="LOINC"/>
									<value xsi:type="CE" code="55561003" displayName="Active" codeSystem="2.16.840.1.113883.6.96" codeSystemName="SNOMED CT"/>
								</observation>
							</entryRelationship>
							<precondition typeCode="PRCN">
								<criterion>
									<code code="ASSERTION" codeSystem="2.16.840.1.113883.5.4"/>
									<value xsi:type="CE" code="56018004" codeSystem="2.16.840.1.113883.6.96" displayName="Wheezing"/>
								</criterion>
							</precondition>
						</substanceAdministration>
					</entry>

 */

public class C32MedicationsExample {
	
	
	public static class ActiveMedicationBuilder extends MedicationBuilder
	{

		@Override
		Medication build() {
			
			EntryRelationship status = CDAFactory.eINSTANCE.createEntryRelationship();

			status.setTypeCode(x_ActRelationshipEntryRelationship.REFR);

			MedicationStatusObservation observationStatus = CCDFactory.eINSTANCE.createMedicationStatusObservation().init();

			observationStatus.getValues().add(DatatypesFactory.eINSTANCE.createCE("55561003", "2.16.840.1.113883.6.96", "", "Active"));

			status.setObservation(observationStatus);
			
			sa.getEntryRelationships().add(status);

			
			return super.build();
		}
		
	}
	
	public static class MedicationBuilder 
	{
		Medication sa = IHEFactory.eINSTANCE.createMedication().init();
		
		MedicationBuilder addId(String value)
		{
			
			sa.getIds().add(DatatypesFactory.eINSTANCE.createII(value));
			
			return this;
		}

		MedicationBuilder setHL7RouteCode(String code,String displayName)
		{

			sa.setRouteCode(DatatypesFactory.eINSTANCE.createCE(code, "2.16.840.1.113883.5.112", "HL7 RouteOfAdministration", displayName));
			
			return this;
		}

		MedicationBuilder setSNOMEDAdministrationUnitCode(String code,String displayName)
		{
			sa.setAdministrationUnitCode(DatatypesFactory.eINSTANCE.createCE(code, "2.16.840.1.113883.6.96", "", displayName));
			
			return this;
		}
		
		MedicationBuilder setRouteCode(CE value)
		{
			sa.setRouteCode(value);
			
			return this;
		}
		
		MedicationBuilder addEffectiveTime(SXCM_TS value)
		{
			
			sa.getEffectiveTimes().add(value);
			
			return this;
		}
		
		MedicationBuilder setConsumable(Consumable consumable )
		{
			sa.setConsumable(consumable);
			return this;
		}
		
		MedicationBuilder setDose(double value)
		{
			IVL_PQ doseQuantity = DatatypesFactory.eINSTANCE.createIVL_PQ();

			doseQuantity.setValue(value);

			sa.setDoseQuantity(doseQuantity);
			
			return this;
		}
		
		Medication build() {
			// mimic a GUID
			sa.getIds().add(DatatypesFactory.eINSTANCE.createII(java.util.UUID.randomUUID().toString()));

			sa.setStatusCode(DatatypesFactory.eINSTANCE.createCS("active"));

			return sa;
		}
		
		MedicationBuilder addSNOMEDPrecondition(String code,String displayName)
		
		{
			
			Precondition precondition = CDAFactory.eINSTANCE.createPrecondition();

			precondition.setTypeCode(ActRelationshipType.PRCN);

			Criterion criterion = CDAFactory.eINSTANCE.createCriterion();

			criterion.setCode(DatatypesFactory.eINSTANCE.createCD("ASSERTION", "2.16.840.1.113883.5.4", null, null));

//			BuilderUtil.buildSNOMEDCE("56018004", "Wheezing"));
			
			criterion.setValue(DatatypesFactory.eINSTANCE.createCE(code, "2.16.840.1.113883.6.96", "SNOMED-CT", displayName)); //BuilderUtil.buildSNOMEDCE("56018004", "Wheezing"));

			precondition.setCriterion(criterion);					
			
			sa.getPreconditions().add(precondition);
			
			return this;
		}
	}
	
	public static class RXNormConsumableBuilder extends ConsumableBuilder
	{

		@Override
		Consumable build() {
			setRXCodeSystem("2.16.840.1.113883.6.88");
			setRXCodeSystemName("RxNorm");
			return super.build();
		}
		
	}
	public static class ConsumableBuilder
	{
		
		Consumable consumable = CDAFactory.eINSTANCE.createConsumable();

		Product product = CCDFactory.eINSTANCE.createProduct().init();

		Material material = CDAFactory.eINSTANCE.createMaterial();
		
		CE rxCode = DatatypesFactory.eINSTANCE.createCE();
		
		Consumable build() {
			
			material.setCode(rxCode);
			
			product.setManufacturedMaterial(material);

			consumable.setManufacturedProduct(product);

			return consumable;
		}
		
		ConsumableBuilder setRXCode(String code)
		{
			rxCode.setCode(code);
			return this;
		}
		
		ConsumableBuilder setRXCodeSystem(String codeSystem)
		{
			rxCode.setCodeSystem(codeSystem);
			return this;
		}
		
		ConsumableBuilder setRXCodeSystemName(String codeSystemName)
		{
			rxCode.setCodeSystemName(codeSystemName);
			return this;
		}
		
		ConsumableBuilder setRXDisplayName(String displayName)
		{
			rxCode.setDisplayName(displayName);
			return this;
		}

		ConsumableBuilder setRXOriginalText(String originalText)
		{
			rxCode.setOriginalText(DatatypesFactory.eINSTANCE.createED(originalText));
			
			return this;
		}

	}
	
	public static IntervalTSBuilder getIntervalTSBuilder()
	{
		return new IntervalTSBuilder();
	}
	
	public static PeriodTSBuilder getPeriodTSBuilder()
	{
		return new PeriodTSBuilder();
	}
	
	public static ConsumableBuilder getConsumableBuilder()
	{
		return new ConsumableBuilder();
	}
	
	public static ConsumableBuilder getRXNormConsumableBuilder()
	{
		return new RXNormConsumableBuilder();
	}
	
	public static class PeriodTSBuilder
	{
		PIVL_TS pts = DatatypesFactory.eINSTANCE.createPIVL_TS();

		PQ pq = DatatypesFactory.eINSTANCE.createPQ();
		
		PeriodTSBuilder()
		{
			pts.setPeriod(pq);		
		}
		
		PeriodTSBuilder setValue(double value)
		{
			pq.setValue(value);		
			return this;
		}
		
		PeriodTSBuilder setUnit(String value)
		{
			pq.setUnit(value);
			
			return this;
		}
	
		PIVL_TS build()
		{
			return pts;
		}
		
	}
	
	public static class IntervalTSBuilder
	{
		IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
		
		IntervalTSBuilder setLow(String value)
		{
			IVXB_TS lowValue = DatatypesFactory.eINSTANCE.createIVXB_TS();
			
			lowValue.setValue(value);
			
			ts.setLow(lowValue);
			
			return this;
			
		}
		
		IntervalTSBuilder setHigh(String value)
		{
			IVXB_TS highValue = DatatypesFactory.eINSTANCE.createIVXB_TS();
			
			highValue.setValue(value);
			
			ts.setHigh(highValue);
			
			return this;
			
		}
		
		
		IntervalTSBuilder setLow(NullFlavor value)
		{
			IVXB_TS lowValue = DatatypesFactory.eINSTANCE.createIVXB_TS();
			
			lowValue.setNullFlavor(value);			
			
			ts.setLow(lowValue);
			
			return this;
			
		}
		
		IntervalTSBuilder setHigh(NullFlavor value)
		{
			IVXB_TS highValue = DatatypesFactory.eINSTANCE.createIVXB_TS();
			
			highValue.setNullFlavor(value);
			
			ts.setHigh(highValue);
			
			return this;
			
		}
		
	
		
	
		IVL_TS build()
		{
			return ts;
		}
		
	}

	
	public static void main(String[] args) {

		/*
		 * Define and override various builders
		 */
		PatientSummaryBuilder exampleHITSPC32 = new C32DocumentBuilder() {

			@Override
			public MedicationsSectionDirector getMedicationsSectionDirector() {
				return new MedicationsSectionDirector()
				{

					@Override
					public List<Medication> buildMedications() {
						
						List<Medication> medications = new ArrayList<Medication> ();
										
						ActiveMedicationBuilder builder = new ActiveMedicationBuilder();
												
						builder.addId(java.util.UUID.randomUUID().toString());					
						
						builder.addEffectiveTime(getIntervalTSBuilder().setLow("2005").setHigh(NullFlavor.UNK).build());
												
						builder.addEffectiveTime(getPeriodTSBuilder().setValue(6).setUnit("h").build());
																	
						builder.setHL7RouteCode("IPINHL", "Inhalation, oral").setDose(2.0).setSNOMEDAdministrationUnitCode("415215001",  "Puff");
												
						builder.setConsumable(getRXNormConsumableBuilder().setRXCode("307782").setRXDisplayName("Albuterol 0.09 MG/ACTUAT inhalant solution").setRXOriginalText("Albuterol inhalant").build());
												
						builder.addSNOMEDPrecondition( "56018004", "Wheezing");
						
						medications.add(builder.build());

						return medications;
					}
					
				};
			}

		

		};

		try {

			System.out.println("Start C32 Document Build Example");

			ClinicalDocument clinicalDocument = exampleHITSPC32.buildDocument();

			CDAUtil.save(clinicalDocument, new FileOutputStream("ExampleC32Medications.xml"));

			System.out.println("Completed C32 Document Build Example");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
