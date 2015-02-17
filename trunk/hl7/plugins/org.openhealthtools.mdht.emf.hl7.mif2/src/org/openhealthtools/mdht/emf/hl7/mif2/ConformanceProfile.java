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
 * A representation of the model object '<em><b>Conformance Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the artifacts supported by a system, as well as any constraints on that support
 * UML: A stereotype on package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfile#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfile#getStoryboards <em>Storyboards</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfile#getImplementationConstraints <em>Implementation Constraints</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfile#getSupportedApplicationRoles <em>Supported Application Roles</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfile#getSupportedTriggerEvents <em>Supported Trigger Events</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfile#getSupportedAppRoleInteractions <em>Supported App Role Interactions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfile#getUnsupportedAppRoleInteractions <em>Unsupported App Role Interactions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfile#getExtraInteractions <em>Extra Interactions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfile#getSupportedAppRoleDocuments <em>Supported App Role Documents</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfile#getUnsupportedAppRoleDocuments <em>Unsupported App Role Documents</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfile#getExtraDocuments <em>Extra Documents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfile()
 * @model extendedMetaData="name='ConformanceProfile' kind='elementOnly'"
 * @generated
 */
public interface ConformanceProfile extends org.openhealthtools.mdht.emf.hl7.mif2.Package {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the conformanceProfile.
	 * UML: A collector for the comments and constraints associated with a static model package.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(ConformanceProfileAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfile_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	ConformanceProfileAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfile#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(ConformanceProfileAnnotations value);

	/**
	 * Returns the value of the '<em><b>Storyboards</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.Storyboard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Storyboards which are specifically supported by (or which help describe the capabilities supported by) the profile
	 * UML: A stereotype on UseCase
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storyboards</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfile_Storyboards()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='storyboards' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Storyboard> getStoryboards();

	/**
	 * Returns the value of the '<em><b>Implementation Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies general restrictions on the ability to support HL7 elements including realms, datatypes, vocabulary, ITSs, etc.  These restrictions apply to all interactions unless specifically overridden in a particular interaction profile.
	 * UML: Tag on ConformanceProfile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Constraints</em>' containment reference.
	 * @see #setImplementationConstraints(ImplementationMessageConstraints)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfile_ImplementationConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='implementationConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplementationMessageConstraints getImplementationConstraints();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfile#getImplementationConstraints <em>Implementation Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Constraints</em>' containment reference.
	 * @see #getImplementationConstraints()
	 * @generated
	 */
	void setImplementationConstraints(ImplementationMessageConstraints value);

	/**
	 * Returns the value of the '<em><b>Supported Application Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the application roles supported or which should be supported by a system.  Note: If not all component application roles are supported, support for the overall application role cannot be declared.
	 * UML: Interfaces supported by this interface
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Application Roles</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfile_SupportedApplicationRoles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportedApplicationRoles' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageRef> getSupportedApplicationRoles();

	/**
	 * Returns the value of the '<em><b>Supported Trigger Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceTriggerEvents}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the trigger events implemented as well as any constraints on them
	 * UML: A stereotype on Event
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Trigger Events</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfile_SupportedTriggerEvents()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportedTriggerEvents' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConformanceTriggerEvents> getSupportedTriggerEvents();

	/**
	 * Returns the value of the '<em><b>Supported App Role Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines static and dynamic behavior for an interaction that is referenced by one or more of the application roles included in the profile and is supported by the system.
	 * UML: Operations supported by this Interface inherited from other interfaces
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported App Role Interactions</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfile_SupportedAppRoleInteractions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportedAppRoleInteractions' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InteractionProfile> getSupportedAppRoleInteractions();

	/**
	 * Returns the value of the '<em><b>Unsupported App Role Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a static and dynamic behavior for an interaction that is referenced by one or more of the application roles included in the profile and is not supported by the system.  Note: If there are any interactions listed here, the profile is non-conformant.
	 * UML: Operations supported by this Interface inherited from other interfaces that are not supported
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unsupported App Role Interactions</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfile_UnsupportedAppRoleInteractions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unsupportedAppRoleInteractions' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageRef> getUnsupportedAppRoleInteractions();

	/**
	 * Returns the value of the '<em><b>Extra Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a static and dynamic behavior for an interaction that is NOT referenced by any of the application roles included in the profile
	 * UML: A stereotype on Operation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extra Interactions</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfile_ExtraInteractions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extraInteractions' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InteractionProfile> getExtraInteractions();

	/**
	 * Returns the value of the '<em><b>Supported App Role Documents</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines constraints on ability to read and/or create a document that is referenced by one or more of the application roles included in the profile and is supported by the system.
	 * UML: Operations supported by this Interface inherited from other interfaces
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported App Role Documents</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfile_SupportedAppRoleDocuments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportedAppRoleDocuments' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentProfile> getSupportedAppRoleDocuments();

	/**
	 * Returns the value of the '<em><b>Unsupported App Role Documents</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies documents which are claimed to be supported by listed application roles, but which are not in fact supported by this application.
	 * UML: Operations supported by this Interface inherited from other interfaces that are not supported
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unsupported App Role Documents</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfile_UnsupportedAppRoleDocuments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unsupportedAppRoleDocuments' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageRef> getUnsupportedAppRoleDocuments();

	/**
	 * Returns the value of the '<em><b>Extra Documents</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines constraints on ability to read and/or create a document that is NOT referenced by any of the application roles included in the profile
	 * UML: A stereotype on Operation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extra Documents</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfile_ExtraDocuments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extraDocuments' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentProfile> getExtraDocuments();

} // ConformanceProfile
