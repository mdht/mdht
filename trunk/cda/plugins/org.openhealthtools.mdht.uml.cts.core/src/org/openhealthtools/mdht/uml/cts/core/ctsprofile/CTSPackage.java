/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cts.core.ctsprofile;

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
 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CTSFactory
 * @model kind="package"
 * @generated
 */
public interface CTSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ctsprofile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openhealthtools.org/mdht/schemas/cts/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CTS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CTSPackage eINSTANCE = org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CDImpl <em>CD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CDImpl
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getCD()
	 * @generated
	 */
	int CD = 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__QUALIFIER = 0;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__TRANSLATION = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__CODE = 2;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__CODE_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__CODE_SYSTEM_NAME = 4;

	/**
	 * The feature id for the '<em><b>Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__CODE_SYSTEM_VERSION = 5;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD__DISPLAY_NAME = 6;

	/**
	 * The number of structural features of the '<em>CD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CD_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CRImpl <em>CR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CRImpl
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getCR()
	 * @generated
	 */
	int CR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR__INVERTED = 2;

	/**
	 * The number of structural features of the '<em>CR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ConceptDomainConstraintImpl <em>Concept Domain Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ConceptDomainConstraintImpl
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getConceptDomainConstraint()
	 * @generated
	 */
	int CONCEPT_DOMAIN_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__BASE_PROPERTY = 3;

	/**
	 * The number of structural features of the '<em>Concept Domain Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ConceptDomainImpl <em>Concept Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ConceptDomainImpl
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getConceptDomain()
	 * @generated
	 */
	int CONCEPT_DOMAIN = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN__FULL_NAME = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN__STATUS_DATE = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN__BASE_CLASS = 4;

	/**
	 * The number of structural features of the '<em>Concept Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CodeSystemConstraintImpl <em>Code System Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CodeSystemConstraintImpl
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getCodeSystemConstraint()
	 * @generated
	 */
	int CODE_SYSTEM_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__BINDING = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__CODE = 5;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__DISPLAY_NAME = 6;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__QUALIFIER = 7;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__BASE_PROPERTY = 8;

	/**
	 * The number of structural features of the '<em>Code System Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CodeSystemVersionImpl <em>Code System Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CodeSystemVersionImpl
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getCodeSystemVersion()
	 * @generated
	 */
	int CODE_SYSTEM_VERSION = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION__FULL_NAME = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION__URL = 4;

	/**
	 * The feature id for the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION__EFFECTIVE_DATE = 5;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION__RELEASE_DATE = 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION__STATUS = 7;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION__STATUS_DATE = 8;

	/**
	 * The feature id for the '<em><b>Base Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION__BASE_ENUMERATION = 9;

	/**
	 * The number of structural features of the '<em>Code System Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ValueSetConstraintImpl <em>Value Set Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ValueSetConstraintImpl
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getValueSetConstraint()
	 * @generated
	 */
	int VALUE_SET_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__BINDING = 4;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__BASE_PROPERTY = 5;

	/**
	 * The number of structural features of the '<em>Value Set Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ValueSetVersionImpl <em>Value Set Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ValueSetVersionImpl
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getValueSetVersion()
	 * @generated
	 */
	int VALUE_SET_VERSION = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_VERSION__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_VERSION__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_VERSION__FULL_NAME = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_VERSION__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_VERSION__URL = 4;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_VERSION__DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_VERSION__EFFECTIVE_DATE = 6;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_VERSION__EXPIRATION_DATE = 7;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_VERSION__RELEASE_DATE = 8;

	/**
	 * The feature id for the '<em><b>Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_VERSION__REVISION_DATE = 9;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_VERSION__STATUS = 10;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_VERSION__STATUS_DATE = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_VERSION__TYPE = 12;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_VERSION__BINDING = 13;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_VERSION__CODE_SYSTEM = 14;

	/**
	 * The feature id for the '<em><b>Base Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_VERSION__BASE_ENUMERATION = 15;

	/**
	 * The number of structural features of the '<em>Value Set Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_VERSION_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ValueSetCodeImpl <em>Value Set Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ValueSetCodeImpl
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getValueSetCode()
	 * @generated
	 */
	int VALUE_SET_CODE = 8;

	/**
	 * The feature id for the '<em><b>Concept Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CODE__CONCEPT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Usage Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CODE__USAGE_NOTE = 1;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CODE__CODE_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Base Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CODE__BASE_ENUMERATION_LITERAL = 3;

	/**
	 * The number of structural features of the '<em>Value Set Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CODE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ValueSetContextBindingImpl <em>Value Set Context Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ValueSetContextBindingImpl
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getValueSetContextBinding()
	 * @generated
	 */
	int VALUE_SET_CONTEXT_BINDING = 9;

	/**
	 * The feature id for the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONTEXT_BINDING__EFFECTIVE_DATE = 0;

	/**
	 * The feature id for the '<em><b>Concept Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONTEXT_BINDING__CONCEPT_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONTEXT_BINDING__VALUE_SET = 2;

	/**
	 * The feature id for the '<em><b>Usage Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONTEXT_BINDING__USAGE_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONTEXT_BINDING__BASE_CLASS = 4;

	/**
	 * The number of structural features of the '<em>Value Set Context Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONTEXT_BINDING_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.UsageContextImpl <em>Usage Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.UsageContextImpl
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getUsageContext()
	 * @generated
	 */
	int USAGE_CONTEXT = 10;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__STATUS_DATE = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT__BASE_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Usage Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CONTEXT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.BindingKind <em>Binding Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.BindingKind
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getBindingKind()
	 * @generated
	 */
	int BINDING_KIND = 11;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetType <em>Value Set Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetType
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getValueSetType()
	 * @generated
	 */
	int VALUE_SET_TYPE = 12;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.StatusKind <em>Status Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.StatusKind
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getStatusKind()
	 * @generated
	 */
	int STATUS_KIND = 13;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CD <em>CD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CD</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CD
	 * @generated
	 */
	EClass getCD();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CD#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualifier</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CD#getQualifier()
	 * @see #getCD()
	 * @generated
	 */
	EReference getCD_Qualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CD#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translation</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CD#getTranslation()
	 * @see #getCD()
	 * @generated
	 */
	EReference getCD_Translation();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CD#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CD#getCode()
	 * @see #getCD()
	 * @generated
	 */
	EAttribute getCD_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CD#getCodeSystem <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code System</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CD#getCodeSystem()
	 * @see #getCD()
	 * @generated
	 */
	EAttribute getCD_CodeSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CD#getCodeSystemName <em>Code System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code System Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CD#getCodeSystemName()
	 * @see #getCD()
	 * @generated
	 */
	EAttribute getCD_CodeSystemName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CD#getCodeSystemVersion <em>Code System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code System Version</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CD#getCodeSystemVersion()
	 * @see #getCD()
	 * @generated
	 */
	EAttribute getCD_CodeSystemVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CD#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CD#getDisplayName()
	 * @see #getCD()
	 * @generated
	 */
	EAttribute getCD_DisplayName();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CR <em>CR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CR</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CR
	 * @generated
	 */
	EClass getCR();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CR#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CR#getName()
	 * @see #getCR()
	 * @generated
	 */
	EReference getCR_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CR#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CR#getValue()
	 * @see #getCR()
	 * @generated
	 */
	EReference getCR_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CR#isInverted <em>Inverted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverted</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CR#isInverted()
	 * @see #getCR()
	 * @generated
	 */
	EAttribute getCR_Inverted();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomainConstraint <em>Concept Domain Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Domain Constraint</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomainConstraint
	 * @generated
	 */
	EClass getConceptDomainConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomainConstraint#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomainConstraint#getReference()
	 * @see #getConceptDomainConstraint()
	 * @generated
	 */
	EReference getConceptDomainConstraint_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomainConstraint#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomainConstraint#getIdentifier()
	 * @see #getConceptDomainConstraint()
	 * @generated
	 */
	EAttribute getConceptDomainConstraint_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomainConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomainConstraint#getName()
	 * @see #getConceptDomainConstraint()
	 * @generated
	 */
	EAttribute getConceptDomainConstraint_Name();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomainConstraint#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomainConstraint#getBase_Property()
	 * @see #getConceptDomainConstraint()
	 * @generated
	 */
	EReference getConceptDomainConstraint_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomain <em>Concept Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Domain</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomain
	 * @generated
	 */
	EClass getConceptDomain();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomain#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomain#getIdentifier()
	 * @see #getConceptDomain()
	 * @generated
	 */
	EAttribute getConceptDomain_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomain#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomain#getFullName()
	 * @see #getConceptDomain()
	 * @generated
	 */
	EAttribute getConceptDomain_FullName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomain#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomain#getStatus()
	 * @see #getConceptDomain()
	 * @generated
	 */
	EAttribute getConceptDomain_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomain#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomain#getStatusDate()
	 * @see #getConceptDomain()
	 * @generated
	 */
	EAttribute getConceptDomain_StatusDate();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomain#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ConceptDomain#getBase_Class()
	 * @see #getConceptDomain()
	 * @generated
	 */
	EReference getConceptDomain_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint <em>Code System Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code System Constraint</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint
	 * @generated
	 */
	EClass getCodeSystemConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint#getReference()
	 * @see #getCodeSystemConstraint()
	 * @generated
	 */
	EReference getCodeSystemConstraint_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint#getIdentifier()
	 * @see #getCodeSystemConstraint()
	 * @generated
	 */
	EAttribute getCodeSystemConstraint_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint#getName()
	 * @see #getCodeSystemConstraint()
	 * @generated
	 */
	EAttribute getCodeSystemConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint#getVersion()
	 * @see #getCodeSystemConstraint()
	 * @generated
	 */
	EAttribute getCodeSystemConstraint_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint#getBinding()
	 * @see #getCodeSystemConstraint()
	 * @generated
	 */
	EAttribute getCodeSystemConstraint_Binding();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint#getCode()
	 * @see #getCodeSystemConstraint()
	 * @generated
	 */
	EAttribute getCodeSystemConstraint_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint#getDisplayName()
	 * @see #getCodeSystemConstraint()
	 * @generated
	 */
	EAttribute getCodeSystemConstraint_DisplayName();

	/**
	 * Returns the meta object for the reference list '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualifier</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint#getQualifier()
	 * @see #getCodeSystemConstraint()
	 * @generated
	 */
	EReference getCodeSystemConstraint_Qualifier();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemConstraint#getBase_Property()
	 * @see #getCodeSystemConstraint()
	 * @generated
	 */
	EReference getCodeSystemConstraint_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion <em>Code System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code System Version</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion
	 * @generated
	 */
	EClass getCodeSystemVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getIdentifier()
	 * @see #getCodeSystemVersion()
	 * @generated
	 */
	EAttribute getCodeSystemVersion_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getVersion()
	 * @see #getCodeSystemVersion()
	 * @generated
	 */
	EAttribute getCodeSystemVersion_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getFullName()
	 * @see #getCodeSystemVersion()
	 * @generated
	 */
	EAttribute getCodeSystemVersion_FullName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getSource()
	 * @see #getCodeSystemVersion()
	 * @generated
	 */
	EAttribute getCodeSystemVersion_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getUrl()
	 * @see #getCodeSystemVersion()
	 * @generated
	 */
	EAttribute getCodeSystemVersion_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getEffectiveDate <em>Effective Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Date</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getEffectiveDate()
	 * @see #getCodeSystemVersion()
	 * @generated
	 */
	EAttribute getCodeSystemVersion_EffectiveDate();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getReleaseDate <em>Release Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Date</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getReleaseDate()
	 * @see #getCodeSystemVersion()
	 * @generated
	 */
	EAttribute getCodeSystemVersion_ReleaseDate();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getStatus()
	 * @see #getCodeSystemVersion()
	 * @generated
	 */
	EAttribute getCodeSystemVersion_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getStatusDate()
	 * @see #getCodeSystemVersion()
	 * @generated
	 */
	EAttribute getCodeSystemVersion_StatusDate();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getBase_Enumeration <em>Base Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Enumeration</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.CodeSystemVersion#getBase_Enumeration()
	 * @see #getCodeSystemVersion()
	 * @generated
	 */
	EReference getCodeSystemVersion_Base_Enumeration();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetConstraint <em>Value Set Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set Constraint</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetConstraint
	 * @generated
	 */
	EClass getValueSetConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetConstraint#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetConstraint#getReference()
	 * @see #getValueSetConstraint()
	 * @generated
	 */
	EReference getValueSetConstraint_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetConstraint#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetConstraint#getIdentifier()
	 * @see #getValueSetConstraint()
	 * @generated
	 */
	EAttribute getValueSetConstraint_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetConstraint#getName()
	 * @see #getValueSetConstraint()
	 * @generated
	 */
	EAttribute getValueSetConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetConstraint#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetConstraint#getVersion()
	 * @see #getValueSetConstraint()
	 * @generated
	 */
	EAttribute getValueSetConstraint_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetConstraint#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetConstraint#getBinding()
	 * @see #getValueSetConstraint()
	 * @generated
	 */
	EAttribute getValueSetConstraint_Binding();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetConstraint#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetConstraint#getBase_Property()
	 * @see #getValueSetConstraint()
	 * @generated
	 */
	EReference getValueSetConstraint_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion <em>Value Set Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set Version</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion
	 * @generated
	 */
	EClass getValueSetVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getIdentifier()
	 * @see #getValueSetVersion()
	 * @generated
	 */
	EAttribute getValueSetVersion_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getVersion()
	 * @see #getValueSetVersion()
	 * @generated
	 */
	EAttribute getValueSetVersion_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getFullName()
	 * @see #getValueSetVersion()
	 * @generated
	 */
	EAttribute getValueSetVersion_FullName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getSource()
	 * @see #getValueSetVersion()
	 * @generated
	 */
	EAttribute getValueSetVersion_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getUrl()
	 * @see #getValueSetVersion()
	 * @generated
	 */
	EAttribute getValueSetVersion_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getDefinition()
	 * @see #getValueSetVersion()
	 * @generated
	 */
	EAttribute getValueSetVersion_Definition();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getEffectiveDate <em>Effective Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Date</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getEffectiveDate()
	 * @see #getValueSetVersion()
	 * @generated
	 */
	EAttribute getValueSetVersion_EffectiveDate();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getExpirationDate()
	 * @see #getValueSetVersion()
	 * @generated
	 */
	EAttribute getValueSetVersion_ExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getReleaseDate <em>Release Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Date</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getReleaseDate()
	 * @see #getValueSetVersion()
	 * @generated
	 */
	EAttribute getValueSetVersion_ReleaseDate();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getRevisionDate <em>Revision Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Date</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getRevisionDate()
	 * @see #getValueSetVersion()
	 * @generated
	 */
	EAttribute getValueSetVersion_RevisionDate();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getStatus()
	 * @see #getValueSetVersion()
	 * @generated
	 */
	EAttribute getValueSetVersion_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getStatusDate()
	 * @see #getValueSetVersion()
	 * @generated
	 */
	EAttribute getValueSetVersion_StatusDate();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getType()
	 * @see #getValueSetVersion()
	 * @generated
	 */
	EAttribute getValueSetVersion_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getBinding()
	 * @see #getValueSetVersion()
	 * @generated
	 */
	EAttribute getValueSetVersion_Binding();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getCodeSystem <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code System</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getCodeSystem()
	 * @see #getValueSetVersion()
	 * @generated
	 */
	EReference getValueSetVersion_CodeSystem();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getBase_Enumeration <em>Base Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Enumeration</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetVersion#getBase_Enumeration()
	 * @see #getValueSetVersion()
	 * @generated
	 */
	EReference getValueSetVersion_Base_Enumeration();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetCode <em>Value Set Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetCode
	 * @generated
	 */
	EClass getValueSetCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetCode#getConceptName <em>Concept Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concept Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetCode#getConceptName()
	 * @see #getValueSetCode()
	 * @generated
	 */
	EAttribute getValueSetCode_ConceptName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetCode#getUsageNote <em>Usage Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Note</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetCode#getUsageNote()
	 * @see #getValueSetCode()
	 * @generated
	 */
	EAttribute getValueSetCode_UsageNote();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetCode#getCodeSystem <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code System</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetCode#getCodeSystem()
	 * @see #getValueSetCode()
	 * @generated
	 */
	EReference getValueSetCode_CodeSystem();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetCode#getBase_EnumerationLiteral <em>Base Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Enumeration Literal</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetCode#getBase_EnumerationLiteral()
	 * @see #getValueSetCode()
	 * @generated
	 */
	EReference getValueSetCode_Base_EnumerationLiteral();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetContextBinding <em>Value Set Context Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set Context Binding</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetContextBinding
	 * @generated
	 */
	EClass getValueSetContextBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetContextBinding#getEffectiveDate <em>Effective Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Date</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetContextBinding#getEffectiveDate()
	 * @see #getValueSetContextBinding()
	 * @generated
	 */
	EAttribute getValueSetContextBinding_EffectiveDate();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetContextBinding#getConceptDomain <em>Concept Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept Domain</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetContextBinding#getConceptDomain()
	 * @see #getValueSetContextBinding()
	 * @generated
	 */
	EReference getValueSetContextBinding_ConceptDomain();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetContextBinding#getValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Set</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetContextBinding#getValueSet()
	 * @see #getValueSetContextBinding()
	 * @generated
	 */
	EReference getValueSetContextBinding_ValueSet();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetContextBinding#getUsageContext <em>Usage Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usage Context</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetContextBinding#getUsageContext()
	 * @see #getValueSetContextBinding()
	 * @generated
	 */
	EReference getValueSetContextBinding_UsageContext();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetContextBinding#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetContextBinding#getBase_Class()
	 * @see #getValueSetContextBinding()
	 * @generated
	 */
	EReference getValueSetContextBinding_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.UsageContext <em>Usage Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Context</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.UsageContext
	 * @generated
	 */
	EClass getUsageContext();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.UsageContext#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.UsageContext#getIdentifier()
	 * @see #getUsageContext()
	 * @generated
	 */
	EAttribute getUsageContext_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.UsageContext#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.UsageContext#getStatus()
	 * @see #getUsageContext()
	 * @generated
	 */
	EAttribute getUsageContext_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.UsageContext#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.UsageContext#getStatusDate()
	 * @see #getUsageContext()
	 * @generated
	 */
	EAttribute getUsageContext_StatusDate();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.UsageContext#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.UsageContext#getBase_Class()
	 * @see #getUsageContext()
	 * @generated
	 */
	EReference getUsageContext_Base_Class();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.BindingKind <em>Binding Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Kind</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.BindingKind
	 * @generated
	 */
	EEnum getBindingKind();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetType <em>Value Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value Set Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetType
	 * @generated
	 */
	EEnum getValueSetType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.StatusKind <em>Status Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Kind</em>'.
	 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.StatusKind
	 * @generated
	 */
	EEnum getStatusKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CTSFactory getCTSFactory();

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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CDImpl <em>CD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CDImpl
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getCD()
		 * @generated
		 */
		EClass CD = eINSTANCE.getCD();

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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CRImpl <em>CR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CRImpl
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getCR()
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
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ConceptDomainConstraintImpl <em>Concept Domain Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ConceptDomainConstraintImpl
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getConceptDomainConstraint()
		 * @generated
		 */
		EClass CONCEPT_DOMAIN_CONSTRAINT = eINSTANCE.getConceptDomainConstraint();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_DOMAIN_CONSTRAINT__REFERENCE = eINSTANCE.getConceptDomainConstraint_Reference();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT_DOMAIN_CONSTRAINT__IDENTIFIER = eINSTANCE.getConceptDomainConstraint_Identifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT_DOMAIN_CONSTRAINT__NAME = eINSTANCE.getConceptDomainConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_DOMAIN_CONSTRAINT__BASE_PROPERTY = eINSTANCE.getConceptDomainConstraint_Base_Property();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ConceptDomainImpl <em>Concept Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ConceptDomainImpl
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getConceptDomain()
		 * @generated
		 */
		EClass CONCEPT_DOMAIN = eINSTANCE.getConceptDomain();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT_DOMAIN__IDENTIFIER = eINSTANCE.getConceptDomain_Identifier();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT_DOMAIN__FULL_NAME = eINSTANCE.getConceptDomain_FullName();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT_DOMAIN__STATUS = eINSTANCE.getConceptDomain_Status();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT_DOMAIN__STATUS_DATE = eINSTANCE.getConceptDomain_StatusDate();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_DOMAIN__BASE_CLASS = eINSTANCE.getConceptDomain_Base_Class();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CodeSystemConstraintImpl <em>Code System Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CodeSystemConstraintImpl
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getCodeSystemConstraint()
		 * @generated
		 */
		EClass CODE_SYSTEM_CONSTRAINT = eINSTANCE.getCodeSystemConstraint();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_SYSTEM_CONSTRAINT__REFERENCE = eINSTANCE.getCodeSystemConstraint_Reference();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_SYSTEM_CONSTRAINT__IDENTIFIER = eINSTANCE.getCodeSystemConstraint_Identifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_SYSTEM_CONSTRAINT__NAME = eINSTANCE.getCodeSystemConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_SYSTEM_CONSTRAINT__VERSION = eINSTANCE.getCodeSystemConstraint_Version();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_SYSTEM_CONSTRAINT__BINDING = eINSTANCE.getCodeSystemConstraint_Binding();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_SYSTEM_CONSTRAINT__CODE = eINSTANCE.getCodeSystemConstraint_Code();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_SYSTEM_CONSTRAINT__DISPLAY_NAME = eINSTANCE.getCodeSystemConstraint_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_SYSTEM_CONSTRAINT__QUALIFIER = eINSTANCE.getCodeSystemConstraint_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_SYSTEM_CONSTRAINT__BASE_PROPERTY = eINSTANCE.getCodeSystemConstraint_Base_Property();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CodeSystemVersionImpl <em>Code System Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CodeSystemVersionImpl
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getCodeSystemVersion()
		 * @generated
		 */
		EClass CODE_SYSTEM_VERSION = eINSTANCE.getCodeSystemVersion();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_SYSTEM_VERSION__IDENTIFIER = eINSTANCE.getCodeSystemVersion_Identifier();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_SYSTEM_VERSION__VERSION = eINSTANCE.getCodeSystemVersion_Version();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_SYSTEM_VERSION__FULL_NAME = eINSTANCE.getCodeSystemVersion_FullName();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_SYSTEM_VERSION__SOURCE = eINSTANCE.getCodeSystemVersion_Source();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_SYSTEM_VERSION__URL = eINSTANCE.getCodeSystemVersion_Url();

		/**
		 * The meta object literal for the '<em><b>Effective Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_SYSTEM_VERSION__EFFECTIVE_DATE = eINSTANCE.getCodeSystemVersion_EffectiveDate();

		/**
		 * The meta object literal for the '<em><b>Release Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_SYSTEM_VERSION__RELEASE_DATE = eINSTANCE.getCodeSystemVersion_ReleaseDate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_SYSTEM_VERSION__STATUS = eINSTANCE.getCodeSystemVersion_Status();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_SYSTEM_VERSION__STATUS_DATE = eINSTANCE.getCodeSystemVersion_StatusDate();

		/**
		 * The meta object literal for the '<em><b>Base Enumeration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_SYSTEM_VERSION__BASE_ENUMERATION = eINSTANCE.getCodeSystemVersion_Base_Enumeration();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ValueSetConstraintImpl <em>Value Set Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ValueSetConstraintImpl
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getValueSetConstraint()
		 * @generated
		 */
		EClass VALUE_SET_CONSTRAINT = eINSTANCE.getValueSetConstraint();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET_CONSTRAINT__REFERENCE = eINSTANCE.getValueSetConstraint_Reference();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_CONSTRAINT__IDENTIFIER = eINSTANCE.getValueSetConstraint_Identifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_CONSTRAINT__NAME = eINSTANCE.getValueSetConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_CONSTRAINT__VERSION = eINSTANCE.getValueSetConstraint_Version();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_CONSTRAINT__BINDING = eINSTANCE.getValueSetConstraint_Binding();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET_CONSTRAINT__BASE_PROPERTY = eINSTANCE.getValueSetConstraint_Base_Property();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ValueSetVersionImpl <em>Value Set Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ValueSetVersionImpl
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getValueSetVersion()
		 * @generated
		 */
		EClass VALUE_SET_VERSION = eINSTANCE.getValueSetVersion();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_VERSION__IDENTIFIER = eINSTANCE.getValueSetVersion_Identifier();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_VERSION__VERSION = eINSTANCE.getValueSetVersion_Version();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_VERSION__FULL_NAME = eINSTANCE.getValueSetVersion_FullName();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_VERSION__SOURCE = eINSTANCE.getValueSetVersion_Source();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_VERSION__URL = eINSTANCE.getValueSetVersion_Url();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_VERSION__DEFINITION = eINSTANCE.getValueSetVersion_Definition();

		/**
		 * The meta object literal for the '<em><b>Effective Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_VERSION__EFFECTIVE_DATE = eINSTANCE.getValueSetVersion_EffectiveDate();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_VERSION__EXPIRATION_DATE = eINSTANCE.getValueSetVersion_ExpirationDate();

		/**
		 * The meta object literal for the '<em><b>Release Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_VERSION__RELEASE_DATE = eINSTANCE.getValueSetVersion_ReleaseDate();

		/**
		 * The meta object literal for the '<em><b>Revision Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_VERSION__REVISION_DATE = eINSTANCE.getValueSetVersion_RevisionDate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_VERSION__STATUS = eINSTANCE.getValueSetVersion_Status();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_VERSION__STATUS_DATE = eINSTANCE.getValueSetVersion_StatusDate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_VERSION__TYPE = eINSTANCE.getValueSetVersion_Type();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_VERSION__BINDING = eINSTANCE.getValueSetVersion_Binding();

		/**
		 * The meta object literal for the '<em><b>Code System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET_VERSION__CODE_SYSTEM = eINSTANCE.getValueSetVersion_CodeSystem();

		/**
		 * The meta object literal for the '<em><b>Base Enumeration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET_VERSION__BASE_ENUMERATION = eINSTANCE.getValueSetVersion_Base_Enumeration();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ValueSetCodeImpl <em>Value Set Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ValueSetCodeImpl
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getValueSetCode()
		 * @generated
		 */
		EClass VALUE_SET_CODE = eINSTANCE.getValueSetCode();

		/**
		 * The meta object literal for the '<em><b>Concept Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_CODE__CONCEPT_NAME = eINSTANCE.getValueSetCode_ConceptName();

		/**
		 * The meta object literal for the '<em><b>Usage Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_CODE__USAGE_NOTE = eINSTANCE.getValueSetCode_UsageNote();

		/**
		 * The meta object literal for the '<em><b>Code System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET_CODE__CODE_SYSTEM = eINSTANCE.getValueSetCode_CodeSystem();

		/**
		 * The meta object literal for the '<em><b>Base Enumeration Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET_CODE__BASE_ENUMERATION_LITERAL = eINSTANCE.getValueSetCode_Base_EnumerationLiteral();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ValueSetContextBindingImpl <em>Value Set Context Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.ValueSetContextBindingImpl
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getValueSetContextBinding()
		 * @generated
		 */
		EClass VALUE_SET_CONTEXT_BINDING = eINSTANCE.getValueSetContextBinding();

		/**
		 * The meta object literal for the '<em><b>Effective Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_CONTEXT_BINDING__EFFECTIVE_DATE = eINSTANCE.getValueSetContextBinding_EffectiveDate();

		/**
		 * The meta object literal for the '<em><b>Concept Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET_CONTEXT_BINDING__CONCEPT_DOMAIN = eINSTANCE.getValueSetContextBinding_ConceptDomain();

		/**
		 * The meta object literal for the '<em><b>Value Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET_CONTEXT_BINDING__VALUE_SET = eINSTANCE.getValueSetContextBinding_ValueSet();

		/**
		 * The meta object literal for the '<em><b>Usage Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET_CONTEXT_BINDING__USAGE_CONTEXT = eINSTANCE.getValueSetContextBinding_UsageContext();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET_CONTEXT_BINDING__BASE_CLASS = eINSTANCE.getValueSetContextBinding_Base_Class();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.UsageContextImpl <em>Usage Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.UsageContextImpl
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getUsageContext()
		 * @generated
		 */
		EClass USAGE_CONTEXT = eINSTANCE.getUsageContext();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_CONTEXT__IDENTIFIER = eINSTANCE.getUsageContext_Identifier();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_CONTEXT__STATUS = eINSTANCE.getUsageContext_Status();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_CONTEXT__STATUS_DATE = eINSTANCE.getUsageContext_StatusDate();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_CONTEXT__BASE_CLASS = eINSTANCE.getUsageContext_Base_Class();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.BindingKind <em>Binding Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.BindingKind
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getBindingKind()
		 * @generated
		 */
		EEnum BINDING_KIND = eINSTANCE.getBindingKind();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetType <em>Value Set Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.ValueSetType
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getValueSetType()
		 * @generated
		 */
		EEnum VALUE_SET_TYPE = eINSTANCE.getValueSetType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cts.core.ctsprofile.StatusKind <em>Status Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.StatusKind
		 * @see org.openhealthtools.mdht.uml.cts.core.ctsprofile.impl.CTSPackageImpl#getStatusKind()
		 * @generated
		 */
		EEnum STATUS_KIND = eINSTANCE.getStatusKind();

	}

} //CTSPackage
