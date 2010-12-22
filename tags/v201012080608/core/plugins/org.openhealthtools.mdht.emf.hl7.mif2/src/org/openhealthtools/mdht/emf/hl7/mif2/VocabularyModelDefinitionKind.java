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
 * A representation of the literals of the enumeration '<em><b>Vocabulary Model Definition Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Indicates whether a vocabulary model is a complete model or a subset, and if so, what kind of subset
 * UML: Enumeration defining values for a tag
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyModelDefinitionKind()
 * @model extendedMetaData="name='VocabularyModelDefinitionKind'"
 * @generated
 */
public enum VocabularyModelDefinitionKind implements Enumerator {
	/**
	 * The '<em><b>Complete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETE(0, "complete", "complete"),

	/**
	 * The '<em><b>Partial Validation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_VALIDATION_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIAL_VALIDATION(1, "partialValidation", "partial-validation"),

	/**
	 * The '<em><b>Partial Publishing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_PUBLISHING_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIAL_PUBLISHING(2, "partialPublishing", "partial-publishing"),

	/**
	 * The '<em><b>Partial Implementation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_IMPLEMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIAL_IMPLEMENTATION(3, "partialImplementation", "partial-implementation");

	/**
	 * The '<em><b>Complete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the content of the model rendition represents a complete definition of the vocabulary artifacts present within that model.
	 * <!-- end-model-doc -->
	 * @see #COMPLETE
	 * @model name="complete"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE_VALUE = 0;

	/**
	 * The '<em><b>Partial Validation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the content of the model rendition represents a subset as required for validation of static model definitions.  This representation may include artifacts defined within other models rather than referencing them as dependent models for simplicity of exchange.
	 * <!-- end-model-doc -->
	 * @see #PARTIAL_VALIDATION
	 * @model name="partialValidation" literal="partial-validation"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIAL_VALIDATION_VALUE = 1;

	/**
	 * The '<em><b>Partial Publishing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the content of the model rendition represents a subset as required to expose the vocabulary model for publishing
	 * <!-- end-model-doc -->
	 * @see #PARTIAL_PUBLISHING
	 * @model name="partialPublishing" literal="partial-publishing"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIAL_PUBLISHING_VALUE = 2;

	/**
	 * The '<em><b>Partial Implementation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the content of the model rendition represents the subset needed to perform implementation of a particular set of static artifacts.  This representation may include artifacts defined within other models rather than referencing them as dependent models for simplicity of exchange.
	 * <!-- end-model-doc -->
	 * @see #PARTIAL_IMPLEMENTATION
	 * @model name="partialImplementation" literal="partial-implementation"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIAL_IMPLEMENTATION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Vocabulary Model Definition Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VocabularyModelDefinitionKind[] VALUES_ARRAY =
		new VocabularyModelDefinitionKind[] {
			COMPLETE,
			PARTIAL_VALIDATION,
			PARTIAL_PUBLISHING,
			PARTIAL_IMPLEMENTATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Vocabulary Model Definition Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VocabularyModelDefinitionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Vocabulary Model Definition Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VocabularyModelDefinitionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VocabularyModelDefinitionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vocabulary Model Definition Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VocabularyModelDefinitionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VocabularyModelDefinitionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vocabulary Model Definition Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VocabularyModelDefinitionKind get(int value) {
		switch (value) {
			case COMPLETE_VALUE: return COMPLETE;
			case PARTIAL_VALIDATION_VALUE: return PARTIAL_VALIDATION;
			case PARTIAL_PUBLISHING_VALUE: return PARTIAL_PUBLISHING;
			case PARTIAL_IMPLEMENTATION_VALUE: return PARTIAL_IMPLEMENTATION;
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
	private VocabularyModelDefinitionKind(int value, String name, String literal) {
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
	
} //VocabularyModelDefinitionKind
