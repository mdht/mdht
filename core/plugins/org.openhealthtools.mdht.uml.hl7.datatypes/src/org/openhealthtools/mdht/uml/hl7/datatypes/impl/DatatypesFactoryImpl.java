/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.datatypes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ADXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.BL;
import org.openhealthtools.mdht.uml.hl7.datatypes.BN;
import org.openhealthtools.mdht.uml.hl7.datatypes.BinaryDataEncoding;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CO;
import org.openhealthtools.mdht.uml.hl7.datatypes.CR;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.CV;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event;
import org.openhealthtools.mdht.uml.hl7.datatypes.EN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ENXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.MO;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQR;
import org.openhealthtools.mdht.uml.hl7.datatypes.REAL;
import org.openhealthtools.mdht.uml.hl7.datatypes.RTO;
import org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.RTO_QTY_QTY;
import org.openhealthtools.mdht.uml.hl7.datatypes.SC;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.datatypes.TN;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartType;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesFactoryImpl extends EFactoryImpl implements DatatypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatatypesFactory init() {
		try {
			DatatypesFactory theDatatypesFactory = (DatatypesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/hl7/datatypes"); 
			if (theDatatypesFactory != null) {
				return theDatatypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatatypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DatatypesPackage.ED: return createED();
			case DatatypesPackage.TEL: return createTEL();
			case DatatypesPackage.SXCM_TS: return createSXCM_TS();
			case DatatypesPackage.TS: return createTS();
			case DatatypesPackage.ST: return createST();
			case DatatypesPackage.CD: return createCD();
			case DatatypesPackage.CR: return createCR();
			case DatatypesPackage.CV: return createCV();
			case DatatypesPackage.CE: return createCE();
			case DatatypesPackage.II: return createII();
			case DatatypesPackage.BL: return createBL();
			case DatatypesPackage.BN: return createBN();
			case DatatypesPackage.AD: return createAD();
			case DatatypesPackage.ADXP: return createADXP();
			case DatatypesPackage.EN: return createEN();
			case DatatypesPackage.ENXP: return createENXP();
			case DatatypesPackage.IVL_TS: return createIVL_TS();
			case DatatypesPackage.IVXB_TS: return createIVXB_TS();
			case DatatypesPackage.PQ: return createPQ();
			case DatatypesPackage.PQR: return createPQR();
			case DatatypesPackage.ON: return createON();
			case DatatypesPackage.PN: return createPN();
			case DatatypesPackage.TN: return createTN();
			case DatatypesPackage.INT: return createINT();
			case DatatypesPackage.REAL: return createREAL();
			case DatatypesPackage.CS: return createCS();
			case DatatypesPackage.CO: return createCO();
			case DatatypesPackage.SC: return createSC();
			case DatatypesPackage.RTO_QTY_QTY: return createRTO_QTY_QTY();
			case DatatypesPackage.MO: return createMO();
			case DatatypesPackage.RTO: return createRTO();
			case DatatypesPackage.SXCM_INT: return createSXCM_INT();
			case DatatypesPackage.IVXB_INT: return createIVXB_INT();
			case DatatypesPackage.IVL_INT: return createIVL_INT();
			case DatatypesPackage.IVXB_PQ: return createIVXB_PQ();
			case DatatypesPackage.SXCM_PQ: return createSXCM_PQ();
			case DatatypesPackage.IVL_PQ: return createIVL_PQ();
			case DatatypesPackage.RTO_PQ_PQ: return createRTO_PQ_PQ();
			case DatatypesPackage.PIVL_TS: return createPIVL_TS();
			case DatatypesPackage.EIVL_EVENT: return createEIVL_event();
			case DatatypesPackage.EIVL_TS: return createEIVL_TS();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DatatypesPackage.BINARY_DATA_ENCODING:
				return createBinaryDataEncodingFromString(eDataType, initialValue);
			case DatatypesPackage.TS_TYPE:
				return createtsTypeFromString(eDataType, initialValue);
			case DatatypesPackage.CS_TYPE:
				return createcsTypeFromString(eDataType, initialValue);
			case DatatypesPackage.UID:
				return createuidFromString(eDataType, initialValue);
			case DatatypesPackage.ST_TYPE:
				return createstTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DatatypesPackage.BINARY_DATA_ENCODING:
				return convertBinaryDataEncodingToString(eDataType, instanceValue);
			case DatatypesPackage.TS_TYPE:
				return converttsTypeToString(eDataType, instanceValue);
			case DatatypesPackage.CS_TYPE:
				return convertcsTypeToString(eDataType, instanceValue);
			case DatatypesPackage.UID:
				return convertuidToString(eDataType, instanceValue);
			case DatatypesPackage.ST_TYPE:
				return convertstTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED createED() {
		EDImpl ed = new EDImpl();
		return ed;
	}
	
	public ED createED(String text) {
		ED ed = createED();
		ed.addText(text);
		return ed;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEL createTEL() {
		TELImpl tel = new TELImpl();
		return tel;
	}
	
	public TEL createTEL(String value) {
		TEL tel = new TELImpl();
		tel.setValue(value);
		return tel;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SXCM_TS createSXCM_TS() {
		SXCM_TSImpl sxcM_TS = new SXCM_TSImpl();
		return sxcM_TS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TS createTS() {
		TSImpl ts = new TSImpl();
		return ts;
	}
	
	public TS createTS(String value) {
		TS ts = createTS();
		ts.setValue(value);
		return ts;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST createST() {
		STImpl st = new STImpl();
		return st;
	}
	
	public ST createST(String text) {
		ST st = createST();
		st.addText(text);
		return st;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD createCD() {
		CDImpl cd = new CDImpl();
		return cd;
	}

	public CD createCD(String code, String codeSystem, String codeSystemName, String displayName) {
		CD cd = createCD();
		cd.setCode(code);
		cd.setCodeSystem(codeSystem);
		cd.setCodeSystemName(codeSystemName);
		cd.setDisplayName(displayName);
		return cd;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CR createCR() {
		CRImpl cr = new CRImpl();
		return cr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CV createCV() {
		CVImpl cv = new CVImpl();
		return cv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE createCE() {
		CEImpl ce = new CEImpl();
		return ce;
	}
	
	public CE createCE(String code, String codeSystem) {
		CE ce = createCE();
		ce.setCode(code);
		ce.setCodeSystem(codeSystem);
		return ce;
	}
	
	public CE createCE(String code, String codeSystem, String codeSystemName, String displayName) {
		CE ce = createCE(code, codeSystem);
		ce.setCodeSystemName(codeSystemName);
		ce.setDisplayName(displayName);
		return ce;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public II createII() {
		IIImpl ii = new IIImpl();
		return ii;
	}
	
	public II createII(String root) {
		II ii = createII();
		ii.setRoot(root);
		return ii;
	}
	
	public II createII(String root, String extension) {
		II ii = createII(root);
		ii.setExtension(extension);
		return ii;
	}
	
	public II createII(NullFlavor nullFlavor) {
		II ii = createII();
		ii.setNullFlavor(nullFlavor);
		return ii;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BL createBL() {
		BLImpl bl = new BLImpl();
		return bl;
	}
	
	public BL createBL(Boolean value) {
		BL bl = createBL();
		bl.setValue(value);
		return bl;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BN createBN() {
		BNImpl bn = new BNImpl();
		return bn;
	}
	
	public BN createBN(Boolean value) {
		BN bn = createBN();
		bn.setValue(value);
		return bn;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD createAD() {
		ADImpl ad = new ADImpl();
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADXP createADXP() {
		ADXPImpl adxp = new ADXPImpl();
		return adxp;
	}
	
	public ADXP createADXP(AddressPartType partType, String text) {
		ADXP adxp = createADXP();
		adxp.setPartType(partType);
		adxp.addText(text);
		return adxp;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EN createEN() {
		ENImpl en = new ENImpl();
		return en;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_TS createIVL_TS() {
		IVL_TSImpl ivL_TS = new IVL_TSImpl();
		return ivL_TS;
	}
	
	public IVL_TS createIVL_TS(String low, String high) {
		IVL_TS ivL_TS = createIVL_TS();
		if (low != null) {
			IVXB_TS lower = createIVXB_TS();
			lower.setValue(low);
			ivL_TS.setLow(lower);
		}
		if (high != null) {
			IVXB_TS higher = createIVXB_TS();
			higher.setValue(high);
			ivL_TS.setHigh(higher);
		}
		return ivL_TS;
	}
	
	public IVL_TS createIVL_TS(String value) {
		IVL_TS ivL_TS = createIVL_TS();
		ivL_TS.setValue(value);
		return ivL_TS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVXB_TS createIVXB_TS() {
		IVXB_TSImpl ivxB_TS = new IVXB_TSImpl();
		return ivxB_TS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PQ createPQ() {
		PQImpl pq = new PQImpl();
		return pq;
	}
	
	public PQ createPQ(double value, String unit) {
		PQ pq = createPQ();
		pq.setValue(value);
		pq.setUnit(unit);
		return pq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PQR createPQR() {
		PQRImpl pqr = new PQRImpl();
		return pqr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENXP createENXP() {
		ENXPImpl enxp = new ENXPImpl();
		return enxp;
	}
	
	public ENXP createENXP(EntityNamePartType partType, String text) {
		ENXP enxp = createENXP();
		enxp.setPartType(partType);
		enxp.addText(text);
		return enxp;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ON createON() {
		ONImpl on = new ONImpl();
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PN createPN() {
		PNImpl pn = new PNImpl();
		return pn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TN createTN() {
		TNImpl tn = new TNImpl();
		return tn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INT createINT() {
		INTImpl int_ = new INTImpl();
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REAL createREAL() {
		REALImpl real = new REALImpl();
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS createCS() {
		CSImpl cs = new CSImpl();
		return cs;
	}
	
	public CS createCS(String code) {
		CS cs = createCS();
		cs.setCode(code);
		return cs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CO createCO() {
		COImpl co = new COImpl();
		return co;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SC createSC() {
		SCImpl sc = new SCImpl();
		return sc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTO_QTY_QTY createRTO_QTY_QTY() {
		RTO_QTY_QTYImpl rtO_QTY_QTY = new RTO_QTY_QTYImpl();
		return rtO_QTY_QTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MO createMO() {
		MOImpl mo = new MOImpl();
		return mo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTO createRTO() {
		RTOImpl rto = new RTOImpl();
		return rto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SXCM_INT createSXCM_INT() {
		SXCM_INTImpl sxcM_INT = new SXCM_INTImpl();
		return sxcM_INT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVXB_INT createIVXB_INT() {
		IVXB_INTImpl ivxB_INT = new IVXB_INTImpl();
		return ivxB_INT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_INT createIVL_INT() {
		IVL_INTImpl ivL_INT = new IVL_INTImpl();
		return ivL_INT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVXB_PQ createIVXB_PQ() {
		IVXB_PQImpl ivxB_PQ = new IVXB_PQImpl();
		return ivxB_PQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SXCM_PQ createSXCM_PQ() {
		SXCM_PQImpl sxcM_PQ = new SXCM_PQImpl();
		return sxcM_PQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_PQ createIVL_PQ() {
		IVL_PQImpl ivL_PQ = new IVL_PQImpl();
		return ivL_PQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTO_PQ_PQ createRTO_PQ_PQ() {
		RTO_PQ_PQImpl rtO_PQ_PQ = new RTO_PQ_PQImpl();
		return rtO_PQ_PQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIVL_TS createPIVL_TS() {
		PIVL_TSImpl pivL_TS = new PIVL_TSImpl();
		return pivL_TS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EIVL_event createEIVL_event() {
		EIVL_eventImpl eivL_event = new EIVL_eventImpl();
		return eivL_event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EIVL_TS createEIVL_TS() {
		EIVL_TSImpl eivL_TS = new EIVL_TSImpl();
		return eivL_TS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryDataEncoding createBinaryDataEncodingFromString(EDataType eDataType, String initialValue) {
		BinaryDataEncoding result = BinaryDataEncoding.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryDataEncodingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createcsTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertcsTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createuidFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertuidToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createstTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertstTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createtsTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttsTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesPackage getDatatypesPackage() {
		return (DatatypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatatypesPackage getPackage() {
		return DatatypesPackage.eINSTANCE;
	}

} //DatatypesFactoryImpl
