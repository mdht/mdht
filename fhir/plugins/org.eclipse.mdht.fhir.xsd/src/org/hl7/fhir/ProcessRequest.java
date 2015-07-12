/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the target, request and response, and action details for an action to be performed by the target on or about existing resources.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProcessRequest#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessRequest#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessRequest#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessRequest#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessRequest#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessRequest#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessRequest#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessRequest#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessRequest#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessRequest#getResponse <em>Response</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessRequest#getNullify <em>Nullify</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessRequest#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessRequest#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessRequest#getInclude <em>Include</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessRequest#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessRequest#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProcessRequest()
 * @model extendedMetaData="name='ProcessRequest' kind='elementOnly'"
 * @generated
 */
public interface ProcessRequest extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of procesing action being requested, for example Reversal, Readjudication, StatusRequest,PendedRequest.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(ActionList)
	 * @see org.hl7.fhir.FhirPackage#getProcessRequest_Action()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionList getAction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessRequest#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionList value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ProcessRequest Business Identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcessRequest_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruleset</em>' containment reference.
	 * @see #setRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getProcessRequest_Ruleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ruleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessRequest#getRuleset <em>Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruleset</em>' containment reference.
	 * @see #getRuleset()
	 * @generated
	 */
	void setRuleset(Coding value);

	/**
	 * Returns the value of the '<em><b>Original Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The style (standard) and version of the original material which was converted into this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Ruleset</em>' containment reference.
	 * @see #setOriginalRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getProcessRequest_OriginalRuleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalRuleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getOriginalRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessRequest#getOriginalRuleset <em>Original Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Ruleset</em>' containment reference.
	 * @see #getOriginalRuleset()
	 * @generated
	 */
	void setOriginalRuleset(Coding value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when this resource was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getProcessRequest_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessRequest#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization which is target  of the request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcessRequest_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTarget();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessRequest#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Reference value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner who is responsible for the action specified in thise request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcessRequest_Provider()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='provider' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProvider();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessRequest#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Reference value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization which is responsible for the action speccified in thise request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcessRequest_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessRequest#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference of resource which is the target or subject of this action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcessRequest_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessRequest#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Reference value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference of a prior response to resource which is the target or subject of this action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcessRequest_Response()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='response' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessRequest#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Reference value);

	/**
	 * Returns the value of the '<em><b>Nullify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true remove all history excluding audit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nullify</em>' containment reference.
	 * @see #setNullify(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getProcessRequest_Nullify()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nullify' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getNullify();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessRequest#getNullify <em>Nullify</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullify</em>' containment reference.
	 * @see #getNullify()
	 * @generated
	 */
	void setNullify(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to supply which authenticates the process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getProcessRequest_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessRequest#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProcessRequestItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcessRequest_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProcessRequestItem> getItem();

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Names of resource types to include.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcessRequest_Include()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getInclude();

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Names of resource types to exclude.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcessRequest_Exclude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getExclude();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A period of time during which the fulfilling resources would have been created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getProcessRequest_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessRequest#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // ProcessRequest
