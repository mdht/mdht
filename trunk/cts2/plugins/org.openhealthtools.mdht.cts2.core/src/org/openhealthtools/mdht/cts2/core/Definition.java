/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * Text or other representation that is intended to communicate the intended meaning of the associated entity to a human being. While this is intended
 * to be very close in meaning to <a href="//http://www.w3.org/TR/skos-reference/#definition"
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">skos:definition</a>, its intent is slightly different in that the CTS<sub
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub> specification does not treat <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">definition</i> as a subproperty of <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">note</i> -
 * rather it views comments, examples and definitions as separate entities.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Definition#getUsageContext <em>Usage Context</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.Definition#getDefinitionRole <em>Definition Role</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getDefinition()
 * @model extendedMetaData="name='Definition' kind='elementOnly'"
 * @generated
 */
public interface Definition extends Note {
	/**
	 * Returns the value of the '<em><b>Usage Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the context(s) in which the definition is considered applicable
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Usage Context</em>' containment reference.
	 * @see #setUsageContext(ContextReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getDefinition_UsageContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usageContext' namespace='##targetNamespace'"
	 * @generated
	 */
	ContextReference getUsageContext();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Definition#getUsageContext <em>Usage Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Usage Context</em>' containment reference.
	 * @see #getUsageContext()
	 * @generated
	 */
	void setUsageContext(ContextReference value);

	/**
	 * Returns the value of the '<em><b>Definition Role</b></em>' attribute.
	 * The default value is <code>"NORMATIVE"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.core.DefinitionRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the role that the definition plays with respect to the defined entity
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Definition Role</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.DefinitionRole
	 * @see #isSetDefinitionRole()
	 * @see #unsetDefinitionRole()
	 * @see #setDefinitionRole(DefinitionRole)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getDefinition_DefinitionRole()
	 * @model default="NORMATIVE" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='definitionRole'"
	 * @generated
	 */
	DefinitionRole getDefinitionRole();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.Definition#getDefinitionRole <em>Definition Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Definition Role</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.DefinitionRole
	 * @see #isSetDefinitionRole()
	 * @see #unsetDefinitionRole()
	 * @see #getDefinitionRole()
	 * @generated
	 */
	void setDefinitionRole(DefinitionRole value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.core.Definition#getDefinitionRole <em>Definition Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetDefinitionRole()
	 * @see #getDefinitionRole()
	 * @see #setDefinitionRole(DefinitionRole)
	 * @generated
	 */
	void unsetDefinitionRole();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.core.Definition#getDefinitionRole <em>Definition Role</em>}' attribute
	 * is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Definition Role</em>' attribute is set.
	 * @see #unsetDefinitionRole()
	 * @see #getDefinitionRole()
	 * @see #setDefinitionRole(DefinitionRole)
	 * @generated
	 */
	boolean isSetDefinitionRole();

} // Definition
