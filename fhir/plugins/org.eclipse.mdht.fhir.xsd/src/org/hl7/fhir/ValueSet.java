/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A value set specifies a set of codes drawn from one or more code systems.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ValueSet#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSet#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSet#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSet#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSet#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSet#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSet#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSet#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSet#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSet#getLockedDate <em>Locked Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSet#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSet#getUseContext <em>Use Context</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSet#getImmutable <em>Immutable</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSet#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSet#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSet#getExtensible <em>Extensible</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSet#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSet#getCompose <em>Compose</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSet#getExpansion <em>Expansion</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getValueSet()
 * @model extendedMetaData="name='ValueSet' kind='elementOnly'"
 * @generated
 */
public interface ValueSet extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URL that is used to identify this value set when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this value set is (or will be) published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getValueSet_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSet#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formal identifier that is used to identify this value set when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getValueSet_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSet#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to identify this version of the value set when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getValueSet_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSet#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text natural language name describing the value set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getValueSet_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSet#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the value set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see org.hl7.fhir.FhirPackage#getValueSet_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSet#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This valueset was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimental</em>' containment reference.
	 * @see #setExperimental(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getValueSet_Experimental()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='experimental' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSet#getExperimental <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimental</em>' containment reference.
	 * @see #getExperimental()
	 * @generated
	 */
	void setExperimental(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the individual or organization that published the value set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getValueSet_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSet#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ValueSetContact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contacts to assist a user in finding and communicating with the publisher.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getValueSet_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetContact> getContact();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date that the value set status was last changed. The date must change when the business version changes, if it does, and it must change if the status code changes. in addition, it should change when the substantiative content of the implementation guide changes (e.g. the 'content logical definition').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getValueSet_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSet#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Locked Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a Locked Date is defined, then the Content Logical Definition must be evaluated using the current version of all referenced code system(s) and value sets as of the Locked Date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locked Date</em>' containment reference.
	 * @see #setLockedDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getValueSet_LockedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lockedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getLockedDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSet#getLockedDate <em>Locked Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked Date</em>' containment reference.
	 * @see #getLockedDate()
	 * @generated
	 */
	void setLockedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text natural language description of the use of the value set - reason for definition, "the semantic space" to be included in the value set, conditions of use, etc. The description may include a list of expected usages for the value set and can also describe the approach taken to build the value set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getValueSet_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSet#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Use Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of value set definitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getValueSet_UseContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useContext' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getUseContext();

	/**
	 * Returns the value of the '<em><b>Immutable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this is set to 'true', then no new versions of the content logical definition can be created.  Note: Other metadata might still change.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Immutable</em>' containment reference.
	 * @see #setImmutable(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getValueSet_Immutable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='immutable' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getImmutable();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSet#getImmutable <em>Immutable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immutable</em>' containment reference.
	 * @see #getImmutable()
	 * @generated
	 */
	void setImmutable(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Explains why this value set is needed and why it's been constrained as it has.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getValueSet_Requirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirements' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getRequirements();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSet#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A copyright statement relating to the value set and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the value set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getValueSet_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCopyright();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSet#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Extensible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this is intended to be used with an extensible binding or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extensible</em>' containment reference.
	 * @see #setExtensible(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getValueSet_Extensible()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extensible' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExtensible();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSet#getExtensible <em>Extensible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensible</em>' containment reference.
	 * @see #getExtensible()
	 * @generated
	 */
	void setExtensible(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Code System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A definition of an code system, inlined into the value set (as a packaging convenience). Note that the inline code system may be used from other value sets by referring to it's (codeSystem.system) directly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System</em>' containment reference.
	 * @see #setCodeSystem(ValueSetCodeSystem)
	 * @see org.hl7.fhir.FhirPackage#getValueSet_CodeSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetCodeSystem getCodeSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSet#getCodeSystem <em>Code System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System</em>' containment reference.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(ValueSetCodeSystem value);

	/**
	 * Returns the value of the '<em><b>Compose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of criteria that provide the content logical definition of the value set by including or excluding codes from outside this value set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compose</em>' containment reference.
	 * @see #setCompose(ValueSetCompose)
	 * @see org.hl7.fhir.FhirPackage#getValueSet_Compose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compose' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetCompose getCompose();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSet#getCompose <em>Compose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compose</em>' containment reference.
	 * @see #getCompose()
	 * @generated
	 */
	void setCompose(ValueSetCompose value);

	/**
	 * Returns the value of the '<em><b>Expansion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value set can also be "expanded", where the value set is turned into a simple collection of enumerated codes. This element holds the expansion, if it has been performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expansion</em>' containment reference.
	 * @see #setExpansion(ValueSetExpansion)
	 * @see org.hl7.fhir.FhirPackage#getValueSet_Expansion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expansion' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetExpansion getExpansion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSet#getExpansion <em>Expansion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expansion</em>' containment reference.
	 * @see #getExpansion()
	 * @generated
	 */
	void setExpansion(ValueSetExpansion value);

} // ValueSet
