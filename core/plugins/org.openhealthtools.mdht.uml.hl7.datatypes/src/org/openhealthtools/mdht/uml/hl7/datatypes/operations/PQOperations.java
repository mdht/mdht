/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.operations;

import java.math.BigDecimal;

import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PQ</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.PQ#setValue(java.lang.Double) <em>Set Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PQOperations extends ANYOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PQOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void setValue(PQ pq, Double newValue) {
		if (newValue != null){
			pq.setValue(BigDecimal.valueOf(newValue.doubleValue()));
		} else {
			pq.setValue((BigDecimal) null);
		}
	}

} // PQOperations