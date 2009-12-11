/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.ui.editors;

import java.util.Iterator;

import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.IOperationHistoryListener;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.commands.operations.OperationHistoryEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.ViewerPane;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
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
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
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
import org.eclipse.ui.ISaveablesSource;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.Saveable;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.VisibilityKind;
import org.openhealthtools.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.openhealthtools.mdht.uml.common.ui.saveable.ModelDocument;
import org.openhealthtools.mdht.uml.common.ui.saveable.ModelManager;
import org.openhealthtools.mdht.uml.common.ui.util.AdapterFactoryCellModifier;
import org.openhealthtools.mdht.uml.common.ui.util.ComboBoxTextCellEditor;
import org.openhealthtools.mdht.uml.common.ui.util.IResourceConstants;
import org.openhealthtools.mdht.uml.common.ui.util.TreeCursor;
import org.openhealthtools.mdht.uml.edit.IUMLTableProperties;
import org.openhealthtools.mdht.uml.edit.provider.SimpleListNotifier;
import org.openhealthtools.mdht.uml.edit.provider.UML2ExtendedAdapterFactory;
import org.openhealthtools.mdht.uml.ui.navigator.DecoratorAdapterFactoryLabelProvider;
import org.openhealthtools.mdht.uml.ui.navigator.UMLDomainNavigatorItem;
import org.openhealthtools.mdht.uml.ui.navigator.actions.EditCommandsFactory;

/**
 *
 * @version $Id: $
 */
public class UMLTableEditor extends EditorPart
implements IEditingDomainProvider, IMenuListener, ISelectionChangedListener, 
	ISetSelectionTarget, IGotoMarker,
	ITabbedPropertySheetPageContributor, ISaveablesSource {
	
	public static final String EDITOR_ID = "org.openhealthtools.mdht.uml.ui.UMLTableEditorID";
	
	private TransactionalEditingDomain editingDomain;
	
	private IStructuredSelection initialSelection = null;

	private Resource resource = null;
	private ResourceSetListener dirtyResourceListener = null;
	private ResourceSetListener resourceLoadListener = null;
	
	/** This editor's property sheet page. */
	protected TabbedPropertySheetPage propertySheetPage;
	
	private EditCommandsFactory editCommandsFactory = new EditCommandsFactory();

	/** This is the one adapter factory used for providing views of the model. */
	protected UML2ExtendedAdapterFactory adapterFactory;
	protected AdapterFactoryContentProvider myAdapterFactoryContentProvider;
	
	protected TreeViewer treeViewerWithColumns;
	
	private TreeCursor cursor;

	/**
	 * This view's selection provider.
	 */
	private class SelectionProvider implements ISelectionProvider {

		/** The selection changed listeners. */
		private ListenerList fListeners= new ListenerList();
		/** The widget. */
		private Control fControl;

		/**
		 * Creates a new selection provider.
		 *
		 * @param control	the widget
		 */
		public SelectionProvider(Control control) {
		    Assert.isNotNull(control);
			fControl= control;
			if (fControl instanceof Tree) {
			    ((Tree)fControl).addSelectionListener(new SelectionAdapter() {
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
			ISelection selection= getSelection();
			SelectionChangedEvent event= new SelectionChangedEvent(this, selection);
			Object[] selectionChangedListeners= fListeners.getListeners();
			for (int i= 0; i < selectionChangedListeners.length; i++) {
				((ISelectionChangedListener)selectionChangedListeners[i]).selectionChanged(event);
			}
		}

		public void addSelectionChangedListener(ISelectionChangedListener listener) {
			fListeners.add(listener);
		}

		public ISelection getSelection() {
			if (fControl instanceof Tree) {
				TreeItem[] selection = ((Tree)fControl).getSelection();
				Object[] values = new Object[selection.length];
				for (int i = 0; i < values.length; i++) {
					if (selection[i].getData() instanceof Element) {
						values[i] = new UMLDomainNavigatorItem((Element) selection[i].getData(), null, 
								myAdapterFactoryContentProvider);
						//values[i] = selection[i].getData();
					}
					else {
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

		public void setSelection(ISelection selection) {
			SimpleListNotifier rootList = new SimpleListNotifier();
			rootList.getMembers().addAll(((IStructuredSelection)selection).toList());
			treeViewerWithColumns.setInput(rootList);
			
			fireSelectionChanged();
		}
	}

	private IOperationHistoryListener historyListener = new IOperationHistoryListener() {
		public void historyNotification(final OperationHistoryEvent event) {
			if (event.getEventType() == OperationHistoryEvent.DONE
					|| event.getEventType() == OperationHistoryEvent.UNDONE
					|| event.getEventType() == OperationHistoryEvent.REDONE) {

				getSite().getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						//TODO this fires even if change did not originate
						//		in this editor
						if (propertySheetPage != null) {
							propertySheetPage.refresh();
						}

						// after delete, undo, redo, etc, the cursor canvas
						// may be over incorrect TreeItem.  Redraw to be sure
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
	protected IPartListener partListener =
		new IPartListener() {
			public void partActivated(IWorkbenchPart p) {
				if (p instanceof ContentOutline) {
//					if (((ContentOutline)p).getCurrentPage() == contentOutlinePage) {
//						getActionBarContributor().setActiveEditor(RequirementsEditor.this);
//
//						setCurrentViewer(contentOutlineViewer);
//					}
				}
				else if (p instanceof PropertySheet) {
//					if (((PropertySheet)p).getCurrentPage() == propertySheetPage) {
//						getActionBarContributor().setActiveEditor(RequirementsEditor.this);
//						handleActivate();
//					}
				}
				else if (p == UMLTableEditor.this) {
					editCommandsFactory.setActivePart(UMLTableEditor.this);
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

	public UMLTableEditor() {
		super();

		editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain(
				IResourceConstants.EDITING_DOMAIN_ID);
		
		adapterFactory = new UML2ExtendedAdapterFactory();
		myAdapterFactoryContentProvider = new AdapterFactoryContentProvider(adapterFactory);

		getOperationHistory().addOperationHistoryListener(historyListener);
	}

	/**
	 * This returns the editing domain as required by the {@link IEditingDomainProvider} interface.
	 * This is important for implementing the static methods of {@link AdapterFactoryEditingDomain}
	 * and for supporting {@link org.eclipse.emf.edit.ui.action.CommandAction}.
	 */
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	private IOperationHistory getOperationHistory() {
		return ((IWorkspaceCommandStack) editingDomain.getCommandStack()).getOperationHistory();
	}

	public IUndoContext getUndoContext() {
		return ((IWorkspaceCommandStack)
				getEditingDomain().getCommandStack()).getDefaultUndoContext();
	}

	public UMLTableActionBarContributor getActionBarContributor() {
		return (UMLTableActionBarContributor) getEditorSite()
			.getActionBarContributor();
	}

	public IActionBars getActionBars() {
		return getActionBarContributor().getActionBars();
	}

	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		setInputWithNotify(input);
		setPartName(input.getName());
		site.getPage().addPartListener(partListener);
//		ResourcesPlugin.getWorkspace().addResourceChangeListener(
//				resourceChangeListener, IResourceChangeEvent.POST_CHANGE);

		editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain(
					IResourceConstants.EDITING_DOMAIN_ID);
		ModelManager.getManager().manage(editingDomain);
		
		if (input instanceof IFileEditorInput) {
			IFile file = ((IFileEditorInput)input).getFile();
			URI resourceURI = URI.createPlatformResourceURI(file.getFullPath().toString(), false);

			try {
				resource = editingDomain.getResourceSet().getResource(resourceURI, true);
				if (!resource.getContents().isEmpty())
					initialSelection = new StructuredSelection(resource.getContents().get(0));
				
			} catch (Exception e) {
				//TODO display errors, see sample UMLEditor init()
				resource = editingDomain.getResourceSet().getResource(resourceURI, false);
			}
		}
		
		resourceLoadListener = new ResourceSetListenerImpl(
				NotificationFilter.RESOURCE_LOADED.or(NotificationFilter.RESOURCE_UNLOADED)) {
	        public void resourceSetChanged(ResourceSetChangeEvent event) {
	        	// close this editor if its resource is unloaded
	        	for (Iterator iter = event.getNotifications().iterator(); iter.hasNext();) {
					final Notification notification = (Notification) iter.next();
					final Resource resource = (Resource) notification.getNotifier();
					
					if (NotificationFilter.RESOURCE_UNLOADED.matches(notification)) {
			            String filePath = resource.getURI().toPlatformString(true);
			            IResource workspaceResource = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(filePath));
			            if (workspaceResource instanceof IFile
			            		&& ((IFileEditorInput)getEditorInput()).getFile().equals(workspaceResource))
			            {
							getSite().getShell().getDisplay().asyncExec(
									new Runnable() {
										public void run() {
											getSite().getPage().closeEditor(
												UMLTableEditor.this, false);
										}
									});
			            }
					}
	        	}
	        }
		};
		editingDomain.addResourceSetListener(resourceLoadListener);

		dirtyResourceListener = new ResourceSetListenerImpl(
				NotificationFilter.NOT_TOUCH) {
	        public void resourceSetChanged(ResourceSetChangeEvent event) {
				//need this to avoid invalid thread access while loading models from a Job
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						// causes editor to update its dirty flag on tab
						firePropertyChange(IEditorPart.PROP_DIRTY);

//							if (propertySheetPage != null) {
//								propertySheetPage.refresh();
//							}
					}
				});
	        }
		};
		editingDomain.addResourceSetListener(dirtyResourceListener);
	}

	/**
	 * 
	 */
	public void dispose() {
		myAdapterFactoryContentProvider.dispose();
		adapterFactory.dispose();
		
		getSite().getPage().removePartListener(partListener);
		partListener = null;

		if (getActionBarContributor().getActiveEditor() == this) {
			getActionBarContributor().setActiveEditor(null);
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

	public void createPartControl(Composite parent) {
		ViewerPane viewerPane = new ViewerPane(getSite().getPage(),
				UMLTableEditor.this) {
			public Viewer createViewer(Composite composite) {
				// using SWT.FULL_SELECTION is critical for finding tree 
				// selections in columns > 0
				return new TreeViewer(composite,
						SWT.FULL_SELECTION |
						SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER) {

					protected void hookControl(Control control) {
						super.hookControl(control);
						Tree treeControl = (Tree) control;
						treeControl.addMouseListener(new MouseAdapter() {
							public void mouseDown(MouseEvent e) {
								/* Need to reverse action of this statement from TreeViewer
								 *  so that we don't go immediately into edit mode.
								 *  This causes a flash in UI, but no way around it...
								 */  
								//treeViewerImpl.handleMouseDown(e);
								
								cancelEditing();
							}
						});
					}
				};
			}

			public void requestActivation() {
				super.requestActivation();
//				setCurrentViewerPane(this);
			}
		};
		viewerPane.createControl(parent);

		treeViewerWithColumns = (TreeViewer) viewerPane.getViewer();
		treeViewerWithColumns.setAutoExpandLevel(2);
		
//		treeViewerWithColumns.setSorter(new UMLNavigatorSorter());

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
//		column.setWidth(90);
		column.setWidth(0);

		column = new TreeColumn(tree, SWT.NONE);
		column.setText("Visibility");
		column.setResizable(false);
//		column.setWidth(70);
		column.setWidth(0);

		column = new TreeColumn(tree, SWT.NONE);
		column.setText("Annotation");
		column.setResizable(true);
		column.setWidth(150);

		column = new TreeColumn(tree, SWT.NONE);
		column.setText("Default Value");
		column.setResizable(true);
		column.setWidth(200);

		treeViewerWithColumns.setColumnProperties(new String[] { 
				IUMLTableProperties.NAME_PROPERTY,
				IUMLTableProperties.TYPE_PROPERTY,
				IUMLTableProperties.MULTIPLICITY_PROPERTY,
				IUMLTableProperties.AGGREGATION_PROPERTY,
				IUMLTableProperties.VISIBILITY_PROPERTY,
				IUMLTableProperties.ANNOTATION_PROPERTY,
				IUMLTableProperties.DEFAULT_VALUE_PROPERTY });
		treeViewerWithColumns.setContentProvider(myAdapterFactoryContentProvider);
		
		ILabelProvider labelProvider = new DecoratorAdapterFactoryLabelProvider(adapterFactory);
		treeViewerWithColumns.setLabelProvider(labelProvider);

		treeViewerWithColumns.setCellModifier(new AdapterFactoryCellModifier(
				adapterFactory));

		TextCellEditor textCellEditor = new TextCellEditor(tree) {
		    protected void doSetValue(Object value) {
		    	if (value != null)
		    		super.doSetValue(value);
		    }
		    
			public void deactivate() {
				super.deactivate();
				if (cursor != null && cursor.getRow() != null) {
					/* deactivate is called before the TreeItem is updated,
					 * but TreeCursor uses GC to paint cell using the
					 * TreeItem.getText().  This is needed to repaint
					 * cell with the new value.
					 */
					treeViewerWithColumns.update(cursor.getRow().getData(), null);
				}
			}
		};
		
		ComboBoxTextCellEditor multiplicityEditor = new ComboBoxTextCellEditor(tree,
			new String[] {"0..*", "0..1", "1..1", "1..*"}) {
			public void deactivate() {
				super.deactivate();
				if (cursor != null && cursor.getRow() != null) {
					treeViewerWithColumns.update(cursor.getRow().getData(), null);
				}
			}
		};

		ComboBoxCellEditor aggregationEditor = new ComboBoxCellEditor(tree,
			new String[] {
				AggregationKind.get(0).getName(),
				AggregationKind.get(1).getName(),
				AggregationKind.get(2).getName()}) {
			public void deactivate() {
				super.deactivate();
				if (cursor != null && cursor.getRow() != null) {
					treeViewerWithColumns.update(cursor.getRow().getData(), null);
				}
			}
		};
		
		ComboBoxCellEditor visibilityEditor = new ComboBoxCellEditor(tree,
			new String[] {
				VisibilityKind.get(0).getName(),
				VisibilityKind.get(1).getName(),
				VisibilityKind.get(2).getName(),
				VisibilityKind.get(3).getName()}) {
			public void deactivate() {
				super.deactivate();
				if (cursor != null && cursor.getRow() != null) {
					treeViewerWithColumns.update(cursor.getRow().getData(), null);
				}
			}
		};
		
		ExtendedDialogCellEditor typeEditor = new ExtendedDialogCellEditor(
				tree, new AdapterFactoryLabelProvider(adapterFactory)) {
			public void deactivate() {
				super.deactivate();
				if (cursor != null && cursor.getRow() != null) {
					treeViewerWithColumns.update(cursor.getRow().getData(), null);
				}
			}
			
			protected Object openDialogBox(Control cellEditorWindow) {
				NamedElement type = DialogLaunchUtil.chooseElement(
						new java.lang.Class[] { 
							org.eclipse.uml2.uml.Class.class, DataType.class }, 
						editingDomain.getResourceSet(), 
						getSite().getShell());

				return type;
			}
		};

		CellEditor[] cellEditors = new CellEditor[] {
				textCellEditor,
				typeEditor,
				multiplicityEditor,
				aggregationEditor,
				visibilityEditor,
				null,
				textCellEditor
		};
		treeViewerWithColumns.setCellEditors(cellEditors);
		
		cursor = new TreeCursor(tree, SWT.NONE) {
			// double-click on current cursor selection
			public void handleDoubleClick(Event event) {
				treeViewerWithColumns.editElement(getTreePath(getRow()), getColumn());
			}
		};

 		cursor.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				tree.setSelection(cursor.getRow());
				Event event = new Event();
				event.item = cursor.getRow();
				tree.notifyListeners(SWT.Selection, event);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
				// open cell editor when the user hits "ENTER" in the TreeCursor
				TreeItem row = cursor.getRow();
				int column = cursor.getColumn();
				treeViewerWithColumns.editElement(cursor.getTreePath(row), column);
			}
		});

		getEditorSite().setSelectionProvider(new SelectionProvider(tree));
		if (initialSelection != null) {
			getSite().getSelectionProvider().setSelection(initialSelection);
		}

		createContextMenuFor(treeViewerWithColumns.getControl(), treeViewerWithColumns, treeViewerWithColumns);
		createContextMenuFor(cursor, getEditorSite().getSelectionProvider(), treeViewerWithColumns);
	}

	public void setFocus() {
		treeViewerWithColumns.getControl().setFocus();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void doSave(IProgressMonitor monitor) {
		// not used for ISaveablesSource
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	public void doSaveAs() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	public boolean isSaveAsAllowed() {
		return false;
	}

	/*
	 * Default uses isDirty() from nested editors. Override to test the
	 * Saveables affected by the editor input.
	 */
	public boolean isDirty() {
		return resource.isModified();
	}

	public Saveable[] getSaveables() {
		ModelDocument saveable = ModelManager.getManager().getModelDocument(resource);
		if (saveable != null)
			return new Saveable[] { saveable };
		else
			return new Saveable[0];
	}

	public Saveable[] getActiveSaveables() {
		// returns only resources containing selected element(s)
		return getSaveables();
	}

	/**
	 * This creates a context menu for the viewer and adds a listener as well registering the menu for extension.
	 */
	protected void createContextMenuFor(Control control, ISelectionProvider selectionProvider, StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp"); //$NON-NLS-1$
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu= contextMenu.createContextMenu(control);
		control.setMenu(menu);
		getEditorSite().registerContextMenu(contextMenu, selectionProvider, false);

		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		addDragSupport(control, dndOperations, transfers, new ViewerDragAdapter(viewer));
        EditingDomainViewerDropAdapter dropAdapter = new EditingDomainViewerDropAdapter(
				editingDomain, viewer) {
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
	protected void addDragSupport(Control control, int operations, Transfer[] transferTypes, DragSourceListener listener) {
		final DragSource dragSource = new DragSource(control, operations);
		dragSource.setTransfer(transferTypes);
		dragSource.addDragListener(listener);
	}

	/**
	 * Copied from StructuredViewer and modified to work for other controls.
	 */
	protected void addDropSupport(Control control, int operations, Transfer[] transferTypes, final DropTargetListener listener) {
		DropTarget dropTarget = new DropTarget(control, operations);
		dropTarget.setTransfer(transferTypes);
		dropTarget.addDropListener(listener);
	}

	/**
	 * This implements {@link org.eclipse.jface.action.IMenuListener} to help 
	 * fill the context menus with contributions from the Edit menu.
	 */
	public void menuAboutToShow(IMenuManager menuManager) {
		((IMenuListener)getEditorSite().getActionBarContributor()).menuAboutToShow(menuManager);
	}

	/**
	 * This is how the framework determines which interfaces we implement.
	 */
	public Object getAdapter(Class key) {
        if (key == IPropertySheetPage.class) {
            return new TabbedPropertySheetPage(this);
        }
		else if (IUndoContext.class == key) {
			// used by undo/redo actions to get their undo context
			return getUndoContext();
		}
        
		return super.getAdapter(key);
	}

	public String getContributorId() {
		return "org.openhealthtools.mdht.uml.ui.properties";
	}

	/* (non-Javadoc)
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
			if(selection instanceof IStructuredSelection) {
				Object[] newSelection = ((IStructuredSelection)selection).toArray();
				Object[] expandedElements = treeViewerWithColumns.getExpandedElements();
				Object[] newExpandedElements = new Object[newSelection.length + expandedElements.length];
				System.arraycopy(expandedElements, 0, newExpandedElements, 0, expandedElements.length);
				System.arraycopy(newSelection, 0, newExpandedElements, expandedElements.length, newSelection.length);
				
				// refresh is required when new content was added by an action
				treeViewerWithColumns.refresh();
				treeViewerWithColumns.setExpandedElements(newExpandedElements);
			}
			treeViewerWithColumns.setSelection(selection, true);
			//TODO need to set the TreeCursor row, so that Properties view is updated
		}
	}

	public void gotoMarker(IMarker marker) {
		try {
			EObject eObject = null;
			Object markerURIAttr = marker.getAttribute(EValidator.URI_ATTRIBUTE);
			if (markerURIAttr != null) {
				URI markerURI = URI.createURI(markerURIAttr.toString());
				eObject = resource.getEObject(markerURI.fragment());
			}
			if (eObject != null && eObject instanceof NamedElement) {
				IStructuredSelection rootSelection = new StructuredSelection(
						((NamedElement)eObject).getNearestPackage());
				getSite().getSelectionProvider().setSelection(rootSelection);

				IStructuredSelection selection = new StructuredSelection(eObject);
				selectReveal(selection);
			}
			
		} catch (CoreException e) {
			//ignore this marker
		}
	}

}
