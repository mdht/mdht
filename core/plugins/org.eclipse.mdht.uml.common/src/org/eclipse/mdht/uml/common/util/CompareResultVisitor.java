/*******************************************************************************
 * Copyright (c) 2014 Sean Muir, JKM Software LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.common.util;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;

public interface CompareResultVisitor {

	public abstract void startElement(NamedElement element);

	public abstract void addedElement(NamedElement owner, Element element);

	public abstract void deletedElement(NamedElement owner, Element element);

	public abstract void changedElement(NamedElement owner, Element originalElement, Element updatedElement);

	public abstract void endElement(NamedElement element);

}
