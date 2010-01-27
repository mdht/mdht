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
 * A representation of the literals of the enumeration '<em><b>Change Request Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Provides the different 'types' of diagrams
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getChangeRequestStatus()
 * @model extendedMetaData="name='ChangeRequestStatus'"
 * @generated
 */
public enum ChangeRequestStatus implements Enumerator {
	/**
	 * The '<em><b>Proposed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPOSED_VALUE
	 * @generated
	 * @ordered
	 */
	PROPOSED(0, "Proposed", "Proposed"),

	/**
	 * The '<em><b>Approved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROVED_VALUE
	 * @generated
	 * @ordered
	 */
	APPROVED(1, "Approved", "Approved"),

	/**
	 * The '<em><b>Rejected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECTED_VALUE
	 * @generated
	 * @ordered
	 */
	REJECTED(2, "Rejected", "Rejected"),

	/**
	 * The '<em><b>Implemented</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTED_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTED(3, "Implemented", "Implemented");

	/**
	 * The '<em><b>Proposed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change request has been submitted for consideration
	 * <!-- end-model-doc -->
	 * @see #PROPOSED
	 * @model name="Proposed"
	 * @generated
	 * @ordered
	 */
	public static final int PROPOSED_VALUE = 0;

	/**
	 * The '<em><b>Approved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There is agreement to proceed with the change or some subset thereof
	 * <!-- end-model-doc -->
	 * @see #APPROVED
	 * @model name="Approved"
	 * @generated
	 * @ordered
	 */
	public static final int APPROVED_VALUE = 1;

	/**
	 * The '<em><b>Rejected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The decision has been made to not proceed with the change
	 * <!-- end-model-doc -->
	 * @see #REJECTED
	 * @model name="Rejected"
	 * @generated
	 * @ordered
	 */
	public static final int REJECTED_VALUE = 2;

	/**
	 * The '<em><b>Implemented</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The requested change (or agreed subset thereof) has been implemented
	 * <!-- end-model-doc -->
	 * @see #IMPLEMENTED
	 * @model name="Implemented"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Change Request Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChangeRequestStatus[] VALUES_ARRAY =
		new ChangeRequestStatus[] {
			PROPOSED,
			APPROVED,
			REJECTED,
			IMPLEMENTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Change Request Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChangeRequestStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Change Request Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeRequestStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeRequestStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Change Request Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeRequestStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeRequestStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Change Request Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeRequestStatus get(int value) {
		switch (value) {
			case PROPOSED_VALUE: return PROPOSED;
			case APPROVED_VALUE: return APPROVED;
			case REJECTED_VALUE: return REJECTED;
			case IMPLEMENTED_VALUE: return IMPLEMENTED;
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
	private ChangeRequestStatus(int value, String name, String literal) {
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
	
} //ChangeRequestStatus
