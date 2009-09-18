/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vital Signs Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p align="left">
 *     <font size="2">This section contains current and historically relevant vital signs, such as blood pressure, heart rate,
 *     respiratory rate, height, weight, body mass index, head circumference, crown-to-rump length, and pulse oximetry. The
 *     section may contain all vital signs for the period of time being summarized, but at a minimum should include notable
 *     vital signs such as the most recent, maximum and/or minimum, or both, baseline, or relevant trends.</font>
 * </p>
 * <p>
 *     <font size="2">Vital signs are represented like other results (as defined in</font> <b><i><font size="2"
 *     face="Times New Roman,Times New Roman"><font size="2" face="Times New Roman,Times New Roman">Results
 *     Section</font></font></i></b><font size="2">), but are aggregated into their own section in order to follow clinical
 *     conventions.</font>
 * </p>
 * <p>
 *     <font size="2">&nbsp;</font>
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#getVitalSignsSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='VitalSignsSection_templateId' templateId.root='2.16.840.1.113883.10.20.1.16'"
 * @generated
 */
public interface VitalSignsSection extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.16')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'2.16.840.1.113883.10.20.1.16\')'"
	 * @generated
	 */
	boolean VitalSignsSection_templateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection init();
} // VitalSignsSection
