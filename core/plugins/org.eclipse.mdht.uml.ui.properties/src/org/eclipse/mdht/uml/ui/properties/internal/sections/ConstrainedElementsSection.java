/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - UI for editing constrained elements (artf3318)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.properties.internal.sections;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.mdht.uml.common.ui.dialogs.ElementSelectionDialog;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.ui.properties.sections.WrapperAwareModelerPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;

/**
 * The constraint-elements property section for UML constraints.
 */
public class ConstrainedElementsSection extends WrapperAwareModelerPropertySection {

	private Constraint constraint;

	private ListViewer constrainedElementsList;

	private Button addButton;

	private Button removeButton;

	private Button upButton;

	private Button downButton;

	private final UMLMetamodelCache uml = new UMLMetamodelCache();

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		FormData data = null;

		CLabel listLabel = getWidgetFactory().createCLabel(composite, "Constrained Elements:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(0, 0);
		listLabel.setLayoutData(data);

		constrainedElementsList = new ListViewer(
			getWidgetFactory().createList(composite, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER));
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		// if I set the width AND right, then I get proper wrapping for long text... whatever.
		data.width = 300;
		data.right = new FormAttachment(100, -100);
		// if I set the top AND height, then I get vertical scroll within the tab page
		data.top = new FormAttachment(listLabel, 0, SWT.BOTTOM);
		data.bottom = new FormAttachment(100, 0);
		constrainedElementsList.getControl().setLayoutData(data);

		constrainedElementsList.setContentProvider(new ConstrainedElementsContentProvider());
		constrainedElementsList.setLabelProvider(new ConstrainedElementsLabelProvider());

		addButton = getWidgetFactory().createButton(composite, "Add...", SWT.PUSH);
		data = new FormData();
		data.left = new FormAttachment(constrainedElementsList.getControl(), 0, SWT.RIGHT);
		data.top = new FormAttachment(constrainedElementsList.getControl(), 0, SWT.TOP);
		data.right = new FormAttachment(100, 0);
		addButton.setLayoutData(data);

		removeButton = getWidgetFactory().createButton(composite, "Remove", SWT.PUSH);
		data = new FormData();
		data.left = new FormAttachment(constrainedElementsList.getControl(), 0, SWT.RIGHT);
		data.top = new FormAttachment(addButton, 0, SWT.BOTTOM);
		data.right = new FormAttachment(100, 0);
		removeButton.setLayoutData(data);

		upButton = getWidgetFactory().createButton(composite, "Up", SWT.PUSH);
		data = new FormData();
		data.left = new FormAttachment(constrainedElementsList.getControl(), 0, SWT.RIGHT);
		data.top = new FormAttachment(removeButton, 0, SWT.BOTTOM);
		data.right = new FormAttachment(100, 0);
		upButton.setLayoutData(data);

		downButton = getWidgetFactory().createButton(composite, "Down", SWT.PUSH);
		data = new FormData();
		data.left = new FormAttachment(constrainedElementsList.getControl(), 0, SWT.RIGHT);
		data.top = new FormAttachment(upButton, 0, SWT.BOTTOM);
		data.right = new FormAttachment(100, 0);
		downButton.setLayoutData(data);

		//
		// hook some listeners
		//

		final SelectionListener buttonListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.getSource() == addButton) {
					addConstrainedElements();
				} else if (e.getSource() == removeButton) {
					removeConstrainedElements();
				} else if (e.getSource() == upButton) {
					moveConstrainedElement(-1);
				} else if (e.getSource() == downButton) {
					moveConstrainedElement(+1);
				}
			}
		};
		addButton.addSelectionListener(buttonListener);
		removeButton.addSelectionListener(buttonListener);
		upButton.addSelectionListener(buttonListener);
		downButton.addSelectionListener(buttonListener);

		constrainedElementsList.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				updateButtons();
			}
		});
	}

	@Override
	protected boolean isReadOnly() {
		boolean result = super.isReadOnly();

		if (!result && (constraint != null)) {
			if (isProfileClassifier(constraint.getContext())) {
				// only constrained element permitted on stereotype or other classifier-owned constraints in a profile
				// constraints is the context classifier (implied)
				result = true;
			} else {
				TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(constraint);
				if ((editingDomain != null) && editingDomain.isReadOnly(constraint.eResource())) {
					result = true;
				}
			}
		}

		return result;
	}

	static boolean isProfileClassifier(Namespace context) {
		return (context instanceof Classifier) && (context.getNearestPackage() instanceof Profile);
	}

	/*
	 * Override super implementation to allow for objects that are not IAdaptable.
	 *
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection#addToEObjectList(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected boolean addToEObjectList(Object object) {
		boolean added = super.addToEObjectList(object);
		if (!added && object instanceof Element) {
			getEObjectList().add(object);
			added = true;
		}
		return added;
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		EObject element = getEObject();
		Assert.isTrue(element instanceof Constraint);
		this.constraint = (Constraint) element;
		uml.update(this.constraint);
	}

	@Override
	public void dispose() {
		uml.dispose(); // shut down the UML metamodel cache
		super.dispose();
	}

	@Override
	public void refresh() {
		if (constrainedElementsList != null) {
			constrainedElementsList.setInput(constraint);
			constrainedElementsList.refresh();
		}

		updateButtons();
	}

	private void updateButtons() {
		boolean disableAll = isReadOnly();

		int selection = constrainedElementsList.getList().getSelectionIndex();
		boolean multi = constrainedElementsList.getList().getSelectionCount() > 1;
		int lastItem = constrainedElementsList.getList().getItemCount() - 1;

		addButton.setEnabled(!disableAll);
		removeButton.setEnabled(!disableAll && (selection >= 0));
		upButton.setEnabled(!disableAll && !multi && (selection > 0));
		downButton.setEnabled(!disableAll && !multi && (selection >= 0) && (selection < lastItem));
	}

	/**
	 * Update if necessary, upon receiving the model event.
	 *
	 * @see #aboutToBeShown()
	 * @see #aboutToBeHidden()
	 * @param notification
	 *            event notification
	 * @param element
	 *            element that has changed
	 */
	@Override
	public void update(final Notification notification, EObject element) {
		if (!isDisposed()) {
			postUpdateRequest(new Runnable() {

				public void run() {
					// widget not disposed and UML element is not deleted
					if (!isDisposed() && (constraint.eResource() != null)) {
						refresh();
					}
				}
			});
		}
	}

	private void addConstrainedElements() {
		final List<? extends Element> elementsToAdd;

		if (constraint.getNearestPackage() instanceof Profile) {
			elementsToAdd = selectElements(
				uml.getUMLMetaclasses(), "Add Constrained Element", "Select an UML metaclass to constrain.");
		} else {
			elementsToAdd = selectElements(
				find(constraint.getContext(), UMLPackage.Literals.CLASSIFIER, UMLPackage.Literals.CONSTRAINT,
					UMLPackage.Literals.FEATURE),
				"Add Constrained Elements", "Select an element to constrain.");
		}

		elementsToAdd.removeAll(constraint.getConstrainedElements());

		if (!elementsToAdd.isEmpty()) {
			execute(new AbstractEMFOperation(TransactionUtil.getEditingDomain(constraint), "Add Constrained Element") {

				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable uiContext) throws ExecutionException {
					constraint.getConstrainedElements().addAll(elementsToAdd);

					if (constraint.getNearestPackage() instanceof Profile) {
						ensureMetaclassReferences(constraint, elementsToAdd);
					}

					return Status.OK_STATUS;
				}
			});

			constrainedElementsList.refresh();

			// if we don't async this, then the selection is lost immediately after it's made. Odd that it's not a
			// problem in the up/down actions ...
			getPart().getSite().getShell().getDisplay().asyncExec(new Runnable() {

				public void run() {
					if (!constrainedElementsList.getControl().isDisposed()) {
						constrainedElementsList.setSelection(new StructuredSelection(elementsToAdd), true);
					}
				}
			});
		}
	}

	private Shell getShell() {
		return getPart().getSite().getShell();
	}

	private List<? extends Element> selectElements(List<?> scope, String title, String message) {
		// filter out elements we already constrain and don't let the constraint constrain itself
		scope = new java.util.ArrayList<Object>(scope);
		scope.removeAll(constraint.getConstrainedElements());
		scope.remove(constraint);

		List<Element> result = new java.util.ArrayList<Element>();

		ElementSelectionDialog dialog = new ElementSelectionDialog(
			getShell(), new ProgressMonitorDialog(getShell()), scope);
		dialog.setTitle(title);
		dialog.setMessage(message);

		if (dialog.open() == Window.OK) {
			for (Object next : dialog.getResult()) {
				result.add((Element) next);
			}
		}

		return result;
	}

	private Resource getUMLMetamodel() {
		return constraint.eResource().getResourceSet().getResource(URI.createURI(UMLResource.UML_METAMODEL_URI), true);
	}

	private void ensureMetaclassReferences(Constraint constraint, Collection<?> constrainedElements) {
		Profile profile = (Profile) constraint.getNearestPackage();

		// simplest case is UML metamodel is referenced
		final URI uml = URI.createURI(UMLResource.UML_METAMODEL_URI);
		for (Model next : profile.getReferencedMetamodels()) {
			if (EcoreUtil.getURI(next).trimFragment().equals(uml)) {
				return;
			}
		}

		// OK, then ensure metaclass references
		for (Object next : constrainedElements) {
			if (next instanceof Class) {
				Class metaclass = (Class) next;
				profile.getMetaclassReference(metaclass, true);
			}
		}
	}

	private List<? extends NamedElement> find(Object scope, EClass... type) {
		List<NamedElement> result = new java.util.ArrayList<NamedElement>();

		for (Iterator<?> iter = EcoreUtil.getAllContents(Collections.singleton(scope)); iter.hasNext();) {
			Object next = iter.next();

			if (next instanceof NamedElement) {
				for (int i = 0; i < type.length; i++) {
					if (type[i].isInstance(next)) {
						result.add((NamedElement) next);
					}
				}
			}
		}

		return result;
	}

	private void removeConstrainedElements() {
		execute(new AbstractEMFOperation(TransactionUtil.getEditingDomain(constraint), "Remove Constrained Elements") {

			@Override
			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable uiContext) throws ExecutionException {
				constraint.getConstrainedElements().removeAll(getSelectedConstrainedElements());
				return Status.OK_STATUS;
			}
		});

		constrainedElementsList.refresh();
	}

	private void moveConstrainedElement(int delta) {
		final int index = constrainedElementsList.getList().getSelectionIndex();
		final int newIndex = Math.min(Math.max(0, index + delta), constrainedElementsList.getList().getItemCount() - 1);

		execute(new AbstractEMFOperation(TransactionUtil.getEditingDomain(constraint), "Reorder Constrained Elements") {

			@Override
			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable uiContext) throws ExecutionException {
				constraint.getConstrainedElements().move(newIndex, index);
				return Status.OK_STATUS;
			}
		});

		constrainedElementsList.refresh();
		constrainedElementsList.setSelection(
			new StructuredSelection(constraint.getConstrainedElements().get(newIndex)));
	}

	private Collection<?> getSelectedConstrainedElements() {
		return ((IStructuredSelection) constrainedElementsList.getSelection()).toList();
	}

	//
	// Nested types
	//

	private static class ConstrainedElementsContentProvider implements IStructuredContentProvider {

		public Object[] getElements(Object inputElement) {
			List<?> result;

			Constraint constraint = (inputElement instanceof Constraint)
					? (Constraint) inputElement
					: null;

			if (constraint == null) {
				result = Collections.EMPTY_LIST;
			} else if (isProfileClassifier(constraint.getContext())) {
				// the stereotype or other profile classifier is the only constrained element
				result = Collections.singletonList(constraint.getContext());
			} else {
				result = constraint.getConstrainedElements();
			}

			return result.toArray();
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// pass
		}

		public void dispose() {
			// pass
		}

	}

	private static class ConstrainedElementsLabelProvider extends LabelProvider {
		@Override
		public String getText(Object element) {
			String result;

			if (element instanceof NamedElement) {
				result = UMLUtil.getPackageQualifiedName((NamedElement) element);
			} else {
				result = org.eclipse.uml2.uml.util.UMLUtil.getQualifiedText((EObject) element);
			}

			return result;
		}
	}

	private class UMLMetamodelCache {
		private ResourceSet context;

		private List<Class> umlMetaclasses;

		void update(Element element) {
			ResourceSet newContext = element.eResource().getResourceSet();
			if (newContext != context) {
				// purge the cache
				umlMetaclasses = null;
				context = newContext;
			}
		}

		void dispose() {
			umlMetaclasses = null;
			context = null;
		}

		List<Class> getUMLMetaclasses() {
			if (umlMetaclasses == null) {
				Model uml = (Model) EcoreUtil.getObjectByType(
					getUMLMetamodel().getContents(), UMLPackage.Literals.MODEL);
				if (uml != null) {
					umlMetaclasses = new java.util.ArrayList<Class>();
					for (Object next : uml.getPackagedElements()) {
						if ((next instanceof Class) && ((Class) next).isMetaclass()) {
							umlMetaclasses.add((Class) next);
						}
					}
				}
			}

			return umlMetaclasses;
		}
	}
}
