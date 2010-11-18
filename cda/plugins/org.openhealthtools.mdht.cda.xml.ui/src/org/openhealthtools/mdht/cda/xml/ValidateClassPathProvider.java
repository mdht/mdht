package org.openhealthtools.mdht.cda.xml;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.StandardClasspathProvider;

public class ValidateClassPathProvider extends StandardClasspathProvider {

	@Override
	public IRuntimeClasspathEntry[] computeUnresolvedClasspath(ILaunchConfiguration configuration) throws CoreException {
		// TODO Auto-generated method stub
		return super.computeUnresolvedClasspath(configuration);
	}

	@Override
	public IRuntimeClasspathEntry[] resolveClasspath(IRuntimeClasspathEntry[] entries, ILaunchConfiguration configuration) throws CoreException {
		// TODO Auto-generated method stub
		return super.resolveClasspath(entries, configuration);
	}

	@Override
	protected IRuntimeClasspathEntry[] recoverRuntimePath(ILaunchConfiguration configuration, String attribute) throws CoreException {
		// TODO Auto-generated method stub
		return super.recoverRuntimePath(configuration, attribute);
	}

}
