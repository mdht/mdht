/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Derivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ElementDerivation#getSourceArtifact <em>Source Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getElementDerivation()
 * @model extendedMetaData="name='ElementDerivation' kind='elementOnly'"
 * @generated
 */
public interface ElementDerivation extends Derivation {
	/**
	 * Returns the value of the '<em><b>Source Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier of the artifact from which the current element is derived.
	 * UML: Absolute package path (using package names)to the client model element on the derivationSupplier dependency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Artifact</em>' containment reference.
	 * @see #setSourceArtifact(PackageOrArtifactRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getElementDerivation_SourceArtifact()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sourceArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageOrArtifactRef getSourceArtifact();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ElementDerivation#getSourceArtifact <em>Source Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Artifact</em>' containment reference.
	 * @see #getSourceArtifact()
	 * @generated
	 */
	void setSourceArtifact(PackageOrArtifactRef value);

} // ElementDerivation
