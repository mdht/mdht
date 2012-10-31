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
package org.openhealthtools.mdht.cts2.association.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.cts2.association.Association;
import org.openhealthtools.mdht.cts2.association.AssociationDerivation;
import org.openhealthtools.mdht.cts2.association.AssociationDirectory;
import org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry;
import org.openhealthtools.mdht.cts2.association.AssociationFactory;
import org.openhealthtools.mdht.cts2.association.AssociationGraph;
import org.openhealthtools.mdht.cts2.association.AssociationList;
import org.openhealthtools.mdht.cts2.association.AssociationListEntry;
import org.openhealthtools.mdht.cts2.association.AssociationMsg;
import org.openhealthtools.mdht.cts2.association.AssociationPackage;
import org.openhealthtools.mdht.cts2.association.AssociationRendering;
import org.openhealthtools.mdht.cts2.association.DocumentRoot;
import org.openhealthtools.mdht.cts2.association.GraphDirection;
import org.openhealthtools.mdht.cts2.association.GraphFocus;
import org.openhealthtools.mdht.cts2.association.GraphNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class AssociationFactoryImpl extends EFactoryImpl implements AssociationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static AssociationFactory init() {
		try {
			AssociationFactory theAssociationFactory = (AssociationFactory) EPackage.Registry.INSTANCE.getEFactory("http://schema.omg.org/spec/CTS2/1.0/Association");
			if (theAssociationFactory != null) {
				return theAssociationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssociationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationFactoryImpl() {
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
			case AssociationPackage.ASSOCIATION:
				return createAssociation();
			case AssociationPackage.ASSOCIATION_DIRECTORY:
				return createAssociationDirectory();
			case AssociationPackage.ASSOCIATION_DIRECTORY_ENTRY:
				return createAssociationDirectoryEntry();
			case AssociationPackage.ASSOCIATION_GRAPH:
				return createAssociationGraph();
			case AssociationPackage.ASSOCIATION_LIST:
				return createAssociationList();
			case AssociationPackage.ASSOCIATION_LIST_ENTRY:
				return createAssociationListEntry();
			case AssociationPackage.ASSOCIATION_MSG:
				return createAssociationMsg();
			case AssociationPackage.ASSOCIATION_RENDERING:
				return createAssociationRendering();
			case AssociationPackage.DOCUMENT_ROOT:
				return createDocumentRoot();
			case AssociationPackage.GRAPH_NODE:
				return createGraphNode();
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
			case AssociationPackage.ASSOCIATION_DERIVATION:
				return createAssociationDerivationFromString(eDataType, initialValue);
			case AssociationPackage.GRAPH_DIRECTION:
				return createGraphDirectionFromString(eDataType, initialValue);
			case AssociationPackage.GRAPH_FOCUS:
				return createGraphFocusFromString(eDataType, initialValue);
			case AssociationPackage.ASSOCIATION_DERIVATION_OBJECT:
				return createAssociationDerivationObjectFromString(eDataType, initialValue);
			case AssociationPackage.GRAPH_DIRECTION_OBJECT:
				return createGraphDirectionObjectFromString(eDataType, initialValue);
			case AssociationPackage.GRAPH_FOCUS_OBJECT:
				return createGraphFocusObjectFromString(eDataType, initialValue);
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
			case AssociationPackage.ASSOCIATION_DERIVATION:
				return convertAssociationDerivationToString(eDataType, instanceValue);
			case AssociationPackage.GRAPH_DIRECTION:
				return convertGraphDirectionToString(eDataType, instanceValue);
			case AssociationPackage.GRAPH_FOCUS:
				return convertGraphFocusToString(eDataType, instanceValue);
			case AssociationPackage.ASSOCIATION_DERIVATION_OBJECT:
				return convertAssociationDerivationObjectToString(eDataType, instanceValue);
			case AssociationPackage.GRAPH_DIRECTION_OBJECT:
				return convertGraphDirectionObjectToString(eDataType, instanceValue);
			case AssociationPackage.GRAPH_FOCUS_OBJECT:
				return convertGraphFocusObjectToString(eDataType, instanceValue);
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
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationDirectory createAssociationDirectory() {
		AssociationDirectoryImpl associationDirectory = new AssociationDirectoryImpl();
		return associationDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationDirectoryEntry createAssociationDirectoryEntry() {
		AssociationDirectoryEntryImpl associationDirectoryEntry = new AssociationDirectoryEntryImpl();
		return associationDirectoryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationGraph createAssociationGraph() {
		AssociationGraphImpl associationGraph = new AssociationGraphImpl();
		return associationGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationList createAssociationList() {
		AssociationListImpl associationList = new AssociationListImpl();
		return associationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationListEntry createAssociationListEntry() {
		AssociationListEntryImpl associationListEntry = new AssociationListEntryImpl();
		return associationListEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationMsg createAssociationMsg() {
		AssociationMsgImpl associationMsg = new AssociationMsgImpl();
		return associationMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationRendering createAssociationRendering() {
		AssociationRenderingImpl associationRendering = new AssociationRenderingImpl();
		return associationRendering;
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
	public GraphNode createGraphNode() {
		GraphNodeImpl graphNode = new GraphNodeImpl();
		return graphNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationDerivation createAssociationDerivationFromString(EDataType eDataType, String initialValue) {
		AssociationDerivation result = AssociationDerivation.get(initialValue);
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
	public String convertAssociationDerivationToString(EDataType eDataType, Object instanceValue) {
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
	public GraphDirection createGraphDirectionFromString(EDataType eDataType, String initialValue) {
		GraphDirection result = GraphDirection.get(initialValue);
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
	public String convertGraphDirectionToString(EDataType eDataType, Object instanceValue) {
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
	public GraphFocus createGraphFocusFromString(EDataType eDataType, String initialValue) {
		GraphFocus result = GraphFocus.get(initialValue);
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
	public String convertGraphFocusToString(EDataType eDataType, Object instanceValue) {
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
	public AssociationDerivation createAssociationDerivationObjectFromString(EDataType eDataType, String initialValue) {
		return createAssociationDerivationFromString(AssociationPackage.Literals.ASSOCIATION_DERIVATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertAssociationDerivationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssociationDerivationToString(AssociationPackage.Literals.ASSOCIATION_DERIVATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GraphDirection createGraphDirectionObjectFromString(EDataType eDataType, String initialValue) {
		return createGraphDirectionFromString(AssociationPackage.Literals.GRAPH_DIRECTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertGraphDirectionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGraphDirectionToString(AssociationPackage.Literals.GRAPH_DIRECTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GraphFocus createGraphFocusObjectFromString(EDataType eDataType, String initialValue) {
		return createGraphFocusFromString(AssociationPackage.Literals.GRAPH_FOCUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertGraphFocusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGraphFocusToString(AssociationPackage.Literals.GRAPH_FOCUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationPackage getAssociationPackage() {
		return (AssociationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssociationPackage getPackage() {
		return AssociationPackage.eINSTANCE;
	}

} // AssociationFactoryImpl
