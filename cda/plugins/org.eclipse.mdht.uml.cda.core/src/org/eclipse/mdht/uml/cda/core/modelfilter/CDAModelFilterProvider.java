/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.core.modelfilter;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.mdht.uml.cda.core.profile.SeverityKind;
import org.eclipse.mdht.uml.cda.core.profile.Validation;
import org.eclipse.mdht.uml.cda.core.util.CDAProfileUtil;
import org.eclipse.mdht.uml.common.modelfilter.IModelFilterProvider;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;

public class CDAModelFilterProvider implements IModelFilterProvider, IExecutableExtension {

	public boolean isHidden(NamedElement namedElement) {
		boolean hidden = false;

		if (namedElement instanceof Property) {
			Property property = (Property) namedElement;

			// structural attribute: classCode, moodCode, etc.
			if (property.getType() instanceof Enumeration) {
				hidden = true;
			}

			// 'text' and 'title' properties are omitted
			if ("text".equals(namedElement.getName()) || "title".equals(namedElement.getName())) {
				hidden = true;
			}

			// fixed code value
			CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);
			if (codeSystemConstraint != null && codeSystemConstraint.getCode() != null) {
				hidden = true;
			}

			// optional properties that do not have validation stereotype
			// severity = INFO
			Validation validation = CDAProfileUtil.getValidation(property);
			if (validation == null && property.getLower() == 0) {
				hidden = true;
			}
			if (validation != null && SeverityKind.INFO == validation.getSeverity()) {
				hidden = true;
			} else if (property.getAssociation() != null) {
				validation = CDAProfileUtil.getValidation(property.getAssociation());
				if (validation != null && SeverityKind.INFO == validation.getSeverity()) {
					hidden = true;
				}
			}
		}

		if (namedElement instanceof Association) {
			Association association = (Association) namedElement;

			// severity = INFO
			Validation validation = CDAProfileUtil.getValidation(association);
			if (validation != null && SeverityKind.INFO == validation.getSeverity()) {
				hidden = true;
			}
		}

		return hidden;
	}

	public boolean isCollapsed(NamedElement namedElement) {
		boolean collapsed = false;

		// if (namedElement instanceof Property) {
		// Property property = (Property) namedElement;
		//
		// // associations with multiplicity upper bound = 1
		// if (property.getAssociation() != null && property.getUpper() == 1) {
		// collapsed = true;
		// }
		//
		// }

		return collapsed;
	}

	public Classifier getFilteredType(Property property) {
		return null;
	}

	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		// do nothing
	}

}
