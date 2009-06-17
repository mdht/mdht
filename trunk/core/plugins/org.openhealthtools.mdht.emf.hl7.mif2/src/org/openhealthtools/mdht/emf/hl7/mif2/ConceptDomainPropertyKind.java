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
 * A representation of the literals of the enumeration '<em><b>Concept Domain Property Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A list of the types of properties a concept domain may have
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptDomainPropertyKind()
 * @model extendedMetaData="name='ConceptDomainPropertyKind'"
 * @generated
 */
public enum ConceptDomainPropertyKind implements Enumerator {
	/**
	 * The '<em><b>Conceptual Space For Class Code System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCEPTUAL_SPACE_FOR_CLASS_CODE_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	CONCEPTUAL_SPACE_FOR_CLASS_CODE_SYSTEM(0, "ConceptualSpaceForClassCodeSystem", "ConceptualSpaceForClassCodeSystem"),

	/**
	 * The '<em><b>Conceptual Space For Class Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCEPTUAL_SPACE_FOR_CLASS_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	CONCEPTUAL_SPACE_FOR_CLASS_CODE(1, "ConceptualSpaceForClassCode", "ConceptualSpaceForClassCode");

	/**
	 * The '<em><b>Conceptual Space For Class Code System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the code system for the classCode for which the domain defines the conceptual space
	 * <!-- end-model-doc -->
	 * @see #CONCEPTUAL_SPACE_FOR_CLASS_CODE_SYSTEM
	 * @model name="ConceptualSpaceForClassCodeSystem"
	 * @generated
	 * @ordered
	 */
	public static final int CONCEPTUAL_SPACE_FOR_CLASS_CODE_SYSTEM_VALUE = 0;

	/**
	 * The '<em><b>Conceptual Space For Class Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the classCode for which the domain defines the conceptual space
	 * <!-- end-model-doc -->
	 * @see #CONCEPTUAL_SPACE_FOR_CLASS_CODE
	 * @model name="ConceptualSpaceForClassCode"
	 * @generated
	 * @ordered
	 */
	public static final int CONCEPTUAL_SPACE_FOR_CLASS_CODE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Concept Domain Property Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConceptDomainPropertyKind[] VALUES_ARRAY =
		new ConceptDomainPropertyKind[] {
			CONCEPTUAL_SPACE_FOR_CLASS_CODE_SYSTEM,
			CONCEPTUAL_SPACE_FOR_CLASS_CODE,
		};

	/**
	 * A public read-only list of all the '<em><b>Concept Domain Property Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConceptDomainPropertyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Concept Domain Property Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConceptDomainPropertyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConceptDomainPropertyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concept Domain Property Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConceptDomainPropertyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConceptDomainPropertyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concept Domain Property Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConceptDomainPropertyKind get(int value) {
		switch (value) {
			case CONCEPTUAL_SPACE_FOR_CLASS_CODE_SYSTEM_VALUE: return CONCEPTUAL_SPACE_FOR_CLASS_CODE_SYSTEM;
			case CONCEPTUAL_SPACE_FOR_CLASS_CODE_VALUE: return CONCEPTUAL_SPACE_FOR_CLASS_CODE;
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
	private ConceptDomainPropertyKind(int value, String name, String literal) {
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
	
} //ConceptDomainPropertyKind
