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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.openhealthtools.mdht.emf.hl7.mif2.ConceptProperty;
import org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRefs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ValueSetVersionImpl#getUsesCodeSystemSupplement <em>Uses Code System Supplement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ValueSetVersionImpl#getSupportedCodeSystem <em>Supported Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ValueSetVersionImpl#getSupportedLanguage <em>Supported Language</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ValueSetVersionImpl#getAssociatedConceptProperty <em>Associated Concept Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ValueSetVersionImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ValueSetVersionImpl#getNonSelectableContent <em>Non Selectable Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ValueSetVersionImpl#getEnumeratedContent <em>Enumerated Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ValueSetVersionImpl#getExampleContent <em>Example Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ValueSetVersionImpl#getVersionDate <em>Version Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ValueSetVersionImpl#getVersionTime <em>Version Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueSetVersionImpl extends ModelElementImpl implements ValueSetVersion {
	/**
	 * The cached value of the '{@link #getUsesCodeSystemSupplement() <em>Uses Code System Supplement</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesCodeSystemSupplement()
	 * @generated
	 * @ordered
	 */
	protected EList<String> usesCodeSystemSupplement;

	/**
	 * The cached value of the '{@link #getSupportedCodeSystem() <em>Supported Code System</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supportedCodeSystem;

	/**
	 * The cached value of the '{@link #getSupportedLanguage() <em>Supported Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supportedLanguage;

	/**
	 * The cached value of the '{@link #getAssociatedConceptProperty() <em>Associated Concept Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedConceptProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptProperty> associatedConceptProperty;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected ContentDefinition content;

	/**
	 * The cached value of the '{@link #getNonSelectableContent() <em>Non Selectable Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonSelectableContent()
	 * @generated
	 * @ordered
	 */
	protected ContentDefinition nonSelectableContent;

	/**
	 * The cached value of the '{@link #getEnumeratedContent() <em>Enumerated Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeratedContent()
	 * @generated
	 * @ordered
	 */
	protected VocabularyCodeRefs enumeratedContent;

	/**
	 * The cached value of the '{@link #getExampleContent() <em>Example Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleContent()
	 * @generated
	 * @ordered
	 */
	protected VocabularyCodeRefs exampleContent;

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
	 * The default value of the '{@link #getVersionTime() <em>Version Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar VERSION_TIME_EDEFAULT = (XMLGregorianCalendar) XMLTypeFactory.eINSTANCE.createFromString(
		XMLTypePackage.eINSTANCE.getTime(), "00:00:00");

	/**
	 * The cached value of the '{@link #getVersionTime() <em>Version Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar versionTime = VERSION_TIME_EDEFAULT;

	/**
	 * This is true if the Version Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionTimeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.VALUE_SET_VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUsesCodeSystemSupplement() {
		if (usesCodeSystemSupplement == null) {
			usesCodeSystemSupplement = new EDataTypeEList<String>(
				String.class, this, Mif2Package.VALUE_SET_VERSION__USES_CODE_SYSTEM_SUPPLEMENT);
		}
		return usesCodeSystemSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSupportedCodeSystem() {
		if (supportedCodeSystem == null) {
			supportedCodeSystem = new EDataTypeEList<String>(
				String.class, this, Mif2Package.VALUE_SET_VERSION__SUPPORTED_CODE_SYSTEM);
		}
		return supportedCodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSupportedLanguage() {
		if (supportedLanguage == null) {
			supportedLanguage = new EDataTypeEList<String>(
				String.class, this, Mif2Package.VALUE_SET_VERSION__SUPPORTED_LANGUAGE);
		}
		return supportedLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptProperty> getAssociatedConceptProperty() {
		if (associatedConceptProperty == null) {
			associatedConceptProperty = new EObjectContainmentEList<ConceptProperty>(
				ConceptProperty.class, this, Mif2Package.VALUE_SET_VERSION__ASSOCIATED_CONCEPT_PROPERTY);
		}
		return associatedConceptProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentDefinition getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(ContentDefinition newContent, NotificationChain msgs) {
		ContentDefinition oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.VALUE_SET_VERSION__CONTENT, oldContent, newContent);
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
	public void setContent(ContentDefinition newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null) {
				msgs = ((InternalEObject) content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.VALUE_SET_VERSION__CONTENT, null, msgs);
			}
			if (newContent != null) {
				msgs = ((InternalEObject) newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.VALUE_SET_VERSION__CONTENT, null, msgs);
			}
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.VALUE_SET_VERSION__CONTENT, newContent, newContent));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentDefinition getNonSelectableContent() {
		return nonSelectableContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonSelectableContent(ContentDefinition newNonSelectableContent,
			NotificationChain msgs) {
		ContentDefinition oldNonSelectableContent = nonSelectableContent;
		nonSelectableContent = newNonSelectableContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.VALUE_SET_VERSION__NON_SELECTABLE_CONTENT, oldNonSelectableContent,
				newNonSelectableContent);
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
	public void setNonSelectableContent(ContentDefinition newNonSelectableContent) {
		if (newNonSelectableContent != nonSelectableContent) {
			NotificationChain msgs = null;
			if (nonSelectableContent != null) {
				msgs = ((InternalEObject) nonSelectableContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.VALUE_SET_VERSION__NON_SELECTABLE_CONTENT, null, msgs);
			}
			if (newNonSelectableContent != null) {
				msgs = ((InternalEObject) newNonSelectableContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.VALUE_SET_VERSION__NON_SELECTABLE_CONTENT, null, msgs);
			}
			msgs = basicSetNonSelectableContent(newNonSelectableContent, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.VALUE_SET_VERSION__NON_SELECTABLE_CONTENT, newNonSelectableContent,
				newNonSelectableContent));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyCodeRefs getEnumeratedContent() {
		return enumeratedContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumeratedContent(VocabularyCodeRefs newEnumeratedContent, NotificationChain msgs) {
		VocabularyCodeRefs oldEnumeratedContent = enumeratedContent;
		enumeratedContent = newEnumeratedContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.VALUE_SET_VERSION__ENUMERATED_CONTENT, oldEnumeratedContent,
				newEnumeratedContent);
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
	public void setEnumeratedContent(VocabularyCodeRefs newEnumeratedContent) {
		if (newEnumeratedContent != enumeratedContent) {
			NotificationChain msgs = null;
			if (enumeratedContent != null) {
				msgs = ((InternalEObject) enumeratedContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.VALUE_SET_VERSION__ENUMERATED_CONTENT, null, msgs);
			}
			if (newEnumeratedContent != null) {
				msgs = ((InternalEObject) newEnumeratedContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.VALUE_SET_VERSION__ENUMERATED_CONTENT, null, msgs);
			}
			msgs = basicSetEnumeratedContent(newEnumeratedContent, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.VALUE_SET_VERSION__ENUMERATED_CONTENT, newEnumeratedContent,
				newEnumeratedContent));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyCodeRefs getExampleContent() {
		return exampleContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleContent(VocabularyCodeRefs newExampleContent, NotificationChain msgs) {
		VocabularyCodeRefs oldExampleContent = exampleContent;
		exampleContent = newExampleContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.VALUE_SET_VERSION__EXAMPLE_CONTENT, oldExampleContent,
				newExampleContent);
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
	public void setExampleContent(VocabularyCodeRefs newExampleContent) {
		if (newExampleContent != exampleContent) {
			NotificationChain msgs = null;
			if (exampleContent != null) {
				msgs = ((InternalEObject) exampleContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.VALUE_SET_VERSION__EXAMPLE_CONTENT, null, msgs);
			}
			if (newExampleContent != null) {
				msgs = ((InternalEObject) newExampleContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.VALUE_SET_VERSION__EXAMPLE_CONTENT, null, msgs);
			}
			msgs = basicSetExampleContent(newExampleContent, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.VALUE_SET_VERSION__EXAMPLE_CONTENT, newExampleContent,
				newExampleContent));
		}
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.VALUE_SET_VERSION__VERSION_DATE, oldVersionDate, versionDate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getVersionTime() {
		return versionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionTime(XMLGregorianCalendar newVersionTime) {
		XMLGregorianCalendar oldVersionTime = versionTime;
		versionTime = newVersionTime;
		boolean oldVersionTimeESet = versionTimeESet;
		versionTimeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.VALUE_SET_VERSION__VERSION_TIME, oldVersionTime, versionTime,
				!oldVersionTimeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersionTime() {
		XMLGregorianCalendar oldVersionTime = versionTime;
		boolean oldVersionTimeESet = versionTimeESet;
		versionTime = VERSION_TIME_EDEFAULT;
		versionTimeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.VALUE_SET_VERSION__VERSION_TIME, oldVersionTime,
				VERSION_TIME_EDEFAULT, oldVersionTimeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersionTime() {
		return versionTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.VALUE_SET_VERSION__ASSOCIATED_CONCEPT_PROPERTY:
				return ((InternalEList<?>) getAssociatedConceptProperty()).basicRemove(otherEnd, msgs);
			case Mif2Package.VALUE_SET_VERSION__CONTENT:
				return basicSetContent(null, msgs);
			case Mif2Package.VALUE_SET_VERSION__NON_SELECTABLE_CONTENT:
				return basicSetNonSelectableContent(null, msgs);
			case Mif2Package.VALUE_SET_VERSION__ENUMERATED_CONTENT:
				return basicSetEnumeratedContent(null, msgs);
			case Mif2Package.VALUE_SET_VERSION__EXAMPLE_CONTENT:
				return basicSetExampleContent(null, msgs);
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
			case Mif2Package.VALUE_SET_VERSION__USES_CODE_SYSTEM_SUPPLEMENT:
				return getUsesCodeSystemSupplement();
			case Mif2Package.VALUE_SET_VERSION__SUPPORTED_CODE_SYSTEM:
				return getSupportedCodeSystem();
			case Mif2Package.VALUE_SET_VERSION__SUPPORTED_LANGUAGE:
				return getSupportedLanguage();
			case Mif2Package.VALUE_SET_VERSION__ASSOCIATED_CONCEPT_PROPERTY:
				return getAssociatedConceptProperty();
			case Mif2Package.VALUE_SET_VERSION__CONTENT:
				return getContent();
			case Mif2Package.VALUE_SET_VERSION__NON_SELECTABLE_CONTENT:
				return getNonSelectableContent();
			case Mif2Package.VALUE_SET_VERSION__ENUMERATED_CONTENT:
				return getEnumeratedContent();
			case Mif2Package.VALUE_SET_VERSION__EXAMPLE_CONTENT:
				return getExampleContent();
			case Mif2Package.VALUE_SET_VERSION__VERSION_DATE:
				return getVersionDate();
			case Mif2Package.VALUE_SET_VERSION__VERSION_TIME:
				return getVersionTime();
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
			case Mif2Package.VALUE_SET_VERSION__USES_CODE_SYSTEM_SUPPLEMENT:
				getUsesCodeSystemSupplement().clear();
				getUsesCodeSystemSupplement().addAll((Collection<? extends String>) newValue);
				return;
			case Mif2Package.VALUE_SET_VERSION__SUPPORTED_CODE_SYSTEM:
				getSupportedCodeSystem().clear();
				getSupportedCodeSystem().addAll((Collection<? extends String>) newValue);
				return;
			case Mif2Package.VALUE_SET_VERSION__SUPPORTED_LANGUAGE:
				getSupportedLanguage().clear();
				getSupportedLanguage().addAll((Collection<? extends String>) newValue);
				return;
			case Mif2Package.VALUE_SET_VERSION__ASSOCIATED_CONCEPT_PROPERTY:
				getAssociatedConceptProperty().clear();
				getAssociatedConceptProperty().addAll((Collection<? extends ConceptProperty>) newValue);
				return;
			case Mif2Package.VALUE_SET_VERSION__CONTENT:
				setContent((ContentDefinition) newValue);
				return;
			case Mif2Package.VALUE_SET_VERSION__NON_SELECTABLE_CONTENT:
				setNonSelectableContent((ContentDefinition) newValue);
				return;
			case Mif2Package.VALUE_SET_VERSION__ENUMERATED_CONTENT:
				setEnumeratedContent((VocabularyCodeRefs) newValue);
				return;
			case Mif2Package.VALUE_SET_VERSION__EXAMPLE_CONTENT:
				setExampleContent((VocabularyCodeRefs) newValue);
				return;
			case Mif2Package.VALUE_SET_VERSION__VERSION_DATE:
				setVersionDate((XMLGregorianCalendar) newValue);
				return;
			case Mif2Package.VALUE_SET_VERSION__VERSION_TIME:
				setVersionTime((XMLGregorianCalendar) newValue);
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
			case Mif2Package.VALUE_SET_VERSION__USES_CODE_SYSTEM_SUPPLEMENT:
				getUsesCodeSystemSupplement().clear();
				return;
			case Mif2Package.VALUE_SET_VERSION__SUPPORTED_CODE_SYSTEM:
				getSupportedCodeSystem().clear();
				return;
			case Mif2Package.VALUE_SET_VERSION__SUPPORTED_LANGUAGE:
				getSupportedLanguage().clear();
				return;
			case Mif2Package.VALUE_SET_VERSION__ASSOCIATED_CONCEPT_PROPERTY:
				getAssociatedConceptProperty().clear();
				return;
			case Mif2Package.VALUE_SET_VERSION__CONTENT:
				setContent((ContentDefinition) null);
				return;
			case Mif2Package.VALUE_SET_VERSION__NON_SELECTABLE_CONTENT:
				setNonSelectableContent((ContentDefinition) null);
				return;
			case Mif2Package.VALUE_SET_VERSION__ENUMERATED_CONTENT:
				setEnumeratedContent((VocabularyCodeRefs) null);
				return;
			case Mif2Package.VALUE_SET_VERSION__EXAMPLE_CONTENT:
				setExampleContent((VocabularyCodeRefs) null);
				return;
			case Mif2Package.VALUE_SET_VERSION__VERSION_DATE:
				setVersionDate(VERSION_DATE_EDEFAULT);
				return;
			case Mif2Package.VALUE_SET_VERSION__VERSION_TIME:
				unsetVersionTime();
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
			case Mif2Package.VALUE_SET_VERSION__USES_CODE_SYSTEM_SUPPLEMENT:
				return usesCodeSystemSupplement != null && !usesCodeSystemSupplement.isEmpty();
			case Mif2Package.VALUE_SET_VERSION__SUPPORTED_CODE_SYSTEM:
				return supportedCodeSystem != null && !supportedCodeSystem.isEmpty();
			case Mif2Package.VALUE_SET_VERSION__SUPPORTED_LANGUAGE:
				return supportedLanguage != null && !supportedLanguage.isEmpty();
			case Mif2Package.VALUE_SET_VERSION__ASSOCIATED_CONCEPT_PROPERTY:
				return associatedConceptProperty != null && !associatedConceptProperty.isEmpty();
			case Mif2Package.VALUE_SET_VERSION__CONTENT:
				return content != null;
			case Mif2Package.VALUE_SET_VERSION__NON_SELECTABLE_CONTENT:
				return nonSelectableContent != null;
			case Mif2Package.VALUE_SET_VERSION__ENUMERATED_CONTENT:
				return enumeratedContent != null;
			case Mif2Package.VALUE_SET_VERSION__EXAMPLE_CONTENT:
				return exampleContent != null;
			case Mif2Package.VALUE_SET_VERSION__VERSION_DATE:
				return VERSION_DATE_EDEFAULT == null
						? versionDate != null
						: !VERSION_DATE_EDEFAULT.equals(versionDate);
			case Mif2Package.VALUE_SET_VERSION__VERSION_TIME:
				return isSetVersionTime();
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
		result.append(" (usesCodeSystemSupplement: ");
		result.append(usesCodeSystemSupplement);
		result.append(", supportedCodeSystem: ");
		result.append(supportedCodeSystem);
		result.append(", supportedLanguage: ");
		result.append(supportedLanguage);
		result.append(", versionDate: ");
		result.append(versionDate);
		result.append(", versionTime: ");
		if (versionTimeESet) {
			result.append(versionTime);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // ValueSetVersionImpl
