/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hospital Discharge Medications Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <table>
 *     <tr>
 *         <th
 *         style="BORDER-BOTTOM: black 1px solid; TEXT-ALIGN: right; BORDER-LEFT: black 1px solid; WIDTH: 30%; BACKGROUND: lightgrey; BORDER-TOP: black 1px solid; BORDER-RIGHT: black 1px solid; -moz-background-clip: border; -moz-background-origin: padding; -moz-background-inline-policy: continuous">
 *         </th>
 *         <td
 *         style="BORDER-BOTTOM: black 1px solid; BORDER-LEFT: black 1px solid; WIDTH: 70%; BORDER-TOP: black 1px solid; BORDER-RIGHT: black 1px solid"
 *          colspan="2">
 *             The hospital discharge medications section shall contain a narrative description of the medications requested
 *             (ordered) to be administered to the patient after discharge from the hospital. It shall include entries for
 *             medication requests as described in the Entry Content Module.
 *         </td>
 *     </tr>
 * </table>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getHospitalDischargeMedicationsSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HospitalDischargeMedicationsSection_templateId' templateId.root='1.3.6.1.4.1.19376.1.5.3.1.3.22'"
 * @generated
 */
public interface HospitalDischargeMedicationsSection extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.3.22')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'1.3.6.1.4.1.19376.1.5.3.1.3.22\')'"
	 * @generated
	 */
	boolean HospitalDischargeMedicationsSection_templateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeMedicationsSection init();
} // HospitalDischargeMedicationsSection
