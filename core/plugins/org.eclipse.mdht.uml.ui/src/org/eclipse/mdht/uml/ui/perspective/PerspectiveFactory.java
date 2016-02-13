/*******************************************************************************
 * Copyright (c) 2010 Sean Muir.
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
package org.eclipse.mdht.uml.ui.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * PerspectiveFactory lays out the MDHT perspective - The layout consists of
 * Project Browser, Outline, and three views properties, problems, and tasks
 *
 * @author Sean Muir
 *
 */
public class PerspectiveFactory implements IPerspectiveFactory {

	/*
	 * ID_PROJECT_EXPLORER is defined in Eclipse 3.5 as part of IPageLayout but not defined
	 * as part of IPageLayout in Eclipse 3.4
	 * TODO Update to use IPageLayout for Eclipse 3.5 when we migrate
	 */
	private static final String ID_PROJECT_EXPLORER = "org.eclipse.ui.navigator.ProjectExplorer";

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui
	 * .IPageLayout)
	 */
	public void createInitialLayout(IPageLayout layout) {

		String editorArea = layout.getEditorArea();

		// Top left.
		IFolderLayout topLeft = layout.createFolder("topLeft", IPageLayout.LEFT, (float) 0.26, editorArea);
		topLeft.addView(ID_PROJECT_EXPLORER);

		// Bottom left.
		IFolderLayout bottomLeft = layout.createFolder("bottomLeft", IPageLayout.BOTTOM, (float) 0.50, "topLeft");
		bottomLeft.addView(IPageLayout.ID_OUTLINE);

		// Bottom right.
		IFolderLayout bottomRight = layout.createFolder("bottomRight", IPageLayout.BOTTOM, (float) 0.66, editorArea);
		bottomRight.addView(IPageLayout.ID_PROP_SHEET);
		bottomRight.addView(IPageLayout.ID_PROBLEM_VIEW);
		bottomRight.addView(IPageLayout.ID_TASK_LIST);

	}

}
