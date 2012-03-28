/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - generate query invariants for in-line associations (artf3100)
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.transform;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.ValueSpecification;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;

public class TransformConstraint extends TransformAbstract {
	private static final String VALIDATION_QUERY = "constraints.validation.query";

	private static boolean isQueryConstraint(Constraint constraint) {
		boolean inline = false;
		for (Comment comment : constraint.getOwnedComments()) {
			if (comment.getBody().startsWith("QUERY")) {
				inline = true;
				break;
			}
		}
		return inline;
	}

	public TransformConstraint(TransformerOptions options) {
		super(options);
	}

	@Override
	public Object caseConstraint(Constraint constraint) {
		// ignore generated templateId constraints
		if (constraint.getName() == null || constraint.getName().endsWith("TemplateId")) {
			return null;
		}

		// must get message before Analysis lang is removed
		String severity = CDAModelUtil.getValidationSeverity(constraint);
		String message = CDAModelUtil.getValidationMessage(constraint);

		// remove all spec languages other than the first OCL expression
		ValueSpecification spec = constraint.getSpecification();
		if (spec instanceof OpaqueExpression) {
			List<String> languages = new ArrayList<String>(((OpaqueExpression) spec).getLanguages());
			String oclBody = null;
			for (int i = 0; i < languages.size(); i++) {
				String lang = languages.get(i);
				if ("OCL".equals(lang)) {
					oclBody = ((OpaqueExpression) spec).getBodies().get(i);
					break;
				}
			}

			if (oclBody == null) {
				removeModelElement(constraint);
				return null;
			} else {
				((OpaqueExpression) spec).getLanguages().clear();
				((OpaqueExpression) spec).getBodies().clear();
				((OpaqueExpression) spec).getLanguages().add("OCL");
				((OpaqueExpression) spec).getBodies().add(oclBody);
			}
		}

		Class constrainedClass = null;
		if (constraint.getContext() instanceof Class) {
			constrainedClass = (Class) constraint.getContext();
		} else {
			return null;
		}

		String constraintName = normalizeConstraintName(constraint.getName());
		String constraintPrefix = createConstraintName(constrainedClass, null);
		if (!constraintName.startsWith(constraintPrefix)) {
			constraintName = constraintPrefix + constraintName;
		}
		constraint.setName(constraintName);

		if (isQueryConstraint(constraint)) {
			annotateQueryConstraint(constraint, constrainedClass);
		}

		if (SEVERITY_INFO.equals(severity)) {
			addValidationInfo(constrainedClass, constraint.getName(), message);
		} else if (SEVERITY_WARNING.equals(severity)) {
			addValidationWarning(constrainedClass, constraint.getName(), message);
		} else {
			addValidationError(constrainedClass, constraint.getName(), message);
		}

		return constraint;
	}

	static void annotateQueryConstraint(Constraint constraint, Class context) {
		AnnotationsUtil annotationsUtil = new AnnotationsUtil(context);
		annotationsUtil.addAnnotation(VALIDATION_QUERY, constraint.getName());
		annotationsUtil.saveAnnotations();
	}
}
