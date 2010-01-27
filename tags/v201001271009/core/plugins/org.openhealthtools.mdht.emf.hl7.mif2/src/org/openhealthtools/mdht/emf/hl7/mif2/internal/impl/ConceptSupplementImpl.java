/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.CodeSupplement;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptProperty;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationship;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplement;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplementAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PrintName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Supplement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptSupplementImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptSupplementImpl#getSupplementalConceptRelationship <em>Supplemental Concept Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptSupplementImpl#getSupplementalConceptProperty <em>Supplemental Concept Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptSupplementImpl#getPrintName <em>Print Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptSupplementImpl#getCodeSupplement <em>Code Supplement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptSupplementImpl#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptSupplementImpl extends ConceptBaseImpl implements ConceptSupplement {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected ConceptSupplementAnnotations annotations;

	/**
	 * The cached value of the '{@link #getSupplementalConceptRelationship() <em>Supplemental Concept Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalConceptRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptRelationship> supplementalConceptRelationship;

	/**
	 * The cached value of the '{@link #getSupplementalConceptProperty() <em>Supplemental Concept Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalConceptProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptProperty> supplementalConceptProperty;

	/**
	 * The cached value of the '{@link #getPrintName() <em>Print Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintName()
	 * @generated
	 * @ordered
	 */
	protected EList<PrintName> printName;

	/**
	 * The cached value of the '{@link #getCodeSupplement() <em>Code Supplement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSupplement()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSupplement> codeSupplement;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptSupplementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CONCEPT_SUPPLEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptSupplementAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(ConceptSupplementAnnotations newAnnotations, NotificationChain msgs) {
		ConceptSupplementAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CONCEPT_SUPPLEMENT__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(ConceptSupplementAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONCEPT_SUPPLEMENT__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONCEPT_SUPPLEMENT__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONCEPT_SUPPLEMENT__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptRelationship> getSupplementalConceptRelationship() {
		if (supplementalConceptRelationship == null) {
			supplementalConceptRelationship = new EObjectContainmentEList<ConceptRelationship>(ConceptRelationship.class, this, Mif2Package.CONCEPT_SUPPLEMENT__SUPPLEMENTAL_CONCEPT_RELATIONSHIP);
		}
		return supplementalConceptRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptProperty> getSupplementalConceptProperty() {
		if (supplementalConceptProperty == null) {
			supplementalConceptProperty = new EObjectContainmentEList<ConceptProperty>(ConceptProperty.class, this, Mif2Package.CONCEPT_SUPPLEMENT__SUPPLEMENTAL_CONCEPT_PROPERTY);
		}
		return supplementalConceptProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrintName> getPrintName() {
		if (printName == null) {
			printName = new EObjectContainmentEList<PrintName>(PrintName.class, this, Mif2Package.CONCEPT_SUPPLEMENT__PRINT_NAME);
		}
		return printName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSupplement> getCodeSupplement() {
		if (codeSupplement == null) {
			codeSupplement = new EObjectContainmentEList<CodeSupplement>(CodeSupplement.class, this, Mif2Package.CONCEPT_SUPPLEMENT__CODE_SUPPLEMENT);
		}
		return codeSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONCEPT_SUPPLEMENT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CONCEPT_SUPPLEMENT__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.CONCEPT_SUPPLEMENT__SUPPLEMENTAL_CONCEPT_RELATIONSHIP:
				return ((InternalEList<?>)getSupplementalConceptRelationship()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONCEPT_SUPPLEMENT__SUPPLEMENTAL_CONCEPT_PROPERTY:
				return ((InternalEList<?>)getSupplementalConceptProperty()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONCEPT_SUPPLEMENT__PRINT_NAME:
				return ((InternalEList<?>)getPrintName()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONCEPT_SUPPLEMENT__CODE_SUPPLEMENT:
				return ((InternalEList<?>)getCodeSupplement()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.CONCEPT_SUPPLEMENT__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.CONCEPT_SUPPLEMENT__SUPPLEMENTAL_CONCEPT_RELATIONSHIP:
				return getSupplementalConceptRelationship();
			case Mif2Package.CONCEPT_SUPPLEMENT__SUPPLEMENTAL_CONCEPT_PROPERTY:
				return getSupplementalConceptProperty();
			case Mif2Package.CONCEPT_SUPPLEMENT__PRINT_NAME:
				return getPrintName();
			case Mif2Package.CONCEPT_SUPPLEMENT__CODE_SUPPLEMENT:
				return getCodeSupplement();
			case Mif2Package.CONCEPT_SUPPLEMENT__CODE:
				return getCode();
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
			case Mif2Package.CONCEPT_SUPPLEMENT__ANNOTATIONS:
				setAnnotations((ConceptSupplementAnnotations)newValue);
				return;
			case Mif2Package.CONCEPT_SUPPLEMENT__SUPPLEMENTAL_CONCEPT_RELATIONSHIP:
				getSupplementalConceptRelationship().clear();
				getSupplementalConceptRelationship().addAll((Collection<? extends ConceptRelationship>)newValue);
				return;
			case Mif2Package.CONCEPT_SUPPLEMENT__SUPPLEMENTAL_CONCEPT_PROPERTY:
				getSupplementalConceptProperty().clear();
				getSupplementalConceptProperty().addAll((Collection<? extends ConceptProperty>)newValue);
				return;
			case Mif2Package.CONCEPT_SUPPLEMENT__PRINT_NAME:
				getPrintName().clear();
				getPrintName().addAll((Collection<? extends PrintName>)newValue);
				return;
			case Mif2Package.CONCEPT_SUPPLEMENT__CODE_SUPPLEMENT:
				getCodeSupplement().clear();
				getCodeSupplement().addAll((Collection<? extends CodeSupplement>)newValue);
				return;
			case Mif2Package.CONCEPT_SUPPLEMENT__CODE:
				setCode((String)newValue);
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
			case Mif2Package.CONCEPT_SUPPLEMENT__ANNOTATIONS:
				setAnnotations((ConceptSupplementAnnotations)null);
				return;
			case Mif2Package.CONCEPT_SUPPLEMENT__SUPPLEMENTAL_CONCEPT_RELATIONSHIP:
				getSupplementalConceptRelationship().clear();
				return;
			case Mif2Package.CONCEPT_SUPPLEMENT__SUPPLEMENTAL_CONCEPT_PROPERTY:
				getSupplementalConceptProperty().clear();
				return;
			case Mif2Package.CONCEPT_SUPPLEMENT__PRINT_NAME:
				getPrintName().clear();
				return;
			case Mif2Package.CONCEPT_SUPPLEMENT__CODE_SUPPLEMENT:
				getCodeSupplement().clear();
				return;
			case Mif2Package.CONCEPT_SUPPLEMENT__CODE:
				setCode(CODE_EDEFAULT);
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
			case Mif2Package.CONCEPT_SUPPLEMENT__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.CONCEPT_SUPPLEMENT__SUPPLEMENTAL_CONCEPT_RELATIONSHIP:
				return supplementalConceptRelationship != null && !supplementalConceptRelationship.isEmpty();
			case Mif2Package.CONCEPT_SUPPLEMENT__SUPPLEMENTAL_CONCEPT_PROPERTY:
				return supplementalConceptProperty != null && !supplementalConceptProperty.isEmpty();
			case Mif2Package.CONCEPT_SUPPLEMENT__PRINT_NAME:
				return printName != null && !printName.isEmpty();
			case Mif2Package.CONCEPT_SUPPLEMENT__CODE_SUPPLEMENT:
				return codeSupplement != null && !codeSupplement.isEmpty();
			case Mif2Package.CONCEPT_SUPPLEMENT__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //ConceptSupplementImpl
