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
 * A representation of the model object '<em><b>Interaction Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes how a system supports or should support a particular interaction
 * UML: A stereotype on package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile#getImplementationConstraints <em>Implementation Constraints</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile#getArgumentMessage <em>Argument Message</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile#getEffectiveStaticModel <em>Effective Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile#getReceiverResponsibilities <em>Receiver Responsibilities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile#getInternalMapping <em>Internal Mapping</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile#getProfileType <em>Profile Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionProfile()
 * @model extendedMetaData="name='InteractionProfile' kind='elementOnly'"
 * @generated
 */
public interface InteractionProfile extends org.openhealthtools.mdht.emf.hl7.mif2.Package {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the interaction profile.
	 * UML: A collector for the comments and constraints associated with a static model package.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(InteractionProfileAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionProfile_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	InteractionProfileAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(InteractionProfileAnnotations value);

	/**
	 * Returns the value of the '<em><b>Implementation Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies general restrictions on the ability to support HL7 elements including realms, datatypes, vocabulary, ITSs, etc.  Any specified here override those specified at the conformance profile level.
	 * UML: Tag on DocumentProfile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Constraints</em>' containment reference.
	 * @see #setImplementationConstraints(ImplementationMessageConstraints)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionProfile_ImplementationConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='implementationConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplementationMessageConstraints getImplementationConstraints();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile#getImplementationConstraints <em>Implementation Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Constraints</em>' containment reference.
	 * @see #getImplementationConstraints()
	 * @generated
	 */
	void setImplementationConstraints(ImplementationMessageConstraints value);

	/**
	 * Returns the value of the '<em><b>Argument Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the fully-bound static model which defines the type for the content transmitted by the interaction.
	 * UML: The Classifier bound as a Parameter to the Operation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument Message</em>' containment reference.
	 * @see #setArgumentMessage(BoundStaticModel)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionProfile_ArgumentMessage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='argumentMessage' namespace='##targetNamespace'"
	 * @generated
	 */
	BoundStaticModel getArgumentMessage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile#getArgumentMessage <em>Argument Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Message</em>' containment reference.
	 * @see #getArgumentMessage()
	 * @generated
	 */
	void setArgumentMessage(BoundStaticModel value);

	/**
	 * Returns the value of the '<em><b>Effective Static Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shows the static model fully expanded including the contents of all models bound to stubs, expanding CMETs, etc.
	 * UML: The type for the parameter
	 * Derive: Fully unroll the static model, substituting all datatype and vocabulary substitutions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Static Model</em>' containment reference.
	 * @see #setEffectiveStaticModel(SerializedStaticModel)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionProfile_EffectiveStaticModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='effectiveStaticModel' namespace='##targetNamespace'"
	 * @generated
	 */
	SerializedStaticModel getEffectiveStaticModel();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile#getEffectiveStaticModel <em>Effective Static Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Static Model</em>' containment reference.
	 * @see #getEffectiveStaticModel()
	 * @generated
	 */
	void setEffectiveStaticModel(SerializedStaticModel value);

	/**
	 * Returns the value of the '<em><b>Receiver Responsibilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ReceiverResponsibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies one of the responsibilities the receiver actually supports and provides details about how the responsibility is actually chosen, including any ability to configure system behavior relating to the receiver responsibility.
	 * UML: Describes the internal state machine associated with the CallEvent triggered by invoking this operation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Responsibilities</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionProfile_ReceiverResponsibilities()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='receiverResponsibilities' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReceiverResponsibility> getReceiverResponsibilities();

	/**
	 * Returns the value of the '<em><b>Internal Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a detailed indication of the circumstances in which the interaction is sent, and particularly the determination process for which system(s) the interaction is sent to, including an ability to configure or provide real-time control over recipients.
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal Mapping</em>' containment reference.
	 * @see #setInternalMapping(ComplexMarkupWithLanguage)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionProfile_InternalMapping()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='internalMapping' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexMarkupWithLanguage getInternalMapping();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile#getInternalMapping <em>Internal Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Mapping</em>' containment reference.
	 * @see #getInternalMapping()
	 * @generated
	 */
	void setInternalMapping(ComplexMarkupWithLanguage value);

	/**
	 * Returns the value of the '<em><b>Profile Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the profile relates to sent interactions, received interactions or both
	 * UML Tag on DocumentProfile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileKind
	 * @see #isSetProfileType()
	 * @see #unsetProfileType()
	 * @see #setProfileType(InteractionProfileKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionProfile_ProfileType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='profileType'"
	 * @generated
	 */
	InteractionProfileKind getProfileType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile#getProfileType <em>Profile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileKind
	 * @see #isSetProfileType()
	 * @see #unsetProfileType()
	 * @see #getProfileType()
	 * @generated
	 */
	void setProfileType(InteractionProfileKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile#getProfileType <em>Profile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProfileType()
	 * @see #getProfileType()
	 * @see #setProfileType(InteractionProfileKind)
	 * @generated
	 */
	void unsetProfileType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile#getProfileType <em>Profile Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Profile Type</em>' attribute is set.
	 * @see #unsetProfileType()
	 * @see #getProfileType()
	 * @see #setProfileType(InteractionProfileKind)
	 * @generated
	 */
	boolean isSetProfileType();

} // InteractionProfile
