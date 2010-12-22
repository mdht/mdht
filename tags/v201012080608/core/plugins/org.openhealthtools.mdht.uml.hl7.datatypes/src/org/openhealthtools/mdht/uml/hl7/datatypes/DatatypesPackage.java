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
package org.openhealthtools.mdht.uml.hl7.datatypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/hl7/datatypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datatypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesPackage eINSTANCE = org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ANYImpl <em>ANY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.ANYImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getANY()
	 * @generated
	 */
	int ANY = 0;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__NULL_FLAVOR = 0;

	/**
	 * The number of structural features of the '<em>ANY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.BINImpl <em>BIN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.BINImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getBIN()
	 * @generated
	 */
	int BIN = 1;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN__NULL_FLAVOR = ANY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN__REPRESENTATION = ANY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BIN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_FEATURE_COUNT = ANY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.EDImpl <em>ED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.EDImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getED()
	 * @generated
	 */
	int ED = 2;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__NULL_FLAVOR = BIN__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__REPRESENTATION = BIN__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__MIXED = BIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__REFERENCE = BIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Thumbnail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__THUMBNAIL = BIN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__MEDIA_TYPE = BIN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__LANGUAGE = BIN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Compression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__COMPRESSION = BIN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Integrity Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__INTEGRITY_CHECK = BIN_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Integrity Check Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED__INTEGRITY_CHECK_ALGORITHM = BIN_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>ED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_FEATURE_COUNT = BIN_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.URLImpl <em>URL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.URLImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getURL()
	 * @generated
	 */
	int URL = 4;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__NULL_FLAVOR = ANY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__VALUE = ANY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>URL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FEATURE_COUNT = ANY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.TELImpl <em>TEL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.TELImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getTEL()
	 * @generated
	 */
	int TEL = 3;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEL__NULL_FLAVOR = URL__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEL__VALUE = URL__VALUE;

	/**
	 * The feature id for the '<em><b>Useable Period</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEL__USEABLE_PERIOD = URL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEL__USE = URL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TEL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEL_FEATURE_COUNT = URL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.QTYImpl <em>QTY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.QTYImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getQTY()
	 * @generated
	 */
	int QTY = 7;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTY__NULL_FLAVOR = ANY__NULL_FLAVOR;

	/**
	 * The number of structural features of the '<em>QTY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTY_FEATURE_COUNT = ANY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.TSImpl <em>TS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.TSImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getTS()
	 * @generated
	 */
	int TS = 6;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS__NULL_FLAVOR = QTY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS__VALUE = QTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TS_FEATURE_COUNT = QTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.SXCM_TSImpl <em>SXCM TS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.SXCM_TSImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getSXCM_TS()
	 * @generated
	 */
	int SXCM_TS = 5;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SXCM_TS__NULL_FLAVOR = TS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SXCM_TS__VALUE = TS__VALUE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SXCM_TS__OPERATOR = TS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SXCM TS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SXCM_TS_FEATURE_COUNT = TS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.STImpl <em>ST</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.STImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getST()
	 * @generated
	 */
	int ST = 8;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST__NULL_FLAVOR = ED__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST__REPRESENTATION = ED__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST__MIXED = ED__MIXED;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST__REFERENCE = ED__REFERENCE;

	/**
	 * The feature id for the '<em><b>Thumbnail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST__THUMBNAIL = ED__THUMBNAIL;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST__MEDIA_TYPE = ED__MEDIA_TYPE;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST__LANGUAGE = ED__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Compression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST__COMPRESSION = ED__COMPRESSION;

	/**
	 * The feature id for the '<em><b>Integrity Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST__INTEGRITY_CHECK = ED__INTEGRITY_CHECK;

	/**
	 * The feature id for the '<em><b>Integrity Check Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST__INTEGRITY_CHECK_ALGORITHM = ED__INTEGRITY_CHECK_ALGORITHM;

	/**
	 * The number of structural features of the '<em>ST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_FEATURE_COUNT = ED_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CDImpl <em>CD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.CDImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getCD()
	 * @generated
	 */
	int CD = 9;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__NULL_FLAVOR = ANY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Original Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__ORIGINAL_TEXT = ANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__QUALIFIER = ANY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__TRANSLATION = ANY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__CODE = ANY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__CODE_SYSTEM = ANY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__CODE_SYSTEM_NAME = ANY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__CODE_SYSTEM_VERSION = ANY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__DISPLAY_NAME = ANY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>CD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_FEATURE_COUNT = ANY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CRImpl <em>CR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.CRImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getCR()
	 * @generated
	 */
	int CR = 10;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR__NULL_FLAVOR = ANY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR__NAME = ANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR__VALUE = ANY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR__INVERTED = ANY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR_FEATURE_COUNT = ANY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CEImpl <em>CE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.CEImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getCE()
	 * @generated
	 */
	int CE = 12;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE__NULL_FLAVOR = CD__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Original Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE__ORIGINAL_TEXT = CD__ORIGINAL_TEXT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE__QUALIFIER = CD__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE__TRANSLATION = CD__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE__CODE = CD__CODE;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE__CODE_SYSTEM = CD__CODE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE__CODE_SYSTEM_NAME = CD__CODE_SYSTEM_NAME;

	/**
	 * The feature id for the '<em><b>Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE__CODE_SYSTEM_VERSION = CD__CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE__DISPLAY_NAME = CD__DISPLAY_NAME;

	/**
	 * The number of structural features of the '<em>CE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CE_FEATURE_COUNT = CD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CVImpl <em>CV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.CVImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getCV()
	 * @generated
	 */
	int CV = 11;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV__NULL_FLAVOR = CE__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Original Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV__ORIGINAL_TEXT = CE__ORIGINAL_TEXT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV__QUALIFIER = CE__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV__TRANSLATION = CE__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV__CODE = CE__CODE;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV__CODE_SYSTEM = CE__CODE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV__CODE_SYSTEM_NAME = CE__CODE_SYSTEM_NAME;

	/**
	 * The feature id for the '<em><b>Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV__CODE_SYSTEM_VERSION = CE__CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV__DISPLAY_NAME = CE__DISPLAY_NAME;

	/**
	 * The number of structural features of the '<em>CV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_FEATURE_COUNT = CE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IIImpl <em>II</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.IIImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getII()
	 * @generated
	 */
	int II = 13;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int II__NULL_FLAVOR = ANY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int II__ROOT = ANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int II__EXTENSION = ANY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assigning Authority Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int II__ASSIGNING_AUTHORITY_NAME = ANY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Displayable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int II__DISPLAYABLE = ANY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>II</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int II_FEATURE_COUNT = ANY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.BLImpl <em>BL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.BLImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getBL()
	 * @generated
	 */
	int BL = 14;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BL__NULL_FLAVOR = ANY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BL__VALUE = ANY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BL_FEATURE_COUNT = ANY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.BNImpl <em>BN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.BNImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getBN()
	 * @generated
	 */
	int BN = 15;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BN__NULL_FLAVOR = BL__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BN__VALUE = BL__VALUE;

	/**
	 * The number of structural features of the '<em>BN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BN_FEATURE_COUNT = BL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl <em>AD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getAD()
	 * @generated
	 */
	int AD = 16;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__NULL_FLAVOR = ANY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Useable Period</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__USEABLE_PERIOD = ANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__USE = ANY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Not Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__IS_NOT_ORDERED = ANY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__DELIMITER = ANY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Country</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__COUNTRY = ANY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__STATE = ANY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>County</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__COUNTY = ANY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>City</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__CITY = ANY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__POSTAL_CODE = ANY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Street Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__STREET_ADDRESS_LINE = ANY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>House Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__HOUSE_NUMBER = ANY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>House Number Numeric</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__HOUSE_NUMBER_NUMERIC = ANY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__DIRECTION = ANY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Street Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__STREET_NAME = ANY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Street Name Base</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__STREET_NAME_BASE = ANY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Street Name Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__STREET_NAME_TYPE = ANY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Additional Locator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__ADDITIONAL_LOCATOR = ANY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Unit ID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__UNIT_ID = ANY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Unit Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__UNIT_TYPE = ANY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Care Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__CARE_OF = ANY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Census Tract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__CENSUS_TRACT = ANY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Delivery Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__DELIVERY_ADDRESS_LINE = ANY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Delivery Installation Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__DELIVERY_INSTALLATION_TYPE = ANY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Delivery Installation Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__DELIVERY_INSTALLATION_AREA = ANY_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Delivery Installation Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__DELIVERY_INSTALLATION_QUALIFIER = ANY_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Delivery Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__DELIVERY_MODE = ANY_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Delivery Mode Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__DELIVERY_MODE_IDENTIFIER = ANY_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Building Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__BUILDING_NUMBER_SUFFIX = ANY_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__POST_BOX = ANY_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Precinct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__PRECINCT = ANY_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__PART = ANY_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD__MIXED = ANY_FEATURE_COUNT + 31;

	/**
	 * The number of structural features of the '<em>AD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_FEATURE_COUNT = ANY_FEATURE_COUNT + 32;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADXPImpl <em>ADXP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADXPImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getADXP()
	 * @generated
	 */
	int ADXP = 17;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADXP__NULL_FLAVOR = ST__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADXP__REPRESENTATION = ST__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADXP__MIXED = ST__MIXED;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADXP__REFERENCE = ST__REFERENCE;

	/**
	 * The feature id for the '<em><b>Thumbnail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADXP__THUMBNAIL = ST__THUMBNAIL;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADXP__MEDIA_TYPE = ST__MEDIA_TYPE;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADXP__LANGUAGE = ST__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Compression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADXP__COMPRESSION = ST__COMPRESSION;

	/**
	 * The feature id for the '<em><b>Integrity Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADXP__INTEGRITY_CHECK = ST__INTEGRITY_CHECK;

	/**
	 * The feature id for the '<em><b>Integrity Check Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADXP__INTEGRITY_CHECK_ALGORITHM = ST__INTEGRITY_CHECK_ALGORITHM;

	/**
	 * The feature id for the '<em><b>Part Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADXP__PART_TYPE = ST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ADXP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADXP_FEATURE_COUNT = ST_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENImpl <em>EN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getEN()
	 * @generated
	 */
	int EN = 18;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EN__NULL_FLAVOR = ANY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EN__USE = ANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valid Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EN__VALID_TIME = ANY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EN__DELIMITER = ANY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Family</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EN__FAMILY = ANY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Given</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EN__GIVEN = ANY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EN__PREFIX = ANY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EN__SUFFIX = ANY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EN__PART = ANY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EN__MIXED = ANY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>EN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EN_FEATURE_COUNT = ANY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVL_TSImpl <em>IVL TS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVL_TSImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getIVL_TS()
	 * @generated
	 */
	int IVL_TS = 19;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_TS__NULL_FLAVOR = SXCM_TS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_TS__VALUE = SXCM_TS__VALUE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_TS__OPERATOR = SXCM_TS__OPERATOR;

	/**
	 * The feature id for the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_TS__LOW = SXCM_TS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_TS__CENTER = SXCM_TS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_TS__HIGH = SXCM_TS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_TS__WIDTH = SXCM_TS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>IVL TS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_TS_FEATURE_COUNT = SXCM_TS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVXB_TSImpl <em>IVXB TS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVXB_TSImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getIVXB_TS()
	 * @generated
	 */
	int IVXB_TS = 20;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVXB_TS__NULL_FLAVOR = TS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVXB_TS__VALUE = TS__VALUE;

	/**
	 * The feature id for the '<em><b>Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVXB_TS__INCLUSIVE = TS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IVXB TS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVXB_TS_FEATURE_COUNT = TS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.PQImpl <em>PQ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.PQImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getPQ()
	 * @generated
	 */
	int PQ = 21;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQ__NULL_FLAVOR = QTY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQ__VALUE = QTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQ__UNIT = QTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQ__TRANSLATION = QTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQ_FEATURE_COUNT = QTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.PQRImpl <em>PQR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.PQRImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getPQR()
	 * @generated
	 */
	int PQR = 22;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQR__NULL_FLAVOR = CV__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Original Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQR__ORIGINAL_TEXT = CV__ORIGINAL_TEXT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQR__QUALIFIER = CV__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQR__TRANSLATION = CV__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQR__CODE = CV__CODE;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQR__CODE_SYSTEM = CV__CODE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQR__CODE_SYSTEM_NAME = CV__CODE_SYSTEM_NAME;

	/**
	 * The feature id for the '<em><b>Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQR__CODE_SYSTEM_VERSION = CV__CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQR__DISPLAY_NAME = CV__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQR__VALUE = CV_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PQR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PQR_FEATURE_COUNT = CV_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENXPImpl <em>ENXP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENXPImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getENXP()
	 * @generated
	 */
	int ENXP = 23;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENXP__NULL_FLAVOR = ST__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENXP__REPRESENTATION = ST__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENXP__MIXED = ST__MIXED;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENXP__REFERENCE = ST__REFERENCE;

	/**
	 * The feature id for the '<em><b>Thumbnail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENXP__THUMBNAIL = ST__THUMBNAIL;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENXP__MEDIA_TYPE = ST__MEDIA_TYPE;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENXP__LANGUAGE = ST__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Compression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENXP__COMPRESSION = ST__COMPRESSION;

	/**
	 * The feature id for the '<em><b>Integrity Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENXP__INTEGRITY_CHECK = ST__INTEGRITY_CHECK;

	/**
	 * The feature id for the '<em><b>Integrity Check Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENXP__INTEGRITY_CHECK_ALGORITHM = ST__INTEGRITY_CHECK_ALGORITHM;

	/**
	 * The feature id for the '<em><b>Part Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENXP__PART_TYPE = ST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENXP__QUALIFIER = ST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ENXP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENXP_FEATURE_COUNT = ST_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ONImpl <em>ON</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.ONImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getON()
	 * @generated
	 */
	int ON = 24;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__NULL_FLAVOR = EN__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__USE = EN__USE;

	/**
	 * The feature id for the '<em><b>Valid Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__VALID_TIME = EN__VALID_TIME;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__DELIMITER = EN__DELIMITER;

	/**
	 * The feature id for the '<em><b>Family</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__FAMILY = EN__FAMILY;

	/**
	 * The feature id for the '<em><b>Given</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__GIVEN = EN__GIVEN;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__PREFIX = EN__PREFIX;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__SUFFIX = EN__SUFFIX;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__PART = EN__PART;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__MIXED = EN__MIXED;

	/**
	 * The number of structural features of the '<em>ON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_FEATURE_COUNT = EN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.PNImpl <em>PN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.PNImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getPN()
	 * @generated
	 */
	int PN = 25;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PN__NULL_FLAVOR = EN__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PN__USE = EN__USE;

	/**
	 * The feature id for the '<em><b>Valid Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PN__VALID_TIME = EN__VALID_TIME;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PN__DELIMITER = EN__DELIMITER;

	/**
	 * The feature id for the '<em><b>Family</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PN__FAMILY = EN__FAMILY;

	/**
	 * The feature id for the '<em><b>Given</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PN__GIVEN = EN__GIVEN;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PN__PREFIX = EN__PREFIX;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PN__SUFFIX = EN__SUFFIX;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PN__PART = EN__PART;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PN__MIXED = EN__MIXED;

	/**
	 * The number of structural features of the '<em>PN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PN_FEATURE_COUNT = EN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.TNImpl <em>TN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.TNImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getTN()
	 * @generated
	 */
	int TN = 26;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TN__NULL_FLAVOR = EN__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TN__USE = EN__USE;

	/**
	 * The feature id for the '<em><b>Valid Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TN__VALID_TIME = EN__VALID_TIME;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TN__DELIMITER = EN__DELIMITER;

	/**
	 * The feature id for the '<em><b>Family</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TN__FAMILY = EN__FAMILY;

	/**
	 * The feature id for the '<em><b>Given</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TN__GIVEN = EN__GIVEN;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TN__PREFIX = EN__PREFIX;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TN__SUFFIX = EN__SUFFIX;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TN__PART = EN__PART;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TN__MIXED = EN__MIXED;

	/**
	 * The number of structural features of the '<em>TN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TN_FEATURE_COUNT = EN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.INTImpl <em>INT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.INTImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getINT()
	 * @generated
	 */
	int INT = 27;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT__NULL_FLAVOR = QTY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT__VALUE = QTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>INT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_FEATURE_COUNT = QTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.REALImpl <em>REAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.REALImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getREAL()
	 * @generated
	 */
	int REAL = 28;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__NULL_FLAVOR = QTY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__VALUE = QTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>REAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_COUNT = QTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CSImpl <em>CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.CSImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getCS()
	 * @generated
	 */
	int CS = 29;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS__NULL_FLAVOR = CV__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Original Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS__ORIGINAL_TEXT = CV__ORIGINAL_TEXT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS__QUALIFIER = CV__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS__TRANSLATION = CV__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS__CODE = CV__CODE;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS__CODE_SYSTEM = CV__CODE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS__CODE_SYSTEM_NAME = CV__CODE_SYSTEM_NAME;

	/**
	 * The feature id for the '<em><b>Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS__CODE_SYSTEM_VERSION = CV__CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS__DISPLAY_NAME = CV__DISPLAY_NAME;

	/**
	 * The number of structural features of the '<em>CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_FEATURE_COUNT = CV_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.COImpl <em>CO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.COImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getCO()
	 * @generated
	 */
	int CO = 30;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO__NULL_FLAVOR = CV__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Original Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO__ORIGINAL_TEXT = CV__ORIGINAL_TEXT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO__QUALIFIER = CV__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO__TRANSLATION = CV__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO__CODE = CV__CODE;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO__CODE_SYSTEM = CV__CODE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO__CODE_SYSTEM_NAME = CV__CODE_SYSTEM_NAME;

	/**
	 * The feature id for the '<em><b>Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO__CODE_SYSTEM_VERSION = CV__CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO__DISPLAY_NAME = CV__DISPLAY_NAME;

	/**
	 * The number of structural features of the '<em>CO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_FEATURE_COUNT = CV_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.SCImpl <em>SC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.SCImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getSC()
	 * @generated
	 */
	int SC = 31;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC__NULL_FLAVOR = ST__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC__REPRESENTATION = ST__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC__MIXED = ST__MIXED;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC__REFERENCE = ST__REFERENCE;

	/**
	 * The feature id for the '<em><b>Thumbnail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC__THUMBNAIL = ST__THUMBNAIL;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC__MEDIA_TYPE = ST__MEDIA_TYPE;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC__LANGUAGE = ST__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Compression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC__COMPRESSION = ST__COMPRESSION;

	/**
	 * The feature id for the '<em><b>Integrity Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC__INTEGRITY_CHECK = ST__INTEGRITY_CHECK;

	/**
	 * The feature id for the '<em><b>Integrity Check Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC__INTEGRITY_CHECK_ALGORITHM = ST__INTEGRITY_CHECK_ALGORITHM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC__CODE = ST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC__CODE_SYSTEM = ST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC__CODE_SYSTEM_NAME = ST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC__CODE_SYSTEM_VERSION = ST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC__DISPLAY_NAME = ST_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_FEATURE_COUNT = ST_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.RTO_QTY_QTYImpl <em>RTO QTY QTY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.RTO_QTY_QTYImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getRTO_QTY_QTY()
	 * @generated
	 */
	int RTO_QTY_QTY = 32;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO_QTY_QTY__NULL_FLAVOR = QTY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Numerator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO_QTY_QTY__NUMERATOR = QTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Denominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO_QTY_QTY__DENOMINATOR = QTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RTO QTY QTY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO_QTY_QTY_FEATURE_COUNT = QTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.MOImpl <em>MO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.MOImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getMO()
	 * @generated
	 */
	int MO = 33;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO__NULL_FLAVOR = QTY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO__VALUE = QTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO__CURRENCY = QTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_FEATURE_COUNT = QTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.RTOImpl <em>RTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.RTOImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getRTO()
	 * @generated
	 */
	int RTO = 34;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__NULL_FLAVOR = RTO_QTY_QTY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Numerator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__NUMERATOR = RTO_QTY_QTY__NUMERATOR;

	/**
	 * The feature id for the '<em><b>Denominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO__DENOMINATOR = RTO_QTY_QTY__DENOMINATOR;

	/**
	 * The number of structural features of the '<em>RTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO_FEATURE_COUNT = RTO_QTY_QTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.SXCM_INTImpl <em>SXCM INT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.SXCM_INTImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getSXCM_INT()
	 * @generated
	 */
	int SXCM_INT = 35;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SXCM_INT__NULL_FLAVOR = INT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SXCM_INT__VALUE = INT__VALUE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SXCM_INT__OPERATOR = INT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SXCM INT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SXCM_INT_FEATURE_COUNT = INT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVXB_INTImpl <em>IVXB INT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVXB_INTImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getIVXB_INT()
	 * @generated
	 */
	int IVXB_INT = 36;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVXB_INT__NULL_FLAVOR = INT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVXB_INT__VALUE = INT__VALUE;

	/**
	 * The feature id for the '<em><b>Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVXB_INT__INCLUSIVE = INT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IVXB INT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVXB_INT_FEATURE_COUNT = INT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVL_INTImpl <em>IVL INT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVL_INTImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getIVL_INT()
	 * @generated
	 */
	int IVL_INT = 37;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_INT__NULL_FLAVOR = SXCM_INT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_INT__VALUE = SXCM_INT__VALUE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_INT__OPERATOR = SXCM_INT__OPERATOR;

	/**
	 * The feature id for the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_INT__LOW = SXCM_INT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_INT__CENTER = SXCM_INT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_INT__HIGH = SXCM_INT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_INT__WIDTH = SXCM_INT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>IVL INT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_INT_FEATURE_COUNT = SXCM_INT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVXB_PQImpl <em>IVXB PQ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVXB_PQImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getIVXB_PQ()
	 * @generated
	 */
	int IVXB_PQ = 38;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVXB_PQ__NULL_FLAVOR = PQ__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVXB_PQ__VALUE = PQ__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVXB_PQ__UNIT = PQ__UNIT;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVXB_PQ__TRANSLATION = PQ__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVXB_PQ__INCLUSIVE = PQ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IVXB PQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVXB_PQ_FEATURE_COUNT = PQ_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.SXCM_PQImpl <em>SXCM PQ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.SXCM_PQImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getSXCM_PQ()
	 * @generated
	 */
	int SXCM_PQ = 39;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SXCM_PQ__NULL_FLAVOR = PQ__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SXCM_PQ__VALUE = PQ__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SXCM_PQ__UNIT = PQ__UNIT;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SXCM_PQ__TRANSLATION = PQ__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SXCM_PQ__OPERATOR = PQ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SXCM PQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SXCM_PQ_FEATURE_COUNT = PQ_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVL_PQImpl <em>IVL PQ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVL_PQImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getIVL_PQ()
	 * @generated
	 */
	int IVL_PQ = 40;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_PQ__NULL_FLAVOR = SXCM_PQ__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_PQ__VALUE = SXCM_PQ__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_PQ__UNIT = SXCM_PQ__UNIT;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_PQ__TRANSLATION = SXCM_PQ__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_PQ__OPERATOR = SXCM_PQ__OPERATOR;

	/**
	 * The feature id for the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_PQ__LOW = SXCM_PQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_PQ__CENTER = SXCM_PQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_PQ__HIGH = SXCM_PQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_PQ__WIDTH = SXCM_PQ_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>IVL PQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVL_PQ_FEATURE_COUNT = SXCM_PQ_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.RTO_PQ_PQImpl <em>RTO PQ PQ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.RTO_PQ_PQImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getRTO_PQ_PQ()
	 * @generated
	 */
	int RTO_PQ_PQ = 41;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO_PQ_PQ__NULL_FLAVOR = QTY__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Numerator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO_PQ_PQ__NUMERATOR = QTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Denominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO_PQ_PQ__DENOMINATOR = QTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RTO PQ PQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTO_PQ_PQ_FEATURE_COUNT = QTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.PIVL_TSImpl <em>PIVL TS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.PIVL_TSImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getPIVL_TS()
	 * @generated
	 */
	int PIVL_TS = 42;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVL_TS__NULL_FLAVOR = SXCM_TS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVL_TS__VALUE = SXCM_TS__VALUE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVL_TS__OPERATOR = SXCM_TS__OPERATOR;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVL_TS__PHASE = SXCM_TS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVL_TS__PERIOD = SXCM_TS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVL_TS__ALIGNMENT = SXCM_TS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Institution Specified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVL_TS__INSTITUTION_SPECIFIED = SXCM_TS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>PIVL TS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVL_TS_FEATURE_COUNT = SXCM_TS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.EIVL_eventImpl <em>EIVL event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.EIVL_eventImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getEIVL_event()
	 * @generated
	 */
	int EIVL_EVENT = 43;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIVL_EVENT__NULL_FLAVOR = CE__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Original Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIVL_EVENT__ORIGINAL_TEXT = CE__ORIGINAL_TEXT;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIVL_EVENT__QUALIFIER = CE__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIVL_EVENT__TRANSLATION = CE__TRANSLATION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIVL_EVENT__CODE = CE__CODE;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIVL_EVENT__CODE_SYSTEM = CE__CODE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIVL_EVENT__CODE_SYSTEM_NAME = CE__CODE_SYSTEM_NAME;

	/**
	 * The feature id for the '<em><b>Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIVL_EVENT__CODE_SYSTEM_VERSION = CE__CODE_SYSTEM_VERSION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIVL_EVENT__DISPLAY_NAME = CE__DISPLAY_NAME;

	/**
	 * The number of structural features of the '<em>EIVL event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIVL_EVENT_FEATURE_COUNT = CE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.EIVL_TSImpl <em>EIVL TS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.EIVL_TSImpl
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getEIVL_TS()
	 * @generated
	 */
	int EIVL_TS = 44;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIVL_TS__NULL_FLAVOR = SXCM_TS__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIVL_TS__VALUE = SXCM_TS__VALUE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIVL_TS__OPERATOR = SXCM_TS__OPERATOR;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIVL_TS__EVENT = SXCM_TS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIVL_TS__OFFSET = SXCM_TS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EIVL TS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIVL_TS_FEATURE_COUNT = SXCM_TS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.BinaryDataEncoding <em>Binary Data Encoding</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.BinaryDataEncoding
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getBinaryDataEncoding()
	 * @generated
	 */
	int BINARY_DATA_ENCODING = 45;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ANY <em>ANY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANY</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.ANY
	 * @generated
	 */
	EClass getANY();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ANY#getNullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.ANY#getNullFlavor()
	 * @see #getANY()
	 * @generated
	 */
	EAttribute getANY_NullFlavor();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.BIN <em>BIN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BIN</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.BIN
	 * @generated
	 */
	EClass getBIN();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.BIN#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.BIN#getRepresentation()
	 * @see #getBIN()
	 * @generated
	 */
	EAttribute getBIN_Representation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED <em>ED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ED</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.ED
	 * @generated
	 */
	EClass getED();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.ED#getMixed()
	 * @see #getED()
	 * @generated
	 */
	EAttribute getED_Mixed();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.ED#getReference()
	 * @see #getED()
	 * @generated
	 */
	EReference getED_Reference();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getThumbnail <em>Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thumbnail</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.ED#getThumbnail()
	 * @see #getED()
	 * @generated
	 */
	EReference getED_Thumbnail();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.ED#getMediaType()
	 * @see #getED()
	 * @generated
	 */
	EAttribute getED_MediaType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.ED#getLanguage()
	 * @see #getED()
	 * @generated
	 */
	EAttribute getED_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getCompression <em>Compression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compression</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.ED#getCompression()
	 * @see #getED()
	 * @generated
	 */
	EAttribute getED_Compression();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getIntegrityCheck <em>Integrity Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integrity Check</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.ED#getIntegrityCheck()
	 * @see #getED()
	 * @generated
	 */
	EAttribute getED_IntegrityCheck();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getIntegrityCheckAlgorithm <em>Integrity Check Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integrity Check Algorithm</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.ED#getIntegrityCheckAlgorithm()
	 * @see #getED()
	 * @generated
	 */
	EAttribute getED_IntegrityCheckAlgorithm();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.TEL <em>TEL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEL</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.TEL
	 * @generated
	 */
	EClass getTEL();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.TEL#getUseablePeriods <em>Useable Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Useable Period</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.TEL#getUseablePeriods()
	 * @see #getTEL()
	 * @generated
	 */
	EReference getTEL_UseablePeriod();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.TEL#getUses <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Use</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.TEL#getUses()
	 * @see #getTEL()
	 * @generated
	 */
	EAttribute getTEL_Use();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.URL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.URL
	 * @generated
	 */
	EClass getURL();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.URL#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.URL#getValue()
	 * @see #getURL()
	 * @generated
	 */
	EAttribute getURL_Value();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS <em>SXCM TS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SXCM TS</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS
	 * @generated
	 */
	EClass getSXCM_TS();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS#getOperator()
	 * @see #getSXCM_TS()
	 * @generated
	 */
	EAttribute getSXCM_TS_Operator();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.TS <em>TS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TS</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.TS
	 * @generated
	 */
	EClass getTS();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.TS#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.TS#getValue()
	 * @see #getTS()
	 * @generated
	 */
	EAttribute getTS_Value();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.QTY <em>QTY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QTY</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.QTY
	 * @generated
	 */
	EClass getQTY();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ST <em>ST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ST</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.ST
	 * @generated
	 */
	EClass getST();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD <em>CD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CD</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.CD
	 * @generated
	 */
	EClass getCD();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getOriginalText <em>Original Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Text</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.CD#getOriginalText()
	 * @see #getCD()
	 * @generated
	 */
	EReference getCD_OriginalText();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getQualifiers <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualifier</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.CD#getQualifiers()
	 * @see #getCD()
	 * @generated
	 */
	EReference getCD_Qualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getTranslations <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translation</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.CD#getTranslations()
	 * @see #getCD()
	 * @generated
	 */
	EReference getCD_Translation();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.CD#getCode()
	 * @see #getCD()
	 * @generated
	 */
	EAttribute getCD_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getCodeSystem <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code System</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.CD#getCodeSystem()
	 * @see #getCD()
	 * @generated
	 */
	EAttribute getCD_CodeSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getCodeSystemName <em>Code System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code System Name</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.CD#getCodeSystemName()
	 * @see #getCD()
	 * @generated
	 */
	EAttribute getCD_CodeSystemName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getCodeSystemVersion <em>Code System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code System Version</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.CD#getCodeSystemVersion()
	 * @see #getCD()
	 * @generated
	 */
	EAttribute getCD_CodeSystemVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.CD#getDisplayName()
	 * @see #getCD()
	 * @generated
	 */
	EAttribute getCD_DisplayName();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CR <em>CR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CR</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.CR
	 * @generated
	 */
	EClass getCR();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CR#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.CR#getName()
	 * @see #getCR()
	 * @generated
	 */
	EReference getCR_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CR#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.CR#getValue()
	 * @see #getCR()
	 * @generated
	 */
	EReference getCR_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CR#isInverted <em>Inverted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverted</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.CR#isInverted()
	 * @see #getCR()
	 * @generated
	 */
	EAttribute getCR_Inverted();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CV <em>CV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CV</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.CV
	 * @generated
	 */
	EClass getCV();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CE <em>CE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CE</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.CE
	 * @generated
	 */
	EClass getCE();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.II <em>II</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>II</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.II
	 * @generated
	 */
	EClass getII();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.II#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.II#getRoot()
	 * @see #getII()
	 * @generated
	 */
	EAttribute getII_Root();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.II#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.II#getExtension()
	 * @see #getII()
	 * @generated
	 */
	EAttribute getII_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.II#getAssigningAuthorityName <em>Assigning Authority Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigning Authority Name</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.II#getAssigningAuthorityName()
	 * @see #getII()
	 * @generated
	 */
	EAttribute getII_AssigningAuthorityName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.II#getDisplayable <em>Displayable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Displayable</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.II#getDisplayable()
	 * @see #getII()
	 * @generated
	 */
	EAttribute getII_Displayable();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.BL <em>BL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BL</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.BL
	 * @generated
	 */
	EClass getBL();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.BL#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.BL#getValue()
	 * @see #getBL()
	 * @generated
	 */
	EAttribute getBL_Value();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.BN <em>BN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BN</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.BN
	 * @generated
	 */
	EClass getBN();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD <em>AD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AD</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD
	 * @generated
	 */
	EClass getAD();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getUseablePeriods <em>Useable Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Useable Period</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getUseablePeriods()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_UseablePeriod();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getUses <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Use</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getUses()
	 * @see #getAD()
	 * @generated
	 */
	EAttribute getAD_Use();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getIsNotOrdered <em>Is Not Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Not Ordered</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getIsNotOrdered()
	 * @see #getAD()
	 * @generated
	 */
	EAttribute getAD_IsNotOrdered();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDelimiters <em>Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delimiter</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDelimiters()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_Delimiter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getCountries <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Country</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getCountries()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_Country();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getStates <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getStates()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_State();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getCounties <em>County</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>County</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getCounties()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_County();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getCities <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>City</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getCities()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_City();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getPostalCodes <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postal Code</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getPostalCodes()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_PostalCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getStreetAddressLines <em>Street Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Street Address Line</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getStreetAddressLines()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_StreetAddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getHouseNumbers <em>House Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>House Number</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getHouseNumbers()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_HouseNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getHouseNumberNumerics <em>House Number Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>House Number Numeric</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getHouseNumberNumerics()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_HouseNumberNumeric();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDirections <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Direction</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDirections()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_Direction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getStreetNames <em>Street Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Street Name</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getStreetNames()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_StreetName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getStreetNameBases <em>Street Name Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Street Name Base</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getStreetNameBases()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_StreetNameBase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getStreetNameTypes <em>Street Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Street Name Type</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getStreetNameTypes()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_StreetNameType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getAdditionalLocators <em>Additional Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Locator</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getAdditionalLocators()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_AdditionalLocator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getUnitIDs <em>Unit ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit ID</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getUnitIDs()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_UnitID();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getUnitTypes <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit Type</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getUnitTypes()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_UnitType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getCareOfs <em>Care Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Care Of</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getCareOfs()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_CareOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getCensusTracts <em>Census Tract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Census Tract</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getCensusTracts()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_CensusTract();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDeliveryAddressLines <em>Delivery Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delivery Address Line</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDeliveryAddressLines()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_DeliveryAddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDeliveryInstallationTypes <em>Delivery Installation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delivery Installation Type</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDeliveryInstallationTypes()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_DeliveryInstallationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDeliveryInstallationAreas <em>Delivery Installation Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delivery Installation Area</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDeliveryInstallationAreas()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_DeliveryInstallationArea();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDeliveryInstallationQualifiers <em>Delivery Installation Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delivery Installation Qualifier</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDeliveryInstallationQualifiers()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_DeliveryInstallationQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDeliveryModes <em>Delivery Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delivery Mode</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDeliveryModes()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_DeliveryMode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDeliveryModeIdentifiers <em>Delivery Mode Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delivery Mode Identifier</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getDeliveryModeIdentifiers()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_DeliveryModeIdentifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getBuildingNumberSuffixes <em>Building Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Building Number Suffix</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getBuildingNumberSuffixes()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_BuildingNumberSuffix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getPostBoxes <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Box</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getPostBoxes()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_PostBox();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getPrecincts <em>Precinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precinct</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getPrecincts()
	 * @see #getAD()
	 * @generated
	 */
	EReference getAD_Precinct();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getParts <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Part</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getParts()
	 * @see #getAD()
	 * @generated
	 */
	EAttribute getAD_Part();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.AD#getMixed()
	 * @see #getAD()
	 * @generated
	 */
	EAttribute getAD_Mixed();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP <em>ADXP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADXP</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.ADXP
	 * @generated
	 */
	EClass getADXP();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP#getPartType <em>Part Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Type</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.ADXP#getPartType()
	 * @see #getADXP()
	 * @generated
	 */
	EAttribute getADXP_PartType();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN <em>EN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EN</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.EN
	 * @generated
	 */
	EClass getEN();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getUses <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Use</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.EN#getUses()
	 * @see #getEN()
	 * @generated
	 */
	EAttribute getEN_Use();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getValidTime <em>Valid Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid Time</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.EN#getValidTime()
	 * @see #getEN()
	 * @generated
	 */
	EReference getEN_ValidTime();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getDelimiters <em>Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delimiter</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.EN#getDelimiters()
	 * @see #getEN()
	 * @generated
	 */
	EReference getEN_Delimiter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getFamilies <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Family</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.EN#getFamilies()
	 * @see #getEN()
	 * @generated
	 */
	EReference getEN_Family();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getGivens <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Given</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.EN#getGivens()
	 * @see #getEN()
	 * @generated
	 */
	EReference getEN_Given();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getPrefixes <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prefix</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.EN#getPrefixes()
	 * @see #getEN()
	 * @generated
	 */
	EReference getEN_Prefix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getSuffixes <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Suffix</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.EN#getSuffixes()
	 * @see #getEN()
	 * @generated
	 */
	EReference getEN_Suffix();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getParts <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Part</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.EN#getParts()
	 * @see #getEN()
	 * @generated
	 */
	EAttribute getEN_Part();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.EN#getMixed()
	 * @see #getEN()
	 * @generated
	 */
	EAttribute getEN_Mixed();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS <em>IVL TS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IVL TS</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS
	 * @generated
	 */
	EClass getIVL_TS();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Low</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS#getLow()
	 * @see #getIVL_TS()
	 * @generated
	 */
	EReference getIVL_TS_Low();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Center</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS#getCenter()
	 * @see #getIVL_TS()
	 * @generated
	 */
	EReference getIVL_TS_Center();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>High</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS#getHigh()
	 * @see #getIVL_TS()
	 * @generated
	 */
	EReference getIVL_TS_High();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Width</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS#getWidth()
	 * @see #getIVL_TS()
	 * @generated
	 */
	EReference getIVL_TS_Width();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS <em>IVXB TS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IVXB TS</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS
	 * @generated
	 */
	EClass getIVXB_TS();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS#getInclusive <em>Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inclusive</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS#getInclusive()
	 * @see #getIVXB_TS()
	 * @generated
	 */
	EAttribute getIVXB_TS_Inclusive();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PQ <em>PQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PQ</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.PQ
	 * @generated
	 */
	EClass getPQ();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PQ#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.PQ#getValue()
	 * @see #getPQ()
	 * @generated
	 */
	EAttribute getPQ_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PQ#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.PQ#getUnit()
	 * @see #getPQ()
	 * @generated
	 */
	EAttribute getPQ_Unit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PQ#getTranslations <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translation</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.PQ#getTranslations()
	 * @see #getPQ()
	 * @generated
	 */
	EReference getPQ_Translation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PQR <em>PQR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PQR</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.PQR
	 * @generated
	 */
	EClass getPQR();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PQR#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.PQR#getValue()
	 * @see #getPQR()
	 * @generated
	 */
	EAttribute getPQR_Value();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ENXP <em>ENXP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENXP</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.ENXP
	 * @generated
	 */
	EClass getENXP();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ENXP#getPartType <em>Part Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Type</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.ENXP#getPartType()
	 * @see #getENXP()
	 * @generated
	 */
	EAttribute getENXP_PartType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ENXP#getQualifiers <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Qualifier</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.ENXP#getQualifiers()
	 * @see #getENXP()
	 * @generated
	 */
	EAttribute getENXP_Qualifier();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ON <em>ON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ON</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.ON
	 * @generated
	 */
	EClass getON();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PN <em>PN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PN</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.PN
	 * @generated
	 */
	EClass getPN();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.TN <em>TN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TN</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.TN
	 * @generated
	 */
	EClass getTN();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.INT <em>INT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INT</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.INT
	 * @generated
	 */
	EClass getINT();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.INT#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.INT#getValue()
	 * @see #getINT()
	 * @generated
	 */
	EAttribute getINT_Value();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.REAL <em>REAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REAL</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.REAL
	 * @generated
	 */
	EClass getREAL();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.REAL#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.REAL#getValue()
	 * @see #getREAL()
	 * @generated
	 */
	EAttribute getREAL_Value();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CS <em>CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CS</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.CS
	 * @generated
	 */
	EClass getCS();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CO <em>CO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CO</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.CO
	 * @generated
	 */
	EClass getCO();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.SC <em>SC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SC</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.SC
	 * @generated
	 */
	EClass getSC();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.SC#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.SC#getCode()
	 * @see #getSC()
	 * @generated
	 */
	EAttribute getSC_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.SC#getCodeSystem <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code System</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.SC#getCodeSystem()
	 * @see #getSC()
	 * @generated
	 */
	EAttribute getSC_CodeSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.SC#getCodeSystemName <em>Code System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code System Name</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.SC#getCodeSystemName()
	 * @see #getSC()
	 * @generated
	 */
	EAttribute getSC_CodeSystemName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.SC#getCodeSystemVersion <em>Code System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code System Version</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.SC#getCodeSystemVersion()
	 * @see #getSC()
	 * @generated
	 */
	EAttribute getSC_CodeSystemVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.SC#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.SC#getDisplayName()
	 * @see #getSC()
	 * @generated
	 */
	EAttribute getSC_DisplayName();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.RTO_QTY_QTY <em>RTO QTY QTY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTO QTY QTY</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.RTO_QTY_QTY
	 * @generated
	 */
	EClass getRTO_QTY_QTY();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.RTO_QTY_QTY#getNumerator <em>Numerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numerator</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.RTO_QTY_QTY#getNumerator()
	 * @see #getRTO_QTY_QTY()
	 * @generated
	 */
	EReference getRTO_QTY_QTY_Numerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.RTO_QTY_QTY#getDenominator <em>Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Denominator</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.RTO_QTY_QTY#getDenominator()
	 * @see #getRTO_QTY_QTY()
	 * @generated
	 */
	EReference getRTO_QTY_QTY_Denominator();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.MO <em>MO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MO</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.MO
	 * @generated
	 */
	EClass getMO();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.MO#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.MO#getValue()
	 * @see #getMO()
	 * @generated
	 */
	EAttribute getMO_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.MO#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.MO#getCurrency()
	 * @see #getMO()
	 * @generated
	 */
	EAttribute getMO_Currency();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.RTO <em>RTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTO</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.RTO
	 * @generated
	 */
	EClass getRTO();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_INT <em>SXCM INT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SXCM INT</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_INT
	 * @generated
	 */
	EClass getSXCM_INT();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_INT#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_INT#getOperator()
	 * @see #getSXCM_INT()
	 * @generated
	 */
	EAttribute getSXCM_INT_Operator();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_INT <em>IVXB INT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IVXB INT</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_INT
	 * @generated
	 */
	EClass getIVXB_INT();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_INT#getInclusive <em>Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inclusive</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_INT#getInclusive()
	 * @see #getIVXB_INT()
	 * @generated
	 */
	EAttribute getIVXB_INT_Inclusive();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT <em>IVL INT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IVL INT</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT
	 * @generated
	 */
	EClass getIVL_INT();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Low</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT#getLow()
	 * @see #getIVL_INT()
	 * @generated
	 */
	EReference getIVL_INT_Low();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Center</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT#getCenter()
	 * @see #getIVL_INT()
	 * @generated
	 */
	EReference getIVL_INT_Center();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>High</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT#getHigh()
	 * @see #getIVL_INT()
	 * @generated
	 */
	EReference getIVL_INT_High();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Width</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT#getWidth()
	 * @see #getIVL_INT()
	 * @generated
	 */
	EReference getIVL_INT_Width();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_PQ <em>IVXB PQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IVXB PQ</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_PQ
	 * @generated
	 */
	EClass getIVXB_PQ();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_PQ#getInclusive <em>Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inclusive</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_PQ#getInclusive()
	 * @see #getIVXB_PQ()
	 * @generated
	 */
	EAttribute getIVXB_PQ_Inclusive();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_PQ <em>SXCM PQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SXCM PQ</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_PQ
	 * @generated
	 */
	EClass getSXCM_PQ();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_PQ#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_PQ#getOperator()
	 * @see #getSXCM_PQ()
	 * @generated
	 */
	EAttribute getSXCM_PQ_Operator();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ <em>IVL PQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IVL PQ</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ
	 * @generated
	 */
	EClass getIVL_PQ();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Low</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#getLow()
	 * @see #getIVL_PQ()
	 * @generated
	 */
	EReference getIVL_PQ_Low();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Center</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#getCenter()
	 * @see #getIVL_PQ()
	 * @generated
	 */
	EReference getIVL_PQ_Center();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>High</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#getHigh()
	 * @see #getIVL_PQ()
	 * @generated
	 */
	EReference getIVL_PQ_High();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Width</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#getWidth()
	 * @see #getIVL_PQ()
	 * @generated
	 */
	EReference getIVL_PQ_Width();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ <em>RTO PQ PQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTO PQ PQ</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ
	 * @generated
	 */
	EClass getRTO_PQ_PQ();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ#getNumerator <em>Numerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numerator</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ#getNumerator()
	 * @see #getRTO_PQ_PQ()
	 * @generated
	 */
	EReference getRTO_PQ_PQ_Numerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ#getDenominator <em>Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Denominator</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ#getDenominator()
	 * @see #getRTO_PQ_PQ()
	 * @generated
	 */
	EReference getRTO_PQ_PQ_Denominator();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS <em>PIVL TS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PIVL TS</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS
	 * @generated
	 */
	EClass getPIVL_TS();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phase</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS#getPhase()
	 * @see #getPIVL_TS()
	 * @generated
	 */
	EReference getPIVL_TS_Phase();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS#getPeriod()
	 * @see #getPIVL_TS()
	 * @generated
	 */
	EReference getPIVL_TS_Period();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS#getAlignment()
	 * @see #getPIVL_TS()
	 * @generated
	 */
	EAttribute getPIVL_TS_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS#getInstitutionSpecified <em>Institution Specified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institution Specified</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS#getInstitutionSpecified()
	 * @see #getPIVL_TS()
	 * @generated
	 */
	EAttribute getPIVL_TS_InstitutionSpecified();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event <em>EIVL event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EIVL event</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event
	 * @generated
	 */
	EClass getEIVL_event();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_TS <em>EIVL TS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EIVL TS</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_TS
	 * @generated
	 */
	EClass getEIVL_TS();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_TS#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_TS#getEvent()
	 * @see #getEIVL_TS()
	 * @generated
	 */
	EReference getEIVL_TS_Event();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_TS#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_TS#getOffset()
	 * @see #getEIVL_TS()
	 * @generated
	 */
	EReference getEIVL_TS_Offset();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.hl7.datatypes.BinaryDataEncoding <em>Binary Data Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Data Encoding</em>'.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.BinaryDataEncoding
	 * @generated
	 */
	EEnum getBinaryDataEncoding();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesFactory getDatatypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ANYImpl <em>ANY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.ANYImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getANY()
		 * @generated
		 */
		EClass ANY = eINSTANCE.getANY();

		/**
		 * The meta object literal for the '<em><b>Null Flavor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY__NULL_FLAVOR = eINSTANCE.getANY_NullFlavor();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.BINImpl <em>BIN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.BINImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getBIN()
		 * @generated
		 */
		EClass BIN = eINSTANCE.getBIN();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIN__REPRESENTATION = eINSTANCE.getBIN_Representation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.EDImpl <em>ED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.EDImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getED()
		 * @generated
		 */
		EClass ED = eINSTANCE.getED();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED__MIXED = eINSTANCE.getED_Mixed();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ED__REFERENCE = eINSTANCE.getED_Reference();

		/**
		 * The meta object literal for the '<em><b>Thumbnail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ED__THUMBNAIL = eINSTANCE.getED_Thumbnail();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED__MEDIA_TYPE = eINSTANCE.getED_MediaType();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED__LANGUAGE = eINSTANCE.getED_Language();

		/**
		 * The meta object literal for the '<em><b>Compression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED__COMPRESSION = eINSTANCE.getED_Compression();

		/**
		 * The meta object literal for the '<em><b>Integrity Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED__INTEGRITY_CHECK = eINSTANCE.getED_IntegrityCheck();

		/**
		 * The meta object literal for the '<em><b>Integrity Check Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED__INTEGRITY_CHECK_ALGORITHM = eINSTANCE.getED_IntegrityCheckAlgorithm();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.TELImpl <em>TEL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.TELImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getTEL()
		 * @generated
		 */
		EClass TEL = eINSTANCE.getTEL();

		/**
		 * The meta object literal for the '<em><b>Useable Period</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEL__USEABLE_PERIOD = eINSTANCE.getTEL_UseablePeriod();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEL__USE = eINSTANCE.getTEL_Use();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.URLImpl <em>URL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.URLImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getURL()
		 * @generated
		 */
		EClass URL = eINSTANCE.getURL();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL__VALUE = eINSTANCE.getURL_Value();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.SXCM_TSImpl <em>SXCM TS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.SXCM_TSImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getSXCM_TS()
		 * @generated
		 */
		EClass SXCM_TS = eINSTANCE.getSXCM_TS();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SXCM_TS__OPERATOR = eINSTANCE.getSXCM_TS_Operator();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.TSImpl <em>TS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.TSImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getTS()
		 * @generated
		 */
		EClass TS = eINSTANCE.getTS();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TS__VALUE = eINSTANCE.getTS_Value();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.QTYImpl <em>QTY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.QTYImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getQTY()
		 * @generated
		 */
		EClass QTY = eINSTANCE.getQTY();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.STImpl <em>ST</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.STImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getST()
		 * @generated
		 */
		EClass ST = eINSTANCE.getST();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CDImpl <em>CD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.CDImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getCD()
		 * @generated
		 */
		EClass CD = eINSTANCE.getCD();

		/**
		 * The meta object literal for the '<em><b>Original Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD__ORIGINAL_TEXT = eINSTANCE.getCD_OriginalText();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD__QUALIFIER = eINSTANCE.getCD_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CD__TRANSLATION = eINSTANCE.getCD_Translation();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CD__CODE = eINSTANCE.getCD_Code();

		/**
		 * The meta object literal for the '<em><b>Code System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CD__CODE_SYSTEM = eINSTANCE.getCD_CodeSystem();

		/**
		 * The meta object literal for the '<em><b>Code System Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CD__CODE_SYSTEM_NAME = eINSTANCE.getCD_CodeSystemName();

		/**
		 * The meta object literal for the '<em><b>Code System Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CD__CODE_SYSTEM_VERSION = eINSTANCE.getCD_CodeSystemVersion();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CD__DISPLAY_NAME = eINSTANCE.getCD_DisplayName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CRImpl <em>CR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.CRImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getCR()
		 * @generated
		 */
		EClass CR = eINSTANCE.getCR();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CR__NAME = eINSTANCE.getCR_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CR__VALUE = eINSTANCE.getCR_Value();

		/**
		 * The meta object literal for the '<em><b>Inverted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CR__INVERTED = eINSTANCE.getCR_Inverted();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CVImpl <em>CV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.CVImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getCV()
		 * @generated
		 */
		EClass CV = eINSTANCE.getCV();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CEImpl <em>CE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.CEImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getCE()
		 * @generated
		 */
		EClass CE = eINSTANCE.getCE();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IIImpl <em>II</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.IIImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getII()
		 * @generated
		 */
		EClass II = eINSTANCE.getII();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute II__ROOT = eINSTANCE.getII_Root();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute II__EXTENSION = eINSTANCE.getII_Extension();

		/**
		 * The meta object literal for the '<em><b>Assigning Authority Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute II__ASSIGNING_AUTHORITY_NAME = eINSTANCE.getII_AssigningAuthorityName();

		/**
		 * The meta object literal for the '<em><b>Displayable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute II__DISPLAYABLE = eINSTANCE.getII_Displayable();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.BLImpl <em>BL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.BLImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getBL()
		 * @generated
		 */
		EClass BL = eINSTANCE.getBL();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BL__VALUE = eINSTANCE.getBL_Value();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.BNImpl <em>BN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.BNImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getBN()
		 * @generated
		 */
		EClass BN = eINSTANCE.getBN();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl <em>AD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getAD()
		 * @generated
		 */
		EClass AD = eINSTANCE.getAD();

		/**
		 * The meta object literal for the '<em><b>Useable Period</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__USEABLE_PERIOD = eINSTANCE.getAD_UseablePeriod();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AD__USE = eINSTANCE.getAD_Use();

		/**
		 * The meta object literal for the '<em><b>Is Not Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AD__IS_NOT_ORDERED = eINSTANCE.getAD_IsNotOrdered();

		/**
		 * The meta object literal for the '<em><b>Delimiter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__DELIMITER = eINSTANCE.getAD_Delimiter();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__COUNTRY = eINSTANCE.getAD_Country();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__STATE = eINSTANCE.getAD_State();

		/**
		 * The meta object literal for the '<em><b>County</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__COUNTY = eINSTANCE.getAD_County();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__CITY = eINSTANCE.getAD_City();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__POSTAL_CODE = eINSTANCE.getAD_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Street Address Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__STREET_ADDRESS_LINE = eINSTANCE.getAD_StreetAddressLine();

		/**
		 * The meta object literal for the '<em><b>House Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__HOUSE_NUMBER = eINSTANCE.getAD_HouseNumber();

		/**
		 * The meta object literal for the '<em><b>House Number Numeric</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__HOUSE_NUMBER_NUMERIC = eINSTANCE.getAD_HouseNumberNumeric();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__DIRECTION = eINSTANCE.getAD_Direction();

		/**
		 * The meta object literal for the '<em><b>Street Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__STREET_NAME = eINSTANCE.getAD_StreetName();

		/**
		 * The meta object literal for the '<em><b>Street Name Base</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__STREET_NAME_BASE = eINSTANCE.getAD_StreetNameBase();

		/**
		 * The meta object literal for the '<em><b>Street Name Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__STREET_NAME_TYPE = eINSTANCE.getAD_StreetNameType();

		/**
		 * The meta object literal for the '<em><b>Additional Locator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__ADDITIONAL_LOCATOR = eINSTANCE.getAD_AdditionalLocator();

		/**
		 * The meta object literal for the '<em><b>Unit ID</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__UNIT_ID = eINSTANCE.getAD_UnitID();

		/**
		 * The meta object literal for the '<em><b>Unit Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__UNIT_TYPE = eINSTANCE.getAD_UnitType();

		/**
		 * The meta object literal for the '<em><b>Care Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__CARE_OF = eINSTANCE.getAD_CareOf();

		/**
		 * The meta object literal for the '<em><b>Census Tract</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__CENSUS_TRACT = eINSTANCE.getAD_CensusTract();

		/**
		 * The meta object literal for the '<em><b>Delivery Address Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__DELIVERY_ADDRESS_LINE = eINSTANCE.getAD_DeliveryAddressLine();

		/**
		 * The meta object literal for the '<em><b>Delivery Installation Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__DELIVERY_INSTALLATION_TYPE = eINSTANCE.getAD_DeliveryInstallationType();

		/**
		 * The meta object literal for the '<em><b>Delivery Installation Area</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__DELIVERY_INSTALLATION_AREA = eINSTANCE.getAD_DeliveryInstallationArea();

		/**
		 * The meta object literal for the '<em><b>Delivery Installation Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__DELIVERY_INSTALLATION_QUALIFIER = eINSTANCE.getAD_DeliveryInstallationQualifier();

		/**
		 * The meta object literal for the '<em><b>Delivery Mode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__DELIVERY_MODE = eINSTANCE.getAD_DeliveryMode();

		/**
		 * The meta object literal for the '<em><b>Delivery Mode Identifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__DELIVERY_MODE_IDENTIFIER = eINSTANCE.getAD_DeliveryModeIdentifier();

		/**
		 * The meta object literal for the '<em><b>Building Number Suffix</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__BUILDING_NUMBER_SUFFIX = eINSTANCE.getAD_BuildingNumberSuffix();

		/**
		 * The meta object literal for the '<em><b>Post Box</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__POST_BOX = eINSTANCE.getAD_PostBox();

		/**
		 * The meta object literal for the '<em><b>Precinct</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD__PRECINCT = eINSTANCE.getAD_Precinct();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AD__PART = eINSTANCE.getAD_Part();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AD__MIXED = eINSTANCE.getAD_Mixed();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADXPImpl <em>ADXP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.ADXPImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getADXP()
		 * @generated
		 */
		EClass ADXP = eINSTANCE.getADXP();

		/**
		 * The meta object literal for the '<em><b>Part Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADXP__PART_TYPE = eINSTANCE.getADXP_PartType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENImpl <em>EN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getEN()
		 * @generated
		 */
		EClass EN = eINSTANCE.getEN();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EN__USE = eINSTANCE.getEN_Use();

		/**
		 * The meta object literal for the '<em><b>Valid Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EN__VALID_TIME = eINSTANCE.getEN_ValidTime();

		/**
		 * The meta object literal for the '<em><b>Delimiter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EN__DELIMITER = eINSTANCE.getEN_Delimiter();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EN__FAMILY = eINSTANCE.getEN_Family();

		/**
		 * The meta object literal for the '<em><b>Given</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EN__GIVEN = eINSTANCE.getEN_Given();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EN__PREFIX = eINSTANCE.getEN_Prefix();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EN__SUFFIX = eINSTANCE.getEN_Suffix();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EN__PART = eINSTANCE.getEN_Part();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EN__MIXED = eINSTANCE.getEN_Mixed();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVL_TSImpl <em>IVL TS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVL_TSImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getIVL_TS()
		 * @generated
		 */
		EClass IVL_TS = eINSTANCE.getIVL_TS();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVL_TS__LOW = eINSTANCE.getIVL_TS_Low();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVL_TS__CENTER = eINSTANCE.getIVL_TS_Center();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVL_TS__HIGH = eINSTANCE.getIVL_TS_High();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVL_TS__WIDTH = eINSTANCE.getIVL_TS_Width();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVXB_TSImpl <em>IVXB TS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVXB_TSImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getIVXB_TS()
		 * @generated
		 */
		EClass IVXB_TS = eINSTANCE.getIVXB_TS();

		/**
		 * The meta object literal for the '<em><b>Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IVXB_TS__INCLUSIVE = eINSTANCE.getIVXB_TS_Inclusive();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.PQImpl <em>PQ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.PQImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getPQ()
		 * @generated
		 */
		EClass PQ = eINSTANCE.getPQ();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PQ__VALUE = eINSTANCE.getPQ_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PQ__UNIT = eINSTANCE.getPQ_Unit();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PQ__TRANSLATION = eINSTANCE.getPQ_Translation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.PQRImpl <em>PQR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.PQRImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getPQR()
		 * @generated
		 */
		EClass PQR = eINSTANCE.getPQR();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PQR__VALUE = eINSTANCE.getPQR_Value();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENXPImpl <em>ENXP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENXPImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getENXP()
		 * @generated
		 */
		EClass ENXP = eINSTANCE.getENXP();

		/**
		 * The meta object literal for the '<em><b>Part Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENXP__PART_TYPE = eINSTANCE.getENXP_PartType();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENXP__QUALIFIER = eINSTANCE.getENXP_Qualifier();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ONImpl <em>ON</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.ONImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getON()
		 * @generated
		 */
		EClass ON = eINSTANCE.getON();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.PNImpl <em>PN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.PNImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getPN()
		 * @generated
		 */
		EClass PN = eINSTANCE.getPN();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.TNImpl <em>TN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.TNImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getTN()
		 * @generated
		 */
		EClass TN = eINSTANCE.getTN();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.INTImpl <em>INT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.INTImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getINT()
		 * @generated
		 */
		EClass INT = eINSTANCE.getINT();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT__VALUE = eINSTANCE.getINT_Value();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.REALImpl <em>REAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.REALImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getREAL()
		 * @generated
		 */
		EClass REAL = eINSTANCE.getREAL();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL__VALUE = eINSTANCE.getREAL_Value();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.CSImpl <em>CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.CSImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getCS()
		 * @generated
		 */
		EClass CS = eINSTANCE.getCS();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.COImpl <em>CO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.COImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getCO()
		 * @generated
		 */
		EClass CO = eINSTANCE.getCO();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.SCImpl <em>SC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.SCImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getSC()
		 * @generated
		 */
		EClass SC = eINSTANCE.getSC();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SC__CODE = eINSTANCE.getSC_Code();

		/**
		 * The meta object literal for the '<em><b>Code System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SC__CODE_SYSTEM = eINSTANCE.getSC_CodeSystem();

		/**
		 * The meta object literal for the '<em><b>Code System Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SC__CODE_SYSTEM_NAME = eINSTANCE.getSC_CodeSystemName();

		/**
		 * The meta object literal for the '<em><b>Code System Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SC__CODE_SYSTEM_VERSION = eINSTANCE.getSC_CodeSystemVersion();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SC__DISPLAY_NAME = eINSTANCE.getSC_DisplayName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.RTO_QTY_QTYImpl <em>RTO QTY QTY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.RTO_QTY_QTYImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getRTO_QTY_QTY()
		 * @generated
		 */
		EClass RTO_QTY_QTY = eINSTANCE.getRTO_QTY_QTY();

		/**
		 * The meta object literal for the '<em><b>Numerator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTO_QTY_QTY__NUMERATOR = eINSTANCE.getRTO_QTY_QTY_Numerator();

		/**
		 * The meta object literal for the '<em><b>Denominator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTO_QTY_QTY__DENOMINATOR = eINSTANCE.getRTO_QTY_QTY_Denominator();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.MOImpl <em>MO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.MOImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getMO()
		 * @generated
		 */
		EClass MO = eINSTANCE.getMO();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MO__VALUE = eINSTANCE.getMO_Value();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MO__CURRENCY = eINSTANCE.getMO_Currency();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.RTOImpl <em>RTO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.RTOImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getRTO()
		 * @generated
		 */
		EClass RTO = eINSTANCE.getRTO();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.SXCM_INTImpl <em>SXCM INT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.SXCM_INTImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getSXCM_INT()
		 * @generated
		 */
		EClass SXCM_INT = eINSTANCE.getSXCM_INT();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SXCM_INT__OPERATOR = eINSTANCE.getSXCM_INT_Operator();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVXB_INTImpl <em>IVXB INT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVXB_INTImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getIVXB_INT()
		 * @generated
		 */
		EClass IVXB_INT = eINSTANCE.getIVXB_INT();

		/**
		 * The meta object literal for the '<em><b>Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IVXB_INT__INCLUSIVE = eINSTANCE.getIVXB_INT_Inclusive();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVL_INTImpl <em>IVL INT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVL_INTImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getIVL_INT()
		 * @generated
		 */
		EClass IVL_INT = eINSTANCE.getIVL_INT();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVL_INT__LOW = eINSTANCE.getIVL_INT_Low();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVL_INT__CENTER = eINSTANCE.getIVL_INT_Center();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVL_INT__HIGH = eINSTANCE.getIVL_INT_High();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVL_INT__WIDTH = eINSTANCE.getIVL_INT_Width();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVXB_PQImpl <em>IVXB PQ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVXB_PQImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getIVXB_PQ()
		 * @generated
		 */
		EClass IVXB_PQ = eINSTANCE.getIVXB_PQ();

		/**
		 * The meta object literal for the '<em><b>Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IVXB_PQ__INCLUSIVE = eINSTANCE.getIVXB_PQ_Inclusive();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.SXCM_PQImpl <em>SXCM PQ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.SXCM_PQImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getSXCM_PQ()
		 * @generated
		 */
		EClass SXCM_PQ = eINSTANCE.getSXCM_PQ();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SXCM_PQ__OPERATOR = eINSTANCE.getSXCM_PQ_Operator();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVL_PQImpl <em>IVL PQ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVL_PQImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getIVL_PQ()
		 * @generated
		 */
		EClass IVL_PQ = eINSTANCE.getIVL_PQ();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVL_PQ__LOW = eINSTANCE.getIVL_PQ_Low();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVL_PQ__CENTER = eINSTANCE.getIVL_PQ_Center();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVL_PQ__HIGH = eINSTANCE.getIVL_PQ_High();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVL_PQ__WIDTH = eINSTANCE.getIVL_PQ_Width();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.RTO_PQ_PQImpl <em>RTO PQ PQ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.RTO_PQ_PQImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getRTO_PQ_PQ()
		 * @generated
		 */
		EClass RTO_PQ_PQ = eINSTANCE.getRTO_PQ_PQ();

		/**
		 * The meta object literal for the '<em><b>Numerator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTO_PQ_PQ__NUMERATOR = eINSTANCE.getRTO_PQ_PQ_Numerator();

		/**
		 * The meta object literal for the '<em><b>Denominator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTO_PQ_PQ__DENOMINATOR = eINSTANCE.getRTO_PQ_PQ_Denominator();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.PIVL_TSImpl <em>PIVL TS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.PIVL_TSImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getPIVL_TS()
		 * @generated
		 */
		EClass PIVL_TS = eINSTANCE.getPIVL_TS();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIVL_TS__PHASE = eINSTANCE.getPIVL_TS_Phase();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIVL_TS__PERIOD = eINSTANCE.getPIVL_TS_Period();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIVL_TS__ALIGNMENT = eINSTANCE.getPIVL_TS_Alignment();

		/**
		 * The meta object literal for the '<em><b>Institution Specified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIVL_TS__INSTITUTION_SPECIFIED = eINSTANCE.getPIVL_TS_InstitutionSpecified();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.EIVL_eventImpl <em>EIVL event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.EIVL_eventImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getEIVL_event()
		 * @generated
		 */
		EClass EIVL_EVENT = eINSTANCE.getEIVL_event();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.EIVL_TSImpl <em>EIVL TS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.EIVL_TSImpl
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getEIVL_TS()
		 * @generated
		 */
		EClass EIVL_TS = eINSTANCE.getEIVL_TS();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EIVL_TS__EVENT = eINSTANCE.getEIVL_TS_Event();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EIVL_TS__OFFSET = eINSTANCE.getEIVL_TS_Offset();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.BinaryDataEncoding <em>Binary Data Encoding</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.BinaryDataEncoding
		 * @see org.openhealthtools.mdht.uml.hl7.datatypes.impl.DatatypesPackageImpl#getBinaryDataEncoding()
		 * @generated
		 */
		EEnum BINARY_DATA_ENCODING = eINSTANCE.getBinaryDataEncoding();

	}

} //DatatypesPackage
