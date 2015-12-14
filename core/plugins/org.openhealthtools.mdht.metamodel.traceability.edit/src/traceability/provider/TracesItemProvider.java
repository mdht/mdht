/**
 */
package traceability.provider;


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

import traceability.TraceabilityFactory;
import traceability.TraceabilityPackage;
import traceability.Traces;

/**
 * This is the item provider adapter for a {@link traceability.Traces} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TracesItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOriginalSourceURLPropertyDescriptor(object);
			addSourceModelPropertyDescriptor(object);
			addTargetModelPropertyDescriptor(object);
			addUsernamePropertyDescriptor(object);
			addFullNamePropertyDescriptor(object);
			addDatePropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
			addCommentsPropertyDescriptor(object);
			addUriMapPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Original Source URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginalSourceURLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Traces_originalSourceURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Traces_originalSourceURL_feature", "_UI_Traces_type"),
				 TraceabilityPackage.Literals.TRACES__ORIGINAL_SOURCE_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Traces_sourceModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Traces_sourceModel_feature", "_UI_Traces_type"),
				 TraceabilityPackage.Literals.TRACES__SOURCE_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Traces_targetModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Traces_targetModel_feature", "_UI_Traces_type"),
				 TraceabilityPackage.Literals.TRACES__TARGET_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Username feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsernamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Traces_username_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Traces_username_feature", "_UI_Traces_type"),
				 TraceabilityPackage.Literals.TRACES__USERNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Full Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFullNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Traces_fullName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Traces_fullName_feature", "_UI_Traces_type"),
				 TraceabilityPackage.Literals.TRACES__FULL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Traces_date_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Traces_date_feature", "_UI_Traces_type"),
				 TraceabilityPackage.Literals.TRACES__DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Traces_location_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Traces_location_feature", "_UI_Traces_type"),
				 TraceabilityPackage.Literals.TRACES__LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comments feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Traces_comments_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Traces_comments_feature", "_UI_Traces_type"),
				 TraceabilityPackage.Literals.TRACES__COMMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uri Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Traces_uriMap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Traces_uriMap_feature", "_UI_Traces_type"),
				 TraceabilityPackage.Literals.TRACES__URI_MAP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TraceabilityPackage.Literals.TRACES__SOURCE_MODEL);
			childrenFeatures.add(TraceabilityPackage.Literals.TRACES__TARGET_MODEL);
			childrenFeatures.add(TraceabilityPackage.Literals.TRACES__TRACES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Traces.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Traces"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((Traces)object).getFullName();
		return label == null || label.length() == 0 ?
			getString("_UI_Traces_type") :
			getString("_UI_Traces_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Traces.class)) {
			case TraceabilityPackage.TRACES__ORIGINAL_SOURCE_URL:
			case TraceabilityPackage.TRACES__USERNAME:
			case TraceabilityPackage.TRACES__FULL_NAME:
			case TraceabilityPackage.TRACES__DATE:
			case TraceabilityPackage.TRACES__LOCATION:
			case TraceabilityPackage.TRACES__COMMENTS:
			case TraceabilityPackage.TRACES__URI_MAP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TraceabilityPackage.TRACES__TRACES:
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
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TraceabilityPackage.Literals.TRACES__TRACES,
				 TraceabilityFactory.eINSTANCE.createTrace()));

		newChildDescriptors.add
			(createChildParameter
				(TraceabilityPackage.Literals.TRACES__TRACES,
				 TraceabilityFactory.eINSTANCE.createLogEntry()));

		newChildDescriptors.add
			(createChildParameter
				(TraceabilityPackage.Literals.TRACES__TRACES,
				 TraceabilityFactory.eINSTANCE.createTraces()));

		newChildDescriptors.add
			(createChildParameter
				(TraceabilityPackage.Literals.TRACES__TRACES,
				 TraceabilityFactory.eINSTANCE.createTraceDiff()));

		newChildDescriptors.add
			(createChildParameter
				(TraceabilityPackage.Literals.TRACES__TRACES,
				 TraceabilityFactory.eINSTANCE.createDiffCategory()));

		newChildDescriptors.add
			(createChildParameter
				(TraceabilityPackage.Literals.TRACES__TRACES,
				 TraceabilityFactory.eINSTANCE.createTraceDiffs()));

		newChildDescriptors.add
			(createChildParameter
				(TraceabilityPackage.Literals.TRACES__TRACES,
				 TraceabilityFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(TraceabilityPackage.Literals.TRACES__TRACES,
				 TraceabilityFactory.eINSTANCE.createTraceComment()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TraceabilityEditPlugin.INSTANCE;
	}

}
