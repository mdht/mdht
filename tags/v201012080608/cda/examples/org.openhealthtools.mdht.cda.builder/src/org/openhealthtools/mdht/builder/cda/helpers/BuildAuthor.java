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
package org.openhealthtools.mdht.builder.cda.helpers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.openhealthtools.mdht.builder.cda.ArrayBuilder;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;

public class BuildAuthor extends ArrayBuilder<Author> {

	String text;

	String givenName;

	String familyName;

	String suffix;

	String idRoot;

	String idExtension;

	Calendar effectiveTime = Calendar.getInstance();;

	public BuildAuthor(String text) {
		super();
		this.text = text;
	}

	public BuildAuthor(String givenName, String familyName, String suffix) {
		super();
		this.givenName = givenName;
		this.familyName = familyName;
		this.suffix = suffix;
	}

	public BuildAuthor(String givenName, String familyName, String suffix, String idRoot) {
		super();
		this.givenName = givenName;
		this.familyName = familyName;
		this.suffix = suffix;
		this.idRoot = idRoot;
	}

	public BuildAuthor(String givenName, String familyName, String suffix, String idRoot, String idExtension) {
		super();
		this.givenName = givenName;
		this.familyName = familyName;
		this.suffix = suffix;
		this.idRoot = idRoot;
		this.idExtension = idExtension;
	}

	public BuildAuthor(String givenName, String familyName, String suffix, String idRoot, String idExtension, Calendar effectiveTime) {
		super();
		this.givenName = givenName;
		this.familyName = familyName;
		this.suffix = suffix;
		this.idRoot = idRoot;
		this.idExtension = idExtension;
		this.effectiveTime = effectiveTime;
	}

	@Override
	public List<Author> construct() {
		ArrayList<Author> authors = new ArrayList<Author>();

		Author author = CDAFactory.eINSTANCE.createAuthor();

		author.setTime(new BuilderUtil.BuildEffectiveTime().construct());

		AssignedAuthor assignedAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();

		assignedAuthor.getIds().add(DatatypesFactory.eINSTANCE.createII(idRoot, idExtension));

		author.setAssignedAuthor(assignedAuthor);

		Person assignedPerson = CDAFactory.eINSTANCE.createPerson();

		assignedAuthor.setAssignedPerson(assignedPerson);

		PN name = DatatypesFactory.eINSTANCE.createPN();

		if (text != null) {
			name.addText(text);
		} else {

			name.addGiven(givenName).addFamily(familyName).addSuffix(suffix);
		}

		assignedPerson.getNames().add(name);

		authors.add(author);

		return authors;
	}

}
