/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source And Role Reference</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * a reference to a source that also includes the role that the source played and/or fixes the particular chapter, page or other element within the
 * reference
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.SourceAndRoleReference#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.SourceAndRoleReference#getSource <em>Source</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.SourceAndRoleReference#getRole <em>Role</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.SourceAndRoleReference#getBibliographicLink <em>Bibliographic Link</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getSourceAndRoleReference()
 * @model extendedMetaData="name='SourceAndRoleReference' kind='mixed'"
 * @generated
 */
public interface SourceAndRoleReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getSourceAndRoleReference_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(SourceReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getSourceAndRoleReference_Source()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceReference getSource();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.SourceAndRoleReference#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceReference value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a role that the source played in the creation of the containing resource
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(RoleReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getSourceAndRoleReference_Role()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleReference getRole();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.SourceAndRoleReference#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(RoleReference value);

	/**
	 * Returns the value of the '<em><b>Bibliographic Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * additional bibliographic information such as page number, edition, etc.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Bibliographic Link</em>' containment reference.
	 * @see #setBibliographicLink(OpaqueData)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getSourceAndRoleReference_BibliographicLink()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliographicLink' namespace='##targetNamespace'"
	 * @generated
	 */
	OpaqueData getBibliographicLink();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.SourceAndRoleReference#getBibliographicLink <em>Bibliographic Link</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Bibliographic Link</em>' containment reference.
	 * @see #getBibliographicLink()
	 * @generated
	 */
	void setBibliographicLink(OpaqueData value);

} // SourceAndRoleReference
