/*******************************************************************************
2 	* Copyright (c) 2010 Sean Muir.
3 	* All rights reserved. This program and the accompanying materials
4 	* are made available under the terms of the Eclipse Public License v1.0
5 	* which accompanies this distribution, and is available at
6 	* http://www.eclipse.org/legal/epl-v10.html
7 	*
8 	* Contributors:
9 	* Sean Muir (JKM Software) - initial API and implementation
10 	*
11 	* $Id$
12 	*******************************************************************************/
package org.openhealthtools.mdht.builder.cda;

import java.util.ArrayList;

import org.openhealthtools.mdht.uml.cda.Section;

public abstract class GenericSectionBuilder<SectionComponent> extends SectionBuilder {

	protected void construct(SectionComponent section) {
	}

	abstract protected SectionComponent createSection();

	@Override
	public ArrayList<Section> constructSections() {

		ArrayList<Section> sections = new ArrayList<Section>();

		SectionComponent section = createSection();

		super.construct((Section) section);

		construct(section);

		sections.add((Section) section);

		return sections;
	}

}