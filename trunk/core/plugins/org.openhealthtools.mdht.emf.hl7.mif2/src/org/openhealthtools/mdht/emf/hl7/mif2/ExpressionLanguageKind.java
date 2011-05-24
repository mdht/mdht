/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Expression Language Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identifies language that constraints can be expressed in.  (Excludes OCL, which is the default)
 * UML: Type used by a complex stereotype
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getExpressionLanguageKind()
 * @model extendedMetaData="name='ExpressionLanguageKind'"
 * @generated
 */
public enum ExpressionLanguageKind implements Enumerator {
	/**
	 * The '<em><b>XPath</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XPATH_VALUE
	 * @generated
	 * @ordered
	 */
	XPATH(0, "XPath", "XPath"),

	/**
	 * The '<em><b>HL7 Datatype Definition Language</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HL7_DATATYPE_DEFINITION_LANGUAGE_VALUE
	 * @generated
	 * @ordered
	 */
	HL7_DATATYPE_DEFINITION_LANGUAGE(1, "HL7DatatypeDefinitionLanguage", "HL7DatatypeDefinitionLanguage"),

	/**
	 * The '<em><b>Regular Expression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULAR_EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	REGULAR_EXPRESSION(2, "RegularExpression", "RegularExpression");

	/**
	 * The '<em><b>XPath</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An XPath expression that assumes the use of the XML ITS, and which evaluates to a boolean
	 * <!-- end-model-doc -->
	 * @see #XPATH
	 * @model name="XPath"
	 * @generated
	 * @ordered
	 */
	public static final int XPATH_VALUE = 0;

	/**
	 * The '<em><b>HL7 Datatype Definition Language</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gunther's formal assertion language
	 * <!-- end-model-doc -->
	 * @see #HL7_DATATYPE_DEFINITION_LANGUAGE
	 * @model name="HL7DatatypeDefinitionLanguage"
	 * @generated
	 * @ordered
	 */
	public static final int HL7_DATATYPE_DEFINITION_LANGUAGE_VALUE = 1;

	/**
	 * The '<em><b>Regular Expression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An expression using the "regular expression" language as used by the unix 'grep' utility and many others
	 * <!-- end-model-doc -->
	 * @see #REGULAR_EXPRESSION
	 * @model name="RegularExpression"
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_EXPRESSION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Expression Language Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExpressionLanguageKind[] VALUES_ARRAY = new ExpressionLanguageKind[] {
			XPATH, HL7_DATATYPE_DEFINITION_LANGUAGE, REGULAR_EXPRESSION, };

	/**
	 * A public read-only list of all the '<em><b>Expression Language Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExpressionLanguageKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Expression Language Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpressionLanguageKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpressionLanguageKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expression Language Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpressionLanguageKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpressionLanguageKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expression Language Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpressionLanguageKind get(int value) {
		switch (value) {
			case XPATH_VALUE:
				return XPATH;
			case HL7_DATATYPE_DEFINITION_LANGUAGE_VALUE:
				return HL7_DATATYPE_DEFINITION_LANGUAGE;
			case REGULAR_EXPRESSION_VALUE:
				return REGULAR_EXPRESSION;
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
	private ExpressionLanguageKind(int value, String name, String literal) {
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

} // ExpressionLanguageKind
