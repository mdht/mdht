/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.association.provider;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry;
import org.openhealthtools.mdht.cts2.association.AssociationPackage;

import org.openhealthtools.mdht.cts2.core.CoreFactory;

import org.openhealthtools.mdht.cts2.core.provider.DirectoryEntryItemProvider;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class AssociationDirectoryEntryItemProvider extends DirectoryEntryItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationDirectoryEntryItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(AssociationPackage.Literals.ASSOCIATION_DIRECTORY_ENTRY__SUBJECT);
			childrenFeatures.add(AssociationPackage.Literals.ASSOCIATION_DIRECTORY_ENTRY__PREDICATE);
			childrenFeatures.add(AssociationPackage.Literals.ASSOCIATION_DIRECTORY_ENTRY__TARGET);
			childrenFeatures.add(AssociationPackage.Literals.ASSOCIATION_DIRECTORY_ENTRY__ASSERTED_BY);
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
	 * This returns AssociationDirectoryEntry.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssociationDirectoryEntry"));
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
		String label = ((AssociationDirectoryEntry) object).getResourceName();
		return label == null || label.length() == 0
				? getString("_UI_AssociationDirectoryEntry_type")
				: getString("_UI_AssociationDirectoryEntry_type") + " " + label;
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

		switch (notification.getFeatureID(AssociationDirectoryEntry.class)) {
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__SUBJECT:
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__PREDICATE:
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__TARGET:
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY__ASSERTED_BY:
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
			AssociationPackage.Literals.ASSOCIATION_DIRECTORY_ENTRY__SUBJECT,
			CoreFactory.eINSTANCE.createURIAndEntityName()));

		newChildDescriptors.add(createChildParameter(
			AssociationPackage.Literals.ASSOCIATION_DIRECTORY_ENTRY__SUBJECT,
			CoreFactory.eINSTANCE.createEntitySynopsis()));

		newChildDescriptors.add(createChildParameter(
			AssociationPackage.Literals.ASSOCIATION_DIRECTORY_ENTRY__SUBJECT,
			CoreFactory.eINSTANCE.createPredicateReference()));

		newChildDescriptors.add(createChildParameter(
			AssociationPackage.Literals.ASSOCIATION_DIRECTORY_ENTRY__PREDICATE,
			CoreFactory.eINSTANCE.createPredicateReference()));

		newChildDescriptors.add(createChildParameter(
			AssociationPackage.Literals.ASSOCIATION_DIRECTORY_ENTRY__TARGET,
			CoreFactory.eINSTANCE.createStatementTarget()));

		newChildDescriptors.add(createChildParameter(
			AssociationPackage.Literals.ASSOCIATION_DIRECTORY_ENTRY__ASSERTED_BY,
			CoreFactory.eINSTANCE.createCodeSystemVersionReference()));
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

		boolean qualify = childFeature == AssociationPackage.Literals.ASSOCIATION_DIRECTORY_ENTRY__SUBJECT ||
				childFeature == AssociationPackage.Literals.ASSOCIATION_DIRECTORY_ENTRY__PREDICATE;

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
