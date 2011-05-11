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
import org.openhealthtools.mdht.uml.hl7.rim.Entity;
import org.openhealthtools.mdht.uml.hl7.rim.RIMPackage;
import org.openhealthtools.mdht.uml.hl7.rim.Role;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Entity#getClassCode() <em>Get Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Entity#getDeterminerCode() <em>Get Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Entity#getPlayedRoles() <em>Get Played Roles</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Entity#getScopedRoles() <em>Get Scoped Roles</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Entity#isClassCodeDefined() <em>Is Class Code Defined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Entity#isDeterminerCodeDefined() <em>Is Determiner Code Defined</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityOperations extends InfrastructureRootOperations {
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
	protected EntityOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  Enumerator getClassCode(Entity entity) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  Enumerator getDeterminerCode(Entity entity) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  EList<Role> getPlayedRoles(Entity entity) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  EList<Role> getScopedRoles(Entity entity) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #isClassCodeDefined(Entity) <em>Is Class Code Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClassCodeDefined(Entity)
	 * @generated
	 * @ordered
	 */
	protected static final String IS_CLASS_CODE_DEFINED__EOCL_EXP = "self.isDefined('classCode')";
	/**
	 * The cached OCL query for the '{@link #isClassCodeDefined(Entity) <em>Is Class Code Defined</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClassCodeDefined(Entity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> IS_CLASS_CODE_DEFINED__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isDefined('classCode')
	 * @param entity The receiving '<em><b>Entity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean isClassCodeDefined(Entity entity) {
		if (IS_CLASS_CODE_DEFINED__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(RIMPackage.Literals.ENTITY, RIMPackage.Literals.ENTITY.getEAllOperations().get(12));
			try {
				IS_CLASS_CODE_DEFINED__EOCL_QRY = helper.createQuery(IS_CLASS_CODE_DEFINED__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(IS_CLASS_CODE_DEFINED__EOCL_QRY);
		return ((Boolean) query.evaluate(entity)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #isDeterminerCodeDefined(Entity) <em>Is Determiner Code Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeterminerCodeDefined(Entity)
	 * @generated
	 * @ordered
	 */
	protected static final String IS_DETERMINER_CODE_DEFINED__EOCL_EXP = "self.isDefined('determinerCode')";
	/**
	 * The cached OCL query for the '{@link #isDeterminerCodeDefined(Entity) <em>Is Determiner Code Defined</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeterminerCodeDefined(Entity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> IS_DETERMINER_CODE_DEFINED__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isDefined('determinerCode')
	 * @param entity The receiving '<em><b>Entity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean isDeterminerCodeDefined(Entity entity) {
		if (IS_DETERMINER_CODE_DEFINED__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(RIMPackage.Literals.ENTITY, RIMPackage.Literals.ENTITY.getEAllOperations().get(13));
			try {
				IS_DETERMINER_CODE_DEFINED__EOCL_QRY = helper.createQuery(IS_DETERMINER_CODE_DEFINED__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(IS_DETERMINER_CODE_DEFINED__EOCL_QRY);
		return ((Boolean) query.evaluate(entity)).booleanValue();
	}

} // EntityOperations