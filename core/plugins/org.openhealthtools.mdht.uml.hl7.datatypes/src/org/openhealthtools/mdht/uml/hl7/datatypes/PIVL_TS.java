/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes;

import org.openhealthtools.mdht.uml.hl7.vocab.CalendarCycle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PIVL TS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS#getInstitutionSpecified <em>Institution Specified</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getPIVL_TS()
 * @model
 * @generated
 */
public interface PIVL_TS extends SXCM_TS {
	/**
	 * Returns the value of the '<em><b>Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' containment reference.
	 * @see #setPhase(IVL_TS)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getPIVL_TS_Phase()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	IVL_TS getPhase();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS#getPhase <em>Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' containment reference.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(IVL_TS value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(PQ)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getPIVL_TS_Period()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PQ getPeriod();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(PQ value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.CalendarCycle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.CalendarCycle
	 * @see #isSetAlignment()
	 * @see #unsetAlignment()
	 * @see #setAlignment(CalendarCycle)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getPIVL_TS_Alignment()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	CalendarCycle getAlignment();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.CalendarCycle
	 * @see #isSetAlignment()
	 * @see #unsetAlignment()
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(CalendarCycle value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlignment()
	 * @see #getAlignment()
	 * @see #setAlignment(CalendarCycle)
	 * @generated
	 */
	void unsetAlignment();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS#getAlignment <em>Alignment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alignment</em>' attribute is set.
	 * @see #unsetAlignment()
	 * @see #getAlignment()
	 * @see #setAlignment(CalendarCycle)
	 * @generated
	 */
	boolean isSetAlignment();

	/**
	 * Returns the value of the '<em><b>Institution Specified</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Institution Specified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institution Specified</em>' attribute.
	 * @see #setInstitutionSpecified(Boolean)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getPIVL_TS_InstitutionSpecified()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	Boolean getInstitutionSpecified();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS#getInstitutionSpecified <em>Institution Specified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution Specified</em>' attribute.
	 * @see #getInstitutionSpecified()
	 * @generated
	 */
	void setInstitutionSpecified(Boolean value);

} // PIVL_TS
