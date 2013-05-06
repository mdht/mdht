package org.openhealthtools.mdht.cts2.cache;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryDirectory;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary;

public class CTS2Service {
	private String serviceName;

	private String servicePath;

	public CTS2Service(String serviceName, String servicePath) {
		this.serviceName = serviceName;
		this.servicePath = servicePath;

		assert (serviceName != null);
		assert (servicePath != null);
	}

	public String getServiceName() {
		return serviceName;
	}

	public String getServicePath() {
		return servicePath;
	}

	public static String getAuthenticationParams() {
		return "&bypass=1";
	}

	public String getRootConceptURI() {
		return null;
	}

	/**
	 * Returns an empty list if service fails.
	 * TODO throw exception on failure
	 * 
	 * @return
	 */
	public List<CodeSystemCatalogEntrySummary> getCodeSystems() {
		Resource resource = CTS2Cache.INSTANCE.getResource(URI.createURI(servicePath + "/codesystems?maxtoreturn=1000" +
				getAuthenticationParams()));
		if (resource != null && resource.getContents().size() > 0) {
			EObject eObject = resource.getContents().get(0);
			if (eObject instanceof org.openhealthtools.mdht.cts2.codesystem.DocumentRoot) {
				CodeSystemCatalogEntryDirectory dir = ((org.openhealthtools.mdht.cts2.codesystem.DocumentRoot) eObject).getCodeSystemCatalogEntryDirectory();
				if (dir != null) {
					return dir.getEntry();
				}
			}
		}

		return new ArrayList<CodeSystemCatalogEntrySummary>();
	}

}
