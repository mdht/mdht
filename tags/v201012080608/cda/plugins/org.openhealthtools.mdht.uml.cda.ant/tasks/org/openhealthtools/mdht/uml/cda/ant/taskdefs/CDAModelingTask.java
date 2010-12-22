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


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.taskdefs.Copy;
import org.apache.tools.ant.taskdefs.Delete;
import org.apache.tools.ant.taskdefs.Echo;
import org.apache.tools.ant.taskdefs.Property;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.openhealthtools.mdht.uml.cda.ant.types.ModelLocation;


/**
 * Base class for the tasks that are defined in this plugin.  Provides common behavior 
 * and facilities.
 * 
 * @version $id: $
 */
public class CDAModelingTask extends Task {

	// List of subtasks to be executed
	private List<Task> subtasks = new ArrayList<Task>();

	// The EMF resource set containing loaded models.
	private ResourceSet resourceSet;

	private File model;
	private List<ModelLocation> modelLocations;
	private Package defaultModel = null;
	private List<Package> rootPackages = new ArrayList<Package>();

	/** Creates a new instance of this task. */
	public CDAModelingTask() {
	}

	public final ResourceSet getResourceSet() {
		return resourceSet;
	}
	
	public final Package getDefaultModel() {
		return defaultModel;
	}
	
	public final List<Package> getRootPackages() {
		return rootPackages;
	}

	// Implementation of Ant Task ----------------------------------------------

	protected boolean supportMultipleURIs() {
		return true;
	}  
	  
	public ModelLocation createModel() {
		if (supportMultipleURIs()) {
			ModelLocation modelLocation = new ModelLocation();
			if (modelLocations == null) {
				modelLocations = new ArrayList<ModelLocation>();
				modelLocations.add(modelLocation);
			} else {
				modelLocations.add(0, modelLocation);
			}
	
			return modelLocation;
			
		} else {
			throw new BuildException("This task doesn't support multiple models");
		}
	}  

	/**
	 * All the attribute checks should be performed in this method.
	 * Subclasses should call super.checkAttributes().
	 * 
	 * @throws BuildException
	 */
	protected void checkAttributes() throws BuildException {
		if (modelLocations == null) {
			assertTrue("The 'model' attribute or child element must be specified.",
					model != null && modelLocations == null);
		} else {
			for (ModelLocation modelLocation : modelLocations) {
				assertTrue(
						"Either the 'file' or the 'uri' attributes of a 'model' element must be specified.",
						modelLocation.getFile() != null
								|| modelLocation.getUri() != null);
			}
		}
	}

	/**
	 * Executes all subtasks
	 */
	public void execute() throws BuildException {
		checkAttributes();
		
		try {
			resourceSet = new ResourceSetImpl();
			resourceSet.getLoadOptions().put(XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

			// load the models
			URI uri = null;
		    if (model != null) {
				uri = URI.createFileURI(model.getAbsolutePath());
				Package pkg = (Package) UMLUtil.load(resourceSet, uri, UMLPackage.Literals.PACKAGE);
				if (pkg != null) {
					rootPackages.add(pkg);
					logInfo("Loaded model: " + pkg.getQualifiedName());
					
					if (defaultModel == null) {
						defaultModel = pkg;
					}
				}
				else {
					createNewModel(uri);
				}
			}
		    
		    if (modelLocations != null) {
				for (ModelLocation modelLocation : modelLocations) {
					if (modelLocation.getUri() != null) {
						uri = URI.createURI(modelLocation.getUri());
					}
					else if (modelLocation.getFile() != null) {
						try {
							uri = URI.createFileURI(
									modelLocation.getFile().getCanonicalPath());
						} catch (IOException e) {
							uri = URI.createFileURI(
									modelLocation.getFile().getAbsolutePath());
						}
					}
					Package pkg = (Package) UMLUtil.load(resourceSet, uri, UMLPackage.Literals.PACKAGE);
					if (pkg != null) {
						rootPackages.add(pkg);
						logInfo("Loaded model: " + pkg.getQualifiedName());
					}
					else {
						logError("Error loading model: " + modelLocation.getFile());
					}
				}
			}
		} catch (Throwable t) {
			t.printStackTrace();
			throw new BuildException(t);
		}

		// execute subtasks
		for (Iterator<Task> it = subtasks.iterator(); it.hasNext();) {
			Task subtask = it.next();
			
			try {
				subtask.execute();
				
			} catch (Throwable t) {
				t.printStackTrace();
				throw new BuildException(t);
			}
		}
	}
	
	private void createNewModel(URI uri) {
		logInfo("Creating new model: " + uri.toString());
		
		String modelName = uri.lastSegment();
		modelName = modelName.substring(0, modelName.lastIndexOf("."));
		
		defaultModel = UMLFactory.eINSTANCE.createModel();
		defaultModel.setName(modelName);
		Resource modelResource = resourceSet.createResource(uri);
		modelResource.getContents().add(defaultModel);
	}

	// Ant task attributes -----------------------------------------------------

	public void setModel(File model) {
		this.model = model;
	}

	// ANT task child elements
	// --------------------------------------------------
	
	public void addCopy(Copy task) {
        subtasks.add(task);
    }

	public void addDelete(Delete task) {
        subtasks.add(task);
    }

	public void addEcho(Echo task) {
        subtasks.add(task);
    }

	public void addProperty(Property task) {
        subtasks.add(task);
    }

	// Creation and addition of subtasks ---------------------------------------

	public TransformToEcoreModel createTransformToEcoreModel() {
		TransformToEcoreModel subtask = new TransformToEcoreModel(this);
		subtasks.add(subtask);
		return subtask;
	}

	public TransformToDita createTransformToDita() {
		TransformToDita subtask = new TransformToDita(this);
		subtasks.add(subtask);
		return subtask;
	}

	// Helper methods ----------------------------------------------------------
	
	protected void logError(String message) {
		if (getProject() != null)
			log(message, Project.MSG_ERR);
	}

	protected void logWarning(String message) {
		if (getProject() != null)
			log(message, Project.MSG_WARN);
	}

	protected void logInfo(String message) {
		if (getProject() != null)
			log(message, Project.MSG_INFO);
	}

	/**
	 * Throws a <tt>BuildException</tt> if <tt>expression</tt> is false.
	 * 
	 * @param message
	 * @param expression
	 * @throws BuildException
	 */
	public void assertTrue(String message, boolean expression)
			throws BuildException {
		if (!expression) {
			throw new BuildException(message);
		}
	}

	// For testing purposes only -----------------------------------------------

	public static void main(String args[]) {

		CDAModelingTask mt = new CDAModelingTask();
		mt.execute();

	}

}
