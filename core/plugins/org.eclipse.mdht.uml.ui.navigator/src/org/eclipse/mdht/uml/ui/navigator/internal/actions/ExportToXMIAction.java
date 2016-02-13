/*******************************************************************************
 * Copyright (c) 2011 Kenn Hussey.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Kenn Hussey - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.navigator.internal.actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.ui.navigator.internal.l10n.Messages;
import org.eclipse.mdht.uml.ui.navigator.internal.plugin.Logger;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.ActionDelegate;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;

public class ExportToXMIAction extends ActionDelegate implements IObjectActionDelegate {

	protected IWorkbenchPart activePart = null;

	protected List<URI> resourceURIs = new ArrayList<URI>();

	@Override
	public void dispose() {
		resourceURIs = null;

		super.dispose();
	}

	@Override
	public void run(IAction action) {
		DirectoryDialog dialog = new DirectoryDialog(activePart.getSite().getShell(), SWT.NONE);
		dialog.setMessage(Messages.ExportToXMIAction_dialogMessage);
		dialog.setText(Messages.ExportToXMIAction_dialogTitle);
		final String directoryPath = dialog.open();

		if (directoryPath != null) {

			try {
				ResourceSet resourceSet = new ResourceSetImpl();

				// register XMI content type and extended metadata

				Map<String, Object> contentTypeToFactoryMap = resourceSet.getResourceFactoryRegistry().getContentTypeToFactoryMap();

				contentTypeToFactoryMap.put(
					XMI2UMLResource.UML_CONTENT_TYPE_IDENTIFIER, XMI2UMLResource.Factory.INSTANCE);

				Map<URI, URI> uriMap = resourceSet.getURIConverter().getURIMap();

				uriMap.putAll(XMI2UMLExtendedMetaData.getURIMap());

				// load all related resources

				for (URI resourceURI : resourceURIs) {
					resourceSet.getResource(resourceURI, true);
				}

				EcoreUtil.resolveAll(resourceSet);

				// uncontrol objects in controlled resources

				EList<Resource> resources = resourceSet.getResources();

				for (Resource resource : resources) {
					EList<EObject> resourceContents = resource.getContents();

					for (Resource controlledResource : UMLUtil.getControlledResources(resource)) {

						for (ListIterator<EObject> contentsIterator = controlledResource.getContents().listIterator(); contentsIterator.hasNext();) {
							EObject next = contentsIterator.next();

							contentsIterator.remove();

							if (next.eContainer() == null) {
								resourceContents.add(next);
							}
						}
					}
				}

				// discard empty resources

				for (ListIterator<Resource> resourcesIterator = resources.listIterator(); resourcesIterator.hasNext();) {

					if (resourcesIterator.next().getContents().isEmpty()) {
						resourcesIterator.remove();
					}
				}

				EList<Resource> exportedResources = new UniqueEList<Resource>();

				// copy contents to new XMI resources

				URI destinationURI = URI.createFileURI(directoryPath);

				for (int i = 0; i < resources.size(); i++) {
					Resource resource = resources.get(i);

					if (shouldExport(resource)) {
						exportedResources.add(exportResource(resourceSet, resource, destinationURI));
					}
				}

				// save new XMI resources

				for (Resource resource : exportedResources) {
					resource.save(null);
				}
			} catch (Exception e) {
				String message = NLS.bind(
					Messages.ExportToXMIAction_errorMessage, new String[] { e.getLocalizedMessage() });
				Logger.logException(message, e);
				MessageDialog.openError(
					Display.getDefault().getActiveShell(), Messages.ExportToXMIAction_errorTitle, message);
			}
		}
	}

	protected boolean shouldExport(Resource resource) {
		URI resourceURI = resource.getURI();

		return UMLResource.FILE_EXTENSION.equals(resourceURI.fileExtension()) &&
				!URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI).equals(resourceURI) &&
				!URI.createURI(UMLResource.UML_METAMODEL_URI).equals(resourceURI) &&
				!URI.createURI(UMLResource.ECORE_PROFILE_URI).equals(resourceURI);
	}

	protected Resource exportResource(ResourceSet resourceSet, Resource resource, URI destinationURI) {
		URI xmiURI = destinationURI.appendSegment(
			resource.getURI().lastSegment()).trimFileExtension().appendFileExtension(XMI2UMLResource.FILE_EXTENSION);
		Resource xmiResource = resourceSet.createResource(xmiURI, XMI2UMLResource.UML_CONTENT_TYPE_IDENTIFIER);
		EList<EObject> xmiContents = xmiResource.getContents();

		for (Iterator<EObject> contents = resource.getContents().iterator(); contents.hasNext();) {

			EObject next = contents.next();
			contents.remove();
			xmiContents.add(next);
		}

		EList<Resource> resources = resourceSet.getResources();
		int index = resources.indexOf(resource);

		resources.remove(index);
		resources.move(index, xmiResource);

		return xmiResource;
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		resourceURIs.clear();

		if (selection instanceof IStructuredSelection) {

			for (Object element : ((IStructuredSelection) selection).toList()) {

				try {
					resourceURIs.add(URI.createPlatformResourceURI(((IFile) element).getFullPath().toString(), true));
				} catch (Exception e) {
					// ignore
				}
			}
		}

		action.setEnabled(!resourceURIs.isEmpty());
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
	}

}
