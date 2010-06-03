/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.profile;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Codegen Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getNsPrefix <em>Ns Prefix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getBase_Namespace <em>Base Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getCodegenSupport()
 * @model
 * @generated
 */
public interface CodegenSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getCodegenSupport_BasePackage()
	 * @model ordered="false"
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns Prefix</em>' attribute.
	 * @see #setNsPrefix(String)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getCodegenSupport_NsPrefix()
	 * @model ordered="false"
	 * @generated
	 */
	String getNsPrefix();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getNsPrefix <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns Prefix</em>' attribute.
	 * @see #getNsPrefix()
	 * @generated
	 */
	void setNsPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns URI</em>' attribute.
	 * @see #setNsURI(String)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getCodegenSupport_NsURI()
	 * @model ordered="false"
	 * @generated
	 */
	String getNsURI();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getNsURI <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns URI</em>' attribute.
	 * @see #getNsURI()
	 * @generated
	 */
	void setNsURI(String value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getCodegenSupport_PackageName()
	 * @model ordered="false"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getCodegenSupport_Prefix()
	 * @model ordered="false"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Base Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Namespace</em>' reference.
	 * @see #setBase_Namespace(Namespace)
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#getCodegenSupport_Base_Namespace()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Namespace getBase_Namespace();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getBase_Namespace <em>Base Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Namespace</em>' reference.
	 * @see #getBase_Namespace()
	 * @generated
	 */
	void setBase_Namespace(Namespace value);

} // CodegenSupport
