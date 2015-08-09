/**
 */
package org.eclipse.mdht.uml.fhir;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.FHIRPackage
 * @generated
 */
public interface FHIRFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FHIRFactory eINSTANCE = org.eclipse.mdht.uml.fhir.impl.FHIRFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Type Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Choice</em>'.
	 * @generated
	 */
	TypeChoice createTypeChoice();

	/**
	 * Returns a new object of class '<em>Structure Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Definition</em>'.
	 * @generated
	 */
	StructureDefinition createStructureDefinition();

	/**
	 * Returns a new object of class '<em>Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Definition</em>'.
	 * @generated
	 */
	ElementDefinition createElementDefinition();

	/**
	 * Returns a new object of class '<em>Short Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Short Description</em>'.
	 * @generated
	 */
	ShortDescription createShortDescription();

	/**
	 * Returns a new object of class '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description</em>'.
	 * @generated
	 */
	Description createDescription();

	/**
	 * Returns a new object of class '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition</em>'.
	 * @generated
	 */
	Definition createDefinition();

	/**
	 * Returns a new object of class '<em>Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements</em>'.
	 * @generated
	 */
	Requirements createRequirements();

	/**
	 * Returns a new object of class '<em>Comments</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comments</em>'.
	 * @generated
	 */
	Comments createComments();

	/**
	 * Returns a new object of class '<em>Value Set Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Binding</em>'.
	 * @generated
	 */
	ValueSetBinding createValueSetBinding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FHIRPackage getFHIRPackage();

} //FHIRFactory
