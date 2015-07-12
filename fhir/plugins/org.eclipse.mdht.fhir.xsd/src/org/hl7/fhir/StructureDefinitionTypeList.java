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
 * A representation of the literals of the enumeration '<em><b>Structure Definition Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getStructureDefinitionTypeList()
 * @model extendedMetaData="name='StructureDefinitionType-list'"
 * @generated
 */
public enum StructureDefinitionTypeList implements Enumerator {
	/**
	 * The '<em><b>Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE(0, "type", "type"),

	/**
	 * The '<em><b>Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE(1, "resource", "resource"),

	/**
	 * The '<em><b>Constraint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTRAINT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTRAINT(2, "constraint", "constraint"),

	/**
	 * The '<em><b>Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION(3, "extension", "extension");

	/**
	 * The '<em><b>Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data type - either a primitive or complex structure that defines a set of data elements. These can be used throughout Resource and extension definitions.
	 * <!-- end-model-doc -->
	 * @see #TYPE
	 * @model name="type"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_VALUE = 0;

	/**
	 * The '<em><b>Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource defined by the FHIR specification.
	 * <!-- end-model-doc -->
	 * @see #RESOURCE
	 * @model name="resource"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_VALUE = 1;

	/**
	 * The '<em><b>Constraint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of constraints on a resource or data type that describe how it is used for a particular use.
	 * <!-- end-model-doc -->
	 * @see #CONSTRAINT
	 * @model name="constraint"
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRAINT_VALUE = 2;

	/**
	 * The '<em><b>Extension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A definition of an extension that can be used in a FHIR resource (or a set of constraints on an exsting extension).
	 * <!-- end-model-doc -->
	 * @see #EXTENSION
	 * @model name="extension"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Structure Definition Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StructureDefinitionTypeList[] VALUES_ARRAY =
		new StructureDefinitionTypeList[] {
			TYPE,
			RESOURCE,
			CONSTRAINT,
			EXTENSION,
		};

	/**
	 * A public read-only list of all the '<em><b>Structure Definition Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StructureDefinitionTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Structure Definition Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureDefinitionTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StructureDefinitionTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Structure Definition Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureDefinitionTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StructureDefinitionTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Structure Definition Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureDefinitionTypeList get(int value) {
		switch (value) {
			case TYPE_VALUE: return TYPE;
			case RESOURCE_VALUE: return RESOURCE;
			case CONSTRAINT_VALUE: return CONSTRAINT;
			case EXTENSION_VALUE: return EXTENSION;
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
	private StructureDefinitionTypeList(int value, String name, String literal) {
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
	
} //StructureDefinitionTypeList
