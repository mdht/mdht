/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.association;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.cts2.core.OntologyLanguageAndSyntax;
import org.openhealthtools.mdht.cts2.core.OpaqueData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rendering</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.association.AssociationRendering#getLanguageAndSyntax <em>Language And Syntax</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.AssociationRendering#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationRendering()
 * @model extendedMetaData="name='AssociationRendering' kind='elementOnly'"
 * @generated
 */
public interface AssociationRendering extends EObject {
	/**
	 * Returns the value of the '<em><b>Language And Syntax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language And Syntax</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Language And Syntax</em>' containment reference.
	 * @see #setLanguageAndSyntax(OntologyLanguageAndSyntax)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationRendering_LanguageAndSyntax()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='languageAndSyntax' namespace='##targetNamespace'"
	 * @generated
	 */
	OntologyLanguageAndSyntax getLanguageAndSyntax();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationRendering#getLanguageAndSyntax <em>Language And Syntax</em>}
	 * ' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Language And Syntax</em>' containment reference.
	 * @see #getLanguageAndSyntax()
	 * @generated
	 */
	void setLanguageAndSyntax(OntologyLanguageAndSyntax value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Representation</em>' containment reference.
	 * @see #setRepresentation(OpaqueData)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationRendering_Representation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='representation' namespace='##targetNamespace'"
	 * @generated
	 */
	OpaqueData getRepresentation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationRendering#getRepresentation <em>Representation</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Representation</em>' containment reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(OpaqueData value);

} // AssociationRendering
