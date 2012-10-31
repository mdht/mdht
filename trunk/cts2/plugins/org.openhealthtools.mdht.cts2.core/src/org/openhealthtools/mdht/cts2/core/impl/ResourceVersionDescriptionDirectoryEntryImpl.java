/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Version Description Directory Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionDirectoryEntryImpl#getOfficialResourceVersionId <em>Official Resource
 * Version Id</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionDirectoryEntryImpl#getOfficialReleaseDate <em>Official Release Date
 * </em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionDirectoryEntryImpl#getDocumentURI <em>Document URI</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ResourceVersionDescriptionDirectoryEntryImpl extends ResourceDescriptionDirectoryEntryImpl implements
		ResourceVersionDescriptionDirectoryEntry {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ResourceVersionDescriptionDirectoryEntryImpl() {
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
		return CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY;
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
				this, Notification.SET,
				CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RESOURCE_VERSION_ID,
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
				this, Notification.SET,
				CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RELEASE_DATE,
				oldOfficialReleaseDate, officialReleaseDate));
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
				this, Notification.SET, CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__DOCUMENT_URI,
				oldDocumentURI, documentURI));
		}
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
			case CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RESOURCE_VERSION_ID:
				return getOfficialResourceVersionId();
			case CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RELEASE_DATE:
				return getOfficialReleaseDate();
			case CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__DOCUMENT_URI:
				return getDocumentURI();
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
			case CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RESOURCE_VERSION_ID:
				setOfficialResourceVersionId((String) newValue);
				return;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RELEASE_DATE:
				setOfficialReleaseDate((XMLGregorianCalendar) newValue);
				return;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__DOCUMENT_URI:
				setDocumentURI((String) newValue);
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
			case CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RESOURCE_VERSION_ID:
				setOfficialResourceVersionId(OFFICIAL_RESOURCE_VERSION_ID_EDEFAULT);
				return;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RELEASE_DATE:
				setOfficialReleaseDate(OFFICIAL_RELEASE_DATE_EDEFAULT);
				return;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__DOCUMENT_URI:
				setDocumentURI(DOCUMENT_URI_EDEFAULT);
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
			case CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RESOURCE_VERSION_ID:
				return OFFICIAL_RESOURCE_VERSION_ID_EDEFAULT == null
						? officialResourceVersionId != null
						: !OFFICIAL_RESOURCE_VERSION_ID_EDEFAULT.equals(officialResourceVersionId);
			case CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RELEASE_DATE:
				return OFFICIAL_RELEASE_DATE_EDEFAULT == null
						? officialReleaseDate != null
						: !OFFICIAL_RELEASE_DATE_EDEFAULT.equals(officialReleaseDate);
			case CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__DOCUMENT_URI:
				return DOCUMENT_URI_EDEFAULT == null
						? documentURI != null
						: !DOCUMENT_URI_EDEFAULT.equals(documentURI);
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
		result.append(", documentURI: ");
		result.append(documentURI);
		result.append(')');
		return result.toString();
	}

} // ResourceVersionDescriptionDirectoryEntryImpl
