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
 * A representation of the literals of the enumeration '<em><b>Encounter Class List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getEncounterClassList()
 * @model extendedMetaData="name='EncounterClass-list'"
 * @generated
 */
public enum EncounterClassList implements Enumerator {
	/**
	 * The '<em><b>Inpatient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPATIENT_VALUE
	 * @generated
	 * @ordered
	 */
	INPATIENT(0, "inpatient", "inpatient"),

	/**
	 * The '<em><b>Outpatient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPATIENT_VALUE
	 * @generated
	 * @ordered
	 */
	OUTPATIENT(1, "outpatient", "outpatient"),

	/**
	 * The '<em><b>Ambulatory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMBULATORY_VALUE
	 * @generated
	 * @ordered
	 */
	AMBULATORY(2, "ambulatory", "ambulatory"),

	/**
	 * The '<em><b>Emergency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMERGENCY_VALUE
	 * @generated
	 * @ordered
	 */
	EMERGENCY(3, "emergency", "emergency"),

	/**
	 * The '<em><b>Home</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOME_VALUE
	 * @generated
	 * @ordered
	 */
	HOME(4, "home", "home"),

	/**
	 * The '<em><b>Field</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIELD_VALUE
	 * @generated
	 * @ordered
	 */
	FIELD(5, "field", "field"),

	/**
	 * The '<em><b>Daytime</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIME_VALUE
	 * @generated
	 * @ordered
	 */
	DAYTIME(6, "daytime", "daytime"),

	/**
	 * The '<em><b>Virtual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL(7, "virtual", "virtual"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(8, "other", "other");

	/**
	 * The '<em><b>Inpatient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An encounter during which the patient is hospitalized and stays overnight
	 * <!-- end-model-doc -->
	 * @see #INPATIENT
	 * @model name="inpatient"
	 * @generated
	 * @ordered
	 */
	public static final int INPATIENT_VALUE = 0;

	/**
	 * The '<em><b>Outpatient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An encounter during which the patient is not hospitalized overnight
	 * <!-- end-model-doc -->
	 * @see #OUTPATIENT
	 * @model name="outpatient"
	 * @generated
	 * @ordered
	 */
	public static final int OUTPATIENT_VALUE = 1;

	/**
	 * The '<em><b>Ambulatory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An encounter where the patient visits the practitioner in his/her office, e.g. a G.P. visit
	 * <!-- end-model-doc -->
	 * @see #AMBULATORY
	 * @model name="ambulatory"
	 * @generated
	 * @ordered
	 */
	public static final int AMBULATORY_VALUE = 2;

	/**
	 * The '<em><b>Emergency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An encounter where the patient needs urgent care
	 * <!-- end-model-doc -->
	 * @see #EMERGENCY
	 * @model name="emergency"
	 * @generated
	 * @ordered
	 */
	public static final int EMERGENCY_VALUE = 3;

	/**
	 * The '<em><b>Home</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An encounter where the practitioner visits the patient at his/her home
	 * <!-- end-model-doc -->
	 * @see #HOME
	 * @model name="home"
	 * @generated
	 * @ordered
	 */
	public static final int HOME_VALUE = 4;

	/**
	 * The '<em><b>Field</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An encounter taking place outside the regular environment for giving care
	 * <!-- end-model-doc -->
	 * @see #FIELD
	 * @model name="field"
	 * @generated
	 * @ordered
	 */
	public static final int FIELD_VALUE = 5;

	/**
	 * The '<em><b>Daytime</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An encounter where the patient needs more prolonged treatment or investigations than outpatients, but who do not need to stay in the hospital overnight
	 * <!-- end-model-doc -->
	 * @see #DAYTIME
	 * @model name="daytime"
	 * @generated
	 * @ordered
	 */
	public static final int DAYTIME_VALUE = 6;

	/**
	 * The '<em><b>Virtual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An encounter that takes place where the patient and practitioner do not physically meet but use electronic means for contact
	 * <!-- end-model-doc -->
	 * @see #VIRTUAL
	 * @model name="virtual"
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_VALUE = 7;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any other encounter type that is not described by one of the other values. Where this is used it is expected that an implementer will include an extension value to define what the actual other type is
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 8;

	/**
	 * An array of all the '<em><b>Encounter Class List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EncounterClassList[] VALUES_ARRAY =
		new EncounterClassList[] {
			INPATIENT,
			OUTPATIENT,
			AMBULATORY,
			EMERGENCY,
			HOME,
			FIELD,
			DAYTIME,
			VIRTUAL,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Encounter Class List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EncounterClassList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Encounter Class List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncounterClassList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncounterClassList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encounter Class List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncounterClassList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncounterClassList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encounter Class List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncounterClassList get(int value) {
		switch (value) {
			case INPATIENT_VALUE: return INPATIENT;
			case OUTPATIENT_VALUE: return OUTPATIENT;
			case AMBULATORY_VALUE: return AMBULATORY;
			case EMERGENCY_VALUE: return EMERGENCY;
			case HOME_VALUE: return HOME;
			case FIELD_VALUE: return FIELD;
			case DAYTIME_VALUE: return DAYTIME;
			case VIRTUAL_VALUE: return VIRTUAL;
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
	private EncounterClassList(int value, String name, String literal) {
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
	
} //EncounterClassList
