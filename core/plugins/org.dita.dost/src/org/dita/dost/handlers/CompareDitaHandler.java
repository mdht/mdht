/*******************************************************************************
 * Copyright (c) 2014 Sean Muir, JKM Software LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir, JKM Software LLC. - initial API and implementation
 *
 *******************************************************************************/
package org.dita.dost.handlers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.IProgressService;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.openhealthtools.mdht.uml.common.util.ModelCompare;

/**
 * @author fhim
 *
 */
public class CompareDitaHandler extends org.eclipse.core.commands.AbstractHandler {

	private static class PublishThread implements IRunnableWithProgress {

		private static String getResourceDate(Resource resource) {
			Date date = new Date(resource.getTimeStamp());
			SimpleDateFormat df2 = new SimpleDateFormat("MM/dd/yy");
			return df2.format(date);
		}

		private static Package getPackage(Resource umlResource) {
			Package packge = (Package) EcoreUtil.getObjectByType(
				umlResource.getContents(), UMLPackage.eINSTANCE.getPackage());
			if (packge != null) {
				return packge;
			} else {
				return (Package) EcoreUtil.getObjectByType(umlResource.getContents(), UMLPackage.eINSTANCE.getModel());
			}
		}

		private static void save(File file, byte[] bytes) {
			FileOutputStream fop = null;

			try {
				fop = new FileOutputStream(file);

				// if file doesnt exists, then create it
				if (!file.exists()) {
					file.createNewFile();
				}

				// get the content in bytes
				byte[] contentInBytes = bytes;

				fop.write(contentInBytes);
				fop.flush();
				fop.close();

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (fop != null) {
						fop.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		private static final String DITAMAP = "<?xml version=\"1.0\" encoding=\"utf-8\"?><!DOCTYPE map PUBLIC \"-//OASIS//DTD DITA Map//EN\" \"../dtd/technicalContent/dtd/map.dtd\"><map title=\"ModelCompare\"><topicref href=\"ModelCompare.dita\" type=\"task\"></topicref></map>";

		private static void saveResults(File ditaMapFile, File ditaFile, DitaCompare compareResults) {
			save(ditaMapFile, DITAMAP.getBytes());
			save(ditaFile, compareResults.getResults().getBytes());
		}

		/**
		 * @param leftModel
		 * @param rightModel
		 */
		public PublishThread(IFile leftModel, IFile rightModel) {
			super();
			this.leftModel = leftModel;
			this.rightModel = rightModel;
		}

		IFile leftModel;

		IFile rightModel;

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.jface.operation.IRunnableWithProgress#run(org.eclipse.core.runtime.IProgressMonitor)
		 */
		public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
			ResourceSet resourceSet = new ResourceSetImpl();

			// Initialize pathmaps
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				"emx", UMLResource.Factory.INSTANCE);
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				"efx", UMLResource.Factory.INSTANCE);

			URI modelFile1 = URI.createFileURI(leftModel.getRawLocation().toOSString());
			URI modelFile2 = URI.createFileURI(rightModel.getRawLocation().toOSString());

			try {

				monitor.beginTask("Comparing " + leftModel.getName() + " to " + rightModel.getName(), 100);

				monitor.subTask("Opening " + leftModel.getName());
				monitor.worked(5);
				Resource umlResource1 = resourceSet.getResource(modelFile1, true);
				monitor.worked(5);
				monitor.subTask("Opening" + rightModel.getName());
				Resource umlResource2 = resourceSet.getResource(modelFile2, true);
				monitor.worked(5);

				Package umlPackage1 = getPackage(umlResource1);

				Package umlPackage2 = getPackage(umlResource2);

				if (umlPackage1 != null && umlPackage2 != null) {

					monitor.subTask("Reading " + umlPackage1.getName());
					monitor.worked(15);
					EcoreUtil.resolveAll(umlPackage1);

					monitor.subTask("Reading " + umlPackage2.getName());
					monitor.worked(15);
					EcoreUtil.resolveAll(umlPackage2);

					DitaCompare compareResults = new DitaCompare(
						getResourceDate(umlResource1), getResourceDate(umlResource2), monitor);

					ModelCompare.compare(umlPackage1, umlPackage2, compareResults);

					IFile ditaFile = leftModel.getProject().getFile("ModelCompare.dita");

					IFile ditaMapFile = leftModel.getProject().getFile("ModelCompare.ditamap");

					// what if file is a link, resolve it.
					java.net.URI ditaFileURI = ditaFile.getLocationURI();
					if (ditaFile.isLinked()) {
						ditaFileURI = ditaFile.getRawLocationURI();
					}

					java.net.URI ditaMapFileURI = ditaMapFile.getLocationURI();
					if (ditaFile.isLinked()) {
						ditaMapFileURI = ditaFile.getRawLocationURI();
					}

					saveResults(
						EFS.getStore(ditaMapFileURI).toLocalFile(0, new NullProgressMonitor()),
						EFS.getStore(ditaFileURI).toLocalFile(0, new NullProgressMonitor()), compareResults);

				}
			} catch (Throwable t) {
				t.printStackTrace();
			}

			System.out.println("Done");

		}
	}

	private static final String MODELSERVERELEMENTCLASSNAME = "com.ibm.xtools.uml.navigator.ModelServerElement";

	private Class<?> getModelServerElement() {

		try {
			return Class.forName(MODELSERVERELEMENTCLASSNAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			if (event.getApplicationContext() instanceof IEvaluationContext) {
				IEvaluationContext evaluationContext = (IEvaluationContext) event.getApplicationContext();

				IFile leftModel = null;

				IFile rightModel = null;

				final Class<?> modelServerElement = getModelServerElement();

				if (modelServerElement != null) {
					final Method getResourceIfResourceRootMethod = modelServerElement.getMethod(
						"getResourceIfResourceRoot");

					for (Object selection : (Collection<?>) evaluationContext.getDefaultVariable()) {
						if (modelServerElement.isInstance(selection)) {
							if (leftModel == null) {
								leftModel = (IFile) getResourceIfResourceRootMethod.invoke(selection);
							} else {
								rightModel = (IFile) getResourceIfResourceRootMethod.invoke(selection);
							}

						}
					}

				} else {
					for (Object selection : (Collection<?>) evaluationContext.getDefaultVariable()) {
						if (selection instanceof IFile) {

							if (leftModel == null) {
								leftModel = (IFile) selection;
							} else {
								rightModel = (IFile) selection;
							}

						}
					}

				}

				if (leftModel != null && rightModel != null && leftModel.isAccessible() && rightModel.isAccessible()) {
					PublishThread publishThread = new PublishThread(leftModel, rightModel);

					IProgressService iProgressService = PlatformUI.getWorkbench().getProgressService();

					iProgressService.busyCursorWhile(publishThread);
				} else {
					IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
					MessageDialog.openError(window.getShell(), "Dita COMPARE", "Unable to open model files");
					;
				}
			}

		} catch (Exception e) {
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			e.printStackTrace();
			MessageDialog.openError(window.getShell(), "Dita COMPARE", "Error" + e.getMessage());
			;
		}
		return null;

	}
}
