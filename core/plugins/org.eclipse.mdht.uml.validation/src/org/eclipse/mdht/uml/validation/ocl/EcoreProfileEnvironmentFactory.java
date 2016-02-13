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
package org.eclipse.mdht.uml.validation.ocl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.uml.UMLEnvironment;
import org.eclipse.ocl.uml.UMLEnvironmentFactory;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.State;

/**
 * A factory of {@link EcoreProfileEnvironment}s.
 */
public class EcoreProfileEnvironmentFactory extends UMLEnvironmentFactory {

	public EcoreProfileEnvironmentFactory() {
		super();
	}

	public EcoreProfileEnvironmentFactory(ResourceSet rset) {
		super(rset);
	}

	public EcoreProfileEnvironmentFactory(Registry registry, ResourceSet rset) {
		super(registry, rset);
	}

	@Override
	public UMLEnvironment createEnvironment() {
		return new EcoreProfileEnvironment(this, getEPackageRegistry(), getResourceSet());
	}

	@Override
	public Environment<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> createEnvironment(
			Environment<Package, Classifier, Operation, Property, EnumerationLiteral, Parameter, State, CallOperationAction, SendSignalAction, Constraint, Class, EObject> parent) {

		return new EcoreProfileEnvironment(parent);
	}
}
