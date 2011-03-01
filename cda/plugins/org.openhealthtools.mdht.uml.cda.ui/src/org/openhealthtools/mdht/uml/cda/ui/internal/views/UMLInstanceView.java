package org.openhealthtools.mdht.uml.cda.ui.internal.views;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.openhealthtools.mdht.uml.cda.ui.dialogs.PropertyList;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.ui.editors.UMLTableEditor;
import org.openhealthtools.mdht.uml.ui.navigator.UMLDomainNavigatorItem;

public class UMLInstanceView extends ViewPart {

	private static boolean isDirty = false;

	
	static public class PropertyValuePair {
		Property property;
		String value;
		TableViewer tableViewer;
		String propertyName;

		public PropertyValuePair(TableViewer tableViewer, String propertyName, Property property, String value) {
			this.property = property;
			this.tableViewer = tableViewer;
			if (value != null) {
				this.value = value;
			} else {
				this.value = "";
			}
			this.propertyName = propertyName;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Property getProperty() {
			return property;
		}

		public String getPropertyName() {
			return propertyName;
		}

		public void refreshTable() {
			isDirty = true;
			tableViewer.update(this, null);
		}

	}

	public static final String ID = "org.openhealthtools.mdht.uml.cda.ui.instance.view.id";

	private TableViewer viewer;

	private final String PROPERTY_COLUMN = "Property";
	private final String VALUE_COLUMN = "Value";

	private String[] columnNames = new String[] { PROPERTY_COLUMN, VALUE_COLUMN };
	
	

	class ViewContentProvider implements IStructuredContentProvider {

		private void createUMLInstanceModel(final URI instanceURI, final String packageName)
		{
			
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlSelection.getOwner());

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, umlSelection.getName()){

				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {					
					Resource umlInstanceResource = umlSelection.eResource().getResourceSet().createResource(instanceURI);
					Package instancesPackage = UMLFactory.eINSTANCE.createPackage();
					instancesPackage.setName(packageName+" instances");
					umlInstanceResource.getContents().add(instancesPackage);
					
					try {
						umlInstanceResource.save(null);
					} catch (IOException e) {						
						e.printStackTrace();
					}
					
					return Status.OK_STATUS;
				}};
				
				
				try {
					IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
					operation.addContext(commandStack.getDefaultUndoContext());
					commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

				} catch (ExecutionException ee) {
					ee.printStackTrace();
				}
		}
		
		HashMap<String,Package> umlInstancePackages = new HashMap<String,Package>();

		
		private Package getInstancePackage()
		{
			Package instancePackage = null;
			if (umlSelection != null) {
				if (umlSelection.getNearestPackage() != null) {			
					if (umlSelection.getNearestPackage().eResource() !=  null) {
						if (umlSelection.getNearestPackage().eResource().getURI() != null) {			
							
							final String[] segments = umlSelection.getNearestPackage().eResource().getURI().segments();
							IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(segments[1]);
							IFolder folder = project.getFolder("model");
							String instancePath = segments[segments.length-1].replace(".uml", "-instances.uml");
							IFile file = folder.getFile(instancePath);
							final URI instanceURI =	URI.createPlatformResourceURI(file.getFullPath().toOSString(),false);
							
							if (!umlInstancePackages.containsKey(umlSelection.getNearestPackage().getName()) ){
								Resource umlInstanceResource = null; 
	
								if (!file.exists()) {
									createUMLInstanceModel(instanceURI, segments[segments.length-1]);
									
								}
							
								try {
										umlInstanceResource = umlSelection.eResource().getResourceSet().getResource(instanceURI, true);
									} catch (Exception e) {
										umlInstanceResource = umlSelection.eResource().getResourceSet().getResource(instanceURI, false);
									}
									Package umlPackage = (Package) EcoreUtil.getObjectByType(umlInstanceResource.getContents(), UMLPackage.eINSTANCE.getPackage());
									if (umlPackage != null)
									{
										umlInstancePackages.put(umlSelection.getNearestPackage().getName(), umlPackage);
										instancePackage = umlPackage;
									}
							}  else
							{
								instancePackage = umlInstancePackages.get(umlSelection.getNearestPackage().getName());
							}
						} 

				}
			}
				
			}			
			return instancePackage;
		
		}

		

		org.eclipse.uml2.uml.Class umlSelection;

		TableViewer tableViewer;

		List<PropertyValuePair> c = new ArrayList<PropertyValuePair>();

		public ViewContentProvider(TableViewer tableViewer, org.eclipse.uml2.uml.Class umlSelection) {
			this.umlSelection = umlSelection;
			this.tableViewer = tableViewer;
		}

		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {

			if (umlSelection != null && isDirty) {
				isDirty = false;

				TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlSelection.getOwner());

				IUndoableOperation operation = new AbstractEMFOperation(editingDomain, umlSelection.getName() + "Transaction") {

					@Override
					protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
						try {
							org.eclipse.uml2.uml.Package p = getInstancePackage(); //(org.eclipse.uml2.uml.Package) umlSelection.getOwner();

							Collection<NamedElement> currentInstance = org.eclipse.uml2.uml.util.UMLUtil.findNamedElements(umlSelection.eResource().getResourceSet(),
									umlSelection.getQualifiedName(), true, UMLPackage.eINSTANCE.getInstanceSpecification());
							org.eclipse.uml2.uml.InstanceSpecification instanceSpecification = null;
							if (currentInstance.isEmpty()) {

								instanceSpecification = (org.eclipse.uml2.uml.InstanceSpecification) p.createPackagedElement(umlSelection.getName(),
										UMLPackage.eINSTANCE.getInstanceSpecification());

								instanceSpecification.setName(umlSelection.getName());
								instanceSpecification.getClassifiers().add(umlSelection);

							} else {
								instanceSpecification = (org.eclipse.uml2.uml.InstanceSpecification) currentInstance.iterator().next();

								instanceSpecification.getSlots().clear();

							}

							for (PropertyValuePair pvp : c) {
								Slot slot = instanceSpecification.createSlot();
								slot.setDefiningFeature(pvp.getProperty());
								LiteralString ls = (LiteralString) slot.createValue(pvp.getPropertyName(), pvp.getProperty().getType(), UMLPackage.eINSTANCE.getLiteralString());
								ls.setValue(pvp.getValue());
							}

						} catch (RuntimeException re) {
							re.printStackTrace();
						}

						return Status.OK_STATUS;
					}

				};

				try {
					IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
					operation.addContext(commandStack.getDefaultUndoContext());
					commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

				} catch (ExecutionException ee) {
					ee.printStackTrace();
				}

			}

		}

		public Object[] getElements(Object parent) {

			HashMap<String, String> valuesMap = new HashMap<String, String>();
			if (umlSelection != null) {

				if (!umlSelection.equals(umlSelection)) {
					isDirty = false;
				}

				if (umlSelection.eResource() != null && umlSelection.eResource().getResourceSet() != null) {

					Package p = getInstancePackage();
					
			
					NamedElement currentInstance = p.getOwnedMember(umlSelection.getName());
					if (currentInstance instanceof InstanceSpecification) {
						createValuesMap((InstanceSpecification) currentInstance, valuesMap);
					}
					
					
				}

				PropertyList propertyList = new PropertyList((Class) umlSelection);

				for (Property p : propertyList.getAttributes()) {
					if (p.getType() != null && p.getType().getQualifiedName().startsWith("datatypes::") && p.getType() instanceof Class) {
						PropertyList datatypeslist = new PropertyList((Class) p.getType());

						for (Property datatypesProperty : datatypeslist.getAttributes()) {

							String propertyXPath = p.getName() + "." + datatypesProperty.getName();

							String value = "";

							if ("datatypes::ED".equals(datatypesProperty.getType().getQualifiedName())) {
								propertyXPath = propertyXPath + ".mixed";
							} else
								
								if ("datatypes::ADXP".equals(datatypesProperty.getType().getQualifiedName())){
									propertyXPath = propertyXPath + ".mixed";
								}
							
							
							

							if (valuesMap.containsKey(propertyXPath)) {
								value = valuesMap.get(propertyXPath);
							}
							c.add(new PropertyValuePair(tableViewer, propertyXPath, datatypesProperty, value));
						}

					} else {
						String value = "";

						if (valuesMap.containsKey(p.getName())) {
							value = valuesMap.get(p.getName());
						}

						c.add(new PropertyValuePair(tableViewer, p.getName(), p, value));
					}
				}
				return c.toArray();
			} else {
				return new String[] { "" };
			}

		}
	}

	static void createValuesMap(InstanceSpecification instanceSpecification, HashMap<String, String> valuesMap) {
		for (Slot slot : instanceSpecification.getSlots()) {
			for (ValueSpecification vs : slot.getValues()) {
				if (vs instanceof InstanceValue) {
					InstanceValue instanceValue = (InstanceValue) vs;
					createValuesMap(instanceValue.getInstance(), valuesMap);
				} else {
					if (vs instanceof LiteralString) {
						LiteralString literalString = (LiteralString) vs;
						valuesMap.put(vs.getName(), literalString.getValue());
					}

				}
			}
		}

	}

	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			if (obj instanceof PropertyValuePair) {
				PropertyValuePair pvp = (PropertyValuePair) obj;
				if (index == 0) {
					return pvp.getPropertyName();
				} else {
					return pvp.getValue();
				}
			} else {

				return getText(obj);
			}
		}

		public Image getColumnImage(Object obj, int index) {
			return null;
		}

		public Image getImage(Object obj) {
			return null;
		}
	}

	private void createTable(Composite parent) {

		int style = SWT.SINGLE | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.HIDE_SELECTION;

		table = new Table(parent, style);

		GridData gridData = new GridData(GridData.FILL_BOTH);
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalSpan = 3;
		table.setLayoutData(gridData);

		table.setLinesVisible(true);
		table.setHeaderVisible(true);

	
		TableColumn column = new TableColumn(table, SWT.LEFT, 0);
		column.setText("Property");
		column.setWidth(200);

		column = new TableColumn(table, SWT.LEFT, 1);
		column.setText("Value");
		column.setWidth(400);

	}

	private Table table;

	public static class FooExampleTaskList {
	};

	public void createPartControl(Composite parent) {

		CDAUtil.loadPackages();

		createTable(parent);

		viewer = new TableViewer(table);

		viewer.setColumnProperties(columnNames);

		viewer.setContentProvider(new ViewContentProvider(viewer, null));
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setInput(new FooExampleTaskList());

		CellEditor[] editors = new CellEditor[columnNames.length];
		editors[0] = null;
		TextCellEditor textEditor = new TextCellEditor(table);
		((Text) textEditor.getControl()).setTextLimit(60);
		editors[1] = textEditor;
		viewer.setCellEditors(editors);
		viewer.setCellModifier(new PropertyCellModifier(this));

		ISelectionService iss = getSite().getWorkbenchWindow().getSelectionService();

		ISelectionListener aaa = new ISelectionListener() {

			public void selectionChanged(IWorkbenchPart part, ISelection selection) {
				if (part instanceof UMLTableEditor) {
					if (selection instanceof IStructuredSelection) {
						IStructuredSelection iss = (IStructuredSelection) selection;
						if (iss.getFirstElement() instanceof UMLDomainNavigatorItem) {
							UMLDomainNavigatorItem udn = (UMLDomainNavigatorItem) iss.getFirstElement();
							if (udn.getEObject() != null && udn.getEObject() instanceof Class) {
								viewer.setContentProvider(new ViewContentProvider(viewer, (Class) udn.getEObject()));
							}

						}

					}

				}
			}

		};

		iss.addSelectionListener(aaa);
	}

	public void setFocus() {
		viewer.getControl().setFocus();
	}

	public static class PropertyCellModifier implements ICellModifier {

		public PropertyCellModifier(UMLInstanceView tableViewerExample) {
			super();
		}

		public boolean canModify(Object element, String property) {
			return true;
		}

		public Object getValue(Object element, String property) {
			if ("Value".equals(property)) {
				if (element instanceof PropertyValuePair) {
					PropertyValuePair pvp = (PropertyValuePair) element;
					return pvp.getValue();

				}
			}

			return "";
		}

		public void modify(Object element, String property, Object value) {

			if ("Value".equals(property)) {

				TableItem item = (TableItem) element;

				if (item != null && item.getData() instanceof PropertyValuePair) {
					PropertyValuePair pvp = (PropertyValuePair) item.getData();
					pvp.setValue((String) value);

					pvp.refreshTable();

				}
			}

		}
	}

}
