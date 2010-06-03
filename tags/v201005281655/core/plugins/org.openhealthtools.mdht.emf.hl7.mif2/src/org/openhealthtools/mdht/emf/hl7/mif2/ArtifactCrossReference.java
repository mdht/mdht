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
 * A representation of the model object '<em><b>Artifact Cross Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a "collection" of artifacts within a particular namespace.
 * UML: An instance of a Package stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactCrossReference#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactCrossReference#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactCrossReference#getDependentOnElement <em>Dependent On Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactCrossReference#getContainedElements <em>Contained Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getArtifactCrossReference()
 * @model extendedMetaData="name='ArtifactCrossReference' kind='elementOnly'"
 * @generated
 */
public interface ArtifactCrossReference extends PackageArtifact {
	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ElementDerivation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies artifacts from which the current artifact is derived
	 * UML: supplier association from ModelElement to Derivation stereotype on Dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getArtifactCrossReference_DerivedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ElementDerivation> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Imported Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The datatype, vocabulary, common element, annotations or other libraries this package uses
	 * UML: A package that is imported into the current data model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Package</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getArtifactCrossReference_ImportedPackage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='importedPackage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageRef> getImportedPackage();

	/**
	 * Returns the value of the '<em><b>Dependent On Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageOrArtifactRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies packages and/or artifacts defined in other packages on which the current artifact depends.
	 * UML: Elements which a supply a direct or implicit dependency to the current element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent On Element</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getArtifactCrossReference_DependentOnElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependentOnElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageOrArtifactRef> getDependentOnElement();

	/**
	 * Returns the value of the '<em><b>Contained Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactCrossReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies packages and/or artifacts defined within the scope of this package or artifact.
	 * UML: 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Elements</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getArtifactCrossReference_ContainedElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containedElements' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArtifactCrossReference> getContainedElements();

} // ArtifactCrossReference
