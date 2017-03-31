/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package traceability.presentation.table;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.nebula.widgets.xviewer.core.model.XViewerColumn;

import traceability.presentation.TraceabilityEditor;
import traceability.presentation.Tracing;

public class TraceabilityViewerContentProvider implements ITreeContentProvider {

	/**
	 * The inverse of <code>childrenOf</code>
	 */
	Map<Object, Object> parentOf = new HashMap<Object, Object>();

	List<Object> allElements = new ArrayList<Object>();

	/**
	 * The inverse of <code>GroupItem.element</code>
	 */
	Map<Object, GroupItem> groupOf = new HashMap<Object, GroupItem>();

	/**
	 * Root elements of a table; the representative elements are those root elements plus all tree children and children's children and so on
	 */
	protected List<Object> parents;

	private TraceabilityViewer myXviewer;

	public TraceabilityViewerContentProvider(TraceabilityViewer myXviewer) {
		super();
		this.myXviewer = myXviewer;
	}

	@Override
	public void dispose() {
		// nothing to do
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// nothing to do
	}

	/**
	 * Computes (if not already done so) the structures of the table
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		if (parents != null)
			return parents.toArray();
		parents = new ArrayList<Object>();
		if (!(inputElement instanceof Tracing)) {
			return parents.toArray();
		}
		myXviewer.tracing = (Tracing) inputElement;
		parents.addAll(myXviewer.tracing.rows);
		Set<EObject> tableTraced = getTableTraced();
		int originalSize = parents.size();
		long started = new Date().getTime();
		filterRows();
		long ended = new Date().getTime();
		Set<EObject> filteredTableTraced = getTableTraced();
		System.out.println("filter took " + (ended - started));
		int filteredSize = parents.size();
		organizeTree();
		if (!myXviewer.traceabilityEditor.traceabilityFilters_TREE) {
			parents = flattenTree(parents);
		}
		Set<EObject> treeTableTraced = getTableTraced();
		int treeSize = parents.size();
		int childrenNumber = getChildrenCount(parents);
		int treeParents = getTreeParentsCount(parents);
		for (EObject eObject : myXviewer.tracing.traced) {
			if (!tableTraced.contains(eObject))
				System.err.println("Not traced:" + eObject);
		}
		System.out.println("traced=" + myXviewer.tracing.traced.size() + " original=" + originalSize + "/" + tableTraced.size() + " filtered=" + filteredSize + "/" + filteredTableTraced.size() + " tree=" + (treeSize + childrenNumber) + "/" + treeTableTraced.size() + " treeparents=" + treeParents);
		populateLookupMaps(parents);
		return parents.toArray();
	}

	private int getTreeParentsCount(List<Object> objects) {
		int result = 0;
		for (Object object : objects) {
			if (object instanceof GroupItem) {
				GroupItem groupItem = (GroupItem) object;
				if (groupItem.childrenOf.size() != 0)
					result++;
				result += getTreeParentsCount(groupItem.childrenOf);
			}
		}
		return result;
	}

	private int getChildrenCount(List<Object> objects) {
		int result = 0;
		for (Object object : objects) {
			if (object instanceof GroupItem) {
				GroupItem groupItem = (GroupItem) object;
				result += groupItem.childrenOf.size();
				result += getChildrenCount(groupItem.childrenOf);
			}
		}
		return result;
	}

	private List<Object> flattenTree(List<Object> parents) {
		List<Object> result = new ArrayList<Object>();
		for (Object parent : parents) {
			result.add(parent);
			if (parent instanceof GroupItem) {
				GroupItem groupItem = (GroupItem) parent;
				result.addAll(flattenTree(groupItem.childrenOf));
				groupItem.childrenOf.clear();
			}
		}
		return result;
	}

	/**
	 * @return all model elements to which traces exist in the table
	 */
	private Set<EObject> getTableTraced() {
		Set<EObject> tableTraced = new HashSet<EObject>();
		for (Object parent : parents) {
			if (!(TraceabilityViewer.getRedirectedElement(parent) instanceof EObject))
				continue;
			EObject eObject = (EObject) TraceabilityViewer.getRedirectedElement(parent);
			while (eObject != null) {
				tableTraced.add(eObject);
				eObject = myXviewer.tracing.backward.get(eObject);
			}
			eObject = (EObject) TraceabilityViewer.getRedirectedElement(parent);
			while (eObject != null) {
				tableTraced.add(eObject);
				eObject = myXviewer.tracing.forward.get(eObject);
			}
		}
		return tableTraced;
	}

	/**
	 * Filter rows by multiple filter aspects
	 */
	private void filterRows() {
		Set<List<Object>> allRows = new HashSet<List<Object>>();
		List<Object> result = new ArrayList<Object>();
		for (Object element : parents) {

			// if none diffing checkbox is selected, discard the row already here for speed
			if (!myXviewer.tracing.diffOfElement.isEmpty() && !myXviewer.traceabilityEditor.traceabilityFilters_NEQ && !myXviewer.traceabilityEditor.traceabilityFilters_EQ && !myXviewer.traceabilityEditor.traceabilityFilters_PLUS && !myXviewer.traceabilityEditor.traceabilityFilters_MINUS)
				continue;

			boolean hasUnequal = false;
			boolean hasEqual = false;
			boolean hasPlus = false;
			boolean hasMinus = false;
			boolean hasError = false;
			boolean matchText = false;
			List<Object> rowData = new ArrayList<Object>();
			for (XViewerColumn xCol : myXviewer.getCustomizeMgr().getCurrentTableColumns()) {
				if (xCol.isShow() || !myXviewer.traceabilityEditor.excludedColsFromDiffing().contains(xCol)) {
					Object cellData = myXviewer.getCellData(myXviewer.traceabilityEditor.getColForDiffing(xCol), element);
					if (xCol.isShow()) {
						rowData.add(cellData);
					}
					hasError |= cellData != null && myXviewer.traceabilityEditor.isErrorCol(xCol);

					if (xCol.isShow()) {
						List<TableCellDifference> cellDiffs = ((TraceabilityViewerLabelProvider) myXviewer.getLabelProvider()).getTableCellDifferences(element, xCol);
						if (cellDiffs == null || cellDiffs.size() == 0) {
							// hide
						} else if (cellDiffs.size() >= 2 && TraceabilityViewerLabelProvider.getValueSet(cellDiffs).size() == 1) {
							hasEqual = true;
						} else {
							String diff = cellDiffs.get(0).getDiffText();
							if ("+".equals(diff) && !"?".equals(cellDiffs.get(0).getCellText()))
								hasPlus = true;
							if ("-".equals(diff) && !"?".equals(cellDiffs.get(0).getCellText()))
								hasMinus = true;
							if (TraceabilityEditor.DIFF_UNEQUAL.equals(diff))
								hasUnequal = true;
						}
					}
					String text = ((TraceabilityViewerLabelProvider) myXviewer.getLabelProvider()).getColumnTextOriginal(element, xCol, -1);
					matchText |= TraceabilityViewer.findText(text, myXviewer.filterText, myXviewer.regex) != null;
				}
			}
			// hide rows which are not red, green, or yellow (,or unchanged), if desired
			if (!myXviewer.tracing.diffOfElement.isEmpty()
					&& !(hasUnequal && myXviewer.traceabilityEditor.traceabilityFilters_NEQ || hasEqual && myXviewer.traceabilityEditor.traceabilityFilters_EQ || hasPlus && myXviewer.traceabilityEditor.traceabilityFilters_PLUS || hasMinus && myXviewer.traceabilityEditor.traceabilityFilters_MINUS))
				continue;
			// hide rows which do not match the filter text
			if (!"".equals(myXviewer.filterText) && !matchText)
				continue;
			// show only rows with errors if desired
			if (myXviewer.traceabilityEditor.traceabilityFilters_ERR && !hasError)
				continue;
			// remove duplicate rows
			if (!allRows.add(rowData))
				continue;
			result.add(element);
		}
		parents = result;
	}

	/**
	 * Clients can overwrite to customize tree
	 */
	protected void organizeTree() {
		// flat list by default
	}

	private void populateLookupMaps(final List<Object> list) {
		allElements.addAll(list);
		for (Object object : list) {
			if (object instanceof GroupItem) {
				GroupItem groupItem = (GroupItem) object;
				groupOf.put(groupItem.element, groupItem);

				for (Object child : groupItem.childrenOf) {
					parentOf.put(child, object);
				}
				populateLookupMaps(groupItem.childrenOf);
			}

		}
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof Resource) {
			return getElements(parentElement);
		}
		if (parentElement instanceof GroupItem)
			return ((GroupItem) parentElement).childrenOf.toArray();
		return new Object[] {};
	}

	@Override
	public Object getParent(Object element) {
		return parentOf.get(element);
	}

	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}

}
