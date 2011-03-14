/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.operations;

import java.math.BigDecimal;

import org.openhealthtools.mdht.uml.hl7.datatypes.MO;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>MO</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.MO#setValue(java.lang.Double) <em>Set Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MOOperations extends ANYOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MOOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void setValue(MO mo, Double newValue) {
		if (newValue != null){
			mo.setValue(BigDecimal.valueOf(newValue.doubleValue()));
		} else {
			mo.setValue((BigDecimal) null);
		}
	}

} // MOOperations