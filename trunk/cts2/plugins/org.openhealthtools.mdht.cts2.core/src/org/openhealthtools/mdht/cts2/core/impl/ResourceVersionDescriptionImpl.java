/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.FinalizableState;
import org.openhealthtools.mdht.cts2.core.NameAndMeaningReference;
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescription;
import org.openhealthtools.mdht.cts2.core.SourceAndNotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Version Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionImpl#getSourceAndNotation <em>Source And Notation</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionImpl#getPredecessor <em>Predecessor</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionImpl#getOfficialResourceVersionId <em>Official Resource Version Id
 * </em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionImpl#getOfficialReleaseDate <em>Official Release Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionImpl#getOfficialActivationDate <em>Official Activation Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionImpl#getDocumentURI <em>Document URI</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class ResourceVersionDescriptionImpl extends ResourceDescriptionImpl implements
		ResourceVersionDescription {
	/**
	 * The cached value of the '{@link #getSourceAndNotation() <em>Source And Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceAndNotation()
	 * @generated
	 * @ordered
	 */
	protected SourceAndNotation sourceAndNotation;

	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected NameAndMeaningReference predecessor;

	/**
	 * The default value of the '{@link #getOfficialResourceVersionId() <em>Official Resource Version Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOfficialResourceVersionId()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFICIAL_RESOURCE_VERSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOfficialResourceVersionId() <em>Official Resource Version Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOfficialResourceVersionId()
	 * @generated
	 * @ordered
	 */
	protected String officialResourceVersionId = OFFICIAL_RESOURCE_VERSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOfficialReleaseDate() <em>Official Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOfficialReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar OFFICIAL_RELEASE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOfficialReleaseDate() <em>Official Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOfficialReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar officialReleaseDate = OFFICIAL_RELEASE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOfficialActivationDate() <em>Official Activation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOfficialActivationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar OFFICIAL_ACTIVATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOfficialActivationDate() <em>Official Activation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOfficialActivationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar officialActivationDate = OFFICIAL_ACTIVATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentURI() <em>Document URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDocumentURI()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentURI() <em>Document URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDocumentURI()
	 * @generated
	 * @ordered
	 */
	protected String documentURI = DOCUMENT_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final FinalizableState STATE_EDEFAULT = FinalizableState.FINAL;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected FinalizableState state = STATE_EDEFAULT;

	/**
	 * This is true if the State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean stateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ResourceVersionDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SourceAndNotation getSourceAndNotation() {
		return sourceAndNotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSourceAndNotation(SourceAndNotation newSourceAndNotation, NotificationChain msgs) {
		SourceAndNotation oldSourceAndNotation = sourceAndNotation;
		sourceAndNotation = newSourceAndNotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_NOTATION,
				oldSourceAndNotation, newSourceAndNotation);
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
	 * 
	 * @generated
	 */
	public void setSourceAndNotation(SourceAndNotation newSourceAndNotation) {
		if (newSourceAndNotation != sourceAndNotation) {
			NotificationChain msgs = null;
			if (sourceAndNotation != null) {
				msgs = ((InternalEObject) sourceAndNotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_NOTATION, null, msgs);
			}
			if (newSourceAndNotation != null) {
				msgs = ((InternalEObject) newSourceAndNotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_NOTATION, null, msgs);
			}
			msgs = basicSetSourceAndNotation(newSourceAndNotation, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_NOTATION,
				newSourceAndNotation, newSourceAndNotation));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NameAndMeaningReference getPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPredecessor(NameAndMeaningReference newPredecessor, NotificationChain msgs) {
		NameAndMeaningReference oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR, oldPredecessor,
				newPredecessor);
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
	 * 
	 * @generated
	 */
	public void setPredecessor(NameAndMeaningReference newPredecessor) {
		if (newPredecessor != predecessor) {
			NotificationChain msgs = null;
			if (predecessor != null) {
				msgs = ((InternalEObject) predecessor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR, null, msgs);
			}
			if (newPredecessor != null) {
				msgs = ((InternalEObject) newPredecessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR, null, msgs);
			}
			msgs = basicSetPredecessor(newPredecessor, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR, newPredecessor,
				newPredecessor));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getOfficialResourceVersionId() {
		return officialResourceVersionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOfficialResourceVersionId(String newOfficialResourceVersionId) {
		String oldOfficialResourceVersionId = officialResourceVersionId;
		officialResourceVersionId = newOfficialResourceVersionId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RESOURCE_VERSION_ID,
				oldOfficialResourceVersionId, officialResourceVersionId));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XMLGregorianCalendar getOfficialReleaseDate() {
		return officialReleaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOfficialReleaseDate(XMLGregorianCalendar newOfficialReleaseDate) {
		XMLGregorianCalendar oldOfficialReleaseDate = officialReleaseDate;
		officialReleaseDate = newOfficialReleaseDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RELEASE_DATE,
				oldOfficialReleaseDate, officialReleaseDate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XMLGregorianCalendar getOfficialActivationDate() {
		return officialActivationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOfficialActivationDate(XMLGregorianCalendar newOfficialActivationDate) {
		XMLGregorianCalendar oldOfficialActivationDate = officialActivationDate;
		officialActivationDate = newOfficialActivationDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_ACTIVATION_DATE,
				oldOfficialActivationDate, officialActivationDate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDocumentURI() {
		return documentURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDocumentURI(String newDocumentURI) {
		String oldDocumentURI = documentURI;
		documentURI = newDocumentURI;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_VERSION_DESCRIPTION__DOCUMENT_URI, oldDocumentURI,
				documentURI));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FinalizableState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setState(FinalizableState newState) {
		FinalizableState oldState = state;
		state = newState == null
				? STATE_EDEFAULT
				: newState;
		boolean oldStateESet = stateESet;
		stateESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_VERSION_DESCRIPTION__STATE, oldState, state, !oldStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetState() {
		FinalizableState oldState = state;
		boolean oldStateESet = stateESet;
		state = STATE_EDEFAULT;
		stateESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CorePackage.RESOURCE_VERSION_DESCRIPTION__STATE, oldState, STATE_EDEFAULT,
				oldStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetState() {
		return stateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_NOTATION:
				return basicSetSourceAndNotation(null, msgs);
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR:
				return basicSetPredecessor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_NOTATION:
				return getSourceAndNotation();
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR:
				return getPredecessor();
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RESOURCE_VERSION_ID:
				return getOfficialResourceVersionId();
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RELEASE_DATE:
				return getOfficialReleaseDate();
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_ACTIVATION_DATE:
				return getOfficialActivationDate();
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__DOCUMENT_URI:
				return getDocumentURI();
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__STATE:
				return getState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_NOTATION:
				setSourceAndNotation((SourceAndNotation) newValue);
				return;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR:
				setPredecessor((NameAndMeaningReference) newValue);
				return;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RESOURCE_VERSION_ID:
				setOfficialResourceVersionId((String) newValue);
				return;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RELEASE_DATE:
				setOfficialReleaseDate((XMLGregorianCalendar) newValue);
				return;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_ACTIVATION_DATE:
				setOfficialActivationDate((XMLGregorianCalendar) newValue);
				return;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__DOCUMENT_URI:
				setDocumentURI((String) newValue);
				return;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__STATE:
				setState((FinalizableState) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_NOTATION:
				setSourceAndNotation((SourceAndNotation) null);
				return;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR:
				setPredecessor((NameAndMeaningReference) null);
				return;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RESOURCE_VERSION_ID:
				setOfficialResourceVersionId(OFFICIAL_RESOURCE_VERSION_ID_EDEFAULT);
				return;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RELEASE_DATE:
				setOfficialReleaseDate(OFFICIAL_RELEASE_DATE_EDEFAULT);
				return;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_ACTIVATION_DATE:
				setOfficialActivationDate(OFFICIAL_ACTIVATION_DATE_EDEFAULT);
				return;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__DOCUMENT_URI:
				setDocumentURI(DOCUMENT_URI_EDEFAULT);
				return;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__STATE:
				unsetState();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_NOTATION:
				return sourceAndNotation != null;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR:
				return predecessor != null;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RESOURCE_VERSION_ID:
				return OFFICIAL_RESOURCE_VERSION_ID_EDEFAULT == null
						? officialResourceVersionId != null
						: !OFFICIAL_RESOURCE_VERSION_ID_EDEFAULT.equals(officialResourceVersionId);
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RELEASE_DATE:
				return OFFICIAL_RELEASE_DATE_EDEFAULT == null
						? officialReleaseDate != null
						: !OFFICIAL_RELEASE_DATE_EDEFAULT.equals(officialReleaseDate);
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_ACTIVATION_DATE:
				return OFFICIAL_ACTIVATION_DATE_EDEFAULT == null
						? officialActivationDate != null
						: !OFFICIAL_ACTIVATION_DATE_EDEFAULT.equals(officialActivationDate);
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__DOCUMENT_URI:
				return DOCUMENT_URI_EDEFAULT == null
						? documentURI != null
						: !DOCUMENT_URI_EDEFAULT.equals(documentURI);
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__STATE:
				return isSetState();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (officialResourceVersionId: ");
		result.append(officialResourceVersionId);
		result.append(", officialReleaseDate: ");
		result.append(officialReleaseDate);
		result.append(", officialActivationDate: ");
		result.append(officialActivationDate);
		result.append(", documentURI: ");
		result.append(documentURI);
		result.append(", state: ");
		if (stateESet) {
			result.append(state);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // ResourceVersionDescriptionImpl
