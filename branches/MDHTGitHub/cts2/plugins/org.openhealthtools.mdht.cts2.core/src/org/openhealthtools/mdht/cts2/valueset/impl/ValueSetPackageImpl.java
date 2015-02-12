/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.valueset.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.cts2.association.AssociationPackage;
import org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage;
import org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemPackageImpl;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage;
import org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionPackageImpl;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.impl.CorePackageImpl;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;
import org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl;
import org.openhealthtools.mdht.cts2.statement.StatementPackage;
import org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl;
import org.openhealthtools.mdht.cts2.valueset.DocumentRoot;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryDirectory;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryList;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryListEntry;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryMsg;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntrySummary;
import org.openhealthtools.mdht.cts2.valueset.ValueSetFactory;
import org.openhealthtools.mdht.cts2.valueset.ValueSetPackage;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;
import org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ValueSetPackageImpl extends EPackageImpl implements ValueSetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass valueSetCatalogEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass valueSetCatalogEntryDirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass valueSetCatalogEntryListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass valueSetCatalogEntryListEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass valueSetCatalogEntryMsgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass valueSetCatalogEntrySummaryEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValueSetPackageImpl() {
		super(eNS_URI, ValueSetFactory.eINSTANCE);
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
	 * This method is used to initialize {@link ValueSetPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValueSetPackage init() {
		if (isInited) {
			return (ValueSetPackage) EPackage.Registry.INSTANCE.getEPackage(ValueSetPackage.eNS_URI);
		}

		// Obtain or create and register package
		ValueSetPackageImpl theValueSetPackage = (ValueSetPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ValueSetPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new ValueSetPackageImpl());

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
		CodeSystemVersionPackageImpl theCodeSystemVersionPackage = (CodeSystemVersionPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(CodeSystemVersionPackage.eNS_URI) instanceof CodeSystemVersionPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(CodeSystemVersionPackage.eNS_URI)
				: CodeSystemVersionPackage.eINSTANCE);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI) instanceof EntityPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI)
				: EntityPackage.eINSTANCE);
		StatementPackageImpl theStatementPackage = (StatementPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI) instanceof StatementPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI)
				: StatementPackage.eINSTANCE);
		ValueSetDefinitionPackageImpl theValueSetDefinitionPackage = (ValueSetDefinitionPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ValueSetDefinitionPackage.eNS_URI) instanceof ValueSetDefinitionPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(ValueSetDefinitionPackage.eNS_URI)
				: ValueSetDefinitionPackage.eINSTANCE);

		// Create package meta-data objects
		theValueSetPackage.createPackageContents();
		theAssociationPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theCodeSystemPackage.createPackageContents();
		theCodeSystemVersionPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theStatementPackage.createPackageContents();
		theValueSetDefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theValueSetPackage.initializePackageContents();
		theAssociationPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theCodeSystemPackage.initializePackageContents();
		theCodeSystemVersionPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theStatementPackage.initializePackageContents();
		theValueSetDefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theValueSetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValueSetPackage.eNS_URI, theValueSetPackage);
		return theValueSetPackage;
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
	public EReference getDocumentRoot_ValueSetCatalogEntry() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_ValueSetCatalogEntryDirectory() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_ValueSetCatalogEntryList() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_ValueSetCatalogEntryMsg() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValueSetCatalogEntry() {
		return valueSetCatalogEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValueSetCatalogEntry_Definitions() {
		return (EAttribute) valueSetCatalogEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetCatalogEntry_CurrentDefinition() {
		return (EReference) valueSetCatalogEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValueSetCatalogEntry_ValueSetName() {
		return (EAttribute) valueSetCatalogEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValueSetCatalogEntryDirectory() {
		return valueSetCatalogEntryDirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetCatalogEntryDirectory_Entry() {
		return (EReference) valueSetCatalogEntryDirectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValueSetCatalogEntryList() {
		return valueSetCatalogEntryListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetCatalogEntryList_Entry() {
		return (EReference) valueSetCatalogEntryListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValueSetCatalogEntryListEntry() {
		return valueSetCatalogEntryListEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetCatalogEntryListEntry_Entry() {
		return (EReference) valueSetCatalogEntryListEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValueSetCatalogEntryMsg() {
		return valueSetCatalogEntryMsgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetCatalogEntryMsg_ValueSetCatalogEntry() {
		return (EReference) valueSetCatalogEntryMsgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValueSetCatalogEntrySummary() {
		return valueSetCatalogEntrySummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetCatalogEntrySummary_CurrentDefinition() {
		return (EReference) valueSetCatalogEntrySummaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValueSetCatalogEntrySummary_ValueSetName() {
		return (EAttribute) valueSetCatalogEntrySummaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetFactory getValueSetFactory() {
		return (ValueSetFactory) getEFactoryInstance();
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
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_DIRECTORY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_MSG);

		valueSetCatalogEntryEClass = createEClass(VALUE_SET_CATALOG_ENTRY);
		createEAttribute(valueSetCatalogEntryEClass, VALUE_SET_CATALOG_ENTRY__DEFINITIONS);
		createEReference(valueSetCatalogEntryEClass, VALUE_SET_CATALOG_ENTRY__CURRENT_DEFINITION);
		createEAttribute(valueSetCatalogEntryEClass, VALUE_SET_CATALOG_ENTRY__VALUE_SET_NAME);

		valueSetCatalogEntryDirectoryEClass = createEClass(VALUE_SET_CATALOG_ENTRY_DIRECTORY);
		createEReference(valueSetCatalogEntryDirectoryEClass, VALUE_SET_CATALOG_ENTRY_DIRECTORY__ENTRY);

		valueSetCatalogEntryListEClass = createEClass(VALUE_SET_CATALOG_ENTRY_LIST);
		createEReference(valueSetCatalogEntryListEClass, VALUE_SET_CATALOG_ENTRY_LIST__ENTRY);

		valueSetCatalogEntryListEntryEClass = createEClass(VALUE_SET_CATALOG_ENTRY_LIST_ENTRY);
		createEReference(valueSetCatalogEntryListEntryEClass, VALUE_SET_CATALOG_ENTRY_LIST_ENTRY__ENTRY);

		valueSetCatalogEntryMsgEClass = createEClass(VALUE_SET_CATALOG_ENTRY_MSG);
		createEReference(valueSetCatalogEntryMsgEClass, VALUE_SET_CATALOG_ENTRY_MSG__VALUE_SET_CATALOG_ENTRY);

		valueSetCatalogEntrySummaryEClass = createEClass(VALUE_SET_CATALOG_ENTRY_SUMMARY);
		createEReference(valueSetCatalogEntrySummaryEClass, VALUE_SET_CATALOG_ENTRY_SUMMARY__CURRENT_DEFINITION);
		createEAttribute(valueSetCatalogEntrySummaryEClass, VALUE_SET_CATALOG_ENTRY_SUMMARY__VALUE_SET_NAME);
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
		valueSetCatalogEntryEClass.getESuperTypes().add(theCorePackage.getAbstractResourceDescription());
		valueSetCatalogEntryDirectoryEClass.getESuperTypes().add(theCorePackage.getDirectory());
		valueSetCatalogEntryListEClass.getESuperTypes().add(theCorePackage.getDirectory());
		valueSetCatalogEntryListEntryEClass.getESuperTypes().add(theCorePackage.getDirectoryEntry());
		valueSetCatalogEntryMsgEClass.getESuperTypes().add(theCorePackage.getMessage());
		valueSetCatalogEntrySummaryEClass.getESuperTypes().add(
			theCorePackage.getAbstractResourceDescriptionDirectoryEntry());

		// Initialize classes and features; add operations and parameters
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
			getDocumentRoot_ValueSetCatalogEntry(), this.getValueSetCatalogEntry(), null, "valueSetCatalogEntry", null,
			0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
			IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_ValueSetCatalogEntryDirectory(), this.getValueSetCatalogEntryDirectory(), null,
			"valueSetCatalogEntryDirectory", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_ValueSetCatalogEntryList(), this.getValueSetCatalogEntryList(), null,
			"valueSetCatalogEntryList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_ValueSetCatalogEntryMsg(), this.getValueSetCatalogEntryMsg(), null,
			"valueSetCatalogEntryMsg", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(
			valueSetCatalogEntryEClass, ValueSetCatalogEntry.class, "ValueSetCatalogEntry", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getValueSetCatalogEntry_Definitions(), theCorePackage.getValueSetDefinitionDirectoryURI(), "definitions",
			null, 0, 1, ValueSetCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getValueSetCatalogEntry_CurrentDefinition(), theCorePackage.getValueSetDefinitionReference(), null,
			"currentDefinition", null, 0, 1, ValueSetCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getValueSetCatalogEntry_ValueSetName(), theCorePackage.getValueSetName(), "valueSetName", null, 1, 1,
			ValueSetCatalogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			valueSetCatalogEntryDirectoryEClass, ValueSetCatalogEntryDirectory.class, "ValueSetCatalogEntryDirectory",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getValueSetCatalogEntryDirectory_Entry(), this.getValueSetCatalogEntrySummary(), null, "entry", null, 0,
			-1, ValueSetCatalogEntryDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			valueSetCatalogEntryListEClass, ValueSetCatalogEntryList.class, "ValueSetCatalogEntryList", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getValueSetCatalogEntryList_Entry(), this.getValueSetCatalogEntryListEntry(), null, "entry", null, 0, -1,
			ValueSetCatalogEntryList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			valueSetCatalogEntryListEntryEClass, ValueSetCatalogEntryListEntry.class, "ValueSetCatalogEntryListEntry",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getValueSetCatalogEntryListEntry_Entry(), this.getValueSetCatalogEntry(), null, "entry", null, 1, 1,
			ValueSetCatalogEntryListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			valueSetCatalogEntryMsgEClass, ValueSetCatalogEntryMsg.class, "ValueSetCatalogEntryMsg", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getValueSetCatalogEntryMsg_ValueSetCatalogEntry(), this.getValueSetCatalogEntry(), null,
			"valueSetCatalogEntry", null, 1, 1, ValueSetCatalogEntryMsg.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			valueSetCatalogEntrySummaryEClass, ValueSetCatalogEntrySummary.class, "ValueSetCatalogEntrySummary",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getValueSetCatalogEntrySummary_CurrentDefinition(), theCorePackage.getValueSetDefinitionReference(), null,
			"currentDefinition", null, 0, 1, ValueSetCatalogEntrySummary.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getValueSetCatalogEntrySummary_ValueSetName(), theCorePackage.getValueSetName(), "valueSetName", null, 1,
			1, ValueSetCatalogEntrySummary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		addAnnotation(documentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
		addAnnotation(getDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" });
		addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source, new String[] {
				"kind", "attribute", "name", "xmlns:prefix" });
		addAnnotation(getDocumentRoot_XSISchemaLocation(), source, new String[] {
				"kind", "attribute", "name", "xsi:schemaLocation" });
		addAnnotation(getDocumentRoot_ValueSetCatalogEntry(), source, new String[] {
				"kind", "element", "name", "ValueSetCatalogEntry", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_ValueSetCatalogEntryDirectory(), source, new String[] {
				"kind", "element", "name", "ValueSetCatalogEntryDirectory", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_ValueSetCatalogEntryList(), source, new String[] {
				"kind", "element", "name", "ValueSetCatalogEntryList", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_ValueSetCatalogEntryMsg(), source, new String[] {
				"kind", "element", "name", "ValueSetCatalogEntryMsg", "namespace", "##targetNamespace" });
		addAnnotation(valueSetCatalogEntryEClass, source, new String[] {
				"name", "ValueSetCatalogEntry", "kind", "elementOnly" });
		addAnnotation(getValueSetCatalogEntry_Definitions(), source, new String[] {
				"kind", "element", "name", "definitions", "namespace", "##targetNamespace" });
		addAnnotation(getValueSetCatalogEntry_CurrentDefinition(), source, new String[] {
				"kind", "element", "name", "currentDefinition", "namespace", "##targetNamespace" });
		addAnnotation(getValueSetCatalogEntry_ValueSetName(), source, new String[] {
				"kind", "attribute", "name", "valueSetName" });
		addAnnotation(valueSetCatalogEntryDirectoryEClass, source, new String[] {
				"name", "ValueSetCatalogEntryDirectory", "kind", "elementOnly" });
		addAnnotation(getValueSetCatalogEntryDirectory_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(valueSetCatalogEntryListEClass, source, new String[] {
				"name", "ValueSetCatalogEntryList", "kind", "elementOnly" });
		addAnnotation(getValueSetCatalogEntryList_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(valueSetCatalogEntryListEntryEClass, source, new String[] {
				"name", "ValueSetCatalogEntryListEntry", "kind", "elementOnly" });
		addAnnotation(getValueSetCatalogEntryListEntry_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(valueSetCatalogEntryMsgEClass, source, new String[] {
				"name", "ValueSetCatalogEntryMsg", "kind", "elementOnly" });
		addAnnotation(getValueSetCatalogEntryMsg_ValueSetCatalogEntry(), source, new String[] {
				"kind", "element", "name", "valueSetCatalogEntry", "namespace", "##targetNamespace" });
		addAnnotation(valueSetCatalogEntrySummaryEClass, source, new String[] {
				"name", "ValueSetCatalogEntrySummary", "kind", "elementOnly" });
		addAnnotation(getValueSetCatalogEntrySummary_CurrentDefinition(), source, new String[] {
				"kind", "element", "name", "currentDefinition", "namespace", "##targetNamespace" });
		addAnnotation(getValueSetCatalogEntrySummary_ValueSetName(), source, new String[] {
				"kind", "attribute", "name", "valueSetName" });
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
		addAnnotation(valueSetCatalogEntryMsgEClass, source, new String[] { "appinfo", "PSM" });
	}

} // ValueSetPackageImpl
