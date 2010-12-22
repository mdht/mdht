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
 package org.openhealthtools.mdht.uml.hdf.tooling.rsm.edithelpers;

import com.ibm.xtools.uml.type.EditRequestParameters;
import com.ibm.xtools.uml.type.IStereotypedElementType;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;

import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRequest;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

import org.openhealthtools.mdht.uml.hdf.tooling.rsm.types.RIMElementTypes;

/**
 * @generated
 */
public class ActRelationshipClassEditHelperAdvice extends
        RIMBaseEditHelperAdvice {
    
    /**
     * @generated
     */
    protected ICommand getBeforeConfigureCommand(final ConfigureRequest request) {
        final String stereotypeName = (String) request
            .getParameter(EditRequestParameters.APPLIED_STEREOTYPE_PARAM_NAME);
        if (stereotypeName != null) {
            final EObject eObject = request.getElementToConfigure();
            if (eObject instanceof Element && 
                    ((Element)eObject).getAppliedStereotype(stereotypeName) != null) {
                request.setParameter(
                    EditRequestParameters.APPLIED_STEREOTYPE_PARAM_NAME, null);
            }
        }
        return super.getBeforeConfigureCommand(request);
    }
    
    /**
     * @generated
     */
    protected ICommand getAfterConfigureCommand(final ConfigureRequest request) {
        final String stereotypeName = (String) request
            .getParameter(EditRequestParameters.APPLIED_STEREOTYPE_PARAM_NAME);
        if (stereotypeName != null) {
            final EObject eObject = request.getElementToConfigure();
            if (eObject instanceof Element && 
                    ((Element)eObject).getAppliedStereotype(stereotypeName) != null) {
                request.setParameter(
                    EditRequestParameters.APPLIED_STEREOTYPE_PARAM_NAME, null);
            }
        }
        return super.getAfterConfigureCommand(request);
    }


    /**
     * @generated
     */
    protected String getLocalizedName(EObject eObject) {
        Element element = (Element)eObject;
        Stereotype stereotype = element.getAppliedStereotype(RIMElementTypes._ACTRELATIONSHIP__CLASS.getStereotypeName());
        EObject stereotypeApp = element.getStereotypeApplication(stereotype);
        return super.getLocalizedName(stereotypeApp) + super.getLocalizedName(eObject);
    }
    
    /**
     * @generated
     */
    protected ICommand getBeforeReorientReferenceRelationshipCommand(
    		final ReorientReferenceRelationshipRequest request) {
    	final String sourceFeatureName = (String)request.getParameter("SOURCE_FEATURE");
    	final IElementType elementType = (IElementType)request.getParameter("ELEMENT_TYPE");
    	
    	if (request.getNewRelationshipEnd() != null && request.getOldRelationshipEnd() != null && request.getReferenceOwner() != null && sourceFeatureName != null && elementType != null) {
    		if (ReorientRequest.REORIENT_TARGET == request.getDirection()) {
    			 if (!RIMElementTypes.matchesTarget(elementType, request.getNewRelationshipEnd()) || relationshipAlreadyExists(request, sourceFeatureName, elementType)) {
                     return UnexecutableCommand.INSTANCE;
                 } else {
                	 return getReorientCommand(request, sourceFeatureName, elementType);
                 }
    		} else {
    			if (!RIMElementTypes.matchesSource(elementType, request.getNewRelationshipEnd()) || relationshipAlreadyExists(request, sourceFeatureName, elementType)) {
                    return UnexecutableCommand.INSTANCE;
                } else {
                	return getReorientCommand(request, sourceFeatureName, elementType);
                }
    		} 
        }

    	return super.getBeforeReorientReferenceRelationshipCommand(request);
    }
    
	/**
     * @generated
     */
	protected ICommand getBeforeDestroyReferenceCommand(
			final DestroyReferenceRequest request) {
    	ICommand superCommand = super.getBeforeDestroyReferenceCommand(request);
    	CompositeCommand result = new CompositeCommand(request.getLabel());
    	if (superCommand != null) {
    		result.add(superCommand);
    	}
    	
       	final IElementType elementType = (IElementType)request.getParameter("ELEMENT_TYPE");
    	final String sourceFeatureName = (String)request.getParameter("SOURCE_FEATURE");
    	
    	if (elementType != null && sourceFeatureName != null) {
    		result.add(new AbstractTransactionalCommand(request.getEditingDomain(),
                    request.getLabel(), Collections.EMPTY_LIST) {
    			
                /**
                 * @generated
                 */
                protected CommandResult doExecuteWithResult(
                        IProgressMonitor monitor, IAdaptable info)
                        throws ExecutionException {
                	Element source = (Element)request.getContainer();
                	Element target = (Element)request.getReferencedObject();
    
                	EObject sourceApplication = null;
                	EObject targetApplication = null;
                	
                	IElementType[] sourceTypes = RIMElementTypes.getSources(elementType);
                   	for (IElementType sourceType : sourceTypes) {
                   		if (sourceType instanceof IStereotypedElementType) {
                   			IStereotypedElementType sSourceType = (IStereotypedElementType)sourceType;
                   		
                   			if (sourceApplication == null) {
                   				sourceApplication = source.getStereotypeApplication(source.getApplicableStereotype(sSourceType.getStereotypeName()));
                   			}
                   		}
                   	}
                   	
                   	IElementType[] targetTypes = RIMElementTypes.getTargets(elementType);	
                   	for (IElementType targetType : targetTypes) {
                   		if (targetType instanceof IStereotypedElementType) {
                   			IStereotypedElementType sTargetType = (IStereotypedElementType)targetType;
                   			
                   			if (targetApplication == null) {
                   				targetApplication = target.getStereotypeApplication(target.getApplicableStereotype(sTargetType.getStereotypeName()));
                   			}	
                   		} else {
                   			targetApplication = target;
                   			break;
                   		}
                   	}
                	
                    EStructuralFeature sourceFeature = sourceApplication.eClass().getEStructuralFeature(sourceFeatureName);
                   	if (sourceFeature.isMany()) {
                   		((EList)sourceApplication.eGet(sourceFeature)).remove(targetApplication); //$NON-NLS-1$
                   	} else {
                   		sourceApplication.eUnset(sourceFeature);
                   	}
                    return CommandResult.newOKCommandResult();
                }
                
            });
    	}
		
		return result;
	}
    
}
