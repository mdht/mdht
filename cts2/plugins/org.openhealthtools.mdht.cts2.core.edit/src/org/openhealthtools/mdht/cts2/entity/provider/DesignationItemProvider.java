/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity.provider;

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

import org.openhealthtools.mdht.cts2.core.CoreFactory;

import org.openhealthtools.mdht.cts2.core.provider.EntryDescriptionItemProvider;

import org.openhealthtools.mdht.cts2.entity.Designation;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.entity.Designation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class DesignationItemProvider extends EntryDescriptionItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DesignationItemProvider(AdapterFactory adapterFactory) {
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

			addAssertedInCodeSystemVersionPropertyDescriptor(object);
			addCorrespondingStatementPropertyDescriptor(object);
			addDesignationRolePropertyDescriptor(object);
			addExternalIdentifierPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Asserted In Code System Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAssertedInCodeSystemVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Designation_assertedInCodeSystemVersion_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_Designation_assertedInCodeSystemVersion_feature",
				"_UI_Designation_type"), EntityPackage.Literals.DESIGNATION__ASSERTED_IN_CODE_SYSTEM_VERSION, true,
			false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Corresponding Statement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCorrespondingStatementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Designation_correspondingStatement_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_Designation_correspondingStatement_feature",
				"_UI_Designation_type"), EntityPackage.Literals.DESIGNATION__CORRESPONDING_STATEMENT, true, false,
			false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Designation Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDesignationRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Designation_designationRole_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_Designation_designationRole_feature", "_UI_Designation_type"),
			EntityPackage.Literals.DESIGNATION__DESIGNATION_ROLE, true, false, false,
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
			getString("_UI_Designation_externalIdentifier_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_Designation_externalIdentifier_feature",
				"_UI_Designation_type"), EntityPackage.Literals.DESIGNATION__EXTERNAL_IDENTIFIER, true, false, false,
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
			childrenFeatures.add(EntityPackage.Literals.DESIGNATION__USAGE_CONTEXT);
			childrenFeatures.add(EntityPackage.Literals.DESIGNATION__DESIGNATION_TYPE);
			childrenFeatures.add(EntityPackage.Literals.DESIGNATION__CASE_SIGNIFICANCE);
			childrenFeatures.add(EntityPackage.Literals.DESIGNATION__DEGREE_OF_FIDELITY);
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
	 * This returns Designation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Designation"));
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
		String label = ((Designation) object).getSchema();
		return label == null || label.length() == 0
				? getString("_UI_Designation_type")
				: getString("_UI_Designation_type") + " " + label;
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

		switch (notification.getFeatureID(Designation.class)) {
			case EntityPackage.DESIGNATION__ASSERTED_IN_CODE_SYSTEM_VERSION:
			case EntityPackage.DESIGNATION__CORRESPONDING_STATEMENT:
			case EntityPackage.DESIGNATION__DESIGNATION_ROLE:
			case EntityPackage.DESIGNATION__EXTERNAL_IDENTIFIER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EntityPackage.DESIGNATION__USAGE_CONTEXT:
			case EntityPackage.DESIGNATION__DESIGNATION_TYPE:
			case EntityPackage.DESIGNATION__CASE_SIGNIFICANCE:
			case EntityPackage.DESIGNATION__DEGREE_OF_FIDELITY:
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
			EntityPackage.Literals.DESIGNATION__USAGE_CONTEXT, CoreFactory.eINSTANCE.createContextReference()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.DESIGNATION__DESIGNATION_TYPE,
			CoreFactory.eINSTANCE.createDesignationTypeReference()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.DESIGNATION__CASE_SIGNIFICANCE,
			CoreFactory.eINSTANCE.createCaseSignificanceReference()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.DESIGNATION__DEGREE_OF_FIDELITY,
			CoreFactory.eINSTANCE.createDesignationFidelityReference()));
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
