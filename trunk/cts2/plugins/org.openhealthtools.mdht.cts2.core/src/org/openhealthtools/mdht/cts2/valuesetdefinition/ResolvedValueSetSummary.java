/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolved Value Set Summary</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary#getResolvedHeader <em>Resolved Header</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary#getResolvedValueSetURI <em>Resolved Value Set URI</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getResolvedValueSetSummary()
 * @model extendedMetaData="name='ResolvedValueSetSummary' kind='elementOnly'"
 * @generated
 */
public interface ResolvedValueSetSummary extends EObject {
	/**
	 * Returns the value of the '<em><b>Resolved Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Header</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resolved Header</em>' containment reference.
	 * @see #setResolvedHeader(ResolvedValueSetHeader)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getResolvedValueSetSummary_ResolvedHeader()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resolvedHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ResolvedValueSetHeader getResolvedHeader();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary#getResolvedHeader
	 * <em>Resolved Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resolved Header</em>' containment reference.
	 * @see #getResolvedHeader()
	 * @generated
	 */
	void setResolvedHeader(ResolvedValueSetHeader value);

	/**
	 * Returns the value of the '<em><b>Resolved Value Set URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Value Set URI</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resolved Value Set URI</em>' attribute.
	 * @see #setResolvedValueSetURI(String)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getResolvedValueSetSummary_ResolvedValueSetURI()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.LocalURI" required="true"
	 *        extendedMetaData="kind='attribute' name='resolvedValueSetURI'"
	 * @generated
	 */
	String getResolvedValueSetURI();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary#getResolvedValueSetURI
	 * <em>Resolved Value Set URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resolved Value Set URI</em>' attribute.
	 * @see #getResolvedValueSetURI()
	 * @generated
	 */
	void setResolvedValueSetURI(String value);

} // ResolvedValueSetSummary
