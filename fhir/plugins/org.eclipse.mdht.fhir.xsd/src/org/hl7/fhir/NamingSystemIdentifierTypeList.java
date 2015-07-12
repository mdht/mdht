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
 * A representation of the literals of the enumeration '<em><b>Naming System Identifier Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getNamingSystemIdentifierTypeList()
 * @model extendedMetaData="name='NamingSystemIdentifierType-list'"
 * @generated
 */
public enum NamingSystemIdentifierTypeList implements Enumerator {
	/**
	 * The '<em><b>Oid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OID_VALUE
	 * @generated
	 * @ordered
	 */
	OID(0, "oid", "oid"),

	/**
	 * The '<em><b>Uuid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UUID_VALUE
	 * @generated
	 * @ordered
	 */
	UUID(1, "uuid", "uuid"),

	/**
	 * The '<em><b>Uri</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URI_VALUE
	 * @generated
	 * @ordered
	 */
	URI(2, "uri", "uri"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(3, "other", "other");

	/**
	 * The '<em><b>Oid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ISO object identifier.  E.g. 1.2.3.4.5.
	 * <!-- end-model-doc -->
	 * @see #OID
	 * @model name="oid"
	 * @generated
	 * @ordered
	 */
	public static final int OID_VALUE = 0;

	/**
	 * The '<em><b>Uuid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A universally unique identifier of the form a5afddf4-e880-459b-876e-e4591b0acc11.
	 * <!-- end-model-doc -->
	 * @see #UUID
	 * @model name="uuid"
	 * @generated
	 * @ordered
	 */
	public static final int UUID_VALUE = 1;

	/**
	 * The '<em><b>Uri</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A uniform resource identifier (ideally a URL - uniform resource locator).  E.g. http://unitsofmeasure.org.
	 * <!-- end-model-doc -->
	 * @see #URI
	 * @model name="uri"
	 * @generated
	 * @ordered
	 */
	public static final int URI_VALUE = 2;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some other type of unique identifier.  E.g HL7-assigned reserved string such as LN for LOINC.
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Naming System Identifier Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NamingSystemIdentifierTypeList[] VALUES_ARRAY =
		new NamingSystemIdentifierTypeList[] {
			OID,
			UUID,
			URI,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Naming System Identifier Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NamingSystemIdentifierTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Naming System Identifier Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NamingSystemIdentifierTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NamingSystemIdentifierTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Naming System Identifier Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NamingSystemIdentifierTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NamingSystemIdentifierTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Naming System Identifier Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NamingSystemIdentifierTypeList get(int value) {
		switch (value) {
			case OID_VALUE: return OID;
			case UUID_VALUE: return UUID;
			case URI_VALUE: return URI;
			case OTHER_VALUE: return OTHER;
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
	private NamingSystemIdentifierTypeList(int value, String name, String literal) {
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
	
} //NamingSystemIdentifierTypeList
