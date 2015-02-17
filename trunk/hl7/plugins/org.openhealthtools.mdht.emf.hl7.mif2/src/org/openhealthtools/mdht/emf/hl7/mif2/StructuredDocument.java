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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A description of a document intended to be authenticated and persisted
 * UML: ?????
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StructuredDocument#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StructuredDocument#getDocumentDefinition <em>Document Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStructuredDocument()
 * @model extendedMetaData="name='StructuredDocument' kind='elementOnly'"
 * @generated
 */
public interface StructuredDocument extends PackageArtifact {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments associated with a structured document.
	 * UML: A collector for the comments and constraints associated with a structured document.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(StructuredDocumentAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStructuredDocument_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	StructuredDocumentAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StructuredDocument#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(StructuredDocumentAnnotations value);

	/**
	 * Returns the value of the '<em><b>Document Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the fully-bound static model which defines the type for the content persisted by the document.
	 * UML: The Classifier bound as a Parameter to the Operation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Definition</em>' containment reference.
	 * @see #setDocumentDefinition(BoundStaticModel)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStructuredDocument_DocumentDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DocumentDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	BoundStaticModel getDocumentDefinition();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StructuredDocument#getDocumentDefinition <em>Document Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Definition</em>' containment reference.
	 * @see #getDocumentDefinition()
	 * @generated
	 */
	void setDocumentDefinition(BoundStaticModel value);

} // StructuredDocument
