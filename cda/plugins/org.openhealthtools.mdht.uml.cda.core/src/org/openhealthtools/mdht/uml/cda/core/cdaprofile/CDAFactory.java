/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.cdaprofile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage
 * @generated
 */
public interface CDAFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CDAFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDAFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Validation Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validation Support</em>'.
	 * @generated
	 */
	ValidationSupport createValidationSupport();

	/**
	 * Returns a new object of class '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry</em>'.
	 * @generated
	 */
	Entry createEntry();

	/**
	 * Returns a new object of class '<em>Association Validation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Validation</em>'.
	 * @generated
	 */
	AssociationValidation createAssociationValidation();

	/**
	 * Returns a new object of class '<em>Entry Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Relationship</em>'.
	 * @generated
	 */
	EntryRelationship createEntryRelationship();

	/**
	 * Returns a new object of class '<em>Codegen Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Codegen Support</em>'.
	 * @generated
	 */
	CodegenSupport createCodegenSupport();

	/**
	 * Returns a new object of class '<em>Property Validation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Validation</em>'.
	 * @generated
	 */
	PropertyValidation createPropertyValidation();

	/**
	 * Returns a new object of class '<em>Class Validation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Validation</em>'.
	 * @generated
	 */
	ClassValidation createClassValidation();

	/**
	 * Returns a new object of class '<em>Vocab Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vocab Specification</em>'.
	 * @generated
	 */
	VocabSpecification createVocabSpecification();

	/**
	 * Returns a new object of class '<em>Null Flavor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Flavor</em>'.
	 * @generated
	 */
	NullFlavor createNullFlavor();

	/**
	 * Returns a new object of class '<em>Text Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Value</em>'.
	 * @generated
	 */
	TextValue createTextValue();

	/**
	 * Returns a new object of class '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template</em>'.
	 * @generated
	 */
	CDATemplate createCDATemplate();

	/**
	 * Returns a new object of class '<em>Constraint Validation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Validation</em>'.
	 * @generated
	 */
	ConstraintValidation createConstraintValidation();

	/**
	 * Returns a new object of class '<em>Conforms To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conforms To</em>'.
	 * @generated
	 */
	ConformsTo createConformsTo();

	/**
	 * Returns a new object of class '<em>Concept Domain Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Domain Constraint</em>'.
	 * @generated
	 */
	ConceptDomainConstraint createConceptDomainConstraint();

	/**
	 * Returns a new object of class '<em>Code System Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code System Constraint</em>'.
	 * @generated
	 */
	CodeSystemConstraint createCodeSystemConstraint();

	/**
	 * Returns a new object of class '<em>Value Set Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Constraint</em>'.
	 * @generated
	 */
	ValueSetConstraint createValueSetConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CDAPackage getCDAPackage();

} //CDAFactory
