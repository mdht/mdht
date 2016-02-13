/*******************************************************************************
 * Copyright (c) 2009, 2012, 2014 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - add validateModel sub-task (artf3037)
 *     Sean Muir (National E-Health Transition Authority (NEHTA)) - add Path Map Support
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ant.taskdefs;

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
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.mdht.uml.cda.ant.types.ModelElement;
import org.eclipse.mdht.uml.cda.ant.types.ModelLocation;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * Base class for the tasks that are defined in this plugin. Provides common behavior
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

	private List<ModelElement> modelElements = new ArrayList<ModelElement>();

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

	public final List<ModelElement> getModelElements() {
		return modelElements;
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

	public ModelElement createModelElement() {
		ModelElement modelElement = new ModelElement();
		modelElements.add(modelElement);
		return modelElement;
	}

	// public void addConfiguredModelElement(ModelElement elem) {
	// elements.add(elem);
	// }

	/**
	 * All the attribute checks should be performed in this method.
	 * Subclasses should call super.checkAttributes().
	 *
	 * @throws BuildException
	 */
	protected void checkAttributes() throws BuildException {
		if (modelLocations == null) {
			assertTrue(
				"The 'model' attribute or child element must be specified.", model != null && modelLocations == null);
		} else {
			for (ModelLocation modelLocation : modelLocations) {
				assertTrue(
					"Either the 'file' or the 'uri' attributes of a 'model' element must be specified.",
					modelLocation.getFile() != null || modelLocation.getUri() != null);
			}
		}
	}

	/**
	 * Executes all subtasks
	 */
	@Override
	public void execute() throws BuildException {
		checkAttributes();

		try {
			resourceSet = new ResourceSetImpl();
			resourceSet.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

			org.eclipse.mdht.uml.common.UmlPlugin.computeModelPathMapExtensions();

			resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(false));

			// load the models
			URI uri = null;
			if (model != null) {
				uri = URI.createFileURI(model.getAbsolutePath());
				Package pkg = (Package) UML2Util.load(resourceSet, uri, UMLPackage.Literals.PACKAGE);
				if (pkg != null) {
					rootPackages.add(pkg);
					logInfo("Loaded model: " + uri);

					if (defaultModel == null) {
						defaultModel = pkg;
					}
				} else {
					createNewModel(uri);
				}
			}

			if (modelLocations != null) {
				for (ModelLocation modelLocation : modelLocations) {
					if (modelLocation.getUri() != null) {
						uri = URI.createURI(modelLocation.getUri());
					} else if (modelLocation.getFile() != null) {
						try {
							uri = URI.createFileURI(modelLocation.getFile().getCanonicalPath());
						} catch (IOException e) {
							uri = URI.createFileURI(modelLocation.getFile().getAbsolutePath());
						}
					}
					Package pkg = (Package) UML2Util.load(resourceSet, uri, UMLPackage.Literals.PACKAGE);
					if (pkg != null) {
						rootPackages.add(pkg);
						logInfo("Loaded model: " + pkg.getQualifiedName());
					} else {
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

	public TransformToDomainModel createTransformToDomainModel() {
		TransformToDomainModel subtask = new TransformToDomainModel(this);
		subtasks.add(subtask);
		return subtask;
	}

	public FlattenModel createFlattenModel() {
		FlattenModel subtask = new FlattenModel(this);
		subtasks.add(subtask);
		return subtask;
	}

	public FilterModel createFilterModel() {
		FilterModel subtask = new FilterModel(this);
		subtasks.add(subtask);
		return subtask;
	}

	public TransformToDita createTransformToDita() {
		TransformToDita subtask = new TransformToDita(this);
		subtasks.add(subtask);
		return subtask;
	}

	public ValidateModel createValidateModel() {
		ValidateModel result = new ValidateModel(this);
		subtasks.add(result);
		return result;
	}

	// Helper methods ----------------------------------------------------------

	protected void logError(String message) {
		if (getProject() != null) {
			log(message, Project.MSG_ERR);
		}
	}

	protected void logWarning(String message) {
		if (getProject() != null) {
			log(message, Project.MSG_WARN);
		}
	}

	protected void logInfo(String message) {
		if (getProject() != null) {
			log(message, Project.MSG_INFO);
		}
	}

	/**
	 * Throws a <tt>BuildException</tt> if <tt>expression</tt> is false.
	 *
	 * @param message
	 * @param expression
	 * @throws BuildException
	 */
	public void assertTrue(String message, boolean expression) throws BuildException {
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
