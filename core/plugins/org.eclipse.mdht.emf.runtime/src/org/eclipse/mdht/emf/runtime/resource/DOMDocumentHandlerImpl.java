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
package org.eclipse.mdht.emf.runtime.resource;

import org.w3c.dom.Document;

/**
 * Implementation of no-op hooks for DOM loading.
 */
public class DOMDocumentHandlerImpl implements DOMDocumentHandler {

	public DOMDocumentHandlerImpl() {
		super();
	}

	public void aboutToLoadDOM(Document document) {
		// pass
	}

	public void afterDOMLoaded(Document document) {
		// pass
	}

}
