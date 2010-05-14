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

import java.io.InputStream;
import java.util.List;

import org.apache.xerces.parsers.SAXParser;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.wst.validation.ValidationResult;
import org.eclipse.wst.validation.ValidationState;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.xml.core.internal.validation.XMLNestedValidatorContext;
import org.eclipse.wst.xml.core.internal.validation.core.AbstractNestedValidator;
import org.eclipse.wst.xml.core.internal.validation.core.NestedValidatorContext;
import org.eclipse.wst.xml.core.internal.validation.core.ValidationMessage;
import org.eclipse.wst.xml.core.internal.validation.core.ValidationReport;
import org.eclipse.wst.xml.core.internal.validation.eclipse.XMLMessageInfoHelper;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.DocumentRoot;
import org.openhealthtools.mdht.uml.cda.util.BasicValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
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

	private static String getPath(EObject eObject) {
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


	public ValidationReport validate(String uri, InputStream inputstream, NestedValidatorContext context, ValidationResult result)

	{

//		XMLValidator validator = XMLValidator.getInstance();

		final CDAValidationReport valreport = new CDAValidationReport(uri);

		final String cdauri = uri;

//		DatatypesPackage.eINSTANCE.eClass();
//
//		org.openhealthtools.mdht.uml.hl7.datatypes.PN pn = DatatypesFactory.eINSTANCE.createPN();


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
}
