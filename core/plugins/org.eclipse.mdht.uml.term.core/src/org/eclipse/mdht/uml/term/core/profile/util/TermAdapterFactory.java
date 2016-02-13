/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.term.core.profile.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.term.core.profile.CD;
import org.eclipse.mdht.uml.term.core.profile.CR;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemVersion;
import org.eclipse.mdht.uml.term.core.profile.ConceptDomain;
import org.eclipse.mdht.uml.term.core.profile.ConceptDomainConstraint;
import org.eclipse.mdht.uml.term.core.profile.TermPackage;
import org.eclipse.mdht.uml.term.core.profile.UsageContext;
import org.eclipse.mdht.uml.term.core.profile.ValueSetCode;
import org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint;
import org.eclipse.mdht.uml.term.core.profile.ValueSetContextBinding;
import org.eclipse.mdht.uml.term.core.profile.ValueSetVersion;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage
 * @generated
 */
public class TermAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static TermPackage modelPackage;

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TermSwitch<Adapter> modelSwitch = new TermSwitch<Adapter>() {
		@Override
		public Adapter caseCD(CD object) {
			return createCDAdapter();
		}

		@Override
		public Adapter caseCR(CR object) {
			return createCRAdapter();
		}

		@Override
		public Adapter caseConceptDomainConstraint(ConceptDomainConstraint object) {
			return createConceptDomainConstraintAdapter();
		}

		@Override
		public Adapter caseConceptDomain(ConceptDomain object) {
			return createConceptDomainAdapter();
		}

		@Override
		public Adapter caseCodeSystemConstraint(CodeSystemConstraint object) {
			return createCodeSystemConstraintAdapter();
		}

		@Override
		public Adapter caseCodeSystemVersion(CodeSystemVersion object) {
			return createCodeSystemVersionAdapter();
		}

		@Override
		public Adapter caseValueSetConstraint(ValueSetConstraint object) {
			return createValueSetConstraintAdapter();
		}

		@Override
		public Adapter caseValueSetVersion(ValueSetVersion object) {
			return createValueSetVersionAdapter();
		}

		@Override
		public Adapter caseValueSetCode(ValueSetCode object) {
			return createValueSetCodeAdapter();
		}

		@Override
		public Adapter caseValueSetContextBinding(ValueSetContextBinding object) {
			return createValueSetContextBindingAdapter();
		}

		@Override
		public Adapter caseUsageContext(UsageContext object) {
			return createUsageContextAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public TermAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TermPackage.eINSTANCE;
		}
	}

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.term.core.profile.CD <em>CD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.term.core.profile.CD
	 * @generated
	 */
	public Adapter createCDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.term.core.profile.CodeSystemConstraint
	 * <em>Code System Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.term.core.profile.CodeSystemConstraint
	 * @generated
	 */
	public Adapter createCodeSystemConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.term.core.profile.CodeSystemVersion <em>Code System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.term.core.profile.CodeSystemVersion
	 * @generated
	 */
	public Adapter createCodeSystemVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.term.core.profile.ConceptDomain <em>Concept Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.term.core.profile.ConceptDomain
	 * @generated
	 */
	public Adapter createConceptDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.term.core.profile.ConceptDomainConstraint
	 * <em>Concept Domain Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.term.core.profile.ConceptDomainConstraint
	 * @generated
	 */
	public Adapter createConceptDomainConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.term.core.profile.CR <em>CR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.term.core.profile.CR
	 * @generated
	 */
	public Adapter createCRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.term.core.profile.UsageContext <em>Usage Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.term.core.profile.UsageContext
	 * @generated
	 */
	public Adapter createUsageContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.term.core.profile.ValueSetCode <em>Value Set Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.term.core.profile.ValueSetCode
	 * @generated
	 */
	public Adapter createValueSetCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint <em>Value Set Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint
	 * @generated
	 */
	public Adapter createValueSetConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.term.core.profile.ValueSetContextBinding
	 * <em>Value Set Context Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.term.core.profile.ValueSetContextBinding
	 * @generated
	 */
	public Adapter createValueSetContextBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.term.core.profile.ValueSetVersion <em>Value Set Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.term.core.profile.ValueSetVersion
	 * @generated
	 */
	public Adapter createValueSetVersionAdapter() {
		return null;
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 *
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

} // TermAdapterFactory
