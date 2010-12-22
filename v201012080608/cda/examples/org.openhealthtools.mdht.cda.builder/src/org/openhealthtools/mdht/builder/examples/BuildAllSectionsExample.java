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
package org.openhealthtools.mdht.builder.examples;

import org.openhealthtools.mdht.builder.cda.SectionDirector;
import org.openhealthtools.mdht.builder.cda.helpers.BuilderUtil;
import org.openhealthtools.mdht.builder.hitsp.PatientSummaryBuilder;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

public class BuildAllSectionsExample {

	public static void main(String[] args) {

		PatientSummaryBuilder exampleClinicalDocumentBuilder = new PatientSummaryBuilder() {

			@Override
			public AllergiesReactionSectionDirector getAllergiesReactionSectionDirector() {
				return new AllergiesReactionSectionDirector() {

					@Override
					public ST buildSectionTitle() {
						return new BuilderUtil.BuildST("Allergies Reaction Section").construct();
					}

				};
			}

			@Override
			public ProblemListSectionDirector getProblemListSectionDirector() {

				return new ProblemListSectionDirector() {

					@Override
					public ST buildSectionTitle() {
						return new BuilderUtil.BuildST("Problem List Section").construct();
					}

				};
			}

			@Override
			public ProblemSectionDirector getProblemSectionDirector() {

				return new ProblemSectionDirector() {

					@Override
					public ST buildSectionTitle() {
						return new BuilderUtil.BuildST("Problem Section").construct();
					}

				};
			}

			@Override
			public FamilyHistorySectionDirector getFamilyHistorySectionDirector() {

				return new FamilyHistorySectionDirector() {

					@Override
					public ST buildSectionTitle() {
						return new BuilderUtil.BuildST("Family History Section").construct();
					}

				};
			}

			@Override
			public FunctionalStatusSectionDirector getFunctionalStatusSectionDirector() {

				return new FunctionalStatusSectionDirector() {

					@Override
					public ST buildSectionTitle() {
						return new BuilderUtil.BuildST("Functional Section").construct();
					}

				};
			}

			@Override
			public ImmunizationsSectionDirector getImmunizationsSectionDirector() {

				return new ImmunizationsSectionDirector() {

					@Override
					public ST buildSectionTitle() {
						return new BuilderUtil.BuildST("Immunizations Section").construct();
					}

				};
			}

			@Override
			public MedicalEquipmentSectionDirector getMedicalEquipmentSectionDirector() {

				return new MedicalEquipmentSectionDirector() {

					@Override
					public ST buildSectionTitle() {
						return new BuilderUtil.BuildST("Medical Equipment Section").construct();
					}

				};
			}

			@Override
			public MedicationsSectionDirector getMedicationsSectionDirector() {

				return new MedicationsSectionDirector() {

					@Override
					public ST buildSectionTitle() {
						return new BuilderUtil.BuildST("Medications Section").construct();
					}

				};
			}

			@Override
			public PayersSectionDirector getPayersSectionDirector() {

				return new PayersSectionDirector() {

					@Override
					public ST buildSectionTitle() {
						return new BuilderUtil.BuildST("Payers Section Section").construct();
					}

				};
			}

			@Override
			public PlanOfCareSectionDirector getPlanOfCareSectionDirector() {

				return new PlanOfCareSectionDirector() {

					@Override
					public ST buildSectionTitle() {
						return new BuilderUtil.BuildST("Plan Of Care Section").construct();
					}

				};
			}

			@Override
			public ProcedureSectionDirector getProcedureSectionDirector() {

				return new ProcedureSectionDirector() {

					@Override
					public ST buildSectionTitle() {
						return new BuilderUtil.BuildST("Procedure Section").construct();
					}

				};
			}

			@Override
			public PurposeSectionDirector getPurposeSectionDirector() {

				return new PurposeSectionDirector() {

					@Override
					public ST buildSectionTitle() {
						return new BuilderUtil.BuildST("Purpose Section").construct();
					}

				};
			}

			@Override
			public ResultsSectionDirector getResultsSectionDirector() {

				return new ResultsSectionDirector() {

					@Override
					public ST buildSectionTitle() {
						return new BuilderUtil.BuildST("Results Section").construct();
					}

				};
			}

			@Override
			public SocialHistorySectionDirector getSocialHistorySectionDirector() {

				return new SocialHistorySectionDirector() {

					@Override
					public ST buildSectionTitle() {
						return new BuilderUtil.BuildST("Social History Section").construct();
					}

				};
			}

			@Override
			public VitalSignsSectionDirector getVitalSignsSectionDirector() {

				return new VitalSignsSectionDirector() {

					@Override
					public ST buildSectionTitle() {
						return new BuilderUtil.BuildST("Vital Signs Section").construct();
					}

				};
			}

			@Override
			public AlertsSectionDirector getAlertsSectionDirector() {

				return new AlertsSectionDirector() {

					@Override
					public ST buildSectionTitle() {
						return new BuilderUtil.BuildST("Alerts Section").construct();
					}

				};
			}

			@Override
			public AdvanceDirectivesSectionDirector getAdvanceDirectivesSectionDirector() {

				return new AdvanceDirectivesSectionDirector() {

					@Override
					public ST buildSectionTitle() {
						return new BuilderUtil.BuildST("Advance Directives Section").construct();
					}

				};
			}

			@Override
			public SectionDirector getSectionDirector() {

				return new SectionDirector() {

					@Override
					public ST buildSectionTitle() {
						return new BuilderUtil.BuildST("Generic Section").construct();
					}

				};
			}

		};

		try {
			CDAUtil.save(exampleClinicalDocumentBuilder.buildDocument(), System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
