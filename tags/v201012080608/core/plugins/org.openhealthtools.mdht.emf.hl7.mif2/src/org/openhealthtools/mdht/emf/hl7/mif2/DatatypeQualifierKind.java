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
 * A representation of the literals of the enumeration '<em><b>Datatype Qualifier Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The list of qualifiers for datatype references
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeQualifierKind()
 * @model extendedMetaData="name='DatatypeQualifierKind'"
 * @generated
 */
public enum DatatypeQualifierKind implements Enumerator {
	/**
	 * The '<em><b>Datatype</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATATYPE_VALUE
	 * @generated
	 * @ordered
	 */
	DATATYPE(0, "datatype", "datatype"),

	/**
	 * The '<em><b>Parameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETER(1, "parameter", "parameter"),

	/**
	 * The '<em><b>Base Diff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE_DIFF_VALUE
	 * @generated
	 * @ordered
	 */
	BASE_DIFF(2, "baseDiff", "baseDiff"),

	/**
	 * The '<em><b>Parameter Diff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER_DIFF_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETER_DIFF(3, "parameterDiff", "parameterDiff");

	/**
	 * The '<em><b>Datatype</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the referenced name is a datatype
	 * <!-- end-model-doc -->
	 * @see #DATATYPE
	 * @model name="datatype"
	 * @generated
	 * @ordered
	 */
	public static final int DATATYPE_VALUE = 0;

	/**
	 * The '<em><b>Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the referenced name is the name of one of the parent datatype's parameters
	 * <!-- end-model-doc -->
	 * @see #PARAMETER
	 * @model name="parameter"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_VALUE = 1;

	/**
	 * The '<em><b>Base Diff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the reference is to the "difference type" of the parent datatype
	 * <!-- end-model-doc -->
	 * @see #BASE_DIFF
	 * @model name="baseDiff"
	 * @generated
	 * @ordered
	 */
	public static final int BASE_DIFF_VALUE = 2;

	/**
	 * The '<em><b>Parameter Diff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the reference is to the "difference type" of the parent's datatype parameter specified in "name"
	 * <!-- end-model-doc -->
	 * @see #PARAMETER_DIFF
	 * @model name="parameterDiff"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_DIFF_VALUE = 3;

	/**
	 * An array of all the '<em><b>Datatype Qualifier Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DatatypeQualifierKind[] VALUES_ARRAY =
		new DatatypeQualifierKind[] {
			DATATYPE,
			PARAMETER,
			BASE_DIFF,
			PARAMETER_DIFF,
		};

	/**
	 * A public read-only list of all the '<em><b>Datatype Qualifier Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DatatypeQualifierKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Datatype Qualifier Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatatypeQualifierKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatatypeQualifierKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Datatype Qualifier Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatatypeQualifierKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatatypeQualifierKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Datatype Qualifier Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatatypeQualifierKind get(int value) {
		switch (value) {
			case DATATYPE_VALUE: return DATATYPE;
			case PARAMETER_VALUE: return PARAMETER;
			case BASE_DIFF_VALUE: return BASE_DIFF;
			case PARAMETER_DIFF_VALUE: return PARAMETER_DIFF;
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
	private DatatypeQualifierKind(int value, String name, String literal) {
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
	
} //DatatypeQualifierKind
