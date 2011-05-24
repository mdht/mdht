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

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Request Estimate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provides information on the expected cost in expense or time to implement the requested change
 * UML: used by a complex tag value
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate#getCost <em>Cost</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate#getCostCurrency <em>Cost Currency</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate#getEffort <em>Effort</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate#getEffortQuantifier <em>Effort Quantifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getChangeRequestEstimate()
 * @model extendedMetaData="name='ChangeRequestEstimate' kind='elementOnly'"
 * @generated
 */
public interface ChangeRequestEstimate extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a description of the estimate, including any assumptions.  May also describe estimating approach.
	 * UML: used by a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Flow)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getChangeRequestEstimate_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Flow getDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Flow value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the expected financial effort associated with implementing the change
	 * UML: used by a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getChangeRequestEstimate_Cost()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallNonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='cost'"
	 * @generated
	 */
	BigInteger getCost();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Cost Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the currency in which the financial effort expressed by 'cost' is measured
	 * UML: used by a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost Currency</em>' attribute.
	 * @see #setCostCurrency(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getChangeRequestEstimate_CostCurrency()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortString"
	 *        extendedMetaData="kind='attribute' name='costCurrency'"
	 * @generated
	 */
	String getCostCurrency();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate#getCostCurrency <em>Cost Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Currency</em>' attribute.
	 * @see #getCostCurrency()
	 * @generated
	 */
	void setCostCurrency(String value);

	/**
	 * Returns the value of the '<em><b>Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expresses the amount of work associated with implementing the change in terms of person-effort or duration
	 * UML: used by a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effort</em>' attribute.
	 * @see #setEffort(BigDecimal)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getChangeRequestEstimate_Effort()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.NonNegativeDecimal"
	 *        extendedMetaData="kind='attribute' name='effort'"
	 * @generated
	 */
	BigDecimal getEffort();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate#getEffort <em>Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effort</em>' attribute.
	 * @see #getEffort()
	 * @generated
	 */
	void setEffort(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Effort Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.EffortQuantifierKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the way the 'effort' is measured.
	 * UML: used by a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effort Quantifier</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.EffortQuantifierKind
	 * @see #isSetEffortQuantifier()
	 * @see #unsetEffortQuantifier()
	 * @see #setEffortQuantifier(EffortQuantifierKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getChangeRequestEstimate_EffortQuantifier()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='effortQuantifier'"
	 * @generated
	 */
	EffortQuantifierKind getEffortQuantifier();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate#getEffortQuantifier <em>Effort Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effort Quantifier</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.EffortQuantifierKind
	 * @see #isSetEffortQuantifier()
	 * @see #unsetEffortQuantifier()
	 * @see #getEffortQuantifier()
	 * @generated
	 */
	void setEffortQuantifier(EffortQuantifierKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate#getEffortQuantifier <em>Effort Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffortQuantifier()
	 * @see #getEffortQuantifier()
	 * @see #setEffortQuantifier(EffortQuantifierKind)
	 * @generated
	 */
	void unsetEffortQuantifier();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate#getEffortQuantifier <em>Effort Quantifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effort Quantifier</em>' attribute is set.
	 * @see #unsetEffortQuantifier()
	 * @see #getEffortQuantifier()
	 * @see #setEffortQuantifier(EffortQuantifierKind)
	 * @generated
	 */
	boolean isSetEffortQuantifier();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to differentiate between multiple estimates.  For example internal vs. external; cost vs. charge; estimates based on differing approaches; etc.
	 * UML: used by a complex tag value
	 * Tools: Users may configure their tools to restrict the allowed values and/or default value for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getChangeRequestEstimate_Type()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortString"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // ChangeRequestEstimate
