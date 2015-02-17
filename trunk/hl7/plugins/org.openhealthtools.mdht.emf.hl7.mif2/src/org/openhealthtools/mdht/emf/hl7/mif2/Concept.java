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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single concept represented in the containing code system.
 * UML: A grouping of enumeration items within a broader enumeration
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Concept#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Concept#getIntendedUse <em>Intended Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Concept#getConceptRelationship <em>Concept Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Concept#getConceptProperty <em>Concept Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Concept#getPrintName <em>Print Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Concept#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Concept#isIsSelectable <em>Is Selectable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Concept#getPropertyGroup <em>Property Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConcept()
 * @model extendedMetaData="name='Concept' kind='elementOnly'"
 * @generated
 */
public interface Concept extends ConceptBase {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the coded concept.
	 * UML: A collector for the comments and constraints associated with a coded concept.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(ConceptAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConcept_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Concept#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(ConceptAnnotations value);

	/**
	 * Returns the value of the '<em><b>Intended Use</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptUse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how the concept is intended to be used.
	 * UML: Tag on CodedConcept
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intended Use</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConcept_IntendedUse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intendedUse' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptUse> getIntendedUse();

	/**
	 * Returns the value of the '<em><b>Concept Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A relationship between this concept and another coded concept in the same code system.
	 * UML: Dependency between two Concept Code stereotypes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept Relationship</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConcept_ConceptRelationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conceptRelationship' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptRelationship> getConceptRelationship();

	/**
	 * Returns the value of the '<em><b>Concept Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An additional property of the concept expressed as a coded name with an associated value.
	 * UML: tag on Concept Code stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConcept_ConceptProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conceptProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptProperty> getConceptProperty();

	/**
	 * Returns the value of the '<em><b>Print Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PrintName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Preferred and alternative print names for this concept that are independent of code in a specified language.
	 * UML: tag on Concept Code stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Print Name</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConcept_PrintName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='printName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PrintName> getPrintName();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the codes that may be used to represent the concept
	 * UML: enumeration items within the code system
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConcept_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Code> getCode();

	/**
	 * Returns the value of the '<em><b>Is Selectable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the concept is intended for use in communication.  If false, indicates that the concept is NOT intended for use in communication, but rather only exists for semantic or navigational purposes.
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Selectable</em>' attribute.
	 * @see #isSetIsSelectable()
	 * @see #unsetIsSelectable()
	 * @see #setIsSelectable(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConcept_IsSelectable()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isSelectable'"
	 * @generated
	 */
	boolean isIsSelectable();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Concept#isIsSelectable <em>Is Selectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Selectable</em>' attribute.
	 * @see #isSetIsSelectable()
	 * @see #unsetIsSelectable()
	 * @see #isIsSelectable()
	 * @generated
	 */
	void setIsSelectable(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Concept#isIsSelectable <em>Is Selectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSelectable()
	 * @see #isIsSelectable()
	 * @see #setIsSelectable(boolean)
	 * @generated
	 */
	void unsetIsSelectable();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Concept#isIsSelectable <em>Is Selectable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Selectable</em>' attribute is set.
	 * @see #unsetIsSelectable()
	 * @see #isIsSelectable()
	 * @see #setIsSelectable(boolean)
	 * @generated
	 */
	boolean isSetIsSelectable();

	/**
	 * Returns the value of the '<em><b>Property Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a pre-defined group of property values that apply to this concept
	 * UML: N/A - this is a serialization shortcut
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Group</em>' attribute.
	 * @see #setPropertyGroup(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConcept_PropertyGroup()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='propertyGroup'"
	 * @generated
	 */
	String getPropertyGroup();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Concept#getPropertyGroup <em>Property Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Group</em>' attribute.
	 * @see #getPropertyGroup()
	 * @generated
	 */
	void setPropertyGroup(String value);

} // Concept
