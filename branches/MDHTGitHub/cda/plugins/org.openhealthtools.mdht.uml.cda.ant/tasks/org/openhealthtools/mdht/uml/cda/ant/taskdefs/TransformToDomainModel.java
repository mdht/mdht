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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Package;
import org.openhealthtools.mdht.uml.cda.transform.DomainTransformer;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;

/**
 * Transform UML model to domain facade wrapper classes.
 * 
 * @author dcarlson
 * 
 */
public class TransformToDomainModel extends CDAModelingSubTask {

	/* attributes of this Ant task */
	private Boolean generateDomainInterface = null;

	private Boolean generateDomainClasses = null;

	private Boolean generateBuilderClasses = null;

	private Boolean includeFixedValueGetters = null;

	private Boolean includeInterfaceRealization = null;

	private Boolean useBusinessNames = null;

	private String domainModelPath = null;

	private String domainBasePackage = null;

	private String domainPackageName = null;

	private String domainNsURI = null;

	private String builderModelPath = null;

	public TransformToDomainModel(CDAModelingTask parentTask) {
		super(parentTask);
	}

	@Override
	protected void checkAttributes() throws BuildException {
		assertTrue("The 'model' attribute must be specified.", getHL7ModelingTask().getDefaultModel() != null);
	}

	private void initializeProperties() {
		Project project = getProject();

		if (domainModelPath == null && project.getProperty("domainModel") != null) {
			domainModelPath = project.getProperty("domainModel");
		}
		if (generateDomainInterface == null && project.getProperty("generateDomainInterface") != null) {
			generateDomainInterface = Boolean.valueOf(project.getProperty("generateDomainInterface"));
		}
		if (generateDomainClasses == null && project.getProperty("generateDomainClasses") != null) {
			generateDomainClasses = Boolean.valueOf(project.getProperty("generateDomainClasses"));
		}
		if (generateBuilderClasses == null && project.getProperty("generateBuilderClasses") != null) {
			generateBuilderClasses = Boolean.valueOf(project.getProperty("generateBuilderClasses"));
		}
		if (includeFixedValueGetters == null && project.getProperty("includeFixedValueGetters") != null) {
			includeFixedValueGetters = Boolean.valueOf(project.getProperty("includeFixedValueGetters"));
		}
		if (includeInterfaceRealization == null && project.getProperty("includeInterfaceRealization") != null) {
			includeInterfaceRealization = Boolean.valueOf(project.getProperty("includeInterfaceRealization"));
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

		// load all controlled resources, if used
		EcoreUtil.resolveAll(umlResource.getResourceSet());

		URI domainModelURI = null;
		if (domainModelPath != null) {
			domainModelURI = URI.createFileURI(domainModelPath);
		}
		if (domainModelURI == null) {
			domainModelURI = umlResource.getURI();
			domainModelURI = domainModelURI.trimFileExtension();
			domainModelURI = domainModelURI.trimSegments(1).appendSegment(
				domainModelURI.lastSegment() + "_domain_Ecore");
		}

		URI builderModelURI = null;
		if (builderModelPath != null) {
			builderModelURI = URI.createFileURI(builderModelPath);
		}
		if (builderModelURI == null) {
			builderModelURI = umlResource.getURI();
			builderModelURI = builderModelURI.trimFileExtension();
			builderModelURI = builderModelURI.trimSegments(1).appendSegment(
				builderModelURI.lastSegment() + "_builder_Ecore");
		}

		String fileExtension = umlResource.getURI().fileExtension();
		if (!fileExtension.equals(domainModelURI.fileExtension())) {
			domainModelURI = domainModelURI.appendFileExtension(fileExtension);
		}
		if (!fileExtension.equals(builderModelURI.fileExtension())) {
			builderModelURI = builderModelURI.appendFileExtension(fileExtension);
		}

		TransformerOptions transformerOptions = new TransformerOptions();
		transformerOptions.setDomainModelPath(domainModelPath);

		if (generateDomainInterface != null) {
			transformerOptions.setGenerateDomainInterface(generateDomainInterface);
		}
		if (generateDomainClasses != null) {
			transformerOptions.setGenerateDomainClasses(generateDomainClasses);
		}
		if (generateBuilderClasses != null) {
			transformerOptions.setGenerateBuilderClasses(generateBuilderClasses);
		}
		if (includeFixedValueGetters != null) {
			transformerOptions.setIncludeFixedValueGetters(includeFixedValueGetters);
		}
		if (includeInterfaceRealization != null) {
			transformerOptions.setIncludeInterfaceRealization(includeInterfaceRealization);
		}
		if (useBusinessNames != null) {
			transformerOptions.setUseBusinessNames(useBusinessNames);
		}
		if (domainPackageName != null) {
			transformerOptions.setDomainPackageName(domainPackageName);
		}
		if (domainBasePackage != null) {
			transformerOptions.setDomainBasePackage(domainBasePackage);
		}
		if (domainNsURI != null) {
			transformerOptions.setDomainNsURI(domainNsURI);
		}

		monitor.setTaskName("Generating domain model");
		logInfo("Generating domain model...");

		DomainTransformer transformer = new DomainTransformer(transformerOptions);
		processModelElements(transformer);

		monitor.worked(1);
		if (monitor.isCanceled()) {
			return;
		}

		/* Save */
		if (transformerOptions.getDomainInterfacePackage() != null) {
			monitor.setTaskName("Saving domain model");
			logInfo("Saving domain model: " + domainModelURI.toString());

			try {
				Map<String, String> saveOptions = new HashMap<String, String>();
				transformerOptions.getDomainInterfacePackage().eResource().save(saveOptions);

			} catch (IOException e) {
				throw new BuildException(e);
			}
		}

	}

	// ANT task attributes -----------------------------------------------------

	public void setDomainModel(String path) {
		domainModelPath = path;
	}

	public void setDomainPackageName(String name) {
		domainPackageName = name;
	}

	public void setDomainBasePackage(String basePackage) {
		domainBasePackage = basePackage;
	}

	public void setDomainNsURI(String nsURI) {
		domainNsURI = nsURI;
	}

	public void setBuilderModel(String path) {
		builderModelPath = path;
	}

	public void setGenerateDomainInterface(boolean include) {
		generateDomainInterface = new Boolean(include);
	}

	public void setGenerateDomainClasses(boolean include) {
		generateDomainClasses = new Boolean(include);
	}

	public void setGenerateBuilderClasses(boolean include) {
		generateBuilderClasses = new Boolean(include);
	}

	public void setIncludeFixedValueGetters(boolean include) {
		includeFixedValueGetters = new Boolean(include);
	}

	public void setIncludeInterfaceRealization(boolean include) {
		includeInterfaceRealization = new Boolean(include);
	}

	public void setUseBusinessNames(boolean include) {
		useBusinessNames = new Boolean(include);
	}

	// ANT task child elements
	// --------------------------------------------------

}
