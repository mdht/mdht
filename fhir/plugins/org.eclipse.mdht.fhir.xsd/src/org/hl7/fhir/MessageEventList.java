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
 * A representation of the literals of the enumeration '<em><b>Message Event List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getMessageEventList()
 * @model extendedMetaData="name='MessageEvent-list'"
 * @generated
 */
public enum MessageEventList implements Enumerator {
	/**
	 * The '<em><b>Medication Administration Complete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_ADMINISTRATION_COMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_ADMINISTRATION_COMPLETE(0, "MedicationAdministrationComplete", "MedicationAdministration-Complete"),

	/**
	 * The '<em><b>Medication Administration Nullification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_ADMINISTRATION_NULLIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_ADMINISTRATION_NULLIFICATION(1, "MedicationAdministrationNullification", "MedicationAdministration-Nullification"),

	/**
	 * The '<em><b>Medication Administration Recording</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_ADMINISTRATION_RECORDING_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_ADMINISTRATION_RECORDING(2, "MedicationAdministrationRecording", "MedicationAdministration-Recording"),

	/**
	 * The '<em><b>Medication Administration Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_ADMINISTRATION_UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_ADMINISTRATION_UPDATE(3, "MedicationAdministrationUpdate", "MedicationAdministration-Update"),

	/**
	 * The '<em><b>Admin Notify</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMIN_NOTIFY_VALUE
	 * @generated
	 * @ordered
	 */
	ADMIN_NOTIFY(4, "adminNotify", "admin-notify"),

	/**
	 * The '<em><b>Diagnosticreport Provide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAGNOSTICREPORT_PROVIDE_VALUE
	 * @generated
	 * @ordered
	 */
	DIAGNOSTICREPORT_PROVIDE(5, "diagnosticreportProvide", "diagnosticreport-provide"),

	/**
	 * The '<em><b>Observation Provide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVATION_PROVIDE_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVATION_PROVIDE(6, "observationProvide", "observation-provide"),

	/**
	 * The '<em><b>Patient Link</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT_LINK_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENT_LINK(7, "patientLink", "patient-link"),

	/**
	 * The '<em><b>Patient Unlink</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT_UNLINK_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENT_UNLINK(8, "patientUnlink", "patient-unlink"),

	/**
	 * The '<em><b>Valueset Expand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUESET_EXPAND_VALUE
	 * @generated
	 * @ordered
	 */
	VALUESET_EXPAND(9, "valuesetExpand", "valueset-expand");

	/**
	 * The '<em><b>Medication Administration Complete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change the status of a Medication Administration to show that it is complete.
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_ADMINISTRATION_COMPLETE
	 * @model name="MedicationAdministrationComplete" literal="MedicationAdministration-Complete"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_ADMINISTRATION_COMPLETE_VALUE = 0;

	/**
	 * The '<em><b>Medication Administration Nullification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Someone wishes to record that the record of administration of a medication is in error and should be ignored.
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_ADMINISTRATION_NULLIFICATION
	 * @model name="MedicationAdministrationNullification" literal="MedicationAdministration-Nullification"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_ADMINISTRATION_NULLIFICATION_VALUE = 1;

	/**
	 * The '<em><b>Medication Administration Recording</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that a medication has been recorded against the patient's record.
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_ADMINISTRATION_RECORDING
	 * @model name="MedicationAdministrationRecording" literal="MedicationAdministration-Recording"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_ADMINISTRATION_RECORDING_VALUE = 2;

	/**
	 * The '<em><b>Medication Administration Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update a Medication Administration record.
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_ADMINISTRATION_UPDATE
	 * @model name="MedicationAdministrationUpdate" literal="MedicationAdministration-Update"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_ADMINISTRATION_UPDATE_VALUE = 3;

	/**
	 * The '<em><b>Admin Notify</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notification of a change to an administrative resource (either create or update). Note that there is no delete, though some administrative resources have status or period elements for this use.
	 * <!-- end-model-doc -->
	 * @see #ADMIN_NOTIFY
	 * @model name="adminNotify" literal="admin-notify"
	 * @generated
	 * @ordered
	 */
	public static final int ADMIN_NOTIFY_VALUE = 4;

	/**
	 * The '<em><b>Diagnosticreport Provide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provide a diagnostic report, or update a previously provided diagnostic report.
	 * <!-- end-model-doc -->
	 * @see #DIAGNOSTICREPORT_PROVIDE
	 * @model name="diagnosticreportProvide" literal="diagnosticreport-provide"
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSTICREPORT_PROVIDE_VALUE = 5;

	/**
	 * The '<em><b>Observation Provide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provide a simple observation or update a previously provided simple observation.
	 * <!-- end-model-doc -->
	 * @see #OBSERVATION_PROVIDE
	 * @model name="observationProvide" literal="observation-provide"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVATION_PROVIDE_VALUE = 6;

	/**
	 * The '<em><b>Patient Link</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notification that two patient records actually identify the same patient.
	 * <!-- end-model-doc -->
	 * @see #PATIENT_LINK
	 * @model name="patientLink" literal="patient-link"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_LINK_VALUE = 7;

	/**
	 * The '<em><b>Patient Unlink</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notification that previous advice that two patient records concern the same patient is now considered incorrect.
	 * <!-- end-model-doc -->
	 * @see #PATIENT_UNLINK
	 * @model name="patientUnlink" literal="patient-unlink"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_UNLINK_VALUE = 8;

	/**
	 * The '<em><b>Valueset Expand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The definition of a value set is used to create a simple collection of codes suitable for use for data entry or validation. An expanded value set will be returned, or an error message.
	 * <!-- end-model-doc -->
	 * @see #VALUESET_EXPAND
	 * @model name="valuesetExpand" literal="valueset-expand"
	 * @generated
	 * @ordered
	 */
	public static final int VALUESET_EXPAND_VALUE = 9;

	/**
	 * An array of all the '<em><b>Message Event List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageEventList[] VALUES_ARRAY =
		new MessageEventList[] {
			MEDICATION_ADMINISTRATION_COMPLETE,
			MEDICATION_ADMINISTRATION_NULLIFICATION,
			MEDICATION_ADMINISTRATION_RECORDING,
			MEDICATION_ADMINISTRATION_UPDATE,
			ADMIN_NOTIFY,
			DIAGNOSTICREPORT_PROVIDE,
			OBSERVATION_PROVIDE,
			PATIENT_LINK,
			PATIENT_UNLINK,
			VALUESET_EXPAND,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Event List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageEventList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Event List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageEventList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageEventList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Event List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageEventList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageEventList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Event List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageEventList get(int value) {
		switch (value) {
			case MEDICATION_ADMINISTRATION_COMPLETE_VALUE: return MEDICATION_ADMINISTRATION_COMPLETE;
			case MEDICATION_ADMINISTRATION_NULLIFICATION_VALUE: return MEDICATION_ADMINISTRATION_NULLIFICATION;
			case MEDICATION_ADMINISTRATION_RECORDING_VALUE: return MEDICATION_ADMINISTRATION_RECORDING;
			case MEDICATION_ADMINISTRATION_UPDATE_VALUE: return MEDICATION_ADMINISTRATION_UPDATE;
			case ADMIN_NOTIFY_VALUE: return ADMIN_NOTIFY;
			case DIAGNOSTICREPORT_PROVIDE_VALUE: return DIAGNOSTICREPORT_PROVIDE;
			case OBSERVATION_PROVIDE_VALUE: return OBSERVATION_PROVIDE;
			case PATIENT_LINK_VALUE: return PATIENT_LINK;
			case PATIENT_UNLINK_VALUE: return PATIENT_UNLINK;
			case VALUESET_EXPAND_VALUE: return VALUESET_EXPAND;
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
	private MessageEventList(int value, String name, String literal) {
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
	
} //MessageEventList
