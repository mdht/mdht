/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
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
import org.openhealthtools.mdht.cts2.valueset.ValueSetPackage;
import org.openhealthtools.mdht.cts2.valueset.impl.ValueSetPackageImpl;
import org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ExternalValueSetDefinition;
import org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet;
import org.openhealthtools.mdht.cts2.valuesetdefinition.LeafOrAll;
import org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectory;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectoryEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetMsg;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary;
import org.openhealthtools.mdht.cts2.valuesetdefinition.SetOperator;
import org.openhealthtools.mdht.cts2.valuesetdefinition.SpecificEntityList;
import org.openhealthtools.mdht.cts2.valuesetdefinition.TransitiveClosure;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectory;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectoryEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionFactory;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionList;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionListEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionMsg;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ValueSetDefinitionPackageImpl extends EPackageImpl implements ValueSetDefinitionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass associatedEntitiesReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass completeCodeSystemReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass completeValueSetReferenceEClass = null;

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
	private EClass externalValueSetDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iteratableResolvedValueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass propertyQueryReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass resolvedValueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass resolvedValueSetDirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass resolvedValueSetDirectoryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass resolvedValueSetHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass resolvedValueSetMsgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass resolvedValueSetSummaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass specificEntityListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass valueSetDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass valueSetDefinitionDirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass valueSetDefinitionDirectoryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass valueSetDefinitionEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass valueSetDefinitionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass valueSetDefinitionListEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass valueSetDefinitionMsgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum leafOrAllEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum setOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum transitiveClosureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType leafOrAllObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType setOperatorObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType transitiveClosureObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValueSetDefinitionPackageImpl() {
		super(eNS_URI, ValueSetDefinitionFactory.eINSTANCE);
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
	 * This method is used to initialize {@link ValueSetDefinitionPackage#eINSTANCE} when that field is accessed. Clients should not invoke it
	 * directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValueSetDefinitionPackage init() {
		if (isInited) {
			return (ValueSetDefinitionPackage) EPackage.Registry.INSTANCE.getEPackage(ValueSetDefinitionPackage.eNS_URI);
		}

		// Obtain or create and register package
		ValueSetDefinitionPackageImpl theValueSetDefinitionPackage = (ValueSetDefinitionPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ValueSetDefinitionPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new ValueSetDefinitionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

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
		ValueSetPackageImpl theValueSetPackage = (ValueSetPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ValueSetPackage.eNS_URI) instanceof ValueSetPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(ValueSetPackage.eNS_URI)
				: ValueSetPackage.eINSTANCE);

		// Create package meta-data objects
		theValueSetDefinitionPackage.createPackageContents();
		theAssociationPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theCodeSystemPackage.createPackageContents();
		theCodeSystemVersionPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theStatementPackage.createPackageContents();
		theValueSetPackage.createPackageContents();

		// Initialize created meta-data
		theValueSetDefinitionPackage.initializePackageContents();
		theAssociationPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theCodeSystemPackage.initializePackageContents();
		theCodeSystemVersionPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theStatementPackage.initializePackageContents();
		theValueSetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theValueSetDefinitionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValueSetDefinitionPackage.eNS_URI, theValueSetDefinitionPackage);
		return theValueSetDefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssociatedEntitiesReference() {
		return associatedEntitiesReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociatedEntitiesReference_ReferencedEntity() {
		return (EReference) associatedEntitiesReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociatedEntitiesReference_CodeSystem() {
		return (EReference) associatedEntitiesReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociatedEntitiesReference_CodeSystemVersion() {
		return (EReference) associatedEntitiesReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociatedEntitiesReference_Predicate() {
		return (EReference) associatedEntitiesReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociatedEntitiesReference_Direction() {
		return (EAttribute) associatedEntitiesReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociatedEntitiesReference_LeafOnly() {
		return (EAttribute) associatedEntitiesReferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociatedEntitiesReference_Transitivity() {
		return (EAttribute) associatedEntitiesReferenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCompleteCodeSystemReference() {
		return completeCodeSystemReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCompleteCodeSystemReference_CodeSystem() {
		return (EReference) completeCodeSystemReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCompleteCodeSystemReference_CodeSystemVersion() {
		return (EReference) completeCodeSystemReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCompleteValueSetReference() {
		return completeValueSetReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCompleteValueSetReference_ValueSet() {
		return (EReference) completeValueSetReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCompleteValueSetReference_ValueSetDefinition() {
		return (EReference) completeValueSetReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCompleteValueSetReference_ReferenceCodeSystemVersion() {
		return (EReference) completeValueSetReferenceEClass.getEStructuralFeatures().get(2);
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
	public EReference getDocumentRoot_IteratableResolvedValueSet() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_ResolvedValueSet() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_ResolvedValueSetDirectory() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_ResolvedValueSetMsg() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_ResolvedValueSetSummary() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_ValueSetDefinition() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_ValueSetDefinitionDirectory() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_ValueSetDefinitionEntry() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_ValueSetDefinitionList() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_ValueSetDefinitionMsg() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getExternalValueSetDefinition() {
		return externalValueSetDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIteratableResolvedValueSet() {
		return iteratableResolvedValueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIteratableResolvedValueSet_ResolutionInfo() {
		return (EReference) iteratableResolvedValueSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIteratableResolvedValueSet_Entry() {
		return (EReference) iteratableResolvedValueSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPropertyQueryReference() {
		return propertyQueryReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPropertyQueryReference_CodeSystem() {
		return (EReference) propertyQueryReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPropertyQueryReference_CodeSystemVersion() {
		return (EReference) propertyQueryReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPropertyQueryReference_Filter() {
		return (EReference) propertyQueryReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getResolvedValueSet() {
		return resolvedValueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResolvedValueSet_ResolutionInfo() {
		return (EReference) resolvedValueSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResolvedValueSet_Member() {
		return (EReference) resolvedValueSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getResolvedValueSetDirectory() {
		return resolvedValueSetDirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResolvedValueSetDirectory_Entry() {
		return (EReference) resolvedValueSetDirectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getResolvedValueSetDirectoryEntry() {
		return resolvedValueSetDirectoryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResolvedValueSetDirectoryEntry_Href() {
		return (EAttribute) resolvedValueSetDirectoryEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResolvedValueSetDirectoryEntry_MatchStrength() {
		return (EAttribute) resolvedValueSetDirectoryEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResolvedValueSetDirectoryEntry_ResourceName() {
		return (EAttribute) resolvedValueSetDirectoryEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getResolvedValueSetHeader() {
		return resolvedValueSetHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResolvedValueSetHeader_ResolutionOf() {
		return (EReference) resolvedValueSetHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResolvedValueSetHeader_ResolvedUsingCodeSystem() {
		return (EReference) resolvedValueSetHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResolvedValueSetHeader_IncludesResolvedValueSet() {
		return (EReference) resolvedValueSetHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getResolvedValueSetMsg() {
		return resolvedValueSetMsgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResolvedValueSetMsg_ResolvedValueSet() {
		return (EReference) resolvedValueSetMsgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getResolvedValueSetSummary() {
		return resolvedValueSetSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResolvedValueSetSummary_ResolvedHeader() {
		return (EReference) resolvedValueSetSummaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResolvedValueSetSummary_ResolvedValueSetURI() {
		return (EAttribute) resolvedValueSetSummaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSpecificEntityList() {
		return specificEntityListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSpecificEntityList_ReferencedEntity() {
		return (EReference) specificEntityListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValueSetDefinition() {
		return valueSetDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetDefinition_DefinedValueSet() {
		return (EReference) valueSetDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetDefinition_VersionTag() {
		return (EReference) valueSetDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetDefinition_Entry() {
		return (EReference) valueSetDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValueSetDefinitionDirectory() {
		return valueSetDefinitionDirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetDefinitionDirectory_Entry() {
		return (EReference) valueSetDefinitionDirectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValueSetDefinitionDirectoryEntry() {
		return valueSetDefinitionDirectoryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetDefinitionDirectoryEntry_DefinedValueSet() {
		return (EReference) valueSetDefinitionDirectoryEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetDefinitionDirectoryEntry_VersionTag() {
		return (EReference) valueSetDefinitionDirectoryEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValueSetDefinitionEntry() {
		return valueSetDefinitionEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetDefinitionEntry_AssociatedEntities() {
		return (EReference) valueSetDefinitionEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetDefinitionEntry_CompleteCodeSystem() {
		return (EReference) valueSetDefinitionEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetDefinitionEntry_CompleteValueSet() {
		return (EReference) valueSetDefinitionEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetDefinitionEntry_ExternalValueSetDefinition() {
		return (EReference) valueSetDefinitionEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetDefinitionEntry_PropertyQuery() {
		return (EReference) valueSetDefinitionEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetDefinitionEntry_EntityList() {
		return (EReference) valueSetDefinitionEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValueSetDefinitionEntry_EntryOrder() {
		return (EAttribute) valueSetDefinitionEntryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValueSetDefinitionEntry_Operator() {
		return (EAttribute) valueSetDefinitionEntryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValueSetDefinitionList() {
		return valueSetDefinitionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetDefinitionList_Entry() {
		return (EReference) valueSetDefinitionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValueSetDefinitionListEntry() {
		return valueSetDefinitionListEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetDefinitionListEntry_Entry() {
		return (EReference) valueSetDefinitionListEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValueSetDefinitionMsg() {
		return valueSetDefinitionMsgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetDefinitionMsg_ValueSetDefinition() {
		return (EReference) valueSetDefinitionMsgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getLeafOrAll() {
		return leafOrAllEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getSetOperator() {
		return setOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getTransitiveClosure() {
		return transitiveClosureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getLeafOrAllObject() {
		return leafOrAllObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getSetOperatorObject() {
		return setOperatorObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getTransitiveClosureObject() {
		return transitiveClosureObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionFactory getValueSetDefinitionFactory() {
		return (ValueSetDefinitionFactory) getEFactoryInstance();
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
		associatedEntitiesReferenceEClass = createEClass(ASSOCIATED_ENTITIES_REFERENCE);
		createEReference(associatedEntitiesReferenceEClass, ASSOCIATED_ENTITIES_REFERENCE__REFERENCED_ENTITY);
		createEReference(associatedEntitiesReferenceEClass, ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM);
		createEReference(associatedEntitiesReferenceEClass, ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM_VERSION);
		createEReference(associatedEntitiesReferenceEClass, ASSOCIATED_ENTITIES_REFERENCE__PREDICATE);
		createEAttribute(associatedEntitiesReferenceEClass, ASSOCIATED_ENTITIES_REFERENCE__DIRECTION);
		createEAttribute(associatedEntitiesReferenceEClass, ASSOCIATED_ENTITIES_REFERENCE__LEAF_ONLY);
		createEAttribute(associatedEntitiesReferenceEClass, ASSOCIATED_ENTITIES_REFERENCE__TRANSITIVITY);

		completeCodeSystemReferenceEClass = createEClass(COMPLETE_CODE_SYSTEM_REFERENCE);
		createEReference(completeCodeSystemReferenceEClass, COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM);
		createEReference(completeCodeSystemReferenceEClass, COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM_VERSION);

		completeValueSetReferenceEClass = createEClass(COMPLETE_VALUE_SET_REFERENCE);
		createEReference(completeValueSetReferenceEClass, COMPLETE_VALUE_SET_REFERENCE__VALUE_SET);
		createEReference(completeValueSetReferenceEClass, COMPLETE_VALUE_SET_REFERENCE__VALUE_SET_DEFINITION);
		createEReference(completeValueSetReferenceEClass, COMPLETE_VALUE_SET_REFERENCE__REFERENCE_CODE_SYSTEM_VERSION);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ITERATABLE_RESOLVED_VALUE_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RESOLVED_VALUE_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RESOLVED_VALUE_SET_DIRECTORY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RESOLVED_VALUE_SET_MSG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RESOLVED_VALUE_SET_SUMMARY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALUE_SET_DEFINITION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALUE_SET_DEFINITION_DIRECTORY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALUE_SET_DEFINITION_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALUE_SET_DEFINITION_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALUE_SET_DEFINITION_MSG);

		externalValueSetDefinitionEClass = createEClass(EXTERNAL_VALUE_SET_DEFINITION);

		iteratableResolvedValueSetEClass = createEClass(ITERATABLE_RESOLVED_VALUE_SET);
		createEReference(iteratableResolvedValueSetEClass, ITERATABLE_RESOLVED_VALUE_SET__RESOLUTION_INFO);
		createEReference(iteratableResolvedValueSetEClass, ITERATABLE_RESOLVED_VALUE_SET__ENTRY);

		propertyQueryReferenceEClass = createEClass(PROPERTY_QUERY_REFERENCE);
		createEReference(propertyQueryReferenceEClass, PROPERTY_QUERY_REFERENCE__CODE_SYSTEM);
		createEReference(propertyQueryReferenceEClass, PROPERTY_QUERY_REFERENCE__CODE_SYSTEM_VERSION);
		createEReference(propertyQueryReferenceEClass, PROPERTY_QUERY_REFERENCE__FILTER);

		resolvedValueSetEClass = createEClass(RESOLVED_VALUE_SET);
		createEReference(resolvedValueSetEClass, RESOLVED_VALUE_SET__RESOLUTION_INFO);
		createEReference(resolvedValueSetEClass, RESOLVED_VALUE_SET__MEMBER);

		resolvedValueSetDirectoryEClass = createEClass(RESOLVED_VALUE_SET_DIRECTORY);
		createEReference(resolvedValueSetDirectoryEClass, RESOLVED_VALUE_SET_DIRECTORY__ENTRY);

		resolvedValueSetDirectoryEntryEClass = createEClass(RESOLVED_VALUE_SET_DIRECTORY_ENTRY);
		createEAttribute(resolvedValueSetDirectoryEntryEClass, RESOLVED_VALUE_SET_DIRECTORY_ENTRY__HREF);
		createEAttribute(resolvedValueSetDirectoryEntryEClass, RESOLVED_VALUE_SET_DIRECTORY_ENTRY__MATCH_STRENGTH);
		createEAttribute(resolvedValueSetDirectoryEntryEClass, RESOLVED_VALUE_SET_DIRECTORY_ENTRY__RESOURCE_NAME);

		resolvedValueSetHeaderEClass = createEClass(RESOLVED_VALUE_SET_HEADER);
		createEReference(resolvedValueSetHeaderEClass, RESOLVED_VALUE_SET_HEADER__RESOLUTION_OF);
		createEReference(resolvedValueSetHeaderEClass, RESOLVED_VALUE_SET_HEADER__RESOLVED_USING_CODE_SYSTEM);
		createEReference(resolvedValueSetHeaderEClass, RESOLVED_VALUE_SET_HEADER__INCLUDES_RESOLVED_VALUE_SET);

		resolvedValueSetMsgEClass = createEClass(RESOLVED_VALUE_SET_MSG);
		createEReference(resolvedValueSetMsgEClass, RESOLVED_VALUE_SET_MSG__RESOLVED_VALUE_SET);

		resolvedValueSetSummaryEClass = createEClass(RESOLVED_VALUE_SET_SUMMARY);
		createEReference(resolvedValueSetSummaryEClass, RESOLVED_VALUE_SET_SUMMARY__RESOLVED_HEADER);
		createEAttribute(resolvedValueSetSummaryEClass, RESOLVED_VALUE_SET_SUMMARY__RESOLVED_VALUE_SET_URI);

		specificEntityListEClass = createEClass(SPECIFIC_ENTITY_LIST);
		createEReference(specificEntityListEClass, SPECIFIC_ENTITY_LIST__REFERENCED_ENTITY);

		valueSetDefinitionEClass = createEClass(VALUE_SET_DEFINITION);
		createEReference(valueSetDefinitionEClass, VALUE_SET_DEFINITION__DEFINED_VALUE_SET);
		createEReference(valueSetDefinitionEClass, VALUE_SET_DEFINITION__VERSION_TAG);
		createEReference(valueSetDefinitionEClass, VALUE_SET_DEFINITION__ENTRY);

		valueSetDefinitionDirectoryEClass = createEClass(VALUE_SET_DEFINITION_DIRECTORY);
		createEReference(valueSetDefinitionDirectoryEClass, VALUE_SET_DEFINITION_DIRECTORY__ENTRY);

		valueSetDefinitionDirectoryEntryEClass = createEClass(VALUE_SET_DEFINITION_DIRECTORY_ENTRY);
		createEReference(
			valueSetDefinitionDirectoryEntryEClass, VALUE_SET_DEFINITION_DIRECTORY_ENTRY__DEFINED_VALUE_SET);
		createEReference(valueSetDefinitionDirectoryEntryEClass, VALUE_SET_DEFINITION_DIRECTORY_ENTRY__VERSION_TAG);

		valueSetDefinitionEntryEClass = createEClass(VALUE_SET_DEFINITION_ENTRY);
		createEReference(valueSetDefinitionEntryEClass, VALUE_SET_DEFINITION_ENTRY__ASSOCIATED_ENTITIES);
		createEReference(valueSetDefinitionEntryEClass, VALUE_SET_DEFINITION_ENTRY__COMPLETE_CODE_SYSTEM);
		createEReference(valueSetDefinitionEntryEClass, VALUE_SET_DEFINITION_ENTRY__COMPLETE_VALUE_SET);
		createEReference(valueSetDefinitionEntryEClass, VALUE_SET_DEFINITION_ENTRY__EXTERNAL_VALUE_SET_DEFINITION);
		createEReference(valueSetDefinitionEntryEClass, VALUE_SET_DEFINITION_ENTRY__PROPERTY_QUERY);
		createEReference(valueSetDefinitionEntryEClass, VALUE_SET_DEFINITION_ENTRY__ENTITY_LIST);
		createEAttribute(valueSetDefinitionEntryEClass, VALUE_SET_DEFINITION_ENTRY__ENTRY_ORDER);
		createEAttribute(valueSetDefinitionEntryEClass, VALUE_SET_DEFINITION_ENTRY__OPERATOR);

		valueSetDefinitionListEClass = createEClass(VALUE_SET_DEFINITION_LIST);
		createEReference(valueSetDefinitionListEClass, VALUE_SET_DEFINITION_LIST__ENTRY);

		valueSetDefinitionListEntryEClass = createEClass(VALUE_SET_DEFINITION_LIST_ENTRY);
		createEReference(valueSetDefinitionListEntryEClass, VALUE_SET_DEFINITION_LIST_ENTRY__ENTRY);

		valueSetDefinitionMsgEClass = createEClass(VALUE_SET_DEFINITION_MSG);
		createEReference(valueSetDefinitionMsgEClass, VALUE_SET_DEFINITION_MSG__VALUE_SET_DEFINITION);

		// Create enums
		leafOrAllEEnum = createEEnum(LEAF_OR_ALL);
		setOperatorEEnum = createEEnum(SET_OPERATOR);
		transitiveClosureEEnum = createEEnum(TRANSITIVE_CLOSURE);

		// Create data types
		leafOrAllObjectEDataType = createEDataType(LEAF_OR_ALL_OBJECT);
		setOperatorObjectEDataType = createEDataType(SET_OPERATOR_OBJECT);
		transitiveClosureObjectEDataType = createEDataType(TRANSITIVE_CLOSURE_OBJECT);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		externalValueSetDefinitionEClass.getESuperTypes().add(theCorePackage.getOpaqueData());
		iteratableResolvedValueSetEClass.getESuperTypes().add(theCorePackage.getDirectory());
		resolvedValueSetDirectoryEClass.getESuperTypes().add(theCorePackage.getDirectory());
		resolvedValueSetDirectoryEntryEClass.getESuperTypes().add(this.getResolvedValueSetSummary());
		resolvedValueSetMsgEClass.getESuperTypes().add(theCorePackage.getMessage());
		valueSetDefinitionEClass.getESuperTypes().add(theCorePackage.getResourceVersionDescription());
		valueSetDefinitionDirectoryEClass.getESuperTypes().add(theCorePackage.getDirectory());
		valueSetDefinitionDirectoryEntryEClass.getESuperTypes().add(
			theCorePackage.getResourceVersionDescriptionDirectoryEntry());
		valueSetDefinitionListEClass.getESuperTypes().add(theCorePackage.getDirectory());
		valueSetDefinitionListEntryEClass.getESuperTypes().add(theCorePackage.getDirectoryEntry());
		valueSetDefinitionMsgEClass.getESuperTypes().add(theCorePackage.getMessage());

		// Initialize classes and features; add operations and parameters
		initEClass(
			associatedEntitiesReferenceEClass, AssociatedEntitiesReference.class, "AssociatedEntitiesReference",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getAssociatedEntitiesReference_ReferencedEntity(), theCorePackage.getURIAndEntityName(), null,
			"referencedEntity", null, 1, 1, AssociatedEntitiesReference.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getAssociatedEntitiesReference_CodeSystem(), theCorePackage.getCodeSystemReference(), null, "codeSystem",
			null, 1, 1, AssociatedEntitiesReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getAssociatedEntitiesReference_CodeSystemVersion(), theCorePackage.getCodeSystemVersionReference(), null,
			"codeSystemVersion", null, 0, 1, AssociatedEntitiesReference.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getAssociatedEntitiesReference_Predicate(), theCorePackage.getPredicateReference(), null, "predicate",
			null, 1, 1, AssociatedEntitiesReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getAssociatedEntitiesReference_Direction(), theCorePackage.getAssociationDirection(), "direction", null, 1,
			1, AssociatedEntitiesReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getAssociatedEntitiesReference_LeafOnly(), this.getLeafOrAll(), "leafOnly", "ALL_INTERMEDIATE_NODES", 0, 1,
			AssociatedEntitiesReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getAssociatedEntitiesReference_Transitivity(), this.getTransitiveClosure(), "transitivity",
			"DIRECTLY_ASSOCIATED", 0, 1, AssociatedEntitiesReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			completeCodeSystemReferenceEClass, CompleteCodeSystemReference.class, "CompleteCodeSystemReference",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCompleteCodeSystemReference_CodeSystem(), theCorePackage.getCodeSystemReference(), null, "codeSystem",
			null, 1, 1, CompleteCodeSystemReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getCompleteCodeSystemReference_CodeSystemVersion(), theCorePackage.getCodeSystemVersionReference(), null,
			"codeSystemVersion", null, 0, 1, CompleteCodeSystemReference.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			completeValueSetReferenceEClass, CompleteValueSetReference.class, "CompleteValueSetReference",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCompleteValueSetReference_ValueSet(), theCorePackage.getValueSetReference(), null, "valueSet", null, 1,
			1, CompleteValueSetReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getCompleteValueSetReference_ValueSetDefinition(), theCorePackage.getValueSetReference(), null,
			"valueSetDefinition", null, 0, 1, CompleteValueSetReference.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getCompleteValueSetReference_ReferenceCodeSystemVersion(), theCorePackage.getCodeSystemVersionReference(),
			null, "referenceCodeSystemVersion", null, 0, 1, CompleteValueSetReference.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);

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
			getDocumentRoot_IteratableResolvedValueSet(), this.getIteratableResolvedValueSet(), null,
			"iteratableResolvedValueSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_ResolvedValueSet(), this.getResolvedValueSet(), null, "resolvedValueSet", null, 0, -2,
			null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
			IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_ResolvedValueSetDirectory(), this.getResolvedValueSetDirectory(), null,
			"resolvedValueSetDirectory", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_ResolvedValueSetMsg(), this.getResolvedValueSetMsg(), null, "resolvedValueSetMsg", null, 0,
			-2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
			IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_ResolvedValueSetSummary(), this.getResolvedValueSetSummary(), null,
			"resolvedValueSetSummary", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_ValueSetDefinition(), this.getValueSetDefinition(), null, "valueSetDefinition", null, 0,
			-2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
			IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_ValueSetDefinitionDirectory(), this.getValueSetDefinitionDirectory(), null,
			"valueSetDefinitionDirectory", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_ValueSetDefinitionEntry(), this.getValueSetDefinitionEntry(), null,
			"valueSetDefinitionEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_ValueSetDefinitionList(), this.getValueSetDefinitionList(), null, "valueSetDefinitionList",
			null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_ValueSetDefinitionMsg(), this.getValueSetDefinitionMsg(), null, "valueSetDefinitionMsg",
			null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(
			externalValueSetDefinitionEClass, ExternalValueSetDefinition.class, "ExternalValueSetDefinition",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			iteratableResolvedValueSetEClass, IteratableResolvedValueSet.class, "IteratableResolvedValueSet",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getIteratableResolvedValueSet_ResolutionInfo(), this.getResolvedValueSetHeader(), null, "resolutionInfo",
			null, 1, 1, IteratableResolvedValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getIteratableResolvedValueSet_Entry(), theCorePackage.getEntitySynopsis(), null, "entry", null, 0, -1,
			IteratableResolvedValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			propertyQueryReferenceEClass, PropertyQueryReference.class, "PropertyQueryReference", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getPropertyQueryReference_CodeSystem(), theCorePackage.getCodeSystemReference(), null, "codeSystem", null,
			1, 1, PropertyQueryReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getPropertyQueryReference_CodeSystemVersion(), theCorePackage.getCodeSystemVersionReference(), null,
			"codeSystemVersion", null, 0, 1, PropertyQueryReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getPropertyQueryReference_Filter(), theCorePackage.getFilterComponent(), null, "filter", null, 1, 1,
			PropertyQueryReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			resolvedValueSetEClass, ResolvedValueSet.class, "ResolvedValueSet", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getResolvedValueSet_ResolutionInfo(), this.getResolvedValueSetHeader(), null, "resolutionInfo", null, 1, 1,
			ResolvedValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getResolvedValueSet_Member(), theCorePackage.getEntitySynopsis(), null, "member", null, 0, -1,
			ResolvedValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			resolvedValueSetDirectoryEClass, ResolvedValueSetDirectory.class, "ResolvedValueSetDirectory",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getResolvedValueSetDirectory_Entry(), this.getResolvedValueSetDirectoryEntry(), null, "entry", null, 0, -1,
			ResolvedValueSetDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			resolvedValueSetDirectoryEntryEClass, ResolvedValueSetDirectoryEntry.class,
			"ResolvedValueSetDirectoryEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getResolvedValueSetDirectoryEntry_Href(), theCorePackage.getRenderingURI(), "href", null, 0, 1,
			ResolvedValueSetDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getResolvedValueSetDirectoryEntry_MatchStrength(), theCorePackage.getMatchStrength(), "matchStrength",
			null, 0, 1, ResolvedValueSetDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getResolvedValueSetDirectoryEntry_ResourceName(), theCorePackage.getLocalIdentifier(), "resourceName",
			null, 0, 1, ResolvedValueSetDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			resolvedValueSetHeaderEClass, ResolvedValueSetHeader.class, "ResolvedValueSetHeader", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getResolvedValueSetHeader_ResolutionOf(), theCorePackage.getValueSetDefinitionReference(), null,
			"resolutionOf", null, 1, 1, ResolvedValueSetHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getResolvedValueSetHeader_ResolvedUsingCodeSystem(), theCorePackage.getCodeSystemVersionReference(), null,
			"resolvedUsingCodeSystem", null, 0, -1, ResolvedValueSetHeader.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getResolvedValueSetHeader_IncludesResolvedValueSet(), this.getResolvedValueSetHeader(), null,
			"includesResolvedValueSet", null, 0, -1, ResolvedValueSetHeader.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			resolvedValueSetMsgEClass, ResolvedValueSetMsg.class, "ResolvedValueSetMsg", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getResolvedValueSetMsg_ResolvedValueSet(), this.getResolvedValueSet(), null, "resolvedValueSet", null, 1,
			1, ResolvedValueSetMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			resolvedValueSetSummaryEClass, ResolvedValueSetSummary.class, "ResolvedValueSetSummary", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getResolvedValueSetSummary_ResolvedHeader(), this.getResolvedValueSetHeader(), null, "resolvedHeader",
			null, 1, 1, ResolvedValueSetSummary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getResolvedValueSetSummary_ResolvedValueSetURI(), theCorePackage.getLocalURI(), "resolvedValueSetURI",
			null, 1, 1, ResolvedValueSetSummary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
			!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			specificEntityListEClass, SpecificEntityList.class, "SpecificEntityList", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getSpecificEntityList_ReferencedEntity(), theCorePackage.getURIAndEntityName(), null, "referencedEntity",
			null, 1, -1, SpecificEntityList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			valueSetDefinitionEClass, ValueSetDefinition.class, "ValueSetDefinition", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getValueSetDefinition_DefinedValueSet(), theCorePackage.getValueSetReference(), null, "definedValueSet",
			null, 1, 1, ValueSetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getValueSetDefinition_VersionTag(), theCorePackage.getVersionTagReference(), null, "versionTag", null, 0,
			-1, ValueSetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getValueSetDefinition_Entry(), this.getValueSetDefinitionEntry(), null, "entry", null, 1, -1,
			ValueSetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			valueSetDefinitionDirectoryEClass, ValueSetDefinitionDirectory.class, "ValueSetDefinitionDirectory",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getValueSetDefinitionDirectory_Entry(), this.getValueSetDefinitionDirectoryEntry(), null, "entry", null, 0,
			-1, ValueSetDefinitionDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			valueSetDefinitionDirectoryEntryEClass, ValueSetDefinitionDirectoryEntry.class,
			"ValueSetDefinitionDirectoryEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getValueSetDefinitionDirectoryEntry_DefinedValueSet(), theCorePackage.getValueSetReference(), null,
			"definedValueSet", null, 1, 1, ValueSetDefinitionDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getValueSetDefinitionDirectoryEntry_VersionTag(), theCorePackage.getVersionTagReference(), null,
			"versionTag", null, 0, -1, ValueSetDefinitionDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			valueSetDefinitionEntryEClass, ValueSetDefinitionEntry.class, "ValueSetDefinitionEntry", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getValueSetDefinitionEntry_AssociatedEntities(), this.getAssociatedEntitiesReference(), null,
			"associatedEntities", null, 0, 1, ValueSetDefinitionEntry.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getValueSetDefinitionEntry_CompleteCodeSystem(), this.getCompleteCodeSystemReference(), null,
			"completeCodeSystem", null, 0, 1, ValueSetDefinitionEntry.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getValueSetDefinitionEntry_CompleteValueSet(), this.getCompleteValueSetReference(), null,
			"completeValueSet", null, 0, 1, ValueSetDefinitionEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getValueSetDefinitionEntry_ExternalValueSetDefinition(), this.getExternalValueSetDefinition(), null,
			"externalValueSetDefinition", null, 0, 1, ValueSetDefinitionEntry.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getValueSetDefinitionEntry_PropertyQuery(), this.getPropertyQueryReference(), null, "propertyQuery", null,
			0, 1, ValueSetDefinitionEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getValueSetDefinitionEntry_EntityList(), this.getSpecificEntityList(), null, "entityList", null, 0, 1,
			ValueSetDefinitionEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getValueSetDefinitionEntry_EntryOrder(), theXMLTypePackage.getPositiveInteger(), "entryOrder", null, 1, 1,
			ValueSetDefinitionEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getValueSetDefinitionEntry_Operator(), theCorePackage.getSetOperator(), "operator", null, 1, 1,
			ValueSetDefinitionEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			valueSetDefinitionListEClass, ValueSetDefinitionList.class, "ValueSetDefinitionList", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getValueSetDefinitionList_Entry(), this.getValueSetDefinitionListEntry(), null, "entry", null, 0, -1,
			ValueSetDefinitionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			valueSetDefinitionListEntryEClass, ValueSetDefinitionListEntry.class, "ValueSetDefinitionListEntry",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getValueSetDefinitionListEntry_Entry(), this.getValueSetDefinition(), null, "entry", null, 0, -1,
			ValueSetDefinitionListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			valueSetDefinitionMsgEClass, ValueSetDefinitionMsg.class, "ValueSetDefinitionMsg", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getValueSetDefinitionMsg_ValueSetDefinition(), this.getValueSetDefinition(), null, "valueSetDefinition",
			null, 1, 1, ValueSetDefinitionMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(leafOrAllEEnum, LeafOrAll.class, "LeafOrAll");
		addEEnumLiteral(leafOrAllEEnum, LeafOrAll.LEAFONLY);
		addEEnumLiteral(leafOrAllEEnum, LeafOrAll.ALLINTERMEDIATENODES);

		initEEnum(setOperatorEEnum, SetOperator.class, "SetOperator");
		addEEnumLiteral(setOperatorEEnum, SetOperator.UNION);
		addEEnumLiteral(setOperatorEEnum, SetOperator.INTERSECT);
		addEEnumLiteral(setOperatorEEnum, SetOperator.SUBTRACT);

		initEEnum(transitiveClosureEEnum, TransitiveClosure.class, "TransitiveClosure");
		addEEnumLiteral(transitiveClosureEEnum, TransitiveClosure.DIRECTLYASSOCIATED);
		addEEnumLiteral(transitiveClosureEEnum, TransitiveClosure.TRANSITIVECLOSURE);

		// Initialize data types
		initEDataType(
			leafOrAllObjectEDataType, LeafOrAll.class, "LeafOrAllObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			setOperatorObjectEDataType, SetOperator.class, "SetOperatorObject", IS_SERIALIZABLE,
			IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			transitiveClosureObjectEDataType, TransitiveClosure.class, "TransitiveClosureObject", IS_SERIALIZABLE,
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
		addAnnotation(associatedEntitiesReferenceEClass, source, new String[] {
				"name", "AssociatedEntitiesReference", "kind", "elementOnly" });
		addAnnotation(getAssociatedEntitiesReference_ReferencedEntity(), source, new String[] {
				"kind", "element", "name", "referencedEntity", "namespace", "##targetNamespace" });
		addAnnotation(getAssociatedEntitiesReference_CodeSystem(), source, new String[] {
				"kind", "element", "name", "codeSystem", "namespace", "##targetNamespace" });
		addAnnotation(getAssociatedEntitiesReference_CodeSystemVersion(), source, new String[] {
				"kind", "element", "name", "codeSystemVersion", "namespace", "##targetNamespace" });
		addAnnotation(getAssociatedEntitiesReference_Predicate(), source, new String[] {
				"kind", "element", "name", "predicate", "namespace", "##targetNamespace" });
		addAnnotation(getAssociatedEntitiesReference_Direction(), source, new String[] {
				"kind", "attribute", "name", "direction" });
		addAnnotation(getAssociatedEntitiesReference_LeafOnly(), source, new String[] {
				"kind", "attribute", "name", "leafOnly" });
		addAnnotation(getAssociatedEntitiesReference_Transitivity(), source, new String[] {
				"kind", "attribute", "name", "transitivity" });
		addAnnotation(completeCodeSystemReferenceEClass, source, new String[] {
				"name", "CompleteCodeSystemReference", "kind", "elementOnly" });
		addAnnotation(getCompleteCodeSystemReference_CodeSystem(), source, new String[] {
				"kind", "element", "name", "codeSystem", "namespace", "##targetNamespace" });
		addAnnotation(getCompleteCodeSystemReference_CodeSystemVersion(), source, new String[] {
				"kind", "element", "name", "codeSystemVersion", "namespace", "##targetNamespace" });
		addAnnotation(completeValueSetReferenceEClass, source, new String[] {
				"name", "CompleteValueSetReference", "kind", "elementOnly" });
		addAnnotation(getCompleteValueSetReference_ValueSet(), source, new String[] {
				"kind", "element", "name", "valueSet", "namespace", "##targetNamespace" });
		addAnnotation(getCompleteValueSetReference_ValueSetDefinition(), source, new String[] {
				"kind", "element", "name", "valueSetDefinition", "namespace", "##targetNamespace" });
		addAnnotation(getCompleteValueSetReference_ReferenceCodeSystemVersion(), source, new String[] {
				"kind", "element", "name", "referenceCodeSystemVersion", "namespace", "##targetNamespace" });
		addAnnotation(documentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
		addAnnotation(getDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" });
		addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source, new String[] {
				"kind", "attribute", "name", "xmlns:prefix" });
		addAnnotation(getDocumentRoot_XSISchemaLocation(), source, new String[] {
				"kind", "attribute", "name", "xsi:schemaLocation" });
		addAnnotation(getDocumentRoot_IteratableResolvedValueSet(), source, new String[] {
				"kind", "element", "name", "IteratableResolvedValueSet", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_ResolvedValueSet(), source, new String[] {
				"kind", "element", "name", "ResolvedValueSet", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_ResolvedValueSetDirectory(), source, new String[] {
				"kind", "element", "name", "ResolvedValueSetDirectory", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_ResolvedValueSetMsg(), source, new String[] {
				"kind", "element", "name", "ResolvedValueSetMsg", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_ResolvedValueSetSummary(), source, new String[] {
				"kind", "element", "name", "ResolvedValueSetSummary", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_ValueSetDefinition(), source, new String[] {
				"kind", "element", "name", "ValueSetDefinition", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_ValueSetDefinitionDirectory(), source, new String[] {
				"kind", "element", "name", "ValueSetDefinitionDirectory", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_ValueSetDefinitionEntry(), source, new String[] {
				"kind", "element", "name", "ValueSetDefinitionEntry", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_ValueSetDefinitionList(), source, new String[] {
				"kind", "element", "name", "ValueSetDefinitionList", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_ValueSetDefinitionMsg(), source, new String[] {
				"kind", "element", "name", "ValueSetDefinitionMsg", "namespace", "##targetNamespace" });
		addAnnotation(externalValueSetDefinitionEClass, source, new String[] {
				"name", "ExternalValueSetDefinition", "kind", "elementOnly" });
		addAnnotation(iteratableResolvedValueSetEClass, source, new String[] {
				"name", "IteratableResolvedValueSet", "kind", "elementOnly" });
		addAnnotation(getIteratableResolvedValueSet_ResolutionInfo(), source, new String[] {
				"kind", "element", "name", "resolutionInfo", "namespace", "##targetNamespace" });
		addAnnotation(getIteratableResolvedValueSet_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(leafOrAllEEnum, source, new String[] { "name", "LeafOrAll" });
		addAnnotation(leafOrAllObjectEDataType, source, new String[] {
				"name", "LeafOrAll:Object", "baseType", "LeafOrAll" });
		addAnnotation(propertyQueryReferenceEClass, source, new String[] {
				"name", "PropertyQueryReference", "kind", "elementOnly" });
		addAnnotation(getPropertyQueryReference_CodeSystem(), source, new String[] {
				"kind", "element", "name", "codeSystem", "namespace", "##targetNamespace" });
		addAnnotation(getPropertyQueryReference_CodeSystemVersion(), source, new String[] {
				"kind", "element", "name", "codeSystemVersion", "namespace", "##targetNamespace" });
		addAnnotation(getPropertyQueryReference_Filter(), source, new String[] {
				"kind", "element", "name", "filter", "namespace", "##targetNamespace" });
		addAnnotation(
			resolvedValueSetEClass, source, new String[] { "name", "ResolvedValueSet", "kind", "elementOnly" });
		addAnnotation(getResolvedValueSet_ResolutionInfo(), source, new String[] {
				"kind", "element", "name", "resolutionInfo", "namespace", "##targetNamespace" });
		addAnnotation(getResolvedValueSet_Member(), source, new String[] {
				"kind", "element", "name", "member", "namespace", "##targetNamespace" });
		addAnnotation(resolvedValueSetDirectoryEClass, source, new String[] {
				"name", "ResolvedValueSetDirectory", "kind", "elementOnly" });
		addAnnotation(getResolvedValueSetDirectory_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(resolvedValueSetDirectoryEntryEClass, source, new String[] {
				"name", "ResolvedValueSetDirectoryEntry", "kind", "elementOnly" });
		addAnnotation(getResolvedValueSetDirectoryEntry_Href(), source, new String[] {
				"kind", "attribute", "name", "href" });
		addAnnotation(getResolvedValueSetDirectoryEntry_MatchStrength(), source, new String[] {
				"kind", "attribute", "name", "matchStrength" });
		addAnnotation(getResolvedValueSetDirectoryEntry_ResourceName(), source, new String[] {
				"kind", "attribute", "name", "resourceName" });
		addAnnotation(resolvedValueSetHeaderEClass, source, new String[] {
				"name", "ResolvedValueSetHeader", "kind", "elementOnly" });
		addAnnotation(getResolvedValueSetHeader_ResolutionOf(), source, new String[] {
				"kind", "element", "name", "resolutionOf", "namespace", "##targetNamespace" });
		addAnnotation(getResolvedValueSetHeader_ResolvedUsingCodeSystem(), source, new String[] {
				"kind", "element", "name", "resolvedUsingCodeSystem", "namespace", "##targetNamespace" });
		addAnnotation(getResolvedValueSetHeader_IncludesResolvedValueSet(), source, new String[] {
				"kind", "element", "name", "includesResolvedValueSet", "namespace", "##targetNamespace" });
		addAnnotation(resolvedValueSetMsgEClass, source, new String[] {
				"name", "ResolvedValueSetMsg", "kind", "elementOnly" });
		addAnnotation(getResolvedValueSetMsg_ResolvedValueSet(), source, new String[] {
				"kind", "element", "name", "resolvedValueSet", "namespace", "##targetNamespace" });
		addAnnotation(resolvedValueSetSummaryEClass, source, new String[] {
				"name", "ResolvedValueSetSummary", "kind", "elementOnly" });
		addAnnotation(getResolvedValueSetSummary_ResolvedHeader(), source, new String[] {
				"kind", "element", "name", "resolvedHeader", "namespace", "##targetNamespace" });
		addAnnotation(getResolvedValueSetSummary_ResolvedValueSetURI(), source, new String[] {
				"kind", "attribute", "name", "resolvedValueSetURI" });
		addAnnotation(setOperatorEEnum, source, new String[] { "name", "SetOperator" });
		addAnnotation(setOperatorObjectEDataType, source, new String[] {
				"name", "SetOperator:Object", "baseType", "SetOperator" });
		addAnnotation(specificEntityListEClass, source, new String[] {
				"name", "SpecificEntityList", "kind", "elementOnly" });
		addAnnotation(getSpecificEntityList_ReferencedEntity(), source, new String[] {
				"kind", "element", "name", "referencedEntity", "namespace", "##targetNamespace" });
		addAnnotation(transitiveClosureEEnum, source, new String[] { "name", "TransitiveClosure" });
		addAnnotation(transitiveClosureObjectEDataType, source, new String[] {
				"name", "TransitiveClosure:Object", "baseType", "TransitiveClosure" });
		addAnnotation(valueSetDefinitionEClass, source, new String[] {
				"name", "ValueSetDefinition", "kind", "elementOnly" });
		addAnnotation(getValueSetDefinition_DefinedValueSet(), source, new String[] {
				"kind", "element", "name", "definedValueSet", "namespace", "##targetNamespace" });
		addAnnotation(getValueSetDefinition_VersionTag(), source, new String[] {
				"kind", "element", "name", "versionTag", "namespace", "##targetNamespace" });
		addAnnotation(getValueSetDefinition_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(valueSetDefinitionDirectoryEClass, source, new String[] {
				"name", "ValueSetDefinitionDirectory", "kind", "elementOnly" });
		addAnnotation(getValueSetDefinitionDirectory_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(valueSetDefinitionDirectoryEntryEClass, source, new String[] {
				"name", "ValueSetDefinitionDirectoryEntry", "kind", "elementOnly" });
		addAnnotation(getValueSetDefinitionDirectoryEntry_DefinedValueSet(), source, new String[] {
				"kind", "element", "name", "definedValueSet", "namespace", "##targetNamespace" });
		addAnnotation(getValueSetDefinitionDirectoryEntry_VersionTag(), source, new String[] {
				"kind", "element", "name", "versionTag", "namespace", "##targetNamespace" });
		addAnnotation(valueSetDefinitionEntryEClass, source, new String[] {
				"name", "ValueSetDefinitionEntry", "kind", "elementOnly" });
		addAnnotation(getValueSetDefinitionEntry_AssociatedEntities(), source, new String[] {
				"kind", "element", "name", "associatedEntities", "namespace", "##targetNamespace" });
		addAnnotation(getValueSetDefinitionEntry_CompleteCodeSystem(), source, new String[] {
				"kind", "element", "name", "completeCodeSystem", "namespace", "##targetNamespace" });
		addAnnotation(getValueSetDefinitionEntry_CompleteValueSet(), source, new String[] {
				"kind", "element", "name", "completeValueSet", "namespace", "##targetNamespace" });
		addAnnotation(getValueSetDefinitionEntry_ExternalValueSetDefinition(), source, new String[] {
				"kind", "element", "name", "externalValueSetDefinition", "namespace", "##targetNamespace" });
		addAnnotation(getValueSetDefinitionEntry_PropertyQuery(), source, new String[] {
				"kind", "element", "name", "propertyQuery", "namespace", "##targetNamespace" });
		addAnnotation(getValueSetDefinitionEntry_EntityList(), source, new String[] {
				"kind", "element", "name", "entityList", "namespace", "##targetNamespace" });
		addAnnotation(getValueSetDefinitionEntry_EntryOrder(), source, new String[] {
				"kind", "attribute", "name", "entryOrder" });
		addAnnotation(getValueSetDefinitionEntry_Operator(), source, new String[] {
				"kind", "attribute", "name", "operator" });
		addAnnotation(valueSetDefinitionListEClass, source, new String[] {
				"name", "ValueSetDefinitionList", "kind", "elementOnly" });
		addAnnotation(getValueSetDefinitionList_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(valueSetDefinitionListEntryEClass, source, new String[] {
				"name", "ValueSetDefinitionListEntry", "kind", "elementOnly" });
		addAnnotation(getValueSetDefinitionListEntry_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(valueSetDefinitionMsgEClass, source, new String[] {
				"name", "ValueSetDefinitionMsg", "kind", "elementOnly" });
		addAnnotation(getValueSetDefinitionMsg_ValueSetDefinition(), source, new String[] {
				"kind", "element", "name", "valueSetDefinition", "namespace", "##targetNamespace" });
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
		addAnnotation(resolvedValueSetMsgEClass, source, new String[] { "appinfo", "PSM" });
		addAnnotation(valueSetDefinitionMsgEClass, source, new String[] { "appinfo", "PSM" });
	}

} // ValueSetDefinitionPackageImpl
