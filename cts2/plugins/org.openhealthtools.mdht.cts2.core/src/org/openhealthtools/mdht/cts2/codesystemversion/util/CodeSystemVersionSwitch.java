/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.codesystemversion.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryDirectory;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryList;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryListEntry;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryMsg;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage;
import org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot;
import org.openhealthtools.mdht.cts2.core.Changeable;
import org.openhealthtools.mdht.cts2.core.Directory;
import org.openhealthtools.mdht.cts2.core.DirectoryEntry;
import org.openhealthtools.mdht.cts2.core.Message;
import org.openhealthtools.mdht.cts2.core.ResourceDescription;
import org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry;
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescription;
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry;

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
 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage
 * @generated
 */
public class CodeSystemVersionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static CodeSystemVersionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionSwitch() {
		if (modelPackage == null) {
			modelPackage = CodeSystemVersionPackage.eINSTANCE;
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY: {
				CodeSystemVersionCatalogEntry codeSystemVersionCatalogEntry = (CodeSystemVersionCatalogEntry) theEObject;
				T result = caseCodeSystemVersionCatalogEntry(codeSystemVersionCatalogEntry);
				if (result == null) {
					result = caseResourceVersionDescription(codeSystemVersionCatalogEntry);
				}
				if (result == null) {
					result = caseResourceDescription(codeSystemVersionCatalogEntry);
				}
				if (result == null) {
					result = caseChangeable(codeSystemVersionCatalogEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY: {
				CodeSystemVersionCatalogEntryDirectory codeSystemVersionCatalogEntryDirectory = (CodeSystemVersionCatalogEntryDirectory) theEObject;
				T result = caseCodeSystemVersionCatalogEntryDirectory(codeSystemVersionCatalogEntryDirectory);
				if (result == null) {
					result = caseDirectory(codeSystemVersionCatalogEntryDirectory);
				}
				if (result == null) {
					result = caseMessage(codeSystemVersionCatalogEntryDirectory);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST: {
				CodeSystemVersionCatalogEntryList codeSystemVersionCatalogEntryList = (CodeSystemVersionCatalogEntryList) theEObject;
				T result = caseCodeSystemVersionCatalogEntryList(codeSystemVersionCatalogEntryList);
				if (result == null) {
					result = caseDirectory(codeSystemVersionCatalogEntryList);
				}
				if (result == null) {
					result = caseMessage(codeSystemVersionCatalogEntryList);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY: {
				CodeSystemVersionCatalogEntryListEntry codeSystemVersionCatalogEntryListEntry = (CodeSystemVersionCatalogEntryListEntry) theEObject;
				T result = caseCodeSystemVersionCatalogEntryListEntry(codeSystemVersionCatalogEntryListEntry);
				if (result == null) {
					result = caseDirectoryEntry(codeSystemVersionCatalogEntryListEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG: {
				CodeSystemVersionCatalogEntryMsg codeSystemVersionCatalogEntryMsg = (CodeSystemVersionCatalogEntryMsg) theEObject;
				T result = caseCodeSystemVersionCatalogEntryMsg(codeSystemVersionCatalogEntryMsg);
				if (result == null) {
					result = caseMessage(codeSystemVersionCatalogEntryMsg);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY: {
				CodeSystemVersionCatalogEntrySummary codeSystemVersionCatalogEntrySummary = (CodeSystemVersionCatalogEntrySummary) theEObject;
				T result = caseCodeSystemVersionCatalogEntrySummary(codeSystemVersionCatalogEntrySummary);
				if (result == null) {
					result = caseResourceVersionDescriptionDirectoryEntry(codeSystemVersionCatalogEntrySummary);
				}
				if (result == null) {
					result = caseResourceDescriptionDirectoryEntry(codeSystemVersionCatalogEntrySummary);
				}
				if (result == null) {
					result = caseDirectoryEntry(codeSystemVersionCatalogEntrySummary);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CodeSystemVersionPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot) theEObject;
				T result = caseDocumentRoot(documentRoot);
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
	 * Returns the result of interpreting the object as an instance of '<em>Catalog Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemVersionCatalogEntry(CodeSystemVersionCatalogEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog Entry Directory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog Entry Directory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemVersionCatalogEntryDirectory(CodeSystemVersionCatalogEntryDirectory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog Entry List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog Entry List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemVersionCatalogEntryList(CodeSystemVersionCatalogEntryList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog Entry List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog Entry List Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemVersionCatalogEntryListEntry(CodeSystemVersionCatalogEntryListEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog Entry Msg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog Entry Msg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemVersionCatalogEntryMsg(CodeSystemVersionCatalogEntryMsg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog Entry Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog Entry Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemVersionCatalogEntrySummary(CodeSystemVersionCatalogEntrySummary object) {
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

} // CodeSystemVersionSwitch
