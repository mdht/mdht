/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.ui.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.openhealthtools.mdht.emf.hl7.mif2.ModelElement;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase;
import org.openhealthtools.mdht.uml.hl7.mif2uml.mapping.MIFImporter;
import org.openhealthtools.mdht.uml.hl7.ui.internal.Logger;
import org.openhealthtools.mdht.uml.hl7.ui.util.ConsoleUtil;
import org.osgi.framework.Bundle;


/**
 * 
 * $Id: $
 */
public class ImportMIFAction
		implements IObjectActionDelegate, IViewActionDelegate, IEditorActionDelegate {

	protected IWorkbenchPart activePart;
	protected IStructuredSelection currentSelection;
	private ResourceSet resourceSet;
	
	public ImportMIFAction() {
		super();
	}

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
		if (selection instanceof IStructuredSelection)
			currentSelection = (IStructuredSelection) selection;
		else
			currentSelection = null;
		
		action.setEnabled(currentSelection != null && !currentSelection.isEmpty());
	}
	
	private IProject getCurrentProject() {
		if (currentSelection.getFirstElement() instanceof IFile)
			return ((IFile)currentSelection.getFirstElement()).getProject();
		else
			return null;
	}
	
	protected List<ModelElement> getModelElements() {
		List<ModelElement> modelElements = new ArrayList<ModelElement>();
		for (Object element : currentSelection.toList())  {
			if (element instanceof IFile) {
				element = loadMIFFile((IFile)element);
			}
			else {
				element = AdapterFactoryEditingDomain.unwrap(element);
			}
				
			if (element instanceof ModelElement)
				modelElements.add((ModelElement)element);
		}
		
		return modelElements;
	}
	
	protected StaticModelBase loadMIFFile(IFile file) {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
			resourceSet.getLoadOptions().put(XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		}
		Resource resource = null;
		StaticModelBase mifModel = null;

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
				if (next instanceof StaticModelBase) {
					mifModel = (StaticModelBase) next;
					break;
				}
			}
		}
		
		return mifModel;
	}
	
	protected String getUMLFileExtension() {
		@SuppressWarnings("unused")
		Bundle rsaBundle = Platform.getBundle("com.ibm.xtools.modeler.ui");
//		if (rsaBundle != null)
//			return "emx";
//		else
			return UMLResource.FILE_EXTENSION;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(
				activePart.getSite().getShell());
		progressDialog.open();
		
		try {
			Model umlModel = UMLFactory.eINSTANCE.createModel();
			umlModel.setName("MIF_Import");
			
			// Must create UML model resource before importing
			// so that MIF datatypes can be added to same resource set.
			List<ModelElement> mifElements = getModelElements();
			if (mifElements.isEmpty())
				return;
			
			Resource mifResource = ((ModelElement) mifElements.get(0)).eResource();
			URI umlURI = mifResource.getURI().trimFileExtension();
			umlURI = umlURI.appendFileExtension(getUMLFileExtension());
			
			/* 
			 * Special case for rim.coremif
			 * Create a model named "RIM", import content directly into top-level Model.
			 */
			if (mifElements.size() == 1 
					&& "rim.coremif".equals(mifResource.getURI().lastSegment())) {
				
				umlModel.setName("RIM");
				umlURI.trimSegments(1);
				umlURI = umlURI.appendSegment("RIM");
				umlURI = umlURI.appendFileExtension(getUMLFileExtension());
			}
			
			// save to current IProject
			IProject project = getCurrentProject();
			IFile umlFile = null;
			if (project != null) {
				umlFile = project.getFile(umlURI.lastSegment());
				umlURI = URI.createPlatformResourceURI(umlFile.getFullPath().toString(), false);
			}
			
			Resource umlResource = mifResource.getResourceSet().createResource(umlURI);
			umlResource.getContents().add(umlModel);

			MIFImporter importer = new MIFImporter();
			importer.setUMLModel(umlModel);

			/* 
			 * Special case for rim.coremif
			 * Create a model named "RIM", import content directly into top-level Model.
			 */
			if (mifElements.size() == 1 
					&& "rim.coremif".equals(mifResource.getURI().lastSegment())
					&& mifElements.get(0) instanceof StaticModelBase) {
				
				((XMLResource)umlResource).setID(umlModel, "RIM-model");
				importer.processMIF((StaticModelBase) mifElements.get(0));
			}
			else {
				for (ModelElement element : mifElements) {
					importer.processMIF(element);
				}
			}

			umlResource.save(new HashMap<Object,Object>());
			// unload the model
			umlModel.eResource().unload();
			resourceSet = null;
			
			// refresh the Eclipse workspace to show this new file
			IFile[] files = null;
			if (umlFile != null) {
				files = new IFile[1];
				files[0] = umlFile;
				project.refreshLocal(1, null);
			}
			else {
				files = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocation(
					new Path(umlURI.toFileString()));
			}
			if (files.length == 1) {
				//files[0].getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
				files[0].getParent().refreshLocal(IResource.DEPTH_ONE, null);

				String editorID = "org.eclipse.uml2.uml.editor.presentation.UMLEditorID";
				Bundle rsmBundle = Platform.getBundle("com.ibm.xtools.modeler.ui");
				if (rsmBundle != null && "emx".equals(files[0].getFullPath().getFileExtension())) {
					editorID = "com.ibm.xtools.modeler.ui.editors.internal.ModelEditor";
				}
				else if (activePart instanceof CommonNavigator) {
					// without this, the model file is in wrong sort position in navigator
					CommonViewer viewer = ((CommonNavigator)activePart).getCommonViewer();
					viewer.refresh();
					((CommonNavigator)activePart).selectReveal(new StructuredSelection(files[0]));
				}
//				else if (activePart instanceof ISetSelectionTarget) {
//					((ISetSelectionTarget)activePart).selectReveal(new StructuredSelection(files[0]));
//				}

				IEditorInput editorInput = new FileEditorInput(files[0]);
				try {
					IWorkbenchPage activePage = 
						activePart.getSite().getPage();
					activePage.openEditor(editorInput, editorID);
				} catch (PartInitException e) {
				}

				// display these last so that the error console will display after Rational console
				ConsoleUtil.logToConsole(importer.getDiagnostics());
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			ConsoleUtil.showConsole(ConsoleUtil.DEFAULT_CONSOLE_NAME);
			ConsoleUtil.printError(ConsoleUtil.DEFAULT_CONSOLE_NAME, e.toString());
		}
		finally {
			progressDialog.close();
		}
	}

}
