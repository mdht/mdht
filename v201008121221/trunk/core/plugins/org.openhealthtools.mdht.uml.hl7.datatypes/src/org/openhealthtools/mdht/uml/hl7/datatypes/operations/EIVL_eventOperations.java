/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.operations;

import org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EIVL event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event#init() <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EIVL_eventOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EIVL_eventOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EIVL_event init(EIVL_event eivL_event) {
		eivL_event.setCodeSystem("2.16.840.1.113883.5.139");
		eivL_event.setCodeSystemName("TimingEvent");
		return eivL_event;
	}

} // EIVL_eventOperations