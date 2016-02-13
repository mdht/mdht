/*******************************************************************************
 * Copyright (c) 2011,2012 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir - initial API and implementation
 *     Sean Muir - Ported to stand alone Dita and Abstract Handler
 *
 * $Id$
 *******************************************************************************/
package org.dita.dost.handlers;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.apache.commons.lang.StringUtils;
import org.dita.dost.util.DitaUtil;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.IProgressService;

@SuppressWarnings("restriction")
public class PublishDitaHandler extends AbstractHandler {

	private static class PublishThread implements IRunnableWithProgress {
		IFile ditaMap;

		String targets;

		public PublishThread(IFile ditaMap, String targets) {
			super();
			this.ditaMap = ditaMap;
			this.targets = targets;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.jface.operation.IRunnableWithProgress#run(org.eclipse.core.runtime.IProgressMonitor)
		 */
		public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

			monitor.beginTask(
				"DITA Publishing " + ditaMap.getName(), (StringUtils.countMatches(targets, ",") + 1) * 300);

			for (String target : targets.split(",")) {
				try {
					monitor.subTask("Publish As " + target);

					ILaunch publishLaunch = DitaUtil.publish(ditaMap, target);
					int workcounter = 300;
					while (!publishLaunch.isTerminated() && !monitor.isCanceled()) {
						Thread.currentThread();
						Thread.sleep(100);
						monitor.worked(1);
						workcounter--;
					}
					monitor.worked(workcounter > 0
							? workcounter
							: 0);

					if (monitor.isCanceled()) {
						publishLaunch.terminate();
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					break;
				}
			}

			if (!monitor.isCanceled() && ditaMap.getProject() != null) {
				try {
					ditaMap.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
				} catch (CoreException e) {
				}
			}
		}
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (event.getParameter("org.dita.dost.parameter.target") != null) {
			try {
				if (event.getApplicationContext() instanceof IEvaluationContext) {
					IEvaluationContext evaluationContext = (IEvaluationContext) event.getApplicationContext();

					for (Object selection : (Collection) evaluationContext.getDefaultVariable()) {
						if (selection instanceof IFile) {

							IProgressService iProgressService = PlatformUI.getWorkbench().getProgressService();

							PublishThread publishThread = new PublishThread(
								(IFile) selection, event.getParameter("org.dita.dost.parameter.target"));
							iProgressService.busyCursorWhile(publishThread);

						}
					}
				}

			} catch (Exception e) {
				IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
				e.printStackTrace();
				MessageDialog.openError(window.getShell(), "DITA-OT Publishing", "Error" + e.getMessage());
				;
			}
		} else {
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			MessageDialog.openError(window.getShell(), "DITA-OT Publishing", "No Publishing Target");
			;
		}

		return null;
	}

}
