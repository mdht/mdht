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
 * A representation of the literals of the enumeration '<em><b>Device Metric Category List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getDeviceMetricCategoryList()
 * @model extendedMetaData="name='DeviceMetricCategory-list'"
 * @generated
 */
public enum DeviceMetricCategoryList implements Enumerator {
	/**
	 * The '<em><b>Measurement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MEASUREMENT(0, "measurement", "measurement"),

	/**
	 * The '<em><b>Setting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SETTING_VALUE
	 * @generated
	 * @ordered
	 */
	SETTING(1, "setting", "setting"),

	/**
	 * The '<em><b>Calculation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALCULATION_VALUE
	 * @generated
	 * @ordered
	 */
	CALCULATION(2, "calculation", "calculation"),

	/**
	 * The '<em><b>Unspecified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSPECIFIED(3, "unspecified", "unspecified");

	/**
	 * The '<em><b>Measurement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceObservations generated for this DeviceMetric are measured.
	 * <!-- end-model-doc -->
	 * @see #MEASUREMENT
	 * @model name="measurement"
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE = 0;

	/**
	 * The '<em><b>Setting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceObservations generated for this DeviceMetric is a setting that will influence the behavior of the Device.
	 * <!-- end-model-doc -->
	 * @see #SETTING
	 * @model name="setting"
	 * @generated
	 * @ordered
	 */
	public static final int SETTING_VALUE = 1;

	/**
	 * The '<em><b>Calculation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceObservations generated for this DeviceMetric are calculated.
	 * <!-- end-model-doc -->
	 * @see #CALCULATION
	 * @model name="calculation"
	 * @generated
	 * @ordered
	 */
	public static final int CALCULATION_VALUE = 2;

	/**
	 * The '<em><b>Unspecified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The category of this DeviceMetric is unspecified.
	 * <!-- end-model-doc -->
	 * @see #UNSPECIFIED
	 * @model name="unspecified"
	 * @generated
	 * @ordered
	 */
	public static final int UNSPECIFIED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Device Metric Category List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeviceMetricCategoryList[] VALUES_ARRAY =
		new DeviceMetricCategoryList[] {
			MEASUREMENT,
			SETTING,
			CALCULATION,
			UNSPECIFIED,
		};

	/**
	 * A public read-only list of all the '<em><b>Device Metric Category List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeviceMetricCategoryList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Device Metric Category List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceMetricCategoryList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceMetricCategoryList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Metric Category List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceMetricCategoryList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceMetricCategoryList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Metric Category List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceMetricCategoryList get(int value) {
		switch (value) {
			case MEASUREMENT_VALUE: return MEASUREMENT;
			case SETTING_VALUE: return SETTING;
			case CALCULATION_VALUE: return CALCULATION;
			case UNSPECIFIED_VALUE: return UNSPECIFIED;
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
	private DeviceMetricCategoryList(int value, String name, String literal) {
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
	
} //DeviceMetricCategoryList
