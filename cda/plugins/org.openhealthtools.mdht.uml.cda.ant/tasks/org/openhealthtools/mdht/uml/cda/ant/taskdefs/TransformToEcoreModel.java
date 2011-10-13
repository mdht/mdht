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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Package;
import org.openhealthtools.mdht.uml.cda.transform.EcoreTransformer;
import org.openhealthtools.mdht.uml.cda.transform.EcoreTransformerOptions;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

/**
 * Transform CDA conceptual model to UML with Ecore extensions.
 * 
 * @version $Id: $
 */
public class TransformToEcoreModel extends CDAModelingSubTask {

	/* attributes of this Ant task */
	private String ecoreModelPath = null;

	private String domainModelPath = null;

	private String domainBasePackage = null;

	private String domainPackageName = null;

	private String domainNsURI = null;

	private String builderModelPath = null;

	private String consolidatedModelPath = null;

	private Boolean generateDomainInterface = null;

	private Boolean generateDomainClasses = null;

	private Boolean generateBuilderClasses = null;

	private Boolean generateConsolidatedModel;

	private Boolean includeFixedValueGetters = null;

	private Boolean includeInterfaceRealization = null;

	private Boolean useBusinessNames = null;

	/* child elements of this Ant task */
	// private List<ModelElement> elements = new ArrayList<ModelElement>();

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
		if (domainModelPath == null && project.getProperty("domainModel") != null) {
			domainModelPath = project.getProperty("domainModel");
		}
		if (builderModelPath == null && project.getProperty("builderModel") != null) {
			builderModelPath = project.getProperty("builderModel");
		}
		if (consolidatedModelPath == null && project.getProperty("consolidatedModel") != null) {
			consolidatedModelPath = project.getProperty("consolidatedModel");
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
		if (generateConsolidatedModel == null && project.getProperty("generateConsolidatedModel") != null) {
			generateConsolidatedModel = Boolean.valueOf(project.getProperty("generateConsolidatedModel"));
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
		List<Package> umlModels = getHL7ModelingTask().getRootPackages();
		Package defaultModel = getHL7ModelingTask().getDefaultModel();
		Resource umlResource = defaultModel.eResource();

		URI propertiesURI = UMLUtil.getPropertiesURI(umlResource);
		String properties = UMLUtil.readProperties(propertiesURI);
		Map<String, String> parsedProperties = properties != null
				? UMLUtil.parseProperties(properties)
				: new LinkedHashMap<String, String>();

		EcoreUtil.resolveAll(umlResource.getResourceSet());

		EList<EObject> umlResourceContents = umlResource.getContents();

		for (Resource controlledResource : UMLUtil.getControlledResources(umlResource)) {
			URI controlledPropertiesURI = UMLUtil.getPropertiesURI(controlledResource);
			String controlledProperties = UMLUtil.readProperties(controlledPropertiesURI);

			if (controlledProperties != null) {
				parsedProperties.putAll(UMLUtil.parseProperties(controlledProperties));
			}

			for (ListIterator<EObject> contents = controlledResource.getContents().listIterator(); contents.hasNext();) {
				EObject next = contents.next();

				contents.remove();

				if (next.eContainer() == null) {
					umlResourceContents.add(next);
				}
			}
		}

		URI ecoreModelURI = null;
		if (ecoreModelPath != null) {
			ecoreModelURI = URI.createFileURI(ecoreModelPath);
		}
		if (ecoreModelURI == null) {
			ecoreModelURI = umlResource.getURI();
			ecoreModelURI = ecoreModelURI.trimFileExtension();
			ecoreModelURI = ecoreModelURI.trimSegments(1).appendSegment(ecoreModelURI.lastSegment() + "_Ecore");
		}

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

		URI consolidatedModelURI = null;
		if (consolidatedModelPath != null) {
			consolidatedModelURI = URI.createFileURI(consolidatedModelPath);
		}
		if (consolidatedModelURI == null) {
			consolidatedModelURI = umlResource.getURI();
			consolidatedModelURI = builderModelURI.trimFileExtension();
			consolidatedModelURI = builderModelURI.trimSegments(1).appendSegment(
				consolidatedModelURI.lastSegment() + "_consolidated");
		}

		String fileExtension = umlResource.getURI().fileExtension();
		if (!fileExtension.equals(ecoreModelURI.fileExtension())) {
			ecoreModelURI = ecoreModelURI.appendFileExtension(fileExtension);
		}
		if (!fileExtension.equals(domainModelURI.fileExtension())) {
			domainModelURI = domainModelURI.appendFileExtension(fileExtension);
		}
		if (!fileExtension.equals(builderModelURI.fileExtension())) {
			builderModelURI = builderModelURI.appendFileExtension(fileExtension);
		}
		if (!fileExtension.equals(consolidatedModelURI.fileExtension())) {
			consolidatedModelURI = consolidatedModelURI.appendFileExtension(fileExtension);
		}

		umlResource.setURI(ecoreModelURI);

		EcoreTransformerOptions options = new EcoreTransformerOptions();
		options.setDomainModelPath(domainModelPath);
		options.setBuilderModelPath(builderModelPath);
		options.setConsolidatedModelPath(consolidatedModelPath);

		if (generateDomainInterface != null) {
			options.setGenerateDomainInterface(generateDomainInterface);
		}
		if (generateDomainClasses != null) {
			options.setGenerateDomainClasses(generateDomainClasses);
		}
		if (generateBuilderClasses != null) {
			options.setGenerateBuilderClasses(generateBuilderClasses);
		}
		if (generateConsolidatedModel != null) {
			options.setGenerateConsolidatedModel(generateConsolidatedModel);
		}
		if (includeFixedValueGetters != null) {
			options.setIncludeFixedValueGetters(includeFixedValueGetters);
		}
		if (includeInterfaceRealization != null) {
			options.setIncludeInterfaceRealization(includeInterfaceRealization);
		}
		if (useBusinessNames != null) {
			options.setUseBusinessNames(useBusinessNames);
		}
		if (domainPackageName != null) {
			options.setDomainPackageName(domainPackageName);
		}
		if (domainBasePackage != null) {
			options.setDomainBasePackage(domainBasePackage);
		}
		if (domainNsURI != null) {
			options.setDomainNsURI(domainNsURI);
		}

		EcoreUtil.resolveAll(defaultModel.eResource().getResourceSet());
		EcoreTransformer transformer = new EcoreTransformer(options);
		for (Package umlModel : umlModels) {
			transformer.transformElement(umlModel);
		}

		monitor.worked(1);
		if (monitor.isCanceled()) {
			return;
		}

		/* Save */
		monitor.setTaskName("Saving model");

		logInfo("Saving model: " + ecoreModelURI.toString());

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

	public void setConsolidatedModel(String path) {
		consolidatedModelPath = path;
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

	public void setGenerateConsolidatedModel(boolean include) {
		generateConsolidatedModel = new Boolean(include);
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
