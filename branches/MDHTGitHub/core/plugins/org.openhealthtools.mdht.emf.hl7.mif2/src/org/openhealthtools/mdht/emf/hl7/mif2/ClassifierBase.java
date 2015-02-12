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
 * A representation of the model object '<em><b>Classifier Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Common content shared by classes and class-interfaces
 * UML: A restriction on Classifier
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassifierBase#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassifierBase#getDefiningVocabulary <em>Defining Vocabulary</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassifierBase#getGraphicLinkId <em>Graphic Link Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassifierBase()
 * @model abstract="true"
 *        extendedMetaData="name='ClassifierBase' kind='elementOnly'"
 * @generated
 */
public interface ClassifierBase extends Classifier {
	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ClassDerivation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the corresponding class in a model from which the current model has been derived.
	 * UML: derivationSupplier relationship
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassifierBase_DerivedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClassDerivation> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Defining Vocabulary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For classes whose type heirarchy is extended through vocabulary, this identifies the concept that corresponds to this physical class.
	 * UML: supplier association to a StructuralDomain dependency to a vocabulary reference
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defining Vocabulary</em>' containment reference.
	 * @see #setDefiningVocabulary(VocabularySpecification)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassifierBase_DefiningVocabulary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definingVocabulary' namespace='##targetNamespace'"
	 * @generated
	 */
	VocabularySpecification getDefiningVocabulary();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassifierBase#getDefiningVocabulary <em>Defining Vocabulary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Vocabulary</em>' containment reference.
	 * @see #getDefiningVocabulary()
	 * @generated
	 */
	void setDefiningVocabulary(VocabularySpecification value);

	/**
	 * Returns the value of the '<em><b>Graphic Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptive name associated with the class, stub or CMET for the purpose of linking it to its graphical rendering information.  Note: This id will not necessarily be consistent each time the artifact is persisted and must never be used to reference the element from outside the model.
	 * UML: Links the ModelElement to its corresponding UML1GraphicInformation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graphic Link Id</em>' attribute.
	 * @see #setGraphicLinkId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassifierBase_GraphicLinkId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Uuid"
	 *        extendedMetaData="kind='attribute' name='graphicLinkId'"
	 * @generated
	 */
	String getGraphicLinkId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassifierBase#getGraphicLinkId <em>Graphic Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic Link Id</em>' attribute.
	 * @see #getGraphicLinkId()
	 * @generated
	 */
	void setGraphicLinkId(String value);

} // ClassifierBase
