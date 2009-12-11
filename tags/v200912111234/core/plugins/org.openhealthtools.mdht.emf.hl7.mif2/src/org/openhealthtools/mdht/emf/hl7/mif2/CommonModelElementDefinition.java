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
 * A representation of the model object '<em><b>Common Model Element Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to define CMETs.
 * UML: CommonModelElement stereotype on Interface
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition#getBoundStaticModel <em>Bound Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition#getEntryClass <em>Entry Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition#getAttributionLevel <em>Attribution Level</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition#getEntryKind <em>Entry Kind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition#getOtherClassName <em>Other Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCommonModelElementDefinition()
 * @model extendedMetaData="name='CommonModelElementDefinition' kind='elementOnly'"
 * @generated
 */
public interface CommonModelElementDefinition extends ClassifierBase {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the containing element.
	 * UML: A collector for the comments and constraints associated with a class.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(StaticModelInterfaceAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCommonModelElementDefinition_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	StaticModelInterfaceAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(StaticModelInterfaceAnnotations value);

	/**
	 * Returns the value of the '<em><b>Bound Static Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The modelId of the model that implements this Common Model Element.
	 * UML: The StaticModel subsystem that specializes this interface
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bound Static Model</em>' containment reference.
	 * @see #setBoundStaticModel(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCommonModelElementDefinition_BoundStaticModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='boundStaticModel' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getBoundStaticModel();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition#getBoundStaticModel <em>Bound Static Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Static Model</em>' containment reference.
	 * @see #getBoundStaticModel()
	 * @generated
	 */
	void setBoundStaticModel(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Template Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelClassTemplateParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the parameters associated with the CMET that must be bound if the CMET is referenced.
	 * UML: The TemplateParameters associated with the Interface (if any)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Parameter</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCommonModelElementDefinition_TemplateParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='templateParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StaticModelClassTemplateParameter> getTemplateParameter();

	/**
	 * Returns the value of the '<em><b>Entry Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the name of the root class of the CMET (and any descendant classes)
	 * UML: The name of the class pointed to by the entry-point for the static model that specializes this interface
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Class</em>' containment reference.
	 * @see #setEntryClass(SpecializationClass)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCommonModelElementDefinition_EntryClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entryClass' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecializationClass getEntryClass();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition#getEntryClass <em>Entry Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Class</em>' containment reference.
	 * @see #getEntryClass()
	 * @generated
	 */
	void setEntryClass(SpecializationClass value);

	/**
	 * Returns the value of the '<em><b>Attribution Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the level of detail associated with the CMET
	 * UML: Tag on CommonModelElement stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribution Level</em>' attribute.
	 * @see #setAttributionLevel(Object)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCommonModelElementDefinition_AttributionLevel()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.CMETAttributionType"
	 *        extendedMetaData="kind='attribute' name='attributionLevel'"
	 * @generated
	 */
	Object getAttributionLevel();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition#getAttributionLevel <em>Attribution Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribution Level</em>' attribute.
	 * @see #getAttributionLevel()
	 * @generated
	 */
	void setAttributionLevel(Object value);

	/**
	 * Returns the value of the '<em><b>Entry Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.CMETEntryKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the means by which the CMET can be entered
	 * UML: Tag value on CommonModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CMETEntryKind
	 * @see #isSetEntryKind()
	 * @see #unsetEntryKind()
	 * @see #setEntryKind(CMETEntryKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCommonModelElementDefinition_EntryKind()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='entryKind'"
	 * @generated
	 */
	CMETEntryKind getEntryKind();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition#getEntryKind <em>Entry Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CMETEntryKind
	 * @see #isSetEntryKind()
	 * @see #unsetEntryKind()
	 * @see #getEntryKind()
	 * @generated
	 */
	void setEntryKind(CMETEntryKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition#getEntryKind <em>Entry Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEntryKind()
	 * @see #getEntryKind()
	 * @see #setEntryKind(CMETEntryKind)
	 * @generated
	 */
	void unsetEntryKind();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition#getEntryKind <em>Entry Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Entry Kind</em>' attribute is set.
	 * @see #unsetEntryKind()
	 * @see #getEntryKind()
	 * @see #setEntryKind(CMETEntryKind)
	 * @generated
	 */
	boolean isSetEntryKind();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier of the CMET.
	 * UML: Inherited from modelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCommonModelElementDefinition_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.PrefixedUpperCamelCase" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Other Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the RIM type of "Other class" serving as the base for the CMET
	 * UML: Tag value on CommonModel Element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Class Name</em>' attribute.
	 * @see #setOtherClassName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCommonModelElementDefinition_OtherClassName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.UpperCamelCase"
	 *        extendedMetaData="kind='attribute' name='otherClassName'"
	 * @generated
	 */
	String getOtherClassName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition#getOtherClassName <em>Other Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Class Name</em>' attribute.
	 * @see #getOtherClassName()
	 * @generated
	 */
	void setOtherClassName(String value);

} // CommonModelElementDefinition
