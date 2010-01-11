/*******************************************************************************
 * Copyright (c) 2009, 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ncr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.ncr.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NCRFactoryImpl extends EFactoryImpl implements NCRFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NCRFactory init() {
		try {
			NCRFactory theNCRFactory = (NCRFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ncr"); 
			if (theNCRFactory != null) {
				return theNCRFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NCRFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NCRFactoryImpl() {
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
			case NCRPackage.NEONATAL_CARE_REPORT: return createNeonatalCareReport();
			case NCRPackage.NEONATAL_ICU_ENCOUNTER_ACTIVITY: return createNeonatalICUEncounterActivity();
			case NCRPackage.PATIENT_DATA_SECTION_NCR: return createPatientDataSectionNCR();
			case NCRPackage.PATIENT_DATA_SECTION: return createPatientDataSection();
			case NCRPackage.ENCOUNTERS_SECTION: return createEncountersSection();
			case NCRPackage.ACUITY_DATA_SECTION: return createAcuityDataSection();
			case NCRPackage.BIRTH_WEIGHT: return createBirthWeight();
			case NCRPackage.NEONATAL_ICU_LOCATION: return createNeonatalICULocation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeonatalCareReport createNeonatalCareReport() {
		NeonatalCareReportImpl neonatalCareReport = new NeonatalCareReportImpl();
		return neonatalCareReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeonatalICUEncounterActivity createNeonatalICUEncounterActivity() {
		NeonatalICUEncounterActivityImpl neonatalICUEncounterActivity = new NeonatalICUEncounterActivityImpl();
		return neonatalICUEncounterActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientDataSectionNCR createPatientDataSectionNCR() {
		PatientDataSectionNCRImpl patientDataSectionNCR = new PatientDataSectionNCRImpl();
		return patientDataSectionNCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientDataSection createPatientDataSection() {
		PatientDataSectionImpl patientDataSection = new PatientDataSectionImpl();
		return patientDataSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSection createEncountersSection() {
		EncountersSectionImpl encountersSection = new EncountersSectionImpl();
		return encountersSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcuityDataSection createAcuityDataSection() {
		AcuityDataSectionImpl acuityDataSection = new AcuityDataSectionImpl();
		return acuityDataSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BirthWeight createBirthWeight() {
		BirthWeightImpl birthWeight = new BirthWeightImpl();
		return birthWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeonatalICULocation createNeonatalICULocation() {
		NeonatalICULocationImpl neonatalICULocation = new NeonatalICULocationImpl();
		return neonatalICULocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NCRPackage getNCRPackage() {
		return (NCRPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NCRPackage getPackage() {
		return NCRPackage.eINSTANCE;
	}

} //NCRFactoryImpl
