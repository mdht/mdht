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
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;

public class DeleteUMLAction extends DeleteAction {

	public DeleteUMLAction(EditingDomain domain, boolean removeAllReferences) {
		super(domain, removeAllReferences);
	}

	public DeleteUMLAction(EditingDomain domain) {
		super(domain);
	}

	public DeleteUMLAction(boolean removeAllReferences) {
		super(removeAllReferences);
	}

	public DeleteUMLAction() {
		super();
	}

	@Override
	public Command createCommand(Collection<?> selection) {
		List<Object> elements = new ArrayList<Object>();
		for (Object object : selection) {
			if (object instanceof Class) {
				Class umlClass = (Class) object;
				for (Property property : umlClass.getOwnedAttributes()) {
					if (property.getAssociation() != null) {
						elements.add(property.getAssociation());
					}
				}
				elements.add(umlClass);
			} else if (object instanceof Association) {
				Association association = (Association) object;
				elements.addAll(association.getMemberEnds());
				elements.add(association);
			} else {
				elements.add(object);
			}
		}

		return removeAllReferences
				? DeleteCommand.create(domain, elements)
				: RemoveCommand.create(domain, elements);
	}

}
