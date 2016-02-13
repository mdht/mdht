/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.validation.provider;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.mdht.uml.validation.internal.ValidationPlugin;
import org.eclipse.uml2.common.util.UML2Util;

/**
 * A multiplexing constraint that delegates to <tt>validateXyz</tt> methods of the subclass according to the constraint ID, where <tt>xyz</tt> is the
 * last segment of the ID.
 */
public abstract class AbstractMultiConstraint extends AbstractModelConstraint {
	private final String validationMethodPrefix;

	private final Map<String, Method> validationMethods = new java.util.HashMap<String, Method>();

	public AbstractMultiConstraint() {
		this("validate");
	}

	public AbstractMultiConstraint(String validationMethodPrefix) {
		super();
		this.validationMethodPrefix = validationMethodPrefix;
	}

	/**
	 * Multiplexes on my constraint ID.
	 */
	@Override
	public IStatus validate(IValidationContext ctx) {
		IStatus result;

		try {
			result = (IStatus) getValidationMethod(ctx).invoke(this, ctx);
		} catch (Exception e) {
			final String id = ctx.getCurrentConstraintId();

			ValidationPlugin.INSTANCE.log(
				new Status(
					IStatus.ERROR, ValidationPlugin.INSTANCE.getSymbolicName(),
					"Invocation of validation method failed for constraint: " + id, e));

			// don't try it again
			validationMethods.put(id, getFailOnMissingValidationMethod());
			result = failOnMissingValidationMethod(ctx);
		}

		return result;
	}

	private Method getValidationMethod(IValidationContext ctx) {
		final String id = ctx.getCurrentConstraintId();

		Method result = validationMethods.get(id);
		if (result == null) {
			try {
				result = getClass().getMethod(getValidationMethodName(ctx), IValidationContext.class);
			} catch (Exception e) {
				ValidationPlugin.INSTANCE.log(new Status(
					IStatus.ERROR, ValidationPlugin.INSTANCE.getSymbolicName(),
					"Failed to look up validation method for constraint: " + id, e));

				result = getFailOnMissingValidationMethod();
			}

			validationMethods.put(id, result);
		}

		return result;
	}

	private String getValidationMethodName(IValidationContext ctx) {
		String constraintName = ctx.getCurrentConstraintId();
		int dot = constraintName.lastIndexOf('.');
		if (dot >= 0) {
			constraintName = constraintName.substring(dot + 1);
		}

		constraintName = UML2Util.getValidJavaIdentifier(constraintName);

		StringBuilder result = new StringBuilder();
		result.append(validationMethodPrefix);
		result.append(Character.toUpperCase(constraintName.charAt(0)));
		result.append(constraintName.substring(1));

		return result.toString();
	}

	private Method getFailOnMissingValidationMethod() {
		Method result;

		try {
			result = AbstractMultiConstraint.class.getDeclaredMethod(
				"failOnMissingValidationMethod", IValidationContext.class);
		} catch (Exception e) {
			throw new Error("Error accessing known method.", e);
		}

		return result;
	}

	public IStatus failOnMissingValidationMethod(IValidationContext ctx) {
		return ConstraintStatus.createStatus(
			ctx, ctx.getTarget(), Collections.<EObject> emptySet(), IStatus.ERROR, -1,
			"Validation method not found or invalid in {0}: {1}", getClass().getName(), getValidationMethodName(ctx));
	}
}
