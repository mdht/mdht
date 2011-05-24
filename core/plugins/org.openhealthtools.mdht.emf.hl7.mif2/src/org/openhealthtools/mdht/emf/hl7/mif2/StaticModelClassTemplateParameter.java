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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Model Class Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class 'stub' that will be bound to another model of the appropriate type at runtime
 * UML: A TemplateParameter connected to a static model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelClassTemplateParameter#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelClassTemplateParameter#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelClassTemplateParameter#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelClassTemplateParameter()
 * @model extendedMetaData="name='StaticModelClassTemplateParameter' kind='elementOnly'"
 * @generated
 */
public interface StaticModelClassTemplateParameter extends ClassifierBase {
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelClassTemplateParameter_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelClassTemplateParameter#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(ClassAnnotations value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the 'type' associated with the parameter
	 * UML: Identifies an interface implemented by the parameter (and thereby restricts the models that can be substituted for the parameter)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelClassTemplateParameter_Interface()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalProperName"
	 *        extendedMetaData="kind='attribute' name='interface'"
	 * @generated
	 */
	String getInterface();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelClassTemplateParameter#getInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the stub.
	 * UML: Name tag on TemplateParameter stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelClassTemplateParameter_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalProperName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelClassTemplateParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // StaticModelClassTemplateParameter
