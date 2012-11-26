/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about a vocabulary domain that constrains the semantic values of one or more coded attributes or datatype properties.
 * UML: Stereotype on package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain#getSpecializesDomain <em>Specializes Domain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain#getExampleConcept <em>Example Concept</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain#getProperty <em>Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain#getSpecializedByDomain <em>Specialized By Domain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain#isIsBindable <em>Is Bindable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain#getSortKey <em>Sort Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptDomain()
 * @model extendedMetaData="name='ConceptDomain' kind='elementOnly'"
 * @generated
 */
public interface ConceptDomain extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Business Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.BusinessName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business names associated with the element. CURRENT- 0..1
	 * UML: Tag value inherited from ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Name</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptDomain_BusinessName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='businessName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BusinessName> getBusinessName();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about this vocabulary domain.
	 * UML: A collector for the comments and constraints associated with a concept domain.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(ConceptDomainAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptDomain_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptDomainAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(ConceptDomainAnnotations value);

	/**
	 * Returns the value of the '<em><b>Specializes Domain</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to another domain that is a proper superset of this domain.
	 * UML: A stereotype on dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specializes Domain</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptDomain_SpecializesDomain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specializesDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptDomainRef> getSpecializesDomain();

	/**
	 * Returns the value of the '<em><b>Example Concept</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual description of a concept considered to be part of the domain.  Used when domains are not bound to a universal, representative or example value set
	 * UML: Tag on ConceptDomain stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Example Concept</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptDomain_ExampleConcept()
	 * @model unique="false" dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='element' name='exampleConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getExampleConcept();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a property associated with the domain.
	 * UML: A stereotype on dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptDomain_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptDomainProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Specialized By Domain</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to another domain that is a proper subset of this domain.
	 * UML: A stereotype on dependency
	 * Derive: Todo
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specialized By Domain</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptDomain_SpecializedByDomain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specializedByDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptDomainRef> getSpecializedByDomain();

	/**
	 * Returns the value of the '<em><b>Is Bindable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether this domain can be bound to a value-set as part of a context binding.  If false, the domain can't be bound directly, though specializations might be bound.  Direct substitution with valuesets in derived static models is still possible.
	 * UML: tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Bindable</em>' attribute.
	 * @see #isSetIsBindable()
	 * @see #unsetIsBindable()
	 * @see #setIsBindable(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptDomain_IsBindable()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isBindable'"
	 * @generated
	 */
	boolean isIsBindable();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain#isIsBindable <em>Is Bindable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Bindable</em>' attribute.
	 * @see #isSetIsBindable()
	 * @see #unsetIsBindable()
	 * @see #isIsBindable()
	 * @generated
	 */
	void setIsBindable(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain#isIsBindable <em>Is Bindable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsBindable()
	 * @see #isIsBindable()
	 * @see #setIsBindable(boolean)
	 * @generated
	 */
	void unsetIsBindable();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain#isIsBindable <em>Is Bindable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Bindable</em>' attribute is set.
	 * @see #unsetIsBindable()
	 * @see #isIsBindable()
	 * @see #setIsBindable(boolean)
	 * @generated
	 */
	boolean isSetIsBindable();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique name of the concept domain
	 * UML: name attribute inherited from ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptDomain_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalProperName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name used in determining the sort order of the model element within its siblings.
	 * Impl: This will usually be a sequential number, but could be something else.
	 * UML: tag value within ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sort Key</em>' attribute.
	 * @see #setSortKey(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptDomain_SortKey()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='sortKey'"
	 * @generated
	 */
	String getSortKey();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain#getSortKey <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Key</em>' attribute.
	 * @see #getSortKey()
	 * @generated
	 */
	void setSortKey(String value);

} // ConceptDomain
