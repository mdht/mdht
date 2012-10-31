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
 * A representation of the model object '<em><b>Finalizable</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * The <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Finalizable</i> mixin determines whether a resource version or a change set is still
 * undergoing change (<i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">OPEN</i>) or has reached its final state (<i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">FINAL</i>).
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Finalizable#getState <em>State</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getFinalizable()
 * @model abstract="true"
 *        extendedMetaData="name='Finalizable' kind='empty'"
 * @generated
 */
public interface Finalizable extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"FINAL"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.core.FinalizableState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the state of the inheriting resource
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.FinalizableState
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #setState(FinalizableState)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getFinalizable_State()
	 * @model default="FINAL" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='state'"
	 * @generated
	 */
	FinalizableState getState();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Finalizable#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>State</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.FinalizableState
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #getState()
	 * @generated
	 */
	void setState(FinalizableState value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.core.Finalizable#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetState()
	 * @see #getState()
	 * @see #setState(FinalizableState)
	 * @generated
	 */
	void unsetState();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.core.Finalizable#getState <em>State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>State</em>' attribute is set.
	 * @see #unsetState()
	 * @see #getState()
	 * @see #setState(FinalizableState)
	 * @generated
	 */
	boolean isSetState();

} // Finalizable
