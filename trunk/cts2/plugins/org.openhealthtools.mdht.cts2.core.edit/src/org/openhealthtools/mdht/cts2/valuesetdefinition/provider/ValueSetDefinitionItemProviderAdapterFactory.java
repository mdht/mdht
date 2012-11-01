/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.openhealthtools.mdht.cts2.valuesetdefinition.util.ValueSetDefinitionAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ValueSetDefinitionItemProviderAdapterFactory extends ValueSetDefinitionAdapterFactory implements
		ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference}
	 * instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssociatedEntitiesReferenceItemProvider associatedEntitiesReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createAssociatedEntitiesReferenceAdapter() {
		if (associatedEntitiesReferenceItemProvider == null) {
			associatedEntitiesReferenceItemProvider = new AssociatedEntitiesReferenceItemProvider(this);
		}

		return associatedEntitiesReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference}
	 * instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CompleteCodeSystemReferenceItemProvider completeCodeSystemReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createCompleteCodeSystemReferenceAdapter() {
		if (completeCodeSystemReferenceItemProvider == null) {
			completeCodeSystemReferenceItemProvider = new CompleteCodeSystemReferenceItemProvider(this);
		}

		return completeCodeSystemReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CompleteValueSetReferenceItemProvider completeValueSetReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createCompleteValueSetReferenceAdapter() {
		if (completeValueSetReferenceItemProvider == null) {
			completeValueSetReferenceItemProvider = new CompleteValueSetReferenceItemProvider(this);
		}

		return completeValueSetReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createDocumentRootAdapter() {
		if (documentRootItemProvider == null) {
			documentRootItemProvider = new DocumentRootItemProvider(this);
		}

		return documentRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ExternalValueSetDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExternalValueSetDefinitionItemProvider externalValueSetDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ExternalValueSetDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createExternalValueSetDefinitionAdapter() {
		if (externalValueSetDefinitionItemProvider == null) {
			externalValueSetDefinitionItemProvider = new ExternalValueSetDefinitionItemProvider(this);
		}

		return externalValueSetDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IteratableResolvedValueSetItemProvider iteratableResolvedValueSetItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createIteratableResolvedValueSetAdapter() {
		if (iteratableResolvedValueSetItemProvider == null) {
			iteratableResolvedValueSetItemProvider = new IteratableResolvedValueSetItemProvider(this);
		}

		return iteratableResolvedValueSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PropertyQueryReferenceItemProvider propertyQueryReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createPropertyQueryReferenceAdapter() {
		if (propertyQueryReferenceItemProvider == null) {
			propertyQueryReferenceItemProvider = new PropertyQueryReferenceItemProvider(this);
		}

		return propertyQueryReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ResolvedValueSetItemProvider resolvedValueSetItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createResolvedValueSetAdapter() {
		if (resolvedValueSetItemProvider == null) {
			resolvedValueSetItemProvider = new ResolvedValueSetItemProvider(this);
		}

		return resolvedValueSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ResolvedValueSetDirectoryItemProvider resolvedValueSetDirectoryItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createResolvedValueSetDirectoryAdapter() {
		if (resolvedValueSetDirectoryItemProvider == null) {
			resolvedValueSetDirectoryItemProvider = new ResolvedValueSetDirectoryItemProvider(this);
		}

		return resolvedValueSetDirectoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectoryEntry}
	 * instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ResolvedValueSetDirectoryEntryItemProvider resolvedValueSetDirectoryEntryItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectoryEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createResolvedValueSetDirectoryEntryAdapter() {
		if (resolvedValueSetDirectoryEntryItemProvider == null) {
			resolvedValueSetDirectoryEntryItemProvider = new ResolvedValueSetDirectoryEntryItemProvider(this);
		}

		return resolvedValueSetDirectoryEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ResolvedValueSetHeaderItemProvider resolvedValueSetHeaderItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createResolvedValueSetHeaderAdapter() {
		if (resolvedValueSetHeaderItemProvider == null) {
			resolvedValueSetHeaderItemProvider = new ResolvedValueSetHeaderItemProvider(this);
		}

		return resolvedValueSetHeaderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetMsg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ResolvedValueSetMsgItemProvider resolvedValueSetMsgItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetMsg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createResolvedValueSetMsgAdapter() {
		if (resolvedValueSetMsgItemProvider == null) {
			resolvedValueSetMsgItemProvider = new ResolvedValueSetMsgItemProvider(this);
		}

		return resolvedValueSetMsgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ResolvedValueSetSummaryItemProvider resolvedValueSetSummaryItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createResolvedValueSetSummaryAdapter() {
		if (resolvedValueSetSummaryItemProvider == null) {
			resolvedValueSetSummaryItemProvider = new ResolvedValueSetSummaryItemProvider(this);
		}

		return resolvedValueSetSummaryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.SpecificEntityList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SpecificEntityListItemProvider specificEntityListItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.SpecificEntityList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createSpecificEntityListAdapter() {
		if (specificEntityListItemProvider == null) {
			specificEntityListItemProvider = new SpecificEntityListItemProvider(this);
		}

		return specificEntityListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetDefinitionItemProvider valueSetDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createValueSetDefinitionAdapter() {
		if (valueSetDefinitionItemProvider == null) {
			valueSetDefinitionItemProvider = new ValueSetDefinitionItemProvider(this);
		}

		return valueSetDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectory}
	 * instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetDefinitionDirectoryItemProvider valueSetDefinitionDirectoryItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createValueSetDefinitionDirectoryAdapter() {
		if (valueSetDefinitionDirectoryItemProvider == null) {
			valueSetDefinitionDirectoryItemProvider = new ValueSetDefinitionDirectoryItemProvider(this);
		}

		return valueSetDefinitionDirectoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectoryEntry}
	 * instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetDefinitionDirectoryEntryItemProvider valueSetDefinitionDirectoryEntryItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectoryEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createValueSetDefinitionDirectoryEntryAdapter() {
		if (valueSetDefinitionDirectoryEntryItemProvider == null) {
			valueSetDefinitionDirectoryEntryItemProvider = new ValueSetDefinitionDirectoryEntryItemProvider(this);
		}

		return valueSetDefinitionDirectoryEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetDefinitionEntryItemProvider valueSetDefinitionEntryItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createValueSetDefinitionEntryAdapter() {
		if (valueSetDefinitionEntryItemProvider == null) {
			valueSetDefinitionEntryItemProvider = new ValueSetDefinitionEntryItemProvider(this);
		}

		return valueSetDefinitionEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetDefinitionListItemProvider valueSetDefinitionListItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createValueSetDefinitionListAdapter() {
		if (valueSetDefinitionListItemProvider == null) {
			valueSetDefinitionListItemProvider = new ValueSetDefinitionListItemProvider(this);
		}

		return valueSetDefinitionListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionListEntry}
	 * instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetDefinitionListEntryItemProvider valueSetDefinitionListEntryItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionListEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createValueSetDefinitionListEntryAdapter() {
		if (valueSetDefinitionListEntryItemProvider == null) {
			valueSetDefinitionListEntryItemProvider = new ValueSetDefinitionListEntryItemProvider(this);
		}

		return valueSetDefinitionListEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionMsg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetDefinitionMsgItemProvider valueSetDefinitionMsgItemProvider;

	/**
	 * This creates an adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionMsg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createValueSetDefinitionMsgAdapter() {
		if (valueSetDefinitionMsgItemProvider == null) {
			valueSetDefinitionMsgItemProvider = new ValueSetDefinitionMsgItemProvider(this);
		}

		return valueSetDefinitionMsgItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null
				? this
				: parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void dispose() {
		if (associatedEntitiesReferenceItemProvider != null) {
			associatedEntitiesReferenceItemProvider.dispose();
		}
		if (completeCodeSystemReferenceItemProvider != null) {
			completeCodeSystemReferenceItemProvider.dispose();
		}
		if (completeValueSetReferenceItemProvider != null) {
			completeValueSetReferenceItemProvider.dispose();
		}
		if (documentRootItemProvider != null) {
			documentRootItemProvider.dispose();
		}
		if (externalValueSetDefinitionItemProvider != null) {
			externalValueSetDefinitionItemProvider.dispose();
		}
		if (iteratableResolvedValueSetItemProvider != null) {
			iteratableResolvedValueSetItemProvider.dispose();
		}
		if (propertyQueryReferenceItemProvider != null) {
			propertyQueryReferenceItemProvider.dispose();
		}
		if (resolvedValueSetItemProvider != null) {
			resolvedValueSetItemProvider.dispose();
		}
		if (resolvedValueSetDirectoryItemProvider != null) {
			resolvedValueSetDirectoryItemProvider.dispose();
		}
		if (resolvedValueSetDirectoryEntryItemProvider != null) {
			resolvedValueSetDirectoryEntryItemProvider.dispose();
		}
		if (resolvedValueSetHeaderItemProvider != null) {
			resolvedValueSetHeaderItemProvider.dispose();
		}
		if (resolvedValueSetMsgItemProvider != null) {
			resolvedValueSetMsgItemProvider.dispose();
		}
		if (resolvedValueSetSummaryItemProvider != null) {
			resolvedValueSetSummaryItemProvider.dispose();
		}
		if (specificEntityListItemProvider != null) {
			specificEntityListItemProvider.dispose();
		}
		if (valueSetDefinitionItemProvider != null) {
			valueSetDefinitionItemProvider.dispose();
		}
		if (valueSetDefinitionDirectoryItemProvider != null) {
			valueSetDefinitionDirectoryItemProvider.dispose();
		}
		if (valueSetDefinitionDirectoryEntryItemProvider != null) {
			valueSetDefinitionDirectoryEntryItemProvider.dispose();
		}
		if (valueSetDefinitionEntryItemProvider != null) {
			valueSetDefinitionEntryItemProvider.dispose();
		}
		if (valueSetDefinitionListItemProvider != null) {
			valueSetDefinitionListItemProvider.dispose();
		}
		if (valueSetDefinitionListEntryItemProvider != null) {
			valueSetDefinitionListEntryItemProvider.dispose();
		}
		if (valueSetDefinitionMsgItemProvider != null) {
			valueSetDefinitionMsgItemProvider.dispose();
		}
	}

}
