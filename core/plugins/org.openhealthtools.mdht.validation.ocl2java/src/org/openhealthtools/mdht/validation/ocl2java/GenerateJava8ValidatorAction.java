/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhealthtools.mdht.validation.ocl2java;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.openhealthtools.mdht.transformation.ocl2java.OCL2JavaTransformationForEcore;

public class GenerateJava8ValidatorAction implements IObjectActionDelegate {

	private IStructuredSelection selection;

	public GenerateJava8ValidatorAction() {
		super();
	}

	@Override
	public void run(IAction arg0) {
		Object[] selected = selection.toArray();
		List<String> manuallyAddedPackages = new ArrayList<String>();
		Registry ePackageRegistry = EcoreEnvironmentFactory.INSTANCE.getEPackageRegistry();
		try {
			for (Object element : selected) {
				if (element instanceof GenModel) {
					GenModel genModel = (GenModel) element;
					for (GenPackage genPackage : genModel.getGenPackages()) {
						IFolder src = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(genModel.getModelDirectory()));
						if (!src.exists()) {
							continue;
						}
						String myPackage = genPackage.getQualifiedPackageName();
						String myPackagePath = myPackage.replace(".", "/");

						ResourceSet resourceSet = genPackage.eResource().getResourceSet();
						for (Resource resource : resourceSet.getResources()) {
							if (!resource.getContents().isEmpty() && resource.getContents().get(0) instanceof EPackage) {
								EPackage ePackage = (EPackage) resource.getContents().get(0);
								if (!ePackageRegistry.containsKey(ePackage.getName())) {
									ePackageRegistry.put(ePackage.getName(), ePackage);
									manuallyAddedPackages.add(ePackage.getName());
								}
							}
						}
						OCL2JavaTransformationForEcore trafo = new OCL2JavaTransformationForEcore(resourceSet);

						StringBuilder methods = new StringBuilder();
						for (GenClass genClass : genPackage.getGenClasses()) {
							String myInterface = genClass.getInterfaceName();
							for (GenOperation genop : genClass.getAllGenOperations()) {
								EOperation op = genop.getEcoreOperation();
								if (op != null && op.getEType() != null && "EBoolean".equals(op.getEType().getName())) {
									EAnnotation a = op.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel");
									if (a != null && a.getDetails().get("documentation") != null) {
										String ocl = a.getDetails().get("documentation");
										// methods.append("\t\t" + "@Override\n");
										methods.append("\t\t" + "public boolean validate" + myInterface + "_validate" + op.getName() + "(" + genClass.getQualifiedInterfaceName() + " self, DiagnosticChain diagnostics, Map<Object, Object> context) {\n");
										try {
											String java8 = trafo.transform(op.getEContainingClass(), ocl);
											methods.append("\t\t\t return " + java8 + ";\n");
										} catch (Exception e) {
											methods.append("\t\t\t return self.validate" + op.getName() + "(diagnostics, context);\n");
											methods.append("\t\t\t // Cannot parse OCL: " + ocl.replace("\n", " ").replace("\r", " ") + "\n");
											methods.append("\t\t\t // Exception: " + e.getMessage() + "\n");

										}
										methods.append("\t\t}\n\n");
									}
								}
							}
						}
						InputStream inputStream = new URL("platform:/plugin/" + Activator.PLUGIN_ID + "/resources/Java8Validator.java").openConnection().getInputStream();
						String content = toString(inputStream);
						String originalValidator = genModel.getModelName() + "Validator";
						content = content.replace("%ORIGINAL_VALIDATOR%", originalValidator);
						content = content.replace("%METHODS_GO_HERE%", methods);
						content = content.replace("%PACKAGE_NAME%", myPackage + ".util");
						copyContents(src, content, myPackagePath + "/util/Java8" + originalValidator + ".java");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			ErrorDialog.openError(Display.getCurrent().getActiveShell(), "Error", "Exception occured during Java 8 generation!", status);
		}
		for (String name : manuallyAddedPackages)
			ePackageRegistry.remove(name);
	}

	@Override
	public void selectionChanged(IAction action, ISelection sel) {
		if (sel instanceof IStructuredSelection) {
			selection = (IStructuredSelection) sel;
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * Copy contents to a file.
	 */
	public static IFile copyContents(IFolder folder, String result, String to) throws IOException, CoreException {
		IFile file = folder.getFile(to);
		if (file.getParent() instanceof IFolder)
			createFolder((IFolder) file.getParent(), null);
		if (file.exists()) {
			file.setContents(new ByteArrayInputStream(result.getBytes()), true, false, null);
		} else {
			file.create(new ByteArrayInputStream(result.getBytes()), true, null);
		}
		return file;
	}

	public static void createFolder(IFolder folder, IProgressMonitor monitor) throws CoreException {
		if (!folder.exists()) {
			IContainer parent = folder.getParent();
			if (parent instanceof IFolder) {
				createFolder((IFolder) parent, null);
			}
			folder.create(IResource.NONE, true, monitor);
		}
	}

	public static String toString(InputStream in) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();

		return new String(out.toByteArray(), "UTF-8");
	}

}
