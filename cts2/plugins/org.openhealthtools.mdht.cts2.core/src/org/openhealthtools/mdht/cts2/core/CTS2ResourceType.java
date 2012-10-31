/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CTS2 Resource Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * the resource types that can be described in a CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub> service
 * <!-- end-model-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getCTS2ResourceType()
 * @model extendedMetaData="name='CTS2ResourceType'"
 * @generated
 */
public enum CTS2ResourceType implements Enumerator {
	/**
	 * The '<em><b>CODESYSTEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #CODESYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	CODESYSTEM(0, "CODESYSTEM", "CODE_SYSTEM"),

	/**
	 * The '<em><b>CODESYSTEMVERSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #CODESYSTEMVERSION_VALUE
	 * @generated
	 * @ordered
	 */
	CODESYSTEMVERSION(1, "CODESYSTEMVERSION", "CODE_SYSTEM_VERSION"),

	/**
	 * The '<em><b>CONCEPTDOMAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #CONCEPTDOMAIN_VALUE
	 * @generated
	 * @ordered
	 */
	CONCEPTDOMAIN(2, "CONCEPTDOMAIN", "CONCEPT_DOMAIN"),

	/**
	 * The '<em><b>MAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #MAP_VALUE
	 * @generated
	 * @ordered
	 */
	MAP(3, "MAP", "MAP"),

	/**
	 * The '<em><b>MAPVERSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #MAPVERSION_VALUE
	 * @generated
	 * @ordered
	 */
	MAPVERSION(4, "MAPVERSION", "MAP_VERSION"),

	/**
	 * The '<em><b>VALUESET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #VALUESET_VALUE
	 * @generated
	 * @ordered
	 */
	VALUESET(5, "VALUESET", "VALUE_SET"),

	/**
	 * The '<em><b>VALUESETDEFINITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #VALUESETDEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	VALUESETDEFINITION(6, "VALUESETDEFINITION", "VALUE_SET_DEFINITION");

	/**
	 * The '<em><b>CODESYSTEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an ontology, classification scheme, thesaurus or code system
	 * <!-- end-model-doc -->
	 * 
	 * @see #CODESYSTEM
	 * @model literal="CODE_SYSTEM"
	 * @generated
	 * @ordered
	 */
	public static final int CODESYSTEM_VALUE = 0;

	/**
	 * The '<em><b>CODESYSTEMVERSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a specific release or version of an ontology, classification scheme, thesaurus or code system.
	 * <!-- end-model-doc -->
	 * 
	 * @see #CODESYSTEMVERSION
	 * @model literal="CODE_SYSTEM_VERSION"
	 * @generated
	 * @ordered
	 */
	public static final int CODESYSTEMVERSION_VALUE = 1;

	/**
	 * The '<em><b>CONCEPTDOMAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a "data element concept" - a specification of the conceptual domain of an element in a database, form, message, etc.
	 * <!-- end-model-doc -->
	 * 
	 * @see #CONCEPTDOMAIN
	 * @model literal="CONCEPT_DOMAIN"
	 * @generated
	 * @ordered
	 */
	public static final int CONCEPTDOMAIN_VALUE = 2;

	/**
	 * The '<em><b>MAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a set of rules for transforming a set of entity references into a second set of entity references, drawn from a different code system or value
	 * set.
	 * <!-- end-model-doc -->
	 * 
	 * @see #MAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAP_VALUE = 3;

	/**
	 * The '<em><b>MAPVERSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a specific version or release of a MAP
	 * <!-- end-model-doc -->
	 * 
	 * @see #MAPVERSION
	 * @model literal="MAP_VERSION"
	 * @generated
	 * @ordered
	 */
	public static final int MAPVERSION_VALUE = 4;

	/**
	 * The '<em><b>VALUESET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a set of entity references
	 * <!-- end-model-doc -->
	 * 
	 * @see #VALUESET
	 * @model literal="VALUE_SET"
	 * @generated
	 * @ordered
	 */
	public static final int VALUESET_VALUE = 5;

	/**
	 * The '<em><b>VALUESETDEFINITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a set of rules for establishing which entity references belong to a value set at a given point in time
	 * <!-- end-model-doc -->
	 * 
	 * @see #VALUESETDEFINITION
	 * @model literal="VALUE_SET_DEFINITION"
	 * @generated
	 * @ordered
	 */
	public static final int VALUESETDEFINITION_VALUE = 6;

	/**
	 * An array of all the '<em><b>CTS2 Resource Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final CTS2ResourceType[] VALUES_ARRAY = new CTS2ResourceType[] {
			CODESYSTEM, CODESYSTEMVERSION, CONCEPTDOMAIN, MAP, MAPVERSION, VALUESET, VALUESETDEFINITION, };

	/**
	 * A public read-only list of all the '<em><b>CTS2 Resource Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<CTS2ResourceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CTS2 Resource Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static CTS2ResourceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CTS2ResourceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CTS2 Resource Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static CTS2ResourceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CTS2ResourceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CTS2 Resource Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static CTS2ResourceType get(int value) {
		switch (value) {
			case CODESYSTEM_VALUE:
				return CODESYSTEM;
			case CODESYSTEMVERSION_VALUE:
				return CODESYSTEMVERSION;
			case CONCEPTDOMAIN_VALUE:
				return CONCEPTDOMAIN;
			case MAP_VALUE:
				return MAP;
			case MAPVERSION_VALUE:
				return MAPVERSION;
			case VALUESET_VALUE:
				return VALUESET;
			case VALUESETDEFINITION_VALUE:
				return VALUESETDEFINITION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private CTS2ResourceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // CTS2ResourceType
