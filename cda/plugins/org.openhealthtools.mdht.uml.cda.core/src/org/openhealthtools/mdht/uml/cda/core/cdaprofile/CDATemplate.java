/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.cdaprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDATemplate#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDATemplate#getAssigningAuthorityName <em>Assigning Authority Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDATemplate#isContextDependent <em>Context Dependent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage#getCDATemplate()
 * @model
 * @generated
 */
public interface CDATemplate extends ClassValidation {
	/**
	 * Returns the value of the '<em><b>Template Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Id</em>' attribute.
	 * @see #setTemplateId(String)
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage#getCDATemplate_TemplateId()
	 * @model ordered="false"
	 * @generated
	 */
	String getTemplateId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDATemplate#getTemplateId <em>Template Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Id</em>' attribute.
	 * @see #getTemplateId()
	 * @generated
	 */
	void setTemplateId(String value);

	/**
	 * Returns the value of the '<em><b>Assigning Authority Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigning Authority Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigning Authority Name</em>' attribute.
	 * @see #setAssigningAuthorityName(String)
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage#getCDATemplate_AssigningAuthorityName()
	 * @model ordered="false"
	 * @generated
	 */
	String getAssigningAuthorityName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDATemplate#getAssigningAuthorityName <em>Assigning Authority Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigning Authority Name</em>' attribute.
	 * @see #getAssigningAuthorityName()
	 * @generated
	 */
	void setAssigningAuthorityName(String value);

	/**
	 * Returns the value of the '<em><b>Context Dependent</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Dependent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Dependent</em>' attribute.
	 * @see #setContextDependent(boolean)
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage#getCDATemplate_ContextDependent()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isContextDependent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDATemplate#isContextDependent <em>Context Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Dependent</em>' attribute.
	 * @see #isContextDependent()
	 * @generated
	 */
	void setContextDependent(boolean value);

} // CDATemplate
