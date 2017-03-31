/**
 * Copyright: NEHTA 2014
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package traceability.presentation.table;

import org.eclipse.nebula.widgets.xviewer.core.model.SortDataType;
import org.eclipse.nebula.widgets.xviewer.core.model.XViewerAlign;
import org.eclipse.nebula.widgets.xviewer.core.model.XViewerColumn;

public class TracebilityColumn extends XViewerColumn {

	private boolean alwaysShow;

//	public TracebilityColumn(String id, String name, int width, int align, boolean show, SortDataType sortDataType, boolean multiColumnEditable, String description) {
//		super(id, name, width, align, show, sortDataType, multiColumnEditable, description);
//	}

	public TracebilityColumn(Object xViewer, String xml) {
		super(xViewer, xml);
		// TODO Auto-generated constructor stub
	}

	public TracebilityColumn(String id, String name, int width, XViewerAlign align, boolean show,
			SortDataType sortDataType, boolean multiColumnEditable, String description) {
		super(id, name, width, align, show, sortDataType, multiColumnEditable, description);
		// TODO Auto-generated constructor stub
	}

	public TracebilityColumn() {
		super();
	}

	@Override
	public String getDisplayName() {
		return getName();
	}

	@Override
	public XViewerColumn copy() {
		TracebilityColumn newXCol = new TracebilityColumn();
		newXCol.alwaysShow = alwaysShow;
		copy(this, newXCol);
		return newXCol;
	}

	public void setAlwaysShow(boolean b) {
		alwaysShow = b;
	}

	public boolean isAlwaysShow() {
		return alwaysShow;
	}

	@Override
	public void setShow(boolean show) {
		super.setShow(show || alwaysShow);
	}
}
