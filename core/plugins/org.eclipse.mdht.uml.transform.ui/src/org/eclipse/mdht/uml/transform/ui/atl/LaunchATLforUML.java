/*******************************************************************************
 * Copyright (c) 2013 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.transform.ui.atl;

import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.osgi.framework.Bundle;

public abstract class LaunchATLforUML implements IObjectActionDelegate {

	private static IInjector injector;

	private static IExtractor extractor;

	private static IReferenceModel umlMetamodel;

	private static IReferenceModel refiningTraceMetamodel;

	private static URL asmURL;

	private ISelection currentSelection;

	/**
	 * Constructor for Action
	 */
	public LaunchATLforUML() {
		super();
	}

	protected IReferenceModel getUMLMetamodel() {
		return umlMetamodel;
	}

	protected IReferenceModel getRefiningTraceMetamodel() {
		return refiningTraceMetamodel;
	}

	protected IInjector getInjector() {
		return injector;
	}

	protected IExtractor getExtractor() {
		return extractor;
	}

	protected abstract String getATLSourceBundleId();

	protected abstract String getATLSourceFilePath();

	private void initializeMetamodels() {
		// ATL transformation source
		Bundle bundle = Platform.getBundle(getATLSourceBundleId());
		asmURL = bundle.getEntry(getATLSourceFilePath());
		try {
			injector = CoreService.getInjector("EMF"); //$NON-NLS-1$
			extractor = CoreService.getExtractor("EMF"); //$NON-NLS-1$

			// Metamodels
			ModelFactory modelFactory = CoreService.getModelFactory("EMF"); //$NON-NLS-1$

			refiningTraceMetamodel = modelFactory.getBuiltInResource("RefiningTrace.ecore"); //$NON-NLS-1$
			umlMetamodel = modelFactory.newReferenceModel();
			injector.inject(umlMetamodel, "http://www.eclipse.org/uml2/3.0.0/UML"); //$NON-NLS-1$

			doInitializeMetamodels(modelFactory);

		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}

	protected void doInitializeMetamodels(ModelFactory modelFactory) throws ATLCoreException {
		// subclasses may specialize
	}

	protected void configureLauncher(ILauncher launcher, ModelFactory modelFactory) throws ATLCoreException {
		IModel refiningTraceModel = modelFactory.newModel(refiningTraceMetamodel);
		IModel umlModel = modelFactory.newModel(umlMetamodel);

		// Configure launcher
		launcher.addOutModel(refiningTraceModel, "refiningTrace", "RefiningTrace"); //$NON-NLS-1$ //$NON-NLS-2$
		launcher.addInModel(umlModel, "IN", "UML"); //$NON-NLS-1$ //$NON-NLS-2$
		launcher.addOutModel(umlModel, "OUT", "UML"); //$NON-NLS-1$ //$NON-NLS-2$

		doConfigureLauncher(launcher, modelFactory);
	}

	protected void doConfigureLauncher(ILauncher launcher, ModelFactory modelFactory) throws ATLCoreException {
		// subclasses may specialize
	}

	protected String getOutputFileSuffix() {
		return "-output";
	}

	protected String getOutputFilePath(IFile sourceFile) {
		IPath sourceModelPath = sourceFile.getFullPath();
		String outputFileName = sourceModelPath.removeFileExtension().lastSegment() + getOutputFileSuffix();
		IPath outputModelPath = sourceModelPath.removeLastSegments(1).append(outputFileName).addFileExtension(
			sourceModelPath.getFileExtension());

		return outputModelPath.toString();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction, org.eclipse.ui.IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		if (injector == null) {
			initializeMetamodels();
		}

		// Transform each file from selection
		IStructuredSelection iss = (IStructuredSelection) currentSelection;
		for (Iterator<?> iterator = iss.iterator(); iterator.hasNext();) {
			try {
				transform((IFile) iterator.next());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

	protected void transform(IFile file) throws Exception {
		ILauncher launcher = CoreService.getLauncher("EMF-specific VM"); //$NON-NLS-1$
		launcher.initialize(Collections.<String, Object> emptyMap());

		ModelFactory modelFactory = CoreService.getModelFactory("EMF"); //$NON-NLS-1$
		configureLauncher(launcher, modelFactory);

		// Load IN model
		String modelPath = file.getFullPath().toString();
		URI inModelURI = URI.createPlatformResourceURI(modelPath, true);
		injector.inject(launcher.getModel("IN"), inModelURI.toString());

		// Launch transform
		Map<String, Object> launcherOptions = new HashMap<String, Object>();
		launcherOptions.put("allowInterModelReferences", Boolean.TRUE);
		launcherOptions.put("supportUML2Stereotypes", Boolean.TRUE);
		launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), launcherOptions, asmURL.openStream());

		// Save OUT model
		String outputFilePath = getOutputFilePath(file);
		extractor.extract(launcher.getModel("OUT"), outputFilePath);

		// Refresh workspace
		file.getParent().refreshLocal(IResource.DEPTH_INFINITE, null);

	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.currentSelection = selection;
	}
}
