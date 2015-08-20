/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conformance Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A conformance statement is a set of requirements for a desired implementation or a description of how a target application fulfills those requirements in a particular implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConformanceResource#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceResource#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceResource#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceResource#getVersioning <em>Versioning</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceResource#getReadHistory <em>Read History</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceResource#getUpdateCreate <em>Update Create</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceResource#getConditionalCreate <em>Conditional Create</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceResource#getConditionalUpdate <em>Conditional Update</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceResource#getConditionalDelete <em>Conditional Delete</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceResource#getSearchInclude <em>Search Include</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceResource#getSearchRevInclude <em>Search Rev Include</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceResource#getSearchParam <em>Search Param</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConformanceResource()
 * @model extendedMetaData="name='Conformance.Resource' kind='elementOnly'"
 * @generated
 */
public interface ConformanceResource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A type of resource exposed via the restful interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see org.hl7.fhir.FhirPackage#getConformanceResource_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceResource#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specification of the profile that describes the solution's overall support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(Reference)
	 * @see org.hl7.fhir.FhirPackage#getConformanceResource_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProfile();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceResource#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Reference value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConformanceInteraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a restful operation supported by the solution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceResource_Interaction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='interaction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConformanceInteraction> getInteraction();

	/**
	 * Returns the value of the '<em><b>Versioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Thi field is set to true to specify that the system does not support (server) or use (client) versioning for this resource type. If this is not set to true, the server must at least correctly track and populate the versionId meta-property on resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versioning</em>' containment reference.
	 * @see #setVersioning(ResourceVersionPolicy)
	 * @see org.hl7.fhir.FhirPackage#getConformanceResource_Versioning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versioning' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceVersionPolicy getVersioning();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceResource#getVersioning <em>Versioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versioning</em>' containment reference.
	 * @see #getVersioning()
	 * @generated
	 */
	void setVersioning(ResourceVersionPolicy value);

	/**
	 * Returns the value of the '<em><b>Read History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A flag for whether the server is able to return past versions as part of the vRead operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read History</em>' containment reference.
	 * @see #setReadHistory(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getConformanceResource_ReadHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='readHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getReadHistory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceResource#getReadHistory <em>Read History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read History</em>' containment reference.
	 * @see #getReadHistory()
	 * @generated
	 */
	void setReadHistory(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Update Create</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Create</em>' containment reference.
	 * @see #setUpdateCreate(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getConformanceResource_UpdateCreate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='updateCreate' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getUpdateCreate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceResource#getUpdateCreate <em>Update Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Create</em>' containment reference.
	 * @see #getUpdateCreate()
	 * @generated
	 */
	void setUpdateCreate(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Conditional Create</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A flag that indicates that the server supports conditional create.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditional Create</em>' containment reference.
	 * @see #setConditionalCreate(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getConformanceResource_ConditionalCreate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conditionalCreate' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getConditionalCreate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceResource#getConditionalCreate <em>Conditional Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Create</em>' containment reference.
	 * @see #getConditionalCreate()
	 * @generated
	 */
	void setConditionalCreate(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Conditional Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A flag that indicates that the server supports conditional update.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditional Update</em>' containment reference.
	 * @see #setConditionalUpdate(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getConformanceResource_ConditionalUpdate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conditionalUpdate' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getConditionalUpdate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceResource#getConditionalUpdate <em>Conditional Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Update</em>' containment reference.
	 * @see #getConditionalUpdate()
	 * @generated
	 */
	void setConditionalUpdate(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Conditional Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that indicates how the server supports conditional delete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditional Delete</em>' containment reference.
	 * @see #setConditionalDelete(ConditionalDeleteStatus)
	 * @see org.hl7.fhir.FhirPackage#getConformanceResource_ConditionalDelete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conditionalDelete' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionalDeleteStatus getConditionalDelete();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceResource#getConditionalDelete <em>Conditional Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Delete</em>' containment reference.
	 * @see #getConditionalDelete()
	 * @generated
	 */
	void setConditionalDelete(ConditionalDeleteStatus value);

	/**
	 * Returns the value of the '<em><b>Search Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of _include values supported by the server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Search Include</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceResource_SearchInclude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='searchInclude' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getSearchInclude();

	/**
	 * Returns the value of the '<em><b>Search Rev Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of _revinclude (reverse include) values supported by the server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Search Rev Include</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceResource_SearchRevInclude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='searchRevInclude' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getSearchRevInclude();

	/**
	 * Returns the value of the '<em><b>Search Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConformanceSearchParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Search Param</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceResource_SearchParam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='searchParam' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConformanceSearchParam> getSearchParam();

} // ConformanceResource
