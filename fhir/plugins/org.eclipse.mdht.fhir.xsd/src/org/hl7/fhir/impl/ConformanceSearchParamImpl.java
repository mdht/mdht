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

import org.hl7.fhir.Code;
import org.hl7.fhir.ConformanceSearchParam;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.SearchParamType;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformance Search Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConformanceSearchParamImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceSearchParamImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceSearchParamImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceSearchParamImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceSearchParamImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceSearchParamImpl#getChain <em>Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformanceSearchParamImpl extends BackboneElementImpl implements ConformanceSearchParam {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Uri definition;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SearchParamType type;

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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> target;

	/**
	 * The cached value of the '{@link #getChain() <em>Chain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChain()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> chain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceSearchParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConformanceSearchParam();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_SEARCH_PARAM__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_SEARCH_PARAM__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_SEARCH_PARAM__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_SEARCH_PARAM__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(Uri newDefinition, NotificationChain msgs) {
		Uri oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_SEARCH_PARAM__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Uri newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_SEARCH_PARAM__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_SEARCH_PARAM__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_SEARCH_PARAM__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParamType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(SearchParamType newType, NotificationChain msgs) {
		SearchParamType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_SEARCH_PARAM__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SearchParamType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_SEARCH_PARAM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_SEARCH_PARAM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_SEARCH_PARAM__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_SEARCH_PARAM__DOCUMENTATION, oldDocumentation, newDocumentation);
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
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_SEARCH_PARAM__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_SEARCH_PARAM__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_SEARCH_PARAM__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<Code>(Code.class, this, FhirPackage.CONFORMANCE_SEARCH_PARAM__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getChain() {
		if (chain == null) {
			chain = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.CONFORMANCE_SEARCH_PARAM__CHAIN);
		}
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__DEFINITION:
				return basicSetDefinition(null, msgs);
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__CHAIN:
				return ((InternalEList<?>)getChain()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__NAME:
				return getName();
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__DEFINITION:
				return getDefinition();
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__TYPE:
				return getType();
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__DOCUMENTATION:
				return getDocumentation();
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__TARGET:
				return getTarget();
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__CHAIN:
				return getChain();
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
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__DEFINITION:
				setDefinition((Uri)newValue);
				return;
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__TYPE:
				setType((SearchParamType)newValue);
				return;
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__DOCUMENTATION:
				setDocumentation((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Code>)newValue);
				return;
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__CHAIN:
				getChain().clear();
				getChain().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
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
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__DEFINITION:
				setDefinition((Uri)null);
				return;
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__TYPE:
				setType((SearchParamType)null);
				return;
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__DOCUMENTATION:
				setDocumentation((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__TARGET:
				getTarget().clear();
				return;
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__CHAIN:
				getChain().clear();
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
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__NAME:
				return name != null;
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__DEFINITION:
				return definition != null;
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__TYPE:
				return type != null;
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__DOCUMENTATION:
				return documentation != null;
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__TARGET:
				return target != null && !target.isEmpty();
			case FhirPackage.CONFORMANCE_SEARCH_PARAM__CHAIN:
				return chain != null && !chain.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConformanceSearchParamImpl
