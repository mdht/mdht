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

import org.openhealthtools.mdht.emf.w3c.xhtml.Img;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Area Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the content for subject areas
 * UML: SubjectAreaPackage stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaPackage#getApprovalInfo <em>Approval Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaPackage#getGraphicRepresentation <em>Graphic Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaPackage#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaPackage#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaPackage#getSubjectAreaPackage <em>Subject Area Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaPackage#getContainedClass <em>Contained Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSubjectAreaPackage()
 * @model extendedMetaData="name='SubjectAreaPackage' kind='elementOnly'"
 * @generated
 */
public interface SubjectAreaPackage extends PackageBase {
	/**
	 * Returns the value of the '<em><b>Approval Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the ballot or other approval status and information associated with the subject area
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approval Info</em>' containment reference.
	 * @see #setApprovalInfo(ApprovalInfo)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSubjectAreaPackage_ApprovalInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='approvalInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	ApprovalInfo getApprovalInfo();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaPackage#getApprovalInfo <em>Approval Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Info</em>' containment reference.
	 * @see #getApprovalInfo()
	 * @generated
	 */
	void setApprovalInfo(ApprovalInfo value);

	/**
	 * Returns the value of the '<em><b>Graphic Representation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.StaticPackageDiagramGraphicInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the display shape(s) associated with the static package
	 * UML: association from ModelElement to SemanticModelBridge for a diagram
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graphic Representation</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSubjectAreaPackage_GraphicRepresentation()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='graphicRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StaticPackageDiagramGraphicInformation> getGraphicRepresentation();

	/**
	 * Returns the value of the '<em><b>Figure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A graphical representation of the classes in a static package model.
	 * UML: figure tag on StaticPackage stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Figure</em>' containment reference.
	 * @see #setFigure(Img)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSubjectAreaPackage_Figure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='figure' namespace='##targetNamespace'"
	 * @generated
	 */
	Img getFigure();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaPackage#getFigure <em>Figure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure</em>' containment reference.
	 * @see #getFigure()
	 * @generated
	 */
	void setFigure(Img value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the subject area.
	 * UML: A collector for the comments and constraints associated with a subject area.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(SubjectAreaAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSubjectAreaPackage_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjectAreaAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaPackage#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(SubjectAreaAnnotations value);

	/**
	 * Returns the value of the '<em><b>Subject Area Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a 'sub-package' owned by the current static package.  All classes within the 'sub-packages' are always imported into their parent static package.  This means the names of all classes within a static package must be unique.  Graphically it represents a grouping of classes that may be represented on a separate page.
	 * UML: SubjectAreaPackage stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Area Package</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSubjectAreaPackage_SubjectAreaPackage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subjectAreaPackage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubjectAreaPackage> getSubjectAreaPackage();

	/**
	 * Returns the value of the '<em><b>Contained Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.LocalClassRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classes (including CMETs and stubs) that are part of the subject area.  Includes CMETs and stubs as well.
	 * UML: Classes accessed by the SubjectAreaPackage
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Class</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSubjectAreaPackage_ContainedClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containedClass' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocalClassRef> getContainedClass();

} // SubjectAreaPackage
