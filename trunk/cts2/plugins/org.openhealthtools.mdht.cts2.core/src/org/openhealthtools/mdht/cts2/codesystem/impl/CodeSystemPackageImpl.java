/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.codesystem.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.cts2.association.AssociationPackage;
import org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryDirectory;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryList;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryListEntry;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryMsg;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemFactory;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage;
import org.openhealthtools.mdht.cts2.codesystem.DocumentRoot;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage;
import org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionPackageImpl;
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
public class CodeSystemPackageImpl extends EPackageImpl implements CodeSystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeSystemCatalogEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeSystemCatalogEntryDirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeSystemCatalogEntryListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeSystemCatalogEntryListEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeSystemCatalogEntryMsgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeSystemCatalogEntrySummaryEClass = null;

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
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodeSystemPackageImpl() {
		super(eNS_URI, CodeSystemFactory.eINSTANCE);
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
	 * This method is used to initialize {@link CodeSystemPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodeSystemPackage init() {
		if (isInited) {
			return (CodeSystemPackage) EPackage.Registry.INSTANCE.getEPackage(CodeSystemPackage.eNS_URI);
		}

		// Obtain or create and register package
		CodeSystemPackageImpl theCodeSystemPackage = (CodeSystemPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CodeSystemPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new CodeSystemPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AssociationPackageImpl theAssociationPackage = (AssociationPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(AssociationPackage.eNS_URI) instanceof AssociationPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(AssociationPackage.eNS_URI)
				: AssociationPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl) (EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI)
				: CorePackage.eINSTANCE);
		CodeSystemVersionPackageImpl theCodeSystemVersionPackage = (CodeSystemVersionPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(CodeSystemVersionPackage.eNS_URI) instanceof CodeSystemVersionPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(CodeSystemVersionPackage.eNS_URI)
				: CodeSystemVersionPackage.eINSTANCE);
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
		theCodeSystemPackage.createPackageContents();
		theAssociationPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theCodeSystemVersionPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theStatementPackage.createPackageContents();
		theValueSetPackage.createPackageContents();
		theValueSetDefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theCodeSystemPackage.initializePackageContents();
		theAssociationPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theCodeSystemVersionPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theStatementPackage.initializePackageContents();
		theValueSetPackage.initializePackageContents();
		theValueSetDefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodeSystemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodeSystemPackage.eNS_URI, theCodeSystemPackage);
		return theCodeSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodeSystemCatalogEntry() {
		return codeSystemCatalogEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemCatalogEntry_CodeSystemCategory() {
		return (EReference) codeSystemCatalogEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemCatalogEntry_OntologyDomain() {
		return (EReference) codeSystemCatalogEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemCatalogEntry_OntologyType() {
		return (EReference) codeSystemCatalogEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemCatalogEntry_DesignedForOntologyTask() {
		return (EReference) codeSystemCatalogEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCodeSystemCatalogEntry_Versions() {
		return (EAttribute) codeSystemCatalogEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemCatalogEntry_CurrentVersion() {
		return (EReference) codeSystemCatalogEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemCatalogEntry_UsedOntologyEngineeringTool() {
		return (EReference) codeSystemCatalogEntryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCodeSystemCatalogEntry_CodeSystemName() {
		return (EAttribute) codeSystemCatalogEntryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodeSystemCatalogEntryDirectory() {
		return codeSystemCatalogEntryDirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemCatalogEntryDirectory_Entry() {
		return (EReference) codeSystemCatalogEntryDirectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodeSystemCatalogEntryList() {
		return codeSystemCatalogEntryListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemCatalogEntryList_Entry() {
		return (EReference) codeSystemCatalogEntryListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodeSystemCatalogEntryListEntry() {
		return codeSystemCatalogEntryListEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemCatalogEntryListEntry_Entry() {
		return (EReference) codeSystemCatalogEntryListEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodeSystemCatalogEntryMsg() {
		return codeSystemCatalogEntryMsgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemCatalogEntryMsg_CodeSystemCatalogEntry() {
		return (EReference) codeSystemCatalogEntryMsgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodeSystemCatalogEntrySummary() {
		return codeSystemCatalogEntrySummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCodeSystemCatalogEntrySummary_Versions() {
		return (EAttribute) codeSystemCatalogEntrySummaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemCatalogEntrySummary_CurrentVersion() {
		return (EReference) codeSystemCatalogEntrySummaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCodeSystemCatalogEntrySummary_CodeSystemName() {
		return (EAttribute) codeSystemCatalogEntrySummaryEClass.getEStructuralFeatures().get(2);
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
	public EReference getDocumentRoot_CodeSystemCatalogEntry() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_CodeSystemCatalogEntryDirectory() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_CodeSystemCatalogEntryList() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_CodeSystemCatalogEntryMsg() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemFactory getCodeSystemFactory() {
		return (CodeSystemFactory) getEFactoryInstance();
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
		codeSystemCatalogEntryEClass = createEClass(CODE_SYSTEM_CATALOG_ENTRY);
		createEReference(codeSystemCatalogEntryEClass, CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_CATEGORY);
		createEReference(codeSystemCatalogEntryEClass, CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_DOMAIN);
		createEReference(codeSystemCatalogEntryEClass, CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_TYPE);
		createEReference(codeSystemCatalogEntryEClass, CODE_SYSTEM_CATALOG_ENTRY__DESIGNED_FOR_ONTOLOGY_TASK);
		createEAttribute(codeSystemCatalogEntryEClass, CODE_SYSTEM_CATALOG_ENTRY__VERSIONS);
		createEReference(codeSystemCatalogEntryEClass, CODE_SYSTEM_CATALOG_ENTRY__CURRENT_VERSION);
		createEReference(codeSystemCatalogEntryEClass, CODE_SYSTEM_CATALOG_ENTRY__USED_ONTOLOGY_ENGINEERING_TOOL);
		createEAttribute(codeSystemCatalogEntryEClass, CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_NAME);

		codeSystemCatalogEntryDirectoryEClass = createEClass(CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY);
		createEReference(codeSystemCatalogEntryDirectoryEClass, CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY__ENTRY);

		codeSystemCatalogEntryListEClass = createEClass(CODE_SYSTEM_CATALOG_ENTRY_LIST);
		createEReference(codeSystemCatalogEntryListEClass, CODE_SYSTEM_CATALOG_ENTRY_LIST__ENTRY);

		codeSystemCatalogEntryListEntryEClass = createEClass(CODE_SYSTEM_CATALOG_ENTRY_LIST_ENTRY);
		createEReference(codeSystemCatalogEntryListEntryEClass, CODE_SYSTEM_CATALOG_ENTRY_LIST_ENTRY__ENTRY);

		codeSystemCatalogEntryMsgEClass = createEClass(CODE_SYSTEM_CATALOG_ENTRY_MSG);
		createEReference(codeSystemCatalogEntryMsgEClass, CODE_SYSTEM_CATALOG_ENTRY_MSG__CODE_SYSTEM_CATALOG_ENTRY);

		codeSystemCatalogEntrySummaryEClass = createEClass(CODE_SYSTEM_CATALOG_ENTRY_SUMMARY);
		createEAttribute(codeSystemCatalogEntrySummaryEClass, CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__VERSIONS);
		createEReference(codeSystemCatalogEntrySummaryEClass, CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CURRENT_VERSION);
		createEAttribute(codeSystemCatalogEntrySummaryEClass, CODE_SYSTEM_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_NAME);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_MSG);
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
		codeSystemCatalogEntryEClass.getESuperTypes().add(theCorePackage.getAbstractResourceDescription());
		codeSystemCatalogEntryDirectoryEClass.getESuperTypes().add(theCorePackage.getDirectory());
		codeSystemCatalogEntryListEClass.getESuperTypes().add(theCorePackage.getDirectory());
		codeSystemCatalogEntryListEntryEClass.getESuperTypes().add(theCorePackage.getDirectoryEntry());
		codeSystemCatalogEntryMsgEClass.getESuperTypes().add(theCorePackage.getMessage());
		codeSystemCatalogEntrySummaryEClass.getESuperTypes().add(
			theCorePackage.getAbstractResourceDescriptionDirectoryEntry());

		// Initialize classes and features; add operations and parameters
		initEClass(
			codeSystemCatalogEntryEClass, CodeSystemCatalogEntry.class, "CodeSystemCatalogEntry", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCodeSystemCatalogEntry_CodeSystemCategory(), theCorePackage.getCodeSystemCategoryReference(), null,
			"codeSystemCategory", null, 0, 1, CodeSystemCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getCodeSystemCatalogEntry_OntologyDomain(), theCorePackage.getOntologyDomainReference(), null,
			"ontologyDomain", null, 0, 1, CodeSystemCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getCodeSystemCatalogEntry_OntologyType(), theCorePackage.getOntologyTypeReference(), null, "ontologyType",
			null, 0, 1, CodeSystemCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getCodeSystemCatalogEntry_DesignedForOntologyTask(), theCorePackage.getOntologyTaskReference(), null,
			"designedForOntologyTask", null, 0, -1, CodeSystemCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getCodeSystemCatalogEntry_Versions(), theCorePackage.getCodeSystemVersionCatalogEntryDirectoryURI(),
			"versions", null, 0, 1, CodeSystemCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getCodeSystemCatalogEntry_CurrentVersion(), theCorePackage.getCodeSystemVersionReference(), null,
			"currentVersion", null, 0, 1, CodeSystemCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getCodeSystemCatalogEntry_UsedOntologyEngineeringTool(),
			theCorePackage.getOntologyEngineeringToolReference(), null, "usedOntologyEngineeringTool", null, 0, -1,
			CodeSystemCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getCodeSystemCatalogEntry_CodeSystemName(), theCorePackage.getCodeSystemName(), "codeSystemName", null, 1,
			1, CodeSystemCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			codeSystemCatalogEntryDirectoryEClass, CodeSystemCatalogEntryDirectory.class,
			"CodeSystemCatalogEntryDirectory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCodeSystemCatalogEntryDirectory_Entry(), this.getCodeSystemCatalogEntrySummary(), null, "entry", null,
			0, -1, CodeSystemCatalogEntryDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			codeSystemCatalogEntryListEClass, CodeSystemCatalogEntryList.class, "CodeSystemCatalogEntryList",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCodeSystemCatalogEntryList_Entry(), this.getCodeSystemCatalogEntryListEntry(), null, "entry", null, 0,
			-1, CodeSystemCatalogEntryList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			codeSystemCatalogEntryListEntryEClass, CodeSystemCatalogEntryListEntry.class,
			"CodeSystemCatalogEntryListEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCodeSystemCatalogEntryListEntry_Entry(), this.getCodeSystemCatalogEntry(), null, "entry", null, 1, 1,
			CodeSystemCatalogEntryListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			codeSystemCatalogEntryMsgEClass, CodeSystemCatalogEntryMsg.class, "CodeSystemCatalogEntryMsg",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCodeSystemCatalogEntryMsg_CodeSystemCatalogEntry(), this.getCodeSystemCatalogEntry(), null,
			"codeSystemCatalogEntry", null, 1, 1, CodeSystemCatalogEntryMsg.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			codeSystemCatalogEntrySummaryEClass, CodeSystemCatalogEntrySummary.class, "CodeSystemCatalogEntrySummary",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getCodeSystemCatalogEntrySummary_Versions(), theCorePackage.getCodeSystemVersionCatalogEntryDirectoryURI(),
			"versions", null, 0, 1, CodeSystemCatalogEntrySummary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getCodeSystemCatalogEntrySummary_CurrentVersion(), theCorePackage.getCodeSystemVersionReference(), null,
			"currentVersion", null, 0, 1, CodeSystemCatalogEntrySummary.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getCodeSystemCatalogEntrySummary_CodeSystemName(), theCorePackage.getCodeSystemName(), "codeSystemName",
			null, 1, 1, CodeSystemCatalogEntrySummary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			getDocumentRoot_CodeSystemCatalogEntry(), this.getCodeSystemCatalogEntry(), null, "codeSystemCatalogEntry",
			null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_CodeSystemCatalogEntryDirectory(), this.getCodeSystemCatalogEntryDirectory(), null,
			"codeSystemCatalogEntryDirectory", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_CodeSystemCatalogEntryList(), this.getCodeSystemCatalogEntryList(), null,
			"codeSystemCatalogEntryList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_CodeSystemCatalogEntryMsg(), this.getCodeSystemCatalogEntryMsg(), null,
			"codeSystemCatalogEntryMsg", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		addAnnotation(codeSystemCatalogEntryEClass, source, new String[] {
				"name", "CodeSystemCatalogEntry", "kind", "elementOnly" });
		addAnnotation(getCodeSystemCatalogEntry_CodeSystemCategory(), source, new String[] {
				"kind", "element", "name", "codeSystemCategory", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemCatalogEntry_OntologyDomain(), source, new String[] {
				"kind", "element", "name", "ontologyDomain", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemCatalogEntry_OntologyType(), source, new String[] {
				"kind", "element", "name", "ontologyType", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemCatalogEntry_DesignedForOntologyTask(), source, new String[] {
				"kind", "element", "name", "designedForOntologyTask", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemCatalogEntry_Versions(), source, new String[] {
				"kind", "element", "name", "versions", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemCatalogEntry_CurrentVersion(), source, new String[] {
				"kind", "element", "name", "currentVersion", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemCatalogEntry_UsedOntologyEngineeringTool(), source, new String[] {
				"kind", "element", "name", "usedOntologyEngineeringTool", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemCatalogEntry_CodeSystemName(), source, new String[] {
				"kind", "attribute", "name", "codeSystemName" });
		addAnnotation(codeSystemCatalogEntryDirectoryEClass, source, new String[] {
				"name", "CodeSystemCatalogEntryDirectory", "kind", "elementOnly" });
		addAnnotation(getCodeSystemCatalogEntryDirectory_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(codeSystemCatalogEntryListEClass, source, new String[] {
				"name", "CodeSystemCatalogEntryList", "kind", "elementOnly" });
		addAnnotation(getCodeSystemCatalogEntryList_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(codeSystemCatalogEntryListEntryEClass, source, new String[] {
				"name", "CodeSystemCatalogEntryListEntry", "kind", "elementOnly" });
		addAnnotation(getCodeSystemCatalogEntryListEntry_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(codeSystemCatalogEntryMsgEClass, source, new String[] {
				"name", "CodeSystemCatalogEntryMsg", "kind", "elementOnly" });
		addAnnotation(getCodeSystemCatalogEntryMsg_CodeSystemCatalogEntry(), source, new String[] {
				"kind", "element", "name", "codeSystemCatalogEntry", "namespace", "##targetNamespace" });
		addAnnotation(codeSystemCatalogEntrySummaryEClass, source, new String[] {
				"name", "CodeSystemCatalogEntrySummary", "kind", "elementOnly" });
		addAnnotation(getCodeSystemCatalogEntrySummary_Versions(), source, new String[] {
				"kind", "element", "name", "versions", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemCatalogEntrySummary_CurrentVersion(), source, new String[] {
				"kind", "element", "name", "currentVersion", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemCatalogEntrySummary_CodeSystemName(), source, new String[] {
				"kind", "attribute", "name", "codeSystemName" });
		addAnnotation(documentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
		addAnnotation(getDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" });
		addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source, new String[] {
				"kind", "attribute", "name", "xmlns:prefix" });
		addAnnotation(getDocumentRoot_XSISchemaLocation(), source, new String[] {
				"kind", "attribute", "name", "xsi:schemaLocation" });
		addAnnotation(getDocumentRoot_CodeSystemCatalogEntry(), source, new String[] {
				"kind", "element", "name", "CodeSystemCatalogEntry", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_CodeSystemCatalogEntryDirectory(), source, new String[] {
				"kind", "element", "name", "CodeSystemCatalogEntryDirectory", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_CodeSystemCatalogEntryList(), source, new String[] {
				"kind", "element", "name", "CodeSystemCatalogEntryList", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_CodeSystemCatalogEntryMsg(), source, new String[] {
				"kind", "element", "name", "CodeSystemCatalogEntryMsg", "namespace", "##targetNamespace" });
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
		addAnnotation(codeSystemCatalogEntryMsgEClass, source, new String[] { "appinfo", "PSM" });
	}

} // CodeSystemPackageImpl
