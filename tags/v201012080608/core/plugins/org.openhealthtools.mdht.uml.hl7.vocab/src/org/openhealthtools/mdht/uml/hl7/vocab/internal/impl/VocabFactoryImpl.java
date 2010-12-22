/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.vocab.internal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClass;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassClinicalDocument;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassDocument;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassSupply;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipFulfills;
import org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipHasComponent;
import org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipType;
import org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType;
import org.openhealthtools.mdht.uml.hl7.vocab.CalendarCycle;
import org.openhealthtools.mdht.uml.hl7.vocab.CompressionAlgorithm;
import org.openhealthtools.mdht.uml.hl7.vocab.ContextControl;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClass;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassDevice;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassManufacturedMaterial;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassOrganization;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassPlace;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminer;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminerDetermined;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartQualifier;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartType;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNameUse;
import org.openhealthtools.mdht.uml.hl7.vocab.IntegrityCheckAlgorithm;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationPhysicalPerformer;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationTargetLocation;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationTargetSubject;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClass;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssignedEntity;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssociative;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassManufacturedProduct;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassMutualRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassServiceDeliveryLocation;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassSpecimen;
import org.openhealthtools.mdht.uml.hl7.vocab.SetOperator;
import org.openhealthtools.mdht.uml.hl7.vocab.TelecommunicationAddressUse;
import org.openhealthtools.mdht.uml.hl7.vocab.TimingEvent;
import org.openhealthtools.mdht.uml.hl7.vocab.VocabFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryOrganizer;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipDocument;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntry;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentEncounterMood;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentProcedureMood;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubject;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;
import org.openhealthtools.mdht.uml.hl7.vocab.x_EncounterParticipant;
import org.openhealthtools.mdht.uml.hl7.vocab.x_InformationRecipient;
import org.openhealthtools.mdht.uml.hl7.vocab.x_InformationRecipientRole;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ServiceEventPerformer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VocabFactoryImpl extends EFactoryImpl implements VocabFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VocabFactory init() {
		try {
			VocabFactory theVocabFactory = (VocabFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/hl7/vocab"); 
			if (theVocabFactory != null) {
				return theVocabFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VocabFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabFactoryImpl() {
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
			case VocabPackage.ACT_CLASS:
				return createActClassFromString(eDataType, initialValue);
			case VocabPackage.ACT_CLASS_CLINICAL_DOCUMENT:
				return createActClassClinicalDocumentFromString(eDataType, initialValue);
			case VocabPackage.ACT_CLASS_DOCUMENT:
				return createActClassDocumentFromString(eDataType, initialValue);
			case VocabPackage.ACT_CLASS_OBSERVATION:
				return createActClassObservationFromString(eDataType, initialValue);
			case VocabPackage.ACT_CLASS_ROOT:
				return createActClassRootFromString(eDataType, initialValue);
			case VocabPackage.ACT_CLASS_SUPPLY:
				return createActClassSupplyFromString(eDataType, initialValue);
			case VocabPackage.ACT_MOOD:
				return createActMoodFromString(eDataType, initialValue);
			case VocabPackage.ACT_RELATIONSHIP_FULFILLS:
				return createActRelationshipFulfillsFromString(eDataType, initialValue);
			case VocabPackage.ACT_RELATIONSHIP_HAS_COMPONENT:
				return createActRelationshipHasComponentFromString(eDataType, initialValue);
			case VocabPackage.ACT_RELATIONSHIP_TYPE:
				return createActRelationshipTypeFromString(eDataType, initialValue);
			case VocabPackage.ADDRESS_PART_TYPE:
				return createAddressPartTypeFromString(eDataType, initialValue);
			case VocabPackage.CALENDAR_CYCLE:
				return createCalendarCycleFromString(eDataType, initialValue);
			case VocabPackage.COMPRESSION_ALGORITHM:
				return createCompressionAlgorithmFromString(eDataType, initialValue);
			case VocabPackage.CONTEXT_CONTROL:
				return createContextControlFromString(eDataType, initialValue);
			case VocabPackage.ENTITY_CLASS:
				return createEntityClassFromString(eDataType, initialValue);
			case VocabPackage.ENTITY_CLASS_DEVICE:
				return createEntityClassDeviceFromString(eDataType, initialValue);
			case VocabPackage.ENTITY_CLASS_MANUFACTURED_MATERIAL:
				return createEntityClassManufacturedMaterialFromString(eDataType, initialValue);
			case VocabPackage.ENTITY_CLASS_ORGANIZATION:
				return createEntityClassOrganizationFromString(eDataType, initialValue);
			case VocabPackage.ENTITY_CLASS_PLACE:
				return createEntityClassPlaceFromString(eDataType, initialValue);
			case VocabPackage.ENTITY_CLASS_ROOT:
				return createEntityClassRootFromString(eDataType, initialValue);
			case VocabPackage.ENTITY_DETERMINER:
				return createEntityDeterminerFromString(eDataType, initialValue);
			case VocabPackage.ENTITY_DETERMINER_DETERMINED:
				return createEntityDeterminerDeterminedFromString(eDataType, initialValue);
			case VocabPackage.ENTITY_NAME_PART_QUALIFIER:
				return createEntityNamePartQualifierFromString(eDataType, initialValue);
			case VocabPackage.ENTITY_NAME_PART_TYPE:
				return createEntityNamePartTypeFromString(eDataType, initialValue);
			case VocabPackage.ENTITY_NAME_USE:
				return createEntityNameUseFromString(eDataType, initialValue);
			case VocabPackage.INTEGRITY_CHECK_ALGORITHM:
				return createIntegrityCheckAlgorithmFromString(eDataType, initialValue);
			case VocabPackage.NULL_FLAVOR:
				return createNullFlavorFromString(eDataType, initialValue);
			case VocabPackage.PARTICIPATION_PHYSICAL_PERFORMER:
				return createParticipationPhysicalPerformerFromString(eDataType, initialValue);
			case VocabPackage.PARTICIPATION_TARGET_LOCATION:
				return createParticipationTargetLocationFromString(eDataType, initialValue);
			case VocabPackage.PARTICIPATION_TARGET_SUBJECT:
				return createParticipationTargetSubjectFromString(eDataType, initialValue);
			case VocabPackage.PARTICIPATION_TYPE:
				return createParticipationTypeFromString(eDataType, initialValue);
			case VocabPackage.POSTAL_ADDRESS_USE:
				return createPostalAddressUseFromString(eDataType, initialValue);
			case VocabPackage.ROLE_CLASS:
				return createRoleClassFromString(eDataType, initialValue);
			case VocabPackage.ROLE_CLASS_ASSIGNED_ENTITY:
				return createRoleClassAssignedEntityFromString(eDataType, initialValue);
			case VocabPackage.ROLE_CLASS_ASSOCIATIVE:
				return createRoleClassAssociativeFromString(eDataType, initialValue);
			case VocabPackage.ROLE_CLASS_MANUFACTURED_PRODUCT:
				return createRoleClassManufacturedProductFromString(eDataType, initialValue);
			case VocabPackage.ROLE_CLASS_MUTUAL_RELATIONSHIP:
				return createRoleClassMutualRelationshipFromString(eDataType, initialValue);
			case VocabPackage.ROLE_CLASS_ROOT:
				return createRoleClassRootFromString(eDataType, initialValue);
			case VocabPackage.ROLE_CLASS_SERVICE_DELIVERY_LOCATION:
				return createRoleClassServiceDeliveryLocationFromString(eDataType, initialValue);
			case VocabPackage.ROLE_CLASS_SPECIMEN:
				return createRoleClassSpecimenFromString(eDataType, initialValue);
			case VocabPackage.SET_OPERATOR:
				return createSetOperatorFromString(eDataType, initialValue);
			case VocabPackage.TELECOMMUNICATION_ADDRESS_USE:
				return createTelecommunicationAddressUseFromString(eDataType, initialValue);
			case VocabPackage.XACT_CLASS_DOCUMENT_ENTRY_ACT:
				return createx_ActClassDocumentEntryActFromString(eDataType, initialValue);
			case VocabPackage.XACT_CLASS_DOCUMENT_ENTRY_ORGANIZER:
				return createx_ActClassDocumentEntryOrganizerFromString(eDataType, initialValue);
			case VocabPackage.XACT_MOOD_DOCUMENT_OBSERVATION:
				return createx_ActMoodDocumentObservationFromString(eDataType, initialValue);
			case VocabPackage.XACT_RELATIONSHIP_DOCUMENT:
				return createx_ActRelationshipDocumentFromString(eDataType, initialValue);
			case VocabPackage.XACT_RELATIONSHIP_ENTRY:
				return createx_ActRelationshipEntryFromString(eDataType, initialValue);
			case VocabPackage.XACT_RELATIONSHIP_ENTRY_RELATIONSHIP:
				return createx_ActRelationshipEntryRelationshipFromString(eDataType, initialValue);
			case VocabPackage.XACT_RELATIONSHIP_EXTERNAL_REFERENCE:
				return createx_ActRelationshipExternalReferenceFromString(eDataType, initialValue);
			case VocabPackage.XDOCUMENT_ACT_MOOD:
				return createx_DocumentActMoodFromString(eDataType, initialValue);
			case VocabPackage.XDOCUMENT_ENCOUNTER_MOOD:
				return createx_DocumentEncounterMoodFromString(eDataType, initialValue);
			case VocabPackage.XDOCUMENT_PROCEDURE_MOOD:
				return createx_DocumentProcedureMoodFromString(eDataType, initialValue);
			case VocabPackage.XDOCUMENT_SUBJECT:
				return createx_DocumentSubjectFromString(eDataType, initialValue);
			case VocabPackage.XDOCUMENT_SUBSTANCE_MOOD:
				return createx_DocumentSubstanceMoodFromString(eDataType, initialValue);
			case VocabPackage.XENCOUNTER_PARTICIPANT:
				return createx_EncounterParticipantFromString(eDataType, initialValue);
			case VocabPackage.XINFORMATION_RECIPIENT:
				return createx_InformationRecipientFromString(eDataType, initialValue);
			case VocabPackage.XINFORMATION_RECIPIENT_ROLE:
				return createx_InformationRecipientRoleFromString(eDataType, initialValue);
			case VocabPackage.XSERVICE_EVENT_PERFORMER:
				return createx_ServiceEventPerformerFromString(eDataType, initialValue);
			case VocabPackage.TIMING_EVENT:
				return createTimingEventFromString(eDataType, initialValue);
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
			case VocabPackage.ACT_CLASS:
				return convertActClassToString(eDataType, instanceValue);
			case VocabPackage.ACT_CLASS_CLINICAL_DOCUMENT:
				return convertActClassClinicalDocumentToString(eDataType, instanceValue);
			case VocabPackage.ACT_CLASS_DOCUMENT:
				return convertActClassDocumentToString(eDataType, instanceValue);
			case VocabPackage.ACT_CLASS_OBSERVATION:
				return convertActClassObservationToString(eDataType, instanceValue);
			case VocabPackage.ACT_CLASS_ROOT:
				return convertActClassRootToString(eDataType, instanceValue);
			case VocabPackage.ACT_CLASS_SUPPLY:
				return convertActClassSupplyToString(eDataType, instanceValue);
			case VocabPackage.ACT_MOOD:
				return convertActMoodToString(eDataType, instanceValue);
			case VocabPackage.ACT_RELATIONSHIP_FULFILLS:
				return convertActRelationshipFulfillsToString(eDataType, instanceValue);
			case VocabPackage.ACT_RELATIONSHIP_HAS_COMPONENT:
				return convertActRelationshipHasComponentToString(eDataType, instanceValue);
			case VocabPackage.ACT_RELATIONSHIP_TYPE:
				return convertActRelationshipTypeToString(eDataType, instanceValue);
			case VocabPackage.ADDRESS_PART_TYPE:
				return convertAddressPartTypeToString(eDataType, instanceValue);
			case VocabPackage.CALENDAR_CYCLE:
				return convertCalendarCycleToString(eDataType, instanceValue);
			case VocabPackage.COMPRESSION_ALGORITHM:
				return convertCompressionAlgorithmToString(eDataType, instanceValue);
			case VocabPackage.CONTEXT_CONTROL:
				return convertContextControlToString(eDataType, instanceValue);
			case VocabPackage.ENTITY_CLASS:
				return convertEntityClassToString(eDataType, instanceValue);
			case VocabPackage.ENTITY_CLASS_DEVICE:
				return convertEntityClassDeviceToString(eDataType, instanceValue);
			case VocabPackage.ENTITY_CLASS_MANUFACTURED_MATERIAL:
				return convertEntityClassManufacturedMaterialToString(eDataType, instanceValue);
			case VocabPackage.ENTITY_CLASS_ORGANIZATION:
				return convertEntityClassOrganizationToString(eDataType, instanceValue);
			case VocabPackage.ENTITY_CLASS_PLACE:
				return convertEntityClassPlaceToString(eDataType, instanceValue);
			case VocabPackage.ENTITY_CLASS_ROOT:
				return convertEntityClassRootToString(eDataType, instanceValue);
			case VocabPackage.ENTITY_DETERMINER:
				return convertEntityDeterminerToString(eDataType, instanceValue);
			case VocabPackage.ENTITY_DETERMINER_DETERMINED:
				return convertEntityDeterminerDeterminedToString(eDataType, instanceValue);
			case VocabPackage.ENTITY_NAME_PART_QUALIFIER:
				return convertEntityNamePartQualifierToString(eDataType, instanceValue);
			case VocabPackage.ENTITY_NAME_PART_TYPE:
				return convertEntityNamePartTypeToString(eDataType, instanceValue);
			case VocabPackage.ENTITY_NAME_USE:
				return convertEntityNameUseToString(eDataType, instanceValue);
			case VocabPackage.INTEGRITY_CHECK_ALGORITHM:
				return convertIntegrityCheckAlgorithmToString(eDataType, instanceValue);
			case VocabPackage.NULL_FLAVOR:
				return convertNullFlavorToString(eDataType, instanceValue);
			case VocabPackage.PARTICIPATION_PHYSICAL_PERFORMER:
				return convertParticipationPhysicalPerformerToString(eDataType, instanceValue);
			case VocabPackage.PARTICIPATION_TARGET_LOCATION:
				return convertParticipationTargetLocationToString(eDataType, instanceValue);
			case VocabPackage.PARTICIPATION_TARGET_SUBJECT:
				return convertParticipationTargetSubjectToString(eDataType, instanceValue);
			case VocabPackage.PARTICIPATION_TYPE:
				return convertParticipationTypeToString(eDataType, instanceValue);
			case VocabPackage.POSTAL_ADDRESS_USE:
				return convertPostalAddressUseToString(eDataType, instanceValue);
			case VocabPackage.ROLE_CLASS:
				return convertRoleClassToString(eDataType, instanceValue);
			case VocabPackage.ROLE_CLASS_ASSIGNED_ENTITY:
				return convertRoleClassAssignedEntityToString(eDataType, instanceValue);
			case VocabPackage.ROLE_CLASS_ASSOCIATIVE:
				return convertRoleClassAssociativeToString(eDataType, instanceValue);
			case VocabPackage.ROLE_CLASS_MANUFACTURED_PRODUCT:
				return convertRoleClassManufacturedProductToString(eDataType, instanceValue);
			case VocabPackage.ROLE_CLASS_MUTUAL_RELATIONSHIP:
				return convertRoleClassMutualRelationshipToString(eDataType, instanceValue);
			case VocabPackage.ROLE_CLASS_ROOT:
				return convertRoleClassRootToString(eDataType, instanceValue);
			case VocabPackage.ROLE_CLASS_SERVICE_DELIVERY_LOCATION:
				return convertRoleClassServiceDeliveryLocationToString(eDataType, instanceValue);
			case VocabPackage.ROLE_CLASS_SPECIMEN:
				return convertRoleClassSpecimenToString(eDataType, instanceValue);
			case VocabPackage.SET_OPERATOR:
				return convertSetOperatorToString(eDataType, instanceValue);
			case VocabPackage.TELECOMMUNICATION_ADDRESS_USE:
				return convertTelecommunicationAddressUseToString(eDataType, instanceValue);
			case VocabPackage.XACT_CLASS_DOCUMENT_ENTRY_ACT:
				return convertx_ActClassDocumentEntryActToString(eDataType, instanceValue);
			case VocabPackage.XACT_CLASS_DOCUMENT_ENTRY_ORGANIZER:
				return convertx_ActClassDocumentEntryOrganizerToString(eDataType, instanceValue);
			case VocabPackage.XACT_MOOD_DOCUMENT_OBSERVATION:
				return convertx_ActMoodDocumentObservationToString(eDataType, instanceValue);
			case VocabPackage.XACT_RELATIONSHIP_DOCUMENT:
				return convertx_ActRelationshipDocumentToString(eDataType, instanceValue);
			case VocabPackage.XACT_RELATIONSHIP_ENTRY:
				return convertx_ActRelationshipEntryToString(eDataType, instanceValue);
			case VocabPackage.XACT_RELATIONSHIP_ENTRY_RELATIONSHIP:
				return convertx_ActRelationshipEntryRelationshipToString(eDataType, instanceValue);
			case VocabPackage.XACT_RELATIONSHIP_EXTERNAL_REFERENCE:
				return convertx_ActRelationshipExternalReferenceToString(eDataType, instanceValue);
			case VocabPackage.XDOCUMENT_ACT_MOOD:
				return convertx_DocumentActMoodToString(eDataType, instanceValue);
			case VocabPackage.XDOCUMENT_ENCOUNTER_MOOD:
				return convertx_DocumentEncounterMoodToString(eDataType, instanceValue);
			case VocabPackage.XDOCUMENT_PROCEDURE_MOOD:
				return convertx_DocumentProcedureMoodToString(eDataType, instanceValue);
			case VocabPackage.XDOCUMENT_SUBJECT:
				return convertx_DocumentSubjectToString(eDataType, instanceValue);
			case VocabPackage.XDOCUMENT_SUBSTANCE_MOOD:
				return convertx_DocumentSubstanceMoodToString(eDataType, instanceValue);
			case VocabPackage.XENCOUNTER_PARTICIPANT:
				return convertx_EncounterParticipantToString(eDataType, instanceValue);
			case VocabPackage.XINFORMATION_RECIPIENT:
				return convertx_InformationRecipientToString(eDataType, instanceValue);
			case VocabPackage.XINFORMATION_RECIPIENT_ROLE:
				return convertx_InformationRecipientRoleToString(eDataType, instanceValue);
			case VocabPackage.XSERVICE_EVENT_PERFORMER:
				return convertx_ServiceEventPerformerToString(eDataType, instanceValue);
			case VocabPackage.TIMING_EVENT:
				return convertTimingEventToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActClass createActClassFromString(EDataType eDataType, String initialValue) {
		ActClass result = ActClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActClassClinicalDocument createActClassClinicalDocumentFromString(EDataType eDataType, String initialValue) {
		ActClassClinicalDocument result = ActClassClinicalDocument.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActClassClinicalDocumentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActClassDocument createActClassDocumentFromString(EDataType eDataType, String initialValue) {
		ActClassDocument result = ActClassDocument.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActClassDocumentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActClassObservation createActClassObservationFromString(EDataType eDataType, String initialValue) {
		ActClassObservation result = ActClassObservation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActClassObservationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActClassRoot createActClassRootFromString(EDataType eDataType, String initialValue) {
		ActClassRoot result = ActClassRoot.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActClassRootToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActClassSupply createActClassSupplyFromString(EDataType eDataType, String initialValue) {
		ActClassSupply result = ActClassSupply.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActClassSupplyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActMood createActMoodFromString(EDataType eDataType, String initialValue) {
		ActMood result = ActMood.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActMoodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActRelationshipFulfills createActRelationshipFulfillsFromString(EDataType eDataType, String initialValue) {
		ActRelationshipFulfills result = ActRelationshipFulfills.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActRelationshipFulfillsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActRelationshipHasComponent createActRelationshipHasComponentFromString(EDataType eDataType, String initialValue) {
		ActRelationshipHasComponent result = ActRelationshipHasComponent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActRelationshipHasComponentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActRelationshipType createActRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		ActRelationshipType result = ActRelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressPartType createAddressPartTypeFromString(EDataType eDataType, String initialValue) {
		AddressPartType result = AddressPartType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressPartTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarCycle createCalendarCycleFromString(EDataType eDataType, String initialValue) {
		CalendarCycle result = CalendarCycle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarCycleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompressionAlgorithm createCompressionAlgorithmFromString(EDataType eDataType, String initialValue) {
		CompressionAlgorithm result = CompressionAlgorithm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompressionAlgorithmToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextControl createContextControlFromString(EDataType eDataType, String initialValue) {
		ContextControl result = ContextControl.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextControlToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityClass createEntityClassFromString(EDataType eDataType, String initialValue) {
		EntityClass result = EntityClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityClassDevice createEntityClassDeviceFromString(EDataType eDataType, String initialValue) {
		EntityClassDevice result = EntityClassDevice.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityClassDeviceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityClassManufacturedMaterial createEntityClassManufacturedMaterialFromString(EDataType eDataType, String initialValue) {
		EntityClassManufacturedMaterial result = EntityClassManufacturedMaterial.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityClassManufacturedMaterialToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityClassOrganization createEntityClassOrganizationFromString(EDataType eDataType, String initialValue) {
		EntityClassOrganization result = EntityClassOrganization.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityClassOrganizationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityClassPlace createEntityClassPlaceFromString(EDataType eDataType, String initialValue) {
		EntityClassPlace result = EntityClassPlace.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityClassPlaceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityClassRoot createEntityClassRootFromString(EDataType eDataType, String initialValue) {
		EntityClassRoot result = EntityClassRoot.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityClassRootToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityDeterminer createEntityDeterminerFromString(EDataType eDataType, String initialValue) {
		EntityDeterminer result = EntityDeterminer.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityDeterminerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityDeterminerDetermined createEntityDeterminerDeterminedFromString(EDataType eDataType, String initialValue) {
		EntityDeterminerDetermined result = EntityDeterminerDetermined.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityDeterminerDeterminedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityNamePartQualifier createEntityNamePartQualifierFromString(EDataType eDataType, String initialValue) {
		EntityNamePartQualifier result = EntityNamePartQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityNamePartQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityNamePartType createEntityNamePartTypeFromString(EDataType eDataType, String initialValue) {
		EntityNamePartType result = EntityNamePartType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityNamePartTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityNameUse createEntityNameUseFromString(EDataType eDataType, String initialValue) {
		EntityNameUse result = EntityNameUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityNameUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityCheckAlgorithm createIntegrityCheckAlgorithmFromString(EDataType eDataType, String initialValue) {
		IntegrityCheckAlgorithm result = IntegrityCheckAlgorithm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegrityCheckAlgorithmToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullFlavor createNullFlavorFromString(EDataType eDataType, String initialValue) {
		NullFlavor result = NullFlavor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullFlavorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationPhysicalPerformer createParticipationPhysicalPerformerFromString(EDataType eDataType, String initialValue) {
		ParticipationPhysicalPerformer result = ParticipationPhysicalPerformer.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipationPhysicalPerformerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationTargetLocation createParticipationTargetLocationFromString(EDataType eDataType, String initialValue) {
		ParticipationTargetLocation result = ParticipationTargetLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipationTargetLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationTargetSubject createParticipationTargetSubjectFromString(EDataType eDataType, String initialValue) {
		ParticipationTargetSubject result = ParticipationTargetSubject.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipationTargetSubjectToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationType createParticipationTypeFromString(EDataType eDataType, String initialValue) {
		ParticipationType result = ParticipationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalAddressUse createPostalAddressUseFromString(EDataType eDataType, String initialValue) {
		PostalAddressUse result = PostalAddressUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPostalAddressUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClass createRoleClassFromString(EDataType eDataType, String initialValue) {
		RoleClass result = RoleClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClassAssignedEntity createRoleClassAssignedEntityFromString(EDataType eDataType, String initialValue) {
		RoleClassAssignedEntity result = RoleClassAssignedEntity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleClassAssignedEntityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClassAssociative createRoleClassAssociativeFromString(EDataType eDataType, String initialValue) {
		RoleClassAssociative result = RoleClassAssociative.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleClassAssociativeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClassManufacturedProduct createRoleClassManufacturedProductFromString(EDataType eDataType, String initialValue) {
		RoleClassManufacturedProduct result = RoleClassManufacturedProduct.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleClassManufacturedProductToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClassMutualRelationship createRoleClassMutualRelationshipFromString(EDataType eDataType, String initialValue) {
		RoleClassMutualRelationship result = RoleClassMutualRelationship.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleClassMutualRelationshipToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClassRoot createRoleClassRootFromString(EDataType eDataType, String initialValue) {
		RoleClassRoot result = RoleClassRoot.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleClassRootToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClassServiceDeliveryLocation createRoleClassServiceDeliveryLocationFromString(EDataType eDataType, String initialValue) {
		RoleClassServiceDeliveryLocation result = RoleClassServiceDeliveryLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleClassServiceDeliveryLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClassSpecimen createRoleClassSpecimenFromString(EDataType eDataType, String initialValue) {
		RoleClassSpecimen result = RoleClassSpecimen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleClassSpecimenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOperator createSetOperatorFromString(EDataType eDataType, String initialValue) {
		SetOperator result = SetOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSetOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecommunicationAddressUse createTelecommunicationAddressUseFromString(EDataType eDataType, String initialValue) {
		TelecommunicationAddressUse result = TelecommunicationAddressUse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTelecommunicationAddressUseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x_ActClassDocumentEntryAct createx_ActClassDocumentEntryActFromString(EDataType eDataType, String initialValue) {
		x_ActClassDocumentEntryAct result = x_ActClassDocumentEntryAct.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertx_ActClassDocumentEntryActToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x_ActClassDocumentEntryOrganizer createx_ActClassDocumentEntryOrganizerFromString(EDataType eDataType, String initialValue) {
		x_ActClassDocumentEntryOrganizer result = x_ActClassDocumentEntryOrganizer.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertx_ActClassDocumentEntryOrganizerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x_ActMoodDocumentObservation createx_ActMoodDocumentObservationFromString(EDataType eDataType, String initialValue) {
		x_ActMoodDocumentObservation result = x_ActMoodDocumentObservation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertx_ActMoodDocumentObservationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x_ActRelationshipDocument createx_ActRelationshipDocumentFromString(EDataType eDataType, String initialValue) {
		x_ActRelationshipDocument result = x_ActRelationshipDocument.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertx_ActRelationshipDocumentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x_ActRelationshipEntry createx_ActRelationshipEntryFromString(EDataType eDataType, String initialValue) {
		x_ActRelationshipEntry result = x_ActRelationshipEntry.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertx_ActRelationshipEntryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x_ActRelationshipEntryRelationship createx_ActRelationshipEntryRelationshipFromString(EDataType eDataType, String initialValue) {
		x_ActRelationshipEntryRelationship result = x_ActRelationshipEntryRelationship.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertx_ActRelationshipEntryRelationshipToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x_ActRelationshipExternalReference createx_ActRelationshipExternalReferenceFromString(EDataType eDataType, String initialValue) {
		x_ActRelationshipExternalReference result = x_ActRelationshipExternalReference.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertx_ActRelationshipExternalReferenceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x_DocumentActMood createx_DocumentActMoodFromString(EDataType eDataType, String initialValue) {
		x_DocumentActMood result = x_DocumentActMood.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertx_DocumentActMoodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x_DocumentEncounterMood createx_DocumentEncounterMoodFromString(EDataType eDataType, String initialValue) {
		x_DocumentEncounterMood result = x_DocumentEncounterMood.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertx_DocumentEncounterMoodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x_DocumentProcedureMood createx_DocumentProcedureMoodFromString(EDataType eDataType, String initialValue) {
		x_DocumentProcedureMood result = x_DocumentProcedureMood.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertx_DocumentProcedureMoodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x_DocumentSubject createx_DocumentSubjectFromString(EDataType eDataType, String initialValue) {
		x_DocumentSubject result = x_DocumentSubject.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertx_DocumentSubjectToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x_DocumentSubstanceMood createx_DocumentSubstanceMoodFromString(EDataType eDataType, String initialValue) {
		x_DocumentSubstanceMood result = x_DocumentSubstanceMood.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertx_DocumentSubstanceMoodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x_EncounterParticipant createx_EncounterParticipantFromString(EDataType eDataType, String initialValue) {
		x_EncounterParticipant result = x_EncounterParticipant.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertx_EncounterParticipantToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x_InformationRecipient createx_InformationRecipientFromString(EDataType eDataType, String initialValue) {
		x_InformationRecipient result = x_InformationRecipient.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertx_InformationRecipientToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x_InformationRecipientRole createx_InformationRecipientRoleFromString(EDataType eDataType, String initialValue) {
		x_InformationRecipientRole result = x_InformationRecipientRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertx_InformationRecipientRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public x_ServiceEventPerformer createx_ServiceEventPerformerFromString(EDataType eDataType, String initialValue) {
		x_ServiceEventPerformer result = x_ServiceEventPerformer.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertx_ServiceEventPerformerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingEvent createTimingEventFromString(EDataType eDataType, String initialValue) {
		TimingEvent result = TimingEvent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimingEventToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabPackage getVocabPackage() {
		return (VocabPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VocabPackage getPackage() {
		return VocabPackage.eINSTANCE;
	}

} //VocabFactoryImpl
