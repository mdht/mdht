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

import org.openhealthtools.mdht.cts2.core.AssociationDirection;
import org.openhealthtools.mdht.cts2.core.CoreFactory;

import org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class AssociatedEntitiesReferenceItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociatedEntitiesReferenceItemProvider(AdapterFactory adapterFactory) {
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

			addDirectionPropertyDescriptor(object);
			addLeafOnlyPropertyDescriptor(object);
			addTransitivityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_AssociatedEntitiesReference_direction_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_AssociatedEntitiesReference_direction_feature",
				"_UI_AssociatedEntitiesReference_type"),
			ValueSetDefinitionPackage.Literals.ASSOCIATED_ENTITIES_REFERENCE__DIRECTION, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Leaf Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLeafOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_AssociatedEntitiesReference_leafOnly_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_AssociatedEntitiesReference_leafOnly_feature",
				"_UI_AssociatedEntitiesReference_type"),
			ValueSetDefinitionPackage.Literals.ASSOCIATED_ENTITIES_REFERENCE__LEAF_ONLY, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Transitivity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTransitivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_AssociatedEntitiesReference_transitivity_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_AssociatedEntitiesReference_transitivity_feature",
				"_UI_AssociatedEntitiesReference_type"),
			ValueSetDefinitionPackage.Literals.ASSOCIATED_ENTITIES_REFERENCE__TRANSITIVITY, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.ASSOCIATED_ENTITIES_REFERENCE__REFERENCED_ENTITY);
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM);
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM_VERSION);
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.ASSOCIATED_ENTITIES_REFERENCE__PREDICATE);
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
	 * This returns AssociatedEntitiesReference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssociatedEntitiesReference"));
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
		AssociationDirection labelValue = ((AssociatedEntitiesReference) object).getDirection();
		String label = labelValue == null
				? null
				: labelValue.toString();
		return label == null || label.length() == 0
				? getString("_UI_AssociatedEntitiesReference_type")
				: getString("_UI_AssociatedEntitiesReference_type") + " " + label;
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

		switch (notification.getFeatureID(AssociatedEntitiesReference.class)) {
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__DIRECTION:
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__LEAF_ONLY:
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__TRANSITIVITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__REFERENCED_ENTITY:
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM:
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM_VERSION:
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE__PREDICATE:
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
			ValueSetDefinitionPackage.Literals.ASSOCIATED_ENTITIES_REFERENCE__REFERENCED_ENTITY,
			CoreFactory.eINSTANCE.createURIAndEntityName()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.ASSOCIATED_ENTITIES_REFERENCE__REFERENCED_ENTITY,
			CoreFactory.eINSTANCE.createEntitySynopsis()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.ASSOCIATED_ENTITIES_REFERENCE__REFERENCED_ENTITY,
			CoreFactory.eINSTANCE.createPredicateReference()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM,
			CoreFactory.eINSTANCE.createCodeSystemReference()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.ASSOCIATED_ENTITIES_REFERENCE__CODE_SYSTEM_VERSION,
			CoreFactory.eINSTANCE.createCodeSystemVersionReference()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.ASSOCIATED_ENTITIES_REFERENCE__PREDICATE,
			CoreFactory.eINSTANCE.createPredicateReference()));
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

		boolean qualify = childFeature == ValueSetDefinitionPackage.Literals.ASSOCIATED_ENTITIES_REFERENCE__REFERENCED_ENTITY ||
				childFeature == ValueSetDefinitionPackage.Literals.ASSOCIATED_ENTITIES_REFERENCE__PREDICATE;

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
