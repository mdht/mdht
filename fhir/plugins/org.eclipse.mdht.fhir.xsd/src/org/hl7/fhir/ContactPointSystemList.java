/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Contact Point System List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getContactPointSystemList()
 * @model extendedMetaData="name='ContactPointSystem-list'"
 * @generated
 */
public enum ContactPointSystemList implements Enumerator {
	/**
	 * The '<em><b>Phone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHONE_VALUE
	 * @generated
	 * @ordered
	 */
	PHONE(0, "phone", "phone"),

	/**
	 * The '<em><b>Fax</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAX_VALUE
	 * @generated
	 * @ordered
	 */
	FAX(1, "fax", "fax"),

	/**
	 * The '<em><b>Email</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	EMAIL(2, "email", "email"),

	/**
	 * The '<em><b>Url</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URL_VALUE
	 * @generated
	 * @ordered
	 */
	URL(3, "url", "url");

	/**
	 * The '<em><b>Phone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value is a telephone number used for voice calls. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.
	 * <!-- end-model-doc -->
	 * @see #PHONE
	 * @model name="phone"
	 * @generated
	 * @ordered
	 */
	public static final int PHONE_VALUE = 0;

	/**
	 * The '<em><b>Fax</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value is a fax machine. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.
	 * <!-- end-model-doc -->
	 * @see #FAX
	 * @model name="fax"
	 * @generated
	 * @ordered
	 */
	public static final int FAX_VALUE = 1;

	/**
	 * The '<em><b>Email</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value is an email address.
	 * <!-- end-model-doc -->
	 * @see #EMAIL
	 * @model name="email"
	 * @generated
	 * @ordered
	 */
	public static final int EMAIL_VALUE = 2;

	/**
	 * The '<em><b>Url</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value is a url. This is intended for various personal contacts including blogs, Twitter, Facebook, etc. Do not use for email addresses.
	 * <!-- end-model-doc -->
	 * @see #URL
	 * @model name="url"
	 * @generated
	 * @ordered
	 */
	public static final int URL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Contact Point System List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContactPointSystemList[] VALUES_ARRAY =
		new ContactPointSystemList[] {
			PHONE,
			FAX,
			EMAIL,
			URL,
		};

	/**
	 * A public read-only list of all the '<em><b>Contact Point System List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContactPointSystemList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Contact Point System List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContactPointSystemList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContactPointSystemList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contact Point System List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContactPointSystemList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContactPointSystemList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contact Point System List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContactPointSystemList get(int value) {
		switch (value) {
			case PHONE_VALUE: return PHONE;
			case FAX_VALUE: return FAX;
			case EMAIL_VALUE: return EMAIL;
			case URL_VALUE: return URL;
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
	private ContactPointSystemList(int value, String name, String literal) {
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
	
} //ContactPointSystemList
