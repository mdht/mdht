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
import org.hl7.fhir.ConceptMapDependsOn;
import org.hl7.fhir.ConceptMapEquivalence;
import org.hl7.fhir.ConceptMapMap;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Map Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapMapImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapMapImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapMapImpl#getEquivalence <em>Equivalence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapMapImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapMapImpl#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptMapMapImpl extends BackboneElementImpl implements ConceptMapMap {
	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected Uri codeSystem;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getEquivalence() <em>Equivalence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalence()
	 * @generated
	 * @ordered
	 */
	protected ConceptMapEquivalence equivalence;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comments;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMapDependsOn> product;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMapMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConceptMapMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getCodeSystem() {
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeSystem(Uri newCodeSystem, NotificationChain msgs) {
		Uri oldCodeSystem = codeSystem;
		codeSystem = newCodeSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_MAP__CODE_SYSTEM, oldCodeSystem, newCodeSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystem(Uri newCodeSystem) {
		if (newCodeSystem != codeSystem) {
			NotificationChain msgs = null;
			if (codeSystem != null)
				msgs = ((InternalEObject)codeSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_MAP__CODE_SYSTEM, null, msgs);
			if (newCodeSystem != null)
				msgs = ((InternalEObject)newCodeSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_MAP__CODE_SYSTEM, null, msgs);
			msgs = basicSetCodeSystem(newCodeSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_MAP__CODE_SYSTEM, newCodeSystem, newCodeSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_MAP__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_MAP__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_MAP__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_MAP__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapEquivalence getEquivalence() {
		return equivalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquivalence(ConceptMapEquivalence newEquivalence, NotificationChain msgs) {
		ConceptMapEquivalence oldEquivalence = equivalence;
		equivalence = newEquivalence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_MAP__EQUIVALENCE, oldEquivalence, newEquivalence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquivalence(ConceptMapEquivalence newEquivalence) {
		if (newEquivalence != equivalence) {
			NotificationChain msgs = null;
			if (equivalence != null)
				msgs = ((InternalEObject)equivalence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_MAP__EQUIVALENCE, null, msgs);
			if (newEquivalence != null)
				msgs = ((InternalEObject)newEquivalence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_MAP__EQUIVALENCE, null, msgs);
			msgs = basicSetEquivalence(newEquivalence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_MAP__EQUIVALENCE, newEquivalence, newEquivalence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComments(org.hl7.fhir.String newComments, NotificationChain msgs) {
		org.hl7.fhir.String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_MAP__COMMENTS, oldComments, newComments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(org.hl7.fhir.String newComments) {
		if (newComments != comments) {
			NotificationChain msgs = null;
			if (comments != null)
				msgs = ((InternalEObject)comments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_MAP__COMMENTS, null, msgs);
			if (newComments != null)
				msgs = ((InternalEObject)newComments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_MAP__COMMENTS, null, msgs);
			msgs = basicSetComments(newComments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_MAP__COMMENTS, newComments, newComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptMapDependsOn> getProduct() {
		if (product == null) {
			product = new EObjectContainmentEList<ConceptMapDependsOn>(ConceptMapDependsOn.class, this, FhirPackage.CONCEPT_MAP_MAP__PRODUCT);
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONCEPT_MAP_MAP__CODE_SYSTEM:
				return basicSetCodeSystem(null, msgs);
			case FhirPackage.CONCEPT_MAP_MAP__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.CONCEPT_MAP_MAP__EQUIVALENCE:
				return basicSetEquivalence(null, msgs);
			case FhirPackage.CONCEPT_MAP_MAP__COMMENTS:
				return basicSetComments(null, msgs);
			case FhirPackage.CONCEPT_MAP_MAP__PRODUCT:
				return ((InternalEList<?>)getProduct()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONCEPT_MAP_MAP__CODE_SYSTEM:
				return getCodeSystem();
			case FhirPackage.CONCEPT_MAP_MAP__CODE:
				return getCode();
			case FhirPackage.CONCEPT_MAP_MAP__EQUIVALENCE:
				return getEquivalence();
			case FhirPackage.CONCEPT_MAP_MAP__COMMENTS:
				return getComments();
			case FhirPackage.CONCEPT_MAP_MAP__PRODUCT:
				return getProduct();
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
			case FhirPackage.CONCEPT_MAP_MAP__CODE_SYSTEM:
				setCodeSystem((Uri)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_MAP__CODE:
				setCode((Code)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_MAP__EQUIVALENCE:
				setEquivalence((ConceptMapEquivalence)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_MAP__COMMENTS:
				setComments((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_MAP__PRODUCT:
				getProduct().clear();
				getProduct().addAll((Collection<? extends ConceptMapDependsOn>)newValue);
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
			case FhirPackage.CONCEPT_MAP_MAP__CODE_SYSTEM:
				setCodeSystem((Uri)null);
				return;
			case FhirPackage.CONCEPT_MAP_MAP__CODE:
				setCode((Code)null);
				return;
			case FhirPackage.CONCEPT_MAP_MAP__EQUIVALENCE:
				setEquivalence((ConceptMapEquivalence)null);
				return;
			case FhirPackage.CONCEPT_MAP_MAP__COMMENTS:
				setComments((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONCEPT_MAP_MAP__PRODUCT:
				getProduct().clear();
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
			case FhirPackage.CONCEPT_MAP_MAP__CODE_SYSTEM:
				return codeSystem != null;
			case FhirPackage.CONCEPT_MAP_MAP__CODE:
				return code != null;
			case FhirPackage.CONCEPT_MAP_MAP__EQUIVALENCE:
				return equivalence != null;
			case FhirPackage.CONCEPT_MAP_MAP__COMMENTS:
				return comments != null;
			case FhirPackage.CONCEPT_MAP_MAP__PRODUCT:
				return product != null && !product.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptMapMapImpl
