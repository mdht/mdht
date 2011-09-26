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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Infrastructure Root</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#getRealmCodes() <em>Get Realm Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#getTypeId() <em>Get Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#getTemplateIds() <em>Get Template Ids</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#getNullFlavor() <em>Get Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#isNullFlavorDefined() <em>Is Null Flavor Defined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#isNullFlavorUndefined() <em>Is Null Flavor Undefined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#hasContent() <em>Has Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#isDefined(java.lang.String) <em>Is Defined</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfrastructureRootOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureRootOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<CS> getRealmCodes(InfrastructureRoot infrastructureRoot) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static II getTypeId(InfrastructureRoot infrastructureRoot) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<II> getTemplateIds(InfrastructureRoot infrastructureRoot) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NullFlavor getNullFlavor(InfrastructureRoot infrastructureRoot) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isNullFlavorDefined(InfrastructureRoot infrastructureRoot) {
		return infrastructureRoot.eIsSet(infrastructureRoot.eClass().getEStructuralFeature("nullFlavor"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isNullFlavorUndefined(InfrastructureRoot infrastructureRoot) {
		return !isNullFlavorDefined(infrastructureRoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean hasContent(InfrastructureRoot infrastructureRoot) {
		for (EStructuralFeature feature : infrastructureRoot.eClass().getEAllStructuralFeatures()) {
			if (infrastructureRoot.eIsSet(feature) && !"nullFlavor".equals(feature.getName())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isDefined(InfrastructureRoot infrastructureRoot, String featureName) {
		return (infrastructureRoot.eIsSet(infrastructureRoot.eClass().getEStructuralFeature(featureName)));
	}

} // InfrastructureRootOperations
