/*******************************************************************************
 * Copyright (c) 2006, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - added a new action for (un)controlling elements
 *     Kenn Hussey - adjusted the (un)control action to handle properties files
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.ui.navigator.actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.edit.ui.action.ControlAction;
import org.eclipse.emf.edit.ui.action.CopyAction;
import org.eclipse.emf.edit.ui.action.CutAction;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.emf.edit.ui.action.PasteAction;
import org.eclipse.emf.edit.ui.action.RedoAction;
import org.eclipse.emf.edit.ui.action.UndoAction;
import org.eclipse.emf.edit.ui.action.ValidateAction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.emf.validation.service.ValidationEvent;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.CompositeEMFOperation;
import org.eclipse.emf.workspace.EMFCommandOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.emf.workspace.ResourceUndoContext;
import org.eclipse.emf.workspace.ui.actions.RedoActionWrapper;
import org.eclipse.emf.workspace.ui.actions.UndoActionWrapper;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.navigator.ICommonMenuConstants;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ValueSpecification;
import org.openhealthtools.mdht.uml.common.ui.util.IResourceConstants;
import org.openhealthtools.mdht.uml.common.util.NamedElementUtil;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.ui.navigator.UMLDomainNavigatorItem;
import org.openhealthtools.mdht.uml.ui.navigator.internal.l10n.Messages;
import org.openhealthtools.mdht.uml.ui.navigator.internal.plugin.Activator;
import org.openhealthtools.mdht.uml.ui.navigator.internal.plugin.Logger;

/**
 * 
 * @version $Id: $
 */
public class EditCommandsFactory implements IPropertyListener {
	
	private class MyValidateAction extends ValidateAction {
		
		public class MyResourcesUtil extends EclipseResourcesUtil {

		    protected void adjustMarker(IMarker marker, Diagnostic diagnostic, Diagnostic parentDiagnostic) throws CoreException {
				super.adjustMarker(marker, diagnostic, parentDiagnostic);
				
				if (!diagnostic.getData().isEmpty()) {
					List<?> data = diagnostic.getData();
					if (data.get(0) instanceof NamedElement) {
						NamedElement element = (NamedElement) data.get(0);
						
						// occurs for some Live constraints
						if (element instanceof ValueSpecification) {
							if (element.eContainer() instanceof Property) {
								element = (Property) element.eContainer();

					            marker.setAttribute(EValidator.URI_ATTRIBUTE, EcoreUtil.getURI(element).toString());
							}
						}
						
						marker.setAttribute(IMarker.LOCATION, element.getQualifiedName());
					}
				}
			}  
		}
		
		public MyValidateAction(EditingDomain editingDomain) {
			domain = editingDomain;
			eclipseResourcesUtil = new MyResourcesUtil();
		}

		public boolean isEnabled() {
			if (selectedObjects == null)
				return false;
			else
				return super.isEnabled();
		}
		
		public void run() {
			// always clear all markers on the resource
			for (Iterator<?> iterator = selectedObjects.iterator(); iterator.hasNext();) {
				Object object = (Object) iterator.next();
				if (object instanceof EObject) {
					eclipseResourcesUtil.deleteMarkers(object);
					break;
				}
			}
			
			// run the validation
			super.run();
			
			// Simulate a validation event AFTER resource markers are created.
			// Used to trigger other listeners to update the UI decorators
			List<EObject> targets = new ArrayList<EObject>();
			for (Iterator<?> iterator = selectedObjects.iterator(); iterator.hasNext();) {
				Object object = (Object) iterator.next();
				if (object instanceof EObject) {
					targets.add((EObject)object);
				}
			}
			ModelValidationService.getInstance().broadcastValidationEvent(
					new ValidationEvent(EvaluationMode.BATCH, null, targets, Status.OK_STATUS,
							Collections.singleton("org.openhealthtools.mdht.uml.ui.validation.refresh")));
		}

		protected void handleDiagnostic(Diagnostic diagnostic) {
//			super.handleDiagnostic(diagnostic);
			fixed_handleDiagnostic(diagnostic);

			// override to wrap data in UMLDomainNavigatorItem
			if (!diagnostic.getChildren().isEmpty()) {
				// cast required for RSM 7.0.0.x running in JVM 1.4
				List<?> data = ((Diagnostic)diagnostic.getChildren().get(0)).getData();
				if (!data.isEmpty() && data.get(0) instanceof EObject) {
					Object part = PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getActivePage().getActivePart();
					UMLDomainNavigatorItem item = new UMLDomainNavigatorItem(
							(EObject)data.get(0), null, null);
					if (part instanceof ISetSelectionTarget) {
						((ISetSelectionTarget) part).selectReveal(new StructuredSelection(item));
					} else if (part instanceof IViewerProvider) {
						Viewer viewer = ((IViewerProvider) part).getViewer();
						if (viewer != null) {
							viewer.setSelection(new StructuredSelection(item), true);
						}
					}
				}
			}
		}

		protected void fixed_handleDiagnostic(Diagnostic diagnostic) {
			int severity = diagnostic.getSeverity();
			String title = null;
			String message = null;

			if (severity == Diagnostic.ERROR || severity == Diagnostic.WARNING) {
				title = EMFEditUIPlugin.INSTANCE.getString("_UI_ValidationProblems_title");
				message = EMFEditUIPlugin.INSTANCE.getString("_UI_ValidationProblems_message");
			} else {
				title = EMFEditUIPlugin.INSTANCE.getString("_UI_ValidationResults_title");
				message = EMFEditUIPlugin.INSTANCE
						.getString(severity == Diagnostic.OK ? "_UI_ValidationOK_message"
								: "_UI_ValidationResults_message");
			}

			int result = 0;
			if (diagnostic.getSeverity() == Diagnostic.OK) {
				MessageDialog.openInformation(PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell(), title, message);
				result = Window.CANCEL;
			} else {
				result = DiagnosticDialog.open(PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell(), title, message, diagnostic);
			}

			if (eclipseResourcesUtil != null && !diagnostic.getChildren().isEmpty()) {
				List<?> data = ((Diagnostic)diagnostic.getChildren().get(0)).getData();
				if (data.get(0) instanceof EObject) {
					EObject firstEObject = (EObject) data.get(0);
					Resource resource = firstEObject.eResource();

					if (resource != null) {
						eclipseResourcesUtil.deleteMarkers(resource);
					}

					if (result == Window.OK) {
						Object part = PlatformUI.getWorkbench()
								.getActiveWorkbenchWindow().getActivePage().getActivePart();
						if (part instanceof ISetSelectionTarget) {
							((ISetSelectionTarget) part)
									.selectReveal(new StructuredSelection(firstEObject));
						} else if (part instanceof IViewerProvider) {
							Viewer viewer = ((IViewerProvider) part).getViewer();
							if (viewer != null) {
								viewer.setSelection(new StructuredSelection(firstEObject), true);
							}
						}

						if (resource != null) {
							// use of Object and cast required for RSM 7.0.0.x running in JVM 1.4
							for (Object childDiagnostic : diagnostic.getChildren()) {
								eclipseResourcesUtil.createMarkers(resource, (Diagnostic)childDiagnostic);
							}
						}
					}
				}
			}
		}
  
	}

	private class MyControlAction extends ControlAction {

		public MyControlAction(EditingDomain domain) {
			super(domain);
		}

		@Override
		protected Resource getResource() {
			Shell shell = activePart.getSite().getShell();
			boolean existing = MessageDialog.openQuestion(shell, Messages.ExistingControlledResource_dialogTitle, Messages.ExistingControlledResource_dialogMessage);

			if (existing) {
				ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, new LabelProvider() {

					@Override
					public String getText(Object element) {
						return ((Resource)element).getURI().lastSegment();
					}
				});
				dialog.setMessage(Messages.SelectControlledResource_dialogMessage);
				dialog.setFilter("*");
				dialog.setTitle(Messages.SelectControlledResource_dialogTitle);

				dialog.setElements(UMLUtil.getControlledResources(eObject.eResource()).toArray());

				return dialog.open() == Window.OK ? (Resource) dialog.getFirstResult(): null;
			} else {
				return super.getResource();				
			}
		}

		@Override
		public boolean updateSelection(IStructuredSelection selection) {
			return super.updateSelection(selection)
					&& eObject instanceof Element;
		}

		@Override
		public void run() {
			try {
				TransactionalEditingDomain ted = (TransactionalEditingDomain) domain;
				EcoreUtil.resolveAll(ted.getResourceSet());

				CompositeEMFOperation operation = null;
				
				if (command == null) { // control
					Resource resource = getResource();

					if (resource == null) {
						return;
					}

					operation = new CompositeEMFOperation(ted,
							Messages.ControlAction_label);

					operation.addContext(new ResourceUndoContext(ted, resource));

					Resource eResource = eObject.eResource();
					operation.addContext(new ResourceUndoContext(ted, eResource));

					final List<Element> controlledElements = new ArrayList<Element>();

					EList<EObject> resourceContents = resource.getContents();
					operation.add(new EMFCommandOperation(ted, new AddCommand(
							ted, resourceContents, eObject)));

					controlledElements.add((Element)eObject);

					if (eObject instanceof org.eclipse.uml2.uml.Class) {

						for (Property ownedAttribute : ((org.eclipse.uml2.uml.Class) eObject)
								.getOwnedAttributes()) {
							Association association = ownedAttribute
									.getAssociation();

							if (association != null) {
								operation.add(new EMFCommandOperation(ted,
										new AddCommand(ted,
												resourceContents,
												association)));
								
								controlledElements.add(association);
							}
						}
					}

					for (Element element : controlledElements) {
						
						for (EObject stereotypeApplication : element
								.getStereotypeApplications()) {
							operation.add(new EMFCommandOperation(ted,
									new AddCommand(ted, resourceContents,
											stereotypeApplication)));
						}

						for (TreeIterator<EObject> allProperContents = EcoreUtil
								.getAllProperContents(element, true); allProperContents
								.hasNext();) {
							EObject content = allProperContents.next();

							if (content instanceof Element) {

								for (EObject stereotypeApplication : ((Element) content)
										.getStereotypeApplications()) {
									operation.add(new EMFCommandOperation(ted,
											new AddCommand(ted,
													resourceContents,
													stereotypeApplication)));
								}
							}
						}
					}

					final URI eResourcePropertiesURI = UMLUtil.getPropertiesURI(eResource);
					final String eResourceProperties = UMLUtil.readProperties(eResourcePropertiesURI);
					
					if (eResourceProperties != null) {
						final URI resourcePropertiesURI = UMLUtil
								.getPropertiesURI(resource);
						final String resourceProperties = UMLUtil
								.readProperties(resourcePropertiesURI);

						operation.add(new AbstractEMFOperation(ted,
								UML2Util.EMPTY_STRING) {

							@Override
							protected IStatus doExecute(
									IProgressMonitor monitor, IAdaptable info)
									throws ExecutionException {
								Map<String, String> eResourceParsedProperties = UMLUtil
										.parseProperties(eResourceProperties);
								Map<String, String> resourceParsedProperties = resourceProperties != null ? UMLUtil
										.parseProperties(resourceProperties)
										: new LinkedHashMap<String, String>();

								for (TreeIterator<EObject> allProperContents = EcoreUtil
										.getAllProperContents(
												controlledElements, true); allProperContents
										.hasNext();) {
									EObject next = allProperContents.next();

									if (next instanceof NamedElement) {
										String propertyKey = NamedElementUtil
												.getPropertyKey((NamedElement) next);
										String property = eResourceParsedProperties
												.remove(propertyKey);

										if (property != null) {
											resourceParsedProperties.put(
													propertyKey, property);
										}
									}
								}

								UMLUtil.writeProperties(eResourcePropertiesURI,
										eResourceParsedProperties);

								if (!resourceParsedProperties.isEmpty()) {
									UMLUtil.writeProperties(
											resourcePropertiesURI,
											resourceParsedProperties);
								}

								return Status.OK_STATUS;
							}

							@Override
							protected IStatus doUndo(IProgressMonitor monitor,
									IAdaptable info) throws ExecutionException {
								UMLUtil.writeProperties(
										eResourcePropertiesURI,
										UMLUtil.parseProperties(eResourceProperties));

								URIConverter uriConverter = getEditingDomain().getResourceSet().getURIConverter();
								
								if (uriConverter
										.exists(resourcePropertiesURI, null)) {
									
									if (resourceProperties == null) {
										try {
											uriConverter.delete(resourcePropertiesURI, null);											
										} catch (IOException ioe) {
											return Status.CANCEL_STATUS;
										}
									} else {
										UMLUtil.writeProperties(resourcePropertiesURI, UMLUtil
														.parseProperties(resourceProperties));										
									}
								}

								return Status.OK_STATUS;
							}

							@Override
							protected IStatus doRedo(IProgressMonitor monitor,
									IAdaptable info) throws ExecutionException {
								return doExecute(monitor, info);
							}
						});
					}
				} else { // uncontrol
					operation = new CompositeEMFOperation(ted,
							Messages.UncontrolAction_label);

					Resource eContainerResource = eObject.eContainer().eResource();
					operation.addContext(new ResourceUndoContext(ted, eContainerResource));

					Resource eResource = eObject.eResource();
					operation.addContext(new ResourceUndoContext(ted, eResource));

					final List<Element> uncontrolledElements = new ArrayList<Element>();

					EList<EObject> eResourceContents = eResource.getContents();
					operation.add(new EMFCommandOperation(ted,
							new RemoveCommand(ted, eResourceContents, eObject)));

					uncontrolledElements.add((Element)eObject);

					if (eObject instanceof org.eclipse.uml2.uml.Class) {

						for (Property ownedAttribute : ((org.eclipse.uml2.uml.Class) eObject)
								.getOwnedAttributes()) {
							Association association = ownedAttribute
									.getAssociation();

							if (association != null) {
								operation.add(new EMFCommandOperation(ted,
										new RemoveCommand(ted,
												eResourceContents,
												association)));
								
								uncontrolledElements.add(association);
							}
						}
					}
					
					EList<EObject> eContainerResourceContents = eContainerResource.getContents();

					for (Element element : uncontrolledElements) {

						for (EObject stereotypeApplication : element
								.getStereotypeApplications()) {
							operation.add(new EMFCommandOperation(ted,
									new AddCommand(ted,
											eContainerResourceContents,
											stereotypeApplication)));
						}

						for (TreeIterator<EObject> allProperContents = EcoreUtil
								.getAllProperContents(element, true); allProperContents
								.hasNext();) {
							EObject content = allProperContents.next();

							if (content instanceof Element) {

								for (EObject stereotypeApplication : ((Element) content)
										.getStereotypeApplications()) {
									operation.add(new EMFCommandOperation(ted,
											new AddCommand(ted,
													eContainerResourceContents,
													stereotypeApplication)));
								}
							}
						}
					}

					final URI eResourcePropertiesURI = UMLUtil.getPropertiesURI(eResource);
					final String eResourceProperties = UMLUtil.readProperties(eResourcePropertiesURI);
					
					if (eResourceProperties != null) {
						final URI eContainerResourcePropertiesURI = UMLUtil
								.getPropertiesURI(eContainerResource);
						final String eContainerResourceProperties = UMLUtil
								.readProperties(eContainerResourcePropertiesURI);

						operation.add(new AbstractEMFOperation(ted,
								UML2Util.EMPTY_STRING) {

							@Override
							protected IStatus doExecute(
									IProgressMonitor monitor, IAdaptable info)
									throws ExecutionException {
								Map<String, String> eResourceParsedProperties = UMLUtil
										.parseProperties(eResourceProperties);
								Map<String, String> eContainerResourceParsedProperties = eContainerResourceProperties != null ? UMLUtil
										.parseProperties(eContainerResourceProperties)
										: new LinkedHashMap<String, String>();

								for (TreeIterator<EObject> allProperContents = EcoreUtil
										.getAllProperContents(
												uncontrolledElements, true); allProperContents
										.hasNext();) {
									EObject next = allProperContents.next();

									if (next instanceof NamedElement) {
										String propertyKey = NamedElementUtil
												.getPropertyKey((NamedElement) next);
										String property = eResourceParsedProperties
												.remove(propertyKey);

										if (property != null) {
											eContainerResourceParsedProperties
													.put(propertyKey, property);
										}
									}
								}

								UMLUtil.writeProperties(eResourcePropertiesURI,
										eResourceParsedProperties);

								if (!eContainerResourceParsedProperties
										.isEmpty()) {
									UMLUtil.writeProperties(
											eContainerResourcePropertiesURI,
											eContainerResourceParsedProperties);
								}

								return Status.OK_STATUS;
							}

							@Override
							protected IStatus doUndo(IProgressMonitor monitor,
									IAdaptable info) throws ExecutionException {
								UMLUtil.writeProperties(
										eResourcePropertiesURI,
										UMLUtil.parseProperties(eResourceProperties));

								URIConverter uriConverter = getEditingDomain()
										.getResourceSet().getURIConverter();

								if (uriConverter.exists(
										eContainerResourcePropertiesURI, null)) {

									if (eContainerResourceProperties == null) {
										try {
											uriConverter
													.delete(eContainerResourcePropertiesURI,
															null);
										} catch (IOException ioe) {
											return Status.CANCEL_STATUS;
										}
									} else {
										UMLUtil.writeProperties(
												eContainerResourcePropertiesURI,
												UMLUtil.parseProperties(eContainerResourceProperties));
									}
								}

								return Status.OK_STATUS;
							}

							@Override
							protected IStatus doRedo(IProgressMonitor monitor,
									IAdaptable info) throws ExecutionException {
								return doExecute(monitor, info);
							}
						});
					}
				}

				try {
					IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) ted
							.getCommandStack();
					operation.addContext(commandStack.getDefaultUndoContext());
					commandStack.getOperationHistory().execute(operation,
							new NullProgressMonitor(), activePart);

				} catch (ExecutionException ee) {
					Logger.logException(ee);
				}

			} catch (Exception e) {
				throw new RuntimeException(e.getCause());
			}
		}

	}

//	public static final EditCommandsFactory INSTANCE = new EditCommandsFactory();
	
	/**
	 * This keeps track of the current workbench part.
	 */
	protected IWorkbenchPart activePart;

	/**
	 * This is the action used to implement delete.
	 */
	protected DeleteAction deleteAction;

	/**
	 * This is the action used to implement cut.
	 */
	protected CutAction cutAction;

	/**
	 * This is the action used to implement copy.
	 */
	protected CopyAction copyAction;

	/**
	 * This is the action used to implement paste.
	 */
	protected PasteAction pasteAction;

	/**
	 * This is the action used to implement undo.
	 */
	protected UndoAction undoAction;

	/**
	 * This is the action used to implement redo.
	 */
	protected RedoAction redoAction;

	/**
	 * This is the action used to load a resource.
	 */
	protected LoadResourceAction loadResourceAction;

	/**
	 * This is the action used to perform validation.
	 */
	protected MyValidateAction validateAction;

	/**
	 * This is the action used to control/uncontrol elements.
	 */
	protected MyControlAction controlAction;

	/**
	 * Singleton constructor.
	 */
	public EditCommandsFactory() {
		init();
	}

	protected void init() {
		TransactionalEditingDomain editingDomain = 
			TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain(
					IResourceConstants.EDITING_DOMAIN_ID);
		
		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();

		deleteAction = new DeleteUMLAction(editingDomain, removeAllReferencesOnDelete()) {
			public boolean updateSelection(IStructuredSelection selection) {
				return super.updateSelection(unwrap(selection));
			}
		};
		deleteAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));

		cutAction = new CutAction(editingDomain) {
			public boolean updateSelection(IStructuredSelection selection) {
				return super.updateSelection(unwrap(selection));
			}
		};
		cutAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_CUT));

		copyAction = new CopyAction(editingDomain) {
			public boolean updateSelection(IStructuredSelection selection) {
				return super.updateSelection(unwrap(selection));
			}
		};
		copyAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_COPY));

		pasteAction = new PasteAction(editingDomain) {
			public boolean updateSelection(IStructuredSelection selection) {
				return super.updateSelection(unwrap(selection));
			}
		};
		pasteAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_PASTE));

		undoAction = new UndoActionWrapper();
		undoAction.setEditingDomain(editingDomain);
		undoAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_UNDO));

		redoAction = new RedoActionWrapper();
		redoAction.setEditingDomain(editingDomain);
		redoAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_REDO));

		validateAction = new MyValidateAction(editingDomain) {
			public boolean updateSelection(IStructuredSelection selection) {
				return super.updateSelection(unwrap(selection));
			}
		};
		validateAction.setImageDescriptor(Activator.findImageDescriptor("icons/validate.gif"));
		
		controlAction = new MyControlAction(editingDomain){
			public boolean updateSelection(IStructuredSelection selection) {
				return super.updateSelection(unwrap(selection));
			}
		};
	}
	
	private IStructuredSelection unwrap(IStructuredSelection selection) {
		List<Object> unwrapped = new ArrayList<Object>();
		for (Iterator<?> iterator = selection.iterator(); iterator.hasNext();) {
			Object item = iterator.next();
	        if (item instanceof IAdaptable)
	        	item = ((IAdaptable)item).getAdapter(EObject.class);
			
	        unwrapped.add(item);
		}
		return new StructuredSelection(unwrapped);
	}
	
	/**
	 * This determines whether or not the delete action should clean up all
	 * references to the deleted objects. It is false by default, to provide the
	 * same beahviour, by default, as in EMF 2.1 and before. You should probably
	 * override this method to return true, in order to get the new, more useful
	 * beahviour.
	 * 
	 * @since 2.2
	 */
	protected boolean removeAllReferencesOnDelete() {
		return true;
	}

	public void dispose() {
		deactivate();
	}

	public void shareGlobalActions(IActionBars actionBars, boolean isPropertyPage) {
		if (!isPropertyPage) {
			actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(),
					deleteAction);
			actionBars.setGlobalActionHandler(ActionFactory.CUT.getId(),
					cutAction);
			actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(),
					copyAction);
			actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(),
					pasteAction);
		}
		actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(),
				undoAction);
		actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(),
				redoAction);
	}
	
	public void fillContextMenu(IMenuManager menu) {
		if(cutAction.isEnabled())
			menu.appendToGroup(ICommonMenuConstants.GROUP_EDIT, cutAction);
		if(copyAction.isEnabled())
			menu.appendToGroup(ICommonMenuConstants.GROUP_EDIT, copyAction);
		if(pasteAction.isEnabled())
			menu.appendToGroup(ICommonMenuConstants.GROUP_EDIT, pasteAction);
		if(deleteAction.isEnabled())
			menu.appendToGroup(ICommonMenuConstants.GROUP_EDIT, deleteAction);
		
		if(validateAction.isEnabled())
			menu.appendToGroup(ICommonMenuConstants.GROUP_BUILD, validateAction);

		if(controlAction.isEnabled())
			menu.appendToGroup(ICommonMenuConstants.GROUP_BUILD, controlAction);
	}

	public IWorkbenchPart getActivePart() {
		return activePart;
	}

	public void setActivePart(IWorkbenchPart part) {
		if (part != activePart) {
			if (activePart != null) {
				deactivate();
				activePart = null;
			}

			activePart = part;
			if (activePart != null) {
				activate();
			}
		}
	}

	public void deactivate() {
		activePart.removePropertyListener(this);

		deleteAction.setActiveWorkbenchPart(null);
		cutAction.setActiveWorkbenchPart(null);
		copyAction.setActiveWorkbenchPart(null);
		pasteAction.setActiveWorkbenchPart(null);
		undoAction.setActiveWorkbenchPart(null);
		redoAction.setActiveWorkbenchPart(null);

		if (loadResourceAction != null) {
			loadResourceAction.setActiveWorkbenchPart(null);
		}

		if (validateAction != null) {
			validateAction.setActiveWorkbenchPart(null);
		}

		if (controlAction != null) {
			controlAction.setActiveWorkbenchPart(null);
		}

		ISelectionProvider selectionProvider = activePart instanceof ISelectionProvider ? (ISelectionProvider) activePart
				: activePart.getSite().getSelectionProvider();

		if (selectionProvider != null) {
			selectionProvider.removeSelectionChangedListener(deleteAction);
			selectionProvider.removeSelectionChangedListener(cutAction);
			selectionProvider.removeSelectionChangedListener(copyAction);
			selectionProvider.removeSelectionChangedListener(pasteAction);

			if (validateAction != null) {
				selectionProvider.removeSelectionChangedListener(validateAction);
			}

			if (controlAction != null) {
				selectionProvider.removeSelectionChangedListener(controlAction);
			}
		}
	}
	
	public void activate() {
		activePart.addPropertyListener(this);

		deleteAction.setActiveWorkbenchPart(activePart);
		cutAction.setActiveWorkbenchPart(activePart);
		copyAction.setActiveWorkbenchPart(activePart);
		pasteAction.setActiveWorkbenchPart(activePart);
		undoAction.setActiveWorkbenchPart(activePart);
		redoAction.setActiveWorkbenchPart(activePart);

		if (loadResourceAction != null) {
			loadResourceAction.setActiveWorkbenchPart(activePart);
		}

		if (validateAction != null) {
			validateAction.setActiveWorkbenchPart(activePart);
		}

		if (controlAction != null) {
			controlAction.setActiveWorkbenchPart(activePart);
		}

		ISelectionProvider selectionProvider = activePart instanceof ISelectionProvider ? (ISelectionProvider) activePart
				: activePart.getSite().getSelectionProvider();

		if (selectionProvider != null) {
			selectionProvider.addSelectionChangedListener(deleteAction);
			selectionProvider.addSelectionChangedListener(cutAction);
			selectionProvider.addSelectionChangedListener(copyAction);
			selectionProvider.addSelectionChangedListener(pasteAction);

			if (validateAction != null) {
				selectionProvider.addSelectionChangedListener(validateAction);
			}

			if (controlAction != null) {
				selectionProvider.addSelectionChangedListener(controlAction);
			}
		}

		update();
	}

	public void update() {
		ISelectionProvider selectionProvider = activePart instanceof ISelectionProvider ? (ISelectionProvider) activePart
				: activePart.getSite().getSelectionProvider();

//		EditingDomain editingDomain = activePart instanceof IEditingDomainProvider ? 
//				((IEditingDomainProvider) activePart).getEditingDomain()
//				: null;

		TransactionalEditingDomain editingDomain = 
			TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain(
					IResourceConstants.EDITING_DOMAIN_ID);
		
		if (selectionProvider != null && editingDomain != null) {
			ISelection selection = selectionProvider.getSelection();
			IStructuredSelection structuredSelection = selection instanceof IStructuredSelection ? (IStructuredSelection) selection
					: StructuredSelection.EMPTY;

			deleteAction.updateSelection(structuredSelection);
			cutAction.updateSelection(structuredSelection);
			copyAction.updateSelection(structuredSelection);
			pasteAction.updateSelection(structuredSelection);

			if (validateAction != null) {
				validateAction.updateSelection(structuredSelection);
			}

			if (controlAction != null) {
				controlAction.updateSelection(structuredSelection);
			}
		}

		undoAction.update();
		redoAction.update();

		if (loadResourceAction != null) {
			loadResourceAction.update();
		}
	}

	public void propertyChanged(Object source, int id) {
		update();
	}

}
