/*******************************************************************************
 * Copyright (c) 2015 NEHTA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Hai Bang National E-Health Transition Authority (NEHTA) - initial API and implementation
 *     Sean Muir National E-Health Transition Authority (NEHTA) - simplified tree traversal
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.commands;

import java.util.ArrayDeque;
import java.util.Deque;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.DelegatingWrapperItemProvider;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.mdht.uml.common.ui.util.IResourceConstants;
import org.eclipse.mdht.uml.ui.navigator.UMLDomainNavigatorItem;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class AddLocalizedClassCommand extends AbstractHandler {

	class NamedElementsStack extends UMLSwitch<Deque<NamedElement>> {

		public Deque<NamedElement> namedElements = new ArrayDeque<NamedElement>();

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#casePackage(org.eclipse.uml2.uml.Package)
		 */
		@Override
		public Deque<NamedElement> casePackage(Package object) {
			namedElements.push(object);
			return namedElements;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseClass(org.eclipse.uml2.uml.Class)
		 */
		@Override
		public Deque<NamedElement> caseClass(Class object) {
			namedElements.push(object);
			return namedElements;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseAssociation(org.eclipse.uml2.uml.Association)
		 */
		@Override
		public Deque<NamedElement> caseAssociation(Association object) {
			for (Property p : object.getMemberEnds()) {

				if (p.getOwner() instanceof Class) {
					namedElements.push(p);
				}

			}
			return namedElements;

		}

	}

	public static String OPT_NESTCLASS = "org.eclipse.mdht.uml.ui.commands.AddLocalizedClassCommand.nestclass";

	/**
	 * Given the current selected item in the tree, traverse up the tree structure to create the path(stack) of the named elements
	 * Using this stack, create the inner classes and associations to duplicate the structure
	 *
	 * @param provider
	 * @param selectedItem
	 */
	private void processSelection(ITreeContentProvider provider, Object selectedItem, boolean createNestClass) {

		NamedElementsStack namedElementsStack = new NamedElementsStack();

		EObject namedElement = unwrap(selectedItem);
		Object treeElement = selectedItem;
		while (namedElement != null) {
			namedElementsStack.doSwitch(namedElement);
			treeElement = provider.getParent(treeElement);
			namedElement = unwrap(treeElement);
		}

		// Hack to handle issue with editor not correctly populating navigator parent
		// This happens on associations on classes owned by the package
		if (namedElementsStack.namedElements.size() == 1) {
			namedElement = unwrap(selectedItem);
			if (namedElement instanceof Association) {
				Association association = (Association) namedElement;
				for (Property p : association.getMemberEnds()) {
					if (p.getOwner() instanceof Class) {
						namedElementsStack.doSwitch(p.getOwner());
						break;
					}
				}

			}
		}

		// Find the class
		while (!namedElementsStack.namedElements.isEmpty() &&
				!(namedElementsStack.namedElements.peek() instanceof Class)) {
			namedElementsStack.namedElements.pop();
		}

		Class owningClass = (Class) namedElementsStack.namedElements.pop();

		while (!namedElementsStack.namedElements.isEmpty() &&
				(namedElementsStack.namedElements.peek() instanceof Class)) {
			owningClass = (Class) namedElementsStack.namedElements.pop();
		}

		boolean ifFirst = true;
		while (!namedElementsStack.namedElements.isEmpty() &&
				(namedElementsStack.namedElements.peek() instanceof Property)) {

			Property property = (Property) namedElementsStack.namedElements.pop();
			Class newClass = UMLFactory.eINSTANCE.createClass();
			newClass.setName(property.getType().getName());

			// If not createNested and isFirst - put class in the nearest package
			if (!createNestClass && ifFirst) {
				owningClass.getNearestPackage().getOwnedTypes().add(newClass);
			} else {
				owningClass.getNestedClassifiers().add(newClass);
			}

			newClass.createGeneralization((Classifier) property.getType());

			// First time through use the existing association
			if (ifFirst && property.getOwner().equals(owningClass)) {
				property.setType(newClass);
			} else {
				owningClass.createAssociation(
					true, property.getAggregation(), property.getName(), property.getLower(), property.getUpper(),
					newClass, false, AggregationKind.NONE_LITERAL, "", 0, 1);
			}
			ifFirst = false;
			owningClass = newClass;

		}

	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);

		IWorkbenchPart activePart = HandlerUtil.getActivePartChecked(event);
		IViewerProvider view = activePart.getAdapter(IViewerProvider.class);
		final TreeViewer tree = (TreeViewer) view.getViewer();
		final boolean createNestClass = (Boolean) event.getObjectParameterForExecution(
			AddLocalizedClassCommand.OPT_NESTCLASS);
		final Object selectedObject = selection.getFirstElement();
		final TransactionalEditingDomain editingDomain = getEditingDomain(selectedObject);

		// Create a new execution job and schedule this job run on a
		// separate thread. This will release the UI
		// thread from being blocked. Up to job manager decide when to
		// execute, depending on eclipse's job queue.

		Job j = new Job("Localise Class" + (createNestClass
				? " (Nested)"
				: "")) {
			@Override
			public IStatus run(final IProgressMonitor monitor) {

				IStatus status = Status.OK_STATUS;
				editingDomain.getCommandStack().execute(
					new RecordingCommand(editingDomain, "Localise Class" + (createNestClass
							? " (Nested)"
							: "")) {
					@Override
					protected void doExecute() {
						processSelection(
							(ITreeContentProvider) tree.getContentProvider(), selectedObject, createNestClass);
					}
				});

				if (monitor.isCanceled()) {
					status = Status.CANCEL_STATUS;
				}
				monitor.done();

				return status;
			}

		};
		j.schedule();

		return null;
	}

	private static EObject unwrap(Object wrapper) {
		Object obj = null;
		if (wrapper instanceof EObject) {
			return (EObject) wrapper;
		}
		if (wrapper instanceof DelegatingWrapperItemProvider) {
			obj = ((DelegatingWrapperItemProvider) wrapper).getValue();
		} else if (wrapper instanceof UMLDomainNavigatorItem) {
			obj = ((UMLDomainNavigatorItem) wrapper).getEObject();
		} else {
			return null;
		}
		return unwrap(obj);
	}

	private static TransactionalEditingDomain getEditingDomain(Object editingObject) {
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(unwrap(editingObject));

		if (editingDomain == null) {
			editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain(
				IResourceConstants.EDITING_DOMAIN_ID);
		}

		return editingDomain;
	}

}
