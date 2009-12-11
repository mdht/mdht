/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publication App Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains complex comments relating to a publication.  (Complex comments are those with additional XML elements, above and beyond the 'type' of comment.)
 * UML: A collector for 'complex' commments associated with a model element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationAppInfo#getBallotComment <em>Ballot Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationAppInfo#getChangeRequest <em>Change Request</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPublicationAppInfo()
 * @model extendedMetaData="name='PublicationAppInfo' kind='elementOnly'"
 * @generated
 */
public interface PublicationAppInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Ballot Comment</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detailed comments on a particular aspect of the ballot.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ballot Comment</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPublicationAppInfo_BallotComment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ballotComment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BallotComment> getBallotComment();

	/**
	 * Returns the value of the '<em><b>Change Request</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of a request to change the element.  This is an implementation-focused annotation enabling the association of change requests directly to elements within a specification.  Its purpose is to *support* existing change management processes and is not intended to provide full change management documentation, merely the ability to tag certain information related to a change request to the relevant parts of the specification driving the change.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Change Request</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPublicationAppInfo_ChangeRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='changeRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ChangeRequest> getChangeRequest();

} // PublicationAppInfo
