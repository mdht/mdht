/*******************************************************************************
 * Copyright (c) 2011 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ui.util;

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
				dialog.setMessage("Select document type for validation, or CANCEL to discover from template ID");

				dialog.open();
				Object[] results = dialog.getResult();
				if (results.length > 0) {
					documentClassQName = results[0].toString();
				}
			}
		});

		return documentClassQName;
	}
}
