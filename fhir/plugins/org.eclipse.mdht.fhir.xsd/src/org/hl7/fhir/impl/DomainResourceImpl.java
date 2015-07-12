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

import org.hl7.fhir.DomainResource;
import org.hl7.fhir.Extension;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Narrative;
import org.hl7.fhir.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DomainResourceImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DomainResourceImpl#getContained <em>Contained</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DomainResourceImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DomainResourceImpl#getModifierExtension <em>Modifier Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainResourceImpl extends ResourceImpl implements DomainResource {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Narrative text;

	/**
	 * The cached value of the '{@link #getContained() <em>Contained</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceContainer> contained;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> extension;

	/**
	 * The cached value of the '{@link #getModifierExtension() <em>Modifier Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifierExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> modifierExtension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDomainResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Narrative getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(Narrative newText, NotificationChain msgs) {
		Narrative oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOMAIN_RESOURCE__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(Narrative newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOMAIN_RESOURCE__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOMAIN_RESOURCE__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOMAIN_RESOURCE__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceContainer> getContained() {
		if (contained == null) {
			contained = new EObjectContainmentEList<ResourceContainer>(ResourceContainer.class, this, FhirPackage.DOMAIN_RESOURCE__CONTAINED);
		}
		return contained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getExtension() {
		if (extension == null) {
			extension = new EObjectContainmentEList<Extension>(Extension.class, this, FhirPackage.DOMAIN_RESOURCE__EXTENSION);
		}
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getModifierExtension() {
		if (modifierExtension == null) {
			modifierExtension = new EObjectContainmentEList<Extension>(Extension.class, this, FhirPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION);
		}
		return modifierExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DOMAIN_RESOURCE__TEXT:
				return basicSetText(null, msgs);
			case FhirPackage.DOMAIN_RESOURCE__CONTAINED:
				return ((InternalEList<?>)getContained()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOMAIN_RESOURCE__EXTENSION:
				return ((InternalEList<?>)getExtension()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				return ((InternalEList<?>)getModifierExtension()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DOMAIN_RESOURCE__TEXT:
				return getText();
			case FhirPackage.DOMAIN_RESOURCE__CONTAINED:
				return getContained();
			case FhirPackage.DOMAIN_RESOURCE__EXTENSION:
				return getExtension();
			case FhirPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				return getModifierExtension();
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
			case FhirPackage.DOMAIN_RESOURCE__TEXT:
				setText((Narrative)newValue);
				return;
			case FhirPackage.DOMAIN_RESOURCE__CONTAINED:
				getContained().clear();
				getContained().addAll((Collection<? extends ResourceContainer>)newValue);
				return;
			case FhirPackage.DOMAIN_RESOURCE__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends Extension>)newValue);
				return;
			case FhirPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				getModifierExtension().clear();
				getModifierExtension().addAll((Collection<? extends Extension>)newValue);
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
			case FhirPackage.DOMAIN_RESOURCE__TEXT:
				setText((Narrative)null);
				return;
			case FhirPackage.DOMAIN_RESOURCE__CONTAINED:
				getContained().clear();
				return;
			case FhirPackage.DOMAIN_RESOURCE__EXTENSION:
				getExtension().clear();
				return;
			case FhirPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				getModifierExtension().clear();
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
			case FhirPackage.DOMAIN_RESOURCE__TEXT:
				return text != null;
			case FhirPackage.DOMAIN_RESOURCE__CONTAINED:
				return contained != null && !contained.isEmpty();
			case FhirPackage.DOMAIN_RESOURCE__EXTENSION:
				return extension != null && !extension.isEmpty();
			case FhirPackage.DOMAIN_RESOURCE__MODIFIER_EXTENSION:
				return modifierExtension != null && !modifierExtension.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainResourceImpl
