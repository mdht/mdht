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

import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase;
import org.openhealthtools.mdht.emf.hl7.mif2.Header;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PropertyGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code System Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemBaseImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemBaseImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemBaseImpl#getPropertyGroup <em>Property Group</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemBaseImpl#getApproxCodeCount <em>Approx Code Count</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemBaseImpl#getCodeSystemId <em>Code System Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemBaseImpl#isHasHomonymy <em>Has Homonymy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemBaseImpl#isHasSynonymy <em>Has Synonymy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemBaseImpl#isIsCaseSensitive <em>Is Case Sensitive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemBaseImpl#isIsWhitespaceSensitive <em>Is Whitespace Sensitive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemBaseImpl#getPrimaryLanguage <em>Primary Language</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemBaseImpl#getPrimaryRealm <em>Primary Realm</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemBaseImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CodeSystemBaseImpl extends PackageBaseImpl implements CodeSystemBase {
	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected Header header;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemAnnotations annotations;

	/**
	 * The cached value of the '{@link #getPropertyGroup() <em>Property Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyGroup> propertyGroup;

	/**
	 * The default value of the '{@link #getApproxCodeCount() <em>Approx Code Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproxCodeCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger APPROX_CODE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApproxCodeCount() <em>Approx Code Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproxCodeCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger approxCodeCount = APPROX_CODE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeSystemId() <em>Code System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystemId()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SYSTEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSystemId() <em>Code System Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystemId()
	 * @generated
	 * @ordered
	 */
	protected String codeSystemId = CODE_SYSTEM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasHomonymy() <em>Has Homonymy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasHomonymy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_HOMONYMY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasHomonymy() <em>Has Homonymy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasHomonymy()
	 * @generated
	 * @ordered
	 */
	protected boolean hasHomonymy = HAS_HOMONYMY_EDEFAULT;

	/**
	 * This is true if the Has Homonymy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hasHomonymyESet;

	/**
	 * The default value of the '{@link #isHasSynonymy() <em>Has Synonymy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSynonymy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_SYNONYMY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasSynonymy() <em>Has Synonymy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSynonymy()
	 * @generated
	 * @ordered
	 */
	protected boolean hasSynonymy = HAS_SYNONYMY_EDEFAULT;

	/**
	 * This is true if the Has Synonymy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hasSynonymyESet;

	/**
	 * The default value of the '{@link #isIsCaseSensitive() <em>Is Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CASE_SENSITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCaseSensitive() <em>Is Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected boolean isCaseSensitive = IS_CASE_SENSITIVE_EDEFAULT;

	/**
	 * This is true if the Is Case Sensitive attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isCaseSensitiveESet;

	/**
	 * The default value of the '{@link #isIsWhitespaceSensitive() <em>Is Whitespace Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWhitespaceSensitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WHITESPACE_SENSITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsWhitespaceSensitive() <em>Is Whitespace Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWhitespaceSensitive()
	 * @generated
	 * @ordered
	 */
	protected boolean isWhitespaceSensitive = IS_WHITESPACE_SENSITIVE_EDEFAULT;

	/**
	 * This is true if the Is Whitespace Sensitive attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isWhitespaceSensitiveESet;

	/**
	 * The default value of the '{@link #getPrimaryLanguage() <em>Primary Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryLanguage() <em>Primary Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryLanguage()
	 * @generated
	 * @ordered
	 */
	protected String primaryLanguage = PRIMARY_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryRealm() <em>Primary Realm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryRealm()
	 * @generated
	 * @ordered
	 */
	protected static final Object PRIMARY_REALM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryRealm() <em>Primary Realm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryRealm()
	 * @generated
	 * @ordered
	 */
	protected Object primaryRealm = PRIMARY_REALM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeSystemBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CODE_SYSTEM_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(Header newHeader, NotificationChain msgs) {
		Header oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_SYSTEM_BASE__HEADER, oldHeader, newHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(Header newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CODE_SYSTEM_BASE__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CODE_SYSTEM_BASE__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_SYSTEM_BASE__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(CodeSystemAnnotations newAnnotations, NotificationChain msgs) {
		CodeSystemAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_SYSTEM_BASE__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(CodeSystemAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CODE_SYSTEM_BASE__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CODE_SYSTEM_BASE__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_SYSTEM_BASE__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyGroup> getPropertyGroup() {
		if (propertyGroup == null) {
			propertyGroup = new EObjectContainmentEList<PropertyGroup>(PropertyGroup.class, this, Mif2Package.CODE_SYSTEM_BASE__PROPERTY_GROUP);
		}
		return propertyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getApproxCodeCount() {
		return approxCodeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApproxCodeCount(BigInteger newApproxCodeCount) {
		BigInteger oldApproxCodeCount = approxCodeCount;
		approxCodeCount = newApproxCodeCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_SYSTEM_BASE__APPROX_CODE_COUNT, oldApproxCodeCount, approxCodeCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeSystemId() {
		return codeSystemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystemId(String newCodeSystemId) {
		String oldCodeSystemId = codeSystemId;
		codeSystemId = newCodeSystemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_SYSTEM_BASE__CODE_SYSTEM_ID, oldCodeSystemId, codeSystemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasHomonymy() {
		return hasHomonymy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasHomonymy(boolean newHasHomonymy) {
		boolean oldHasHomonymy = hasHomonymy;
		hasHomonymy = newHasHomonymy;
		boolean oldHasHomonymyESet = hasHomonymyESet;
		hasHomonymyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_SYSTEM_BASE__HAS_HOMONYMY, oldHasHomonymy, hasHomonymy, !oldHasHomonymyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasHomonymy() {
		boolean oldHasHomonymy = hasHomonymy;
		boolean oldHasHomonymyESet = hasHomonymyESet;
		hasHomonymy = HAS_HOMONYMY_EDEFAULT;
		hasHomonymyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.CODE_SYSTEM_BASE__HAS_HOMONYMY, oldHasHomonymy, HAS_HOMONYMY_EDEFAULT, oldHasHomonymyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasHomonymy() {
		return hasHomonymyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasSynonymy() {
		return hasSynonymy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSynonymy(boolean newHasSynonymy) {
		boolean oldHasSynonymy = hasSynonymy;
		hasSynonymy = newHasSynonymy;
		boolean oldHasSynonymyESet = hasSynonymyESet;
		hasSynonymyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_SYSTEM_BASE__HAS_SYNONYMY, oldHasSynonymy, hasSynonymy, !oldHasSynonymyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHasSynonymy() {
		boolean oldHasSynonymy = hasSynonymy;
		boolean oldHasSynonymyESet = hasSynonymyESet;
		hasSynonymy = HAS_SYNONYMY_EDEFAULT;
		hasSynonymyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.CODE_SYSTEM_BASE__HAS_SYNONYMY, oldHasSynonymy, HAS_SYNONYMY_EDEFAULT, oldHasSynonymyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHasSynonymy() {
		return hasSynonymyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCaseSensitive() {
		return isCaseSensitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCaseSensitive(boolean newIsCaseSensitive) {
		boolean oldIsCaseSensitive = isCaseSensitive;
		isCaseSensitive = newIsCaseSensitive;
		boolean oldIsCaseSensitiveESet = isCaseSensitiveESet;
		isCaseSensitiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_SYSTEM_BASE__IS_CASE_SENSITIVE, oldIsCaseSensitive, isCaseSensitive, !oldIsCaseSensitiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsCaseSensitive() {
		boolean oldIsCaseSensitive = isCaseSensitive;
		boolean oldIsCaseSensitiveESet = isCaseSensitiveESet;
		isCaseSensitive = IS_CASE_SENSITIVE_EDEFAULT;
		isCaseSensitiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.CODE_SYSTEM_BASE__IS_CASE_SENSITIVE, oldIsCaseSensitive, IS_CASE_SENSITIVE_EDEFAULT, oldIsCaseSensitiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsCaseSensitive() {
		return isCaseSensitiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsWhitespaceSensitive() {
		return isWhitespaceSensitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsWhitespaceSensitive(boolean newIsWhitespaceSensitive) {
		boolean oldIsWhitespaceSensitive = isWhitespaceSensitive;
		isWhitespaceSensitive = newIsWhitespaceSensitive;
		boolean oldIsWhitespaceSensitiveESet = isWhitespaceSensitiveESet;
		isWhitespaceSensitiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_SYSTEM_BASE__IS_WHITESPACE_SENSITIVE, oldIsWhitespaceSensitive, isWhitespaceSensitive, !oldIsWhitespaceSensitiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsWhitespaceSensitive() {
		boolean oldIsWhitespaceSensitive = isWhitespaceSensitive;
		boolean oldIsWhitespaceSensitiveESet = isWhitespaceSensitiveESet;
		isWhitespaceSensitive = IS_WHITESPACE_SENSITIVE_EDEFAULT;
		isWhitespaceSensitiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.CODE_SYSTEM_BASE__IS_WHITESPACE_SENSITIVE, oldIsWhitespaceSensitive, IS_WHITESPACE_SENSITIVE_EDEFAULT, oldIsWhitespaceSensitiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsWhitespaceSensitive() {
		return isWhitespaceSensitiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimaryLanguage() {
		return primaryLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryLanguage(String newPrimaryLanguage) {
		String oldPrimaryLanguage = primaryLanguage;
		primaryLanguage = newPrimaryLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_SYSTEM_BASE__PRIMARY_LANGUAGE, oldPrimaryLanguage, primaryLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPrimaryRealm() {
		return primaryRealm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryRealm(Object newPrimaryRealm) {
		Object oldPrimaryRealm = primaryRealm;
		primaryRealm = newPrimaryRealm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_SYSTEM_BASE__PRIMARY_REALM, oldPrimaryRealm, primaryRealm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_SYSTEM_BASE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CODE_SYSTEM_BASE__HEADER:
				return basicSetHeader(null, msgs);
			case Mif2Package.CODE_SYSTEM_BASE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.CODE_SYSTEM_BASE__PROPERTY_GROUP:
				return ((InternalEList<?>)getPropertyGroup()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.CODE_SYSTEM_BASE__HEADER:
				return getHeader();
			case Mif2Package.CODE_SYSTEM_BASE__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.CODE_SYSTEM_BASE__PROPERTY_GROUP:
				return getPropertyGroup();
			case Mif2Package.CODE_SYSTEM_BASE__APPROX_CODE_COUNT:
				return getApproxCodeCount();
			case Mif2Package.CODE_SYSTEM_BASE__CODE_SYSTEM_ID:
				return getCodeSystemId();
			case Mif2Package.CODE_SYSTEM_BASE__HAS_HOMONYMY:
				return isHasHomonymy() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.CODE_SYSTEM_BASE__HAS_SYNONYMY:
				return isHasSynonymy() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.CODE_SYSTEM_BASE__IS_CASE_SENSITIVE:
				return isIsCaseSensitive() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.CODE_SYSTEM_BASE__IS_WHITESPACE_SENSITIVE:
				return isIsWhitespaceSensitive() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.CODE_SYSTEM_BASE__PRIMARY_LANGUAGE:
				return getPrimaryLanguage();
			case Mif2Package.CODE_SYSTEM_BASE__PRIMARY_REALM:
				return getPrimaryRealm();
			case Mif2Package.CODE_SYSTEM_BASE__TITLE:
				return getTitle();
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
			case Mif2Package.CODE_SYSTEM_BASE__HEADER:
				setHeader((Header)newValue);
				return;
			case Mif2Package.CODE_SYSTEM_BASE__ANNOTATIONS:
				setAnnotations((CodeSystemAnnotations)newValue);
				return;
			case Mif2Package.CODE_SYSTEM_BASE__PROPERTY_GROUP:
				getPropertyGroup().clear();
				getPropertyGroup().addAll((Collection<? extends PropertyGroup>)newValue);
				return;
			case Mif2Package.CODE_SYSTEM_BASE__APPROX_CODE_COUNT:
				setApproxCodeCount((BigInteger)newValue);
				return;
			case Mif2Package.CODE_SYSTEM_BASE__CODE_SYSTEM_ID:
				setCodeSystemId((String)newValue);
				return;
			case Mif2Package.CODE_SYSTEM_BASE__HAS_HOMONYMY:
				setHasHomonymy(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.CODE_SYSTEM_BASE__HAS_SYNONYMY:
				setHasSynonymy(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.CODE_SYSTEM_BASE__IS_CASE_SENSITIVE:
				setIsCaseSensitive(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.CODE_SYSTEM_BASE__IS_WHITESPACE_SENSITIVE:
				setIsWhitespaceSensitive(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.CODE_SYSTEM_BASE__PRIMARY_LANGUAGE:
				setPrimaryLanguage((String)newValue);
				return;
			case Mif2Package.CODE_SYSTEM_BASE__PRIMARY_REALM:
				setPrimaryRealm(newValue);
				return;
			case Mif2Package.CODE_SYSTEM_BASE__TITLE:
				setTitle((String)newValue);
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
			case Mif2Package.CODE_SYSTEM_BASE__HEADER:
				setHeader((Header)null);
				return;
			case Mif2Package.CODE_SYSTEM_BASE__ANNOTATIONS:
				setAnnotations((CodeSystemAnnotations)null);
				return;
			case Mif2Package.CODE_SYSTEM_BASE__PROPERTY_GROUP:
				getPropertyGroup().clear();
				return;
			case Mif2Package.CODE_SYSTEM_BASE__APPROX_CODE_COUNT:
				setApproxCodeCount(APPROX_CODE_COUNT_EDEFAULT);
				return;
			case Mif2Package.CODE_SYSTEM_BASE__CODE_SYSTEM_ID:
				setCodeSystemId(CODE_SYSTEM_ID_EDEFAULT);
				return;
			case Mif2Package.CODE_SYSTEM_BASE__HAS_HOMONYMY:
				unsetHasHomonymy();
				return;
			case Mif2Package.CODE_SYSTEM_BASE__HAS_SYNONYMY:
				unsetHasSynonymy();
				return;
			case Mif2Package.CODE_SYSTEM_BASE__IS_CASE_SENSITIVE:
				unsetIsCaseSensitive();
				return;
			case Mif2Package.CODE_SYSTEM_BASE__IS_WHITESPACE_SENSITIVE:
				unsetIsWhitespaceSensitive();
				return;
			case Mif2Package.CODE_SYSTEM_BASE__PRIMARY_LANGUAGE:
				setPrimaryLanguage(PRIMARY_LANGUAGE_EDEFAULT);
				return;
			case Mif2Package.CODE_SYSTEM_BASE__PRIMARY_REALM:
				setPrimaryRealm(PRIMARY_REALM_EDEFAULT);
				return;
			case Mif2Package.CODE_SYSTEM_BASE__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case Mif2Package.CODE_SYSTEM_BASE__HEADER:
				return header != null;
			case Mif2Package.CODE_SYSTEM_BASE__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.CODE_SYSTEM_BASE__PROPERTY_GROUP:
				return propertyGroup != null && !propertyGroup.isEmpty();
			case Mif2Package.CODE_SYSTEM_BASE__APPROX_CODE_COUNT:
				return APPROX_CODE_COUNT_EDEFAULT == null ? approxCodeCount != null : !APPROX_CODE_COUNT_EDEFAULT.equals(approxCodeCount);
			case Mif2Package.CODE_SYSTEM_BASE__CODE_SYSTEM_ID:
				return CODE_SYSTEM_ID_EDEFAULT == null ? codeSystemId != null : !CODE_SYSTEM_ID_EDEFAULT.equals(codeSystemId);
			case Mif2Package.CODE_SYSTEM_BASE__HAS_HOMONYMY:
				return isSetHasHomonymy();
			case Mif2Package.CODE_SYSTEM_BASE__HAS_SYNONYMY:
				return isSetHasSynonymy();
			case Mif2Package.CODE_SYSTEM_BASE__IS_CASE_SENSITIVE:
				return isSetIsCaseSensitive();
			case Mif2Package.CODE_SYSTEM_BASE__IS_WHITESPACE_SENSITIVE:
				return isSetIsWhitespaceSensitive();
			case Mif2Package.CODE_SYSTEM_BASE__PRIMARY_LANGUAGE:
				return PRIMARY_LANGUAGE_EDEFAULT == null ? primaryLanguage != null : !PRIMARY_LANGUAGE_EDEFAULT.equals(primaryLanguage);
			case Mif2Package.CODE_SYSTEM_BASE__PRIMARY_REALM:
				return PRIMARY_REALM_EDEFAULT == null ? primaryRealm != null : !PRIMARY_REALM_EDEFAULT.equals(primaryRealm);
			case Mif2Package.CODE_SYSTEM_BASE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
		result.append(" (approxCodeCount: ");
		result.append(approxCodeCount);
		result.append(", codeSystemId: ");
		result.append(codeSystemId);
		result.append(", hasHomonymy: ");
		if (hasHomonymyESet) result.append(hasHomonymy); else result.append("<unset>");
		result.append(", hasSynonymy: ");
		if (hasSynonymyESet) result.append(hasSynonymy); else result.append("<unset>");
		result.append(", isCaseSensitive: ");
		if (isCaseSensitiveESet) result.append(isCaseSensitive); else result.append("<unset>");
		result.append(", isWhitespaceSensitive: ");
		if (isWhitespaceSensitiveESet) result.append(isWhitespaceSensitive); else result.append("<unset>");
		result.append(", primaryLanguage: ");
		result.append(primaryLanguage);
		result.append(", primaryRealm: ");
		result.append(primaryRealm);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //CodeSystemBaseImpl
