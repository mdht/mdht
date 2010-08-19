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
 * A representation of the literals of the enumeration '<em><b>Revision Frequency Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identifies the update frequency expectations for systems which reference a vocabulary domain
 * UML: Type used in a complex tag value
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getRevisionFrequencyKind()
 * @model extendedMetaData="name='RevisionFrequencyKind'"
 * @generated
 */
public enum RevisionFrequencyKind implements Enumerator {
	/**
	 * The '<em><b>Edition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITION_VALUE
	 * @generated
	 * @ordered
	 */
	EDITION(0, "Edition", "Edition"),

	/**
	 * The '<em><b>Code System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	CODE_SYSTEM(1, "CodeSystem", "CodeSystem");

	/**
	 * The '<em><b>Edition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value-set associated with the domain is 'frozen' at the set of codes available at the time the Edition referenced by the interaction was published.  I.e. The codes which were published by HL7 as part of the edition for 'internal' code systems and the codes which were available in external code systems at the time the edition was published
	 * <!-- end-model-doc -->
	 * @see #EDITION
	 * @model name="Edition"
	 * @generated
	 * @ordered
	 */
	public static final int EDITION_VALUE = 0;

	/**
	 * The '<em><b>Code System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value-set associated with the domain changes with the underlying cod-system.  Applications are expected to support codes from the current version of the code system, regardless of declared edition.
	 * <!-- end-model-doc -->
	 * @see #CODE_SYSTEM
	 * @model name="CodeSystem"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_SYSTEM_VALUE = 1;

	/**
	 * An array of all the '<em><b>Revision Frequency Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RevisionFrequencyKind[] VALUES_ARRAY =
		new RevisionFrequencyKind[] {
			EDITION,
			CODE_SYSTEM,
		};

	/**
	 * A public read-only list of all the '<em><b>Revision Frequency Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RevisionFrequencyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Revision Frequency Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RevisionFrequencyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RevisionFrequencyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Revision Frequency Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RevisionFrequencyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RevisionFrequencyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Revision Frequency Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RevisionFrequencyKind get(int value) {
		switch (value) {
			case EDITION_VALUE: return EDITION;
			case CODE_SYSTEM_VALUE: return CODE_SYSTEM;
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
	private RevisionFrequencyKind(int value, String name, String literal) {
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
	
} //RevisionFrequencyKind
