/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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


import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.Package;
import org.openhealthtools.mdht.uml.cda.dita.DitaTransformer;
import org.openhealthtools.mdht.uml.cda.dita.DitaTransformerOptions;

/** Transform CDA conceptual model to DITA files for publishing.
 *
 * @version $Id: $
 */
public class TransformToDita extends CDAModelingSubTask {

    /* attributes of this Ant task */
	private String ditaFilePath = null;
	private Boolean includeVocabularyConstraints = null;

	/* child elements of this Ant task */
//	private List<ModelElement> elements = new ArrayList<ModelElement>();
	
    public TransformToDita(CDAModelingTask parentTask) {
    	super(parentTask);
    }

	protected void checkAttributes() throws BuildException {
		assertTrue("The 'model' attribute must be specified.",
				getHL7ModelingTask().getDefaultModel() != null);
	}

    private void initializeProperties() {
    	Project project = getProject();

    	if (ditaFilePath == null && project.getProperty("ditaFilePath") != null) {
    		ditaFilePath = project.getProperty("ditaFilePath");
    	}
    	if (includeVocabularyConstraints == null && project.getProperty("includeVocabularyConstraints") != null) {
    		includeVocabularyConstraints = Boolean.valueOf(project.getProperty("includeVocabularyConstraints"));
    	}

    }
    
    public void doExecute() throws Exception {
    	// initial values from Ant global project properties
    	initializeProperties();
    	
		IProgressMonitor monitor = getProgressMonitor();
		transformToDITA(monitor);
    }

    private void transformToDITA(IProgressMonitor monitor) {
    	Package umlModel = getHL7ModelingTask().getDefaultModel();
    	
		monitor.worked(1);
		if( monitor.isCanceled() )
			return;
		
		/* Save */
		monitor.setTaskName("Creating DITA files");
		IPath outputPath = null;
		if (ditaFilePath != null) {
			outputPath = new Path(ditaFilePath);
		}
		if (outputPath == null) {
			URI modelURI = umlModel.eResource().getURI();
			if (modelURI.isFile()) {
				modelURI = modelURI.trimFileExtension().trimSegments(1);
				outputPath = new Path(modelURI.path());
			}
			else {
				logError("Invalid DITA file path.");
				return;
			}
		}

		logInfo("Saving files to: " + outputPath.toString());

    	DitaTransformerOptions options = new DitaTransformerOptions();
    	options.setOutputPath(outputPath);
    	if (includeVocabularyConstraints != null) {
    		options.setIncludeVocabularyConstraints(includeVocabularyConstraints);
    	}

    	DitaTransformer transformer = new DitaTransformer(options);
    	transformer.transformElement(umlModel);
		
    }
    
    
    // ANT task attributes -----------------------------------------------------

	public void setDitaFilePath(String path) {
		ditaFilePath = path;
	}

	public void setIncludeVocabularyConstraints(boolean include) {
		includeVocabularyConstraints = new Boolean(include);
	}


	// ANT task child elements
	// --------------------------------------------------
	
    
}
