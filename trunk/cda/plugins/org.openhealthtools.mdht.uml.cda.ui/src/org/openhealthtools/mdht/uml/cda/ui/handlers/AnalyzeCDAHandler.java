/*******************************************************************************
 * Copyright (c) 2014 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     seanmuir - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ui.handlers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ui.handlers.AnalyzeCDAHandler.CDAAnalaysisInput.CDAMetrics;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.openhealthtools.mdht.uml.common.ui.dialogs.SubclassEditorViewContentProvider;
import org.openhealthtools.mdht.uml.common.ui.dialogs.SubclassEditorViewLabelProvider;

/**
 * @author seanmuir
 * 
 */
public class AnalyzeCDAHandler extends AbstractHandler {

	protected SubclassEditorViewContentProvider getContentProvider() {
		return new SubclassEditorViewContentProvider();
	}

	protected SubclassEditorViewLabelProvider getLabelProvider() {
		return new SubclassEditorViewLabelProvider();
	}

	public static class CDAAnalaysisInput implements IEditorInput {

		public static class CDAMetrics {
			public String fileName;

			public int totalSections;

			public int totalErrors;

			public int totalEntries;

			public int totalCodedElements;

			public int totalCodedMetrics;

			public int codedMetricsCount;

			public int totalClinicalStatements;

			public LinkedHashMap<String, Boolean> codedMetrics = new LinkedHashMap<String, Boolean>();
		}

		public ArrayList<CDAMetrics> metrics = new ArrayList<CDAMetrics>();

		public ArrayList<CDAMetrics> getMetrics() {
			return metrics;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
		 */
		public Object getAdapter(Class adapter) {
			// TODO Auto-generated method stub
			return null;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.ui.IEditorInput#exists()
		 */
		public boolean exists() {
			// TODO Auto-generated method stub
			return false;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
		 */
		public ImageDescriptor getImageDescriptor() {
			// TODO Auto-generated method stub
			return null;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.ui.IEditorInput#getName()
		 */
		public String getName() {
			// TODO Auto-generated method stub
			return null;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.ui.IEditorInput#getPersistable()
		 */
		public IPersistableElement getPersistable() {
			// TODO Auto-generated method stub
			return null;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.ui.IEditorInput#getToolTipText()
		 */
		public String getToolTipText() {
			// TODO Auto-generated method stub
			return null;
		}

	}

	IFile codeMetricsFile;

	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {

			ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
			if (selection instanceof IStructuredSelection) {

				CDAAnalaysisInput cdaAnalaysisInput = new CDAAnalaysisInput();

				IStructuredSelection iss = (IStructuredSelection) selection;
				Iterator<Object> iter = iss.iterator();
				while (iter.hasNext()) {
					Object o = iter.next();
					if (o instanceof IFolder) {
						IFolder folder = (IFolder) o;

						codeMetricsFile = folder.getFile("codemetrics.cfg");

						for (IResource resource : folder.members()) {
							if (resource instanceof IFile) {
								IFile file = (IFile) resource;
								if ("XML".equalsIgnoreCase(file.getFileExtension())) {

									cdaAnalaysisInput.getMetrics().add(analyzePluginMode(file));

									IWorkbench wb = PlatformUI.getWorkbench();
									IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
									IWorkbenchPage page = win.getActivePage();

									IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().findEditor(
										"org.openhealthtools.mdht.uml.cda.ui.editors.CDAAnalyzer");

									page.openEditor(new FileEditorInput(file), desc.getId());

									// System.out.println(file.getName());
								}

							}

						}

					}
				}

				IWorkbench wb = PlatformUI.getWorkbench();
				IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
				IWorkbenchPage page = win.getActivePage();

				IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().findEditor(
					"org.openhealthtools.mdht.uml.cda.ui.editors.CDAAnalyzer2");

				page.openEditor(cdaAnalaysisInput, desc.getId());
				//

			}

		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// if (selection instanceof IStructuredSelection) {
		// result = getSelectedElement((IStructuredSelection) selection, selectionType);
		// }

		return null;
	}

	class Handler implements ValidationHandler {

		public int errorCount = 0;

		public void handleError(Diagnostic diagnostic) {
			errorCount++;

		}

		public void handleWarning(Diagnostic diagnostic) {
			// TODO Auto-generated method stub

		}

		public void handleInfo(Diagnostic diagnostic) {
			// TODO Auto-generated method stub

		}
	};

	private int getMetric(ClinicalDocument cd, String ocl) throws Exception {
		HashSet o = (HashSet) CDAUtil.query(cd, ocl);
		return o.size();
	}

	private CDAMetrics analyzePluginMode(IFile file) {
		CDAMetrics cdaMetrics = new CDAMetrics();

		cdaMetrics.fileName = file.getName();
		try {

			URI cdaURI = URI.createFileURI(file.getLocation().toOSString());

			Handler handler = new Handler();
			ClinicalDocument cd = CDAUtil.load(cdaURI, handler);

			cdaMetrics.totalErrors = handler.errorCount;
			cdaMetrics.totalSections = cd.getSections().size();
			for (Section section : cd.getAllSections()) {
				cdaMetrics.totalEntries += section.getEntries().size();
			}

			cdaMetrics.totalCodedElements = getMetric(cd, "datatypes::CD.allInstances()");

			cdaMetrics.totalClinicalStatements = getMetric(cd, "cda::ClinicalStatement.allInstances()");

			HashMap<String, String> codedMetrics = getCodedMetrics();

			cdaMetrics.codedMetricsCount = codedMetrics.size();
			for (String key : codedMetrics.keySet()) {
				String ocl = codedMetrics.get(key);
				Object o = CDAUtil.query(cd, ocl);
				if (o instanceof Collection && !((Collection) o).isEmpty()) {
					cdaMetrics.totalCodedMetrics++;
					cdaMetrics.codedMetrics.put(key, Boolean.TRUE);
				} else {
					cdaMetrics.codedMetrics.put(key, Boolean.FALSE);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return cdaMetrics;
	}

	private LinkedHashMap<String, String> getCodedMetrics() {

		LinkedHashMap<String, String> codedMetrics = new LinkedHashMap<String, String>();
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try {

			br = new BufferedReader(new FileReader(codeMetricsFile.getLocation().toOSString()));
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] s = line.split(cvsSplitBy);
				if (s.length == 2) {
					codedMetrics.put(s[0], s[1]);
				}

			}

		} catch (FileNotFoundException e) {
			// e.printStackTrace();
		} catch (IOException e) {
			// e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// e.printStackTrace();
				}
			}
		}

		return codedMetrics;
	}
}
