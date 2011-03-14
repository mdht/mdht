/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.profile;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.Validation#getMessage <em>Message</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.Validation#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.Validation#getRuleId <em>Rule Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.Validation#isMandatory <em>Mandatory</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getValidation()
 * @model abstract="true"
 * @generated
 */
public interface Validation extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getValidation_Message()
	 * @model ordered="false"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.Validation#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.cda.core.profile.SeverityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.SeverityKind
	 * @see #setSeverity(SeverityKind)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getValidation_Severity()
	 * @model ordered="false"
	 * @generated
	 */
	SeverityKind getSeverity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.Validation#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.SeverityKind
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(SeverityKind value);

	/**
	 * Returns the value of the '<em><b>Rule Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Id</em>' attribute list.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getValidation_RuleId()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getRuleId();

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getValidation_Mandatory()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.Validation#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

} // Validation
