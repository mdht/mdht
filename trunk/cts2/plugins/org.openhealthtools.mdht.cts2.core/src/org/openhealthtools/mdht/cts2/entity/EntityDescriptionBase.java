/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.Comment;
import org.openhealthtools.mdht.cts2.core.Definition;
import org.openhealthtools.mdht.cts2.core.Example;
import org.openhealthtools.mdht.cts2.core.Property;
import org.openhealthtools.mdht.cts2.core.ScopedEntityName;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description Base</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * The attributes common to both named and anonymous entity descriptions. <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">EntityDescriptionBase
 * </i>is an abstract class and cannot be directly instantiated.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getEntityID <em>Entity ID</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getAlternateEntityID <em>Alternate Entity ID</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getDescribingCodeSystemVersion <em>Describing Code System Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getDesignation <em>Designation</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getDefinition <em>Definition</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getExample <em>Example</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getNote <em>Note</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getProperty <em>Property</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getSourceStatements <em>Source Statements</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getSubjectOf <em>Subject Of</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getPredicateOf <em>Predicate Of</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getTargetOf <em>Target Of</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getParent <em>Parent</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getAncestors <em>Ancestors</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getChildren <em>Children</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getDescendants <em>Descendants</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getEntityType <em>Entity Type</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getInstances <em>Instances</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getEquivalentEntity <em>Equivalent Entity</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getAbout <em>About</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase()
 * @model abstract="true"
 *        extendedMetaData="name='EntityDescriptionBase' kind='elementOnly'"
 * @generated
 */
public interface EntityDescriptionBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the local namespace name and entity name that, together, uniquely name this referenced within the context of a CTS<sub
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">2</sub> service instance. As an example, a service instance may choose to designate
	 * the entity referenced by the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">about</i> URI of
	 * http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#CabernetSauvignon with the <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">namespaceName</i> "wine" and the <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">name</i> "CabernetSauvignon".The <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">name</i>
	 * portion of ScopedEntityName must uniquely name the particular entity within the context of the code system version.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Entity ID</em>' containment reference.
	 * @see #setEntityID(ScopedEntityName)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_EntityID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='entityID' namespace='##targetNamespace'"
	 * @generated
	 */
	ScopedEntityName getEntityID();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getEntityID <em>Entity ID</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entity ID</em>' containment reference.
	 * @see #getEntityID()
	 * @generated
	 */
	void setEntityID(ScopedEntityName value);

	/**
	 * Returns the value of the '<em><b>Alternate Entity ID</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.ScopedEntityName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * alternative unique identifiers that reference the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">about</i> entity in the context of
	 * describing code system version. The <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">namespace</i> names the context from which the name
	 * (or code) is derived.
	 * Note that it is possible for the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">entityId name</i> and/or one more <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">alternateEntityId</i>
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">names</i> to be represented in the <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">designation</i> attribute as well. This would occur when the <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">name</i> serves a dual role of unique identifier and human readable label. An example of
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">alternateEntityId</i> would be the SNOMED-CT fully specified name, which serves as a
	 * unique identifier in human readable form. This might or might not also be considered a designation depending on the context
	 * and use case. Similarly, the SNOMED-CT Clinical Terms V3 Identifier (CTV3) and SNOMED-3 identifiers would appear here as well, as would the
	 * HL7's case sensitive and case insensitive unit of measure
	 * identifiers.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Alternate Entity ID</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_AlternateEntityID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alternateEntityID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ScopedEntityName> getAlternateEntityID();

	/**
	 * Returns the value of the '<em><b>Describing Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to the version of an ontology or code system that makes the set of assertions contained in this description. Note that this
	 * references the "asserting", not the "containing" code system
	 * version. As an example, the Wine Ontology imports the Food Ontology, which, in turn contains descriptions of PotableLiquid. A service that
	 * represented a (version of) the Wine Ontology would contain an entity
	 * description <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">about</i>
	 * "http://www.w3.org/TR/2003/PR-owl-guide-20031209/food#PotableLiquid" (namespaceName: food, name: PotableLiquid). The
	 * describingCodeSystemVersion, however, would be
	 * "http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#" even though this entity was described in the food ontology. Note also that it both the
	 * food and wine ontology were represented in a service, the service would
	 * contain two entity descriptions - one from the food ontology perspective and one from the wine ontology perspective.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Describing Code System Version</em>' containment reference.
	 * @see #setDescribingCodeSystemVersion(CodeSystemVersionReference)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_DescribingCodeSystemVersion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='describingCodeSystemVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionReference getDescribingCodeSystemVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getDescribingCodeSystemVersion
	 * <em>Describing Code System Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Describing Code System Version</em>' containment reference.
	 * @see #getDescribingCodeSystemVersion()
	 * @generated
	 */
	void setDescribingCodeSystemVersion(CodeSystemVersionReference value);

	/**
	 * Returns the value of the '<em><b>Designation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.entity.Designation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a <a href="//http://www.w3.org/TR/2009/CR-skos-reference-20090317/#labels" xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">
	 * "string of (UNICODE) characters ... in a given natural language, such as English or Japanese."</a> A designation provides the
	 * strongest clues as to the meaning of a class, predicate or individual. While designations are not mandatory in an entity description, as all
	 * that may be available to a service is a code, service implementers are
	 * strongly encouraged to provide at least one preferred or alternate designation to make the description visible to text search engines.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Designation</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_Designation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='designation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Designation> getDesignation();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.Definition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an explanation of the intended meaning of a concept. An <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">EntityDescription</i> may have
	 * multiple <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">definitions</i>, each derived from a different source, represented in a
	 * different language or having
	 * a different purpose. Definitions apply only to classes and predicates, not individuals.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Definition</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Definition> getDefinition();

	/**
	 * Returns the value of the '<em><b>Example</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.Example}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an example of an instance or instances of the referenced entity, typically written for human consumption. Examples apply only to classes and
	 * predicates, not individuals.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Example</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_Example()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='example' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Example> getExample();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a note or comment about the history, status, use or other descriptions about the <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">EntityDescription</i>. Observe that <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">note</i>, as used in the CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">2</sub>
	 * specification, does include examples
	 * or definitions.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Comment> getNote();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * additional "non-semantic" (annotation) assertions about the entity being described that do not fit into the <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">designation, definition</i>, <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">note</i>,
	 * or <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">example</i> or <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">entityId</i>
	 * categories.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">DirectoryURI</i> that resolves to the list of <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">statements</i> that were used in the assembly of this description. <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">Statements</i> need only be present in service instances that support the
	 * <b xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">Statement</b> profile, and serves as a bridge between atomic structure contained in the
	 * source resource and the CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">2</sub> rendering.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Source Statements</em>' attribute.
	 * @see #setSourceStatements(String)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_SourceStatements()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.StatementDirectoryURI"
	 *        extendedMetaData="kind='element' name='sourceStatements' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceStatements();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getSourceStatements <em>Source Statements</em>}'
	 * attribute.
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
	 * Returns the value of the '<em><b>Subject Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">AssociationDirectoryURI</i> that resolves to a list of active associations ("semantic"
	 * assertions) in which the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">about</i> entity appears as a subject and that are <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">assertedBy</i> the
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">describingCodeSystemVersion</i>. <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">subjectOf</i> is only included in an <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">EntityDescription </i>when resolution would yield at least one result. This attribute will
	 * only be present in CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">2</sub> service
	 * implementations that support the <b xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">ASSOCIATION QUERY</b> profile.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Subject Of</em>' attribute.
	 * @see #setSubjectOf(String)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_SubjectOf()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.AssociationDirectoryURI"
	 *        extendedMetaData="kind='element' name='subjectOf' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSubjectOf();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getSubjectOf <em>Subject Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Subject Of</em>' attribute.
	 * @see #getSubjectOf()
	 * @generated
	 */
	void setSubjectOf(String value);

	/**
	 * Returns the value of the '<em><b>Predicate Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">DirectoryURI</i> that resolves to the list of active associations ("semantic"
	 * assertions) in which the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">about</i> entity appears as a predicate and that are <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">assertedBy</i> the
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">describingCodeSystemVersion</i>. <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">predicateOf </i>is only included in an <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">EntityDescription </i>when resolution would yield at least one result. This attribute will
	 * only be present in CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">2</sub>
	 * service implementations that support the <b xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">ASSOCIATION QUERY</b> profile.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Predicate Of</em>' attribute.
	 * @see #setPredicateOf(String)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_PredicateOf()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.AssociationDirectoryURI"
	 *        extendedMetaData="kind='element' name='predicateOf' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPredicateOf();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getPredicateOf <em>Predicate Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Predicate Of</em>' attribute.
	 * @see #getPredicateOf()
	 * @generated
	 */
	void setPredicateOf(String value);

	/**
	 * Returns the value of the '<em><b>Target Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">DirectoryURI</i> that resolves to the list of active associations ("semantic"
	 * assertions) in which the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">about</i> entity appears as either a direct target or the target
	 * of a contained BNode and
	 * that are <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">assertedBy</i> the <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">describingCodeSystemVersion</i>. <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">targetOf </i>is only included in an <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">EntityDescription </i>when resolution would yield at least one result. This attribute will
	 * only be present
	 * in CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">2</sub> service implementations that support the <b
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">ASSOCIATION QUERY</b> profile.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Target Of</em>' attribute.
	 * @see #setTargetOf(String)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_TargetOf()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.AssociationDirectoryURI"
	 *        extendedMetaData="kind='element' name='targetOf' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTargetOf();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getTargetOf <em>Target Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Target Of</em>' attribute.
	 * @see #getTargetOf()
	 * @generated
	 */
	void setTargetOf(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.URIAndEntityName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the set of direct "parents" asserted by <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">describingCodeSystemVersion</i>. It is the
	 * responsibility of the service to determine what predicate(s) represent "parent/child" relationships. Typically
	 * "parent" is associated with "rdfs:subClassOf" in the OWL/RDF world and skos:broader/skos:narrower in the SKOS environment. It is possible,
	 * however for some code systems to have other relationships as well. As an
	 * example, some of the Open Biomedical Ontologies (OBO) use a mixture of subClassOf and partOf relationships.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Parent</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_Parent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<URIAndEntityName> getParent();

	/**
	 * Returns the value of the '<em><b>Ancestors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">DirectoryURI</i> that resolves to the transitive closure of the "parents"
	 * relationship(s). The primary purpose for this attribute is to provide a handle for subsumption queries. As an example, to
	 * determine whether Class X was a subclass of Class Y, one would query whether the <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">EntityReference </i>to Y was a member of X.ancestors.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Ancestors</em>' attribute.
	 * @see #setAncestors(String)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_Ancestors()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.EntityDirectoryURI"
	 *        extendedMetaData="kind='element' name='ancestors' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAncestors();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getAncestors <em>Ancestors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Ancestors</em>' attribute.
	 * @see #getAncestors()
	 * @generated
	 */
	void setAncestors(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">DirectoryURI</i> that resolves to the list of direct "children" asserted by <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">describingCodeSystemVersion</i>. As with <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">parent</i>, it is the responsibility of the service to determine what
	 * predicate(s) represent "parent/child" relationships. <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">children</i> may also include entity
	 * references that appear in the target of bnodes if they are determined to be such by the service.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Children</em>' attribute.
	 * @see #setChildren(String)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_Children()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.EntityDirectoryURI"
	 *        extendedMetaData="kind='element' name='children' namespace='##targetNamespace'"
	 * @generated
	 */
	String getChildren();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getChildren <em>Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Children</em>' attribute.
	 * @see #getChildren()
	 * @generated
	 */
	void setChildren(String value);

	/**
	 * Returns the value of the '<em><b>Descendants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">DirectoryURI</i> that resolves to the transitive closure of the "children"
	 * relationship(s). The primary purpose for this attribute is to provide a handle for subsumption queries. As an example, a
	 * second way to determine whether Class X was a subclass of Class Y, one would query whether the <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">EntityReference </i>to X was a member of Y.<i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">descendants</i>.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Descendants</em>' attribute.
	 * @see #setDescendants(String)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_Descendants()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.EntityDirectoryURI"
	 *        extendedMetaData="kind='element' name='descendants' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescendants();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getDescendants <em>Descendants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Descendants</em>' attribute.
	 * @see #getDescendants()
	 * @generated
	 */
	void setDescendants(String value);

	/**
	 * Returns the value of the '<em><b>Entity Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.URIAndEntityName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the set of type(s) which the entityReference is an instance of. Because this is a terminology service, <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">entityType</i> must include one of owl:class, owl:individual, rdf:predicate or skos:concept,
	 * although it may carry many other types as well.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Entity Type</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_EntityType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='entityType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<URIAndEntityName> getEntityType();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">DirectoryURI</i> that resolves to the list of entities that asserted to be instances of
	 * the type represented by <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">about</i> URI. This element is present only if resolution will
	 * return a non-empty
	 * set.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Instances</em>' attribute.
	 * @see #setInstances(String)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_Instances()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.EntityDirectoryURI"
	 *        extendedMetaData="kind='element' name='instances' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInstances();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getInstances <em>Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Instances</em>' attribute.
	 * @see #getInstances()
	 * @generated
	 */
	void setInstances(String value);

	/**
	 * Returns the value of the '<em><b>Equivalent Entity</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.URIAndEntityName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an entity that has been determined to be equivalent to the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">about</i> entity in the
	 * context of the assertions made by <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">describingCodeSystemVersion</i>.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Equivalent Entity</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_EquivalentEntity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='equivalentEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<URIAndEntityName> getEquivalentEntity();

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the URI that represents the entity (class, predicate and/or individual) referenced by this <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">EntityDescription</i>
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">about</i> is a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">PersistentURI</i>
	 * when <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">entityDescriptionType</i> is <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">NAMED_ENTITY_DESCRIPTION</i> and <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">LocalURI</i> when <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">entityDescriptionType</i> is <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">ANONYMOUS_ENTITY_DESCRIPTION</i>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionBase_About()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.URI" required="true"
	 *        extendedMetaData="kind='attribute' name='about'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase#getAbout <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>About</em>' attribute.
	 * @see #getAbout()
	 * @generated
	 */
	void setAbout(String value);

} // EntityDescriptionBase
