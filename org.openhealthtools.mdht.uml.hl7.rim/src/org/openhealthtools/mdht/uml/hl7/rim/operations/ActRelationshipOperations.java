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

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.ActRelationship;
import org.openhealthtools.mdht.uml.hl7.rim.RIMPackage;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Act Relationship</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.ActRelationship#getTypeCode() <em>Get Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.ActRelationship#getTarget() <em>Get Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.ActRelationship#getSource() <em>Get Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.ActRelationship#isTypeCodeDefined() <em>Is Type Code Defined</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActRelationshipOperations extends InfrastructureRootOperations {
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
	protected ActRelationshipOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Enumerator getTypeCode(ActRelationship actRelationship) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Act getTarget(ActRelationship actRelationship) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Act getSource(ActRelationship actRelationship) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #isTypeCodeDefined(ActRelationship) <em>Is Type Code Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeCodeDefined(ActRelationship)
	 * @generated
	 * @ordered
	 */
	protected static final String IS_TYPE_CODE_DEFINED__EOCL_EXP = "self.isDefined('typeCode')";

	/**
	 * The cached OCL query for the '{@link #isTypeCodeDefined(ActRelationship) <em>Is Type Code Defined</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeCodeDefined(ActRelationship)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> IS_TYPE_CODE_DEFINED__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isDefined('typeCode')
	 * @param actRelationship The receiving '<em><b>Act Relationship</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isTypeCodeDefined(ActRelationship actRelationship) {
		if (IS_TYPE_CODE_DEFINED__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				RIMPackage.Literals.ACT_RELATIONSHIP, RIMPackage.Literals.ACT_RELATIONSHIP.getEAllOperations().get(11));
			try {
				IS_TYPE_CODE_DEFINED__EOCL_QRY = helper.createQuery(IS_TYPE_CODE_DEFINED__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(IS_TYPE_CODE_DEFINED__EOCL_QRY);
		return ((Boolean) query.evaluate(actRelationship)).booleanValue();
	}

} // ActRelationshipOperations
