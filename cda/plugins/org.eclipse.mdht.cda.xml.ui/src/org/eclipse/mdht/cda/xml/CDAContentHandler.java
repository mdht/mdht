/*******************************************************************************
 * Copyright (c) 2010 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.cda.xml;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.XMLContentDescriber;

public class CDAContentHandler extends XMLContentDescriber {

	@Override
	public int describe(InputStream input, IContentDescription description) throws IOException {
		return INDETERMINATE;
	}
}
