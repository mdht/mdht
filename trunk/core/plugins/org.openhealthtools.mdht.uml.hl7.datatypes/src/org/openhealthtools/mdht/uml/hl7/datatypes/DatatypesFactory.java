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
package org.openhealthtools.mdht.uml.hl7.datatypes;

import org.eclipse.emf.ecore.EFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartType;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage
 * @generated
 */
public interface DatatypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesFactory eINSTANCE = org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ED</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ED</em>'.
	 * @generated
	 */
	ED createED();
	ED createED(String text);
	
	/**
	 * Returns a new object of class '<em>TEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TEL</em>'.
	 * @generated
	 */
	TEL createTEL();
	TEL createTEL(String value);
	
	/**
	 * Returns a new object of class '<em>SXCM TS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SXCM TS</em>'.
	 * @generated
	 */
	SXCM_TS createSXCM_TS();

	/**
	 * Returns a new object of class '<em>TS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TS</em>'.
	 * @generated
	 */
	TS createTS();
	TS createTS(String value);
	
	/**
	 * Returns a new object of class '<em>ST</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ST</em>'.
	 * @generated
	 */
	ST createST();
	ST createST(String text);
	
	/**
	 * Returns a new object of class '<em>CD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CD</em>'.
	 * @generated
	 */
	CD createCD();
	CD createCD(String code, String codeSystem, String codeSystemName, String displayName);
	
	/**
	 * Returns a new object of class '<em>CR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CR</em>'.
	 * @generated
	 */
	CR createCR();

	/**
	 * Returns a new object of class '<em>CV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CV</em>'.
	 * @generated
	 */
	CV createCV();

	/**
	 * Returns a new object of class '<em>CE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CE</em>'.
	 * @generated
	 */
	CE createCE();
	CE createCE(String code, String codeSystem);
	CE createCE(String code, String codeSystem, String codeSystemName, String displayName);
	
	/**
	 * Returns a new object of class '<em>II</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>II</em>'.
	 * @generated
	 */
	II createII();
	II createII(String root);
	II createII(String root, String extension);
	II createII(NullFlavor nullFlavor);
	
	/**
	 * Returns a new object of class '<em>BL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BL</em>'.
	 * @generated
	 */
	BL createBL();
	BL createBL(Boolean value);
	
	/**
	 * Returns a new object of class '<em>BN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BN</em>'.
	 * @generated
	 */
	BN createBN();
	BN createBN(Boolean value);
	
	/**
	 * Returns a new object of class '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AD</em>'.
	 * @generated
	 */
	AD createAD();

	/**
	 * Returns a new object of class '<em>ADXP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ADXP</em>'.
	 * @generated
	 */
	ADXP createADXP();
	ADXP createADXP(AddressPartType partType, String text);
	
	/**
	 * Returns a new object of class '<em>EN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EN</em>'.
	 * @generated
	 */
	EN createEN();

	/**
	 * Returns a new object of class '<em>IVL TS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IVL TS</em>'.
	 * @generated
	 */
	IVL_TS createIVL_TS();
	IVL_TS createIVL_TS(String low, String high);
	IVL_TS createIVL_TS(String value);
	
	/**
	 * Returns a new object of class '<em>IVXB TS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IVXB TS</em>'.
	 * @generated
	 */
	IVXB_TS createIVXB_TS();

	/**
	 * Returns a new object of class '<em>PQ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PQ</em>'.
	 * @generated
	 */
	PQ createPQ();
	PQ createPQ(double value, String unit);

	/**
	 * Returns a new object of class '<em>PQR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PQR</em>'.
	 * @generated
	 */
	PQR createPQR();

	/**
	 * Returns a new object of class '<em>ENXP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ENXP</em>'.
	 * @generated
	 */
	ENXP createENXP();
	ENXP createENXP(EntityNamePartType partType, String text);
	
	/**
	 * Returns a new object of class '<em>ON</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ON</em>'.
	 * @generated
	 */
	ON createON();

	/**
	 * Returns a new object of class '<em>PN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PN</em>'.
	 * @generated
	 */
	PN createPN();

	/**
	 * Returns a new object of class '<em>TN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TN</em>'.
	 * @generated
	 */
	TN createTN();

	/**
	 * Returns a new object of class '<em>INT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>INT</em>'.
	 * @generated
	 */
	INT createINT();

	/**
	 * Returns a new object of class '<em>REAL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>REAL</em>'.
	 * @generated
	 */
	REAL createREAL();

	/**
	 * Returns a new object of class '<em>CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CS</em>'.
	 * @generated
	 */
	CS createCS();
	CS createCS(String code);
	
	/**
	 * Returns a new object of class '<em>CO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CO</em>'.
	 * @generated
	 */
	CO createCO();

	/**
	 * Returns a new object of class '<em>SC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SC</em>'.
	 * @generated
	 */
	SC createSC();

	/**
	 * Returns a new object of class '<em>RTO QTY QTY</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RTO QTY QTY</em>'.
	 * @generated
	 */
	RTO_QTY_QTY createRTO_QTY_QTY();

	/**
	 * Returns a new object of class '<em>MO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MO</em>'.
	 * @generated
	 */
	MO createMO();

	/**
	 * Returns a new object of class '<em>RTO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RTO</em>'.
	 * @generated
	 */
	RTO createRTO();

	/**
	 * Returns a new object of class '<em>SXCM INT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SXCM INT</em>'.
	 * @generated
	 */
	SXCM_INT createSXCM_INT();

	/**
	 * Returns a new object of class '<em>IVXB INT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IVXB INT</em>'.
	 * @generated
	 */
	IVXB_INT createIVXB_INT();

	/**
	 * Returns a new object of class '<em>IVL INT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IVL INT</em>'.
	 * @generated
	 */
	IVL_INT createIVL_INT();

	/**
	 * Returns a new object of class '<em>IVXB PQ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IVXB PQ</em>'.
	 * @generated
	 */
	IVXB_PQ createIVXB_PQ();

	/**
	 * Returns a new object of class '<em>SXCM PQ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SXCM PQ</em>'.
	 * @generated
	 */
	SXCM_PQ createSXCM_PQ();

	/**
	 * Returns a new object of class '<em>IVL PQ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IVL PQ</em>'.
	 * @generated
	 */
	IVL_PQ createIVL_PQ();

	/**
	 * Returns a new object of class '<em>RTO PQ PQ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RTO PQ PQ</em>'.
	 * @generated
	 */
	RTO_PQ_PQ createRTO_PQ_PQ();

	/**
	 * Returns a new object of class '<em>PIVL TS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PIVL TS</em>'.
	 * @generated
	 */
	PIVL_TS createPIVL_TS();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatatypesPackage getDatatypesPackage();

} //DatatypesFactory
