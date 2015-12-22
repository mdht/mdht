/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package traceability.presentation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import traceability.presentation.table.GroupItem;

/**
 * Provides methods to organize/sort the tree structure by general criteria; as of now, only a fan-out structuring is offered here
 */
public class GroupOrganizer {

	public static void organizeTreeByFanOut(List<Object> parents, Tracing tracing) {
		Map<Object, GroupItem> existingGroups = new HashMap<Object, GroupItem>();
		List<Object> elements = new ArrayList<Object>(parents);
		parents.clear();
		GroupItem rootGroup = null;
		for (Object element : elements) {
			EObject eObject = (EObject) element;
			rootGroup = TraceUtils.lookupOrCreate(eObject, existingGroups);
			EObject parent = tracing.backward.get(eObject);
			while (parent != null) {
				if (parent instanceof EObject) {
					GroupItem parentGroup = TraceUtils.lookupOrCreate(parent, existingGroups);
					parentGroup.addChild(rootGroup);
					rootGroup = parentGroup;
				}
				parent = tracing.backward.get(parent);
			}
			if (!parents.contains(rootGroup))
				parents.add(rootGroup);
		}
		sortByFanOut(parents);
	}

	public static void sortByFanOut(final List<Object> list) {
		for (Object object : list) {
			if (object instanceof GroupItem) {
				GroupItem groupItem = (GroupItem) object;
				sortByFanOut(groupItem.childrenOf);
				if (groupItem.childrenOf.size() == 1) {
					Object child = groupItem.childrenOf.get(0);
					groupItem.childrenOf.clear();
					if (child instanceof GroupItem)
						groupItem.childrenOf.addAll(((GroupItem) child).childrenOf);
				}
			}
		}
	}

	/**
	 * Builds a tree organized by the containment hierarchy
	 * 
	 * @param parents
	 */
	public static void organizeTreeByContainment(List<Object> parents, Tracing tracing, EObject model) {
		Map<Object, GroupItem> existingGroups = new HashMap<Object, GroupItem>();
		List<Object> elements = new ArrayList<Object>(parents);
		List<Object> freeElements = new ArrayList<Object>();
		parents.clear();
		GroupItem rootGroup = null;
		for (Object element : elements) {
			EObject eObject = (EObject) element;
			EObject dataComponent = tracing.findModel(model, eObject);
			if (dataComponent == null) {
				freeElements.add(eObject);
				continue;
			}
			rootGroup = TraceUtils.lookupOrCreate(dataComponent, existingGroups);
			rootGroup.addChild(eObject);
			EObject parent = dataComponent.eContainer();
			while (parent != null && tracing.findModel(model, parent) != null) {
				EObject dataComponent2 = parent;
				GroupItem parentGroup = TraceUtils.lookupOrCreate(dataComponent2, existingGroups);
				parents.remove(rootGroup);
				parentGroup.addChild(rootGroup);
				rootGroup = parentGroup;
				parent = parent.eContainer();
			}
			if (!parents.contains(rootGroup))
				parents.add(rootGroup);
		}
		parents.addAll(freeElements);
		for (Object object : parents)
			sortByContainment(object, tracing);
	}

	public static void sortByContainment(Object object, final Tracing tracing) {
		if (!(object instanceof GroupItem))
			return;
		final GroupItem groupItem = (GroupItem) object;
		removeRedundancy(groupItem);
		for (Object child : groupItem.childrenOf) {
			sortByContainment(child, tracing);
		}

	}

	public static void removeRedundancy(GroupItem groupItem) {
		for (Object child : new ArrayList<Object>(groupItem.childrenOf)) {
			if (!(child instanceof GroupItem)) {
				groupItem.element = (EObject) child;
				groupItem.childrenOf.remove(groupItem.element);
				break;
			}
		}
	}
}
