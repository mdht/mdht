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
import org.eclipse.uml2.uml.Package;
import org.openhealthtools.mdht.uml.cda.transform.FilterTransformer;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;

/**
 * Filter the UML model content and optionally apply business names.
 * 
 * @version $Id: $
 */
public class FilterModel extends CDAModelingSubTask {

	/* attributes of this Ant task */
	private String outputModelPath = null;

	private Boolean useBusinessNames = null;

	public FilterModel(CDAModelingTask parentTask) {
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

		URI filteredModelURI = null;
		if (outputModelPath != null) {
			filteredModelURI = URI.createFileURI(outputModelPath);
		}
		if (filteredModelURI == null) {
			filteredModelURI = umlResource.getURI();
			filteredModelURI = filteredModelURI.trimFileExtension();
			filteredModelURI = filteredModelURI.trimSegments(1).appendSegment(
				filteredModelURI.lastSegment() + "_filtered");
		}

		String fileExtension = umlResource.getURI().fileExtension();
		if (!fileExtension.equals(filteredModelURI.fileExtension())) {
			filteredModelURI = filteredModelURI.appendFileExtension(fileExtension);
		}

		TransformerOptions options = new TransformerOptions();
		options.setOutputModelPath(outputModelPath);

		if (useBusinessNames != null) {
			options.setUseBusinessNames(useBusinessNames);
		}

		monitor.setTaskName("Generating filtered model");
		logInfo("Generating filtered model...");

		FilterTransformer transformer = new FilterTransformer(options);
		transformer.initialize(defaultModel);
		processModelElements(transformer);

		monitor.worked(1);
		if (monitor.isCanceled()) {
			return;
		}

		/* Save */
		monitor.setTaskName("Saving filtered model");
		logInfo("Saving filtered model: " + filteredModelURI.toString());

		try {
			if (transformer.getFilteredPackage() != null) {
				Map<String, String> saveOptions = new HashMap<String, String>();
				transformer.getFilteredPackage().eResource().save(saveOptions);
			}

		} catch (IOException e) {
			throw new BuildException(e);
		}
	}

	// ANT task attributes -----------------------------------------------------

	public void setOutputModel(String path) {
		outputModelPath = path;
	}

	public void setUseBusinessNames(boolean include) {
		useBusinessNames = new Boolean(include);
	}

	// ANT task child elements
	// --------------------------------------------------

}
