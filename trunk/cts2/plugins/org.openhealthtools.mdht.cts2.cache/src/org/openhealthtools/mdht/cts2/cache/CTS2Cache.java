/*******************************************************************************
 * Copyright (c) 2013 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.cache;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.openhealthtools.mdht.cts2.association.AssociationGraph;
import org.openhealthtools.mdht.cts2.cache.util.EntityHelper;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryMsg;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryDirectory;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.Directory;
import org.openhealthtools.mdht.cts2.core.EntitySynopsis;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;
import org.openhealthtools.mdht.cts2.entity.EntityDescriptionMsg;
import org.openhealthtools.mdht.cts2.entity.EntityDirectory;
import org.openhealthtools.mdht.cts2.entity.EntityDirectoryEntry;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;
import org.openhealthtools.mdht.cts2.entity.NamedEntityDescription;
import org.openhealthtools.mdht.cts2.valuesetdefinition.IteratableResolvedValueSet;

public class CTS2Cache {

	public static CTS2Cache INSTANCE = new CTS2Cache();

	private ResourceSet resourceSet;

	private Map<String, List<EObject>> uriMap = new HashMap<String, List<EObject>>();

	public static String DEFAULT_SCT_SERVICE = "http://informatics.mayo.edu/cts2/services/py4cts2/cts2";

//	public static String DEFAULT_SCT_VERSION_HREF = "http://informatics.mayo.edu/cts2/services/sct/cts2/codesystem/SNOMED_CT/version/20130131";
	public static String DEFAULT_SCT_VERSION_HREF = "http://informatics.mayo.edu/cts2/services/py4cts2/cts2/codesystem/SNOMED_CT/version/20130131";

	private CTS2Cache() {
		// singleton
	}

	public String appendAuthenticationParams(String url) {
		// TODO need better test for 'bypass' param
//		if (url.indexOf("py4cts2") > 0 && url.indexOf("bypass") == -1) {
		if (url.indexOf("bypass") == -1) {
			boolean hasParameters = url.indexOf("?") > 0;
			String separator = hasParameters
					? "&"
					: "?";
			return url + separator + "bypass=1";
		} else {
			return url;
		}
	}

	public EObject addObject(EObject eObject) {
		EObject cachedObject = null;
		String uri = getURI(eObject);

		if (uri != null) {
			cachedObject = addObject(uri, eObject);
		}

		return cachedObject;
	}

	public EObject addObject(String uri, EObject eObject) {
		List<EObject> objects = uriMap.get(uri);
		if (objects == null) {
			objects = new ArrayList<EObject>();
			uriMap.put(uri, objects);
		}

		EObject cachedObject = getObjectForURI(uri, eObject.eClass());
		if (cachedObject == null) {
			cachedObject = eObject;
			// System.out.println("Add cache EClass: " + eObject.eClass().getName() + " EObject:" + eObject);
			objects.add(eObject);
		}

		return cachedObject;
	}

	public EObject getObjectForURI(String uri, EClass eClass) {
		EObject eObject = null;
		List<EObject> objects = uriMap.get(uri);
		if (objects != null) {
			for (EObject object : objects) {
				// if eClass is null, return first EObject
				if (eClass == null || eClass == object.eClass()) {
					eObject = object;
					break;
				}
			}
		}

		return eObject;
	}

	public EObject getObjectForURI(String uri) {
		// get preferred entity, if several are available
		EObject eObject = getEntity(uri);

		// else, get other non-entity object from cache
		if (eObject == null) {
			eObject = getObjectForURI(uri, null);
		}

		return eObject;
	}

	public EObject getContentObject(String href) {
		EObject contentObject = null;
		String hrefWithParams = appendAuthenticationParams(href);
		Resource resource = CTS2Cache.INSTANCE.getResource(URI.createURI(hrefWithParams));

		if (resource != null && resource.getContents().size() > 0) {
			// document root
			EObject docRoot = resource.getContents().get(0);
			EObject message = docRoot.eContents().get(0);
			if (message.eContents().size() == 2) {
				// first content is heading, second is data that we want
				contentObject = message.eContents().get(1);
			} else {
				contentObject = message;
			}
		}

		return contentObject;
	}

	public EObject getEntityFor(EObject eObject) {
		String uri = getURI(eObject);
		return getEntity(uri);
	}

	/**
	 * Return the most detailed object type that is available in the cache.
	 */
	public EObject getEntity(String uri) {
		EObject eObject = null;

		if (eObject == null) {
			eObject = getObjectForURI(uri, EntityPackage.eINSTANCE.getClassDescription());
		}
		if (eObject == null) {
			eObject = getObjectForURI(uri, EntityPackage.eINSTANCE.getNamedEntityDescription());
		}
		if (eObject == null) {
			eObject = getObjectForURI(uri, EntityPackage.eINSTANCE.getEntityDirectoryEntry());
		}
		if (eObject == null) {
			eObject = getObjectForURI(uri, CorePackage.eINSTANCE.getEntitySynopsis());
		}
		if (eObject == null) {
			eObject = getObjectForURI(uri, CorePackage.eINSTANCE.getURIAndEntityName());
		}

		return eObject;
	}

	public String getURI(EObject eObject) {
		if (eObject == null) {
			return null;
		}
		String uri = EntityHelper.getURI(eObject);

		if (uri == null) {
			System.err.println("Cannot get CTS2 URI for entity: " + eObject);
			uri = EcoreUtil.getURI(eObject).toString();
		}

		return uri;
	}

	public String getHref(EObject eObject) {
		String href = null;
		if (eObject instanceof URIAndEntityName) {
			href = ((URIAndEntityName) eObject).getHref();
		} else if (eObject instanceof NamedEntityDescription) {
			// no direct way to get href
			href = ((EntityDescriptionMsg) eObject.eContainer().eContainer()).getHeading().getResourceURI();
		} else if (eObject instanceof EntityDirectoryEntry) {
			// used by BioPortal
			href = ((EntityDirectoryEntry) eObject).getHref();
			if (href == null) {
				// used by py4cts2
				href = ((EntityDirectoryEntry) eObject).getKnownEntityDescription().get(0).getHref();

			}
		} else if (eObject instanceof CodeSystemCatalogEntrySummary) {
			href = ((CodeSystemCatalogEntrySummary) eObject).getHref();
		} else if (eObject instanceof CodeSystemCatalogEntry) {
			// no direct way to get href
			href = ((CodeSystemCatalogEntryMsg) eObject.eContainer()).getHeading().getResourceURI();
		} else if (eObject instanceof CodeSystemVersionCatalogEntrySummary) {
			href = ((CodeSystemVersionCatalogEntrySummary) eObject).getHref();
		}

		return href;
	}

	public List<CodeSystemVersionCatalogEntrySummary> getCodeSystemVersions(CodeSystemCatalogEntrySummary catalog) {
		List<CodeSystemVersionCatalogEntrySummary> versions = new ArrayList<CodeSystemVersionCatalogEntrySummary>();

		if (catalog.getVersions() != null) {
			Resource resource = getResource(URI.createURI(appendAuthenticationParams(catalog.getVersions())));
			if (resource != null && resource.getContents().size() > 0) {
				EObject eObject = resource.getContents().get(0);
				if (eObject instanceof org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot) {
					CodeSystemVersionCatalogEntryDirectory dir = ((org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot) eObject).getCodeSystemVersionCatalogEntryDirectory();
					if (dir != null && dir.getEntry() != null) {
						versions.addAll(dir.getEntry());
					}
				}
			}
		}

		return versions;
	}

	public List<EntityDirectoryEntry> getEntities(CodeSystemCatalogEntrySummary catalog, String matchvalue) {
		String currentVersionUri = catalog.getCurrentVersion().getVersion().getHref();
		List<EntityDirectoryEntry> entities = new ArrayList<EntityDirectoryEntry>();

		Resource resource = getResource(URI.createURI(appendAuthenticationParams(currentVersionUri + "/entities" +
				"?use=sctfsn&maxtoreturn=100&matchvalue=" + matchvalue)));
		if (resource != null && resource.getContents().size() > 0) {
			EObject eObject = resource.getContents().get(0);
			if (eObject instanceof org.openhealthtools.mdht.cts2.entity.DocumentRoot) {
				EntityDirectory dir = ((org.openhealthtools.mdht.cts2.entity.DocumentRoot) eObject).getEntityDirectory();
				if (dir != null) {
					for (EntityDirectoryEntry entry : dir.getEntry()) {
						entities.add(entry);
					}
				}
			}
		}

		return entities;
	}

	public List<EntityDirectoryEntry> getEntities(String codeSystemVersionHref, String matchvalue) {
		List<EntityDirectoryEntry> entities = new ArrayList<EntityDirectoryEntry>();

		URI resourceURI = URI.createURI(appendAuthenticationParams(codeSystemVersionHref + "/entities" +
				"?use=sctfsn&maxtoreturn=100&matchvalue=" + matchvalue));

		Resource resource = getResource(resourceURI);
		if (resource != null && resource.getContents().size() > 0) {
			EObject eObject = resource.getContents().get(0);
			if (eObject instanceof org.openhealthtools.mdht.cts2.entity.DocumentRoot) {
				EntityDirectory dir = ((org.openhealthtools.mdht.cts2.entity.DocumentRoot) eObject).getEntityDirectory();
				if (dir != null) {
					for (EntityDirectoryEntry entry : dir.getEntry()) {
						entities.add(entry);
					}
				}
			}
		}

		return entities;
	}

	public List<EntityDirectoryEntry> getEntities(CodeSystemCatalogEntrySummary catalog, int page) {
		String currentVersionUri = catalog.getCurrentVersion().getVersion().getHref();
		List<EntityDirectoryEntry> entities = new ArrayList<EntityDirectoryEntry>();

		Resource resource = getResource(URI.createURI(appendAuthenticationParams(currentVersionUri + "/entities" +
				"?page=" + page + "&maxtoreturn=50")));
		if (resource != null && resource.getContents().size() > 0) {
			EObject eObject = resource.getContents().get(0);
			if (eObject instanceof org.openhealthtools.mdht.cts2.entity.DocumentRoot) {
				EntityDirectory dir = ((org.openhealthtools.mdht.cts2.entity.DocumentRoot) eObject).getEntityDirectory();
				if (dir != null) {
					for (EntityDirectoryEntry entry : dir.getEntry()) {
						entities.add(entry);
					}
				}
			}
		}

		return entities;
	}

	/**
	 * Using default SCT service.
	 * 
	 * @param sctid
	 * @return
	 */
	public NamedEntityDescription getEntityDescriptionById(String sctid) {
		NamedEntityDescription entityDescription = (NamedEntityDescription) getObjectForURI(
			sctid, EntityPackage.eINSTANCE.getNamedEntityDescription());
		if (entityDescription == null) {
			String serviceHref = appendAuthenticationParams(DEFAULT_SCT_VERSION_HREF + "/entity/" + sctid);
			entityDescription = getEntityDescriptionByHref(serviceHref);
		}

		return entityDescription;
	}

	public NamedEntityDescription getEntityDescriptionById(String codeSystemHref, String id) {
		NamedEntityDescription entityDescription = (NamedEntityDescription) getObjectForURI(
			id, EntityPackage.eINSTANCE.getNamedEntityDescription());
		if (entityDescription == null) {
			String serviceHref = appendAuthenticationParams(codeSystemHref + "/entity/" + id);
			entityDescription = getEntityDescriptionByHref(serviceHref);
		}

		return entityDescription;
	}

	public NamedEntityDescription getEntityDescriptionByUri(String codeSystemHref, String uri) {
		NamedEntityDescription entityDescription = (NamedEntityDescription) getObjectForURI(
			uri, EntityPackage.eINSTANCE.getNamedEntityDescription());
		if (entityDescription == null) {
			// uri= param must be at end of URL
			String serviceHref = appendAuthenticationParams(codeSystemHref + "/entitybyuri") + "&uri=" + uri;
			entityDescription = getEntityDescriptionByHref(serviceHref);
		}

		return entityDescription;
	}

	public NamedEntityDescription getEntityDescriptionByHref(String fullHref) {
		NamedEntityDescription entityDescription = null;
		String hrefWithParams = appendAuthenticationParams(fullHref);
		Resource resource = CTS2Cache.INSTANCE.getResource(URI.createURI(hrefWithParams));

		if (resource != null && resource.getContents().size() > 0) {
			EObject eObject = resource.getContents().get(0);
			if (eObject instanceof org.openhealthtools.mdht.cts2.entity.DocumentRoot) {
				entityDescription = ((org.openhealthtools.mdht.cts2.entity.DocumentRoot) eObject).getEntityDescriptionMsg().getEntityDescription().getClassDescription();
				if (entityDescription == null) {
					entityDescription = ((org.openhealthtools.mdht.cts2.entity.DocumentRoot) eObject).getEntityDescriptionMsg().getEntityDescription().getNamedEntity();
				}

				if (entityDescription != null) {
					addObject(entityDescription);
				}
			}
		}

		return entityDescription;
	}

	public Directory getSubjectOfAssociations(NamedEntityDescription entityDescription) {
		Directory associationDir = null;

		if (entityDescription.getSubjectOf() != null) {
			associationDir = getAssociations(entityDescription.getSubjectOf());
			if (associationDir != null) {
				addObject(entityDescription.getAbout(), associationDir);
			}
		}

		return associationDir;
	}

	public Directory getSubjectOfAssociations(String uri) {
		Directory associationDir = null;

		EObject entity = getEntity(uri);
		if (entity != null && getHref(entity) != null) {
			associationDir = getAssociations(getHref(entity) + "/subjectof");
			if (associationDir != null) {
				addObject(uri, associationDir);
			}
		}

		return associationDir;
	}

	public AssociationGraph getAncestorsGraph(NamedEntityDescription entityDescription) {
		AssociationGraph associationGraph = null;

		if (entityDescription.getAncestors() != null) {
			associationGraph = getAssociationGraph(entityDescription.getAncestors());
			if (associationGraph != null) {
				addObject(entityDescription.getAbout(), associationGraph);
			}
		}

		return associationGraph;
	}

	public AssociationGraph getAncestorsGraph(String uri) {
		AssociationGraph associationGraph = null;

		EObject entity = getEntity(uri);
		if (entity != null && getHref(entity) != null) {
			associationGraph = getAssociationGraph(getHref(entity) + "/ancestors");
			if (associationGraph != null) {
				addObject(uri, associationGraph);
			}
		}

		return associationGraph;
	}

	public List<EntityDirectoryEntry> getChildren(NamedEntityDescription entityDescription) {
		String childrenUri = entityDescription.getChildren();
		List<EntityDirectoryEntry> entities = new ArrayList<EntityDirectoryEntry>();

		Resource resource = getResource(URI.createURI(appendAuthenticationParams(childrenUri +
				"?use=sctpn&maxtoreturn=100")));
		if (resource != null && resource.getContents().size() > 0) {
			EObject eObject = resource.getContents().get(0);
			if (eObject instanceof org.openhealthtools.mdht.cts2.entity.DocumentRoot) {
				EntityDirectory dir = ((org.openhealthtools.mdht.cts2.entity.DocumentRoot) eObject).getEntityDirectory();
				if (dir != null) {
					for (EntityDirectoryEntry entry : dir.getEntry()) {
						entities.add(entry);
					}
				}
			}
		}

		return entities;
	}

	public List<EntityDirectoryEntry> getChildren(String uri) {
		List<EntityDirectoryEntry> entities = new ArrayList<EntityDirectoryEntry>();

		EObject entity = getEntity(uri);
		if (entity != null && getHref(entity) != null) {
			Resource resource = getResource(URI.createURI(appendAuthenticationParams(getHref(entity) + "/children" +
					"?use=sctpn&maxtoreturn=100")));

			if (resource != null && resource.getContents().size() > 0) {
				EObject eObject = resource.getContents().get(0);
				if (eObject instanceof org.openhealthtools.mdht.cts2.entity.DocumentRoot) {
					EntityDirectory dir = ((org.openhealthtools.mdht.cts2.entity.DocumentRoot) eObject).getEntityDirectory();
					if (dir != null) {
						for (EntityDirectoryEntry entry : dir.getEntry()) {
							entities.add(entry);
						}
					}
				}
			}
		}

		return entities;
	}

	public Directory getAssociations(String baseURI) {
		Directory directory = null;
		URI resourceURI = URI.createURI(appendAuthenticationParams(baseURI + "?use=sctpn&maxtoreturn=100"));
		Resource resource = CTS2Cache.INSTANCE.getResource(resourceURI);

		if (resource != null && resource.getContents().size() > 0) {
			EObject eObject = resource.getContents().get(0);

			if (eObject instanceof org.openhealthtools.mdht.cts2.association.DocumentRoot) {
				org.openhealthtools.mdht.cts2.association.DocumentRoot docRoot = (org.openhealthtools.mdht.cts2.association.DocumentRoot) eObject;
				directory = docRoot.getAssociationDirectory();
				if (directory == null) {
					directory = docRoot.getAssociationList();
				}
				if (directory == null) {
					directory = docRoot.getAssociationGraph();
				}
			}
		}

		return directory;
	}

	private AssociationGraph getAssociationGraph(String baseURI) {
		String graphURI = baseURI + "/graph";
		AssociationGraph associationGraph = (AssociationGraph) getAssociations(graphURI);

		return associationGraph;
	}

	public List<EntitySynopsis> getValueSetDerivedFrom(String serviceURL, String entityId, int page) {
		List<EntitySynopsis> entities = new ArrayList<EntitySynopsis>();

		Resource resource = getResource(URI.createURI(appendAuthenticationParams(serviceURL + "/resolvedvalueset/" +
				entityId + "?&maxtoreturn=100")));

		if (resource != null && resource.getContents().size() > 0) {
			EObject eObject = resource.getContents().get(0);
			if (eObject instanceof org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot) {
				IteratableResolvedValueSet valueSet = ((org.openhealthtools.mdht.cts2.valuesetdefinition.DocumentRoot) eObject).getIteratableResolvedValueSet();
				if (valueSet != null) {
					for (EntitySynopsis entity : valueSet.getEntry()) {
						entities.add(entity);
					}
				}
			}
		}

		return entities;
	}

	public ResourceSet getResourceSet() {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl() {
				@Override
				protected Resource demandCreateResource(URI uri) {
					return new CTS2ResourceFactoryImpl().createResource(uri);
				}
			};
		}

		return resourceSet;
	}

	public Resource getResource(URI uri) {
		Resource resource = null;
		try {
			if (uri.toString().indexOf("bypass") <= 0) {
				String paramChar = "&";
				if (uri.toString().indexOf("?") <= 0) {
					paramChar = "?";
				}
				uri = uri.appendQuery("bypass=1");
			}
			System.out.println("getResource(): " + new Date() + " - " + uri);
			resource = getResourceSet().getResource(uri, true);
			System.out.println("getResource(): " + new Date());
		} catch (Exception e) {
			if (e instanceof WrappedException) {
				if (((WrappedException) e).exception() instanceof IOException) {
					System.err.println("IO Error reading: " + uri);
				} else {
					resource = getResourceSet().getResource(uri, false);
				}
			}
		}
		if (resource != null) {
			getResourceSet().getResources().add(resource);
		}

		return resource;
	}

	public void clearAllResources() {
		for (Resource resource : getResourceSet().getResources()) {
			resource.unload();
		}
		getResourceSet().getResources().clear();
	}
}
