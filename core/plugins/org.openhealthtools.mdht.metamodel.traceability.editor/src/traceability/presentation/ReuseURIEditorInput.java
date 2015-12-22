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
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * In contrast to the base class, this class stores the {@link ResourceSet} which includes a resource of the given {@link URI}. Thus, instead of loading the {@link URI} again in an editor, the editor can use the already-loaded resources in the here linked {@link ResourceSet}.
 */
public class ReuseURIEditorInput extends URIEditorInput {

	private ResourceSet resourceSet;

	public ReuseURIEditorInput(Resource resource) {
		super(resource.getURI());
		this.resourceSet = resource.getResourceSet();
	}

	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	public static URIEditorInput create(Resource resource) {
		String path = resource.getURI().toPlatformString(true);
		IResource workspaceResource = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(path));
		if (workspaceResource instanceof IFile) {
			IFile iFile = (IFile) workspaceResource;
			return new ReuseURIEditorInputSupportingLinkWithEditor(resource, iFile);
		}
		return new ReuseURIEditorInput(resource);
	}

}
