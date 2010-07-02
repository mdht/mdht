/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.rim.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.rim.RIMAct;
import org.openhealthtools.mdht.uml.hl7.rim.RIMActRelationship;
import org.openhealthtools.mdht.uml.hl7.rim.RIMEntity;
import org.openhealthtools.mdht.uml.hl7.rim.RIMFactory;
import org.openhealthtools.mdht.uml.hl7.rim.RIMInfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.RIMPackage;
import org.openhealthtools.mdht.uml.hl7.rim.RIMParticipation;
import org.openhealthtools.mdht.uml.hl7.rim.RIMRole;
import org.openhealthtools.mdht.uml.hl7.rim.RIMRoleLink;
import org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RIMPackageImpl extends EPackageImpl implements RIMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rimActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rimInfrastructureRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rimParticipationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rimRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rimEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rimRoleLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rimActRelationshipEClass = null;

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
	 * @see org.openhealthtools.mdht.uml.hl7.rim.RIMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RIMPackageImpl() {
		super(eNS_URI, RIMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RIMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RIMPackage init() {
		if (isInited) return (RIMPackage)EPackage.Registry.INSTANCE.getEPackage(RIMPackage.eNS_URI);

		// Obtain or create and register package
		RIMPackageImpl theRIMPackage = (RIMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RIMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RIMPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DatatypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRIMPackage.createPackageContents();

		// Initialize created meta-data
		theRIMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRIMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RIMPackage.eNS_URI, theRIMPackage);
		return theRIMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRIMAct() {
		return rimActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIMAct_Participation() {
		return (EReference)rimActEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIMAct_OutboundRelationship() {
		return (EReference)rimActEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIMAct_InboundRelationship() {
		return (EReference)rimActEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRIMInfrastructureRoot() {
		return rimInfrastructureRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRIMParticipation() {
		return rimParticipationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIMParticipation_Act() {
		return (EReference)rimParticipationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIMParticipation_Role() {
		return (EReference)rimParticipationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRIMRole() {
		return rimRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIMRole_Player() {
		return (EReference)rimRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIMRole_Scoper() {
		return (EReference)rimRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIMRole_Participation() {
		return (EReference)rimRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIMRole_OutboundLink() {
		return (EReference)rimRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIMRole_InboundLink() {
		return (EReference)rimRoleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRIMEntity() {
		return rimEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIMEntity_PlayedRole() {
		return (EReference)rimEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIMEntity_ScopedRole() {
		return (EReference)rimEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRIMRoleLink() {
		return rimRoleLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIMRoleLink_Target() {
		return (EReference)rimRoleLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIMRoleLink_Source() {
		return (EReference)rimRoleLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRIMActRelationship() {
		return rimActRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIMActRelationship_Target() {
		return (EReference)rimActRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIMActRelationship_Source() {
		return (EReference)rimActRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIMFactory getRIMFactory() {
		return (RIMFactory)getEFactoryInstance();
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
		rimActEClass = createEClass(RIM_ACT);
		createEReference(rimActEClass, RIM_ACT__PARTICIPATION);
		createEReference(rimActEClass, RIM_ACT__OUTBOUND_RELATIONSHIP);
		createEReference(rimActEClass, RIM_ACT__INBOUND_RELATIONSHIP);

		rimInfrastructureRootEClass = createEClass(RIM_INFRASTRUCTURE_ROOT);

		rimParticipationEClass = createEClass(RIM_PARTICIPATION);
		createEReference(rimParticipationEClass, RIM_PARTICIPATION__ACT);
		createEReference(rimParticipationEClass, RIM_PARTICIPATION__ROLE);

		rimRoleEClass = createEClass(RIM_ROLE);
		createEReference(rimRoleEClass, RIM_ROLE__PLAYER);
		createEReference(rimRoleEClass, RIM_ROLE__SCOPER);
		createEReference(rimRoleEClass, RIM_ROLE__PARTICIPATION);
		createEReference(rimRoleEClass, RIM_ROLE__OUTBOUND_LINK);
		createEReference(rimRoleEClass, RIM_ROLE__INBOUND_LINK);

		rimEntityEClass = createEClass(RIM_ENTITY);
		createEReference(rimEntityEClass, RIM_ENTITY__PLAYED_ROLE);
		createEReference(rimEntityEClass, RIM_ENTITY__SCOPED_ROLE);

		rimRoleLinkEClass = createEClass(RIM_ROLE_LINK);
		createEReference(rimRoleLinkEClass, RIM_ROLE_LINK__TARGET);
		createEReference(rimRoleLinkEClass, RIM_ROLE_LINK__SOURCE);

		rimActRelationshipEClass = createEClass(RIM_ACT_RELATIONSHIP);
		createEReference(rimActRelationshipEClass, RIM_ACT_RELATIONSHIP__TARGET);
		createEReference(rimActRelationshipEClass, RIM_ACT_RELATIONSHIP__SOURCE);
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
		DatatypesPackage theDatatypesPackage = (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
		VocabPackage theVocabPackage = (VocabPackage)EPackage.Registry.INSTANCE.getEPackage(VocabPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rimActEClass.getESuperTypes().add(this.getRIMInfrastructureRoot());
		rimParticipationEClass.getESuperTypes().add(this.getRIMInfrastructureRoot());
		rimRoleEClass.getESuperTypes().add(this.getRIMInfrastructureRoot());
		rimEntityEClass.getESuperTypes().add(this.getRIMInfrastructureRoot());
		rimRoleLinkEClass.getESuperTypes().add(this.getRIMInfrastructureRoot());
		rimActRelationshipEClass.getESuperTypes().add(this.getRIMInfrastructureRoot());

		// Initialize classes and features; add operations and parameters
		initEClass(rimActEClass, RIMAct.class, "RIMAct", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRIMAct_Participation(), this.getRIMParticipation(), null, "participation", null, 0, -1, RIMAct.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRIMAct_OutboundRelationship(), this.getRIMActRelationship(), null, "outboundRelationship", null, 0, -1, RIMAct.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRIMAct_InboundRelationship(), this.getRIMActRelationship(), null, "inboundRelationship", null, 0, -1, RIMAct.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		addEOperation(rimActEClass, ecorePackage.getEEnumerator(), "getClassCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(rimActEClass, ecorePackage.getEEnumerator(), "getMoodCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(rimActEClass, ecorePackage.getEBooleanObject(), "getNegationInd", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(rimInfrastructureRootEClass, RIMInfrastructureRoot.class, "RIMInfrastructureRoot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(rimInfrastructureRootEClass, theDatatypesPackage.getCS(), "getRealmCodes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(rimInfrastructureRootEClass, theDatatypesPackage.getII(), "getTypeId", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(rimInfrastructureRootEClass, theDatatypesPackage.getII(), "getTemplateIds", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(rimInfrastructureRootEClass, theVocabPackage.getNullFlavor(), "getNullFlavor", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(rimParticipationEClass, RIMParticipation.class, "RIMParticipation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRIMParticipation_Act(), this.getRIMAct(), null, "act", null, 1, 1, RIMParticipation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRIMParticipation_Role(), this.getRIMRole(), null, "role", null, 1, 1, RIMParticipation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		addEOperation(rimParticipationEClass, ecorePackage.getEEnumerator(), "getTypeCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(rimRoleEClass, RIMRole.class, "RIMRole", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRIMRole_Player(), this.getRIMEntity(), null, "player", null, 0, 1, RIMRole.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRIMRole_Scoper(), this.getRIMEntity(), null, "scoper", null, 0, 1, RIMRole.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRIMRole_Participation(), this.getRIMParticipation(), null, "participation", null, 0, -1, RIMRole.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRIMRole_OutboundLink(), this.getRIMRoleLink(), null, "outboundLink", null, 0, -1, RIMRole.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRIMRole_InboundLink(), this.getRIMRoleLink(), null, "inboundLink", null, 0, -1, RIMRole.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		addEOperation(rimRoleEClass, ecorePackage.getEEnumerator(), "getClassCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(rimEntityEClass, RIMEntity.class, "RIMEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRIMEntity_PlayedRole(), this.getRIMRole(), null, "playedRole", null, 0, -1, RIMEntity.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRIMEntity_ScopedRole(), this.getRIMRole(), null, "scopedRole", null, 0, -1, RIMEntity.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		addEOperation(rimEntityEClass, ecorePackage.getEEnumerator(), "getClassCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(rimEntityEClass, ecorePackage.getEEnumerator(), "getDeterminerCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(rimRoleLinkEClass, RIMRoleLink.class, "RIMRoleLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRIMRoleLink_Target(), this.getRIMRole(), null, "target", null, 1, 1, RIMRoleLink.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRIMRoleLink_Source(), this.getRIMRole(), null, "source", null, 1, 1, RIMRoleLink.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		addEOperation(rimRoleLinkEClass, ecorePackage.getEEnumerator(), "getTypeCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(rimActRelationshipEClass, RIMActRelationship.class, "RIMActRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRIMActRelationship_Target(), this.getRIMAct(), null, "target", null, 1, 1, RIMActRelationship.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRIMActRelationship_Source(), this.getRIMAct(), null, "source", null, 1, 1, RIMActRelationship.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		addEOperation(rimActRelationshipEClass, ecorePackage.getEEnumerator(), "getTypeCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RIMPackageImpl
