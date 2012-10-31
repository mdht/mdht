/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.cts2.core.Changeable;
import org.openhealthtools.mdht.cts2.core.Directory;
import org.openhealthtools.mdht.cts2.core.DirectoryEntry;
import org.openhealthtools.mdht.cts2.core.Message;
import org.openhealthtools.mdht.cts2.core.OpaqueData;
import org.openhealthtools.mdht.cts2.core.ResourceDescription;
import org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry;
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescription;
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ExternalValueSetDefinition;
import org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet;
import org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectory;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectoryEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetMsg;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary;
import org.openhealthtools.mdht.cts2.valuesetdefinition.SpecificEntityList;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectory;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectoryEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionList;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionListEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionMsg;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage
 * @generated
 */
public class ValueSetDefinitionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static ValueSetDefinitionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ValueSetDefinitionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetDefinitionSwitch<Adapter> modelSwitch = new ValueSetDefinitionSwitch<Adapter>() {
		@Override
		public Adapter caseAssociatedEntitiesReference(AssociatedEntitiesReference object) {
			return createAssociatedEntitiesReferenceAdapter();
		}

		@Override
		public Adapter caseCompleteCodeSystemReference(CompleteCodeSystemReference object) {
			return createCompleteCodeSystemReferenceAdapter();
		}

		@Override
		public Adapter caseCompleteValueSetReference(CompleteValueSetReference object) {
			return createCompleteValueSetReferenceAdapter();
		}

		@Override
		public Adapter caseDocumentRoot(DocumentRoot object) {
			return createDocumentRootAdapter();
		}

		@Override
		public Adapter caseExternalValueSetDefinition(ExternalValueSetDefinition object) {
			return createExternalValueSetDefinitionAdapter();
		}

		@Override
		public Adapter caseIteratableResolvedValueSet(IteratableResolvedValueSet object) {
			return createIteratableResolvedValueSetAdapter();
		}

		@Override
		public Adapter casePropertyQueryReference(PropertyQueryReference object) {
			return createPropertyQueryReferenceAdapter();
		}

		@Override
		public Adapter caseResolvedValueSet(ResolvedValueSet object) {
			return createResolvedValueSetAdapter();
		}

		@Override
		public Adapter caseResolvedValueSetDirectory(ResolvedValueSetDirectory object) {
			return createResolvedValueSetDirectoryAdapter();
		}

		@Override
		public Adapter caseResolvedValueSetDirectoryEntry(ResolvedValueSetDirectoryEntry object) {
			return createResolvedValueSetDirectoryEntryAdapter();
		}

		@Override
		public Adapter caseResolvedValueSetHeader(ResolvedValueSetHeader object) {
			return createResolvedValueSetHeaderAdapter();
		}

		@Override
		public Adapter caseResolvedValueSetMsg(ResolvedValueSetMsg object) {
			return createResolvedValueSetMsgAdapter();
		}

		@Override
		public Adapter caseResolvedValueSetSummary(ResolvedValueSetSummary object) {
			return createResolvedValueSetSummaryAdapter();
		}

		@Override
		public Adapter caseSpecificEntityList(SpecificEntityList object) {
			return createSpecificEntityListAdapter();
		}

		@Override
		public Adapter caseValueSetDefinition(ValueSetDefinition object) {
			return createValueSetDefinitionAdapter();
		}

		@Override
		public Adapter caseValueSetDefinitionDirectory(ValueSetDefinitionDirectory object) {
			return createValueSetDefinitionDirectoryAdapter();
		}

		@Override
		public Adapter caseValueSetDefinitionDirectoryEntry(ValueSetDefinitionDirectoryEntry object) {
			return createValueSetDefinitionDirectoryEntryAdapter();
		}

		@Override
		public Adapter caseValueSetDefinitionEntry(ValueSetDefinitionEntry object) {
			return createValueSetDefinitionEntryAdapter();
		}

		@Override
		public Adapter caseValueSetDefinitionList(ValueSetDefinitionList object) {
			return createValueSetDefinitionListAdapter();
		}

		@Override
		public Adapter caseValueSetDefinitionListEntry(ValueSetDefinitionListEntry object) {
			return createValueSetDefinitionListEntryAdapter();
		}

		@Override
		public Adapter caseValueSetDefinitionMsg(ValueSetDefinitionMsg object) {
			return createValueSetDefinitionMsgAdapter();
		}

		@Override
		public Adapter caseOpaqueData(OpaqueData object) {
			return createOpaqueDataAdapter();
		}

		@Override
		public Adapter caseMessage(Message object) {
			return createMessageAdapter();
		}

		@Override
		public Adapter caseDirectory(Directory object) {
			return createDirectoryAdapter();
		}

		@Override
		public Adapter caseChangeable(Changeable object) {
			return createChangeableAdapter();
		}

		@Override
		public Adapter caseResourceDescription(ResourceDescription object) {
			return createResourceDescriptionAdapter();
		}

		@Override
		public Adapter caseResourceVersionDescription(ResourceVersionDescription object) {
			return createResourceVersionDescriptionAdapter();
		}

		@Override
		public Adapter caseDirectoryEntry(DirectoryEntry object) {
			return createDirectoryEntryAdapter();
		}

		@Override
		public Adapter caseResourceDescriptionDirectoryEntry(ResourceDescriptionDirectoryEntry object) {
			return createResourceDescriptionDirectoryEntryAdapter();
		}

		@Override
		public Adapter caseResourceVersionDescriptionDirectoryEntry(ResourceVersionDescriptionDirectoryEntry object) {
			return createResourceVersionDescriptionDirectoryEntryAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference
	 * <em>Associated Entities Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference
	 * @generated
	 */
	public Adapter createAssociatedEntitiesReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference
	 * <em>Complete Code System Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference
	 * @generated
	 */
	public Adapter createCompleteCodeSystemReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference
	 * <em>Complete Value Set Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference
	 * @generated
	 */
	public Adapter createCompleteValueSetReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ExternalValueSetDefinition
	 * <em>External Value Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ExternalValueSetDefinition
	 * @generated
	 */
	public Adapter createExternalValueSetDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet
	 * <em>Iteratable Resolved Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet
	 * @generated
	 */
	public Adapter createIteratableResolvedValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference
	 * <em>Property Query Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference
	 * @generated
	 */
	public Adapter createPropertyQueryReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet
	 * <em>Resolved Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet
	 * @generated
	 */
	public Adapter createResolvedValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectory
	 * <em>Resolved Value Set Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectory
	 * @generated
	 */
	public Adapter createResolvedValueSetDirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectoryEntry
	 * <em>Resolved Value Set Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectoryEntry
	 * @generated
	 */
	public Adapter createResolvedValueSetDirectoryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader
	 * <em>Resolved Value Set Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader
	 * @generated
	 */
	public Adapter createResolvedValueSetHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetMsg
	 * <em>Resolved Value Set Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetMsg
	 * @generated
	 */
	public Adapter createResolvedValueSetMsgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary
	 * <em>Resolved Value Set Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary
	 * @generated
	 */
	public Adapter createResolvedValueSetSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.SpecificEntityList
	 * <em>Specific Entity List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.SpecificEntityList
	 * @generated
	 */
	public Adapter createSpecificEntityListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition
	 * <em>Value Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition
	 * @generated
	 */
	public Adapter createValueSetDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectory
	 * <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectory
	 * @generated
	 */
	public Adapter createValueSetDefinitionDirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectoryEntry
	 * <em>Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectoryEntry
	 * @generated
	 */
	public Adapter createValueSetDefinitionDirectoryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry
	 * @generated
	 */
	public Adapter createValueSetDefinitionEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionList
	 * @generated
	 */
	public Adapter createValueSetDefinitionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionListEntry
	 * <em>List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionListEntry
	 * @generated
	 */
	public Adapter createValueSetDefinitionListEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionMsg
	 * @generated
	 */
	public Adapter createValueSetDefinitionMsgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.OpaqueData <em>Opaque Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.OpaqueData
	 * @generated
	 */
	public Adapter createOpaqueDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Directory
	 * @generated
	 */
	public Adapter createDirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Changeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Changeable
	 * @generated
	 */
	public Adapter createChangeableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription <em>Resource Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescription
	 * @generated
	 */
	public Adapter createResourceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription
	 * <em>Resource Version Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceVersionDescription
	 * @generated
	 */
	public Adapter createResourceVersionDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.DirectoryEntry <em>Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.DirectoryEntry
	 * @generated
	 */
	public Adapter createDirectoryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry
	 * <em>Resource Description Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry
	 * @generated
	 */
	public Adapter createResourceDescriptionDirectoryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry
	 * <em>Resource Version Description Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry
	 * @generated
	 */
	public Adapter createResourceVersionDescriptionDirectoryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // ValueSetDefinitionAdapterFactory
