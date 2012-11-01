/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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

import org.openhealthtools.mdht.cts2.core.CoreFactory;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.ResourceDescription;

import org.openhealthtools.mdht.cts2.entity.EntityFactory;

import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionFactory;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.core.ResourceDescription} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResourceDescriptionItemProvider extends ChangeableItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceDescriptionItemProvider(AdapterFactory adapterFactory) {
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

			addKeywordPropertyDescriptor(object);
			addAdditionalDocumentationPropertyDescriptor(object);
			addAlternateIDPropertyDescriptor(object);
			addSourceStatementsPropertyDescriptor(object);
			addAboutPropertyDescriptor(object);
			addFormalNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Keyword feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addKeywordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ResourceDescription_keyword_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ResourceDescription_keyword_feature",
				"_UI_ResourceDescription_type"), CorePackage.Literals.RESOURCE_DESCRIPTION__KEYWORD, true, false,
			false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Additional Documentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAdditionalDocumentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ResourceDescription_additionalDocumentation_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ResourceDescription_additionalDocumentation_feature",
				"_UI_ResourceDescription_type"), CorePackage.Literals.RESOURCE_DESCRIPTION__ADDITIONAL_DOCUMENTATION,
			true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Alternate ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAlternateIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ResourceDescription_alternateID_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ResourceDescription_alternateID_feature",
				"_UI_ResourceDescription_type"), CorePackage.Literals.RESOURCE_DESCRIPTION__ALTERNATE_ID, true, false,
			false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Source Statements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSourceStatementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ResourceDescription_sourceStatements_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ResourceDescription_sourceStatements_feature",
				"_UI_ResourceDescription_type"), CorePackage.Literals.RESOURCE_DESCRIPTION__SOURCE_STATEMENTS, true,
			false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the About feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAboutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ResourceDescription_about_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ResourceDescription_about_feature",
				"_UI_ResourceDescription_type"), CorePackage.Literals.RESOURCE_DESCRIPTION__ABOUT, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Formal Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFormalNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ResourceDescription_formalName_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ResourceDescription_formalName_feature",
				"_UI_ResourceDescription_type"), CorePackage.Literals.RESOURCE_DESCRIPTION__FORMAL_NAME, true, false,
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
			childrenFeatures.add(CorePackage.Literals.RESOURCE_DESCRIPTION__RESOURCE_TYPE);
			childrenFeatures.add(CorePackage.Literals.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS);
			childrenFeatures.add(CorePackage.Literals.RESOURCE_DESCRIPTION__SOURCE_AND_ROLE);
			childrenFeatures.add(CorePackage.Literals.RESOURCE_DESCRIPTION__RIGHTS);
			childrenFeatures.add(CorePackage.Literals.RESOURCE_DESCRIPTION__NOTE);
			childrenFeatures.add(CorePackage.Literals.RESOURCE_DESCRIPTION__PROPERTY);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ResourceDescription) object).getFormalName();
		return label == null || label.length() == 0
				? getString("_UI_ResourceDescription_type")
				: getString("_UI_ResourceDescription_type") + " " + label;
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

		switch (notification.getFeatureID(ResourceDescription.class)) {
			case CorePackage.RESOURCE_DESCRIPTION__KEYWORD:
			case CorePackage.RESOURCE_DESCRIPTION__ADDITIONAL_DOCUMENTATION:
			case CorePackage.RESOURCE_DESCRIPTION__ALTERNATE_ID:
			case CorePackage.RESOURCE_DESCRIPTION__SOURCE_STATEMENTS:
			case CorePackage.RESOURCE_DESCRIPTION__ABOUT:
			case CorePackage.RESOURCE_DESCRIPTION__FORMAL_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.RESOURCE_DESCRIPTION__RESOURCE_TYPE:
			case CorePackage.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS:
			case CorePackage.RESOURCE_DESCRIPTION__SOURCE_AND_ROLE:
			case CorePackage.RESOURCE_DESCRIPTION__RIGHTS:
			case CorePackage.RESOURCE_DESCRIPTION__NOTE:
			case CorePackage.RESOURCE_DESCRIPTION__PROPERTY:
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
			CorePackage.Literals.RESOURCE_DESCRIPTION__RESOURCE_TYPE, CoreFactory.eINSTANCE.createURIAndEntityName()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_DESCRIPTION__RESOURCE_TYPE, CoreFactory.eINSTANCE.createEntitySynopsis()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_DESCRIPTION__RESOURCE_TYPE, CoreFactory.eINSTANCE.createPredicateReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS,
			CoreFactory.eINSTANCE.createEntryDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS, CoreFactory.eINSTANCE.createComment()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS, CoreFactory.eINSTANCE.createDefinition()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS, CoreFactory.eINSTANCE.createExample()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS, EntityFactory.eINSTANCE.createDesignation()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_DESCRIPTION__SOURCE_AND_ROLE,
			CoreFactory.eINSTANCE.createSourceAndRoleReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_DESCRIPTION__RIGHTS, CoreFactory.eINSTANCE.createOpaqueData()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_DESCRIPTION__RIGHTS, CoreFactory.eINSTANCE.createEntryDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_DESCRIPTION__RIGHTS, CoreFactory.eINSTANCE.createComment()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_DESCRIPTION__RIGHTS, CoreFactory.eINSTANCE.createDefinition()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_DESCRIPTION__RIGHTS, CoreFactory.eINSTANCE.createExample()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_DESCRIPTION__RIGHTS, EntityFactory.eINSTANCE.createDesignation()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_DESCRIPTION__RIGHTS,
			ValueSetDefinitionFactory.eINSTANCE.createExternalValueSetDefinition()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_DESCRIPTION__NOTE, CoreFactory.eINSTANCE.createComment()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_DESCRIPTION__PROPERTY, CoreFactory.eINSTANCE.createProperty()));
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

		boolean qualify = childFeature == CorePackage.Literals.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS ||
				childFeature == CorePackage.Literals.RESOURCE_DESCRIPTION__RIGHTS ||
				childFeature == CorePackage.Literals.RESOURCE_DESCRIPTION__NOTE;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] {
					getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
