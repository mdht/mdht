/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
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

import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage;

import org.openhealthtools.mdht.cts2.core.CoreFactory;
import org.openhealthtools.mdht.cts2.core.CorePackage;

import org.openhealthtools.mdht.cts2.core.provider.ResourceVersionDescriptionItemProvider;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CodeSystemVersionCatalogEntryItemProvider extends ResourceVersionDescriptionItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionCatalogEntryItemProvider(AdapterFactory adapterFactory) {
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

			addEntityDescriptionsPropertyDescriptor(object);
			addAssociationsPropertyDescriptor(object);
			addClassesPropertyDescriptor(object);
			addRolesPropertyDescriptor(object);
			addIndividualsPropertyDescriptor(object);
			addCodeSystemVersionNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Entity Descriptions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addEntityDescriptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_CodeSystemVersionCatalogEntry_entityDescriptions_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_CodeSystemVersionCatalogEntry_entityDescriptions_feature",
				"_UI_CodeSystemVersionCatalogEntry_type"),
			CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ENTITY_DESCRIPTIONS, true, false,
			false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Associations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAssociationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_CodeSystemVersionCatalogEntry_associations_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_CodeSystemVersionCatalogEntry_associations_feature",
				"_UI_CodeSystemVersionCatalogEntry_type"),
			CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ASSOCIATIONS, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Classes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addClassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_CodeSystemVersionCatalogEntry_classes_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_CodeSystemVersionCatalogEntry_classes_feature",
				"_UI_CodeSystemVersionCatalogEntry_type"),
			CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY__CLASSES, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Roles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addRolesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_CodeSystemVersionCatalogEntry_roles_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_CodeSystemVersionCatalogEntry_roles_feature",
				"_UI_CodeSystemVersionCatalogEntry_type"),
			CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ROLES, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Individuals feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIndividualsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_CodeSystemVersionCatalogEntry_individuals_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_CodeSystemVersionCatalogEntry_individuals_feature",
				"_UI_CodeSystemVersionCatalogEntry_type"),
			CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY__INDIVIDUALS, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			getString("_UI_CodeSystemVersionCatalogEntry_codeSystemVersionName_feature"),
			getString(
				"_UI_PropertyDescriptor_description",
				"_UI_CodeSystemVersionCatalogEntry_codeSystemVersionName_feature",
				"_UI_CodeSystemVersionCatalogEntry_type"),
			CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY__CODE_SYSTEM_VERSION_NAME, true, false,
			false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY__VERSION_OF);
			childrenFeatures.add(CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY__IMPORTS);
			childrenFeatures.add(CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY__DEFAULT_LANGUAGE);
			childrenFeatures.add(CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY__SUPPORTED_LANGUAGE);
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
	 * This returns CodeSystemVersionCatalogEntry.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CodeSystemVersionCatalogEntry"));
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
		String label = ((CodeSystemVersionCatalogEntry) object).getFormalName();
		return label == null || label.length() == 0
				? getString("_UI_CodeSystemVersionCatalogEntry_type")
				: getString("_UI_CodeSystemVersionCatalogEntry_type") + " " + label;
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

		switch (notification.getFeatureID(CodeSystemVersionCatalogEntry.class)) {
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ENTITY_DESCRIPTIONS:
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ASSOCIATIONS:
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__CLASSES:
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__ROLES:
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__INDIVIDUALS:
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__CODE_SYSTEM_VERSION_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__VERSION_OF:
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__IMPORTS:
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__DEFAULT_LANGUAGE:
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY__SUPPORTED_LANGUAGE:
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
			CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY__VERSION_OF,
			CoreFactory.eINSTANCE.createCodeSystemReference()));

		newChildDescriptors.add(createChildParameter(
			CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY__IMPORTS,
			CoreFactory.eINSTANCE.createCodeSystemVersionReference()));

		newChildDescriptors.add(createChildParameter(
			CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY__DEFAULT_LANGUAGE,
			CoreFactory.eINSTANCE.createLanguageReference()));

		newChildDescriptors.add(createChildParameter(
			CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY__SUPPORTED_LANGUAGE,
			CoreFactory.eINSTANCE.createLanguageReference()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == CorePackage.Literals.CHANGEABLE__STATUS ||
				childFeature == CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR ||
				childFeature == CorePackage.Literals.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS ||
				childFeature == CorePackage.Literals.RESOURCE_DESCRIPTION__RIGHTS ||
				childFeature == CorePackage.Literals.RESOURCE_DESCRIPTION__NOTE ||
				childFeature == CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY__VERSION_OF ||
				childFeature == CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY__DEFAULT_LANGUAGE ||
				childFeature == CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY__SUPPORTED_LANGUAGE;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] {
					getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
