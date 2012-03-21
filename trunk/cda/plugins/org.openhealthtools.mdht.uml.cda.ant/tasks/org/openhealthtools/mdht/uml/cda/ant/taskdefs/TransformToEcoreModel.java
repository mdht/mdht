/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adjusted to handle containment proxies
 *     Kenn Hussey - adjusted to handle (model) properties files
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Package;
import org.openhealthtools.mdht.uml.cda.transform.EcoreTransformer;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;

/**
 * Transform CDA conceptual model to UML with Ecore extensions.
 * 
 * @version $Id: $
 */
public class TransformToEcoreModel extends CDAModelingSubTask {

	/* attributes of this Ant task */
	private String ecoreModelPath = null;

	public TransformToEcoreModel(CDAModelingTask parentTask) {
		super(parentTask);
	}

	@Override
	protected void checkAttributes() throws BuildException {
		assertTrue("The 'model' attribute must be specified.", getHL7ModelingTask().getDefaultModel() != null);
	}

	private void initializeProperties() {
		Project project = getProject();

		if (ecoreModelPath == null && project.getProperty("ecoreModel") != null) {
			ecoreModelPath = project.getProperty("ecoreModel");
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
		collapseFragments(umlResource);

		URI ecoreModelURI = null;
		if (ecoreModelPath != null) {
			ecoreModelURI = URI.createFileURI(ecoreModelPath);
		}
		if (ecoreModelURI == null) {
			ecoreModelURI = umlResource.getURI();
			ecoreModelURI = ecoreModelURI.trimFileExtension();
			ecoreModelURI = ecoreModelURI.trimSegments(1).appendSegment(ecoreModelURI.lastSegment() + "_Ecore");
		}

		String fileExtension = umlResource.getURI().fileExtension();
		if (!fileExtension.equals(ecoreModelURI.fileExtension())) {
			ecoreModelURI = ecoreModelURI.appendFileExtension(fileExtension);
		}

		// change URI of the source model, then modify it
		// TODO change this to create elements in a new model
		umlResource.setURI(ecoreModelURI);

		EcoreUtil.resolveAll(defaultModel.eResource().getResourceSet());

		TransformerOptions options = new TransformerOptions();

		monitor.setTaskName("Generating Ecore model");
		logInfo("Generating Ecore model...");

		EcoreTransformer transformer = new EcoreTransformer(options);
		transformer.initialize(defaultModel);
		processModelElements(transformer);

		monitor.worked(1);
		if (monitor.isCanceled()) {
			return;
		}

		/* Save */
		monitor.setTaskName("Saving Ecore model");
		logInfo("Saving Ecore model: " + ecoreModelURI.toString());

		try {
			Map<String, String> saveOptions = new HashMap<String, String>();
			umlResource.save(saveOptions);

			if (!parsedProperties.isEmpty()) {
				UMLUtil.writeProperties(UMLUtil.getPropertiesURI(umlResource), parsedProperties);
			}

		} catch (IOException e) {
			throw new BuildException(e);
		}
	}

	// ANT task attributes -----------------------------------------------------

	public void setEcoreModel(String path) {
		ecoreModelPath = path;
	}

	/**
	 * @deprecated
	 */
	@Deprecated
	public void setDomainModel(String path) {
		// deprecated, leave for backward compatibility with ant scripts
	}

	// ANT task child elements
	// --------------------------------------------------

}
