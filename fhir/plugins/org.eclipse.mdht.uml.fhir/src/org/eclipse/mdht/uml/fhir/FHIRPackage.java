/**
 */
package org.eclipse.mdht.uml.fhir;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.ElementImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.StructureDefinitionImpl <em>Structure Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.StructureDefinitionImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getStructureDefinition()
	 * @generated
	 */
	int STRUCTURE_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__BASE_CLASS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__URI = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__NAME = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__DISPLAY = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fhir Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__FHIR_VERSION = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Context Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__CONTEXT_TYPE = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__CONTEXT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__EXTENSION = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Structure Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Structure Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.ExtensionImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__URL = 0;

	/**
	 * The feature id for the '<em><b>Value String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_STRING = 1;

	/**
	 * The feature id for the '<em><b>Value Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_INTEGER = 2;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getElementDefinition()
	 * @generated
	 */
	int ELEMENT_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__BASE_PROPERTY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__NAME = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__LABEL = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Must Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MUST_SUPPORT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__EXTENSION = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__IS_MODIFIER = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__IS_SUMMARY = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Element Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Element Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.ShortDescriptionImpl <em>Short Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.ShortDescriptionImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getShortDescription()
	 * @generated
	 */
	int SHORT_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_DESCRIPTION__BASE_COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Short Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Short Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.DescriptionImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__BASE_COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.DefinitionImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__BASE_COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.RequirementsImpl <em>Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.RequirementsImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getRequirements()
	 * @generated
	 */
	int REQUIREMENTS = 8;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__BASE_COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.CommentsImpl <em>Comments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.CommentsImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getComments()
	 * @generated
	 */
	int COMMENTS = 9;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTS__BASE_COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Comments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Comments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.ValueSetBindingImpl <em>Value Set Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.ValueSetBindingImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getValueSetBinding()
	 * @generated
	 */
	int VALUE_SET_BINDING = 10;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_BINDING__BASE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_BINDING__STRENGTH = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_BINDING__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Value Set Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_BINDING__VALUE_SET_URI = 3;

	/**
	 * The feature id for the '<em><b>Value Set Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_BINDING__VALUE_SET_REFERENCE = 4;

	/**
	 * The number of structural features of the '<em>Value Set Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_BINDING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Value Set Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.BindingStrengthKind <em>Binding Strength Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.BindingStrengthKind
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getBindingStrengthKind()
	 * @generated
	 */
	int BINDING_STRENGTH_KIND = 11;

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
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.StructureDefinition <em>Structure Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Definition</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDefinition
	 * @generated
	 */
	EClass getStructureDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDefinition#getBase_Class()
	 * @see #getStructureDefinition()
	 * @generated
	 */
	EReference getStructureDefinition_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDefinition#getUri()
	 * @see #getStructureDefinition()
	 * @generated
	 */
	EAttribute getStructureDefinition_Uri();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDefinition#getName()
	 * @see #getStructureDefinition()
	 * @generated
	 */
	EAttribute getStructureDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDefinition#getDisplay()
	 * @see #getStructureDefinition()
	 * @generated
	 */
	EAttribute getStructureDefinition_Display();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getFhirVersion <em>Fhir Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fhir Version</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDefinition#getFhirVersion()
	 * @see #getStructureDefinition()
	 * @generated
	 */
	EAttribute getStructureDefinition_FhirVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getContextType <em>Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDefinition#getContextType()
	 * @see #getStructureDefinition()
	 * @generated
	 */
	EAttribute getStructureDefinition_ContextType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getContexts <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Context</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDefinition#getContexts()
	 * @see #getStructureDefinition()
	 * @generated
	 */
	EAttribute getStructureDefinition_Context();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getExtensions <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extension</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDefinition#getExtensions()
	 * @see #getStructureDefinition()
	 * @generated
	 */
	EReference getStructureDefinition_Extension();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.Extension#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Extension#getUrl()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.Extension#getValueString <em>Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value String</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Extension#getValueString()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_ValueString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.Extension#getValueInteger <em>Value Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Integer</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Extension#getValueInteger()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_ValueInteger();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.ElementDefinition <em>Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition
	 * @generated
	 */
	EClass getElementDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getBase_Property()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Base_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getName()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EAttribute getElementDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getLabel()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EAttribute getElementDefinition_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getMustSupport <em>Must Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Support</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getMustSupport()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EAttribute getElementDefinition_MustSupport();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getExtensions <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extension</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getExtensions()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getIsModifier <em>Is Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Modifier</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getIsModifier()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EAttribute getElementDefinition_IsModifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getIsSummary <em>Is Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Summary</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getIsSummary()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EAttribute getElementDefinition_IsSummary();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.ShortDescription <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Description</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ShortDescription
	 * @generated
	 */
	EClass getShortDescription();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.ShortDescription#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ShortDescription#getBase_Comment()
	 * @see #getShortDescription()
	 * @generated
	 */
	EReference getShortDescription_Base_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.Description#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Description#getBase_Comment()
	 * @see #getDescription()
	 * @generated
	 */
	EReference getDescription_Base_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.Definition#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Definition#getBase_Comment()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Base_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.Requirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Requirements
	 * @generated
	 */
	EClass getRequirements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.Requirements#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Requirements#getBase_Comment()
	 * @see #getRequirements()
	 * @generated
	 */
	EReference getRequirements_Base_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.Comments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comments</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Comments
	 * @generated
	 */
	EClass getComments();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.Comments#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Comments#getBase_Comment()
	 * @see #getComments()
	 * @generated
	 */
	EReference getComments_Base_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.ValueSetBinding <em>Value Set Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set Binding</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetBinding
	 * @generated
	 */
	EClass getValueSetBinding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetBinding#getBase_Property()
	 * @see #getValueSetBinding()
	 * @generated
	 */
	EReference getValueSetBinding_Base_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strength</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetBinding#getStrength()
	 * @see #getValueSetBinding()
	 * @generated
	 */
	EAttribute getValueSetBinding_Strength();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetBinding#getDescription()
	 * @see #getValueSetBinding()
	 * @generated
	 */
	EAttribute getValueSetBinding_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getValueSetUri <em>Value Set Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Set Uri</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetBinding#getValueSetUri()
	 * @see #getValueSetBinding()
	 * @generated
	 */
	EAttribute getValueSetBinding_ValueSetUri();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getValueSetReference <em>Value Set Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Set Reference</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetBinding#getValueSetReference()
	 * @see #getValueSetBinding()
	 * @generated
	 */
	EAttribute getValueSetBinding_ValueSetReference();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.BindingStrengthKind <em>Binding Strength Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Strength Kind</em>'.
	 * @see org.eclipse.mdht.uml.fhir.BindingStrengthKind
	 * @generated
	 */
	EEnum getBindingStrengthKind();

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
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.StructureDefinitionImpl <em>Structure Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.StructureDefinitionImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getStructureDefinition()
		 * @generated
		 */
		EClass STRUCTURE_DEFINITION = eINSTANCE.getStructureDefinition();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_DEFINITION__BASE_CLASS = eINSTANCE.getStructureDefinition_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_DEFINITION__URI = eINSTANCE.getStructureDefinition_Uri();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_DEFINITION__NAME = eINSTANCE.getStructureDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_DEFINITION__DISPLAY = eINSTANCE.getStructureDefinition_Display();

		/**
		 * The meta object literal for the '<em><b>Fhir Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_DEFINITION__FHIR_VERSION = eINSTANCE.getStructureDefinition_FhirVersion();

		/**
		 * The meta object literal for the '<em><b>Context Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_DEFINITION__CONTEXT_TYPE = eINSTANCE.getStructureDefinition_ContextType();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_DEFINITION__CONTEXT = eINSTANCE.getStructureDefinition_Context();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_DEFINITION__EXTENSION = eINSTANCE.getStructureDefinition_Extension();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.ElementImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.ExtensionImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__URL = eINSTANCE.getExtension_Url();

		/**
		 * The meta object literal for the '<em><b>Value String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__VALUE_STRING = eINSTANCE.getExtension_ValueString();

		/**
		 * The meta object literal for the '<em><b>Value Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__VALUE_INTEGER = eINSTANCE.getExtension_ValueInteger();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getElementDefinition()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION = eINSTANCE.getElementDefinition();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__BASE_PROPERTY = eINSTANCE.getElementDefinition_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DEFINITION__NAME = eINSTANCE.getElementDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DEFINITION__LABEL = eINSTANCE.getElementDefinition_Label();

		/**
		 * The meta object literal for the '<em><b>Must Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DEFINITION__MUST_SUPPORT = eINSTANCE.getElementDefinition_MustSupport();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__EXTENSION = eINSTANCE.getElementDefinition_Extension();

		/**
		 * The meta object literal for the '<em><b>Is Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DEFINITION__IS_MODIFIER = eINSTANCE.getElementDefinition_IsModifier();

		/**
		 * The meta object literal for the '<em><b>Is Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DEFINITION__IS_SUMMARY = eINSTANCE.getElementDefinition_IsSummary();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.ShortDescriptionImpl <em>Short Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.ShortDescriptionImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getShortDescription()
		 * @generated
		 */
		EClass SHORT_DESCRIPTION = eINSTANCE.getShortDescription();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORT_DESCRIPTION__BASE_COMMENT = eINSTANCE.getShortDescription_Base_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.DescriptionImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION__BASE_COMMENT = eINSTANCE.getDescription_Base_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.DefinitionImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__BASE_COMMENT = eINSTANCE.getDefinition_Base_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.RequirementsImpl <em>Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.RequirementsImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getRequirements()
		 * @generated
		 */
		EClass REQUIREMENTS = eINSTANCE.getRequirements();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS__BASE_COMMENT = eINSTANCE.getRequirements_Base_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.CommentsImpl <em>Comments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.CommentsImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getComments()
		 * @generated
		 */
		EClass COMMENTS = eINSTANCE.getComments();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENTS__BASE_COMMENT = eINSTANCE.getComments_Base_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.ValueSetBindingImpl <em>Value Set Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.ValueSetBindingImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getValueSetBinding()
		 * @generated
		 */
		EClass VALUE_SET_BINDING = eINSTANCE.getValueSetBinding();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET_BINDING__BASE_PROPERTY = eINSTANCE.getValueSetBinding_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_BINDING__STRENGTH = eINSTANCE.getValueSetBinding_Strength();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_BINDING__DESCRIPTION = eINSTANCE.getValueSetBinding_Description();

		/**
		 * The meta object literal for the '<em><b>Value Set Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_BINDING__VALUE_SET_URI = eINSTANCE.getValueSetBinding_ValueSetUri();

		/**
		 * The meta object literal for the '<em><b>Value Set Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_BINDING__VALUE_SET_REFERENCE = eINSTANCE.getValueSetBinding_ValueSetReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.BindingStrengthKind <em>Binding Strength Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.BindingStrengthKind
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getBindingStrengthKind()
		 * @generated
		 */
		EEnum BINDING_STRENGTH_KIND = eINSTANCE.getBindingStrengthKind();

	}

} //FHIRPackage
