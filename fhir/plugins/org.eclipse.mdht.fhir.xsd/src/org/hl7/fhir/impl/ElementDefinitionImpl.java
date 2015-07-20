/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Address;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.ElementDefinition;
import org.hl7.fhir.ElementDefinitionBinding;
import org.hl7.fhir.ElementDefinitionConstraint;
import org.hl7.fhir.ElementDefinitionMapping;
import org.hl7.fhir.ElementDefinitionSlicing;
import org.hl7.fhir.ElementDefinitionType;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Meta;
import org.hl7.fhir.Oid;
import org.hl7.fhir.Period;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.PropertyRepresentation;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.Signature;
import org.hl7.fhir.Time;
import org.hl7.fhir.Timing;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;
import org.hl7.fhir.Uuid;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getSlicing <em>Slicing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getShort <em>Short</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getNameReference <em>Name Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueBoolean <em>Default Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueInteger <em>Default Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueDecimal <em>Default Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueBase64Binary <em>Default Value Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueInstant <em>Default Value Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueString <em>Default Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueUri <em>Default Value Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueDate <em>Default Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueDateTime <em>Default Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueTime <em>Default Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueCode <em>Default Value Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueOid <em>Default Value Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueUuid <em>Default Value Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueId <em>Default Value Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueUnsignedInt <em>Default Value Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValuePositiveInt <em>Default Value Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueAnnotation <em>Default Value Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueAttachment <em>Default Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueIdentifier <em>Default Value Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueCodeableConcept <em>Default Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueCoding <em>Default Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueQuantity <em>Default Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueRange <em>Default Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValuePeriod <em>Default Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueRatio <em>Default Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueReference <em>Default Value Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueSampledData <em>Default Value Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueSignature <em>Default Value Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueHumanName <em>Default Value Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueAddress <em>Default Value Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueContactPoint <em>Default Value Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueTiming <em>Default Value Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getDefaultValueMeta <em>Default Value Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMeaningWhenMissing <em>Meaning When Missing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedBoolean <em>Fixed Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedInteger <em>Fixed Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedDecimal <em>Fixed Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedBase64Binary <em>Fixed Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedInstant <em>Fixed Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedString <em>Fixed String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedUri <em>Fixed Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedDate <em>Fixed Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedDateTime <em>Fixed Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedTime <em>Fixed Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedCode <em>Fixed Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedOid <em>Fixed Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedUuid <em>Fixed Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedId <em>Fixed Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedUnsignedInt <em>Fixed Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedPositiveInt <em>Fixed Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedAnnotation <em>Fixed Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedAttachment <em>Fixed Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedIdentifier <em>Fixed Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedCodeableConcept <em>Fixed Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedCoding <em>Fixed Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedQuantity <em>Fixed Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedRange <em>Fixed Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedPeriod <em>Fixed Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedRatio <em>Fixed Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedReference <em>Fixed Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedSampledData <em>Fixed Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedSignature <em>Fixed Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedHumanName <em>Fixed Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedAddress <em>Fixed Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedContactPoint <em>Fixed Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedTiming <em>Fixed Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getFixedMeta <em>Fixed Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternBoolean <em>Pattern Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternInteger <em>Pattern Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternDecimal <em>Pattern Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternBase64Binary <em>Pattern Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternInstant <em>Pattern Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternString <em>Pattern String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternUri <em>Pattern Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternDate <em>Pattern Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternDateTime <em>Pattern Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternTime <em>Pattern Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternCode <em>Pattern Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternOid <em>Pattern Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternUuid <em>Pattern Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternId <em>Pattern Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternUnsignedInt <em>Pattern Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternPositiveInt <em>Pattern Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternAnnotation <em>Pattern Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternAttachment <em>Pattern Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternIdentifier <em>Pattern Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternCodeableConcept <em>Pattern Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternCoding <em>Pattern Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternQuantity <em>Pattern Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternRange <em>Pattern Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternPeriod <em>Pattern Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternRatio <em>Pattern Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternReference <em>Pattern Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternSampledData <em>Pattern Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternSignature <em>Pattern Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternHumanName <em>Pattern Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternAddress <em>Pattern Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternContactPoint <em>Pattern Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternTiming <em>Pattern Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getPatternMeta <em>Pattern Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleBoolean <em>Example Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleInteger <em>Example Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleDecimal <em>Example Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleBase64Binary <em>Example Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleInstant <em>Example Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleString <em>Example String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleUri <em>Example Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleDate <em>Example Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleDateTime <em>Example Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleTime <em>Example Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleCode <em>Example Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleOid <em>Example Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleUuid <em>Example Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleId <em>Example Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleUnsignedInt <em>Example Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExamplePositiveInt <em>Example Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleAnnotation <em>Example Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleAttachment <em>Example Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleIdentifier <em>Example Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleCodeableConcept <em>Example Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleCoding <em>Example Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleQuantity <em>Example Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleRange <em>Example Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExamplePeriod <em>Example Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleRatio <em>Example Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleReference <em>Example Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleSampledData <em>Example Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleSignature <em>Example Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleHumanName <em>Example Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleAddress <em>Example Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleContactPoint <em>Example Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleTiming <em>Example Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getExampleMeta <em>Example Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueBoolean <em>Min Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueInteger <em>Min Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueDecimal <em>Min Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueBase64Binary <em>Min Value Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueInstant <em>Min Value Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueString <em>Min Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueUri <em>Min Value Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueDate <em>Min Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueDateTime <em>Min Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueTime <em>Min Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueCode <em>Min Value Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueOid <em>Min Value Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueUuid <em>Min Value Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueId <em>Min Value Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueUnsignedInt <em>Min Value Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValuePositiveInt <em>Min Value Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueAnnotation <em>Min Value Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueAttachment <em>Min Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueIdentifier <em>Min Value Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueCodeableConcept <em>Min Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueCoding <em>Min Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueQuantity <em>Min Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueRange <em>Min Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValuePeriod <em>Min Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueRatio <em>Min Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueReference <em>Min Value Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueSampledData <em>Min Value Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueSignature <em>Min Value Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueHumanName <em>Min Value Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueAddress <em>Min Value Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueContactPoint <em>Min Value Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueTiming <em>Min Value Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMinValueMeta <em>Min Value Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueBoolean <em>Max Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueInteger <em>Max Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueDecimal <em>Max Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueBase64Binary <em>Max Value Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueInstant <em>Max Value Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueString <em>Max Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueUri <em>Max Value Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueDate <em>Max Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueDateTime <em>Max Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueTime <em>Max Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueCode <em>Max Value Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueOid <em>Max Value Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueUuid <em>Max Value Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueId <em>Max Value Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueUnsignedInt <em>Max Value Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValuePositiveInt <em>Max Value Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueAnnotation <em>Max Value Annotation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueAttachment <em>Max Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueIdentifier <em>Max Value Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueCodeableConcept <em>Max Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueCoding <em>Max Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueQuantity <em>Max Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueRange <em>Max Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValuePeriod <em>Max Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueRatio <em>Max Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueReference <em>Max Value Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueSampledData <em>Max Value Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueSignature <em>Max Value Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueHumanName <em>Max Value Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueAddress <em>Max Value Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueContactPoint <em>Max Value Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueTiming <em>Max Value Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxValueMeta <em>Max Value Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMustSupport <em>Must Support</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getIsModifier <em>Is Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getIsSummary <em>Is Summary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionImpl#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionImpl extends ElementImpl implements ElementDefinition {
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String path;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyRepresentation> representation;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String label;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> code;

	/**
	 * The cached value of the '{@link #getSlicing() <em>Slicing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlicing()
	 * @generated
	 * @ordered
	 */
	protected ElementDefinitionSlicing slicing;

	/**
	 * The cached value of the '{@link #getShort() <em>Short</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShort()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String short_;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String definition;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comments;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String requirements;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> alias;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String max;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinitionType> type;

	/**
	 * The cached value of the '{@link #getNameReference() <em>Name Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameReference()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String nameReference;

	/**
	 * The cached value of the '{@link #getDefaultValueBoolean() <em>Default Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean defaultValueBoolean;

	/**
	 * The cached value of the '{@link #getDefaultValueInteger() <em>Default Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer defaultValueInteger;

	/**
	 * The cached value of the '{@link #getDefaultValueDecimal() <em>Default Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal defaultValueDecimal;

	/**
	 * The cached value of the '{@link #getDefaultValueBase64Binary() <em>Default Value Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueBase64Binary()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary defaultValueBase64Binary;

	/**
	 * The cached value of the '{@link #getDefaultValueInstant() <em>Default Value Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueInstant()
	 * @generated
	 * @ordered
	 */
	protected Instant defaultValueInstant;

	/**
	 * The cached value of the '{@link #getDefaultValueString() <em>Default Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String defaultValueString;

	/**
	 * The cached value of the '{@link #getDefaultValueUri() <em>Default Value Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueUri()
	 * @generated
	 * @ordered
	 */
	protected Uri defaultValueUri;

	/**
	 * The cached value of the '{@link #getDefaultValueDate() <em>Default Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueDate()
	 * @generated
	 * @ordered
	 */
	protected Date defaultValueDate;

	/**
	 * The cached value of the '{@link #getDefaultValueDateTime() <em>Default Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime defaultValueDateTime;

	/**
	 * The cached value of the '{@link #getDefaultValueTime() <em>Default Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueTime()
	 * @generated
	 * @ordered
	 */
	protected Time defaultValueTime;

	/**
	 * The cached value of the '{@link #getDefaultValueCode() <em>Default Value Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueCode()
	 * @generated
	 * @ordered
	 */
	protected Code defaultValueCode;

	/**
	 * The cached value of the '{@link #getDefaultValueOid() <em>Default Value Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueOid()
	 * @generated
	 * @ordered
	 */
	protected Oid defaultValueOid;

	/**
	 * The cached value of the '{@link #getDefaultValueUuid() <em>Default Value Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueUuid()
	 * @generated
	 * @ordered
	 */
	protected Uuid defaultValueUuid;

	/**
	 * The cached value of the '{@link #getDefaultValueId() <em>Default Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueId()
	 * @generated
	 * @ordered
	 */
	protected Id defaultValueId;

	/**
	 * The cached value of the '{@link #getDefaultValueUnsignedInt() <em>Default Value Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt defaultValueUnsignedInt;

	/**
	 * The cached value of the '{@link #getDefaultValuePositiveInt() <em>Default Value Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValuePositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt defaultValuePositiveInt;

	/**
	 * The cached value of the '{@link #getDefaultValueAnnotation() <em>Default Value Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation defaultValueAnnotation;

	/**
	 * The cached value of the '{@link #getDefaultValueAttachment() <em>Default Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment defaultValueAttachment;

	/**
	 * The cached value of the '{@link #getDefaultValueIdentifier() <em>Default Value Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier defaultValueIdentifier;

	/**
	 * The cached value of the '{@link #getDefaultValueCodeableConcept() <em>Default Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept defaultValueCodeableConcept;

	/**
	 * The cached value of the '{@link #getDefaultValueCoding() <em>Default Value Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding defaultValueCoding;

	/**
	 * The cached value of the '{@link #getDefaultValueQuantity() <em>Default Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity defaultValueQuantity;

	/**
	 * The cached value of the '{@link #getDefaultValueRange() <em>Default Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueRange()
	 * @generated
	 * @ordered
	 */
	protected Range defaultValueRange;

	/**
	 * The cached value of the '{@link #getDefaultValuePeriod() <em>Default Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValuePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period defaultValuePeriod;

	/**
	 * The cached value of the '{@link #getDefaultValueRatio() <em>Default Value Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio defaultValueRatio;

	/**
	 * The cached value of the '{@link #getDefaultValueReference() <em>Default Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueReference()
	 * @generated
	 * @ordered
	 */
	protected Reference defaultValueReference;

	/**
	 * The cached value of the '{@link #getDefaultValueSampledData() <em>Default Value Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueSampledData()
	 * @generated
	 * @ordered
	 */
	protected SampledData defaultValueSampledData;

	/**
	 * The cached value of the '{@link #getDefaultValueSignature() <em>Default Value Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature defaultValueSignature;

	/**
	 * The cached value of the '{@link #getDefaultValueHumanName() <em>Default Value Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueHumanName()
	 * @generated
	 * @ordered
	 */
	protected HumanName defaultValueHumanName;

	/**
	 * The cached value of the '{@link #getDefaultValueAddress() <em>Default Value Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueAddress()
	 * @generated
	 * @ordered
	 */
	protected Address defaultValueAddress;

	/**
	 * The cached value of the '{@link #getDefaultValueContactPoint() <em>Default Value Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueContactPoint()
	 * @generated
	 * @ordered
	 */
	protected ContactPoint defaultValueContactPoint;

	/**
	 * The cached value of the '{@link #getDefaultValueTiming() <em>Default Value Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing defaultValueTiming;

	/**
	 * The cached value of the '{@link #getDefaultValueMeta() <em>Default Value Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueMeta()
	 * @generated
	 * @ordered
	 */
	protected Meta defaultValueMeta;

	/**
	 * The cached value of the '{@link #getMeaningWhenMissing() <em>Meaning When Missing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaningWhenMissing()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String meaningWhenMissing;

	/**
	 * The cached value of the '{@link #getFixedBoolean() <em>Fixed Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean fixedBoolean;

	/**
	 * The cached value of the '{@link #getFixedInteger() <em>Fixed Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer fixedInteger;

	/**
	 * The cached value of the '{@link #getFixedDecimal() <em>Fixed Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal fixedDecimal;

	/**
	 * The cached value of the '{@link #getFixedBase64Binary() <em>Fixed Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedBase64Binary()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary fixedBase64Binary;

	/**
	 * The cached value of the '{@link #getFixedInstant() <em>Fixed Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedInstant()
	 * @generated
	 * @ordered
	 */
	protected Instant fixedInstant;

	/**
	 * The cached value of the '{@link #getFixedString() <em>Fixed String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String fixedString;

	/**
	 * The cached value of the '{@link #getFixedUri() <em>Fixed Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedUri()
	 * @generated
	 * @ordered
	 */
	protected Uri fixedUri;

	/**
	 * The cached value of the '{@link #getFixedDate() <em>Fixed Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedDate()
	 * @generated
	 * @ordered
	 */
	protected Date fixedDate;

	/**
	 * The cached value of the '{@link #getFixedDateTime() <em>Fixed Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime fixedDateTime;

	/**
	 * The cached value of the '{@link #getFixedTime() <em>Fixed Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedTime()
	 * @generated
	 * @ordered
	 */
	protected Time fixedTime;

	/**
	 * The cached value of the '{@link #getFixedCode() <em>Fixed Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedCode()
	 * @generated
	 * @ordered
	 */
	protected Code fixedCode;

	/**
	 * The cached value of the '{@link #getFixedOid() <em>Fixed Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedOid()
	 * @generated
	 * @ordered
	 */
	protected Oid fixedOid;

	/**
	 * The cached value of the '{@link #getFixedUuid() <em>Fixed Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedUuid()
	 * @generated
	 * @ordered
	 */
	protected Uuid fixedUuid;

	/**
	 * The cached value of the '{@link #getFixedId() <em>Fixed Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedId()
	 * @generated
	 * @ordered
	 */
	protected Id fixedId;

	/**
	 * The cached value of the '{@link #getFixedUnsignedInt() <em>Fixed Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt fixedUnsignedInt;

	/**
	 * The cached value of the '{@link #getFixedPositiveInt() <em>Fixed Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedPositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt fixedPositiveInt;

	/**
	 * The cached value of the '{@link #getFixedAnnotation() <em>Fixed Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation fixedAnnotation;

	/**
	 * The cached value of the '{@link #getFixedAttachment() <em>Fixed Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment fixedAttachment;

	/**
	 * The cached value of the '{@link #getFixedIdentifier() <em>Fixed Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier fixedIdentifier;

	/**
	 * The cached value of the '{@link #getFixedCodeableConcept() <em>Fixed Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept fixedCodeableConcept;

	/**
	 * The cached value of the '{@link #getFixedCoding() <em>Fixed Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding fixedCoding;

	/**
	 * The cached value of the '{@link #getFixedQuantity() <em>Fixed Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity fixedQuantity;

	/**
	 * The cached value of the '{@link #getFixedRange() <em>Fixed Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedRange()
	 * @generated
	 * @ordered
	 */
	protected Range fixedRange;

	/**
	 * The cached value of the '{@link #getFixedPeriod() <em>Fixed Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period fixedPeriod;

	/**
	 * The cached value of the '{@link #getFixedRatio() <em>Fixed Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio fixedRatio;

	/**
	 * The cached value of the '{@link #getFixedReference() <em>Fixed Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedReference()
	 * @generated
	 * @ordered
	 */
	protected Reference fixedReference;

	/**
	 * The cached value of the '{@link #getFixedSampledData() <em>Fixed Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedSampledData()
	 * @generated
	 * @ordered
	 */
	protected SampledData fixedSampledData;

	/**
	 * The cached value of the '{@link #getFixedSignature() <em>Fixed Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature fixedSignature;

	/**
	 * The cached value of the '{@link #getFixedHumanName() <em>Fixed Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedHumanName()
	 * @generated
	 * @ordered
	 */
	protected HumanName fixedHumanName;

	/**
	 * The cached value of the '{@link #getFixedAddress() <em>Fixed Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAddress()
	 * @generated
	 * @ordered
	 */
	protected Address fixedAddress;

	/**
	 * The cached value of the '{@link #getFixedContactPoint() <em>Fixed Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedContactPoint()
	 * @generated
	 * @ordered
	 */
	protected ContactPoint fixedContactPoint;

	/**
	 * The cached value of the '{@link #getFixedTiming() <em>Fixed Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing fixedTiming;

	/**
	 * The cached value of the '{@link #getFixedMeta() <em>Fixed Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedMeta()
	 * @generated
	 * @ordered
	 */
	protected Meta fixedMeta;

	/**
	 * The cached value of the '{@link #getPatternBoolean() <em>Pattern Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean patternBoolean;

	/**
	 * The cached value of the '{@link #getPatternInteger() <em>Pattern Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer patternInteger;

	/**
	 * The cached value of the '{@link #getPatternDecimal() <em>Pattern Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal patternDecimal;

	/**
	 * The cached value of the '{@link #getPatternBase64Binary() <em>Pattern Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternBase64Binary()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary patternBase64Binary;

	/**
	 * The cached value of the '{@link #getPatternInstant() <em>Pattern Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternInstant()
	 * @generated
	 * @ordered
	 */
	protected Instant patternInstant;

	/**
	 * The cached value of the '{@link #getPatternString() <em>Pattern String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String patternString;

	/**
	 * The cached value of the '{@link #getPatternUri() <em>Pattern Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternUri()
	 * @generated
	 * @ordered
	 */
	protected Uri patternUri;

	/**
	 * The cached value of the '{@link #getPatternDate() <em>Pattern Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternDate()
	 * @generated
	 * @ordered
	 */
	protected Date patternDate;

	/**
	 * The cached value of the '{@link #getPatternDateTime() <em>Pattern Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime patternDateTime;

	/**
	 * The cached value of the '{@link #getPatternTime() <em>Pattern Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternTime()
	 * @generated
	 * @ordered
	 */
	protected Time patternTime;

	/**
	 * The cached value of the '{@link #getPatternCode() <em>Pattern Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternCode()
	 * @generated
	 * @ordered
	 */
	protected Code patternCode;

	/**
	 * The cached value of the '{@link #getPatternOid() <em>Pattern Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternOid()
	 * @generated
	 * @ordered
	 */
	protected Oid patternOid;

	/**
	 * The cached value of the '{@link #getPatternUuid() <em>Pattern Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternUuid()
	 * @generated
	 * @ordered
	 */
	protected Uuid patternUuid;

	/**
	 * The cached value of the '{@link #getPatternId() <em>Pattern Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternId()
	 * @generated
	 * @ordered
	 */
	protected Id patternId;

	/**
	 * The cached value of the '{@link #getPatternUnsignedInt() <em>Pattern Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt patternUnsignedInt;

	/**
	 * The cached value of the '{@link #getPatternPositiveInt() <em>Pattern Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternPositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt patternPositiveInt;

	/**
	 * The cached value of the '{@link #getPatternAnnotation() <em>Pattern Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation patternAnnotation;

	/**
	 * The cached value of the '{@link #getPatternAttachment() <em>Pattern Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment patternAttachment;

	/**
	 * The cached value of the '{@link #getPatternIdentifier() <em>Pattern Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier patternIdentifier;

	/**
	 * The cached value of the '{@link #getPatternCodeableConcept() <em>Pattern Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept patternCodeableConcept;

	/**
	 * The cached value of the '{@link #getPatternCoding() <em>Pattern Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding patternCoding;

	/**
	 * The cached value of the '{@link #getPatternQuantity() <em>Pattern Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity patternQuantity;

	/**
	 * The cached value of the '{@link #getPatternRange() <em>Pattern Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternRange()
	 * @generated
	 * @ordered
	 */
	protected Range patternRange;

	/**
	 * The cached value of the '{@link #getPatternPeriod() <em>Pattern Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period patternPeriod;

	/**
	 * The cached value of the '{@link #getPatternRatio() <em>Pattern Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio patternRatio;

	/**
	 * The cached value of the '{@link #getPatternReference() <em>Pattern Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternReference()
	 * @generated
	 * @ordered
	 */
	protected Reference patternReference;

	/**
	 * The cached value of the '{@link #getPatternSampledData() <em>Pattern Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternSampledData()
	 * @generated
	 * @ordered
	 */
	protected SampledData patternSampledData;

	/**
	 * The cached value of the '{@link #getPatternSignature() <em>Pattern Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature patternSignature;

	/**
	 * The cached value of the '{@link #getPatternHumanName() <em>Pattern Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternHumanName()
	 * @generated
	 * @ordered
	 */
	protected HumanName patternHumanName;

	/**
	 * The cached value of the '{@link #getPatternAddress() <em>Pattern Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternAddress()
	 * @generated
	 * @ordered
	 */
	protected Address patternAddress;

	/**
	 * The cached value of the '{@link #getPatternContactPoint() <em>Pattern Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternContactPoint()
	 * @generated
	 * @ordered
	 */
	protected ContactPoint patternContactPoint;

	/**
	 * The cached value of the '{@link #getPatternTiming() <em>Pattern Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing patternTiming;

	/**
	 * The cached value of the '{@link #getPatternMeta() <em>Pattern Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternMeta()
	 * @generated
	 * @ordered
	 */
	protected Meta patternMeta;

	/**
	 * The cached value of the '{@link #getExampleBoolean() <em>Example Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean exampleBoolean;

	/**
	 * The cached value of the '{@link #getExampleInteger() <em>Example Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer exampleInteger;

	/**
	 * The cached value of the '{@link #getExampleDecimal() <em>Example Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal exampleDecimal;

	/**
	 * The cached value of the '{@link #getExampleBase64Binary() <em>Example Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleBase64Binary()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary exampleBase64Binary;

	/**
	 * The cached value of the '{@link #getExampleInstant() <em>Example Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleInstant()
	 * @generated
	 * @ordered
	 */
	protected Instant exampleInstant;

	/**
	 * The cached value of the '{@link #getExampleString() <em>Example String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String exampleString;

	/**
	 * The cached value of the '{@link #getExampleUri() <em>Example Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleUri()
	 * @generated
	 * @ordered
	 */
	protected Uri exampleUri;

	/**
	 * The cached value of the '{@link #getExampleDate() <em>Example Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleDate()
	 * @generated
	 * @ordered
	 */
	protected Date exampleDate;

	/**
	 * The cached value of the '{@link #getExampleDateTime() <em>Example Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime exampleDateTime;

	/**
	 * The cached value of the '{@link #getExampleTime() <em>Example Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleTime()
	 * @generated
	 * @ordered
	 */
	protected Time exampleTime;

	/**
	 * The cached value of the '{@link #getExampleCode() <em>Example Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleCode()
	 * @generated
	 * @ordered
	 */
	protected Code exampleCode;

	/**
	 * The cached value of the '{@link #getExampleOid() <em>Example Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleOid()
	 * @generated
	 * @ordered
	 */
	protected Oid exampleOid;

	/**
	 * The cached value of the '{@link #getExampleUuid() <em>Example Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleUuid()
	 * @generated
	 * @ordered
	 */
	protected Uuid exampleUuid;

	/**
	 * The cached value of the '{@link #getExampleId() <em>Example Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleId()
	 * @generated
	 * @ordered
	 */
	protected Id exampleId;

	/**
	 * The cached value of the '{@link #getExampleUnsignedInt() <em>Example Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt exampleUnsignedInt;

	/**
	 * The cached value of the '{@link #getExamplePositiveInt() <em>Example Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamplePositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt examplePositiveInt;

	/**
	 * The cached value of the '{@link #getExampleAnnotation() <em>Example Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation exampleAnnotation;

	/**
	 * The cached value of the '{@link #getExampleAttachment() <em>Example Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment exampleAttachment;

	/**
	 * The cached value of the '{@link #getExampleIdentifier() <em>Example Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier exampleIdentifier;

	/**
	 * The cached value of the '{@link #getExampleCodeableConcept() <em>Example Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept exampleCodeableConcept;

	/**
	 * The cached value of the '{@link #getExampleCoding() <em>Example Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding exampleCoding;

	/**
	 * The cached value of the '{@link #getExampleQuantity() <em>Example Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity exampleQuantity;

	/**
	 * The cached value of the '{@link #getExampleRange() <em>Example Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleRange()
	 * @generated
	 * @ordered
	 */
	protected Range exampleRange;

	/**
	 * The cached value of the '{@link #getExamplePeriod() <em>Example Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamplePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period examplePeriod;

	/**
	 * The cached value of the '{@link #getExampleRatio() <em>Example Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio exampleRatio;

	/**
	 * The cached value of the '{@link #getExampleReference() <em>Example Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleReference()
	 * @generated
	 * @ordered
	 */
	protected Reference exampleReference;

	/**
	 * The cached value of the '{@link #getExampleSampledData() <em>Example Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleSampledData()
	 * @generated
	 * @ordered
	 */
	protected SampledData exampleSampledData;

	/**
	 * The cached value of the '{@link #getExampleSignature() <em>Example Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature exampleSignature;

	/**
	 * The cached value of the '{@link #getExampleHumanName() <em>Example Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleHumanName()
	 * @generated
	 * @ordered
	 */
	protected HumanName exampleHumanName;

	/**
	 * The cached value of the '{@link #getExampleAddress() <em>Example Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleAddress()
	 * @generated
	 * @ordered
	 */
	protected Address exampleAddress;

	/**
	 * The cached value of the '{@link #getExampleContactPoint() <em>Example Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleContactPoint()
	 * @generated
	 * @ordered
	 */
	protected ContactPoint exampleContactPoint;

	/**
	 * The cached value of the '{@link #getExampleTiming() <em>Example Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing exampleTiming;

	/**
	 * The cached value of the '{@link #getExampleMeta() <em>Example Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleMeta()
	 * @generated
	 * @ordered
	 */
	protected Meta exampleMeta;

	/**
	 * The cached value of the '{@link #getMinValueBoolean() <em>Min Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean minValueBoolean;

	/**
	 * The cached value of the '{@link #getMinValueInteger() <em>Min Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer minValueInteger;

	/**
	 * The cached value of the '{@link #getMinValueDecimal() <em>Min Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal minValueDecimal;

	/**
	 * The cached value of the '{@link #getMinValueBase64Binary() <em>Min Value Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueBase64Binary()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary minValueBase64Binary;

	/**
	 * The cached value of the '{@link #getMinValueInstant() <em>Min Value Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueInstant()
	 * @generated
	 * @ordered
	 */
	protected Instant minValueInstant;

	/**
	 * The cached value of the '{@link #getMinValueString() <em>Min Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String minValueString;

	/**
	 * The cached value of the '{@link #getMinValueUri() <em>Min Value Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueUri()
	 * @generated
	 * @ordered
	 */
	protected Uri minValueUri;

	/**
	 * The cached value of the '{@link #getMinValueDate() <em>Min Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueDate()
	 * @generated
	 * @ordered
	 */
	protected Date minValueDate;

	/**
	 * The cached value of the '{@link #getMinValueDateTime() <em>Min Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime minValueDateTime;

	/**
	 * The cached value of the '{@link #getMinValueTime() <em>Min Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueTime()
	 * @generated
	 * @ordered
	 */
	protected Time minValueTime;

	/**
	 * The cached value of the '{@link #getMinValueCode() <em>Min Value Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueCode()
	 * @generated
	 * @ordered
	 */
	protected Code minValueCode;

	/**
	 * The cached value of the '{@link #getMinValueOid() <em>Min Value Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueOid()
	 * @generated
	 * @ordered
	 */
	protected Oid minValueOid;

	/**
	 * The cached value of the '{@link #getMinValueUuid() <em>Min Value Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueUuid()
	 * @generated
	 * @ordered
	 */
	protected Uuid minValueUuid;

	/**
	 * The cached value of the '{@link #getMinValueId() <em>Min Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueId()
	 * @generated
	 * @ordered
	 */
	protected Id minValueId;

	/**
	 * The cached value of the '{@link #getMinValueUnsignedInt() <em>Min Value Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt minValueUnsignedInt;

	/**
	 * The cached value of the '{@link #getMinValuePositiveInt() <em>Min Value Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValuePositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt minValuePositiveInt;

	/**
	 * The cached value of the '{@link #getMinValueAnnotation() <em>Min Value Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation minValueAnnotation;

	/**
	 * The cached value of the '{@link #getMinValueAttachment() <em>Min Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment minValueAttachment;

	/**
	 * The cached value of the '{@link #getMinValueIdentifier() <em>Min Value Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier minValueIdentifier;

	/**
	 * The cached value of the '{@link #getMinValueCodeableConcept() <em>Min Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept minValueCodeableConcept;

	/**
	 * The cached value of the '{@link #getMinValueCoding() <em>Min Value Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding minValueCoding;

	/**
	 * The cached value of the '{@link #getMinValueQuantity() <em>Min Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity minValueQuantity;

	/**
	 * The cached value of the '{@link #getMinValueRange() <em>Min Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueRange()
	 * @generated
	 * @ordered
	 */
	protected Range minValueRange;

	/**
	 * The cached value of the '{@link #getMinValuePeriod() <em>Min Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValuePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period minValuePeriod;

	/**
	 * The cached value of the '{@link #getMinValueRatio() <em>Min Value Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio minValueRatio;

	/**
	 * The cached value of the '{@link #getMinValueReference() <em>Min Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueReference()
	 * @generated
	 * @ordered
	 */
	protected Reference minValueReference;

	/**
	 * The cached value of the '{@link #getMinValueSampledData() <em>Min Value Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueSampledData()
	 * @generated
	 * @ordered
	 */
	protected SampledData minValueSampledData;

	/**
	 * The cached value of the '{@link #getMinValueSignature() <em>Min Value Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature minValueSignature;

	/**
	 * The cached value of the '{@link #getMinValueHumanName() <em>Min Value Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueHumanName()
	 * @generated
	 * @ordered
	 */
	protected HumanName minValueHumanName;

	/**
	 * The cached value of the '{@link #getMinValueAddress() <em>Min Value Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueAddress()
	 * @generated
	 * @ordered
	 */
	protected Address minValueAddress;

	/**
	 * The cached value of the '{@link #getMinValueContactPoint() <em>Min Value Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueContactPoint()
	 * @generated
	 * @ordered
	 */
	protected ContactPoint minValueContactPoint;

	/**
	 * The cached value of the '{@link #getMinValueTiming() <em>Min Value Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing minValueTiming;

	/**
	 * The cached value of the '{@link #getMinValueMeta() <em>Min Value Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValueMeta()
	 * @generated
	 * @ordered
	 */
	protected Meta minValueMeta;

	/**
	 * The cached value of the '{@link #getMaxValueBoolean() <em>Max Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean maxValueBoolean;

	/**
	 * The cached value of the '{@link #getMaxValueInteger() <em>Max Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer maxValueInteger;

	/**
	 * The cached value of the '{@link #getMaxValueDecimal() <em>Max Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal maxValueDecimal;

	/**
	 * The cached value of the '{@link #getMaxValueBase64Binary() <em>Max Value Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueBase64Binary()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary maxValueBase64Binary;

	/**
	 * The cached value of the '{@link #getMaxValueInstant() <em>Max Value Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueInstant()
	 * @generated
	 * @ordered
	 */
	protected Instant maxValueInstant;

	/**
	 * The cached value of the '{@link #getMaxValueString() <em>Max Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String maxValueString;

	/**
	 * The cached value of the '{@link #getMaxValueUri() <em>Max Value Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueUri()
	 * @generated
	 * @ordered
	 */
	protected Uri maxValueUri;

	/**
	 * The cached value of the '{@link #getMaxValueDate() <em>Max Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueDate()
	 * @generated
	 * @ordered
	 */
	protected Date maxValueDate;

	/**
	 * The cached value of the '{@link #getMaxValueDateTime() <em>Max Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime maxValueDateTime;

	/**
	 * The cached value of the '{@link #getMaxValueTime() <em>Max Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueTime()
	 * @generated
	 * @ordered
	 */
	protected Time maxValueTime;

	/**
	 * The cached value of the '{@link #getMaxValueCode() <em>Max Value Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueCode()
	 * @generated
	 * @ordered
	 */
	protected Code maxValueCode;

	/**
	 * The cached value of the '{@link #getMaxValueOid() <em>Max Value Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueOid()
	 * @generated
	 * @ordered
	 */
	protected Oid maxValueOid;

	/**
	 * The cached value of the '{@link #getMaxValueUuid() <em>Max Value Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueUuid()
	 * @generated
	 * @ordered
	 */
	protected Uuid maxValueUuid;

	/**
	 * The cached value of the '{@link #getMaxValueId() <em>Max Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueId()
	 * @generated
	 * @ordered
	 */
	protected Id maxValueId;

	/**
	 * The cached value of the '{@link #getMaxValueUnsignedInt() <em>Max Value Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt maxValueUnsignedInt;

	/**
	 * The cached value of the '{@link #getMaxValuePositiveInt() <em>Max Value Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValuePositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt maxValuePositiveInt;

	/**
	 * The cached value of the '{@link #getMaxValueAnnotation() <em>Max Value Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation maxValueAnnotation;

	/**
	 * The cached value of the '{@link #getMaxValueAttachment() <em>Max Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment maxValueAttachment;

	/**
	 * The cached value of the '{@link #getMaxValueIdentifier() <em>Max Value Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier maxValueIdentifier;

	/**
	 * The cached value of the '{@link #getMaxValueCodeableConcept() <em>Max Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept maxValueCodeableConcept;

	/**
	 * The cached value of the '{@link #getMaxValueCoding() <em>Max Value Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding maxValueCoding;

	/**
	 * The cached value of the '{@link #getMaxValueQuantity() <em>Max Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity maxValueQuantity;

	/**
	 * The cached value of the '{@link #getMaxValueRange() <em>Max Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueRange()
	 * @generated
	 * @ordered
	 */
	protected Range maxValueRange;

	/**
	 * The cached value of the '{@link #getMaxValuePeriod() <em>Max Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValuePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period maxValuePeriod;

	/**
	 * The cached value of the '{@link #getMaxValueRatio() <em>Max Value Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio maxValueRatio;

	/**
	 * The cached value of the '{@link #getMaxValueReference() <em>Max Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueReference()
	 * @generated
	 * @ordered
	 */
	protected Reference maxValueReference;

	/**
	 * The cached value of the '{@link #getMaxValueSampledData() <em>Max Value Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueSampledData()
	 * @generated
	 * @ordered
	 */
	protected SampledData maxValueSampledData;

	/**
	 * The cached value of the '{@link #getMaxValueSignature() <em>Max Value Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature maxValueSignature;

	/**
	 * The cached value of the '{@link #getMaxValueHumanName() <em>Max Value Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueHumanName()
	 * @generated
	 * @ordered
	 */
	protected HumanName maxValueHumanName;

	/**
	 * The cached value of the '{@link #getMaxValueAddress() <em>Max Value Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueAddress()
	 * @generated
	 * @ordered
	 */
	protected Address maxValueAddress;

	/**
	 * The cached value of the '{@link #getMaxValueContactPoint() <em>Max Value Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueContactPoint()
	 * @generated
	 * @ordered
	 */
	protected ContactPoint maxValueContactPoint;

	/**
	 * The cached value of the '{@link #getMaxValueTiming() <em>Max Value Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing maxValueTiming;

	/**
	 * The cached value of the '{@link #getMaxValueMeta() <em>Max Value Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValueMeta()
	 * @generated
	 * @ordered
	 */
	protected Meta maxValueMeta;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer maxLength;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Id> condition;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinitionConstraint> constraint;

	/**
	 * The cached value of the '{@link #getMustSupport() <em>Must Support</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustSupport()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean mustSupport;

	/**
	 * The cached value of the '{@link #getIsModifier() <em>Is Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsModifier()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isModifier;

	/**
	 * The cached value of the '{@link #getIsSummary() <em>Is Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSummary()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isSummary;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected ElementDefinitionBinding binding;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinitionMapping> mapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getElementDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(org.hl7.fhir.String newPath, NotificationChain msgs) {
		org.hl7.fhir.String oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(org.hl7.fhir.String newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyRepresentation> getRepresentation() {
		if (representation == null) {
			representation = new EObjectContainmentEList<PropertyRepresentation>(PropertyRepresentation.class, this, FhirPackage.ELEMENT_DEFINITION__REPRESENTATION);
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(org.hl7.fhir.String newLabel, NotificationChain msgs) {
		org.hl7.fhir.String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(org.hl7.fhir.String newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getCode() {
		if (code == null) {
			code = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.ELEMENT_DEFINITION__CODE);
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionSlicing getSlicing() {
		return slicing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlicing(ElementDefinitionSlicing newSlicing, NotificationChain msgs) {
		ElementDefinitionSlicing oldSlicing = slicing;
		slicing = newSlicing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__SLICING, oldSlicing, newSlicing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlicing(ElementDefinitionSlicing newSlicing) {
		if (newSlicing != slicing) {
			NotificationChain msgs = null;
			if (slicing != null)
				msgs = ((InternalEObject)slicing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__SLICING, null, msgs);
			if (newSlicing != null)
				msgs = ((InternalEObject)newSlicing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__SLICING, null, msgs);
			msgs = basicSetSlicing(newSlicing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__SLICING, newSlicing, newSlicing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getShort() {
		return short_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShort(org.hl7.fhir.String newShort, NotificationChain msgs) {
		org.hl7.fhir.String oldShort = short_;
		short_ = newShort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__SHORT, oldShort, newShort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShort(org.hl7.fhir.String newShort) {
		if (newShort != short_) {
			NotificationChain msgs = null;
			if (short_ != null)
				msgs = ((InternalEObject)short_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__SHORT, null, msgs);
			if (newShort != null)
				msgs = ((InternalEObject)newShort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__SHORT, null, msgs);
			msgs = basicSetShort(newShort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__SHORT, newShort, newShort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(org.hl7.fhir.String newDefinition, NotificationChain msgs) {
		org.hl7.fhir.String oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(org.hl7.fhir.String newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComments(org.hl7.fhir.String newComments, NotificationChain msgs) {
		org.hl7.fhir.String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__COMMENTS, oldComments, newComments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(org.hl7.fhir.String newComments) {
		if (newComments != comments) {
			NotificationChain msgs = null;
			if (comments != null)
				msgs = ((InternalEObject)comments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__COMMENTS, null, msgs);
			if (newComments != null)
				msgs = ((InternalEObject)newComments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__COMMENTS, null, msgs);
			msgs = basicSetComments(newComments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__COMMENTS, newComments, newComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(org.hl7.fhir.String newRequirements, NotificationChain msgs) {
		org.hl7.fhir.String oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__REQUIREMENTS, oldRequirements, newRequirements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirements(org.hl7.fhir.String newRequirements) {
		if (newRequirements != requirements) {
			NotificationChain msgs = null;
			if (requirements != null)
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__REQUIREMENTS, newRequirements, newRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getAlias() {
		if (alias == null) {
			alias = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.ELEMENT_DEFINITION__ALIAS);
		}
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(org.hl7.fhir.Integer newMin, NotificationChain msgs) {
		org.hl7.fhir.Integer oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN, oldMin, newMin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(org.hl7.fhir.Integer newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN, newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(org.hl7.fhir.String newMax, NotificationChain msgs) {
		org.hl7.fhir.String oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX, oldMax, newMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(org.hl7.fhir.String newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX, newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementDefinitionType> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<ElementDefinitionType>(ElementDefinitionType.class, this, FhirPackage.ELEMENT_DEFINITION__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getNameReference() {
		return nameReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameReference(org.hl7.fhir.String newNameReference, NotificationChain msgs) {
		org.hl7.fhir.String oldNameReference = nameReference;
		nameReference = newNameReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__NAME_REFERENCE, oldNameReference, newNameReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameReference(org.hl7.fhir.String newNameReference) {
		if (newNameReference != nameReference) {
			NotificationChain msgs = null;
			if (nameReference != null)
				msgs = ((InternalEObject)nameReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__NAME_REFERENCE, null, msgs);
			if (newNameReference != null)
				msgs = ((InternalEObject)newNameReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__NAME_REFERENCE, null, msgs);
			msgs = basicSetNameReference(newNameReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__NAME_REFERENCE, newNameReference, newNameReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getDefaultValueBoolean() {
		return defaultValueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueBoolean(org.hl7.fhir.Boolean newDefaultValueBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldDefaultValueBoolean = defaultValueBoolean;
		defaultValueBoolean = newDefaultValueBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BOOLEAN, oldDefaultValueBoolean, newDefaultValueBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueBoolean(org.hl7.fhir.Boolean newDefaultValueBoolean) {
		if (newDefaultValueBoolean != defaultValueBoolean) {
			NotificationChain msgs = null;
			if (defaultValueBoolean != null)
				msgs = ((InternalEObject)defaultValueBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BOOLEAN, null, msgs);
			if (newDefaultValueBoolean != null)
				msgs = ((InternalEObject)newDefaultValueBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BOOLEAN, null, msgs);
			msgs = basicSetDefaultValueBoolean(newDefaultValueBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BOOLEAN, newDefaultValueBoolean, newDefaultValueBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getDefaultValueInteger() {
		return defaultValueInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueInteger(org.hl7.fhir.Integer newDefaultValueInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldDefaultValueInteger = defaultValueInteger;
		defaultValueInteger = newDefaultValueInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INTEGER, oldDefaultValueInteger, newDefaultValueInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueInteger(org.hl7.fhir.Integer newDefaultValueInteger) {
		if (newDefaultValueInteger != defaultValueInteger) {
			NotificationChain msgs = null;
			if (defaultValueInteger != null)
				msgs = ((InternalEObject)defaultValueInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INTEGER, null, msgs);
			if (newDefaultValueInteger != null)
				msgs = ((InternalEObject)newDefaultValueInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INTEGER, null, msgs);
			msgs = basicSetDefaultValueInteger(newDefaultValueInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INTEGER, newDefaultValueInteger, newDefaultValueInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getDefaultValueDecimal() {
		return defaultValueDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueDecimal(Decimal newDefaultValueDecimal, NotificationChain msgs) {
		Decimal oldDefaultValueDecimal = defaultValueDecimal;
		defaultValueDecimal = newDefaultValueDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DECIMAL, oldDefaultValueDecimal, newDefaultValueDecimal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueDecimal(Decimal newDefaultValueDecimal) {
		if (newDefaultValueDecimal != defaultValueDecimal) {
			NotificationChain msgs = null;
			if (defaultValueDecimal != null)
				msgs = ((InternalEObject)defaultValueDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DECIMAL, null, msgs);
			if (newDefaultValueDecimal != null)
				msgs = ((InternalEObject)newDefaultValueDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DECIMAL, null, msgs);
			msgs = basicSetDefaultValueDecimal(newDefaultValueDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DECIMAL, newDefaultValueDecimal, newDefaultValueDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary getDefaultValueBase64Binary() {
		return defaultValueBase64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueBase64Binary(Base64Binary newDefaultValueBase64Binary, NotificationChain msgs) {
		Base64Binary oldDefaultValueBase64Binary = defaultValueBase64Binary;
		defaultValueBase64Binary = newDefaultValueBase64Binary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BASE64_BINARY, oldDefaultValueBase64Binary, newDefaultValueBase64Binary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueBase64Binary(Base64Binary newDefaultValueBase64Binary) {
		if (newDefaultValueBase64Binary != defaultValueBase64Binary) {
			NotificationChain msgs = null;
			if (defaultValueBase64Binary != null)
				msgs = ((InternalEObject)defaultValueBase64Binary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BASE64_BINARY, null, msgs);
			if (newDefaultValueBase64Binary != null)
				msgs = ((InternalEObject)newDefaultValueBase64Binary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BASE64_BINARY, null, msgs);
			msgs = basicSetDefaultValueBase64Binary(newDefaultValueBase64Binary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BASE64_BINARY, newDefaultValueBase64Binary, newDefaultValueBase64Binary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getDefaultValueInstant() {
		return defaultValueInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueInstant(Instant newDefaultValueInstant, NotificationChain msgs) {
		Instant oldDefaultValueInstant = defaultValueInstant;
		defaultValueInstant = newDefaultValueInstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INSTANT, oldDefaultValueInstant, newDefaultValueInstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueInstant(Instant newDefaultValueInstant) {
		if (newDefaultValueInstant != defaultValueInstant) {
			NotificationChain msgs = null;
			if (defaultValueInstant != null)
				msgs = ((InternalEObject)defaultValueInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INSTANT, null, msgs);
			if (newDefaultValueInstant != null)
				msgs = ((InternalEObject)newDefaultValueInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INSTANT, null, msgs);
			msgs = basicSetDefaultValueInstant(newDefaultValueInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INSTANT, newDefaultValueInstant, newDefaultValueInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDefaultValueString() {
		return defaultValueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueString(org.hl7.fhir.String newDefaultValueString, NotificationChain msgs) {
		org.hl7.fhir.String oldDefaultValueString = defaultValueString;
		defaultValueString = newDefaultValueString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_STRING, oldDefaultValueString, newDefaultValueString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueString(org.hl7.fhir.String newDefaultValueString) {
		if (newDefaultValueString != defaultValueString) {
			NotificationChain msgs = null;
			if (defaultValueString != null)
				msgs = ((InternalEObject)defaultValueString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_STRING, null, msgs);
			if (newDefaultValueString != null)
				msgs = ((InternalEObject)newDefaultValueString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_STRING, null, msgs);
			msgs = basicSetDefaultValueString(newDefaultValueString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_STRING, newDefaultValueString, newDefaultValueString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getDefaultValueUri() {
		return defaultValueUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueUri(Uri newDefaultValueUri, NotificationChain msgs) {
		Uri oldDefaultValueUri = defaultValueUri;
		defaultValueUri = newDefaultValueUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URI, oldDefaultValueUri, newDefaultValueUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueUri(Uri newDefaultValueUri) {
		if (newDefaultValueUri != defaultValueUri) {
			NotificationChain msgs = null;
			if (defaultValueUri != null)
				msgs = ((InternalEObject)defaultValueUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URI, null, msgs);
			if (newDefaultValueUri != null)
				msgs = ((InternalEObject)newDefaultValueUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URI, null, msgs);
			msgs = basicSetDefaultValueUri(newDefaultValueUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URI, newDefaultValueUri, newDefaultValueUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDefaultValueDate() {
		return defaultValueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueDate(Date newDefaultValueDate, NotificationChain msgs) {
		Date oldDefaultValueDate = defaultValueDate;
		defaultValueDate = newDefaultValueDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE, oldDefaultValueDate, newDefaultValueDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueDate(Date newDefaultValueDate) {
		if (newDefaultValueDate != defaultValueDate) {
			NotificationChain msgs = null;
			if (defaultValueDate != null)
				msgs = ((InternalEObject)defaultValueDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE, null, msgs);
			if (newDefaultValueDate != null)
				msgs = ((InternalEObject)newDefaultValueDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE, null, msgs);
			msgs = basicSetDefaultValueDate(newDefaultValueDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE, newDefaultValueDate, newDefaultValueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDefaultValueDateTime() {
		return defaultValueDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueDateTime(DateTime newDefaultValueDateTime, NotificationChain msgs) {
		DateTime oldDefaultValueDateTime = defaultValueDateTime;
		defaultValueDateTime = newDefaultValueDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE_TIME, oldDefaultValueDateTime, newDefaultValueDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueDateTime(DateTime newDefaultValueDateTime) {
		if (newDefaultValueDateTime != defaultValueDateTime) {
			NotificationChain msgs = null;
			if (defaultValueDateTime != null)
				msgs = ((InternalEObject)defaultValueDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE_TIME, null, msgs);
			if (newDefaultValueDateTime != null)
				msgs = ((InternalEObject)newDefaultValueDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE_TIME, null, msgs);
			msgs = basicSetDefaultValueDateTime(newDefaultValueDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE_TIME, newDefaultValueDateTime, newDefaultValueDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getDefaultValueTime() {
		return defaultValueTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueTime(Time newDefaultValueTime, NotificationChain msgs) {
		Time oldDefaultValueTime = defaultValueTime;
		defaultValueTime = newDefaultValueTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIME, oldDefaultValueTime, newDefaultValueTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueTime(Time newDefaultValueTime) {
		if (newDefaultValueTime != defaultValueTime) {
			NotificationChain msgs = null;
			if (defaultValueTime != null)
				msgs = ((InternalEObject)defaultValueTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIME, null, msgs);
			if (newDefaultValueTime != null)
				msgs = ((InternalEObject)newDefaultValueTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIME, null, msgs);
			msgs = basicSetDefaultValueTime(newDefaultValueTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIME, newDefaultValueTime, newDefaultValueTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getDefaultValueCode() {
		return defaultValueCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueCode(Code newDefaultValueCode, NotificationChain msgs) {
		Code oldDefaultValueCode = defaultValueCode;
		defaultValueCode = newDefaultValueCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODE, oldDefaultValueCode, newDefaultValueCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueCode(Code newDefaultValueCode) {
		if (newDefaultValueCode != defaultValueCode) {
			NotificationChain msgs = null;
			if (defaultValueCode != null)
				msgs = ((InternalEObject)defaultValueCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODE, null, msgs);
			if (newDefaultValueCode != null)
				msgs = ((InternalEObject)newDefaultValueCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODE, null, msgs);
			msgs = basicSetDefaultValueCode(newDefaultValueCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODE, newDefaultValueCode, newDefaultValueCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getDefaultValueOid() {
		return defaultValueOid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueOid(Oid newDefaultValueOid, NotificationChain msgs) {
		Oid oldDefaultValueOid = defaultValueOid;
		defaultValueOid = newDefaultValueOid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_OID, oldDefaultValueOid, newDefaultValueOid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueOid(Oid newDefaultValueOid) {
		if (newDefaultValueOid != defaultValueOid) {
			NotificationChain msgs = null;
			if (defaultValueOid != null)
				msgs = ((InternalEObject)defaultValueOid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_OID, null, msgs);
			if (newDefaultValueOid != null)
				msgs = ((InternalEObject)newDefaultValueOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_OID, null, msgs);
			msgs = basicSetDefaultValueOid(newDefaultValueOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_OID, newDefaultValueOid, newDefaultValueOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uuid getDefaultValueUuid() {
		return defaultValueUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueUuid(Uuid newDefaultValueUuid, NotificationChain msgs) {
		Uuid oldDefaultValueUuid = defaultValueUuid;
		defaultValueUuid = newDefaultValueUuid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UUID, oldDefaultValueUuid, newDefaultValueUuid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueUuid(Uuid newDefaultValueUuid) {
		if (newDefaultValueUuid != defaultValueUuid) {
			NotificationChain msgs = null;
			if (defaultValueUuid != null)
				msgs = ((InternalEObject)defaultValueUuid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UUID, null, msgs);
			if (newDefaultValueUuid != null)
				msgs = ((InternalEObject)newDefaultValueUuid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UUID, null, msgs);
			msgs = basicSetDefaultValueUuid(newDefaultValueUuid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UUID, newDefaultValueUuid, newDefaultValueUuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getDefaultValueId() {
		return defaultValueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueId(Id newDefaultValueId, NotificationChain msgs) {
		Id oldDefaultValueId = defaultValueId;
		defaultValueId = newDefaultValueId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ID, oldDefaultValueId, newDefaultValueId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueId(Id newDefaultValueId) {
		if (newDefaultValueId != defaultValueId) {
			NotificationChain msgs = null;
			if (defaultValueId != null)
				msgs = ((InternalEObject)defaultValueId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ID, null, msgs);
			if (newDefaultValueId != null)
				msgs = ((InternalEObject)newDefaultValueId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ID, null, msgs);
			msgs = basicSetDefaultValueId(newDefaultValueId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ID, newDefaultValueId, newDefaultValueId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getDefaultValueUnsignedInt() {
		return defaultValueUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueUnsignedInt(UnsignedInt newDefaultValueUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldDefaultValueUnsignedInt = defaultValueUnsignedInt;
		defaultValueUnsignedInt = newDefaultValueUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UNSIGNED_INT, oldDefaultValueUnsignedInt, newDefaultValueUnsignedInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueUnsignedInt(UnsignedInt newDefaultValueUnsignedInt) {
		if (newDefaultValueUnsignedInt != defaultValueUnsignedInt) {
			NotificationChain msgs = null;
			if (defaultValueUnsignedInt != null)
				msgs = ((InternalEObject)defaultValueUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UNSIGNED_INT, null, msgs);
			if (newDefaultValueUnsignedInt != null)
				msgs = ((InternalEObject)newDefaultValueUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UNSIGNED_INT, null, msgs);
			msgs = basicSetDefaultValueUnsignedInt(newDefaultValueUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UNSIGNED_INT, newDefaultValueUnsignedInt, newDefaultValueUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getDefaultValuePositiveInt() {
		return defaultValuePositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValuePositiveInt(PositiveInt newDefaultValuePositiveInt, NotificationChain msgs) {
		PositiveInt oldDefaultValuePositiveInt = defaultValuePositiveInt;
		defaultValuePositiveInt = newDefaultValuePositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_POSITIVE_INT, oldDefaultValuePositiveInt, newDefaultValuePositiveInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValuePositiveInt(PositiveInt newDefaultValuePositiveInt) {
		if (newDefaultValuePositiveInt != defaultValuePositiveInt) {
			NotificationChain msgs = null;
			if (defaultValuePositiveInt != null)
				msgs = ((InternalEObject)defaultValuePositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_POSITIVE_INT, null, msgs);
			if (newDefaultValuePositiveInt != null)
				msgs = ((InternalEObject)newDefaultValuePositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_POSITIVE_INT, null, msgs);
			msgs = basicSetDefaultValuePositiveInt(newDefaultValuePositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_POSITIVE_INT, newDefaultValuePositiveInt, newDefaultValuePositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getDefaultValueAnnotation() {
		return defaultValueAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueAnnotation(Annotation newDefaultValueAnnotation, NotificationChain msgs) {
		Annotation oldDefaultValueAnnotation = defaultValueAnnotation;
		defaultValueAnnotation = newDefaultValueAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ANNOTATION, oldDefaultValueAnnotation, newDefaultValueAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueAnnotation(Annotation newDefaultValueAnnotation) {
		if (newDefaultValueAnnotation != defaultValueAnnotation) {
			NotificationChain msgs = null;
			if (defaultValueAnnotation != null)
				msgs = ((InternalEObject)defaultValueAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ANNOTATION, null, msgs);
			if (newDefaultValueAnnotation != null)
				msgs = ((InternalEObject)newDefaultValueAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ANNOTATION, null, msgs);
			msgs = basicSetDefaultValueAnnotation(newDefaultValueAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ANNOTATION, newDefaultValueAnnotation, newDefaultValueAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getDefaultValueAttachment() {
		return defaultValueAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueAttachment(Attachment newDefaultValueAttachment, NotificationChain msgs) {
		Attachment oldDefaultValueAttachment = defaultValueAttachment;
		defaultValueAttachment = newDefaultValueAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ATTACHMENT, oldDefaultValueAttachment, newDefaultValueAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueAttachment(Attachment newDefaultValueAttachment) {
		if (newDefaultValueAttachment != defaultValueAttachment) {
			NotificationChain msgs = null;
			if (defaultValueAttachment != null)
				msgs = ((InternalEObject)defaultValueAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ATTACHMENT, null, msgs);
			if (newDefaultValueAttachment != null)
				msgs = ((InternalEObject)newDefaultValueAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ATTACHMENT, null, msgs);
			msgs = basicSetDefaultValueAttachment(newDefaultValueAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ATTACHMENT, newDefaultValueAttachment, newDefaultValueAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getDefaultValueIdentifier() {
		return defaultValueIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueIdentifier(Identifier newDefaultValueIdentifier, NotificationChain msgs) {
		Identifier oldDefaultValueIdentifier = defaultValueIdentifier;
		defaultValueIdentifier = newDefaultValueIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_IDENTIFIER, oldDefaultValueIdentifier, newDefaultValueIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueIdentifier(Identifier newDefaultValueIdentifier) {
		if (newDefaultValueIdentifier != defaultValueIdentifier) {
			NotificationChain msgs = null;
			if (defaultValueIdentifier != null)
				msgs = ((InternalEObject)defaultValueIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_IDENTIFIER, null, msgs);
			if (newDefaultValueIdentifier != null)
				msgs = ((InternalEObject)newDefaultValueIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_IDENTIFIER, null, msgs);
			msgs = basicSetDefaultValueIdentifier(newDefaultValueIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_IDENTIFIER, newDefaultValueIdentifier, newDefaultValueIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDefaultValueCodeableConcept() {
		return defaultValueCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueCodeableConcept(CodeableConcept newDefaultValueCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldDefaultValueCodeableConcept = defaultValueCodeableConcept;
		defaultValueCodeableConcept = newDefaultValueCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODEABLE_CONCEPT, oldDefaultValueCodeableConcept, newDefaultValueCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueCodeableConcept(CodeableConcept newDefaultValueCodeableConcept) {
		if (newDefaultValueCodeableConcept != defaultValueCodeableConcept) {
			NotificationChain msgs = null;
			if (defaultValueCodeableConcept != null)
				msgs = ((InternalEObject)defaultValueCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODEABLE_CONCEPT, null, msgs);
			if (newDefaultValueCodeableConcept != null)
				msgs = ((InternalEObject)newDefaultValueCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetDefaultValueCodeableConcept(newDefaultValueCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODEABLE_CONCEPT, newDefaultValueCodeableConcept, newDefaultValueCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getDefaultValueCoding() {
		return defaultValueCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueCoding(Coding newDefaultValueCoding, NotificationChain msgs) {
		Coding oldDefaultValueCoding = defaultValueCoding;
		defaultValueCoding = newDefaultValueCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODING, oldDefaultValueCoding, newDefaultValueCoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueCoding(Coding newDefaultValueCoding) {
		if (newDefaultValueCoding != defaultValueCoding) {
			NotificationChain msgs = null;
			if (defaultValueCoding != null)
				msgs = ((InternalEObject)defaultValueCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODING, null, msgs);
			if (newDefaultValueCoding != null)
				msgs = ((InternalEObject)newDefaultValueCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODING, null, msgs);
			msgs = basicSetDefaultValueCoding(newDefaultValueCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODING, newDefaultValueCoding, newDefaultValueCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getDefaultValueQuantity() {
		return defaultValueQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueQuantity(Quantity newDefaultValueQuantity, NotificationChain msgs) {
		Quantity oldDefaultValueQuantity = defaultValueQuantity;
		defaultValueQuantity = newDefaultValueQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_QUANTITY, oldDefaultValueQuantity, newDefaultValueQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueQuantity(Quantity newDefaultValueQuantity) {
		if (newDefaultValueQuantity != defaultValueQuantity) {
			NotificationChain msgs = null;
			if (defaultValueQuantity != null)
				msgs = ((InternalEObject)defaultValueQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_QUANTITY, null, msgs);
			if (newDefaultValueQuantity != null)
				msgs = ((InternalEObject)newDefaultValueQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_QUANTITY, null, msgs);
			msgs = basicSetDefaultValueQuantity(newDefaultValueQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_QUANTITY, newDefaultValueQuantity, newDefaultValueQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getDefaultValueRange() {
		return defaultValueRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueRange(Range newDefaultValueRange, NotificationChain msgs) {
		Range oldDefaultValueRange = defaultValueRange;
		defaultValueRange = newDefaultValueRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RANGE, oldDefaultValueRange, newDefaultValueRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueRange(Range newDefaultValueRange) {
		if (newDefaultValueRange != defaultValueRange) {
			NotificationChain msgs = null;
			if (defaultValueRange != null)
				msgs = ((InternalEObject)defaultValueRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RANGE, null, msgs);
			if (newDefaultValueRange != null)
				msgs = ((InternalEObject)newDefaultValueRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RANGE, null, msgs);
			msgs = basicSetDefaultValueRange(newDefaultValueRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RANGE, newDefaultValueRange, newDefaultValueRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getDefaultValuePeriod() {
		return defaultValuePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValuePeriod(Period newDefaultValuePeriod, NotificationChain msgs) {
		Period oldDefaultValuePeriod = defaultValuePeriod;
		defaultValuePeriod = newDefaultValuePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PERIOD, oldDefaultValuePeriod, newDefaultValuePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValuePeriod(Period newDefaultValuePeriod) {
		if (newDefaultValuePeriod != defaultValuePeriod) {
			NotificationChain msgs = null;
			if (defaultValuePeriod != null)
				msgs = ((InternalEObject)defaultValuePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PERIOD, null, msgs);
			if (newDefaultValuePeriod != null)
				msgs = ((InternalEObject)newDefaultValuePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PERIOD, null, msgs);
			msgs = basicSetDefaultValuePeriod(newDefaultValuePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PERIOD, newDefaultValuePeriod, newDefaultValuePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getDefaultValueRatio() {
		return defaultValueRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueRatio(Ratio newDefaultValueRatio, NotificationChain msgs) {
		Ratio oldDefaultValueRatio = defaultValueRatio;
		defaultValueRatio = newDefaultValueRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RATIO, oldDefaultValueRatio, newDefaultValueRatio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueRatio(Ratio newDefaultValueRatio) {
		if (newDefaultValueRatio != defaultValueRatio) {
			NotificationChain msgs = null;
			if (defaultValueRatio != null)
				msgs = ((InternalEObject)defaultValueRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RATIO, null, msgs);
			if (newDefaultValueRatio != null)
				msgs = ((InternalEObject)newDefaultValueRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RATIO, null, msgs);
			msgs = basicSetDefaultValueRatio(newDefaultValueRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RATIO, newDefaultValueRatio, newDefaultValueRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDefaultValueReference() {
		return defaultValueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueReference(Reference newDefaultValueReference, NotificationChain msgs) {
		Reference oldDefaultValueReference = defaultValueReference;
		defaultValueReference = newDefaultValueReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_REFERENCE, oldDefaultValueReference, newDefaultValueReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueReference(Reference newDefaultValueReference) {
		if (newDefaultValueReference != defaultValueReference) {
			NotificationChain msgs = null;
			if (defaultValueReference != null)
				msgs = ((InternalEObject)defaultValueReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_REFERENCE, null, msgs);
			if (newDefaultValueReference != null)
				msgs = ((InternalEObject)newDefaultValueReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_REFERENCE, null, msgs);
			msgs = basicSetDefaultValueReference(newDefaultValueReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_REFERENCE, newDefaultValueReference, newDefaultValueReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledData getDefaultValueSampledData() {
		return defaultValueSampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueSampledData(SampledData newDefaultValueSampledData, NotificationChain msgs) {
		SampledData oldDefaultValueSampledData = defaultValueSampledData;
		defaultValueSampledData = newDefaultValueSampledData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SAMPLED_DATA, oldDefaultValueSampledData, newDefaultValueSampledData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueSampledData(SampledData newDefaultValueSampledData) {
		if (newDefaultValueSampledData != defaultValueSampledData) {
			NotificationChain msgs = null;
			if (defaultValueSampledData != null)
				msgs = ((InternalEObject)defaultValueSampledData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SAMPLED_DATA, null, msgs);
			if (newDefaultValueSampledData != null)
				msgs = ((InternalEObject)newDefaultValueSampledData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SAMPLED_DATA, null, msgs);
			msgs = basicSetDefaultValueSampledData(newDefaultValueSampledData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SAMPLED_DATA, newDefaultValueSampledData, newDefaultValueSampledData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getDefaultValueSignature() {
		return defaultValueSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueSignature(Signature newDefaultValueSignature, NotificationChain msgs) {
		Signature oldDefaultValueSignature = defaultValueSignature;
		defaultValueSignature = newDefaultValueSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SIGNATURE, oldDefaultValueSignature, newDefaultValueSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueSignature(Signature newDefaultValueSignature) {
		if (newDefaultValueSignature != defaultValueSignature) {
			NotificationChain msgs = null;
			if (defaultValueSignature != null)
				msgs = ((InternalEObject)defaultValueSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SIGNATURE, null, msgs);
			if (newDefaultValueSignature != null)
				msgs = ((InternalEObject)newDefaultValueSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SIGNATURE, null, msgs);
			msgs = basicSetDefaultValueSignature(newDefaultValueSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SIGNATURE, newDefaultValueSignature, newDefaultValueSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanName getDefaultValueHumanName() {
		return defaultValueHumanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueHumanName(HumanName newDefaultValueHumanName, NotificationChain msgs) {
		HumanName oldDefaultValueHumanName = defaultValueHumanName;
		defaultValueHumanName = newDefaultValueHumanName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_HUMAN_NAME, oldDefaultValueHumanName, newDefaultValueHumanName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueHumanName(HumanName newDefaultValueHumanName) {
		if (newDefaultValueHumanName != defaultValueHumanName) {
			NotificationChain msgs = null;
			if (defaultValueHumanName != null)
				msgs = ((InternalEObject)defaultValueHumanName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_HUMAN_NAME, null, msgs);
			if (newDefaultValueHumanName != null)
				msgs = ((InternalEObject)newDefaultValueHumanName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_HUMAN_NAME, null, msgs);
			msgs = basicSetDefaultValueHumanName(newDefaultValueHumanName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_HUMAN_NAME, newDefaultValueHumanName, newDefaultValueHumanName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getDefaultValueAddress() {
		return defaultValueAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueAddress(Address newDefaultValueAddress, NotificationChain msgs) {
		Address oldDefaultValueAddress = defaultValueAddress;
		defaultValueAddress = newDefaultValueAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ADDRESS, oldDefaultValueAddress, newDefaultValueAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueAddress(Address newDefaultValueAddress) {
		if (newDefaultValueAddress != defaultValueAddress) {
			NotificationChain msgs = null;
			if (defaultValueAddress != null)
				msgs = ((InternalEObject)defaultValueAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ADDRESS, null, msgs);
			if (newDefaultValueAddress != null)
				msgs = ((InternalEObject)newDefaultValueAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ADDRESS, null, msgs);
			msgs = basicSetDefaultValueAddress(newDefaultValueAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ADDRESS, newDefaultValueAddress, newDefaultValueAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPoint getDefaultValueContactPoint() {
		return defaultValueContactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueContactPoint(ContactPoint newDefaultValueContactPoint, NotificationChain msgs) {
		ContactPoint oldDefaultValueContactPoint = defaultValueContactPoint;
		defaultValueContactPoint = newDefaultValueContactPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_POINT, oldDefaultValueContactPoint, newDefaultValueContactPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueContactPoint(ContactPoint newDefaultValueContactPoint) {
		if (newDefaultValueContactPoint != defaultValueContactPoint) {
			NotificationChain msgs = null;
			if (defaultValueContactPoint != null)
				msgs = ((InternalEObject)defaultValueContactPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_POINT, null, msgs);
			if (newDefaultValueContactPoint != null)
				msgs = ((InternalEObject)newDefaultValueContactPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_POINT, null, msgs);
			msgs = basicSetDefaultValueContactPoint(newDefaultValueContactPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_POINT, newDefaultValueContactPoint, newDefaultValueContactPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getDefaultValueTiming() {
		return defaultValueTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueTiming(Timing newDefaultValueTiming, NotificationChain msgs) {
		Timing oldDefaultValueTiming = defaultValueTiming;
		defaultValueTiming = newDefaultValueTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIMING, oldDefaultValueTiming, newDefaultValueTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueTiming(Timing newDefaultValueTiming) {
		if (newDefaultValueTiming != defaultValueTiming) {
			NotificationChain msgs = null;
			if (defaultValueTiming != null)
				msgs = ((InternalEObject)defaultValueTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIMING, null, msgs);
			if (newDefaultValueTiming != null)
				msgs = ((InternalEObject)newDefaultValueTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIMING, null, msgs);
			msgs = basicSetDefaultValueTiming(newDefaultValueTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIMING, newDefaultValueTiming, newDefaultValueTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta getDefaultValueMeta() {
		return defaultValueMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValueMeta(Meta newDefaultValueMeta, NotificationChain msgs) {
		Meta oldDefaultValueMeta = defaultValueMeta;
		defaultValueMeta = newDefaultValueMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_META, oldDefaultValueMeta, newDefaultValueMeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueMeta(Meta newDefaultValueMeta) {
		if (newDefaultValueMeta != defaultValueMeta) {
			NotificationChain msgs = null;
			if (defaultValueMeta != null)
				msgs = ((InternalEObject)defaultValueMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_META, null, msgs);
			if (newDefaultValueMeta != null)
				msgs = ((InternalEObject)newDefaultValueMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_META, null, msgs);
			msgs = basicSetDefaultValueMeta(newDefaultValueMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_META, newDefaultValueMeta, newDefaultValueMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getMeaningWhenMissing() {
		return meaningWhenMissing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeaningWhenMissing(org.hl7.fhir.String newMeaningWhenMissing, NotificationChain msgs) {
		org.hl7.fhir.String oldMeaningWhenMissing = meaningWhenMissing;
		meaningWhenMissing = newMeaningWhenMissing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING, oldMeaningWhenMissing, newMeaningWhenMissing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeaningWhenMissing(org.hl7.fhir.String newMeaningWhenMissing) {
		if (newMeaningWhenMissing != meaningWhenMissing) {
			NotificationChain msgs = null;
			if (meaningWhenMissing != null)
				msgs = ((InternalEObject)meaningWhenMissing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING, null, msgs);
			if (newMeaningWhenMissing != null)
				msgs = ((InternalEObject)newMeaningWhenMissing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING, null, msgs);
			msgs = basicSetMeaningWhenMissing(newMeaningWhenMissing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING, newMeaningWhenMissing, newMeaningWhenMissing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getFixedBoolean() {
		return fixedBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedBoolean(org.hl7.fhir.Boolean newFixedBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldFixedBoolean = fixedBoolean;
		fixedBoolean = newFixedBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_BOOLEAN, oldFixedBoolean, newFixedBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedBoolean(org.hl7.fhir.Boolean newFixedBoolean) {
		if (newFixedBoolean != fixedBoolean) {
			NotificationChain msgs = null;
			if (fixedBoolean != null)
				msgs = ((InternalEObject)fixedBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_BOOLEAN, null, msgs);
			if (newFixedBoolean != null)
				msgs = ((InternalEObject)newFixedBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_BOOLEAN, null, msgs);
			msgs = basicSetFixedBoolean(newFixedBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_BOOLEAN, newFixedBoolean, newFixedBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getFixedInteger() {
		return fixedInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedInteger(org.hl7.fhir.Integer newFixedInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldFixedInteger = fixedInteger;
		fixedInteger = newFixedInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_INTEGER, oldFixedInteger, newFixedInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedInteger(org.hl7.fhir.Integer newFixedInteger) {
		if (newFixedInteger != fixedInteger) {
			NotificationChain msgs = null;
			if (fixedInteger != null)
				msgs = ((InternalEObject)fixedInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_INTEGER, null, msgs);
			if (newFixedInteger != null)
				msgs = ((InternalEObject)newFixedInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_INTEGER, null, msgs);
			msgs = basicSetFixedInteger(newFixedInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_INTEGER, newFixedInteger, newFixedInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getFixedDecimal() {
		return fixedDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedDecimal(Decimal newFixedDecimal, NotificationChain msgs) {
		Decimal oldFixedDecimal = fixedDecimal;
		fixedDecimal = newFixedDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DECIMAL, oldFixedDecimal, newFixedDecimal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedDecimal(Decimal newFixedDecimal) {
		if (newFixedDecimal != fixedDecimal) {
			NotificationChain msgs = null;
			if (fixedDecimal != null)
				msgs = ((InternalEObject)fixedDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DECIMAL, null, msgs);
			if (newFixedDecimal != null)
				msgs = ((InternalEObject)newFixedDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DECIMAL, null, msgs);
			msgs = basicSetFixedDecimal(newFixedDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DECIMAL, newFixedDecimal, newFixedDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary getFixedBase64Binary() {
		return fixedBase64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedBase64Binary(Base64Binary newFixedBase64Binary, NotificationChain msgs) {
		Base64Binary oldFixedBase64Binary = fixedBase64Binary;
		fixedBase64Binary = newFixedBase64Binary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_BASE64_BINARY, oldFixedBase64Binary, newFixedBase64Binary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedBase64Binary(Base64Binary newFixedBase64Binary) {
		if (newFixedBase64Binary != fixedBase64Binary) {
			NotificationChain msgs = null;
			if (fixedBase64Binary != null)
				msgs = ((InternalEObject)fixedBase64Binary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_BASE64_BINARY, null, msgs);
			if (newFixedBase64Binary != null)
				msgs = ((InternalEObject)newFixedBase64Binary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_BASE64_BINARY, null, msgs);
			msgs = basicSetFixedBase64Binary(newFixedBase64Binary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_BASE64_BINARY, newFixedBase64Binary, newFixedBase64Binary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getFixedInstant() {
		return fixedInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedInstant(Instant newFixedInstant, NotificationChain msgs) {
		Instant oldFixedInstant = fixedInstant;
		fixedInstant = newFixedInstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_INSTANT, oldFixedInstant, newFixedInstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedInstant(Instant newFixedInstant) {
		if (newFixedInstant != fixedInstant) {
			NotificationChain msgs = null;
			if (fixedInstant != null)
				msgs = ((InternalEObject)fixedInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_INSTANT, null, msgs);
			if (newFixedInstant != null)
				msgs = ((InternalEObject)newFixedInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_INSTANT, null, msgs);
			msgs = basicSetFixedInstant(newFixedInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_INSTANT, newFixedInstant, newFixedInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getFixedString() {
		return fixedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedString(org.hl7.fhir.String newFixedString, NotificationChain msgs) {
		org.hl7.fhir.String oldFixedString = fixedString;
		fixedString = newFixedString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_STRING, oldFixedString, newFixedString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedString(org.hl7.fhir.String newFixedString) {
		if (newFixedString != fixedString) {
			NotificationChain msgs = null;
			if (fixedString != null)
				msgs = ((InternalEObject)fixedString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_STRING, null, msgs);
			if (newFixedString != null)
				msgs = ((InternalEObject)newFixedString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_STRING, null, msgs);
			msgs = basicSetFixedString(newFixedString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_STRING, newFixedString, newFixedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getFixedUri() {
		return fixedUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedUri(Uri newFixedUri, NotificationChain msgs) {
		Uri oldFixedUri = fixedUri;
		fixedUri = newFixedUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_URI, oldFixedUri, newFixedUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedUri(Uri newFixedUri) {
		if (newFixedUri != fixedUri) {
			NotificationChain msgs = null;
			if (fixedUri != null)
				msgs = ((InternalEObject)fixedUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_URI, null, msgs);
			if (newFixedUri != null)
				msgs = ((InternalEObject)newFixedUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_URI, null, msgs);
			msgs = basicSetFixedUri(newFixedUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_URI, newFixedUri, newFixedUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFixedDate() {
		return fixedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedDate(Date newFixedDate, NotificationChain msgs) {
		Date oldFixedDate = fixedDate;
		fixedDate = newFixedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DATE, oldFixedDate, newFixedDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedDate(Date newFixedDate) {
		if (newFixedDate != fixedDate) {
			NotificationChain msgs = null;
			if (fixedDate != null)
				msgs = ((InternalEObject)fixedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DATE, null, msgs);
			if (newFixedDate != null)
				msgs = ((InternalEObject)newFixedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DATE, null, msgs);
			msgs = basicSetFixedDate(newFixedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DATE, newFixedDate, newFixedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getFixedDateTime() {
		return fixedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedDateTime(DateTime newFixedDateTime, NotificationChain msgs) {
		DateTime oldFixedDateTime = fixedDateTime;
		fixedDateTime = newFixedDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DATE_TIME, oldFixedDateTime, newFixedDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedDateTime(DateTime newFixedDateTime) {
		if (newFixedDateTime != fixedDateTime) {
			NotificationChain msgs = null;
			if (fixedDateTime != null)
				msgs = ((InternalEObject)fixedDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DATE_TIME, null, msgs);
			if (newFixedDateTime != null)
				msgs = ((InternalEObject)newFixedDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_DATE_TIME, null, msgs);
			msgs = basicSetFixedDateTime(newFixedDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_DATE_TIME, newFixedDateTime, newFixedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getFixedTime() {
		return fixedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedTime(Time newFixedTime, NotificationChain msgs) {
		Time oldFixedTime = fixedTime;
		fixedTime = newFixedTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_TIME, oldFixedTime, newFixedTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedTime(Time newFixedTime) {
		if (newFixedTime != fixedTime) {
			NotificationChain msgs = null;
			if (fixedTime != null)
				msgs = ((InternalEObject)fixedTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_TIME, null, msgs);
			if (newFixedTime != null)
				msgs = ((InternalEObject)newFixedTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_TIME, null, msgs);
			msgs = basicSetFixedTime(newFixedTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_TIME, newFixedTime, newFixedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getFixedCode() {
		return fixedCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedCode(Code newFixedCode, NotificationChain msgs) {
		Code oldFixedCode = fixedCode;
		fixedCode = newFixedCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CODE, oldFixedCode, newFixedCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedCode(Code newFixedCode) {
		if (newFixedCode != fixedCode) {
			NotificationChain msgs = null;
			if (fixedCode != null)
				msgs = ((InternalEObject)fixedCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CODE, null, msgs);
			if (newFixedCode != null)
				msgs = ((InternalEObject)newFixedCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CODE, null, msgs);
			msgs = basicSetFixedCode(newFixedCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CODE, newFixedCode, newFixedCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getFixedOid() {
		return fixedOid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedOid(Oid newFixedOid, NotificationChain msgs) {
		Oid oldFixedOid = fixedOid;
		fixedOid = newFixedOid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_OID, oldFixedOid, newFixedOid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedOid(Oid newFixedOid) {
		if (newFixedOid != fixedOid) {
			NotificationChain msgs = null;
			if (fixedOid != null)
				msgs = ((InternalEObject)fixedOid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_OID, null, msgs);
			if (newFixedOid != null)
				msgs = ((InternalEObject)newFixedOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_OID, null, msgs);
			msgs = basicSetFixedOid(newFixedOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_OID, newFixedOid, newFixedOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uuid getFixedUuid() {
		return fixedUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedUuid(Uuid newFixedUuid, NotificationChain msgs) {
		Uuid oldFixedUuid = fixedUuid;
		fixedUuid = newFixedUuid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_UUID, oldFixedUuid, newFixedUuid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedUuid(Uuid newFixedUuid) {
		if (newFixedUuid != fixedUuid) {
			NotificationChain msgs = null;
			if (fixedUuid != null)
				msgs = ((InternalEObject)fixedUuid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_UUID, null, msgs);
			if (newFixedUuid != null)
				msgs = ((InternalEObject)newFixedUuid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_UUID, null, msgs);
			msgs = basicSetFixedUuid(newFixedUuid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_UUID, newFixedUuid, newFixedUuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getFixedId() {
		return fixedId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedId(Id newFixedId, NotificationChain msgs) {
		Id oldFixedId = fixedId;
		fixedId = newFixedId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_ID, oldFixedId, newFixedId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedId(Id newFixedId) {
		if (newFixedId != fixedId) {
			NotificationChain msgs = null;
			if (fixedId != null)
				msgs = ((InternalEObject)fixedId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_ID, null, msgs);
			if (newFixedId != null)
				msgs = ((InternalEObject)newFixedId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_ID, null, msgs);
			msgs = basicSetFixedId(newFixedId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_ID, newFixedId, newFixedId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getFixedUnsignedInt() {
		return fixedUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedUnsignedInt(UnsignedInt newFixedUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldFixedUnsignedInt = fixedUnsignedInt;
		fixedUnsignedInt = newFixedUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_UNSIGNED_INT, oldFixedUnsignedInt, newFixedUnsignedInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedUnsignedInt(UnsignedInt newFixedUnsignedInt) {
		if (newFixedUnsignedInt != fixedUnsignedInt) {
			NotificationChain msgs = null;
			if (fixedUnsignedInt != null)
				msgs = ((InternalEObject)fixedUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_UNSIGNED_INT, null, msgs);
			if (newFixedUnsignedInt != null)
				msgs = ((InternalEObject)newFixedUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_UNSIGNED_INT, null, msgs);
			msgs = basicSetFixedUnsignedInt(newFixedUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_UNSIGNED_INT, newFixedUnsignedInt, newFixedUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getFixedPositiveInt() {
		return fixedPositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedPositiveInt(PositiveInt newFixedPositiveInt, NotificationChain msgs) {
		PositiveInt oldFixedPositiveInt = fixedPositiveInt;
		fixedPositiveInt = newFixedPositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_POSITIVE_INT, oldFixedPositiveInt, newFixedPositiveInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedPositiveInt(PositiveInt newFixedPositiveInt) {
		if (newFixedPositiveInt != fixedPositiveInt) {
			NotificationChain msgs = null;
			if (fixedPositiveInt != null)
				msgs = ((InternalEObject)fixedPositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_POSITIVE_INT, null, msgs);
			if (newFixedPositiveInt != null)
				msgs = ((InternalEObject)newFixedPositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_POSITIVE_INT, null, msgs);
			msgs = basicSetFixedPositiveInt(newFixedPositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_POSITIVE_INT, newFixedPositiveInt, newFixedPositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getFixedAnnotation() {
		return fixedAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedAnnotation(Annotation newFixedAnnotation, NotificationChain msgs) {
		Annotation oldFixedAnnotation = fixedAnnotation;
		fixedAnnotation = newFixedAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_ANNOTATION, oldFixedAnnotation, newFixedAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedAnnotation(Annotation newFixedAnnotation) {
		if (newFixedAnnotation != fixedAnnotation) {
			NotificationChain msgs = null;
			if (fixedAnnotation != null)
				msgs = ((InternalEObject)fixedAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_ANNOTATION, null, msgs);
			if (newFixedAnnotation != null)
				msgs = ((InternalEObject)newFixedAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_ANNOTATION, null, msgs);
			msgs = basicSetFixedAnnotation(newFixedAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_ANNOTATION, newFixedAnnotation, newFixedAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getFixedAttachment() {
		return fixedAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedAttachment(Attachment newFixedAttachment, NotificationChain msgs) {
		Attachment oldFixedAttachment = fixedAttachment;
		fixedAttachment = newFixedAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_ATTACHMENT, oldFixedAttachment, newFixedAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedAttachment(Attachment newFixedAttachment) {
		if (newFixedAttachment != fixedAttachment) {
			NotificationChain msgs = null;
			if (fixedAttachment != null)
				msgs = ((InternalEObject)fixedAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_ATTACHMENT, null, msgs);
			if (newFixedAttachment != null)
				msgs = ((InternalEObject)newFixedAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_ATTACHMENT, null, msgs);
			msgs = basicSetFixedAttachment(newFixedAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_ATTACHMENT, newFixedAttachment, newFixedAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getFixedIdentifier() {
		return fixedIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedIdentifier(Identifier newFixedIdentifier, NotificationChain msgs) {
		Identifier oldFixedIdentifier = fixedIdentifier;
		fixedIdentifier = newFixedIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_IDENTIFIER, oldFixedIdentifier, newFixedIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedIdentifier(Identifier newFixedIdentifier) {
		if (newFixedIdentifier != fixedIdentifier) {
			NotificationChain msgs = null;
			if (fixedIdentifier != null)
				msgs = ((InternalEObject)fixedIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_IDENTIFIER, null, msgs);
			if (newFixedIdentifier != null)
				msgs = ((InternalEObject)newFixedIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_IDENTIFIER, null, msgs);
			msgs = basicSetFixedIdentifier(newFixedIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_IDENTIFIER, newFixedIdentifier, newFixedIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getFixedCodeableConcept() {
		return fixedCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedCodeableConcept(CodeableConcept newFixedCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldFixedCodeableConcept = fixedCodeableConcept;
		fixedCodeableConcept = newFixedCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CODEABLE_CONCEPT, oldFixedCodeableConcept, newFixedCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedCodeableConcept(CodeableConcept newFixedCodeableConcept) {
		if (newFixedCodeableConcept != fixedCodeableConcept) {
			NotificationChain msgs = null;
			if (fixedCodeableConcept != null)
				msgs = ((InternalEObject)fixedCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CODEABLE_CONCEPT, null, msgs);
			if (newFixedCodeableConcept != null)
				msgs = ((InternalEObject)newFixedCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetFixedCodeableConcept(newFixedCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CODEABLE_CONCEPT, newFixedCodeableConcept, newFixedCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getFixedCoding() {
		return fixedCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedCoding(Coding newFixedCoding, NotificationChain msgs) {
		Coding oldFixedCoding = fixedCoding;
		fixedCoding = newFixedCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CODING, oldFixedCoding, newFixedCoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedCoding(Coding newFixedCoding) {
		if (newFixedCoding != fixedCoding) {
			NotificationChain msgs = null;
			if (fixedCoding != null)
				msgs = ((InternalEObject)fixedCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CODING, null, msgs);
			if (newFixedCoding != null)
				msgs = ((InternalEObject)newFixedCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CODING, null, msgs);
			msgs = basicSetFixedCoding(newFixedCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CODING, newFixedCoding, newFixedCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getFixedQuantity() {
		return fixedQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedQuantity(Quantity newFixedQuantity, NotificationChain msgs) {
		Quantity oldFixedQuantity = fixedQuantity;
		fixedQuantity = newFixedQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_QUANTITY, oldFixedQuantity, newFixedQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedQuantity(Quantity newFixedQuantity) {
		if (newFixedQuantity != fixedQuantity) {
			NotificationChain msgs = null;
			if (fixedQuantity != null)
				msgs = ((InternalEObject)fixedQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_QUANTITY, null, msgs);
			if (newFixedQuantity != null)
				msgs = ((InternalEObject)newFixedQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_QUANTITY, null, msgs);
			msgs = basicSetFixedQuantity(newFixedQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_QUANTITY, newFixedQuantity, newFixedQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getFixedRange() {
		return fixedRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedRange(Range newFixedRange, NotificationChain msgs) {
		Range oldFixedRange = fixedRange;
		fixedRange = newFixedRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_RANGE, oldFixedRange, newFixedRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedRange(Range newFixedRange) {
		if (newFixedRange != fixedRange) {
			NotificationChain msgs = null;
			if (fixedRange != null)
				msgs = ((InternalEObject)fixedRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_RANGE, null, msgs);
			if (newFixedRange != null)
				msgs = ((InternalEObject)newFixedRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_RANGE, null, msgs);
			msgs = basicSetFixedRange(newFixedRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_RANGE, newFixedRange, newFixedRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getFixedPeriod() {
		return fixedPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedPeriod(Period newFixedPeriod, NotificationChain msgs) {
		Period oldFixedPeriod = fixedPeriod;
		fixedPeriod = newFixedPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_PERIOD, oldFixedPeriod, newFixedPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedPeriod(Period newFixedPeriod) {
		if (newFixedPeriod != fixedPeriod) {
			NotificationChain msgs = null;
			if (fixedPeriod != null)
				msgs = ((InternalEObject)fixedPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_PERIOD, null, msgs);
			if (newFixedPeriod != null)
				msgs = ((InternalEObject)newFixedPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_PERIOD, null, msgs);
			msgs = basicSetFixedPeriod(newFixedPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_PERIOD, newFixedPeriod, newFixedPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getFixedRatio() {
		return fixedRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedRatio(Ratio newFixedRatio, NotificationChain msgs) {
		Ratio oldFixedRatio = fixedRatio;
		fixedRatio = newFixedRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_RATIO, oldFixedRatio, newFixedRatio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedRatio(Ratio newFixedRatio) {
		if (newFixedRatio != fixedRatio) {
			NotificationChain msgs = null;
			if (fixedRatio != null)
				msgs = ((InternalEObject)fixedRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_RATIO, null, msgs);
			if (newFixedRatio != null)
				msgs = ((InternalEObject)newFixedRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_RATIO, null, msgs);
			msgs = basicSetFixedRatio(newFixedRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_RATIO, newFixedRatio, newFixedRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getFixedReference() {
		return fixedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedReference(Reference newFixedReference, NotificationChain msgs) {
		Reference oldFixedReference = fixedReference;
		fixedReference = newFixedReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_REFERENCE, oldFixedReference, newFixedReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedReference(Reference newFixedReference) {
		if (newFixedReference != fixedReference) {
			NotificationChain msgs = null;
			if (fixedReference != null)
				msgs = ((InternalEObject)fixedReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_REFERENCE, null, msgs);
			if (newFixedReference != null)
				msgs = ((InternalEObject)newFixedReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_REFERENCE, null, msgs);
			msgs = basicSetFixedReference(newFixedReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_REFERENCE, newFixedReference, newFixedReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledData getFixedSampledData() {
		return fixedSampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedSampledData(SampledData newFixedSampledData, NotificationChain msgs) {
		SampledData oldFixedSampledData = fixedSampledData;
		fixedSampledData = newFixedSampledData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_SAMPLED_DATA, oldFixedSampledData, newFixedSampledData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedSampledData(SampledData newFixedSampledData) {
		if (newFixedSampledData != fixedSampledData) {
			NotificationChain msgs = null;
			if (fixedSampledData != null)
				msgs = ((InternalEObject)fixedSampledData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_SAMPLED_DATA, null, msgs);
			if (newFixedSampledData != null)
				msgs = ((InternalEObject)newFixedSampledData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_SAMPLED_DATA, null, msgs);
			msgs = basicSetFixedSampledData(newFixedSampledData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_SAMPLED_DATA, newFixedSampledData, newFixedSampledData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getFixedSignature() {
		return fixedSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedSignature(Signature newFixedSignature, NotificationChain msgs) {
		Signature oldFixedSignature = fixedSignature;
		fixedSignature = newFixedSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_SIGNATURE, oldFixedSignature, newFixedSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedSignature(Signature newFixedSignature) {
		if (newFixedSignature != fixedSignature) {
			NotificationChain msgs = null;
			if (fixedSignature != null)
				msgs = ((InternalEObject)fixedSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_SIGNATURE, null, msgs);
			if (newFixedSignature != null)
				msgs = ((InternalEObject)newFixedSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_SIGNATURE, null, msgs);
			msgs = basicSetFixedSignature(newFixedSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_SIGNATURE, newFixedSignature, newFixedSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanName getFixedHumanName() {
		return fixedHumanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedHumanName(HumanName newFixedHumanName, NotificationChain msgs) {
		HumanName oldFixedHumanName = fixedHumanName;
		fixedHumanName = newFixedHumanName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_HUMAN_NAME, oldFixedHumanName, newFixedHumanName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedHumanName(HumanName newFixedHumanName) {
		if (newFixedHumanName != fixedHumanName) {
			NotificationChain msgs = null;
			if (fixedHumanName != null)
				msgs = ((InternalEObject)fixedHumanName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_HUMAN_NAME, null, msgs);
			if (newFixedHumanName != null)
				msgs = ((InternalEObject)newFixedHumanName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_HUMAN_NAME, null, msgs);
			msgs = basicSetFixedHumanName(newFixedHumanName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_HUMAN_NAME, newFixedHumanName, newFixedHumanName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getFixedAddress() {
		return fixedAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedAddress(Address newFixedAddress, NotificationChain msgs) {
		Address oldFixedAddress = fixedAddress;
		fixedAddress = newFixedAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_ADDRESS, oldFixedAddress, newFixedAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedAddress(Address newFixedAddress) {
		if (newFixedAddress != fixedAddress) {
			NotificationChain msgs = null;
			if (fixedAddress != null)
				msgs = ((InternalEObject)fixedAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_ADDRESS, null, msgs);
			if (newFixedAddress != null)
				msgs = ((InternalEObject)newFixedAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_ADDRESS, null, msgs);
			msgs = basicSetFixedAddress(newFixedAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_ADDRESS, newFixedAddress, newFixedAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPoint getFixedContactPoint() {
		return fixedContactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedContactPoint(ContactPoint newFixedContactPoint, NotificationChain msgs) {
		ContactPoint oldFixedContactPoint = fixedContactPoint;
		fixedContactPoint = newFixedContactPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_POINT, oldFixedContactPoint, newFixedContactPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedContactPoint(ContactPoint newFixedContactPoint) {
		if (newFixedContactPoint != fixedContactPoint) {
			NotificationChain msgs = null;
			if (fixedContactPoint != null)
				msgs = ((InternalEObject)fixedContactPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_POINT, null, msgs);
			if (newFixedContactPoint != null)
				msgs = ((InternalEObject)newFixedContactPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_POINT, null, msgs);
			msgs = basicSetFixedContactPoint(newFixedContactPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_POINT, newFixedContactPoint, newFixedContactPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getFixedTiming() {
		return fixedTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedTiming(Timing newFixedTiming, NotificationChain msgs) {
		Timing oldFixedTiming = fixedTiming;
		fixedTiming = newFixedTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_TIMING, oldFixedTiming, newFixedTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedTiming(Timing newFixedTiming) {
		if (newFixedTiming != fixedTiming) {
			NotificationChain msgs = null;
			if (fixedTiming != null)
				msgs = ((InternalEObject)fixedTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_TIMING, null, msgs);
			if (newFixedTiming != null)
				msgs = ((InternalEObject)newFixedTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_TIMING, null, msgs);
			msgs = basicSetFixedTiming(newFixedTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_TIMING, newFixedTiming, newFixedTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta getFixedMeta() {
		return fixedMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedMeta(Meta newFixedMeta, NotificationChain msgs) {
		Meta oldFixedMeta = fixedMeta;
		fixedMeta = newFixedMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_META, oldFixedMeta, newFixedMeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedMeta(Meta newFixedMeta) {
		if (newFixedMeta != fixedMeta) {
			NotificationChain msgs = null;
			if (fixedMeta != null)
				msgs = ((InternalEObject)fixedMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_META, null, msgs);
			if (newFixedMeta != null)
				msgs = ((InternalEObject)newFixedMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__FIXED_META, null, msgs);
			msgs = basicSetFixedMeta(newFixedMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__FIXED_META, newFixedMeta, newFixedMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getPatternBoolean() {
		return patternBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternBoolean(org.hl7.fhir.Boolean newPatternBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldPatternBoolean = patternBoolean;
		patternBoolean = newPatternBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_BOOLEAN, oldPatternBoolean, newPatternBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternBoolean(org.hl7.fhir.Boolean newPatternBoolean) {
		if (newPatternBoolean != patternBoolean) {
			NotificationChain msgs = null;
			if (patternBoolean != null)
				msgs = ((InternalEObject)patternBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_BOOLEAN, null, msgs);
			if (newPatternBoolean != null)
				msgs = ((InternalEObject)newPatternBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_BOOLEAN, null, msgs);
			msgs = basicSetPatternBoolean(newPatternBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_BOOLEAN, newPatternBoolean, newPatternBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getPatternInteger() {
		return patternInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternInteger(org.hl7.fhir.Integer newPatternInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldPatternInteger = patternInteger;
		patternInteger = newPatternInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_INTEGER, oldPatternInteger, newPatternInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternInteger(org.hl7.fhir.Integer newPatternInteger) {
		if (newPatternInteger != patternInteger) {
			NotificationChain msgs = null;
			if (patternInteger != null)
				msgs = ((InternalEObject)patternInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_INTEGER, null, msgs);
			if (newPatternInteger != null)
				msgs = ((InternalEObject)newPatternInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_INTEGER, null, msgs);
			msgs = basicSetPatternInteger(newPatternInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_INTEGER, newPatternInteger, newPatternInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPatternDecimal() {
		return patternDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternDecimal(Decimal newPatternDecimal, NotificationChain msgs) {
		Decimal oldPatternDecimal = patternDecimal;
		patternDecimal = newPatternDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DECIMAL, oldPatternDecimal, newPatternDecimal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternDecimal(Decimal newPatternDecimal) {
		if (newPatternDecimal != patternDecimal) {
			NotificationChain msgs = null;
			if (patternDecimal != null)
				msgs = ((InternalEObject)patternDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DECIMAL, null, msgs);
			if (newPatternDecimal != null)
				msgs = ((InternalEObject)newPatternDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DECIMAL, null, msgs);
			msgs = basicSetPatternDecimal(newPatternDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DECIMAL, newPatternDecimal, newPatternDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary getPatternBase64Binary() {
		return patternBase64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternBase64Binary(Base64Binary newPatternBase64Binary, NotificationChain msgs) {
		Base64Binary oldPatternBase64Binary = patternBase64Binary;
		patternBase64Binary = newPatternBase64Binary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_BASE64_BINARY, oldPatternBase64Binary, newPatternBase64Binary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternBase64Binary(Base64Binary newPatternBase64Binary) {
		if (newPatternBase64Binary != patternBase64Binary) {
			NotificationChain msgs = null;
			if (patternBase64Binary != null)
				msgs = ((InternalEObject)patternBase64Binary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_BASE64_BINARY, null, msgs);
			if (newPatternBase64Binary != null)
				msgs = ((InternalEObject)newPatternBase64Binary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_BASE64_BINARY, null, msgs);
			msgs = basicSetPatternBase64Binary(newPatternBase64Binary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_BASE64_BINARY, newPatternBase64Binary, newPatternBase64Binary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getPatternInstant() {
		return patternInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternInstant(Instant newPatternInstant, NotificationChain msgs) {
		Instant oldPatternInstant = patternInstant;
		patternInstant = newPatternInstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_INSTANT, oldPatternInstant, newPatternInstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternInstant(Instant newPatternInstant) {
		if (newPatternInstant != patternInstant) {
			NotificationChain msgs = null;
			if (patternInstant != null)
				msgs = ((InternalEObject)patternInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_INSTANT, null, msgs);
			if (newPatternInstant != null)
				msgs = ((InternalEObject)newPatternInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_INSTANT, null, msgs);
			msgs = basicSetPatternInstant(newPatternInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_INSTANT, newPatternInstant, newPatternInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPatternString() {
		return patternString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternString(org.hl7.fhir.String newPatternString, NotificationChain msgs) {
		org.hl7.fhir.String oldPatternString = patternString;
		patternString = newPatternString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_STRING, oldPatternString, newPatternString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternString(org.hl7.fhir.String newPatternString) {
		if (newPatternString != patternString) {
			NotificationChain msgs = null;
			if (patternString != null)
				msgs = ((InternalEObject)patternString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_STRING, null, msgs);
			if (newPatternString != null)
				msgs = ((InternalEObject)newPatternString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_STRING, null, msgs);
			msgs = basicSetPatternString(newPatternString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_STRING, newPatternString, newPatternString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getPatternUri() {
		return patternUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternUri(Uri newPatternUri, NotificationChain msgs) {
		Uri oldPatternUri = patternUri;
		patternUri = newPatternUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_URI, oldPatternUri, newPatternUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternUri(Uri newPatternUri) {
		if (newPatternUri != patternUri) {
			NotificationChain msgs = null;
			if (patternUri != null)
				msgs = ((InternalEObject)patternUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_URI, null, msgs);
			if (newPatternUri != null)
				msgs = ((InternalEObject)newPatternUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_URI, null, msgs);
			msgs = basicSetPatternUri(newPatternUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_URI, newPatternUri, newPatternUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPatternDate() {
		return patternDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternDate(Date newPatternDate, NotificationChain msgs) {
		Date oldPatternDate = patternDate;
		patternDate = newPatternDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE, oldPatternDate, newPatternDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternDate(Date newPatternDate) {
		if (newPatternDate != patternDate) {
			NotificationChain msgs = null;
			if (patternDate != null)
				msgs = ((InternalEObject)patternDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE, null, msgs);
			if (newPatternDate != null)
				msgs = ((InternalEObject)newPatternDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE, null, msgs);
			msgs = basicSetPatternDate(newPatternDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE, newPatternDate, newPatternDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getPatternDateTime() {
		return patternDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternDateTime(DateTime newPatternDateTime, NotificationChain msgs) {
		DateTime oldPatternDateTime = patternDateTime;
		patternDateTime = newPatternDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE_TIME, oldPatternDateTime, newPatternDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternDateTime(DateTime newPatternDateTime) {
		if (newPatternDateTime != patternDateTime) {
			NotificationChain msgs = null;
			if (patternDateTime != null)
				msgs = ((InternalEObject)patternDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE_TIME, null, msgs);
			if (newPatternDateTime != null)
				msgs = ((InternalEObject)newPatternDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE_TIME, null, msgs);
			msgs = basicSetPatternDateTime(newPatternDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE_TIME, newPatternDateTime, newPatternDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getPatternTime() {
		return patternTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternTime(Time newPatternTime, NotificationChain msgs) {
		Time oldPatternTime = patternTime;
		patternTime = newPatternTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_TIME, oldPatternTime, newPatternTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternTime(Time newPatternTime) {
		if (newPatternTime != patternTime) {
			NotificationChain msgs = null;
			if (patternTime != null)
				msgs = ((InternalEObject)patternTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_TIME, null, msgs);
			if (newPatternTime != null)
				msgs = ((InternalEObject)newPatternTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_TIME, null, msgs);
			msgs = basicSetPatternTime(newPatternTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_TIME, newPatternTime, newPatternTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getPatternCode() {
		return patternCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternCode(Code newPatternCode, NotificationChain msgs) {
		Code oldPatternCode = patternCode;
		patternCode = newPatternCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CODE, oldPatternCode, newPatternCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternCode(Code newPatternCode) {
		if (newPatternCode != patternCode) {
			NotificationChain msgs = null;
			if (patternCode != null)
				msgs = ((InternalEObject)patternCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CODE, null, msgs);
			if (newPatternCode != null)
				msgs = ((InternalEObject)newPatternCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CODE, null, msgs);
			msgs = basicSetPatternCode(newPatternCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CODE, newPatternCode, newPatternCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getPatternOid() {
		return patternOid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternOid(Oid newPatternOid, NotificationChain msgs) {
		Oid oldPatternOid = patternOid;
		patternOid = newPatternOid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_OID, oldPatternOid, newPatternOid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternOid(Oid newPatternOid) {
		if (newPatternOid != patternOid) {
			NotificationChain msgs = null;
			if (patternOid != null)
				msgs = ((InternalEObject)patternOid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_OID, null, msgs);
			if (newPatternOid != null)
				msgs = ((InternalEObject)newPatternOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_OID, null, msgs);
			msgs = basicSetPatternOid(newPatternOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_OID, newPatternOid, newPatternOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uuid getPatternUuid() {
		return patternUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternUuid(Uuid newPatternUuid, NotificationChain msgs) {
		Uuid oldPatternUuid = patternUuid;
		patternUuid = newPatternUuid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_UUID, oldPatternUuid, newPatternUuid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternUuid(Uuid newPatternUuid) {
		if (newPatternUuid != patternUuid) {
			NotificationChain msgs = null;
			if (patternUuid != null)
				msgs = ((InternalEObject)patternUuid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_UUID, null, msgs);
			if (newPatternUuid != null)
				msgs = ((InternalEObject)newPatternUuid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_UUID, null, msgs);
			msgs = basicSetPatternUuid(newPatternUuid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_UUID, newPatternUuid, newPatternUuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getPatternId() {
		return patternId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternId(Id newPatternId, NotificationChain msgs) {
		Id oldPatternId = patternId;
		patternId = newPatternId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_ID, oldPatternId, newPatternId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternId(Id newPatternId) {
		if (newPatternId != patternId) {
			NotificationChain msgs = null;
			if (patternId != null)
				msgs = ((InternalEObject)patternId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_ID, null, msgs);
			if (newPatternId != null)
				msgs = ((InternalEObject)newPatternId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_ID, null, msgs);
			msgs = basicSetPatternId(newPatternId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_ID, newPatternId, newPatternId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getPatternUnsignedInt() {
		return patternUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternUnsignedInt(UnsignedInt newPatternUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldPatternUnsignedInt = patternUnsignedInt;
		patternUnsignedInt = newPatternUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_UNSIGNED_INT, oldPatternUnsignedInt, newPatternUnsignedInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternUnsignedInt(UnsignedInt newPatternUnsignedInt) {
		if (newPatternUnsignedInt != patternUnsignedInt) {
			NotificationChain msgs = null;
			if (patternUnsignedInt != null)
				msgs = ((InternalEObject)patternUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_UNSIGNED_INT, null, msgs);
			if (newPatternUnsignedInt != null)
				msgs = ((InternalEObject)newPatternUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_UNSIGNED_INT, null, msgs);
			msgs = basicSetPatternUnsignedInt(newPatternUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_UNSIGNED_INT, newPatternUnsignedInt, newPatternUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getPatternPositiveInt() {
		return patternPositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternPositiveInt(PositiveInt newPatternPositiveInt, NotificationChain msgs) {
		PositiveInt oldPatternPositiveInt = patternPositiveInt;
		patternPositiveInt = newPatternPositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_POSITIVE_INT, oldPatternPositiveInt, newPatternPositiveInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternPositiveInt(PositiveInt newPatternPositiveInt) {
		if (newPatternPositiveInt != patternPositiveInt) {
			NotificationChain msgs = null;
			if (patternPositiveInt != null)
				msgs = ((InternalEObject)patternPositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_POSITIVE_INT, null, msgs);
			if (newPatternPositiveInt != null)
				msgs = ((InternalEObject)newPatternPositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_POSITIVE_INT, null, msgs);
			msgs = basicSetPatternPositiveInt(newPatternPositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_POSITIVE_INT, newPatternPositiveInt, newPatternPositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getPatternAnnotation() {
		return patternAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternAnnotation(Annotation newPatternAnnotation, NotificationChain msgs) {
		Annotation oldPatternAnnotation = patternAnnotation;
		patternAnnotation = newPatternAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_ANNOTATION, oldPatternAnnotation, newPatternAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternAnnotation(Annotation newPatternAnnotation) {
		if (newPatternAnnotation != patternAnnotation) {
			NotificationChain msgs = null;
			if (patternAnnotation != null)
				msgs = ((InternalEObject)patternAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_ANNOTATION, null, msgs);
			if (newPatternAnnotation != null)
				msgs = ((InternalEObject)newPatternAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_ANNOTATION, null, msgs);
			msgs = basicSetPatternAnnotation(newPatternAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_ANNOTATION, newPatternAnnotation, newPatternAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getPatternAttachment() {
		return patternAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternAttachment(Attachment newPatternAttachment, NotificationChain msgs) {
		Attachment oldPatternAttachment = patternAttachment;
		patternAttachment = newPatternAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_ATTACHMENT, oldPatternAttachment, newPatternAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternAttachment(Attachment newPatternAttachment) {
		if (newPatternAttachment != patternAttachment) {
			NotificationChain msgs = null;
			if (patternAttachment != null)
				msgs = ((InternalEObject)patternAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_ATTACHMENT, null, msgs);
			if (newPatternAttachment != null)
				msgs = ((InternalEObject)newPatternAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_ATTACHMENT, null, msgs);
			msgs = basicSetPatternAttachment(newPatternAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_ATTACHMENT, newPatternAttachment, newPatternAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPatternIdentifier() {
		return patternIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternIdentifier(Identifier newPatternIdentifier, NotificationChain msgs) {
		Identifier oldPatternIdentifier = patternIdentifier;
		patternIdentifier = newPatternIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_IDENTIFIER, oldPatternIdentifier, newPatternIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternIdentifier(Identifier newPatternIdentifier) {
		if (newPatternIdentifier != patternIdentifier) {
			NotificationChain msgs = null;
			if (patternIdentifier != null)
				msgs = ((InternalEObject)patternIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_IDENTIFIER, null, msgs);
			if (newPatternIdentifier != null)
				msgs = ((InternalEObject)newPatternIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_IDENTIFIER, null, msgs);
			msgs = basicSetPatternIdentifier(newPatternIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_IDENTIFIER, newPatternIdentifier, newPatternIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPatternCodeableConcept() {
		return patternCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternCodeableConcept(CodeableConcept newPatternCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldPatternCodeableConcept = patternCodeableConcept;
		patternCodeableConcept = newPatternCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CODEABLE_CONCEPT, oldPatternCodeableConcept, newPatternCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternCodeableConcept(CodeableConcept newPatternCodeableConcept) {
		if (newPatternCodeableConcept != patternCodeableConcept) {
			NotificationChain msgs = null;
			if (patternCodeableConcept != null)
				msgs = ((InternalEObject)patternCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CODEABLE_CONCEPT, null, msgs);
			if (newPatternCodeableConcept != null)
				msgs = ((InternalEObject)newPatternCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetPatternCodeableConcept(newPatternCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CODEABLE_CONCEPT, newPatternCodeableConcept, newPatternCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getPatternCoding() {
		return patternCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternCoding(Coding newPatternCoding, NotificationChain msgs) {
		Coding oldPatternCoding = patternCoding;
		patternCoding = newPatternCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CODING, oldPatternCoding, newPatternCoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternCoding(Coding newPatternCoding) {
		if (newPatternCoding != patternCoding) {
			NotificationChain msgs = null;
			if (patternCoding != null)
				msgs = ((InternalEObject)patternCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CODING, null, msgs);
			if (newPatternCoding != null)
				msgs = ((InternalEObject)newPatternCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CODING, null, msgs);
			msgs = basicSetPatternCoding(newPatternCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CODING, newPatternCoding, newPatternCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getPatternQuantity() {
		return patternQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternQuantity(Quantity newPatternQuantity, NotificationChain msgs) {
		Quantity oldPatternQuantity = patternQuantity;
		patternQuantity = newPatternQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_QUANTITY, oldPatternQuantity, newPatternQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternQuantity(Quantity newPatternQuantity) {
		if (newPatternQuantity != patternQuantity) {
			NotificationChain msgs = null;
			if (patternQuantity != null)
				msgs = ((InternalEObject)patternQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_QUANTITY, null, msgs);
			if (newPatternQuantity != null)
				msgs = ((InternalEObject)newPatternQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_QUANTITY, null, msgs);
			msgs = basicSetPatternQuantity(newPatternQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_QUANTITY, newPatternQuantity, newPatternQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getPatternRange() {
		return patternRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternRange(Range newPatternRange, NotificationChain msgs) {
		Range oldPatternRange = patternRange;
		patternRange = newPatternRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_RANGE, oldPatternRange, newPatternRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternRange(Range newPatternRange) {
		if (newPatternRange != patternRange) {
			NotificationChain msgs = null;
			if (patternRange != null)
				msgs = ((InternalEObject)patternRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_RANGE, null, msgs);
			if (newPatternRange != null)
				msgs = ((InternalEObject)newPatternRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_RANGE, null, msgs);
			msgs = basicSetPatternRange(newPatternRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_RANGE, newPatternRange, newPatternRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPatternPeriod() {
		return patternPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternPeriod(Period newPatternPeriod, NotificationChain msgs) {
		Period oldPatternPeriod = patternPeriod;
		patternPeriod = newPatternPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_PERIOD, oldPatternPeriod, newPatternPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternPeriod(Period newPatternPeriod) {
		if (newPatternPeriod != patternPeriod) {
			NotificationChain msgs = null;
			if (patternPeriod != null)
				msgs = ((InternalEObject)patternPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_PERIOD, null, msgs);
			if (newPatternPeriod != null)
				msgs = ((InternalEObject)newPatternPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_PERIOD, null, msgs);
			msgs = basicSetPatternPeriod(newPatternPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_PERIOD, newPatternPeriod, newPatternPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getPatternRatio() {
		return patternRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternRatio(Ratio newPatternRatio, NotificationChain msgs) {
		Ratio oldPatternRatio = patternRatio;
		patternRatio = newPatternRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_RATIO, oldPatternRatio, newPatternRatio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternRatio(Ratio newPatternRatio) {
		if (newPatternRatio != patternRatio) {
			NotificationChain msgs = null;
			if (patternRatio != null)
				msgs = ((InternalEObject)patternRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_RATIO, null, msgs);
			if (newPatternRatio != null)
				msgs = ((InternalEObject)newPatternRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_RATIO, null, msgs);
			msgs = basicSetPatternRatio(newPatternRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_RATIO, newPatternRatio, newPatternRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatternReference() {
		return patternReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternReference(Reference newPatternReference, NotificationChain msgs) {
		Reference oldPatternReference = patternReference;
		patternReference = newPatternReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_REFERENCE, oldPatternReference, newPatternReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternReference(Reference newPatternReference) {
		if (newPatternReference != patternReference) {
			NotificationChain msgs = null;
			if (patternReference != null)
				msgs = ((InternalEObject)patternReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_REFERENCE, null, msgs);
			if (newPatternReference != null)
				msgs = ((InternalEObject)newPatternReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_REFERENCE, null, msgs);
			msgs = basicSetPatternReference(newPatternReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_REFERENCE, newPatternReference, newPatternReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledData getPatternSampledData() {
		return patternSampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternSampledData(SampledData newPatternSampledData, NotificationChain msgs) {
		SampledData oldPatternSampledData = patternSampledData;
		patternSampledData = newPatternSampledData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_SAMPLED_DATA, oldPatternSampledData, newPatternSampledData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternSampledData(SampledData newPatternSampledData) {
		if (newPatternSampledData != patternSampledData) {
			NotificationChain msgs = null;
			if (patternSampledData != null)
				msgs = ((InternalEObject)patternSampledData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_SAMPLED_DATA, null, msgs);
			if (newPatternSampledData != null)
				msgs = ((InternalEObject)newPatternSampledData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_SAMPLED_DATA, null, msgs);
			msgs = basicSetPatternSampledData(newPatternSampledData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_SAMPLED_DATA, newPatternSampledData, newPatternSampledData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getPatternSignature() {
		return patternSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternSignature(Signature newPatternSignature, NotificationChain msgs) {
		Signature oldPatternSignature = patternSignature;
		patternSignature = newPatternSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_SIGNATURE, oldPatternSignature, newPatternSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternSignature(Signature newPatternSignature) {
		if (newPatternSignature != patternSignature) {
			NotificationChain msgs = null;
			if (patternSignature != null)
				msgs = ((InternalEObject)patternSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_SIGNATURE, null, msgs);
			if (newPatternSignature != null)
				msgs = ((InternalEObject)newPatternSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_SIGNATURE, null, msgs);
			msgs = basicSetPatternSignature(newPatternSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_SIGNATURE, newPatternSignature, newPatternSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanName getPatternHumanName() {
		return patternHumanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternHumanName(HumanName newPatternHumanName, NotificationChain msgs) {
		HumanName oldPatternHumanName = patternHumanName;
		patternHumanName = newPatternHumanName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_HUMAN_NAME, oldPatternHumanName, newPatternHumanName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternHumanName(HumanName newPatternHumanName) {
		if (newPatternHumanName != patternHumanName) {
			NotificationChain msgs = null;
			if (patternHumanName != null)
				msgs = ((InternalEObject)patternHumanName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_HUMAN_NAME, null, msgs);
			if (newPatternHumanName != null)
				msgs = ((InternalEObject)newPatternHumanName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_HUMAN_NAME, null, msgs);
			msgs = basicSetPatternHumanName(newPatternHumanName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_HUMAN_NAME, newPatternHumanName, newPatternHumanName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getPatternAddress() {
		return patternAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternAddress(Address newPatternAddress, NotificationChain msgs) {
		Address oldPatternAddress = patternAddress;
		patternAddress = newPatternAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_ADDRESS, oldPatternAddress, newPatternAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternAddress(Address newPatternAddress) {
		if (newPatternAddress != patternAddress) {
			NotificationChain msgs = null;
			if (patternAddress != null)
				msgs = ((InternalEObject)patternAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_ADDRESS, null, msgs);
			if (newPatternAddress != null)
				msgs = ((InternalEObject)newPatternAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_ADDRESS, null, msgs);
			msgs = basicSetPatternAddress(newPatternAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_ADDRESS, newPatternAddress, newPatternAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPoint getPatternContactPoint() {
		return patternContactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternContactPoint(ContactPoint newPatternContactPoint, NotificationChain msgs) {
		ContactPoint oldPatternContactPoint = patternContactPoint;
		patternContactPoint = newPatternContactPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_POINT, oldPatternContactPoint, newPatternContactPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternContactPoint(ContactPoint newPatternContactPoint) {
		if (newPatternContactPoint != patternContactPoint) {
			NotificationChain msgs = null;
			if (patternContactPoint != null)
				msgs = ((InternalEObject)patternContactPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_POINT, null, msgs);
			if (newPatternContactPoint != null)
				msgs = ((InternalEObject)newPatternContactPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_POINT, null, msgs);
			msgs = basicSetPatternContactPoint(newPatternContactPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_POINT, newPatternContactPoint, newPatternContactPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getPatternTiming() {
		return patternTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternTiming(Timing newPatternTiming, NotificationChain msgs) {
		Timing oldPatternTiming = patternTiming;
		patternTiming = newPatternTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_TIMING, oldPatternTiming, newPatternTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternTiming(Timing newPatternTiming) {
		if (newPatternTiming != patternTiming) {
			NotificationChain msgs = null;
			if (patternTiming != null)
				msgs = ((InternalEObject)patternTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_TIMING, null, msgs);
			if (newPatternTiming != null)
				msgs = ((InternalEObject)newPatternTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_TIMING, null, msgs);
			msgs = basicSetPatternTiming(newPatternTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_TIMING, newPatternTiming, newPatternTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta getPatternMeta() {
		return patternMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternMeta(Meta newPatternMeta, NotificationChain msgs) {
		Meta oldPatternMeta = patternMeta;
		patternMeta = newPatternMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_META, oldPatternMeta, newPatternMeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternMeta(Meta newPatternMeta) {
		if (newPatternMeta != patternMeta) {
			NotificationChain msgs = null;
			if (patternMeta != null)
				msgs = ((InternalEObject)patternMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_META, null, msgs);
			if (newPatternMeta != null)
				msgs = ((InternalEObject)newPatternMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__PATTERN_META, null, msgs);
			msgs = basicSetPatternMeta(newPatternMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__PATTERN_META, newPatternMeta, newPatternMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getExampleBoolean() {
		return exampleBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleBoolean(org.hl7.fhir.Boolean newExampleBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldExampleBoolean = exampleBoolean;
		exampleBoolean = newExampleBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_BOOLEAN, oldExampleBoolean, newExampleBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleBoolean(org.hl7.fhir.Boolean newExampleBoolean) {
		if (newExampleBoolean != exampleBoolean) {
			NotificationChain msgs = null;
			if (exampleBoolean != null)
				msgs = ((InternalEObject)exampleBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_BOOLEAN, null, msgs);
			if (newExampleBoolean != null)
				msgs = ((InternalEObject)newExampleBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_BOOLEAN, null, msgs);
			msgs = basicSetExampleBoolean(newExampleBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_BOOLEAN, newExampleBoolean, newExampleBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getExampleInteger() {
		return exampleInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleInteger(org.hl7.fhir.Integer newExampleInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldExampleInteger = exampleInteger;
		exampleInteger = newExampleInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_INTEGER, oldExampleInteger, newExampleInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleInteger(org.hl7.fhir.Integer newExampleInteger) {
		if (newExampleInteger != exampleInteger) {
			NotificationChain msgs = null;
			if (exampleInteger != null)
				msgs = ((InternalEObject)exampleInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_INTEGER, null, msgs);
			if (newExampleInteger != null)
				msgs = ((InternalEObject)newExampleInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_INTEGER, null, msgs);
			msgs = basicSetExampleInteger(newExampleInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_INTEGER, newExampleInteger, newExampleInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getExampleDecimal() {
		return exampleDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleDecimal(Decimal newExampleDecimal, NotificationChain msgs) {
		Decimal oldExampleDecimal = exampleDecimal;
		exampleDecimal = newExampleDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DECIMAL, oldExampleDecimal, newExampleDecimal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleDecimal(Decimal newExampleDecimal) {
		if (newExampleDecimal != exampleDecimal) {
			NotificationChain msgs = null;
			if (exampleDecimal != null)
				msgs = ((InternalEObject)exampleDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DECIMAL, null, msgs);
			if (newExampleDecimal != null)
				msgs = ((InternalEObject)newExampleDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DECIMAL, null, msgs);
			msgs = basicSetExampleDecimal(newExampleDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DECIMAL, newExampleDecimal, newExampleDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary getExampleBase64Binary() {
		return exampleBase64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleBase64Binary(Base64Binary newExampleBase64Binary, NotificationChain msgs) {
		Base64Binary oldExampleBase64Binary = exampleBase64Binary;
		exampleBase64Binary = newExampleBase64Binary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_BASE64_BINARY, oldExampleBase64Binary, newExampleBase64Binary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleBase64Binary(Base64Binary newExampleBase64Binary) {
		if (newExampleBase64Binary != exampleBase64Binary) {
			NotificationChain msgs = null;
			if (exampleBase64Binary != null)
				msgs = ((InternalEObject)exampleBase64Binary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_BASE64_BINARY, null, msgs);
			if (newExampleBase64Binary != null)
				msgs = ((InternalEObject)newExampleBase64Binary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_BASE64_BINARY, null, msgs);
			msgs = basicSetExampleBase64Binary(newExampleBase64Binary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_BASE64_BINARY, newExampleBase64Binary, newExampleBase64Binary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getExampleInstant() {
		return exampleInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleInstant(Instant newExampleInstant, NotificationChain msgs) {
		Instant oldExampleInstant = exampleInstant;
		exampleInstant = newExampleInstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_INSTANT, oldExampleInstant, newExampleInstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleInstant(Instant newExampleInstant) {
		if (newExampleInstant != exampleInstant) {
			NotificationChain msgs = null;
			if (exampleInstant != null)
				msgs = ((InternalEObject)exampleInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_INSTANT, null, msgs);
			if (newExampleInstant != null)
				msgs = ((InternalEObject)newExampleInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_INSTANT, null, msgs);
			msgs = basicSetExampleInstant(newExampleInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_INSTANT, newExampleInstant, newExampleInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getExampleString() {
		return exampleString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleString(org.hl7.fhir.String newExampleString, NotificationChain msgs) {
		org.hl7.fhir.String oldExampleString = exampleString;
		exampleString = newExampleString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_STRING, oldExampleString, newExampleString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleString(org.hl7.fhir.String newExampleString) {
		if (newExampleString != exampleString) {
			NotificationChain msgs = null;
			if (exampleString != null)
				msgs = ((InternalEObject)exampleString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_STRING, null, msgs);
			if (newExampleString != null)
				msgs = ((InternalEObject)newExampleString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_STRING, null, msgs);
			msgs = basicSetExampleString(newExampleString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_STRING, newExampleString, newExampleString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getExampleUri() {
		return exampleUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleUri(Uri newExampleUri, NotificationChain msgs) {
		Uri oldExampleUri = exampleUri;
		exampleUri = newExampleUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_URI, oldExampleUri, newExampleUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleUri(Uri newExampleUri) {
		if (newExampleUri != exampleUri) {
			NotificationChain msgs = null;
			if (exampleUri != null)
				msgs = ((InternalEObject)exampleUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_URI, null, msgs);
			if (newExampleUri != null)
				msgs = ((InternalEObject)newExampleUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_URI, null, msgs);
			msgs = basicSetExampleUri(newExampleUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_URI, newExampleUri, newExampleUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExampleDate() {
		return exampleDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleDate(Date newExampleDate, NotificationChain msgs) {
		Date oldExampleDate = exampleDate;
		exampleDate = newExampleDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DATE, oldExampleDate, newExampleDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleDate(Date newExampleDate) {
		if (newExampleDate != exampleDate) {
			NotificationChain msgs = null;
			if (exampleDate != null)
				msgs = ((InternalEObject)exampleDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DATE, null, msgs);
			if (newExampleDate != null)
				msgs = ((InternalEObject)newExampleDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DATE, null, msgs);
			msgs = basicSetExampleDate(newExampleDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DATE, newExampleDate, newExampleDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getExampleDateTime() {
		return exampleDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleDateTime(DateTime newExampleDateTime, NotificationChain msgs) {
		DateTime oldExampleDateTime = exampleDateTime;
		exampleDateTime = newExampleDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DATE_TIME, oldExampleDateTime, newExampleDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleDateTime(DateTime newExampleDateTime) {
		if (newExampleDateTime != exampleDateTime) {
			NotificationChain msgs = null;
			if (exampleDateTime != null)
				msgs = ((InternalEObject)exampleDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DATE_TIME, null, msgs);
			if (newExampleDateTime != null)
				msgs = ((InternalEObject)newExampleDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DATE_TIME, null, msgs);
			msgs = basicSetExampleDateTime(newExampleDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DATE_TIME, newExampleDateTime, newExampleDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getExampleTime() {
		return exampleTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleTime(Time newExampleTime, NotificationChain msgs) {
		Time oldExampleTime = exampleTime;
		exampleTime = newExampleTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_TIME, oldExampleTime, newExampleTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleTime(Time newExampleTime) {
		if (newExampleTime != exampleTime) {
			NotificationChain msgs = null;
			if (exampleTime != null)
				msgs = ((InternalEObject)exampleTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_TIME, null, msgs);
			if (newExampleTime != null)
				msgs = ((InternalEObject)newExampleTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_TIME, null, msgs);
			msgs = basicSetExampleTime(newExampleTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_TIME, newExampleTime, newExampleTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getExampleCode() {
		return exampleCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleCode(Code newExampleCode, NotificationChain msgs) {
		Code oldExampleCode = exampleCode;
		exampleCode = newExampleCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODE, oldExampleCode, newExampleCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleCode(Code newExampleCode) {
		if (newExampleCode != exampleCode) {
			NotificationChain msgs = null;
			if (exampleCode != null)
				msgs = ((InternalEObject)exampleCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODE, null, msgs);
			if (newExampleCode != null)
				msgs = ((InternalEObject)newExampleCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODE, null, msgs);
			msgs = basicSetExampleCode(newExampleCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODE, newExampleCode, newExampleCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getExampleOid() {
		return exampleOid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleOid(Oid newExampleOid, NotificationChain msgs) {
		Oid oldExampleOid = exampleOid;
		exampleOid = newExampleOid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_OID, oldExampleOid, newExampleOid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleOid(Oid newExampleOid) {
		if (newExampleOid != exampleOid) {
			NotificationChain msgs = null;
			if (exampleOid != null)
				msgs = ((InternalEObject)exampleOid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_OID, null, msgs);
			if (newExampleOid != null)
				msgs = ((InternalEObject)newExampleOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_OID, null, msgs);
			msgs = basicSetExampleOid(newExampleOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_OID, newExampleOid, newExampleOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uuid getExampleUuid() {
		return exampleUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleUuid(Uuid newExampleUuid, NotificationChain msgs) {
		Uuid oldExampleUuid = exampleUuid;
		exampleUuid = newExampleUuid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_UUID, oldExampleUuid, newExampleUuid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleUuid(Uuid newExampleUuid) {
		if (newExampleUuid != exampleUuid) {
			NotificationChain msgs = null;
			if (exampleUuid != null)
				msgs = ((InternalEObject)exampleUuid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_UUID, null, msgs);
			if (newExampleUuid != null)
				msgs = ((InternalEObject)newExampleUuid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_UUID, null, msgs);
			msgs = basicSetExampleUuid(newExampleUuid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_UUID, newExampleUuid, newExampleUuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getExampleId() {
		return exampleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleId(Id newExampleId, NotificationChain msgs) {
		Id oldExampleId = exampleId;
		exampleId = newExampleId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ID, oldExampleId, newExampleId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleId(Id newExampleId) {
		if (newExampleId != exampleId) {
			NotificationChain msgs = null;
			if (exampleId != null)
				msgs = ((InternalEObject)exampleId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ID, null, msgs);
			if (newExampleId != null)
				msgs = ((InternalEObject)newExampleId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ID, null, msgs);
			msgs = basicSetExampleId(newExampleId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ID, newExampleId, newExampleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getExampleUnsignedInt() {
		return exampleUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleUnsignedInt(UnsignedInt newExampleUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldExampleUnsignedInt = exampleUnsignedInt;
		exampleUnsignedInt = newExampleUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_UNSIGNED_INT, oldExampleUnsignedInt, newExampleUnsignedInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleUnsignedInt(UnsignedInt newExampleUnsignedInt) {
		if (newExampleUnsignedInt != exampleUnsignedInt) {
			NotificationChain msgs = null;
			if (exampleUnsignedInt != null)
				msgs = ((InternalEObject)exampleUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_UNSIGNED_INT, null, msgs);
			if (newExampleUnsignedInt != null)
				msgs = ((InternalEObject)newExampleUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_UNSIGNED_INT, null, msgs);
			msgs = basicSetExampleUnsignedInt(newExampleUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_UNSIGNED_INT, newExampleUnsignedInt, newExampleUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getExamplePositiveInt() {
		return examplePositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExamplePositiveInt(PositiveInt newExamplePositiveInt, NotificationChain msgs) {
		PositiveInt oldExamplePositiveInt = examplePositiveInt;
		examplePositiveInt = newExamplePositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_POSITIVE_INT, oldExamplePositiveInt, newExamplePositiveInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExamplePositiveInt(PositiveInt newExamplePositiveInt) {
		if (newExamplePositiveInt != examplePositiveInt) {
			NotificationChain msgs = null;
			if (examplePositiveInt != null)
				msgs = ((InternalEObject)examplePositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_POSITIVE_INT, null, msgs);
			if (newExamplePositiveInt != null)
				msgs = ((InternalEObject)newExamplePositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_POSITIVE_INT, null, msgs);
			msgs = basicSetExamplePositiveInt(newExamplePositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_POSITIVE_INT, newExamplePositiveInt, newExamplePositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getExampleAnnotation() {
		return exampleAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleAnnotation(Annotation newExampleAnnotation, NotificationChain msgs) {
		Annotation oldExampleAnnotation = exampleAnnotation;
		exampleAnnotation = newExampleAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ANNOTATION, oldExampleAnnotation, newExampleAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleAnnotation(Annotation newExampleAnnotation) {
		if (newExampleAnnotation != exampleAnnotation) {
			NotificationChain msgs = null;
			if (exampleAnnotation != null)
				msgs = ((InternalEObject)exampleAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ANNOTATION, null, msgs);
			if (newExampleAnnotation != null)
				msgs = ((InternalEObject)newExampleAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ANNOTATION, null, msgs);
			msgs = basicSetExampleAnnotation(newExampleAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ANNOTATION, newExampleAnnotation, newExampleAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getExampleAttachment() {
		return exampleAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleAttachment(Attachment newExampleAttachment, NotificationChain msgs) {
		Attachment oldExampleAttachment = exampleAttachment;
		exampleAttachment = newExampleAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ATTACHMENT, oldExampleAttachment, newExampleAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleAttachment(Attachment newExampleAttachment) {
		if (newExampleAttachment != exampleAttachment) {
			NotificationChain msgs = null;
			if (exampleAttachment != null)
				msgs = ((InternalEObject)exampleAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ATTACHMENT, null, msgs);
			if (newExampleAttachment != null)
				msgs = ((InternalEObject)newExampleAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ATTACHMENT, null, msgs);
			msgs = basicSetExampleAttachment(newExampleAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ATTACHMENT, newExampleAttachment, newExampleAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getExampleIdentifier() {
		return exampleIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleIdentifier(Identifier newExampleIdentifier, NotificationChain msgs) {
		Identifier oldExampleIdentifier = exampleIdentifier;
		exampleIdentifier = newExampleIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_IDENTIFIER, oldExampleIdentifier, newExampleIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleIdentifier(Identifier newExampleIdentifier) {
		if (newExampleIdentifier != exampleIdentifier) {
			NotificationChain msgs = null;
			if (exampleIdentifier != null)
				msgs = ((InternalEObject)exampleIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_IDENTIFIER, null, msgs);
			if (newExampleIdentifier != null)
				msgs = ((InternalEObject)newExampleIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_IDENTIFIER, null, msgs);
			msgs = basicSetExampleIdentifier(newExampleIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_IDENTIFIER, newExampleIdentifier, newExampleIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getExampleCodeableConcept() {
		return exampleCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleCodeableConcept(CodeableConcept newExampleCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldExampleCodeableConcept = exampleCodeableConcept;
		exampleCodeableConcept = newExampleCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODEABLE_CONCEPT, oldExampleCodeableConcept, newExampleCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleCodeableConcept(CodeableConcept newExampleCodeableConcept) {
		if (newExampleCodeableConcept != exampleCodeableConcept) {
			NotificationChain msgs = null;
			if (exampleCodeableConcept != null)
				msgs = ((InternalEObject)exampleCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODEABLE_CONCEPT, null, msgs);
			if (newExampleCodeableConcept != null)
				msgs = ((InternalEObject)newExampleCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetExampleCodeableConcept(newExampleCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODEABLE_CONCEPT, newExampleCodeableConcept, newExampleCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getExampleCoding() {
		return exampleCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleCoding(Coding newExampleCoding, NotificationChain msgs) {
		Coding oldExampleCoding = exampleCoding;
		exampleCoding = newExampleCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODING, oldExampleCoding, newExampleCoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleCoding(Coding newExampleCoding) {
		if (newExampleCoding != exampleCoding) {
			NotificationChain msgs = null;
			if (exampleCoding != null)
				msgs = ((InternalEObject)exampleCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODING, null, msgs);
			if (newExampleCoding != null)
				msgs = ((InternalEObject)newExampleCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODING, null, msgs);
			msgs = basicSetExampleCoding(newExampleCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODING, newExampleCoding, newExampleCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getExampleQuantity() {
		return exampleQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleQuantity(Quantity newExampleQuantity, NotificationChain msgs) {
		Quantity oldExampleQuantity = exampleQuantity;
		exampleQuantity = newExampleQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_QUANTITY, oldExampleQuantity, newExampleQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleQuantity(Quantity newExampleQuantity) {
		if (newExampleQuantity != exampleQuantity) {
			NotificationChain msgs = null;
			if (exampleQuantity != null)
				msgs = ((InternalEObject)exampleQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_QUANTITY, null, msgs);
			if (newExampleQuantity != null)
				msgs = ((InternalEObject)newExampleQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_QUANTITY, null, msgs);
			msgs = basicSetExampleQuantity(newExampleQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_QUANTITY, newExampleQuantity, newExampleQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getExampleRange() {
		return exampleRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleRange(Range newExampleRange, NotificationChain msgs) {
		Range oldExampleRange = exampleRange;
		exampleRange = newExampleRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_RANGE, oldExampleRange, newExampleRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleRange(Range newExampleRange) {
		if (newExampleRange != exampleRange) {
			NotificationChain msgs = null;
			if (exampleRange != null)
				msgs = ((InternalEObject)exampleRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_RANGE, null, msgs);
			if (newExampleRange != null)
				msgs = ((InternalEObject)newExampleRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_RANGE, null, msgs);
			msgs = basicSetExampleRange(newExampleRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_RANGE, newExampleRange, newExampleRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getExamplePeriod() {
		return examplePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExamplePeriod(Period newExamplePeriod, NotificationChain msgs) {
		Period oldExamplePeriod = examplePeriod;
		examplePeriod = newExamplePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_PERIOD, oldExamplePeriod, newExamplePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExamplePeriod(Period newExamplePeriod) {
		if (newExamplePeriod != examplePeriod) {
			NotificationChain msgs = null;
			if (examplePeriod != null)
				msgs = ((InternalEObject)examplePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_PERIOD, null, msgs);
			if (newExamplePeriod != null)
				msgs = ((InternalEObject)newExamplePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_PERIOD, null, msgs);
			msgs = basicSetExamplePeriod(newExamplePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_PERIOD, newExamplePeriod, newExamplePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getExampleRatio() {
		return exampleRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleRatio(Ratio newExampleRatio, NotificationChain msgs) {
		Ratio oldExampleRatio = exampleRatio;
		exampleRatio = newExampleRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_RATIO, oldExampleRatio, newExampleRatio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleRatio(Ratio newExampleRatio) {
		if (newExampleRatio != exampleRatio) {
			NotificationChain msgs = null;
			if (exampleRatio != null)
				msgs = ((InternalEObject)exampleRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_RATIO, null, msgs);
			if (newExampleRatio != null)
				msgs = ((InternalEObject)newExampleRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_RATIO, null, msgs);
			msgs = basicSetExampleRatio(newExampleRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_RATIO, newExampleRatio, newExampleRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getExampleReference() {
		return exampleReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleReference(Reference newExampleReference, NotificationChain msgs) {
		Reference oldExampleReference = exampleReference;
		exampleReference = newExampleReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_REFERENCE, oldExampleReference, newExampleReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleReference(Reference newExampleReference) {
		if (newExampleReference != exampleReference) {
			NotificationChain msgs = null;
			if (exampleReference != null)
				msgs = ((InternalEObject)exampleReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_REFERENCE, null, msgs);
			if (newExampleReference != null)
				msgs = ((InternalEObject)newExampleReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_REFERENCE, null, msgs);
			msgs = basicSetExampleReference(newExampleReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_REFERENCE, newExampleReference, newExampleReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledData getExampleSampledData() {
		return exampleSampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleSampledData(SampledData newExampleSampledData, NotificationChain msgs) {
		SampledData oldExampleSampledData = exampleSampledData;
		exampleSampledData = newExampleSampledData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_SAMPLED_DATA, oldExampleSampledData, newExampleSampledData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleSampledData(SampledData newExampleSampledData) {
		if (newExampleSampledData != exampleSampledData) {
			NotificationChain msgs = null;
			if (exampleSampledData != null)
				msgs = ((InternalEObject)exampleSampledData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_SAMPLED_DATA, null, msgs);
			if (newExampleSampledData != null)
				msgs = ((InternalEObject)newExampleSampledData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_SAMPLED_DATA, null, msgs);
			msgs = basicSetExampleSampledData(newExampleSampledData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_SAMPLED_DATA, newExampleSampledData, newExampleSampledData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getExampleSignature() {
		return exampleSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleSignature(Signature newExampleSignature, NotificationChain msgs) {
		Signature oldExampleSignature = exampleSignature;
		exampleSignature = newExampleSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_SIGNATURE, oldExampleSignature, newExampleSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleSignature(Signature newExampleSignature) {
		if (newExampleSignature != exampleSignature) {
			NotificationChain msgs = null;
			if (exampleSignature != null)
				msgs = ((InternalEObject)exampleSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_SIGNATURE, null, msgs);
			if (newExampleSignature != null)
				msgs = ((InternalEObject)newExampleSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_SIGNATURE, null, msgs);
			msgs = basicSetExampleSignature(newExampleSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_SIGNATURE, newExampleSignature, newExampleSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanName getExampleHumanName() {
		return exampleHumanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleHumanName(HumanName newExampleHumanName, NotificationChain msgs) {
		HumanName oldExampleHumanName = exampleHumanName;
		exampleHumanName = newExampleHumanName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_HUMAN_NAME, oldExampleHumanName, newExampleHumanName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleHumanName(HumanName newExampleHumanName) {
		if (newExampleHumanName != exampleHumanName) {
			NotificationChain msgs = null;
			if (exampleHumanName != null)
				msgs = ((InternalEObject)exampleHumanName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_HUMAN_NAME, null, msgs);
			if (newExampleHumanName != null)
				msgs = ((InternalEObject)newExampleHumanName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_HUMAN_NAME, null, msgs);
			msgs = basicSetExampleHumanName(newExampleHumanName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_HUMAN_NAME, newExampleHumanName, newExampleHumanName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getExampleAddress() {
		return exampleAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleAddress(Address newExampleAddress, NotificationChain msgs) {
		Address oldExampleAddress = exampleAddress;
		exampleAddress = newExampleAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ADDRESS, oldExampleAddress, newExampleAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleAddress(Address newExampleAddress) {
		if (newExampleAddress != exampleAddress) {
			NotificationChain msgs = null;
			if (exampleAddress != null)
				msgs = ((InternalEObject)exampleAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ADDRESS, null, msgs);
			if (newExampleAddress != null)
				msgs = ((InternalEObject)newExampleAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ADDRESS, null, msgs);
			msgs = basicSetExampleAddress(newExampleAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ADDRESS, newExampleAddress, newExampleAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPoint getExampleContactPoint() {
		return exampleContactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleContactPoint(ContactPoint newExampleContactPoint, NotificationChain msgs) {
		ContactPoint oldExampleContactPoint = exampleContactPoint;
		exampleContactPoint = newExampleContactPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CONTACT_POINT, oldExampleContactPoint, newExampleContactPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleContactPoint(ContactPoint newExampleContactPoint) {
		if (newExampleContactPoint != exampleContactPoint) {
			NotificationChain msgs = null;
			if (exampleContactPoint != null)
				msgs = ((InternalEObject)exampleContactPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CONTACT_POINT, null, msgs);
			if (newExampleContactPoint != null)
				msgs = ((InternalEObject)newExampleContactPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CONTACT_POINT, null, msgs);
			msgs = basicSetExampleContactPoint(newExampleContactPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CONTACT_POINT, newExampleContactPoint, newExampleContactPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getExampleTiming() {
		return exampleTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleTiming(Timing newExampleTiming, NotificationChain msgs) {
		Timing oldExampleTiming = exampleTiming;
		exampleTiming = newExampleTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_TIMING, oldExampleTiming, newExampleTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleTiming(Timing newExampleTiming) {
		if (newExampleTiming != exampleTiming) {
			NotificationChain msgs = null;
			if (exampleTiming != null)
				msgs = ((InternalEObject)exampleTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_TIMING, null, msgs);
			if (newExampleTiming != null)
				msgs = ((InternalEObject)newExampleTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_TIMING, null, msgs);
			msgs = basicSetExampleTiming(newExampleTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_TIMING, newExampleTiming, newExampleTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta getExampleMeta() {
		return exampleMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExampleMeta(Meta newExampleMeta, NotificationChain msgs) {
		Meta oldExampleMeta = exampleMeta;
		exampleMeta = newExampleMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_META, oldExampleMeta, newExampleMeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleMeta(Meta newExampleMeta) {
		if (newExampleMeta != exampleMeta) {
			NotificationChain msgs = null;
			if (exampleMeta != null)
				msgs = ((InternalEObject)exampleMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_META, null, msgs);
			if (newExampleMeta != null)
				msgs = ((InternalEObject)newExampleMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__EXAMPLE_META, null, msgs);
			msgs = basicSetExampleMeta(newExampleMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__EXAMPLE_META, newExampleMeta, newExampleMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getMinValueBoolean() {
		return minValueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueBoolean(org.hl7.fhir.Boolean newMinValueBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldMinValueBoolean = minValueBoolean;
		minValueBoolean = newMinValueBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_BOOLEAN, oldMinValueBoolean, newMinValueBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueBoolean(org.hl7.fhir.Boolean newMinValueBoolean) {
		if (newMinValueBoolean != minValueBoolean) {
			NotificationChain msgs = null;
			if (minValueBoolean != null)
				msgs = ((InternalEObject)minValueBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_BOOLEAN, null, msgs);
			if (newMinValueBoolean != null)
				msgs = ((InternalEObject)newMinValueBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_BOOLEAN, null, msgs);
			msgs = basicSetMinValueBoolean(newMinValueBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_BOOLEAN, newMinValueBoolean, newMinValueBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getMinValueInteger() {
		return minValueInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueInteger(org.hl7.fhir.Integer newMinValueInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldMinValueInteger = minValueInteger;
		minValueInteger = newMinValueInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INTEGER, oldMinValueInteger, newMinValueInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueInteger(org.hl7.fhir.Integer newMinValueInteger) {
		if (newMinValueInteger != minValueInteger) {
			NotificationChain msgs = null;
			if (minValueInteger != null)
				msgs = ((InternalEObject)minValueInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INTEGER, null, msgs);
			if (newMinValueInteger != null)
				msgs = ((InternalEObject)newMinValueInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INTEGER, null, msgs);
			msgs = basicSetMinValueInteger(newMinValueInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INTEGER, newMinValueInteger, newMinValueInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getMinValueDecimal() {
		return minValueDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueDecimal(Decimal newMinValueDecimal, NotificationChain msgs) {
		Decimal oldMinValueDecimal = minValueDecimal;
		minValueDecimal = newMinValueDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DECIMAL, oldMinValueDecimal, newMinValueDecimal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueDecimal(Decimal newMinValueDecimal) {
		if (newMinValueDecimal != minValueDecimal) {
			NotificationChain msgs = null;
			if (minValueDecimal != null)
				msgs = ((InternalEObject)minValueDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DECIMAL, null, msgs);
			if (newMinValueDecimal != null)
				msgs = ((InternalEObject)newMinValueDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DECIMAL, null, msgs);
			msgs = basicSetMinValueDecimal(newMinValueDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DECIMAL, newMinValueDecimal, newMinValueDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary getMinValueBase64Binary() {
		return minValueBase64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueBase64Binary(Base64Binary newMinValueBase64Binary, NotificationChain msgs) {
		Base64Binary oldMinValueBase64Binary = minValueBase64Binary;
		minValueBase64Binary = newMinValueBase64Binary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_BASE64_BINARY, oldMinValueBase64Binary, newMinValueBase64Binary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueBase64Binary(Base64Binary newMinValueBase64Binary) {
		if (newMinValueBase64Binary != minValueBase64Binary) {
			NotificationChain msgs = null;
			if (minValueBase64Binary != null)
				msgs = ((InternalEObject)minValueBase64Binary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_BASE64_BINARY, null, msgs);
			if (newMinValueBase64Binary != null)
				msgs = ((InternalEObject)newMinValueBase64Binary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_BASE64_BINARY, null, msgs);
			msgs = basicSetMinValueBase64Binary(newMinValueBase64Binary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_BASE64_BINARY, newMinValueBase64Binary, newMinValueBase64Binary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getMinValueInstant() {
		return minValueInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueInstant(Instant newMinValueInstant, NotificationChain msgs) {
		Instant oldMinValueInstant = minValueInstant;
		minValueInstant = newMinValueInstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INSTANT, oldMinValueInstant, newMinValueInstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueInstant(Instant newMinValueInstant) {
		if (newMinValueInstant != minValueInstant) {
			NotificationChain msgs = null;
			if (minValueInstant != null)
				msgs = ((InternalEObject)minValueInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INSTANT, null, msgs);
			if (newMinValueInstant != null)
				msgs = ((InternalEObject)newMinValueInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INSTANT, null, msgs);
			msgs = basicSetMinValueInstant(newMinValueInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INSTANT, newMinValueInstant, newMinValueInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getMinValueString() {
		return minValueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueString(org.hl7.fhir.String newMinValueString, NotificationChain msgs) {
		org.hl7.fhir.String oldMinValueString = minValueString;
		minValueString = newMinValueString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_STRING, oldMinValueString, newMinValueString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueString(org.hl7.fhir.String newMinValueString) {
		if (newMinValueString != minValueString) {
			NotificationChain msgs = null;
			if (minValueString != null)
				msgs = ((InternalEObject)minValueString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_STRING, null, msgs);
			if (newMinValueString != null)
				msgs = ((InternalEObject)newMinValueString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_STRING, null, msgs);
			msgs = basicSetMinValueString(newMinValueString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_STRING, newMinValueString, newMinValueString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getMinValueUri() {
		return minValueUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueUri(Uri newMinValueUri, NotificationChain msgs) {
		Uri oldMinValueUri = minValueUri;
		minValueUri = newMinValueUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_URI, oldMinValueUri, newMinValueUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueUri(Uri newMinValueUri) {
		if (newMinValueUri != minValueUri) {
			NotificationChain msgs = null;
			if (minValueUri != null)
				msgs = ((InternalEObject)minValueUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_URI, null, msgs);
			if (newMinValueUri != null)
				msgs = ((InternalEObject)newMinValueUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_URI, null, msgs);
			msgs = basicSetMinValueUri(newMinValueUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_URI, newMinValueUri, newMinValueUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getMinValueDate() {
		return minValueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueDate(Date newMinValueDate, NotificationChain msgs) {
		Date oldMinValueDate = minValueDate;
		minValueDate = newMinValueDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE, oldMinValueDate, newMinValueDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueDate(Date newMinValueDate) {
		if (newMinValueDate != minValueDate) {
			NotificationChain msgs = null;
			if (minValueDate != null)
				msgs = ((InternalEObject)minValueDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE, null, msgs);
			if (newMinValueDate != null)
				msgs = ((InternalEObject)newMinValueDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE, null, msgs);
			msgs = basicSetMinValueDate(newMinValueDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE, newMinValueDate, newMinValueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getMinValueDateTime() {
		return minValueDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueDateTime(DateTime newMinValueDateTime, NotificationChain msgs) {
		DateTime oldMinValueDateTime = minValueDateTime;
		minValueDateTime = newMinValueDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE_TIME, oldMinValueDateTime, newMinValueDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueDateTime(DateTime newMinValueDateTime) {
		if (newMinValueDateTime != minValueDateTime) {
			NotificationChain msgs = null;
			if (minValueDateTime != null)
				msgs = ((InternalEObject)minValueDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE_TIME, null, msgs);
			if (newMinValueDateTime != null)
				msgs = ((InternalEObject)newMinValueDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE_TIME, null, msgs);
			msgs = basicSetMinValueDateTime(newMinValueDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE_TIME, newMinValueDateTime, newMinValueDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getMinValueTime() {
		return minValueTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueTime(Time newMinValueTime, NotificationChain msgs) {
		Time oldMinValueTime = minValueTime;
		minValueTime = newMinValueTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIME, oldMinValueTime, newMinValueTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueTime(Time newMinValueTime) {
		if (newMinValueTime != minValueTime) {
			NotificationChain msgs = null;
			if (minValueTime != null)
				msgs = ((InternalEObject)minValueTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIME, null, msgs);
			if (newMinValueTime != null)
				msgs = ((InternalEObject)newMinValueTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIME, null, msgs);
			msgs = basicSetMinValueTime(newMinValueTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIME, newMinValueTime, newMinValueTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getMinValueCode() {
		return minValueCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueCode(Code newMinValueCode, NotificationChain msgs) {
		Code oldMinValueCode = minValueCode;
		minValueCode = newMinValueCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODE, oldMinValueCode, newMinValueCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueCode(Code newMinValueCode) {
		if (newMinValueCode != minValueCode) {
			NotificationChain msgs = null;
			if (minValueCode != null)
				msgs = ((InternalEObject)minValueCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODE, null, msgs);
			if (newMinValueCode != null)
				msgs = ((InternalEObject)newMinValueCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODE, null, msgs);
			msgs = basicSetMinValueCode(newMinValueCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODE, newMinValueCode, newMinValueCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getMinValueOid() {
		return minValueOid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueOid(Oid newMinValueOid, NotificationChain msgs) {
		Oid oldMinValueOid = minValueOid;
		minValueOid = newMinValueOid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_OID, oldMinValueOid, newMinValueOid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueOid(Oid newMinValueOid) {
		if (newMinValueOid != minValueOid) {
			NotificationChain msgs = null;
			if (minValueOid != null)
				msgs = ((InternalEObject)minValueOid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_OID, null, msgs);
			if (newMinValueOid != null)
				msgs = ((InternalEObject)newMinValueOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_OID, null, msgs);
			msgs = basicSetMinValueOid(newMinValueOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_OID, newMinValueOid, newMinValueOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uuid getMinValueUuid() {
		return minValueUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueUuid(Uuid newMinValueUuid, NotificationChain msgs) {
		Uuid oldMinValueUuid = minValueUuid;
		minValueUuid = newMinValueUuid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UUID, oldMinValueUuid, newMinValueUuid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueUuid(Uuid newMinValueUuid) {
		if (newMinValueUuid != minValueUuid) {
			NotificationChain msgs = null;
			if (minValueUuid != null)
				msgs = ((InternalEObject)minValueUuid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UUID, null, msgs);
			if (newMinValueUuid != null)
				msgs = ((InternalEObject)newMinValueUuid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UUID, null, msgs);
			msgs = basicSetMinValueUuid(newMinValueUuid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UUID, newMinValueUuid, newMinValueUuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getMinValueId() {
		return minValueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueId(Id newMinValueId, NotificationChain msgs) {
		Id oldMinValueId = minValueId;
		minValueId = newMinValueId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ID, oldMinValueId, newMinValueId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueId(Id newMinValueId) {
		if (newMinValueId != minValueId) {
			NotificationChain msgs = null;
			if (minValueId != null)
				msgs = ((InternalEObject)minValueId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ID, null, msgs);
			if (newMinValueId != null)
				msgs = ((InternalEObject)newMinValueId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ID, null, msgs);
			msgs = basicSetMinValueId(newMinValueId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ID, newMinValueId, newMinValueId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getMinValueUnsignedInt() {
		return minValueUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueUnsignedInt(UnsignedInt newMinValueUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldMinValueUnsignedInt = minValueUnsignedInt;
		minValueUnsignedInt = newMinValueUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UNSIGNED_INT, oldMinValueUnsignedInt, newMinValueUnsignedInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueUnsignedInt(UnsignedInt newMinValueUnsignedInt) {
		if (newMinValueUnsignedInt != minValueUnsignedInt) {
			NotificationChain msgs = null;
			if (minValueUnsignedInt != null)
				msgs = ((InternalEObject)minValueUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UNSIGNED_INT, null, msgs);
			if (newMinValueUnsignedInt != null)
				msgs = ((InternalEObject)newMinValueUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UNSIGNED_INT, null, msgs);
			msgs = basicSetMinValueUnsignedInt(newMinValueUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UNSIGNED_INT, newMinValueUnsignedInt, newMinValueUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getMinValuePositiveInt() {
		return minValuePositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValuePositiveInt(PositiveInt newMinValuePositiveInt, NotificationChain msgs) {
		PositiveInt oldMinValuePositiveInt = minValuePositiveInt;
		minValuePositiveInt = newMinValuePositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_POSITIVE_INT, oldMinValuePositiveInt, newMinValuePositiveInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValuePositiveInt(PositiveInt newMinValuePositiveInt) {
		if (newMinValuePositiveInt != minValuePositiveInt) {
			NotificationChain msgs = null;
			if (minValuePositiveInt != null)
				msgs = ((InternalEObject)minValuePositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_POSITIVE_INT, null, msgs);
			if (newMinValuePositiveInt != null)
				msgs = ((InternalEObject)newMinValuePositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_POSITIVE_INT, null, msgs);
			msgs = basicSetMinValuePositiveInt(newMinValuePositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_POSITIVE_INT, newMinValuePositiveInt, newMinValuePositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getMinValueAnnotation() {
		return minValueAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueAnnotation(Annotation newMinValueAnnotation, NotificationChain msgs) {
		Annotation oldMinValueAnnotation = minValueAnnotation;
		minValueAnnotation = newMinValueAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ANNOTATION, oldMinValueAnnotation, newMinValueAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueAnnotation(Annotation newMinValueAnnotation) {
		if (newMinValueAnnotation != minValueAnnotation) {
			NotificationChain msgs = null;
			if (minValueAnnotation != null)
				msgs = ((InternalEObject)minValueAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ANNOTATION, null, msgs);
			if (newMinValueAnnotation != null)
				msgs = ((InternalEObject)newMinValueAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ANNOTATION, null, msgs);
			msgs = basicSetMinValueAnnotation(newMinValueAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ANNOTATION, newMinValueAnnotation, newMinValueAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getMinValueAttachment() {
		return minValueAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueAttachment(Attachment newMinValueAttachment, NotificationChain msgs) {
		Attachment oldMinValueAttachment = minValueAttachment;
		minValueAttachment = newMinValueAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ATTACHMENT, oldMinValueAttachment, newMinValueAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueAttachment(Attachment newMinValueAttachment) {
		if (newMinValueAttachment != minValueAttachment) {
			NotificationChain msgs = null;
			if (minValueAttachment != null)
				msgs = ((InternalEObject)minValueAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ATTACHMENT, null, msgs);
			if (newMinValueAttachment != null)
				msgs = ((InternalEObject)newMinValueAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ATTACHMENT, null, msgs);
			msgs = basicSetMinValueAttachment(newMinValueAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ATTACHMENT, newMinValueAttachment, newMinValueAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getMinValueIdentifier() {
		return minValueIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueIdentifier(Identifier newMinValueIdentifier, NotificationChain msgs) {
		Identifier oldMinValueIdentifier = minValueIdentifier;
		minValueIdentifier = newMinValueIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_IDENTIFIER, oldMinValueIdentifier, newMinValueIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueIdentifier(Identifier newMinValueIdentifier) {
		if (newMinValueIdentifier != minValueIdentifier) {
			NotificationChain msgs = null;
			if (minValueIdentifier != null)
				msgs = ((InternalEObject)minValueIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_IDENTIFIER, null, msgs);
			if (newMinValueIdentifier != null)
				msgs = ((InternalEObject)newMinValueIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_IDENTIFIER, null, msgs);
			msgs = basicSetMinValueIdentifier(newMinValueIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_IDENTIFIER, newMinValueIdentifier, newMinValueIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMinValueCodeableConcept() {
		return minValueCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueCodeableConcept(CodeableConcept newMinValueCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldMinValueCodeableConcept = minValueCodeableConcept;
		minValueCodeableConcept = newMinValueCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODEABLE_CONCEPT, oldMinValueCodeableConcept, newMinValueCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueCodeableConcept(CodeableConcept newMinValueCodeableConcept) {
		if (newMinValueCodeableConcept != minValueCodeableConcept) {
			NotificationChain msgs = null;
			if (minValueCodeableConcept != null)
				msgs = ((InternalEObject)minValueCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODEABLE_CONCEPT, null, msgs);
			if (newMinValueCodeableConcept != null)
				msgs = ((InternalEObject)newMinValueCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetMinValueCodeableConcept(newMinValueCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODEABLE_CONCEPT, newMinValueCodeableConcept, newMinValueCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getMinValueCoding() {
		return minValueCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueCoding(Coding newMinValueCoding, NotificationChain msgs) {
		Coding oldMinValueCoding = minValueCoding;
		minValueCoding = newMinValueCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODING, oldMinValueCoding, newMinValueCoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueCoding(Coding newMinValueCoding) {
		if (newMinValueCoding != minValueCoding) {
			NotificationChain msgs = null;
			if (minValueCoding != null)
				msgs = ((InternalEObject)minValueCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODING, null, msgs);
			if (newMinValueCoding != null)
				msgs = ((InternalEObject)newMinValueCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODING, null, msgs);
			msgs = basicSetMinValueCoding(newMinValueCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODING, newMinValueCoding, newMinValueCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getMinValueQuantity() {
		return minValueQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueQuantity(Quantity newMinValueQuantity, NotificationChain msgs) {
		Quantity oldMinValueQuantity = minValueQuantity;
		minValueQuantity = newMinValueQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_QUANTITY, oldMinValueQuantity, newMinValueQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueQuantity(Quantity newMinValueQuantity) {
		if (newMinValueQuantity != minValueQuantity) {
			NotificationChain msgs = null;
			if (minValueQuantity != null)
				msgs = ((InternalEObject)minValueQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_QUANTITY, null, msgs);
			if (newMinValueQuantity != null)
				msgs = ((InternalEObject)newMinValueQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_QUANTITY, null, msgs);
			msgs = basicSetMinValueQuantity(newMinValueQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_QUANTITY, newMinValueQuantity, newMinValueQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getMinValueRange() {
		return minValueRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueRange(Range newMinValueRange, NotificationChain msgs) {
		Range oldMinValueRange = minValueRange;
		minValueRange = newMinValueRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_RANGE, oldMinValueRange, newMinValueRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueRange(Range newMinValueRange) {
		if (newMinValueRange != minValueRange) {
			NotificationChain msgs = null;
			if (minValueRange != null)
				msgs = ((InternalEObject)minValueRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_RANGE, null, msgs);
			if (newMinValueRange != null)
				msgs = ((InternalEObject)newMinValueRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_RANGE, null, msgs);
			msgs = basicSetMinValueRange(newMinValueRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_RANGE, newMinValueRange, newMinValueRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getMinValuePeriod() {
		return minValuePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValuePeriod(Period newMinValuePeriod, NotificationChain msgs) {
		Period oldMinValuePeriod = minValuePeriod;
		minValuePeriod = newMinValuePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_PERIOD, oldMinValuePeriod, newMinValuePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValuePeriod(Period newMinValuePeriod) {
		if (newMinValuePeriod != minValuePeriod) {
			NotificationChain msgs = null;
			if (minValuePeriod != null)
				msgs = ((InternalEObject)minValuePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_PERIOD, null, msgs);
			if (newMinValuePeriod != null)
				msgs = ((InternalEObject)newMinValuePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_PERIOD, null, msgs);
			msgs = basicSetMinValuePeriod(newMinValuePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_PERIOD, newMinValuePeriod, newMinValuePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getMinValueRatio() {
		return minValueRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueRatio(Ratio newMinValueRatio, NotificationChain msgs) {
		Ratio oldMinValueRatio = minValueRatio;
		minValueRatio = newMinValueRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_RATIO, oldMinValueRatio, newMinValueRatio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueRatio(Ratio newMinValueRatio) {
		if (newMinValueRatio != minValueRatio) {
			NotificationChain msgs = null;
			if (minValueRatio != null)
				msgs = ((InternalEObject)minValueRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_RATIO, null, msgs);
			if (newMinValueRatio != null)
				msgs = ((InternalEObject)newMinValueRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_RATIO, null, msgs);
			msgs = basicSetMinValueRatio(newMinValueRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_RATIO, newMinValueRatio, newMinValueRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getMinValueReference() {
		return minValueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueReference(Reference newMinValueReference, NotificationChain msgs) {
		Reference oldMinValueReference = minValueReference;
		minValueReference = newMinValueReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_REFERENCE, oldMinValueReference, newMinValueReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueReference(Reference newMinValueReference) {
		if (newMinValueReference != minValueReference) {
			NotificationChain msgs = null;
			if (minValueReference != null)
				msgs = ((InternalEObject)minValueReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_REFERENCE, null, msgs);
			if (newMinValueReference != null)
				msgs = ((InternalEObject)newMinValueReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_REFERENCE, null, msgs);
			msgs = basicSetMinValueReference(newMinValueReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_REFERENCE, newMinValueReference, newMinValueReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledData getMinValueSampledData() {
		return minValueSampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueSampledData(SampledData newMinValueSampledData, NotificationChain msgs) {
		SampledData oldMinValueSampledData = minValueSampledData;
		minValueSampledData = newMinValueSampledData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_SAMPLED_DATA, oldMinValueSampledData, newMinValueSampledData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueSampledData(SampledData newMinValueSampledData) {
		if (newMinValueSampledData != minValueSampledData) {
			NotificationChain msgs = null;
			if (minValueSampledData != null)
				msgs = ((InternalEObject)minValueSampledData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_SAMPLED_DATA, null, msgs);
			if (newMinValueSampledData != null)
				msgs = ((InternalEObject)newMinValueSampledData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_SAMPLED_DATA, null, msgs);
			msgs = basicSetMinValueSampledData(newMinValueSampledData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_SAMPLED_DATA, newMinValueSampledData, newMinValueSampledData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getMinValueSignature() {
		return minValueSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueSignature(Signature newMinValueSignature, NotificationChain msgs) {
		Signature oldMinValueSignature = minValueSignature;
		minValueSignature = newMinValueSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_SIGNATURE, oldMinValueSignature, newMinValueSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueSignature(Signature newMinValueSignature) {
		if (newMinValueSignature != minValueSignature) {
			NotificationChain msgs = null;
			if (minValueSignature != null)
				msgs = ((InternalEObject)minValueSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_SIGNATURE, null, msgs);
			if (newMinValueSignature != null)
				msgs = ((InternalEObject)newMinValueSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_SIGNATURE, null, msgs);
			msgs = basicSetMinValueSignature(newMinValueSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_SIGNATURE, newMinValueSignature, newMinValueSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanName getMinValueHumanName() {
		return minValueHumanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueHumanName(HumanName newMinValueHumanName, NotificationChain msgs) {
		HumanName oldMinValueHumanName = minValueHumanName;
		minValueHumanName = newMinValueHumanName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_HUMAN_NAME, oldMinValueHumanName, newMinValueHumanName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueHumanName(HumanName newMinValueHumanName) {
		if (newMinValueHumanName != minValueHumanName) {
			NotificationChain msgs = null;
			if (minValueHumanName != null)
				msgs = ((InternalEObject)minValueHumanName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_HUMAN_NAME, null, msgs);
			if (newMinValueHumanName != null)
				msgs = ((InternalEObject)newMinValueHumanName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_HUMAN_NAME, null, msgs);
			msgs = basicSetMinValueHumanName(newMinValueHumanName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_HUMAN_NAME, newMinValueHumanName, newMinValueHumanName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getMinValueAddress() {
		return minValueAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueAddress(Address newMinValueAddress, NotificationChain msgs) {
		Address oldMinValueAddress = minValueAddress;
		minValueAddress = newMinValueAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ADDRESS, oldMinValueAddress, newMinValueAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueAddress(Address newMinValueAddress) {
		if (newMinValueAddress != minValueAddress) {
			NotificationChain msgs = null;
			if (minValueAddress != null)
				msgs = ((InternalEObject)minValueAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ADDRESS, null, msgs);
			if (newMinValueAddress != null)
				msgs = ((InternalEObject)newMinValueAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ADDRESS, null, msgs);
			msgs = basicSetMinValueAddress(newMinValueAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ADDRESS, newMinValueAddress, newMinValueAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPoint getMinValueContactPoint() {
		return minValueContactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueContactPoint(ContactPoint newMinValueContactPoint, NotificationChain msgs) {
		ContactPoint oldMinValueContactPoint = minValueContactPoint;
		minValueContactPoint = newMinValueContactPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CONTACT_POINT, oldMinValueContactPoint, newMinValueContactPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueContactPoint(ContactPoint newMinValueContactPoint) {
		if (newMinValueContactPoint != minValueContactPoint) {
			NotificationChain msgs = null;
			if (minValueContactPoint != null)
				msgs = ((InternalEObject)minValueContactPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CONTACT_POINT, null, msgs);
			if (newMinValueContactPoint != null)
				msgs = ((InternalEObject)newMinValueContactPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CONTACT_POINT, null, msgs);
			msgs = basicSetMinValueContactPoint(newMinValueContactPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CONTACT_POINT, newMinValueContactPoint, newMinValueContactPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getMinValueTiming() {
		return minValueTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueTiming(Timing newMinValueTiming, NotificationChain msgs) {
		Timing oldMinValueTiming = minValueTiming;
		minValueTiming = newMinValueTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIMING, oldMinValueTiming, newMinValueTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueTiming(Timing newMinValueTiming) {
		if (newMinValueTiming != minValueTiming) {
			NotificationChain msgs = null;
			if (minValueTiming != null)
				msgs = ((InternalEObject)minValueTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIMING, null, msgs);
			if (newMinValueTiming != null)
				msgs = ((InternalEObject)newMinValueTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIMING, null, msgs);
			msgs = basicSetMinValueTiming(newMinValueTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIMING, newMinValueTiming, newMinValueTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta getMinValueMeta() {
		return minValueMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinValueMeta(Meta newMinValueMeta, NotificationChain msgs) {
		Meta oldMinValueMeta = minValueMeta;
		minValueMeta = newMinValueMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_META, oldMinValueMeta, newMinValueMeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValueMeta(Meta newMinValueMeta) {
		if (newMinValueMeta != minValueMeta) {
			NotificationChain msgs = null;
			if (minValueMeta != null)
				msgs = ((InternalEObject)minValueMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_META, null, msgs);
			if (newMinValueMeta != null)
				msgs = ((InternalEObject)newMinValueMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_META, null, msgs);
			msgs = basicSetMinValueMeta(newMinValueMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_META, newMinValueMeta, newMinValueMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getMaxValueBoolean() {
		return maxValueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueBoolean(org.hl7.fhir.Boolean newMaxValueBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldMaxValueBoolean = maxValueBoolean;
		maxValueBoolean = newMaxValueBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_BOOLEAN, oldMaxValueBoolean, newMaxValueBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueBoolean(org.hl7.fhir.Boolean newMaxValueBoolean) {
		if (newMaxValueBoolean != maxValueBoolean) {
			NotificationChain msgs = null;
			if (maxValueBoolean != null)
				msgs = ((InternalEObject)maxValueBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_BOOLEAN, null, msgs);
			if (newMaxValueBoolean != null)
				msgs = ((InternalEObject)newMaxValueBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_BOOLEAN, null, msgs);
			msgs = basicSetMaxValueBoolean(newMaxValueBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_BOOLEAN, newMaxValueBoolean, newMaxValueBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getMaxValueInteger() {
		return maxValueInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueInteger(org.hl7.fhir.Integer newMaxValueInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldMaxValueInteger = maxValueInteger;
		maxValueInteger = newMaxValueInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INTEGER, oldMaxValueInteger, newMaxValueInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueInteger(org.hl7.fhir.Integer newMaxValueInteger) {
		if (newMaxValueInteger != maxValueInteger) {
			NotificationChain msgs = null;
			if (maxValueInteger != null)
				msgs = ((InternalEObject)maxValueInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INTEGER, null, msgs);
			if (newMaxValueInteger != null)
				msgs = ((InternalEObject)newMaxValueInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INTEGER, null, msgs);
			msgs = basicSetMaxValueInteger(newMaxValueInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INTEGER, newMaxValueInteger, newMaxValueInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getMaxValueDecimal() {
		return maxValueDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueDecimal(Decimal newMaxValueDecimal, NotificationChain msgs) {
		Decimal oldMaxValueDecimal = maxValueDecimal;
		maxValueDecimal = newMaxValueDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DECIMAL, oldMaxValueDecimal, newMaxValueDecimal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueDecimal(Decimal newMaxValueDecimal) {
		if (newMaxValueDecimal != maxValueDecimal) {
			NotificationChain msgs = null;
			if (maxValueDecimal != null)
				msgs = ((InternalEObject)maxValueDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DECIMAL, null, msgs);
			if (newMaxValueDecimal != null)
				msgs = ((InternalEObject)newMaxValueDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DECIMAL, null, msgs);
			msgs = basicSetMaxValueDecimal(newMaxValueDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DECIMAL, newMaxValueDecimal, newMaxValueDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary getMaxValueBase64Binary() {
		return maxValueBase64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueBase64Binary(Base64Binary newMaxValueBase64Binary, NotificationChain msgs) {
		Base64Binary oldMaxValueBase64Binary = maxValueBase64Binary;
		maxValueBase64Binary = newMaxValueBase64Binary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_BASE64_BINARY, oldMaxValueBase64Binary, newMaxValueBase64Binary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueBase64Binary(Base64Binary newMaxValueBase64Binary) {
		if (newMaxValueBase64Binary != maxValueBase64Binary) {
			NotificationChain msgs = null;
			if (maxValueBase64Binary != null)
				msgs = ((InternalEObject)maxValueBase64Binary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_BASE64_BINARY, null, msgs);
			if (newMaxValueBase64Binary != null)
				msgs = ((InternalEObject)newMaxValueBase64Binary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_BASE64_BINARY, null, msgs);
			msgs = basicSetMaxValueBase64Binary(newMaxValueBase64Binary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_BASE64_BINARY, newMaxValueBase64Binary, newMaxValueBase64Binary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getMaxValueInstant() {
		return maxValueInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueInstant(Instant newMaxValueInstant, NotificationChain msgs) {
		Instant oldMaxValueInstant = maxValueInstant;
		maxValueInstant = newMaxValueInstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INSTANT, oldMaxValueInstant, newMaxValueInstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueInstant(Instant newMaxValueInstant) {
		if (newMaxValueInstant != maxValueInstant) {
			NotificationChain msgs = null;
			if (maxValueInstant != null)
				msgs = ((InternalEObject)maxValueInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INSTANT, null, msgs);
			if (newMaxValueInstant != null)
				msgs = ((InternalEObject)newMaxValueInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INSTANT, null, msgs);
			msgs = basicSetMaxValueInstant(newMaxValueInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INSTANT, newMaxValueInstant, newMaxValueInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getMaxValueString() {
		return maxValueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueString(org.hl7.fhir.String newMaxValueString, NotificationChain msgs) {
		org.hl7.fhir.String oldMaxValueString = maxValueString;
		maxValueString = newMaxValueString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_STRING, oldMaxValueString, newMaxValueString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueString(org.hl7.fhir.String newMaxValueString) {
		if (newMaxValueString != maxValueString) {
			NotificationChain msgs = null;
			if (maxValueString != null)
				msgs = ((InternalEObject)maxValueString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_STRING, null, msgs);
			if (newMaxValueString != null)
				msgs = ((InternalEObject)newMaxValueString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_STRING, null, msgs);
			msgs = basicSetMaxValueString(newMaxValueString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_STRING, newMaxValueString, newMaxValueString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getMaxValueUri() {
		return maxValueUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueUri(Uri newMaxValueUri, NotificationChain msgs) {
		Uri oldMaxValueUri = maxValueUri;
		maxValueUri = newMaxValueUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_URI, oldMaxValueUri, newMaxValueUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueUri(Uri newMaxValueUri) {
		if (newMaxValueUri != maxValueUri) {
			NotificationChain msgs = null;
			if (maxValueUri != null)
				msgs = ((InternalEObject)maxValueUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_URI, null, msgs);
			if (newMaxValueUri != null)
				msgs = ((InternalEObject)newMaxValueUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_URI, null, msgs);
			msgs = basicSetMaxValueUri(newMaxValueUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_URI, newMaxValueUri, newMaxValueUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getMaxValueDate() {
		return maxValueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueDate(Date newMaxValueDate, NotificationChain msgs) {
		Date oldMaxValueDate = maxValueDate;
		maxValueDate = newMaxValueDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE, oldMaxValueDate, newMaxValueDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueDate(Date newMaxValueDate) {
		if (newMaxValueDate != maxValueDate) {
			NotificationChain msgs = null;
			if (maxValueDate != null)
				msgs = ((InternalEObject)maxValueDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE, null, msgs);
			if (newMaxValueDate != null)
				msgs = ((InternalEObject)newMaxValueDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE, null, msgs);
			msgs = basicSetMaxValueDate(newMaxValueDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE, newMaxValueDate, newMaxValueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getMaxValueDateTime() {
		return maxValueDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueDateTime(DateTime newMaxValueDateTime, NotificationChain msgs) {
		DateTime oldMaxValueDateTime = maxValueDateTime;
		maxValueDateTime = newMaxValueDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE_TIME, oldMaxValueDateTime, newMaxValueDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueDateTime(DateTime newMaxValueDateTime) {
		if (newMaxValueDateTime != maxValueDateTime) {
			NotificationChain msgs = null;
			if (maxValueDateTime != null)
				msgs = ((InternalEObject)maxValueDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE_TIME, null, msgs);
			if (newMaxValueDateTime != null)
				msgs = ((InternalEObject)newMaxValueDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE_TIME, null, msgs);
			msgs = basicSetMaxValueDateTime(newMaxValueDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE_TIME, newMaxValueDateTime, newMaxValueDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getMaxValueTime() {
		return maxValueTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueTime(Time newMaxValueTime, NotificationChain msgs) {
		Time oldMaxValueTime = maxValueTime;
		maxValueTime = newMaxValueTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIME, oldMaxValueTime, newMaxValueTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueTime(Time newMaxValueTime) {
		if (newMaxValueTime != maxValueTime) {
			NotificationChain msgs = null;
			if (maxValueTime != null)
				msgs = ((InternalEObject)maxValueTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIME, null, msgs);
			if (newMaxValueTime != null)
				msgs = ((InternalEObject)newMaxValueTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIME, null, msgs);
			msgs = basicSetMaxValueTime(newMaxValueTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIME, newMaxValueTime, newMaxValueTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getMaxValueCode() {
		return maxValueCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueCode(Code newMaxValueCode, NotificationChain msgs) {
		Code oldMaxValueCode = maxValueCode;
		maxValueCode = newMaxValueCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODE, oldMaxValueCode, newMaxValueCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueCode(Code newMaxValueCode) {
		if (newMaxValueCode != maxValueCode) {
			NotificationChain msgs = null;
			if (maxValueCode != null)
				msgs = ((InternalEObject)maxValueCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODE, null, msgs);
			if (newMaxValueCode != null)
				msgs = ((InternalEObject)newMaxValueCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODE, null, msgs);
			msgs = basicSetMaxValueCode(newMaxValueCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODE, newMaxValueCode, newMaxValueCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getMaxValueOid() {
		return maxValueOid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueOid(Oid newMaxValueOid, NotificationChain msgs) {
		Oid oldMaxValueOid = maxValueOid;
		maxValueOid = newMaxValueOid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_OID, oldMaxValueOid, newMaxValueOid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueOid(Oid newMaxValueOid) {
		if (newMaxValueOid != maxValueOid) {
			NotificationChain msgs = null;
			if (maxValueOid != null)
				msgs = ((InternalEObject)maxValueOid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_OID, null, msgs);
			if (newMaxValueOid != null)
				msgs = ((InternalEObject)newMaxValueOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_OID, null, msgs);
			msgs = basicSetMaxValueOid(newMaxValueOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_OID, newMaxValueOid, newMaxValueOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uuid getMaxValueUuid() {
		return maxValueUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueUuid(Uuid newMaxValueUuid, NotificationChain msgs) {
		Uuid oldMaxValueUuid = maxValueUuid;
		maxValueUuid = newMaxValueUuid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UUID, oldMaxValueUuid, newMaxValueUuid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueUuid(Uuid newMaxValueUuid) {
		if (newMaxValueUuid != maxValueUuid) {
			NotificationChain msgs = null;
			if (maxValueUuid != null)
				msgs = ((InternalEObject)maxValueUuid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UUID, null, msgs);
			if (newMaxValueUuid != null)
				msgs = ((InternalEObject)newMaxValueUuid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UUID, null, msgs);
			msgs = basicSetMaxValueUuid(newMaxValueUuid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UUID, newMaxValueUuid, newMaxValueUuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getMaxValueId() {
		return maxValueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueId(Id newMaxValueId, NotificationChain msgs) {
		Id oldMaxValueId = maxValueId;
		maxValueId = newMaxValueId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ID, oldMaxValueId, newMaxValueId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueId(Id newMaxValueId) {
		if (newMaxValueId != maxValueId) {
			NotificationChain msgs = null;
			if (maxValueId != null)
				msgs = ((InternalEObject)maxValueId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ID, null, msgs);
			if (newMaxValueId != null)
				msgs = ((InternalEObject)newMaxValueId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ID, null, msgs);
			msgs = basicSetMaxValueId(newMaxValueId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ID, newMaxValueId, newMaxValueId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getMaxValueUnsignedInt() {
		return maxValueUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueUnsignedInt(UnsignedInt newMaxValueUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldMaxValueUnsignedInt = maxValueUnsignedInt;
		maxValueUnsignedInt = newMaxValueUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UNSIGNED_INT, oldMaxValueUnsignedInt, newMaxValueUnsignedInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueUnsignedInt(UnsignedInt newMaxValueUnsignedInt) {
		if (newMaxValueUnsignedInt != maxValueUnsignedInt) {
			NotificationChain msgs = null;
			if (maxValueUnsignedInt != null)
				msgs = ((InternalEObject)maxValueUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UNSIGNED_INT, null, msgs);
			if (newMaxValueUnsignedInt != null)
				msgs = ((InternalEObject)newMaxValueUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UNSIGNED_INT, null, msgs);
			msgs = basicSetMaxValueUnsignedInt(newMaxValueUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UNSIGNED_INT, newMaxValueUnsignedInt, newMaxValueUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getMaxValuePositiveInt() {
		return maxValuePositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValuePositiveInt(PositiveInt newMaxValuePositiveInt, NotificationChain msgs) {
		PositiveInt oldMaxValuePositiveInt = maxValuePositiveInt;
		maxValuePositiveInt = newMaxValuePositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_POSITIVE_INT, oldMaxValuePositiveInt, newMaxValuePositiveInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValuePositiveInt(PositiveInt newMaxValuePositiveInt) {
		if (newMaxValuePositiveInt != maxValuePositiveInt) {
			NotificationChain msgs = null;
			if (maxValuePositiveInt != null)
				msgs = ((InternalEObject)maxValuePositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_POSITIVE_INT, null, msgs);
			if (newMaxValuePositiveInt != null)
				msgs = ((InternalEObject)newMaxValuePositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_POSITIVE_INT, null, msgs);
			msgs = basicSetMaxValuePositiveInt(newMaxValuePositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_POSITIVE_INT, newMaxValuePositiveInt, newMaxValuePositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getMaxValueAnnotation() {
		return maxValueAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueAnnotation(Annotation newMaxValueAnnotation, NotificationChain msgs) {
		Annotation oldMaxValueAnnotation = maxValueAnnotation;
		maxValueAnnotation = newMaxValueAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ANNOTATION, oldMaxValueAnnotation, newMaxValueAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueAnnotation(Annotation newMaxValueAnnotation) {
		if (newMaxValueAnnotation != maxValueAnnotation) {
			NotificationChain msgs = null;
			if (maxValueAnnotation != null)
				msgs = ((InternalEObject)maxValueAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ANNOTATION, null, msgs);
			if (newMaxValueAnnotation != null)
				msgs = ((InternalEObject)newMaxValueAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ANNOTATION, null, msgs);
			msgs = basicSetMaxValueAnnotation(newMaxValueAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ANNOTATION, newMaxValueAnnotation, newMaxValueAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getMaxValueAttachment() {
		return maxValueAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueAttachment(Attachment newMaxValueAttachment, NotificationChain msgs) {
		Attachment oldMaxValueAttachment = maxValueAttachment;
		maxValueAttachment = newMaxValueAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ATTACHMENT, oldMaxValueAttachment, newMaxValueAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueAttachment(Attachment newMaxValueAttachment) {
		if (newMaxValueAttachment != maxValueAttachment) {
			NotificationChain msgs = null;
			if (maxValueAttachment != null)
				msgs = ((InternalEObject)maxValueAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ATTACHMENT, null, msgs);
			if (newMaxValueAttachment != null)
				msgs = ((InternalEObject)newMaxValueAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ATTACHMENT, null, msgs);
			msgs = basicSetMaxValueAttachment(newMaxValueAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ATTACHMENT, newMaxValueAttachment, newMaxValueAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getMaxValueIdentifier() {
		return maxValueIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueIdentifier(Identifier newMaxValueIdentifier, NotificationChain msgs) {
		Identifier oldMaxValueIdentifier = maxValueIdentifier;
		maxValueIdentifier = newMaxValueIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_IDENTIFIER, oldMaxValueIdentifier, newMaxValueIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueIdentifier(Identifier newMaxValueIdentifier) {
		if (newMaxValueIdentifier != maxValueIdentifier) {
			NotificationChain msgs = null;
			if (maxValueIdentifier != null)
				msgs = ((InternalEObject)maxValueIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_IDENTIFIER, null, msgs);
			if (newMaxValueIdentifier != null)
				msgs = ((InternalEObject)newMaxValueIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_IDENTIFIER, null, msgs);
			msgs = basicSetMaxValueIdentifier(newMaxValueIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_IDENTIFIER, newMaxValueIdentifier, newMaxValueIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMaxValueCodeableConcept() {
		return maxValueCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueCodeableConcept(CodeableConcept newMaxValueCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldMaxValueCodeableConcept = maxValueCodeableConcept;
		maxValueCodeableConcept = newMaxValueCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODEABLE_CONCEPT, oldMaxValueCodeableConcept, newMaxValueCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueCodeableConcept(CodeableConcept newMaxValueCodeableConcept) {
		if (newMaxValueCodeableConcept != maxValueCodeableConcept) {
			NotificationChain msgs = null;
			if (maxValueCodeableConcept != null)
				msgs = ((InternalEObject)maxValueCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODEABLE_CONCEPT, null, msgs);
			if (newMaxValueCodeableConcept != null)
				msgs = ((InternalEObject)newMaxValueCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetMaxValueCodeableConcept(newMaxValueCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODEABLE_CONCEPT, newMaxValueCodeableConcept, newMaxValueCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getMaxValueCoding() {
		return maxValueCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueCoding(Coding newMaxValueCoding, NotificationChain msgs) {
		Coding oldMaxValueCoding = maxValueCoding;
		maxValueCoding = newMaxValueCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODING, oldMaxValueCoding, newMaxValueCoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueCoding(Coding newMaxValueCoding) {
		if (newMaxValueCoding != maxValueCoding) {
			NotificationChain msgs = null;
			if (maxValueCoding != null)
				msgs = ((InternalEObject)maxValueCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODING, null, msgs);
			if (newMaxValueCoding != null)
				msgs = ((InternalEObject)newMaxValueCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODING, null, msgs);
			msgs = basicSetMaxValueCoding(newMaxValueCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODING, newMaxValueCoding, newMaxValueCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getMaxValueQuantity() {
		return maxValueQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueQuantity(Quantity newMaxValueQuantity, NotificationChain msgs) {
		Quantity oldMaxValueQuantity = maxValueQuantity;
		maxValueQuantity = newMaxValueQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_QUANTITY, oldMaxValueQuantity, newMaxValueQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueQuantity(Quantity newMaxValueQuantity) {
		if (newMaxValueQuantity != maxValueQuantity) {
			NotificationChain msgs = null;
			if (maxValueQuantity != null)
				msgs = ((InternalEObject)maxValueQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_QUANTITY, null, msgs);
			if (newMaxValueQuantity != null)
				msgs = ((InternalEObject)newMaxValueQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_QUANTITY, null, msgs);
			msgs = basicSetMaxValueQuantity(newMaxValueQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_QUANTITY, newMaxValueQuantity, newMaxValueQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getMaxValueRange() {
		return maxValueRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueRange(Range newMaxValueRange, NotificationChain msgs) {
		Range oldMaxValueRange = maxValueRange;
		maxValueRange = newMaxValueRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_RANGE, oldMaxValueRange, newMaxValueRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueRange(Range newMaxValueRange) {
		if (newMaxValueRange != maxValueRange) {
			NotificationChain msgs = null;
			if (maxValueRange != null)
				msgs = ((InternalEObject)maxValueRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_RANGE, null, msgs);
			if (newMaxValueRange != null)
				msgs = ((InternalEObject)newMaxValueRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_RANGE, null, msgs);
			msgs = basicSetMaxValueRange(newMaxValueRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_RANGE, newMaxValueRange, newMaxValueRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getMaxValuePeriod() {
		return maxValuePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValuePeriod(Period newMaxValuePeriod, NotificationChain msgs) {
		Period oldMaxValuePeriod = maxValuePeriod;
		maxValuePeriod = newMaxValuePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_PERIOD, oldMaxValuePeriod, newMaxValuePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValuePeriod(Period newMaxValuePeriod) {
		if (newMaxValuePeriod != maxValuePeriod) {
			NotificationChain msgs = null;
			if (maxValuePeriod != null)
				msgs = ((InternalEObject)maxValuePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_PERIOD, null, msgs);
			if (newMaxValuePeriod != null)
				msgs = ((InternalEObject)newMaxValuePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_PERIOD, null, msgs);
			msgs = basicSetMaxValuePeriod(newMaxValuePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_PERIOD, newMaxValuePeriod, newMaxValuePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getMaxValueRatio() {
		return maxValueRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueRatio(Ratio newMaxValueRatio, NotificationChain msgs) {
		Ratio oldMaxValueRatio = maxValueRatio;
		maxValueRatio = newMaxValueRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_RATIO, oldMaxValueRatio, newMaxValueRatio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueRatio(Ratio newMaxValueRatio) {
		if (newMaxValueRatio != maxValueRatio) {
			NotificationChain msgs = null;
			if (maxValueRatio != null)
				msgs = ((InternalEObject)maxValueRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_RATIO, null, msgs);
			if (newMaxValueRatio != null)
				msgs = ((InternalEObject)newMaxValueRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_RATIO, null, msgs);
			msgs = basicSetMaxValueRatio(newMaxValueRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_RATIO, newMaxValueRatio, newMaxValueRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getMaxValueReference() {
		return maxValueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueReference(Reference newMaxValueReference, NotificationChain msgs) {
		Reference oldMaxValueReference = maxValueReference;
		maxValueReference = newMaxValueReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_REFERENCE, oldMaxValueReference, newMaxValueReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueReference(Reference newMaxValueReference) {
		if (newMaxValueReference != maxValueReference) {
			NotificationChain msgs = null;
			if (maxValueReference != null)
				msgs = ((InternalEObject)maxValueReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_REFERENCE, null, msgs);
			if (newMaxValueReference != null)
				msgs = ((InternalEObject)newMaxValueReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_REFERENCE, null, msgs);
			msgs = basicSetMaxValueReference(newMaxValueReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_REFERENCE, newMaxValueReference, newMaxValueReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledData getMaxValueSampledData() {
		return maxValueSampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueSampledData(SampledData newMaxValueSampledData, NotificationChain msgs) {
		SampledData oldMaxValueSampledData = maxValueSampledData;
		maxValueSampledData = newMaxValueSampledData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_SAMPLED_DATA, oldMaxValueSampledData, newMaxValueSampledData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueSampledData(SampledData newMaxValueSampledData) {
		if (newMaxValueSampledData != maxValueSampledData) {
			NotificationChain msgs = null;
			if (maxValueSampledData != null)
				msgs = ((InternalEObject)maxValueSampledData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_SAMPLED_DATA, null, msgs);
			if (newMaxValueSampledData != null)
				msgs = ((InternalEObject)newMaxValueSampledData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_SAMPLED_DATA, null, msgs);
			msgs = basicSetMaxValueSampledData(newMaxValueSampledData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_SAMPLED_DATA, newMaxValueSampledData, newMaxValueSampledData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getMaxValueSignature() {
		return maxValueSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueSignature(Signature newMaxValueSignature, NotificationChain msgs) {
		Signature oldMaxValueSignature = maxValueSignature;
		maxValueSignature = newMaxValueSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_SIGNATURE, oldMaxValueSignature, newMaxValueSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueSignature(Signature newMaxValueSignature) {
		if (newMaxValueSignature != maxValueSignature) {
			NotificationChain msgs = null;
			if (maxValueSignature != null)
				msgs = ((InternalEObject)maxValueSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_SIGNATURE, null, msgs);
			if (newMaxValueSignature != null)
				msgs = ((InternalEObject)newMaxValueSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_SIGNATURE, null, msgs);
			msgs = basicSetMaxValueSignature(newMaxValueSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_SIGNATURE, newMaxValueSignature, newMaxValueSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanName getMaxValueHumanName() {
		return maxValueHumanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueHumanName(HumanName newMaxValueHumanName, NotificationChain msgs) {
		HumanName oldMaxValueHumanName = maxValueHumanName;
		maxValueHumanName = newMaxValueHumanName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_HUMAN_NAME, oldMaxValueHumanName, newMaxValueHumanName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueHumanName(HumanName newMaxValueHumanName) {
		if (newMaxValueHumanName != maxValueHumanName) {
			NotificationChain msgs = null;
			if (maxValueHumanName != null)
				msgs = ((InternalEObject)maxValueHumanName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_HUMAN_NAME, null, msgs);
			if (newMaxValueHumanName != null)
				msgs = ((InternalEObject)newMaxValueHumanName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_HUMAN_NAME, null, msgs);
			msgs = basicSetMaxValueHumanName(newMaxValueHumanName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_HUMAN_NAME, newMaxValueHumanName, newMaxValueHumanName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getMaxValueAddress() {
		return maxValueAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueAddress(Address newMaxValueAddress, NotificationChain msgs) {
		Address oldMaxValueAddress = maxValueAddress;
		maxValueAddress = newMaxValueAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ADDRESS, oldMaxValueAddress, newMaxValueAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueAddress(Address newMaxValueAddress) {
		if (newMaxValueAddress != maxValueAddress) {
			NotificationChain msgs = null;
			if (maxValueAddress != null)
				msgs = ((InternalEObject)maxValueAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ADDRESS, null, msgs);
			if (newMaxValueAddress != null)
				msgs = ((InternalEObject)newMaxValueAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ADDRESS, null, msgs);
			msgs = basicSetMaxValueAddress(newMaxValueAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ADDRESS, newMaxValueAddress, newMaxValueAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPoint getMaxValueContactPoint() {
		return maxValueContactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueContactPoint(ContactPoint newMaxValueContactPoint, NotificationChain msgs) {
		ContactPoint oldMaxValueContactPoint = maxValueContactPoint;
		maxValueContactPoint = newMaxValueContactPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CONTACT_POINT, oldMaxValueContactPoint, newMaxValueContactPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueContactPoint(ContactPoint newMaxValueContactPoint) {
		if (newMaxValueContactPoint != maxValueContactPoint) {
			NotificationChain msgs = null;
			if (maxValueContactPoint != null)
				msgs = ((InternalEObject)maxValueContactPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CONTACT_POINT, null, msgs);
			if (newMaxValueContactPoint != null)
				msgs = ((InternalEObject)newMaxValueContactPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CONTACT_POINT, null, msgs);
			msgs = basicSetMaxValueContactPoint(newMaxValueContactPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CONTACT_POINT, newMaxValueContactPoint, newMaxValueContactPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getMaxValueTiming() {
		return maxValueTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueTiming(Timing newMaxValueTiming, NotificationChain msgs) {
		Timing oldMaxValueTiming = maxValueTiming;
		maxValueTiming = newMaxValueTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIMING, oldMaxValueTiming, newMaxValueTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueTiming(Timing newMaxValueTiming) {
		if (newMaxValueTiming != maxValueTiming) {
			NotificationChain msgs = null;
			if (maxValueTiming != null)
				msgs = ((InternalEObject)maxValueTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIMING, null, msgs);
			if (newMaxValueTiming != null)
				msgs = ((InternalEObject)newMaxValueTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIMING, null, msgs);
			msgs = basicSetMaxValueTiming(newMaxValueTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIMING, newMaxValueTiming, newMaxValueTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta getMaxValueMeta() {
		return maxValueMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxValueMeta(Meta newMaxValueMeta, NotificationChain msgs) {
		Meta oldMaxValueMeta = maxValueMeta;
		maxValueMeta = newMaxValueMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_META, oldMaxValueMeta, newMaxValueMeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValueMeta(Meta newMaxValueMeta) {
		if (newMaxValueMeta != maxValueMeta) {
			NotificationChain msgs = null;
			if (maxValueMeta != null)
				msgs = ((InternalEObject)maxValueMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_META, null, msgs);
			if (newMaxValueMeta != null)
				msgs = ((InternalEObject)newMaxValueMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_META, null, msgs);
			msgs = basicSetMaxValueMeta(newMaxValueMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_META, newMaxValueMeta, newMaxValueMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxLength(org.hl7.fhir.Integer newMaxLength, NotificationChain msgs) {
		org.hl7.fhir.Integer oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_LENGTH, oldMaxLength, newMaxLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(org.hl7.fhir.Integer newMaxLength) {
		if (newMaxLength != maxLength) {
			NotificationChain msgs = null;
			if (maxLength != null)
				msgs = ((InternalEObject)maxLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_LENGTH, null, msgs);
			if (newMaxLength != null)
				msgs = ((InternalEObject)newMaxLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MAX_LENGTH, null, msgs);
			msgs = basicSetMaxLength(newMaxLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MAX_LENGTH, newMaxLength, newMaxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Id> getCondition() {
		if (condition == null) {
			condition = new EObjectContainmentEList<Id>(Id.class, this, FhirPackage.ELEMENT_DEFINITION__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementDefinitionConstraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<ElementDefinitionConstraint>(ElementDefinitionConstraint.class, this, FhirPackage.ELEMENT_DEFINITION__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getMustSupport() {
		return mustSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMustSupport(org.hl7.fhir.Boolean newMustSupport, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldMustSupport = mustSupport;
		mustSupport = newMustSupport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MUST_SUPPORT, oldMustSupport, newMustSupport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustSupport(org.hl7.fhir.Boolean newMustSupport) {
		if (newMustSupport != mustSupport) {
			NotificationChain msgs = null;
			if (mustSupport != null)
				msgs = ((InternalEObject)mustSupport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MUST_SUPPORT, null, msgs);
			if (newMustSupport != null)
				msgs = ((InternalEObject)newMustSupport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__MUST_SUPPORT, null, msgs);
			msgs = basicSetMustSupport(newMustSupport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__MUST_SUPPORT, newMustSupport, newMustSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getIsModifier() {
		return isModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsModifier(org.hl7.fhir.Boolean newIsModifier, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsModifier = isModifier;
		isModifier = newIsModifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER, oldIsModifier, newIsModifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsModifier(org.hl7.fhir.Boolean newIsModifier) {
		if (newIsModifier != isModifier) {
			NotificationChain msgs = null;
			if (isModifier != null)
				msgs = ((InternalEObject)isModifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER, null, msgs);
			if (newIsModifier != null)
				msgs = ((InternalEObject)newIsModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER, null, msgs);
			msgs = basicSetIsModifier(newIsModifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER, newIsModifier, newIsModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getIsSummary() {
		return isSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSummary(org.hl7.fhir.Boolean newIsSummary, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsSummary = isSummary;
		isSummary = newIsSummary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__IS_SUMMARY, oldIsSummary, newIsSummary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSummary(org.hl7.fhir.Boolean newIsSummary) {
		if (newIsSummary != isSummary) {
			NotificationChain msgs = null;
			if (isSummary != null)
				msgs = ((InternalEObject)isSummary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__IS_SUMMARY, null, msgs);
			if (newIsSummary != null)
				msgs = ((InternalEObject)newIsSummary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__IS_SUMMARY, null, msgs);
			msgs = basicSetIsSummary(newIsSummary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__IS_SUMMARY, newIsSummary, newIsSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionBinding getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding(ElementDefinitionBinding newBinding, NotificationChain msgs) {
		ElementDefinitionBinding oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__BINDING, oldBinding, newBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(ElementDefinitionBinding newBinding) {
		if (newBinding != binding) {
			NotificationChain msgs = null;
			if (binding != null)
				msgs = ((InternalEObject)binding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__BINDING, null, msgs);
			if (newBinding != null)
				msgs = ((InternalEObject)newBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION__BINDING, null, msgs);
			msgs = basicSetBinding(newBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION__BINDING, newBinding, newBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementDefinitionMapping> getMapping() {
		if (mapping == null) {
			mapping = new EObjectContainmentEList<ElementDefinitionMapping>(ElementDefinitionMapping.class, this, FhirPackage.ELEMENT_DEFINITION__MAPPING);
		}
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ELEMENT_DEFINITION__PATH:
				return basicSetPath(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__REPRESENTATION:
				return ((InternalEList<?>)getRepresentation()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELEMENT_DEFINITION__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__LABEL:
				return basicSetLabel(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELEMENT_DEFINITION__SLICING:
				return basicSetSlicing(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__SHORT:
				return basicSetShort(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFINITION:
				return basicSetDefinition(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__COMMENTS:
				return basicSetComments(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__ALIAS:
				return ((InternalEList<?>)getAlias()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN:
				return basicSetMin(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX:
				return basicSetMax(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELEMENT_DEFINITION__NAME_REFERENCE:
				return basicSetNameReference(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BOOLEAN:
				return basicSetDefaultValueBoolean(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INTEGER:
				return basicSetDefaultValueInteger(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DECIMAL:
				return basicSetDefaultValueDecimal(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BASE64_BINARY:
				return basicSetDefaultValueBase64Binary(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INSTANT:
				return basicSetDefaultValueInstant(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_STRING:
				return basicSetDefaultValueString(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URI:
				return basicSetDefaultValueUri(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE:
				return basicSetDefaultValueDate(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE_TIME:
				return basicSetDefaultValueDateTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIME:
				return basicSetDefaultValueTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODE:
				return basicSetDefaultValueCode(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_OID:
				return basicSetDefaultValueOid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UUID:
				return basicSetDefaultValueUuid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ID:
				return basicSetDefaultValueId(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UNSIGNED_INT:
				return basicSetDefaultValueUnsignedInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_POSITIVE_INT:
				return basicSetDefaultValuePositiveInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ANNOTATION:
				return basicSetDefaultValueAnnotation(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ATTACHMENT:
				return basicSetDefaultValueAttachment(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_IDENTIFIER:
				return basicSetDefaultValueIdentifier(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODEABLE_CONCEPT:
				return basicSetDefaultValueCodeableConcept(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODING:
				return basicSetDefaultValueCoding(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_QUANTITY:
				return basicSetDefaultValueQuantity(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RANGE:
				return basicSetDefaultValueRange(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PERIOD:
				return basicSetDefaultValuePeriod(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RATIO:
				return basicSetDefaultValueRatio(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_REFERENCE:
				return basicSetDefaultValueReference(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SAMPLED_DATA:
				return basicSetDefaultValueSampledData(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SIGNATURE:
				return basicSetDefaultValueSignature(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_HUMAN_NAME:
				return basicSetDefaultValueHumanName(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ADDRESS:
				return basicSetDefaultValueAddress(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_POINT:
				return basicSetDefaultValueContactPoint(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIMING:
				return basicSetDefaultValueTiming(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_META:
				return basicSetDefaultValueMeta(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				return basicSetMeaningWhenMissing(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BOOLEAN:
				return basicSetFixedBoolean(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INTEGER:
				return basicSetFixedInteger(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DECIMAL:
				return basicSetFixedDecimal(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BASE64_BINARY:
				return basicSetFixedBase64Binary(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INSTANT:
				return basicSetFixedInstant(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_STRING:
				return basicSetFixedString(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_URI:
				return basicSetFixedUri(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE:
				return basicSetFixedDate(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE_TIME:
				return basicSetFixedDateTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIME:
				return basicSetFixedTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODE:
				return basicSetFixedCode(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_OID:
				return basicSetFixedOid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UUID:
				return basicSetFixedUuid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ID:
				return basicSetFixedId(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UNSIGNED_INT:
				return basicSetFixedUnsignedInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_POSITIVE_INT:
				return basicSetFixedPositiveInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ANNOTATION:
				return basicSetFixedAnnotation(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ATTACHMENT:
				return basicSetFixedAttachment(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_IDENTIFIER:
				return basicSetFixedIdentifier(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODEABLE_CONCEPT:
				return basicSetFixedCodeableConcept(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODING:
				return basicSetFixedCoding(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_QUANTITY:
				return basicSetFixedQuantity(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RANGE:
				return basicSetFixedRange(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_PERIOD:
				return basicSetFixedPeriod(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RATIO:
				return basicSetFixedRatio(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_REFERENCE:
				return basicSetFixedReference(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SAMPLED_DATA:
				return basicSetFixedSampledData(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SIGNATURE:
				return basicSetFixedSignature(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_HUMAN_NAME:
				return basicSetFixedHumanName(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ADDRESS:
				return basicSetFixedAddress(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_POINT:
				return basicSetFixedContactPoint(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIMING:
				return basicSetFixedTiming(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__FIXED_META:
				return basicSetFixedMeta(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BOOLEAN:
				return basicSetPatternBoolean(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INTEGER:
				return basicSetPatternInteger(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DECIMAL:
				return basicSetPatternDecimal(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BASE64_BINARY:
				return basicSetPatternBase64Binary(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INSTANT:
				return basicSetPatternInstant(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_STRING:
				return basicSetPatternString(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_URI:
				return basicSetPatternUri(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE:
				return basicSetPatternDate(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE_TIME:
				return basicSetPatternDateTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIME:
				return basicSetPatternTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODE:
				return basicSetPatternCode(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_OID:
				return basicSetPatternOid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UUID:
				return basicSetPatternUuid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ID:
				return basicSetPatternId(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UNSIGNED_INT:
				return basicSetPatternUnsignedInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_POSITIVE_INT:
				return basicSetPatternPositiveInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ANNOTATION:
				return basicSetPatternAnnotation(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ATTACHMENT:
				return basicSetPatternAttachment(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_IDENTIFIER:
				return basicSetPatternIdentifier(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODEABLE_CONCEPT:
				return basicSetPatternCodeableConcept(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODING:
				return basicSetPatternCoding(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_QUANTITY:
				return basicSetPatternQuantity(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RANGE:
				return basicSetPatternRange(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_PERIOD:
				return basicSetPatternPeriod(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RATIO:
				return basicSetPatternRatio(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_REFERENCE:
				return basicSetPatternReference(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SAMPLED_DATA:
				return basicSetPatternSampledData(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SIGNATURE:
				return basicSetPatternSignature(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_HUMAN_NAME:
				return basicSetPatternHumanName(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ADDRESS:
				return basicSetPatternAddress(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_POINT:
				return basicSetPatternContactPoint(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIMING:
				return basicSetPatternTiming(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_META:
				return basicSetPatternMeta(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_BOOLEAN:
				return basicSetExampleBoolean(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_INTEGER:
				return basicSetExampleInteger(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DECIMAL:
				return basicSetExampleDecimal(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_BASE64_BINARY:
				return basicSetExampleBase64Binary(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_INSTANT:
				return basicSetExampleInstant(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_STRING:
				return basicSetExampleString(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_URI:
				return basicSetExampleUri(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DATE:
				return basicSetExampleDate(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DATE_TIME:
				return basicSetExampleDateTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_TIME:
				return basicSetExampleTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODE:
				return basicSetExampleCode(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_OID:
				return basicSetExampleOid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_UUID:
				return basicSetExampleUuid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ID:
				return basicSetExampleId(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_UNSIGNED_INT:
				return basicSetExampleUnsignedInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_POSITIVE_INT:
				return basicSetExamplePositiveInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ANNOTATION:
				return basicSetExampleAnnotation(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ATTACHMENT:
				return basicSetExampleAttachment(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_IDENTIFIER:
				return basicSetExampleIdentifier(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODEABLE_CONCEPT:
				return basicSetExampleCodeableConcept(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODING:
				return basicSetExampleCoding(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_QUANTITY:
				return basicSetExampleQuantity(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_RANGE:
				return basicSetExampleRange(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_PERIOD:
				return basicSetExamplePeriod(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_RATIO:
				return basicSetExampleRatio(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_REFERENCE:
				return basicSetExampleReference(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_SAMPLED_DATA:
				return basicSetExampleSampledData(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_SIGNATURE:
				return basicSetExampleSignature(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_HUMAN_NAME:
				return basicSetExampleHumanName(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ADDRESS:
				return basicSetExampleAddress(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CONTACT_POINT:
				return basicSetExampleContactPoint(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_TIMING:
				return basicSetExampleTiming(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_META:
				return basicSetExampleMeta(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_BOOLEAN:
				return basicSetMinValueBoolean(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INTEGER:
				return basicSetMinValueInteger(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DECIMAL:
				return basicSetMinValueDecimal(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_BASE64_BINARY:
				return basicSetMinValueBase64Binary(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INSTANT:
				return basicSetMinValueInstant(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_STRING:
				return basicSetMinValueString(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_URI:
				return basicSetMinValueUri(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE:
				return basicSetMinValueDate(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE_TIME:
				return basicSetMinValueDateTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIME:
				return basicSetMinValueTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODE:
				return basicSetMinValueCode(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_OID:
				return basicSetMinValueOid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UUID:
				return basicSetMinValueUuid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ID:
				return basicSetMinValueId(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UNSIGNED_INT:
				return basicSetMinValueUnsignedInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_POSITIVE_INT:
				return basicSetMinValuePositiveInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ANNOTATION:
				return basicSetMinValueAnnotation(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ATTACHMENT:
				return basicSetMinValueAttachment(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_IDENTIFIER:
				return basicSetMinValueIdentifier(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODEABLE_CONCEPT:
				return basicSetMinValueCodeableConcept(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODING:
				return basicSetMinValueCoding(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_QUANTITY:
				return basicSetMinValueQuantity(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_RANGE:
				return basicSetMinValueRange(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_PERIOD:
				return basicSetMinValuePeriod(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_RATIO:
				return basicSetMinValueRatio(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_REFERENCE:
				return basicSetMinValueReference(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_SAMPLED_DATA:
				return basicSetMinValueSampledData(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_SIGNATURE:
				return basicSetMinValueSignature(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_HUMAN_NAME:
				return basicSetMinValueHumanName(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ADDRESS:
				return basicSetMinValueAddress(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CONTACT_POINT:
				return basicSetMinValueContactPoint(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIMING:
				return basicSetMinValueTiming(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_META:
				return basicSetMinValueMeta(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_BOOLEAN:
				return basicSetMaxValueBoolean(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INTEGER:
				return basicSetMaxValueInteger(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DECIMAL:
				return basicSetMaxValueDecimal(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_BASE64_BINARY:
				return basicSetMaxValueBase64Binary(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INSTANT:
				return basicSetMaxValueInstant(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_STRING:
				return basicSetMaxValueString(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_URI:
				return basicSetMaxValueUri(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE:
				return basicSetMaxValueDate(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE_TIME:
				return basicSetMaxValueDateTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIME:
				return basicSetMaxValueTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODE:
				return basicSetMaxValueCode(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_OID:
				return basicSetMaxValueOid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UUID:
				return basicSetMaxValueUuid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ID:
				return basicSetMaxValueId(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UNSIGNED_INT:
				return basicSetMaxValueUnsignedInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_POSITIVE_INT:
				return basicSetMaxValuePositiveInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ANNOTATION:
				return basicSetMaxValueAnnotation(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ATTACHMENT:
				return basicSetMaxValueAttachment(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_IDENTIFIER:
				return basicSetMaxValueIdentifier(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODEABLE_CONCEPT:
				return basicSetMaxValueCodeableConcept(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODING:
				return basicSetMaxValueCoding(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_QUANTITY:
				return basicSetMaxValueQuantity(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_RANGE:
				return basicSetMaxValueRange(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_PERIOD:
				return basicSetMaxValuePeriod(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_RATIO:
				return basicSetMaxValueRatio(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_REFERENCE:
				return basicSetMaxValueReference(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_SAMPLED_DATA:
				return basicSetMaxValueSampledData(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_SIGNATURE:
				return basicSetMaxValueSignature(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_HUMAN_NAME:
				return basicSetMaxValueHumanName(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ADDRESS:
				return basicSetMaxValueAddress(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CONTACT_POINT:
				return basicSetMaxValueContactPoint(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIMING:
				return basicSetMaxValueTiming(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_META:
				return basicSetMaxValueMeta(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAX_LENGTH:
				return basicSetMaxLength(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELEMENT_DEFINITION__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				return basicSetMustSupport(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				return basicSetIsModifier(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				return basicSetIsSummary(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__BINDING:
				return basicSetBinding(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION__MAPPING:
				return ((InternalEList<?>)getMapping()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.ELEMENT_DEFINITION__PATH:
				return getPath();
			case FhirPackage.ELEMENT_DEFINITION__REPRESENTATION:
				return getRepresentation();
			case FhirPackage.ELEMENT_DEFINITION__NAME:
				return getName();
			case FhirPackage.ELEMENT_DEFINITION__LABEL:
				return getLabel();
			case FhirPackage.ELEMENT_DEFINITION__CODE:
				return getCode();
			case FhirPackage.ELEMENT_DEFINITION__SLICING:
				return getSlicing();
			case FhirPackage.ELEMENT_DEFINITION__SHORT:
				return getShort();
			case FhirPackage.ELEMENT_DEFINITION__DEFINITION:
				return getDefinition();
			case FhirPackage.ELEMENT_DEFINITION__COMMENTS:
				return getComments();
			case FhirPackage.ELEMENT_DEFINITION__REQUIREMENTS:
				return getRequirements();
			case FhirPackage.ELEMENT_DEFINITION__ALIAS:
				return getAlias();
			case FhirPackage.ELEMENT_DEFINITION__MIN:
				return getMin();
			case FhirPackage.ELEMENT_DEFINITION__MAX:
				return getMax();
			case FhirPackage.ELEMENT_DEFINITION__TYPE:
				return getType();
			case FhirPackage.ELEMENT_DEFINITION__NAME_REFERENCE:
				return getNameReference();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BOOLEAN:
				return getDefaultValueBoolean();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INTEGER:
				return getDefaultValueInteger();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DECIMAL:
				return getDefaultValueDecimal();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BASE64_BINARY:
				return getDefaultValueBase64Binary();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INSTANT:
				return getDefaultValueInstant();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_STRING:
				return getDefaultValueString();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URI:
				return getDefaultValueUri();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE:
				return getDefaultValueDate();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE_TIME:
				return getDefaultValueDateTime();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIME:
				return getDefaultValueTime();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODE:
				return getDefaultValueCode();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_OID:
				return getDefaultValueOid();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UUID:
				return getDefaultValueUuid();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ID:
				return getDefaultValueId();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UNSIGNED_INT:
				return getDefaultValueUnsignedInt();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_POSITIVE_INT:
				return getDefaultValuePositiveInt();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ANNOTATION:
				return getDefaultValueAnnotation();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ATTACHMENT:
				return getDefaultValueAttachment();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_IDENTIFIER:
				return getDefaultValueIdentifier();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODEABLE_CONCEPT:
				return getDefaultValueCodeableConcept();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODING:
				return getDefaultValueCoding();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_QUANTITY:
				return getDefaultValueQuantity();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RANGE:
				return getDefaultValueRange();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PERIOD:
				return getDefaultValuePeriod();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RATIO:
				return getDefaultValueRatio();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_REFERENCE:
				return getDefaultValueReference();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SAMPLED_DATA:
				return getDefaultValueSampledData();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SIGNATURE:
				return getDefaultValueSignature();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_HUMAN_NAME:
				return getDefaultValueHumanName();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ADDRESS:
				return getDefaultValueAddress();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_POINT:
				return getDefaultValueContactPoint();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIMING:
				return getDefaultValueTiming();
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_META:
				return getDefaultValueMeta();
			case FhirPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				return getMeaningWhenMissing();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BOOLEAN:
				return getFixedBoolean();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INTEGER:
				return getFixedInteger();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DECIMAL:
				return getFixedDecimal();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BASE64_BINARY:
				return getFixedBase64Binary();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INSTANT:
				return getFixedInstant();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_STRING:
				return getFixedString();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_URI:
				return getFixedUri();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE:
				return getFixedDate();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE_TIME:
				return getFixedDateTime();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIME:
				return getFixedTime();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODE:
				return getFixedCode();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_OID:
				return getFixedOid();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UUID:
				return getFixedUuid();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ID:
				return getFixedId();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UNSIGNED_INT:
				return getFixedUnsignedInt();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_POSITIVE_INT:
				return getFixedPositiveInt();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ANNOTATION:
				return getFixedAnnotation();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ATTACHMENT:
				return getFixedAttachment();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_IDENTIFIER:
				return getFixedIdentifier();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODEABLE_CONCEPT:
				return getFixedCodeableConcept();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODING:
				return getFixedCoding();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_QUANTITY:
				return getFixedQuantity();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RANGE:
				return getFixedRange();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_PERIOD:
				return getFixedPeriod();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RATIO:
				return getFixedRatio();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_REFERENCE:
				return getFixedReference();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SAMPLED_DATA:
				return getFixedSampledData();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SIGNATURE:
				return getFixedSignature();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_HUMAN_NAME:
				return getFixedHumanName();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ADDRESS:
				return getFixedAddress();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_POINT:
				return getFixedContactPoint();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIMING:
				return getFixedTiming();
			case FhirPackage.ELEMENT_DEFINITION__FIXED_META:
				return getFixedMeta();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BOOLEAN:
				return getPatternBoolean();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INTEGER:
				return getPatternInteger();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DECIMAL:
				return getPatternDecimal();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BASE64_BINARY:
				return getPatternBase64Binary();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INSTANT:
				return getPatternInstant();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_STRING:
				return getPatternString();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_URI:
				return getPatternUri();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE:
				return getPatternDate();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE_TIME:
				return getPatternDateTime();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIME:
				return getPatternTime();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODE:
				return getPatternCode();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_OID:
				return getPatternOid();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UUID:
				return getPatternUuid();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ID:
				return getPatternId();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UNSIGNED_INT:
				return getPatternUnsignedInt();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_POSITIVE_INT:
				return getPatternPositiveInt();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ANNOTATION:
				return getPatternAnnotation();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ATTACHMENT:
				return getPatternAttachment();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_IDENTIFIER:
				return getPatternIdentifier();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODEABLE_CONCEPT:
				return getPatternCodeableConcept();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODING:
				return getPatternCoding();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_QUANTITY:
				return getPatternQuantity();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RANGE:
				return getPatternRange();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_PERIOD:
				return getPatternPeriod();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RATIO:
				return getPatternRatio();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_REFERENCE:
				return getPatternReference();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SAMPLED_DATA:
				return getPatternSampledData();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SIGNATURE:
				return getPatternSignature();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_HUMAN_NAME:
				return getPatternHumanName();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ADDRESS:
				return getPatternAddress();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_POINT:
				return getPatternContactPoint();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIMING:
				return getPatternTiming();
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_META:
				return getPatternMeta();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_BOOLEAN:
				return getExampleBoolean();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_INTEGER:
				return getExampleInteger();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DECIMAL:
				return getExampleDecimal();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_BASE64_BINARY:
				return getExampleBase64Binary();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_INSTANT:
				return getExampleInstant();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_STRING:
				return getExampleString();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_URI:
				return getExampleUri();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DATE:
				return getExampleDate();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DATE_TIME:
				return getExampleDateTime();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_TIME:
				return getExampleTime();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODE:
				return getExampleCode();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_OID:
				return getExampleOid();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_UUID:
				return getExampleUuid();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ID:
				return getExampleId();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_UNSIGNED_INT:
				return getExampleUnsignedInt();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_POSITIVE_INT:
				return getExamplePositiveInt();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ANNOTATION:
				return getExampleAnnotation();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ATTACHMENT:
				return getExampleAttachment();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_IDENTIFIER:
				return getExampleIdentifier();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODEABLE_CONCEPT:
				return getExampleCodeableConcept();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODING:
				return getExampleCoding();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_QUANTITY:
				return getExampleQuantity();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_RANGE:
				return getExampleRange();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_PERIOD:
				return getExamplePeriod();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_RATIO:
				return getExampleRatio();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_REFERENCE:
				return getExampleReference();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_SAMPLED_DATA:
				return getExampleSampledData();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_SIGNATURE:
				return getExampleSignature();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_HUMAN_NAME:
				return getExampleHumanName();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ADDRESS:
				return getExampleAddress();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CONTACT_POINT:
				return getExampleContactPoint();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_TIMING:
				return getExampleTiming();
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_META:
				return getExampleMeta();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_BOOLEAN:
				return getMinValueBoolean();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INTEGER:
				return getMinValueInteger();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DECIMAL:
				return getMinValueDecimal();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_BASE64_BINARY:
				return getMinValueBase64Binary();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INSTANT:
				return getMinValueInstant();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_STRING:
				return getMinValueString();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_URI:
				return getMinValueUri();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE:
				return getMinValueDate();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE_TIME:
				return getMinValueDateTime();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIME:
				return getMinValueTime();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODE:
				return getMinValueCode();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_OID:
				return getMinValueOid();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UUID:
				return getMinValueUuid();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ID:
				return getMinValueId();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UNSIGNED_INT:
				return getMinValueUnsignedInt();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_POSITIVE_INT:
				return getMinValuePositiveInt();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ANNOTATION:
				return getMinValueAnnotation();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ATTACHMENT:
				return getMinValueAttachment();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_IDENTIFIER:
				return getMinValueIdentifier();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODEABLE_CONCEPT:
				return getMinValueCodeableConcept();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODING:
				return getMinValueCoding();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_QUANTITY:
				return getMinValueQuantity();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_RANGE:
				return getMinValueRange();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_PERIOD:
				return getMinValuePeriod();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_RATIO:
				return getMinValueRatio();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_REFERENCE:
				return getMinValueReference();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_SAMPLED_DATA:
				return getMinValueSampledData();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_SIGNATURE:
				return getMinValueSignature();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_HUMAN_NAME:
				return getMinValueHumanName();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ADDRESS:
				return getMinValueAddress();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CONTACT_POINT:
				return getMinValueContactPoint();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIMING:
				return getMinValueTiming();
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_META:
				return getMinValueMeta();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_BOOLEAN:
				return getMaxValueBoolean();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INTEGER:
				return getMaxValueInteger();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DECIMAL:
				return getMaxValueDecimal();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_BASE64_BINARY:
				return getMaxValueBase64Binary();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INSTANT:
				return getMaxValueInstant();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_STRING:
				return getMaxValueString();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_URI:
				return getMaxValueUri();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE:
				return getMaxValueDate();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE_TIME:
				return getMaxValueDateTime();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIME:
				return getMaxValueTime();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODE:
				return getMaxValueCode();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_OID:
				return getMaxValueOid();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UUID:
				return getMaxValueUuid();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ID:
				return getMaxValueId();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UNSIGNED_INT:
				return getMaxValueUnsignedInt();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_POSITIVE_INT:
				return getMaxValuePositiveInt();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ANNOTATION:
				return getMaxValueAnnotation();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ATTACHMENT:
				return getMaxValueAttachment();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_IDENTIFIER:
				return getMaxValueIdentifier();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODEABLE_CONCEPT:
				return getMaxValueCodeableConcept();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODING:
				return getMaxValueCoding();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_QUANTITY:
				return getMaxValueQuantity();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_RANGE:
				return getMaxValueRange();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_PERIOD:
				return getMaxValuePeriod();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_RATIO:
				return getMaxValueRatio();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_REFERENCE:
				return getMaxValueReference();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_SAMPLED_DATA:
				return getMaxValueSampledData();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_SIGNATURE:
				return getMaxValueSignature();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_HUMAN_NAME:
				return getMaxValueHumanName();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ADDRESS:
				return getMaxValueAddress();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CONTACT_POINT:
				return getMaxValueContactPoint();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIMING:
				return getMaxValueTiming();
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_META:
				return getMaxValueMeta();
			case FhirPackage.ELEMENT_DEFINITION__MAX_LENGTH:
				return getMaxLength();
			case FhirPackage.ELEMENT_DEFINITION__CONDITION:
				return getCondition();
			case FhirPackage.ELEMENT_DEFINITION__CONSTRAINT:
				return getConstraint();
			case FhirPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				return getMustSupport();
			case FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				return getIsModifier();
			case FhirPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				return getIsSummary();
			case FhirPackage.ELEMENT_DEFINITION__BINDING:
				return getBinding();
			case FhirPackage.ELEMENT_DEFINITION__MAPPING:
				return getMapping();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.ELEMENT_DEFINITION__PATH:
				setPath((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__REPRESENTATION:
				getRepresentation().clear();
				getRepresentation().addAll((Collection<? extends PropertyRepresentation>)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__LABEL:
				setLabel((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__SLICING:
				setSlicing((ElementDefinitionSlicing)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__SHORT:
				setShort((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFINITION:
				setDefinition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__COMMENTS:
				setComments((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__REQUIREMENTS:
				setRequirements((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__ALIAS:
				getAlias().clear();
				getAlias().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN:
				setMin((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX:
				setMax((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends ElementDefinitionType>)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__NAME_REFERENCE:
				setNameReference((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BOOLEAN:
				setDefaultValueBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INTEGER:
				setDefaultValueInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DECIMAL:
				setDefaultValueDecimal((Decimal)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BASE64_BINARY:
				setDefaultValueBase64Binary((Base64Binary)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INSTANT:
				setDefaultValueInstant((Instant)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_STRING:
				setDefaultValueString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URI:
				setDefaultValueUri((Uri)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE:
				setDefaultValueDate((Date)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE_TIME:
				setDefaultValueDateTime((DateTime)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIME:
				setDefaultValueTime((Time)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODE:
				setDefaultValueCode((Code)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_OID:
				setDefaultValueOid((Oid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UUID:
				setDefaultValueUuid((Uuid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ID:
				setDefaultValueId((Id)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UNSIGNED_INT:
				setDefaultValueUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_POSITIVE_INT:
				setDefaultValuePositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ANNOTATION:
				setDefaultValueAnnotation((Annotation)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ATTACHMENT:
				setDefaultValueAttachment((Attachment)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_IDENTIFIER:
				setDefaultValueIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODEABLE_CONCEPT:
				setDefaultValueCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODING:
				setDefaultValueCoding((Coding)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_QUANTITY:
				setDefaultValueQuantity((Quantity)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RANGE:
				setDefaultValueRange((Range)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PERIOD:
				setDefaultValuePeriod((Period)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RATIO:
				setDefaultValueRatio((Ratio)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_REFERENCE:
				setDefaultValueReference((Reference)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SAMPLED_DATA:
				setDefaultValueSampledData((SampledData)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SIGNATURE:
				setDefaultValueSignature((Signature)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_HUMAN_NAME:
				setDefaultValueHumanName((HumanName)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ADDRESS:
				setDefaultValueAddress((Address)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_POINT:
				setDefaultValueContactPoint((ContactPoint)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIMING:
				setDefaultValueTiming((Timing)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_META:
				setDefaultValueMeta((Meta)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				setMeaningWhenMissing((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BOOLEAN:
				setFixedBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INTEGER:
				setFixedInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DECIMAL:
				setFixedDecimal((Decimal)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BASE64_BINARY:
				setFixedBase64Binary((Base64Binary)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INSTANT:
				setFixedInstant((Instant)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_STRING:
				setFixedString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_URI:
				setFixedUri((Uri)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE:
				setFixedDate((Date)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE_TIME:
				setFixedDateTime((DateTime)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIME:
				setFixedTime((Time)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODE:
				setFixedCode((Code)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_OID:
				setFixedOid((Oid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UUID:
				setFixedUuid((Uuid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ID:
				setFixedId((Id)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UNSIGNED_INT:
				setFixedUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_POSITIVE_INT:
				setFixedPositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ANNOTATION:
				setFixedAnnotation((Annotation)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ATTACHMENT:
				setFixedAttachment((Attachment)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_IDENTIFIER:
				setFixedIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODEABLE_CONCEPT:
				setFixedCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODING:
				setFixedCoding((Coding)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_QUANTITY:
				setFixedQuantity((Quantity)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RANGE:
				setFixedRange((Range)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_PERIOD:
				setFixedPeriod((Period)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RATIO:
				setFixedRatio((Ratio)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_REFERENCE:
				setFixedReference((Reference)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SAMPLED_DATA:
				setFixedSampledData((SampledData)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SIGNATURE:
				setFixedSignature((Signature)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_HUMAN_NAME:
				setFixedHumanName((HumanName)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ADDRESS:
				setFixedAddress((Address)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_POINT:
				setFixedContactPoint((ContactPoint)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIMING:
				setFixedTiming((Timing)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_META:
				setFixedMeta((Meta)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BOOLEAN:
				setPatternBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INTEGER:
				setPatternInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DECIMAL:
				setPatternDecimal((Decimal)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BASE64_BINARY:
				setPatternBase64Binary((Base64Binary)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INSTANT:
				setPatternInstant((Instant)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_STRING:
				setPatternString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_URI:
				setPatternUri((Uri)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE:
				setPatternDate((Date)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE_TIME:
				setPatternDateTime((DateTime)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIME:
				setPatternTime((Time)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODE:
				setPatternCode((Code)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_OID:
				setPatternOid((Oid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UUID:
				setPatternUuid((Uuid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ID:
				setPatternId((Id)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UNSIGNED_INT:
				setPatternUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_POSITIVE_INT:
				setPatternPositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ANNOTATION:
				setPatternAnnotation((Annotation)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ATTACHMENT:
				setPatternAttachment((Attachment)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_IDENTIFIER:
				setPatternIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODEABLE_CONCEPT:
				setPatternCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODING:
				setPatternCoding((Coding)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_QUANTITY:
				setPatternQuantity((Quantity)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RANGE:
				setPatternRange((Range)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_PERIOD:
				setPatternPeriod((Period)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RATIO:
				setPatternRatio((Ratio)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_REFERENCE:
				setPatternReference((Reference)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SAMPLED_DATA:
				setPatternSampledData((SampledData)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SIGNATURE:
				setPatternSignature((Signature)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_HUMAN_NAME:
				setPatternHumanName((HumanName)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ADDRESS:
				setPatternAddress((Address)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_POINT:
				setPatternContactPoint((ContactPoint)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIMING:
				setPatternTiming((Timing)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_META:
				setPatternMeta((Meta)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_BOOLEAN:
				setExampleBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_INTEGER:
				setExampleInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DECIMAL:
				setExampleDecimal((Decimal)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_BASE64_BINARY:
				setExampleBase64Binary((Base64Binary)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_INSTANT:
				setExampleInstant((Instant)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_STRING:
				setExampleString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_URI:
				setExampleUri((Uri)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DATE:
				setExampleDate((Date)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DATE_TIME:
				setExampleDateTime((DateTime)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_TIME:
				setExampleTime((Time)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODE:
				setExampleCode((Code)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_OID:
				setExampleOid((Oid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_UUID:
				setExampleUuid((Uuid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ID:
				setExampleId((Id)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_UNSIGNED_INT:
				setExampleUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_POSITIVE_INT:
				setExamplePositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ANNOTATION:
				setExampleAnnotation((Annotation)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ATTACHMENT:
				setExampleAttachment((Attachment)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_IDENTIFIER:
				setExampleIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODEABLE_CONCEPT:
				setExampleCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODING:
				setExampleCoding((Coding)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_QUANTITY:
				setExampleQuantity((Quantity)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_RANGE:
				setExampleRange((Range)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_PERIOD:
				setExamplePeriod((Period)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_RATIO:
				setExampleRatio((Ratio)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_REFERENCE:
				setExampleReference((Reference)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_SAMPLED_DATA:
				setExampleSampledData((SampledData)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_SIGNATURE:
				setExampleSignature((Signature)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_HUMAN_NAME:
				setExampleHumanName((HumanName)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ADDRESS:
				setExampleAddress((Address)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CONTACT_POINT:
				setExampleContactPoint((ContactPoint)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_TIMING:
				setExampleTiming((Timing)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_META:
				setExampleMeta((Meta)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_BOOLEAN:
				setMinValueBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INTEGER:
				setMinValueInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DECIMAL:
				setMinValueDecimal((Decimal)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_BASE64_BINARY:
				setMinValueBase64Binary((Base64Binary)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INSTANT:
				setMinValueInstant((Instant)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_STRING:
				setMinValueString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_URI:
				setMinValueUri((Uri)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE:
				setMinValueDate((Date)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE_TIME:
				setMinValueDateTime((DateTime)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIME:
				setMinValueTime((Time)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODE:
				setMinValueCode((Code)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_OID:
				setMinValueOid((Oid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UUID:
				setMinValueUuid((Uuid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ID:
				setMinValueId((Id)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UNSIGNED_INT:
				setMinValueUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_POSITIVE_INT:
				setMinValuePositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ANNOTATION:
				setMinValueAnnotation((Annotation)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ATTACHMENT:
				setMinValueAttachment((Attachment)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_IDENTIFIER:
				setMinValueIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODEABLE_CONCEPT:
				setMinValueCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODING:
				setMinValueCoding((Coding)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_QUANTITY:
				setMinValueQuantity((Quantity)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_RANGE:
				setMinValueRange((Range)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_PERIOD:
				setMinValuePeriod((Period)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_RATIO:
				setMinValueRatio((Ratio)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_REFERENCE:
				setMinValueReference((Reference)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_SAMPLED_DATA:
				setMinValueSampledData((SampledData)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_SIGNATURE:
				setMinValueSignature((Signature)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_HUMAN_NAME:
				setMinValueHumanName((HumanName)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ADDRESS:
				setMinValueAddress((Address)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CONTACT_POINT:
				setMinValueContactPoint((ContactPoint)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIMING:
				setMinValueTiming((Timing)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_META:
				setMinValueMeta((Meta)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_BOOLEAN:
				setMaxValueBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INTEGER:
				setMaxValueInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DECIMAL:
				setMaxValueDecimal((Decimal)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_BASE64_BINARY:
				setMaxValueBase64Binary((Base64Binary)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INSTANT:
				setMaxValueInstant((Instant)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_STRING:
				setMaxValueString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_URI:
				setMaxValueUri((Uri)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE:
				setMaxValueDate((Date)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE_TIME:
				setMaxValueDateTime((DateTime)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIME:
				setMaxValueTime((Time)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODE:
				setMaxValueCode((Code)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_OID:
				setMaxValueOid((Oid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UUID:
				setMaxValueUuid((Uuid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ID:
				setMaxValueId((Id)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UNSIGNED_INT:
				setMaxValueUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_POSITIVE_INT:
				setMaxValuePositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ANNOTATION:
				setMaxValueAnnotation((Annotation)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ATTACHMENT:
				setMaxValueAttachment((Attachment)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_IDENTIFIER:
				setMaxValueIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODEABLE_CONCEPT:
				setMaxValueCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODING:
				setMaxValueCoding((Coding)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_QUANTITY:
				setMaxValueQuantity((Quantity)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_RANGE:
				setMaxValueRange((Range)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_PERIOD:
				setMaxValuePeriod((Period)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_RATIO:
				setMaxValueRatio((Ratio)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_REFERENCE:
				setMaxValueReference((Reference)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_SAMPLED_DATA:
				setMaxValueSampledData((SampledData)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_SIGNATURE:
				setMaxValueSignature((Signature)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_HUMAN_NAME:
				setMaxValueHumanName((HumanName)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ADDRESS:
				setMaxValueAddress((Address)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CONTACT_POINT:
				setMaxValueContactPoint((ContactPoint)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIMING:
				setMaxValueTiming((Timing)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_META:
				setMaxValueMeta((Meta)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_LENGTH:
				setMaxLength((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends Id>)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends ElementDefinitionConstraint>)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				setMustSupport((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				setIsModifier((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				setIsSummary((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__BINDING:
				setBinding((ElementDefinitionBinding)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAPPING:
				getMapping().clear();
				getMapping().addAll((Collection<? extends ElementDefinitionMapping>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.ELEMENT_DEFINITION__PATH:
				setPath((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__REPRESENTATION:
				getRepresentation().clear();
				return;
			case FhirPackage.ELEMENT_DEFINITION__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__LABEL:
				setLabel((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__CODE:
				getCode().clear();
				return;
			case FhirPackage.ELEMENT_DEFINITION__SLICING:
				setSlicing((ElementDefinitionSlicing)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__SHORT:
				setShort((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFINITION:
				setDefinition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__COMMENTS:
				setComments((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__REQUIREMENTS:
				setRequirements((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__ALIAS:
				getAlias().clear();
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN:
				setMin((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX:
				setMax((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__TYPE:
				getType().clear();
				return;
			case FhirPackage.ELEMENT_DEFINITION__NAME_REFERENCE:
				setNameReference((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BOOLEAN:
				setDefaultValueBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INTEGER:
				setDefaultValueInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DECIMAL:
				setDefaultValueDecimal((Decimal)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BASE64_BINARY:
				setDefaultValueBase64Binary((Base64Binary)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INSTANT:
				setDefaultValueInstant((Instant)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_STRING:
				setDefaultValueString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URI:
				setDefaultValueUri((Uri)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE:
				setDefaultValueDate((Date)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE_TIME:
				setDefaultValueDateTime((DateTime)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIME:
				setDefaultValueTime((Time)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODE:
				setDefaultValueCode((Code)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_OID:
				setDefaultValueOid((Oid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UUID:
				setDefaultValueUuid((Uuid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ID:
				setDefaultValueId((Id)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UNSIGNED_INT:
				setDefaultValueUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_POSITIVE_INT:
				setDefaultValuePositiveInt((PositiveInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ANNOTATION:
				setDefaultValueAnnotation((Annotation)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ATTACHMENT:
				setDefaultValueAttachment((Attachment)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_IDENTIFIER:
				setDefaultValueIdentifier((Identifier)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODEABLE_CONCEPT:
				setDefaultValueCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODING:
				setDefaultValueCoding((Coding)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_QUANTITY:
				setDefaultValueQuantity((Quantity)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RANGE:
				setDefaultValueRange((Range)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PERIOD:
				setDefaultValuePeriod((Period)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RATIO:
				setDefaultValueRatio((Ratio)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_REFERENCE:
				setDefaultValueReference((Reference)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SAMPLED_DATA:
				setDefaultValueSampledData((SampledData)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SIGNATURE:
				setDefaultValueSignature((Signature)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_HUMAN_NAME:
				setDefaultValueHumanName((HumanName)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ADDRESS:
				setDefaultValueAddress((Address)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_POINT:
				setDefaultValueContactPoint((ContactPoint)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIMING:
				setDefaultValueTiming((Timing)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_META:
				setDefaultValueMeta((Meta)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				setMeaningWhenMissing((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BOOLEAN:
				setFixedBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INTEGER:
				setFixedInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DECIMAL:
				setFixedDecimal((Decimal)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BASE64_BINARY:
				setFixedBase64Binary((Base64Binary)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INSTANT:
				setFixedInstant((Instant)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_STRING:
				setFixedString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_URI:
				setFixedUri((Uri)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE:
				setFixedDate((Date)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE_TIME:
				setFixedDateTime((DateTime)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIME:
				setFixedTime((Time)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODE:
				setFixedCode((Code)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_OID:
				setFixedOid((Oid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UUID:
				setFixedUuid((Uuid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ID:
				setFixedId((Id)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UNSIGNED_INT:
				setFixedUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_POSITIVE_INT:
				setFixedPositiveInt((PositiveInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ANNOTATION:
				setFixedAnnotation((Annotation)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ATTACHMENT:
				setFixedAttachment((Attachment)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_IDENTIFIER:
				setFixedIdentifier((Identifier)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODEABLE_CONCEPT:
				setFixedCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODING:
				setFixedCoding((Coding)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_QUANTITY:
				setFixedQuantity((Quantity)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RANGE:
				setFixedRange((Range)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_PERIOD:
				setFixedPeriod((Period)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RATIO:
				setFixedRatio((Ratio)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_REFERENCE:
				setFixedReference((Reference)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SAMPLED_DATA:
				setFixedSampledData((SampledData)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SIGNATURE:
				setFixedSignature((Signature)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_HUMAN_NAME:
				setFixedHumanName((HumanName)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ADDRESS:
				setFixedAddress((Address)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_POINT:
				setFixedContactPoint((ContactPoint)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIMING:
				setFixedTiming((Timing)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_META:
				setFixedMeta((Meta)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BOOLEAN:
				setPatternBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INTEGER:
				setPatternInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DECIMAL:
				setPatternDecimal((Decimal)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BASE64_BINARY:
				setPatternBase64Binary((Base64Binary)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INSTANT:
				setPatternInstant((Instant)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_STRING:
				setPatternString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_URI:
				setPatternUri((Uri)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE:
				setPatternDate((Date)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE_TIME:
				setPatternDateTime((DateTime)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIME:
				setPatternTime((Time)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODE:
				setPatternCode((Code)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_OID:
				setPatternOid((Oid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UUID:
				setPatternUuid((Uuid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ID:
				setPatternId((Id)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UNSIGNED_INT:
				setPatternUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_POSITIVE_INT:
				setPatternPositiveInt((PositiveInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ANNOTATION:
				setPatternAnnotation((Annotation)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ATTACHMENT:
				setPatternAttachment((Attachment)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_IDENTIFIER:
				setPatternIdentifier((Identifier)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODEABLE_CONCEPT:
				setPatternCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODING:
				setPatternCoding((Coding)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_QUANTITY:
				setPatternQuantity((Quantity)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RANGE:
				setPatternRange((Range)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_PERIOD:
				setPatternPeriod((Period)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RATIO:
				setPatternRatio((Ratio)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_REFERENCE:
				setPatternReference((Reference)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SAMPLED_DATA:
				setPatternSampledData((SampledData)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SIGNATURE:
				setPatternSignature((Signature)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_HUMAN_NAME:
				setPatternHumanName((HumanName)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ADDRESS:
				setPatternAddress((Address)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_POINT:
				setPatternContactPoint((ContactPoint)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIMING:
				setPatternTiming((Timing)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_META:
				setPatternMeta((Meta)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_BOOLEAN:
				setExampleBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_INTEGER:
				setExampleInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DECIMAL:
				setExampleDecimal((Decimal)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_BASE64_BINARY:
				setExampleBase64Binary((Base64Binary)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_INSTANT:
				setExampleInstant((Instant)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_STRING:
				setExampleString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_URI:
				setExampleUri((Uri)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DATE:
				setExampleDate((Date)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DATE_TIME:
				setExampleDateTime((DateTime)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_TIME:
				setExampleTime((Time)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODE:
				setExampleCode((Code)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_OID:
				setExampleOid((Oid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_UUID:
				setExampleUuid((Uuid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ID:
				setExampleId((Id)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_UNSIGNED_INT:
				setExampleUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_POSITIVE_INT:
				setExamplePositiveInt((PositiveInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ANNOTATION:
				setExampleAnnotation((Annotation)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ATTACHMENT:
				setExampleAttachment((Attachment)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_IDENTIFIER:
				setExampleIdentifier((Identifier)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODEABLE_CONCEPT:
				setExampleCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODING:
				setExampleCoding((Coding)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_QUANTITY:
				setExampleQuantity((Quantity)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_RANGE:
				setExampleRange((Range)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_PERIOD:
				setExamplePeriod((Period)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_RATIO:
				setExampleRatio((Ratio)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_REFERENCE:
				setExampleReference((Reference)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_SAMPLED_DATA:
				setExampleSampledData((SampledData)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_SIGNATURE:
				setExampleSignature((Signature)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_HUMAN_NAME:
				setExampleHumanName((HumanName)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ADDRESS:
				setExampleAddress((Address)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CONTACT_POINT:
				setExampleContactPoint((ContactPoint)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_TIMING:
				setExampleTiming((Timing)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_META:
				setExampleMeta((Meta)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_BOOLEAN:
				setMinValueBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INTEGER:
				setMinValueInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DECIMAL:
				setMinValueDecimal((Decimal)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_BASE64_BINARY:
				setMinValueBase64Binary((Base64Binary)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INSTANT:
				setMinValueInstant((Instant)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_STRING:
				setMinValueString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_URI:
				setMinValueUri((Uri)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE:
				setMinValueDate((Date)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE_TIME:
				setMinValueDateTime((DateTime)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIME:
				setMinValueTime((Time)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODE:
				setMinValueCode((Code)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_OID:
				setMinValueOid((Oid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UUID:
				setMinValueUuid((Uuid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ID:
				setMinValueId((Id)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UNSIGNED_INT:
				setMinValueUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_POSITIVE_INT:
				setMinValuePositiveInt((PositiveInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ANNOTATION:
				setMinValueAnnotation((Annotation)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ATTACHMENT:
				setMinValueAttachment((Attachment)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_IDENTIFIER:
				setMinValueIdentifier((Identifier)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODEABLE_CONCEPT:
				setMinValueCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODING:
				setMinValueCoding((Coding)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_QUANTITY:
				setMinValueQuantity((Quantity)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_RANGE:
				setMinValueRange((Range)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_PERIOD:
				setMinValuePeriod((Period)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_RATIO:
				setMinValueRatio((Ratio)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_REFERENCE:
				setMinValueReference((Reference)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_SAMPLED_DATA:
				setMinValueSampledData((SampledData)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_SIGNATURE:
				setMinValueSignature((Signature)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_HUMAN_NAME:
				setMinValueHumanName((HumanName)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ADDRESS:
				setMinValueAddress((Address)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CONTACT_POINT:
				setMinValueContactPoint((ContactPoint)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIMING:
				setMinValueTiming((Timing)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_META:
				setMinValueMeta((Meta)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_BOOLEAN:
				setMaxValueBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INTEGER:
				setMaxValueInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DECIMAL:
				setMaxValueDecimal((Decimal)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_BASE64_BINARY:
				setMaxValueBase64Binary((Base64Binary)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INSTANT:
				setMaxValueInstant((Instant)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_STRING:
				setMaxValueString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_URI:
				setMaxValueUri((Uri)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE:
				setMaxValueDate((Date)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE_TIME:
				setMaxValueDateTime((DateTime)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIME:
				setMaxValueTime((Time)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODE:
				setMaxValueCode((Code)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_OID:
				setMaxValueOid((Oid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UUID:
				setMaxValueUuid((Uuid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ID:
				setMaxValueId((Id)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UNSIGNED_INT:
				setMaxValueUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_POSITIVE_INT:
				setMaxValuePositiveInt((PositiveInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ANNOTATION:
				setMaxValueAnnotation((Annotation)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ATTACHMENT:
				setMaxValueAttachment((Attachment)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_IDENTIFIER:
				setMaxValueIdentifier((Identifier)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODEABLE_CONCEPT:
				setMaxValueCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODING:
				setMaxValueCoding((Coding)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_QUANTITY:
				setMaxValueQuantity((Quantity)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_RANGE:
				setMaxValueRange((Range)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_PERIOD:
				setMaxValuePeriod((Period)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_RATIO:
				setMaxValueRatio((Ratio)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_REFERENCE:
				setMaxValueReference((Reference)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_SAMPLED_DATA:
				setMaxValueSampledData((SampledData)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_SIGNATURE:
				setMaxValueSignature((Signature)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_HUMAN_NAME:
				setMaxValueHumanName((HumanName)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ADDRESS:
				setMaxValueAddress((Address)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CONTACT_POINT:
				setMaxValueContactPoint((ContactPoint)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIMING:
				setMaxValueTiming((Timing)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_META:
				setMaxValueMeta((Meta)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAX_LENGTH:
				setMaxLength((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__CONDITION:
				getCondition().clear();
				return;
			case FhirPackage.ELEMENT_DEFINITION__CONSTRAINT:
				getConstraint().clear();
				return;
			case FhirPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				setMustSupport((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				setIsModifier((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				setIsSummary((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__BINDING:
				setBinding((ElementDefinitionBinding)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION__MAPPING:
				getMapping().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.ELEMENT_DEFINITION__PATH:
				return path != null;
			case FhirPackage.ELEMENT_DEFINITION__REPRESENTATION:
				return representation != null && !representation.isEmpty();
			case FhirPackage.ELEMENT_DEFINITION__NAME:
				return name != null;
			case FhirPackage.ELEMENT_DEFINITION__LABEL:
				return label != null;
			case FhirPackage.ELEMENT_DEFINITION__CODE:
				return code != null && !code.isEmpty();
			case FhirPackage.ELEMENT_DEFINITION__SLICING:
				return slicing != null;
			case FhirPackage.ELEMENT_DEFINITION__SHORT:
				return short_ != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFINITION:
				return definition != null;
			case FhirPackage.ELEMENT_DEFINITION__COMMENTS:
				return comments != null;
			case FhirPackage.ELEMENT_DEFINITION__REQUIREMENTS:
				return requirements != null;
			case FhirPackage.ELEMENT_DEFINITION__ALIAS:
				return alias != null && !alias.isEmpty();
			case FhirPackage.ELEMENT_DEFINITION__MIN:
				return min != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX:
				return max != null;
			case FhirPackage.ELEMENT_DEFINITION__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.ELEMENT_DEFINITION__NAME_REFERENCE:
				return nameReference != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BOOLEAN:
				return defaultValueBoolean != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INTEGER:
				return defaultValueInteger != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DECIMAL:
				return defaultValueDecimal != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_BASE64_BINARY:
				return defaultValueBase64Binary != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_INSTANT:
				return defaultValueInstant != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_STRING:
				return defaultValueString != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_URI:
				return defaultValueUri != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE:
				return defaultValueDate != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_DATE_TIME:
				return defaultValueDateTime != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIME:
				return defaultValueTime != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODE:
				return defaultValueCode != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_OID:
				return defaultValueOid != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UUID:
				return defaultValueUuid != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ID:
				return defaultValueId != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_UNSIGNED_INT:
				return defaultValueUnsignedInt != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_POSITIVE_INT:
				return defaultValuePositiveInt != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ANNOTATION:
				return defaultValueAnnotation != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ATTACHMENT:
				return defaultValueAttachment != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_IDENTIFIER:
				return defaultValueIdentifier != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODEABLE_CONCEPT:
				return defaultValueCodeableConcept != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CODING:
				return defaultValueCoding != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_QUANTITY:
				return defaultValueQuantity != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RANGE:
				return defaultValueRange != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_PERIOD:
				return defaultValuePeriod != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_RATIO:
				return defaultValueRatio != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_REFERENCE:
				return defaultValueReference != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SAMPLED_DATA:
				return defaultValueSampledData != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_SIGNATURE:
				return defaultValueSignature != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_HUMAN_NAME:
				return defaultValueHumanName != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_ADDRESS:
				return defaultValueAddress != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_CONTACT_POINT:
				return defaultValueContactPoint != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_TIMING:
				return defaultValueTiming != null;
			case FhirPackage.ELEMENT_DEFINITION__DEFAULT_VALUE_META:
				return defaultValueMeta != null;
			case FhirPackage.ELEMENT_DEFINITION__MEANING_WHEN_MISSING:
				return meaningWhenMissing != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BOOLEAN:
				return fixedBoolean != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INTEGER:
				return fixedInteger != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DECIMAL:
				return fixedDecimal != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_BASE64_BINARY:
				return fixedBase64Binary != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_INSTANT:
				return fixedInstant != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_STRING:
				return fixedString != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_URI:
				return fixedUri != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE:
				return fixedDate != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_DATE_TIME:
				return fixedDateTime != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIME:
				return fixedTime != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODE:
				return fixedCode != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_OID:
				return fixedOid != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UUID:
				return fixedUuid != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ID:
				return fixedId != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_UNSIGNED_INT:
				return fixedUnsignedInt != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_POSITIVE_INT:
				return fixedPositiveInt != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ANNOTATION:
				return fixedAnnotation != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ATTACHMENT:
				return fixedAttachment != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_IDENTIFIER:
				return fixedIdentifier != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODEABLE_CONCEPT:
				return fixedCodeableConcept != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CODING:
				return fixedCoding != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_QUANTITY:
				return fixedQuantity != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RANGE:
				return fixedRange != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_PERIOD:
				return fixedPeriod != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_RATIO:
				return fixedRatio != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_REFERENCE:
				return fixedReference != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SAMPLED_DATA:
				return fixedSampledData != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_SIGNATURE:
				return fixedSignature != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_HUMAN_NAME:
				return fixedHumanName != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_ADDRESS:
				return fixedAddress != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_CONTACT_POINT:
				return fixedContactPoint != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_TIMING:
				return fixedTiming != null;
			case FhirPackage.ELEMENT_DEFINITION__FIXED_META:
				return fixedMeta != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BOOLEAN:
				return patternBoolean != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INTEGER:
				return patternInteger != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DECIMAL:
				return patternDecimal != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_BASE64_BINARY:
				return patternBase64Binary != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_INSTANT:
				return patternInstant != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_STRING:
				return patternString != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_URI:
				return patternUri != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE:
				return patternDate != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_DATE_TIME:
				return patternDateTime != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIME:
				return patternTime != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODE:
				return patternCode != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_OID:
				return patternOid != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UUID:
				return patternUuid != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ID:
				return patternId != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_UNSIGNED_INT:
				return patternUnsignedInt != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_POSITIVE_INT:
				return patternPositiveInt != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ANNOTATION:
				return patternAnnotation != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ATTACHMENT:
				return patternAttachment != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_IDENTIFIER:
				return patternIdentifier != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODEABLE_CONCEPT:
				return patternCodeableConcept != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CODING:
				return patternCoding != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_QUANTITY:
				return patternQuantity != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RANGE:
				return patternRange != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_PERIOD:
				return patternPeriod != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_RATIO:
				return patternRatio != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_REFERENCE:
				return patternReference != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SAMPLED_DATA:
				return patternSampledData != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_SIGNATURE:
				return patternSignature != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_HUMAN_NAME:
				return patternHumanName != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_ADDRESS:
				return patternAddress != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_CONTACT_POINT:
				return patternContactPoint != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_TIMING:
				return patternTiming != null;
			case FhirPackage.ELEMENT_DEFINITION__PATTERN_META:
				return patternMeta != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_BOOLEAN:
				return exampleBoolean != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_INTEGER:
				return exampleInteger != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DECIMAL:
				return exampleDecimal != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_BASE64_BINARY:
				return exampleBase64Binary != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_INSTANT:
				return exampleInstant != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_STRING:
				return exampleString != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_URI:
				return exampleUri != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DATE:
				return exampleDate != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_DATE_TIME:
				return exampleDateTime != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_TIME:
				return exampleTime != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODE:
				return exampleCode != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_OID:
				return exampleOid != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_UUID:
				return exampleUuid != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ID:
				return exampleId != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_UNSIGNED_INT:
				return exampleUnsignedInt != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_POSITIVE_INT:
				return examplePositiveInt != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ANNOTATION:
				return exampleAnnotation != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ATTACHMENT:
				return exampleAttachment != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_IDENTIFIER:
				return exampleIdentifier != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODEABLE_CONCEPT:
				return exampleCodeableConcept != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CODING:
				return exampleCoding != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_QUANTITY:
				return exampleQuantity != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_RANGE:
				return exampleRange != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_PERIOD:
				return examplePeriod != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_RATIO:
				return exampleRatio != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_REFERENCE:
				return exampleReference != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_SAMPLED_DATA:
				return exampleSampledData != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_SIGNATURE:
				return exampleSignature != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_HUMAN_NAME:
				return exampleHumanName != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_ADDRESS:
				return exampleAddress != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_CONTACT_POINT:
				return exampleContactPoint != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_TIMING:
				return exampleTiming != null;
			case FhirPackage.ELEMENT_DEFINITION__EXAMPLE_META:
				return exampleMeta != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_BOOLEAN:
				return minValueBoolean != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INTEGER:
				return minValueInteger != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DECIMAL:
				return minValueDecimal != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_BASE64_BINARY:
				return minValueBase64Binary != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_INSTANT:
				return minValueInstant != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_STRING:
				return minValueString != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_URI:
				return minValueUri != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE:
				return minValueDate != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_DATE_TIME:
				return minValueDateTime != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIME:
				return minValueTime != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODE:
				return minValueCode != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_OID:
				return minValueOid != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UUID:
				return minValueUuid != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ID:
				return minValueId != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_UNSIGNED_INT:
				return minValueUnsignedInt != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_POSITIVE_INT:
				return minValuePositiveInt != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ANNOTATION:
				return minValueAnnotation != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ATTACHMENT:
				return minValueAttachment != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_IDENTIFIER:
				return minValueIdentifier != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODEABLE_CONCEPT:
				return minValueCodeableConcept != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CODING:
				return minValueCoding != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_QUANTITY:
				return minValueQuantity != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_RANGE:
				return minValueRange != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_PERIOD:
				return minValuePeriod != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_RATIO:
				return minValueRatio != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_REFERENCE:
				return minValueReference != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_SAMPLED_DATA:
				return minValueSampledData != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_SIGNATURE:
				return minValueSignature != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_HUMAN_NAME:
				return minValueHumanName != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_ADDRESS:
				return minValueAddress != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_CONTACT_POINT:
				return minValueContactPoint != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_TIMING:
				return minValueTiming != null;
			case FhirPackage.ELEMENT_DEFINITION__MIN_VALUE_META:
				return minValueMeta != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_BOOLEAN:
				return maxValueBoolean != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INTEGER:
				return maxValueInteger != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DECIMAL:
				return maxValueDecimal != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_BASE64_BINARY:
				return maxValueBase64Binary != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_INSTANT:
				return maxValueInstant != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_STRING:
				return maxValueString != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_URI:
				return maxValueUri != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE:
				return maxValueDate != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_DATE_TIME:
				return maxValueDateTime != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIME:
				return maxValueTime != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODE:
				return maxValueCode != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_OID:
				return maxValueOid != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UUID:
				return maxValueUuid != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ID:
				return maxValueId != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_UNSIGNED_INT:
				return maxValueUnsignedInt != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_POSITIVE_INT:
				return maxValuePositiveInt != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ANNOTATION:
				return maxValueAnnotation != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ATTACHMENT:
				return maxValueAttachment != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_IDENTIFIER:
				return maxValueIdentifier != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODEABLE_CONCEPT:
				return maxValueCodeableConcept != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CODING:
				return maxValueCoding != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_QUANTITY:
				return maxValueQuantity != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_RANGE:
				return maxValueRange != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_PERIOD:
				return maxValuePeriod != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_RATIO:
				return maxValueRatio != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_REFERENCE:
				return maxValueReference != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_SAMPLED_DATA:
				return maxValueSampledData != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_SIGNATURE:
				return maxValueSignature != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_HUMAN_NAME:
				return maxValueHumanName != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_ADDRESS:
				return maxValueAddress != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_CONTACT_POINT:
				return maxValueContactPoint != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_TIMING:
				return maxValueTiming != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_VALUE_META:
				return maxValueMeta != null;
			case FhirPackage.ELEMENT_DEFINITION__MAX_LENGTH:
				return maxLength != null;
			case FhirPackage.ELEMENT_DEFINITION__CONDITION:
				return condition != null && !condition.isEmpty();
			case FhirPackage.ELEMENT_DEFINITION__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case FhirPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				return mustSupport != null;
			case FhirPackage.ELEMENT_DEFINITION__IS_MODIFIER:
				return isModifier != null;
			case FhirPackage.ELEMENT_DEFINITION__IS_SUMMARY:
				return isSummary != null;
			case FhirPackage.ELEMENT_DEFINITION__BINDING:
				return binding != null;
			case FhirPackage.ELEMENT_DEFINITION__MAPPING:
				return mapping != null && !mapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionImpl
