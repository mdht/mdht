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

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.ui.ViewerPane;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.ui.editor.ProblemEditorPart;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.nebula.widgets.xviewer.core.model.XViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.PropertySheetPage;

import traceability.LogEntry;
import traceability.Trace;
import traceability.TraceComment;
import traceability.TraceDiffs;
import traceability.TraceabilityFactory;
import traceability.presentation.table.TraceabilityViewer;
import traceability.presentation.table.TraceabilityViewerContentProvider;
import traceability.presentation.table.TraceabilityViewerFactory;
import traceability.presentation.table.TraceabilityViewerLabelProvider;
import traceability.provider.TraceabilityItemProviderAdapterFactory;
import traceability.util.TraceabilityUtils;

/**
 * The base class of the traceability matrix editor; many parts are generated by Eclipse. This class has abstract methods defining the final display of traces in subclasses
 */
public abstract class TraceabilityEditor extends MultiPageEditorPart implements IEditingDomainProvider, ISelectionProvider, IMenuListener, IViewerProvider, IDoubleClickListener, ISelectionListener, ISetSelectionTarget {
	/**
	 * The filters for file extensions supported by the editor. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<String> FILE_EXTENSION_FILTERS = prefixExtensions(TraceabilityModelWizard.FILE_EXTENSIONS, "*.");

	public Collection<TraceabilityViewer> ALL_TABLES = new ArrayList<TraceabilityViewer>();

	public boolean traceabilityFilters_EQ = false;

	public boolean traceabilityFilters_NEQ = true;

	public boolean traceabilityFilters_PLUS = true;

	public boolean traceabilityFilters_MINUS = true;

	public boolean traceabilityFilters_ERR = false;

	public boolean traceabilityFilters_ALL = false;

	public boolean traceabilityFilters_TREE = true;

	public static String DIFF_UNEQUAL = "" + (char) 450;

	public static String DIFF_EQUAL = "=";

	public static final Color COLOR_UNEQUAL = new Color(Display.getDefault(), 255, 255, 0);

	public static final Color COLOR_PLUS = new Color(Display.getDefault(), 202, 255, 202);

	public static final Color COLOR_MINUS = new Color(Display.getDefault(), 255, 202, 202);

	public static final Color COLOR_SEARCHFOREGROUND = new Color(Display.getDefault(), 255, 255, 255);

	public static final Color COLOR_SEARCHBACKGROUND = new Color(Display.getDefault(), 0, 150, 0);

	public static final Color COLOR_SELECTED = new Color(Display.getDefault(), 0xDA, 0xDA, 0xDA);

	public static final Color COLOR_HOT = new Color(Display.getDefault(), 0xEA, 0xEA, 0xEA);

	public static final Color COLOR_LINK = new Color(Display.getDefault(), 0, 0, 155);

	/**
	 * Fields to support manual tracing
	 */
	public EObject newTraceSource;
	public String newTraceSourceLabel;
	public XViewerColumn newTraceSourceColumn;

	/**
	 * Returns a new unmodifiable list containing prefixed versions of the extensions in the given list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static List<String> prefixExtensions(List<String> extensions, String prefix) {
		List<String> result = new ArrayList<String>();
		for (String extension : extensions) {
			result.add(prefix + extension);
		}
		return Collections.unmodifiableList(result);
	}

	/**
	 * This keeps track of the editing domain that is used to track all changes to the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AdapterFactoryEditingDomain editingDomain;

	/**
	 * This is the one adapter factory used for providing views of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComposedAdapterFactory adapterFactory;

	/**
	 * This is the content outline page. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IContentOutlinePage contentOutlinePage;

	/**
	 * This is a kludge... <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IStatusLineManager contentOutlineStatusLineManager;

	/**
	 * This is the content outline page's viewer. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TreeViewer contentOutlineViewer;

	/**
	 * This is the property sheet page. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected List<PropertySheetPage> propertySheetPages = new ArrayList<PropertySheetPage>();

	/**
	 * This is the viewer that shadows the selection in the content outline. The parent relation must be correctly defined for this to work. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TreeViewer selectionViewer;

	/**
	 * This inverts the roll of parent and child in the content provider and show parents as a tree. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TreeViewer parentViewer;

	/**
	 * This shows how a tree view works. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TreeViewer treeViewer;

	/**
	 * This shows how a list view works. A list viewer doesn't support icons. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ListViewer listViewer;

	/**
	 * This shows how a table view works. A table can be used as a list with icons. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TableViewer tableViewer;

	/**
	 * This shows how a tree view with columns works. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TreeViewer treeViewerWithColumns;

	/**
	 * This keeps track of the active viewer pane, in the book. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ViewerPane currentViewerPane;

	/**
	 * This keeps track of the active content viewer, which may be either one of the viewers in the pages or the content outline viewer. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Viewer currentViewer;

	/**
	 * This listens to which ever viewer is active. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ISelectionChangedListener selectionChangedListener;

	/**
	 * This keeps track of all the {@link org.eclipse.jface.viewers.ISelectionChangedListener}s that are listening to this editor. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();

	/**
	 * This keeps track of the selection of the editor as a whole. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ISelection editorSelection = StructuredSelection.EMPTY;

	/**
	 * This listens for when the outline becomes active <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IPartListener partListener = new IPartListener() {
		public void partActivated(IWorkbenchPart p) {
			if (p instanceof ContentOutline) {
				if (((ContentOutline) p).getCurrentPage() == contentOutlinePage) {
					getActionBarContributor().setActiveEditor(TraceabilityEditor.this);

					setCurrentViewer(contentOutlineViewer);
				}
			} else if (p instanceof PropertySheet) {
				if (propertySheetPages.contains(((PropertySheet) p).getCurrentPage())) {
					getActionBarContributor().setActiveEditor(TraceabilityEditor.this);
					handleActivate();
				}
			} else if (p == TraceabilityEditor.this) {
				handleActivate();
			}
		}

		public void partBroughtToTop(IWorkbenchPart p) {
			// Ignore.
		}

		public void partClosed(IWorkbenchPart p) {
			// Ignore.
		}

		public void partDeactivated(IWorkbenchPart p) {
			// Ignore.
		}

		public void partOpened(IWorkbenchPart p) {
			// Ignore.
		}
	};

	/**
	 * Resources that have been removed since last activation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Resource> removedResources = new ArrayList<Resource>();

	/**
	 * Resources that have been changed since last activation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Resource> changedResources = new ArrayList<Resource>();

	/**
	 * Resources that have been saved. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Resource> savedResources = new ArrayList<Resource>();

	/**
	 * Map to store the diagnostic associated with a resource. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Map<Resource, Diagnostic> resourceToDiagnosticMap = new LinkedHashMap<Resource, Diagnostic>();

	/**
	 * Controls whether the problem indication should be updated. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected boolean updateProblemIndication = true;

	/**
	 * Adapter used to update the problem indication when resources are demanded loaded. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EContentAdapter problemIndicationAdapter = new EContentAdapter() {
		@Override
		public void notifyChanged(Notification notification) {
			if (notification.getNotifier() instanceof Resource) {
				switch (notification.getFeatureID(Resource.class)) {
				case Resource.RESOURCE__IS_LOADED:
				case Resource.RESOURCE__ERRORS:
				case Resource.RESOURCE__WARNINGS: {
					Resource resource = (Resource) notification.getNotifier();
					Diagnostic diagnostic = analyzeResourceProblems(resource, null);
					if (diagnostic.getSeverity() != Diagnostic.OK) {
						resourceToDiagnosticMap.put(resource, diagnostic);
					} else {
						resourceToDiagnosticMap.remove(resource);
					}

					if (updateProblemIndication) {
						getSite().getShell().getDisplay().asyncExec(new Runnable() {
							public void run() {
								updateProblemIndication();
							}
						});
					}
					break;
				}
				}
			} else {
				super.notifyChanged(notification);
			}
		}

		@Override
		protected void setTarget(Resource target) {
			basicSetTarget(target);
		}

		@Override
		protected void unsetTarget(Resource target) {
			basicUnsetTarget(target);
			resourceToDiagnosticMap.remove(target);
			if (updateProblemIndication) {
				getSite().getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						updateProblemIndication();
					}
				});
			}
		}
	};

	protected boolean showDiffControls;

	protected TraceDiffs traceDiffs;

	protected int tabEMFTree;

	protected Tracing tracing;

	/**
	 * Handles activation of the editor or it's associated views. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void handleActivate() {
		// Recompute the read only state.
		//
		if (editingDomain.getResourceToReadOnlyMap() != null) {
			editingDomain.getResourceToReadOnlyMap().clear();

			// Refresh any actions that may become enabled or disabled.
			//
			setSelection(getSelection());
		}

		if (!removedResources.isEmpty()) {
			if (handleDirtyConflict()) {
				getSite().getPage().closeEditor(TraceabilityEditor.this, false);
			} else {
				removedResources.clear();
				changedResources.clear();
				savedResources.clear();
			}
		} else if (!changedResources.isEmpty()) {
			changedResources.removeAll(savedResources);
			handleChangedResources();
			changedResources.clear();
			savedResources.clear();
		}
	}

	/**
	 * Handles what to do with changed resources on activation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void handleChangedResources() {
		if (!changedResources.isEmpty() && (!isDirty() || handleDirtyConflict())) {
			if (isDirty()) {
				changedResources.addAll(editingDomain.getResourceSet().getResources());
			}
			editingDomain.getCommandStack().flush();

			updateProblemIndication = false;
			for (Resource resource : changedResources) {
				if (resource.isLoaded()) {
					resource.unload();
					try {
						resource.load(Collections.EMPTY_MAP);
					} catch (IOException exception) {
						if (!resourceToDiagnosticMap.containsKey(resource)) {
							resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
						}
					}
				}
			}

			if (AdapterFactoryEditingDomain.isStale(editorSelection)) {
				setSelection(StructuredSelection.EMPTY);
			}

			updateProblemIndication = true;
			updateProblemIndication();
		}
	}

	/**
	 * Updates the problems indication with the information described in the specified diagnostic. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void updateProblemIndication() {
		if (updateProblemIndication) {
			BasicDiagnostic diagnostic = new BasicDiagnostic(Diagnostic.OK, "org.openhealthtools.mdht.metamodel.traceability.editor", 0, null, new Object[] { editingDomain.getResourceSet() });
			for (Diagnostic childDiagnostic : resourceToDiagnosticMap.values()) {
				if (childDiagnostic.getSeverity() != Diagnostic.OK) {
					diagnostic.add(childDiagnostic);
				}
			}

			int lastEditorPage = getPageCount() - 1;
			if (lastEditorPage >= 0 && getEditor(lastEditorPage) instanceof ProblemEditorPart) {
				((ProblemEditorPart) getEditor(lastEditorPage)).setDiagnostic(diagnostic);
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					setActivePage(lastEditorPage);
				}
			} else if (diagnostic.getSeverity() != Diagnostic.OK) {
				ProblemEditorPart problemEditorPart = new ProblemEditorPart();
				problemEditorPart.setDiagnostic(diagnostic);
				try {
					addPage(++lastEditorPage, problemEditorPart, getEditorInput());
					setPageText(lastEditorPage, problemEditorPart.getPartName());
					setActivePage(lastEditorPage);
					showTabs();
				} catch (PartInitException exception) {
					TraceabilityEditorPlugin.INSTANCE.log(exception);
				}
			}
		}
	}

	/**
	 * Shows a dialog that asks if conflicting changes should be discarded. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected boolean handleDirtyConflict() {
		return MessageDialog.openQuestion(getSite().getShell(), getString("_UI_FileConflict_label"), getString("_WARN_FileConflict"));
	}

	/**
	 * This creates a model editor. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public TraceabilityEditor() {
		super();
		initializeEditingDomain();
	}

	/**
	 * This sets up the editing domain for the model editor. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new TraceabilityItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// Create the command stack that will notify this editor as commands are executed.
		//
		BasicCommandStack commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to be the selection of the viewer with focus.
		//
		commandStack.addCommandStackListener(new CommandStackListener() {
			public void commandStackChanged(final EventObject event) {
				getContainer().getDisplay().asyncExec(new Runnable() {
					public void run() {
						firePropertyChange(IEditorPart.PROP_DIRTY);

						// Try to select the affected objects.
						//
						Command mostRecentCommand = ((CommandStack) event.getSource()).getMostRecentCommand();
						if (mostRecentCommand != null) {
							setSelectionToViewer(mostRecentCommand.getAffectedObjects());
						}
						for (Iterator<PropertySheetPage> i = propertySheetPages.iterator(); i.hasNext();) {
							PropertySheetPage propertySheetPage = i.next();
							if (propertySheetPage.getControl().isDisposed()) {
								i.remove();
							} else {
								propertySheetPage.refresh();
							}
						}
					}
				});
			}
		});

		// Create the editing domain with a special command stack.
		//
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>()) {

			{
				this.resourceSet = new AdapterFactoryEditingDomainResourceSet() {

					@Override
					public Resource getResource(URI uri, boolean loadOnDemand) {
						// apply fix, otherwise CDA base model is loaded multiple times!
						if (uri.toString().contains("///"))
							uri = URI.createURI(uri.toString().replace("///", "/"));
						return super.getResource(uri, loadOnDemand);
					}
					//
					// public java.util.Map<Object, Object> getLoadOptions() {
					// XMLOptionsImpl o = new XMLOptionsImpl();
					// super.getLoadOptions().put(XMLResource.OPTION_XML_OPTIONS, o);
					// o.setProcessSchemaLocations(true);
					// return super.getLoadOptions();
					// }
				};
			}

		};
	}

	/**
	 * This is here for the listener to be able to call it. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void firePropertyChange(int action) {
		super.firePropertyChange(action);
	}

	/**
	 * This sets the selection into whichever viewer is active. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSelectionToViewer(Collection<?> collection) {
		final Collection<?> theSelection = collection;
		// Make sure it's okay.
		//
		if (theSelection != null && !theSelection.isEmpty()) {
			Runnable runnable = new Runnable() {
				public void run() {
					// Try to select the items in the current content viewer of the editor.
					//
					if (currentViewer != null) {
						currentViewer.setSelection(new StructuredSelection(theSelection.toArray()), true);
					}
				}
			};
			getSite().getShell().getDisplay().asyncExec(runnable);
		}
	}

	/**
	 * This returns the editing domain as required by the {@link IEditingDomainProvider} interface. This is important for implementing the static methods of {@link AdapterFactoryEditingDomain} and for supporting {@link org.eclipse.emf.edit.ui.action.CommandAction}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public class ReverseAdapterFactoryContentProvider extends AdapterFactoryContentProvider {
		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public ReverseAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		@Override
		public Object[] getElements(Object object) {
			Object parent = super.getParent(object);
			return (parent == null ? Collections.EMPTY_SET : Collections.singleton(parent)).toArray();
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		@Override
		public Object[] getChildren(Object object) {
			Object parent = super.getParent(object);
			return (parent == null ? Collections.EMPTY_SET : Collections.singleton(parent)).toArray();
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		@Override
		public boolean hasChildren(Object object) {
			Object parent = super.getParent(object);
			return parent != null;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		@Override
		public Object getParent(Object object) {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCurrentViewerPane(ViewerPane viewerPane) {
		if (currentViewerPane != viewerPane) {
			if (currentViewerPane != null) {
				currentViewerPane.showFocus(false);
			}
			currentViewerPane = viewerPane;
		}
		setCurrentViewer(currentViewerPane.getViewer());
	}

	/**
	 * This makes sure that one content viewer, either for the current page or the outline view, if it has focus, is the current one. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCurrentViewer(Viewer viewer) {
		// If it is changing...
		//
		if (currentViewer != viewer) {
			if (selectionChangedListener == null) {
				// Create the listener on demand.
				//
				selectionChangedListener = new ISelectionChangedListener() {
					// This just notifies those things that are affected by the section.
					//
					public void selectionChanged(SelectionChangedEvent selectionChangedEvent) {
						setSelection(selectionChangedEvent.getSelection());
					}
				};
			}

			// Stop listening to the old one.
			//
			if (currentViewer != null) {
				currentViewer.removeSelectionChangedListener(selectionChangedListener);
			}

			// Start listening to the new one.
			//
			if (viewer != null) {
				viewer.addSelectionChangedListener(selectionChangedListener);
			}

			if (currentViewer instanceof TraceabilityViewer && viewer == selectionViewer) {
				TraceabilityViewer v = (TraceabilityViewer) currentViewer;
				ISelection sel = v.getSelection();
				if (!sel.isEmpty() && sel instanceof StructuredSelection && v.getClickedColumn() != null) {
					StructuredSelection structuredSelection = (StructuredSelection) sel;
					XViewerColumn xCol = (XViewerColumn) v.getClickedColumn().getData();
					EObject ob = getColumnSpecificElement(xCol, structuredSelection.getFirstElement());
					if (v.tracing.getTraceDiff(ob) != null)
						selectionViewer.setSelection(new StructuredSelection(v.tracing.getTraceDiff(ob)));
					else if (v.tracing.getTrace(ob) != null)
						selectionViewer.setSelection(new StructuredSelection(v.tracing.getTrace(ob)));
					else if (ob instanceof LogEntry)
						selectionViewer.setSelection(new StructuredSelection(ob));
				}
			}

			// Remember it.
			//
			currentViewer = viewer;

			// Set the editors selection based on the current viewer's selection.
			//
			setSelection(currentViewer == null ? StructuredSelection.EMPTY : currentViewer.getSelection());
		}
	}

	/**
	 * This returns the viewer as required by the {@link IViewerProvider} interface. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Viewer getViewer() {
		return currentViewer;
	}

	/**
	 * This creates a context menu for the viewer and adds a listener as well registering the menu for extension. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createContextMenuFor(StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp");
		contextMenu.add(new Separator("additions"));
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu = contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(viewer));

		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance(), LocalSelectionTransfer.getTransfer(), FileTransfer.getInstance() };
		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
		viewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(editingDomain, viewer));
	}

	/**
	 * This is the method called to load a resource into the editing domain's resource set based on the editor's input. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createModel() {
		URI resourceURI = EditUIUtil.getURI(getEditorInput());
		Exception exception = null;
		Resource resource = null;
		try {
			if (getEditorInput() instanceof ReuseURIEditorInput) {
				ReuseURIEditorInput tempURIEditorInput = (ReuseURIEditorInput) getEditorInput();
				editingDomain.getResourceSet().getResources().addAll(tempURIEditorInput.getResourceSet().getResources());
			}
			// Load the resource through the editing domain.
			//
			resource = editingDomain.getResourceSet().getResource(resourceURI, true);
		} catch (Exception e) {
			exception = e;
			resource = editingDomain.getResourceSet().getResource(resourceURI, false);
		}

		Diagnostic diagnostic = analyzeResourceProblems(resource, exception);
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
		}
		editingDomain.getResourceSet().eAdapters().add(problemIndicationAdapter);
	}

	/**
	 * Returns a diagnostic describing the errors and warnings listed in the resource and the specified exception (if any). <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Diagnostic analyzeResourceProblems(Resource resource, Exception exception) {
		if (!resource.getErrors().isEmpty() || !resource.getWarnings().isEmpty()) {
			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, "org.openhealthtools.mdht.metamodel.traceability.editor", 0, getString("_UI_CreateModelError_message", resource.getURI()), new Object[] { exception == null ? (Object) resource : exception });
			basicDiagnostic.merge(EcoreUtil.computeDiagnostic(resource, true));
			return basicDiagnostic;
		} else if (exception != null) {
			return new BasicDiagnostic(Diagnostic.ERROR, "org.openhealthtools.mdht.metamodel.traceability.editor", 0, getString("_UI_CreateModelError_message", resource.getURI()), new Object[] { exception });
		} else {
			return Diagnostic.OK_INSTANCE;
		}
	}

	/**
	 * This is the method used by the framework to install your own controls. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void createPages() {
		// Creates the model from the editor input
		//
		createModel();

		// Only creates the other pages if there is something that can be edited
		//
		if (!getEditingDomain().getResourceSet().getResources().isEmpty()) {

			for (EObject eObject : editingDomain.getResourceSet().getResources().get(0).getContents()) {
				if (eObject instanceof TraceDiffs) {
					traceDiffs = (TraceDiffs) eObject;
					showDiffControls = true;
				}
			}

			createViews();

			// Create a page for the EMF tree view.
			//
			if (!includeView("EMF Tree")) {
				tabEMFTree = -1;
			} else {
				ViewerPane viewerPane = new ViewerPane(getSite().getPage(), TraceabilityEditor.this) {
					@Override
					public Viewer createViewer(Composite composite) {
						Tree tree = new Tree(composite, SWT.MULTI);
						TreeViewer newTreeViewer = new TreeViewer(tree);
						return newTreeViewer;
					}

					@Override
					public void requestActivation() {
						super.requestActivation();
						setCurrentViewer(this.getViewer());
						// setCurrentViewerPane(this);
					}
				};
				viewerPane.createControl(getContainer());
				PlatformUI.getWorkbench().getHelpSystem().setHelp(viewerPane.getControl(), "org.openhealthtools.mdht.metamodel.traceability.editor.EMFTree");

				selectionViewer = (TreeViewer) viewerPane.getViewer();
				selectionViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));

				selectionViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
				selectionViewer.setInput(editingDomain.getResourceSet());
				selectionViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);
				viewerPane.setTitle(editingDomain.getResourceSet());

				new AdapterFactoryTreeEditor(selectionViewer.getTree(), adapterFactory);

				selectionViewer.addDoubleClickListener(new IDoubleClickListener() {

					@Override
					public void doubleClick(DoubleClickEvent event) {
						TraceUtils.doubleClick(event, TraceabilityEditor.this);
					}
				});

				createContextMenuFor(selectionViewer);
				int pageIndex = addPage(viewerPane.getControl());
				setPageText(pageIndex, getString("_UI_SelectionPage_label"));
				tabEMFTree = pageIndex;
			}

			getSite().getShell().getDisplay().asyncExec(new Runnable() {
				public void run() {
					if (getPageCount() > 0)
						setActivePage(0);
				}
			});
		}

		// Ensures that this editor will only display the page's tab
		// area if there are more than one page
		//
		getContainer().addControlListener(new ControlAdapter() {
			boolean guard = false;

			@Override
			public void controlResized(ControlEvent event) {
				if (!guard) {
					guard = true;
					hideTabs();
					guard = false;
				}
			}
		});

		getSite().getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				updateProblemIndication();
			}
		});
		getSite().getPage().addSelectionListener(this);
	}

	abstract protected void createViews();

	/**
	 * Creates a table view with the given parameters
	 * 
	 * @param tabName
	 *            The text appearing on the tab
	 * @param autoExpandLevel
	 *            pass <code>-1</code> if no tree is to be displayed. Any other well will result in trying to display a tree suitable for the first column passed in <code>columns</code> and the tree will be auto-expanded to the tree level indicated by this parameter
	 * @param help
	 *            The last part of the F1 context id to be used for the table in the help system
	 * @param columns
	 *            the columns to be displayed. If <code>autoExpandLevel</code> is not <code>-1</code>, the first column in this array will determine the type of tree structure to be build up
	 * 
	 * @return the page index for the created tab
	 * 
	 */
	protected int createView(String tabName, final int autoExpandLevel, String help, final XViewerColumn... columns) {
		{
			if (!includeView(tabName)) {
				return -1;
			}

			Composite composite = new Composite(getContainer(), SWT.NONE);
			composite.setLayout(new GridLayout());
			composite.setLayoutData(new GridData(GridData.FILL_BOTH | GridData.HORIZONTAL_ALIGN_BEGINNING));
			if (help != null)
				PlatformUI.getWorkbench().getHelpSystem().setHelp(composite, "org.openhealthtools.mdht.metamodel.traceability.editor." + help);

			TraceabilityViewer viewer = new TraceabilityViewer(this, composite, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION, new TraceabilityViewerFactory(getNamespace(), autoExpandLevel != -1, getAllColumns(), columns));

			ALL_TABLES.add(viewer);

			if (autoExpandLevel != -1)
				viewer.setAutoExpandLevel(autoExpandLevel);
			viewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
			viewer.setContentProvider(new TraceabilityViewerContentProvider(viewer) {
				@Override
				protected void organizeTree() {
					if (autoExpandLevel == -1 || columns.length == 0)
						return;
					organizeTreeForColumn(columns[0], parents);
				}
			});
			viewer.setLabelProvider(new TraceabilityViewerLabelProvider(viewer));

			createFilters(composite, viewer);

			int pageIndex = addPage(composite);
			setPageText(pageIndex, tabName);
			return pageIndex;
		}
	}

	abstract public String getNamespace();

	abstract protected void organizeTreeForColumn(XViewerColumn column, List<Object> parents);

	/**
	 * @param tabName
	 * @return
	 */
	protected boolean includeView(String tabName) {
		String showTraceViews = System.getProperty("showTraceViews");
		if (showTraceViews != null) {
			String normalizedShowTraceViews = showTraceViews.replace(" ", "").toLowerCase();
			String normalizedTabName = tabName.replace(" ", "").toLowerCase();
			if (!Arrays.asList(normalizedShowTraceViews.split(",")).contains(normalizedTabName)) {
				return false;
			}
		}
		return true;
	}

	public void updateTables() {
		for (TraceabilityViewer table : ALL_TABLES) {
			if (!table.getControl().isDisposed()) {
				table.updateRows();
			}
		}
	}

	/**
	 * @param composite
	 * @param viewer
	 */
	private void createFilters(Composite composite, final TraceabilityViewer viewer) {
		composite.setData(viewer);
		Composite traceabilityFilters = new Composite(composite, SWT.NONE);
		GridLayout layout = new GridLayout(10, false);
		layout.horizontalSpacing = 50;
		traceabilityFilters.setLayout(layout);

		final Button errButton = viewer.errButton = new Button(traceabilityFilters, SWT.CHECK);
		errButton.setToolTipText("Show rows with errors only (see Error column)");
		errButton.setText("E");
		errButton.setSelection(traceabilityFilters_ERR);
		errButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent event) {
				traceabilityFilters_ERR = errButton.getSelection();
				updateTables();
			}
		});
		PlatformUI.getWorkbench().getHelpSystem().setHelp(errButton, "org.openhealthtools.mdht.metamodel.traceability.editor.tablecustomization");

		final Button allButton = viewer.allButton = new Button(traceabilityFilters, SWT.CHECK);
		allButton.setToolTipText("Show all values (i.e. do not blank out repetitions)");
		allButton.setText("A");
		allButton.setSelection(traceabilityFilters_ALL);
		allButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent event) {
				traceabilityFilters_ALL = allButton.getSelection();
				updateTables();
			}
		});
		PlatformUI.getWorkbench().getHelpSystem().setHelp(allButton, "org.openhealthtools.mdht.metamodel.traceability.editor.tablecustomization");

		final Button treeButton = viewer.treeButton = new Button(traceabilityFilters, SWT.CHECK);
		treeButton.setToolTipText("Enable trees");
		treeButton.setText("T");
		treeButton.setSelection(traceabilityFilters_TREE);
		treeButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent event) {
				traceabilityFilters_TREE = treeButton.getSelection();
				updateTables();
			}
		});
		PlatformUI.getWorkbench().getHelpSystem().setHelp(treeButton, "org.openhealthtools.mdht.metamodel.traceability.editor.tablecustomization");

		if (showDiffControls) {
			final Button equalButton = viewer.equalButton = new Button(traceabilityFilters, SWT.CHECK);
			equalButton.setToolTipText("Show traces common in all models with equal attribute values");
			equalButton.setText(DIFF_EQUAL);
			equalButton.setSelection(traceabilityFilters_EQ);
			equalButton.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent event) {
					traceabilityFilters_EQ = equalButton.getSelection();
					updateTables();
				}
			});
			PlatformUI.getWorkbench().getHelpSystem().setHelp(equalButton, "org.openhealthtools.mdht.metamodel.traceability.editor.tracedifffiltering");

			final Button unequalButton = viewer.unequalButton = new Button(traceabilityFilters, SWT.CHECK);
			unequalButton.setToolTipText("Show traces common in all models but differing in at least attribute value");
			unequalButton.setText(DIFF_UNEQUAL);
			unequalButton.setSelection(traceabilityFilters_NEQ);
			unequalButton.setBackground(COLOR_UNEQUAL);
			unequalButton.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent event) {
					traceabilityFilters_NEQ = unequalButton.getSelection();
					updateTables();
				}
			});
			PlatformUI.getWorkbench().getHelpSystem().setHelp(unequalButton, "org.openhealthtools.mdht.metamodel.traceability.editor.tracedifffiltering");

			final Button plusButton = viewer.plusButton = new Button(traceabilityFilters, SWT.CHECK);
			if (0 < this.traceDiffs.getComparedTraces().size())
				plusButton.setToolTipText("Show traces of " + TraceUtils.withoutTags(TraceabilityUtils.getProjectName(this.traceDiffs.getComparedTraces().get(0))));
			plusButton.setText("+");
			plusButton.setSelection(traceabilityFilters_PLUS);
			plusButton.setBackground(COLOR_PLUS);
			plusButton.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent event) {
					traceabilityFilters_PLUS = plusButton.getSelection();
					updateTables();
				}
			});
			PlatformUI.getWorkbench().getHelpSystem().setHelp(plusButton, "org.openhealthtools.mdht.metamodel.traceability.editor.tracedifffiltering");

			final Button minusButton = viewer.minusButton = new Button(traceabilityFilters, SWT.CHECK);
			if (1 < this.traceDiffs.getComparedTraces().size())
				minusButton.setToolTipText("Show traces of " + TraceUtils.withoutTags(TraceabilityUtils.getProjectName(this.traceDiffs.getComparedTraces().get(1))));
			minusButton.setText("-");
			minusButton.setSelection(traceabilityFilters_MINUS);
			minusButton.setBackground(COLOR_MINUS);
			minusButton.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent event) {
					traceabilityFilters_MINUS = minusButton.getSelection();
					updateTables();
				}
			});
			PlatformUI.getWorkbench().getHelpSystem().setHelp(minusButton, "org.openhealthtools.mdht.metamodel.traceability.editor.tracedifffiltering");

		}

		{

			Composite filterControls = new Composite(traceabilityFilters, SWT.NONE);
			layout = new GridLayout(4, false);
			layout.horizontalSpacing = 6;
			filterControls.setLayout(layout);
			PlatformUI.getWorkbench().getHelpSystem().setHelp(filterControls, "org.openhealthtools.mdht.metamodel.traceability.editor.filterexpression");

			Label label = new Label(filterControls, SWT.NONE);
			label.setText("Filter:");
			GridData gd = new GridData(SWT.RIGHT, SWT.NONE, false, false);
			label.setLayoutData(gd);

			final Text filterText = new Text(filterControls, SWT.SINGLE | SWT.BORDER);
			gd = new GridData(SWT.RIGHT, SWT.NONE, false, false);
			gd.widthHint = 100;
			filterText.setLayoutData(gd);

			final Button regularExpression = new Button(filterControls, SWT.CHECK);
			filterText.setToolTipText("Filter rows by a search string");
			filterText.addKeyListener(new KeyListener() {
				@Override
				public void keyPressed(KeyEvent e) {
					// do nothing
				}

				@Override
				public void keyReleased(KeyEvent e) {
					boolean filterRealTime = false;
					if (e.keyCode == SWT.CR || e.keyCode == SWT.KEYPAD_CR || filterRealTime) {
						viewer.setFilterText(filterText.getText(), regularExpression.getSelection());
						viewer.expandAll();
						// viewer.getCustomizeMgr().setFilterText(newText, regularExpression.getSelection());
					}
				}
			});
			fixClipboardOperations(filterText);

			regularExpression.setText("RE");
			regularExpression.setToolTipText("Enable as regular expression");
			regularExpression.setLayoutData(new GridData(SWT.RIGHT, SWT.NONE, false, false));
			regularExpression.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					viewer.setFilterText(filterText.getText(), regularExpression.getSelection());
				}

			});

			Resource resource = editingDomain.getResourceSet().getResources().get(0);
			String query = resource.getURI().query();
			if (query != null) {
				for (String queryPart : query.split("&")) {
					String[] pair = queryPart.split("=");
					if (pair.length == 2) {
						String name = pair[0];
						String value = pair[1];
						if ("filter".equals(name)) {
							filterText.setText(value);
							viewer.setFilterText(filterText.getText(), regularExpression.getSelection());
						}
						if ("re".equals(name)) {
							regularExpression.setSelection(Boolean.valueOf(value));
							viewer.setFilterText(filterText.getText(), regularExpression.getSelection());
						}
					}
				}
			}

		}
		{

			Composite filterControls = new Composite(traceabilityFilters, SWT.NONE);
			layout = new GridLayout(4, false);
			layout.horizontalSpacing = 6;
			filterControls.setLayout(layout);
			PlatformUI.getWorkbench().getHelpSystem().setHelp(filterControls, "org.openhealthtools.mdht.metamodel.traceability.editor.searchexpression");

			Label label = new Label(filterControls, SWT.NONE);
			label.setText("Search:");
			GridData gd = new GridData(SWT.RIGHT, SWT.NONE, false, false);
			label.setLayoutData(gd);

			final Text filterText = new Text(filterControls, SWT.SINGLE | SWT.BORDER);
			gd = new GridData(SWT.RIGHT, SWT.NONE, false, false);
			gd.widthHint = 100;
			filterText.setLayoutData(gd);

			filterText.addListener(SWT.KeyDown, new Listener() {
				public void handleEvent(Event event) {
					if (event.stateMask == SWT.CTRL && event.keyCode == 'g') {
						viewer.searchRowsIndex++;
						if (viewer.searchRowsIndex == viewer.searchRows.size())
							viewer.searchRowsIndex = 0;
						if (viewer.searchRowsIndex < viewer.searchRows.size())
							viewer.setSelection(new StructuredSelection(viewer.searchRows.get(viewer.searchRowsIndex)), true);
						event.doit = false;
					}
				}
			});

			fixClipboardOperations(filterText);

			final Button regularExpression = new Button(filterControls, SWT.CHECK);
			filterText.setToolTipText("Search rows by a search string");
			filterText.addKeyListener(new KeyListener() {
				@Override
				public void keyPressed(KeyEvent e) {
					// do nothing
				}

				@Override
				public void keyReleased(KeyEvent e) {
					boolean filterRealTime = false;
					if (e.keyCode == SWT.CR || e.keyCode == SWT.KEYPAD_CR || filterRealTime) {
						viewer.setSearchText(filterText.getText(), regularExpression.getSelection());
						// viewer.getCustomizeMgr().setFilterText(newText, regularExpression.getSelection());
					}
				}
			});

			regularExpression.setText("RE");
			regularExpression.setToolTipText("Enable as regular expression");
			regularExpression.setLayoutData(new GridData(SWT.RIGHT, SWT.NONE, false, false));
			regularExpression.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					viewer.setSearchText(filterText.getText(), regularExpression.getSelection());
				}

			});

		}

	}

	/**
	 * @param text
	 */
	private void fixClipboardOperations(final Text text) {
		text.addListener(SWT.KeyUp, new Listener() {
			public void handleEvent(Event event) {
				if (((event.stateMask & SWT.CTRL) == SWT.CTRL || (event.stateMask & SWT.COMMAND) == SWT.COMMAND) && event.keyCode == 'v') {
					text.paste();
				}
				if (((event.stateMask & SWT.CTRL) == SWT.CTRL || (event.stateMask & SWT.COMMAND) == SWT.COMMAND) && event.keyCode == 'c') {
					text.copy();
				}
			}
		});
	}

	/**
	 * If there is just one page in the multi-page editor part, this hides the single tab at the bottom. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void hideTabs() {
		if (getPageCount() <= 1) {
			setPageText(0, "");
			if (getContainer() instanceof CTabFolder) {
				((CTabFolder) getContainer()).setTabHeight(1);
				Point point = getContainer().getSize();
				getContainer().setSize(point.x, point.y + 6);
			}
		}
	}

	/**
	 * If there is more than one page in the multi-page editor part, this shows the tabs at the bottom. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void showTabs() {
		if (getPageCount() > 1) {
			setPageText(0, getString("_UI_SelectionPage_label"));
			if (getContainer() instanceof CTabFolder) {
				((CTabFolder) getContainer()).setTabHeight(SWT.DEFAULT);
				Point point = getContainer().getSize();
				getContainer().setSize(point.x, point.y - 6);
			}
		}
	}

	/**
	 * This is used to track the active viewer. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	protected void pageChange(int pageIndex) {
		super.pageChange(pageIndex);

		Object selectedPage = getSelectedPage();
		if (selectedPage instanceof Composite) {
			Composite composite = (Composite) selectedPage;
			if (composite.getData() instanceof Viewer) {
				Viewer viewer = (Viewer) composite.getData();
				if (viewer.getInput() == null)
					viewer.setInput(getOrCreateTracing());
				setCurrentViewer(viewer);
			}
		}

		if (contentOutlinePage != null) {
			handleContentOutlineSelection(contentOutlinePage.getSelection());
		}
	}

	protected final Object getOrCreateTracing() {
		if (tracing == null) {
			tracing = createTracing();
		}
		return tracing;
	}

	protected Tracing createTracing() {
		Tracing result = new Tracing(getInput());
		return result;
	}

	/**
	 * This is how the framework determines which interfaces we implement. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IContentOutlinePage.class)) {
			return showOutlineView() ? getContentOutlinePage() : null;
		} else if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		} else {
			return super.getAdapter(key);
		}
	}

	/**
	 * This accesses a cached version of the content outliner. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IContentOutlinePage getContentOutlinePage() {
		if (contentOutlinePage == null) {
			// The content outline is just a tree.
			//
			class MyContentOutlinePage extends ContentOutlinePage {
				@Override
				public void createControl(Composite parent) {
					super.createControl(parent);
					contentOutlineViewer = getTreeViewer();
					contentOutlineViewer.addSelectionChangedListener(this);

					// Set up the tree viewer.
					//
					contentOutlineViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
					contentOutlineViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
					contentOutlineViewer.setInput(editingDomain.getResourceSet());

					// Make sure our popups work.
					//
					createContextMenuFor(contentOutlineViewer);

					if (!editingDomain.getResourceSet().getResources().isEmpty()) {
						// Select the root object in the view.
						//
						contentOutlineViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);
					}
				}

				@Override
				public void makeContributions(IMenuManager menuManager, IToolBarManager toolBarManager, IStatusLineManager statusLineManager) {
					super.makeContributions(menuManager, toolBarManager, statusLineManager);
					contentOutlineStatusLineManager = statusLineManager;
				}

				@Override
				public void setActionBars(IActionBars actionBars) {
					super.setActionBars(actionBars);
					getActionBarContributor().shareGlobalActions(this, actionBars);
				}
			}

			contentOutlinePage = new MyContentOutlinePage();

			// Listen to selection so that we can handle it is a special way.
			//
			contentOutlinePage.addSelectionChangedListener(new ISelectionChangedListener() {
				// This ensures that we handle selections correctly.
				//
				public void selectionChanged(SelectionChangedEvent event) {
					handleContentOutlineSelection(event.getSelection());
				}
			});
		}

		return contentOutlinePage;
	}

	/**
	 * This accesses a cached version of the property sheet. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IPropertySheetPage getPropertySheetPage() {
		PropertySheetPage propertySheetPage = new ExtendedPropertySheetPage(editingDomain) {
			@Override
			public void setSelectionToViewer(List<?> selection) {
				TraceabilityEditor.this.setSelectionToViewer(selection);
				TraceabilityEditor.this.setFocus();
			}

			@Override
			public void setActionBars(IActionBars actionBars) {
				super.setActionBars(actionBars);
				getActionBarContributor().shareGlobalActions(this, actionBars);
			}
		};
		propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory));
		propertySheetPages.add(propertySheetPage);

		return propertySheetPage;
	}

	/**
	 * This deals with how we want selection in the outliner to affect the other views. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void handleContentOutlineSelection(ISelection selection) {
		if (currentViewerPane != null && !selection.isEmpty() && selection instanceof IStructuredSelection) {
			Iterator<?> selectedElements = ((IStructuredSelection) selection).iterator();
			if (selectedElements.hasNext()) {
				// Get the first selected element.
				//
				Object selectedElement = selectedElements.next();

				// If it's the selection viewer, then we want it to select the same selection as this selection.
				//
				if (currentViewerPane.getViewer() == selectionViewer) {
					ArrayList<Object> selectionList = new ArrayList<Object>();
					selectionList.add(selectedElement);
					while (selectedElements.hasNext()) {
						selectionList.add(selectedElements.next());
					}

					// Set the selection to the widget.
					//
					selectionViewer.setSelection(new StructuredSelection(selectionList));
				} else {
					// Set the input to the widget.
					//
					if (currentViewerPane.getViewer().getInput() != selectedElement) {
						currentViewerPane.getViewer().setInput(selectedElement);
						currentViewerPane.setTitle(selectedElement);
					}
				}
			}
		}
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply tests the command stack. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isDirty() {
		return ((BasicCommandStack) editingDomain.getCommandStack()).isSaveNeeded();
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply saves the model file. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		// Save only resources that have actually changed.
		//
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		saveOptions.put(Resource.OPTION_LINE_DELIMITER, Resource.OPTION_LINE_DELIMITER_UNSPECIFIED);

		// Do the work within an operation because this is a long running activity that modifies the workbench.
		//
		IRunnableWithProgress operation = new IRunnableWithProgress() {
			// This is the method that gets invoked when the operation runs.
			//
			public void run(IProgressMonitor monitor) {
				// Save the resources to the file system.
				//
				boolean first = true;
				for (Resource resource : editingDomain.getResourceSet().getResources()) {
					if ((first || !resource.getContents().isEmpty() || isPersisted(resource)) && !editingDomain.isReadOnly(resource)) {
						try {
							long timeStamp = resource.getTimeStamp();
							resource.save(saveOptions);
							if (resource.getTimeStamp() != timeStamp) {
								savedResources.add(resource);
							}
						} catch (Exception exception) {
							resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
						}
						first = false;
					}
				}
			}
		};

		updateProblemIndication = false;
		try {
			// This runs the options, and shows progress.
			//
			new ProgressMonitorDialog(getSite().getShell()).run(true, false, operation);

			// Refresh the necessary state.
			//
			((BasicCommandStack) editingDomain.getCommandStack()).saveIsDone();
			firePropertyChange(IEditorPart.PROP_DIRTY);
		} catch (Exception exception) {
			// Something went wrong that shouldn't.
			//
			TraceabilityEditorPlugin.INSTANCE.log(exception);
		}
		updateProblemIndication = true;
		updateProblemIndication();
	}

	/**
	 * This returns whether something has been persisted to the URI of the specified resource. The implementation uses the URI converter from the editor's resource set to try to open an input stream. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected boolean isPersisted(Resource resource) {
		boolean result = false;
		try {
			InputStream stream = editingDomain.getResourceSet().getURIConverter().createInputStream(resource.getURI());
			if (stream != null) {
				result = true;
				stream.close();
			}
		} catch (IOException e) {
			// Ignore
		}
		return result;
	}

	/**
	 * This always returns true because it is not currently supported. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * This also changes the editor's input. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void doSaveAs() {
		new ResourceDialog(getSite().getShell(), null, SWT.NONE) {
			@Override
			protected boolean isSave() {
				return true;
			}

			@Override
			protected boolean processResources() {
				List<URI> uris = getURIs();
				if (uris.size() > 0) {
					URI uri = uris.get(0);
					doSaveAs(uri, new URIEditorInput(uri));
					return true;
				} else {
					return false;
				}
			}
		}.open();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void doSaveAs(URI uri, IEditorInput editorInput) {
		(editingDomain.getResourceSet().getResources().get(0)).setURI(uri);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		IProgressMonitor progressMonitor = getActionBars().getStatusLineManager() != null ? getActionBars().getStatusLineManager().getProgressMonitor() : new NullProgressMonitor();
		doSave(progressMonitor);
	}

	/**
	 * This is called during startup. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void init(IEditorSite site, IEditorInput editorInput) {
		setSite(site);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		site.setSelectionProvider(this);
		site.getPage().addPartListener(partListener);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFocus() {
		if (currentViewerPane != null) {
			currentViewerPane.setFocus();
		} else {
			getControl(getActivePage()).setFocus();
		}
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to return this editor's overall selection. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ISelection getSelection() {
		return editorSelection;
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to set this editor's overall selection. Calling this result will notify the listeners. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSelection(ISelection selection) {
		editorSelection = selection;

		for (ISelectionChangedListener listener : selectionChangedListeners) {
			listener.selectionChanged(new SelectionChangedEvent(this, selection));
		}
		setStatusLineManager(selection);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStatusLineManager(ISelection selection) {
		IStatusLineManager statusLineManager = currentViewer != null && currentViewer == contentOutlineViewer ? contentOutlineStatusLineManager : getActionBars().getStatusLineManager();

		if (statusLineManager != null) {
			if (selection instanceof IStructuredSelection) {
				Collection<?> collection = ((IStructuredSelection) selection).toList();
				switch (collection.size()) {
				case 0: {
					statusLineManager.setMessage(getString("_UI_NoObjectSelected"));
					break;
				}
				case 1: {
					String text = new AdapterFactoryItemDelegator(adapterFactory).getText(collection.iterator().next());
					statusLineManager.setMessage(getString("_UI_SingleObjectSelected", text));
					break;
				}
				default: {
					statusLineManager.setMessage(getString("_UI_MultiObjectSelected", Integer.toString(collection.size())));
					break;
				}
				}
			} else {
				statusLineManager.setMessage("");
			}
		}
	}

	/**
	 * This looks up a string in the plugin's plugin.properties file. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected String getString(String key) {
		return TraceabilityEditorPlugin.INSTANCE.getString(key);
	}

	/**
	 * This looks up a string in plugin.properties, making a substitution. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static String getString(String key, Object s1) {
		return TraceabilityEditorPlugin.INSTANCE.getString(key, new Object[] { s1 });
	}

	/**
	 * This implements {@link org.eclipse.jface.action.IMenuListener} to help fill the context menus with contributions from the Edit menu. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void menuAboutToShow(IMenuManager menuManager) {
		((IMenuListener) getEditorSite().getActionBarContributor()).menuAboutToShow(menuManager);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EditingDomainActionBarContributor getActionBarContributor() {
		return (EditingDomainActionBarContributor) getEditorSite().getActionBarContributor();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IActionBars getActionBars() {
		return getActionBarContributor().getActionBars();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void dispose() {
		updateProblemIndication = false;

		getSite().getPage().removeSelectionListener(this);
		getSite().getPage().removePartListener(partListener);

		adapterFactory.dispose();

		if (getActionBarContributor().getActiveEditor() == this) {
			getActionBarContributor().setActiveEditor(null);
		}

		for (PropertySheetPage propertySheetPage : propertySheetPages) {
			propertySheetPage.dispose();
		}

		if (contentOutlinePage != null) {
			contentOutlinePage.dispose();
		}

		super.dispose();
	}

	/**
	 * Returns whether the outline view should be presented to the user. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected boolean showOutlineView() {
		return true;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void doubleClick(DoubleClickEvent event) {
		if (this.getActivePage() != -1)
			TraceUtils.doubleClick(event, this);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		TraceUtils.selectionChanged(part, selection, this);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void selectReveal(ISelection selection) {
		setSelectionToViewer(((IStructuredSelection) selection).toList());
	}

	public void activateEMFTree() {
		if (tabEMFTree != -1) {
			setActivePage(tabEMFTree);
		}
	}

	protected Resource getInput() {
		return editingDomain.getResourceSet().getResources().get(0);
	}

	public void openElement(Object element, XViewerColumn xCol, Object toOpen) {
		if (toOpen instanceof EObject) {
			EObject eObject = (EObject) toOpen;
			if (this.getInput() == eObject.eResource())
				activateEMFTree();
			else
				TraceUtils.doubleClickFromSelf(Arrays.asList(eObject));
		}
	}

	public List<XViewerColumn> getCols() {
		return Collections.emptyList();
	}

	abstract protected List<XViewerColumn> getAllColumns();

	public <T> T findType(Class<T> cls, Object element) {
		return tracing.findType(cls, element);
	}

	/**
	 * @param element
	 * @param xCol
	 * @return the actual column a cell into the Fan-Out column is taken from
	 */
	abstract public XViewerColumn getRedirectedColumn(Object element, XViewerColumn xCol);

	/**
	 * Returns the column specifically contributing to the given column's textual content
	 * 
	 * @param viewerColumn
	 * @return
	 */
	public XViewerColumn getSourceColumn(XViewerColumn viewerColumn) {
		return viewerColumn;
	}

	abstract public Object getCellData(XViewerColumn viewerColumn, Object element);

	public Action manageComment(final XViewerColumn xCol, final EObject eObject, final Trace trace, final EObject fnarrowDown) {
		return null;
	}

	protected IInputValidator getCommentValidator() {
		return new IInputValidator() {
			public String isValid(String newText) {
				return (newText == null || newText.trim().length() == 0) ? " " : null; //$NON-NLS-1$
			}
		};
	}

	protected void setComment(Trace trace, String comment, XViewerColumn clinicalSafetyIssue_Col, EObject narrowDown) {
		TraceComment tc = TraceabilityFactory.eINSTANCE.createTraceComment();
		tc.setComment(comment);
		tc.setDate(new Date());
		tc.setUsername(TraceabilityUtils.getUsername());
		tc.setColumn(clinicalSafetyIssue_Col.getId());
		tc.setNarrowDown(narrowDown);
		trace.getComments().add(tc);

		// EditingDomain editingDomain = ((IEditingDomainProvider) activeView).getEditingDomain();
		// editingDomain.getCommandStack().execute(AddCommand.create(editingDomain, trace, TraceabilityPackage.eINSTANCE.getTrace_Comments(), tc));

		try {
			trace.eResource().save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		updateTables();
	}

	abstract public List<XViewerColumn> excludedColsFromDiffing();

	public XViewerColumn getColForDiffing(XViewerColumn xCol) {
		return xCol;
	}

	public boolean isErrorCol(XViewerColumn xCol) {
		return false;
	}

	abstract public String getLabel(Object element, XViewerColumn xCol, int columnIndex);

	public List<XViewerColumn> alwaysPrintColumns() {
		return Collections.emptyList();
	}

	public String adjustStyledText(XViewerColumn col, Object element, String text) {
		return text;
	}

	/**
	 * @param xCol
	 * @param element
	 * @return
	 */
	public EObject getNarrowDown(final XViewerColumn xCol, final Object element) {
		XViewerColumn sCol = getSourceColumn(xCol);
		int index = getCols().indexOf(sCol);
		Object narrowDown = null;
		if (index != -1 && index + 1 < getCols().size()) {
			XViewerColumn narrowDownCol = getCols().get(index + 1);
			narrowDown = getCellData(narrowDownCol, element);
		}
		final EObject fnarrowDown = narrowDown instanceof EObject ? (EObject) narrowDown : null;
		return fnarrowDown;
	}

	/**
	 * Returns the element specifically contributing to a cell's textual content
	 * 
	 * @param viewerColumn
	 * @param element
	 * @return
	 */
	public EObject getColumnSpecificElement(XViewerColumn viewerColumn, Object element) {
		Object obj = getCellData(getSourceColumn(viewerColumn), element);
		if (obj instanceof EObject)
			return (EObject) obj;
		return null;
	}

	public Image getImage(Object element) {
		if (element instanceof EObject) {
			EObject eObject = (EObject) element;
			Adapter provider = adapterFactory.adapt(eObject, IItemLabelProvider.class);
			if (provider instanceof IItemLabelProvider) {
				IItemLabelProvider iItemLabelProvider = (IItemLabelProvider) provider;
				return ExtendedImageRegistry.INSTANCE.getImage(iItemLabelProvider.getImage(eObject));
			}
		}
		return null;
	}
}
