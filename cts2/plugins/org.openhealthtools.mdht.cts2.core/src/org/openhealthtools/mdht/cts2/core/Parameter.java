/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A parameter in a REST Resource
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Parameter#getVal <em>Val</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Parameter#getArg <em>Arg</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getParameter()
 * @model extendedMetaData="name='Parameter' kind='elementOnly'"
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see #setVal(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getParameter_Val()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.String" required="true"
	 *        extendedMetaData="kind='element' name='val' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVal();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Parameter#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(String value);

	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getParameter_Arg()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='arg'"
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Parameter#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

} // Parameter
