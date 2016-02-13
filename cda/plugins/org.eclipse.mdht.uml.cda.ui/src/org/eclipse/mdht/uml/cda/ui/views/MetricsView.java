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

import java.io.ByteArrayOutputStream;

import org.eclipse.mdht.uml.cda.ui.editors.CDAAnalyzer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.part.ViewPart;

public class MetricsView extends ViewPart {

	public void addTableListener(Table table) {
		table.addDisposeListener(new DisposeListener() {

			public void widgetDisposed(DisposeEvent e) {

			}
		});

		table.addListener(SWT.Selection, new Listener() {

			public void handleEvent(Event event) {
				if (event.item.getData() instanceof org.eclipse.mdht.uml.cda.ui.handlers.AnalyzeCDAHandler.CDAAnalaysisInput.CDAMetrics) {
					org.eclipse.mdht.uml.cda.ui.handlers.AnalyzeCDAHandler.CDAAnalaysisInput.CDAMetrics metrics = (org.eclipse.mdht.uml.cda.ui.handlers.AnalyzeCDAHandler.CDAAnalaysisInput.CDAMetrics) event.item.getData();

					new ByteArrayOutputStream();

					try {
						StringBuilder sb = new StringBuilder();

						sb.append("<html><head></head><body>Code Metrics<br/><table border=\"1\" width=\"400\">");

						for (String key : metrics.codedMetrics.keySet()) {
							sb.append("<tr><td>").append(key).append("</td><td>").append(
								metrics.codedMetrics.get(key)).append("</td></tr>");
						}

						sb.append("</table></body></html>");

						browser.setText(sb.toString());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});

	}

	Browser browser; // = new Browser(parent,SWT.BORDER);

	public MetricsView() {

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
