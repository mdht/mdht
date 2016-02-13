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
package org.eclipse.mdht.uml.cda.transform;

import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.mdht.uml.transform.AbstractBaseModelReflection;
import org.eclipse.mdht.uml.transform.IBaseModelReflection;
import org.eclipse.mdht.uml.transform.ecore.IEcoreProfileReflection;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

/**
 * The CDA implementation of the {@link IBaseModelReflection} protocol.
 */
public class CDABaseModelReflection extends AbstractBaseModelReflection {
	private final CDAEcoreProfileReflection ecoreProfile = new CDAEcoreProfileReflection();

	public CDABaseModelReflection() {
		super();
	}

	@Override
	protected <T> T adapt(Class<T> adapterType) {
		T result;

		if (adapterType == IEcoreProfileReflection.class) {
			result = adapterType.cast(ecoreProfile);
		} else {
			result = super.adapt(adapterType);
		}

		return result;
	}

	@Override
	protected boolean isBaseModel(Element context, Package base) {
		// CDA is absolutely the base model, so the context is not interesting
		return CDAModelUtil.isCDAModel(base);
	}

	@Override
	protected boolean isDatatypesModel(Element context, Package datatypes) {
		// CDA is absolutely the base model, so the context is not interesting
		return CDAModelUtil.isDatatypeModel(datatypes);
	}

}
