/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GuideResourcePurpose;
import org.hl7.fhir.ImplementationGuideResource;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getSourceUri <em>Source Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideResourceImpl#getExampleFor <em>Example For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuideResourceImpl extends BackboneElementImpl implements ImplementationGuideResource {
	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected GuideResourcePurpose purpose;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getAcronym() <em>Acronym</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcronym()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String acronym;

	/**
	 * The cached value of the '{@link #getSourceUri() <em>Source Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUri()
	 * @generated
	 * @ordered
	 */
	protected Uri sourceUri;

	/**
	 * The cached value of the '{@link #getSourceReference() <em>Source Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceReference()
	 * @generated
	 * @ordered
	 */
	protected Reference sourceReference;

	/**
	 * The cached value of the '{@link #getExampleFor() <em>Example For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleFor()
	 * @generated
	 * @ordered
	 */
	protected Reference exampleFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuideResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImplementationGuideResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuideResourcePurpose getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPurpose(GuideResourcePurpose newPurpose, NotificationChain msgs) {
		GuideResourcePurpose oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__PURPOSE, oldPurpose, newPurpose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(GuideResourcePurpose newPurpose) {
		if (newPurpose != purpose) {
			NotificationChain msgs = null;
			if (purpose != null)
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__PURPOSE, newPurpose, newPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getAcronym() {
		return acronym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcronym(org.hl7.fhir.String newAcronym, NotificationChain msgs) {
		org.hl7.fhir.String oldAcronym = acronym;
		acronym = newAcronym;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__ACRONYM, oldAcronym, newAcronym);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcronym(org.hl7.fhir.String newAcronym) {
		if (newAcronym != acronym) {
			NotificationChain msgs = null;
			if (acronym != null)
				msgs = ((InternalEObject)acronym).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__ACRONYM, null, msgs);
			if (newAcronym != null)
				msgs = ((InternalEObject)newAcronym).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__ACRONYM, null, msgs);
			msgs = basicSetAcronym(newAcronym, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__ACRONYM, newAcronym, newAcronym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getSourceUri() {
		return sourceUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceUri(Uri newSourceUri, NotificationChain msgs) {
		Uri oldSourceUri = sourceUri;
		sourceUri = newSourceUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__SOURCE_URI, oldSourceUri, newSourceUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceUri(Uri newSourceUri) {
		if (newSourceUri != sourceUri) {
			NotificationChain msgs = null;
			if (sourceUri != null)
				msgs = ((InternalEObject)sourceUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__SOURCE_URI, null, msgs);
			if (newSourceUri != null)
				msgs = ((InternalEObject)newSourceUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__SOURCE_URI, null, msgs);
			msgs = basicSetSourceUri(newSourceUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__SOURCE_URI, newSourceUri, newSourceUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSourceReference() {
		return sourceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceReference(Reference newSourceReference, NotificationChain msgs) {
		Reference oldSourceReference = sourceReference;
		sourceReference = newSourceReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__SOURCE_REFERENCE, oldSourceReference, newSourceReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceReference(Reference newSourceReference) {
		if (newSourceReference != sourceReference) {
			NotificationChain msgs = null;
			if (sourceReference != null)
				msgs = ((InternalEObject)sourceReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__SOURCE_REFERENCE, null, msgs);
			if (newSourceReference != null)
				msgs = ((InternalEObject)newSourceReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__SOURCE_REFERENCE, null, msgs);
			msgs = basicSetSourceReference(newSourceReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__SOURCE_REFERENCE, newSourceReference, newSourceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getExampleFor() {
		return exampleFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleFor(Reference newExampleFor, NotificationChain msgs) {
		Reference oldExampleFor = exampleFor;
		exampleFor = newExampleFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_FOR, oldExampleFor, newExampleFor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleFor(Reference newExampleFor) {
		if (newExampleFor != exampleFor) {
			NotificationChain msgs = null;
			if (exampleFor != null)
				msgs = ((InternalEObject)exampleFor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_FOR, null, msgs);
			if (newExampleFor != null)
				msgs = ((InternalEObject)newExampleFor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_FOR, null, msgs);
			msgs = basicSetExampleFor(newExampleFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_FOR, newExampleFor, newExampleFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__PURPOSE:
				return basicSetPurpose(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__ACRONYM:
				return basicSetAcronym(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__SOURCE_URI:
				return basicSetSourceUri(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__SOURCE_REFERENCE:
				return basicSetSourceReference(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_FOR:
				return basicSetExampleFor(null, msgs);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__PURPOSE:
				return getPurpose();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME:
				return getName();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION:
				return getDescription();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__ACRONYM:
				return getAcronym();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__SOURCE_URI:
				return getSourceUri();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__SOURCE_REFERENCE:
				return getSourceReference();
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_FOR:
				return getExampleFor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__PURPOSE:
				setPurpose((GuideResourcePurpose)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__ACRONYM:
				setAcronym((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__SOURCE_URI:
				setSourceUri((Uri)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__SOURCE_REFERENCE:
				setSourceReference((Reference)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_FOR:
				setExampleFor((Reference)newValue);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__PURPOSE:
				setPurpose((GuideResourcePurpose)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__ACRONYM:
				setAcronym((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__SOURCE_URI:
				setSourceUri((Uri)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__SOURCE_REFERENCE:
				setSourceReference((Reference)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_FOR:
				setExampleFor((Reference)null);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__PURPOSE:
				return purpose != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__NAME:
				return name != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__DESCRIPTION:
				return description != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__ACRONYM:
				return acronym != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__SOURCE_URI:
				return sourceUri != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__SOURCE_REFERENCE:
				return sourceReference != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE__EXAMPLE_FOR:
				return exampleFor != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuideResourceImpl
