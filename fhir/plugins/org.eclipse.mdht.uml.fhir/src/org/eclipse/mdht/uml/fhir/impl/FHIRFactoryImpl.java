/**
 */
package org.eclipse.mdht.uml.fhir.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.mdht.uml.fhir.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FHIRFactoryImpl extends EFactoryImpl implements FHIRFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FHIRFactory init() {
		try {
			FHIRFactory theFHIRFactory = (FHIRFactory)EPackage.Registry.INSTANCE.getEFactory(FHIRPackage.eNS_URI);
			if (theFHIRFactory != null) {
				return theFHIRFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FHIRFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRFactoryImpl() {
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
			case FHIRPackage.TYPE_CHOICE: return createTypeChoice();
			case FHIRPackage.STRUCTURE_DEFINITION: return createStructureDefinition();
			case FHIRPackage.EXTENSION: return createExtension();
			case FHIRPackage.ELEMENT_DEFINITION: return createElementDefinition();
			case FHIRPackage.SHORT_DESCRIPTION: return createShortDescription();
			case FHIRPackage.DESCRIPTION: return createDescription();
			case FHIRPackage.DEFINITION: return createDefinition();
			case FHIRPackage.REQUIREMENTS: return createRequirements();
			case FHIRPackage.COMMENTS: return createComments();
			case FHIRPackage.VALUE_SET_BINDING: return createValueSetBinding();
			case FHIRPackage.VALUE_SET: return createValueSet();
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
			case FHIRPackage.BINDING_STRENGTH_KIND:
				return createBindingStrengthKindFromString(eDataType, initialValue);
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
			case FHIRPackage.BINDING_STRENGTH_KIND:
				return convertBindingStrengthKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeChoice createTypeChoice() {
		TypeChoiceImpl typeChoice = new TypeChoiceImpl();
		return typeChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition createStructureDefinition() {
		StructureDefinitionImpl structureDefinition = new StructureDefinitionImpl();
		return structureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition createElementDefinition() {
		ElementDefinitionImpl elementDefinition = new ElementDefinitionImpl();
		return elementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortDescription createShortDescription() {
		ShortDescriptionImpl shortDescription = new ShortDescriptionImpl();
		return shortDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirements createRequirements() {
		RequirementsImpl requirements = new RequirementsImpl();
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comments createComments() {
		CommentsImpl comments = new CommentsImpl();
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetBinding createValueSetBinding() {
		ValueSetBindingImpl valueSetBinding = new ValueSetBindingImpl();
		return valueSetBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSet createValueSet() {
		ValueSetImpl valueSet = new ValueSetImpl();
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrengthKind createBindingStrengthKindFromString(EDataType eDataType, String initialValue) {
		BindingStrengthKind result = BindingStrengthKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingStrengthKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRPackage getFHIRPackage() {
		return (FHIRPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FHIRPackage getPackage() {
		return FHIRPackage.eINSTANCE;
	}

} //FHIRFactoryImpl
