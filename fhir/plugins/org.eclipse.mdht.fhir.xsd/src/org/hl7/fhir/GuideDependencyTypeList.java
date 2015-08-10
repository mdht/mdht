/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Guide Dependency Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getGuideDependencyTypeList()
 * @model extendedMetaData="name='GuideDependencyType-list'"
 * @generated
 */
public enum GuideDependencyTypeList implements Enumerator {
	/**
	 * The '<em><b>Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE(0, "reference", "reference"),

	/**
	 * The '<em><b>Inclusion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUSION_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUSION(1, "inclusion", "inclusion");

	/**
	 * The '<em><b>Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The guide is referred to by URL
	 * <!-- end-model-doc -->
	 * @see #REFERENCE
	 * @model name="reference"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_VALUE = 0;

	/**
	 * The '<em><b>Inclusion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The guide is embedded in this guide when published
	 * <!-- end-model-doc -->
	 * @see #INCLUSION
	 * @model name="inclusion"
	 * @generated
	 * @ordered
	 */
	public static final int INCLUSION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Guide Dependency Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GuideDependencyTypeList[] VALUES_ARRAY =
		new GuideDependencyTypeList[] {
			REFERENCE,
			INCLUSION,
		};

	/**
	 * A public read-only list of all the '<em><b>Guide Dependency Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GuideDependencyTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Guide Dependency Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuideDependencyTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GuideDependencyTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guide Dependency Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuideDependencyTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GuideDependencyTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guide Dependency Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuideDependencyTypeList get(int value) {
		switch (value) {
			case REFERENCE_VALUE: return REFERENCE;
			case INCLUSION_VALUE: return INCLUSION;
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
	private GuideDependencyTypeList(int value, String name, String literal) {
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
	
} //GuideDependencyTypeList
