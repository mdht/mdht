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
package org.openhealthtools.mdht.cts2.association.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.cts2.association.Association;
import org.openhealthtools.mdht.cts2.association.AssociationDerivation;
import org.openhealthtools.mdht.cts2.association.AssociationDirectory;
import org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry;
import org.openhealthtools.mdht.cts2.association.AssociationFactory;
import org.openhealthtools.mdht.cts2.association.AssociationGraph;
import org.openhealthtools.mdht.cts2.association.AssociationList;
import org.openhealthtools.mdht.cts2.association.AssociationListEntry;
import org.openhealthtools.mdht.cts2.association.AssociationMsg;
import org.openhealthtools.mdht.cts2.association.AssociationPackage;
import org.openhealthtools.mdht.cts2.association.AssociationRendering;
import org.openhealthtools.mdht.cts2.association.DocumentRoot;
import org.openhealthtools.mdht.cts2.association.GraphDirection;
import org.openhealthtools.mdht.cts2.association.GraphFocus;
import org.openhealthtools.mdht.cts2.association.GraphNode;
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
public class AssociationPackageImpl extends EPackageImpl implements AssociationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass associationDirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass associationDirectoryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass associationGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass associationListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass associationListEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass associationMsgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass associationRenderingEClass = null;

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
	private EClass graphNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum associationDerivationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum graphDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum graphFocusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType associationDerivationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType graphDirectionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType graphFocusObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssociationPackageImpl() {
		super(eNS_URI, AssociationFactory.eINSTANCE);
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
	 * This method is used to initialize {@link AssociationPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AssociationPackage init() {
		if (isInited) {
			return (AssociationPackage) EPackage.Registry.INSTANCE.getEPackage(AssociationPackage.eNS_URI);
		}

		// Obtain or create and register package
		AssociationPackageImpl theAssociationPackage = (AssociationPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AssociationPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new AssociationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
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
		ValueSetPackageImpl theValueSetPackage = (ValueSetPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ValueSetPackage.eNS_URI) instanceof ValueSetPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(ValueSetPackage.eNS_URI)
				: ValueSetPackage.eINSTANCE);
		ValueSetDefinitionPackageImpl theValueSetDefinitionPackage = (ValueSetDefinitionPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ValueSetDefinitionPackage.eNS_URI) instanceof ValueSetDefinitionPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(ValueSetDefinitionPackage.eNS_URI)
				: ValueSetDefinitionPackage.eINSTANCE);

		// Create package meta-data objects
		theAssociationPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theCodeSystemPackage.createPackageContents();
		theCodeSystemVersionPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theStatementPackage.createPackageContents();
		theValueSetPackage.createPackageContents();
		theValueSetDefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theAssociationPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theCodeSystemPackage.initializePackageContents();
		theCodeSystemVersionPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theStatementPackage.initializePackageContents();
		theValueSetPackage.initializePackageContents();
		theValueSetDefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAssociationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AssociationPackage.eNS_URI, theAssociationPackage);
		return theAssociationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociation_Subject() {
		return (EReference) associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociation_Predicate() {
		return (EReference) associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociation_Target() {
		return (EReference) associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociation_AssociationQualifier() {
		return (EReference) associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociation_AssertedBy() {
		return (EReference) associationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociation_AssertedIn() {
		return (EReference) associationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociation_DerivationReasoningAlgorithm() {
		return (EReference) associationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociation_SourceStatements() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociation_AssociationID() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociation_Derivation() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociation_LocalID() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssociationDirectory() {
		return associationDirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociationDirectory_Entry() {
		return (EReference) associationDirectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssociationDirectoryEntry() {
		return associationDirectoryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociationDirectoryEntry_Subject() {
		return (EReference) associationDirectoryEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociationDirectoryEntry_Predicate() {
		return (EReference) associationDirectoryEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociationDirectoryEntry_Target() {
		return (EReference) associationDirectoryEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociationDirectoryEntry_AssertedBy() {
		return (EReference) associationDirectoryEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssociationGraph() {
		return associationGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociationGraph_FocusEntity() {
		return (EReference) associationGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociationGraph_Entry() {
		return (EReference) associationGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociationGraph_ExpansionDepth() {
		return (EAttribute) associationGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociationGraph_ExpansionDirection() {
		return (EAttribute) associationGraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociationGraph_GraphFocus() {
		return (EAttribute) associationGraphEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssociationList() {
		return associationListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociationList_Entry() {
		return (EReference) associationListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssociationListEntry() {
		return associationListEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociationListEntry_Href() {
		return (EAttribute) associationListEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociationListEntry_MatchStrength() {
		return (EAttribute) associationListEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociationListEntry_ResourceName() {
		return (EAttribute) associationListEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssociationMsg() {
		return associationMsgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociationMsg_Association() {
		return (EReference) associationMsgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssociationRendering() {
		return associationRenderingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociationRendering_LanguageAndSyntax() {
		return (EReference) associationRenderingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociationRendering_Representation() {
		return (EReference) associationRenderingEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_Association() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_AssociationDirectory() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_AssociationGraph() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_AssociationList() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_AssociationMsg() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGraphNode() {
		return graphNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGraphNode_NodeEntity() {
		return (EReference) graphNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGraphNode_Direction() {
		return (EAttribute) graphNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGraphNode_NextNodeNumber() {
		return (EAttribute) graphNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGraphNode_NodeNumber() {
		return (EAttribute) graphNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getAssociationDerivation() {
		return associationDerivationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getGraphDirection() {
		return graphDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getGraphFocus() {
		return graphFocusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getAssociationDerivationObject() {
		return associationDerivationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getGraphDirectionObject() {
		return graphDirectionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getGraphFocusObject() {
		return graphFocusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationFactory getAssociationFactory() {
		return (AssociationFactory) getEFactoryInstance();
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
		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__SUBJECT);
		createEReference(associationEClass, ASSOCIATION__PREDICATE);
		createEReference(associationEClass, ASSOCIATION__TARGET);
		createEReference(associationEClass, ASSOCIATION__ASSOCIATION_QUALIFIER);
		createEReference(associationEClass, ASSOCIATION__ASSERTED_BY);
		createEReference(associationEClass, ASSOCIATION__ASSERTED_IN);
		createEReference(associationEClass, ASSOCIATION__DERIVATION_REASONING_ALGORITHM);
		createEAttribute(associationEClass, ASSOCIATION__SOURCE_STATEMENTS);
		createEAttribute(associationEClass, ASSOCIATION__ASSOCIATION_ID);
		createEAttribute(associationEClass, ASSOCIATION__DERIVATION);
		createEAttribute(associationEClass, ASSOCIATION__LOCAL_ID);

		associationDirectoryEClass = createEClass(ASSOCIATION_DIRECTORY);
		createEReference(associationDirectoryEClass, ASSOCIATION_DIRECTORY__ENTRY);

		associationDirectoryEntryEClass = createEClass(ASSOCIATION_DIRECTORY_ENTRY);
		createEReference(associationDirectoryEntryEClass, ASSOCIATION_DIRECTORY_ENTRY__SUBJECT);
		createEReference(associationDirectoryEntryEClass, ASSOCIATION_DIRECTORY_ENTRY__PREDICATE);
		createEReference(associationDirectoryEntryEClass, ASSOCIATION_DIRECTORY_ENTRY__TARGET);
		createEReference(associationDirectoryEntryEClass, ASSOCIATION_DIRECTORY_ENTRY__ASSERTED_BY);

		associationGraphEClass = createEClass(ASSOCIATION_GRAPH);
		createEReference(associationGraphEClass, ASSOCIATION_GRAPH__FOCUS_ENTITY);
		createEReference(associationGraphEClass, ASSOCIATION_GRAPH__ENTRY);
		createEAttribute(associationGraphEClass, ASSOCIATION_GRAPH__EXPANSION_DEPTH);
		createEAttribute(associationGraphEClass, ASSOCIATION_GRAPH__EXPANSION_DIRECTION);
		createEAttribute(associationGraphEClass, ASSOCIATION_GRAPH__GRAPH_FOCUS);

		associationListEClass = createEClass(ASSOCIATION_LIST);
		createEReference(associationListEClass, ASSOCIATION_LIST__ENTRY);

		associationListEntryEClass = createEClass(ASSOCIATION_LIST_ENTRY);
		createEAttribute(associationListEntryEClass, ASSOCIATION_LIST_ENTRY__HREF);
		createEAttribute(associationListEntryEClass, ASSOCIATION_LIST_ENTRY__MATCH_STRENGTH);
		createEAttribute(associationListEntryEClass, ASSOCIATION_LIST_ENTRY__RESOURCE_NAME);

		associationMsgEClass = createEClass(ASSOCIATION_MSG);
		createEReference(associationMsgEClass, ASSOCIATION_MSG__ASSOCIATION);

		associationRenderingEClass = createEClass(ASSOCIATION_RENDERING);
		createEReference(associationRenderingEClass, ASSOCIATION_RENDERING__LANGUAGE_AND_SYNTAX);
		createEReference(associationRenderingEClass, ASSOCIATION_RENDERING__REPRESENTATION);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ASSOCIATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ASSOCIATION_DIRECTORY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ASSOCIATION_GRAPH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ASSOCIATION_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ASSOCIATION_MSG);

		graphNodeEClass = createEClass(GRAPH_NODE);
		createEReference(graphNodeEClass, GRAPH_NODE__NODE_ENTITY);
		createEAttribute(graphNodeEClass, GRAPH_NODE__DIRECTION);
		createEAttribute(graphNodeEClass, GRAPH_NODE__NEXT_NODE_NUMBER);
		createEAttribute(graphNodeEClass, GRAPH_NODE__NODE_NUMBER);

		// Create enums
		associationDerivationEEnum = createEEnum(ASSOCIATION_DERIVATION);
		graphDirectionEEnum = createEEnum(GRAPH_DIRECTION);
		graphFocusEEnum = createEEnum(GRAPH_FOCUS);

		// Create data types
		associationDerivationObjectEDataType = createEDataType(ASSOCIATION_DERIVATION_OBJECT);
		graphDirectionObjectEDataType = createEDataType(GRAPH_DIRECTION_OBJECT);
		graphFocusObjectEDataType = createEDataType(GRAPH_FOCUS_OBJECT);
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
		associationEClass.getESuperTypes().add(theCorePackage.getChangeable());
		associationDirectoryEClass.getESuperTypes().add(theCorePackage.getDirectory());
		associationDirectoryEntryEClass.getESuperTypes().add(theCorePackage.getDirectoryEntry());
		associationGraphEClass.getESuperTypes().add(theCorePackage.getDirectory());
		associationListEClass.getESuperTypes().add(theCorePackage.getDirectory());
		associationListEntryEClass.getESuperTypes().add(this.getAssociation());
		associationMsgEClass.getESuperTypes().add(theCorePackage.getMessage());
		graphNodeEClass.getESuperTypes().add(this.getAssociationDirectoryEntry());

		// Initialize classes and features; add operations and parameters
		initEClass(
			associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getAssociation_Subject(), theCorePackage.getURIAndEntityName(), null, "subject", null, 1, 1,
			Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getAssociation_Predicate(), theCorePackage.getPredicateReference(), null, "predicate", null, 1, 1,
			Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getAssociation_Target(), theCorePackage.getStatementTarget(), null, "target", null, 1, -1,
			Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getAssociation_AssociationQualifier(), theCorePackage.getProperty(), null, "associationQualifier", null, 0,
			-1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getAssociation_AssertedBy(), theCorePackage.getCodeSystemVersionReference(), null, "assertedBy", null, 1,
			1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getAssociation_AssertedIn(), theCorePackage.getCodeSystemVersionReference(), null, "assertedIn", null, 0,
			1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getAssociation_DerivationReasoningAlgorithm(), theCorePackage.getReasoningAlgorithmReference(), null,
			"derivationReasoningAlgorithm", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getAssociation_SourceStatements(), theCorePackage.getStatementDirectoryURI(), "sourceStatements", null, 0,
			1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getAssociation_AssociationID(), theCorePackage.getURI(), "associationID", null, 1, 1, Association.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getAssociation_Derivation(), this.getAssociationDerivation(), "derivation", "ASSERTED", 0, 1,
			Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getAssociation_LocalID(), theCorePackage.getString(), "localID", null, 0, 1, Association.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			associationDirectoryEClass, AssociationDirectory.class, "AssociationDirectory", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getAssociationDirectory_Entry(), this.getAssociationDirectoryEntry(), null, "entry", null, 0, -1,
			AssociationDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			associationDirectoryEntryEClass, AssociationDirectoryEntry.class, "AssociationDirectoryEntry",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getAssociationDirectoryEntry_Subject(), theCorePackage.getURIAndEntityName(), null, "subject", null, 1, 1,
			AssociationDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getAssociationDirectoryEntry_Predicate(), theCorePackage.getPredicateReference(), null, "predicate", null,
			1, 1, AssociationDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getAssociationDirectoryEntry_Target(), theCorePackage.getStatementTarget(), null, "target", null, 1, 1,
			AssociationDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getAssociationDirectoryEntry_AssertedBy(), theCorePackage.getCodeSystemVersionReference(), null,
			"assertedBy", null, 1, 1, AssociationDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			associationGraphEClass, AssociationGraph.class, "AssociationGraph", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getAssociationGraph_FocusEntity(), theCorePackage.getURIAndEntityName(), null, "focusEntity", null, 0, 1,
			AssociationGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getAssociationGraph_Entry(), this.getGraphNode(), null, "entry", null, 0, -1, AssociationGraph.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getAssociationGraph_ExpansionDepth(), theCorePackage.getNaturalNumber(), "expansionDepth", null, 0, 1,
			AssociationGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getAssociationGraph_ExpansionDirection(), this.getGraphDirection(), "expansionDirection", null, 1, 1,
			AssociationGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getAssociationGraph_GraphFocus(), this.getGraphFocus(), "graphFocus", null, 1, 1, AssociationGraph.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			associationListEClass, AssociationList.class, "AssociationList", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getAssociationList_Entry(), this.getAssociationListEntry(), null, "entry", null, 0, -1,
			AssociationList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			associationListEntryEClass, AssociationListEntry.class, "AssociationListEntry", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getAssociationListEntry_Href(), theCorePackage.getRenderingURI(), "href", null, 0, 1,
			AssociationListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getAssociationListEntry_MatchStrength(), theCorePackage.getMatchStrength(), "matchStrength", null, 0, 1,
			AssociationListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getAssociationListEntry_ResourceName(), theCorePackage.getLocalIdentifier(), "resourceName", null, 0, 1,
			AssociationListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			associationMsgEClass, AssociationMsg.class, "AssociationMsg", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getAssociationMsg_Association(), this.getAssociation(), null, "association", null, 1, 1,
			AssociationMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			associationRenderingEClass, AssociationRendering.class, "AssociationRendering", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getAssociationRendering_LanguageAndSyntax(), theCorePackage.getOntologyLanguageAndSyntax(), null,
			"languageAndSyntax", null, 1, 1, AssociationRendering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getAssociationRendering_Representation(), theCorePackage.getOpaqueData(), null, "representation", null, 1,
			1, AssociationRendering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			getDocumentRoot_Association(), this.getAssociation(), null, "association", null, 0, -2, null, IS_TRANSIENT,
			IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
			IS_ORDERED);
		initEReference(
			getDocumentRoot_AssociationDirectory(), this.getAssociationDirectory(), null, "associationDirectory", null,
			0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
			IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_AssociationGraph(), this.getAssociationGraph(), null, "associationGraph", null, 0, -2,
			null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
			IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_AssociationList(), this.getAssociationList(), null, "associationList", null, 0, -2, null,
			IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_AssociationMsg(), this.getAssociationMsg(), null, "associationMsg", null, 0, -2, null,
			IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			IS_DERIVED, IS_ORDERED);

		initEClass(
			graphNodeEClass, GraphNode.class, "GraphNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getGraphNode_NodeEntity(), theCorePackage.getEntitySynopsis(), null, "nodeEntity", null, 1, 1,
			GraphNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getGraphNode_Direction(), theCorePackage.getAssociationDirection(), "direction", null, 1, 1,
			GraphNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);
		initEAttribute(
			getGraphNode_NextNodeNumber(), theCorePackage.getNaturalNumber(), "nextNodeNumber", null, 0, 1,
			GraphNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getGraphNode_NodeNumber(), theCorePackage.getNaturalNumber(), "nodeNumber", null, 1, 1, GraphNode.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(associationDerivationEEnum, AssociationDerivation.class, "AssociationDerivation");
		addEEnumLiteral(associationDerivationEEnum, AssociationDerivation.ASSERTED);
		addEEnumLiteral(associationDerivationEEnum, AssociationDerivation.INFERRED);

		initEEnum(graphDirectionEEnum, GraphDirection.class, "GraphDirection");
		addEEnumLiteral(graphDirectionEEnum, GraphDirection.FORWARD);
		addEEnumLiteral(graphDirectionEEnum, GraphDirection.REVERSE);
		addEEnumLiteral(graphDirectionEEnum, GraphDirection.BOTH);

		initEEnum(graphFocusEEnum, GraphFocus.class, "GraphFocus");
		addEEnumLiteral(graphFocusEEnum, GraphFocus.SPECIFICENTITY);
		addEEnumLiteral(graphFocusEEnum, GraphFocus.TOPNODE);
		addEEnumLiteral(graphFocusEEnum, GraphFocus.BOTTOMNODE);

		// Initialize data types
		initEDataType(
			associationDerivationObjectEDataType, AssociationDerivation.class, "AssociationDerivationObject",
			IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			graphDirectionObjectEDataType, GraphDirection.class, "GraphDirectionObject", IS_SERIALIZABLE,
			IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			graphFocusObjectEDataType, GraphFocus.class, "GraphFocusObject", IS_SERIALIZABLE,
			IS_GENERATED_INSTANCE_CLASS);

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
		addAnnotation(associationEClass, source, new String[] { "name", "Association", "kind", "elementOnly" });
		addAnnotation(getAssociation_Subject(), source, new String[] {
				"kind", "element", "name", "subject", "namespace", "##targetNamespace" });
		addAnnotation(getAssociation_Predicate(), source, new String[] {
				"kind", "element", "name", "predicate", "namespace", "##targetNamespace" });
		addAnnotation(getAssociation_Target(), source, new String[] {
				"kind", "element", "name", "target", "namespace", "##targetNamespace" });
		addAnnotation(getAssociation_AssociationQualifier(), source, new String[] {
				"kind", "element", "name", "associationQualifier", "namespace", "##targetNamespace" });
		addAnnotation(getAssociation_AssertedBy(), source, new String[] {
				"kind", "element", "name", "assertedBy", "namespace", "##targetNamespace" });
		addAnnotation(getAssociation_AssertedIn(), source, new String[] {
				"kind", "element", "name", "assertedIn", "namespace", "##targetNamespace" });
		addAnnotation(getAssociation_DerivationReasoningAlgorithm(), source, new String[] {
				"kind", "element", "name", "derivationReasoningAlgorithm", "namespace", "##targetNamespace" });
		addAnnotation(getAssociation_SourceStatements(), source, new String[] {
				"kind", "element", "name", "sourceStatements", "namespace", "##targetNamespace" });
		addAnnotation(getAssociation_AssociationID(), source, new String[] {
				"kind", "attribute", "name", "associationID" });
		addAnnotation(getAssociation_Derivation(), source, new String[] { "kind", "attribute", "name", "derivation" });
		addAnnotation(getAssociation_LocalID(), source, new String[] { "kind", "attribute", "name", "localID" });
		addAnnotation(associationDerivationEEnum, source, new String[] { "name", "AssociationDerivation" });
		addAnnotation(associationDerivationObjectEDataType, source, new String[] {
				"name", "AssociationDerivation:Object", "baseType", "AssociationDerivation" });
		addAnnotation(associationDirectoryEClass, source, new String[] {
				"name", "AssociationDirectory", "kind", "elementOnly" });
		addAnnotation(getAssociationDirectory_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(associationDirectoryEntryEClass, source, new String[] {
				"name", "AssociationDirectoryEntry", "kind", "elementOnly" });
		addAnnotation(getAssociationDirectoryEntry_Subject(), source, new String[] {
				"kind", "element", "name", "subject", "namespace", "##targetNamespace" });
		addAnnotation(getAssociationDirectoryEntry_Predicate(), source, new String[] {
				"kind", "element", "name", "predicate", "namespace", "##targetNamespace" });
		addAnnotation(getAssociationDirectoryEntry_Target(), source, new String[] {
				"kind", "element", "name", "target", "namespace", "##targetNamespace" });
		addAnnotation(getAssociationDirectoryEntry_AssertedBy(), source, new String[] {
				"kind", "element", "name", "assertedBy", "namespace", "##targetNamespace" });
		addAnnotation(
			associationGraphEClass, source, new String[] { "name", "AssociationGraph", "kind", "elementOnly" });
		addAnnotation(getAssociationGraph_FocusEntity(), source, new String[] {
				"kind", "element", "name", "focusEntity", "namespace", "##targetNamespace" });
		addAnnotation(getAssociationGraph_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(getAssociationGraph_ExpansionDepth(), source, new String[] {
				"kind", "attribute", "name", "expansionDepth" });
		addAnnotation(getAssociationGraph_ExpansionDirection(), source, new String[] {
				"kind", "attribute", "name", "expansionDirection" });
		addAnnotation(getAssociationGraph_GraphFocus(), source, new String[] {
				"kind", "attribute", "name", "graphFocus" });
		addAnnotation(associationListEClass, source, new String[] { "name", "AssociationList", "kind", "elementOnly" });
		addAnnotation(getAssociationList_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(associationListEntryEClass, source, new String[] {
				"name", "AssociationListEntry", "kind", "elementOnly" });
		addAnnotation(getAssociationListEntry_Href(), source, new String[] { "kind", "attribute", "name", "href" });
		addAnnotation(getAssociationListEntry_MatchStrength(), source, new String[] {
				"kind", "attribute", "name", "matchStrength" });
		addAnnotation(getAssociationListEntry_ResourceName(), source, new String[] {
				"kind", "attribute", "name", "resourceName" });
		addAnnotation(associationMsgEClass, source, new String[] { "name", "AssociationMsg", "kind", "elementOnly" });
		addAnnotation(getAssociationMsg_Association(), source, new String[] {
				"kind", "element", "name", "association", "namespace", "##targetNamespace" });
		addAnnotation(associationRenderingEClass, source, new String[] {
				"name", "AssociationRendering", "kind", "elementOnly" });
		addAnnotation(getAssociationRendering_LanguageAndSyntax(), source, new String[] {
				"kind", "element", "name", "languageAndSyntax", "namespace", "##targetNamespace" });
		addAnnotation(getAssociationRendering_Representation(), source, new String[] {
				"kind", "element", "name", "representation", "namespace", "##targetNamespace" });
		addAnnotation(documentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
		addAnnotation(getDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" });
		addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source, new String[] {
				"kind", "attribute", "name", "xmlns:prefix" });
		addAnnotation(getDocumentRoot_XSISchemaLocation(), source, new String[] {
				"kind", "attribute", "name", "xsi:schemaLocation" });
		addAnnotation(getDocumentRoot_Association(), source, new String[] {
				"kind", "element", "name", "Association", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_AssociationDirectory(), source, new String[] {
				"kind", "element", "name", "AssociationDirectory", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_AssociationGraph(), source, new String[] {
				"kind", "element", "name", "AssociationGraph", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_AssociationList(), source, new String[] {
				"kind", "element", "name", "AssociationList", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_AssociationMsg(), source, new String[] {
				"kind", "element", "name", "AssociationMsg", "namespace", "##targetNamespace" });
		addAnnotation(graphDirectionEEnum, source, new String[] { "name", "GraphDirection" });
		addAnnotation(graphDirectionObjectEDataType, source, new String[] {
				"name", "GraphDirection:Object", "baseType", "GraphDirection" });
		addAnnotation(graphFocusEEnum, source, new String[] { "name", "GraphFocus" });
		addAnnotation(graphFocusObjectEDataType, source, new String[] {
				"name", "GraphFocus:Object", "baseType", "GraphFocus" });
		addAnnotation(graphNodeEClass, source, new String[] { "name", "GraphNode", "kind", "elementOnly" });
		addAnnotation(getGraphNode_NodeEntity(), source, new String[] {
				"kind", "element", "name", "nodeEntity", "namespace", "##targetNamespace" });
		addAnnotation(getGraphNode_Direction(), source, new String[] { "kind", "attribute", "name", "direction" });
		addAnnotation(getGraphNode_NextNodeNumber(), source, new String[] {
				"kind", "attribute", "name", "nextNodeNumber" });
		addAnnotation(getGraphNode_NodeNumber(), source, new String[] { "kind", "attribute", "name", "nodeNumber" });
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
		addAnnotation(getAssociation_LocalID(), source, new String[] { "appinfo", "PSM" });
		addAnnotation(associationMsgEClass, source, new String[] { "appinfo", "PSM" });
	}

} // AssociationPackageImpl
