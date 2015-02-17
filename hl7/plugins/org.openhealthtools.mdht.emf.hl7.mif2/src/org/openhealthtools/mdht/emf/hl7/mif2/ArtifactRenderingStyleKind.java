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
 * A representation of the literals of the enumeration '<em><b>Artifact Rendering Style Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines the types of renderings that can occur for artifacts
 * UML: Used to reference a tagged item
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getArtifactRenderingStyleKind()
 * @model extendedMetaData="name='ArtifactRenderingStyleKind'"
 * @generated
 */
public enum ArtifactRenderingStyleKind implements Enumerator {
	/**
	 * The '<em><b>Graphical Detailed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPHICAL_DETAILED_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPHICAL_DETAILED(0, "GraphicalDetailed", "GraphicalDetailed"),

	/**
	 * The '<em><b>Graphical Summary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPHICAL_SUMMARY_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPHICAL_SUMMARY(1, "GraphicalSummary", "GraphicalSummary"),

	/**
	 * The '<em><b>Table View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE_VIEW(2, "TableView", "TableView"),

	/**
	 * The '<em><b>Excel View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCEL_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	EXCEL_VIEW(3, "ExcelView", "ExcelView"),

	/**
	 * The '<em><b>Text View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_VIEW(4, "TextView", "TextView");

	/**
	 * The '<em><b>Graphical Detailed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A full-blown graphical rendition of the content
	 * <!-- end-model-doc -->
	 * @see #GRAPHICAL_DETAILED
	 * @model name="GraphicalDetailed"
	 * @generated
	 * @ordered
	 */
	public static final int GRAPHICAL_DETAILED_VALUE = 0;

	/**
	 * The '<em><b>Graphical Summary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A high-level graphical rendition of the key elements within the content
	 * <!-- end-model-doc -->
	 * @see #GRAPHICAL_SUMMARY
	 * @model name="GraphicalSummary"
	 * @generated
	 * @ordered
	 */
	public static final int GRAPHICAL_SUMMARY_VALUE = 1;

	/**
	 * The '<em><b>Table View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A table rendering of the content
	 * <!-- end-model-doc -->
	 * @see #TABLE_VIEW
	 * @model name="TableView"
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_VIEW_VALUE = 2;

	/**
	 * The '<em><b>Excel View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specialized static-model rendering using an Excel-type view
	 * <!-- end-model-doc -->
	 * @see #EXCEL_VIEW
	 * @model name="ExcelView"
	 * @generated
	 * @ordered
	 */
	public static final int EXCEL_VIEW_VALUE = 3;

	/**
	 * The '<em><b>Text View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Marked-up text rendering of the content.
	 * <!-- end-model-doc -->
	 * @see #TEXT_VIEW
	 * @model name="TextView"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VIEW_VALUE = 4;

	/**
	 * An array of all the '<em><b>Artifact Rendering Style Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArtifactRenderingStyleKind[] VALUES_ARRAY = new ArtifactRenderingStyleKind[] {
			GRAPHICAL_DETAILED, GRAPHICAL_SUMMARY, TABLE_VIEW, EXCEL_VIEW, TEXT_VIEW, };

	/**
	 * A public read-only list of all the '<em><b>Artifact Rendering Style Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArtifactRenderingStyleKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Artifact Rendering Style Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArtifactRenderingStyleKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactRenderingStyleKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Rendering Style Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArtifactRenderingStyleKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactRenderingStyleKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Rendering Style Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArtifactRenderingStyleKind get(int value) {
		switch (value) {
			case GRAPHICAL_DETAILED_VALUE:
				return GRAPHICAL_DETAILED;
			case GRAPHICAL_SUMMARY_VALUE:
				return GRAPHICAL_SUMMARY;
			case TABLE_VIEW_VALUE:
				return TABLE_VIEW;
			case EXCEL_VIEW_VALUE:
				return EXCEL_VIEW;
			case TEXT_VIEW_VALUE:
				return TEXT_VIEW;
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
	private ArtifactRenderingStyleKind(int value, String name, String literal) {
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

} // ArtifactRenderingStyleKind
