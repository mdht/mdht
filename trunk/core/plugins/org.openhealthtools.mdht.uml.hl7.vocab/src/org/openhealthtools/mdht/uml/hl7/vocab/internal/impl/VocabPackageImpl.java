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

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.openhealthtools.mdht.uml.hl7.vocab.VocabFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VocabPackageImpl extends EPackageImpl implements VocabPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "vocab.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actClassClinicalDocumentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actClassDocumentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actClassObservationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actClassRootEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actClassSupplyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actMoodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actRelationshipFulfillsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actRelationshipHasComponentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actRelationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum addressPartTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum calendarCycleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compressionAlgorithmEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contextControlEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityClassDeviceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityClassManufacturedMaterialEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityClassOrganizationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityClassPlaceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityClassRootEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityDeterminerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityDeterminerDeterminedEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityNamePartQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityNamePartTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityNameUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum integrityCheckAlgorithmEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nullFlavorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participationPhysicalPerformerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participationTargetLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participationTargetSubjectEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum postalAddressUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleClassAssignedEntityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleClassAssociativeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleClassManufacturedProductEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleClassMutualRelationshipEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleClassRootEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleClassServiceDeliveryLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleClassSpecimenEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum setOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum telecommunicationAddressUseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum x_ActClassDocumentEntryActEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum x_ActClassDocumentEntryOrganizerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum x_ActMoodDocumentObservationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum x_ActRelationshipDocumentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum x_ActRelationshipEntryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum x_ActRelationshipEntryRelationshipEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum x_ActRelationshipExternalReferenceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum x_DocumentActMoodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum x_DocumentEncounterMoodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum x_DocumentProcedureMoodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum x_DocumentSubjectEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum x_DocumentSubstanceMoodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum x_EncounterParticipantEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum x_InformationRecipientEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum x_InformationRecipientRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum x_ServiceEventPerformerEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VocabPackageImpl() {
		super(eNS_URI, VocabFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static VocabPackage init() {
		if (isInited) return (VocabPackage)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI);

		// Obtain or create and register package
		VocabPackageImpl theVocabPackage = (VocabPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof VocabPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new VocabPackageImpl());

		isInited = true;

		// Load packages
		theVocabPackage.loadPackage();

		// Fix loaded packages
		theVocabPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theVocabPackage.freeze();

		return theVocabPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActClass() {
		if (actClassEEnum == null) {
			actClassEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(0);
		}
		return actClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActClassClinicalDocument() {
		if (actClassClinicalDocumentEEnum == null) {
			actClassClinicalDocumentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(1);
		}
		return actClassClinicalDocumentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActClassDocument() {
		if (actClassDocumentEEnum == null) {
			actClassDocumentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(2);
		}
		return actClassDocumentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActClassObservation() {
		if (actClassObservationEEnum == null) {
			actClassObservationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(3);
		}
		return actClassObservationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActClassRoot() {
		if (actClassRootEEnum == null) {
			actClassRootEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(4);
		}
		return actClassRootEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActClassSupply() {
		if (actClassSupplyEEnum == null) {
			actClassSupplyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(5);
		}
		return actClassSupplyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActMood() {
		if (actMoodEEnum == null) {
			actMoodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(6);
		}
		return actMoodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActRelationshipFulfills() {
		if (actRelationshipFulfillsEEnum == null) {
			actRelationshipFulfillsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(7);
		}
		return actRelationshipFulfillsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActRelationshipHasComponent() {
		if (actRelationshipHasComponentEEnum == null) {
			actRelationshipHasComponentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(8);
		}
		return actRelationshipHasComponentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActRelationshipType() {
		if (actRelationshipTypeEEnum == null) {
			actRelationshipTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(9);
		}
		return actRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAddressPartType() {
		if (addressPartTypeEEnum == null) {
			addressPartTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(10);
		}
		return addressPartTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCalendarCycle() {
		if (calendarCycleEEnum == null) {
			calendarCycleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(11);
		}
		return calendarCycleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompressionAlgorithm() {
		if (compressionAlgorithmEEnum == null) {
			compressionAlgorithmEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(12);
		}
		return compressionAlgorithmEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContextControl() {
		if (contextControlEEnum == null) {
			contextControlEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(13);
		}
		return contextControlEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityClass() {
		if (entityClassEEnum == null) {
			entityClassEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(14);
		}
		return entityClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityClassDevice() {
		if (entityClassDeviceEEnum == null) {
			entityClassDeviceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(15);
		}
		return entityClassDeviceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityClassManufacturedMaterial() {
		if (entityClassManufacturedMaterialEEnum == null) {
			entityClassManufacturedMaterialEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(16);
		}
		return entityClassManufacturedMaterialEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityClassOrganization() {
		if (entityClassOrganizationEEnum == null) {
			entityClassOrganizationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(17);
		}
		return entityClassOrganizationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityClassPlace() {
		if (entityClassPlaceEEnum == null) {
			entityClassPlaceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(18);
		}
		return entityClassPlaceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityClassRoot() {
		if (entityClassRootEEnum == null) {
			entityClassRootEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(19);
		}
		return entityClassRootEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityDeterminer() {
		if (entityDeterminerEEnum == null) {
			entityDeterminerEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(20);
		}
		return entityDeterminerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityDeterminerDetermined() {
		if (entityDeterminerDeterminedEEnum == null) {
			entityDeterminerDeterminedEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(21);
		}
		return entityDeterminerDeterminedEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityNamePartQualifier() {
		if (entityNamePartQualifierEEnum == null) {
			entityNamePartQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(22);
		}
		return entityNamePartQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityNamePartType() {
		if (entityNamePartTypeEEnum == null) {
			entityNamePartTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(23);
		}
		return entityNamePartTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityNameUse() {
		if (entityNameUseEEnum == null) {
			entityNameUseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(24);
		}
		return entityNameUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntegrityCheckAlgorithm() {
		if (integrityCheckAlgorithmEEnum == null) {
			integrityCheckAlgorithmEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(25);
		}
		return integrityCheckAlgorithmEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNullFlavor() {
		if (nullFlavorEEnum == null) {
			nullFlavorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(26);
		}
		return nullFlavorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParticipationPhysicalPerformer() {
		if (participationPhysicalPerformerEEnum == null) {
			participationPhysicalPerformerEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(27);
		}
		return participationPhysicalPerformerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParticipationTargetLocation() {
		if (participationTargetLocationEEnum == null) {
			participationTargetLocationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(28);
		}
		return participationTargetLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParticipationTargetSubject() {
		if (participationTargetSubjectEEnum == null) {
			participationTargetSubjectEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(29);
		}
		return participationTargetSubjectEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParticipationType() {
		if (participationTypeEEnum == null) {
			participationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(30);
		}
		return participationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPostalAddressUse() {
		if (postalAddressUseEEnum == null) {
			postalAddressUseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(31);
		}
		return postalAddressUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoleClass() {
		if (roleClassEEnum == null) {
			roleClassEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(32);
		}
		return roleClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoleClassAssignedEntity() {
		if (roleClassAssignedEntityEEnum == null) {
			roleClassAssignedEntityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(33);
		}
		return roleClassAssignedEntityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoleClassAssociative() {
		if (roleClassAssociativeEEnum == null) {
			roleClassAssociativeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(34);
		}
		return roleClassAssociativeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoleClassManufacturedProduct() {
		if (roleClassManufacturedProductEEnum == null) {
			roleClassManufacturedProductEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(35);
		}
		return roleClassManufacturedProductEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoleClassMutualRelationship() {
		if (roleClassMutualRelationshipEEnum == null) {
			roleClassMutualRelationshipEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(36);
		}
		return roleClassMutualRelationshipEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoleClassRoot() {
		if (roleClassRootEEnum == null) {
			roleClassRootEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(37);
		}
		return roleClassRootEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoleClassServiceDeliveryLocation() {
		if (roleClassServiceDeliveryLocationEEnum == null) {
			roleClassServiceDeliveryLocationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(38);
		}
		return roleClassServiceDeliveryLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoleClassSpecimen() {
		if (roleClassSpecimenEEnum == null) {
			roleClassSpecimenEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(39);
		}
		return roleClassSpecimenEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSetOperator() {
		if (setOperatorEEnum == null) {
			setOperatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(40);
		}
		return setOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTelecommunicationAddressUse() {
		if (telecommunicationAddressUseEEnum == null) {
			telecommunicationAddressUseEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(41);
		}
		return telecommunicationAddressUseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getx_ActClassDocumentEntryAct() {
		if (x_ActClassDocumentEntryActEEnum == null) {
			x_ActClassDocumentEntryActEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(42);
		}
		return x_ActClassDocumentEntryActEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getx_ActClassDocumentEntryOrganizer() {
		if (x_ActClassDocumentEntryOrganizerEEnum == null) {
			x_ActClassDocumentEntryOrganizerEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(43);
		}
		return x_ActClassDocumentEntryOrganizerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getx_ActMoodDocumentObservation() {
		if (x_ActMoodDocumentObservationEEnum == null) {
			x_ActMoodDocumentObservationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(44);
		}
		return x_ActMoodDocumentObservationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getx_ActRelationshipDocument() {
		if (x_ActRelationshipDocumentEEnum == null) {
			x_ActRelationshipDocumentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(45);
		}
		return x_ActRelationshipDocumentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getx_ActRelationshipEntry() {
		if (x_ActRelationshipEntryEEnum == null) {
			x_ActRelationshipEntryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(46);
		}
		return x_ActRelationshipEntryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getx_ActRelationshipEntryRelationship() {
		if (x_ActRelationshipEntryRelationshipEEnum == null) {
			x_ActRelationshipEntryRelationshipEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(47);
		}
		return x_ActRelationshipEntryRelationshipEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getx_ActRelationshipExternalReference() {
		if (x_ActRelationshipExternalReferenceEEnum == null) {
			x_ActRelationshipExternalReferenceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(48);
		}
		return x_ActRelationshipExternalReferenceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getx_DocumentActMood() {
		if (x_DocumentActMoodEEnum == null) {
			x_DocumentActMoodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(49);
		}
		return x_DocumentActMoodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getx_DocumentEncounterMood() {
		if (x_DocumentEncounterMoodEEnum == null) {
			x_DocumentEncounterMoodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(50);
		}
		return x_DocumentEncounterMoodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getx_DocumentProcedureMood() {
		if (x_DocumentProcedureMoodEEnum == null) {
			x_DocumentProcedureMoodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(51);
		}
		return x_DocumentProcedureMoodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getx_DocumentSubject() {
		if (x_DocumentSubjectEEnum == null) {
			x_DocumentSubjectEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(52);
		}
		return x_DocumentSubjectEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getx_DocumentSubstanceMood() {
		if (x_DocumentSubstanceMoodEEnum == null) {
			x_DocumentSubstanceMoodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(53);
		}
		return x_DocumentSubstanceMoodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getx_EncounterParticipant() {
		if (x_EncounterParticipantEEnum == null) {
			x_EncounterParticipantEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(54);
		}
		return x_EncounterParticipantEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getx_InformationRecipient() {
		if (x_InformationRecipientEEnum == null) {
			x_InformationRecipientEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(55);
		}
		return x_InformationRecipientEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getx_InformationRecipientRole() {
		if (x_InformationRecipientRoleEEnum == null) {
			x_InformationRecipientRoleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(56);
		}
		return x_InformationRecipientRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getx_ServiceEventPerformer() {
		if (x_ServiceEventPerformerEEnum == null) {
			x_ServiceEventPerformerEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI).getEClassifiers().get(57);
		}
		return x_ServiceEventPerformerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabFactory getVocabFactory() {
		return (VocabFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.openhealthtools.mdht.uml.hl7.vocab." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //VocabPackageImpl
