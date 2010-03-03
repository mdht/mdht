/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.term.core.profile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Context Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetContextBinding#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetContextBinding#getConceptDomain <em>Concept Domain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetContextBinding#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetContextBinding#getUsageContext <em>Usage Context</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetContextBinding#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetContextBinding()
 * @model
 * @generated
 */
public interface ValueSetContextBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Date</em>' attribute.
	 * @see #setEffectiveDate(String)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetContextBinding_EffectiveDate()
	 * @model ordered="false"
	 * @generated
	 */
	String getEffectiveDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetContextBinding#getEffectiveDate <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date</em>' attribute.
	 * @see #getEffectiveDate()
	 * @generated
	 */
	void setEffectiveDate(String value);

	/**
	 * Returns the value of the '<em><b>Concept Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Domain</em>' reference.
	 * @see #setConceptDomain(ConceptDomain)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetContextBinding_ConceptDomain()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConceptDomain getConceptDomain();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetContextBinding#getConceptDomain <em>Concept Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Domain</em>' reference.
	 * @see #getConceptDomain()
	 * @generated
	 */
	void setConceptDomain(ConceptDomain value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set</em>' reference.
	 * @see #setValueSet(ValueSetVersion)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetContextBinding_ValueSet()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ValueSetVersion getValueSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetContextBinding#getValueSet <em>Value Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(ValueSetVersion value);

	/**
	 * Returns the value of the '<em><b>Usage Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Context</em>' reference.
	 * @see #setUsageContext(UsageContext)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetContextBinding_UsageContext()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UsageContext getUsageContext();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetContextBinding#getUsageContext <em>Usage Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Context</em>' reference.
	 * @see #getUsageContext()
	 * @generated
	 */
	void setUsageContext(UsageContext value);

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see org.openhealthtools.mdht.uml.term.core.profile.TermPackage#getValueSetContextBinding_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.term.core.profile.ValueSetContextBinding#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // ValueSetContextBinding
