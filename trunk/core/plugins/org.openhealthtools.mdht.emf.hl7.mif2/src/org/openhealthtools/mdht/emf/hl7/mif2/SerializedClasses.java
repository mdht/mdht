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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serialized Classes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClasses#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClasses#getCommonModelElementRef <em>Common Model Element Ref</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClasses#getTemplateParameter <em>Template Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedClasses()
 * @model extendedMetaData="name='SerializedClasses' kind='elementOnly'"
 * @generated
 */
public interface SerializedClasses extends EObject {
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedClasses_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	SerializedClass getClass_();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClasses#getClass_ <em>Class</em>}' containment reference.
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedClasses_CommonModelElementRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='commonModelElementRef' namespace='##targetNamespace'"
	 * @generated
	 */
	SerializedCommonModelElementRef getCommonModelElementRef();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClasses#getCommonModelElementRef <em>Common Model Element Ref</em>}' containment reference.
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedClasses_TemplateParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='templateParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	StaticModelClassTemplateParameter getTemplateParameter();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClasses#getTemplateParameter <em>Template Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Parameter</em>' containment reference.
	 * @see #getTemplateParameter()
	 * @generated
	 */
	void setTemplateParameter(StaticModelClassTemplateParameter value);

} // SerializedClasses
