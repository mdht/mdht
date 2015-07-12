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
 * A representation of the literals of the enumeration '<em><b>Instance Availability List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getInstanceAvailabilityList()
 * @model extendedMetaData="name='InstanceAvailability-list'"
 * @generated
 */
public enum InstanceAvailabilityList implements Enumerator {
	/**
	 * The '<em><b>ONLINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONLINE_VALUE
	 * @generated
	 * @ordered
	 */
	ONLINE(0, "ONLINE", "ONLINE"),

	/**
	 * The '<em><b>OFFLINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFLINE_VALUE
	 * @generated
	 * @ordered
	 */
	OFFLINE(1, "OFFLINE", "OFFLINE"),

	/**
	 * The '<em><b>NEARLINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEARLINE_VALUE
	 * @generated
	 * @ordered
	 */
	NEARLINE(2, "NEARLINE", "NEARLINE"),

	/**
	 * The '<em><b>UNAVAILABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNAVAILABLE(3, "UNAVAILABLE", "UNAVAILABLE");

	/**
	 * The '<em><b>ONLINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources are immediately available,.
	 * <!-- end-model-doc -->
	 * @see #ONLINE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONLINE_VALUE = 0;

	/**
	 * The '<em><b>OFFLINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources need to be retrieved by manual intervention.
	 * <!-- end-model-doc -->
	 * @see #OFFLINE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OFFLINE_VALUE = 1;

	/**
	 * The '<em><b>NEARLINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources need to be retrieved from relatively slow media.
	 * <!-- end-model-doc -->
	 * @see #NEARLINE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEARLINE_VALUE = 2;

	/**
	 * The '<em><b>UNAVAILABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources cannot be retrieved.
	 * <!-- end-model-doc -->
	 * @see #UNAVAILABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNAVAILABLE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Instance Availability List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InstanceAvailabilityList[] VALUES_ARRAY =
		new InstanceAvailabilityList[] {
			ONLINE,
			OFFLINE,
			NEARLINE,
			UNAVAILABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Instance Availability List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InstanceAvailabilityList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Instance Availability List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstanceAvailabilityList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstanceAvailabilityList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instance Availability List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstanceAvailabilityList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstanceAvailabilityList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instance Availability List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstanceAvailabilityList get(int value) {
		switch (value) {
			case ONLINE_VALUE: return ONLINE;
			case OFFLINE_VALUE: return OFFLINE;
			case NEARLINE_VALUE: return NEARLINE;
			case UNAVAILABLE_VALUE: return UNAVAILABLE;
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
	private InstanceAvailabilityList(int value, String name, String literal) {
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
	
} //InstanceAvailabilityList
