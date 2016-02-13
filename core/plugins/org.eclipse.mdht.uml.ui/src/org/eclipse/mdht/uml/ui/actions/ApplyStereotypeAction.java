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
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.window.Window;
import org.eclipse.mdht.uml.ui.internal.l10n.UML2UIMessages;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

public class ApplyStereotypeAction extends UMLCommandAction {

	public ApplyStereotypeAction() {
		super();
	}

	@Override
	protected Command createActionCommand(EditingDomain editingDomain, Collection collection) {

		if (collection.size() == 1 && collection.iterator().next() instanceof Element) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Element element = (Element) collection.iterator().next();

			List choiceOfValues = new ArrayList();

			for (Iterator applicableStereotypes = element.getApplicableStereotypes().iterator(); applicableStereotypes.hasNext();) {

				Stereotype stereotype = (Stereotype) applicableStereotypes.next();

				if (!element.isStereotypeApplied(stereotype)) {
					choiceOfValues.add(stereotype);
				}
			}

			Collections.sort(choiceOfValues, new TextComparator());

			String label = UML2UIMessages._UI_ApplyStereotypeActionCommand_label;

			final FeatureEditorDialog dialog = new FeatureEditorDialog(
				workbenchPart.getSite().getShell(), getLabelProvider(), element, UMLPackage.Literals.ELEMENT,
				Collections.EMPTY_LIST, label, choiceOfValues);
			dialog.open();

			if (dialog.getReturnCode() == Window.OK) {
				editingDomain.getCommandStack().execute(new RefreshingChangeCommand(editingDomain, new Runnable() {

					public void run() {

						for (Iterator stereotypes = dialog.getResult().iterator(); stereotypes.hasNext();) {

							element.applyStereotype((Stereotype) stereotypes.next());
						}
					}
				}, label));
			}
		}
	}

}
