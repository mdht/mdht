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
 * A representation of the model object '<em><b>Class Or Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: A full-blown class, or a reference to an already described class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassOrReference#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassOrReference#getCommonModelElementRef <em>Common Model Element Ref</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassOrReference#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassOrReference#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassOrReference()
 * @model extendedMetaData="name='ClassOrReference' kind='elementOnly'"
 * @generated
 */
public interface ClassOrReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of attributes and associations representing a single instance.
	 * UML: Class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass(SerializedClass)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassOrReference_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	SerializedClass getClass_();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassOrReference#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(SerializedClass value);

	/**
	 * Returns the value of the '<em><b>Common Model Element Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to an external model intended to be imported and re-used at this point.
	 * UML: Another subsystem that is referenced via an interface
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Common Model Element Ref</em>' containment reference.
	 * @see #setCommonModelElementRef(SerializedCommonModelElementRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassOrReference_CommonModelElementRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='commonModelElementRef' namespace='##targetNamespace'"
	 * @generated
	 */
	SerializedCommonModelElementRef getCommonModelElementRef();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassOrReference#getCommonModelElementRef <em>Common Model Element Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common Model Element Ref</em>' containment reference.
	 * @see #getCommonModelElementRef()
	 * @generated
	 */
	void setCommonModelElementRef(SerializedCommonModelElementRef value);

	/**
	 * Returns the value of the '<em><b>Template Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A point in the model at which a 'sub-model' may be placed that corresponds to the identified contentType.  The specific model to be included may vary and is determined at runtime.
	 * UML: A Class that represents one of the Template Parameters of a template Static Model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Parameter</em>' containment reference.
	 * @see #setTemplateParameter(StaticModelClassTemplateParameter)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassOrReference_TemplateParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='templateParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	StaticModelClassTemplateParameter getTemplateParameter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassOrReference#getTemplateParameter <em>Template Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Parameter</em>' containment reference.
	 * @see #getTemplateParameter()
	 * @generated
	 */
	void setTemplateParameter(StaticModelClassTemplateParameter value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class to which the association end is attached
	 * UML: The name of the participant class for the association end (used for recursion)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(LocalClassReference)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassOrReference_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalClassReference getReference();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassOrReference#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(LocalClassReference value);

} // ClassOrReference
