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
 * A representation of the model object '<em><b>Interaction Profile Annotations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Descriptive information about the containing interaction profile.
 * UML: A collector for the comments and constraints associated with a model element.  (Consider rendering the definition or description annotation into ModelElement.documentation)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileAnnotations#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileAnnotations#getAppInfo <em>App Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionProfileAnnotations()
 * @model abstract="true"
 *        extendedMetaData="name='InteractionProfileAnnotations' kind='elementOnly'"
 * @generated
 */
public interface InteractionProfileAnnotations extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation related to the interaction profile
	 * UML: Component of the Annotation object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(InteractionProfileDocumentation)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionProfileAnnotations_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	InteractionProfileDocumentation getDocumentation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileAnnotations#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(InteractionProfileDocumentation value);

	/**
	 * Returns the value of the '<em><b>App Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting programmatic information related to the interaction profile which has descriptive componenents
	 * UML: Component of the Annotation object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>App Info</em>' containment reference.
	 * @see #setAppInfo(InteractionProfileAppInfo)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionProfileAnnotations_AppInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	InteractionProfileAppInfo getAppInfo();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileAnnotations#getAppInfo <em>App Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Info</em>' containment reference.
	 * @see #getAppInfo()
	 * @generated
	 */
	void setAppInfo(InteractionProfileAppInfo value);

} // InteractionProfileAnnotations
