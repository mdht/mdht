/*******************************************************************************
 * Copyright (c) 2006, 2011 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.ui.navigator.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.edit.ui.action.CommandActionHandler;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.common.ui.saveable.ModelDocument;
import org.openhealthtools.mdht.uml.common.ui.saveable.ModelManager;

public class DeleteUMLAction extends CommandActionHandler {

	protected List<Element> elements;

	public DeleteUMLAction(EditingDomain domain) {
		super(domain, EMFEditUIPlugin.INSTANCE.getString("_UI_Delete_menu_item"));
	}

	public DeleteUMLAction(EditingDomain domain, String label) {
		super(domain, label);
	}

	public void setActiveWorkbenchPart(IWorkbenchPart workbenchPart) {
		if (workbenchPart instanceof IEditingDomainProvider) {
			domain = ((IEditingDomainProvider) workbenchPart).getEditingDomain();
		}
	}

	@Override
	public Command createCommand(Collection<?> selection) {
		elements = new ArrayList<Element>();
		for (Object object : selection) {
			if (object instanceof Element && ((Element) object).getOwner() != null) {
				if (object instanceof Class) {
					Class umlClass = (Class) object;
					// delete associations for owned attributes
					for (Property property : umlClass.getOwnedAttributes()) {
						if (property.getAssociation() != null) {
							elements.addAll(property.getAssociation().getMemberEnds());
							elements.add(property.getAssociation());
						}
					}

					// delete associations when umlClass is the target
					// List<DirectedRelationship> specializations = umlClass.getTargetDirectedRelationships(UMLPackage.Literals.ASSOCIATION);
					// for (DirectedRelationship relationship : specializations) {
					for (Association association : umlClass.getAssociations()) {
						elements.addAll(association.getMemberEnds());
						elements.add(association);
					}

					// delete the class
					elements.add(umlClass);

				} else if (object instanceof Association) {
					Association association = (Association) object;
					elements.addAll(association.getMemberEnds());
					elements.add(association);
				} else {
					elements.add((Element) object);
				}
			}
		}

		if (elements.size() > 0) {
			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	@Override
	public void run() {

		if (command != UnexecutableCommand.INSTANCE) {
			String label = elements.get(0) instanceof NamedElement &&
					((NamedElement) elements.get(0)).getName() != null
					? "Delete " + ((NamedElement) elements.get(0)).getName()
					: "Delete Element";
			if (elements.size() > 1) {
				label += " (+" + (elements.size() - 1) + ")";
			}

			domain.getCommandStack().execute(new ChangeCommand(domain, new Runnable() {

				public void run() {
					for (Element element : elements) {
						if (element.eResource() != null) {
							// mark resource dirty so that it can be saved
							ModelDocument sourceDocument = ModelManager.getManager().manage(element.eResource());
							if (sourceDocument != null) {
								sourceDocument.setDirty(true);
							}
						}

						element.destroy();
					}
				}
			}, label));
		}
	}

}
