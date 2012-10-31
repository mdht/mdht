/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valueset.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.cts2.valueset.DocumentRoot;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryDirectory;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryList;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryListEntry;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryMsg;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntrySummary;
import org.openhealthtools.mdht.cts2.valueset.ValueSetFactory;
import org.openhealthtools.mdht.cts2.valueset.ValueSetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ValueSetFactoryImpl extends EFactoryImpl implements ValueSetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ValueSetFactory init() {
		try {
			ValueSetFactory theValueSetFactory = (ValueSetFactory) EPackage.Registry.INSTANCE.getEFactory("http://schema.omg.org/spec/CTS2/1.0/ValueSet");
			if (theValueSetFactory != null) {
				return theValueSetFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ValueSetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetFactoryImpl() {
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
			case ValueSetPackage.DOCUMENT_ROOT:
				return createDocumentRoot();
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY:
				return createValueSetCatalogEntry();
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_DIRECTORY:
				return createValueSetCatalogEntryDirectory();
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_LIST:
				return createValueSetCatalogEntryList();
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_LIST_ENTRY:
				return createValueSetCatalogEntryListEntry();
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_MSG:
				return createValueSetCatalogEntryMsg();
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_SUMMARY:
				return createValueSetCatalogEntrySummary();
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
	public ValueSetCatalogEntry createValueSetCatalogEntry() {
		ValueSetCatalogEntryImpl valueSetCatalogEntry = new ValueSetCatalogEntryImpl();
		return valueSetCatalogEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetCatalogEntryDirectory createValueSetCatalogEntryDirectory() {
		ValueSetCatalogEntryDirectoryImpl valueSetCatalogEntryDirectory = new ValueSetCatalogEntryDirectoryImpl();
		return valueSetCatalogEntryDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetCatalogEntryList createValueSetCatalogEntryList() {
		ValueSetCatalogEntryListImpl valueSetCatalogEntryList = new ValueSetCatalogEntryListImpl();
		return valueSetCatalogEntryList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetCatalogEntryListEntry createValueSetCatalogEntryListEntry() {
		ValueSetCatalogEntryListEntryImpl valueSetCatalogEntryListEntry = new ValueSetCatalogEntryListEntryImpl();
		return valueSetCatalogEntryListEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetCatalogEntryMsg createValueSetCatalogEntryMsg() {
		ValueSetCatalogEntryMsgImpl valueSetCatalogEntryMsg = new ValueSetCatalogEntryMsgImpl();
		return valueSetCatalogEntryMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetCatalogEntrySummary createValueSetCatalogEntrySummary() {
		ValueSetCatalogEntrySummaryImpl valueSetCatalogEntrySummary = new ValueSetCatalogEntrySummaryImpl();
		return valueSetCatalogEntrySummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetPackage getValueSetPackage() {
		return (ValueSetPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ValueSetPackage getPackage() {
		return ValueSetPackage.eINSTANCE;
	}

} // ValueSetFactoryImpl
