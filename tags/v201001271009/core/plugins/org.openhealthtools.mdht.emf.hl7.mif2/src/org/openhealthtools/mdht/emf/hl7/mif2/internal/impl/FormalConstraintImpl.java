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

import org.openhealthtools.mdht.emf.hl7.mif2.AnnotationDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.BusinessName;
import org.openhealthtools.mdht.emf.hl7.mif2.FormalConstraint;
import org.openhealthtools.mdht.emf.hl7.mif2.FormalExpression;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.VariousMixedContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FormalConstraintImpl#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FormalConstraintImpl#getDerivationSupplier <em>Derivation Supplier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FormalConstraintImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FormalConstraintImpl#getAlternateFormalExpression <em>Alternate Formal Expression</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.FormalConstraintImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormalConstraintImpl extends CascadableAnnotationImpl implements FormalConstraint {
	/**
	 * The cached value of the '{@link #getBusinessName() <em>Business Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessName()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessName> businessName;

	/**
	 * The cached value of the '{@link #getDerivationSupplier() <em>Derivation Supplier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationSupplier()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationDerivation> derivationSupplier;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected VariousMixedContent body;

	/**
	 * The cached value of the '{@link #getAlternateFormalExpression() <em>Alternate Formal Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternateFormalExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<FormalExpression> alternateFormalExpression;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.FORMAL_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessName> getBusinessName() {
		if (businessName == null) {
			businessName = new EObjectContainmentEList<BusinessName>(BusinessName.class, this, Mif2Package.FORMAL_CONSTRAINT__BUSINESS_NAME);
		}
		return businessName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationDerivation> getDerivationSupplier() {
		if (derivationSupplier == null) {
			derivationSupplier = new EObjectContainmentEList<AnnotationDerivation>(AnnotationDerivation.class, this, Mif2Package.FORMAL_CONSTRAINT__DERIVATION_SUPPLIER);
		}
		return derivationSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariousMixedContent getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(VariousMixedContent newBody, NotificationChain msgs) {
		VariousMixedContent oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.FORMAL_CONSTRAINT__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(VariousMixedContent newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.FORMAL_CONSTRAINT__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.FORMAL_CONSTRAINT__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.FORMAL_CONSTRAINT__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormalExpression> getAlternateFormalExpression() {
		if (alternateFormalExpression == null) {
			alternateFormalExpression = new EObjectContainmentEList<FormalExpression>(FormalExpression.class, this, Mif2Package.FORMAL_CONSTRAINT__ALTERNATE_FORMAL_EXPRESSION);
		}
		return alternateFormalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.FORMAL_CONSTRAINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.FORMAL_CONSTRAINT__BUSINESS_NAME:
				return ((InternalEList<?>)getBusinessName()).basicRemove(otherEnd, msgs);
			case Mif2Package.FORMAL_CONSTRAINT__DERIVATION_SUPPLIER:
				return ((InternalEList<?>)getDerivationSupplier()).basicRemove(otherEnd, msgs);
			case Mif2Package.FORMAL_CONSTRAINT__BODY:
				return basicSetBody(null, msgs);
			case Mif2Package.FORMAL_CONSTRAINT__ALTERNATE_FORMAL_EXPRESSION:
				return ((InternalEList<?>)getAlternateFormalExpression()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.FORMAL_CONSTRAINT__BUSINESS_NAME:
				return getBusinessName();
			case Mif2Package.FORMAL_CONSTRAINT__DERIVATION_SUPPLIER:
				return getDerivationSupplier();
			case Mif2Package.FORMAL_CONSTRAINT__BODY:
				return getBody();
			case Mif2Package.FORMAL_CONSTRAINT__ALTERNATE_FORMAL_EXPRESSION:
				return getAlternateFormalExpression();
			case Mif2Package.FORMAL_CONSTRAINT__NAME:
				return getName();
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
			case Mif2Package.FORMAL_CONSTRAINT__BUSINESS_NAME:
				getBusinessName().clear();
				getBusinessName().addAll((Collection<? extends BusinessName>)newValue);
				return;
			case Mif2Package.FORMAL_CONSTRAINT__DERIVATION_SUPPLIER:
				getDerivationSupplier().clear();
				getDerivationSupplier().addAll((Collection<? extends AnnotationDerivation>)newValue);
				return;
			case Mif2Package.FORMAL_CONSTRAINT__BODY:
				setBody((VariousMixedContent)newValue);
				return;
			case Mif2Package.FORMAL_CONSTRAINT__ALTERNATE_FORMAL_EXPRESSION:
				getAlternateFormalExpression().clear();
				getAlternateFormalExpression().addAll((Collection<? extends FormalExpression>)newValue);
				return;
			case Mif2Package.FORMAL_CONSTRAINT__NAME:
				setName((String)newValue);
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
			case Mif2Package.FORMAL_CONSTRAINT__BUSINESS_NAME:
				getBusinessName().clear();
				return;
			case Mif2Package.FORMAL_CONSTRAINT__DERIVATION_SUPPLIER:
				getDerivationSupplier().clear();
				return;
			case Mif2Package.FORMAL_CONSTRAINT__BODY:
				setBody((VariousMixedContent)null);
				return;
			case Mif2Package.FORMAL_CONSTRAINT__ALTERNATE_FORMAL_EXPRESSION:
				getAlternateFormalExpression().clear();
				return;
			case Mif2Package.FORMAL_CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
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
			case Mif2Package.FORMAL_CONSTRAINT__BUSINESS_NAME:
				return businessName != null && !businessName.isEmpty();
			case Mif2Package.FORMAL_CONSTRAINT__DERIVATION_SUPPLIER:
				return derivationSupplier != null && !derivationSupplier.isEmpty();
			case Mif2Package.FORMAL_CONSTRAINT__BODY:
				return body != null;
			case Mif2Package.FORMAL_CONSTRAINT__ALTERNATE_FORMAL_EXPRESSION:
				return alternateFormalExpression != null && !alternateFormalExpression.isEmpty();
			case Mif2Package.FORMAL_CONSTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FormalConstraintImpl
