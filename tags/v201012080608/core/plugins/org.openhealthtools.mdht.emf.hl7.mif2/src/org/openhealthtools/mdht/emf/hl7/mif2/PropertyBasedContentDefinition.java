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
 * A representation of the model object '<em><b>Property Based Content Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Filters the codes to include based on properties.  If includeProperties are specified, only those having all of the 'included' properties and not having any of the 'excluded' properties are included.  Otherwise all those codes without any of the 'excluded' properties are included.
 * UML: Defines the code enumerations imported into this package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PropertyBasedContentDefinition#getIncludeWithConceptProperty <em>Include With Concept Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PropertyBasedContentDefinition#getExcludeWithConceptProperty <em>Exclude With Concept Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PropertyBasedContentDefinition#getIncludeWithCodeProperty <em>Include With Code Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PropertyBasedContentDefinition#getExcludeWithCodeProperty <em>Exclude With Code Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPropertyBasedContentDefinition()
 * @model extendedMetaData="name='PropertyBasedContentDefinition' kind='elementOnly'"
 * @generated
 */
public interface PropertyBasedContentDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Include With Concept Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptPropertyRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the value set should be filtered to only include codes for concepts from the code system with the specified property
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include With Concept Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPropertyBasedContentDefinition_IncludeWithConceptProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='includeWithConceptProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptPropertyRef> getIncludeWithConceptProperty();

	/**
	 * Returns the value of the '<em><b>Exclude With Concept Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptPropertyRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the value set should be filtered to only include codes for concepts from the code system that do not have the specified property
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude With Concept Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPropertyBasedContentDefinition_ExcludeWithConceptProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='excludeWithConceptProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptPropertyRef> getExcludeWithConceptProperty();

	/**
	 * Returns the value of the '<em><b>Include With Code Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptPropertyRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the value set should be filtered to only include codes from the code system with the specified property
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include With Code Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPropertyBasedContentDefinition_IncludeWithCodeProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='includeWithCodeProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptPropertyRef> getIncludeWithCodeProperty();

	/**
	 * Returns the value of the '<em><b>Exclude With Code Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptPropertyRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the value set should be filtered to only include codes from the code system that do not have the specified property
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude With Code Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPropertyBasedContentDefinition_ExcludeWithCodeProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='excludeWithCodeProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptPropertyRef> getExcludeWithCodeProperty();

} // PropertyBasedContentDefinition
