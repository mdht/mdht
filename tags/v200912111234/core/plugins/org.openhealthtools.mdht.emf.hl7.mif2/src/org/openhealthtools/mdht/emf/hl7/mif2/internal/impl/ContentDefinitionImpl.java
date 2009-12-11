/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.CodeBasedContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeFilterContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.CombinedContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinitionAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.NonComputableContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.PropertyBasedContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.RelationshipBasedContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContentDefinitionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContentDefinitionImpl#getCombinedContent <em>Combined Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContentDefinitionImpl#getCodeBasedContent <em>Code Based Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContentDefinitionImpl#getPropertyBasedContent <em>Property Based Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContentDefinitionImpl#getCodeFilterContent <em>Code Filter Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContentDefinitionImpl#getNonComputableContent <em>Non Computable Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContentDefinitionImpl#getValueSetRef <em>Value Set Ref</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContentDefinitionImpl#getAllowedQualifiers <em>Allowed Qualifiers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContentDefinitionImpl#getProhibitedQualifiers <em>Prohibited Qualifiers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContentDefinitionImpl#isAreBaseQualifiersUnlimited <em>Are Base Qualifiers Unlimited</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContentDefinitionImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContentDefinitionImpl#getVersionDate <em>Version Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentDefinitionImpl extends EObjectImpl implements ContentDefinition {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected ContentDefinitionAnnotations annotations;

	/**
	 * The cached value of the '{@link #getCombinedContent() <em>Combined Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedContent()
	 * @generated
	 * @ordered
	 */
	protected CombinedContentDefinition combinedContent;

	/**
	 * The cached value of the '{@link #getCodeBasedContent() <em>Code Based Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeBasedContent()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeBasedContentDefinition> codeBasedContent;

	/**
	 * The cached value of the '{@link #getPropertyBasedContent() <em>Property Based Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyBasedContent()
	 * @generated
	 * @ordered
	 */
	protected PropertyBasedContentDefinition propertyBasedContent;

	/**
	 * The cached value of the '{@link #getCodeFilterContent() <em>Code Filter Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeFilterContent()
	 * @generated
	 * @ordered
	 */
	protected CodeFilterContentDefinition codeFilterContent;

	/**
	 * The cached value of the '{@link #getNonComputableContent() <em>Non Computable Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonComputableContent()
	 * @generated
	 * @ordered
	 */
	protected NonComputableContentDefinition nonComputableContent;

	/**
	 * The cached value of the '{@link #getValueSetRef() <em>Value Set Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetRef()
	 * @generated
	 * @ordered
	 */
	protected VocabularyValueSetRef valueSetRef;

	/**
	 * The cached value of the '{@link #getAllowedQualifiers() <em>Allowed Qualifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipBasedContentDefinition> allowedQualifiers;

	/**
	 * The cached value of the '{@link #getProhibitedQualifiers() <em>Prohibited Qualifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProhibitedQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipBasedContentDefinition> prohibitedQualifiers;

	/**
	 * The default value of the '{@link #isAreBaseQualifiersUnlimited() <em>Are Base Qualifiers Unlimited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAreBaseQualifiersUnlimited()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARE_BASE_QUALIFIERS_UNLIMITED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAreBaseQualifiersUnlimited() <em>Are Base Qualifiers Unlimited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAreBaseQualifiersUnlimited()
	 * @generated
	 * @ordered
	 */
	protected boolean areBaseQualifiersUnlimited = ARE_BASE_QUALIFIERS_UNLIMITED_EDEFAULT;

	/**
	 * This is true if the Are Base Qualifiers Unlimited attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean areBaseQualifiersUnlimitedESet;

	/**
	 * The default value of the '{@link #getCodeSystem() <em>Code System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected String codeSystem = CODE_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionDate() <em>Version Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar VERSION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionDate() <em>Version Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar versionDate = VERSION_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CONTENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentDefinitionAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(ContentDefinitionAnnotations newAnnotations, NotificationChain msgs) {
		ContentDefinitionAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CONTENT_DEFINITION__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(ContentDefinitionAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONTENT_DEFINITION__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONTENT_DEFINITION__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONTENT_DEFINITION__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedContentDefinition getCombinedContent() {
		return combinedContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombinedContent(CombinedContentDefinition newCombinedContent, NotificationChain msgs) {
		CombinedContentDefinition oldCombinedContent = combinedContent;
		combinedContent = newCombinedContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CONTENT_DEFINITION__COMBINED_CONTENT, oldCombinedContent, newCombinedContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombinedContent(CombinedContentDefinition newCombinedContent) {
		if (newCombinedContent != combinedContent) {
			NotificationChain msgs = null;
			if (combinedContent != null)
				msgs = ((InternalEObject)combinedContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONTENT_DEFINITION__COMBINED_CONTENT, null, msgs);
			if (newCombinedContent != null)
				msgs = ((InternalEObject)newCombinedContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONTENT_DEFINITION__COMBINED_CONTENT, null, msgs);
			msgs = basicSetCombinedContent(newCombinedContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONTENT_DEFINITION__COMBINED_CONTENT, newCombinedContent, newCombinedContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeBasedContentDefinition> getCodeBasedContent() {
		if (codeBasedContent == null) {
			codeBasedContent = new EObjectContainmentEList<CodeBasedContentDefinition>(CodeBasedContentDefinition.class, this, Mif2Package.CONTENT_DEFINITION__CODE_BASED_CONTENT);
		}
		return codeBasedContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyBasedContentDefinition getPropertyBasedContent() {
		return propertyBasedContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyBasedContent(PropertyBasedContentDefinition newPropertyBasedContent, NotificationChain msgs) {
		PropertyBasedContentDefinition oldPropertyBasedContent = propertyBasedContent;
		propertyBasedContent = newPropertyBasedContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CONTENT_DEFINITION__PROPERTY_BASED_CONTENT, oldPropertyBasedContent, newPropertyBasedContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyBasedContent(PropertyBasedContentDefinition newPropertyBasedContent) {
		if (newPropertyBasedContent != propertyBasedContent) {
			NotificationChain msgs = null;
			if (propertyBasedContent != null)
				msgs = ((InternalEObject)propertyBasedContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONTENT_DEFINITION__PROPERTY_BASED_CONTENT, null, msgs);
			if (newPropertyBasedContent != null)
				msgs = ((InternalEObject)newPropertyBasedContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONTENT_DEFINITION__PROPERTY_BASED_CONTENT, null, msgs);
			msgs = basicSetPropertyBasedContent(newPropertyBasedContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONTENT_DEFINITION__PROPERTY_BASED_CONTENT, newPropertyBasedContent, newPropertyBasedContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeFilterContentDefinition getCodeFilterContent() {
		return codeFilterContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeFilterContent(CodeFilterContentDefinition newCodeFilterContent, NotificationChain msgs) {
		CodeFilterContentDefinition oldCodeFilterContent = codeFilterContent;
		codeFilterContent = newCodeFilterContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CONTENT_DEFINITION__CODE_FILTER_CONTENT, oldCodeFilterContent, newCodeFilterContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeFilterContent(CodeFilterContentDefinition newCodeFilterContent) {
		if (newCodeFilterContent != codeFilterContent) {
			NotificationChain msgs = null;
			if (codeFilterContent != null)
				msgs = ((InternalEObject)codeFilterContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONTENT_DEFINITION__CODE_FILTER_CONTENT, null, msgs);
			if (newCodeFilterContent != null)
				msgs = ((InternalEObject)newCodeFilterContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONTENT_DEFINITION__CODE_FILTER_CONTENT, null, msgs);
			msgs = basicSetCodeFilterContent(newCodeFilterContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONTENT_DEFINITION__CODE_FILTER_CONTENT, newCodeFilterContent, newCodeFilterContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonComputableContentDefinition getNonComputableContent() {
		return nonComputableContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonComputableContent(NonComputableContentDefinition newNonComputableContent, NotificationChain msgs) {
		NonComputableContentDefinition oldNonComputableContent = nonComputableContent;
		nonComputableContent = newNonComputableContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CONTENT_DEFINITION__NON_COMPUTABLE_CONTENT, oldNonComputableContent, newNonComputableContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonComputableContent(NonComputableContentDefinition newNonComputableContent) {
		if (newNonComputableContent != nonComputableContent) {
			NotificationChain msgs = null;
			if (nonComputableContent != null)
				msgs = ((InternalEObject)nonComputableContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONTENT_DEFINITION__NON_COMPUTABLE_CONTENT, null, msgs);
			if (newNonComputableContent != null)
				msgs = ((InternalEObject)newNonComputableContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONTENT_DEFINITION__NON_COMPUTABLE_CONTENT, null, msgs);
			msgs = basicSetNonComputableContent(newNonComputableContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONTENT_DEFINITION__NON_COMPUTABLE_CONTENT, newNonComputableContent, newNonComputableContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyValueSetRef getValueSetRef() {
		return valueSetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetRef(VocabularyValueSetRef newValueSetRef, NotificationChain msgs) {
		VocabularyValueSetRef oldValueSetRef = valueSetRef;
		valueSetRef = newValueSetRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CONTENT_DEFINITION__VALUE_SET_REF, oldValueSetRef, newValueSetRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetRef(VocabularyValueSetRef newValueSetRef) {
		if (newValueSetRef != valueSetRef) {
			NotificationChain msgs = null;
			if (valueSetRef != null)
				msgs = ((InternalEObject)valueSetRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONTENT_DEFINITION__VALUE_SET_REF, null, msgs);
			if (newValueSetRef != null)
				msgs = ((InternalEObject)newValueSetRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONTENT_DEFINITION__VALUE_SET_REF, null, msgs);
			msgs = basicSetValueSetRef(newValueSetRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONTENT_DEFINITION__VALUE_SET_REF, newValueSetRef, newValueSetRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationshipBasedContentDefinition> getAllowedQualifiers() {
		if (allowedQualifiers == null) {
			allowedQualifiers = new EObjectContainmentEList<RelationshipBasedContentDefinition>(RelationshipBasedContentDefinition.class, this, Mif2Package.CONTENT_DEFINITION__ALLOWED_QUALIFIERS);
		}
		return allowedQualifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationshipBasedContentDefinition> getProhibitedQualifiers() {
		if (prohibitedQualifiers == null) {
			prohibitedQualifiers = new EObjectContainmentEList<RelationshipBasedContentDefinition>(RelationshipBasedContentDefinition.class, this, Mif2Package.CONTENT_DEFINITION__PROHIBITED_QUALIFIERS);
		}
		return prohibitedQualifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAreBaseQualifiersUnlimited() {
		return areBaseQualifiersUnlimited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAreBaseQualifiersUnlimited(boolean newAreBaseQualifiersUnlimited) {
		boolean oldAreBaseQualifiersUnlimited = areBaseQualifiersUnlimited;
		areBaseQualifiersUnlimited = newAreBaseQualifiersUnlimited;
		boolean oldAreBaseQualifiersUnlimitedESet = areBaseQualifiersUnlimitedESet;
		areBaseQualifiersUnlimitedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONTENT_DEFINITION__ARE_BASE_QUALIFIERS_UNLIMITED, oldAreBaseQualifiersUnlimited, areBaseQualifiersUnlimited, !oldAreBaseQualifiersUnlimitedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAreBaseQualifiersUnlimited() {
		boolean oldAreBaseQualifiersUnlimited = areBaseQualifiersUnlimited;
		boolean oldAreBaseQualifiersUnlimitedESet = areBaseQualifiersUnlimitedESet;
		areBaseQualifiersUnlimited = ARE_BASE_QUALIFIERS_UNLIMITED_EDEFAULT;
		areBaseQualifiersUnlimitedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.CONTENT_DEFINITION__ARE_BASE_QUALIFIERS_UNLIMITED, oldAreBaseQualifiersUnlimited, ARE_BASE_QUALIFIERS_UNLIMITED_EDEFAULT, oldAreBaseQualifiersUnlimitedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAreBaseQualifiersUnlimited() {
		return areBaseQualifiersUnlimitedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeSystem() {
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystem(String newCodeSystem) {
		String oldCodeSystem = codeSystem;
		codeSystem = newCodeSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONTENT_DEFINITION__CODE_SYSTEM, oldCodeSystem, codeSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getVersionDate() {
		return versionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionDate(XMLGregorianCalendar newVersionDate) {
		XMLGregorianCalendar oldVersionDate = versionDate;
		versionDate = newVersionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONTENT_DEFINITION__VERSION_DATE, oldVersionDate, versionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CONTENT_DEFINITION__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.CONTENT_DEFINITION__COMBINED_CONTENT:
				return basicSetCombinedContent(null, msgs);
			case Mif2Package.CONTENT_DEFINITION__CODE_BASED_CONTENT:
				return ((InternalEList<?>)getCodeBasedContent()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONTENT_DEFINITION__PROPERTY_BASED_CONTENT:
				return basicSetPropertyBasedContent(null, msgs);
			case Mif2Package.CONTENT_DEFINITION__CODE_FILTER_CONTENT:
				return basicSetCodeFilterContent(null, msgs);
			case Mif2Package.CONTENT_DEFINITION__NON_COMPUTABLE_CONTENT:
				return basicSetNonComputableContent(null, msgs);
			case Mif2Package.CONTENT_DEFINITION__VALUE_SET_REF:
				return basicSetValueSetRef(null, msgs);
			case Mif2Package.CONTENT_DEFINITION__ALLOWED_QUALIFIERS:
				return ((InternalEList<?>)getAllowedQualifiers()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONTENT_DEFINITION__PROHIBITED_QUALIFIERS:
				return ((InternalEList<?>)getProhibitedQualifiers()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.CONTENT_DEFINITION__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.CONTENT_DEFINITION__COMBINED_CONTENT:
				return getCombinedContent();
			case Mif2Package.CONTENT_DEFINITION__CODE_BASED_CONTENT:
				return getCodeBasedContent();
			case Mif2Package.CONTENT_DEFINITION__PROPERTY_BASED_CONTENT:
				return getPropertyBasedContent();
			case Mif2Package.CONTENT_DEFINITION__CODE_FILTER_CONTENT:
				return getCodeFilterContent();
			case Mif2Package.CONTENT_DEFINITION__NON_COMPUTABLE_CONTENT:
				return getNonComputableContent();
			case Mif2Package.CONTENT_DEFINITION__VALUE_SET_REF:
				return getValueSetRef();
			case Mif2Package.CONTENT_DEFINITION__ALLOWED_QUALIFIERS:
				return getAllowedQualifiers();
			case Mif2Package.CONTENT_DEFINITION__PROHIBITED_QUALIFIERS:
				return getProhibitedQualifiers();
			case Mif2Package.CONTENT_DEFINITION__ARE_BASE_QUALIFIERS_UNLIMITED:
				return isAreBaseQualifiersUnlimited() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.CONTENT_DEFINITION__CODE_SYSTEM:
				return getCodeSystem();
			case Mif2Package.CONTENT_DEFINITION__VERSION_DATE:
				return getVersionDate();
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
			case Mif2Package.CONTENT_DEFINITION__ANNOTATIONS:
				setAnnotations((ContentDefinitionAnnotations)newValue);
				return;
			case Mif2Package.CONTENT_DEFINITION__COMBINED_CONTENT:
				setCombinedContent((CombinedContentDefinition)newValue);
				return;
			case Mif2Package.CONTENT_DEFINITION__CODE_BASED_CONTENT:
				getCodeBasedContent().clear();
				getCodeBasedContent().addAll((Collection<? extends CodeBasedContentDefinition>)newValue);
				return;
			case Mif2Package.CONTENT_DEFINITION__PROPERTY_BASED_CONTENT:
				setPropertyBasedContent((PropertyBasedContentDefinition)newValue);
				return;
			case Mif2Package.CONTENT_DEFINITION__CODE_FILTER_CONTENT:
				setCodeFilterContent((CodeFilterContentDefinition)newValue);
				return;
			case Mif2Package.CONTENT_DEFINITION__NON_COMPUTABLE_CONTENT:
				setNonComputableContent((NonComputableContentDefinition)newValue);
				return;
			case Mif2Package.CONTENT_DEFINITION__VALUE_SET_REF:
				setValueSetRef((VocabularyValueSetRef)newValue);
				return;
			case Mif2Package.CONTENT_DEFINITION__ALLOWED_QUALIFIERS:
				getAllowedQualifiers().clear();
				getAllowedQualifiers().addAll((Collection<? extends RelationshipBasedContentDefinition>)newValue);
				return;
			case Mif2Package.CONTENT_DEFINITION__PROHIBITED_QUALIFIERS:
				getProhibitedQualifiers().clear();
				getProhibitedQualifiers().addAll((Collection<? extends RelationshipBasedContentDefinition>)newValue);
				return;
			case Mif2Package.CONTENT_DEFINITION__ARE_BASE_QUALIFIERS_UNLIMITED:
				setAreBaseQualifiersUnlimited(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.CONTENT_DEFINITION__CODE_SYSTEM:
				setCodeSystem((String)newValue);
				return;
			case Mif2Package.CONTENT_DEFINITION__VERSION_DATE:
				setVersionDate((XMLGregorianCalendar)newValue);
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
			case Mif2Package.CONTENT_DEFINITION__ANNOTATIONS:
				setAnnotations((ContentDefinitionAnnotations)null);
				return;
			case Mif2Package.CONTENT_DEFINITION__COMBINED_CONTENT:
				setCombinedContent((CombinedContentDefinition)null);
				return;
			case Mif2Package.CONTENT_DEFINITION__CODE_BASED_CONTENT:
				getCodeBasedContent().clear();
				return;
			case Mif2Package.CONTENT_DEFINITION__PROPERTY_BASED_CONTENT:
				setPropertyBasedContent((PropertyBasedContentDefinition)null);
				return;
			case Mif2Package.CONTENT_DEFINITION__CODE_FILTER_CONTENT:
				setCodeFilterContent((CodeFilterContentDefinition)null);
				return;
			case Mif2Package.CONTENT_DEFINITION__NON_COMPUTABLE_CONTENT:
				setNonComputableContent((NonComputableContentDefinition)null);
				return;
			case Mif2Package.CONTENT_DEFINITION__VALUE_SET_REF:
				setValueSetRef((VocabularyValueSetRef)null);
				return;
			case Mif2Package.CONTENT_DEFINITION__ALLOWED_QUALIFIERS:
				getAllowedQualifiers().clear();
				return;
			case Mif2Package.CONTENT_DEFINITION__PROHIBITED_QUALIFIERS:
				getProhibitedQualifiers().clear();
				return;
			case Mif2Package.CONTENT_DEFINITION__ARE_BASE_QUALIFIERS_UNLIMITED:
				unsetAreBaseQualifiersUnlimited();
				return;
			case Mif2Package.CONTENT_DEFINITION__CODE_SYSTEM:
				setCodeSystem(CODE_SYSTEM_EDEFAULT);
				return;
			case Mif2Package.CONTENT_DEFINITION__VERSION_DATE:
				setVersionDate(VERSION_DATE_EDEFAULT);
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
			case Mif2Package.CONTENT_DEFINITION__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.CONTENT_DEFINITION__COMBINED_CONTENT:
				return combinedContent != null;
			case Mif2Package.CONTENT_DEFINITION__CODE_BASED_CONTENT:
				return codeBasedContent != null && !codeBasedContent.isEmpty();
			case Mif2Package.CONTENT_DEFINITION__PROPERTY_BASED_CONTENT:
				return propertyBasedContent != null;
			case Mif2Package.CONTENT_DEFINITION__CODE_FILTER_CONTENT:
				return codeFilterContent != null;
			case Mif2Package.CONTENT_DEFINITION__NON_COMPUTABLE_CONTENT:
				return nonComputableContent != null;
			case Mif2Package.CONTENT_DEFINITION__VALUE_SET_REF:
				return valueSetRef != null;
			case Mif2Package.CONTENT_DEFINITION__ALLOWED_QUALIFIERS:
				return allowedQualifiers != null && !allowedQualifiers.isEmpty();
			case Mif2Package.CONTENT_DEFINITION__PROHIBITED_QUALIFIERS:
				return prohibitedQualifiers != null && !prohibitedQualifiers.isEmpty();
			case Mif2Package.CONTENT_DEFINITION__ARE_BASE_QUALIFIERS_UNLIMITED:
				return isSetAreBaseQualifiersUnlimited();
			case Mif2Package.CONTENT_DEFINITION__CODE_SYSTEM:
				return CODE_SYSTEM_EDEFAULT == null ? codeSystem != null : !CODE_SYSTEM_EDEFAULT.equals(codeSystem);
			case Mif2Package.CONTENT_DEFINITION__VERSION_DATE:
				return VERSION_DATE_EDEFAULT == null ? versionDate != null : !VERSION_DATE_EDEFAULT.equals(versionDate);
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
		result.append(" (areBaseQualifiersUnlimited: ");
		if (areBaseQualifiersUnlimitedESet) result.append(areBaseQualifiersUnlimited); else result.append("<unset>");
		result.append(", codeSystem: ");
		result.append(codeSystem);
		result.append(", versionDate: ");
		result.append(versionDate);
		result.append(')');
		return result.toString();
	}

} //ContentDefinitionImpl
