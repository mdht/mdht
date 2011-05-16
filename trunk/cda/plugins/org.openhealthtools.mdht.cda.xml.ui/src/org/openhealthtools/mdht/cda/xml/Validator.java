/*******************************************************************************
 * Copyright (c) 2010 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.cda.xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.wst.validation.ValidationResult;
import org.eclipse.wst.validation.ValidationState;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.xml.core.internal.validation.XMLNestedValidatorContext;
import org.eclipse.wst.xml.core.internal.validation.core.AbstractNestedValidator;
import org.eclipse.wst.xml.core.internal.validation.core.NestedValidatorContext;
import org.eclipse.wst.xml.core.internal.validation.core.ValidationMessage;
import org.eclipse.wst.xml.core.internal.validation.core.ValidationReport;
import org.eclipse.wst.xml.core.internal.validation.eclipse.XMLMessageInfoHelper;
import org.openhealthtools.mdht.cda.xml.ui.Activator;

public class Validator extends AbstractNestedValidator {

	private static final String CDA_VALIDATOR_CONTEXT = "org.openhealthtools.mdht.cda.xml.validatorContext"; //$NON-NLS-1$

	public static void parse(CDAValidationReport valreport, String cdauri, IPath filePath) {

		final String DELIMITER = "~";

		try {

			BufferedReader br = new BufferedReader(new FileReader(filePath.toFile()));

			String strLine = "";

			int diagnosticLine;

			int diagnosticColumn;

			while ((strLine = br.readLine()) != null) {
				String diagnostic[] = strLine.split(DELIMITER);

				diagnosticLine = Integer.valueOf(diagnostic[1]);

				diagnosticColumn = Integer.valueOf(diagnostic[2]);
				;

				if ("error".equals(diagnostic[0])) {
					valreport.addError(diagnostic[3], diagnosticLine, diagnosticColumn, cdauri);
				}

				if ("warning".equals(diagnostic[0])) {
					valreport.addWarning(diagnostic[3], diagnosticLine, diagnosticColumn, cdauri);
				}

			}

		}

		catch (Exception e)

		{
			valreport.addError(e.getMessage(), 0, 0, cdauri);
		}

	}

	@Override
	protected void addInfoToMessage(ValidationMessage validationMessage, IMessage message)

	{

		String key = validationMessage.getKey();

		if (key != null)

		{

			XMLMessageInfoHelper messageInfoHelper = new XMLMessageInfoHelper();

			String[] messageInfo = messageInfoHelper.createMessageInfo(key, validationMessage.getMessageArguments());

			message.setAttribute(COLUMN_NUMBER_ATTRIBUTE, new Integer(validationMessage.getColumnNumber()));

			message.setAttribute(SQUIGGLE_SELECTION_STRATEGY_ATTRIBUTE, messageInfo[0]);

			message.setAttribute(SQUIGGLE_NAME_OR_VALUE_ATTRIBUTE, messageInfo[1]);

		}

	}

	@Override
	protected NestedValidatorContext getNestedContext(ValidationState state, boolean create)

	{

		NestedValidatorContext context = null;

		Object o = state.get(CDA_VALIDATOR_CONTEXT);

		if (o instanceof XMLNestedValidatorContext) {
			context = (XMLNestedValidatorContext) o;
		} else if (create)

		{

			context = new XMLNestedValidatorContext();

		}

		return context;

	}

	@Override
	protected void setupValidation(NestedValidatorContext context)

	{

		super.setupValidation(context);

	}

	@Override
	public ValidationReport validate(String uri, InputStream inputstream, NestedValidatorContext context)

	{

		return validate(uri, inputstream, context, null);

	}

	@Override
	public ValidationReport validate(String uri, InputStream inputstream, NestedValidatorContext context,
			ValidationResult result)

	{

		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

		IProject activeProject = null;

		URI cdaDocumentURI = URI.createURI(uri);

		/*
		 * uri passed in is full path, need to determine which project in the workspace the file is actually located
		 * Using the project URI; workspace is not sufficient because of linked projects
		 * the project.findmember was not able to return found from the uri we are passed
		 */

		String[] xmlDocumentSegments = cdaDocumentURI.segments();

		int segmentCtr = 0;

		for (IProject project : myWorkspaceRoot.getProjects()) {

			if (project.isOpen()) {

				URI projectURI = URI.createURI(project.getLocationURI().getPath());

				String[] projectSegments = projectURI.segments();

				segmentCtr = 0;

				while (segmentCtr < xmlDocumentSegments.length && segmentCtr < projectSegments.length) {
					if (!xmlDocumentSegments[segmentCtr].equals(projectSegments[segmentCtr])) {
						break;
					}
					segmentCtr++;
				}

				if (segmentCtr == projectSegments.length) {
					System.out.println(project.getName());
					activeProject = project;
					break;
				}
			}
		}

		IPath validationsPath = Activator.getDefault().getStateLocation().append(
			cdaDocumentURI.segment(cdaDocumentURI.segmentCount() - 1) + "validations");

		ILaunch launch = null;

		/*
		 * Using the launch manager, run the validator in the cda plugin and parse the results and add to the problems view
		 */
		try {
			ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();

			ILaunchConfigurationType type = manager.getLaunchConfigurationType(IJavaLaunchConfigurationConstants.ID_JAVA_APPLICATION);

			ILaunchConfigurationWorkingCopy workingCopy = type.newInstance(null, "ValidateCDA");

			workingCopy.setAttribute(
				IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME,
				"org.openhealthtools.mdht.uml.cda.internal.validate.Validate");

			String validateArguments = String.format(" \"%s\" \"%s\"  ", uri, validationsPath.toOSString());

			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, validateArguments);

			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, activeProject.getName());

			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_DEFAULT_CLASSPATH, true);

			workingCopy.setAttribute(IDebugUIConstants.ATTR_CONSOLE_PROCESS, true);

			workingCopy.setAttribute(IDebugUIConstants.ATTR_LAUNCH_IN_BACKGROUND, false);

			File validationFile = validationsPath.toFile();

			validationFile.delete();

			launch = workingCopy.launch(ILaunchManager.RUN_MODE, null);

		} catch (CoreException e) {
			e.printStackTrace();
		}

		boolean terminated = false;

		CDAValidationReport valreport = new CDAValidationReport(uri);

		while (!terminated) {
			for (IProcess process : launch.getProcesses()) {
				terminated = process.isTerminated();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				terminated = true;
			}
		}

		parse(valreport, uri, validationsPath);

		return valreport;

	}

	@Override
	public void validationFinishing(IProject project, ValidationState state, IProgressMonitor monitor)

	{

		if (project != null)

		{

			super.validationFinishing(project, state, monitor);

			NestedValidatorContext context = getNestedContext(state, false);

			if (context != null)

			{

				teardownValidation(context);

				state.put(CDA_VALIDATOR_CONTEXT, null);

			}

		}

	}

	@Override
	public void validationStarting(IProject project, ValidationState state, IProgressMonitor monitor)

	{

		if (project != null)

		{

			NestedValidatorContext context = getNestedContext(state, false);

			if (context == null)

			{

				context = getNestedContext(state, true);

				setupValidation(context);

				state.put(CDA_VALIDATOR_CONTEXT, context);

			}

			super.validationStarting(project, state, monitor);

		}

	}

}
