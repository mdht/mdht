/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legalese</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This element defines the legal aspects associated with the containing element and it's descendants.
 * UML: Part of a complex tag value
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Legalese#getNotation <em>Notation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Legalese#getDisclaimer <em>Disclaimer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Legalese#getLicenseTerms <em>License Terms</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Legalese#getVersioningPolicy <em>Versioning Policy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Legalese#getCopyrightOwner <em>Copyright Owner</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Legalese#getCopyrightYears <em>Copyright Years</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getLegalese()
 * @model extendedMetaData="name='Legalese' kind='elementOnly'"
 * @generated
 */
public interface Legalese extends EObject {
	/**
	 * Returns the value of the '<em><b>Notation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional details about the copyright assertion.  E.g. "All rights reserved"
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notation</em>' containment reference.
	 * @see #setNotation(Flow)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getLegalese_Notation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notation' namespace='##targetNamespace'"
	 * @generated
	 */
	Flow getNotation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Legalese#getNotation <em>Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation</em>' containment reference.
	 * @see #getNotation()
	 * @generated
	 */
	void setNotation(Flow value);

	/**
	 * Returns the value of the '<em><b>Disclaimer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides any legal disclaimers associated with the use of the information in the content.
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disclaimer</em>' containment reference.
	 * @see #setDisclaimer(Flow)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getLegalese_Disclaimer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disclaimer' namespace='##targetNamespace'"
	 * @generated
	 */
	Flow getDisclaimer();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Legalese#getDisclaimer <em>Disclaimer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disclaimer</em>' containment reference.
	 * @see #getDisclaimer()
	 * @generated
	 */
	void setDisclaimer(Flow value);

	/**
	 * Returns the value of the '<em><b>License Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates any limitations on licensing, including requirement for payment, right to redistribute, etc.  May make reference to standardized licenses
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>License Terms</em>' containment reference.
	 * @see #setLicenseTerms(Flow)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getLegalese_LicenseTerms()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='licenseTerms' namespace='##targetNamespace'"
	 * @generated
	 */
	Flow getLicenseTerms();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Legalese#getLicenseTerms <em>License Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License Terms</em>' containment reference.
	 * @see #getLicenseTerms()
	 * @generated
	 */
	void setLicenseTerms(Flow value);

	/**
	 * Returns the value of the '<em><b>Versioning Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the policy for the release of new versions, including frequency of release, notification mechanism, mechanism for proposing changes, etc.
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versioning Policy</em>' containment reference.
	 * @see #setVersioningPolicy(Flow)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getLegalese_VersioningPolicy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versioningPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	Flow getVersioningPolicy();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Legalese#getVersioningPolicy <em>Versioning Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versioning Policy</em>' containment reference.
	 * @see #getVersioningPolicy()
	 * @generated
	 */
	void setVersioningPolicy(Flow value);

	/**
	 * Returns the value of the '<em><b>Copyright Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the individual or organization asserting copyright.
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright Owner</em>' attribute.
	 * @see #setCopyrightOwner(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getLegalese_CopyrightOwner()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='copyrightOwner'"
	 * @generated
	 */
	String getCopyrightOwner();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Legalese#getCopyrightOwner <em>Copyright Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Owner</em>' attribute.
	 * @see #getCopyrightOwner()
	 * @generated
	 */
	void setCopyrightOwner(String value);

	/**
	 * Returns the value of the '<em><b>Copyright Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The year (or years) in which copyright is asserted.
	 * UML: Part of a complex tag value
	 * DublinCore: DateCopyrighted
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright Years</em>' attribute.
	 * @see #setCopyrightYears(List)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getLegalese_CopyrightYears()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Years" many="false"
	 *        extendedMetaData="kind='attribute' name='copyrightYears'"
	 * @generated
	 */
	List<BigInteger> getCopyrightYears();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Legalese#getCopyrightYears <em>Copyright Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Years</em>' attribute.
	 * @see #getCopyrightYears()
	 * @generated
	 */
	void setCopyrightYears(List<BigInteger> value);

} // Legalese
