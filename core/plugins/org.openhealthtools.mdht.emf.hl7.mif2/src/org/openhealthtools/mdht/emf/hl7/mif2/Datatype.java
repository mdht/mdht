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
 * A representation of the model object '<em><b>Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The definition of a structure for transmitting and persisting fundamental concepts within a model.
 * UML: DatatypeDefinition stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getHasDerivations <em>Has Derivations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getEnumerationValue <em>Enumeration Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getChildDatatype <em>Child Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getParentDatatype <em>Parent Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getProperty <em>Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getDatatypeKind <em>Datatype Kind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getTitle <em>Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatype()
 * @model extendedMetaData="name='Datatype' kind='elementOnly'"
 * @generated
 */
public interface Datatype extends Classifier {
	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeDerivation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the datatype(s) from which the current datatype was derived.
	 * UML: supplier association from ModelElement to Derivation stereotype on Dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatype_DerivedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatatypeDerivation> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Has Derivations</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeDerivation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the datatype(s) derived from the current datatype.
	 * UML: client association from ModelElement to Derivation stereotype on Dependency
	 * Derive: All datatypes which have the current datatype as a 'derivedFrom'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Has Derivations</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatype_HasDerivations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hasDerivations' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatatypeDerivation> getHasDerivations();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the containing element.
	 * UML: A collector for the comments and constraints associated with a model element.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(DatatypeAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatype_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	DatatypeAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(DatatypeAnnotations value);

	/**
	 * Returns the value of the '<em><b>Enumeration Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates one of the allowed values for the datatype.  If enumerationValues are specified, the value of the attribute must match one of the specified enumerationValues.  If there is only one enumerationValue, then the property has a fixed value.
	 * UML: EnumerationLiteral (sort of - we have a datatype in addition to the enumerationValues)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumeration Value</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatype_EnumerationValue()
	 * @model unique="false" dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='element' name='enumerationValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getEnumerationValue();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a parameter for a datatype that is a template
	 * UML: Template.parameter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatype_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatatypeParameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where a datatype is of type "binding", indicates the parameterized datatype being bound and the datatype it is being bound to.
	 * UML: Indicates the supplier binding dependency for the datatype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference.
	 * @see #setBinding(DatatypeBinding)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatype_Binding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='binding' namespace='##targetNamespace'"
	 * @generated
	 */
	DatatypeBinding getBinding();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getBinding <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' containment reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(DatatypeBinding value);

	/**
	 * Returns the value of the '<em><b>Child Datatype</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used when an abstract datatype is a "choice" of multiple specific datatypes.
	 * UML: Walking the Generalization of the Datatype Classifier
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child Datatype</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatype_ChildDatatype()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='childDatatype' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatatypeRef> getChildDatatype();

	/**
	 * Returns the value of the '<em><b>Parent Datatype</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates any "choice" datatypes which list the current datatype as an available choice.
	 * UML: Walking the Specialization of the Datatype Classifier
	 * Derive: All datatypes which have this datatype as childDatatype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Datatype</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatype_ParentDatatype()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parentDatatype' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatatypeRef> getParentDatatype();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A capability of a datatype.
	 * UML: feature association to a DatatypeOperation stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatype_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatatypeOperation> getProperty();

	/**
	 * Returns the value of the '<em><b>Datatype Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows distinguishing datatype 'definitions' from 'flavors'
	 * UML: Stereotype on datatype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datatype Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DatatypeKind
	 * @see #isSetDatatypeKind()
	 * @see #unsetDatatypeKind()
	 * @see #setDatatypeKind(DatatypeKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatype_DatatypeKind()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='datatypeKind'"
	 * @generated
	 */
	DatatypeKind getDatatypeKind();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getDatatypeKind <em>Datatype Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DatatypeKind
	 * @see #isSetDatatypeKind()
	 * @see #unsetDatatypeKind()
	 * @see #getDatatypeKind()
	 * @generated
	 */
	void setDatatypeKind(DatatypeKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getDatatypeKind <em>Datatype Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDatatypeKind()
	 * @see #getDatatypeKind()
	 * @see #setDatatypeKind(DatatypeKind)
	 * @generated
	 */
	void unsetDatatypeKind();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getDatatypeKind <em>Datatype Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Datatype Kind</em>' attribute is set.
	 * @see #unsetDatatypeKind()
	 * @see #getDatatypeKind()
	 * @see #setDatatypeKind(DatatypeKind)
	 * @generated
	 */
	boolean isSetDatatypeKind();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the specified element is not intended to appear directly in an instance.  Only derivations of the element may appear.
	 * UML: inherited from GeneralizableElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #isSetIsAbstract()
	 * @see #unsetIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatype_IsAbstract()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isAbstract'"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isSetIsAbstract()
	 * @see #unsetIsAbstract()
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAbstract()
	 * @see #isIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @generated
	 */
	void unsetIsAbstract();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#isIsAbstract <em>Is Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Abstract</em>' attribute is set.
	 * @see #unsetIsAbstract()
	 * @see #isIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @generated
	 */
	boolean isSetIsAbstract();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal identifier associated with the datatype.
	 * UML: inherited from modelElement.name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatype_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.DatatypeName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptive name associated with the datatype.
	 * UML: title tag on Datatype stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatype_Title()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName" required="true"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the amount of exposure the datatype has.
	 * UML: Inherits from modelElement.visibility.  Restricted to private, protected or public.  ('Package' is not allowed)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VisibilityKind
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #setVisibility(VisibilityKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatype_Visibility()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='visibility'"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getVisibility <em>Visibility</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(VisibilityKind)
	 * @generated
	 */
	void unsetVisibility();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype#getVisibility <em>Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visibility</em>' attribute is set.
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(VisibilityKind)
	 * @generated
	 */
	boolean isSetVisibility();

} // Datatype
