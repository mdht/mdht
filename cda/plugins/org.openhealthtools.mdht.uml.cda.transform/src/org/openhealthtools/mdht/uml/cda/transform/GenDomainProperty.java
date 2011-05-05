/*******************************************************************************
 * Copyright (c) 2011 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.transform;

import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil;

public class GenDomainProperty extends TransformAbstract {

	protected GenMethodHelper methodHelper;

	public GenDomainProperty(EcoreTransformerOptions options) {
		super(options);

		methodHelper = new GenMethodHelper(transformerOptions);
	}

	@Override
	public Object caseProperty(Property property) {
		if (isRemoved(property)) {
			return null;
		}

		// only process properties that are owned by a Class
		if (property.getClass_() == null) {
			return null;
		}

		// if greenCDA style interfaces, omit all operations for fixed values
		if (isFixedValue(property) && !transformerOptions.isIncludeFixedValueGetters()) {
			return null;
		}

		// TODO omit classCode, moodCode for now due to incompatible enum types with CDA base model
		// also, most or all class/mood codes should be defaulted in greenCDA
		if (property.getType() instanceof Enumeration) {
			return null;
		}

		Interface domainInterface = getDomainInterface(property.getClass_());
		Classifier domainType = (Classifier) property.getType();
		if (UMLUtil.isSameModel(property.getType(), property.getClass_())) {
			domainType = getDomainInterface(property.getType());
		}

		// "getter" operation
		Operation getOperation = methodHelper.genPropertyGetterOperation(domainInterface, property, domainType);

		if (getOperation != null) {
			// copy comments for use in Javadoc
			List<Comment> comments = null;
			if (property.getAssociation() != null) {
				comments = property.getAssociation().getOwnedComments();
			} else {
				comments = property.getOwnedComments();
			}

			for (Comment comment : comments) {
				Comment clone = EcoreUtil.copy(comment);
				clone.getAnnotatedElements().add(getOperation);
				getOperation.getOwnedComments().add(clone);
			}

			// TODO get full XPath of this element in CDA
			// add simple comment so that OCL does not display as short javadoc summary
			// add as first comment so that it is always displayed as method summary
			Property docProperty = CDAModelUtil.getCDAProperty(property);
			if (docProperty == null) {
				docProperty = property;
			}
			Comment comment = UMLFactory.eINSTANCE.createComment();
			getOperation.getOwnedComments().add(0, comment);
			comment.getAnnotatedElements().add(getOperation);
			String xpath = docProperty.getQualifiedName();
			comment.setBody(xpath + ".");
		}

		// update operations
		if (!isFixedValue(property)) {
			Operation createOperation = null;
			Operation updateOperation = null;

			// "create" operation
			createOperation = methodHelper.genCreateOperation(domainInterface, property, domainType);

			// "add" operation
			if (property.getUpper() > 1 || property.getUpper() == -1) {
				updateOperation = methodHelper.genAddOperation(domainInterface, property, domainType);
			}

			// "with" operation
			if (property.getUpper() == 1) {
				updateOperation = methodHelper.genSetOperation(domainInterface, property, domainType);
			}

			// add UML comment with CDA conformance rule expression
			String conformanceText = CDAModelUtil.computeConformanceMessage(property, false);
			if (!conformanceText.endsWith(".")) {
				// for Javadoc, add period to terminate short description
				conformanceText += ".";
			}
			if (createOperation != null) {
				Comment conformanceRule = createOperation.createOwnedComment();
				conformanceRule.getAnnotatedElements().add(createOperation);
				conformanceRule.setBody(conformanceText);
			}
			if (updateOperation != null) {
				Comment conformanceRule = updateOperation.createOwnedComment();
				conformanceRule.getAnnotatedElements().add(updateOperation);
				conformanceRule.setBody(conformanceText);
			}
		}

		return property;
	}

	private boolean isFixedValue(Property property) {
		if (property.isReadOnly()) {
			return true;
		} else if (SEVERITY_ERROR.equals(CDAModelUtil.getValidationSeverity(property))) {
			// SHALL contain a specific code
			CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);
			if (codeSystemConstraint != null) {
				String code = codeSystemConstraint.getCode();
				if (code != null) {
					return true;
				}
			}
		}

		return false;
	}
}
