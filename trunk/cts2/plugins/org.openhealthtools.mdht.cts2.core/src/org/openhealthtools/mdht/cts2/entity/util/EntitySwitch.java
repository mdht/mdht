/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openhealthtools.mdht.cts2.core.Directory;
import org.openhealthtools.mdht.cts2.core.DirectoryEntry;
import org.openhealthtools.mdht.cts2.core.EntityReference;
import org.openhealthtools.mdht.cts2.core.EntryDescription;
import org.openhealthtools.mdht.cts2.core.Message;
import org.openhealthtools.mdht.cts2.core.OpaqueData;
import org.openhealthtools.mdht.cts2.entity.AnnotationPropertyDescription;
import org.openhealthtools.mdht.cts2.entity.AnonymousEntityDescription;
import org.openhealthtools.mdht.cts2.entity.AnonymousIndividualDescription;
import org.openhealthtools.mdht.cts2.entity.ClassDescription;
import org.openhealthtools.mdht.cts2.entity.DataPropertyDescription;
import org.openhealthtools.mdht.cts2.entity.DataTypeDescription;
import org.openhealthtools.mdht.cts2.entity.Designation;
import org.openhealthtools.mdht.cts2.entity.DocumentRoot;
import org.openhealthtools.mdht.cts2.entity.EntityDescription;
import org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase;
import org.openhealthtools.mdht.cts2.entity.EntityDescriptionMsg;
import org.openhealthtools.mdht.cts2.entity.EntityDirectory;
import org.openhealthtools.mdht.cts2.entity.EntityDirectoryEntry;
import org.openhealthtools.mdht.cts2.entity.EntityList;
import org.openhealthtools.mdht.cts2.entity.EntityListEntry;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;
import org.openhealthtools.mdht.cts2.entity.EntityReferenceMsg;
import org.openhealthtools.mdht.cts2.entity.NamedEntityDescription;
import org.openhealthtools.mdht.cts2.entity.NamedIndividualDescription;
import org.openhealthtools.mdht.cts2.entity.ObjectPropertyDescription;
import org.openhealthtools.mdht.cts2.entity.PredicateDescription;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage
 * @generated
 */
public class EntitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static EntityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntitySwitch() {
		if (modelPackage == null) {
			modelPackage = EntityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EntityPackage.ANNOTATION_PROPERTY_DESCRIPTION: {
				AnnotationPropertyDescription annotationPropertyDescription = (AnnotationPropertyDescription) theEObject;
				T result = caseAnnotationPropertyDescription(annotationPropertyDescription);
				if (result == null) {
					result = casePredicateDescription(annotationPropertyDescription);
				}
				if (result == null) {
					result = caseNamedEntityDescription(annotationPropertyDescription);
				}
				if (result == null) {
					result = caseEntityDescriptionBase(annotationPropertyDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.ANONYMOUS_ENTITY_DESCRIPTION: {
				AnonymousEntityDescription anonymousEntityDescription = (AnonymousEntityDescription) theEObject;
				T result = caseAnonymousEntityDescription(anonymousEntityDescription);
				if (result == null) {
					result = caseEntityDescriptionBase(anonymousEntityDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.ANONYMOUS_INDIVIDUAL_DESCRIPTION: {
				AnonymousIndividualDescription anonymousIndividualDescription = (AnonymousIndividualDescription) theEObject;
				T result = caseAnonymousIndividualDescription(anonymousIndividualDescription);
				if (result == null) {
					result = caseNamedEntityDescription(anonymousIndividualDescription);
				}
				if (result == null) {
					result = caseEntityDescriptionBase(anonymousIndividualDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.CLASS_DESCRIPTION: {
				ClassDescription classDescription = (ClassDescription) theEObject;
				T result = caseClassDescription(classDescription);
				if (result == null) {
					result = caseNamedEntityDescription(classDescription);
				}
				if (result == null) {
					result = caseEntityDescriptionBase(classDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.DATA_PROPERTY_DESCRIPTION: {
				DataPropertyDescription dataPropertyDescription = (DataPropertyDescription) theEObject;
				T result = caseDataPropertyDescription(dataPropertyDescription);
				if (result == null) {
					result = casePredicateDescription(dataPropertyDescription);
				}
				if (result == null) {
					result = caseNamedEntityDescription(dataPropertyDescription);
				}
				if (result == null) {
					result = caseEntityDescriptionBase(dataPropertyDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.DATA_TYPE_DESCRIPTION: {
				DataTypeDescription dataTypeDescription = (DataTypeDescription) theEObject;
				T result = caseDataTypeDescription(dataTypeDescription);
				if (result == null) {
					result = caseAnonymousEntityDescription(dataTypeDescription);
				}
				if (result == null) {
					result = caseEntityDescriptionBase(dataTypeDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.DESIGNATION: {
				Designation designation = (Designation) theEObject;
				T result = caseDesignation(designation);
				if (result == null) {
					result = caseEntryDescription(designation);
				}
				if (result == null) {
					result = caseOpaqueData(designation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot) theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.ENTITY_DESCRIPTION: {
				EntityDescription entityDescription = (EntityDescription) theEObject;
				T result = caseEntityDescription(entityDescription);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.ENTITY_DESCRIPTION_BASE: {
				EntityDescriptionBase entityDescriptionBase = (EntityDescriptionBase) theEObject;
				T result = caseEntityDescriptionBase(entityDescriptionBase);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.ENTITY_DESCRIPTION_MSG: {
				EntityDescriptionMsg entityDescriptionMsg = (EntityDescriptionMsg) theEObject;
				T result = caseEntityDescriptionMsg(entityDescriptionMsg);
				if (result == null) {
					result = caseMessage(entityDescriptionMsg);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.ENTITY_DIRECTORY: {
				EntityDirectory entityDirectory = (EntityDirectory) theEObject;
				T result = caseEntityDirectory(entityDirectory);
				if (result == null) {
					result = caseDirectory(entityDirectory);
				}
				if (result == null) {
					result = caseMessage(entityDirectory);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.ENTITY_DIRECTORY_ENTRY: {
				EntityDirectoryEntry entityDirectoryEntry = (EntityDirectoryEntry) theEObject;
				T result = caseEntityDirectoryEntry(entityDirectoryEntry);
				if (result == null) {
					result = caseEntityReference(entityDirectoryEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.ENTITY_LIST: {
				EntityList entityList = (EntityList) theEObject;
				T result = caseEntityList(entityList);
				if (result == null) {
					result = caseDirectory(entityList);
				}
				if (result == null) {
					result = caseMessage(entityList);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.ENTITY_LIST_ENTRY: {
				EntityListEntry entityListEntry = (EntityListEntry) theEObject;
				T result = caseEntityListEntry(entityListEntry);
				if (result == null) {
					result = caseDirectoryEntry(entityListEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.ENTITY_REFERENCE_MSG: {
				EntityReferenceMsg entityReferenceMsg = (EntityReferenceMsg) theEObject;
				T result = caseEntityReferenceMsg(entityReferenceMsg);
				if (result == null) {
					result = caseMessage(entityReferenceMsg);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.NAMED_ENTITY_DESCRIPTION: {
				NamedEntityDescription namedEntityDescription = (NamedEntityDescription) theEObject;
				T result = caseNamedEntityDescription(namedEntityDescription);
				if (result == null) {
					result = caseEntityDescriptionBase(namedEntityDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.NAMED_INDIVIDUAL_DESCRIPTION: {
				NamedIndividualDescription namedIndividualDescription = (NamedIndividualDescription) theEObject;
				T result = caseNamedIndividualDescription(namedIndividualDescription);
				if (result == null) {
					result = caseNamedEntityDescription(namedIndividualDescription);
				}
				if (result == null) {
					result = caseEntityDescriptionBase(namedIndividualDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.OBJECT_PROPERTY_DESCRIPTION: {
				ObjectPropertyDescription objectPropertyDescription = (ObjectPropertyDescription) theEObject;
				T result = caseObjectPropertyDescription(objectPropertyDescription);
				if (result == null) {
					result = casePredicateDescription(objectPropertyDescription);
				}
				if (result == null) {
					result = caseNamedEntityDescription(objectPropertyDescription);
				}
				if (result == null) {
					result = caseEntityDescriptionBase(objectPropertyDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case EntityPackage.PREDICATE_DESCRIPTION: {
				PredicateDescription predicateDescription = (PredicateDescription) theEObject;
				T result = casePredicateDescription(predicateDescription);
				if (result == null) {
					result = caseNamedEntityDescription(predicateDescription);
				}
				if (result == null) {
					result = caseEntityDescriptionBase(predicateDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Property Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Property Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationPropertyDescription(AnnotationPropertyDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Entity Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Entity Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousEntityDescription(AnonymousEntityDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Individual Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Individual Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousIndividualDescription(AnonymousIndividualDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDescription(ClassDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyDescription(DataPropertyDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeDescription(DataTypeDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignation(Designation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityDescription(EntityDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityDescriptionBase(EntityDescriptionBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Msg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Msg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityDescriptionMsg(EntityDescriptionMsg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityDirectory(EntityDirectory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directory Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directory Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityDirectoryEntry(EntityDirectoryEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityList(EntityList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityListEntry(EntityListEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Msg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Msg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityReferenceMsg(EntityReferenceMsg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntityDescription(NamedEntityDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Individual Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Individual Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedIndividualDescription(NamedIndividualDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyDescription(ObjectPropertyDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateDescription(PredicateDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueData(OpaqueData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryDescription(EntryDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectory(Directory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityReference(EntityReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directory Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directory Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectoryEntry(DirectoryEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // EntitySwitch
