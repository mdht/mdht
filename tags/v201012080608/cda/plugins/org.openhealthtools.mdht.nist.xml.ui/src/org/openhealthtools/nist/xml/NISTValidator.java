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
package org.openhealthtools.nist.xml;

import gov.nist.hitsp.validation.WSIndividualValidationResult;
import gov.nist.hitsp.validation.WSSpecification;
import gov.nist.hitsp.validation.WSValidationResults;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.ServiceClient;
import org.apache.xerces.parsers.SAXParser;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wst.validation.ValidationResult;
import org.eclipse.wst.validation.ValidationState;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.xml.core.internal.validation.XMLNestedValidatorContext;
import org.eclipse.wst.xml.core.internal.validation.core.AbstractNestedValidator;
import org.eclipse.wst.xml.core.internal.validation.core.NestedValidatorContext;
import org.eclipse.wst.xml.core.internal.validation.core.ValidationMessage;
import org.eclipse.wst.xml.core.internal.validation.core.ValidationReport;
import org.eclipse.wst.xml.core.internal.validation.eclipse.XMLMessageInfoHelper;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

@SuppressWarnings("restriction")
public class NISTValidator extends AbstractNestedValidator {

	public static class NISTDocumentEventProcessor {

		EndpointReference wsTarget = null;
		org.apache.axis2.client.Options options = null;
		ServiceClient serviceClient = null;
		OMFactory factory = null;
		OMNamespace namespace = null;

		ArrayList<String> specificationIDs = new ArrayList<String>();

		ArrayList<String> specificationNames = new ArrayList<String>();

		int getSelected(String specificationId) {
			return specificationIDs.indexOf(specificationId);
		}

		public ArrayList<String> getSpecificationNames() {

			try {
				if (specificationNames.isEmpty()) {
					if (wsTarget == null) {

						init(null);
					}
					OMElement method = factory.createOMElement("getAvailableValidations", namespace);
					OMElement result = serviceClient.sendReceive(method);
					WSSpecification[] results = WSSpecification.processMultiple(result, "return");

					for (int i = 0; i < results.length; i++) {
						WSSpecification docType = results[i];
						specificationIDs.add(docType.getSpecificationId());
						specificationNames.add(docType.getName());
					}

				}
			} catch (AxisFault e) {

			}

			return specificationNames;

		}

		String getSpecificationID(int index) {
			if (index < specificationIDs.size()) {
				return specificationIDs.get(index);
			} else {
				return "UNKNOWN SPECIFICATION";
			}

		}

		public String convertStreamToString(InputStream is) throws IOException {
			/*
			 * To convert the InputStream to String we use the
			 * BufferedReader.readLine() method. We iterate until the
			 * BufferedReader return null which means there's no more data to
			 * read. Each line will appended to a StringBuilder and returned as
			 * String.
			 */
			if (is != null) {
				StringBuilder sb = new StringBuilder();
				String line;

				try {
					BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
					while ((line = reader.readLine()) != null) {
						sb.append(line).append("\n");
					}
				} finally {
					is.close();
				}
				return sb.toString();
			} else {
				return "";
			}
		}

		public NISTDocumentEventProcessor() {
			super();
		}

		private void init(String target) throws AxisFault {
			if (target != null)
				wsTarget = new EndpointReference(target);
			else
				wsTarget = new EndpointReference("http://xreg2.nist.gov:8080/ws/services/ValidationWebService");

			options = new org.apache.axis2.client.Options();
			options.setTo(wsTarget);
			options.setTransportInProtocol(Constants.TRANSPORT_HTTP);
			// options.setTransportInProtocol(Constants.TRANSPORT_JMS);
			serviceClient = new ServiceClient();
			serviceClient.setOptions(options);
			factory = OMAbstractFactory.getOMFactory();
			namespace = factory.createOMNamespace("http://validation.hitsp.nist.gov", "nns");
		}

		public WSIndividualValidationResult[] validate(InputStream is, String specificationId) throws ParserConfigurationException, IOException, SAXException {

			if (wsTarget == null) {
				init(null);
			}

			OMElement method = factory.createOMElement("validateDocument", namespace);
			OMElement specification = factory.createOMElement("specificationId", namespace);
			OMElement document = factory.createOMElement("document", namespace);

			specification.addChild(factory.createOMText(specification, specificationId));

			String xml = convertStreamToString(is);

			document.addChild(factory.createOMText(document, xml));
			method.addChild(specification);
			method.addChild(document);
			OMElement result = serviceClient.sendReceive(method);
			WSValidationResults resultsProcessed = new WSValidationResults(result.getFirstElement());

			result.getFirstElement();

			WSIndividualValidationResult[] validationResults = resultsProcessed.getIssue();

			return validationResults;

		}

	}

	private static final String NIST_CDA_VALIDATOR_CONTEXT = "org.openhealthtools.mdht.cda.xml.nist.validatorContext"; //$NON-NLS-1$

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

	String specification = null;

	NISTDocumentEventProcessor nist = new NISTDocumentEventProcessor();

	public ValidationReport validate(String uri, InputStream inputstream, NestedValidatorContext context, ValidationResult result)

	{
		final CDAValidationReport valreport = new CDAValidationReport(uri);

		final String cdauri = uri;

		try {

			nist.init(null);

			Display.getDefault().syncExec(new Runnable() {

				public void run() {

					final Shell shell = new Shell(Display.getCurrent().getActiveShell(), SWT.TITLE | SWT.BORDER | SWT.APPLICATION_MODAL);

					shell.setText("NIST CDA Specification Definition");

					shell.setLayout(new GridLayout(4, false));

					GridData gridData = new GridData();

					gridData.grabExcessHorizontalSpace = true;

					gridData.grabExcessVerticalSpace = true;

					gridData.horizontalAlignment = SWT.CENTER;

					gridData.verticalAlignment = SWT.TOP;

					gridData.minimumHeight = 800;

					gridData.minimumWidth = 800;

					shell.setLayoutData(gridData);

					final Combo combo = new Combo(shell, SWT.DROP_DOWN | SWT.READ_ONLY);

					for (String name : nist.getSpecificationNames()) {
						combo.add(name);
					}

					combo.select(nist.getSelected(specification));
					
					specification = null;

					gridData = new GridData();

					gridData.grabExcessHorizontalSpace = true;

					gridData.grabExcessVerticalSpace = true;

					gridData.horizontalSpan = 4;

					gridData.horizontalAlignment = SWT.LEFT;

					combo.setLayoutData(gridData);

					gridData = new GridData();

					gridData.grabExcessHorizontalSpace = true;

					gridData.grabExcessVerticalSpace = true;

					gridData.horizontalAlignment = SWT.CENTER;

					final Button buttonOK = new Button(shell, SWT.PUSH);
					buttonOK.setText("Ok");
					buttonOK.setLayoutData(gridData);

					gridData = new GridData();

					gridData.grabExcessHorizontalSpace = true;

					gridData.grabExcessVerticalSpace = true;

					gridData.horizontalAlignment = SWT.RIGHT;

					Button buttonCancel = new Button(shell, SWT.PUSH);
					buttonCancel.setText("Cancel");
					buttonCancel.setLayoutData(gridData);

					buttonOK.addListener(SWT.Selection, new Listener() {
						public void handleEvent(Event event) {

							if (combo.getSelectionIndex() > 0) {
								specification = nist.getSpecificationID(combo.getSelectionIndex());
							}

							shell.dispose();
						}
					});

					buttonCancel.addListener(SWT.Selection, new Listener() {
						public void handleEvent(Event event) {
							shell.dispose();
						}
					});

					shell.addListener(SWT.Traverse, new Listener() {
						public void handleEvent(Event event) {
							if (event.detail == SWT.TRAVERSE_ESCAPE)
								event.doit = false;
						}
					});
					shell.pack();
					shell.open();

					Display display = Display.getCurrent();
					while (!shell.isDisposed()) {
						if (!display.readAndDispatch())
							display.sleep();
					}

				}
			});

			URI hl7ModelURI = URI.createURI(uri);

			if (specification!=null && hl7ModelURI.isFile()) {

				InputSource inputSource = new InputSource(hl7ModelURI.path());

				inputSource.setEncoding("UTF-8");

				XMLReader parser = new SAXParser();

				final XPathIndexer xpathIndexer = new XPathIndexer();

				parser.setContentHandler(xpathIndexer);

				parser.parse(hl7ModelURI.path());

				InputStream is = new FileInputStream(hl7ModelURI.path());

				WSIndividualValidationResult[] validationResults = nist.validate(is, specification);

				for (WSIndividualValidationResult validationResult : validationResults) {

					XPathIndexer.ElementLocationData eld = xpathIndexer.getElementLocationByPath(validationResult.getContext().toUpperCase());

					if (eld != null) {

						if ("error".equalsIgnoreCase(validationResult.getSeverity())) {
							valreport.addError(validationResult.getMessage(), eld.line, eld.column, cdauri);
						} else {
							valreport.addWarning(validationResult.getMessage(), eld.line, eld.column, cdauri);
						}

					} else {

						if ("error".equalsIgnoreCase(validationResult.getSeverity())) {
							valreport.addError(validationResult.getMessage() + "(" + validationResult.getContext() + ")", 0, 0, cdauri);
						} else {
							valreport.addWarning(validationResult.getMessage() + "(" + validationResult.getContext() + ")", 0, 0, cdauri);
						}

					}

				}

			} else
			{
				valreport.addWarning("Validation Service Request Cancelled", 0, 0, cdauri);
			}

		} catch (Exception e1) {
			e1.printStackTrace();
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

		Object o = state.get(NIST_CDA_VALIDATOR_CONTEXT);

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

				state.put(NIST_CDA_VALIDATOR_CONTEXT, context);

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

				state.put(NIST_CDA_VALIDATOR_CONTEXT, null);

			}

		}

	}
}
