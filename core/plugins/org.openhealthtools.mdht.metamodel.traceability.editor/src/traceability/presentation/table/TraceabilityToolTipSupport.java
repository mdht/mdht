/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package traceability.presentation.table;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.nebula.widgets.xviewer.core.model.XViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TreeItem;

/**
 * Customized to display a StyledString instead of a plain string
 */
public class TraceabilityToolTipSupport extends ColumnViewerToolTipSupport {

	protected TraceabilityToolTipSupport(ColumnViewer viewer, int style, boolean manualActivation) {
		super(viewer, style, manualActivation);
	}

	@Override
	protected Composite createViewerToolTipContentArea(Event event, ViewerCell cell, final Composite parent) {

		TraceabilityViewer viewer = (TraceabilityViewer) ((TreeItem) cell.getItem()).getParent().getParent().getData();
		XViewerColumn xCol = viewer.getXTreeColumn(cell.getColumnIndex());

		Image image = getImage(event);
		Image bgImage = getBackgroundImage(event);
		String text = getText(event);
		Color fgColor = getForegroundColor(event);
		Color bgColor = getBackgroundColor(event);
		Font font = getFont(event);

		final Composite comp = new Composite(parent, SWT.NONE);

		GridLayout gl = new GridLayout(1, false);
		gl.marginBottom = 0;
		gl.marginTop = 0;
		gl.marginHeight = 0;
		gl.marginWidth = 0;
		gl.marginLeft = 0;
		gl.marginRight = 0;
		gl.verticalSpacing = 1;
		comp.setLayout(gl);

		Composite topArea = new Composite(comp, SWT.NONE);
		topArea.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

		gl = new GridLayout(2, false);
		gl.marginBottom = 2;
		gl.marginTop = 2;
		gl.marginHeight = 0;
		gl.marginWidth = 0;
		gl.marginLeft = 5;
		gl.marginRight = 2;

		topArea.setLayout(gl);

		if (image != null) {
			Composite iconComp = new Composite(topArea, SWT.NONE);
			iconComp.setLayoutData(new GridData());
			iconComp.setLayout(new GridLayout(2, false));

			gl = new GridLayout(2, false);
			gl.marginBottom = 0;
			gl.marginTop = 0;
			gl.marginHeight = 0;
			gl.marginWidth = 0;
			gl.marginLeft = 0;
			gl.marginRight = 0;
			iconComp.setLayout(gl);

			Label icon = new Label(iconComp, SWT.NONE);
			icon.setImage(image);
			icon.addMouseListener(new MouseAdapter() {

				public void mouseDown(MouseEvent e) {
					// hide();
					// openHelp();
				}
			});
		}

		Label l = new Label(topArea, SWT.NONE);
		l.setText(xCol.getName());
		l.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		final ScrolledComposite sc1 = new ScrolledComposite(comp, SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);
		sc1.setExpandHorizontal(true);
		sc1.setExpandVertical(true);

		StyledText label = new StyledText(sc1, SWT.NONE);
		sc1.setContent(label);
		if (text != null && TraceabilityViewer.getRedirectedElement(cell.getElement()) instanceof EObject) {
			StyledString ss = TraceabilityViewerLabelProvider.getStyledString(text, false);
			label.setText(ss.getString());
			label.setStyleRanges(ss.getStyleRanges());
		}

		if (image != null) {
			// label.setImage(image);
		}

		if (fgColor != null) {
			label.setForeground(fgColor);
		}

		if (bgColor != null) {
			label.setBackground(bgColor);
		}

		if (bgImage != null) {
			label.setBackgroundImage(image);
		}

		if (font != null) {
			label.setFont(font);
		}

		Point p = label.computeSize(SWT.DEFAULT, SWT.DEFAULT);
		sc1.setMinSize(p);
		p.x = Math.max(Math.min(p.x, 1000), 100);
		p.y = Math.max(Math.min(p.y, 500), 0);
		GridData data = new GridData(SWT.FILL, SWT.FILL, false, false);
		data.widthHint = p.x;
		data.heightHint = p.y;
		sc1.setLayoutData(data);

		label.forceFocus();

		this.setShift(new Point(-5, -5));
		this.setHideOnMouseDown(false);
		return comp;
	}

	public static final void enableFor(final ColumnViewer viewer) {
		new TraceabilityToolTipSupport(viewer, ToolTip.RECREATE, false);
	}
}
