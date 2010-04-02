/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code System Version Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies a specific published version of a code system or code system supplement
 * UML: A stereotype on Enumeration
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase#getPublicTerminologyServer <em>Public Terminology Server</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase#getSupportedLanguage <em>Supported Language</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase#isHl7ApprovedIndicator <em>Hl7 Approved Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase#isHl7MaintainedIndicator <em>Hl7 Maintained Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase#getPublisherVersionId <em>Publisher Version Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase#getReleaseDate <em>Release Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersionBase()
 * @model abstract="true"
 *        extendedMetaData="name='CodeSystemVersionBase' kind='elementOnly'"
 * @generated
 */
public interface CodeSystemVersionBase extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the code system version.
	 * UML: A collector for the comments and constraints associated with a code system version.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(CodeSystemVersionAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersionBase_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(CodeSystemVersionAnnotations value);

	/**
	 * Returns the value of the '<em><b>Public Terminology Server</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.TerminologyServer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to an external server able to access the contents of this code system.
	 * UML: Tag on CodeSystem stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Terminology Server</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersionBase_PublicTerminologyServer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publicTerminologyServer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TerminologyServer> getPublicTerminologyServer();

	/**
	 * Returns the value of the '<em><b>Supported Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates one of the languages supported by the specified value-set (a language for which print names for all included concepts is available.)
	 * Derived: Find the codes referenced that all have printNames for a given language.
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Language</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersionBase_SupportedLanguage()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Language"
	 *        extendedMetaData="kind='element' name='supportedLanguage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getSupportedLanguage();

	/**
	 * Returns the value of the '<em><b>Hl7 Approved Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the code system version has been approved for use in HL7.  Reasons for lack of approval should be captured in an annotation.  Non-endorsed code systems should not be used in HL7 bindings.
	 * UML: Tag on Code System Version stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hl7 Approved Indicator</em>' attribute.
	 * @see #isSetHl7ApprovedIndicator()
	 * @see #unsetHl7ApprovedIndicator()
	 * @see #setHl7ApprovedIndicator(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersionBase_Hl7ApprovedIndicator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='hl7ApprovedIndicator'"
	 * @generated
	 */
	boolean isHl7ApprovedIndicator();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase#isHl7ApprovedIndicator <em>Hl7 Approved Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hl7 Approved Indicator</em>' attribute.
	 * @see #isSetHl7ApprovedIndicator()
	 * @see #unsetHl7ApprovedIndicator()
	 * @see #isHl7ApprovedIndicator()
	 * @generated
	 */
	void setHl7ApprovedIndicator(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase#isHl7ApprovedIndicator <em>Hl7 Approved Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHl7ApprovedIndicator()
	 * @see #isHl7ApprovedIndicator()
	 * @see #setHl7ApprovedIndicator(boolean)
	 * @generated
	 */
	void unsetHl7ApprovedIndicator();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase#isHl7ApprovedIndicator <em>Hl7 Approved Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hl7 Approved Indicator</em>' attribute is set.
	 * @see #unsetHl7ApprovedIndicator()
	 * @see #isHl7ApprovedIndicator()
	 * @see #setHl7ApprovedIndicator(boolean)
	 * @generated
	 */
	boolean isSetHl7ApprovedIndicator();

	/**
	 * Returns the value of the '<em><b>Hl7 Maintained Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies whether HL7 international or an HL7 affiliate has responsibility for maintaining the code system version
	 * UML: Tag on Code System Version stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hl7 Maintained Indicator</em>' attribute.
	 * @see #isSetHl7MaintainedIndicator()
	 * @see #unsetHl7MaintainedIndicator()
	 * @see #setHl7MaintainedIndicator(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersionBase_Hl7MaintainedIndicator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='hl7MaintainedIndicator'"
	 * @generated
	 */
	boolean isHl7MaintainedIndicator();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase#isHl7MaintainedIndicator <em>Hl7 Maintained Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hl7 Maintained Indicator</em>' attribute.
	 * @see #isSetHl7MaintainedIndicator()
	 * @see #unsetHl7MaintainedIndicator()
	 * @see #isHl7MaintainedIndicator()
	 * @generated
	 */
	void setHl7MaintainedIndicator(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase#isHl7MaintainedIndicator <em>Hl7 Maintained Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHl7MaintainedIndicator()
	 * @see #isHl7MaintainedIndicator()
	 * @see #setHl7MaintainedIndicator(boolean)
	 * @generated
	 */
	void unsetHl7MaintainedIndicator();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase#isHl7MaintainedIndicator <em>Hl7 Maintained Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hl7 Maintained Indicator</em>' attribute is set.
	 * @see #unsetHl7MaintainedIndicator()
	 * @see #isHl7MaintainedIndicator()
	 * @see #setHl7MaintainedIndicator(boolean)
	 * @generated
	 */
	boolean isSetHl7MaintainedIndicator();

	/**
	 * Returns the value of the '<em><b>Publisher Version Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version included here as version id of external code system
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher Version Id</em>' attribute.
	 * @see #setPublisherVersionId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersionBase_PublisherVersionId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='publisherVersionId'"
	 * @generated
	 */
	String getPublisherVersionId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase#getPublisherVersionId <em>Publisher Version Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Version Id</em>' attribute.
	 * @see #getPublisherVersionId()
	 * @generated
	 */
	void setPublisherVersionId(String value);

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date on which this particular version of the code system was published, as recognized by HL7.
	 * UML: Corresponds to the 'name' of this ModelElement.  (It's what uniquely defines the code system version within the code system package.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Date</em>' attribute.
	 * @see #setReleaseDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersionBase_ReleaseDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='attribute' name='releaseDate'"
	 * @generated
	 */
	XMLGregorianCalendar getReleaseDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase#getReleaseDate <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Date</em>' attribute.
	 * @see #getReleaseDate()
	 * @generated
	 */
	void setReleaseDate(XMLGregorianCalendar value);

} // CodeSystemVersionBase
