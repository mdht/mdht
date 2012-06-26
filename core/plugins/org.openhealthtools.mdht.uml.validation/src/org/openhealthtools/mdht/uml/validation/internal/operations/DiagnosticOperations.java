/**
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 */
package org.openhealthtools.mdht.uml.validation.internal.operations;

import java.util.Collections;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.validation.IValidationContext;
import org.openhealthtools.mdht.uml.validation.ConstraintProvider;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.validation.Diagnostic;
import org.openhealthtools.mdht.uml.validation.internal.provider.ValidationProfileUtil;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Diagnostic</b></em>' model objects.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.validation.Diagnostic#fail(org.eclipse.emf.validation.IValidationContext, org.eclipse.emf.ecore.EObject)
 * <em>Fail</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.validation.Diagnostic#fail(org.eclipse.emf.validation.IValidationContext, org.eclipse.emf.ecore.EObject, org.eclipse.emf.common.util.EList)
 * <em>Fail</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.validation.Diagnostic#getTarget() <em>Get Target</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.validation.Diagnostic#getConstraintProvider() <em>Get Constraint Provider</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DiagnosticOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DiagnosticOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static IStatus fail(Diagnostic diagnostic, IValidationContext context, EObject target) {
		return ConstraintStatus.createStatus(
			context, target, Collections.<EObject> emptyList(), getMessage(diagnostic), target,
			diagnostic.getBase_Constraint().getName());
	}

	protected static String getMessage(Diagnostic diagnostic) {
		String result = diagnostic.getMessage();

		if ((result == null) || (result.length() == 0)) {
			result = "Constraint ''{1}'' violated by ''{0}''";
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static IStatus fail(Diagnostic diagnostic, IValidationContext context, EObject target, EList<EObject> related) {
		return ConstraintStatus.createStatus(
			context, target, related, getMessage(diagnostic), target, diagnostic.getBase_Constraint().getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static EClass getTarget(Diagnostic diagnostic) {
		EClass result = null;
		Constraint constraint = diagnostic.getBase_Constraint();

		Class targetClass = (Class) EcoreUtil.getObjectByType(
			constraint.getConstrainedElements(), UMLPackage.Literals.CLASS);
		if (targetClass == null) {
			// maybe it's owned by a stereotype
			if (constraint.getContext() instanceof Class) {
				targetClass = (Class) constraint.getContext();
				Profile profile = (Profile) EcoreUtil.getRootContainer(targetClass);
				result = (EClass) profile.getDefinition(targetClass);
			}
		}

		if (result == null) {
			if (targetClass == null) {
				// TODO: Log
			} else {
				// the target is an UML metaclass
				result = (EClass) UMLPackage.eINSTANCE.getEClassifier(targetClass.getName());
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static ConstraintProvider getConstraintProvider(Diagnostic diagnostic) {
		ConstraintProvider result = null;

		for (Package p = diagnostic.getBase_Constraint().getNearestPackage(); (result == null) && (p != null); p = p.getNestingPackage()) {
			result = ValidationProfileUtil.getConstraintProvider(p);
		}

		return result;
	}

} // DiagnosticOperations
