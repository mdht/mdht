/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.w3c.xhtml.Inline;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ballot Comment Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the information needed when recording ballot comment resolutions
 * UML: part of complex tag object
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotCommentResolution#getResolutionComments <em>Resolution Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotCommentResolution#getVote <em>Vote</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotCommentResolution#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotCommentResolution#getResolutionDate <em>Resolution Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotCommentResolution()
 * @model extendedMetaData="name='BallotCommentResolution' kind='elementOnly'"
 * @generated
 */
public interface BallotCommentResolution extends EObject {
	/**
	 * Returns the value of the '<em><b>Resolution Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments created by the group reviewing the ballot comment
	 * UML: part of complex tag object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution Comments</em>' containment reference.
	 * @see #setResolutionComments(Inline)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotCommentResolution_ResolutionComments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resolutionComments' namespace='##targetNamespace'"
	 * @generated
	 */
	Inline getResolutionComments();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotCommentResolution#getResolutionComments <em>Resolution Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Comments</em>' containment reference.
	 * @see #getResolutionComments()
	 * @generated
	 */
	void setResolutionComments(Inline value);

	/**
	 * Returns the value of the '<em><b>Vote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the vote results of the resolution
	 * UML: part of complex tag object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vote</em>' containment reference.
	 * @see #setVote(GroupVote)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotCommentResolution_Vote()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vote' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupVote getVote();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotCommentResolution#getVote <em>Vote</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vote</em>' containment reference.
	 * @see #getVote()
	 * @generated
	 */
	void setVote(GroupVote value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the decision the ballot group has come to in evaluating a ballot comment
	 * UML: part of complex tag object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(Enumerator)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotCommentResolution_Resolution()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.VoteResolutionKind"
	 *        extendedMetaData="kind='attribute' name='resolution'"
	 * @generated
	 */
	Enumerator getResolution();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotCommentResolution#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(Enumerator value);

	/**
	 * Returns the value of the '<em><b>Resolution Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the decision the ballot group has come to in evaluating a ballot comment
	 * UML: part of complex tag object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution Date</em>' attribute.
	 * @see #setResolutionDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotCommentResolution_ResolutionDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='resolutionDate'"
	 * @generated
	 */
	XMLGregorianCalendar getResolutionDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotCommentResolution#getResolutionDate <em>Resolution Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Date</em>' attribute.
	 * @see #getResolutionDate()
	 * @generated
	 */
	void setResolutionDate(XMLGregorianCalendar value);

} // BallotCommentResolution
