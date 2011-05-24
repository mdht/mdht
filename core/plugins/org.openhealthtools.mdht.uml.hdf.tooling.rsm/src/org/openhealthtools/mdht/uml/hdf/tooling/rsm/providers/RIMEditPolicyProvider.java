/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.hdf.tooling.rsm.providers;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gef.EditPart;

import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;

import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;

import org.openhealthtools.mdht.uml.hdf.tooling.rsm.types.RIMElementTypes;

/**
 * @generated
 */
public class RIMEditPolicyProvider extends AbstractProvider implements IEditPolicyProvider {

	private final static String PROFILE_ASSOCIATIONS_SEMANTIC_ROLE = "ProfileAssociationsSemanticRole"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public void createEditPolicies(EditPart editPart) {
		editPart.installEditPolicy(PROFILE_ASSOCIATIONS_SEMANTIC_ROLE, new RIMAssociationEditPolicy());
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof CreateEditPoliciesOperation) {
			EditPart ep = ((CreateEditPoliciesOperation) operation).getEditPart();

			if (ep instanceof IGraphicalEditPart) {
				IGraphicalEditPart gep = (IGraphicalEditPart) ep;
				EObject element = gep.getNotationView().getElement();
				if (element != null) {
					for (IElementType elementType : RIMElementTypes.NODE_TYPES) {
						if (elementType instanceof ISpecializationType) {
							if (((ISpecializationType) elementType).getMatcher().matches(element)) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
}
