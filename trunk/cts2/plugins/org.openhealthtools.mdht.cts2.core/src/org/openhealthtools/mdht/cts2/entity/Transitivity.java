/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transitivity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * an indicator that determines whether an object property is considered to be transitive
 * <!-- end-model-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getTransitivity()
 * @model extendedMetaData="name='Transitivity'"
 * @generated
 */
public enum Transitivity implements Enumerator {
	/**
	 * The '<em><b>TRANSITIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #TRANSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSITIVE(0, "TRANSITIVE", "TRANSITIVE"),

	/**
	 * The '<em><b>INTRANSITIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #INTRANSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	INTRANSITIVE(1, "INTRANSITIVE", "INTRANSITIVE"),

	/**
	 * The '<em><b>ANTITRANSITIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #ANTITRANSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ANTITRANSITIVE(2, "ANTITRANSITIVE", "ANTITRANSITIVE");

	/**
	 * The '<em><b>TRANSITIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * asserts $\forall a, b, c : C @ p(a,b) \land p(b, c) \implies p(a,c)$
	 * <!-- end-model-doc -->
	 * 
	 * @see #TRANSITIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITIVE_VALUE = 0;

	/**
	 * The '<em><b>INTRANSITIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * asserts $\forall a, b, c : C @ \lnot(p(a,b) \land p(b, c) \implies p(a,c))$
	 * <!-- end-model-doc -->
	 * 
	 * @see #INTRANSITIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTRANSITIVE_VALUE = 1;

	/**
	 * The '<em><b>ANTITRANSITIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * asserts $\forall a, b, c : C @ p(a,b) \land p(b, c) \implies \lnot p(a,c)$
	 * <!-- end-model-doc -->
	 * 
	 * @see #ANTITRANSITIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANTITRANSITIVE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Transitivity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final Transitivity[] VALUES_ARRAY = new Transitivity[] { TRANSITIVE, INTRANSITIVE, ANTITRANSITIVE, };

	/**
	 * A public read-only list of all the '<em><b>Transitivity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<Transitivity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transitivity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static Transitivity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Transitivity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transitivity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static Transitivity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Transitivity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transitivity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static Transitivity get(int value) {
		switch (value) {
			case TRANSITIVE_VALUE:
				return TRANSITIVE;
			case INTRANSITIVE_VALUE:
				return INTRANSITIVE;
			case ANTITRANSITIVE_VALUE:
				return ANTITRANSITIVE;
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
	private Transitivity(int value, String name, String literal) {
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

} // Transitivity
