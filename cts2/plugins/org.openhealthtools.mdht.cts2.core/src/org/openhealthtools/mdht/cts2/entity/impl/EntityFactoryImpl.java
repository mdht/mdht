/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.cts2.entity.AnnotationPropertyDescription;
import org.openhealthtools.mdht.cts2.entity.AnonymousEntityDescription;
import org.openhealthtools.mdht.cts2.entity.AnonymousIndividualDescription;
import org.openhealthtools.mdht.cts2.entity.ClassDescription;
import org.openhealthtools.mdht.cts2.entity.ClassDescriptionState;
import org.openhealthtools.mdht.cts2.entity.ClassDescriptionType;
import org.openhealthtools.mdht.cts2.entity.DataPropertyDescription;
import org.openhealthtools.mdht.cts2.entity.DataTypeDescription;
import org.openhealthtools.mdht.cts2.entity.Designation;
import org.openhealthtools.mdht.cts2.entity.DesignationRole;
import org.openhealthtools.mdht.cts2.entity.DocumentRoot;
import org.openhealthtools.mdht.cts2.entity.EntityDescription;
import org.openhealthtools.mdht.cts2.entity.EntityDescriptionMsg;
import org.openhealthtools.mdht.cts2.entity.EntityDirectory;
import org.openhealthtools.mdht.cts2.entity.EntityDirectoryEntry;
import org.openhealthtools.mdht.cts2.entity.EntityFactory;
import org.openhealthtools.mdht.cts2.entity.EntityList;
import org.openhealthtools.mdht.cts2.entity.EntityListEntry;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;
import org.openhealthtools.mdht.cts2.entity.EntityReferenceMsg;
import org.openhealthtools.mdht.cts2.entity.NamedEntityDescription;
import org.openhealthtools.mdht.cts2.entity.NamedIndividualDescription;
import org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription;
import org.openhealthtools.mdht.cts2.entity.ObjectPropertyDirectionality;
import org.openhealthtools.mdht.cts2.entity.PredicateDescription;
import org.openhealthtools.mdht.cts2.entity.Transitivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EntityFactoryImpl extends EFactoryImpl implements EntityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static EntityFactory init() {
		try {
			EntityFactory theEntityFactory = (EntityFactory) EPackage.Registry.INSTANCE.getEFactory("http://schema.omg.org/spec/CTS2/1.0/Entity");
			if (theEntityFactory != null) {
				return theEntityFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EntityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityFactoryImpl() {
		super();
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
			case EntityPackage.ANNOTATION_PROPERTY_DESCRIPTION:
				return createAnnotationPropertyDescription();
			case EntityPackage.ANONYMOUS_ENTITY_DESCRIPTION:
				return createAnonymousEntityDescription();
			case EntityPackage.ANONYMOUS_INDIVIDUAL_DESCRIPTION:
				return createAnonymousIndividualDescription();
			case EntityPackage.CLASS_DESCRIPTION:
				return createClassDescription();
			case EntityPackage.DATA_PROPERTY_DESCRIPTION:
				return createDataPropertyDescription();
			case EntityPackage.DATA_TYPE_DESCRIPTION:
				return createDataTypeDescription();
			case EntityPackage.DESIGNATION:
				return createDesignation();
			case EntityPackage.DOCUMENT_ROOT:
				return createDocumentRoot();
			case EntityPackage.ENTITY_DESCRIPTION:
				return createEntityDescription();
			case EntityPackage.ENTITY_DESCRIPTION_MSG:
				return createEntityDescriptionMsg();
			case EntityPackage.ENTITY_DIRECTORY:
				return createEntityDirectory();
			case EntityPackage.ENTITY_DIRECTORY_ENTRY:
				return createEntityDirectoryEntry();
			case EntityPackage.ENTITY_LIST:
				return createEntityList();
			case EntityPackage.ENTITY_LIST_ENTRY:
				return createEntityListEntry();
			case EntityPackage.ENTITY_REFERENCE_MSG:
				return createEntityReferenceMsg();
			case EntityPackage.NAMED_ENTITY_DESCRIPTION:
				return createNamedEntityDescription();
			case EntityPackage.NAMED_INDIVIDUAL_DESCRIPTION:
				return createNamedIndividualDescription();
			case EntityPackage.OBJECT_PROPERTY_DESCRIPTION:
				return createObjectPropertyDescription();
			case EntityPackage.PREDICATE_DESCRIPTION:
				return createPredicateDescription();
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
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EntityPackage.CLASS_DESCRIPTION_STATE:
				return createClassDescriptionStateFromString(eDataType, initialValue);
			case EntityPackage.CLASS_DESCRIPTION_TYPE:
				return createClassDescriptionTypeFromString(eDataType, initialValue);
			case EntityPackage.DESIGNATION_ROLE:
				return createDesignationRoleFromString(eDataType, initialValue);
			case EntityPackage.OBJECT_PROPERTY_DIRECTIONALITY:
				return createObjectPropertyDirectionalityFromString(eDataType, initialValue);
			case EntityPackage.TRANSITIVITY:
				return createTransitivityFromString(eDataType, initialValue);
			case EntityPackage.CLASS_DESCRIPTION_STATE_OBJECT:
				return createClassDescriptionStateObjectFromString(eDataType, initialValue);
			case EntityPackage.CLASS_DESCRIPTION_TYPE_OBJECT:
				return createClassDescriptionTypeObjectFromString(eDataType, initialValue);
			case EntityPackage.DESIGNATION_ROLE_OBJECT:
				return createDesignationRoleObjectFromString(eDataType, initialValue);
			case EntityPackage.OBJECT_PROPERTY_DIRECTIONALITY_OBJECT:
				return createObjectPropertyDirectionalityObjectFromString(eDataType, initialValue);
			case EntityPackage.TRANSITIVITY_OBJECT:
				return createTransitivityObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() +
						"' is not a valid classifier");
		}
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
			case EntityPackage.CLASS_DESCRIPTION_STATE:
				return convertClassDescriptionStateToString(eDataType, instanceValue);
			case EntityPackage.CLASS_DESCRIPTION_TYPE:
				return convertClassDescriptionTypeToString(eDataType, instanceValue);
			case EntityPackage.DESIGNATION_ROLE:
				return convertDesignationRoleToString(eDataType, instanceValue);
			case EntityPackage.OBJECT_PROPERTY_DIRECTIONALITY:
				return convertObjectPropertyDirectionalityToString(eDataType, instanceValue);
			case EntityPackage.TRANSITIVITY:
				return convertTransitivityToString(eDataType, instanceValue);
			case EntityPackage.CLASS_DESCRIPTION_STATE_OBJECT:
				return convertClassDescriptionStateObjectToString(eDataType, instanceValue);
			case EntityPackage.CLASS_DESCRIPTION_TYPE_OBJECT:
				return convertClassDescriptionTypeObjectToString(eDataType, instanceValue);
			case EntityPackage.DESIGNATION_ROLE_OBJECT:
				return convertDesignationRoleObjectToString(eDataType, instanceValue);
			case EntityPackage.OBJECT_PROPERTY_DIRECTIONALITY_OBJECT:
				return convertObjectPropertyDirectionalityObjectToString(eDataType, instanceValue);
			case EntityPackage.TRANSITIVITY_OBJECT:
				return convertTransitivityObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() +
						"' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AnnotationPropertyDescription createAnnotationPropertyDescription() {
		AnnotationPropertyDescriptionImpl annotationPropertyDescription = new AnnotationPropertyDescriptionImpl();
		return annotationPropertyDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AnonymousEntityDescription createAnonymousEntityDescription() {
		AnonymousEntityDescriptionImpl anonymousEntityDescription = new AnonymousEntityDescriptionImpl();
		return anonymousEntityDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AnonymousIndividualDescription createAnonymousIndividualDescription() {
		AnonymousIndividualDescriptionImpl anonymousIndividualDescription = new AnonymousIndividualDescriptionImpl();
		return anonymousIndividualDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClassDescription createClassDescription() {
		ClassDescriptionImpl classDescription = new ClassDescriptionImpl();
		return classDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataPropertyDescription createDataPropertyDescription() {
		DataPropertyDescriptionImpl dataPropertyDescription = new DataPropertyDescriptionImpl();
		return dataPropertyDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DataTypeDescription createDataTypeDescription() {
		DataTypeDescriptionImpl dataTypeDescription = new DataTypeDescriptionImpl();
		return dataTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Designation createDesignation() {
		DesignationImpl designation = new DesignationImpl();
		return designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityDescription createEntityDescription() {
		EntityDescriptionImpl entityDescription = new EntityDescriptionImpl();
		return entityDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityDescriptionMsg createEntityDescriptionMsg() {
		EntityDescriptionMsgImpl entityDescriptionMsg = new EntityDescriptionMsgImpl();
		return entityDescriptionMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityDirectory createEntityDirectory() {
		EntityDirectoryImpl entityDirectory = new EntityDirectoryImpl();
		return entityDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityDirectoryEntry createEntityDirectoryEntry() {
		EntityDirectoryEntryImpl entityDirectoryEntry = new EntityDirectoryEntryImpl();
		return entityDirectoryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityList createEntityList() {
		EntityListImpl entityList = new EntityListImpl();
		return entityList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityListEntry createEntityListEntry() {
		EntityListEntryImpl entityListEntry = new EntityListEntryImpl();
		return entityListEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityReferenceMsg createEntityReferenceMsg() {
		EntityReferenceMsgImpl entityReferenceMsg = new EntityReferenceMsgImpl();
		return entityReferenceMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NamedEntityDescription createNamedEntityDescription() {
		NamedEntityDescriptionImpl namedEntityDescription = new NamedEntityDescriptionImpl();
		return namedEntityDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NamedIndividualDescription createNamedIndividualDescription() {
		NamedIndividualDescriptionImpl namedIndividualDescription = new NamedIndividualDescriptionImpl();
		return namedIndividualDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ObjectPropertyDescription createObjectPropertyDescription() {
		ObjectPropertyDescriptionImpl objectPropertyDescription = new ObjectPropertyDescriptionImpl();
		return objectPropertyDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PredicateDescription createPredicateDescription() {
		PredicateDescriptionImpl predicateDescription = new PredicateDescriptionImpl();
		return predicateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClassDescriptionState createClassDescriptionStateFromString(EDataType eDataType, String initialValue) {
		ClassDescriptionState result = ClassDescriptionState.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertClassDescriptionStateToString(EDataType eDataType, Object instanceValue) {
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
	public ClassDescriptionType createClassDescriptionTypeFromString(EDataType eDataType, String initialValue) {
		ClassDescriptionType result = ClassDescriptionType.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertClassDescriptionTypeToString(EDataType eDataType, Object instanceValue) {
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
	public DesignationRole createDesignationRoleFromString(EDataType eDataType, String initialValue) {
		DesignationRole result = DesignationRole.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertDesignationRoleToString(EDataType eDataType, Object instanceValue) {
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
	public ObjectPropertyDirectionality createObjectPropertyDirectionalityFromString(EDataType eDataType,
			String initialValue) {
		ObjectPropertyDirectionality result = ObjectPropertyDirectionality.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertObjectPropertyDirectionalityToString(EDataType eDataType, Object instanceValue) {
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
	public Transitivity createTransitivityFromString(EDataType eDataType, String initialValue) {
		Transitivity result = Transitivity.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertTransitivityToString(EDataType eDataType, Object instanceValue) {
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
	public ClassDescriptionState createClassDescriptionStateObjectFromString(EDataType eDataType, String initialValue) {
		return createClassDescriptionStateFromString(EntityPackage.Literals.CLASS_DESCRIPTION_STATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertClassDescriptionStateObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClassDescriptionStateToString(EntityPackage.Literals.CLASS_DESCRIPTION_STATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClassDescriptionType createClassDescriptionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createClassDescriptionTypeFromString(EntityPackage.Literals.CLASS_DESCRIPTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertClassDescriptionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClassDescriptionTypeToString(EntityPackage.Literals.CLASS_DESCRIPTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DesignationRole createDesignationRoleObjectFromString(EDataType eDataType, String initialValue) {
		return createDesignationRoleFromString(EntityPackage.Literals.DESIGNATION_ROLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertDesignationRoleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDesignationRoleToString(EntityPackage.Literals.DESIGNATION_ROLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ObjectPropertyDirectionality createObjectPropertyDirectionalityObjectFromString(EDataType eDataType,
			String initialValue) {
		return createObjectPropertyDirectionalityFromString(
			EntityPackage.Literals.OBJECT_PROPERTY_DIRECTIONALITY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertObjectPropertyDirectionalityObjectToString(EDataType eDataType, Object instanceValue) {
		return convertObjectPropertyDirectionalityToString(
			EntityPackage.Literals.OBJECT_PROPERTY_DIRECTIONALITY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Transitivity createTransitivityObjectFromString(EDataType eDataType, String initialValue) {
		return createTransitivityFromString(EntityPackage.Literals.TRANSITIVITY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertTransitivityObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransitivityToString(EntityPackage.Literals.TRANSITIVITY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityPackage getEntityPackage() {
		return (EntityPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EntityPackage getPackage() {
		return EntityPackage.eINSTANCE;
	}

} // EntityFactoryImpl
