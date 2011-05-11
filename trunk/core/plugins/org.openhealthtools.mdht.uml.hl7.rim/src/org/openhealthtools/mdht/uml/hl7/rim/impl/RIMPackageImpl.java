/*******************************************************************************
 * Copyright (c) 2010, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.rim.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.ActRelationship;
import org.openhealthtools.mdht.uml.hl7.rim.Entity;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;
import org.openhealthtools.mdht.uml.hl7.rim.RIMFactory;
import org.openhealthtools.mdht.uml.hl7.rim.RIMPackage;
import org.openhealthtools.mdht.uml.hl7.rim.Role;
import org.openhealthtools.mdht.uml.hl7.rim.RoleLink;
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
	private EClass actEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actRelationshipEClass = null;

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
	public EClass getAct() {
		return actEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureRoot() {
		return infrastructureRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipation() {
		return participationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleLink() {
		return roleLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActRelationship() {
		return actRelationshipEClass;
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
		actEClass = createEClass(ACT);

		infrastructureRootEClass = createEClass(INFRASTRUCTURE_ROOT);

		participationEClass = createEClass(PARTICIPATION);

		roleEClass = createEClass(ROLE);

		entityEClass = createEClass(ENTITY);

		roleLinkEClass = createEClass(ROLE_LINK);

		actRelationshipEClass = createEClass(ACT_RELATIONSHIP);
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
		actEClass.getESuperTypes().add(this.getInfrastructureRoot());
		participationEClass.getESuperTypes().add(this.getInfrastructureRoot());
		roleEClass.getESuperTypes().add(this.getInfrastructureRoot());
		entityEClass.getESuperTypes().add(this.getInfrastructureRoot());
		roleLinkEClass.getESuperTypes().add(this.getInfrastructureRoot());
		actRelationshipEClass.getESuperTypes().add(this.getInfrastructureRoot());

		// Initialize classes and features; add operations and parameters
		initEClass(actEClass, Act.class, "Act", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(actEClass, ecorePackage.getEEnumerator(), "getClassCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actEClass, ecorePackage.getEEnumerator(), "getMoodCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actEClass, ecorePackage.getEBooleanObject(), "getNegationInd", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actEClass, this.getParticipation(), "getParticipations", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actEClass, this.getActRelationship(), "getOutboundRelationships", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actEClass, this.getActRelationship(), "getInboundRelationships", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actEClass, ecorePackage.getEBoolean(), "isClassCodeDefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actEClass, ecorePackage.getEBoolean(), "isMoodCodeDefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(infrastructureRootEClass, InfrastructureRoot.class, "InfrastructureRoot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(infrastructureRootEClass, theDatatypesPackage.getCS(), "getRealmCodes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(infrastructureRootEClass, theDatatypesPackage.getII(), "getTypeId", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(infrastructureRootEClass, theDatatypesPackage.getII(), "getTemplateIds", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(infrastructureRootEClass, theVocabPackage.getNullFlavor(), "getNullFlavor", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(infrastructureRootEClass, ecorePackage.getEBoolean(), "isNullFlavorDefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(infrastructureRootEClass, ecorePackage.getEBoolean(), "isNullFlavorUndefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(infrastructureRootEClass, ecorePackage.getEBoolean(), "hasContent", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = addEOperation(infrastructureRootEClass, ecorePackage.getEBoolean(), "isDefined", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "featureName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(participationEClass, Participation.class, "Participation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(participationEClass, ecorePackage.getEEnumerator(), "getTypeCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(participationEClass, this.getAct(), "getAct", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(participationEClass, this.getRole(), "getRole", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(participationEClass, ecorePackage.getEBoolean(), "isTypeCodeDefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(participationEClass, ecorePackage.getEBoolean(), "isContextControlCodeDefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(roleEClass, ecorePackage.getEEnumerator(), "getClassCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(roleEClass, this.getEntity(), "getPlayer", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(roleEClass, this.getEntity(), "getScoper", 0, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(roleEClass, this.getParticipation(), "getParticipations", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(roleEClass, this.getRoleLink(), "getOutboundLinks", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(roleEClass, this.getRoleLink(), "getInboundLinks", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(roleEClass, ecorePackage.getEBoolean(), "isClassCodeDefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entityEClass, ecorePackage.getEEnumerator(), "getClassCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(entityEClass, ecorePackage.getEEnumerator(), "getDeterminerCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(entityEClass, this.getRole(), "getPlayedRoles", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(entityEClass, this.getRole(), "getScopedRoles", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(entityEClass, ecorePackage.getEBoolean(), "isClassCodeDefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(entityEClass, ecorePackage.getEBoolean(), "isDeterminerCodeDefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roleLinkEClass, RoleLink.class, "RoleLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(roleLinkEClass, ecorePackage.getEEnumerator(), "getTypeCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(roleLinkEClass, this.getRole(), "getTarget", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(roleLinkEClass, this.getRole(), "getSource", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(roleLinkEClass, ecorePackage.getEBoolean(), "isTypeCodeDefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(actRelationshipEClass, ActRelationship.class, "ActRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(actRelationshipEClass, ecorePackage.getEEnumerator(), "getTypeCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actRelationshipEClass, this.getAct(), "getTarget", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actRelationshipEClass, this.getAct(), "getSource", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(actRelationshipEClass, ecorePackage.getEBoolean(), "isTypeCodeDefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RIMPackageImpl
