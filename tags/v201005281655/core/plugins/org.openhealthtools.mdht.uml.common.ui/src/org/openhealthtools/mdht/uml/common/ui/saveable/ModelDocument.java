/*******************************************************************************
 * Copyright (c) 2004, 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.common.ui.saveable;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.Saveable;
import org.openhealthtools.mdht.uml.common.ui.internal.Logger;
import org.openhealthtools.mdht.uml.common.ui.internal.l10n.Messages;

public class ModelDocument extends Saveable {
	
	private Resource resource;
	private TransactionalEditingDomain editingDomain;
	private boolean dirty = false;
	private ResourceSetListenerImpl domainDirtyListener;
	
	public ModelDocument(final Resource resource, final TransactionalEditingDomain domain) {
		this.resource = resource;
		this.editingDomain = domain;
		Assert.isNotNull(resource);

		domainDirtyListener = new ResourceSetListenerImpl(NotificationFilter.NOT_TOUCH) {
		        public void resourceSetChanged(ResourceSetChangeEvent event) {
		        	for (Notification notification : event.getNotifications()) {
						if (notification.getNotifier() instanceof EObject
								&& resource == ((EObject)notification.getNotifier()).eResource()) {
							dirty = true;
						}
					}
		        }
		    };
		editingDomain.addResourceSetListener(domainDirtyListener);
		
	}

	public TransactionalEditingDomain getEditingDomain() {
		return editingDomain;
	}

	public Resource getResource() {
		return resource;
	}

	public void doSave(IProgressMonitor monitor) throws CoreException {
		monitor.beginTask(Messages.ModelSave_task, 1);

		// must set this before saving, because view updates are triggered by save 
		dirty = false;
		
		saveResource(monitor);
		resource.setModified(false);
		monitor.done();
	}

	public void doClose(IProgressMonitor monitor) throws CoreException {
		monitor.beginTask(Messages.ModelClose_task, 1);

		resource.setModified(false);
		dirty = false;
		
		closeResource(monitor);
		monitor.done();
	}

	public boolean equals(Object object) {
		if (object != null && object instanceof ModelDocument)
			return resource.equals(((ModelDocument)object).resource);
		else
			return false;
	}

	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	public String getName() {
		return resource.getURI().lastSegment();
	}

	public String getToolTipText() {
        return resource.getURI().toString();
	}

	public int hashCode() {
		return resource.hashCode();
	}

	public boolean isDirty() {
		return dirty;
	}
	
	/* package */ void setDirty(boolean dirty) {
		this.dirty = dirty;
		resource.setModified(dirty);
	}

	public IFile getFile() {
		if (resource != null) {
			IResource iResource = getIResource(resource);
			if (iResource instanceof IFile)
				return (IFile) iResource;
		}
		
		return null;
	}

	/**
	 * Returns the <code>IResource</code> that contains the given EMF
	 * resource.
	 * 
	 * @param resource
	 *            the EMF resource
	 * @return the <code>IResource</code> that contains the EMF resource, or
	 *         <code>null</code>
	 */
	private IResource getIResource(Resource resource) {
		if (resource != null) {
			URI uri = resource.getURI();
			if (uri != null) {
				if (uri.isPlatformResource()) {
					IPath path = new Path(URI.decode(uri.path()));
					return ResourcesPlugin.getWorkspace().getRoot().findMember(
							path.removeFirstSegments(1));
				}
				else {
					return ResourcesPlugin.getWorkspace().getRoot().findMember(
							uri.toString());
				}
			}
		}
		return null;
	}

	private void saveResource(IProgressMonitor monitor) {
		try {
			ModelManager.getManager().getSavedResources().add(resource);
			resource.save(Collections.EMPTY_MAP);
			
		} catch (IOException e) {
			Logger.logException(e);
		}
	}

	private void closeResource(IProgressMonitor monitor) {
		// remove from changed resources, if present
		ModelManager.getManager().getChangedResources().remove(resource);
		
		resource.unload();
	}

}
