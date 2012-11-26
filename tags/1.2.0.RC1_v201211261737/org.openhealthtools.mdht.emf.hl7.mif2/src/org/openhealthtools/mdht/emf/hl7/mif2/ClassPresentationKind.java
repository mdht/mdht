/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Class Presentation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A list of the 'styles' of graphic images that can be associated with a class
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassPresentationKind()
 * @model extendedMetaData="name='ClassPresentationKind'"
 * @generated
 */
public enum ClassPresentationKind implements Enumerator {
	/**
	 * The '<em><b>HL7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HL7_VALUE
	 * @generated
	 * @ordered
	 */
	HL7(0, "HL7", "HL7"),

	/**
	 * The '<em><b>HL7 Shadow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HL7_SHADOW_VALUE
	 * @generated
	 * @ordered
	 */
	HL7_SHADOW(1, "HL7Shadow", "HL7Shadow"),

	/**
	 * The '<em><b>UML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UML_VALUE
	 * @generated
	 * @ordered
	 */
	UML(2, "UML", "UML");

	/**
	 * The '<em><b>HL7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard HL7 Visio representation
	 * <!-- end-model-doc -->
	 * @see #HL7
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HL7_VALUE = 0;

	/**
	 * The '<em><b>HL7 Shadow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HL7 Visio shadow representation
	 * <!-- end-model-doc -->
	 * @see #HL7_SHADOW
	 * @model name="HL7Shadow"
	 * @generated
	 * @ordered
	 */
	public static final int HL7_SHADOW_VALUE = 1;

	/**
	 * The '<em><b>UML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Traditional UML representation
	 * <!-- end-model-doc -->
	 * @see #UML
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UML_VALUE = 2;

	/**
	 * An array of all the '<em><b>Class Presentation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClassPresentationKind[] VALUES_ARRAY = new ClassPresentationKind[] { HL7, HL7_SHADOW, UML, };

	/**
	 * A public read-only list of all the '<em><b>Class Presentation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClassPresentationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Class Presentation Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassPresentationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassPresentationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Class Presentation Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassPresentationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassPresentationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Class Presentation Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassPresentationKind get(int value) {
		switch (value) {
			case HL7_VALUE:
				return HL7;
			case HL7_SHADOW_VALUE:
				return HL7_SHADOW;
			case UML_VALUE:
				return UML;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ClassPresentationKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // ClassPresentationKind
