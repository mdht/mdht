/*******************************************************************************
 * Copyright (c) 2009, 2012, 2014 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - validate UML model in UML-to-Ecore transformation
 *     Sean Muir (National E-Health Transition Authority (NEHTA)) - add Path Map Support
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ant.taskdefs;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.tools.ant.BuildException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Package;
import org.eclipse.mdht.uml.validation.util.UMLDiagnostician;

/**
 * Validate a UML model, reporting issues to the Ant console.
 */
public class ValidateModel extends CDAModelingSubTask {
	private boolean failOnError = true;

	public ValidateModel(CDAModelingTask parentTask) {
		super(parentTask);
	}

	@Override
	protected void checkAttributes() throws BuildException {
		assertTrue("The 'model' attribute must be specified.", getHL7ModelingTask().getDefaultModel() != null);
	}

	@Override
	public void doExecute() throws Exception {
		IProgressMonitor monitor = getProgressMonitor();
		validateUML(monitor);
	}

	private void validateUML(final IProgressMonitor monitor) {

		Package defaultModel = getHL7ModelingTask().getDefaultModel();
		Resource umlResource = defaultModel.eResource();

		org.eclipse.mdht.uml.common.UmlPlugin.computeModelPathMapExtensions();

		umlResource.getResourceSet().getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(false));

		EcoreUtil.resolveAll(umlResource.getResourceSet());

		monitor.setTaskName("Validating UML source model");
		logInfo("Validating UML source model...");

		UMLDiagnostician diagnostician = new UMLDiagnostician(monitor);
		final Diagnostic health = new LoggingDiagnosticChain(this, Diagnostic.ERROR);
		try {
			diagnostician.validate(defaultModel, (DiagnosticChain) health);
		} catch (Exception e) {
			throw new BuildException(e);
		}

		// Write out the model status - This is for other build processes to use in particular the automated build process
		//
		org.eclipse.emf.common.util.URI modelPath = umlResource.getURI();
		FileWriter fr;
		try {
			fr = new FileWriter(
				modelPath.toFileString().replaceFirst(modelPath.segment(modelPath.segmentCount() - 1), ".modelStatus"));
			fr.write(String.valueOf(health.getSeverity()));
			fr.close();
		} catch (IOException e) {

		}

		if ((health.getSeverity() >= Diagnostic.ERROR) && isFailOnError()) {
			throw new BuildException("Validation found one or more errors in the UML model.");
		}
	}

	public void setFailOnError(boolean failOnError) {
		this.failOnError = failOnError;
	}

	public boolean isFailOnError() {
		return failOnError;
	}

}
