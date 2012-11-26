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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.Glossary;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.TermDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glossary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.GlossaryImpl#getImportedGlossary <em>Imported Glossary</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.GlossaryImpl#getTermDefinition <em>Term Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlossaryImpl extends PackageImpl implements Glossary {
	/**
	 * The cached value of the '{@link #getImportedGlossary() <em>Imported Glossary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedGlossary()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRef> importedGlossary;

	/**
	 * The cached value of the '{@link #getTermDefinition() <em>Term Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<TermDefinition> termDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlossaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.GLOSSARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRef> getImportedGlossary() {
		if (importedGlossary == null) {
			importedGlossary = new EObjectContainmentEList<PackageRef>(
				PackageRef.class, this, Mif2Package.GLOSSARY__IMPORTED_GLOSSARY);
		}
		return importedGlossary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TermDefinition> getTermDefinition() {
		if (termDefinition == null) {
			termDefinition = new EObjectContainmentEList<TermDefinition>(
				TermDefinition.class, this, Mif2Package.GLOSSARY__TERM_DEFINITION);
		}
		return termDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.GLOSSARY__IMPORTED_GLOSSARY:
				return ((InternalEList<?>) getImportedGlossary()).basicRemove(otherEnd, msgs);
			case Mif2Package.GLOSSARY__TERM_DEFINITION:
				return ((InternalEList<?>) getTermDefinition()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.GLOSSARY__IMPORTED_GLOSSARY:
				return getImportedGlossary();
			case Mif2Package.GLOSSARY__TERM_DEFINITION:
				return getTermDefinition();
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
			case Mif2Package.GLOSSARY__IMPORTED_GLOSSARY:
				getImportedGlossary().clear();
				getImportedGlossary().addAll((Collection<? extends PackageRef>) newValue);
				return;
			case Mif2Package.GLOSSARY__TERM_DEFINITION:
				getTermDefinition().clear();
				getTermDefinition().addAll((Collection<? extends TermDefinition>) newValue);
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
			case Mif2Package.GLOSSARY__IMPORTED_GLOSSARY:
				getImportedGlossary().clear();
				return;
			case Mif2Package.GLOSSARY__TERM_DEFINITION:
				getTermDefinition().clear();
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
			case Mif2Package.GLOSSARY__IMPORTED_GLOSSARY:
				return importedGlossary != null && !importedGlossary.isEmpty();
			case Mif2Package.GLOSSARY__TERM_DEFINITION:
				return termDefinition != null && !termDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // GlossaryImpl
