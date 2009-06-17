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
 * A representation of the model object '<em><b>Class Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Corresponds to 'Class'
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#getStewardCommittee <em>Steward Committee</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#getInterestedCommittee <em>Interested Committee</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#getRequiredTemplateGroup <em>Required Template Group</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#getSupportedTemplate <em>Supported Template</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#isIsComplete <em>Is Complete</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#isNameLocked <em>Name Locked</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassBase()
 * @model abstract="true"
 *        extendedMetaData="name='ClassBase' kind='elementOnly'"
 * @generated
 */
public interface ClassBase extends ClassifierBase {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the containing element.
	 * UML: A collector for the comments and constraints associated with a class.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(ClassAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassBase_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(ClassAnnotations value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the set of available states and transitions available for the class.
	 * UML: StateMachine that is the 'behavior' for the Class.  HL7 allows a maximum of one stateMachine per class.  Note: The 'top' state is implicit and never modeled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference.
	 * @see #setBehavior(StateMachine)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassBase_Behavior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='behavior' namespace='##targetNamespace'"
	 * @generated
	 */
	StateMachine getBehavior();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#getBehavior <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' containment reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Steward Committee</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.CommitteeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the group with which this class is predominantly associated.
	 * UML: Reference to tagged element on an ancestor package in which the class is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Steward Committee</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassBase_StewardCommittee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stewardCommittee' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CommitteeReference> getStewardCommittee();

	/**
	 * Returns the value of the '<em><b>Interested Committee</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.CommitteeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the non-predominant group(s) with which this class is also associated.
	 * UML: Reference to tagged element on an ancestor package in which the class is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interested Committee</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassBase_InterestedCommittee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interestedCommittee' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CommitteeReference> getInterestedCommittee();

	/**
	 * Returns the value of the '<em><b>Required Template Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.AppliedTemplateGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a set of templates which must be true for this attribute or association.  If multiple sets requiredTemplateGroups are specified, then the complete set of templates in at least one of the groups must be true.
	 * UML: Complex tag on HL7Attribute and HL7AssociationEnd stereotypes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Template Group</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassBase_RequiredTemplateGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requiredTemplateGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AppliedTemplateGroup> getRequiredTemplateGroup();

	/**
	 * Returns the value of the '<em><b>Supported Template</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a template that is known to be applicable for this attribute or association.  Essentially this is providing a 'hint' about possible templates that can be used.  However, it does not require the use of any of the listed templates and is not necessarily an exhaustive list of templates that could be valid.
	 * UML: Complex tag on HL7Attribute and HL7AssociationEnd stereotypes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Template</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassBase_SupportedTemplate()
	 * @model unique="false" dataType="org.openhealthtools.mdht.emf.hl7.mif2.TemplateId"
	 *        extendedMetaData="kind='element' name='supportedTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getSupportedTemplate();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An independently modifiable or static characteristic of a class.
	 * UML: Attribute that is a feature of the class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassBase_Attribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attribute> getAttribute();

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassBase_IsAbstract()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isAbstract'"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#isIsAbstract <em>Is Abstract</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAbstract()
	 * @see #isIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @generated
	 */
	void unsetIsAbstract();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#isIsAbstract <em>Is Abstract</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Is Complete</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the set of attributes and associations described for the class is the complete set permitted - no others are allowed.  If false, additional attributes and associations from the RIM not described are also allowed
	 * UML: Tag on HL7Class stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Complete</em>' attribute.
	 * @see #isSetIsComplete()
	 * @see #unsetIsComplete()
	 * @see #setIsComplete(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassBase_IsComplete()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isComplete'"
	 * @generated
	 */
	boolean isIsComplete();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#isIsComplete <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Complete</em>' attribute.
	 * @see #isSetIsComplete()
	 * @see #unsetIsComplete()
	 * @see #isIsComplete()
	 * @generated
	 */
	void setIsComplete(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#isIsComplete <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsComplete()
	 * @see #isIsComplete()
	 * @see #setIsComplete(boolean)
	 * @generated
	 */
	void unsetIsComplete();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#isIsComplete <em>Is Complete</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Complete</em>' attribute is set.
	 * @see #unsetIsComplete()
	 * @see #isIsComplete()
	 * @see #setIsComplete(boolean)
	 * @generated
	 */
	boolean isSetIsComplete();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique, formal name for the class within the model.
	 * UML: ModelElement.name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassBase_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalProperName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Name Locked</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the name should not be changed when the renaming algorithm is run.
	 * UML: Tag on HL7Class stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Locked</em>' attribute.
	 * @see #isSetNameLocked()
	 * @see #unsetNameLocked()
	 * @see #setNameLocked(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassBase_NameLocked()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='nameLocked'"
	 * @generated
	 */
	boolean isNameLocked();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#isNameLocked <em>Name Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Locked</em>' attribute.
	 * @see #isSetNameLocked()
	 * @see #unsetNameLocked()
	 * @see #isNameLocked()
	 * @generated
	 */
	void setNameLocked(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#isNameLocked <em>Name Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNameLocked()
	 * @see #isNameLocked()
	 * @see #setNameLocked(boolean)
	 * @generated
	 */
	void unsetNameLocked();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase#isNameLocked <em>Name Locked</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name Locked</em>' attribute is set.
	 * @see #unsetNameLocked()
	 * @see #isNameLocked()
	 * @see #setNameLocked(boolean)
	 * @generated
	 */
	boolean isSetNameLocked();

} // ClassBase
