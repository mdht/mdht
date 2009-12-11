/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Package Diagram Graphic Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The graphic representation for a UML concept that corresponds to a complete diagram
 * UML: Stereotype restricting SemanticModelBridge to a Diagram
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticPackageDiagramGraphicInformation#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticPackageDiagramGraphicInformation#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticPackageDiagramGraphicInformation#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticPackageDiagramGraphicInformation#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticPackageDiagramGraphicInformation#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticPackageDiagramGraphicInformation#getPresentation <em>Presentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticPackageDiagramGraphicInformation()
 * @model extendedMetaData="name='StaticPackageDiagramGraphicInformation' kind='elementOnly'"
 * @generated
 */
public interface StaticPackageDiagramGraphicInformation extends DiagramGraphicInformation {
	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.NodeWithConnectionGraphicInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines information about how an entry point is represented when displayed graphically.
	 * UML: association from ModelElement to SemanticModelBridge
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Point</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticPackageDiagramGraphicInformation_EntryPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entryPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NodeWithConnectionGraphicInformation> getEntryPoint();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGraphicInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines information about how a class is represented when displayed graphically.
	 * UML: Stereotype restricting SemanticModelBridge to have graphicRepresentations associated with classes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticPackageDiagramGraphicInformation_Class()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClassGraphicInformation> getClass_();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GraphEdgeGraphicInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the display shape(s) associated with an association
	 * UML: association from ModelElement to SemanticModelBridge for an association
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticPackageDiagramGraphicInformation_Association()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='association' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GraphEdgeGraphicInformation> getAssociation();

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GraphEdgeGraphicInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the display shape(s) associated with the static package
	 * UML: association from ModelElement to SemanticModelBridge for an association end
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generalization</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticPackageDiagramGraphicInformation_Generalization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='generalization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GraphEdgeGraphicInformation> getGeneralization();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.NodeWithConnectionGraphicInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticPackageDiagramGraphicInformation_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NodeWithConnectionGraphicInformation> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDiagramPresentationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the diagramming format used to display the element.
	 * UML: presentation element on ModelElementBridge
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Presentation</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDiagramPresentationKind
	 * @see #isSetPresentation()
	 * @see #unsetPresentation()
	 * @see #setPresentation(StaticModelDiagramPresentationKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticPackageDiagramGraphicInformation_Presentation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='presentation'"
	 * @generated
	 */
	StaticModelDiagramPresentationKind getPresentation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticPackageDiagramGraphicInformation#getPresentation <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDiagramPresentationKind
	 * @see #isSetPresentation()
	 * @see #unsetPresentation()
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(StaticModelDiagramPresentationKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticPackageDiagramGraphicInformation#getPresentation <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPresentation()
	 * @see #getPresentation()
	 * @see #setPresentation(StaticModelDiagramPresentationKind)
	 * @generated
	 */
	void unsetPresentation();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticPackageDiagramGraphicInformation#getPresentation <em>Presentation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Presentation</em>' attribute is set.
	 * @see #unsetPresentation()
	 * @see #getPresentation()
	 * @see #setPresentation(StaticModelDiagramPresentationKind)
	 * @generated
	 */
	boolean isSetPresentation();

} // StaticPackageDiagramGraphicInformation
