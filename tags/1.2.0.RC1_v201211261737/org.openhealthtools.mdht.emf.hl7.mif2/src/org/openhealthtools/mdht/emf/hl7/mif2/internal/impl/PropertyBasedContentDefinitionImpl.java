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

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ConceptPropertyRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PropertyBasedContentDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Based Content Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PropertyBasedContentDefinitionImpl#getIncludeWithConceptProperty <em>Include With Concept Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PropertyBasedContentDefinitionImpl#getExcludeWithConceptProperty <em>Exclude With Concept Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PropertyBasedContentDefinitionImpl#getIncludeWithCodeProperty <em>Include With Code Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PropertyBasedContentDefinitionImpl#getExcludeWithCodeProperty <em>Exclude With Code Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyBasedContentDefinitionImpl extends EObjectImpl implements PropertyBasedContentDefinition {
	/**
	 * The cached value of the '{@link #getIncludeWithConceptProperty() <em>Include With Concept Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWithConceptProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptPropertyRef> includeWithConceptProperty;

	/**
	 * The cached value of the '{@link #getExcludeWithConceptProperty() <em>Exclude With Concept Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeWithConceptProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptPropertyRef> excludeWithConceptProperty;

	/**
	 * The cached value of the '{@link #getIncludeWithCodeProperty() <em>Include With Code Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWithCodeProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptPropertyRef> includeWithCodeProperty;

	/**
	 * The cached value of the '{@link #getExcludeWithCodeProperty() <em>Exclude With Code Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeWithCodeProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptPropertyRef> excludeWithCodeProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyBasedContentDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.PROPERTY_BASED_CONTENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptPropertyRef> getIncludeWithConceptProperty() {
		if (includeWithConceptProperty == null) {
			includeWithConceptProperty = new EObjectContainmentEList<ConceptPropertyRef>(
				ConceptPropertyRef.class, this,
				Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__INCLUDE_WITH_CONCEPT_PROPERTY);
		}
		return includeWithConceptProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptPropertyRef> getExcludeWithConceptProperty() {
		if (excludeWithConceptProperty == null) {
			excludeWithConceptProperty = new EObjectContainmentEList<ConceptPropertyRef>(
				ConceptPropertyRef.class, this,
				Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__EXCLUDE_WITH_CONCEPT_PROPERTY);
		}
		return excludeWithConceptProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptPropertyRef> getIncludeWithCodeProperty() {
		if (includeWithCodeProperty == null) {
			includeWithCodeProperty = new EObjectContainmentEList<ConceptPropertyRef>(
				ConceptPropertyRef.class, this,
				Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__INCLUDE_WITH_CODE_PROPERTY);
		}
		return includeWithCodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptPropertyRef> getExcludeWithCodeProperty() {
		if (excludeWithCodeProperty == null) {
			excludeWithCodeProperty = new EObjectContainmentEList<ConceptPropertyRef>(
				ConceptPropertyRef.class, this,
				Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__EXCLUDE_WITH_CODE_PROPERTY);
		}
		return excludeWithCodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__INCLUDE_WITH_CONCEPT_PROPERTY:
				return ((InternalEList<?>) getIncludeWithConceptProperty()).basicRemove(otherEnd, msgs);
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__EXCLUDE_WITH_CONCEPT_PROPERTY:
				return ((InternalEList<?>) getExcludeWithConceptProperty()).basicRemove(otherEnd, msgs);
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__INCLUDE_WITH_CODE_PROPERTY:
				return ((InternalEList<?>) getIncludeWithCodeProperty()).basicRemove(otherEnd, msgs);
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__EXCLUDE_WITH_CODE_PROPERTY:
				return ((InternalEList<?>) getExcludeWithCodeProperty()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__INCLUDE_WITH_CONCEPT_PROPERTY:
				return getIncludeWithConceptProperty();
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__EXCLUDE_WITH_CONCEPT_PROPERTY:
				return getExcludeWithConceptProperty();
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__INCLUDE_WITH_CODE_PROPERTY:
				return getIncludeWithCodeProperty();
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__EXCLUDE_WITH_CODE_PROPERTY:
				return getExcludeWithCodeProperty();
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
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__INCLUDE_WITH_CONCEPT_PROPERTY:
				getIncludeWithConceptProperty().clear();
				getIncludeWithConceptProperty().addAll((Collection<? extends ConceptPropertyRef>) newValue);
				return;
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__EXCLUDE_WITH_CONCEPT_PROPERTY:
				getExcludeWithConceptProperty().clear();
				getExcludeWithConceptProperty().addAll((Collection<? extends ConceptPropertyRef>) newValue);
				return;
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__INCLUDE_WITH_CODE_PROPERTY:
				getIncludeWithCodeProperty().clear();
				getIncludeWithCodeProperty().addAll((Collection<? extends ConceptPropertyRef>) newValue);
				return;
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__EXCLUDE_WITH_CODE_PROPERTY:
				getExcludeWithCodeProperty().clear();
				getExcludeWithCodeProperty().addAll((Collection<? extends ConceptPropertyRef>) newValue);
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
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__INCLUDE_WITH_CONCEPT_PROPERTY:
				getIncludeWithConceptProperty().clear();
				return;
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__EXCLUDE_WITH_CONCEPT_PROPERTY:
				getExcludeWithConceptProperty().clear();
				return;
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__INCLUDE_WITH_CODE_PROPERTY:
				getIncludeWithCodeProperty().clear();
				return;
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__EXCLUDE_WITH_CODE_PROPERTY:
				getExcludeWithCodeProperty().clear();
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
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__INCLUDE_WITH_CONCEPT_PROPERTY:
				return includeWithConceptProperty != null && !includeWithConceptProperty.isEmpty();
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__EXCLUDE_WITH_CONCEPT_PROPERTY:
				return excludeWithConceptProperty != null && !excludeWithConceptProperty.isEmpty();
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__INCLUDE_WITH_CODE_PROPERTY:
				return includeWithCodeProperty != null && !includeWithCodeProperty.isEmpty();
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION__EXCLUDE_WITH_CODE_PROPERTY:
				return excludeWithCodeProperty != null && !excludeWithCodeProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // PropertyBasedContentDefinitionImpl
