/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhealthtools.mdht.transformation.ocl;

import java.lang.reflect.Method;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.ocl.expressions.OperationCallExp;

public class DomainSpecificOCLHandler<PK, C, O extends EModelElement, P, EL, PM, S, COA, SSA, CT, CLS, E> {

	protected OCLTransformation<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> trafo;

	public void setTransformation(OCLTransformation<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> oclTransformation) {
		this.trafo = oclTransformation;
	}

	public String transformDomainSpecific(OperationCallExp<C, O> op, String opName) {
		return null;
	}

	public String getTypeCheck(C clazz, String customSelfVariable) {
		return null;
	}

	public C getBaseType(C t) {
		return t;
	}

	public P getBaseProperty(P p) {
		return p;
	}

	public String getName(Object namedObject) {
		try {
			Method m = namedObject.getClass().getMethod("getName");
			return (String) m.invoke(namedObject);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public String getPropertyName(P p) {
		return getName(getBaseProperty(p));
	}
}
