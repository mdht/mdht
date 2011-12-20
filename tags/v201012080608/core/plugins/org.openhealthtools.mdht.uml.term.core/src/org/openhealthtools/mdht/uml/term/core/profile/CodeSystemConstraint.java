/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.term.core.profile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code System Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint#getReference <em>Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCodeSystemConstraint()
 * @model
 * @generated
 */
public interface CodeSystemConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(CodeSystemVersion)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCodeSystemConstraint_Reference()
	 * @model ordered="false"
	 * @generated
	 */
	CodeSystemVersion getReference();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(CodeSystemVersion value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCodeSystemConstraint_Identifier()
	 * @model ordered="false"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCodeSystemConstraint_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCodeSystemConstraint_Version()
	 * @model ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.term.core.profile.BindingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.term.core.profile.BindingKind
	 * @see #setBinding(BindingKind)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCodeSystemConstraint_Binding()
	 * @model ordered="false"
	 * @generated
	 */
	BindingKind getBinding();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint#getBinding <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.term.core.profile.BindingKind
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(BindingKind value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCodeSystemConstraint_Code()
	 * @model ordered="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCodeSystemConstraint_DisplayName()
	 * @model ordered="false"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.term.core.profile.CR}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference list.
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCodeSystemConstraint_Qualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CR> getQualifier();

	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getCodeSystemConstraint_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // CodeSystemConstraint