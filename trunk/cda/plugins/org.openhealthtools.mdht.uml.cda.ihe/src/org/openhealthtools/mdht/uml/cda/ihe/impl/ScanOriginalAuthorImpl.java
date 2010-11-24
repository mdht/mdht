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
import org.openhealthtools.mdht.uml.cda.ihe.ScanOriginalAuthor;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ScanOriginalAuthorOperations;
import org.openhealthtools.mdht.uml.cda.impl.AuthorImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scan Original Author</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ScanOriginalAuthorImpl extends AuthorImpl implements ScanOriginalAuthor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScanOriginalAuthorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.SCAN_ORIGINAL_AUTHOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanOriginalAuthorHasAssignedAuthorId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScanOriginalAuthorOperations.validateScanOriginalAuthorHasAssignedAuthorId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScanOriginalAuthorOperations.validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScanOriginalAuthorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScanOriginalAuthorOperations.validateScanOriginalAuthorTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanOriginalAuthor init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ScanOriginalAuthorImpl
