/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Christian W. Damus - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.ui.properties.sections;

import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;
import org.openhealthtools.mdht.uml.common.ui.util.Selections;

/**
 * Abstract superclass for property sections that can handle wrapper item providers by providing a read-only
 * view on the wrapped element.
 */
public abstract class WrapperAwareModelerPropertySection extends AbstractModelerPropertySection {

	private boolean inputIsWrapper;

	@Override
	protected boolean isReadOnly() {
		return super.isReadOnly() || inputIsWrapper;
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		ISelection unwrapped = Selections.unwrap(selection);
		inputIsWrapper = unwrapped != selection;

		super.setInput(part, unwrapped);
	}
}
