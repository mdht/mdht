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
package org.openhealthtools.mdht.uml.hdf.tooling.rsm.types;

import com.ibm.xtools.uml.type.IStereotypedElementType;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.emf.type.core.AbstractElementTypeEnumerator;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IMetamodelType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;

/**
 * @generated
 */
public class RIMElementTypes extends AbstractElementTypeEnumerator {

    /**
     * @generated
     */
    public static final IStereotypedElementType _ACT__CLASS = (IStereotypedElementType)getElementType("org.openhealthtools.mdht.uml.hdf.tooling.rsm.ActClass"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IStereotypedElementType _ENTITY__CLASS = (IStereotypedElementType)getElementType("org.openhealthtools.mdht.uml.hdf.tooling.rsm.EntityClass"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IStereotypedElementType _ROLE__CLASS = (IStereotypedElementType)getElementType("org.openhealthtools.mdht.uml.hdf.tooling.rsm.RoleClass"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IStereotypedElementType _ROLELINK__CLASS = (IStereotypedElementType)getElementType("org.openhealthtools.mdht.uml.hdf.tooling.rsm.RoleLinkClass"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IStereotypedElementType _ACTRELATIONSHIP__CLASS = (IStereotypedElementType)getElementType("org.openhealthtools.mdht.uml.hdf.tooling.rsm.ActRelationshipClass"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IStereotypedElementType _PARTICIPATION__CLASS = (IStereotypedElementType)getElementType("org.openhealthtools.mdht.uml.hdf.tooling.rsm.ParticipationClass"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IStereotypedElementType _LANGUAGECOMMUNICATION__CLASS = (IStereotypedElementType)getElementType("org.openhealthtools.mdht.uml.hdf.tooling.rsm.LanguageCommunication"); //$NON-NLS-1$

    /**
     * @generated
     */
    public static final IElementType[] NODE_TYPES = {
            _ACT__CLASS,
            _ENTITY__CLASS,
            _ROLE__CLASS,
            _ROLELINK__CLASS,
            _ACTRELATIONSHIP__CLASS,
            _PARTICIPATION__CLASS,
            _LANGUAGECOMMUNICATION__CLASS
        };

    /**
     * @generated
     */
    public static final IElementType[] RELATIONSHIP_TYPES = {
            
        };
    
    /**
     * @generated
     */
    private static Map<IElementType, IElementType[]> sources = new HashMap<IElementType, IElementType[]>();
    
    /**
     * @generated
     */
    static {
        };
    
    /**
     * @generated
     */
    private static Map<IElementType, IElementType[]> targets = new HashMap<IElementType, IElementType[]>();
    
    /**
     * @generated
     */
    static {
        };
    
    /**
     * @generated
     */
    public static final IElementType[] getSources(IElementType elementType) {
        return sources.get(elementType);
    }
    
    /**
     * @generated
     */
    public static final IElementType[] getTargets(IElementType elementType) {
        return targets.get(elementType);
    }
    
    /**
     * @generated
     */
    public static IElementType getMatchingSource(IElementType elementType, EObject source) {
        return matches(getSources(elementType), source);
    }
    
    /**
     * @generated
     */
    public static IElementType getMatchingTarget(IElementType elementType, EObject target) {
        return matches(getTargets(elementType), target);
    }
    
    /**
     * @generated
     */
    public static boolean matchesSource(IElementType elementType, EObject source) {
        IElementType[] sourceTypes = getSources(elementType);
        if (sourceTypes != null && sourceTypes.length == 0) {
            return true;
        }
        return matches(sourceTypes, source) != null;
    }
    
    /**
     * @generated
     */
    public static boolean matchesTarget(IElementType elementType, EObject target) {
        IElementType[] targetTypes = getTargets(elementType);
        if (targetTypes != null && targetTypes.length == 0) {
            return true;
        }
        return matches(targetTypes, target) != null;
    }
    
    /**
     * @generated
     */
    private static IElementType matches(IElementType[] elementTypes, EObject eObject) {
        if (elementTypes == null) {
            return null;
        }
        for (int i = 0; i < elementTypes.length; ++i) {
            IElementType elementType = elementTypes[i];
            if (elementType instanceof ISpecializationType) {
                if (((ISpecializationType)elementType).getMatcher() != null &&
                        ((ISpecializationType)elementType).getMatcher().matches(eObject)) {
                    return elementType;
                }
            } 
        }
        for (int i = 0; i < elementTypes.length; ++i) {
            IElementType elementType = elementTypes[i];
            if (elementType instanceof ISpecializationType) {
                if (((ISpecializationType)elementType).getMatcher() == null &&
                        elementType.getEClass().isSuperTypeOf(eObject.eClass())) {
                    return elementType;
                }
            } else if (elementType instanceof IMetamodelType) {
                if (elementType.getEClass().isSuperTypeOf(eObject.eClass())) {
                    return elementType;
                }
            }
        }
        return null;
    }
}