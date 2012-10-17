/*******************************************************************************
 * Copyright (c) 2012 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *    
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.part.ViewPart;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Component4;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

public class EntriesView extends ViewPart {

	private static StringBuffer getCDRow(CD cd, String rowStyle) {
		StringBuffer result = new StringBuffer();

		if (cd != null) {

			result.append("<tr ").append(rowStyle).append(" >");
			result.append("<td><small>").append(cd.eContainingFeature().getName()).append("</small></td>");
			result.append("<td><small>").append((cd.getCode() != null
					? cd.getCode()
					: "")).append("</small></td>");
			result.append("<td><small>").append((cd.getDisplayName() != null
					? cd.getDisplayName()
					: "")).append("</small></td>");
			result.append("<td><small>").append(cd.getOriginalText() != null
					? cd.getOriginalText().getText()
					: "");

			if (cd.getOriginalText() != null && cd.getOriginalText().getReference() != null &&
					cd.getOriginalText().getReference().getValue() != null &&
					cd.eContainer() instanceof ClinicalStatement) {
				ClinicalStatement clinicalStatement = (ClinicalStatement) cd.eContainer();
				if (clinicalStatement.getSection() != null && clinicalStatement.getSection().getText() != null) {
					result.append(clinicalStatement.getSection().getText().getText(
						cd.getOriginalText().getReference().getValue().substring(1)));
				}

			}
			result.append("</small></td>");
			result.append("<td><small>").append((cd.getCodeSystemName() != null
					? cd.getCodeSystemName()
					: "")).append("</small></td>");
			result.append("<td><small>").append((cd.getCodeSystem() != null
					? cd.getCodeSystem()
					: "")).append("</small></td>");
			result.append("<td><small>").append((cd.getCodeSystemVersion() != null
					? cd.getCodeSystemVersion()
					: "")).append("</small></td>");

			result.append("</tr>");

			for (CD translation : cd.getTranslations()) {
				result.append(getCDRow(translation, "style=\"background-color: #FFF5EE\""));
			}
		}

		return result;
	}

	private static StringBuffer getProcedureDetails(Procedure procedure) {

		StringBuffer result = new StringBuffer();
		result.append("<table width=\"100%\"  ><tbody>");

		result.append("<tr><td>").append(getClinicalStatementDetails(procedure)).append("</td></tr>");

		for (II ii : procedure.getIds()) {
			result.append("<tr><td><small>").append(ii.getRoot()).append("</small></td></tr>");
		}

		result.append("<tr><td><table  width=\"100%\" ><thead><tr><th><small>Attribute</small></th><th><small>Code</small></th><th><small>DisplayName</small></th><th><small>OriginalText</small></th><th><small>CodeSystemName</small></th><th><small>CodeSystem</small></th><th><small>CodeSystemVersion</small></th></tr></thead> <tbody>");
		if (procedure.getStatusCode() != null) {
			result.append(getCDRow(procedure.getStatusCode(), ""));
		}
		if (procedure.getCode() != null) {
			result.append(getCDRow(procedure.getCode(), ""));
		}
		for (CE ce : procedure.getMethodCodes()) {
			result.append(getCDRow(ce, ""));
		}
		result.append("</tbody></table></td></tr>");

		for (EntryRelationship er : procedure.getEntryRelationships()) {
			result.append("<tr><td>").append(getEntryRelationshipDetails(er)).append("</td></tr>");
		}

		result.append("</tbody></table>");

		return result;
	}

	private static StringBuffer getOrganizerDetails(Organizer organizer) {

		StringBuffer result = new StringBuffer();
		result.append("<table width=\"100%\"  ><tbody>");

		result.append("<tr><td>").append(getClinicalStatementDetails(organizer)).append("</td></tr>");

		for (II ii : organizer.getIds()) {
			result.append("<tr><td><small>").append(ii.getRoot()).append("</small></td></tr>");
		}

		result.append("<tr><td><table  width=\"100%\" ><thead><tr><th><small>Attribute</small></th><th><small>Code</small></th><th><small>DisplayName</small></th><th><small>OriginalText</small></th><th><small>CodeSystemName</small></th><th><small>CodeSystem</small></th><th><small>CodeSystemVersion</small></th></tr></thead> <tbody>");
		if (organizer.getStatusCode() != null) {
			result.append(getCDRow(organizer.getStatusCode(), ""));
		}
		if (organizer.getCode() != null) {
			result.append(getCDRow(organizer.getCode(), ""));
		}

		result.append("</tbody></table></td></tr>");

		for (Component4 component4 : organizer.getComponents()) {
			if (component4.getObservation() != null) {
				result.append("<tr><td>").append(getObservationDetails(component4.getObservation())).append(
					"</td></tr>");
			}
		}

		result.append("</tbody></table>");

		return result;
	}

	private static StringBuffer getObservationDetails(Observation observation) {

		StringBuffer result = new StringBuffer();
		result.append("<table width=\"100%\"  ><tbody>");

		result.append("<tr><td>").append(getClinicalStatementDetails(observation)).append("</td></tr>");

		for (II ii : observation.getIds()) {
			result.append("<tr><td><small>").append(ii.getRoot()).append("</small></td></tr>");
		}

		result.append("<tr><td><table  width=\"100%\" ><thead><tr><th><small>Attribute</small></th><th><small>Code</small></th><th><small>DisplayName</small></th><th><small>OriginalText</small></th><th><small>CodeSystemName</small></th><th><small>CodeSystem</small></th><th><small>CodeSystemVersion</small></th></tr></thead> <tbody>");
		if (observation.getStatusCode() != null) {
			result.append(getCDRow(observation.getStatusCode(), ""));
		}
		if (observation.getCode() != null) {
			result.append(getCDRow(observation.getCode(), ""));
		}
		for (ANY any : observation.getValues()) {
			if (any instanceof CD) {
				result.append(getCDRow((CD) any, "style=\"background-color:#FFFFAA\""));
			}
		}
		result.append("</tbody></table></td></tr>");

		for (EntryRelationship er : observation.getEntryRelationships()) {
			result.append("<tr><td>").append(getEntryRelationshipDetails(er)).append("</td></tr>");
		}

		result.append("</tbody></table>");

		return result;
	}

	private static StringBuffer getEncountersDetails(Encounter encounter) {

		StringBuffer result = new StringBuffer();
		result.append("<table width=\"100%\"  ><tbody>");

		result.append("<tr><td>").append(getClinicalStatementDetails(encounter)).append("</td></tr>");

		for (II ii : encounter.getIds()) {
			result.append("<tr><td><small>").append(ii.getRoot()).append("</small></td></tr>");
		}

		result.append("<tr><td><table  width=\"100%\" ><thead><tr><th><small>Attribute</small></th><th><small>Code</small></th><th><small>DisplayName</small></th><th><small>OriginalText</small></th><th><small>CodeSystemName</small></th><th><small>CodeSystem</small></th><th><small>CodeSystemVersion</small></th></tr></thead> <tbody>");
		if (encounter.getStatusCode() != null) {
			result.append(getCDRow(encounter.getStatusCode(), ""));
		}
		if (encounter.getCode() != null) {
			result.append(getCDRow(encounter.getCode(), ""));
		}

		result.append("</tbody></table></td></tr>");

		for (EntryRelationship er : encounter.getEntryRelationships()) {
			result.append("<tr><td>").append(getEntryRelationshipDetails(er)).append("</td></tr>");
		}

		result.append("</tbody></table>");

		return result;
	}

	// #FFFFAA #FFFFAA style=\"background-color:#FFFFAA\"
	private static StringBuffer getClinicalStatementDetails(ClinicalStatement cs) {

		StringBuffer result = new StringBuffer();

		result.append("<table style=\"background-color:#F0F0F0\" width=\"100%\"  ><thead><tr><th><small>Clinical Statement</small></th><th><small>Template ID(s)</small></th></tr></thead><tbody>");

		StringBuffer templateIds = new StringBuffer();
		for (II ii : cs.getTemplateIds()) {
			templateIds.append(templateIds.length() > 0
					? ", "
					: "").append(ii.getRoot());
		}

		String prefix = "";
		if (cs.eContainer() instanceof EntryRelationship && cs.eContainer().eContainer() instanceof ClinicalStatement) {
			prefix = cs.eContainer().eContainer().eClass().getName() + "->";
		}

		result.append("<tr><td><small>").append(prefix).append(cs.eClass().getName()).append("</small></td><td><small>").append(
			templateIds).append("</small></td></tr></tbody></table>");

		return result;

	}

	private static StringBuffer getEntryRelationshipDetails(EntryRelationship er) {
		StringBuffer result = new StringBuffer();
		if (er.getAct() != null) {
			result.append("<tr><td>").append(getActDetails(er.getAct())).append("</td></tr>");
		}
		if (er.getObservation() != null) {
			result.append("<tr><td>").append(getObservationDetails(er.getObservation())).append("</td></tr>");
		}
		if (er.getEncounter() != null) {
			result.append("<tr><td>").append(getEncountersDetails(er.getEncounter())).append("</td></tr>");
		}

		if (er.getOrganizer() != null) {
			result.append("<tr><td>").append(getOrganizerDetails(er.getOrganizer())).append("</td></tr>");
		}
		if (er.getProcedure() != null) {
			result.append("<tr><td>").append(getProcedureDetails(er.getProcedure())).append("</td></tr>");
		}
		return result;
	}

	private static StringBuffer getActDetails(Act act) {

		StringBuffer result = new StringBuffer();

		result.append("<table width=\"100%\" ><tbody>");

		result.append("<tr><td colspan=\"30\" >").append(getClinicalStatementDetails(act)).append("</td></tr>");

		for (II ii : act.getIds()) {
			result.append("<tr><td colspan=\"30\" >").append(ii.getRoot()).append("</td></tr>");
		}

		result.append("<tr><td colspan=\"30\" ><table  width=\"100%\"  ><thead><tr><th><small>Attribute</small></th><th><small>Code</small></th><th><small>DisplayName</small></th><th><small>OriginalText</small></th><th><small>CodeSystemName</small></th><th><small>CodeSystem</small></th><th><small>CodeSystemVersion</small></th></tr></thead> <tbody>");
		if (act.getStatusCode() != null) {
			result.append(getCDRow(act.getStatusCode(), ""));
		}
		if (act.getCode() != null) {
			result.append(getCDRow(act.getCode(), ""));
		}
		result.append("</tbody></table>").append("</td></tr>");

		for (EntryRelationship er : act.getEntryRelationships()) {
			result.append("");
			result.append("<tr><td>").append(getEntryRelationshipDetails(er)).append("</td></tr>");
		}
		result.append("</tbody></table>");

		return result;
	}

	private static StringBuffer getSubstanceAdministrationDetails(SubstanceAdministration substanceAdministration) {

		StringBuffer result = new StringBuffer();

		result.append("<table width=\"100%\" ><tbody>");

		result.append("<tr><td colspan=\"30\" >").append(getClinicalStatementDetails(substanceAdministration)).append(
			"</td></tr>");

		for (II ii : substanceAdministration.getIds()) {
			result.append("<tr><td colspan=\"30\" >").append(ii.getRoot()).append("</td></tr>");
		}

		result.append("<tr><td colspan=\"30\" ><table  width=\"100%\"  ><thead><tr><th><small>Attribute</small></th><th><small>Code</small></th><th><small>DisplayName</small></th><th><small>OriginalText</small></th><th><small>CodeSystemName</small></th><th><small>CodeSystem</small></th><th><small>CodeSystemVersion</small></th></tr></thead> <tbody>");
		if (substanceAdministration.getStatusCode() != null) {
			result.append(getCDRow(substanceAdministration.getStatusCode(), ""));
		}
		if (substanceAdministration.getCode() != null) {
			result.append(getCDRow(substanceAdministration.getCode(), ""));
		}
		result.append("</tbody></table>").append("</td></tr>");

		if (substanceAdministration.getAdministrationUnitCode() != null) {
			result.append(getCDRow(substanceAdministration.getAdministrationUnitCode(), ""));
		}

		for (CD cd : substanceAdministration.getApproachSiteCodes()) {
			result.append(getCDRow(cd, ""));
		}

		substanceAdministration.getConsumable().getManufacturedProduct();

		// substanceAdministration.getConsumable().getAct();

		// substanceAdministration.getConsumable()
		// result.append("<tr><td colspan=\"30\" >").append(
		// getClinicalStatementDetails(substanceAdministration.getConsumable())).append("</td></tr>");
		// ;

		for (EntryRelationship er : substanceAdministration.getEntryRelationships()) {
			result.append("");
			result.append("<tr><td>").append(getEntryRelationshipDetails(er)).append("</td></tr>");
		}
		result.append("</tbody></table>");

		return result;
	}

	public void addTableListener(Table table) {

		table.addListener(SWT.Selection, new Listener() {

			public void handleEvent(Event event) {
				if (event.item.getData() instanceof Section) {
					Section section = (Section) event.item.getData();
					StringBuffer sbe = new StringBuffer();
					sbe.append("<html><head><style type=\"text/css\">table{border-collapse:collapse;}table, td, th{border:1px solid black;}</style></head><body><table  width=\"100%\" border=\"1\" ><tbody>");
					int entryCtr = 1;
					for (Entry entry : section.getEntries()) {
						if (entry.getAct() != null) {
							sbe.append("<tr><td><h3 style=\"background-color:#B9D3EE\" > Entry ").append(entryCtr++).append(
								"</h3></td></tr>");
							sbe.append("<tr><td>").append(getActDetails(entry.getAct())).append("</td></tr>");
							sbe.append("<tr><td>&nbsp;</td></tr>");
						}

						if (entry.getObservation() != null) {
							sbe.append("<tr><td><h3 style=\"background-color:#B9D3EE\" > Entry ").append(entryCtr++).append(
								"</h3></td></tr>");
							sbe.append("<tr><td>").append(getObservationDetails(entry.getObservation())).append(
								"</td></tr>");
							sbe.append("<tr><td>&nbsp;</td></tr>");
						}

						if (entry.getOrganizer() != null) {
							sbe.append("<tr><td><h3 style=\"background-color:#B9D3EE\" > Entry ").append(entryCtr++).append(
								"</h3></td></tr>");
							sbe.append("<tr><td>").append(getOrganizerDetails(entry.getOrganizer())).append(
								"</td></tr>");
							sbe.append("<tr><td>&nbsp;</td></tr>");
						}

						if (entry.getProcedure() != null) {
							sbe.append("<tr><td><h3 style=\"background-color:#B9D3EE\" > Entry ").append(entryCtr++).append(
								"</h3></td></tr>");
							sbe.append("<tr><td>").append(getProcedureDetails(entry.getProcedure())).append(
								"</td></tr>");
							sbe.append("<tr><td>&nbsp;</td></tr>");
						}

						if (entry.getEncounter() != null) {
							sbe.append("<tr><td><h3 style=\"background-color:#B9D3EE\" > Entry ").append(entryCtr++).append(
								"</h3></td></tr>");
							sbe.append("<tr><td>").append(getEncountersDetails(entry.getEncounter())).append(
								"</td></tr>");
							sbe.append("<tr><td>&nbsp;</td></tr>");
						}

						if (entry.getSubstanceAdministration() != null) {
							sbe.append("<tr><td><h3 style=\"background-color:#B9D3EE\" > Entry ").append(entryCtr++).append(
								"</h3></td></tr>");
							sbe.append("<tr><td>").append(
								getSubstanceAdministrationDetails(entry.getSubstanceAdministration())).append(
								"</td></tr>");
							sbe.append("<tr><td>&nbsp;</td></tr>");
						}

					}
					sbe.append("</tbody></table></body></html>");
					browser.setText(sbe.toString());
				}
			}
		});

	}

	Browser browser;

	public EntriesView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		browser = new Browser(parent, SWT.BORDER);

	}

	@Override
	public void setFocus() {
	}

}
