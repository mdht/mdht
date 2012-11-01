/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.statement.provider;

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
import org.openhealthtools.mdht.cts2.core.EntryState;

import org.openhealthtools.mdht.cts2.core.provider.ChangeableItemProvider;

import org.openhealthtools.mdht.cts2.statement.Statement;
import org.openhealthtools.mdht.cts2.statement.StatementFactory;
import org.openhealthtools.mdht.cts2.statement.StatementPackage;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.statement.Statement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class StatementItemProvider extends ChangeableItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatementItemProvider(AdapterFactory adapterFactory) {
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

			addStatementURIPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Statement URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStatementURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Statement_statementURI_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Statement_statementURI_feature", "_UI_Statement_type"),
			StatementPackage.Literals.STATEMENT__STATEMENT_URI, true, false, false,
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
			childrenFeatures.add(StatementPackage.Literals.STATEMENT__SUBJECT);
			childrenFeatures.add(StatementPackage.Literals.STATEMENT__PREDICATE);
			childrenFeatures.add(StatementPackage.Literals.STATEMENT__TARGET);
			childrenFeatures.add(StatementPackage.Literals.STATEMENT__ASSOCIATED_ATTRIBUTE);
			childrenFeatures.add(StatementPackage.Literals.STATEMENT__SOURCE);
			childrenFeatures.add(StatementPackage.Literals.STATEMENT__ASSERTED_BY);
			childrenFeatures.add(StatementPackage.Literals.STATEMENT__ASSERTED_IN);
			childrenFeatures.add(StatementPackage.Literals.STATEMENT__QUALIFIER);
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
	 * This returns Statement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Statement"));
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
		EntryState labelValue = ((Statement) object).getEntryState();
		String label = labelValue == null
				? null
				: labelValue.toString();
		return label == null || label.length() == 0
				? getString("_UI_Statement_type")
				: getString("_UI_Statement_type") + " " + label;
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

		switch (notification.getFeatureID(Statement.class)) {
			case StatementPackage.STATEMENT__STATEMENT_URI:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case StatementPackage.STATEMENT__SUBJECT:
			case StatementPackage.STATEMENT__PREDICATE:
			case StatementPackage.STATEMENT__TARGET:
			case StatementPackage.STATEMENT__ASSOCIATED_ATTRIBUTE:
			case StatementPackage.STATEMENT__SOURCE:
			case StatementPackage.STATEMENT__ASSERTED_BY:
			case StatementPackage.STATEMENT__ASSERTED_IN:
			case StatementPackage.STATEMENT__QUALIFIER:
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
			StatementPackage.Literals.STATEMENT__SUBJECT, StatementFactory.eINSTANCE.createStatementSubject()));

		newChildDescriptors.add(createChildParameter(
			StatementPackage.Literals.STATEMENT__PREDICATE, CoreFactory.eINSTANCE.createURIAndEntityName()));

		newChildDescriptors.add(createChildParameter(
			StatementPackage.Literals.STATEMENT__PREDICATE, CoreFactory.eINSTANCE.createEntitySynopsis()));

		newChildDescriptors.add(createChildParameter(
			StatementPackage.Literals.STATEMENT__PREDICATE, CoreFactory.eINSTANCE.createPredicateReference()));

		newChildDescriptors.add(createChildParameter(
			StatementPackage.Literals.STATEMENT__TARGET, CoreFactory.eINSTANCE.createStatementTarget()));

		newChildDescriptors.add(createChildParameter(
			StatementPackage.Literals.STATEMENT__ASSOCIATED_ATTRIBUTE,
			CoreFactory.eINSTANCE.createModelAttributeReference()));

		newChildDescriptors.add(createChildParameter(
			StatementPackage.Literals.STATEMENT__SOURCE, CoreFactory.eINSTANCE.createSourceAndRoleReference()));

		newChildDescriptors.add(createChildParameter(
			StatementPackage.Literals.STATEMENT__ASSERTED_BY, CoreFactory.eINSTANCE.createCodeSystemVersionReference()));

		newChildDescriptors.add(createChildParameter(
			StatementPackage.Literals.STATEMENT__ASSERTED_IN, CoreFactory.eINSTANCE.createCodeSystemVersionReference()));

		newChildDescriptors.add(createChildParameter(
			StatementPackage.Literals.STATEMENT__QUALIFIER, StatementFactory.eINSTANCE.createStatementQualifier()));
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

		boolean qualify = childFeature == StatementPackage.Literals.STATEMENT__ASSERTED_BY ||
				childFeature == StatementPackage.Literals.STATEMENT__ASSERTED_IN;

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
