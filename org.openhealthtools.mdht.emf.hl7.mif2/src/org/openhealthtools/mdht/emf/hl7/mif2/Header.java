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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines common content for all major artifact types.  It should always be present in the root element of a document.
 * UML: tag object on Package stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Header#getRenderingInformation <em>Rendering Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Header#getLegalese <em>Legalese</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Header#getResponsibleGroup <em>Responsible Group</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Header#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Header#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Header#getApprovalInfo <em>Approval Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Header#getContext <em>Context</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Header#getRealmNamespace <em>Realm Namespace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Header#getPrimaryRepository <em>Primary Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getHeader()
 * @model extendedMetaData="name='Header' kind='elementOnly'"
 * @generated
 */
public interface Header extends EObject {
	/**
	 * Returns the value of the '<em><b>Rendering Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides information about the creation of this particular (XML, XMI or other) representation of the package
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rendering Information</em>' containment reference.
	 * @see #setRenderingInformation(RenderingInformation)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getHeader_RenderingInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='renderingInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	RenderingInformation getRenderingInformation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Header#getRenderingInformation <em>Rendering Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendering Information</em>' containment reference.
	 * @see #getRenderingInformation()
	 * @generated
	 */
	void setRenderingInformation(RenderingInformation value);

	/**
	 * Returns the value of the '<em><b>Legalese</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any legal restrictions or rights associated with the package
	 * UML: Part of a complex tag value
	 * DublinCore: corresponds to 'rights'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legalese</em>' containment reference.
	 * @see #setLegalese(Legalese)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getHeader_Legalese()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='legalese' namespace='##targetNamespace'"
	 * @generated
	 */
	Legalese getLegalese();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Header#getLegalese <em>Legalese</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legalese</em>' containment reference.
	 * @see #getLegalese()
	 * @generated
	 */
	void setLegalese(Legalese value);

	/**
	 * Returns the value of the '<em><b>Responsible Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ResponsibleGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies organizations responsible for the content of the package
	 * UML: Part of a complex tag value
	 * DublinCore: Equivalent to 'contributor'.  (HL7 doesn't really identify 'authors' because content tends to be mutually created.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responsible Group</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getHeader_ResponsibleGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsibleGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResponsibleGroup> getResponsibleGroup();

	/**
	 * Returns the value of the '<em><b>Contributor</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.Contributor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies individuals who contributed to the creation or maintenance of the package
	 * UML: Part of a complex tag value
	 * DublinCore: Equivalent to 'contributor'.  (HL7 doesn't really identify 'authors' because content tends to be mutually created.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contributor</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getHeader_Contributor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contributor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Contributor> getContributor();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A word to expose a key concept that might be used in searching for the identified package.
	 * UML: Part of a complex tag value
	 * DublinCore: Equivalent to 'subject'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getHeader_Subject()
	 * @model unique="false" dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getSubject();

	/**
	 * Returns the value of the '<em><b>Approval Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the approval status and information associated with the package
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approval Info</em>' containment reference.
	 * @see #setApprovalInfo(ApprovalInfo)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getHeader_ApprovalInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='approvalInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	ApprovalInfo getApprovalInfo();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Header#getApprovalInfo <em>Approval Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Info</em>' containment reference.
	 * @see #getApprovalInfo()
	 * @generated
	 */
	void setApprovalInfo(ApprovalInfo value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates any additional realms for which the package is intended other than the namespace realm in which the artifact is defined
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getHeader_Context()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='Context:6'"
	 * @generated
	 */
	FeatureMap getContext();

	/**
	 * Returns the value of the '<em><b>Realm Namespace</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.RealmElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the affiliate or sub-realm associated with the element.  If none is specified, the affiliate associated with the package is assumed.
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realm Namespace</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getHeader_RealmNamespace()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='realmNamespace' namespace='##targetNamespace' group='#Context:6'"
	 * @generated
	 */
	EList<RealmElement> getRealmNamespace();

	/**
	 * Returns the value of the '<em><b>Primary Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the electronic repository where the artifact is principally maintained.  I.e. This would be the best location to check for new versions or updates of the artifact.  Note that a given artifact can exist in multiple repositories.  If not specified, the HL7 artifact repository is assumed.
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Repository</em>' attribute.
	 * @see #setPrimaryRepository(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getHeader_PrimaryRepository()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Url"
	 *        extendedMetaData="kind='attribute' name='primaryRepository'"
	 * @generated
	 */
	String getPrimaryRepository();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Header#getPrimaryRepository <em>Primary Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Repository</em>' attribute.
	 * @see #getPrimaryRepository()
	 * @generated
	 */
	void setPrimaryRepository(String value);

} // Header
