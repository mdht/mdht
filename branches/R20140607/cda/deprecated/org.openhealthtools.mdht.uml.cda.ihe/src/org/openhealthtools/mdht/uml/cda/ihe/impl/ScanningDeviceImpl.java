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
import org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ScanningDeviceOperations;
import org.openhealthtools.mdht.uml.cda.impl.AuthorImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scanning Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ScanningDeviceImpl extends AuthorImpl implements ScanningDevice {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScanningDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.SCANNING_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanningDeviceTimeEqualsDocumentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScanningDeviceOperations.validateScanningDeviceTimeEqualsDocumentEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanningDeviceHasAssignedAuthorId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScanningDeviceOperations.validateScanningDeviceHasAssignedAuthorId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanningDeviceHasAssignedAuthoringDeviceCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScanningDeviceOperations.validateScanningDeviceHasAssignedAuthoringDeviceCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanningDeviceHasDeviceManufacturerModelName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScanningDeviceOperations.validateScanningDeviceHasDeviceManufacturerModelName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanningDeviceHasDeviceSoftwareName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScanningDeviceOperations.validateScanningDeviceHasDeviceSoftwareName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScanningDeviceOperations.validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanningDeviceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScanningDeviceOperations.validateScanningDeviceTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanningDevice init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ScanningDeviceImpl
