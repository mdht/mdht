/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Description</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * 
 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">PredicateDescription</i> covers the spectrum of entities deemed "Role" in description logic,
 * "Relation" in predicate logic, "Property" in RDF and OWL, and "Association" in Ontylog DL. It describes the nature
 * and the purpose of the role, not the individual elements.Note that section 2.4.2.11 of the HL7 SFM calls for an attribute called "associationKind".
 * While we are not absolutely certain what this was intended to represent, we
 * believe that its intent is probably subsumed under the various individual types as well as the transitivity attribute. <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">forwardName</i> and <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">reverseName </i>are
 * called for in the SFM. The way that they are represented in
 * this model lacks the ability to represent them in a multi-lingual environment which may cause difficulties down the line. Service implementers who
 * are concerned about this aspect are encouraged to extend the service to allow
 * forward and reverse Name to be returned in the language appropriate to the service viewer.The <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">directed</i> attribute is actually more of a characteristic of the type of logic being used than
 * the individual properties, but
 * returning it as an attribute of a property seems sufficient.The HL7 SFM ruleSetId construct is not supported in this specification.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.PredicateDescription#getForwardName <em>Forward Name</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.PredicateDescription#getReverseName <em>Reverse Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getPredicateDescription()
 * @model extendedMetaData="name='PredicateDescription' kind='elementOnly'"
 * @generated
 */
public interface PredicateDescription extends NamedEntityDescription {
	/**
	 * Returns the value of the '<em><b>Forward Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the name assigned to the predicate when applied in the source to target direction. The primary purpose of this attribute is to provide some
	 * notion of "directional" semantics, as predicates named
	 * "part" or "broader term" often lack sufficient information to understand where the whole or broader component goes. Implementers will note
	 * that, as opposed to official designations, <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">forwardName</i> and
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">reverseName</i> are not keyed by language. Implementers are encouraged to develop
	 * designations and use the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">forwardName</i> and <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">reverseName</i> tags if a richer model is
	 * desired.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Forward Name</em>' attribute.
	 * @see #setForwardName(String)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getPredicateDescription_ForwardName()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.String"
	 *        extendedMetaData="kind='element' name='forwardName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getForwardName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.PredicateDescription#getForwardName <em>Forward Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Forward Name</em>' attribute.
	 * @see #getForwardName()
	 * @generated
	 */
	void setForwardName(String value);

	/**
	 * Returns the value of the '<em><b>Reverse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the name assigned to the predicate when applied in the target to source direction. The primary purpose of this attribute is to provide some
	 * notion of "directional" semantics, as predicates named
	 * "part" or "broader term" often lack sufficient information to understand where the whole or broader component goes.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Reverse Name</em>' attribute.
	 * @see #setReverseName(String)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getPredicateDescription_ReverseName()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.String"
	 *        extendedMetaData="kind='element' name='reverseName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReverseName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.PredicateDescription#getReverseName <em>Reverse Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Reverse Name</em>' attribute.
	 * @see #getReverseName()
	 * @generated
	 */
	void setReverseName(String value);

} // PredicateDescription
