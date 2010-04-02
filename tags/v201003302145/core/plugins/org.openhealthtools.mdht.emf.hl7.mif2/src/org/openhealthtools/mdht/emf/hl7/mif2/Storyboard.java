/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.emf.w3c.xhtml.Img;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storyboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of narrative and diagrams that describes a business flow of interest to HL7
 * UML: UseCase? Collaboration? ActivityGraph? (really a little bit of all 3 . . .)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Storyboard#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Storyboard#getCorrespondingArtifacts <em>Corresponding Artifacts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Storyboard#getActivityDiagramFigure <em>Activity Diagram Figure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Storyboard#getParentStoryboard <em>Parent Storyboard</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Storyboard#getNarrative <em>Narrative</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Storyboard#getActivityDiagram <em>Activity Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboard()
 * @model extendedMetaData="name='Storyboard' kind='elementOnly'"
 * @generated
 */
public interface Storyboard extends PackageArtifact {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the storyboard.  The 'description' annotation corresponds to the concept of "storyboard purpose".
	 * UML: A collector for the comments and constraints associated with a static model package.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(StoryboardAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboard_Annotations()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	StoryboardAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Storyboard#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(StoryboardAnnotations value);

	/**
	 * Returns the value of the '<em><b>Corresponding Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shows the specific application roles, trigger events and interactions involved in the storyboard.
	 * UML: InteractionDiagram
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Corresponding Artifacts</em>' containment reference.
	 * @see #setCorrespondingArtifacts(StoryboardArtifactReferences)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboard_CorrespondingArtifacts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='correspondingArtifacts' namespace='##targetNamespace'"
	 * @generated
	 */
	StoryboardArtifactReferences getCorrespondingArtifacts();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Storyboard#getCorrespondingArtifacts <em>Corresponding Artifacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Artifacts</em>' containment reference.
	 * @see #getCorrespondingArtifacts()
	 * @generated
	 */
	void setCorrespondingArtifacts(StoryboardArtifactReferences value);

	/**
	 * Returns the value of the '<em><b>Activity Diagram Figure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A graphical representation of the activity diagram for the storyboard.
	 * UML: figure tag on Storyboard stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Diagram Figure</em>' containment reference.
	 * @see #setActivityDiagramFigure(Img)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboard_ActivityDiagramFigure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='activityDiagramFigure' namespace='##targetNamespace'"
	 * @generated
	 */
	Img getActivityDiagramFigure();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Storyboard#getActivityDiagramFigure <em>Activity Diagram Figure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Diagram Figure</em>' containment reference.
	 * @see #getActivityDiagramFigure()
	 * @generated
	 */
	void setActivityDiagramFigure(Img value);

	/**
	 * Returns the value of the '<em><b>Parent Storyboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifes the storyboard this storyboard is a further refinement of.  Useful when there are highlevel storyboards supplemented by additionsl storyboards which expose further details.
	 * UML: Include relationship from one use-case to another
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Storyboard</em>' containment reference.
	 * @see #setParentStoryboard(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboard_ParentStoryboard()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parentStoryboard' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getParentStoryboard();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Storyboard#getParentStoryboard <em>Parent Storyboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Storyboard</em>' containment reference.
	 * @see #getParentStoryboard()
	 * @generated
	 */
	void setParentStoryboard(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Narrative</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardNarrative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a walkthrough of the interaction pattern described by the storyboard.  Multiple narratives for the same pattern are possible, showing how multiple business circumstances might be handled by a single interaction pattern.
	 * UML: Tag on storyboard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Narrative</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboard_Narrative()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='narrative' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StoryboardNarrative> getNarrative();

	/**
	 * Returns the value of the '<em><b>Activity Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a graphical representation of the activities occurring as part of the storyboard.
	 * UML: Activity Diagram
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Diagram</em>' containment reference.
	 * @see #setActivityDiagram(XMIContent)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStoryboard_ActivityDiagram()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='activityDiagram' namespace='##targetNamespace'"
	 * @generated
	 */
	XMIContent getActivityDiagram();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Storyboard#getActivityDiagram <em>Activity Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Diagram</em>' containment reference.
	 * @see #getActivityDiagram()
	 * @generated
	 */
	void setActivityDiagram(XMIContent value);

} // Storyboard
