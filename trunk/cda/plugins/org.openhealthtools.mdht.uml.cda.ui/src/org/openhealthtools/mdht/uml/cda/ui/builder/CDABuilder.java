package org.openhealthtools.mdht.uml.cda.ui.builder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.ant.launching.IAntLaunchConstants;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModel;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.uml2.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter;

public class CDABuilder extends IncrementalProjectBuilder {

	class CheckForModelChanged implements IResourceDeltaVisitor 
	{
		public boolean hasModelChanged = false;
		
		public boolean visit(IResourceDelta delta) throws CoreException {

			IResource resource = delta.getResource();

			if (delta.getKind() == IResourceDelta.CHANGED && resource.getName().endsWith(".uml") ) {
				hasModelChanged = true;
			}
			
			return true;
			
		}
	}
	
	public static final String BUILDER_ID = "org.openhealthtools.mdht.uml.cda.ui.org.openhealthtools.mdht.uml.cda.builder.id";
	
	@SuppressWarnings("rawtypes") 
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {
		
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		
		IProject modelProject = root.getProject(getProject().getName() +".model");
		
		IProject[] projects = new IProject[]{modelProject};
		
		
		IResourceDelta modelProjectDelta = getDelta(modelProject);
		
		if (modelProjectDelta != null)
		{
			
			CheckForModelChanged cfmc = new CheckForModelChanged();
			
			modelProjectDelta.accept(cfmc);
			
			if (cfmc.hasModelChanged) {
				runTransformation(getProject(), monitor);
				runUML2Ecore(getProject(), monitor);
				runGeneration(getProject(), monitor);				
			}

		}

		return projects ;
	}

	private void runTransformation(IProject project, IProgressMonitor monitor) {
	
		try {

			ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();

			ILaunchConfigurationType type = launchManager.getLaunchConfigurationType(IAntLaunchConstants.ID_ANT_LAUNCH_CONFIGURATION_TYPE);

			IFile transformxml = project.getFile("transform.xml");

			String name = launchManager.generateLaunchConfigurationName(project.getName() + transformxml.getName());

			ILaunchConfigurationWorkingCopy workingCopy = type.newInstance(null, name);

			workingCopy.setAttribute("org.eclipse.ui.externaltools.ATTR_LOCATION", transformxml.getLocation().toOSString());

			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, project.getName());
			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_DEFAULT_CLASSPATH, true);
			workingCopy.setAttribute(IDebugUIConstants.ATTR_CONSOLE_PROCESS, false);
			workingCopy.setAttribute(IDebugUIConstants.ATTR_LAUNCH_IN_BACKGROUND, false);

			ILaunch launch = workingCopy.launch(ILaunchManager.RUN_MODE, null);

			boolean terminated = false;			
			while (!terminated) {
				for (IProcess process : launch.getProcesses()) {
					terminated = process.isTerminated();
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					terminated = true;
				}
			}

		} catch (CoreException e) {
			e.printStackTrace();
		}
		 
	}

	private void runGeneration(IProject project, IProgressMonitor monitor) {
		monitor.subTask("Run Code Generation");
		ResourceSet resourceSet = new ResourceSetImpl();
		URI genmodelFile = getGeneratorModel(project); 
		GenModel genmodel = (GenModel) EcoreUtil.getObjectByType(resourceSet.getResource(genmodelFile, true).getContents(), GenModelPackage.eINSTANCE.getGenModel());
		GeneratorAdapterFactory.Descriptor.Registry.INSTANCE.addDescriptor(GenModelPackage.eNS_URI, GenModelGeneratorAdapterFactory.DESCRIPTOR);
		Generator generator = new Generator();
		generator.setInput(genmodel);
		genmodel.setCanGenerate(true);
		generator.generate(genmodel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, org.eclipse.emf.common.util.BasicMonitor.toMonitor(monitor));		
	}

	private void runUML2Ecore(IProject project, IProgressMonitor monitor) {

		monitor.subTask("Reload Generation Model");

		ResourceSet resourceSet = new ResourceSetImpl();
		URI umlEcoreModelURI = getUMLEcoreModel(project); 
		URI ecoreModelURI = getEcoreModel(project); 
		Resource ecoreModelResource = resourceSet.createResource(ecoreModelURI);
		Resource umlEcoreModelResource = resourceSet.getResource(umlEcoreModelURI, true);
		Package pe = (Package) EcoreUtil.getObjectByType(umlEcoreModelResource.getContents(), UMLPackage.eINSTANCE.getPackage());
		org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter uml2ecoreconverter = new UML2EcoreConverter();
		ArrayList<Package> packages = new ArrayList<Package>();
		packages.add(pe);

		Map<String, String> options = new HashMap<String, String>();

		options.put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES, "PROCESS");
		options.put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__UNION_PROPERTIES, "PROCESS");
		options.put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURES, "PROCESS");
		options.put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES, "PROCESS");
		options.put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__COMMENTS, "PROCESS");
		options.put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE, "PROCESS");
		options.put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS, "PROCESS");
		options.put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS, "PROCESS");
		options.put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES, "PROCESS");
		options.put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__ANNOTATION_DETAILS, "PROCESS");
		options.put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE, "PROCESS");
		options.put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS, "PROCESS");
		options.put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__DERIVED_FEATURES, "IGNORE");
		options.put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__OPERATION_BODIES, "PROCESS");
		options.put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__CAMEL_CASE_NAMES, "IGNORE");
		options.put(org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER, "PROCESS");

		Collection<? extends EObject> epackages = uml2ecoreconverter.convert(packages, options, null, null);

		ecoreModelResource.getContents().addAll(epackages);

		try {

			ecoreModelResource.save(null);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	String modelName = null;

	static final Path model = new Path("model");

	private URI getUMLEcoreModel(IProject project) {
		return getProjectURI(project, "_Ecore.uml");
	}

	private URI getEcoreModel(IProject project)

	{
		return getProjectURI(project, ".ecore");
	}

	private URI getGeneratorModel(IProject project) {
		return getProjectURI(project, ".genmodel");
	}

	private URI getProjectURI(IProject project, String fileExtension) {
		URI uri = null;

		if (project.exists(model)) {

			IFolder folder = project.getFolder(model);

			try {
				for (IResource resource : folder.members()) {
					if (resource.getName().endsWith(fileExtension)) {
						uri = URI.createFileURI(project.getFolder(model).getFile(resource.getName()).getRawLocation().toOSString());
						modelName = resource.getName().split("\\.")[0];
					}
				}
			} catch (CoreException e) {

			}
		}

		return uri;
	}
}
