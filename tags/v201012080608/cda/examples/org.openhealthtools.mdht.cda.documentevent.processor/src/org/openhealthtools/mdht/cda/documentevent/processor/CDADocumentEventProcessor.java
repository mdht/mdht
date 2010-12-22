/*******************************************************************************
 * Copyright (c) 2010 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.cda.documentevent.processor;

/**
 * CDADocumentEventProcessor Definition of method used by Event registry to
 * process a document
 * 
 * @author Sean Muir
 */
public abstract class CDADocumentEventProcessor<T> {

	public abstract T ProcessCDADocumentEvent(T cdaDocumentInstance);

	public int getPriority() {
		return 0;
	};

}