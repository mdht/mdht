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
 * A representation of the literals of the enumeration '<em><b>Static Model Diagram Presentation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Provides the different 'types' of diagrams
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelDiagramPresentationKind()
 * @model extendedMetaData="name='StaticModelDiagramPresentationKind'"
 * @generated
 */
public enum StaticModelDiagramPresentationKind implements Enumerator {
	/**
	 * The '<em><b>UML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UML_VALUE
	 * @generated
	 * @ordered
	 */
	UML(0, "UML", "UML"),

	/**
	 * The '<em><b>HL7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HL7_VALUE
	 * @generated
	 * @ordered
	 */
	HL7(1, "HL7", "HL7");

	/**
	 * The '<em><b>UML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard UML format
	 * <!-- end-model-doc -->
	 * @see #UML
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UML_VALUE = 0;

	/**
	 * The '<em><b>HL7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HL7's "customized" diagramming format (aka R-MIM format)
	 * <!-- end-model-doc -->
	 * @see #HL7
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HL7_VALUE = 1;

	/**
	 * An array of all the '<em><b>Static Model Diagram Presentation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StaticModelDiagramPresentationKind[] VALUES_ARRAY =
		new StaticModelDiagramPresentationKind[] {
			UML,
			HL7,
		};

	/**
	 * A public read-only list of all the '<em><b>Static Model Diagram Presentation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StaticModelDiagramPresentationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Static Model Diagram Presentation Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StaticModelDiagramPresentationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StaticModelDiagramPresentationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Static Model Diagram Presentation Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StaticModelDiagramPresentationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StaticModelDiagramPresentationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Static Model Diagram Presentation Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StaticModelDiagramPresentationKind get(int value) {
		switch (value) {
			case UML_VALUE: return UML;
			case HL7_VALUE: return HL7;
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
	private StaticModelDiagramPresentationKind(int value, String name, String literal) {
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
	
} //StaticModelDiagramPresentationKind
