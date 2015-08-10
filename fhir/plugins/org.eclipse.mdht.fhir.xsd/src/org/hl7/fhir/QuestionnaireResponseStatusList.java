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
 * A representation of the literals of the enumeration '<em><b>Questionnaire Response Status List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getQuestionnaireResponseStatusList()
 * @model extendedMetaData="name='QuestionnaireResponseStatus-list'"
 * @generated
 */
public enum QuestionnaireResponseStatusList implements Enumerator {
	/**
	 * The '<em><b>In Progress</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PROGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PROGRESS(0, "inProgress", "in-progress"),

	/**
	 * The '<em><b>Completed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED(1, "completed", "completed"),

	/**
	 * The '<em><b>Amended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMENDED_VALUE
	 * @generated
	 * @ordered
	 */
	AMENDED(2, "amended", "amended");

	/**
	 * The '<em><b>In Progress</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This QuestionnaireResponse has been partially filled out with answers, but changes or additions are still expected to be made to it.
	 * <!-- end-model-doc -->
	 * @see #IN_PROGRESS
	 * @model name="inProgress" literal="in-progress"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROGRESS_VALUE = 0;

	/**
	 * The '<em><b>Completed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This QuestionnaireResponse has been filled out with answers, and the current content is regarded as definitive.
	 * <!-- end-model-doc -->
	 * @see #COMPLETED
	 * @model name="completed"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_VALUE = 1;

	/**
	 * The '<em><b>Amended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This QuestionnaireResponse has been filled out with answers, then marked as complete, yet changes or additions have been made to it afterwards.
	 * <!-- end-model-doc -->
	 * @see #AMENDED
	 * @model name="amended"
	 * @generated
	 * @ordered
	 */
	public static final int AMENDED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Questionnaire Response Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QuestionnaireResponseStatusList[] VALUES_ARRAY =
		new QuestionnaireResponseStatusList[] {
			IN_PROGRESS,
			COMPLETED,
			AMENDED,
		};

	/**
	 * A public read-only list of all the '<em><b>Questionnaire Response Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QuestionnaireResponseStatusList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Questionnaire Response Status List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QuestionnaireResponseStatusList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QuestionnaireResponseStatusList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Questionnaire Response Status List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QuestionnaireResponseStatusList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QuestionnaireResponseStatusList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Questionnaire Response Status List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QuestionnaireResponseStatusList get(int value) {
		switch (value) {
			case IN_PROGRESS_VALUE: return IN_PROGRESS;
			case COMPLETED_VALUE: return COMPLETED;
			case AMENDED_VALUE: return AMENDED;
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
	private QuestionnaireResponseStatusList(int value, String name, String literal) {
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
	
} //QuestionnaireResponseStatusList
