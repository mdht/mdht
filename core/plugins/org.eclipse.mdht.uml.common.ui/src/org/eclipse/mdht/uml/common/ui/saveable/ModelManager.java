/*******************************************************************************
 * Copyright (c) 2004, 2011 David A Carlson and others.
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
package org.eclipse.mdht.uml.common.ui.saveable;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ListenerList;
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
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.mdht.uml.common.ui.internal.Logger;
import org.eclipse.mdht.uml.common.ui.internal.l10n.Messages;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.Saveable;
import org.eclipse.uml2.uml.resource.UMLResource;

/**
 * Support for managing views and editors that implement ISaveablesSource.
 */
public class ModelManager {

	private static ModelManager Manager = new ModelManager();

	private ListenerList listeners = new ListenerList();

	private Map<URI, ModelDocument> uriToDocumentMap = new HashMap<URI, ModelDocument>();

	private List<Resource> changedResources = new Vector<Resource>();

	private List<Resource> removedResources = new Vector<Resource>();

	private List<Resource> savedResources = new Vector<Resource>();

	private Shell shell;

	public static ModelManager getManager() {
		return Manager;
	}

	private ModelManager() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(
			resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
	}

	private ResourceSetListener resourceLoadListener = new ResourceSetListenerImpl(
		NotificationFilter.RESOURCE_LOADED.or(NotificationFilter.RESOURCE_UNLOADED)) {
		@Override
		public void resourceSetChanged(ResourceSetChangeEvent event) {
			for (Notification notification : event.getNotifications()) {
				Resource resource = (Resource) notification.getNotifier();

				if (NotificationFilter.RESOURCE_LOADED.matches(notification) && isManageable(resource)) {
					manage(resource);
				} else if (NotificationFilter.RESOURCE_UNLOADED.matches(notification)) {
					ModelDocument modelDocument = uriToDocumentMap.get(resource.getURI());
					if (modelDocument != null) {
						// fire PRE_CLOSE
						// test if canceled

						// leave unloaded saveable in map for saveable lifecycle management
						// uriToDocumentMap.remove(resource.getURI());

						// fire POST_CLOSE
					}
				}
			}
		}
	};

	public void manage(TransactionalEditingDomain editingDomain) {
		editingDomain.addResourceSetListener(resourceLoadListener);

		for (Resource resource : editingDomain.getResourceSet().getResources()) {
			if (isManageable(resource) && uriToDocumentMap.get(resource.getURI()) == null) {
				manage(resource);
			}
		}
	}

	public boolean isManageable(Resource resource) {
		// manage only *.uml platform resources
		URI uri = resource.getURI();
		if (uri.isPlatformResource() && UMLResource.FILE_EXTENSION.equals(uri.fileExtension())) {
			// && ResourceUtil.isModifiable(resource)) {
			return true;
		}

		// excluded by selecting only platform resources
		// if ("pathmap".equals(resource.getURI().scheme())) {
		// return false;
		// }

		return false;
	}

	public ModelDocument manage(Resource resource) {
		ModelDocument saveable = getModelDocument(resource);
		if (saveable == null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(resource);
			saveable = new ModelDocument(resource, editingDomain);
			uriToDocumentMap.put(resource.getURI(), saveable);
		}

		return saveable;
	}

	public EditingDomain getEditingDomain(IFile file) {
		ModelDocument doc = getModelDocument(file);
		if (doc != null) {
			return doc.getEditingDomain();
		}

		return null;
	}

	public ModelDocument getModelDocument(Resource resource) {
		if (resource != null) {
			return uriToDocumentMap.get(resource.getURI());
		} else {
			return null;
		}
	}

	public ModelDocument getModelDocument(URI uri) {
		if (uri != null) {
			return uriToDocumentMap.get(uri);
		} else {
			return null;
		}
	}

	public ModelDocument getModelDocument(IFile file) {
		return uriToDocumentMap.get(URI.createPlatformResourceURI(file.getFullPath().toString(), true));
	}

	public Resource getResource(IFile file) {
		ModelDocument saveable = uriToDocumentMap.get(
			URI.createPlatformResourceURI(file.getFullPath().toString(), true));
		// if (saveable == null)
		// saveable = (ModelDocument) uriToDocumentMap.get(
		// URI.createURI(file.getFullPath().toString()));

		if (saveable != null) {
			return saveable.getResource();
		} else {
			return null;
		}
	}

	public void addPropertyChangeListener(IPropertyChangeListener listener) {
		listeners.add(listener);
	}

	public void removePropertyChangeListener(IPropertyChangeListener listener) {
		listeners.remove(listener);
	}

	public void firePropertyChange(Object source, String propertyName, Object oldValue, Object newValue) {
		if (!listeners.isEmpty()) {
			PropertyChangeEvent event = new PropertyChangeEvent(source, propertyName, oldValue, newValue);
			Object[] list = listeners.getListeners();
			for (int i = 0; i < list.length; i++) {
				IPropertyChangeListener l = (IPropertyChangeListener) list[i];
				l.propertyChange(event);
			}
		}
	}

	// public boolean isDirty(IFile file) {
	// EditingDomain domain = getEditingDomain(file);
	// if (domain == null)
	// return false;
	// BasicCommandStack stack = (BasicCommandStack) domain.getCommandStack();
	// return stack.isSaveNeeded();
	// }

	public boolean isDirty(Resource resource) {
		return resource.isModified();
	}

	/**
	 * Returns all open model documents.
	 *
	 * @return all open model documents
	 */
	public Collection<ModelDocument> getDocuments() {
		return uriToDocumentMap.values();
	}

	/**
	 * Returns all open model documents as Saveable array.
	 *
	 * @return all open model documents
	 */
	public Saveable[] getSaveables() {
		Collection<ModelDocument> saveables = uriToDocumentMap.values();
		Saveable[] array = new Saveable[saveables.size()];
		saveables.toArray(array);
		return array;
	}

	public void setShell(Shell shell) {
		this.shell = shell;
	}

	public Collection<Resource> getRemovedResources() {
		return removedResources;
	}

	public Collection<Resource> getChangedResources() {
		return changedResources;
	}

	public Collection<Resource> getSavedResources() {
		return savedResources;
	}

	/**
	 * This listens for workspace changes.
	 */
	protected IResourceChangeListener resourceChangeListener = new IResourceChangeListener() {

		public void resourceChanged(IResourceChangeEvent event) {
			removedResources.clear();
			changedResources.clear();

			IResourceDelta delta = event.getDelta();
			try {
				class ResourceDeltaVisitor implements IResourceDeltaVisitor {

					public boolean visit(IResourceDelta delta) {
						if (delta.getResource().getType() == IResource.FILE) {
							if (delta.getKind() == IResourceDelta.REMOVED ||
									delta.getKind() == IResourceDelta.CHANGED &&
											delta.getFlags() != IResourceDelta.MARKERS) {
								ModelDocument modelDocument = getModelDocument(
									URI.createPlatformResourceURI(delta.getFullPath().toString(), true));
								Resource resource = modelDocument != null
										? modelDocument.getResource()
										: null;
								if (resource != null) {
									if (delta.getKind() == IResourceDelta.REMOVED) {
										removedResources.add(resource);
									} else if (!savedResources.remove(resource)) {
										changedResources.add(resource);
									}
								}
							}
						}

						return true;
					}
				}

				final ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();
				delta.accept(visitor);

				if (!removedResources.isEmpty() && shell != null) {
					shell.getDisplay().asyncExec(new Runnable() {

						public void run() {
							for (ListIterator<Resource> resourceIterator = removedResources.listIterator(); resourceIterator.hasNext();) {
								Resource resource = resourceIterator.next();
								if (!isDirty(resource) || handleDirtyConflict(resource)) {
									// unload
									resourceIterator.remove();
									resource.unload();
								}
							}
						}
					});
				}

				if (!changedResources.isEmpty() && shell != null) {
					shell.getDisplay().asyncExec(new Runnable() {

						public void run() {
							for (Resource resource : changedResources) {
								// reload
								if (!isDirty(resource) || handleDirtyConflict(resource)) {
									resource.unload();

									try {
										// must mark as clean before load, to trigger saveable lifecycle update when changed
										ModelDocument modelDocument = getModelDocument(resource);
										if (modelDocument != null) {
											modelDocument.setDirty(false);
										}

										resource.load(Collections.EMPTY_MAP);

									} catch (IOException exception) {
										// if (!resourceToDiagnosticMap.containsKey(resource)) {
										// resourceToDiagnosticMap.put(resource,
										// analyzeResourceProblems(resource, exception));
										// }
									}
								}
							}
						}
					});
				}
			} catch (CoreException exception) {
				Logger.logException(exception);
			}
		}
	};

	/**
	 * Shows a dialog that asks if conflicting changes should be discarded.
	 */
	protected boolean handleDirtyConflict(Resource resource) {
		return MessageDialog.openQuestion(shell, Messages.FileConflict_label, Messages.FileConflictWarning);
	}

}
