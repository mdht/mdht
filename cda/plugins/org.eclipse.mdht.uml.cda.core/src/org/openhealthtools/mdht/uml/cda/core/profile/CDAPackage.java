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
package org.openhealthtools.mdht.uml.cda.core.profile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.openhealthtools.mdht.uml.term.core.profile.TermPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * org.openhealthtools.mdht.uml.cda.validation.internal.classifiers.OCLConstraintConstraints
 * org.openhealthtools.mdht.uml.cda.validation.internal.classifiers.OCLConstraintConstraints
 * (memberEnd->size() = 2) and
 * -- check for non-null name detects an unresolved proxy
 * memberEnd->forAll(type.oclIsKindOf(uml::Class) and not type.name.oclIsUndefined())
 * org.openhealthtools.mdht.uml.cda.validation.internal.packages.PackageImportConstraints
 * org.openhealthtools.mdht.uml.cda.validation.internal.packages.PackageImportConstraints
 * org.openhealthtools.mdht.uml.cda.validation.internal.classifiers.PropertyConstraints
 * org.openhealthtools.mdht.uml.cda.validation.internal.properties.SeverityAndCardinalityConstraint
 * org.openhealthtools.mdht.uml.cda.validation.internal.properties.PropertyValidation
 * <!-- end-model-doc -->
 * 
 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAFactory
 * @model kind="package"
 * @generated
 */
public interface CDAPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.EntryImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Type Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTRY__TYPE_CODE = eINSTANCE.getEntry_TypeCode();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.AssociationValidationImpl
		 * <em>Association Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.AssociationValidationImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getAssociationValidation()
		 * @generated
		 */
		EClass ASSOCIATION_VALIDATION = eINSTANCE.getAssociationValidation();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION_VALIDATION__BASE_ASSOCIATION = eINSTANCE.getAssociationValidation_Base_Association();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ValidationImpl <em>Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.ValidationImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getValidation()
		 * @generated
		 */
		EClass VALIDATION = eINSTANCE.getValidation();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALIDATION__MESSAGE = eINSTANCE.getValidation_Message();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALIDATION__SEVERITY = eINSTANCE.getValidation_Severity();

		/**
		 * The meta object literal for the '<em><b>Rule Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALIDATION__RULE_ID = eINSTANCE.getValidation_RuleId();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALIDATION__MANDATORY = eINSTANCE.getValidation_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALIDATION__KIND = eINSTANCE.getValidation_Kind();

		/**
		 * The meta object literal for the '<em><b>Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALIDATION__STRICT = eINSTANCE.getValidation_Strict();

		/**
		 * The meta object literal for the '<em><b>Negation Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALIDATION__NEGATION_INDICATOR = eINSTANCE.getValidation_NegationIndicator();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.EntryRelationshipImpl
		 * <em>Entry Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.EntryRelationshipImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getEntryRelationship()
		 * @generated
		 */
		EClass ENTRY_RELATIONSHIP = eINSTANCE.getEntryRelationship();

		/**
		 * The meta object literal for the '<em><b>Type Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ENTRY_RELATIONSHIP__TYPE_CODE = eINSTANCE.getEntryRelationship_TypeCode();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodegenSupportImpl <em>Codegen Support</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CodegenSupportImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getCodegenSupport()
		 * @generated
		 */
		EClass CODEGEN_SUPPORT = eINSTANCE.getCodegenSupport();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODEGEN_SUPPORT__BASE_PACKAGE = eINSTANCE.getCodegenSupport_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Ns Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODEGEN_SUPPORT__NS_PREFIX = eINSTANCE.getCodegenSupport_NsPrefix();

		/**
		 * The meta object literal for the '<em><b>Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODEGEN_SUPPORT__NS_URI = eINSTANCE.getCodegenSupport_NsURI();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODEGEN_SUPPORT__PACKAGE_NAME = eINSTANCE.getCodegenSupport_PackageName();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODEGEN_SUPPORT__PREFIX = eINSTANCE.getCodegenSupport_Prefix();

		/**
		 * The meta object literal for the '<em><b>Base Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CODEGEN_SUPPORT__BASE_NAMESPACE = eINSTANCE.getCodegenSupport_Base_Namespace();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.PropertyValidationImpl
		 * <em>Property Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.PropertyValidationImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getPropertyValidation()
		 * @generated
		 */
		EClass PROPERTY_VALIDATION = eINSTANCE.getPropertyValidation();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROPERTY_VALIDATION__BASE_PROPERTY = eINSTANCE.getPropertyValidation_Base_Property();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ClassValidationImpl <em>Class Validation</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.ClassValidationImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getClassValidation()
		 * @generated
		 */
		EClass CLASS_VALIDATION = eINSTANCE.getClassValidation();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASS_VALIDATION__BASE_CLASS = eINSTANCE.getClassValidation_Base_Class();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.VocabSpecificationImpl
		 * <em>Vocab Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.VocabSpecificationImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getVocabSpecification()
		 * @generated
		 */
		EClass VOCAB_SPECIFICATION = eINSTANCE.getVocabSpecification();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VOCAB_SPECIFICATION__CODE = eINSTANCE.getVocabSpecification_Code();

		/**
		 * The meta object literal for the '<em><b>Code System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VOCAB_SPECIFICATION__CODE_SYSTEM = eINSTANCE.getVocabSpecification_CodeSystem();

		/**
		 * The meta object literal for the '<em><b>Code System Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VOCAB_SPECIFICATION__CODE_SYSTEM_NAME = eINSTANCE.getVocabSpecification_CodeSystemName();

		/**
		 * The meta object literal for the '<em><b>Code System Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VOCAB_SPECIFICATION__CODE_SYSTEM_VERSION = eINSTANCE.getVocabSpecification_CodeSystemVersion();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VOCAB_SPECIFICATION__DISPLAY_NAME = eINSTANCE.getVocabSpecification_DisplayName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.NullFlavorImpl <em>Null Flavor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.NullFlavorImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getNullFlavor()
		 * @generated
		 */
		EClass NULL_FLAVOR = eINSTANCE.getNullFlavor();

		/**
		 * The meta object literal for the '<em><b>Null Flavor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NULL_FLAVOR__NULL_FLAVOR = eINSTANCE.getNullFlavor_NullFlavor();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.TextValueImpl <em>Text Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.TextValueImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getTextValue()
		 * @generated
		 */
		EClass TEXT_VALUE = eINSTANCE.getTextValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TEXT_VALUE__VALUE = eINSTANCE.getTextValue_Value();

		/**
		 * The meta object literal for the '<em><b>Ignore Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TEXT_VALUE__IGNORE_CASE = eINSTANCE.getTextValue_IgnoreCase();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CDATemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDATemplateImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getCDATemplate()
		 * @generated
		 */
		EClass CDA_TEMPLATE = eINSTANCE.getCDATemplate();

		/**
		 * The meta object literal for the '<em><b>Template Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CDA_TEMPLATE__TEMPLATE_ID = eINSTANCE.getCDATemplate_TemplateId();

		/**
		 * The meta object literal for the '<em><b>Assigning Authority Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CDA_TEMPLATE__ASSIGNING_AUTHORITY_NAME = eINSTANCE.getCDATemplate_AssigningAuthorityName();

		/**
		 * The meta object literal for the '<em><b>Context Dependent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CDA_TEMPLATE__CONTEXT_DEPENDENT = eINSTANCE.getCDATemplate_ContextDependent();

		/**
		 * The meta object literal for the '<em><b>Template Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CDA_TEMPLATE__TEMPLATE_VERSION = eINSTANCE.getCDATemplate_TemplateVersion();

		/**
		 * The meta object literal for the '<em><b>Template Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CDA_TEMPLATE__TEMPLATE_MULTIPLICITY = eINSTANCE.getCDATemplate_TemplateMultiplicity();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ConstraintValidationImpl
		 * <em>Constraint Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.ConstraintValidationImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getConstraintValidation()
		 * @generated
		 */
		EClass CONSTRAINT_VALIDATION = eINSTANCE.getConstraintValidation();

		/**
		 * The meta object literal for the '<em><b>Base Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONSTRAINT_VALIDATION__BASE_CONSTRAINT = eINSTANCE.getConstraintValidation_Base_Constraint();

		/**
		 * The meta object literal for the '<em><b>Enabled Dita For Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CONSTRAINT_VALIDATION__ENABLED_DITA_FOR_CONSTRAINTS = eINSTANCE.getConstraintValidation_EnabledDitaForConstraints();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ConformsToImpl <em>Conforms To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.ConformsToImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getConformsTo()
		 * @generated
		 */
		EClass CONFORMS_TO = eINSTANCE.getConformsTo();

		/**
		 * The meta object literal for the '<em><b>Base Generalization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONFORMS_TO__BASE_GENERALIZATION = eINSTANCE.getConformsTo_Base_Generalization();

		/**
		 * The meta object literal for the '<em><b>Requires Parent Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CONFORMS_TO__REQUIRES_PARENT_ID = eINSTANCE.getConformsTo_RequiresParentId();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ConceptDomainConstraintImpl
		 * <em>Concept Domain Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.ConceptDomainConstraintImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getConceptDomainConstraint()
		 * @generated
		 */
		EClass CONCEPT_DOMAIN_CONSTRAINT = eINSTANCE.getConceptDomainConstraint();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodeSystemConstraintImpl
		 * <em>Code System Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CodeSystemConstraintImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getCodeSystemConstraint()
		 * @generated
		 */
		EClass CODE_SYSTEM_CONSTRAINT = eINSTANCE.getCodeSystemConstraint();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ValueSetConstraintImpl
		 * <em>Value Set Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.ValueSetConstraintImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getValueSetConstraint()
		 * @generated
		 */
		EClass VALUE_SET_CONSTRAINT = eINSTANCE.getValueSetConstraint();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ActRelationshipImpl <em>Act Relationship</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.ActRelationshipImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getActRelationship()
		 * @generated
		 */
		EClass ACT_RELATIONSHIP = eINSTANCE.getActRelationship();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACT_RELATIONSHIP__BASE_ASSOCIATION = eINSTANCE.getActRelationship_Base_Association();

		/**
		 * The meta object literal for the '<em><b>Association Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACT_RELATIONSHIP__ASSOCIATION_TYPE = eINSTANCE.getActRelationship_AssociationType();

		/**
		 * The meta object literal for the '<em><b>Type Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACT_RELATIONSHIP__TYPE_CODE = eINSTANCE.getActRelationship_TypeCode();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ParticipationImpl <em>Participation</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.ParticipationImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getParticipation()
		 * @generated
		 */
		EClass PARTICIPATION = eINSTANCE.getParticipation();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PARTICIPATION__BASE_ASSOCIATION = eINSTANCE.getParticipation_Base_Association();

		/**
		 * The meta object literal for the '<em><b>Association Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PARTICIPATION__ASSOCIATION_TYPE = eINSTANCE.getParticipation_AssociationType();

		/**
		 * The meta object literal for the '<em><b>Type Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PARTICIPATION__TYPE_CODE = eINSTANCE.getParticipation_TypeCode();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.LogicalConstraintImpl
		 * <em>Logical Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.LogicalConstraintImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getLogicalConstraint()
		 * @generated
		 */
		EClass LOGICAL_CONSTRAINT = eINSTANCE.getLogicalConstraint();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LOGICAL_CONSTRAINT__OPERATION = eINSTANCE.getLogicalConstraint_Operation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.InlineImpl <em>Inline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.InlineImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getInline()
		 * @generated
		 */
		EClass INLINE = eINSTANCE.getInline();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INLINE__BASE_CLASS = eINSTANCE.getInline_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute INLINE__FILTER = eINSTANCE.getInline_Filter();

		/**
		 * The meta object literal for the '<em><b>Publish Seperately</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute INLINE__PUBLISH_SEPERATELY = eINSTANCE.getInline_PublishSeperately();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.UnimplementableImpl <em>Unimplementable</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.UnimplementableImpl
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getUnimplementable()
		 * @generated
		 */
		EClass UNIMPLEMENTABLE = eINSTANCE.getUnimplementable();

		/**
		 * The meta object literal for the '<em><b>Base Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNIMPLEMENTABLE__BASE_CONSTRAINT = eINSTANCE.getUnimplementable_Base_Constraint();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.SeverityKind <em>Severity Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.SeverityKind
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getSeverityKind()
		 * @generated
		 */
		EEnum SEVERITY_KIND = eINSTANCE.getSeverityKind();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.EntryKind <em>Entry Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.EntryKind
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getEntryKind()
		 * @generated
		 */
		EEnum ENTRY_KIND = eINSTANCE.getEntryKind();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.ValidationKind <em>Validation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.ValidationKind
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getValidationKind()
		 * @generated
		 */
		EEnum VALIDATION_KIND = eINSTANCE.getValidationKind();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.EntryRelationshipKind
		 * <em>Entry Relationship Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.EntryRelationshipKind
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getEntryRelationshipKind()
		 * @generated
		 */
		EEnum ENTRY_RELATIONSHIP_KIND = eINSTANCE.getEntryRelationshipKind();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.NullFlavorKind <em>Null Flavor Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.NullFlavorKind
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getNullFlavorKind()
		 * @generated
		 */
		EEnum NULL_FLAVOR_KIND = eINSTANCE.getNullFlavorKind();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.LogicalOperator <em>Logical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.LogicalOperator
		 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

	}

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "profile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.openhealthtools.org/mdht/schemas/cda/4";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "CDA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	CDAPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ValidationImpl <em>Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.ValidationImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getValidation()
	 * @generated
	 */
	int VALIDATION = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION__SEVERITY = 1;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION__RULE_ID = 2;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION__MANDATORY = 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION__KIND = 4;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION__STRICT = 5;

	/**
	 * The feature id for the '<em><b>Negation Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION__NEGATION_INDICATOR = 6;

	/**
	 * The number of structural features of the '<em>Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.AssociationValidationImpl
	 * <em>Association Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.AssociationValidationImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getAssociationValidation()
	 * @generated
	 */
	int ASSOCIATION_VALIDATION = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VALIDATION__MESSAGE = VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VALIDATION__SEVERITY = VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VALIDATION__RULE_ID = VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VALIDATION__MANDATORY = VALIDATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VALIDATION__KIND = VALIDATION__KIND;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VALIDATION__STRICT = VALIDATION__STRICT;

	/**
	 * The feature id for the '<em><b>Negation Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VALIDATION__NEGATION_INDICATOR = VALIDATION__NEGATION_INDICATOR;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VALIDATION__BASE_ASSOCIATION = VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VALIDATION_FEATURE_COUNT = VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.EntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY__MESSAGE = ASSOCIATION_VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY__SEVERITY = ASSOCIATION_VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY__RULE_ID = ASSOCIATION_VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY__MANDATORY = ASSOCIATION_VALIDATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY__KIND = ASSOCIATION_VALIDATION__KIND;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY__STRICT = ASSOCIATION_VALIDATION__STRICT;

	/**
	 * The feature id for the '<em><b>Negation Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY__NEGATION_INDICATOR = ASSOCIATION_VALIDATION__NEGATION_INDICATOR;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY__BASE_ASSOCIATION = ASSOCIATION_VALIDATION__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY__TYPE_CODE = ASSOCIATION_VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = ASSOCIATION_VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.EntryRelationshipImpl <em>Entry Relationship</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.EntryRelationshipImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getEntryRelationship()
	 * @generated
	 */
	int ENTRY_RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__MESSAGE = ASSOCIATION_VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__SEVERITY = ASSOCIATION_VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__RULE_ID = ASSOCIATION_VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__MANDATORY = ASSOCIATION_VALIDATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__KIND = ASSOCIATION_VALIDATION__KIND;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__STRICT = ASSOCIATION_VALIDATION__STRICT;

	/**
	 * The feature id for the '<em><b>Negation Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__NEGATION_INDICATOR = ASSOCIATION_VALIDATION__NEGATION_INDICATOR;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__BASE_ASSOCIATION = ASSOCIATION_VALIDATION__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP__TYPE_CODE = ASSOCIATION_VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_RELATIONSHIP_FEATURE_COUNT = ASSOCIATION_VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodegenSupportImpl <em>Codegen Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CodegenSupportImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getCodegenSupport()
	 * @generated
	 */
	int CODEGEN_SUPPORT = 4;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODEGEN_SUPPORT__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODEGEN_SUPPORT__NS_PREFIX = 1;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODEGEN_SUPPORT__NS_URI = 2;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODEGEN_SUPPORT__PACKAGE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODEGEN_SUPPORT__PREFIX = 4;

	/**
	 * The feature id for the '<em><b>Base Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODEGEN_SUPPORT__BASE_NAMESPACE = 5;

	/**
	 * The number of structural features of the '<em>Codegen Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODEGEN_SUPPORT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.PropertyValidationImpl <em>Property Validation</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.PropertyValidationImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getPropertyValidation()
	 * @generated
	 */
	int PROPERTY_VALIDATION = 5;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALIDATION__MESSAGE = VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALIDATION__SEVERITY = VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALIDATION__RULE_ID = VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALIDATION__MANDATORY = VALIDATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALIDATION__KIND = VALIDATION__KIND;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALIDATION__STRICT = VALIDATION__STRICT;

	/**
	 * The feature id for the '<em><b>Negation Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALIDATION__NEGATION_INDICATOR = VALIDATION__NEGATION_INDICATOR;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALIDATION__BASE_PROPERTY = VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALIDATION_FEATURE_COUNT = VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ClassValidationImpl <em>Class Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.ClassValidationImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getClassValidation()
	 * @generated
	 */
	int CLASS_VALIDATION = 6;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_VALIDATION__MESSAGE = VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_VALIDATION__SEVERITY = VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_VALIDATION__RULE_ID = VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_VALIDATION__MANDATORY = VALIDATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_VALIDATION__KIND = VALIDATION__KIND;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_VALIDATION__STRICT = VALIDATION__STRICT;

	/**
	 * The feature id for the '<em><b>Negation Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_VALIDATION__NEGATION_INDICATOR = VALIDATION__NEGATION_INDICATOR;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_VALIDATION__BASE_CLASS = VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_VALIDATION_FEATURE_COUNT = VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.VocabSpecificationImpl <em>Vocab Specification</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.VocabSpecificationImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getVocabSpecification()
	 * @generated
	 */
	int VOCAB_SPECIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__MESSAGE = PROPERTY_VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__SEVERITY = PROPERTY_VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__RULE_ID = PROPERTY_VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__MANDATORY = PROPERTY_VALIDATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__KIND = PROPERTY_VALIDATION__KIND;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__STRICT = PROPERTY_VALIDATION__STRICT;

	/**
	 * The feature id for the '<em><b>Negation Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__NEGATION_INDICATOR = PROPERTY_VALIDATION__NEGATION_INDICATOR;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__BASE_PROPERTY = PROPERTY_VALIDATION__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__CODE = PROPERTY_VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__CODE_SYSTEM = PROPERTY_VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__CODE_SYSTEM_NAME = PROPERTY_VALIDATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__CODE_SYSTEM_VERSION = PROPERTY_VALIDATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION__DISPLAY_NAME = PROPERTY_VALIDATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Vocab Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOCAB_SPECIFICATION_FEATURE_COUNT = PROPERTY_VALIDATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.NullFlavorImpl <em>Null Flavor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.NullFlavorImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getNullFlavor()
	 * @generated
	 */
	int NULL_FLAVOR = 8;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_FLAVOR__MESSAGE = PROPERTY_VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_FLAVOR__SEVERITY = PROPERTY_VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_FLAVOR__RULE_ID = PROPERTY_VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_FLAVOR__MANDATORY = PROPERTY_VALIDATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_FLAVOR__KIND = PROPERTY_VALIDATION__KIND;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_FLAVOR__STRICT = PROPERTY_VALIDATION__STRICT;

	/**
	 * The feature id for the '<em><b>Negation Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_FLAVOR__NEGATION_INDICATOR = PROPERTY_VALIDATION__NEGATION_INDICATOR;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_FLAVOR__BASE_PROPERTY = PROPERTY_VALIDATION__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_FLAVOR__NULL_FLAVOR = PROPERTY_VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Null Flavor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_FLAVOR_FEATURE_COUNT = PROPERTY_VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.TextValueImpl <em>Text Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.TextValueImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getTextValue()
	 * @generated
	 */
	int TEXT_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__MESSAGE = PROPERTY_VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__SEVERITY = PROPERTY_VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__RULE_ID = PROPERTY_VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__MANDATORY = PROPERTY_VALIDATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__KIND = PROPERTY_VALIDATION__KIND;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__STRICT = PROPERTY_VALIDATION__STRICT;

	/**
	 * The feature id for the '<em><b>Negation Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__NEGATION_INDICATOR = PROPERTY_VALIDATION__NEGATION_INDICATOR;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__BASE_PROPERTY = PROPERTY_VALIDATION__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__VALUE = PROPERTY_VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignore Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__IGNORE_CASE = PROPERTY_VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_FEATURE_COUNT = PROPERTY_VALIDATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CDATemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDATemplateImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getCDATemplate()
	 * @generated
	 */
	int CDA_TEMPLATE = 10;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__MESSAGE = CLASS_VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__SEVERITY = CLASS_VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__RULE_ID = CLASS_VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__MANDATORY = CLASS_VALIDATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__KIND = CLASS_VALIDATION__KIND;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__STRICT = CLASS_VALIDATION__STRICT;

	/**
	 * The feature id for the '<em><b>Negation Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__NEGATION_INDICATOR = CLASS_VALIDATION__NEGATION_INDICATOR;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__BASE_CLASS = CLASS_VALIDATION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__TEMPLATE_ID = CLASS_VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assigning Authority Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__ASSIGNING_AUTHORITY_NAME = CLASS_VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__CONTEXT_DEPENDENT = CLASS_VALIDATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Template Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__TEMPLATE_VERSION = CLASS_VALIDATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Template Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE__TEMPLATE_MULTIPLICITY = CLASS_VALIDATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CDA_TEMPLATE_FEATURE_COUNT = CLASS_VALIDATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ConstraintValidationImpl <em>Constraint Validation</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.ConstraintValidationImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getConstraintValidation()
	 * @generated
	 */
	int CONSTRAINT_VALIDATION = 11;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION__MESSAGE = VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION__SEVERITY = VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION__RULE_ID = VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION__MANDATORY = VALIDATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION__KIND = VALIDATION__KIND;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION__STRICT = VALIDATION__STRICT;

	/**
	 * The feature id for the '<em><b>Negation Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION__NEGATION_INDICATOR = VALIDATION__NEGATION_INDICATOR;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION__BASE_CONSTRAINT = VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enabled Dita For Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION__ENABLED_DITA_FOR_CONSTRAINTS = VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constraint Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION_FEATURE_COUNT = VALIDATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ConformsToImpl <em>Conforms To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.ConformsToImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getConformsTo()
	 * @generated
	 */
	int CONFORMS_TO = 12;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONFORMS_TO__MESSAGE = VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONFORMS_TO__SEVERITY = VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONFORMS_TO__RULE_ID = VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONFORMS_TO__MANDATORY = VALIDATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONFORMS_TO__KIND = VALIDATION__KIND;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONFORMS_TO__STRICT = VALIDATION__STRICT;

	/**
	 * The feature id for the '<em><b>Negation Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONFORMS_TO__NEGATION_INDICATOR = VALIDATION__NEGATION_INDICATOR;

	/**
	 * The feature id for the '<em><b>Base Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONFORMS_TO__BASE_GENERALIZATION = VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requires Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONFORMS_TO__REQUIRES_PARENT_ID = VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conforms To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONFORMS_TO_FEATURE_COUNT = VALIDATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ConceptDomainConstraintImpl
	 * <em>Concept Domain Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.ConceptDomainConstraintImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getConceptDomainConstraint()
	 * @generated
	 */
	int CONCEPT_DOMAIN_CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__MESSAGE = VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__SEVERITY = VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__RULE_ID = VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__MANDATORY = VALIDATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__KIND = VALIDATION__KIND;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__STRICT = VALIDATION__STRICT;

	/**
	 * The feature id for the '<em><b>Negation Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__NEGATION_INDICATOR = VALIDATION__NEGATION_INDICATOR;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__REFERENCE = VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__IDENTIFIER = VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__NAME = VALIDATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT__BASE_PROPERTY = VALIDATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Concept Domain Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DOMAIN_CONSTRAINT_FEATURE_COUNT = VALIDATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodeSystemConstraintImpl <em>Code System Constraint</em>}
	 * ' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CodeSystemConstraintImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getCodeSystemConstraint()
	 * @generated
	 */
	int CODE_SYSTEM_CONSTRAINT = 14;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__REFERENCE = TermPackage.CODE_SYSTEM_CONSTRAINT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__IDENTIFIER = TermPackage.CODE_SYSTEM_CONSTRAINT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__NAME = TermPackage.CODE_SYSTEM_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__VERSION = TermPackage.CODE_SYSTEM_CONSTRAINT__VERSION;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__BINDING = TermPackage.CODE_SYSTEM_CONSTRAINT__BINDING;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__CODE = TermPackage.CODE_SYSTEM_CONSTRAINT__CODE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__DISPLAY_NAME = TermPackage.CODE_SYSTEM_CONSTRAINT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__QUALIFIER = TermPackage.CODE_SYSTEM_CONSTRAINT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__BASE_PROPERTY = TermPackage.CODE_SYSTEM_CONSTRAINT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__MESSAGE = TermPackage.CODE_SYSTEM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__SEVERITY = TermPackage.CODE_SYSTEM_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__RULE_ID = TermPackage.CODE_SYSTEM_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__MANDATORY = TermPackage.CODE_SYSTEM_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__KIND = TermPackage.CODE_SYSTEM_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__STRICT = TermPackage.CODE_SYSTEM_CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Negation Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT__NEGATION_INDICATOR = TermPackage.CODE_SYSTEM_CONSTRAINT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Code System Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_CONSTRAINT_FEATURE_COUNT = TermPackage.CODE_SYSTEM_CONSTRAINT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ValueSetConstraintImpl <em>Value Set Constraint</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.ValueSetConstraintImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getValueSetConstraint()
	 * @generated
	 */
	int VALUE_SET_CONSTRAINT = 15;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__MESSAGE = VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__SEVERITY = VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__RULE_ID = VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__MANDATORY = VALIDATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__KIND = VALIDATION__KIND;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__STRICT = VALIDATION__STRICT;

	/**
	 * The feature id for the '<em><b>Negation Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__NEGATION_INDICATOR = VALIDATION__NEGATION_INDICATOR;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__REFERENCE = VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__IDENTIFIER = VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__NAME = VALIDATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__VERSION = VALIDATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__BINDING = VALIDATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT__BASE_PROPERTY = VALIDATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Value Set Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_CONSTRAINT_FEATURE_COUNT = VALIDATION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ActRelationshipImpl <em>Act Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.ActRelationshipImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getActRelationship()
	 * @generated
	 */
	int ACT_RELATIONSHIP = 16;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACT_RELATIONSHIP__BASE_ASSOCIATION = 0;

	/**
	 * The feature id for the '<em><b>Association Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACT_RELATIONSHIP__ASSOCIATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACT_RELATIONSHIP__TYPE_CODE = 2;

	/**
	 * The number of structural features of the '<em>Act Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACT_RELATIONSHIP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ParticipationImpl <em>Participation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.ParticipationImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getParticipation()
	 * @generated
	 */
	int PARTICIPATION = 17;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARTICIPATION__BASE_ASSOCIATION = 0;

	/**
	 * The feature id for the '<em><b>Association Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARTICIPATION__ASSOCIATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARTICIPATION__TYPE_CODE = 2;

	/**
	 * The number of structural features of the '<em>Participation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARTICIPATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.LogicalConstraintImpl <em>Logical Constraint</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.LogicalConstraintImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getLogicalConstraint()
	 * @generated
	 */
	int LOGICAL_CONSTRAINT = 18;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONSTRAINT__MESSAGE = CONSTRAINT_VALIDATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONSTRAINT__SEVERITY = CONSTRAINT_VALIDATION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Rule Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONSTRAINT__RULE_ID = CONSTRAINT_VALIDATION__RULE_ID;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONSTRAINT__MANDATORY = CONSTRAINT_VALIDATION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONSTRAINT__KIND = CONSTRAINT_VALIDATION__KIND;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONSTRAINT__STRICT = CONSTRAINT_VALIDATION__STRICT;

	/**
	 * The feature id for the '<em><b>Negation Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONSTRAINT__NEGATION_INDICATOR = CONSTRAINT_VALIDATION__NEGATION_INDICATOR;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONSTRAINT__BASE_CONSTRAINT = CONSTRAINT_VALIDATION__BASE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Enabled Dita For Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONSTRAINT__ENABLED_DITA_FOR_CONSTRAINTS = CONSTRAINT_VALIDATION__ENABLED_DITA_FOR_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONSTRAINT__OPERATION = CONSTRAINT_VALIDATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logical Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_VALIDATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.InlineImpl <em>Inline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.InlineImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getInline()
	 * @generated
	 */
	int INLINE = 19;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INLINE__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INLINE__FILTER = 1;

	/**
	 * The feature id for the '<em><b>Publish Seperately</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INLINE__PUBLISH_SEPERATELY = 2;

	/**
	 * The number of structural features of the '<em>Inline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INLINE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.UnimplementableImpl <em>Unimplementable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.UnimplementableImpl
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getUnimplementable()
	 * @generated
	 */
	int UNIMPLEMENTABLE = 20;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIMPLEMENTABLE__BASE_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Unimplementable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIMPLEMENTABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.SeverityKind <em>Severity Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.SeverityKind
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getSeverityKind()
	 * @generated
	 */
	int SEVERITY_KIND = 21;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.EntryKind <em>Entry Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.EntryKind
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getEntryKind()
	 * @generated
	 */
	int ENTRY_KIND = 22;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.ValidationKind <em>Validation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ValidationKind
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getValidationKind()
	 * @generated
	 */
	int VALIDATION_KIND = 23;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.EntryRelationshipKind <em>Entry Relationship Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.EntryRelationshipKind
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getEntryRelationshipKind()
	 * @generated
	 */
	int ENTRY_RELATIONSHIP_KIND = 24;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.NullFlavorKind <em>Null Flavor Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.NullFlavorKind
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getNullFlavorKind()
	 * @generated
	 */
	int NULL_FLAVOR_KIND = 25;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.core.profile.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.LogicalOperator
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.impl.CDAPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 26;

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.ActRelationship <em>Act Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Act Relationship</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ActRelationship
	 * @generated
	 */
	EClass getActRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.profile.ActRelationship#getAssociationType
	 * <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Association Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ActRelationship#getAssociationType()
	 * @see #getActRelationship()
	 * @generated
	 */
	EReference getActRelationship_AssociationType();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.profile.ActRelationship#getBase_Association
	 * <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ActRelationship#getBase_Association()
	 * @see #getActRelationship()
	 * @generated
	 */
	EReference getActRelationship_Base_Association();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.profile.ActRelationship#getTypeCode <em>Type Code</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ActRelationship#getTypeCode()
	 * @see #getActRelationship()
	 * @generated
	 */
	EReference getActRelationship_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.AssociationValidation <em>Association Validation</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Association Validation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.AssociationValidation
	 * @generated
	 */
	EClass getAssociationValidation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.profile.AssociationValidation#getBase_Association
	 * <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.AssociationValidation#getBase_Association()
	 * @see #getAssociationValidation()
	 * @generated
	 */
	EReference getAssociationValidation_Base_Association();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CDAFactory getCDAFactory();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Template</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate
	 * @generated
	 */
	EClass getCDATemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#getAssigningAuthorityName
	 * <em>Assigning Authority Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Assigning Authority Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#getAssigningAuthorityName()
	 * @see #getCDATemplate()
	 * @generated
	 */
	EAttribute getCDATemplate_AssigningAuthorityName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#isContextDependent
	 * <em>Context Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Context Dependent</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#isContextDependent()
	 * @see #getCDATemplate()
	 * @generated
	 */
	EAttribute getCDATemplate_ContextDependent();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#getTemplateVersion
	 * <em>Template Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Template Version</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#getTemplateVersion()
	 * @see #getCDATemplate()
	 * @generated
	 */
	EAttribute getCDATemplate_TemplateVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#getTemplateMultiplicity
	 * <em>Template Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Template Multiplicity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#getTemplateMultiplicity()
	 * @see #getCDATemplate()
	 * @generated
	 */
	EAttribute getCDATemplate_TemplateMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#getTemplateId <em>Template Id</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Template Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate#getTemplateId()
	 * @see #getCDATemplate()
	 * @generated
	 */
	EAttribute getCDATemplate_TemplateId();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.ClassValidation <em>Class Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Class Validation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ClassValidation
	 * @generated
	 */
	EClass getClassValidation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.profile.ClassValidation#getBase_Class
	 * <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ClassValidation#getBase_Class()
	 * @see #getClassValidation()
	 * @generated
	 */
	EReference getClassValidation_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport <em>Codegen Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Codegen Support</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport
	 * @generated
	 */
	EClass getCodegenSupport();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getBase_Namespace
	 * <em>Base Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Namespace</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getBase_Namespace()
	 * @see #getCodegenSupport()
	 * @generated
	 */
	EReference getCodegenSupport_Base_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getBasePackage
	 * <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getBasePackage()
	 * @see #getCodegenSupport()
	 * @generated
	 */
	EAttribute getCodegenSupport_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getNsPrefix <em>Ns Prefix</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Ns Prefix</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getNsPrefix()
	 * @see #getCodegenSupport()
	 * @generated
	 */
	EAttribute getCodegenSupport_NsPrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getNsURI <em>Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Ns URI</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getNsURI()
	 * @see #getCodegenSupport()
	 * @generated
	 */
	EAttribute getCodegenSupport_NsURI();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getPackageName
	 * <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getPackageName()
	 * @see #getCodegenSupport()
	 * @generated
	 */
	EAttribute getCodegenSupport_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport#getPrefix()
	 * @see #getCodegenSupport()
	 * @generated
	 */
	EAttribute getCodegenSupport_Prefix();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.CodeSystemConstraint <em>Code System Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Code System Constraint</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.CodeSystemConstraint
	 * @generated
	 */
	EClass getCodeSystemConstraint();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.ConceptDomainConstraint
	 * <em>Concept Domain Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Concept Domain Constraint</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ConceptDomainConstraint
	 * @generated
	 */
	EClass getConceptDomainConstraint();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.ConformsTo <em>Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Conforms To</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ConformsTo
	 * @generated
	 */
	EClass getConformsTo();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.profile.ConformsTo#getBase_Generalization
	 * <em>Base Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Generalization</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ConformsTo#getBase_Generalization()
	 * @see #getConformsTo()
	 * @generated
	 */
	EReference getConformsTo_Base_Generalization();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.ConformsTo#isRequiresParentId
	 * <em>Requires Parent Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Requires Parent Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ConformsTo#isRequiresParentId()
	 * @see #getConformsTo()
	 * @generated
	 */
	EAttribute getConformsTo_RequiresParentId();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.ConstraintValidation <em>Constraint Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Constraint Validation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ConstraintValidation
	 * @generated
	 */
	EClass getConstraintValidation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.profile.ConstraintValidation#getBase_Constraint
	 * <em>Base Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Constraint</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ConstraintValidation#getBase_Constraint()
	 * @see #getConstraintValidation()
	 * @generated
	 */
	EReference getConstraintValidation_Base_Constraint();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.openhealthtools.mdht.uml.cda.core.profile.ConstraintValidation#isEnabledDitaForConstraints <em>Enabled Dita For Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Enabled Dita For Constraints</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ConstraintValidation#isEnabledDitaForConstraints()
	 * @see #getConstraintValidation()
	 * @generated
	 */
	EAttribute getConstraintValidation_EnabledDitaForConstraints();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.Entry#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Entry#getTypeCode()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_TypeCode();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.cda.core.profile.EntryKind <em>Entry Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Entry Kind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.EntryKind
	 * @generated
	 */
	EEnum getEntryKind();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.cda.core.profile.ValidationKind <em>Validation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Validation Kind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ValidationKind
	 * @generated
	 */
	EEnum getValidationKind();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.EntryRelationship <em>Entry Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Entry Relationship</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.EntryRelationship
	 * @generated
	 */
	EClass getEntryRelationship();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.EntryRelationship#getTypeCode
	 * <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.EntryRelationship#getTypeCode()
	 * @see #getEntryRelationship()
	 * @generated
	 */
	EAttribute getEntryRelationship_TypeCode();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.cda.core.profile.EntryRelationshipKind <em>Entry Relationship Kind</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Entry Relationship Kind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.EntryRelationshipKind
	 * @generated
	 */
	EEnum getEntryRelationshipKind();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.NullFlavor <em>Null Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.NullFlavor
	 * @generated
	 */
	EClass getNullFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.NullFlavor#getNullFlavor <em>Null Flavor</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Null Flavor</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.NullFlavor#getNullFlavor()
	 * @see #getNullFlavor()
	 * @generated
	 */
	EAttribute getNullFlavor_NullFlavor();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.cda.core.profile.NullFlavorKind <em>Null Flavor Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Null Flavor Kind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.NullFlavorKind
	 * @generated
	 */
	EEnum getNullFlavorKind();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.cda.core.profile.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Logical Operator</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.LogicalOperator
	 * @generated
	 */
	EEnum getLogicalOperator();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.Participation <em>Participation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Participation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Participation
	 * @generated
	 */
	EClass getParticipation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.profile.Participation#getAssociationType
	 * <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Association Type</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Participation#getAssociationType()
	 * @see #getParticipation()
	 * @generated
	 */
	EReference getParticipation_AssociationType();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.profile.Participation#getBase_Association
	 * <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Participation#getBase_Association()
	 * @see #getParticipation()
	 * @generated
	 */
	EReference getParticipation_Base_Association();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.profile.Participation#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Type Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Participation#getTypeCode()
	 * @see #getParticipation()
	 * @generated
	 */
	EReference getParticipation_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.LogicalConstraint <em>Logical Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Logical Constraint</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.LogicalConstraint
	 * @generated
	 */
	EClass getLogicalConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.LogicalConstraint#getOperation
	 * <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.LogicalConstraint#getOperation()
	 * @see #getLogicalConstraint()
	 * @generated
	 */
	EAttribute getLogicalConstraint_Operation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.Inline <em>Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Inline</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Inline
	 * @generated
	 */
	EClass getInline();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.profile.Inline#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Inline#getBase_Class()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.Inline#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Inline#getFilter()
	 * @see #getInline()
	 * @generated
	 */
	EAttribute getInline_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.Inline#isPublishSeperately
	 * <em>Publish Seperately</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Publish Seperately</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Inline#isPublishSeperately()
	 * @see #getInline()
	 * @generated
	 */
	EAttribute getInline_PublishSeperately();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.Unimplementable <em>Unimplementable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Unimplementable</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Unimplementable
	 * @generated
	 */
	EClass getUnimplementable();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.profile.Unimplementable#getBase_Constraint
	 * <em>Base Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Constraint</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Unimplementable#getBase_Constraint()
	 * @see #getUnimplementable()
	 * @generated
	 */
	EReference getUnimplementable_Base_Constraint();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.PropertyValidation <em>Property Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Property Validation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.PropertyValidation
	 * @generated
	 */
	EClass getPropertyValidation();

	/**
	 * Returns the meta object for the reference '{@link org.openhealthtools.mdht.uml.cda.core.profile.PropertyValidation#getBase_Property
	 * <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.PropertyValidation#getBase_Property()
	 * @see #getPropertyValidation()
	 * @generated
	 */
	EReference getPropertyValidation_Base_Property();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.uml.cda.core.profile.SeverityKind <em>Severity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Severity Kind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.SeverityKind
	 * @generated
	 */
	EEnum getSeverityKind();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.TextValue <em>Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Text Value</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.TextValue
	 * @generated
	 */
	EClass getTextValue();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.TextValue#isIgnoreCase <em>Ignore Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Ignore Case</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.TextValue#isIgnoreCase()
	 * @see #getTextValue()
	 * @generated
	 */
	EAttribute getTextValue_IgnoreCase();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.TextValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.TextValue#getValue()
	 * @see #getTextValue()
	 * @generated
	 */
	EAttribute getTextValue_Value();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.Validation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Validation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Validation
	 * @generated
	 */
	EClass getValidation();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.Validation#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Validation#isMandatory()
	 * @see #getValidation()
	 * @generated
	 */
	EAttribute getValidation_Mandatory();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.Validation#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Validation#getKind()
	 * @see #getValidation()
	 * @generated
	 */
	EAttribute getValidation_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.Validation#isStrict <em>Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Strict</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Validation#isStrict()
	 * @see #getValidation()
	 * @generated
	 */
	EAttribute getValidation_Strict();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.Validation#isNegationIndicator
	 * <em>Negation Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Negation Indicator</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Validation#isNegationIndicator()
	 * @see #getValidation()
	 * @generated
	 */
	EAttribute getValidation_NegationIndicator();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.Validation#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Validation#getMessage()
	 * @see #getValidation()
	 * @generated
	 */
	EAttribute getValidation_Message();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.uml.cda.core.profile.Validation#getRuleId <em>Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Rule Id</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Validation#getRuleId()
	 * @see #getValidation()
	 * @generated
	 */
	EAttribute getValidation_RuleId();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.Validation#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.Validation#getSeverity()
	 * @see #getValidation()
	 * @generated
	 */
	EAttribute getValidation_Severity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.ValueSetConstraint <em>Value Set Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Value Set Constraint</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.ValueSetConstraint
	 * @generated
	 */
	EClass getValueSetConstraint();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.core.profile.VocabSpecification <em>Vocab Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Vocab Specification</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.VocabSpecification
	 * @generated
	 */
	EClass getVocabSpecification();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.VocabSpecification#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.VocabSpecification#getCode()
	 * @see #getVocabSpecification()
	 * @generated
	 */
	EAttribute getVocabSpecification_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.VocabSpecification#getCodeSystem
	 * <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Code System</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.VocabSpecification#getCodeSystem()
	 * @see #getVocabSpecification()
	 * @generated
	 */
	EAttribute getVocabSpecification_CodeSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.VocabSpecification#getCodeSystemName
	 * <em>Code System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Code System Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.VocabSpecification#getCodeSystemName()
	 * @see #getVocabSpecification()
	 * @generated
	 */
	EAttribute getVocabSpecification_CodeSystemName();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.VocabSpecification#getCodeSystemVersion
	 * <em>Code System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Code System Version</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.VocabSpecification#getCodeSystemVersion()
	 * @see #getVocabSpecification()
	 * @generated
	 */
	EAttribute getVocabSpecification_CodeSystemVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.uml.cda.core.profile.VocabSpecification#getDisplayName
	 * <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.core.profile.VocabSpecification#getDisplayName()
	 * @see #getVocabSpecification()
	 * @generated
	 */
	EAttribute getVocabSpecification_DisplayName();

} // CDAPackage
