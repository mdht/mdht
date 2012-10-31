/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.OntologyLanguageAndSyntax;
import org.openhealthtools.mdht.cts2.core.OntologyLanguageReference;
import org.openhealthtools.mdht.cts2.core.OntologySyntaxReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology Language And Syntax</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.OntologyLanguageAndSyntaxImpl#getOntologyLanguage <em>Ontology Language</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.OntologyLanguageAndSyntaxImpl#getOntologySyntax <em>Ontology Syntax</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class OntologyLanguageAndSyntaxImpl extends EObjectImpl implements OntologyLanguageAndSyntax {
	/**
	 * The cached value of the '{@link #getOntologyLanguage() <em>Ontology Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOntologyLanguage()
	 * @generated
	 * @ordered
	 */
	protected OntologyLanguageReference ontologyLanguage;

	/**
	 * The cached value of the '{@link #getOntologySyntax() <em>Ontology Syntax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOntologySyntax()
	 * @generated
	 * @ordered
	 */
	protected OntologySyntaxReference ontologySyntax;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected OntologyLanguageAndSyntaxImpl() {
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
		return CorePackage.Literals.ONTOLOGY_LANGUAGE_AND_SYNTAX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OntologyLanguageReference getOntologyLanguage() {
		return ontologyLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetOntologyLanguage(OntologyLanguageReference newOntologyLanguage,
			NotificationChain msgs) {
		OntologyLanguageReference oldOntologyLanguage = ontologyLanguage;
		ontologyLanguage = newOntologyLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_LANGUAGE,
				oldOntologyLanguage, newOntologyLanguage);
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
	public void setOntologyLanguage(OntologyLanguageReference newOntologyLanguage) {
		if (newOntologyLanguage != ontologyLanguage) {
			NotificationChain msgs = null;
			if (ontologyLanguage != null) {
				msgs = ((InternalEObject) ontologyLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_LANGUAGE, null, msgs);
			}
			if (newOntologyLanguage != null) {
				msgs = ((InternalEObject) newOntologyLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_LANGUAGE, null, msgs);
			}
			msgs = basicSetOntologyLanguage(newOntologyLanguage, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_LANGUAGE,
				newOntologyLanguage, newOntologyLanguage));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OntologySyntaxReference getOntologySyntax() {
		return ontologySyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetOntologySyntax(OntologySyntaxReference newOntologySyntax, NotificationChain msgs) {
		OntologySyntaxReference oldOntologySyntax = ontologySyntax;
		ontologySyntax = newOntologySyntax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_SYNTAX, oldOntologySyntax,
				newOntologySyntax);
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
	public void setOntologySyntax(OntologySyntaxReference newOntologySyntax) {
		if (newOntologySyntax != ontologySyntax) {
			NotificationChain msgs = null;
			if (ontologySyntax != null) {
				msgs = ((InternalEObject) ontologySyntax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_SYNTAX, null, msgs);
			}
			if (newOntologySyntax != null) {
				msgs = ((InternalEObject) newOntologySyntax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_SYNTAX, null, msgs);
			}
			msgs = basicSetOntologySyntax(newOntologySyntax, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_SYNTAX, newOntologySyntax,
				newOntologySyntax));
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
			case CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_LANGUAGE:
				return basicSetOntologyLanguage(null, msgs);
			case CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_SYNTAX:
				return basicSetOntologySyntax(null, msgs);
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
			case CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_LANGUAGE:
				return getOntologyLanguage();
			case CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_SYNTAX:
				return getOntologySyntax();
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
			case CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_LANGUAGE:
				setOntologyLanguage((OntologyLanguageReference) newValue);
				return;
			case CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_SYNTAX:
				setOntologySyntax((OntologySyntaxReference) newValue);
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
			case CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_LANGUAGE:
				setOntologyLanguage((OntologyLanguageReference) null);
				return;
			case CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_SYNTAX:
				setOntologySyntax((OntologySyntaxReference) null);
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
			case CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_LANGUAGE:
				return ontologyLanguage != null;
			case CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_SYNTAX:
				return ontologySyntax != null;
		}
		return super.eIsSet(featureID);
	}

} // OntologyLanguageAndSyntaxImpl
