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
package org.openhealthtools.mdht.uml.cda.ant.taskdefs;

import org.apache.tools.ant.BuildException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Package;
import org.openhealthtools.mdht.uml.validation.util.UMLDiagnostician;

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

		org.openhealthtools.mdht.uml.common.UmlPlugin.computeModelPathMapExtensions();

		umlResource.getResourceSet().getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(false));

		EcoreUtil.resolveAll(umlResource.getResourceSet());

		monitor.setTaskName("Validating UML source model");
		logInfo("Validating UML source model...");

		UMLDiagnostician diagnostician = new UMLDiagnostician(monitor);
		final Diagnostic health = new LoggingDiagnosticChain(this);
		try {
			diagnostician.validate(defaultModel, (DiagnosticChain) health);
		} catch (Exception e) {
			throw new BuildException(e);
		}

		if ((health.getSeverity() >= Diagnostic.ERROR) && isFailOnError()) {
			throw new BuildException("Validation found one or more errors in the UML model.");
		}
	}

	// ANT task attributes -----------------------------------------------------

	public void setFailOnError(boolean failOnError) {
		this.failOnError = failOnError;
	}

	public boolean isFailOnError() {
		return failOnError;
	}

	// ANT task child elements
	// --------------------------------------------------

}
