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
package org.openhealthtools.mdht.builder.cda.helpers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

import org.openhealthtools.mdht.builder.cda.ArrayBuilder;
import org.openhealthtools.mdht.builder.cda.Builder;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse;
import org.openhealthtools.mdht.uml.hl7.vocab.TelecommunicationAddressUse;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

public class BuilderUtil {

	public static class BuildST extends Builder<ST> {
		String title;

		public BuildST(String title) {
			super();
			this.title = title;
		}

		@Override
		public ST construct() {
			return DatatypesFactory.eINSTANCE.createST(title);
		}

	}

	
	public static class BuildStrucDocText extends Builder<StrucDocText> {
		String title;

		public BuildStrucDocText(String title) {
			super();
			this.title = title;
		}

		@Override
		public StrucDocText construct() {
			
			StrucDocText strucDocText = CDAFactory.eINSTANCE.createStrucDocText();
			strucDocText.addText(title);
			return strucDocText;

		}

//		@Override
//		public ST construct() {
//			return DatatypesFactory.eINSTANCE.createST(title);
//		}

	}
	
	public static final String DATE_FORMAT_NOW = "yyyyMMdd";
	
	public static final SimpleDateFormat TSDF = new SimpleDateFormat(DATE_FORMAT_NOW);
	
	public static class BuildEffectiveTime extends Builder<TS> {
		
		String format = DATE_FORMAT_NOW;

		public BuildEffectiveTime(Calendar cal) {
			super();
			this.cal = cal;
		}

		public BuildEffectiveTime() {
			super();
			this.cal = Calendar.getInstance();
			;
		}
		
		public BuildEffectiveTime(String format) {
			super();
			this.cal = Calendar.getInstance();
			this.format = format;
		}

		Calendar cal = null;

		@Override
		public TS construct() {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return DatatypesFactory.eINSTANCE.createTS(sdf.format(cal.getTime()));
		}

	}

	protected static abstract class BuildCode<Code> extends Builder<Code> {
		String code;
		String codeSystem;
		String codeSystemName;
		String displayName;

		protected abstract Code create();

		public BuildCode(String code, String codeSystem, String codeSystemName, String displayName) {
			super();
			this.code = code;
			this.codeSystem = codeSystem;
			this.codeSystemName = codeSystemName;
			this.displayName = displayName;
		}

		@SuppressWarnings("unchecked")
		@Override
		public Code construct() {

			CD cd = (CD) create();

			cd.setCode(code);
			cd.setCodeSystem(codeSystem);
			cd.setCodeSystemName(codeSystemName);
			cd.setDisplayName(displayName);
			return (Code) cd;
		}

	}

	public static class BuildCE extends BuildCode<CE> {

		public BuildCE(String code, String codeSystem, String codeSystemName, String displayName) {
			super(code, codeSystem, codeSystemName, displayName);

		}

		@Override
		protected CE create() {
			return DatatypesFactory.eINSTANCE.createCE();
		}

	}

	public static class BuildCS extends Builder<CS> {

		String code;

		public BuildCS(String code) {
			super();
			this.code = code;
		}

		@Override
		public CS construct() {
			return DatatypesFactory.eINSTANCE.createCS(code);
		}

	}

	public static final Builder<INT> BuilderVersion = new Builder<INT>() {

		@Override
		public INT construct() {
			INT version = DatatypesFactory.eINSTANCE.createINT();
			version.setValue(1);
			return version;
		}

	};

	// public static class BuildCD extends Builder<CD> {
	//
	// String code;
	// String codeSystem;
	// String codeSystemName;
	// String displayName;
	//
	// public BuildCD(String code, String codeSystem, String codeSystemName,
	// String displayName) {
	// super();
	// this.code = code;
	// this.codeSystem = codeSystem;
	// this.codeSystemName = codeSystemName;
	// this.displayName = displayName;
	// }
	//
	// protected CD create()
	// {
	// return DatatypesFactory.eINSTANCE.createCD();
	// }
	//
	// @Override
	// public CD construct() {
	//
	// CD cd = create();
	//
	// cd.setCode(code);
	// cd.setCodeSystem(codeSystem);
	// cd.setCodeSystemName(codeSystemName);
	// cd.setDisplayName(displayName);
	//
	// // TODO Auto-generated method stub
	// return super.construct();
	// }
	//
	// }

	// public static class BuildCE extends Builder<CE> {
	//
	// String code;
	// String codeSystem;
	// String codeSystemName;
	// String displayName;
	//
	// public BuildCE(String code, String codeSystem, String codeSystemName,
	// String displayName) {
	// super();
	// this.code = code;
	// this.codeSystem = codeSystem;
	// this.codeSystemName = codeSystemName;
	// this.displayName = displayName;
	// }
	//
	//
	// @Override
	// public CE construct() {
	//
	// CE ce = DatatypesFactory.eINSTANCE.createCE();;
	//
	// ce.setCode(code);
	// ce.setCodeSystem(codeSystem);
	// ce.setCodeSystemName(codeSystemName);
	// ce.setDisplayName(displayName);
	//
	// return ce;
	// }
	//
	// }

	public static class BuildII extends Builder<II> {

		String root;

		String extension;

		String assigningAuthority;

		public BuildII(String root, String extension, String assigningAuthority) {
			super();
			this.root = root;
			this.extension = extension;
			this.assigningAuthority = assigningAuthority;
		}

		public BuildII(String root, String extension) {
			super();
			this.root = root;
			this.extension = extension;
		}

		public BuildII(String root) {
			super();
			this.root = root;
		}

		@Override
		public II construct() {
			II ii = DatatypesFactory.eINSTANCE.createII(root, extension);
			if (assigningAuthority != null) {
				ii.setAssigningAuthorityName(assigningAuthority);
			}
			return ii;
		}

	}

	public static class BuildTemplateId extends ArrayBuilder<II> {
		String root;

		public BuildTemplateId(String root) {
			super();
			this.root = root;
		}

		@Override
		public ArrayList<II> construct() {
			ArrayList<II> templates = new ArrayList<II>();

			templates.add(new BuildII(root).construct());
			return templates;
		}

	}

	public static class BuildPatientRole extends Builder<PatientRole> {

		public BuildPatientRole(String organizationId) {
			super();
			this.organizationId = organizationId;
		}

		String organizationId;

		@Override
		public PatientRole construct() {
			PatientRole patientRole = CDAFactory.eINSTANCE.createPatientRole();
			Organization providerOrganization = CDAFactory.eINSTANCE.createOrganization();
			providerOrganization.getIds().add(DatatypesFactory.eINSTANCE.createII(organizationId));
			patientRole.setProviderOrganization(providerOrganization);
			return patientRole;
		}

	}

	public static final CE RomanCatholicAffiliationCode = DatatypesFactory.eINSTANCE.createCE("1041", "2.16.840.1.113883.5.1076", "HL7 ReligiousAffiliation", "Roman Catholic");

	public static final CD CD_NA = DatatypesFactory.eINSTANCE.createCD();
	static {
		CD_NA.setNullFlavor(NullFlavor.NA);
	}
	
	public static final CD CD_UNK = DatatypesFactory.eINSTANCE.createCD();
	static {
		CD_UNK.setNullFlavor(NullFlavor.UNK);
	}
	
	
	public static final IVXB_TS createNullFlavorIVXB_TS(NullFlavor nullFlavor)
	{
		IVXB_TS ts = DatatypesFactory.eINSTANCE.createIVXB_TS();
		ts.setNullFlavor(nullFlavor);
		return ts;
		
	}
	
	public static final IVXB_TS getTS_UNK()
	{
		return createNullFlavorIVXB_TS(NullFlavor.UNK);
	}
	
	public static final IVXB_TS getTS_NA()
	{
		return createNullFlavorIVXB_TS(NullFlavor.NA);
	}
//	public static final  IVXB_TS TS_UNK = DatatypesFactory.eINSTANCE.createIVXB_TS();
//
//	static {
//		TS_UNK.setNullFlavor(NullFlavor.UNK);
//	}
	
	
	
	
	
	public static  AD AD_UNK = DatatypesFactory.eINSTANCE.createAD();
	static {
		AD_UNK.setNullFlavor(NullFlavor.UNK);
	};
	
	
	public static  TEL TEL_UNK = DatatypesFactory.eINSTANCE.createTEL();
	static {
		TEL_UNK.setNullFlavor(NullFlavor.UNK);
	}
	
	public static final TEL buildHomePhone(String phoneNumber)
	{
		return buildPhone(TelecommunicationAddressUse.HP,phoneNumber);
	}


	public static final TEL buildPhone(TelecommunicationAddressUse use,String phoneNumber)
	{
		TEL phone = DatatypesFactory.eINSTANCE.createTEL();

		phone.setValue(phoneNumber);

		phone.getUses().add(use);
		
		return phone;
	}

	// none value used for interface 
	private static final String[] NONE = new String[] {};
	public static final AD buildHomeAddress(String city, String state) {
		return buildAddress(PostalAddressUse.HP, NONE , new String[] {city}, new String[] {state}, NONE );
	}

	
	public static final AD buildHomeAddress(String[] streets, String city, String state, String zip) {
		return buildAddress(PostalAddressUse.HP, streets, new String[] {city}, new String[] {state}, new String[] {zip});
	}

	public static final AD buildAddress(PostalAddressUse use, String[] streets, String[] cities, String[] states, String[] zips) {
		
		AD ad = DatatypesFactory.eINSTANCE.createAD();

		ad.getUses().add(use);

		for (String street : streets) {
			ad.getStreetAddressLines().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STR, street));
		}
		
		for (String city : cities) {
		ad.getCities().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CTY, city));
		}
		
		for (String state : states) {
		ad.getStates().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STA, state));
		}
		
		for (String zip : zips) {
		ad.getPostalCodes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ZIP, zip));
		}
		return ad;

	}

	public static final Person buildPerson(String prefix,String givenName,String familyName) {
		return buildPerson(NONE , new String[]{ prefix }, new String[]{ givenName },new String[] {familyName}, NONE );
	}
	public static final Person buildPerson(String givenName,String familyName) {
		return buildPerson(NONE , NONE , new String[]{ givenName },new String[] {familyName}, NONE );
	}
	
	public static final CD buildSNOMEDCT(String code)
	{
		return buildSNOMEDCT(code,"");
	}
	
	public static final CD buildSNOMEDCT(String code,String displayName)
	{
		return DatatypesFactory.eINSTANCE.createCD(code, "2.16.840.1.113883.6.96", "SNOMED-CT", displayName);
	}
	
	
	public static final CD buildLOINC(String code)
	{
		return buildSNOMEDCT(code,"");
	}
	
	public static final CD buildLOINC(String code,String displayName)
	{
		return DatatypesFactory.eINSTANCE.createCD(code, "2.16.840.1.113883.6.1", "LOINC", displayName);
	}
	
	
	public static final CE buildSNOMEDCE(String code)
	{
		return buildSNOMEDCE(code,"");
	}
	
	public static final CE buildSNOMEDCE(String code,String displayName)
	{
		return DatatypesFactory.eINSTANCE.createCE(code, "2.16.840.1.113883.6.96", "SNOMED-CT", displayName);
	}
	
	public static final CE buildRxNORM(String code,String displayName)
	{
		return DatatypesFactory.eINSTANCE.createCE(code, "2.16.840.1.113883.6.88", "RxNorm", displayName);
	}

	public static final CE buildRxNORM(String code)
	{
		return buildRxNORM(code,"");
	}

	
	
	public static final Person buildPerson(String[] texts, String[] prefixes, String[] givenNames, String[] familyNames, String[] suffixes) {

		Person person = CDAFactory.eINSTANCE.createPerson();

		person.getNames().add(buildPN(texts, prefixes, givenNames, familyNames, suffixes));

		return person;
	}
	
	public static final PlayingEntity buildPlayingEntity(String name) {

		PlayingEntity playingEntity= CDAFactory.eINSTANCE.createPlayingEntity ();

		playingEntity.getNames().add(buildPN(new String[] {name}, NONE, NONE,NONE , NONE));

		return playingEntity;
	}
	
	private static final PN buildPN(String[] texts, String[] prefixes, String[] givenNames, String[] familyNames, String[] suffixes)
	{
		PN pn = DatatypesFactory.eINSTANCE.createPN();

		for (String text : texts) {
			pn.addText(text);
		}

		for (String prefix : prefixes) {
			pn.addPrefix(prefix);
		}

		for (String givenName : givenNames) {
			pn.addGiven(givenName);
		}

		for (String familyName : familyNames) {
			pn.addFamily(familyName);
		}

		for (String suffix : suffixes) {
			pn.addSuffix(suffix);
		}

		return pn;
	}
	
	
	/*
	 * IVL_TS effectiveTime = DatatypesFactory.eINSTANCE.createIVL_TS("1950", null);
							
							IVXB_TS low = DatatypesFactory.eINSTANCE.createIVXB_TS();
							
							IVXB_TS high = DatatypesFactory.eINSTANCE.createIVXB_TS();
							
							effectiveTime.setLow(low);
							
							effectiveTime.setHigh(high);
	 */

	
	public static final IVL_TS buildIVL_TSHigh(IVXB_TS low,String high)
	{
		IVXB_TS h = DatatypesFactory.eINSTANCE.createIVXB_TS();
		
		h.setValue(high);

		return buildIVL_TS(low,h);
	}

	
	public static final IVL_TS buildIVL_TSLow(String low,IVXB_TS high)
	{
		IVXB_TS l = DatatypesFactory.eINSTANCE.createIVXB_TS();
		
		l.setValue(low);

		return buildIVL_TS(l,high);
	}
	
	public static final IVL_TS buildIVL_TS(String low,String high)
	{
		IVXB_TS l = DatatypesFactory.eINSTANCE.createIVXB_TS();
		l.setValue(low);

		IVXB_TS h = DatatypesFactory.eINSTANCE.createIVXB_TS();
		h.setValue(high);

		return buildIVL_TS(l,h);
	}
	
	public static final IVL_TS buildIVL_TS(IVXB_TS low,IVXB_TS high)
	{
		IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();

		if (low != null) {
			ts.setLow(low);
		}

		if (high != null) {
			ts.setHigh(high);
		}
		
		return ts;
	}
	
	

	public static final IVL_PQ buildIVL_PQUNK()
	{
		return buildIVL_PQ(NullFlavor.UNK);
		
	}
	
	public static final IVL_PQ buildIVL_PQ(NullFlavor nullFlavor)
	{
		IVL_PQ pq = DatatypesFactory.eINSTANCE.createIVL_PQ();
		
		pq.setNullFlavor(nullFlavor);
		
		return pq;
	}
	
	public static final CD buildCD(NullFlavor nullFlavor)
	{
		CD cd = DatatypesFactory.eINSTANCE.createCD();
		
		cd.setNullFlavor(nullFlavor);
		return cd;
	}
	
	
	public static final CD buildCDUNK()
	{
		return buildCD(NullFlavor.UNK);
	}
	
	public static final CD buildCDNA()
	{
		return buildCD(NullFlavor.NA);
	}
	
	
	private static class Code
	{
		public String code;
		public String codeDisplayName;
		public String codeSystem;
		public String codeSystemName;
		
		public Code(String code, String codeDisplayName, String codeSystem, String codeSystemName) {
			super();
			this.code = code;
			this.codeDisplayName = codeDisplayName;
			this.codeSystem = codeSystem;
			this.codeSystemName = codeSystemName;
		}
		
		
	}
	
	 private static final HashMap<String,Code> CDCCVXCodes= new HashMap<String,Code>();

	 static {
		 CDCCVXCodes.put("09",new Code ("09","Tetanus and diphtheria toxoids","2.16.840.1.113883.6.59", "CVX"));
		 CDCCVXCodes.put("113",new Code ("113","Tetanus and diphtheria toxoids - preservative free","2.16.840.1.113883.6.59", "CVX"));
		 
		 CDCCVXCodes.put("88",new Code ("88","Influenza virus vaccine","2.16.840.1.113883.6.59", "CVX"));
		 
		 CDCCVXCodes.put("111",new Code ("111","influenza, live, intranasal","2.16.840.1.113883.6.59","CVX"));
		 
		 
		 CDCCVXCodes.put("33",new Code ("33","Pneumococcal polysaccharide vaccine","2.16.840.1.113883.6.59","CVX"));
		 
		CDCCVXCodes.put("109",new Code ("109","Pneumococcal NOS","2.16.840.1.113883.6.59","CVX"));
		 
		 
	 };
	 
	 private static CD buildCD(Code code)
	 {
		 return DatatypesFactory.eINSTANCE.createCD(code.code, code.codeSystem, code.codeSystemName, code.codeDisplayName);
	 }
	 
	 private static CE buildCE(Code code)
	 {
		 return DatatypesFactory.eINSTANCE.createCE(code.code, code.codeSystem, code.codeSystemName, code.codeDisplayName);
	 }
	
	 public static CD createCDCCVXCD(String code)
	 {
		 return buildCD(CDCCVXCodes.get(code));
	 }

	 public static CE createCDCCVXCE(String code)
	 {
		 return buildCE(CDCCVXCodes.get(code));
	 }

}
