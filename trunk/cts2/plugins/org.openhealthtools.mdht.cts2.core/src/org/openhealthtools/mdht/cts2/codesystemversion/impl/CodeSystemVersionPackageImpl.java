/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.codesystemversion.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.cts2.association.AssociationPackage;
import org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage;
import org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemPackageImpl;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryDirectory;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryList;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryListEntry;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryMsg;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionFactory;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage;
import org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;
import org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl;
import org.openhealthtools.mdht.cts2.statement.StatementPackage;
import org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl;
import org.openhealthtools.mdht.cts2.valueset.ValueSetPackage;
import org.openhealthtools.mdht.cts2.valueset.impl.ValueSetPackageImpl;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;
import org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CodeSystemVersionPackageImpl extends EPackageImpl implements CodeSystemVersionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeSystemVersionCatalogEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeSystemVersionCatalogEntryDirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeSystemVersionCatalogEntryListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeSystemVersionCatalogEntryListEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeSystemVersionCatalogEntryMsgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeSystemVersionCatalogEntrySummaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodeSystemVersionPackageImpl() {
		super(eNS_URI, CodeSystemVersionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link CodeSystemVersionPackage#eINSTANCE} when that field is accessed. Clients should not invoke it
	 * directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodeSystemVersionPackage init() {
		if (isInited) {
			return (CodeSystemVersionPackage) EPackage.Registry.INSTANCE.getEPackage(CodeSystemVersionPackage.eNS_URI);
		}

		// Obtain or create and register package
		CodeSystemVersionPackageImpl theCodeSystemVersionPackage = (CodeSystemVersionPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CodeSystemVersionPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new CodeSystemVersionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AssociationPackageImpl theAssociationPackage = (AssociationPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(AssociationPackage.eNS_URI) instanceof AssociationPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(AssociationPackage.eNS_URI)
				: AssociationPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl) (EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI)
				: CorePackage.eINSTANCE);
		CodeSystemPackageImpl theCodeSystemPackage = (CodeSystemPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(CodeSystemPackage.eNS_URI) instanceof CodeSystemPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(CodeSystemPackage.eNS_URI)
				: CodeSystemPackage.eINSTANCE);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI) instanceof EntityPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI)
				: EntityPackage.eINSTANCE);
		StatementPackageImpl theStatementPackage = (StatementPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI) instanceof StatementPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI)
				: StatementPackage.eINSTANCE);
		ValueSetPackageImpl theValueSetPackage = (ValueSetPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ValueSetPackage.eNS_URI) instanceof ValueSetPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(ValueSetPackage.eNS_URI)
				: ValueSetPackage.eINSTANCE);
		ValueSetDefinitionPackageImpl theValueSetDefinitionPackage = (ValueSetDefinitionPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ValueSetDefinitionPackage.eNS_URI) instanceof ValueSetDefinitionPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(ValueSetDefinitionPackage.eNS_URI)
				: ValueSetDefinitionPackage.eINSTANCE);

		// Create package meta-data objects
		theCodeSystemVersionPackage.createPackageContents();
		theAssociationPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theCodeSystemPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theStatementPackage.createPackageContents();
		theValueSetPackage.createPackageContents();
		theValueSetDefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theCodeSystemVersionPackage.initializePackageContents();
		theAssociationPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theCodeSystemPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theStatementPackage.initializePackageContents();
		theValueSetPackage.initializePackageContents();
		theValueSetDefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodeSystemVersionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodeSystemVersionPackage.eNS_URI, theCodeSystemVersionPackage);
		return theCodeSystemVersionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodeSystemVersionCatalogEntry() {
		return codeSystemVersionCatalogEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemVersionCatalogEntry_VersionOf() {
		return (EReference) codeSystemVersionCatalogEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemVersionCatalogEntry_Imports() {
		return (EReference) codeSystemVersionCatalogEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemVersionCatalogEntry_DefaultLanguage() {
		return (EReference) codeSystemVersionCatalogEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemVersionCatalogEntry_SupportedLanguage() {
		return (EReference) codeSystemVersionCatalogEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCodeSystemVersionCatalogEntry_EntityDescriptions() {
		return (EAttribute) codeSystemVersionCatalogEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCodeSystemVersionCatalogEntry_Associations() {
		return (EAttribute) codeSystemVersionCatalogEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCodeSystemVersionCatalogEntry_Classes() {
		return (EAttribute) codeSystemVersionCatalogEntryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCodeSystemVersionCatalogEntry_Roles() {
		return (EAttribute) codeSystemVersionCatalogEntryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCodeSystemVersionCatalogEntry_Individuals() {
		return (EAttribute) codeSystemVersionCatalogEntryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCodeSystemVersionCatalogEntry_CodeSystemVersionName() {
		return (EAttribute) codeSystemVersionCatalogEntryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodeSystemVersionCatalogEntryDirectory() {
		return codeSystemVersionCatalogEntryDirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemVersionCatalogEntryDirectory_Entry() {
		return (EReference) codeSystemVersionCatalogEntryDirectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodeSystemVersionCatalogEntryList() {
		return codeSystemVersionCatalogEntryListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemVersionCatalogEntryList_Entry() {
		return (EReference) codeSystemVersionCatalogEntryListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodeSystemVersionCatalogEntryListEntry() {
		return codeSystemVersionCatalogEntryListEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemVersionCatalogEntryListEntry_Entry() {
		return (EReference) codeSystemVersionCatalogEntryListEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodeSystemVersionCatalogEntryMsg() {
		return codeSystemVersionCatalogEntryMsgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemVersionCatalogEntryMsg_CodeSystemVersionCatalogEntry() {
		return (EReference) codeSystemVersionCatalogEntryMsgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodeSystemVersionCatalogEntrySummary() {
		return codeSystemVersionCatalogEntrySummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemVersionCatalogEntrySummary_VersionOf() {
		return (EReference) codeSystemVersionCatalogEntrySummaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemVersionCatalogEntrySummary_CodeSystemVersionTag() {
		return (EReference) codeSystemVersionCatalogEntrySummaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCodeSystemVersionCatalogEntrySummary_CodeSystemVersionName() {
		return (EAttribute) codeSystemVersionCatalogEntrySummaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute) documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_CodeSystemVersionCatalogEntry() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_CodeSystemVersionCatalogEntryDirectory() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_CodeSystemVersionCatalogEntryList() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_CodeSystemVersionCatalogEntryMsg() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionFactory getCodeSystemVersionFactory() {
		return (CodeSystemVersionFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		codeSystemVersionCatalogEntryEClass = createEClass(CODE_SYSTEM_VERSION_CATALOG_ENTRY);
		createEReference(codeSystemVersionCatalogEntryEClass, CODE_SYSTEM_VERSION_CATALOG_ENTRY__VERSION_OF);
		createEReference(codeSystemVersionCatalogEntryEClass, CODE_SYSTEM_VERSION_CATALOG_ENTRY__IMPORTS);
		createEReference(codeSystemVersionCatalogEntryEClass, CODE_SYSTEM_VERSION_CATALOG_ENTRY__DEFAULT_LANGUAGE);
		createEReference(codeSystemVersionCatalogEntryEClass, CODE_SYSTEM_VERSION_CATALOG_ENTRY__SUPPORTED_LANGUAGE);
		createEAttribute(codeSystemVersionCatalogEntryEClass, CODE_SYSTEM_VERSION_CATALOG_ENTRY__ENTITY_DESCRIPTIONS);
		createEAttribute(codeSystemVersionCatalogEntryEClass, CODE_SYSTEM_VERSION_CATALOG_ENTRY__ASSOCIATIONS);
		createEAttribute(codeSystemVersionCatalogEntryEClass, CODE_SYSTEM_VERSION_CATALOG_ENTRY__CLASSES);
		createEAttribute(codeSystemVersionCatalogEntryEClass, CODE_SYSTEM_VERSION_CATALOG_ENTRY__ROLES);
		createEAttribute(codeSystemVersionCatalogEntryEClass, CODE_SYSTEM_VERSION_CATALOG_ENTRY__INDIVIDUALS);
		createEAttribute(
			codeSystemVersionCatalogEntryEClass, CODE_SYSTEM_VERSION_CATALOG_ENTRY__CODE_SYSTEM_VERSION_NAME);

		codeSystemVersionCatalogEntryDirectoryEClass = createEClass(CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY);
		createEReference(
			codeSystemVersionCatalogEntryDirectoryEClass, CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY__ENTRY);

		codeSystemVersionCatalogEntryListEClass = createEClass(CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST);
		createEReference(codeSystemVersionCatalogEntryListEClass, CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST__ENTRY);

		codeSystemVersionCatalogEntryListEntryEClass = createEClass(CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY);
		createEReference(
			codeSystemVersionCatalogEntryListEntryEClass, CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY__ENTRY);

		codeSystemVersionCatalogEntryMsgEClass = createEClass(CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG);
		createEReference(
			codeSystemVersionCatalogEntryMsgEClass,
			CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG__CODE_SYSTEM_VERSION_CATALOG_ENTRY);

		codeSystemVersionCatalogEntrySummaryEClass = createEClass(CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY);
		createEReference(
			codeSystemVersionCatalogEntrySummaryEClass, CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__VERSION_OF);
		createEReference(
			codeSystemVersionCatalogEntrySummaryEClass,
			CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_TAG);
		createEAttribute(
			codeSystemVersionCatalogEntrySummaryEClass,
			CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_NAME);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage) EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		codeSystemVersionCatalogEntryEClass.getESuperTypes().add(theCorePackage.getResourceVersionDescription());
		codeSystemVersionCatalogEntryDirectoryEClass.getESuperTypes().add(theCorePackage.getDirectory());
		codeSystemVersionCatalogEntryListEClass.getESuperTypes().add(theCorePackage.getDirectory());
		codeSystemVersionCatalogEntryListEntryEClass.getESuperTypes().add(theCorePackage.getDirectoryEntry());
		codeSystemVersionCatalogEntryMsgEClass.getESuperTypes().add(theCorePackage.getMessage());
		codeSystemVersionCatalogEntrySummaryEClass.getESuperTypes().add(
			theCorePackage.getResourceVersionDescriptionDirectoryEntry());

		// Initialize classes and features; add operations and parameters
		initEClass(
			codeSystemVersionCatalogEntryEClass, CodeSystemVersionCatalogEntry.class, "CodeSystemVersionCatalogEntry",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCodeSystemVersionCatalogEntry_VersionOf(), theCorePackage.getCodeSystemReference(), null, "versionOf",
			null, 1, 1, CodeSystemVersionCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getCodeSystemVersionCatalogEntry_Imports(), theCorePackage.getCodeSystemVersionReference(), null,
			"imports", null, 0, -1, CodeSystemVersionCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getCodeSystemVersionCatalogEntry_DefaultLanguage(), theCorePackage.getLanguageReference(), null,
			"defaultLanguage", null, 0, 1, CodeSystemVersionCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getCodeSystemVersionCatalogEntry_SupportedLanguage(), theCorePackage.getLanguageReference(), null,
			"supportedLanguage", null, 0, -1, CodeSystemVersionCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getCodeSystemVersionCatalogEntry_EntityDescriptions(), theCorePackage.getEntityDirectoryURI(),
			"entityDescriptions", null, 0, 1, CodeSystemVersionCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getCodeSystemVersionCatalogEntry_Associations(), theCorePackage.getAssociationDirectoryURI(),
			"associations", null, 0, 1, CodeSystemVersionCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getCodeSystemVersionCatalogEntry_Classes(), theCorePackage.getEntityDirectoryURI(), "classes", null, 0, 1,
			CodeSystemVersionCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getCodeSystemVersionCatalogEntry_Roles(), theCorePackage.getEntityDirectoryURI(), "roles", null, 0, 1,
			CodeSystemVersionCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getCodeSystemVersionCatalogEntry_Individuals(), theCorePackage.getEntityDirectoryURI(), "individuals",
			null, 0, 1, CodeSystemVersionCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getCodeSystemVersionCatalogEntry_CodeSystemVersionName(), theCorePackage.getCodeSystemVersionName(),
			"codeSystemVersionName", null, 1, 1, CodeSystemVersionCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			codeSystemVersionCatalogEntryDirectoryEClass, CodeSystemVersionCatalogEntryDirectory.class,
			"CodeSystemVersionCatalogEntryDirectory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCodeSystemVersionCatalogEntryDirectory_Entry(), this.getCodeSystemVersionCatalogEntrySummary(), null,
			"entry", null, 0, -1, CodeSystemVersionCatalogEntryDirectory.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			codeSystemVersionCatalogEntryListEClass, CodeSystemVersionCatalogEntryList.class,
			"CodeSystemVersionCatalogEntryList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCodeSystemVersionCatalogEntryList_Entry(), this.getCodeSystemVersionCatalogEntryListEntry(), null,
			"entry", null, 0, -1, CodeSystemVersionCatalogEntryList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			codeSystemVersionCatalogEntryListEntryEClass, CodeSystemVersionCatalogEntryListEntry.class,
			"CodeSystemVersionCatalogEntryListEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCodeSystemVersionCatalogEntryListEntry_Entry(), this.getCodeSystemVersionCatalogEntry(), null, "entry",
			null, 1, 1, CodeSystemVersionCatalogEntryListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			codeSystemVersionCatalogEntryMsgEClass, CodeSystemVersionCatalogEntryMsg.class,
			"CodeSystemVersionCatalogEntryMsg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCodeSystemVersionCatalogEntryMsg_CodeSystemVersionCatalogEntry(),
			this.getCodeSystemVersionCatalogEntry(), null, "codeSystemVersionCatalogEntry", null, 1, 1,
			CodeSystemVersionCatalogEntryMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			codeSystemVersionCatalogEntrySummaryEClass, CodeSystemVersionCatalogEntrySummary.class,
			"CodeSystemVersionCatalogEntrySummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCodeSystemVersionCatalogEntrySummary_VersionOf(), theCorePackage.getCodeSystemReference(), null,
			"versionOf", null, 1, 1, CodeSystemVersionCatalogEntrySummary.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getCodeSystemVersionCatalogEntrySummary_CodeSystemVersionTag(), theCorePackage.getVersionTagReference(),
			null, "codeSystemVersionTag", null, 0, -1, CodeSystemVersionCatalogEntrySummary.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);
		initEAttribute(
			getCodeSystemVersionCatalogEntrySummary_CodeSystemVersionName(), theCorePackage.getCodeSystemVersionName(),
			"codeSystemVersionName", null, 1, 1, CodeSystemVersionCatalogEntrySummary.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null,
			0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation",
			null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_CodeSystemVersionCatalogEntry(), this.getCodeSystemVersionCatalogEntry(), null,
			"codeSystemVersionCatalogEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_CodeSystemVersionCatalogEntryDirectory(), this.getCodeSystemVersionCatalogEntryDirectory(),
			null, "codeSystemVersionCatalogEntryDirectory", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_CodeSystemVersionCatalogEntryList(), this.getCodeSystemVersionCatalogEntryList(), null,
			"codeSystemVersionCatalogEntryList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_CodeSystemVersionCatalogEntryMsg(), this.getCodeSystemVersionCatalogEntryMsg(), null,
			"codeSystemVersionCatalogEntryMsg", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// null
		createNullAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(codeSystemVersionCatalogEntryEClass, source, new String[] {
				"name", "CodeSystemVersionCatalogEntry", "kind", "elementOnly" });
		addAnnotation(getCodeSystemVersionCatalogEntry_VersionOf(), source, new String[] {
				"kind", "element", "name", "versionOf", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemVersionCatalogEntry_Imports(), source, new String[] {
				"kind", "element", "name", "imports", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemVersionCatalogEntry_DefaultLanguage(), source, new String[] {
				"kind", "element", "name", "defaultLanguage", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemVersionCatalogEntry_SupportedLanguage(), source, new String[] {
				"kind", "element", "name", "supportedLanguage", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemVersionCatalogEntry_EntityDescriptions(), source, new String[] {
				"kind", "element", "name", "entityDescriptions", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemVersionCatalogEntry_Associations(), source, new String[] {
				"kind", "element", "name", "associations", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemVersionCatalogEntry_Classes(), source, new String[] {
				"kind", "element", "name", "classes", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemVersionCatalogEntry_Roles(), source, new String[] {
				"kind", "element", "name", "roles", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemVersionCatalogEntry_Individuals(), source, new String[] {
				"kind", "element", "name", "individuals", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemVersionCatalogEntry_CodeSystemVersionName(), source, new String[] {
				"kind", "attribute", "name", "codeSystemVersionName" });
		addAnnotation(codeSystemVersionCatalogEntryDirectoryEClass, source, new String[] {
				"name", "CodeSystemVersionCatalogEntryDirectory", "kind", "elementOnly" });
		addAnnotation(getCodeSystemVersionCatalogEntryDirectory_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(codeSystemVersionCatalogEntryListEClass, source, new String[] {
				"name", "CodeSystemVersionCatalogEntryList", "kind", "elementOnly" });
		addAnnotation(getCodeSystemVersionCatalogEntryList_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(codeSystemVersionCatalogEntryListEntryEClass, source, new String[] {
				"name", "CodeSystemVersionCatalogEntryListEntry", "kind", "elementOnly" });
		addAnnotation(getCodeSystemVersionCatalogEntryListEntry_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(codeSystemVersionCatalogEntryMsgEClass, source, new String[] {
				"name", "CodeSystemVersionCatalogEntryMsg", "kind", "elementOnly" });
		addAnnotation(getCodeSystemVersionCatalogEntryMsg_CodeSystemVersionCatalogEntry(), source, new String[] {
				"kind", "element", "name", "codeSystemVersionCatalogEntry", "namespace", "##targetNamespace" });
		addAnnotation(codeSystemVersionCatalogEntrySummaryEClass, source, new String[] {
				"name", "CodeSystemVersionCatalogEntrySummary", "kind", "elementOnly" });
		addAnnotation(getCodeSystemVersionCatalogEntrySummary_VersionOf(), source, new String[] {
				"kind", "element", "name", "versionOf", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemVersionCatalogEntrySummary_CodeSystemVersionTag(), source, new String[] {
				"kind", "element", "name", "codeSystemVersionTag", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemVersionCatalogEntrySummary_CodeSystemVersionName(), source, new String[] {
				"kind", "attribute", "name", "codeSystemVersionName" });
		addAnnotation(documentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
		addAnnotation(getDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" });
		addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source, new String[] {
				"kind", "attribute", "name", "xmlns:prefix" });
		addAnnotation(getDocumentRoot_XSISchemaLocation(), source, new String[] {
				"kind", "attribute", "name", "xsi:schemaLocation" });
		addAnnotation(getDocumentRoot_CodeSystemVersionCatalogEntry(), source, new String[] {
				"kind", "element", "name", "CodeSystemVersionCatalogEntry", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_CodeSystemVersionCatalogEntryDirectory(), source, new String[] {
				"kind", "element", "name", "CodeSystemVersionCatalogEntryDirectory", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_CodeSystemVersionCatalogEntryList(), source, new String[] {
				"kind", "element", "name", "CodeSystemVersionCatalogEntryList", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_CodeSystemVersionCatalogEntryMsg(), source, new String[] {
				"kind", "element", "name", "CodeSystemVersionCatalogEntryMsg", "namespace", "##targetNamespace" });
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation(codeSystemVersionCatalogEntryMsgEClass, source, new String[] { "appinfo", "PSM" });
	}

} // CodeSystemVersionPackageImpl
