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
package org.openhealthtools.mdht.uml.hdf.tooling.rsm.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.command.Command;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.RollbackException;

import org.eclipse.gmf.runtime.emf.core.util.EObjectUtil;

import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * @generated
 */
public class RIMResourceSetListener
    extends ResourceSetListenerImpl {

	/**
	 * @generated
	 */
    public RIMResourceSetListener() {
        super(NotificationFilter.createNotifierTypeFilter(EObject.class));
    }

	/**
	 * @generated
	 */
    public boolean isPrecommitOnly() {
        return true;
    }

	/**
	 * @generated NOT
	 */
    public Command transactionAboutToCommit(ResourceSetChangeEvent event)
        throws RollbackException {

        for (Notification notification : event.getNotifications()) {
            if (notification.getNotifier() instanceof EObject && notification.getFeature() instanceof EReference) {
            	EObject stereotypeApplication = (EObject)notification.getNotifier();
            	Element baseElement = UMLUtil.getBaseElement(stereotypeApplication);
            	Stereotype stereotype = UMLUtil.getStereotype(stereotypeApplication);
            	EReference feature = (EReference)notification.getFeature();
            	
            	if (baseElement != null && stereotype != null && feature instanceof EReference) {
            		// the generated code causes bug when old value is a Collection (some Stereotype properties)
//            		EObject oldValue = (EObject)notification.getOldValue();
//            		if (oldValue != null) {
            		Object oldValue = notification.getOldValue();
            		if (oldValue instanceof EObject) {
            			Element oldTargetElement = (oldValue instanceof Element) ? (Element)oldValue : UMLUtil.getBaseElement((EObject)oldValue);
            			
            			Collection baseElementReferences = EObjectUtil.getReferencers(
            					baseElement, new EReference[] {NotationPackage.eINSTANCE.getView_Element()});
            			
            			Collection oldTargetElementReferencers = EObjectUtil.getReferencers(
            					oldTargetElement, new EReference[] {NotationPackage.eINSTANCE.getView_Element()});

            			Collection<Edge> edges = new HashSet<Edge>();
            			for (Object baseElementReferencer : baseElementReferences) {
            				if (baseElementReferencer instanceof Node) {
            					Node baseElementReferencerNode = (Node)baseElementReferencer;
            					List sourceEdges = baseElementReferencerNode.getSourceEdges();
            					if (!sourceEdges.isEmpty()) {
	            					for (Object oldTargetElementReferencer : oldTargetElementReferencers) {
	            						if (oldTargetElementReferencer instanceof Node) {
	            							Node oldTargetElementReferencerNode = (Node)oldTargetElementReferencer;
	            							for (Object edge : sourceEdges) {
	            								if (oldTargetElementReferencerNode.equals(((Edge)edge).getTarget())) {
	            									edges.add((Edge)edge);
	            								}
	            							}	
	            						}
	            					}
            					}
            				}
            			}
          					
     				
          				
            		}
            	}
            }
        }

        return null;
    }
}

