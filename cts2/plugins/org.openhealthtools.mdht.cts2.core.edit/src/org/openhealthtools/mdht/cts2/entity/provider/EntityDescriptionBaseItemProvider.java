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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.openhealthtools.mdht.cts2.association.provider.Cts2EditPlugin;

import org.openhealthtools.mdht.cts2.core.CoreFactory;

import org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase;
import org.openhealthtools.mdht.cts2.entity.EntityFactory;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionBase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EntityDescriptionBaseItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityDescriptionBaseItemProvider(AdapterFactory adapterFactory) {
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

			addSourceStatementsPropertyDescriptor(object);
			addSubjectOfPropertyDescriptor(object);
			addPredicateOfPropertyDescriptor(object);
			addTargetOfPropertyDescriptor(object);
			addAncestorsPropertyDescriptor(object);
			addChildrenPropertyDescriptor(object);
			addDescendantsPropertyDescriptor(object);
			addInstancesPropertyDescriptor(object);
			addAboutPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
			getString("_UI_EntityDescriptionBase_sourceStatements_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_EntityDescriptionBase_sourceStatements_feature",
				"_UI_EntityDescriptionBase_type"), EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__SOURCE_STATEMENTS,
			true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Subject Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSubjectOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_EntityDescriptionBase_subjectOf_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_EntityDescriptionBase_subjectOf_feature",
				"_UI_EntityDescriptionBase_type"), EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__SUBJECT_OF, true,
			false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Predicate Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPredicateOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_EntityDescriptionBase_predicateOf_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_EntityDescriptionBase_predicateOf_feature",
				"_UI_EntityDescriptionBase_type"), EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__PREDICATE_OF, true,
			false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Target Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTargetOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_EntityDescriptionBase_targetOf_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_EntityDescriptionBase_targetOf_feature",
				"_UI_EntityDescriptionBase_type"), EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__TARGET_OF, true,
			false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ancestors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAncestorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_EntityDescriptionBase_ancestors_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_EntityDescriptionBase_ancestors_feature",
				"_UI_EntityDescriptionBase_type"), EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__ANCESTORS, true,
			false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Children feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addChildrenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_EntityDescriptionBase_children_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_EntityDescriptionBase_children_feature",
				"_UI_EntityDescriptionBase_type"), EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__CHILDREN, true,
			false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Descendants feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDescendantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_EntityDescriptionBase_descendants_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_EntityDescriptionBase_descendants_feature",
				"_UI_EntityDescriptionBase_type"), EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__DESCENDANTS, true,
			false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Instances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_EntityDescriptionBase_instances_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_EntityDescriptionBase_instances_feature",
				"_UI_EntityDescriptionBase_type"), EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__INSTANCES, true,
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
			getString("_UI_EntityDescriptionBase_about_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_EntityDescriptionBase_about_feature",
				"_UI_EntityDescriptionBase_type"), EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__ABOUT, true, false,
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
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__ENTITY_ID);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__ALTERNATE_ENTITY_ID);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__DESCRIBING_CODE_SYSTEM_VERSION);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__DESIGNATION);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__DEFINITION);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__EXAMPLE);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__NOTE);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__PROPERTY);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__PARENT);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__ENTITY_TYPE);
			childrenFeatures.add(EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__EQUIVALENT_ENTITY);
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
		String label = ((EntityDescriptionBase) object).getSourceStatements();
		return label == null || label.length() == 0
				? getString("_UI_EntityDescriptionBase_type")
				: getString("_UI_EntityDescriptionBase_type") + " " + label;
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

		switch (notification.getFeatureID(EntityDescriptionBase.class)) {
			case EntityPackage.ENTITY_DESCRIPTION_BASE__SOURCE_STATEMENTS:
			case EntityPackage.ENTITY_DESCRIPTION_BASE__SUBJECT_OF:
			case EntityPackage.ENTITY_DESCRIPTION_BASE__PREDICATE_OF:
			case EntityPackage.ENTITY_DESCRIPTION_BASE__TARGET_OF:
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ANCESTORS:
			case EntityPackage.ENTITY_DESCRIPTION_BASE__CHILDREN:
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DESCENDANTS:
			case EntityPackage.ENTITY_DESCRIPTION_BASE__INSTANCES:
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ABOUT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ENTITY_ID:
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ALTERNATE_ENTITY_ID:
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DESCRIBING_CODE_SYSTEM_VERSION:
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DESIGNATION:
			case EntityPackage.ENTITY_DESCRIPTION_BASE__DEFINITION:
			case EntityPackage.ENTITY_DESCRIPTION_BASE__EXAMPLE:
			case EntityPackage.ENTITY_DESCRIPTION_BASE__NOTE:
			case EntityPackage.ENTITY_DESCRIPTION_BASE__PROPERTY:
			case EntityPackage.ENTITY_DESCRIPTION_BASE__PARENT:
			case EntityPackage.ENTITY_DESCRIPTION_BASE__ENTITY_TYPE:
			case EntityPackage.ENTITY_DESCRIPTION_BASE__EQUIVALENT_ENTITY:
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
			EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__ENTITY_ID, CoreFactory.eINSTANCE.createScopedEntityName()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__ALTERNATE_ENTITY_ID,
			CoreFactory.eINSTANCE.createScopedEntityName()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__DESCRIBING_CODE_SYSTEM_VERSION,
			CoreFactory.eINSTANCE.createCodeSystemVersionReference()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__DESIGNATION, EntityFactory.eINSTANCE.createDesignation()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__DEFINITION, CoreFactory.eINSTANCE.createDefinition()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__EXAMPLE, CoreFactory.eINSTANCE.createExample()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__NOTE, CoreFactory.eINSTANCE.createComment()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__PROPERTY, CoreFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__PARENT, CoreFactory.eINSTANCE.createURIAndEntityName()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__PARENT, CoreFactory.eINSTANCE.createEntitySynopsis()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__PARENT, CoreFactory.eINSTANCE.createPredicateReference()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__ENTITY_TYPE, CoreFactory.eINSTANCE.createURIAndEntityName()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__ENTITY_TYPE, CoreFactory.eINSTANCE.createEntitySynopsis()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__ENTITY_TYPE,
			CoreFactory.eINSTANCE.createPredicateReference()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__EQUIVALENT_ENTITY,
			CoreFactory.eINSTANCE.createURIAndEntityName()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__EQUIVALENT_ENTITY,
			CoreFactory.eINSTANCE.createEntitySynopsis()));

		newChildDescriptors.add(createChildParameter(
			EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__EQUIVALENT_ENTITY,
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

		boolean qualify = childFeature == EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__ENTITY_ID ||
				childFeature == EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__ALTERNATE_ENTITY_ID ||
				childFeature == EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__PARENT ||
				childFeature == EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__ENTITY_TYPE ||
				childFeature == EntityPackage.Literals.ENTITY_DESCRIPTION_BASE__EQUIVALENT_ENTITY;

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
