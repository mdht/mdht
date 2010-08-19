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
 * A representation of the model object '<em><b>App Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains complex comments relating to a model element.  (Complex comments are those with additional XML elements, above and beyond the 'type' of comment.)
 * UML: A collector for 'complex' commments associated with a model element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AppInfo#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AppInfo#getFormalConstraint <em>Formal Constraint</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AppInfo#getOpenIssue <em>Open Issue</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AppInfo#getStaticExample <em>Static Example</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AppInfo#getBallotComment <em>Ballot Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AppInfo#getChangeRequest <em>Change Request</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AppInfo#getDeprecationInfo <em>Deprecation Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAppInfo()
 * @model extendedMetaData="name='AppInfo' kind='elementOnly'"
 * @generated
 */
public interface AppInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.Mapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to an external or internal artifact that has a degree of similarity or equivalence with the current item.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAppInfo_Mapping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mapping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Mapping> getMapping();

	/**
	 * Returns the value of the '<em><b>Formal Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.FormalConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal, testable limitation on the use, representation or value associated with the current element.  The expression must be able to be evaluated within the context of a single instance.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formal Constraint</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAppInfo_FormalConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='formalConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FormalConstraint> getFormalConstraint();

	/**
	 * Returns the value of the '<em><b>Open Issue</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.OpenIssue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notes to designers, balloters and implementers about outstanding concerns that remain to be resolved.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Open Issue</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAppInfo_OpenIssue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='openIssue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OpenIssue> getOpenIssue();

	/**
	 * Returns the value of the '<em><b>Static Example</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.StaticExample}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An example instance expressed in a particular ITS.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Example</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAppInfo_StaticExample()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='staticExample' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StaticExample> getStaticExample();

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAppInfo_BallotComment()
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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAppInfo_ChangeRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='changeRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ChangeRequest> getChangeRequest();

	/**
	 * Returns the value of the '<em><b>Deprecation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information relating to the deprecation of the element, including instructions on why the element is no longer required and/or how the same information should now be handled.
	 * UML: Descendant Stereotype from Annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deprecation Info</em>' containment reference.
	 * @see #setDeprecationInfo(DeprecationInfo)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAppInfo_DeprecationInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deprecationInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	DeprecationInfo getDeprecationInfo();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AppInfo#getDeprecationInfo <em>Deprecation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecation Info</em>' containment reference.
	 * @see #getDeprecationInfo()
	 * @generated
	 */
	void setDeprecationInfo(DeprecationInfo value);

} // AppInfo
