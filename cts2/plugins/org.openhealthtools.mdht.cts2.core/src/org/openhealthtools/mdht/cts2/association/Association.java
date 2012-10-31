/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.association;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.cts2.core.Changeable;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.PredicateReference;
import org.openhealthtools.mdht.cts2.core.Property;
import org.openhealthtools.mdht.cts2.core.ReasoningAlgorithmReference;
import org.openhealthtools.mdht.cts2.core.StatementTarget;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A "semantic" assertion about a relationship between a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">subject</i> entity and a target
 * entity, literal or compound expression as represented by an unnamed blank node ("bnode").
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.association.Association#getSubject <em>Subject</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.Association#getPredicate <em>Predicate</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.Association#getTarget <em>Target</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.Association#getAssociationQualifier <em>Association Qualifier</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.Association#getAssertedBy <em>Asserted By</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.Association#getAssertedIn <em>Asserted In</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.Association#getDerivationReasoningAlgorithm <em>Derivation Reasoning Algorithm</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.Association#getSourceStatements <em>Source Statements</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.Association#getAssociationID <em>Association ID</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.Association#getDerivation <em>Derivation</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.Association#getLocalID <em>Local ID</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociation()
 * @model extendedMetaData="name='Association' kind='elementOnly'"
 * @generated
 */
public interface Association extends Changeable {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the subject of the association statement. <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">subject </i>must reference an <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">Entity </i>- i.e. a class, predicate and/or individual.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(URIAndEntityName)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociation_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	URIAndEntityName getSubject();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.Association#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(URIAndEntityName value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the predicate of the association statement.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(PredicateReference)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociation_Predicate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='predicate' namespace='##targetNamespace'"
	 * @generated
	 */
	PredicateReference getPredicate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.Association#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(PredicateReference value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.StatementTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the target (object) of the association statement. A target may be a reference to an entity, an external resource URI, a literal or a compound
	 * expression (bnode) or a set of
	 * targets.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociation_Target()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StatementTarget> getTarget();

	/**
	 * Returns the value of the '<em><b>Association Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * additional tag/value attributes that qualify the association statement itself as opposed to the statement subject.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Association Qualifier</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociation_AssociationQualifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='associationQualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Property> getAssociationQualifier();

	/**
	 * Returns the value of the '<em><b>Asserted By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the code system version that is making this assertion. A code system version makes an assertion when (a) it contains the assertion, (b) it
	 * imports a code system version that contains the
	 * assertion or (c) the assertion is inferred from other assertions.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Asserted By</em>' containment reference.
	 * @see #setAssertedBy(CodeSystemVersionReference)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociation_AssertedBy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='assertedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionReference getAssertedBy();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.Association#getAssertedBy <em>Asserted By</em>}' containment reference.
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
	 * the code system version that actually contains this assertion. If absent, it is the same resource as <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">assertedBy</i>.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Asserted In</em>' containment reference.
	 * @see #setAssertedIn(CodeSystemVersionReference)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociation_AssertedIn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assertedIn' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionReference getAssertedIn();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.Association#getAssertedIn <em>Asserted In</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Derivation Reasoning Algorithm</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.ReasoningAlgorithmReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reasoning algorithm that was used to derive an association of <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">derivation</i>
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">INFERRED</i>. Note that more than one reasoning algorithm may be present for the
	 * same association.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Derivation Reasoning Algorithm</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociation_DerivationReasoningAlgorithm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivationReasoningAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReasoningAlgorithmReference> getDerivationReasoningAlgorithm();

	/**
	 * Returns the value of the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * detail about the provenance and history of the statement(s) from which this particular association is derived. This attribute will only be
	 * present in CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">2</sub> service implementations that
	 * support the statements model.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Source Statements</em>' attribute.
	 * @see #setSourceStatements(String)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociation_SourceStatements()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.StatementDirectoryURI"
	 *        extendedMetaData="kind='element' name='sourceStatements' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceStatements();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.Association#getSourceStatements <em>Source Statements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source Statements</em>' attribute.
	 * @see #getSourceStatements()
	 * @generated
	 */
	void setSourceStatements(String value);

	/**
	 * Returns the value of the '<em><b>Association ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the unique identifier of the association instance. While the update mechanism of the CTS<sub
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">2</sub> specifications requires that all <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">Changeable</i> elements have unique identifiers, the rules
	 * and mechanism for assigning unique identifiers to statements and associations are non-trivial. At the moment, the CTS<sub
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">2</sub> specification remains silent when it comes to arriving at how this identifier
	 * is
	 * generated except to note that, if two service implementations do not generate the same unique identifier for the same assertion, then the <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">prevImage</i> element in <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">Changeable</i> becomes the only way to
	 * identify which Association instance is being updated or deleted.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Association ID</em>' attribute.
	 * @see #setAssociationID(String)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociation_AssociationID()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.URI" required="true"
	 *        extendedMetaData="kind='attribute' name='associationID'"
	 * @generated
	 */
	String getAssociationID();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.Association#getAssociationID <em>Association ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Association ID</em>' attribute.
	 * @see #getAssociationID()
	 * @generated
	 */
	void setAssociationID(String value);

	/**
	 * Returns the value of the '<em><b>Derivation</b></em>' attribute.
	 * The default value is <code>"ASSERTED"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.association.AssociationDerivation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * how this association was derived. <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">ASSERTED </i>takes precedence over <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">DERIVED </i>, meaning that an assertion that is both asserted and derived is marked as
	 * asserted.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Derivation</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationDerivation
	 * @see #isSetDerivation()
	 * @see #unsetDerivation()
	 * @see #setDerivation(AssociationDerivation)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociation_Derivation()
	 * @model default="ASSERTED" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='derivation'"
	 * @generated
	 */
	AssociationDerivation getDerivation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.Association#getDerivation <em>Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Derivation</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.association.AssociationDerivation
	 * @see #isSetDerivation()
	 * @see #unsetDerivation()
	 * @see #getDerivation()
	 * @generated
	 */
	void setDerivation(AssociationDerivation value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.association.Association#getDerivation <em>Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetDerivation()
	 * @see #getDerivation()
	 * @see #setDerivation(AssociationDerivation)
	 * @generated
	 */
	void unsetDerivation();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.association.Association#getDerivation <em>Derivation</em>}' attribute is
	 * set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Derivation</em>' attribute is set.
	 * @see #unsetDerivation()
	 * @see #getDerivation()
	 * @see #setDerivation(AssociationDerivation)
	 * @generated
	 */
	boolean isSetDerivation();

	/**
	 * Returns the value of the '<em><b>Local ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the local identifier of the association instance. If externalStatementID is present, it will be used
	 * for the localId. If not, the localID will be generated by the service.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Local ID</em>' attribute.
	 * @see #setLocalID(String)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociation_LocalID()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.String"
	 *        extendedMetaData="kind='attribute' name='localID'"
	 * @generated
	 */
	String getLocalID();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.Association#getLocalID <em>Local ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Local ID</em>' attribute.
	 * @see #getLocalID()
	 * @generated
	 */
	void setLocalID(String value);

} // Association
