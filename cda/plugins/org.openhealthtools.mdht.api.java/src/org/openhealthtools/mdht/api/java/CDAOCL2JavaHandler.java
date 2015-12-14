/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhealthtools.mdht.api.java;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.uml2.uml.Class;
import org.openhealthtools.mdht.api.CDAOCLHandler;

public class CDAOCL2JavaHandler<PK, C, O extends EModelElement, P, EL, PM, S, COA, SSA, CT, CLS, E> extends CDAOCLHandler<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> {

	@Override
	public String getName(Object namedObject) {
		if (namedObject instanceof Class) {
			Class class1 = (Class) namedObject;
			if ("nehta".equals(class1.getNearestPackage().getName()))
				return "ns.electronichealth.net.au.extensions." + class1.getName();
		}
		return super.getName(namedObject);
	}

	@Override
	public String getPropertyName(P p) {
		String result = super.getPropertyName(p);
		if ("mixed".equals(result) || "part".equals(result))
			return "text";
		return result;
	}

	public String transformDomainSpecific(OperationCallExp<C, O> op, String opName) {
		if ("isNullFlavorUndefined".equals(opName) && "ON".equals(getName(op.getSource().getType()))) {
			return "true()";
		}
		return null;
	}
}
