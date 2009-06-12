/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.vocab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>xAct Class Document Entry Organizer</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getx_ActClassDocumentEntryOrganizer()
 * @model
 * @generated
 */
public enum x_ActClassDocumentEntryOrganizer implements Enumerator {
	/**
	 * The '<em><b>BATTERY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY_VALUE
	 * @generated
	 * @ordered
	 */
	BATTERY(0, "BATTERY", "BATTERY"),

	/**
	 * The '<em><b>CLUSTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTER(1, "CLUSTER", "CLUSTER");

	/**
	 * The '<em><b>BATTERY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BATTERY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BATTERY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BATTERY_VALUE = 0;

	/**
	 * The '<em><b>CLUSTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLUSTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLUSTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTER_VALUE = 1;

	/**
	 * An array of all the '<em><b>xAct Class Document Entry Organizer</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final x_ActClassDocumentEntryOrganizer[] VALUES_ARRAY =
		new x_ActClassDocumentEntryOrganizer[] {
			BATTERY,
			CLUSTER,
		};

	/**
	 * A public read-only list of all the '<em><b>xAct Class Document Entry Organizer</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<x_ActClassDocumentEntryOrganizer> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>xAct Class Document Entry Organizer</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static x_ActClassDocumentEntryOrganizer get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			x_ActClassDocumentEntryOrganizer result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>xAct Class Document Entry Organizer</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static x_ActClassDocumentEntryOrganizer getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			x_ActClassDocumentEntryOrganizer result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>xAct Class Document Entry Organizer</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static x_ActClassDocumentEntryOrganizer get(int value) {
		switch (value) {
			case BATTERY_VALUE: return BATTERY;
			case CLUSTER_VALUE: return CLUSTER;
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
	private x_ActClassDocumentEntryOrganizer(int value, String name, String literal) {
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
	
} //x_ActClassDocumentEntryOrganizer
