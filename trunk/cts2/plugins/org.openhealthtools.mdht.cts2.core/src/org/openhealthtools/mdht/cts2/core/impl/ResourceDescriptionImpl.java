/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.core.Comment;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.EntryDescription;
import org.openhealthtools.mdht.cts2.core.OpaqueData;
import org.openhealthtools.mdht.cts2.core.Property;
import org.openhealthtools.mdht.cts2.core.ResourceDescription;
import org.openhealthtools.mdht.cts2.core.SourceAndRoleReference;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionImpl#getKeyword <em>Keyword</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionImpl#getResourceType <em>Resource Type</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionImpl#getResourceSynopsis <em>Resource Synopsis</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionImpl#getAdditionalDocumentation <em>Additional Documentation</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionImpl#getSourceAndRole <em>Source And Role</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionImpl#getRights <em>Rights</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionImpl#getNote <em>Note</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionImpl#getProperty <em>Property</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionImpl#getAlternateID <em>Alternate ID</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionImpl#getSourceStatements <em>Source Statements</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionImpl#getAbout <em>About</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ResourceDescriptionImpl#getFormalName <em>Formal Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class ResourceDescriptionImpl extends ChangeableImpl implements ResourceDescription {
	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected EList<String> keyword;

	/**
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected EList<URIAndEntityName> resourceType;

	/**
	 * The cached value of the '{@link #getResourceSynopsis() <em>Resource Synopsis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResourceSynopsis()
	 * @generated
	 * @ordered
	 */
	protected EntryDescription resourceSynopsis;

	/**
	 * The cached value of the '{@link #getAdditionalDocumentation() <em>Additional Documentation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAdditionalDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> additionalDocumentation;

	/**
	 * The cached value of the '{@link #getSourceAndRole() <em>Source And Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceAndRole()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceAndRoleReference> sourceAndRole;

	/**
	 * The cached value of the '{@link #getRights() <em>Rights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRights()
	 * @generated
	 * @ordered
	 */
	protected OpaqueData rights;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> note;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * The cached value of the '{@link #getAlternateID() <em>Alternate ID</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAlternateID()
	 * @generated
	 * @ordered
	 */
	protected EList<String> alternateID;

	/**
	 * The default value of the '{@link #getSourceStatements() <em>Source Statements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceStatements()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_STATEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceStatements() <em>Source Statements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceStatements()
	 * @generated
	 * @ordered
	 */
	protected String sourceStatements = SOURCE_STATEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbout() <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected static final String ABOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbout() <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected String about = ABOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormalName() <em>Formal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFormalName()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormalName() <em>Formal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFormalName()
	 * @generated
	 * @ordered
	 */
	protected String formalName = FORMAL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ResourceDescriptionImpl() {
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
		return CorePackage.Literals.RESOURCE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getKeyword() {
		if (keyword == null) {
			keyword = new EDataTypeEList<String>(String.class, this, CorePackage.RESOURCE_DESCRIPTION__KEYWORD);
		}
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<URIAndEntityName> getResourceType() {
		if (resourceType == null) {
			resourceType = new EObjectContainmentEList<URIAndEntityName>(
				URIAndEntityName.class, this, CorePackage.RESOURCE_DESCRIPTION__RESOURCE_TYPE);
		}
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntryDescription getResourceSynopsis() {
		return resourceSynopsis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetResourceSynopsis(EntryDescription newResourceSynopsis, NotificationChain msgs) {
		EntryDescription oldResourceSynopsis = resourceSynopsis;
		resourceSynopsis = newResourceSynopsis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS, oldResourceSynopsis,
				newResourceSynopsis);
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
	public void setResourceSynopsis(EntryDescription newResourceSynopsis) {
		if (newResourceSynopsis != resourceSynopsis) {
			NotificationChain msgs = null;
			if (resourceSynopsis != null) {
				msgs = ((InternalEObject) resourceSynopsis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS, null, msgs);
			}
			if (newResourceSynopsis != null) {
				msgs = ((InternalEObject) newResourceSynopsis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS, null, msgs);
			}
			msgs = basicSetResourceSynopsis(newResourceSynopsis, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS, newResourceSynopsis,
				newResourceSynopsis));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getAdditionalDocumentation() {
		if (additionalDocumentation == null) {
			additionalDocumentation = new EDataTypeEList<String>(
				String.class, this, CorePackage.RESOURCE_DESCRIPTION__ADDITIONAL_DOCUMENTATION);
		}
		return additionalDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<SourceAndRoleReference> getSourceAndRole() {
		if (sourceAndRole == null) {
			sourceAndRole = new EObjectContainmentEList<SourceAndRoleReference>(
				SourceAndRoleReference.class, this, CorePackage.RESOURCE_DESCRIPTION__SOURCE_AND_ROLE);
		}
		return sourceAndRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OpaqueData getRights() {
		return rights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRights(OpaqueData newRights, NotificationChain msgs) {
		OpaqueData oldRights = rights;
		rights = newRights;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_DESCRIPTION__RIGHTS, oldRights, newRights);
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
	public void setRights(OpaqueData newRights) {
		if (newRights != rights) {
			NotificationChain msgs = null;
			if (rights != null) {
				msgs = ((InternalEObject) rights).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.RESOURCE_DESCRIPTION__RIGHTS, null, msgs);
			}
			if (newRights != null) {
				msgs = ((InternalEObject) newRights).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.RESOURCE_DESCRIPTION__RIGHTS, null, msgs);
			}
			msgs = basicSetRights(newRights, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_DESCRIPTION__RIGHTS, newRights, newRights));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Comment> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Comment>(Comment.class, this, CorePackage.RESOURCE_DESCRIPTION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(
				Property.class, this, CorePackage.RESOURCE_DESCRIPTION__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getAlternateID() {
		if (alternateID == null) {
			alternateID = new EDataTypeEList<String>(String.class, this, CorePackage.RESOURCE_DESCRIPTION__ALTERNATE_ID);
		}
		return alternateID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSourceStatements() {
		return sourceStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSourceStatements(String newSourceStatements) {
		String oldSourceStatements = sourceStatements;
		sourceStatements = newSourceStatements;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_DESCRIPTION__SOURCE_STATEMENTS, oldSourceStatements,
				sourceStatements));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getAbout() {
		return about;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAbout(String newAbout) {
		String oldAbout = about;
		about = newAbout;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_DESCRIPTION__ABOUT, oldAbout, about));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getFormalName() {
		return formalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFormalName(String newFormalName) {
		String oldFormalName = formalName;
		formalName = newFormalName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.RESOURCE_DESCRIPTION__FORMAL_NAME, oldFormalName, formalName));
		}
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
			case CorePackage.RESOURCE_DESCRIPTION__RESOURCE_TYPE:
				return ((InternalEList<?>) getResourceType()).basicRemove(otherEnd, msgs);
			case CorePackage.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS:
				return basicSetResourceSynopsis(null, msgs);
			case CorePackage.RESOURCE_DESCRIPTION__SOURCE_AND_ROLE:
				return ((InternalEList<?>) getSourceAndRole()).basicRemove(otherEnd, msgs);
			case CorePackage.RESOURCE_DESCRIPTION__RIGHTS:
				return basicSetRights(null, msgs);
			case CorePackage.RESOURCE_DESCRIPTION__NOTE:
				return ((InternalEList<?>) getNote()).basicRemove(otherEnd, msgs);
			case CorePackage.RESOURCE_DESCRIPTION__PROPERTY:
				return ((InternalEList<?>) getProperty()).basicRemove(otherEnd, msgs);
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
			case CorePackage.RESOURCE_DESCRIPTION__KEYWORD:
				return getKeyword();
			case CorePackage.RESOURCE_DESCRIPTION__RESOURCE_TYPE:
				return getResourceType();
			case CorePackage.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS:
				return getResourceSynopsis();
			case CorePackage.RESOURCE_DESCRIPTION__ADDITIONAL_DOCUMENTATION:
				return getAdditionalDocumentation();
			case CorePackage.RESOURCE_DESCRIPTION__SOURCE_AND_ROLE:
				return getSourceAndRole();
			case CorePackage.RESOURCE_DESCRIPTION__RIGHTS:
				return getRights();
			case CorePackage.RESOURCE_DESCRIPTION__NOTE:
				return getNote();
			case CorePackage.RESOURCE_DESCRIPTION__PROPERTY:
				return getProperty();
			case CorePackage.RESOURCE_DESCRIPTION__ALTERNATE_ID:
				return getAlternateID();
			case CorePackage.RESOURCE_DESCRIPTION__SOURCE_STATEMENTS:
				return getSourceStatements();
			case CorePackage.RESOURCE_DESCRIPTION__ABOUT:
				return getAbout();
			case CorePackage.RESOURCE_DESCRIPTION__FORMAL_NAME:
				return getFormalName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.RESOURCE_DESCRIPTION__KEYWORD:
				getKeyword().clear();
				getKeyword().addAll((Collection<? extends String>) newValue);
				return;
			case CorePackage.RESOURCE_DESCRIPTION__RESOURCE_TYPE:
				getResourceType().clear();
				getResourceType().addAll((Collection<? extends URIAndEntityName>) newValue);
				return;
			case CorePackage.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS:
				setResourceSynopsis((EntryDescription) newValue);
				return;
			case CorePackage.RESOURCE_DESCRIPTION__ADDITIONAL_DOCUMENTATION:
				getAdditionalDocumentation().clear();
				getAdditionalDocumentation().addAll((Collection<? extends String>) newValue);
				return;
			case CorePackage.RESOURCE_DESCRIPTION__SOURCE_AND_ROLE:
				getSourceAndRole().clear();
				getSourceAndRole().addAll((Collection<? extends SourceAndRoleReference>) newValue);
				return;
			case CorePackage.RESOURCE_DESCRIPTION__RIGHTS:
				setRights((OpaqueData) newValue);
				return;
			case CorePackage.RESOURCE_DESCRIPTION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Comment>) newValue);
				return;
			case CorePackage.RESOURCE_DESCRIPTION__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>) newValue);
				return;
			case CorePackage.RESOURCE_DESCRIPTION__ALTERNATE_ID:
				getAlternateID().clear();
				getAlternateID().addAll((Collection<? extends String>) newValue);
				return;
			case CorePackage.RESOURCE_DESCRIPTION__SOURCE_STATEMENTS:
				setSourceStatements((String) newValue);
				return;
			case CorePackage.RESOURCE_DESCRIPTION__ABOUT:
				setAbout((String) newValue);
				return;
			case CorePackage.RESOURCE_DESCRIPTION__FORMAL_NAME:
				setFormalName((String) newValue);
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
			case CorePackage.RESOURCE_DESCRIPTION__KEYWORD:
				getKeyword().clear();
				return;
			case CorePackage.RESOURCE_DESCRIPTION__RESOURCE_TYPE:
				getResourceType().clear();
				return;
			case CorePackage.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS:
				setResourceSynopsis((EntryDescription) null);
				return;
			case CorePackage.RESOURCE_DESCRIPTION__ADDITIONAL_DOCUMENTATION:
				getAdditionalDocumentation().clear();
				return;
			case CorePackage.RESOURCE_DESCRIPTION__SOURCE_AND_ROLE:
				getSourceAndRole().clear();
				return;
			case CorePackage.RESOURCE_DESCRIPTION__RIGHTS:
				setRights((OpaqueData) null);
				return;
			case CorePackage.RESOURCE_DESCRIPTION__NOTE:
				getNote().clear();
				return;
			case CorePackage.RESOURCE_DESCRIPTION__PROPERTY:
				getProperty().clear();
				return;
			case CorePackage.RESOURCE_DESCRIPTION__ALTERNATE_ID:
				getAlternateID().clear();
				return;
			case CorePackage.RESOURCE_DESCRIPTION__SOURCE_STATEMENTS:
				setSourceStatements(SOURCE_STATEMENTS_EDEFAULT);
				return;
			case CorePackage.RESOURCE_DESCRIPTION__ABOUT:
				setAbout(ABOUT_EDEFAULT);
				return;
			case CorePackage.RESOURCE_DESCRIPTION__FORMAL_NAME:
				setFormalName(FORMAL_NAME_EDEFAULT);
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
			case CorePackage.RESOURCE_DESCRIPTION__KEYWORD:
				return keyword != null && !keyword.isEmpty();
			case CorePackage.RESOURCE_DESCRIPTION__RESOURCE_TYPE:
				return resourceType != null && !resourceType.isEmpty();
			case CorePackage.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS:
				return resourceSynopsis != null;
			case CorePackage.RESOURCE_DESCRIPTION__ADDITIONAL_DOCUMENTATION:
				return additionalDocumentation != null && !additionalDocumentation.isEmpty();
			case CorePackage.RESOURCE_DESCRIPTION__SOURCE_AND_ROLE:
				return sourceAndRole != null && !sourceAndRole.isEmpty();
			case CorePackage.RESOURCE_DESCRIPTION__RIGHTS:
				return rights != null;
			case CorePackage.RESOURCE_DESCRIPTION__NOTE:
				return note != null && !note.isEmpty();
			case CorePackage.RESOURCE_DESCRIPTION__PROPERTY:
				return property != null && !property.isEmpty();
			case CorePackage.RESOURCE_DESCRIPTION__ALTERNATE_ID:
				return alternateID != null && !alternateID.isEmpty();
			case CorePackage.RESOURCE_DESCRIPTION__SOURCE_STATEMENTS:
				return SOURCE_STATEMENTS_EDEFAULT == null
						? sourceStatements != null
						: !SOURCE_STATEMENTS_EDEFAULT.equals(sourceStatements);
			case CorePackage.RESOURCE_DESCRIPTION__ABOUT:
				return ABOUT_EDEFAULT == null
						? about != null
						: !ABOUT_EDEFAULT.equals(about);
			case CorePackage.RESOURCE_DESCRIPTION__FORMAL_NAME:
				return FORMAL_NAME_EDEFAULT == null
						? formalName != null
						: !FORMAL_NAME_EDEFAULT.equals(formalName);
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
		result.append(" (keyword: ");
		result.append(keyword);
		result.append(", additionalDocumentation: ");
		result.append(additionalDocumentation);
		result.append(", alternateID: ");
		result.append(alternateID);
		result.append(", sourceStatements: ");
		result.append(sourceStatements);
		result.append(", about: ");
		result.append(about);
		result.append(", formalName: ");
		result.append(formalName);
		result.append(')');
		return result.toString();
	}

} // ResourceDescriptionImpl
