/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition.provider;

import java.math.BigInteger;

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

import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionFactory;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ValueSetDefinitionEntryItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionEntryItemProvider(AdapterFactory adapterFactory) {
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

			addEntryOrderPropertyDescriptor(object);
			addOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Entry Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addEntryOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ValueSetDefinitionEntry_entryOrder_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ValueSetDefinitionEntry_entryOrder_feature",
				"_UI_ValueSetDefinitionEntry_type"),
			ValueSetDefinitionPackage.Literals.VALUE_SET_DEFINITION_ENTRY__ENTRY_ORDER, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ValueSetDefinitionEntry_operator_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ValueSetDefinitionEntry_operator_feature",
				"_UI_ValueSetDefinitionEntry_type"),
			ValueSetDefinitionPackage.Literals.VALUE_SET_DEFINITION_ENTRY__OPERATOR, true, false, false,
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
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.VALUE_SET_DEFINITION_ENTRY__ASSOCIATED_ENTITIES);
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.VALUE_SET_DEFINITION_ENTRY__COMPLETE_CODE_SYSTEM);
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.VALUE_SET_DEFINITION_ENTRY__COMPLETE_VALUE_SET);
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.VALUE_SET_DEFINITION_ENTRY__EXTERNAL_VALUE_SET_DEFINITION);
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.VALUE_SET_DEFINITION_ENTRY__PROPERTY_QUERY);
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.VALUE_SET_DEFINITION_ENTRY__ENTITY_LIST);
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
	 * This returns ValueSetDefinitionEntry.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ValueSetDefinitionEntry"));
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
		BigInteger labelValue = ((ValueSetDefinitionEntry) object).getEntryOrder();
		String label = labelValue == null
				? null
				: labelValue.toString();
		return label == null || label.length() == 0
				? getString("_UI_ValueSetDefinitionEntry_type")
				: getString("_UI_ValueSetDefinitionEntry_type") + " " + label;
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

		switch (notification.getFeatureID(ValueSetDefinitionEntry.class)) {
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ENTRY_ORDER:
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ASSOCIATED_ENTITIES:
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_CODE_SYSTEM:
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__COMPLETE_VALUE_SET:
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__EXTERNAL_VALUE_SET_DEFINITION:
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__PROPERTY_QUERY:
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY__ENTITY_LIST:
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
			ValueSetDefinitionPackage.Literals.VALUE_SET_DEFINITION_ENTRY__ASSOCIATED_ENTITIES,
			ValueSetDefinitionFactory.eINSTANCE.createAssociatedEntitiesReference()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.VALUE_SET_DEFINITION_ENTRY__COMPLETE_CODE_SYSTEM,
			ValueSetDefinitionFactory.eINSTANCE.createCompleteCodeSystemReference()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.VALUE_SET_DEFINITION_ENTRY__COMPLETE_VALUE_SET,
			ValueSetDefinitionFactory.eINSTANCE.createCompleteValueSetReference()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.VALUE_SET_DEFINITION_ENTRY__EXTERNAL_VALUE_SET_DEFINITION,
			ValueSetDefinitionFactory.eINSTANCE.createExternalValueSetDefinition()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.VALUE_SET_DEFINITION_ENTRY__PROPERTY_QUERY,
			ValueSetDefinitionFactory.eINSTANCE.createPropertyQueryReference()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.VALUE_SET_DEFINITION_ENTRY__ENTITY_LIST,
			ValueSetDefinitionFactory.eINSTANCE.createSpecificEntityList()));
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
