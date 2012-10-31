/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property Description</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * the description of a "semantic" predicate. <a href="//http://www.w3.org/TR/2009/REC-owl2-syntax-20091027/#Object_Properties"
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">
 * <i>"</i>Object properties connect pairs of individuals."</a>
 * 
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription#getDirected <em>Directed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription#getTransitivity <em>Transitivity</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getObjectPropertyDescription()
 * @model extendedMetaData="name='ObjectPropertyDescription' kind='elementOnly'"
 * @generated
 */
public interface ObjectPropertyDescription extends PredicateDescription {
	/**
	 * Returns the value of the '<em><b>Directed</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.entity.ObjectPropertyDirectionality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an indicator that states whether the object property is unidirectional (i.e. requires an inverse to be explicitly declared) or is
	 * bidirectional.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Directed</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.entity.ObjectPropertyDirectionality
	 * @see #isSetDirected()
	 * @see #unsetDirected()
	 * @see #setDirected(ObjectPropertyDirectionality)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getObjectPropertyDescription_Directed()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='directed'"
	 * @generated
	 */
	ObjectPropertyDirectionality getDirected();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription#getDirected <em>Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Directed</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.entity.ObjectPropertyDirectionality
	 * @see #isSetDirected()
	 * @see #unsetDirected()
	 * @see #getDirected()
	 * @generated
	 */
	void setDirected(ObjectPropertyDirectionality value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription#getDirected <em>Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetDirected()
	 * @see #getDirected()
	 * @see #setDirected(ObjectPropertyDirectionality)
	 * @generated
	 */
	void unsetDirected();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription#getDirected <em>Directed</em>}'
	 * attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Directed</em>' attribute is set.
	 * @see #unsetDirected()
	 * @see #getDirected()
	 * @see #setDirected(ObjectPropertyDirectionality)
	 * @generated
	 */
	boolean isSetDirected();

	/**
	 * Returns the value of the '<em><b>Transitivity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.entity.Transitivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * transitivity characteristics of the property. If not supplied, transitivity characteristics are either unknown or not applicable (i.e. $domain
	 * \cup range = \emptyset$)
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Transitivity</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.entity.Transitivity
	 * @see #isSetTransitivity()
	 * @see #unsetTransitivity()
	 * @see #setTransitivity(Transitivity)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getObjectPropertyDescription_Transitivity()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='transitivity'"
	 * @generated
	 */
	Transitivity getTransitivity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription#getTransitivity <em>Transitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Transitivity</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.entity.Transitivity
	 * @see #isSetTransitivity()
	 * @see #unsetTransitivity()
	 * @see #getTransitivity()
	 * @generated
	 */
	void setTransitivity(Transitivity value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription#getTransitivity <em>Transitivity</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetTransitivity()
	 * @see #getTransitivity()
	 * @see #setTransitivity(Transitivity)
	 * @generated
	 */
	void unsetTransitivity();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription#getTransitivity <em>Transitivity</em>}'
	 * attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Transitivity</em>' attribute is set.
	 * @see #unsetTransitivity()
	 * @see #getTransitivity()
	 * @see #setTransitivity(Transitivity)
	 * @generated
	 */
	boolean isSetTransitivity();

} // ObjectPropertyDescription
