package org.openhealthtools.mdht.uml.cda.ui.builder;

import java.util.Map;

import org.eclipse.ant.launching.IAntLaunchConstants;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModel;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.uml2.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;

public class CDASampleBuilder extends IncrementalProjectBuilder {
	
	public static final String BUILDER_ID = "org.openhealthtools.mdht.uml.cda.ui.CDAsampleBuilder";

	class CheckForModelChanged implements IResourceDeltaVisitor 
	{
		public boolean hasModelChanged = false;
		
		public boolean visit(IResourceDelta delta) throws CoreException {

			IResource resource = delta.getResource();
			
			if (delta.getKind() == IResourceDelta.CHANGED && resource.getName().endsWith(".uml") && !resource.getName().contains("_Ecore") ) {
				hasModelChanged = true;
			}

			return true;
			
		}
	}
	
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {
		
		IResourceDelta delta = getDelta(getProject());

		CheckForModelChanged checkForModelChanged = new CheckForModelChanged();

		if (delta != null) {
			delta.accept(checkForModelChanged);	
			if (checkForModelChanged.hasModelChanged) {
				System.out.println("Model Has Changed");
				runTransformation(getProject(),monitor);
				runGeneration(getProject(),monitor);
			} else	{
				System.out.println("Model Has Not Changed");
			}
		} else	{
			System.out.println("Model Has Not Changed");
		}
		
		return null;
	}
	
	private void runTransformation(IProject project,IProgressMonitor monitor)
	{
		try {
			
			ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
			
			ILaunchConfigurationType type = launchManager.getLaunchConfigurationType(IAntLaunchConstants.ID_ANT_LAUNCH_CONFIGURATION_TYPE);
			
			IFile transformxml = project.getFile("transform.xml");

			String name = launchManager.generateLaunchConfigurationName(project.getName()+transformxml.getName());

			ILaunchConfigurationWorkingCopy workingCopy=type.newInstance(null, name);	
			workingCopy.setAttribute( "org.eclipse.ui.externaltools.ATTR_LOCATION", transformxml.getLocation().toOSString());
			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, project.getName());
			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_DEFAULT_CLASSPATH, true);
			workingCopy.setAttribute(IDebugUIConstants.ATTR_CONSOLE_PROCESS, false);
			workingCopy.setAttribute(IDebugUIConstants.ATTR_LAUNCH_IN_BACKGROUND, false);			
			workingCopy.doSave();

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
	
	private void runGeneration(IProject project,IProgressMonitor monitor)
	{
		monitor.subTask("Run Code Generation");
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		Path model = new Path("model");
		
		if (project.exists(model))
		{
			IFolder folder = project.getFolder(model);		
				try {
					for (IResource resource : folder.members())
					{
						
						if (resource.getName().endsWith(".genmodel") )
						{
							
							
							URI genmodelFile = URI.createFileURI(project.getFolder(model).getFile(resource.getName()).getRawLocation().toOSString());									
							GenModel genmodel = (GenModel ) EcoreUtil.getObjectByType(resourceSet.getResource(genmodelFile, true).getContents(),GenModelPackage.eINSTANCE.getGenModel ());
							GeneratorAdapterFactory.Descriptor.Registry.INSTANCE.addDescriptor (GenModelPackage.eNS_URI, GenModelGeneratorAdapterFactory.DESCRIPTOR);
							Generator generator = new Generator();
							generator.setInput(genmodel);
							genmodel.setCanGenerate(true);
							Diagnostic diagnostic =  generator.generate(genmodel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE,org.eclipse.emf.common.util.BasicMonitor.toMonitor(monitor)); 		
//							diagnostic.
						}
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}			
		}
	}

}
