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

import org.openhealthtools.mdht.builder.cda.Builder;
import org.openhealthtools.mdht.builder.cda.SectionBuilder;
import org.openhealthtools.mdht.builder.cda.helpers.BuilderUtil;
import org.openhealthtools.mdht.builder.hitsp.DocumentBuilder;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

public class BuildAllSectionsExample {

	public static void main(String[] args) {

		DocumentBuilder exampleClinicalDocumentBuilder = new DocumentBuilder() {

			@Override
			public AllergiesReactionSectionBuilder getAllergiesReactionSectionBuilder() {
				return new AllergiesReactionSectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Allergies Reaction Section");
					}

				};
			}

			@Override
			public ProblemListSectionBuilder getProblemListSectionBuilder() {

				return new ProblemListSectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Problem List Section");
					}

				};
			}

			@Override
			public ProblemSectionBuilder getProblemSectionBuilder() {

				return new ProblemSectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Problem Section");
					}

				};
			}

			@Override
			public FamilyHistorySectionBuilder getFamilyHistorySectionBuilder() {

				return new FamilyHistorySectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Family History Section");
					}

				};
			}

			@Override
			public FunctionalStatusSectionBuilder getFunctionalStatusSectionBuilder() {

				return new FunctionalStatusSectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Functional Section");
					}

				};
			}

			@Override
			public ImmunizationsSectionBuilder getImmunizationsSectionBuilder() {

				return new ImmunizationsSectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Immunizations Section");
					}

				};
			}

			@Override
			public MedicalEquipmentSectionBuilder getMedicalEquipmentSectionBuilder() {

				return new MedicalEquipmentSectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Medical Equipment Section");
					}

				};
			}

			@Override
			public MedicationsSectionBuilder getMedicationsSectionBuilder() {

				return new MedicationsSectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Medications Section");
					}

				};
			}

			@Override
			public PayersSectionBuilder getPayersSectionBuilder() {

				return new PayersSectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Payers Section Section");
					}

				};
			}

			@Override
			public PlanOfCareSectionBuilder getPlanOfCareSectionBuilder() {

				return new PlanOfCareSectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Plan Of Care Section");
					}

				};
			}

			@Override
			public ProcedureSectionBuilder getProcedureSectionBuilder() {

				return new ProcedureSectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Procedure Section");
					}

				};
			}

			@Override
			public PurposeSectionBuilder getPurposeSectionBuilder() {

				return new PurposeSectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Purpose Section");
					}

				};
			}

			@Override
			public ResultsSectionBuilder getResultsSectionBuilder() {

				return new ResultsSectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Results Section");
					}

				};
			}

			@Override
			public SocialHistorySectionBuilder getSocialHistorySectionBuilder() {

				return new SocialHistorySectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Social History Section");
					}

				};
			}

			@Override
			public VitalSignsSectionBuilder getVitalSignsSectionBuilder() {

				return new VitalSignsSectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Vital Signs Section");
					}

				};
			}

			@Override
			public AlertsSectionBuilder getAlertsSectionBuilder() {

				return new AlertsSectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Alerts Section");
					}

				};
			}

			@Override
			public AdvanceDirectivesSectionBuilder getAdvanceDirectivesSectionBuilder() {

				return new AdvanceDirectivesSectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Advance Directives Section");
					}

				};
			}

			@Override
			public SectionBuilder getSectionBuilder() {

				return new SectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Generic Section");
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
