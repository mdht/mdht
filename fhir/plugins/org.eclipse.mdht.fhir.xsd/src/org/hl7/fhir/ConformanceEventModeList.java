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
 * A representation of the literals of the enumeration '<em><b>Conformance Event Mode List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getConformanceEventModeList()
 * @model extendedMetaData="name='ConformanceEventMode-list'"
 * @generated
 */
public enum ConformanceEventModeList implements Enumerator {
	/**
	 * The '<em><b>Sender</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENDER_VALUE
	 * @generated
	 * @ordered
	 */
	SENDER(0, "sender", "sender"),

	/**
	 * The '<em><b>Receiver</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVER_VALUE
	 * @generated
	 * @ordered
	 */
	RECEIVER(1, "receiver", "receiver");

	/**
	 * The '<em><b>Sender</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The application sends requests and receives responses.
	 * <!-- end-model-doc -->
	 * @see #SENDER
	 * @model name="sender"
	 * @generated
	 * @ordered
	 */
	public static final int SENDER_VALUE = 0;

	/**
	 * The '<em><b>Receiver</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The application receives requests and sends responses.
	 * <!-- end-model-doc -->
	 * @see #RECEIVER
	 * @model name="receiver"
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVER_VALUE = 1;

	/**
	 * An array of all the '<em><b>Conformance Event Mode List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConformanceEventModeList[] VALUES_ARRAY =
		new ConformanceEventModeList[] {
			SENDER,
			RECEIVER,
		};

	/**
	 * A public read-only list of all the '<em><b>Conformance Event Mode List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConformanceEventModeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Conformance Event Mode List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConformanceEventModeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConformanceEventModeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conformance Event Mode List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConformanceEventModeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConformanceEventModeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conformance Event Mode List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConformanceEventModeList get(int value) {
		switch (value) {
			case SENDER_VALUE: return SENDER;
			case RECEIVER_VALUE: return RECEIVER;
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
	private ConformanceEventModeList(int value, String name, String literal) {
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
	
} //ConformanceEventModeList
