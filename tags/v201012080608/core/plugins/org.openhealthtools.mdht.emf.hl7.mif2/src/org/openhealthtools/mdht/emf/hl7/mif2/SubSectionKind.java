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
 * A representation of the literals of the enumeration '<em><b>Sub Section Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identifies the HL7 'subSection' (business sub-category) to which the package content pertains
 * UML: The name for a package in the package hierarchy
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSubSectionKind()
 * @model extendedMetaData="name='SubSectionKind'"
 * @generated
 */
public enum SubSectionKind implements Enumerator {
	/**
	 * The '<em><b>CO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_VALUE
	 * @generated
	 * @ordered
	 */
	CO(0, "CO", "CO"),

	/**
	 * The '<em><b>FI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FI_VALUE
	 * @generated
	 * @ordered
	 */
	FI(1, "FI", "FI"),

	/**
	 * The '<em><b>MC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MC_VALUE
	 * @generated
	 * @ordered
	 */
	MC(2, "MC", "MC"),

	/**
	 * The '<em><b>MF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MF_VALUE
	 * @generated
	 * @ordered
	 */
	MF(3, "MF", "MF"),

	/**
	 * The '<em><b>PO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PO_VALUE
	 * @generated
	 * @ordered
	 */
	PO(4, "PO", "PO"),

	/**
	 * The '<em><b>PR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PR_VALUE
	 * @generated
	 * @ordered
	 */
	PR(5, "PR", "PR"),

	/**
	 * The '<em><b>QU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QU_VALUE
	 * @generated
	 * @ordered
	 */
	QU(6, "QU", "QU"),

	/**
	 * The '<em><b>RC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RC_VALUE
	 * @generated
	 * @ordered
	 */
	RC(7, "RC", "RC"),

	/**
	 * The '<em><b>RE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RE_VALUE
	 * @generated
	 * @ordered
	 */
	RE(8, "RE", "RE"),

	/**
	 * The '<em><b>UU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UU_VALUE
	 * @generated
	 * @ordered
	 */
	UU(9, "UU", "UU");

	/**
	 * The '<em><b>CO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common
	 * <!-- end-model-doc -->
	 * @see #CO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CO_VALUE = 0;

	/**
	 * The '<em><b>FI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Financial Information
	 * <!-- end-model-doc -->
	 * @see #FI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FI_VALUE = 1;

	/**
	 * The '<em><b>MC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Message Control
	 * <!-- end-model-doc -->
	 * @see #MC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MC_VALUE = 2;

	/**
	 * The '<em><b>MF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Master File
	 * <!-- end-model-doc -->
	 * @see #MF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MF_VALUE = 3;

	/**
	 * The '<em><b>PO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operations
	 * <!-- end-model-doc -->
	 * @see #PO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PO_VALUE = 4;

	/**
	 * The '<em><b>PR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Practice
	 * <!-- end-model-doc -->
	 * @see #PR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PR_VALUE = 5;

	/**
	 * The '<em><b>QU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Query
	 * <!-- end-model-doc -->
	 * @see #QU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QU_VALUE = 6;

	/**
	 * The '<em><b>RC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Records
	 * <!-- end-model-doc -->
	 * @see #RC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RC_VALUE = 7;

	/**
	 * The '<em><b>RE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reasoning
	 * <!-- end-model-doc -->
	 * @see #RE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RE_VALUE = 8;

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
	public static final int UU_VALUE = 9;

	/**
	 * An array of all the '<em><b>Sub Section Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SubSectionKind[] VALUES_ARRAY =
		new SubSectionKind[] {
			CO,
			FI,
			MC,
			MF,
			PO,
			PR,
			QU,
			RC,
			RE,
			UU,
		};

	/**
	 * A public read-only list of all the '<em><b>Sub Section Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SubSectionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sub Section Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubSectionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubSectionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sub Section Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubSectionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubSectionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sub Section Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubSectionKind get(int value) {
		switch (value) {
			case CO_VALUE: return CO;
			case FI_VALUE: return FI;
			case MC_VALUE: return MC;
			case MF_VALUE: return MF;
			case PO_VALUE: return PO;
			case PR_VALUE: return PR;
			case QU_VALUE: return QU;
			case RC_VALUE: return RC;
			case RE_VALUE: return RE;
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
	private SubSectionKind(int value, String name, String literal) {
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
	
} //SubSectionKind
