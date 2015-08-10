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
 * A representation of the literals of the enumeration '<em><b>Guide Page Kind List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getGuidePageKindList()
 * @model extendedMetaData="name='GuidePageKind-list'"
 * @generated
 */
public enum GuidePageKindList implements Enumerator {
	/**
	 * The '<em><b>Page</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE(0, "page", "page"),

	/**
	 * The '<em><b>Example</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXAMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	EXAMPLE(1, "example", "example"),

	/**
	 * The '<em><b>List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_VALUE
	 * @generated
	 * @ordered
	 */
	LIST(2, "list", "list"),

	/**
	 * The '<em><b>Include</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDE_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUDE(3, "include", "include"),

	/**
	 * The '<em><b>Directory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECTORY_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECTORY(4, "directory", "directory"),

	/**
	 * The '<em><b>Dictionary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DICTIONARY_VALUE
	 * @generated
	 * @ordered
	 */
	DICTIONARY(5, "dictionary", "dictionary"),

	/**
	 * The '<em><b>Toc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOC_VALUE
	 * @generated
	 * @ordered
	 */
	TOC(6, "toc", "toc");

	/**
	 * The '<em><b>Page</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a page of content that is included in the implementation guide. It has no particular function
	 * <!-- end-model-doc -->
	 * @see #PAGE
	 * @model name="page"
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_VALUE = 0;

	/**
	 * The '<em><b>Example</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a page that represents a human readable rendering of an example
	 * <!-- end-model-doc -->
	 * @see #EXAMPLE
	 * @model name="example"
	 * @generated
	 * @ordered
	 */
	public static final int EXAMPLE_VALUE = 1;

	/**
	 * The '<em><b>List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a page that represents a list of resources of one or more types
	 * <!-- end-model-doc -->
	 * @see #LIST
	 * @model name="list"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_VALUE = 2;

	/**
	 * The '<em><b>Include</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a page that is where an included guide is injected
	 * <!-- end-model-doc -->
	 * @see #INCLUDE
	 * @model name="include"
	 * @generated
	 * @ordered
	 */
	public static final int INCLUDE_VALUE = 3;

	/**
	 * The '<em><b>Directory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a page that lists the resources of a given type, and also creates pages for all the listed types as other pages in the section
	 * <!-- end-model-doc -->
	 * @see #DIRECTORY
	 * @model name="directory"
	 * @generated
	 * @ordered
	 */
	public static final int DIRECTORY_VALUE = 4;

	/**
	 * The '<em><b>Dictionary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a page that creates the listed resources as a dictionary
	 * <!-- end-model-doc -->
	 * @see #DICTIONARY
	 * @model name="dictionary"
	 * @generated
	 * @ordered
	 */
	public static final int DICTIONARY_VALUE = 5;

	/**
	 * The '<em><b>Toc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a generated page that contains the table of contents
	 * <!-- end-model-doc -->
	 * @see #TOC
	 * @model name="toc"
	 * @generated
	 * @ordered
	 */
	public static final int TOC_VALUE = 6;

	/**
	 * An array of all the '<em><b>Guide Page Kind List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GuidePageKindList[] VALUES_ARRAY =
		new GuidePageKindList[] {
			PAGE,
			EXAMPLE,
			LIST,
			INCLUDE,
			DIRECTORY,
			DICTIONARY,
			TOC,
		};

	/**
	 * A public read-only list of all the '<em><b>Guide Page Kind List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GuidePageKindList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Guide Page Kind List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuidePageKindList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GuidePageKindList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guide Page Kind List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuidePageKindList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GuidePageKindList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guide Page Kind List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuidePageKindList get(int value) {
		switch (value) {
			case PAGE_VALUE: return PAGE;
			case EXAMPLE_VALUE: return EXAMPLE;
			case LIST_VALUE: return LIST;
			case INCLUDE_VALUE: return INCLUDE;
			case DIRECTORY_VALUE: return DIRECTORY;
			case DICTIONARY_VALUE: return DICTIONARY;
			case TOC_VALUE: return TOC;
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
	private GuidePageKindList(int value, String name, String literal) {
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
	
} //GuidePageKindList
