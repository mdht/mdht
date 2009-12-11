/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Type for the RangeDefinition complex tag
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.RangeDefinition#isHighClosed <em>High Closed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.RangeDefinition#getHighValue <em>High Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.RangeDefinition#isLowClosed <em>Low Closed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.RangeDefinition#getLowValue <em>Low Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getRangeDefinition()
 * @model extendedMetaData="name='RangeDefinition' kind='empty'"
 * @generated
 */
public interface RangeDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>High Closed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the high value is included in the range (&lt;=).  If false, the value must not exactly match the low value (&lt;)
	 * UML: part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>High Closed</em>' attribute.
	 * @see #isSetHighClosed()
	 * @see #unsetHighClosed()
	 * @see #setHighClosed(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getRangeDefinition_HighClosed()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='highClosed'"
	 * @generated
	 */
	boolean isHighClosed();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.RangeDefinition#isHighClosed <em>High Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Closed</em>' attribute.
	 * @see #isSetHighClosed()
	 * @see #unsetHighClosed()
	 * @see #isHighClosed()
	 * @generated
	 */
	void setHighClosed(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.RangeDefinition#isHighClosed <em>High Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHighClosed()
	 * @see #isHighClosed()
	 * @see #setHighClosed(boolean)
	 * @generated
	 */
	void unsetHighClosed();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.RangeDefinition#isHighClosed <em>High Closed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>High Closed</em>' attribute is set.
	 * @see #unsetHighClosed()
	 * @see #isHighClosed()
	 * @see #setHighClosed(boolean)
	 * @generated
	 */
	boolean isSetHighClosed();

	/**
	 * Returns the value of the '<em><b>High Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the maximum value for the range.  If not specified, assumption is positive infinity
	 * UML: part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>High Value</em>' attribute.
	 * @see #setHighValue(BigDecimal)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getRangeDefinition_HighValue()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Decimal"
	 *        extendedMetaData="kind='attribute' name='highValue'"
	 * @generated
	 */
	BigDecimal getHighValue();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.RangeDefinition#getHighValue <em>High Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Value</em>' attribute.
	 * @see #getHighValue()
	 * @generated
	 */
	void setHighValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Low Closed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the low value is included in the range (&gt;=).  If false, the value must not exactly match the low value (&gt;)
	 * UML: part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Low Closed</em>' attribute.
	 * @see #isSetLowClosed()
	 * @see #unsetLowClosed()
	 * @see #setLowClosed(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getRangeDefinition_LowClosed()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='lowClosed'"
	 * @generated
	 */
	boolean isLowClosed();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.RangeDefinition#isLowClosed <em>Low Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Closed</em>' attribute.
	 * @see #isSetLowClosed()
	 * @see #unsetLowClosed()
	 * @see #isLowClosed()
	 * @generated
	 */
	void setLowClosed(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.RangeDefinition#isLowClosed <em>Low Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowClosed()
	 * @see #isLowClosed()
	 * @see #setLowClosed(boolean)
	 * @generated
	 */
	void unsetLowClosed();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.RangeDefinition#isLowClosed <em>Low Closed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Low Closed</em>' attribute is set.
	 * @see #unsetLowClosed()
	 * @see #isLowClosed()
	 * @see #setLowClosed(boolean)
	 * @generated
	 */
	boolean isSetLowClosed();

	/**
	 * Returns the value of the '<em><b>Low Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the minimum value for the range.  If not specified, assumption is negative infinity
	 * UML: part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Low Value</em>' attribute.
	 * @see #setLowValue(BigDecimal)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getRangeDefinition_LowValue()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Decimal"
	 *        extendedMetaData="kind='attribute' name='lowValue'"
	 * @generated
	 */
	BigDecimal getLowValue();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.RangeDefinition#getLowValue <em>Low Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Value</em>' attribute.
	 * @see #getLowValue()
	 * @generated
	 */
	void setLowValue(BigDecimal value);

} // RangeDefinition
