/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.actions;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.eclipse.mdht.uml.common.ui.search.PropertyTypeFilter;
import org.eclipse.mdht.uml.common.ui.search.StereotypePropertyTypeFilter;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.ui.internal.Logger;
import org.eclipse.mdht.uml.ui.internal.l10n.UML2UIMessages;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

public class AddUMLAssociationAction extends UML2AbstractAction {

	public AddUMLAssociationAction() {
		super();
	}

	/**
	 * Subclass may override to customize domain-specific processing.
	 * Default is to open dialog containing all available classes.
	 *
	 * @param new
	 *            class
	 */
	protected Type selectTargetType(Class source) {
		Package topPackage = UMLUtil.getTopPackage(source);
		NamedElement target = null;

		// prompt for target class
		if (topPackage instanceof Profile) {
			if (source instanceof Stereotype) {
				target = DialogLaunchUtil.chooseElement(
					new StereotypePropertyTypeFilter(), topPackage, activePart.getSite().getShell(),
					UML2UIMessages.TargetSelectionDialog_title, UML2UIMessages.TargetSelectionDialog_message);
			} else {
				target = DialogLaunchUtil.chooseElement(
					new PropertyTypeFilter(), topPackage, activePart.getSite().getShell(),
					UML2UIMessages.TargetSelectionDialog_title, UML2UIMessages.TargetSelectionDialog_message);
			}
		} else {
			// TODO refine selection for redefined properties to include only subtypes.
			target = DialogLaunchUtil.chooseElement(
				new PropertyTypeFilter(), topPackage, activePart.getSite().getShell());
		}

		return target instanceof Type
				? (Type) target
				: null;
	}

	/**
	 * Subclass may override to customize domain-specific processing.
	 * Do nothing by default.
	 *
	 * @param new
	 *            property
	 */
	protected void postProcess(Property newProperty) {
		// do nothing by default
	}

	/**
	 * Subclass may override to customize domain-specific processing.
	 * Do nothing by default.
	 *
	 * @param new
	 *            property
	 */
	protected void postProcess(Association newAssociation) {
		// do nothing by default
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			final Element element = getSelectedElement();
			if (element != null) {
				IUndoableOperation operation = new AbstractEMFOperation(
					editingDomain, UML2UIMessages.AddUMLAssociation_operation_title) {
					@Override
					protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
						if (Class.class.isInstance(element)) {
							Class source = (Class) element;

							Type target = selectTargetType(source);
							if (target == null) {
								return Status.CANCEL_STATUS;
							}

							String typeName = target.getName();
							String endName = Character.toLowerCase(typeName.charAt(0)) + typeName.substring(1);
							String propertyName = getUniqueMemberName(source, endName);

							Property property = UMLFactory.eINSTANCE.createProperty();
							property.setName(propertyName);
							source.getOwnedAttributes().add(property);
							property.setType(target);
							property.setLower(0);
							property.setUpper(-1);
							property.setAggregation(AggregationKind.NONE_LITERAL);

							Association association = (Association) source.getNearestPackage().createOwnedType(
								null, UMLPackage.Literals.ASSOCIATION);
							association.getMemberEnds().add(property);
							Property ownedEnd = UMLFactory.eINSTANCE.createProperty();
							ownedEnd.setType(source);
							association.getOwnedEnds().add(ownedEnd);

							// if controlled resources, move association to same resource as source class
							if (source.eResource() != source.getNearestPackage().eResource()) {
								source.eResource().getContents().add(association);
							}

							postProcess(property);
							postProcess(association);

							if (activePart instanceof ISetSelectionTarget) {
								((ISetSelectionTarget) activePart).selectReveal(new StructuredSelection(source));
								((ISetSelectionTarget) activePart).selectReveal(new StructuredSelection(association));
								((ISetSelectionTarget) activePart).selectReveal(new StructuredSelection(property));
							}

							return Status.OK_STATUS;
						}

						return Status.CANCEL_STATUS;
					}
				};

				try {
					IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
					operation.addContext(commandStack.getDefaultUndoContext());
					commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), activePart);

				} catch (ExecutionException ee) {
					Logger.logException(ee);
				}
			}

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

}
