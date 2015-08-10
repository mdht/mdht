/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Issue Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getIssueTypeList()
 * @model extendedMetaData="name='IssueType-list'"
 * @generated
 */
public enum IssueTypeList implements Enumerator {
	/**
	 * The '<em><b>Invalid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVALID_VALUE
	 * @generated
	 * @ordered
	 */
	INVALID(0, "invalid", "invalid"),

	/**
	 * The '<em><b>Structure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURE(1, "structure", "structure"),

	/**
	 * The '<em><b>Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRED(2, "required", "required"),

	/**
	 * The '<em><b>Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE(3, "value", "value"),

	/**
	 * The '<em><b>Invariant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVARIANT_VALUE
	 * @generated
	 * @ordered
	 */
	INVARIANT(4, "invariant", "invariant"),

	/**
	 * The '<em><b>Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY(5, "security", "security"),

	/**
	 * The '<em><b>Login</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIN_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIN(6, "login", "login"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(7, "unknown", "unknown"),

	/**
	 * The '<em><b>Expired</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPIRED_VALUE
	 * @generated
	 * @ordered
	 */
	EXPIRED(8, "expired", "expired"),

	/**
	 * The '<em><b>Forbidden</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORBIDDEN_VALUE
	 * @generated
	 * @ordered
	 */
	FORBIDDEN(9, "forbidden", "forbidden"),

	/**
	 * The '<em><b>Suppressed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPRESSED_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPRESSED(10, "suppressed", "suppressed"),

	/**
	 * The '<em><b>Processing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSING_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSING(11, "processing", "processing"),

	/**
	 * The '<em><b>Not Supported</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SUPPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_SUPPORTED(12, "notSupported", "not-supported"),

	/**
	 * The '<em><b>Duplicate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUPLICATE_VALUE
	 * @generated
	 * @ordered
	 */
	DUPLICATE(13, "duplicate", "duplicate"),

	/**
	 * The '<em><b>Not Found</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_FOUND_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_FOUND(14, "notFound", "not-found"),

	/**
	 * The '<em><b>Too Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOO_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	TOO_LONG(15, "tooLong", "too-long"),

	/**
	 * The '<em><b>Code Invalid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_INVALID_VALUE
	 * @generated
	 * @ordered
	 */
	CODE_INVALID(16, "codeInvalid", "code-invalid"),

	/**
	 * The '<em><b>Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION(17, "extension", "extension"),

	/**
	 * The '<em><b>Too Costly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOO_COSTLY_VALUE
	 * @generated
	 * @ordered
	 */
	TOO_COSTLY(18, "tooCostly", "too-costly"),

	/**
	 * The '<em><b>Business Rule</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_RULE_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS_RULE(19, "businessRule", "business-rule"),

	/**
	 * The '<em><b>Conflict</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFLICT_VALUE
	 * @generated
	 * @ordered
	 */
	CONFLICT(20, "conflict", "conflict"),

	/**
	 * The '<em><b>Incomplete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCOMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	INCOMPLETE(21, "incomplete", "incomplete"),

	/**
	 * The '<em><b>Transient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSIENT_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSIENT(22, "transient", "transient"),

	/**
	 * The '<em><b>Lock Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCK_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	LOCK_ERROR(23, "lockError", "lock-error"),

	/**
	 * The '<em><b>No Store</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_STORE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_STORE(24, "noStore", "no-store"),

	/**
	 * The '<em><b>Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	EXCEPTION(25, "exception", "exception"),

	/**
	 * The '<em><b>Timeout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMEOUT_VALUE
	 * @generated
	 * @ordered
	 */
	TIMEOUT(26, "timeout", "timeout"),

	/**
	 * The '<em><b>Throttled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THROTTLED_VALUE
	 * @generated
	 * @ordered
	 */
	THROTTLED(27, "throttled", "throttled"),

	/**
	 * The '<em><b>Informational</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATIONAL(28, "informational", "informational");

	/**
	 * The '<em><b>Invalid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content invalid against the Specification or a Profile
	 * <!-- end-model-doc -->
	 * @see #INVALID
	 * @model name="invalid"
	 * @generated
	 * @ordered
	 */
	public static final int INVALID_VALUE = 0;

	/**
	 * The '<em><b>Structure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A structural issue in the content such as wrong namespace, or unable to parse the content completely, or invalid json syntax
	 * <!-- end-model-doc -->
	 * @see #STRUCTURE
	 * @model name="structure"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_VALUE = 1;

	/**
	 * The '<em><b>Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A required element is missing
	 * <!-- end-model-doc -->
	 * @see #REQUIRED
	 * @model name="required"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRED_VALUE = 2;

	/**
	 * The '<em><b>Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * element value invalid
	 * <!-- end-model-doc -->
	 * @see #VALUE
	 * @model name="value"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_VALUE = 3;

	/**
	 * The '<em><b>Invariant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A content validation rule failed - e.g. a schematron rule
	 * <!-- end-model-doc -->
	 * @see #INVARIANT
	 * @model name="invariant"
	 * @generated
	 * @ordered
	 */
	public static final int INVARIANT_VALUE = 4;

	/**
	 * The '<em><b>Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An authentication/authorization/permissions issueof some kind
	 * <!-- end-model-doc -->
	 * @see #SECURITY
	 * @model name="security"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_VALUE = 5;

	/**
	 * The '<em><b>Login</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the client needs to initiate an authentication process
	 * <!-- end-model-doc -->
	 * @see #LOGIN
	 * @model name="login"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIN_VALUE = 6;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The user or system was not able to be authenticated (either there is no process, or the proferred token is unacceptable)
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 7;

	/**
	 * The '<em><b>Expired</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User session expired; a login may be required
	 * <!-- end-model-doc -->
	 * @see #EXPIRED
	 * @model name="expired"
	 * @generated
	 * @ordered
	 */
	public static final int EXPIRED_VALUE = 8;

	/**
	 * The '<em><b>Forbidden</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The user does not have the rights to perform this action
	 * <!-- end-model-doc -->
	 * @see #FORBIDDEN
	 * @model name="forbidden"
	 * @generated
	 * @ordered
	 */
	public static final int FORBIDDEN_VALUE = 9;

	/**
	 * The '<em><b>Suppressed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some information was not or may not have been returned due to business rules, consent or privacy rules, or access permission constraints.  This information may be accessible through alternate processes
	 * <!-- end-model-doc -->
	 * @see #SUPPRESSED
	 * @model name="suppressed"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPRESSED_VALUE = 10;

	/**
	 * The '<em><b>Processing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Processing issues. These are expected to be final e.g. there is no point resubmitting the same content unchanged
	 * <!-- end-model-doc -->
	 * @see #PROCESSING
	 * @model name="processing"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSING_VALUE = 11;

	/**
	 * The '<em><b>Not Supported</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource or profile is not supported
	 * <!-- end-model-doc -->
	 * @see #NOT_SUPPORTED
	 * @model name="notSupported" literal="not-supported"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SUPPORTED_VALUE = 12;

	/**
	 * The '<em><b>Duplicate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An attempt was made to create a duplicate record
	 * <!-- end-model-doc -->
	 * @see #DUPLICATE
	 * @model name="duplicate"
	 * @generated
	 * @ordered
	 */
	public static final int DUPLICATE_VALUE = 13;

	/**
	 * The '<em><b>Not Found</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference provided was not found. In a pure RESTful environment, this would be an HTTP 404 error, but this code may be used where the content is not found further into the application architecture
	 * <!-- end-model-doc -->
	 * @see #NOT_FOUND
	 * @model name="notFound" literal="not-found"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_FOUND_VALUE = 14;

	/**
	 * The '<em><b>Too Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provided content is too long (typically, this is a denial of service protection type of error)
	 * <!-- end-model-doc -->
	 * @see #TOO_LONG
	 * @model name="tooLong" literal="too-long"
	 * @generated
	 * @ordered
	 */
	public static final int TOO_LONG_VALUE = 15;

	/**
	 * The '<em><b>Code Invalid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code or system could not be understood, or it was not valid in the context of a particular ValueSet
	 * <!-- end-model-doc -->
	 * @see #CODE_INVALID
	 * @model name="codeInvalid" literal="code-invalid"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_INVALID_VALUE = 16;

	/**
	 * The '<em><b>Extension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An extension was found that was not acceptable, or that could not be resolved, or a modifierExtension that was not recognised
	 * <!-- end-model-doc -->
	 * @see #EXTENSION
	 * @model name="extension"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_VALUE = 17;

	/**
	 * The '<em><b>Too Costly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation was stopped to protect server resources. E.g. a request for a value set expansion on all of SNOMED CT
	 * <!-- end-model-doc -->
	 * @see #TOO_COSTLY
	 * @model name="tooCostly" literal="too-costly"
	 * @generated
	 * @ordered
	 */
	public static final int TOO_COSTLY_VALUE = 18;

	/**
	 * The '<em><b>Business Rule</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content/operation failed to pass some business rule, and so could not proceed
	 * <!-- end-model-doc -->
	 * @see #BUSINESS_RULE
	 * @model name="businessRule" literal="business-rule"
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_RULE_VALUE = 19;

	/**
	 * The '<em><b>Conflict</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * content could not be accepted because of an edit conflict (i.e. version aware updates) (In a pure RESTful environment, this would be an HTTP 404 error, but this code may be used where the conflict is discovered further into the application architecture)
	 * <!-- end-model-doc -->
	 * @see #CONFLICT
	 * @model name="conflict"
	 * @generated
	 * @ordered
	 */
	public static final int CONFLICT_VALUE = 20;

	/**
	 * The '<em><b>Incomplete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not all data sources typically accessed could be reached, or responded in time, so the returned information may not be complete
	 * <!-- end-model-doc -->
	 * @see #INCOMPLETE
	 * @model name="incomplete"
	 * @generated
	 * @ordered
	 */
	public static final int INCOMPLETE_VALUE = 21;

	/**
	 * The '<em><b>Transient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transient processing issues. The system receiving the error may be able to resubmit the same content once an underlying issue is resolved
	 * <!-- end-model-doc -->
	 * @see #TRANSIENT
	 * @model name="transient"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSIENT_VALUE = 22;

	/**
	 * The '<em><b>Lock Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource/record locking failure (usually in an underlying database)
	 * <!-- end-model-doc -->
	 * @see #LOCK_ERROR
	 * @model name="lockError" literal="lock-error"
	 * @generated
	 * @ordered
	 */
	public static final int LOCK_ERROR_VALUE = 23;

	/**
	 * The '<em><b>No Store</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The persistent store unavailable. E.g. the database is down for maintenance or similar
	 * <!-- end-model-doc -->
	 * @see #NO_STORE
	 * @model name="noStore" literal="no-store"
	 * @generated
	 * @ordered
	 */
	public static final int NO_STORE_VALUE = 24;

	/**
	 * The '<em><b>Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An unexpected internal error
	 * <!-- end-model-doc -->
	 * @see #EXCEPTION
	 * @model name="exception"
	 * @generated
	 * @ordered
	 */
	public static final int EXCEPTION_VALUE = 25;

	/**
	 * The '<em><b>Timeout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An internal timeout occurred
	 * <!-- end-model-doc -->
	 * @see #TIMEOUT
	 * @model name="timeout"
	 * @generated
	 * @ordered
	 */
	public static final int TIMEOUT_VALUE = 26;

	/**
	 * The '<em><b>Throttled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system is not prepared to handle this request due to load management
	 * <!-- end-model-doc -->
	 * @see #THROTTLED
	 * @model name="throttled"
	 * @generated
	 * @ordered
	 */
	public static final int THROTTLED_VALUE = 27;

	/**
	 * The '<em><b>Informational</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A message unrelated to the processing success of the completed operation (Examples of the latter include things like reminders of password expiry, system maintenance times, etc.)
	 * <!-- end-model-doc -->
	 * @see #INFORMATIONAL
	 * @model name="informational"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATIONAL_VALUE = 28;

	/**
	 * An array of all the '<em><b>Issue Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IssueTypeList[] VALUES_ARRAY =
		new IssueTypeList[] {
			INVALID,
			STRUCTURE,
			REQUIRED,
			VALUE,
			INVARIANT,
			SECURITY,
			LOGIN,
			UNKNOWN,
			EXPIRED,
			FORBIDDEN,
			SUPPRESSED,
			PROCESSING,
			NOT_SUPPORTED,
			DUPLICATE,
			NOT_FOUND,
			TOO_LONG,
			CODE_INVALID,
			EXTENSION,
			TOO_COSTLY,
			BUSINESS_RULE,
			CONFLICT,
			INCOMPLETE,
			TRANSIENT,
			LOCK_ERROR,
			NO_STORE,
			EXCEPTION,
			TIMEOUT,
			THROTTLED,
			INFORMATIONAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Issue Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IssueTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Issue Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssueTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issue Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssueTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issue Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueTypeList get(int value) {
		switch (value) {
			case INVALID_VALUE: return INVALID;
			case STRUCTURE_VALUE: return STRUCTURE;
			case REQUIRED_VALUE: return REQUIRED;
			case VALUE_VALUE: return VALUE;
			case INVARIANT_VALUE: return INVARIANT;
			case SECURITY_VALUE: return SECURITY;
			case LOGIN_VALUE: return LOGIN;
			case UNKNOWN_VALUE: return UNKNOWN;
			case EXPIRED_VALUE: return EXPIRED;
			case FORBIDDEN_VALUE: return FORBIDDEN;
			case SUPPRESSED_VALUE: return SUPPRESSED;
			case PROCESSING_VALUE: return PROCESSING;
			case NOT_SUPPORTED_VALUE: return NOT_SUPPORTED;
			case DUPLICATE_VALUE: return DUPLICATE;
			case NOT_FOUND_VALUE: return NOT_FOUND;
			case TOO_LONG_VALUE: return TOO_LONG;
			case CODE_INVALID_VALUE: return CODE_INVALID;
			case EXTENSION_VALUE: return EXTENSION;
			case TOO_COSTLY_VALUE: return TOO_COSTLY;
			case BUSINESS_RULE_VALUE: return BUSINESS_RULE;
			case CONFLICT_VALUE: return CONFLICT;
			case INCOMPLETE_VALUE: return INCOMPLETE;
			case TRANSIENT_VALUE: return TRANSIENT;
			case LOCK_ERROR_VALUE: return LOCK_ERROR;
			case NO_STORE_VALUE: return NO_STORE;
			case EXCEPTION_VALUE: return EXCEPTION;
			case TIMEOUT_VALUE: return TIMEOUT;
			case THROTTLED_VALUE: return THROTTLED;
			case INFORMATIONAL_VALUE: return INFORMATIONAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IssueTypeList(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //IssueTypeList
