/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.BusinessName;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperationKind;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.OperationAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.OperationDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.OperationParameter;
import org.openhealthtools.mdht.emf.hl7.mif2.OwnerScopeKind;
import org.openhealthtools.mdht.emf.hl7.mif2.VisibilityKind;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularySpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeOperationImpl#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeOperationImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeOperationImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeOperationImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeOperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeOperationImpl#getVocabularySpecification <em>Vocabulary Specification</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeOperationImpl#getMaximumMultiplicity <em>Maximum Multiplicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeOperationImpl#getMinimumMultiplicity <em>Minimum Multiplicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeOperationImpl#getOwnerScope <em>Owner Scope</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeOperationImpl#getPropertyKind <em>Property Kind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeOperationImpl#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeOperationImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeOperationImpl extends FeatureImpl implements DatatypeOperation {
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
	protected OperationAnnotations annotations;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected OperationDerivation derivedFrom;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationParameter> parameter;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DatatypeRef type;

	/**
	 * The cached value of the '{@link #getVocabularySpecification() <em>Vocabulary Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabularySpecification()
	 * @generated
	 * @ordered
	 */
	protected VocabularySpecification vocabularySpecification;

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
	 * The default value of the '{@link #getOwnerScope() <em>Owner Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerScope()
	 * @generated
	 * @ordered
	 */
	protected static final OwnerScopeKind OWNER_SCOPE_EDEFAULT = OwnerScopeKind.INSTANCE;

	/**
	 * The cached value of the '{@link #getOwnerScope() <em>Owner Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerScope()
	 * @generated
	 * @ordered
	 */
	protected OwnerScopeKind ownerScope = OWNER_SCOPE_EDEFAULT;

	/**
	 * This is true if the Owner Scope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ownerScopeESet;

	/**
	 * The default value of the '{@link #getPropertyKind() <em>Property Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyKind()
	 * @generated
	 * @ordered
	 */
	protected static final DatatypeOperationKind PROPERTY_KIND_EDEFAULT = DatatypeOperationKind.PROMOTION;

	/**
	 * The cached value of the '{@link #getPropertyKind() <em>Property Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyKind()
	 * @generated
	 * @ordered
	 */
	protected DatatypeOperationKind propertyKind = PROPERTY_KIND_EDEFAULT;

	/**
	 * This is true if the Property Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean propertyKindESet;

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
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PRIVATE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * This is true if the Visibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibilityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.DATATYPE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessName> getBusinessName() {
		if (businessName == null) {
			businessName = new EObjectContainmentEList<BusinessName>(BusinessName.class, this, Mif2Package.DATATYPE_OPERATION__BUSINESS_NAME);
		}
		return businessName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(OperationAnnotations newAnnotations, NotificationChain msgs) {
		OperationAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_OPERATION__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(OperationAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DATATYPE_OPERATION__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DATATYPE_OPERATION__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_OPERATION__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDerivation getDerivedFrom() {
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedFrom(OperationDerivation newDerivedFrom, NotificationChain msgs) {
		OperationDerivation oldDerivedFrom = derivedFrom;
		derivedFrom = newDerivedFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_OPERATION__DERIVED_FROM, oldDerivedFrom, newDerivedFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedFrom(OperationDerivation newDerivedFrom) {
		if (newDerivedFrom != derivedFrom) {
			NotificationChain msgs = null;
			if (derivedFrom != null)
				msgs = ((InternalEObject)derivedFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DATATYPE_OPERATION__DERIVED_FROM, null, msgs);
			if (newDerivedFrom != null)
				msgs = ((InternalEObject)newDerivedFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DATATYPE_OPERATION__DERIVED_FROM, null, msgs);
			msgs = basicSetDerivedFrom(newDerivedFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_OPERATION__DERIVED_FROM, newDerivedFrom, newDerivedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<OperationParameter>(OperationParameter.class, this, Mif2Package.DATATYPE_OPERATION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeRef getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(DatatypeRef newType, NotificationChain msgs) {
		DatatypeRef oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_OPERATION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DatatypeRef newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DATATYPE_OPERATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DATATYPE_OPERATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_OPERATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularySpecification getVocabularySpecification() {
		return vocabularySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVocabularySpecification(VocabularySpecification newVocabularySpecification, NotificationChain msgs) {
		VocabularySpecification oldVocabularySpecification = vocabularySpecification;
		vocabularySpecification = newVocabularySpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_OPERATION__VOCABULARY_SPECIFICATION, oldVocabularySpecification, newVocabularySpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVocabularySpecification(VocabularySpecification newVocabularySpecification) {
		if (newVocabularySpecification != vocabularySpecification) {
			NotificationChain msgs = null;
			if (vocabularySpecification != null)
				msgs = ((InternalEObject)vocabularySpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DATATYPE_OPERATION__VOCABULARY_SPECIFICATION, null, msgs);
			if (newVocabularySpecification != null)
				msgs = ((InternalEObject)newVocabularySpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DATATYPE_OPERATION__VOCABULARY_SPECIFICATION, null, msgs);
			msgs = basicSetVocabularySpecification(newVocabularySpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_OPERATION__VOCABULARY_SPECIFICATION, newVocabularySpecification, newVocabularySpecification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_OPERATION__MAXIMUM_MULTIPLICITY, oldMaximumMultiplicity, maximumMultiplicity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_OPERATION__MINIMUM_MULTIPLICITY, oldMinimumMultiplicity, minimumMultiplicity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnerScopeKind getOwnerScope() {
		return ownerScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerScope(OwnerScopeKind newOwnerScope) {
		OwnerScopeKind oldOwnerScope = ownerScope;
		ownerScope = newOwnerScope == null ? OWNER_SCOPE_EDEFAULT : newOwnerScope;
		boolean oldOwnerScopeESet = ownerScopeESet;
		ownerScopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_OPERATION__OWNER_SCOPE, oldOwnerScope, ownerScope, !oldOwnerScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOwnerScope() {
		OwnerScopeKind oldOwnerScope = ownerScope;
		boolean oldOwnerScopeESet = ownerScopeESet;
		ownerScope = OWNER_SCOPE_EDEFAULT;
		ownerScopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.DATATYPE_OPERATION__OWNER_SCOPE, oldOwnerScope, OWNER_SCOPE_EDEFAULT, oldOwnerScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnerScope() {
		return ownerScopeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeOperationKind getPropertyKind() {
		return propertyKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyKind(DatatypeOperationKind newPropertyKind) {
		DatatypeOperationKind oldPropertyKind = propertyKind;
		propertyKind = newPropertyKind == null ? PROPERTY_KIND_EDEFAULT : newPropertyKind;
		boolean oldPropertyKindESet = propertyKindESet;
		propertyKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_OPERATION__PROPERTY_KIND, oldPropertyKind, propertyKind, !oldPropertyKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPropertyKind() {
		DatatypeOperationKind oldPropertyKind = propertyKind;
		boolean oldPropertyKindESet = propertyKindESet;
		propertyKind = PROPERTY_KIND_EDEFAULT;
		propertyKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.DATATYPE_OPERATION__PROPERTY_KIND, oldPropertyKind, PROPERTY_KIND_EDEFAULT, oldPropertyKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPropertyKind() {
		return propertyKindESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_OPERATION__SORT_KEY, oldSortKey, sortKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		boolean oldVisibilityESet = visibilityESet;
		visibilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_OPERATION__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibility() {
		VisibilityKind oldVisibility = visibility;
		boolean oldVisibilityESet = visibilityESet;
		visibility = VISIBILITY_EDEFAULT;
		visibilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.DATATYPE_OPERATION__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT, oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibility() {
		return visibilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.DATATYPE_OPERATION__BUSINESS_NAME:
				return ((InternalEList<?>)getBusinessName()).basicRemove(otherEnd, msgs);
			case Mif2Package.DATATYPE_OPERATION__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.DATATYPE_OPERATION__DERIVED_FROM:
				return basicSetDerivedFrom(null, msgs);
			case Mif2Package.DATATYPE_OPERATION__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case Mif2Package.DATATYPE_OPERATION__TYPE:
				return basicSetType(null, msgs);
			case Mif2Package.DATATYPE_OPERATION__VOCABULARY_SPECIFICATION:
				return basicSetVocabularySpecification(null, msgs);
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
			case Mif2Package.DATATYPE_OPERATION__BUSINESS_NAME:
				return getBusinessName();
			case Mif2Package.DATATYPE_OPERATION__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.DATATYPE_OPERATION__DERIVED_FROM:
				return getDerivedFrom();
			case Mif2Package.DATATYPE_OPERATION__PARAMETER:
				return getParameter();
			case Mif2Package.DATATYPE_OPERATION__TYPE:
				return getType();
			case Mif2Package.DATATYPE_OPERATION__VOCABULARY_SPECIFICATION:
				return getVocabularySpecification();
			case Mif2Package.DATATYPE_OPERATION__MAXIMUM_MULTIPLICITY:
				return getMaximumMultiplicity();
			case Mif2Package.DATATYPE_OPERATION__MINIMUM_MULTIPLICITY:
				return getMinimumMultiplicity();
			case Mif2Package.DATATYPE_OPERATION__NAME:
				return getName();
			case Mif2Package.DATATYPE_OPERATION__OWNER_SCOPE:
				return getOwnerScope();
			case Mif2Package.DATATYPE_OPERATION__PROPERTY_KIND:
				return getPropertyKind();
			case Mif2Package.DATATYPE_OPERATION__SORT_KEY:
				return getSortKey();
			case Mif2Package.DATATYPE_OPERATION__VISIBILITY:
				return getVisibility();
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
			case Mif2Package.DATATYPE_OPERATION__BUSINESS_NAME:
				getBusinessName().clear();
				getBusinessName().addAll((Collection<? extends BusinessName>)newValue);
				return;
			case Mif2Package.DATATYPE_OPERATION__ANNOTATIONS:
				setAnnotations((OperationAnnotations)newValue);
				return;
			case Mif2Package.DATATYPE_OPERATION__DERIVED_FROM:
				setDerivedFrom((OperationDerivation)newValue);
				return;
			case Mif2Package.DATATYPE_OPERATION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends OperationParameter>)newValue);
				return;
			case Mif2Package.DATATYPE_OPERATION__TYPE:
				setType((DatatypeRef)newValue);
				return;
			case Mif2Package.DATATYPE_OPERATION__VOCABULARY_SPECIFICATION:
				setVocabularySpecification((VocabularySpecification)newValue);
				return;
			case Mif2Package.DATATYPE_OPERATION__MAXIMUM_MULTIPLICITY:
				setMaximumMultiplicity(newValue);
				return;
			case Mif2Package.DATATYPE_OPERATION__MINIMUM_MULTIPLICITY:
				setMinimumMultiplicity((BigInteger)newValue);
				return;
			case Mif2Package.DATATYPE_OPERATION__NAME:
				setName((String)newValue);
				return;
			case Mif2Package.DATATYPE_OPERATION__OWNER_SCOPE:
				setOwnerScope((OwnerScopeKind)newValue);
				return;
			case Mif2Package.DATATYPE_OPERATION__PROPERTY_KIND:
				setPropertyKind((DatatypeOperationKind)newValue);
				return;
			case Mif2Package.DATATYPE_OPERATION__SORT_KEY:
				setSortKey((String)newValue);
				return;
			case Mif2Package.DATATYPE_OPERATION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
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
			case Mif2Package.DATATYPE_OPERATION__BUSINESS_NAME:
				getBusinessName().clear();
				return;
			case Mif2Package.DATATYPE_OPERATION__ANNOTATIONS:
				setAnnotations((OperationAnnotations)null);
				return;
			case Mif2Package.DATATYPE_OPERATION__DERIVED_FROM:
				setDerivedFrom((OperationDerivation)null);
				return;
			case Mif2Package.DATATYPE_OPERATION__PARAMETER:
				getParameter().clear();
				return;
			case Mif2Package.DATATYPE_OPERATION__TYPE:
				setType((DatatypeRef)null);
				return;
			case Mif2Package.DATATYPE_OPERATION__VOCABULARY_SPECIFICATION:
				setVocabularySpecification((VocabularySpecification)null);
				return;
			case Mif2Package.DATATYPE_OPERATION__MAXIMUM_MULTIPLICITY:
				setMaximumMultiplicity(MAXIMUM_MULTIPLICITY_EDEFAULT);
				return;
			case Mif2Package.DATATYPE_OPERATION__MINIMUM_MULTIPLICITY:
				setMinimumMultiplicity(MINIMUM_MULTIPLICITY_EDEFAULT);
				return;
			case Mif2Package.DATATYPE_OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mif2Package.DATATYPE_OPERATION__OWNER_SCOPE:
				unsetOwnerScope();
				return;
			case Mif2Package.DATATYPE_OPERATION__PROPERTY_KIND:
				unsetPropertyKind();
				return;
			case Mif2Package.DATATYPE_OPERATION__SORT_KEY:
				setSortKey(SORT_KEY_EDEFAULT);
				return;
			case Mif2Package.DATATYPE_OPERATION__VISIBILITY:
				unsetVisibility();
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
			case Mif2Package.DATATYPE_OPERATION__BUSINESS_NAME:
				return businessName != null && !businessName.isEmpty();
			case Mif2Package.DATATYPE_OPERATION__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.DATATYPE_OPERATION__DERIVED_FROM:
				return derivedFrom != null;
			case Mif2Package.DATATYPE_OPERATION__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case Mif2Package.DATATYPE_OPERATION__TYPE:
				return type != null;
			case Mif2Package.DATATYPE_OPERATION__VOCABULARY_SPECIFICATION:
				return vocabularySpecification != null;
			case Mif2Package.DATATYPE_OPERATION__MAXIMUM_MULTIPLICITY:
				return MAXIMUM_MULTIPLICITY_EDEFAULT == null ? maximumMultiplicity != null : !MAXIMUM_MULTIPLICITY_EDEFAULT.equals(maximumMultiplicity);
			case Mif2Package.DATATYPE_OPERATION__MINIMUM_MULTIPLICITY:
				return MINIMUM_MULTIPLICITY_EDEFAULT == null ? minimumMultiplicity != null : !MINIMUM_MULTIPLICITY_EDEFAULT.equals(minimumMultiplicity);
			case Mif2Package.DATATYPE_OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Mif2Package.DATATYPE_OPERATION__OWNER_SCOPE:
				return isSetOwnerScope();
			case Mif2Package.DATATYPE_OPERATION__PROPERTY_KIND:
				return isSetPropertyKind();
			case Mif2Package.DATATYPE_OPERATION__SORT_KEY:
				return SORT_KEY_EDEFAULT == null ? sortKey != null : !SORT_KEY_EDEFAULT.equals(sortKey);
			case Mif2Package.DATATYPE_OPERATION__VISIBILITY:
				return isSetVisibility();
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
		result.append(" (maximumMultiplicity: ");
		result.append(maximumMultiplicity);
		result.append(", minimumMultiplicity: ");
		result.append(minimumMultiplicity);
		result.append(", name: ");
		result.append(name);
		result.append(", ownerScope: ");
		if (ownerScopeESet) result.append(ownerScope); else result.append("<unset>");
		result.append(", propertyKind: ");
		if (propertyKindESet) result.append(propertyKind); else result.append("<unset>");
		result.append(", sortKey: ");
		result.append(sortKey);
		result.append(", visibility: ");
		if (visibilityESet) result.append(visibility); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DatatypeOperationImpl
