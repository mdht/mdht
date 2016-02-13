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
package org.eclipse.mdht.uml.cda.ui.views;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.mdht.uml.cda.ui.editors.CDAAnalyzer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.part.ViewPart;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.util.CDADiagnostic;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.openhealthtools.mdht.uml.cda.util.ValidationResult;

public class ValidationsView extends ViewPart {

	private static class CDADiagnosticCounter {
		private CDADiagnostic cdaDiagnosticq;

		public CDADiagnostic getCdaDiagnosticq() {
			return cdaDiagnosticq;
		}

		public int getCount() {
			return count;
		}

		public void incrementCount() {
			this.count++;
		}

		private int count = 0;

		/**
		 * @param cdaDiagnosticq
		 */
		public CDADiagnosticCounter(CDADiagnostic cdaDiagnosticq) {
			super();
			this.cdaDiagnosticq = cdaDiagnosticq;
		}
	}

	private static void handleDiagnostic(Diagnostic diagnostic, ValidationHandler handler) {
		switch (diagnostic.getSeverity()) {
			case Diagnostic.ERROR:
				handler.handleError(diagnostic);
				break;
			case Diagnostic.WARNING:
				handler.handleWarning(diagnostic);
				break;
			case Diagnostic.INFO:
				handler.handleInfo(diagnostic);
				break;
		}
	}

	private static boolean shouldHandle(Diagnostic diagnostic) {
		// filter out diagnostics with no message or with root diagnostic message
		if (diagnostic.getMessage() == null || diagnostic.getMessage().startsWith("Diagnosis of")) {
			return false;
		}
		return true;
	}

	// iterative breadth-first traversal of diagnostic tree using queue
	private static void processDiagnostic(Diagnostic diagnostic, ValidationHandler handler) {
		Queue<Diagnostic> queue = new LinkedList<Diagnostic>();
		queue.add(diagnostic); // root
		while (!queue.isEmpty()) {
			Diagnostic d = queue.remove();
			if (shouldHandle(d)) {
				handleDiagnostic(d, handler); // visit
			}
			for (Diagnostic childDiagnostic : d.getChildren()) { // process successors
				queue.add(childDiagnostic);
			}
		}
	}

	public void addTableListener(Table table) {

		table.addListener(SWT.Selection, new Listener() {

			public void handleEvent(Event event) {
				if (event.item.getData() instanceof Section) {
					Section section = (Section) event.item.getData();
					Map<String, CDADiagnosticCounter> errorsResultMap = new HashMap<String, CDADiagnosticCounter>();
					Map<String, CDADiagnosticCounter> warningsResultMap = new HashMap<String, CDADiagnosticCounter>();
					Map<String, CDADiagnosticCounter> informationResultMap = new HashMap<String, CDADiagnosticCounter>();

					Diagnostic diagnostic = Diagnostician.INSTANCE.validate(section);

					ValidationResult vr = new ValidationResult();

					StringBuffer sb = new StringBuffer();

					if (diagnostic.getChildren().size() > 0) {
						processDiagnostic(diagnostic, vr);
					}

					for (Diagnostic dq : vr.getErrorDiagnostics()) {

						String key = String.format("%s::%d", dq.getSource(), dq.getCode());
						if (!errorsResultMap.containsKey(key)) {
							CDADiagnosticCounter cdaDiagnosticCounter = new CDADiagnosticCounter(new CDADiagnostic(dq));
							errorsResultMap.put(key, cdaDiagnosticCounter);
						}
						errorsResultMap.get(key).incrementCount();

					}

					for (Diagnostic dq : vr.getWarningDiagnostics()) {

						String key = String.format("%s::%d", dq.getSource(), dq.getCode());
						if (!warningsResultMap.containsKey(key)) {
							CDADiagnosticCounter cdaDiagnosticCounter = new CDADiagnosticCounter(new CDADiagnostic(dq));
							warningsResultMap.put(key, cdaDiagnosticCounter);
						}
						warningsResultMap.get(key).incrementCount();

					}

					for (Diagnostic dq : vr.getInfoDiagnostics()) {

						String key = String.format("%s::%d", dq.getSource(), dq.getCode());
						if (!informationResultMap.containsKey(key)) {
							CDADiagnosticCounter cdaDiagnosticCounter = new CDADiagnosticCounter(new CDADiagnostic(dq));
							informationResultMap.put(key, cdaDiagnosticCounter);
						}
						informationResultMap.get(key).incrementCount();

					}

					final Comparator<CDADiagnosticCounter> comparator = new Comparator<CDADiagnosticCounter>() {
						public int compare(CDADiagnosticCounter o1, CDADiagnosticCounter o2) {
							if (o1.getCount() > o2.getCount()) {
								return -1;
							} else if (o1.getCount() < o2.getCount()) {
								return 1;
							} else {
								return 0;
							}
						}
					};

					sb.append(
						"<table width=\"100%\" border=\"1\"><thead><tr><th colspan=\"2\">ERRORS</th></tr><tr><th>Count</th><th>Description</th></tr></thead>");

					if (!errorsResultMap.isEmpty()) {

						List<CDADiagnosticCounter> errorsMapValues = new ArrayList<CDADiagnosticCounter>(
							errorsResultMap.values());

						Collections.sort(errorsMapValues, comparator);

						for (CDADiagnosticCounter cdc : errorsMapValues) {
							sb.append(
								"<tr><td>" + cdc.getCount() + "</td><td><small>" +
										cdc.getCdaDiagnosticq().getMessage() + "</small></td></tr>");
						}
					} else {
						sb.append("<tr><td colspan='10'>NO ERRORS</td><tr>");
					}

					sb.append("</table>");

					sb.append(
						"<table width=\"100%\" border=\"1\"><thead><tr><th colspan=\"2\">WARNINGS</th></tr><tr><th>Count</th><th>Description</th></tr></thead>");

					if (!warningsResultMap.isEmpty()) {

						List<CDADiagnosticCounter> mapValues = new ArrayList<CDADiagnosticCounter>(
							warningsResultMap.values());

						Collections.sort(mapValues, comparator);

						for (CDADiagnosticCounter cdc : mapValues) {
							sb.append(
								"<tr><td>" + cdc.getCount() + "</td><td><small>" +
										cdc.getCdaDiagnosticq().getMessage() + "</small></td><tr>");
						}
					} else {
						sb.append("<tr><td colspan='10'>NO WARNINGS</td></tr>");
					}

					sb.append("</table>");

					sb.append(
						"<table width=\"100%\" border=\"1\"><thead><tr><th colspan=\"2\">INFORMATIONAL</th></tr><tr><th>Count</th><th>Description</th></tr></thead>");

					if (!informationResultMap.isEmpty()) {

						List<CDADiagnosticCounter> mapValues = new ArrayList<CDADiagnosticCounter>(
							informationResultMap.values());

						Collections.sort(mapValues, comparator);

						for (CDADiagnosticCounter cdc : mapValues) {
							sb.append(
								"<tr><td>" + cdc.getCount() + "</td><td><small>" +
										cdc.getCdaDiagnosticq().getMessage() + "</small></td></tr>");
						}
					} else {
						sb.append("<tr><td colspan='10'>NO INFORMATIONAL</td></tr>");
					}
					sb.append("</table>");

					browser.setText(sb.toString());
				}
			}
		});

	}

	Browser browser; // = new Browser(parent,SWT.BORDER);

	public ValidationsView() {
	}

	public void clearView() {
		browser.setText("");
	}

	@Override
	public void createPartControl(Composite parent) {
		browser = new Browser(parent, SWT.BORDER);
		if (getSite().getPage().getPerspective() != null) {
			for (IEditorReference editorReference : getSite().getPage().getEditorReferences()) {
				if ("org.eclipse.mdht.uml.cda.ui.editors.CDAAnalyzer".equals(editorReference.getId())) {
					CDAAnalyzer analyzer = (CDAAnalyzer) editorReference.getEditor(false);
					if (analyzer != null) {
						this.addTableListener(analyzer.getTable());
					}
				}
			}
		}
	}

	@Override
	public void setFocus() {

	}

}
