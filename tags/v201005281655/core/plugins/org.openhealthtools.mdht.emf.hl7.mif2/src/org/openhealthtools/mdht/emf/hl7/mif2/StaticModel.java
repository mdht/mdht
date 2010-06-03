/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModel#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModel#getContainedClass <em>Contained Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModel#getAssociation <em>Association</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModel()
 * @model extendedMetaData="name='StaticModel' kind='elementOnly'"
 * @generated
 */
public interface StaticModel extends StaticModelBase {
	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.EntryPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a class within the model that may be used as the initial class in a serializable representation of the model.
	 * UML: An interface that is implemented by the SubSystem
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Point</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModel_EntryPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='entryPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntryPoint> getEntryPoint();

	/**
	 * Returns the value of the '<em><b>Contained Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ClassElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classes that are part of the model
	 * UML: A class owned by the package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Class</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModel_ContainedClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='containedClass' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClassElement> getContainedClass();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The associations that are part of the static model
	 * UML: The associations that are part of the static model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModel_Association()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='association' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Association> getAssociation();

} // StaticModel
