/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.ui.navigator.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.IValidationListener;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.emf.validation.service.ValidationEvent;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.openhealthtools.mdht.uml.ui.navigator.UMLDomainNavigatorItem;
import org.openhealthtools.mdht.uml.ui.navigator.internal.plugin.Activator;


public class ProblemsDecorator implements ILabelDecorator {
	/** Resources whose markers are cached. */;
	private List cachedResources = new ArrayList();
	
	/** key=EObject, value=IMarker */
	private Map errorMarkers = new HashMap();
	private Map warningMarkers = new HashMap();

    /**
     * Refresh problem markers after validation.
     */
    private IValidationListener validationListener = new IValidationListener() {
		public void validationOccurred(final ValidationEvent event) {
			if (event.getClientContextIds().contains("org.openhealthtools.mdht.uml.ui.validation.refresh")
					&& event.getEvaluationMode() == EvaluationMode.BATCH) {
				cachedResources.clear();
				errorMarkers.clear();
				warningMarkers.clear();
				cacheMarkers(event.getValidationTargets());
			}
		}
    };
    
	public ProblemsDecorator() {
		ModelValidationService.getInstance().addValidationListener(validationListener);
	}

	public void dispose() {
		ModelValidationService.getInstance().removeValidationListener(validationListener);
	}
	
	protected void cacheMarkers(Collection targets) {
		for (Iterator iterator = targets.iterator(); iterator.hasNext();) {
			Object target = iterator.next();
			if (target instanceof EObject) {
				cacheMarkers((EObject)target);
			}
		}
	}

	private void cacheMarkers(EObject eObject) {
		URI resourceURI = eObject.eResource().getURI();
		if (!cachedResources.contains(resourceURI)) {
			cachedResources.add(resourceURI);
		}
		IMarker[] markers = getValidationMarkers(eObject);

		for (int i = 0; i < markers.length; i++) {
			try {
				EObject markerEObject = null;
				Object markerURIAttr = markers[i].getAttribute(EValidator.URI_ATTRIBUTE);
				if (markerURIAttr != null) {
					URI markerURI = URI.createURI(markerURIAttr.toString());
					markerEObject = eObject.eResource().getEObject(markerURI.fragment());
				}
				int markerSeverity = ((Integer)markers[i].getAttribute(IMarker.SEVERITY)).intValue();
				if (IMarker.SEVERITY_ERROR == markerSeverity) {
					EObject errorObject = markerEObject;
					while (errorObject != null) {
						errorMarkers.put(errorObject, markers[i]);
						errorObject = errorObject.eContainer();
					}
				}
				else if (IMarker.SEVERITY_WARNING == markerSeverity) {
					EObject warningObject = markerEObject;
					while (warningObject != null) {
						warningMarkers.put(warningObject, markers[i]);
						warningObject = warningObject.eContainer();
					}
				}
			} catch (CoreException e) {
				// ignore this marker
			}
		}
	}

	private IMarker[] getValidationMarkers(EObject eObject) {
		IFile file = WorkspaceSynchronizer.getFile(eObject.eResource());
		
		if (file != null) {
			try {
				//return file.findMarkers(MarkerUtil.VALIDATION_MARKER_TYPE, true, IResource.DEPTH_ZERO);
				return file.findMarkers(EValidator.MARKER, true, IResource.DEPTH_ZERO);
				
			} catch (CoreException e) {
				// ignore these markers
			}
		}
		return new IMarker[0];
	}
	
	public boolean hasError(EObject eObject) {
		URI resourceURI = eObject.eResource().getURI();
		if (!cachedResources.contains(resourceURI)) {
			cacheMarkers(eObject);
		}
		return errorMarkers.get(eObject) != null;
	}

	public boolean hasWarning(EObject eObject) {
		URI resourceURI = eObject.eResource().getURI();
		if (!cachedResources.contains(resourceURI)) {
			cacheMarkers(eObject);
		}
		return warningMarkers.get(eObject) != null;
	}
	
	public Image decorateImage(Image image, Object element) {
		EObject eObject = null;
		if (element instanceof EObject) {
			eObject = (EObject) element;
		}
		else if (element instanceof UMLDomainNavigatorItem) {
			eObject = ((UMLDomainNavigatorItem)element).getEObject();
		}
		if (eObject != null && eObject.eResource() != null) {
			if (hasError(eObject)) {
				return getErrorIcon(image);
			}
			else if (hasWarning(eObject)) {
				return getWarningIcon(image);
			}
		}
		
		return image;
	}

	private Image getErrorIcon(Image baseImage) {
		ImageDescriptor errorIcon = Activator.getBundledImageDescriptor("icons/ovr16/error_co.gif");
		ImageDescriptor decorated = new org.eclipse.jface.viewers.DecorationOverlayIcon(baseImage, errorIcon, IDecoration.BOTTOM_LEFT);

		return ExtendedImageRegistry.getInstance().getImage(decorated);
	}

	private Image getWarningIcon(Image baseImage) {
		ImageDescriptor errorIcon = Activator.getBundledImageDescriptor("icons/ovr16/warning_co.gif");
		ImageDescriptor decorated = new org.eclipse.jface.viewers.DecorationOverlayIcon(baseImage, errorIcon, IDecoration.BOTTOM_LEFT);

		return ExtendedImageRegistry.getInstance().getImage(decorated);
	}

	public String decorateText(String text, Object element) {
		return text;
	}

	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	public void addListener(ILabelProviderListener listener) {
	}

	public void removeListener(ILabelProviderListener listener) {
	}

}
