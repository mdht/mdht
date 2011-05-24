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

import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;

import org.eclipse.gef.commands.Command;

import org.eclipse.gef.editpolicies.AbstractEditPolicy;

import org.eclipse.gef.requests.ReconnectRequest;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class RIMAssociationEditPolicy extends AbstractEditPolicy implements EditPolicy {

	/**
	 * @generated
	 */
	@Override
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			ReconnectRequest reconnectRequest = (ReconnectRequest) request;
			ConnectionEditPart connectionEP = reconnectRequest.getConnectionEditPart();
			if (connectionEP instanceof IProfileAssociationConnectionEditPart) {
				IProfileAssociationConnectionEditPart associationEP = (IProfileAssociationConnectionEditPart) connectionEP;
				request.getExtendedData().put("SOURCE_FEATURE", associationEP.getSourceFeature());
				request.getExtendedData().put("ELEMENT_TYPE", associationEP.getElementType());
			}
		}

		return super.getCommand(request);
	}

	/**
	 * @generated
	 */
	public interface IProfileAssociationConnectionEditPart {
		public String getSourceFeature();

		public IElementType getElementType();
	}
}
