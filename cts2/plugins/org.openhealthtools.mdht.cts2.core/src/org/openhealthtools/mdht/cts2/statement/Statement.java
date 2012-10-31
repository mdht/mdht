/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.statement;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.cts2.core.Changeable;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.ModelAttributeReference;
import org.openhealthtools.mdht.cts2.core.SourceAndRoleReference;
import org.openhealthtools.mdht.cts2.core.StatementTarget;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * An assertion about a CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">2</sub> model element.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.Statement#getStatementURI <em>Statement URI</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.Statement#getSubject <em>Subject</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.Statement#getPredicate <em>Predicate</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.Statement#getTarget <em>Target</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.Statement#getAssociatedAttribute <em>Associated Attribute</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.Statement#getSource <em>Source</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.Statement#getAssertedBy <em>Asserted By</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.Statement#getAssertedIn <em>Asserted In</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.statement.Statement#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatement()
 * @model extendedMetaData="name='Statement' kind='elementOnly'"
 * @generated
 */
public interface Statement extends Changeable {
	/**
	 * Returns the value of the '<em><b>Statement URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique statement identifier. Must be globally unique if information is to be exchanged and updated on the statement leve.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Statement URI</em>' attribute.
	 * @see #setStatementURI(String)
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatement_StatementURI()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.URI" required="true"
	 *        extendedMetaData="kind='element' name='statementURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStatementURI();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.statement.Statement#getStatementURI <em>Statement URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Statement URI</em>' attribute.
	 * @see #getStatementURI()
	 * @generated
	 */
	void setStatementURI(String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the subject of the statement - either a resource or a reference to a terminological entity. <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">subject</i> may reference a specific <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">Association</i>, <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">CodeSystem</i>,
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">CodeSystemVersion</i>, <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">Map</i>, <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">MapEntry</i>, <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">MapVersion</i>, <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">EntityDescription,</i>
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">ValueSet</i>, <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">ValueSetDefinition</i>, <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">ConceptDomain</i>, <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">ConceptDomainBinding</i>,
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(StatementSubject)
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatement_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	StatementSubject getSubject();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.statement.Statement#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(StatementSubject value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the predicate of the statement. Note that this is type <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">URIAndEntityName </i>as, while
	 * it serves as a predicate in the statement itself it is not necessary that it be formally recognized as a
	 * predicate by the CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">2</sub> service - it may have been translated or transformed by
	 * the load process.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(URIAndEntityName)
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatement_Predicate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='predicate' namespace='##targetNamespace'"
	 * @generated
	 */
	URIAndEntityName getPredicate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.statement.Statement#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(URIAndEntityName value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.StatementTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatement_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StatementTarget> getTarget();

	/**
	 * Returns the value of the '<em><b>Associated Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the identifier and name of the CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Statement">2</sub> attribute or element that renders this
	 * statement, if any
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Associated Attribute</em>' containment reference.
	 * @see #setAssociatedAttribute(ModelAttributeReference)
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatement_AssociatedAttribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='associatedAttribute' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelAttributeReference getAssociatedAttribute();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.statement.Statement#getAssociatedAttribute <em>Associated Attribute</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Associated Attribute</em>' containment reference.
	 * @see #getAssociatedAttribute()
	 * @generated
	 */
	void setAssociatedAttribute(ModelAttributeReference value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.SourceAndRoleReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the source(s) of the statement and the role(s) they played
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatement_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SourceAndRoleReference> getSource();

	/**
	 * Returns the value of the '<em><b>Asserted By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the code system version that is asserting this particular statement. In the case of ontologies that import other ontologies, this is the
	 * outermost importing ontology.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Asserted By</em>' containment reference.
	 * @see #setAssertedBy(CodeSystemVersionReference)
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatement_AssertedBy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='assertedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionReference getAssertedBy();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.statement.Statement#getAssertedBy <em>Asserted By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Asserted By</em>' containment reference.
	 * @see #getAssertedBy()
	 * @generated
	 */
	void setAssertedBy(CodeSystemVersionReference value);

	/**
	 * Returns the value of the '<em><b>Asserted In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the code system version (ontology) that actually makes this statement. In the case of ontologies, this is the innermost imported ontology.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Asserted In</em>' containment reference.
	 * @see #setAssertedIn(CodeSystemVersionReference)
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatement_AssertedIn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assertedIn' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionReference getAssertedIn();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.statement.Statement#getAssertedIn <em>Asserted In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Asserted In</em>' containment reference.
	 * @see #getAssertedIn()
	 * @generated
	 */
	void setAssertedIn(CodeSystemVersionReference value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.statement.StatementQualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#getStatement_Qualifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StatementQualifier> getQualifier();

} // Statement
