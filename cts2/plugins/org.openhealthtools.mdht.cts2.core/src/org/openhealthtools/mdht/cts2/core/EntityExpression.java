/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Expression</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * An expression in a given ontology language and syntax that describes or defines an entity. Examples might include descriptions of entities in
 * Manchester OWL Syntax, RDF, SNOMED Concept Expression,
 * etc.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.EntityExpression#getOntologyLanguageAndSyntax <em>Ontology Language And Syntax</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.EntityExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getEntityExpression()
 * @model extendedMetaData="name='EntityExpression' kind='elementOnly'"
 * @generated
 */
public interface EntityExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Ontology Language And Syntax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the ontology language and syntax of the expression
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Ontology Language And Syntax</em>' containment reference.
	 * @see #setOntologyLanguageAndSyntax(OntologyLanguageAndSyntax)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getEntityExpression_OntologyLanguageAndSyntax()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ontologyLanguageAndSyntax' namespace='##targetNamespace'"
	 * @generated
	 */
	OntologyLanguageAndSyntax getOntologyLanguageAndSyntax();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.EntityExpression#getOntologyLanguageAndSyntax
	 * <em>Ontology Language And Syntax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Ontology Language And Syntax</em>' containment reference.
	 * @see #getOntologyLanguageAndSyntax()
	 * @generated
	 */
	void setOntologyLanguageAndSyntax(OntologyLanguageAndSyntax value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the actual expression
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(OpaqueData)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getEntityExpression_Expression()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	OpaqueData getExpression();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.EntityExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(OpaqueData value);

} // EntityExpression
