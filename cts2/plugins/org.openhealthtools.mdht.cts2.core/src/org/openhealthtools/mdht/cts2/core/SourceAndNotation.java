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
 * A representation of the model object '<em><b>Source And Notation</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A description of the source from which the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ResourceVersionDescription</i> was derived. When
 * possible, <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">SourceAndNotation</i> should include a reference to the actual source document from
 * which it was
 * derived. As an example, if the resource was derived from the W3C Wine Ontology, the URI http://www.w3.org/TR/2003/CR-owl-guide-20030818/wine would
 * unambiguously name the document. In the cases, however, when a definitive
 * source document is not available, a textual description should be provided, instead, in <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">sourceAndNotationDescription</i>. Where possible, the ontology language and ontology syntax should
 * also be provided. In the case of
 * the Wine Ontology above, the ontology language would be http://www.w3.org/2002/07/owl# (OWL) and the syntax would be application/rdf+xml.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.SourceAndNotation#getSourceAndNotationDescription <em>Source And Notation Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.SourceAndNotation#getSourceDocument <em>Source Document</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.SourceAndNotation#getSourceLanguage <em>Source Language</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.SourceAndNotation#getSourceDocumentSyntax <em>Source Document Syntax</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getSourceAndNotation()
 * @model extendedMetaData="name='SourceAndNotation' kind='elementOnly'"
 * @generated
 */
public interface SourceAndNotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Source And Notation Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a textual description of where the specified resource version was derived from. This parameter must be supplied if a reasonable <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">PersistentURI</i> for the source document is not
	 * available.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Source And Notation Description</em>' attribute.
	 * @see #setSourceAndNotationDescription(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getSourceAndNotation_SourceAndNotationDescription()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.String"
	 *        extendedMetaData="kind='element' name='sourceAndNotationDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceAndNotationDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.SourceAndNotation#getSourceAndNotationDescription
	 * <em>Source And Notation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source And Notation Description</em>' attribute.
	 * @see #getSourceAndNotationDescription()
	 * @generated
	 */
	void setSourceAndNotationDescription(String value);

	/**
	 * Returns the value of the '<em><b>Source Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a persistent URI that references the document from which the resource version was derived. This URI may be resolvable to a digital resource or
	 * may be the name of a book, publication or other external
	 * document.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Source Document</em>' attribute.
	 * @see #setSourceDocument(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getSourceAndNotation_SourceDocument()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.PersistentURI"
	 *        extendedMetaData="kind='element' name='sourceDocument' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceDocument();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.SourceAndNotation#getSourceDocument <em>Source Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source Document</em>' attribute.
	 * @see #getSourceDocument()
	 * @generated
	 */
	void setSourceDocument(String value);

	/**
	 * Returns the value of the '<em><b>Source Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the formal language, if any, that the source for the resource version is expressed in. Examples include Common Logic, OWL, OWL-DL, <a
	 * href="//http://esearch.cen.eu/Details.aspx?id=4244858" xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">CLAML</a>,
	 * etc.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Source Language</em>' containment reference.
	 * @see #setSourceLanguage(OntologyLanguageReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getSourceAndNotation_SourceLanguage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceLanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	OntologyLanguageReference getSourceLanguage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.SourceAndNotation#getSourceLanguage <em>Source Language</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source Language</em>' containment reference.
	 * @see #getSourceLanguage()
	 * @generated
	 */
	void setSourceLanguage(OntologyLanguageReference value);

	/**
	 * Returns the value of the '<em><b>Source Document Syntax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the syntax of the source of the resource version, if known. Examples might include rdf/xml, Turtle, Manchester Syntax, CSV, etc.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Source Document Syntax</em>' containment reference.
	 * @see #setSourceDocumentSyntax(OntologySyntaxReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getSourceAndNotation_SourceDocumentSyntax()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceDocumentSyntax' namespace='##targetNamespace'"
	 * @generated
	 */
	OntologySyntaxReference getSourceDocumentSyntax();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.SourceAndNotation#getSourceDocumentSyntax <em>Source Document Syntax</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source Document Syntax</em>' containment reference.
	 * @see #getSourceDocumentSyntax()
	 * @generated
	 */
	void setSourceDocumentSyntax(OntologySyntaxReference value);

} // SourceAndNotation
