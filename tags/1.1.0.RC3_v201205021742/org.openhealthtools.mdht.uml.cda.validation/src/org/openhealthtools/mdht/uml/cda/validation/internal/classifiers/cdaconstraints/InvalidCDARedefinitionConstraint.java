package org.openhealthtools.mdht.uml.cda.validation.internal.classifiers.cdaconstraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.openhealthtools.mdht.uml.cda.validation.internal.CDAConstraint;
import org.openhealthtools.mdht.uml.cda.validation.internal.classifiers.Classes;

public class InvalidCDARedefinitionConstraint extends AbstractModelConstraint implements CDAConstraint {

	private static final String ID_INVALIDREDEFINITION = CLASSES_GROUP + "invalidRedefinition";

	public static void register() {
		Classes.registerConstraints(ID_INVALIDREDEFINITION, new InvalidCDARedefinitionConstraint());

	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		return null;
	}

}
