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
 * A representation of the literals of the enumeration '<em><b>Sort Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The collating order of a sort.
 * <!-- end-model-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getSortDirection()
 * @model extendedMetaData="name='SortDirection'"
 * @generated
 */
public enum SortDirection implements Enumerator {
	/**
	 * The '<em><b>ASCENDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #ASCENDING_VALUE
	 * @generated
	 * @ordered
	 */
	ASCENDING(0, "ASCENDING", "ASCENDING"),

	/**
	 * The '<em><b>DESCENDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #DESCENDING_VALUE
	 * @generated
	 * @ordered
	 */
	DESCENDING(1, "DESCENDING", "DESCENDING");

	/**
	 * The '<em><b>ASCENDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * sort in ascending collation order
	 * <!-- end-model-doc -->
	 * 
	 * @see #ASCENDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASCENDING_VALUE = 0;

	/**
	 * The '<em><b>DESCENDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * sort in descending collation order
	 * <!-- end-model-doc -->
	 * 
	 * @see #DESCENDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DESCENDING_VALUE = 1;

	/**
	 * An array of all the '<em><b>Sort Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final SortDirection[] VALUES_ARRAY = new SortDirection[] { ASCENDING, DESCENDING, };

	/**
	 * A public read-only list of all the '<em><b>Sort Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<SortDirection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sort Direction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static SortDirection get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SortDirection result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sort Direction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static SortDirection getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SortDirection result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sort Direction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static SortDirection get(int value) {
		switch (value) {
			case ASCENDING_VALUE:
				return ASCENDING;
			case DESCENDING_VALUE:
				return DESCENDING;
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
	private SortDirection(int value, String name, String literal) {
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

} // SortDirection
