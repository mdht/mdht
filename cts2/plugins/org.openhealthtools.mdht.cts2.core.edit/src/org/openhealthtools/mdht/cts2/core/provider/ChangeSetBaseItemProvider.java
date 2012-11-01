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

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.openhealthtools.mdht.cts2.association.AssociationFactory;

import org.openhealthtools.mdht.cts2.codesystem.CodeSystemFactory;

import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionFactory;

import org.openhealthtools.mdht.cts2.core.ChangeSetBase;
import org.openhealthtools.mdht.cts2.core.CoreFactory;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.FinalizableState;

import org.openhealthtools.mdht.cts2.entity.EntityFactory;

import org.openhealthtools.mdht.cts2.statement.StatementFactory;

import org.openhealthtools.mdht.cts2.valueset.ValueSetFactory;

import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionFactory;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.core.ChangeSetBase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ChangeSetBaseItemProvider extends FinalizableItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChangeSetBaseItemProvider(AdapterFactory adapterFactory) {
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

			addChangeSetURIPropertyDescriptor(object);
			addCloseDatePropertyDescriptor(object);
			addCreationDatePropertyDescriptor(object);
			addEntryCountPropertyDescriptor(object);
			addOfficialEffectiveDatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Change Set URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addChangeSetURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ChangeSetBase_changeSetURI_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ChangeSetBase_changeSetURI_feature",
				"_UI_ChangeSetBase_type"), CorePackage.Literals.CHANGE_SET_BASE__CHANGE_SET_URI, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Close Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCloseDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ChangeSetBase_closeDate_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ChangeSetBase_closeDate_feature", "_UI_ChangeSetBase_type"),
			CorePackage.Literals.CHANGE_SET_BASE__CLOSE_DATE, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ChangeSetBase_creationDate_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ChangeSetBase_creationDate_feature",
				"_UI_ChangeSetBase_type"), CorePackage.Literals.CHANGE_SET_BASE__CREATION_DATE, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Entry Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addEntryCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ChangeSetBase_entryCount_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ChangeSetBase_entryCount_feature", "_UI_ChangeSetBase_type"),
			CorePackage.Literals.CHANGE_SET_BASE__ENTRY_COUNT, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Official Effective Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addOfficialEffectiveDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ChangeSetBase_officialEffectiveDate_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ChangeSetBase_officialEffectiveDate_feature",
				"_UI_ChangeSetBase_type"), CorePackage.Literals.CHANGE_SET_BASE__OFFICIAL_EFFECTIVE_DATE, true, false,
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
			childrenFeatures.add(CorePackage.Literals.CHANGE_SET_BASE__CREATOR);
			childrenFeatures.add(CorePackage.Literals.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS);
			childrenFeatures.add(CorePackage.Literals.CHANGE_SET_BASE__MEMBER);
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
	 * This returns ChangeSetBase.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ChangeSetBase"));
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
		FinalizableState labelValue = ((ChangeSetBase) object).getState();
		String label = labelValue == null
				? null
				: labelValue.toString();
		return label == null || label.length() == 0
				? getString("_UI_ChangeSetBase_type")
				: getString("_UI_ChangeSetBase_type") + " " + label;
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

		switch (notification.getFeatureID(ChangeSetBase.class)) {
			case CorePackage.CHANGE_SET_BASE__CHANGE_SET_URI:
			case CorePackage.CHANGE_SET_BASE__CLOSE_DATE:
			case CorePackage.CHANGE_SET_BASE__CREATION_DATE:
			case CorePackage.CHANGE_SET_BASE__ENTRY_COUNT:
			case CorePackage.CHANGE_SET_BASE__OFFICIAL_EFFECTIVE_DATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.CHANGE_SET_BASE__CREATOR:
			case CorePackage.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS:
			case CorePackage.CHANGE_SET_BASE__MEMBER:
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
			CorePackage.Literals.CHANGE_SET_BASE__CREATOR, CoreFactory.eINSTANCE.createSourceReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS, CoreFactory.eINSTANCE.createOpaqueData()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS, CoreFactory.eINSTANCE.createEntryDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS, CoreFactory.eINSTANCE.createComment()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS, CoreFactory.eINSTANCE.createDefinition()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS, CoreFactory.eINSTANCE.createExample()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS, EntityFactory.eINSTANCE.createDesignation()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS,
			ValueSetDefinitionFactory.eINSTANCE.createExternalValueSetDefinition()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			CoreFactory.eINSTANCE.createAbstractResourceDescriptionDirectoryEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createEntityReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createAnonymousEntityReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createAnonymousStatement()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createNameAndMeaningReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createAssociationReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createBindingQualifierReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createCaseSignificanceReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createChangeDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createChangeSetBase()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createCodeSystemCategoryReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createCodeSystemReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createCodeSystemVersionReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createOpaqueData()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createEntryDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createComment()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createConceptDomainReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createContextReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createDefinition()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createDescriptionInCodeSystem()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createDesignationFidelityReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createDesignationTypeReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createEntityExpression()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createEntityReferenceList()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createURIAndEntityName()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createEntitySynopsis()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createExample()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createFilter()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createPropertyReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createFilterComponent()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createFormalityLevelReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createFormatReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createLanguageReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createMapCorrelationReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createMapReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createMapVersionReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createMatchAlgorithmReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createModelAttributeReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createNamedEntityReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createNamespaceReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createOntologyDomainReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			CoreFactory.eINSTANCE.createOntologyEngineeringMethodologyReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			CoreFactory.eINSTANCE.createOntologyEngineeringToolReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createOntologyLanguageAndSyntax()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createOntologyLanguageReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createOntologySyntaxReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createOntologyTaskReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createOntologyTypeReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createPredicateReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createReasoningAlgorithmReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			CoreFactory.eINSTANCE.createResourceVersionDescriptionDirectoryEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createRESTResource()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createRoleReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createScopedEntityName()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createSortCriteria()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createSortCriterion()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createSourceAndNotation()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createSourceAndRoleReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createSourceReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createStatementTarget()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createStatusReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createTsAnyType()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createValueSetDefinitionReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createValueSetReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CoreFactory.eINSTANCE.createVersionTagReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, AssociationFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, AssociationFactory.eINSTANCE.createAssociationDirectory()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			AssociationFactory.eINSTANCE.createAssociationDirectoryEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, AssociationFactory.eINSTANCE.createAssociationGraph()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, AssociationFactory.eINSTANCE.createAssociationList()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, AssociationFactory.eINSTANCE.createAssociationListEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, AssociationFactory.eINSTANCE.createAssociationMsg()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, AssociationFactory.eINSTANCE.createAssociationRendering()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, AssociationFactory.eINSTANCE.createGraphNode()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CodeSystemFactory.eINSTANCE.createCodeSystemCatalogEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			CodeSystemFactory.eINSTANCE.createCodeSystemCatalogEntryDirectory()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			CodeSystemFactory.eINSTANCE.createCodeSystemCatalogEntryList()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			CodeSystemFactory.eINSTANCE.createCodeSystemCatalogEntryListEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, CodeSystemFactory.eINSTANCE.createCodeSystemCatalogEntryMsg()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			CodeSystemFactory.eINSTANCE.createCodeSystemCatalogEntrySummary()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			CodeSystemVersionFactory.eINSTANCE.createCodeSystemVersionCatalogEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			CodeSystemVersionFactory.eINSTANCE.createCodeSystemVersionCatalogEntryDirectory()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			CodeSystemVersionFactory.eINSTANCE.createCodeSystemVersionCatalogEntryList()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			CodeSystemVersionFactory.eINSTANCE.createCodeSystemVersionCatalogEntryListEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			CodeSystemVersionFactory.eINSTANCE.createCodeSystemVersionCatalogEntryMsg()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			CodeSystemVersionFactory.eINSTANCE.createCodeSystemVersionCatalogEntrySummary()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, EntityFactory.eINSTANCE.createNamedEntityDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, EntityFactory.eINSTANCE.createPredicateDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, EntityFactory.eINSTANCE.createAnnotationPropertyDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, EntityFactory.eINSTANCE.createAnonymousEntityDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			EntityFactory.eINSTANCE.createAnonymousIndividualDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, EntityFactory.eINSTANCE.createClassDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, EntityFactory.eINSTANCE.createDataPropertyDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, EntityFactory.eINSTANCE.createDataTypeDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, EntityFactory.eINSTANCE.createDesignation()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, EntityFactory.eINSTANCE.createEntityDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, EntityFactory.eINSTANCE.createEntityDescriptionMsg()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, EntityFactory.eINSTANCE.createEntityDirectory()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, EntityFactory.eINSTANCE.createEntityDirectoryEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, EntityFactory.eINSTANCE.createEntityList()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, EntityFactory.eINSTANCE.createEntityListEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, EntityFactory.eINSTANCE.createEntityReferenceMsg()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, EntityFactory.eINSTANCE.createNamedIndividualDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, EntityFactory.eINSTANCE.createObjectPropertyDescription()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, StatementFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, StatementFactory.eINSTANCE.createStatementDirectory()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, StatementFactory.eINSTANCE.createStatementDirectoryEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, StatementFactory.eINSTANCE.createStatementList()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, StatementFactory.eINSTANCE.createStatementListEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, StatementFactory.eINSTANCE.createStatementMsg()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, StatementFactory.eINSTANCE.createStatementQualifier()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, StatementFactory.eINSTANCE.createStatementSubject()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, ValueSetFactory.eINSTANCE.createValueSetCatalogEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetFactory.eINSTANCE.createValueSetCatalogEntryDirectory()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, ValueSetFactory.eINSTANCE.createValueSetCatalogEntryList()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetFactory.eINSTANCE.createValueSetCatalogEntryListEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, ValueSetFactory.eINSTANCE.createValueSetCatalogEntryMsg()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, ValueSetFactory.eINSTANCE.createValueSetCatalogEntrySummary()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createAssociatedEntitiesReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createCompleteCodeSystemReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createCompleteValueSetReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createExternalValueSetDefinition()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createIteratableResolvedValueSet()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createPropertyQueryReference()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, ValueSetDefinitionFactory.eINSTANCE.createResolvedValueSet()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createResolvedValueSetDirectory()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createResolvedValueSetSummary()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createResolvedValueSetDirectoryEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createResolvedValueSetHeader()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createResolvedValueSetMsg()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createSpecificEntityList()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createValueSetDefinition()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createValueSetDefinitionDirectory()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createValueSetDefinitionDirectoryEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createValueSetDefinitionEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createValueSetDefinitionList()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createValueSetDefinitionListEntry()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER,
			ValueSetDefinitionFactory.eINSTANCE.createValueSetDefinitionMsg()));

		newChildDescriptors.add(createChildParameter(
			CorePackage.Literals.CHANGE_SET_BASE__MEMBER, XMLTypeFactory.eINSTANCE.createAnyType()));
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

		boolean qualify = childFeature == CorePackage.Literals.CHANGE_SET_BASE__CREATOR ||
				childFeature == CorePackage.Literals.CHANGE_SET_BASE__MEMBER ||
				childFeature == CorePackage.Literals.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] {
					getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
