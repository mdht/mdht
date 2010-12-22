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
 * A representation of the literals of the enumeration '<em><b>Section Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identifies the HL7 'section' (major business category) to which the package content pertains
 * UML: The name for a package in the package hierarchy
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSectionKind()
 * @model extendedMetaData="name='SectionKind'"
 * @generated
 */
public enum SectionKind implements Enumerator {
	/**
	 * The '<em><b>AM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AM_VALUE
	 * @generated
	 * @ordered
	 */
	AM(0, "AM", "AM"),

	/**
	 * The '<em><b>HM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HM_VALUE
	 * @generated
	 * @ordered
	 */
	HM(1, "HM", "HM"),

	/**
	 * The '<em><b>IM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IM_VALUE
	 * @generated
	 * @ordered
	 */
	IM(2, "IM", "IM"),

	/**
	 * The '<em><b>UU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UU_VALUE
	 * @generated
	 * @ordered
	 */
	UU(3, "UU", "UU");

	/**
	 * The '<em><b>AM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Administrative Management
	 * <!-- end-model-doc -->
	 * @see #AM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AM_VALUE = 0;

	/**
	 * The '<em><b>HM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Health and Clinical Management
	 * <!-- end-model-doc -->
	 * @see #HM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HM_VALUE = 1;

	/**
	 * The '<em><b>IM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Infrastructure Management
	 * <!-- end-model-doc -->
	 * @see #IM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IM_VALUE = 2;

	/**
	 * The '<em><b>UU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown
	 * <!-- end-model-doc -->
	 * @see #UU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UU_VALUE = 3;

	/**
	 * An array of all the '<em><b>Section Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SectionKind[] VALUES_ARRAY =
		new SectionKind[] {
			AM,
			HM,
			IM,
			UU,
		};

	/**
	 * A public read-only list of all the '<em><b>Section Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SectionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Section Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SectionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SectionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Section Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SectionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SectionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Section Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SectionKind get(int value) {
		switch (value) {
			case AM_VALUE: return AM;
			case HM_VALUE: return HM;
			case IM_VALUE: return IM;
			case UU_VALUE: return UU;
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
	private SectionKind(int value, String name, String literal) {
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
	
} //SectionKind
