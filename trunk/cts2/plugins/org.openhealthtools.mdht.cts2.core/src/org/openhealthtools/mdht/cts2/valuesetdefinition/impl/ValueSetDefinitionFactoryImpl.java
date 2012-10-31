/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.cts2.valuesetdefinition.AssociatedEntitiesReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ExternalValueSetDefinition;
import org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet;
import org.openhealthtools.mdht.cts2.valuesetdefinition.LeafOrAll;
import org.openhealthtools.mdht.cts2.valuesetdefinition.PropertyQueryReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectory;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetDirectoryEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetMsg;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary;
import org.openhealthtools.mdht.cts2.valuesetdefinition.SetOperator;
import org.openhealthtools.mdht.cts2.valuesetdefinition.SpecificEntityList;
import org.openhealthtools.mdht.cts2.valuesetdefinition.TransitiveClosure;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectory;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionDirectoryEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionFactory;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionList;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionListEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionMsg;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ValueSetDefinitionFactoryImpl extends EFactoryImpl implements ValueSetDefinitionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ValueSetDefinitionFactory init() {
		try {
			ValueSetDefinitionFactory theValueSetDefinitionFactory = (ValueSetDefinitionFactory) EPackage.Registry.INSTANCE.getEFactory("http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition");
			if (theValueSetDefinitionFactory != null) {
				return theValueSetDefinitionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ValueSetDefinitionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ValueSetDefinitionPackage.ASSOCIATED_ENTITIES_REFERENCE:
				return createAssociatedEntitiesReference();
			case ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE:
				return createCompleteCodeSystemReference();
			case ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE:
				return createCompleteValueSetReference();
			case ValueSetDefinitionPackage.DOCUMENT_ROOT:
				return createDocumentRoot();
			case ValueSetDefinitionPackage.EXTERNAL_VALUE_SET_DEFINITION:
				return createExternalValueSetDefinition();
			case ValueSetDefinitionPackage.ITERATABLE_RESOLVED_VALUE_SET:
				return createIteratableResolvedValueSet();
			case ValueSetDefinitionPackage.PROPERTY_QUERY_REFERENCE:
				return createPropertyQueryReference();
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET:
				return createResolvedValueSet();
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_DIRECTORY:
				return createResolvedValueSetDirectory();
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_DIRECTORY_ENTRY:
				return createResolvedValueSetDirectoryEntry();
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER:
				return createResolvedValueSetHeader();
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_MSG:
				return createResolvedValueSetMsg();
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_SUMMARY:
				return createResolvedValueSetSummary();
			case ValueSetDefinitionPackage.SPECIFIC_ENTITY_LIST:
				return createSpecificEntityList();
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION:
				return createValueSetDefinition();
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_DIRECTORY:
				return createValueSetDefinitionDirectory();
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_DIRECTORY_ENTRY:
				return createValueSetDefinitionDirectoryEntry();
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_ENTRY:
				return createValueSetDefinitionEntry();
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_LIST:
				return createValueSetDefinitionList();
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_LIST_ENTRY:
				return createValueSetDefinitionListEntry();
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION_MSG:
				return createValueSetDefinitionMsg();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ValueSetDefinitionPackage.LEAF_OR_ALL:
				return createLeafOrAllFromString(eDataType, initialValue);
			case ValueSetDefinitionPackage.SET_OPERATOR:
				return createSetOperatorFromString(eDataType, initialValue);
			case ValueSetDefinitionPackage.TRANSITIVE_CLOSURE:
				return createTransitiveClosureFromString(eDataType, initialValue);
			case ValueSetDefinitionPackage.LEAF_OR_ALL_OBJECT:
				return createLeafOrAllObjectFromString(eDataType, initialValue);
			case ValueSetDefinitionPackage.SET_OPERATOR_OBJECT:
				return createSetOperatorObjectFromString(eDataType, initialValue);
			case ValueSetDefinitionPackage.TRANSITIVE_CLOSURE_OBJECT:
				return createTransitiveClosureObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() +
						"' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ValueSetDefinitionPackage.LEAF_OR_ALL:
				return convertLeafOrAllToString(eDataType, instanceValue);
			case ValueSetDefinitionPackage.SET_OPERATOR:
				return convertSetOperatorToString(eDataType, instanceValue);
			case ValueSetDefinitionPackage.TRANSITIVE_CLOSURE:
				return convertTransitiveClosureToString(eDataType, instanceValue);
			case ValueSetDefinitionPackage.LEAF_OR_ALL_OBJECT:
				return convertLeafOrAllObjectToString(eDataType, instanceValue);
			case ValueSetDefinitionPackage.SET_OPERATOR_OBJECT:
				return convertSetOperatorObjectToString(eDataType, instanceValue);
			case ValueSetDefinitionPackage.TRANSITIVE_CLOSURE_OBJECT:
				return convertTransitiveClosureObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() +
						"' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociatedEntitiesReference createAssociatedEntitiesReference() {
		AssociatedEntitiesReferenceImpl associatedEntitiesReference = new AssociatedEntitiesReferenceImpl();
		return associatedEntitiesReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CompleteCodeSystemReference createCompleteCodeSystemReference() {
		CompleteCodeSystemReferenceImpl completeCodeSystemReference = new CompleteCodeSystemReferenceImpl();
		return completeCodeSystemReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CompleteValueSetReference createCompleteValueSetReference() {
		CompleteValueSetReferenceImpl completeValueSetReference = new CompleteValueSetReferenceImpl();
		return completeValueSetReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExternalValueSetDefinition createExternalValueSetDefinition() {
		ExternalValueSetDefinitionImpl externalValueSetDefinition = new ExternalValueSetDefinitionImpl();
		return externalValueSetDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IteratableResolvedValueSet createIteratableResolvedValueSet() {
		IteratableResolvedValueSetImpl iteratableResolvedValueSet = new IteratableResolvedValueSetImpl();
		return iteratableResolvedValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PropertyQueryReference createPropertyQueryReference() {
		PropertyQueryReferenceImpl propertyQueryReference = new PropertyQueryReferenceImpl();
		return propertyQueryReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResolvedValueSet createResolvedValueSet() {
		ResolvedValueSetImpl resolvedValueSet = new ResolvedValueSetImpl();
		return resolvedValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResolvedValueSetDirectory createResolvedValueSetDirectory() {
		ResolvedValueSetDirectoryImpl resolvedValueSetDirectory = new ResolvedValueSetDirectoryImpl();
		return resolvedValueSetDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResolvedValueSetDirectoryEntry createResolvedValueSetDirectoryEntry() {
		ResolvedValueSetDirectoryEntryImpl resolvedValueSetDirectoryEntry = new ResolvedValueSetDirectoryEntryImpl();
		return resolvedValueSetDirectoryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResolvedValueSetHeader createResolvedValueSetHeader() {
		ResolvedValueSetHeaderImpl resolvedValueSetHeader = new ResolvedValueSetHeaderImpl();
		return resolvedValueSetHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResolvedValueSetMsg createResolvedValueSetMsg() {
		ResolvedValueSetMsgImpl resolvedValueSetMsg = new ResolvedValueSetMsgImpl();
		return resolvedValueSetMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResolvedValueSetSummary createResolvedValueSetSummary() {
		ResolvedValueSetSummaryImpl resolvedValueSetSummary = new ResolvedValueSetSummaryImpl();
		return resolvedValueSetSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SpecificEntityList createSpecificEntityList() {
		SpecificEntityListImpl specificEntityList = new SpecificEntityListImpl();
		return specificEntityList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinition createValueSetDefinition() {
		ValueSetDefinitionImpl valueSetDefinition = new ValueSetDefinitionImpl();
		return valueSetDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionDirectory createValueSetDefinitionDirectory() {
		ValueSetDefinitionDirectoryImpl valueSetDefinitionDirectory = new ValueSetDefinitionDirectoryImpl();
		return valueSetDefinitionDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionDirectoryEntry createValueSetDefinitionDirectoryEntry() {
		ValueSetDefinitionDirectoryEntryImpl valueSetDefinitionDirectoryEntry = new ValueSetDefinitionDirectoryEntryImpl();
		return valueSetDefinitionDirectoryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionEntry createValueSetDefinitionEntry() {
		ValueSetDefinitionEntryImpl valueSetDefinitionEntry = new ValueSetDefinitionEntryImpl();
		return valueSetDefinitionEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionList createValueSetDefinitionList() {
		ValueSetDefinitionListImpl valueSetDefinitionList = new ValueSetDefinitionListImpl();
		return valueSetDefinitionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionListEntry createValueSetDefinitionListEntry() {
		ValueSetDefinitionListEntryImpl valueSetDefinitionListEntry = new ValueSetDefinitionListEntryImpl();
		return valueSetDefinitionListEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionMsg createValueSetDefinitionMsg() {
		ValueSetDefinitionMsgImpl valueSetDefinitionMsg = new ValueSetDefinitionMsgImpl();
		return valueSetDefinitionMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LeafOrAll createLeafOrAllFromString(EDataType eDataType, String initialValue) {
		LeafOrAll result = LeafOrAll.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertLeafOrAllToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SetOperator createSetOperatorFromString(EDataType eDataType, String initialValue) {
		SetOperator result = SetOperator.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertSetOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TransitiveClosure createTransitiveClosureFromString(EDataType eDataType, String initialValue) {
		TransitiveClosure result = TransitiveClosure.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertTransitiveClosureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LeafOrAll createLeafOrAllObjectFromString(EDataType eDataType, String initialValue) {
		return createLeafOrAllFromString(ValueSetDefinitionPackage.Literals.LEAF_OR_ALL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertLeafOrAllObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLeafOrAllToString(ValueSetDefinitionPackage.Literals.LEAF_OR_ALL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SetOperator createSetOperatorObjectFromString(EDataType eDataType, String initialValue) {
		return createSetOperatorFromString(ValueSetDefinitionPackage.Literals.SET_OPERATOR, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertSetOperatorObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSetOperatorToString(ValueSetDefinitionPackage.Literals.SET_OPERATOR, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TransitiveClosure createTransitiveClosureObjectFromString(EDataType eDataType, String initialValue) {
		return createTransitiveClosureFromString(ValueSetDefinitionPackage.Literals.TRANSITIVE_CLOSURE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertTransitiveClosureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransitiveClosureToString(ValueSetDefinitionPackage.Literals.TRANSITIVE_CLOSURE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionPackage getValueSetDefinitionPackage() {
		return (ValueSetDefinitionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ValueSetDefinitionPackage getPackage() {
		return ValueSetDefinitionPackage.eINSTANCE;
	}

} // ValueSetDefinitionFactoryImpl
