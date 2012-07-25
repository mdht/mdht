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
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.validation.ConstraintProvider;
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
 * <li>{@link org.openhealthtools.mdht.uml.validation.Diagnostic#getTargets() <em>Get Targets</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.validation.Diagnostic#targets(org.eclipse.emf.ecore.EObject) <em>Targets</em>}</li>
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
	public static EList<EClass> getTargets(Diagnostic diagnostic) {
		List<EClass> result = new java.util.ArrayList<EClass>(3); // don't anticipate many targets
		Constraint constraint = diagnostic.getBase_Constraint();

		// maybe the constraint is owned by a stereotype, which is an implicit target
		if (constraint.getContext() instanceof Class) {
			EClass target = getEClass((Class) constraint.getContext());

			if (target != null) {
				result.add(target);
			}
		} else {
			// maybe the constraint explicitly references UML metaclasses as targets.
			// NOTE that it is impractical to support both a stereotype and UML metaclasses as targets
			// because, for example, the formulation of an OCL constraint would be quite different.
			// More importantly, we have to "cast" the base element as an instance of the applied
			// stereotype, and we have no way to know whether we need to do that if there are multiple
			// targets
			for (Element next : constraint.getConstrainedElements()) {
				if (next instanceof Class) {
					EClass target = getEClass((Class) next);

					if ((target != null) && !result.contains(target)) {
						result.add(target);
					}
				}
			}
		}

		return result.isEmpty()
				? ECollections.<EClass> emptyEList()
				: new BasicEList.UnmodifiableEList<EClass>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static boolean targets(Diagnostic diagnostic, EObject object) {
		boolean result = false;

		for (EClass next : diagnostic.getTargets()) {
			if (next.isInstance(object)) {
				result = true;
				break;
			}
		}

		return result;
	}

	private static EClass getEClass(Class class_) {
		EClass result = null;

		if (class_ instanceof Stereotype) {
			// the target is a stereotype, which generates an EClass
			Profile profile = (Profile) EcoreUtil.getRootContainer(class_);
			result = (EClass) profile.getDefinition(class_);
		} else {
			// the target is an UML metaclass, with a fixed known EClass
			result = (EClass) UMLPackage.eINSTANCE.getEClassifier(class_.getName());
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
