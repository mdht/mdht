/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
import org.openhealthtools.mdht.cts2.entity.AnnotationPropertyDescription;
import org.openhealthtools.mdht.cts2.entity.AnonymousEntityDescription;
import org.openhealthtools.mdht.cts2.entity.AnonymousIndividualDescription;
import org.openhealthtools.mdht.cts2.entity.ClassDescription;
import org.openhealthtools.mdht.cts2.entity.ClassDescriptionState;
import org.openhealthtools.mdht.cts2.entity.ClassDescriptionType;
import org.openhealthtools.mdht.cts2.entity.DataPropertyDescription;
import org.openhealthtools.mdht.cts2.entity.DataTypeDescription;
import org.openhealthtools.mdht.cts2.entity.Designation;
import org.openhealthtools.mdht.cts2.entity.DesignationRole;
import org.openhealthtools.mdht.cts2.entity.DocumentRoot;
import org.openhealthtools.mdht.cts2.entity.EntityDescription;
import org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase;
import org.openhealthtools.mdht.cts2.entity.EntityDescriptionMsg;
import org.openhealthtools.mdht.cts2.entity.EntityDirectory;
import org.openhealthtools.mdht.cts2.entity.EntityDirectoryEntry;
import org.openhealthtools.mdht.cts2.entity.EntityFactory;
import org.openhealthtools.mdht.cts2.entity.EntityList;
import org.openhealthtools.mdht.cts2.entity.EntityListEntry;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;
import org.openhealthtools.mdht.cts2.entity.EntityReferenceMsg;
import org.openhealthtools.mdht.cts2.entity.NamedEntityDescription;
import org.openhealthtools.mdht.cts2.entity.NamedIndividualDescription;
import org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription;
import org.openhealthtools.mdht.cts2.entity.ObjectPropertyDirectionality;
import org.openhealthtools.mdht.cts2.entity.PredicateDescription;
import org.openhealthtools.mdht.cts2.entity.Transitivity;
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
public class EntityPackageImpl extends EPackageImpl implements EntityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass annotationPropertyDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass anonymousEntityDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass anonymousIndividualDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass classDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dataPropertyDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dataTypeDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass designationEClass = null;

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
	private EClass entityDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entityDescriptionBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entityDescriptionMsgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entityDirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entityDirectoryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entityListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entityListEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entityReferenceMsgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass namedEntityDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass namedIndividualDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass objectPropertyDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass predicateDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum classDescriptionStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum classDescriptionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum designationRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum objectPropertyDirectionalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum transitivityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType classDescriptionStateObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType classDescriptionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType designationRoleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType objectPropertyDirectionalityObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType transitivityObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EntityPackageImpl() {
		super(eNS_URI, EntityFactory.eINSTANCE);
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
	 * This method is used to initialize {@link EntityPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EntityPackage init() {
		if (isInited) {
			return (EntityPackage) EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		}

		// Obtain or create and register package
		EntityPackageImpl theEntityPackage = (EntityPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EntityPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new EntityPackageImpl());

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
		theEntityPackage.createPackageContents();
		theAssociationPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theCodeSystemPackage.createPackageContents();
		theCodeSystemVersionPackage.createPackageContents();
		theStatementPackage.createPackageContents();
		theValueSetPackage.createPackageContents();
		theValueSetDefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theEntityPackage.initializePackageContents();
		theAssociationPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theCodeSystemPackage.initializePackageContents();
		theCodeSystemVersionPackage.initializePackageContents();
		theStatementPackage.initializePackageContents();
		theValueSetPackage.initializePackageContents();
		theValueSetDefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEntityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EntityPackage.eNS_URI, theEntityPackage);
		return theEntityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAnnotationPropertyDescription() {
		return annotationPropertyDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAnonymousEntityDescription() {
		return anonymousEntityDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAnonymousIndividualDescription() {
		return anonymousIndividualDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getClassDescription() {
		return classDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getClassDescription_DescriptionState() {
		return (EAttribute) classDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getClassDescription_DescriptionType() {
		return (EAttribute) classDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDataPropertyDescription() {
		return dataPropertyDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDataTypeDescription() {
		return dataTypeDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDesignation() {
		return designationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDesignation_UsageContext() {
		return (EReference) designationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDesignation_DesignationType() {
		return (EReference) designationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDesignation_CaseSignificance() {
		return (EReference) designationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDesignation_DegreeOfFidelity() {
		return (EReference) designationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDesignation_AssertedInCodeSystemVersion() {
		return (EAttribute) designationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDesignation_CorrespondingStatement() {
		return (EAttribute) designationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDesignation_DesignationRole() {
		return (EAttribute) designationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDesignation_ExternalIdentifier() {
		return (EAttribute) designationEClass.getEStructuralFeatures().get(7);
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
	public EReference getDocumentRoot_EntityDescription() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_EntityDescriptionMsg() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_EntityDirectory() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_EntityList() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_EntityReferenceMsg() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityDescription() {
		return entityDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescription_NamedEntity() {
		return (EReference) entityDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescription_AnonymousEntity() {
		return (EReference) entityDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescription_ClassDescription() {
		return (EReference) entityDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescription_DataTypeDescription() {
		return (EReference) entityDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescription_PredicateDescription() {
		return (EReference) entityDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescription_ObjectPropertyDescription() {
		return (EReference) entityDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescription_DataPropertyDescription() {
		return (EReference) entityDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescription_AnnotationPropertyDescription() {
		return (EReference) entityDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescription_NamedIndividual() {
		return (EReference) entityDescriptionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescription_AnonymousIndividual() {
		return (EReference) entityDescriptionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityDescriptionBase() {
		return entityDescriptionBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescriptionBase_EntityID() {
		return (EReference) entityDescriptionBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescriptionBase_AlternateEntityID() {
		return (EReference) entityDescriptionBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescriptionBase_DescribingCodeSystemVersion() {
		return (EReference) entityDescriptionBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescriptionBase_Designation() {
		return (EReference) entityDescriptionBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescriptionBase_Definition() {
		return (EReference) entityDescriptionBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescriptionBase_Example() {
		return (EReference) entityDescriptionBaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescriptionBase_Note() {
		return (EReference) entityDescriptionBaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescriptionBase_Property() {
		return (EReference) entityDescriptionBaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityDescriptionBase_SourceStatements() {
		return (EAttribute) entityDescriptionBaseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityDescriptionBase_SubjectOf() {
		return (EAttribute) entityDescriptionBaseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityDescriptionBase_PredicateOf() {
		return (EAttribute) entityDescriptionBaseEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityDescriptionBase_TargetOf() {
		return (EAttribute) entityDescriptionBaseEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescriptionBase_Parent() {
		return (EReference) entityDescriptionBaseEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityDescriptionBase_Ancestors() {
		return (EAttribute) entityDescriptionBaseEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityDescriptionBase_Children() {
		return (EAttribute) entityDescriptionBaseEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityDescriptionBase_Descendants() {
		return (EAttribute) entityDescriptionBaseEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescriptionBase_EntityType() {
		return (EReference) entityDescriptionBaseEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityDescriptionBase_Instances() {
		return (EAttribute) entityDescriptionBaseEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescriptionBase_EquivalentEntity() {
		return (EReference) entityDescriptionBaseEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityDescriptionBase_About() {
		return (EAttribute) entityDescriptionBaseEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityDescriptionMsg() {
		return entityDescriptionMsgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescriptionMsg_EntityDescription() {
		return (EReference) entityDescriptionMsgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityDirectory() {
		return entityDirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDirectory_Entry() {
		return (EReference) entityDirectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityDirectoryEntry() {
		return entityDirectoryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityDirectoryEntry_Href() {
		return (EAttribute) entityDirectoryEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityDirectoryEntry_MatchStrength() {
		return (EAttribute) entityDirectoryEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityDirectoryEntry_ResourceName() {
		return (EAttribute) entityDirectoryEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityList() {
		return entityListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityList_Entry() {
		return (EReference) entityListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityListEntry() {
		return entityListEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityListEntry_Entry() {
		return (EReference) entityListEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityReferenceMsg() {
		return entityReferenceMsgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityReferenceMsg_EntityReference() {
		return (EReference) entityReferenceMsgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNamedEntityDescription() {
		return namedEntityDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getNamedEntityDescription_Status() {
		return (EReference) namedEntityDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getNamedEntityDescription_ChangeDescription() {
		return (EReference) namedEntityDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getNamedEntityDescription_EntryState() {
		return (EAttribute) namedEntityDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNamedIndividualDescription() {
		return namedIndividualDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getObjectPropertyDescription() {
		return objectPropertyDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getObjectPropertyDescription_Directed() {
		return (EAttribute) objectPropertyDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getObjectPropertyDescription_Transitivity() {
		return (EAttribute) objectPropertyDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPredicateDescription() {
		return predicateDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPredicateDescription_ForwardName() {
		return (EAttribute) predicateDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPredicateDescription_ReverseName() {
		return (EAttribute) predicateDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getClassDescriptionState() {
		return classDescriptionStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getClassDescriptionType() {
		return classDescriptionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getDesignationRole() {
		return designationRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getObjectPropertyDirectionality() {
		return objectPropertyDirectionalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getTransitivity() {
		return transitivityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getClassDescriptionStateObject() {
		return classDescriptionStateObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getClassDescriptionTypeObject() {
		return classDescriptionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getDesignationRoleObject() {
		return designationRoleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getObjectPropertyDirectionalityObject() {
		return objectPropertyDirectionalityObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getTransitivityObject() {
		return transitivityObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityFactory getEntityFactory() {
		return (EntityFactory) getEFactoryInstance();
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
		annotationPropertyDescriptionEClass = createEClass(ANNOTATION_PROPERTY_DESCRIPTION);

		anonymousEntityDescriptionEClass = createEClass(ANONYMOUS_ENTITY_DESCRIPTION);

		anonymousIndividualDescriptionEClass = createEClass(ANONYMOUS_INDIVIDUAL_DESCRIPTION);

		classDescriptionEClass = createEClass(CLASS_DESCRIPTION);
		createEAttribute(classDescriptionEClass, CLASS_DESCRIPTION__DESCRIPTION_STATE);
		createEAttribute(classDescriptionEClass, CLASS_DESCRIPTION__DESCRIPTION_TYPE);

		dataPropertyDescriptionEClass = createEClass(DATA_PROPERTY_DESCRIPTION);

		dataTypeDescriptionEClass = createEClass(DATA_TYPE_DESCRIPTION);

		designationEClass = createEClass(DESIGNATION);
		createEReference(designationEClass, DESIGNATION__USAGE_CONTEXT);
		createEReference(designationEClass, DESIGNATION__DESIGNATION_TYPE);
		createEReference(designationEClass, DESIGNATION__CASE_SIGNIFICANCE);
		createEReference(designationEClass, DESIGNATION__DEGREE_OF_FIDELITY);
		createEAttribute(designationEClass, DESIGNATION__ASSERTED_IN_CODE_SYSTEM_VERSION);
		createEAttribute(designationEClass, DESIGNATION__CORRESPONDING_STATEMENT);
		createEAttribute(designationEClass, DESIGNATION__DESIGNATION_ROLE);
		createEAttribute(designationEClass, DESIGNATION__EXTERNAL_IDENTIFIER);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENTITY_DESCRIPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENTITY_DESCRIPTION_MSG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENTITY_DIRECTORY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENTITY_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENTITY_REFERENCE_MSG);

		entityDescriptionEClass = createEClass(ENTITY_DESCRIPTION);
		createEReference(entityDescriptionEClass, ENTITY_DESCRIPTION__NAMED_ENTITY);
		createEReference(entityDescriptionEClass, ENTITY_DESCRIPTION__ANONYMOUS_ENTITY);
		createEReference(entityDescriptionEClass, ENTITY_DESCRIPTION__CLASS_DESCRIPTION);
		createEReference(entityDescriptionEClass, ENTITY_DESCRIPTION__DATA_TYPE_DESCRIPTION);
		createEReference(entityDescriptionEClass, ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION);
		createEReference(entityDescriptionEClass, ENTITY_DESCRIPTION__OBJECT_PROPERTY_DESCRIPTION);
		createEReference(entityDescriptionEClass, ENTITY_DESCRIPTION__DATA_PROPERTY_DESCRIPTION);
		createEReference(entityDescriptionEClass, ENTITY_DESCRIPTION__ANNOTATION_PROPERTY_DESCRIPTION);
		createEReference(entityDescriptionEClass, ENTITY_DESCRIPTION__NAMED_INDIVIDUAL);
		createEReference(entityDescriptionEClass, ENTITY_DESCRIPTION__ANONYMOUS_INDIVIDUAL);

		entityDescriptionBaseEClass = createEClass(ENTITY_DESCRIPTION_BASE);
		createEReference(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__ENTITY_ID);
		createEReference(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__ALTERNATE_ENTITY_ID);
		createEReference(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__DESCRIBING_CODE_SYSTEM_VERSION);
		createEReference(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__DESIGNATION);
		createEReference(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__DEFINITION);
		createEReference(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__EXAMPLE);
		createEReference(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__NOTE);
		createEReference(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__PROPERTY);
		createEAttribute(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__SOURCE_STATEMENTS);
		createEAttribute(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__SUBJECT_OF);
		createEAttribute(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__PREDICATE_OF);
		createEAttribute(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__TARGET_OF);
		createEReference(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__PARENT);
		createEAttribute(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__ANCESTORS);
		createEAttribute(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__CHILDREN);
		createEAttribute(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__DESCENDANTS);
		createEReference(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__ENTITY_TYPE);
		createEAttribute(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__INSTANCES);
		createEReference(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__EQUIVALENT_ENTITY);
		createEAttribute(entityDescriptionBaseEClass, ENTITY_DESCRIPTION_BASE__ABOUT);

		entityDescriptionMsgEClass = createEClass(ENTITY_DESCRIPTION_MSG);
		createEReference(entityDescriptionMsgEClass, ENTITY_DESCRIPTION_MSG__ENTITY_DESCRIPTION);

		entityDirectoryEClass = createEClass(ENTITY_DIRECTORY);
		createEReference(entityDirectoryEClass, ENTITY_DIRECTORY__ENTRY);

		entityDirectoryEntryEClass = createEClass(ENTITY_DIRECTORY_ENTRY);
		createEAttribute(entityDirectoryEntryEClass, ENTITY_DIRECTORY_ENTRY__HREF);
		createEAttribute(entityDirectoryEntryEClass, ENTITY_DIRECTORY_ENTRY__MATCH_STRENGTH);
		createEAttribute(entityDirectoryEntryEClass, ENTITY_DIRECTORY_ENTRY__RESOURCE_NAME);

		entityListEClass = createEClass(ENTITY_LIST);
		createEReference(entityListEClass, ENTITY_LIST__ENTRY);

		entityListEntryEClass = createEClass(ENTITY_LIST_ENTRY);
		createEReference(entityListEntryEClass, ENTITY_LIST_ENTRY__ENTRY);

		entityReferenceMsgEClass = createEClass(ENTITY_REFERENCE_MSG);
		createEReference(entityReferenceMsgEClass, ENTITY_REFERENCE_MSG__ENTITY_REFERENCE);

		namedEntityDescriptionEClass = createEClass(NAMED_ENTITY_DESCRIPTION);
		createEReference(namedEntityDescriptionEClass, NAMED_ENTITY_DESCRIPTION__STATUS);
		createEReference(namedEntityDescriptionEClass, NAMED_ENTITY_DESCRIPTION__CHANGE_DESCRIPTION);
		createEAttribute(namedEntityDescriptionEClass, NAMED_ENTITY_DESCRIPTION__ENTRY_STATE);

		namedIndividualDescriptionEClass = createEClass(NAMED_INDIVIDUAL_DESCRIPTION);

		objectPropertyDescriptionEClass = createEClass(OBJECT_PROPERTY_DESCRIPTION);
		createEAttribute(objectPropertyDescriptionEClass, OBJECT_PROPERTY_DESCRIPTION__DIRECTED);
		createEAttribute(objectPropertyDescriptionEClass, OBJECT_PROPERTY_DESCRIPTION__TRANSITIVITY);

		predicateDescriptionEClass = createEClass(PREDICATE_DESCRIPTION);
		createEAttribute(predicateDescriptionEClass, PREDICATE_DESCRIPTION__FORWARD_NAME);
		createEAttribute(predicateDescriptionEClass, PREDICATE_DESCRIPTION__REVERSE_NAME);

		// Create enums
		classDescriptionStateEEnum = createEEnum(CLASS_DESCRIPTION_STATE);
		classDescriptionTypeEEnum = createEEnum(CLASS_DESCRIPTION_TYPE);
		designationRoleEEnum = createEEnum(DESIGNATION_ROLE);
		objectPropertyDirectionalityEEnum = createEEnum(OBJECT_PROPERTY_DIRECTIONALITY);
		transitivityEEnum = createEEnum(TRANSITIVITY);

		// Create data types
		classDescriptionStateObjectEDataType = createEDataType(CLASS_DESCRIPTION_STATE_OBJECT);
		classDescriptionTypeObjectEDataType = createEDataType(CLASS_DESCRIPTION_TYPE_OBJECT);
		designationRoleObjectEDataType = createEDataType(DESIGNATION_ROLE_OBJECT);
		objectPropertyDirectionalityObjectEDataType = createEDataType(OBJECT_PROPERTY_DIRECTIONALITY_OBJECT);
		transitivityObjectEDataType = createEDataType(TRANSITIVITY_OBJECT);
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
		annotationPropertyDescriptionEClass.getESuperTypes().add(this.getPredicateDescription());
		anonymousEntityDescriptionEClass.getESuperTypes().add(this.getEntityDescriptionBase());
		anonymousIndividualDescriptionEClass.getESuperTypes().add(this.getNamedEntityDescription());
		classDescriptionEClass.getESuperTypes().add(this.getNamedEntityDescription());
		dataPropertyDescriptionEClass.getESuperTypes().add(this.getPredicateDescription());
		dataTypeDescriptionEClass.getESuperTypes().add(this.getAnonymousEntityDescription());
		designationEClass.getESuperTypes().add(theCorePackage.getEntryDescription());
		entityDescriptionMsgEClass.getESuperTypes().add(theCorePackage.getMessage());
		entityDirectoryEClass.getESuperTypes().add(theCorePackage.getDirectory());
		entityDirectoryEntryEClass.getESuperTypes().add(theCorePackage.getEntityReference());
		entityListEClass.getESuperTypes().add(theCorePackage.getDirectory());
		entityListEntryEClass.getESuperTypes().add(theCorePackage.getDirectoryEntry());
		entityReferenceMsgEClass.getESuperTypes().add(theCorePackage.getMessage());
		namedEntityDescriptionEClass.getESuperTypes().add(this.getEntityDescriptionBase());
		namedIndividualDescriptionEClass.getESuperTypes().add(this.getNamedEntityDescription());
		objectPropertyDescriptionEClass.getESuperTypes().add(this.getPredicateDescription());
		predicateDescriptionEClass.getESuperTypes().add(this.getNamedEntityDescription());

		// Initialize classes and features; add operations and parameters
		initEClass(
			annotationPropertyDescriptionEClass, AnnotationPropertyDescription.class, "AnnotationPropertyDescription",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			anonymousEntityDescriptionEClass, AnonymousEntityDescription.class, "AnonymousEntityDescription",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			anonymousIndividualDescriptionEClass, AnonymousIndividualDescription.class,
			"AnonymousIndividualDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			classDescriptionEClass, ClassDescription.class, "ClassDescription", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getClassDescription_DescriptionState(), this.getClassDescriptionState(), "descriptionState", null, 0, 1,
			ClassDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getClassDescription_DescriptionType(), this.getClassDescriptionType(), "descriptionType", null, 0, 1,
			ClassDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			dataPropertyDescriptionEClass, DataPropertyDescription.class, "DataPropertyDescription", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			dataTypeDescriptionEClass, DataTypeDescription.class, "DataTypeDescription", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			designationEClass, Designation.class, "Designation", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getDesignation_UsageContext(), theCorePackage.getContextReference(), null, "usageContext", null, 0, -1,
			Designation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getDesignation_DesignationType(), theCorePackage.getDesignationTypeReference(), null, "designationType",
			null, 0, 1, Designation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getDesignation_CaseSignificance(), theCorePackage.getCaseSignificanceReference(), null, "caseSignificance",
			null, 0, 1, Designation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getDesignation_DegreeOfFidelity(), theCorePackage.getDesignationFidelityReference(), null,
			"degreeOfFidelity", null, 0, 1, Designation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getDesignation_AssertedInCodeSystemVersion(), theCorePackage.getCodeSystemVersionName(),
			"assertedInCodeSystemVersion", null, 0, 1, Designation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getDesignation_CorrespondingStatement(), theCorePackage.getRenderingURI(), "correspondingStatement", null,
			0, 1, Designation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getDesignation_DesignationRole(), this.getDesignationRole(), "designationRole", "ALTERNATIVE", 0, 1,
			Designation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getDesignation_ExternalIdentifier(), theCorePackage.getString(), "externalIdentifier", null, 0, 1,
			Designation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

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
			getDocumentRoot_EntityDescription(), this.getEntityDescription(), null, "entityDescription", null, 0, -2,
			null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
			IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_EntityDescriptionMsg(), this.getEntityDescriptionMsg(), null, "entityDescriptionMsg", null,
			0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
			IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_EntityDirectory(), this.getEntityDirectory(), null, "entityDirectory", null, 0, -2, null,
			IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_EntityList(), this.getEntityList(), null, "entityList", null, 0, -2, null, IS_TRANSIENT,
			IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
			IS_ORDERED);
		initEReference(
			getDocumentRoot_EntityReferenceMsg(), this.getEntityReferenceMsg(), null, "entityReferenceMsg", null, 0,
			-2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
			IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(
			entityDescriptionEClass, EntityDescription.class, "EntityDescription", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getEntityDescription_NamedEntity(), this.getNamedEntityDescription(), null, "namedEntity", null, 0, 1,
			EntityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescription_AnonymousEntity(), this.getAnonymousEntityDescription(), null, "anonymousEntity",
			null, 0, 1, EntityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescription_ClassDescription(), this.getClassDescription(), null, "classDescription", null, 0, 1,
			EntityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescription_DataTypeDescription(), this.getDataTypeDescription(), null, "dataTypeDescription",
			null, 0, 1, EntityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescription_PredicateDescription(), this.getPredicateDescription(), null, "predicateDescription",
			null, 0, 1, EntityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescription_ObjectPropertyDescription(), this.getObjectPropertyDescription(), null,
			"objectPropertyDescription", null, 0, 1, EntityDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescription_DataPropertyDescription(), this.getDataPropertyDescription(), null,
			"dataPropertyDescription", null, 0, 1, EntityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescription_AnnotationPropertyDescription(), this.getAnnotationPropertyDescription(), null,
			"annotationPropertyDescription", null, 0, 1, EntityDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescription_NamedIndividual(), this.getNamedIndividualDescription(), null, "namedIndividual",
			null, 0, 1, EntityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescription_AnonymousIndividual(), this.getAnonymousIndividualDescription(), null,
			"anonymousIndividual", null, 0, 1, EntityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			entityDescriptionBaseEClass, EntityDescriptionBase.class, "EntityDescriptionBase", IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getEntityDescriptionBase_EntityID(), theCorePackage.getScopedEntityName(), null, "entityID", null, 1, 1,
			EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescriptionBase_AlternateEntityID(), theCorePackage.getScopedEntityName(), null,
			"alternateEntityID", null, 0, -1, EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescriptionBase_DescribingCodeSystemVersion(), theCorePackage.getCodeSystemVersionReference(),
			null, "describingCodeSystemVersion", null, 1, 1, EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescriptionBase_Designation(), this.getDesignation(), null, "designation", null, 0, -1,
			EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescriptionBase_Definition(), theCorePackage.getDefinition(), null, "definition", null, 0, -1,
			EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescriptionBase_Example(), theCorePackage.getExample(), null, "example", null, 0, -1,
			EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescriptionBase_Note(), theCorePackage.getComment(), null, "note", null, 0, -1,
			EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescriptionBase_Property(), theCorePackage.getProperty(), null, "property", null, 0, -1,
			EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getEntityDescriptionBase_SourceStatements(), theCorePackage.getStatementDirectoryURI(), "sourceStatements",
			null, 0, 1, EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
			!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getEntityDescriptionBase_SubjectOf(), theCorePackage.getAssociationDirectoryURI(), "subjectOf", null, 0, 1,
			EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getEntityDescriptionBase_PredicateOf(), theCorePackage.getAssociationDirectoryURI(), "predicateOf", null,
			0, 1, EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getEntityDescriptionBase_TargetOf(), theCorePackage.getAssociationDirectoryURI(), "targetOf", null, 0, 1,
			EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescriptionBase_Parent(), theCorePackage.getURIAndEntityName(), null, "parent", null, 0, -1,
			EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getEntityDescriptionBase_Ancestors(), theCorePackage.getEntityDirectoryURI(), "ancestors", null, 0, 1,
			EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getEntityDescriptionBase_Children(), theCorePackage.getEntityDirectoryURI(), "children", null, 0, 1,
			EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getEntityDescriptionBase_Descendants(), theCorePackage.getEntityDirectoryURI(), "descendants", null, 0, 1,
			EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescriptionBase_EntityType(), theCorePackage.getURIAndEntityName(), null, "entityType", null, 1,
			-1, EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getEntityDescriptionBase_Instances(), theCorePackage.getEntityDirectoryURI(), "instances", null, 0, 1,
			EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityDescriptionBase_EquivalentEntity(), theCorePackage.getURIAndEntityName(), null,
			"equivalentEntity", null, 0, -1, EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getEntityDescriptionBase_About(), theCorePackage.getURI(), "about", null, 1, 1,
			EntityDescriptionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			entityDescriptionMsgEClass, EntityDescriptionMsg.class, "EntityDescriptionMsg", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getEntityDescriptionMsg_EntityDescription(), this.getEntityDescription(), null, "entityDescription", null,
			1, 1, EntityDescriptionMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			entityDirectoryEClass, EntityDirectory.class, "EntityDirectory", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getEntityDirectory_Entry(), this.getEntityDirectoryEntry(), null, "entry", null, 0, -1,
			EntityDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			entityDirectoryEntryEClass, EntityDirectoryEntry.class, "EntityDirectoryEntry", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getEntityDirectoryEntry_Href(), theCorePackage.getRenderingURI(), "href", null, 0, 1,
			EntityDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getEntityDirectoryEntry_MatchStrength(), theCorePackage.getMatchStrength(), "matchStrength", null, 0, 1,
			EntityDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getEntityDirectoryEntry_ResourceName(), theCorePackage.getLocalIdentifier(), "resourceName", null, 0, 1,
			EntityDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			entityListEClass, EntityList.class, "EntityList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getEntityList_Entry(), this.getEntityListEntry(), null, "entry", null, 0, -1, EntityList.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			entityListEntryEClass, EntityListEntry.class, "EntityListEntry", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getEntityListEntry_Entry(), this.getEntityDescription(), null, "entry", null, 1, 1, EntityListEntry.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			entityReferenceMsgEClass, EntityReferenceMsg.class, "EntityReferenceMsg", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getEntityReferenceMsg_EntityReference(), theCorePackage.getEntityReference(), null, "entityReference",
			null, 1, 1, EntityReferenceMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			namedEntityDescriptionEClass, NamedEntityDescription.class, "NamedEntityDescription", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getNamedEntityDescription_Status(), theCorePackage.getStatusReference(), null, "status", null, 0, 1,
			NamedEntityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getNamedEntityDescription_ChangeDescription(), theCorePackage.getChangeDescription(), null,
			"changeDescription", null, 0, 1, NamedEntityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getNamedEntityDescription_EntryState(), theCorePackage.getEntryState(), "entryState", "ACTIVE", 0, 1,
			NamedEntityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			namedIndividualDescriptionEClass, NamedIndividualDescription.class, "NamedIndividualDescription",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			objectPropertyDescriptionEClass, ObjectPropertyDescription.class, "ObjectPropertyDescription",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getObjectPropertyDescription_Directed(), this.getObjectPropertyDirectionality(), "directed", null, 0, 1,
			ObjectPropertyDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getObjectPropertyDescription_Transitivity(), this.getTransitivity(), "transitivity", null, 0, 1,
			ObjectPropertyDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			predicateDescriptionEClass, PredicateDescription.class, "PredicateDescription", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getPredicateDescription_ForwardName(), theCorePackage.getString(), "forwardName", null, 0, 1,
			PredicateDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getPredicateDescription_ReverseName(), theCorePackage.getString(), "reverseName", null, 0, 1,
			PredicateDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(classDescriptionStateEEnum, ClassDescriptionState.class, "ClassDescriptionState");
		addEEnumLiteral(classDescriptionStateEEnum, ClassDescriptionState.PRIMITIVE);
		addEEnumLiteral(classDescriptionStateEEnum, ClassDescriptionState.FULLYDEFINED);

		initEEnum(classDescriptionTypeEEnum, ClassDescriptionType.class, "ClassDescriptionType");
		addEEnumLiteral(classDescriptionTypeEEnum, ClassDescriptionType.A);
		addEEnumLiteral(classDescriptionTypeEEnum, ClassDescriptionType.C);
		addEEnumLiteral(classDescriptionTypeEEnum, ClassDescriptionType.TOP);
		addEEnumLiteral(classDescriptionTypeEEnum, ClassDescriptionType.BOTTOM);

		initEEnum(designationRoleEEnum, DesignationRole.class, "DesignationRole");
		addEEnumLiteral(designationRoleEEnum, DesignationRole.PREFERRED);
		addEEnumLiteral(designationRoleEEnum, DesignationRole.ALTERNATIVE);
		addEEnumLiteral(designationRoleEEnum, DesignationRole.HIDDEN);

		initEEnum(objectPropertyDirectionalityEEnum, ObjectPropertyDirectionality.class, "ObjectPropertyDirectionality");
		addEEnumLiteral(objectPropertyDirectionalityEEnum, ObjectPropertyDirectionality.UNIDIRECTIONAL);
		addEEnumLiteral(objectPropertyDirectionalityEEnum, ObjectPropertyDirectionality.BIDIRECTIONAL);

		initEEnum(transitivityEEnum, Transitivity.class, "Transitivity");
		addEEnumLiteral(transitivityEEnum, Transitivity.TRANSITIVE);
		addEEnumLiteral(transitivityEEnum, Transitivity.INTRANSITIVE);
		addEEnumLiteral(transitivityEEnum, Transitivity.ANTITRANSITIVE);

		// Initialize data types
		initEDataType(
			classDescriptionStateObjectEDataType, ClassDescriptionState.class, "ClassDescriptionStateObject",
			IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			classDescriptionTypeObjectEDataType, ClassDescriptionType.class, "ClassDescriptionTypeObject",
			IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			designationRoleObjectEDataType, DesignationRole.class, "DesignationRoleObject", IS_SERIALIZABLE,
			IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			objectPropertyDirectionalityObjectEDataType, ObjectPropertyDirectionality.class,
			"ObjectPropertyDirectionalityObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			transitivityObjectEDataType, Transitivity.class, "TransitivityObject", IS_SERIALIZABLE,
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
		addAnnotation(annotationPropertyDescriptionEClass, source, new String[] {
				"name", "AnnotationPropertyDescription", "kind", "elementOnly" });
		addAnnotation(anonymousEntityDescriptionEClass, source, new String[] {
				"name", "AnonymousEntityDescription", "kind", "elementOnly" });
		addAnnotation(anonymousIndividualDescriptionEClass, source, new String[] {
				"name", "AnonymousIndividualDescription", "kind", "elementOnly" });
		addAnnotation(
			classDescriptionEClass, source, new String[] { "name", "ClassDescription", "kind", "elementOnly" });
		addAnnotation(getClassDescription_DescriptionState(), source, new String[] {
				"kind", "attribute", "name", "descriptionState" });
		addAnnotation(getClassDescription_DescriptionType(), source, new String[] {
				"kind", "attribute", "name", "descriptionType" });
		addAnnotation(classDescriptionStateEEnum, source, new String[] { "name", "ClassDescriptionState" });
		addAnnotation(classDescriptionStateObjectEDataType, source, new String[] {
				"name", "ClassDescriptionState:Object", "baseType", "ClassDescriptionState" });
		addAnnotation(classDescriptionTypeEEnum, source, new String[] { "name", "ClassDescriptionType" });
		addAnnotation(classDescriptionTypeObjectEDataType, source, new String[] {
				"name", "ClassDescriptionType:Object", "baseType", "ClassDescriptionType" });
		addAnnotation(dataPropertyDescriptionEClass, source, new String[] {
				"name", "DataPropertyDescription", "kind", "elementOnly" });
		addAnnotation(dataTypeDescriptionEClass, source, new String[] {
				"name", "DataTypeDescription", "kind", "elementOnly" });
		addAnnotation(designationEClass, source, new String[] { "name", "Designation", "kind", "elementOnly" });
		addAnnotation(getDesignation_UsageContext(), source, new String[] {
				"kind", "element", "name", "usageContext", "namespace", "##targetNamespace" });
		addAnnotation(getDesignation_DesignationType(), source, new String[] {
				"kind", "element", "name", "designationType", "namespace", "##targetNamespace" });
		addAnnotation(getDesignation_CaseSignificance(), source, new String[] {
				"kind", "element", "name", "caseSignificance", "namespace", "##targetNamespace" });
		addAnnotation(getDesignation_DegreeOfFidelity(), source, new String[] {
				"kind", "element", "name", "degreeOfFidelity", "namespace", "##targetNamespace" });
		addAnnotation(getDesignation_AssertedInCodeSystemVersion(), source, new String[] {
				"kind", "attribute", "name", "assertedInCodeSystemVersion" });
		addAnnotation(getDesignation_CorrespondingStatement(), source, new String[] {
				"kind", "attribute", "name", "correspondingStatement" });
		addAnnotation(getDesignation_DesignationRole(), source, new String[] {
				"kind", "attribute", "name", "designationRole" });
		addAnnotation(getDesignation_ExternalIdentifier(), source, new String[] {
				"kind", "attribute", "name", "externalIdentifier" });
		addAnnotation(designationRoleEEnum, source, new String[] { "name", "DesignationRole" });
		addAnnotation(designationRoleObjectEDataType, source, new String[] {
				"name", "DesignationRole:Object", "baseType", "DesignationRole" });
		addAnnotation(documentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
		addAnnotation(getDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" });
		addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source, new String[] {
				"kind", "attribute", "name", "xmlns:prefix" });
		addAnnotation(getDocumentRoot_XSISchemaLocation(), source, new String[] {
				"kind", "attribute", "name", "xsi:schemaLocation" });
		addAnnotation(getDocumentRoot_EntityDescription(), source, new String[] {
				"kind", "element", "name", "EntityDescription", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_EntityDescriptionMsg(), source, new String[] {
				"kind", "element", "name", "EntityDescriptionMsg", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_EntityDirectory(), source, new String[] {
				"kind", "element", "name", "EntityDirectory", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_EntityList(), source, new String[] {
				"kind", "element", "name", "EntityList", "namespace", "##targetNamespace" });
		addAnnotation(getDocumentRoot_EntityReferenceMsg(), source, new String[] {
				"kind", "element", "name", "EntityReferenceMsg", "namespace", "##targetNamespace" });
		addAnnotation(entityDescriptionEClass, source, new String[] {
				"name", "EntityDescription", "kind", "elementOnly" });
		addAnnotation(getEntityDescription_NamedEntity(), source, new String[] {
				"kind", "element", "name", "namedEntity", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescription_AnonymousEntity(), source, new String[] {
				"kind", "element", "name", "anonymousEntity", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescription_ClassDescription(), source, new String[] {
				"kind", "element", "name", "classDescription", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescription_DataTypeDescription(), source, new String[] {
				"kind", "element", "name", "dataTypeDescription", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescription_PredicateDescription(), source, new String[] {
				"kind", "element", "name", "predicateDescription", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescription_ObjectPropertyDescription(), source, new String[] {
				"kind", "element", "name", "objectPropertyDescription", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescription_DataPropertyDescription(), source, new String[] {
				"kind", "element", "name", "dataPropertyDescription", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescription_AnnotationPropertyDescription(), source, new String[] {
				"kind", "element", "name", "annotationPropertyDescription", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescription_NamedIndividual(), source, new String[] {
				"kind", "element", "name", "namedIndividual", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescription_AnonymousIndividual(), source, new String[] {
				"kind", "element", "name", "anonymousIndividual", "namespace", "##targetNamespace" });
		addAnnotation(entityDescriptionBaseEClass, source, new String[] {
				"name", "EntityDescriptionBase", "kind", "elementOnly" });
		addAnnotation(getEntityDescriptionBase_EntityID(), source, new String[] {
				"kind", "element", "name", "entityID", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_AlternateEntityID(), source, new String[] {
				"kind", "element", "name", "alternateEntityID", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_DescribingCodeSystemVersion(), source, new String[] {
				"kind", "element", "name", "describingCodeSystemVersion", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_Designation(), source, new String[] {
				"kind", "element", "name", "designation", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_Definition(), source, new String[] {
				"kind", "element", "name", "definition", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_Example(), source, new String[] {
				"kind", "element", "name", "example", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_Note(), source, new String[] {
				"kind", "element", "name", "note", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_Property(), source, new String[] {
				"kind", "element", "name", "property", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_SourceStatements(), source, new String[] {
				"kind", "element", "name", "sourceStatements", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_SubjectOf(), source, new String[] {
				"kind", "element", "name", "subjectOf", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_PredicateOf(), source, new String[] {
				"kind", "element", "name", "predicateOf", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_TargetOf(), source, new String[] {
				"kind", "element", "name", "targetOf", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_Parent(), source, new String[] {
				"kind", "element", "name", "parent", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_Ancestors(), source, new String[] {
				"kind", "element", "name", "ancestors", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_Children(), source, new String[] {
				"kind", "element", "name", "children", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_Descendants(), source, new String[] {
				"kind", "element", "name", "descendants", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_EntityType(), source, new String[] {
				"kind", "element", "name", "entityType", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_Instances(), source, new String[] {
				"kind", "element", "name", "instances", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_EquivalentEntity(), source, new String[] {
				"kind", "element", "name", "equivalentEntity", "namespace", "##targetNamespace" });
		addAnnotation(getEntityDescriptionBase_About(), source, new String[] { "kind", "attribute", "name", "about" });
		addAnnotation(entityDescriptionMsgEClass, source, new String[] {
				"name", "EntityDescriptionMsg", "kind", "elementOnly" });
		addAnnotation(getEntityDescriptionMsg_EntityDescription(), source, new String[] {
				"kind", "element", "name", "EntityDescription", "namespace", "##targetNamespace" });
		addAnnotation(entityDirectoryEClass, source, new String[] { "name", "EntityDirectory", "kind", "elementOnly" });
		addAnnotation(getEntityDirectory_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(entityDirectoryEntryEClass, source, new String[] {
				"name", "EntityDirectoryEntry", "kind", "elementOnly" });
		addAnnotation(getEntityDirectoryEntry_Href(), source, new String[] { "kind", "attribute", "name", "href" });
		addAnnotation(getEntityDirectoryEntry_MatchStrength(), source, new String[] {
				"kind", "attribute", "name", "matchStrength" });
		addAnnotation(getEntityDirectoryEntry_ResourceName(), source, new String[] {
				"kind", "attribute", "name", "resourceName" });
		addAnnotation(entityListEClass, source, new String[] { "name", "EntityList", "kind", "elementOnly" });
		addAnnotation(getEntityList_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(entityListEntryEClass, source, new String[] { "name", "EntityListEntry", "kind", "elementOnly" });
		addAnnotation(getEntityListEntry_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(entityReferenceMsgEClass, source, new String[] {
				"name", "EntityReferenceMsg", "kind", "elementOnly" });
		addAnnotation(getEntityReferenceMsg_EntityReference(), source, new String[] {
				"kind", "element", "name", "entityReference", "namespace", "##targetNamespace" });
		addAnnotation(namedEntityDescriptionEClass, source, new String[] {
				"name", "NamedEntityDescription", "kind", "elementOnly" });
		addAnnotation(getNamedEntityDescription_Status(), source, new String[] {
				"kind", "element", "name", "status", "namespace", "http://schema.omg.org/spec/CTS2/1.0/Core" });
		addAnnotation(
			getNamedEntityDescription_ChangeDescription(), source, new String[] {
					"kind", "element", "name", "changeDescription", "namespace",
					"http://schema.omg.org/spec/CTS2/1.0/Core" });
		addAnnotation(getNamedEntityDescription_EntryState(), source, new String[] {
				"kind", "attribute", "name", "entryState" });
		addAnnotation(namedIndividualDescriptionEClass, source, new String[] {
				"name", "NamedIndividualDescription", "kind", "elementOnly" });
		addAnnotation(objectPropertyDescriptionEClass, source, new String[] {
				"name", "ObjectPropertyDescription", "kind", "elementOnly" });
		addAnnotation(getObjectPropertyDescription_Directed(), source, new String[] {
				"kind", "attribute", "name", "directed" });
		addAnnotation(getObjectPropertyDescription_Transitivity(), source, new String[] {
				"kind", "attribute", "name", "transitivity" });
		addAnnotation(
			objectPropertyDirectionalityEEnum, source, new String[] { "name", "ObjectPropertyDirectionality" });
		addAnnotation(objectPropertyDirectionalityObjectEDataType, source, new String[] {
				"name", "ObjectPropertyDirectionality:Object", "baseType", "ObjectPropertyDirectionality" });
		addAnnotation(predicateDescriptionEClass, source, new String[] {
				"name", "PredicateDescription", "kind", "elementOnly" });
		addAnnotation(getPredicateDescription_ForwardName(), source, new String[] {
				"kind", "element", "name", "forwardName", "namespace", "##targetNamespace" });
		addAnnotation(getPredicateDescription_ReverseName(), source, new String[] {
				"kind", "element", "name", "reverseName", "namespace", "##targetNamespace" });
		addAnnotation(transitivityEEnum, source, new String[] { "name", "Transitivity" });
		addAnnotation(transitivityObjectEDataType, source, new String[] {
				"name", "Transitivity:Object", "baseType", "Transitivity" });
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
		addAnnotation(getDocumentRoot_EntityDescription(), source, new String[] { "appinfo", "PSM" });
		addAnnotation(entityDescriptionEClass, source, new String[] { "appinfo", "PSM" });
		addAnnotation(entityDescriptionMsgEClass, source, new String[] { "appinfo", "PSM" });
		addAnnotation(getEntityDescriptionMsg_EntityDescription(), source, new String[] { "appinfo", "PSM" });
		addAnnotation(entityReferenceMsgEClass, source, new String[] { "appinfo", "PSM" });
	}

} // EntityPackageImpl
