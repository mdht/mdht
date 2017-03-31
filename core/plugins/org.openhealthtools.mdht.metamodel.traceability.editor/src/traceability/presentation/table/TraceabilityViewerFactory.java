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
import java.util.List;

import org.eclipse.nebula.widgets.xviewer.IXViewerFactory;
import org.eclipse.nebula.widgets.xviewer.XViewer;
import org.eclipse.nebula.widgets.xviewer.XViewerFactory;
import org.eclipse.nebula.widgets.xviewer.XViewerSorter;
import org.eclipse.nebula.widgets.xviewer.core.model.XViewerColumn;
import org.eclipse.nebula.widgets.xviewer.customize.XViewerCustomMenu;

/**
 * Mainly defines the diverse traceability columns
 */
public class TraceabilityViewerFactory extends XViewerFactory implements IXViewerFactory {

	public TraceabilityViewerFactory(String namespace, boolean firstIsFixed, List<XViewerColumn> allColumns, XViewerColumn... columns) {
		super(namespace);
		List<XViewerColumn> result = new ArrayList<XViewerColumn>();
		for (XViewerColumn col : columns) {
			if (!allColumns.contains(col))
				continue;
			col.setShow(true);
			result.add(col.copy());
		}

		for (XViewerColumn col : allColumns) {
			if (!result.contains(col)) {
				col.setShow(false);
				result.add(col.copy());
			}
		}
		if (firstIsFixed) {
			((TracebilityColumn) result.get(0)).setAlwaysShow(true);
		}
		registerColumns(result.toArray(new XViewerColumn[] {}));
	}

	@Override
	public boolean isAdmin() {
		return false;
	}

	@Override
	public XViewerSorter createNewXSorter(XViewer xViewer) {
		return new TraceabilitySorter(xViewer);
	}

	@Override
	public boolean isSearchUiAvailable() {
		return false;
	}

	@Override
	public boolean isFilterUiAvailable() {
		return false;
	}

	@Override
	public boolean isLoadedStatusLabelAvailable() {
		return false;
	}

	@Override
	public XViewerCustomMenu getXViewerCustomMenu() {
		return new XViewerCustomMenu() {
			@Override
			protected void handleHideColumn() {
				super.handleHideColumn();
				((TraceabilityViewer) xViewer).updateRows();
			}

			@Override
			protected void handleShowColumn() {
				super.handleShowColumn();
				((TraceabilityViewer) xViewer).updateRows();
			}
		};
	}

}
