/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.valuesetdefinition.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openhealthtools.mdht.cts2.core.Changeable;
import org.openhealthtools.mdht.cts2.core.Directory;
import org.openhealthtools.mdht.cts2.core.DirectoryEntry;
import org.openhealthtools.mdht.cts2.core.Message;
import org.openhealthtools.mdht.cts2.core.OpaqueData;
import org.openhealthtools.mdht.cts2.core.ResourceDescription;
import org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry;
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescription;
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ExternalValueSetDefinition;
import org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet;
import org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectory;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectoryEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetMsg;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary;
import org.openhealthtools.mdht.cts2.valuesetdefinition.SpecificEntityList;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectory;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectoryEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionList;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionListEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionMsg;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

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
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage
 * @generated
 */
public class ValueSetDefinitionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static ValueSetDefinitionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionSwitch() {
		if (modelPackage == null) {
			modelPackage = ValueSetDefinitionPackage.eINSTANCE;
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
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE: {
				AssociatedEntitiesReference associatedEntitiesReference = (AssociatedEntitiesReference) theEObject;
				T result = caseAssociatedEntitiesReference(associatedEntitiesReference);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE: {
				CompleteCodeSystemReference completeCodeSystemReference = (CompleteCodeSystemReference) theEObject;
				T result = caseCompleteCodeSystemReference(completeCodeSystemReference);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE: {
				CompleteValueSetReference completeValueSetReference = (CompleteValueSetReference) theEObject;
				T result = caseCompleteValueSetReference(completeValueSetReference);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot) theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.EXTERNAL_VALUE_SET_DEFINITION: {
				ExternalValueSetDefinition externalValueSetDefinition = (ExternalValueSetDefinition) theEObject;
				T result = caseExternalValueSetDefinition(externalValueSetDefinition);
				if (result == null) {
					result = caseOpaqueData(externalValueSetDefinition);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.ITERATABLE_RESOLVED_VALUE_SET: {
				IteratableResolvedValueSet iteratableResolvedValueSet = (IteratableResolvedValueSet) theEObject;
				T result = caseIteratableResolvedValueSet(iteratableResolvedValueSet);
				if (result == null) {
					result = caseDirectory(iteratableResolvedValueSet);
				}
				if (result == null) {
					result = caseMessage(iteratableResolvedValueSet);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.PROPERTY_QUERY_REFERENCE: {
				PropertyQueryReference propertyQueryReference = (PropertyQueryReference) theEObject;
				T result = casePropertyQueryReference(propertyQueryReference);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET: {
				ResolvedValueSet resolvedValueSet = (ResolvedValueSet) theEObject;
				T result = caseResolvedValueSet(resolvedValueSet);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_DIRECTORY: {
				ResolvedValueSetDirectory resolvedValueSetDirectory = (ResolvedValueSetDirectory) theEObject;
				T result = caseResolvedValueSetDirectory(resolvedValueSetDirectory);
				if (result == null) {
					result = caseDirectory(resolvedValueSetDirectory);
				}
				if (result == null) {
					result = caseMessage(resolvedValueSetDirectory);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_DIRECTORY_ENTRY: {
				ResolvedValueSetDirectoryEntry resolvedValueSetDirectoryEntry = (ResolvedValueSetDirectoryEntry) theEObject;
				T result = caseResolvedValueSetDirectoryEntry(resolvedValueSetDirectoryEntry);
				if (result == null) {
					result = caseResolvedValueSetSummary(resolvedValueSetDirectoryEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER: {
				ResolvedValueSetHeader resolvedValueSetHeader = (ResolvedValueSetHeader) theEObject;
				T result = caseResolvedValueSetHeader(resolvedValueSetHeader);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_MSG: {
				ResolvedValueSetMsg resolvedValueSetMsg = (ResolvedValueSetMsg) theEObject;
				T result = caseResolvedValueSetMsg(resolvedValueSetMsg);
				if (result == null) {
					result = caseMessage(resolvedValueSetMsg);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_SUMMARY: {
				ResolvedValueSetSummary resolvedValueSetSummary = (ResolvedValueSetSummary) theEObject;
				T result = caseResolvedValueSetSummary(resolvedValueSetSummary);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.SPECIFIC_ENTITY_LIST: {
				SpecificEntityList specificEntityList = (SpecificEntityList) theEObject;
				T result = caseSpecificEntityList(specificEntityList);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION: {
				ValueSetDefinition valueSetDefinition = (ValueSetDefinition) theEObject;
				T result = caseValueSetDefinition(valueSetDefinition);
				if (result == null) {
					result = caseResourceVersionDescription(valueSetDefinition);
				}
				if (result == null) {
					result = caseResourceDescription(valueSetDefinition);
				}
				if (result == null) {
					result = caseChangeable(valueSetDefinition);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_DIRECTORY: {
				ValueSetDefinitionDirectory valueSetDefinitionDirectory = (ValueSetDefinitionDirectory) theEObject;
				T result = caseValueSetDefinitionDirectory(valueSetDefinitionDirectory);
				if (result == null) {
					result = caseDirectory(valueSetDefinitionDirectory);
				}
				if (result == null) {
					result = caseMessage(valueSetDefinitionDirectory);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_DIRECTORY_ENTRY: {
				ValueSetDefinitionDirectoryEntry valueSetDefinitionDirectoryEntry = (ValueSetDefinitionDirectoryEntry) theEObject;
				T result = caseValueSetDefinitionDirectoryEntry(valueSetDefinitionDirectoryEntry);
				if (result == null) {
					result = caseResourceVersionDescriptionDirectoryEntry(valueSetDefinitionDirectoryEntry);
				}
				if (result == null) {
					result = caseResourceDescriptionDirectoryEntry(valueSetDefinitionDirectoryEntry);
				}
				if (result == null) {
					result = caseDirectoryEntry(valueSetDefinitionDirectoryEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY: {
				ValueSetDefinitionEntry valueSetDefinitionEntry = (ValueSetDefinitionEntry) theEObject;
				T result = caseValueSetDefinitionEntry(valueSetDefinitionEntry);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_LIST: {
				ValueSetDefinitionList valueSetDefinitionList = (ValueSetDefinitionList) theEObject;
				T result = caseValueSetDefinitionList(valueSetDefinitionList);
				if (result == null) {
					result = caseDirectory(valueSetDefinitionList);
				}
				if (result == null) {
					result = caseMessage(valueSetDefinitionList);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_LIST_ENTRY: {
				ValueSetDefinitionListEntry valueSetDefinitionListEntry = (ValueSetDefinitionListEntry) theEObject;
				T result = caseValueSetDefinitionListEntry(valueSetDefinitionListEntry);
				if (result == null) {
					result = caseDirectoryEntry(valueSetDefinitionListEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_MSG: {
				ValueSetDefinitionMsg valueSetDefinitionMsg = (ValueSetDefinitionMsg) theEObject;
				T result = caseValueSetDefinitionMsg(valueSetDefinitionMsg);
				if (result == null) {
					result = caseMessage(valueSetDefinitionMsg);
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
	 * Returns the result of interpreting the object as an instance of '<em>Associated Entities Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Associated Entities Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociatedEntitiesReference(AssociatedEntitiesReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complete Code System Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complete Code System Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompleteCodeSystemReference(CompleteCodeSystemReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complete Value Set Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complete Value Set Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompleteValueSetReference(CompleteValueSetReference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>External Value Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Value Set Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalValueSetDefinition(ExternalValueSetDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iteratable Resolved Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iteratable Resolved Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIteratableResolvedValueSet(IteratableResolvedValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Query Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Query Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyQueryReference(PropertyQueryReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolved Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolved Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolvedValueSet(ResolvedValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolved Value Set Directory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolved Value Set Directory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolvedValueSetDirectory(ResolvedValueSetDirectory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolved Value Set Directory Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolved Value Set Directory Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolvedValueSetDirectoryEntry(ResolvedValueSetDirectoryEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolved Value Set Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolved Value Set Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolvedValueSetHeader(ResolvedValueSetHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolved Value Set Msg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolved Value Set Msg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolvedValueSetMsg(ResolvedValueSetMsg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolved Value Set Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolved Value Set Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolvedValueSetSummary(ResolvedValueSetSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Entity List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Entity List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificEntityList(SpecificEntityList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetDefinition(ValueSetDefinition object) {
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
	public T caseValueSetDefinitionDirectory(ValueSetDefinitionDirectory object) {
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
	public T caseValueSetDefinitionDirectoryEntry(ValueSetDefinitionDirectoryEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetDefinitionEntry(ValueSetDefinitionEntry object) {
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
	public T caseValueSetDefinitionList(ValueSetDefinitionList object) {
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
	public T caseValueSetDefinitionListEntry(ValueSetDefinitionListEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Msg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Msg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetDefinitionMsg(ValueSetDefinitionMsg object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Changeable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Changeable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeable(Changeable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceDescription(ResourceDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Version Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Version Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceVersionDescription(ResourceVersionDescription object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Resource Description Directory Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Description Directory Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceDescriptionDirectoryEntry(ResourceDescriptionDirectoryEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Version Description Directory Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Version Description Directory Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceVersionDescriptionDirectoryEntry(ResourceVersionDescriptionDirectoryEntry object) {
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

} // ValueSetDefinitionSwitch
