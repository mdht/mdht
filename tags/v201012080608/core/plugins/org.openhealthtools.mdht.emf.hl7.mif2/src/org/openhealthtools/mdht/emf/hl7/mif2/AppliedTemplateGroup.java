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
 * A representation of the model object '<em><b>Applied Template Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group of one or more templates that must be true for elements instantiated from a particular attribute or association
 * UML: Type for a complex tag
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AppliedTemplateGroup#getTemplateId <em>Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAppliedTemplateGroup()
 * @model extendedMetaData="name='AppliedTemplateGroup' kind='elementOnly'"
 * @generated
 */
public interface AppliedTemplateGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Template Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This indicates one of the templates that must be true for the template group to be true.
	 * UML: Element within a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Id</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAppliedTemplateGroup_TemplateId()
	 * @model unique="false" dataType="org.openhealthtools.mdht.emf.hl7.mif2.TemplateId" required="true"
	 *        extendedMetaData="kind='element' name='templateId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getTemplateId();

} // AppliedTemplateGroup
