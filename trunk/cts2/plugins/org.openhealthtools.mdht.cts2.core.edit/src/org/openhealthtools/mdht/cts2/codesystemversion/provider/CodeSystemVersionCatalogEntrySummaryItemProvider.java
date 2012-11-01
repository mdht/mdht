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
package org.openhealthtools.mdht.cts2.codesystemversion.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.openhealthtools.mdht.cts2.association.provider.Cts2EditPlugin;

import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage;

import org.openhealthtools.mdht.cts2.core.CoreFactory;

import org.openhealthtools.mdht.cts2.core.provider.ResourceVersionDescriptionDirectoryEntryItemProvider;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CodeSystemVersionCatalogEntrySummaryItemProvider extends
		ResourceVersionDescriptionDirectoryEntryItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionCatalogEntrySummaryItemProvider(AdapterFactory adapterFactory) {
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

			addCodeSystemVersionNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Code System Version Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCodeSystemVersionNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_CodeSystemVersionCatalogEntrySummary_codeSystemVersionName_feature"),
			getString(
				"_UI_PropertyDescriptor_description",
				"_UI_CodeSystemVersionCatalogEntrySummary_codeSystemVersionName_feature",
				"_UI_CodeSystemVersionCatalogEntrySummary_type"),
			CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_NAME,
			true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__VERSION_OF);
			childrenFeatures.add(CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_TAG);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CodeSystemVersionCatalogEntrySummary.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CodeSystemVersionCatalogEntrySummary"));
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
		String label = ((CodeSystemVersionCatalogEntrySummary) object).getResourceName();
		return label == null || label.length() == 0
				? getString("_UI_CodeSystemVersionCatalogEntrySummary_type")
				: getString("_UI_CodeSystemVersionCatalogEntrySummary_type") + " " + label;
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

		switch (notification.getFeatureID(CodeSystemVersionCatalogEntrySummary.class)) {
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__VERSION_OF:
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_TAG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(
			CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__VERSION_OF,
			CoreFactory.eINSTANCE.createCodeSystemReference()));

		newChildDescriptors.add(createChildParameter(
			CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY_SUMMARY__CODE_SYSTEM_VERSION_TAG,
			CoreFactory.eINSTANCE.createVersionTagReference()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Cts2EditPlugin.INSTANCE;
	}

}
