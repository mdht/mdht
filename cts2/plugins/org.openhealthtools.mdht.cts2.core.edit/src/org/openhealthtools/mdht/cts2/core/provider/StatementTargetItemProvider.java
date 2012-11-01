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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.openhealthtools.mdht.cts2.association.provider.Cts2EditPlugin;

import org.openhealthtools.mdht.cts2.core.CoreFactory;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.StatementTarget;

import org.openhealthtools.mdht.cts2.entity.EntityFactory;

import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionFactory;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.core.StatementTarget} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class StatementTargetItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatementTargetItemProvider(AdapterFactory adapterFactory) {
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

			addResourcePropertyDescriptor(object);
			addExternalIdentifierPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_StatementTarget_resource_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_StatementTarget_resource_feature",
				"_UI_StatementTarget_type"), CorePackage.Literals.STATEMENT_TARGET__RESOURCE, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the External Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addExternalIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_StatementTarget_externalIdentifier_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_StatementTarget_externalIdentifier_feature",
				"_UI_StatementTarget_type"), CorePackage.Literals.STATEMENT_TARGET__EXTERNAL_IDENTIFIER, true, false,
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
			childrenFeatures.add(CorePackage.Literals.STATEMENT_TARGET__ENTITY);
			childrenFeatures.add(CorePackage.Literals.STATEMENT_TARGET__LITERAL);
			childrenFeatures.add(CorePackage.Literals.STATEMENT_TARGET__BNODE);
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
	 * This returns StatementTarget.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StatementTarget"));
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
		String label = ((StatementTarget) object).getResource();
		return label == null || label.length() == 0
				? getString("_UI_StatementTarget_type")
				: getString("_UI_StatementTarget_type") + " " + label;
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

		switch (notification.getFeatureID(StatementTarget.class)) {
			case CorePackage.STATEMENT_TARGET__RESOURCE:
			case CorePackage.STATEMENT_TARGET__EXTERNAL_IDENTIFIER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.STATEMENT_TARGET__ENTITY:
			case CorePackage.STATEMENT_TARGET__LITERAL:
			case CorePackage.STATEMENT_TARGET__BNODE:
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
			CorePackage.Literals.STATEMENT_TARGET__ENTITY, CoreFactory.eINSTANCE.createURIAndEntityName()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.STATEMENT_TARGET__ENTITY, CoreFactory.eINSTANCE.createEntitySynopsis()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.STATEMENT_TARGET__ENTITY, CoreFactory.eINSTANCE.createPredicateReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.STATEMENT_TARGET__LITERAL, CoreFactory.eINSTANCE.createOpaqueData()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.STATEMENT_TARGET__LITERAL, CoreFactory.eINSTANCE.createEntryDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.STATEMENT_TARGET__LITERAL, CoreFactory.eINSTANCE.createComment()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.STATEMENT_TARGET__LITERAL, CoreFactory.eINSTANCE.createDefinition()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.STATEMENT_TARGET__LITERAL, CoreFactory.eINSTANCE.createExample()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.STATEMENT_TARGET__LITERAL, EntityFactory.eINSTANCE.createDesignation()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.STATEMENT_TARGET__LITERAL,
			ValueSetDefinitionFactory.eINSTANCE.createExternalValueSetDefinition()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.STATEMENT_TARGET__BNODE, CoreFactory.eINSTANCE.createAnonymousStatement()));
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
