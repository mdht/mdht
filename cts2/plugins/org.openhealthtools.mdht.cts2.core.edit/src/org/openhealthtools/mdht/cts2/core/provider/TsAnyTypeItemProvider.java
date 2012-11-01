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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.openhealthtools.mdht.cts2.association.AssociationFactory;
import org.openhealthtools.mdht.cts2.association.AssociationPackage;

import org.openhealthtools.mdht.cts2.association.provider.Cts2EditPlugin;

import org.openhealthtools.mdht.cts2.codesystem.CodeSystemFactory;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage;

import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionFactory;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage;

import org.openhealthtools.mdht.cts2.core.CoreFactory;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.TsAnyType;

import org.openhealthtools.mdht.cts2.entity.EntityFactory;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;

import org.openhealthtools.mdht.cts2.statement.StatementFactory;
import org.openhealthtools.mdht.cts2.statement.StatementPackage;

import org.openhealthtools.mdht.cts2.valueset.ValueSetFactory;
import org.openhealthtools.mdht.cts2.valueset.ValueSetPackage;

import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionFactory;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.core.TsAnyType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class TsAnyTypeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TsAnyTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CorePackage.Literals.TS_ANY_TYPE__MIXED);
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
	 * This returns TsAnyType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TsAnyType"));
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
		return getString("_UI_TsAnyType_type");
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

		switch (notification.getFeatureID(TsAnyType.class)) {
			case CorePackage.TS_ANY_TYPE__MIXED:
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
			CorePackage.Literals.TS_ANY_TYPE__MIXED,
			FeatureMapUtil.createEntry(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT, "")));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED,
			FeatureMapUtil.createEntry(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT, "")));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
				XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED,
			FeatureMapUtil.createEntry(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA, "")));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION,
				AssociationFactory.eINSTANCE.createAssociation())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION,
				AssociationFactory.eINSTANCE.createAssociationListEntry())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_DIRECTORY,
				AssociationFactory.eINSTANCE.createAssociationDirectory())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_GRAPH,
				AssociationFactory.eINSTANCE.createAssociationGraph())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_LIST,
				AssociationFactory.eINSTANCE.createAssociationList())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				AssociationPackage.Literals.DOCUMENT_ROOT__ASSOCIATION_MSG,
				AssociationFactory.eINSTANCE.createAssociationMsg())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED,
			FeatureMapUtil.createEntry(
				CorePackage.Literals.DOCUMENT_ROOT__ENTITY_EXPRESSION, CoreFactory.eINSTANCE.createEntityExpression())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				CodeSystemPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY,
				CodeSystemFactory.eINSTANCE.createCodeSystemCatalogEntry())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				CodeSystemPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY,
				CodeSystemFactory.eINSTANCE.createCodeSystemCatalogEntryDirectory())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				CodeSystemPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_LIST,
				CodeSystemFactory.eINSTANCE.createCodeSystemCatalogEntryList())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				CodeSystemPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_CATALOG_ENTRY_MSG,
				CodeSystemFactory.eINSTANCE.createCodeSystemCatalogEntryMsg())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				CodeSystemVersionPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY,
				CodeSystemVersionFactory.eINSTANCE.createCodeSystemVersionCatalogEntry())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				CodeSystemVersionPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY,
				CodeSystemVersionFactory.eINSTANCE.createCodeSystemVersionCatalogEntryDirectory())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				CodeSystemVersionPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST,
				CodeSystemVersionFactory.eINSTANCE.createCodeSystemVersionCatalogEntryList())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				CodeSystemVersionPackage.Literals.DOCUMENT_ROOT__CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG,
				CodeSystemVersionFactory.eINSTANCE.createCodeSystemVersionCatalogEntryMsg())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_DESCRIPTION,
				EntityFactory.eINSTANCE.createEntityDescription())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_DESCRIPTION_MSG,
				EntityFactory.eINSTANCE.createEntityDescriptionMsg())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED,
			FeatureMapUtil.createEntry(
				EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_DIRECTORY, EntityFactory.eINSTANCE.createEntityDirectory())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED,
			FeatureMapUtil.createEntry(
				EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_LIST, EntityFactory.eINSTANCE.createEntityList())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				EntityPackage.Literals.DOCUMENT_ROOT__ENTITY_REFERENCE_MSG,
				EntityFactory.eINSTANCE.createEntityReferenceMsg())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED,
			FeatureMapUtil.createEntry(
				StatementPackage.Literals.DOCUMENT_ROOT__STATEMENT, StatementFactory.eINSTANCE.createStatement())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED,
			FeatureMapUtil.createEntry(
				StatementPackage.Literals.DOCUMENT_ROOT__STATEMENT,
				StatementFactory.eINSTANCE.createStatementDirectoryEntry())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				StatementPackage.Literals.DOCUMENT_ROOT__STATEMENT_DIRECTORY,
				StatementFactory.eINSTANCE.createStatementDirectory())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				StatementPackage.Literals.DOCUMENT_ROOT__STATEMENT_LIST,
				StatementFactory.eINSTANCE.createStatementList())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED,
			FeatureMapUtil.createEntry(
				StatementPackage.Literals.DOCUMENT_ROOT__STATEMENT_MSG, StatementFactory.eINSTANCE.createStatementMsg())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				ValueSetPackage.Literals.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY,
				ValueSetFactory.eINSTANCE.createValueSetCatalogEntry())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				ValueSetPackage.Literals.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_DIRECTORY,
				ValueSetFactory.eINSTANCE.createValueSetCatalogEntryDirectory())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				ValueSetPackage.Literals.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_LIST,
				ValueSetFactory.eINSTANCE.createValueSetCatalogEntryList())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				ValueSetPackage.Literals.DOCUMENT_ROOT__VALUE_SET_CATALOG_ENTRY_MSG,
				ValueSetFactory.eINSTANCE.createValueSetCatalogEntryMsg())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__ITERATABLE_RESOLVED_VALUE_SET,
				ValueSetDefinitionFactory.eINSTANCE.createIteratableResolvedValueSet())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET,
				ValueSetDefinitionFactory.eINSTANCE.createResolvedValueSet())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_DIRECTORY,
				ValueSetDefinitionFactory.eINSTANCE.createResolvedValueSetDirectory())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_MSG,
				ValueSetDefinitionFactory.eINSTANCE.createResolvedValueSetMsg())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_SUMMARY,
				ValueSetDefinitionFactory.eINSTANCE.createResolvedValueSetSummary())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__RESOLVED_VALUE_SET_SUMMARY,
				ValueSetDefinitionFactory.eINSTANCE.createResolvedValueSetDirectoryEntry())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION,
				ValueSetDefinitionFactory.eINSTANCE.createValueSetDefinition())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_DIRECTORY,
				ValueSetDefinitionFactory.eINSTANCE.createValueSetDefinitionDirectory())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_ENTRY,
				ValueSetDefinitionFactory.eINSTANCE.createValueSetDefinitionEntry())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_LIST,
				ValueSetDefinitionFactory.eINSTANCE.createValueSetDefinitionList())));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.TS_ANY_TYPE__MIXED, FeatureMapUtil.createEntry(
				ValueSetDefinitionPackage.Literals.DOCUMENT_ROOT__VALUE_SET_DEFINITION_MSG,
				ValueSetDefinitionFactory.eINSTANCE.createValueSetDefinitionMsg())));
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
