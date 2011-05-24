/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
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
package org.openhealthtools.mdht.uml.hl7.ant.taskdefs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DirectoryScanner;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.FileSet;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Model;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageBase;
import org.openhealthtools.mdht.uml.hl7.mif2uml.mapping.MIFImporter;

/**
 * Import MIF to a UML model.
 * 
 * @version $Id: $
 */
public class ImportMIF2 extends HL7ModelingSubTask {

	private String xmlEncoding = "UTF-8";

	/* attributes of this Ant task */
	private Boolean createAssociationClasses = null;

	private Boolean usePackageTitle = null;

	private Boolean createStructuralAttributes = null;

	private Boolean createFilePerPackage = null;

	private Boolean suppressDatatypeCollections = null;

	private Boolean useXHTML = null;

	/* child elements of this Ant task */
	private List<FileSet> filesets = new ArrayList<FileSet>();

	public ImportMIF2(HL7ModelingTask parentTask) {
		super(parentTask);
	}

	@Override
	protected void checkAttributes() throws BuildException {
		assertTrue("The 'model' attribute must be specified.", getHL7ModelingTask().getDefaultModel() != null);

		assertTrue(
			"The model must contain a UML Model, not a Package.",
			getHL7ModelingTask().getDefaultModel() instanceof Model);
	}

	private void initializeProperties() {
		Project project = getProject();

		if (createAssociationClasses == null && project.getProperty("createAssociationClasses") != null) {
			createAssociationClasses = Boolean.valueOf(project.getProperty("createAssociationClasses"));
		}
		if (usePackageTitle == null && project.getProperty("usePackageTitle") != null) {
			usePackageTitle = Boolean.valueOf(project.getProperty("usePackageTitle"));
		}
		if (createStructuralAttributes == null && project.getProperty("createStructuralAttributes") != null) {
			createStructuralAttributes = Boolean.valueOf(project.getProperty("createStructuralAttributes"));
		}
		if (createFilePerPackage == null && project.getProperty("createFilePerPackage") != null) {
			createFilePerPackage = Boolean.valueOf(project.getProperty("createFilePerPackage"));
		}
		if (suppressDatatypeCollections == null && project.getProperty("suppressDatatypeCollections") != null) {
			suppressDatatypeCollections = Boolean.valueOf(project.getProperty("suppressDatatypeCollections"));
		}
		if (useXHTML == null && project.getProperty("useXHTML") != null) {
			useXHTML = Boolean.valueOf(project.getProperty("useXHTML"));
		}

	}

	@Override
	public void doExecute() throws Exception {
		// initial values from Ant global project properties
		initializeProperties();

		IProgressMonitor monitor = getProgressMonitor();
		importMifFiles(monitor);
	}

	private void importMifFiles(IProgressMonitor monitor) {
		// TODO modify MIF import to support Package instead of Model
		Model umlModel = (Model) getHL7ModelingTask().getDefaultModel();

		monitor.worked(1);
		if (monitor.isCanceled()) {
			return;
		}

		/* Resource set to contain loaded MIF resources */
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

		/* Import the MIF files */
		monitor.setTaskName("Loading MIF files...");
		List<PackageBase> mifElements = new ArrayList<PackageBase>();

		List<String> mifFiles = new ArrayList<String>();
		for (Iterator itFSets = filesets.iterator(); itFSets.hasNext();) {
			FileSet fs = (FileSet) itFSets.next();
			DirectoryScanner ds = fs.getDirectoryScanner(getProject());
			String[] includedFiles = ds.getIncludedFiles();
			for (int i = 0; i < includedFiles.length; i++) {
				String filename = includedFiles[i].replace('\\', '/');
				if (filename.endsWith((".mif")) || filename.endsWith((".coremif"))) {
					File base = ds.getBasedir();
					File file = new File(base, includedFiles[i]);
					try {
						mifFiles.add((file).toURL().toString());
					} catch (MalformedURLException e) {
						logError("Invalid file URL: " + file.toString());
					}
				}
			}
		}

		IProgressMonitor subMonitor = new SubProgressMonitor(monitor, 5);
		subMonitor.beginTask("Loading MIF files...", mifFiles.size());
		logInfo("Loading " + mifFiles.size() + " MIF2 files (plus dependencies)...");
		try {
			for (Iterator iter = mifFiles.iterator(); iter.hasNext();) {
				String filePath = iter.next().toString();
				subMonitor.setTaskName("Loading " + filePath);
				URI uri = URI.createURI(filePath);
				PackageBase mifModel = loadMIFFile(resourceSet, uri);
				if (mifModel != null) {
					mifElements.add(mifModel);
				}
				subMonitor.worked(1);
				if (subMonitor.isCanceled()) {
					return;
				}
			}
		} finally {
			subMonitor.done();
		}
		if (monitor.isCanceled()) {
			return;
		}

		monitor.setTaskName("Transforming MIF to UML...");
		logInfo("Transforming MIF2 to UML...");
		MIFImporter importer = new MIFImporter();
		importer.setUMLModel(umlModel);

		if (createAssociationClasses != null) {
			importer.setCreateAssociationClasses(createAssociationClasses);
		}

		if (createStructuralAttributes != null) {
			importer.setCreateStructuralAttributes(createStructuralAttributes);
		}

		if (createFilePerPackage != null) {
			importer.setCreateFilePerPackage(createFilePerPackage);
		}

		if (usePackageTitle != null) {
			importer.setUsePackageTitle(usePackageTitle);
		}

		if (suppressDatatypeCollections != null) {
			importer.setSuppressDatatypeCollections(suppressDatatypeCollections);
		}

		if (useXHTML != null) {
			importer.setUseXHTML(useXHTML);
		}

		for (PackageBase mifPkg : mifElements) {
			importer.processMIF(mifPkg);

			if (monitor.isCanceled()) {
				return;
			}
		}
		monitor.worked(3);

		/* Save */
		monitor.setTaskName("Saving model");
		try {
			Map<String, String> options = new HashMap<String, String>();
			options.put(XMLResource.OPTION_ENCODING, xmlEncoding);
			umlModel.eResource().save(options);
			umlModel.eResource().setModified(false);
			logInfo("Saving model: " + umlModel.eResource().getURI().lastSegment());

			// other models may be modified, e.g. adding Generalization from CMET to choice group
			List allResources = umlModel.eResource().getResourceSet().getResources();
			for (Iterator iterator = allResources.iterator(); iterator.hasNext();) {
				Resource resource = (Resource) iterator.next();
				// TODO This works for .emx models, but NOT for .uml resources (e.g. running outside of RSM)
				if (resource.isModified()) {
					logInfo("Saving model: " + resource.getURI().lastSegment());
					resource.save(options);
					resource.setModified(false);
				}
			}

		} catch (IOException e) {
			throw new BuildException(e);
		}

		logDiagnostics(importer.getDiagnostics());

		String vocabularyErrors = importer.getVocabularyErrors();
		if (vocabularyErrors.length() > 0) {
			URI errorsURI = umlModel.eResource().getURI().trimFileExtension();
			String fileName = errorsURI.lastSegment();
			errorsURI = errorsURI.trimSegments(1);
			errorsURI = errorsURI.appendSegment(fileName + "_vocabErrors");
			errorsURI = errorsURI.appendFileExtension("txt");

			File errorsFile = new File(errorsURI.toFileString());
			try {
				FileWriter writer = new FileWriter(errorsFile);
				writer.write(vocabularyErrors);
				writer.close();

			} catch (IOException e) {
				logError(e.getMessage());
			}
		}
	}

	// ANT task attributes -----------------------------------------------------

	public void setCreateAssociationClasses(boolean create) {
		createAssociationClasses = new Boolean(create);
	}

	public void setCreateStructuralAttributes(boolean create) {
		createStructuralAttributes = new Boolean(create);
	}

	public void setCreateFilePerPackage(boolean create) {
		createFilePerPackage = new Boolean(create);
	}

	public void setUsePackageTitle(boolean useTitle) {
		usePackageTitle = new Boolean(useTitle);
	}

	public void setSuppressDatatypeCollections(boolean suppress) {
		suppressDatatypeCollections = new Boolean(suppress);
	}

	public void setUseXHTML(boolean useXHTML) {
		this.useXHTML = new Boolean(useXHTML);
	}

	// ANT task child elements
	// --------------------------------------------------

	public void addFileset(FileSet fileset) {
		filesets.add(fileset);
	}

	// File and directory utilities
	// --------------------------------------------------

	protected PackageBase loadMIFFile(ResourceSet resourceSet, URI modelURI) {
		Resource resource = null;
		PackageBase mifModel = null;

		// don't abandon processing if parse error in MIF file
		try {
			resource = resourceSet.getResource(modelURI, true);

			List errors = resource.getErrors();
			for (Iterator iter = errors.iterator(); iter.hasNext();) {
				Object error = iter.next();
				if (error instanceof Diagnostic) {
					logDiagnostics((Diagnostic) error);
				} else if (error instanceof Exception) {
					logError(error.toString());
				}
			}
		} catch (Exception emfException) {
			resource = resourceSet.getResource(modelURI, false);

			logError(emfException.toString());
		}
		if (resource != null) {
			TreeIterator iterator = EcoreUtil.getAllContents(resource, false);
			while (iterator.hasNext()) {
				Object next = iterator.next();
				if (next instanceof PackageBase) {
					mifModel = (PackageBase) next;
					break;
				}
			}
		}

		return mifModel;
	}

}
