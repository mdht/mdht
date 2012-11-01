/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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

import org.openhealthtools.mdht.cts2.core.CoreFactory;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescription;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResourceVersionDescriptionItemProvider extends ResourceDescriptionItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceVersionDescriptionItemProvider(AdapterFactory adapterFactory) {
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

			addOfficialResourceVersionIdPropertyDescriptor(object);
			addOfficialReleaseDatePropertyDescriptor(object);
			addOfficialActivationDatePropertyDescriptor(object);
			addDocumentURIPropertyDescriptor(object);
			addStatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Official Resource Version Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addOfficialResourceVersionIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ResourceVersionDescription_officialResourceVersionId_feature"),
			getString(
				"_UI_PropertyDescriptor_description",
				"_UI_ResourceVersionDescription_officialResourceVersionId_feature",
				"_UI_ResourceVersionDescription_type"),
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RESOURCE_VERSION_ID, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Official Release Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addOfficialReleaseDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ResourceVersionDescription_officialReleaseDate_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ResourceVersionDescription_officialReleaseDate_feature",
				"_UI_ResourceVersionDescription_type"),
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RELEASE_DATE, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Official Activation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addOfficialActivationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ResourceVersionDescription_officialActivationDate_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ResourceVersionDescription_officialActivationDate_feature",
				"_UI_ResourceVersionDescription_type"),
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_ACTIVATION_DATE, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Document URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDocumentURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ResourceVersionDescription_documentURI_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ResourceVersionDescription_documentURI_feature",
				"_UI_ResourceVersionDescription_type"),
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__DOCUMENT_URI, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ResourceVersionDescription_state_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ResourceVersionDescription_state_feature",
				"_UI_ResourceVersionDescription_type"), CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__STATE, true,
			false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_NOTATION);
			childrenFeatures.add(CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR);
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
		String label = ((ResourceVersionDescription) object).getFormalName();
		return label == null || label.length() == 0
				? getString("_UI_ResourceVersionDescription_type")
				: getString("_UI_ResourceVersionDescription_type") + " " + label;
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

		switch (notification.getFeatureID(ResourceVersionDescription.class)) {
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RESOURCE_VERSION_ID:
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RELEASE_DATE:
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__OFFICIAL_ACTIVATION_DATE:
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__DOCUMENT_URI:
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__STATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_NOTATION:
			case CorePackage.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR:
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
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_NOTATION,
			CoreFactory.eINSTANCE.createSourceAndNotation()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createNameAndMeaningReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createAssociationReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createBindingQualifierReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createCaseSignificanceReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createCodeSystemCategoryReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createCodeSystemReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createConceptDomainReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createContextReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createDesignationFidelityReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createDesignationTypeReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createFormalityLevelReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createFormatReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createLanguageReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createMapCorrelationReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR, CoreFactory.eINSTANCE.createMapReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createMatchAlgorithmReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createModelAttributeReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createNamespaceReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createOntologyDomainReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createOntologyEngineeringMethodologyReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createOntologyEngineeringToolReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createOntologyLanguageReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createOntologySyntaxReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createOntologyTaskReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createOntologyTypeReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createReasoningAlgorithmReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR, CoreFactory.eINSTANCE.createRoleReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createSourceReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createStatusReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createValueSetReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR,
			CoreFactory.eINSTANCE.createVersionTagReference()));
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

		boolean qualify = childFeature == CorePackage.Literals.CHANGEABLE__STATUS ||
				childFeature == CorePackage.Literals.RESOURCE_VERSION_DESCRIPTION__PREDECESSOR ||
				childFeature == CorePackage.Literals.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS ||
				childFeature == CorePackage.Literals.RESOURCE_DESCRIPTION__RIGHTS ||
				childFeature == CorePackage.Literals.RESOURCE_DESCRIPTION__NOTE;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] {
					getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
