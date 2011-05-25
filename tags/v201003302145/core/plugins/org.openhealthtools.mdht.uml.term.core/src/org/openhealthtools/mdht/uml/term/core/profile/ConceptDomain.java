/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.term.core.profile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ConceptDomain#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ConceptDomain#getFullName <em>Full Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ConceptDomain#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ConceptDomain#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ConceptDomain#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getConceptDomain()
 * @model
 * @generated
 */
public interface ConceptDomain extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getConceptDomain_Identifier()
	 * @model ordered="false"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ConceptDomain#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getConceptDomain_FullName()
	 * @model ordered="false"
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ConceptDomain#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.term.core.profile.StatusKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.term.core.profile.StatusKind
	 * @see #setStatus(StatusKind)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getConceptDomain_Status()
	 * @model ordered="false"
	 * @generated
	 */
	StatusKind getStatus();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ConceptDomain#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.term.core.profile.StatusKind
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusKind value);

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Date</em>' attribute.
	 * @see #setStatusDate(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getConceptDomain_StatusDate()
	 * @model ordered="false"
	 * @generated
	 */
	String getStatusDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ConceptDomain#getStatusDate <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' attribute.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(String value);

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getConceptDomain_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ConceptDomain#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // ConceptDomain