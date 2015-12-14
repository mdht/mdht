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
import traceability.LogEntry;
import traceability.Trace;
import traceability.TraceDiff;
import traceability.TraceabilityFactory;
import traceability.TraceabilityPackage;

/**
 * This is the item provider adapter for a {@link traceability.TraceDiff} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceDiffItemProvider
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
	public TraceDiffItemProvider(AdapterFactory adapterFactory) {
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

			addParticipantsPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Participants feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParticipantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TraceDiff_participants_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TraceDiff_participants_feature", "_UI_TraceDiff_type"),
				 TraceabilityPackage.Literals.TRACE_DIFF__PARTICIPANTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TraceDiff_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TraceDiff_comment_feature", "_UI_TraceDiff_type"),
				 TraceabilityPackage.Literals.TRACE_DIFF__COMMENT,
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
			childrenFeatures.add(TraceabilityPackage.Literals.TRACE_DIFF__PARTICIPANTS);
			childrenFeatures.add(TraceabilityPackage.Literals.TRACE_DIFF__COMMENTS);
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
	 * This returns TraceDiff.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		for (Object eObject:((TraceDiff)object).getParticipants()) {
			if (eObject instanceof LogEntry) {
				LogEntry logEntry = (LogEntry) eObject;
				if (logEntry.getSeverity() == 2)
					return overlayImage(object, getResourceLocator().getImage("full/obj16/Info.png"));
				if (logEntry.getSeverity() == 1)
					return overlayImage(object, getResourceLocator().getImage("full/obj16/Warning.png"));
				return overlayImage(object, getResourceLocator().getImage("full/obj16/LogEntry.png"));
			}
			if (eObject instanceof Trace) 
				return overlayImage(object, getResourceLocator().getImage("full/obj16/Trace.png"));
		}
		
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TraceDiff"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TraceDiff)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_TraceDiff_type") :
			getString("_UI_TraceDiff_type") + " " + label;
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

		switch (notification.getFeatureID(TraceDiff.class)) {
			case TraceabilityPackage.TRACE_DIFF__COMMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TraceabilityPackage.TRACE_DIFF__COMMENTS:
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
				(TraceabilityPackage.Literals.TRACE_DIFF__PARTICIPANTS,
				 TraceabilityFactory.eINSTANCE.createTrace()));

		newChildDescriptors.add
			(createChildParameter
				(TraceabilityPackage.Literals.TRACE_DIFF__PARTICIPANTS,
				 TraceabilityFactory.eINSTANCE.createLogEntry()));

		newChildDescriptors.add
			(createChildParameter
				(TraceabilityPackage.Literals.TRACE_DIFF__PARTICIPANTS,
				 TraceabilityFactory.eINSTANCE.createTraces()));

		newChildDescriptors.add
			(createChildParameter
				(TraceabilityPackage.Literals.TRACE_DIFF__PARTICIPANTS,
				 TraceabilityFactory.eINSTANCE.createTraceDiff()));

		newChildDescriptors.add
			(createChildParameter
				(TraceabilityPackage.Literals.TRACE_DIFF__PARTICIPANTS,
				 TraceabilityFactory.eINSTANCE.createDiffCategory()));

		newChildDescriptors.add
			(createChildParameter
				(TraceabilityPackage.Literals.TRACE_DIFF__PARTICIPANTS,
				 TraceabilityFactory.eINSTANCE.createTraceDiffs()));

		newChildDescriptors.add
			(createChildParameter
				(TraceabilityPackage.Literals.TRACE_DIFF__PARTICIPANTS,
				 TraceabilityFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(TraceabilityPackage.Literals.TRACE_DIFF__PARTICIPANTS,
				 TraceabilityFactory.eINSTANCE.createTraceComment()));

		newChildDescriptors.add
			(createChildParameter
				(TraceabilityPackage.Literals.TRACE_DIFF__COMMENTS,
				 TraceabilityFactory.eINSTANCE.createTraceComment()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == TraceabilityPackage.Literals.TRACE_DIFF__PARTICIPANTS ||
			childFeature == TraceabilityPackage.Literals.TRACE_DIFF__COMMENTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
