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
 * A representation of the model object '<em><b>Bound Static Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies a root static model as well as any models bound to parameterized stubs within the model.
 * UML: SubSystem, possibly with bound parameters
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BoundStaticModel#getParameterModel <em>Parameter Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BoundStaticModel#getEntryPointUseKind <em>Entry Point Use Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBoundStaticModel()
 * @model extendedMetaData="name='BoundStaticModel' kind='elementOnly'"
 * @generated
 */
public interface BoundStaticModel extends PackageRef {
	/**
	 * Returns the value of the '<em><b>Parameter Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ParameterModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies all 'payload' models for the current wrapper model.
	 * UML: Any TemplateParameter bindings to the model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Model</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBoundStaticModel_ParameterModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameterModel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParameterModel> getParameterModel();

	/**
	 * Returns the value of the '<em><b>Entry Point Use Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelUseKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the type of content represented by the model when entered from this entry point.  The contentType determines whether the model is legitimate content for a classStub from another model.
	 * UML: Corresponds to the name (inherited from ModelElement) of the interface being implemented
	 * Derived: The useKind of the entryPoint of the referenced static model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Point Use Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelUseKind
	 * @see #isSetEntryPointUseKind()
	 * @see #unsetEntryPointUseKind()
	 * @see #setEntryPointUseKind(StaticModelUseKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBoundStaticModel_EntryPointUseKind()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='entryPointUseKind'"
	 * @generated
	 */
	StaticModelUseKind getEntryPointUseKind();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BoundStaticModel#getEntryPointUseKind <em>Entry Point Use Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point Use Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelUseKind
	 * @see #isSetEntryPointUseKind()
	 * @see #unsetEntryPointUseKind()
	 * @see #getEntryPointUseKind()
	 * @generated
	 */
	void setEntryPointUseKind(StaticModelUseKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BoundStaticModel#getEntryPointUseKind <em>Entry Point Use Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEntryPointUseKind()
	 * @see #getEntryPointUseKind()
	 * @see #setEntryPointUseKind(StaticModelUseKind)
	 * @generated
	 */
	void unsetEntryPointUseKind();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BoundStaticModel#getEntryPointUseKind <em>Entry Point Use Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Entry Point Use Kind</em>' attribute is set.
	 * @see #unsetEntryPointUseKind()
	 * @see #getEntryPointUseKind()
	 * @see #setEntryPointUseKind(StaticModelUseKind)
	 * @generated
	 */
	boolean isSetEntryPointUseKind();

} // BoundStaticModel
