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
 * A representation of the literals of the enumeration '<em><b>Default Determiner Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Indicates places defaults can be drawn from
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDefaultDeterminerKind()
 * @model extendedMetaData="name='DefaultDeterminerKind'"
 * @generated
 */
public enum DefaultDeterminerKind implements Enumerator {
	/**
	 * The '<em><b>ITS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITS_VALUE
	 * @generated
	 * @ordered
	 */
	ITS(0, "ITS", "ITS"),

	/**
	 * The '<em><b>Referencing Attribute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCING_ATTRIBUTE_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCING_ATTRIBUTE(1, "ReferencingAttribute", "ReferencingAttribute"),

	/**
	 * The '<em><b>Realm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REALM_VALUE
	 * @generated
	 * @ordered
	 */
	REALM(2, "Realm", "Realm");

	/**
	 * The '<em><b>ITS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value is determined by the Implementation Technology Specification used to encode the model referencing the datatype.
	 * <!-- end-model-doc -->
	 * @see #ITS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITS_VALUE = 0;

	/**
	 * The '<em><b>Referencing Attribute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value is determined by the definition of the attribute that references the datatype.
	 * <!-- end-model-doc -->
	 * @see #REFERENCING_ATTRIBUTE
	 * @model name="ReferencingAttribute"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCING_ATTRIBUTE_VALUE = 1;

	/**
	 * The '<em><b>Realm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value is determined by the realm in which the model instance is constructed.
	 * <!-- end-model-doc -->
	 * @see #REALM
	 * @model name="Realm"
	 * @generated
	 * @ordered
	 */
	public static final int REALM_VALUE = 2;

	/**
	 * An array of all the '<em><b>Default Determiner Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DefaultDeterminerKind[] VALUES_ARRAY =
		new DefaultDeterminerKind[] {
			ITS,
			REFERENCING_ATTRIBUTE,
			REALM,
		};

	/**
	 * A public read-only list of all the '<em><b>Default Determiner Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DefaultDeterminerKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Default Determiner Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DefaultDeterminerKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DefaultDeterminerKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Default Determiner Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DefaultDeterminerKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DefaultDeterminerKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Default Determiner Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DefaultDeterminerKind get(int value) {
		switch (value) {
			case ITS_VALUE: return ITS;
			case REFERENCING_ATTRIBUTE_VALUE: return REFERENCING_ATTRIBUTE;
			case REALM_VALUE: return REALM;
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
	private DefaultDeterminerKind(int value, String name, String literal) {
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
	
} //DefaultDeterminerKind
