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
package org.eclipse.mdht.uml.common.ui.util;

import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;

/**
 * The selective part listener API that Eclipse UI should have provided.
 */
public abstract class PartAdapter implements IPartListener {

	public PartAdapter() {
		super();
	}

	public void partActivated(IWorkbenchPart part) {
		// pass
	}

	public void partBroughtToTop(IWorkbenchPart part) {
		// pass
	}

	public void partClosed(IWorkbenchPart part) {
		// pass
	}

	public void partDeactivated(IWorkbenchPart part) {
		// pass
	}

	public void partOpened(IWorkbenchPart part) {
		// pass
	}
}
