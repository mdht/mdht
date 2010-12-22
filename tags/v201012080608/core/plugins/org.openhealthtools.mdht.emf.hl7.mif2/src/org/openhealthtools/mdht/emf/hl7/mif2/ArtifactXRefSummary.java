/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact XRef Summary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a set of cross-references .
 * UML: An instance of a Package stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactXRefSummary#getRenderingInformation <em>Rendering Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactXRefSummary#getArtifact <em>Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getArtifactXRefSummary()
 * @model extendedMetaData="name='ArtifactXRefSummary' kind='elementOnly'"
 * @generated
 */
public interface ArtifactXRefSummary extends EObject {
	/**
	 * Returns the value of the '<em><b>Rendering Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides information about the creation of this particular (XML, XMI or other) representation of the package
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rendering Information</em>' containment reference.
	 * @see #setRenderingInformation(RenderingInformation)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getArtifactXRefSummary_RenderingInformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='renderingInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	RenderingInformation getRenderingInformation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactXRefSummary#getRenderingInformation <em>Rendering Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendering Information</em>' containment reference.
	 * @see #getRenderingInformation()
	 * @generated
	 */
	void setRenderingInformation(RenderingInformation value);

	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the package which is the root of the summary
	 * UML: ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference.
	 * @see #setArtifact(ArtifactCrossReference)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getArtifactXRefSummary_Artifact()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='artifact' namespace='##targetNamespace'"
	 * @generated
	 */
	ArtifactCrossReference getArtifact();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactXRefSummary#getArtifact <em>Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact</em>' containment reference.
	 * @see #getArtifact()
	 * @generated
	 */
	void setArtifact(ArtifactCrossReference value);

} // ArtifactXRefSummary
