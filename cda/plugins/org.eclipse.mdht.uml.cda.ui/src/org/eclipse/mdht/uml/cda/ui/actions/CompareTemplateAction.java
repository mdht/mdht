/*******************************************************************************
 * Copyright (c) 2010 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.actions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.CompareUI;
import org.eclipse.compare.IModificationDate;
import org.eclipse.compare.IStreamContentAccessor;
import org.eclipse.compare.ITypedElement;
import org.eclipse.compare.structuremergeviewer.DiffNode;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.mdht.uml.cda.core.util.CDAProfileUtil;
import org.eclipse.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.eclipse.mdht.uml.common.util.NamedElementComparator;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;

public class CompareTemplateAction implements IObjectActionDelegate {

	public static class CompareInput extends CompareEditorInput {
		String leftSource;

		String leftTemplate;

		String rightSource;

		String rightTemplate;

		// public CompareInput() {
		// super(new CompareConfiguration());
		// }

		public CompareInput(CompareConfiguration compareConfiguration, String leftSource, String leftTemplate,
				String rightSource, String rightTemplate) {
			super(compareConfiguration);
			this.leftSource = leftSource;
			this.leftTemplate = leftTemplate;
			this.rightSource = rightSource;
			this.rightTemplate = rightTemplate;
			this.setTitle("MDHT CDA Template Comparison");

			// this.set
		}

		@Override
		protected Object prepareInput(IProgressMonitor pm) {

			CompareItem left = new CompareItem(leftSource, leftTemplate, 0);
			CompareItem right = new CompareItem(rightSource, rightTemplate, 0);

			DiffNode foo = new DiffNode(left, right);

			return foo;

		}

	}

	public static class CompareItem implements IStreamContentAccessor, ITypedElement, IModificationDate {
		private String contents, name;

		private long time;

		CompareItem(String name, String contents, long time) {
			this.name = name;
			this.contents = contents;
			this.time = time;
		}

		public InputStream getContents() throws CoreException {
			return new ByteArrayInputStream(contents.getBytes());
		}

		public Image getImage() {
			return null;
		}

		public long getModificationDate() {
			return time;
		}

		public String getName() {
			return name;
		}

		public String getString() {
			return contents;
		}

		public String getType() {
			return ITypedElement.UNKNOWN_TYPE;
		}
	}

	private static void appendAggregateRules(PrintWriter writer, Class umlClass) {
		Package xrefSource = UMLUtil.getTopPackage(umlClass);
		List<Classifier> allParents = new ArrayList<Classifier>(umlClass.allParents());
		allParents.add(0, umlClass);

		List<Property> allProperties = new ArrayList<Property>();
		List<Property> allAttributes = new ArrayList<Property>();
		List<Constraint> allConstraints = new ArrayList<Constraint>();

		// process parents in reverse order, CDA base class first
		for (int i = allParents.size() - 1; i >= 0; i--) {
			Class parent = (Class) allParents.get(i);
			if (CDAModelUtil.isCDAModel(parent)) {
				// TODO add option to include CDA class properties
				continue;
			}

			for (Property property : parent.getOwnedAttributes()) {
				// if list contains this property name, replace it; else append
				int index = findProperty(allProperties, property.getName());
				if (index >= 0) {
					allProperties.set(index, property);
				} else {
					allProperties.add(property);
				}
			}
		}

		for (int i = allParents.size() - 1; i >= 0; i--) {
			Class parent = (Class) allParents.get(i);

			for (Constraint constraint : parent.getOwnedRules()) {
				allConstraints.add(constraint);
			}
		}

		writer.println("");

		// use i>0 to omit this class
		for (int i = allParents.size() - 1; i > 0; i--) {
			Class parent = (Class) allParents.get(i);
			String message = CDAModelUtil.computeGeneralizationConformanceMessage(parent, false, xrefSource);
			if (message.length() > 0) {
				writer.println(message);
				writer.println("");
			}
		}

		for (Property property : allProperties) {
			if (CDAModelUtil.isXMLAttribute(property)) {
				allAttributes.add(property);
			}
		}
		allProperties.removeAll(allAttributes);
		Collections.sort(allAttributes, new NamedElementComparator());
		// XML attributes

		writer.println("");

		for (Property property : allAttributes) {
			writer.println(modelPrefix(property) + CDAModelUtil.computeConformanceMessage(property, false, xrefSource));
			writer.println("");
		}
		// XML elements

		writer.println("");

		for (Property property : allProperties) {
			writer.println(modelPrefix(property) + CDAModelUtil.computeConformanceMessage(property, false, xrefSource));
			writer.println("");
		}

		writer.println("");

		for (Constraint constraint : allConstraints) {
			writer.println(modelPrefix(constraint) + CDAModelUtil.computeConformanceMessage(constraint, false));
			writer.println("");
		}

	}

	private static int findProperty(List<Property> properties, String name) {
		if (name != null) {
			for (int i = 0; i < properties.size(); i++) {
				if (name.equals(properties.get(i).getName())) {
					return i;
				}
			}
		}
		return -1;
	}

	private static String modelPrefix(NamedElement element) {
		StringBuffer prefix = new StringBuffer();
		String modelPrefix = CDAModelUtil.getModelPrefix(element);
		if (modelPrefix != null && modelPrefix.length() > 0) {
			prefix.append("[");
			prefix.append(modelPrefix);
			prefix.append("] ");
		}

		return prefix.toString();
	}

	protected IWorkbenchPart activePart;

	protected ISelection currentSelection;

	protected Class selectedElement;

	protected Package selectedPackage;

	public CompareTemplateAction() {
		super();
	}

	protected View getSelectedView() {
		for (Iterator elements = ((IStructuredSelection) currentSelection).iterator(); elements.hasNext();) {

			Object element = elements.next();
			View view = ((IAdaptable) element).getAdapter(View.class);

			if (view != null) {
				return view;
			}
		}

		return null;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		if (selectedElement != null) {

			Class compareTarget = (Class) DialogLaunchUtil.chooseElement(
				new java.lang.Class[] { Class.class }, selectedElement.eResource().getResourceSet(),
				activePart.getSite().getShell());

			if (compareTarget != null) {

				StringWriter leftsw = new StringWriter();
				PrintWriter leftpw = new PrintWriter(leftsw);
				appendAggregateRules(leftpw, selectedElement);
				StringBuffer leftsb = leftsw.getBuffer();

				StringWriter rightsw = new StringWriter();
				PrintWriter rightpw = new PrintWriter(rightsw);
				appendAggregateRules(rightpw, compareTarget);
				StringBuffer rightsb = rightsw.getBuffer();

				CompareConfiguration cc = new CompareConfiguration();
				cc.setLeftLabel("Constraints as defined by " + selectedElement.getQualifiedName());
				cc.setRightLabel("Constraints as defined by " + compareTarget.getQualifiedName());
				cc.setLeftEditable(false);
				cc.setRightEditable(false);

				// cc.setl

				CompareUI.openCompareDialog(
					new CompareInput(
						cc, selectedElement.getQualifiedName(), leftsb.toString(), compareTarget.getQualifiedName(),
						rightsb.toString()));

			}

		}

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {

		currentSelection = selection;
		selectedElement = null;

		if (((IStructuredSelection) selection).size() == 1) {
			Object selected = ((IStructuredSelection) selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof View) {
				selected = ((View) selected).getElement();
			}

			if (selected instanceof Class) {
				selectedElement = (Class) selected;
			}
		}

		if (selectedElement != null && CDAProfileUtil.getAppliedCDAProfile(selectedElement) != null) {
			action.setEnabled(true);
		} else {
			action.setEnabled(false);
		}
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
	}

}
