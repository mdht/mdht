/*******************************************************************************
 * Copyright (c) 2006, 2011 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - removing operation history listener upon disposal
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.navigator.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.IOperationHistoryListener;
import org.eclipse.core.commands.operations.OperationHistoryEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.transaction.DemultiplexingListener;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.emf.workspace.ResourceUndoContext;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.mdht.uml.common.ui.saveable.ModelDocument;
import org.eclipse.mdht.uml.common.ui.saveable.ModelManager;
import org.eclipse.mdht.uml.common.ui.util.IResourceConstants;
import org.eclipse.mdht.uml.ui.navigator.UMLAbstractNavigatorItem;
import org.eclipse.mdht.uml.ui.navigator.UMLDomainNavigatorItem;
import org.eclipse.mdht.uml.ui.navigator.internal.l10n.Messages;
import org.eclipse.mdht.uml.ui.navigator.internal.plugin.Logger;
import org.eclipse.mdht.uml.ui.navigator.internal.providers.NavigatorUMLItemProviderAdapterFactory;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.Saveable;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.eclipse.ui.navigator.SaveablesProvider;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;

public class UMLNavigatorContentProvider extends SaveablesProvider implements ICommonContentProvider, IAdaptable {

	private static final Object[] EMPTY_ARRAY = new Object[0];

	/** The source of content displayed in this navigator. */
	private TransactionalEditingDomain editingDomain;

	/** This is the one adapter factory used for providing views of the model. */
	private ComposedAdapterFactory adapterFactory;

	private AdapterFactoryContentProvider treeContentProvider;

	private StructuredViewer viewer;

	/** a flag indicating if this viewer got disposed */
	protected boolean disposed = false;

	/**
	 * model event listener
	 */
	protected DemultiplexingListener eventListener = new DemultiplexingListener(getFilter()) {

		@Override
		protected void handleNotification(TransactionalEditingDomain domain, Notification notification) {
			update(domain, notification);
		}
	};

	private IOperationHistoryListener historyListener = new IOperationHistoryListener() {
		public void historyNotification(final OperationHistoryEvent event) {
			if (event.getEventType() == OperationHistoryEvent.DONE ||
					event.getEventType() == OperationHistoryEvent.UNDONE ||
					event.getEventType() == OperationHistoryEvent.REDONE) {

				final Set<Resource> affectedResources = ResourceUndoContext.getAffectedResources(event.getOperation());

				if (!affectedResources.isEmpty()) {
					List<Saveable> saveables = new ArrayList<Saveable>();
					for (Resource resource : affectedResources) {
						Saveable saveable = ModelManager.getManager().getModelDocument(resource);
						if (saveable != null) {
							saveables.add(saveable);
						}
					}

					fireSaveablesDirtyChanged(saveables.toArray(new Saveable[] {}));

					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							if (!viewer.getControl().isDisposed()) {
								viewer.refresh();
							}
						}
					});

				}
			}
		}
	};

	/**
	 * Support for saveables.
	 * fire SaveablesLifecycleEvent from this ISaveablesSource
	 */
	private ResourceSetListener resourceLoadListener = new ResourceSetListenerImpl(
		NotificationFilter.RESOURCE_LOADED.or(NotificationFilter.RESOURCE_UNLOADED)) {
		@Override
		public void resourceSetChanged(ResourceSetChangeEvent event) {
			for (Notification notification : event.getNotifications()) {
				final Resource resource = (Resource) notification.getNotifier();
				final ModelDocument saveable = ModelManager.getManager().getModelDocument(resource);

				if (NotificationFilter.RESOURCE_LOADED.matches(notification)) {

					Display.getDefault().asyncExec(new Runnable() {
						public void run() {

							if (saveable != null) {
								if (ModelManager.getManager().getChangedResources().contains(resource)) {
									fireSaveablesDirtyChanged(new Saveable[] { saveable });
								} else {
									fireSaveablesOpened(new Saveable[] { saveable });
								}

								IFile file = saveable.getFile();
								if (file != null) {
									try {
										file.getParent().refreshLocal(
											IResource.DEPTH_INFINITE, new NullProgressMonitor());
									} catch (CoreException e) {
									}
									viewer.refresh(file, true);

									/*
									 * If used, causes ALL dependent models to be expanded and shown
									 */
									// expose the model contents in Project Explorer
									// List items = wrapItems(resource.getContents(), file);
									// IStructuredSelection selection = new StructuredSelection(items);
									// viewer.setSelection(selection, true);
								}
							}
						}
					});
				} else if (NotificationFilter.RESOURCE_UNLOADED.matches(notification)) {
					Display.getDefault().asyncExec(new Runnable() {
						public void run() {
							if (saveable != null) {
								if (!ModelManager.getManager().getChangedResources().contains(resource)) {
									fireSaveablesClosed(new Saveable[] { saveable });
								}
							}

							if (!viewer.getControl().isDisposed()) {
								viewer.refresh();
							}
						}
					});
				}
			}
		}
	};

	public UMLNavigatorContentProvider() {
		editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain(
			IResourceConstants.EDITING_DOMAIN_ID);

		if ((editingDomain instanceof AdapterFactoryEditingDomain) &&
				((AdapterFactoryEditingDomain) editingDomain).getResourceToReadOnlyMap() == null) {
			((AdapterFactoryEditingDomain) editingDomain).setResourceToReadOnlyMap(new Hashtable<Resource, Boolean>());
		}

		ModelManager.getManager().manage(editingDomain);

		// add support for .xmi files and legacy .uml2 files
		ResourceSet resourceSet = editingDomain.getResourceSet();
		Map<String, Object> extensionToFactoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		extensionToFactoryMap.put(UML22UMLResource.FILE_EXTENSION, UML22UMLResource.Factory.INSTANCE);
		extensionToFactoryMap.put(XMI2UMLResource.FILE_EXTENSION, XMI2UMLResource.Factory.INSTANCE);

		adapterFactory = createAdapterFactory();

		treeContentProvider = new AdapterFactoryContentProvider(adapterFactory);

		editingDomain.addResourceSetListener(getEventListener());
		editingDomain.addResourceSetListener(resourceLoadListener);

		getOperationHistory().addOperationHistoryListener(historyListener);

		try {
			loadUMLProfiles();
		} catch (Exception e) {
			// don't let missing profiles interfere with initialization
			Logger.logException(e);
		}
	}

	protected ComposedAdapterFactory createAdapterFactory() {
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new NavigatorUMLItemProviderAdapterFactory());
		return adapterFactory;
	}

	/**
	 * This is a both helper and hack.
	 *
	 * Preload datatypes so that they are available.
	 */
	protected void loadUMLProfiles() {
		ResourceSet resourceSet = editingDomain.getResourceSet();

		// TODO Need an extension point for UML library registration
		String umlLibURI = UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI;

		try {
			resourceSet.getResource(URI.createURI(umlLibURI), true);
		} catch (Exception e) {
			// ignore if missing
		}
	}

	private IOperationHistory getOperationHistory() {
		return ((IWorkspaceCommandStack) editingDomain.getCommandStack()).getOperationHistory();
	}

	@Override
	public void dispose() {
		adapterFactory.dispose();
		editingDomain.removeResourceSetListener(getEventListener());
		editingDomain.removeResourceSetListener(resourceLoadListener);

		getOperationHistory().removeOperationHistoryListener(historyListener);

		disposed = true;
	}

	/**
	 * @return Returns the disposed.
	 */
	protected boolean isDisposed() {
		return disposed;
	}

	public void inputChanged(final Viewer viewer, Object oldInput, Object newInput) {
		this.viewer = (StructuredViewer) viewer;

		ModelManager.getManager().setShell(viewer.getControl().getShell());

		// gets rid of '+' expansion icons on all unopened model files
		// only needed first time navigator is opened, but don't know where to put this...
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				if (!viewer.getControl().isDisposed()) {
					viewer.refresh();
				}
			}
		});
	}

	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			Resource resource = ModelManager.getManager().getResource((IFile) parentElement);
			if (resource != null) {
				List<UMLAbstractNavigatorItem> result = wrapModelElements(getResourceContents(resource), parentElement);
				return result.toArray();
			}
		} else if (parentElement instanceof UMLAbstractNavigatorItem) {
			UMLAbstractNavigatorItem abstractNavigatorItem = (UMLAbstractNavigatorItem) parentElement;

			if (abstractNavigatorItem instanceof UMLDomainNavigatorItem) {
				UMLDomainNavigatorItem navigatorItem = (UMLDomainNavigatorItem) abstractNavigatorItem;
				Object[] children = treeContentProvider.getChildren(navigatorItem.getEObject());
				return wrapItems(children, parentElement);

			} else if (abstractNavigatorItem instanceof UMLNavigatorGroup) {
				UMLNavigatorGroup group = (UMLNavigatorGroup) parentElement;
				return group.getChildren();
			}

		}
		return EMPTY_ARRAY;
	}

	private List<EObject> getResourceContents(Resource resource) {
		List<EObject> contents = new ArrayList<EObject>();
		// filter out stereotype applications
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof Element) {
				contents.add(eObject);
			}
		}
		return contents;
	}

	public Object getParent(Object element) {
		if (element instanceof UMLDomainNavigatorItem) {
			UMLDomainNavigatorItem abstractNavigatorItem = (UMLDomainNavigatorItem) element;

			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	public boolean hasChildren(Object element) {
		if (element instanceof IFile) {
			return ModelManager.getManager().getModelDocument((IFile) element) != null;
		} else {
			return getChildren(element).length > 0;
		}
	}

	public void init(ICommonContentExtensionSite aConfig) {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.navigator.SaveablesProvider#doInit()
	 */
	@Override
	protected void doInit() {
		super.doInit();
	}

	public void restoreState(IMemento aMemento) {
	}

	public void saveState(IMemento aMemento) {
	}

	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapter) {
		if (SaveablesProvider.class == adapter) {
			return this;
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.navigator.SaveablesProvider#getElements(org.eclipse.ui.Saveable)
	 */
	@Override
	public Object[] getElements(Saveable saveable) {
		// This method MUST return an object that is in the navigator tree,
		// returning Resource does not work.
		if (saveable instanceof ModelDocument) {
			IFile file = ((ModelDocument) saveable).getFile();
			if (file != null) {
				return new Object[] { file };
			}
		}
		return EMPTY_ARRAY;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.navigator.SaveablesProvider#getSaveable(java.lang.Object)
	 */
	@Override
	public Saveable getSaveable(Object element) {
		EObject eObject = null;
		if (element instanceof EObject) {
			eObject = (EObject) element;
		} else if (element instanceof IAdaptable) {
			eObject = ((IAdaptable) element).getAdapter(EObject.class);
		}

		ModelDocument saveable = null;
		if (eObject != null) {
			Resource resource = eObject.eResource();
			saveable = ModelManager.getManager().getModelDocument(resource);
		} else if (element instanceof Resource) {
			saveable = ModelManager.getManager().getModelDocument((Resource) element);
		}
		return saveable;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.navigator.SaveablesProvider#getSaveables()
	 */
	@Override
	public Saveable[] getSaveables() {
		// returns all writable resources
		Collection<ModelDocument> saveables = ModelManager.getManager().getDocuments();
		Saveable[] array = new Saveable[saveables.size()];
		saveables.toArray(array);
		return array;
	}

	private List<UMLAbstractNavigatorItem> wrapModelElements(List<EObject> items, Object parentElement) {
		List<UMLAbstractNavigatorItem> wrappedItems = new ArrayList<UMLAbstractNavigatorItem>();
		for (EObject item : items) {
			// this will omit stereotype applications when iterating over Resource
			if (item instanceof Element) {
				wrappedItems.add(new UMLDomainNavigatorItem(item, parentElement, treeContentProvider));
			}
		}
		return wrappedItems;
	}

	private UMLAbstractNavigatorItem[] wrapItems(Object[] items, Object parentElement) {
		List<UMLAbstractNavigatorItem> wrappedItems = new ArrayList<UMLAbstractNavigatorItem>();
		if (parentElement instanceof UMLDomainNavigatorItem &&
				((UMLDomainNavigatorItem) parentElement).getEObject() instanceof Package) {
			UMLNavigatorGroup group = getAssociations(
				(Package) ((UMLDomainNavigatorItem) parentElement).getEObject(), parentElement);
			if (group != null) {
				wrappedItems.add(group);
			}
		}
		for (int i = 0; i < items.length; i++) {
			if (items[i] instanceof Element && !(items[i] instanceof Association)) {
				wrappedItems.add(new UMLDomainNavigatorItem((Element) items[i], parentElement, treeContentProvider));
			}
		}
		return wrappedItems.toArray(new UMLAbstractNavigatorItem[wrappedItems.size()]);
	}

	private UMLNavigatorGroup getAssociations(Package umlPackage, Object parentElement) {
		UMLNavigatorGroup group = null;
		List<EObject> associations = new ArrayList<EObject>();
		for (NamedElement element : umlPackage.getOwnedMembers()) {
			if (element instanceof Association) {
				associations.add(element);
			}
		}
		if (!associations.isEmpty()) {
			group = new UMLNavigatorGroup(
				Messages.NavigatorGroupName_associations, "icons/associationsNavigatorGroup.gif", parentElement);
			group.addChildren(wrapModelElements(associations, group));
		}
		return group;
	}

	/**
	 * @return Returns the eventListener.
	 */
	protected DemultiplexingListener getEventListener() {
		return eventListener;
	}

	/**
	 * Subclasses overriding this method should remember to override {@link #update(TransactionalEditingDomain, Notification)} as required.
	 * The default implementation of {@link #update(TransactionalEditingDomain, Notification)} will only
	 * update if the notifier is an <code>EObject</code>.
	 *
	 * @return the filter for events used by my <code>eventListener</code>.
	 */
	public NotificationFilter getFilter() {
		// return NotificationFilter.createEventTypeFilter(Notification.SET).or(
		// NotificationFilter.createEventTypeFilter(Notification.UNSET)).and(
		// NotificationFilter.createNotifierTypeFilter(EObject.class));

		return NotificationFilter.NOT_TOUCH;
	}

	/**
	 * Update if necessary, upon receiving the model event. This event will only
	 * be processed when the receiver is visible (the default behavior is not to
	 * listen to the model events while not showing). Therefore it is safe to
	 * refresh the UI. Sublclasses, which will choose to override event
	 * listening behavior should take into account that the model events are
	 * sent all the time - regardless of the section visibility. Thus special
	 * care should be taken by the section that will choose to listen to such
	 * events all the time. Also, the default implementation of this method
	 * synchronizes on the GUI thread. The subclasses that overwrite it should
	 * do the same if they perform any GUI work (because events may be sent from
	 * a non-GUI thread).
	 *
	 * @see #aboutToBeShown()
	 * @see #aboutToBeHidden()
	 *
	 * @param notification
	 *            notification object
	 * @param element
	 *            element that has changed
	 */
	public void update(final Notification notification, final EObject element) {
		if (!isDisposed() && !isNotifierDeleted(notification)) {
			postUpdateRequest(new Runnable() {

				public void run() {
					if (!isDisposed() && !viewer.getControl().isDisposed() && !isNotifierDeleted(notification)) {
						try {
							if (element instanceof Element) {
								viewer.refresh(new UMLDomainNavigatorItem(element, null, treeContentProvider));
							} else {
								viewer.refresh(element);
							}
						} catch (SWTException e) {
							// ignore tree item widget disposed exception.
							// cannot find its source when some tree items are deleted
						}
					}

				}
			});
		}
	}

	/**
	 * Updates me if the notifier is an <code>EObject</code> by calling {@link #update(Notification, EObject)}. Does nothing otherwise.
	 * Subclasses should override this method if they need to update based on
	 * non-EObject notifiers.
	 *
	 * @param domain
	 *            the editing domain
	 * @param notification
	 *            the event notification
	 */
	protected void update(TransactionalEditingDomain domain, Notification notification) {

		Object notifier = notification.getNotifier();

		if (notifier instanceof EObject) {
			update(notification, (EObject) notifier);
		} else if (notifier instanceof Resource) {
			if (Resource.RESOURCE__IS_MODIFIED == notification.getFeatureID(null)) {
				// toggle the '*' dirty flag
				Saveable saveable = ModelManager.getManager().getModelDocument((Resource) notifier);
				if (saveable != null) {
					fireSaveablesDirtyChanged(new Saveable[] { saveable });
				}

				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						if (viewer != null && !viewer.getControl().isDisposed()) {
							viewer.refresh();
						}
					}
				});

			}
		}
	}

	/**
	 * Returns whether or not the notifier for a particular notification has been
	 * deleted from its parent.
	 *
	 * This is a fix for RATLC00535181. What happens is that during deletion of
	 * an element from the diagram, the element first deletes related elements
	 * which causes a modification of the element itself. When the modification occurs
	 * the event handling mechanism posts a request to the UI queue to refresh the UI.
	 * A race condition occurs where by the time the posted request runs, the element
	 * in question may or may not have already been deleted from its container. If
	 * the element has been deleted from its container, we should not refresh the
	 * property section.
	 *
	 * @param notification
	 * @return <code>true</code> if notification has been deleted from its parent, <code>false</code> otherwise
	 */
	protected boolean isNotifierDeleted(Notification notification) {
		if (!(notification.getNotifier() instanceof EObject)) {
			return false;
		}
		EObject obj = (EObject) notification.getNotifier();
		return obj.eResource() == null;
	}

	/**
	 * Execute request in the UI thread.
	 *
	 * @param updateRequest
	 *            -
	 *            runnable update code
	 */
	protected void postUpdateRequest(Runnable updateRequest) {
		Display.getDefault().syncExec(updateRequest);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.gmf.runtime.emf.core.edit.IDemuxedMListener#handleElementModifiedEvent(org.eclipse.emf.common.notify.Notification,
	 * org.eclipse.emf.ecore.EObject)
	 */
	public void handleElementModifiedEvent(final Notification notification, final EObject element) {
		update(notification, element);
	}

}
