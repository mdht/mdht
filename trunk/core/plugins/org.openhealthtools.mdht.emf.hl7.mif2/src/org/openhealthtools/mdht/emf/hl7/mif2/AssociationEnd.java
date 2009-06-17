/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Corresponds to AssociationEnd
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEnd#getParticipantClassName <em>Participant Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEnd()
 * @model extendedMetaData="name='AssociationEnd' kind='elementOnly'"
 * @generated
 */
public interface AssociationEnd extends AssociationEndBase {
	/**
	 * Returns the value of the '<em><b>Participant Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the class to which the association end is attached
	 * UML: The name of the participant class for the association end
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Class Name</em>' attribute.
	 * @see #setParticipantClassName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAssociationEnd_ParticipantClassName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.AllClassName" required="true"
	 *        extendedMetaData="kind='attribute' name='participantClassName'"
	 * @generated
	 */
	String getParticipantClassName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEnd#getParticipantClassName <em>Participant Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Class Name</em>' attribute.
	 * @see #getParticipantClassName()
	 * @generated
	 */
	void setParticipantClassName(String value);

} // AssociationEnd
