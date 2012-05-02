/*******************************************************************************
 * Copyright (c) 2010, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.rim.operations;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.ActRelationship;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;
import org.openhealthtools.mdht.uml.hl7.rim.RIMPackage;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Act#getClassCode() <em>Get Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Act#getMoodCode() <em>Get Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Act#getNegationInd() <em>Get Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Act#getParticipations() <em>Get Participations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Act#getOutboundRelationships() <em>Get Outbound Relationships</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Act#getInboundRelationships() <em>Get Inbound Relationships</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Act#isClassCodeDefined() <em>Is Class Code Defined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Act#isMoodCodeDefined() <em>Is Mood Code Defined</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActOperations extends InfrastructureRootOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Enumerator getClassCode(Act act) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Enumerator getMoodCode(Act act) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Boolean getNegationInd(Act act) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<Participation> getParticipations(Act act) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<ActRelationship> getOutboundRelationships(Act act) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<ActRelationship> getInboundRelationships(Act act) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #isClassCodeDefined(Act) <em>Is Class Code Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClassCodeDefined(Act)
	 * @generated
	 * @ordered
	 */
	protected static final String IS_CLASS_CODE_DEFINED__EOCL_EXP = "self.isDefined('classCode')";

	/**
	 * The cached OCL query for the '{@link #isClassCodeDefined(Act) <em>Is Class Code Defined</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClassCodeDefined(Act)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> IS_CLASS_CODE_DEFINED__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isDefined('classCode')
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isClassCodeDefined(Act act) {
		if (IS_CLASS_CODE_DEFINED__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(RIMPackage.Literals.ACT, RIMPackage.Literals.ACT.getEAllOperations().get(14));
			try {
				IS_CLASS_CODE_DEFINED__EOCL_QRY = helper.createQuery(IS_CLASS_CODE_DEFINED__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(IS_CLASS_CODE_DEFINED__EOCL_QRY);
		return ((Boolean) query.evaluate(act)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #isMoodCodeDefined(Act) <em>Is Mood Code Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoodCodeDefined(Act)
	 * @generated
	 * @ordered
	 */
	protected static final String IS_MOOD_CODE_DEFINED__EOCL_EXP = "self.isDefined('moodCode')";

	/**
	 * The cached OCL query for the '{@link #isMoodCodeDefined(Act) <em>Is Mood Code Defined</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoodCodeDefined(Act)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> IS_MOOD_CODE_DEFINED__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isDefined('moodCode')
	 * @param act The receiving '<em><b>Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isMoodCodeDefined(Act act) {
		if (IS_MOOD_CODE_DEFINED__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(RIMPackage.Literals.ACT, RIMPackage.Literals.ACT.getEAllOperations().get(15));
			try {
				IS_MOOD_CODE_DEFINED__EOCL_QRY = helper.createQuery(IS_MOOD_CODE_DEFINED__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(IS_MOOD_CODE_DEFINED__EOCL_QRY);
		return ((Boolean) query.evaluate(act)).booleanValue();
	}

} // ActOperations
