/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package traceability.presentation;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IFileEditorInput;

/**
 * Makes the editor "Link With Editor"-capable
 */
public class ReuseURIEditorInputSupportingLinkWithEditor extends ReuseURIEditorInput implements IFileEditorInput {

	private IFile iFile;

	public ReuseURIEditorInputSupportingLinkWithEditor(Resource resource, IFile iFile) {
		super(resource);
		this.iFile = iFile;
	}

	@Override
	public IStorage getStorage() throws CoreException {
		return iFile;
	}

	@Override
	public IFile getFile() {
		return iFile;
	}
}
