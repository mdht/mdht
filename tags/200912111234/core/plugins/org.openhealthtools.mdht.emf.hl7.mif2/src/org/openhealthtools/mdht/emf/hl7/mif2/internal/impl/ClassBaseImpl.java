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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.AppliedTemplateGroup;
import org.openhealthtools.mdht.emf.hl7.mif2.Attribute;
import org.openhealthtools.mdht.emf.hl7.mif2.ClassAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.ClassBase;
import org.openhealthtools.mdht.emf.hl7.mif2.CommitteeReference;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.StateMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassBaseImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassBaseImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassBaseImpl#getStewardCommittee <em>Steward Committee</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassBaseImpl#getInterestedCommittee <em>Interested Committee</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassBaseImpl#getRequiredTemplateGroup <em>Required Template Group</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassBaseImpl#getSupportedTemplate <em>Supported Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassBaseImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassBaseImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassBaseImpl#isIsComplete <em>Is Complete</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassBaseImpl#isNameLocked <em>Name Locked</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassBaseImpl extends ClassifierBaseImpl implements ClassBase {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected ClassAnnotations annotations;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected StateMachine behavior;

	/**
	 * The cached value of the '{@link #getStewardCommittee() <em>Steward Committee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStewardCommittee()
	 * @generated
	 * @ordered
	 */
	protected EList<CommitteeReference> stewardCommittee;

	/**
	 * The cached value of the '{@link #getInterestedCommittee() <em>Interested Committee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterestedCommittee()
	 * @generated
	 * @ordered
	 */
	protected EList<CommitteeReference> interestedCommittee;

	/**
	 * The cached value of the '{@link #getRequiredTemplateGroup() <em>Required Template Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredTemplateGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<AppliedTemplateGroup> requiredTemplateGroup;

	/**
	 * The cached value of the '{@link #getSupportedTemplate() <em>Supported Template</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supportedTemplate;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * This is true if the Is Abstract attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstractESet;

	/**
	 * The default value of the '{@link #isIsComplete() <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPLETE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsComplete() <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean isComplete = IS_COMPLETE_EDEFAULT;

	/**
	 * This is true if the Is Complete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isCompleteESet;

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
	 * The default value of the '{@link #isNameLocked() <em>Name Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNameLocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NAME_LOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNameLocked() <em>Name Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNameLocked()
	 * @generated
	 * @ordered
	 */
	protected boolean nameLocked = NAME_LOCKED_EDEFAULT;

	/**
	 * This is true if the Name Locked attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameLockedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CLASS_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(ClassAnnotations newAnnotations, NotificationChain msgs) {
		ClassAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CLASS_BASE__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(ClassAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CLASS_BASE__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CLASS_BASE__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CLASS_BASE__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehavior(StateMachine newBehavior, NotificationChain msgs) {
		StateMachine oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CLASS_BASE__BEHAVIOR, oldBehavior, newBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(StateMachine newBehavior) {
		if (newBehavior != behavior) {
			NotificationChain msgs = null;
			if (behavior != null)
				msgs = ((InternalEObject)behavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CLASS_BASE__BEHAVIOR, null, msgs);
			if (newBehavior != null)
				msgs = ((InternalEObject)newBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CLASS_BASE__BEHAVIOR, null, msgs);
			msgs = basicSetBehavior(newBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CLASS_BASE__BEHAVIOR, newBehavior, newBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommitteeReference> getStewardCommittee() {
		if (stewardCommittee == null) {
			stewardCommittee = new EObjectContainmentEList<CommitteeReference>(CommitteeReference.class, this, Mif2Package.CLASS_BASE__STEWARD_COMMITTEE);
		}
		return stewardCommittee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommitteeReference> getInterestedCommittee() {
		if (interestedCommittee == null) {
			interestedCommittee = new EObjectContainmentEList<CommitteeReference>(CommitteeReference.class, this, Mif2Package.CLASS_BASE__INTERESTED_COMMITTEE);
		}
		return interestedCommittee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AppliedTemplateGroup> getRequiredTemplateGroup() {
		if (requiredTemplateGroup == null) {
			requiredTemplateGroup = new EObjectContainmentEList<AppliedTemplateGroup>(AppliedTemplateGroup.class, this, Mif2Package.CLASS_BASE__REQUIRED_TEMPLATE_GROUP);
		}
		return requiredTemplateGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSupportedTemplate() {
		if (supportedTemplate == null) {
			supportedTemplate = new EDataTypeEList<String>(String.class, this, Mif2Package.CLASS_BASE__SUPPORTED_TEMPLATE);
		}
		return supportedTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, Mif2Package.CLASS_BASE__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		boolean oldIsAbstractESet = isAbstractESet;
		isAbstractESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CLASS_BASE__IS_ABSTRACT, oldIsAbstract, isAbstract, !oldIsAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsAbstract() {
		boolean oldIsAbstract = isAbstract;
		boolean oldIsAbstractESet = isAbstractESet;
		isAbstract = IS_ABSTRACT_EDEFAULT;
		isAbstractESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.CLASS_BASE__IS_ABSTRACT, oldIsAbstract, IS_ABSTRACT_EDEFAULT, oldIsAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsAbstract() {
		return isAbstractESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComplete() {
		return isComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComplete(boolean newIsComplete) {
		boolean oldIsComplete = isComplete;
		isComplete = newIsComplete;
		boolean oldIsCompleteESet = isCompleteESet;
		isCompleteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CLASS_BASE__IS_COMPLETE, oldIsComplete, isComplete, !oldIsCompleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsComplete() {
		boolean oldIsComplete = isComplete;
		boolean oldIsCompleteESet = isCompleteESet;
		isComplete = IS_COMPLETE_EDEFAULT;
		isCompleteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.CLASS_BASE__IS_COMPLETE, oldIsComplete, IS_COMPLETE_EDEFAULT, oldIsCompleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsComplete() {
		return isCompleteESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CLASS_BASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNameLocked() {
		return nameLocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameLocked(boolean newNameLocked) {
		boolean oldNameLocked = nameLocked;
		nameLocked = newNameLocked;
		boolean oldNameLockedESet = nameLockedESet;
		nameLockedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CLASS_BASE__NAME_LOCKED, oldNameLocked, nameLocked, !oldNameLockedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNameLocked() {
		boolean oldNameLocked = nameLocked;
		boolean oldNameLockedESet = nameLockedESet;
		nameLocked = NAME_LOCKED_EDEFAULT;
		nameLockedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.CLASS_BASE__NAME_LOCKED, oldNameLocked, NAME_LOCKED_EDEFAULT, oldNameLockedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNameLocked() {
		return nameLockedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CLASS_BASE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.CLASS_BASE__BEHAVIOR:
				return basicSetBehavior(null, msgs);
			case Mif2Package.CLASS_BASE__STEWARD_COMMITTEE:
				return ((InternalEList<?>)getStewardCommittee()).basicRemove(otherEnd, msgs);
			case Mif2Package.CLASS_BASE__INTERESTED_COMMITTEE:
				return ((InternalEList<?>)getInterestedCommittee()).basicRemove(otherEnd, msgs);
			case Mif2Package.CLASS_BASE__REQUIRED_TEMPLATE_GROUP:
				return ((InternalEList<?>)getRequiredTemplateGroup()).basicRemove(otherEnd, msgs);
			case Mif2Package.CLASS_BASE__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.CLASS_BASE__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.CLASS_BASE__BEHAVIOR:
				return getBehavior();
			case Mif2Package.CLASS_BASE__STEWARD_COMMITTEE:
				return getStewardCommittee();
			case Mif2Package.CLASS_BASE__INTERESTED_COMMITTEE:
				return getInterestedCommittee();
			case Mif2Package.CLASS_BASE__REQUIRED_TEMPLATE_GROUP:
				return getRequiredTemplateGroup();
			case Mif2Package.CLASS_BASE__SUPPORTED_TEMPLATE:
				return getSupportedTemplate();
			case Mif2Package.CLASS_BASE__ATTRIBUTE:
				return getAttribute();
			case Mif2Package.CLASS_BASE__IS_ABSTRACT:
				return isIsAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.CLASS_BASE__IS_COMPLETE:
				return isIsComplete() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.CLASS_BASE__NAME:
				return getName();
			case Mif2Package.CLASS_BASE__NAME_LOCKED:
				return isNameLocked() ? Boolean.TRUE : Boolean.FALSE;
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
			case Mif2Package.CLASS_BASE__ANNOTATIONS:
				setAnnotations((ClassAnnotations)newValue);
				return;
			case Mif2Package.CLASS_BASE__BEHAVIOR:
				setBehavior((StateMachine)newValue);
				return;
			case Mif2Package.CLASS_BASE__STEWARD_COMMITTEE:
				getStewardCommittee().clear();
				getStewardCommittee().addAll((Collection<? extends CommitteeReference>)newValue);
				return;
			case Mif2Package.CLASS_BASE__INTERESTED_COMMITTEE:
				getInterestedCommittee().clear();
				getInterestedCommittee().addAll((Collection<? extends CommitteeReference>)newValue);
				return;
			case Mif2Package.CLASS_BASE__REQUIRED_TEMPLATE_GROUP:
				getRequiredTemplateGroup().clear();
				getRequiredTemplateGroup().addAll((Collection<? extends AppliedTemplateGroup>)newValue);
				return;
			case Mif2Package.CLASS_BASE__SUPPORTED_TEMPLATE:
				getSupportedTemplate().clear();
				getSupportedTemplate().addAll((Collection<? extends String>)newValue);
				return;
			case Mif2Package.CLASS_BASE__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case Mif2Package.CLASS_BASE__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.CLASS_BASE__IS_COMPLETE:
				setIsComplete(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.CLASS_BASE__NAME:
				setName((String)newValue);
				return;
			case Mif2Package.CLASS_BASE__NAME_LOCKED:
				setNameLocked(((Boolean)newValue).booleanValue());
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
			case Mif2Package.CLASS_BASE__ANNOTATIONS:
				setAnnotations((ClassAnnotations)null);
				return;
			case Mif2Package.CLASS_BASE__BEHAVIOR:
				setBehavior((StateMachine)null);
				return;
			case Mif2Package.CLASS_BASE__STEWARD_COMMITTEE:
				getStewardCommittee().clear();
				return;
			case Mif2Package.CLASS_BASE__INTERESTED_COMMITTEE:
				getInterestedCommittee().clear();
				return;
			case Mif2Package.CLASS_BASE__REQUIRED_TEMPLATE_GROUP:
				getRequiredTemplateGroup().clear();
				return;
			case Mif2Package.CLASS_BASE__SUPPORTED_TEMPLATE:
				getSupportedTemplate().clear();
				return;
			case Mif2Package.CLASS_BASE__ATTRIBUTE:
				getAttribute().clear();
				return;
			case Mif2Package.CLASS_BASE__IS_ABSTRACT:
				unsetIsAbstract();
				return;
			case Mif2Package.CLASS_BASE__IS_COMPLETE:
				unsetIsComplete();
				return;
			case Mif2Package.CLASS_BASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mif2Package.CLASS_BASE__NAME_LOCKED:
				unsetNameLocked();
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
			case Mif2Package.CLASS_BASE__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.CLASS_BASE__BEHAVIOR:
				return behavior != null;
			case Mif2Package.CLASS_BASE__STEWARD_COMMITTEE:
				return stewardCommittee != null && !stewardCommittee.isEmpty();
			case Mif2Package.CLASS_BASE__INTERESTED_COMMITTEE:
				return interestedCommittee != null && !interestedCommittee.isEmpty();
			case Mif2Package.CLASS_BASE__REQUIRED_TEMPLATE_GROUP:
				return requiredTemplateGroup != null && !requiredTemplateGroup.isEmpty();
			case Mif2Package.CLASS_BASE__SUPPORTED_TEMPLATE:
				return supportedTemplate != null && !supportedTemplate.isEmpty();
			case Mif2Package.CLASS_BASE__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case Mif2Package.CLASS_BASE__IS_ABSTRACT:
				return isSetIsAbstract();
			case Mif2Package.CLASS_BASE__IS_COMPLETE:
				return isSetIsComplete();
			case Mif2Package.CLASS_BASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Mif2Package.CLASS_BASE__NAME_LOCKED:
				return isSetNameLocked();
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
		result.append(" (supportedTemplate: ");
		result.append(supportedTemplate);
		result.append(", isAbstract: ");
		if (isAbstractESet) result.append(isAbstract); else result.append("<unset>");
		result.append(", isComplete: ");
		if (isCompleteESet) result.append(isComplete); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", nameLocked: ");
		if (nameLockedESet) result.append(nameLocked); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ClassBaseImpl
