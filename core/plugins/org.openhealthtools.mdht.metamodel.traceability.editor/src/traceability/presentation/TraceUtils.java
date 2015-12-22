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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.ISetSelectionTarget;

import traceability.Trace;
import traceability.TraceabilityPackage;
import traceability.presentation.table.GroupItem;

public class TraceUtils {

	/**
	 * Processes the double-click depending if it occurred in our editor or in a foreign one
	 * 
	 * @param event
	 * @param traceabilityEditor
	 */
	public static void doubleClick(DoubleClickEvent event, TraceabilityEditor traceabilityEditor) {
		List<EObject> fromOther = new ArrayList<EObject>();
		List<EObject> fromSelf = new ArrayList<EObject>();
		ISelection sel = event.getViewer() == traceabilityEditor.getViewer() ? traceabilityEditor.getSelection() : event.getSelection();
		if (sel instanceof IStructuredSelection) {
			IStructuredSelection currentSelection = (IStructuredSelection) sel;
			for (Object o : currentSelection.toList()) {
				Object o2 = Platform.getAdapterManager().getAdapter(o, EObject.class);
				if (o2 != null)
					o = o2;
				if (o instanceof EObject) {
					EObject eObject = (EObject) o;

					if (eObject.eClass().getEPackage() == TraceabilityPackage.eINSTANCE)
						continue;

					if (eObject.eResource().getResourceSet() != traceabilityEditor.getEditingDomain().getResourceSet()) {
						fromOther.add(eObject);
					} else {
						fromSelf.add(eObject);
					}
				}
			}

		}
		if (!fromOther.isEmpty()) {
			doubleClickFromOther(fromOther.get(0), traceabilityEditor);
		} else if (!fromSelf.isEmpty()) {
			doubleClickFromSelf(fromSelf);
		}

	}

	/**
	 * Processes a doublick click event occuring in the traceability editor, by opening the traced element in a new editor and selecting it. Also see {@link OpenUMLTableEditorAction#run(org.eclipse.jface.action.IAction)}
	 * 
	 * @param fromSelf
	 */
	public static void doubleClickFromSelf(List<EObject> fromSelf) {
		try {
			PlatformUI.getWorkbench().getEditorRegistry().setDefaultEditor("file.xml", "ReusableModels.presentation.ReusableModelsEditorID");
			EObject eo = fromSelf.get(0);
			Resource resource = eo.eResource();
			URI uri = resource.getURI();
			URI nuri = resource.getResourceSet().getURIConverter().normalize(uri);
			if (!uri.equals(nuri)) {
				Resource nresource = new ResourceSetImpl().getResource(nuri, true);
				if (nresource.getContents().size() > 0)
					eo = nresource.getContents().get(0);
			}

			boolean opened = EditUIUtil.openEditor(eo);
			boolean reuse = false;
			if (!opened) {
				URIEditorInput i = ReuseURIEditorInput.create(eo.eResource());
				opened = null != IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), i, "ReusableModels.presentation.ReusableModelsEditorID");
				reuse = true;
			}
			if (opened) {
				IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
				if (editor != null) {
					if (editor instanceof IEditingDomainProvider) {
						IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) editor;
						List<EObject> allFound = reuse ? fromSelf : new ArrayList<EObject>();
						if (allFound.isEmpty()) {
							for (EObject eObject : fromSelf) {
								String fragment = eObject.eResource().getURIFragment(eObject);
								for (Resource res : editingDomainProvider.getEditingDomain().getResourceSet().getResources()) {
									EObject found = res.getEObject(fragment);
									if (found != null) {
										allFound.add(found);
										break;
									}
								}
							}
						}
						if (!allFound.isEmpty()) {
							if (editingDomainProvider instanceof ISetSelectionTarget) {
								ISetSelectionTarget iSetSelectionTarget = (ISetSelectionTarget) editingDomainProvider;
								iSetSelectionTarget.selectReveal(new StructuredSelection(allFound.toArray()));
							} else if (editingDomainProvider instanceof ISelectionProvider) {
								ISelectionProvider iSelectionProvider = (ISelectionProvider) editingDomainProvider;
								iSelectionProvider.setSelection(new StructuredSelection(allFound.toArray()));
							}
						}
					}
				}
			}

		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	public static void selectionChanged(IWorkbenchPart part, ISelection selection, TraceabilityEditor traceabilityEditor) {
		if (part == traceabilityEditor)
			return;
		Object o = part.getAdapter(IViewerProvider.class);
		if (o instanceof IViewerProvider) {
			IViewerProvider iViewerProvider = (IViewerProvider) o;
			Viewer view = iViewerProvider.getViewer();
			if (view instanceof StructuredViewer) {
				StructuredViewer structuredViewer = (StructuredViewer) view;
				structuredViewer.addDoubleClickListener(traceabilityEditor);
			}
		}
	}

	/**
	 * Processes a double click event occurring in an editor different from the traceability editor, by selecting the element in a trace tracing it
	 * 
	 * @param eObject
	 * @param traceabilityEditor
	 */
	public static void doubleClickFromOther(EObject eObject, TraceabilityEditor traceabilityEditor) {
		for (Resource res : traceabilityEditor.getEditingDomain().getResourceSet().getResources()) {
			if ("traces".equals(res.getURI().fileExtension())) {
				for (Iterator<EObject> it = res.getAllContents(); it.hasNext();) {
					EObject eObject2 = it.next();
					if (eObject2 instanceof Trace) {
						Trace trace = (Trace) eObject2;
						EObject eObject4 = null;
						for (EObject source : trace.getSource()) {
							if (isSame(source, eObject)) {
								eObject4 = source;
							}
						}
						for (EObject target : trace.getTarget()) {
							if (isSame(target, eObject)) {
								eObject4 = target;
							}
						}
						if (eObject4 != null && eObject4 != eObject) {
							// ensure that "eObject4" exists as child of "trace"

							Object toSelect = eObject4;
							if (traceabilityEditor.getViewer() instanceof AbstractTreeViewer) {
								AbstractTreeViewer treeViewer = (AbstractTreeViewer) traceabilityEditor.getViewer();
								treeViewer.expandToLevel(trace, 1);
								// ensure that "eObject4" is selected as child of "trace" and not as nested class of a parent class
								traceabilityEditor.setSelectionToViewer(Arrays.asList(trace));
							}
							// select "eObject4"
							traceabilityEditor.setSelectionToViewer(Arrays.asList(toSelect));
							// give focus to traceability editor
							traceabilityEditor.getSite().getPage().activate(traceabilityEditor);
							return;
						}
					}
				}
				break;
			}
		}
	}

	/**
	 * @param eObject1
	 * @param eObject2
	 * @return whether both objects represent the same EMF object but reside in different resource sets
	 */
	private static boolean isSame(EObject eObject1, EObject eObject2) {
		return eObject1 != null && eObject2 != null && EcoreUtil.getURI(eObject2).equals(EcoreUtil.getURI(eObject1));
	}

	/**
	 * If the given model element is not contained by a group item, creates a new one containing it, otherwise returns the existing one
	 * 
	 * @param element
	 * @param existingGroups
	 * @return
	 */
	static public GroupItem lookupOrCreate(Object element, Map<Object, GroupItem> existingGroups) {
		if (existingGroups.containsKey(element))
			return existingGroups.get(element);
		GroupItem result = new GroupItem(element);
		existingGroups.put(element, result);
		return result;
	}

	/**
	 * Removes all XML tags
	 * 
	 * @param text
	 * @return
	 */
	public static String withoutTags(String text) {
		int i;
		int i2;
		while ((i = text.indexOf("<")) != -1 && (i2 = text.indexOf(">")) > i) {
			text = text.substring(0, i) + text.substring(i2 + 1);
		}
		return text;
	}

}
