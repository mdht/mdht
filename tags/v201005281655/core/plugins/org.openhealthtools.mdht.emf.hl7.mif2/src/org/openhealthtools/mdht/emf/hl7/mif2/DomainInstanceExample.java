/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Instance Example</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A plain UML instance diagram intended for capturing sample data instances expressed in an abstract way
 * UML: Instance Diagram
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExample#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExample#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDomainInstanceExample()
 * @model extendedMetaData="name='DomainInstanceExample' kind='elementOnly'"
 * @generated
 */
public interface DomainInstanceExample extends PackageArtifact {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the containing element.
	 * UML: A collector for the comments and constraints associated with an entry point.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(DomainInstanceExampleAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDomainInstanceExample_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	DomainInstanceExampleAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExample#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(DomainInstanceExampleAnnotations value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual UML diagram content, possibly extended with MIF annotations
	 * UML: UML instance diagram.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(XMIContent)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDomainInstanceExample_Model()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='model' namespace='##targetNamespace'"
	 * @generated
	 */
	XMIContent getModel();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExample#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(XMIContent value);

} // DomainInstanceExample
