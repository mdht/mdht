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
 * A representation of the literals of the enumeration '<em><b>Conformance Statement Kind List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getConformanceStatementKindList()
 * @model extendedMetaData="name='ConformanceStatementKind-list'"
 * @generated
 */
public enum ConformanceStatementKindList implements Enumerator {
	/**
	 * The '<em><b>Instance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANCE(0, "instance", "instance"),

	/**
	 * The '<em><b>Capability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	CAPABILITY(1, "capability", "capability"),

	/**
	 * The '<em><b>Requirements</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIREMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIREMENTS(2, "requirements", "requirements");

	/**
	 * The '<em><b>Instance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Conformance instance represents the present capabilities of a specific system instance.  This is the kind returned by OPTIONS for a FHIR server end-point
	 * <!-- end-model-doc -->
	 * @see #INSTANCE
	 * @model name="instance"
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE_VALUE = 0;

	/**
	 * The '<em><b>Capability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Conformance instance represents the capabilities of a system or piece of software, independent of a particular installation.
	 * <!-- end-model-doc -->
	 * @see #CAPABILITY
	 * @model name="capability"
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY_VALUE = 1;

	/**
	 * The '<em><b>Requirements</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Conformance instance represents a set of requirements for other systems to meet.  E.g. as part of an implementation guide or 'request for proposal'
	 * <!-- end-model-doc -->
	 * @see #REQUIREMENTS
	 * @model name="requirements"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENTS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Conformance Statement Kind List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConformanceStatementKindList[] VALUES_ARRAY =
		new ConformanceStatementKindList[] {
			INSTANCE,
			CAPABILITY,
			REQUIREMENTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Conformance Statement Kind List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConformanceStatementKindList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Conformance Statement Kind List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConformanceStatementKindList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConformanceStatementKindList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conformance Statement Kind List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConformanceStatementKindList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConformanceStatementKindList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conformance Statement Kind List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConformanceStatementKindList get(int value) {
		switch (value) {
			case INSTANCE_VALUE: return INSTANCE;
			case CAPABILITY_VALUE: return CAPABILITY;
			case REQUIREMENTS_VALUE: return REQUIREMENTS;
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
	private ConformanceStatementKindList(int value, String name, String literal) {
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
	
} //ConformanceStatementKindList
