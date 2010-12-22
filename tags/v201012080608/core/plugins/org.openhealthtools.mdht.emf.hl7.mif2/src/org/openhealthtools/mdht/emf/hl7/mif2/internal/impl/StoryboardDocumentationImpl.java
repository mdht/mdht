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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.CascadableAnnotation;
import org.openhealthtools.mdht.emf.hl7.mif2.ContextAnnotation;
import org.openhealthtools.mdht.emf.hl7.mif2.DesignComment;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.OpenIssue;
import org.openhealthtools.mdht.emf.hl7.mif2.OtherAnnotation;
import org.openhealthtools.mdht.emf.hl7.mif2.StoryboardDocumentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storyboard Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardDocumentationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardDocumentationImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardDocumentationImpl#getDesignComments <em>Design Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardDocumentationImpl#getStabilityRemarks <em>Stability Remarks</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardDocumentationImpl#getOpenIssue <em>Open Issue</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardDocumentationImpl#getOtherAnnotation <em>Other Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoryboardDocumentationImpl extends EObjectImpl implements StoryboardDocumentation {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected CascadableAnnotation description;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected CascadableAnnotation rationale;

	/**
	 * The cached value of the '{@link #getDesignComments() <em>Design Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignComments()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignComment> designComments;

	/**
	 * The cached value of the '{@link #getStabilityRemarks() <em>Stability Remarks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStabilityRemarks()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextAnnotation> stabilityRemarks;

	/**
	 * The cached value of the '{@link #getOpenIssue() <em>Open Issue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenIssue()
	 * @generated
	 * @ordered
	 */
	protected EList<OpenIssue> openIssue;

	/**
	 * The cached value of the '{@link #getOtherAnnotation() <em>Other Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherAnnotation> otherAnnotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryboardDocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.STORYBOARD_DOCUMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CascadableAnnotation getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(CascadableAnnotation newDescription, NotificationChain msgs) {
		CascadableAnnotation oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.STORYBOARD_DOCUMENTATION__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(CascadableAnnotation newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STORYBOARD_DOCUMENTATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STORYBOARD_DOCUMENTATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.STORYBOARD_DOCUMENTATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CascadableAnnotation getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRationale(CascadableAnnotation newRationale, NotificationChain msgs) {
		CascadableAnnotation oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.STORYBOARD_DOCUMENTATION__RATIONALE, oldRationale, newRationale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale(CascadableAnnotation newRationale) {
		if (newRationale != rationale) {
			NotificationChain msgs = null;
			if (rationale != null)
				msgs = ((InternalEObject)rationale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STORYBOARD_DOCUMENTATION__RATIONALE, null, msgs);
			if (newRationale != null)
				msgs = ((InternalEObject)newRationale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STORYBOARD_DOCUMENTATION__RATIONALE, null, msgs);
			msgs = basicSetRationale(newRationale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.STORYBOARD_DOCUMENTATION__RATIONALE, newRationale, newRationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignComment> getDesignComments() {
		if (designComments == null) {
			designComments = new EObjectContainmentEList<DesignComment>(DesignComment.class, this, Mif2Package.STORYBOARD_DOCUMENTATION__DESIGN_COMMENTS);
		}
		return designComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextAnnotation> getStabilityRemarks() {
		if (stabilityRemarks == null) {
			stabilityRemarks = new EObjectContainmentEList<ContextAnnotation>(ContextAnnotation.class, this, Mif2Package.STORYBOARD_DOCUMENTATION__STABILITY_REMARKS);
		}
		return stabilityRemarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpenIssue> getOpenIssue() {
		if (openIssue == null) {
			openIssue = new EObjectContainmentEList<OpenIssue>(OpenIssue.class, this, Mif2Package.STORYBOARD_DOCUMENTATION__OPEN_ISSUE);
		}
		return openIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherAnnotation> getOtherAnnotation() {
		if (otherAnnotation == null) {
			otherAnnotation = new EObjectContainmentEList<OtherAnnotation>(OtherAnnotation.class, this, Mif2Package.STORYBOARD_DOCUMENTATION__OTHER_ANNOTATION);
		}
		return otherAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.STORYBOARD_DOCUMENTATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case Mif2Package.STORYBOARD_DOCUMENTATION__RATIONALE:
				return basicSetRationale(null, msgs);
			case Mif2Package.STORYBOARD_DOCUMENTATION__DESIGN_COMMENTS:
				return ((InternalEList<?>)getDesignComments()).basicRemove(otherEnd, msgs);
			case Mif2Package.STORYBOARD_DOCUMENTATION__STABILITY_REMARKS:
				return ((InternalEList<?>)getStabilityRemarks()).basicRemove(otherEnd, msgs);
			case Mif2Package.STORYBOARD_DOCUMENTATION__OPEN_ISSUE:
				return ((InternalEList<?>)getOpenIssue()).basicRemove(otherEnd, msgs);
			case Mif2Package.STORYBOARD_DOCUMENTATION__OTHER_ANNOTATION:
				return ((InternalEList<?>)getOtherAnnotation()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.STORYBOARD_DOCUMENTATION__DESCRIPTION:
				return getDescription();
			case Mif2Package.STORYBOARD_DOCUMENTATION__RATIONALE:
				return getRationale();
			case Mif2Package.STORYBOARD_DOCUMENTATION__DESIGN_COMMENTS:
				return getDesignComments();
			case Mif2Package.STORYBOARD_DOCUMENTATION__STABILITY_REMARKS:
				return getStabilityRemarks();
			case Mif2Package.STORYBOARD_DOCUMENTATION__OPEN_ISSUE:
				return getOpenIssue();
			case Mif2Package.STORYBOARD_DOCUMENTATION__OTHER_ANNOTATION:
				return getOtherAnnotation();
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
			case Mif2Package.STORYBOARD_DOCUMENTATION__DESCRIPTION:
				setDescription((CascadableAnnotation)newValue);
				return;
			case Mif2Package.STORYBOARD_DOCUMENTATION__RATIONALE:
				setRationale((CascadableAnnotation)newValue);
				return;
			case Mif2Package.STORYBOARD_DOCUMENTATION__DESIGN_COMMENTS:
				getDesignComments().clear();
				getDesignComments().addAll((Collection<? extends DesignComment>)newValue);
				return;
			case Mif2Package.STORYBOARD_DOCUMENTATION__STABILITY_REMARKS:
				getStabilityRemarks().clear();
				getStabilityRemarks().addAll((Collection<? extends ContextAnnotation>)newValue);
				return;
			case Mif2Package.STORYBOARD_DOCUMENTATION__OPEN_ISSUE:
				getOpenIssue().clear();
				getOpenIssue().addAll((Collection<? extends OpenIssue>)newValue);
				return;
			case Mif2Package.STORYBOARD_DOCUMENTATION__OTHER_ANNOTATION:
				getOtherAnnotation().clear();
				getOtherAnnotation().addAll((Collection<? extends OtherAnnotation>)newValue);
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
			case Mif2Package.STORYBOARD_DOCUMENTATION__DESCRIPTION:
				setDescription((CascadableAnnotation)null);
				return;
			case Mif2Package.STORYBOARD_DOCUMENTATION__RATIONALE:
				setRationale((CascadableAnnotation)null);
				return;
			case Mif2Package.STORYBOARD_DOCUMENTATION__DESIGN_COMMENTS:
				getDesignComments().clear();
				return;
			case Mif2Package.STORYBOARD_DOCUMENTATION__STABILITY_REMARKS:
				getStabilityRemarks().clear();
				return;
			case Mif2Package.STORYBOARD_DOCUMENTATION__OPEN_ISSUE:
				getOpenIssue().clear();
				return;
			case Mif2Package.STORYBOARD_DOCUMENTATION__OTHER_ANNOTATION:
				getOtherAnnotation().clear();
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
			case Mif2Package.STORYBOARD_DOCUMENTATION__DESCRIPTION:
				return description != null;
			case Mif2Package.STORYBOARD_DOCUMENTATION__RATIONALE:
				return rationale != null;
			case Mif2Package.STORYBOARD_DOCUMENTATION__DESIGN_COMMENTS:
				return designComments != null && !designComments.isEmpty();
			case Mif2Package.STORYBOARD_DOCUMENTATION__STABILITY_REMARKS:
				return stabilityRemarks != null && !stabilityRemarks.isEmpty();
			case Mif2Package.STORYBOARD_DOCUMENTATION__OPEN_ISSUE:
				return openIssue != null && !openIssue.isEmpty();
			case Mif2Package.STORYBOARD_DOCUMENTATION__OTHER_ANNOTATION:
				return otherAnnotation != null && !otherAnnotation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StoryboardDocumentationImpl
