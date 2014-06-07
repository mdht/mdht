/*******************************************************************************
 * Copyright (c) 2010, 2011 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.datatypes.builder;

import org.openhealthtools.mdht.uml.datatypes.builder.impl.PNBuilderImpl;

public class DatatypesBuilderFactory {

	public static PNBuilder createPNBuilder() {
		return new PNBuilderImpl();
	}

}
