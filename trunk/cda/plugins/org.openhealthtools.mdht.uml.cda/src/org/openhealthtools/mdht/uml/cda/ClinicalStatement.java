/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.hl7.rim.RIMAct;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getClinicalStatement()
 * @model abstract="true"
 * @generated
 */
public interface ClinicalStatement extends RIMAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" typeCodeRequired="true" typeCodeOrdered="false" targetClassRequired="true" targetClassOrdered="false"
	 * @generated
	 */
	EList<ClinicalStatement> getEntryRelationshipTargets(x_ActRelationshipEntryRelationship typeCode, Object targetClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" targetClassRequired="true" targetClassOrdered="false"
	 * @generated
	 */
	EList<ClinicalStatement> getEntryRelationshipTargets(Object targetClass);

} // ClinicalStatement
