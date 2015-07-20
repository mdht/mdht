/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Annotation;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AnnotationImpl#getAuthorReference <em>Author Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AnnotationImpl#getAuthorString <em>Author String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AnnotationImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AnnotationImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationImpl extends ElementImpl implements Annotation {
	/**
	 * The cached value of the '{@link #getAuthorReference() <em>Author Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorReference()
	 * @generated
	 * @ordered
	 */
	protected Reference authorReference;

	/**
	 * The cached value of the '{@link #getAuthorString() <em>Author String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String authorString;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime time;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String text;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAnnotation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAuthorReference() {
		return authorReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorReference(Reference newAuthorReference, NotificationChain msgs) {
		Reference oldAuthorReference = authorReference;
		authorReference = newAuthorReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ANNOTATION__AUTHOR_REFERENCE, oldAuthorReference, newAuthorReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorReference(Reference newAuthorReference) {
		if (newAuthorReference != authorReference) {
			NotificationChain msgs = null;
			if (authorReference != null)
				msgs = ((InternalEObject)authorReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ANNOTATION__AUTHOR_REFERENCE, null, msgs);
			if (newAuthorReference != null)
				msgs = ((InternalEObject)newAuthorReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ANNOTATION__AUTHOR_REFERENCE, null, msgs);
			msgs = basicSetAuthorReference(newAuthorReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ANNOTATION__AUTHOR_REFERENCE, newAuthorReference, newAuthorReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getAuthorString() {
		return authorString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorString(org.hl7.fhir.String newAuthorString, NotificationChain msgs) {
		org.hl7.fhir.String oldAuthorString = authorString;
		authorString = newAuthorString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ANNOTATION__AUTHOR_STRING, oldAuthorString, newAuthorString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorString(org.hl7.fhir.String newAuthorString) {
		if (newAuthorString != authorString) {
			NotificationChain msgs = null;
			if (authorString != null)
				msgs = ((InternalEObject)authorString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ANNOTATION__AUTHOR_STRING, null, msgs);
			if (newAuthorString != null)
				msgs = ((InternalEObject)newAuthorString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ANNOTATION__AUTHOR_STRING, null, msgs);
			msgs = basicSetAuthorString(newAuthorString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ANNOTATION__AUTHOR_STRING, newAuthorString, newAuthorString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(DateTime newTime, NotificationChain msgs) {
		DateTime oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ANNOTATION__TIME, oldTime, newTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(DateTime newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ANNOTATION__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ANNOTATION__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ANNOTATION__TIME, newTime, newTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(org.hl7.fhir.String newText, NotificationChain msgs) {
		org.hl7.fhir.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ANNOTATION__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(org.hl7.fhir.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ANNOTATION__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ANNOTATION__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ANNOTATION__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ANNOTATION__AUTHOR_REFERENCE:
				return basicSetAuthorReference(null, msgs);
			case FhirPackage.ANNOTATION__AUTHOR_STRING:
				return basicSetAuthorString(null, msgs);
			case FhirPackage.ANNOTATION__TIME:
				return basicSetTime(null, msgs);
			case FhirPackage.ANNOTATION__TEXT:
				return basicSetText(null, msgs);
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
			case FhirPackage.ANNOTATION__AUTHOR_REFERENCE:
				return getAuthorReference();
			case FhirPackage.ANNOTATION__AUTHOR_STRING:
				return getAuthorString();
			case FhirPackage.ANNOTATION__TIME:
				return getTime();
			case FhirPackage.ANNOTATION__TEXT:
				return getText();
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
			case FhirPackage.ANNOTATION__AUTHOR_REFERENCE:
				setAuthorReference((Reference)newValue);
				return;
			case FhirPackage.ANNOTATION__AUTHOR_STRING:
				setAuthorString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ANNOTATION__TIME:
				setTime((DateTime)newValue);
				return;
			case FhirPackage.ANNOTATION__TEXT:
				setText((org.hl7.fhir.String)newValue);
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
			case FhirPackage.ANNOTATION__AUTHOR_REFERENCE:
				setAuthorReference((Reference)null);
				return;
			case FhirPackage.ANNOTATION__AUTHOR_STRING:
				setAuthorString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ANNOTATION__TIME:
				setTime((DateTime)null);
				return;
			case FhirPackage.ANNOTATION__TEXT:
				setText((org.hl7.fhir.String)null);
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
			case FhirPackage.ANNOTATION__AUTHOR_REFERENCE:
				return authorReference != null;
			case FhirPackage.ANNOTATION__AUTHOR_STRING:
				return authorString != null;
			case FhirPackage.ANNOTATION__TIME:
				return time != null;
			case FhirPackage.ANNOTATION__TEXT:
				return text != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationImpl
