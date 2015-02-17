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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mif Changes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A list of changes that have occurred between two different versions of an artifact or two different versions of an artifact
 * UML: Does not directly correspond to UML.  It would be a complex tag, except that it's a stand-alone artifact . . .
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.MifChanges#getRenderingInformation <em>Rendering Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.MifChanges#getOriginalArtifact <em>Original Artifact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.MifChanges#getRevisedArtifact <em>Revised Artifact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.MifChanges#getChange <em>Change</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getMifChanges()
 * @model extendedMetaData="name='MifChanges' kind='elementOnly'"
 * @generated
 */
public interface MifChanges extends PackageBase {
	/**
	 * Returns the value of the '<em><b>Rendering Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the rendering of this XML and the version of the .  The textual content (if any) contains additional information about the rendering process.
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rendering Information</em>' containment reference.
	 * @see #setRenderingInformation(RenderingInformation)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getMifChanges_RenderingInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='renderingInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	RenderingInformation getRenderingInformation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.MifChanges#getRenderingInformation <em>Rendering Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendering Information</em>' containment reference.
	 * @see #getRenderingInformation()
	 * @generated
	 */
	void setRenderingInformation(RenderingInformation value);

	/**
	 * Returns the value of the '<em><b>Original Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The artifact that is treated as the 'original' for the comparison (the artifact from which things were added, removed or changed.)
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Artifact</em>' containment reference.
	 * @see #setOriginalArtifact(PackageOrArtifactRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getMifChanges_OriginalArtifact()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='originalArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageOrArtifactRef getOriginalArtifact();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.MifChanges#getOriginalArtifact <em>Original Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Artifact</em>' containment reference.
	 * @see #getOriginalArtifact()
	 * @generated
	 */
	void setOriginalArtifact(PackageOrArtifactRef value);

	/**
	 * Returns the value of the '<em><b>Revised Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The artifact that results from applying the identified set of changes to the 'original'.
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revised Artifact</em>' containment reference.
	 * @see #setRevisedArtifact(PackageOrArtifactRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getMifChanges_RevisedArtifact()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='revisedArtifact' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageOrArtifactRef getRevisedArtifact();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.MifChanges#getRevisedArtifact <em>Revised Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revised Artifact</em>' containment reference.
	 * @see #getRevisedArtifact()
	 * @generated
	 */
	void setRevisedArtifact(PackageOrArtifactRef value);

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getMifChanges_Change()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='change' namespace='##targetNamespace'"
	 * @generated
	 */
	ElementChange getChange();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.MifChanges#getChange <em>Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change</em>' containment reference.
	 * @see #getChange()
	 * @generated
	 */
	void setChange(ElementChange value);

} // MifChanges
