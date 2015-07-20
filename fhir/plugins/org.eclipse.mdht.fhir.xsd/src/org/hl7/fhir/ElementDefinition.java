/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Captures constraints on each element within the resource, profile, or extension.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getSlicing <em>Slicing</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getShort <em>Short</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getComments <em>Comments</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMin <em>Min</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMax <em>Max</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getNameReference <em>Name Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueBoolean <em>Default Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueInteger <em>Default Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueDecimal <em>Default Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueBase64Binary <em>Default Value Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueInstant <em>Default Value Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueString <em>Default Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueUri <em>Default Value Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueDate <em>Default Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueDateTime <em>Default Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueTime <em>Default Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueCode <em>Default Value Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueOid <em>Default Value Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueUuid <em>Default Value Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueId <em>Default Value Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueUnsignedInt <em>Default Value Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValuePositiveInt <em>Default Value Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueAnnotation <em>Default Value Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueAttachment <em>Default Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueIdentifier <em>Default Value Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueCodeableConcept <em>Default Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueCoding <em>Default Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueQuantity <em>Default Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueRange <em>Default Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValuePeriod <em>Default Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueRatio <em>Default Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueReference <em>Default Value Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueSampledData <em>Default Value Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueSignature <em>Default Value Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueHumanName <em>Default Value Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueAddress <em>Default Value Address</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueContactPoint <em>Default Value Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueTiming <em>Default Value Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getDefaultValueMeta <em>Default Value Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMeaningWhenMissing <em>Meaning When Missing</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedBoolean <em>Fixed Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedInteger <em>Fixed Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedDecimal <em>Fixed Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedBase64Binary <em>Fixed Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedInstant <em>Fixed Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedString <em>Fixed String</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedUri <em>Fixed Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedDate <em>Fixed Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedDateTime <em>Fixed Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedTime <em>Fixed Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedCode <em>Fixed Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedOid <em>Fixed Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedUuid <em>Fixed Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedId <em>Fixed Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedUnsignedInt <em>Fixed Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedPositiveInt <em>Fixed Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedAnnotation <em>Fixed Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedAttachment <em>Fixed Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedIdentifier <em>Fixed Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedCodeableConcept <em>Fixed Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedCoding <em>Fixed Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedQuantity <em>Fixed Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedRange <em>Fixed Range</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedPeriod <em>Fixed Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedRatio <em>Fixed Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedReference <em>Fixed Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedSampledData <em>Fixed Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedSignature <em>Fixed Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedHumanName <em>Fixed Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedAddress <em>Fixed Address</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedContactPoint <em>Fixed Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedTiming <em>Fixed Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getFixedMeta <em>Fixed Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternBoolean <em>Pattern Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternInteger <em>Pattern Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternDecimal <em>Pattern Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternBase64Binary <em>Pattern Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternInstant <em>Pattern Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternString <em>Pattern String</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternUri <em>Pattern Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternDate <em>Pattern Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternDateTime <em>Pattern Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternTime <em>Pattern Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternCode <em>Pattern Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternOid <em>Pattern Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternUuid <em>Pattern Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternId <em>Pattern Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternUnsignedInt <em>Pattern Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternPositiveInt <em>Pattern Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternAnnotation <em>Pattern Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternAttachment <em>Pattern Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternIdentifier <em>Pattern Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternCodeableConcept <em>Pattern Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternCoding <em>Pattern Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternQuantity <em>Pattern Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternRange <em>Pattern Range</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternPeriod <em>Pattern Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternRatio <em>Pattern Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternReference <em>Pattern Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternSampledData <em>Pattern Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternSignature <em>Pattern Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternHumanName <em>Pattern Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternAddress <em>Pattern Address</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternContactPoint <em>Pattern Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternTiming <em>Pattern Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getPatternMeta <em>Pattern Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleBoolean <em>Example Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleInteger <em>Example Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleDecimal <em>Example Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleBase64Binary <em>Example Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleInstant <em>Example Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleString <em>Example String</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleUri <em>Example Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleDate <em>Example Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleDateTime <em>Example Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleTime <em>Example Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleCode <em>Example Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleOid <em>Example Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleUuid <em>Example Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleId <em>Example Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleUnsignedInt <em>Example Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExamplePositiveInt <em>Example Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleAnnotation <em>Example Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleAttachment <em>Example Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleIdentifier <em>Example Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleCodeableConcept <em>Example Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleCoding <em>Example Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleQuantity <em>Example Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleRange <em>Example Range</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExamplePeriod <em>Example Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleRatio <em>Example Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleReference <em>Example Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleSampledData <em>Example Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleSignature <em>Example Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleHumanName <em>Example Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleAddress <em>Example Address</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleContactPoint <em>Example Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleTiming <em>Example Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getExampleMeta <em>Example Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueBoolean <em>Min Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueInteger <em>Min Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueDecimal <em>Min Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueBase64Binary <em>Min Value Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueInstant <em>Min Value Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueString <em>Min Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueUri <em>Min Value Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueDate <em>Min Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueDateTime <em>Min Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueTime <em>Min Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueCode <em>Min Value Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueOid <em>Min Value Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueUuid <em>Min Value Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueId <em>Min Value Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueUnsignedInt <em>Min Value Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValuePositiveInt <em>Min Value Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueAnnotation <em>Min Value Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueAttachment <em>Min Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueIdentifier <em>Min Value Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueCodeableConcept <em>Min Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueCoding <em>Min Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueQuantity <em>Min Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueRange <em>Min Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValuePeriod <em>Min Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueRatio <em>Min Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueReference <em>Min Value Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueSampledData <em>Min Value Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueSignature <em>Min Value Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueHumanName <em>Min Value Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueAddress <em>Min Value Address</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueContactPoint <em>Min Value Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueTiming <em>Min Value Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMinValueMeta <em>Min Value Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueBoolean <em>Max Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueInteger <em>Max Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueDecimal <em>Max Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueBase64Binary <em>Max Value Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueInstant <em>Max Value Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueString <em>Max Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueUri <em>Max Value Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueDate <em>Max Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueDateTime <em>Max Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueTime <em>Max Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueCode <em>Max Value Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueOid <em>Max Value Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueUuid <em>Max Value Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueId <em>Max Value Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueUnsignedInt <em>Max Value Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValuePositiveInt <em>Max Value Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueAnnotation <em>Max Value Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueAttachment <em>Max Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueIdentifier <em>Max Value Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueCodeableConcept <em>Max Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueCoding <em>Max Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueQuantity <em>Max Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueRange <em>Max Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValuePeriod <em>Max Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueRatio <em>Max Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueReference <em>Max Value Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueSampledData <em>Max Value Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueSignature <em>Max Value Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueHumanName <em>Max Value Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueAddress <em>Max Value Address</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueContactPoint <em>Max Value Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueTiming <em>Max Value Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxValueMeta <em>Max Value Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMustSupport <em>Must Support</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getIsModifier <em>Is Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getIsSummary <em>Is Summary</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinition#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getElementDefinition()
 * @model extendedMetaData="name='ElementDefinition' kind='elementOnly'"
 * @generated
 */
public interface ElementDefinition extends Element {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The path identifies the element and is expressed as a "."-separated list of ancestor elements, beginning with the name of the resource or extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Path()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='path' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPath();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PropertyRepresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codes that define how this element is represented in instances, when the deviation varies from the normal case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Representation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='representation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PropertyRepresentation> getRepresentation();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of this element definition (to refer to it from other element definitions using ElementDefinition.nameReference). This is a unique name referring to a specific set of constraints applied to this element. One use of this is to provide a name to different slices of the same element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text to display beside the element indicating its meaning or to use to prompt for the element in a user display or form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Label()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLabel();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that provides the meaning for the element according to a particular terminology.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getCode();

	/**
	 * Returns the value of the '<em><b>Slicing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the element is sliced into a set of alternative definitions (there are multiple definitions on a single element in the base resource). The set of slices is any elements that come after this in the element sequence that have the same path, until a shorter path occurs (the shorter path terminates the set).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slicing</em>' containment reference.
	 * @see #setSlicing(ElementDefinitionSlicing)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Slicing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='slicing' namespace='##targetNamespace'"
	 * @generated
	 */
	ElementDefinitionSlicing getSlicing();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getSlicing <em>Slicing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slicing</em>' containment reference.
	 * @see #getSlicing()
	 * @generated
	 */
	void setSlicing(ElementDefinitionSlicing value);

	/**
	 * Returns the value of the '<em><b>Short</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A concise definition that  is shown in the generated XML format that summarizes profiles (used throughout the specification).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Short</em>' containment reference.
	 * @see #setShort(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Short()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='short' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getShort();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getShort <em>Short</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short</em>' containment reference.
	 * @see #getShort()
	 * @generated
	 */
	void setShort(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a complete explanation of the meaning of the data element for human readability.  For the case of elements derived from existing elements (e.g. constraints), the definition SHALL be consistent with the base definition, but convey the meaning of the element in the particular context of use of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Explanatory notes and implementation guidance about the data element, including notes about how to use the data properly, exceptions to proper use, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference.
	 * @see #setComments(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Comments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comments' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getComments();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getComments <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' containment reference.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element is for traceability of why the element was created and why the constraints exist as they do. This may be used to point to source materials or specifications that drove the structure of this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Requirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirements' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getRequirements();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies additional names by which this element might also be known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Alias()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alias' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getAlias();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum number of times this element SHALL appear in the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Min()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='min' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getMin();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of times this element is permitted to appear in the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Max()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='max' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMax();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ElementDefinitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data type or resource that the value of this element is permitted to be.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ElementDefinitionType> getType();

	/**
	 * Returns the value of the '<em><b>Name Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the name of a slice defined elsewhere in the profile whose constraints should be applied to the current element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Reference</em>' containment reference.
	 * @see #setNameReference(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_NameReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nameReference' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getNameReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getNameReference <em>Name Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Reference</em>' containment reference.
	 * @see #getNameReference()
	 * @generated
	 */
	void setNameReference(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Default Value Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Boolean</em>' containment reference.
	 * @see #setDefaultValueBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getDefaultValueBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueBoolean <em>Default Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Boolean</em>' containment reference.
	 * @see #getDefaultValueBoolean()
	 * @generated
	 */
	void setDefaultValueBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Integer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Integer</em>' containment reference.
	 * @see #setDefaultValueInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getDefaultValueInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueInteger <em>Default Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Integer</em>' containment reference.
	 * @see #getDefaultValueInteger()
	 * @generated
	 */
	void setDefaultValueInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Default Value Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Decimal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Decimal</em>' containment reference.
	 * @see #setDefaultValueDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getDefaultValueDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueDecimal <em>Default Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Decimal</em>' containment reference.
	 * @see #getDefaultValueDecimal()
	 * @generated
	 */
	void setDefaultValueDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Default Value Base64 Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Base64 Binary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Base64 Binary</em>' containment reference.
	 * @see #setDefaultValueBase64Binary(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueBase64Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueBase64Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getDefaultValueBase64Binary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueBase64Binary <em>Default Value Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Base64 Binary</em>' containment reference.
	 * @see #getDefaultValueBase64Binary()
	 * @generated
	 */
	void setDefaultValueBase64Binary(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Default Value Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Instant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Instant</em>' containment reference.
	 * @see #setDefaultValueInstant(Instant)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getDefaultValueInstant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueInstant <em>Default Value Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Instant</em>' containment reference.
	 * @see #getDefaultValueInstant()
	 * @generated
	 */
	void setDefaultValueInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Default Value String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value String</em>' containment reference.
	 * @see #setDefaultValueString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDefaultValueString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueString <em>Default Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value String</em>' containment reference.
	 * @see #getDefaultValueString()
	 * @generated
	 */
	void setDefaultValueString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Default Value Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Uri</em>' containment reference.
	 * @see #setDefaultValueUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getDefaultValueUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueUri <em>Default Value Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Uri</em>' containment reference.
	 * @see #getDefaultValueUri()
	 * @generated
	 */
	void setDefaultValueUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Default Value Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Date</em>' containment reference.
	 * @see #setDefaultValueDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDefaultValueDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueDate <em>Default Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Date</em>' containment reference.
	 * @see #getDefaultValueDate()
	 * @generated
	 */
	void setDefaultValueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Default Value Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Date Time</em>' containment reference.
	 * @see #setDefaultValueDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDefaultValueDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueDateTime <em>Default Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Date Time</em>' containment reference.
	 * @see #getDefaultValueDateTime()
	 * @generated
	 */
	void setDefaultValueDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Default Value Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Time</em>' containment reference.
	 * @see #setDefaultValueTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getDefaultValueTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueTime <em>Default Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Time</em>' containment reference.
	 * @see #getDefaultValueTime()
	 * @generated
	 */
	void setDefaultValueTime(Time value);

	/**
	 * Returns the value of the '<em><b>Default Value Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Code</em>' containment reference.
	 * @see #setDefaultValueCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueCode' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getDefaultValueCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueCode <em>Default Value Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Code</em>' containment reference.
	 * @see #getDefaultValueCode()
	 * @generated
	 */
	void setDefaultValueCode(Code value);

	/**
	 * Returns the value of the '<em><b>Default Value Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Oid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Oid</em>' containment reference.
	 * @see #setDefaultValueOid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueOid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueOid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getDefaultValueOid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueOid <em>Default Value Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Oid</em>' containment reference.
	 * @see #getDefaultValueOid()
	 * @generated
	 */
	void setDefaultValueOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Default Value Uuid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Uuid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Uuid</em>' containment reference.
	 * @see #setDefaultValueUuid(Uuid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueUuid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueUuid' namespace='##targetNamespace'"
	 * @generated
	 */
	Uuid getDefaultValueUuid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueUuid <em>Default Value Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Uuid</em>' containment reference.
	 * @see #getDefaultValueUuid()
	 * @generated
	 */
	void setDefaultValueUuid(Uuid value);

	/**
	 * Returns the value of the '<em><b>Default Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Id</em>' containment reference.
	 * @see #setDefaultValueId(Id)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getDefaultValueId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueId <em>Default Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Id</em>' containment reference.
	 * @see #getDefaultValueId()
	 * @generated
	 */
	void setDefaultValueId(Id value);

	/**
	 * Returns the value of the '<em><b>Default Value Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Unsigned Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Unsigned Int</em>' containment reference.
	 * @see #setDefaultValueUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getDefaultValueUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueUnsignedInt <em>Default Value Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Unsigned Int</em>' containment reference.
	 * @see #getDefaultValueUnsignedInt()
	 * @generated
	 */
	void setDefaultValueUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Default Value Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Positive Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Positive Int</em>' containment reference.
	 * @see #setDefaultValuePositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValuePositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValuePositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getDefaultValuePositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValuePositiveInt <em>Default Value Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Positive Int</em>' containment reference.
	 * @see #getDefaultValuePositiveInt()
	 * @generated
	 */
	void setDefaultValuePositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Default Value Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Annotation</em>' containment reference.
	 * @see #setDefaultValueAnnotation(Annotation)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueAnnotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	Annotation getDefaultValueAnnotation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueAnnotation <em>Default Value Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Annotation</em>' containment reference.
	 * @see #getDefaultValueAnnotation()
	 * @generated
	 */
	void setDefaultValueAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Default Value Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Attachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Attachment</em>' containment reference.
	 * @see #setDefaultValueAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getDefaultValueAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueAttachment <em>Default Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Attachment</em>' containment reference.
	 * @see #getDefaultValueAttachment()
	 * @generated
	 */
	void setDefaultValueAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Default Value Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Identifier</em>' containment reference.
	 * @see #setDefaultValueIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getDefaultValueIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueIdentifier <em>Default Value Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Identifier</em>' containment reference.
	 * @see #getDefaultValueIdentifier()
	 * @generated
	 */
	void setDefaultValueIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Default Value Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Codeable Concept</em>' containment reference.
	 * @see #setDefaultValueCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDefaultValueCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueCodeableConcept <em>Default Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Codeable Concept</em>' containment reference.
	 * @see #getDefaultValueCodeableConcept()
	 * @generated
	 */
	void setDefaultValueCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Default Value Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Coding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Coding</em>' containment reference.
	 * @see #setDefaultValueCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getDefaultValueCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueCoding <em>Default Value Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Coding</em>' containment reference.
	 * @see #getDefaultValueCoding()
	 * @generated
	 */
	void setDefaultValueCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Default Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Quantity</em>' containment reference.
	 * @see #setDefaultValueQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getDefaultValueQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueQuantity <em>Default Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Quantity</em>' containment reference.
	 * @see #getDefaultValueQuantity()
	 * @generated
	 */
	void setDefaultValueQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Default Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Range</em>' containment reference.
	 * @see #setDefaultValueRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getDefaultValueRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueRange <em>Default Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Range</em>' containment reference.
	 * @see #getDefaultValueRange()
	 * @generated
	 */
	void setDefaultValueRange(Range value);

	/**
	 * Returns the value of the '<em><b>Default Value Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Period</em>' containment reference.
	 * @see #setDefaultValuePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValuePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValuePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getDefaultValuePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValuePeriod <em>Default Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Period</em>' containment reference.
	 * @see #getDefaultValuePeriod()
	 * @generated
	 */
	void setDefaultValuePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Default Value Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Ratio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Ratio</em>' containment reference.
	 * @see #setDefaultValueRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getDefaultValueRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueRatio <em>Default Value Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Ratio</em>' containment reference.
	 * @see #getDefaultValueRatio()
	 * @generated
	 */
	void setDefaultValueRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Default Value Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Reference</em>' containment reference.
	 * @see #setDefaultValueReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDefaultValueReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueReference <em>Default Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Reference</em>' containment reference.
	 * @see #getDefaultValueReference()
	 * @generated
	 */
	void setDefaultValueReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Default Value Sampled Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Sampled Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Sampled Data</em>' containment reference.
	 * @see #setDefaultValueSampledData(SampledData)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueSampledData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueSampledData' namespace='##targetNamespace'"
	 * @generated
	 */
	SampledData getDefaultValueSampledData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueSampledData <em>Default Value Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Sampled Data</em>' containment reference.
	 * @see #getDefaultValueSampledData()
	 * @generated
	 */
	void setDefaultValueSampledData(SampledData value);

	/**
	 * Returns the value of the '<em><b>Default Value Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Signature</em>' containment reference.
	 * @see #setDefaultValueSignature(Signature)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueSignature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	Signature getDefaultValueSignature();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueSignature <em>Default Value Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Signature</em>' containment reference.
	 * @see #getDefaultValueSignature()
	 * @generated
	 */
	void setDefaultValueSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Default Value Human Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Human Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Human Name</em>' containment reference.
	 * @see #setDefaultValueHumanName(HumanName)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueHumanName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueHumanName' namespace='##targetNamespace'"
	 * @generated
	 */
	HumanName getDefaultValueHumanName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueHumanName <em>Default Value Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Human Name</em>' containment reference.
	 * @see #getDefaultValueHumanName()
	 * @generated
	 */
	void setDefaultValueHumanName(HumanName value);

	/**
	 * Returns the value of the '<em><b>Default Value Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Address</em>' containment reference.
	 * @see #setDefaultValueAddress(Address)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getDefaultValueAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueAddress <em>Default Value Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Address</em>' containment reference.
	 * @see #getDefaultValueAddress()
	 * @generated
	 */
	void setDefaultValueAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Default Value Contact Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Contact Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Contact Point</em>' containment reference.
	 * @see #setDefaultValueContactPoint(ContactPoint)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueContactPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueContactPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPoint getDefaultValueContactPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueContactPoint <em>Default Value Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Contact Point</em>' containment reference.
	 * @see #getDefaultValueContactPoint()
	 * @generated
	 */
	void setDefaultValueContactPoint(ContactPoint value);

	/**
	 * Returns the value of the '<em><b>Default Value Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Timing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Timing</em>' containment reference.
	 * @see #setDefaultValueTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getDefaultValueTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueTiming <em>Default Value Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Timing</em>' containment reference.
	 * @see #getDefaultValueTiming()
	 * @generated
	 */
	void setDefaultValueTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Default Value Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Meta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Meta</em>' containment reference.
	 * @see #setDefaultValueMeta(Meta)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_DefaultValueMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValueMeta' namespace='##targetNamespace'"
	 * @generated
	 */
	Meta getDefaultValueMeta();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getDefaultValueMeta <em>Default Value Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Meta</em>' containment reference.
	 * @see #getDefaultValueMeta()
	 * @generated
	 */
	void setDefaultValueMeta(Meta value);

	/**
	 * Returns the value of the '<em><b>Meaning When Missing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Implicit meaning that is to be understood when this element is missing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meaning When Missing</em>' containment reference.
	 * @see #setMeaningWhenMissing(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MeaningWhenMissing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='meaningWhenMissing' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMeaningWhenMissing();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMeaningWhenMissing <em>Meaning When Missing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meaning When Missing</em>' containment reference.
	 * @see #getMeaningWhenMissing()
	 * @generated
	 */
	void setMeaningWhenMissing(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Fixed Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Boolean</em>' containment reference.
	 * @see #setFixedBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getFixedBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedBoolean <em>Fixed Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Boolean</em>' containment reference.
	 * @see #getFixedBoolean()
	 * @generated
	 */
	void setFixedBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Fixed Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Integer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Integer</em>' containment reference.
	 * @see #setFixedInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getFixedInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedInteger <em>Fixed Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Integer</em>' containment reference.
	 * @see #getFixedInteger()
	 * @generated
	 */
	void setFixedInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Fixed Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Decimal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Decimal</em>' containment reference.
	 * @see #setFixedDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getFixedDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedDecimal <em>Fixed Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Decimal</em>' containment reference.
	 * @see #getFixedDecimal()
	 * @generated
	 */
	void setFixedDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Fixed Base64 Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Base64 Binary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Base64 Binary</em>' containment reference.
	 * @see #setFixedBase64Binary(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedBase64Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedBase64Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getFixedBase64Binary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedBase64Binary <em>Fixed Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Base64 Binary</em>' containment reference.
	 * @see #getFixedBase64Binary()
	 * @generated
	 */
	void setFixedBase64Binary(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Fixed Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Instant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Instant</em>' containment reference.
	 * @see #setFixedInstant(Instant)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getFixedInstant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedInstant <em>Fixed Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Instant</em>' containment reference.
	 * @see #getFixedInstant()
	 * @generated
	 */
	void setFixedInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Fixed String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed String</em>' containment reference.
	 * @see #setFixedString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getFixedString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedString <em>Fixed String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed String</em>' containment reference.
	 * @see #getFixedString()
	 * @generated
	 */
	void setFixedString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Fixed Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Uri</em>' containment reference.
	 * @see #setFixedUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getFixedUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedUri <em>Fixed Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Uri</em>' containment reference.
	 * @see #getFixedUri()
	 * @generated
	 */
	void setFixedUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Fixed Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Date</em>' containment reference.
	 * @see #setFixedDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getFixedDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedDate <em>Fixed Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Date</em>' containment reference.
	 * @see #getFixedDate()
	 * @generated
	 */
	void setFixedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Fixed Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Date Time</em>' containment reference.
	 * @see #setFixedDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getFixedDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedDateTime <em>Fixed Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Date Time</em>' containment reference.
	 * @see #getFixedDateTime()
	 * @generated
	 */
	void setFixedDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Fixed Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Time</em>' containment reference.
	 * @see #setFixedTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getFixedTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedTime <em>Fixed Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Time</em>' containment reference.
	 * @see #getFixedTime()
	 * @generated
	 */
	void setFixedTime(Time value);

	/**
	 * Returns the value of the '<em><b>Fixed Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Code</em>' containment reference.
	 * @see #setFixedCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedCode' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getFixedCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedCode <em>Fixed Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Code</em>' containment reference.
	 * @see #getFixedCode()
	 * @generated
	 */
	void setFixedCode(Code value);

	/**
	 * Returns the value of the '<em><b>Fixed Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Oid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Oid</em>' containment reference.
	 * @see #setFixedOid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedOid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedOid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getFixedOid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedOid <em>Fixed Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Oid</em>' containment reference.
	 * @see #getFixedOid()
	 * @generated
	 */
	void setFixedOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Fixed Uuid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Uuid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Uuid</em>' containment reference.
	 * @see #setFixedUuid(Uuid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedUuid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedUuid' namespace='##targetNamespace'"
	 * @generated
	 */
	Uuid getFixedUuid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedUuid <em>Fixed Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Uuid</em>' containment reference.
	 * @see #getFixedUuid()
	 * @generated
	 */
	void setFixedUuid(Uuid value);

	/**
	 * Returns the value of the '<em><b>Fixed Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Id</em>' containment reference.
	 * @see #setFixedId(Id)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getFixedId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedId <em>Fixed Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Id</em>' containment reference.
	 * @see #getFixedId()
	 * @generated
	 */
	void setFixedId(Id value);

	/**
	 * Returns the value of the '<em><b>Fixed Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Unsigned Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Unsigned Int</em>' containment reference.
	 * @see #setFixedUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getFixedUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedUnsignedInt <em>Fixed Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Unsigned Int</em>' containment reference.
	 * @see #getFixedUnsignedInt()
	 * @generated
	 */
	void setFixedUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Fixed Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Positive Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Positive Int</em>' containment reference.
	 * @see #setFixedPositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedPositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedPositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getFixedPositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedPositiveInt <em>Fixed Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Positive Int</em>' containment reference.
	 * @see #getFixedPositiveInt()
	 * @generated
	 */
	void setFixedPositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Fixed Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Annotation</em>' containment reference.
	 * @see #setFixedAnnotation(Annotation)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedAnnotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	Annotation getFixedAnnotation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedAnnotation <em>Fixed Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Annotation</em>' containment reference.
	 * @see #getFixedAnnotation()
	 * @generated
	 */
	void setFixedAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Fixed Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Attachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Attachment</em>' containment reference.
	 * @see #setFixedAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getFixedAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedAttachment <em>Fixed Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Attachment</em>' containment reference.
	 * @see #getFixedAttachment()
	 * @generated
	 */
	void setFixedAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Fixed Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Identifier</em>' containment reference.
	 * @see #setFixedIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getFixedIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedIdentifier <em>Fixed Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Identifier</em>' containment reference.
	 * @see #getFixedIdentifier()
	 * @generated
	 */
	void setFixedIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Fixed Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Codeable Concept</em>' containment reference.
	 * @see #setFixedCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFixedCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedCodeableConcept <em>Fixed Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Codeable Concept</em>' containment reference.
	 * @see #getFixedCodeableConcept()
	 * @generated
	 */
	void setFixedCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Fixed Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Coding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Coding</em>' containment reference.
	 * @see #setFixedCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getFixedCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedCoding <em>Fixed Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Coding</em>' containment reference.
	 * @see #getFixedCoding()
	 * @generated
	 */
	void setFixedCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Fixed Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Quantity</em>' containment reference.
	 * @see #setFixedQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getFixedQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedQuantity <em>Fixed Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Quantity</em>' containment reference.
	 * @see #getFixedQuantity()
	 * @generated
	 */
	void setFixedQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Fixed Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Range</em>' containment reference.
	 * @see #setFixedRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getFixedRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedRange <em>Fixed Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Range</em>' containment reference.
	 * @see #getFixedRange()
	 * @generated
	 */
	void setFixedRange(Range value);

	/**
	 * Returns the value of the '<em><b>Fixed Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Period</em>' containment reference.
	 * @see #setFixedPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getFixedPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedPeriod <em>Fixed Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Period</em>' containment reference.
	 * @see #getFixedPeriod()
	 * @generated
	 */
	void setFixedPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Fixed Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Ratio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Ratio</em>' containment reference.
	 * @see #setFixedRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getFixedRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedRatio <em>Fixed Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Ratio</em>' containment reference.
	 * @see #getFixedRatio()
	 * @generated
	 */
	void setFixedRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Fixed Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Reference</em>' containment reference.
	 * @see #setFixedReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getFixedReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedReference <em>Fixed Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Reference</em>' containment reference.
	 * @see #getFixedReference()
	 * @generated
	 */
	void setFixedReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Fixed Sampled Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Sampled Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Sampled Data</em>' containment reference.
	 * @see #setFixedSampledData(SampledData)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedSampledData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedSampledData' namespace='##targetNamespace'"
	 * @generated
	 */
	SampledData getFixedSampledData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedSampledData <em>Fixed Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Sampled Data</em>' containment reference.
	 * @see #getFixedSampledData()
	 * @generated
	 */
	void setFixedSampledData(SampledData value);

	/**
	 * Returns the value of the '<em><b>Fixed Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Signature</em>' containment reference.
	 * @see #setFixedSignature(Signature)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedSignature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	Signature getFixedSignature();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedSignature <em>Fixed Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Signature</em>' containment reference.
	 * @see #getFixedSignature()
	 * @generated
	 */
	void setFixedSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Fixed Human Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Human Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Human Name</em>' containment reference.
	 * @see #setFixedHumanName(HumanName)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedHumanName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedHumanName' namespace='##targetNamespace'"
	 * @generated
	 */
	HumanName getFixedHumanName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedHumanName <em>Fixed Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Human Name</em>' containment reference.
	 * @see #getFixedHumanName()
	 * @generated
	 */
	void setFixedHumanName(HumanName value);

	/**
	 * Returns the value of the '<em><b>Fixed Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Address</em>' containment reference.
	 * @see #setFixedAddress(Address)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getFixedAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedAddress <em>Fixed Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Address</em>' containment reference.
	 * @see #getFixedAddress()
	 * @generated
	 */
	void setFixedAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Fixed Contact Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Contact Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Contact Point</em>' containment reference.
	 * @see #setFixedContactPoint(ContactPoint)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedContactPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedContactPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPoint getFixedContactPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedContactPoint <em>Fixed Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Contact Point</em>' containment reference.
	 * @see #getFixedContactPoint()
	 * @generated
	 */
	void setFixedContactPoint(ContactPoint value);

	/**
	 * Returns the value of the '<em><b>Fixed Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Timing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Timing</em>' containment reference.
	 * @see #setFixedTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getFixedTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedTiming <em>Fixed Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Timing</em>' containment reference.
	 * @see #getFixedTiming()
	 * @generated
	 */
	void setFixedTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Fixed Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Meta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Meta</em>' containment reference.
	 * @see #setFixedMeta(Meta)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_FixedMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedMeta' namespace='##targetNamespace'"
	 * @generated
	 */
	Meta getFixedMeta();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getFixedMeta <em>Fixed Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Meta</em>' containment reference.
	 * @see #getFixedMeta()
	 * @generated
	 */
	void setFixedMeta(Meta value);

	/**
	 * Returns the value of the '<em><b>Pattern Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Boolean</em>' containment reference.
	 * @see #setPatternBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getPatternBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternBoolean <em>Pattern Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Boolean</em>' containment reference.
	 * @see #getPatternBoolean()
	 * @generated
	 */
	void setPatternBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Pattern Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Integer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Integer</em>' containment reference.
	 * @see #setPatternInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getPatternInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternInteger <em>Pattern Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Integer</em>' containment reference.
	 * @see #getPatternInteger()
	 * @generated
	 */
	void setPatternInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Pattern Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Decimal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Decimal</em>' containment reference.
	 * @see #setPatternDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getPatternDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternDecimal <em>Pattern Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Decimal</em>' containment reference.
	 * @see #getPatternDecimal()
	 * @generated
	 */
	void setPatternDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Pattern Base64 Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Base64 Binary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Base64 Binary</em>' containment reference.
	 * @see #setPatternBase64Binary(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternBase64Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternBase64Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getPatternBase64Binary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternBase64Binary <em>Pattern Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Base64 Binary</em>' containment reference.
	 * @see #getPatternBase64Binary()
	 * @generated
	 */
	void setPatternBase64Binary(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Pattern Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Instant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Instant</em>' containment reference.
	 * @see #setPatternInstant(Instant)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getPatternInstant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternInstant <em>Pattern Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Instant</em>' containment reference.
	 * @see #getPatternInstant()
	 * @generated
	 */
	void setPatternInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Pattern String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern String</em>' containment reference.
	 * @see #setPatternString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPatternString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternString <em>Pattern String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern String</em>' containment reference.
	 * @see #getPatternString()
	 * @generated
	 */
	void setPatternString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Pattern Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Uri</em>' containment reference.
	 * @see #setPatternUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getPatternUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternUri <em>Pattern Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Uri</em>' containment reference.
	 * @see #getPatternUri()
	 * @generated
	 */
	void setPatternUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Pattern Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Date</em>' containment reference.
	 * @see #setPatternDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getPatternDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternDate <em>Pattern Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Date</em>' containment reference.
	 * @see #getPatternDate()
	 * @generated
	 */
	void setPatternDate(Date value);

	/**
	 * Returns the value of the '<em><b>Pattern Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Date Time</em>' containment reference.
	 * @see #setPatternDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getPatternDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternDateTime <em>Pattern Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Date Time</em>' containment reference.
	 * @see #getPatternDateTime()
	 * @generated
	 */
	void setPatternDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Pattern Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Time</em>' containment reference.
	 * @see #setPatternTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getPatternTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternTime <em>Pattern Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Time</em>' containment reference.
	 * @see #getPatternTime()
	 * @generated
	 */
	void setPatternTime(Time value);

	/**
	 * Returns the value of the '<em><b>Pattern Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Code</em>' containment reference.
	 * @see #setPatternCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternCode' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getPatternCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternCode <em>Pattern Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Code</em>' containment reference.
	 * @see #getPatternCode()
	 * @generated
	 */
	void setPatternCode(Code value);

	/**
	 * Returns the value of the '<em><b>Pattern Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Oid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Oid</em>' containment reference.
	 * @see #setPatternOid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternOid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternOid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getPatternOid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternOid <em>Pattern Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Oid</em>' containment reference.
	 * @see #getPatternOid()
	 * @generated
	 */
	void setPatternOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Pattern Uuid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Uuid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Uuid</em>' containment reference.
	 * @see #setPatternUuid(Uuid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternUuid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternUuid' namespace='##targetNamespace'"
	 * @generated
	 */
	Uuid getPatternUuid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternUuid <em>Pattern Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Uuid</em>' containment reference.
	 * @see #getPatternUuid()
	 * @generated
	 */
	void setPatternUuid(Uuid value);

	/**
	 * Returns the value of the '<em><b>Pattern Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Id</em>' containment reference.
	 * @see #setPatternId(Id)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getPatternId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternId <em>Pattern Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Id</em>' containment reference.
	 * @see #getPatternId()
	 * @generated
	 */
	void setPatternId(Id value);

	/**
	 * Returns the value of the '<em><b>Pattern Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Unsigned Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Unsigned Int</em>' containment reference.
	 * @see #setPatternUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getPatternUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternUnsignedInt <em>Pattern Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Unsigned Int</em>' containment reference.
	 * @see #getPatternUnsignedInt()
	 * @generated
	 */
	void setPatternUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Pattern Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Positive Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Positive Int</em>' containment reference.
	 * @see #setPatternPositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternPositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternPositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getPatternPositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternPositiveInt <em>Pattern Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Positive Int</em>' containment reference.
	 * @see #getPatternPositiveInt()
	 * @generated
	 */
	void setPatternPositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Pattern Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Annotation</em>' containment reference.
	 * @see #setPatternAnnotation(Annotation)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternAnnotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	Annotation getPatternAnnotation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternAnnotation <em>Pattern Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Annotation</em>' containment reference.
	 * @see #getPatternAnnotation()
	 * @generated
	 */
	void setPatternAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Pattern Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Attachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Attachment</em>' containment reference.
	 * @see #setPatternAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getPatternAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternAttachment <em>Pattern Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Attachment</em>' containment reference.
	 * @see #getPatternAttachment()
	 * @generated
	 */
	void setPatternAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Pattern Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Identifier</em>' containment reference.
	 * @see #setPatternIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getPatternIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternIdentifier <em>Pattern Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Identifier</em>' containment reference.
	 * @see #getPatternIdentifier()
	 * @generated
	 */
	void setPatternIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Pattern Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Codeable Concept</em>' containment reference.
	 * @see #setPatternCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPatternCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternCodeableConcept <em>Pattern Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Codeable Concept</em>' containment reference.
	 * @see #getPatternCodeableConcept()
	 * @generated
	 */
	void setPatternCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Pattern Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Coding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Coding</em>' containment reference.
	 * @see #setPatternCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getPatternCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternCoding <em>Pattern Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Coding</em>' containment reference.
	 * @see #getPatternCoding()
	 * @generated
	 */
	void setPatternCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Pattern Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Quantity</em>' containment reference.
	 * @see #setPatternQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getPatternQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternQuantity <em>Pattern Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Quantity</em>' containment reference.
	 * @see #getPatternQuantity()
	 * @generated
	 */
	void setPatternQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Pattern Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Range</em>' containment reference.
	 * @see #setPatternRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getPatternRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternRange <em>Pattern Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Range</em>' containment reference.
	 * @see #getPatternRange()
	 * @generated
	 */
	void setPatternRange(Range value);

	/**
	 * Returns the value of the '<em><b>Pattern Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Period</em>' containment reference.
	 * @see #setPatternPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPatternPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternPeriod <em>Pattern Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Period</em>' containment reference.
	 * @see #getPatternPeriod()
	 * @generated
	 */
	void setPatternPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Pattern Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Ratio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Ratio</em>' containment reference.
	 * @see #setPatternRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getPatternRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternRatio <em>Pattern Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Ratio</em>' containment reference.
	 * @see #getPatternRatio()
	 * @generated
	 */
	void setPatternRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Pattern Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Reference</em>' containment reference.
	 * @see #setPatternReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatternReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternReference <em>Pattern Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Reference</em>' containment reference.
	 * @see #getPatternReference()
	 * @generated
	 */
	void setPatternReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Pattern Sampled Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Sampled Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Sampled Data</em>' containment reference.
	 * @see #setPatternSampledData(SampledData)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternSampledData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternSampledData' namespace='##targetNamespace'"
	 * @generated
	 */
	SampledData getPatternSampledData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternSampledData <em>Pattern Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Sampled Data</em>' containment reference.
	 * @see #getPatternSampledData()
	 * @generated
	 */
	void setPatternSampledData(SampledData value);

	/**
	 * Returns the value of the '<em><b>Pattern Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Signature</em>' containment reference.
	 * @see #setPatternSignature(Signature)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternSignature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	Signature getPatternSignature();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternSignature <em>Pattern Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Signature</em>' containment reference.
	 * @see #getPatternSignature()
	 * @generated
	 */
	void setPatternSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Pattern Human Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Human Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Human Name</em>' containment reference.
	 * @see #setPatternHumanName(HumanName)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternHumanName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternHumanName' namespace='##targetNamespace'"
	 * @generated
	 */
	HumanName getPatternHumanName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternHumanName <em>Pattern Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Human Name</em>' containment reference.
	 * @see #getPatternHumanName()
	 * @generated
	 */
	void setPatternHumanName(HumanName value);

	/**
	 * Returns the value of the '<em><b>Pattern Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Address</em>' containment reference.
	 * @see #setPatternAddress(Address)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getPatternAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternAddress <em>Pattern Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Address</em>' containment reference.
	 * @see #getPatternAddress()
	 * @generated
	 */
	void setPatternAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Pattern Contact Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Contact Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Contact Point</em>' containment reference.
	 * @see #setPatternContactPoint(ContactPoint)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternContactPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternContactPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPoint getPatternContactPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternContactPoint <em>Pattern Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Contact Point</em>' containment reference.
	 * @see #getPatternContactPoint()
	 * @generated
	 */
	void setPatternContactPoint(ContactPoint value);

	/**
	 * Returns the value of the '<em><b>Pattern Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Timing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Timing</em>' containment reference.
	 * @see #setPatternTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getPatternTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternTiming <em>Pattern Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Timing</em>' containment reference.
	 * @see #getPatternTiming()
	 * @generated
	 */
	void setPatternTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Pattern Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Meta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Meta</em>' containment reference.
	 * @see #setPatternMeta(Meta)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_PatternMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patternMeta' namespace='##targetNamespace'"
	 * @generated
	 */
	Meta getPatternMeta();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getPatternMeta <em>Pattern Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Meta</em>' containment reference.
	 * @see #getPatternMeta()
	 * @generated
	 */
	void setPatternMeta(Meta value);

	/**
	 * Returns the value of the '<em><b>Example Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Boolean</em>' containment reference.
	 * @see #setExampleBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getExampleBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleBoolean <em>Example Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Boolean</em>' containment reference.
	 * @see #getExampleBoolean()
	 * @generated
	 */
	void setExampleBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Example Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Integer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Integer</em>' containment reference.
	 * @see #setExampleInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getExampleInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleInteger <em>Example Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Integer</em>' containment reference.
	 * @see #getExampleInteger()
	 * @generated
	 */
	void setExampleInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Example Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Decimal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Decimal</em>' containment reference.
	 * @see #setExampleDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getExampleDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleDecimal <em>Example Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Decimal</em>' containment reference.
	 * @see #getExampleDecimal()
	 * @generated
	 */
	void setExampleDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Example Base64 Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Base64 Binary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Base64 Binary</em>' containment reference.
	 * @see #setExampleBase64Binary(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleBase64Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleBase64Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getExampleBase64Binary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleBase64Binary <em>Example Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Base64 Binary</em>' containment reference.
	 * @see #getExampleBase64Binary()
	 * @generated
	 */
	void setExampleBase64Binary(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Example Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Instant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Instant</em>' containment reference.
	 * @see #setExampleInstant(Instant)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getExampleInstant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleInstant <em>Example Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Instant</em>' containment reference.
	 * @see #getExampleInstant()
	 * @generated
	 */
	void setExampleInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Example String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example String</em>' containment reference.
	 * @see #setExampleString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getExampleString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleString <em>Example String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example String</em>' containment reference.
	 * @see #getExampleString()
	 * @generated
	 */
	void setExampleString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Example Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Uri</em>' containment reference.
	 * @see #setExampleUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getExampleUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleUri <em>Example Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Uri</em>' containment reference.
	 * @see #getExampleUri()
	 * @generated
	 */
	void setExampleUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Example Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Date</em>' containment reference.
	 * @see #setExampleDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getExampleDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleDate <em>Example Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Date</em>' containment reference.
	 * @see #getExampleDate()
	 * @generated
	 */
	void setExampleDate(Date value);

	/**
	 * Returns the value of the '<em><b>Example Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Date Time</em>' containment reference.
	 * @see #setExampleDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getExampleDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleDateTime <em>Example Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Date Time</em>' containment reference.
	 * @see #getExampleDateTime()
	 * @generated
	 */
	void setExampleDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Example Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Time</em>' containment reference.
	 * @see #setExampleTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getExampleTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleTime <em>Example Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Time</em>' containment reference.
	 * @see #getExampleTime()
	 * @generated
	 */
	void setExampleTime(Time value);

	/**
	 * Returns the value of the '<em><b>Example Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Code</em>' containment reference.
	 * @see #setExampleCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleCode' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getExampleCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleCode <em>Example Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Code</em>' containment reference.
	 * @see #getExampleCode()
	 * @generated
	 */
	void setExampleCode(Code value);

	/**
	 * Returns the value of the '<em><b>Example Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Oid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Oid</em>' containment reference.
	 * @see #setExampleOid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleOid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleOid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getExampleOid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleOid <em>Example Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Oid</em>' containment reference.
	 * @see #getExampleOid()
	 * @generated
	 */
	void setExampleOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Example Uuid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Uuid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Uuid</em>' containment reference.
	 * @see #setExampleUuid(Uuid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleUuid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleUuid' namespace='##targetNamespace'"
	 * @generated
	 */
	Uuid getExampleUuid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleUuid <em>Example Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Uuid</em>' containment reference.
	 * @see #getExampleUuid()
	 * @generated
	 */
	void setExampleUuid(Uuid value);

	/**
	 * Returns the value of the '<em><b>Example Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Id</em>' containment reference.
	 * @see #setExampleId(Id)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getExampleId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleId <em>Example Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Id</em>' containment reference.
	 * @see #getExampleId()
	 * @generated
	 */
	void setExampleId(Id value);

	/**
	 * Returns the value of the '<em><b>Example Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Unsigned Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Unsigned Int</em>' containment reference.
	 * @see #setExampleUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getExampleUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleUnsignedInt <em>Example Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Unsigned Int</em>' containment reference.
	 * @see #getExampleUnsignedInt()
	 * @generated
	 */
	void setExampleUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Example Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Positive Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Positive Int</em>' containment reference.
	 * @see #setExamplePositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExamplePositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='examplePositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getExamplePositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExamplePositiveInt <em>Example Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Positive Int</em>' containment reference.
	 * @see #getExamplePositiveInt()
	 * @generated
	 */
	void setExamplePositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Example Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Annotation</em>' containment reference.
	 * @see #setExampleAnnotation(Annotation)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleAnnotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	Annotation getExampleAnnotation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleAnnotation <em>Example Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Annotation</em>' containment reference.
	 * @see #getExampleAnnotation()
	 * @generated
	 */
	void setExampleAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Example Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Attachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Attachment</em>' containment reference.
	 * @see #setExampleAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getExampleAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleAttachment <em>Example Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Attachment</em>' containment reference.
	 * @see #getExampleAttachment()
	 * @generated
	 */
	void setExampleAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Example Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Identifier</em>' containment reference.
	 * @see #setExampleIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getExampleIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleIdentifier <em>Example Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Identifier</em>' containment reference.
	 * @see #getExampleIdentifier()
	 * @generated
	 */
	void setExampleIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Example Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Codeable Concept</em>' containment reference.
	 * @see #setExampleCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getExampleCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleCodeableConcept <em>Example Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Codeable Concept</em>' containment reference.
	 * @see #getExampleCodeableConcept()
	 * @generated
	 */
	void setExampleCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Example Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Coding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Coding</em>' containment reference.
	 * @see #setExampleCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getExampleCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleCoding <em>Example Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Coding</em>' containment reference.
	 * @see #getExampleCoding()
	 * @generated
	 */
	void setExampleCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Example Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Quantity</em>' containment reference.
	 * @see #setExampleQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getExampleQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleQuantity <em>Example Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Quantity</em>' containment reference.
	 * @see #getExampleQuantity()
	 * @generated
	 */
	void setExampleQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Example Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Range</em>' containment reference.
	 * @see #setExampleRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getExampleRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleRange <em>Example Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Range</em>' containment reference.
	 * @see #getExampleRange()
	 * @generated
	 */
	void setExampleRange(Range value);

	/**
	 * Returns the value of the '<em><b>Example Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Period</em>' containment reference.
	 * @see #setExamplePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExamplePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='examplePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getExamplePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExamplePeriod <em>Example Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Period</em>' containment reference.
	 * @see #getExamplePeriod()
	 * @generated
	 */
	void setExamplePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Example Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Ratio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Ratio</em>' containment reference.
	 * @see #setExampleRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getExampleRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleRatio <em>Example Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Ratio</em>' containment reference.
	 * @see #getExampleRatio()
	 * @generated
	 */
	void setExampleRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Example Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Reference</em>' containment reference.
	 * @see #setExampleReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getExampleReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleReference <em>Example Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Reference</em>' containment reference.
	 * @see #getExampleReference()
	 * @generated
	 */
	void setExampleReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Example Sampled Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Sampled Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Sampled Data</em>' containment reference.
	 * @see #setExampleSampledData(SampledData)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleSampledData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleSampledData' namespace='##targetNamespace'"
	 * @generated
	 */
	SampledData getExampleSampledData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleSampledData <em>Example Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Sampled Data</em>' containment reference.
	 * @see #getExampleSampledData()
	 * @generated
	 */
	void setExampleSampledData(SampledData value);

	/**
	 * Returns the value of the '<em><b>Example Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Signature</em>' containment reference.
	 * @see #setExampleSignature(Signature)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleSignature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	Signature getExampleSignature();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleSignature <em>Example Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Signature</em>' containment reference.
	 * @see #getExampleSignature()
	 * @generated
	 */
	void setExampleSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Example Human Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Human Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Human Name</em>' containment reference.
	 * @see #setExampleHumanName(HumanName)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleHumanName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleHumanName' namespace='##targetNamespace'"
	 * @generated
	 */
	HumanName getExampleHumanName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleHumanName <em>Example Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Human Name</em>' containment reference.
	 * @see #getExampleHumanName()
	 * @generated
	 */
	void setExampleHumanName(HumanName value);

	/**
	 * Returns the value of the '<em><b>Example Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Address</em>' containment reference.
	 * @see #setExampleAddress(Address)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getExampleAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleAddress <em>Example Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Address</em>' containment reference.
	 * @see #getExampleAddress()
	 * @generated
	 */
	void setExampleAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Example Contact Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Contact Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Contact Point</em>' containment reference.
	 * @see #setExampleContactPoint(ContactPoint)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleContactPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleContactPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPoint getExampleContactPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleContactPoint <em>Example Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Contact Point</em>' containment reference.
	 * @see #getExampleContactPoint()
	 * @generated
	 */
	void setExampleContactPoint(ContactPoint value);

	/**
	 * Returns the value of the '<em><b>Example Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Timing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Timing</em>' containment reference.
	 * @see #setExampleTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getExampleTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleTiming <em>Example Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Timing</em>' containment reference.
	 * @see #getExampleTiming()
	 * @generated
	 */
	void setExampleTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Example Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Meta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Meta</em>' containment reference.
	 * @see #setExampleMeta(Meta)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_ExampleMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleMeta' namespace='##targetNamespace'"
	 * @generated
	 */
	Meta getExampleMeta();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getExampleMeta <em>Example Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Meta</em>' containment reference.
	 * @see #getExampleMeta()
	 * @generated
	 */
	void setExampleMeta(Meta value);

	/**
	 * Returns the value of the '<em><b>Min Value Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Boolean</em>' containment reference.
	 * @see #setMinValueBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getMinValueBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueBoolean <em>Min Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Boolean</em>' containment reference.
	 * @see #getMinValueBoolean()
	 * @generated
	 */
	void setMinValueBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Min Value Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Integer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Integer</em>' containment reference.
	 * @see #setMinValueInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getMinValueInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueInteger <em>Min Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Integer</em>' containment reference.
	 * @see #getMinValueInteger()
	 * @generated
	 */
	void setMinValueInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Min Value Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Decimal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Decimal</em>' containment reference.
	 * @see #setMinValueDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getMinValueDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueDecimal <em>Min Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Decimal</em>' containment reference.
	 * @see #getMinValueDecimal()
	 * @generated
	 */
	void setMinValueDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Min Value Base64 Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Base64 Binary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Base64 Binary</em>' containment reference.
	 * @see #setMinValueBase64Binary(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueBase64Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueBase64Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getMinValueBase64Binary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueBase64Binary <em>Min Value Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Base64 Binary</em>' containment reference.
	 * @see #getMinValueBase64Binary()
	 * @generated
	 */
	void setMinValueBase64Binary(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Min Value Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Instant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Instant</em>' containment reference.
	 * @see #setMinValueInstant(Instant)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getMinValueInstant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueInstant <em>Min Value Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Instant</em>' containment reference.
	 * @see #getMinValueInstant()
	 * @generated
	 */
	void setMinValueInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Min Value String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value String</em>' containment reference.
	 * @see #setMinValueString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMinValueString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueString <em>Min Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value String</em>' containment reference.
	 * @see #getMinValueString()
	 * @generated
	 */
	void setMinValueString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Min Value Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Uri</em>' containment reference.
	 * @see #setMinValueUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getMinValueUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueUri <em>Min Value Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Uri</em>' containment reference.
	 * @see #getMinValueUri()
	 * @generated
	 */
	void setMinValueUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Min Value Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Date</em>' containment reference.
	 * @see #setMinValueDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getMinValueDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueDate <em>Min Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Date</em>' containment reference.
	 * @see #getMinValueDate()
	 * @generated
	 */
	void setMinValueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Min Value Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Date Time</em>' containment reference.
	 * @see #setMinValueDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getMinValueDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueDateTime <em>Min Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Date Time</em>' containment reference.
	 * @see #getMinValueDateTime()
	 * @generated
	 */
	void setMinValueDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Min Value Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Time</em>' containment reference.
	 * @see #setMinValueTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getMinValueTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueTime <em>Min Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Time</em>' containment reference.
	 * @see #getMinValueTime()
	 * @generated
	 */
	void setMinValueTime(Time value);

	/**
	 * Returns the value of the '<em><b>Min Value Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Code</em>' containment reference.
	 * @see #setMinValueCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueCode' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getMinValueCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueCode <em>Min Value Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Code</em>' containment reference.
	 * @see #getMinValueCode()
	 * @generated
	 */
	void setMinValueCode(Code value);

	/**
	 * Returns the value of the '<em><b>Min Value Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Oid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Oid</em>' containment reference.
	 * @see #setMinValueOid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueOid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueOid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getMinValueOid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueOid <em>Min Value Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Oid</em>' containment reference.
	 * @see #getMinValueOid()
	 * @generated
	 */
	void setMinValueOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Min Value Uuid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Uuid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Uuid</em>' containment reference.
	 * @see #setMinValueUuid(Uuid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueUuid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueUuid' namespace='##targetNamespace'"
	 * @generated
	 */
	Uuid getMinValueUuid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueUuid <em>Min Value Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Uuid</em>' containment reference.
	 * @see #getMinValueUuid()
	 * @generated
	 */
	void setMinValueUuid(Uuid value);

	/**
	 * Returns the value of the '<em><b>Min Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Id</em>' containment reference.
	 * @see #setMinValueId(Id)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getMinValueId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueId <em>Min Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Id</em>' containment reference.
	 * @see #getMinValueId()
	 * @generated
	 */
	void setMinValueId(Id value);

	/**
	 * Returns the value of the '<em><b>Min Value Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Unsigned Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Unsigned Int</em>' containment reference.
	 * @see #setMinValueUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getMinValueUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueUnsignedInt <em>Min Value Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Unsigned Int</em>' containment reference.
	 * @see #getMinValueUnsignedInt()
	 * @generated
	 */
	void setMinValueUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Min Value Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Positive Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Positive Int</em>' containment reference.
	 * @see #setMinValuePositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValuePositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValuePositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getMinValuePositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValuePositiveInt <em>Min Value Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Positive Int</em>' containment reference.
	 * @see #getMinValuePositiveInt()
	 * @generated
	 */
	void setMinValuePositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Min Value Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Annotation</em>' containment reference.
	 * @see #setMinValueAnnotation(Annotation)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueAnnotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	Annotation getMinValueAnnotation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueAnnotation <em>Min Value Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Annotation</em>' containment reference.
	 * @see #getMinValueAnnotation()
	 * @generated
	 */
	void setMinValueAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Min Value Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Attachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Attachment</em>' containment reference.
	 * @see #setMinValueAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getMinValueAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueAttachment <em>Min Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Attachment</em>' containment reference.
	 * @see #getMinValueAttachment()
	 * @generated
	 */
	void setMinValueAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Min Value Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Identifier</em>' containment reference.
	 * @see #setMinValueIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getMinValueIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueIdentifier <em>Min Value Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Identifier</em>' containment reference.
	 * @see #getMinValueIdentifier()
	 * @generated
	 */
	void setMinValueIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Min Value Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Codeable Concept</em>' containment reference.
	 * @see #setMinValueCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMinValueCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueCodeableConcept <em>Min Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Codeable Concept</em>' containment reference.
	 * @see #getMinValueCodeableConcept()
	 * @generated
	 */
	void setMinValueCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Min Value Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Coding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Coding</em>' containment reference.
	 * @see #setMinValueCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getMinValueCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueCoding <em>Min Value Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Coding</em>' containment reference.
	 * @see #getMinValueCoding()
	 * @generated
	 */
	void setMinValueCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Min Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Quantity</em>' containment reference.
	 * @see #setMinValueQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getMinValueQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueQuantity <em>Min Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Quantity</em>' containment reference.
	 * @see #getMinValueQuantity()
	 * @generated
	 */
	void setMinValueQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Min Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Range</em>' containment reference.
	 * @see #setMinValueRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getMinValueRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueRange <em>Min Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Range</em>' containment reference.
	 * @see #getMinValueRange()
	 * @generated
	 */
	void setMinValueRange(Range value);

	/**
	 * Returns the value of the '<em><b>Min Value Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Period</em>' containment reference.
	 * @see #setMinValuePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValuePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValuePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getMinValuePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValuePeriod <em>Min Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Period</em>' containment reference.
	 * @see #getMinValuePeriod()
	 * @generated
	 */
	void setMinValuePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Min Value Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Ratio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Ratio</em>' containment reference.
	 * @see #setMinValueRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getMinValueRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueRatio <em>Min Value Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Ratio</em>' containment reference.
	 * @see #getMinValueRatio()
	 * @generated
	 */
	void setMinValueRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Min Value Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Reference</em>' containment reference.
	 * @see #setMinValueReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getMinValueReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueReference <em>Min Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Reference</em>' containment reference.
	 * @see #getMinValueReference()
	 * @generated
	 */
	void setMinValueReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Min Value Sampled Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Sampled Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Sampled Data</em>' containment reference.
	 * @see #setMinValueSampledData(SampledData)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueSampledData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueSampledData' namespace='##targetNamespace'"
	 * @generated
	 */
	SampledData getMinValueSampledData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueSampledData <em>Min Value Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Sampled Data</em>' containment reference.
	 * @see #getMinValueSampledData()
	 * @generated
	 */
	void setMinValueSampledData(SampledData value);

	/**
	 * Returns the value of the '<em><b>Min Value Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Signature</em>' containment reference.
	 * @see #setMinValueSignature(Signature)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueSignature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	Signature getMinValueSignature();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueSignature <em>Min Value Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Signature</em>' containment reference.
	 * @see #getMinValueSignature()
	 * @generated
	 */
	void setMinValueSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Min Value Human Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Human Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Human Name</em>' containment reference.
	 * @see #setMinValueHumanName(HumanName)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueHumanName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueHumanName' namespace='##targetNamespace'"
	 * @generated
	 */
	HumanName getMinValueHumanName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueHumanName <em>Min Value Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Human Name</em>' containment reference.
	 * @see #getMinValueHumanName()
	 * @generated
	 */
	void setMinValueHumanName(HumanName value);

	/**
	 * Returns the value of the '<em><b>Min Value Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Address</em>' containment reference.
	 * @see #setMinValueAddress(Address)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getMinValueAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueAddress <em>Min Value Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Address</em>' containment reference.
	 * @see #getMinValueAddress()
	 * @generated
	 */
	void setMinValueAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Min Value Contact Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Contact Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Contact Point</em>' containment reference.
	 * @see #setMinValueContactPoint(ContactPoint)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueContactPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueContactPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPoint getMinValueContactPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueContactPoint <em>Min Value Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Contact Point</em>' containment reference.
	 * @see #getMinValueContactPoint()
	 * @generated
	 */
	void setMinValueContactPoint(ContactPoint value);

	/**
	 * Returns the value of the '<em><b>Min Value Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Timing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Timing</em>' containment reference.
	 * @see #setMinValueTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getMinValueTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueTiming <em>Min Value Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Timing</em>' containment reference.
	 * @see #getMinValueTiming()
	 * @generated
	 */
	void setMinValueTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Min Value Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value Meta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Meta</em>' containment reference.
	 * @see #setMinValueMeta(Meta)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MinValueMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValueMeta' namespace='##targetNamespace'"
	 * @generated
	 */
	Meta getMinValueMeta();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMinValueMeta <em>Min Value Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value Meta</em>' containment reference.
	 * @see #getMinValueMeta()
	 * @generated
	 */
	void setMinValueMeta(Meta value);

	/**
	 * Returns the value of the '<em><b>Max Value Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Boolean</em>' containment reference.
	 * @see #setMaxValueBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getMaxValueBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueBoolean <em>Max Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Boolean</em>' containment reference.
	 * @see #getMaxValueBoolean()
	 * @generated
	 */
	void setMaxValueBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Value Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Integer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Integer</em>' containment reference.
	 * @see #setMaxValueInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getMaxValueInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueInteger <em>Max Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Integer</em>' containment reference.
	 * @see #getMaxValueInteger()
	 * @generated
	 */
	void setMaxValueInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Max Value Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Decimal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Decimal</em>' containment reference.
	 * @see #setMaxValueDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getMaxValueDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueDecimal <em>Max Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Decimal</em>' containment reference.
	 * @see #getMaxValueDecimal()
	 * @generated
	 */
	void setMaxValueDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Max Value Base64 Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Base64 Binary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Base64 Binary</em>' containment reference.
	 * @see #setMaxValueBase64Binary(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueBase64Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueBase64Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getMaxValueBase64Binary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueBase64Binary <em>Max Value Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Base64 Binary</em>' containment reference.
	 * @see #getMaxValueBase64Binary()
	 * @generated
	 */
	void setMaxValueBase64Binary(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Max Value Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Instant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Instant</em>' containment reference.
	 * @see #setMaxValueInstant(Instant)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getMaxValueInstant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueInstant <em>Max Value Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Instant</em>' containment reference.
	 * @see #getMaxValueInstant()
	 * @generated
	 */
	void setMaxValueInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Max Value String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value String</em>' containment reference.
	 * @see #setMaxValueString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getMaxValueString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueString <em>Max Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value String</em>' containment reference.
	 * @see #getMaxValueString()
	 * @generated
	 */
	void setMaxValueString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Max Value Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Uri</em>' containment reference.
	 * @see #setMaxValueUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getMaxValueUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueUri <em>Max Value Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Uri</em>' containment reference.
	 * @see #getMaxValueUri()
	 * @generated
	 */
	void setMaxValueUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Max Value Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Date</em>' containment reference.
	 * @see #setMaxValueDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getMaxValueDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueDate <em>Max Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Date</em>' containment reference.
	 * @see #getMaxValueDate()
	 * @generated
	 */
	void setMaxValueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Max Value Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Date Time</em>' containment reference.
	 * @see #setMaxValueDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getMaxValueDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueDateTime <em>Max Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Date Time</em>' containment reference.
	 * @see #getMaxValueDateTime()
	 * @generated
	 */
	void setMaxValueDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Max Value Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Time</em>' containment reference.
	 * @see #setMaxValueTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getMaxValueTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueTime <em>Max Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Time</em>' containment reference.
	 * @see #getMaxValueTime()
	 * @generated
	 */
	void setMaxValueTime(Time value);

	/**
	 * Returns the value of the '<em><b>Max Value Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Code</em>' containment reference.
	 * @see #setMaxValueCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueCode' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getMaxValueCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueCode <em>Max Value Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Code</em>' containment reference.
	 * @see #getMaxValueCode()
	 * @generated
	 */
	void setMaxValueCode(Code value);

	/**
	 * Returns the value of the '<em><b>Max Value Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Oid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Oid</em>' containment reference.
	 * @see #setMaxValueOid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueOid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueOid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getMaxValueOid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueOid <em>Max Value Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Oid</em>' containment reference.
	 * @see #getMaxValueOid()
	 * @generated
	 */
	void setMaxValueOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Max Value Uuid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Uuid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Uuid</em>' containment reference.
	 * @see #setMaxValueUuid(Uuid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueUuid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueUuid' namespace='##targetNamespace'"
	 * @generated
	 */
	Uuid getMaxValueUuid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueUuid <em>Max Value Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Uuid</em>' containment reference.
	 * @see #getMaxValueUuid()
	 * @generated
	 */
	void setMaxValueUuid(Uuid value);

	/**
	 * Returns the value of the '<em><b>Max Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Id</em>' containment reference.
	 * @see #setMaxValueId(Id)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getMaxValueId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueId <em>Max Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Id</em>' containment reference.
	 * @see #getMaxValueId()
	 * @generated
	 */
	void setMaxValueId(Id value);

	/**
	 * Returns the value of the '<em><b>Max Value Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Unsigned Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Unsigned Int</em>' containment reference.
	 * @see #setMaxValueUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getMaxValueUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueUnsignedInt <em>Max Value Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Unsigned Int</em>' containment reference.
	 * @see #getMaxValueUnsignedInt()
	 * @generated
	 */
	void setMaxValueUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Max Value Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Positive Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Positive Int</em>' containment reference.
	 * @see #setMaxValuePositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValuePositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValuePositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getMaxValuePositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValuePositiveInt <em>Max Value Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Positive Int</em>' containment reference.
	 * @see #getMaxValuePositiveInt()
	 * @generated
	 */
	void setMaxValuePositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Max Value Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Annotation</em>' containment reference.
	 * @see #setMaxValueAnnotation(Annotation)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueAnnotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	Annotation getMaxValueAnnotation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueAnnotation <em>Max Value Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Annotation</em>' containment reference.
	 * @see #getMaxValueAnnotation()
	 * @generated
	 */
	void setMaxValueAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Max Value Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Attachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Attachment</em>' containment reference.
	 * @see #setMaxValueAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getMaxValueAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueAttachment <em>Max Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Attachment</em>' containment reference.
	 * @see #getMaxValueAttachment()
	 * @generated
	 */
	void setMaxValueAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Max Value Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Identifier</em>' containment reference.
	 * @see #setMaxValueIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getMaxValueIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueIdentifier <em>Max Value Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Identifier</em>' containment reference.
	 * @see #getMaxValueIdentifier()
	 * @generated
	 */
	void setMaxValueIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Max Value Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Codeable Concept</em>' containment reference.
	 * @see #setMaxValueCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMaxValueCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueCodeableConcept <em>Max Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Codeable Concept</em>' containment reference.
	 * @see #getMaxValueCodeableConcept()
	 * @generated
	 */
	void setMaxValueCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Max Value Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Coding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Coding</em>' containment reference.
	 * @see #setMaxValueCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getMaxValueCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueCoding <em>Max Value Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Coding</em>' containment reference.
	 * @see #getMaxValueCoding()
	 * @generated
	 */
	void setMaxValueCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Max Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Quantity</em>' containment reference.
	 * @see #setMaxValueQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getMaxValueQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueQuantity <em>Max Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Quantity</em>' containment reference.
	 * @see #getMaxValueQuantity()
	 * @generated
	 */
	void setMaxValueQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Max Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Range</em>' containment reference.
	 * @see #setMaxValueRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getMaxValueRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueRange <em>Max Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Range</em>' containment reference.
	 * @see #getMaxValueRange()
	 * @generated
	 */
	void setMaxValueRange(Range value);

	/**
	 * Returns the value of the '<em><b>Max Value Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Period</em>' containment reference.
	 * @see #setMaxValuePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValuePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValuePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getMaxValuePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValuePeriod <em>Max Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Period</em>' containment reference.
	 * @see #getMaxValuePeriod()
	 * @generated
	 */
	void setMaxValuePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Max Value Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Ratio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Ratio</em>' containment reference.
	 * @see #setMaxValueRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getMaxValueRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueRatio <em>Max Value Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Ratio</em>' containment reference.
	 * @see #getMaxValueRatio()
	 * @generated
	 */
	void setMaxValueRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Max Value Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Reference</em>' containment reference.
	 * @see #setMaxValueReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getMaxValueReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueReference <em>Max Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Reference</em>' containment reference.
	 * @see #getMaxValueReference()
	 * @generated
	 */
	void setMaxValueReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Max Value Sampled Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Sampled Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Sampled Data</em>' containment reference.
	 * @see #setMaxValueSampledData(SampledData)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueSampledData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueSampledData' namespace='##targetNamespace'"
	 * @generated
	 */
	SampledData getMaxValueSampledData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueSampledData <em>Max Value Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Sampled Data</em>' containment reference.
	 * @see #getMaxValueSampledData()
	 * @generated
	 */
	void setMaxValueSampledData(SampledData value);

	/**
	 * Returns the value of the '<em><b>Max Value Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Signature</em>' containment reference.
	 * @see #setMaxValueSignature(Signature)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueSignature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	Signature getMaxValueSignature();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueSignature <em>Max Value Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Signature</em>' containment reference.
	 * @see #getMaxValueSignature()
	 * @generated
	 */
	void setMaxValueSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Max Value Human Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Human Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Human Name</em>' containment reference.
	 * @see #setMaxValueHumanName(HumanName)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueHumanName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueHumanName' namespace='##targetNamespace'"
	 * @generated
	 */
	HumanName getMaxValueHumanName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueHumanName <em>Max Value Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Human Name</em>' containment reference.
	 * @see #getMaxValueHumanName()
	 * @generated
	 */
	void setMaxValueHumanName(HumanName value);

	/**
	 * Returns the value of the '<em><b>Max Value Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Address</em>' containment reference.
	 * @see #setMaxValueAddress(Address)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getMaxValueAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueAddress <em>Max Value Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Address</em>' containment reference.
	 * @see #getMaxValueAddress()
	 * @generated
	 */
	void setMaxValueAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Max Value Contact Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Contact Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Contact Point</em>' containment reference.
	 * @see #setMaxValueContactPoint(ContactPoint)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueContactPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueContactPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPoint getMaxValueContactPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueContactPoint <em>Max Value Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Contact Point</em>' containment reference.
	 * @see #getMaxValueContactPoint()
	 * @generated
	 */
	void setMaxValueContactPoint(ContactPoint value);

	/**
	 * Returns the value of the '<em><b>Max Value Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Timing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Timing</em>' containment reference.
	 * @see #setMaxValueTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getMaxValueTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueTiming <em>Max Value Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Timing</em>' containment reference.
	 * @see #getMaxValueTiming()
	 * @generated
	 */
	void setMaxValueTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Max Value Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value Meta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Meta</em>' containment reference.
	 * @see #setMaxValueMeta(Meta)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxValueMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValueMeta' namespace='##targetNamespace'"
	 * @generated
	 */
	Meta getMaxValueMeta();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxValueMeta <em>Max Value Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value Meta</em>' containment reference.
	 * @see #getMaxValueMeta()
	 * @generated
	 */
	void setMaxValueMeta(Meta value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the maximum length in characters that is permitted to be present in conformant instances and which is expected to be supported by conformant consumers that support the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Length</em>' containment reference.
	 * @see #setMaxLength(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MaxLength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxLength' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getMaxLength();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMaxLength <em>Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' containment reference.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Id}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to an invariant that may make additional statements about the cardinality or value in the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Id> getCondition();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ElementDefinitionConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formal constraints such as co-occurrence and other constraints that can be computationally evaluated within the context of the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Constraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constraint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ElementDefinitionConstraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Must Support</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, conformant resource authors SHALL be capable of providing a value for the element and resource consumers SHALL be capable of extracting and doing something useful with the data element.  If false, the element may be ignored and not supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Support</em>' containment reference.
	 * @see #setMustSupport(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_MustSupport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mustSupport' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getMustSupport();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getMustSupport <em>Must Support</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Support</em>' containment reference.
	 * @see #getMustSupport()
	 * @generated
	 */
	void setMustSupport(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Modifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the value of this element affects the interpretation of the element or resource that contains it, and the value of the element cannot be ignored. Typically, this is used for status, negation and qualification codes. The effect of this is that the element cannot be ignored by systems: they SHALL either recognize the element and process it, and/or a pre-determination has been made that it is not relevant to their particular system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Modifier</em>' containment reference.
	 * @see #setIsModifier(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_IsModifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isModifier' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsModifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getIsModifier <em>Is Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Modifier</em>' containment reference.
	 * @see #getIsModifier()
	 * @generated
	 */
	void setIsModifier(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the element should be included if a client requests a search with the parameter _summary=true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Summary</em>' containment reference.
	 * @see #setIsSummary(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_IsSummary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isSummary' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsSummary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getIsSummary <em>Is Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Summary</em>' containment reference.
	 * @see #getIsSummary()
	 * @generated
	 */
	void setIsSummary(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Binds to a value set if this element is coded (code, Coding, CodeableConcept).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference.
	 * @see #setBinding(ElementDefinitionBinding)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Binding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='binding' namespace='##targetNamespace'"
	 * @generated
	 */
	ElementDefinitionBinding getBinding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinition#getBinding <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' containment reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(ElementDefinitionBinding value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ElementDefinitionMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a concept from an external specification that roughly corresponds to this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getElementDefinition_Mapping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mapping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ElementDefinitionMapping> getMapping();

} // ElementDefinition
