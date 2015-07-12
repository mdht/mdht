/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conformance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A conformance statement is a set of requirements for a desired implementation or a description of how a target application fulfills those requirements in a particular implementation.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Conformance#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getSoftware <em>Software</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getFhirVersion <em>Fhir Version</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getAcceptUnknown <em>Accept Unknown</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getFormat <em>Format</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getRest <em>Rest</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getMessaging <em>Messaging</em>}</li>
 *   <li>{@link org.hl7.fhir.Conformance#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConformance()
 * @model extendedMetaData="name='Conformance' kind='elementOnly'"
 * @generated
 */
public interface Conformance extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute uri that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance (should be globally unique URI, and an be urn:uuid: or urn:oid:).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getConformance_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Conformance#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConformance_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Conformance#getVersion <em>Version</em>}' containment reference.
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
	 * A free text natural language name identifying the conformance statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConformance_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Conformance#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the individual or organization that published the conformance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConformance_Publisher()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPublisher();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Conformance#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConformanceContact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contacts to assist a user in finding and communicating with the publisher.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformance_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConformanceContact> getContact();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConformance_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Conformance#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Explains why this conformance statement is needed and why it's been constrained as it has.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConformance_Requirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirements' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getRequirements();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Conformance#getRequirements <em>Requirements</em>}' containment reference.
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
	 * A copyright statement relating to the conformamce statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConformance_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCopyright();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Conformance#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of this conformance statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ConformanceResourceStatus)
	 * @see org.hl7.fhir.FhirPackage#getConformance_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ConformanceResourceStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Conformance#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ConformanceResourceStatus value);

	/**
	 * Returns the value of the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimental</em>' containment reference.
	 * @see #setExperimental(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getConformance_Experimental()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='experimental' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Conformance#getExperimental <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimental</em>' containment reference.
	 * @see #getExperimental()
	 * @generated
	 */
	void setExperimental(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date  (and optionally time) when the conformance statement was published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getConformance_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Conformance#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Software</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Software that is covered by this conformance statement.  It is used when the conformance statement describes the capabilities of a particular software version, independent of an installation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Software</em>' containment reference.
	 * @see #setSoftware(ConformanceSoftware)
	 * @see org.hl7.fhir.FhirPackage#getConformance_Software()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='software' namespace='##targetNamespace'"
	 * @generated
	 */
	ConformanceSoftware getSoftware();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Conformance#getSoftware <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' containment reference.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(ConformanceSoftware value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a specific implementation instance that is described by the conformance statement - i.e. a particular installation, rather than the capabilities of a software program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(ConformanceImplementation)
	 * @see org.hl7.fhir.FhirPackage#getConformance_Implementation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='implementation' namespace='##targetNamespace'"
	 * @generated
	 */
	ConformanceImplementation getImplementation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Conformance#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(ConformanceImplementation value);

	/**
	 * Returns the value of the '<em><b>Fhir Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the FHIR specification on which this conformance statement is based.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fhir Version</em>' containment reference.
	 * @see #setFhirVersion(Id)
	 * @see org.hl7.fhir.FhirPackage#getConformance_FhirVersion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fhirVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getFhirVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Conformance#getFhirVersion <em>Fhir Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fhir Version</em>' containment reference.
	 * @see #getFhirVersion()
	 * @generated
	 */
	void setFhirVersion(Id value);

	/**
	 * Returns the value of the '<em><b>Accept Unknown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A flag that indicates whether the application accepts unknown elements as part of a resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accept Unknown</em>' containment reference.
	 * @see #setAcceptUnknown(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getConformance_AcceptUnknown()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='acceptUnknown' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAcceptUnknown();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Conformance#getAcceptUnknown <em>Accept Unknown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept Unknown</em>' containment reference.
	 * @see #getAcceptUnknown()
	 * @generated
	 */
	void setAcceptUnknown(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of the formats supported by this implementation using their content types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformance_Format()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='format' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Code> getFormat();

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of profiles supported by the system. For a server, "supported by the system" means the system hosts/produces a set of resources, conformant to a particular profile, and allows its clients to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformance_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getProfile();

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConformanceRest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A definition of the restful capabilities of the solution, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rest</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformance_Rest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rest' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConformanceRest> getRest();

	/**
	 * Returns the value of the '<em><b>Messaging</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConformanceMessaging}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the messaging capabilities of the solution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Messaging</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformance_Messaging()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='messaging' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConformanceMessaging> getMessaging();

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConformanceDocument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A document definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformance_Document()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='document' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConformanceDocument> getDocument();

} // Conformance
