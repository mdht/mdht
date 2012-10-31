/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Description</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * The detailed description of what happened to a changeable resource. <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ChangeDescription</i> will
 * only be present in service profiles that support either the <b xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">History</b> or <b
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">MAINTENANCE </b>profiles.
 * 
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getPrevImage <em>Prev Image</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getChangeNotes <em>Change Notes</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getChangeSource <em>Change Source</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getClonedResource <em>Cloned Resource</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getChangeDate <em>Change Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getChangeType <em>Change Type</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getCommitted <em>Committed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getContainingChangeSet <em>Containing Change Set</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getEffectiveDate <em>Effective Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getPrevChangeSet <em>Prev Change Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeDescription()
 * @model extendedMetaData="name='ChangeDescription' kind='elementOnly'"
 * @generated
 */
public interface ChangeDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Prev Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev Image</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Prev Image</em>' containment reference.
	 * @see #setPrevImage(Changeable)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeDescription_PrevImage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prevImage' namespace='##targetNamespace'"
	 * @generated
	 */
	Changeable getPrevImage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getPrevImage <em>Prev Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Prev Image</em>' containment reference.
	 * @see #getPrevImage()
	 * @generated
	 */
	void setPrevImage(Changeable value);

	/**
	 * Returns the value of the '<em><b>Change Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a note, set of instructions and other information about the nature and purpose of this change
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Change Notes</em>' containment reference.
	 * @see #setChangeNotes(OpaqueData)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeDescription_ChangeNotes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='changeNotes' namespace='##targetNamespace'"
	 * @generated
	 */
	OpaqueData getChangeNotes();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getChangeNotes <em>Change Notes</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Change Notes</em>' containment reference.
	 * @see #getChangeNotes()
	 * @generated
	 */
	void setChangeNotes(OpaqueData value);

	/**
	 * Returns the value of the '<em><b>Change Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the person or organization responsible for this change
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Change Source</em>' containment reference.
	 * @see #setChangeSource(SourceReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeDescription_ChangeSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='changeSource' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceReference getChangeSource();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getChangeSource <em>Change Source</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Change Source</em>' containment reference.
	 * @see #getChangeSource()
	 * @generated
	 */
	void setChangeSource(SourceReference value);

	/**
	 * Returns the value of the '<em><b>Cloned Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the local identifier and URI of the resource that was cloned in this change if this is a <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">CLONE</i> operation.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Cloned Resource</em>' containment reference.
	 * @see #setClonedResource(NameAndMeaningReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeDescription_ClonedResource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='clonedResource' namespace='##targetNamespace'"
	 * @generated
	 */
	NameAndMeaningReference getClonedResource();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getClonedResource <em>Cloned Resource</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Cloned Resource</em>' containment reference.
	 * @see #getClonedResource()
	 * @generated
	 */
	void setClonedResource(NameAndMeaningReference value);

	/**
	 * Returns the value of the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the date and time when this change was applied to the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">local service instance</i>. <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">changeDate</i> is only present on committed changes.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Change Date</em>' attribute.
	 * @see #setChangeDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeDescription_ChangeDate()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.DateAndTime" required="true"
	 *        extendedMetaData="kind='attribute' name='changeDate'"
	 * @generated
	 */
	XMLGregorianCalendar getChangeDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getChangeDate <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Change Date</em>' attribute.
	 * @see #getChangeDate()
	 * @generated
	 */
	void setChangeDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Change Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.core.ChangeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the type of change that occurred to cause the associated <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Changeable</i> element to reach
	 * the state it is in
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Change Type</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeType
	 * @see #isSetChangeType()
	 * @see #unsetChangeType()
	 * @see #setChangeType(ChangeType)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeDescription_ChangeType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='changeType'"
	 * @generated
	 */
	ChangeType getChangeType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getChangeType <em>Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Change Type</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeType
	 * @see #isSetChangeType()
	 * @see #unsetChangeType()
	 * @see #getChangeType()
	 * @generated
	 */
	void setChangeType(ChangeType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getChangeType <em>Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetChangeType()
	 * @see #getChangeType()
	 * @see #setChangeType(ChangeType)
	 * @generated
	 */
	void unsetChangeType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getChangeType <em>Change Type</em>}' attribute is
	 * set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Change Type</em>' attribute is set.
	 * @see #unsetChangeType()
	 * @see #getChangeType()
	 * @see #setChangeType(ChangeType)
	 * @generated
	 */
	boolean isSetChangeType();

	/**
	 * Returns the value of the '<em><b>Committed</b></em>' attribute.
	 * The default value is <code>"COMMITTED"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.core.ChangeCommitted}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an indicator that states whether the change has been committed and is available to service consumers or is still pending while further
	 * authoring may occur. <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">committed</i> must always be <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">COMMITTED</i>
	 * in services that do not support the <b xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">MAINTENANCE</b> profile
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Committed</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeCommitted
	 * @see #isSetCommitted()
	 * @see #unsetCommitted()
	 * @see #setCommitted(ChangeCommitted)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeDescription_Committed()
	 * @model default="COMMITTED" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='committed'"
	 * @generated
	 */
	ChangeCommitted getCommitted();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getCommitted <em>Committed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Committed</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeCommitted
	 * @see #isSetCommitted()
	 * @see #unsetCommitted()
	 * @see #getCommitted()
	 * @generated
	 */
	void setCommitted(ChangeCommitted value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getCommitted <em>Committed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetCommitted()
	 * @see #getCommitted()
	 * @see #setCommitted(ChangeCommitted)
	 * @generated
	 */
	void unsetCommitted();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getCommitted <em>Committed</em>}' attribute is
	 * set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Committed</em>' attribute is set.
	 * @see #unsetCommitted()
	 * @see #getCommitted()
	 * @see #setCommitted(ChangeCommitted)
	 * @generated
	 */
	boolean isSetCommitted();

	/**
	 * Returns the value of the '<em><b>Containing Change Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the URI of the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ChangeSet</i> that contains the described change
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Containing Change Set</em>' attribute.
	 * @see #setContainingChangeSet(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeDescription_ContainingChangeSet()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.ChangeSetURI" required="true"
	 *        extendedMetaData="kind='attribute' name='containingChangeSet'"
	 * @generated
	 */
	String getContainingChangeSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getContainingChangeSet <em>Containing Change Set</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Containing Change Set</em>' attribute.
	 * @see #getContainingChangeSet()
	 * @generated
	 */
	void setContainingChangeSet(String value);

	/**
	 * Returns the value of the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the date and time that this change is (or was) scheduled to take effect in the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">local
	 * service instance</i>. Typically this attribute is used to schedule a component to become active on a given date.A
	 * change having a future <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">effectiveDate</i> will not be visible to service calls whose
	 * reference time is earlier to this time. This attribute may only be present in committed changes. A compliant CTS<sub
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub> service
	 * implementation MUST not allow a change to be written with a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">effectiveDate</i> that is
	 * earlier than <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">changeDate</i>. The purpose of this requirement is to prevent the
	 * "rewriting of history" - making a change
	 * effective in the past.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Effective Date</em>' attribute.
	 * @see #setEffectiveDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeDescription_EffectiveDate()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.DateAndTime"
	 *        extendedMetaData="kind='attribute' name='effectiveDate'"
	 * @generated
	 */
	XMLGregorianCalendar getEffectiveDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getEffectiveDate <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Effective Date</em>' attribute.
	 * @see #getEffectiveDate()
	 * @generated
	 */
	void setEffectiveDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Prev Change Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the URI of the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ChangeSet</i> that contains the change that immediately preceded this
	 * change, if any
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Prev Change Set</em>' attribute.
	 * @see #setPrevChangeSet(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getChangeDescription_PrevChangeSet()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.ChangeSetURI"
	 *        extendedMetaData="kind='attribute' name='prevChangeSet'"
	 * @generated
	 */
	String getPrevChangeSet();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription#getPrevChangeSet <em>Prev Change Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Prev Change Set</em>' attribute.
	 * @see #getPrevChangeSet()
	 * @generated
	 */
	void setPrevChangeSet(String value);

} // ChangeDescription
