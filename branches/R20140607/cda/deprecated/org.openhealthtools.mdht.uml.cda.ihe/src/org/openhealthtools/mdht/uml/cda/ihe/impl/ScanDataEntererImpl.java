/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.ScanDataEnterer;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ScanDataEntererOperations;
import org.openhealthtools.mdht.uml.cda.impl.DataEntererImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scan Data Enterer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ScanDataEntererImpl extends DataEntererImpl implements ScanDataEnterer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScanDataEntererImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.SCAN_DATA_ENTERER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanDataEntererTimeEqualsDocumentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScanDataEntererOperations.validateScanDataEntererTimeEqualsDocumentEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanDataEntererHasAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScanDataEntererOperations.validateScanDataEntererHasAssignedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanDataEntererTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScanDataEntererOperations.validateScanDataEntererTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanDataEntererTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScanDataEntererOperations.validateScanDataEntererTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanDataEnterer init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ScanDataEntererImpl
