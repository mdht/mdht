/**
 */
package traceability.impl;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import traceability.TraceabilityPackage;
import traceability.Traces;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link traceability.impl.TracesImpl#getOriginalSourceURL <em>Original Source URL</em>}</li>
 *   <li>{@link traceability.impl.TracesImpl#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link traceability.impl.TracesImpl#getTargetModel <em>Target Model</em>}</li>
 *   <li>{@link traceability.impl.TracesImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link traceability.impl.TracesImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link traceability.impl.TracesImpl#getDate <em>Date</em>}</li>
 *   <li>{@link traceability.impl.TracesImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link traceability.impl.TracesImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link traceability.impl.TracesImpl#getTraces <em>Traces</em>}</li>
 *   <li>{@link traceability.impl.TracesImpl#getUriMap <em>Uri Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracesImpl extends MinimalEObjectImpl.Container implements Traces {
	/**
	 * The default value of the '{@link #getOriginalSourceURL() <em>Original Source URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalSourceURL()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_SOURCE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalSourceURL() <em>Original Source URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalSourceURL()
	 * @generated
	 * @ordered
	 */
	protected String originalSourceURL = ORIGINAL_SOURCE_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceModel() <em>Source Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceModel()
	 * @generated
	 * @ordered
	 */
	protected EObject sourceModel;

	/**
	 * The cached value of the '{@link #getTargetModel() <em>Target Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetModel()
	 * @generated
	 * @ordered
	 */
	protected EObject targetModel;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected String fullName = FULL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> traces;

	/**
	 * The default value of the '{@link #getUriMap() <em>Uri Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriMap()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUriMap() <em>Uri Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriMap()
	 * @generated
	 * @ordered
	 */
	protected String uriMap = URI_MAP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.TRACES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginalSourceURL() {
		return originalSourceURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalSourceURL(String newOriginalSourceURL) {
		String oldOriginalSourceURL = originalSourceURL;
		originalSourceURL = newOriginalSourceURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACES__ORIGINAL_SOURCE_URL, oldOriginalSourceURL, originalSourceURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSourceModel() {
		if (sourceModel != null && sourceModel.eIsProxy()) {
			InternalEObject oldSourceModel = (InternalEObject)sourceModel;
			sourceModel = eResolveProxy(oldSourceModel);
			if (sourceModel != oldSourceModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceabilityPackage.TRACES__SOURCE_MODEL, oldSourceModel, sourceModel));
			}
		}
		return sourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetSourceModel() {
		return sourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceModel(EObject newSourceModel) {
		EObject oldSourceModel = sourceModel;
		sourceModel = newSourceModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACES__SOURCE_MODEL, oldSourceModel, sourceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTargetModel() {
		if (targetModel != null && targetModel.eIsProxy()) {
			InternalEObject oldTargetModel = (InternalEObject)targetModel;
			targetModel = eResolveProxy(oldTargetModel);
			if (targetModel != oldTargetModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceabilityPackage.TRACES__TARGET_MODEL, oldTargetModel, targetModel));
			}
		}
		return targetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetTargetModel() {
		return targetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetModel(EObject newTargetModel) {
		EObject oldTargetModel = targetModel;
		targetModel = newTargetModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACES__TARGET_MODEL, oldTargetModel, targetModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACES__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullName(String newFullName) {
		String oldFullName = fullName;
		fullName = newFullName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACES__FULL_NAME, oldFullName, fullName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACES__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACES__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACES__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTraces() {
		if (traces == null) {
			traces = new EObjectContainmentEList<EObject>(EObject.class, this, TraceabilityPackage.TRACES__TRACES);
		}
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUriMap() {
		return uriMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUriMap(String newUriMap) {
		String oldUriMap = uriMap;
		uriMap = newUriMap;
		if (uriMap != null) {
			Map<URI, URI> URI_MAP = org.eclipse.emf.ecore.resource.URIConverter.URI_MAP;
			if (this.eResource() != null && this.eResource().getResourceSet() != null && this.eResource().getResourceSet().getURIConverter() != null)
				URI_MAP = this.eResource().getResourceSet().getURIConverter().getURIMap();
			String[] uris = uriMap.split(" ");
			for (int i = 0; i < uris.length; i += 2) {
				URI_MAP.put(URI.createURI(uris[i]), URI.createURI(uris[i + 1]));
			}
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACES__URI_MAP, oldUriMap, uriMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityPackage.TRACES__TRACES:
				return ((InternalEList<?>)getTraces()).basicRemove(otherEnd, msgs);
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
			case TraceabilityPackage.TRACES__ORIGINAL_SOURCE_URL:
				return getOriginalSourceURL();
			case TraceabilityPackage.TRACES__SOURCE_MODEL:
				if (resolve) return getSourceModel();
				return basicGetSourceModel();
			case TraceabilityPackage.TRACES__TARGET_MODEL:
				if (resolve) return getTargetModel();
				return basicGetTargetModel();
			case TraceabilityPackage.TRACES__USERNAME:
				return getUsername();
			case TraceabilityPackage.TRACES__FULL_NAME:
				return getFullName();
			case TraceabilityPackage.TRACES__DATE:
				return getDate();
			case TraceabilityPackage.TRACES__LOCATION:
				return getLocation();
			case TraceabilityPackage.TRACES__COMMENTS:
				return getComments();
			case TraceabilityPackage.TRACES__TRACES:
				return getTraces();
			case TraceabilityPackage.TRACES__URI_MAP:
				return getUriMap();
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
			case TraceabilityPackage.TRACES__ORIGINAL_SOURCE_URL:
				setOriginalSourceURL((String)newValue);
				return;
			case TraceabilityPackage.TRACES__SOURCE_MODEL:
				setSourceModel((EObject)newValue);
				return;
			case TraceabilityPackage.TRACES__TARGET_MODEL:
				setTargetModel((EObject)newValue);
				return;
			case TraceabilityPackage.TRACES__USERNAME:
				setUsername((String)newValue);
				return;
			case TraceabilityPackage.TRACES__FULL_NAME:
				setFullName((String)newValue);
				return;
			case TraceabilityPackage.TRACES__DATE:
				setDate((Date)newValue);
				return;
			case TraceabilityPackage.TRACES__LOCATION:
				setLocation((String)newValue);
				return;
			case TraceabilityPackage.TRACES__COMMENTS:
				setComments((String)newValue);
				return;
			case TraceabilityPackage.TRACES__TRACES:
				getTraces().clear();
				getTraces().addAll((Collection<? extends EObject>)newValue);
				return;
			case TraceabilityPackage.TRACES__URI_MAP:
				setUriMap((String)newValue);
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
			case TraceabilityPackage.TRACES__ORIGINAL_SOURCE_URL:
				setOriginalSourceURL(ORIGINAL_SOURCE_URL_EDEFAULT);
				return;
			case TraceabilityPackage.TRACES__SOURCE_MODEL:
				setSourceModel((EObject)null);
				return;
			case TraceabilityPackage.TRACES__TARGET_MODEL:
				setTargetModel((EObject)null);
				return;
			case TraceabilityPackage.TRACES__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case TraceabilityPackage.TRACES__FULL_NAME:
				setFullName(FULL_NAME_EDEFAULT);
				return;
			case TraceabilityPackage.TRACES__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case TraceabilityPackage.TRACES__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case TraceabilityPackage.TRACES__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case TraceabilityPackage.TRACES__TRACES:
				getTraces().clear();
				return;
			case TraceabilityPackage.TRACES__URI_MAP:
				setUriMap(URI_MAP_EDEFAULT);
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
			case TraceabilityPackage.TRACES__ORIGINAL_SOURCE_URL:
				return ORIGINAL_SOURCE_URL_EDEFAULT == null ? originalSourceURL != null : !ORIGINAL_SOURCE_URL_EDEFAULT.equals(originalSourceURL);
			case TraceabilityPackage.TRACES__SOURCE_MODEL:
				return sourceModel != null;
			case TraceabilityPackage.TRACES__TARGET_MODEL:
				return targetModel != null;
			case TraceabilityPackage.TRACES__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case TraceabilityPackage.TRACES__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? fullName != null : !FULL_NAME_EDEFAULT.equals(fullName);
			case TraceabilityPackage.TRACES__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case TraceabilityPackage.TRACES__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case TraceabilityPackage.TRACES__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case TraceabilityPackage.TRACES__TRACES:
				return traces != null && !traces.isEmpty();
			case TraceabilityPackage.TRACES__URI_MAP:
				return URI_MAP_EDEFAULT == null ? uriMap != null : !URI_MAP_EDEFAULT.equals(uriMap);
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
		result.append(" (originalSourceURL: ");
		result.append(originalSourceURL);
		result.append(", username: ");
		result.append(username);
		result.append(", fullName: ");
		result.append(fullName);
		result.append(", date: ");
		result.append(date);
		result.append(", location: ");
		result.append(location);
		result.append(", comments: ");
		result.append(comments);
		result.append(", uriMap: ");
		result.append(uriMap);
		result.append(')');
		return result.toString();
	}

} //TracesImpl
