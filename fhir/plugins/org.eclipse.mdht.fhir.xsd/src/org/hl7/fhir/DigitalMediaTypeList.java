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
 * A representation of the literals of the enumeration '<em><b>Digital Media Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getDigitalMediaTypeList()
 * @model extendedMetaData="name='DigitalMediaType-list'"
 * @generated
 */
public enum DigitalMediaTypeList implements Enumerator {
	/**
	 * The '<em><b>Photo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHOTO_VALUE
	 * @generated
	 * @ordered
	 */
	PHOTO(0, "photo", "photo"),

	/**
	 * The '<em><b>Video</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO(1, "video", "video"),

	/**
	 * The '<em><b>Audio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIO(2, "audio", "audio");

	/**
	 * The '<em><b>Photo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The media consists of one or more unmoving images, including photographs, computer-generated graphs and charts, and scanned documents.
	 * <!-- end-model-doc -->
	 * @see #PHOTO
	 * @model name="photo"
	 * @generated
	 * @ordered
	 */
	public static final int PHOTO_VALUE = 0;

	/**
	 * The '<em><b>Video</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The media consists of a series of frames that capture a moving image.
	 * <!-- end-model-doc -->
	 * @see #VIDEO
	 * @model name="video"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_VALUE = 1;

	/**
	 * The '<em><b>Audio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The media consists of a sound recording.
	 * <!-- end-model-doc -->
	 * @see #AUDIO
	 * @model name="audio"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIO_VALUE = 2;

	/**
	 * An array of all the '<em><b>Digital Media Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DigitalMediaTypeList[] VALUES_ARRAY =
		new DigitalMediaTypeList[] {
			PHOTO,
			VIDEO,
			AUDIO,
		};

	/**
	 * A public read-only list of all the '<em><b>Digital Media Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DigitalMediaTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Digital Media Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DigitalMediaTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DigitalMediaTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Digital Media Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DigitalMediaTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DigitalMediaTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Digital Media Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DigitalMediaTypeList get(int value) {
		switch (value) {
			case PHOTO_VALUE: return PHOTO;
			case VIDEO_VALUE: return VIDEO;
			case AUDIO_VALUE: return AUDIO;
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
	private DigitalMediaTypeList(int value, String name, String literal) {
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
	
} //DigitalMediaTypeList
