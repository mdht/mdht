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
package org.openhealthtools.mdht.uml.hl7.datatypes.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ADXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.BIN;
import org.openhealthtools.mdht.uml.hl7.datatypes.BL;
import org.openhealthtools.mdht.uml.hl7.datatypes.BN;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CO;
import org.openhealthtools.mdht.uml.hl7.datatypes.CR;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.CV;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
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
import org.openhealthtools.mdht.uml.hl7.datatypes.QTY;
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
import org.openhealthtools.mdht.uml.hl7.datatypes.URL;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage
 * @generated
 */
public class DatatypesSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatatypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesSwitch() {
		if (modelPackage == null) {
			modelPackage = DatatypesPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DatatypesPackage.ANY: {
				ANY any = (ANY)theEObject;
				T result = caseANY(any);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.BIN: {
				BIN bin = (BIN)theEObject;
				T result = caseBIN(bin);
				if (result == null) result = caseANY(bin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.ED: {
				ED ed = (ED)theEObject;
				T result = caseED(ed);
				if (result == null) result = caseBIN(ed);
				if (result == null) result = caseANY(ed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.TEL: {
				TEL tel = (TEL)theEObject;
				T result = caseTEL(tel);
				if (result == null) result = caseURL(tel);
				if (result == null) result = caseANY(tel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.URL: {
				URL url = (URL)theEObject;
				T result = caseURL(url);
				if (result == null) result = caseANY(url);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.SXCM_TS: {
				SXCM_TS sxcM_TS = (SXCM_TS)theEObject;
				T result = caseSXCM_TS(sxcM_TS);
				if (result == null) result = caseTS(sxcM_TS);
				if (result == null) result = caseQTY(sxcM_TS);
				if (result == null) result = caseANY(sxcM_TS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.TS: {
				TS ts = (TS)theEObject;
				T result = caseTS(ts);
				if (result == null) result = caseQTY(ts);
				if (result == null) result = caseANY(ts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.QTY: {
				QTY qty = (QTY)theEObject;
				T result = caseQTY(qty);
				if (result == null) result = caseANY(qty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.ST: {
				ST st = (ST)theEObject;
				T result = caseST(st);
				if (result == null) result = caseED(st);
				if (result == null) result = caseBIN(st);
				if (result == null) result = caseANY(st);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.CD: {
				CD cd = (CD)theEObject;
				T result = caseCD(cd);
				if (result == null) result = caseANY(cd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.CR: {
				CR cr = (CR)theEObject;
				T result = caseCR(cr);
				if (result == null) result = caseANY(cr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.CV: {
				CV cv = (CV)theEObject;
				T result = caseCV(cv);
				if (result == null) result = caseCE(cv);
				if (result == null) result = caseCD(cv);
				if (result == null) result = caseANY(cv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.CE: {
				CE ce = (CE)theEObject;
				T result = caseCE(ce);
				if (result == null) result = caseCD(ce);
				if (result == null) result = caseANY(ce);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.II: {
				II ii = (II)theEObject;
				T result = caseII(ii);
				if (result == null) result = caseANY(ii);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.BL: {
				BL bl = (BL)theEObject;
				T result = caseBL(bl);
				if (result == null) result = caseANY(bl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.BN: {
				BN bn = (BN)theEObject;
				T result = caseBN(bn);
				if (result == null) result = caseBL(bn);
				if (result == null) result = caseANY(bn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.AD: {
				AD ad = (AD)theEObject;
				T result = caseAD(ad);
				if (result == null) result = caseANY(ad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.ADXP: {
				ADXP adxp = (ADXP)theEObject;
				T result = caseADXP(adxp);
				if (result == null) result = caseST(adxp);
				if (result == null) result = caseED(adxp);
				if (result == null) result = caseBIN(adxp);
				if (result == null) result = caseANY(adxp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.EN: {
				EN en = (EN)theEObject;
				T result = caseEN(en);
				if (result == null) result = caseANY(en);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.IVL_TS: {
				IVL_TS ivL_TS = (IVL_TS)theEObject;
				T result = caseIVL_TS(ivL_TS);
				if (result == null) result = caseSXCM_TS(ivL_TS);
				if (result == null) result = caseTS(ivL_TS);
				if (result == null) result = caseQTY(ivL_TS);
				if (result == null) result = caseANY(ivL_TS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.IVXB_TS: {
				IVXB_TS ivxB_TS = (IVXB_TS)theEObject;
				T result = caseIVXB_TS(ivxB_TS);
				if (result == null) result = caseTS(ivxB_TS);
				if (result == null) result = caseQTY(ivxB_TS);
				if (result == null) result = caseANY(ivxB_TS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.PQ: {
				PQ pq = (PQ)theEObject;
				T result = casePQ(pq);
				if (result == null) result = caseQTY(pq);
				if (result == null) result = caseANY(pq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.PQR: {
				PQR pqr = (PQR)theEObject;
				T result = casePQR(pqr);
				if (result == null) result = caseCV(pqr);
				if (result == null) result = caseCE(pqr);
				if (result == null) result = caseCD(pqr);
				if (result == null) result = caseANY(pqr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.ENXP: {
				ENXP enxp = (ENXP)theEObject;
				T result = caseENXP(enxp);
				if (result == null) result = caseST(enxp);
				if (result == null) result = caseED(enxp);
				if (result == null) result = caseBIN(enxp);
				if (result == null) result = caseANY(enxp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.ON: {
				ON on = (ON)theEObject;
				T result = caseON(on);
				if (result == null) result = caseEN(on);
				if (result == null) result = caseANY(on);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.PN: {
				PN pn = (PN)theEObject;
				T result = casePN(pn);
				if (result == null) result = caseEN(pn);
				if (result == null) result = caseANY(pn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.TN: {
				TN tn = (TN)theEObject;
				T result = caseTN(tn);
				if (result == null) result = caseEN(tn);
				if (result == null) result = caseANY(tn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.INT: {
				INT int_ = (INT)theEObject;
				T result = caseINT(int_);
				if (result == null) result = caseQTY(int_);
				if (result == null) result = caseANY(int_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.REAL: {
				REAL real = (REAL)theEObject;
				T result = caseREAL(real);
				if (result == null) result = caseQTY(real);
				if (result == null) result = caseANY(real);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.CS: {
				CS cs = (CS)theEObject;
				T result = caseCS(cs);
				if (result == null) result = caseCV(cs);
				if (result == null) result = caseCE(cs);
				if (result == null) result = caseCD(cs);
				if (result == null) result = caseANY(cs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.CO: {
				CO co = (CO)theEObject;
				T result = caseCO(co);
				if (result == null) result = caseCV(co);
				if (result == null) result = caseCE(co);
				if (result == null) result = caseCD(co);
				if (result == null) result = caseANY(co);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.SC: {
				SC sc = (SC)theEObject;
				T result = caseSC(sc);
				if (result == null) result = caseST(sc);
				if (result == null) result = caseED(sc);
				if (result == null) result = caseBIN(sc);
				if (result == null) result = caseANY(sc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.RTO_QTY_QTY: {
				RTO_QTY_QTY rtO_QTY_QTY = (RTO_QTY_QTY)theEObject;
				T result = caseRTO_QTY_QTY(rtO_QTY_QTY);
				if (result == null) result = caseQTY(rtO_QTY_QTY);
				if (result == null) result = caseANY(rtO_QTY_QTY);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.MO: {
				MO mo = (MO)theEObject;
				T result = caseMO(mo);
				if (result == null) result = caseQTY(mo);
				if (result == null) result = caseANY(mo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.RTO: {
				RTO rto = (RTO)theEObject;
				T result = caseRTO(rto);
				if (result == null) result = caseRTO_QTY_QTY(rto);
				if (result == null) result = caseQTY(rto);
				if (result == null) result = caseANY(rto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.SXCM_INT: {
				SXCM_INT sxcM_INT = (SXCM_INT)theEObject;
				T result = caseSXCM_INT(sxcM_INT);
				if (result == null) result = caseINT(sxcM_INT);
				if (result == null) result = caseQTY(sxcM_INT);
				if (result == null) result = caseANY(sxcM_INT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.IVXB_INT: {
				IVXB_INT ivxB_INT = (IVXB_INT)theEObject;
				T result = caseIVXB_INT(ivxB_INT);
				if (result == null) result = caseINT(ivxB_INT);
				if (result == null) result = caseQTY(ivxB_INT);
				if (result == null) result = caseANY(ivxB_INT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.IVL_INT: {
				IVL_INT ivL_INT = (IVL_INT)theEObject;
				T result = caseIVL_INT(ivL_INT);
				if (result == null) result = caseSXCM_INT(ivL_INT);
				if (result == null) result = caseINT(ivL_INT);
				if (result == null) result = caseQTY(ivL_INT);
				if (result == null) result = caseANY(ivL_INT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.IVXB_PQ: {
				IVXB_PQ ivxB_PQ = (IVXB_PQ)theEObject;
				T result = caseIVXB_PQ(ivxB_PQ);
				if (result == null) result = casePQ(ivxB_PQ);
				if (result == null) result = caseQTY(ivxB_PQ);
				if (result == null) result = caseANY(ivxB_PQ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.SXCM_PQ: {
				SXCM_PQ sxcM_PQ = (SXCM_PQ)theEObject;
				T result = caseSXCM_PQ(sxcM_PQ);
				if (result == null) result = casePQ(sxcM_PQ);
				if (result == null) result = caseQTY(sxcM_PQ);
				if (result == null) result = caseANY(sxcM_PQ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.IVL_PQ: {
				IVL_PQ ivL_PQ = (IVL_PQ)theEObject;
				T result = caseIVL_PQ(ivL_PQ);
				if (result == null) result = caseSXCM_PQ(ivL_PQ);
				if (result == null) result = casePQ(ivL_PQ);
				if (result == null) result = caseQTY(ivL_PQ);
				if (result == null) result = caseANY(ivL_PQ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.RTO_PQ_PQ: {
				RTO_PQ_PQ rtO_PQ_PQ = (RTO_PQ_PQ)theEObject;
				T result = caseRTO_PQ_PQ(rtO_PQ_PQ);
				if (result == null) result = caseQTY(rtO_PQ_PQ);
				if (result == null) result = caseANY(rtO_PQ_PQ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.PIVL_TS: {
				PIVL_TS pivL_TS = (PIVL_TS)theEObject;
				T result = casePIVL_TS(pivL_TS);
				if (result == null) result = caseSXCM_TS(pivL_TS);
				if (result == null) result = caseTS(pivL_TS);
				if (result == null) result = caseQTY(pivL_TS);
				if (result == null) result = caseANY(pivL_TS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANY(ANY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BIN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BIN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBIN(BIN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ED</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ED</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseED(ED object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEL(TEL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURL(URL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SXCM TS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SXCM TS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSXCM_TS(SXCM_TS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTS(TS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QTY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QTY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQTY(QTY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ST</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ST</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseST(ST object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCD(CD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCR(CR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCV(CV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCE(CE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>II</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>II</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseII(II object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBL(BL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBN(BN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAD(AD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADXP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADXP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADXP(ADXP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEN(EN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVL TS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVL TS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIVL_TS(IVL_TS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVXB TS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVXB TS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIVXB_TS(IVXB_TS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PQ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PQ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePQ(PQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PQR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PQR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePQR(PQR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENXP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENXP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENXP(ENXP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ON</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ON</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseON(ON object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePN(PN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTN(TN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINT(INT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REAL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REAL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREAL(REAL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCS(CS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCO(CO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSC(SC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTO QTY QTY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTO QTY QTY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTO_QTY_QTY(RTO_QTY_QTY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMO(MO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTO(RTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SXCM INT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SXCM INT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSXCM_INT(SXCM_INT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVXB INT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVXB INT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIVXB_INT(IVXB_INT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVL INT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVL INT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIVL_INT(IVL_INT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVXB PQ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVXB PQ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIVXB_PQ(IVXB_PQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SXCM PQ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SXCM PQ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSXCM_PQ(SXCM_PQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVL PQ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVL PQ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIVL_PQ(IVL_PQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTO PQ PQ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTO PQ PQ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTO_PQ_PQ(RTO_PQ_PQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PIVL TS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PIVL TS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePIVL_TS(PIVL_TS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //DatatypesSwitch
