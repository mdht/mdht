/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains 'plain' comments relating to a model element.  (Plain comments are those with no additional XML elements, except possibly one which identifies the 'type' of comment.)
 * UML: A collector for 'plain' commments associated with a model element.  (Consider rendering the definition or description annotation into ModelElement.documentation)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Documentation#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Documentation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Documentation#getUsageConstraint <em>Usage Constraint</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Documentation#getUsageNotes <em>Usage Notes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Documentation#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Documentation#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Documentation#getDesignComments <em>Design Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Documentation#getStabilityRemarks <em>Stability Remarks</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Documentation#getWalkthrough <em>Walkthrough</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Documentation#getAppendix <em>Appendix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Documentation#getOtherAnnotation <em>Other Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentation()
 * @model extendedMetaData="name='Documentation' kind='elementOnly'"
 * @generated
 */
public interface Documentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An explanation of the meaning of the element.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(CascadableAnnotation)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentation_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	CascadableAnnotation getDefinition();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Documentation#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(CascadableAnnotation value);

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentation_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	CascadableAnnotation getDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Documentation#getDescription <em>Description</em>}' containment reference.
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentation_UsageConstraint()
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentation_UsageNotes()
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentation_Rationale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rationale' namespace='##targetNamespace'"
	 * @generated
	 */
	CascadableAnnotation getRationale();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Documentation#getRationale <em>Rationale</em>}' containment reference.
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentation_Requirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirements' namespace='##targetNamespace'"
	 * @generated
	 */
	ContextAnnotation getRequirements();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Documentation#getRequirements <em>Requirements</em>}' containment reference.
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentation_DesignComments()
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentation_StabilityRemarks()
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentation_Walkthrough()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='walkthrough' namespace='##targetNamespace'"
	 * @generated
	 */
	ContextAnnotation getWalkthrough();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Documentation#getWalkthrough <em>Walkthrough</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Walkthrough</em>' containment reference.
	 * @see #getWalkthrough()
	 * @generated
	 */
	void setWalkthrough(ContextAnnotation value);

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentation_Appendix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appendix' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Appendix> getAppendix();

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDocumentation_OtherAnnotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OtherAnnotation> getOtherAnnotation();

} // Documentation
