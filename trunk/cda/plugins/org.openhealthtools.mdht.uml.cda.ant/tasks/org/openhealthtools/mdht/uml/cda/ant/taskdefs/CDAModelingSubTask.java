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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;
import org.eclipse.ant.core.AntCorePlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.openhealthtools.mdht.uml.cda.ant.types.ModelElement;
import org.openhealthtools.mdht.uml.cda.transform.AbstractTransformer;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public abstract class CDAModelingSubTask extends Task {

	private CDAModelingTask hl7modelingTask = null;

	public CDAModelingSubTask(CDAModelingTask parentTask) {
		this.hl7modelingTask = parentTask;
	}

	public CDAModelingTask getHL7ModelingTask() {
		return hl7modelingTask;
	}

	@Override
	public final void execute() throws BuildException {
		checkAttributes();

		try {
			doExecute();
		} catch (Exception e) {
			if (e instanceof BuildException) {
				throw (BuildException) e;
			} else {
				throw new BuildException(e);
			}
		}
	}

	/**
	 * All the attribute checks should be performed in this method.
	 * 
	 * @throws BuildException
	 */
	protected void checkAttributes() throws BuildException {
		// subclasses may override
	}

	/**
	 * Performs the task specific code.
	 * 
	 * @throws Exception
	 */
	abstract protected void doExecute() throws Exception;

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

	protected void logDiagnostics(Diagnostic diagnostics) {
		for (Iterator<Diagnostic> children = diagnostics.getChildren().iterator(); children.hasNext();) {
			Diagnostic diagnostic = children.next();
			StringBuffer message = new StringBuffer(diagnostic.getMessage());
			for (Iterator<?> diagData = diagnostic.getData().iterator(); diagData.hasNext();) {
				Object data = diagData.next();
				if (NamedElement.class.isInstance(data)) {
					String qname = getPackageQualifiedName((NamedElement) data);
					if (qname == null) {
						qname = EcoreUtil.getURI((NamedElement) data).toString();
					}
					message.append(" '");
					message.append(qname);
					message.append("'");
				}
			}
			switch (diagnostic.getSeverity()) {
				case Diagnostic.ERROR:
					logError(message.toString());
					break;
				case Diagnostic.WARNING:
					logWarning(message.toString());
					break;
				default:
					logInfo(message.toString());
			}
		}

	}

	protected String getPackageQualifiedName(NamedElement namedElement) {
		if (namedElement.getName() == null) {
			return null;
		}

		StringBuffer qname = new StringBuffer(namedElement.getName());
		Element container = namedElement.getOwner();
		while (container instanceof NamedElement) {
			qname.insert(0, NamedElement.SEPARATOR);
			qname.insert(0, ((NamedElement) container).getName());
			if (container instanceof Package) {
				break;
			}
			container = container.getOwner();
		}
		return qname.toString();
	}

	protected Map<String, String> resolveAndLoadFragments(Resource umlResource) {
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

		return parsedProperties;
	}

	protected void processModelElements(AbstractTransformer transformer) {
		// process modelElement types first
		for (ModelElement modelElement : getHL7ModelingTask().getModelElements()) {
			String qname = modelElement.getQname();
			Collection<NamedElement> umlElements = org.eclipse.uml2.uml.util.UMLUtil.findNamedElements(
				getHL7ModelingTask().getResourceSet(), qname);

			// do not include packageImport elements
			Collection<NamedElement> exactMatches = new ArrayList<NamedElement>();
			for (NamedElement namedElement : umlElements) {
				if (qname.equals(namedElement.getQualifiedName())) {
					exactMatches.add(namedElement);
				}
			}

			if (exactMatches.size() > 1) {
				logWarning("Found " + exactMatches.size() + " matches for: '" + qname + "'");
			}

			if (exactMatches.isEmpty()) {
				logError("Model element not found: '" + modelElement.getQname() + "'");
			} else {
				for (NamedElement namedElement : exactMatches) {
					logInfo("Model element processed: '" + namedElement.getQualifiedName() + "'");
					transformer.transformModelElement(namedElement);
				}
			}
		}

		// process all model packages
		List<Package> umlModels = getHL7ModelingTask().getRootPackages();
		for (Package umlModel : umlModels) {
			transformer.transformModelElement(umlModel);
		}

		transformer.saveResources();
	}

	/**
	 * Throws a <tt>BuildException</tt> if <tt>expression</tt> is false.
	 * 
	 * @param message
	 * @param expression
	 * @throws BuildException
	 */
	protected void assertTrue(String message, boolean expression) throws BuildException {
		if (!expression) {
			throw new BuildException(message);
		}
	}

	protected IProgressMonitor getProgressMonitor() {
		try {
			if (hl7modelingTask.getProject() != null) {
				IProgressMonitor progressMonitor = (IProgressMonitor) hl7modelingTask.getProject().getReferences().get(
					AntCorePlugin.ECLIPSE_PROGRESS_MONITOR);
				if (progressMonitor != null) {
					return progressMonitor;
				}
			}
		} catch (Exception e) {
			// Ignore
		}
		return new NullProgressMonitor();
	}

}
