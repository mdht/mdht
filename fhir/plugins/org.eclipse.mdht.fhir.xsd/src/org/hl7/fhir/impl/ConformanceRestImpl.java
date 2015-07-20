/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.ConformanceInteraction1;
import org.hl7.fhir.ConformanceOperation;
import org.hl7.fhir.ConformanceResource;
import org.hl7.fhir.ConformanceRest;
import org.hl7.fhir.ConformanceSecurity;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.RestfulConformanceMode;
import org.hl7.fhir.TransactionMode;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformance Rest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConformanceRestImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceRestImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceRestImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceRestImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceRestImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceRestImpl#getTransactionMode <em>Transaction Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceRestImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceRestImpl#getDocumentMailbox <em>Document Mailbox</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceRestImpl#getCompartment <em>Compartment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformanceRestImpl extends BackboneElementImpl implements ConformanceRest {
	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected RestfulConformanceMode mode;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String documentation;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected ConformanceSecurity security;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceResource> resource;

	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceInteraction1> interaction;

	/**
	 * The cached value of the '{@link #getTransactionMode() <em>Transaction Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionMode()
	 * @generated
	 * @ordered
	 */
	protected TransactionMode transactionMode;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceOperation> operation;

	/**
	 * The cached value of the '{@link #getDocumentMailbox() <em>Document Mailbox</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentMailbox()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> documentMailbox;

	/**
	 * The cached value of the '{@link #getCompartment() <em>Compartment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartment()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> compartment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceRestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConformanceRest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulConformanceMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMode(RestfulConformanceMode newMode, NotificationChain msgs) {
		RestfulConformanceMode oldMode = mode;
		mode = newMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_REST__MODE, oldMode, newMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(RestfulConformanceMode newMode) {
		if (newMode != mode) {
			NotificationChain msgs = null;
			if (mode != null)
				msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_REST__MODE, null, msgs);
			if (newMode != null)
				msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_REST__MODE, null, msgs);
			msgs = basicSetMode(newMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_REST__MODE, newMode, newMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(org.hl7.fhir.String newDocumentation, NotificationChain msgs) {
		org.hl7.fhir.String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_REST__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(org.hl7.fhir.String newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_REST__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_REST__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_REST__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceSecurity getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurity(ConformanceSecurity newSecurity, NotificationChain msgs) {
		ConformanceSecurity oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_REST__SECURITY, oldSecurity, newSecurity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity(ConformanceSecurity newSecurity) {
		if (newSecurity != security) {
			NotificationChain msgs = null;
			if (security != null)
				msgs = ((InternalEObject)security).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_REST__SECURITY, null, msgs);
			if (newSecurity != null)
				msgs = ((InternalEObject)newSecurity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_REST__SECURITY, null, msgs);
			msgs = basicSetSecurity(newSecurity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_REST__SECURITY, newSecurity, newSecurity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceResource> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<ConformanceResource>(ConformanceResource.class, this, FhirPackage.CONFORMANCE_REST__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceInteraction1> getInteraction() {
		if (interaction == null) {
			interaction = new EObjectContainmentEList<ConformanceInteraction1>(ConformanceInteraction1.class, this, FhirPackage.CONFORMANCE_REST__INTERACTION);
		}
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionMode getTransactionMode() {
		return transactionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionMode(TransactionMode newTransactionMode, NotificationChain msgs) {
		TransactionMode oldTransactionMode = transactionMode;
		transactionMode = newTransactionMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_REST__TRANSACTION_MODE, oldTransactionMode, newTransactionMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionMode(TransactionMode newTransactionMode) {
		if (newTransactionMode != transactionMode) {
			NotificationChain msgs = null;
			if (transactionMode != null)
				msgs = ((InternalEObject)transactionMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_REST__TRANSACTION_MODE, null, msgs);
			if (newTransactionMode != null)
				msgs = ((InternalEObject)newTransactionMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_REST__TRANSACTION_MODE, null, msgs);
			msgs = basicSetTransactionMode(newTransactionMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_REST__TRANSACTION_MODE, newTransactionMode, newTransactionMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceOperation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<ConformanceOperation>(ConformanceOperation.class, this, FhirPackage.CONFORMANCE_REST__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getDocumentMailbox() {
		if (documentMailbox == null) {
			documentMailbox = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.CONFORMANCE_REST__DOCUMENT_MAILBOX);
		}
		return documentMailbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getCompartment() {
		if (compartment == null) {
			compartment = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.CONFORMANCE_REST__COMPARTMENT);
		}
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONFORMANCE_REST__MODE:
				return basicSetMode(null, msgs);
			case FhirPackage.CONFORMANCE_REST__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case FhirPackage.CONFORMANCE_REST__SECURITY:
				return basicSetSecurity(null, msgs);
			case FhirPackage.CONFORMANCE_REST__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONFORMANCE_REST__INTERACTION:
				return ((InternalEList<?>)getInteraction()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONFORMANCE_REST__TRANSACTION_MODE:
				return basicSetTransactionMode(null, msgs);
			case FhirPackage.CONFORMANCE_REST__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONFORMANCE_REST__DOCUMENT_MAILBOX:
				return ((InternalEList<?>)getDocumentMailbox()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONFORMANCE_REST__COMPARTMENT:
				return ((InternalEList<?>)getCompartment()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.CONFORMANCE_REST__MODE:
				return getMode();
			case FhirPackage.CONFORMANCE_REST__DOCUMENTATION:
				return getDocumentation();
			case FhirPackage.CONFORMANCE_REST__SECURITY:
				return getSecurity();
			case FhirPackage.CONFORMANCE_REST__RESOURCE:
				return getResource();
			case FhirPackage.CONFORMANCE_REST__INTERACTION:
				return getInteraction();
			case FhirPackage.CONFORMANCE_REST__TRANSACTION_MODE:
				return getTransactionMode();
			case FhirPackage.CONFORMANCE_REST__OPERATION:
				return getOperation();
			case FhirPackage.CONFORMANCE_REST__DOCUMENT_MAILBOX:
				return getDocumentMailbox();
			case FhirPackage.CONFORMANCE_REST__COMPARTMENT:
				return getCompartment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.CONFORMANCE_REST__MODE:
				setMode((RestfulConformanceMode)newValue);
				return;
			case FhirPackage.CONFORMANCE_REST__DOCUMENTATION:
				setDocumentation((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONFORMANCE_REST__SECURITY:
				setSecurity((ConformanceSecurity)newValue);
				return;
			case FhirPackage.CONFORMANCE_REST__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends ConformanceResource>)newValue);
				return;
			case FhirPackage.CONFORMANCE_REST__INTERACTION:
				getInteraction().clear();
				getInteraction().addAll((Collection<? extends ConformanceInteraction1>)newValue);
				return;
			case FhirPackage.CONFORMANCE_REST__TRANSACTION_MODE:
				setTransactionMode((TransactionMode)newValue);
				return;
			case FhirPackage.CONFORMANCE_REST__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends ConformanceOperation>)newValue);
				return;
			case FhirPackage.CONFORMANCE_REST__DOCUMENT_MAILBOX:
				getDocumentMailbox().clear();
				getDocumentMailbox().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.CONFORMANCE_REST__COMPARTMENT:
				getCompartment().clear();
				getCompartment().addAll((Collection<? extends Uri>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.CONFORMANCE_REST__MODE:
				setMode((RestfulConformanceMode)null);
				return;
			case FhirPackage.CONFORMANCE_REST__DOCUMENTATION:
				setDocumentation((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONFORMANCE_REST__SECURITY:
				setSecurity((ConformanceSecurity)null);
				return;
			case FhirPackage.CONFORMANCE_REST__RESOURCE:
				getResource().clear();
				return;
			case FhirPackage.CONFORMANCE_REST__INTERACTION:
				getInteraction().clear();
				return;
			case FhirPackage.CONFORMANCE_REST__TRANSACTION_MODE:
				setTransactionMode((TransactionMode)null);
				return;
			case FhirPackage.CONFORMANCE_REST__OPERATION:
				getOperation().clear();
				return;
			case FhirPackage.CONFORMANCE_REST__DOCUMENT_MAILBOX:
				getDocumentMailbox().clear();
				return;
			case FhirPackage.CONFORMANCE_REST__COMPARTMENT:
				getCompartment().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.CONFORMANCE_REST__MODE:
				return mode != null;
			case FhirPackage.CONFORMANCE_REST__DOCUMENTATION:
				return documentation != null;
			case FhirPackage.CONFORMANCE_REST__SECURITY:
				return security != null;
			case FhirPackage.CONFORMANCE_REST__RESOURCE:
				return resource != null && !resource.isEmpty();
			case FhirPackage.CONFORMANCE_REST__INTERACTION:
				return interaction != null && !interaction.isEmpty();
			case FhirPackage.CONFORMANCE_REST__TRANSACTION_MODE:
				return transactionMode != null;
			case FhirPackage.CONFORMANCE_REST__OPERATION:
				return operation != null && !operation.isEmpty();
			case FhirPackage.CONFORMANCE_REST__DOCUMENT_MAILBOX:
				return documentMailbox != null && !documentMailbox.isEmpty();
			case FhirPackage.CONFORMANCE_REST__COMPARTMENT:
				return compartment != null && !compartment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConformanceRestImpl
