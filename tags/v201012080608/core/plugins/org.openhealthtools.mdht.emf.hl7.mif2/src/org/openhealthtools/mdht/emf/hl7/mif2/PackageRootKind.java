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
 * A representation of the literals of the enumeration '<em><b>Package Root Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identifies the primary 'purpose' of the packaged content
 * UML: The name for the initial set of packages within the 'HL7v3' package
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageRootKind()
 * @model extendedMetaData="name='PackageRootKind'"
 * @generated
 */
public enum PackageRootKind implements Enumerator {
	/**
	 * The '<em><b>DEFN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFN_VALUE
	 * @generated
	 * @ordered
	 */
	DEFN(0, "DEFN", "DEFN"),

	/**
	 * The '<em><b>BAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAL_VALUE
	 * @generated
	 * @ordered
	 */
	BAL(1, "BAL", "BAL"),

	/**
	 * The '<em><b>PUB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUB_VALUE
	 * @generated
	 * @ordered
	 */
	PUB(2, "PUB", "PUB");

	/**
	 * The '<em><b>DEFN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The package represents the artifacts being defined.
	 * <!-- end-model-doc -->
	 * @see #DEFN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFN_VALUE = 0;

	/**
	 * The '<em><b>BAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The package groups a set of content defined elsewhere intended to be submitted for ballot
	 * <!-- end-model-doc -->
	 * @see #BAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAL_VALUE = 1;

	/**
	 * The '<em><b>PUB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The package groups a set of content defined elsewhere as a formal publication
	 * <!-- end-model-doc -->
	 * @see #PUB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUB_VALUE = 2;

	/**
	 * An array of all the '<em><b>Package Root Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PackageRootKind[] VALUES_ARRAY =
		new PackageRootKind[] {
			DEFN,
			BAL,
			PUB,
		};

	/**
	 * A public read-only list of all the '<em><b>Package Root Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PackageRootKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Package Root Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PackageRootKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PackageRootKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Package Root Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PackageRootKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PackageRootKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Package Root Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PackageRootKind get(int value) {
		switch (value) {
			case DEFN_VALUE: return DEFN;
			case BAL_VALUE: return BAL;
			case PUB_VALUE: return PUB;
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
	private PackageRootKind(int value, String name, String literal) {
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
	
} //PackageRootKind
