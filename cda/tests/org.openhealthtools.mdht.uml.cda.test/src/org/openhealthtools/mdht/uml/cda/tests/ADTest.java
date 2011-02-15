/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.tests;

import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.Birthplace;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Component3;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.Place;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StructuredBody;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ADXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.BL;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CR;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.EN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ENXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassSupply;
import org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartQualifier;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartType;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNameUse;
import org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse;
import org.openhealthtools.mdht.uml.hl7.vocab.SetOperator;
import org.openhealthtools.mdht.uml.hl7.vocab.TelecommunicationAddressUse;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;

public class ADTest 
{
	public static void main(String[] args) throws Exception 
	{
		ClinicalDocument doc = CDAFactory.eINSTANCE.createClinicalDocument();
		
		InfrastructureRootTypeId typeId = CDAFactory.eINSTANCE.createInfrastructureRootTypeId();
		typeId.setExtension("POCD_HD000040");
		doc.setTypeId(typeId);
		
		II id = DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.19.4", "c266");
		doc.setId(id);
		
		II templateId = DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.27.1776");
		doc.getTemplateIds().add(templateId);
		
		CE code = DatatypesFactory.eINSTANCE.createCE("11488-4", "2.16.840.1.113883.6.1", "LOINC", "Consultation note");
		doc.setCode(code);
		
		ST title = DatatypesFactory.eINSTANCE.createST("Good Health Clinic Consultation Note");
		doc.setTitle(title);
		
		TS effectiveTime = DatatypesFactory.eINSTANCE.createTS("20000407");
		doc.setEffectiveTime(effectiveTime);
		
		CE confidentialityCode = DatatypesFactory.eINSTANCE.createCE("N", "2.16.840.1.113883.5.25");
		doc.setConfidentialityCode(confidentialityCode);
		
		RecordTarget recordTarget = CDAFactory.eINSTANCE.createRecordTarget();
		doc.getRecordTargets().add(recordTarget);
		
		PatientRole patientRole = CDAFactory.eINSTANCE.createPatientRole();
		recordTarget.setPatientRole(patientRole);
		
		Patient patient = CDAFactory.eINSTANCE.createPatient();
		patientRole.setPatient(patient);
		
		PN name = DatatypesFactory.eINSTANCE.createPN();
		name.addGiven("Henry").addFamily("Levin").addSuffix("the 7th");
		patient.getNames().add(name);
		
		CE administrativeGenderCode = DatatypesFactory.eINSTANCE.createCE("M", "2.16.840.1.113883.5.1");
		patient.setAdministrativeGenderCode(administrativeGenderCode);
		
		TS birthTime = DatatypesFactory.eINSTANCE.createTS("19320924");
		patient.setBirthTime(birthTime);
		
		Birthplace birthPlace = CDAFactory.eINSTANCE.createBirthplace();
		patient.setBirthplace(birthPlace);
		
		Place place = CDAFactory.eINSTANCE.createPlace();
		birthPlace.setPlace(place);
		
		EN en = DatatypesFactory.eINSTANCE.createEN();
		place.setName(en);
		
		en.getUses().add(EntityNameUse.ABC);
		en.getUses().add(EntityNameUse.IDE);
		
		ENXP enDelimiter = DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.DEL, "TheDelimiter");
		en.getDelimiters().add(enDelimiter);
		
		ENXP enFamily =DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.FAM, "TheFamilyName");
		en.getFamilies().add(enFamily);
		
		en.addText("This text should show up between Family and Given.");
		
		ENXP enGiven = DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.GIV, "TheGivenName");
		enGiven.getQualifiers().add(EntityNamePartQualifier.AC);
		enGiven.getQualifiers().add(EntityNamePartQualifier.AD);
		en.getGivens().add(enGiven);
		
		ENXP enPrefix = DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.PFX, "ThePrefixName");
		en.getPrefixes().add(enPrefix);
		
		ENXP enSuffix = DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.SFX, "TheSuffixName");
		en.getSuffixes().add(enSuffix);
		
		IVL_TS ivlTs = DatatypesFactory.eINSTANCE.createIVL_TS();
		en.setValidTime(ivlTs);
		
		IVXB_TS ivxbTs = DatatypesFactory.eINSTANCE.createIVXB_TS();
		ivlTs.setHigh(ivxbTs);
		ivxbTs.setValue("201101011000");
		
		Organization providerOrganization = CDAFactory.eINSTANCE.createOrganization();
		providerOrganization.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.19.5"));
		patientRole.setProviderOrganization(providerOrganization);
		
		Author author = CDAFactory.eINSTANCE.createAuthor();
		author.setTime(DatatypesFactory.eINSTANCE.createTS("2000040714"));
		doc.getAuthors().add(author);
		
		AssignedAuthor assignedAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();
		assignedAuthor.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.19.5", "KP00017"));
		author.setAssignedAuthor(assignedAuthor);
		
		AD address = DatatypesFactory.eINSTANCE.createAD();
		assignedAuthor.getAddrs().add(address);
		address.getUses().add(PostalAddressUse.ABC);
		address.getUses().add(PostalAddressUse.DIR);
		address.setIsNotOrdered(false);

		ADXP delimeter = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DEL, "TheDelimeter");
		address.getDelimiters().add(delimeter);
		ADXP country = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CNT, "USA");
		address.getCounties().add(country);
		ADXP state = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STA, "VA");
		address.getStates().add(state);
		ADXP county = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CPA, "Fairfax");
		address.getCounties().add(county);
		ADXP city = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CTY, "Chantilly");
		address.getCities().add(city);
		ADXP postalCode = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ZIP, "60111");
		address.getPostalCodes().add(postalCode);
		ADXP streetAddressLine = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.SAL, "100 Sully Road");
		address.getStreetAddressLines().add(streetAddressLine);
		ADXP houseNumber = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.BNR, "100");
		address.getHouseNumbers().add(houseNumber);
		ADXP houseNumberNumeric = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.BNN, "100");
		address.getHouseNumberNumerics().add(houseNumberNumeric);
		ADXP direction = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DIR, "TheDirection");
		address.getDirections().add(direction);
		ADXP streetName = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STR, "Sully Road");
		address.getStreetNames().add(streetName);
		ADXP streetNameBase = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STB, "TheStreetNameBase");
		address.getStreetNameBases().add(streetNameBase);
		ADXP streetNameType = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STTYP, "TheStreetNameType");
		address.getStreetNameTypes().add(streetNameType);
		ADXP additionalLocator = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "TheAdditionalLocator");
		address.getAdditionalLocators().add(additionalLocator);
		ADXP unitId = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.UNID, "TheUnitId");
		address.getUnitIDs().add(unitId);
		ADXP unitType = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.UNIT, "TheUnitType");
		address.getUnitTypes().add(unitType);
		ADXP careOf = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CAR, "TheCareOf");
		address.getCareOfs().add(careOf);
		ADXP censusTract = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CEN, "TheCensusTract");
		address.getCensusTracts().add(censusTract);
		
		// Put some mixed content in to make sure it shows up in the correct place.
		//-------------------------------------------------------------------------
		address.addText("Some text that should immediately precede deliveryAddressLine");
		
		ADXP deliveryAddressLine = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DAL, "TheDeliveryAddressLine");
		address.getDeliveryAddressLines().add(deliveryAddressLine);
		ADXP deliveryInstallationType = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DINST, "TheDeliveryInstallationType");
		address.getDeliveryInstallationTypes().add(deliveryInstallationType);
		ADXP deliveryInstallationArea = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DINSTA, "TheDeliveryInstallationArea");
		address.getDeliveryInstallationAreas().add(deliveryInstallationArea);
		ADXP deliveryInstallQual = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DINSTQ, "TheDeliveryInstallationQualification");
		address.getDeliveryInstallationQualifiers().add(deliveryInstallQual);
		ADXP deliveryMode = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DMOD, "TheDeliveryMode");
		address.getDeliveryModes().add(deliveryMode);
		ADXP deliveryModeIdentifier = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DMODID, "TheDeliveryModeIdentifier");
		address.getDeliveryModeIdentifiers().add(deliveryModeIdentifier);
		ADXP buildingNumberSuffix = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.BNS, "TheBuildingNumberSuffix");
		address.getBuildingNumberSuffixes().add(buildingNumberSuffix);
		ADXP postBox = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.POB, "100");
		address.getPostBoxes().add(postBox);
		ADXP precinct = DatatypesFactory.eINSTANCE.createADXP(AddressPartType.PRE, "ThePrecinct");
		address.getPrecincts().add(precinct);

		// in order for this to serialize properly, this must come after setting the ADXP values.  If it
		// is placed before or in the middle of those, then it will show up in the wrong place in the 
		// serialized XML.
		//------------------------------------------------------------------------------------------------
		SXCM_TS useablePeriod1 = DatatypesFactory.eINSTANCE.createSXCM_TS();
		address.getUseablePeriods().add(useablePeriod1);
		useablePeriod1.setValue("200004071400");
		useablePeriod1.setOperator(SetOperator.A);
		
		TEL tel = DatatypesFactory.eINSTANCE.createTEL();
		assignedAuthor.getTelecoms().add(tel);
		tel.getUses().add(TelecommunicationAddressUse.AS);
		tel.getUses().add(TelecommunicationAddressUse.DIR);
		
		Person assignedPerson = CDAFactory.eINSTANCE.createPerson();
		assignedAuthor.setAssignedPerson(assignedPerson);
		
		name = DatatypesFactory.eINSTANCE.createPN();
		name.addGiven("Bob").addFamily("Dolin").addSuffix("MD");
		assignedPerson.getNames().add(name);
		
		Component2 component2 = CDAFactory.eINSTANCE.createComponent2();
		doc.setComponent(component2);
		
		StructuredBody structuredBody = CDAFactory.eINSTANCE.createStructuredBody();
		component2.setStructuredBody(structuredBody);
		
		Component3 component3 = CDAFactory.eINSTANCE.createComponent3();
		structuredBody.getComponents().add(component3);
		
		Section section = CDAFactory.eINSTANCE.createSection();
		component3.setSection(section);
		
		Entry entry = CDAFactory.eINSTANCE.createEntry();
		section.getEntries().add(entry);
		
		Supply supply = CDAFactory.eINSTANCE.createSupply();
		entry.setSupply(supply);
		CD cd = DatatypesFactory.eINSTANCE.createCD();
		supply.setCode(cd);
		CR qualifier = DatatypesFactory.eINSTANCE.createCR();
		cd.getQualifiers().add(qualifier);
		
		supply.setClassCode(ActClassSupply.SPLY);
		supply.setMoodCode(x_DocumentSubstanceMood.EVN);
		BL bl = DatatypesFactory.eINSTANCE.createBL();
		supply.setIndependentInd(bl);
		bl.setValue(true);
		
		System.out.println("***** Constructed example *****");
		CDAUtil.save(doc, System.out);
		System.out.println();
	}
}
