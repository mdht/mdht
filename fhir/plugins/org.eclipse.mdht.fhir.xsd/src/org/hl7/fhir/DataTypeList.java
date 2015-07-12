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
 * A representation of the literals of the enumeration '<em><b>Data Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getDataTypeList()
 * @model extendedMetaData="name='DataType-list'"
 * @generated
 */
public enum DataTypeList implements Enumerator {
	/**
	 * The '<em><b>Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	ADDRESS(0, "Address", "Address"),

	/**
	 * The '<em><b>Age</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGE_VALUE
	 * @generated
	 * @ordered
	 */
	AGE(1, "Age", "Age"),

	/**
	 * The '<em><b>Attachment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACHMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACHMENT(2, "Attachment", "Attachment"),

	/**
	 * The '<em><b>Backbone Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKBONE_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	BACKBONE_ELEMENT(3, "BackboneElement", "BackboneElement"),

	/**
	 * The '<em><b>Codeable Concept</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODEABLE_CONCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	CODEABLE_CONCEPT(4, "CodeableConcept", "CodeableConcept"),

	/**
	 * The '<em><b>Coding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODING_VALUE
	 * @generated
	 * @ordered
	 */
	CODING(5, "Coding", "Coding"),

	/**
	 * The '<em><b>Contact Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTACT_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTACT_POINT(6, "ContactPoint", "ContactPoint"),

	/**
	 * The '<em><b>Count</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	COUNT(7, "Count", "Count"),

	/**
	 * The '<em><b>Distance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE(8, "Distance", "Distance"),

	/**
	 * The '<em><b>Duration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DURATION_VALUE
	 * @generated
	 * @ordered
	 */
	DURATION(9, "Duration", "Duration"),

	/**
	 * The '<em><b>Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ELEMENT(10, "Element", "Element"),

	/**
	 * The '<em><b>Element Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEMENT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	ELEMENT_DEFINITION(11, "ElementDefinition", "ElementDefinition"),

	/**
	 * The '<em><b>Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION(12, "Extension", "Extension"),

	/**
	 * The '<em><b>Human Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMAN_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	HUMAN_NAME(13, "HumanName", "HumanName"),

	/**
	 * The '<em><b>Identifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTIFIER(14, "Identifier", "Identifier"),

	/**
	 * The '<em><b>Meta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #META_VALUE
	 * @generated
	 * @ordered
	 */
	META(15, "Meta", "Meta"),

	/**
	 * The '<em><b>Money</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONEY_VALUE
	 * @generated
	 * @ordered
	 */
	MONEY(16, "Money", "Money"),

	/**
	 * The '<em><b>Narrative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NARRATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	NARRATIVE(17, "Narrative", "Narrative"),

	/**
	 * The '<em><b>Period</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERIOD_VALUE
	 * @generated
	 * @ordered
	 */
	PERIOD(18, "Period", "Period"),

	/**
	 * The '<em><b>Quantity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUANTITY_VALUE
	 * @generated
	 * @ordered
	 */
	QUANTITY(19, "Quantity", "Quantity"),

	/**
	 * The '<em><b>Range</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	RANGE(20, "Range", "Range"),

	/**
	 * The '<em><b>Ratio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATIO_VALUE
	 * @generated
	 * @ordered
	 */
	RATIO(21, "Ratio", "Ratio"),

	/**
	 * The '<em><b>Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE(22, "Reference", "Reference"),

	/**
	 * The '<em><b>Sampled Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLED_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	SAMPLED_DATA(23, "SampledData", "SampledData"),

	/**
	 * The '<em><b>Signature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATURE_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNATURE(24, "Signature", "Signature"),

	/**
	 * The '<em><b>Timing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMING_VALUE
	 * @generated
	 * @ordered
	 */
	TIMING(25, "Timing", "Timing"),

	/**
	 * The '<em><b>Base64 Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	BASE64_BINARY(26, "base64Binary", "base64Binary"),

	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(27, "boolean", "boolean"),

	/**
	 * The '<em><b>Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_VALUE
	 * @generated
	 * @ordered
	 */
	CODE(28, "code", "code"),

	/**
	 * The '<em><b>Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(29, "date", "date"),

	/**
	 * The '<em><b>Date Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_TIME(30, "dateTime", "dateTime"),

	/**
	 * The '<em><b>Decimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	DECIMAL(31, "decimal", "decimal"),

	/**
	 * The '<em><b>Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_VALUE
	 * @generated
	 * @ordered
	 */
	ID(32, "id", "id"),

	/**
	 * The '<em><b>Instant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANT_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANT(33, "instant", "instant"),

	/**
	 * The '<em><b>Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(34, "integer", "integer"),

	/**
	 * The '<em><b>Oid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OID_VALUE
	 * @generated
	 * @ordered
	 */
	OID(35, "oid", "oid"),

	/**
	 * The '<em><b>Positive Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_INT_VALUE
	 * @generated
	 * @ordered
	 */
	POSITIVE_INT(36, "positiveInt", "positiveInt"),

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(37, "string", "string"),

	/**
	 * The '<em><b>Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(38, "time", "time"),

	/**
	 * The '<em><b>Unsigned Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_INT_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_INT(39, "unsignedInt", "unsignedInt"),

	/**
	 * The '<em><b>Uri</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URI_VALUE
	 * @generated
	 * @ordered
	 */
	URI(40, "uri", "uri"),

	/**
	 * The '<em><b>Uuid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UUID_VALUE
	 * @generated
	 * @ordered
	 */
	UUID(41, "uuid", "uuid");

	/**
	 * The '<em><b>Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There is a variety of postal address formats defined around the world. This format defines a superset that is the basis for all addresses around the world.
	 * <!-- end-model-doc -->
	 * @see #ADDRESS
	 * @model name="Address"
	 * @generated
	 * @ordered
	 */
	public static final int ADDRESS_VALUE = 0;

	/**
	 * The '<em><b>Age</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A duration (length of time) with a UCUM code
	 * <!-- end-model-doc -->
	 * @see #AGE
	 * @model name="Age"
	 * @generated
	 * @ordered
	 */
	public static final int AGE_VALUE = 1;

	/**
	 * The '<em><b>Attachment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For referring to data content defined in other formats.
	 * <!-- end-model-doc -->
	 * @see #ATTACHMENT
	 * @model name="Attachment"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT_VALUE = 2;

	/**
	 * The '<em><b>Backbone Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base definition for all elements that are defined inside a resource - but not those in a data type.
	 * <!-- end-model-doc -->
	 * @see #BACKBONE_ELEMENT
	 * @model name="BackboneElement"
	 * @generated
	 * @ordered
	 */
	public static final int BACKBONE_ELEMENT_VALUE = 3;

	/**
	 * The '<em><b>Codeable Concept</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
	 * <!-- end-model-doc -->
	 * @see #CODEABLE_CONCEPT
	 * @model name="CodeableConcept"
	 * @generated
	 * @ordered
	 */
	public static final int CODEABLE_CONCEPT_VALUE = 4;

	/**
	 * The '<em><b>Coding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a code defined by a terminology system.
	 * <!-- end-model-doc -->
	 * @see #CODING
	 * @model name="Coding"
	 * @generated
	 * @ordered
	 */
	public static final int CODING_VALUE = 5;

	/**
	 * The '<em><b>Contact Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details for All kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
	 * <!-- end-model-doc -->
	 * @see #CONTACT_POINT
	 * @model name="ContactPoint"
	 * @generated
	 * @ordered
	 */
	public static final int CONTACT_POINT_VALUE = 6;

	/**
	 * The '<em><b>Count</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A count of a discrete element (no unit)
	 * <!-- end-model-doc -->
	 * @see #COUNT
	 * @model name="Count"
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_VALUE = 7;

	/**
	 * The '<em><b>Distance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A measure of distance
	 * <!-- end-model-doc -->
	 * @see #DISTANCE
	 * @model name="Distance"
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_VALUE = 8;

	/**
	 * The '<em><b>Duration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A length of time
	 * <!-- end-model-doc -->
	 * @see #DURATION
	 * @model name="Duration"
	 * @generated
	 * @ordered
	 */
	public static final int DURATION_VALUE = 9;

	/**
	 * The '<em><b>Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base definition for all elements in a resource.
	 * <!-- end-model-doc -->
	 * @see #ELEMENT
	 * @model name="Element"
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENT_VALUE = 10;

	/**
	 * The '<em><b>Element Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Captures constraints on each element within the resource, profile, or extension.
	 * <!-- end-model-doc -->
	 * @see #ELEMENT_DEFINITION
	 * @model name="ElementDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENT_DEFINITION_VALUE = 11;

	/**
	 * The '<em><b>Extension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional Extensions Element - found in all resources.
	 * <!-- end-model-doc -->
	 * @see #EXTENSION
	 * @model name="Extension"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_VALUE = 12;

	/**
	 * The '<em><b>Human Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human's name with the ability to identify parts and usage.
	 * <!-- end-model-doc -->
	 * @see #HUMAN_NAME
	 * @model name="HumanName"
	 * @generated
	 * @ordered
	 */
	public static final int HUMAN_NAME_VALUE = 13;

	/**
	 * The '<em><b>Identifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A technical identifier - identifies some entity uniquely and unambiguously.
	 * <!-- end-model-doc -->
	 * @see #IDENTIFIER
	 * @model name="Identifier"
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIER_VALUE = 14;

	/**
	 * The '<em><b>Meta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource.
	 * <!-- end-model-doc -->
	 * @see #META
	 * @model name="Meta"
	 * @generated
	 * @ordered
	 */
	public static final int META_VALUE = 15;

	/**
	 * The '<em><b>Money</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An amount of money. With regard to precision, see [[X]]
	 * <!-- end-model-doc -->
	 * @see #MONEY
	 * @model name="Money"
	 * @generated
	 * @ordered
	 */
	public static final int MONEY_VALUE = 16;

	/**
	 * The '<em><b>Narrative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human-readable formatted text, including images.
	 * <!-- end-model-doc -->
	 * @see #NARRATIVE
	 * @model name="Narrative"
	 * @generated
	 * @ordered
	 */
	public static final int NARRATIVE_VALUE = 17;

	/**
	 * The '<em><b>Period</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A time period defined by a start and end date and optionally time.
	 * <!-- end-model-doc -->
	 * @see #PERIOD
	 * @model name="Period"
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD_VALUE = 18;

	/**
	 * The '<em><b>Quantity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
	 * <!-- end-model-doc -->
	 * @see #QUANTITY
	 * @model name="Quantity"
	 * @generated
	 * @ordered
	 */
	public static final int QUANTITY_VALUE = 19;

	/**
	 * The '<em><b>Range</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of ordered Quantities defined by a low and high limit.
	 * <!-- end-model-doc -->
	 * @see #RANGE
	 * @model name="Range"
	 * @generated
	 * @ordered
	 */
	public static final int RANGE_VALUE = 20;

	/**
	 * The '<em><b>Ratio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A relationship of two Quantity values - expressed as a numerator and a denominator.
	 * <!-- end-model-doc -->
	 * @see #RATIO
	 * @model name="Ratio"
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_VALUE = 21;

	/**
	 * The '<em><b>Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference from one resource to another.
	 * <!-- end-model-doc -->
	 * @see #REFERENCE
	 * @model name="Reference"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_VALUE = 22;

	/**
	 * The '<em><b>Sampled Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
	 * <!-- end-model-doc -->
	 * @see #SAMPLED_DATA
	 * @model name="SampledData"
	 * @generated
	 * @ordered
	 */
	public static final int SAMPLED_DATA_VALUE = 23;

	/**
	 * The '<em><b>Signature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An XML digital signature along with supporting context.
	 * <!-- end-model-doc -->
	 * @see #SIGNATURE
	 * @model name="Signature"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNATURE_VALUE = 24;

	/**
	 * The '<em><b>Timing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies an event that may occur multiple times. Timing schedules are used to record when things are expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds.
	 * <!-- end-model-doc -->
	 * @see #TIMING
	 * @model name="Timing"
	 * @generated
	 * @ordered
	 */
	public static final int TIMING_VALUE = 25;

	/**
	 * The '<em><b>Base64 Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A stream of bytes
	 * <!-- end-model-doc -->
	 * @see #BASE64_BINARY
	 * @model name="base64Binary"
	 * @generated
	 * @ordered
	 */
	public static final int BASE64_BINARY_VALUE = 26;

	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value of "true" or "false"
	 * <!-- end-model-doc -->
	 * @see #BOOLEAN
	 * @model name="boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 27;

	/**
	 * The '<em><b>Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
	 * <!-- end-model-doc -->
	 * @see #CODE
	 * @model name="code"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_VALUE = 28;

	/**
	 * The '<em><b>Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date, or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
	 * <!-- end-model-doc -->
	 * @see #DATE
	 * @model name="date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 29;

	/**
	 * The '<em><b>Date Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.  Dates SHALL be valid dates.
	 * <!-- end-model-doc -->
	 * @see #DATE_TIME
	 * @model name="dateTime"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_TIME_VALUE = 30;

	/**
	 * The '<em><b>Decimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A rational number with implicit precision
	 * <!-- end-model-doc -->
	 * @see #DECIMAL
	 * @model name="decimal"
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL_VALUE = 31;

	/**
	 * The '<em><b>Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any combination of lowercase letters, numerals, "-" and ".", with a length limit of 36 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Systems SHALL send ids as lower-case but SHOULD interpret them case-insensitively.
	 * <!-- end-model-doc -->
	 * @see #ID
	 * @model name="id"
	 * @generated
	 * @ordered
	 */
	public static final int ID_VALUE = 32;

	/**
	 * The '<em><b>Instant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An instant in time - known at least to the second
	 * <!-- end-model-doc -->
	 * @see #INSTANT
	 * @model name="instant"
	 * @generated
	 * @ordered
	 */
	public static final int INSTANT_VALUE = 33;

	/**
	 * The '<em><b>Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A whole number
	 * <!-- end-model-doc -->
	 * @see #INTEGER
	 * @model name="integer"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 34;

	/**
	 * The '<em><b>Oid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An oid represented as a URI
	 * <!-- end-model-doc -->
	 * @see #OID
	 * @model name="oid"
	 * @generated
	 * @ordered
	 */
	public static final int OID_VALUE = 35;

	/**
	 * The '<em><b>Positive Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer with a value that is positive (e.g. >0)
	 * <!-- end-model-doc -->
	 * @see #POSITIVE_INT
	 * @model name="positiveInt"
	 * @generated
	 * @ordered
	 */
	public static final int POSITIVE_INT_VALUE = 36;

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sequence of Unicode characters
	 * <!-- end-model-doc -->
	 * @see #STRING
	 * @model name="string"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 37;

	/**
	 * The '<em><b>Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A time during the day, with no date specified
	 * <!-- end-model-doc -->
	 * @see #TIME
	 * @model name="time"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 38;

	/**
	 * The '<em><b>Unsigned Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer with a value that is not negative (e.g. >= 0)
	 * <!-- end-model-doc -->
	 * @see #UNSIGNED_INT
	 * @model name="unsignedInt"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_INT_VALUE = 39;

	/**
	 * The '<em><b>Uri</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String of characters used to identify a name or a resource
	 * <!-- end-model-doc -->
	 * @see #URI
	 * @model name="uri"
	 * @generated
	 * @ordered
	 */
	public static final int URI_VALUE = 40;

	/**
	 * The '<em><b>Uuid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A UUID, represented as a URI
	 * <!-- end-model-doc -->
	 * @see #UUID
	 * @model name="uuid"
	 * @generated
	 * @ordered
	 */
	public static final int UUID_VALUE = 41;

	/**
	 * An array of all the '<em><b>Data Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataTypeList[] VALUES_ARRAY =
		new DataTypeList[] {
			ADDRESS,
			AGE,
			ATTACHMENT,
			BACKBONE_ELEMENT,
			CODEABLE_CONCEPT,
			CODING,
			CONTACT_POINT,
			COUNT,
			DISTANCE,
			DURATION,
			ELEMENT,
			ELEMENT_DEFINITION,
			EXTENSION,
			HUMAN_NAME,
			IDENTIFIER,
			META,
			MONEY,
			NARRATIVE,
			PERIOD,
			QUANTITY,
			RANGE,
			RATIO,
			REFERENCE,
			SAMPLED_DATA,
			SIGNATURE,
			TIMING,
			BASE64_BINARY,
			BOOLEAN,
			CODE,
			DATE,
			DATE_TIME,
			DECIMAL,
			ID,
			INSTANT,
			INTEGER,
			OID,
			POSITIVE_INT,
			STRING,
			TIME,
			UNSIGNED_INT,
			URI,
			UUID,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTypeList get(int value) {
		switch (value) {
			case ADDRESS_VALUE: return ADDRESS;
			case AGE_VALUE: return AGE;
			case ATTACHMENT_VALUE: return ATTACHMENT;
			case BACKBONE_ELEMENT_VALUE: return BACKBONE_ELEMENT;
			case CODEABLE_CONCEPT_VALUE: return CODEABLE_CONCEPT;
			case CODING_VALUE: return CODING;
			case CONTACT_POINT_VALUE: return CONTACT_POINT;
			case COUNT_VALUE: return COUNT;
			case DISTANCE_VALUE: return DISTANCE;
			case DURATION_VALUE: return DURATION;
			case ELEMENT_VALUE: return ELEMENT;
			case ELEMENT_DEFINITION_VALUE: return ELEMENT_DEFINITION;
			case EXTENSION_VALUE: return EXTENSION;
			case HUMAN_NAME_VALUE: return HUMAN_NAME;
			case IDENTIFIER_VALUE: return IDENTIFIER;
			case META_VALUE: return META;
			case MONEY_VALUE: return MONEY;
			case NARRATIVE_VALUE: return NARRATIVE;
			case PERIOD_VALUE: return PERIOD;
			case QUANTITY_VALUE: return QUANTITY;
			case RANGE_VALUE: return RANGE;
			case RATIO_VALUE: return RATIO;
			case REFERENCE_VALUE: return REFERENCE;
			case SAMPLED_DATA_VALUE: return SAMPLED_DATA;
			case SIGNATURE_VALUE: return SIGNATURE;
			case TIMING_VALUE: return TIMING;
			case BASE64_BINARY_VALUE: return BASE64_BINARY;
			case BOOLEAN_VALUE: return BOOLEAN;
			case CODE_VALUE: return CODE;
			case DATE_VALUE: return DATE;
			case DATE_TIME_VALUE: return DATE_TIME;
			case DECIMAL_VALUE: return DECIMAL;
			case ID_VALUE: return ID;
			case INSTANT_VALUE: return INSTANT;
			case INTEGER_VALUE: return INTEGER;
			case OID_VALUE: return OID;
			case POSITIVE_INT_VALUE: return POSITIVE_INT;
			case STRING_VALUE: return STRING;
			case TIME_VALUE: return TIME;
			case UNSIGNED_INT_VALUE: return UNSIGNED_INT;
			case URI_VALUE: return URI;
			case UUID_VALUE: return UUID;
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
	private DataTypeList(int value, String name, String literal) {
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
	
} //DataTypeList
