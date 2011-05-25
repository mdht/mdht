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
 * A representation of the model object '<em><b>Conformance Profile Annotations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Descriptive information about the containing model element.
 * UML: A collector for the comments and constraints associated with a model element.  (Consider rendering the definition or description annotation into ModelElement.documentation)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileAnnotations#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileAnnotations#getAppInfo <em>App Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfileAnnotations()
 * @model extendedMetaData="name='ConformanceProfileAnnotations' kind='elementOnly'"
 * @generated
 */
public interface ConformanceProfileAnnotations extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation related to the conformance profile
	 * UML: Component of the Annotation object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(ConformanceProfileDocumentation)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfileAnnotations_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	ConformanceProfileDocumentation getDocumentation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileAnnotations#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(ConformanceProfileDocumentation value);

	/**
	 * Returns the value of the '<em><b>App Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting programmatic information related to the conformance profile which has descriptive componenents
	 * UML: Component of the Annotation object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>App Info</em>' containment reference.
	 * @see #setAppInfo(ConformanceProfileAppInfo)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConformanceProfileAnnotations_AppInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	ConformanceProfileAppInfo getAppInfo();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileAnnotations#getAppInfo <em>App Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Info</em>' containment reference.
	 * @see #getAppInfo()
	 * @generated
	 */
	void setAppInfo(ConformanceProfileAppInfo value);

} // ConformanceProfileAnnotations