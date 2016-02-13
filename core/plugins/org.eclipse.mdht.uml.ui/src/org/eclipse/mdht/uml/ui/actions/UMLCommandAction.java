/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 */
package org.eclipse.mdht.uml.ui.actions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CommandAction;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.mdht.uml.common.ui.util.AdapterFactoryManager;
import org.eclipse.mdht.uml.common.ui.util.EditingDomainUtil;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.common.edit.provider.IItemQualifiedTextProvider;

public class UMLCommandAction extends CommandAction implements IObjectActionDelegate {

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		workbenchPart = targetPart;
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		ISelection unwrappedSelection = null;

		if (selection instanceof IStructuredSelection) {
			List<EObject> unwrapped = new ArrayList<EObject>();
			for (Iterator<?> elements = ((IStructuredSelection) selection).iterator(); elements.hasNext();) {

				Object element = elements.next();
				EObject eObject = null;
				if (element instanceof IAdaptable) {
					// Try to adapt to View first, since Notation OK
					eObject = ((IAdaptable) element).getAdapter(View.class);

					if (eObject == null) {
						eObject = ((IAdaptable) element).getAdapter(EObject.class);
					}
				} else if (element instanceof EObject) {
					eObject = (EObject) element;
				}

				if (View.class.isInstance(eObject)) {
					eObject = ((View) eObject).getElement();
				}

				if (eObject != null) {
					unwrapped.add(eObject);
				}
			}

			unwrappedSelection = new StructuredSelection(unwrapped);
			if (editingDomain == null) {
				editingDomain = EditingDomainUtil.getEditingDomain(unwrapped);
			}
		} else {
			unwrappedSelection = selection;
		}

		super.selectionChanged(action, unwrappedSelection);
	}

	protected class TextComparator<T> implements Comparator<T> {

		public int compare(T t1, T t2) {
			return CommonPlugin.INSTANCE.getComparator().compare(
				getLabelProvider().getText(t1), getLabelProvider().getText(t2));
		}
	}

	protected class RefreshingChangeCommand extends ChangeCommand {

		public RefreshingChangeCommand(EditingDomain editingDomain, Runnable runnable, String label) {
			super(editingDomain, runnable, label);
		}

		@Override
		public void execute() {
			super.execute();

			refreshViewer();
		}

		@Override
		public void undo() {
			super.undo();

			refreshViewer();
		}

		@Override
		public void redo() {
			super.redo();

			refreshViewer();
		}

	}

	private ILabelProvider labelProvider = null;

	protected UMLCommandAction() {
		super();
	}

	protected ILabelProvider getLabelProvider() {
		if (labelProvider == null && getAdapterFactory() != null) {
			labelProvider = new AdapterFactoryLabelProvider(getAdapterFactory()) {

				@Override
				public String getColumnText(Object object, int columnIndex) {
					IItemQualifiedTextProvider itemQualifiedTextProvider = (IItemQualifiedTextProvider) adapterFactory.adapt(
						object, IItemQualifiedTextProvider.class);

					return itemQualifiedTextProvider != null
							? itemQualifiedTextProvider.getQualifiedText(object)
							: super.getColumnText(object, columnIndex);
				}

				@Override
				public String getText(Object object) {
					IItemQualifiedTextProvider itemQualifiedTextProvider = (IItemQualifiedTextProvider) adapterFactory.adapt(
						object, IItemQualifiedTextProvider.class);

					return itemQualifiedTextProvider != null
							? itemQualifiedTextProvider.getQualifiedText(object)
							: super.getText(object);
				}
			};
		}

		return labelProvider;
	}

	protected AdapterFactory getAdapterFactory() {
		return editingDomain instanceof AdapterFactoryEditingDomain
				? ((AdapterFactoryEditingDomain) editingDomain).getAdapterFactory()
				: AdapterFactoryManager.getAdapterFactory();
	}

	@Override
	public void setActiveEditor(IAction action, IEditorPart editorPart) {
		super.setActiveEditor(action, editorPart);
	}

	protected void refreshViewer() {

		if (workbenchPart instanceof IViewerProvider) {
			((IViewerProvider) workbenchPart).getViewer().refresh();
		}
	}

}
