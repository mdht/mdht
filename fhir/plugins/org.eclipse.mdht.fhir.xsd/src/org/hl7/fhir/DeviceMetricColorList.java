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
 * A representation of the literals of the enumeration '<em><b>Device Metric Color List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getDeviceMetricColorList()
 * @model extendedMetaData="name='DeviceMetricColor-list'"
 * @generated
 */
public enum DeviceMetricColorList implements Enumerator {
	/**
	 * The '<em><b>Black</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_VALUE
	 * @generated
	 * @ordered
	 */
	BLACK(0, "black", "black"),

	/**
	 * The '<em><b>Red</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_VALUE
	 * @generated
	 * @ordered
	 */
	RED(1, "red", "red"),

	/**
	 * The '<em><b>Green</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	GREEN(2, "green", "green"),

	/**
	 * The '<em><b>Yellow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YELLOW_VALUE
	 * @generated
	 * @ordered
	 */
	YELLOW(3, "yellow", "yellow"),

	/**
	 * The '<em><b>Blue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	BLUE(4, "blue", "blue"),

	/**
	 * The '<em><b>Magenta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAGENTA_VALUE
	 * @generated
	 * @ordered
	 */
	MAGENTA(5, "magenta", "magenta"),

	/**
	 * The '<em><b>Cyan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYAN_VALUE
	 * @generated
	 * @ordered
	 */
	CYAN(6, "cyan", "cyan"),

	/**
	 * The '<em><b>White</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_VALUE
	 * @generated
	 * @ordered
	 */
	WHITE(7, "white", "white");

	/**
	 * The '<em><b>Black</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Color for representation - black.
	 * <!-- end-model-doc -->
	 * @see #BLACK
	 * @model name="black"
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_VALUE = 0;

	/**
	 * The '<em><b>Red</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Color for representation - red.
	 * <!-- end-model-doc -->
	 * @see #RED
	 * @model name="red"
	 * @generated
	 * @ordered
	 */
	public static final int RED_VALUE = 1;

	/**
	 * The '<em><b>Green</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Color for representation - green.
	 * <!-- end-model-doc -->
	 * @see #GREEN
	 * @model name="green"
	 * @generated
	 * @ordered
	 */
	public static final int GREEN_VALUE = 2;

	/**
	 * The '<em><b>Yellow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Color for representation - yellow.
	 * <!-- end-model-doc -->
	 * @see #YELLOW
	 * @model name="yellow"
	 * @generated
	 * @ordered
	 */
	public static final int YELLOW_VALUE = 3;

	/**
	 * The '<em><b>Blue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Color for representation - blue.
	 * <!-- end-model-doc -->
	 * @see #BLUE
	 * @model name="blue"
	 * @generated
	 * @ordered
	 */
	public static final int BLUE_VALUE = 4;

	/**
	 * The '<em><b>Magenta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Color for representation - magenta.
	 * <!-- end-model-doc -->
	 * @see #MAGENTA
	 * @model name="magenta"
	 * @generated
	 * @ordered
	 */
	public static final int MAGENTA_VALUE = 5;

	/**
	 * The '<em><b>Cyan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Color for representation - cyan.
	 * <!-- end-model-doc -->
	 * @see #CYAN
	 * @model name="cyan"
	 * @generated
	 * @ordered
	 */
	public static final int CYAN_VALUE = 6;

	/**
	 * The '<em><b>White</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Color for representation - white.
	 * <!-- end-model-doc -->
	 * @see #WHITE
	 * @model name="white"
	 * @generated
	 * @ordered
	 */
	public static final int WHITE_VALUE = 7;

	/**
	 * An array of all the '<em><b>Device Metric Color List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeviceMetricColorList[] VALUES_ARRAY =
		new DeviceMetricColorList[] {
			BLACK,
			RED,
			GREEN,
			YELLOW,
			BLUE,
			MAGENTA,
			CYAN,
			WHITE,
		};

	/**
	 * A public read-only list of all the '<em><b>Device Metric Color List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeviceMetricColorList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Device Metric Color List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceMetricColorList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceMetricColorList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Metric Color List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceMetricColorList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceMetricColorList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Metric Color List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceMetricColorList get(int value) {
		switch (value) {
			case BLACK_VALUE: return BLACK;
			case RED_VALUE: return RED;
			case GREEN_VALUE: return GREEN;
			case YELLOW_VALUE: return YELLOW;
			case BLUE_VALUE: return BLUE;
			case MAGENTA_VALUE: return MAGENTA;
			case CYAN_VALUE: return CYAN;
			case WHITE_VALUE: return WHITE;
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
	private DeviceMetricColorList(int value, String name, String literal) {
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
	
} //DeviceMetricColorList
