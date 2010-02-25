/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.cdaprofile.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.core.cdaprofile.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage
 * @generated
 */
public class CDAAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CDAPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDAAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CDAPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDASwitch<Adapter> modelSwitch =
		new CDASwitch<Adapter>() {
			@Override
			public Adapter caseValidationSupport(ValidationSupport object) {
				return createValidationSupportAdapter();
			}
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
			public Adapter caseConceptDomainConstraint_1(org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomainConstraint object) {
				return createConceptDomainConstraint_1Adapter();
			}
			@Override
			public Adapter caseCodeSystemConstraint_1(org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint object) {
				return createCodeSystemConstraint_1Adapter();
			}
			@Override
			public Adapter caseValueSetConstraint_1(org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetConstraint object) {
				return createValueSetConstraint_1Adapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValidationSupport <em>Validation Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValidationSupport
	 * @generated
	 */
	public Adapter createValidationSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.Entry
	 * @generated
	 */
	public Adapter createEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.AssociationValidation <em>Association Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.AssociationValidation
	 * @generated
	 */
	public Adapter createAssociationValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.Validation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.Validation
	 * @generated
	 */
	public Adapter createValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationship <em>Entry Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.EntryRelationship
	 * @generated
	 */
	public Adapter createEntryRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodegenSupport <em>Codegen Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodegenSupport
	 * @generated
	 */
	public Adapter createCodegenSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.PropertyValidation <em>Property Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.PropertyValidation
	 * @generated
	 */
	public Adapter createPropertyValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ClassValidation <em>Class Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ClassValidation
	 * @generated
	 */
	public Adapter createClassValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.VocabSpecification <em>Vocab Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.VocabSpecification
	 * @generated
	 */
	public Adapter createVocabSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.NullFlavor
	 * @generated
	 */
	public Adapter createNullFlavorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.TextValue <em>Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.TextValue
	 * @generated
	 */
	public Adapter createTextValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDATemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDATemplate
	 * @generated
	 */
	public Adapter createCDATemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConstraintValidation <em>Constraint Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConstraintValidation
	 * @generated
	 */
	public Adapter createConstraintValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConformsTo <em>Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConformsTo
	 * @generated
	 */
	public Adapter createConformsToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConceptDomainConstraint <em>Concept Domain Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ConceptDomainConstraint
	 * @generated
	 */
	public Adapter createConceptDomainConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodeSystemConstraint <em>Code System Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CodeSystemConstraint
	 * @generated
	 */
	public Adapter createCodeSystemConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValueSetConstraint <em>Value Set Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.ValueSetConstraint
	 * @generated
	 */
	public Adapter createValueSetConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomainConstraint <em>Concept Domain Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomainConstraint
	 * @generated
	 */
	public Adapter createConceptDomainConstraint_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint <em>Code System Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint
	 * @generated
	 */
	public Adapter createCodeSystemConstraint_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetConstraint <em>Value Set Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetConstraint
	 * @generated
	 */
	public Adapter createValueSetConstraint_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CDAAdapterFactory
