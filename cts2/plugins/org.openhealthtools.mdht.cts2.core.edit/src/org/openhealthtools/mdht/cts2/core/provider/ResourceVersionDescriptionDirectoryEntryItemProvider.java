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
package org.openhealthtools.mdht.cts2.core.provider;

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

import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResourceVersionDescriptionDirectoryEntryItemProvider extends ResourceDescriptionDirectoryEntryItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceVersionDescriptionDirectoryEntryItemProvider(AdapterFactory adapterFactory) {
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

			addOfficialResourceVersionIdPropertyDescriptor(object);
			addOfficialReleaseDatePropertyDescriptor(object);
			addDocumentURIPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Official Resource Version Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addOfficialResourceVersionIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ResourceVersionDescriptionDirectoryEntry_officialResourceVersionId_feature"),
			getString(
				"_UI_PropertyDescriptor_description",
				"_UI_ResourceVersionDescriptionDirectoryEntry_officialResourceVersionId_feature",
				"_UI_ResourceVersionDescriptionDirectoryEntry_type"),
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RESOURCE_VERSION_ID, true,
			false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Official Release Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addOfficialReleaseDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ResourceVersionDescriptionDirectoryEntry_officialReleaseDate_feature"),
			getString(
				"_UI_PropertyDescriptor_description",
				"_UI_ResourceVersionDescriptionDirectoryEntry_officialReleaseDate_feature",
				"_UI_ResourceVersionDescriptionDirectoryEntry_type"),
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RELEASE_DATE, true, false,
			false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Document URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDocumentURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ResourceVersionDescriptionDirectoryEntry_documentURI_feature"),
			getString(
				"_UI_PropertyDescriptor_description",
				"_UI_ResourceVersionDescriptionDirectoryEntry_documentURI_feature",
				"_UI_ResourceVersionDescriptionDirectoryEntry_type"),
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__DOCUMENT_URI, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ResourceVersionDescriptionDirectoryEntry.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(
			object, getResourceLocator().getImage("full/obj16/ResourceVersionDescriptionDirectoryEntry"));
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
		String label = ((ResourceVersionDescriptionDirectoryEntry) object).getResourceName();
		return label == null || label.length() == 0
				? getString("_UI_ResourceVersionDescriptionDirectoryEntry_type")
				: getString("_UI_ResourceVersionDescriptionDirectoryEntry_type") + " " + label;
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

		switch (notification.getFeatureID(ResourceVersionDescriptionDirectoryEntry.class)) {
			case CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RESOURCE_VERSION_ID:
			case CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RELEASE_DATE:
			case CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__DOCUMENT_URI:
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
