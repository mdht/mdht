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
package org.eclipse.mdht.uml.cda.core.profile.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.mdht.uml.cda.core.profile.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CDAFactoryImpl extends EFactoryImpl implements CDAFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CDAPackage getPackage() {
		return CDAPackage.eINSTANCE;
	}

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static CDAFactory init() {
		try {
			CDAFactory theCDAFactory = (CDAFactory) EPackage.Registry.INSTANCE.getEFactory(CDAPackage.eNS_URI);
			if (theCDAFactory != null) {
				return theCDAFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CDAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public CDAFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertEntryKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ValidationKind createValidationKindFromString(EDataType eDataType, String initialValue) {
		ValidationKind result = ValidationKind.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException(
				"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertValidationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertEntryRelationshipKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertNullFlavorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public LogicalOperator createLogicalOperatorFromString(EDataType eDataType, String initialValue) {
		LogicalOperator result = LogicalOperator.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException(
				"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertLogicalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertSeverityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CDAPackage.SEVERITY_KIND:
				return convertSeverityKindToString(eDataType, instanceValue);
			case CDAPackage.ENTRY_KIND:
				return convertEntryKindToString(eDataType, instanceValue);
			case CDAPackage.VALIDATION_KIND:
				return convertValidationKindToString(eDataType, instanceValue);
			case CDAPackage.ENTRY_RELATIONSHIP_KIND:
				return convertEntryRelationshipKindToString(eDataType, instanceValue);
			case CDAPackage.NULL_FLAVOR_KIND:
				return convertNullFlavorKindToString(eDataType, instanceValue);
			case CDAPackage.LOGICAL_OPERATOR:
				return convertLogicalOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException(
					"The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CDAPackage.ENTRY:
				return createEntry();
			case CDAPackage.ASSOCIATION_VALIDATION:
				return createAssociationValidation();
			case CDAPackage.ENTRY_RELATIONSHIP:
				return createEntryRelationship();
			case CDAPackage.CODEGEN_SUPPORT:
				return createCodegenSupport();
			case CDAPackage.PROPERTY_VALIDATION:
				return createPropertyValidation();
			case CDAPackage.CLASS_VALIDATION:
				return createClassValidation();
			case CDAPackage.VOCAB_SPECIFICATION:
				return createVocabSpecification();
			case CDAPackage.NULL_FLAVOR:
				return createNullFlavor();
			case CDAPackage.TEXT_VALUE:
				return createTextValue();
			case CDAPackage.CDA_TEMPLATE:
				return createCDATemplate();
			case CDAPackage.CONSTRAINT_VALIDATION:
				return createConstraintValidation();
			case CDAPackage.CONFORMS_TO:
				return createConformsTo();
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT:
				return createConceptDomainConstraint();
			case CDAPackage.CODE_SYSTEM_CONSTRAINT:
				return createCodeSystemConstraint();
			case CDAPackage.VALUE_SET_CONSTRAINT:
				return createValueSetConstraint();
			case CDAPackage.ACT_RELATIONSHIP:
				return createActRelationship();
			case CDAPackage.PARTICIPATION:
				return createParticipation();
			case CDAPackage.LOGICAL_CONSTRAINT:
				return createLogicalConstraint();
			case CDAPackage.INLINE:
				return createInline();
			case CDAPackage.UNIMPLEMENTABLE:
				return createUnimplementable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ActRelationship createActRelationship() {
		ActRelationshipImpl actRelationship = new ActRelationshipImpl();
		return actRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public AssociationValidation createAssociationValidation() {
		AssociationValidationImpl associationValidation = new AssociationValidationImpl();
		return associationValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public CDATemplate createCDATemplate() {
		CDATemplateImpl cdaTemplate = new CDATemplateImpl();
		return cdaTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ClassValidation createClassValidation() {
		ClassValidationImpl classValidation = new ClassValidationImpl();
		return classValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public CodegenSupport createCodegenSupport() {
		CodegenSupportImpl codegenSupport = new CodegenSupportImpl();
		return codegenSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public CodeSystemConstraint createCodeSystemConstraint() {
		CodeSystemConstraintImpl codeSystemConstraint = new CodeSystemConstraintImpl();
		return codeSystemConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ConceptDomainConstraint createConceptDomainConstraint() {
		ConceptDomainConstraintImpl conceptDomainConstraint = new ConceptDomainConstraintImpl();
		return conceptDomainConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ConformsTo createConformsTo() {
		ConformsToImpl conformsTo = new ConformsToImpl();
		return conformsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ConstraintValidation createConstraintValidation() {
		ConstraintValidationImpl constraintValidation = new ConstraintValidationImpl();
		return constraintValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Entry createEntry() {
		EntryImpl entry = new EntryImpl();
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EntryKind createEntryKindFromString(EDataType eDataType, String initialValue) {
		EntryKind result = EntryKind.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException(
				"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EntryRelationship createEntryRelationship() {
		EntryRelationshipImpl entryRelationship = new EntryRelationshipImpl();
		return entryRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EntryRelationshipKind createEntryRelationshipKindFromString(EDataType eDataType, String initialValue) {
		EntryRelationshipKind result = EntryRelationshipKind.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException(
				"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CDAPackage.SEVERITY_KIND:
				return createSeverityKindFromString(eDataType, initialValue);
			case CDAPackage.ENTRY_KIND:
				return createEntryKindFromString(eDataType, initialValue);
			case CDAPackage.VALIDATION_KIND:
				return createValidationKindFromString(eDataType, initialValue);
			case CDAPackage.ENTRY_RELATIONSHIP_KIND:
				return createEntryRelationshipKindFromString(eDataType, initialValue);
			case CDAPackage.NULL_FLAVOR_KIND:
				return createNullFlavorKindFromString(eDataType, initialValue);
			case CDAPackage.LOGICAL_OPERATOR:
				return createLogicalOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException(
					"The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NullFlavor createNullFlavor() {
		NullFlavorImpl nullFlavor = new NullFlavorImpl();
		return nullFlavor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NullFlavorKind createNullFlavorKindFromString(EDataType eDataType, String initialValue) {
		NullFlavorKind result = NullFlavorKind.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException(
				"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Participation createParticipation() {
		ParticipationImpl participation = new ParticipationImpl();
		return participation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public LogicalConstraint createLogicalConstraint() {
		LogicalConstraintImpl logicalConstraint = new LogicalConstraintImpl();
		return logicalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Inline createInline() {
		InlineImpl inline = new InlineImpl();
		return inline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Unimplementable createUnimplementable() {
		UnimplementableImpl unimplementable = new UnimplementableImpl();
		return unimplementable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public PropertyValidation createPropertyValidation() {
		PropertyValidationImpl propertyValidation = new PropertyValidationImpl();
		return propertyValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public SeverityKind createSeverityKindFromString(EDataType eDataType, String initialValue) {
		SeverityKind result = SeverityKind.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException(
				"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public TextValue createTextValue() {
		TextValueImpl textValue = new TextValueImpl();
		return textValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ValueSetConstraint createValueSetConstraint() {
		ValueSetConstraintImpl valueSetConstraint = new ValueSetConstraintImpl();
		return valueSetConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public VocabSpecification createVocabSpecification() {
		VocabSpecificationImpl vocabSpecification = new VocabSpecificationImpl();
		return vocabSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public CDAPackage getCDAPackage() {
		return (CDAPackage) getEPackage();
	}

} // CDAFactoryImpl
