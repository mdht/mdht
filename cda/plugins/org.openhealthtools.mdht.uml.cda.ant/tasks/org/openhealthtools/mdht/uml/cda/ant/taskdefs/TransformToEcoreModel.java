/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adjusting to handle containment proxies
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
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Package;
import org.openhealthtools.mdht.uml.cda.transform.EcoreTransformer;
import org.openhealthtools.mdht.uml.cda.transform.EcoreTransformerOptions;

/** Transform CDA conceptual model to UML with Ecore extensions.
 *
 * @version $Id: $
 */
public class TransformToEcoreModel extends CDAModelingSubTask {

    /* attributes of this Ant task */
	private String ecoreModelPath = null;
	private Boolean includeVocabularyConstraints = null;

	/* child elements of this Ant task */
//	private List<ModelElement> elements = new ArrayList<ModelElement>();
	
    public TransformToEcoreModel(CDAModelingTask parentTask) {
    	super(parentTask);
    }

	protected void checkAttributes() throws BuildException {
		assertTrue("The 'model' attribute must be specified.",
				getHL7ModelingTask().getDefaultModel() != null);
	}

    private void initializeProperties() {
    	Project project = getProject();

    	if (ecoreModelPath == null && project.getProperty("ecoreModel") != null) {
    		ecoreModelPath = project.getProperty("ecoreModel");
    	}
    	if (includeVocabularyConstraints == null && project.getProperty("includeVocabularyConstraints") != null) {
    		includeVocabularyConstraints = Boolean.valueOf(project.getProperty("includeVocabularyConstraints"));
    	}

    }
    
    public void doExecute() throws Exception {
    	// initial values from Ant global project properties
    	initializeProperties();
    	
		IProgressMonitor monitor = getProgressMonitor();
		transformToUML(monitor);
    }

    private void transformToUML(IProgressMonitor monitor) {
    	Package umlModel = getHL7ModelingTask().getDefaultModel();
    	Resource umlResource = umlModel.eResource();

    	EcoreUtil.resolveAll(umlResource.getResourceSet());

    	for (TreeIterator<EObject> allContents = umlResource.getAllContents(); allContents.hasNext();) {
			EObject eObject = allContents.next();
			Resource eResource = eObject.eResource();
			if (eResource != umlResource) {
				if (eObject.eContainer() == null) {
					umlResource.getContents().add(eObject);
				} else {
					eResource.getContents().remove(eObject);
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

		String fileExtension = umlResource.getURI().fileExtension();
		if (!fileExtension.equals(ecoreModelURI.fileExtension())) {
			ecoreModelURI = ecoreModelURI.appendFileExtension(fileExtension);
		}
		
		umlResource.setURI(ecoreModelURI);
		
    	EcoreTransformerOptions options = new EcoreTransformerOptions();
    	if (includeVocabularyConstraints != null)
    		options.setIncludeVocabularyConstraints(includeVocabularyConstraints);

    	EcoreTransformer transformer = new EcoreTransformer(options);
    	transformer.transformElement(umlModel);
    	
		monitor.worked(1);
		if( monitor.isCanceled() )
			return;
		
		/* Save */
		monitor.setTaskName("Saving model");

		logInfo("Saving model: " + ecoreModelURI.toString());
		
		try {
			Map<String, String> saveOptions = new HashMap<String, String>();
			umlResource.save(saveOptions);
			
		} catch (IOException e) {
			throw new BuildException(e);
		}
    }
    
    
    // ANT task attributes -----------------------------------------------------

	public void setEcoreModel(String path) {
		ecoreModelPath = path;
	}

	public void setIncludeVocabularyConstraints(boolean include) {
		includeVocabularyConstraints = new Boolean(include);
	}


	// ANT task child elements
	// --------------------------------------------------
	
    
}
