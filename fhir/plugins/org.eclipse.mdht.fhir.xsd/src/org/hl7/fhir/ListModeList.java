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
 * A representation of the literals of the enumeration '<em><b>List Mode List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getListModeList()
 * @model extendedMetaData="name='ListMode-list'"
 * @generated
 */
public enum ListModeList implements Enumerator {
	/**
	 * The '<em><b>Working</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKING_VALUE
	 * @generated
	 * @ordered
	 */
	WORKING(0, "working", "working"),

	/**
	 * The '<em><b>Snapshot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SNAPSHOT_VALUE
	 * @generated
	 * @ordered
	 */
	SNAPSHOT(1, "snapshot", "snapshot"),

	/**
	 * The '<em><b>Changes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGES_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGES(2, "changes", "changes");

	/**
	 * The '<em><b>Working</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This list is the master list, maintained in an ongoing fashion with regular updates as the real world list it is tracking changes
	 * <!-- end-model-doc -->
	 * @see #WORKING
	 * @model name="working"
	 * @generated
	 * @ordered
	 */
	public static final int WORKING_VALUE = 0;

	/**
	 * The '<em><b>Snapshot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This list was prepared as a snapshot. It should not be assumed to be current
	 * <!-- end-model-doc -->
	 * @see #SNAPSHOT
	 * @model name="snapshot"
	 * @generated
	 * @ordered
	 */
	public static final int SNAPSHOT_VALUE = 1;

	/**
	 * The '<em><b>Changes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list that indicates where changes have been made or recommended
	 * <!-- end-model-doc -->
	 * @see #CHANGES
	 * @model name="changes"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGES_VALUE = 2;

	/**
	 * An array of all the '<em><b>List Mode List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ListModeList[] VALUES_ARRAY =
		new ListModeList[] {
			WORKING,
			SNAPSHOT,
			CHANGES,
		};

	/**
	 * A public read-only list of all the '<em><b>List Mode List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ListModeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>List Mode List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ListModeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ListModeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>List Mode List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ListModeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ListModeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>List Mode List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ListModeList get(int value) {
		switch (value) {
			case WORKING_VALUE: return WORKING;
			case SNAPSHOT_VALUE: return SNAPSHOT;
			case CHANGES_VALUE: return CHANGES;
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
	private ListModeList(int value, String name, String literal) {
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
	
} //ListModeList
