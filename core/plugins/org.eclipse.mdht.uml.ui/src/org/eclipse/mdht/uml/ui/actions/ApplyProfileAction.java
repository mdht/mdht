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
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.window.Window;
import org.eclipse.mdht.uml.ui.internal.l10n.UML2UIMessages;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class ApplyProfileAction extends UMLCommandAction {

	public ApplyProfileAction() {
		super();
	}

	@Override
	protected Command createActionCommand(EditingDomain editingDomain, Collection<?> collection) {

		if (collection.size() == 1 && collection.iterator().next() instanceof org.eclipse.uml2.uml.Package) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) collection.iterator().next();

			final List<Profile> choiceOfValues = new ArrayList<Profile>();

			ResourceSet resourceSet = package_.eResource().getResourceSet();

			for (URI profileURI : UMLPlugin.getEPackageNsURIToProfileLocationMap().values()) {

				try {
					resourceSet.getResource(profileURI.trimFragment(), true);
				} catch (Exception e) {
					// ignore
				}
			}

			for (Resource resource : resourceSet.getResources()) {
				TreeIterator<EObject> allContents = resource.getAllContents();

				while (allContents.hasNext()) {

					new UMLSwitch<Object>() {

						@Override
						public Object caseProfile(Profile profile) {

							if (profile.isDefined()) {
								ProfileApplication profileApplication = package_.getProfileApplication(profile);

								if (profileApplication == null ||
										profileApplication.getAppliedDefinition() != profile.getDefinition()) {

									choiceOfValues.add(profile);
								}
							}

							return profile;
						}
					}.doSwitch(allContents.next());
				}
			}

			Collections.<Profile> sort(choiceOfValues, new TextComparator<Profile>());

			String label = UML2UIMessages._UI_ApplyProfileActionCommand_label;

			final FeatureEditorDialog dialog = new FeatureEditorDialog(
				workbenchPart.getSite().getShell(), getLabelProvider(), package_, UMLPackage.Literals.PROFILE,
				Collections.EMPTY_LIST, label, choiceOfValues, false, false, true);
			dialog.open();

			if (dialog.getReturnCode() == Window.OK) {
				editingDomain.getCommandStack().execute(new RefreshingChangeCommand(editingDomain, new Runnable() {

					public void run() {

						for (Object result : dialog.getResult()) {
							package_.applyProfile((Profile) result);
						}
					}
				}, label));
			}
		}
	}

}
