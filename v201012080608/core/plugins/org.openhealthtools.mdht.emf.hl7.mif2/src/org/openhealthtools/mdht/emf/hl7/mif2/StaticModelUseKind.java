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
 * A representation of the literals of the enumeration '<em><b>Static Model Use Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The allowed uses for a particular static model
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelUseKind()
 * @model extendedMetaData="name='StaticModelUseKind'"
 * @generated
 */
public enum StaticModelUseKind implements Enumerator {
	/**
	 * The '<em><b>Communication Wrapper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_WRAPPER_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION_WRAPPER(0, "CommunicationWrapper", "CommunicationWrapper"),

	/**
	 * The '<em><b>Control Act Wrapper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_ACT_WRAPPER_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROL_ACT_WRAPPER(1, "ControlActWrapper", "ControlActWrapper"),

	/**
	 * The '<em><b>Semantic Payload</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMANTIC_PAYLOAD_VALUE
	 * @generated
	 * @ordered
	 */
	SEMANTIC_PAYLOAD(2, "SemanticPayload", "SemanticPayload"),

	/**
	 * The '<em><b>Presentation Structure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESENTATION_STRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
	PRESENTATION_STRUCTURE(3, "PresentationStructure", "PresentationStructure"),

	/**
	 * The '<em><b>Query Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY_DEFINITION(4, "QueryDefinition", "QueryDefinition"),

	/**
	 * The '<em><b>CMET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CMET_VALUE
	 * @generated
	 * @ordered
	 */
	CMET(5, "CMET", "CMET"),

	/**
	 * The '<em><b>Template</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPLATE_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPLATE(6, "Template", "Template");

	/**
	 * The '<em><b>Communication Wrapper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a communication structure for other content.
	 * <!-- end-model-doc -->
	 * @see #COMMUNICATION_WRAPPER
	 * @model name="CommunicationWrapper"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_WRAPPER_VALUE = 0;

	/**
	 * The '<em><b>Control Act Wrapper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines common information regarding Acts upon a particular payload.
	 * <!-- end-model-doc -->
	 * @see #CONTROL_ACT_WRAPPER
	 * @model name="ControlActWrapper"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_ACT_WRAPPER_VALUE = 1;

	/**
	 * The '<em><b>Semantic Payload</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of content that is the 'focus' of a message or document.
	 * <!-- end-model-doc -->
	 * @see #SEMANTIC_PAYLOAD
	 * @model name="SemanticPayload"
	 * @generated
	 * @ordered
	 */
	public static final int SEMANTIC_PAYLOAD_VALUE = 2;

	/**
	 * The '<em><b>Presentation Structure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the organization and appearance of an underlying model.
	 * <!-- end-model-doc -->
	 * @see #PRESENTATION_STRUCTURE
	 * @model name="PresentationStructure"
	 * @generated
	 * @ordered
	 */
	public static final int PRESENTATION_STRUCTURE_VALUE = 3;

	/**
	 * The '<em><b>Query Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a set of data being solicited.
	 * <!-- end-model-doc -->
	 * @see #QUERY_DEFINITION
	 * @model name="QueryDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_DEFINITION_VALUE = 4;

	/**
	 * The '<em><b>CMET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A re-usable static structure component.
	 * <!-- end-model-doc -->
	 * @see #CMET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CMET_VALUE = 5;

	/**
	 * The '<em><b>Template</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A pattern that can be applied to other models.
	 * <!-- end-model-doc -->
	 * @see #TEMPLATE
	 * @model name="Template"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPLATE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Static Model Use Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StaticModelUseKind[] VALUES_ARRAY =
		new StaticModelUseKind[] {
			COMMUNICATION_WRAPPER,
			CONTROL_ACT_WRAPPER,
			SEMANTIC_PAYLOAD,
			PRESENTATION_STRUCTURE,
			QUERY_DEFINITION,
			CMET,
			TEMPLATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Static Model Use Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StaticModelUseKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Static Model Use Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StaticModelUseKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StaticModelUseKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Static Model Use Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StaticModelUseKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StaticModelUseKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Static Model Use Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StaticModelUseKind get(int value) {
		switch (value) {
			case COMMUNICATION_WRAPPER_VALUE: return COMMUNICATION_WRAPPER;
			case CONTROL_ACT_WRAPPER_VALUE: return CONTROL_ACT_WRAPPER;
			case SEMANTIC_PAYLOAD_VALUE: return SEMANTIC_PAYLOAD;
			case PRESENTATION_STRUCTURE_VALUE: return PRESENTATION_STRUCTURE;
			case QUERY_DEFINITION_VALUE: return QUERY_DEFINITION;
			case CMET_VALUE: return CMET;
			case TEMPLATE_VALUE: return TEMPLATE;
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
	private StaticModelUseKind(int value, String name, String literal) {
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
	
} //StaticModelUseKind
