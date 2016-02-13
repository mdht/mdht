/*******************************************************************************
 * Copyright (c) 2010 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.term.ui.actions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.mdht.uml.common.ui.search.IElementFilter;
import org.eclipse.mdht.uml.common.ui.search.ModelSearch;
import org.eclipse.mdht.uml.term.core.profile.BindingKind;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemVersion;
import org.eclipse.mdht.uml.term.core.profile.ValueSetCode;
import org.eclipse.mdht.uml.term.core.profile.ValueSetVersion;
import org.eclipse.mdht.uml.term.core.util.ITermProfileConstants;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.ObjectPluginAction;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

@SuppressWarnings("restriction")
public class ImportTerminologyAction implements IObjectActionDelegate {

	private static final String[] FILTER_NAMES = { "PHIN VADS Code Set Archive (*.zip)", "All Files (*.*)" };

	// These filter extensions are used to filter which files are displayed.
	private static final String[] FILTER_EXTS = { "*.zip", "*.*" };

	private Shell shell;

	public ImportTerminologyAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(shell);

		ObjectPluginAction opa = (ObjectPluginAction) action;

		final TreeSelection selection = (TreeSelection) opa.getSelection();

		final String ActionTitle = "Import Terminology";

		final FileDialog fdlg = new FileDialog(shell, SWT.SINGLE);

		fdlg.setText("Select Terminology Source File");

		fdlg.setFilterNames(FILTER_NAMES);
		fdlg.setFilterExtensions(FILTER_EXTS);

		IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

				IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

				File f = (File) selection.getFirstElement();

				String umlPath = myWorkspaceRoot.getLocation().toOSString() + f.getFullPath().toOSString();

				try {
					importTerminlogy(monitor, umlPath, fdlg);
				} catch (Exception e) {
					e.printStackTrace();
				}

				try {
					myWorkspaceRoot.refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (CoreException e) {
				}

				if (monitor.isCanceled()) {
					monitor.done();
					return;
				}

				monitor.done();

			}

		};

		try {
			if (fdlg.open() != null) {
				progressDialog.run(false, true, runnableWithProgress);
				UMLModelMetricsDialog dlg = new UMLModelMetricsDialog(shell);
				dlg.create();
				dlg.open();
			}

		} catch (InvocationTargetException invocationTargetException) {
			MessageDialog.openError(
				shell, ActionTitle, "Error Processing Export " + invocationTargetException.getMessage());

		} catch (InterruptedException interruptedException) {
			MessageDialog.openError(shell, ActionTitle, "Error Processing Export " + interruptedException.getMessage());

		} finally {
			progressDialog.close();

		}
	}

	/**
	 * umlPackage is cache used to support dialog content after qvt
	 * transformation is completed
	 */
	Package umlPackage = null;

	Package codeSystemPackage = null;

	ResourceSet resourceSet = null;

	// Needs to be a preference at some point
	static final int MAXCODES = 400;

	int codeSystemsCreated;

	int valueSetsCreated;

	int valueSetsUpdated;

	int codesCreated;

	int codesUpdated;

	int valueSetsAboveMaxCode;

	private String popCleanValue(String values[], int index) {

		String result = "";

		if (index < values.length) {
			if (values[index] != null) {
				result = values[index].replaceAll("[^!-~]", " ");
			}
		}

		return result;
	}

	public void importTerminlogy(IProgressMonitor monitor, String umlPath, FileDialog fdlg) {

		// Load the uml model from the workspace

		codeSystemsCreated = 0;
		valueSetsCreated = 0;
		valueSetsUpdated = 0;
		codesCreated = 0;
		codesUpdated = 0;

		valueSetsAboveMaxCode = 0;

		resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.FALSE);
		resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.FALSE);

		URI umlModelURI = URI.createFileURI(umlPath);

		umlPackage = (Package) EcoreUtil.getObjectByType(
			resourceSet.getResource(umlModelURI, true).getContents(), UMLPackage.Literals.PACKAGE);

		codeSystemPackage = null;

		// This should be a preference but for now select an imported package
		// with CodeSystems
		for (Package p : umlPackage.getImportedPackages()) {
			if (p.getName().contains("CodeSystems")) {
				codeSystemPackage = (Package) EcoreUtil.getObjectByType(
					resourceSet.getResource(p.eResource().getURI(), true).getContents(), UMLPackage.Literals.PACKAGE);
				break;
			}

		}

		Profile ctsProfile = TermProfileUtil.getTerminologyProfile(umlPackage.eResource().getResourceSet());

		final Stereotype valueSetVersionStereotype = (Stereotype) ctsProfile.getOwnedType(
			ITermProfileConstants.VALUE_SET_VERSION);

		String[] files = fdlg.getFileNames();

		for (int i = 0, n = files.length; i < n; i++) {

			BufferedReader br;

			ZipFile zipFile = null;
			try {
				zipFile = new ZipFile(fdlg.getFilterPath() + System.getProperty("file.separator") + files[i]);
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			java.util.Enumeration<? extends ZipEntry> ze = zipFile.entries();

			int zipFileEntryCount = 0;
			while (ze.hasMoreElements()) {
				ze.nextElement();
				zipFileEntryCount++;

			}

			monitor.beginTask("MDHT Terminology Import", zipFileEntryCount);

			ze = zipFile.entries();

			while (ze.hasMoreElements()) {

				Enumeration valueSet = null;

				ArrayList<String> valueSetCodes = new ArrayList<String>();

				ZipEntry z = ze.nextElement();

				if (z.getName() != null && !z.getName().endsWith("txt")) {
					continue;
				}

				monitor.subTask("Importing " + z.getName());

				try {

					br = new BufferedReader(new InputStreamReader(zipFile.getInputStream(z), "UTF-8"));

					int lineCtr = 0;
					String thisLine;

					String header[] = null;

					while ((thisLine = br.readLine()) != null) {

						String[] result = thisLine.split("\t");

						if (lineCtr == 0) {

							header = thisLine.split("\t");

							if (!"Value Set Name".equals(header[0])) {
								break; // Not a value set
							}
						}

						if (lineCtr == 1) {

							final String valueSetID = popCleanValue(result, 2);

							IElementFilter filter = new IElementFilter() {
								public boolean accept(Element element) {
									return (element instanceof Enumeration) &&
											element.isStereotypeApplied(valueSetVersionStereotype) && valueSetID.equals(
												element.getValue(valueSetVersionStereotype, "identifier"));
								}
							};

							List<Element> typeList = ModelSearch.findAllOf(
								umlPackage.eResource().getResourceSet(), filter);

							// Are we updating/refreshing or adding new value
							// set using id
							if (!typeList.isEmpty()) {

								valueSetsUpdated++;

								valueSet = (Enumeration) typeList.get(0);

								Object[] els = valueSet.getOwnedLiterals().toArray();

								for (int ectr = 0; ectr < els.length; ectr++) {
									EnumerationLiteral ee = (EnumerationLiteral) els[ectr];
									ee.destroy();
								}

								valueSet.getOwnedLiterals().removeAll(valueSet.getOwnedLiterals());

							} else {
								valueSet = UMLFactory.eINSTANCE.createEnumeration();
								umlPackage.getOwnedTypes().add(valueSet);
								TermProfileUtil.applyStereotype(valueSet, ITermProfileConstants.VALUE_SET_VERSION);
								valueSetsCreated++;
							}

							// There is no standard for the date/revision at
							// this point so we always update; user is running
							// update for a reason

							// Set/Reset the values
							ValueSetVersion vsv = (ValueSetVersion) valueSet.getStereotypeApplication(
								valueSetVersionStereotype);

							valueSet.setName(popCleanValue(result, 0));

							vsv.setFullName(popCleanValue(result, 0));

							vsv.setIdentifier(valueSetID);

							vsv.setVersion(popCleanValue(result, 3));

							vsv.setDefinition(popCleanValue(result, 4));

							vsv.setRevisionDate(popCleanValue(result, 6));

							vsv.setBinding(BindingKind.STATIC);

						}

						if (lineCtr > 3) {
							valueSetCodes.add(thisLine);

						}

						lineCtr++;

						// if (lineCtr >= MAXCODES) {
						// break;
						// }

					} // end while

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				if (valueSet == null) {
					continue;
				}

				ValueSetVersion valueSetVersion = TermProfileUtil.getValueSetVersion(valueSet);

				if (valueSetCodes.size() > 1) {

					String[] valuSetCodeResult = valueSetCodes.get(0).split("\t");

					Enumeration codeSystemEnumeration = (Enumeration) getCodeSystem(umlPackage, valuSetCodeResult);

					final Stereotype codeSystemStereotype = TermProfileUtil.getAppliedStereotype(
						codeSystemEnumeration, ITermProfileConstants.CODE_SYSTEM_VERSION);

					final CodeSystemVersion codeSystem = (CodeSystemVersion) codeSystemEnumeration.getStereotypeApplication(
						codeSystemStereotype);

					valueSetVersion.setCodeSystem(codeSystem);

				}

				if (valueSetCodes.size() <= MAXCODES) {

					for (String line : valueSetCodes) {

						String[] valuSetCodeResult = line.split("\t");

						EnumerationLiteral valueSetCode = UMLFactory.eINSTANCE.createEnumerationLiteral();

						valueSetCode.setName(popCleanValue(valuSetCodeResult, 0));

						valueSet.getOwnedLiterals().add(valueSetCode);

						Stereotype valueSetStereotype = TermProfileUtil.applyStereotype(
							valueSetCode, ITermProfileConstants.VALUE_SET_CODE);

						ValueSetCode vcs = (ValueSetCode) valueSetCode.getStereotypeApplication(valueSetStereotype);

						if (valueSetStereotype != null) {

							vcs.setConceptName(popCleanValue(valuSetCodeResult, 2));

							vcs.setUsageNote(popCleanValue(valuSetCodeResult, 5));

							String id = popCleanValue(valuSetCodeResult, 4);

							if (valueSetVersion != null && valueSetVersion.getCodeSystem() != null &&
									!id.equals(valueSetVersion.getCodeSystem().getIdentifier())) {

								Enumeration codeSystemEnumeration = (Enumeration) getCodeSystem(
									umlPackage, valuSetCodeResult);

								final Stereotype codeSystemStereotype = TermProfileUtil.getAppliedStereotype(
									codeSystemEnumeration, ITermProfileConstants.CODE_SYSTEM_VERSION);

								final CodeSystemVersion codeSystem = (CodeSystemVersion) codeSystemEnumeration.getStereotypeApplication(
									codeSystemStereotype);

								vcs.setCodeSystem(codeSystem);

							}
						}
					}

					monitor.worked(1);
				} else {
					valueSetsAboveMaxCode++;
				}

			}
		}

		Map<String, String> options = new HashMap<String, String>();
		try {
			umlPackage.eResource().save(options);

			if (codeSystemPackage != null) {
				codeSystemPackage.eResource().save(options);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private Element getCodeSystem(Package umlPackage, String[] valuSetCodeResult) {

		final String codeSystemID = popCleanValue(valuSetCodeResult, 4);

		Profile ctsProfile = TermProfileUtil.getTerminologyProfile(umlPackage.eResource().getResourceSet());

		Enumeration codeSystemEnumeration = null;

		final Stereotype codeSystemVersionStereotype = (Stereotype) ctsProfile.getOwnedType(
			ITermProfileConstants.CODE_SYSTEM_VERSION);

		IElementFilter filter = new IElementFilter() {
			public boolean accept(Element element) {
				return (element instanceof Enumeration) && element.isStereotypeApplied(codeSystemVersionStereotype) &&
						codeSystemID.equals(element.getValue(codeSystemVersionStereotype, "identifier"));
			}
		};

		for (Package p : umlPackage.getImportedPackages()) {

			List<Element> typeList = ModelSearch.findAllOf(p.eResource().getResourceSet(), filter);

			if (!typeList.isEmpty()) {

				codeSystemEnumeration = (Enumeration) typeList.get(0);
				if (codeSystemPackage == null) {
					codeSystemPackage = (Package) EcoreUtil.getObjectByType(
						resourceSet.getResource(p.eResource().getURI(), true).getContents(),
						UMLPackage.Literals.PACKAGE);

				}
			}
		}

		if (codeSystemEnumeration == null) {
			List<Element> typeList = ModelSearch.findAllOf(umlPackage.eResource().getResourceSet(), filter);

			if (!typeList.isEmpty()) {
				codeSystemEnumeration = (Enumeration) typeList.get(0);
			}

		}

		if (codeSystemEnumeration == null) {

			codeSystemsCreated++;

			codeSystemEnumeration = UMLFactory.eINSTANCE.createEnumeration();

			codeSystemEnumeration.setName(popCleanValue(valuSetCodeResult, 5));

			if (codeSystemPackage != null) {
				codeSystemPackage.getOwnedTypes().add(codeSystemEnumeration);
			} else {
				umlPackage.getOwnedTypes().add(codeSystemEnumeration);
			}
			Stereotype stereotype = TermProfileUtil.applyStereotype(
				codeSystemEnumeration, ITermProfileConstants.CODE_SYSTEM_VERSION);

			CodeSystemVersion codeSystem = (CodeSystemVersion) codeSystemEnumeration.getStereotypeApplication(
				stereotype);

			codeSystem.setIdentifier(codeSystemID);

			codeSystem.setVersion(popCleanValue(valuSetCodeResult, 7));

			codeSystem.setSource(popCleanValue(valuSetCodeResult, 8));

		}

		return codeSystemEnumeration;

	}

	public void selectionChanged(IAction action, ISelection selection) {

	}

	/**
	 * UMLModelMetricsDialog displays the results from the qvt transformation
	 * Give them something to look at insted of just an okay button
	 *
	 * @author seanmuir
	 *
	 */
	public class UMLModelMetricsDialog extends TitleAreaDialog {

		public static final int OPEN = 9999;

		public static final int DELETE = 9998;

		org.eclipse.swt.widgets.Table table;

		public UMLModelMetricsDialog(Shell shell) {
			super(shell);

		}

		@Override
		public void create() {
			super.create();
			setTitle("HL7 DSL to UML");
			if (umlPackage != null) {
				setMessage("UML Model Metrics for " + umlPackage.getName());
			}

		}

		@Override
		protected Control createDialogArea(Composite parent) {

			final Composite area = new Composite(parent, SWT.NULL);

			final GridLayout gridLayout = new GridLayout();
			gridLayout.marginWidth = 15;
			gridLayout.marginHeight = 10;
			area.setLayout(gridLayout);

			table = new org.eclipse.swt.widgets.Table(area, SWT.BORDER);

			final GridData gridData = new GridData();
			gridData.widthHint = 500;
			table.setLayoutData(gridData);

			table.setHeaderVisible(true);
			final TableColumn column1 = new TableColumn(table, SWT.LEFT);

			final TableColumn column2 = new TableColumn(table, SWT.CENTER);

			column1.setText("Vocabulary Import Metrics");
			column2.setText("Result");

			column1.setWidth(250);
			column2.setWidth(250);

			if (umlPackage != null) {

				final TableItem valueSetsCreatedItem = new TableItem(table, SWT.NONE);
				valueSetsCreatedItem.setText(new String[] { "Value Sets Created", String.valueOf(valueSetsCreated) });

				final TableItem valueSetsUpdatedItem = new TableItem(table, SWT.NONE);
				valueSetsUpdatedItem.setText(new String[] { "Value Sets Updated", String.valueOf(valueSetsUpdated) });

				final TableItem valueSetsAboveMax = new TableItem(table, SWT.NONE);
				valueSetsAboveMax.setText(
					new String[] { "Value Sets Codes too Large", String.valueOf(valueSetsAboveMaxCode) });

				final TableItem codeSystemsCreatedItem = new TableItem(table, SWT.NONE);
				codeSystemsCreatedItem.setText(
					new String[] { "New Code Systems Defined", String.valueOf(codeSystemsCreated) });

			}

			return area;
		}

		@Override
		protected void createButtonsForButtonBar(Composite parent) {

			Button okButton = createButton(parent, OK, "Ok", false);

			okButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					setReturnCode(OK);
					close();
				}
			});
		}

	}

	public class TerminologyMetricsDialog extends TitleAreaDialog {

		public static final int OPEN = 9999;

		public static final int DELETE = 9998;

		org.eclipse.swt.widgets.Text textWidget;

		public TerminologyMetricsDialog(Shell shell) {
			super(shell);

		}

		@Override
		public void create() {
			super.create();
			setTitle("Model Driven Health Tools");
			if (umlPackage != null) {
				setMessage("Terminology Import Metrics for " + umlPackage.getName());
			}

		}

		@Override
		protected Control createDialogArea(Composite parent) {

			final Composite area = new Composite(parent, SWT.NULL);

			final GridLayout gridLayout = new GridLayout();

			area.setLayout(gridLayout);

			textWidget = new org.eclipse.swt.widgets.Text(area, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);

			final GridData gridData = new GridData();
			gridData.heightHint = 200;
			textWidget.setLayoutData(gridData);
			return area;
		}

		@Override
		protected void createButtonsForButtonBar(Composite parent) {

			Button okButton = createButton(parent, OK, "Ok", false);

			okButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					setReturnCode(OK);
					close();
				}
			});
		}

	}

}
