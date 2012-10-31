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
package org.openhealthtools.mdht.cts2.entity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Designation Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The role that a designation plays in respect to the referenced <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">Entity</i>. <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">DesignationRole</i> is intended to convey the same semantics as the three types of <a
 * href="//http://www.w3.org/TR/skos-reference/#labels" xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">SKOS Label</a> - skos:prefLabel (<i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">PREFERRED</i>), skos:altLabel (<i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">ALTERNATIVE</i>) and skos:hiddenLabel (<i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">HIDDEN</i>). The SKOS consistency rules with respect to
 * preferred labels also apply to designation with two exceptions:(1) There can be more than one preferred label for the same language if the <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">usageContext</i> is different(2) If the service implementation supports structured
 * data, it is possible to have more than one preferred label for the same language and context as long as each has a different <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">format</i>.
 * <!-- end-model-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDesignationRole()
 * @model extendedMetaData="name='DesignationRole'"
 * @generated
 */
public enum DesignationRole implements Enumerator {
	/**
	 * The '<em><b>PREFERRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #PREFERRED_VALUE
	 * @generated
	 * @ordered
	 */
	PREFERRED(0, "PREFERRED", "PREFERRED"),

	/**
	 * The '<em><b>ALTERNATIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #ALTERNATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ALTERNATIVE(1, "ALTERNATIVE", "ALTERNATIVE"),

	/**
	 * The '<em><b>HIDDEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #HIDDEN_VALUE
	 * @generated
	 * @ordered
	 */
	HIDDEN(2, "HIDDEN", "HIDDEN");

	/**
	 * The '<em><b>PREFERRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The preferred human-readable representation of the entity in a given language, context (aka. domain in SKOS terms) and format. <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">PREFERRED</i> is equivalent to skos:prefLabel.
	 * <!-- end-model-doc -->
	 * 
	 * @see #PREFERRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PREFERRED_VALUE = 0;

	/**
	 * The '<em><b>ALTERNATIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The acceptable alternative human-readable representation of the entity in a given language, context (aka. domain in SKOS terms) and format. The
	 * term "synonym" is often used to indicate an alternate
	 * designation although strictly speaking, "synonym" is a term-term relationship. <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">ALTERNATIVE</i> is equivalent to skos:altLabel
	 * <!-- end-model-doc -->
	 * 
	 * @see #ALTERNATIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALTERNATIVE_VALUE = 1;

	/**
	 * The '<em><b>HIDDEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The designation may be used to represent the entity under certain circumstances, but it is not normally displayed. Hidden designations are used
	 * primarily for search terms and typically represent common
	 * misspellings or deprecated usages. <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">HIDDEN</i> is equivalent to skos:hiddenLabel
	 * <!-- end-model-doc -->
	 * 
	 * @see #HIDDEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIDDEN_VALUE = 2;

	/**
	 * An array of all the '<em><b>Designation Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final DesignationRole[] VALUES_ARRAY = new DesignationRole[] { PREFERRED, ALTERNATIVE, HIDDEN, };

	/**
	 * A public read-only list of all the '<em><b>Designation Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<DesignationRole> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Designation Role</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static DesignationRole get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DesignationRole result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Designation Role</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static DesignationRole getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DesignationRole result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Designation Role</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static DesignationRole get(int value) {
		switch (value) {
			case PREFERRED_VALUE:
				return PREFERRED;
			case ALTERNATIVE_VALUE:
				return ALTERNATIVE;
			case HIDDEN_VALUE:
				return HIDDEN;
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
	private DesignationRole(int value, String name, String literal) {
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

} // DesignationRole
