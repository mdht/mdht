/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conformance Profile Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains 'plain' comments relating to a conformance profile.  (Plain comments are those with no additional XML elements, except possibly one which identifies the 'type' of comment.)
 * UML: A collector for 'plain' commments associated with a model element.  (Consider rendering the definition or description annotation into ModelElement.documentation)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileDocumentation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileDocumentation#getUsageConstraint <em>Usage Constraint</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileDocumentation#getUsageNotes <em>Usage Notes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileDocumentation#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileDocumentation#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileDocumentation#getDesignComments <em>Design Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileDocumentation#getStabilityRemarks <em>Stability Remarks</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileDocumentation#getWalkthrough <em>Walkthrough</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileDocumentation#getOpenIssue <em>Open Issue</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileDocumentation#getOtherAnnotation <em>Other Annotation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileDocumentation#getAppendix <em>Appendix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfileDocumentation()
 * @model extendedMetaData="name='ConformanceProfileDocumentation' kind='elementOnly'"
 * @generated
 */
public interface ConformanceProfileDocumentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An explanation of the associated element.  This may contain formatting markup.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(CascadableAnnotation)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfileDocumentation_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	CascadableAnnotation getDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileDocumentation#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(CascadableAnnotation value);

	/**
	 * Returns the value of the '<em><b>Usage Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ContextAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific constraints on how the element can be used that CANNOT be formally expressed or tested by evaluating an expression on a single instance.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Constraint</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfileDocumentation_UsageConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usageConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContextAnnotation> getUsageConstraint();

	/**
	 * Returns the value of the '<em><b>Usage Notes</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ContextAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Advice to designers and/or implementers on how to make use of an element and/or how *not* to make use of an element.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Notes</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfileDocumentation_UsageNotes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usageNotes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContextAnnotation> getUsageNotes();

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An explanation of why the element is necessary or potentially useful within this context.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rationale</em>' containment reference.
	 * @see #setRationale(CascadableAnnotation)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfileDocumentation_Rationale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rationale' namespace='##targetNamespace'"
	 * @generated
	 */
	CascadableAnnotation getRationale();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileDocumentation#getRationale <em>Rationale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' containment reference.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(CascadableAnnotation value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documents the requirements which drove the specification of the artifact.  May include references to other standards or literature describing the appropriate data elements and constraints.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(ContextAnnotation)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfileDocumentation_Requirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirements' namespace='##targetNamespace'"
	 * @generated
	 */
	ContextAnnotation getRequirements();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileDocumentation#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(ContextAnnotation value);

	/**
	 * Returns the value of the '<em><b>Design Comments</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.DesignComment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internal development notes about why particular design decisions were made, outstanding issues and remaining work.  They may contain formatting markup.  Not intended for external publication.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Design Comments</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfileDocumentation_DesignComments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='designComments' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DesignComment> getDesignComments();

	/**
	 * Returns the value of the '<em><b>Stability Remarks</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ContextAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of how stable the element is believed to be, possibly including identified areas of instability or possible change or uncertainty.  They may contain formatting markup.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stability Remarks</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfileDocumentation_StabilityRemarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stabilityRemarks' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContextAnnotation> getStabilityRemarks();

	/**
	 * Returns the value of the '<em><b>Walkthrough</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An overview of the primary and most important contents of the element.  Used to provide broad understanding of the content without detailed review.  It may contain formatting markup.
	 * UML: Descendant Stereotype from Annotation
	 * DublinCore: Corresponds to 'abstract'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Walkthrough</em>' containment reference.
	 * @see #setWalkthrough(ContextAnnotation)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfileDocumentation_Walkthrough()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='walkthrough' namespace='##targetNamespace'"
	 * @generated
	 */
	ContextAnnotation getWalkthrough();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileDocumentation#getWalkthrough <em>Walkthrough</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Walkthrough</em>' containment reference.
	 * @see #getWalkthrough()
	 * @generated
	 */
	void setWalkthrough(ContextAnnotation value);

	/**
	 * Returns the value of the '<em><b>Open Issue</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.OpenIssue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notes to designers, balloters and implementers about outstanding concerns that remain to be resolved.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Open Issue</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfileDocumentation_OpenIssue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='openIssue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OpenIssue> getOpenIssue();

	/**
	 * Returns the value of the '<em><b>Other Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.OtherAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional content related to the element.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Annotation</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfileDocumentation_OtherAnnotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OtherAnnotation> getOtherAnnotation();

	/**
	 * Returns the value of the '<em><b>Appendix</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.Appendix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation that supports or relates to the current element.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appendix</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfileDocumentation_Appendix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appendix' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Appendix> getAppendix();

} // ConformanceProfileDocumentation
