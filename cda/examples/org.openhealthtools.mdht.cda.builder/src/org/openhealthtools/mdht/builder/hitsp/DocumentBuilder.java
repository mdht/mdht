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
package org.openhealthtools.mdht.builder.hitsp;

import org.openhealthtools.mdht.builder.cda.GenericSectionBuilder;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;

public class DocumentBuilder extends org.openhealthtools.mdht.builder.ccd.DocumentBuilder {

	public static class AllergiesReactionSectionBuilder extends GenericSectionBuilder<AllergiesReactionsSection> {

		@Override
		protected AllergiesReactionsSection createSection() {
			return HITSPFactory.eINSTANCE.createAllergiesReactionsSection().init();
		}

	}

	public static class ProblemListSectionBuilder extends GenericSectionBuilder<ProblemListSection> {

		@Override
		protected ProblemListSection createSection() {
			return HITSPFactory.eINSTANCE.createProblemListSection().init();
		}

	}

	public AllergiesReactionSectionBuilder getAllergiesReactionSectionBuilder() {
		return null;
	}

	public ProblemListSectionBuilder getProblemListSectionBuilder() {
		return null;
	}

	@Override
	protected void construct(ClinicalDocument clinicalDocument) {

		super.construct(clinicalDocument);
	}

	@Override
	public ClinicalDocument buildDocument() {

		PatientSummary clinicalDocument = HITSPFactory.eINSTANCE.createPatientSummary().init();

		appendSectionBuilder(getAllergiesReactionSectionBuilder());

		appendSectionBuilder(getProblemListSectionBuilder());

		construct(clinicalDocument);

		return clinicalDocument;

	}

}
