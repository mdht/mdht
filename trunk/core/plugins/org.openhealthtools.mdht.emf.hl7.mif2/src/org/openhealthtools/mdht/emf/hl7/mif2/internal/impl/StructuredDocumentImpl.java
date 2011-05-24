/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.BoundStaticModel;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.StructuredDocument;
import org.openhealthtools.mdht.emf.hl7.mif2.StructuredDocumentAnnotations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StructuredDocumentImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StructuredDocumentImpl#getDocumentDefinition <em>Document Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredDocumentImpl extends PackageArtifactImpl implements StructuredDocument {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected StructuredDocumentAnnotations annotations;

	/**
	 * The cached value of the '{@link #getDocumentDefinition() <em>Document Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentDefinition()
	 * @generated
	 * @ordered
	 */
	protected BoundStaticModel documentDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.STRUCTURED_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredDocumentAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(StructuredDocumentAnnotations newAnnotations, NotificationChain msgs) {
		StructuredDocumentAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.STRUCTURED_DOCUMENT__ANNOTATIONS, oldAnnotations, newAnnotations);
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
	 * @generated
	 */
	public void setAnnotations(StructuredDocumentAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null) {
				msgs = ((InternalEObject) annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STRUCTURED_DOCUMENT__ANNOTATIONS, null, msgs);
			}
			if (newAnnotations != null) {
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STRUCTURED_DOCUMENT__ANNOTATIONS, null, msgs);
			}
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STRUCTURED_DOCUMENT__ANNOTATIONS, newAnnotations, newAnnotations));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundStaticModel getDocumentDefinition() {
		return documentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentDefinition(BoundStaticModel newDocumentDefinition, NotificationChain msgs) {
		BoundStaticModel oldDocumentDefinition = documentDefinition;
		documentDefinition = newDocumentDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.STRUCTURED_DOCUMENT__DOCUMENT_DEFINITION, oldDocumentDefinition,
				newDocumentDefinition);
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
	 * @generated
	 */
	public void setDocumentDefinition(BoundStaticModel newDocumentDefinition) {
		if (newDocumentDefinition != documentDefinition) {
			NotificationChain msgs = null;
			if (documentDefinition != null) {
				msgs = ((InternalEObject) documentDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STRUCTURED_DOCUMENT__DOCUMENT_DEFINITION, null, msgs);
			}
			if (newDocumentDefinition != null) {
				msgs = ((InternalEObject) newDocumentDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STRUCTURED_DOCUMENT__DOCUMENT_DEFINITION, null, msgs);
			}
			msgs = basicSetDocumentDefinition(newDocumentDefinition, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STRUCTURED_DOCUMENT__DOCUMENT_DEFINITION, newDocumentDefinition,
				newDocumentDefinition));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.STRUCTURED_DOCUMENT__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.STRUCTURED_DOCUMENT__DOCUMENT_DEFINITION:
				return basicSetDocumentDefinition(null, msgs);
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
			case Mif2Package.STRUCTURED_DOCUMENT__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.STRUCTURED_DOCUMENT__DOCUMENT_DEFINITION:
				return getDocumentDefinition();
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
			case Mif2Package.STRUCTURED_DOCUMENT__ANNOTATIONS:
				setAnnotations((StructuredDocumentAnnotations) newValue);
				return;
			case Mif2Package.STRUCTURED_DOCUMENT__DOCUMENT_DEFINITION:
				setDocumentDefinition((BoundStaticModel) newValue);
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
			case Mif2Package.STRUCTURED_DOCUMENT__ANNOTATIONS:
				setAnnotations((StructuredDocumentAnnotations) null);
				return;
			case Mif2Package.STRUCTURED_DOCUMENT__DOCUMENT_DEFINITION:
				setDocumentDefinition((BoundStaticModel) null);
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
			case Mif2Package.STRUCTURED_DOCUMENT__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.STRUCTURED_DOCUMENT__DOCUMENT_DEFINITION:
				return documentDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} // StructuredDocumentImpl
