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
 * A pluggable hook for handling/transforming the DOM used by the {@link FleXMLResource} to load itself from whatever storage.
 * Specified as a load option when loading the resource.
 *
 * @see FleXMLResource#OPTION_DOM_DOCUMENT_HANDLER
 */
public interface DOMDocumentHandler {
	/**
	 * A call-back invoked before the DOM is processed to load the resource.
	 *
	 * @param document
	 *            the document that is about to be loaded
	 */
	void aboutToLoadDOM(Document document);

	/**
	 * A call-back invoked after the DOM is processed to load the resource.
	 *
	 * @param document
	 *            the document that has been loaded
	 */
	void afterDOMLoaded(Document document);
}
