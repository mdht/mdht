/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.association;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Derivation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The derivation of a given statement - whether it is directly asserted by the source, is derived by the application of a reasoner or is unknown
 * because the reasoner or source does not supply such
 * information.
 * <!-- end-model-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationDerivation()
 * @model extendedMetaData="name='AssociationDerivation'"
 * @generated
 */
public enum AssociationDerivation implements Enumerator {
	/**
	 * The '<em><b>ASSERTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #ASSERTED_VALUE
	 * @generated
	 * @ordered
	 */
	ASSERTED(0, "ASSERTED", "ASSERTED"),

	/**
	 * The '<em><b>INFERRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #INFERRED_VALUE
	 * @generated
	 * @ordered
	 */
	INFERRED(1, "INFERRED", "INFERRED");

	/**
	 * The '<em><b>ASSERTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The statement was explicitly asserted by the asserting code system version.
	 * <!-- end-model-doc -->
	 * 
	 * @see #ASSERTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASSERTED_VALUE = 0;

	/**
	 * The '<em><b>INFERRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The statement was <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">not</i> asserted by the code system version, but was logically
	 * inferred by the application of one ormore reasoning algorithms to other statements within the code system
	 * version.
	 * <!-- end-model-doc -->
	 * 
	 * @see #INFERRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INFERRED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Derivation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final AssociationDerivation[] VALUES_ARRAY = new AssociationDerivation[] { ASSERTED, INFERRED, };

	/**
	 * A public read-only list of all the '<em><b>Derivation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<AssociationDerivation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Derivation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static AssociationDerivation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssociationDerivation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Derivation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static AssociationDerivation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssociationDerivation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Derivation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static AssociationDerivation get(int value) {
		switch (value) {
			case ASSERTED_VALUE:
				return ASSERTED;
			case INFERRED_VALUE:
				return INFERRED;
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
	private AssociationDerivation(int value, String name, String literal) {
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

} // AssociationDerivation
