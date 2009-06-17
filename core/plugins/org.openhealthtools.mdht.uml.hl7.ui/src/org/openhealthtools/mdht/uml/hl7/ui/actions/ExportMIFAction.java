/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.ui.actions;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
import org.openhealthtools.mdht.uml.hl7.mif2uml.mapping.MIFExporter;
import org.openhealthtools.mdht.uml.hl7.ui.internal.Logger;
import org.openhealthtools.mdht.uml.hl7.ui.util.ConsoleUtil;


/**
 * 
 * $Id: $
 */
public class ExportMIFAction
		implements IObjectActionDelegate, IViewActionDelegate, IEditorActionDelegate {

	protected IWorkbenchPart activePart;
	protected IStructuredSelection currentSelection;
	private ResourceSet resourceSet;

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IViewActionDelegate#init(org.eclipse.ui.IViewPart)
	 */
	public void init(IViewPart view) {
		activePart = view;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorActionDelegate#setActiveEditor(org.eclipse.jface.action.IAction, org.eclipse.ui.IEditorPart)
	 */
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		activePart = targetEditor;
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {			
			action.setEnabled( !((IStructuredSelection) selection).isEmpty());
		} else {
			action.setEnabled( false);
		}
	}
	
	
	/**
	 * @return
	 */
	protected List<Element> getModelElements() {
		List<Element> modelElements = new ArrayList<Element>();
		
		for (Object element :currentSelection.toList())
		{
			if (element instanceof IFile) {
				element = loadUMLFile((IFile)element);
			}				
			if (element instanceof Element){
				  modelElements.add((Element)element);
			}
		}
		
		
		return modelElements;
	}
	
	/**
	 * @return
	 */
	protected List<PackageableElement> getPackageElements() {
		List<PackageableElement> modelElements = new ArrayList<PackageableElement>();
		for (Object element : currentSelection.toList()) {
			if (element instanceof IFile) {
				element = loadUMLFile((IFile) element);
				if (element instanceof Model) {
					modelElements = ((Model) element).getPackagedElements();
				}
			}
		}
		
		return modelElements;
	}
	
	/**
	 * @param file
	 * @return
	 */
	protected Element loadUMLFile(IFile file) {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
			resourceSet.getLoadOptions().put(XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		}
		Resource resource = null;
		Element umlModel = null;

		URI modelURI = URI.createFileURI(file.getLocation().toOSString());
		// don't abandon processing if parse error in MIF file
		try {
			resource = resourceSet.getResource(modelURI, true);
			for (org.eclipse.emf.ecore.resource.Resource.Diagnostic diagnostic : resource.getErrors()){
				ConsoleUtil.printError(ConsoleUtil.DEFAULT_CONSOLE_NAME, diagnostic.toString());
			}
		}
		catch (Exception emfException) {
			resource = resourceSet.getResource(modelURI, false);
			
			ConsoleUtil.showConsole(ConsoleUtil.DEFAULT_CONSOLE_NAME);
			ConsoleUtil.printError(ConsoleUtil.DEFAULT_CONSOLE_NAME, emfException.toString());

			Logger.logException(emfException);
		}
		if (resource != null) {
			TreeIterator<Object> iterator = EcoreUtil.getAllContents(resource, false);
			while (iterator.hasNext()) {
				Object next = iterator.next();
				if (next instanceof Element) {
					umlModel = (Element) next;
					break;
				}
			}
		}
		
		return umlModel;
	}
	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {	
		        
		ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(
				activePart.getSite().getShell());
		
		
        IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

				// Get list of all elements of the model to be exported
				List<PackageableElement> umlElements = getPackageElements();

				// Begin Monitor Task
				monitor.beginTask("MIF2 Export ", umlElements.size());

				// Create new Exporter to export uml
				MIFExporter exporter = new MIFExporter();

				// Loop over the packaged uml elements - each package will result in separate export mif model file.
				for (Element umlElement : umlElements) {

					// Updated progress
					String packageName = ((PackageableElement) umlElement).getName();

					monitor.setTaskName("Exporting " + packageName);

					exporter.createMIFModel(umlElement);

					// Iterator over UML and process to create MIF
					for (TreeIterator<Object> iterator = EcoreUtil.getAllContents(Collections

					.singletonList(umlElement)); iterator.hasNext();) {

						EObject child = (EObject) iterator.next();

						exporter.processUML(child);

					}

					monitor.worked(1);

					if (monitor.isCanceled()) {
						monitor.done();
						return;
					}

				}

				// In order to properly support generalizations within mif we must complete a second pass over all the elements
				for (Element umlElement : umlElements) {

					// Iterator over Generalizations and process to create MIF
					for (TreeIterator<Object> iterator = EcoreUtil.getAllContents(Collections

					.singletonList(umlElement)); iterator.hasNext();) {

						EObject child = (EObject) iterator.next();

						exporter.processGeneralizations(child);

					}

				}
				exporter.saveMIFModel();
				monitor.done();

			}

		};
		
		try {
			progressDialog.run(false, true, runnableWithProgress);
			 MessageDialog.openInformation(activePart.getSite().getShell(), "MIF2 Export", "Completed MIF2 Export");
		} catch (InvocationTargetException invocationTargetException) {	
			 MessageDialog.openError(activePart.getSite().getShell(), "MIF2 Export", "Error Procssing Export "+invocationTargetException.getMessage());			 
			 Logger.logException("MIF2 Export Error",invocationTargetException);
		} catch (InterruptedException interruptedException) {
			 MessageDialog.openError(activePart.getSite().getShell(), "MIF2 Export", "Error Procssing Export "+interruptedException.getMessage());
			 Logger.logException("MIF2 Export Error",interruptedException);
		}	
		finally {
			progressDialog.close();
			
		}
	}
}
