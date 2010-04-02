/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ballot Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: BallotResponse stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getContext <em>Context</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getRealmNamespace <em>Realm Namespace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getExistingContent <em>Existing Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getSuggestedReplacement <em>Suggested Replacement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getCommentType <em>Comment Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getImplementedDate <em>Implemented Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getImplementingPersonName <em>Implementing Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getLocation <em>Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getSubmissionId <em>Submission Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotComment()
 * @model extendedMetaData="name='BallotComment' kind='elementOnly'"
 * @generated
 */
public interface BallotComment extends BasicAnnotation {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotComment_Context()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='Context:8'"
	 * @generated
	 */
	FeatureMap getContext();

	/**
	 * Returns the value of the '<em><b>Realm Namespace</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.RealmElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the affiliate or sub-realm associated with the element.  If none is specified, the affiliate associated with the package is assumed.
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realm Namespace</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotComment_RealmNamespace()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='realmNamespace' namespace='##targetNamespace' group='#Context:8'"
	 * @generated
	 */
	EList<RealmElement> getRealmNamespace();

	/**
	 * Returns the value of the '<em><b>Existing Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the current content of concern in the ballot.
	 * UML: tag on BallotComment stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Existing Content</em>' containment reference.
	 * @see #setExistingContent(Flow)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotComment_ExistingContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='existingContent' namespace='##targetNamespace'"
	 * @generated
	 */
	Flow getExistingContent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getExistingContent <em>Existing Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Existing Content</em>' containment reference.
	 * @see #getExistingContent()
	 * @generated
	 */
	void setExistingContent(Flow value);

	/**
	 * Returns the value of the '<em><b>Suggested Replacement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the content that the balloter would prefer to see used in place of the existing content.
	 * UML: tag on BallotComment stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suggested Replacement</em>' containment reference.
	 * @see #setSuggestedReplacement(Flow)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotComment_SuggestedReplacement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='suggestedReplacement' namespace='##targetNamespace'"
	 * @generated
	 */
	Flow getSuggestedReplacement();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getSuggestedReplacement <em>Suggested Replacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suggested Replacement</em>' containment reference.
	 * @see #getSuggestedReplacement()
	 * @generated
	 */
	void setSuggestedReplacement(Flow value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.BallotCommentResolution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what step(s) the ballot group has taken in dealing with the ballot
	 * UML: tag on BallotComment stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotComment_Resolution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resolution' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BallotCommentResolution> getResolution();

	/**
	 * Returns the value of the '<em><b>Comment Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.VoteKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the value of the vote
	 * UML: tag on BallotComment stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VoteKind
	 * @see #isSetCommentType()
	 * @see #unsetCommentType()
	 * @see #setCommentType(VoteKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotComment_CommentType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='commentType'"
	 * @generated
	 */
	VoteKind getCommentType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getCommentType <em>Comment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VoteKind
	 * @see #isSetCommentType()
	 * @see #unsetCommentType()
	 * @see #getCommentType()
	 * @generated
	 */
	void setCommentType(VoteKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getCommentType <em>Comment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCommentType()
	 * @see #getCommentType()
	 * @see #setCommentType(VoteKind)
	 * @generated
	 */
	void unsetCommentType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getCommentType <em>Comment Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Comment Type</em>' attribute is set.
	 * @see #unsetCommentType()
	 * @see #getCommentType()
	 * @see #setCommentType(VoteKind)
	 * @generated
	 */
	boolean isSetCommentType();

	/**
	 * Returns the value of the '<em><b>Implemented Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the date on which the 'accepted' or 'accepted with modification' recommendation was incorporated into the artifact
	 * UML: tag on BallotComment stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implemented Date</em>' attribute.
	 * @see #setImplementedDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotComment_ImplementedDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='implementedDate'"
	 * @generated
	 */
	XMLGregorianCalendar getImplementedDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getImplementedDate <em>Implemented Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implemented Date</em>' attribute.
	 * @see #getImplementedDate()
	 * @generated
	 */
	void setImplementedDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Implementing Person Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the person who made the changed to reflect the 'accepted' or 'accepted with modification' recommendation
	 * UML: tag on BallotComment stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementing Person Name</em>' attribute.
	 * @see #setImplementingPersonName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotComment_ImplementingPersonName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='implementingPersonName'"
	 * @generated
	 */
	String getImplementingPersonName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getImplementingPersonName <em>Implementing Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementing Person Name</em>' attribute.
	 * @see #getImplementingPersonName()
	 * @generated
	 */
	void setImplementingPersonName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the location within the artifact the comment applies.  May be a section reference, a paragraph/sentence count, etc.
	 * UML: tag on BallotComment stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotComment_Location()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='location'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for the comment, within the context of a particular submission.
	 * UML: tag on BallotComment stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotComment_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallNonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	BigInteger getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Submission Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the BallotResponse defined in the BallotInfo of the containing package.
	 * UML: tag on BallotComment stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submission Id</em>' attribute.
	 * @see #setSubmissionId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getBallotComment_SubmissionId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicId" required="true"
	 *        extendedMetaData="kind='attribute' name='submissionId'"
	 * @generated
	 */
	String getSubmissionId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment#getSubmissionId <em>Submission Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submission Id</em>' attribute.
	 * @see #getSubmissionId()
	 * @generated
	 */
	void setSubmissionId(String value);

} // BallotComment
