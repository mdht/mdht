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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.openhealthtools.mdht.uml.validation.ConstraintProvider;
import org.openhealthtools.mdht.uml.validation.Diagnostic;
import org.openhealthtools.mdht.uml.validation.internal.provider.ValidationProfileUtil;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Constraint Provider</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.validation.ConstraintProvider#getDiagnostics() <em>Get Diagnostics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintProviderOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ConstraintProviderOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public static EList<Diagnostic> getDiagnostics(ConstraintProvider constraintProvider) {
		EList<Diagnostic> result = new BasicEList.FastCompare<Diagnostic>();

		Namespace namespace = constraintProvider.getBase_Namespace();
		if (namespace != null) {
			collectDiagnostics(result, namespace);
		}

		return (result.isEmpty())
				? ECollections.<Diagnostic> emptyEList()
				: ECollections.unmodifiableEList(result);
	}

	private static void collectDiagnostics(EList<Diagnostic> diagnostics, Namespace namespace) {
		for (Constraint next : namespace.getOwnedRules()) {
			Diagnostic diagnostic = ValidationProfileUtil.getDiagnostic(next);
			if (diagnostic != null) {
				diagnostics.add(diagnostic);
			}
		}

		for (NamedElement next : namespace.getOwnedMembers()) {
			if (next instanceof Namespace) {
				collectDiagnostics(diagnostics, (Namespace) next);
			}
		}
	}

} // ConstraintProviderOperations
