/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.w3c.xhtml.Img;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storyboard Artifact References</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The set of artifacts used by the storyboard
 * UML: 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardArtifactReferences#getSystem <em>System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardArtifactReferences#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardArtifactReferences#getGraphicRepresentation <em>Graphic Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardArtifactReferences#getFigure <em>Figure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboardArtifactReferences()
 * @model extendedMetaData="name='StoryboardArtifactReferences' kind='elementOnly'"
 * @generated
 */
public interface StoryboardArtifactReferences extends EObject {
	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ExampleSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of all the example systems involved in the storyboard
	 * UML: ClassifierRoles involved in the collaboration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboardArtifactReferences_System()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='system' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExampleSystem> getSystem();

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ExampleInteraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of the interactions exchanged in the storyboard
	 * UML: Message (not sure how this relates to Interaction which is a CallAction)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboardArtifactReferences_Interaction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='interaction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExampleInteraction> getInteraction();

	/**
	 * Returns the value of the '<em><b>Graphic Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the display shape(s) associated with the interaction diagram
	 * UML: association from ModelElement to SemanticModelBridge for a diagram
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graphic Representation</em>' containment reference.
	 * @see #setGraphicRepresentation(DiagramGraphicInformation)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboardArtifactReferences_GraphicRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='graphicRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagramGraphicInformation getGraphicRepresentation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardArtifactReferences#getGraphicRepresentation <em>Graphic Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic Representation</em>' containment reference.
	 * @see #getGraphicRepresentation()
	 * @generated
	 */
	void setGraphicRepresentation(DiagramGraphicInformation value);

	/**
	 * Returns the value of the '<em><b>Figure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A graphical representation of the interaction diagram.
	 * UML: figure tag on Storyboard stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Figure</em>' containment reference.
	 * @see #setFigure(Img)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboardArtifactReferences_Figure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='figure' namespace='##targetNamespace'"
	 * @generated
	 */
	Img getFigure();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardArtifactReferences#getFigure <em>Figure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure</em>' containment reference.
	 * @see #getFigure()
	 * @generated
	 */
	void setFigure(Img value);

} // StoryboardArtifactReferences
