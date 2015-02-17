/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
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
package org.openhealthtools.mdht.uml.hl7.ant.taskdefs;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.Model;
import org.openhealthtools.mdht.uml.hdf2xsd.transform.XSDTransformer;

/**
 * Import XSD to a UML model.
 * 
 * @version $Id: $
 */
public class TransformToXSDModel extends HL7ModelingSubTask {

	/* attributes of this Ant task */
	private String xsdModelPath = null;

	private Boolean includeVocabularyConstraints = null;

	private Boolean includeEmptyAssociationClasses = null;

	/* child elements of this Ant task */
	// private List<ModelElement> elements = new ArrayList<ModelElement>();

	public TransformToXSDModel(HL7ModelingTask parentTask) {
		super(parentTask);
	}

	@Override
	protected void checkAttributes() throws BuildException {
		assertTrue("The 'model' attribute must be specified.", getHL7ModelingTask().getDefaultModel() != null);

		assertTrue(
			"The model must contain a UML Model, not a Package.",
			getHL7ModelingTask().getDefaultModel() instanceof Model);
	}

	private void initializeProperties() {
		Project project = getProject();

		if (xsdModelPath == null && project.getProperty("xsdModel") != null) {
			xsdModelPath = project.getProperty("xsdModel");
		}
		if (includeVocabularyConstraints == null && project.getProperty("includeVocabularyConstraints") != null) {
			includeVocabularyConstraints = Boolean.valueOf(project.getProperty("includeVocabularyConstraints"));
		}
		if (includeEmptyAssociationClasses == null && project.getProperty("includeEmptyAssociationClasses") != null) {
			includeEmptyAssociationClasses = Boolean.valueOf(project.getProperty("includeEmptyAssociationClasses"));
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
		// TODO modify the XSD generation support Package instead of Model
		Model umlModel = (Model) getHL7ModelingTask().getDefaultModel();

		XSDTransformer transformer = new XSDTransformer();
		if (includeVocabularyConstraints != null) {
			transformer.setIncludeVocabularyConstraints(includeVocabularyConstraints);
		}
		if (includeEmptyAssociationClasses != null) {
			transformer.setIncludeEmptyAssociationClasses(includeEmptyAssociationClasses);
		}

		transformer.transformElement(umlModel);

		monitor.worked(1);
		if (monitor.isCanceled()) {
			return;
		}

		/* Save */
		monitor.setTaskName("Saving model");
		URI xsdModelURI = null;
		if (xsdModelPath != null) {
			xsdModelURI = URI.createFileURI(xsdModelPath);
		}
		if (xsdModelURI == null) {
			xsdModelURI = umlModel.eResource().getURI();
			xsdModelURI = xsdModelURI.trimFileExtension();
			xsdModelURI = xsdModelURI.trimSegments(1).appendSegment(xsdModelURI.lastSegment() + "_XSD");
		}

		String fileExtension = umlModel.eResource().getURI().fileExtension();
		if (!fileExtension.equals(xsdModelURI.fileExtension())) {
			xsdModelURI = xsdModelURI.appendFileExtension(fileExtension);
		}

		umlModel.eResource().setURI(xsdModelURI);
		logInfo("Saving model: " + xsdModelURI.toString());

		try {
			Map<String, String> options = new HashMap<String, String>();
			umlModel.eResource().save(options);

		} catch (IOException e) {
			throw new BuildException(e);
		}
	}

	// ANT task attributes -----------------------------------------------------

	public void setXsdModel(String path) {
		xsdModelPath = path;
	}

	public void setIncludeVocabularyConstraints(boolean include) {
		includeVocabularyConstraints = new Boolean(include);
	}

	public void setIncludeEmptyAssociationClasses(boolean include) {
		includeEmptyAssociationClasses = new Boolean(include);
	}

	// ANT task child elements
	// --------------------------------------------------

}
