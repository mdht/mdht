/**
 */
package org.hl7.fhir.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.hl7.fhir.ActionList;
import org.hl7.fhir.ActionListList;
import org.hl7.fhir.Address;
import org.hl7.fhir.AddressUse;
import org.hl7.fhir.AddressUseList;
import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.AdministrativeGenderList;
import org.hl7.fhir.Age;
import org.hl7.fhir.AggregationMode;
import org.hl7.fhir.AggregationModeList;
import org.hl7.fhir.AllergyIntolerance;
import org.hl7.fhir.AllergyIntoleranceCategory;
import org.hl7.fhir.AllergyIntoleranceCategoryList;
import org.hl7.fhir.AllergyIntoleranceCertainty;
import org.hl7.fhir.AllergyIntoleranceCertaintyList;
import org.hl7.fhir.AllergyIntoleranceCriticality;
import org.hl7.fhir.AllergyIntoleranceCriticalityList;
import org.hl7.fhir.AllergyIntoleranceEvent;
import org.hl7.fhir.AllergyIntoleranceSeverity;
import org.hl7.fhir.AllergyIntoleranceSeverityList;
import org.hl7.fhir.AllergyIntoleranceStatus;
import org.hl7.fhir.AllergyIntoleranceStatusList;
import org.hl7.fhir.AllergyIntoleranceType;
import org.hl7.fhir.AllergyIntoleranceTypeList;
import org.hl7.fhir.AnswerFormat;
import org.hl7.fhir.AnswerFormatList;
import org.hl7.fhir.Appointment;
import org.hl7.fhir.AppointmentParticipant;
import org.hl7.fhir.AppointmentResponse;
import org.hl7.fhir.AppointmentStatus;
import org.hl7.fhir.AppointmentStatusList;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.AuditEvent;
import org.hl7.fhir.AuditEventAction;
import org.hl7.fhir.AuditEventActionList;
import org.hl7.fhir.AuditEventDetail;
import org.hl7.fhir.AuditEventEvent;
import org.hl7.fhir.AuditEventNetwork;
import org.hl7.fhir.AuditEventObject;
import org.hl7.fhir.AuditEventObjectLifecycle;
import org.hl7.fhir.AuditEventObjectLifecycleList;
import org.hl7.fhir.AuditEventObjectRole;
import org.hl7.fhir.AuditEventObjectRoleList;
import org.hl7.fhir.AuditEventObjectType;
import org.hl7.fhir.AuditEventObjectTypeList;
import org.hl7.fhir.AuditEventOutcome;
import org.hl7.fhir.AuditEventOutcomeList;
import org.hl7.fhir.AuditEventParticipant;
import org.hl7.fhir.AuditEventParticipantNetworkType;
import org.hl7.fhir.AuditEventParticipantNetworkTypeList;
import org.hl7.fhir.AuditEventSource;
import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Basic;
import org.hl7.fhir.Binary;
import org.hl7.fhir.BindingStrength;
import org.hl7.fhir.BindingStrengthList;
import org.hl7.fhir.BodySite;
import org.hl7.fhir.Bundle;
import org.hl7.fhir.BundleEntry;
import org.hl7.fhir.BundleLink;
import org.hl7.fhir.BundleSearch;
import org.hl7.fhir.BundleTransaction;
import org.hl7.fhir.BundleTransactionResponse;
import org.hl7.fhir.BundleType;
import org.hl7.fhir.BundleTypeList;
import org.hl7.fhir.CarePlan;
import org.hl7.fhir.CarePlanActivity;
import org.hl7.fhir.CarePlanActivityCategory;
import org.hl7.fhir.CarePlanActivityCategoryList;
import org.hl7.fhir.CarePlanActivityStatus;
import org.hl7.fhir.CarePlanActivityStatusList;
import org.hl7.fhir.CarePlanDetail;
import org.hl7.fhir.CarePlanParticipant;
import org.hl7.fhir.CarePlanStatus;
import org.hl7.fhir.CarePlanStatusList;
import org.hl7.fhir.Claim;
import org.hl7.fhir.ClaimCoverage;
import org.hl7.fhir.ClaimDetail;
import org.hl7.fhir.ClaimDiagnosis;
import org.hl7.fhir.ClaimItem;
import org.hl7.fhir.ClaimMissingTeeth;
import org.hl7.fhir.ClaimPayee;
import org.hl7.fhir.ClaimProsthesis;
import org.hl7.fhir.ClaimResponse;
import org.hl7.fhir.ClaimResponseAddItem;
import org.hl7.fhir.ClaimResponseAdjudication;
import org.hl7.fhir.ClaimResponseAdjudication1;
import org.hl7.fhir.ClaimResponseAdjudication2;
import org.hl7.fhir.ClaimResponseAdjudication3;
import org.hl7.fhir.ClaimResponseAdjudication4;
import org.hl7.fhir.ClaimResponseCoverage;
import org.hl7.fhir.ClaimResponseDetail;
import org.hl7.fhir.ClaimResponseDetail1;
import org.hl7.fhir.ClaimResponseError;
import org.hl7.fhir.ClaimResponseItem;
import org.hl7.fhir.ClaimResponseNote;
import org.hl7.fhir.ClaimResponseSubDetail;
import org.hl7.fhir.ClaimSubDetail;
import org.hl7.fhir.ClaimType;
import org.hl7.fhir.ClaimTypeList;
import org.hl7.fhir.ClinicalBaseGender;
import org.hl7.fhir.ClinicalImpression;
import org.hl7.fhir.ClinicalImpressionFinding;
import org.hl7.fhir.ClinicalImpressionInvestigations;
import org.hl7.fhir.ClinicalImpressionRuledOut;
import org.hl7.fhir.ClinicalImpressionStatus;
import org.hl7.fhir.ClinicalImpressionStatusList;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Communication;
import org.hl7.fhir.CommunicationPayload;
import org.hl7.fhir.CommunicationRequest;
import org.hl7.fhir.CommunicationRequestPayload;
import org.hl7.fhir.CommunicationRequestStatus;
import org.hl7.fhir.CommunicationRequestStatusList;
import org.hl7.fhir.CommunicationStatus;
import org.hl7.fhir.CommunicationStatusList;
import org.hl7.fhir.Composition;
import org.hl7.fhir.CompositionAttestationMode;
import org.hl7.fhir.CompositionAttestationModeList;
import org.hl7.fhir.CompositionAttester;
import org.hl7.fhir.CompositionEvent;
import org.hl7.fhir.CompositionSection;
import org.hl7.fhir.CompositionStatus;
import org.hl7.fhir.CompositionStatusList;
import org.hl7.fhir.ConceptMap;
import org.hl7.fhir.ConceptMapContact;
import org.hl7.fhir.ConceptMapDependsOn;
import org.hl7.fhir.ConceptMapElement;
import org.hl7.fhir.ConceptMapEquivalence;
import org.hl7.fhir.ConceptMapEquivalenceList;
import org.hl7.fhir.ConceptMapMap;
import org.hl7.fhir.Condition;
import org.hl7.fhir.ConditionClinicalStatus;
import org.hl7.fhir.ConditionClinicalStatusList;
import org.hl7.fhir.ConditionDueTo;
import org.hl7.fhir.ConditionEvidence;
import org.hl7.fhir.ConditionLocation;
import org.hl7.fhir.ConditionOccurredFollowing;
import org.hl7.fhir.ConditionStage;
import org.hl7.fhir.Conformance;
import org.hl7.fhir.ConformanceCertificate;
import org.hl7.fhir.ConformanceContact;
import org.hl7.fhir.ConformanceDocument;
import org.hl7.fhir.ConformanceEvent;
import org.hl7.fhir.ConformanceEventMode;
import org.hl7.fhir.ConformanceEventModeList;
import org.hl7.fhir.ConformanceImplementation;
import org.hl7.fhir.ConformanceInteraction;
import org.hl7.fhir.ConformanceInteraction1;
import org.hl7.fhir.ConformanceMessaging;
import org.hl7.fhir.ConformanceOperation;
import org.hl7.fhir.ConformanceResource;
import org.hl7.fhir.ConformanceResourceStatus;
import org.hl7.fhir.ConformanceResourceStatusList;
import org.hl7.fhir.ConformanceRest;
import org.hl7.fhir.ConformanceSearchParam;
import org.hl7.fhir.ConformanceSecurity;
import org.hl7.fhir.ConformanceSoftware;
import org.hl7.fhir.ConformanceUseContext;
import org.hl7.fhir.ConstraintSeverity;
import org.hl7.fhir.ConstraintSeverityList;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.ContactPointSystem;
import org.hl7.fhir.ContactPointSystemList;
import org.hl7.fhir.ContactPointUse;
import org.hl7.fhir.ContactPointUseList;
import org.hl7.fhir.Contract;
import org.hl7.fhir.ContractActor;
import org.hl7.fhir.ContractActor1;
import org.hl7.fhir.ContractFriendly;
import org.hl7.fhir.ContractLegal;
import org.hl7.fhir.ContractRule;
import org.hl7.fhir.ContractSigner;
import org.hl7.fhir.ContractTerm;
import org.hl7.fhir.ContractValuedItem;
import org.hl7.fhir.ContractValuedItem1;
import org.hl7.fhir.Contraindication;
import org.hl7.fhir.ContraindicationMitigation;
import org.hl7.fhir.Count;
import org.hl7.fhir.Coverage;
import org.hl7.fhir.DataAbsentReason;
import org.hl7.fhir.DataAbsentReasonList;
import org.hl7.fhir.DataElement;
import org.hl7.fhir.DataElementContact;
import org.hl7.fhir.DataElementMapping;
import org.hl7.fhir.DataElementSpecificity;
import org.hl7.fhir.DataElementSpecificityList;
import org.hl7.fhir.DataType;
import org.hl7.fhir.DataTypeList;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.DaysOfWeek;
import org.hl7.fhir.DaysOfWeekList;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.Device;
import org.hl7.fhir.DeviceComponent;
import org.hl7.fhir.DeviceComponentProductionSpecification;
import org.hl7.fhir.DeviceMetric;
import org.hl7.fhir.DeviceMetricCalibration;
import org.hl7.fhir.DeviceMetricCalibrationState;
import org.hl7.fhir.DeviceMetricCalibrationStateList;
import org.hl7.fhir.DeviceMetricCalibrationType;
import org.hl7.fhir.DeviceMetricCalibrationTypeList;
import org.hl7.fhir.DeviceMetricCategory;
import org.hl7.fhir.DeviceMetricCategoryList;
import org.hl7.fhir.DeviceMetricColor;
import org.hl7.fhir.DeviceMetricColorList;
import org.hl7.fhir.DeviceMetricOperationalStatus;
import org.hl7.fhir.DeviceMetricOperationalStatusList;
import org.hl7.fhir.DeviceStatus;
import org.hl7.fhir.DeviceStatusList;
import org.hl7.fhir.DeviceUseRequest;
import org.hl7.fhir.DeviceUseRequestPriority;
import org.hl7.fhir.DeviceUseRequestPriorityList;
import org.hl7.fhir.DeviceUseRequestStatus;
import org.hl7.fhir.DeviceUseRequestStatusList;
import org.hl7.fhir.DeviceUseStatement;
import org.hl7.fhir.DiagnosticOrder;
import org.hl7.fhir.DiagnosticOrderEvent;
import org.hl7.fhir.DiagnosticOrderItem;
import org.hl7.fhir.DiagnosticOrderPriority;
import org.hl7.fhir.DiagnosticOrderPriorityList;
import org.hl7.fhir.DiagnosticOrderStatus;
import org.hl7.fhir.DiagnosticOrderStatusList;
import org.hl7.fhir.DiagnosticReport;
import org.hl7.fhir.DiagnosticReportImage;
import org.hl7.fhir.DiagnosticReportStatus;
import org.hl7.fhir.DiagnosticReportStatusList;
import org.hl7.fhir.DigitalMediaType;
import org.hl7.fhir.DigitalMediaTypeList;
import org.hl7.fhir.Distance;
import org.hl7.fhir.DocumentManifest;
import org.hl7.fhir.DocumentManifestContent;
import org.hl7.fhir.DocumentManifestRelated;
import org.hl7.fhir.DocumentMode;
import org.hl7.fhir.DocumentModeList;
import org.hl7.fhir.DocumentReference;
import org.hl7.fhir.DocumentReferenceContext;
import org.hl7.fhir.DocumentReferenceRelated;
import org.hl7.fhir.DocumentReferenceRelatesTo;
import org.hl7.fhir.DocumentReferenceStatus;
import org.hl7.fhir.DocumentReferenceStatusList;
import org.hl7.fhir.DocumentRelationshipType;
import org.hl7.fhir.DocumentRelationshipTypeList;
import org.hl7.fhir.DocumentRoot;
import org.hl7.fhir.DomainResource;
import org.hl7.fhir.Duration;
import org.hl7.fhir.Element;
import org.hl7.fhir.ElementDefinition;
import org.hl7.fhir.ElementDefinitionBinding;
import org.hl7.fhir.ElementDefinitionConstraint;
import org.hl7.fhir.ElementDefinitionMapping;
import org.hl7.fhir.ElementDefinitionSlicing;
import org.hl7.fhir.ElementDefinitionType;
import org.hl7.fhir.EligibilityRequest;
import org.hl7.fhir.EligibilityResponse;
import org.hl7.fhir.Encounter;
import org.hl7.fhir.EncounterClass;
import org.hl7.fhir.EncounterClassList;
import org.hl7.fhir.EncounterHospitalization;
import org.hl7.fhir.EncounterLocation;
import org.hl7.fhir.EncounterLocationStatus;
import org.hl7.fhir.EncounterLocationStatusList;
import org.hl7.fhir.EncounterParticipant;
import org.hl7.fhir.EncounterState;
import org.hl7.fhir.EncounterStateList;
import org.hl7.fhir.EncounterStatusHistory;
import org.hl7.fhir.EnrollmentRequest;
import org.hl7.fhir.EnrollmentResponse;
import org.hl7.fhir.EpisodeOfCare;
import org.hl7.fhir.EpisodeOfCareCareTeam;
import org.hl7.fhir.EpisodeOfCareStatus;
import org.hl7.fhir.EpisodeOfCareStatusHistory;
import org.hl7.fhir.EpisodeOfCareStatusList;
import org.hl7.fhir.EventTiming;
import org.hl7.fhir.EventTimingList;
import org.hl7.fhir.ExplanationOfBenefit;
import org.hl7.fhir.Extension;
import org.hl7.fhir.ExtensionContext;
import org.hl7.fhir.ExtensionContextList;
import org.hl7.fhir.FHIRDefinedType;
import org.hl7.fhir.FHIRDefinedTypeList;
import org.hl7.fhir.FamilyMemberHistory;
import org.hl7.fhir.FamilyMemberHistoryCondition;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.FilterOperator;
import org.hl7.fhir.FilterOperatorList;
import org.hl7.fhir.Flag;
import org.hl7.fhir.FlagStatus;
import org.hl7.fhir.FlagStatusList;
import org.hl7.fhir.Goal;
import org.hl7.fhir.GoalOutcome;
import org.hl7.fhir.GoalStatus;
import org.hl7.fhir.GoalStatusList;
import org.hl7.fhir.Group;
import org.hl7.fhir.GroupCharacteristic;
import org.hl7.fhir.GroupType;
import org.hl7.fhir.GroupTypeList;
import org.hl7.fhir.HTTPVerb;
import org.hl7.fhir.HTTPVerbList;
import org.hl7.fhir.HealthcareService;
import org.hl7.fhir.HealthcareServiceAvailableTime;
import org.hl7.fhir.HealthcareServiceNotAvailable;
import org.hl7.fhir.HealthcareServiceServiceType;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.IdentifierUse;
import org.hl7.fhir.IdentifierUseList;
import org.hl7.fhir.IdentityAssuranceLevel;
import org.hl7.fhir.IdentityAssuranceLevelList;
import org.hl7.fhir.ImagingModality;
import org.hl7.fhir.ImagingModalityList;
import org.hl7.fhir.ImagingObjectSelection;
import org.hl7.fhir.ImagingObjectSelectionFrames;
import org.hl7.fhir.ImagingObjectSelectionInstance;
import org.hl7.fhir.ImagingObjectSelectionSeries;
import org.hl7.fhir.ImagingObjectSelectionStudy;
import org.hl7.fhir.ImagingStudy;
import org.hl7.fhir.ImagingStudyInstance;
import org.hl7.fhir.ImagingStudySeries;
import org.hl7.fhir.Immunization;
import org.hl7.fhir.ImmunizationExplanation;
import org.hl7.fhir.ImmunizationReaction;
import org.hl7.fhir.ImmunizationRecommendation;
import org.hl7.fhir.ImmunizationRecommendationDateCriterion;
import org.hl7.fhir.ImmunizationRecommendationProtocol;
import org.hl7.fhir.ImmunizationRecommendationRecommendation;
import org.hl7.fhir.ImmunizationVaccinationProtocol;
import org.hl7.fhir.InstanceAvailability;
import org.hl7.fhir.InstanceAvailabilityList;
import org.hl7.fhir.Instant;
import org.hl7.fhir.IssueSeverity;
import org.hl7.fhir.IssueSeverityList;
import org.hl7.fhir.LinkType;
import org.hl7.fhir.LinkTypeList;
import org.hl7.fhir.List;
import org.hl7.fhir.ListEntry;
import org.hl7.fhir.ListMode;
import org.hl7.fhir.ListModeList;
import org.hl7.fhir.ListStatus;
import org.hl7.fhir.ListStatusList;
import org.hl7.fhir.Location;
import org.hl7.fhir.LocationMode;
import org.hl7.fhir.LocationModeList;
import org.hl7.fhir.LocationPosition;
import org.hl7.fhir.LocationStatus;
import org.hl7.fhir.LocationStatusList;
import org.hl7.fhir.MaritalStatus;
import org.hl7.fhir.MeasmntPrinciple;
import org.hl7.fhir.MeasmntPrincipleList;
import org.hl7.fhir.Media;
import org.hl7.fhir.Medication;
import org.hl7.fhir.MedicationAdministration;
import org.hl7.fhir.MedicationAdministrationDosage;
import org.hl7.fhir.MedicationAdministrationStatus;
import org.hl7.fhir.MedicationAdministrationStatusList;
import org.hl7.fhir.MedicationBatch;
import org.hl7.fhir.MedicationContent;
import org.hl7.fhir.MedicationDispense;
import org.hl7.fhir.MedicationDispenseDosageInstruction;
import org.hl7.fhir.MedicationDispenseStatus;
import org.hl7.fhir.MedicationDispenseStatusList;
import org.hl7.fhir.MedicationDispenseSubstitution;
import org.hl7.fhir.MedicationIngredient;
import org.hl7.fhir.MedicationKind;
import org.hl7.fhir.MedicationKindList;
import org.hl7.fhir.MedicationPackage;
import org.hl7.fhir.MedicationPrescription;
import org.hl7.fhir.MedicationPrescriptionDispense;
import org.hl7.fhir.MedicationPrescriptionDosageInstruction;
import org.hl7.fhir.MedicationPrescriptionStatus;
import org.hl7.fhir.MedicationPrescriptionStatusList;
import org.hl7.fhir.MedicationPrescriptionSubstitution;
import org.hl7.fhir.MedicationProduct;
import org.hl7.fhir.MedicationStatement;
import org.hl7.fhir.MedicationStatementDosage;
import org.hl7.fhir.MedicationStatementStatus;
import org.hl7.fhir.MedicationStatementStatusList;
import org.hl7.fhir.MessageEvent;
import org.hl7.fhir.MessageEventList;
import org.hl7.fhir.MessageHeader;
import org.hl7.fhir.MessageHeaderDestination;
import org.hl7.fhir.MessageHeaderResponse;
import org.hl7.fhir.MessageHeaderSource;
import org.hl7.fhir.MessageSignificanceCategory;
import org.hl7.fhir.MessageSignificanceCategoryList;
import org.hl7.fhir.Meta;
import org.hl7.fhir.Modality;
import org.hl7.fhir.ModalityList;
import org.hl7.fhir.Money;
import org.hl7.fhir.NameUse;
import org.hl7.fhir.NameUseList;
import org.hl7.fhir.NamingSystem;
import org.hl7.fhir.NamingSystemContact;
import org.hl7.fhir.NamingSystemIdentifierType;
import org.hl7.fhir.NamingSystemIdentifierTypeList;
import org.hl7.fhir.NamingSystemType;
import org.hl7.fhir.NamingSystemTypeList;
import org.hl7.fhir.NamingSystemUniqueId;
import org.hl7.fhir.Narrative;
import org.hl7.fhir.NarrativeStatus;
import org.hl7.fhir.NarrativeStatusList;
import org.hl7.fhir.NoteType;
import org.hl7.fhir.NoteTypeList;
import org.hl7.fhir.NutritionOrder;
import org.hl7.fhir.NutritionOrderEnteralFormula;
import org.hl7.fhir.NutritionOrderNutrient;
import org.hl7.fhir.NutritionOrderOralDiet;
import org.hl7.fhir.NutritionOrderStatus;
import org.hl7.fhir.NutritionOrderStatusList;
import org.hl7.fhir.NutritionOrderSupplement;
import org.hl7.fhir.NutritionOrderTexture;
import org.hl7.fhir.Observation;
import org.hl7.fhir.ObservationReferenceRange;
import org.hl7.fhir.ObservationRelated;
import org.hl7.fhir.ObservationRelationshipType;
import org.hl7.fhir.ObservationRelationshipTypeList;
import org.hl7.fhir.ObservationReliability;
import org.hl7.fhir.ObservationReliabilityList;
import org.hl7.fhir.ObservationStatus;
import org.hl7.fhir.ObservationStatusList;
import org.hl7.fhir.Oid;
import org.hl7.fhir.OperationDefinition;
import org.hl7.fhir.OperationDefinitionContact;
import org.hl7.fhir.OperationDefinitionParameter;
import org.hl7.fhir.OperationDefinitionPart;
import org.hl7.fhir.OperationKind;
import org.hl7.fhir.OperationKindList;
import org.hl7.fhir.OperationOutcome;
import org.hl7.fhir.OperationOutcomeIssue;
import org.hl7.fhir.OperationParameterUse;
import org.hl7.fhir.OperationParameterUseList;
import org.hl7.fhir.Order;
import org.hl7.fhir.OrderResponse;
import org.hl7.fhir.OrderStatus;
import org.hl7.fhir.OrderStatusList;
import org.hl7.fhir.OrderWhen;
import org.hl7.fhir.Organization;
import org.hl7.fhir.OrganizationContact;
import org.hl7.fhir.Parameters;
import org.hl7.fhir.ParametersParameter;
import org.hl7.fhir.ParametersPart;
import org.hl7.fhir.ParticipantRequired;
import org.hl7.fhir.ParticipantRequiredList;
import org.hl7.fhir.ParticipantStatus;
import org.hl7.fhir.ParticipantStatusList;
import org.hl7.fhir.ParticipationStatus;
import org.hl7.fhir.ParticipationStatusList;
import org.hl7.fhir.Patient;
import org.hl7.fhir.PatientAnimal;
import org.hl7.fhir.PatientCommunication;
import org.hl7.fhir.PatientContact;
import org.hl7.fhir.PatientLink;
import org.hl7.fhir.PaymentNotice;
import org.hl7.fhir.PaymentReconciliation;
import org.hl7.fhir.PaymentReconciliationDetail;
import org.hl7.fhir.PaymentReconciliationNote;
import org.hl7.fhir.Period;
import org.hl7.fhir.Person;
import org.hl7.fhir.PersonLink;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Practitioner;
import org.hl7.fhir.PractitionerPractitionerRole;
import org.hl7.fhir.PractitionerQualification;
import org.hl7.fhir.Procedure;
import org.hl7.fhir.ProcedureBodySite;
import org.hl7.fhir.ProcedureDevice;
import org.hl7.fhir.ProcedurePerformer;
import org.hl7.fhir.ProcedureRelatedItem;
import org.hl7.fhir.ProcedureRelationshipType;
import org.hl7.fhir.ProcedureRelationshipTypeList;
import org.hl7.fhir.ProcedureRequest;
import org.hl7.fhir.ProcedureRequestBodySite;
import org.hl7.fhir.ProcedureRequestPriority;
import org.hl7.fhir.ProcedureRequestPriorityList;
import org.hl7.fhir.ProcedureRequestStatus;
import org.hl7.fhir.ProcedureRequestStatusList;
import org.hl7.fhir.ProcedureStatus;
import org.hl7.fhir.ProcedureStatusList;
import org.hl7.fhir.ProcessRequest;
import org.hl7.fhir.ProcessRequestItem;
import org.hl7.fhir.ProcessResponse;
import org.hl7.fhir.ProcessResponseNotes;
import org.hl7.fhir.PropertyRepresentation;
import org.hl7.fhir.PropertyRepresentationList;
import org.hl7.fhir.Provenance;
import org.hl7.fhir.ProvenanceAgent;
import org.hl7.fhir.ProvenanceEntity;
import org.hl7.fhir.ProvenanceEntityRole;
import org.hl7.fhir.ProvenanceEntityRoleList;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.QuantityComparator;
import org.hl7.fhir.QuantityComparatorList;
import org.hl7.fhir.Questionnaire;
import org.hl7.fhir.QuestionnaireAnswers;
import org.hl7.fhir.QuestionnaireAnswersAnswer;
import org.hl7.fhir.QuestionnaireAnswersGroup;
import org.hl7.fhir.QuestionnaireAnswersQuestion;
import org.hl7.fhir.QuestionnaireAnswersStatus;
import org.hl7.fhir.QuestionnaireAnswersStatusList;
import org.hl7.fhir.QuestionnaireGroup;
import org.hl7.fhir.QuestionnaireQuestion;
import org.hl7.fhir.QuestionnaireStatus;
import org.hl7.fhir.QuestionnaireStatusList;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ReferralRequest;
import org.hl7.fhir.ReferralStatus;
import org.hl7.fhir.ReferralStatusList;
import org.hl7.fhir.RelatedPerson;
import org.hl7.fhir.RemittanceOutcome;
import org.hl7.fhir.RemittanceOutcomeList;
import org.hl7.fhir.Resource;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.ResourceType;
import org.hl7.fhir.ResourceTypeList;
import org.hl7.fhir.ResourceVersionPolicy;
import org.hl7.fhir.ResourceVersionPolicyList;
import org.hl7.fhir.ResponseType;
import org.hl7.fhir.ResponseTypeList;
import org.hl7.fhir.RestfulConformanceMode;
import org.hl7.fhir.RestfulConformanceModeList;
import org.hl7.fhir.RiskAssessment;
import org.hl7.fhir.RiskAssessmentPrediction;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.SampledDataDataType;
import org.hl7.fhir.Schedule;
import org.hl7.fhir.SearchEntryMode;
import org.hl7.fhir.SearchEntryModeList;
import org.hl7.fhir.SearchParamType;
import org.hl7.fhir.SearchParamTypeList;
import org.hl7.fhir.SearchParameter;
import org.hl7.fhir.SearchParameterContact;
import org.hl7.fhir.Signature;
import org.hl7.fhir.SlicingRules;
import org.hl7.fhir.SlicingRulesList;
import org.hl7.fhir.Slot;
import org.hl7.fhir.SlotStatus;
import org.hl7.fhir.SlotStatusList;
import org.hl7.fhir.SpecialValues;
import org.hl7.fhir.SpecialValuesList;
import org.hl7.fhir.Specimen;
import org.hl7.fhir.SpecimenCollection;
import org.hl7.fhir.SpecimenContainer;
import org.hl7.fhir.SpecimenTreatment;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureDefinitionContact;
import org.hl7.fhir.StructureDefinitionDifferential;
import org.hl7.fhir.StructureDefinitionMapping;
import org.hl7.fhir.StructureDefinitionSnapshot;
import org.hl7.fhir.StructureDefinitionType;
import org.hl7.fhir.StructureDefinitionTypeList;
import org.hl7.fhir.Subscription;
import org.hl7.fhir.SubscriptionChannel;
import org.hl7.fhir.SubscriptionChannelType;
import org.hl7.fhir.SubscriptionChannelTypeList;
import org.hl7.fhir.SubscriptionStatus;
import org.hl7.fhir.SubscriptionStatusList;
import org.hl7.fhir.Substance;
import org.hl7.fhir.SubstanceIngredient;
import org.hl7.fhir.SubstanceInstance;
import org.hl7.fhir.Supply;
import org.hl7.fhir.SupplyDispense;
import org.hl7.fhir.SupplyDispenseStatus;
import org.hl7.fhir.SupplyDispenseStatusList;
import org.hl7.fhir.SupplyStatus;
import org.hl7.fhir.SupplyStatusList;
import org.hl7.fhir.SystemRestfulInteraction;
import org.hl7.fhir.SystemRestfulInteractionList;
import org.hl7.fhir.Time;
import org.hl7.fhir.Timing;
import org.hl7.fhir.TimingRepeat;
import org.hl7.fhir.TypeRestfulInteraction;
import org.hl7.fhir.TypeRestfulInteractionList;
import org.hl7.fhir.UnitsOfTime;
import org.hl7.fhir.UnitsOfTimeList;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;
import org.hl7.fhir.Use;
import org.hl7.fhir.UseList;
import org.hl7.fhir.Uuid;
import org.hl7.fhir.ValueSet;
import org.hl7.fhir.ValueSetCompose;
import org.hl7.fhir.ValueSetConcept;
import org.hl7.fhir.ValueSetConcept1;
import org.hl7.fhir.ValueSetContact;
import org.hl7.fhir.ValueSetContains;
import org.hl7.fhir.ValueSetDefine;
import org.hl7.fhir.ValueSetDesignation;
import org.hl7.fhir.ValueSetExpansion;
import org.hl7.fhir.ValueSetFilter;
import org.hl7.fhir.ValueSetInclude;
import org.hl7.fhir.ValueSetParameter;
import org.hl7.fhir.VisionBase;
import org.hl7.fhir.VisionBaseList;
import org.hl7.fhir.VisionEyes;
import org.hl7.fhir.VisionEyesList;
import org.hl7.fhir.VisionPrescription;
import org.hl7.fhir.VisionPrescriptionDispense;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FhirFactoryImpl extends EFactoryImpl implements FhirFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FhirFactory init() {
		try {
			FhirFactory theFhirFactory = (FhirFactory)EPackage.Registry.INSTANCE.getEFactory(FhirPackage.eNS_URI);
			if (theFhirFactory != null) {
				return theFhirFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FhirFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FhirPackage.ACTION_LIST: return createActionList();
			case FhirPackage.ADDRESS: return createAddress();
			case FhirPackage.ADDRESS_USE: return createAddressUse();
			case FhirPackage.ADMINISTRATIVE_GENDER: return createAdministrativeGender();
			case FhirPackage.AGE: return createAge();
			case FhirPackage.AGGREGATION_MODE: return createAggregationMode();
			case FhirPackage.ALLERGY_INTOLERANCE: return createAllergyIntolerance();
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY: return createAllergyIntoleranceCategory();
			case FhirPackage.ALLERGY_INTOLERANCE_CERTAINTY: return createAllergyIntoleranceCertainty();
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY: return createAllergyIntoleranceCriticality();
			case FhirPackage.ALLERGY_INTOLERANCE_EVENT: return createAllergyIntoleranceEvent();
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY: return createAllergyIntoleranceSeverity();
			case FhirPackage.ALLERGY_INTOLERANCE_STATUS: return createAllergyIntoleranceStatus();
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE: return createAllergyIntoleranceType();
			case FhirPackage.ANSWER_FORMAT: return createAnswerFormat();
			case FhirPackage.APPOINTMENT: return createAppointment();
			case FhirPackage.APPOINTMENT_PARTICIPANT: return createAppointmentParticipant();
			case FhirPackage.APPOINTMENT_RESPONSE: return createAppointmentResponse();
			case FhirPackage.APPOINTMENT_STATUS: return createAppointmentStatus();
			case FhirPackage.ATTACHMENT: return createAttachment();
			case FhirPackage.AUDIT_EVENT: return createAuditEvent();
			case FhirPackage.AUDIT_EVENT_ACTION: return createAuditEventAction();
			case FhirPackage.AUDIT_EVENT_DETAIL: return createAuditEventDetail();
			case FhirPackage.AUDIT_EVENT_EVENT: return createAuditEventEvent();
			case FhirPackage.AUDIT_EVENT_NETWORK: return createAuditEventNetwork();
			case FhirPackage.AUDIT_EVENT_OBJECT: return createAuditEventObject();
			case FhirPackage.AUDIT_EVENT_OBJECT_LIFECYCLE: return createAuditEventObjectLifecycle();
			case FhirPackage.AUDIT_EVENT_OBJECT_ROLE: return createAuditEventObjectRole();
			case FhirPackage.AUDIT_EVENT_OBJECT_TYPE: return createAuditEventObjectType();
			case FhirPackage.AUDIT_EVENT_OUTCOME: return createAuditEventOutcome();
			case FhirPackage.AUDIT_EVENT_PARTICIPANT: return createAuditEventParticipant();
			case FhirPackage.AUDIT_EVENT_PARTICIPANT_NETWORK_TYPE: return createAuditEventParticipantNetworkType();
			case FhirPackage.AUDIT_EVENT_SOURCE: return createAuditEventSource();
			case FhirPackage.BACKBONE_ELEMENT: return createBackboneElement();
			case FhirPackage.BASE64_BINARY: return createBase64Binary();
			case FhirPackage.BASIC: return createBasic();
			case FhirPackage.BINARY: return createBinary();
			case FhirPackage.BINDING_STRENGTH: return createBindingStrength();
			case FhirPackage.BODY_SITE: return createBodySite();
			case FhirPackage.BOOLEAN: return createBoolean();
			case FhirPackage.BUNDLE: return createBundle();
			case FhirPackage.BUNDLE_ENTRY: return createBundleEntry();
			case FhirPackage.BUNDLE_LINK: return createBundleLink();
			case FhirPackage.BUNDLE_SEARCH: return createBundleSearch();
			case FhirPackage.BUNDLE_TRANSACTION: return createBundleTransaction();
			case FhirPackage.BUNDLE_TRANSACTION_RESPONSE: return createBundleTransactionResponse();
			case FhirPackage.BUNDLE_TYPE: return createBundleType();
			case FhirPackage.CARE_PLAN: return createCarePlan();
			case FhirPackage.CARE_PLAN_ACTIVITY: return createCarePlanActivity();
			case FhirPackage.CARE_PLAN_ACTIVITY_CATEGORY: return createCarePlanActivityCategory();
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS: return createCarePlanActivityStatus();
			case FhirPackage.CARE_PLAN_DETAIL: return createCarePlanDetail();
			case FhirPackage.CARE_PLAN_PARTICIPANT: return createCarePlanParticipant();
			case FhirPackage.CARE_PLAN_STATUS: return createCarePlanStatus();
			case FhirPackage.CLAIM: return createClaim();
			case FhirPackage.CLAIM_COVERAGE: return createClaimCoverage();
			case FhirPackage.CLAIM_DETAIL: return createClaimDetail();
			case FhirPackage.CLAIM_DIAGNOSIS: return createClaimDiagnosis();
			case FhirPackage.CLAIM_ITEM: return createClaimItem();
			case FhirPackage.CLAIM_MISSING_TEETH: return createClaimMissingTeeth();
			case FhirPackage.CLAIM_PAYEE: return createClaimPayee();
			case FhirPackage.CLAIM_PROSTHESIS: return createClaimProsthesis();
			case FhirPackage.CLAIM_RESPONSE: return createClaimResponse();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM: return createClaimResponseAddItem();
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION: return createClaimResponseAdjudication();
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION1: return createClaimResponseAdjudication1();
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION2: return createClaimResponseAdjudication2();
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION3: return createClaimResponseAdjudication3();
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION4: return createClaimResponseAdjudication4();
			case FhirPackage.CLAIM_RESPONSE_COVERAGE: return createClaimResponseCoverage();
			case FhirPackage.CLAIM_RESPONSE_DETAIL: return createClaimResponseDetail();
			case FhirPackage.CLAIM_RESPONSE_DETAIL1: return createClaimResponseDetail1();
			case FhirPackage.CLAIM_RESPONSE_ERROR: return createClaimResponseError();
			case FhirPackage.CLAIM_RESPONSE_ITEM: return createClaimResponseItem();
			case FhirPackage.CLAIM_RESPONSE_NOTE: return createClaimResponseNote();
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL: return createClaimResponseSubDetail();
			case FhirPackage.CLAIM_SUB_DETAIL: return createClaimSubDetail();
			case FhirPackage.CLAIM_TYPE: return createClaimType();
			case FhirPackage.CLINICAL_BASE_GENDER: return createClinicalBaseGender();
			case FhirPackage.CLINICAL_IMPRESSION: return createClinicalImpression();
			case FhirPackage.CLINICAL_IMPRESSION_FINDING: return createClinicalImpressionFinding();
			case FhirPackage.CLINICAL_IMPRESSION_INVESTIGATIONS: return createClinicalImpressionInvestigations();
			case FhirPackage.CLINICAL_IMPRESSION_RULED_OUT: return createClinicalImpressionRuledOut();
			case FhirPackage.CLINICAL_IMPRESSION_STATUS: return createClinicalImpressionStatus();
			case FhirPackage.CODE: return createCode();
			case FhirPackage.CODEABLE_CONCEPT: return createCodeableConcept();
			case FhirPackage.CODING: return createCoding();
			case FhirPackage.COMMUNICATION: return createCommunication();
			case FhirPackage.COMMUNICATION_PAYLOAD: return createCommunicationPayload();
			case FhirPackage.COMMUNICATION_REQUEST: return createCommunicationRequest();
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD: return createCommunicationRequestPayload();
			case FhirPackage.COMMUNICATION_REQUEST_STATUS: return createCommunicationRequestStatus();
			case FhirPackage.COMMUNICATION_STATUS: return createCommunicationStatus();
			case FhirPackage.COMPOSITION: return createComposition();
			case FhirPackage.COMPOSITION_ATTESTATION_MODE: return createCompositionAttestationMode();
			case FhirPackage.COMPOSITION_ATTESTER: return createCompositionAttester();
			case FhirPackage.COMPOSITION_EVENT: return createCompositionEvent();
			case FhirPackage.COMPOSITION_SECTION: return createCompositionSection();
			case FhirPackage.COMPOSITION_STATUS: return createCompositionStatus();
			case FhirPackage.CONCEPT_MAP: return createConceptMap();
			case FhirPackage.CONCEPT_MAP_CONTACT: return createConceptMapContact();
			case FhirPackage.CONCEPT_MAP_DEPENDS_ON: return createConceptMapDependsOn();
			case FhirPackage.CONCEPT_MAP_ELEMENT: return createConceptMapElement();
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE: return createConceptMapEquivalence();
			case FhirPackage.CONCEPT_MAP_MAP: return createConceptMapMap();
			case FhirPackage.CONDITION: return createCondition();
			case FhirPackage.CONDITION_CLINICAL_STATUS: return createConditionClinicalStatus();
			case FhirPackage.CONDITION_DUE_TO: return createConditionDueTo();
			case FhirPackage.CONDITION_EVIDENCE: return createConditionEvidence();
			case FhirPackage.CONDITION_LOCATION: return createConditionLocation();
			case FhirPackage.CONDITION_OCCURRED_FOLLOWING: return createConditionOccurredFollowing();
			case FhirPackage.CONDITION_STAGE: return createConditionStage();
			case FhirPackage.CONFORMANCE: return createConformance();
			case FhirPackage.CONFORMANCE_CERTIFICATE: return createConformanceCertificate();
			case FhirPackage.CONFORMANCE_CONTACT: return createConformanceContact();
			case FhirPackage.CONFORMANCE_DOCUMENT: return createConformanceDocument();
			case FhirPackage.CONFORMANCE_EVENT: return createConformanceEvent();
			case FhirPackage.CONFORMANCE_EVENT_MODE: return createConformanceEventMode();
			case FhirPackage.CONFORMANCE_IMPLEMENTATION: return createConformanceImplementation();
			case FhirPackage.CONFORMANCE_INTERACTION: return createConformanceInteraction();
			case FhirPackage.CONFORMANCE_INTERACTION1: return createConformanceInteraction1();
			case FhirPackage.CONFORMANCE_MESSAGING: return createConformanceMessaging();
			case FhirPackage.CONFORMANCE_OPERATION: return createConformanceOperation();
			case FhirPackage.CONFORMANCE_RESOURCE: return createConformanceResource();
			case FhirPackage.CONFORMANCE_RESOURCE_STATUS: return createConformanceResourceStatus();
			case FhirPackage.CONFORMANCE_REST: return createConformanceRest();
			case FhirPackage.CONFORMANCE_SEARCH_PARAM: return createConformanceSearchParam();
			case FhirPackage.CONFORMANCE_SECURITY: return createConformanceSecurity();
			case FhirPackage.CONFORMANCE_SOFTWARE: return createConformanceSoftware();
			case FhirPackage.CONFORMANCE_USE_CONTEXT: return createConformanceUseContext();
			case FhirPackage.CONSTRAINT_SEVERITY: return createConstraintSeverity();
			case FhirPackage.CONTACT_POINT: return createContactPoint();
			case FhirPackage.CONTACT_POINT_SYSTEM: return createContactPointSystem();
			case FhirPackage.CONTACT_POINT_USE: return createContactPointUse();
			case FhirPackage.CONTRACT: return createContract();
			case FhirPackage.CONTRACT_ACTOR: return createContractActor();
			case FhirPackage.CONTRACT_ACTOR1: return createContractActor1();
			case FhirPackage.CONTRACT_FRIENDLY: return createContractFriendly();
			case FhirPackage.CONTRACT_LEGAL: return createContractLegal();
			case FhirPackage.CONTRACT_RULE: return createContractRule();
			case FhirPackage.CONTRACT_SIGNER: return createContractSigner();
			case FhirPackage.CONTRACT_TERM: return createContractTerm();
			case FhirPackage.CONTRACT_VALUED_ITEM: return createContractValuedItem();
			case FhirPackage.CONTRACT_VALUED_ITEM1: return createContractValuedItem1();
			case FhirPackage.CONTRAINDICATION: return createContraindication();
			case FhirPackage.CONTRAINDICATION_MITIGATION: return createContraindicationMitigation();
			case FhirPackage.COUNT: return createCount();
			case FhirPackage.COVERAGE: return createCoverage();
			case FhirPackage.DATA_ABSENT_REASON: return createDataAbsentReason();
			case FhirPackage.DATA_ELEMENT: return createDataElement();
			case FhirPackage.DATA_ELEMENT_CONTACT: return createDataElementContact();
			case FhirPackage.DATA_ELEMENT_MAPPING: return createDataElementMapping();
			case FhirPackage.DATA_ELEMENT_SPECIFICITY: return createDataElementSpecificity();
			case FhirPackage.DATA_TYPE: return createDataType();
			case FhirPackage.DATE: return createDate();
			case FhirPackage.DATE_TIME: return createDateTime();
			case FhirPackage.DAYS_OF_WEEK: return createDaysOfWeek();
			case FhirPackage.DECIMAL: return createDecimal();
			case FhirPackage.DEVICE: return createDevice();
			case FhirPackage.DEVICE_COMPONENT: return createDeviceComponent();
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION: return createDeviceComponentProductionSpecification();
			case FhirPackage.DEVICE_METRIC: return createDeviceMetric();
			case FhirPackage.DEVICE_METRIC_CALIBRATION: return createDeviceMetricCalibration();
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE: return createDeviceMetricCalibrationState();
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE: return createDeviceMetricCalibrationType();
			case FhirPackage.DEVICE_METRIC_CATEGORY: return createDeviceMetricCategory();
			case FhirPackage.DEVICE_METRIC_COLOR: return createDeviceMetricColor();
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS: return createDeviceMetricOperationalStatus();
			case FhirPackage.DEVICE_STATUS: return createDeviceStatus();
			case FhirPackage.DEVICE_USE_REQUEST: return createDeviceUseRequest();
			case FhirPackage.DEVICE_USE_REQUEST_PRIORITY: return createDeviceUseRequestPriority();
			case FhirPackage.DEVICE_USE_REQUEST_STATUS: return createDeviceUseRequestStatus();
			case FhirPackage.DEVICE_USE_STATEMENT: return createDeviceUseStatement();
			case FhirPackage.DIAGNOSTIC_ORDER: return createDiagnosticOrder();
			case FhirPackage.DIAGNOSTIC_ORDER_EVENT: return createDiagnosticOrderEvent();
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM: return createDiagnosticOrderItem();
			case FhirPackage.DIAGNOSTIC_ORDER_PRIORITY: return createDiagnosticOrderPriority();
			case FhirPackage.DIAGNOSTIC_ORDER_STATUS: return createDiagnosticOrderStatus();
			case FhirPackage.DIAGNOSTIC_REPORT: return createDiagnosticReport();
			case FhirPackage.DIAGNOSTIC_REPORT_IMAGE: return createDiagnosticReportImage();
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS: return createDiagnosticReportStatus();
			case FhirPackage.DIGITAL_MEDIA_TYPE: return createDigitalMediaType();
			case FhirPackage.DISTANCE: return createDistance();
			case FhirPackage.DOCUMENT_MANIFEST: return createDocumentManifest();
			case FhirPackage.DOCUMENT_MANIFEST_CONTENT: return createDocumentManifestContent();
			case FhirPackage.DOCUMENT_MANIFEST_RELATED: return createDocumentManifestRelated();
			case FhirPackage.DOCUMENT_MODE: return createDocumentMode();
			case FhirPackage.DOCUMENT_REFERENCE: return createDocumentReference();
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT: return createDocumentReferenceContext();
			case FhirPackage.DOCUMENT_REFERENCE_RELATED: return createDocumentReferenceRelated();
			case FhirPackage.DOCUMENT_REFERENCE_RELATES_TO: return createDocumentReferenceRelatesTo();
			case FhirPackage.DOCUMENT_REFERENCE_STATUS: return createDocumentReferenceStatus();
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE: return createDocumentRelationshipType();
			case FhirPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case FhirPackage.DOMAIN_RESOURCE: return createDomainResource();
			case FhirPackage.DURATION: return createDuration();
			case FhirPackage.ELEMENT: return createElement();
			case FhirPackage.ELEMENT_DEFINITION: return createElementDefinition();
			case FhirPackage.ELEMENT_DEFINITION_BINDING: return createElementDefinitionBinding();
			case FhirPackage.ELEMENT_DEFINITION_CONSTRAINT: return createElementDefinitionConstraint();
			case FhirPackage.ELEMENT_DEFINITION_MAPPING: return createElementDefinitionMapping();
			case FhirPackage.ELEMENT_DEFINITION_SLICING: return createElementDefinitionSlicing();
			case FhirPackage.ELEMENT_DEFINITION_TYPE: return createElementDefinitionType();
			case FhirPackage.ELIGIBILITY_REQUEST: return createEligibilityRequest();
			case FhirPackage.ELIGIBILITY_RESPONSE: return createEligibilityResponse();
			case FhirPackage.ENCOUNTER: return createEncounter();
			case FhirPackage.ENCOUNTER_CLASS: return createEncounterClass();
			case FhirPackage.ENCOUNTER_HOSPITALIZATION: return createEncounterHospitalization();
			case FhirPackage.ENCOUNTER_LOCATION: return createEncounterLocation();
			case FhirPackage.ENCOUNTER_LOCATION_STATUS: return createEncounterLocationStatus();
			case FhirPackage.ENCOUNTER_PARTICIPANT: return createEncounterParticipant();
			case FhirPackage.ENCOUNTER_STATE: return createEncounterState();
			case FhirPackage.ENCOUNTER_STATUS_HISTORY: return createEncounterStatusHistory();
			case FhirPackage.ENROLLMENT_REQUEST: return createEnrollmentRequest();
			case FhirPackage.ENROLLMENT_RESPONSE: return createEnrollmentResponse();
			case FhirPackage.EPISODE_OF_CARE: return createEpisodeOfCare();
			case FhirPackage.EPISODE_OF_CARE_CARE_TEAM: return createEpisodeOfCareCareTeam();
			case FhirPackage.EPISODE_OF_CARE_STATUS: return createEpisodeOfCareStatus();
			case FhirPackage.EPISODE_OF_CARE_STATUS_HISTORY: return createEpisodeOfCareStatusHistory();
			case FhirPackage.EVENT_TIMING: return createEventTiming();
			case FhirPackage.EXPLANATION_OF_BENEFIT: return createExplanationOfBenefit();
			case FhirPackage.EXTENSION: return createExtension();
			case FhirPackage.EXTENSION_CONTEXT: return createExtensionContext();
			case FhirPackage.FAMILY_MEMBER_HISTORY: return createFamilyMemberHistory();
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION: return createFamilyMemberHistoryCondition();
			case FhirPackage.FHIR_DEFINED_TYPE: return createFHIRDefinedType();
			case FhirPackage.FILTER_OPERATOR: return createFilterOperator();
			case FhirPackage.FLAG: return createFlag();
			case FhirPackage.FLAG_STATUS: return createFlagStatus();
			case FhirPackage.GOAL: return createGoal();
			case FhirPackage.GOAL_OUTCOME: return createGoalOutcome();
			case FhirPackage.GOAL_STATUS: return createGoalStatus();
			case FhirPackage.GROUP: return createGroup();
			case FhirPackage.GROUP_CHARACTERISTIC: return createGroupCharacteristic();
			case FhirPackage.GROUP_TYPE: return createGroupType();
			case FhirPackage.HEALTHCARE_SERVICE: return createHealthcareService();
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME: return createHealthcareServiceAvailableTime();
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE: return createHealthcareServiceNotAvailable();
			case FhirPackage.HEALTHCARE_SERVICE_SERVICE_TYPE: return createHealthcareServiceServiceType();
			case FhirPackage.HTTP_VERB: return createHTTPVerb();
			case FhirPackage.HUMAN_NAME: return createHumanName();
			case FhirPackage.ID: return createId();
			case FhirPackage.IDENTIFIER: return createIdentifier();
			case FhirPackage.IDENTIFIER_USE: return createIdentifierUse();
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL: return createIdentityAssuranceLevel();
			case FhirPackage.IMAGING_MODALITY: return createImagingModality();
			case FhirPackage.IMAGING_OBJECT_SELECTION: return createImagingObjectSelection();
			case FhirPackage.IMAGING_OBJECT_SELECTION_FRAMES: return createImagingObjectSelectionFrames();
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE: return createImagingObjectSelectionInstance();
			case FhirPackage.IMAGING_OBJECT_SELECTION_SERIES: return createImagingObjectSelectionSeries();
			case FhirPackage.IMAGING_OBJECT_SELECTION_STUDY: return createImagingObjectSelectionStudy();
			case FhirPackage.IMAGING_STUDY: return createImagingStudy();
			case FhirPackage.IMAGING_STUDY_INSTANCE: return createImagingStudyInstance();
			case FhirPackage.IMAGING_STUDY_SERIES: return createImagingStudySeries();
			case FhirPackage.IMMUNIZATION: return createImmunization();
			case FhirPackage.IMMUNIZATION_EXPLANATION: return createImmunizationExplanation();
			case FhirPackage.IMMUNIZATION_REACTION: return createImmunizationReaction();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION: return createImmunizationRecommendation();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION: return createImmunizationRecommendationDateCriterion();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL: return createImmunizationRecommendationProtocol();
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION: return createImmunizationRecommendationRecommendation();
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL: return createImmunizationVaccinationProtocol();
			case FhirPackage.INSTANCE_AVAILABILITY: return createInstanceAvailability();
			case FhirPackage.INSTANT: return createInstant();
			case FhirPackage.INTEGER: return createInteger();
			case FhirPackage.ISSUE_SEVERITY: return createIssueSeverity();
			case FhirPackage.LINK_TYPE: return createLinkType();
			case FhirPackage.LIST: return createList();
			case FhirPackage.LIST_ENTRY: return createListEntry();
			case FhirPackage.LIST_MODE: return createListMode();
			case FhirPackage.LIST_STATUS: return createListStatus();
			case FhirPackage.LOCATION: return createLocation();
			case FhirPackage.LOCATION_MODE: return createLocationMode();
			case FhirPackage.LOCATION_POSITION: return createLocationPosition();
			case FhirPackage.LOCATION_STATUS: return createLocationStatus();
			case FhirPackage.MARITAL_STATUS: return createMaritalStatus();
			case FhirPackage.MEASMNT_PRINCIPLE: return createMeasmntPrinciple();
			case FhirPackage.MEDIA: return createMedia();
			case FhirPackage.MEDICATION: return createMedication();
			case FhirPackage.MEDICATION_ADMINISTRATION: return createMedicationAdministration();
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE: return createMedicationAdministrationDosage();
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS: return createMedicationAdministrationStatus();
			case FhirPackage.MEDICATION_BATCH: return createMedicationBatch();
			case FhirPackage.MEDICATION_CONTENT: return createMedicationContent();
			case FhirPackage.MEDICATION_DISPENSE: return createMedicationDispense();
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION: return createMedicationDispenseDosageInstruction();
			case FhirPackage.MEDICATION_DISPENSE_STATUS: return createMedicationDispenseStatus();
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION: return createMedicationDispenseSubstitution();
			case FhirPackage.MEDICATION_INGREDIENT: return createMedicationIngredient();
			case FhirPackage.MEDICATION_KIND: return createMedicationKind();
			case FhirPackage.MEDICATION_PACKAGE: return createMedicationPackage();
			case FhirPackage.MEDICATION_PRESCRIPTION: return createMedicationPrescription();
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE: return createMedicationPrescriptionDispense();
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION: return createMedicationPrescriptionDosageInstruction();
			case FhirPackage.MEDICATION_PRESCRIPTION_STATUS: return createMedicationPrescriptionStatus();
			case FhirPackage.MEDICATION_PRESCRIPTION_SUBSTITUTION: return createMedicationPrescriptionSubstitution();
			case FhirPackage.MEDICATION_PRODUCT: return createMedicationProduct();
			case FhirPackage.MEDICATION_STATEMENT: return createMedicationStatement();
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE: return createMedicationStatementDosage();
			case FhirPackage.MEDICATION_STATEMENT_STATUS: return createMedicationStatementStatus();
			case FhirPackage.MESSAGE_EVENT: return createMessageEvent();
			case FhirPackage.MESSAGE_HEADER: return createMessageHeader();
			case FhirPackage.MESSAGE_HEADER_DESTINATION: return createMessageHeaderDestination();
			case FhirPackage.MESSAGE_HEADER_RESPONSE: return createMessageHeaderResponse();
			case FhirPackage.MESSAGE_HEADER_SOURCE: return createMessageHeaderSource();
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY: return createMessageSignificanceCategory();
			case FhirPackage.META: return createMeta();
			case FhirPackage.MODALITY: return createModality();
			case FhirPackage.MONEY: return createMoney();
			case FhirPackage.NAME_USE: return createNameUse();
			case FhirPackage.NAMING_SYSTEM: return createNamingSystem();
			case FhirPackage.NAMING_SYSTEM_CONTACT: return createNamingSystemContact();
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE: return createNamingSystemIdentifierType();
			case FhirPackage.NAMING_SYSTEM_TYPE: return createNamingSystemType();
			case FhirPackage.NAMING_SYSTEM_UNIQUE_ID: return createNamingSystemUniqueId();
			case FhirPackage.NARRATIVE: return createNarrative();
			case FhirPackage.NARRATIVE_STATUS: return createNarrativeStatus();
			case FhirPackage.NOTE_TYPE: return createNoteType();
			case FhirPackage.NUTRITION_ORDER: return createNutritionOrder();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA: return createNutritionOrderEnteralFormula();
			case FhirPackage.NUTRITION_ORDER_NUTRIENT: return createNutritionOrderNutrient();
			case FhirPackage.NUTRITION_ORDER_ORAL_DIET: return createNutritionOrderOralDiet();
			case FhirPackage.NUTRITION_ORDER_STATUS: return createNutritionOrderStatus();
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT: return createNutritionOrderSupplement();
			case FhirPackage.NUTRITION_ORDER_TEXTURE: return createNutritionOrderTexture();
			case FhirPackage.OBSERVATION: return createObservation();
			case FhirPackage.OBSERVATION_REFERENCE_RANGE: return createObservationReferenceRange();
			case FhirPackage.OBSERVATION_RELATED: return createObservationRelated();
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE: return createObservationRelationshipType();
			case FhirPackage.OBSERVATION_RELIABILITY: return createObservationReliability();
			case FhirPackage.OBSERVATION_STATUS: return createObservationStatus();
			case FhirPackage.OID: return createOid();
			case FhirPackage.OPERATION_DEFINITION: return createOperationDefinition();
			case FhirPackage.OPERATION_DEFINITION_CONTACT: return createOperationDefinitionContact();
			case FhirPackage.OPERATION_DEFINITION_PARAMETER: return createOperationDefinitionParameter();
			case FhirPackage.OPERATION_DEFINITION_PART: return createOperationDefinitionPart();
			case FhirPackage.OPERATION_KIND: return createOperationKind();
			case FhirPackage.OPERATION_OUTCOME: return createOperationOutcome();
			case FhirPackage.OPERATION_OUTCOME_ISSUE: return createOperationOutcomeIssue();
			case FhirPackage.OPERATION_PARAMETER_USE: return createOperationParameterUse();
			case FhirPackage.ORDER: return createOrder();
			case FhirPackage.ORDER_RESPONSE: return createOrderResponse();
			case FhirPackage.ORDER_STATUS: return createOrderStatus();
			case FhirPackage.ORDER_WHEN: return createOrderWhen();
			case FhirPackage.ORGANIZATION: return createOrganization();
			case FhirPackage.ORGANIZATION_CONTACT: return createOrganizationContact();
			case FhirPackage.PARAMETERS: return createParameters();
			case FhirPackage.PARAMETERS_PARAMETER: return createParametersParameter();
			case FhirPackage.PARAMETERS_PART: return createParametersPart();
			case FhirPackage.PARTICIPANT_REQUIRED: return createParticipantRequired();
			case FhirPackage.PARTICIPANT_STATUS: return createParticipantStatus();
			case FhirPackage.PARTICIPATION_STATUS: return createParticipationStatus();
			case FhirPackage.PATIENT: return createPatient();
			case FhirPackage.PATIENT_ANIMAL: return createPatientAnimal();
			case FhirPackage.PATIENT_COMMUNICATION: return createPatientCommunication();
			case FhirPackage.PATIENT_CONTACT: return createPatientContact();
			case FhirPackage.PATIENT_LINK: return createPatientLink();
			case FhirPackage.PAYMENT_NOTICE: return createPaymentNotice();
			case FhirPackage.PAYMENT_RECONCILIATION: return createPaymentReconciliation();
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL: return createPaymentReconciliationDetail();
			case FhirPackage.PAYMENT_RECONCILIATION_NOTE: return createPaymentReconciliationNote();
			case FhirPackage.PERIOD: return createPeriod();
			case FhirPackage.PERSON: return createPerson();
			case FhirPackage.PERSON_LINK: return createPersonLink();
			case FhirPackage.POSITIVE_INT: return createPositiveInt();
			case FhirPackage.PRACTITIONER: return createPractitioner();
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE: return createPractitionerPractitionerRole();
			case FhirPackage.PRACTITIONER_QUALIFICATION: return createPractitionerQualification();
			case FhirPackage.PROCEDURE: return createProcedure();
			case FhirPackage.PROCEDURE_BODY_SITE: return createProcedureBodySite();
			case FhirPackage.PROCEDURE_DEVICE: return createProcedureDevice();
			case FhirPackage.PROCEDURE_PERFORMER: return createProcedurePerformer();
			case FhirPackage.PROCEDURE_RELATED_ITEM: return createProcedureRelatedItem();
			case FhirPackage.PROCEDURE_RELATIONSHIP_TYPE: return createProcedureRelationshipType();
			case FhirPackage.PROCEDURE_REQUEST: return createProcedureRequest();
			case FhirPackage.PROCEDURE_REQUEST_BODY_SITE: return createProcedureRequestBodySite();
			case FhirPackage.PROCEDURE_REQUEST_PRIORITY: return createProcedureRequestPriority();
			case FhirPackage.PROCEDURE_REQUEST_STATUS: return createProcedureRequestStatus();
			case FhirPackage.PROCEDURE_STATUS: return createProcedureStatus();
			case FhirPackage.PROCESS_REQUEST: return createProcessRequest();
			case FhirPackage.PROCESS_REQUEST_ITEM: return createProcessRequestItem();
			case FhirPackage.PROCESS_RESPONSE: return createProcessResponse();
			case FhirPackage.PROCESS_RESPONSE_NOTES: return createProcessResponseNotes();
			case FhirPackage.PROPERTY_REPRESENTATION: return createPropertyRepresentation();
			case FhirPackage.PROVENANCE: return createProvenance();
			case FhirPackage.PROVENANCE_AGENT: return createProvenanceAgent();
			case FhirPackage.PROVENANCE_ENTITY: return createProvenanceEntity();
			case FhirPackage.PROVENANCE_ENTITY_ROLE: return createProvenanceEntityRole();
			case FhirPackage.QUANTITY: return createQuantity();
			case FhirPackage.QUANTITY_COMPARATOR: return createQuantityComparator();
			case FhirPackage.QUESTIONNAIRE: return createQuestionnaire();
			case FhirPackage.QUESTIONNAIRE_ANSWERS: return createQuestionnaireAnswers();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER: return createQuestionnaireAnswersAnswer();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_GROUP: return createQuestionnaireAnswersGroup();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION: return createQuestionnaireAnswersQuestion();
			case FhirPackage.QUESTIONNAIRE_ANSWERS_STATUS: return createQuestionnaireAnswersStatus();
			case FhirPackage.QUESTIONNAIRE_GROUP: return createQuestionnaireGroup();
			case FhirPackage.QUESTIONNAIRE_QUESTION: return createQuestionnaireQuestion();
			case FhirPackage.QUESTIONNAIRE_STATUS: return createQuestionnaireStatus();
			case FhirPackage.RANGE: return createRange();
			case FhirPackage.RATIO: return createRatio();
			case FhirPackage.REFERENCE: return createReference();
			case FhirPackage.REFERRAL_REQUEST: return createReferralRequest();
			case FhirPackage.REFERRAL_STATUS: return createReferralStatus();
			case FhirPackage.RELATED_PERSON: return createRelatedPerson();
			case FhirPackage.REMITTANCE_OUTCOME: return createRemittanceOutcome();
			case FhirPackage.RESOURCE: return createResource();
			case FhirPackage.RESOURCE_CONTAINER: return createResourceContainer();
			case FhirPackage.RESOURCE_TYPE: return createResourceType();
			case FhirPackage.RESOURCE_VERSION_POLICY: return createResourceVersionPolicy();
			case FhirPackage.RESPONSE_TYPE: return createResponseType();
			case FhirPackage.RESTFUL_CONFORMANCE_MODE: return createRestfulConformanceMode();
			case FhirPackage.RISK_ASSESSMENT: return createRiskAssessment();
			case FhirPackage.RISK_ASSESSMENT_PREDICTION: return createRiskAssessmentPrediction();
			case FhirPackage.SAMPLED_DATA: return createSampledData();
			case FhirPackage.SAMPLED_DATA_DATA_TYPE: return createSampledDataDataType();
			case FhirPackage.SCHEDULE: return createSchedule();
			case FhirPackage.SEARCH_ENTRY_MODE: return createSearchEntryMode();
			case FhirPackage.SEARCH_PARAMETER: return createSearchParameter();
			case FhirPackage.SEARCH_PARAMETER_CONTACT: return createSearchParameterContact();
			case FhirPackage.SEARCH_PARAM_TYPE: return createSearchParamType();
			case FhirPackage.SIGNATURE: return createSignature();
			case FhirPackage.SLICING_RULES: return createSlicingRules();
			case FhirPackage.SLOT: return createSlot();
			case FhirPackage.SLOT_STATUS: return createSlotStatus();
			case FhirPackage.SPECIAL_VALUES: return createSpecialValues();
			case FhirPackage.SPECIMEN: return createSpecimen();
			case FhirPackage.SPECIMEN_COLLECTION: return createSpecimenCollection();
			case FhirPackage.SPECIMEN_CONTAINER: return createSpecimenContainer();
			case FhirPackage.SPECIMEN_TREATMENT: return createSpecimenTreatment();
			case FhirPackage.STRING: return createString();
			case FhirPackage.STRUCTURE_DEFINITION: return createStructureDefinition();
			case FhirPackage.STRUCTURE_DEFINITION_CONTACT: return createStructureDefinitionContact();
			case FhirPackage.STRUCTURE_DEFINITION_DIFFERENTIAL: return createStructureDefinitionDifferential();
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING: return createStructureDefinitionMapping();
			case FhirPackage.STRUCTURE_DEFINITION_SNAPSHOT: return createStructureDefinitionSnapshot();
			case FhirPackage.STRUCTURE_DEFINITION_TYPE: return createStructureDefinitionType();
			case FhirPackage.SUBSCRIPTION: return createSubscription();
			case FhirPackage.SUBSCRIPTION_CHANNEL: return createSubscriptionChannel();
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE: return createSubscriptionChannelType();
			case FhirPackage.SUBSCRIPTION_STATUS: return createSubscriptionStatus();
			case FhirPackage.SUBSTANCE: return createSubstance();
			case FhirPackage.SUBSTANCE_INGREDIENT: return createSubstanceIngredient();
			case FhirPackage.SUBSTANCE_INSTANCE: return createSubstanceInstance();
			case FhirPackage.SUPPLY: return createSupply();
			case FhirPackage.SUPPLY_DISPENSE: return createSupplyDispense();
			case FhirPackage.SUPPLY_DISPENSE_STATUS: return createSupplyDispenseStatus();
			case FhirPackage.SUPPLY_STATUS: return createSupplyStatus();
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION: return createSystemRestfulInteraction();
			case FhirPackage.TIME: return createTime();
			case FhirPackage.TIMING: return createTiming();
			case FhirPackage.TIMING_REPEAT: return createTimingRepeat();
			case FhirPackage.TYPE_RESTFUL_INTERACTION: return createTypeRestfulInteraction();
			case FhirPackage.UNITS_OF_TIME: return createUnitsOfTime();
			case FhirPackage.UNSIGNED_INT: return createUnsignedInt();
			case FhirPackage.URI: return createUri();
			case FhirPackage.USE: return createUse();
			case FhirPackage.UUID: return createUuid();
			case FhirPackage.VALUE_SET: return createValueSet();
			case FhirPackage.VALUE_SET_COMPOSE: return createValueSetCompose();
			case FhirPackage.VALUE_SET_CONCEPT: return createValueSetConcept();
			case FhirPackage.VALUE_SET_CONCEPT1: return createValueSetConcept1();
			case FhirPackage.VALUE_SET_CONTACT: return createValueSetContact();
			case FhirPackage.VALUE_SET_CONTAINS: return createValueSetContains();
			case FhirPackage.VALUE_SET_DEFINE: return createValueSetDefine();
			case FhirPackage.VALUE_SET_DESIGNATION: return createValueSetDesignation();
			case FhirPackage.VALUE_SET_EXPANSION: return createValueSetExpansion();
			case FhirPackage.VALUE_SET_FILTER: return createValueSetFilter();
			case FhirPackage.VALUE_SET_INCLUDE: return createValueSetInclude();
			case FhirPackage.VALUE_SET_PARAMETER: return createValueSetParameter();
			case FhirPackage.VISION_BASE: return createVisionBase();
			case FhirPackage.VISION_EYES: return createVisionEyes();
			case FhirPackage.VISION_PRESCRIPTION: return createVisionPrescription();
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE: return createVisionPrescriptionDispense();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FhirPackage.ACTION_LIST_LIST:
				return createActionListListFromString(eDataType, initialValue);
			case FhirPackage.ADDRESS_USE_LIST:
				return createAddressUseListFromString(eDataType, initialValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST:
				return createAdministrativeGenderListFromString(eDataType, initialValue);
			case FhirPackage.AGGREGATION_MODE_LIST:
				return createAggregationModeListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST:
				return createAllergyIntoleranceCategoryListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CERTAINTY_LIST:
				return createAllergyIntoleranceCertaintyListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST:
				return createAllergyIntoleranceCriticalityListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST:
				return createAllergyIntoleranceSeverityListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_STATUS_LIST:
				return createAllergyIntoleranceStatusListFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST:
				return createAllergyIntoleranceTypeListFromString(eDataType, initialValue);
			case FhirPackage.ANSWER_FORMAT_LIST:
				return createAnswerFormatListFromString(eDataType, initialValue);
			case FhirPackage.APPOINTMENT_STATUS_LIST:
				return createAppointmentStatusListFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST:
				return createAuditEventActionListFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_OBJECT_LIFECYCLE_LIST:
				return createAuditEventObjectLifecycleListFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_OBJECT_ROLE_LIST:
				return createAuditEventObjectRoleListFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_OBJECT_TYPE_LIST:
				return createAuditEventObjectTypeListFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST:
				return createAuditEventOutcomeListFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT_NETWORK_TYPE_LIST:
				return createAuditEventParticipantNetworkTypeListFromString(eDataType, initialValue);
			case FhirPackage.BINDING_STRENGTH_LIST:
				return createBindingStrengthListFromString(eDataType, initialValue);
			case FhirPackage.BUNDLE_TYPE_LIST:
				return createBundleTypeListFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_CATEGORY_LIST:
				return createCarePlanActivityCategoryListFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST:
				return createCarePlanActivityStatusListFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_STATUS_LIST:
				return createCarePlanStatusListFromString(eDataType, initialValue);
			case FhirPackage.CLAIM_TYPE_LIST:
				return createClaimTypeListFromString(eDataType, initialValue);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST:
				return createClinicalImpressionStatusListFromString(eDataType, initialValue);
			case FhirPackage.COMMUNICATION_REQUEST_STATUS_LIST:
				return createCommunicationRequestStatusListFromString(eDataType, initialValue);
			case FhirPackage.COMMUNICATION_STATUS_LIST:
				return createCommunicationStatusListFromString(eDataType, initialValue);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST:
				return createCompositionAttestationModeListFromString(eDataType, initialValue);
			case FhirPackage.COMPOSITION_STATUS_LIST:
				return createCompositionStatusListFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST:
				return createConceptMapEquivalenceListFromString(eDataType, initialValue);
			case FhirPackage.CONDITION_CLINICAL_STATUS_LIST:
				return createConditionClinicalStatusListFromString(eDataType, initialValue);
			case FhirPackage.CONFORMANCE_EVENT_MODE_LIST:
				return createConformanceEventModeListFromString(eDataType, initialValue);
			case FhirPackage.CONFORMANCE_RESOURCE_STATUS_LIST:
				return createConformanceResourceStatusListFromString(eDataType, initialValue);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST:
				return createConstraintSeverityListFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST:
				return createContactPointSystemListFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_USE_LIST:
				return createContactPointUseListFromString(eDataType, initialValue);
			case FhirPackage.DATA_ABSENT_REASON_LIST:
				return createDataAbsentReasonListFromString(eDataType, initialValue);
			case FhirPackage.DATA_ELEMENT_SPECIFICITY_LIST:
				return createDataElementSpecificityListFromString(eDataType, initialValue);
			case FhirPackage.DATA_TYPE_LIST:
				return createDataTypeListFromString(eDataType, initialValue);
			case FhirPackage.DAYS_OF_WEEK_LIST:
				return createDaysOfWeekListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST:
				return createDeviceMetricCalibrationStateListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST:
				return createDeviceMetricCalibrationTypeListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST:
				return createDeviceMetricCategoryListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST:
				return createDeviceMetricColorListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST:
				return createDeviceMetricOperationalStatusListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_STATUS_LIST:
				return createDeviceStatusListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_USE_REQUEST_PRIORITY_LIST:
				return createDeviceUseRequestPriorityListFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_USE_REQUEST_STATUS_LIST:
				return createDeviceUseRequestStatusListFromString(eDataType, initialValue);
			case FhirPackage.DIAGNOSTIC_ORDER_PRIORITY_LIST:
				return createDiagnosticOrderPriorityListFromString(eDataType, initialValue);
			case FhirPackage.DIAGNOSTIC_ORDER_STATUS_LIST:
				return createDiagnosticOrderStatusListFromString(eDataType, initialValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST:
				return createDiagnosticReportStatusListFromString(eDataType, initialValue);
			case FhirPackage.DIGITAL_MEDIA_TYPE_LIST:
				return createDigitalMediaTypeListFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_MODE_LIST:
				return createDocumentModeListFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST:
				return createDocumentReferenceStatusListFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST:
				return createDocumentRelationshipTypeListFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_CLASS_LIST:
				return createEncounterClassListFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST:
				return createEncounterLocationStatusListFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_STATE_LIST:
				return createEncounterStateListFromString(eDataType, initialValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST:
				return createEpisodeOfCareStatusListFromString(eDataType, initialValue);
			case FhirPackage.EVENT_TIMING_LIST:
				return createEventTimingListFromString(eDataType, initialValue);
			case FhirPackage.EXTENSION_CONTEXT_LIST:
				return createExtensionContextListFromString(eDataType, initialValue);
			case FhirPackage.FHIR_DEFINED_TYPE_LIST:
				return createFHIRDefinedTypeListFromString(eDataType, initialValue);
			case FhirPackage.FILTER_OPERATOR_LIST:
				return createFilterOperatorListFromString(eDataType, initialValue);
			case FhirPackage.FLAG_STATUS_LIST:
				return createFlagStatusListFromString(eDataType, initialValue);
			case FhirPackage.GOAL_STATUS_LIST:
				return createGoalStatusListFromString(eDataType, initialValue);
			case FhirPackage.GROUP_TYPE_LIST:
				return createGroupTypeListFromString(eDataType, initialValue);
			case FhirPackage.HTTP_VERB_LIST:
				return createHTTPVerbListFromString(eDataType, initialValue);
			case FhirPackage.IDENTIFIER_USE_LIST:
				return createIdentifierUseListFromString(eDataType, initialValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST:
				return createIdentityAssuranceLevelListFromString(eDataType, initialValue);
			case FhirPackage.IMAGING_MODALITY_LIST:
				return createImagingModalityListFromString(eDataType, initialValue);
			case FhirPackage.INSTANCE_AVAILABILITY_LIST:
				return createInstanceAvailabilityListFromString(eDataType, initialValue);
			case FhirPackage.ISSUE_SEVERITY_LIST:
				return createIssueSeverityListFromString(eDataType, initialValue);
			case FhirPackage.LINK_TYPE_LIST:
				return createLinkTypeListFromString(eDataType, initialValue);
			case FhirPackage.LIST_MODE_LIST:
				return createListModeListFromString(eDataType, initialValue);
			case FhirPackage.LIST_STATUS_LIST:
				return createListStatusListFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_MODE_LIST:
				return createLocationModeListFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_STATUS_LIST:
				return createLocationStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEASMNT_PRINCIPLE_LIST:
				return createMeasmntPrincipleListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_LIST:
				return createMedicationAdministrationStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_LIST:
				return createMedicationDispenseStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_KIND_LIST:
				return createMedicationKindListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_PRESCRIPTION_STATUS_LIST:
				return createMedicationPrescriptionStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_LIST:
				return createMedicationStatementStatusListFromString(eDataType, initialValue);
			case FhirPackage.MESSAGE_EVENT_LIST:
				return createMessageEventListFromString(eDataType, initialValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST:
				return createMessageSignificanceCategoryListFromString(eDataType, initialValue);
			case FhirPackage.MODALITY_LIST:
				return createModalityListFromString(eDataType, initialValue);
			case FhirPackage.NAME_USE_LIST:
				return createNameUseListFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST:
				return createNamingSystemIdentifierTypeListFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST:
				return createNamingSystemTypeListFromString(eDataType, initialValue);
			case FhirPackage.NARRATIVE_STATUS_LIST:
				return createNarrativeStatusListFromString(eDataType, initialValue);
			case FhirPackage.NOTE_TYPE_LIST:
				return createNoteTypeListFromString(eDataType, initialValue);
			case FhirPackage.NUTRITION_ORDER_STATUS_LIST:
				return createNutritionOrderStatusListFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE_LIST:
				return createObservationRelationshipTypeListFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_RELIABILITY_LIST:
				return createObservationReliabilityListFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_STATUS_LIST:
				return createObservationStatusListFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_KIND_LIST:
				return createOperationKindListFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST:
				return createOperationParameterUseListFromString(eDataType, initialValue);
			case FhirPackage.ORDER_STATUS_LIST:
				return createOrderStatusListFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST:
				return createParticipantRequiredListFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPANT_STATUS_LIST:
				return createParticipantStatusListFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPATION_STATUS_LIST:
				return createParticipationStatusListFromString(eDataType, initialValue);
			case FhirPackage.PROCEDURE_RELATIONSHIP_TYPE_LIST:
				return createProcedureRelationshipTypeListFromString(eDataType, initialValue);
			case FhirPackage.PROCEDURE_REQUEST_PRIORITY_LIST:
				return createProcedureRequestPriorityListFromString(eDataType, initialValue);
			case FhirPackage.PROCEDURE_REQUEST_STATUS_LIST:
				return createProcedureRequestStatusListFromString(eDataType, initialValue);
			case FhirPackage.PROCEDURE_STATUS_LIST:
				return createProcedureStatusListFromString(eDataType, initialValue);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST:
				return createPropertyRepresentationListFromString(eDataType, initialValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST:
				return createProvenanceEntityRoleListFromString(eDataType, initialValue);
			case FhirPackage.QUANTITY_COMPARATOR_LIST:
				return createQuantityComparatorListFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_STATUS_LIST:
				return createQuestionnaireAnswersStatusListFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_STATUS_LIST:
				return createQuestionnaireStatusListFromString(eDataType, initialValue);
			case FhirPackage.REFERRAL_STATUS_LIST:
				return createReferralStatusListFromString(eDataType, initialValue);
			case FhirPackage.REMITTANCE_OUTCOME_LIST:
				return createRemittanceOutcomeListFromString(eDataType, initialValue);
			case FhirPackage.RESOURCE_TYPE_LIST:
				return createResourceTypeListFromString(eDataType, initialValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST:
				return createResourceVersionPolicyListFromString(eDataType, initialValue);
			case FhirPackage.RESPONSE_TYPE_LIST:
				return createResponseTypeListFromString(eDataType, initialValue);
			case FhirPackage.RESTFUL_CONFORMANCE_MODE_LIST:
				return createRestfulConformanceModeListFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST:
				return createSearchEntryModeListFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST:
				return createSearchParamTypeListFromString(eDataType, initialValue);
			case FhirPackage.SLICING_RULES_LIST:
				return createSlicingRulesListFromString(eDataType, initialValue);
			case FhirPackage.SLOT_STATUS_LIST:
				return createSlotStatusListFromString(eDataType, initialValue);
			case FhirPackage.SPECIAL_VALUES_LIST:
				return createSpecialValuesListFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_DEFINITION_TYPE_LIST:
				return createStructureDefinitionTypeListFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST:
				return createSubscriptionChannelTypeListFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST:
				return createSubscriptionStatusListFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_DISPENSE_STATUS_LIST:
				return createSupplyDispenseStatusListFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_STATUS_LIST:
				return createSupplyStatusListFromString(eDataType, initialValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST:
				return createSystemRestfulInteractionListFromString(eDataType, initialValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST:
				return createTypeRestfulInteractionListFromString(eDataType, initialValue);
			case FhirPackage.UNITS_OF_TIME_LIST:
				return createUnitsOfTimeListFromString(eDataType, initialValue);
			case FhirPackage.USE_LIST:
				return createUseListFromString(eDataType, initialValue);
			case FhirPackage.VISION_BASE_LIST:
				return createVisionBaseListFromString(eDataType, initialValue);
			case FhirPackage.VISION_EYES_LIST:
				return createVisionEyesListFromString(eDataType, initialValue);
			case FhirPackage.ACTION_LIST_LIST_OBJECT:
				return createActionListListObjectFromString(eDataType, initialValue);
			case FhirPackage.ADDRESS_USE_LIST_OBJECT:
				return createAddressUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST_OBJECT:
				return createAdministrativeGenderListObjectFromString(eDataType, initialValue);
			case FhirPackage.AGGREGATION_MODE_LIST_OBJECT:
				return createAggregationModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST_OBJECT:
				return createAllergyIntoleranceCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CERTAINTY_LIST_OBJECT:
				return createAllergyIntoleranceCertaintyListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST_OBJECT:
				return createAllergyIntoleranceCriticalityListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST_OBJECT:
				return createAllergyIntoleranceSeverityListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_STATUS_LIST_OBJECT:
				return createAllergyIntoleranceStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST_OBJECT:
				return createAllergyIntoleranceTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ANSWER_FORMAT_LIST_OBJECT:
				return createAnswerFormatListObjectFromString(eDataType, initialValue);
			case FhirPackage.APPOINTMENT_STATUS_LIST_OBJECT:
				return createAppointmentStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST_OBJECT:
				return createAuditEventActionListObjectFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_OBJECT_LIFECYCLE_LIST_OBJECT:
				return createAuditEventObjectLifecycleListObjectFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_OBJECT_ROLE_LIST_OBJECT:
				return createAuditEventObjectRoleListObjectFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_OBJECT_TYPE_LIST_OBJECT:
				return createAuditEventObjectTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST_OBJECT:
				return createAuditEventOutcomeListObjectFromString(eDataType, initialValue);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT_NETWORK_TYPE_LIST_OBJECT:
				return createAuditEventParticipantNetworkTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.BASE64_BINARY_PRIMITIVE:
				return createBase64BinaryPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.BINDING_STRENGTH_LIST_OBJECT:
				return createBindingStrengthListObjectFromString(eDataType, initialValue);
			case FhirPackage.BOOLEAN_PRIMITIVE:
				return createBooleanPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.BOOLEAN_PRIMITIVE_OBJECT:
				return createBooleanPrimitiveObjectFromString(eDataType, initialValue);
			case FhirPackage.BUNDLE_TYPE_LIST_OBJECT:
				return createBundleTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_CATEGORY_LIST_OBJECT:
				return createCarePlanActivityCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST_OBJECT:
				return createCarePlanActivityStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CARE_PLAN_STATUS_LIST_OBJECT:
				return createCarePlanStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CLAIM_TYPE_LIST_OBJECT:
				return createClaimTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.CLINICAL_BASE_GENDER_LIST:
				return createClinicalBaseGenderListFromString(eDataType, initialValue);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST_OBJECT:
				return createClinicalImpressionStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CODE_PRIMITIVE:
				return createCodePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.COMMUNICATION_REQUEST_STATUS_LIST_OBJECT:
				return createCommunicationRequestStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.COMMUNICATION_STATUS_LIST_OBJECT:
				return createCommunicationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST_OBJECT:
				return createCompositionAttestationModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.COMPOSITION_STATUS_LIST_OBJECT:
				return createCompositionStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST_OBJECT:
				return createConceptMapEquivalenceListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONDITION_CLINICAL_STATUS_LIST_OBJECT:
				return createConditionClinicalStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONFORMANCE_EVENT_MODE_LIST_OBJECT:
				return createConformanceEventModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONFORMANCE_RESOURCE_STATUS_LIST_OBJECT:
				return createConformanceResourceStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONFORMANCE_USE_CONTEXT_LIST:
				return createConformanceUseContextListFromString(eDataType, initialValue);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST_OBJECT:
				return createConstraintSeverityListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST_OBJECT:
				return createContactPointSystemListObjectFromString(eDataType, initialValue);
			case FhirPackage.CONTACT_POINT_USE_LIST_OBJECT:
				return createContactPointUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.DATA_ABSENT_REASON_LIST_OBJECT:
				return createDataAbsentReasonListObjectFromString(eDataType, initialValue);
			case FhirPackage.DATA_ELEMENT_SPECIFICITY_LIST_OBJECT:
				return createDataElementSpecificityListObjectFromString(eDataType, initialValue);
			case FhirPackage.DATA_TYPE_LIST_OBJECT:
				return createDataTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.DATE_PRIMITIVE:
				return createDatePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.DATE_PRIMITIVE_BASE:
				return createDatePrimitiveBaseFromString(eDataType, initialValue);
			case FhirPackage.DATE_TIME_PRIMITIVE:
				return createDateTimePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.DATE_TIME_PRIMITIVE_BASE:
				return createDateTimePrimitiveBaseFromString(eDataType, initialValue);
			case FhirPackage.DAYS_OF_WEEK_LIST_OBJECT:
				return createDaysOfWeekListObjectFromString(eDataType, initialValue);
			case FhirPackage.DECIMAL_PRIMITIVE:
				return createDecimalPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST_OBJECT:
				return createDeviceMetricCalibrationStateListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST_OBJECT:
				return createDeviceMetricCalibrationTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST_OBJECT:
				return createDeviceMetricCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST_OBJECT:
				return createDeviceMetricColorListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST_OBJECT:
				return createDeviceMetricOperationalStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_STATUS_LIST_OBJECT:
				return createDeviceStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_USE_REQUEST_PRIORITY_LIST_OBJECT:
				return createDeviceUseRequestPriorityListObjectFromString(eDataType, initialValue);
			case FhirPackage.DEVICE_USE_REQUEST_STATUS_LIST_OBJECT:
				return createDeviceUseRequestStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DIAGNOSTIC_ORDER_PRIORITY_LIST_OBJECT:
				return createDiagnosticOrderPriorityListObjectFromString(eDataType, initialValue);
			case FhirPackage.DIAGNOSTIC_ORDER_STATUS_LIST_OBJECT:
				return createDiagnosticOrderStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST_OBJECT:
				return createDiagnosticReportStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DIGITAL_MEDIA_TYPE_LIST_OBJECT:
				return createDigitalMediaTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_MODE_LIST_OBJECT:
				return createDocumentModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST_OBJECT:
				return createDocumentReferenceStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST_OBJECT:
				return createDocumentRelationshipTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_CLASS_LIST_OBJECT:
				return createEncounterClassListObjectFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST_OBJECT:
				return createEncounterLocationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.ENCOUNTER_STATE_LIST_OBJECT:
				return createEncounterStateListObjectFromString(eDataType, initialValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST_OBJECT:
				return createEpisodeOfCareStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.EVENT_TIMING_LIST_OBJECT:
				return createEventTimingListObjectFromString(eDataType, initialValue);
			case FhirPackage.EXTENSION_CONTEXT_LIST_OBJECT:
				return createExtensionContextListObjectFromString(eDataType, initialValue);
			case FhirPackage.FHIR_DEFINED_TYPE_LIST_OBJECT:
				return createFHIRDefinedTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.FILTER_OPERATOR_LIST_OBJECT:
				return createFilterOperatorListObjectFromString(eDataType, initialValue);
			case FhirPackage.FLAG_STATUS_LIST_OBJECT:
				return createFlagStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.GOAL_STATUS_LIST_OBJECT:
				return createGoalStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.GROUP_TYPE_LIST_OBJECT:
				return createGroupTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.HTTP_VERB_LIST_OBJECT:
				return createHTTPVerbListObjectFromString(eDataType, initialValue);
			case FhirPackage.IDENTIFIER_USE_LIST_OBJECT:
				return createIdentifierUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST_OBJECT:
				return createIdentityAssuranceLevelListObjectFromString(eDataType, initialValue);
			case FhirPackage.ID_PRIMITIVE:
				return createIdPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.IMAGING_MODALITY_LIST_OBJECT:
				return createImagingModalityListObjectFromString(eDataType, initialValue);
			case FhirPackage.INSTANCE_AVAILABILITY_LIST_OBJECT:
				return createInstanceAvailabilityListObjectFromString(eDataType, initialValue);
			case FhirPackage.INSTANT_PRIMITIVE:
				return createInstantPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.INTEGER_PRIMITIVE:
				return createIntegerPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.INTEGER_PRIMITIVE_OBJECT:
				return createIntegerPrimitiveObjectFromString(eDataType, initialValue);
			case FhirPackage.ISSUE_SEVERITY_LIST_OBJECT:
				return createIssueSeverityListObjectFromString(eDataType, initialValue);
			case FhirPackage.LINK_TYPE_LIST_OBJECT:
				return createLinkTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.LIST_MODE_LIST_OBJECT:
				return createListModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.LIST_STATUS_LIST_OBJECT:
				return createListStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_MODE_LIST_OBJECT:
				return createLocationModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.LOCATION_STATUS_LIST_OBJECT:
				return createLocationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MARITAL_STATUS_LIST:
				return createMaritalStatusListFromString(eDataType, initialValue);
			case FhirPackage.MEASMNT_PRINCIPLE_LIST_OBJECT:
				return createMeasmntPrincipleListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_LIST_OBJECT:
				return createMedicationAdministrationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_LIST_OBJECT:
				return createMedicationDispenseStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_KIND_LIST_OBJECT:
				return createMedicationKindListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_PRESCRIPTION_STATUS_LIST_OBJECT:
				return createMedicationPrescriptionStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_LIST_OBJECT:
				return createMedicationStatementStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.MESSAGE_EVENT_LIST_OBJECT:
				return createMessageEventListObjectFromString(eDataType, initialValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST_OBJECT:
				return createMessageSignificanceCategoryListObjectFromString(eDataType, initialValue);
			case FhirPackage.MODALITY_LIST_OBJECT:
				return createModalityListObjectFromString(eDataType, initialValue);
			case FhirPackage.NAME_USE_LIST_OBJECT:
				return createNameUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST_OBJECT:
				return createNamingSystemIdentifierTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST_OBJECT:
				return createNamingSystemTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.NARRATIVE_STATUS_LIST_OBJECT:
				return createNarrativeStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.NOTE_TYPE_LIST_OBJECT:
				return createNoteTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.NUTRITION_ORDER_STATUS_LIST_OBJECT:
				return createNutritionOrderStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE_LIST_OBJECT:
				return createObservationRelationshipTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_RELIABILITY_LIST_OBJECT:
				return createObservationReliabilityListObjectFromString(eDataType, initialValue);
			case FhirPackage.OBSERVATION_STATUS_LIST_OBJECT:
				return createObservationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.OID_PRIMITIVE:
				return createOidPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_KIND_LIST_OBJECT:
				return createOperationKindListObjectFromString(eDataType, initialValue);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST_OBJECT:
				return createOperationParameterUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.ORDER_STATUS_LIST_OBJECT:
				return createOrderStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST_OBJECT:
				return createParticipantRequiredListObjectFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPANT_STATUS_LIST_OBJECT:
				return createParticipantStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.PARTICIPATION_STATUS_LIST_OBJECT:
				return createParticipationStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.POSITIVE_INT_PRIMITIVE:
				return createPositiveIntPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.PROCEDURE_RELATIONSHIP_TYPE_LIST_OBJECT:
				return createProcedureRelationshipTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.PROCEDURE_REQUEST_PRIORITY_LIST_OBJECT:
				return createProcedureRequestPriorityListObjectFromString(eDataType, initialValue);
			case FhirPackage.PROCEDURE_REQUEST_STATUS_LIST_OBJECT:
				return createProcedureRequestStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.PROCEDURE_STATUS_LIST_OBJECT:
				return createProcedureStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST_OBJECT:
				return createPropertyRepresentationListObjectFromString(eDataType, initialValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST_OBJECT:
				return createProvenanceEntityRoleListObjectFromString(eDataType, initialValue);
			case FhirPackage.QUANTITY_COMPARATOR_LIST_OBJECT:
				return createQuantityComparatorListObjectFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_STATUS_LIST_OBJECT:
				return createQuestionnaireAnswersStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.QUESTIONNAIRE_STATUS_LIST_OBJECT:
				return createQuestionnaireStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.REFERRAL_STATUS_LIST_OBJECT:
				return createReferralStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.REMITTANCE_OUTCOME_LIST_OBJECT:
				return createRemittanceOutcomeListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESOURCE_TYPE_LIST_OBJECT:
				return createResourceTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST_OBJECT:
				return createResourceVersionPolicyListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESPONSE_TYPE_LIST_OBJECT:
				return createResponseTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.RESTFUL_CONFORMANCE_MODE_LIST_OBJECT:
				return createRestfulConformanceModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SAMPLED_DATA_DATA_TYPE_PRIMITIVE:
				return createSampledDataDataTypePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST_OBJECT:
				return createSearchEntryModeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST_OBJECT:
				return createSearchParamTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SLICING_RULES_LIST_OBJECT:
				return createSlicingRulesListObjectFromString(eDataType, initialValue);
			case FhirPackage.SLOT_STATUS_LIST_OBJECT:
				return createSlotStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.SPECIAL_VALUES_LIST_OBJECT:
				return createSpecialValuesListObjectFromString(eDataType, initialValue);
			case FhirPackage.STRING_PRIMITIVE:
				return createStringPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.STRUCTURE_DEFINITION_TYPE_LIST_OBJECT:
				return createStructureDefinitionTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST_OBJECT:
				return createSubscriptionChannelTypeListObjectFromString(eDataType, initialValue);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST_OBJECT:
				return createSubscriptionStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_DISPENSE_STATUS_LIST_OBJECT:
				return createSupplyDispenseStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.SUPPLY_STATUS_LIST_OBJECT:
				return createSupplyStatusListObjectFromString(eDataType, initialValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST_OBJECT:
				return createSystemRestfulInteractionListObjectFromString(eDataType, initialValue);
			case FhirPackage.TIME_PRIMITIVE:
				return createTimePrimitiveFromString(eDataType, initialValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST_OBJECT:
				return createTypeRestfulInteractionListObjectFromString(eDataType, initialValue);
			case FhirPackage.UNITS_OF_TIME_LIST_OBJECT:
				return createUnitsOfTimeListObjectFromString(eDataType, initialValue);
			case FhirPackage.UNSIGNED_INT_PRIMITIVE:
				return createUnsignedIntPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.URI_PRIMITIVE:
				return createUriPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.USE_LIST_OBJECT:
				return createUseListObjectFromString(eDataType, initialValue);
			case FhirPackage.UUID_PRIMITIVE:
				return createUuidPrimitiveFromString(eDataType, initialValue);
			case FhirPackage.VISION_BASE_LIST_OBJECT:
				return createVisionBaseListObjectFromString(eDataType, initialValue);
			case FhirPackage.VISION_EYES_LIST_OBJECT:
				return createVisionEyesListObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FhirPackage.ACTION_LIST_LIST:
				return convertActionListListToString(eDataType, instanceValue);
			case FhirPackage.ADDRESS_USE_LIST:
				return convertAddressUseListToString(eDataType, instanceValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST:
				return convertAdministrativeGenderListToString(eDataType, instanceValue);
			case FhirPackage.AGGREGATION_MODE_LIST:
				return convertAggregationModeListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST:
				return convertAllergyIntoleranceCategoryListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CERTAINTY_LIST:
				return convertAllergyIntoleranceCertaintyListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST:
				return convertAllergyIntoleranceCriticalityListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST:
				return convertAllergyIntoleranceSeverityListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_STATUS_LIST:
				return convertAllergyIntoleranceStatusListToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST:
				return convertAllergyIntoleranceTypeListToString(eDataType, instanceValue);
			case FhirPackage.ANSWER_FORMAT_LIST:
				return convertAnswerFormatListToString(eDataType, instanceValue);
			case FhirPackage.APPOINTMENT_STATUS_LIST:
				return convertAppointmentStatusListToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST:
				return convertAuditEventActionListToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_OBJECT_LIFECYCLE_LIST:
				return convertAuditEventObjectLifecycleListToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_OBJECT_ROLE_LIST:
				return convertAuditEventObjectRoleListToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_OBJECT_TYPE_LIST:
				return convertAuditEventObjectTypeListToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST:
				return convertAuditEventOutcomeListToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT_NETWORK_TYPE_LIST:
				return convertAuditEventParticipantNetworkTypeListToString(eDataType, instanceValue);
			case FhirPackage.BINDING_STRENGTH_LIST:
				return convertBindingStrengthListToString(eDataType, instanceValue);
			case FhirPackage.BUNDLE_TYPE_LIST:
				return convertBundleTypeListToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_CATEGORY_LIST:
				return convertCarePlanActivityCategoryListToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST:
				return convertCarePlanActivityStatusListToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_STATUS_LIST:
				return convertCarePlanStatusListToString(eDataType, instanceValue);
			case FhirPackage.CLAIM_TYPE_LIST:
				return convertClaimTypeListToString(eDataType, instanceValue);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST:
				return convertClinicalImpressionStatusListToString(eDataType, instanceValue);
			case FhirPackage.COMMUNICATION_REQUEST_STATUS_LIST:
				return convertCommunicationRequestStatusListToString(eDataType, instanceValue);
			case FhirPackage.COMMUNICATION_STATUS_LIST:
				return convertCommunicationStatusListToString(eDataType, instanceValue);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST:
				return convertCompositionAttestationModeListToString(eDataType, instanceValue);
			case FhirPackage.COMPOSITION_STATUS_LIST:
				return convertCompositionStatusListToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST:
				return convertConceptMapEquivalenceListToString(eDataType, instanceValue);
			case FhirPackage.CONDITION_CLINICAL_STATUS_LIST:
				return convertConditionClinicalStatusListToString(eDataType, instanceValue);
			case FhirPackage.CONFORMANCE_EVENT_MODE_LIST:
				return convertConformanceEventModeListToString(eDataType, instanceValue);
			case FhirPackage.CONFORMANCE_RESOURCE_STATUS_LIST:
				return convertConformanceResourceStatusListToString(eDataType, instanceValue);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST:
				return convertConstraintSeverityListToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST:
				return convertContactPointSystemListToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_USE_LIST:
				return convertContactPointUseListToString(eDataType, instanceValue);
			case FhirPackage.DATA_ABSENT_REASON_LIST:
				return convertDataAbsentReasonListToString(eDataType, instanceValue);
			case FhirPackage.DATA_ELEMENT_SPECIFICITY_LIST:
				return convertDataElementSpecificityListToString(eDataType, instanceValue);
			case FhirPackage.DATA_TYPE_LIST:
				return convertDataTypeListToString(eDataType, instanceValue);
			case FhirPackage.DAYS_OF_WEEK_LIST:
				return convertDaysOfWeekListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST:
				return convertDeviceMetricCalibrationStateListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST:
				return convertDeviceMetricCalibrationTypeListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST:
				return convertDeviceMetricCategoryListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST:
				return convertDeviceMetricColorListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST:
				return convertDeviceMetricOperationalStatusListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_STATUS_LIST:
				return convertDeviceStatusListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_USE_REQUEST_PRIORITY_LIST:
				return convertDeviceUseRequestPriorityListToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_USE_REQUEST_STATUS_LIST:
				return convertDeviceUseRequestStatusListToString(eDataType, instanceValue);
			case FhirPackage.DIAGNOSTIC_ORDER_PRIORITY_LIST:
				return convertDiagnosticOrderPriorityListToString(eDataType, instanceValue);
			case FhirPackage.DIAGNOSTIC_ORDER_STATUS_LIST:
				return convertDiagnosticOrderStatusListToString(eDataType, instanceValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST:
				return convertDiagnosticReportStatusListToString(eDataType, instanceValue);
			case FhirPackage.DIGITAL_MEDIA_TYPE_LIST:
				return convertDigitalMediaTypeListToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_MODE_LIST:
				return convertDocumentModeListToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST:
				return convertDocumentReferenceStatusListToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST:
				return convertDocumentRelationshipTypeListToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_CLASS_LIST:
				return convertEncounterClassListToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST:
				return convertEncounterLocationStatusListToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_STATE_LIST:
				return convertEncounterStateListToString(eDataType, instanceValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST:
				return convertEpisodeOfCareStatusListToString(eDataType, instanceValue);
			case FhirPackage.EVENT_TIMING_LIST:
				return convertEventTimingListToString(eDataType, instanceValue);
			case FhirPackage.EXTENSION_CONTEXT_LIST:
				return convertExtensionContextListToString(eDataType, instanceValue);
			case FhirPackage.FHIR_DEFINED_TYPE_LIST:
				return convertFHIRDefinedTypeListToString(eDataType, instanceValue);
			case FhirPackage.FILTER_OPERATOR_LIST:
				return convertFilterOperatorListToString(eDataType, instanceValue);
			case FhirPackage.FLAG_STATUS_LIST:
				return convertFlagStatusListToString(eDataType, instanceValue);
			case FhirPackage.GOAL_STATUS_LIST:
				return convertGoalStatusListToString(eDataType, instanceValue);
			case FhirPackage.GROUP_TYPE_LIST:
				return convertGroupTypeListToString(eDataType, instanceValue);
			case FhirPackage.HTTP_VERB_LIST:
				return convertHTTPVerbListToString(eDataType, instanceValue);
			case FhirPackage.IDENTIFIER_USE_LIST:
				return convertIdentifierUseListToString(eDataType, instanceValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST:
				return convertIdentityAssuranceLevelListToString(eDataType, instanceValue);
			case FhirPackage.IMAGING_MODALITY_LIST:
				return convertImagingModalityListToString(eDataType, instanceValue);
			case FhirPackage.INSTANCE_AVAILABILITY_LIST:
				return convertInstanceAvailabilityListToString(eDataType, instanceValue);
			case FhirPackage.ISSUE_SEVERITY_LIST:
				return convertIssueSeverityListToString(eDataType, instanceValue);
			case FhirPackage.LINK_TYPE_LIST:
				return convertLinkTypeListToString(eDataType, instanceValue);
			case FhirPackage.LIST_MODE_LIST:
				return convertListModeListToString(eDataType, instanceValue);
			case FhirPackage.LIST_STATUS_LIST:
				return convertListStatusListToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_MODE_LIST:
				return convertLocationModeListToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_STATUS_LIST:
				return convertLocationStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEASMNT_PRINCIPLE_LIST:
				return convertMeasmntPrincipleListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_LIST:
				return convertMedicationAdministrationStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_LIST:
				return convertMedicationDispenseStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_KIND_LIST:
				return convertMedicationKindListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_PRESCRIPTION_STATUS_LIST:
				return convertMedicationPrescriptionStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_LIST:
				return convertMedicationStatementStatusListToString(eDataType, instanceValue);
			case FhirPackage.MESSAGE_EVENT_LIST:
				return convertMessageEventListToString(eDataType, instanceValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST:
				return convertMessageSignificanceCategoryListToString(eDataType, instanceValue);
			case FhirPackage.MODALITY_LIST:
				return convertModalityListToString(eDataType, instanceValue);
			case FhirPackage.NAME_USE_LIST:
				return convertNameUseListToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST:
				return convertNamingSystemIdentifierTypeListToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST:
				return convertNamingSystemTypeListToString(eDataType, instanceValue);
			case FhirPackage.NARRATIVE_STATUS_LIST:
				return convertNarrativeStatusListToString(eDataType, instanceValue);
			case FhirPackage.NOTE_TYPE_LIST:
				return convertNoteTypeListToString(eDataType, instanceValue);
			case FhirPackage.NUTRITION_ORDER_STATUS_LIST:
				return convertNutritionOrderStatusListToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE_LIST:
				return convertObservationRelationshipTypeListToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_RELIABILITY_LIST:
				return convertObservationReliabilityListToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_STATUS_LIST:
				return convertObservationStatusListToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_KIND_LIST:
				return convertOperationKindListToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST:
				return convertOperationParameterUseListToString(eDataType, instanceValue);
			case FhirPackage.ORDER_STATUS_LIST:
				return convertOrderStatusListToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST:
				return convertParticipantRequiredListToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPANT_STATUS_LIST:
				return convertParticipantStatusListToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPATION_STATUS_LIST:
				return convertParticipationStatusListToString(eDataType, instanceValue);
			case FhirPackage.PROCEDURE_RELATIONSHIP_TYPE_LIST:
				return convertProcedureRelationshipTypeListToString(eDataType, instanceValue);
			case FhirPackage.PROCEDURE_REQUEST_PRIORITY_LIST:
				return convertProcedureRequestPriorityListToString(eDataType, instanceValue);
			case FhirPackage.PROCEDURE_REQUEST_STATUS_LIST:
				return convertProcedureRequestStatusListToString(eDataType, instanceValue);
			case FhirPackage.PROCEDURE_STATUS_LIST:
				return convertProcedureStatusListToString(eDataType, instanceValue);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST:
				return convertPropertyRepresentationListToString(eDataType, instanceValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST:
				return convertProvenanceEntityRoleListToString(eDataType, instanceValue);
			case FhirPackage.QUANTITY_COMPARATOR_LIST:
				return convertQuantityComparatorListToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_STATUS_LIST:
				return convertQuestionnaireAnswersStatusListToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_STATUS_LIST:
				return convertQuestionnaireStatusListToString(eDataType, instanceValue);
			case FhirPackage.REFERRAL_STATUS_LIST:
				return convertReferralStatusListToString(eDataType, instanceValue);
			case FhirPackage.REMITTANCE_OUTCOME_LIST:
				return convertRemittanceOutcomeListToString(eDataType, instanceValue);
			case FhirPackage.RESOURCE_TYPE_LIST:
				return convertResourceTypeListToString(eDataType, instanceValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST:
				return convertResourceVersionPolicyListToString(eDataType, instanceValue);
			case FhirPackage.RESPONSE_TYPE_LIST:
				return convertResponseTypeListToString(eDataType, instanceValue);
			case FhirPackage.RESTFUL_CONFORMANCE_MODE_LIST:
				return convertRestfulConformanceModeListToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST:
				return convertSearchEntryModeListToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST:
				return convertSearchParamTypeListToString(eDataType, instanceValue);
			case FhirPackage.SLICING_RULES_LIST:
				return convertSlicingRulesListToString(eDataType, instanceValue);
			case FhirPackage.SLOT_STATUS_LIST:
				return convertSlotStatusListToString(eDataType, instanceValue);
			case FhirPackage.SPECIAL_VALUES_LIST:
				return convertSpecialValuesListToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_DEFINITION_TYPE_LIST:
				return convertStructureDefinitionTypeListToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST:
				return convertSubscriptionChannelTypeListToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST:
				return convertSubscriptionStatusListToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_DISPENSE_STATUS_LIST:
				return convertSupplyDispenseStatusListToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_STATUS_LIST:
				return convertSupplyStatusListToString(eDataType, instanceValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST:
				return convertSystemRestfulInteractionListToString(eDataType, instanceValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST:
				return convertTypeRestfulInteractionListToString(eDataType, instanceValue);
			case FhirPackage.UNITS_OF_TIME_LIST:
				return convertUnitsOfTimeListToString(eDataType, instanceValue);
			case FhirPackage.USE_LIST:
				return convertUseListToString(eDataType, instanceValue);
			case FhirPackage.VISION_BASE_LIST:
				return convertVisionBaseListToString(eDataType, instanceValue);
			case FhirPackage.VISION_EYES_LIST:
				return convertVisionEyesListToString(eDataType, instanceValue);
			case FhirPackage.ACTION_LIST_LIST_OBJECT:
				return convertActionListListObjectToString(eDataType, instanceValue);
			case FhirPackage.ADDRESS_USE_LIST_OBJECT:
				return convertAddressUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST_OBJECT:
				return convertAdministrativeGenderListObjectToString(eDataType, instanceValue);
			case FhirPackage.AGGREGATION_MODE_LIST_OBJECT:
				return convertAggregationModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST_OBJECT:
				return convertAllergyIntoleranceCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CERTAINTY_LIST_OBJECT:
				return convertAllergyIntoleranceCertaintyListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST_OBJECT:
				return convertAllergyIntoleranceCriticalityListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST_OBJECT:
				return convertAllergyIntoleranceSeverityListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_STATUS_LIST_OBJECT:
				return convertAllergyIntoleranceStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST_OBJECT:
				return convertAllergyIntoleranceTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ANSWER_FORMAT_LIST_OBJECT:
				return convertAnswerFormatListObjectToString(eDataType, instanceValue);
			case FhirPackage.APPOINTMENT_STATUS_LIST_OBJECT:
				return convertAppointmentStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST_OBJECT:
				return convertAuditEventActionListObjectToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_OBJECT_LIFECYCLE_LIST_OBJECT:
				return convertAuditEventObjectLifecycleListObjectToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_OBJECT_ROLE_LIST_OBJECT:
				return convertAuditEventObjectRoleListObjectToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_OBJECT_TYPE_LIST_OBJECT:
				return convertAuditEventObjectTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST_OBJECT:
				return convertAuditEventOutcomeListObjectToString(eDataType, instanceValue);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT_NETWORK_TYPE_LIST_OBJECT:
				return convertAuditEventParticipantNetworkTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.BASE64_BINARY_PRIMITIVE:
				return convertBase64BinaryPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.BINDING_STRENGTH_LIST_OBJECT:
				return convertBindingStrengthListObjectToString(eDataType, instanceValue);
			case FhirPackage.BOOLEAN_PRIMITIVE:
				return convertBooleanPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.BOOLEAN_PRIMITIVE_OBJECT:
				return convertBooleanPrimitiveObjectToString(eDataType, instanceValue);
			case FhirPackage.BUNDLE_TYPE_LIST_OBJECT:
				return convertBundleTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_CATEGORY_LIST_OBJECT:
				return convertCarePlanActivityCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST_OBJECT:
				return convertCarePlanActivityStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CARE_PLAN_STATUS_LIST_OBJECT:
				return convertCarePlanStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CLAIM_TYPE_LIST_OBJECT:
				return convertClaimTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.CLINICAL_BASE_GENDER_LIST:
				return convertClinicalBaseGenderListToString(eDataType, instanceValue);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST_OBJECT:
				return convertClinicalImpressionStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CODE_PRIMITIVE:
				return convertCodePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.COMMUNICATION_REQUEST_STATUS_LIST_OBJECT:
				return convertCommunicationRequestStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.COMMUNICATION_STATUS_LIST_OBJECT:
				return convertCommunicationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST_OBJECT:
				return convertCompositionAttestationModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.COMPOSITION_STATUS_LIST_OBJECT:
				return convertCompositionStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST_OBJECT:
				return convertConceptMapEquivalenceListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONDITION_CLINICAL_STATUS_LIST_OBJECT:
				return convertConditionClinicalStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONFORMANCE_EVENT_MODE_LIST_OBJECT:
				return convertConformanceEventModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONFORMANCE_RESOURCE_STATUS_LIST_OBJECT:
				return convertConformanceResourceStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONFORMANCE_USE_CONTEXT_LIST:
				return convertConformanceUseContextListToString(eDataType, instanceValue);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST_OBJECT:
				return convertConstraintSeverityListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST_OBJECT:
				return convertContactPointSystemListObjectToString(eDataType, instanceValue);
			case FhirPackage.CONTACT_POINT_USE_LIST_OBJECT:
				return convertContactPointUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.DATA_ABSENT_REASON_LIST_OBJECT:
				return convertDataAbsentReasonListObjectToString(eDataType, instanceValue);
			case FhirPackage.DATA_ELEMENT_SPECIFICITY_LIST_OBJECT:
				return convertDataElementSpecificityListObjectToString(eDataType, instanceValue);
			case FhirPackage.DATA_TYPE_LIST_OBJECT:
				return convertDataTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.DATE_PRIMITIVE:
				return convertDatePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.DATE_PRIMITIVE_BASE:
				return convertDatePrimitiveBaseToString(eDataType, instanceValue);
			case FhirPackage.DATE_TIME_PRIMITIVE:
				return convertDateTimePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.DATE_TIME_PRIMITIVE_BASE:
				return convertDateTimePrimitiveBaseToString(eDataType, instanceValue);
			case FhirPackage.DAYS_OF_WEEK_LIST_OBJECT:
				return convertDaysOfWeekListObjectToString(eDataType, instanceValue);
			case FhirPackage.DECIMAL_PRIMITIVE:
				return convertDecimalPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST_OBJECT:
				return convertDeviceMetricCalibrationStateListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST_OBJECT:
				return convertDeviceMetricCalibrationTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST_OBJECT:
				return convertDeviceMetricCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST_OBJECT:
				return convertDeviceMetricColorListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST_OBJECT:
				return convertDeviceMetricOperationalStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_STATUS_LIST_OBJECT:
				return convertDeviceStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_USE_REQUEST_PRIORITY_LIST_OBJECT:
				return convertDeviceUseRequestPriorityListObjectToString(eDataType, instanceValue);
			case FhirPackage.DEVICE_USE_REQUEST_STATUS_LIST_OBJECT:
				return convertDeviceUseRequestStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DIAGNOSTIC_ORDER_PRIORITY_LIST_OBJECT:
				return convertDiagnosticOrderPriorityListObjectToString(eDataType, instanceValue);
			case FhirPackage.DIAGNOSTIC_ORDER_STATUS_LIST_OBJECT:
				return convertDiagnosticOrderStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST_OBJECT:
				return convertDiagnosticReportStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DIGITAL_MEDIA_TYPE_LIST_OBJECT:
				return convertDigitalMediaTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_MODE_LIST_OBJECT:
				return convertDocumentModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST_OBJECT:
				return convertDocumentReferenceStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST_OBJECT:
				return convertDocumentRelationshipTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_CLASS_LIST_OBJECT:
				return convertEncounterClassListObjectToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST_OBJECT:
				return convertEncounterLocationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.ENCOUNTER_STATE_LIST_OBJECT:
				return convertEncounterStateListObjectToString(eDataType, instanceValue);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST_OBJECT:
				return convertEpisodeOfCareStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.EVENT_TIMING_LIST_OBJECT:
				return convertEventTimingListObjectToString(eDataType, instanceValue);
			case FhirPackage.EXTENSION_CONTEXT_LIST_OBJECT:
				return convertExtensionContextListObjectToString(eDataType, instanceValue);
			case FhirPackage.FHIR_DEFINED_TYPE_LIST_OBJECT:
				return convertFHIRDefinedTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.FILTER_OPERATOR_LIST_OBJECT:
				return convertFilterOperatorListObjectToString(eDataType, instanceValue);
			case FhirPackage.FLAG_STATUS_LIST_OBJECT:
				return convertFlagStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.GOAL_STATUS_LIST_OBJECT:
				return convertGoalStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.GROUP_TYPE_LIST_OBJECT:
				return convertGroupTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.HTTP_VERB_LIST_OBJECT:
				return convertHTTPVerbListObjectToString(eDataType, instanceValue);
			case FhirPackage.IDENTIFIER_USE_LIST_OBJECT:
				return convertIdentifierUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST_OBJECT:
				return convertIdentityAssuranceLevelListObjectToString(eDataType, instanceValue);
			case FhirPackage.ID_PRIMITIVE:
				return convertIdPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.IMAGING_MODALITY_LIST_OBJECT:
				return convertImagingModalityListObjectToString(eDataType, instanceValue);
			case FhirPackage.INSTANCE_AVAILABILITY_LIST_OBJECT:
				return convertInstanceAvailabilityListObjectToString(eDataType, instanceValue);
			case FhirPackage.INSTANT_PRIMITIVE:
				return convertInstantPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.INTEGER_PRIMITIVE:
				return convertIntegerPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.INTEGER_PRIMITIVE_OBJECT:
				return convertIntegerPrimitiveObjectToString(eDataType, instanceValue);
			case FhirPackage.ISSUE_SEVERITY_LIST_OBJECT:
				return convertIssueSeverityListObjectToString(eDataType, instanceValue);
			case FhirPackage.LINK_TYPE_LIST_OBJECT:
				return convertLinkTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.LIST_MODE_LIST_OBJECT:
				return convertListModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.LIST_STATUS_LIST_OBJECT:
				return convertListStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_MODE_LIST_OBJECT:
				return convertLocationModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.LOCATION_STATUS_LIST_OBJECT:
				return convertLocationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MARITAL_STATUS_LIST:
				return convertMaritalStatusListToString(eDataType, instanceValue);
			case FhirPackage.MEASMNT_PRINCIPLE_LIST_OBJECT:
				return convertMeasmntPrincipleListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_LIST_OBJECT:
				return convertMedicationAdministrationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_LIST_OBJECT:
				return convertMedicationDispenseStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_KIND_LIST_OBJECT:
				return convertMedicationKindListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_PRESCRIPTION_STATUS_LIST_OBJECT:
				return convertMedicationPrescriptionStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_LIST_OBJECT:
				return convertMedicationStatementStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.MESSAGE_EVENT_LIST_OBJECT:
				return convertMessageEventListObjectToString(eDataType, instanceValue);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST_OBJECT:
				return convertMessageSignificanceCategoryListObjectToString(eDataType, instanceValue);
			case FhirPackage.MODALITY_LIST_OBJECT:
				return convertModalityListObjectToString(eDataType, instanceValue);
			case FhirPackage.NAME_USE_LIST_OBJECT:
				return convertNameUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST_OBJECT:
				return convertNamingSystemIdentifierTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST_OBJECT:
				return convertNamingSystemTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.NARRATIVE_STATUS_LIST_OBJECT:
				return convertNarrativeStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.NOTE_TYPE_LIST_OBJECT:
				return convertNoteTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.NUTRITION_ORDER_STATUS_LIST_OBJECT:
				return convertNutritionOrderStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE_LIST_OBJECT:
				return convertObservationRelationshipTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_RELIABILITY_LIST_OBJECT:
				return convertObservationReliabilityListObjectToString(eDataType, instanceValue);
			case FhirPackage.OBSERVATION_STATUS_LIST_OBJECT:
				return convertObservationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.OID_PRIMITIVE:
				return convertOidPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_KIND_LIST_OBJECT:
				return convertOperationKindListObjectToString(eDataType, instanceValue);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST_OBJECT:
				return convertOperationParameterUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.ORDER_STATUS_LIST_OBJECT:
				return convertOrderStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST_OBJECT:
				return convertParticipantRequiredListObjectToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPANT_STATUS_LIST_OBJECT:
				return convertParticipantStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.PARTICIPATION_STATUS_LIST_OBJECT:
				return convertParticipationStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.POSITIVE_INT_PRIMITIVE:
				return convertPositiveIntPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.PROCEDURE_RELATIONSHIP_TYPE_LIST_OBJECT:
				return convertProcedureRelationshipTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.PROCEDURE_REQUEST_PRIORITY_LIST_OBJECT:
				return convertProcedureRequestPriorityListObjectToString(eDataType, instanceValue);
			case FhirPackage.PROCEDURE_REQUEST_STATUS_LIST_OBJECT:
				return convertProcedureRequestStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.PROCEDURE_STATUS_LIST_OBJECT:
				return convertProcedureStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST_OBJECT:
				return convertPropertyRepresentationListObjectToString(eDataType, instanceValue);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST_OBJECT:
				return convertProvenanceEntityRoleListObjectToString(eDataType, instanceValue);
			case FhirPackage.QUANTITY_COMPARATOR_LIST_OBJECT:
				return convertQuantityComparatorListObjectToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_STATUS_LIST_OBJECT:
				return convertQuestionnaireAnswersStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.QUESTIONNAIRE_STATUS_LIST_OBJECT:
				return convertQuestionnaireStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.REFERRAL_STATUS_LIST_OBJECT:
				return convertReferralStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.REMITTANCE_OUTCOME_LIST_OBJECT:
				return convertRemittanceOutcomeListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESOURCE_TYPE_LIST_OBJECT:
				return convertResourceTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST_OBJECT:
				return convertResourceVersionPolicyListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESPONSE_TYPE_LIST_OBJECT:
				return convertResponseTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.RESTFUL_CONFORMANCE_MODE_LIST_OBJECT:
				return convertRestfulConformanceModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SAMPLED_DATA_DATA_TYPE_PRIMITIVE:
				return convertSampledDataDataTypePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST_OBJECT:
				return convertSearchEntryModeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST_OBJECT:
				return convertSearchParamTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SLICING_RULES_LIST_OBJECT:
				return convertSlicingRulesListObjectToString(eDataType, instanceValue);
			case FhirPackage.SLOT_STATUS_LIST_OBJECT:
				return convertSlotStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.SPECIAL_VALUES_LIST_OBJECT:
				return convertSpecialValuesListObjectToString(eDataType, instanceValue);
			case FhirPackage.STRING_PRIMITIVE:
				return convertStringPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.STRUCTURE_DEFINITION_TYPE_LIST_OBJECT:
				return convertStructureDefinitionTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST_OBJECT:
				return convertSubscriptionChannelTypeListObjectToString(eDataType, instanceValue);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST_OBJECT:
				return convertSubscriptionStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_DISPENSE_STATUS_LIST_OBJECT:
				return convertSupplyDispenseStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.SUPPLY_STATUS_LIST_OBJECT:
				return convertSupplyStatusListObjectToString(eDataType, instanceValue);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST_OBJECT:
				return convertSystemRestfulInteractionListObjectToString(eDataType, instanceValue);
			case FhirPackage.TIME_PRIMITIVE:
				return convertTimePrimitiveToString(eDataType, instanceValue);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST_OBJECT:
				return convertTypeRestfulInteractionListObjectToString(eDataType, instanceValue);
			case FhirPackage.UNITS_OF_TIME_LIST_OBJECT:
				return convertUnitsOfTimeListObjectToString(eDataType, instanceValue);
			case FhirPackage.UNSIGNED_INT_PRIMITIVE:
				return convertUnsignedIntPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.URI_PRIMITIVE:
				return convertUriPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.USE_LIST_OBJECT:
				return convertUseListObjectToString(eDataType, instanceValue);
			case FhirPackage.UUID_PRIMITIVE:
				return convertUuidPrimitiveToString(eDataType, instanceValue);
			case FhirPackage.VISION_BASE_LIST_OBJECT:
				return convertVisionBaseListObjectToString(eDataType, instanceValue);
			case FhirPackage.VISION_EYES_LIST_OBJECT:
				return convertVisionEyesListObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionList createActionList() {
		ActionListImpl actionList = new ActionListImpl();
		return actionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressUse createAddressUse() {
		AddressUseImpl addressUse = new AddressUseImpl();
		return addressUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeGender createAdministrativeGender() {
		AdministrativeGenderImpl administrativeGender = new AdministrativeGenderImpl();
		return administrativeGender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Age createAge() {
		AgeImpl age = new AgeImpl();
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationMode createAggregationMode() {
		AggregationModeImpl aggregationMode = new AggregationModeImpl();
		return aggregationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntolerance createAllergyIntolerance() {
		AllergyIntoleranceImpl allergyIntolerance = new AllergyIntoleranceImpl();
		return allergyIntolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCategory createAllergyIntoleranceCategory() {
		AllergyIntoleranceCategoryImpl allergyIntoleranceCategory = new AllergyIntoleranceCategoryImpl();
		return allergyIntoleranceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCertainty createAllergyIntoleranceCertainty() {
		AllergyIntoleranceCertaintyImpl allergyIntoleranceCertainty = new AllergyIntoleranceCertaintyImpl();
		return allergyIntoleranceCertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCriticality createAllergyIntoleranceCriticality() {
		AllergyIntoleranceCriticalityImpl allergyIntoleranceCriticality = new AllergyIntoleranceCriticalityImpl();
		return allergyIntoleranceCriticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceEvent createAllergyIntoleranceEvent() {
		AllergyIntoleranceEventImpl allergyIntoleranceEvent = new AllergyIntoleranceEventImpl();
		return allergyIntoleranceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSeverity createAllergyIntoleranceSeverity() {
		AllergyIntoleranceSeverityImpl allergyIntoleranceSeverity = new AllergyIntoleranceSeverityImpl();
		return allergyIntoleranceSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceStatus createAllergyIntoleranceStatus() {
		AllergyIntoleranceStatusImpl allergyIntoleranceStatus = new AllergyIntoleranceStatusImpl();
		return allergyIntoleranceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceType createAllergyIntoleranceType() {
		AllergyIntoleranceTypeImpl allergyIntoleranceType = new AllergyIntoleranceTypeImpl();
		return allergyIntoleranceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerFormat createAnswerFormat() {
		AnswerFormatImpl answerFormat = new AnswerFormatImpl();
		return answerFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appointment createAppointment() {
		AppointmentImpl appointment = new AppointmentImpl();
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentParticipant createAppointmentParticipant() {
		AppointmentParticipantImpl appointmentParticipant = new AppointmentParticipantImpl();
		return appointmentParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentResponse createAppointmentResponse() {
		AppointmentResponseImpl appointmentResponse = new AppointmentResponseImpl();
		return appointmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentStatus createAppointmentStatus() {
		AppointmentStatusImpl appointmentStatus = new AppointmentStatusImpl();
		return appointmentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEvent createAuditEvent() {
		AuditEventImpl auditEvent = new AuditEventImpl();
		return auditEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventAction createAuditEventAction() {
		AuditEventActionImpl auditEventAction = new AuditEventActionImpl();
		return auditEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventDetail createAuditEventDetail() {
		AuditEventDetailImpl auditEventDetail = new AuditEventDetailImpl();
		return auditEventDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventEvent createAuditEventEvent() {
		AuditEventEventImpl auditEventEvent = new AuditEventEventImpl();
		return auditEventEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventNetwork createAuditEventNetwork() {
		AuditEventNetworkImpl auditEventNetwork = new AuditEventNetworkImpl();
		return auditEventNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventObject createAuditEventObject() {
		AuditEventObjectImpl auditEventObject = new AuditEventObjectImpl();
		return auditEventObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventObjectLifecycle createAuditEventObjectLifecycle() {
		AuditEventObjectLifecycleImpl auditEventObjectLifecycle = new AuditEventObjectLifecycleImpl();
		return auditEventObjectLifecycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventObjectRole createAuditEventObjectRole() {
		AuditEventObjectRoleImpl auditEventObjectRole = new AuditEventObjectRoleImpl();
		return auditEventObjectRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventObjectType createAuditEventObjectType() {
		AuditEventObjectTypeImpl auditEventObjectType = new AuditEventObjectTypeImpl();
		return auditEventObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventOutcome createAuditEventOutcome() {
		AuditEventOutcomeImpl auditEventOutcome = new AuditEventOutcomeImpl();
		return auditEventOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventParticipant createAuditEventParticipant() {
		AuditEventParticipantImpl auditEventParticipant = new AuditEventParticipantImpl();
		return auditEventParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventParticipantNetworkType createAuditEventParticipantNetworkType() {
		AuditEventParticipantNetworkTypeImpl auditEventParticipantNetworkType = new AuditEventParticipantNetworkTypeImpl();
		return auditEventParticipantNetworkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSource createAuditEventSource() {
		AuditEventSourceImpl auditEventSource = new AuditEventSourceImpl();
		return auditEventSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackboneElement createBackboneElement() {
		BackboneElementImpl backboneElement = new BackboneElementImpl();
		return backboneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary createBase64Binary() {
		Base64BinaryImpl base64Binary = new Base64BinaryImpl();
		return base64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic createBasic() {
		BasicImpl basic = new BasicImpl();
		return basic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary createBinary() {
		BinaryImpl binary = new BinaryImpl();
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrength createBindingStrength() {
		BindingStrengthImpl bindingStrength = new BindingStrengthImpl();
		return bindingStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodySite createBodySite() {
		BodySiteImpl bodySite = new BodySiteImpl();
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle createBundle() {
		BundleImpl bundle = new BundleImpl();
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleEntry createBundleEntry() {
		BundleEntryImpl bundleEntry = new BundleEntryImpl();
		return bundleEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleLink createBundleLink() {
		BundleLinkImpl bundleLink = new BundleLinkImpl();
		return bundleLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleSearch createBundleSearch() {
		BundleSearchImpl bundleSearch = new BundleSearchImpl();
		return bundleSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleTransaction createBundleTransaction() {
		BundleTransactionImpl bundleTransaction = new BundleTransactionImpl();
		return bundleTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleTransactionResponse createBundleTransactionResponse() {
		BundleTransactionResponseImpl bundleTransactionResponse = new BundleTransactionResponseImpl();
		return bundleTransactionResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleType createBundleType() {
		BundleTypeImpl bundleType = new BundleTypeImpl();
		return bundleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlan createCarePlan() {
		CarePlanImpl carePlan = new CarePlanImpl();
		return carePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivity createCarePlanActivity() {
		CarePlanActivityImpl carePlanActivity = new CarePlanActivityImpl();
		return carePlanActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityCategory createCarePlanActivityCategory() {
		CarePlanActivityCategoryImpl carePlanActivityCategory = new CarePlanActivityCategoryImpl();
		return carePlanActivityCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityStatus createCarePlanActivityStatus() {
		CarePlanActivityStatusImpl carePlanActivityStatus = new CarePlanActivityStatusImpl();
		return carePlanActivityStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanDetail createCarePlanDetail() {
		CarePlanDetailImpl carePlanDetail = new CarePlanDetailImpl();
		return carePlanDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanParticipant createCarePlanParticipant() {
		CarePlanParticipantImpl carePlanParticipant = new CarePlanParticipantImpl();
		return carePlanParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanStatus createCarePlanStatus() {
		CarePlanStatusImpl carePlanStatus = new CarePlanStatusImpl();
		return carePlanStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim createClaim() {
		ClaimImpl claim = new ClaimImpl();
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimCoverage createClaimCoverage() {
		ClaimCoverageImpl claimCoverage = new ClaimCoverageImpl();
		return claimCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimDetail createClaimDetail() {
		ClaimDetailImpl claimDetail = new ClaimDetailImpl();
		return claimDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimDiagnosis createClaimDiagnosis() {
		ClaimDiagnosisImpl claimDiagnosis = new ClaimDiagnosisImpl();
		return claimDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimItem createClaimItem() {
		ClaimItemImpl claimItem = new ClaimItemImpl();
		return claimItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimMissingTeeth createClaimMissingTeeth() {
		ClaimMissingTeethImpl claimMissingTeeth = new ClaimMissingTeethImpl();
		return claimMissingTeeth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimPayee createClaimPayee() {
		ClaimPayeeImpl claimPayee = new ClaimPayeeImpl();
		return claimPayee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimProsthesis createClaimProsthesis() {
		ClaimProsthesisImpl claimProsthesis = new ClaimProsthesisImpl();
		return claimProsthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponse createClaimResponse() {
		ClaimResponseImpl claimResponse = new ClaimResponseImpl();
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseAddItem createClaimResponseAddItem() {
		ClaimResponseAddItemImpl claimResponseAddItem = new ClaimResponseAddItemImpl();
		return claimResponseAddItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseAdjudication createClaimResponseAdjudication() {
		ClaimResponseAdjudicationImpl claimResponseAdjudication = new ClaimResponseAdjudicationImpl();
		return claimResponseAdjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseAdjudication1 createClaimResponseAdjudication1() {
		ClaimResponseAdjudication1Impl claimResponseAdjudication1 = new ClaimResponseAdjudication1Impl();
		return claimResponseAdjudication1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseAdjudication2 createClaimResponseAdjudication2() {
		ClaimResponseAdjudication2Impl claimResponseAdjudication2 = new ClaimResponseAdjudication2Impl();
		return claimResponseAdjudication2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseAdjudication3 createClaimResponseAdjudication3() {
		ClaimResponseAdjudication3Impl claimResponseAdjudication3 = new ClaimResponseAdjudication3Impl();
		return claimResponseAdjudication3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseAdjudication4 createClaimResponseAdjudication4() {
		ClaimResponseAdjudication4Impl claimResponseAdjudication4 = new ClaimResponseAdjudication4Impl();
		return claimResponseAdjudication4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseCoverage createClaimResponseCoverage() {
		ClaimResponseCoverageImpl claimResponseCoverage = new ClaimResponseCoverageImpl();
		return claimResponseCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseDetail createClaimResponseDetail() {
		ClaimResponseDetailImpl claimResponseDetail = new ClaimResponseDetailImpl();
		return claimResponseDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseDetail1 createClaimResponseDetail1() {
		ClaimResponseDetail1Impl claimResponseDetail1 = new ClaimResponseDetail1Impl();
		return claimResponseDetail1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseError createClaimResponseError() {
		ClaimResponseErrorImpl claimResponseError = new ClaimResponseErrorImpl();
		return claimResponseError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseItem createClaimResponseItem() {
		ClaimResponseItemImpl claimResponseItem = new ClaimResponseItemImpl();
		return claimResponseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseNote createClaimResponseNote() {
		ClaimResponseNoteImpl claimResponseNote = new ClaimResponseNoteImpl();
		return claimResponseNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponseSubDetail createClaimResponseSubDetail() {
		ClaimResponseSubDetailImpl claimResponseSubDetail = new ClaimResponseSubDetailImpl();
		return claimResponseSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimSubDetail createClaimSubDetail() {
		ClaimSubDetailImpl claimSubDetail = new ClaimSubDetailImpl();
		return claimSubDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimType createClaimType() {
		ClaimTypeImpl claimType = new ClaimTypeImpl();
		return claimType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalBaseGender createClinicalBaseGender() {
		ClinicalBaseGenderImpl clinicalBaseGender = new ClinicalBaseGenderImpl();
		return clinicalBaseGender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpression createClinicalImpression() {
		ClinicalImpressionImpl clinicalImpression = new ClinicalImpressionImpl();
		return clinicalImpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionFinding createClinicalImpressionFinding() {
		ClinicalImpressionFindingImpl clinicalImpressionFinding = new ClinicalImpressionFindingImpl();
		return clinicalImpressionFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionInvestigations createClinicalImpressionInvestigations() {
		ClinicalImpressionInvestigationsImpl clinicalImpressionInvestigations = new ClinicalImpressionInvestigationsImpl();
		return clinicalImpressionInvestigations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionRuledOut createClinicalImpressionRuledOut() {
		ClinicalImpressionRuledOutImpl clinicalImpressionRuledOut = new ClinicalImpressionRuledOutImpl();
		return clinicalImpressionRuledOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionStatus createClinicalImpressionStatus() {
		ClinicalImpressionStatusImpl clinicalImpressionStatus = new ClinicalImpressionStatusImpl();
		return clinicalImpressionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept createCodeableConcept() {
		CodeableConceptImpl codeableConcept = new CodeableConceptImpl();
		return codeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding createCoding() {
		CodingImpl coding = new CodingImpl();
		return coding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication createCommunication() {
		CommunicationImpl communication = new CommunicationImpl();
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPayload createCommunicationPayload() {
		CommunicationPayloadImpl communicationPayload = new CommunicationPayloadImpl();
		return communicationPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequest createCommunicationRequest() {
		CommunicationRequestImpl communicationRequest = new CommunicationRequestImpl();
		return communicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequestPayload createCommunicationRequestPayload() {
		CommunicationRequestPayloadImpl communicationRequestPayload = new CommunicationRequestPayloadImpl();
		return communicationRequestPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequestStatus createCommunicationRequestStatus() {
		CommunicationRequestStatusImpl communicationRequestStatus = new CommunicationRequestStatusImpl();
		return communicationRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationStatus createCommunicationStatus() {
		CommunicationStatusImpl communicationStatus = new CommunicationStatusImpl();
		return communicationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttestationMode createCompositionAttestationMode() {
		CompositionAttestationModeImpl compositionAttestationMode = new CompositionAttestationModeImpl();
		return compositionAttestationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttester createCompositionAttester() {
		CompositionAttesterImpl compositionAttester = new CompositionAttesterImpl();
		return compositionAttester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionEvent createCompositionEvent() {
		CompositionEventImpl compositionEvent = new CompositionEventImpl();
		return compositionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionSection createCompositionSection() {
		CompositionSectionImpl compositionSection = new CompositionSectionImpl();
		return compositionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionStatus createCompositionStatus() {
		CompositionStatusImpl compositionStatus = new CompositionStatusImpl();
		return compositionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMap createConceptMap() {
		ConceptMapImpl conceptMap = new ConceptMapImpl();
		return conceptMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapContact createConceptMapContact() {
		ConceptMapContactImpl conceptMapContact = new ConceptMapContactImpl();
		return conceptMapContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapDependsOn createConceptMapDependsOn() {
		ConceptMapDependsOnImpl conceptMapDependsOn = new ConceptMapDependsOnImpl();
		return conceptMapDependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapElement createConceptMapElement() {
		ConceptMapElementImpl conceptMapElement = new ConceptMapElementImpl();
		return conceptMapElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapEquivalence createConceptMapEquivalence() {
		ConceptMapEquivalenceImpl conceptMapEquivalence = new ConceptMapEquivalenceImpl();
		return conceptMapEquivalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapMap createConceptMapMap() {
		ConceptMapMapImpl conceptMapMap = new ConceptMapMapImpl();
		return conceptMapMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionClinicalStatus createConditionClinicalStatus() {
		ConditionClinicalStatusImpl conditionClinicalStatus = new ConditionClinicalStatusImpl();
		return conditionClinicalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionDueTo createConditionDueTo() {
		ConditionDueToImpl conditionDueTo = new ConditionDueToImpl();
		return conditionDueTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEvidence createConditionEvidence() {
		ConditionEvidenceImpl conditionEvidence = new ConditionEvidenceImpl();
		return conditionEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionLocation createConditionLocation() {
		ConditionLocationImpl conditionLocation = new ConditionLocationImpl();
		return conditionLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionOccurredFollowing createConditionOccurredFollowing() {
		ConditionOccurredFollowingImpl conditionOccurredFollowing = new ConditionOccurredFollowingImpl();
		return conditionOccurredFollowing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionStage createConditionStage() {
		ConditionStageImpl conditionStage = new ConditionStageImpl();
		return conditionStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conformance createConformance() {
		ConformanceImpl conformance = new ConformanceImpl();
		return conformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceCertificate createConformanceCertificate() {
		ConformanceCertificateImpl conformanceCertificate = new ConformanceCertificateImpl();
		return conformanceCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceContact createConformanceContact() {
		ConformanceContactImpl conformanceContact = new ConformanceContactImpl();
		return conformanceContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceDocument createConformanceDocument() {
		ConformanceDocumentImpl conformanceDocument = new ConformanceDocumentImpl();
		return conformanceDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceEvent createConformanceEvent() {
		ConformanceEventImpl conformanceEvent = new ConformanceEventImpl();
		return conformanceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceEventMode createConformanceEventMode() {
		ConformanceEventModeImpl conformanceEventMode = new ConformanceEventModeImpl();
		return conformanceEventMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceImplementation createConformanceImplementation() {
		ConformanceImplementationImpl conformanceImplementation = new ConformanceImplementationImpl();
		return conformanceImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceInteraction createConformanceInteraction() {
		ConformanceInteractionImpl conformanceInteraction = new ConformanceInteractionImpl();
		return conformanceInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceInteraction1 createConformanceInteraction1() {
		ConformanceInteraction1Impl conformanceInteraction1 = new ConformanceInteraction1Impl();
		return conformanceInteraction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceMessaging createConformanceMessaging() {
		ConformanceMessagingImpl conformanceMessaging = new ConformanceMessagingImpl();
		return conformanceMessaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceOperation createConformanceOperation() {
		ConformanceOperationImpl conformanceOperation = new ConformanceOperationImpl();
		return conformanceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceResource createConformanceResource() {
		ConformanceResourceImpl conformanceResource = new ConformanceResourceImpl();
		return conformanceResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceResourceStatus createConformanceResourceStatus() {
		ConformanceResourceStatusImpl conformanceResourceStatus = new ConformanceResourceStatusImpl();
		return conformanceResourceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceRest createConformanceRest() {
		ConformanceRestImpl conformanceRest = new ConformanceRestImpl();
		return conformanceRest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceSearchParam createConformanceSearchParam() {
		ConformanceSearchParamImpl conformanceSearchParam = new ConformanceSearchParamImpl();
		return conformanceSearchParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceSecurity createConformanceSecurity() {
		ConformanceSecurityImpl conformanceSecurity = new ConformanceSecurityImpl();
		return conformanceSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceSoftware createConformanceSoftware() {
		ConformanceSoftwareImpl conformanceSoftware = new ConformanceSoftwareImpl();
		return conformanceSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceUseContext createConformanceUseContext() {
		ConformanceUseContextImpl conformanceUseContext = new ConformanceUseContextImpl();
		return conformanceUseContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSeverity createConstraintSeverity() {
		ConstraintSeverityImpl constraintSeverity = new ConstraintSeverityImpl();
		return constraintSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPoint createContactPoint() {
		ContactPointImpl contactPoint = new ContactPointImpl();
		return contactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointSystem createContactPointSystem() {
		ContactPointSystemImpl contactPointSystem = new ContactPointSystemImpl();
		return contactPointSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointUse createContactPointUse() {
		ContactPointUseImpl contactPointUse = new ContactPointUseImpl();
		return contactPointUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractActor createContractActor() {
		ContractActorImpl contractActor = new ContractActorImpl();
		return contractActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractActor1 createContractActor1() {
		ContractActor1Impl contractActor1 = new ContractActor1Impl();
		return contractActor1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractFriendly createContractFriendly() {
		ContractFriendlyImpl contractFriendly = new ContractFriendlyImpl();
		return contractFriendly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractLegal createContractLegal() {
		ContractLegalImpl contractLegal = new ContractLegalImpl();
		return contractLegal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractRule createContractRule() {
		ContractRuleImpl contractRule = new ContractRuleImpl();
		return contractRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractSigner createContractSigner() {
		ContractSignerImpl contractSigner = new ContractSignerImpl();
		return contractSigner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTerm createContractTerm() {
		ContractTermImpl contractTerm = new ContractTermImpl();
		return contractTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractValuedItem createContractValuedItem() {
		ContractValuedItemImpl contractValuedItem = new ContractValuedItemImpl();
		return contractValuedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractValuedItem1 createContractValuedItem1() {
		ContractValuedItem1Impl contractValuedItem1 = new ContractValuedItem1Impl();
		return contractValuedItem1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contraindication createContraindication() {
		ContraindicationImpl contraindication = new ContraindicationImpl();
		return contraindication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContraindicationMitigation createContraindicationMitigation() {
		ContraindicationMitigationImpl contraindicationMitigation = new ContraindicationMitigationImpl();
		return contraindicationMitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Count createCount() {
		CountImpl count = new CountImpl();
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage createCoverage() {
		CoverageImpl coverage = new CoverageImpl();
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAbsentReason createDataAbsentReason() {
		DataAbsentReasonImpl dataAbsentReason = new DataAbsentReasonImpl();
		return dataAbsentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElement createDataElement() {
		DataElementImpl dataElement = new DataElementImpl();
		return dataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementContact createDataElementContact() {
		DataElementContactImpl dataElementContact = new DataElementContactImpl();
		return dataElementContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementMapping createDataElementMapping() {
		DataElementMappingImpl dataElementMapping = new DataElementMappingImpl();
		return dataElementMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementSpecificity createDataElementSpecificity() {
		DataElementSpecificityImpl dataElementSpecificity = new DataElementSpecificityImpl();
		return dataElementSpecificity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaysOfWeek createDaysOfWeek() {
		DaysOfWeekImpl daysOfWeek = new DaysOfWeekImpl();
		return daysOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal createDecimal() {
		DecimalImpl decimal = new DecimalImpl();
		return decimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceComponent createDeviceComponent() {
		DeviceComponentImpl deviceComponent = new DeviceComponentImpl();
		return deviceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceComponentProductionSpecification createDeviceComponentProductionSpecification() {
		DeviceComponentProductionSpecificationImpl deviceComponentProductionSpecification = new DeviceComponentProductionSpecificationImpl();
		return deviceComponentProductionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetric createDeviceMetric() {
		DeviceMetricImpl deviceMetric = new DeviceMetricImpl();
		return deviceMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibration createDeviceMetricCalibration() {
		DeviceMetricCalibrationImpl deviceMetricCalibration = new DeviceMetricCalibrationImpl();
		return deviceMetricCalibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationState createDeviceMetricCalibrationState() {
		DeviceMetricCalibrationStateImpl deviceMetricCalibrationState = new DeviceMetricCalibrationStateImpl();
		return deviceMetricCalibrationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationType createDeviceMetricCalibrationType() {
		DeviceMetricCalibrationTypeImpl deviceMetricCalibrationType = new DeviceMetricCalibrationTypeImpl();
		return deviceMetricCalibrationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCategory createDeviceMetricCategory() {
		DeviceMetricCategoryImpl deviceMetricCategory = new DeviceMetricCategoryImpl();
		return deviceMetricCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricColor createDeviceMetricColor() {
		DeviceMetricColorImpl deviceMetricColor = new DeviceMetricColorImpl();
		return deviceMetricColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricOperationalStatus createDeviceMetricOperationalStatus() {
		DeviceMetricOperationalStatusImpl deviceMetricOperationalStatus = new DeviceMetricOperationalStatusImpl();
		return deviceMetricOperationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceStatus createDeviceStatus() {
		DeviceStatusImpl deviceStatus = new DeviceStatusImpl();
		return deviceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseRequest createDeviceUseRequest() {
		DeviceUseRequestImpl deviceUseRequest = new DeviceUseRequestImpl();
		return deviceUseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseRequestPriority createDeviceUseRequestPriority() {
		DeviceUseRequestPriorityImpl deviceUseRequestPriority = new DeviceUseRequestPriorityImpl();
		return deviceUseRequestPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseRequestStatus createDeviceUseRequestStatus() {
		DeviceUseRequestStatusImpl deviceUseRequestStatus = new DeviceUseRequestStatusImpl();
		return deviceUseRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseStatement createDeviceUseStatement() {
		DeviceUseStatementImpl deviceUseStatement = new DeviceUseStatementImpl();
		return deviceUseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrder createDiagnosticOrder() {
		DiagnosticOrderImpl diagnosticOrder = new DiagnosticOrderImpl();
		return diagnosticOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrderEvent createDiagnosticOrderEvent() {
		DiagnosticOrderEventImpl diagnosticOrderEvent = new DiagnosticOrderEventImpl();
		return diagnosticOrderEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrderItem createDiagnosticOrderItem() {
		DiagnosticOrderItemImpl diagnosticOrderItem = new DiagnosticOrderItemImpl();
		return diagnosticOrderItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrderPriority createDiagnosticOrderPriority() {
		DiagnosticOrderPriorityImpl diagnosticOrderPriority = new DiagnosticOrderPriorityImpl();
		return diagnosticOrderPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrderStatus createDiagnosticOrderStatus() {
		DiagnosticOrderStatusImpl diagnosticOrderStatus = new DiagnosticOrderStatusImpl();
		return diagnosticOrderStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReport createDiagnosticReport() {
		DiagnosticReportImpl diagnosticReport = new DiagnosticReportImpl();
		return diagnosticReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportImage createDiagnosticReportImage() {
		DiagnosticReportImageImpl diagnosticReportImage = new DiagnosticReportImageImpl();
		return diagnosticReportImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportStatus createDiagnosticReportStatus() {
		DiagnosticReportStatusImpl diagnosticReportStatus = new DiagnosticReportStatusImpl();
		return diagnosticReportStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalMediaType createDigitalMediaType() {
		DigitalMediaTypeImpl digitalMediaType = new DigitalMediaTypeImpl();
		return digitalMediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distance createDistance() {
		DistanceImpl distance = new DistanceImpl();
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentManifest createDocumentManifest() {
		DocumentManifestImpl documentManifest = new DocumentManifestImpl();
		return documentManifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentManifestContent createDocumentManifestContent() {
		DocumentManifestContentImpl documentManifestContent = new DocumentManifestContentImpl();
		return documentManifestContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentManifestRelated createDocumentManifestRelated() {
		DocumentManifestRelatedImpl documentManifestRelated = new DocumentManifestRelatedImpl();
		return documentManifestRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentMode createDocumentMode() {
		DocumentModeImpl documentMode = new DocumentModeImpl();
		return documentMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReference createDocumentReference() {
		DocumentReferenceImpl documentReference = new DocumentReferenceImpl();
		return documentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceContext createDocumentReferenceContext() {
		DocumentReferenceContextImpl documentReferenceContext = new DocumentReferenceContextImpl();
		return documentReferenceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceRelated createDocumentReferenceRelated() {
		DocumentReferenceRelatedImpl documentReferenceRelated = new DocumentReferenceRelatedImpl();
		return documentReferenceRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceRelatesTo createDocumentReferenceRelatesTo() {
		DocumentReferenceRelatesToImpl documentReferenceRelatesTo = new DocumentReferenceRelatesToImpl();
		return documentReferenceRelatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceStatus createDocumentReferenceStatus() {
		DocumentReferenceStatusImpl documentReferenceStatus = new DocumentReferenceStatusImpl();
		return documentReferenceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRelationshipType createDocumentRelationshipType() {
		DocumentRelationshipTypeImpl documentRelationshipType = new DocumentRelationshipTypeImpl();
		return documentRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainResource createDomainResource() {
		DomainResourceImpl domainResource = new DomainResourceImpl();
		return domainResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDuration() {
		DurationImpl duration = new DurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition createElementDefinition() {
		ElementDefinitionImpl elementDefinition = new ElementDefinitionImpl();
		return elementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionBinding createElementDefinitionBinding() {
		ElementDefinitionBindingImpl elementDefinitionBinding = new ElementDefinitionBindingImpl();
		return elementDefinitionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionConstraint createElementDefinitionConstraint() {
		ElementDefinitionConstraintImpl elementDefinitionConstraint = new ElementDefinitionConstraintImpl();
		return elementDefinitionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionMapping createElementDefinitionMapping() {
		ElementDefinitionMappingImpl elementDefinitionMapping = new ElementDefinitionMappingImpl();
		return elementDefinitionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionSlicing createElementDefinitionSlicing() {
		ElementDefinitionSlicingImpl elementDefinitionSlicing = new ElementDefinitionSlicingImpl();
		return elementDefinitionSlicing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionType createElementDefinitionType() {
		ElementDefinitionTypeImpl elementDefinitionType = new ElementDefinitionTypeImpl();
		return elementDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityRequest createEligibilityRequest() {
		EligibilityRequestImpl eligibilityRequest = new EligibilityRequestImpl();
		return eligibilityRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponse createEligibilityResponse() {
		EligibilityResponseImpl eligibilityResponse = new EligibilityResponseImpl();
		return eligibilityResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter createEncounter() {
		EncounterImpl encounter = new EncounterImpl();
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterClass createEncounterClass() {
		EncounterClassImpl encounterClass = new EncounterClassImpl();
		return encounterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterHospitalization createEncounterHospitalization() {
		EncounterHospitalizationImpl encounterHospitalization = new EncounterHospitalizationImpl();
		return encounterHospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocation createEncounterLocation() {
		EncounterLocationImpl encounterLocation = new EncounterLocationImpl();
		return encounterLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocationStatus createEncounterLocationStatus() {
		EncounterLocationStatusImpl encounterLocationStatus = new EncounterLocationStatusImpl();
		return encounterLocationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterParticipant createEncounterParticipant() {
		EncounterParticipantImpl encounterParticipant = new EncounterParticipantImpl();
		return encounterParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterState createEncounterState() {
		EncounterStateImpl encounterState = new EncounterStateImpl();
		return encounterState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStatusHistory createEncounterStatusHistory() {
		EncounterStatusHistoryImpl encounterStatusHistory = new EncounterStatusHistoryImpl();
		return encounterStatusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentRequest createEnrollmentRequest() {
		EnrollmentRequestImpl enrollmentRequest = new EnrollmentRequestImpl();
		return enrollmentRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentResponse createEnrollmentResponse() {
		EnrollmentResponseImpl enrollmentResponse = new EnrollmentResponseImpl();
		return enrollmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCare createEpisodeOfCare() {
		EpisodeOfCareImpl episodeOfCare = new EpisodeOfCareImpl();
		return episodeOfCare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareCareTeam createEpisodeOfCareCareTeam() {
		EpisodeOfCareCareTeamImpl episodeOfCareCareTeam = new EpisodeOfCareCareTeamImpl();
		return episodeOfCareCareTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatus createEpisodeOfCareStatus() {
		EpisodeOfCareStatusImpl episodeOfCareStatus = new EpisodeOfCareStatusImpl();
		return episodeOfCareStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatusHistory createEpisodeOfCareStatusHistory() {
		EpisodeOfCareStatusHistoryImpl episodeOfCareStatusHistory = new EpisodeOfCareStatusHistoryImpl();
		return episodeOfCareStatusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTiming createEventTiming() {
		EventTimingImpl eventTiming = new EventTimingImpl();
		return eventTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefit createExplanationOfBenefit() {
		ExplanationOfBenefitImpl explanationOfBenefit = new ExplanationOfBenefitImpl();
		return explanationOfBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionContext createExtensionContext() {
		ExtensionContextImpl extensionContext = new ExtensionContextImpl();
		return extensionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMemberHistory createFamilyMemberHistory() {
		FamilyMemberHistoryImpl familyMemberHistory = new FamilyMemberHistoryImpl();
		return familyMemberHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMemberHistoryCondition createFamilyMemberHistoryCondition() {
		FamilyMemberHistoryConditionImpl familyMemberHistoryCondition = new FamilyMemberHistoryConditionImpl();
		return familyMemberHistoryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRDefinedType createFHIRDefinedType() {
		FHIRDefinedTypeImpl fhirDefinedType = new FHIRDefinedTypeImpl();
		return fhirDefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperator createFilterOperator() {
		FilterOperatorImpl filterOperator = new FilterOperatorImpl();
		return filterOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flag createFlag() {
		FlagImpl flag = new FlagImpl();
		return flag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagStatus createFlagStatus() {
		FlagStatusImpl flagStatus = new FlagStatusImpl();
		return flagStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalOutcome createGoalOutcome() {
		GoalOutcomeImpl goalOutcome = new GoalOutcomeImpl();
		return goalOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalStatus createGoalStatus() {
		GoalStatusImpl goalStatus = new GoalStatusImpl();
		return goalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupCharacteristic createGroupCharacteristic() {
		GroupCharacteristicImpl groupCharacteristic = new GroupCharacteristicImpl();
		return groupCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupType createGroupType() {
		GroupTypeImpl groupType = new GroupTypeImpl();
		return groupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareService createHealthcareService() {
		HealthcareServiceImpl healthcareService = new HealthcareServiceImpl();
		return healthcareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareServiceAvailableTime createHealthcareServiceAvailableTime() {
		HealthcareServiceAvailableTimeImpl healthcareServiceAvailableTime = new HealthcareServiceAvailableTimeImpl();
		return healthcareServiceAvailableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareServiceNotAvailable createHealthcareServiceNotAvailable() {
		HealthcareServiceNotAvailableImpl healthcareServiceNotAvailable = new HealthcareServiceNotAvailableImpl();
		return healthcareServiceNotAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareServiceServiceType createHealthcareServiceServiceType() {
		HealthcareServiceServiceTypeImpl healthcareServiceServiceType = new HealthcareServiceServiceTypeImpl();
		return healthcareServiceServiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerb createHTTPVerb() {
		HTTPVerbImpl httpVerb = new HTTPVerbImpl();
		return httpVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanName createHumanName() {
		HumanNameImpl humanName = new HumanNameImpl();
		return humanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id createId() {
		IdImpl id = new IdImpl();
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier createIdentifier() {
		IdentifierImpl identifier = new IdentifierImpl();
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierUse createIdentifierUse() {
		IdentifierUseImpl identifierUse = new IdentifierUseImpl();
		return identifierUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAssuranceLevel createIdentityAssuranceLevel() {
		IdentityAssuranceLevelImpl identityAssuranceLevel = new IdentityAssuranceLevelImpl();
		return identityAssuranceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingModality createImagingModality() {
		ImagingModalityImpl imagingModality = new ImagingModalityImpl();
		return imagingModality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingObjectSelection createImagingObjectSelection() {
		ImagingObjectSelectionImpl imagingObjectSelection = new ImagingObjectSelectionImpl();
		return imagingObjectSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingObjectSelectionFrames createImagingObjectSelectionFrames() {
		ImagingObjectSelectionFramesImpl imagingObjectSelectionFrames = new ImagingObjectSelectionFramesImpl();
		return imagingObjectSelectionFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingObjectSelectionInstance createImagingObjectSelectionInstance() {
		ImagingObjectSelectionInstanceImpl imagingObjectSelectionInstance = new ImagingObjectSelectionInstanceImpl();
		return imagingObjectSelectionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingObjectSelectionSeries createImagingObjectSelectionSeries() {
		ImagingObjectSelectionSeriesImpl imagingObjectSelectionSeries = new ImagingObjectSelectionSeriesImpl();
		return imagingObjectSelectionSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingObjectSelectionStudy createImagingObjectSelectionStudy() {
		ImagingObjectSelectionStudyImpl imagingObjectSelectionStudy = new ImagingObjectSelectionStudyImpl();
		return imagingObjectSelectionStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudy createImagingStudy() {
		ImagingStudyImpl imagingStudy = new ImagingStudyImpl();
		return imagingStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudyInstance createImagingStudyInstance() {
		ImagingStudyInstanceImpl imagingStudyInstance = new ImagingStudyInstanceImpl();
		return imagingStudyInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudySeries createImagingStudySeries() {
		ImagingStudySeriesImpl imagingStudySeries = new ImagingStudySeriesImpl();
		return imagingStudySeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Immunization createImmunization() {
		ImmunizationImpl immunization = new ImmunizationImpl();
		return immunization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationExplanation createImmunizationExplanation() {
		ImmunizationExplanationImpl immunizationExplanation = new ImmunizationExplanationImpl();
		return immunizationExplanation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationReaction createImmunizationReaction() {
		ImmunizationReactionImpl immunizationReaction = new ImmunizationReactionImpl();
		return immunizationReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendation createImmunizationRecommendation() {
		ImmunizationRecommendationImpl immunizationRecommendation = new ImmunizationRecommendationImpl();
		return immunizationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationDateCriterion createImmunizationRecommendationDateCriterion() {
		ImmunizationRecommendationDateCriterionImpl immunizationRecommendationDateCriterion = new ImmunizationRecommendationDateCriterionImpl();
		return immunizationRecommendationDateCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationProtocol createImmunizationRecommendationProtocol() {
		ImmunizationRecommendationProtocolImpl immunizationRecommendationProtocol = new ImmunizationRecommendationProtocolImpl();
		return immunizationRecommendationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendationRecommendation createImmunizationRecommendationRecommendation() {
		ImmunizationRecommendationRecommendationImpl immunizationRecommendationRecommendation = new ImmunizationRecommendationRecommendationImpl();
		return immunizationRecommendationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationVaccinationProtocol createImmunizationVaccinationProtocol() {
		ImmunizationVaccinationProtocolImpl immunizationVaccinationProtocol = new ImmunizationVaccinationProtocolImpl();
		return immunizationVaccinationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceAvailability createInstanceAvailability() {
		InstanceAvailabilityImpl instanceAvailability = new InstanceAvailabilityImpl();
		return instanceAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant createInstant() {
		InstantImpl instant = new InstantImpl();
		return instant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueSeverity createIssueSeverity() {
		IssueSeverityImpl issueSeverity = new IssueSeverityImpl();
		return issueSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkType() {
		LinkTypeImpl linkType = new LinkTypeImpl();
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListEntry createListEntry() {
		ListEntryImpl listEntry = new ListEntryImpl();
		return listEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListMode createListMode() {
		ListModeImpl listMode = new ListModeImpl();
		return listMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStatus createListStatus() {
		ListStatusImpl listStatus = new ListStatusImpl();
		return listStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationMode createLocationMode() {
		LocationModeImpl locationMode = new LocationModeImpl();
		return locationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationPosition createLocationPosition() {
		LocationPositionImpl locationPosition = new LocationPositionImpl();
		return locationPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationStatus createLocationStatus() {
		LocationStatusImpl locationStatus = new LocationStatusImpl();
		return locationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaritalStatus createMaritalStatus() {
		MaritalStatusImpl maritalStatus = new MaritalStatusImpl();
		return maritalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasmntPrinciple createMeasmntPrinciple() {
		MeasmntPrincipleImpl measmntPrinciple = new MeasmntPrincipleImpl();
		return measmntPrinciple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Media createMedia() {
		MediaImpl media = new MediaImpl();
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication createMedication() {
		MedicationImpl medication = new MedicationImpl();
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministration createMedicationAdministration() {
		MedicationAdministrationImpl medicationAdministration = new MedicationAdministrationImpl();
		return medicationAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationDosage createMedicationAdministrationDosage() {
		MedicationAdministrationDosageImpl medicationAdministrationDosage = new MedicationAdministrationDosageImpl();
		return medicationAdministrationDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationStatus createMedicationAdministrationStatus() {
		MedicationAdministrationStatusImpl medicationAdministrationStatus = new MedicationAdministrationStatusImpl();
		return medicationAdministrationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationBatch createMedicationBatch() {
		MedicationBatchImpl medicationBatch = new MedicationBatchImpl();
		return medicationBatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationContent createMedicationContent() {
		MedicationContentImpl medicationContent = new MedicationContentImpl();
		return medicationContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispense createMedicationDispense() {
		MedicationDispenseImpl medicationDispense = new MedicationDispenseImpl();
		return medicationDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseDosageInstruction createMedicationDispenseDosageInstruction() {
		MedicationDispenseDosageInstructionImpl medicationDispenseDosageInstruction = new MedicationDispenseDosageInstructionImpl();
		return medicationDispenseDosageInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseStatus createMedicationDispenseStatus() {
		MedicationDispenseStatusImpl medicationDispenseStatus = new MedicationDispenseStatusImpl();
		return medicationDispenseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseSubstitution createMedicationDispenseSubstitution() {
		MedicationDispenseSubstitutionImpl medicationDispenseSubstitution = new MedicationDispenseSubstitutionImpl();
		return medicationDispenseSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationIngredient createMedicationIngredient() {
		MedicationIngredientImpl medicationIngredient = new MedicationIngredientImpl();
		return medicationIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKind createMedicationKind() {
		MedicationKindImpl medicationKind = new MedicationKindImpl();
		return medicationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPackage createMedicationPackage() {
		MedicationPackageImpl medicationPackage = new MedicationPackageImpl();
		return medicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPrescription createMedicationPrescription() {
		MedicationPrescriptionImpl medicationPrescription = new MedicationPrescriptionImpl();
		return medicationPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPrescriptionDispense createMedicationPrescriptionDispense() {
		MedicationPrescriptionDispenseImpl medicationPrescriptionDispense = new MedicationPrescriptionDispenseImpl();
		return medicationPrescriptionDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPrescriptionDosageInstruction createMedicationPrescriptionDosageInstruction() {
		MedicationPrescriptionDosageInstructionImpl medicationPrescriptionDosageInstruction = new MedicationPrescriptionDosageInstructionImpl();
		return medicationPrescriptionDosageInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPrescriptionStatus createMedicationPrescriptionStatus() {
		MedicationPrescriptionStatusImpl medicationPrescriptionStatus = new MedicationPrescriptionStatusImpl();
		return medicationPrescriptionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPrescriptionSubstitution createMedicationPrescriptionSubstitution() {
		MedicationPrescriptionSubstitutionImpl medicationPrescriptionSubstitution = new MedicationPrescriptionSubstitutionImpl();
		return medicationPrescriptionSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationProduct createMedicationProduct() {
		MedicationProductImpl medicationProduct = new MedicationProductImpl();
		return medicationProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatement createMedicationStatement() {
		MedicationStatementImpl medicationStatement = new MedicationStatementImpl();
		return medicationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementDosage createMedicationStatementDosage() {
		MedicationStatementDosageImpl medicationStatementDosage = new MedicationStatementDosageImpl();
		return medicationStatementDosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementStatus createMedicationStatementStatus() {
		MedicationStatementStatusImpl medicationStatementStatus = new MedicationStatementStatusImpl();
		return medicationStatementStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEvent createMessageEvent() {
		MessageEventImpl messageEvent = new MessageEventImpl();
		return messageEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeader createMessageHeader() {
		MessageHeaderImpl messageHeader = new MessageHeaderImpl();
		return messageHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderDestination createMessageHeaderDestination() {
		MessageHeaderDestinationImpl messageHeaderDestination = new MessageHeaderDestinationImpl();
		return messageHeaderDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderResponse createMessageHeaderResponse() {
		MessageHeaderResponseImpl messageHeaderResponse = new MessageHeaderResponseImpl();
		return messageHeaderResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderSource createMessageHeaderSource() {
		MessageHeaderSourceImpl messageHeaderSource = new MessageHeaderSourceImpl();
		return messageHeaderSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSignificanceCategory createMessageSignificanceCategory() {
		MessageSignificanceCategoryImpl messageSignificanceCategory = new MessageSignificanceCategoryImpl();
		return messageSignificanceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta createMeta() {
		MetaImpl meta = new MetaImpl();
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modality createModality() {
		ModalityImpl modality = new ModalityImpl();
		return modality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money createMoney() {
		MoneyImpl money = new MoneyImpl();
		return money;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameUse createNameUse() {
		NameUseImpl nameUse = new NameUseImpl();
		return nameUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystem createNamingSystem() {
		NamingSystemImpl namingSystem = new NamingSystemImpl();
		return namingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemContact createNamingSystemContact() {
		NamingSystemContactImpl namingSystemContact = new NamingSystemContactImpl();
		return namingSystemContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemIdentifierType createNamingSystemIdentifierType() {
		NamingSystemIdentifierTypeImpl namingSystemIdentifierType = new NamingSystemIdentifierTypeImpl();
		return namingSystemIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemType createNamingSystemType() {
		NamingSystemTypeImpl namingSystemType = new NamingSystemTypeImpl();
		return namingSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemUniqueId createNamingSystemUniqueId() {
		NamingSystemUniqueIdImpl namingSystemUniqueId = new NamingSystemUniqueIdImpl();
		return namingSystemUniqueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Narrative createNarrative() {
		NarrativeImpl narrative = new NarrativeImpl();
		return narrative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NarrativeStatus createNarrativeStatus() {
		NarrativeStatusImpl narrativeStatus = new NarrativeStatusImpl();
		return narrativeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteType createNoteType() {
		NoteTypeImpl noteType = new NoteTypeImpl();
		return noteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrder createNutritionOrder() {
		NutritionOrderImpl nutritionOrder = new NutritionOrderImpl();
		return nutritionOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderEnteralFormula createNutritionOrderEnteralFormula() {
		NutritionOrderEnteralFormulaImpl nutritionOrderEnteralFormula = new NutritionOrderEnteralFormulaImpl();
		return nutritionOrderEnteralFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderNutrient createNutritionOrderNutrient() {
		NutritionOrderNutrientImpl nutritionOrderNutrient = new NutritionOrderNutrientImpl();
		return nutritionOrderNutrient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderOralDiet createNutritionOrderOralDiet() {
		NutritionOrderOralDietImpl nutritionOrderOralDiet = new NutritionOrderOralDietImpl();
		return nutritionOrderOralDiet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderStatus createNutritionOrderStatus() {
		NutritionOrderStatusImpl nutritionOrderStatus = new NutritionOrderStatusImpl();
		return nutritionOrderStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderSupplement createNutritionOrderSupplement() {
		NutritionOrderSupplementImpl nutritionOrderSupplement = new NutritionOrderSupplementImpl();
		return nutritionOrderSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderTexture createNutritionOrderTexture() {
		NutritionOrderTextureImpl nutritionOrderTexture = new NutritionOrderTextureImpl();
		return nutritionOrderTexture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation createObservation() {
		ObservationImpl observation = new ObservationImpl();
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationReferenceRange createObservationReferenceRange() {
		ObservationReferenceRangeImpl observationReferenceRange = new ObservationReferenceRangeImpl();
		return observationReferenceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRelated createObservationRelated() {
		ObservationRelatedImpl observationRelated = new ObservationRelatedImpl();
		return observationRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRelationshipType createObservationRelationshipType() {
		ObservationRelationshipTypeImpl observationRelationshipType = new ObservationRelationshipTypeImpl();
		return observationRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationReliability createObservationReliability() {
		ObservationReliabilityImpl observationReliability = new ObservationReliabilityImpl();
		return observationReliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationStatus createObservationStatus() {
		ObservationStatusImpl observationStatus = new ObservationStatusImpl();
		return observationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid createOid() {
		OidImpl oid = new OidImpl();
		return oid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinition createOperationDefinition() {
		OperationDefinitionImpl operationDefinition = new OperationDefinitionImpl();
		return operationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionContact createOperationDefinitionContact() {
		OperationDefinitionContactImpl operationDefinitionContact = new OperationDefinitionContactImpl();
		return operationDefinitionContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionParameter createOperationDefinitionParameter() {
		OperationDefinitionParameterImpl operationDefinitionParameter = new OperationDefinitionParameterImpl();
		return operationDefinitionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinitionPart createOperationDefinitionPart() {
		OperationDefinitionPartImpl operationDefinitionPart = new OperationDefinitionPartImpl();
		return operationDefinitionPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKind createOperationKind() {
		OperationKindImpl operationKind = new OperationKindImpl();
		return operationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcome createOperationOutcome() {
		OperationOutcomeImpl operationOutcome = new OperationOutcomeImpl();
		return operationOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcomeIssue createOperationOutcomeIssue() {
		OperationOutcomeIssueImpl operationOutcomeIssue = new OperationOutcomeIssueImpl();
		return operationOutcomeIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterUse createOperationParameterUse() {
		OperationParameterUseImpl operationParameterUse = new OperationParameterUseImpl();
		return operationParameterUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderResponse createOrderResponse() {
		OrderResponseImpl orderResponse = new OrderResponseImpl();
		return orderResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderStatus createOrderStatus() {
		OrderStatusImpl orderStatus = new OrderStatusImpl();
		return orderStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderWhen createOrderWhen() {
		OrderWhenImpl orderWhen = new OrderWhenImpl();
		return orderWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationContact createOrganizationContact() {
		OrganizationContactImpl organizationContact = new OrganizationContactImpl();
		return organizationContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters createParameters() {
		ParametersImpl parameters = new ParametersImpl();
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersParameter createParametersParameter() {
		ParametersParameterImpl parametersParameter = new ParametersParameterImpl();
		return parametersParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersPart createParametersPart() {
		ParametersPartImpl parametersPart = new ParametersPartImpl();
		return parametersPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRequired createParticipantRequired() {
		ParticipantRequiredImpl participantRequired = new ParticipantRequiredImpl();
		return participantRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantStatus createParticipantStatus() {
		ParticipantStatusImpl participantStatus = new ParticipantStatusImpl();
		return participantStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationStatus createParticipationStatus() {
		ParticipationStatusImpl participationStatus = new ParticipationStatusImpl();
		return participationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientAnimal createPatientAnimal() {
		PatientAnimalImpl patientAnimal = new PatientAnimalImpl();
		return patientAnimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientCommunication createPatientCommunication() {
		PatientCommunicationImpl patientCommunication = new PatientCommunicationImpl();
		return patientCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientContact createPatientContact() {
		PatientContactImpl patientContact = new PatientContactImpl();
		return patientContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientLink createPatientLink() {
		PatientLinkImpl patientLink = new PatientLinkImpl();
		return patientLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentNotice createPaymentNotice() {
		PaymentNoticeImpl paymentNotice = new PaymentNoticeImpl();
		return paymentNotice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliation createPaymentReconciliation() {
		PaymentReconciliationImpl paymentReconciliation = new PaymentReconciliationImpl();
		return paymentReconciliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliationDetail createPaymentReconciliationDetail() {
		PaymentReconciliationDetailImpl paymentReconciliationDetail = new PaymentReconciliationDetailImpl();
		return paymentReconciliationDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliationNote createPaymentReconciliationNote() {
		PaymentReconciliationNoteImpl paymentReconciliationNote = new PaymentReconciliationNoteImpl();
		return paymentReconciliationNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period createPeriod() {
		PeriodImpl period = new PeriodImpl();
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonLink createPersonLink() {
		PersonLinkImpl personLink = new PersonLinkImpl();
		return personLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt createPositiveInt() {
		PositiveIntImpl positiveInt = new PositiveIntImpl();
		return positiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner createPractitioner() {
		PractitionerImpl practitioner = new PractitionerImpl();
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerPractitionerRole createPractitionerPractitionerRole() {
		PractitionerPractitionerRoleImpl practitionerPractitionerRole = new PractitionerPractitionerRoleImpl();
		return practitionerPractitionerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PractitionerQualification createPractitionerQualification() {
		PractitionerQualificationImpl practitionerQualification = new PractitionerQualificationImpl();
		return practitionerQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureBodySite createProcedureBodySite() {
		ProcedureBodySiteImpl procedureBodySite = new ProcedureBodySiteImpl();
		return procedureBodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureDevice createProcedureDevice() {
		ProcedureDeviceImpl procedureDevice = new ProcedureDeviceImpl();
		return procedureDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedurePerformer createProcedurePerformer() {
		ProcedurePerformerImpl procedurePerformer = new ProcedurePerformerImpl();
		return procedurePerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRelatedItem createProcedureRelatedItem() {
		ProcedureRelatedItemImpl procedureRelatedItem = new ProcedureRelatedItemImpl();
		return procedureRelatedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRelationshipType createProcedureRelationshipType() {
		ProcedureRelationshipTypeImpl procedureRelationshipType = new ProcedureRelationshipTypeImpl();
		return procedureRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequest createProcedureRequest() {
		ProcedureRequestImpl procedureRequest = new ProcedureRequestImpl();
		return procedureRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestBodySite createProcedureRequestBodySite() {
		ProcedureRequestBodySiteImpl procedureRequestBodySite = new ProcedureRequestBodySiteImpl();
		return procedureRequestBodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestPriority createProcedureRequestPriority() {
		ProcedureRequestPriorityImpl procedureRequestPriority = new ProcedureRequestPriorityImpl();
		return procedureRequestPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestStatus createProcedureRequestStatus() {
		ProcedureRequestStatusImpl procedureRequestStatus = new ProcedureRequestStatusImpl();
		return procedureRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureStatus createProcedureStatus() {
		ProcedureStatusImpl procedureStatus = new ProcedureStatusImpl();
		return procedureStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequest createProcessRequest() {
		ProcessRequestImpl processRequest = new ProcessRequestImpl();
		return processRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequestItem createProcessRequestItem() {
		ProcessRequestItemImpl processRequestItem = new ProcessRequestItemImpl();
		return processRequestItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessResponse createProcessResponse() {
		ProcessResponseImpl processResponse = new ProcessResponseImpl();
		return processResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessResponseNotes createProcessResponseNotes() {
		ProcessResponseNotesImpl processResponseNotes = new ProcessResponseNotesImpl();
		return processResponseNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRepresentation createPropertyRepresentation() {
		PropertyRepresentationImpl propertyRepresentation = new PropertyRepresentationImpl();
		return propertyRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provenance createProvenance() {
		ProvenanceImpl provenance = new ProvenanceImpl();
		return provenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceAgent createProvenanceAgent() {
		ProvenanceAgentImpl provenanceAgent = new ProvenanceAgentImpl();
		return provenanceAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntity createProvenanceEntity() {
		ProvenanceEntityImpl provenanceEntity = new ProvenanceEntityImpl();
		return provenanceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntityRole createProvenanceEntityRole() {
		ProvenanceEntityRoleImpl provenanceEntityRole = new ProvenanceEntityRoleImpl();
		return provenanceEntityRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantity() {
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityComparator createQuantityComparator() {
		QuantityComparatorImpl quantityComparator = new QuantityComparatorImpl();
		return quantityComparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire createQuestionnaire() {
		QuestionnaireImpl questionnaire = new QuestionnaireImpl();
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireAnswers createQuestionnaireAnswers() {
		QuestionnaireAnswersImpl questionnaireAnswers = new QuestionnaireAnswersImpl();
		return questionnaireAnswers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireAnswersAnswer createQuestionnaireAnswersAnswer() {
		QuestionnaireAnswersAnswerImpl questionnaireAnswersAnswer = new QuestionnaireAnswersAnswerImpl();
		return questionnaireAnswersAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireAnswersGroup createQuestionnaireAnswersGroup() {
		QuestionnaireAnswersGroupImpl questionnaireAnswersGroup = new QuestionnaireAnswersGroupImpl();
		return questionnaireAnswersGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireAnswersQuestion createQuestionnaireAnswersQuestion() {
		QuestionnaireAnswersQuestionImpl questionnaireAnswersQuestion = new QuestionnaireAnswersQuestionImpl();
		return questionnaireAnswersQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireAnswersStatus createQuestionnaireAnswersStatus() {
		QuestionnaireAnswersStatusImpl questionnaireAnswersStatus = new QuestionnaireAnswersStatusImpl();
		return questionnaireAnswersStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireGroup createQuestionnaireGroup() {
		QuestionnaireGroupImpl questionnaireGroup = new QuestionnaireGroupImpl();
		return questionnaireGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireQuestion createQuestionnaireQuestion() {
		QuestionnaireQuestionImpl questionnaireQuestion = new QuestionnaireQuestionImpl();
		return questionnaireQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireStatus createQuestionnaireStatus() {
		QuestionnaireStatusImpl questionnaireStatus = new QuestionnaireStatusImpl();
		return questionnaireStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio createRatio() {
		RatioImpl ratio = new RatioImpl();
		return ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralRequest createReferralRequest() {
		ReferralRequestImpl referralRequest = new ReferralRequestImpl();
		return referralRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralStatus createReferralStatus() {
		ReferralStatusImpl referralStatus = new ReferralStatusImpl();
		return referralStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPerson createRelatedPerson() {
		RelatedPersonImpl relatedPerson = new RelatedPersonImpl();
		return relatedPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemittanceOutcome createRemittanceOutcome() {
		RemittanceOutcomeImpl remittanceOutcome = new RemittanceOutcomeImpl();
		return remittanceOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer createResourceContainer() {
		ResourceContainerImpl resourceContainer = new ResourceContainerImpl();
		return resourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType createResourceType() {
		ResourceTypeImpl resourceType = new ResourceTypeImpl();
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVersionPolicy createResourceVersionPolicy() {
		ResourceVersionPolicyImpl resourceVersionPolicy = new ResourceVersionPolicyImpl();
		return resourceVersionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseType createResponseType() {
		ResponseTypeImpl responseType = new ResponseTypeImpl();
		return responseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulConformanceMode createRestfulConformanceMode() {
		RestfulConformanceModeImpl restfulConformanceMode = new RestfulConformanceModeImpl();
		return restfulConformanceMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessment createRiskAssessment() {
		RiskAssessmentImpl riskAssessment = new RiskAssessmentImpl();
		return riskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessmentPrediction createRiskAssessmentPrediction() {
		RiskAssessmentPredictionImpl riskAssessmentPrediction = new RiskAssessmentPredictionImpl();
		return riskAssessmentPrediction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledData createSampledData() {
		SampledDataImpl sampledData = new SampledDataImpl();
		return sampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledDataDataType createSampledDataDataType() {
		SampledDataDataTypeImpl sampledDataDataType = new SampledDataDataTypeImpl();
		return sampledDataDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEntryMode createSearchEntryMode() {
		SearchEntryModeImpl searchEntryMode = new SearchEntryModeImpl();
		return searchEntryMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParameter createSearchParameter() {
		SearchParameterImpl searchParameter = new SearchParameterImpl();
		return searchParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParameterContact createSearchParameterContact() {
		SearchParameterContactImpl searchParameterContact = new SearchParameterContactImpl();
		return searchParameterContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParamType createSearchParamType() {
		SearchParamTypeImpl searchParamType = new SearchParamTypeImpl();
		return searchParamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingRules createSlicingRules() {
		SlicingRulesImpl slicingRules = new SlicingRulesImpl();
		return slicingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot createSlot() {
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotStatus createSlotStatus() {
		SlotStatusImpl slotStatus = new SlotStatusImpl();
		return slotStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialValues createSpecialValues() {
		SpecialValuesImpl specialValues = new SpecialValuesImpl();
		return specialValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specimen createSpecimen() {
		SpecimenImpl specimen = new SpecimenImpl();
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenCollection createSpecimenCollection() {
		SpecimenCollectionImpl specimenCollection = new SpecimenCollectionImpl();
		return specimenCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenContainer createSpecimenContainer() {
		SpecimenContainerImpl specimenContainer = new SpecimenContainerImpl();
		return specimenContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenTreatment createSpecimenTreatment() {
		SpecimenTreatmentImpl specimenTreatment = new SpecimenTreatmentImpl();
		return specimenTreatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition createStructureDefinition() {
		StructureDefinitionImpl structureDefinition = new StructureDefinitionImpl();
		return structureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionContact createStructureDefinitionContact() {
		StructureDefinitionContactImpl structureDefinitionContact = new StructureDefinitionContactImpl();
		return structureDefinitionContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionDifferential createStructureDefinitionDifferential() {
		StructureDefinitionDifferentialImpl structureDefinitionDifferential = new StructureDefinitionDifferentialImpl();
		return structureDefinitionDifferential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionMapping createStructureDefinitionMapping() {
		StructureDefinitionMappingImpl structureDefinitionMapping = new StructureDefinitionMappingImpl();
		return structureDefinitionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionSnapshot createStructureDefinitionSnapshot() {
		StructureDefinitionSnapshotImpl structureDefinitionSnapshot = new StructureDefinitionSnapshotImpl();
		return structureDefinitionSnapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionType createStructureDefinitionType() {
		StructureDefinitionTypeImpl structureDefinitionType = new StructureDefinitionTypeImpl();
		return structureDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscription createSubscription() {
		SubscriptionImpl subscription = new SubscriptionImpl();
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannel createSubscriptionChannel() {
		SubscriptionChannelImpl subscriptionChannel = new SubscriptionChannelImpl();
		return subscriptionChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannelType createSubscriptionChannelType() {
		SubscriptionChannelTypeImpl subscriptionChannelType = new SubscriptionChannelTypeImpl();
		return subscriptionChannelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatus createSubscriptionStatus() {
		SubscriptionStatusImpl subscriptionStatus = new SubscriptionStatusImpl();
		return subscriptionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substance createSubstance() {
		SubstanceImpl substance = new SubstanceImpl();
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceIngredient createSubstanceIngredient() {
		SubstanceIngredientImpl substanceIngredient = new SubstanceIngredientImpl();
		return substanceIngredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceInstance createSubstanceInstance() {
		SubstanceInstanceImpl substanceInstance = new SubstanceInstanceImpl();
		return substanceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supply createSupply() {
		SupplyImpl supply = new SupplyImpl();
		return supply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDispense createSupplyDispense() {
		SupplyDispenseImpl supplyDispense = new SupplyDispenseImpl();
		return supplyDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDispenseStatus createSupplyDispenseStatus() {
		SupplyDispenseStatusImpl supplyDispenseStatus = new SupplyDispenseStatusImpl();
		return supplyDispenseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyStatus createSupplyStatus() {
		SupplyStatusImpl supplyStatus = new SupplyStatusImpl();
		return supplyStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRestfulInteraction createSystemRestfulInteraction() {
		SystemRestfulInteractionImpl systemRestfulInteraction = new SystemRestfulInteractionImpl();
		return systemRestfulInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing createTiming() {
		TimingImpl timing = new TimingImpl();
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingRepeat createTimingRepeat() {
		TimingRepeatImpl timingRepeat = new TimingRepeatImpl();
		return timingRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestfulInteraction createTypeRestfulInteraction() {
		TypeRestfulInteractionImpl typeRestfulInteraction = new TypeRestfulInteractionImpl();
		return typeRestfulInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsOfTime createUnitsOfTime() {
		UnitsOfTimeImpl unitsOfTime = new UnitsOfTimeImpl();
		return unitsOfTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt createUnsignedInt() {
		UnsignedIntImpl unsignedInt = new UnsignedIntImpl();
		return unsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri createUri() {
		UriImpl uri = new UriImpl();
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Use createUse() {
		UseImpl use = new UseImpl();
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uuid createUuid() {
		UuidImpl uuid = new UuidImpl();
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSet createValueSet() {
		ValueSetImpl valueSet = new ValueSetImpl();
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetCompose createValueSetCompose() {
		ValueSetComposeImpl valueSetCompose = new ValueSetComposeImpl();
		return valueSetCompose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetConcept createValueSetConcept() {
		ValueSetConceptImpl valueSetConcept = new ValueSetConceptImpl();
		return valueSetConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetConcept1 createValueSetConcept1() {
		ValueSetConcept1Impl valueSetConcept1 = new ValueSetConcept1Impl();
		return valueSetConcept1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetContact createValueSetContact() {
		ValueSetContactImpl valueSetContact = new ValueSetContactImpl();
		return valueSetContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetContains createValueSetContains() {
		ValueSetContainsImpl valueSetContains = new ValueSetContainsImpl();
		return valueSetContains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetDefine createValueSetDefine() {
		ValueSetDefineImpl valueSetDefine = new ValueSetDefineImpl();
		return valueSetDefine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetDesignation createValueSetDesignation() {
		ValueSetDesignationImpl valueSetDesignation = new ValueSetDesignationImpl();
		return valueSetDesignation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetExpansion createValueSetExpansion() {
		ValueSetExpansionImpl valueSetExpansion = new ValueSetExpansionImpl();
		return valueSetExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetFilter createValueSetFilter() {
		ValueSetFilterImpl valueSetFilter = new ValueSetFilterImpl();
		return valueSetFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetInclude createValueSetInclude() {
		ValueSetIncludeImpl valueSetInclude = new ValueSetIncludeImpl();
		return valueSetInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetParameter createValueSetParameter() {
		ValueSetParameterImpl valueSetParameter = new ValueSetParameterImpl();
		return valueSetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionBase createVisionBase() {
		VisionBaseImpl visionBase = new VisionBaseImpl();
		return visionBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionEyes createVisionEyes() {
		VisionEyesImpl visionEyes = new VisionEyesImpl();
		return visionEyes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionPrescription createVisionPrescription() {
		VisionPrescriptionImpl visionPrescription = new VisionPrescriptionImpl();
		return visionPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionPrescriptionDispense createVisionPrescriptionDispense() {
		VisionPrescriptionDispenseImpl visionPrescriptionDispense = new VisionPrescriptionDispenseImpl();
		return visionPrescriptionDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionListList createActionListListFromString(EDataType eDataType, String initialValue) {
		ActionListList result = ActionListList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionListListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressUseList createAddressUseListFromString(EDataType eDataType, String initialValue) {
		AddressUseList result = AddressUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeGenderList createAdministrativeGenderListFromString(EDataType eDataType, String initialValue) {
		AdministrativeGenderList result = AdministrativeGenderList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdministrativeGenderListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationModeList createAggregationModeListFromString(EDataType eDataType, String initialValue) {
		AggregationModeList result = AggregationModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCategoryList createAllergyIntoleranceCategoryListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceCategoryList result = AllergyIntoleranceCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCertaintyList createAllergyIntoleranceCertaintyListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceCertaintyList result = AllergyIntoleranceCertaintyList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCertaintyListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCriticalityList createAllergyIntoleranceCriticalityListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceCriticalityList result = AllergyIntoleranceCriticalityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCriticalityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSeverityList createAllergyIntoleranceSeverityListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceSeverityList result = AllergyIntoleranceSeverityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceSeverityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceStatusList createAllergyIntoleranceStatusListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceStatusList result = AllergyIntoleranceStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceTypeList createAllergyIntoleranceTypeListFromString(EDataType eDataType, String initialValue) {
		AllergyIntoleranceTypeList result = AllergyIntoleranceTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerFormatList createAnswerFormatListFromString(EDataType eDataType, String initialValue) {
		AnswerFormatList result = AnswerFormatList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnswerFormatListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentStatusList createAppointmentStatusListFromString(EDataType eDataType, String initialValue) {
		AppointmentStatusList result = AppointmentStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppointmentStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventActionList createAuditEventActionListFromString(EDataType eDataType, String initialValue) {
		AuditEventActionList result = AuditEventActionList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventActionListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventObjectLifecycleList createAuditEventObjectLifecycleListFromString(EDataType eDataType, String initialValue) {
		AuditEventObjectLifecycleList result = AuditEventObjectLifecycleList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventObjectLifecycleListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventObjectRoleList createAuditEventObjectRoleListFromString(EDataType eDataType, String initialValue) {
		AuditEventObjectRoleList result = AuditEventObjectRoleList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventObjectRoleListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventObjectTypeList createAuditEventObjectTypeListFromString(EDataType eDataType, String initialValue) {
		AuditEventObjectTypeList result = AuditEventObjectTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventObjectTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventOutcomeList createAuditEventOutcomeListFromString(EDataType eDataType, String initialValue) {
		AuditEventOutcomeList result = AuditEventOutcomeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventOutcomeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventParticipantNetworkTypeList createAuditEventParticipantNetworkTypeListFromString(EDataType eDataType, String initialValue) {
		AuditEventParticipantNetworkTypeList result = AuditEventParticipantNetworkTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventParticipantNetworkTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrengthList createBindingStrengthListFromString(EDataType eDataType, String initialValue) {
		BindingStrengthList result = BindingStrengthList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingStrengthListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleTypeList createBundleTypeListFromString(EDataType eDataType, String initialValue) {
		BundleTypeList result = BundleTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBundleTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityCategoryList createCarePlanActivityCategoryListFromString(EDataType eDataType, String initialValue) {
		CarePlanActivityCategoryList result = CarePlanActivityCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityStatusList createCarePlanActivityStatusListFromString(EDataType eDataType, String initialValue) {
		CarePlanActivityStatusList result = CarePlanActivityStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanStatusList createCarePlanStatusListFromString(EDataType eDataType, String initialValue) {
		CarePlanStatusList result = CarePlanStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimTypeList createClaimTypeListFromString(EDataType eDataType, String initialValue) {
		ClaimTypeList result = ClaimTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionStatusList createClinicalImpressionStatusListFromString(EDataType eDataType, String initialValue) {
		ClinicalImpressionStatusList result = ClinicalImpressionStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClinicalImpressionStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequestStatusList createCommunicationRequestStatusListFromString(EDataType eDataType, String initialValue) {
		CommunicationRequestStatusList result = CommunicationRequestStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationRequestStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationStatusList createCommunicationStatusListFromString(EDataType eDataType, String initialValue) {
		CommunicationStatusList result = CommunicationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttestationModeList createCompositionAttestationModeListFromString(EDataType eDataType, String initialValue) {
		CompositionAttestationModeList result = CompositionAttestationModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionAttestationModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionStatusList createCompositionStatusListFromString(EDataType eDataType, String initialValue) {
		CompositionStatusList result = CompositionStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapEquivalenceList createConceptMapEquivalenceListFromString(EDataType eDataType, String initialValue) {
		ConceptMapEquivalenceList result = ConceptMapEquivalenceList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapEquivalenceListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionClinicalStatusList createConditionClinicalStatusListFromString(EDataType eDataType, String initialValue) {
		ConditionClinicalStatusList result = ConditionClinicalStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionClinicalStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceEventModeList createConformanceEventModeListFromString(EDataType eDataType, String initialValue) {
		ConformanceEventModeList result = ConformanceEventModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceEventModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceResourceStatusList createConformanceResourceStatusListFromString(EDataType eDataType, String initialValue) {
		ConformanceResourceStatusList result = ConformanceResourceStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceResourceStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSeverityList createConstraintSeverityListFromString(EDataType eDataType, String initialValue) {
		ConstraintSeverityList result = ConstraintSeverityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintSeverityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointSystemList createContactPointSystemListFromString(EDataType eDataType, String initialValue) {
		ContactPointSystemList result = ContactPointSystemList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointSystemListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointUseList createContactPointUseListFromString(EDataType eDataType, String initialValue) {
		ContactPointUseList result = ContactPointUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAbsentReasonList createDataAbsentReasonListFromString(EDataType eDataType, String initialValue) {
		DataAbsentReasonList result = DataAbsentReasonList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataAbsentReasonListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementSpecificityList createDataElementSpecificityListFromString(EDataType eDataType, String initialValue) {
		DataElementSpecificityList result = DataElementSpecificityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataElementSpecificityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeList createDataTypeListFromString(EDataType eDataType, String initialValue) {
		DataTypeList result = DataTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaysOfWeekList createDaysOfWeekListFromString(EDataType eDataType, String initialValue) {
		DaysOfWeekList result = DaysOfWeekList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDaysOfWeekListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationStateList createDeviceMetricCalibrationStateListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCalibrationStateList result = DeviceMetricCalibrationStateList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationStateListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationTypeList createDeviceMetricCalibrationTypeListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCalibrationTypeList result = DeviceMetricCalibrationTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCategoryList createDeviceMetricCategoryListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricCategoryList result = DeviceMetricCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricColorList createDeviceMetricColorListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricColorList result = DeviceMetricColorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricColorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricOperationalStatusList createDeviceMetricOperationalStatusListFromString(EDataType eDataType, String initialValue) {
		DeviceMetricOperationalStatusList result = DeviceMetricOperationalStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricOperationalStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceStatusList createDeviceStatusListFromString(EDataType eDataType, String initialValue) {
		DeviceStatusList result = DeviceStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseRequestPriorityList createDeviceUseRequestPriorityListFromString(EDataType eDataType, String initialValue) {
		DeviceUseRequestPriorityList result = DeviceUseRequestPriorityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceUseRequestPriorityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseRequestStatusList createDeviceUseRequestStatusListFromString(EDataType eDataType, String initialValue) {
		DeviceUseRequestStatusList result = DeviceUseRequestStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceUseRequestStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrderPriorityList createDiagnosticOrderPriorityListFromString(EDataType eDataType, String initialValue) {
		DiagnosticOrderPriorityList result = DiagnosticOrderPriorityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticOrderPriorityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrderStatusList createDiagnosticOrderStatusListFromString(EDataType eDataType, String initialValue) {
		DiagnosticOrderStatusList result = DiagnosticOrderStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticOrderStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportStatusList createDiagnosticReportStatusListFromString(EDataType eDataType, String initialValue) {
		DiagnosticReportStatusList result = DiagnosticReportStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticReportStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalMediaTypeList createDigitalMediaTypeListFromString(EDataType eDataType, String initialValue) {
		DigitalMediaTypeList result = DigitalMediaTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDigitalMediaTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentModeList createDocumentModeListFromString(EDataType eDataType, String initialValue) {
		DocumentModeList result = DocumentModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceStatusList createDocumentReferenceStatusListFromString(EDataType eDataType, String initialValue) {
		DocumentReferenceStatusList result = DocumentReferenceStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentReferenceStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRelationshipTypeList createDocumentRelationshipTypeListFromString(EDataType eDataType, String initialValue) {
		DocumentRelationshipTypeList result = DocumentRelationshipTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentRelationshipTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterClassList createEncounterClassListFromString(EDataType eDataType, String initialValue) {
		EncounterClassList result = EncounterClassList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterClassListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocationStatusList createEncounterLocationStatusListFromString(EDataType eDataType, String initialValue) {
		EncounterLocationStatusList result = EncounterLocationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterLocationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStateList createEncounterStateListFromString(EDataType eDataType, String initialValue) {
		EncounterStateList result = EncounterStateList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterStateListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatusList createEpisodeOfCareStatusListFromString(EDataType eDataType, String initialValue) {
		EpisodeOfCareStatusList result = EpisodeOfCareStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEpisodeOfCareStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTimingList createEventTimingListFromString(EDataType eDataType, String initialValue) {
		EventTimingList result = EventTimingList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTimingListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionContextList createExtensionContextListFromString(EDataType eDataType, String initialValue) {
		ExtensionContextList result = ExtensionContextList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtensionContextListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRDefinedTypeList createFHIRDefinedTypeListFromString(EDataType eDataType, String initialValue) {
		FHIRDefinedTypeList result = FHIRDefinedTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRDefinedTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperatorList createFilterOperatorListFromString(EDataType eDataType, String initialValue) {
		FilterOperatorList result = FilterOperatorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterOperatorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagStatusList createFlagStatusListFromString(EDataType eDataType, String initialValue) {
		FlagStatusList result = FlagStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalStatusList createGoalStatusListFromString(EDataType eDataType, String initialValue) {
		GoalStatusList result = GoalStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupTypeList createGroupTypeListFromString(EDataType eDataType, String initialValue) {
		GroupTypeList result = GroupTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerbList createHTTPVerbListFromString(EDataType eDataType, String initialValue) {
		HTTPVerbList result = HTTPVerbList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPVerbListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierUseList createIdentifierUseListFromString(EDataType eDataType, String initialValue) {
		IdentifierUseList result = IdentifierUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAssuranceLevelList createIdentityAssuranceLevelListFromString(EDataType eDataType, String initialValue) {
		IdentityAssuranceLevelList result = IdentityAssuranceLevelList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentityAssuranceLevelListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingModalityList createImagingModalityListFromString(EDataType eDataType, String initialValue) {
		ImagingModalityList result = ImagingModalityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImagingModalityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceAvailabilityList createInstanceAvailabilityListFromString(EDataType eDataType, String initialValue) {
		InstanceAvailabilityList result = InstanceAvailabilityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceAvailabilityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueSeverityList createIssueSeverityListFromString(EDataType eDataType, String initialValue) {
		IssueSeverityList result = IssueSeverityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueSeverityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkTypeList createLinkTypeListFromString(EDataType eDataType, String initialValue) {
		LinkTypeList result = LinkTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListModeList createListModeListFromString(EDataType eDataType, String initialValue) {
		ListModeList result = ListModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStatusList createListStatusListFromString(EDataType eDataType, String initialValue) {
		ListStatusList result = ListStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationModeList createLocationModeListFromString(EDataType eDataType, String initialValue) {
		LocationModeList result = LocationModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationStatusList createLocationStatusListFromString(EDataType eDataType, String initialValue) {
		LocationStatusList result = LocationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasmntPrincipleList createMeasmntPrincipleListFromString(EDataType eDataType, String initialValue) {
		MeasmntPrincipleList result = MeasmntPrincipleList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasmntPrincipleListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationStatusList createMedicationAdministrationStatusListFromString(EDataType eDataType, String initialValue) {
		MedicationAdministrationStatusList result = MedicationAdministrationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationAdministrationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseStatusList createMedicationDispenseStatusListFromString(EDataType eDataType, String initialValue) {
		MedicationDispenseStatusList result = MedicationDispenseStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationDispenseStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKindList createMedicationKindListFromString(EDataType eDataType, String initialValue) {
		MedicationKindList result = MedicationKindList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationKindListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPrescriptionStatusList createMedicationPrescriptionStatusListFromString(EDataType eDataType, String initialValue) {
		MedicationPrescriptionStatusList result = MedicationPrescriptionStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationPrescriptionStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementStatusList createMedicationStatementStatusListFromString(EDataType eDataType, String initialValue) {
		MedicationStatementStatusList result = MedicationStatementStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatementStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEventList createMessageEventListFromString(EDataType eDataType, String initialValue) {
		MessageEventList result = MessageEventList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageEventListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSignificanceCategoryList createMessageSignificanceCategoryListFromString(EDataType eDataType, String initialValue) {
		MessageSignificanceCategoryList result = MessageSignificanceCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSignificanceCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityList createModalityListFromString(EDataType eDataType, String initialValue) {
		ModalityList result = ModalityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModalityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameUseList createNameUseListFromString(EDataType eDataType, String initialValue) {
		NameUseList result = NameUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemIdentifierTypeList createNamingSystemIdentifierTypeListFromString(EDataType eDataType, String initialValue) {
		NamingSystemIdentifierTypeList result = NamingSystemIdentifierTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemIdentifierTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemTypeList createNamingSystemTypeListFromString(EDataType eDataType, String initialValue) {
		NamingSystemTypeList result = NamingSystemTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NarrativeStatusList createNarrativeStatusListFromString(EDataType eDataType, String initialValue) {
		NarrativeStatusList result = NarrativeStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNarrativeStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteTypeList createNoteTypeListFromString(EDataType eDataType, String initialValue) {
		NoteTypeList result = NoteTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderStatusList createNutritionOrderStatusListFromString(EDataType eDataType, String initialValue) {
		NutritionOrderStatusList result = NutritionOrderStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNutritionOrderStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRelationshipTypeList createObservationRelationshipTypeListFromString(EDataType eDataType, String initialValue) {
		ObservationRelationshipTypeList result = ObservationRelationshipTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationRelationshipTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationReliabilityList createObservationReliabilityListFromString(EDataType eDataType, String initialValue) {
		ObservationReliabilityList result = ObservationReliabilityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationReliabilityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationStatusList createObservationStatusListFromString(EDataType eDataType, String initialValue) {
		ObservationStatusList result = ObservationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKindList createOperationKindListFromString(EDataType eDataType, String initialValue) {
		OperationKindList result = OperationKindList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationKindListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterUseList createOperationParameterUseListFromString(EDataType eDataType, String initialValue) {
		OperationParameterUseList result = OperationParameterUseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationParameterUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderStatusList createOrderStatusListFromString(EDataType eDataType, String initialValue) {
		OrderStatusList result = OrderStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRequiredList createParticipantRequiredListFromString(EDataType eDataType, String initialValue) {
		ParticipantRequiredList result = ParticipantRequiredList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantRequiredListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantStatusList createParticipantStatusListFromString(EDataType eDataType, String initialValue) {
		ParticipantStatusList result = ParticipantStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationStatusList createParticipationStatusListFromString(EDataType eDataType, String initialValue) {
		ParticipationStatusList result = ParticipationStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipationStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRelationshipTypeList createProcedureRelationshipTypeListFromString(EDataType eDataType, String initialValue) {
		ProcedureRelationshipTypeList result = ProcedureRelationshipTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureRelationshipTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestPriorityList createProcedureRequestPriorityListFromString(EDataType eDataType, String initialValue) {
		ProcedureRequestPriorityList result = ProcedureRequestPriorityList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureRequestPriorityListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestStatusList createProcedureRequestStatusListFromString(EDataType eDataType, String initialValue) {
		ProcedureRequestStatusList result = ProcedureRequestStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureRequestStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureStatusList createProcedureStatusListFromString(EDataType eDataType, String initialValue) {
		ProcedureStatusList result = ProcedureStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRepresentationList createPropertyRepresentationListFromString(EDataType eDataType, String initialValue) {
		PropertyRepresentationList result = PropertyRepresentationList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyRepresentationListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntityRoleList createProvenanceEntityRoleListFromString(EDataType eDataType, String initialValue) {
		ProvenanceEntityRoleList result = ProvenanceEntityRoleList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceEntityRoleListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityComparatorList createQuantityComparatorListFromString(EDataType eDataType, String initialValue) {
		QuantityComparatorList result = QuantityComparatorList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantityComparatorListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireAnswersStatusList createQuestionnaireAnswersStatusListFromString(EDataType eDataType, String initialValue) {
		QuestionnaireAnswersStatusList result = QuestionnaireAnswersStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireAnswersStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireStatusList createQuestionnaireStatusListFromString(EDataType eDataType, String initialValue) {
		QuestionnaireStatusList result = QuestionnaireStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralStatusList createReferralStatusListFromString(EDataType eDataType, String initialValue) {
		ReferralStatusList result = ReferralStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferralStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemittanceOutcomeList createRemittanceOutcomeListFromString(EDataType eDataType, String initialValue) {
		RemittanceOutcomeList result = RemittanceOutcomeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemittanceOutcomeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeList createResourceTypeListFromString(EDataType eDataType, String initialValue) {
		ResourceTypeList result = ResourceTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVersionPolicyList createResourceVersionPolicyListFromString(EDataType eDataType, String initialValue) {
		ResourceVersionPolicyList result = ResourceVersionPolicyList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceVersionPolicyListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseTypeList createResponseTypeListFromString(EDataType eDataType, String initialValue) {
		ResponseTypeList result = ResponseTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulConformanceModeList createRestfulConformanceModeListFromString(EDataType eDataType, String initialValue) {
		RestfulConformanceModeList result = RestfulConformanceModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestfulConformanceModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEntryModeList createSearchEntryModeListFromString(EDataType eDataType, String initialValue) {
		SearchEntryModeList result = SearchEntryModeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchEntryModeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParamTypeList createSearchParamTypeListFromString(EDataType eDataType, String initialValue) {
		SearchParamTypeList result = SearchParamTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchParamTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingRulesList createSlicingRulesListFromString(EDataType eDataType, String initialValue) {
		SlicingRulesList result = SlicingRulesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlicingRulesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotStatusList createSlotStatusListFromString(EDataType eDataType, String initialValue) {
		SlotStatusList result = SlotStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlotStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialValuesList createSpecialValuesListFromString(EDataType eDataType, String initialValue) {
		SpecialValuesList result = SpecialValuesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecialValuesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionTypeList createStructureDefinitionTypeListFromString(EDataType eDataType, String initialValue) {
		StructureDefinitionTypeList result = StructureDefinitionTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureDefinitionTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannelTypeList createSubscriptionChannelTypeListFromString(EDataType eDataType, String initialValue) {
		SubscriptionChannelTypeList result = SubscriptionChannelTypeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionChannelTypeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatusList createSubscriptionStatusListFromString(EDataType eDataType, String initialValue) {
		SubscriptionStatusList result = SubscriptionStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDispenseStatusList createSupplyDispenseStatusListFromString(EDataType eDataType, String initialValue) {
		SupplyDispenseStatusList result = SupplyDispenseStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyDispenseStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyStatusList createSupplyStatusListFromString(EDataType eDataType, String initialValue) {
		SupplyStatusList result = SupplyStatusList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyStatusListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRestfulInteractionList createSystemRestfulInteractionListFromString(EDataType eDataType, String initialValue) {
		SystemRestfulInteractionList result = SystemRestfulInteractionList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemRestfulInteractionListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestfulInteractionList createTypeRestfulInteractionListFromString(EDataType eDataType, String initialValue) {
		TypeRestfulInteractionList result = TypeRestfulInteractionList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestfulInteractionListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsOfTimeList createUnitsOfTimeListFromString(EDataType eDataType, String initialValue) {
		UnitsOfTimeList result = UnitsOfTimeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsOfTimeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseList createUseListFromString(EDataType eDataType, String initialValue) {
		UseList result = UseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionBaseList createVisionBaseListFromString(EDataType eDataType, String initialValue) {
		VisionBaseList result = VisionBaseList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionBaseListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionEyesList createVisionEyesListFromString(EDataType eDataType, String initialValue) {
		VisionEyesList result = VisionEyesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionEyesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionListList createActionListListObjectFromString(EDataType eDataType, String initialValue) {
		return createActionListListFromString(FhirPackage.eINSTANCE.getActionListList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionListListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionListListToString(FhirPackage.eINSTANCE.getActionListList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressUseList createAddressUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createAddressUseListFromString(FhirPackage.eINSTANCE.getAddressUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAddressUseListToString(FhirPackage.eINSTANCE.getAddressUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeGenderList createAdministrativeGenderListObjectFromString(EDataType eDataType, String initialValue) {
		return createAdministrativeGenderListFromString(FhirPackage.eINSTANCE.getAdministrativeGenderList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdministrativeGenderListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAdministrativeGenderListToString(FhirPackage.eINSTANCE.getAdministrativeGenderList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationModeList createAggregationModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAggregationModeListFromString(FhirPackage.eINSTANCE.getAggregationModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAggregationModeListToString(FhirPackage.eINSTANCE.getAggregationModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCategoryList createAllergyIntoleranceCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceCategoryListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceCategoryListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCertaintyList createAllergyIntoleranceCertaintyListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceCertaintyListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceCertaintyList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCertaintyListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceCertaintyListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceCertaintyList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceCriticalityList createAllergyIntoleranceCriticalityListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceCriticalityListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceCriticalityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceCriticalityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceCriticalityListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceCriticalityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceSeverityList createAllergyIntoleranceSeverityListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceSeverityListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceSeverityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceSeverityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceSeverityListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceSeverityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceStatusList createAllergyIntoleranceStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceStatusListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceStatusListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceTypeList createAllergyIntoleranceTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAllergyIntoleranceTypeListFromString(FhirPackage.eINSTANCE.getAllergyIntoleranceTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllergyIntoleranceTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllergyIntoleranceTypeListToString(FhirPackage.eINSTANCE.getAllergyIntoleranceTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerFormatList createAnswerFormatListObjectFromString(EDataType eDataType, String initialValue) {
		return createAnswerFormatListFromString(FhirPackage.eINSTANCE.getAnswerFormatList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnswerFormatListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAnswerFormatListToString(FhirPackage.eINSTANCE.getAnswerFormatList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentStatusList createAppointmentStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createAppointmentStatusListFromString(FhirPackage.eINSTANCE.getAppointmentStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppointmentStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAppointmentStatusListToString(FhirPackage.eINSTANCE.getAppointmentStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventActionList createAuditEventActionListObjectFromString(EDataType eDataType, String initialValue) {
		return createAuditEventActionListFromString(FhirPackage.eINSTANCE.getAuditEventActionList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventActionListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuditEventActionListToString(FhirPackage.eINSTANCE.getAuditEventActionList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventObjectLifecycleList createAuditEventObjectLifecycleListObjectFromString(EDataType eDataType, String initialValue) {
		return createAuditEventObjectLifecycleListFromString(FhirPackage.eINSTANCE.getAuditEventObjectLifecycleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventObjectLifecycleListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuditEventObjectLifecycleListToString(FhirPackage.eINSTANCE.getAuditEventObjectLifecycleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventObjectRoleList createAuditEventObjectRoleListObjectFromString(EDataType eDataType, String initialValue) {
		return createAuditEventObjectRoleListFromString(FhirPackage.eINSTANCE.getAuditEventObjectRoleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventObjectRoleListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuditEventObjectRoleListToString(FhirPackage.eINSTANCE.getAuditEventObjectRoleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventObjectTypeList createAuditEventObjectTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAuditEventObjectTypeListFromString(FhirPackage.eINSTANCE.getAuditEventObjectTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventObjectTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuditEventObjectTypeListToString(FhirPackage.eINSTANCE.getAuditEventObjectTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventOutcomeList createAuditEventOutcomeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAuditEventOutcomeListFromString(FhirPackage.eINSTANCE.getAuditEventOutcomeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventOutcomeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuditEventOutcomeListToString(FhirPackage.eINSTANCE.getAuditEventOutcomeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventParticipantNetworkTypeList createAuditEventParticipantNetworkTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createAuditEventParticipantNetworkTypeListFromString(FhirPackage.eINSTANCE.getAuditEventParticipantNetworkTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditEventParticipantNetworkTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAuditEventParticipantNetworkTypeListToString(FhirPackage.eINSTANCE.getAuditEventParticipantNetworkTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createBase64BinaryPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBase64BinaryPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BASE64_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrengthList createBindingStrengthListObjectFromString(EDataType eDataType, String initialValue) {
		return createBindingStrengthListFromString(FhirPackage.eINSTANCE.getBindingStrengthList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingStrengthListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBindingStrengthListToString(FhirPackage.eINSTANCE.getBindingStrengthList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanPrimitiveObjectFromString(EDataType eDataType, String initialValue) {
		return createBooleanPrimitiveFromString(FhirPackage.eINSTANCE.getBooleanPrimitive(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanPrimitiveObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBooleanPrimitiveToString(FhirPackage.eINSTANCE.getBooleanPrimitive(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleTypeList createBundleTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createBundleTypeListFromString(FhirPackage.eINSTANCE.getBundleTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBundleTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBundleTypeListToString(FhirPackage.eINSTANCE.getBundleTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityCategoryList createCarePlanActivityCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createCarePlanActivityCategoryListFromString(FhirPackage.eINSTANCE.getCarePlanActivityCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCarePlanActivityCategoryListToString(FhirPackage.eINSTANCE.getCarePlanActivityCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityStatusList createCarePlanActivityStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createCarePlanActivityStatusListFromString(FhirPackage.eINSTANCE.getCarePlanActivityStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanActivityStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCarePlanActivityStatusListToString(FhirPackage.eINSTANCE.getCarePlanActivityStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanStatusList createCarePlanStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createCarePlanStatusListFromString(FhirPackage.eINSTANCE.getCarePlanStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePlanStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCarePlanStatusListToString(FhirPackage.eINSTANCE.getCarePlanStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimTypeList createClaimTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createClaimTypeListFromString(FhirPackage.eINSTANCE.getClaimTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClaimTypeListToString(FhirPackage.eINSTANCE.getClaimTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createClinicalBaseGenderListFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClinicalBaseGenderListToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpressionStatusList createClinicalImpressionStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createClinicalImpressionStatusListFromString(FhirPackage.eINSTANCE.getClinicalImpressionStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClinicalImpressionStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClinicalImpressionStatusListToString(FhirPackage.eINSTANCE.getClinicalImpressionStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCodePrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequestStatusList createCommunicationRequestStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createCommunicationRequestStatusListFromString(FhirPackage.eINSTANCE.getCommunicationRequestStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationRequestStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCommunicationRequestStatusListToString(FhirPackage.eINSTANCE.getCommunicationRequestStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationStatusList createCommunicationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createCommunicationStatusListFromString(FhirPackage.eINSTANCE.getCommunicationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCommunicationStatusListToString(FhirPackage.eINSTANCE.getCommunicationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionAttestationModeList createCompositionAttestationModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createCompositionAttestationModeListFromString(FhirPackage.eINSTANCE.getCompositionAttestationModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionAttestationModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompositionAttestationModeListToString(FhirPackage.eINSTANCE.getCompositionAttestationModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionStatusList createCompositionStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createCompositionStatusListFromString(FhirPackage.eINSTANCE.getCompositionStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositionStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompositionStatusListToString(FhirPackage.eINSTANCE.getCompositionStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapEquivalenceList createConceptMapEquivalenceListObjectFromString(EDataType eDataType, String initialValue) {
		return createConceptMapEquivalenceListFromString(FhirPackage.eINSTANCE.getConceptMapEquivalenceList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptMapEquivalenceListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConceptMapEquivalenceListToString(FhirPackage.eINSTANCE.getConceptMapEquivalenceList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionClinicalStatusList createConditionClinicalStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createConditionClinicalStatusListFromString(FhirPackage.eINSTANCE.getConditionClinicalStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionClinicalStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConditionClinicalStatusListToString(FhirPackage.eINSTANCE.getConditionClinicalStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceEventModeList createConformanceEventModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createConformanceEventModeListFromString(FhirPackage.eINSTANCE.getConformanceEventModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceEventModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConformanceEventModeListToString(FhirPackage.eINSTANCE.getConformanceEventModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceResourceStatusList createConformanceResourceStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createConformanceResourceStatusListFromString(FhirPackage.eINSTANCE.getConformanceResourceStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceResourceStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConformanceResourceStatusListToString(FhirPackage.eINSTANCE.getConformanceResourceStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createConformanceUseContextListFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceUseContextListToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSeverityList createConstraintSeverityListObjectFromString(EDataType eDataType, String initialValue) {
		return createConstraintSeverityListFromString(FhirPackage.eINSTANCE.getConstraintSeverityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintSeverityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConstraintSeverityListToString(FhirPackage.eINSTANCE.getConstraintSeverityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointSystemList createContactPointSystemListObjectFromString(EDataType eDataType, String initialValue) {
		return createContactPointSystemListFromString(FhirPackage.eINSTANCE.getContactPointSystemList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointSystemListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContactPointSystemListToString(FhirPackage.eINSTANCE.getContactPointSystemList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPointUseList createContactPointUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createContactPointUseListFromString(FhirPackage.eINSTANCE.getContactPointUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactPointUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContactPointUseListToString(FhirPackage.eINSTANCE.getContactPointUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAbsentReasonList createDataAbsentReasonListObjectFromString(EDataType eDataType, String initialValue) {
		return createDataAbsentReasonListFromString(FhirPackage.eINSTANCE.getDataAbsentReasonList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataAbsentReasonListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataAbsentReasonListToString(FhirPackage.eINSTANCE.getDataAbsentReasonList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementSpecificityList createDataElementSpecificityListObjectFromString(EDataType eDataType, String initialValue) {
		return createDataElementSpecificityListFromString(FhirPackage.eINSTANCE.getDataElementSpecificityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataElementSpecificityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataElementSpecificityListToString(FhirPackage.eINSTANCE.getDataElementSpecificityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeList createDataTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDataTypeListFromString(FhirPackage.eINSTANCE.getDataTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataTypeListToString(FhirPackage.eINSTANCE.getDataTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDatePrimitiveFromString(EDataType eDataType, String initialValue) {
		return createDatePrimitiveBaseFromString(FhirPackage.eINSTANCE.getDatePrimitiveBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return convertDatePrimitiveBaseToString(FhirPackage.eINSTANCE.getDatePrimitiveBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDatePrimitiveBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		XMLGregorianCalendar result = null;
		RuntimeException exception = null;
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR_MONTH, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatePrimitiveBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.GYEAR.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR_MONTH, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTimePrimitiveFromString(EDataType eDataType, String initialValue) {
		return createDateTimePrimitiveBaseFromString(FhirPackage.eINSTANCE.getDateTimePrimitiveBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimePrimitiveBaseToString(FhirPackage.eINSTANCE.getDateTimePrimitiveBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTimePrimitiveBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		XMLGregorianCalendar result = null;
		RuntimeException exception = null;
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR_MONTH, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimePrimitiveBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.GYEAR.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR_MONTH, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE_TIME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaysOfWeekList createDaysOfWeekListObjectFromString(EDataType eDataType, String initialValue) {
		return createDaysOfWeekListFromString(FhirPackage.eINSTANCE.getDaysOfWeekList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDaysOfWeekListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDaysOfWeekListToString(FhirPackage.eINSTANCE.getDaysOfWeekList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createDecimalPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationStateList createDeviceMetricCalibrationStateListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricCalibrationStateListFromString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationStateList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationStateListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricCalibrationStateListToString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationStateList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCalibrationTypeList createDeviceMetricCalibrationTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricCalibrationTypeListFromString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCalibrationTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricCalibrationTypeListToString(FhirPackage.eINSTANCE.getDeviceMetricCalibrationTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCategoryList createDeviceMetricCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricCategoryListFromString(FhirPackage.eINSTANCE.getDeviceMetricCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricCategoryListToString(FhirPackage.eINSTANCE.getDeviceMetricCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricColorList createDeviceMetricColorListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricColorListFromString(FhirPackage.eINSTANCE.getDeviceMetricColorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricColorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricColorListToString(FhirPackage.eINSTANCE.getDeviceMetricColorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricOperationalStatusList createDeviceMetricOperationalStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceMetricOperationalStatusListFromString(FhirPackage.eINSTANCE.getDeviceMetricOperationalStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceMetricOperationalStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceMetricOperationalStatusListToString(FhirPackage.eINSTANCE.getDeviceMetricOperationalStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceStatusList createDeviceStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceStatusListFromString(FhirPackage.eINSTANCE.getDeviceStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceStatusListToString(FhirPackage.eINSTANCE.getDeviceStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseRequestPriorityList createDeviceUseRequestPriorityListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceUseRequestPriorityListFromString(FhirPackage.eINSTANCE.getDeviceUseRequestPriorityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceUseRequestPriorityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceUseRequestPriorityListToString(FhirPackage.eINSTANCE.getDeviceUseRequestPriorityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseRequestStatusList createDeviceUseRequestStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceUseRequestStatusListFromString(FhirPackage.eINSTANCE.getDeviceUseRequestStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceUseRequestStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceUseRequestStatusListToString(FhirPackage.eINSTANCE.getDeviceUseRequestStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrderPriorityList createDiagnosticOrderPriorityListObjectFromString(EDataType eDataType, String initialValue) {
		return createDiagnosticOrderPriorityListFromString(FhirPackage.eINSTANCE.getDiagnosticOrderPriorityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticOrderPriorityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDiagnosticOrderPriorityListToString(FhirPackage.eINSTANCE.getDiagnosticOrderPriorityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrderStatusList createDiagnosticOrderStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createDiagnosticOrderStatusListFromString(FhirPackage.eINSTANCE.getDiagnosticOrderStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticOrderStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDiagnosticOrderStatusListToString(FhirPackage.eINSTANCE.getDiagnosticOrderStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReportStatusList createDiagnosticReportStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createDiagnosticReportStatusListFromString(FhirPackage.eINSTANCE.getDiagnosticReportStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosticReportStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDiagnosticReportStatusListToString(FhirPackage.eINSTANCE.getDiagnosticReportStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalMediaTypeList createDigitalMediaTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDigitalMediaTypeListFromString(FhirPackage.eINSTANCE.getDigitalMediaTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDigitalMediaTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDigitalMediaTypeListToString(FhirPackage.eINSTANCE.getDigitalMediaTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentModeList createDocumentModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDocumentModeListFromString(FhirPackage.eINSTANCE.getDocumentModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDocumentModeListToString(FhirPackage.eINSTANCE.getDocumentModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceStatusList createDocumentReferenceStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createDocumentReferenceStatusListFromString(FhirPackage.eINSTANCE.getDocumentReferenceStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentReferenceStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDocumentReferenceStatusListToString(FhirPackage.eINSTANCE.getDocumentReferenceStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRelationshipTypeList createDocumentRelationshipTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createDocumentRelationshipTypeListFromString(FhirPackage.eINSTANCE.getDocumentRelationshipTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentRelationshipTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDocumentRelationshipTypeListToString(FhirPackage.eINSTANCE.getDocumentRelationshipTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterClassList createEncounterClassListObjectFromString(EDataType eDataType, String initialValue) {
		return createEncounterClassListFromString(FhirPackage.eINSTANCE.getEncounterClassList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterClassListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEncounterClassListToString(FhirPackage.eINSTANCE.getEncounterClassList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocationStatusList createEncounterLocationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEncounterLocationStatusListFromString(FhirPackage.eINSTANCE.getEncounterLocationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterLocationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEncounterLocationStatusListToString(FhirPackage.eINSTANCE.getEncounterLocationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterStateList createEncounterStateListObjectFromString(EDataType eDataType, String initialValue) {
		return createEncounterStateListFromString(FhirPackage.eINSTANCE.getEncounterStateList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncounterStateListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEncounterStateListToString(FhirPackage.eINSTANCE.getEncounterStateList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCareStatusList createEpisodeOfCareStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createEpisodeOfCareStatusListFromString(FhirPackage.eINSTANCE.getEpisodeOfCareStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEpisodeOfCareStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEpisodeOfCareStatusListToString(FhirPackage.eINSTANCE.getEpisodeOfCareStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTimingList createEventTimingListObjectFromString(EDataType eDataType, String initialValue) {
		return createEventTimingListFromString(FhirPackage.eINSTANCE.getEventTimingList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTimingListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventTimingListToString(FhirPackage.eINSTANCE.getEventTimingList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionContextList createExtensionContextListObjectFromString(EDataType eDataType, String initialValue) {
		return createExtensionContextListFromString(FhirPackage.eINSTANCE.getExtensionContextList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtensionContextListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExtensionContextListToString(FhirPackage.eINSTANCE.getExtensionContextList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRDefinedTypeList createFHIRDefinedTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createFHIRDefinedTypeListFromString(FhirPackage.eINSTANCE.getFHIRDefinedTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFHIRDefinedTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFHIRDefinedTypeListToString(FhirPackage.eINSTANCE.getFHIRDefinedTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperatorList createFilterOperatorListObjectFromString(EDataType eDataType, String initialValue) {
		return createFilterOperatorListFromString(FhirPackage.eINSTANCE.getFilterOperatorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterOperatorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFilterOperatorListToString(FhirPackage.eINSTANCE.getFilterOperatorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagStatusList createFlagStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createFlagStatusListFromString(FhirPackage.eINSTANCE.getFlagStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFlagStatusListToString(FhirPackage.eINSTANCE.getFlagStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalStatusList createGoalStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createGoalStatusListFromString(FhirPackage.eINSTANCE.getGoalStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGoalStatusListToString(FhirPackage.eINSTANCE.getGoalStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupTypeList createGroupTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createGroupTypeListFromString(FhirPackage.eINSTANCE.getGroupTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGroupTypeListToString(FhirPackage.eINSTANCE.getGroupTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerbList createHTTPVerbListObjectFromString(EDataType eDataType, String initialValue) {
		return createHTTPVerbListFromString(FhirPackage.eINSTANCE.getHTTPVerbList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPVerbListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHTTPVerbListToString(FhirPackage.eINSTANCE.getHTTPVerbList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierUseList createIdentifierUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createIdentifierUseListFromString(FhirPackage.eINSTANCE.getIdentifierUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIdentifierUseListToString(FhirPackage.eINSTANCE.getIdentifierUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAssuranceLevelList createIdentityAssuranceLevelListObjectFromString(EDataType eDataType, String initialValue) {
		return createIdentityAssuranceLevelListFromString(FhirPackage.eINSTANCE.getIdentityAssuranceLevelList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentityAssuranceLevelListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIdentityAssuranceLevelListToString(FhirPackage.eINSTANCE.getIdentityAssuranceLevelList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingModalityList createImagingModalityListObjectFromString(EDataType eDataType, String initialValue) {
		return createImagingModalityListFromString(FhirPackage.eINSTANCE.getImagingModalityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImagingModalityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImagingModalityListToString(FhirPackage.eINSTANCE.getImagingModalityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceAvailabilityList createInstanceAvailabilityListObjectFromString(EDataType eDataType, String initialValue) {
		return createInstanceAvailabilityListFromString(FhirPackage.eINSTANCE.getInstanceAvailabilityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceAvailabilityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInstanceAvailabilityListToString(FhirPackage.eINSTANCE.getInstanceAvailabilityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createInstantPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstantPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerPrimitiveObjectFromString(EDataType eDataType, String initialValue) {
		return createIntegerPrimitiveFromString(FhirPackage.eINSTANCE.getIntegerPrimitive(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerPrimitiveObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIntegerPrimitiveToString(FhirPackage.eINSTANCE.getIntegerPrimitive(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueSeverityList createIssueSeverityListObjectFromString(EDataType eDataType, String initialValue) {
		return createIssueSeverityListFromString(FhirPackage.eINSTANCE.getIssueSeverityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueSeverityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIssueSeverityListToString(FhirPackage.eINSTANCE.getIssueSeverityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkTypeList createLinkTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createLinkTypeListFromString(FhirPackage.eINSTANCE.getLinkTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLinkTypeListToString(FhirPackage.eINSTANCE.getLinkTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListModeList createListModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createListModeListFromString(FhirPackage.eINSTANCE.getListModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertListModeListToString(FhirPackage.eINSTANCE.getListModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStatusList createListStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createListStatusListFromString(FhirPackage.eINSTANCE.getListStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertListStatusListToString(FhirPackage.eINSTANCE.getListStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationModeList createLocationModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createLocationModeListFromString(FhirPackage.eINSTANCE.getLocationModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLocationModeListToString(FhirPackage.eINSTANCE.getLocationModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationStatusList createLocationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createLocationStatusListFromString(FhirPackage.eINSTANCE.getLocationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLocationStatusListToString(FhirPackage.eINSTANCE.getLocationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMaritalStatusListFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaritalStatusListToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasmntPrincipleList createMeasmntPrincipleListObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasmntPrincipleListFromString(FhirPackage.eINSTANCE.getMeasmntPrincipleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasmntPrincipleListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasmntPrincipleListToString(FhirPackage.eINSTANCE.getMeasmntPrincipleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministrationStatusList createMedicationAdministrationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationAdministrationStatusListFromString(FhirPackage.eINSTANCE.getMedicationAdministrationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationAdministrationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationAdministrationStatusListToString(FhirPackage.eINSTANCE.getMedicationAdministrationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseStatusList createMedicationDispenseStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationDispenseStatusListFromString(FhirPackage.eINSTANCE.getMedicationDispenseStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationDispenseStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationDispenseStatusListToString(FhirPackage.eINSTANCE.getMedicationDispenseStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKindList createMedicationKindListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationKindListFromString(FhirPackage.eINSTANCE.getMedicationKindList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationKindListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationKindListToString(FhirPackage.eINSTANCE.getMedicationKindList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPrescriptionStatusList createMedicationPrescriptionStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationPrescriptionStatusListFromString(FhirPackage.eINSTANCE.getMedicationPrescriptionStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationPrescriptionStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationPrescriptionStatusListToString(FhirPackage.eINSTANCE.getMedicationPrescriptionStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatementStatusList createMedicationStatementStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createMedicationStatementStatusListFromString(FhirPackage.eINSTANCE.getMedicationStatementStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicationStatementStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMedicationStatementStatusListToString(FhirPackage.eINSTANCE.getMedicationStatementStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEventList createMessageEventListObjectFromString(EDataType eDataType, String initialValue) {
		return createMessageEventListFromString(FhirPackage.eINSTANCE.getMessageEventList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageEventListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageEventListToString(FhirPackage.eINSTANCE.getMessageEventList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSignificanceCategoryList createMessageSignificanceCategoryListObjectFromString(EDataType eDataType, String initialValue) {
		return createMessageSignificanceCategoryListFromString(FhirPackage.eINSTANCE.getMessageSignificanceCategoryList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSignificanceCategoryListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageSignificanceCategoryListToString(FhirPackage.eINSTANCE.getMessageSignificanceCategoryList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityList createModalityListObjectFromString(EDataType eDataType, String initialValue) {
		return createModalityListFromString(FhirPackage.eINSTANCE.getModalityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModalityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModalityListToString(FhirPackage.eINSTANCE.getModalityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameUseList createNameUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createNameUseListFromString(FhirPackage.eINSTANCE.getNameUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNameUseListToString(FhirPackage.eINSTANCE.getNameUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemIdentifierTypeList createNamingSystemIdentifierTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createNamingSystemIdentifierTypeListFromString(FhirPackage.eINSTANCE.getNamingSystemIdentifierTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemIdentifierTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNamingSystemIdentifierTypeListToString(FhirPackage.eINSTANCE.getNamingSystemIdentifierTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystemTypeList createNamingSystemTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createNamingSystemTypeListFromString(FhirPackage.eINSTANCE.getNamingSystemTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingSystemTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNamingSystemTypeListToString(FhirPackage.eINSTANCE.getNamingSystemTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NarrativeStatusList createNarrativeStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createNarrativeStatusListFromString(FhirPackage.eINSTANCE.getNarrativeStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNarrativeStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNarrativeStatusListToString(FhirPackage.eINSTANCE.getNarrativeStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteTypeList createNoteTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createNoteTypeListFromString(FhirPackage.eINSTANCE.getNoteTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNoteTypeListToString(FhirPackage.eINSTANCE.getNoteTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderStatusList createNutritionOrderStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createNutritionOrderStatusListFromString(FhirPackage.eINSTANCE.getNutritionOrderStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNutritionOrderStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNutritionOrderStatusListToString(FhirPackage.eINSTANCE.getNutritionOrderStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRelationshipTypeList createObservationRelationshipTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createObservationRelationshipTypeListFromString(FhirPackage.eINSTANCE.getObservationRelationshipTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationRelationshipTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertObservationRelationshipTypeListToString(FhirPackage.eINSTANCE.getObservationRelationshipTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationReliabilityList createObservationReliabilityListObjectFromString(EDataType eDataType, String initialValue) {
		return createObservationReliabilityListFromString(FhirPackage.eINSTANCE.getObservationReliabilityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationReliabilityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertObservationReliabilityListToString(FhirPackage.eINSTANCE.getObservationReliabilityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationStatusList createObservationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createObservationStatusListFromString(FhirPackage.eINSTANCE.getObservationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObservationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertObservationStatusListToString(FhirPackage.eINSTANCE.getObservationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOidPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOidPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationKindList createOperationKindListObjectFromString(EDataType eDataType, String initialValue) {
		return createOperationKindListFromString(FhirPackage.eINSTANCE.getOperationKindList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationKindListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOperationKindListToString(FhirPackage.eINSTANCE.getOperationKindList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterUseList createOperationParameterUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createOperationParameterUseListFromString(FhirPackage.eINSTANCE.getOperationParameterUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationParameterUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOperationParameterUseListToString(FhirPackage.eINSTANCE.getOperationParameterUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderStatusList createOrderStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createOrderStatusListFromString(FhirPackage.eINSTANCE.getOrderStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOrderStatusListToString(FhirPackage.eINSTANCE.getOrderStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRequiredList createParticipantRequiredListObjectFromString(EDataType eDataType, String initialValue) {
		return createParticipantRequiredListFromString(FhirPackage.eINSTANCE.getParticipantRequiredList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantRequiredListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParticipantRequiredListToString(FhirPackage.eINSTANCE.getParticipantRequiredList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantStatusList createParticipantStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createParticipantStatusListFromString(FhirPackage.eINSTANCE.getParticipantStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParticipantStatusListToString(FhirPackage.eINSTANCE.getParticipantStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationStatusList createParticipationStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createParticipationStatusListFromString(FhirPackage.eINSTANCE.getParticipationStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipationStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParticipationStatusListToString(FhirPackage.eINSTANCE.getParticipationStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPositiveIntPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRelationshipTypeList createProcedureRelationshipTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createProcedureRelationshipTypeListFromString(FhirPackage.eINSTANCE.getProcedureRelationshipTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureRelationshipTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProcedureRelationshipTypeListToString(FhirPackage.eINSTANCE.getProcedureRelationshipTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestPriorityList createProcedureRequestPriorityListObjectFromString(EDataType eDataType, String initialValue) {
		return createProcedureRequestPriorityListFromString(FhirPackage.eINSTANCE.getProcedureRequestPriorityList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureRequestPriorityListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProcedureRequestPriorityListToString(FhirPackage.eINSTANCE.getProcedureRequestPriorityList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequestStatusList createProcedureRequestStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createProcedureRequestStatusListFromString(FhirPackage.eINSTANCE.getProcedureRequestStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureRequestStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProcedureRequestStatusListToString(FhirPackage.eINSTANCE.getProcedureRequestStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureStatusList createProcedureStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createProcedureStatusListFromString(FhirPackage.eINSTANCE.getProcedureStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProcedureStatusListToString(FhirPackage.eINSTANCE.getProcedureStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRepresentationList createPropertyRepresentationListObjectFromString(EDataType eDataType, String initialValue) {
		return createPropertyRepresentationListFromString(FhirPackage.eINSTANCE.getPropertyRepresentationList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyRepresentationListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyRepresentationListToString(FhirPackage.eINSTANCE.getPropertyRepresentationList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceEntityRoleList createProvenanceEntityRoleListObjectFromString(EDataType eDataType, String initialValue) {
		return createProvenanceEntityRoleListFromString(FhirPackage.eINSTANCE.getProvenanceEntityRoleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProvenanceEntityRoleListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProvenanceEntityRoleListToString(FhirPackage.eINSTANCE.getProvenanceEntityRoleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityComparatorList createQuantityComparatorListObjectFromString(EDataType eDataType, String initialValue) {
		return createQuantityComparatorListFromString(FhirPackage.eINSTANCE.getQuantityComparatorList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantityComparatorListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuantityComparatorListToString(FhirPackage.eINSTANCE.getQuantityComparatorList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireAnswersStatusList createQuestionnaireAnswersStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createQuestionnaireAnswersStatusListFromString(FhirPackage.eINSTANCE.getQuestionnaireAnswersStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireAnswersStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuestionnaireAnswersStatusListToString(FhirPackage.eINSTANCE.getQuestionnaireAnswersStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireStatusList createQuestionnaireStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createQuestionnaireStatusListFromString(FhirPackage.eINSTANCE.getQuestionnaireStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionnaireStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQuestionnaireStatusListToString(FhirPackage.eINSTANCE.getQuestionnaireStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralStatusList createReferralStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createReferralStatusListFromString(FhirPackage.eINSTANCE.getReferralStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferralStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReferralStatusListToString(FhirPackage.eINSTANCE.getReferralStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemittanceOutcomeList createRemittanceOutcomeListObjectFromString(EDataType eDataType, String initialValue) {
		return createRemittanceOutcomeListFromString(FhirPackage.eINSTANCE.getRemittanceOutcomeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemittanceOutcomeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRemittanceOutcomeListToString(FhirPackage.eINSTANCE.getRemittanceOutcomeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeList createResourceTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createResourceTypeListFromString(FhirPackage.eINSTANCE.getResourceTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResourceTypeListToString(FhirPackage.eINSTANCE.getResourceTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVersionPolicyList createResourceVersionPolicyListObjectFromString(EDataType eDataType, String initialValue) {
		return createResourceVersionPolicyListFromString(FhirPackage.eINSTANCE.getResourceVersionPolicyList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceVersionPolicyListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResourceVersionPolicyListToString(FhirPackage.eINSTANCE.getResourceVersionPolicyList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseTypeList createResponseTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createResponseTypeListFromString(FhirPackage.eINSTANCE.getResponseTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResponseTypeListToString(FhirPackage.eINSTANCE.getResponseTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestfulConformanceModeList createRestfulConformanceModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createRestfulConformanceModeListFromString(FhirPackage.eINSTANCE.getRestfulConformanceModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestfulConformanceModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRestfulConformanceModeListToString(FhirPackage.eINSTANCE.getRestfulConformanceModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSampledDataDataTypePrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSampledDataDataTypePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEntryModeList createSearchEntryModeListObjectFromString(EDataType eDataType, String initialValue) {
		return createSearchEntryModeListFromString(FhirPackage.eINSTANCE.getSearchEntryModeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchEntryModeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSearchEntryModeListToString(FhirPackage.eINSTANCE.getSearchEntryModeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParamTypeList createSearchParamTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createSearchParamTypeListFromString(FhirPackage.eINSTANCE.getSearchParamTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchParamTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSearchParamTypeListToString(FhirPackage.eINSTANCE.getSearchParamTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingRulesList createSlicingRulesListObjectFromString(EDataType eDataType, String initialValue) {
		return createSlicingRulesListFromString(FhirPackage.eINSTANCE.getSlicingRulesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlicingRulesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSlicingRulesListToString(FhirPackage.eINSTANCE.getSlicingRulesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotStatusList createSlotStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSlotStatusListFromString(FhirPackage.eINSTANCE.getSlotStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSlotStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSlotStatusListToString(FhirPackage.eINSTANCE.getSlotStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialValuesList createSpecialValuesListObjectFromString(EDataType eDataType, String initialValue) {
		return createSpecialValuesListFromString(FhirPackage.eINSTANCE.getSpecialValuesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecialValuesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpecialValuesListToString(FhirPackage.eINSTANCE.getSpecialValuesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinitionTypeList createStructureDefinitionTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createStructureDefinitionTypeListFromString(FhirPackage.eINSTANCE.getStructureDefinitionTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureDefinitionTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStructureDefinitionTypeListToString(FhirPackage.eINSTANCE.getStructureDefinitionTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionChannelTypeList createSubscriptionChannelTypeListObjectFromString(EDataType eDataType, String initialValue) {
		return createSubscriptionChannelTypeListFromString(FhirPackage.eINSTANCE.getSubscriptionChannelTypeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionChannelTypeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubscriptionChannelTypeListToString(FhirPackage.eINSTANCE.getSubscriptionChannelTypeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionStatusList createSubscriptionStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSubscriptionStatusListFromString(FhirPackage.eINSTANCE.getSubscriptionStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubscriptionStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubscriptionStatusListToString(FhirPackage.eINSTANCE.getSubscriptionStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDispenseStatusList createSupplyDispenseStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSupplyDispenseStatusListFromString(FhirPackage.eINSTANCE.getSupplyDispenseStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyDispenseStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSupplyDispenseStatusListToString(FhirPackage.eINSTANCE.getSupplyDispenseStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyStatusList createSupplyStatusListObjectFromString(EDataType eDataType, String initialValue) {
		return createSupplyStatusListFromString(FhirPackage.eINSTANCE.getSupplyStatusList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplyStatusListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSupplyStatusListToString(FhirPackage.eINSTANCE.getSupplyStatusList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRestfulInteractionList createSystemRestfulInteractionListObjectFromString(EDataType eDataType, String initialValue) {
		return createSystemRestfulInteractionListFromString(FhirPackage.eINSTANCE.getSystemRestfulInteractionList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemRestfulInteractionListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSystemRestfulInteractionListToString(FhirPackage.eINSTANCE.getSystemRestfulInteractionList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createTimePrimitiveFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimePrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRestfulInteractionList createTypeRestfulInteractionListObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeRestfulInteractionListFromString(FhirPackage.eINSTANCE.getTypeRestfulInteractionList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestfulInteractionListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeRestfulInteractionListToString(FhirPackage.eINSTANCE.getTypeRestfulInteractionList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsOfTimeList createUnitsOfTimeListObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitsOfTimeListFromString(FhirPackage.eINSTANCE.getUnitsOfTimeList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsOfTimeListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsOfTimeListToString(FhirPackage.eINSTANCE.getUnitsOfTimeList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createUnsignedIntPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsignedIntPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUriPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUriPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseList createUseListObjectFromString(EDataType eDataType, String initialValue) {
		return createUseListFromString(FhirPackage.eINSTANCE.getUseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUseListToString(FhirPackage.eINSTANCE.getUseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUuidPrimitiveFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUuidPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionBaseList createVisionBaseListObjectFromString(EDataType eDataType, String initialValue) {
		return createVisionBaseListFromString(FhirPackage.eINSTANCE.getVisionBaseList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionBaseListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVisionBaseListToString(FhirPackage.eINSTANCE.getVisionBaseList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionEyesList createVisionEyesListObjectFromString(EDataType eDataType, String initialValue) {
		return createVisionEyesListFromString(FhirPackage.eINSTANCE.getVisionEyesList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisionEyesListObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVisionEyesListToString(FhirPackage.eINSTANCE.getVisionEyesList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirPackage getFhirPackage() {
		return (FhirPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FhirPackage getPackage() {
		return FhirPackage.eINSTANCE;
	}

} //FhirFactoryImpl
