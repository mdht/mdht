/*******************************************************************************
 * Copyright (c) 2010 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Sean Muir (JKM Software) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.builder.cda;

import java.util.ArrayList;
import java.util.List;

import org.openhealthtools.mdht.uml.cda.Section;

public abstract class GenericSectionDirector<SectionComponent> extends SectionDirector {

	protected void construct(SectionComponent section) {
	}

	abstract protected SectionComponent createSection();

	@Override
	public List<Section> constructSections() {

		ArrayList<Section> sections = new ArrayList<Section>();

		SectionComponent section = createSection();

		super.construct((Section) section);

		construct(section);

		sections.add((Section) section);

		return sections;
	}

}