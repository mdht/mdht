/**
 */
package org.hl7.fhir.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.hl7.fhir.Account;
import org.hl7.fhir.AccountStatus;
import org.hl7.fhir.AccountStatusList;
import org.hl7.fhir.ActionList;
import org.hl7.fhir.ActionListList;
import org.hl7.fhir.Address;
import org.hl7.fhir.AddressType;
import org.hl7.fhir.AddressTypeList;
import org.hl7.fhir.AddressUse;
import org.hl7.fhir.AddressUseList;
import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.AdministrativeGenderList;
import org.hl7.fhir.Age;
import org.hl7.fhir.AgeUnits;
import org.hl7.fhir.AgeUnitsList;
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
import org.hl7.fhir.Annotation;
import org.hl7.fhir.AnswerFormat;
import org.hl7.fhir.AnswerFormatList;
import org.hl7.fhir.Appointment;
import org.hl7.fhir.AppointmentParticipant;
import org.hl7.fhir.AppointmentResponse;
import org.hl7.fhir.AppointmentStatus;
import org.hl7.fhir.AppointmentStatusList;
import org.hl7.fhir.AssertionDirectionType;
import org.hl7.fhir.AssertionDirectionTypeList;
import org.hl7.fhir.AssertionOperatorType;
import org.hl7.fhir.AssertionOperatorTypeList;
import org.hl7.fhir.AssertionResponseTypes;
import org.hl7.fhir.AssertionResponseTypesList;
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
import org.hl7.fhir.BundleRequest;
import org.hl7.fhir.BundleResponse;
import org.hl7.fhir.BundleSearch;
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
import org.hl7.fhir.ConceptMapTarget;
import org.hl7.fhir.Condition;
import org.hl7.fhir.ConditionClinicalStatus;
import org.hl7.fhir.ConditionClinicalStatusList;
import org.hl7.fhir.ConditionDueTo;
import org.hl7.fhir.ConditionEvidence;
import org.hl7.fhir.ConditionLocation;
import org.hl7.fhir.ConditionOccurredFollowing;
import org.hl7.fhir.ConditionStage;
import org.hl7.fhir.ConditionalDeleteStatus;
import org.hl7.fhir.ConditionalDeleteStatusList;
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
import org.hl7.fhir.ConstraintSeverity;
import org.hl7.fhir.ConstraintSeverityList;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.ContactPointSystem;
import org.hl7.fhir.ContactPointSystemList;
import org.hl7.fhir.ContactPointUse;
import org.hl7.fhir.ContactPointUseList;
import org.hl7.fhir.ContentType;
import org.hl7.fhir.ContentTypeList;
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
import org.hl7.fhir.ContraindicationSeverity;
import org.hl7.fhir.ContraindicationSeverityList;
import org.hl7.fhir.Count;
import org.hl7.fhir.Coverage;
import org.hl7.fhir.DataElement;
import org.hl7.fhir.DataElementContact;
import org.hl7.fhir.DataElementMapping;
import org.hl7.fhir.DataElementSpecificity;
import org.hl7.fhir.DataElementSpecificityList;
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
import org.hl7.fhir.FamilyMemberHistory;
import org.hl7.fhir.FamilyMemberHistoryCondition;
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
import org.hl7.fhir.ImplementationGuide;
import org.hl7.fhir.ImplementationGuideContact;
import org.hl7.fhir.ImplementationGuideDefault;
import org.hl7.fhir.ImplementationGuideExample;
import org.hl7.fhir.ImplementationGuideItem;
import org.hl7.fhir.ImplementationGuidePackage;
import org.hl7.fhir.ImplementationGuidePage;
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
import org.hl7.fhir.MessageHeader;
import org.hl7.fhir.MessageHeaderDestination;
import org.hl7.fhir.MessageHeaderResponse;
import org.hl7.fhir.MessageHeaderSource;
import org.hl7.fhir.MessageSignificanceCategory;
import org.hl7.fhir.MessageSignificanceCategoryList;
import org.hl7.fhir.Meta;
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
import org.hl7.fhir.NutritionOrderAdministration;
import org.hl7.fhir.NutritionOrderEnteralFormula;
import org.hl7.fhir.NutritionOrderNutrient;
import org.hl7.fhir.NutritionOrderOralDiet;
import org.hl7.fhir.NutritionOrderStatus;
import org.hl7.fhir.NutritionOrderStatusList;
import org.hl7.fhir.NutritionOrderSupplement;
import org.hl7.fhir.NutritionOrderTexture;
import org.hl7.fhir.Observation;
import org.hl7.fhir.ObservationComponent;
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
import org.hl7.fhir.OperationDefinitionBinding;
import org.hl7.fhir.OperationDefinitionContact;
import org.hl7.fhir.OperationDefinitionParameter;
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
import org.hl7.fhir.PagePurpose;
import org.hl7.fhir.PagePurposeList;
import org.hl7.fhir.Parameters;
import org.hl7.fhir.ParametersParameter;
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
import org.hl7.fhir.SearchModifierCode;
import org.hl7.fhir.SearchModifierCodeList;
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
import org.hl7.fhir.Specimen;
import org.hl7.fhir.SpecimenCollection;
import org.hl7.fhir.SpecimenContainer;
import org.hl7.fhir.SpecimenTreatment;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureDefinitionContact;
import org.hl7.fhir.StructureDefinitionDifferential;
import org.hl7.fhir.StructureDefinitionKind;
import org.hl7.fhir.StructureDefinitionKindList;
import org.hl7.fhir.StructureDefinitionMapping;
import org.hl7.fhir.StructureDefinitionSnapshot;
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
import org.hl7.fhir.SupplyDelivery;
import org.hl7.fhir.SupplyDeliveryStatus;
import org.hl7.fhir.SupplyDeliveryStatusList;
import org.hl7.fhir.SupplyDispense;
import org.hl7.fhir.SupplyDispenseStatus;
import org.hl7.fhir.SupplyDispenseStatusList;
import org.hl7.fhir.SupplyRequest;
import org.hl7.fhir.SupplyRequestStatus;
import org.hl7.fhir.SupplyRequestStatusList;
import org.hl7.fhir.SupplyRequestWhen;
import org.hl7.fhir.SupplyStatus;
import org.hl7.fhir.SupplyStatusList;
import org.hl7.fhir.SystemRestfulInteraction;
import org.hl7.fhir.SystemRestfulInteractionList;
import org.hl7.fhir.TestScript;
import org.hl7.fhir.TestScriptAction;
import org.hl7.fhir.TestScriptAction1;
import org.hl7.fhir.TestScriptAction2;
import org.hl7.fhir.TestScriptAssert;
import org.hl7.fhir.TestScriptCapabilities;
import org.hl7.fhir.TestScriptFixture;
import org.hl7.fhir.TestScriptLink;
import org.hl7.fhir.TestScriptMetadata;
import org.hl7.fhir.TestScriptOperation;
import org.hl7.fhir.TestScriptRequestHeader;
import org.hl7.fhir.TestScriptSetup;
import org.hl7.fhir.TestScriptTeardown;
import org.hl7.fhir.TestScriptTest;
import org.hl7.fhir.TestScriptVariable;
import org.hl7.fhir.Time;
import org.hl7.fhir.Timing;
import org.hl7.fhir.TimingRepeat;
import org.hl7.fhir.TransactionMode;
import org.hl7.fhir.TransactionModeList;
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
import org.hl7.fhir.ValueSetCodeSystem;
import org.hl7.fhir.ValueSetCompose;
import org.hl7.fhir.ValueSetConcept;
import org.hl7.fhir.ValueSetConcept1;
import org.hl7.fhir.ValueSetContact;
import org.hl7.fhir.ValueSetContains;
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
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage
 * @generated
 */
public class FhirValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FhirValidator INSTANCE = new FhirValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.hl7.fhir";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FhirPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FhirPackage.ACCOUNT:
				return validateAccount((Account)value, diagnostics, context);
			case FhirPackage.ACCOUNT_STATUS:
				return validateAccountStatus((AccountStatus)value, diagnostics, context);
			case FhirPackage.ACTION_LIST:
				return validateActionList((ActionList)value, diagnostics, context);
			case FhirPackage.ADDRESS:
				return validateAddress((Address)value, diagnostics, context);
			case FhirPackage.ADDRESS_TYPE:
				return validateAddressType((AddressType)value, diagnostics, context);
			case FhirPackage.ADDRESS_USE:
				return validateAddressUse((AddressUse)value, diagnostics, context);
			case FhirPackage.ADMINISTRATIVE_GENDER:
				return validateAdministrativeGender((AdministrativeGender)value, diagnostics, context);
			case FhirPackage.AGE:
				return validateAge((Age)value, diagnostics, context);
			case FhirPackage.AGE_UNITS:
				return validateAgeUnits((AgeUnits)value, diagnostics, context);
			case FhirPackage.AGGREGATION_MODE:
				return validateAggregationMode((AggregationMode)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE:
				return validateAllergyIntolerance((AllergyIntolerance)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY:
				return validateAllergyIntoleranceCategory((AllergyIntoleranceCategory)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CERTAINTY:
				return validateAllergyIntoleranceCertainty((AllergyIntoleranceCertainty)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY:
				return validateAllergyIntoleranceCriticality((AllergyIntoleranceCriticality)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_EVENT:
				return validateAllergyIntoleranceEvent((AllergyIntoleranceEvent)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY:
				return validateAllergyIntoleranceSeverity((AllergyIntoleranceSeverity)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_STATUS:
				return validateAllergyIntoleranceStatus((AllergyIntoleranceStatus)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE:
				return validateAllergyIntoleranceType((AllergyIntoleranceType)value, diagnostics, context);
			case FhirPackage.ANNOTATION:
				return validateAnnotation((Annotation)value, diagnostics, context);
			case FhirPackage.ANSWER_FORMAT:
				return validateAnswerFormat((AnswerFormat)value, diagnostics, context);
			case FhirPackage.APPOINTMENT:
				return validateAppointment((Appointment)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_PARTICIPANT:
				return validateAppointmentParticipant((AppointmentParticipant)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_RESPONSE:
				return validateAppointmentResponse((AppointmentResponse)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_STATUS:
				return validateAppointmentStatus((AppointmentStatus)value, diagnostics, context);
			case FhirPackage.ASSERTION_DIRECTION_TYPE:
				return validateAssertionDirectionType((AssertionDirectionType)value, diagnostics, context);
			case FhirPackage.ASSERTION_OPERATOR_TYPE:
				return validateAssertionOperatorType((AssertionOperatorType)value, diagnostics, context);
			case FhirPackage.ASSERTION_RESPONSE_TYPES:
				return validateAssertionResponseTypes((AssertionResponseTypes)value, diagnostics, context);
			case FhirPackage.ATTACHMENT:
				return validateAttachment((Attachment)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT:
				return validateAuditEvent((AuditEvent)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_ACTION:
				return validateAuditEventAction((AuditEventAction)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_DETAIL:
				return validateAuditEventDetail((AuditEventDetail)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_EVENT:
				return validateAuditEventEvent((AuditEventEvent)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_NETWORK:
				return validateAuditEventNetwork((AuditEventNetwork)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OBJECT:
				return validateAuditEventObject((AuditEventObject)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OBJECT_LIFECYCLE:
				return validateAuditEventObjectLifecycle((AuditEventObjectLifecycle)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OBJECT_ROLE:
				return validateAuditEventObjectRole((AuditEventObjectRole)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OBJECT_TYPE:
				return validateAuditEventObjectType((AuditEventObjectType)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OUTCOME:
				return validateAuditEventOutcome((AuditEventOutcome)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT:
				return validateAuditEventParticipant((AuditEventParticipant)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT_NETWORK_TYPE:
				return validateAuditEventParticipantNetworkType((AuditEventParticipantNetworkType)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_SOURCE:
				return validateAuditEventSource((AuditEventSource)value, diagnostics, context);
			case FhirPackage.BACKBONE_ELEMENT:
				return validateBackboneElement((BackboneElement)value, diagnostics, context);
			case FhirPackage.BASE64_BINARY:
				return validateBase64Binary((Base64Binary)value, diagnostics, context);
			case FhirPackage.BASIC:
				return validateBasic((Basic)value, diagnostics, context);
			case FhirPackage.BINARY:
				return validateBinary((Binary)value, diagnostics, context);
			case FhirPackage.BINDING_STRENGTH:
				return validateBindingStrength((BindingStrength)value, diagnostics, context);
			case FhirPackage.BODY_SITE:
				return validateBodySite((BodySite)value, diagnostics, context);
			case FhirPackage.BOOLEAN:
				return validateBoolean((org.hl7.fhir.Boolean)value, diagnostics, context);
			case FhirPackage.BUNDLE:
				return validateBundle((Bundle)value, diagnostics, context);
			case FhirPackage.BUNDLE_ENTRY:
				return validateBundleEntry((BundleEntry)value, diagnostics, context);
			case FhirPackage.BUNDLE_LINK:
				return validateBundleLink((BundleLink)value, diagnostics, context);
			case FhirPackage.BUNDLE_REQUEST:
				return validateBundleRequest((BundleRequest)value, diagnostics, context);
			case FhirPackage.BUNDLE_RESPONSE:
				return validateBundleResponse((BundleResponse)value, diagnostics, context);
			case FhirPackage.BUNDLE_SEARCH:
				return validateBundleSearch((BundleSearch)value, diagnostics, context);
			case FhirPackage.BUNDLE_TYPE:
				return validateBundleType((BundleType)value, diagnostics, context);
			case FhirPackage.CARE_PLAN:
				return validateCarePlan((CarePlan)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY:
				return validateCarePlanActivity((CarePlanActivity)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY_CATEGORY:
				return validateCarePlanActivityCategory((CarePlanActivityCategory)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS:
				return validateCarePlanActivityStatus((CarePlanActivityStatus)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_DETAIL:
				return validateCarePlanDetail((CarePlanDetail)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_PARTICIPANT:
				return validateCarePlanParticipant((CarePlanParticipant)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_STATUS:
				return validateCarePlanStatus((CarePlanStatus)value, diagnostics, context);
			case FhirPackage.CLAIM:
				return validateClaim((Claim)value, diagnostics, context);
			case FhirPackage.CLAIM_COVERAGE:
				return validateClaimCoverage((ClaimCoverage)value, diagnostics, context);
			case FhirPackage.CLAIM_DETAIL:
				return validateClaimDetail((ClaimDetail)value, diagnostics, context);
			case FhirPackage.CLAIM_DIAGNOSIS:
				return validateClaimDiagnosis((ClaimDiagnosis)value, diagnostics, context);
			case FhirPackage.CLAIM_ITEM:
				return validateClaimItem((ClaimItem)value, diagnostics, context);
			case FhirPackage.CLAIM_MISSING_TEETH:
				return validateClaimMissingTeeth((ClaimMissingTeeth)value, diagnostics, context);
			case FhirPackage.CLAIM_PAYEE:
				return validateClaimPayee((ClaimPayee)value, diagnostics, context);
			case FhirPackage.CLAIM_PROSTHESIS:
				return validateClaimProsthesis((ClaimProsthesis)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE:
				return validateClaimResponse((ClaimResponse)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM:
				return validateClaimResponseAddItem((ClaimResponseAddItem)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION:
				return validateClaimResponseAdjudication((ClaimResponseAdjudication)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION1:
				return validateClaimResponseAdjudication1((ClaimResponseAdjudication1)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION2:
				return validateClaimResponseAdjudication2((ClaimResponseAdjudication2)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION3:
				return validateClaimResponseAdjudication3((ClaimResponseAdjudication3)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION4:
				return validateClaimResponseAdjudication4((ClaimResponseAdjudication4)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_COVERAGE:
				return validateClaimResponseCoverage((ClaimResponseCoverage)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_DETAIL:
				return validateClaimResponseDetail((ClaimResponseDetail)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_DETAIL1:
				return validateClaimResponseDetail1((ClaimResponseDetail1)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ERROR:
				return validateClaimResponseError((ClaimResponseError)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ITEM:
				return validateClaimResponseItem((ClaimResponseItem)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_NOTE:
				return validateClaimResponseNote((ClaimResponseNote)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL:
				return validateClaimResponseSubDetail((ClaimResponseSubDetail)value, diagnostics, context);
			case FhirPackage.CLAIM_SUB_DETAIL:
				return validateClaimSubDetail((ClaimSubDetail)value, diagnostics, context);
			case FhirPackage.CLAIM_TYPE:
				return validateClaimType((ClaimType)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION:
				return validateClinicalImpression((ClinicalImpression)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_FINDING:
				return validateClinicalImpressionFinding((ClinicalImpressionFinding)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_INVESTIGATIONS:
				return validateClinicalImpressionInvestigations((ClinicalImpressionInvestigations)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_RULED_OUT:
				return validateClinicalImpressionRuledOut((ClinicalImpressionRuledOut)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS:
				return validateClinicalImpressionStatus((ClinicalImpressionStatus)value, diagnostics, context);
			case FhirPackage.CODE:
				return validateCode((Code)value, diagnostics, context);
			case FhirPackage.CODEABLE_CONCEPT:
				return validateCodeableConcept((CodeableConcept)value, diagnostics, context);
			case FhirPackage.CODING:
				return validateCoding((Coding)value, diagnostics, context);
			case FhirPackage.COMMUNICATION:
				return validateCommunication((Communication)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_PAYLOAD:
				return validateCommunicationPayload((CommunicationPayload)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_REQUEST:
				return validateCommunicationRequest((CommunicationRequest)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD:
				return validateCommunicationRequestPayload((CommunicationRequestPayload)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_REQUEST_STATUS:
				return validateCommunicationRequestStatus((CommunicationRequestStatus)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_STATUS:
				return validateCommunicationStatus((CommunicationStatus)value, diagnostics, context);
			case FhirPackage.COMPOSITION:
				return validateComposition((Composition)value, diagnostics, context);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE:
				return validateCompositionAttestationMode((CompositionAttestationMode)value, diagnostics, context);
			case FhirPackage.COMPOSITION_ATTESTER:
				return validateCompositionAttester((CompositionAttester)value, diagnostics, context);
			case FhirPackage.COMPOSITION_EVENT:
				return validateCompositionEvent((CompositionEvent)value, diagnostics, context);
			case FhirPackage.COMPOSITION_SECTION:
				return validateCompositionSection((CompositionSection)value, diagnostics, context);
			case FhirPackage.COMPOSITION_STATUS:
				return validateCompositionStatus((CompositionStatus)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP:
				return validateConceptMap((ConceptMap)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_CONTACT:
				return validateConceptMapContact((ConceptMapContact)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_DEPENDS_ON:
				return validateConceptMapDependsOn((ConceptMapDependsOn)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_ELEMENT:
				return validateConceptMapElement((ConceptMapElement)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE:
				return validateConceptMapEquivalence((ConceptMapEquivalence)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_TARGET:
				return validateConceptMapTarget((ConceptMapTarget)value, diagnostics, context);
			case FhirPackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case FhirPackage.CONDITIONAL_DELETE_STATUS:
				return validateConditionalDeleteStatus((ConditionalDeleteStatus)value, diagnostics, context);
			case FhirPackage.CONDITION_CLINICAL_STATUS:
				return validateConditionClinicalStatus((ConditionClinicalStatus)value, diagnostics, context);
			case FhirPackage.CONDITION_DUE_TO:
				return validateConditionDueTo((ConditionDueTo)value, diagnostics, context);
			case FhirPackage.CONDITION_EVIDENCE:
				return validateConditionEvidence((ConditionEvidence)value, diagnostics, context);
			case FhirPackage.CONDITION_LOCATION:
				return validateConditionLocation((ConditionLocation)value, diagnostics, context);
			case FhirPackage.CONDITION_OCCURRED_FOLLOWING:
				return validateConditionOccurredFollowing((ConditionOccurredFollowing)value, diagnostics, context);
			case FhirPackage.CONDITION_STAGE:
				return validateConditionStage((ConditionStage)value, diagnostics, context);
			case FhirPackage.CONFORMANCE:
				return validateConformance((Conformance)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_CERTIFICATE:
				return validateConformanceCertificate((ConformanceCertificate)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_CONTACT:
				return validateConformanceContact((ConformanceContact)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_DOCUMENT:
				return validateConformanceDocument((ConformanceDocument)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_EVENT:
				return validateConformanceEvent((ConformanceEvent)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_EVENT_MODE:
				return validateConformanceEventMode((ConformanceEventMode)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_IMPLEMENTATION:
				return validateConformanceImplementation((ConformanceImplementation)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_INTERACTION:
				return validateConformanceInteraction((ConformanceInteraction)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_INTERACTION1:
				return validateConformanceInteraction1((ConformanceInteraction1)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_MESSAGING:
				return validateConformanceMessaging((ConformanceMessaging)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_OPERATION:
				return validateConformanceOperation((ConformanceOperation)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_RESOURCE:
				return validateConformanceResource((ConformanceResource)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_RESOURCE_STATUS:
				return validateConformanceResourceStatus((ConformanceResourceStatus)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_REST:
				return validateConformanceRest((ConformanceRest)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_SEARCH_PARAM:
				return validateConformanceSearchParam((ConformanceSearchParam)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_SECURITY:
				return validateConformanceSecurity((ConformanceSecurity)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_SOFTWARE:
				return validateConformanceSoftware((ConformanceSoftware)value, diagnostics, context);
			case FhirPackage.CONSTRAINT_SEVERITY:
				return validateConstraintSeverity((ConstraintSeverity)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT:
				return validateContactPoint((ContactPoint)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_SYSTEM:
				return validateContactPointSystem((ContactPointSystem)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_USE:
				return validateContactPointUse((ContactPointUse)value, diagnostics, context);
			case FhirPackage.CONTENT_TYPE:
				return validateContentType((ContentType)value, diagnostics, context);
			case FhirPackage.CONTRACT:
				return validateContract((Contract)value, diagnostics, context);
			case FhirPackage.CONTRACT_ACTOR:
				return validateContractActor((ContractActor)value, diagnostics, context);
			case FhirPackage.CONTRACT_ACTOR1:
				return validateContractActor1((ContractActor1)value, diagnostics, context);
			case FhirPackage.CONTRACT_FRIENDLY:
				return validateContractFriendly((ContractFriendly)value, diagnostics, context);
			case FhirPackage.CONTRACT_LEGAL:
				return validateContractLegal((ContractLegal)value, diagnostics, context);
			case FhirPackage.CONTRACT_RULE:
				return validateContractRule((ContractRule)value, diagnostics, context);
			case FhirPackage.CONTRACT_SIGNER:
				return validateContractSigner((ContractSigner)value, diagnostics, context);
			case FhirPackage.CONTRACT_TERM:
				return validateContractTerm((ContractTerm)value, diagnostics, context);
			case FhirPackage.CONTRACT_VALUED_ITEM:
				return validateContractValuedItem((ContractValuedItem)value, diagnostics, context);
			case FhirPackage.CONTRACT_VALUED_ITEM1:
				return validateContractValuedItem1((ContractValuedItem1)value, diagnostics, context);
			case FhirPackage.CONTRAINDICATION:
				return validateContraindication((Contraindication)value, diagnostics, context);
			case FhirPackage.CONTRAINDICATION_MITIGATION:
				return validateContraindicationMitigation((ContraindicationMitigation)value, diagnostics, context);
			case FhirPackage.CONTRAINDICATION_SEVERITY:
				return validateContraindicationSeverity((ContraindicationSeverity)value, diagnostics, context);
			case FhirPackage.COUNT:
				return validateCount((Count)value, diagnostics, context);
			case FhirPackage.COVERAGE:
				return validateCoverage((Coverage)value, diagnostics, context);
			case FhirPackage.DATA_ELEMENT:
				return validateDataElement((DataElement)value, diagnostics, context);
			case FhirPackage.DATA_ELEMENT_CONTACT:
				return validateDataElementContact((DataElementContact)value, diagnostics, context);
			case FhirPackage.DATA_ELEMENT_MAPPING:
				return validateDataElementMapping((DataElementMapping)value, diagnostics, context);
			case FhirPackage.DATA_ELEMENT_SPECIFICITY:
				return validateDataElementSpecificity((DataElementSpecificity)value, diagnostics, context);
			case FhirPackage.DATE:
				return validateDate((Date)value, diagnostics, context);
			case FhirPackage.DATE_TIME:
				return validateDateTime((DateTime)value, diagnostics, context);
			case FhirPackage.DAYS_OF_WEEK:
				return validateDaysOfWeek((DaysOfWeek)value, diagnostics, context);
			case FhirPackage.DECIMAL:
				return validateDecimal((Decimal)value, diagnostics, context);
			case FhirPackage.DEVICE:
				return validateDevice((Device)value, diagnostics, context);
			case FhirPackage.DEVICE_COMPONENT:
				return validateDeviceComponent((DeviceComponent)value, diagnostics, context);
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION:
				return validateDeviceComponentProductionSpecification((DeviceComponentProductionSpecification)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC:
				return validateDeviceMetric((DeviceMetric)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION:
				return validateDeviceMetricCalibration((DeviceMetricCalibration)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE:
				return validateDeviceMetricCalibrationState((DeviceMetricCalibrationState)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE:
				return validateDeviceMetricCalibrationType((DeviceMetricCalibrationType)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CATEGORY:
				return validateDeviceMetricCategory((DeviceMetricCategory)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_COLOR:
				return validateDeviceMetricColor((DeviceMetricColor)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS:
				return validateDeviceMetricOperationalStatus((DeviceMetricOperationalStatus)value, diagnostics, context);
			case FhirPackage.DEVICE_STATUS:
				return validateDeviceStatus((DeviceStatus)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_REQUEST:
				return validateDeviceUseRequest((DeviceUseRequest)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_REQUEST_PRIORITY:
				return validateDeviceUseRequestPriority((DeviceUseRequestPriority)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_REQUEST_STATUS:
				return validateDeviceUseRequestStatus((DeviceUseRequestStatus)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_STATEMENT:
				return validateDeviceUseStatement((DeviceUseStatement)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_ORDER:
				return validateDiagnosticOrder((DiagnosticOrder)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_ORDER_EVENT:
				return validateDiagnosticOrderEvent((DiagnosticOrderEvent)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_ORDER_ITEM:
				return validateDiagnosticOrderItem((DiagnosticOrderItem)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_ORDER_PRIORITY:
				return validateDiagnosticOrderPriority((DiagnosticOrderPriority)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_ORDER_STATUS:
				return validateDiagnosticOrderStatus((DiagnosticOrderStatus)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT:
				return validateDiagnosticReport((DiagnosticReport)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT_IMAGE:
				return validateDiagnosticReportImage((DiagnosticReportImage)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS:
				return validateDiagnosticReportStatus((DiagnosticReportStatus)value, diagnostics, context);
			case FhirPackage.DIGITAL_MEDIA_TYPE:
				return validateDigitalMediaType((DigitalMediaType)value, diagnostics, context);
			case FhirPackage.DISTANCE:
				return validateDistance((Distance)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MANIFEST:
				return validateDocumentManifest((DocumentManifest)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MANIFEST_CONTENT:
				return validateDocumentManifestContent((DocumentManifestContent)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MANIFEST_RELATED:
				return validateDocumentManifestRelated((DocumentManifestRelated)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MODE:
				return validateDocumentMode((DocumentMode)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE:
				return validateDocumentReference((DocumentReference)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT:
				return validateDocumentReferenceContext((DocumentReferenceContext)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_RELATED:
				return validateDocumentReferenceRelated((DocumentReferenceRelated)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_RELATES_TO:
				return validateDocumentReferenceRelatesTo((DocumentReferenceRelatesTo)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS:
				return validateDocumentReferenceStatus((DocumentReferenceStatus)value, diagnostics, context);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE:
				return validateDocumentRelationshipType((DocumentRelationshipType)value, diagnostics, context);
			case FhirPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case FhirPackage.DOMAIN_RESOURCE:
				return validateDomainResource((DomainResource)value, diagnostics, context);
			case FhirPackage.DURATION:
				return validateDuration((Duration)value, diagnostics, context);
			case FhirPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION:
				return validateElementDefinition((ElementDefinition)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_BINDING:
				return validateElementDefinitionBinding((ElementDefinitionBinding)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_CONSTRAINT:
				return validateElementDefinitionConstraint((ElementDefinitionConstraint)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_MAPPING:
				return validateElementDefinitionMapping((ElementDefinitionMapping)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_SLICING:
				return validateElementDefinitionSlicing((ElementDefinitionSlicing)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_TYPE:
				return validateElementDefinitionType((ElementDefinitionType)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_REQUEST:
				return validateEligibilityRequest((EligibilityRequest)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_RESPONSE:
				return validateEligibilityResponse((EligibilityResponse)value, diagnostics, context);
			case FhirPackage.ENCOUNTER:
				return validateEncounter((Encounter)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_CLASS:
				return validateEncounterClass((EncounterClass)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_HOSPITALIZATION:
				return validateEncounterHospitalization((EncounterHospitalization)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_LOCATION:
				return validateEncounterLocation((EncounterLocation)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS:
				return validateEncounterLocationStatus((EncounterLocationStatus)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_PARTICIPANT:
				return validateEncounterParticipant((EncounterParticipant)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_STATE:
				return validateEncounterState((EncounterState)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_STATUS_HISTORY:
				return validateEncounterStatusHistory((EncounterStatusHistory)value, diagnostics, context);
			case FhirPackage.ENROLLMENT_REQUEST:
				return validateEnrollmentRequest((EnrollmentRequest)value, diagnostics, context);
			case FhirPackage.ENROLLMENT_RESPONSE:
				return validateEnrollmentResponse((EnrollmentResponse)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE:
				return validateEpisodeOfCare((EpisodeOfCare)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE_CARE_TEAM:
				return validateEpisodeOfCareCareTeam((EpisodeOfCareCareTeam)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE_STATUS:
				return validateEpisodeOfCareStatus((EpisodeOfCareStatus)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE_STATUS_HISTORY:
				return validateEpisodeOfCareStatusHistory((EpisodeOfCareStatusHistory)value, diagnostics, context);
			case FhirPackage.EVENT_TIMING:
				return validateEventTiming((EventTiming)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT:
				return validateExplanationOfBenefit((ExplanationOfBenefit)value, diagnostics, context);
			case FhirPackage.EXTENSION:
				return validateExtension((Extension)value, diagnostics, context);
			case FhirPackage.EXTENSION_CONTEXT:
				return validateExtensionContext((ExtensionContext)value, diagnostics, context);
			case FhirPackage.FAMILY_MEMBER_HISTORY:
				return validateFamilyMemberHistory((FamilyMemberHistory)value, diagnostics, context);
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION:
				return validateFamilyMemberHistoryCondition((FamilyMemberHistoryCondition)value, diagnostics, context);
			case FhirPackage.FILTER_OPERATOR:
				return validateFilterOperator((FilterOperator)value, diagnostics, context);
			case FhirPackage.FLAG:
				return validateFlag((Flag)value, diagnostics, context);
			case FhirPackage.FLAG_STATUS:
				return validateFlagStatus((FlagStatus)value, diagnostics, context);
			case FhirPackage.GOAL:
				return validateGoal((Goal)value, diagnostics, context);
			case FhirPackage.GOAL_OUTCOME:
				return validateGoalOutcome((GoalOutcome)value, diagnostics, context);
			case FhirPackage.GOAL_STATUS:
				return validateGoalStatus((GoalStatus)value, diagnostics, context);
			case FhirPackage.GROUP:
				return validateGroup((Group)value, diagnostics, context);
			case FhirPackage.GROUP_CHARACTERISTIC:
				return validateGroupCharacteristic((GroupCharacteristic)value, diagnostics, context);
			case FhirPackage.GROUP_TYPE:
				return validateGroupType((GroupType)value, diagnostics, context);
			case FhirPackage.HEALTHCARE_SERVICE:
				return validateHealthcareService((HealthcareService)value, diagnostics, context);
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME:
				return validateHealthcareServiceAvailableTime((HealthcareServiceAvailableTime)value, diagnostics, context);
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE:
				return validateHealthcareServiceNotAvailable((HealthcareServiceNotAvailable)value, diagnostics, context);
			case FhirPackage.HEALTHCARE_SERVICE_SERVICE_TYPE:
				return validateHealthcareServiceServiceType((HealthcareServiceServiceType)value, diagnostics, context);
			case FhirPackage.HTTP_VERB:
				return validateHTTPVerb((HTTPVerb)value, diagnostics, context);
			case FhirPackage.HUMAN_NAME:
				return validateHumanName((HumanName)value, diagnostics, context);
			case FhirPackage.ID:
				return validateId((Id)value, diagnostics, context);
			case FhirPackage.IDENTIFIER:
				return validateIdentifier((Identifier)value, diagnostics, context);
			case FhirPackage.IDENTIFIER_USE:
				return validateIdentifierUse((IdentifierUse)value, diagnostics, context);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL:
				return validateIdentityAssuranceLevel((IdentityAssuranceLevel)value, diagnostics, context);
			case FhirPackage.IMAGING_OBJECT_SELECTION:
				return validateImagingObjectSelection((ImagingObjectSelection)value, diagnostics, context);
			case FhirPackage.IMAGING_OBJECT_SELECTION_FRAMES:
				return validateImagingObjectSelectionFrames((ImagingObjectSelectionFrames)value, diagnostics, context);
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE:
				return validateImagingObjectSelectionInstance((ImagingObjectSelectionInstance)value, diagnostics, context);
			case FhirPackage.IMAGING_OBJECT_SELECTION_SERIES:
				return validateImagingObjectSelectionSeries((ImagingObjectSelectionSeries)value, diagnostics, context);
			case FhirPackage.IMAGING_OBJECT_SELECTION_STUDY:
				return validateImagingObjectSelectionStudy((ImagingObjectSelectionStudy)value, diagnostics, context);
			case FhirPackage.IMAGING_STUDY:
				return validateImagingStudy((ImagingStudy)value, diagnostics, context);
			case FhirPackage.IMAGING_STUDY_INSTANCE:
				return validateImagingStudyInstance((ImagingStudyInstance)value, diagnostics, context);
			case FhirPackage.IMAGING_STUDY_SERIES:
				return validateImagingStudySeries((ImagingStudySeries)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION:
				return validateImmunization((Immunization)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_EXPLANATION:
				return validateImmunizationExplanation((ImmunizationExplanation)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_REACTION:
				return validateImmunizationReaction((ImmunizationReaction)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION:
				return validateImmunizationRecommendation((ImmunizationRecommendation)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION:
				return validateImmunizationRecommendationDateCriterion((ImmunizationRecommendationDateCriterion)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL:
				return validateImmunizationRecommendationProtocol((ImmunizationRecommendationProtocol)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION:
				return validateImmunizationRecommendationRecommendation((ImmunizationRecommendationRecommendation)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL:
				return validateImmunizationVaccinationProtocol((ImmunizationVaccinationProtocol)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE:
				return validateImplementationGuide((ImplementationGuide)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_CONTACT:
				return validateImplementationGuideContact((ImplementationGuideContact)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_DEFAULT:
				return validateImplementationGuideDefault((ImplementationGuideDefault)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_EXAMPLE:
				return validateImplementationGuideExample((ImplementationGuideExample)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_ITEM:
				return validateImplementationGuideItem((ImplementationGuideItem)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_PACKAGE:
				return validateImplementationGuidePackage((ImplementationGuidePackage)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE:
				return validateImplementationGuidePage((ImplementationGuidePage)value, diagnostics, context);
			case FhirPackage.INSTANCE_AVAILABILITY:
				return validateInstanceAvailability((InstanceAvailability)value, diagnostics, context);
			case FhirPackage.INSTANT:
				return validateInstant((Instant)value, diagnostics, context);
			case FhirPackage.INTEGER:
				return validateInteger((org.hl7.fhir.Integer)value, diagnostics, context);
			case FhirPackage.ISSUE_SEVERITY:
				return validateIssueSeverity((IssueSeverity)value, diagnostics, context);
			case FhirPackage.LINK_TYPE:
				return validateLinkType((LinkType)value, diagnostics, context);
			case FhirPackage.LIST:
				return validateList((List)value, diagnostics, context);
			case FhirPackage.LIST_ENTRY:
				return validateListEntry((ListEntry)value, diagnostics, context);
			case FhirPackage.LIST_MODE:
				return validateListMode((ListMode)value, diagnostics, context);
			case FhirPackage.LIST_STATUS:
				return validateListStatus((ListStatus)value, diagnostics, context);
			case FhirPackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			case FhirPackage.LOCATION_MODE:
				return validateLocationMode((LocationMode)value, diagnostics, context);
			case FhirPackage.LOCATION_POSITION:
				return validateLocationPosition((LocationPosition)value, diagnostics, context);
			case FhirPackage.LOCATION_STATUS:
				return validateLocationStatus((LocationStatus)value, diagnostics, context);
			case FhirPackage.MEASMNT_PRINCIPLE:
				return validateMeasmntPrinciple((MeasmntPrinciple)value, diagnostics, context);
			case FhirPackage.MEDIA:
				return validateMedia((Media)value, diagnostics, context);
			case FhirPackage.MEDICATION:
				return validateMedication((Medication)value, diagnostics, context);
			case FhirPackage.MEDICATION_ADMINISTRATION:
				return validateMedicationAdministration((MedicationAdministration)value, diagnostics, context);
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE:
				return validateMedicationAdministrationDosage((MedicationAdministrationDosage)value, diagnostics, context);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS:
				return validateMedicationAdministrationStatus((MedicationAdministrationStatus)value, diagnostics, context);
			case FhirPackage.MEDICATION_BATCH:
				return validateMedicationBatch((MedicationBatch)value, diagnostics, context);
			case FhirPackage.MEDICATION_CONTENT:
				return validateMedicationContent((MedicationContent)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE:
				return validateMedicationDispense((MedicationDispense)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION:
				return validateMedicationDispenseDosageInstruction((MedicationDispenseDosageInstruction)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE_STATUS:
				return validateMedicationDispenseStatus((MedicationDispenseStatus)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION:
				return validateMedicationDispenseSubstitution((MedicationDispenseSubstitution)value, diagnostics, context);
			case FhirPackage.MEDICATION_INGREDIENT:
				return validateMedicationIngredient((MedicationIngredient)value, diagnostics, context);
			case FhirPackage.MEDICATION_KIND:
				return validateMedicationKind((MedicationKind)value, diagnostics, context);
			case FhirPackage.MEDICATION_PACKAGE:
				return validateMedicationPackage((MedicationPackage)value, diagnostics, context);
			case FhirPackage.MEDICATION_PRESCRIPTION:
				return validateMedicationPrescription((MedicationPrescription)value, diagnostics, context);
			case FhirPackage.MEDICATION_PRESCRIPTION_DISPENSE:
				return validateMedicationPrescriptionDispense((MedicationPrescriptionDispense)value, diagnostics, context);
			case FhirPackage.MEDICATION_PRESCRIPTION_DOSAGE_INSTRUCTION:
				return validateMedicationPrescriptionDosageInstruction((MedicationPrescriptionDosageInstruction)value, diagnostics, context);
			case FhirPackage.MEDICATION_PRESCRIPTION_STATUS:
				return validateMedicationPrescriptionStatus((MedicationPrescriptionStatus)value, diagnostics, context);
			case FhirPackage.MEDICATION_PRESCRIPTION_SUBSTITUTION:
				return validateMedicationPrescriptionSubstitution((MedicationPrescriptionSubstitution)value, diagnostics, context);
			case FhirPackage.MEDICATION_PRODUCT:
				return validateMedicationProduct((MedicationProduct)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT:
				return validateMedicationStatement((MedicationStatement)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT_DOSAGE:
				return validateMedicationStatementDosage((MedicationStatementDosage)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT_STATUS:
				return validateMedicationStatementStatus((MedicationStatementStatus)value, diagnostics, context);
			case FhirPackage.MESSAGE_HEADER:
				return validateMessageHeader((MessageHeader)value, diagnostics, context);
			case FhirPackage.MESSAGE_HEADER_DESTINATION:
				return validateMessageHeaderDestination((MessageHeaderDestination)value, diagnostics, context);
			case FhirPackage.MESSAGE_HEADER_RESPONSE:
				return validateMessageHeaderResponse((MessageHeaderResponse)value, diagnostics, context);
			case FhirPackage.MESSAGE_HEADER_SOURCE:
				return validateMessageHeaderSource((MessageHeaderSource)value, diagnostics, context);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY:
				return validateMessageSignificanceCategory((MessageSignificanceCategory)value, diagnostics, context);
			case FhirPackage.META:
				return validateMeta((Meta)value, diagnostics, context);
			case FhirPackage.MONEY:
				return validateMoney((Money)value, diagnostics, context);
			case FhirPackage.NAME_USE:
				return validateNameUse((NameUse)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM:
				return validateNamingSystem((NamingSystem)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_CONTACT:
				return validateNamingSystemContact((NamingSystemContact)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE:
				return validateNamingSystemIdentifierType((NamingSystemIdentifierType)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_TYPE:
				return validateNamingSystemType((NamingSystemType)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_UNIQUE_ID:
				return validateNamingSystemUniqueId((NamingSystemUniqueId)value, diagnostics, context);
			case FhirPackage.NARRATIVE:
				return validateNarrative((Narrative)value, diagnostics, context);
			case FhirPackage.NARRATIVE_STATUS:
				return validateNarrativeStatus((NarrativeStatus)value, diagnostics, context);
			case FhirPackage.NOTE_TYPE:
				return validateNoteType((NoteType)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER:
				return validateNutritionOrder((NutritionOrder)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_ADMINISTRATION:
				return validateNutritionOrderAdministration((NutritionOrderAdministration)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA:
				return validateNutritionOrderEnteralFormula((NutritionOrderEnteralFormula)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_NUTRIENT:
				return validateNutritionOrderNutrient((NutritionOrderNutrient)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_ORAL_DIET:
				return validateNutritionOrderOralDiet((NutritionOrderOralDiet)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_STATUS:
				return validateNutritionOrderStatus((NutritionOrderStatus)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT:
				return validateNutritionOrderSupplement((NutritionOrderSupplement)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_TEXTURE:
				return validateNutritionOrderTexture((NutritionOrderTexture)value, diagnostics, context);
			case FhirPackage.OBSERVATION:
				return validateObservation((Observation)value, diagnostics, context);
			case FhirPackage.OBSERVATION_COMPONENT:
				return validateObservationComponent((ObservationComponent)value, diagnostics, context);
			case FhirPackage.OBSERVATION_REFERENCE_RANGE:
				return validateObservationReferenceRange((ObservationReferenceRange)value, diagnostics, context);
			case FhirPackage.OBSERVATION_RELATED:
				return validateObservationRelated((ObservationRelated)value, diagnostics, context);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE:
				return validateObservationRelationshipType((ObservationRelationshipType)value, diagnostics, context);
			case FhirPackage.OBSERVATION_RELIABILITY:
				return validateObservationReliability((ObservationReliability)value, diagnostics, context);
			case FhirPackage.OBSERVATION_STATUS:
				return validateObservationStatus((ObservationStatus)value, diagnostics, context);
			case FhirPackage.OID:
				return validateOid((Oid)value, diagnostics, context);
			case FhirPackage.OPERATION_DEFINITION:
				return validateOperationDefinition((OperationDefinition)value, diagnostics, context);
			case FhirPackage.OPERATION_DEFINITION_BINDING:
				return validateOperationDefinitionBinding((OperationDefinitionBinding)value, diagnostics, context);
			case FhirPackage.OPERATION_DEFINITION_CONTACT:
				return validateOperationDefinitionContact((OperationDefinitionContact)value, diagnostics, context);
			case FhirPackage.OPERATION_DEFINITION_PARAMETER:
				return validateOperationDefinitionParameter((OperationDefinitionParameter)value, diagnostics, context);
			case FhirPackage.OPERATION_KIND:
				return validateOperationKind((OperationKind)value, diagnostics, context);
			case FhirPackage.OPERATION_OUTCOME:
				return validateOperationOutcome((OperationOutcome)value, diagnostics, context);
			case FhirPackage.OPERATION_OUTCOME_ISSUE:
				return validateOperationOutcomeIssue((OperationOutcomeIssue)value, diagnostics, context);
			case FhirPackage.OPERATION_PARAMETER_USE:
				return validateOperationParameterUse((OperationParameterUse)value, diagnostics, context);
			case FhirPackage.ORDER:
				return validateOrder((Order)value, diagnostics, context);
			case FhirPackage.ORDER_RESPONSE:
				return validateOrderResponse((OrderResponse)value, diagnostics, context);
			case FhirPackage.ORDER_STATUS:
				return validateOrderStatus((OrderStatus)value, diagnostics, context);
			case FhirPackage.ORDER_WHEN:
				return validateOrderWhen((OrderWhen)value, diagnostics, context);
			case FhirPackage.ORGANIZATION:
				return validateOrganization((Organization)value, diagnostics, context);
			case FhirPackage.ORGANIZATION_CONTACT:
				return validateOrganizationContact((OrganizationContact)value, diagnostics, context);
			case FhirPackage.PAGE_PURPOSE:
				return validatePagePurpose((PagePurpose)value, diagnostics, context);
			case FhirPackage.PARAMETERS:
				return validateParameters((Parameters)value, diagnostics, context);
			case FhirPackage.PARAMETERS_PARAMETER:
				return validateParametersParameter((ParametersParameter)value, diagnostics, context);
			case FhirPackage.PARTICIPANT_REQUIRED:
				return validateParticipantRequired((ParticipantRequired)value, diagnostics, context);
			case FhirPackage.PARTICIPANT_STATUS:
				return validateParticipantStatus((ParticipantStatus)value, diagnostics, context);
			case FhirPackage.PARTICIPATION_STATUS:
				return validateParticipationStatus((ParticipationStatus)value, diagnostics, context);
			case FhirPackage.PATIENT:
				return validatePatient((Patient)value, diagnostics, context);
			case FhirPackage.PATIENT_ANIMAL:
				return validatePatientAnimal((PatientAnimal)value, diagnostics, context);
			case FhirPackage.PATIENT_COMMUNICATION:
				return validatePatientCommunication((PatientCommunication)value, diagnostics, context);
			case FhirPackage.PATIENT_CONTACT:
				return validatePatientContact((PatientContact)value, diagnostics, context);
			case FhirPackage.PATIENT_LINK:
				return validatePatientLink((PatientLink)value, diagnostics, context);
			case FhirPackage.PAYMENT_NOTICE:
				return validatePaymentNotice((PaymentNotice)value, diagnostics, context);
			case FhirPackage.PAYMENT_RECONCILIATION:
				return validatePaymentReconciliation((PaymentReconciliation)value, diagnostics, context);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL:
				return validatePaymentReconciliationDetail((PaymentReconciliationDetail)value, diagnostics, context);
			case FhirPackage.PAYMENT_RECONCILIATION_NOTE:
				return validatePaymentReconciliationNote((PaymentReconciliationNote)value, diagnostics, context);
			case FhirPackage.PERIOD:
				return validatePeriod((Period)value, diagnostics, context);
			case FhirPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case FhirPackage.PERSON_LINK:
				return validatePersonLink((PersonLink)value, diagnostics, context);
			case FhirPackage.POSITIVE_INT:
				return validatePositiveInt((PositiveInt)value, diagnostics, context);
			case FhirPackage.PRACTITIONER:
				return validatePractitioner((Practitioner)value, diagnostics, context);
			case FhirPackage.PRACTITIONER_PRACTITIONER_ROLE:
				return validatePractitionerPractitionerRole((PractitionerPractitionerRole)value, diagnostics, context);
			case FhirPackage.PRACTITIONER_QUALIFICATION:
				return validatePractitionerQualification((PractitionerQualification)value, diagnostics, context);
			case FhirPackage.PROCEDURE:
				return validateProcedure((Procedure)value, diagnostics, context);
			case FhirPackage.PROCEDURE_BODY_SITE:
				return validateProcedureBodySite((ProcedureBodySite)value, diagnostics, context);
			case FhirPackage.PROCEDURE_DEVICE:
				return validateProcedureDevice((ProcedureDevice)value, diagnostics, context);
			case FhirPackage.PROCEDURE_PERFORMER:
				return validateProcedurePerformer((ProcedurePerformer)value, diagnostics, context);
			case FhirPackage.PROCEDURE_RELATED_ITEM:
				return validateProcedureRelatedItem((ProcedureRelatedItem)value, diagnostics, context);
			case FhirPackage.PROCEDURE_RELATIONSHIP_TYPE:
				return validateProcedureRelationshipType((ProcedureRelationshipType)value, diagnostics, context);
			case FhirPackage.PROCEDURE_REQUEST:
				return validateProcedureRequest((ProcedureRequest)value, diagnostics, context);
			case FhirPackage.PROCEDURE_REQUEST_BODY_SITE:
				return validateProcedureRequestBodySite((ProcedureRequestBodySite)value, diagnostics, context);
			case FhirPackage.PROCEDURE_REQUEST_PRIORITY:
				return validateProcedureRequestPriority((ProcedureRequestPriority)value, diagnostics, context);
			case FhirPackage.PROCEDURE_REQUEST_STATUS:
				return validateProcedureRequestStatus((ProcedureRequestStatus)value, diagnostics, context);
			case FhirPackage.PROCEDURE_STATUS:
				return validateProcedureStatus((ProcedureStatus)value, diagnostics, context);
			case FhirPackage.PROCESS_REQUEST:
				return validateProcessRequest((ProcessRequest)value, diagnostics, context);
			case FhirPackage.PROCESS_REQUEST_ITEM:
				return validateProcessRequestItem((ProcessRequestItem)value, diagnostics, context);
			case FhirPackage.PROCESS_RESPONSE:
				return validateProcessResponse((ProcessResponse)value, diagnostics, context);
			case FhirPackage.PROCESS_RESPONSE_NOTES:
				return validateProcessResponseNotes((ProcessResponseNotes)value, diagnostics, context);
			case FhirPackage.PROPERTY_REPRESENTATION:
				return validatePropertyRepresentation((PropertyRepresentation)value, diagnostics, context);
			case FhirPackage.PROVENANCE:
				return validateProvenance((Provenance)value, diagnostics, context);
			case FhirPackage.PROVENANCE_AGENT:
				return validateProvenanceAgent((ProvenanceAgent)value, diagnostics, context);
			case FhirPackage.PROVENANCE_ENTITY:
				return validateProvenanceEntity((ProvenanceEntity)value, diagnostics, context);
			case FhirPackage.PROVENANCE_ENTITY_ROLE:
				return validateProvenanceEntityRole((ProvenanceEntityRole)value, diagnostics, context);
			case FhirPackage.QUANTITY:
				return validateQuantity((Quantity)value, diagnostics, context);
			case FhirPackage.QUANTITY_COMPARATOR:
				return validateQuantityComparator((QuantityComparator)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE:
				return validateQuestionnaire((Questionnaire)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ANSWERS:
				return validateQuestionnaireAnswers((QuestionnaireAnswers)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_ANSWER:
				return validateQuestionnaireAnswersAnswer((QuestionnaireAnswersAnswer)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_GROUP:
				return validateQuestionnaireAnswersGroup((QuestionnaireAnswersGroup)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_QUESTION:
				return validateQuestionnaireAnswersQuestion((QuestionnaireAnswersQuestion)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_STATUS:
				return validateQuestionnaireAnswersStatus((QuestionnaireAnswersStatus)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_GROUP:
				return validateQuestionnaireGroup((QuestionnaireGroup)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_QUESTION:
				return validateQuestionnaireQuestion((QuestionnaireQuestion)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_STATUS:
				return validateQuestionnaireStatus((QuestionnaireStatus)value, diagnostics, context);
			case FhirPackage.RANGE:
				return validateRange((Range)value, diagnostics, context);
			case FhirPackage.RATIO:
				return validateRatio((Ratio)value, diagnostics, context);
			case FhirPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case FhirPackage.REFERRAL_REQUEST:
				return validateReferralRequest((ReferralRequest)value, diagnostics, context);
			case FhirPackage.REFERRAL_STATUS:
				return validateReferralStatus((ReferralStatus)value, diagnostics, context);
			case FhirPackage.RELATED_PERSON:
				return validateRelatedPerson((RelatedPerson)value, diagnostics, context);
			case FhirPackage.REMITTANCE_OUTCOME:
				return validateRemittanceOutcome((RemittanceOutcome)value, diagnostics, context);
			case FhirPackage.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case FhirPackage.RESOURCE_CONTAINER:
				return validateResourceContainer((ResourceContainer)value, diagnostics, context);
			case FhirPackage.RESOURCE_VERSION_POLICY:
				return validateResourceVersionPolicy((ResourceVersionPolicy)value, diagnostics, context);
			case FhirPackage.RESPONSE_TYPE:
				return validateResponseType((ResponseType)value, diagnostics, context);
			case FhirPackage.RESTFUL_CONFORMANCE_MODE:
				return validateRestfulConformanceMode((RestfulConformanceMode)value, diagnostics, context);
			case FhirPackage.RISK_ASSESSMENT:
				return validateRiskAssessment((RiskAssessment)value, diagnostics, context);
			case FhirPackage.RISK_ASSESSMENT_PREDICTION:
				return validateRiskAssessmentPrediction((RiskAssessmentPrediction)value, diagnostics, context);
			case FhirPackage.SAMPLED_DATA:
				return validateSampledData((SampledData)value, diagnostics, context);
			case FhirPackage.SAMPLED_DATA_DATA_TYPE:
				return validateSampledDataDataType((SampledDataDataType)value, diagnostics, context);
			case FhirPackage.SCHEDULE:
				return validateSchedule((Schedule)value, diagnostics, context);
			case FhirPackage.SEARCH_ENTRY_MODE:
				return validateSearchEntryMode((SearchEntryMode)value, diagnostics, context);
			case FhirPackage.SEARCH_MODIFIER_CODE:
				return validateSearchModifierCode((SearchModifierCode)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAMETER:
				return validateSearchParameter((SearchParameter)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAMETER_CONTACT:
				return validateSearchParameterContact((SearchParameterContact)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAM_TYPE:
				return validateSearchParamType((SearchParamType)value, diagnostics, context);
			case FhirPackage.SIGNATURE:
				return validateSignature((Signature)value, diagnostics, context);
			case FhirPackage.SLICING_RULES:
				return validateSlicingRules((SlicingRules)value, diagnostics, context);
			case FhirPackage.SLOT:
				return validateSlot((Slot)value, diagnostics, context);
			case FhirPackage.SLOT_STATUS:
				return validateSlotStatus((SlotStatus)value, diagnostics, context);
			case FhirPackage.SPECIMEN:
				return validateSpecimen((Specimen)value, diagnostics, context);
			case FhirPackage.SPECIMEN_COLLECTION:
				return validateSpecimenCollection((SpecimenCollection)value, diagnostics, context);
			case FhirPackage.SPECIMEN_CONTAINER:
				return validateSpecimenContainer((SpecimenContainer)value, diagnostics, context);
			case FhirPackage.SPECIMEN_TREATMENT:
				return validateSpecimenTreatment((SpecimenTreatment)value, diagnostics, context);
			case FhirPackage.STRING:
				return validateString((org.hl7.fhir.String)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION:
				return validateStructureDefinition((StructureDefinition)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_CONTACT:
				return validateStructureDefinitionContact((StructureDefinitionContact)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_DIFFERENTIAL:
				return validateStructureDefinitionDifferential((StructureDefinitionDifferential)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_KIND:
				return validateStructureDefinitionKind((StructureDefinitionKind)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING:
				return validateStructureDefinitionMapping((StructureDefinitionMapping)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_SNAPSHOT:
				return validateStructureDefinitionSnapshot((StructureDefinitionSnapshot)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION:
				return validateSubscription((Subscription)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_CHANNEL:
				return validateSubscriptionChannel((SubscriptionChannel)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE:
				return validateSubscriptionChannelType((SubscriptionChannelType)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_STATUS:
				return validateSubscriptionStatus((SubscriptionStatus)value, diagnostics, context);
			case FhirPackage.SUBSTANCE:
				return validateSubstance((Substance)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_INGREDIENT:
				return validateSubstanceIngredient((SubstanceIngredient)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_INSTANCE:
				return validateSubstanceInstance((SubstanceInstance)value, diagnostics, context);
			case FhirPackage.SUPPLY:
				return validateSupply((Supply)value, diagnostics, context);
			case FhirPackage.SUPPLY_DELIVERY:
				return validateSupplyDelivery((SupplyDelivery)value, diagnostics, context);
			case FhirPackage.SUPPLY_DELIVERY_STATUS:
				return validateSupplyDeliveryStatus((SupplyDeliveryStatus)value, diagnostics, context);
			case FhirPackage.SUPPLY_DISPENSE:
				return validateSupplyDispense((SupplyDispense)value, diagnostics, context);
			case FhirPackage.SUPPLY_DISPENSE_STATUS:
				return validateSupplyDispenseStatus((SupplyDispenseStatus)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST:
				return validateSupplyRequest((SupplyRequest)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST_STATUS:
				return validateSupplyRequestStatus((SupplyRequestStatus)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST_WHEN:
				return validateSupplyRequestWhen((SupplyRequestWhen)value, diagnostics, context);
			case FhirPackage.SUPPLY_STATUS:
				return validateSupplyStatus((SupplyStatus)value, diagnostics, context);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION:
				return validateSystemRestfulInteraction((SystemRestfulInteraction)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT:
				return validateTestScript((TestScript)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ACTION:
				return validateTestScriptAction((TestScriptAction)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ACTION1:
				return validateTestScriptAction1((TestScriptAction1)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ACTION2:
				return validateTestScriptAction2((TestScriptAction2)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ASSERT:
				return validateTestScriptAssert((TestScriptAssert)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_CAPABILITIES:
				return validateTestScriptCapabilities((TestScriptCapabilities)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_FIXTURE:
				return validateTestScriptFixture((TestScriptFixture)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_LINK:
				return validateTestScriptLink((TestScriptLink)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_METADATA:
				return validateTestScriptMetadata((TestScriptMetadata)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_OPERATION:
				return validateTestScriptOperation((TestScriptOperation)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_REQUEST_HEADER:
				return validateTestScriptRequestHeader((TestScriptRequestHeader)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_SETUP:
				return validateTestScriptSetup((TestScriptSetup)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_TEARDOWN:
				return validateTestScriptTeardown((TestScriptTeardown)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_TEST:
				return validateTestScriptTest((TestScriptTest)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_VARIABLE:
				return validateTestScriptVariable((TestScriptVariable)value, diagnostics, context);
			case FhirPackage.TIME:
				return validateTime((Time)value, diagnostics, context);
			case FhirPackage.TIMING:
				return validateTiming((Timing)value, diagnostics, context);
			case FhirPackage.TIMING_REPEAT:
				return validateTimingRepeat((TimingRepeat)value, diagnostics, context);
			case FhirPackage.TRANSACTION_MODE:
				return validateTransactionMode((TransactionMode)value, diagnostics, context);
			case FhirPackage.TYPE_RESTFUL_INTERACTION:
				return validateTypeRestfulInteraction((TypeRestfulInteraction)value, diagnostics, context);
			case FhirPackage.UNITS_OF_TIME:
				return validateUnitsOfTime((UnitsOfTime)value, diagnostics, context);
			case FhirPackage.UNSIGNED_INT:
				return validateUnsignedInt((UnsignedInt)value, diagnostics, context);
			case FhirPackage.URI:
				return validateUri((Uri)value, diagnostics, context);
			case FhirPackage.USE:
				return validateUse((Use)value, diagnostics, context);
			case FhirPackage.UUID:
				return validateUuid((Uuid)value, diagnostics, context);
			case FhirPackage.VALUE_SET:
				return validateValueSet((ValueSet)value, diagnostics, context);
			case FhirPackage.VALUE_SET_CODE_SYSTEM:
				return validateValueSetCodeSystem((ValueSetCodeSystem)value, diagnostics, context);
			case FhirPackage.VALUE_SET_COMPOSE:
				return validateValueSetCompose((ValueSetCompose)value, diagnostics, context);
			case FhirPackage.VALUE_SET_CONCEPT:
				return validateValueSetConcept((ValueSetConcept)value, diagnostics, context);
			case FhirPackage.VALUE_SET_CONCEPT1:
				return validateValueSetConcept1((ValueSetConcept1)value, diagnostics, context);
			case FhirPackage.VALUE_SET_CONTACT:
				return validateValueSetContact((ValueSetContact)value, diagnostics, context);
			case FhirPackage.VALUE_SET_CONTAINS:
				return validateValueSetContains((ValueSetContains)value, diagnostics, context);
			case FhirPackage.VALUE_SET_DESIGNATION:
				return validateValueSetDesignation((ValueSetDesignation)value, diagnostics, context);
			case FhirPackage.VALUE_SET_EXPANSION:
				return validateValueSetExpansion((ValueSetExpansion)value, diagnostics, context);
			case FhirPackage.VALUE_SET_FILTER:
				return validateValueSetFilter((ValueSetFilter)value, diagnostics, context);
			case FhirPackage.VALUE_SET_INCLUDE:
				return validateValueSetInclude((ValueSetInclude)value, diagnostics, context);
			case FhirPackage.VALUE_SET_PARAMETER:
				return validateValueSetParameter((ValueSetParameter)value, diagnostics, context);
			case FhirPackage.VISION_BASE:
				return validateVisionBase((VisionBase)value, diagnostics, context);
			case FhirPackage.VISION_EYES:
				return validateVisionEyes((VisionEyes)value, diagnostics, context);
			case FhirPackage.VISION_PRESCRIPTION:
				return validateVisionPrescription((VisionPrescription)value, diagnostics, context);
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE:
				return validateVisionPrescriptionDispense((VisionPrescriptionDispense)value, diagnostics, context);
			case FhirPackage.ACCOUNT_STATUS_LIST:
				return validateAccountStatusList((AccountStatusList)value, diagnostics, context);
			case FhirPackage.ACTION_LIST_LIST:
				return validateActionListList((ActionListList)value, diagnostics, context);
			case FhirPackage.ADDRESS_TYPE_LIST:
				return validateAddressTypeList((AddressTypeList)value, diagnostics, context);
			case FhirPackage.ADDRESS_USE_LIST:
				return validateAddressUseList((AddressUseList)value, diagnostics, context);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST:
				return validateAdministrativeGenderList((AdministrativeGenderList)value, diagnostics, context);
			case FhirPackage.AGE_UNITS_LIST:
				return validateAgeUnitsList((AgeUnitsList)value, diagnostics, context);
			case FhirPackage.AGGREGATION_MODE_LIST:
				return validateAggregationModeList((AggregationModeList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST:
				return validateAllergyIntoleranceCategoryList((AllergyIntoleranceCategoryList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CERTAINTY_LIST:
				return validateAllergyIntoleranceCertaintyList((AllergyIntoleranceCertaintyList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST:
				return validateAllergyIntoleranceCriticalityList((AllergyIntoleranceCriticalityList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST:
				return validateAllergyIntoleranceSeverityList((AllergyIntoleranceSeverityList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_STATUS_LIST:
				return validateAllergyIntoleranceStatusList((AllergyIntoleranceStatusList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST:
				return validateAllergyIntoleranceTypeList((AllergyIntoleranceTypeList)value, diagnostics, context);
			case FhirPackage.ANSWER_FORMAT_LIST:
				return validateAnswerFormatList((AnswerFormatList)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_STATUS_LIST:
				return validateAppointmentStatusList((AppointmentStatusList)value, diagnostics, context);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_LIST:
				return validateAssertionDirectionTypeList((AssertionDirectionTypeList)value, diagnostics, context);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_LIST:
				return validateAssertionOperatorTypeList((AssertionOperatorTypeList)value, diagnostics, context);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_LIST:
				return validateAssertionResponseTypesList((AssertionResponseTypesList)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST:
				return validateAuditEventActionList((AuditEventActionList)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OBJECT_LIFECYCLE_LIST:
				return validateAuditEventObjectLifecycleList((AuditEventObjectLifecycleList)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OBJECT_ROLE_LIST:
				return validateAuditEventObjectRoleList((AuditEventObjectRoleList)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OBJECT_TYPE_LIST:
				return validateAuditEventObjectTypeList((AuditEventObjectTypeList)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST:
				return validateAuditEventOutcomeList((AuditEventOutcomeList)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT_NETWORK_TYPE_LIST:
				return validateAuditEventParticipantNetworkTypeList((AuditEventParticipantNetworkTypeList)value, diagnostics, context);
			case FhirPackage.BINDING_STRENGTH_LIST:
				return validateBindingStrengthList((BindingStrengthList)value, diagnostics, context);
			case FhirPackage.BUNDLE_TYPE_LIST:
				return validateBundleTypeList((BundleTypeList)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY_CATEGORY_LIST:
				return validateCarePlanActivityCategoryList((CarePlanActivityCategoryList)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST:
				return validateCarePlanActivityStatusList((CarePlanActivityStatusList)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_STATUS_LIST:
				return validateCarePlanStatusList((CarePlanStatusList)value, diagnostics, context);
			case FhirPackage.CLAIM_TYPE_LIST:
				return validateClaimTypeList((ClaimTypeList)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST:
				return validateClinicalImpressionStatusList((ClinicalImpressionStatusList)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_REQUEST_STATUS_LIST:
				return validateCommunicationRequestStatusList((CommunicationRequestStatusList)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_STATUS_LIST:
				return validateCommunicationStatusList((CommunicationStatusList)value, diagnostics, context);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST:
				return validateCompositionAttestationModeList((CompositionAttestationModeList)value, diagnostics, context);
			case FhirPackage.COMPOSITION_STATUS_LIST:
				return validateCompositionStatusList((CompositionStatusList)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST:
				return validateConceptMapEquivalenceList((ConceptMapEquivalenceList)value, diagnostics, context);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_LIST:
				return validateConditionalDeleteStatusList((ConditionalDeleteStatusList)value, diagnostics, context);
			case FhirPackage.CONDITION_CLINICAL_STATUS_LIST:
				return validateConditionClinicalStatusList((ConditionClinicalStatusList)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_EVENT_MODE_LIST:
				return validateConformanceEventModeList((ConformanceEventModeList)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_RESOURCE_STATUS_LIST:
				return validateConformanceResourceStatusList((ConformanceResourceStatusList)value, diagnostics, context);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST:
				return validateConstraintSeverityList((ConstraintSeverityList)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST:
				return validateContactPointSystemList((ContactPointSystemList)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_USE_LIST:
				return validateContactPointUseList((ContactPointUseList)value, diagnostics, context);
			case FhirPackage.CONTENT_TYPE_LIST:
				return validateContentTypeList((ContentTypeList)value, diagnostics, context);
			case FhirPackage.CONTRAINDICATION_SEVERITY_LIST:
				return validateContraindicationSeverityList((ContraindicationSeverityList)value, diagnostics, context);
			case FhirPackage.DATA_ELEMENT_SPECIFICITY_LIST:
				return validateDataElementSpecificityList((DataElementSpecificityList)value, diagnostics, context);
			case FhirPackage.DAYS_OF_WEEK_LIST:
				return validateDaysOfWeekList((DaysOfWeekList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST:
				return validateDeviceMetricCalibrationStateList((DeviceMetricCalibrationStateList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST:
				return validateDeviceMetricCalibrationTypeList((DeviceMetricCalibrationTypeList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST:
				return validateDeviceMetricCategoryList((DeviceMetricCategoryList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST:
				return validateDeviceMetricColorList((DeviceMetricColorList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST:
				return validateDeviceMetricOperationalStatusList((DeviceMetricOperationalStatusList)value, diagnostics, context);
			case FhirPackage.DEVICE_STATUS_LIST:
				return validateDeviceStatusList((DeviceStatusList)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_REQUEST_PRIORITY_LIST:
				return validateDeviceUseRequestPriorityList((DeviceUseRequestPriorityList)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_REQUEST_STATUS_LIST:
				return validateDeviceUseRequestStatusList((DeviceUseRequestStatusList)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_ORDER_PRIORITY_LIST:
				return validateDiagnosticOrderPriorityList((DiagnosticOrderPriorityList)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_ORDER_STATUS_LIST:
				return validateDiagnosticOrderStatusList((DiagnosticOrderStatusList)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST:
				return validateDiagnosticReportStatusList((DiagnosticReportStatusList)value, diagnostics, context);
			case FhirPackage.DIGITAL_MEDIA_TYPE_LIST:
				return validateDigitalMediaTypeList((DigitalMediaTypeList)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MODE_LIST:
				return validateDocumentModeList((DocumentModeList)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST:
				return validateDocumentReferenceStatusList((DocumentReferenceStatusList)value, diagnostics, context);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST:
				return validateDocumentRelationshipTypeList((DocumentRelationshipTypeList)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_CLASS_LIST:
				return validateEncounterClassList((EncounterClassList)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST:
				return validateEncounterLocationStatusList((EncounterLocationStatusList)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_STATE_LIST:
				return validateEncounterStateList((EncounterStateList)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST:
				return validateEpisodeOfCareStatusList((EpisodeOfCareStatusList)value, diagnostics, context);
			case FhirPackage.EVENT_TIMING_LIST:
				return validateEventTimingList((EventTimingList)value, diagnostics, context);
			case FhirPackage.EXTENSION_CONTEXT_LIST:
				return validateExtensionContextList((ExtensionContextList)value, diagnostics, context);
			case FhirPackage.FILTER_OPERATOR_LIST:
				return validateFilterOperatorList((FilterOperatorList)value, diagnostics, context);
			case FhirPackage.FLAG_STATUS_LIST:
				return validateFlagStatusList((FlagStatusList)value, diagnostics, context);
			case FhirPackage.GOAL_STATUS_LIST:
				return validateGoalStatusList((GoalStatusList)value, diagnostics, context);
			case FhirPackage.GROUP_TYPE_LIST:
				return validateGroupTypeList((GroupTypeList)value, diagnostics, context);
			case FhirPackage.HTTP_VERB_LIST:
				return validateHTTPVerbList((HTTPVerbList)value, diagnostics, context);
			case FhirPackage.IDENTIFIER_USE_LIST:
				return validateIdentifierUseList((IdentifierUseList)value, diagnostics, context);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST:
				return validateIdentityAssuranceLevelList((IdentityAssuranceLevelList)value, diagnostics, context);
			case FhirPackage.INSTANCE_AVAILABILITY_LIST:
				return validateInstanceAvailabilityList((InstanceAvailabilityList)value, diagnostics, context);
			case FhirPackage.ISSUE_SEVERITY_LIST:
				return validateIssueSeverityList((IssueSeverityList)value, diagnostics, context);
			case FhirPackage.LINK_TYPE_LIST:
				return validateLinkTypeList((LinkTypeList)value, diagnostics, context);
			case FhirPackage.LIST_MODE_LIST:
				return validateListModeList((ListModeList)value, diagnostics, context);
			case FhirPackage.LIST_STATUS_LIST:
				return validateListStatusList((ListStatusList)value, diagnostics, context);
			case FhirPackage.LOCATION_MODE_LIST:
				return validateLocationModeList((LocationModeList)value, diagnostics, context);
			case FhirPackage.LOCATION_STATUS_LIST:
				return validateLocationStatusList((LocationStatusList)value, diagnostics, context);
			case FhirPackage.MEASMNT_PRINCIPLE_LIST:
				return validateMeasmntPrincipleList((MeasmntPrincipleList)value, diagnostics, context);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_LIST:
				return validateMedicationAdministrationStatusList((MedicationAdministrationStatusList)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_LIST:
				return validateMedicationDispenseStatusList((MedicationDispenseStatusList)value, diagnostics, context);
			case FhirPackage.MEDICATION_KIND_LIST:
				return validateMedicationKindList((MedicationKindList)value, diagnostics, context);
			case FhirPackage.MEDICATION_PRESCRIPTION_STATUS_LIST:
				return validateMedicationPrescriptionStatusList((MedicationPrescriptionStatusList)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_LIST:
				return validateMedicationStatementStatusList((MedicationStatementStatusList)value, diagnostics, context);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST:
				return validateMessageSignificanceCategoryList((MessageSignificanceCategoryList)value, diagnostics, context);
			case FhirPackage.NAME_USE_LIST:
				return validateNameUseList((NameUseList)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST:
				return validateNamingSystemIdentifierTypeList((NamingSystemIdentifierTypeList)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST:
				return validateNamingSystemTypeList((NamingSystemTypeList)value, diagnostics, context);
			case FhirPackage.NARRATIVE_STATUS_LIST:
				return validateNarrativeStatusList((NarrativeStatusList)value, diagnostics, context);
			case FhirPackage.NOTE_TYPE_LIST:
				return validateNoteTypeList((NoteTypeList)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_STATUS_LIST:
				return validateNutritionOrderStatusList((NutritionOrderStatusList)value, diagnostics, context);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE_LIST:
				return validateObservationRelationshipTypeList((ObservationRelationshipTypeList)value, diagnostics, context);
			case FhirPackage.OBSERVATION_RELIABILITY_LIST:
				return validateObservationReliabilityList((ObservationReliabilityList)value, diagnostics, context);
			case FhirPackage.OBSERVATION_STATUS_LIST:
				return validateObservationStatusList((ObservationStatusList)value, diagnostics, context);
			case FhirPackage.OPERATION_KIND_LIST:
				return validateOperationKindList((OperationKindList)value, diagnostics, context);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST:
				return validateOperationParameterUseList((OperationParameterUseList)value, diagnostics, context);
			case FhirPackage.ORDER_STATUS_LIST:
				return validateOrderStatusList((OrderStatusList)value, diagnostics, context);
			case FhirPackage.PAGE_PURPOSE_LIST:
				return validatePagePurposeList((PagePurposeList)value, diagnostics, context);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST:
				return validateParticipantRequiredList((ParticipantRequiredList)value, diagnostics, context);
			case FhirPackage.PARTICIPANT_STATUS_LIST:
				return validateParticipantStatusList((ParticipantStatusList)value, diagnostics, context);
			case FhirPackage.PARTICIPATION_STATUS_LIST:
				return validateParticipationStatusList((ParticipationStatusList)value, diagnostics, context);
			case FhirPackage.PROCEDURE_RELATIONSHIP_TYPE_LIST:
				return validateProcedureRelationshipTypeList((ProcedureRelationshipTypeList)value, diagnostics, context);
			case FhirPackage.PROCEDURE_REQUEST_PRIORITY_LIST:
				return validateProcedureRequestPriorityList((ProcedureRequestPriorityList)value, diagnostics, context);
			case FhirPackage.PROCEDURE_REQUEST_STATUS_LIST:
				return validateProcedureRequestStatusList((ProcedureRequestStatusList)value, diagnostics, context);
			case FhirPackage.PROCEDURE_STATUS_LIST:
				return validateProcedureStatusList((ProcedureStatusList)value, diagnostics, context);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST:
				return validatePropertyRepresentationList((PropertyRepresentationList)value, diagnostics, context);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST:
				return validateProvenanceEntityRoleList((ProvenanceEntityRoleList)value, diagnostics, context);
			case FhirPackage.QUANTITY_COMPARATOR_LIST:
				return validateQuantityComparatorList((QuantityComparatorList)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_STATUS_LIST:
				return validateQuestionnaireAnswersStatusList((QuestionnaireAnswersStatusList)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_STATUS_LIST:
				return validateQuestionnaireStatusList((QuestionnaireStatusList)value, diagnostics, context);
			case FhirPackage.REFERRAL_STATUS_LIST:
				return validateReferralStatusList((ReferralStatusList)value, diagnostics, context);
			case FhirPackage.REMITTANCE_OUTCOME_LIST:
				return validateRemittanceOutcomeList((RemittanceOutcomeList)value, diagnostics, context);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST:
				return validateResourceVersionPolicyList((ResourceVersionPolicyList)value, diagnostics, context);
			case FhirPackage.RESPONSE_TYPE_LIST:
				return validateResponseTypeList((ResponseTypeList)value, diagnostics, context);
			case FhirPackage.RESTFUL_CONFORMANCE_MODE_LIST:
				return validateRestfulConformanceModeList((RestfulConformanceModeList)value, diagnostics, context);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST:
				return validateSearchEntryModeList((SearchEntryModeList)value, diagnostics, context);
			case FhirPackage.SEARCH_MODIFIER_CODE_LIST:
				return validateSearchModifierCodeList((SearchModifierCodeList)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST:
				return validateSearchParamTypeList((SearchParamTypeList)value, diagnostics, context);
			case FhirPackage.SLICING_RULES_LIST:
				return validateSlicingRulesList((SlicingRulesList)value, diagnostics, context);
			case FhirPackage.SLOT_STATUS_LIST:
				return validateSlotStatusList((SlotStatusList)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_LIST:
				return validateStructureDefinitionKindList((StructureDefinitionKindList)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST:
				return validateSubscriptionChannelTypeList((SubscriptionChannelTypeList)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST:
				return validateSubscriptionStatusList((SubscriptionStatusList)value, diagnostics, context);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_LIST:
				return validateSupplyDeliveryStatusList((SupplyDeliveryStatusList)value, diagnostics, context);
			case FhirPackage.SUPPLY_DISPENSE_STATUS_LIST:
				return validateSupplyDispenseStatusList((SupplyDispenseStatusList)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST_STATUS_LIST:
				return validateSupplyRequestStatusList((SupplyRequestStatusList)value, diagnostics, context);
			case FhirPackage.SUPPLY_STATUS_LIST:
				return validateSupplyStatusList((SupplyStatusList)value, diagnostics, context);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST:
				return validateSystemRestfulInteractionList((SystemRestfulInteractionList)value, diagnostics, context);
			case FhirPackage.TRANSACTION_MODE_LIST:
				return validateTransactionModeList((TransactionModeList)value, diagnostics, context);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST:
				return validateTypeRestfulInteractionList((TypeRestfulInteractionList)value, diagnostics, context);
			case FhirPackage.UNITS_OF_TIME_LIST:
				return validateUnitsOfTimeList((UnitsOfTimeList)value, diagnostics, context);
			case FhirPackage.USE_LIST:
				return validateUseList((UseList)value, diagnostics, context);
			case FhirPackage.VISION_BASE_LIST:
				return validateVisionBaseList((VisionBaseList)value, diagnostics, context);
			case FhirPackage.VISION_EYES_LIST:
				return validateVisionEyesList((VisionEyesList)value, diagnostics, context);
			case FhirPackage.ACCOUNT_STATUS_LIST_OBJECT:
				return validateAccountStatusListObject((AccountStatusList)value, diagnostics, context);
			case FhirPackage.ACTION_LIST_LIST_OBJECT:
				return validateActionListListObject((ActionListList)value, diagnostics, context);
			case FhirPackage.ADDRESS_TYPE_LIST_OBJECT:
				return validateAddressTypeListObject((AddressTypeList)value, diagnostics, context);
			case FhirPackage.ADDRESS_USE_LIST_OBJECT:
				return validateAddressUseListObject((AddressUseList)value, diagnostics, context);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST_OBJECT:
				return validateAdministrativeGenderListObject((AdministrativeGenderList)value, diagnostics, context);
			case FhirPackage.AGE_UNITS_LIST_OBJECT:
				return validateAgeUnitsListObject((AgeUnitsList)value, diagnostics, context);
			case FhirPackage.AGGREGATION_MODE_LIST_OBJECT:
				return validateAggregationModeListObject((AggregationModeList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CATEGORY_LIST_OBJECT:
				return validateAllergyIntoleranceCategoryListObject((AllergyIntoleranceCategoryList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CERTAINTY_LIST_OBJECT:
				return validateAllergyIntoleranceCertaintyListObject((AllergyIntoleranceCertaintyList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST_OBJECT:
				return validateAllergyIntoleranceCriticalityListObject((AllergyIntoleranceCriticalityList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST_OBJECT:
				return validateAllergyIntoleranceSeverityListObject((AllergyIntoleranceSeverityList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_STATUS_LIST_OBJECT:
				return validateAllergyIntoleranceStatusListObject((AllergyIntoleranceStatusList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST_OBJECT:
				return validateAllergyIntoleranceTypeListObject((AllergyIntoleranceTypeList)value, diagnostics, context);
			case FhirPackage.ANSWER_FORMAT_LIST_OBJECT:
				return validateAnswerFormatListObject((AnswerFormatList)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_STATUS_LIST_OBJECT:
				return validateAppointmentStatusListObject((AppointmentStatusList)value, diagnostics, context);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_LIST_OBJECT:
				return validateAssertionDirectionTypeListObject((AssertionDirectionTypeList)value, diagnostics, context);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_LIST_OBJECT:
				return validateAssertionOperatorTypeListObject((AssertionOperatorTypeList)value, diagnostics, context);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_LIST_OBJECT:
				return validateAssertionResponseTypesListObject((AssertionResponseTypesList)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST_OBJECT:
				return validateAuditEventActionListObject((AuditEventActionList)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OBJECT_LIFECYCLE_LIST_OBJECT:
				return validateAuditEventObjectLifecycleListObject((AuditEventObjectLifecycleList)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OBJECT_ROLE_LIST_OBJECT:
				return validateAuditEventObjectRoleListObject((AuditEventObjectRoleList)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OBJECT_TYPE_LIST_OBJECT:
				return validateAuditEventObjectTypeListObject((AuditEventObjectTypeList)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST_OBJECT:
				return validateAuditEventOutcomeListObject((AuditEventOutcomeList)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_PARTICIPANT_NETWORK_TYPE_LIST_OBJECT:
				return validateAuditEventParticipantNetworkTypeListObject((AuditEventParticipantNetworkTypeList)value, diagnostics, context);
			case FhirPackage.BASE64_BINARY_PRIMITIVE:
				return validateBase64BinaryPrimitive((byte[])value, diagnostics, context);
			case FhirPackage.BINDING_STRENGTH_LIST_OBJECT:
				return validateBindingStrengthListObject((BindingStrengthList)value, diagnostics, context);
			case FhirPackage.BOOLEAN_PRIMITIVE:
				return validateBooleanPrimitive((Boolean)value, diagnostics, context);
			case FhirPackage.BOOLEAN_PRIMITIVE_OBJECT:
				return validateBooleanPrimitiveObject((Boolean)value, diagnostics, context);
			case FhirPackage.BUNDLE_TYPE_LIST_OBJECT:
				return validateBundleTypeListObject((BundleTypeList)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY_CATEGORY_LIST_OBJECT:
				return validateCarePlanActivityCategoryListObject((CarePlanActivityCategoryList)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST_OBJECT:
				return validateCarePlanActivityStatusListObject((CarePlanActivityStatusList)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_STATUS_LIST_OBJECT:
				return validateCarePlanStatusListObject((CarePlanStatusList)value, diagnostics, context);
			case FhirPackage.CLAIM_TYPE_LIST_OBJECT:
				return validateClaimTypeListObject((ClaimTypeList)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST_OBJECT:
				return validateClinicalImpressionStatusListObject((ClinicalImpressionStatusList)value, diagnostics, context);
			case FhirPackage.CODE_PRIMITIVE:
				return validateCodePrimitive((String)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_REQUEST_STATUS_LIST_OBJECT:
				return validateCommunicationRequestStatusListObject((CommunicationRequestStatusList)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_STATUS_LIST_OBJECT:
				return validateCommunicationStatusListObject((CommunicationStatusList)value, diagnostics, context);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST_OBJECT:
				return validateCompositionAttestationModeListObject((CompositionAttestationModeList)value, diagnostics, context);
			case FhirPackage.COMPOSITION_STATUS_LIST_OBJECT:
				return validateCompositionStatusListObject((CompositionStatusList)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST_OBJECT:
				return validateConceptMapEquivalenceListObject((ConceptMapEquivalenceList)value, diagnostics, context);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_LIST_OBJECT:
				return validateConditionalDeleteStatusListObject((ConditionalDeleteStatusList)value, diagnostics, context);
			case FhirPackage.CONDITION_CLINICAL_STATUS_LIST_OBJECT:
				return validateConditionClinicalStatusListObject((ConditionClinicalStatusList)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_EVENT_MODE_LIST_OBJECT:
				return validateConformanceEventModeListObject((ConformanceEventModeList)value, diagnostics, context);
			case FhirPackage.CONFORMANCE_RESOURCE_STATUS_LIST_OBJECT:
				return validateConformanceResourceStatusListObject((ConformanceResourceStatusList)value, diagnostics, context);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST_OBJECT:
				return validateConstraintSeverityListObject((ConstraintSeverityList)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST_OBJECT:
				return validateContactPointSystemListObject((ContactPointSystemList)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_USE_LIST_OBJECT:
				return validateContactPointUseListObject((ContactPointUseList)value, diagnostics, context);
			case FhirPackage.CONTENT_TYPE_LIST_OBJECT:
				return validateContentTypeListObject((ContentTypeList)value, diagnostics, context);
			case FhirPackage.CONTRAINDICATION_SEVERITY_LIST_OBJECT:
				return validateContraindicationSeverityListObject((ContraindicationSeverityList)value, diagnostics, context);
			case FhirPackage.DATA_ELEMENT_SPECIFICITY_LIST_OBJECT:
				return validateDataElementSpecificityListObject((DataElementSpecificityList)value, diagnostics, context);
			case FhirPackage.DATE_PRIMITIVE:
				return validateDatePrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.DATE_PRIMITIVE_BASE:
				return validateDatePrimitiveBase((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.DATE_TIME_PRIMITIVE:
				return validateDateTimePrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.DATE_TIME_PRIMITIVE_BASE:
				return validateDateTimePrimitiveBase((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.DAYS_OF_WEEK_LIST_OBJECT:
				return validateDaysOfWeekListObject((DaysOfWeekList)value, diagnostics, context);
			case FhirPackage.DECIMAL_PRIMITIVE:
				return validateDecimalPrimitive((BigDecimal)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST_OBJECT:
				return validateDeviceMetricCalibrationStateListObject((DeviceMetricCalibrationStateList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST_OBJECT:
				return validateDeviceMetricCalibrationTypeListObject((DeviceMetricCalibrationTypeList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST_OBJECT:
				return validateDeviceMetricCategoryListObject((DeviceMetricCategoryList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST_OBJECT:
				return validateDeviceMetricColorListObject((DeviceMetricColorList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST_OBJECT:
				return validateDeviceMetricOperationalStatusListObject((DeviceMetricOperationalStatusList)value, diagnostics, context);
			case FhirPackage.DEVICE_STATUS_LIST_OBJECT:
				return validateDeviceStatusListObject((DeviceStatusList)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_REQUEST_PRIORITY_LIST_OBJECT:
				return validateDeviceUseRequestPriorityListObject((DeviceUseRequestPriorityList)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_REQUEST_STATUS_LIST_OBJECT:
				return validateDeviceUseRequestStatusListObject((DeviceUseRequestStatusList)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_ORDER_PRIORITY_LIST_OBJECT:
				return validateDiagnosticOrderPriorityListObject((DiagnosticOrderPriorityList)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_ORDER_STATUS_LIST_OBJECT:
				return validateDiagnosticOrderStatusListObject((DiagnosticOrderStatusList)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST_OBJECT:
				return validateDiagnosticReportStatusListObject((DiagnosticReportStatusList)value, diagnostics, context);
			case FhirPackage.DIGITAL_MEDIA_TYPE_LIST_OBJECT:
				return validateDigitalMediaTypeListObject((DigitalMediaTypeList)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MODE_LIST_OBJECT:
				return validateDocumentModeListObject((DocumentModeList)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST_OBJECT:
				return validateDocumentReferenceStatusListObject((DocumentReferenceStatusList)value, diagnostics, context);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST_OBJECT:
				return validateDocumentRelationshipTypeListObject((DocumentRelationshipTypeList)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_CLASS_LIST_OBJECT:
				return validateEncounterClassListObject((EncounterClassList)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST_OBJECT:
				return validateEncounterLocationStatusListObject((EncounterLocationStatusList)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_STATE_LIST_OBJECT:
				return validateEncounterStateListObject((EncounterStateList)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST_OBJECT:
				return validateEpisodeOfCareStatusListObject((EpisodeOfCareStatusList)value, diagnostics, context);
			case FhirPackage.EVENT_TIMING_LIST_OBJECT:
				return validateEventTimingListObject((EventTimingList)value, diagnostics, context);
			case FhirPackage.EXTENSION_CONTEXT_LIST_OBJECT:
				return validateExtensionContextListObject((ExtensionContextList)value, diagnostics, context);
			case FhirPackage.FILTER_OPERATOR_LIST_OBJECT:
				return validateFilterOperatorListObject((FilterOperatorList)value, diagnostics, context);
			case FhirPackage.FLAG_STATUS_LIST_OBJECT:
				return validateFlagStatusListObject((FlagStatusList)value, diagnostics, context);
			case FhirPackage.GOAL_STATUS_LIST_OBJECT:
				return validateGoalStatusListObject((GoalStatusList)value, diagnostics, context);
			case FhirPackage.GROUP_TYPE_LIST_OBJECT:
				return validateGroupTypeListObject((GroupTypeList)value, diagnostics, context);
			case FhirPackage.HTTP_VERB_LIST_OBJECT:
				return validateHTTPVerbListObject((HTTPVerbList)value, diagnostics, context);
			case FhirPackage.IDENTIFIER_USE_LIST_OBJECT:
				return validateIdentifierUseListObject((IdentifierUseList)value, diagnostics, context);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST_OBJECT:
				return validateIdentityAssuranceLevelListObject((IdentityAssuranceLevelList)value, diagnostics, context);
			case FhirPackage.ID_PRIMITIVE:
				return validateIdPrimitive((String)value, diagnostics, context);
			case FhirPackage.INSTANCE_AVAILABILITY_LIST_OBJECT:
				return validateInstanceAvailabilityListObject((InstanceAvailabilityList)value, diagnostics, context);
			case FhirPackage.INSTANT_PRIMITIVE:
				return validateInstantPrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.INTEGER_PRIMITIVE:
				return validateIntegerPrimitive((Integer)value, diagnostics, context);
			case FhirPackage.INTEGER_PRIMITIVE_OBJECT:
				return validateIntegerPrimitiveObject((Integer)value, diagnostics, context);
			case FhirPackage.ISSUE_SEVERITY_LIST_OBJECT:
				return validateIssueSeverityListObject((IssueSeverityList)value, diagnostics, context);
			case FhirPackage.LINK_TYPE_LIST_OBJECT:
				return validateLinkTypeListObject((LinkTypeList)value, diagnostics, context);
			case FhirPackage.LIST_MODE_LIST_OBJECT:
				return validateListModeListObject((ListModeList)value, diagnostics, context);
			case FhirPackage.LIST_STATUS_LIST_OBJECT:
				return validateListStatusListObject((ListStatusList)value, diagnostics, context);
			case FhirPackage.LOCATION_MODE_LIST_OBJECT:
				return validateLocationModeListObject((LocationModeList)value, diagnostics, context);
			case FhirPackage.LOCATION_STATUS_LIST_OBJECT:
				return validateLocationStatusListObject((LocationStatusList)value, diagnostics, context);
			case FhirPackage.MEASMNT_PRINCIPLE_LIST_OBJECT:
				return validateMeasmntPrincipleListObject((MeasmntPrincipleList)value, diagnostics, context);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_LIST_OBJECT:
				return validateMedicationAdministrationStatusListObject((MedicationAdministrationStatusList)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_LIST_OBJECT:
				return validateMedicationDispenseStatusListObject((MedicationDispenseStatusList)value, diagnostics, context);
			case FhirPackage.MEDICATION_KIND_LIST_OBJECT:
				return validateMedicationKindListObject((MedicationKindList)value, diagnostics, context);
			case FhirPackage.MEDICATION_PRESCRIPTION_STATUS_LIST_OBJECT:
				return validateMedicationPrescriptionStatusListObject((MedicationPrescriptionStatusList)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_LIST_OBJECT:
				return validateMedicationStatementStatusListObject((MedicationStatementStatusList)value, diagnostics, context);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST_OBJECT:
				return validateMessageSignificanceCategoryListObject((MessageSignificanceCategoryList)value, diagnostics, context);
			case FhirPackage.NAME_USE_LIST_OBJECT:
				return validateNameUseListObject((NameUseList)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST_OBJECT:
				return validateNamingSystemIdentifierTypeListObject((NamingSystemIdentifierTypeList)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST_OBJECT:
				return validateNamingSystemTypeListObject((NamingSystemTypeList)value, diagnostics, context);
			case FhirPackage.NARRATIVE_STATUS_LIST_OBJECT:
				return validateNarrativeStatusListObject((NarrativeStatusList)value, diagnostics, context);
			case FhirPackage.NOTE_TYPE_LIST_OBJECT:
				return validateNoteTypeListObject((NoteTypeList)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_STATUS_LIST_OBJECT:
				return validateNutritionOrderStatusListObject((NutritionOrderStatusList)value, diagnostics, context);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE_LIST_OBJECT:
				return validateObservationRelationshipTypeListObject((ObservationRelationshipTypeList)value, diagnostics, context);
			case FhirPackage.OBSERVATION_RELIABILITY_LIST_OBJECT:
				return validateObservationReliabilityListObject((ObservationReliabilityList)value, diagnostics, context);
			case FhirPackage.OBSERVATION_STATUS_LIST_OBJECT:
				return validateObservationStatusListObject((ObservationStatusList)value, diagnostics, context);
			case FhirPackage.OID_PRIMITIVE:
				return validateOidPrimitive((String)value, diagnostics, context);
			case FhirPackage.OPERATION_KIND_LIST_OBJECT:
				return validateOperationKindListObject((OperationKindList)value, diagnostics, context);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST_OBJECT:
				return validateOperationParameterUseListObject((OperationParameterUseList)value, diagnostics, context);
			case FhirPackage.ORDER_STATUS_LIST_OBJECT:
				return validateOrderStatusListObject((OrderStatusList)value, diagnostics, context);
			case FhirPackage.PAGE_PURPOSE_LIST_OBJECT:
				return validatePagePurposeListObject((PagePurposeList)value, diagnostics, context);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST_OBJECT:
				return validateParticipantRequiredListObject((ParticipantRequiredList)value, diagnostics, context);
			case FhirPackage.PARTICIPANT_STATUS_LIST_OBJECT:
				return validateParticipantStatusListObject((ParticipantStatusList)value, diagnostics, context);
			case FhirPackage.PARTICIPATION_STATUS_LIST_OBJECT:
				return validateParticipationStatusListObject((ParticipationStatusList)value, diagnostics, context);
			case FhirPackage.POSITIVE_INT_PRIMITIVE:
				return validatePositiveIntPrimitive((BigInteger)value, diagnostics, context);
			case FhirPackage.PROCEDURE_RELATIONSHIP_TYPE_LIST_OBJECT:
				return validateProcedureRelationshipTypeListObject((ProcedureRelationshipTypeList)value, diagnostics, context);
			case FhirPackage.PROCEDURE_REQUEST_PRIORITY_LIST_OBJECT:
				return validateProcedureRequestPriorityListObject((ProcedureRequestPriorityList)value, diagnostics, context);
			case FhirPackage.PROCEDURE_REQUEST_STATUS_LIST_OBJECT:
				return validateProcedureRequestStatusListObject((ProcedureRequestStatusList)value, diagnostics, context);
			case FhirPackage.PROCEDURE_STATUS_LIST_OBJECT:
				return validateProcedureStatusListObject((ProcedureStatusList)value, diagnostics, context);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST_OBJECT:
				return validatePropertyRepresentationListObject((PropertyRepresentationList)value, diagnostics, context);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST_OBJECT:
				return validateProvenanceEntityRoleListObject((ProvenanceEntityRoleList)value, diagnostics, context);
			case FhirPackage.QUANTITY_COMPARATOR_LIST_OBJECT:
				return validateQuantityComparatorListObject((QuantityComparatorList)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ANSWERS_STATUS_LIST_OBJECT:
				return validateQuestionnaireAnswersStatusListObject((QuestionnaireAnswersStatusList)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_STATUS_LIST_OBJECT:
				return validateQuestionnaireStatusListObject((QuestionnaireStatusList)value, diagnostics, context);
			case FhirPackage.REFERRAL_STATUS_LIST_OBJECT:
				return validateReferralStatusListObject((ReferralStatusList)value, diagnostics, context);
			case FhirPackage.REMITTANCE_OUTCOME_LIST_OBJECT:
				return validateRemittanceOutcomeListObject((RemittanceOutcomeList)value, diagnostics, context);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST_OBJECT:
				return validateResourceVersionPolicyListObject((ResourceVersionPolicyList)value, diagnostics, context);
			case FhirPackage.RESPONSE_TYPE_LIST_OBJECT:
				return validateResponseTypeListObject((ResponseTypeList)value, diagnostics, context);
			case FhirPackage.RESTFUL_CONFORMANCE_MODE_LIST_OBJECT:
				return validateRestfulConformanceModeListObject((RestfulConformanceModeList)value, diagnostics, context);
			case FhirPackage.SAMPLED_DATA_DATA_TYPE_PRIMITIVE:
				return validateSampledDataDataTypePrimitive((String)value, diagnostics, context);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST_OBJECT:
				return validateSearchEntryModeListObject((SearchEntryModeList)value, diagnostics, context);
			case FhirPackage.SEARCH_MODIFIER_CODE_LIST_OBJECT:
				return validateSearchModifierCodeListObject((SearchModifierCodeList)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST_OBJECT:
				return validateSearchParamTypeListObject((SearchParamTypeList)value, diagnostics, context);
			case FhirPackage.SLICING_RULES_LIST_OBJECT:
				return validateSlicingRulesListObject((SlicingRulesList)value, diagnostics, context);
			case FhirPackage.SLOT_STATUS_LIST_OBJECT:
				return validateSlotStatusListObject((SlotStatusList)value, diagnostics, context);
			case FhirPackage.STRING_PRIMITIVE:
				return validateStringPrimitive((String)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_LIST_OBJECT:
				return validateStructureDefinitionKindListObject((StructureDefinitionKindList)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST_OBJECT:
				return validateSubscriptionChannelTypeListObject((SubscriptionChannelTypeList)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST_OBJECT:
				return validateSubscriptionStatusListObject((SubscriptionStatusList)value, diagnostics, context);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_LIST_OBJECT:
				return validateSupplyDeliveryStatusListObject((SupplyDeliveryStatusList)value, diagnostics, context);
			case FhirPackage.SUPPLY_DISPENSE_STATUS_LIST_OBJECT:
				return validateSupplyDispenseStatusListObject((SupplyDispenseStatusList)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST_STATUS_LIST_OBJECT:
				return validateSupplyRequestStatusListObject((SupplyRequestStatusList)value, diagnostics, context);
			case FhirPackage.SUPPLY_STATUS_LIST_OBJECT:
				return validateSupplyStatusListObject((SupplyStatusList)value, diagnostics, context);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST_OBJECT:
				return validateSystemRestfulInteractionListObject((SystemRestfulInteractionList)value, diagnostics, context);
			case FhirPackage.TIME_PRIMITIVE:
				return validateTimePrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.TRANSACTION_MODE_LIST_OBJECT:
				return validateTransactionModeListObject((TransactionModeList)value, diagnostics, context);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST_OBJECT:
				return validateTypeRestfulInteractionListObject((TypeRestfulInteractionList)value, diagnostics, context);
			case FhirPackage.UNITS_OF_TIME_LIST_OBJECT:
				return validateUnitsOfTimeListObject((UnitsOfTimeList)value, diagnostics, context);
			case FhirPackage.UNSIGNED_INT_PRIMITIVE:
				return validateUnsignedIntPrimitive((BigInteger)value, diagnostics, context);
			case FhirPackage.URI_PRIMITIVE:
				return validateUriPrimitive((String)value, diagnostics, context);
			case FhirPackage.USE_LIST_OBJECT:
				return validateUseListObject((UseList)value, diagnostics, context);
			case FhirPackage.UUID_PRIMITIVE:
				return validateUuidPrimitive((String)value, diagnostics, context);
			case FhirPackage.VISION_BASE_LIST_OBJECT:
				return validateVisionBaseListObject((VisionBaseList)value, diagnostics, context);
			case FhirPackage.VISION_EYES_LIST_OBJECT:
				return validateVisionEyesListObject((VisionEyesList)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccount(Account account, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(account, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountStatus(AccountStatus accountStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accountStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionList(ActionList actionList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress(Address address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(address, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressType(AddressType addressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressUse(AddressUse addressUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdministrativeGender(AdministrativeGender administrativeGender, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(administrativeGender, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAge(Age age, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(age, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeUnits(AgeUnits ageUnits, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ageUnits, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationMode(AggregationMode aggregationMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntolerance(AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntolerance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCategory(AllergyIntoleranceCategory allergyIntoleranceCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCertainty(AllergyIntoleranceCertainty allergyIntoleranceCertainty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceCertainty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCriticality(AllergyIntoleranceCriticality allergyIntoleranceCriticality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceCriticality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceEvent(AllergyIntoleranceEvent allergyIntoleranceEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceSeverity(AllergyIntoleranceSeverity allergyIntoleranceSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceSeverity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceStatus(AllergyIntoleranceStatus allergyIntoleranceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceType(AllergyIntoleranceType allergyIntoleranceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotation(Annotation annotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnswerFormat(AnswerFormat answerFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(answerFormat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointment(Appointment appointment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appointment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentParticipant(AppointmentParticipant appointmentParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appointmentParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentResponse(AppointmentResponse appointmentResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appointmentResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentStatus(AppointmentStatus appointmentStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appointmentStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionDirectionType(AssertionDirectionType assertionDirectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assertionDirectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionOperatorType(AssertionOperatorType assertionOperatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assertionOperatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionResponseTypes(AssertionResponseTypes assertionResponseTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assertionResponseTypes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttachment(Attachment attachment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attachment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEvent(AuditEvent auditEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventAction(AuditEventAction auditEventAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventDetail(AuditEventDetail auditEventDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventEvent(AuditEventEvent auditEventEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventNetwork(AuditEventNetwork auditEventNetwork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventNetwork, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventObject(AuditEventObject auditEventObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventObjectLifecycle(AuditEventObjectLifecycle auditEventObjectLifecycle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventObjectLifecycle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventObjectRole(AuditEventObjectRole auditEventObjectRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventObjectRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventObjectType(AuditEventObjectType auditEventObjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventObjectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventOutcome(AuditEventOutcome auditEventOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventOutcome, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventParticipant(AuditEventParticipant auditEventParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventParticipantNetworkType(AuditEventParticipantNetworkType auditEventParticipantNetworkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventParticipantNetworkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventSource(AuditEventSource auditEventSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackboneElement(BackboneElement backboneElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(backboneElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64Binary(Base64Binary base64Binary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(base64Binary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasic(Basic basic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinary(Binary binary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingStrength(BindingStrength bindingStrength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bindingStrength, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodySite(BodySite bodySite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bodySite, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(org.hl7.fhir.Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundle(Bundle bundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleEntry(BundleEntry bundleEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleLink(BundleLink bundleLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleRequest(BundleRequest bundleRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleResponse(BundleResponse bundleResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleSearch(BundleSearch bundleSearch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleSearch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleType(BundleType bundleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlan(CarePlan carePlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivity(CarePlanActivity carePlanActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivityCategory(CarePlanActivityCategory carePlanActivityCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanActivityCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivityStatus(CarePlanActivityStatus carePlanActivityStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanActivityStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanDetail(CarePlanDetail carePlanDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipant(CarePlanParticipant carePlanParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanStatus(CarePlanStatus carePlanStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaim(Claim claim, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claim, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimCoverage(ClaimCoverage claimCoverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimCoverage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimDetail(ClaimDetail claimDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimDiagnosis(ClaimDiagnosis claimDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimDiagnosis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimItem(ClaimItem claimItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimMissingTeeth(ClaimMissingTeeth claimMissingTeeth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimMissingTeeth, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimPayee(ClaimPayee claimPayee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimPayee, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimProsthesis(ClaimProsthesis claimProsthesis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimProsthesis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponse(ClaimResponse claimResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseAddItem(ClaimResponseAddItem claimResponseAddItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseAddItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseAdjudication(ClaimResponseAdjudication claimResponseAdjudication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseAdjudication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseAdjudication1(ClaimResponseAdjudication1 claimResponseAdjudication1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseAdjudication1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseAdjudication2(ClaimResponseAdjudication2 claimResponseAdjudication2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseAdjudication2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseAdjudication3(ClaimResponseAdjudication3 claimResponseAdjudication3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseAdjudication3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseAdjudication4(ClaimResponseAdjudication4 claimResponseAdjudication4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseAdjudication4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseCoverage(ClaimResponseCoverage claimResponseCoverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseCoverage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseDetail(ClaimResponseDetail claimResponseDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseDetail1(ClaimResponseDetail1 claimResponseDetail1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseDetail1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseError(ClaimResponseError claimResponseError, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseError, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseItem(ClaimResponseItem claimResponseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseNote(ClaimResponseNote claimResponseNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseNote, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseSubDetail(ClaimResponseSubDetail claimResponseSubDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseSubDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimSubDetail(ClaimSubDetail claimSubDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimSubDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimType(ClaimType claimType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpression(ClinicalImpression clinicalImpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalImpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionFinding(ClinicalImpressionFinding clinicalImpressionFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalImpressionFinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionInvestigations(ClinicalImpressionInvestigations clinicalImpressionInvestigations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalImpressionInvestigations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionRuledOut(ClinicalImpressionRuledOut clinicalImpressionRuledOut, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalImpressionRuledOut, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionStatus(ClinicalImpressionStatus clinicalImpressionStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalImpressionStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCode(Code code, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(code, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeableConcept(CodeableConcept codeableConcept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeableConcept, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoding(Coding coding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunication(Communication communication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationPayload(CommunicationPayload communicationPayload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationPayload, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationRequest(CommunicationRequest communicationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationRequestPayload(CommunicationRequestPayload communicationRequestPayload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationRequestPayload, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationRequestStatus(CommunicationRequestStatus communicationRequestStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationRequestStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationStatus(CommunicationStatus communicationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposition(Composition composition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(composition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionAttestationMode(CompositionAttestationMode compositionAttestationMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionAttestationMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionAttester(CompositionAttester compositionAttester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionAttester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionEvent(CompositionEvent compositionEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionSection(CompositionSection compositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionSection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionStatus(CompositionStatus compositionStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMap(ConceptMap conceptMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapContact(ConceptMapContact conceptMapContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapDependsOn(ConceptMapDependsOn conceptMapDependsOn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapDependsOn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapElement(ConceptMapElement conceptMapElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapEquivalence(ConceptMapEquivalence conceptMapEquivalence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapEquivalence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapTarget(ConceptMapTarget conceptMapTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalDeleteStatus(ConditionalDeleteStatus conditionalDeleteStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionalDeleteStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionClinicalStatus(ConditionClinicalStatus conditionClinicalStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionClinicalStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionDueTo(ConditionDueTo conditionDueTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionDueTo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEvidence(ConditionEvidence conditionEvidence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionEvidence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionLocation(ConditionLocation conditionLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionLocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionOccurredFollowing(ConditionOccurredFollowing conditionOccurredFollowing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionOccurredFollowing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionStage(ConditionStage conditionStage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionStage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformance(Conformance conformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceCertificate(ConformanceCertificate conformanceCertificate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceCertificate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceContact(ConformanceContact conformanceContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceDocument(ConformanceDocument conformanceDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceDocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceEvent(ConformanceEvent conformanceEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceEventMode(ConformanceEventMode conformanceEventMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceEventMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceImplementation(ConformanceImplementation conformanceImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceInteraction(ConformanceInteraction conformanceInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceInteraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceInteraction1(ConformanceInteraction1 conformanceInteraction1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceInteraction1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceMessaging(ConformanceMessaging conformanceMessaging, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceMessaging, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceOperation(ConformanceOperation conformanceOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceResource(ConformanceResource conformanceResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceResourceStatus(ConformanceResourceStatus conformanceResourceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceResourceStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceRest(ConformanceRest conformanceRest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceRest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceSearchParam(ConformanceSearchParam conformanceSearchParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceSearchParam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceSecurity(ConformanceSecurity conformanceSecurity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceSecurity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceSoftware(ConformanceSoftware conformanceSoftware, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceSoftware, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintSeverity(ConstraintSeverity constraintSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintSeverity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPoint(ContactPoint contactPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointSystem(ContactPointSystem contactPointSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactPointSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointUse(ContactPointUse contactPointUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactPointUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentType(ContentType contentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContract(Contract contract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contract, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractActor(ContractActor contractActor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractActor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractActor1(ContractActor1 contractActor1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractActor1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractFriendly(ContractFriendly contractFriendly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractFriendly, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractLegal(ContractLegal contractLegal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractLegal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractRule(ContractRule contractRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractSigner(ContractSigner contractSigner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractSigner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractTerm(ContractTerm contractTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractTerm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractValuedItem(ContractValuedItem contractValuedItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractValuedItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractValuedItem1(ContractValuedItem1 contractValuedItem1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractValuedItem1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContraindication(Contraindication contraindication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contraindication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContraindicationMitigation(ContraindicationMitigation contraindicationMitigation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contraindicationMitigation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContraindicationSeverity(ContraindicationSeverity contraindicationSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contraindicationSeverity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCount(Count count, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(count, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverage(Coverage coverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataElement(DataElement dataElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataElementContact(DataElementContact dataElementContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataElementContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataElementMapping(DataElementMapping dataElementMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataElementMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataElementSpecificity(DataElementSpecificity dataElementSpecificity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataElementSpecificity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(Date date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(date, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime(DateTime dateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaysOfWeek(DaysOfWeek daysOfWeek, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daysOfWeek, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimal(Decimal decimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decimal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice(Device device, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(device, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceComponent(DeviceComponent deviceComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceComponentProductionSpecification(DeviceComponentProductionSpecification deviceComponentProductionSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceComponentProductionSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetric(DeviceMetric deviceMetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetric, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibration(DeviceMetricCalibration deviceMetricCalibration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricCalibration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationState(DeviceMetricCalibrationState deviceMetricCalibrationState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricCalibrationState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationType(DeviceMetricCalibrationType deviceMetricCalibrationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricCalibrationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCategory(DeviceMetricCategory deviceMetricCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricColor(DeviceMetricColor deviceMetricColor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricColor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricOperationalStatus(DeviceMetricOperationalStatus deviceMetricOperationalStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricOperationalStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceStatus(DeviceStatus deviceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseRequest(DeviceUseRequest deviceUseRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceUseRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseRequestPriority(DeviceUseRequestPriority deviceUseRequestPriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceUseRequestPriority, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseRequestStatus(DeviceUseRequestStatus deviceUseRequestStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceUseRequestStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseStatement(DeviceUseStatement deviceUseStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceUseStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticOrder(DiagnosticOrder diagnosticOrder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticOrder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticOrderEvent(DiagnosticOrderEvent diagnosticOrderEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticOrderEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticOrderItem(DiagnosticOrderItem diagnosticOrderItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticOrderItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticOrderPriority(DiagnosticOrderPriority diagnosticOrderPriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticOrderPriority, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticOrderStatus(DiagnosticOrderStatus diagnosticOrderStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticOrderStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReport(DiagnosticReport diagnosticReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticReport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReportImage(DiagnosticReportImage diagnosticReportImage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticReportImage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReportStatus(DiagnosticReportStatus diagnosticReportStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticReportStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDigitalMediaType(DigitalMediaType digitalMediaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(digitalMediaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistance(Distance distance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentManifest(DocumentManifest documentManifest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentManifest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentManifestContent(DocumentManifestContent documentManifestContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentManifestContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentManifestRelated(DocumentManifestRelated documentManifestRelated, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentManifestRelated, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentMode(DocumentMode documentMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReference(DocumentReference documentReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceContext(DocumentReferenceContext documentReferenceContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferenceContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceRelated(DocumentReferenceRelated documentReferenceRelated, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferenceRelated, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceRelatesTo(DocumentReferenceRelatesTo documentReferenceRelatesTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferenceRelatesTo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceStatus(DocumentReferenceStatus documentReferenceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferenceStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRelationshipType(DocumentRelationshipType documentRelationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRelationshipType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainResource(DomainResource domainResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDuration(Duration duration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(duration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinition(ElementDefinition elementDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionBinding(ElementDefinitionBinding elementDefinitionBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionConstraint(ElementDefinitionConstraint elementDefinitionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionMapping(ElementDefinitionMapping elementDefinitionMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionSlicing(ElementDefinitionSlicing elementDefinitionSlicing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionSlicing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionType(ElementDefinitionType elementDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityRequest(EligibilityRequest eligibilityRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eligibilityRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityResponse(EligibilityResponse eligibilityResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eligibilityResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounter(Encounter encounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterClass(EncounterClass encounterClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterHospitalization(EncounterHospitalization encounterHospitalization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterHospitalization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocation(EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterLocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationStatus(EncounterLocationStatus encounterLocationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterLocationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterParticipant(EncounterParticipant encounterParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterState(EncounterState encounterState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterStatusHistory(EncounterStatusHistory encounterStatusHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterStatusHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnrollmentRequest(EnrollmentRequest enrollmentRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enrollmentRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnrollmentResponse(EnrollmentResponse enrollmentResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enrollmentResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCare(EpisodeOfCare episodeOfCare, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(episodeOfCare, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCareCareTeam(EpisodeOfCareCareTeam episodeOfCareCareTeam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(episodeOfCareCareTeam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCareStatus(EpisodeOfCareStatus episodeOfCareStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(episodeOfCareStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCareStatusHistory(EpisodeOfCareStatusHistory episodeOfCareStatusHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(episodeOfCareStatusHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTiming(EventTiming eventTiming, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventTiming, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefit(ExplanationOfBenefit explanationOfBenefit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionContext(ExtensionContext extensionContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extensionContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyMemberHistory(FamilyMemberHistory familyMemberHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(familyMemberHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyMemberHistoryCondition(FamilyMemberHistoryCondition familyMemberHistoryCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(familyMemberHistoryCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterOperator(FilterOperator filterOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlag(Flag flag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlagStatus(FlagStatus flagStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flagStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoal(Goal goal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalOutcome(GoalOutcome goalOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goalOutcome, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalStatus(GoalStatus goalStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goalStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroup(Group group, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(group, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupCharacteristic(GroupCharacteristic groupCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupCharacteristic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupType(GroupType groupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareService(HealthcareService healthcareService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(healthcareService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareServiceAvailableTime(HealthcareServiceAvailableTime healthcareServiceAvailableTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(healthcareServiceAvailableTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareServiceNotAvailable(HealthcareServiceNotAvailable healthcareServiceNotAvailable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(healthcareServiceNotAvailable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareServiceServiceType(HealthcareServiceServiceType healthcareServiceServiceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(healthcareServiceServiceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPVerb(HTTPVerb httpVerb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(httpVerb, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHumanName(HumanName humanName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(humanName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateId(Id id, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(id, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifier(Identifier identifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierUse(IdentifierUse identifierUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifierUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityAssuranceLevel(IdentityAssuranceLevel identityAssuranceLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identityAssuranceLevel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingObjectSelection(ImagingObjectSelection imagingObjectSelection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingObjectSelection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingObjectSelectionFrames(ImagingObjectSelectionFrames imagingObjectSelectionFrames, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingObjectSelectionFrames, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingObjectSelectionInstance(ImagingObjectSelectionInstance imagingObjectSelectionInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingObjectSelectionInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingObjectSelectionSeries(ImagingObjectSelectionSeries imagingObjectSelectionSeries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingObjectSelectionSeries, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingObjectSelectionStudy(ImagingObjectSelectionStudy imagingObjectSelectionStudy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingObjectSelectionStudy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingStudy(ImagingStudy imagingStudy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingStudy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingStudyInstance(ImagingStudyInstance imagingStudyInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingStudyInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingStudySeries(ImagingStudySeries imagingStudySeries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingStudySeries, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization(Immunization immunization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationExplanation(ImmunizationExplanation immunizationExplanation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationExplanation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationReaction(ImmunizationReaction immunizationReaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationReaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRecommendation(ImmunizationRecommendation immunizationRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationRecommendation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRecommendationDateCriterion(ImmunizationRecommendationDateCriterion immunizationRecommendationDateCriterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationRecommendationDateCriterion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRecommendationProtocol(ImmunizationRecommendationProtocol immunizationRecommendationProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationRecommendationProtocol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRecommendationRecommendation(ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationRecommendationRecommendation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationVaccinationProtocol(ImmunizationVaccinationProtocol immunizationVaccinationProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationVaccinationProtocol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuide(ImplementationGuide implementationGuide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuide, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideContact(ImplementationGuideContact implementationGuideContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideDefault(ImplementationGuideDefault implementationGuideDefault, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideDefault, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideExample(ImplementationGuideExample implementationGuideExample, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideExample, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideItem(ImplementationGuideItem implementationGuideItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuidePackage(ImplementationGuidePackage implementationGuidePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuidePackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuidePage(ImplementationGuidePage implementationGuidePage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuidePage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceAvailability(InstanceAvailability instanceAvailability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instanceAvailability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstant(Instant instant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(org.hl7.fhir.Integer integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueSeverity(IssueSeverity issueSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(issueSeverity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkType(LinkType linkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList(List list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(list, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListEntry(ListEntry listEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListMode(ListMode listMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStatus(ListStatus listStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(location, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationMode(LocationMode locationMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationPosition(LocationPosition locationPosition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationPosition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationStatus(LocationStatus locationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasmntPrinciple(MeasmntPrinciple measmntPrinciple, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measmntPrinciple, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedia(Media media, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(media, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministration(MedicationAdministration medicationAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationAdministration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministrationDosage(MedicationAdministrationDosage medicationAdministrationDosage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationAdministrationDosage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministrationStatus(MedicationAdministrationStatus medicationAdministrationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationAdministrationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationBatch(MedicationBatch medicationBatch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationBatch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationContent(MedicationContent medicationContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispense(MedicationDispense medicationDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationDispense, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseDosageInstruction(MedicationDispenseDosageInstruction medicationDispenseDosageInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationDispenseDosageInstruction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseStatus(MedicationDispenseStatus medicationDispenseStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationDispenseStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseSubstitution(MedicationDispenseSubstitution medicationDispenseSubstitution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationDispenseSubstitution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationIngredient(MedicationIngredient medicationIngredient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationIngredient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKind(MedicationKind medicationKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationPackage(MedicationPackage medicationPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationPackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationPrescription(MedicationPrescription medicationPrescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationPrescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationPrescriptionDispense(MedicationPrescriptionDispense medicationPrescriptionDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationPrescriptionDispense, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationPrescriptionDosageInstruction(MedicationPrescriptionDosageInstruction medicationPrescriptionDosageInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationPrescriptionDosageInstruction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationPrescriptionStatus(MedicationPrescriptionStatus medicationPrescriptionStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationPrescriptionStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationPrescriptionSubstitution(MedicationPrescriptionSubstitution medicationPrescriptionSubstitution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationPrescriptionSubstitution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationProduct(MedicationProduct medicationProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationProduct, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatement(MedicationStatement medicationStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatementDosage(MedicationStatementDosage medicationStatementDosage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationStatementDosage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatementStatus(MedicationStatementStatus medicationStatementStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationStatementStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageHeader(MessageHeader messageHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageHeader, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageHeaderDestination(MessageHeaderDestination messageHeaderDestination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageHeaderDestination, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageHeaderResponse(MessageHeaderResponse messageHeaderResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageHeaderResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageHeaderSource(MessageHeaderSource messageHeaderSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageHeaderSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageSignificanceCategory(MessageSignificanceCategory messageSignificanceCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageSignificanceCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeta(Meta meta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meta, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMoney(Money money, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(money, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameUse(NameUse nameUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystem(NamingSystem namingSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemContact(NamingSystemContact namingSystemContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingSystemContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemIdentifierType(NamingSystemIdentifierType namingSystemIdentifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingSystemIdentifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemType(NamingSystemType namingSystemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemUniqueId(NamingSystemUniqueId namingSystemUniqueId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingSystemUniqueId, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrative(Narrative narrative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(narrative, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrativeStatus(NarrativeStatus narrativeStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(narrativeStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteType(NoteType noteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrder(NutritionOrder nutritionOrder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderAdministration(NutritionOrderAdministration nutritionOrderAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderAdministration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderEnteralFormula(NutritionOrderEnteralFormula nutritionOrderEnteralFormula, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderEnteralFormula, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderNutrient(NutritionOrderNutrient nutritionOrderNutrient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderNutrient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderOralDiet(NutritionOrderOralDiet nutritionOrderOralDiet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderOralDiet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderStatus(NutritionOrderStatus nutritionOrderStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderSupplement(NutritionOrderSupplement nutritionOrderSupplement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderSupplement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderTexture(NutritionOrderTexture nutritionOrderTexture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderTexture, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservation(Observation observation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationComponent(ObservationComponent observationComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationReferenceRange(ObservationReferenceRange observationReferenceRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationReferenceRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRelated(ObservationRelated observationRelated, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationRelated, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRelationshipType(ObservationRelationshipType observationRelationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationRelationshipType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationReliability(ObservationReliability observationReliability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationReliability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationStatus(ObservationStatus observationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOid(Oid oid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDefinition(OperationDefinition operationDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDefinitionBinding(OperationDefinitionBinding operationDefinitionBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDefinitionBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDefinitionContact(OperationDefinitionContact operationDefinitionContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDefinitionContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDefinitionParameter(OperationDefinitionParameter operationDefinitionParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDefinitionParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationKind(OperationKind operationKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationOutcome(OperationOutcome operationOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationOutcome, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationOutcomeIssue(OperationOutcomeIssue operationOutcomeIssue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationOutcomeIssue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationParameterUse(OperationParameterUse operationParameterUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationParameterUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(order, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderResponse(OrderResponse orderResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderStatus(OrderStatus orderStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderWhen(OrderWhen orderWhen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderWhen, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganization(Organization organization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationContact(OrganizationContact organizationContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagePurpose(PagePurpose pagePurpose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pagePurpose, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameters(Parameters parameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameters, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParametersParameter(ParametersParameter parametersParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parametersParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantRequired(ParticipantRequired participantRequired, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participantRequired, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantStatus(ParticipantStatus participantStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participantStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipationStatus(ParticipationStatus participationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatient(Patient patient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAnimal(PatientAnimal patientAnimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientAnimal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCommunication(PatientCommunication patientCommunication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientCommunication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContact(PatientContact patientContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientLink(PatientLink patientLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentNotice(PaymentNotice paymentNotice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentNotice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentReconciliation(PaymentReconciliation paymentReconciliation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentReconciliation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentReconciliationDetail(PaymentReconciliationDetail paymentReconciliationDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentReconciliationDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentReconciliationNote(PaymentReconciliationNote paymentReconciliationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentReconciliationNote, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriod(Period period, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(period, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonLink(PersonLink personLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveInt(PositiveInt positiveInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positiveInt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitioner(Practitioner practitioner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitioner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitionerPractitionerRole(PractitionerPractitionerRole practitionerPractitionerRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitionerPractitionerRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitionerQualification(PractitionerQualification practitionerQualification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitionerQualification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureBodySite(ProcedureBodySite procedureBodySite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureBodySite, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureDevice(ProcedureDevice procedureDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePerformer(ProcedurePerformer procedurePerformer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedurePerformer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRelatedItem(ProcedureRelatedItem procedureRelatedItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureRelatedItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRelationshipType(ProcedureRelationshipType procedureRelationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureRelationshipType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRequest(ProcedureRequest procedureRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRequestBodySite(ProcedureRequestBodySite procedureRequestBodySite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureRequestBodySite, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRequestPriority(ProcedureRequestPriority procedureRequestPriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureRequestPriority, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRequestStatus(ProcedureRequestStatus procedureRequestStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureRequestStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureStatus(ProcedureStatus procedureStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessRequest(ProcessRequest processRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessRequestItem(ProcessRequestItem processRequestItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processRequestItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessResponse(ProcessResponse processResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessResponseNotes(ProcessResponseNotes processResponseNotes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processResponseNotes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyRepresentation(PropertyRepresentation propertyRepresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyRepresentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenance(Provenance provenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provenance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceAgent(ProvenanceAgent provenanceAgent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provenanceAgent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceEntity(ProvenanceEntity provenanceEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provenanceEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceEntityRole(ProvenanceEntityRole provenanceEntityRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provenanceEntityRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantity(Quantity quantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityComparator(QuantityComparator quantityComparator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityComparator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaire(Questionnaire questionnaire, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaire, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireAnswers(QuestionnaireAnswers questionnaireAnswers, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireAnswers, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireAnswersAnswer(QuestionnaireAnswersAnswer questionnaireAnswersAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireAnswersAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireAnswersGroup(QuestionnaireAnswersGroup questionnaireAnswersGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireAnswersGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireAnswersQuestion(QuestionnaireAnswersQuestion questionnaireAnswersQuestion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireAnswersQuestion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireAnswersStatus(QuestionnaireAnswersStatus questionnaireAnswersStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireAnswersStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireGroup(QuestionnaireGroup questionnaireGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireQuestion(QuestionnaireQuestion questionnaireQuestion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireQuestion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireStatus(QuestionnaireStatus questionnaireStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRange(Range range, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(range, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRatio(Ratio ratio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ratio, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralRequest(ReferralRequest referralRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referralRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralStatus(ReferralStatus referralStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referralStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedPerson(RelatedPerson relatedPerson, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedPerson, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemittanceOutcome(RemittanceOutcome remittanceOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remittanceOutcome, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceContainer(ResourceContainer resourceContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceVersionPolicy(ResourceVersionPolicy resourceVersionPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceVersionPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseType(ResponseType responseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestfulConformanceMode(RestfulConformanceMode restfulConformanceMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restfulConformanceMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskAssessment(RiskAssessment riskAssessment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(riskAssessment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskAssessmentPrediction(RiskAssessmentPrediction riskAssessmentPrediction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(riskAssessmentPrediction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledData(SampledData sampledData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sampledData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledDataDataType(SampledDataDataType sampledDataDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sampledDataDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedule(Schedule schedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schedule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchEntryMode(SearchEntryMode searchEntryMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchEntryMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchModifierCode(SearchModifierCode searchModifierCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchModifierCode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParameter(SearchParameter searchParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParameterContact(SearchParameterContact searchParameterContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchParameterContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParamType(SearchParamType searchParamType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchParamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignature(Signature signature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlicingRules(SlicingRules slicingRules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slicingRules, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlot(Slot slot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlotStatus(SlotStatus slotStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slotStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimen(Specimen specimen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimen, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenCollection(SpecimenCollection specimenCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenCollection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenContainer(SpecimenContainer specimenContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenTreatment(SpecimenTreatment specimenTreatment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenTreatment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(org.hl7.fhir.String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinition(StructureDefinition structureDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionContact(StructureDefinitionContact structureDefinitionContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionDifferential(StructureDefinitionDifferential structureDefinitionDifferential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionDifferential, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionKind(StructureDefinitionKind structureDefinitionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionMapping(StructureDefinitionMapping structureDefinitionMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionSnapshot(StructureDefinitionSnapshot structureDefinitionSnapshot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionSnapshot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscription(Subscription subscription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionChannel(SubscriptionChannel subscriptionChannel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionChannel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionChannelType(SubscriptionChannelType subscriptionChannelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionChannelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionStatus(SubscriptionStatus subscriptionStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstance(Substance substance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceIngredient(SubstanceIngredient substanceIngredient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceIngredient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceInstance(SubstanceInstance substanceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupply(Supply supply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supply, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDelivery(SupplyDelivery supplyDelivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyDelivery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDeliveryStatus(SupplyDeliveryStatus supplyDeliveryStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyDeliveryStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDispense(SupplyDispense supplyDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyDispense, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDispenseStatus(SupplyDispenseStatus supplyDispenseStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyDispenseStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequest(SupplyRequest supplyRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequestStatus(SupplyRequestStatus supplyRequestStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyRequestStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequestWhen(SupplyRequestWhen supplyRequestWhen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyRequestWhen, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyStatus(SupplyStatus supplyStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemRestfulInteraction(SystemRestfulInteraction systemRestfulInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemRestfulInteraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScript(TestScript testScript, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScript, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptAction(TestScriptAction testScriptAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptAction1(TestScriptAction1 testScriptAction1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptAction1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptAction2(TestScriptAction2 testScriptAction2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptAction2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptAssert(TestScriptAssert testScriptAssert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptAssert, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptCapabilities(TestScriptCapabilities testScriptCapabilities, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptCapabilities, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptFixture(TestScriptFixture testScriptFixture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptFixture, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptLink(TestScriptLink testScriptLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptMetadata(TestScriptMetadata testScriptMetadata, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptMetadata, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptOperation(TestScriptOperation testScriptOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRequestHeader(TestScriptRequestHeader testScriptRequestHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptRequestHeader, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptSetup(TestScriptSetup testScriptSetup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptSetup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptTeardown(TestScriptTeardown testScriptTeardown, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptTeardown, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptTest(TestScriptTest testScriptTest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptTest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptVariable(TestScriptVariable testScriptVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(Time time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(time, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTiming(Timing timing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimingRepeat(TimingRepeat timingRepeat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timingRepeat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionMode(TransactionMode transactionMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transactionMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestfulInteraction(TypeRestfulInteraction typeRestfulInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeRestfulInteraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsOfTime(UnitsOfTime unitsOfTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitsOfTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedInt(UnsignedInt unsignedInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unsignedInt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUri(Uri uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uri, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUse(Use use, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(use, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuid(Uuid uuid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uuid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSet(ValueSet valueSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetCodeSystem(ValueSetCodeSystem valueSetCodeSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetCodeSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetCompose(ValueSetCompose valueSetCompose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetCompose, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetConcept(ValueSetConcept valueSetConcept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetConcept, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetConcept1(ValueSetConcept1 valueSetConcept1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetConcept1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetContact(ValueSetContact valueSetContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetContains(ValueSetContains valueSetContains, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetContains, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetDesignation(ValueSetDesignation valueSetDesignation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetDesignation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetExpansion(ValueSetExpansion valueSetExpansion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetExpansion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetFilter(ValueSetFilter valueSetFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetInclude(ValueSetInclude valueSetInclude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetInclude, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetParameter(ValueSetParameter valueSetParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionBase(VisionBase visionBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visionBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionEyes(VisionEyes visionEyes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visionEyes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionPrescription(VisionPrescription visionPrescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visionPrescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionPrescriptionDispense(VisionPrescriptionDispense visionPrescriptionDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visionPrescriptionDispense, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountStatusList(AccountStatusList accountStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionListList(ActionListList actionListList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressTypeList(AddressTypeList addressTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressUseList(AddressUseList addressUseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdministrativeGenderList(AdministrativeGenderList administrativeGenderList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeUnitsList(AgeUnitsList ageUnitsList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationModeList(AggregationModeList aggregationModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCategoryList(AllergyIntoleranceCategoryList allergyIntoleranceCategoryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCertaintyList(AllergyIntoleranceCertaintyList allergyIntoleranceCertaintyList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCriticalityList(AllergyIntoleranceCriticalityList allergyIntoleranceCriticalityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceSeverityList(AllergyIntoleranceSeverityList allergyIntoleranceSeverityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceStatusList(AllergyIntoleranceStatusList allergyIntoleranceStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceTypeList(AllergyIntoleranceTypeList allergyIntoleranceTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnswerFormatList(AnswerFormatList answerFormatList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentStatusList(AppointmentStatusList appointmentStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionDirectionTypeList(AssertionDirectionTypeList assertionDirectionTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionOperatorTypeList(AssertionOperatorTypeList assertionOperatorTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionResponseTypesList(AssertionResponseTypesList assertionResponseTypesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventActionList(AuditEventActionList auditEventActionList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventObjectLifecycleList(AuditEventObjectLifecycleList auditEventObjectLifecycleList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventObjectRoleList(AuditEventObjectRoleList auditEventObjectRoleList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventObjectTypeList(AuditEventObjectTypeList auditEventObjectTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventOutcomeList(AuditEventOutcomeList auditEventOutcomeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventParticipantNetworkTypeList(AuditEventParticipantNetworkTypeList auditEventParticipantNetworkTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingStrengthList(BindingStrengthList bindingStrengthList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleTypeList(BundleTypeList bundleTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivityCategoryList(CarePlanActivityCategoryList carePlanActivityCategoryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivityStatusList(CarePlanActivityStatusList carePlanActivityStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanStatusList(CarePlanStatusList carePlanStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimTypeList(ClaimTypeList claimTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionStatusList(ClinicalImpressionStatusList clinicalImpressionStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationRequestStatusList(CommunicationRequestStatusList communicationRequestStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationStatusList(CommunicationStatusList communicationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionAttestationModeList(CompositionAttestationModeList compositionAttestationModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionStatusList(CompositionStatusList compositionStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapEquivalenceList(ConceptMapEquivalenceList conceptMapEquivalenceList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalDeleteStatusList(ConditionalDeleteStatusList conditionalDeleteStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionClinicalStatusList(ConditionClinicalStatusList conditionClinicalStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceEventModeList(ConformanceEventModeList conformanceEventModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceResourceStatusList(ConformanceResourceStatusList conformanceResourceStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintSeverityList(ConstraintSeverityList constraintSeverityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointSystemList(ContactPointSystemList contactPointSystemList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointUseList(ContactPointUseList contactPointUseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentTypeList(ContentTypeList contentTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContraindicationSeverityList(ContraindicationSeverityList contraindicationSeverityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataElementSpecificityList(DataElementSpecificityList dataElementSpecificityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaysOfWeekList(DaysOfWeekList daysOfWeekList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationStateList(DeviceMetricCalibrationStateList deviceMetricCalibrationStateList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationTypeList(DeviceMetricCalibrationTypeList deviceMetricCalibrationTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCategoryList(DeviceMetricCategoryList deviceMetricCategoryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricColorList(DeviceMetricColorList deviceMetricColorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricOperationalStatusList(DeviceMetricOperationalStatusList deviceMetricOperationalStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceStatusList(DeviceStatusList deviceStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseRequestPriorityList(DeviceUseRequestPriorityList deviceUseRequestPriorityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseRequestStatusList(DeviceUseRequestStatusList deviceUseRequestStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticOrderPriorityList(DiagnosticOrderPriorityList diagnosticOrderPriorityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticOrderStatusList(DiagnosticOrderStatusList diagnosticOrderStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReportStatusList(DiagnosticReportStatusList diagnosticReportStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDigitalMediaTypeList(DigitalMediaTypeList digitalMediaTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentModeList(DocumentModeList documentModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceStatusList(DocumentReferenceStatusList documentReferenceStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRelationshipTypeList(DocumentRelationshipTypeList documentRelationshipTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterClassList(EncounterClassList encounterClassList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationStatusList(EncounterLocationStatusList encounterLocationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterStateList(EncounterStateList encounterStateList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCareStatusList(EpisodeOfCareStatusList episodeOfCareStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTimingList(EventTimingList eventTimingList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionContextList(ExtensionContextList extensionContextList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterOperatorList(FilterOperatorList filterOperatorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlagStatusList(FlagStatusList flagStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalStatusList(GoalStatusList goalStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupTypeList(GroupTypeList groupTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPVerbList(HTTPVerbList httpVerbList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierUseList(IdentifierUseList identifierUseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityAssuranceLevelList(IdentityAssuranceLevelList identityAssuranceLevelList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceAvailabilityList(InstanceAvailabilityList instanceAvailabilityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueSeverityList(IssueSeverityList issueSeverityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkTypeList(LinkTypeList linkTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListModeList(ListModeList listModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStatusList(ListStatusList listStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationModeList(LocationModeList locationModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationStatusList(LocationStatusList locationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasmntPrincipleList(MeasmntPrincipleList measmntPrincipleList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministrationStatusList(MedicationAdministrationStatusList medicationAdministrationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseStatusList(MedicationDispenseStatusList medicationDispenseStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKindList(MedicationKindList medicationKindList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationPrescriptionStatusList(MedicationPrescriptionStatusList medicationPrescriptionStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatementStatusList(MedicationStatementStatusList medicationStatementStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageSignificanceCategoryList(MessageSignificanceCategoryList messageSignificanceCategoryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameUseList(NameUseList nameUseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemIdentifierTypeList(NamingSystemIdentifierTypeList namingSystemIdentifierTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemTypeList(NamingSystemTypeList namingSystemTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrativeStatusList(NarrativeStatusList narrativeStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteTypeList(NoteTypeList noteTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderStatusList(NutritionOrderStatusList nutritionOrderStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRelationshipTypeList(ObservationRelationshipTypeList observationRelationshipTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationReliabilityList(ObservationReliabilityList observationReliabilityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationStatusList(ObservationStatusList observationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationKindList(OperationKindList operationKindList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationParameterUseList(OperationParameterUseList operationParameterUseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderStatusList(OrderStatusList orderStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagePurposeList(PagePurposeList pagePurposeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantRequiredList(ParticipantRequiredList participantRequiredList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantStatusList(ParticipantStatusList participantStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipationStatusList(ParticipationStatusList participationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRelationshipTypeList(ProcedureRelationshipTypeList procedureRelationshipTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRequestPriorityList(ProcedureRequestPriorityList procedureRequestPriorityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRequestStatusList(ProcedureRequestStatusList procedureRequestStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureStatusList(ProcedureStatusList procedureStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyRepresentationList(PropertyRepresentationList propertyRepresentationList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceEntityRoleList(ProvenanceEntityRoleList provenanceEntityRoleList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityComparatorList(QuantityComparatorList quantityComparatorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireAnswersStatusList(QuestionnaireAnswersStatusList questionnaireAnswersStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireStatusList(QuestionnaireStatusList questionnaireStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralStatusList(ReferralStatusList referralStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemittanceOutcomeList(RemittanceOutcomeList remittanceOutcomeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceVersionPolicyList(ResourceVersionPolicyList resourceVersionPolicyList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseTypeList(ResponseTypeList responseTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestfulConformanceModeList(RestfulConformanceModeList restfulConformanceModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchEntryModeList(SearchEntryModeList searchEntryModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchModifierCodeList(SearchModifierCodeList searchModifierCodeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParamTypeList(SearchParamTypeList searchParamTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlicingRulesList(SlicingRulesList slicingRulesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlotStatusList(SlotStatusList slotStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionKindList(StructureDefinitionKindList structureDefinitionKindList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionChannelTypeList(SubscriptionChannelTypeList subscriptionChannelTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionStatusList(SubscriptionStatusList subscriptionStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDeliveryStatusList(SupplyDeliveryStatusList supplyDeliveryStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDispenseStatusList(SupplyDispenseStatusList supplyDispenseStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequestStatusList(SupplyRequestStatusList supplyRequestStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyStatusList(SupplyStatusList supplyStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemRestfulInteractionList(SystemRestfulInteractionList systemRestfulInteractionList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionModeList(TransactionModeList transactionModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestfulInteractionList(TypeRestfulInteractionList typeRestfulInteractionList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsOfTimeList(UnitsOfTimeList unitsOfTimeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseList(UseList useList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionBaseList(VisionBaseList visionBaseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionEyesList(VisionEyesList visionEyesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountStatusListObject(AccountStatusList accountStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionListListObject(ActionListList actionListListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressTypeListObject(AddressTypeList addressTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressUseListObject(AddressUseList addressUseListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdministrativeGenderListObject(AdministrativeGenderList administrativeGenderListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeUnitsListObject(AgeUnitsList ageUnitsListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationModeListObject(AggregationModeList aggregationModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCategoryListObject(AllergyIntoleranceCategoryList allergyIntoleranceCategoryListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCertaintyListObject(AllergyIntoleranceCertaintyList allergyIntoleranceCertaintyListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCriticalityListObject(AllergyIntoleranceCriticalityList allergyIntoleranceCriticalityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceSeverityListObject(AllergyIntoleranceSeverityList allergyIntoleranceSeverityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceStatusListObject(AllergyIntoleranceStatusList allergyIntoleranceStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceTypeListObject(AllergyIntoleranceTypeList allergyIntoleranceTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnswerFormatListObject(AnswerFormatList answerFormatListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentStatusListObject(AppointmentStatusList appointmentStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionDirectionTypeListObject(AssertionDirectionTypeList assertionDirectionTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionOperatorTypeListObject(AssertionOperatorTypeList assertionOperatorTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionResponseTypesListObject(AssertionResponseTypesList assertionResponseTypesListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventActionListObject(AuditEventActionList auditEventActionListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventObjectLifecycleListObject(AuditEventObjectLifecycleList auditEventObjectLifecycleListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventObjectRoleListObject(AuditEventObjectRoleList auditEventObjectRoleListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventObjectTypeListObject(AuditEventObjectTypeList auditEventObjectTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventOutcomeListObject(AuditEventOutcomeList auditEventOutcomeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventParticipantNetworkTypeListObject(AuditEventParticipantNetworkTypeList auditEventParticipantNetworkTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64BinaryPrimitive(byte[] base64BinaryPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingStrengthListObject(BindingStrengthList bindingStrengthListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanPrimitive(boolean booleanPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanPrimitiveObject(Boolean booleanPrimitiveObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleTypeListObject(BundleTypeList bundleTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivityCategoryListObject(CarePlanActivityCategoryList carePlanActivityCategoryListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivityStatusListObject(CarePlanActivityStatusList carePlanActivityStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanStatusListObject(CarePlanStatusList carePlanStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimTypeListObject(ClaimTypeList claimTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionStatusListObject(ClinicalImpressionStatusList clinicalImpressionStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodePrimitive(String codePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCodePrimitive_Pattern(codePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodePrimitive_MinLength(codePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCodePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] CODE_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\s]+([\\s][^\\s]+)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Code Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodePrimitive_Pattern(String codePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getCodePrimitive(), codePrimitive, CODE_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Code Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodePrimitive_MinLength(String codePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = codePrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getCodePrimitive(), codePrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationRequestStatusListObject(CommunicationRequestStatusList communicationRequestStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationStatusListObject(CommunicationStatusList communicationStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionAttestationModeListObject(CompositionAttestationModeList compositionAttestationModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionStatusListObject(CompositionStatusList compositionStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapEquivalenceListObject(ConceptMapEquivalenceList conceptMapEquivalenceListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalDeleteStatusListObject(ConditionalDeleteStatusList conditionalDeleteStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionClinicalStatusListObject(ConditionClinicalStatusList conditionClinicalStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceEventModeListObject(ConformanceEventModeList conformanceEventModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceResourceStatusListObject(ConformanceResourceStatusList conformanceResourceStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintSeverityListObject(ConstraintSeverityList constraintSeverityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointSystemListObject(ContactPointSystemList contactPointSystemListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointUseListObject(ContactPointUseList contactPointUseListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentTypeListObject(ContentTypeList contentTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContraindicationSeverityListObject(ContraindicationSeverityList contraindicationSeverityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataElementSpecificityListObject(DataElementSpecificityList dataElementSpecificityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitive(XMLGregorianCalendar datePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDatePrimitiveBase_MemberTypes(datePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateDatePrimitive_Pattern(datePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDatePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] DATE_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Date Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitive_Pattern(XMLGregorianCalendar datePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getDatePrimitive(), datePrimitive, DATE_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitiveBase(XMLGregorianCalendar datePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDatePrimitiveBase_MemberTypes(datePrimitiveBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date Primitive Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitiveBase_MemberTypes(XMLGregorianCalendar datePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.GYEAR.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(datePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(datePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(datePrimitiveBase, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.GYEAR.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(datePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(datePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(datePrimitiveBase, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitive(XMLGregorianCalendar dateTimePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimePrimitiveBase_MemberTypes(dateTimePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTimePrimitive_Pattern(dateTimePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDateTimePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] DATE_TIME_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00))?)?)?)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Date Time Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitive_Pattern(XMLGregorianCalendar dateTimePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getDateTimePrimitive(), dateTimePrimitive, DATE_TIME_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitiveBase(XMLGregorianCalendar dateTimePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimePrimitiveBase_MemberTypes(dateTimePrimitiveBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date Time Primitive Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitiveBase_MemberTypes(XMLGregorianCalendar dateTimePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.GYEAR.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDateTime(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.GYEAR.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(dateTimePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(dateTimePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(dateTimePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDateTime(dateTimePrimitiveBase, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaysOfWeekListObject(DaysOfWeekList daysOfWeekListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalPrimitive(BigDecimal decimalPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDecimalPrimitive_Pattern(decimalPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDecimalPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] DECIMAL_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Decimal Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalPrimitive_Pattern(BigDecimal decimalPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getDecimalPrimitive(), decimalPrimitive, DECIMAL_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationStateListObject(DeviceMetricCalibrationStateList deviceMetricCalibrationStateListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationTypeListObject(DeviceMetricCalibrationTypeList deviceMetricCalibrationTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCategoryListObject(DeviceMetricCategoryList deviceMetricCategoryListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricColorListObject(DeviceMetricColorList deviceMetricColorListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricOperationalStatusListObject(DeviceMetricOperationalStatusList deviceMetricOperationalStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceStatusListObject(DeviceStatusList deviceStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseRequestPriorityListObject(DeviceUseRequestPriorityList deviceUseRequestPriorityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseRequestStatusListObject(DeviceUseRequestStatusList deviceUseRequestStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticOrderPriorityListObject(DiagnosticOrderPriorityList diagnosticOrderPriorityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticOrderStatusListObject(DiagnosticOrderStatusList diagnosticOrderStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReportStatusListObject(DiagnosticReportStatusList diagnosticReportStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDigitalMediaTypeListObject(DigitalMediaTypeList digitalMediaTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentModeListObject(DocumentModeList documentModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceStatusListObject(DocumentReferenceStatusList documentReferenceStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRelationshipTypeListObject(DocumentRelationshipTypeList documentRelationshipTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterClassListObject(EncounterClassList encounterClassListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationStatusListObject(EncounterLocationStatusList encounterLocationStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterStateListObject(EncounterStateList encounterStateListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCareStatusListObject(EpisodeOfCareStatusList episodeOfCareStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTimingListObject(EventTimingList eventTimingListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionContextListObject(ExtensionContextList extensionContextListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterOperatorListObject(FilterOperatorList filterOperatorListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlagStatusListObject(FlagStatusList flagStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalStatusListObject(GoalStatusList goalStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupTypeListObject(GroupTypeList groupTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPVerbListObject(HTTPVerbList httpVerbListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierUseListObject(IdentifierUseList identifierUseListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityAssuranceLevelListObject(IdentityAssuranceLevelList identityAssuranceLevelListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdPrimitive_Pattern(idPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdPrimitive_MinLength(idPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIdPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] ID_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z0-9\\-\\.]{1,64}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Id Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive_Pattern(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getIdPrimitive(), idPrimitive, ID_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Id Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive_MinLength(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = idPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getIdPrimitive(), idPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceAvailabilityListObject(InstanceAvailabilityList instanceAvailabilityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantPrimitive(XMLGregorianCalendar instantPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerPrimitive(int integerPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntegerPrimitive_Pattern(integerPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIntegerPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] INTEGER_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?([0]|([1-9][0-9]*))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Integer Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerPrimitive_Pattern(int integerPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getIntegerPrimitive(), integerPrimitive, INTEGER_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerPrimitiveObject(Integer integerPrimitiveObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntegerPrimitive_Pattern(integerPrimitiveObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueSeverityListObject(IssueSeverityList issueSeverityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkTypeListObject(LinkTypeList linkTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListModeListObject(ListModeList listModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStatusListObject(ListStatusList listStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationModeListObject(LocationModeList locationModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationStatusListObject(LocationStatusList locationStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasmntPrincipleListObject(MeasmntPrincipleList measmntPrincipleListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministrationStatusListObject(MedicationAdministrationStatusList medicationAdministrationStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseStatusListObject(MedicationDispenseStatusList medicationDispenseStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationKindListObject(MedicationKindList medicationKindListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationPrescriptionStatusListObject(MedicationPrescriptionStatusList medicationPrescriptionStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatementStatusListObject(MedicationStatementStatusList medicationStatementStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageSignificanceCategoryListObject(MessageSignificanceCategoryList messageSignificanceCategoryListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameUseListObject(NameUseList nameUseListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemIdentifierTypeListObject(NamingSystemIdentifierTypeList namingSystemIdentifierTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemTypeListObject(NamingSystemTypeList namingSystemTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrativeStatusListObject(NarrativeStatusList narrativeStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteTypeListObject(NoteTypeList noteTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderStatusListObject(NutritionOrderStatusList nutritionOrderStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRelationshipTypeListObject(ObservationRelationshipTypeList observationRelationshipTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationReliabilityListObject(ObservationReliabilityList observationReliabilityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationStatusListObject(ObservationStatusList observationStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOidPrimitive(String oidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOidPrimitive_Pattern(oidPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateOidPrimitive_MinLength(oidPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOidPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] OID_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Oid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOidPrimitive_Pattern(String oidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getOidPrimitive(), oidPrimitive, OID_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Oid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOidPrimitive_MinLength(String oidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = oidPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getOidPrimitive(), oidPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationKindListObject(OperationKindList operationKindListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationParameterUseListObject(OperationParameterUseList operationParameterUseListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderStatusListObject(OrderStatusList orderStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagePurposeListObject(PagePurposeList pagePurposeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantRequiredListObject(ParticipantRequiredList participantRequiredListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantStatusListObject(ParticipantStatusList participantStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipationStatusListObject(ParticipationStatusList participationStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntPrimitive(BigInteger positiveIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validatePositiveInteger_Min(positiveIntPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validatePositiveIntPrimitive_Pattern(positiveIntPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveIntPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] POSITIVE_INT_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Positive Int Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntPrimitive_Pattern(BigInteger positiveIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getPositiveIntPrimitive(), positiveIntPrimitive, POSITIVE_INT_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRelationshipTypeListObject(ProcedureRelationshipTypeList procedureRelationshipTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRequestPriorityListObject(ProcedureRequestPriorityList procedureRequestPriorityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRequestStatusListObject(ProcedureRequestStatusList procedureRequestStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureStatusListObject(ProcedureStatusList procedureStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyRepresentationListObject(PropertyRepresentationList propertyRepresentationListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceEntityRoleListObject(ProvenanceEntityRoleList provenanceEntityRoleListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityComparatorListObject(QuantityComparatorList quantityComparatorListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireAnswersStatusListObject(QuestionnaireAnswersStatusList questionnaireAnswersStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireStatusListObject(QuestionnaireStatusList questionnaireStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralStatusListObject(ReferralStatusList referralStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemittanceOutcomeListObject(RemittanceOutcomeList remittanceOutcomeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceVersionPolicyListObject(ResourceVersionPolicyList resourceVersionPolicyListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseTypeListObject(ResponseTypeList responseTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestfulConformanceModeListObject(RestfulConformanceModeList restfulConformanceModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledDataDataTypePrimitive(String sampledDataDataTypePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSampledDataDataTypePrimitive_Pattern(sampledDataDataTypePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSampledDataDataTypePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] SAMPLED_DATA_DATA_TYPE_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("((-{0,1}\\d*\\.{0,1}\\d+)|[EUL])( ((-{0,1}\\d*\\.{0,1}\\d+)|[EUL]))*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Sampled Data Data Type Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledDataDataTypePrimitive_Pattern(String sampledDataDataTypePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getSampledDataDataTypePrimitive(), sampledDataDataTypePrimitive, SAMPLED_DATA_DATA_TYPE_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchEntryModeListObject(SearchEntryModeList searchEntryModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchModifierCodeListObject(SearchModifierCodeList searchModifierCodeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParamTypeListObject(SearchParamTypeList searchParamTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlicingRulesListObject(SlicingRulesList slicingRulesListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlotStatusListObject(SlotStatusList slotStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringPrimitive(String stringPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringPrimitive_MinLength(stringPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>String Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringPrimitive_MinLength(String stringPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = stringPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getStringPrimitive(), stringPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionKindListObject(StructureDefinitionKindList structureDefinitionKindListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionChannelTypeListObject(SubscriptionChannelTypeList subscriptionChannelTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionStatusListObject(SubscriptionStatusList subscriptionStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDeliveryStatusListObject(SupplyDeliveryStatusList supplyDeliveryStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDispenseStatusListObject(SupplyDispenseStatusList supplyDispenseStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequestStatusListObject(SupplyRequestStatusList supplyRequestStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyStatusListObject(SupplyStatusList supplyStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemRestfulInteractionListObject(SystemRestfulInteractionList systemRestfulInteractionListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePrimitive(XMLGregorianCalendar timePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimePrimitive_Pattern(timePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] TIME_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Time Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePrimitive_Pattern(XMLGregorianCalendar timePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getTimePrimitive(), timePrimitive, TIME_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionModeListObject(TransactionModeList transactionModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestfulInteractionListObject(TypeRestfulInteractionList typeRestfulInteractionListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsOfTimeListObject(UnitsOfTimeList unitsOfTimeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedIntPrimitive(BigInteger unsignedIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(unsignedIntPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnsignedIntPrimitive_Pattern(unsignedIntPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUnsignedIntPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] UNSIGNED_INT_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0]|([1-9][0-9]*)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Unsigned Int Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedIntPrimitive_Pattern(BigInteger unsignedIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getUnsignedIntPrimitive(), unsignedIntPrimitive, UNSIGNED_INT_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUriPrimitive(String uriPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseListObject(UseList useListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuidPrimitive(String uuidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUuidPrimitive_Pattern(uuidPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateUuidPrimitive_MinLength(uuidPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUuidPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] UUID_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("urn:uuid:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Uuid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuidPrimitive_Pattern(String uuidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getUuidPrimitive(), uuidPrimitive, UUID_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Uuid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuidPrimitive_MinLength(String uuidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = uuidPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getUuidPrimitive(), uuidPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionBaseListObject(VisionBaseList visionBaseListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionEyesListObject(VisionEyesList visionEyesListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FhirValidator
