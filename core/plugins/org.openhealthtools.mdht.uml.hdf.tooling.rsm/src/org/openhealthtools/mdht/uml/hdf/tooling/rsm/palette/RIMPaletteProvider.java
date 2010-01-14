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
package org.openhealthtools.mdht.uml.hdf.tooling.rsm.palette;

import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;

import org.eclipse.gef.palette.PaletteRoot;

import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import org.eclipse.gmf.runtime.diagram.ui.services.palette.IPaletteProvider;

import org.eclipse.ui.IEditorPart;

/**
 * @generated
 */
public class RIMPaletteProvider
        extends AbstractProvider
        implements IPaletteProvider {
    
    /**
     * @generated
     */
    public boolean provides(IOperation operation) {
        //for palette providers, return false for no reason
        return false;
    }

    /**
     * @generated
     */
    public void contributeToPalette(IEditorPart editor, Object content,
            PaletteRoot root, Map predefinedEntries) {
            
        assert editor instanceof DiagramEditor;
        
        new RIMPaletteFactory((DiagramEditor)editor).fillPalette(root);
    }

    /**
     * @generated
     */
    public void setContributions(IConfigurationElement configElement) {
        //do nothing
    }

}