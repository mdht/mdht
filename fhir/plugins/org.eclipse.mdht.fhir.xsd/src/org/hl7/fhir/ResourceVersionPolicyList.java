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
 * A representation of the literals of the enumeration '<em><b>Resource Version Policy List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getResourceVersionPolicyList()
 * @model extendedMetaData="name='ResourceVersionPolicy-list'"
 * @generated
 */
public enum ResourceVersionPolicyList implements Enumerator {
	/**
	 * The '<em><b>No Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_VERSION(0, "noVersion", "no-version"),

	/**
	 * The '<em><b>Versioned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSIONED_VALUE
	 * @generated
	 * @ordered
	 */
	VERSIONED(1, "versioned", "versioned"),

	/**
	 * The '<em><b>Versioned Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSIONED_UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	VERSIONED_UPDATE(2, "versionedUpdate", "versioned-update");

	/**
	 * The '<em><b>No Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VersionId meta-property is not suppoerted (server) or used (client).
	 * <!-- end-model-doc -->
	 * @see #NO_VERSION
	 * @model name="noVersion" literal="no-version"
	 * @generated
	 * @ordered
	 */
	public static final int NO_VERSION_VALUE = 0;

	/**
	 * The '<em><b>Versioned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VersionId meta-property is suppoerted (server) or used (client).
	 * <!-- end-model-doc -->
	 * @see #VERSIONED
	 * @model name="versioned"
	 * @generated
	 * @ordered
	 */
	public static final int VERSIONED_VALUE = 1;

	/**
	 * The '<em><b>Versioned Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VersionId is must be correct for updates (server) or will be specified (If-match header) for updates (client).
	 * <!-- end-model-doc -->
	 * @see #VERSIONED_UPDATE
	 * @model name="versionedUpdate" literal="versioned-update"
	 * @generated
	 * @ordered
	 */
	public static final int VERSIONED_UPDATE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Resource Version Policy List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResourceVersionPolicyList[] VALUES_ARRAY =
		new ResourceVersionPolicyList[] {
			NO_VERSION,
			VERSIONED,
			VERSIONED_UPDATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Resource Version Policy List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResourceVersionPolicyList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource Version Policy List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceVersionPolicyList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceVersionPolicyList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Version Policy List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceVersionPolicyList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceVersionPolicyList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Version Policy List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceVersionPolicyList get(int value) {
		switch (value) {
			case NO_VERSION_VALUE: return NO_VERSION;
			case VERSIONED_VALUE: return VERSIONED;
			case VERSIONED_UPDATE_VALUE: return VERSIONED_UPDATE;
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
	private ResourceVersionPolicyList(int value, String name, String literal) {
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
	
} //ResourceVersionPolicyList
