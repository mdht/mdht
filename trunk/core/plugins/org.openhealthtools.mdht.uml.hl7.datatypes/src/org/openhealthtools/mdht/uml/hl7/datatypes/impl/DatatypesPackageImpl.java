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
package org.openhealthtools.mdht.uml.hl7.datatypes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.uml.hl7.datatypes.BinaryDataEncoding;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event;
import org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesValidator;
import org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesPackageImpl extends EPackageImpl implements DatatypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sxcM_TSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qtyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adxpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ivL_TSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ivxB_TSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pqrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enxpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtO_QTY_QTYEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sxcM_INTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ivxB_INTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ivL_INTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ivxB_PQEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sxcM_PQEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ivL_PQEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtO_PQ_PQEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pivL_TSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eivL_eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eivL_TSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryDataEncodingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uidEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stTypeEDataType = null;

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
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatatypesPackageImpl() {
		super(eNS_URI, DatatypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DatatypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatatypesPackage init() {
		if (isInited) return (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);

		// Obtain or create and register package
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatatypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		VocabPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theDatatypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDatatypesPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DatatypesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDatatypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatatypesPackage.eNS_URI, theDatatypesPackage);
		return theDatatypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANY() {
		return anyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getANY_NullFlavor() {
		return (EAttribute)anyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBIN() {
		return binEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBIN_Representation() {
		return (EAttribute)binEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getED() {
		return edEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getED_Mixed() {
		return (EAttribute)edEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getED_Reference() {
		return (EReference)edEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getED_Thumbnail() {
		return (EReference)edEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getED_MediaType() {
		return (EAttribute)edEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getED_Language() {
		return (EAttribute)edEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getED_Compression() {
		return (EAttribute)edEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getED_IntegrityCheck() {
		return (EAttribute)edEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getED_IntegrityCheckAlgorithm() {
		return (EAttribute)edEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTEL() {
		return telEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTEL_UseablePeriod() {
		return (EReference)telEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEL_Use() {
		return (EAttribute)telEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURL() {
		return urlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURL_Value() {
		return (EAttribute)urlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSXCM_TS() {
		return sxcM_TSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSXCM_TS_Operator() {
		return (EAttribute)sxcM_TSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTS() {
		return tsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTS_Value() {
		return (EAttribute)tsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQTY() {
		return qtyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getST() {
		return stEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCD() {
		return cdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCD_OriginalText() {
		return (EReference)cdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCD_Qualifier() {
		return (EReference)cdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCD_Translation() {
		return (EReference)cdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCD_Code() {
		return (EAttribute)cdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCD_CodeSystem() {
		return (EAttribute)cdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCD_CodeSystemName() {
		return (EAttribute)cdEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCD_CodeSystemVersion() {
		return (EAttribute)cdEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCD_DisplayName() {
		return (EAttribute)cdEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCR() {
		return crEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCR_Name() {
		return (EReference)crEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCR_Value() {
		return (EReference)crEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCR_Inverted() {
		return (EAttribute)crEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCV() {
		return cvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCE() {
		return ceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getII() {
		return iiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getII_Root() {
		return (EAttribute)iiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getII_Extension() {
		return (EAttribute)iiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getII_AssigningAuthorityName() {
		return (EAttribute)iiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getII_Displayable() {
		return (EAttribute)iiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBL() {
		return blEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBL_Value() {
		return (EAttribute)blEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBN() {
		return bnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAD() {
		return adEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_UseablePeriod() {
		return (EReference)adEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAD_Use() {
		return (EAttribute)adEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAD_IsNotOrdered() {
		return (EAttribute)adEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_Delimiter() {
		return (EReference)adEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_Country() {
		return (EReference)adEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_State() {
		return (EReference)adEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_County() {
		return (EReference)adEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_City() {
		return (EReference)adEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_PostalCode() {
		return (EReference)adEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_StreetAddressLine() {
		return (EReference)adEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_HouseNumber() {
		return (EReference)adEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_HouseNumberNumeric() {
		return (EReference)adEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_Direction() {
		return (EReference)adEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_StreetName() {
		return (EReference)adEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_StreetNameBase() {
		return (EReference)adEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_StreetNameType() {
		return (EReference)adEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_AdditionalLocator() {
		return (EReference)adEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_UnitID() {
		return (EReference)adEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_UnitType() {
		return (EReference)adEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_CareOf() {
		return (EReference)adEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_CensusTract() {
		return (EReference)adEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_DeliveryAddressLine() {
		return (EReference)adEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_DeliveryInstallationType() {
		return (EReference)adEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_DeliveryInstallationArea() {
		return (EReference)adEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_DeliveryInstallationQualifier() {
		return (EReference)adEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_DeliveryMode() {
		return (EReference)adEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_DeliveryModeIdentifier() {
		return (EReference)adEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_BuildingNumberSuffix() {
		return (EReference)adEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_PostBox() {
		return (EReference)adEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAD_Precinct() {
		return (EReference)adEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAD_Part() {
		return (EAttribute)adEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAD_Mixed() {
		return (EAttribute)adEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADXP() {
		return adxpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADXP_PartType() {
		return (EAttribute)adxpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEN() {
		return enEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEN_Use() {
		return (EAttribute)enEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEN_ValidTime() {
		return (EReference)enEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEN_Delimiter() {
		return (EReference)enEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEN_Family() {
		return (EReference)enEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEN_Given() {
		return (EReference)enEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEN_Prefix() {
		return (EReference)enEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEN_Suffix() {
		return (EReference)enEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEN_Part() {
		return (EAttribute)enEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEN_Mixed() {
		return (EAttribute)enEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIVL_TS() {
		return ivL_TSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVL_TS_Low() {
		return (EReference)ivL_TSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVL_TS_Center() {
		return (EReference)ivL_TSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVL_TS_High() {
		return (EReference)ivL_TSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVL_TS_Width() {
		return (EReference)ivL_TSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIVXB_TS() {
		return ivxB_TSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIVXB_TS_Inclusive() {
		return (EAttribute)ivxB_TSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPQ() {
		return pqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPQ_Value() {
		return (EAttribute)pqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPQ_Unit() {
		return (EAttribute)pqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPQ_Translation() {
		return (EReference)pqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPQR() {
		return pqrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPQR_Value() {
		return (EAttribute)pqrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getENXP() {
		return enxpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENXP_PartType() {
		return (EAttribute)enxpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENXP_Qualifier() {
		return (EAttribute)enxpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getON() {
		return onEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPN() {
		return pnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTN() {
		return tnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINT() {
		return intEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINT_Value() {
		return (EAttribute)intEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREAL() {
		return realEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREAL_Value() {
		return (EAttribute)realEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCS() {
		return csEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCO() {
		return coEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSC() {
		return scEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSC_Code() {
		return (EAttribute)scEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSC_CodeSystem() {
		return (EAttribute)scEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSC_CodeSystemName() {
		return (EAttribute)scEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSC_CodeSystemVersion() {
		return (EAttribute)scEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSC_DisplayName() {
		return (EAttribute)scEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTO_QTY_QTY() {
		return rtO_QTY_QTYEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTO_QTY_QTY_Numerator() {
		return (EReference)rtO_QTY_QTYEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTO_QTY_QTY_Denominator() {
		return (EReference)rtO_QTY_QTYEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMO() {
		return moEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMO_Value() {
		return (EAttribute)moEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMO_Currency() {
		return (EAttribute)moEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTO() {
		return rtoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSXCM_INT() {
		return sxcM_INTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSXCM_INT_Operator() {
		return (EAttribute)sxcM_INTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIVXB_INT() {
		return ivxB_INTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIVXB_INT_Inclusive() {
		return (EAttribute)ivxB_INTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIVL_INT() {
		return ivL_INTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVL_INT_Low() {
		return (EReference)ivL_INTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVL_INT_Center() {
		return (EReference)ivL_INTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVL_INT_High() {
		return (EReference)ivL_INTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVL_INT_Width() {
		return (EReference)ivL_INTEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIVXB_PQ() {
		return ivxB_PQEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIVXB_PQ_Inclusive() {
		return (EAttribute)ivxB_PQEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSXCM_PQ() {
		return sxcM_PQEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSXCM_PQ_Operator() {
		return (EAttribute)sxcM_PQEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIVL_PQ() {
		return ivL_PQEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVL_PQ_Low() {
		return (EReference)ivL_PQEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVL_PQ_Center() {
		return (EReference)ivL_PQEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVL_PQ_High() {
		return (EReference)ivL_PQEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIVL_PQ_Width() {
		return (EReference)ivL_PQEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTO_PQ_PQ() {
		return rtO_PQ_PQEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTO_PQ_PQ_Numerator() {
		return (EReference)rtO_PQ_PQEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTO_PQ_PQ_Denominator() {
		return (EReference)rtO_PQ_PQEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPIVL_TS() {
		return pivL_TSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPIVL_TS_Phase() {
		return (EReference)pivL_TSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPIVL_TS_Period() {
		return (EReference)pivL_TSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPIVL_TS_Alignment() {
		return (EAttribute)pivL_TSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPIVL_TS_InstitutionSpecified() {
		return (EAttribute)pivL_TSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEIVL_event() {
		return eivL_eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEIVL_TS() {
		return eivL_TSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEIVL_TS_Event() {
		return (EReference)eivL_TSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEIVL_TS_Offset() {
		return (EReference)eivL_TSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryDataEncoding() {
		return binaryDataEncodingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getuid() {
		return uidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getstType() {
		return stTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesFactory getDatatypesFactory() {
		return (DatatypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		anyEClass = createEClass(ANY);
		createEAttribute(anyEClass, ANY__NULL_FLAVOR);

		binEClass = createEClass(BIN);
		createEAttribute(binEClass, BIN__REPRESENTATION);

		edEClass = createEClass(ED);
		createEAttribute(edEClass, ED__MIXED);
		createEReference(edEClass, ED__REFERENCE);
		createEReference(edEClass, ED__THUMBNAIL);
		createEAttribute(edEClass, ED__MEDIA_TYPE);
		createEAttribute(edEClass, ED__LANGUAGE);
		createEAttribute(edEClass, ED__COMPRESSION);
		createEAttribute(edEClass, ED__INTEGRITY_CHECK);
		createEAttribute(edEClass, ED__INTEGRITY_CHECK_ALGORITHM);

		telEClass = createEClass(TEL);
		createEReference(telEClass, TEL__USEABLE_PERIOD);
		createEAttribute(telEClass, TEL__USE);

		urlEClass = createEClass(URL);
		createEAttribute(urlEClass, URL__VALUE);

		sxcM_TSEClass = createEClass(SXCM_TS);
		createEAttribute(sxcM_TSEClass, SXCM_TS__OPERATOR);

		tsEClass = createEClass(TS);
		createEAttribute(tsEClass, TS__VALUE);

		qtyEClass = createEClass(QTY);

		stEClass = createEClass(ST);

		cdEClass = createEClass(CD);
		createEReference(cdEClass, CD__ORIGINAL_TEXT);
		createEReference(cdEClass, CD__QUALIFIER);
		createEReference(cdEClass, CD__TRANSLATION);
		createEAttribute(cdEClass, CD__CODE);
		createEAttribute(cdEClass, CD__CODE_SYSTEM);
		createEAttribute(cdEClass, CD__CODE_SYSTEM_NAME);
		createEAttribute(cdEClass, CD__CODE_SYSTEM_VERSION);
		createEAttribute(cdEClass, CD__DISPLAY_NAME);

		crEClass = createEClass(CR);
		createEReference(crEClass, CR__NAME);
		createEReference(crEClass, CR__VALUE);
		createEAttribute(crEClass, CR__INVERTED);

		cvEClass = createEClass(CV);

		ceEClass = createEClass(CE);

		iiEClass = createEClass(II);
		createEAttribute(iiEClass, II__ROOT);
		createEAttribute(iiEClass, II__EXTENSION);
		createEAttribute(iiEClass, II__ASSIGNING_AUTHORITY_NAME);
		createEAttribute(iiEClass, II__DISPLAYABLE);

		blEClass = createEClass(BL);
		createEAttribute(blEClass, BL__VALUE);

		bnEClass = createEClass(BN);

		adEClass = createEClass(AD);
		createEReference(adEClass, AD__DELIMITER);
		createEReference(adEClass, AD__COUNTRY);
		createEReference(adEClass, AD__STATE);
		createEReference(adEClass, AD__COUNTY);
		createEReference(adEClass, AD__CITY);
		createEReference(adEClass, AD__POSTAL_CODE);
		createEReference(adEClass, AD__STREET_ADDRESS_LINE);
		createEReference(adEClass, AD__HOUSE_NUMBER);
		createEReference(adEClass, AD__HOUSE_NUMBER_NUMERIC);
		createEReference(adEClass, AD__DIRECTION);
		createEReference(adEClass, AD__STREET_NAME);
		createEReference(adEClass, AD__STREET_NAME_BASE);
		createEReference(adEClass, AD__STREET_NAME_TYPE);
		createEReference(adEClass, AD__ADDITIONAL_LOCATOR);
		createEReference(adEClass, AD__UNIT_ID);
		createEReference(adEClass, AD__UNIT_TYPE);
		createEReference(adEClass, AD__CARE_OF);
		createEReference(adEClass, AD__CENSUS_TRACT);
		createEReference(adEClass, AD__DELIVERY_ADDRESS_LINE);
		createEReference(adEClass, AD__DELIVERY_INSTALLATION_TYPE);
		createEReference(adEClass, AD__DELIVERY_INSTALLATION_AREA);
		createEReference(adEClass, AD__DELIVERY_INSTALLATION_QUALIFIER);
		createEReference(adEClass, AD__DELIVERY_MODE);
		createEReference(adEClass, AD__DELIVERY_MODE_IDENTIFIER);
		createEReference(adEClass, AD__BUILDING_NUMBER_SUFFIX);
		createEReference(adEClass, AD__POST_BOX);
		createEReference(adEClass, AD__PRECINCT);
		createEAttribute(adEClass, AD__PART);
		createEReference(adEClass, AD__USEABLE_PERIOD);
		createEAttribute(adEClass, AD__USE);
		createEAttribute(adEClass, AD__IS_NOT_ORDERED);
		createEAttribute(adEClass, AD__MIXED);

		adxpEClass = createEClass(ADXP);
		createEAttribute(adxpEClass, ADXP__PART_TYPE);

		enEClass = createEClass(EN);
		createEReference(enEClass, EN__DELIMITER);
		createEReference(enEClass, EN__FAMILY);
		createEReference(enEClass, EN__GIVEN);
		createEReference(enEClass, EN__PREFIX);
		createEReference(enEClass, EN__SUFFIX);
		createEAttribute(enEClass, EN__PART);
		createEReference(enEClass, EN__VALID_TIME);
		createEAttribute(enEClass, EN__USE);
		createEAttribute(enEClass, EN__MIXED);

		enxpEClass = createEClass(ENXP);
		createEAttribute(enxpEClass, ENXP__PART_TYPE);
		createEAttribute(enxpEClass, ENXP__QUALIFIER);

		ivL_TSEClass = createEClass(IVL_TS);
		createEReference(ivL_TSEClass, IVL_TS__LOW);
		createEReference(ivL_TSEClass, IVL_TS__CENTER);
		createEReference(ivL_TSEClass, IVL_TS__HIGH);
		createEReference(ivL_TSEClass, IVL_TS__WIDTH);

		ivxB_TSEClass = createEClass(IVXB_TS);
		createEAttribute(ivxB_TSEClass, IVXB_TS__INCLUSIVE);

		pqEClass = createEClass(PQ);
		createEAttribute(pqEClass, PQ__VALUE);
		createEAttribute(pqEClass, PQ__UNIT);
		createEReference(pqEClass, PQ__TRANSLATION);

		pqrEClass = createEClass(PQR);
		createEAttribute(pqrEClass, PQR__VALUE);

		onEClass = createEClass(ON);

		pnEClass = createEClass(PN);

		tnEClass = createEClass(TN);

		intEClass = createEClass(INT);
		createEAttribute(intEClass, INT__VALUE);

		realEClass = createEClass(REAL);
		createEAttribute(realEClass, REAL__VALUE);

		csEClass = createEClass(CS);

		coEClass = createEClass(CO);

		scEClass = createEClass(SC);
		createEAttribute(scEClass, SC__CODE);
		createEAttribute(scEClass, SC__CODE_SYSTEM);
		createEAttribute(scEClass, SC__CODE_SYSTEM_NAME);
		createEAttribute(scEClass, SC__CODE_SYSTEM_VERSION);
		createEAttribute(scEClass, SC__DISPLAY_NAME);

		rtO_QTY_QTYEClass = createEClass(RTO_QTY_QTY);
		createEReference(rtO_QTY_QTYEClass, RTO_QTY_QTY__NUMERATOR);
		createEReference(rtO_QTY_QTYEClass, RTO_QTY_QTY__DENOMINATOR);

		moEClass = createEClass(MO);
		createEAttribute(moEClass, MO__VALUE);
		createEAttribute(moEClass, MO__CURRENCY);

		rtoEClass = createEClass(RTO);

		sxcM_INTEClass = createEClass(SXCM_INT);
		createEAttribute(sxcM_INTEClass, SXCM_INT__OPERATOR);

		ivxB_INTEClass = createEClass(IVXB_INT);
		createEAttribute(ivxB_INTEClass, IVXB_INT__INCLUSIVE);

		ivL_INTEClass = createEClass(IVL_INT);
		createEReference(ivL_INTEClass, IVL_INT__LOW);
		createEReference(ivL_INTEClass, IVL_INT__CENTER);
		createEReference(ivL_INTEClass, IVL_INT__HIGH);
		createEReference(ivL_INTEClass, IVL_INT__WIDTH);

		ivxB_PQEClass = createEClass(IVXB_PQ);
		createEAttribute(ivxB_PQEClass, IVXB_PQ__INCLUSIVE);

		sxcM_PQEClass = createEClass(SXCM_PQ);
		createEAttribute(sxcM_PQEClass, SXCM_PQ__OPERATOR);

		ivL_PQEClass = createEClass(IVL_PQ);
		createEReference(ivL_PQEClass, IVL_PQ__LOW);
		createEReference(ivL_PQEClass, IVL_PQ__CENTER);
		createEReference(ivL_PQEClass, IVL_PQ__HIGH);
		createEReference(ivL_PQEClass, IVL_PQ__WIDTH);

		rtO_PQ_PQEClass = createEClass(RTO_PQ_PQ);
		createEReference(rtO_PQ_PQEClass, RTO_PQ_PQ__NUMERATOR);
		createEReference(rtO_PQ_PQEClass, RTO_PQ_PQ__DENOMINATOR);

		pivL_TSEClass = createEClass(PIVL_TS);
		createEReference(pivL_TSEClass, PIVL_TS__PHASE);
		createEReference(pivL_TSEClass, PIVL_TS__PERIOD);
		createEAttribute(pivL_TSEClass, PIVL_TS__ALIGNMENT);
		createEAttribute(pivL_TSEClass, PIVL_TS__INSTITUTION_SPECIFIED);

		eivL_eventEClass = createEClass(EIVL_EVENT);

		eivL_TSEClass = createEClass(EIVL_TS);
		createEReference(eivL_TSEClass, EIVL_TS__EVENT);
		createEReference(eivL_TSEClass, EIVL_TS__OFFSET);

		// Create enums
		binaryDataEncodingEEnum = createEEnum(BINARY_DATA_ENCODING);

		// Create data types
		uidEDataType = createEDataType(UID);
		stTypeEDataType = createEDataType(ST_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		VocabPackage theVocabPackage = (VocabPackage)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		binEClass.getESuperTypes().add(this.getANY());
		edEClass.getESuperTypes().add(this.getBIN());
		telEClass.getESuperTypes().add(this.getURL());
		urlEClass.getESuperTypes().add(this.getANY());
		sxcM_TSEClass.getESuperTypes().add(this.getTS());
		tsEClass.getESuperTypes().add(this.getQTY());
		qtyEClass.getESuperTypes().add(this.getANY());
		stEClass.getESuperTypes().add(this.getED());
		cdEClass.getESuperTypes().add(this.getANY());
		crEClass.getESuperTypes().add(this.getANY());
		cvEClass.getESuperTypes().add(this.getCE());
		ceEClass.getESuperTypes().add(this.getCD());
		iiEClass.getESuperTypes().add(this.getANY());
		blEClass.getESuperTypes().add(this.getANY());
		bnEClass.getESuperTypes().add(this.getBL());
		adEClass.getESuperTypes().add(this.getANY());
		adxpEClass.getESuperTypes().add(this.getST());
		enEClass.getESuperTypes().add(this.getANY());
		enxpEClass.getESuperTypes().add(this.getST());
		ivL_TSEClass.getESuperTypes().add(this.getSXCM_TS());
		ivxB_TSEClass.getESuperTypes().add(this.getTS());
		pqEClass.getESuperTypes().add(this.getQTY());
		pqrEClass.getESuperTypes().add(this.getCV());
		onEClass.getESuperTypes().add(this.getEN());
		pnEClass.getESuperTypes().add(this.getEN());
		tnEClass.getESuperTypes().add(this.getEN());
		intEClass.getESuperTypes().add(this.getQTY());
		realEClass.getESuperTypes().add(this.getQTY());
		csEClass.getESuperTypes().add(this.getCV());
		coEClass.getESuperTypes().add(this.getCV());
		scEClass.getESuperTypes().add(this.getST());
		rtO_QTY_QTYEClass.getESuperTypes().add(this.getQTY());
		moEClass.getESuperTypes().add(this.getQTY());
		rtoEClass.getESuperTypes().add(this.getRTO_QTY_QTY());
		sxcM_INTEClass.getESuperTypes().add(this.getINT());
		ivxB_INTEClass.getESuperTypes().add(this.getINT());
		ivL_INTEClass.getESuperTypes().add(this.getSXCM_INT());
		ivxB_PQEClass.getESuperTypes().add(this.getPQ());
		sxcM_PQEClass.getESuperTypes().add(this.getPQ());
		ivL_PQEClass.getESuperTypes().add(this.getSXCM_PQ());
		rtO_PQ_PQEClass.getESuperTypes().add(this.getQTY());
		pivL_TSEClass.getESuperTypes().add(this.getSXCM_TS());
		eivL_eventEClass.getESuperTypes().add(this.getCE());
		eivL_TSEClass.getESuperTypes().add(this.getSXCM_TS());

		// Initialize classes and features; add operations and parameters
		initEClass(anyEClass, org.openhealthtools.mdht.uml.hl7.datatypes.ANY.class, "ANY", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getANY_NullFlavor(), theVocabPackage.getNullFlavor(), "nullFlavor", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.ANY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(anyEClass, ecorePackage.getEBoolean(), "isNullFlavorDefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(anyEClass, ecorePackage.getEBoolean(), "isNullFlavorUndefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(anyEClass, ecorePackage.getEBoolean(), "hasContent", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = addEOperation(anyEClass, ecorePackage.getEBoolean(), "isDefined", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "featureName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(binEClass, org.openhealthtools.mdht.uml.hl7.datatypes.BIN.class, "BIN", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBIN_Representation(), this.getBinaryDataEncoding(), "representation", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.BIN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(edEClass, org.openhealthtools.mdht.uml.hl7.datatypes.ED.class, "ED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getED_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getED_Reference(), this.getTEL(), null, "reference", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.ED.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getED_Thumbnail(), this.getED(), null, "thumbnail", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.ED.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getED_MediaType(), ecorePackage.getEString(), "mediaType", "text/plain", 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getED_Language(), ecorePackage.getEString(), "language", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getED_Compression(), theVocabPackage.getCompressionAlgorithm(), "compression", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getED_IntegrityCheck(), ecorePackage.getEByteArray(), "integrityCheck", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getED_IntegrityCheckAlgorithm(), theVocabPackage.getIntegrityCheckAlgorithm(), "integrityCheckAlgorithm", "SHA-1", 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(edEClass, ecorePackage.getEBoolean(), "validateThumbnailThumbnail", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(edEClass, this.getED(), "addText", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "text", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(edEClass, ecorePackage.getEString(), "getText", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(telEClass, org.openhealthtools.mdht.uml.hl7.datatypes.TEL.class, "TEL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTEL_UseablePeriod(), this.getSXCM_TS(), null, "useablePeriod", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.TEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTEL_Use(), theVocabPackage.getTelecommunicationAddressUse(), "use", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.TEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(urlEClass, org.openhealthtools.mdht.uml.hl7.datatypes.URL.class, "URL", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURL_Value(), ecorePackage.getEString(), "value", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.URL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sxcM_TSEClass, org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS.class, "SXCM_TS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSXCM_TS_Operator(), theVocabPackage.getSetOperator(), "operator", "I", 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tsEClass, org.openhealthtools.mdht.uml.hl7.datatypes.TS.class, "TS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTS_Value(), ecorePackage.getEString(), "value", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.TS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(qtyEClass, org.openhealthtools.mdht.uml.hl7.datatypes.QTY.class, "QTY", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stEClass, org.openhealthtools.mdht.uml.hl7.datatypes.ST.class, "ST", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(stEClass, ecorePackage.getEBoolean(), "validateThumbnail", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stEClass, ecorePackage.getEBoolean(), "validateReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stEClass, ecorePackage.getEBoolean(), "validateIntegrityCheck", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stEClass, ecorePackage.getEBoolean(), "validateIntegrityCheckAlgorithm", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stEClass, ecorePackage.getEBoolean(), "validateCompression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stEClass, ecorePackage.getEBoolean(), "validateRepresentation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stEClass, ecorePackage.getEBoolean(), "isCompressionDefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(stEClass, ecorePackage.getEBoolean(), "isIntegrityCheckAlgorithmDefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(stEClass, ecorePackage.getEBoolean(), "isRepresentationDefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(cdEClass, org.openhealthtools.mdht.uml.hl7.datatypes.CD.class, "CD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCD_OriginalText(), this.getED(), null, "originalText", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCD_Qualifier(), this.getCR(), null, "qualifier", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCD_Translation(), this.getCD(), null, "translation", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCD_Code(), ecorePackage.getEString(), "code", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCD_CodeSystem(), this.getuid(), "codeSystem", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCD_CodeSystemName(), this.getstType(), "codeSystemName", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCD_CodeSystemVersion(), this.getstType(), "codeSystemVersion", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCD_DisplayName(), this.getstType(), "displayName", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(crEClass, org.openhealthtools.mdht.uml.hl7.datatypes.CR.class, "CR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCR_Name(), this.getCV(), null, "name", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.CR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCR_Value(), this.getCD(), null, "value", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.CR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCR_Inverted(), ecorePackage.getEBoolean(), "inverted", "false", 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.CR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cvEClass, org.openhealthtools.mdht.uml.hl7.datatypes.CV.class, "CV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(cvEClass, ecorePackage.getEBoolean(), "validateTranslation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ceEClass, org.openhealthtools.mdht.uml.hl7.datatypes.CE.class, "CE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(ceEClass, ecorePackage.getEBoolean(), "validateQualifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iiEClass, org.openhealthtools.mdht.uml.hl7.datatypes.II.class, "II", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getII_Root(), this.getuid(), "root", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.II.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getII_Extension(), this.getstType(), "extension", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.II.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getII_AssigningAuthorityName(), this.getstType(), "assigningAuthorityName", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.II.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getII_Displayable(), ecorePackage.getEBooleanObject(), "displayable", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.II.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(blEClass, org.openhealthtools.mdht.uml.hl7.datatypes.BL.class, "BL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBL_Value(), ecorePackage.getEBooleanObject(), "value", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.BL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bnEClass, org.openhealthtools.mdht.uml.hl7.datatypes.BN.class, "BN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(bnEClass, ecorePackage.getEBoolean(), "validateNullFlavor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(adEClass, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, "AD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAD_Delimiter(), this.getADXP(), null, "delimiter", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_Country(), this.getADXP(), null, "country", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_State(), this.getADXP(), null, "state", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_County(), this.getADXP(), null, "county", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_City(), this.getADXP(), null, "city", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_PostalCode(), this.getADXP(), null, "postalCode", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_StreetAddressLine(), this.getADXP(), null, "streetAddressLine", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_HouseNumber(), this.getADXP(), null, "houseNumber", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_HouseNumberNumeric(), this.getADXP(), null, "houseNumberNumeric", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_Direction(), this.getADXP(), null, "direction", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_StreetName(), this.getADXP(), null, "streetName", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_StreetNameBase(), this.getADXP(), null, "streetNameBase", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_StreetNameType(), this.getADXP(), null, "streetNameType", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_AdditionalLocator(), this.getADXP(), null, "additionalLocator", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_UnitID(), this.getADXP(), null, "unitID", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_UnitType(), this.getADXP(), null, "unitType", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_CareOf(), this.getADXP(), null, "careOf", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_CensusTract(), this.getADXP(), null, "censusTract", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_DeliveryAddressLine(), this.getADXP(), null, "deliveryAddressLine", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_DeliveryInstallationType(), this.getADXP(), null, "deliveryInstallationType", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_DeliveryInstallationArea(), this.getADXP(), null, "deliveryInstallationArea", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_DeliveryInstallationQualifier(), this.getADXP(), null, "deliveryInstallationQualifier", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_DeliveryMode(), this.getADXP(), null, "deliveryMode", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_DeliveryModeIdentifier(), this.getADXP(), null, "deliveryModeIdentifier", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_BuildingNumberSuffix(), this.getADXP(), null, "buildingNumberSuffix", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_PostBox(), this.getADXP(), null, "postBox", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_Precinct(), this.getADXP(), null, "precinct", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAD_Part(), ecorePackage.getEFeatureMapEntry(), "part", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAD_UseablePeriod(), this.getSXCM_TS(), null, "useablePeriod", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAD_Use(), theVocabPackage.getPostalAddressUse(), "use", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAD_IsNotOrdered(), ecorePackage.getEBooleanObject(), "isNotOrdered", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAD_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.AD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateDelimiter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateCountry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateCounty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateCity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validatePostalCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateStreetAddressLine", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateHouseNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateHouseNumberNumeric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateDirection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateStreetName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateStreetNameBase", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateStreetNameType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateAdditionalLocator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateUnitID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateUnitType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateCareOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateCensusTract", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateDeliveryAddressLine", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateDeliveryInstallationType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateDeliveryInstallationArea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateDeliveryInstallationQualifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateDeliveryMode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateDeliveryModeIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validateBuildingNumberSuffix", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validatePostBox", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, ecorePackage.getEBoolean(), "validatePrecinct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addDelimiter", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "delimiter", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addCountry", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "country", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addState", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "state", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addCounty", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "county", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addCity", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "city", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addPostalCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "postalCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addStreetAddressLine", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "streetAddressLine", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addHouseNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "houseNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addHouseNumberNumeric", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "houseNumberNumeric", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addDirection", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "direction", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addStreetName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "streetName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addStreetNameBase", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "streetNameBase", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addStreetNameType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "streetNameType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addAdditionalLocator", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "additionalLocator", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addUnitID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "unitID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addUnitType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "unitType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addCareOf", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "careOf", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addCensusTract", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "censusTract", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addDeliveryAddressLine", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "deliveryAddressLine", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addDeliveryInstallationType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "deliveryInstallationType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addDeliveryInstallationArea", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "deliveryInstallationArea", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addDeliveryInstallationQualifier", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "deliveryInstallationQualifier", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addDeliveryMode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "deliveryMode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addDeliveryModeIdentifier", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "deliveryModeIdentifier", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addBuildingNumberSuffix", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "buildingNumberSuffix", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addPostBox", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "postBox", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addPrecinct", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "precinct", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(adEClass, this.getAD(), "addText", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "text", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(adEClass, ecorePackage.getEString(), "getText", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(adxpEClass, org.openhealthtools.mdht.uml.hl7.datatypes.ADXP.class, "ADXP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getADXP_PartType(), theVocabPackage.getAddressPartType(), "partType", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.ADXP.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(enEClass, org.openhealthtools.mdht.uml.hl7.datatypes.EN.class, "EN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEN_Delimiter(), this.getENXP(), null, "delimiter", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.EN.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEN_Family(), this.getENXP(), null, "family", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.EN.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEN_Given(), this.getENXP(), null, "given", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.EN.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEN_Prefix(), this.getENXP(), null, "prefix", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.EN.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEN_Suffix(), this.getENXP(), null, "suffix", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.EN.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEN_Part(), ecorePackage.getEFeatureMapEntry(), "part", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.EN.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEN_ValidTime(), this.getIVL_TS(), null, "validTime", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.EN.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEN_Use(), theVocabPackage.getEntityNameUse(), "use", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.EN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEN_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.EN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(enEClass, ecorePackage.getEBoolean(), "validateDelimiter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(enEClass, ecorePackage.getEBoolean(), "validateFamily", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(enEClass, ecorePackage.getEBoolean(), "validateGiven", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(enEClass, ecorePackage.getEBoolean(), "validatePrefix", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(enEClass, ecorePackage.getEBoolean(), "validateSuffix", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(enEClass, this.getEN(), "addDelimiter", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "delimiter", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(enEClass, this.getEN(), "addFamily", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "family", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(enEClass, this.getEN(), "addGiven", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "given", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(enEClass, this.getEN(), "addPrefix", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "prefix", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(enEClass, this.getEN(), "addSuffix", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "suffix", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(enEClass, this.getEN(), "addText", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "text", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(enEClass, ecorePackage.getEString(), "getText", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(enxpEClass, org.openhealthtools.mdht.uml.hl7.datatypes.ENXP.class, "ENXP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getENXP_PartType(), theVocabPackage.getEntityNamePartType(), "partType", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.ENXP.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getENXP_Qualifier(), theVocabPackage.getEntityNamePartQualifier(), "qualifier", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.ENXP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ivL_TSEClass, org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS.class, "IVL_TS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIVL_TS_Low(), this.getIVXB_TS(), null, "low", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIVL_TS_Center(), this.getTS(), null, "center", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIVL_TS_High(), this.getIVXB_TS(), null, "high", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIVL_TS_Width(), this.getPQ(), null, "width", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(ivL_TSEClass, ecorePackage.getEBoolean(), "validateOptionsContainingLow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ivL_TSEClass, ecorePackage.getEBoolean(), "validateOptionsContainingCenter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ivL_TSEClass, ecorePackage.getEBoolean(), "validateOptionsContainingHigh", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ivL_TSEClass, ecorePackage.getEBoolean(), "validateOptionsContainingWidth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ivxB_TSEClass, org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS.class, "IVXB_TS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIVXB_TS_Inclusive(), ecorePackage.getEBooleanObject(), "inclusive", "true", 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pqEClass, org.openhealthtools.mdht.uml.hl7.datatypes.PQ.class, "PQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPQ_Value(), ecorePackage.getEDoubleObject(), "value", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.PQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPQ_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.PQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPQ_Translation(), this.getPQR(), null, "translation", null, 0, -1, org.openhealthtools.mdht.uml.hl7.datatypes.PQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pqrEClass, org.openhealthtools.mdht.uml.hl7.datatypes.PQR.class, "PQR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPQR_Value(), ecorePackage.getEDoubleObject(), "value", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.PQR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(onEClass, org.openhealthtools.mdht.uml.hl7.datatypes.ON.class, "ON", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(onEClass, ecorePackage.getEBoolean(), "validateInvariant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pnEClass, org.openhealthtools.mdht.uml.hl7.datatypes.PN.class, "PN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(pnEClass, ecorePackage.getEBoolean(), "validateInvariant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tnEClass, org.openhealthtools.mdht.uml.hl7.datatypes.TN.class, "TN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tnEClass, ecorePackage.getEBoolean(), "validateInvariant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(intEClass, org.openhealthtools.mdht.uml.hl7.datatypes.INT.class, "INT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getINT_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.INT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(realEClass, org.openhealthtools.mdht.uml.hl7.datatypes.REAL.class, "REAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getREAL_Value(), ecorePackage.getEDoubleObject(), "value", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.REAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(csEClass, org.openhealthtools.mdht.uml.hl7.datatypes.CS.class, "CS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(csEClass, ecorePackage.getEBoolean(), "validateOriginalText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(csEClass, ecorePackage.getEBoolean(), "validateCodeSystem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(csEClass, ecorePackage.getEBoolean(), "validateCodeSystemName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(csEClass, ecorePackage.getEBoolean(), "validateCodeSystemVersion", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(csEClass, ecorePackage.getEBoolean(), "validateDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(coEClass, org.openhealthtools.mdht.uml.hl7.datatypes.CO.class, "CO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scEClass, org.openhealthtools.mdht.uml.hl7.datatypes.SC.class, "SC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSC_Code(), ecorePackage.getEString(), "code", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.SC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSC_CodeSystem(), this.getuid(), "codeSystem", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.SC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSC_CodeSystemName(), this.getstType(), "codeSystemName", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.SC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSC_CodeSystemVersion(), this.getstType(), "codeSystemVersion", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.SC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSC_DisplayName(), this.getstType(), "displayName", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.SC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rtO_QTY_QTYEClass, org.openhealthtools.mdht.uml.hl7.datatypes.RTO_QTY_QTY.class, "RTO_QTY_QTY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRTO_QTY_QTY_Numerator(), this.getQTY(), null, "numerator", null, 1, 1, org.openhealthtools.mdht.uml.hl7.datatypes.RTO_QTY_QTY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRTO_QTY_QTY_Denominator(), this.getQTY(), null, "denominator", null, 1, 1, org.openhealthtools.mdht.uml.hl7.datatypes.RTO_QTY_QTY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(rtO_QTY_QTYEClass, ecorePackage.getEBoolean(), "validateDenominator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(moEClass, org.openhealthtools.mdht.uml.hl7.datatypes.MO.class, "MO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMO_Value(), ecorePackage.getEDoubleObject(), "value", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.MO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMO_Currency(), ecorePackage.getEString(), "currency", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.MO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rtoEClass, org.openhealthtools.mdht.uml.hl7.datatypes.RTO.class, "RTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sxcM_INTEClass, org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_INT.class, "SXCM_INT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSXCM_INT_Operator(), theVocabPackage.getSetOperator(), "operator", "I", 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_INT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ivxB_INTEClass, org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_INT.class, "IVXB_INT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIVXB_INT_Inclusive(), ecorePackage.getEBooleanObject(), "inclusive", "true", 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_INT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ivL_INTEClass, org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT.class, "IVL_INT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIVL_INT_Low(), this.getIVXB_INT(), null, "low", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIVL_INT_Center(), this.getINT(), null, "center", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIVL_INT_High(), this.getIVXB_INT(), null, "high", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIVL_INT_Width(), this.getINT(), null, "width", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(ivL_INTEClass, ecorePackage.getEBoolean(), "validateOptionsContainingLow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ivL_INTEClass, ecorePackage.getEBoolean(), "validateOptionsContainingCenter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ivL_INTEClass, ecorePackage.getEBoolean(), "validateOptionsContainingHigh", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ivL_INTEClass, ecorePackage.getEBoolean(), "validateOptionsContainingWidth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ivxB_PQEClass, org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_PQ.class, "IVXB_PQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIVXB_PQ_Inclusive(), ecorePackage.getEBooleanObject(), "inclusive", "true", 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_PQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sxcM_PQEClass, org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_PQ.class, "SXCM_PQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSXCM_PQ_Operator(), theVocabPackage.getSetOperator(), "operator", "I", 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_PQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ivL_PQEClass, org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ.class, "IVL_PQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIVL_PQ_Low(), this.getIVXB_PQ(), null, "low", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIVL_PQ_Center(), this.getPQ(), null, "center", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIVL_PQ_High(), this.getIVXB_PQ(), null, "high", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIVL_PQ_Width(), this.getPQ(), null, "width", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(ivL_PQEClass, ecorePackage.getEBoolean(), "validateOptionsContainingLow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ivL_PQEClass, ecorePackage.getEBoolean(), "validateOptionsContainingCenter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ivL_PQEClass, ecorePackage.getEBoolean(), "validateOptionsContainingHigh", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ivL_PQEClass, ecorePackage.getEBoolean(), "validateOptionsContainingWidth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rtO_PQ_PQEClass, org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ.class, "RTO_PQ_PQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRTO_PQ_PQ_Numerator(), this.getPQ(), null, "numerator", null, 1, 1, org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRTO_PQ_PQ_Denominator(), this.getPQ(), null, "denominator", null, 1, 1, org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(rtO_PQ_PQEClass, ecorePackage.getEBoolean(), "validateDenominator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pivL_TSEClass, org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS.class, "PIVL_TS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPIVL_TS_Phase(), this.getIVL_TS(), null, "phase", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPIVL_TS_Period(), this.getPQ(), null, "period", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPIVL_TS_Alignment(), theVocabPackage.getCalendarCycle(), "alignment", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPIVL_TS_InstitutionSpecified(), ecorePackage.getEBooleanObject(), "institutionSpecified", "false", 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eivL_eventEClass, EIVL_event.class, "EIVL_event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(eivL_eventEClass, ecorePackage.getEBoolean(), "validateOriginalText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eivL_eventEClass, ecorePackage.getEBoolean(), "validateTranslation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eivL_eventEClass, ecorePackage.getEBoolean(), "validateCodeSystem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eivL_eventEClass, ecorePackage.getEBoolean(), "validateCodeSystemName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eivL_eventEClass, this.getEIVL_event(), "init", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(eivL_TSEClass, org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_TS.class, "EIVL_TS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEIVL_TS_Event(), this.getEIVL_event(), null, "event", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_TS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEIVL_TS_Offset(), this.getIVL_PQ(), null, "offset", null, 0, 1, org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_TS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(binaryDataEncodingEEnum, BinaryDataEncoding.class, "BinaryDataEncoding");
		addEEnumLiteral(binaryDataEncodingEEnum, BinaryDataEncoding.B64);
		addEEnumLiteral(binaryDataEncodingEEnum, BinaryDataEncoding.TXT);

		// Initialize data types
		initEDataType(uidEDataType, String.class, "uid", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stTypeEDataType, String.class, "stType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (binEClass, 
		   source, 
		   new String[] {
			 "kind", "empty"
		   });		
		addAnnotation
		  (edEClass, 
		   source, 
		   new String[] {
			 "kind", "mixed"
		   });						
		addAnnotation
		  (getED_Mixed(), 
		   source, 
		   new String[] {
			 "name", "mixed",
			 "kind", "elementWildcard"
		   });		
		addAnnotation
		  (getED_Reference(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element"
		   });		
		addAnnotation
		  (getED_Thumbnail(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element"
		   });		
		addAnnotation
		  (getTEL_UseablePeriod(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getTEL_Use(), 
		   source, 
		   new String[] {
			 "kind", "attribute"
		   });		
		addAnnotation
		  (stEClass, 
		   source, 
		   new String[] {
			 "kind", "mixed"
		   });																																
		addAnnotation
		  (getCD_OriginalText(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getCD_Qualifier(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getCD_Translation(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getCR_Name(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getCR_Value(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });										
		addAnnotation
		  (uidEDataType, 
		   source, 
		   new String[] {
			 "pattern", "[0-2](\\.(0|[1-9][0-9]*))* [0-9a-zA-Z]{8}-[0-9a-zA-Z]{4}-[0-9a-zA-Z]{4}-[0-9a-zA-Z]{4}-[0-9a-zA-Z]{12} [A-Za-z][A-Za-z0-9\\-]*"
		   });		
		addAnnotation
		  (stTypeEDataType, 
		   source, 
		   new String[] {
			 "pattern", ".+"
		   });						
		addAnnotation
		  (adEClass, 
		   source, 
		   new String[] {
			 "kind", "mixed"
		   });																																																																																																														
		addAnnotation
		  (getAD_Delimiter(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_Country(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_State(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_County(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_City(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_PostalCode(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_StreetAddressLine(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_HouseNumber(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_HouseNumberNumeric(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_Direction(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_StreetName(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_StreetNameBase(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_StreetNameType(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_AdditionalLocator(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_UnitID(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_UnitType(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_CareOf(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_CensusTract(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_DeliveryAddressLine(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_DeliveryInstallationType(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_DeliveryInstallationArea(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_DeliveryInstallationQualifier(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_DeliveryMode(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_DeliveryModeIdentifier(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_BuildingNumberSuffix(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_PostBox(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_Precinct(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getAD_Part(), 
		   source, 
		   new String[] {
			 "kind", "group"
		   });		
		addAnnotation
		  (getAD_UseablePeriod(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element"
		   });		
		addAnnotation
		  (getAD_Use(), 
		   source, 
		   new String[] {
			 "kind", "attribute"
		   });		
		addAnnotation
		  (getAD_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard"
		   });		
		addAnnotation
		  (adxpEClass, 
		   source, 
		   new String[] {
			 "kind", "mixed"
		   });		
		addAnnotation
		  (enEClass, 
		   source, 
		   new String[] {
			 "kind", "mixed"
		   });																						
		addAnnotation
		  (getEN_Delimiter(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getEN_Family(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getEN_Given(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getEN_Prefix(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getEN_Suffix(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element",
			 "group", "#part"
		   });		
		addAnnotation
		  (getEN_Part(), 
		   source, 
		   new String[] {
			 "kind", "group"
		   });		
		addAnnotation
		  (getEN_ValidTime(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3",
			 "kind", "element"
		   });		
		addAnnotation
		  (getEN_Use(), 
		   source, 
		   new String[] {
			 "kind", "attribute"
		   });		
		addAnnotation
		  (getEN_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard"
		   });		
		addAnnotation
		  (enxpEClass, 
		   source, 
		   new String[] {
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getENXP_Qualifier(), 
		   source, 
		   new String[] {
			 "kind", "attribute"
		   });																		
		addAnnotation
		  (getIVL_TS_Low(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getIVL_TS_Center(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getIVL_TS_High(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getIVL_TS_Width(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getPQ_Translation(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (onEClass, 
		   source, 
		   new String[] {
			 "kind", "mixed"
		   });						
		addAnnotation
		  (pnEClass, 
		   source, 
		   new String[] {
			 "kind", "mixed"
		   });						
		addAnnotation
		  (tnEClass, 
		   source, 
		   new String[] {
			 "kind", "mixed"
		   });																										
		addAnnotation
		  (scEClass, 
		   source, 
		   new String[] {
			 "kind", "mixed"
		   });						
		addAnnotation
		  (getRTO_QTY_QTY_Numerator(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getRTO_QTY_QTY_Denominator(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });																		
		addAnnotation
		  (getIVL_INT_Low(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getIVL_INT_Center(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getIVL_INT_High(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getIVL_INT_Width(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });																		
		addAnnotation
		  (getIVL_PQ_Low(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getIVL_PQ_Center(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getIVL_PQ_High(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getIVL_PQ_Width(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });						
		addAnnotation
		  (getRTO_PQ_PQ_Numerator(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getRTO_PQ_PQ_Denominator(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getPIVL_TS_Phase(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getPIVL_TS_Period(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (eivL_eventEClass, 
		   source, 
		   new String[] {
			 "name", "EIVL.event"
		   });																		
		addAnnotation
		  (getEIVL_TS_Event(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });		
		addAnnotation
		  (getEIVL_TS_Offset(), 
		   source, 
		   new String[] {
			 "namespace", "urn:hl7-org:v3"
		   });
	}

} //DatatypesPackageImpl
