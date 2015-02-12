/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo;
import org.openhealthtools.mdht.emf.hl7.mif2.Contributor;
import org.openhealthtools.mdht.emf.hl7.mif2.Header;
import org.openhealthtools.mdht.emf.hl7.mif2.Legalese;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.RealmElement;
import org.openhealthtools.mdht.emf.hl7.mif2.RenderingInformation;
import org.openhealthtools.mdht.emf.hl7.mif2.ResponsibleGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.HeaderImpl#getRenderingInformation <em>Rendering Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.HeaderImpl#getLegalese <em>Legalese</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.HeaderImpl#getResponsibleGroup <em>Responsible Group</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.HeaderImpl#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.HeaderImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.HeaderImpl#getApprovalInfo <em>Approval Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.HeaderImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.HeaderImpl#getRealmNamespace <em>Realm Namespace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.HeaderImpl#getPrimaryRepository <em>Primary Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeaderImpl extends EObjectImpl implements Header {
	/**
	 * The cached value of the '{@link #getRenderingInformation() <em>Rendering Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderingInformation()
	 * @generated
	 * @ordered
	 */
	protected RenderingInformation renderingInformation;

	/**
	 * The cached value of the '{@link #getLegalese() <em>Legalese</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalese()
	 * @generated
	 * @ordered
	 */
	protected Legalese legalese;

	/**
	 * The cached value of the '{@link #getResponsibleGroup() <em>Responsible Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponsibleGroup> responsibleGroup;

	/**
	 * The cached value of the '{@link #getContributor() <em>Contributor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributor()
	 * @generated
	 * @ordered
	 */
	protected EList<Contributor> contributor;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<String> subject;

	/**
	 * The cached value of the '{@link #getApprovalInfo() <em>Approval Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalInfo()
	 * @generated
	 * @ordered
	 */
	protected ApprovalInfo approvalInfo;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap context;

	/**
	 * The default value of the '{@link #getPrimaryRepository() <em>Primary Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryRepository()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_REPOSITORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryRepository() <em>Primary Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryRepository()
	 * @generated
	 * @ordered
	 */
	protected String primaryRepository = PRIMARY_REPOSITORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderingInformation getRenderingInformation() {
		return renderingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRenderingInformation(RenderingInformation newRenderingInformation,
			NotificationChain msgs) {
		RenderingInformation oldRenderingInformation = renderingInformation;
		renderingInformation = newRenderingInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.HEADER__RENDERING_INFORMATION, oldRenderingInformation,
				newRenderingInformation);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenderingInformation(RenderingInformation newRenderingInformation) {
		if (newRenderingInformation != renderingInformation) {
			NotificationChain msgs = null;
			if (renderingInformation != null) {
				msgs = ((InternalEObject) renderingInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.HEADER__RENDERING_INFORMATION, null, msgs);
			}
			if (newRenderingInformation != null) {
				msgs = ((InternalEObject) newRenderingInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.HEADER__RENDERING_INFORMATION, null, msgs);
			}
			msgs = basicSetRenderingInformation(newRenderingInformation, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.HEADER__RENDERING_INFORMATION, newRenderingInformation,
				newRenderingInformation));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Legalese getLegalese() {
		return legalese;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegalese(Legalese newLegalese, NotificationChain msgs) {
		Legalese oldLegalese = legalese;
		legalese = newLegalese;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.HEADER__LEGALESE, oldLegalese, newLegalese);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegalese(Legalese newLegalese) {
		if (newLegalese != legalese) {
			NotificationChain msgs = null;
			if (legalese != null) {
				msgs = ((InternalEObject) legalese).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.HEADER__LEGALESE, null, msgs);
			}
			if (newLegalese != null) {
				msgs = ((InternalEObject) newLegalese).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.HEADER__LEGALESE, null, msgs);
			}
			msgs = basicSetLegalese(newLegalese, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.HEADER__LEGALESE, newLegalese, newLegalese));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResponsibleGroup> getResponsibleGroup() {
		if (responsibleGroup == null) {
			responsibleGroup = new EObjectContainmentEList<ResponsibleGroup>(
				ResponsibleGroup.class, this, Mif2Package.HEADER__RESPONSIBLE_GROUP);
		}
		return responsibleGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contributor> getContributor() {
		if (contributor == null) {
			contributor = new EObjectContainmentEList<Contributor>(
				Contributor.class, this, Mif2Package.HEADER__CONTRIBUTOR);
		}
		return contributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSubject() {
		if (subject == null) {
			subject = new EDataTypeEList<String>(String.class, this, Mif2Package.HEADER__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovalInfo getApprovalInfo() {
		return approvalInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApprovalInfo(ApprovalInfo newApprovalInfo, NotificationChain msgs) {
		ApprovalInfo oldApprovalInfo = approvalInfo;
		approvalInfo = newApprovalInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.HEADER__APPROVAL_INFO, oldApprovalInfo, newApprovalInfo);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalInfo(ApprovalInfo newApprovalInfo) {
		if (newApprovalInfo != approvalInfo) {
			NotificationChain msgs = null;
			if (approvalInfo != null) {
				msgs = ((InternalEObject) approvalInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.HEADER__APPROVAL_INFO, null, msgs);
			}
			if (newApprovalInfo != null) {
				msgs = ((InternalEObject) newApprovalInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.HEADER__APPROVAL_INFO, null, msgs);
			}
			msgs = basicSetApprovalInfo(newApprovalInfo, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.HEADER__APPROVAL_INFO, newApprovalInfo, newApprovalInfo));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getContext() {
		if (context == null) {
			context = new BasicFeatureMap(this, Mif2Package.HEADER__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealmElement> getRealmNamespace() {
		return getContext().list(Mif2Package.Literals.HEADER__REALM_NAMESPACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimaryRepository() {
		return primaryRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryRepository(String newPrimaryRepository) {
		String oldPrimaryRepository = primaryRepository;
		primaryRepository = newPrimaryRepository;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.HEADER__PRIMARY_REPOSITORY, oldPrimaryRepository, primaryRepository));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.HEADER__RENDERING_INFORMATION:
				return basicSetRenderingInformation(null, msgs);
			case Mif2Package.HEADER__LEGALESE:
				return basicSetLegalese(null, msgs);
			case Mif2Package.HEADER__RESPONSIBLE_GROUP:
				return ((InternalEList<?>) getResponsibleGroup()).basicRemove(otherEnd, msgs);
			case Mif2Package.HEADER__CONTRIBUTOR:
				return ((InternalEList<?>) getContributor()).basicRemove(otherEnd, msgs);
			case Mif2Package.HEADER__APPROVAL_INFO:
				return basicSetApprovalInfo(null, msgs);
			case Mif2Package.HEADER__CONTEXT:
				return ((InternalEList<?>) getContext()).basicRemove(otherEnd, msgs);
			case Mif2Package.HEADER__REALM_NAMESPACE:
				return ((InternalEList<?>) getRealmNamespace()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.HEADER__RENDERING_INFORMATION:
				return getRenderingInformation();
			case Mif2Package.HEADER__LEGALESE:
				return getLegalese();
			case Mif2Package.HEADER__RESPONSIBLE_GROUP:
				return getResponsibleGroup();
			case Mif2Package.HEADER__CONTRIBUTOR:
				return getContributor();
			case Mif2Package.HEADER__SUBJECT:
				return getSubject();
			case Mif2Package.HEADER__APPROVAL_INFO:
				return getApprovalInfo();
			case Mif2Package.HEADER__CONTEXT:
				if (coreType) {
					return getContext();
				}
				return ((FeatureMap.Internal) getContext()).getWrapper();
			case Mif2Package.HEADER__REALM_NAMESPACE:
				return getRealmNamespace();
			case Mif2Package.HEADER__PRIMARY_REPOSITORY:
				return getPrimaryRepository();
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
			case Mif2Package.HEADER__RENDERING_INFORMATION:
				setRenderingInformation((RenderingInformation) newValue);
				return;
			case Mif2Package.HEADER__LEGALESE:
				setLegalese((Legalese) newValue);
				return;
			case Mif2Package.HEADER__RESPONSIBLE_GROUP:
				getResponsibleGroup().clear();
				getResponsibleGroup().addAll((Collection<? extends ResponsibleGroup>) newValue);
				return;
			case Mif2Package.HEADER__CONTRIBUTOR:
				getContributor().clear();
				getContributor().addAll((Collection<? extends Contributor>) newValue);
				return;
			case Mif2Package.HEADER__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends String>) newValue);
				return;
			case Mif2Package.HEADER__APPROVAL_INFO:
				setApprovalInfo((ApprovalInfo) newValue);
				return;
			case Mif2Package.HEADER__CONTEXT:
				((FeatureMap.Internal) getContext()).set(newValue);
				return;
			case Mif2Package.HEADER__REALM_NAMESPACE:
				getRealmNamespace().clear();
				getRealmNamespace().addAll((Collection<? extends RealmElement>) newValue);
				return;
			case Mif2Package.HEADER__PRIMARY_REPOSITORY:
				setPrimaryRepository((String) newValue);
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
			case Mif2Package.HEADER__RENDERING_INFORMATION:
				setRenderingInformation((RenderingInformation) null);
				return;
			case Mif2Package.HEADER__LEGALESE:
				setLegalese((Legalese) null);
				return;
			case Mif2Package.HEADER__RESPONSIBLE_GROUP:
				getResponsibleGroup().clear();
				return;
			case Mif2Package.HEADER__CONTRIBUTOR:
				getContributor().clear();
				return;
			case Mif2Package.HEADER__SUBJECT:
				getSubject().clear();
				return;
			case Mif2Package.HEADER__APPROVAL_INFO:
				setApprovalInfo((ApprovalInfo) null);
				return;
			case Mif2Package.HEADER__CONTEXT:
				getContext().clear();
				return;
			case Mif2Package.HEADER__REALM_NAMESPACE:
				getRealmNamespace().clear();
				return;
			case Mif2Package.HEADER__PRIMARY_REPOSITORY:
				setPrimaryRepository(PRIMARY_REPOSITORY_EDEFAULT);
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
			case Mif2Package.HEADER__RENDERING_INFORMATION:
				return renderingInformation != null;
			case Mif2Package.HEADER__LEGALESE:
				return legalese != null;
			case Mif2Package.HEADER__RESPONSIBLE_GROUP:
				return responsibleGroup != null && !responsibleGroup.isEmpty();
			case Mif2Package.HEADER__CONTRIBUTOR:
				return contributor != null && !contributor.isEmpty();
			case Mif2Package.HEADER__SUBJECT:
				return subject != null && !subject.isEmpty();
			case Mif2Package.HEADER__APPROVAL_INFO:
				return approvalInfo != null;
			case Mif2Package.HEADER__CONTEXT:
				return context != null && !context.isEmpty();
			case Mif2Package.HEADER__REALM_NAMESPACE:
				return !getRealmNamespace().isEmpty();
			case Mif2Package.HEADER__PRIMARY_REPOSITORY:
				return PRIMARY_REPOSITORY_EDEFAULT == null
						? primaryRepository != null
						: !PRIMARY_REPOSITORY_EDEFAULT.equals(primaryRepository);
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
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (subject: ");
		result.append(subject);
		result.append(", context: ");
		result.append(context);
		result.append(", primaryRepository: ");
		result.append(primaryRepository);
		result.append(')');
		return result.toString();
	}

} // HeaderImpl
