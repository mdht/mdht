/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tapered Dose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     This template identifier is used to identify medication administration events that require special processing to handle
 *     tapered dosing. The parent template is 1.3.6.1.4.1.19376.1.5.3.1.4.7. A tapered dose is often used for certain
 *     medications where abrupt termination of the medication can have negative consequences. Tapered dosages may be done by
 *     adjusting the dose frequency, the dose amount, or both.
 * </p>
 * <p>
 *     When merely the dose frequency is adjusted, (e.g., Prednisone 5mg b.i.d. for three days, then 5mg. daily for three
 *     days, and then 5mg every other day), then only one medication entry is needed, multiple frequency specifications
 *     recorded in &lt;effectiveTime&gt; elements. When the dose varies (eg. Prednisone 15mg daily for three days, then 10 mg
 *     daily for three days, the 5 mg daily for three days), subordinate medication entries should be created for each
 *     distinct dosage.
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getTaperedDose()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='1.3.6.1.4.1.19376.1.5.3.1.4.8' constraints.validation.error='MedicationActivityTemplateId'"
 * @generated
 */
public interface TaperedDose extends Medication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaperedDose init();
} // TaperedDose
