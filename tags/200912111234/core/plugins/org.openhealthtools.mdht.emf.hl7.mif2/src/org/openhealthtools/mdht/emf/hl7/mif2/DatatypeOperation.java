/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the content for a datatypeOperation
 * UML: The basic part of the DatatypeOperation stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getType <em>Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getVocabularySpecification <em>Vocabulary Specification</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getMaximumMultiplicity <em>Maximum Multiplicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getMinimumMultiplicity <em>Minimum Multiplicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getOwnerScope <em>Owner Scope</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getPropertyKind <em>Property Kind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeOperation()
 * @model extendedMetaData="name='DatatypeOperation' kind='elementOnly'"
 * @generated
 */
public interface DatatypeOperation extends Feature {
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeOperation_BusinessName()
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
	 * Descriptive information about the containing element.
	 * UML: Inherited from modelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(OperationAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeOperation_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(OperationAnnotations value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the property and the datatype from which the current property is derived.
	 * UML: Property with a derivedFrom dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference.
	 * @see #setDerivedFrom(OperationDerivation)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeOperation_DerivedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationDerivation getDerivedFrom();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getDerivedFrom <em>Derived From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived From</em>' containment reference.
	 * @see #getDerivedFrom()
	 * @generated
	 */
	void setDerivedFrom(OperationDerivation value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.OperationParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A parameter passed to the property used in determining the value for the property.
	 * UML: Parameter of 'input' type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeOperation_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OperationParameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the type of the data exposed by the property.
	 * UML: return type of 'typed' BehavioralFeature
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(DatatypeRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeOperation_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	DatatypeRef getType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DatatypeRef value);

	/**
	 * Returns the value of the '<em><b>Vocabulary Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the HL7 vocabulary to define the set of allowed values that may be conveyed by this property.
	 * UML: Association to the conceptDomain - need to figure out what association
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vocabulary Specification</em>' containment reference.
	 * @see #setVocabularySpecification(VocabularySpecification)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeOperation_VocabularySpecification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vocabularySpecification' namespace='##targetNamespace'"
	 * @generated
	 */
	VocabularySpecification getVocabularySpecification();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getVocabularySpecification <em>Vocabulary Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vocabulary Specification</em>' containment reference.
	 * @see #getVocabularySpecification()
	 * @generated
	 */
	void setVocabularySpecification(VocabularySpecification value);

	/**
	 * Returns the value of the '<em><b>Maximum Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the maximum number of repetitions of this element that may occur within the containing element.
	 * UML: multiplicity (upper-bound)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Multiplicity</em>' attribute.
	 * @see #setMaximumMultiplicity(Object)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeOperation_MaximumMultiplicity()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.UnlimitedInteger"
	 *        extendedMetaData="kind='attribute' name='maximumMultiplicity'"
	 * @generated
	 */
	Object getMaximumMultiplicity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getMaximumMultiplicity <em>Maximum Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Multiplicity</em>' attribute.
	 * @see #getMaximumMultiplicity()
	 * @generated
	 */
	void setMaximumMultiplicity(Object value);

	/**
	 * Returns the value of the '<em><b>Minimum Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the minimum number of repetitions of this element that may occur within the containing element.
	 * UML: multiplicity (lower-bound)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Multiplicity</em>' attribute.
	 * @see #setMinimumMultiplicity(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeOperation_MinimumMultiplicity()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallNonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='minimumMultiplicity'"
	 * @generated
	 */
	BigInteger getMinimumMultiplicity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getMinimumMultiplicity <em>Minimum Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Multiplicity</em>' attribute.
	 * @see #getMinimumMultiplicity()
	 * @generated
	 */
	void setMinimumMultiplicity(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the property
	 * UML: Name inherited from DataElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeOperation_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalPropertyName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owner Scope</b></em>' attribute.
	 * The default value is <code>"instance"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.OwnerScopeKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the the property exists at the datatype definition level or instance level.
	 * UML: ownerScope
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner Scope</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.OwnerScopeKind
	 * @see #isSetOwnerScope()
	 * @see #unsetOwnerScope()
	 * @see #setOwnerScope(OwnerScopeKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeOperation_OwnerScope()
	 * @model default="instance" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ownerScope'"
	 * @generated
	 */
	OwnerScopeKind getOwnerScope();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getOwnerScope <em>Owner Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Scope</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.OwnerScopeKind
	 * @see #isSetOwnerScope()
	 * @see #unsetOwnerScope()
	 * @see #getOwnerScope()
	 * @generated
	 */
	void setOwnerScope(OwnerScopeKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getOwnerScope <em>Owner Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOwnerScope()
	 * @see #getOwnerScope()
	 * @see #setOwnerScope(OwnerScopeKind)
	 * @generated
	 */
	void unsetOwnerScope();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getOwnerScope <em>Owner Scope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Owner Scope</em>' attribute is set.
	 * @see #unsetOwnerScope()
	 * @see #getOwnerScope()
	 * @see #setOwnerScope(OwnerScopeKind)
	 * @generated
	 */
	boolean isSetOwnerScope();

	/**
	 * Returns the value of the '<em><b>Property Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the variety of property being represented.  This attribute influences how the property is represented for display purposes in documentation.
	 * UML: Tagged value on datatypeProperty
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperationKind
	 * @see #isSetPropertyKind()
	 * @see #unsetPropertyKind()
	 * @see #setPropertyKind(DatatypeOperationKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeOperation_PropertyKind()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='propertyKind'"
	 * @generated
	 */
	DatatypeOperationKind getPropertyKind();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getPropertyKind <em>Property Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperationKind
	 * @see #isSetPropertyKind()
	 * @see #unsetPropertyKind()
	 * @see #getPropertyKind()
	 * @generated
	 */
	void setPropertyKind(DatatypeOperationKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getPropertyKind <em>Property Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPropertyKind()
	 * @see #getPropertyKind()
	 * @see #setPropertyKind(DatatypeOperationKind)
	 * @generated
	 */
	void unsetPropertyKind();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getPropertyKind <em>Property Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Property Kind</em>' attribute is set.
	 * @see #unsetPropertyKind()
	 * @see #getPropertyKind()
	 * @see #setPropertyKind(DatatypeOperationKind)
	 * @generated
	 */
	boolean isSetPropertyKind();

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeOperation_SortKey()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='sortKey'"
	 * @generated
	 */
	String getSortKey();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getSortKey <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Key</em>' attribute.
	 * @see #getSortKey()
	 * @generated
	 */
	void setSortKey(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies whether the operation may be invoked by specializations or outside of the type
	 * UML: visibility
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VisibilityKind
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #setVisibility(VisibilityKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeOperation_Visibility()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='visibility'"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VisibilityKind
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(VisibilityKind)
	 * @generated
	 */
	void unsetVisibility();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation#getVisibility <em>Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visibility</em>' attribute is set.
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(VisibilityKind)
	 * @generated
	 */
	boolean isSetVisibility();

} // DatatypeOperation
