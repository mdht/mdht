/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.core.provider;

import java.util.Collection;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

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

import org.openhealthtools.mdht.cts2.association.AssociationFactory;

import org.openhealthtools.mdht.cts2.association.provider.Cts2EditPlugin;

import org.openhealthtools.mdht.cts2.codesystem.CodeSystemFactory;

import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionFactory;

import org.openhealthtools.mdht.cts2.core.ChangeDescription;
import org.openhealthtools.mdht.cts2.core.CoreFactory;
import org.openhealthtools.mdht.cts2.core.CorePackage;

import org.openhealthtools.mdht.cts2.entity.EntityFactory;

import org.openhealthtools.mdht.cts2.statement.StatementFactory;

import org.openhealthtools.mdht.cts2.valueset.ValueSetFactory;

import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionFactory;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.core.ChangeDescription} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ChangeDescriptionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChangeDescriptionItemProvider(AdapterFactory adapterFactory) {
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

			addChangeDatePropertyDescriptor(object);
			addChangeTypePropertyDescriptor(object);
			addCommittedPropertyDescriptor(object);
			addContainingChangeSetPropertyDescriptor(object);
			addEffectiveDatePropertyDescriptor(object);
			addPrevChangeSetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Change Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addChangeDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ChangeDescription_changeDate_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ChangeDescription_changeDate_feature",
				"_UI_ChangeDescription_type"), CorePackage.Literals.CHANGE_DESCRIPTION__CHANGE_DATE, true, false,
			false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Change Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addChangeTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ChangeDescription_changeType_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ChangeDescription_changeType_feature",
				"_UI_ChangeDescription_type"), CorePackage.Literals.CHANGE_DESCRIPTION__CHANGE_TYPE, true, false,
			false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Committed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCommittedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ChangeDescription_committed_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ChangeDescription_committed_feature",
				"_UI_ChangeDescription_type"), CorePackage.Literals.CHANGE_DESCRIPTION__COMMITTED, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Containing Change Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addContainingChangeSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ChangeDescription_containingChangeSet_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ChangeDescription_containingChangeSet_feature",
				"_UI_ChangeDescription_type"), CorePackage.Literals.CHANGE_DESCRIPTION__CONTAINING_CHANGE_SET, true,
			false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Effective Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addEffectiveDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ChangeDescription_effectiveDate_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ChangeDescription_effectiveDate_feature",
				"_UI_ChangeDescription_type"), CorePackage.Literals.CHANGE_DESCRIPTION__EFFECTIVE_DATE, true, false,
			false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Prev Change Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPrevChangeSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ChangeDescription_prevChangeSet_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ChangeDescription_prevChangeSet_feature",
				"_UI_ChangeDescription_type"), CorePackage.Literals.CHANGE_DESCRIPTION__PREV_CHANGE_SET, true, false,
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
			childrenFeatures.add(CorePackage.Literals.CHANGE_DESCRIPTION__PREV_IMAGE);
			childrenFeatures.add(CorePackage.Literals.CHANGE_DESCRIPTION__CHANGE_NOTES);
			childrenFeatures.add(CorePackage.Literals.CHANGE_DESCRIPTION__CHANGE_SOURCE);
			childrenFeatures.add(CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE);
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
	 * This returns ChangeDescription.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ChangeDescription"));
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
		XMLGregorianCalendar labelValue = ((ChangeDescription) object).getChangeDate();
		String label = labelValue == null
				? null
				: labelValue.toString();
		return label == null || label.length() == 0
				? getString("_UI_ChangeDescription_type")
				: getString("_UI_ChangeDescription_type") + " " + label;
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

		switch (notification.getFeatureID(ChangeDescription.class)) {
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_DATE:
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_TYPE:
			case CorePackage.CHANGE_DESCRIPTION__COMMITTED:
			case CorePackage.CHANGE_DESCRIPTION__CONTAINING_CHANGE_SET:
			case CorePackage.CHANGE_DESCRIPTION__EFFECTIVE_DATE:
			case CorePackage.CHANGE_DESCRIPTION__PREV_CHANGE_SET:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.CHANGE_DESCRIPTION__PREV_IMAGE:
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_NOTES:
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_SOURCE:
			case CorePackage.CHANGE_DESCRIPTION__CLONED_RESOURCE:
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
			CorePackage.Literals.CHANGE_DESCRIPTION__PREV_IMAGE, AssociationFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__PREV_IMAGE,
			AssociationFactory.eINSTANCE.createAssociationListEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__PREV_IMAGE,
			CodeSystemFactory.eINSTANCE.createCodeSystemCatalogEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__PREV_IMAGE,
			CodeSystemVersionFactory.eINSTANCE.createCodeSystemVersionCatalogEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__PREV_IMAGE, StatementFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__PREV_IMAGE,
			StatementFactory.eINSTANCE.createStatementDirectoryEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__PREV_IMAGE, ValueSetFactory.eINSTANCE.createValueSetCatalogEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__PREV_IMAGE,
			ValueSetDefinitionFactory.eINSTANCE.createValueSetDefinition()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CHANGE_NOTES, CoreFactory.eINSTANCE.createOpaqueData()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CHANGE_NOTES, CoreFactory.eINSTANCE.createEntryDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CHANGE_NOTES, CoreFactory.eINSTANCE.createComment()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CHANGE_NOTES, CoreFactory.eINSTANCE.createDefinition()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CHANGE_NOTES, CoreFactory.eINSTANCE.createExample()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CHANGE_NOTES, EntityFactory.eINSTANCE.createDesignation()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CHANGE_NOTES,
			ValueSetDefinitionFactory.eINSTANCE.createExternalValueSetDefinition()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CHANGE_SOURCE, CoreFactory.eINSTANCE.createSourceReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createNameAndMeaningReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createAssociationReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createBindingQualifierReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createCaseSignificanceReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createCodeSystemCategoryReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE, CoreFactory.eINSTANCE.createCodeSystemReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createConceptDomainReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE, CoreFactory.eINSTANCE.createContextReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createDesignationFidelityReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createDesignationTypeReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createFormalityLevelReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE, CoreFactory.eINSTANCE.createFormatReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE, CoreFactory.eINSTANCE.createLanguageReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createMapCorrelationReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE, CoreFactory.eINSTANCE.createMapReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createMatchAlgorithmReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createModelAttributeReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE, CoreFactory.eINSTANCE.createNamespaceReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createOntologyDomainReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createOntologyEngineeringMethodologyReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createOntologyEngineeringToolReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createOntologyLanguageReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createOntologySyntaxReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createOntologyTaskReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createOntologyTypeReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE,
			CoreFactory.eINSTANCE.createReasoningAlgorithmReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE, CoreFactory.eINSTANCE.createRoleReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE, CoreFactory.eINSTANCE.createSourceReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE, CoreFactory.eINSTANCE.createStatusReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE, CoreFactory.eINSTANCE.createValueSetReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE, CoreFactory.eINSTANCE.createVersionTagReference()));
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

		boolean qualify = childFeature == CorePackage.Literals.CHANGE_DESCRIPTION__CHANGE_SOURCE ||
				childFeature == CorePackage.Literals.CHANGE_DESCRIPTION__CLONED_RESOURCE;

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
