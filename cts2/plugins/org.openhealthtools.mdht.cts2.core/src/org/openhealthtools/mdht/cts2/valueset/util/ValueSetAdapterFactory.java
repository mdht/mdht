/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valueset.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.cts2.core.AbstractResourceDescription;
import org.openhealthtools.mdht.cts2.core.AbstractResourceDescriptionDirectoryEntry;
import org.openhealthtools.mdht.cts2.core.Changeable;
import org.openhealthtools.mdht.cts2.core.Directory;
import org.openhealthtools.mdht.cts2.core.DirectoryEntry;
import org.openhealthtools.mdht.cts2.core.Message;
import org.openhealthtools.mdht.cts2.core.ResourceDescription;
import org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry;
import org.openhealthtools.mdht.cts2.valueset.DocumentRoot;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryDirectory;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryList;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryListEntry;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryMsg;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntrySummary;
import org.openhealthtools.mdht.cts2.valueset.ValueSetPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage
 * @generated
 */
public class ValueSetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static ValueSetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ValueSetPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetSwitch<Adapter> modelSwitch = new ValueSetSwitch<Adapter>() {
		@Override
		public Adapter caseDocumentRoot(DocumentRoot object) {
			return createDocumentRootAdapter();
		}

		@Override
		public Adapter caseValueSetCatalogEntry(ValueSetCatalogEntry object) {
			return createValueSetCatalogEntryAdapter();
		}

		@Override
		public Adapter caseValueSetCatalogEntryDirectory(ValueSetCatalogEntryDirectory object) {
			return createValueSetCatalogEntryDirectoryAdapter();
		}

		@Override
		public Adapter caseValueSetCatalogEntryList(ValueSetCatalogEntryList object) {
			return createValueSetCatalogEntryListAdapter();
		}

		@Override
		public Adapter caseValueSetCatalogEntryListEntry(ValueSetCatalogEntryListEntry object) {
			return createValueSetCatalogEntryListEntryAdapter();
		}

		@Override
		public Adapter caseValueSetCatalogEntryMsg(ValueSetCatalogEntryMsg object) {
			return createValueSetCatalogEntryMsgAdapter();
		}

		@Override
		public Adapter caseValueSetCatalogEntrySummary(ValueSetCatalogEntrySummary object) {
			return createValueSetCatalogEntrySummaryAdapter();
		}

		@Override
		public Adapter caseChangeable(Changeable object) {
			return createChangeableAdapter();
		}

		@Override
		public Adapter caseResourceDescription(ResourceDescription object) {
			return createResourceDescriptionAdapter();
		}

		@Override
		public Adapter caseAbstractResourceDescription(AbstractResourceDescription object) {
			return createAbstractResourceDescriptionAdapter();
		}

		@Override
		public Adapter caseMessage(Message object) {
			return createMessageAdapter();
		}

		@Override
		public Adapter caseDirectory(Directory object) {
			return createDirectoryAdapter();
		}

		@Override
		public Adapter caseDirectoryEntry(DirectoryEntry object) {
			return createDirectoryEntryAdapter();
		}

		@Override
		public Adapter caseResourceDescriptionDirectoryEntry(ResourceDescriptionDirectoryEntry object) {
			return createResourceDescriptionDirectoryEntryAdapter();
		}

		@Override
		public Adapter caseAbstractResourceDescriptionDirectoryEntry(AbstractResourceDescriptionDirectoryEntry object) {
			return createAbstractResourceDescriptionDirectoryEntryAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valueset.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry <em>Catalog Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry
	 * @generated
	 */
	public Adapter createValueSetCatalogEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryDirectory
	 * <em>Catalog Entry Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryDirectory
	 * @generated
	 */
	public Adapter createValueSetCatalogEntryDirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryList
	 * <em>Catalog Entry List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryList
	 * @generated
	 */
	public Adapter createValueSetCatalogEntryListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryListEntry
	 * <em>Catalog Entry List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryListEntry
	 * @generated
	 */
	public Adapter createValueSetCatalogEntryListEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryMsg <em>Catalog Entry Msg</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryMsg
	 * @generated
	 */
	public Adapter createValueSetCatalogEntryMsgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntrySummary
	 * <em>Catalog Entry Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntrySummary
	 * @generated
	 */
	public Adapter createValueSetCatalogEntrySummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Changeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Changeable
	 * @generated
	 */
	public Adapter createChangeableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription <em>Resource Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescription
	 * @generated
	 */
	public Adapter createResourceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.AbstractResourceDescription
	 * <em>Abstract Resource Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.AbstractResourceDescription
	 * @generated
	 */
	public Adapter createAbstractResourceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Directory
	 * @generated
	 */
	public Adapter createDirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.DirectoryEntry <em>Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.DirectoryEntry
	 * @generated
	 */
	public Adapter createDirectoryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry
	 * <em>Resource Description Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry
	 * @generated
	 */
	public Adapter createResourceDescriptionDirectoryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.AbstractResourceDescriptionDirectoryEntry
	 * <em>Abstract Resource Description Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.AbstractResourceDescriptionDirectoryEntry
	 * @generated
	 */
	public Adapter createAbstractResourceDescriptionDirectoryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // ValueSetAdapterFactory
