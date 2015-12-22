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

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.nebula.widgets.xviewer.XViewer;
import org.eclipse.nebula.widgets.xviewer.XViewerSorter;

/**
 * Customized sorter in order to prevent using blank cell values due to vertical cell repetition when a column is sorted
 */
public class TraceabilitySorter extends XViewerSorter {

	boolean sorting;

	public TraceabilitySorter(XViewer treeViewer) {
		super(treeViewer);
	}

	@Override
	public int compare(Viewer viewer, Object o1, Object o2, int sortXColIndex) {
		sorting = true;
		try {
			return super.compare(viewer, o1, o2, sortXColIndex);
		} finally {
			sorting = false;
		}
	}

}
