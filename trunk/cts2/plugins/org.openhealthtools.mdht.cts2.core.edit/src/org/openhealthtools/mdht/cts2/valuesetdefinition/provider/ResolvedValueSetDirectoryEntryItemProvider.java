/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectoryEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectoryEntry} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResolvedValueSetDirectoryEntryItemProvider extends ResolvedValueSetSummaryItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResolvedValueSetDirectoryEntryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addHrefPropertyDescriptor(object);
			addMatchStrengthPropertyDescriptor(object);
			addResourceNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Href feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addHrefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ResolvedValueSetDirectoryEntry_href_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ResolvedValueSetDirectoryEntry_href_feature",
				"_UI_ResolvedValueSetDirectoryEntry_type"),
			ValueSetDefinitionPackage.Literals.RESOLVED_VALUE_SET_DIRECTORY_ENTRY__HREF, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Match Strength feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addMatchStrengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ResolvedValueSetDirectoryEntry_matchStrength_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ResolvedValueSetDirectoryEntry_matchStrength_feature",
				"_UI_ResolvedValueSetDirectoryEntry_type"),
			ValueSetDefinitionPackage.Literals.RESOLVED_VALUE_SET_DIRECTORY_ENTRY__MATCH_STRENGTH, true, false, false,
			ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Resource Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addResourceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ResolvedValueSetDirectoryEntry_resourceName_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ResolvedValueSetDirectoryEntry_resourceName_feature",
				"_UI_ResolvedValueSetDirectoryEntry_type"),
			ValueSetDefinitionPackage.Literals.RESOLVED_VALUE_SET_DIRECTORY_ENTRY__RESOURCE_NAME, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ResolvedValueSetDirectoryEntry.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ResolvedValueSetDirectoryEntry"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ResolvedValueSetDirectoryEntry) object).getResourceName();
		return label == null || label.length() == 0
				? getString("_UI_ResolvedValueSetDirectoryEntry_type")
				: getString("_UI_ResolvedValueSetDirectoryEntry_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ResolvedValueSetDirectoryEntry.class)) {
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_DIRECTORY_ENTRY__HREF:
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_DIRECTORY_ENTRY__MATCH_STRENGTH:
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_DIRECTORY_ENTRY__RESOURCE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
