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
package org.openhealthtools.mdht.uml.cda.core.profile.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.core.profile.*;
import org.openhealthtools.mdht.uml.cda.core.profile.ActRelationship;
import org.openhealthtools.mdht.uml.cda.core.profile.AssociationValidation;
import org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage;
import org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate;
import org.openhealthtools.mdht.uml.cda.core.profile.ClassValidation;
import org.openhealthtools.mdht.uml.cda.core.profile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport;
import org.openhealthtools.mdht.uml.cda.core.profile.ConceptDomainConstraint;
import org.openhealthtools.mdht.uml.cda.core.profile.ConformsTo;
import org.openhealthtools.mdht.uml.cda.core.profile.ConstraintValidation;
import org.openhealthtools.mdht.uml.cda.core.profile.Entry;
import org.openhealthtools.mdht.uml.cda.core.profile.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.core.profile.NullFlavor;
import org.openhealthtools.mdht.uml.cda.core.profile.Participation;
import org.openhealthtools.mdht.uml.cda.core.profile.PropertyValidation;
import org.openhealthtools.mdht.uml.cda.core.profile.TextValue;
import org.openhealthtools.mdht.uml.cda.core.profile.Validation;
import org.openhealthtools.mdht.uml.cda.core.profile.ValueSetConstraint;
import org.openhealthtools.mdht.uml.cda.core.profile.VocabSpecification;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage
 * @generated
 */
public class CDAAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static CDAPackage modelPackage;

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CDASwitch<Adapter> modelSwitch = new CDASwitch<Adapter>() {
		@Override
		public Adapter caseEntry(Entry object) {
			return createEntryAdapter();
		}

		@Override
		public Adapter caseAssociationValidation(AssociationValidation object) {
			return createAssociationValidationAdapter();
		}

		@Override
		public Adapter caseValidation(Validation object) {
			return createValidationAdapter();
		}

		@Override
		public Adapter caseEntryRelationship(EntryRelationship object) {
			return createEntryRelationshipAdapter();
		}

		@Override
		public Adapter caseCodegenSupport(CodegenSupport object) {
			return createCodegenSupportAdapter();
		}

		@Override
		public Adapter casePropertyValidation(PropertyValidation object) {
			return createPropertyValidationAdapter();
		}

		@Override
		public Adapter caseClassValidation(ClassValidation object) {
			return createClassValidationAdapter();
		}

		@Override
		public Adapter caseVocabSpecification(VocabSpecification object) {
			return createVocabSpecificationAdapter();
		}

		@Override
		public Adapter caseNullFlavor(NullFlavor object) {
			return createNullFlavorAdapter();
		}

		@Override
		public Adapter caseTextValue(TextValue object) {
			return createTextValueAdapter();
		}

		@Override
		public Adapter caseCDATemplate(CDATemplate object) {
			return createCDATemplateAdapter();
		}

		@Override
		public Adapter caseConstraintValidation(ConstraintValidation object) {
			return createConstraintValidationAdapter();
		}

		@Override
		public Adapter caseConformsTo(ConformsTo object) {
			return createConformsToAdapter();
		}

		@Override
		public Adapter caseConceptDomainConstraint(ConceptDomainConstraint object) {
			return createConceptDomainConstraintAdapter();
		}

		@Override
		public Adapter caseCodeSystemConstraint(CodeSystemConstraint object) {
			return createCodeSystemConstraintAdapter();
		}

		@Override
		public Adapter caseValueSetConstraint(ValueSetConstraint object) {
			return createValueSetConstraintAdapter();
		}

		@Override
		public Adapter caseActRelationship(ActRelationship object) {
			return createActRelationshipAdapter();
		}

		@Override
		public Adapter caseParticipation(Participation object) {
			return createParticipationAdapter();
		}

		@Override
		public Adapter caseLogicalConstraint(LogicalConstraint object) {
			return createLogicalConstraintAdapter();
		}

		@Override
		public Adapter caseInline(Inline object) {
			return createInlineAdapter();
		}

		@Override
		public Adapter caseUnimplementable(Unimplementable object) {
			return createUnimplementableAdapter();
		}

		@Override
		public Adapter caseTerm_ConceptDomainConstraint(
				org.openhealthtools.mdht.uml.term.core.profile.ConceptDomainConstraint object) {
			return createTerm_ConceptDomainConstraintAdapter();
		}

		@Override
		public Adapter caseTerm_CodeSystemConstraint(
				org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint object) {
			return createTerm_CodeSystemConstraintAdapter();
		}

		@Override
		public Adapter caseTerm_ValueSetConstraint(
				org.openhealthtools.mdht.uml.term.core.profile.ValueSetConstraint object) {
			return createTerm_ValueSetConstraintAdapter();
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
	public CDAAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CDAPackage.eINSTANCE;
		}
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.ActRelationship <em>Act Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ActRelationship
	 * @generated
	 */
	public Adapter createActRelationshipAdapter() {
		return null;
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.AssociationValidation
	 * <em>Association Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.AssociationValidation
	 * @generated
	 */
	public Adapter createAssociationValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate
	 * @generated
	 */
	public Adapter createCDATemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.ClassValidation <em>Class Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ClassValidation
	 * @generated
	 */
	public Adapter createClassValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport <em>Codegen Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport
	 * @generated
	 */
	public Adapter createCodegenSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.CodeSystemConstraint
	 * <em>Code System Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CodeSystemConstraint
	 * @generated
	 */
	public Adapter createCodeSystemConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.ConceptDomainConstraint
	 * <em>Concept Domain Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ConceptDomainConstraint
	 * @generated
	 */
	public Adapter createConceptDomainConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.ConformsTo <em>Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ConformsTo
	 * @generated
	 */
	public Adapter createConformsToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.ConstraintValidation
	 * <em>Constraint Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ConstraintValidation
	 * @generated
	 */
	public Adapter createConstraintValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Entry
	 * @generated
	 */
	public Adapter createEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.EntryRelationship
	 * <em>Entry Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.EntryRelationship
	 * @generated
	 */
	public Adapter createEntryRelationshipAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.NullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.NullFlavor
	 * @generated
	 */
	public Adapter createNullFlavorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.Participation <em>Participation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Participation
	 * @generated
	 */
	public Adapter createParticipationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.LogicalConstraint
	 * <em>Logical Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.LogicalConstraint
	 * @generated
	 */
	public Adapter createLogicalConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.Inline <em>Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Inline
	 * @generated
	 */
	public Adapter createInlineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.Unimplementable <em>Unimplementable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Unimplementable
	 * @generated
	 */
	public Adapter createUnimplementableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.term.core.profile.ConceptDomainConstraint
	 * <em>Concept Domain Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.term.core.profile.ConceptDomainConstraint
	 * @generated
	 */
	public Adapter createTerm_ConceptDomainConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint
	 * <em>Code System Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint
	 * @generated
	 */
	public Adapter createTerm_CodeSystemConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetConstraint
	 * <em>Value Set Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.term.core.profile.ValueSetConstraint
	 * @generated
	 */
	public Adapter createTerm_ValueSetConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.PropertyValidation
	 * <em>Property Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.PropertyValidation
	 * @generated
	 */
	public Adapter createPropertyValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.TextValue <em>Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.TextValue
	 * @generated
	 */
	public Adapter createTextValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.Validation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Validation
	 * @generated
	 */
	public Adapter createValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.ValueSetConstraint
	 * <em>Value Set Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ValueSetConstraint
	 * @generated
	 */
	public Adapter createValueSetConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.profile.VocabSpecification
	 * <em>Vocab Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.VocabSpecification
	 * @generated
	 */
	public Adapter createVocabSpecificationAdapter() {
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

} // CDAAdapterFactory
