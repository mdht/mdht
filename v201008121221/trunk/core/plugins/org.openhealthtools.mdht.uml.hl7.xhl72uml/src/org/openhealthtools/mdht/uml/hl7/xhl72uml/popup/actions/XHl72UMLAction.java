package org.openhealthtools.mdht.uml.hl7.xhl72uml.popup.actions;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper.ModelExtent;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper.TransfExecutionResult;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.ObjectPluginAction;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.openhealthtools.hl7.smd.core.model.hl7metamodel.staticmetamodel.HL7StaticModel;
import org.openhealthtools.hl7.smd.core.model.hl7metamodel.staticmetamodel.StaticmetamodelFactory;
import org.openhealthtools.mdht.uml.hdf.util.HL7Resource;
import org.openhealthtools.mdht.uml.hl7.core.util.DatatypeConstants;
import org.openhealthtools.mdht.uml.hl7.xhl72uml.Activator;

@SuppressWarnings("restriction")
public class XHl72UMLAction implements IObjectActionDelegate {

	private Shell shell;

	public XHl72UMLAction() {
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

		final String ActionTitle = "xHL7 to UML";

		IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

				monitor.beginTask("Model Driven Health Tools ", 5);

				monitor.setTaskName(ActionTitle);

				monitor.subTask("Open UML File");
				monitor.worked(1);

				IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

				File f = (File) selection.getFirstElement();

				String hl7Path = myWorkspaceRoot.getLocation().toOSString() + f.getFullPath().toOSString();

				String umlPath = hl7Path + ".uml";

				monitor.worked(2);
				monitor.subTask("Execute QVT Transformation");
				xhl72uml(hl7Path, umlPath);
				monitor.subTask("Refresh Workspace");
				monitor.worked(2);

				try {
					myWorkspaceRoot.refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (CoreException e) {
					// Ignore Exception
				}

				if (monitor.isCanceled()) {
					monitor.done();
					return;
				}

				monitor.done();

			}

		};

		try {
			progressDialog.run(false, true, runnableWithProgress);
			UMLModelMetricsDialog dlg = new UMLModelMetricsDialog(shell);
			dlg.create();
			dlg.open();

		} catch (InvocationTargetException invocationTargetException) {
			MessageDialog.openError(shell, ActionTitle, "Error Processing Export " + invocationTargetException.getMessage());

		} catch (InterruptedException interruptedException) {
			MessageDialog.openError(shell, ActionTitle, "Error Processing Export " + interruptedException.getMessage());

		} finally {
			progressDialog.close();

		}
	}

	
	/**
	 * umlPackage is cache used to support dialog content after qvt transformation is completed
	 */
	Package umlPackage = null;

	/**
	 * qvtlog is cache used to support dialog content after qvt transformation is completed
	 */
	String qvtlog = null;

	/**
	 * xhl72uml fires off qvt transformation
	 * @param xhl7Path
	 * @param umlPath
	 */
	public void xhl72uml(String xhl7Path, String umlPath) {

		// Create the URI's for all the moving parts
		URI transformationURI = URI.createPlatformPluginURI(Activator.PLUGIN_ID + "/transforms/xhl72uml.qvto", false);

		URI hl7ModelURI = URI.createFileURI(xhl7Path);

		URI umlModelURI = URI.createFileURI(umlPath);

		URI hdfProfileURI = URI.createURI(HL7Resource.HDF_PROFILE_URI, true);

		URI rimProfileURI = URI.createURI(HL7Resource.RIM_PROFILE_URI, true);

		URI hl7UMLDataTypeModel = URI.createURI(DatatypeConstants.HL7_DATATYPES_1_0_LIBRARY_URI);

		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getLoadOptions().put(XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

		resourceSet.getLoadOptions().put(XMIResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.FALSE);

		resourceSet.getLoadOptions().put(XMIResource.OPTION_DEFER_ATTACHMENT, Boolean.FALSE);

		// Create the UML model target
		Resource umlResource = UML22UMLResource.Factory.INSTANCE.createResource(umlModelURI);

		// Load the xlh7 model from the workspace
		HL7StaticModel staticModel = (HL7StaticModel) EcoreUtil.getObjectByType(resourceSet.getResource(hl7ModelURI, true).getContents(),
				StaticmetamodelFactory.eINSTANCE.createHL7StaticModel().eClass());

		// Load the mdht uml profiles from the plugin
		Profile hdfProfile = (Profile) EcoreUtil.getObjectByType(resourceSet.getResource(hdfProfileURI, true).getContents(), UMLPackage.eINSTANCE.getProfile());

		Profile rimProfile = (Profile) EcoreUtil.getObjectByType(resourceSet.getResource(rimProfileURI, true).getContents(), UMLPackage.eINSTANCE.getProfile());

		// Load the mdht uml data types library for hl7
		Package datatypesLibrary = (Package) EcoreUtil.getObjectByType(resourceSet.getResource(hl7UMLDataTypeModel, true).getContents(), UMLPackage.eINSTANCE
				.getPackage());

		// Create the qvt transform executer
		EList<EObject> inModels = new BasicEList<EObject>();

		inModels.add(staticModel);

		inModels.add(datatypesLibrary);

		inModels.add(hdfProfile);

		inModels.add(rimProfile);

		QvtoTransformationHelper helper = new QvtoTransformationHelper(transformationURI);

		TransfExecutionResult result = null;
		try {

			result = helper.executeTransformation(inModels, Collections.<String, Object> emptyMap(), null);

			List<ModelExtent> mes = result.getOutModelExtents();

			qvtlog = result.getConsoleOutput();

			for (ModelExtent me : mes) {
				for (EObject eo : me.getAllRootElements()) {
					if (eo instanceof Package && umlPackage == null) {
						umlPackage = (Package) eo;
					}

					umlResource.getContents().add(eo);
				}

			}

			Map<String, String> options = new HashMap<String, String>();

			umlResource.save(options);

		} catch (CoreException e) {
			MessageDialog.openInformation(shell, "org.openhealthtools.mdht.uml.hl7.xhl72uml", "XHl72UMLAction CoreException " + e.getLocalizedMessage());

			if (result != null) {
				MessageDialog.openInformation(shell, "org.openhealthtools.mdht.uml.hl7.xhl72uml", "Console Output is " + result.getConsoleOutput());
			}
		} catch (IOException e) {
			MessageDialog.openInformation(shell, "org.openhealthtools.mdht.uml.hl7.xhl72uml", "XHl72UMLAction IOException " + e.getLocalizedMessage());
			if (result != null) {
				MessageDialog.openInformation(shell, "org.openhealthtools.mdht.uml.hl7.xhl72uml", "Console Output is " + result.getConsoleOutput());
			}
		}

	}

	public void selectionChanged(IAction action, ISelection selection) {

	

	}



	/**
	 * UMLModelMetricsDialog displays the results from the qvt transformation
	 * Give them something to look at insted of just an okay button
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

		public void create() {
			super.create();
			setTitle("HL7 DSL to UML");
			if (umlPackage  != null) {
				setMessage("UML Model Metrics for " + umlPackage.getName());
			}

		}

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

			column1.setText("UML Metrics");
			column2.setText("Result");

			column1.setWidth(250);
			column2.setWidth(250);

			if (umlPackage != null) {

				final TableItem elements = new TableItem(table, SWT.NONE);
				elements.setText(new String[] { "UML Element(s)", String.valueOf(umlPackage .getOwnedElements().size()) });

				int i = 0;
				for (Element e : umlPackage .getOwnedElements()) {
					i += e.getOwnedElements().size();
				}

				final TableItem attributes = new TableItem(table, SWT.NONE);
				attributes.setText(new String[] { "UML Attribute(s)", String.valueOf(i) });

				final TableItem profiles = new TableItem(table, SWT.NONE);
				profiles.setText(new String[] { "UML Profiles(s)", String.valueOf(umlPackage.getAllAppliedProfiles().size()) });

				final TableItem imports = new TableItem(table, SWT.NONE);
				imports.setText(new String[] { "UML Imported Package(s) ", String.valueOf(umlPackage.getImportedPackages().size()) });

			}

			return area;
		}

		protected void createButtonsForButtonBar(Composite parent) {

			Button openButton = createButton(parent, OPEN, "Open QVT Log", true);

			openButton.setEnabled(true);

			openButton.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					UMLQVTLogDialog dlg = new UMLQVTLogDialog(shell);
					dlg.create();
					dlg.open();
				}
			});

			Button okButton = createButton(parent, OK, "Ok", false);

			okButton.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					setReturnCode(OK);
					close();
				}
			});
		}

	}

	/**
	 * UMLQVTLogDialog dumps the qvt console results to a text widget to allow browsing
	 * @author seanmuir
	 *
	 */
	public class UMLQVTLogDialog extends TitleAreaDialog {

		public static final int OPEN = 9999;

		public static final int DELETE = 9998;

		org.eclipse.swt.widgets.Text textWidget;

		public UMLQVTLogDialog(Shell shell) {
			super(shell);

		}

		public void create() {
			super.create();
			setTitle("HL7 DSL to UML");
			if (umlPackage  != null) {
				setMessage("UML Model Metrics for " + umlPackage.getName());
			}

		}

		protected Control createDialogArea(Composite parent) {

			final Composite area = new Composite(parent, SWT.NULL);

			final GridLayout gridLayout = new GridLayout();

			area.setLayout(gridLayout);

			textWidget = new org.eclipse.swt.widgets.Text(area, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);

			final GridData gridData = new GridData();
			gridData.heightHint = 200;
			textWidget.setLayoutData(gridData);
			textWidget.setText(qvtlog);

			return area;
		}

		protected void createButtonsForButtonBar(Composite parent) {

			Button okButton = createButton(parent, OK, "Ok", false);

			okButton.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					setReturnCode(OK);
					close();
				}
			});
		}

	}

}
