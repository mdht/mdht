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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.nebula.widgets.xviewer.XViewerStyledTextLabelProvider;
import org.eclipse.nebula.widgets.xviewer.core.model.XViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.swt.widgets.Display;

import traceability.DiffCategory;
import traceability.LogEntry;
import traceability.Trace;
import traceability.TraceComment;
import traceability.TraceDiff;
import traceability.presentation.TraceabilityEditor;
import traceability.presentation.TraceabilityEditorPlugin;
import traceability.presentation.table.images.TraceabilityImageCache;
import traceability.util.TraceabilityUtils;

public class TraceabilityViewerLabelProvider extends XViewerStyledTextLabelProvider {

	private TraceabilityViewer myXviewer;

	// prevents creating too many font handles
	private static Map<List<FontData>, Font> fontCache = new WeakHashMap<List<FontData>, Font>();

	// fix for CITIE-432
	private boolean returned32widthimage;

	public TraceabilityViewerLabelProvider(TraceabilityViewer myXviewer) {
		super(myXviewer);
		this.myXviewer = myXviewer;
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		// nothing to do
	}

	@Override
	public void dispose() {
		// nothing to do
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return true;
	}

	@Override
	public Image getColumnImage(Object element, XViewerColumn xCol, int columnIndex) {
		if ("".equals(getColumnText(element, xCol, columnIndex))) {
			return null;
		}

		Image result = null;
		String base = "platform:/plugin/" + TraceabilityEditorPlugin.getPlugin().getBundle().getSymbolicName() + "/icons/";
		if (myXviewer.traceabilityEditor.isErrorCol(xCol)) {
			element = TraceabilityViewer.getRedirectedElement(element);
			LogEntry error = myXviewer.tracing.getError(element);
			if (error != null) {
				if (error.getSeverity() == 0)
					result = TraceabilityImageCache.getImage(base + "severities/LogEntry.png");
				if (error.getSeverity() == 1)
					result = TraceabilityImageCache.getImage(base + "severities/Warning.png");
				if (error.getSeverity() == 2)
					result = TraceabilityImageCache.getImage(base + "severities/Info.png");
			}
		}

		if (result == null) {
			Object data = myXviewer.getCellData(xCol, element);
			result = myXviewer.traceabilityEditor.getImage(data);
		}
		if (result != null && !returned32widthimage && result.getBounds().width < 32) {
			result = TraceabilityImageCache.getImage(base + "spacereservation.png");
			returned32widthimage = true;
			final Object felement = element;
			Display.getCurrent().asyncExec(new Runnable() {
				public void run() {
					// paint original icon
					myXviewer.update(felement, null);
				}
			});
		}
		return result;
	}

	public String getColumnTextOriginal(Object element, XViewerColumn xCol, int columnIndex) {

		element = TraceabilityViewer.getRedirectedElement(element);
		xCol = myXviewer.traceabilityEditor.getRedirectedColumn(element, xCol);

		if (element instanceof String)
			return columnIndex == 0 ? (String) element : "";

		String result = myXviewer.traceabilityEditor.getLabel(element, xCol, columnIndex);
		Object cellData = myXviewer.getCellData(xCol, element);
		if (cellData instanceof EObject && ((EObject) cellData).eIsProxy()) {
			result = "<del>" + ((BasicEObjectImpl) cellData).eProxyURI() + "</del>";
		}
		if (result == null)
			return "?";
		if ("".equals(result))
			return "<empty string>";
		return result;
	}

	public String getColumnTextDiffed(Object element, XViewerColumn xCol, int columnIndex) {
		String result = getColumnTextOriginal(element, xCol, columnIndex);
		if (result == null || "?".equals(result))
			return "?";
		// if (Conformance_Col.equals(xCol))
		// result = adjustConformanceMessage(result);
		List<TableCellDifference> cellDiffs = getTableCellDifferences(element, xCol);
		if (cellDiffs == null || cellDiffs.size() >= 2 && getValueSet(cellDiffs).size() == 1)
			return result;
		if (!"".equals(cellDiffs.get(0).getDiffText()))
			result = "<b>" + cellDiffs.get(0).getDiffText() + "</b> " + result;
		return result;

	}

	public String getColumnText(Object element, XViewerColumn xCol, int columnIndex) {
		String cellText = getColumnTextDiffed(element, xCol, columnIndex);
		if (myXviewer.getSorter() instanceof TraceabilitySorter) {
			TraceabilitySorter traceabilitySorter = (TraceabilitySorter) myXviewer.getSorter();
			if (traceabilitySorter.sorting)
				return cellText;
		}
		TraceabilityViewerContentProvider content = (TraceabilityViewerContentProvider) myXviewer.getContentProvider();
		if (!myXviewer.traceabilityEditor.traceabilityFilters_ALL && cellText != null && !"".equals(cellText) && !"?".equals(cellText) && !content.hasChildren(element) && !myXviewer.traceabilityEditor.alwaysPrintColumns().contains(xCol)) {
			Object prevElement = this.myXviewer.getPreviousElement(element);
			if (prevElement != null) {
				Object cell = myXviewer.getCellData(xCol, element);
				Object prevCell = myXviewer.getCellData(xCol, prevElement);
				String cellTextAbove = getColumnTextDiffed(prevElement, xCol, columnIndex);
				if (cell == prevCell && cellText.equals(cellTextAbove))
					return "";
			}
		}
		return cellText;
	}

	// @Override
	public StyledString getStyledText(Object element, XViewerColumn xCol, int column) throws Exception {
		String s = getColumnText(element, xCol, column);
		s = myXviewer.traceabilityEditor.adjustStyledText(xCol, element, s);
		if (myXviewer.isHovered(element, xCol) && myXviewer.getCellData(xCol, element) != null) {
			s = s.substring(0, s.indexOf(s.trim())) + "<xref>" + s.trim() + "</xref>";
		}
		Point found = TraceabilityViewer.findText(s, myXviewer.searchText, myXviewer.searchregex);
		if (found != null) {
			s = s.substring(0, found.x) + "<s>" + s.substring(found.x, found.y) + "</s>" + s.substring(found.y);
		}
		return getStyledString(s, true);
	}

	/**
	 * @param s
	 * @return
	 */
	static public StyledString getStyledString(String s, boolean oneLineFormatting) {
		int listNesting = 0;
		StyledString ss = new StyledString();
		int i;
		int i2;
		Font font = null;
		Styler current = null;
		boolean underline = false;
		boolean del = false;
		boolean search = false;
		while ((i = s.indexOf("<")) != -1 && (i2 = s.indexOf(">", i)) != -1) {
			String part = s.substring(0, i);
			final String tag = s.substring(i, i2 + 1);
			if ("<li>".equals(tag))
				part = "\n" + ((char) 8226) + " ";
			if ("<lines>".equals(tag))
				part += "\n\n";
			if ("</lines>".equals(tag))
				part += "\n";
			if (oneLineFormatting)
				part = part.replaceAll("[\\p{Zs}]*[\n\r][\n\r\\p{Zs}]*", " ");
			part = part.replace("\n", "\n" + StringUtils.repeat(" ", listNesting * 3));
			part = part.replace("&lt;", "<");
			part = part.replace("&gt;", ">");
			ss.append(part, current);
			if ("<li>".equals(tag))
				listNesting++;
			if ("</li>".equals(tag))
				listNesting--;
			if (tag.startsWith("<xref"))
				underline = true;
			if ("</xref>".equals(tag) || underline && tag.endsWith("/>"))
				underline = false;
			if (tag.startsWith("<del"))
				del = true;
			if ("</del>".equals(tag) || del && tag.endsWith("/>"))
				del = false;
			if ("<s>".equals(tag))
				search = true;
			if ("</s>".equals(tag))
				search = false;
			final boolean funderline = underline;
			final boolean fdel = del;
			font = getFont(tag, font);
			final Font ffont = font;
			final boolean fsearch = search;
			current = new Styler() {

				@Override
				public void applyStyles(TextStyle textStyle) {
					if (funderline) {
						textStyle.underline = true;
						textStyle.underlineStyle = SWT.UNDERLINE_LINK;
					}
					if (fdel) {
						textStyle.strikeout = true;
					}
					if (fsearch) {
						textStyle.foreground = TraceabilityEditor.COLOR_SEARCHFOREGROUND;
						textStyle.background = TraceabilityEditor.COLOR_SEARCHBACKGROUND;
					}
					textStyle.font = ffont;
				}

			};
			s = s.substring(i2 + 1);
		}
		if (oneLineFormatting)
			s = s.replaceAll("[\\p{Zs}]*[\n\r][\n\r\\p{Zs}]*", " ");
		s = s.replace("&lt;", "<");
		s = s.replace("&gt;", ">");
		ss.append(s, current);
		return ss;
	}

	static private Font getFont(final String tagName, Font font) {
		if (font == null)
			font = Display.getCurrent().getSystemFont();
		FontData[] fontData2 = font.getFontData();
		for (FontData fontData : fontData2) {
			if (tagName.equals("<i>"))
				fontData.setStyle(fontData.getStyle() | SWT.ITALIC);
			if (tagName.equals("</i>"))
				fontData.setStyle(fontData.getStyle() & ~SWT.ITALIC);
			if (tagName.equals("<b>"))
				fontData.setStyle(fontData.getStyle() | SWT.BOLD);
			if (tagName.equals("</b>"))
				fontData.setStyle(fontData.getStyle() & ~SWT.BOLD);
			if (tagName.equals("<tt>"))
				fontData.setName("Courier");
			if (tagName.equals("</tt>"))
				fontData.setName(Display.getCurrent().getSystemFont().getFontData()[0].getName());
		}
		Font result = fontCache.get(Arrays.asList(fontData2));
		if (result == null) {
			result = new Font(Display.getCurrent(), fontData2);
			fontCache.put(Arrays.asList(fontData2), result);
		}
		return result;
	}

	public Color getBackground(Object element, XViewerColumn viewerColumn, int columnIndex) {
		element = TraceabilityViewer.getRedirectedElement(element);
		// if (myXviewer.getCellData(viewerColumn, element) == element)
		// return new Color(Display.getDefault(), 0, 255, 255);
		List<TableCellDifference> cellDiffs = getTableCellDifferences(element, viewerColumn);
		if (cellDiffs == null || cellDiffs.size() >= 2 && getValueSet(cellDiffs).size() == 1)
			return null;
		String diff = cellDiffs.get(0).getDiffText();
		if ("+".equals(diff))
			return TraceabilityEditor.COLOR_PLUS;
		if ("-".equals(diff))
			return TraceabilityEditor.COLOR_MINUS;
		if (TraceabilityEditor.DIFF_UNEQUAL.equals(diff))
			return TraceabilityEditor.COLOR_UNEQUAL;
		return null;
	}

	public Color getForeground(Object element, XViewerColumn viewerColumn, int columnIndex) {
		if (myXviewer.isHovered(element, viewerColumn) && myXviewer.getCellData(viewerColumn, element) != null)
			return TraceabilityEditor.COLOR_LINK;
		return null;
	}

	public Font getFont(Object element, XViewerColumn viewerColumn, int columnIndex) throws Exception {
		return null;
	}

	public void removeListener(ILabelProviderListener listener) {
		// nothing to do
	}

	public String getToolTipText(Object element) {
		if (myXviewer.hoverElement == element) {
			XViewerColumn xCol = myXviewer.hoverCol;
			if (myXviewer.traceabilityEditor.isErrorCol(xCol)) {
				List<LogEntry> errors = myXviewer.tracing.getErrors(element);
				if (errors.size() >= 2) {
					String result = "";
					for (LogEntry error : errors) {
						result += new String[] { "Error", "Warning", "Info" }[error.getSeverity()] + ":\t" + error.getMessage() + "\n";
						List<TableCellDifference> cellDiffs = getTableCellDifferences(error, xCol);
						if (cellDiffs != null) {
							if (cellDiffs.size() == 1)
								result += "\t(occurs in " + cellDiffs.get(0).getProject() + ")\n";
							else
								result += "\t(occurs in all)\n";
						}
						result = addComment(result, error, xCol, element);
					}
					return result.trim();
				}
			}
			EObject eObject = myXviewer.traceabilityEditor.getColumnSpecificElement(xCol, element);
			List<TableCellDifference> cellDiffs = getTableCellDifferences(element, xCol);
			if (cellDiffs != null) {
				String result = "";
				for (TableCellDifference tableCellDifference : cellDiffs) {
					if ("".equals(tableCellDifference.getCellText()))
						result += "<empty string>";
					result += tableCellDifference.getCellText().trim() + "\n\t(occurs in " + tableCellDifference.getProject() + ")\n";
				}
				result = addComment(result, myXviewer.tracing.getTraceDiff(eObject), xCol, element);
				return result;
			}
			String result = getColumnTextOriginal(element, xCol, -1);
			if (!"".equals(result) && !"?".equals(result)) {
				result = addComment(result, eObject, xCol, element);
				result = addComment(result, myXviewer.tracing.getTrace(eObject), xCol, element);
				return result;
			}
		}
		return null;
	}

	private String addComment(String result, EObject eObject, XViewerColumn xCol, Object element) {
		List<TraceComment> comments = eObject instanceof Trace ? ((Trace) eObject).getComments() : eObject instanceof LogEntry ? ((LogEntry) eObject).getComments() : eObject instanceof TraceDiff ? ((TraceDiff) eObject).getComments() : Collections.<TraceComment> emptyList();
		for (TraceComment comment : comments) {
			if (xCol.getId().equals(comment.getColumn()) && (comment.getNarrowDown() == null || comment.getNarrowDown() == myXviewer.traceabilityEditor.getNarrowDown(xCol, element)))
				result += "\n\t" + "Comment: <b>" + comment.getComment() + "</b> from <i>" + comment.getUsername() + "</i> at <i>" + comment.getDate() + "</i>";
		}
		return result;
	}

	List<TableCellDifference> getTableCellDifferences(Object element, XViewerColumn xCol) {

		EObject eObject = element instanceof LogEntry ? (LogEntry) element : myXviewer.traceabilityEditor.getColumnSpecificElement(xCol, element);
		TraceDiff traceDiff = myXviewer.tracing.getTraceDiff(eObject);
		if (traceDiff != null) {
			Object focusedParticipant = eObject;
			DiffCategory cat = (DiffCategory) traceDiff.eContainer();
			int sourceIndex = -1;
			int targetIndex = -1;
			for (EObject participant : traceDiff.getParticipants()) {
				if (participant instanceof Trace) {
					Trace trace = (Trace) participant;
					sourceIndex = trace.getSource().indexOf(element);
					targetIndex = trace.getTarget().indexOf(element);
					if (sourceIndex != -1 || targetIndex != -1) {
						focusedParticipant = participant;
						break;
					}
					sourceIndex = trace.getSource().indexOf(eObject);
					targetIndex = trace.getTarget().indexOf(eObject);
					if (sourceIndex != -1 || targetIndex != -1) {
						focusedParticipant = participant;
						break;
					}
				}
			}
			if (sourceIndex != -1 || targetIndex != -1 || focusedParticipant instanceof LogEntry) {
				List<TableCellDifference> result = new ArrayList<TableCellDifference>();
				boolean hasOneMissing = false;
				int participantIndex = 0;
				int modelIndex = -1;
				for (EObject participant : traceDiff.getParticipants()) {
					String projectName = TraceabilityUtils.getProjectName(participant);
					if (projectName != null) {
						String text = null;
						EObject eo = null;
						if (participant instanceof Trace) {
							Trace trace = (Trace) participant;
							if (sourceIndex != -1 && trace.getSource().size() > sourceIndex) {
								eo = trace.getSource().get(sourceIndex);
							}
							if (targetIndex != -1 && trace.getTarget().size() > 0) {
								eo = trace.getTarget().get(Math.min(targetIndex, trace.getTarget().size() - 1));
							}
							if (eo != null)
								text = getColumnTextOriginal(eo, xCol, -1);
						}
						if (participant instanceof LogEntry) {
							LogEntry logEntry = (LogEntry) participant;
							eo = logEntry;
							text = logEntry.getMessage();
						}
						if (eo != null) {
							hasOneMissing |= "?".equals(text);
							if (!"?".equals(text))
								modelIndex = participantIndex;
							TableCellDifference d = new TableCellDifference(text, projectName, "");
							if (focusedParticipant == participant)
								result.add(0, d);
							else
								result.add(d);
						}
					}
					participantIndex++;
				}
				for (TableCellDifference d : result) {
					d.setDiffText(!hasOneMissing && cat.isUnequal() ? TraceabilityEditor.DIFF_UNEQUAL : (hasOneMissing ? modelIndex : cat.getModelIndex()) == 0 ? "+" : "-");
				}
				if (result.size() >= 0)
					return result;
			}
		}
		return null;
	}

	public static Set<Object> getValueSet(List<TableCellDifference> diffs) {
		Set<Object> result = new HashSet<Object>();
		for (TableCellDifference diff : diffs) {
			result.add(diff.getCellText());
		}
		return result;
	}

	public Image getToolTipImage(Object element) {
		if (myXviewer.hoverElement == element) {
			XViewerColumn xCol = myXviewer.hoverCol;
			String txt = getToolTipText(element);
			if (txt != null && txt.contains("\n")) {
				return null;
			}
			return getColumnImage(element, xCol, -1);
		}
		return null;
	}

	@Override
	public int getToolTipDisplayDelayTime(Object object) {
		return 500;
	}

}
