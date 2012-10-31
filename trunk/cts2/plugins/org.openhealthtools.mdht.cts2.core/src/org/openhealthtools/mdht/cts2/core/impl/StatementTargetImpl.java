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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.core.AnonymousStatement;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.OpaqueData;
import org.openhealthtools.mdht.cts2.core.StatementTarget;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.StatementTargetImpl#getEntity <em>Entity</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.StatementTargetImpl#getLiteral <em>Literal</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.StatementTargetImpl#getResource <em>Resource</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.StatementTargetImpl#getBnode <em>Bnode</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.StatementTargetImpl#getExternalIdentifier <em>External Identifier</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class StatementTargetImpl extends EObjectImpl implements StatementTarget {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected URIAndEntityName entity;

	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected OpaqueData literal;

	/**
	 * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected String resource = RESOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBnode() <em>Bnode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBnode()
	 * @generated
	 * @ordered
	 */
	protected EList<AnonymousStatement> bnode;

	/**
	 * The default value of the '{@link #getExternalIdentifier() <em>External Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExternalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalIdentifier() <em>External Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExternalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String externalIdentifier = EXTERNAL_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StatementTargetImpl() {
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
		return CorePackage.Literals.STATEMENT_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URIAndEntityName getEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEntity(URIAndEntityName newEntity, NotificationChain msgs) {
		URIAndEntityName oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.STATEMENT_TARGET__ENTITY, oldEntity, newEntity);
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
	public void setEntity(URIAndEntityName newEntity) {
		if (newEntity != entity) {
			NotificationChain msgs = null;
			if (entity != null) {
				msgs = ((InternalEObject) entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.STATEMENT_TARGET__ENTITY, null, msgs);
			}
			if (newEntity != null) {
				msgs = ((InternalEObject) newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.STATEMENT_TARGET__ENTITY, null, msgs);
			}
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.STATEMENT_TARGET__ENTITY, newEntity, newEntity));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OpaqueData getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetLiteral(OpaqueData newLiteral, NotificationChain msgs) {
		OpaqueData oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.STATEMENT_TARGET__LITERAL, oldLiteral, newLiteral);
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
	public void setLiteral(OpaqueData newLiteral) {
		if (newLiteral != literal) {
			NotificationChain msgs = null;
			if (literal != null) {
				msgs = ((InternalEObject) literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.STATEMENT_TARGET__LITERAL, null, msgs);
			}
			if (newLiteral != null) {
				msgs = ((InternalEObject) newLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.STATEMENT_TARGET__LITERAL, null, msgs);
			}
			msgs = basicSetLiteral(newLiteral, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.STATEMENT_TARGET__LITERAL, newLiteral, newLiteral));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResource(String newResource) {
		String oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.STATEMENT_TARGET__RESOURCE, oldResource, resource));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<AnonymousStatement> getBnode() {
		if (bnode == null) {
			bnode = new EObjectContainmentEList<AnonymousStatement>(
				AnonymousStatement.class, this, CorePackage.STATEMENT_TARGET__BNODE);
		}
		return bnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getExternalIdentifier() {
		return externalIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExternalIdentifier(String newExternalIdentifier) {
		String oldExternalIdentifier = externalIdentifier;
		externalIdentifier = newExternalIdentifier;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.STATEMENT_TARGET__EXTERNAL_IDENTIFIER, oldExternalIdentifier,
				externalIdentifier));
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
			case CorePackage.STATEMENT_TARGET__ENTITY:
				return basicSetEntity(null, msgs);
			case CorePackage.STATEMENT_TARGET__LITERAL:
				return basicSetLiteral(null, msgs);
			case CorePackage.STATEMENT_TARGET__BNODE:
				return ((InternalEList<?>) getBnode()).basicRemove(otherEnd, msgs);
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
			case CorePackage.STATEMENT_TARGET__ENTITY:
				return getEntity();
			case CorePackage.STATEMENT_TARGET__LITERAL:
				return getLiteral();
			case CorePackage.STATEMENT_TARGET__RESOURCE:
				return getResource();
			case CorePackage.STATEMENT_TARGET__BNODE:
				return getBnode();
			case CorePackage.STATEMENT_TARGET__EXTERNAL_IDENTIFIER:
				return getExternalIdentifier();
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
			case CorePackage.STATEMENT_TARGET__ENTITY:
				setEntity((URIAndEntityName) newValue);
				return;
			case CorePackage.STATEMENT_TARGET__LITERAL:
				setLiteral((OpaqueData) newValue);
				return;
			case CorePackage.STATEMENT_TARGET__RESOURCE:
				setResource((String) newValue);
				return;
			case CorePackage.STATEMENT_TARGET__BNODE:
				getBnode().clear();
				getBnode().addAll((Collection<? extends AnonymousStatement>) newValue);
				return;
			case CorePackage.STATEMENT_TARGET__EXTERNAL_IDENTIFIER:
				setExternalIdentifier((String) newValue);
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
			case CorePackage.STATEMENT_TARGET__ENTITY:
				setEntity((URIAndEntityName) null);
				return;
			case CorePackage.STATEMENT_TARGET__LITERAL:
				setLiteral((OpaqueData) null);
				return;
			case CorePackage.STATEMENT_TARGET__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
				return;
			case CorePackage.STATEMENT_TARGET__BNODE:
				getBnode().clear();
				return;
			case CorePackage.STATEMENT_TARGET__EXTERNAL_IDENTIFIER:
				setExternalIdentifier(EXTERNAL_IDENTIFIER_EDEFAULT);
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
			case CorePackage.STATEMENT_TARGET__ENTITY:
				return entity != null;
			case CorePackage.STATEMENT_TARGET__LITERAL:
				return literal != null;
			case CorePackage.STATEMENT_TARGET__RESOURCE:
				return RESOURCE_EDEFAULT == null
						? resource != null
						: !RESOURCE_EDEFAULT.equals(resource);
			case CorePackage.STATEMENT_TARGET__BNODE:
				return bnode != null && !bnode.isEmpty();
			case CorePackage.STATEMENT_TARGET__EXTERNAL_IDENTIFIER:
				return EXTERNAL_IDENTIFIER_EDEFAULT == null
						? externalIdentifier != null
						: !EXTERNAL_IDENTIFIER_EDEFAULT.equals(externalIdentifier);
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
		result.append(" (resource: ");
		result.append(resource);
		result.append(", externalIdentifier: ");
		result.append(externalIdentifier);
		result.append(')');
		return result.toString();
	}

} // StatementTargetImpl
