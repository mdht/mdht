/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description In Code System</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A reference to specific version of a code system that contains assertions about a given entity, including the namespace and name by which the
 * entity is referenced, an optional designation appropriate to the
 * given usage context and an optional <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">RenderingURI</i> that references the full <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">EntityDescription</i> contained in the specific code system version.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem#getDescribingCodeSystemVersion <em>Describing Code System Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem#getDesignation <em>Designation</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem#getHref <em>Href</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getDescriptionInCodeSystem()
 * @model extendedMetaData="name='DescriptionInCodeSystem' kind='elementOnly'"
 * @generated
 */
public interface DescriptionInCodeSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Describing Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to the code system version that describes the entity
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Describing Code System Version</em>' containment reference.
	 * @see #setDescribingCodeSystemVersion(CodeSystemVersionReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getDescriptionInCodeSystem_DescribingCodeSystemVersion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='describingCodeSystemVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionReference getDescribingCodeSystemVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem#getDescribingCodeSystemVersion
	 * <em>Describing Code System Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Describing Code System Version</em>' containment reference.
	 * @see #getDescribingCodeSystemVersion()
	 * @generated
	 */
	void setDescribingCodeSystemVersion(CodeSystemVersionReference value);

	/**
	 * Returns the value of the '<em><b>Designation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a contextually appropriate designation for the entity derived from the \\ <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">describingCodeSystemVersion</i>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Designation</em>' attribute.
	 * @see #setDesignation(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getDescriptionInCodeSystem_Designation()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.String"
	 *        extendedMetaData="kind='element' name='designation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDesignation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem#getDesignation <em>Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Designation</em>' attribute.
	 * @see #getDesignation()
	 * @generated
	 */
	void setDesignation(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">RenderingURI</i> that, if followed, will provide a full CTS<sub
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub>
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">EntityDescription</i> derived from the corresponding code system version
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getDescriptionInCodeSystem_Href()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.RenderingURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

} // DescriptionInCodeSystem
