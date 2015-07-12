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
 * A representation of the literals of the enumeration '<em><b>Procedure Request Status List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getProcedureRequestStatusList()
 * @model extendedMetaData="name='ProcedureRequestStatus-list'"
 * @generated
 */
public enum ProcedureRequestStatusList implements Enumerator {
	/**
	 * The '<em><b>Proposed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPOSED_VALUE
	 * @generated
	 * @ordered
	 */
	PROPOSED(0, "proposed", "proposed"),

	/**
	 * The '<em><b>Draft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	DRAFT(1, "draft", "draft"),

	/**
	 * The '<em><b>Requested</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUESTED_VALUE
	 * @generated
	 * @ordered
	 */
	REQUESTED(2, "requested", "requested"),

	/**
	 * The '<em><b>Received</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVED_VALUE
	 * @generated
	 * @ordered
	 */
	RECEIVED(3, "received", "received"),

	/**
	 * The '<em><b>Accepted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTED(4, "accepted", "accepted"),

	/**
	 * The '<em><b>In Progress</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PROGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PROGRESS(5, "inProgress", "in-progress"),

	/**
	 * The '<em><b>Completed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED(6, "completed", "completed"),

	/**
	 * The '<em><b>Suspended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPENDED_VALUE
	 * @generated
	 * @ordered
	 */
	SUSPENDED(7, "suspended", "suspended"),

	/**
	 * The '<em><b>Rejected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECTED_VALUE
	 * @generated
	 * @ordered
	 */
	REJECTED(8, "rejected", "rejected"),

	/**
	 * The '<em><b>Aborted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORTED_VALUE
	 * @generated
	 * @ordered
	 */
	ABORTED(9, "aborted", "aborted");

	/**
	 * The '<em><b>Proposed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The request has been proposed.
	 * <!-- end-model-doc -->
	 * @see #PROPOSED
	 * @model name="proposed"
	 * @generated
	 * @ordered
	 */
	public static final int PROPOSED_VALUE = 0;

	/**
	 * The '<em><b>Draft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The request is in preliminary form, prior to being requested.
	 * <!-- end-model-doc -->
	 * @see #DRAFT
	 * @model name="draft"
	 * @generated
	 * @ordered
	 */
	public static final int DRAFT_VALUE = 1;

	/**
	 * The '<em><b>Requested</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The request has been placed.
	 * <!-- end-model-doc -->
	 * @see #REQUESTED
	 * @model name="requested"
	 * @generated
	 * @ordered
	 */
	public static final int REQUESTED_VALUE = 2;

	/**
	 * The '<em><b>Received</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The receiving system has received the request but not yet decided whether it will be performed.
	 * <!-- end-model-doc -->
	 * @see #RECEIVED
	 * @model name="received"
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVED_VALUE = 3;

	/**
	 * The '<em><b>Accepted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The receiving system has accepted the request, but work has not yet commenced.
	 * <!-- end-model-doc -->
	 * @see #ACCEPTED
	 * @model name="accepted"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTED_VALUE = 4;

	/**
	 * The '<em><b>In Progress</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The work to fulfill the request is happening.
	 * <!-- end-model-doc -->
	 * @see #IN_PROGRESS
	 * @model name="inProgress" literal="in-progress"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROGRESS_VALUE = 5;

	/**
	 * The '<em><b>Completed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The work has been complete, the report(s) released, and no further work is planned.
	 * <!-- end-model-doc -->
	 * @see #COMPLETED
	 * @model name="completed"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_VALUE = 6;

	/**
	 * The '<em><b>Suspended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The request has been held by originating system/user request.
	 * <!-- end-model-doc -->
	 * @see #SUSPENDED
	 * @model name="suspended"
	 * @generated
	 * @ordered
	 */
	public static final int SUSPENDED_VALUE = 7;

	/**
	 * The '<em><b>Rejected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The receiving system has declined to fulfill the request.
	 * <!-- end-model-doc -->
	 * @see #REJECTED
	 * @model name="rejected"
	 * @generated
	 * @ordered
	 */
	public static final int REJECTED_VALUE = 8;

	/**
	 * The '<em><b>Aborted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The request was attempted, but due to some procedural error, it could not be completed.
	 * <!-- end-model-doc -->
	 * @see #ABORTED
	 * @model name="aborted"
	 * @generated
	 * @ordered
	 */
	public static final int ABORTED_VALUE = 9;

	/**
	 * An array of all the '<em><b>Procedure Request Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProcedureRequestStatusList[] VALUES_ARRAY =
		new ProcedureRequestStatusList[] {
			PROPOSED,
			DRAFT,
			REQUESTED,
			RECEIVED,
			ACCEPTED,
			IN_PROGRESS,
			COMPLETED,
			SUSPENDED,
			REJECTED,
			ABORTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Procedure Request Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProcedureRequestStatusList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Procedure Request Status List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcedureRequestStatusList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcedureRequestStatusList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Procedure Request Status List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcedureRequestStatusList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcedureRequestStatusList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Procedure Request Status List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcedureRequestStatusList get(int value) {
		switch (value) {
			case PROPOSED_VALUE: return PROPOSED;
			case DRAFT_VALUE: return DRAFT;
			case REQUESTED_VALUE: return REQUESTED;
			case RECEIVED_VALUE: return RECEIVED;
			case ACCEPTED_VALUE: return ACCEPTED;
			case IN_PROGRESS_VALUE: return IN_PROGRESS;
			case COMPLETED_VALUE: return COMPLETED;
			case SUSPENDED_VALUE: return SUSPENDED;
			case REJECTED_VALUE: return REJECTED;
			case ABORTED_VALUE: return ABORTED;
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
	private ProcedureRequestStatusList(int value, String name, String literal) {
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
	
} //ProcedureRequestStatusList
