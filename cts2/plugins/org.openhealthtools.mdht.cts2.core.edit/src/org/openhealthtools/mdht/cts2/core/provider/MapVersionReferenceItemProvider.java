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

import org.openhealthtools.mdht.cts2.core.CoreFactory;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.MapVersionReference;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.core.MapVersionReference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class MapVersionReferenceItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MapVersionReferenceItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION);
			childrenFeatures.add(CorePackage.Literals.MAP_VERSION_REFERENCE__MAP);
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
	 * This returns MapVersionReference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MapVersionReference"));
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
		return getString("_UI_MapVersionReference_type");
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

		switch (notification.getFeatureID(MapVersionReference.class)) {
			case CorePackage.MAP_VERSION_REFERENCE__MAP_VERSION:
			case CorePackage.MAP_VERSION_REFERENCE__MAP:
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
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createNameAndMeaningReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION, CoreFactory.eINSTANCE.createAssociationReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createBindingQualifierReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createCaseSignificanceReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createCodeSystemCategoryReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION, CoreFactory.eINSTANCE.createCodeSystemReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createConceptDomainReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION, CoreFactory.eINSTANCE.createContextReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createDesignationFidelityReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createDesignationTypeReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createFormalityLevelReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION, CoreFactory.eINSTANCE.createFormatReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION, CoreFactory.eINSTANCE.createLanguageReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createMapCorrelationReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION, CoreFactory.eINSTANCE.createMapReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createMatchAlgorithmReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createModelAttributeReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION, CoreFactory.eINSTANCE.createNamespaceReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createOntologyDomainReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createOntologyEngineeringMethodologyReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createOntologyEngineeringToolReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createOntologyLanguageReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createOntologySyntaxReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createOntologyTaskReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createOntologyTypeReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION,
			CoreFactory.eINSTANCE.createReasoningAlgorithmReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION, CoreFactory.eINSTANCE.createRoleReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION, CoreFactory.eINSTANCE.createSourceReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION, CoreFactory.eINSTANCE.createStatusReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION, CoreFactory.eINSTANCE.createValueSetReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION, CoreFactory.eINSTANCE.createVersionTagReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.MAP_VERSION_REFERENCE__MAP, CoreFactory.eINSTANCE.createMapReference()));
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

		boolean qualify = childFeature == CorePackage.Literals.MAP_VERSION_REFERENCE__MAP_VERSION ||
				childFeature == CorePackage.Literals.MAP_VERSION_REFERENCE__MAP;

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
