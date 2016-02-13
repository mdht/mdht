/*******************************************************************************
 * Copyright (c) 2006, 2012, 2014 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - Async runnable flood causes drag-and-drop issues (artf3182)
 *                        - Editors leaking via operation-history listeners (artf3225)
 *                        - Two menus appear when right-clicking the cursor (artf3276)
 *     Sean Muir (National E-Health Transition Authority (NEHTA)) - Added Path map support to Table Editor
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.editors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.IOperationHistoryListener;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.commands.operations.OperationHistoryEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.ViewerPane;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeViewerListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeExpansionEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.eclipse.mdht.uml.common.ui.saveable.ModelDocument;
import org.eclipse.mdht.uml.common.ui.saveable.ModelManager;
import org.eclipse.mdht.uml.common.ui.search.PropertyTypeFilter;
import org.eclipse.mdht.uml.common.ui.search.StereotypePropertyTypeFilter;
import org.eclipse.mdht.uml.common.ui.util.AdapterFactoryCellModifier;
import org.eclipse.mdht.uml.common.ui.util.ComboBoxTextCellEditor;
import org.eclipse.mdht.uml.common.ui.util.IResourceConstants;
import org.eclipse.mdht.uml.common.ui.util.TreeCursor;
import org.eclipse.mdht.uml.common.util.NamedElementComparator;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.edit.IUMLTableProperties;
import org.eclipse.mdht.uml.edit.provider.SimpleListNotifier;
import org.eclipse.mdht.uml.edit.provider.UML2ExtendedAdapterFactory;
import org.eclipse.mdht.uml.edit.reflection.ExtendedReflectiveItemProviderAdapterFactory;
import org.eclipse.mdht.uml.ui.internal.UML2UIPlugin;
import org.eclipse.mdht.uml.ui.internal.l10n.UML2UIMessages;
import org.eclipse.mdht.uml.ui.navigator.DecoratorAdapterFactoryLabelProvider;
import org.eclipse.mdht.uml.ui.navigator.UMLDomainNavigatorItem;
import org.eclipse.mdht.uml.ui.navigator.actions.EditCommandsFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.MenuDetectEvent;
import org.eclipse.swt.events.MenuDetectListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.ISaveablesLifecycleListener;
import org.eclipse.ui.ISaveablesSource;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.Saveable;
import org.eclipse.ui.SaveablesLifecycleEvent;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.navigator.ICommonMenuConstants;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.util.UMLSwitch;

/**
 *
 * @version $Id: $
 */
public class UMLTableEditor extends EditorPart
		implements IEditingDomainProvider, IMenuListener, ISelectionChangedListener, ISetSelectionTarget, IGotoMarker,
		ITabbedPropertySheetPageContributor, ISaveablesSource {

	public static final String EDITOR_ID = "org.eclipse.mdht.uml.ui.UMLTableEditorID";

	private TransactionalEditingDomain editingDomain;

	private IStructuredSelection viewSelection = null;

	private Resource resource = null;

	private ResourceSetListener dirtyResourceListener = null;

	private ResourceSetListener resourceLoadListener = null;

	/** This editor's property sheet page. */
	protected TabbedPropertySheetPage propertySheetPage;

	private EditCommandsFactory editCommandsFactory = new EditCommandsFactory();

	/** This is the one adapter factory used for providing views of the model. */
	private ComposedAdapterFactory adapterFactory;

	private AdapterFactoryContentProvider adapterFactoryContentProvider;

	private ILabelProvider adapterFactoryLabelProvider;

	private ViewerPane viewerPane;

	private TreeViewer treeViewerWithColumns;

	private TreeCursor cursor;

	/**
	 * This view's selection provider.
	 */
	private class SelectionProvider implements ISelectionProvider {

		/** The selection changed listeners. */
		private ListenerList fListeners = new ListenerList();

		/** The widget. */
		private Control fControl;

		/**
		 * Creates a new selection provider.
		 *
		 * @param control
		 *            the widget
		 */
		public SelectionProvider(Control control) {
			Assert.isNotNull(control);
			fControl = control;
			if (fControl instanceof Tree) {
				((Tree) fControl).addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						fireSelectionChanged();
					}
				});
			}
		}

		/**
		 * Sends a selection changed event to all listeners.
		 */
		public void fireSelectionChanged() {
			ISelection selection = getSelection();
			SelectionChangedEvent event = new SelectionChangedEvent(this, selection);
			Object[] selectionChangedListeners = fListeners.getListeners();
			for (int i = 0; i < selectionChangedListeners.length; i++) {
				((ISelectionChangedListener) selectionChangedListeners[i]).selectionChanged(event);
			}
		}

		public void addSelectionChangedListener(ISelectionChangedListener listener) {
			fListeners.add(listener);
		}

		public ISelection getSelection() {
			if (fControl.isDisposed()) {
				setDefaultSelection();
			}

			if (fControl instanceof Tree) {
				TreeItem[] selection = ((Tree) fControl).getSelection();
				Object[] values = new Object[selection.length];
				for (int i = 0; i < values.length; i++) {
					if (selection[i].getData() instanceof EObject) {
						values[i] = new UMLDomainNavigatorItem(
							(EObject) selection[i].getData(), null, adapterFactoryContentProvider);
						// values[i] = selection[i].getData();
					} else {
						values[i] = selection[i].getData();
					}
				}
				return new StructuredSelection(values);
			} else {
				return StructuredSelection.EMPTY;
			}
		}

		public void removeSelectionChangedListener(ISelectionChangedListener listener) {
			fListeners.remove(listener);
		}

		@SuppressWarnings("unchecked")
		public void setSelection(ISelection selection) {
			SimpleListNotifier rootList = new SimpleListNotifier();
			rootList.getMembers().addAll(((IStructuredSelection) selection).toList());
			treeViewerWithColumns.setInput(rootList);

			fireSelectionChanged();
		}
	}

	private IOperationHistoryListener historyListener = new IOperationHistoryListener() {
		public void historyNotification(final OperationHistoryEvent event) {
			if (event.getEventType() == OperationHistoryEvent.DONE ||
					event.getEventType() == OperationHistoryEvent.UNDONE ||
					event.getEventType() == OperationHistoryEvent.REDONE) {

				// TODO only if affectedResources includes at least one of this editor's saveables
				ISaveablesLifecycleListener saveablesListener = getEditorSite().getService(
					ISaveablesLifecycleListener.class);
				if (saveablesListener != null) {
					saveablesListener.handleLifecycleEvent(
						new SaveablesLifecycleEvent(UMLTableEditor.this, PROP_DIRTY, getSaveables(), false));
				}

				getSite().getShell().getDisplay().syncExec(new Runnable() {
					public void run() {
						// refresh the table, primarily for Delete
						refresh();

						// TODO this fires even if change did not originate
						// in this editor
						if (propertySheetPage != null) {
							propertySheetPage.refresh();
						}

						// after delete, undo, redo, etc, the cursor canvas
						// may be over incorrect TreeItem. Redraw to be sure
						// they are in synch.
						if (cursor != null && !cursor.isDisposed()) {
							cursor.redraw();
						}
					}
				});
			}
		}
	};

	/**
	 * This listens for when the related parts become active
	 */
	protected IPartListener partListener = new IPartListener() {
		public void partActivated(IWorkbenchPart p) {
			if (p instanceof ContentOutline) {
				// if (((ContentOutline)p).getCurrentPage() == contentOutlinePage) {
				// getActionBarContributor().setActiveEditor(UMLTableEditor.this);
				//
				// setCurrentViewer(contentOutlineViewer);
				// }
			} else if (p instanceof PropertySheet) {
				if (((PropertySheet) p).getCurrentPage() == propertySheetPage) {
					getActionBarContributor().setActiveEditor(UMLTableEditor.this);
					handleActivate();
				}
			} else if (p == UMLTableEditor.this) {
				editCommandsFactory.setActivePart(UMLTableEditor.this);
				handleActivate();
			}
		}

		public void partBroughtToTop(IWorkbenchPart p) {
		}

		public void partClosed(IWorkbenchPart p) {
		}

		public void partDeactivated(IWorkbenchPart p) {
			if (p == UMLTableEditor.this) {
				editCommandsFactory.setActivePart(null);
			}
		}

		public void partOpened(IWorkbenchPart p) {
		}
	};

	/**
	 * This listens for workspace changes.
	 */
	protected IResourceChangeListener resourceChangeListener = new IResourceChangeListener() {

		public void resourceChanged(IResourceChangeEvent event) {
			if (ModelManager.getManager().getChangedResources().contains(resource)) {
				getSite().getShell().getDisplay().asyncExec(new Runnable() {

					public void run() {
						if (getSite().getPage().getActiveEditor() == UMLTableEditor.this) {
							handleActivate();
						}
					}
				});
			}
		}
	};

	/**
	 * Handles activation of the editor or it's associated views.
	 */
	protected void handleActivate() {
		// Recompute the read only state.
		//
		if ((editingDomain instanceof AdapterFactoryEditingDomain) &&
				((AdapterFactoryEditingDomain) editingDomain).getResourceToReadOnlyMap() != null) {

			((AdapterFactoryEditingDomain) editingDomain).getResourceToReadOnlyMap().clear();
		}

		Collection<Resource> changedResources = ModelManager.getManager().getChangedResources();
		if (changedResources.contains(resource)) {
			handleChangedResources();
		} else {
			for (Resource controlledResource : UMLUtil.getControlledResources(resource)) {
				if (changedResources.contains(controlledResource)) {
					handleChangedResources();
					break;
				}
			}
		}
	}

	/**
	 * Handles what to do with changed resources on activation.
	 */
	protected void handleChangedResources() {
		if (!isDirty()) {
			treeViewerWithColumns.refresh();
			setDefaultSelection();

			if (AdapterFactoryEditingDomain.isStale(getSite().getSelectionProvider().getSelection())) {
				getSite().getSelectionProvider().setSelection(StructuredSelection.EMPTY);
			}
		}
	}

	void refresh() {
		// get current selection, which may update for deleted objects
		getSite().getSelectionProvider().getSelection();

		treeViewerWithColumns.refresh();
	}

	public UMLTableEditor() {
		super();

		editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain(
			IResourceConstants.EDITING_DOMAIN_ID);

		if ((editingDomain instanceof AdapterFactoryEditingDomain) &&
				((AdapterFactoryEditingDomain) editingDomain).getResourceToReadOnlyMap() == null) {
			((AdapterFactoryEditingDomain) editingDomain).setResourceToReadOnlyMap(new Hashtable<Resource, Boolean>());
		}

		ModelManager.getManager().manage(editingDomain);

		adapterFactory = new TableEditorComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new UML2ExtendedAdapterFactory());
		adapterFactory.addAdapterFactory(new ExtendedReflectiveItemProviderAdapterFactory());

		adapterFactoryContentProvider = new AdapterFactoryContentProvider(adapterFactory);
		adapterFactoryLabelProvider = new DecoratorAdapterFactoryLabelProvider(adapterFactory);

		getOperationHistory().addOperationHistoryListener(historyListener);

		org.eclipse.mdht.uml.common.UmlPlugin.computeModelPathMapExtensions();

		editingDomain.getResourceSet().getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(false));

		ResourcesPlugin.getWorkspace().addResourceChangeListener(
			resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
	}

	/**
	 * This returns the editing domain as required by the {@link IEditingDomainProvider} interface.
	 * This is important for implementing the static methods of {@link AdapterFactoryEditingDomain} and for supporting
	 * {@link org.eclipse.emf.edit.ui.action.CommandAction}.
	 */
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	public Element getSelectedElement() {
		Element element = null;
		ISelection selection = getSite().getSelectionProvider().getSelection();

		if (((IStructuredSelection) selection).size() == 1) {
			Object firstElement = ((IStructuredSelection) selection).getFirstElement();
			if (firstElement instanceof UMLDomainNavigatorItem) {
				firstElement = ((UMLDomainNavigatorItem) firstElement).getEObject();
			}
			if (firstElement instanceof Element) {
				element = (Element) firstElement;
			}
		}

		return element;
	}

	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	private IOperationHistory getOperationHistory() {
		return ((IWorkspaceCommandStack) editingDomain.getCommandStack()).getOperationHistory();
	}

	public IUndoContext getUndoContext() {
		return ((IWorkspaceCommandStack) getEditingDomain().getCommandStack()).getDefaultUndoContext();
	}

	public UMLTableActionBarContributor getActionBarContributor() {
		return (UMLTableActionBarContributor) getEditorSite().getActionBarContributor();
	}

	public IActionBars getActionBars() {
		return getActionBarContributor().getActionBars();
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		setInputWithNotify(input);
		setPartName(input.getName());
		site.getPage().addPartListener(partListener);
		// ResourcesPlugin.getWorkspace().addResourceChangeListener(
		// resourceChangeListener, IResourceChangeEvent.POST_CHANGE);

		editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain(
			IResourceConstants.EDITING_DOMAIN_ID);
		ModelManager.getManager().manage(editingDomain);
		ModelManager.getManager().setShell(getSite().getShell());

		if (input instanceof IFileEditorInput) {
			IFile file = ((IFileEditorInput) input).getFile();
			URI resourceURI = URI.createPlatformResourceURI(file.getFullPath().toString(), false);

			try {
				resource = editingDomain.getResourceSet().getResource(resourceURI, true);
				setDefaultSelection();

			} catch (Exception e) {
				// TODO display errors, see sample UMLEditor init()
				resource = editingDomain.getResourceSet().getResource(resourceURI, false);
				setDefaultSelection();
			}
		}

		resourceLoadListener = new ResourceSetListenerImpl(NotificationFilter.RESOURCE_UNLOADED) {
			@Override
			public void resourceSetChanged(ResourceSetChangeEvent event) {
				// close this editor if its resource is unloaded
				for (Notification notification : event.getNotifications()) {
					final Resource resource = (Resource) notification.getNotifier();

					// skip changed files that are unloaded and reloaded
					if (!ModelManager.getManager().getChangedResources().contains(resource)) {
						if (resource.getURI().isPlatform() &&
								UMLTableEditor.this.resource.getURI().equals(resource.getURI())) {
							getSite().getShell().getDisplay().asyncExec(new Runnable() {
								public void run() {
									getSite().getPage().closeEditor(UMLTableEditor.this, false);
								}
							});
						}
					}
				}
			}
		};
		editingDomain.addResourceSetListener(resourceLoadListener);

		// we're only dirty if some non-touch event occurred that isn't compatible with read-only transactions.
		// For example, loading a resource doesn't make the editor dirty, but it isn't a touch on the resource-set.
		// Normally, saving a resource, though, is a read-compatible event, so allow that
		dirtyResourceListener = new ResourceSetListenerImpl(
			NotificationFilter.NOT_TOUCH.and(
				NotificationFilter.READ.negated().or(
					NotificationFilter.createFeatureFilter(
						EcorePackage.Literals.ERESOURCE, Resource.RESOURCE__IS_MODIFIED)))) {

			// don't post while a runnable is still pending. We don't need redundant updating of the dirty state
			// because it cannot change while we're processing the event
			private final AtomicBoolean pending = new AtomicBoolean();

			@Override
			public void resourceSetChanged(ResourceSetChangeEvent event) {
				// need this to avoid invalid thread access while loading models from a Job
				if (pending.compareAndSet(false, true)) {
					Display.getDefault().asyncExec(new Runnable() {
						public void run() {
							try {
								// causes editor to update its dirty flag on tab
								firePropertyChange(IEditorPart.PROP_DIRTY);

								// if (propertySheetPage != null) {
								// propertySheetPage.refresh();
								// }
							} finally {
								pending.set(false);
							}
						}
					});
				}
			}
		};
		editingDomain.addResourceSetListener(dirtyResourceListener);
	}

	/**
	 *
	 */
	@Override
	public void dispose() {
		// there's only one history in the workbench. Disconnect from it
		getOperationHistory().removeOperationHistoryListener(historyListener);

		// there's only one workspace. Disconnect from it
		ResourcesPlugin.getWorkspace().addResourceChangeListener(
			resourceChangeListener, IResourceChangeEvent.POST_CHANGE);

		adapterFactoryContentProvider.dispose();
		adapterFactory.dispose();

		getSite().getPage().removePartListener(partListener);
		partListener = null;

		if (getActionBarContributor() != null) {
			if (getActionBarContributor().getActiveEditor() == this) {
				getActionBarContributor().setActiveEditor(null);
			}
		}
		if (propertySheetPage != null) {
			propertySheetPage.dispose();
		}

		if (editingDomain != null) {
			editingDomain.removeResourceSetListener(resourceLoadListener);
			editingDomain.removeResourceSetListener(dirtyResourceListener);
		}
		resourceLoadListener = null;
		dirtyResourceListener = null;

		super.dispose();
	}

	@Override
	public void createPartControl(Composite parent) {
		viewerPane = new ViewerPane(getSite().getPage(), UMLTableEditor.this) {
			@Override
			public Viewer createViewer(Composite composite) {
				// using SWT.FULL_SELECTION is critical for finding tree
				// selections in columns > 0
				return new TreeViewer(
					composite, SWT.FULL_SELECTION | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER) {

					@Override
					protected void hookControl(Control control) {
						super.hookControl(control);
						Tree treeControl = (Tree) control;
						treeControl.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseDown(MouseEvent e) {
								/*
								 * Need to reverse action of this statement from TreeViewer
								 * so that we don't go immediately into edit mode.
								 * This causes a flash in UI, but no way around it...
								 */
								// treeViewerImpl.handleMouseDown(e);

								cancelEditing();
							}
						});
					}
				};
			}

			@Override
			public void requestActivation() {
				super.requestActivation();
				// setCurrentViewerPane(this);
			}
		};
		viewerPane.createControl(parent);

		contributeToToolBar(viewerPane.getToolBarManager());

		treeViewerWithColumns = (TreeViewer) viewerPane.getViewer();
		treeViewerWithColumns.setAutoExpandLevel(2);

		// treeViewerWithColumns.setSorter(new UMLNavigatorSorter());

		final Tree tree = treeViewerWithColumns.getTree();
		tree.setLayoutData(new FillLayout());
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);

		TreeColumn column = new TreeColumn(tree, SWT.NONE);
		column.setText("Name");
		column.setResizable(true);
		column.setWidth(225);

		column = new TreeColumn(tree, SWT.NONE);
		column.setText("Type");
		column.setResizable(true);
		column.setWidth(125);

		column = new TreeColumn(tree, SWT.NONE);
		column.setText("Multiplicity");
		column.setResizable(true);
		column.setWidth(80);

		column = new TreeColumn(tree, SWT.NONE);
		column.setText("Aggregation");
		column.setResizable(false);
		// column.setWidth(90);
		column.setWidth(0);

		column = new TreeColumn(tree, SWT.NONE);
		column.setText("Visibility");
		column.setResizable(false);
		// column.setWidth(70);
		column.setWidth(0);

		column = new TreeColumn(tree, SWT.NONE);
		column.setText("Annotation");
		column.setResizable(true);
		column.setWidth(175);

		column = new TreeColumn(tree, SWT.NONE);
		column.setText("Value");
		column.setResizable(true);
		column.setWidth(200);

		treeViewerWithColumns.setColumnProperties(
			new String[] {
					IUMLTableProperties.NAME_PROPERTY, IUMLTableProperties.TYPE_PROPERTY,
					IUMLTableProperties.MULTIPLICITY_PROPERTY, IUMLTableProperties.AGGREGATION_PROPERTY,
					IUMLTableProperties.VISIBILITY_PROPERTY, IUMLTableProperties.ANNOTATION_PROPERTY,
					IUMLTableProperties.DEFAULT_VALUE_PROPERTY });
		treeViewerWithColumns.setContentProvider(adapterFactoryContentProvider);

		treeViewerWithColumns.setLabelProvider(adapterFactoryLabelProvider);

		treeViewerWithColumns.setCellModifier(new AdapterFactoryCellModifier(adapterFactory));

		TextCellEditor textCellEditor = new TextCellEditor(tree) {
			@Override
			protected void doSetValue(Object value) {
				if (value != null) {
					super.doSetValue(value);
				}
			}

			@Override
			public void deactivate() {
				super.deactivate();
				if (cursor != null && cursor.getRow() != null) {
					/*
					 * deactivate is called before the TreeItem is updated,
					 * but TreeCursor uses GC to paint cell using the
					 * TreeItem.getText(). This is needed to repaint
					 * cell with the new value.
					 */
					treeViewerWithColumns.update(cursor.getRow().getData(), null);
				}
			}
		};

		ComboBoxTextCellEditor multiplicityEditor = new ComboBoxTextCellEditor(
			tree, new String[] { "0..*", "0..1", "1..1", "1..*" }) {
			@Override
			public void deactivate() {
				super.deactivate();
				if (cursor != null && cursor.getRow() != null) {
					treeViewerWithColumns.update(cursor.getRow().getData(), null);
				}
			}
		};

		ComboBoxCellEditor aggregationEditor = new ComboBoxCellEditor(
			tree,
			new String[] {
					AggregationKind.get(0).getName(), AggregationKind.get(1).getName(),
					AggregationKind.get(2).getName() }) {
			@Override
			public void deactivate() {
				super.deactivate();
				if (cursor != null && cursor.getRow() != null) {
					treeViewerWithColumns.update(cursor.getRow().getData(), null);
				}
			}
		};

		ComboBoxCellEditor visibilityEditor = new ComboBoxCellEditor(
			tree,
			new String[] {
					VisibilityKind.get(0).getName(), VisibilityKind.get(1).getName(), VisibilityKind.get(2).getName(),
					VisibilityKind.get(3).getName() }) {
			@Override
			public void deactivate() {
				super.deactivate();
				if (cursor != null && cursor.getRow() != null) {
					treeViewerWithColumns.update(cursor.getRow().getData(), null);
				}
			}
		};

		ExtendedDialogCellEditor typeEditor = new ExtendedDialogCellEditor(
			tree, new AdapterFactoryLabelProvider(adapterFactory)) {
			@Override
			public void deactivate() {
				super.deactivate();
				if (cursor != null && cursor.getRow() != null) {
					treeViewerWithColumns.update(cursor.getRow().getData(), null);
				}
			}

			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				Element selectedElement = getSelectedElement();
				Package topPackage = UMLUtil.getTopPackage(selectedElement);
				NamedElement type = null;

				if (topPackage instanceof Profile) {
					if (selectedElement instanceof Extension) {
						type = DialogLaunchUtil.chooseUMLMetaclass(
							editingDomain.getResourceSet(), getSite().getShell());
					} else if (selectedElement instanceof Property &&
							((Property) selectedElement).getClass_() instanceof Stereotype) {
						type = DialogLaunchUtil.chooseElement(
							new StereotypePropertyTypeFilter(), topPackage, getSite().getShell());
					} else {
						type = DialogLaunchUtil.chooseElement(
							new PropertyTypeFilter(), topPackage, getSite().getShell());
					}

				} else {
					// type = DialogLaunchUtil.chooseElement(new PropertyTypeFilter(), editingDomain.getResourceSet(), getSite().getShell());
					type = DialogLaunchUtil.chooseElement(new PropertyTypeFilter(), topPackage, getSite().getShell());
				}

				return type;
			}
		};

		CellEditor[] cellEditors = new CellEditor[] {
				textCellEditor, typeEditor, multiplicityEditor, aggregationEditor, visibilityEditor, null,
				textCellEditor };
		treeViewerWithColumns.setCellEditors(cellEditors);

		cursor = new TreeCursor(tree, SWT.NONE) {
			// double-click on current cursor selection
			@Override
			public void handleDoubleClick(Event event) {
				treeViewerWithColumns.editElement(getTreePath(getRow()), getColumn());
			}
		};

		cursor.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				tree.setSelection(cursor.getRow());
				Event event = new Event();
				event.item = cursor.getRow();
				tree.notifyListeners(SWT.Selection, event);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// open cell editor when the user hits "ENTER" in the TreeCursor
				TreeItem row = cursor.getRow();
				int column = cursor.getColumn();
				treeViewerWithColumns.editElement(cursor.getTreePath(row), column);
			}
		});

		// required to support resources with multiple root objects
		// so that all are not expanded.
		if (viewSelection != null && viewSelection.size() > 1) {
			treeViewerWithColumns.setAutoExpandLevel(1);
		}

		treeViewerWithColumns.addTreeListener(new ITreeViewerListener() {
			public void treeCollapsed(TreeExpansionEvent event) {
				// nothing to do
			}

			public void treeExpanded(TreeExpansionEvent event) {
				// TODO fix bug where row of expanded node is incorrectly displayed, after scrolling
				// this method is fired before expanding, not afterward
			}
		});

		getEditorSite().setSelectionProvider(new SelectionProvider(tree));
		updateViewContents();

		if (viewSelection != null && viewSelection.size() >= 1) {
			treeViewerWithColumns.setSelection(new StructuredSelection(viewSelection.getFirstElement()));
		}

		// set to 1 level expansion after initial display
		treeViewerWithColumns.setAutoExpandLevel(1);

		// configure context menus
		treeViewerWithColumns.getControl().addMenuDetectListener(new MenuDetectListener() {

			public void menuDetected(MenuDetectEvent e) {
				if (cursor != null) {
					// hit-test the cursor
					Rectangle cursorBounds = cursor.getBounds();
					if (cursorBounds.contains(((Control) e.widget).toControl(e.x, e.y))) {
						// don't show the table's menu in addition to the cursor's
						e.doit = false;
					}
				}
			}
		});
		createContextMenuFor(treeViewerWithColumns.getControl(), treeViewerWithColumns, treeViewerWithColumns);
		createContextMenuFor(cursor, getEditorSite().getSelectionProvider(), treeViewerWithColumns);
	}

	private void updateViewContents() {
		if (viewSelection != null && getSite().getSelectionProvider() != null) {
			getSite().getSelectionProvider().setSelection(viewSelection);
		}
	}

	private void setDefaultSelection() {
		if (resource != null && !resource.getContents().isEmpty()) {
			List<NamedElement> contents = new ArrayList<NamedElement>();
			for (EObject eObject : resource.getContents()) {
				if (eObject instanceof Package ||
						(eObject instanceof Classifier && !(eObject instanceof Association))) {
					contents.add((NamedElement) eObject);
				}
			}

			viewSelection = new StructuredSelection(contents);
			updateViewContents();
			selectReveal(viewSelection);
		}
	}

	private void computeBaseTypeFilterSelection() {
		if (baseTypeFilter == null) {
			return;
		}

		final List<Class> contents = new ArrayList<Class>();

		UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {
			@Override
			public Object caseClass(Class classifier) {
				List<Classifier> allParents = new ArrayList<Classifier>(classifier.allParents());
				allParents.add(classifier);
				if (allParents.contains(baseTypeFilter)) {
					contents.add(classifier);
				}
				return classifier;
			}

			@Override
			public Object casePackage(Package pkg) {
				for (NamedElement namedElement : pkg.getOwnedMembers()) {
					doSwitch(namedElement);
				}
				return pkg;
			}
		};
		umlSwitch.doSwitch(resource.getContents().get(0));

		Collections.sort(contents, new NamedElementComparator());

		viewSelection = new StructuredSelection(contents);
		updateViewContents();
	}

	private void computeContainerFilterSelection() {
		if (containerFilter == null) {
			return;
		}

		Set<Classifier> contents = new HashSet<Classifier>();
		appendContainerFilterSelection(containerFilter, contents);

		List<Classifier> sortedContents = new ArrayList<Classifier>(contents);
		Collections.sort(sortedContents, new NamedElementComparator());

		viewSelection = new StructuredSelection(sortedContents);
		updateViewContents();
		selectReveal(new StructuredSelection(containerFilter));
	}

	private void appendContainerFilterSelection(Classifier classifier, Set<Classifier> contents) {
		// include only those classes that are in this editor's resource
		if (resource.equals(classifier.eResource()) ||
				UMLUtil.getControlledResources(resource).contains(classifier.eResource())) {
			contents.add(classifier);

			// recursive: all subclasses, and all contents of associated classes
			List<Classifier> subtypes = UMLUtil.getAllSpecializations(classifier);
			for (Classifier subtype : subtypes) {
				appendContainerFilterSelection(subtype, contents);
			}

			for (Property property : classifier.getAllAttributes()) {
				if (property.getType() instanceof Classifier) {
					appendContainerFilterSelection((Classifier) property.getType(), contents);
				}
			}
		}
	}

	private void computeResourceFilterSelection() {
		if (resourceFilter == null || resourceFilter == resource) {
			return;
		}

		final List<EObject> contents = new ArrayList<EObject>();

		for (TreeIterator<EObject> allContents = resource.getAllContents(); allContents.hasNext();) {
			EObject eObject = allContents.next();
			if (eObject.eResource() == resourceFilter) {
				if (eObject instanceof Package ||
						(eObject instanceof Classifier && !(eObject instanceof Association))) {
					contents.add(eObject);
				}

				allContents.prune();
			}
		}

		viewSelection = new StructuredSelection(contents);
		updateViewContents();
	}

	private class BaseTypeFilterAction extends Action {
		String imageKey = "icons/full/eview16/filter_basetype.gif";

		ImageDescriptor imageDescriptor = UML2UIPlugin.getImageDescriptor(imageKey);

		protected BaseTypeFilterAction() {
			super(UML2UIMessages.BaseTypeFilter_title, IAction.AS_CHECK_BOX);
			setImageDescriptor(imageDescriptor);
			setToolTipText(UML2UIMessages.BaseTypeFilter_tooltip);

			if (UML2UIPlugin.getDefault().getImageRegistry().getDescriptor(imageKey) == null) {
				UML2UIPlugin.getDefault().getImageRegistry().put(imageKey, imageDescriptor);
			}
		}

		@Override
		public void run() {
			// prompt for base class
			Class baseType = (Class) DialogLaunchUtil.chooseElement(
				new java.lang.Class[] { Class.class }, resource.getResourceSet(), getSite().getShell(),
				UML2UIMessages.BaseTypeFilter_title, UML2UIMessages.BaseTypeFilter_message);

			if (baseType != null) {
				baseTypeFilter = baseType;
				computeBaseTypeFilterSelection();
			}

			if (baseTypeFilter != null) {
				this.setChecked(true);
				containerFilterAction.setChecked(false);
				containerFilter = null;
				resourceFilterAction.setChecked(false);
				resourceFilter = null;

				// use icon for Base Type action to show which filter is applied
				Image filterImage = UML2UIPlugin.getDefault().getImageRegistry().get(imageKey);
				viewerPane.setTitle(baseType.getQualifiedName(), filterImage);
			} else {
				this.setChecked(false);
			}
		}
	};

	private Action baseTypeFilterAction = new BaseTypeFilterAction();

	private Class baseTypeFilter = null;

	private class ContainerFilterAction extends Action {
		String imageKey = "icons/full/eview16/filter_container.gif";

		ImageDescriptor imageDescriptor = UML2UIPlugin.getImageDescriptor(imageKey);

		protected ContainerFilterAction() {
			super(UML2UIMessages.ContainerFilter_title, IAction.AS_CHECK_BOX);
			setImageDescriptor(imageDescriptor);
			setToolTipText(UML2UIMessages.ContainerFilter_tooltip);

			if (UML2UIPlugin.getDefault().getImageRegistry().getDescriptor(imageKey) == null) {
				UML2UIPlugin.getDefault().getImageRegistry().put(imageKey, imageDescriptor);
			}
		}

		@Override
		public void run() {
			Class containerType = (Class) DialogLaunchUtil.chooseElement(
				new java.lang.Class[] { Class.class }, resource, getSite().getShell(),
				UML2UIMessages.ContainerFilter_title, UML2UIMessages.ContainerFilter_message);

			if (containerType != null) {
				containerFilter = containerType;
				computeContainerFilterSelection();
			}

			if (containerFilter != null) {
				this.setChecked(true);
				baseTypeFilterAction.setChecked(false);
				baseTypeFilter = null;
				resourceFilterAction.setChecked(false);
				resourceFilter = null;

				// use icon for Container action to show which filter is applied
				Image filterImage = UML2UIPlugin.getDefault().getImageRegistry().get(imageKey);
				viewerPane.setTitle(containerType.getQualifiedName(), filterImage);
			} else {
				this.setChecked(false);
			}
		}
	};

	private Action containerFilterAction = new ContainerFilterAction();

	private Class containerFilter = null;

	private class ContainerFilterMenuAction extends Action {
		String imageKey = "icons/full/eview16/filter_container.gif";

		ImageDescriptor imageDescriptor = UML2UIPlugin.getImageDescriptor(imageKey);

		protected ContainerFilterMenuAction() {
			super(UML2UIMessages.ContainerFilter_menu, IAction.AS_PUSH_BUTTON);
			setImageDescriptor(imageDescriptor);
			setToolTipText(UML2UIMessages.ContainerFilter_tooltip);

			if (UML2UIPlugin.getDefault().getImageRegistry().getDescriptor(imageKey) == null) {
				UML2UIPlugin.getDefault().getImageRegistry().put(imageKey, imageDescriptor);
			}
		}

		// TODO need to listen for selection events
		public void selectionChanged(IAction action, ISelection selection) {

		}

		@Override
		public void run() {
			// action enabled only when exactly one Class is selected
			ISelection selection = getSite().getSelectionProvider().getSelection();
			Class containerType = null;

			if (((IStructuredSelection) selection).size() == 1) {
				Object element = ((IStructuredSelection) selection).getFirstElement();
				if (element instanceof IAdaptable) {
					element = ((IAdaptable) element).getAdapter(Element.class);
				}
				if (element instanceof Class) {
					containerType = (Class) element;
				}
			}

			if (containerType != null) {
				containerFilter = containerType;
				computeContainerFilterSelection();
			}

			if (containerFilter != null) {
				containerFilterAction.setChecked(true);
				baseTypeFilterAction.setChecked(false);
				baseTypeFilter = null;
				resourceFilterAction.setChecked(false);
				resourceFilter = null;

				// use icon for Container action to show which filter is applied
				Image filterImage = UML2UIPlugin.getDefault().getImageRegistry().get(imageKey);
				viewerPane.setTitle(containerType.getQualifiedName(), filterImage);
			} else {
				containerFilterAction.setChecked(false);
			}
		}
	};

	private Action containerFilterMenuAction = new ContainerFilterMenuAction();

	private class ResourceFilterAction extends Action {
		String imageKey = "icons/full/eview16/filter_resource.gif";

		ImageDescriptor imageDescriptor = UML2UIPlugin.getImageDescriptor(imageKey);

		protected ResourceFilterAction() {
			super(UML2UIMessages.ResourceFilter_title, IAction.AS_CHECK_BOX);
			setImageDescriptor(imageDescriptor);
			setToolTipText(UML2UIMessages.ResourceFilter_tooltip);

			if (imageDescriptor != null &&
					UML2UIPlugin.getDefault().getImageRegistry().getDescriptor(imageKey) == null) {
				UML2UIPlugin.getDefault().getImageRegistry().put(imageKey, imageDescriptor);
			}
		}

		@Override
		public void run() {
			// prompt for resource
			ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				getSite().getShell(), new LabelProvider() {

					@Override
					public String getText(Object element) {
						return ((Resource) element).getURI().lastSegment();
					}
				});
			dialog.setMessage(UML2UIMessages.ResourceFilter_message);
			dialog.setFilter("*");
			dialog.setTitle(UML2UIMessages.ResourceFilter_title);

			dialog.setElements(UMLUtil.getControlledResources(resource).toArray());

			if (dialog.open() == Window.OK) {
				resourceFilter = (Resource) dialog.getFirstResult();
				computeResourceFilterSelection();
			}

			if (resourceFilter != null) {
				this.setChecked(true);
				baseTypeFilterAction.setChecked(false);
				baseTypeFilter = null;
				containerFilterAction.setChecked(false);
				containerFilter = null;

				// use icon for Resource action to show which filter is applied
				Image filterImage = UML2UIPlugin.getDefault().getImageRegistry().get(imageKey);
				viewerPane.setTitle(resourceFilter.getURI().lastSegment(), filterImage);
			} else {
				this.setChecked(false);
			}
		}
	};

	private Action resourceFilterAction = new ResourceFilterAction();

	private Resource resourceFilter = null;

	private class ResourceFilterMenuAction extends Action {
		String imageKey = "icons/full/eview16/filter_resource.gif";

		ImageDescriptor imageDescriptor = UML2UIPlugin.getImageDescriptor(imageKey);

		protected ResourceFilterMenuAction() {
			super(UML2UIMessages.ResourceFilter_menu, IAction.AS_PUSH_BUTTON);
			setImageDescriptor(imageDescriptor);
			setToolTipText(UML2UIMessages.ResourceFilter_tooltip);

			if (UML2UIPlugin.getDefault().getImageRegistry().getDescriptor(imageKey) == null) {
				UML2UIPlugin.getDefault().getImageRegistry().put(imageKey, imageDescriptor);
			}
		}

		// TODO need to listen for selection events
		public void selectionChanged(IAction action, ISelection selection) {

		}

		@Override
		public void run() {
			// action enabled only when exactly one Element is selected
			ISelection selection = getSite().getSelectionProvider().getSelection();

			if (((IStructuredSelection) selection).size() == 1) {
				Object element = ((IStructuredSelection) selection).getFirstElement();
				if (element instanceof IAdaptable) {
					element = ((IAdaptable) element).getAdapter(Element.class);
				}
				if (element instanceof Element) {
					resourceFilter = ((Element) element).eResource();
				}
			}

			if (resourceFilter != null) {
				computeResourceFilterSelection();
			}

			if (resourceFilter != null) {
				resourceFilterAction.setChecked(true);
				baseTypeFilterAction.setChecked(false);
				baseTypeFilter = null;
				containerFilterAction.setChecked(false);
				containerFilter = null;

				// use icon for Resource action to show which filter is applied
				Image filterImage = UML2UIPlugin.getDefault().getImageRegistry().get(imageKey);
				viewerPane.setTitle(resourceFilter.getURI().lastSegment(), filterImage);
			} else {
				containerFilterAction.setChecked(false);
			}
		}
	};

	private Action resourceFilterMenuAction = new ResourceFilterMenuAction();

	private Action removeFiltersAction = new RemoveFilterAction();

	private class RemoveFilterAction extends Action {
		protected RemoveFilterAction() {
			super(UML2UIMessages.RemoveFilter_title, IAction.AS_PUSH_BUTTON);
			setImageDescriptor(UML2UIPlugin.getImageDescriptor("icons/full/eview16/remove.gif"));
			setToolTipText(UML2UIMessages.RemoveFilter_tooltip);
		}

		@Override
		public void run() {
			baseTypeFilter = null;
			containerFilter = null;
			resourceFilter = null;
			baseTypeFilterAction.setChecked(false);
			containerFilterAction.setChecked(false);
			resourceFilterAction.setChecked(false);
			viewerPane.setTitle(null);

			setDefaultSelection();
		}
	};

	private void updateMenuActions(ISelection selection) {
		if (((IStructuredSelection) selection).size() == 1) {
			Object element = ((IStructuredSelection) selection).getFirstElement();
			if (element instanceof IAdaptable) {
				element = ((IAdaptable) element).getAdapter(Element.class);
			}
			if (element instanceof Class) {
				containerFilterMenuAction.setEnabled(true);
			}
			if (element instanceof Element) {
				resourceFilterMenuAction.setEnabled(true);
			}
		}
		containerFilterMenuAction.setEnabled(false);
		resourceFilterMenuAction.setEnabled(false);
	}

	public void contributeToToolBar(IToolBarManager toolBarManager) {
		// TODO add new class toolbar action

		toolBarManager.add(baseTypeFilterAction);
		toolBarManager.add(containerFilterAction);
		toolBarManager.add(resourceFilterAction);
		toolBarManager.add(removeFiltersAction);

		// toolBarManager.add(new Separator());

		toolBarManager.update(true);
	}

	@Override
	public void setFocus() {
		treeViewerWithColumns.getControl().setFocus();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
		// not used for ISaveablesSource
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	@Override
	public void doSaveAs() {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	/*
	 * Default uses isDirty() from nested editors. Override to test the
	 * Saveables affected by the editor input.
	 */
	@Override
	public boolean isDirty() {
		Saveable[] saveables = getSaveables();
		for (int i = 0; i < saveables.length; i++) {
			if (saveables[i].isDirty()) {
				return true;
			}
		}
		return false;
	}

	public Saveable[] getSaveables() {
		List<Saveable> saveables = new ArrayList<Saveable>();
		ModelDocument saveable = ModelManager.getManager().getModelDocument(resource);
		if (saveable != null) {
			saveables.add(saveable);
		}
		for (Resource controlledResource : UMLUtil.getControlledResources(resource)) {
			saveable = ModelManager.getManager().getModelDocument(controlledResource);
			if (saveable != null) {
				saveables.add(saveable);
			}
		}
		return saveables.toArray(new Saveable[] {});
	}

	public Saveable[] getActiveSaveables() {
		// returns only resources containing selected element(s)
		return getSaveables();
	}

	/**
	 * This creates a context menu for the viewer and adds a listener as well registering the menu for extension.
	 */
	protected void createContextMenuFor(Control control, ISelectionProvider selectionProvider,
			StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp"); //$NON-NLS-1$
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu = contextMenu.createContextMenu(control);
		control.setMenu(menu);
		getEditorSite().registerContextMenu(contextMenu, selectionProvider, false);

		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		addDragSupport(control, dndOperations, transfers, new ViewerDragAdapter(viewer));
		EditingDomainViewerDropAdapter dropAdapter = new EditingDomainViewerDropAdapter(editingDomain, viewer) {
			@Override
			protected int getAutoFeedback() {
				// return DND.FEEDBACK_SCROLL | DND.FEEDBACK_EXPAND;
				return DND.FEEDBACK_SCROLL;
			}
		};
		addDropSupport(control, dndOperations, transfers, dropAdapter);
	}

	/**
	 * Copied from StructuredViewer and modified to work for other controls.
	 */
	protected void addDragSupport(Control control, int operations, Transfer[] transferTypes,
			DragSourceListener listener) {
		final DragSource dragSource = new DragSource(control, operations);
		dragSource.setTransfer(transferTypes);
		dragSource.addDragListener(listener);
	}

	/**
	 * Copied from StructuredViewer and modified to work for other controls.
	 */
	protected void addDropSupport(Control control, int operations, Transfer[] transferTypes,
			final DropTargetListener listener) {
		DropTarget dropTarget = new DropTarget(control, operations);
		dropTarget.setTransfer(transferTypes);
		dropTarget.addDropListener(listener);
	}

	/**
	 * This implements {@link org.eclipse.jface.action.IMenuListener} to help
	 * fill the context menus with contributions from the Edit menu.
	 */
	public void menuAboutToShow(IMenuManager menuManager) {
		((IMenuListener) getEditorSite().getActionBarContributor()).menuAboutToShow(menuManager);

		menuManager.appendToGroup(ICommonMenuConstants.GROUP_GOTO, containerFilterMenuAction);
		menuManager.appendToGroup(ICommonMenuConstants.GROUP_GOTO, resourceFilterMenuAction);
	}

	/**
	 * This is how the framework determines which interfaces we implement.
	 */
	@Override
	public Object getAdapter(java.lang.Class key) {

		if (key == IPropertySheetPage.class) {
			return new TabbedPropertySheetPage(this);
		} else if (IUndoContext.class == key) {
			// used by undo/redo actions to get their undo context
			return getUndoContext();
		} else if (key.equals(IContentOutlinePage.class)) {

			return new UMLOutlinePage(treeViewerWithColumns);
		} else if (key == IViewerProvider.class) {
			return new IViewerProvider() {

				public Viewer getViewer() {
					return treeViewerWithColumns;
				}
			};
		}

		return super.getAdapter(key);
	}

	public String getContributorId() {
		return "org.eclipse.mdht.uml.ui.properties";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
	 */
	public void selectionChanged(SelectionChangedEvent event) {
		getSite().getSelectionProvider().setSelection(event.getSelection());
	}

	/**
	 * Set the selection to the table tree viewer, and expand nodes if necessary.
	 *
	 * @see org.eclipse.ui.part.ISetSelectionTarget#selectReveal(org.eclipse.jface.viewers.ISelection)
	 */
	public void selectReveal(ISelection selection) {
		// this code copied from CommonNavigator
		if (treeViewerWithColumns != null) {
			if (selection instanceof IStructuredSelection) {
				Object[] newSelection = ((IStructuredSelection) selection).toArray();
				Object[] expandedElements = treeViewerWithColumns.getExpandedElements();
				Object[] newExpandedElements = new Object[newSelection.length + expandedElements.length];
				System.arraycopy(expandedElements, 0, newExpandedElements, 0, expandedElements.length);
				System.arraycopy(newSelection, 0, newExpandedElements, expandedElements.length, newSelection.length);

				// refresh is required when new content was added by an action
				treeViewerWithColumns.refresh();
				treeViewerWithColumns.setExpandedElements(newExpandedElements);
			}
			treeViewerWithColumns.setSelection(selection, true);

			// set the TreeCursor row, so that Properties view is updated
			TreeItem[] items = treeViewerWithColumns.getTree().getSelection();
			if (cursor != null && items.length > 0) {
				cursor.setSelection(items[0], 0);
			}
		}
	}

	public void gotoMarker(IMarker marker) {
		try {
			EObject eObject = null;
			Object markerURIAttr = marker.getAttribute(EValidator.URI_ATTRIBUTE);
			if (markerURIAttr != null) {
				URI markerURI = URI.createURI(markerURIAttr.toString());
				eObject = editingDomain.getResourceSet().getEObject(markerURI, true);
			}
			if (eObject != null && eObject instanceof NamedElement) {
				IStructuredSelection rootSelection = new StructuredSelection(
					((NamedElement) eObject).getNearestPackage());
				getSite().getSelectionProvider().setSelection(rootSelection);

				IStructuredSelection selection = new StructuredSelection(eObject);
				selectReveal(selection);
			}

		} catch (CoreException e) {
			// ignore this marker
		}
	}

}
