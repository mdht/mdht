/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.example;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.example.ExamplePackage
 * @generated
 */
public interface ExampleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExampleFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.example.impl.ExampleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>My Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Document</em>'.
	 * @generated
	 */
	MyDocument createMyDocument();

	/**
	 * Returns a new object of class '<em>My Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Activity</em>'.
	 * @generated
	 */
	MyActivity createMyActivity();

	/**
	 * Returns a new object of class '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Section</em>'.
	 * @generated
	 */
	MySection createMySection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExamplePackage getExamplePackage();

} //ExampleFactory
