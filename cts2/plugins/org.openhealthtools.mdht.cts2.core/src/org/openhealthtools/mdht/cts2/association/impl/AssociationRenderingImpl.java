/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.association.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.cts2.association.AssociationPackage;
import org.openhealthtools.mdht.cts2.association.AssociationRendering;
import org.openhealthtools.mdht.cts2.core.OntologyLanguageAndSyntax;
import org.openhealthtools.mdht.cts2.core.OpaqueData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rendering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationRenderingImpl#getLanguageAndSyntax <em>Language And Syntax</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationRenderingImpl#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AssociationRenderingImpl extends EObjectImpl implements AssociationRendering {
	/**
	 * The cached value of the '{@link #getLanguageAndSyntax() <em>Language And Syntax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLanguageAndSyntax()
	 * @generated
	 * @ordered
	 */
	protected OntologyLanguageAndSyntax languageAndSyntax;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected OpaqueData representation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssociationRenderingImpl() {
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
		return AssociationPackage.Literals.ASSOCIATION_RENDERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OntologyLanguageAndSyntax getLanguageAndSyntax() {
		return languageAndSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetLanguageAndSyntax(OntologyLanguageAndSyntax newLanguageAndSyntax,
			NotificationChain msgs) {
		OntologyLanguageAndSyntax oldLanguageAndSyntax = languageAndSyntax;
		languageAndSyntax = newLanguageAndSyntax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_RENDERING__LANGUAGE_AND_SYNTAX,
				oldLanguageAndSyntax, newLanguageAndSyntax);
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
	public void setLanguageAndSyntax(OntologyLanguageAndSyntax newLanguageAndSyntax) {
		if (newLanguageAndSyntax != languageAndSyntax) {
			NotificationChain msgs = null;
			if (languageAndSyntax != null) {
				msgs = ((InternalEObject) languageAndSyntax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION_RENDERING__LANGUAGE_AND_SYNTAX, null, msgs);
			}
			if (newLanguageAndSyntax != null) {
				msgs = ((InternalEObject) newLanguageAndSyntax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION_RENDERING__LANGUAGE_AND_SYNTAX, null, msgs);
			}
			msgs = basicSetLanguageAndSyntax(newLanguageAndSyntax, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_RENDERING__LANGUAGE_AND_SYNTAX,
				newLanguageAndSyntax, newLanguageAndSyntax));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OpaqueData getRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRepresentation(OpaqueData newRepresentation, NotificationChain msgs) {
		OpaqueData oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_RENDERING__REPRESENTATION, oldRepresentation,
				newRepresentation);
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
	public void setRepresentation(OpaqueData newRepresentation) {
		if (newRepresentation != representation) {
			NotificationChain msgs = null;
			if (representation != null) {
				msgs = ((InternalEObject) representation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION_RENDERING__REPRESENTATION, null, msgs);
			}
			if (newRepresentation != null) {
				msgs = ((InternalEObject) newRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION_RENDERING__REPRESENTATION, null, msgs);
			}
			msgs = basicSetRepresentation(newRepresentation, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_RENDERING__REPRESENTATION, newRepresentation,
				newRepresentation));
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
			case AssociationPackage.ASSOCIATION_RENDERING__LANGUAGE_AND_SYNTAX:
				return basicSetLanguageAndSyntax(null, msgs);
			case AssociationPackage.ASSOCIATION_RENDERING__REPRESENTATION:
				return basicSetRepresentation(null, msgs);
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
			case AssociationPackage.ASSOCIATION_RENDERING__LANGUAGE_AND_SYNTAX:
				return getLanguageAndSyntax();
			case AssociationPackage.ASSOCIATION_RENDERING__REPRESENTATION:
				return getRepresentation();
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
			case AssociationPackage.ASSOCIATION_RENDERING__LANGUAGE_AND_SYNTAX:
				setLanguageAndSyntax((OntologyLanguageAndSyntax) newValue);
				return;
			case AssociationPackage.ASSOCIATION_RENDERING__REPRESENTATION:
				setRepresentation((OpaqueData) newValue);
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
			case AssociationPackage.ASSOCIATION_RENDERING__LANGUAGE_AND_SYNTAX:
				setLanguageAndSyntax((OntologyLanguageAndSyntax) null);
				return;
			case AssociationPackage.ASSOCIATION_RENDERING__REPRESENTATION:
				setRepresentation((OpaqueData) null);
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
			case AssociationPackage.ASSOCIATION_RENDERING__LANGUAGE_AND_SYNTAX:
				return languageAndSyntax != null;
			case AssociationPackage.ASSOCIATION_RENDERING__REPRESENTATION:
				return representation != null;
		}
		return super.eIsSet(featureID);
	}

} // AssociationRenderingImpl
