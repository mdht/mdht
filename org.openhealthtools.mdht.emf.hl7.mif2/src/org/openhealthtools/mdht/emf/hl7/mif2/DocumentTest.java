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
 * A representation of the model object '<em><b>Document Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Part of a complex tag value
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentTest#getDocument <em>Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentTest#getExampleContent <em>Example Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentTest#getConsumingSystem <em>Consuming System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentTest#getCreatingSystem <em>Creating System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentTest#getExampleFile <em>Example File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentTest()
 * @model extendedMetaData="name='DocumentTest' kind='elementOnly'"
 * @generated
 */
public interface DocumentTest extends TestBase {
	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the document being created or consumed by this test.
	 * UML: Base interface(s) implemented by the ClassifierRole
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document</em>' containment reference.
	 * @see #setDocument(PackageOrArtifactRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentTest_Document()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='document' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageOrArtifactRef getDocument();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentTest#getDocument <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' containment reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(PackageOrArtifactRef value);

	/**
	 * Returns the value of the '<em><b>Example Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the actual content of the document to be created or consumed
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Example Content</em>' containment reference.
	 * @see #setExampleContent(ExampleType)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentTest_ExampleContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleContent' namespace='##targetNamespace'"
	 * @generated
	 */
	ExampleType getExampleContent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentTest#getExampleContent <em>Example Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Content</em>' containment reference.
	 * @see #getExampleContent()
	 * @generated
	 */
	void setExampleContent(ExampleType value);

	/**
	 * Returns the value of the '<em><b>Consuming System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system in this test responsible for consuming the document
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consuming System</em>' attribute.
	 * @see #setConsumingSystem(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentTest_ConsumingSystem()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='consumingSystem'"
	 * @generated
	 */
	String getConsumingSystem();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentTest#getConsumingSystem <em>Consuming System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consuming System</em>' attribute.
	 * @see #getConsumingSystem()
	 * @generated
	 */
	void setConsumingSystem(String value);

	/**
	 * Returns the value of the '<em><b>Creating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system in this test responsible for creating the document
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creating System</em>' attribute.
	 * @see #setCreatingSystem(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentTest_CreatingSystem()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='creatingSystem'"
	 * @generated
	 */
	String getCreatingSystem();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentTest#getCreatingSystem <em>Creating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creating System</em>' attribute.
	 * @see #getCreatingSystem()
	 * @generated
	 */
	void setCreatingSystem(String value);

	/**
	 * Returns the value of the '<em><b>Example File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a file which contains the actual content of the document to be created or consumed
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Example File</em>' attribute.
	 * @see #setExampleFile(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentTest_ExampleFile()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.LocalFileReference"
	 *        extendedMetaData="kind='attribute' name='exampleFile'"
	 * @generated
	 */
	String getExampleFile();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentTest#getExampleFile <em>Example File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example File</em>' attribute.
	 * @see #getExampleFile()
	 * @generated
	 */
	void setExampleFile(String value);

} // DocumentTest
