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

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProvider;
import org.eclipse.nebula.widgets.xviewer.core.model.SortDataType;
import org.eclipse.nebula.widgets.xviewer.core.model.XViewerAlign;
import org.eclipse.nebula.widgets.xviewer.core.model.XViewerColumn;
import org.eclipse.swt.SWT;

import traceability.LogEntry;
import traceability.Traces;
import traceability.presentation.table.TraceabilityViewer;
import traceability.presentation.table.TracebilityColumn;

/**
 * Builds up columns for the traceability matrix in a reflective way, without knowledge of the traced domains
 */
public class ReflectiveTraceabilityEditor extends TraceabilityEditor {

	private static final String COLUMN_NAMESPACE = "trace";

	protected static XViewerColumn FanOut_Col = new TracebilityColumn(COLUMN_NAMESPACE + ".fanout", "Fan-Out Element", 350, XViewerAlign.Left, true, SortDataType.String, false, null);
	protected static XViewerColumn Error_Col = new TracebilityColumn(COLUMN_NAMESPACE + ".error", "Error", 400, XViewerAlign.Left, true, SortDataType.String, false, null);
	protected static XViewerColumn ErrorCode_Col = new TracebilityColumn(COLUMN_NAMESPACE + ".errorcode", "Code", 40, XViewerAlign.Left, true, SortDataType.Integer, false, null);

	protected List<XViewerColumn> dynamicColumns = new ArrayList<XViewerColumn>();

	protected Map<XViewerColumn, EObject> modelOfColumn = new HashMap<XViewerColumn, EObject>();

	@Override
	protected void createViews() {
		List<XViewerColumn> overviewColumns = new ArrayList<XViewerColumn>(getAllColumns());
		overviewColumns.remove(FanOut_Col);
		createView("Overview", -1, "OverviewTable", overviewColumns.toArray(new XViewerColumn[] {}));
		for (XViewerColumn col : dynamicColumns) {
			List<XViewerColumn> cols = new ArrayList<XViewerColumn>(getAllColumns());
			cols.remove(col);
			cols.remove(FanOut_Col);
			cols.add(0, col);
			createView(col.getDisplayName() + " Tree", 3, null, cols.toArray(new XViewerColumn[] {}));
		}
		createView("Fan-Out", 3, "FanOutViewTable", getAllColumns().toArray(new XViewerColumn[] {}));
	}

	@Override
	public String getNamespace() {
		return COLUMN_NAMESPACE;
	}

	@Override
	protected void organizeTreeForColumn(XViewerColumn column, List<Object> parents) {
		if (column == FanOut_Col)
			GroupOrganizer.organizeTreeByFanOut(parents, tracing);
		else
			GroupOrganizer.organizeTreeByContainment(parents, tracing, modelOfColumn.get(column));
	}

	@Override
	protected List<XViewerColumn> getAllColumns() {
		if (dynamicColumns.isEmpty()) {
			getOrCreateTracing();
			Set<EObject> handledModels = new HashSet<EObject>();
			for (EObject model : tracing.sourceModels) {
				while (model != null && handledModels.add(model)) {
					createDynamicColumn(model);
					int index = tracing.sourceModels.indexOf(model);
					if (index != -1)
						model = tracing.targetModels.get(index);
				}
			}
			for (EObject model : tracing.targetModels) {
				if (model != null && handledModels.add(model)) {
					createDynamicColumn(model);
				}
			}
		}
		List<XViewerColumn> result = new ArrayList<XViewerColumn>(dynamicColumns);
		result.add(0, FanOut_Col);
		result.add(Error_Col);
		result.add(ErrorCode_Col);
		return result;
	}

	@Override
	public XViewerColumn getRedirectedColumn(Object element, XViewerColumn xCol) {
		if (xCol.equals(FanOut_Col)) {
			EObject model = tracing.modelOfElement.get(element);
			for (XViewerColumn col : getAllColumns()) {
				if (model == modelOfColumn.get(col))
					return col;
			}
		}
		return xCol;
	}

	@Override
	public List<XViewerColumn> excludedColsFromDiffing() {
		return Arrays.asList(FanOut_Col);
	}

	public List<XViewerColumn> alwaysPrintColumns() {
		return Arrays.asList(Error_Col, ErrorCode_Col);
	}

	@Override
	public String getLabel(Object element, XViewerColumn xCol, int columnIndex) {
		if (xCol.equals(Error_Col)) {
			LogEntry error = tracing.getError(element);
			if (error != null)
				return error.getMessage() + (tracing.getErrors(element).size() >= 2 ? "..." : "");
		}
		if (xCol.equals(ErrorCode_Col)) {
			LogEntry error = tracing.getError(element);
			if (error != null)
				return "" + error.getMessageType();
		}
		Object cellData = getCellData(xCol, element);
		if (cellData instanceof EObject) {
			EObject eObject = (EObject) cellData;
			Adapter provider = adapterFactory.adapt(eObject, IItemLabelProvider.class);
			if (provider instanceof IItemLabelProvider) {
				IItemLabelProvider iItemLabelProvider = (IItemLabelProvider) provider;
				return iItemLabelProvider.getText(eObject);
			}
		}
		return null;
	}

	@Override
	public String adjustStyledText(XViewerColumn col, Object element, String text) {
		Object cellData = getCellData(col, element);
		if (cellData instanceof EObject && ((EObject) cellData).eIsProxy())
			return text;
		return text.replace("<", "&lt;").replace(">", "&gt;");
	}

	@Override
	public Object getCellData(XViewerColumn viewerColumn, Object element) {
		element = TraceabilityViewer.getRedirectedElement(element);
		if (viewerColumn.equals(Error_Col)) {
			return tracing.getError(element);
		}
		EObject model = modelOfColumn.get(viewerColumn);
		if (model != null && element instanceof EObject) {
			EObject eObject = (EObject) element;
			return tracing.findModel(model, eObject);
		}
		return null;
	}

	private void createDynamicColumn(EObject model) {
		String name = new ReflectiveItemProvider(null).getText(model);
		if (name == null) {
			name = model.toString();
		}
		TracebilityColumn col = new TracebilityColumn(getNamespace() + "." + name, name, 200, XViewerAlign.Left, true, SortDataType.String, false, null);
		dynamicColumns.add(col);
		modelOfColumn.put(col, model);
	}

	public String getName(Object namedObject) {
		try {
			Method m = namedObject.getClass().getMethod("getName");
			return (String) m.invoke(namedObject);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	protected Tracing createTracing() {
		Tracing result = super.createTracing();
		for (LogEntry logEntry : result.errorsRev.keySet()) {
			Traces traces = result.getTraceContainer(logEntry);
			for (EObject eObject : logEntry.getParticipants()) {
				result.goForward(null, null, result.rows, eObject, null);
				if (traces != null)
					result.modelOfElement.put(eObject, traces.getSourceModel());
			}
		}
		return result;
	}

	@Override
	public boolean isErrorCol(XViewerColumn xCol) {
		return xCol.equals(Error_Col);
	}
}
