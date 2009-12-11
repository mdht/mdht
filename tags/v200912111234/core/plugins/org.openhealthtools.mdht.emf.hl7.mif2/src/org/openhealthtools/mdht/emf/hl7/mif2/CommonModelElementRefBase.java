/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Model Element Ref Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to a CMET (possibly binding CMET parameters)
 * UML: SubSystem referencing a particular CommonModelElement Interface
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementRefBase#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementRefBase#getCmetName <em>Cmet Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementRefBase#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCommonModelElementRefBase()
 * @model extendedMetaData="name='CommonModelElementRefBase' kind='elementOnly'"
 * @generated
 */
public interface CommonModelElementRefBase extends ClassifierBase {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the containing element.
	 * UML: A collector for the comments and constraints associated with a class.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(ClassAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCommonModelElementRefBase_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementRefBase#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(ClassAnnotations value);

	/**
	 * Returns the value of the '<em><b>Cmet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the CMET reference.
	 * UML: Inherited from ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cmet Name</em>' attribute.
	 * @see #setCmetName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCommonModelElementRefBase_CmetName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.PrefixedUpperCamelCase" required="true"
	 *        extendedMetaData="kind='attribute' name='cmetName'"
	 * @generated
	 */
	String getCmetName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementRefBase#getCmetName <em>Cmet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmet Name</em>' attribute.
	 * @see #getCmetName()
	 * @generated
	 */
	void setCmetName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique name for this cmet reference within the model.  (This is usually the same as the CMET name.  However, where a CMET has exit points and different occurrences have different bindings, each separately bound occurrence must have its own name.  In this case, a suffix will be added to the base referenced CMET name.
	 * UML: Inherited from ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCommonModelElementRefBase_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.PrefixedUpperCamelCase"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementRefBase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CommonModelElementRefBase
