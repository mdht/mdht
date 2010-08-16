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
package org.openhealthtools.mdht.builder.cda.helpers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.openhealthtools.mdht.builder.cda.ArrayBuilder;
import org.openhealthtools.mdht.builder.cda.Builder;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

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

	public static class BuildEffectiveTime extends Builder<TS> {

		public BuildEffectiveTime(Calendar cal) {
			super();
			this.cal = cal;
		}

		public BuildEffectiveTime() {
			super();
			this.cal = Calendar.getInstance();
			;
		}

		public static final String DATE_FORMAT_NOW = "yyyyMMdd";

		Calendar cal = null;

		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);

		@Override
		public TS construct() {
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

	public static final IVXB_TS TS_UNK = DatatypesFactory.eINSTANCE.createIVXB_TS();

	{
		TS_UNK.setNullFlavor(NullFlavor.UNK);
	}

}
