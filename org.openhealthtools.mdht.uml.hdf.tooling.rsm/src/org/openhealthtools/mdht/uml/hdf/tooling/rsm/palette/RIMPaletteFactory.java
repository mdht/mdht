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

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.gef.Tool;

import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

import org.eclipse.gmf.runtime.diagram.ui.tools.CreationTool;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.jface.resource.ImageDescriptor;

import org.openhealthtools.mdht.uml.hdf.tooling.rsm.l10n.RIMMessages;
import org.openhealthtools.mdht.uml.hdf.tooling.rsm.types.RIMElementTypes;
import org.openhealthtools.mdht.uml.hdf.tooling.rsm.utils.RIMUtil;

/**
 * @generated
 */
public class RIMPaletteFactory {

	/**
	 * @generated
	 */
	private ResourceSet resourceSet;

	/**
	 * @generated
	 */
	public RIMPaletteFactory(DiagramEditor editor) {
		this.resourceSet = editor.getEditingDomain().getResourceSet();
	}

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createRIMDrawer());
	}

	/**
	 * Modified to change order of items in palette.
	 * 
	 * @generated NOT
	 */
	private PaletteDrawer createRIMDrawer() {
		PaletteDrawer paletteDrawer = new PaletteDrawer(RIMMessages.PaletteDrawer_RIM_name);
		paletteDrawer.setId("RIM"); //$NON-NLS-1$
		paletteDrawer.setDescription(RIMMessages.PaletteDrawer_RIM_description);
		paletteDrawer.setInitialState(PaletteDrawer.INITIAL_STATE_CLOSED);
		paletteDrawer.add(create_Act__ClassCreationTool());
		paletteDrawer.add(create_Entity__ClassCreationTool());
		paletteDrawer.add(create_Role__ClassCreationTool());
		paletteDrawer.add(create_ActRelationship__ClassCreationTool());
		paletteDrawer.add(create_Participation__ClassCreationTool());
		paletteDrawer.add(create_RoleLink__ClassCreationTool());
		return paletteDrawer;
	}

	/**
	 * @generated
	 */
	private ToolEntry create_ActRelationship__ClassCreationTool() {
		ImageDescriptor smallImage = RIMUtil.getSmallImage(RIMElementTypes._ACTRELATIONSHIP__CLASS, resourceSet);
		ImageDescriptor largeImage = RIMUtil.getLargeImage(RIMElementTypes._ACTRELATIONSHIP__CLASS, resourceSet);

		return new NodeToolEntry(
			"RIM._ActRelationship__Class", //$NON-NLS-1$
			RIMMessages.PaletteTool__ActRelationship__Class_name,
			RIMMessages.PaletteTool__ActRelationship__Class_description, smallImage, largeImage,
			RIMElementTypes._ACTRELATIONSHIP__CLASS);
	}

	/**
	 * @generated
	 */
	private ToolEntry create_Act__ClassCreationTool() {
		ImageDescriptor smallImage = RIMUtil.getSmallImage(RIMElementTypes._ACT__CLASS, resourceSet);
		ImageDescriptor largeImage = RIMUtil.getLargeImage(RIMElementTypes._ACT__CLASS, resourceSet);

		return new NodeToolEntry(
			"RIM._Act__Class", //$NON-NLS-1$
			RIMMessages.PaletteTool__Act__Class_name, RIMMessages.PaletteTool__Act__Class_description, smallImage,
			largeImage, RIMElementTypes._ACT__CLASS);
	}

	/**
	 * @generated
	 */
	private ToolEntry create_RoleLink__ClassCreationTool() {
		ImageDescriptor smallImage = RIMUtil.getSmallImage(RIMElementTypes._ROLELINK__CLASS, resourceSet);
		ImageDescriptor largeImage = RIMUtil.getLargeImage(RIMElementTypes._ROLELINK__CLASS, resourceSet);

		return new NodeToolEntry(
			"RIM._RoleLink__Class", //$NON-NLS-1$
			RIMMessages.PaletteTool__RoleLink__Class_name, RIMMessages.PaletteTool__RoleLink__Class_description,
			smallImage, largeImage, RIMElementTypes._ROLELINK__CLASS);
	}

	/**
	 * @generated
	 */
	private ToolEntry create_Participation__ClassCreationTool() {
		ImageDescriptor smallImage = RIMUtil.getSmallImage(RIMElementTypes._PARTICIPATION__CLASS, resourceSet);
		ImageDescriptor largeImage = RIMUtil.getLargeImage(RIMElementTypes._PARTICIPATION__CLASS, resourceSet);

		return new NodeToolEntry(
			"RIM._Participation__Class", //$NON-NLS-1$
			RIMMessages.PaletteTool__Participation__Class_name,
			RIMMessages.PaletteTool__Participation__Class_description, smallImage, largeImage,
			RIMElementTypes._PARTICIPATION__CLASS);
	}

	/**
	 * @generated
	 */
	private ToolEntry create_Role__ClassCreationTool() {
		ImageDescriptor smallImage = RIMUtil.getSmallImage(RIMElementTypes._ROLE__CLASS, resourceSet);
		ImageDescriptor largeImage = RIMUtil.getLargeImage(RIMElementTypes._ROLE__CLASS, resourceSet);

		return new NodeToolEntry(
			"RIM._Role__Class", //$NON-NLS-1$
			RIMMessages.PaletteTool__Role__Class_name, RIMMessages.PaletteTool__Role__Class_description, smallImage,
			largeImage, RIMElementTypes._ROLE__CLASS);
	}

	/**
	 * @generated
	 */
	private ToolEntry create_Entity__ClassCreationTool() {
		ImageDescriptor smallImage = RIMUtil.getSmallImage(RIMElementTypes._ENTITY__CLASS, resourceSet);
		ImageDescriptor largeImage = RIMUtil.getLargeImage(RIMElementTypes._ENTITY__CLASS, resourceSet);

		return new NodeToolEntry(
			"RIM._Entity__Class", //$NON-NLS-1$
			RIMMessages.PaletteTool__Entity__Class_name, RIMMessages.PaletteTool__Entity__Class_description,
			smallImage, largeImage, RIMElementTypes._ENTITY__CLASS);
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		private NodeToolEntry(String id, String title, String description, ImageDescriptor smallIcon,
				ImageDescriptor largeIcon, IElementType elementType) {
			super(title, description, smallIcon, largeIcon);
			setId(id);
			this.elementType = elementType;
		}

		/**
		 * @generated
		 */
		@Override
		public Tool createTool() {
			Tool tool = new CreationTool(elementType);
			return tool;
		}

	}
}
