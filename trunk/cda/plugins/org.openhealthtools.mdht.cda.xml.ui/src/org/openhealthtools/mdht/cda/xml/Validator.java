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
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.xerces.parsers.SAXParser;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.JavaRuntime;
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
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.DocumentRoot;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

@SuppressWarnings("restriction")
public class Validator extends AbstractNestedValidator {

	private static final String CDA_VALIDATOR_CONTEXT = "org.openhealthtools.mdht.cda.xml.validatorContext"; //$NON-NLS-1$

//	protected int indicateNoGrammar = 0;

	/**
	 * 
	 * Set any preferences for XML validation.
	 * 
	 * 
	 * 
	 * @see org.eclipse.wst.xml.core.internal.validation.core.AbstractNestedValidator#setupValidation(org.eclipse.wst.xml.core.internal.validation.core.NestedValidatorContext)
	 */

	protected void setupValidation(NestedValidatorContext context)

	{

		super.setupValidation(context);

//		indicateNoGrammar = XMLCorePlugin.getDefault().getPluginPreferences().getInt(XMLCorePreferenceNames.INDICATE_NO_GRAMMAR);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.wst.xml.core.internal.validation.core.AbstractNestedValidator
	 * #validate(java.lang.String, java.io.InputStream,
	 * org.eclipse.wst.xml.core.internal.validation.core.NestedValidatorContext)
	 */

	public ValidationReport validate(String uri, InputStream inputstream, NestedValidatorContext context)

	{

		return validate(uri, inputstream, context, null);

	}

	public static String getPath(EObject eObject) {
		String path = "";
		while (eObject != null && !(eObject instanceof DocumentRoot)) {
			EStructuralFeature feature = eObject.eContainingFeature();
			EObject container = eObject.eContainer();
			Object value = container.eGet(feature);
			if (feature.isMany()) {
				List<?> list = (List<?>) value;
				int index = list.indexOf(eObject) + 1;
				path = "/" + feature.getName() + "[" + index + "]" + path;
			} else {
				path = "/" + feature.getName() + "[1]" + path;
			}
			eObject = eObject.eContainer();
		}
		return path;
	}
	
	private static final String VALIDATIONS="validations.txt";
	
	public ValidationReport validate(String uri, InputStream inputstream, NestedValidatorContext context, ValidationResult result)

	{

		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

		String activeProject = "org.openhealthtools.mdht.uml.cda";

		URI cdaDocumentURI = URI.createURI(uri);
		
		for (IProject project : myWorkspaceRoot.getProjects()) {
			if (project.isOpen()) {
				// TODO use better approach to get correct launch project 
				for (String segment : cdaDocumentURI.segments())
				{
					if (segment.equals(project.getName()))
					{
						activeProject = project.getName();
						break;
					}
				}
				
			}
		}
		
		IPath path = Activator.getDefault().getStateLocation().append(VALIDATIONS);
		
		IPath lock = Activator.getDefault().getStateLocation().append("lock");
		
		try {
			ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
			
			ILaunchConfigurationType type = manager.getLaunchConfigurationType(IJavaLaunchConfigurationConstants.ID_JAVA_APPLICATION);

			ILaunchConfigurationWorkingCopy workingCopy = type.newInstance(	null, "Start CDA");

			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME,"org.openhealthtools.mdht.cda.xml.Validate");
			
			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS,uri + " " + path.toOSString() + " " + lock.toOSString());

			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME,activeProject);

			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_DEFAULT_CLASSPATH,true);
			
			workingCopy.setAttribute(IDebugUIConstants.ATTR_LAUNCH_IN_BACKGROUND, true);
			
			File validationFile = path.toFile();
			
			validationFile.delete();
			
			lock.toFile().createNewFile();

			workingCopy.launch(ILaunchManager.RUN_MODE, null);

		} catch (CoreException e) {
		} catch (IOException e) {
			
		}
	
		
		FilenameFilter validationFilter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.equals("lock");
			}
		};


		boolean done = false;
		int doneCtr=0;
		
		CDAValidationReport valreport = new CDAValidationReport(uri);
		
		while (!done && doneCtr++ < 5) {
			try {
				
				Thread.currentThread().sleep(1000);

				String[] files = Activator.getDefault().getStateLocation().toFile().list(validationFilter);
				if (files != null && files.length == 0) {
					parse(valreport, uri, Activator.getDefault().getStateLocation().append(VALIDATIONS));
					done = true;
				}

			} catch (InterruptedException e) {
				done = true;
			}
		}
		
		return valreport; 

	}

	/**
	 * 
	 * Store additional information in the message parameters. For XML
	 * validation there
	 * 
	 * are three additional pieces of information to store:
	 * 
	 * param[0] = the column number of the error
	 * 
	 * param[1] = the 'squiggle selection strategy' for which DOM part to
	 * squiggle
	 * 
	 * param[2] = the name or value of what is to be squiggled
	 * 
	 * 
	 * 
	 * @see org.eclipse.wst.xml.core.internal.validation.core.AbstractNestedValidator#addInfoToMessage(org.eclipse.wst.xml.core.internal.validation.core.ValidationMessage,
	 *      org.eclipse.wst.validation.internal.provisional.core.IMessage)
	 */

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

	/**
	 * 
	 * Get the nested validation context.
	 * 
	 * 
	 * 
	 * @param state
	 * 
	 *            the validation state.
	 * 
	 * @param create
	 * 
	 *            when true, a new context will be created if one is not found
	 * 
	 * @return the nested validation context.
	 */

	protected NestedValidatorContext getNestedContext(ValidationState state, boolean create)

	{

		NestedValidatorContext context = null;

		Object o = state.get(CDA_VALIDATOR_CONTEXT);

		if (o instanceof XMLNestedValidatorContext)

			context = (XMLNestedValidatorContext) o;

		else if (create)

		{

			context = new XMLNestedValidatorContext();

		}

		return context;

	}

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
	
	
	public static void parse(CDAValidationReport valreport,String cdauri, IPath filePath) {

		try
		{

			BufferedReader br = new BufferedReader(new FileReader(filePath.toFile()));

			String strLine = "";

			int diagnosticLine;

			int diagnosticColumn;

			while ((strLine = br.readLine()) != null)
			{				
				String diagnostic[] = strLine.split(",");
				
				diagnosticLine = Integer.valueOf(diagnostic[1]);
				
				diagnosticColumn = Integer.valueOf(diagnostic[2]);;
		
				if ("error".equals(diagnostic[0]))
				{
					valreport.addError(diagnostic[3], diagnosticLine, diagnosticColumn , cdauri);
				}
				
				if ("warning".equals(diagnostic[0]))
				{
					valreport.addWarning(diagnostic[3], diagnosticLine, diagnosticColumn , cdauri);
				}

			}

		}

		catch (Exception e)

		{


		}

	}

	

	
	public ValidationReport foo(String uri, InputStream inputstream, NestedValidatorContext context, ValidationResult result)

	{
		final CDAValidationReport valreport = new CDAValidationReport(uri);

		final String cdauri = uri;

		ClinicalDocument clinicalDocument;

		try {
			URI hl7ModelURI = URI.createURI(uri);

			if (hl7ModelURI.isFile()) {
				
				InputSource inputSource = new InputSource(hl7ModelURI.path());

				inputSource.setEncoding("UTF-8");
				
				XMLReader parser = new SAXParser();

				// Install the Content Handler
				final XPathIndexer xpathIndexer = new XPathIndexer();

				parser.setContentHandler(xpathIndexer);

				parser.parse(hl7ModelURI.path());

				clinicalDocument = CDAUtil.load(inputSource);

				CDAUtil.validate(clinicalDocument, new BasicValidationHandler() {

					public void handleError(Diagnostic diagnostic) {
						
						String path = "";
						if (diagnostic.getData().size() > 0 && diagnostic.getData().get(0) instanceof EObject) {
							path = getPath((EObject) diagnostic.getData().get(0));					
						}

						XPathIndexer.ElementLocationData eld = xpathIndexer.getElementLocationByPath(path.toUpperCase());
						if (eld != null) {
							valreport.addError(diagnostic.getMessage(), eld.line, eld.column, cdauri);
						} else {
							valreport.addError(diagnostic.getMessage() + "(" + path + ")", 0, 0, cdauri);
						}

					}

					public void handleInfo(Diagnostic diagnostic) {
						/*
						 * We do not currently display any information diagnostics in the problem view
						 */

					}

					public void handleWarning(Diagnostic diagnostic) {

						String path = "";
						if (diagnostic.getData().size() > 0 && diagnostic.getData().get(0) instanceof EObject) {
							path = getPath((EObject) diagnostic.getData().get(0));

						}

						XPathIndexer.ElementLocationData eld = xpathIndexer.getElementLocationByPath(path.toUpperCase());
						if (eld != null) {
							valreport.addWarning(diagnostic.getMessage(), eld.line, eld.column, cdauri);
						} else {
							valreport.addWarning( diagnostic.getMessage() + "(" + path + ")", 0, 0, cdauri);
						}

					}

				});

			}

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return valreport;

	}

	
}
