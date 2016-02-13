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
package org.eclipse.mdht.uml.cda.ant.taskdefs;

import java.util.Map;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Package;
import org.eclipse.mdht.transform.core.IRule;
import org.eclipse.mdht.transform.core.ITransformContext;
import org.eclipse.mdht.transform.core.ITransformMonitor;
import org.eclipse.mdht.transform.core.RuleBuilder;
import org.eclipse.mdht.transform.core.TransformationBuilder;
import org.eclipse.mdht.transform.core.TransformationException;
import org.eclipse.mdht.uml.cda.transform.EcoreTransformationBuilder;
import org.eclipse.mdht.uml.transform.UMLInitializeModelLocalizedNamesRule;

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

	private void transformToUML(final IProgressMonitor monitor) {
		Package defaultModel = getHL7ModelingTask().getDefaultModel();
		Resource umlResource = defaultModel.eResource();

		final Map<String, String> parsedProperties = aggregateFragmentProperties(umlResource);
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

		monitor.setTaskName("Generating Ecore model");
		logInfo("Generating Ecore model...");

		TransformationBuilder builder = EcoreTransformationBuilder.create();

		// add a rule to the initialization that makes the localized names available to the transformation
		builder.initialization().rule(new UMLInitializeModelLocalizedNamesRule(parsedProperties)).done();

		// add a fragment before save that checks for cancellation and logs the save operation
		builder.finalization().getRule(IRule.ID_SAVE_MODEL).before(new RuleBuilder.IFragmentDelegate() {

			public Object apply(EObject input, Object output, ITransformContext ctx, ITransformMonitor transformMonitor)
					throws TransformationException {

				monitor.worked(1);
				if (monitor.isCanceled()) {
					transformMonitor.abort("Transformation cancelled.");
				}

				monitor.setTaskName("Saving Ecore model");
				transformMonitor.info("Saving Ecore model: " + input.eResource().getURI());

				return output;
			}
		});

		try {
			processModelElements(builder.build());
		} catch (TransformationException e) {
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
