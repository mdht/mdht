/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.term.core.profile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CD</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CD#getQualifier <em>Qualifier</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CD#getTranslation <em>Translation</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CD#getCode <em>Code</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CD#getCodeSystem <em>Code System</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CD#getCodeSystemName <em>Code System Name</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CD#getCodeSystemVersion <em>Code System Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CD#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCD()
 * @model
 * @generated
 */
public interface CD extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.term.core.profile.CR}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCD_Qualifier()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CR> getQualifier();

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.term.core.profile.CD}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Translation</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCD_Translation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CD> getTranslation();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCD_Code()
	 * @model ordered="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.CD#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Code System</em>' attribute.
	 * @see #setCodeSystem(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCD_CodeSystem()
	 * @model ordered="false"
	 * @generated
	 */
	String getCodeSystem();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.CD#getCodeSystem <em>Code System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System</em>' attribute.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(String value);

	/**
	 * Returns the value of the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Code System Name</em>' attribute.
	 * @see #setCodeSystemName(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCD_CodeSystemName()
	 * @model ordered="false"
	 * @generated
	 */
	String getCodeSystemName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.CD#getCodeSystemName <em>Code System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System Name</em>' attribute.
	 * @see #getCodeSystemName()
	 * @generated
	 */
	void setCodeSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System Version</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Code System Version</em>' attribute.
	 * @see #setCodeSystemVersion(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCD_CodeSystemVersion()
	 * @model ordered="false"
	 * @generated
	 */
	String getCodeSystemVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.CD#getCodeSystemVersion <em>Code System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System Version</em>' attribute.
	 * @see #getCodeSystemVersion()
	 * @generated
	 */
	void setCodeSystemVersion(String value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCD_DisplayName()
	 * @model ordered="false"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.CD#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

} // CD
