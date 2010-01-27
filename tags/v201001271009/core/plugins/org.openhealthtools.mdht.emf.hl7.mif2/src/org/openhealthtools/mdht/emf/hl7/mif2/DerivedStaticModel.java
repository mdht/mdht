/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Static Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A static Model in standard (flat) notation expressed as a set of changes applied to a prior static model.  Used for RIM, CIM, LIM, etc.
 * UML: An instance of a StaticModel stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DerivedStaticModel#getOriginalArtifact <em>Original Artifact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DerivedStaticModel#getChange <em>Change</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDerivedStaticModel()
 * @model extendedMetaData="name='DerivedStaticModel' kind='elementOnly'"
 * @generated
 */
public interface DerivedStaticModel extends StaticModelBase {
	/**
	 * Returns the value of the '<em><b>Original Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The staticModel that is treated as the 'original' for the derivation (the model from which things were added, removed or changed to produce this model.)
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Artifact</em>' containment reference.
	 * @see #setOriginalArtifact(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDerivedStaticModel_OriginalArtifact()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='originalArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getOriginalArtifact();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DerivedStaticModel#getOriginalArtifact <em>Original Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Artifact</em>' containment reference.
	 * @see #getOriginalArtifact()
	 * @generated
	 */
	void setOriginalArtifact(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The changes to be applied to the root element of the original artifact.  (If not specified, it means the two elements are identical.)
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Change</em>' containment reference.
	 * @see #setChange(ElementChange)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDerivedStaticModel_Change()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='change' namespace='##targetNamespace'"
	 * @generated
	 */
	ElementChange getChange();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DerivedStaticModel#getChange <em>Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change</em>' containment reference.
	 * @see #getChange()
	 * @generated
	 */
	void setChange(ElementChange value);

} // DerivedStaticModel
