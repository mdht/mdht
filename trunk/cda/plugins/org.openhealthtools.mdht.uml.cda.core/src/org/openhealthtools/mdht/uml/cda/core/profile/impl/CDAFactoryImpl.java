/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.profile.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
//import org.openhealthtools.mdht.uml.cda.core.profile.*;
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
import org.openhealthtools.mdht.uml.cda.core.profile.NullFlavor;
import org.openhealthtools.mdht.uml.cda.core.profile.NullFlavorKind;
import org.openhealthtools.mdht.uml.cda.core.profile.Participation;
import org.openhealthtools.mdht.uml.cda.core.profile.PropertyValidation;
import org.openhealthtools.mdht.uml.cda.core.profile.SeverityKind;
import org.openhealthtools.mdht.uml.cda.core.profile.TextValue;
import org.openhealthtools.mdht.uml.cda.core.profile.ValueSetConstraint;
import org.openhealthtools.mdht.uml.cda.core.profile.VocabSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDAFactoryImpl extends EFactoryImpl implements CDAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CDAFactory init() {
		try {
			CDAFactory theCDAFactory = (CDAFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/schemas/cda/5"); 
			if (theCDAFactory != null) {
				return theCDAFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CDAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDAFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CDAPackage.ENTRY: return createEntry();
			case CDAPackage.ASSOCIATION_VALIDATION: return createAssociationValidation();
			case CDAPackage.ENTRY_RELATIONSHIP: return createEntryRelationship();
			case CDAPackage.CODEGEN_SUPPORT: return createCodegenSupport();
			case CDAPackage.PROPERTY_VALIDATION: return createPropertyValidation();
			case CDAPackage.CLASS_VALIDATION: return createClassValidation();
			case CDAPackage.VOCAB_SPECIFICATION: return createVocabSpecification();
			case CDAPackage.NULL_FLAVOR: return createNullFlavor();
			case CDAPackage.TEXT_VALUE: return createTextValue();
			case CDAPackage.CDA_TEMPLATE: return createCDATemplate();
			case CDAPackage.CONSTRAINT_VALIDATION: return createConstraintValidation();
			case CDAPackage.CONFORMS_TO: return createConformsTo();
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT: return createConceptDomainConstraint();
			case CDAPackage.CODE_SYSTEM_CONSTRAINT: return createCodeSystemConstraint();
			case CDAPackage.VALUE_SET_CONSTRAINT: return createValueSetConstraint();
			case CDAPackage.ACT_RELATIONSHIP: return createActRelationship();
			case CDAPackage.PARTICIPATION: return createParticipation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CDAPackage.SEVERITY_KIND:
				return createSeverityKindFromString(eDataType, initialValue);
			case CDAPackage.ENTRY_KIND:
				return createEntryKindFromString(eDataType, initialValue);
			case CDAPackage.ENTRY_RELATIONSHIP_KIND:
				return createEntryRelationshipKindFromString(eDataType, initialValue);
			case CDAPackage.NULL_FLAVOR_KIND:
				return createNullFlavorKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CDAPackage.SEVERITY_KIND:
				return convertSeverityKindToString(eDataType, instanceValue);
			case CDAPackage.ENTRY_KIND:
				return convertEntryKindToString(eDataType, instanceValue);
			case CDAPackage.ENTRY_RELATIONSHIP_KIND:
				return convertEntryRelationshipKindToString(eDataType, instanceValue);
			case CDAPackage.NULL_FLAVOR_KIND:
				return convertNullFlavorKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entry createEntry() {
		EntryImpl entry = new EntryImpl();
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationValidation createAssociationValidation() {
		AssociationValidationImpl associationValidation = new AssociationValidationImpl();
		return associationValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryRelationship createEntryRelationship() {
		EntryRelationshipImpl entryRelationship = new EntryRelationshipImpl();
		return entryRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodegenSupport createCodegenSupport() {
		CodegenSupportImpl codegenSupport = new CodegenSupportImpl();
		return codegenSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValidation createPropertyValidation() {
		PropertyValidationImpl propertyValidation = new PropertyValidationImpl();
		return propertyValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassValidation createClassValidation() {
		ClassValidationImpl classValidation = new ClassValidationImpl();
		return classValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabSpecification createVocabSpecification() {
		VocabSpecificationImpl vocabSpecification = new VocabSpecificationImpl();
		return vocabSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullFlavor createNullFlavor() {
		NullFlavorImpl nullFlavor = new NullFlavorImpl();
		return nullFlavor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextValue createTextValue() {
		TextValueImpl textValue = new TextValueImpl();
		return textValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDATemplate createCDATemplate() {
		CDATemplateImpl cdaTemplate = new CDATemplateImpl();
		return cdaTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintValidation createConstraintValidation() {
		ConstraintValidationImpl constraintValidation = new ConstraintValidationImpl();
		return constraintValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformsTo createConformsTo() {
		ConformsToImpl conformsTo = new ConformsToImpl();
		return conformsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptDomainConstraint createConceptDomainConstraint() {
		ConceptDomainConstraintImpl conceptDomainConstraint = new ConceptDomainConstraintImpl();
		return conceptDomainConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemConstraint createCodeSystemConstraint() {
		CodeSystemConstraintImpl codeSystemConstraint = new CodeSystemConstraintImpl();
		return codeSystemConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetConstraint createValueSetConstraint() {
		ValueSetConstraintImpl valueSetConstraint = new ValueSetConstraintImpl();
		return valueSetConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActRelationship createActRelationship() {
		ActRelationshipImpl actRelationship = new ActRelationshipImpl();
		return actRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participation createParticipation() {
		ParticipationImpl participation = new ParticipationImpl();
		return participation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityKind createSeverityKindFromString(EDataType eDataType, String initialValue) {
		SeverityKind result = SeverityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryKind createEntryKindFromString(EDataType eDataType, String initialValue) {
		EntryKind result = EntryKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntryKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryRelationshipKind createEntryRelationshipKindFromString(EDataType eDataType, String initialValue) {
		EntryRelationshipKind result = EntryRelationshipKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntryRelationshipKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullFlavorKind createNullFlavorKindFromString(EDataType eDataType, String initialValue) {
		NullFlavorKind result = NullFlavorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullFlavorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDAPackage getCDAPackage() {
		return (CDAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CDAPackage getPackage() {
		return CDAPackage.eINSTANCE;
	}

} //CDAFactoryImpl
