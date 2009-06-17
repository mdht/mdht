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
 * A representation of the model object '<em><b>Artifact Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies a vocabulary model to import, and optionally, additional documentation to supplement existing artifacts with.
 * UML: Imported model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactDependency#getSupplementArtifact <em>Supplement Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getArtifactDependency()
 * @model extendedMetaData="name='ArtifactDependency' kind='elementOnly'"
 * @generated
 */
public interface ArtifactDependency extends PackageRef {
	/**
	 * Returns the value of the '<em><b>Supplement Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactSupplement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines additional characteristics on a specific artifact imported from the referenced vocab model
	 * UML: No equivalent - adding additional properties to an existing artifact on import
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplement Artifact</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getArtifactDependency_SupplementArtifact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplementArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArtifactSupplement> getSupplementArtifact();

} // ArtifactDependency
