/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - fixed NPE on cancel button (artf3367)
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.uml2.uml.Type;

/**
 * @author dcarlson
 *
 */
public class DocumentClassDialog {

	public static String CANCELLED = "CANCELLED";

	boolean workspaceMode = true;

	public boolean isWorkspaceMode() {
		return workspaceMode;
	}

	private String documentClassQName = null;

	public String getDocumentClassQName() {
		return documentClassQName;
	}

	/**
	 * Content Provider.
	 */
	private IStructuredContentProvider contentProvider = new IStructuredContentProvider() {

		private List<Object> contents;

		public void dispose() {
			// nothing to dispose
		}

		public Object[] getElements(Object inputElement) {
			if (contents != null && contents == inputElement) {
				return contents.toArray();
			}
			return new Object[0];
		}

		@SuppressWarnings("unchecked")
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			if (newInput instanceof List) {
				contents = (List<Object>) newInput;
			} else {
				contents = null;
			}
		}
	};

	private ILabelProvider labelProvider = new LabelProvider() {

		@Override
		public String getText(Object element) {
			return element.toString();
		}

	};

	public String selectDocumentClass() {

		CDAProjectUtil projectUtil = new CDAProjectUtil();
		projectUtil.loadCDAModelsfromWorkspace();
		Map<String, Type> cdaDocuments = projectUtil.getCDADocuments();
		if (cdaDocuments.keySet().isEmpty()) {
			projectUtil.loadCDAModelsfromPlugins();
			cdaDocuments = projectUtil.getCDADocuments();
			if (cdaDocuments.keySet().isEmpty()) {
				return null;
			}
			workspaceMode = false;
		}

		final List<String> qnames = new ArrayList<String>(cdaDocuments.keySet());
		Collections.sort(qnames);

		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
			public void run() {
				Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				ListDialog dialog = new ListDialog(activeShell);
				dialog.setLabelProvider(labelProvider);
				dialog.setContentProvider(contentProvider);
				dialog.setInput(qnames);
				dialog.setTitle("CDA Document Types");
				dialog.setMessage(
					"Select document type for validation or just Select OK to continue;  \nHit Cancel to Skip CDA Validation");
				dialog.open();
				Object[] results = dialog.getResult();
				if (dialog.getReturnCode() == org.eclipse.jface.window.Window.CANCEL) {
					documentClassQName = CANCELLED;
				} else if ((results != null) && (results.length > 0)) {
					documentClassQName = results[0].toString();
				}
			}
		});

		return documentClassQName;
	}
}
