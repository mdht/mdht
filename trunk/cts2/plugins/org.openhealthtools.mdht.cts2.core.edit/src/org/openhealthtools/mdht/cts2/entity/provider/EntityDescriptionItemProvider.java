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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.openhealthtools.mdht.cts2.association.provider.Cts2EditPlugin;

import org.openhealthtools.mdht.cts2.entity.EntityDescription;
import org.openhealthtools.mdht.cts2.entity.EntityFactory;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.entity.EntityDescription} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EntityDescriptionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityDescriptionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION__NAMED_ENTITY);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION__ANONYMOUS_ENTITY);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION__CLASS_DESCRIPTION);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION__DATA_TYPE_DESCRIPTION);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION__OBJECT_PROPERTY_DESCRIPTION);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION__DATA_PROPERTY_DESCRIPTION);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION__ANNOTATION_PROPERTY_DESCRIPTION);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION__NAMED_INDIVIDUAL);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION__ANONYMOUS_INDIVIDUAL);
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
	 * This returns EntityDescription.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EntityDescription"));
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
		return getString("_UI_EntityDescription_type");
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

		switch (notification.getFeatureID(EntityDescription.class)) {
			case EntityPackage.ENTITY_DESCRIPTION__NAMED_ENTITY:
			case EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_ENTITY:
			case EntityPackage.ENTITY_DESCRIPTION__CLASS_DESCRIPTION:
			case EntityPackage.ENTITY_DESCRIPTION__DATA_TYPE_DESCRIPTION:
			case EntityPackage.ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION:
			case EntityPackage.ENTITY_DESCRIPTION__OBJECT_PROPERTY_DESCRIPTION:
			case EntityPackage.ENTITY_DESCRIPTION__DATA_PROPERTY_DESCRIPTION:
			case EntityPackage.ENTITY_DESCRIPTION__ANNOTATION_PROPERTY_DESCRIPTION:
			case EntityPackage.ENTITY_DESCRIPTION__NAMED_INDIVIDUAL:
			case EntityPackage.ENTITY_DESCRIPTION__ANONYMOUS_INDIVIDUAL:
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
			EntityPackage.Literals.ENTITY_DESCRIPTION__NAMED_ENTITY,
			EntityFactory.eINSTANCE.createNamedEntityDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__NAMED_ENTITY,
			EntityFactory.eINSTANCE.createPredicateDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__NAMED_ENTITY,
			EntityFactory.eINSTANCE.createAnnotationPropertyDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__NAMED_ENTITY,
			EntityFactory.eINSTANCE.createAnonymousIndividualDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__NAMED_ENTITY, EntityFactory.eINSTANCE.createClassDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__NAMED_ENTITY,
			EntityFactory.eINSTANCE.createDataPropertyDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__NAMED_ENTITY,
			EntityFactory.eINSTANCE.createNamedIndividualDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__NAMED_ENTITY,
			EntityFactory.eINSTANCE.createObjectPropertyDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__ANONYMOUS_ENTITY,
			EntityFactory.eINSTANCE.createAnonymousEntityDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__ANONYMOUS_ENTITY,
			EntityFactory.eINSTANCE.createDataTypeDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__CLASS_DESCRIPTION,
			EntityFactory.eINSTANCE.createClassDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__DATA_TYPE_DESCRIPTION,
			EntityFactory.eINSTANCE.createDataTypeDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION,
			EntityFactory.eINSTANCE.createPredicateDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION,
			EntityFactory.eINSTANCE.createAnnotationPropertyDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION,
			EntityFactory.eINSTANCE.createDataPropertyDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION,
			EntityFactory.eINSTANCE.createObjectPropertyDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__OBJECT_PROPERTY_DESCRIPTION,
			EntityFactory.eINSTANCE.createObjectPropertyDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__DATA_PROPERTY_DESCRIPTION,
			EntityFactory.eINSTANCE.createDataPropertyDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__ANNOTATION_PROPERTY_DESCRIPTION,
			EntityFactory.eINSTANCE.createAnnotationPropertyDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__NAMED_INDIVIDUAL,
			EntityFactory.eINSTANCE.createNamedIndividualDescription()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION__ANONYMOUS_INDIVIDUAL,
			EntityFactory.eINSTANCE.createAnonymousIndividualDescription()));
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

		boolean qualify = childFeature == EntityPackage.Literals.ENTITY_DESCRIPTION__NAMED_ENTITY ||
				childFeature == EntityPackage.Literals.ENTITY_DESCRIPTION__PREDICATE_DESCRIPTION ||
				childFeature == EntityPackage.Literals.ENTITY_DESCRIPTION__ANNOTATION_PROPERTY_DESCRIPTION ||
				childFeature == EntityPackage.Literals.ENTITY_DESCRIPTION__ANONYMOUS_INDIVIDUAL ||
				childFeature == EntityPackage.Literals.ENTITY_DESCRIPTION__CLASS_DESCRIPTION ||
				childFeature == EntityPackage.Literals.ENTITY_DESCRIPTION__DATA_PROPERTY_DESCRIPTION ||
				childFeature == EntityPackage.Literals.ENTITY_DESCRIPTION__NAMED_INDIVIDUAL ||
				childFeature == EntityPackage.Literals.ENTITY_DESCRIPTION__OBJECT_PROPERTY_DESCRIPTION ||
				childFeature == EntityPackage.Literals.ENTITY_DESCRIPTION__ANONYMOUS_ENTITY ||
				childFeature == EntityPackage.Literals.ENTITY_DESCRIPTION__DATA_TYPE_DESCRIPTION;

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
