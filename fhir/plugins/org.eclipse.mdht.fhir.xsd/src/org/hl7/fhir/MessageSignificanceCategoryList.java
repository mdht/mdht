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
 * A representation of the literals of the enumeration '<em><b>Message Significance Category List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getMessageSignificanceCategoryList()
 * @model extendedMetaData="name='MessageSignificanceCategory-list'"
 * @generated
 */
public enum MessageSignificanceCategoryList implements Enumerator {
	/**
	 * The '<em><b>Consequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	CONSEQUENCE(0, "Consequence", "Consequence"),

	/**
	 * The '<em><b>Currency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENCY_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENCY(1, "Currency", "Currency"),

	/**
	 * The '<em><b>Notification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	NOTIFICATION(2, "Notification", "Notification");

	/**
	 * The '<em><b>Consequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message represents/requests a change that should not be processed more than once. E.g. Making a booking for an appointment
	 * <!-- end-model-doc -->
	 * @see #CONSEQUENCE
	 * @model name="Consequence"
	 * @generated
	 * @ordered
	 */
	public static final int CONSEQUENCE_VALUE = 0;

	/**
	 * The '<em><b>Currency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message represents a response to query for current information. Retrospective processing is wrong and/or wasteful
	 * <!-- end-model-doc -->
	 * @see #CURRENCY
	 * @model name="Currency"
	 * @generated
	 * @ordered
	 */
	public static final int CURRENCY_VALUE = 1;

	/**
	 * The '<em><b>Notification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content is not necessarily intended to be current, and it can be reprocessed, though there may be version issues created by processing old notifications
	 * <!-- end-model-doc -->
	 * @see #NOTIFICATION
	 * @model name="Notification"
	 * @generated
	 * @ordered
	 */
	public static final int NOTIFICATION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Message Significance Category List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageSignificanceCategoryList[] VALUES_ARRAY =
		new MessageSignificanceCategoryList[] {
			CONSEQUENCE,
			CURRENCY,
			NOTIFICATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Significance Category List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageSignificanceCategoryList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Significance Category List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageSignificanceCategoryList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageSignificanceCategoryList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Significance Category List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageSignificanceCategoryList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageSignificanceCategoryList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Significance Category List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageSignificanceCategoryList get(int value) {
		switch (value) {
			case CONSEQUENCE_VALUE: return CONSEQUENCE;
			case CURRENCY_VALUE: return CURRENCY;
			case NOTIFICATION_VALUE: return NOTIFICATION;
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
	private MessageSignificanceCategoryList(int value, String name, String literal) {
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
	
} //MessageSignificanceCategoryList
