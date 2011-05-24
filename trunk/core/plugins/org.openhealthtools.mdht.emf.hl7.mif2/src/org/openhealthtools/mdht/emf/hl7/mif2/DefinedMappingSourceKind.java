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
 * A representation of the literals of the enumeration '<em><b>Defined Mapping Source Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Lists 'pre-defined' standards that can be mapped to.  (Predefinition helps ensure consistency of spelling, capitalization, etc.)
 * UML: type for an object-typed stereotype tag
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDefinedMappingSourceKind()
 * @model extendedMetaData="name='DefinedMappingSourceKind'"
 * @generated
 */
public enum DefinedMappingSourceKind implements Enumerator {
	/**
	 * The '<em><b>HL 7v2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HL_7V2_VALUE
	 * @generated
	 * @ordered
	 */
	HL_7V2(0, "HL7v2", "HL7v2"),

	/**
	 * The '<em><b>DICOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DICOM_VALUE
	 * @generated
	 * @ordered
	 */
	DICOM(1, "DICOM", "DICOM"),

	/**
	 * The '<em><b>Analysis Model</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALYSIS_MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	ANALYSIS_MODEL(2, "AnalysisModel", "Analysis Model");

	/**
	 * The '<em><b>HL 7v2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * mapping to the HL7 version 2.x messaging standard
	 * <!-- end-model-doc -->
	 * @see #HL_7V2
	 * @model name="HL7v2"
	 * @generated
	 * @ordered
	 */
	public static final int HL_7V2_VALUE = 0;

	/**
	 * The '<em><b>DICOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * mapping to the DICOM standard
	 * <!-- end-model-doc -->
	 * @see #DICOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DICOM_VALUE = 1;

	/**
	 * The '<em><b>Analysis Model</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * mapping to HL7 version 2.3 messaging standard
	 * <!-- end-model-doc -->
	 * @see #ANALYSIS_MODEL
	 * @model name="AnalysisModel" literal="Analysis Model"
	 * @generated
	 * @ordered
	 */
	public static final int ANALYSIS_MODEL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Defined Mapping Source Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DefinedMappingSourceKind[] VALUES_ARRAY = new DefinedMappingSourceKind[] {
			HL_7V2, DICOM, ANALYSIS_MODEL, };

	/**
	 * A public read-only list of all the '<em><b>Defined Mapping Source Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DefinedMappingSourceKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Defined Mapping Source Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DefinedMappingSourceKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DefinedMappingSourceKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Defined Mapping Source Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DefinedMappingSourceKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DefinedMappingSourceKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Defined Mapping Source Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DefinedMappingSourceKind get(int value) {
		switch (value) {
			case HL_7V2_VALUE:
				return HL_7V2;
			case DICOM_VALUE:
				return DICOM;
			case ANALYSIS_MODEL_VALUE:
				return ANALYSIS_MODEL;
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
	private DefinedMappingSourceKind(int value, String name, String literal) {
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

} // DefinedMappingSourceKind
