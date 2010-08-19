/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies the parameterized datatype being 'instantiated', as well as the types to use for each parameter
 * UML: The binding dependency that links to the datatype that the current datatype binds to
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeBinding#getTargetDatatype <em>Target Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeBinding#getArgumentDatatype <em>Argument Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeBinding()
 * @model extendedMetaData="name='DatatypeBinding' kind='elementOnly'"
 * @generated
 */
public interface DatatypeBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The template datatype that this definition 'instantiates'
	 * UML: Datatype that is the target of the binding dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Datatype</em>' containment reference.
	 * @see #setTargetDatatype(DatatypeRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeBinding_TargetDatatype()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='targetDatatype' namespace='##targetNamespace'"
	 * @generated
	 */
	DatatypeRef getTargetDatatype();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeBinding#getTargetDatatype <em>Target Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Datatype</em>' containment reference.
	 * @see #getTargetDatatype()
	 * @generated
	 */
	void setTargetDatatype(DatatypeRef value);

	/**
	 * Returns the value of the '<em><b>Argument Datatype</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A parameter bound to the template datatype that this definition 'instantiates'
	 * UML: Datatype that is the argument model element for the binding dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument Datatype</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeBinding_ArgumentDatatype()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='argumentDatatype' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatatypeRef> getArgumentDatatype();

} // DatatypeBinding
