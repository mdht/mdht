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

import org.openhealthtools.mdht.emf.hl7.mif2.ConceptRef;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationshipKind;
import org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.Reflexivity;
import org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship;
import org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty;
import org.openhealthtools.mdht.emf.hl7.mif2.Symmetry;
import org.openhealthtools.mdht.emf.hl7.mif2.Transitivity;
import org.openhealthtools.mdht.emf.w3c.xhtml.Inline;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supported Concept Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedConceptRelationshipImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedConceptRelationshipImpl#getAllowedForSources <em>Allowed For Sources</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedConceptRelationshipImpl#getAllowedForTargets <em>Allowed For Targets</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedConceptRelationshipImpl#getRequiredForSources <em>Required For Sources</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedConceptRelationshipImpl#getRequiredForTargets <em>Required For Targets</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedConceptRelationshipImpl#getSupportedProperty <em>Supported Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedConceptRelationshipImpl#getDefiningConcept <em>Defining Concept</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedConceptRelationshipImpl#isFunctionalism <em>Functionalism</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedConceptRelationshipImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedConceptRelationshipImpl#getInverseName <em>Inverse Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedConceptRelationshipImpl#isIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedConceptRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedConceptRelationshipImpl#getReflexivity <em>Reflexivity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedConceptRelationshipImpl#getRelationshipKind <em>Relationship Kind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedConceptRelationshipImpl#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SupportedConceptRelationshipImpl#getTransitivity <em>Transitivity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupportedConceptRelationshipImpl extends EObjectImpl implements SupportedConceptRelationship {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Inline description;

	/**
	 * The cached value of the '{@link #getAllowedForSources() <em>Allowed For Sources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedForSources()
	 * @generated
	 * @ordered
	 */
	protected ContentDefinition allowedForSources;

	/**
	 * The cached value of the '{@link #getAllowedForTargets() <em>Allowed For Targets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedForTargets()
	 * @generated
	 * @ordered
	 */
	protected ContentDefinition allowedForTargets;

	/**
	 * The cached value of the '{@link #getRequiredForSources() <em>Required For Sources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredForSources()
	 * @generated
	 * @ordered
	 */
	protected ContentDefinition requiredForSources;

	/**
	 * The cached value of the '{@link #getRequiredForTargets() <em>Required For Targets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredForTargets()
	 * @generated
	 * @ordered
	 */
	protected ContentDefinition requiredForTargets;

	/**
	 * The cached value of the '{@link #getSupportedProperty() <em>Supported Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportedProperty> supportedProperty;

	/**
	 * The cached value of the '{@link #getDefiningConcept() <em>Defining Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningConcept()
	 * @generated
	 * @ordered
	 */
	protected ConceptRef definingConcept;

	/**
	 * The default value of the '{@link #isFunctionalism() <em>Functionalism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFunctionalism()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FUNCTIONALISM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFunctionalism() <em>Functionalism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFunctionalism()
	 * @generated
	 * @ordered
	 */
	protected boolean functionalism = FUNCTIONALISM_EDEFAULT;

	/**
	 * This is true if the Functionalism attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean functionalismESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInverseName() <em>Inverse Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseName()
	 * @generated
	 * @ordered
	 */
	protected static final String INVERSE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInverseName() <em>Inverse Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseName()
	 * @generated
	 * @ordered
	 */
	protected String inverseName = INVERSE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNavigable() <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NAVIGABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsNavigable() <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected boolean isNavigable = IS_NAVIGABLE_EDEFAULT;

	/**
	 * This is true if the Is Navigable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isNavigableESet;

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
	 * The default value of the '{@link #getReflexivity() <em>Reflexivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflexivity()
	 * @generated
	 * @ordered
	 */
	protected static final Reflexivity REFLEXIVITY_EDEFAULT = Reflexivity.REFLEXIVE;

	/**
	 * The cached value of the '{@link #getReflexivity() <em>Reflexivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflexivity()
	 * @generated
	 * @ordered
	 */
	protected Reflexivity reflexivity = REFLEXIVITY_EDEFAULT;

	/**
	 * This is true if the Reflexivity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reflexivityESet;

	/**
	 * The default value of the '{@link #getRelationshipKind() <em>Relationship Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipKind()
	 * @generated
	 * @ordered
	 */
	protected static final ConceptRelationshipKind RELATIONSHIP_KIND_EDEFAULT = ConceptRelationshipKind.SPECIALIZES;

	/**
	 * The cached value of the '{@link #getRelationshipKind() <em>Relationship Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipKind()
	 * @generated
	 * @ordered
	 */
	protected ConceptRelationshipKind relationshipKind = RELATIONSHIP_KIND_EDEFAULT;

	/**
	 * This is true if the Relationship Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relationshipKindESet;

	/**
	 * The default value of the '{@link #getSymmetry() <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected static final Symmetry SYMMETRY_EDEFAULT = Symmetry.SYMMETRIC;

	/**
	 * The cached value of the '{@link #getSymmetry() <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected Symmetry symmetry = SYMMETRY_EDEFAULT;

	/**
	 * This is true if the Symmetry attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean symmetryESet;

	/**
	 * The default value of the '{@link #getTransitivity() <em>Transitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitivity()
	 * @generated
	 * @ordered
	 */
	protected static final Transitivity TRANSITIVITY_EDEFAULT = Transitivity.TRANSITIVE;

	/**
	 * The cached value of the '{@link #getTransitivity() <em>Transitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitivity()
	 * @generated
	 * @ordered
	 */
	protected Transitivity transitivity = TRANSITIVITY_EDEFAULT;

	/**
	 * This is true if the Transitivity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transitivityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportedConceptRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.SUPPORTED_CONCEPT_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inline getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Inline newDescription, NotificationChain msgs) {
		Inline oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Inline newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentDefinition getAllowedForSources() {
		return allowedForSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowedForSources(ContentDefinition newAllowedForSources, NotificationChain msgs) {
		ContentDefinition oldAllowedForSources = allowedForSources;
		allowedForSources = newAllowedForSources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ALLOWED_FOR_SOURCES, oldAllowedForSources, newAllowedForSources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedForSources(ContentDefinition newAllowedForSources) {
		if (newAllowedForSources != allowedForSources) {
			NotificationChain msgs = null;
			if (allowedForSources != null)
				msgs = ((InternalEObject)allowedForSources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ALLOWED_FOR_SOURCES, null, msgs);
			if (newAllowedForSources != null)
				msgs = ((InternalEObject)newAllowedForSources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ALLOWED_FOR_SOURCES, null, msgs);
			msgs = basicSetAllowedForSources(newAllowedForSources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ALLOWED_FOR_SOURCES, newAllowedForSources, newAllowedForSources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentDefinition getAllowedForTargets() {
		return allowedForTargets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowedForTargets(ContentDefinition newAllowedForTargets, NotificationChain msgs) {
		ContentDefinition oldAllowedForTargets = allowedForTargets;
		allowedForTargets = newAllowedForTargets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ALLOWED_FOR_TARGETS, oldAllowedForTargets, newAllowedForTargets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedForTargets(ContentDefinition newAllowedForTargets) {
		if (newAllowedForTargets != allowedForTargets) {
			NotificationChain msgs = null;
			if (allowedForTargets != null)
				msgs = ((InternalEObject)allowedForTargets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ALLOWED_FOR_TARGETS, null, msgs);
			if (newAllowedForTargets != null)
				msgs = ((InternalEObject)newAllowedForTargets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ALLOWED_FOR_TARGETS, null, msgs);
			msgs = basicSetAllowedForTargets(newAllowedForTargets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ALLOWED_FOR_TARGETS, newAllowedForTargets, newAllowedForTargets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentDefinition getRequiredForSources() {
		return requiredForSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredForSources(ContentDefinition newRequiredForSources, NotificationChain msgs) {
		ContentDefinition oldRequiredForSources = requiredForSources;
		requiredForSources = newRequiredForSources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REQUIRED_FOR_SOURCES, oldRequiredForSources, newRequiredForSources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredForSources(ContentDefinition newRequiredForSources) {
		if (newRequiredForSources != requiredForSources) {
			NotificationChain msgs = null;
			if (requiredForSources != null)
				msgs = ((InternalEObject)requiredForSources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REQUIRED_FOR_SOURCES, null, msgs);
			if (newRequiredForSources != null)
				msgs = ((InternalEObject)newRequiredForSources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REQUIRED_FOR_SOURCES, null, msgs);
			msgs = basicSetRequiredForSources(newRequiredForSources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REQUIRED_FOR_SOURCES, newRequiredForSources, newRequiredForSources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentDefinition getRequiredForTargets() {
		return requiredForTargets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredForTargets(ContentDefinition newRequiredForTargets, NotificationChain msgs) {
		ContentDefinition oldRequiredForTargets = requiredForTargets;
		requiredForTargets = newRequiredForTargets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REQUIRED_FOR_TARGETS, oldRequiredForTargets, newRequiredForTargets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredForTargets(ContentDefinition newRequiredForTargets) {
		if (newRequiredForTargets != requiredForTargets) {
			NotificationChain msgs = null;
			if (requiredForTargets != null)
				msgs = ((InternalEObject)requiredForTargets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REQUIRED_FOR_TARGETS, null, msgs);
			if (newRequiredForTargets != null)
				msgs = ((InternalEObject)newRequiredForTargets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REQUIRED_FOR_TARGETS, null, msgs);
			msgs = basicSetRequiredForTargets(newRequiredForTargets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REQUIRED_FOR_TARGETS, newRequiredForTargets, newRequiredForTargets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportedProperty> getSupportedProperty() {
		if (supportedProperty == null) {
			supportedProperty = new EObjectContainmentEList<SupportedProperty>(SupportedProperty.class, this, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__SUPPORTED_PROPERTY);
		}
		return supportedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptRef getDefiningConcept() {
		return definingConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefiningConcept(ConceptRef newDefiningConcept, NotificationChain msgs) {
		ConceptRef oldDefiningConcept = definingConcept;
		definingConcept = newDefiningConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__DEFINING_CONCEPT, oldDefiningConcept, newDefiningConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefiningConcept(ConceptRef newDefiningConcept) {
		if (newDefiningConcept != definingConcept) {
			NotificationChain msgs = null;
			if (definingConcept != null)
				msgs = ((InternalEObject)definingConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__DEFINING_CONCEPT, null, msgs);
			if (newDefiningConcept != null)
				msgs = ((InternalEObject)newDefiningConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__DEFINING_CONCEPT, null, msgs);
			msgs = basicSetDefiningConcept(newDefiningConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__DEFINING_CONCEPT, newDefiningConcept, newDefiningConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFunctionalism() {
		return functionalism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionalism(boolean newFunctionalism) {
		boolean oldFunctionalism = functionalism;
		functionalism = newFunctionalism;
		boolean oldFunctionalismESet = functionalismESet;
		functionalismESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__FUNCTIONALISM, oldFunctionalism, functionalism, !oldFunctionalismESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFunctionalism() {
		boolean oldFunctionalism = functionalism;
		boolean oldFunctionalismESet = functionalismESet;
		functionalism = FUNCTIONALISM_EDEFAULT;
		functionalismESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__FUNCTIONALISM, oldFunctionalism, FUNCTIONALISM_EDEFAULT, oldFunctionalismESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFunctionalism() {
		return functionalismESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInverseName() {
		return inverseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverseName(String newInverseName) {
		String oldInverseName = inverseName;
		inverseName = newInverseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__INVERSE_NAME, oldInverseName, inverseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNavigable() {
		return isNavigable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNavigable(boolean newIsNavigable) {
		boolean oldIsNavigable = isNavigable;
		isNavigable = newIsNavigable;
		boolean oldIsNavigableESet = isNavigableESet;
		isNavigableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__IS_NAVIGABLE, oldIsNavigable, isNavigable, !oldIsNavigableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsNavigable() {
		boolean oldIsNavigable = isNavigable;
		boolean oldIsNavigableESet = isNavigableESet;
		isNavigable = IS_NAVIGABLE_EDEFAULT;
		isNavigableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__IS_NAVIGABLE, oldIsNavigable, IS_NAVIGABLE_EDEFAULT, oldIsNavigableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsNavigable() {
		return isNavigableESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reflexivity getReflexivity() {
		return reflexivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReflexivity(Reflexivity newReflexivity) {
		Reflexivity oldReflexivity = reflexivity;
		reflexivity = newReflexivity == null ? REFLEXIVITY_EDEFAULT : newReflexivity;
		boolean oldReflexivityESet = reflexivityESet;
		reflexivityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REFLEXIVITY, oldReflexivity, reflexivity, !oldReflexivityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReflexivity() {
		Reflexivity oldReflexivity = reflexivity;
		boolean oldReflexivityESet = reflexivityESet;
		reflexivity = REFLEXIVITY_EDEFAULT;
		reflexivityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REFLEXIVITY, oldReflexivity, REFLEXIVITY_EDEFAULT, oldReflexivityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReflexivity() {
		return reflexivityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptRelationshipKind getRelationshipKind() {
		return relationshipKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipKind(ConceptRelationshipKind newRelationshipKind) {
		ConceptRelationshipKind oldRelationshipKind = relationshipKind;
		relationshipKind = newRelationshipKind == null ? RELATIONSHIP_KIND_EDEFAULT : newRelationshipKind;
		boolean oldRelationshipKindESet = relationshipKindESet;
		relationshipKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__RELATIONSHIP_KIND, oldRelationshipKind, relationshipKind, !oldRelationshipKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelationshipKind() {
		ConceptRelationshipKind oldRelationshipKind = relationshipKind;
		boolean oldRelationshipKindESet = relationshipKindESet;
		relationshipKind = RELATIONSHIP_KIND_EDEFAULT;
		relationshipKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__RELATIONSHIP_KIND, oldRelationshipKind, RELATIONSHIP_KIND_EDEFAULT, oldRelationshipKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelationshipKind() {
		return relationshipKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symmetry getSymmetry() {
		return symmetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymmetry(Symmetry newSymmetry) {
		Symmetry oldSymmetry = symmetry;
		symmetry = newSymmetry == null ? SYMMETRY_EDEFAULT : newSymmetry;
		boolean oldSymmetryESet = symmetryESet;
		symmetryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__SYMMETRY, oldSymmetry, symmetry, !oldSymmetryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSymmetry() {
		Symmetry oldSymmetry = symmetry;
		boolean oldSymmetryESet = symmetryESet;
		symmetry = SYMMETRY_EDEFAULT;
		symmetryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__SYMMETRY, oldSymmetry, SYMMETRY_EDEFAULT, oldSymmetryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSymmetry() {
		return symmetryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transitivity getTransitivity() {
		return transitivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitivity(Transitivity newTransitivity) {
		Transitivity oldTransitivity = transitivity;
		transitivity = newTransitivity == null ? TRANSITIVITY_EDEFAULT : newTransitivity;
		boolean oldTransitivityESet = transitivityESet;
		transitivityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__TRANSITIVITY, oldTransitivity, transitivity, !oldTransitivityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransitivity() {
		Transitivity oldTransitivity = transitivity;
		boolean oldTransitivityESet = transitivityESet;
		transitivity = TRANSITIVITY_EDEFAULT;
		transitivityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__TRANSITIVITY, oldTransitivity, TRANSITIVITY_EDEFAULT, oldTransitivityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransitivity() {
		return transitivityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ALLOWED_FOR_SOURCES:
				return basicSetAllowedForSources(null, msgs);
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ALLOWED_FOR_TARGETS:
				return basicSetAllowedForTargets(null, msgs);
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REQUIRED_FOR_SOURCES:
				return basicSetRequiredForSources(null, msgs);
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REQUIRED_FOR_TARGETS:
				return basicSetRequiredForTargets(null, msgs);
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__SUPPORTED_PROPERTY:
				return ((InternalEList<?>)getSupportedProperty()).basicRemove(otherEnd, msgs);
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__DEFINING_CONCEPT:
				return basicSetDefiningConcept(null, msgs);
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
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__DESCRIPTION:
				return getDescription();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ALLOWED_FOR_SOURCES:
				return getAllowedForSources();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ALLOWED_FOR_TARGETS:
				return getAllowedForTargets();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REQUIRED_FOR_SOURCES:
				return getRequiredForSources();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REQUIRED_FOR_TARGETS:
				return getRequiredForTargets();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__SUPPORTED_PROPERTY:
				return getSupportedProperty();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__DEFINING_CONCEPT:
				return getDefiningConcept();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__FUNCTIONALISM:
				return isFunctionalism() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ID:
				return getId();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__INVERSE_NAME:
				return getInverseName();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__IS_NAVIGABLE:
				return isIsNavigable() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__NAME:
				return getName();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REFLEXIVITY:
				return getReflexivity();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__RELATIONSHIP_KIND:
				return getRelationshipKind();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__SYMMETRY:
				return getSymmetry();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__TRANSITIVITY:
				return getTransitivity();
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
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__DESCRIPTION:
				setDescription((Inline)newValue);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ALLOWED_FOR_SOURCES:
				setAllowedForSources((ContentDefinition)newValue);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ALLOWED_FOR_TARGETS:
				setAllowedForTargets((ContentDefinition)newValue);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REQUIRED_FOR_SOURCES:
				setRequiredForSources((ContentDefinition)newValue);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REQUIRED_FOR_TARGETS:
				setRequiredForTargets((ContentDefinition)newValue);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__SUPPORTED_PROPERTY:
				getSupportedProperty().clear();
				getSupportedProperty().addAll((Collection<? extends SupportedProperty>)newValue);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__DEFINING_CONCEPT:
				setDefiningConcept((ConceptRef)newValue);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__FUNCTIONALISM:
				setFunctionalism(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ID:
				setId((String)newValue);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__INVERSE_NAME:
				setInverseName((String)newValue);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__IS_NAVIGABLE:
				setIsNavigable(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REFLEXIVITY:
				setReflexivity((Reflexivity)newValue);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__RELATIONSHIP_KIND:
				setRelationshipKind((ConceptRelationshipKind)newValue);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__SYMMETRY:
				setSymmetry((Symmetry)newValue);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__TRANSITIVITY:
				setTransitivity((Transitivity)newValue);
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
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__DESCRIPTION:
				setDescription((Inline)null);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ALLOWED_FOR_SOURCES:
				setAllowedForSources((ContentDefinition)null);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ALLOWED_FOR_TARGETS:
				setAllowedForTargets((ContentDefinition)null);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REQUIRED_FOR_SOURCES:
				setRequiredForSources((ContentDefinition)null);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REQUIRED_FOR_TARGETS:
				setRequiredForTargets((ContentDefinition)null);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__SUPPORTED_PROPERTY:
				getSupportedProperty().clear();
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__DEFINING_CONCEPT:
				setDefiningConcept((ConceptRef)null);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__FUNCTIONALISM:
				unsetFunctionalism();
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ID:
				setId(ID_EDEFAULT);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__INVERSE_NAME:
				setInverseName(INVERSE_NAME_EDEFAULT);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__IS_NAVIGABLE:
				unsetIsNavigable();
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REFLEXIVITY:
				unsetReflexivity();
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__RELATIONSHIP_KIND:
				unsetRelationshipKind();
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__SYMMETRY:
				unsetSymmetry();
				return;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__TRANSITIVITY:
				unsetTransitivity();
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
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__DESCRIPTION:
				return description != null;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ALLOWED_FOR_SOURCES:
				return allowedForSources != null;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ALLOWED_FOR_TARGETS:
				return allowedForTargets != null;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REQUIRED_FOR_SOURCES:
				return requiredForSources != null;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REQUIRED_FOR_TARGETS:
				return requiredForTargets != null;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__SUPPORTED_PROPERTY:
				return supportedProperty != null && !supportedProperty.isEmpty();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__DEFINING_CONCEPT:
				return definingConcept != null;
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__FUNCTIONALISM:
				return isSetFunctionalism();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__INVERSE_NAME:
				return INVERSE_NAME_EDEFAULT == null ? inverseName != null : !INVERSE_NAME_EDEFAULT.equals(inverseName);
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__IS_NAVIGABLE:
				return isSetIsNavigable();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__REFLEXIVITY:
				return isSetReflexivity();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__RELATIONSHIP_KIND:
				return isSetRelationshipKind();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__SYMMETRY:
				return isSetSymmetry();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP__TRANSITIVITY:
				return isSetTransitivity();
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
		result.append(" (functionalism: ");
		if (functionalismESet) result.append(functionalism); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", inverseName: ");
		result.append(inverseName);
		result.append(", isNavigable: ");
		if (isNavigableESet) result.append(isNavigable); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", reflexivity: ");
		if (reflexivityESet) result.append(reflexivity); else result.append("<unset>");
		result.append(", relationshipKind: ");
		if (relationshipKindESet) result.append(relationshipKind); else result.append("<unset>");
		result.append(", symmetry: ");
		if (symmetryESet) result.append(symmetry); else result.append("<unset>");
		result.append(", transitivity: ");
		if (transitivityESet) result.append(transitivity); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SupportedConceptRelationshipImpl
