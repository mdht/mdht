/*******************************************************************************
 * Copyright (c) 2009 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/

package org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.rimconstraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.hdf.util.RIMProfileUtil;
import org.openhealthtools.mdht.uml.hl7.validation.internal.HL7AbstractConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.Associations;

/**
 * ActAssociationsConstraint implements the implied constraints from the HL7 RIM
 * pattern "Act-Participation-Role-Entity" Under this pattern Acts must only be
 * associated to Participations; Participation must only be associated to Roles
 * Roles must only be association to Entities
 * 
 * Additional validated based on the RIM are ActRelationships which are
 * acceptable associations between Acts
 * 
 * TODO- There is an outstanding issues with regard to the navigation of
 * associations defined within HL7. For instance, Is it allowable to be able to
 * navigate from a Participation to an Act? The current implementation does not
 * allow such a relationship
 * 
 * TODO - RoleLinK There is another document association - RoleLink where two
 * roles are associated. This is currently not being constrained but have not
 * located a valid HL7 example to base the constrain on.
 * 
 * 
 */
public class ActAssociationsConstraint extends HL7AbstractConstraint {

	private static final String ID_ACTASSOCIATIONS = ASSOCIATIONS_GROUP + "ActAssociations";

	public static void register() {
		Associations.registerConstraints(ID_ACTASSOCIATIONS, new ActAssociationsConstraint());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.mdht.uml.hl7.validation.internal.HL7AbstractConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		Association association = (Association) context.getTarget();

		IStatus result = context.createSuccessStatus();

		for (Property property : association.getMemberEnds()) {
			if (property.isNavigable()) {

				Stereotype rimAssociationSource = RIMProfileUtil.getRIMStereotype(property.getOtherEnd().getType());

				Stereotype rimAssociationTarget = RIMProfileUtil.getRIMStereotype(property.getType());

				if (rimAssociationSource != null && rimAssociationTarget != null) {

					if (RIMConstraintsUtil.isAct(rimAssociationSource)) {
						if (!RIMConstraintsUtil.isParticipation(rimAssociationTarget) &&
								!RIMConstraintsUtil.isActRelationship(rimAssociationTarget)) {
							Object[] data = new Object[3];
							data[0] = property.getName();
							data[1] = property.getOtherEnd().getType().getName();
							result = context.createFailureStatus(data);
						}
					}

					if (RIMConstraintsUtil.isParticipation(rimAssociationSource)) {
						if (!RIMConstraintsUtil.isRole(rimAssociationTarget)) {
							Object[] data = new Object[3];
							data[0] = property.getName();
							data[1] = property.getOtherEnd().getType().getName();
							result = context.createFailureStatus(data);
						}
					}

					if (RIMConstraintsUtil.isRole(rimAssociationSource)) {
						if (!RIMConstraintsUtil.isEntity(rimAssociationTarget)) {
							Object[] data = new Object[3];
							data[0] = property.getName();
							data[1] = property.getOtherEnd().getType().getName();
							result = context.createFailureStatus(data);
						}
					}
				}

			}
		}

		return result;
	}

}
