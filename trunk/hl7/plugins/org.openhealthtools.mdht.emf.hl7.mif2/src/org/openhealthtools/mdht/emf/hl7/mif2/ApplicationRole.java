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
 * A representation of the model object '<em><b>Application Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies the capabilities of a system or part of a system
 * UML: stereotype on Interaction
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRole#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRole#getRelatedApplicationRoles <em>Related Application Roles</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRole#getSendsInteractions <em>Sends Interactions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRole#getReceivesInteractions <em>Receives Interactions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRole#getCreatesDocuments <em>Creates Documents</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRole#getConsumesDocuments <em>Consumes Documents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getApplicationRole()
 * @model extendedMetaData="name='ApplicationRole' kind='elementOnly'"
 * @generated
 */
public interface ApplicationRole extends PackageArtifact {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments associated with an interaction.
	 * UML: A collector for the comments and constraints associated with an interaction.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(ApplicationRoleAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getApplicationRole_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicationRoleAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRole#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(ApplicationRoleAnnotations value);

	/**
	 * Returns the value of the '<em><b>Related Application Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.RelatedAppRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies other application roles that may form part of the current role
	 * UML: Generalized interfaces and specialized interfaces
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Application Roles</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getApplicationRole_RelatedApplicationRoles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedApplicationRoles' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelatedAppRole> getRelatedApplicationRoles();

	/**
	 * Returns the value of the '<em><b>Sends Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies all interactions for which this system can be the sender
	 * UML: Operations the interface has the behavior to invoke
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sends Interactions</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getApplicationRole_SendsInteractions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sendsInteractions' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageRef> getSendsInteractions();

	/**
	 * Returns the value of the '<em><b>Receives Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies all interactions for which this system can be the receiver
	 * UML: Operations on the interface
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receives Interactions</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getApplicationRole_ReceivesInteractions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='receivesInteractions' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageRef> getReceivesInteractions();

	/**
	 * Returns the value of the '<em><b>Creates Documents</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies all documents which this system can create
	 * UML: 'createDocument' operation with the return type of the specified model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creates Documents</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getApplicationRole_CreatesDocuments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='createsDocuments' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageRef> getCreatesDocuments();

	/**
	 * Returns the value of the '<em><b>Consumes Documents</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies all documents which this system can process
	 * UML: 'consumeDocument' operation with the parameter type of the specified model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumes Documents</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getApplicationRole_ConsumesDocuments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='consumesDocuments' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageRef> getConsumesDocuments();

} // ApplicationRole
