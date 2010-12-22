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
 * A representation of the literals of the enumeration '<em><b>Node Orientation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * List of allowed values to reflect the orientation of graphic node elements, including ChoiceBox alignment and the four, flip-orientations for a Role.
 * UML: Type for a complex tag value
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getNodeOrientation()
 * @model extendedMetaData="name='NodeOrientation'"
 * @generated
 */
public enum NodeOrientation implements Enumerator {
	/**
	 * The '<em><b>Portrait</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTRAIT_VALUE
	 * @generated
	 * @ordered
	 */
	PORTRAIT(0, "Portrait", "Portrait"),

	/**
	 * The '<em><b>Landscape</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANDSCAPE_VALUE
	 * @generated
	 * @ordered
	 */
	LANDSCAPE(1, "Landscape", "Landscape"),

	/**
	 * The '<em><b>Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT(2, "Left", "Left"),

	/**
	 * The '<em><b>Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT(3, "Right", "Right"),

	/**
	 * The '<em><b>Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP_VALUE
	 * @generated
	 * @ordered
	 */
	UP(4, "Up", "Up"),

	/**
	 * The '<em><b>Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	DOWN(5, "Down", "Down"),

	/**
	 * The '<em><b>Up Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	UP_RIGHT(6, "UpRight", "UpRight"),

	/**
	 * The '<em><b>Up Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	UP_LEFT(7, "UpLeft", "UpLeft"),

	/**
	 * The '<em><b>Down Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	DOWN_RIGHT(8, "DownRight", "DownRight"),

	/**
	 * The '<em><b>Down Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	DOWN_LEFT(9, "DownLeft", "DownLeft");

	/**
	 * The '<em><b>Portrait</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applied to ChoiceBox, asserts that choice elements are arranged vertically.
	 * <!-- end-model-doc -->
	 * @see #PORTRAIT
	 * @model name="Portrait"
	 * @generated
	 * @ordered
	 */
	public static final int PORTRAIT_VALUE = 0;

	/**
	 * The '<em><b>Landscape</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applied to ChoiceBox, asserts that choice elements are arranged horizontally.
	 * <!-- end-model-doc -->
	 * @see #LANDSCAPE
	 * @model name="Landscape"
	 * @generated
	 * @ordered
	 */
	public static final int LANDSCAPE_VALUE = 1;

	/**
	 * The '<em><b>Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applied to an 'Arrow' shape, asserts that the arrow points towards the left edge of the diagram.  (This must be consistent with the relative connection points of the associations to the shape, if any)
	 * <!-- end-model-doc -->
	 * @see #LEFT
	 * @model name="Left"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_VALUE = 2;

	/**
	 * The '<em><b>Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applied to an 'Arrow' shape, asserts that the arrow points towards the right edge of the diagram.  (This must be consistent with the relative connection points of the associations to the shape, if any)
	 * <!-- end-model-doc -->
	 * @see #RIGHT
	 * @model name="Right"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_VALUE = 3;

	/**
	 * The '<em><b>Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applied to an 'Arrow' shape, asserts that the arrow points towards the top edge of the diagram.  (This must be consistent with the relative connection points of the associations to the shape, if any)
	 * <!-- end-model-doc -->
	 * @see #UP
	 * @model name="Up"
	 * @generated
	 * @ordered
	 */
	public static final int UP_VALUE = 4;

	/**
	 * The '<em><b>Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applied to an 'Arrow' shape, asserts that the arrow points towards the bottom edge of the diagram.  (This must be consistent with the relative connection points of the associations to the shape, if any)
	 * <!-- end-model-doc -->
	 * @see #DOWN
	 * @model name="Down"
	 * @generated
	 * @ordered
	 */
	public static final int DOWN_VALUE = 5;

	/**
	 * The '<em><b>Up Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applied to Role shape, represents orientation in which the "player" association departs from the upper-right corner of the box.  Applied to a recursive arrow shape, indicates that the shape is positioned to connect to the top-right-hand corner of a rectangular class.
	 * <!-- end-model-doc -->
	 * @see #UP_RIGHT
	 * @model name="UpRight"
	 * @generated
	 * @ordered
	 */
	public static final int UP_RIGHT_VALUE = 6;

	/**
	 * The '<em><b>Up Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applied to Role shape, represents orientation in which the "player" association departs from the upper-left corner of the box.  Applied to a recursive arrow shape, indicates that the shape is positioned to connect to the top-left-hand corner of a rectangular class.
	 * <!-- end-model-doc -->
	 * @see #UP_LEFT
	 * @model name="UpLeft"
	 * @generated
	 * @ordered
	 */
	public static final int UP_LEFT_VALUE = 7;

	/**
	 * The '<em><b>Down Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applied to Role shape, represents orientation in which the "player" association departs from the lower-right corner of the box.  Applied to a recursive arrow shape, indicates that the shape is positioned to connect to the bottom-right-hand corner of a rectangular class.
	 * <!-- end-model-doc -->
	 * @see #DOWN_RIGHT
	 * @model name="DownRight"
	 * @generated
	 * @ordered
	 */
	public static final int DOWN_RIGHT_VALUE = 8;

	/**
	 * The '<em><b>Down Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applied to Role shape, represents orientation in which the "player" association departs from the lower-left corner of the box.  Applied to a recursive arrow shape, indicates that the shape is positioned to connect to the bottom-left-hand corner of a rectangular class.
	 * <!-- end-model-doc -->
	 * @see #DOWN_LEFT
	 * @model name="DownLeft"
	 * @generated
	 * @ordered
	 */
	public static final int DOWN_LEFT_VALUE = 9;

	/**
	 * An array of all the '<em><b>Node Orientation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NodeOrientation[] VALUES_ARRAY =
		new NodeOrientation[] {
			PORTRAIT,
			LANDSCAPE,
			LEFT,
			RIGHT,
			UP,
			DOWN,
			UP_RIGHT,
			UP_LEFT,
			DOWN_RIGHT,
			DOWN_LEFT,
		};

	/**
	 * A public read-only list of all the '<em><b>Node Orientation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NodeOrientation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Node Orientation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NodeOrientation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NodeOrientation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Orientation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NodeOrientation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NodeOrientation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Orientation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NodeOrientation get(int value) {
		switch (value) {
			case PORTRAIT_VALUE: return PORTRAIT;
			case LANDSCAPE_VALUE: return LANDSCAPE;
			case LEFT_VALUE: return LEFT;
			case RIGHT_VALUE: return RIGHT;
			case UP_VALUE: return UP;
			case DOWN_VALUE: return DOWN;
			case UP_RIGHT_VALUE: return UP_RIGHT;
			case UP_LEFT_VALUE: return UP_LEFT;
			case DOWN_RIGHT_VALUE: return DOWN_RIGHT;
			case DOWN_LEFT_VALUE: return DOWN_LEFT;
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
	private NodeOrientation(int value, String name, String literal) {
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
	
} //NodeOrientation
