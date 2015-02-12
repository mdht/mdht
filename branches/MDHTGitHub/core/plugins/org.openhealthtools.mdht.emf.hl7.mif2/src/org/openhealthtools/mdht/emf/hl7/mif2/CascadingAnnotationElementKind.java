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
 * A representation of the literals of the enumeration '<em><b>Cascading Annotation Element Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identifies the kinds of elements against which cascading annotations can be created
 * UML: Used to reference a tagged item
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCascadingAnnotationElementKind()
 * @model extendedMetaData="name='CascadingAnnotationElementKind'"
 * @generated
 */
public enum CascadingAnnotationElementKind implements Enumerator {
	/**
	 * The '<em><b>Static Model</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATIC_MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	STATIC_MODEL(0, "StaticModel", "StaticModel"),

	/**
	 * The '<em><b>Class</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS(1, "Class", "Class"),

	/**
	 * The '<em><b>Stub</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUB_VALUE
	 * @generated
	 * @ordered
	 */
	STUB(2, "Stub", "Stub"),

	/**
	 * The '<em><b>CMET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CMET_VALUE
	 * @generated
	 * @ordered
	 */
	CMET(3, "CMET", "CMET"),

	/**
	 * The '<em><b>Entry Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRY_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	ENTRY_POINT(4, "EntryPoint", "EntryPoint"),

	/**
	 * The '<em><b>Attribute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTRIBUTE_VALUE
	 * @generated
	 * @ordered
	 */
	ATTRIBUTE(5, "Attribute", "Attribute"),

	/**
	 * The '<em><b>Association</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATION_VALUE
	 * @generated
	 * @ordered
	 */
	ASSOCIATION(6, "Association", "Association"),

	/**
	 * The '<em><b>Association End</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATION_END_VALUE
	 * @generated
	 * @ordered
	 */
	ASSOCIATION_END(7, "AssociationEnd", "AssociationEnd"),

	/**
	 * The '<em><b>Generalization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERALIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	GENERALIZATION(8, "Generalization", "Generalization"),

	/**
	 * The '<em><b>State Machine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_MACHINE_VALUE
	 * @generated
	 * @ordered
	 */
	STATE_MACHINE(9, "StateMachine", "StateMachine"),

	/**
	 * The '<em><b>State</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_VALUE
	 * @generated
	 * @ordered
	 */
	STATE(10, "State", "State"),

	/**
	 * The '<em><b>State Transition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_TRANSITION_VALUE
	 * @generated
	 * @ordered
	 */
	STATE_TRANSITION(11, "StateTransition", "StateTransition"),

	/**
	 * The '<em><b>Datatype</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATATYPE_VALUE
	 * @generated
	 * @ordered
	 */
	DATATYPE(12, "Datatype", "Datatype"),

	/**
	 * The '<em><b>Datatype Operation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATATYPE_OPERATION_VALUE
	 * @generated
	 * @ordered
	 */
	DATATYPE_OPERATION(13, "DatatypeOperation", "DatatypeOperation");

	/**
	 * The '<em><b>Static Model</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Static models (serialized or unserialized)
	 * <!-- end-model-doc -->
	 * @see #STATIC_MODEL
	 * @model name="StaticModel"
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_MODEL_VALUE = 0;

	/**
	 * The '<em><b>Class</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classes in a static model
	 * <!-- end-model-doc -->
	 * @see #CLASS
	 * @model name="Class"
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_VALUE = 1;

	/**
	 * The '<em><b>Stub</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stub references in a static model
	 * <!-- end-model-doc -->
	 * @see #STUB
	 * @model name="Stub"
	 * @generated
	 * @ordered
	 */
	public static final int STUB_VALUE = 2;

	/**
	 * The '<em><b>CMET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CMET references in a static model
	 * <!-- end-model-doc -->
	 * @see #CMET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CMET_VALUE = 3;

	/**
	 * The '<em><b>Entry Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entry-points in a static model
	 * <!-- end-model-doc -->
	 * @see #ENTRY_POINT
	 * @model name="EntryPoint"
	 * @generated
	 * @ordered
	 */
	public static final int ENTRY_POINT_VALUE = 4;

	/**
	 * The '<em><b>Attribute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributes in a static model class
	 * <!-- end-model-doc -->
	 * @see #ATTRIBUTE
	 * @model name="Attribute"
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_VALUE = 5;

	/**
	 * The '<em><b>Association</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Associations in a static model
	 * <!-- end-model-doc -->
	 * @see #ASSOCIATION
	 * @model name="Association"
	 * @generated
	 * @ordered
	 */
	public static final int ASSOCIATION_VALUE = 6;

	/**
	 * The '<em><b>Association End</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ends of an association in a static model
	 * <!-- end-model-doc -->
	 * @see #ASSOCIATION_END
	 * @model name="AssociationEnd"
	 * @generated
	 * @ordered
	 */
	public static final int ASSOCIATION_END_VALUE = 7;

	/**
	 * The '<em><b>Generalization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generalizations in a static model
	 * <!-- end-model-doc -->
	 * @see #GENERALIZATION
	 * @model name="Generalization"
	 * @generated
	 * @ordered
	 */
	public static final int GENERALIZATION_VALUE = 8;

	/**
	 * The '<em><b>State Machine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * State machines in a static model
	 * <!-- end-model-doc -->
	 * @see #STATE_MACHINE
	 * @model name="StateMachine"
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_VALUE = 9;

	/**
	 * The '<em><b>State</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * States in a state machine in a static model
	 * <!-- end-model-doc -->
	 * @see #STATE
	 * @model name="State"
	 * @generated
	 * @ordered
	 */
	public static final int STATE_VALUE = 10;

	/**
	 * The '<em><b>State Transition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * State transitions in a state machine in a static model
	 * <!-- end-model-doc -->
	 * @see #STATE_TRANSITION
	 * @model name="StateTransition"
	 * @generated
	 * @ordered
	 */
	public static final int STATE_TRANSITION_VALUE = 11;

	/**
	 * The '<em><b>Datatype</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datatypes in a datatype model
	 * <!-- end-model-doc -->
	 * @see #DATATYPE
	 * @model name="Datatype"
	 * @generated
	 * @ordered
	 */
	public static final int DATATYPE_VALUE = 12;

	/**
	 * The '<em><b>Datatype Operation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operations within a datatype
	 * <!-- end-model-doc -->
	 * @see #DATATYPE_OPERATION
	 * @model name="DatatypeOperation"
	 * @generated
	 * @ordered
	 */
	public static final int DATATYPE_OPERATION_VALUE = 13;

	/**
	 * An array of all the '<em><b>Cascading Annotation Element Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CascadingAnnotationElementKind[] VALUES_ARRAY = new CascadingAnnotationElementKind[] {
			STATIC_MODEL, CLASS, STUB, CMET, ENTRY_POINT, ATTRIBUTE, ASSOCIATION, ASSOCIATION_END, GENERALIZATION,
			STATE_MACHINE, STATE, STATE_TRANSITION, DATATYPE, DATATYPE_OPERATION, };

	/**
	 * A public read-only list of all the '<em><b>Cascading Annotation Element Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CascadingAnnotationElementKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cascading Annotation Element Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CascadingAnnotationElementKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CascadingAnnotationElementKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cascading Annotation Element Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CascadingAnnotationElementKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CascadingAnnotationElementKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cascading Annotation Element Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CascadingAnnotationElementKind get(int value) {
		switch (value) {
			case STATIC_MODEL_VALUE:
				return STATIC_MODEL;
			case CLASS_VALUE:
				return CLASS;
			case STUB_VALUE:
				return STUB;
			case CMET_VALUE:
				return CMET;
			case ENTRY_POINT_VALUE:
				return ENTRY_POINT;
			case ATTRIBUTE_VALUE:
				return ATTRIBUTE;
			case ASSOCIATION_VALUE:
				return ASSOCIATION;
			case ASSOCIATION_END_VALUE:
				return ASSOCIATION_END;
			case GENERALIZATION_VALUE:
				return GENERALIZATION;
			case STATE_MACHINE_VALUE:
				return STATE_MACHINE;
			case STATE_VALUE:
				return STATE;
			case STATE_TRANSITION_VALUE:
				return STATE_TRANSITION;
			case DATATYPE_VALUE:
				return DATATYPE;
			case DATATYPE_OPERATION_VALUE:
				return DATATYPE_OPERATION;
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
	private CascadingAnnotationElementKind(int value, String name, String literal) {
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

} // CascadingAnnotationElementKind
