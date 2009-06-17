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
 * A representation of the model object '<em><b>Association End Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Identifies a class that specialize the paricipant class for this association end
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndSpecialization#getChoiceItem <em>Choice Item</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndSpecialization#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndSpecialization#getTraversalName <em>Traversal Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndSpecialization()
 * @model extendedMetaData="name='AssociationEndSpecialization' kind='elementOnly'"
 * @generated
 */
public interface AssociationEndSpecialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Choice Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndSpecialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For specializations that are choices or CMETs whose root is a choice, identifies the classes within the choice and the association names tied to those classes.
	 * UML: Identifies classes that specialize this generalized class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Choice Item</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndSpecialization_ChoiceItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='choiceItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AssociationEndSpecialization> getChoiceItem();

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the class
	 * UML: Name of the specializing class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndSpecialization_ClassName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.AllClassName" required="true"
	 *        extendedMetaData="kind='attribute' name='className'"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndSpecialization#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Traversal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the element when traversing from the association end directly to this specialized class
	 * UML: tagged element on the specialized class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Traversal Name</em>' attribute.
	 * @see #setTraversalName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEndSpecialization_TraversalName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalPropertyName"
	 *        extendedMetaData="kind='attribute' name='traversalName'"
	 * @generated
	 */
	String getTraversalName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndSpecialization#getTraversalName <em>Traversal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traversal Name</em>' attribute.
	 * @see #getTraversalName()
	 * @generated
	 */
	void setTraversalName(String value);

} // AssociationEndSpecialization
