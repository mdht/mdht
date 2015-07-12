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
 * A representation of the literals of the enumeration '<em><b>Supply Status List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getSupplyStatusList()
 * @model extendedMetaData="name='SupplyStatus-list'"
 * @generated
 */
public enum SupplyStatusList implements Enumerator {
	/**
	 * The '<em><b>Requested</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUESTED_VALUE
	 * @generated
	 * @ordered
	 */
	REQUESTED(0, "requested", "requested"),

	/**
	 * The '<em><b>Dispensed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPENSED_VALUE
	 * @generated
	 * @ordered
	 */
	DISPENSED(1, "dispensed", "dispensed"),

	/**
	 * The '<em><b>Received</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVED_VALUE
	 * @generated
	 * @ordered
	 */
	RECEIVED(2, "received", "received"),

	/**
	 * The '<em><b>Failed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	FAILED(3, "failed", "failed"),

	/**
	 * The '<em><b>Cancelled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLED(4, "cancelled", "cancelled");

	/**
	 * The '<em><b>Requested</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supply has been requested, but not dispensed.
	 * <!-- end-model-doc -->
	 * @see #REQUESTED
	 * @model name="requested"
	 * @generated
	 * @ordered
	 */
	public static final int REQUESTED_VALUE = 0;

	/**
	 * The '<em><b>Dispensed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supply is part of a pharmacy order and has been dispensed.
	 * <!-- end-model-doc -->
	 * @see #DISPENSED
	 * @model name="dispensed"
	 * @generated
	 * @ordered
	 */
	public static final int DISPENSED_VALUE = 1;

	/**
	 * The '<em><b>Received</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supply has been received by the requestor.
	 * <!-- end-model-doc -->
	 * @see #RECEIVED
	 * @model name="received"
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVED_VALUE = 2;

	/**
	 * The '<em><b>Failed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The supply will not be completed because the supplier was unable or unwilling to supply the item.
	 * <!-- end-model-doc -->
	 * @see #FAILED
	 * @model name="failed"
	 * @generated
	 * @ordered
	 */
	public static final int FAILED_VALUE = 3;

	/**
	 * The '<em><b>Cancelled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The orderer of the supply cancelled the request.
	 * <!-- end-model-doc -->
	 * @see #CANCELLED
	 * @model name="cancelled"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Supply Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SupplyStatusList[] VALUES_ARRAY =
		new SupplyStatusList[] {
			REQUESTED,
			DISPENSED,
			RECEIVED,
			FAILED,
			CANCELLED,
		};

	/**
	 * A public read-only list of all the '<em><b>Supply Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SupplyStatusList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Supply Status List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SupplyStatusList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SupplyStatusList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Supply Status List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SupplyStatusList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SupplyStatusList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Supply Status List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SupplyStatusList get(int value) {
		switch (value) {
			case REQUESTED_VALUE: return REQUESTED;
			case DISPENSED_VALUE: return DISPENSED;
			case RECEIVED_VALUE: return RECEIVED;
			case FAILED_VALUE: return FAILED;
			case CANCELLED_VALUE: return CANCELLED;
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
	private SupplyStatusList(int value, String name, String literal) {
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
	
} //SupplyStatusList
