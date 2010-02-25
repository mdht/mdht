/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.cdaprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.TextValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.TextValue#isIgnoreCase <em>Ignore Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage#getTextValue()
 * @model
 * @generated
 */
public interface TextValue extends PropertyValidation {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage#getTextValue_Value()
	 * @model ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.TextValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Case</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Case</em>' attribute.
	 * @see #setIgnoreCase(boolean)
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage#getTextValue_IgnoreCase()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isIgnoreCase();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.TextValue#isIgnoreCase <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Case</em>' attribute.
	 * @see #isIgnoreCase()
	 * @generated
	 */
	void setIgnoreCase(boolean value);

} // TextValue
