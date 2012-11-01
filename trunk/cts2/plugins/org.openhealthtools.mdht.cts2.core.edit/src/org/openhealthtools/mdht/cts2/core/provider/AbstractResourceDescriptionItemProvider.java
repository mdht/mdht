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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.openhealthtools.mdht.cts2.core.AbstractResourceDescription;
import org.openhealthtools.mdht.cts2.core.CoreFactory;
import org.openhealthtools.mdht.cts2.core.CorePackage;

import org.openhealthtools.mdht.cts2.entity.EntityFactory;

import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionFactory;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.core.AbstractResourceDescription} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class AbstractResourceDescriptionItemProvider extends ResourceDescriptionItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AbstractResourceDescriptionItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(CorePackage.Literals.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION);
			childrenFeatures.add(CorePackage.Literals.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_FORMAT);
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
		String label = ((AbstractResourceDescription) object).getFormalName();
		return label == null || label.length() == 0
				? getString("_UI_AbstractResourceDescription_type")
				: getString("_UI_AbstractResourceDescription_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractResourceDescription.class)) {
			case CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION:
			case CorePackage.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_FORMAT:
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
			CorePackage.Literals.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION,
			CoreFactory.eINSTANCE.createOpaqueData()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION,
			CoreFactory.eINSTANCE.createEntryDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION,
			CoreFactory.eINSTANCE.createComment()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION,
			CoreFactory.eINSTANCE.createDefinition()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION,
			CoreFactory.eINSTANCE.createExample()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION,
			EntityFactory.eINSTANCE.createDesignation()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION,
			ValueSetDefinitionFactory.eINSTANCE.createExternalValueSetDefinition()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_FORMAT,
			CoreFactory.eINSTANCE.createSourceAndNotation()));
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
				childFeature == CorePackage.Literals.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION ||
				childFeature == CorePackage.Literals.RESOURCE_DESCRIPTION__NOTE;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] {
					getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
