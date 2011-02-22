package org.openhealthtools.mdht.uml.cda.ui.internal.provider;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.StandardClasspathProvider;
import org.osgi.framework.Bundle;


public class CDARuntimeClasspathProvider extends StandardClasspathProvider {


	@Override
	public IRuntimeClasspathEntry[] resolveClasspath(
			IRuntimeClasspathEntry[] entries, ILaunchConfiguration configuration)
			throws CoreException {
		
		
		
		Set all = new LinkedHashSet(entries.length);
		for (int i = 0; i < entries.length; i++) {
			IRuntimeClasspathEntry[] resolved =JavaRuntime.resolveRuntimeClasspathEntry(entries[i], configuration);
			for (int j = 0; j < resolved.length; j++) {
				all.add(resolved[j]);
			}
		}
		
		
		Bundle bundle = Platform.getBundle("org.openhealthtools.mdht.uml.cda.core");
		
		IRuntimeClasspathEntry ditapath;
		try {
			ditapath = JavaRuntime.newArchiveRuntimeClasspathEntry(new Path(FileLocator.getBundleFile(bundle).toURI().getRawPath()));
		
		IRuntimeClasspathEntry[] ditapaths = JavaRuntime.resolveRuntimeClasspathEntry(ditapath, configuration);
		
		for (int ii= 0 ; ii < ditapaths.length; ii++)
		{
			all.add(ditapaths[ii]);	
		}
		
		} catch (IOException e) {
		}
		
		return (IRuntimeClasspathEntry[])all.toArray(new IRuntimeClasspathEntry[all.size()]);
	}
	
	

//	public RuntimeClasspathProvider1() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public IRuntimeClasspathEntry[] computeUnresolvedClasspath(
//			ILaunchConfiguration configuration) throws CoreException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public IRuntimeClasspathEntry[] resolveClasspath(
//			IRuntimeClasspathEntry[] entries, ILaunchConfiguration configuration)
//			throws CoreException {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
