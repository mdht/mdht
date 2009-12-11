/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stub Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to define types for unbound 'stubs' in models.
 * UML: Stub stereotype on Interface
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition#getTypeStaticModel <em>Type Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition#getEntryClass <em>Entry Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition#getConstraintStaticModel <em>Constraint Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition#getEntryKind <em>Entry Kind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition#getOtherClassName <em>Other Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStubDefinition()
 * @model extendedMetaData="name='StubDefinition' kind='elementOnly'"
 * @generated
 */
public interface StubDefinition extends ClassifierBase {
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStubDefinition_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	StaticModelInterfaceAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(StaticModelInterfaceAnnotations value);

	/**
	 * Returns the value of the '<em><b>Type Static Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The modelId of the model that represents the 'outer boundaries' of the elements that can bind to the stub.
	 * UML: The StaticModel subsystem that specializes this interface
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Static Model</em>' containment reference.
	 * @see #setTypeStaticModel(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStubDefinition_TypeStaticModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='typeStaticModel' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getTypeStaticModel();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition#getTypeStaticModel <em>Type Static Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Static Model</em>' containment reference.
	 * @see #getTypeStaticModel()
	 * @generated
	 */
	void setTypeStaticModel(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Entry Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the name of the root class of the type model which should be used as the entry-point.  (Necessary when the typeStaticModel is the RIM or a DIM having multiple entry-points.)
	 * UML: The name of the class pointed to by the entry-point for the static model that specializes this interface
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Class</em>' attribute.
	 * @see #setEntryClass(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStubDefinition_EntryClass()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.AllClassName"
	 *        extendedMetaData="kind='element' name='entryClass' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEntryClass();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition#getEntryClass <em>Entry Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Class</em>' attribute.
	 * @see #getEntryClass()
	 * @generated
	 */
	void setEntryClass(String value);

	/**
	 * Returns the value of the '<em><b>Constraint Static Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The modelId of the model that represents the 'minimum' of the elements that can bind to the stub.
	 * UML: The StaticModel subsystem that acts as a 'constraint' on the models that can bind to this interface
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint Static Model</em>' containment reference.
	 * @see #setConstraintStaticModel(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStubDefinition_ConstraintStaticModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constraintStaticModel' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getConstraintStaticModel();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition#getConstraintStaticModel <em>Constraint Static Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Static Model</em>' containment reference.
	 * @see #getConstraintStaticModel()
	 * @generated
	 */
	void setConstraintStaticModel(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Entry Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.CMETEntryKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the means by which the stub can be entered
	 * UML: Tag value on CommonModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CMETEntryKind
	 * @see #isSetEntryKind()
	 * @see #unsetEntryKind()
	 * @see #setEntryKind(CMETEntryKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStubDefinition_EntryKind()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='entryKind'"
	 * @generated
	 */
	CMETEntryKind getEntryKind();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition#getEntryKind <em>Entry Kind</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition#getEntryKind <em>Entry Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEntryKind()
	 * @see #getEntryKind()
	 * @see #setEntryKind(CMETEntryKind)
	 * @generated
	 */
	void unsetEntryKind();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition#getEntryKind <em>Entry Kind</em>}' attribute is set.
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
	 * The identifier of the stub.
	 * UML: Inherited from modelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStubDefinition_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.PrefixedUpperCamelCase" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition#getName <em>Name</em>}' attribute.
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStubDefinition_OtherClassName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.UpperCamelCase"
	 *        extendedMetaData="kind='attribute' name='otherClassName'"
	 * @generated
	 */
	String getOtherClassName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition#getOtherClassName <em>Other Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Class Name</em>' attribute.
	 * @see #getOtherClassName()
	 * @generated
	 */
	void setOtherClassName(String value);

} // StubDefinition
