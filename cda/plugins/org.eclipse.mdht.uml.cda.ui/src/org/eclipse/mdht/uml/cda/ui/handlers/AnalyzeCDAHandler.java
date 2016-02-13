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
package org.eclipse.mdht.uml.cda.ui.handlers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mdht.uml.cda.ui.handlers.AnalyzeCDAHandler.CDAAnalaysisInput.CDAMetrics;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassEditorViewContentProvider;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassEditorViewLabelProvider;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil.ValidationHandler;

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

			public IFile file;
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

			return null;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.ui.IEditorInput#exists()
		 */
		public boolean exists() {

			return false;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
		 */
		public ImageDescriptor getImageDescriptor() {

			return null;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.ui.IEditorInput#getName()
		 */
		public String getName() {

			return "MDHT CDA Batch Analyzer";
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.ui.IEditorInput#getPersistable()
		 */
		public IPersistableElement getPersistable() {

			return null;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.ui.IEditorInput#getToolTipText()
		 */
		public String getToolTipText() {

			return "MDHT CDA Batch Analyzer";
		}

	}

	public IFile codeMetricsFile;

	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {

			ProgressMonitorDialog pd = new ProgressMonitorDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());

			ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
			if (selection instanceof IStructuredSelection) {

				// ProgressMonitorPart monitor = new ProgressMonitorPart(
				// PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), new FillLayout(), true);

				/*
				 * IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				 * ed = window.getActivePage().getActiveEditor();
				 * shell = window.getShell();
				 */

				final CDAAnalaysisInput cdaAnalaysisInput = new CDAAnalaysisInput();
				final IStructuredSelection iss = (IStructuredSelection) selection;

				try {
					pd.run(true, true, new IRunnableWithProgress() {

						public void run(IProgressMonitor monitor)
								throws InvocationTargetException, InterruptedException {

							try {
								Iterator<Object> iter = iss.iterator();
								while (iter.hasNext() && !monitor.isCanceled()) {

									Object o = iter.next();
									if (o instanceof IFolder) {
										IFolder folder = (IFolder) o;

										monitor.beginTask("Analyze CDA Documents", folder.members().length);

										codeMetricsFile = folder.getFile("codemetrics.cfg");

										for (IResource resource : folder.members()) {

											if (monitor.isCanceled()) {
												monitor.done();
												break;
											}
											if (resource instanceof IFile) {
												IFile file = (IFile) resource;
												if ("XML".equalsIgnoreCase(file.getFileExtension())) {

													monitor.worked(1);
													monitor.subTask("Processing " + file.getName());
													cdaAnalaysisInput.getMetrics().add(analyzePluginMode(file));
													//
													// IWorkbench wb = PlatformUI.getWorkbench();
													// IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
													// IWorkbenchPage page = win.getActivePage();
													//
													// IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().findEditor(
													// "org.eclipse.mdht.uml.cda.ui.editors.CDAAnalyzer");
													//
													// page.openEditor(new FileEditorInput(file), desc.getId());

												}

											}

										}

									}
								}
							} catch (PartInitException e) {

							} catch (CoreException e) {

							}
						}
					});
				} catch (InvocationTargetException e) {

				} catch (InterruptedException e) {

				}

				IWorkbench wb = PlatformUI.getWorkbench();
				IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
				IWorkbenchPage page = win.getActivePage();

				IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().findEditor(
					"org.eclipse.mdht.uml.cda.ui.editors.CDAAnalyzer2");

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

		}

		public void handleInfo(Diagnostic diagnostic) {

		}
	};

	private int getMetric(ClinicalDocument cd, String ocl) throws Exception {
		HashSet o = (HashSet) CDAUtil.query(cd, ocl);
		return o.size();
	}

	public CDAMetrics analyzePluginMode(IFile file) {
		CDAMetrics cdaMetrics = new CDAMetrics();

		cdaMetrics.file = file;
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

			if (codeMetricsFile != null) {
				br = new BufferedReader(new FileReader(codeMetricsFile.getLocation().toOSString()));
				while ((line = br.readLine()) != null) {

					// use comma as separator
					String[] s = line.split(cvsSplitBy);
					if (s.length == 2) {
						codedMetrics.put(s[0], s[1]);
					}

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
