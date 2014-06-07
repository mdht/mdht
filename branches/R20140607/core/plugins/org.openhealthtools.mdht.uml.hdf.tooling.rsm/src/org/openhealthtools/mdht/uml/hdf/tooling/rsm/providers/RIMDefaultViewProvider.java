/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hdf.tooling.rsm.providers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.transaction.TransactionalEditingDomain;

import org.eclipse.emf.transaction.util.TransactionUtil;

import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;

import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;

import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;

import org.eclipse.gmf.runtime.diagram.core.services.ViewService;

import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation;

import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IMetamodelType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.openhealthtools.mdht.uml.hdf.tooling.rsm.types.RIMElementTypes;
import org.openhealthtools.mdht.uml.hdf.tooling.rsm.viewFactories.ActClassViewCustomizer;
import org.openhealthtools.mdht.uml.hdf.tooling.rsm.viewFactories.ActRelationshipClassViewCustomizer;
import org.openhealthtools.mdht.uml.hdf.tooling.rsm.viewFactories.EntityClassViewCustomizer;
import org.openhealthtools.mdht.uml.hdf.tooling.rsm.viewFactories.ParticipationClassViewCustomizer;
import org.openhealthtools.mdht.uml.hdf.tooling.rsm.viewFactories.RoleClassViewCustomizer;
import org.openhealthtools.mdht.uml.hdf.tooling.rsm.viewFactories.RoleLinkClassViewCustomizer;
import org.openhealthtools.mdht.uml.hdf.ui.util.RIMColorUtil;

/**
 * @generated
 */
public class RIMDefaultViewProvider extends AbstractProvider implements IViewProvider {

	/**
	 * @generated
	 */
	public static interface IViewCustomizer {
		/**
		 * @generated
		 */
		public void customizeView(View view);
	}

	/**
	 * @generated
	 */
	private class WrapperAdaptable implements IAdaptable {
		/**
		 * @generated
		 */
		IAdaptable baseAdaptable = null;

		/**
		 * @generated
		 */
		public WrapperAdaptable(IAdaptable wrapped) {
			baseAdaptable = wrapped;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			return baseAdaptable.getAdapter(adapter);
		}
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, IViewCustomizer> nodeMap = new HashMap<IElementType, IViewCustomizer>();

	/**
	 * @generated
	 */
	static {
		nodeMap.put(RIMElementTypes._ACT__CLASS, ActClassViewCustomizer.INSTANCE);
		nodeMap.put(RIMElementTypes._ENTITY__CLASS, EntityClassViewCustomizer.INSTANCE);
		nodeMap.put(RIMElementTypes._ROLE__CLASS, RoleClassViewCustomizer.INSTANCE);
		nodeMap.put(RIMElementTypes._ROLELINK__CLASS, RoleLinkClassViewCustomizer.INSTANCE);
		nodeMap.put(RIMElementTypes._ACTRELATIONSHIP__CLASS, ActRelationshipClassViewCustomizer.INSTANCE);
		nodeMap.put(RIMElementTypes._PARTICIPATION__CLASS, ParticipationClassViewCustomizer.INSTANCE);
		nodeMap.put(RIMElementTypes._LANGUAGECOMMUNICATION__CLASS, ParticipationClassViewCustomizer.INSTANCE);
	}

	/**
	 * @generated
	 */
	public Diagram createDiagram(IAdaptable semanticAdapter, String diagramKind, PreferencesHint preferencesHint) {
		return ViewService.getInstance().createDiagram(
			new WrapperAdaptable(semanticAdapter), diagramKind, preferencesHint);
	}

	/**
	 * @generated NOT
	 */
	public Edge createEdge(IAdaptable semanticAdapter, View containerView, String semanticHint, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		Edge umlEdge = ViewService.getInstance().createEdge(
			new WrapperAdaptable(semanticAdapter), containerView, semanticHint, index, persisted, preferencesHint);
		IViewCustomizer customizer = getEdgeViewCustomizer(semanticAdapter, containerView, semanticHint);
		if (customizer != null && umlEdge != null) {
			customizer.customizeView(umlEdge);
		}

		// Assign RIM color to association classes
		if (umlEdge != null && umlEdge.getElement() instanceof AssociationClass) {
			for (Iterator iter = ((AssociationClass) umlEdge.getElement()).getAppliedStereotypes().iterator(); iter.hasNext();) {
				Stereotype stereotype = (Stereotype) iter.next();
				if (RIMColorUtil.assignRIMColor(umlEdge, stereotype) == true) {
					break;
				}
			}
		}

		return umlEdge;
	}

	/**
	 * @generated NOT
	 */
	public Node createNode(IAdaptable semanticAdapter, View containerView, String semanticHint, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		Node umlNode = ViewService.getInstance().createNode(
			new WrapperAdaptable(semanticAdapter), containerView, semanticHint, index, persisted, preferencesHint);
		IViewCustomizer customizer = getNodeViewCustomizer(semanticAdapter, containerView, semanticHint);
		if (customizer != null && umlNode != null) {
			customizer.customizeView(umlNode);
		}

		// Assign RIM color
		if (umlNode != null && umlNode.getElement() instanceof Classifier) {
			for (Iterator iter = ((Classifier) umlNode.getElement()).getAppliedStereotypes().iterator(); iter.hasNext();) {
				Stereotype stereotype = (Stereotype) iter.next();
				if (RIMColorUtil.assignRIMColor(umlNode, stereotype) == true) {
					break;
				}
			}
		}

		return umlNode;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		/* if this is the CreateViewForKindOperation operation */
		if (operation instanceof CreateViewForKindOperation) {
			return provides((CreateViewForKindOperation) operation);
		}

		/* call the specific provides method */
		if (operation instanceof CreateDiagramViewOperation) {
			return provides((CreateDiagramViewOperation) operation);
		} else if (operation instanceof CreateEdgeViewOperation) {
			return provides((CreateEdgeViewOperation) operation);
		} else if (operation instanceof CreateNodeViewOperation) {
			return provides((CreateNodeViewOperation) operation);
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateViewForKindOperation op) {
		if (op.getViewKind() == Node.class) {
			return getNodeViewCustomizer(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		}
		if (op.getViewKind() == Edge.class) {
			return getEdgeViewCustomizer(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateDiagramViewOperation operation) {
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateEdgeViewOperation operation) {
		return (getEdgeViewCustomizer(
			operation.getSemanticAdapter(), operation.getContainerView(), operation.getSemanticHint()) != null);
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateNodeViewOperation operation) {
		return (getNodeViewCustomizer(
			operation.getSemanticAdapter(), operation.getContainerView(), operation.getSemanticHint()) != null);
	}

	/**
	 * @generated
	 */
	protected IViewCustomizer getNodeViewCustomizer(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		if (semanticAdapter instanceof WrapperAdaptable) {
			return null;
		}

		if (semanticHint != null && semanticHint.length() > 0) {
			return nodeMap.get(semanticHint);
		}
		IElementType elementType = (IElementType) semanticAdapter.getAdapter(IElementType.class);
		if (elementType != null) {
			return nodeMap.get(elementType);
		} else {
			EObject eObject = getSemanticElement(semanticAdapter);
			if (eObject != null) {
				// first check specialization type matches
				for (int i = 0; i < RIMElementTypes.NODE_TYPES.length; ++i) {
					elementType = RIMElementTypes.NODE_TYPES[i];
					if (elementType instanceof ISpecializationType) {
						if (((ISpecializationType) elementType).getMatcher().matches(eObject)) {
							return nodeMap.get(elementType);
						}
					}
				}
				// next check metamodel type matches
				for (int i = 0; i < RIMElementTypes.NODE_TYPES.length; ++i) {
					elementType = RIMElementTypes.NODE_TYPES[i];
					if (elementType instanceof IMetamodelType) {
						if (eObject.eClass() == elementType.getEClass()) {
							return nodeMap.get(elementType);
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected IViewCustomizer getEdgeViewCustomizer(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		if (semanticAdapter instanceof WrapperAdaptable) {
			return null;
		}

		if (semanticHint != null && semanticHint.length() > 0) {
			return nodeMap.get(semanticHint);
		}
		IElementType elementType = (IElementType) semanticAdapter.getAdapter(IElementType.class);
		if (elementType != null) {
			return nodeMap.get(elementType);
		} else {
			EObject eObject = getSemanticElement(semanticAdapter);
			if (eObject != null) {
				// first check specialization type matches
				for (int i = 0; i < RIMElementTypes.RELATIONSHIP_TYPES.length; ++i) {
					elementType = RIMElementTypes.RELATIONSHIP_TYPES[i];
					if (elementType instanceof ISpecializationType) {
						if (((ISpecializationType) elementType).getMatcher().matches(eObject)) {
							return nodeMap.get(elementType);
						}
					}
				}
				// next check metamodel type matches
				for (int i = 0; i < RIMElementTypes.RELATIONSHIP_TYPES.length; ++i) {
					elementType = RIMElementTypes.RELATIONSHIP_TYPES[i];
					if (elementType instanceof IMetamodelType) {
						if (eObject.eClass() == elementType.getEClass()) {
							return nodeMap.get(elementType);
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected EObject getSemanticElement(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			return EMFCoreUtil.resolve(TransactionUtil.getEditingDomain(eObject), eObject);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected EObject getSemanticElement(IAdaptable semanticAdapter, TransactionalEditingDomain domain) {
		if (semanticAdapter == null) {
			return null;
		}
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			return EMFCoreUtil.resolve(domain, eObject);
		}
		return null;
	}
}
