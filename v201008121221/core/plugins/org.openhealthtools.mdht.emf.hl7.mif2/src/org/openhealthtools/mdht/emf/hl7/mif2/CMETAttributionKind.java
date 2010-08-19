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
 * A representation of the literals of the enumeration '<em><b>CMET Attribution Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Provides the different 'types' of diagrams
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCMETAttributionKind()
 * @model extendedMetaData="name='CMETAttributionKind'"
 * @generated
 */
public enum CMETAttributionKind implements Enumerator {
	/**
	 * The '<em><b>Universal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIVERSAL_VALUE
	 * @generated
	 * @ordered
	 */
	UNIVERSAL(0, "universal", "universal"),

	/**
	 * The '<em><b>Minimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	MINIMAL(1, "minimal", "minimal"),

	/**
	 * The '<em><b>Contact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTACT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTACT(2, "contact", "contact"),

	/**
	 * The '<em><b>Informational</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATIONAL(3, "informational", "informational"),

	/**
	 * The '<em><b>Identified Confirmable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTIFIED_CONFIRMABLE_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTIFIED_CONFIRMABLE(4, "identifiedConfirmable", "identified-confirmable"),

	/**
	 * The '<em><b>Identified Informational</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTIFIED_INFORMATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTIFIED_INFORMATIONAL(5, "identifiedInformational", "identified-informational"),

	/**
	 * The '<em><b>Identified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTIFIED(6, "identified", "identified");

	/**
	 * The '<em><b>Universal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * this variant includes all attributes and associations present in the R-MIM. Any of non-mandatory and non-required attributes and/or associations may be present or absent, as permitted in the cardinality constraints.
	 * <!-- end-model-doc -->
	 * @see #UNIVERSAL
	 * @model name="universal"
	 * @generated
	 * @ordered
	 */
	public static final int UNIVERSAL_VALUE = 0;

	/**
	 * The '<em><b>Minimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * provides more than identified, but not as much as universal. There are not expected to be many of these.
	 * <!-- end-model-doc -->
	 * @see #MINIMAL
	 * @model name="minimal"
	 * @generated
	 * @ordered
	 */
	public static final int MINIMAL_VALUE = 1;

	/**
	 * The '<em><b>Contact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * provides sufficient information to allow the object identified to be contacted. This is likely to have the content of identified and confirmable plus telephone number.
	 * <!-- end-model-doc -->
	 * @see #CONTACT
	 * @model name="contact"
	 * @generated
	 * @ordered
	 */
	public static final int CONTACT_VALUE = 2;

	/**
	 * The '<em><b>Informational</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * generally the same information content as "contactable", but with required (not mandatory) ids on entry point class. This flavor allows expression of the CMET even when mandatory information is not known.
	 * <!-- end-model-doc -->
	 * @see #INFORMATIONAL
	 * @model name="informational"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATIONAL_VALUE = 3;

	/**
	 * The '<em><b>Identified Confirmable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * this extends the identified variant by adding just sufficient additional information to allow the identity of object modeled to be confirmed by a number of corroborating items of data; for instance a patient's date of birth and current address. However, specific contact information, such as telephone number, are not viewed as confirming information.
	 * <!-- end-model-doc -->
	 * @see #IDENTIFIED_CONFIRMABLE
	 * @model name="identifiedConfirmable" literal="identified-confirmable"
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIED_CONFIRMABLE_VALUE = 4;

	/**
	 * The '<em><b>Identified Informational</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * generally the same information content as "contactable" but using new "informational" CMETs as dependant CMETs. This flavor allows expression of the CMET when non-focal class information is not known.
	 * <!-- end-model-doc -->
	 * @see #IDENTIFIED_INFORMATIONAL
	 * @model name="identifiedInformational" literal="identified-informational"
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIED_INFORMATIONAL_VALUE = 5;

	/**
	 * The '<em><b>Identified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * this variant is a proper subset of universal and is intended to provide sufficient information to identify the object(s) modeled by the CMET. This variant is only suitable for use within TIGHTLY COUPLED SYSTEMS ONLY. This variant provides ONLY the ID (and code where applicable) and Name. Other variants may not be substituted at runtime.
	 * <!-- end-model-doc -->
	 * @see #IDENTIFIED
	 * @model name="identified"
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIED_VALUE = 6;

	/**
	 * An array of all the '<em><b>CMET Attribution Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CMETAttributionKind[] VALUES_ARRAY =
		new CMETAttributionKind[] {
			UNIVERSAL,
			MINIMAL,
			CONTACT,
			INFORMATIONAL,
			IDENTIFIED_CONFIRMABLE,
			IDENTIFIED_INFORMATIONAL,
			IDENTIFIED,
		};

	/**
	 * A public read-only list of all the '<em><b>CMET Attribution Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CMETAttributionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CMET Attribution Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CMETAttributionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CMETAttributionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CMET Attribution Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CMETAttributionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CMETAttributionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CMET Attribution Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CMETAttributionKind get(int value) {
		switch (value) {
			case UNIVERSAL_VALUE: return UNIVERSAL;
			case MINIMAL_VALUE: return MINIMAL;
			case CONTACT_VALUE: return CONTACT;
			case INFORMATIONAL_VALUE: return INFORMATIONAL;
			case IDENTIFIED_CONFIRMABLE_VALUE: return IDENTIFIED_CONFIRMABLE;
			case IDENTIFIED_INFORMATIONAL_VALUE: return IDENTIFIED_INFORMATIONAL;
			case IDENTIFIED_VALUE: return IDENTIFIED;
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
	private CMETAttributionKind(int value, String name, String literal) {
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
	
} //CMETAttributionKind
