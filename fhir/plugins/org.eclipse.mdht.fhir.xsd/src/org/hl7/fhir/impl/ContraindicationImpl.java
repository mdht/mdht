/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Contraindication;
import org.hl7.fhir.ContraindicationMitigation;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contraindication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ContraindicationImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContraindicationImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContraindicationImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContraindicationImpl#getImplicated <em>Implicated</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContraindicationImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContraindicationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContraindicationImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContraindicationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContraindicationImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContraindicationImpl#getMitigation <em>Mitigation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContraindicationImpl extends DomainResourceImpl implements Contraindication {
	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Code severity;

	/**
	 * The cached value of the '{@link #getImplicated() <em>Implicated</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicated()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> implicated;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String detail;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Reference author;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Uri reference;

	/**
	 * The cached value of the '{@link #getMitigation() <em>Mitigation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigation()
	 * @generated
	 * @ordered
	 */
	protected EList<ContraindicationMitigation> mitigation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContraindicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getContraindication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRAINDICATION__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRAINDICATION__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRAINDICATION__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRAINDICATION__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRAINDICATION__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRAINDICATION__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRAINDICATION__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRAINDICATION__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeverity(Code newSeverity, NotificationChain msgs) {
		Code oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRAINDICATION__SEVERITY, oldSeverity, newSeverity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(Code newSeverity) {
		if (newSeverity != severity) {
			NotificationChain msgs = null;
			if (severity != null)
				msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRAINDICATION__SEVERITY, null, msgs);
			if (newSeverity != null)
				msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRAINDICATION__SEVERITY, null, msgs);
			msgs = basicSetSeverity(newSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRAINDICATION__SEVERITY, newSeverity, newSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getImplicated() {
		if (implicated == null) {
			implicated = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONTRAINDICATION__IMPLICATED);
		}
		return implicated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetail(org.hl7.fhir.String newDetail, NotificationChain msgs) {
		org.hl7.fhir.String oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRAINDICATION__DETAIL, oldDetail, newDetail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetail(org.hl7.fhir.String newDetail) {
		if (newDetail != detail) {
			NotificationChain msgs = null;
			if (detail != null)
				msgs = ((InternalEObject)detail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRAINDICATION__DETAIL, null, msgs);
			if (newDetail != null)
				msgs = ((InternalEObject)newDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRAINDICATION__DETAIL, null, msgs);
			msgs = basicSetDetail(newDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRAINDICATION__DETAIL, newDetail, newDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRAINDICATION__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRAINDICATION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRAINDICATION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRAINDICATION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Reference newAuthor, NotificationChain msgs) {
		Reference oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRAINDICATION__AUTHOR, oldAuthor, newAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Reference newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRAINDICATION__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRAINDICATION__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRAINDICATION__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRAINDICATION__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRAINDICATION__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRAINDICATION__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRAINDICATION__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(Uri newReference, NotificationChain msgs) {
		Uri oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRAINDICATION__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Uri newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRAINDICATION__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRAINDICATION__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRAINDICATION__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContraindicationMitigation> getMitigation() {
		if (mitigation == null) {
			mitigation = new EObjectContainmentEList<ContraindicationMitigation>(ContraindicationMitigation.class, this, FhirPackage.CONTRAINDICATION__MITIGATION);
		}
		return mitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONTRAINDICATION__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.CONTRAINDICATION__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.CONTRAINDICATION__SEVERITY:
				return basicSetSeverity(null, msgs);
			case FhirPackage.CONTRAINDICATION__IMPLICATED:
				return ((InternalEList<?>)getImplicated()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRAINDICATION__DETAIL:
				return basicSetDetail(null, msgs);
			case FhirPackage.CONTRAINDICATION__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.CONTRAINDICATION__AUTHOR:
				return basicSetAuthor(null, msgs);
			case FhirPackage.CONTRAINDICATION__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.CONTRAINDICATION__REFERENCE:
				return basicSetReference(null, msgs);
			case FhirPackage.CONTRAINDICATION__MITIGATION:
				return ((InternalEList<?>)getMitigation()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONTRAINDICATION__PATIENT:
				return getPatient();
			case FhirPackage.CONTRAINDICATION__CATEGORY:
				return getCategory();
			case FhirPackage.CONTRAINDICATION__SEVERITY:
				return getSeverity();
			case FhirPackage.CONTRAINDICATION__IMPLICATED:
				return getImplicated();
			case FhirPackage.CONTRAINDICATION__DETAIL:
				return getDetail();
			case FhirPackage.CONTRAINDICATION__DATE:
				return getDate();
			case FhirPackage.CONTRAINDICATION__AUTHOR:
				return getAuthor();
			case FhirPackage.CONTRAINDICATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CONTRAINDICATION__REFERENCE:
				return getReference();
			case FhirPackage.CONTRAINDICATION__MITIGATION:
				return getMitigation();
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
			case FhirPackage.CONTRAINDICATION__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.CONTRAINDICATION__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRAINDICATION__SEVERITY:
				setSeverity((Code)newValue);
				return;
			case FhirPackage.CONTRAINDICATION__IMPLICATED:
				getImplicated().clear();
				getImplicated().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONTRAINDICATION__DETAIL:
				setDetail((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONTRAINDICATION__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.CONTRAINDICATION__AUTHOR:
				setAuthor((Reference)newValue);
				return;
			case FhirPackage.CONTRAINDICATION__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CONTRAINDICATION__REFERENCE:
				setReference((Uri)newValue);
				return;
			case FhirPackage.CONTRAINDICATION__MITIGATION:
				getMitigation().clear();
				getMitigation().addAll((Collection<? extends ContraindicationMitigation>)newValue);
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
			case FhirPackage.CONTRAINDICATION__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.CONTRAINDICATION__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.CONTRAINDICATION__SEVERITY:
				setSeverity((Code)null);
				return;
			case FhirPackage.CONTRAINDICATION__IMPLICATED:
				getImplicated().clear();
				return;
			case FhirPackage.CONTRAINDICATION__DETAIL:
				setDetail((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONTRAINDICATION__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.CONTRAINDICATION__AUTHOR:
				setAuthor((Reference)null);
				return;
			case FhirPackage.CONTRAINDICATION__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.CONTRAINDICATION__REFERENCE:
				setReference((Uri)null);
				return;
			case FhirPackage.CONTRAINDICATION__MITIGATION:
				getMitigation().clear();
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
			case FhirPackage.CONTRAINDICATION__PATIENT:
				return patient != null;
			case FhirPackage.CONTRAINDICATION__CATEGORY:
				return category != null;
			case FhirPackage.CONTRAINDICATION__SEVERITY:
				return severity != null;
			case FhirPackage.CONTRAINDICATION__IMPLICATED:
				return implicated != null && !implicated.isEmpty();
			case FhirPackage.CONTRAINDICATION__DETAIL:
				return detail != null;
			case FhirPackage.CONTRAINDICATION__DATE:
				return date != null;
			case FhirPackage.CONTRAINDICATION__AUTHOR:
				return author != null;
			case FhirPackage.CONTRAINDICATION__IDENTIFIER:
				return identifier != null;
			case FhirPackage.CONTRAINDICATION__REFERENCE:
				return reference != null;
			case FhirPackage.CONTRAINDICATION__MITIGATION:
				return mitigation != null && !mitigation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContraindicationImpl
