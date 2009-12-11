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
 * A representation of the literals of the enumeration '<em><b>Affirmative Vote Resolution Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAffirmativeVoteResolutionKind()
 * @model extendedMetaData="name='AffirmativeVoteResolutionKind'"
 * @generated
 */
public enum AffirmativeVoteResolutionKind implements Enumerator {
	/**
	 * The '<em><b>Affirmative Incorporated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFFIRMATIVE_INCORPORATED_VALUE
	 * @generated
	 * @ordered
	 */
	AFFIRMATIVE_INCORPORATED(0, "AffirmativeIncorporated", "Affirmative-Incorporated"),

	/**
	 * The '<em><b>Affirmative Rejected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFFIRMATIVE_REJECTED_VALUE
	 * @generated
	 * @ordered
	 */
	AFFIRMATIVE_REJECTED(1, "AffirmativeRejected", "Affirmative-Rejected"),

	/**
	 * The '<em><b>Affirmative Deferred</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFFIRMATIVE_DEFERRED_VALUE
	 * @generated
	 * @ordered
	 */
	AFFIRMATIVE_DEFERRED(2, "AffirmativeDeferred", "Affirmative-Deferred");

	/**
	 * The '<em><b>Affirmative Incorporated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recommended change has been incorporated or identified issue has been answered.
	 * <!-- end-model-doc -->
	 * @see #AFFIRMATIVE_INCORPORATED
	 * @model name="AffirmativeIncorporated" literal="Affirmative-Incorporated"
	 * @generated
	 * @ordered
	 */
	public static final int AFFIRMATIVE_INCORPORATED_VALUE = 0;

	/**
	 * The '<em><b>Affirmative Rejected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recommended change has been refused and is not expected to be incorporated.
	 * <!-- end-model-doc -->
	 * @see #AFFIRMATIVE_REJECTED
	 * @model name="AffirmativeRejected" literal="Affirmative-Rejected"
	 * @generated
	 * @ordered
	 */
	public static final int AFFIRMATIVE_REJECTED_VALUE = 1;

	/**
	 * The '<em><b>Affirmative Deferred</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recommended change has been deferred to consideration for a future release.
	 * <!-- end-model-doc -->
	 * @see #AFFIRMATIVE_DEFERRED
	 * @model name="AffirmativeDeferred" literal="Affirmative-Deferred"
	 * @generated
	 * @ordered
	 */
	public static final int AFFIRMATIVE_DEFERRED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Affirmative Vote Resolution Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AffirmativeVoteResolutionKind[] VALUES_ARRAY =
		new AffirmativeVoteResolutionKind[] {
			AFFIRMATIVE_INCORPORATED,
			AFFIRMATIVE_REJECTED,
			AFFIRMATIVE_DEFERRED,
		};

	/**
	 * A public read-only list of all the '<em><b>Affirmative Vote Resolution Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AffirmativeVoteResolutionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Affirmative Vote Resolution Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AffirmativeVoteResolutionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AffirmativeVoteResolutionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Affirmative Vote Resolution Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AffirmativeVoteResolutionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AffirmativeVoteResolutionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Affirmative Vote Resolution Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AffirmativeVoteResolutionKind get(int value) {
		switch (value) {
			case AFFIRMATIVE_INCORPORATED_VALUE: return AFFIRMATIVE_INCORPORATED;
			case AFFIRMATIVE_REJECTED_VALUE: return AFFIRMATIVE_REJECTED;
			case AFFIRMATIVE_DEFERRED_VALUE: return AFFIRMATIVE_DEFERRED;
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
	private AffirmativeVoteResolutionKind(int value, String name, String literal) {
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
	
} //AffirmativeVoteResolutionKind
