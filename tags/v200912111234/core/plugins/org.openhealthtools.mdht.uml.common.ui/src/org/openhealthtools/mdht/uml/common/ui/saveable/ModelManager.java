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

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.Saveable;

/**
 * Support for managing views and editors that implement ISaveablesSource.
 */
public class ModelManager {

	private static ModelManager Manager = new ModelManager();

	private ListenerList listeners = new ListenerList();

	public static ModelManager getManager() {
		return Manager;
	}

	private Map uriToDocumentMap = new HashMap();

	private ResourceSetListener resourceLoadListener = new ResourceSetListenerImpl(
			NotificationFilter.RESOURCE_LOADED.or(NotificationFilter.RESOURCE_UNLOADED)) {
        public void resourceSetChanged(ResourceSetChangeEvent event) {
        	for (Iterator iter = event.getNotifications().iterator(); iter.hasNext();) {
				Notification notification = (Notification) iter.next();
				Resource resource = (Resource) notification.getNotifier();
				
				if (NotificationFilter.RESOURCE_LOADED.matches(notification)
						&& isManageable(resource)) {
					manage(resource);
				}
				else if (NotificationFilter.RESOURCE_UNLOADED.matches(notification)) {
					ModelDocument modelDocument = 
						(ModelDocument) uriToDocumentMap.get(resource.getURI());
					if (modelDocument != null) {
						// fire PRE_CLOSE
						// test if cancelled
						
						uriToDocumentMap.remove(resource.getURI());

						// fire POST_CLOSE
					}
				}
			}
		}
    };
    
    public void manage(TransactionalEditingDomain editingDomain) {
    	editingDomain.addResourceSetListener(resourceLoadListener);

    	for (Iterator iterator = editingDomain.getResourceSet().getResources().iterator(); iterator.hasNext();) {
			Resource resource = (Resource) iterator.next();
			if (isManageable(resource)
					&& uriToDocumentMap.get(resource.getURI()) == null) {
				manage(resource);
			}
		}
    }

    public boolean isManageable(Resource resource) {
		// manage only *.uml platform resources
		if (resource.getURI().isPlatformResource()
				&& resource.getURI().toString().endsWith(".uml")) {
//				&& ResourceUtil.isModifiable(resource)) {
			return true;
		}
		
		// excluded by selecting only platform resources
//		if ("pathmap".equals(resource.getURI().scheme())) {
//			return false;
//		}
    	
		return false;
    }
    
    public ModelDocument manage(Resource resource) {
		TransactionalEditingDomain editingDomain =  TransactionUtil.getEditingDomain(resource);
		ModelDocument saveable = new ModelDocument(resource, editingDomain);
		uriToDocumentMap.put(resource.getURI(), saveable);
		return saveable;
    }
    
	/**
	 * @param file
	 * @return
	 */
	public EditingDomain getEditingDomain(IFile file) {
		ModelDocument doc = getModelDocument(file);
		if (doc != null)
			return doc.getEditingDomain();
		
		return null;
	}

	/**
	 * @param resource
	 * @return
	 */
	public ModelDocument getModelDocument(Resource resource) {
		if (resource != null)
			return (ModelDocument) uriToDocumentMap.get(resource.getURI());
		else
			return null;
	}

	/**
	 * @param file
	 * @return
	 */
	public ModelDocument getModelDocument(IFile file) {
		return (ModelDocument) uriToDocumentMap.get(
				URI.createPlatformResourceURI(file.getFullPath().toString(), true));
	}

	/**
	 * @param file
	 * @return
	 */
	public Resource getResource(IFile file) {
		ModelDocument saveable = (ModelDocument) uriToDocumentMap.get(
				URI.createPlatformResourceURI(file.getFullPath().toString(), true));
//		if (saveable == null)
//			saveable = (ModelDocument) uriToDocumentMap.get(
//				URI.createURI(file.getFullPath().toString()));
		
		if (saveable != null)
			return saveable.getResource();
		else
			return null;
	}

	public void addPropertyChangeListener(IPropertyChangeListener listener) {
		listeners.add(listener);
	}

	public void removePropertyChangeListener(IPropertyChangeListener listener) {
		listeners.remove(listener);
	}

	public void firePropertyChange(Object source, String propertyName,
			Object oldValue, Object newValue) {
		if (!listeners.isEmpty()) {
			PropertyChangeEvent event = new PropertyChangeEvent(source,
					propertyName, oldValue, newValue);
			Object[] list = listeners.getListeners();
			for (int i = 0; i < list.length; i++) {
				IPropertyChangeListener l = (IPropertyChangeListener) list[i];
				l.propertyChange(event);
			}
		}
	}

	/**
	 * @param model
	 * @return
	 */
	public boolean isDirty(IFile file) {
		EditingDomain domain = getEditingDomain(file);
		if (domain == null)
			return false;
		BasicCommandStack stack = (BasicCommandStack) domain.getCommandStack();
		return stack.isSaveNeeded();
	}

	/**
	 * Returns all open model documents.
	 *  
	 * @return all open model documents
	 */
	public Collection getDocuments() {
		return uriToDocumentMap.values();
	}

	/**
	 * Returns all open model documents as Saveable array.
	 *  
	 * @return all open model documents
	 */
	public Saveable[] getSaveables() {
		Collection saveables = uriToDocumentMap.values();
		Saveable[] array = new Saveable[saveables.size()];
		saveables.toArray(array);
		return array;
	}

}
