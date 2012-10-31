/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Class Description State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * determines whether a class description is considered to consist of necessary or necessary and sufficient definitions of the member individuals
 * <!-- end-model-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getClassDescriptionState()
 * @model extendedMetaData="name='ClassDescriptionState'"
 * @generated
 */
public enum ClassDescriptionState implements Enumerator {
	/**
	 * The '<em><b>PRIMITIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #PRIMITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMITIVE(0, "PRIMITIVE", "PRIMITIVE"),

	/**
	 * The '<em><b>FULLYDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #FULLYDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	FULLYDEFINED(1, "FULLYDEFINED", "FULLY_DEFINED");

	/**
	 * The '<em><b>PRIMITIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The defining assertions of the class description are necessary for all individuals that are members of the class. If an individual is asserted
	 * to be a member of the class, it can be asserted that it
	 * possesses all of the defining characteristics.
	 * <!-- end-model-doc -->
	 * 
	 * @see #PRIMITIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRIMITIVE_VALUE = 0;

	/**
	 * The '<em><b>FULLYDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The defining assertions of the class description are both necessary and sufficient. If an individual is asserted to be a member of the class,
	 * it can be asserted that it possesses all of the defining
	 * characteristics and, if an individual is determined to possess all of the defining characteristics in the class definition, it can be asserted
	 * to be a member of the class.
	 * <!-- end-model-doc -->
	 * 
	 * @see #FULLYDEFINED
	 * @model literal="FULLY_DEFINED"
	 * @generated
	 * @ordered
	 */
	public static final int FULLYDEFINED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Class Description State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ClassDescriptionState[] VALUES_ARRAY = new ClassDescriptionState[] { PRIMITIVE, FULLYDEFINED, };

	/**
	 * A public read-only list of all the '<em><b>Class Description State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<ClassDescriptionState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Class Description State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ClassDescriptionState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassDescriptionState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Class Description State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ClassDescriptionState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassDescriptionState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Class Description State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ClassDescriptionState get(int value) {
		switch (value) {
			case PRIMITIVE_VALUE:
				return PRIMITIVE;
			case FULLYDEFINED_VALUE:
				return FULLYDEFINED;
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
	private ClassDescriptionState(int value, String name, String literal) {
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

} // ClassDescriptionState
