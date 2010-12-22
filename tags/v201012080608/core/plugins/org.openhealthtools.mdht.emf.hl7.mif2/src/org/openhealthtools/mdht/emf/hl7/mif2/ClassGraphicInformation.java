/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Graphic Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The graphic representation for a class
 * UML: Stereotype restricting SemanticModelBridge to have graphicRepresentations associated with classes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGraphicInformation#getPresentation <em>Presentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassGraphicInformation()
 * @model extendedMetaData="name='ClassGraphicInformation' kind='elementOnly'"
 * @generated
 */
public interface ClassGraphicInformation extends NodeGraphicInformation {
	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.ClassPresentationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the diagramming format used to display the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Presentation</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassPresentationKind
	 * @see #isSetPresentation()
	 * @see #unsetPresentation()
	 * @see #setPresentation(ClassPresentationKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getClassGraphicInformation_Presentation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='presentation'"
	 * @generated
	 */
	ClassPresentationKind getPresentation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGraphicInformation#getPresentation <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassPresentationKind
	 * @see #isSetPresentation()
	 * @see #unsetPresentation()
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(ClassPresentationKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGraphicInformation#getPresentation <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPresentation()
	 * @see #getPresentation()
	 * @see #setPresentation(ClassPresentationKind)
	 * @generated
	 */
	void unsetPresentation();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGraphicInformation#getPresentation <em>Presentation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Presentation</em>' attribute is set.
	 * @see #unsetPresentation()
	 * @see #getPresentation()
	 * @see #setPresentation(ClassPresentationKind)
	 * @generated
	 */
	boolean isSetPresentation();

} // ClassGraphicInformation
