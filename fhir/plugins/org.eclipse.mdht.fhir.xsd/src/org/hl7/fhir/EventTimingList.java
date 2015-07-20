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
 * A representation of the literals of the enumeration '<em><b>Event Timing List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getEventTimingList()
 * @model extendedMetaData="name='EventTiming-list'"
 * @generated
 */
public enum EventTimingList implements Enumerator {
	/**
	 * The '<em><b>HS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HS_VALUE
	 * @generated
	 * @ordered
	 */
	HS(0, "HS", "HS"),

	/**
	 * The '<em><b>WAKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAKE_VALUE
	 * @generated
	 * @ordered
	 */
	WAKE(1, "WAKE", "WAKE"),

	/**
	 * The '<em><b>C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C_VALUE
	 * @generated
	 * @ordered
	 */
	C(2, "C", "C"),

	/**
	 * The '<em><b>CM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CM_VALUE
	 * @generated
	 * @ordered
	 */
	CM(3, "CM", "CM"),

	/**
	 * The '<em><b>CD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CD_VALUE
	 * @generated
	 * @ordered
	 */
	CD(4, "CD", "CD"),

	/**
	 * The '<em><b>CV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CV_VALUE
	 * @generated
	 * @ordered
	 */
	CV(5, "CV", "CV"),

	/**
	 * The '<em><b>AC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AC_VALUE
	 * @generated
	 * @ordered
	 */
	AC(6, "AC", "AC"),

	/**
	 * The '<em><b>ACM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACM_VALUE
	 * @generated
	 * @ordered
	 */
	ACM(7, "ACM", "ACM"),

	/**
	 * The '<em><b>ACD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACD_VALUE
	 * @generated
	 * @ordered
	 */
	ACD(8, "ACD", "ACD"),

	/**
	 * The '<em><b>ACV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACV_VALUE
	 * @generated
	 * @ordered
	 */
	ACV(9, "ACV", "ACV"),

	/**
	 * The '<em><b>PC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PC_VALUE
	 * @generated
	 * @ordered
	 */
	PC(10, "PC", "PC"),

	/**
	 * The '<em><b>PCM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PCM_VALUE
	 * @generated
	 * @ordered
	 */
	PCM(11, "PCM", "PCM"),

	/**
	 * The '<em><b>PCD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PCD_VALUE
	 * @generated
	 * @ordered
	 */
	PCD(12, "PCD", "PCD"),

	/**
	 * The '<em><b>PCV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PCV_VALUE
	 * @generated
	 * @ordered
	 */
	PCV(13, "PCV", "PCV");

	/**
	 * The '<em><b>HS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #HS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HS_VALUE = 0;

	/**
	 * The '<em><b>WAKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #WAKE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAKE_VALUE = 1;

	/**
	 * The '<em><b>C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C_VALUE = 2;

	/**
	 * The '<em><b>CM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #CM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CM_VALUE = 3;

	/**
	 * The '<em><b>CD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #CD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CD_VALUE = 4;

	/**
	 * The '<em><b>CV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #CV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CV_VALUE = 5;

	/**
	 * The '<em><b>AC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #AC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AC_VALUE = 6;

	/**
	 * The '<em><b>ACM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #ACM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACM_VALUE = 7;

	/**
	 * The '<em><b>ACD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #ACD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACD_VALUE = 8;

	/**
	 * The '<em><b>ACV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #ACV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACV_VALUE = 9;

	/**
	 * The '<em><b>PC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #PC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PC_VALUE = 10;

	/**
	 * The '<em><b>PCM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #PCM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PCM_VALUE = 11;

	/**
	 * The '<em><b>PCD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #PCD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PCD_VALUE = 12;

	/**
	 * The '<em><b>PCV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #PCV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PCV_VALUE = 13;

	/**
	 * An array of all the '<em><b>Event Timing List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EventTimingList[] VALUES_ARRAY =
		new EventTimingList[] {
			HS,
			WAKE,
			C,
			CM,
			CD,
			CV,
			AC,
			ACM,
			ACD,
			ACV,
			PC,
			PCM,
			PCD,
			PCV,
		};

	/**
	 * A public read-only list of all the '<em><b>Event Timing List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EventTimingList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Event Timing List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventTimingList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventTimingList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Timing List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventTimingList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventTimingList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Timing List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventTimingList get(int value) {
		switch (value) {
			case HS_VALUE: return HS;
			case WAKE_VALUE: return WAKE;
			case C_VALUE: return C;
			case CM_VALUE: return CM;
			case CD_VALUE: return CD;
			case CV_VALUE: return CV;
			case AC_VALUE: return AC;
			case ACM_VALUE: return ACM;
			case ACD_VALUE: return ACD;
			case ACV_VALUE: return ACV;
			case PC_VALUE: return PC;
			case PCM_VALUE: return PCM;
			case PCD_VALUE: return PCD;
			case PCV_VALUE: return PCV;
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
	private EventTimingList(int value, String name, String literal) {
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
	
} //EventTimingList
