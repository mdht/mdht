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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.CascadableAnnotation;
import org.openhealthtools.mdht.emf.hl7.mif2.ContextAnnotation;
import org.openhealthtools.mdht.emf.hl7.mif2.DesignComment;
import org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExampleDocumentation;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.OpenIssue;
import org.openhealthtools.mdht.emf.hl7.mif2.OtherAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Instance Example Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DomainInstanceExampleDocumentationImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DomainInstanceExampleDocumentationImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DomainInstanceExampleDocumentationImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DomainInstanceExampleDocumentationImpl#getDesignComments <em>Design Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DomainInstanceExampleDocumentationImpl#getStabilityRemarks <em>Stability Remarks</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DomainInstanceExampleDocumentationImpl#getWalkthrough <em>Walkthrough</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DomainInstanceExampleDocumentationImpl#getOpenIssue <em>Open Issue</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DomainInstanceExampleDocumentationImpl#getOtherAnnotation <em>Other Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainInstanceExampleDocumentationImpl extends EObjectImpl implements DomainInstanceExampleDocumentation {
	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected CascadableAnnotation definition;

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
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected ContextAnnotation requirements;

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
	 * The cached value of the '{@link #getWalkthrough() <em>Walkthrough</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWalkthrough()
	 * @generated
	 * @ordered
	 */
	protected ContextAnnotation walkthrough;

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
	protected DomainInstanceExampleDocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CascadableAnnotation getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(CascadableAnnotation newDefinition, NotificationChain msgs) {
		CascadableAnnotation oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__DEFINITION, oldDefinition,
				newDefinition);
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
	public void setDefinition(CascadableAnnotation newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null) {
				msgs = ((InternalEObject) definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__DEFINITION, null, msgs);
			}
			if (newDefinition != null) {
				msgs = ((InternalEObject) newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__DEFINITION, null, msgs);
			}
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__DEFINITION, newDefinition,
				newDefinition));
		}
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
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__RATIONALE, oldRationale,
				newRationale);
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
	public void setRationale(CascadableAnnotation newRationale) {
		if (newRationale != rationale) {
			NotificationChain msgs = null;
			if (rationale != null) {
				msgs = ((InternalEObject) rationale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__RATIONALE, null, msgs);
			}
			if (newRationale != null) {
				msgs = ((InternalEObject) newRationale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__RATIONALE, null, msgs);
			}
			msgs = basicSetRationale(newRationale, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__RATIONALE, newRationale,
				newRationale));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAnnotation getRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(ContextAnnotation newRequirements, NotificationChain msgs) {
		ContextAnnotation oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__REQUIREMENTS,
				oldRequirements, newRequirements);
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
	public void setRequirements(ContextAnnotation newRequirements) {
		if (newRequirements != requirements) {
			NotificationChain msgs = null;
			if (requirements != null) {
				msgs = ((InternalEObject) requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__REQUIREMENTS, null, msgs);
			}
			if (newRequirements != null) {
				msgs = ((InternalEObject) newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__REQUIREMENTS, null, msgs);
			}
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__REQUIREMENTS,
				newRequirements, newRequirements));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignComment> getDesignComments() {
		if (designComments == null) {
			designComments = new EObjectContainmentEList<DesignComment>(
				DesignComment.class, this, Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__DESIGN_COMMENTS);
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
			stabilityRemarks = new EObjectContainmentEList<ContextAnnotation>(
				ContextAnnotation.class, this, Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__STABILITY_REMARKS);
		}
		return stabilityRemarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAnnotation getWalkthrough() {
		return walkthrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWalkthrough(ContextAnnotation newWalkthrough, NotificationChain msgs) {
		ContextAnnotation oldWalkthrough = walkthrough;
		walkthrough = newWalkthrough;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__WALKTHROUGH, oldWalkthrough,
				newWalkthrough);
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
	public void setWalkthrough(ContextAnnotation newWalkthrough) {
		if (newWalkthrough != walkthrough) {
			NotificationChain msgs = null;
			if (walkthrough != null) {
				msgs = ((InternalEObject) walkthrough).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__WALKTHROUGH, null, msgs);
			}
			if (newWalkthrough != null) {
				msgs = ((InternalEObject) newWalkthrough).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__WALKTHROUGH, null, msgs);
			}
			msgs = basicSetWalkthrough(newWalkthrough, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__WALKTHROUGH, newWalkthrough,
				newWalkthrough));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpenIssue> getOpenIssue() {
		if (openIssue == null) {
			openIssue = new EObjectContainmentEList<OpenIssue>(
				OpenIssue.class, this, Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__OPEN_ISSUE);
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
			otherAnnotation = new EObjectContainmentEList<OtherAnnotation>(
				OtherAnnotation.class, this, Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__OTHER_ANNOTATION);
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
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__DEFINITION:
				return basicSetDefinition(null, msgs);
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__RATIONALE:
				return basicSetRationale(null, msgs);
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__DESIGN_COMMENTS:
				return ((InternalEList<?>) getDesignComments()).basicRemove(otherEnd, msgs);
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__STABILITY_REMARKS:
				return ((InternalEList<?>) getStabilityRemarks()).basicRemove(otherEnd, msgs);
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__WALKTHROUGH:
				return basicSetWalkthrough(null, msgs);
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__OPEN_ISSUE:
				return ((InternalEList<?>) getOpenIssue()).basicRemove(otherEnd, msgs);
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__OTHER_ANNOTATION:
				return ((InternalEList<?>) getOtherAnnotation()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__DEFINITION:
				return getDefinition();
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__RATIONALE:
				return getRationale();
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__REQUIREMENTS:
				return getRequirements();
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__DESIGN_COMMENTS:
				return getDesignComments();
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__STABILITY_REMARKS:
				return getStabilityRemarks();
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__WALKTHROUGH:
				return getWalkthrough();
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__OPEN_ISSUE:
				return getOpenIssue();
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__OTHER_ANNOTATION:
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
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__DEFINITION:
				setDefinition((CascadableAnnotation) newValue);
				return;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__RATIONALE:
				setRationale((CascadableAnnotation) newValue);
				return;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__REQUIREMENTS:
				setRequirements((ContextAnnotation) newValue);
				return;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__DESIGN_COMMENTS:
				getDesignComments().clear();
				getDesignComments().addAll((Collection<? extends DesignComment>) newValue);
				return;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__STABILITY_REMARKS:
				getStabilityRemarks().clear();
				getStabilityRemarks().addAll((Collection<? extends ContextAnnotation>) newValue);
				return;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__WALKTHROUGH:
				setWalkthrough((ContextAnnotation) newValue);
				return;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__OPEN_ISSUE:
				getOpenIssue().clear();
				getOpenIssue().addAll((Collection<? extends OpenIssue>) newValue);
				return;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__OTHER_ANNOTATION:
				getOtherAnnotation().clear();
				getOtherAnnotation().addAll((Collection<? extends OtherAnnotation>) newValue);
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
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__DEFINITION:
				setDefinition((CascadableAnnotation) null);
				return;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__RATIONALE:
				setRationale((CascadableAnnotation) null);
				return;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__REQUIREMENTS:
				setRequirements((ContextAnnotation) null);
				return;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__DESIGN_COMMENTS:
				getDesignComments().clear();
				return;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__STABILITY_REMARKS:
				getStabilityRemarks().clear();
				return;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__WALKTHROUGH:
				setWalkthrough((ContextAnnotation) null);
				return;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__OPEN_ISSUE:
				getOpenIssue().clear();
				return;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__OTHER_ANNOTATION:
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
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__DEFINITION:
				return definition != null;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__RATIONALE:
				return rationale != null;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__REQUIREMENTS:
				return requirements != null;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__DESIGN_COMMENTS:
				return designComments != null && !designComments.isEmpty();
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__STABILITY_REMARKS:
				return stabilityRemarks != null && !stabilityRemarks.isEmpty();
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__WALKTHROUGH:
				return walkthrough != null;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__OPEN_ISSUE:
				return openIssue != null && !openIssue.isEmpty();
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION__OTHER_ANNOTATION:
				return otherAnnotation != null && !otherAnnotation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // DomainInstanceExampleDocumentationImpl
