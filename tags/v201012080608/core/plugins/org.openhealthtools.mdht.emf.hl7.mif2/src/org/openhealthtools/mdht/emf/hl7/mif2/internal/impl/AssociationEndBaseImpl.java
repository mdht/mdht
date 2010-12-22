/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.math.BigInteger;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase;
import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndSpecialization;
import org.openhealthtools.mdht.emf.hl7.mif2.BusinessName;
import org.openhealthtools.mdht.emf.hl7.mif2.ConformanceKind;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.UpdateModeKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association End Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndBaseImpl#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndBaseImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndBaseImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndBaseImpl#getChoiceItem <em>Choice Item</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndBaseImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndBaseImpl#getExtensionOID <em>Extension OID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndBaseImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndBaseImpl#getMaximumMultiplicity <em>Maximum Multiplicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndBaseImpl#getMaximumRecursionDepth <em>Maximum Recursion Depth</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndBaseImpl#getMinimumMultiplicity <em>Minimum Multiplicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndBaseImpl#isNameLocked <em>Name Locked</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndBaseImpl#isReferenceHistory <em>Reference History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndBaseImpl#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndBaseImpl#getUpdateModeDefault <em>Update Mode Default</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndBaseImpl#getUpdateModesAllowed <em>Update Modes Allowed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationEndBaseImpl extends RelationshipImpl implements AssociationEndBase {
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
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AssociationEndAnnotations annotations;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationEndDerivation> derivedFrom;

	/**
	 * The cached value of the '{@link #getChoiceItem() <em>Choice Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoiceItem()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationEndSpecialization> choiceItem;

	/**
	 * The default value of the '{@link #getConformance() <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformance()
	 * @generated
	 * @ordered
	 */
	protected static final ConformanceKind CONFORMANCE_EDEFAULT = ConformanceKind.I;

	/**
	 * The cached value of the '{@link #getConformance() <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformance()
	 * @generated
	 * @ordered
	 */
	protected ConformanceKind conformance = CONFORMANCE_EDEFAULT;

	/**
	 * This is true if the Conformance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conformanceESet;

	/**
	 * The default value of the '{@link #getExtensionOID() <em>Extension OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionOID()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_OID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtensionOID() <em>Extension OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionOID()
	 * @generated
	 * @ordered
	 */
	protected String extensionOID = EXTENSION_OID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatory = IS_MANDATORY_EDEFAULT;

	/**
	 * This is true if the Is Mandatory attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatoryESet;

	/**
	 * The default value of the '{@link #getMaximumMultiplicity() <em>Maximum Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final Object MAXIMUM_MULTIPLICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumMultiplicity() <em>Maximum Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Object maximumMultiplicity = MAXIMUM_MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumRecursionDepth() <em>Maximum Recursion Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRecursionDepth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAXIMUM_RECURSION_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumRecursionDepth() <em>Maximum Recursion Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRecursionDepth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maximumRecursionDepth = MAXIMUM_RECURSION_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumMultiplicity() <em>Minimum Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MINIMUM_MULTIPLICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumMultiplicity() <em>Minimum Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minimumMultiplicity = MINIMUM_MULTIPLICITY_EDEFAULT;

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
	 * The default value of the '{@link #isReferenceHistory() <em>Reference History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReferenceHistory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFERENCE_HISTORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReferenceHistory() <em>Reference History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReferenceHistory()
	 * @generated
	 * @ordered
	 */
	protected boolean referenceHistory = REFERENCE_HISTORY_EDEFAULT;

	/**
	 * This is true if the Reference History attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referenceHistoryESet;

	/**
	 * The default value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SORT_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected String sortKey = SORT_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateModeDefault() <em>Update Mode Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateModeDefault()
	 * @generated
	 * @ordered
	 */
	protected static final UpdateModeKind UPDATE_MODE_DEFAULT_EDEFAULT = UpdateModeKind.A;

	/**
	 * The cached value of the '{@link #getUpdateModeDefault() <em>Update Mode Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateModeDefault()
	 * @generated
	 * @ordered
	 */
	protected UpdateModeKind updateModeDefault = UPDATE_MODE_DEFAULT_EDEFAULT;

	/**
	 * This is true if the Update Mode Default attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean updateModeDefaultESet;

	/**
	 * The default value of the '{@link #getUpdateModesAllowed() <em>Update Modes Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateModesAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final List<UpdateModeKind> UPDATE_MODES_ALLOWED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateModesAllowed() <em>Update Modes Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateModesAllowed()
	 * @generated
	 * @ordered
	 */
	protected List<UpdateModeKind> updateModesAllowed = UPDATE_MODES_ALLOWED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationEndBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ASSOCIATION_END_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessName> getBusinessName() {
		if (businessName == null) {
			businessName = new EObjectContainmentEList<BusinessName>(BusinessName.class, this, Mif2Package.ASSOCIATION_END_BASE__BUSINESS_NAME);
		}
		return businessName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEndAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AssociationEndAnnotations newAnnotations, NotificationChain msgs) {
		AssociationEndAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.ASSOCIATION_END_BASE__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AssociationEndAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.ASSOCIATION_END_BASE__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.ASSOCIATION_END_BASE__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ASSOCIATION_END_BASE__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssociationEndDerivation> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<AssociationEndDerivation>(AssociationEndDerivation.class, this, Mif2Package.ASSOCIATION_END_BASE__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssociationEndSpecialization> getChoiceItem() {
		if (choiceItem == null) {
			choiceItem = new EObjectContainmentEList<AssociationEndSpecialization>(AssociationEndSpecialization.class, this, Mif2Package.ASSOCIATION_END_BASE__CHOICE_ITEM);
		}
		return choiceItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceKind getConformance() {
		return conformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformance(ConformanceKind newConformance) {
		ConformanceKind oldConformance = conformance;
		conformance = newConformance == null ? CONFORMANCE_EDEFAULT : newConformance;
		boolean oldConformanceESet = conformanceESet;
		conformanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ASSOCIATION_END_BASE__CONFORMANCE, oldConformance, conformance, !oldConformanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConformance() {
		ConformanceKind oldConformance = conformance;
		boolean oldConformanceESet = conformanceESet;
		conformance = CONFORMANCE_EDEFAULT;
		conformanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.ASSOCIATION_END_BASE__CONFORMANCE, oldConformance, CONFORMANCE_EDEFAULT, oldConformanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConformance() {
		return conformanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensionOID() {
		return extensionOID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionOID(String newExtensionOID) {
		String oldExtensionOID = extensionOID;
		extensionOID = newExtensionOID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ASSOCIATION_END_BASE__EXTENSION_OID, oldExtensionOID, extensionOID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMandatory() {
		return isMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMandatory(boolean newIsMandatory) {
		boolean oldIsMandatory = isMandatory;
		isMandatory = newIsMandatory;
		boolean oldIsMandatoryESet = isMandatoryESet;
		isMandatoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ASSOCIATION_END_BASE__IS_MANDATORY, oldIsMandatory, isMandatory, !oldIsMandatoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsMandatory() {
		boolean oldIsMandatory = isMandatory;
		boolean oldIsMandatoryESet = isMandatoryESet;
		isMandatory = IS_MANDATORY_EDEFAULT;
		isMandatoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.ASSOCIATION_END_BASE__IS_MANDATORY, oldIsMandatory, IS_MANDATORY_EDEFAULT, oldIsMandatoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsMandatory() {
		return isMandatoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMaximumMultiplicity() {
		return maximumMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumMultiplicity(Object newMaximumMultiplicity) {
		Object oldMaximumMultiplicity = maximumMultiplicity;
		maximumMultiplicity = newMaximumMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ASSOCIATION_END_BASE__MAXIMUM_MULTIPLICITY, oldMaximumMultiplicity, maximumMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaximumRecursionDepth() {
		return maximumRecursionDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumRecursionDepth(BigInteger newMaximumRecursionDepth) {
		BigInteger oldMaximumRecursionDepth = maximumRecursionDepth;
		maximumRecursionDepth = newMaximumRecursionDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ASSOCIATION_END_BASE__MAXIMUM_RECURSION_DEPTH, oldMaximumRecursionDepth, maximumRecursionDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinimumMultiplicity() {
		return minimumMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumMultiplicity(BigInteger newMinimumMultiplicity) {
		BigInteger oldMinimumMultiplicity = minimumMultiplicity;
		minimumMultiplicity = newMinimumMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ASSOCIATION_END_BASE__MINIMUM_MULTIPLICITY, oldMinimumMultiplicity, minimumMultiplicity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ASSOCIATION_END_BASE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ASSOCIATION_END_BASE__NAME_LOCKED, oldNameLocked, nameLocked, !oldNameLockedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.ASSOCIATION_END_BASE__NAME_LOCKED, oldNameLocked, NAME_LOCKED_EDEFAULT, oldNameLockedESet));
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
	public boolean isReferenceHistory() {
		return referenceHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceHistory(boolean newReferenceHistory) {
		boolean oldReferenceHistory = referenceHistory;
		referenceHistory = newReferenceHistory;
		boolean oldReferenceHistoryESet = referenceHistoryESet;
		referenceHistoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ASSOCIATION_END_BASE__REFERENCE_HISTORY, oldReferenceHistory, referenceHistory, !oldReferenceHistoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferenceHistory() {
		boolean oldReferenceHistory = referenceHistory;
		boolean oldReferenceHistoryESet = referenceHistoryESet;
		referenceHistory = REFERENCE_HISTORY_EDEFAULT;
		referenceHistoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.ASSOCIATION_END_BASE__REFERENCE_HISTORY, oldReferenceHistory, REFERENCE_HISTORY_EDEFAULT, oldReferenceHistoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferenceHistory() {
		return referenceHistoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSortKey() {
		return sortKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortKey(String newSortKey) {
		String oldSortKey = sortKey;
		sortKey = newSortKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ASSOCIATION_END_BASE__SORT_KEY, oldSortKey, sortKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateModeKind getUpdateModeDefault() {
		return updateModeDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateModeDefault(UpdateModeKind newUpdateModeDefault) {
		UpdateModeKind oldUpdateModeDefault = updateModeDefault;
		updateModeDefault = newUpdateModeDefault == null ? UPDATE_MODE_DEFAULT_EDEFAULT : newUpdateModeDefault;
		boolean oldUpdateModeDefaultESet = updateModeDefaultESet;
		updateModeDefaultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ASSOCIATION_END_BASE__UPDATE_MODE_DEFAULT, oldUpdateModeDefault, updateModeDefault, !oldUpdateModeDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpdateModeDefault() {
		UpdateModeKind oldUpdateModeDefault = updateModeDefault;
		boolean oldUpdateModeDefaultESet = updateModeDefaultESet;
		updateModeDefault = UPDATE_MODE_DEFAULT_EDEFAULT;
		updateModeDefaultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.ASSOCIATION_END_BASE__UPDATE_MODE_DEFAULT, oldUpdateModeDefault, UPDATE_MODE_DEFAULT_EDEFAULT, oldUpdateModeDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpdateModeDefault() {
		return updateModeDefaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<UpdateModeKind> getUpdateModesAllowed() {
		return updateModesAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateModesAllowed(List<UpdateModeKind> newUpdateModesAllowed) {
		List<UpdateModeKind> oldUpdateModesAllowed = updateModesAllowed;
		updateModesAllowed = newUpdateModesAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ASSOCIATION_END_BASE__UPDATE_MODES_ALLOWED, oldUpdateModesAllowed, updateModesAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.ASSOCIATION_END_BASE__BUSINESS_NAME:
				return ((InternalEList<?>)getBusinessName()).basicRemove(otherEnd, msgs);
			case Mif2Package.ASSOCIATION_END_BASE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.ASSOCIATION_END_BASE__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFrom()).basicRemove(otherEnd, msgs);
			case Mif2Package.ASSOCIATION_END_BASE__CHOICE_ITEM:
				return ((InternalEList<?>)getChoiceItem()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.ASSOCIATION_END_BASE__BUSINESS_NAME:
				return getBusinessName();
			case Mif2Package.ASSOCIATION_END_BASE__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.ASSOCIATION_END_BASE__DERIVED_FROM:
				return getDerivedFrom();
			case Mif2Package.ASSOCIATION_END_BASE__CHOICE_ITEM:
				return getChoiceItem();
			case Mif2Package.ASSOCIATION_END_BASE__CONFORMANCE:
				return getConformance();
			case Mif2Package.ASSOCIATION_END_BASE__EXTENSION_OID:
				return getExtensionOID();
			case Mif2Package.ASSOCIATION_END_BASE__IS_MANDATORY:
				return isIsMandatory() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.ASSOCIATION_END_BASE__MAXIMUM_MULTIPLICITY:
				return getMaximumMultiplicity();
			case Mif2Package.ASSOCIATION_END_BASE__MAXIMUM_RECURSION_DEPTH:
				return getMaximumRecursionDepth();
			case Mif2Package.ASSOCIATION_END_BASE__MINIMUM_MULTIPLICITY:
				return getMinimumMultiplicity();
			case Mif2Package.ASSOCIATION_END_BASE__NAME:
				return getName();
			case Mif2Package.ASSOCIATION_END_BASE__NAME_LOCKED:
				return isNameLocked() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.ASSOCIATION_END_BASE__REFERENCE_HISTORY:
				return isReferenceHistory() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.ASSOCIATION_END_BASE__SORT_KEY:
				return getSortKey();
			case Mif2Package.ASSOCIATION_END_BASE__UPDATE_MODE_DEFAULT:
				return getUpdateModeDefault();
			case Mif2Package.ASSOCIATION_END_BASE__UPDATE_MODES_ALLOWED:
				return getUpdateModesAllowed();
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
			case Mif2Package.ASSOCIATION_END_BASE__BUSINESS_NAME:
				getBusinessName().clear();
				getBusinessName().addAll((Collection<? extends BusinessName>)newValue);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__ANNOTATIONS:
				setAnnotations((AssociationEndAnnotations)newValue);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends AssociationEndDerivation>)newValue);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__CHOICE_ITEM:
				getChoiceItem().clear();
				getChoiceItem().addAll((Collection<? extends AssociationEndSpecialization>)newValue);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__CONFORMANCE:
				setConformance((ConformanceKind)newValue);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__EXTENSION_OID:
				setExtensionOID((String)newValue);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__IS_MANDATORY:
				setIsMandatory(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.ASSOCIATION_END_BASE__MAXIMUM_MULTIPLICITY:
				setMaximumMultiplicity(newValue);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__MAXIMUM_RECURSION_DEPTH:
				setMaximumRecursionDepth((BigInteger)newValue);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__MINIMUM_MULTIPLICITY:
				setMinimumMultiplicity((BigInteger)newValue);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__NAME:
				setName((String)newValue);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__NAME_LOCKED:
				setNameLocked(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.ASSOCIATION_END_BASE__REFERENCE_HISTORY:
				setReferenceHistory(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.ASSOCIATION_END_BASE__SORT_KEY:
				setSortKey((String)newValue);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__UPDATE_MODE_DEFAULT:
				setUpdateModeDefault((UpdateModeKind)newValue);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__UPDATE_MODES_ALLOWED:
				setUpdateModesAllowed((List<UpdateModeKind>)newValue);
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
			case Mif2Package.ASSOCIATION_END_BASE__BUSINESS_NAME:
				getBusinessName().clear();
				return;
			case Mif2Package.ASSOCIATION_END_BASE__ANNOTATIONS:
				setAnnotations((AssociationEndAnnotations)null);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case Mif2Package.ASSOCIATION_END_BASE__CHOICE_ITEM:
				getChoiceItem().clear();
				return;
			case Mif2Package.ASSOCIATION_END_BASE__CONFORMANCE:
				unsetConformance();
				return;
			case Mif2Package.ASSOCIATION_END_BASE__EXTENSION_OID:
				setExtensionOID(EXTENSION_OID_EDEFAULT);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__IS_MANDATORY:
				unsetIsMandatory();
				return;
			case Mif2Package.ASSOCIATION_END_BASE__MAXIMUM_MULTIPLICITY:
				setMaximumMultiplicity(MAXIMUM_MULTIPLICITY_EDEFAULT);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__MAXIMUM_RECURSION_DEPTH:
				setMaximumRecursionDepth(MAXIMUM_RECURSION_DEPTH_EDEFAULT);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__MINIMUM_MULTIPLICITY:
				setMinimumMultiplicity(MINIMUM_MULTIPLICITY_EDEFAULT);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__NAME_LOCKED:
				unsetNameLocked();
				return;
			case Mif2Package.ASSOCIATION_END_BASE__REFERENCE_HISTORY:
				unsetReferenceHistory();
				return;
			case Mif2Package.ASSOCIATION_END_BASE__SORT_KEY:
				setSortKey(SORT_KEY_EDEFAULT);
				return;
			case Mif2Package.ASSOCIATION_END_BASE__UPDATE_MODE_DEFAULT:
				unsetUpdateModeDefault();
				return;
			case Mif2Package.ASSOCIATION_END_BASE__UPDATE_MODES_ALLOWED:
				setUpdateModesAllowed(UPDATE_MODES_ALLOWED_EDEFAULT);
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
			case Mif2Package.ASSOCIATION_END_BASE__BUSINESS_NAME:
				return businessName != null && !businessName.isEmpty();
			case Mif2Package.ASSOCIATION_END_BASE__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.ASSOCIATION_END_BASE__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case Mif2Package.ASSOCIATION_END_BASE__CHOICE_ITEM:
				return choiceItem != null && !choiceItem.isEmpty();
			case Mif2Package.ASSOCIATION_END_BASE__CONFORMANCE:
				return isSetConformance();
			case Mif2Package.ASSOCIATION_END_BASE__EXTENSION_OID:
				return EXTENSION_OID_EDEFAULT == null ? extensionOID != null : !EXTENSION_OID_EDEFAULT.equals(extensionOID);
			case Mif2Package.ASSOCIATION_END_BASE__IS_MANDATORY:
				return isSetIsMandatory();
			case Mif2Package.ASSOCIATION_END_BASE__MAXIMUM_MULTIPLICITY:
				return MAXIMUM_MULTIPLICITY_EDEFAULT == null ? maximumMultiplicity != null : !MAXIMUM_MULTIPLICITY_EDEFAULT.equals(maximumMultiplicity);
			case Mif2Package.ASSOCIATION_END_BASE__MAXIMUM_RECURSION_DEPTH:
				return MAXIMUM_RECURSION_DEPTH_EDEFAULT == null ? maximumRecursionDepth != null : !MAXIMUM_RECURSION_DEPTH_EDEFAULT.equals(maximumRecursionDepth);
			case Mif2Package.ASSOCIATION_END_BASE__MINIMUM_MULTIPLICITY:
				return MINIMUM_MULTIPLICITY_EDEFAULT == null ? minimumMultiplicity != null : !MINIMUM_MULTIPLICITY_EDEFAULT.equals(minimumMultiplicity);
			case Mif2Package.ASSOCIATION_END_BASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Mif2Package.ASSOCIATION_END_BASE__NAME_LOCKED:
				return isSetNameLocked();
			case Mif2Package.ASSOCIATION_END_BASE__REFERENCE_HISTORY:
				return isSetReferenceHistory();
			case Mif2Package.ASSOCIATION_END_BASE__SORT_KEY:
				return SORT_KEY_EDEFAULT == null ? sortKey != null : !SORT_KEY_EDEFAULT.equals(sortKey);
			case Mif2Package.ASSOCIATION_END_BASE__UPDATE_MODE_DEFAULT:
				return isSetUpdateModeDefault();
			case Mif2Package.ASSOCIATION_END_BASE__UPDATE_MODES_ALLOWED:
				return UPDATE_MODES_ALLOWED_EDEFAULT == null ? updateModesAllowed != null : !UPDATE_MODES_ALLOWED_EDEFAULT.equals(updateModesAllowed);
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
		result.append(" (conformance: ");
		if (conformanceESet) result.append(conformance); else result.append("<unset>");
		result.append(", extensionOID: ");
		result.append(extensionOID);
		result.append(", isMandatory: ");
		if (isMandatoryESet) result.append(isMandatory); else result.append("<unset>");
		result.append(", maximumMultiplicity: ");
		result.append(maximumMultiplicity);
		result.append(", maximumRecursionDepth: ");
		result.append(maximumRecursionDepth);
		result.append(", minimumMultiplicity: ");
		result.append(minimumMultiplicity);
		result.append(", name: ");
		result.append(name);
		result.append(", nameLocked: ");
		if (nameLockedESet) result.append(nameLocked); else result.append("<unset>");
		result.append(", referenceHistory: ");
		if (referenceHistoryESet) result.append(referenceHistory); else result.append("<unset>");
		result.append(", sortKey: ");
		result.append(sortKey);
		result.append(", updateModeDefault: ");
		if (updateModeDefaultESet) result.append(updateModeDefault); else result.append("<unset>");
		result.append(", updateModesAllowed: ");
		result.append(updateModesAllowed);
		result.append(')');
		return result.toString();
	}

} //AssociationEndBaseImpl
