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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerRow;
import org.eclipse.nebula.widgets.xviewer.XViewer;
import org.eclipse.nebula.widgets.xviewer.core.model.XViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;

import com.google.common.primitives.Ints;

import traceability.LogEntry;
import traceability.Trace;
import traceability.TraceabilityFactory;
import traceability.presentation.TraceUtils;
import traceability.presentation.TraceabilityEditor;
import traceability.presentation.TraceabilityEditorPlugin;
import traceability.presentation.Tracing;
import traceability.presentation.table.images.TraceabilityImageCache;

/**
 * Main viewer class of the traceability table
 */
public class TraceabilityViewer extends XViewer {

	private TreeItem hoverItem;
	Object hoverElement;
	XViewerColumn hoverCol;

	public Set<Object> initialExpanded = new HashSet<Object>();

	public Button treeButton;
	public Button allButton;
	public Button errButton;
	public Button equalButton;
	public Button unequalButton;
	public Button newButton;

	/**
	 * Rows are filtered by this search text
	 */
	public String filterText = "";
	/**
	 * Rows are searched by this search text
	 */
	public String searchText = "";

	public List<Object> searchRows = new ArrayList<Object>();

	public int searchRowsIndex = -1;

	/**
	 * Determines whether the search text is interpreted as regular string
	 */
	public boolean regex;

	public boolean searchregex;

	/**
	 * Used to determine whether the current table is the active one among all traceability tables
	 */
	private IViewerProvider activeView;
	public Button plusButton;
	public Button minusButton;
	private TraceabilityMouseListener traceabilityMouseListener;

	TraceabilityEditor traceabilityEditor;
	public Tracing tracing = new Tracing();

	public TraceabilityViewer(IViewerProvider activeView, final Composite composite, int style, TraceabilityViewerFactory fact) {
		super(composite, style, fact);

		this.activeView = activeView;
		traceabilityEditor = (TraceabilityEditor) this.activeView;

		getTree().addListener(SWT.MeasureItem, new Listener() {
			public void handleEvent(Event event) {
				event.height = 35;
			}
		});

		getTree().addMouseMoveListener(new MouseMoveListener() {

			@Override
			public void mouseMove(MouseEvent e) {
				Point point = new Point(e.x, e.y);
				TreeItem item = getItemUnderMouseClick(point);
				TreeColumn col = getColumnUnderMouseClick(point);
				if (item != null && col != null) {
					if (hoverItem != null && !hoverItem.isDisposed() && hoverElement != null && item.getData() != hoverElement) {
						hoverElement = null;
						updateItem(hoverItem, hoverItem.getData());
					}
					hoverElement = item.getData();
					hoverItem = item;
					hoverCol = (XViewerColumn) col.getData();
					Rectangle bounds = item.getTextBounds(getColumnNumberUnderMouseClick(point));
					if (getCellData(hoverCol, hoverElement) != null && bounds.contains(point) && traceabilityMouseListener.shiftBeingHeld(e))
						composite.getShell().setCursor(new Cursor(composite.getDisplay(), SWT.CURSOR_HAND));
					else
						composite.getShell().setCursor(new Cursor(composite.getDisplay(), SWT.CURSOR_ARROW));

					updateItem(hoverItem, hoverItem.getData());
				}
			}
		});
		getTree().addMouseTrackListener(new MouseTrackListener() {

			@Override
			public void mouseHover(MouseEvent e) {
			}

			@Override
			public void mouseExit(MouseEvent e) {
				if (hoverItem != null && !hoverItem.isDisposed() && hoverElement != null) {
					hoverElement = null;
					updateItem(hoverItem, hoverItem.getData());
					hoverItem = null;
					composite.getShell().setCursor(new Cursor(composite.getDisplay(), SWT.CURSOR_ARROW));
				}
			}

			@Override
			public void mouseEnter(MouseEvent e) {
			}
		});

		TraceabilityToolTipSupport.enableFor(this);
	}

	public Object getPreviousElement(Object element) {
		TreeItem item = (TreeItem) this.findItem(element);
		if (item == null)
			return null;
		ViewerRow above = getViewerRowFromItem(item).getNeighbor(ViewerRow.ABOVE, false);
		if (above != null /* && item.getParentItem() != above.getItem() */)
			return above.getItem().getData();
		return null;
	}

	public boolean handleLeftShiftClick(TreeColumn treeColumn, TreeItem treeItem) {
		if (treeItem.getData() instanceof Object) {
			Object element = getRedirectedElement(treeItem.getData());
			TraceabilityViewerLabelProvider viewer = (TraceabilityViewerLabelProvider) this.getLabelProvider();
			XViewerColumn xCol = (XViewerColumn) treeColumn.getData();
			try {
				viewer.getColumnText(element, xCol, -1);
			} catch (Exception e) {
				e.printStackTrace();
			}

			Object toOpen = getCellData(xCol, element);
			if (toOpen instanceof LogEntry) {
				LogEntry logEntry = (LogEntry) toOpen;
				for (EObject eObject : logEntry.getParticipants()) {
					toOpen = eObject;
				}
			}

			traceabilityEditor.openElement(element, xCol, toOpen);

		}
		return false;
	}

	<T> T findType(Class<T> cls, Object element) {
		return tracing.findType(cls, getRedirectedElement(element));
	}

	public boolean isHovered(Object element, XViewerColumn xCol) {
		return hoverElement == element && xCol.equals(hoverCol);
	}

	@Override
	protected void internalInitializeTree(Control widget) {
		super.internalInitializeTree(widget);
		// setExpandedElements(initialExpanded.toArray());
	}

	/**
	 * Returns the linked target behind a table cell
	 * 
	 * @param viewerColumn
	 * @param element
	 * @return
	 */
	public Object getCellData(XViewerColumn viewerColumn, Object element) {

		element = getRedirectedElement(element);
		viewerColumn = traceabilityEditor.getRedirectedColumn(element, viewerColumn);

		return traceabilityEditor.getCellData(viewerColumn, element);
	}

	/**
	 * Unwraps a GroupItem to get the actual domain element
	 * 
	 * @param element
	 * @return
	 */
	public static Object getRedirectedElement(Object element) {
		if (element instanceof GroupItem) {
			GroupItem groupItem = (GroupItem) element;
			element = groupItem.element;
		}
		return element;
	}

	/**
	 * Removes some not wanted or erroneous xviewer actions
	 */
	public void updateMenuActionsForHeader() {
		for (IContributionItem item : this.getMenuManager().getItems()) {
			if (item instanceof ActionContributionItem) {
				ActionContributionItem actionContributionItem = (ActionContributionItem) item;
				String text = actionContributionItem.getAction().getText();
				if ("Unique Values".equals(text) || "View Selected Cell Data".equals(text) || "Add Computed Column".equals(text) || "Sum Selected for Column".equals(text) || "Filter By Column".equals(text) || "Filter by Value".equals(text) || "Clear All Filters".equals(text)) {
					this.getMenuManager().remove(item);
				}
				if (text.startsWith("Copy Selected Column") && !text.startsWith("Copy Selected Column of Selected Rows")) {
					actionContributionItem.getAction().setText(text.replace("Copy Selected Column", "Copy Selected Column of Selected Rows"));
				}
			}
		}
		this.getMenuManager().add(new Action("Expand All") {
			@Override
			public void run() {
				expandAll();
			}
		});
		this.getMenuManager().add(new Action("Collapse All") {
			@Override
			public void run() {
				collapseAll();
			}
		});

	}

	@Override
	public void updateMenuActionsForTable() {
		updateMenuActionsForHeader();
		TreeColumn treeCol = getRightClickSelectedColumn();
		final XViewerColumn xCol = (XViewerColumn) treeCol.getData();
		final TreeItem treeItem = getRightClickSelectedItem();
		if (treeItem == null || !tracing.diffOfElement.isEmpty())
			return;
		final Object element = getRedirectedElement(treeItem.getData());
		final EObject eObject = traceabilityEditor.getColumnSpecificElement(xCol, element);
		final Trace trace = tracing.getAnyTrace(eObject);
		final EObject fnarrowDown = traceabilityEditor.getNarrowDown(xCol, element);
		final TraceabilityEditor ed = (TraceabilityEditor) activeView;

		Action action = traceabilityEditor.manageComment(xCol, eObject, trace, fnarrowDown);
		if (action != null) {
			this.getMenuManager().add(action);
		}

		if (traceabilityEditor.getCols().contains(xCol)) {

			TraceabilityViewerLabelProvider viewer = (TraceabilityViewerLabelProvider) this.getLabelProvider();
			final String label = viewer.getColumnText(element, xCol, -1);
			final Object cellData = getCellData(xCol, element);

			if (label != null && label.length() > 1 && cellData instanceof EObject) {
				this.getMenuManager().add(new Action("Select \"" + TraceUtils.withoutTags(label) + "\" for tracing") {

					@Override
					public void run() {
						ed.newTraceSource = (EObject) cellData;
						ed.newTraceSourceLabel = label;
						ed.newTraceSourceColumn = xCol;
					}

				});
			}
			if (ed.newTraceSource != null && label != null && label.length() > 1 && cellData instanceof EObject && cellData != ed.newTraceSource && ed.newTraceSourceColumn != xCol) {
				this.getMenuManager().add(new Action("Create trace between \"" + ed.newTraceSourceLabel + "\" and \"" + label + "\"") {

					@Override
					public void run() {
						Trace tc = TraceabilityFactory.eINSTANCE.createTrace();
						tc.setDescription("Hand-crafted trace");
						ed.newTraceSource.eResource().getResourceSet().getResources().get(0).getContents().add(tc);
						if (traceabilityEditor.getCols().indexOf(xCol) > traceabilityEditor.getCols().indexOf(ed.newTraceSourceColumn)) {
							tc.getSource().add(ed.newTraceSource);
							tc.getTarget().add((EObject) cellData);
						} else {
							tc.getSource().add((EObject) cellData);
							tc.getTarget().add(ed.newTraceSource);
						}
						try {
							tc.eResource().save(null);
						} catch (IOException e) {
							e.printStackTrace();
						}
						((TraceabilityEditor) activeView).updateTables();
					}

				});
			}
		}

	}

	/**
	 * Resets the whole table normally due to changed filtering conditions
	 */
	public void updateRows() {
		long started = new Date().getTime();
		if (this.unequalButton != null) {
			this.unequalButton.setSelection(traceabilityEditor.traceabilityFilters_NEQ);
			this.equalButton.setSelection(traceabilityEditor.traceabilityFilters_EQ);
			this.minusButton.setSelection(traceabilityEditor.traceabilityFilters_MINUS);
			this.plusButton.setSelection(traceabilityEditor.traceabilityFilters_PLUS);
		}
		this.errButton.setSelection(traceabilityEditor.traceabilityFilters_ERR);
		this.allButton.setSelection(traceabilityEditor.traceabilityFilters_ALL);
		this.treeButton.setSelection(traceabilityEditor.traceabilityFilters_TREE);
		TraceabilityViewerContentProvider traceabilityViewerContentProvider = (TraceabilityViewerContentProvider) this.getContentProvider();
		traceabilityViewerContentProvider.parents = null;
		traceabilityViewerContentProvider.parentOf.clear();
		traceabilityViewerContentProvider.groupOf.clear();
		traceabilityViewerContentProvider.allElements.clear();
		if (activeView.getViewer() != this)
			this.setInput(null);
		this.refresh();
		long ended = new Date().getTime();
		if (this.getInput() != null)
			System.out.println("refresh took " + (ended - started));

	}

	/**
	 * Sets text filter conditions
	 * 
	 * @param filterText
	 * @param regex
	 */
	public void setFilterText(String filterText, boolean regex) {
		this.filterText = filterText;
		this.regex = regex;
		updateRows();
	}

	/**
	 * Sets text search conditions
	 * 
	 * @param filterText
	 * @param regex
	 */
	public void setSearchText(String filterText, boolean regex) {
		this.searchText = filterText;
		this.searchregex = regex;
		this.searchRowsIndex = -1;
		this.update(searchRows.toArray(), null);
		searchRows.clear();
		for (Object element : ((TraceabilityViewerContentProvider) getContentProvider()).allElements) {
			for (XViewerColumn xCol : getCustomizeMgr().getCurrentTableColumns()) {
				if (xCol.isShow()) {
					String text = ((TraceabilityViewerLabelProvider) getLabelProvider()).getColumnText(element, xCol, -1);
					if (findText(text, searchText, searchregex) != null) {
						searchRows.add(element);
						break;
					}
				}
			}
		}
		this.update(searchRows.toArray(), null);
		this.getTree().redraw();
	}

	@Override
	public void refresh() {
		for (TreeColumn col : this.getTree().getColumns()) {
			XViewerColumn xcol = (XViewerColumn) col.getData();
			if (this.getCustomizeMgr().getSortXCols().contains(xcol)) {
				String base = "platform:/plugin/" + TraceabilityEditorPlugin.getPlugin().getBundle().getSymbolicName() + "/icons/";
				col.setImage(TraceabilityImageCache.getImage(base + (xcol.isSortForward() ? "sort-descending-icon.png" : "sort-ascending-icon.png")));
			} else
				col.setImage(null);
		}
		super.refresh();
	}

	/**
	 * 
	 * @param eObject4
	 * @return the representative element of the row in which the given element occurs
	 */
	public Object getRepresentativeElement(EObject eObject4) {
		TraceabilityViewerContentProvider cp = (TraceabilityViewerContentProvider) this.getContentProvider();
		EObject eObject = eObject4;
		while (eObject != null) {
			if (tracing.errorsRev.containsKey(eObject)) {
				eObject = tracing.errorsRev.get(eObject);
			}
			if (cp.groupOf.containsKey(eObject)) {
				return cp.groupOf.get(eObject);
			}
			if (cp.parents.contains(eObject) || cp.parentOf.containsKey(eObject)) {
				return eObject;
			}
			// System.out.println(((TraceabilityViewerLabelProvider) getLabelProvider()).getColumnTextOriginal(eObject, FanOut_Col, 0));
			eObject = tracing.backward.get(eObject);
		}
		eObject = eObject4;
		return eObject4;
	}

	public void setSelection(ISelection selection, boolean reveal) {
		if (selection instanceof StructuredSelection) {
			StructuredSelection structuredSelection = (StructuredSelection) selection;
			List<Object> newList = new ArrayList<Object>();
			for (Object object : structuredSelection.toList()) {
				if (object instanceof EObject) {
					EObject eObject = (EObject) object;
					newList.add(getRepresentativeElement(eObject));
				} else {
					newList.add(object);
				}
			}
			selection = new StructuredSelection(newList);
		}
		super.setSelection(selection, reveal);
	}

	@Override
	public void updateStatusLabel() {
		if (this.getCustomizeMgr().isLoading()) {
			// situation: after addColumns() is called
			int index = 0;
			for (TreeColumn col : this.getTree().getColumns()) {
				TracebilityColumn tcol = (TracebilityColumn) col.getData();
				if (tcol.isAlwaysShow()) {
					col.setMoveable(false);
					final Integer iIndex = index;
					Listener listener = new Listener() {
						@Override
						public void handleEvent(Event e) {
							// assure column appears first
							List<Integer> order = new ArrayList<Integer>(Ints.asList(getTree().getColumnOrder()));
							order.remove(iIndex);
							order.add(0, iIndex);
							getTree().setColumnOrder(Ints.toArray(order));
						}
					};
					col.addListener(SWT.Move, listener);
					// assure column appears first
					listener.handleEvent(null);
				}
				index++;
			}
		}
		super.updateStatusLabel();
	}

	@Override
	protected void createSupportWidgets(Composite parent) {
		super.createSupportWidgets(parent);
		traceabilityMouseListener = new TraceabilityMouseListener(this);
		getTree().addMouseListener(traceabilityMouseListener);
	}

	public TreeColumn getClickedColumn() {
		MouseEvent event = traceabilityMouseListener.getLeftClickEvent();
		TreeColumn column = getColumnUnderMouseClick(new Point(event.x, event.y));
		return column;
	}

	static public Point findText(String s, String searchText, boolean searchregex) {
		Point found = null;
		if (searchregex) {
			Pattern regex = null;
			try {
				regex = Pattern.compile(searchText, Pattern.CASE_INSENSITIVE);
				Matcher m = regex.matcher(s);
				if (m.find()) {
					found = new Point(m.start(), m.end());
				}
			} catch (PatternSyntaxException e) {
				// don't find matches
			}
		} else if (!searchText.trim().equals("")) {
			int start = s.indexOf(searchText);
			if (start != -1) {
				found = new Point(start, start + searchText.length());
			}
		}
		return found;
	}

	private static String firstUpper(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}

}
