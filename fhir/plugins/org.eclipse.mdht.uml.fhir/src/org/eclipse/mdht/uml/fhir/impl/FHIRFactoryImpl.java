/**
 */
package org.eclipse.mdht.uml.fhir.impl;

import org.eclipse.emf.ecore.EClass;
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
			case FHIRPackage.STRUCTURE_DEF: return createStructureDef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public StructureDef createStructureDef() {
		StructureDefImpl structureDef = new StructureDefImpl();
		return structureDef;
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
