/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Vote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the information needed to record a group vote
 * UML: part of complex tag object
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupVote#getAbstain <em>Abstain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupVote#getInFavour <em>In Favour</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupVote#getMotionBy <em>Motion By</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupVote#getOpposed <em>Opposed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupVote#getSecondedBy <em>Seconded By</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGroupVote()
 * @model extendedMetaData="name='GroupVote' kind='empty'"
 * @generated
 */
public interface GroupVote extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of those present who abstained from the vote
	 * UML: used by a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstain</em>' attribute.
	 * @see #setAbstain(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGroupVote_Abstain()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallNonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='abstain'"
	 * @generated
	 */
	BigInteger getAbstain();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupVote#getAbstain <em>Abstain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstain</em>' attribute.
	 * @see #getAbstain()
	 * @generated
	 */
	void setAbstain(BigInteger value);

	/**
	 * Returns the value of the '<em><b>In Favour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of those present who voted in favour of the motion
	 * UML: used by a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Favour</em>' attribute.
	 * @see #setInFavour(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGroupVote_InFavour()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallNonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='inFavour'"
	 * @generated
	 */
	BigInteger getInFavour();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupVote#getInFavour <em>In Favour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Favour</em>' attribute.
	 * @see #getInFavour()
	 * @generated
	 */
	void setInFavour(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Motion By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the person who made the motion being voted
	 * UML: used by a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Motion By</em>' attribute.
	 * @see #setMotionBy(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGroupVote_MotionBy()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName" required="true"
	 *        extendedMetaData="kind='attribute' name='motionBy'"
	 * @generated
	 */
	String getMotionBy();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupVote#getMotionBy <em>Motion By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motion By</em>' attribute.
	 * @see #getMotionBy()
	 * @generated
	 */
	void setMotionBy(String value);

	/**
	 * Returns the value of the '<em><b>Opposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of those present who voted against the motion
	 * UML: used by a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opposed</em>' attribute.
	 * @see #setOpposed(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGroupVote_Opposed()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallNonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='opposed'"
	 * @generated
	 */
	BigInteger getOpposed();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupVote#getOpposed <em>Opposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposed</em>' attribute.
	 * @see #getOpposed()
	 * @generated
	 */
	void setOpposed(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Seconded By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the person who seconded the motion being voted
	 * UML: used by a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seconded By</em>' attribute.
	 * @see #setSecondedBy(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getGroupVote_SecondedBy()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName" required="true"
	 *        extendedMetaData="kind='attribute' name='secondedBy'"
	 * @generated
	 */
	String getSecondedBy();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupVote#getSecondedBy <em>Seconded By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconded By</em>' attribute.
	 * @see #getSecondedBy()
	 * @generated
	 */
	void setSecondedBy(String value);

} // GroupVote
