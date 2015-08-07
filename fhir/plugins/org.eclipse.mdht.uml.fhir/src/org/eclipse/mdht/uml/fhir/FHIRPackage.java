/**
 */
package org.eclipse.mdht.uml.fhir;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.FHIRFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FHIR'"
 * @generated
 */
public interface FHIRPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fhir";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/mdht/schema/profile/fhir/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fhir";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FHIRPackage eINSTANCE = org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.TypeChoiceImpl <em>Type Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.TypeChoiceImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getTypeChoice()
	 * @generated
	 */
	int TYPE_CHOICE = 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CHOICE__BASE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CHOICE__TYPES = 1;

	/**
	 * The number of structural features of the '<em>Type Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CHOICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CHOICE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.StructureDefImpl <em>Structure Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.StructureDefImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getStructureDef()
	 * @generated
	 */
	int STRUCTURE_DEF = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEF__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEF__URL = 1;

	/**
	 * The number of structural features of the '<em>Structure Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Structure Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEF_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.TypeChoice <em>Type Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Choice</em>'.
	 * @see org.eclipse.mdht.uml.fhir.TypeChoice
	 * @generated
	 */
	EClass getTypeChoice();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.TypeChoice#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.mdht.uml.fhir.TypeChoice#getBase_Property()
	 * @see #getTypeChoice()
	 * @generated
	 */
	EReference getTypeChoice_Base_Property();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.TypeChoice#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see org.eclipse.mdht.uml.fhir.TypeChoice#getTypes()
	 * @see #getTypeChoice()
	 * @generated
	 */
	EReference getTypeChoice_Types();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.StructureDef <em>Structure Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Def</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDef
	 * @generated
	 */
	EClass getStructureDef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.StructureDef#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDef#getBase_Class()
	 * @see #getStructureDef()
	 * @generated
	 */
	EReference getStructureDef_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.StructureDef#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDef#getUrl()
	 * @see #getStructureDef()
	 * @generated
	 */
	EAttribute getStructureDef_Url();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FHIRFactory getFHIRFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.TypeChoiceImpl <em>Type Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.TypeChoiceImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getTypeChoice()
		 * @generated
		 */
		EClass TYPE_CHOICE = eINSTANCE.getTypeChoice();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_CHOICE__BASE_PROPERTY = eINSTANCE.getTypeChoice_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_CHOICE__TYPES = eINSTANCE.getTypeChoice_Types();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.StructureDefImpl <em>Structure Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.StructureDefImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getStructureDef()
		 * @generated
		 */
		EClass STRUCTURE_DEF = eINSTANCE.getStructureDef();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_DEF__BASE_CLASS = eINSTANCE.getStructureDef_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_DEF__URL = eINSTANCE.getStructureDef_Url();

	}

} //FHIRPackage
