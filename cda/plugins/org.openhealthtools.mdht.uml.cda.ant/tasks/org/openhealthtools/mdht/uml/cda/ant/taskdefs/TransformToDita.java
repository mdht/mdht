/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson.
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

import java.util.ArrayList;
import java.util.List;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.ant.types.EPackageClass;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.dita.DitaTransformer;
import org.openhealthtools.mdht.uml.cda.dita.DitaTransformerOptions;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * Transform CDA conceptual model to DITA files for publishing.
 * 
 * @version $Id: $
 */
public class TransformToDita extends CDAModelingSubTask {

	/* attributes of this Ant task */
	private String ditaFilePath = null;

	private String baseURL = null;

	private Boolean includeVocabularyConstraints = null;

	private List<EPackageClass> ePackageClasses = new ArrayList<EPackageClass>();

	/* child elements of this Ant task */
	// private List<ModelElement> elements = new ArrayList<ModelElement>();

	public TransformToDita(CDAModelingTask parentTask) {
		super(parentTask);
	}

	public void addEPackageClass(EPackageClass ePackageClass) {
		ePackageClasses.add(ePackageClass);
	}

	@Override
	protected void checkAttributes() throws BuildException {
		assertTrue("The 'model' attribute must be specified.", getHL7ModelingTask().getDefaultModel() != null);
	}

	@Override
	public void doExecute() throws Exception {

		CDAUtil.loadPackages();

		for (Package pkg : getHL7ModelingTask().getRootPackages()) {
			Stereotype codegenSupport = CDAProfileUtil.getAppliedCDAStereotype(
				pkg, ICDAProfileConstants.CODEGEN_SUPPORT);

			if (codegenSupport != null) {

				String basePackage = (String) pkg.getValue(
					codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_BASE_PACKAGE);

				String packageName = (String) pkg.getValue(
					codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_PACKAGE_NAME);

				String prefix = (String) pkg.getValue(codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_PREFIX);

				if (basePackage != null && packageName != null && prefix != null) {
					String generatedPackage = String.format(
						"%s.%s.%sPackage", basePackage, packageName.toLowerCase(),
						Character.toUpperCase(prefix.charAt(0)) + prefix.substring(1));

					try {

						logInfo("Loading Runtime " + generatedPackage);
						Class<?> c = Class.forName(generatedPackage);
						if (c != null) {
							c.getDeclaredField("eINSTANCE");
						}
					} catch (Throwable t) {
						logWarning("Unable to load Run time,  Samples will not be generated! " + t.getMessage() +
								generatedPackage);
					}

				}
			}
		}

		// initial values from Ant global project properties
		initializeProperties();

		IProgressMonitor monitor = getProgressMonitor();
		transformToDITA(monitor);
	}

	private void initializeProperties() {
		Project project = getProject();

		if (ditaFilePath == null && project.getProperty("ditaFilePath") != null) {
			ditaFilePath = project.getProperty("ditaFilePath");
		}
		if (baseURL == null && project.getProperty("baseURL") != null) {
			baseURL = project.getProperty("baseURL");
		}
		if (includeVocabularyConstraints == null && project.getProperty("includeVocabularyConstraints") != null) {
			includeVocabularyConstraints = Boolean.valueOf(project.getProperty("includeVocabularyConstraints"));
		}

	}

	// ANT task attributes -----------------------------------------------------

	public void setBaseURL(String url) {
		baseURL = url;
	}

	public void setDitaFilePath(String path) {
		ditaFilePath = path;
	}

	public void setIncludeVocabularyConstraints(boolean include) {
		includeVocabularyConstraints = new Boolean(include);
	}

	// ANT task child elements
	// --------------------------------------------------

	private void transformToDITA(IProgressMonitor monitor) {
		List<Package> umlModels = getHL7ModelingTask().getRootPackages();

		monitor.worked(1);
		if (monitor.isCanceled()) {
			return;
		}

		/* Save */
		monitor.setTaskName("Creating DITA files");
		IPath outputPath = null;
		if (ditaFilePath != null) {
			outputPath = new Path(ditaFilePath);
		}
		if (outputPath == null) {
			URI modelURI = umlModels.get(0).eResource().getURI();
			if (modelURI.isFile()) {
				modelURI = modelURI.trimFileExtension().trimSegments(1);
				outputPath = new Path(modelURI.path());
			} else {
				logError("Invalid DITA file path.");
				return;
			}
		}

		logInfo("Saving files to: " + outputPath.toString());

		DitaTransformerOptions options = new DitaTransformerOptions();
		options.setOutputPath(outputPath);
		if (baseURL != null) {
			options.setBaseURL(baseURL);
		}
		if (includeVocabularyConstraints != null) {
			options.setIncludeVocabularyConstraints(includeVocabularyConstraints);
		}
		for (EPackageClass ePackage : ePackageClasses) {
			options.addEPackage(ePackage.getQname());
		}

		DitaTransformer transformer = new DitaTransformer(options);
		for (Package umlModel : umlModels) {
			Resource umlResource = umlModel.eResource();
			EcoreUtil.resolveAll(umlResource.getResourceSet());

			transformer.transformElement(umlModel);
		}

	}

}
