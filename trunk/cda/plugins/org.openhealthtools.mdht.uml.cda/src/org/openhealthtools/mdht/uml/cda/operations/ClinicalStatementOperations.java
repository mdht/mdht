/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.operations;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Clinical Statement</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#getEntryRelationshipTargets(org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship, java.lang.Object) <em>Get Entry Relationship Targets</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement#getEntryRelationshipTargets(java.lang.Object) <em>Get Entry Relationship Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalStatementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EList<ClinicalStatement> getEntryRelationshipTargets(ClinicalStatement clinicalStatement, x_ActRelationshipEntryRelationship typeCode, Object targetClass) {
		if (targetClass != null && !(targetClass instanceof EClass))
			throw new IllegalArgumentException("targetClass must be an EClass");
			
		return CDAUtil.getEntryRelationshipTargets(clinicalStatement, typeCode, (EClass)targetClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EList<ClinicalStatement> getEntryRelationshipTargets(ClinicalStatement clinicalStatement, Object targetClass) {
		return getEntryRelationshipTargets(clinicalStatement, null, (EClass)targetClass);
	}

} // ClinicalStatementOperations