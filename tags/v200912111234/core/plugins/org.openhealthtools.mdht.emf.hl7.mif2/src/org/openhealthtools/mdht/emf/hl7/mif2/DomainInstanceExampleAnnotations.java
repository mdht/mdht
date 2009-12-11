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
 * A representation of the model object '<em><b>Domain Instance Example Annotations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Descriptive information about the domain instance example.
 * UML: A collector for the comments associated with a model element.  (Consider rendering the definition or description annotation into ModelElement.documentation)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExampleAnnotations#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExampleAnnotations#getAppInfo <em>App Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDomainInstanceExampleAnnotations()
 * @model extendedMetaData="name='DomainInstanceExampleAnnotations' kind='elementOnly'"
 * @generated
 */
public interface DomainInstanceExampleAnnotations extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation related to the domain instance example
	 * UML: Component of the Annotation object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(DomainInstanceExampleDocumentation)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDomainInstanceExampleAnnotations_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	DomainInstanceExampleDocumentation getDocumentation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExampleAnnotations#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(DomainInstanceExampleDocumentation value);

	/**
	 * Returns the value of the '<em><b>App Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting programmatic information related to the domain instance example which has descriptive componenents
	 * UML: Component of the Annotation object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>App Info</em>' containment reference.
	 * @see #setAppInfo(DomainInstanceExampleAppInfo)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDomainInstanceExampleAnnotations_AppInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	DomainInstanceExampleAppInfo getAppInfo();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExampleAnnotations#getAppInfo <em>App Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Info</em>' containment reference.
	 * @see #getAppInfo()
	 * @generated
	 */
	void setAppInfo(DomainInstanceExampleAppInfo value);

} // DomainInstanceExampleAnnotations
