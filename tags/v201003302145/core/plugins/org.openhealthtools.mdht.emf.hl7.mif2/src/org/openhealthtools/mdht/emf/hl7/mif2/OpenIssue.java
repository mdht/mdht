/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.OpenIssue#getResolution <em>Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getOpenIssue()
 * @model extendedMetaData="name='OpenIssue' kind='elementOnly'"
 * @generated
 */
public interface OpenIssue extends CascadableAnnotation {
	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what action has been taken to address the open issue
	 * UML: tag on OpenIssue stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution</em>' containment reference.
	 * @see #setResolution(FreeFormMarkupWithLanguage)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getOpenIssue_Resolution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resolution' namespace='##targetNamespace'"
	 * @generated
	 */
	FreeFormMarkupWithLanguage getResolution();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.OpenIssue#getResolution <em>Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' containment reference.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(FreeFormMarkupWithLanguage value);

} // OpenIssue
