/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - discriminate multiple property constraints (artf3185)
 *                        - factor out CDA base model dependencies (artf3350)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.transform;

import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.cda.core.util.CDAModelConsolidator;
import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
import org.eclipse.mdht.uml.transform.IBaseModelReflection;
import org.eclipse.mdht.uml.transform.TransformerOptions;
import org.eclipse.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationSeverityKind;
import org.eclipse.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationStereotypeKind;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;

public class GenDomainProperty extends TransformFacade {
	private GenMethodHelper methodHelper;

	public GenDomainProperty(TransformerOptions options, CDAModelConsolidator consolidator,
			IBaseModelReflection baseModelReflection) {
		super(options, consolidator, baseModelReflection);
		this.methodHelper = new GenMethodHelper(transformerOptions);
	}

	@Override
	public Object caseProperty(Property property) {
		addProperty(property, property.getClass_());

		return property;
	}

	public void addProperty(Property property, Class ownerClass) {
		if (isRemoved(property)) {
			return;
		}

		// only process properties that are owned by a Class
		if (property.getClass_() == null) {
			return;
		}

		// prohibited properties have upper bound 0
		if (property.getUpper() == 0) {
			return;
		}

		// if greenCDA style interfaces, omit all operations for fixed values
		if (isFixedValue(property) && !transformerOptions.isIncludeFixedValueGetters()) {
			return;
		}

		// TODO omit classCode, moodCode for now due to incompatible enum types with CDA base model
		// also, most or all class/mood codes should be defaulted in greenCDA
		if (property.getType() instanceof Enumeration) {
			return;
		}

		// create domain interface for every class that is not CDA or Datatype
		// check if a more specialized type exists in domain model
		Classifier domainInterface = getDomainInterface(ownerClass);
		Classifier domainType = null;
		if (UMLUtil.isSameModel(property.getType(), ownerClass)) {
			domainType = getDomainInterface(property.getType());
		} else if (!CDAModelUtil.isCDAModel(property.getType()) && !CDAModelUtil.isDatatypeModel(property.getType())) {
			domainType = getDomainInterface(property.getType());
		} else {
			domainType = (Classifier) property.getType();
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
	}

	private boolean isFixedValue(Property property) {
		if (property.isReadOnly()) {
			return true;
		} else if (getEcoreProfile().getValidationSeverity(
			property, ValidationStereotypeKind.CODE_SYSTEM) == ValidationSeverityKind.ERROR) {
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
