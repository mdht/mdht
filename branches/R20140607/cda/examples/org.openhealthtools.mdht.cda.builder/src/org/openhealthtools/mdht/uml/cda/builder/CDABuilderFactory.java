/*******************************************************************************
 * Copyright (c) 2010, 2011 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.builder;

import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.builder.impl.DocumentBuilderImpl;
import org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilderImpl;
import org.openhealthtools.mdht.uml.cda.builder.impl.SectionBuilderImpl;

public class CDABuilderFactory {

	public static class ClinicalDocumentBuilder extends DocumentBuilderImpl<ClinicalDocument> {

		@Override
		public ClinicalDocument buildDocument() {
			ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
			construct(clinicalDocument);
			return clinicalDocument;

		}

	}

	public static class SectionBuilder extends SectionBuilderImpl<Section> {

		@Override
		public Section buildSection() {
			Section section = CDAFactory.eINSTANCE.createSection();
			construct(section);
			return section;
		}

	}

	public static DocumentBuilder<ClinicalDocument> createClinicalDocumentBuilder() {
		return new ClinicalDocumentBuilder();
	}

	@SuppressWarnings("unchecked")
	public static org.openhealthtools.mdht.uml.cda.builder.SectionBuilder<Section> createSectionBuilder() {
		return new SectionBuilder();
	}

	public static PatientBuilder createPatientBuilder() {
		return new PatientBuilderImpl();
	}

}
