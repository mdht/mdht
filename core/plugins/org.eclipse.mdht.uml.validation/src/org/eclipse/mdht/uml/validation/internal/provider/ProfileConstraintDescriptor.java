/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.validation.internal.provider;

import static org.eclipse.mdht.uml.validation.internal.provider.ValidationProfileUtil.nullSafeTrim;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.model.Category;
import org.eclipse.emf.validation.model.CategoryManager;
import org.eclipse.emf.validation.model.ConstraintSeverity;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.IParameterizedConstraintDescriptor;
import org.eclipse.mdht.uml.validation.ConstraintProvider;
import org.eclipse.mdht.uml.validation.Diagnostic;
import org.eclipse.mdht.uml.validation.EvaluationModeKind;
import org.eclipse.ocl.uml.UMLPackage;
import org.eclipse.osgi.util.NLS;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Descriptor of a constraint defined in a profile.
 */
public class ProfileConstraintDescriptor implements IParameterizedConstraintDescriptor {
	private static final String PARENT_CATEGORY_ID = "org.eclipse.mdht.uml.validation.profile";

	private final String bundleName;

	private final List<EClass> targets;

	private final String id;

	private final String name;

	private final EvaluationMode<?> evaluationMode;

	private final int code;

	private final ConstraintSeverity severity;

	private final String messagePattern;

	private final String language;

	private final String body;

	private Category category;

	private Throwable exception;

	public ProfileConstraintDescriptor(String bundleName, Diagnostic diagnostic) {
		final Constraint constraint = diagnostic.getBase_Constraint();

		this.bundleName = bundleName;
		this.targets = diagnostic.getTargets(); // TODO: Check non-empty pre-condition
		this.name = constraint.getQualifiedName();
		this.id = String.format("%s.profile.%s", bundleName, this.name.replace(NamedElement.SEPARATOR, "."));

		this.evaluationMode = (diagnostic.getEvaluationMode() == EvaluationModeKind.LIVE)
				? EvaluationMode.LIVE
				: EvaluationMode.BATCH;
		this.code = diagnostic.getCode(); // TODO: if !diagnostic.isSetCode() then compute one
		this.messagePattern = diagnostic.getMessage();

		// TODO: Check pre-conditions
		OpaqueExpression spec = (OpaqueExpression) constraint.getSpecification();
		this.language = spec.getLanguages().isEmpty()
				? "Java"
				: spec.getLanguages().get(0);
		this.body = spec.getBodies().isEmpty()
				? ""
				: spec.getBodies().get(0);

		switch (diagnostic.getSeverity()) {
			case INFORMATIONAL:
				this.severity = ConstraintSeverity.INFO;
				break;
			case WARNING:
				this.severity = ConstraintSeverity.WARNING;
				break;
			default:
				this.severity = ConstraintSeverity.ERROR;
				break;
		}

		// must create our category (if any) last because it uses our other fields
		ConstraintProvider provider = diagnostic.getConstraintProvider();
		if (provider != null) {
			List<Comment> ownedComments = provider.getBase_Namespace().getOwnedComments();
			Comment description = ownedComments.isEmpty()
					? null
					: ownedComments.get(0);
			this.category = createCategory(
				provider.getCategoryName(), provider.getCategoryID(), provider.getParentCategoryID(),
				(description == null)
						? null
						: description.getBody());
		}
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getPluginId() {
		return bundleName;
	}

	public String getDescription() {
		return "";
	}

	public boolean targetsTypeOf(EObject eObject) {
		boolean result = false;

		out: for (EClass next : targets) {
			if (isStereotype(next)) {
				if (eObject instanceof Element) {
					for (EObject application : ((Element) eObject).getStereotypeApplications()) {
						if (next.isInstance(application)) {
							result = true;
							break out;
						}
					}
				}
			} else if (next.isInstance(eObject)) {
				result = true;
				break out;
			}
		}

		return result;
	}

	private boolean isStereotype(EClass eClass) {
		// the only targets that we usually expect that are not UML metaclasses are stereotypes
		return (eClass.getEPackage() != UMLPackage.eINSTANCE) && (UMLUtil.getProfile(eClass.getEPackage()) != null);
	}

	public ConstraintSeverity getSeverity() {
		return severity;
	}

	public int getStatusCode() {
		return code;
	}

	public String getMessagePattern() {
		return messagePattern;
	}

	public String getLanguage() {
		return language;
	}

	public String getBody() {
		return body;
	}

	public String getParameterValue(String name) {
		String result = null;

		if (IParameterizedConstraintDescriptor.CLASS_PARAMETER.equals(name)) {
			// my body is the class name for Java constraints
			result = nullSafeTrim(getBody());
		} else if (IParameterizedConstraintDescriptor.BUNDLE_PARAMETER.equals(name)) {
			result = bundleName;
		}

		return result;
	}

	public EvaluationMode<?> getEvaluationMode() {
		return evaluationMode;
	}

	public boolean targetsEvent(Notification notification) {
		Object notifier = notification.getNotifier();
		return (notifier instanceof EObject) && targetsTypeOf((EObject) notifier);
	}

	public boolean isBatch() {
		return getEvaluationMode().isBatch();
	}

	public boolean isLive() {
		return getEvaluationMode().isLive();
	}

	public boolean isError() {
		return (exception != null);
	}

	public Throwable getException() {
		return exception;
	}

	public void setError(Throwable exception) {
		this.exception = exception;
	}

	public boolean isEnabled() {
		return !isError();
	}

	public void setEnabled(boolean enabled) {
		// cannot actively disable these constraints
	}

	public Set<Category> getCategories() {
		if (category == null) {
			// initialize it
			category = createCategory(null, null, null, null); // compute all defaults
		}

		return Collections.singleton(category);
	}

	private Category createCategory(String name, String id, String parentID, String description) {
		if (isNullOrEmpty(name)) {
			// use the profile name
			name = getName().substring(0, getName().indexOf(NamedElement.SEPARATOR));
		}
		if (isNullOrEmpty(id)) {
			// compute one based on the name
			id = String.format("%s.%s", getPluginId(), UML2Util.getValidJavaIdentifier(name));
		}
		if (isNullOrEmpty(parentID)) {
			parentID = PARENT_CATEGORY_ID;
		}
		if (isNullOrEmpty(description)) {
			description = NLS.bind("Constraints defined in the {0} profile.", name);
		}

		Category result = CategoryManager.getInstance().getCategory(
			CategoryManager.getInstance().getCategory(parentID), id);

		result.setMandatory(true); // TODO: Should it be mandatory?
		result.setName(name);
		result.setDescription(description);

		return result;
	}

	private static boolean isNullOrEmpty(String s) {
		return (s == null) || (s.trim().length() == 0);
	}

	public void addCategory(Category category) {
		// can't change categories
	}

	public void removeCategory(Category category) {
		// can't change categories
	}
}
