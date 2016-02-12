/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.core.profile.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.cda.core.profile.ActRelationship;
import org.openhealthtools.mdht.uml.cda.core.profile.AssociationValidation;
import org.openhealthtools.mdht.uml.cda.core.profile.CDAFactory;
import org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage;
import org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate;
import org.openhealthtools.mdht.uml.cda.core.profile.ClassValidation;
import org.openhealthtools.mdht.uml.cda.core.profile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport;
import org.openhealthtools.mdht.uml.cda.core.profile.ConceptDomainConstraint;
import org.openhealthtools.mdht.uml.cda.core.profile.ConformsTo;
import org.openhealthtools.mdht.uml.cda.core.profile.ConstraintValidation;
import org.openhealthtools.mdht.uml.cda.core.profile.Entry;
import org.openhealthtools.mdht.uml.cda.core.profile.EntryKind;
import org.openhealthtools.mdht.uml.cda.core.profile.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.core.profile.EntryRelationshipKind;
import org.openhealthtools.mdht.uml.cda.core.profile.Inline;
import org.openhealthtools.mdht.uml.cda.core.profile.LogicalConstraint;
import org.openhealthtools.mdht.uml.cda.core.profile.LogicalOperator;
import org.openhealthtools.mdht.uml.cda.core.profile.NullFlavor;
import org.openhealthtools.mdht.uml.cda.core.profile.NullFlavorKind;
import org.openhealthtools.mdht.uml.cda.core.profile.Participation;
import org.openhealthtools.mdht.uml.cda.core.profile.PropertyValidation;
import org.openhealthtools.mdht.uml.cda.core.profile.SeverityKind;
import org.openhealthtools.mdht.uml.cda.core.profile.TextValue;
import org.openhealthtools.mdht.uml.cda.core.profile.Unimplementable;
import org.openhealthtools.mdht.uml.cda.core.profile.Validation;
import org.openhealthtools.mdht.uml.cda.core.profile.ValidationKind;
import org.openhealthtools.mdht.uml.cda.core.profile.ValueSetConstraint;
import org.openhealthtools.mdht.uml.cda.core.profile.VocabSpecification;
import org.openhealthtools.mdht.uml.term.core.profile.TermPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CDAPackageImpl extends EPackageImpl implements CDAPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass associationValidationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass validationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entryRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codegenSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass propertyValidationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass classValidationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass vocabSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass nullFlavorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass textValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass cdaTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass constraintValidationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass conformsToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass conceptDomainConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeSystemConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass valueSetConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass actRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass participationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass logicalConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass inlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass unimplementableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum severityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum entryKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum validationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum entryRelationshipKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum nullFlavorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum logicalOperatorEEnum = null;

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
	 * This method is used to initialize {@link CDAPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CDAPackage init() {
		if (isInited) {
			return (CDAPackage) EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);
		}

		// Obtain or create and register package
		CDAPackageImpl theCDAPackage = (CDAPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CDAPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new CDAPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TermPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCDAPackage.createPackageContents();

		// Initialize created meta-data
		theCDAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCDAPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CDAPackage.eNS_URI, theCDAPackage);
		return theCDAPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CDAPackageImpl() {
		super(eNS_URI, CDAFactory.eINSTANCE);
	}

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
		entryEClass = createEClass(ENTRY);
		createEAttribute(entryEClass, ENTRY__TYPE_CODE);

		associationValidationEClass = createEClass(ASSOCIATION_VALIDATION);
		createEReference(associationValidationEClass, ASSOCIATION_VALIDATION__BASE_ASSOCIATION);

		validationEClass = createEClass(VALIDATION);
		createEAttribute(validationEClass, VALIDATION__MESSAGE);
		createEAttribute(validationEClass, VALIDATION__SEVERITY);
		createEAttribute(validationEClass, VALIDATION__RULE_ID);
		createEAttribute(validationEClass, VALIDATION__MANDATORY);
		createEAttribute(validationEClass, VALIDATION__KIND);
		createEAttribute(validationEClass, VALIDATION__STRICT);
		createEAttribute(validationEClass, VALIDATION__NEGATION_INDICATOR);

		entryRelationshipEClass = createEClass(ENTRY_RELATIONSHIP);
		createEAttribute(entryRelationshipEClass, ENTRY_RELATIONSHIP__TYPE_CODE);

		codegenSupportEClass = createEClass(CODEGEN_SUPPORT);
		createEAttribute(codegenSupportEClass, CODEGEN_SUPPORT__BASE_PACKAGE);
		createEAttribute(codegenSupportEClass, CODEGEN_SUPPORT__NS_PREFIX);
		createEAttribute(codegenSupportEClass, CODEGEN_SUPPORT__NS_URI);
		createEAttribute(codegenSupportEClass, CODEGEN_SUPPORT__PACKAGE_NAME);
		createEAttribute(codegenSupportEClass, CODEGEN_SUPPORT__PREFIX);
		createEReference(codegenSupportEClass, CODEGEN_SUPPORT__BASE_NAMESPACE);

		propertyValidationEClass = createEClass(PROPERTY_VALIDATION);
		createEReference(propertyValidationEClass, PROPERTY_VALIDATION__BASE_PROPERTY);

		classValidationEClass = createEClass(CLASS_VALIDATION);
		createEReference(classValidationEClass, CLASS_VALIDATION__BASE_CLASS);

		vocabSpecificationEClass = createEClass(VOCAB_SPECIFICATION);
		createEAttribute(vocabSpecificationEClass, VOCAB_SPECIFICATION__CODE);
		createEAttribute(vocabSpecificationEClass, VOCAB_SPECIFICATION__CODE_SYSTEM);
		createEAttribute(vocabSpecificationEClass, VOCAB_SPECIFICATION__CODE_SYSTEM_NAME);
		createEAttribute(vocabSpecificationEClass, VOCAB_SPECIFICATION__CODE_SYSTEM_VERSION);
		createEAttribute(vocabSpecificationEClass, VOCAB_SPECIFICATION__DISPLAY_NAME);

		nullFlavorEClass = createEClass(NULL_FLAVOR);
		createEAttribute(nullFlavorEClass, NULL_FLAVOR__NULL_FLAVOR);

		textValueEClass = createEClass(TEXT_VALUE);
		createEAttribute(textValueEClass, TEXT_VALUE__VALUE);
		createEAttribute(textValueEClass, TEXT_VALUE__IGNORE_CASE);

		cdaTemplateEClass = createEClass(CDA_TEMPLATE);
		createEAttribute(cdaTemplateEClass, CDA_TEMPLATE__TEMPLATE_ID);
		createEAttribute(cdaTemplateEClass, CDA_TEMPLATE__ASSIGNING_AUTHORITY_NAME);
		createEAttribute(cdaTemplateEClass, CDA_TEMPLATE__CONTEXT_DEPENDENT);
		createEAttribute(cdaTemplateEClass, CDA_TEMPLATE__TEMPLATE_VERSION);
		createEAttribute(cdaTemplateEClass, CDA_TEMPLATE__TEMPLATE_MULTIPLICITY);

		constraintValidationEClass = createEClass(CONSTRAINT_VALIDATION);
		createEReference(constraintValidationEClass, CONSTRAINT_VALIDATION__BASE_CONSTRAINT);
		createEAttribute(constraintValidationEClass, CONSTRAINT_VALIDATION__ENABLED_DITA_FOR_CONSTRAINTS);

		conformsToEClass = createEClass(CONFORMS_TO);
		createEReference(conformsToEClass, CONFORMS_TO__BASE_GENERALIZATION);
		createEAttribute(conformsToEClass, CONFORMS_TO__REQUIRES_PARENT_ID);

		conceptDomainConstraintEClass = createEClass(CONCEPT_DOMAIN_CONSTRAINT);

		codeSystemConstraintEClass = createEClass(CODE_SYSTEM_CONSTRAINT);

		valueSetConstraintEClass = createEClass(VALUE_SET_CONSTRAINT);

		actRelationshipEClass = createEClass(ACT_RELATIONSHIP);
		createEReference(actRelationshipEClass, ACT_RELATIONSHIP__BASE_ASSOCIATION);
		createEReference(actRelationshipEClass, ACT_RELATIONSHIP__ASSOCIATION_TYPE);
		createEReference(actRelationshipEClass, ACT_RELATIONSHIP__TYPE_CODE);

		participationEClass = createEClass(PARTICIPATION);
		createEReference(participationEClass, PARTICIPATION__BASE_ASSOCIATION);
		createEReference(participationEClass, PARTICIPATION__ASSOCIATION_TYPE);
		createEReference(participationEClass, PARTICIPATION__TYPE_CODE);

		logicalConstraintEClass = createEClass(LOGICAL_CONSTRAINT);
		createEAttribute(logicalConstraintEClass, LOGICAL_CONSTRAINT__OPERATION);

		inlineEClass = createEClass(INLINE);
		createEReference(inlineEClass, INLINE__BASE_CLASS);
		createEAttribute(inlineEClass, INLINE__FILTER);
		createEAttribute(inlineEClass, INLINE__PUBLISH_SEPERATELY);

		unimplementableEClass = createEClass(UNIMPLEMENTABLE);
		createEReference(unimplementableEClass, UNIMPLEMENTABLE__BASE_CONSTRAINT);

		// Create enums
		severityKindEEnum = createEEnum(SEVERITY_KIND);
		entryKindEEnum = createEEnum(ENTRY_KIND);
		validationKindEEnum = createEEnum(VALIDATION_KIND);
		entryRelationshipKindEEnum = createEEnum(ENTRY_RELATIONSHIP_KIND);
		nullFlavorKindEEnum = createEEnum(NULL_FLAVOR_KIND);
		logicalOperatorEEnum = createEEnum(LOGICAL_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getActRelationship() {
		return actRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getActRelationship_AssociationType() {
		return (EReference) actRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getActRelationship_Base_Association() {
		return (EReference) actRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getActRelationship_TypeCode() {
		return (EReference) actRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssociationValidation() {
		return associationValidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociationValidation_Base_Association() {
		return (EReference) associationValidationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CDAFactory getCDAFactory() {
		return (CDAFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCDATemplate() {
		return cdaTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCDATemplate_AssigningAuthorityName() {
		return (EAttribute) cdaTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCDATemplate_ContextDependent() {
		return (EAttribute) cdaTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCDATemplate_TemplateVersion() {
		return (EAttribute) cdaTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCDATemplate_TemplateMultiplicity() {
		return (EAttribute) cdaTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCDATemplate_TemplateId() {
		return (EAttribute) cdaTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getClassValidation() {
		return classValidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getClassValidation_Base_Class() {
		return (EReference) classValidationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodegenSupport() {
		return codegenSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodegenSupport_Base_Namespace() {
		return (EReference) codegenSupportEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCodegenSupport_BasePackage() {
		return (EAttribute) codegenSupportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCodegenSupport_NsPrefix() {
		return (EAttribute) codegenSupportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCodegenSupport_NsURI() {
		return (EAttribute) codegenSupportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCodegenSupport_PackageName() {
		return (EAttribute) codegenSupportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCodegenSupport_Prefix() {
		return (EAttribute) codegenSupportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodeSystemConstraint() {
		return codeSystemConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getConceptDomainConstraint() {
		return conceptDomainConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getConformsTo() {
		return conformsToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getConformsTo_Base_Generalization() {
		return (EReference) conformsToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getConformsTo_RequiresParentId() {
		return (EAttribute) conformsToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getConstraintValidation() {
		return constraintValidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getConstraintValidation_Base_Constraint() {
		return (EReference) constraintValidationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getConstraintValidation_EnabledDitaForConstraints() {
		return (EAttribute) constraintValidationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntry() {
		return entryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntry_TypeCode() {
		return (EAttribute) entryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getEntryKind() {
		return entryKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getValidationKind() {
		return validationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntryRelationship() {
		return entryRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntryRelationship_TypeCode() {
		return (EAttribute) entryRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getEntryRelationshipKind() {
		return entryRelationshipKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNullFlavor() {
		return nullFlavorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getNullFlavor_NullFlavor() {
		return (EAttribute) nullFlavorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getNullFlavorKind() {
		return nullFlavorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getLogicalOperator() {
		return logicalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getParticipation() {
		return participationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getParticipation_AssociationType() {
		return (EReference) participationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getParticipation_Base_Association() {
		return (EReference) participationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getParticipation_TypeCode() {
		return (EReference) participationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLogicalConstraint() {
		return logicalConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLogicalConstraint_Operation() {
		return (EAttribute) logicalConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getInline() {
		return inlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getInline_Base_Class() {
		return (EReference) inlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getInline_Filter() {
		return (EAttribute) inlineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getInline_PublishSeperately() {
		return (EAttribute) inlineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUnimplementable() {
		return unimplementableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUnimplementable_Base_Constraint() {
		return (EReference) unimplementableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPropertyValidation() {
		return propertyValidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPropertyValidation_Base_Property() {
		return (EReference) propertyValidationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getSeverityKind() {
		return severityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTextValue() {
		return textValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTextValue_IgnoreCase() {
		return (EAttribute) textValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTextValue_Value() {
		return (EAttribute) textValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValidation() {
		return validationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValidation_Mandatory() {
		return (EAttribute) validationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValidation_Kind() {
		return (EAttribute) validationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValidation_Strict() {
		return (EAttribute) validationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValidation_NegationIndicator() {
		return (EAttribute) validationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValidation_Message() {
		return (EAttribute) validationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValidation_RuleId() {
		return (EAttribute) validationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValidation_Severity() {
		return (EAttribute) validationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValueSetConstraint() {
		return valueSetConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getVocabSpecification() {
		return vocabSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVocabSpecification_Code() {
		return (EAttribute) vocabSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVocabSpecification_CodeSystem() {
		return (EAttribute) vocabSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVocabSpecification_CodeSystemName() {
		return (EAttribute) vocabSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVocabSpecification_CodeSystemVersion() {
		return (EAttribute) vocabSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVocabSpecification_DisplayName() {
		return (EAttribute) vocabSpecificationEClass.getEStructuralFeatures().get(4);
	}

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
		UMLPackage theUMLPackage = (UMLPackage) EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		TermPackage theTermPackage = (TermPackage) EPackage.Registry.INSTANCE.getEPackage(TermPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entryEClass.getESuperTypes().add(this.getAssociationValidation());
		associationValidationEClass.getESuperTypes().add(this.getValidation());
		entryRelationshipEClass.getESuperTypes().add(this.getAssociationValidation());
		propertyValidationEClass.getESuperTypes().add(this.getValidation());
		classValidationEClass.getESuperTypes().add(this.getValidation());
		vocabSpecificationEClass.getESuperTypes().add(this.getPropertyValidation());
		nullFlavorEClass.getESuperTypes().add(this.getPropertyValidation());
		textValueEClass.getESuperTypes().add(this.getPropertyValidation());
		cdaTemplateEClass.getESuperTypes().add(this.getClassValidation());
		constraintValidationEClass.getESuperTypes().add(this.getValidation());
		conformsToEClass.getESuperTypes().add(this.getValidation());
		conceptDomainConstraintEClass.getESuperTypes().add(this.getValidation());
		conceptDomainConstraintEClass.getESuperTypes().add(theTermPackage.getConceptDomainConstraint());
		codeSystemConstraintEClass.getESuperTypes().add(theTermPackage.getCodeSystemConstraint());
		codeSystemConstraintEClass.getESuperTypes().add(this.getValidation());
		valueSetConstraintEClass.getESuperTypes().add(this.getValidation());
		valueSetConstraintEClass.getESuperTypes().add(theTermPackage.getValueSetConstraint());
		logicalConstraintEClass.getESuperTypes().add(this.getConstraintValidation());

		// Initialize classes and features; add operations and parameters
		initEClass(entryEClass, Entry.class, "Entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getEntry_TypeCode(), this.getEntryKind(), "typeCode", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			associationValidationEClass, AssociationValidation.class, "AssociationValidation", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getAssociationValidation_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association",
			null, 1, 1, AssociationValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			validationEClass, Validation.class, "Validation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getValidation_Message(), theTypesPackage.getString(), "message", null, 0, 1, Validation.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValidation_Severity(), this.getSeverityKind(), "severity", null, 0, 1, Validation.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValidation_RuleId(), theTypesPackage.getString(), "ruleId", null, 0, -1, Validation.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValidation_Mandatory(), theTypesPackage.getBoolean(), "mandatory", "false", 0, 1, Validation.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValidation_Kind(), this.getValidationKind(), "kind", "OPEN", 0, 1, Validation.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValidation_Strict(), theTypesPackage.getBoolean(), "strict", "false", 0, 1, Validation.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValidation_NegationIndicator(), theTypesPackage.getBoolean(), "negationIndicator", "false", 0, 1,
			Validation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);

		initEClass(
			entryRelationshipEClass, EntryRelationship.class, "EntryRelationship", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getEntryRelationship_TypeCode(), this.getEntryRelationshipKind(), "typeCode", null, 0, 1,
			EntryRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);

		initEClass(
			codegenSupportEClass, CodegenSupport.class, "CodegenSupport", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getCodegenSupport_BasePackage(), theTypesPackage.getString(), "basePackage", null, 0, 1,
			CodegenSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCodegenSupport_NsPrefix(), theTypesPackage.getString(), "nsPrefix", null, 0, 1, CodegenSupport.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCodegenSupport_NsURI(), theTypesPackage.getString(), "nsURI", null, 0, 1, CodegenSupport.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCodegenSupport_PackageName(), theTypesPackage.getString(), "packageName", null, 0, 1,
			CodegenSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCodegenSupport_Prefix(), theTypesPackage.getString(), "prefix", null, 0, 1, CodegenSupport.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getCodegenSupport_Base_Namespace(), theUMLPackage.getNamespace(), null, "base_Namespace", null, 1, 1,
			CodegenSupport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			propertyValidationEClass, PropertyValidation.class, "PropertyValidation", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getPropertyValidation_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1,
			PropertyValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			classValidationEClass, ClassValidation.class, "ClassValidation", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getClassValidation_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1,
			ClassValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			vocabSpecificationEClass, VocabSpecification.class, "VocabSpecification", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getVocabSpecification_Code(), theTypesPackage.getString(), "code", null, 0, 1, VocabSpecification.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getVocabSpecification_CodeSystem(), theTypesPackage.getString(), "codeSystem", null, 0, 1,
			VocabSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getVocabSpecification_CodeSystemName(), theTypesPackage.getString(), "codeSystemName", null, 0, 1,
			VocabSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getVocabSpecification_CodeSystemVersion(), theTypesPackage.getString(), "codeSystemVersion", null, 0, 1,
			VocabSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getVocabSpecification_DisplayName(), theTypesPackage.getString(), "displayName", null, 0, 1,
			VocabSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);

		initEClass(
			nullFlavorEClass, NullFlavor.class, "NullFlavor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getNullFlavor_NullFlavor(), this.getNullFlavorKind(), "nullFlavor", null, 0, 1, NullFlavor.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			textValueEClass, TextValue.class, "TextValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getTextValue_Value(), theTypesPackage.getString(), "value", null, 0, 1, TextValue.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getTextValue_IgnoreCase(), theTypesPackage.getBoolean(), "ignoreCase", "false", 0, 1, TextValue.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			cdaTemplateEClass, CDATemplate.class, "CDATemplate", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getCDATemplate_TemplateId(), theTypesPackage.getString(), "templateId", null, 0, 1, CDATemplate.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCDATemplate_AssigningAuthorityName(), theTypesPackage.getString(), "assigningAuthorityName", null, 0, 1,
			CDATemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCDATemplate_ContextDependent(), theTypesPackage.getBoolean(), "contextDependent", "false", 0, 1,
			CDATemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCDATemplate_TemplateVersion(), theTypesPackage.getString(), "templateVersion", null, 0, 1,
			CDATemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCDATemplate_TemplateMultiplicity(), theTypesPackage.getString(), "templateMultiplicity", null, 0, 1,
			CDATemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);

		initEClass(
			constraintValidationEClass, ConstraintValidation.class, "ConstraintValidation", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getConstraintValidation_Base_Constraint(), theUMLPackage.getConstraint(), null, "base_Constraint", null, 1,
			1, ConstraintValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getConstraintValidation_EnabledDitaForConstraints(), theTypesPackage.getBoolean(),
			"enabledDitaForConstraints", "false", 0, 1, ConstraintValidation.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			conformsToEClass, ConformsTo.class, "ConformsTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getConformsTo_Base_Generalization(), theUMLPackage.getGeneralization(), null, "base_Generalization", null,
			1, 1, ConformsTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getConformsTo_RequiresParentId(), theTypesPackage.getBoolean(), "requiresParentId", "false", 0, 1,
			ConformsTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);

		initEClass(
			conceptDomainConstraintEClass, ConceptDomainConstraint.class, "ConceptDomainConstraint", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			codeSystemConstraintEClass, CodeSystemConstraint.class, "CodeSystemConstraint", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			valueSetConstraintEClass, ValueSetConstraint.class, "ValueSetConstraint", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			actRelationshipEClass, ActRelationship.class, "ActRelationship", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getActRelationship_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1,
			1, ActRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getActRelationship_AssociationType(), theUMLPackage.getClass_(), null, "associationType", null, 0, 1,
			ActRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getActRelationship_TypeCode(), theUMLPackage.getEnumerationLiteral(), null, "typeCode", null, 0, 1,
			ActRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			participationEClass, Participation.class, "Participation", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getParticipation_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1,
			Participation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getParticipation_AssociationType(), theUMLPackage.getClass_(), null, "associationType", null, 0, 1,
			Participation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getParticipation_TypeCode(), theUMLPackage.getEnumerationLiteral(), null, "typeCode", null, 0, 1,
			Participation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			logicalConstraintEClass, LogicalConstraint.class, "LogicalConstraint", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getLogicalConstraint_Operation(), this.getLogicalOperator(), "operation", null, 1, 1,
			LogicalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);

		initEClass(inlineEClass, Inline.class, "Inline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getInline_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, Inline.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getInline_Filter(), theTypesPackage.getString(), "filter", null, 0, 1, Inline.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getInline_PublishSeperately(), theTypesPackage.getBoolean(), "publishSeperately", null, 0, 1, Inline.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			unimplementableEClass, Unimplementable.class, "Unimplementable", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getUnimplementable_Base_Constraint(), theUMLPackage.getConstraint(), null, "base_Constraint", null, 1, 1,
			Unimplementable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(severityKindEEnum, SeverityKind.class, "SeverityKind");
		addEEnumLiteral(severityKindEEnum, SeverityKind.ERROR);
		addEEnumLiteral(severityKindEEnum, SeverityKind.WARNING);
		addEEnumLiteral(severityKindEEnum, SeverityKind.INFO);

		initEEnum(entryKindEEnum, EntryKind.class, "EntryKind");
		addEEnumLiteral(entryKindEEnum, EntryKind.COMP);
		addEEnumLiteral(entryKindEEnum, EntryKind.DRIV);

		initEEnum(validationKindEEnum, ValidationKind.class, "ValidationKind");
		addEEnumLiteral(validationKindEEnum, ValidationKind.OPEN);
		addEEnumLiteral(validationKindEEnum, ValidationKind.CLOSED);

		initEEnum(entryRelationshipKindEEnum, EntryRelationshipKind.class, "EntryRelationshipKind");
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.CAUS);
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.COMP);
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.GEVL);
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.MFST);
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.REFR);
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.RSON);
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.SAS);
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.SPRT);
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.SUBJ);
		addEEnumLiteral(entryRelationshipKindEEnum, EntryRelationshipKind.XCRPT);

		initEEnum(nullFlavorKindEEnum, NullFlavorKind.class, "NullFlavorKind");
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.ASKU);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.MSK);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.NA);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.NASK);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.NAV);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.NI);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.NINF);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.OTH);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.PINF);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.QS);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.TRC);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.UNC);
		addEEnumLiteral(nullFlavorKindEEnum, NullFlavorKind.UNK);

		initEEnum(logicalOperatorEEnum, LogicalOperator.class, "LogicalOperator");
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.AND);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.OR);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.XOR);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.IFTHEN);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.NOTBOTH);

		// Create resource
		createResource(eNS_URI);
	}

} // CDAPackageImpl
