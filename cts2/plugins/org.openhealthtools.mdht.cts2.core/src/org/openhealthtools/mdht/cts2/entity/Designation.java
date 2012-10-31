/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.entity;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.cts2.core.CaseSignificanceReference;
import org.openhealthtools.mdht.cts2.core.ContextReference;
import org.openhealthtools.mdht.cts2.core.DesignationFidelityReference;
import org.openhealthtools.mdht.cts2.core.DesignationTypeReference;
import org.openhealthtools.mdht.cts2.core.EntryDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Designation</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">Designation</i> is identical to a <a href="//http://www.w3.org/TR/skos-reference/#labels"
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">Lexical Label</a> as defined in <a href="//http://www.w3.org/2004/02/skos/intro"
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">SKOS</a>. It is a "string of
 * (UNICODE) characters ... in a given natural language, such as English or Japanese." "These labels provide the strongest clues as to the meaning of
 * a (SKOS concept)". The CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">2</sub> specification generalizes the label
 * use to include not only SKOS concepts but any class, predicate or individual - collectively referred to as <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">Entity</i>. Note that <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">Designation</i> is
 * intended only for identifiers that are interpreted by human beings.
 * Numeric codes and other machine readable identifiers should be recorded as <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">ScopedEntityName</i>s.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.Designation#getUsageContext <em>Usage Context</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.Designation#getDesignationType <em>Designation Type</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.Designation#getCaseSignificance <em>Case Significance</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.Designation#getDegreeOfFidelity <em>Degree Of Fidelity</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.Designation#getAssertedInCodeSystemVersion <em>Asserted In Code System Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.Designation#getCorrespondingStatement <em>Corresponding Statement</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.Designation#getDesignationRole <em>Designation Role</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.Designation#getExternalIdentifier <em>External Identifier</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDesignation()
 * @model extendedMetaData="name='Designation' kind='elementOnly'"
 * @generated
 */
public interface Designation extends EntryDescription {
	/**
	 * Returns the value of the '<em><b>Usage Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.ContextReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the context(s) in which this designation is applicable
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Usage Context</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDesignation_UsageContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usageContext' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContextReference> getUsageContext();

	/**
	 * Returns the value of the '<em><b>Designation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the type of designation (e.g. abbreviation, eponym, short name, long name, etc.) of the given designation.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Designation Type</em>' containment reference.
	 * @see #setDesignationType(DesignationTypeReference)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDesignation_DesignationType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='designationType' namespace='##targetNamespace'"
	 * @generated
	 */
	DesignationTypeReference getDesignationType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.Designation#getDesignationType <em>Designation Type</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Designation Type</em>' containment reference.
	 * @see #getDesignationType()
	 * @generated
	 */
	void setDesignationType(DesignationTypeReference value);

	/**
	 * Returns the value of the '<em><b>Case Significance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * identifies the significance that case plays in the value of this particular designation.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Case Significance</em>' containment reference.
	 * @see #setCaseSignificance(CaseSignificanceReference)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDesignation_CaseSignificance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='caseSignificance' namespace='##targetNamespace'"
	 * @generated
	 */
	CaseSignificanceReference getCaseSignificance();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.Designation#getCaseSignificance <em>Case Significance</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Case Significance</em>' containment reference.
	 * @see #getCaseSignificance()
	 * @generated
	 */
	void setCaseSignificance(CaseSignificanceReference value);

	/**
	 * Returns the value of the '<em><b>Degree Of Fidelity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a measure of how closely this designation actually matches the intended meaning of the target entity. Typical values might represent "exact",
	 * "approximate", "broader", "narrower",
	 * etc.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Degree Of Fidelity</em>' containment reference.
	 * @see #setDegreeOfFidelity(DesignationFidelityReference)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDesignation_DegreeOfFidelity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='degreeOfFidelity' namespace='##targetNamespace'"
	 * @generated
	 */
	DesignationFidelityReference getDegreeOfFidelity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.Designation#getDegreeOfFidelity <em>Degree Of Fidelity</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Degree Of Fidelity</em>' containment reference.
	 * @see #getDegreeOfFidelity()
	 * @generated
	 */
	void setDegreeOfFidelity(DesignationFidelityReference value);

	/**
	 * Returns the value of the '<em><b>Asserted In Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the code system version that contains the assertion(s) represented in the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">Note</i>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Asserted In Code System Version</em>' attribute.
	 * @see #setAssertedInCodeSystemVersion(String)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDesignation_AssertedInCodeSystemVersion()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.CodeSystemVersionName"
	 *        extendedMetaData="kind='attribute' name='assertedInCodeSystemVersion'"
	 * @generated
	 */
	String getAssertedInCodeSystemVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.Designation#getAssertedInCodeSystemVersion
	 * <em>Asserted In Code System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Asserted In Code System Version</em>' attribute.
	 * @see #getAssertedInCodeSystemVersion()
	 * @generated
	 */
	void setAssertedInCodeSystemVersion(String value);

	/**
	 * Returns the value of the '<em><b>Corresponding Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a URI that, when de-referenced, provides the equivalent <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">Statement</i> that forms this
	 * designation. This is only present when the <b xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">Statement</b> profile is supported by the
	 * implementing
	 * service.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Corresponding Statement</em>' attribute.
	 * @see #setCorrespondingStatement(String)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDesignation_CorrespondingStatement()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.RenderingURI"
	 *        extendedMetaData="kind='attribute' name='correspondingStatement'"
	 * @generated
	 */
	String getCorrespondingStatement();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.Designation#getCorrespondingStatement <em>Corresponding Statement</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Corresponding Statement</em>' attribute.
	 * @see #getCorrespondingStatement()
	 * @generated
	 */
	void setCorrespondingStatement(String value);

	/**
	 * Returns the value of the '<em><b>Designation Role</b></em>' attribute.
	 * The default value is <code>"ALTERNATIVE"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.entity.DesignationRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an indicator that determines the particular role that this designation plays
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Designation Role</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.entity.DesignationRole
	 * @see #isSetDesignationRole()
	 * @see #unsetDesignationRole()
	 * @see #setDesignationRole(DesignationRole)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDesignation_DesignationRole()
	 * @model default="ALTERNATIVE" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='designationRole'"
	 * @generated
	 */
	DesignationRole getDesignationRole();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.Designation#getDesignationRole <em>Designation Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Designation Role</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.entity.DesignationRole
	 * @see #isSetDesignationRole()
	 * @see #unsetDesignationRole()
	 * @see #getDesignationRole()
	 * @generated
	 */
	void setDesignationRole(DesignationRole value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.entity.Designation#getDesignationRole <em>Designation Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetDesignationRole()
	 * @see #getDesignationRole()
	 * @see #setDesignationRole(DesignationRole)
	 * @generated
	 */
	void unsetDesignationRole();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.entity.Designation#getDesignationRole <em>Designation Role</em>}'
	 * attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Designation Role</em>' attribute is set.
	 * @see #unsetDesignationRole()
	 * @see #getDesignationRole()
	 * @see #setDesignationRole(DesignationRole)
	 * @generated
	 */
	boolean isSetDesignationRole();

	/**
	 * Returns the value of the '<em><b>External Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an identifier that is assigned to this designation / entity pair by the authoring body. As an example this would carry the SCTID for SNOMED-CT
	 * concepts.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>External Identifier</em>' attribute.
	 * @see #setExternalIdentifier(String)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDesignation_ExternalIdentifier()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.String"
	 *        extendedMetaData="kind='attribute' name='externalIdentifier'"
	 * @generated
	 */
	String getExternalIdentifier();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.Designation#getExternalIdentifier <em>External Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>External Identifier</em>' attribute.
	 * @see #getExternalIdentifier()
	 * @generated
	 */
	void setExternalIdentifier(String value);

} // Designation
