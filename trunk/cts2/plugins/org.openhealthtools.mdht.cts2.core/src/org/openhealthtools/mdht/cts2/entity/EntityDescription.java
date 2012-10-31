/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A choice of the possible types of entity description
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getNamedEntity <em>Named Entity</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getAnonymousEntity <em>Anonymous Entity</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getClassDescription <em>Class Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getDataTypeDescription <em>Data Type Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getPredicateDescription <em>Predicate Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getObjectPropertyDescription <em>Object Property Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getDataPropertyDescription <em>Data Property Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getAnnotationPropertyDescription <em>Annotation Property Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getNamedIndividual <em>Named Individual</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getAnonymousIndividual <em>Anonymous Individual</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescription()
 * @model extendedMetaData="name='EntityDescription' kind='elementOnly'"
 * @generated
 */
public interface EntityDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Named Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Entity</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Named Entity</em>' containment reference.
	 * @see #setNamedEntity(NamedEntityDescription)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescription_NamedEntity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='namedEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	NamedEntityDescription getNamedEntity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getNamedEntity <em>Named Entity</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Named Entity</em>' containment reference.
	 * @see #getNamedEntity()
	 * @generated
	 */
	void setNamedEntity(NamedEntityDescription value);

	/**
	 * Returns the value of the '<em><b>Anonymous Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous Entity</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Anonymous Entity</em>' containment reference.
	 * @see #setAnonymousEntity(AnonymousEntityDescription)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescription_AnonymousEntity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anonymousEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	AnonymousEntityDescription getAnonymousEntity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getAnonymousEntity <em>Anonymous Entity</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Anonymous Entity</em>' containment reference.
	 * @see #getAnonymousEntity()
	 * @generated
	 */
	void setAnonymousEntity(AnonymousEntityDescription value);

	/**
	 * Returns the value of the '<em><b>Class Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Description</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Class Description</em>' containment reference.
	 * @see #setClassDescription(ClassDescription)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescription_ClassDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassDescription getClassDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getClassDescription <em>Class Description</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Class Description</em>' containment reference.
	 * @see #getClassDescription()
	 * @generated
	 */
	void setClassDescription(ClassDescription value);

	/**
	 * Returns the value of the '<em><b>Data Type Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type Description</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Data Type Description</em>' containment reference.
	 * @see #setDataTypeDescription(DataTypeDescription)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescription_DataTypeDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataTypeDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	DataTypeDescription getDataTypeDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getDataTypeDescription <em>Data Type Description</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Data Type Description</em>' containment reference.
	 * @see #getDataTypeDescription()
	 * @generated
	 */
	void setDataTypeDescription(DataTypeDescription value);

	/**
	 * Returns the value of the '<em><b>Predicate Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate Description</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Predicate Description</em>' containment reference.
	 * @see #setPredicateDescription(PredicateDescription)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescription_PredicateDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='predicateDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	PredicateDescription getPredicateDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getPredicateDescription <em>Predicate Description</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Predicate Description</em>' containment reference.
	 * @see #getPredicateDescription()
	 * @generated
	 */
	void setPredicateDescription(PredicateDescription value);

	/**
	 * Returns the value of the '<em><b>Object Property Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Property Description</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Object Property Description</em>' containment reference.
	 * @see #setObjectPropertyDescription(ObjectPropertyDescription)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescription_ObjectPropertyDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='objectPropertyDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectPropertyDescription getObjectPropertyDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getObjectPropertyDescription
	 * <em>Object Property Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Object Property Description</em>' containment reference.
	 * @see #getObjectPropertyDescription()
	 * @generated
	 */
	void setObjectPropertyDescription(ObjectPropertyDescription value);

	/**
	 * Returns the value of the '<em><b>Data Property Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Property Description</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Data Property Description</em>' containment reference.
	 * @see #setDataPropertyDescription(DataPropertyDescription)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescription_DataPropertyDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataPropertyDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	DataPropertyDescription getDataPropertyDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getDataPropertyDescription
	 * <em>Data Property Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Data Property Description</em>' containment reference.
	 * @see #getDataPropertyDescription()
	 * @generated
	 */
	void setDataPropertyDescription(DataPropertyDescription value);

	/**
	 * Returns the value of the '<em><b>Annotation Property Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Property Description</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Annotation Property Description</em>' containment reference.
	 * @see #setAnnotationPropertyDescription(AnnotationPropertyDescription)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescription_AnnotationPropertyDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotationPropertyDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	AnnotationPropertyDescription getAnnotationPropertyDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getAnnotationPropertyDescription
	 * <em>Annotation Property Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Annotation Property Description</em>' containment reference.
	 * @see #getAnnotationPropertyDescription()
	 * @generated
	 */
	void setAnnotationPropertyDescription(AnnotationPropertyDescription value);

	/**
	 * Returns the value of the '<em><b>Named Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Individual</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Named Individual</em>' containment reference.
	 * @see #setNamedIndividual(NamedIndividualDescription)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescription_NamedIndividual()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='namedIndividual' namespace='##targetNamespace'"
	 * @generated
	 */
	NamedIndividualDescription getNamedIndividual();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getNamedIndividual <em>Named Individual</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Named Individual</em>' containment reference.
	 * @see #getNamedIndividual()
	 * @generated
	 */
	void setNamedIndividual(NamedIndividualDescription value);

	/**
	 * Returns the value of the '<em><b>Anonymous Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous Individual</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Anonymous Individual</em>' containment reference.
	 * @see #setAnonymousIndividual(AnonymousIndividualDescription)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescription_AnonymousIndividual()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anonymousIndividual' namespace='##targetNamespace'"
	 * @generated
	 */
	AnonymousIndividualDescription getAnonymousIndividual();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescription#getAnonymousIndividual <em>Anonymous Individual</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Anonymous Individual</em>' containment reference.
	 * @see #getAnonymousIndividual()
	 * @generated
	 */
	void setAnonymousIndividual(AnonymousIndividualDescription value);

} // EntityDescription
