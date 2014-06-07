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
 * A representation of the model object '<em><b>Storyboard Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains 'plain' comments relating to a Storyboard.  Note: Description corresponds to the storyboard 'purpose'.  (Plain comments are those with no additional XML elements, except possibly one which identifies the 'type' of comment.)
 * UML: A collector for 'plain' commments associated with a model element.  (Consider rendering the definition or description annotation into ModelElement.documentation)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardDocumentation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardDocumentation#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardDocumentation#getDesignComments <em>Design Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardDocumentation#getStabilityRemarks <em>Stability Remarks</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardDocumentation#getOpenIssue <em>Open Issue</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardDocumentation#getOtherAnnotation <em>Other Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboardDocumentation()
 * @model extendedMetaData="name='StoryboardDocumentation' kind='elementOnly'"
 * @generated
 */
public interface StoryboardDocumentation extends EObject {
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboardDocumentation_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	CascadableAnnotation getDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardDocumentation#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(CascadableAnnotation value);

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboardDocumentation_Rationale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rationale' namespace='##targetNamespace'"
	 * @generated
	 */
	CascadableAnnotation getRationale();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardDocumentation#getRationale <em>Rationale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' containment reference.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(CascadableAnnotation value);

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboardDocumentation_DesignComments()
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboardDocumentation_StabilityRemarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stabilityRemarks' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContextAnnotation> getStabilityRemarks();

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboardDocumentation_OpenIssue()
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboardDocumentation_OtherAnnotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OtherAnnotation> getOtherAnnotation();

} // StoryboardDocumentation
