/*******************************************************************************
 * Copyright (c) 2011 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ant.taskdefs;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.uml2.uml.Package;
import org.openhealthtools.mdht.uml.cda.transform.CDAFlattenTransformer;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.transform.FlattenTransformer;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;

/**
 * Flatten the UML model class generalization.
 * 
 * @version $Id: $
 */
public class FlattenModel extends CDAModelingSubTask {

	/* attributes of this Ant task */
	private Boolean includeBaseModel;

	private String outputModelPath = null;

	private String vocabModelPath = null;

	private Boolean useBusinessNames = null;

	public FlattenModel(CDAModelingTask parentTask) {
		super(parentTask);
	}

	@Override
	protected void checkAttributes() throws BuildException {
		assertTrue("The 'model' attribute must be specified.", getHL7ModelingTask().getDefaultModel() != null);
	}

	private void initializeProperties() {
		Project project = getProject();

		if (outputModelPath == null && project.getProperty("outputModel") != null) {
			outputModelPath = project.getProperty("outputModel");
		}
		if (useBusinessNames == null && project.getProperty("useBusinessNames") != null) {
			useBusinessNames = Boolean.valueOf(project.getProperty("useBusinessNames"));
		}

	}

	@Override
	public void doExecute() throws Exception {
		// initial values from Ant global project properties
		initializeProperties();

		IProgressMonitor monitor = getProgressMonitor();
		transformToUML(monitor);
	}

	private void transformToUML(IProgressMonitor monitor) {
		Package defaultModel = getHL7ModelingTask().getDefaultModel();
		Resource umlResource = defaultModel.eResource();
		Map<String, String> parsedProperties = aggregateFragmentProperties(umlResource);

		URI outputModelURI = null;
		if (outputModelPath != null) {
			outputModelURI = URI.createFileURI(outputModelPath);
		}
		if (outputModelURI == null) {
			outputModelURI = umlResource.getURI();
			outputModelURI = outputModelURI.trimFileExtension();
			outputModelURI = outputModelURI.trimSegments(1).appendSegment(outputModelURI.lastSegment() + "_flattened");
		}

		URI vocabModelURI = null;
		if (vocabModelPath != null) {
			vocabModelURI = URI.createFileURI(vocabModelPath);
		}

		String fileExtension = umlResource.getURI().fileExtension();
		if (!fileExtension.equals(outputModelURI.fileExtension())) {
			outputModelURI = outputModelURI.appendFileExtension(fileExtension);
		}
		if (vocabModelURI != null && !fileExtension.equals(vocabModelURI.fileExtension())) {
			vocabModelURI = vocabModelURI.appendFileExtension(fileExtension);
		}

		TransformerOptions options = new TransformerOptions();
		options.setOutputModelPath(outputModelPath);
		options.setVocabModelPath(vocabModelPath);

		if (includeBaseModel != null) {
			options.setIncludeBaseModel(includeBaseModel);
		}
		if (useBusinessNames != null) {
			options.setUseBusinessNames(useBusinessNames);
		}

		monitor.setTaskName("Generating flattened model");
		logInfo("Generating flattened model (includeBaseModel = " + includeBaseModel + ")...");

		FlattenTransformer transformer = new CDAFlattenTransformer(options);
		transformer.initialize(defaultModel);

		// write out copied properties before transform so that 'filter' keywords may be added
		if (!parsedProperties.isEmpty()) {
			URI propertiesURI = UMLUtil.getPropertiesURI(transformer.getFlattenedPackage().eResource());

			// don't overwrite properties file if it already exists
			if (!new ExtensibleURIConverterImpl().exists(propertiesURI, null)) {
				logInfo("Saving properties file: " + propertiesURI);
				UMLUtil.writeProperties(propertiesURI, parsedProperties);
			}
		}

		processModelElements(transformer);

		monitor.worked(1);
		if (monitor.isCanceled()) {
			return;
		}

		/* Save */
		monitor.setTaskName("Saving flattened model");
		logInfo("Saving flattened model: " + outputModelURI.toString());

		try {
			if (transformer.getFlattenedPackage() != null) {
				Map<String, String> saveOptions = new HashMap<String, String>();
				transformer.getFlattenedPackage().eResource().save(saveOptions);
			}
			if (transformer.getFlattenedVocabPackage() != null) {
				Map<String, String> saveOptions = new HashMap<String, String>();
				transformer.getFlattenedVocabPackage().eResource().save(saveOptions);
			}

		} catch (IOException e) {
			throw new BuildException(e);
		}
	}

	// ANT task attributes -----------------------------------------------------

	public void setIncludeBaseModel(boolean include) {
		includeBaseModel = new Boolean(include);
	}

	public void setOutputModel(String path) {
		outputModelPath = path;
	}

	public void setVocabModel(String path) {
		vocabModelPath = path;
	}

	public void setUseBusinessNames(boolean include) {
		useBusinessNames = new Boolean(include);
	}

	// ANT task child elements
	// --------------------------------------------------

}
