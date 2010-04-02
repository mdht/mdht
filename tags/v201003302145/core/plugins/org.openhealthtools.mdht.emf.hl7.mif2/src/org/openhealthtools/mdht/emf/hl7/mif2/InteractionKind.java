/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interaction Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identifies the allowed types of interactions
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionKind()
 * @model extendedMetaData="name='InteractionKind'"
 * @generated
 */
public enum InteractionKind implements Enumerator {
	/**
	 * The '<em><b>Query</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY(0, "Query", "Query"),

	/**
	 * The '<em><b>Query Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY_RESPONSE(1, "QueryResponse", "QueryResponse"),

	/**
	 * The '<em><b>Event Notification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_NOTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT_NOTIFICATION(2, "EventNotification", "EventNotification"),

	/**
	 * The '<em><b>Request For Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_FOR_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_FOR_ACTION(3, "RequestForAction", "RequestForAction"),

	/**
	 * The '<em><b>Request Response Accept</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_RESPONSE_ACCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_RESPONSE_ACCEPT(4, "RequestResponseAccept", "RequestResponseAccept"),

	/**
	 * The '<em><b>Request Response Refuse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_RESPONSE_REFUSE_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_RESPONSE_REFUSE(5, "RequestResponseRefuse", "RequestResponseRefuse"),

	/**
	 * The '<em><b>Untriggered Notification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNTRIGGERED_NOTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	UNTRIGGERED_NOTIFICATION(6, "UntriggeredNotification", "UntriggeredNotification");

	/**
	 * The '<em><b>Query</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Solicits data from the receiver
	 * <!-- end-model-doc -->
	 * @see #QUERY
	 * @model name="Query"
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_VALUE = 0;

	/**
	 * The '<em><b>Query Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns requested data to the query initiator, or an indication that requested data is unavailable.
	 * <!-- end-model-doc -->
	 * @see #QUERY_RESPONSE
	 * @model name="QueryResponse"
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_RESPONSE_VALUE = 1;

	/**
	 * The '<em><b>Event Notification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Informs the receiver about the occurrence of a trigger event, along with full or partial data related to that trigger event.
	 * <!-- end-model-doc -->
	 * @see #EVENT_NOTIFICATION
	 * @model name="EventNotification"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_NOTIFICATION_VALUE = 2;

	/**
	 * The '<em><b>Request For Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Solicits a specific action (trigger event) from the receiver.  Must be an action the receiving Role is theoretically capable of performing.
	 * <!-- end-model-doc -->
	 * @see #REQUEST_FOR_ACTION
	 * @model name="RequestForAction"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_FOR_ACTION_VALUE = 3;

	/**
	 * The '<em><b>Request Response Accept</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notification of the agreement or conditional agreement to perform the requested action (trigger event) or a varient thereof.  I.e. the accept may propose an alternative to the initial request.
	 * <!-- end-model-doc -->
	 * @see #REQUEST_RESPONSE_ACCEPT
	 * @model name="RequestResponseAccept"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_RESPONSE_ACCEPT_VALUE = 4;

	/**
	 * The '<em><b>Request Response Refuse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notification of the refusal to perform the requested action (trigger event).
	 * <!-- end-model-doc -->
	 * @see #REQUEST_RESPONSE_REFUSE
	 * @model name="RequestResponseRefuse"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_RESPONSE_REFUSE_VALUE = 5;

	/**
	 * The '<em><b>Untriggered Notification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transmission of data that is independent of the occurrence of any state-transition event or other interaction.E.g. auto-publish, broadcast, backload
	 * <!-- end-model-doc -->
	 * @see #UNTRIGGERED_NOTIFICATION
	 * @model name="UntriggeredNotification"
	 * @generated
	 * @ordered
	 */
	public static final int UNTRIGGERED_NOTIFICATION_VALUE = 6;

	/**
	 * An array of all the '<em><b>Interaction Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InteractionKind[] VALUES_ARRAY =
		new InteractionKind[] {
			QUERY,
			QUERY_RESPONSE,
			EVENT_NOTIFICATION,
			REQUEST_FOR_ACTION,
			REQUEST_RESPONSE_ACCEPT,
			REQUEST_RESPONSE_REFUSE,
			UNTRIGGERED_NOTIFICATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Interaction Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InteractionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interaction Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InteractionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interaction Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InteractionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interaction Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionKind get(int value) {
		switch (value) {
			case QUERY_VALUE: return QUERY;
			case QUERY_RESPONSE_VALUE: return QUERY_RESPONSE;
			case EVENT_NOTIFICATION_VALUE: return EVENT_NOTIFICATION;
			case REQUEST_FOR_ACTION_VALUE: return REQUEST_FOR_ACTION;
			case REQUEST_RESPONSE_ACCEPT_VALUE: return REQUEST_RESPONSE_ACCEPT;
			case REQUEST_RESPONSE_REFUSE_VALUE: return REQUEST_RESPONSE_REFUSE;
			case UNTRIGGERED_NOTIFICATION_VALUE: return UNTRIGGERED_NOTIFICATION;
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
	private InteractionKind(int value, String name, String literal) {
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
	
} //InteractionKind
