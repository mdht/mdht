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
 * A representation of the literals of the enumeration '<em><b>XPath Usage Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getXPathUsageTypeList()
 * @model extendedMetaData="name='XPathUsageType-list'"
 * @generated
 */
public enum XPathUsageTypeList implements Enumerator {
	/**
	 * The '<em><b>Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(0, "normal", "normal"),

	/**
	 * The '<em><b>Phonetic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHONETIC_VALUE
	 * @generated
	 * @ordered
	 */
	PHONETIC(1, "phonetic", "phonetic"),

	/**
	 * The '<em><b>Nearby</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEARBY_VALUE
	 * @generated
	 * @ordered
	 */
	NEARBY(2, "nearby", "nearby"),

	/**
	 * The '<em><b>Distance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE(3, "distance", "distance"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "other", "other");

	/**
	 * The '<em><b>Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The search parameter is derived directly from the selected nodes based on the type definitions
	 * <!-- end-model-doc -->
	 * @see #NORMAL
	 * @model name="normal"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 0;

	/**
	 * The '<em><b>Phonetic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The search parameter is derived by a phonetic transform from the selected nodes
	 * <!-- end-model-doc -->
	 * @see #PHONETIC
	 * @model name="phonetic"
	 * @generated
	 * @ordered
	 */
	public static final int PHONETIC_VALUE = 1;

	/**
	 * The '<em><b>Nearby</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The search parameter is based on a spatial transform of the selected nodes
	 * <!-- end-model-doc -->
	 * @see #NEARBY
	 * @model name="nearby"
	 * @generated
	 * @ordered
	 */
	public static final int NEARBY_VALUE = 2;

	/**
	 * The '<em><b>Distance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The search parameter is based on a spatial transform of the selected nodes, using physical distance from the middle
	 * <!-- end-model-doc -->
	 * @see #DISTANCE
	 * @model name="distance"
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_VALUE = 3;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interpretation of the xpath statement is unknown (and can't be automated)
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 4;

	/**
	 * An array of all the '<em><b>XPath Usage Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final XPathUsageTypeList[] VALUES_ARRAY =
		new XPathUsageTypeList[] {
			NORMAL,
			PHONETIC,
			NEARBY,
			DISTANCE,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>XPath Usage Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<XPathUsageTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>XPath Usage Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XPathUsageTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XPathUsageTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XPath Usage Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XPathUsageTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XPathUsageTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XPath Usage Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XPathUsageTypeList get(int value) {
		switch (value) {
			case NORMAL_VALUE: return NORMAL;
			case PHONETIC_VALUE: return PHONETIC;
			case NEARBY_VALUE: return NEARBY;
			case DISTANCE_VALUE: return DISTANCE;
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
	private XPathUsageTypeList(int value, String name, String literal) {
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
	
} //XPathUsageTypeList
