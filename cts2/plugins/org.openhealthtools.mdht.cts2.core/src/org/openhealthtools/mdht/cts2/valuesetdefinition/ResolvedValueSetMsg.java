/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition;

import org.openhealthtools.mdht.cts2.core.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolved Value Set Msg</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">ResolvedValueSet</i> read from a service instance.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetMsg#getResolvedValueSet <em>Resolved Value Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getResolvedValueSetMsg()
 * @model extendedMetaData="name='ResolvedValueSetMsg' kind='elementOnly'"
 * @generated
 */
public interface ResolvedValueSetMsg extends Message {
	/**
	 * Returns the value of the '<em><b>Resolved Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Value Set</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resolved Value Set</em>' containment reference.
	 * @see #setResolvedValueSet(ResolvedValueSet)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getResolvedValueSetMsg_ResolvedValueSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resolvedValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ResolvedValueSet getResolvedValueSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetMsg#getResolvedValueSet
	 * <em>Resolved Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resolved Value Set</em>' containment reference.
	 * @see #getResolvedValueSet()
	 * @generated
	 */
	void setResolvedValueSet(ResolvedValueSet value);

} // ResolvedValueSetMsg
