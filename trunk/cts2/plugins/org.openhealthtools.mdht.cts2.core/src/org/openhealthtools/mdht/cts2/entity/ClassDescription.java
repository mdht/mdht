/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Description</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * the description of an entity that is a Class, Type or "Concept". <a href="//http://www.w3.org/TR/2009/REC-owl2-syntax-20091027/#Classes"
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">"Classes can be understood as sets of
 * individuals"</a>.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.ClassDescription#getDescriptionState <em>Description State</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.ClassDescription#getDescriptionType <em>Description Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getClassDescription()
 * @model extendedMetaData="name='ClassDescription' kind='elementOnly'"
 * @generated
 */
public interface ClassDescription extends NamedEntityDescription {
	/**
	 * Returns the value of the '<em><b>Description State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.entity.ClassDescriptionState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an indicator that states whether the class description contains only necessary assertions <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">(PRIMITIVE)</i> or is considered to be both necessary and sufficient assertions
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">(FULLY_DEFINED)</i>.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Description State</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.entity.ClassDescriptionState
	 * @see #isSetDescriptionState()
	 * @see #unsetDescriptionState()
	 * @see #setDescriptionState(ClassDescriptionState)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getClassDescription_DescriptionState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='descriptionState'"
	 * @generated
	 */
	ClassDescriptionState getDescriptionState();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.ClassDescription#getDescriptionState <em>Description State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Description State</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.entity.ClassDescriptionState
	 * @see #isSetDescriptionState()
	 * @see #unsetDescriptionState()
	 * @see #getDescriptionState()
	 * @generated
	 */
	void setDescriptionState(ClassDescriptionState value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.entity.ClassDescription#getDescriptionState <em>Description State</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetDescriptionState()
	 * @see #getDescriptionState()
	 * @see #setDescriptionState(ClassDescriptionState)
	 * @generated
	 */
	void unsetDescriptionState();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.entity.ClassDescription#getDescriptionState <em>Description State</em>}'
	 * attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Description State</em>' attribute is set.
	 * @see #unsetDescriptionState()
	 * @see #getDescriptionState()
	 * @see #setDescriptionState(ClassDescriptionState)
	 * @generated
	 */
	boolean isSetDescriptionState();

	/**
	 * Returns the value of the '<em><b>Description Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.entity.ClassDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the specific role that the class description plays, if known.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Description Type</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.entity.ClassDescriptionType
	 * @see #isSetDescriptionType()
	 * @see #unsetDescriptionType()
	 * @see #setDescriptionType(ClassDescriptionType)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getClassDescription_DescriptionType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='descriptionType'"
	 * @generated
	 */
	ClassDescriptionType getDescriptionType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.ClassDescription#getDescriptionType <em>Description Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Description Type</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.entity.ClassDescriptionType
	 * @see #isSetDescriptionType()
	 * @see #unsetDescriptionType()
	 * @see #getDescriptionType()
	 * @generated
	 */
	void setDescriptionType(ClassDescriptionType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.entity.ClassDescription#getDescriptionType <em>Description Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetDescriptionType()
	 * @see #getDescriptionType()
	 * @see #setDescriptionType(ClassDescriptionType)
	 * @generated
	 */
	void unsetDescriptionType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.entity.ClassDescription#getDescriptionType <em>Description Type</em>}'
	 * attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Description Type</em>' attribute is set.
	 * @see #unsetDescriptionType()
	 * @see #getDescriptionType()
	 * @see #setDescriptionType(ClassDescriptionType)
	 * @generated
	 */
	boolean isSetDescriptionType();

} // ClassDescription
