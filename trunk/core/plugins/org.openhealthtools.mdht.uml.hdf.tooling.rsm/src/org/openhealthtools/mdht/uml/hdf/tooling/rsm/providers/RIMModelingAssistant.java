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
package org.openhealthtools.mdht.uml.hdf.tooling.rsm.providers;

import com.ibm.xtools.uml.ui.internal.dialogs.selectelement.ISelectElementFilter;
import com.ibm.xtools.uml.ui.internal.dialogs.selectelement.SelectElementDialog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IMetamodelType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;

import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;

import org.eclipse.jface.viewers.IFilter;

import org.eclipse.jface.window.Window;

import org.openhealthtools.mdht.uml.hdf.tooling.rsm.types.RIMElementTypes;

/**
 * @generated
 */
public class RIMModelingAssistant extends ModelingAssistantProvider {

    /**
     * @generated
     */
    public List<IElementType> getRelTypesOnSource(IAdaptable source) {
        EObject eObject = (EObject)source.getAdapter(EObject.class);
        if (eObject != null) {
            List<IElementType> result = new ArrayList<IElementType>();
            for (int i = 0; i < RIMElementTypes.RELATIONSHIP_TYPES.length; ++i) {
                IElementType elementType = RIMElementTypes.RELATIONSHIP_TYPES[i];
                if (RIMElementTypes.matchesSource(elementType, eObject)) {
                    result.add(elementType);
                }
            }
            return result;
        }
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
        EObject sourceEObject = (EObject)source.getAdapter(EObject.class);
        EObject targetEObject = (EObject)target.getAdapter(EObject.class);
        if (sourceEObject != null && targetEObject != null) {
            List<IElementType> result = new ArrayList<IElementType>();
            for (int i = 0; i < RIMElementTypes.RELATIONSHIP_TYPES.length; ++i) {
                IElementType elementType = RIMElementTypes.RELATIONSHIP_TYPES[i];
                if (RIMElementTypes.matchesSource(elementType, sourceEObject) &&
                        RIMElementTypes.matchesTarget(elementType, targetEObject)) {
                    result.add(elementType);
                }
            }
            return result;
        }
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
        EObject eObject = (EObject)target.getAdapter(EObject.class);
        if (eObject != null) {
            List<IElementType> result = new ArrayList<IElementType>();
            for (int i = 0; i < RIMElementTypes.RELATIONSHIP_TYPES.length; ++i) {
                IElementType elementType = RIMElementTypes.RELATIONSHIP_TYPES[i];
                if (RIMElementTypes.matchesTarget(elementType, eObject)) {
                    result.add(elementType);
                }
            }
            return result;
        }
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
        EObject eObject = (EObject)target.getAdapter(EObject.class);
        if (eObject != null) {
            return removeAbstractTypes(RIMElementTypes.getSources(relationshipType), eObject);
        }
        return Collections.emptyList();
    }

    /**
     * @generated
     */
    public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
        EObject eObject = (EObject)source.getAdapter(EObject.class);
        if (eObject != null) {
            return removeAbstractTypes(RIMElementTypes.getTargets(relationshipType), eObject);
        }
        return Collections.emptyList();
    }
    
    /**
     * @generated
     */
    private List<IElementType> removeAbstractTypes(IElementType[] elementTypes, EObject eObject) {
        if (elementTypes == null || elementTypes.length == 0) {
            return Collections.emptyList();
        }
        List<IElementType> result = new ArrayList<IElementType>();
        for (int i = 0; i < elementTypes.length; ++i) {
            if (elementTypes[i].getEClass() == null || !elementTypes[i].getEClass().isAbstract()) {
                result.add(elementTypes[i]);
            }
        }
        return result;
    }

    /**
     * @generated
     */
    public EObject selectExistingElementForSource(IAdaptable target,
            IElementType relationshipType) {
        EObject eObject = (EObject)target.getAdapter(EObject.class);
        if (eObject != null) {
            List<IElementType> sourceTypes = Arrays.asList(RIMElementTypes.getSources(relationshipType));
            if (!sourceTypes.isEmpty()) {
                return openSelectElementDialog(target, sourceTypes);
            }
        }
        return null;
    }

    /**
     * @generated
     */
    public EObject selectExistingElementForTarget(IAdaptable source,
            IElementType relationshipType) {
        EObject eObject = (EObject)source.getAdapter(EObject.class);
        if (eObject != null) {
            List<IElementType> targetTypes = Arrays.asList(RIMElementTypes.getTargets(relationshipType));
            if (!targetTypes.isEmpty()) {
                return openSelectElementDialog(source, targetTypes);
            }
        }
        return null;
    }

    /**
     * @generated
     */
    private EObject openSelectElementDialog(IAdaptable context, final List<IElementType> elementTypes) {
        Object eObject = context.getAdapter(EObject.class);
        
        final IFilter filter = new IFilter() {

            public boolean select(Object toTest) {
                if (toTest instanceof EObject) {
                    EObject eObject = (EObject)toTest;
                    for (IElementType elementType : elementTypes) {
                        if (elementType instanceof IMetamodelType) {
                            if (elementType.getEClass().isSuperTypeOf(eObject.eClass())) {
                                return true;
                            }
                        } else if (elementType instanceof ISpecializationType) {
                            if (((ISpecializationType)elementType).getMatcher() == null) {
                                if (elementType.getEClass().isSuperTypeOf(eObject.eClass())) {
                                    return true;
                                }
                            } else if (((ISpecializationType)elementType).getMatcher().matches(eObject)) {
                                return true;
                            }
                        } 
                    }
                }
                return false;
            }
            
        };
        
        SelectElementDialog dialog = new SelectElementDialog((EObject) eObject, (ISelectElementFilter)filter) {
            protected boolean isValidSelection(List currentSelectedElements) {
                return filter.select(currentSelectedElements.get(0));
            }
        };

        if (dialog.open() != Window.OK) {
            // user canceled gesture
            return null;
        }
        
        return (EObject) dialog.getSelectedElements().get(0);
    }
}