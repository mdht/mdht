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
package org.openhealthtools.mdht.uml.cda.ui.providers;

import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.ui.parsers.PropertyParser;

/**
 * This class provides custom edit parsers for HL7 class diagrams.
 * It applies only to models with the HDF profile applied.
 */
public class CustomUMLParserProvider extends AbstractProvider 
implements IParserProvider {

	public CustomUMLParserProvider() {
		super();
	}

	public IParser getParser(IAdaptable hint) {
		IParser parser = null;
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			parser = getParser(vid);
		}
		if (parser == null) {
			View view = (View) hint.getAdapter(View.class);
			if (view != null) {
				parser = getParser(view.getType());
			}
		}
		return parser;
	}

	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (hint instanceof ParserHintAdapter) {
				// only allow Property elements in models with HDF profile applied
				//TODO check user preference setting
				EObject eObject = (EObject)hint.getAdapter(EObject.class);
				if (eObject instanceof Property) {
					Profile cdaProfile = CDAProfileUtil.getCDAProfile(eObject.eResource().getResourceSet());
					if (cdaProfile != null) {
						List<Profile> appliedProfiles = ((Property)eObject).getNearestPackage().getAllAppliedProfiles();
						if (appliedProfiles.contains(cdaProfile)) {
							return getParser(hint) != null;
						}
					}
				}
			}
		}
		return false;
	}

	protected IParser getCustomPropertyParser() {
		return new PropertyParser();
	}

	protected IParser getParser(String visualID) {
		if ("".equals(visualID)) {
			return getCustomPropertyParser();
		}

		return null;
	}
}