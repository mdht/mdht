/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.Author;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scanning Device</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getScanningDevice()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='1.3.6.1.4.1.19376.1.2.20.2' constraints.validation.error='ScanningDeviceTemplateId ScanningDeviceTimeEqualsDocumentEffectiveTime ScanningDeviceHasAssignedAuthorId ScanningDeviceHasAssignedAuthoringDeviceCode ScanningDeviceHasDeviceManufacturerModelName ScanningDeviceHasDeviceSoftwareName ScanningDeviceHasAssignedAuthorRepresentedOrganizationId'"
 * @generated
 */
public interface ScanningDevice extends Author {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.time.value = self.getClinicalDocument().effectiveTime.value
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.time.value = self.getClinicalDocument().effectiveTime.value'"
	 * @generated
	 */
	boolean validateScanningDeviceTimeEqualsDocumentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedAuthor.id->forAll(ident : datatypes::II | not ident.root.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor.id->forAll(ident : datatypes::II | not ident.root.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateScanningDeviceHasAssignedAuthorId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedAuthor.assignedAuthoringDevice.code.codeSystem = '1.2.840.10008.2.16.4'
	 *    and not self.assignedAuthor.assignedAuthoringDevice.code.code.oclIsUndefined()
	 *    and not self.assignedAuthor.assignedAuthoringDevice.code.displayName.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor.assignedAuthoringDevice.code.codeSystem = \'1.2.840.10008.2.16.4\'\r\n   and not self.assignedAuthor.assignedAuthoringDevice.code.code.oclIsUndefined()\r\n   and not self.assignedAuthor.assignedAuthoringDevice.code.displayName.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateScanningDeviceHasAssignedAuthoringDeviceCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.assignedAuthor.assignedAuthoringDevice.manufacturerModelName.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.assignedAuthor.assignedAuthoringDevice.manufacturerModelName.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateScanningDeviceHasDeviceManufacturerModelName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.assignedAuthor.assignedAuthoringDevice.softwareName.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.assignedAuthor.assignedAuthoringDevice.softwareName.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateScanningDeviceHasDeviceSoftwareName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedAuthor.representedOrganization.id->forAll(ident : datatypes::II | not ident.root.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor.representedOrganization.id->forAll(ident : datatypes::II | not ident.root.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.2.20.2')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.2.20.2\')'"
	 * @generated
	 */
	boolean validateScanningDeviceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanningDevice init();
} // ScanningDevice
