/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Property Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to reference a coded concept property, possibly with a specific value or matching a given expression.  If neither value nor expresson are specified, the reference will match all concepts with the specified property regardless of value.
 * UML: Reference to a stereotype property
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptPropertyRef#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptPropertyRef#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptPropertyRef#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptPropertyRef()
 * @model extendedMetaData="name='ConceptPropertyRef' kind='empty'"
 * @generated
 */
public interface ConceptPropertyRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a regular expression that must be matched by the referenced property
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptPropertyRef_Expression()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.LongDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='expression'"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptPropertyRef#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the name of the property being referenced
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptPropertyRef_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptPropertyRef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the value the referenced property must have.
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptPropertyRef_Value()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.LongDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptPropertyRef#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ConceptPropertyRef
