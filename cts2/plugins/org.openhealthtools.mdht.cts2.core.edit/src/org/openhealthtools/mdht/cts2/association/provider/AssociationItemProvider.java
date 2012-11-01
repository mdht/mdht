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
package org.openhealthtools.mdht.cts2.association.provider;

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

import org.openhealthtools.mdht.cts2.association.Association;
import org.openhealthtools.mdht.cts2.association.AssociationPackage;

import org.openhealthtools.mdht.cts2.core.CoreFactory;
import org.openhealthtools.mdht.cts2.core.EntryState;

import org.openhealthtools.mdht.cts2.core.provider.ChangeableItemProvider;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.association.Association} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class AssociationItemProvider extends ChangeableItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationItemProvider(AdapterFactory adapterFactory) {
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
			addAssociationIDPropertyDescriptor(object);
			addDerivationPropertyDescriptor(object);
			addLocalIDPropertyDescriptor(object);
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
			getString("_UI_Association_sourceStatements_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_Association_sourceStatements_feature",
				"_UI_Association_type"), AssociationPackage.Literals.ASSOCIATION__SOURCE_STATEMENTS, true, false,
			false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Association ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAssociationIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Association_associationID_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_Association_associationID_feature", "_UI_Association_type"),
			AssociationPackage.Literals.ASSOCIATION__ASSOCIATION_ID, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Derivation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDerivationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Association_derivation_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_Association_derivation_feature", "_UI_Association_type"),
			AssociationPackage.Literals.ASSOCIATION__DERIVATION, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Local ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLocalIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Association_localID_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Association_localID_feature", "_UI_Association_type"),
			AssociationPackage.Literals.ASSOCIATION__LOCAL_ID, true, false, false,
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
			childrenFeatures.add(AssociationPackage.Literals.ASSOCIATION__SUBJECT);
			childrenFeatures.add(AssociationPackage.Literals.ASSOCIATION__PREDICATE);
			childrenFeatures.add(AssociationPackage.Literals.ASSOCIATION__TARGET);
			childrenFeatures.add(AssociationPackage.Literals.ASSOCIATION__ASSOCIATION_QUALIFIER);
			childrenFeatures.add(AssociationPackage.Literals.ASSOCIATION__ASSERTED_BY);
			childrenFeatures.add(AssociationPackage.Literals.ASSOCIATION__ASSERTED_IN);
			childrenFeatures.add(AssociationPackage.Literals.ASSOCIATION__DERIVATION_REASONING_ALGORITHM);
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
	 * This returns Association.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Association"));
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
		EntryState labelValue = ((Association) object).getEntryState();
		String label = labelValue == null
				? null
				: labelValue.toString();
		return label == null || label.length() == 0
				? getString("_UI_Association_type")
				: getString("_UI_Association_type") + " " + label;
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

		switch (notification.getFeatureID(Association.class)) {
			case AssociationPackage.ASSOCIATION__SOURCE_STATEMENTS:
			case AssociationPackage.ASSOCIATION__ASSOCIATION_ID:
			case AssociationPackage.ASSOCIATION__DERIVATION:
			case AssociationPackage.ASSOCIATION__LOCAL_ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AssociationPackage.ASSOCIATION__SUBJECT:
			case AssociationPackage.ASSOCIATION__PREDICATE:
			case AssociationPackage.ASSOCIATION__TARGET:
			case AssociationPackage.ASSOCIATION__ASSOCIATION_QUALIFIER:
			case AssociationPackage.ASSOCIATION__ASSERTED_BY:
			case AssociationPackage.ASSOCIATION__ASSERTED_IN:
			case AssociationPackage.ASSOCIATION__DERIVATION_REASONING_ALGORITHM:
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
			AssociationPackage.Literals.ASSOCIATION__SUBJECT, CoreFactory.eINSTANCE.createURIAndEntityName()));

		newChildDescriptors.add(createChildParameter(
			AssociationPackage.Literals.ASSOCIATION__SUBJECT, CoreFactory.eINSTANCE.createEntitySynopsis()));

		newChildDescriptors.add(createChildParameter(
			AssociationPackage.Literals.ASSOCIATION__SUBJECT, CoreFactory.eINSTANCE.createPredicateReference()));

		newChildDescriptors.add(createChildParameter(
			AssociationPackage.Literals.ASSOCIATION__PREDICATE, CoreFactory.eINSTANCE.createPredicateReference()));

		newChildDescriptors.add(createChildParameter(
			AssociationPackage.Literals.ASSOCIATION__TARGET, CoreFactory.eINSTANCE.createStatementTarget()));

		newChildDescriptors.add(createChildParameter(
			AssociationPackage.Literals.ASSOCIATION__ASSOCIATION_QUALIFIER, CoreFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add(createChildParameter(
			AssociationPackage.Literals.ASSOCIATION__ASSERTED_BY,
			CoreFactory.eINSTANCE.createCodeSystemVersionReference()));

		newChildDescriptors.add(createChildParameter(
			AssociationPackage.Literals.ASSOCIATION__ASSERTED_IN,
			CoreFactory.eINSTANCE.createCodeSystemVersionReference()));

		newChildDescriptors.add(createChildParameter(
			AssociationPackage.Literals.ASSOCIATION__DERIVATION_REASONING_ALGORITHM,
			CoreFactory.eINSTANCE.createReasoningAlgorithmReference()));
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

		boolean qualify = childFeature == AssociationPackage.Literals.ASSOCIATION__SUBJECT ||
				childFeature == AssociationPackage.Literals.ASSOCIATION__PREDICATE ||
				childFeature == AssociationPackage.Literals.ASSOCIATION__ASSERTED_BY ||
				childFeature == AssociationPackage.Literals.ASSOCIATION__ASSERTED_IN;

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
