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
 * A representation of the model object '<em><b>Changeable</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * An element that can evolve over time. All <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Changeable</i> elements must have identity.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Changeable#getStatus <em>Status</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Changeable#getChangeDescription <em>Change Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Changeable#getEntryState <em>Entry State</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeable()
 * @model abstract="true"
 *        extendedMetaData="name='Changeable' kind='elementOnly'"
 * @generated
 */
public interface Changeable extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the state of this model element in an externally defined workflow
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(StatusReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeable_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusReference getStatus();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Changeable#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusReference value);

	/**
	 * Returns the value of the '<em><b>Change Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detailed information about the last change that resulted in this changeable element being in the state that it is now. changeDescription is
	 * only present in services that support the HISTORY profile and then only when specifically requested.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Change Description</em>' containment reference.
	 * @see #setChangeDescription(ChangeDescription)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeable_ChangeDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='changeDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeDescription getChangeDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Changeable#getChangeDescription <em>Change Description</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Change Description</em>' containment reference.
	 * @see #getChangeDescription()
	 * @generated
	 */
	void setChangeDescription(ChangeDescription value);

	/**
	 * Returns the value of the '<em><b>Entry State</b></em>' attribute.
	 * The default value is <code>"ACTIVE"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.core.EntryState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an indicator that states whether the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Changeable</i> element is <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ACTIVE</i>, and subject to searching and browsing access or <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">INACTIVE</i>, meaning that it is only accessible if its identity is
	 * already known or if the service calls specifically state that they want to see inactive service elements
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Entry State</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.EntryState
	 * @see #isSetEntryState()
	 * @see #unsetEntryState()
	 * @see #setEntryState(EntryState)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeable_EntryState()
	 * @model default="ACTIVE" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='entryState'"
	 * @generated
	 */
	EntryState getEntryState();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Changeable#getEntryState <em>Entry State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entry State</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.EntryState
	 * @see #isSetEntryState()
	 * @see #unsetEntryState()
	 * @see #getEntryState()
	 * @generated
	 */
	void setEntryState(EntryState value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.core.Changeable#getEntryState <em>Entry State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetEntryState()
	 * @see #getEntryState()
	 * @see #setEntryState(EntryState)
	 * @generated
	 */
	void unsetEntryState();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.core.Changeable#getEntryState <em>Entry State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Entry State</em>' attribute is set.
	 * @see #unsetEntryState()
	 * @see #getEntryState()
	 * @see #setEntryState(EntryState)
	 * @generated
	 */
	boolean isSetEntryState();

} // Changeable
