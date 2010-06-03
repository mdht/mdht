/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Supplement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines additional annotations on an imported concept domain
 * UML: No equivalent
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactSupplement#getSupplementedObject <em>Supplemented Object</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactSupplement#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactSupplement#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getArtifactSupplement()
 * @model extendedMetaData="name='ArtifactSupplement' kind='elementOnly'"
 * @generated
 */
public interface ArtifactSupplement extends EObject {
	/**
	 * Returns the value of the '<em><b>Supplemented Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the object to which the supplements are to be applied.
	 * UML: No equivalent
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplemented Object</em>' containment reference.
	 * @see #setSupplementedObject(org.openhealthtools.mdht.emf.w3c.xhtml.Object)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getArtifactSupplement_SupplementedObject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='supplementedObject' namespace='##targetNamespace'"
	 * @generated
	 */
	org.openhealthtools.mdht.emf.w3c.xhtml.Object getSupplementedObject();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactSupplement#getSupplementedObject <em>Supplemented Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplemented Object</em>' containment reference.
	 * @see #getSupplementedObject()
	 * @generated
	 */
	void setSupplementedObject(org.openhealthtools.mdht.emf.w3c.xhtml.Object value);

	/**
	 * Returns the value of the '<em><b>Business Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.BusinessName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business names associated with the element. CURRENT- 0..1
	 * UML: Tag value inherited from ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Name</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getArtifactSupplement_BusinessName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='businessName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BusinessName> getBusinessName();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supplemental annotations about the imported artifact.
	 * UML: A collector for the comments and constraints associated with a concept domain.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(ArtifactSupplementAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getArtifactSupplement_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	ArtifactSupplementAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactSupplement#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(ArtifactSupplementAnnotations value);

} // ArtifactSupplement
