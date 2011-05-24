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
 * A representation of the model object '<em><b>Class Derivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: A Derivation stereotype to a Class
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassDerivation#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassDerivation#getStaticModelDerivationId <em>Static Model Derivation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassDerivation#getWithinCMET <em>Within CMET</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassDerivation()
 * @model extendedMetaData="name='ClassDerivation' kind='empty'"
 * @generated
 */
public interface ClassDerivation extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the corresponding class in the 'parent' model.
	 * UML: derivationSupplier supplier
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassDerivation_ClassName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.AllClassName" required="true"
	 *        extendedMetaData="kind='attribute' name='className'"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassDerivation#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Static Model Derivation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the staticModelDerivationId on the parent static model which points to the model in which the derived class is found.
	 * UML: This is a shortcut to an absolute packageref for the SubSystem in which the derived class is found.  The shortcut is resolved by looking on the current class's parent static model, and finding a derivation with a matching derivationModelId.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Model Derivation Id</em>' attribute.
	 * @see #setStaticModelDerivationId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassDerivation_StaticModelDerivationId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicId" required="true"
	 *        extendedMetaData="kind='attribute' name='staticModelDerivationId'"
	 * @generated
	 */
	String getStaticModelDerivationId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassDerivation#getStaticModelDerivationId <em>Static Model Derivation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Model Derivation Id</em>' attribute.
	 * @see #getStaticModelDerivationId()
	 * @generated
	 */
	void setStaticModelDerivationId(String value);

	/**
	 * Returns the value of the '<em><b>Within CMET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of CMET within which the class was originally found (used when deriving from a model where a CMET is being fully expanded)
	 * UML: Reference to the model interface in which the derivation supplier is found
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Within CMET</em>' attribute.
	 * @see #setWithinCMET(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassDerivation_WithinCMET()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.PrefixedUpperCamelCase"
	 *        extendedMetaData="kind='attribute' name='withinCMET'"
	 * @generated
	 */
	String getWithinCMET();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassDerivation#getWithinCMET <em>Within CMET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Within CMET</em>' attribute.
	 * @see #getWithinCMET()
	 * @generated
	 */
	void setWithinCMET(String value);

} // ClassDerivation
