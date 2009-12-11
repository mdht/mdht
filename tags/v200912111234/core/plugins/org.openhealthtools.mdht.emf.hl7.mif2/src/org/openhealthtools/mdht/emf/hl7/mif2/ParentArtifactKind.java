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
 * A representation of the literals of the enumeration '<em><b>Parent Artifact Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A list of the types of artifacts that can be referenced
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getParentArtifactKind()
 * @model extendedMetaData="name='ParentArtifactKind'"
 * @generated
 */
public enum ParentArtifactKind implements Enumerator {
	/**
	 * The '<em><b>Datatype</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATATYPE_VALUE
	 * @generated
	 * @ordered
	 */
	DATATYPE(0, "datatype", "datatype"),

	/**
	 * The '<em><b>Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTY(1, "property", "property"),

	/**
	 * The '<em><b>Class</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS(2, "class", "class"),

	/**
	 * The '<em><b>Attribute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTRIBUTE_VALUE
	 * @generated
	 * @ordered
	 */
	ATTRIBUTE(3, "attribute", "attribute"),

	/**
	 * The '<em><b>Relationship</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIONSHIP_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIONSHIP(4, "relationship", "relationship"),

	/**
	 * The '<em><b>Trigger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIGGER_VALUE
	 * @generated
	 * @ordered
	 */
	TRIGGER(5, "trigger", "trigger"),

	/**
	 * The '<em><b>App Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APP_ROLE_VALUE
	 * @generated
	 * @ordered
	 */
	APP_ROLE(6, "appRole", "appRole");

	/**
	 * The '<em><b>Datatype</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A 'datatypeDefinition' element
	 * <!-- end-model-doc -->
	 * @see #DATATYPE
	 * @model name="datatype"
	 * @generated
	 * @ordered
	 */
	public static final int DATATYPE_VALUE = 0;

	/**
	 * The '<em><b>Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A datatype 'property' element
	 * <!-- end-model-doc -->
	 * @see #PROPERTY
	 * @model name="property"
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_VALUE = 1;

	/**
	 * The '<em><b>Class</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A 'class' element
	 * <!-- end-model-doc -->
	 * @see #CLASS
	 * @model name="class"
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_VALUE = 2;

	/**
	 * The '<em><b>Attribute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A class 'attribute' element
	 * <!-- end-model-doc -->
	 * @see #ATTRIBUTE
	 * @model name="attribute"
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_VALUE = 3;

	/**
	 * The '<em><b>Relationship</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A class 'relationship' element
	 * <!-- end-model-doc -->
	 * @see #RELATIONSHIP
	 * @model name="relationship"
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONSHIP_VALUE = 4;

	/**
	 * The '<em><b>Trigger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A 'triggerEvent' element
	 * <!-- end-model-doc -->
	 * @see #TRIGGER
	 * @model name="trigger"
	 * @generated
	 * @ordered
	 */
	public static final int TRIGGER_VALUE = 5;

	/**
	 * The '<em><b>App Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An 'applicationRole' element
	 * <!-- end-model-doc -->
	 * @see #APP_ROLE
	 * @model name="appRole"
	 * @generated
	 * @ordered
	 */
	public static final int APP_ROLE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Parent Artifact Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParentArtifactKind[] VALUES_ARRAY =
		new ParentArtifactKind[] {
			DATATYPE,
			PROPERTY,
			CLASS,
			ATTRIBUTE,
			RELATIONSHIP,
			TRIGGER,
			APP_ROLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Parent Artifact Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParentArtifactKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parent Artifact Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParentArtifactKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParentArtifactKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parent Artifact Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParentArtifactKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParentArtifactKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parent Artifact Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParentArtifactKind get(int value) {
		switch (value) {
			case DATATYPE_VALUE: return DATATYPE;
			case PROPERTY_VALUE: return PROPERTY;
			case CLASS_VALUE: return CLASS;
			case ATTRIBUTE_VALUE: return ATTRIBUTE;
			case RELATIONSHIP_VALUE: return RELATIONSHIP;
			case TRIGGER_VALUE: return TRIGGER;
			case APP_ROLE_VALUE: return APP_ROLE;
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
	private ParentArtifactKind(int value, String name, String literal) {
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
	
} //ParentArtifactKind
