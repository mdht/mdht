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
 * A representation of the literals of the enumeration '<em><b>Medication Prescription Status List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getMedicationPrescriptionStatusList()
 * @model extendedMetaData="name='MedicationPrescriptionStatus-list'"
 * @generated
 */
public enum MedicationPrescriptionStatusList implements Enumerator {
	/**
	 * The '<em><b>Active</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVE(0, "active", "active"),

	/**
	 * The '<em><b>On Hold</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_HOLD_VALUE
	 * @generated
	 * @ordered
	 */
	ON_HOLD(1, "onHold", "on-hold"),

	/**
	 * The '<em><b>Completed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED(2, "completed", "completed"),

	/**
	 * The '<em><b>Entered In Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTERED_IN_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERED_IN_ERROR(3, "enteredInError", "entered-in-error"),

	/**
	 * The '<em><b>Stopped</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOPPED_VALUE
	 * @generated
	 * @ordered
	 */
	STOPPED(4, "stopped", "stopped"),

	/**
	 * The '<em><b>Superceded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPERCEDED_VALUE
	 * @generated
	 * @ordered
	 */
	SUPERCEDED(5, "superceded", "superceded"),

	/**
	 * The '<em><b>Draft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	DRAFT(6, "draft", "draft");

	/**
	 * The '<em><b>Active</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The prescription is 'actionable', but not all actions that are implied by it have occurred yet.
	 * <!-- end-model-doc -->
	 * @see #ACTIVE
	 * @model name="active"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_VALUE = 0;

	/**
	 * The '<em><b>On Hold</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions implied by the prescription have been temporarily halted, but are expected to continue later.  May also be called "suspended".
	 * <!-- end-model-doc -->
	 * @see #ON_HOLD
	 * @model name="onHold" literal="on-hold"
	 * @generated
	 * @ordered
	 */
	public static final int ON_HOLD_VALUE = 1;

	/**
	 * The '<em><b>Completed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All actions that are implied by the prescription have occurred (this will rarely be made explicit).
	 * <!-- end-model-doc -->
	 * @see #COMPLETED
	 * @model name="completed"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_VALUE = 2;

	/**
	 * The '<em><b>Entered In Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The prescription was entered in error and therefore nullified.
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR
	 * @model name="enteredInError" literal="entered-in-error"
	 * @generated
	 * @ordered
	 */
	public static final int ENTERED_IN_ERROR_VALUE = 3;

	/**
	 * The '<em><b>Stopped</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions implied by the prescription have been permanently halted, before all of them occurred.
	 * <!-- end-model-doc -->
	 * @see #STOPPED
	 * @model name="stopped"
	 * @generated
	 * @ordered
	 */
	public static final int STOPPED_VALUE = 4;

	/**
	 * The '<em><b>Superceded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The prescription was replaced by a newer one, which encompasses all the information in the previous one.
	 * <!-- end-model-doc -->
	 * @see #SUPERCEDED
	 * @model name="superceded"
	 * @generated
	 * @ordered
	 */
	public static final int SUPERCEDED_VALUE = 5;

	/**
	 * The '<em><b>Draft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The prescription is not yet 'actionable', i.e. it is a work in progress, required sign-off, need to be run through decision support.
	 * <!-- end-model-doc -->
	 * @see #DRAFT
	 * @model name="draft"
	 * @generated
	 * @ordered
	 */
	public static final int DRAFT_VALUE = 6;

	/**
	 * An array of all the '<em><b>Medication Prescription Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MedicationPrescriptionStatusList[] VALUES_ARRAY =
		new MedicationPrescriptionStatusList[] {
			ACTIVE,
			ON_HOLD,
			COMPLETED,
			ENTERED_IN_ERROR,
			STOPPED,
			SUPERCEDED,
			DRAFT,
		};

	/**
	 * A public read-only list of all the '<em><b>Medication Prescription Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MedicationPrescriptionStatusList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Medication Prescription Status List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MedicationPrescriptionStatusList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MedicationPrescriptionStatusList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Medication Prescription Status List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MedicationPrescriptionStatusList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MedicationPrescriptionStatusList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Medication Prescription Status List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MedicationPrescriptionStatusList get(int value) {
		switch (value) {
			case ACTIVE_VALUE: return ACTIVE;
			case ON_HOLD_VALUE: return ON_HOLD;
			case COMPLETED_VALUE: return COMPLETED;
			case ENTERED_IN_ERROR_VALUE: return ENTERED_IN_ERROR;
			case STOPPED_VALUE: return STOPPED;
			case SUPERCEDED_VALUE: return SUPERCEDED;
			case DRAFT_VALUE: return DRAFT;
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
	private MedicationPrescriptionStatusList(int value, String name, String literal) {
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
	
} //MedicationPrescriptionStatusList
