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
 * A representation of the literals of the enumeration '<em><b>Measmnt Principle List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getMeasmntPrincipleList()
 * @model extendedMetaData="name='Measmnt-Principle-list'"
 * @generated
 */
public enum MeasmntPrincipleList implements Enumerator {
	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(0, "other", "other"),

	/**
	 * The '<em><b>Chemical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL(1, "chemical", "chemical"),

	/**
	 * The '<em><b>Electrical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRICAL_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRICAL(2, "electrical", "electrical"),

	/**
	 * The '<em><b>Impedance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPEDANCE_VALUE
	 * @generated
	 * @ordered
	 */
	IMPEDANCE(3, "impedance", "impedance"),

	/**
	 * The '<em><b>Nuclear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUCLEAR_VALUE
	 * @generated
	 * @ordered
	 */
	NUCLEAR(4, "nuclear", "nuclear"),

	/**
	 * The '<em><b>Optical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	OPTICAL(5, "optical", "optical"),

	/**
	 * The '<em><b>Thermal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMAL_VALUE
	 * @generated
	 * @ordered
	 */
	THERMAL(6, "thermal", "thermal"),

	/**
	 * The '<em><b>Biological</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIOLOGICAL_VALUE
	 * @generated
	 * @ordered
	 */
	BIOLOGICAL(7, "biological", "biological"),

	/**
	 * The '<em><b>Mechanical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MECHANICAL_VALUE
	 * @generated
	 * @ordered
	 */
	MECHANICAL(8, "mechanical", "mechanical"),

	/**
	 * The '<em><b>Acoustical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACOUSTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	ACOUSTICAL(9, "acoustical", "acoustical"),

	/**
	 * The '<em><b>Manual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL(10, "manual", "manual");

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurement principle isn't in the list
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 0;

	/**
	 * The '<em><b>Chemical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurement is done using chemical
	 * <!-- end-model-doc -->
	 * @see #CHEMICAL
	 * @model name="chemical"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_VALUE = 1;

	/**
	 * The '<em><b>Electrical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurement is done using electrical
	 * <!-- end-model-doc -->
	 * @see #ELECTRICAL
	 * @model name="electrical"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_VALUE = 2;

	/**
	 * The '<em><b>Impedance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurement is done using impedance
	 * <!-- end-model-doc -->
	 * @see #IMPEDANCE
	 * @model name="impedance"
	 * @generated
	 * @ordered
	 */
	public static final int IMPEDANCE_VALUE = 3;

	/**
	 * The '<em><b>Nuclear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurement is done using nuclear
	 * <!-- end-model-doc -->
	 * @see #NUCLEAR
	 * @model name="nuclear"
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_VALUE = 4;

	/**
	 * The '<em><b>Optical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurement is done using optical
	 * <!-- end-model-doc -->
	 * @see #OPTICAL
	 * @model name="optical"
	 * @generated
	 * @ordered
	 */
	public static final int OPTICAL_VALUE = 5;

	/**
	 * The '<em><b>Thermal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurement is done using thermal
	 * <!-- end-model-doc -->
	 * @see #THERMAL
	 * @model name="thermal"
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_VALUE = 6;

	/**
	 * The '<em><b>Biological</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurement is done using biological
	 * <!-- end-model-doc -->
	 * @see #BIOLOGICAL
	 * @model name="biological"
	 * @generated
	 * @ordered
	 */
	public static final int BIOLOGICAL_VALUE = 7;

	/**
	 * The '<em><b>Mechanical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurement is done using mechanical
	 * <!-- end-model-doc -->
	 * @see #MECHANICAL
	 * @model name="mechanical"
	 * @generated
	 * @ordered
	 */
	public static final int MECHANICAL_VALUE = 8;

	/**
	 * The '<em><b>Acoustical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurement is done using acoustical
	 * <!-- end-model-doc -->
	 * @see #ACOUSTICAL
	 * @model name="acoustical"
	 * @generated
	 * @ordered
	 */
	public static final int ACOUSTICAL_VALUE = 9;

	/**
	 * The '<em><b>Manual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurement is done using manual
	 * <!-- end-model-doc -->
	 * @see #MANUAL
	 * @model name="manual"
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_VALUE = 10;

	/**
	 * An array of all the '<em><b>Measmnt Principle List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MeasmntPrincipleList[] VALUES_ARRAY =
		new MeasmntPrincipleList[] {
			OTHER,
			CHEMICAL,
			ELECTRICAL,
			IMPEDANCE,
			NUCLEAR,
			OPTICAL,
			THERMAL,
			BIOLOGICAL,
			MECHANICAL,
			ACOUSTICAL,
			MANUAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Measmnt Principle List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MeasmntPrincipleList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Measmnt Principle List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasmntPrincipleList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasmntPrincipleList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measmnt Principle List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasmntPrincipleList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasmntPrincipleList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measmnt Principle List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasmntPrincipleList get(int value) {
		switch (value) {
			case OTHER_VALUE: return OTHER;
			case CHEMICAL_VALUE: return CHEMICAL;
			case ELECTRICAL_VALUE: return ELECTRICAL;
			case IMPEDANCE_VALUE: return IMPEDANCE;
			case NUCLEAR_VALUE: return NUCLEAR;
			case OPTICAL_VALUE: return OPTICAL;
			case THERMAL_VALUE: return THERMAL;
			case BIOLOGICAL_VALUE: return BIOLOGICAL;
			case MECHANICAL_VALUE: return MECHANICAL;
			case ACOUSTICAL_VALUE: return ACOUSTICAL;
			case MANUAL_VALUE: return MANUAL;
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
	private MeasmntPrincipleList(int value, String name, String literal) {
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
	
} //MeasmntPrincipleList
