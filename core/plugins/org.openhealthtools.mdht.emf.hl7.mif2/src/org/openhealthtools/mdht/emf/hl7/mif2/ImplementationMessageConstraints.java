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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Message Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints#getSupportedTransport <em>Supported Transport</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints#getTimingBackground <em>Timing Background</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints#getExpectedResponseTime <em>Expected Response Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints#getRetryTime <em>Retry Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints#getMaximumRetryCount <em>Maximum Retry Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getImplementationMessageConstraints()
 * @model extendedMetaData="name='ImplementationMessageConstraints' kind='elementOnly'"
 * @generated
 */
public interface ImplementationMessageConstraints extends ImplementationConstraints {
	/**
	 * Returns the value of the '<em><b>Supported Transport</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates one of the transport specifications supported by the system.  If version is not specified, the assumption is that all versions present in the supported releases are supported
	 * UML: Tag on ImplementationMessageConstraints
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Transport</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getImplementationMessageConstraints_SupportedTransport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportedTransport' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageRef> getSupportedTransport();

	/**
	 * Returns the value of the '<em><b>Timing Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the criteria and assumptions used when defining the timing specifications for interactions.  (e.g. average load, processor size, inclusion or exclusion of tranmission time, etc.).  NOTE: Because the criteria and assumptions may vary from profile to profile, automated comparison of timing data is not recommended.
	 * UML: Tag on ImplementationMessageConstraints
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Background</em>' containment reference.
	 * @see #setTimingBackground(ComplexMarkupWithLanguage)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getImplementationMessageConstraints_TimingBackground()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingBackground' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexMarkupWithLanguage getTimingBackground();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints#getTimingBackground <em>Timing Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Background</em>' containment reference.
	 * @see #getTimingBackground()
	 * @generated
	 */
	void setTimingBackground(ComplexMarkupWithLanguage value);

	/**
	 * Returns the value of the '<em><b>Expected Response Time</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.DurationUnitsKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the duration between the receipt of a message and the transmission of the associated response message.  Approximately 80% of the messages processed by the system should meet this response time (under the conditions documented in 'timingBackground')
	 * UML: Tag on ImplementationMessageConstraints
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Response Time</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DurationUnitsKind
	 * @see #isSetExpectedResponseTime()
	 * @see #unsetExpectedResponseTime()
	 * @see #setExpectedResponseTime(DurationUnitsKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getImplementationMessageConstraints_ExpectedResponseTime()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='expectedResponseTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DurationUnitsKind getExpectedResponseTime();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints#getExpectedResponseTime <em>Expected Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Response Time</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DurationUnitsKind
	 * @see #isSetExpectedResponseTime()
	 * @see #unsetExpectedResponseTime()
	 * @see #getExpectedResponseTime()
	 * @generated
	 */
	void setExpectedResponseTime(DurationUnitsKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints#getExpectedResponseTime <em>Expected Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExpectedResponseTime()
	 * @see #getExpectedResponseTime()
	 * @see #setExpectedResponseTime(DurationUnitsKind)
	 * @generated
	 */
	void unsetExpectedResponseTime();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints#getExpectedResponseTime <em>Expected Response Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Expected Response Time</em>' attribute is set.
	 * @see #unsetExpectedResponseTime()
	 * @see #getExpectedResponseTime()
	 * @see #setExpectedResponseTime(DurationUnitsKind)
	 * @generated
	 */
	boolean isSetExpectedResponseTime();

	/**
	 * Returns the value of the '<em><b>Retry Time</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.DurationUnitsKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the recommended duration between the transmission of a message and the time when the sender should re-transmit if they have not yet had a response
	 * UML: Tag on ImplementationMessageConstraints
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retry Time</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DurationUnitsKind
	 * @see #isSetRetryTime()
	 * @see #unsetRetryTime()
	 * @see #setRetryTime(DurationUnitsKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getImplementationMessageConstraints_RetryTime()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='retryTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DurationUnitsKind getRetryTime();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints#getRetryTime <em>Retry Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Time</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DurationUnitsKind
	 * @see #isSetRetryTime()
	 * @see #unsetRetryTime()
	 * @see #getRetryTime()
	 * @generated
	 */
	void setRetryTime(DurationUnitsKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints#getRetryTime <em>Retry Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRetryTime()
	 * @see #getRetryTime()
	 * @see #setRetryTime(DurationUnitsKind)
	 * @generated
	 */
	void unsetRetryTime();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints#getRetryTime <em>Retry Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Retry Time</em>' attribute is set.
	 * @see #unsetRetryTime()
	 * @see #getRetryTime()
	 * @see #setRetryTime(DurationUnitsKind)
	 * @generated
	 */
	boolean isSetRetryTime();

	/**
	 * Returns the value of the '<em><b>Maximum Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the recommended maximum number of retries an application should perform before reporting a failure to the calling service.
	 * UML: Tag on ImplementationMessageConstraints
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Retry Count</em>' attribute.
	 * @see #setMaximumRetryCount(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getImplementationMessageConstraints_MaximumRetryCount()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallNonNegativeInteger"
	 *        extendedMetaData="kind='element' name='maximumRetryCount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaximumRetryCount();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints#getMaximumRetryCount <em>Maximum Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Retry Count</em>' attribute.
	 * @see #getMaximumRetryCount()
	 * @generated
	 */
	void setMaximumRetryCount(BigInteger value);

} // ImplementationMessageConstraints
