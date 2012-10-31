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
 * A representation of the literals of the enumeration '<em><b>Finalizable State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * possible states of a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Finalizable</i> resource
 * <!-- end-model-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getFinalizableState()
 * @model extendedMetaData="name='FinalizableState'"
 * @generated
 */
public enum FinalizableState implements Enumerator {
	/**
	 * The '<em><b>OPEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN(0, "OPEN", "OPEN"),

	/**
	 * The '<em><b>FINAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #FINAL_VALUE
	 * @generated
	 * @ordered
	 */
	FINAL(1, "FINAL", "FINAL");

	/**
	 * The '<em><b>OPEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the contents of a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ChangeSet</i> or <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ResourceVersionDescription </i>may change, meaning that the contents cannot be determined by
	 * using the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ChangeSetURI </i>or
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">DocumentURI.</i>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @see #OPEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_VALUE = 0;

	/**
	 * The '<em><b>FINAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the contents of a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ChangeSet</i> or <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ResourceVersionDescription </i>cannot be changed, meaning that they can be unambiguously
	 * referenced via the corresponding URI.
	 * <!-- end-model-doc -->
	 * 
	 * @see #FINAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Finalizable State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final FinalizableState[] VALUES_ARRAY = new FinalizableState[] { OPEN, FINAL, };

	/**
	 * A public read-only list of all the '<em><b>Finalizable State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<FinalizableState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Finalizable State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static FinalizableState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FinalizableState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Finalizable State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static FinalizableState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FinalizableState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Finalizable State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static FinalizableState get(int value) {
		switch (value) {
			case OPEN_VALUE:
				return OPEN;
			case FINAL_VALUE:
				return FINAL;
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
	private FinalizableState(int value, String name, String literal) {
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

} // FinalizableState
