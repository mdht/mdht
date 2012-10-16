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
package org.openhealthtools.mdht.uml.cda.ui.editors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Component3;
import org.openhealthtools.mdht.uml.cda.Component5;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StructuredBody;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.ui.views.EntriesView;
import org.openhealthtools.mdht.uml.cda.ui.views.NarrativeView;
import org.openhealthtools.mdht.uml.cda.ui.views.ValidationsView;
import org.openhealthtools.mdht.uml.cda.util.CDASwitch;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesSwitch;

public class CDAAnalyzer extends EditorPart {

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

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.openhealthtools.mdht.uml.cda.ui.editors.CDAAnalyzer";

	private TableViewer viewer;

	public TableViewer getViewer() {
		return viewer;
	}

	private Table table;

	private final String COMPLETED_COLUMN = "completed";

	private final String DESCRIPTION_COLUMN = "description";

	private final String TOTAL_COLUMN = "total";

	private final String ERRORS_COLUMN = "errors";

	private final String WARNINGS_COLUMN = "warnings";

	private final String INFORMATIONAL_COLUMN = "infos";

	private final String ENTRIES_COLUMN = "entries";

	private String[] columnNames = new String[] {
			COMPLETED_COLUMN, DESCRIPTION_COLUMN, ENTRIES_COLUMN, TOTAL_COLUMN, ERRORS_COLUMN, WARNINGS_COLUMN,
			INFORMATIONAL_COLUMN };

	class ViewContentProvider implements IStructuredContentProvider {

		public ViewContentProvider() {
			super();

		}

		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {

			ArrayList<Section> sections = (ArrayList<Section>) EcoreUtil.copyAll(cd.getSections());

			Collections.sort(sections, new Comparator<Section>() {

				public int compare(Section arg0, Section arg1) {
					return arg0.getTitle().getText().toUpperCase().compareTo(arg1.getTitle().getText().toUpperCase());
				}
			});

			ArrayList<Object> r = new ArrayList<Object>();

			r.addAll(sections);

			return r.toArray();
		}
	}

	class CountValidations implements ValidationHandler {

		public int getTotal() {
			return errors + warnings + informational;
		}

		public int getErrors() {
			return errors;
		}

		public int getWarnings() {
			return warnings;
		}

		public int getInformational() {
			return informational;
		}

		private int errors = 0;

		private int warnings = 0;

		private int informational = 0;

		public void handleError(Diagnostic diagnostic) {
			errors++;
		}

		public void handleWarning(Diagnostic diagnostic) {
			warnings++;
		}

		public void handleInfo(Diagnostic diagnostic) {
			informational++;
		}

	};

	HashMap<Section, CountValidations> validations = new HashMap<Section, CountValidations>();

	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {

			CountValidations countValidations = null; // new CountValidations();

			if (obj instanceof Section) {

				Section section = (Section) obj;

				if (!validations.containsKey(section)) {

					countValidations = new CountValidations();

					try {
						Diagnostic diagnostic = Diagnostician.INSTANCE.validate(((Section) obj));

						if (diagnostic.getChildren().size() > 0) {
							processDiagnostic(diagnostic, countValidations);
						}
					} catch (Throwable iae) {
						iae.printStackTrace();
					}

					validations.put(section, countValidations);

				}

				countValidations = validations.get(section);

				switch (index) {
					case 0:
						if (countValidations.getErrors() > 0) {
							return "X";
						} else {
							return "";
						}
					case 2:
						return String.format("%d", section.getEntries().size());
					case 3:
						return Integer.toString(countValidations.getTotal());
					case 4:
						return Integer.toString(countValidations.getErrors());
					case 5:
						return Integer.toString(countValidations.getWarnings());
					case 6:
						return Integer.toString(countValidations.getInformational());
					default:
						return ((Section) obj).getTitle().getText().toUpperCase();
				}
			}

			if (index > 0) {
				return "status here";
			}

			return getText(obj);
		}

		@Override
		public Image getImage(Object obj) {
			if (obj instanceof Section) {
				return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ADD);
			}

			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);
		}

		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}
	}

	class NameSorter extends ViewerSorter {

		@Override
		public int compare(Viewer viewer, Object e1, Object e2) {
			if (e1 instanceof String) {
				return -1;
			}

			return super.compare(viewer, e1, e2);
		}
	}

	/**
	 * The constructor.
	 */
	public CDAAnalyzer() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */

	ClinicalDocument cd = null;

	@Override
	public void createPartControl(Composite parent) {

		int style = SWT.SINGLE | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.HIDE_SELECTION;

		table = new Table(parent, style);

		viewer = new TableViewer(table);
		viewer.setUseHashlookup(true);

		viewer.setColumnProperties(columnNames);

		GridData gridData = new GridData(GridData.FILL_BOTH);
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalSpan = 3;
		table.setLayoutData(gridData);

		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		// 1st column with image/checkboxes - NOTE: The SWT.CENTER has no effect!!
		TableColumn column = new TableColumn(table, SWT.CENTER, 0);
		column.setText("!");
		column.setWidth(20);

		column = new TableColumn(table, SWT.LEFT, 1);
		column.setText("Section");
		column.setWidth(400);

		column = new TableColumn(table, SWT.LEFT, 2);
		column.setText("Structured Entries");
		column.setWidth(100);

		column = new TableColumn(table, SWT.CENTER, 3);
		column.setText("Total Issues");
		column.setWidth(80);

		column = new TableColumn(table, SWT.CENTER, 4);
		column.setText("Errors (SHALL)");
		column.setWidth(80);

		column = new TableColumn(table, SWT.CENTER, 5);
		column.setText("Warnings (SHOULD)");
		column.setWidth(80);

		column = new TableColumn(table, SWT.CENTER, 6);
		column.setText("Informational (MAY)");
		column.setWidth(80);

		// Create the cell editors
		CellEditor[] editors = new CellEditor[columnNames.length];

		// Column 1 : Completed (Checkbox)
		editors[0] = new CheckboxCellEditor(table);

		// Column 2 : Description (Free text)
		TextCellEditor textEditor = new TextCellEditor(table, SWT.READ_ONLY);
		((Text) textEditor.getControl()).setTextLimit(60);
		editors[1] = textEditor;

		// // Column 3 : Owner (Combo Box)
		// editors[2] = new ComboBoxCellEditor(table, taskList.getOwners(), SWT.READ_ONLY);

		// Column 4 : Percent complete (Text with digits only)
		textEditor = new TextCellEditor(table);

		editors[3] = textEditor;

		// Assign the cell editors to the viewer
		viewer.setCellEditors(editors);
		;
		// Set the cell modifier for the viewer
		viewer.setCellModifier(new ICellModifier() {

			public boolean canModify(Object element, String property) {

				return false;
			}

			public Object getValue(Object element, String property) {

				return null;
			}

			public void modify(Object element, String property, Object value) {

			}
		});

		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		// viewer.setSorter(new NameSorter());
		viewer.setInput(getSite());

		NarrativeView narrativeView = (NarrativeView) getSite().getPage().findView(
			"org.openhealthtools.mdht.uml.cda.ui.views.narrativeview");
		if (narrativeView != null) {
			narrativeView.addTableListener(table);
		}

		EntriesView entriesView = (EntriesView) getSite().getPage().findView(
			"org.openhealthtools.mdht.uml.cda.ui.views.entriesview");
		if (entriesView != null) {
			entriesView.addTableListener(table);
		}

		ValidationsView validationsView = (ValidationsView) getSite().getPage().findView(
			"org.openhealthtools.mdht.uml.cda.ui.views.validationsview");
		if (validationsView != null) {
			validationsView.addTableListener(table);
		}

	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	@Override
	public void doSave(IProgressMonitor monitor) {

	}

	@Override
	public void doSaveAs() {

	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {

		setSite(site);
		setInput(input);

		if (input instanceof IFileEditorInput) {
			IFileEditorInput fileInput = (IFileEditorInput) input;

			try {
				if (cd == null) {

					cd = CDAUtil.load(new FileInputStream(fileInput.getFile().getLocation().toOSString()));

					setPartName(String.format("Analysis of %s", fileInput.getName()));

					// PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(fileInput,
					// "org.eclipse.wst.xml.ui.internal.tabletree.XMLMultiPageEditorPart");

				}
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (Exception e) {

				e.printStackTrace();
			}

		}

	}

	@Override
	public boolean isDirty() {

		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {

		return false;
	}

	/*******************************/

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class key) {
		if (key.equals(IContentOutlinePage.class)) {

			return getContentOutlinePage();

		} else {
			return super.getAdapter(key);
		}
	}

	/**
	 * This accesses a cached version of the content outliner.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	ContentOutlinePage contentOutlinePage = null;

	org.eclipse.jface.viewers.TreeViewer contentOutlineViewer = null;

	public IContentOutlinePage getContentOutlinePage() {
		if (contentOutlinePage == null) {
			// The content outline is just a tree.
			//
			class MyContentOutlinePage extends ContentOutlinePage {

				GetChildrenSwitch gcs = new GetChildrenSwitch();

				HasChildrenSwitch hcs = new HasChildrenSwitch();

				DataTypeHasChildren dcs = new DataTypeHasChildren();

				DatatypesGetChildrenSwitch dgcs = new DatatypesGetChildrenSwitch();

				@Override
				public void createControl(Composite parent) {
					super.createControl(parent);
					contentOutlineViewer = getTreeViewer();
					contentOutlineViewer.addSelectionChangedListener(this);

					IContentProvider xxx = new ITreeContentProvider() {

						public void dispose() {

						}

						public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
						}

						public Object[] getElements(Object inputElement) {

							ArrayList<Object> elements = new ArrayList<Object>();

							if (inputElement instanceof ClinicalDocument) {
								ClinicalDocument doc = (ClinicalDocument) inputElement;
								elements.addAll(EcoreUtil.copyAll(doc.getRecordTargets()));
								elements.addAll(EcoreUtil.copyAll(doc.getAuthors()));
								elements.add(EcoreUtil.copy(doc.getComponent()));
							}

							return elements.toArray();
						}

						public Object[] getChildren(Object parentElement) {

							if (parentElement instanceof EObject) {
								EObject eObject = (EObject) parentElement;
								if (DatatypesPackage.eNS_URI.equals(eObject.eClass().getEPackage().getNsURI())) {
									return dgcs.doSwitch(eObject).toArray();
								} else {
									return gcs.doSwitch(eObject).toArray();
								}
							} else {
								return null;
							}
						}

						public Object getParent(Object element) {

							return null;
						}

						public boolean hasChildren(Object element) {
							if (element instanceof EObject) {
								EObject eObject = (EObject) element;
								if (DatatypesPackage.eNS_URI.equals(eObject.eClass().getEPackage().getNsURI())) {
									return dcs.doSwitch(eObject);
								} else {
									return hcs.doSwitch((EObject) element);
								}
							} else {
								return false;
							}
						}
					};

					contentOutlineViewer.setContentProvider(xxx);
					IBaseLabelProvider yyy = new ILabelProvider() {

						public void addListener(ILabelProviderListener listener) {

						}

						public void dispose() {

						}

						public boolean isLabelProperty(Object element, String property) {

							return false;
						}

						public void removeListener(ILabelProviderListener listener) {

						}

						public Image getImage(Object element) {

							return null;
						}

						public String getText(Object element) {

							if (element instanceof EObject) {
								EObject eObject = (EObject) element;
								if (eObject.eContainingFeature() != null) {
									return ((EObject) element).eContainingFeature().getName();
								}
								return ((EObject) element).eClass().getName();
							}

							return element.toString();
						}

					};
					contentOutlineViewer.setLabelProvider(yyy);
					contentOutlineViewer.setInput(cd);

				}
			}

			contentOutlinePage = new MyContentOutlinePage();

		}

		return contentOutlinePage;
	}

	@Override
	public void dispose() {

		super.dispose();
	}

	public class DataTypeHasChildren extends DatatypesSwitch<Boolean> {

		@Override
		public Boolean caseII(II object) {
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseCD(CD object) {
			return Boolean.TRUE;
		}

		@Override
		public Boolean defaultCase(EObject object) {
			return Boolean.FALSE;
		}

	}

	public class HasChildrenSwitch extends CDASwitch<Boolean> {

		@Override
		public Boolean caseComponent3(Component3 object) {
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseStructuredBody(StructuredBody object) {
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseClinicalDocument(ClinicalDocument object) {
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseComponent2(Component2 object) {
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRecordTarget(RecordTarget object) {
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseSection(Section object) {
			return Boolean.TRUE;
		}

		@Override
		public Boolean defaultCase(EObject object) {
			return Boolean.FALSE;
		}

		@Override
		public Boolean caseEntry(Entry object) {
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseClinicalStatement(ClinicalStatement object) {
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseEntryRelationship(EntryRelationship object) {
			return Boolean.TRUE;
		}

	}

	public class DatatypesGetChildrenSwitch extends DatatypesSwitch<ArrayList<Object>> {

		@Override
		public ArrayList<Object> caseED(ED object) {

			return super.caseED(object);
		}

		@Override
		public ArrayList<Object> caseCD(CD object) {
			ArrayList<Object> elements = new ArrayList<Object>();

			if (object.getCode() != null) {
				elements.add(object.getCode());
			}
			if (object.getDisplayName() != null) {
				elements.add(object.getDisplayName());
			}
			if (object.getOriginalText() != null) {
				elements.add(object.getOriginalText());
			}
			if (object.getCodeSystemName() != null) {
				elements.add(object.getCodeSystemName());
			}
			if (object.getCodeSystem() != null) {
				elements.add(object.getCodeSystem());
			}
			if (object.getQualifiers() != null) {
				elements.addAll(object.getQualifiers());
			}
			if (object.getTranslations() != null) {
				elements.addAll(object.getTranslations());
			}

			return elements;
		}

		@Override
		public ArrayList<Object> caseII(II object) {
			ArrayList<Object> elements = new ArrayList<Object>();

			if (object.getExtension() != null) {
				elements.add(object.getExtension());
			}

			if (object.getRoot() != null) {
				elements.add(object.getRoot());
			}
			return elements;
		}

		@Override
		public ArrayList<Object> defaultCase(EObject object) {
			return new ArrayList<Object>();
		}
	}

	public class GetChildrenSwitch extends CDASwitch<ArrayList<Object>> {

		@Override
		public ArrayList<Object> caseEntryRelationship(EntryRelationship object) {
			ArrayList<Object> elements = new ArrayList<Object>();

			if (object.getAct() != null) {
				elements.add(EcoreUtil.copy(object.getAct()));
			}

			if (object.getEncounter() != null) {
				elements.add(EcoreUtil.copy(object.getEncounter()));
			}

			if (object.getObservation() != null) {
				elements.add(EcoreUtil.copy(object.getObservation()));
			}

			if (object.getObservationMedia() != null) {
				elements.add(EcoreUtil.copy(object.getObservationMedia()));
			}

			if (object.getOrganizer() != null) {
				elements.add(EcoreUtil.copy(object.getOrganizer()));
			}

			if (object.getProcedure() != null) {
				elements.add(EcoreUtil.copy(object.getProcedure()));
			}

			// if (object.getSource() != null ) {
			// elements.add(EcoreUtil.copy(object.getSource()));
			// }

			if (object.getSubstanceAdministration() != null) {
				elements.add(EcoreUtil.copy(object.getSubstanceAdministration()));
			}

			if (object.getSupply() != null) {
				elements.add(EcoreUtil.copy(object.getSupply()));
			}

			// if (object.getTarget() != null ) {
			// elements.add(EcoreUtil.copy(object.getTarget()));
			// }

			return elements;
		}

		@Override
		public ArrayList<Object> caseAct(Act object) {

			ArrayList<Object> elements = new ArrayList<Object>();

			if (object.getRealmCodes() != null) {
				elements.add(object.getRealmCodes());
			}
			if (object.getTypeId() != null) {
				elements.add(object.getTypeId());
			}
			if (object.getTemplateIds() != null) {
				elements.addAll(object.getTemplateIds());
			}

			if (object.getIds() != null) {
				elements.addAll(object.getIds());
			}

			if (object.getCode() != null) {
				elements.add(object.getCode());
			}
			if (object.getText() != null) {
				elements.add(object.getText());
			}
			if (object.getStatusCode() != null) {
				elements.add(object.getStatusCode());
			}
			if (object.getEffectiveTime() != null) {
				elements.add(object.getEffectiveTime());
			}
			if (object.getPriorityCode() != null) {
				elements.add(object.getPriorityCode());
			}
			if (object.getLanguageCode() != null) {
				elements.add(object.getLanguageCode());
			}
			// if (object.getNullFlavor() != null) {
			// elements.add(object.getNullFlavor());
			// }
			if (object.getClassCode() != null) {
				elements.add(object.getClassCode());
			}
			if (object.getMoodCode() != null) {
				elements.add(object.getMoodCode());
			}
			if (object.getNegationInd() != null) {
				elements.add(object.getNegationInd());
			}
			if (object.getSubject() != null) {
				elements.add(object.getSubject());
			}
			if (object.getSpecimens() != null) {
				elements.addAll(object.getSpecimens());
			}
			if (object.getPerformers() != null) {
				elements.addAll(object.getPerformers());
			}
			if (object.getAuthors() != null) {
				elements.addAll(object.getAuthors());
			}
			if (object.getInformants() != null) {
				elements.addAll(object.getInformants());
			}
			if (object.getParticipants() != null) {
				elements.addAll(object.getParticipants());
			}
			if (object.getReferences() != null) {
				elements.addAll(object.getReferences());
			}
			if (object.getPreconditions() != null) {
				elements.addAll(object.getPreconditions());
			}
			if (object.getEntryRelationships() != null) {
				elements.addAll(object.getEntryRelationships());
			}
			return elements;
		}

		@Override
		public ArrayList<Object> caseEncounter(Encounter object) {
			ArrayList<Object> elements = new ArrayList<Object>();

			if (object.getRealmCodes() != null) {
				elements.add(object.getRealmCodes());
			}
			if (object.getTypeId() != null) {
				elements.add(object.getTypeId());
			}
			if (object.getTemplateIds() != null) {
				elements.addAll(object.getTemplateIds());
			}

			if (object.getIds() != null) {
				elements.addAll(object.getIds());
			}

			if (object.getCode() != null) {
				elements.add(object.getCode());
			}
			if (object.getText() != null) {
				elements.add(object.getText());
			}
			if (object.getStatusCode() != null) {
				elements.add(object.getStatusCode());
			}
			if (object.getEffectiveTime() != null) {
				elements.add(object.getEffectiveTime());
			}
			if (object.getPriorityCode() != null) {
				elements.add(object.getPriorityCode());
			}

			// if (object.getNullFlavor() != null) {
			// elements.add(object.getNullFlavor());
			// }
			if (object.getClassCode() != null) {
				elements.add(object.getClassCode());
			}
			if (object.getMoodCode() != null) {
				elements.add(object.getMoodCode());
			}
			if (object.getNegationInd() != null) {
				elements.add(object.getNegationInd());
			}
			if (object.getSubject() != null) {
				elements.add(object.getSubject());
			}
			if (object.getSpecimens() != null) {
				elements.addAll(object.getSpecimens());
			}
			if (object.getPerformers() != null) {
				elements.addAll(object.getPerformers());
			}
			if (object.getAuthors() != null) {
				elements.addAll(object.getAuthors());
			}
			if (object.getInformants() != null) {
				elements.addAll(object.getInformants());
			}
			if (object.getParticipants() != null) {
				elements.addAll(object.getParticipants());
			}
			if (object.getReferences() != null) {
				elements.addAll(object.getReferences());
			}
			if (object.getPreconditions() != null) {
				elements.addAll(object.getPreconditions());
			}
			if (object.getEntryRelationships() != null) {
				elements.addAll(object.getEntryRelationships());
			}
			return elements;
		}

		@Override
		public ArrayList<Object> caseSupply(Supply object) {
			ArrayList<Object> elements = new ArrayList<Object>();

			if (object.getRealmCodes() != null) {
				elements.add(object.getRealmCodes());
			}
			if (object.getTypeId() != null) {
				elements.add(object.getTypeId());
			}
			if (object.getTemplateIds() != null) {
				elements.addAll(object.getTemplateIds());
			}

			if (object.getIds() != null) {
				elements.addAll(object.getIds());
			}

			if (object.getCode() != null) {
				elements.add(object.getCode());
			}
			if (object.getText() != null) {
				elements.add(object.getText());
			}
			if (object.getStatusCode() != null) {
				elements.add(object.getStatusCode());
			}

			// if (object.getNullFlavor() != null) {
			// elements.add(object.getNullFlavor());
			// }
			if (object.getClassCode() != null) {
				elements.add(object.getClassCode());
			}
			if (object.getMoodCode() != null) {
				elements.add(object.getMoodCode());
			}
			if (object.getNegationInd() != null) {
				elements.add(object.getNegationInd());
			}

			if (object.getSpecimens() != null) {
				elements.addAll(object.getSpecimens());
			}

			if (object.getSubject() != null) {
				elements.add(object.getSubject());
			}
			if (object.getSpecimens() != null) {
				elements.addAll(object.getSpecimens());
			}
			if (object.getPerformers() != null) {
				elements.addAll(object.getPerformers());
			}
			if (object.getAuthors() != null) {
				elements.addAll(object.getAuthors());
			}
			if (object.getInformants() != null) {
				elements.addAll(object.getInformants());
			}
			if (object.getParticipants() != null) {
				elements.addAll(object.getParticipants());
			}
			if (object.getReferences() != null) {
				elements.addAll(object.getReferences());
			}
			if (object.getPreconditions() != null) {
				elements.addAll(object.getPreconditions());
			}
			if (object.getEntryRelationships() != null) {
				elements.addAll(object.getEntryRelationships());
			}
			return elements;
		}

		@Override
		public ArrayList<Object> caseProcedure(Procedure object) {
			ArrayList<Object> elements = new ArrayList<Object>();

			if (object.getRealmCodes() != null) {
				elements.add(object.getRealmCodes());
			}
			if (object.getTypeId() != null) {
				elements.add(object.getTypeId());
			}
			if (object.getTemplateIds() != null) {
				elements.addAll(object.getTemplateIds());
			}

			if (object.getIds() != null) {
				elements.addAll(object.getIds());
			}

			if (object.getCode() != null) {
				elements.add(object.getCode());
			}
			if (object.getText() != null) {
				elements.add(object.getText());
			}
			if (object.getStatusCode() != null) {
				elements.add(object.getStatusCode());
			}

			// if (object.getNullFlavor() != null) {
			// elements.add(object.getNullFlavor());
			// }
			if (object.getClassCode() != null) {
				elements.add(object.getClassCode());
			}
			if (object.getMoodCode() != null) {
				elements.add(object.getMoodCode());
			}
			if (object.getNegationInd() != null) {
				elements.add(object.getNegationInd());
			}

			if (object.getSpecimens() != null) {
				elements.addAll(object.getSpecimens());
			}

			if (object.getSubject() != null) {
				elements.add(object.getSubject());
			}
			if (object.getSpecimens() != null) {
				elements.addAll(object.getSpecimens());
			}
			if (object.getPerformers() != null) {
				elements.addAll(object.getPerformers());
			}
			if (object.getAuthors() != null) {
				elements.addAll(object.getAuthors());
			}
			if (object.getInformants() != null) {
				elements.addAll(object.getInformants());
			}
			if (object.getParticipants() != null) {
				elements.addAll(object.getParticipants());
			}
			if (object.getReferences() != null) {
				elements.addAll(object.getReferences());
			}
			if (object.getPreconditions() != null) {
				elements.addAll(object.getPreconditions());
			}
			if (object.getEntryRelationships() != null) {
				elements.addAll(object.getEntryRelationships());
			}
			return elements;
		}

		@Override
		public ArrayList<Object> caseSubstanceAdministration(SubstanceAdministration object) {
			ArrayList<Object> elements = new ArrayList<Object>();

			if (object.getRealmCodes() != null) {
				elements.add(object.getRealmCodes());
			}
			if (object.getTypeId() != null) {
				elements.add(object.getTypeId());
			}
			if (object.getTemplateIds() != null) {
				elements.addAll(object.getTemplateIds());
			}

			if (object.getIds() != null) {
				elements.addAll(object.getIds());
			}

			if (object.getCode() != null) {
				elements.add(object.getCode());
			}
			if (object.getText() != null) {
				elements.add(object.getText());
			}
			if (object.getStatusCode() != null) {
				elements.add(object.getStatusCode());
			}

			if (object.getPriorityCode() != null) {
				elements.add(object.getPriorityCode());
			}

			// if (object.getNullFlavor() != null) {
			// elements.add(object.getNullFlavor());
			// }
			if (object.getClassCode() != null) {
				elements.add(object.getClassCode());
			}
			if (object.getMoodCode() != null) {
				elements.add(object.getMoodCode());
			}
			if (object.getNegationInd() != null) {
				elements.add(object.getNegationInd());
			}

			if (object.getSpecimens() != null) {
				elements.addAll(object.getSpecimens());
			}

			if (object.getConsumable() != null) {
				elements.add(object.getConsumable());
			}
			if (object.getSubject() != null) {
				elements.add(object.getSubject());
			}
			if (object.getSpecimens() != null) {
				elements.addAll(object.getSpecimens());
			}
			if (object.getPerformers() != null) {
				elements.addAll(object.getPerformers());
			}
			if (object.getAuthors() != null) {
				elements.addAll(object.getAuthors());
			}
			if (object.getInformants() != null) {
				elements.addAll(object.getInformants());
			}
			if (object.getParticipants() != null) {
				elements.addAll(object.getParticipants());
			}
			if (object.getReferences() != null) {
				elements.addAll(object.getReferences());
			}
			if (object.getPreconditions() != null) {
				elements.addAll(object.getPreconditions());
			}
			if (object.getEntryRelationships() != null) {
				elements.addAll(object.getEntryRelationships());
			}
			return elements;
		}

		@Override
		public ArrayList<Object> caseComponent5(Component5 object) {
			return super.caseComponent5(object);
		}

		@Override
		public ArrayList<Object> caseSection(Section object) {
			ArrayList<Object> elements = new ArrayList<Object>();
			elements.addAll(EcoreUtil.copyAll(object.getEntries()));
			return elements;
		}

		@Override
		public ArrayList<Object> caseComponent2(Component2 object) {
			ArrayList<Object> elements = new ArrayList<Object>();
			elements.add(EcoreUtil.copy(object.getStructuredBody()));
			return elements;
		}

		@Override
		public ArrayList<Object> caseRecordTarget(RecordTarget object) {
			ArrayList<Object> elements = new ArrayList<Object>();
			elements.add(EcoreUtil.copy(object.getPatientRole()));
			return elements;
		}

		@Override
		public ArrayList<Object> caseStructuredBody(StructuredBody object) {
			ArrayList<Object> elements = new ArrayList<Object>();
			elements.addAll(EcoreUtil.copyAll(object.getComponents()));
			return elements;
		}

		@Override
		public ArrayList<Object> caseComponent3(Component3 object) {
			ArrayList<Object> elements = new ArrayList<Object>();
			elements.add(EcoreUtil.copy(object.getSection()));
			return elements;
		}

		@Override
		public ArrayList<Object> caseObservation(Observation object) {
			ArrayList<Object> elements = new ArrayList<Object>();

			if (object.getRealmCodes() != null) {
				elements.add(object.getRealmCodes());
			}
			if (object.getTypeId() != null) {
				elements.add(object.getTypeId());
			}
			if (object.getTemplateIds() != null) {
				elements.addAll(object.getTemplateIds());
			}

			if (object.getIds() != null) {
				elements.addAll(object.getIds());
			}

			if (object.getCode() != null) {
				elements.add(object.getCode());
			}
			if (object.getText() != null) {
				elements.add(object.getText());
			}
			if (object.getStatusCode() != null) {
				elements.add(object.getStatusCode());
			}
			if (object.getEffectiveTime() != null) {
				elements.add(object.getEffectiveTime());
			}
			if (object.getPriorityCode() != null) {
				elements.add(object.getPriorityCode());
			}
			if (object.getLanguageCode() != null) {
				elements.add(object.getLanguageCode());
			}
			// if (object.getNullFlavor() != null) {
			// elements.add(object.getNullFlavor());
			// }
			if (object.getClassCode() != null) {
				elements.add(object.getClassCode());
			}
			if (object.getMoodCode() != null) {
				elements.add(object.getMoodCode());
			}
			if (object.getNegationInd() != null) {
				elements.add(object.getNegationInd());
			}
			if (object.getSubject() != null) {
				elements.add(object.getSubject());
			}
			if (object.getSpecimens() != null) {
				elements.addAll(object.getSpecimens());
			}
			if (object.getPerformers() != null) {
				elements.addAll(object.getPerformers());
			}
			if (object.getAuthors() != null) {
				elements.addAll(object.getAuthors());
			}
			if (object.getInformants() != null) {
				elements.addAll(object.getInformants());
			}
			if (object.getParticipants() != null) {
				elements.addAll(object.getParticipants());
			}
			if (object.getReferences() != null) {
				elements.addAll(object.getReferences());
			}
			if (object.getPreconditions() != null) {
				elements.addAll(object.getPreconditions());
			}
			if (object.getEntryRelationships() != null) {
				elements.addAll(object.getEntryRelationships());
			}

			if (object.getReferenceRanges() != null) {
				elements.addAll(object.getReferenceRanges());
			}

			return elements;

		}

		@Override
		public ArrayList<Object> caseEntry(Entry object) {
			ArrayList<Object> elements = new ArrayList<Object>();

			if (object.getAct() != null) {
				elements.add(EcoreUtil.copy(object.getAct()));
			}

			if (object.getEncounter() != null) {
				elements.add(EcoreUtil.copy(object.getEncounter()));
			}

			if (object.getObservation() != null) {
				elements.add(EcoreUtil.copy(object.getObservation()));
			}

			if (object.getObservationMedia() != null) {
				elements.add(EcoreUtil.copy(object.getObservationMedia()));
			}

			if (object.getOrganizer() != null) {
				elements.add(EcoreUtil.copy(object.getOrganizer()));
			}

			if (object.getProcedure() != null) {
				elements.add(EcoreUtil.copy(object.getProcedure()));
			}

			// if (object.getSource() != null ) {
			// elements.add(EcoreUtil.copy(object.getSource()));
			// }

			if (object.getSubstanceAdministration() != null) {
				elements.add(EcoreUtil.copy(object.getSubstanceAdministration()));
			}

			if (object.getSupply() != null) {
				elements.add(EcoreUtil.copy(object.getSupply()));
			}

			// if (object.getTarget() != null ) {
			// elements.add(EcoreUtil.copy(object.getTarget()));
			// }

			return elements;
		}

		@Override
		public ArrayList<Object> defaultCase(EObject object) {
			return new ArrayList<Object>();
		}

	}

}
