/*******************************************************************************
 * Copyright (c) 2010, 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir - Initial implementation
 *
 * $Id$
 *******************************************************************************/

package org.eclipse.mdht.uml.ui.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Generalization;

/**
 *
 * UMLOutlinePage provides an outline view of the template hierarchy as part of
 * the MDHT UML Table editor
 *
 * @author Sean Muir.
 *
 */
public class UMLOutlinePage extends ContentOutlinePage {

	Class currentClassFocus = null;

	@Override
	public void selectionChanged(SelectionChangedEvent event) {

		if (treeViewerWithColumns.getSelection() instanceof TreeSelection) {

			TreeSelection currentTreeSelection = (TreeSelection) treeViewerWithColumns.getSelection();

			if (currentTreeSelection.getFirstElement() instanceof Class) {
				Class clazz = (Class) currentTreeSelection.getFirstElement();

				// TODO We are getting to identical selection change events so
				// only process the first
				if (!clazz.equals(currentClassFocus)) {

					currentClassFocus = clazz;

					// Set Top level Content of tree view
					contentOutlineViewer.setInput(currentClassFocus);

					// Expands the hierarchy
					contentOutlineViewer.expandAll();
				}

			}

		}

	}

	/**
	 * UMLContentLabelProvider provides simple label support for tree view using
	 * qualified name of generalization classifier.
	 *
	 */
	private class UMLContentLabelProvider implements ILabelProvider {

		public Image getImage(Object element) {

			return null;
		}

		public String getText(Object element) {

			String text = "";

			if (element instanceof Generalization) {

				Generalization generalization = (Generalization) element;

				text = generalization.getGeneral().getQualifiedName();

			}
			return text;
		}

		public void addListener(ILabelProviderListener listener) {

		}

		public void dispose() {

		}

		public boolean isLabelProperty(Object element, String property) {
			return false;
		}

		public void removeListener(ILabelProviderListener listener) {

		}

	}

	/**
	 * UMLContentProvider populates tree view with class hierarchy
	 *
	 */
	private class UMLContentProvider implements ITreeContentProvider {

		final List<Object> NONE = new ArrayList<Object>();

		private Object[] children = null;

		public void dispose() {

		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		public Object[] getChildren(Object parentElement) {

			if (parentElement instanceof Class) {
				// If Class - top selection and return generalizations
				Class clazz = (Class) parentElement;
				children = clazz.getGeneralizations().toArray();
			} else if (parentElement instanceof Generalization) {
				// If generalization - this is expanding the hierarchy for the to level template
				Generalization generalization = (Generalization) parentElement;
				children = generalization.getGeneral().getGeneralizations().toArray();
			} else {
				children = NONE.toArray();
			}

			return children;
		}

		public Object[] getElements(Object element) {
			return getChildren(element);
		}

		public Object getParent(Object element) {
			return null;
		}

		public boolean hasChildren(Object element) {
			return getChildren(element).length > 0;
		}

	}

	// Reference into MDHT UML Table editor Tree View
	TreeViewer treeViewerWithColumns = null;

	// Reference of table view from ContentOutlinePage
	TreeViewer contentOutlineViewer = null;

	public UMLOutlinePage(TreeViewer treeViewerWithColumns) {
		this.treeViewerWithColumns = treeViewerWithColumns;
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);

		contentOutlineViewer = getTreeViewer();

		// Set the label and content view as well as initialize trees content
		contentOutlineViewer.setContentProvider(new UMLContentProvider());

		contentOutlineViewer.setLabelProvider(new UMLContentLabelProvider());

		contentOutlineViewer.setInput(treeViewerWithColumns.getSelection());

		// Register for selection events from MDHT table editor tree view
		treeViewerWithColumns.addSelectionChangedListener(this);
	}

}
