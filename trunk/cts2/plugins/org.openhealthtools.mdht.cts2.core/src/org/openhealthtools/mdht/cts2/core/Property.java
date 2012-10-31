/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A tag/value pair that does not have a corresponding model attribute. <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Property</i> represent any
 * statement about a resource (e.g. CodeSystem, Entity, etc.) that does not have a corresponding attribute in the
 * CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub> model. As an example, the NCI Thesaurus uses a tag named <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">BioCarta_ID</i> (C43677) to associate appropriate thesaurus entities with Bio Carta pathway
 * references. This would be represented by a property,
 * whose predicate is the URI for C436777 and the value is the actual id.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Property#getPredicate <em>Predicate</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Property#getValue <em>Value</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Property#getPropertyQualifier <em>Property Qualifier</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Property#getCorrespondingStatement <em>Corresponding Statement</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getProperty()
 * @model extendedMetaData="name='Property' kind='elementOnly'"
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the name and URI of the property predicate
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(PredicateReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getProperty_Predicate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='predicate' namespace='##targetNamespace'"
	 * @generated
	 */
	PredicateReference getPredicate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Property#getPredicate <em>Predicate</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.StatementTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the target(s) of the property. Note that this can only represent the literal format of the property. The details about the original property
	 * will be found in the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">correspondingStatement </i>if the
	 * CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub> implementation supports the<b
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core"> Statement</b> profile.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getProperty_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StatementTarget> getValue();

	/**
	 * Returns the value of the '<em><b>Property Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an assertion whose subject is the assertion in the property instead of the property subject
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Property Qualifier</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getProperty_PropertyQualifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='propertyQualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Property> getPropertyQualifier();

	/**
	 * Returns the value of the '<em><b>Corresponding Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a link to the original statement from which this <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Property</i> is derived. Will only be
	 * present in CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub> implementations that support the <b
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Statement</b> profile.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Corresponding Statement</em>' attribute.
	 * @see #setCorrespondingStatement(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getProperty_CorrespondingStatement()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.RenderingURI"
	 *        extendedMetaData="kind='attribute' name='correspondingStatement'"
	 * @generated
	 */
	String getCorrespondingStatement();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Property#getCorrespondingStatement <em>Corresponding Statement</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Corresponding Statement</em>' attribute.
	 * @see #getCorrespondingStatement()
	 * @generated
	 */
	void setCorrespondingStatement(String value);

} // Property
