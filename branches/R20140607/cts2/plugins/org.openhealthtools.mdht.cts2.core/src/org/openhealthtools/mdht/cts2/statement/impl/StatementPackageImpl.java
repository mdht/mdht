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
package org.openhealthtools.mdht.cts2.statement.impl;

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
import org.openhealthtools.mdht.cts2.statement.DocumentRoot;
import org.openhealthtools.mdht.cts2.statement.Statement;
import org.openhealthtools.mdht.cts2.statement.StatementDirectory;
import org.openhealthtools.mdht.cts2.statement.StatementDirectoryEntry;
import org.openhealthtools.mdht.cts2.statement.StatementFactory;
import org.openhealthtools.mdht.cts2.statement.StatementList;
import org.openhealthtools.mdht.cts2.statement.StatementListEntry;
import org.openhealthtools.mdht.cts2.statement.StatementMsg;
import org.openhealthtools.mdht.cts2.statement.StatementPackage;
import org.openhealthtools.mdht.cts2.statement.StatementQualifier;
import org.openhealthtools.mdht.cts2.statement.StatementSubject;
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
public class StatementPackageImpl extends EPackageImpl implements StatementPackage {
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
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass statementDirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass statementDirectoryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass statementListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass statementListEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass statementMsgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass statementQualifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass statementSubjectEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.cts2.statement.StatementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatementPackageImpl() {
		super(eNS_URI, StatementFactory.eINSTANCE);
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
	 * This method is used to initialize {@link StatementPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatementPackage init() {
		if (isInited) {
			return (StatementPackage) EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI);
		}

		// Obtain or create and register package
		StatementPackageImpl theStatementPackage = (StatementPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatementPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new StatementPackageImpl());

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
		ValueSetPackageImpl theValueSetPackage = (ValueSetPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ValueSetPackage.eNS_URI) instanceof ValueSetPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(ValueSetPackage.eNS_URI)
				: ValueSetPackage.eINSTANCE);
		ValueSetDefinitionPackageImpl theValueSetDefinitionPackage = (ValueSetDefinitionPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ValueSetDefinitionPackage.eNS_URI) instanceof ValueSetDefinitionPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(ValueSetDefinitionPackage.eNS_URI)
				: ValueSetDefinitionPackage.eINSTANCE);

		// Create package meta-data objects
		theStatementPackage.createPackageContents();
		theAssociationPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theCodeSystemPackage.createPackageContents();
		theCodeSystemVersionPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theValueSetPackage.createPackageContents();
		theValueSetDefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theStatementPackage.initializePackageContents();
		theAssociationPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theCodeSystemPackage.initializePackageContents();
		theCodeSystemVersionPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theValueSetPackage.initializePackageContents();
		theValueSetDefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatementPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatementPackage.eNS_URI, theStatementPackage);
		return theStatementPackage;
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
	public EReference getDocumentRoot_Statement() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_StatementDirectory() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_StatementList() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_StatementMsg() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getStatement_StatementURI() {
		return (EAttribute) statementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatement_Subject() {
		return (EReference) statementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatement_Predicate() {
		return (EReference) statementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatement_Target() {
		return (EReference) statementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatement_AssociatedAttribute() {
		return (EReference) statementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatement_Source() {
		return (EReference) statementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatement_AssertedBy() {
		return (EReference) statementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatement_AssertedIn() {
		return (EReference) statementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatement_Qualifier() {
		return (EReference) statementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStatementDirectory() {
		return statementDirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatementDirectory_Entry() {
		return (EReference) statementDirectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStatementDirectoryEntry() {
		return statementDirectoryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getStatementDirectoryEntry_Href() {
		return (EAttribute) statementDirectoryEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getStatementDirectoryEntry_MatchStrength() {
		return (EAttribute) statementDirectoryEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getStatementDirectoryEntry_ResourceName() {
		return (EAttribute) statementDirectoryEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStatementList() {
		return statementListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatementList_Entry() {
		return (EReference) statementListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStatementListEntry() {
		return statementListEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatementListEntry_Entry() {
		return (EReference) statementListEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStatementMsg() {
		return statementMsgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatementMsg_Statement() {
		return (EReference) statementMsgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStatementQualifier() {
		return statementQualifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatementQualifier_QualifierPredicate() {
		return (EReference) statementQualifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatementQualifier_AssociatedAttribute() {
		return (EReference) statementQualifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatementQualifier_Target() {
		return (EReference) statementQualifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStatementSubject() {
		return statementSubjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getStatementSubject_Resource() {
		return (EAttribute) statementSubjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatementSubject_Entity() {
		return (EReference) statementSubjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatementFactory getStatementFactory() {
		return (StatementFactory) getEFactoryInstance();
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
		createEReference(documentRootEClass, DOCUMENT_ROOT__STATEMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STATEMENT_DIRECTORY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STATEMENT_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STATEMENT_MSG);

		statementEClass = createEClass(STATEMENT);
		createEAttribute(statementEClass, STATEMENT__STATEMENT_URI);
		createEReference(statementEClass, STATEMENT__SUBJECT);
		createEReference(statementEClass, STATEMENT__PREDICATE);
		createEReference(statementEClass, STATEMENT__TARGET);
		createEReference(statementEClass, STATEMENT__ASSOCIATED_ATTRIBUTE);
		createEReference(statementEClass, STATEMENT__SOURCE);
		createEReference(statementEClass, STATEMENT__ASSERTED_BY);
		createEReference(statementEClass, STATEMENT__ASSERTED_IN);
		createEReference(statementEClass, STATEMENT__QUALIFIER);

		statementDirectoryEClass = createEClass(STATEMENT_DIRECTORY);
		createEReference(statementDirectoryEClass, STATEMENT_DIRECTORY__ENTRY);

		statementDirectoryEntryEClass = createEClass(STATEMENT_DIRECTORY_ENTRY);
		createEAttribute(statementDirectoryEntryEClass, STATEMENT_DIRECTORY_ENTRY__HREF);
		createEAttribute(statementDirectoryEntryEClass, STATEMENT_DIRECTORY_ENTRY__MATCH_STRENGTH);
		createEAttribute(statementDirectoryEntryEClass, STATEMENT_DIRECTORY_ENTRY__RESOURCE_NAME);

		statementListEClass = createEClass(STATEMENT_LIST);
		createEReference(statementListEClass, STATEMENT_LIST__ENTRY);

		statementListEntryEClass = createEClass(STATEMENT_LIST_ENTRY);
		createEReference(statementListEntryEClass, STATEMENT_LIST_ENTRY__ENTRY);

		statementMsgEClass = createEClass(STATEMENT_MSG);
		createEReference(statementMsgEClass, STATEMENT_MSG__STATEMENT);

		statementQualifierEClass = createEClass(STATEMENT_QUALIFIER);
		createEReference(statementQualifierEClass, STATEMENT_QUALIFIER__QUALIFIER_PREDICATE);
		createEReference(statementQualifierEClass, STATEMENT_QUALIFIER__ASSOCIATED_ATTRIBUTE);
		createEReference(statementQualifierEClass, STATEMENT_QUALIFIER__TARGET);

		statementSubjectEClass = createEClass(STATEMENT_SUBJECT);
		createEAttribute(statementSubjectEClass, STATEMENT_SUBJECT__RESOURCE);
		createEReference(statementSubjectEClass, STATEMENT_SUBJECT__ENTITY);
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
		statementEClass.getESuperTypes().add(theCorePackage.getChangeable());
		statementDirectoryEClass.getESuperTypes().add(theCorePackage.getDirectory());
		statementDirectoryEntryEClass.getESuperTypes().add(this.getStatement());
		statementListEClass.getESuperTypes().add(theCorePackage.getDirectory());
		statementListEntryEClass.getESuperTypes().add(theCorePackage.getDirectoryEntry());
		statementMsgEClass.getESuperTypes().add(theCorePackage.getMessage());

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
			getDocumentRoot_Statement(), this.getStatement(), null, "statement", null, 0, -2, null, IS_TRANSIENT,
			IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
			IS_ORDERED);
		initEReference(
			getDocumentRoot_StatementDirectory(), this.getStatementDirectory(), null, "statementDirectory", null, 0,
			-2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
			IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_StatementList(), this.getStatementList(), null, "statementList", null, 0, -2, null,
			IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_StatementMsg(), this.getStatementMsg(), null, "statementMsg", null, 0, -2, null,
			IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			IS_DERIVED, IS_ORDERED);

		initEClass(
			statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getStatement_StatementURI(), theCorePackage.getURI(), "statementURI", null, 1, 1, Statement.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getStatement_Subject(), this.getStatementSubject(), null, "subject", null, 1, 1, Statement.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getStatement_Predicate(), theCorePackage.getURIAndEntityName(), null, "predicate", null, 1, 1,
			Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getStatement_Target(), theCorePackage.getStatementTarget(), null, "target", null, 0, -1, Statement.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getStatement_AssociatedAttribute(), theCorePackage.getModelAttributeReference(), null,
			"associatedAttribute", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getStatement_Source(), theCorePackage.getSourceAndRoleReference(), null, "source", null, 0, -1,
			Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getStatement_AssertedBy(), theCorePackage.getCodeSystemVersionReference(), null, "assertedBy", null, 1, 1,
			Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getStatement_AssertedIn(), theCorePackage.getCodeSystemVersionReference(), null, "assertedIn", null, 0, 1,
			Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getStatement_Qualifier(), this.getStatementQualifier(), null, "qualifier", null, 0, -1, Statement.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			statementDirectoryEClass, StatementDirectory.class, "StatementDirectory", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getStatementDirectory_Entry(), this.getStatementDirectoryEntry(), null, "entry", null, 0, -1,
			StatementDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			statementDirectoryEntryEClass, StatementDirectoryEntry.class, "StatementDirectoryEntry", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getStatementDirectoryEntry_Href(), theCorePackage.getRenderingURI(), "href", null, 0, 1,
			StatementDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getStatementDirectoryEntry_MatchStrength(), theCorePackage.getMatchStrength(), "matchStrength", null, 0, 1,
			StatementDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getStatementDirectoryEntry_ResourceName(), theCorePackage.getLocalIdentifier(), "resourceName", null, 0, 1,
			StatementDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			statementListEClass, StatementList.class, "StatementList", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getStatementList_Entry(), this.getStatementListEntry(), null, "entry", null, 0, -1, StatementList.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			statementListEntryEClass, StatementListEntry.class, "StatementListEntry", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getStatementListEntry_Entry(), this.getStatement(), null, "entry", null, 1, 1, StatementListEntry.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			statementMsgEClass, StatementMsg.class, "StatementMsg", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getStatementMsg_Statement(), this.getStatement(), null, "statement", null, 1, 1, StatementMsg.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			statementQualifierEClass, StatementQualifier.class, "StatementQualifier", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getStatementQualifier_QualifierPredicate(), theCorePackage.getURIAndEntityName(), null,
			"qualifierPredicate", null, 1, 1, StatementQualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getStatementQualifier_AssociatedAttribute(), theCorePackage.getModelAttributeReference(), null,
			"associatedAttribute", null, 0, 1, StatementQualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getStatementQualifier_Target(), theCorePackage.getStatementTarget(), null, "target", null, 1, 1,
			StatementQualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			statementSubjectEClass, StatementSubject.class, "StatementSubject", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getStatementSubject_Resource(), theCorePackage.getExternalURI(), "resource", null, 0, 1,
			StatementSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getStatementSubject_Entity(), theCorePackage.getURIAndEntityName(), null, "entity", null, 0, 1,
			StatementSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		addAnnotation(getDocumentRoot_Statement(), source, new String[] {
				"kind", "element", "name", "Statement", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_StatementDirectory(), source, new String[] {
				"kind", "element", "name", "StatementDirectory", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_StatementList(), source, new String[] {
				"kind", "element", "name", "StatementList", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_StatementMsg(), source, new String[] {
				"kind", "element", "name", "StatementMsg", "namespace", "##targetNamespace" });
		addAnnotation(statementEClass, source, new String[] { "name", "Statement", "kind", "elementOnly" });
		addAnnotation(getStatement_StatementURI(), source, new String[] {
				"kind", "element", "name", "statementURI", "namespace", "##targetNamespace" });
		addAnnotation(getStatement_Subject(), source, new String[] {
				"kind", "element", "name", "subject", "namespace", "##targetNamespace" });
		addAnnotation(getStatement_Predicate(), source, new String[] {
				"kind", "element", "name", "predicate", "namespace", "##targetNamespace" });
		addAnnotation(getStatement_Target(), source, new String[] {
				"kind", "element", "name", "target", "namespace", "##targetNamespace" });
		addAnnotation(getStatement_AssociatedAttribute(), source, new String[] {
				"kind", "element", "name", "associatedAttribute", "namespace", "##targetNamespace" });
		addAnnotation(getStatement_Source(), source, new String[] {
				"kind", "element", "name", "source", "namespace", "##targetNamespace" });
		addAnnotation(getStatement_AssertedBy(), source, new String[] {
				"kind", "element", "name", "assertedBy", "namespace", "##targetNamespace" });
		addAnnotation(getStatement_AssertedIn(), source, new String[] {
				"kind", "element", "name", "assertedIn", "namespace", "##targetNamespace" });
		addAnnotation(getStatement_Qualifier(), source, new String[] {
				"kind", "element", "name", "qualifier", "namespace", "##targetNamespace" });
		addAnnotation(statementDirectoryEClass, source, new String[] {
				"name", "StatementDirectory", "kind", "elementOnly" });
		addAnnotation(getStatementDirectory_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(statementDirectoryEntryEClass, source, new String[] {
				"name", "StatementDirectoryEntry", "kind", "elementOnly" });
		addAnnotation(getStatementDirectoryEntry_Href(), source, new String[] { "kind", "attribute", "name", "href" });
		addAnnotation(getStatementDirectoryEntry_MatchStrength(), source, new String[] {
				"kind", "attribute", "name", "matchStrength" });
		addAnnotation(getStatementDirectoryEntry_ResourceName(), source, new String[] {
				"kind", "attribute", "name", "resourceName" });
		addAnnotation(statementListEClass, source, new String[] { "name", "StatementList", "kind", "elementOnly" });
		addAnnotation(getStatementList_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(statementListEntryEClass, source, new String[] {
				"name", "StatementListEntry", "kind", "elementOnly" });
		addAnnotation(getStatementListEntry_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(statementMsgEClass, source, new String[] { "name", "StatementMsg", "kind", "elementOnly" });
		addAnnotation(getStatementMsg_Statement(), source, new String[] {
				"kind", "element", "name", "statement", "namespace", "##targetNamespace" });
		addAnnotation(statementQualifierEClass, source, new String[] {
				"name", "StatementQualifier", "kind", "elementOnly" });
		addAnnotation(getStatementQualifier_QualifierPredicate(), source, new String[] {
				"kind", "element", "name", "qualifierPredicate", "namespace", "##targetNamespace" });
		addAnnotation(getStatementQualifier_AssociatedAttribute(), source, new String[] {
				"kind", "element", "name", "associatedAttribute", "namespace", "##targetNamespace" });
		addAnnotation(getStatementQualifier_Target(), source, new String[] {
				"kind", "element", "name", "target", "namespace", "##targetNamespace" });
		addAnnotation(
			statementSubjectEClass, source, new String[] { "name", "StatementSubject", "kind", "elementOnly" });
		addAnnotation(getStatementSubject_Resource(), source, new String[] {
				"kind", "element", "name", "resource", "namespace", "##targetNamespace" });
		addAnnotation(getStatementSubject_Entity(), source, new String[] {
				"kind", "element", "name", "entity", "namespace", "##targetNamespace" });
	}

} // StatementPackageImpl
