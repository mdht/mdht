package org.openhealthtools.mdht.uml.cda.ui.builder;

import java.util.Map;

import org.eclipse.ant.launching.IAntLaunchConstants;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
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
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModel;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.uml2.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.uml2.uml.ecore.importer.UMLImporter;
import org.openhealthtools.mdht.uml.cda.ui.util.CDAUIUtil;

public class CDABuilder extends IncrementalProjectBuilder {

	class CheckForModelChanged implements IResourceDeltaVisitor {
		public boolean hasModelChanged = false;

		public boolean visit(IResourceDelta delta) throws CoreException {

			IResource resource = delta.getResource();

			if (delta.getKind() == IResourceDelta.CHANGED && resource.getName().endsWith(".uml")) {
				hasModelChanged = true;
			}

			return true;

		}
	}

	public static final String BUILDER_ID = "org.openhealthtools.mdht.uml.cda.ui.org.openhealthtools.mdht.uml.cda.builder.id";

	@SuppressWarnings("rawtypes")
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		IProject modelProject = root.getProject(getProject().getName() + ".model");

		IProject[] projects = new IProject[] { modelProject };

		IResourceDelta modelProjectDelta = getDelta(modelProject);

		if (modelProjectDelta != null) {

			CheckForModelChanged cfmc = new CheckForModelChanged();

			modelProjectDelta.accept(cfmc);

			if (cfmc.hasModelChanged) {			
				runTransformation(getProject(), monitor);
				runUML2Importer(getProject(), monitor);
				runGeneration(getProject(), monitor);
			}

		}

		return projects;
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
		URI genmodelFile = CDAUIUtil.getGeneratorModel(project);
		GenModel genmodel = (GenModel) EcoreUtil.getObjectByType(resourceSet.getResource(genmodelFile, true).getContents(), GenModelPackage.eINSTANCE.getGenModel());
		GeneratorAdapterFactory.Descriptor.Registry.INSTANCE.addDescriptor(GenModelPackage.eNS_URI, GenModelGeneratorAdapterFactory.DESCRIPTOR);
		Generator generator = new Generator();
		generator.setInput(genmodel);
		genmodel.setCanGenerate(true);
		generator.generate(genmodel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, org.eclipse.emf.common.util.BasicMonitor.toMonitor(monitor));
	}

	private void runUML2Importer(IProject project, IProgressMonitor monitor) {

		UMLImporter umlImporter = new UMLImporter();

		try {
			org.eclipse.emf.common.util.Monitor umlImportMonitor = BasicMonitor.toMonitor(monitor);
			umlImporter.setGenModelProjectLocation(project.getFullPath());
			umlImporter.defineOriginalGenModelPath(CDAUIUtil.getGeneratorModelFile(project));
			umlImporter.computeEPackages(umlImportMonitor);
			
			for (EPackage ePackage : umlImporter.getEPackages())
			{
				EcoreUtil.resolveAll(ePackage);				
			}
			
			umlImporter.prepareGenModelAndEPackages(umlImportMonitor);
			umlImporter.saveGenModelAndEPackages(umlImportMonitor);
		} catch (Exception e) {
	
		}

	}
}
