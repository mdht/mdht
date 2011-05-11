/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.vocab;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabFactory
 * @model kind="package"
 * @generated
 */
public interface VocabPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vocab";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/hl7/vocab";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vocab";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VocabPackage eINSTANCE = org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActClass <em>Act Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClass
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getActClass()
	 * @generated
	 */
	int ACT_CLASS = 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActClinicalDocument <em>Act Clinical Document</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClinicalDocument
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getActClinicalDocument()
	 * @generated
	 */
	int ACT_CLINICAL_DOCUMENT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActClassDocument <em>Act Class Document</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClassDocument
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getActClassDocument()
	 * @generated
	 */
	int ACT_CLASS_DOCUMENT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation <em>Act Class Observation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getActClassObservation()
	 * @generated
	 */
	int ACT_CLASS_OBSERVATION = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActClassRoot <em>Act Class Root</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClassRoot
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getActClassRoot()
	 * @generated
	 */
	int ACT_CLASS_ROOT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActClassSupply <em>Act Class Supply</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClassSupply
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getActClassSupply()
	 * @generated
	 */
	int ACT_CLASS_SUPPLY = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActMood <em>Act Mood</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActMood
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getActMood()
	 * @generated
	 */
	int ACT_MOOD = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipFulfills <em>Act Relationship Fulfills</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipFulfills
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getActRelationshipFulfills()
	 * @generated
	 */
	int ACT_RELATIONSHIP_FULFILLS = 7;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipHasComponent <em>Act Relationship Has Component</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipHasComponent
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getActRelationshipHasComponent()
	 * @generated
	 */
	int ACT_RELATIONSHIP_HAS_COMPONENT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipType <em>Act Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipType
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getActRelationshipType()
	 * @generated
	 */
	int ACT_RELATIONSHIP_TYPE = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType <em>Address Part Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getAddressPartType()
	 * @generated
	 */
	int ADDRESS_PART_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.CalendarCycle <em>Calendar Cycle</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.CalendarCycle
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getCalendarCycle()
	 * @generated
	 */
	int CALENDAR_CYCLE = 11;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.CompressionAlgorithm <em>Compression Algorithm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.CompressionAlgorithm
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getCompressionAlgorithm()
	 * @generated
	 */
	int COMPRESSION_ALGORITHM = 12;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.ContextControl <em>Context Control</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ContextControl
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getContextControl()
	 * @generated
	 */
	int CONTEXT_CONTROL = 13;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityClass <em>Entity Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityClass
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getEntityClass()
	 * @generated
	 */
	int ENTITY_CLASS = 14;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityClassDevice <em>Entity Class Device</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityClassDevice
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getEntityClassDevice()
	 * @generated
	 */
	int ENTITY_CLASS_DEVICE = 15;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityClassManufacturedMaterial <em>Entity Class Manufactured Material</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityClassManufacturedMaterial
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getEntityClassManufacturedMaterial()
	 * @generated
	 */
	int ENTITY_CLASS_MANUFACTURED_MATERIAL = 16;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityClassOrganization <em>Entity Class Organization</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityClassOrganization
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getEntityClassOrganization()
	 * @generated
	 */
	int ENTITY_CLASS_ORGANIZATION = 17;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityClassPlace <em>Entity Class Place</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityClassPlace
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getEntityClassPlace()
	 * @generated
	 */
	int ENTITY_CLASS_PLACE = 18;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot <em>Entity Class Root</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getEntityClassRoot()
	 * @generated
	 */
	int ENTITY_CLASS_ROOT = 19;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminer <em>Entity Determiner</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminer
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getEntityDeterminer()
	 * @generated
	 */
	int ENTITY_DETERMINER = 20;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminerDetermined <em>Entity Determiner Determined</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminerDetermined
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getEntityDeterminerDetermined()
	 * @generated
	 */
	int ENTITY_DETERMINER_DETERMINED = 21;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartQualifier <em>Entity Name Part Qualifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartQualifier
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getEntityNamePartQualifier()
	 * @generated
	 */
	int ENTITY_NAME_PART_QUALIFIER = 22;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartType <em>Entity Name Part Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartType
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getEntityNamePartType()
	 * @generated
	 */
	int ENTITY_NAME_PART_TYPE = 23;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityNameUse <em>Entity Name Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityNameUse
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getEntityNameUse()
	 * @generated
	 */
	int ENTITY_NAME_USE = 24;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.IntegrityCheckAlgorithm <em>Integrity Check Algorithm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.IntegrityCheckAlgorithm
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getIntegrityCheckAlgorithm()
	 * @generated
	 */
	int INTEGRITY_CHECK_ALGORITHM = 25;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor <em>Null Flavor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getNullFlavor()
	 * @generated
	 */
	int NULL_FLAVOR = 26;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.ParticipationPhysicalPerformer <em>Participation Physical Performer</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ParticipationPhysicalPerformer
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getParticipationPhysicalPerformer()
	 * @generated
	 */
	int PARTICIPATION_PHYSICAL_PERFORMER = 27;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.ParticipationTargetLocation <em>Participation Target Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ParticipationTargetLocation
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getParticipationTargetLocation()
	 * @generated
	 */
	int PARTICIPATION_TARGET_LOCATION = 28;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.ParticipationTargetSubject <em>Participation Target Subject</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ParticipationTargetSubject
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getParticipationTargetSubject()
	 * @generated
	 */
	int PARTICIPATION_TARGET_SUBJECT = 29;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType <em>Participation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getParticipationType()
	 * @generated
	 */
	int PARTICIPATION_TYPE = 30;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse <em>Postal Address Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getPostalAddressUse()
	 * @generated
	 */
	int POSTAL_ADDRESS_USE = 31;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.RoleClass <em>Role Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.RoleClass
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getRoleClass()
	 * @generated
	 */
	int ROLE_CLASS = 32;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssignedEntity <em>Role Class Assigned Entity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssignedEntity
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getRoleClassAssignedEntity()
	 * @generated
	 */
	int ROLE_CLASS_ASSIGNED_ENTITY = 33;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssociative <em>Role Class Associative</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssociative
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getRoleClassAssociative()
	 * @generated
	 */
	int ROLE_CLASS_ASSOCIATIVE = 34;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.RoleClassManufacturedProduct <em>Role Class Manufactured Product</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.RoleClassManufacturedProduct
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getRoleClassManufacturedProduct()
	 * @generated
	 */
	int ROLE_CLASS_MANUFACTURED_PRODUCT = 35;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.RoleClassMutualRelationship <em>Role Class Mutual Relationship</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.RoleClassMutualRelationship
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getRoleClassMutualRelationship()
	 * @generated
	 */
	int ROLE_CLASS_MUTUAL_RELATIONSHIP = 36;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot <em>Role Class Root</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getRoleClassRoot()
	 * @generated
	 */
	int ROLE_CLASS_ROOT = 37;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.RoleClassServiceDeliveryLocation <em>Role Class Service Delivery Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.RoleClassServiceDeliveryLocation
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getRoleClassServiceDeliveryLocation()
	 * @generated
	 */
	int ROLE_CLASS_SERVICE_DELIVERY_LOCATION = 38;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.RoleClassSpecimen <em>Role Class Specimen</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.RoleClassSpecimen
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getRoleClassSpecimen()
	 * @generated
	 */
	int ROLE_CLASS_SPECIMEN = 39;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.SetOperator <em>Set Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.SetOperator
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getSetOperator()
	 * @generated
	 */
	int SET_OPERATOR = 40;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.TelecommunicationAddressUse <em>Telecommunication Address Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.TelecommunicationAddressUse
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getTelecommunicationAddressUse()
	 * @generated
	 */
	int TELECOMMUNICATION_ADDRESS_USE = 41;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct <em>xAct Class Document Entry Act</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getx_ActClassDocumentEntryAct()
	 * @generated
	 */
	int XACT_CLASS_DOCUMENT_ENTRY_ACT = 42;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryOrganizer <em>xAct Class Document Entry Organizer</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryOrganizer
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getx_ActClassDocumentEntryOrganizer()
	 * @generated
	 */
	int XACT_CLASS_DOCUMENT_ENTRY_ORGANIZER = 43;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation <em>xAct Mood Document Observation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getx_ActMoodDocumentObservation()
	 * @generated
	 */
	int XACT_MOOD_DOCUMENT_OBSERVATION = 44;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipDocument <em>xAct Relationship Document</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipDocument
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getx_ActRelationshipDocument()
	 * @generated
	 */
	int XACT_RELATIONSHIP_DOCUMENT = 45;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntry <em>xAct Relationship Entry</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntry
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getx_ActRelationshipEntry()
	 * @generated
	 */
	int XACT_RELATIONSHIP_ENTRY = 46;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship <em>xAct Relationship Entry Relationship</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getx_ActRelationshipEntryRelationship()
	 * @generated
	 */
	int XACT_RELATIONSHIP_ENTRY_RELATIONSHIP = 47;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference <em>xAct Relationship External Reference</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getx_ActRelationshipExternalReference()
	 * @generated
	 */
	int XACT_RELATIONSHIP_EXTERNAL_REFERENCE = 48;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood <em>xDocument Act Mood</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getx_DocumentActMood()
	 * @generated
	 */
	int XDOCUMENT_ACT_MOOD = 49;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentEncounterMood <em>xDocument Encounter Mood</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentEncounterMood
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getx_DocumentEncounterMood()
	 * @generated
	 */
	int XDOCUMENT_ENCOUNTER_MOOD = 50;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentProcedureMood <em>xDocument Procedure Mood</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentProcedureMood
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getx_DocumentProcedureMood()
	 * @generated
	 */
	int XDOCUMENT_PROCEDURE_MOOD = 51;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubject <em>xDocument Subject</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubject
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getx_DocumentSubject()
	 * @generated
	 */
	int XDOCUMENT_SUBJECT = 52;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood <em>xDocument Substance Mood</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getx_DocumentSubstanceMood()
	 * @generated
	 */
	int XDOCUMENT_SUBSTANCE_MOOD = 53;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_EncounterParticipant <em>xEncounter Participant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_EncounterParticipant
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getx_EncounterParticipant()
	 * @generated
	 */
	int XENCOUNTER_PARTICIPANT = 54;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_InformationRecipient <em>xInformation Recipient</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_InformationRecipient
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getx_InformationRecipient()
	 * @generated
	 */
	int XINFORMATION_RECIPIENT = 55;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_InformationRecipientRole <em>xInformation Recipient Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_InformationRecipientRole
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getx_InformationRecipientRole()
	 * @generated
	 */
	int XINFORMATION_RECIPIENT_ROLE = 56;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_ServiceEventPerformer <em>xService Event Performer</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ServiceEventPerformer
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getx_ServiceEventPerformer()
	 * @generated
	 */
	int XSERVICE_EVENT_PERFORMER = 57;


	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.vocab.TimingEvent <em>Timing Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.TimingEvent
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.internal.impl.VocabPackageImpl#getTimingEvent()
	 * @generated
	 */
	int TIMING_EVENT = 58;


	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActClass <em>Act Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Class</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClass
	 * @generated
	 */
	EEnum getActClass();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActClinicalDocument <em>Act Clinical Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Clinical Document</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClinicalDocument
	 * @generated
	 */
	EEnum getActClinicalDocument();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActClassDocument <em>Act Class Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Class Document</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClassDocument
	 * @generated
	 */
	EEnum getActClassDocument();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation <em>Act Class Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Class Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation
	 * @generated
	 */
	EEnum getActClassObservation();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActClassRoot <em>Act Class Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Class Root</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClassRoot
	 * @generated
	 */
	EEnum getActClassRoot();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActClassSupply <em>Act Class Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Class Supply</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActClassSupply
	 * @generated
	 */
	EEnum getActClassSupply();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActMood <em>Act Mood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Mood</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActMood
	 * @generated
	 */
	EEnum getActMood();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipFulfills <em>Act Relationship Fulfills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Relationship Fulfills</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipFulfills
	 * @generated
	 */
	EEnum getActRelationshipFulfills();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipHasComponent <em>Act Relationship Has Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Relationship Has Component</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipHasComponent
	 * @generated
	 */
	EEnum getActRelationshipHasComponent();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipType <em>Act Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Relationship Type</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipType
	 * @generated
	 */
	EEnum getActRelationshipType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType <em>Address Part Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Address Part Type</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType
	 * @generated
	 */
	EEnum getAddressPartType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.CalendarCycle <em>Calendar Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Calendar Cycle</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.CalendarCycle
	 * @generated
	 */
	EEnum getCalendarCycle();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.CompressionAlgorithm <em>Compression Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compression Algorithm</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.CompressionAlgorithm
	 * @generated
	 */
	EEnum getCompressionAlgorithm();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.ContextControl <em>Context Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Context Control</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ContextControl
	 * @generated
	 */
	EEnum getContextControl();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityClass <em>Entity Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Class</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityClass
	 * @generated
	 */
	EEnum getEntityClass();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityClassDevice <em>Entity Class Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Class Device</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityClassDevice
	 * @generated
	 */
	EEnum getEntityClassDevice();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityClassManufacturedMaterial <em>Entity Class Manufactured Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Class Manufactured Material</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityClassManufacturedMaterial
	 * @generated
	 */
	EEnum getEntityClassManufacturedMaterial();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityClassOrganization <em>Entity Class Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Class Organization</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityClassOrganization
	 * @generated
	 */
	EEnum getEntityClassOrganization();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityClassPlace <em>Entity Class Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Class Place</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityClassPlace
	 * @generated
	 */
	EEnum getEntityClassPlace();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot <em>Entity Class Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Class Root</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot
	 * @generated
	 */
	EEnum getEntityClassRoot();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminer <em>Entity Determiner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Determiner</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminer
	 * @generated
	 */
	EEnum getEntityDeterminer();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminerDetermined <em>Entity Determiner Determined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Determiner Determined</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityDeterminerDetermined
	 * @generated
	 */
	EEnum getEntityDeterminerDetermined();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartQualifier <em>Entity Name Part Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Name Part Qualifier</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartQualifier
	 * @generated
	 */
	EEnum getEntityNamePartQualifier();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartType <em>Entity Name Part Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Name Part Type</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartType
	 * @generated
	 */
	EEnum getEntityNamePartType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.EntityNameUse <em>Entity Name Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Name Use</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.EntityNameUse
	 * @generated
	 */
	EEnum getEntityNameUse();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.IntegrityCheckAlgorithm <em>Integrity Check Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Integrity Check Algorithm</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.IntegrityCheckAlgorithm
	 * @generated
	 */
	EEnum getIntegrityCheckAlgorithm();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor
	 * @generated
	 */
	EEnum getNullFlavor();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.ParticipationPhysicalPerformer <em>Participation Physical Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participation Physical Performer</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ParticipationPhysicalPerformer
	 * @generated
	 */
	EEnum getParticipationPhysicalPerformer();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.ParticipationTargetLocation <em>Participation Target Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participation Target Location</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ParticipationTargetLocation
	 * @generated
	 */
	EEnum getParticipationTargetLocation();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.ParticipationTargetSubject <em>Participation Target Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participation Target Subject</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ParticipationTargetSubject
	 * @generated
	 */
	EEnum getParticipationTargetSubject();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType <em>Participation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participation Type</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType
	 * @generated
	 */
	EEnum getParticipationType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse <em>Postal Address Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Postal Address Use</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse
	 * @generated
	 */
	EEnum getPostalAddressUse();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.RoleClass <em>Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Class</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.RoleClass
	 * @generated
	 */
	EEnum getRoleClass();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssignedEntity <em>Role Class Assigned Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Class Assigned Entity</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssignedEntity
	 * @generated
	 */
	EEnum getRoleClassAssignedEntity();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssociative <em>Role Class Associative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Class Associative</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssociative
	 * @generated
	 */
	EEnum getRoleClassAssociative();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.RoleClassManufacturedProduct <em>Role Class Manufactured Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Class Manufactured Product</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.RoleClassManufacturedProduct
	 * @generated
	 */
	EEnum getRoleClassManufacturedProduct();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.RoleClassMutualRelationship <em>Role Class Mutual Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Class Mutual Relationship</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.RoleClassMutualRelationship
	 * @generated
	 */
	EEnum getRoleClassMutualRelationship();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot <em>Role Class Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Class Root</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot
	 * @generated
	 */
	EEnum getRoleClassRoot();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.RoleClassServiceDeliveryLocation <em>Role Class Service Delivery Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Class Service Delivery Location</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.RoleClassServiceDeliveryLocation
	 * @generated
	 */
	EEnum getRoleClassServiceDeliveryLocation();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.RoleClassSpecimen <em>Role Class Specimen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Class Specimen</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.RoleClassSpecimen
	 * @generated
	 */
	EEnum getRoleClassSpecimen();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.SetOperator <em>Set Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Set Operator</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.SetOperator
	 * @generated
	 */
	EEnum getSetOperator();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.TelecommunicationAddressUse <em>Telecommunication Address Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Telecommunication Address Use</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.TelecommunicationAddressUse
	 * @generated
	 */
	EEnum getTelecommunicationAddressUse();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct <em>xAct Class Document Entry Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>xAct Class Document Entry Act</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct
	 * @generated
	 */
	EEnum getx_ActClassDocumentEntryAct();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryOrganizer <em>xAct Class Document Entry Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>xAct Class Document Entry Organizer</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryOrganizer
	 * @generated
	 */
	EEnum getx_ActClassDocumentEntryOrganizer();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation <em>xAct Mood Document Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>xAct Mood Document Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation
	 * @generated
	 */
	EEnum getx_ActMoodDocumentObservation();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipDocument <em>xAct Relationship Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>xAct Relationship Document</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipDocument
	 * @generated
	 */
	EEnum getx_ActRelationshipDocument();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntry <em>xAct Relationship Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>xAct Relationship Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntry
	 * @generated
	 */
	EEnum getx_ActRelationshipEntry();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship <em>xAct Relationship Entry Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>xAct Relationship Entry Relationship</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship
	 * @generated
	 */
	EEnum getx_ActRelationshipEntryRelationship();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference <em>xAct Relationship External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>xAct Relationship External Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference
	 * @generated
	 */
	EEnum getx_ActRelationshipExternalReference();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood <em>xDocument Act Mood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>xDocument Act Mood</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood
	 * @generated
	 */
	EEnum getx_DocumentActMood();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentEncounterMood <em>xDocument Encounter Mood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>xDocument Encounter Mood</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentEncounterMood
	 * @generated
	 */
	EEnum getx_DocumentEncounterMood();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentProcedureMood <em>xDocument Procedure Mood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>xDocument Procedure Mood</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentProcedureMood
	 * @generated
	 */
	EEnum getx_DocumentProcedureMood();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubject <em>xDocument Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>xDocument Subject</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubject
	 * @generated
	 */
	EEnum getx_DocumentSubject();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood <em>xDocument Substance Mood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>xDocument Substance Mood</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood
	 * @generated
	 */
	EEnum getx_DocumentSubstanceMood();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_EncounterParticipant <em>xEncounter Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>xEncounter Participant</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_EncounterParticipant
	 * @generated
	 */
	EEnum getx_EncounterParticipant();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_InformationRecipient <em>xInformation Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>xInformation Recipient</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_InformationRecipient
	 * @generated
	 */
	EEnum getx_InformationRecipient();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_InformationRecipientRole <em>xInformation Recipient Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>xInformation Recipient Role</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_InformationRecipientRole
	 * @generated
	 */
	EEnum getx_InformationRecipientRole();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.x_ServiceEventPerformer <em>xService Event Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>xService Event Performer</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.x_ServiceEventPerformer
	 * @generated
	 */
	EEnum getx_ServiceEventPerformer();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.vocab.TimingEvent <em>Timing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Timing Event</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.TimingEvent
	 * @generated
	 */
	EEnum getTimingEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VocabFactory getVocabFactory();

} //VocabPackage
