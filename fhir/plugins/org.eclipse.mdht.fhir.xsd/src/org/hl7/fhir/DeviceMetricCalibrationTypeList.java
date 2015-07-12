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
 * A representation of the literals of the enumeration '<em><b>Device Metric Calibration Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getDeviceMetricCalibrationTypeList()
 * @model extendedMetaData="name='DeviceMetricCalibrationType-list'"
 * @generated
 */
public enum DeviceMetricCalibrationTypeList implements Enumerator {
	/**
	 * The '<em><b>Unspecified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSPECIFIED(0, "unspecified", "unspecified"),

	/**
	 * The '<em><b>Offset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFSET_VALUE
	 * @generated
	 * @ordered
	 */
	OFFSET(1, "offset", "offset"),

	/**
	 * The '<em><b>Gain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAIN_VALUE
	 * @generated
	 * @ordered
	 */
	GAIN(2, "gain", "gain"),

	/**
	 * The '<em><b>Two Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_POINT(3, "twoPoint", "two-point");

	/**
	 * The '<em><b>Unspecified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO.
	 * <!-- end-model-doc -->
	 * @see #UNSPECIFIED
	 * @model name="unspecified"
	 * @generated
	 * @ordered
	 */
	public static final int UNSPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>Offset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO.
	 * <!-- end-model-doc -->
	 * @see #OFFSET
	 * @model name="offset"
	 * @generated
	 * @ordered
	 */
	public static final int OFFSET_VALUE = 1;

	/**
	 * The '<em><b>Gain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO.
	 * <!-- end-model-doc -->
	 * @see #GAIN
	 * @model name="gain"
	 * @generated
	 * @ordered
	 */
	public static final int GAIN_VALUE = 2;

	/**
	 * The '<em><b>Two Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO.
	 * <!-- end-model-doc -->
	 * @see #TWO_POINT
	 * @model name="twoPoint" literal="two-point"
	 * @generated
	 * @ordered
	 */
	public static final int TWO_POINT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Device Metric Calibration Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeviceMetricCalibrationTypeList[] VALUES_ARRAY =
		new DeviceMetricCalibrationTypeList[] {
			UNSPECIFIED,
			OFFSET,
			GAIN,
			TWO_POINT,
		};

	/**
	 * A public read-only list of all the '<em><b>Device Metric Calibration Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeviceMetricCalibrationTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Device Metric Calibration Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceMetricCalibrationTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceMetricCalibrationTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Metric Calibration Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceMetricCalibrationTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceMetricCalibrationTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Metric Calibration Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceMetricCalibrationTypeList get(int value) {
		switch (value) {
			case UNSPECIFIED_VALUE: return UNSPECIFIED;
			case OFFSET_VALUE: return OFFSET;
			case GAIN_VALUE: return GAIN;
			case TWO_POINT_VALUE: return TWO_POINT;
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
	private DeviceMetricCalibrationTypeList(int value, String name, String literal) {
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
	
} //DeviceMetricCalibrationTypeList
