/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Association Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * An indicator that determines whether an entity reference / predicate combination is to be evaluated with the entity reference in the source (left
 * hand side) position of the association query or the target
 * (right hand side or "object") position.<i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Note:</i>
 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">AssociationDirection</i> doesn't strictly belong in this diagram, but it is kind of an orphan
 * class and we didn't want to create an entire new diagram just for one element.
 * <!-- end-model-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getAssociationDirection()
 * @model extendedMetaData="name='AssociationDirection'"
 * @generated
 */
public enum AssociationDirection implements Enumerator {
	/**
	 * The '<em><b>SOURCETOTARGET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #SOURCETOTARGET_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCETOTARGET(0, "SOURCETOTARGET", "SOURCE_TO_TARGET"),

	/**
	 * The '<em><b>TARGETTOSOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #TARGETTOSOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	TARGETTOSOURCE(1, "TARGETTOSOURCE", "TARGET_TO_SOURCE");

	/**
	 * The '<em><b>SOURCETOTARGET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the statement is to be resolved with the entity reference in the role of <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">source</i>.
	 * <!-- end-model-doc -->
	 * 
	 * @see #SOURCETOTARGET
	 * @model literal="SOURCE_TO_TARGET"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCETOTARGET_VALUE = 0;

	/**
	 * The '<em><b>TARGETTOSOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the statement is to be resolved with the entity reference in the role of <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">target</i>.
	 * <!-- end-model-doc -->
	 * 
	 * @see #TARGETTOSOURCE
	 * @model literal="TARGET_TO_SOURCE"
	 * @generated
	 * @ordered
	 */
	public static final int TARGETTOSOURCE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Association Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final AssociationDirection[] VALUES_ARRAY = new AssociationDirection[] {
			SOURCETOTARGET, TARGETTOSOURCE, };

	/**
	 * A public read-only list of all the '<em><b>Association Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<AssociationDirection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Association Direction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static AssociationDirection get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssociationDirection result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Association Direction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static AssociationDirection getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssociationDirection result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Association Direction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static AssociationDirection get(int value) {
		switch (value) {
			case SOURCETOTARGET_VALUE:
				return SOURCETOTARGET;
			case TARGETTOSOURCE_VALUE:
				return TARGETTOSOURCE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private AssociationDirection(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // AssociationDirection
