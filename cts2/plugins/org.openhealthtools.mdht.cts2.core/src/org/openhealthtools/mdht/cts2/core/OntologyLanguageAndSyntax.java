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
 * A representation of the model object '<em><b>Ontology Language And Syntax</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * The language and syntax of an expression in an ontology. Language identifies the expression semantics (e.g. OWL 2.0, RDF, SNOMED Compositional
 * Expression, etc) and syntax identifies how it is represnted (e.g.
 * XML, text/plain, xml/rdf, manchester syntax, etc)
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.OntologyLanguageAndSyntax#getOntologyLanguage <em>Ontology Language</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.OntologyLanguageAndSyntax#getOntologySyntax <em>Ontology Syntax</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getOntologyLanguageAndSyntax()
 * @model extendedMetaData="name='OntologyLanguageAndSyntax' kind='elementOnly'"
 * @generated
 */
public interface OntologyLanguageAndSyntax extends EObject {
	/**
	 * Returns the value of the '<em><b>Ontology Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal language (semantics) of the expression.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Ontology Language</em>' containment reference.
	 * @see #setOntologyLanguage(OntologyLanguageReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getOntologyLanguageAndSyntax_OntologyLanguage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ontologyLanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	OntologyLanguageReference getOntologyLanguage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.OntologyLanguageAndSyntax#getOntologyLanguage <em>Ontology Language</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Ontology Language</em>' containment reference.
	 * @see #getOntologyLanguage()
	 * @generated
	 */
	void setOntologyLanguage(OntologyLanguageReference value);

	/**
	 * Returns the value of the '<em><b>Ontology Syntax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The syntax of the expression.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Ontology Syntax</em>' containment reference.
	 * @see #setOntologySyntax(OntologySyntaxReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getOntologyLanguageAndSyntax_OntologySyntax()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ontologySyntax' namespace='##targetNamespace'"
	 * @generated
	 */
	OntologySyntaxReference getOntologySyntax();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.OntologyLanguageAndSyntax#getOntologySyntax <em>Ontology Syntax</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Ontology Syntax</em>' containment reference.
	 * @see #getOntologySyntax()
	 * @generated
	 */
	void setOntologySyntax(OntologySyntaxReference value);

} // OntologyLanguageAndSyntax
