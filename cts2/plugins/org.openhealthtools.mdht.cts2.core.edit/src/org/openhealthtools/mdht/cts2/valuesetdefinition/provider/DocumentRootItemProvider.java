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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.openhealthtools.mdht.cts2.association.provider.Cts2EditPlugin;

import org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionFactory;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class DocumentRootItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__ITERATABLE_RESOLVED_VALUE_SET);
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET);
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_DIRECTORY);
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_MSG);
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_SUMMARY);
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION);
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_DIRECTORY);
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_ENTRY);
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_LIST);
			childrenFeatures.add(ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_MSG);
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
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
		return getString("_UI_DocumentRoot_type");
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__ITERATABLE_RESOLVED_VALUE_SET:
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET:
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET_DIRECTORY:
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET_MSG:
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__RESOLVED_VALUE_SET_SUMMARY:
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION:
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_DIRECTORY:
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_ENTRY:
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_LIST:
			case ValueSetDefinitionPackage.DOCUMENT_ROOT__VALUE_SET_DEFINITION_MSG:
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
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__ITERATABLE_RESOLVED_VALUE_SET,
			ValueSetDefinitionFactory.eINSTANCE.createIteratableResolvedValueSet()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET,
			ValueSetDefinitionFactory.eINSTANCE.createResolvedValueSet()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_DIRECTORY,
			ValueSetDefinitionFactory.eINSTANCE.createResolvedValueSetDirectory()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_MSG,
			ValueSetDefinitionFactory.eINSTANCE.createResolvedValueSetMsg()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_SUMMARY,
			ValueSetDefinitionFactory.eINSTANCE.createResolvedValueSetSummary()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_SUMMARY,
			ValueSetDefinitionFactory.eINSTANCE.createResolvedValueSetDirectoryEntry()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION,
			ValueSetDefinitionFactory.eINSTANCE.createValueSetDefinition()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_DIRECTORY,
			ValueSetDefinitionFactory.eINSTANCE.createValueSetDefinitionDirectory()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_ENTRY,
			ValueSetDefinitionFactory.eINSTANCE.createValueSetDefinitionEntry()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_LIST,
			ValueSetDefinitionFactory.eINSTANCE.createValueSetDefinitionList()));

		newChildDescriptors.add(createChildParameter(
			ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_MSG,
			ValueSetDefinitionFactory.eINSTANCE.createValueSetDefinitionMsg()));
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
