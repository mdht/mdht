/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.operations;

import java.math.BigInteger;

import org.openhealthtools.mdht.uml.hl7.datatypes.INT;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>INT</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.INT#setValue(java.lang.Integer) <em>Set Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class INTOperations extends ANYOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected INTOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void setValue(INT int_, Integer newValue) {
		if (newValue != null){
			int_.setValue(BigInteger.valueOf(newValue.longValue()));
		} else {
			int_.setValue((BigInteger) null);
		}
	}

} // INTOperations