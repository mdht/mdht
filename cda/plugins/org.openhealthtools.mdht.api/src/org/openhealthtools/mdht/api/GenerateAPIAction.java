/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.openhealthtools.mdht.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.WordUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.openhealthtools.mdht.api.transform.APITransformationBuilder;
import org.openhealthtools.mdht.transform.core.NullTransformMonitor;
import org.openhealthtools.mdht.transform.core.TransformationBuilder;
import org.openhealthtools.mdht.transformation.ocl.OCLTransformation;
import org.openhealthtools.mdht.uml.cda.core.profile.Validation;
import org.openhealthtools.mdht.uml.cda.core.util.CDACommonUtils;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ClinicalDocumentCreator;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.core.util.ModelStatus;
import org.openhealthtools.mdht.uml.cda.transform.EcoreTransformationBuilder;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.term.core.profile.TermPackage;

import traceability.LogEntry;
import traceability.Trace;
import traceability.TraceabilityFactory;
import traceability.Traces;
import traceability.util.TraceabilityUtils;

/**
 * Action to generate API files for the selected UML model
 */
abstract public class GenerateAPIAction implements IObjectActionDelegate {

	protected static final String DEL_CDA_BODY_LEVEL_3 = "CDA Body Level 3";

	protected static final String DEL_CDA_BODY_LEVEL_2 = "CDA Body Level 2";

	protected static final String DEL_CDA_HEADER = "CDA Header";

	protected static final String DEL_CDA_NA = "N/A";

	protected ClinicalDocumentCreator creator;

	private List<IFile> files = new ArrayList<IFile>();

	protected File genfolder;

	protected Class umlClinicalDocument;

	/**
	 * List of ClinicalDocuments available in this model
	 */
	private List<Class> clinicalDocuments;

	private String specName;
	
	protected String modelname;

	private String specInitials;

	protected String specContractedName;

	protected File summaryFile;

	protected OCLTransformation<Package, Classifier, ?, Property, ?, ?, ?, ?, ?, ?, ?, ?> trafo;

	/**
	 * The UML classes to create an API for
	 */
	protected List<Class> classes;

	/**
	 * Current template that is gradually resolved
	 */
	protected String template;

	/**
	 * Current template variable parameters: the first object being the template variable itself, the following objects representing the UML context
	 * required to resolve the template variable
	 */
	private Object[] templateVariableParameters;

	/**
	 * Caches calculated string values for template variables in a given context
	 */
	private Map<Object[], String> cachedResolve = new WeakHashMap<Object[], String>();

	protected List<ModelStatus> statuses = new ArrayList<ModelStatus>();

	private Profile profile;

	/**
	 * Whether for the currently resolved template, tabs and newlines have a special meaning and therefore should be removed
	 */
	protected boolean removeTabAndNewline;

	protected Resource resource;

	protected List<Resource> irResources;

	protected IFile umlFile;

	protected Traces currentCategory;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// nothing to do
	}

	public void selectionChanged(IAction action, ISelection selection) {
		files = new ArrayList<IFile>();
		IStructuredSelection sSelection = (IStructuredSelection) selection;
		for (Iterator<?> iterator = sSelection.iterator(); iterator.hasNext();) {
			IFile file = (IFile) iterator.next();
			files.add(file);
		}

		action.setEnabled(!files.isEmpty());
	}

	public boolean isEnabled() {
		return !files.isEmpty();
	}

	public void run(IAction action) {
		statuses.clear();
		for (Iterator<IFile> iterator = files.iterator(); iterator.hasNext();) {
			final IFile modelFile = (IFile) iterator.next();
			final Shell shell = Display.getDefault().getActiveShell();

			Job job = new Job("Generating " + getTargetLanguage() + " for " +
					modelFile.getName().substring(0, modelFile.getName().length() - ".uml".length())) {
				public IStatus run(IProgressMonitor monitor) {
					try {
						// duplicate this action to isolate against parallel running API jobs
						GenerateAPIAction duplicate = GenerateAPIAction.this.getClass().newInstance();
						return duplicate.genAPI(modelFile, monitor, shell);
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				}

			};
			job.schedule();
		}
	}

	abstract protected String getTargetLanguage();

	/**
	 * @param modelFile
	 * @param monitor
	 * @param shell
	 * @return
	 */
	protected IStatus genAPI(final IFile modelFile, IProgressMonitor monitor, Shell shell) {
		IStatus status;
		umlFile = modelFile;
		modelname = modelFile.getName().substring(0, modelFile.getName().lastIndexOf("."));
		try {
			try {
				this.specName = "Undefined Clinical Document";
				monitor.setTaskName("Loading UML model");
				ResourceSet resourceSet = new ResourceSetImpl() {

					@Override
					public Resource getResource(URI uri, boolean loadOnDemand) {
						// apply fix, otherwise CDA base model is loaded multiple times!
						if (uri.toString().contains("///"))
							uri = URI.createURI(uri.toString().replace("///", "/"));
						return super.getResource(uri, loadOnDemand);
					}

				};

				CDACommonUtils.patchResourceSet(resourceSet);
				trafo = createTrafo(resourceSet);				

				resource = resourceSet.getResource(
					URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true), true);
				Package pack = (Package) resource.getContents().get(0);
				irResources = new ArrayList<Resource>();
				irResources.add(resource);

				Resource profileRes = pack.eResource().getResourceSet().getResource(
					URI.createURI("platform:/plugin/" + Activator.PLUGIN_ID + "/model/api.profile.uml"), true);
				profile = (Profile) profileRes.getContents().get(0);

				monitor.worked(1);
				monitor.setTaskName("Building OCL constraints");
				if (monitor.isCanceled())
					throw new RuntimeException("Canceled by user");

				umlClinicalDocument = null;
				clinicalDocuments = new ArrayList<Class>();
				for (NamedElement ne : pack.getPackagedElements()) {
					if (ne instanceof Class && CDACommonUtils.isClinicalDocument((Class) ne)) {
						clinicalDocuments.add((Class) ne);
						umlClinicalDocument = (Class) ne;
						CDACommonUtils.buildupPropertyForClinicalDocument(umlClinicalDocument);
						specName = CDACommonUtils.getBusinessName(ne);
					}
				}
				if (umlClinicalDocument == null && !"datatypes".equals(pack.getName())) {
					CDACommonUtils.addStatus(
						statuses, IStatus.ERROR, getPlugin(), 3,
						"Cannot find a clinical document template in the UML model!");
					return alertGenerationResult(shell, null);
				}

				status = null;

				// old behaviour for models with only one ClinicalDocument as I can't be bothered having pointless arguments
				if (clinicalDocuments.size() == 1) {

					genfolder = genfolder(modelFile.getLocation().toFile().getParentFile(), null);
					summaryFile = new File(genfolder, "summary.html");
					
					classes = new ArrayList<Class>();
					calcClasses(umlClinicalDocument, classes);

					for (Class clazz : classes) {
						if (clazz.eResource() != null && !irResources.contains(clazz.eResource()))
							irResources.add(clazz.eResource());
					}

					URI tracesUri = URI.createFileURI(new File(genfolder, modelname + ".schematron.uml.anytraces").toString());
					currentCategory = TraceabilityUtils.createTraceModel(
						tracesUri, resource.getURI().toString(), resourceSet, false, getTargetLanguage());
					currentCategory.setSourceModel(pack);

					specContractedName = specName.replace(" ", "");
					specInitials = WordUtils.initials(specName);
					creator = new ClinicalDocumentCreator(umlClinicalDocument, resource.getResourceSet(), statuses);

					fixUMLModel();
					boolean directSave = Boolean.getBoolean("USE_FLATTENED_ORIGINAL_OCL_GENERATOR");
					if (directSave) {
						saveModelCopies(monitor, true);
					}
					if (trafo != null) {
						for (Resource resource : irResources) {
							TransformationBuilder builder = Boolean.getBoolean("USE_FLATTENED_ORIGINAL_OCL_GENERATOR")
									? EcoreTransformationBuilder.create()
									: Boolean.getBoolean("USE_ORIGINAL_OCL_GENERATOR")
											? org.openhealthtools.mdht.api.transform.original.APITransformationBuilder.create()
											: APITransformationBuilder.create();
							builder.build().execute(CDACommonUtils.getAllContents(resource), new NullTransformMonitor());
						}
						monitor.worked(19);
						if (monitor.isCanceled())
							throw new RuntimeException("Canceled by user");
					}

					// in case some classes got deleted by the previous transformation
					classes = new ArrayList<Class>();
					calcClasses(umlClinicalDocument, classes);

					long start = System.currentTimeMillis();

					monitor.setTaskName("Building " + getTargetLanguage() + " file");
					genAPICode(pack, monitor);

					long end = System.currentTimeMillis();
					System.out.println(getTargetLanguage() + " generation took " + (end - start) + "ms");

					if (!directSave) {
						saveModelCopies(monitor, false);
					}
					status = alertGenerationResult(shell, null);

				} else { // if there are multiple ClinicalDocuments present in a model, create a genschematron folder for each of them

					fixUMLModel(); // fix only once
					
					for (Class umlClinicalDocument : clinicalDocuments) {
						CDACommonUtils.buildupPropertyForClinicalDocument(umlClinicalDocument);
						specName = CDACommonUtils.getBusinessName(umlClinicalDocument);
						genfolder = genfolder(modelFile.getLocation().toFile().getParentFile(), specName);
						summaryFile = new File(genfolder, "summary.html");
						
						modelname = modelFile.getName().substring(0, modelFile.getName().lastIndexOf(".")) + "-" + specName;

						classes = new ArrayList<Class>();
						calcClasses(umlClinicalDocument, classes);

						for (Class clazz : classes) {
							if (clazz.eResource() != null && !irResources.contains(clazz.eResource()))
								irResources.add(clazz.eResource());
						}

						URI tracesUri = URI.createFileURI(new File(genfolder, modelname + ".schematron.uml.anytraces").toString());
						currentCategory = TraceabilityUtils.createTraceModel(
							tracesUri, resource.getURI().toString(), resourceSet, false, getTargetLanguage());
						currentCategory.setSourceModel(pack);

						specContractedName = specName.replace(" ", "");
						specInitials = WordUtils.initials(specName);
						creator = new ClinicalDocumentCreator(umlClinicalDocument, resource.getResourceSet(), statuses);

						boolean directSave = Boolean.getBoolean("USE_FLATTENED_ORIGINAL_OCL_GENERATOR");
						if (directSave) {
							saveModelCopies(monitor, true);
						}
						if (trafo != null) {
							for (Resource resource : irResources) {
								TransformationBuilder builder = Boolean.getBoolean("USE_FLATTENED_ORIGINAL_OCL_GENERATOR")
										? EcoreTransformationBuilder.create()
										: Boolean.getBoolean("USE_ORIGINAL_OCL_GENERATOR")
												? org.openhealthtools.mdht.api.transform.original.APITransformationBuilder.create()
												: APITransformationBuilder.create();
								try {
									builder.build().execute(
										CDACommonUtils.getAllContents(resource), new NullTransformMonitor());
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
							monitor.worked(19);
							if (monitor.isCanceled())
								throw new RuntimeException("Canceled by user");
						}

						// in case some classes got deleted by the previous transformation
						classes = new ArrayList<Class>();
						calcClasses(umlClinicalDocument, classes);

						long start = System.currentTimeMillis();

						monitor.setTaskName("Building " + getTargetLanguage() + " file");
						genAPICode(pack, monitor);

						long end = System.currentTimeMillis();
						System.out.println(getTargetLanguage() + " generation took " + (end - start) + "ms");

						if (!directSave) {
							saveModelCopies(monitor, false);
						}
						status = alertGenerationResult(shell, null);
					}

				}
			} catch (Exception e) {
				status = alertGenerationResult(shell, e);
			}
		} finally {
			monitor.setTaskName("Refreshing workspace");
			try {
				modelFile.getParent().getParent().refreshLocal(IResource.DEPTH_INFINITE, monitor);
			} catch (CoreException e) {
				e.printStackTrace();
			}
			monitor.setTaskName("Finished");
		}

		return status;
	}

	private void saveModelCopies(IProgressMonitor monitor, boolean changeURIOnly) throws IOException,
			FileNotFoundException {
		if (trafo == null) {
			return;
		}
		for (Resource resource : irResources) {
			File file = getModelCopyFile(resource);
			if (changeURIOnly) {
				resource.setURI(URI.createFileURI(file.toString()));
			} else {
				monitor.setTaskName("Writing " + file.getName());
				resource.save(new FileOutputStream(file), null);
			}
		}
	}

	private File getModelCopyFile(Resource resource) {
		File file = new File(
			genfolder, resource.getURI().trimFileExtension().appendFileExtension("schematron.uml").lastSegment());
		return file;
	}

	/**
	 * @return
	 */
	abstract protected String getRootFileExtension();

	protected String getPlugin() {
		return Activator.PLUGIN_ID;
	}

	/**
	 * @param suffix TODO
	 * @return folder where contents shall be generated
	 */
	abstract protected File genfolder(File modelFolder, String suffix);

	private IStatus alertGenerationResult(final Shell shell, Exception e) {
		if (e != null)
			e.printStackTrace();

		if (e != null)
			CDACommonUtils.addStatus(
				statuses, IStatus.ERROR, getPlugin(), 0, "Transformation terminated with an exception", e);

		if (currentCategory != null) {
			for (ModelStatus status : statuses) {
				LogEntry trace = TraceabilityFactory.eINSTANCE.createLogEntry();
				trace.setMessage(status.getMessage());
				trace.setSeverity(status.getSeverity() == IStatus.ERROR
						? 0
						: status.getSeverity() == IStatus.WARNING
								? 1
								: 2);
				trace.setMessageType(status.getCode());
				for (EObject participant : status.getParticipants()) {
					if (participant != null) {
						if (participant instanceof Property) {
							Property property = (Property) participant;
							if (property.getAssociation() != null) {
								// MDHT's editor can only scroll to the association if there is one
								participant = property.getAssociation();
							}
						}
						Resource res = participant.eResource();
						if (participant instanceof Constraint && irResources.contains(res)) {
							// the constraint don't exist in the original UML model, so point to the copy of it
							URI uri = URI.createFileURI(getModelCopyFile(res).toString()).appendFragment(
								res.getURIFragment(participant));
							((InternalEObject) participant).eSetProxyURI(uri);
						} else if (res != null) {
							URI resolved = res.getResourceSet().getURIConverter().normalize(res.getURI());
							if (!resolved.equals(res.getURI())) {
								// don't use pathmap uris
								URI uri = resolved.appendFragment(res.getURIFragment(participant));
								((InternalEObject) participant).eSetProxyURI(uri);
							}
						}
						trace.getParticipants().add(participant);
					}
				}
				TraceabilityUtils.addTrace(currentCategory, trace);
			}
			try {
				currentCategory.eResource().save(null);
				if (e == null) {
					shell.getDisplay().asyncExec(new Runnable() {
						public void run() {
							try {
								IEditorInput i = new URIEditorInput(currentCategory.eResource().getURI());
								IPath location = Path.fromOSString(currentCategory.eResource().getURI().toFileString());
								IFile file = umlFile.getWorkspace().getRoot().getFileForLocation(location);
								if (file != null) {
									// if file exists in the workspace, open a workspace resource instead of an external file!
									i = new FileEditorInput(file);
								}
								IDE.openEditor(
									PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), i,
									"traceability.presentation.ReflectiveTraceabilityEditorID");
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});

				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

		if (statuses.isEmpty())
			return Status.OK_STATUS;

		String message = this.specName + ": " + getTargetLanguage() + (e != null
				? " generation did not finish"
				: " generation finished with problems");

		return new MultiStatus(getPlugin(), IStatus.ERROR, statuses.toArray(new IStatus[] {}), message, e);
	}

	/**
	 * Fixes the UML model in a variety of aspects
	 * 
	 * @param pack
	 */
	private void fixUMLModel() {
		for (Property property : CDACommonUtils.getAllContents(irResources, Property.class)) {
			// required so that MDHT generates OCL checking for default values
			property.setIsReadOnly(true);
			// fix TYPO
			if ("ENV".equals(property.getDefault())) {
				property.setDefault("EVN");
			}
			// let the MDHT's OCL generator read the correct default values
			if (property.getDefault() == null && CDACommonUtils.getDefault(property) != null) {
				property.setStringDefaultValue(CDACommonUtils.getDefault(property));
			}
			// report properties without CDA base properties
			if (property.getName() != null && property.eContainer() instanceof Class) {
				CDACommonUtils.getCDAProperty(property, statuses);
			}
		}
		if (trafo == null) {
			return;
		}
		for (Class clazz : CDACommonUtils.getAllContents(irResources, Class.class)) {
			for (Property property1 : clazz.getAttributes()) {
				Property baseProperty1 = CDACommonUtils.getCDAProperty(property1);
				if (baseProperty1 != null && property1.getType() instanceof Class && trafo != null) {
					Class class1 = (Class) property1.getType();
					String xpath1 = trafo.getTypeCheck(class1);
					for (Property property2 : clazz.getAttributes()) {
						Property baseProperty2 = CDACommonUtils.getCDAProperty(property2);
						if (baseProperty2 != null && property2.getType() instanceof Class &&
								clazz.getAttributes().indexOf(property1) < clazz.getAttributes().indexOf(property2)) {
							Class class2 = (Class) property2.getType();
							String xpath2 = trafo.getTypeCheck(class2);
							if (property1 != property2 && baseProperty1 == baseProperty2 && xpath1 != null &&
									xpath1.equals(xpath2)) {
								CDACommonUtils.addStatus(
									statuses, IStatus.WARNING, getPlugin(), 14, property1.getQualifiedName() +
											" and  " + property2.getQualifiedName() +
											" have the same xpath type expression " + xpath1, property1, property2);
							}
							if (property1 != property2 && baseProperty1 == baseProperty2 &&
									(xpath1 == null || xpath2 == null)) {
								Property property = xpath1 == null
										? property1
										: property2;
								Class class_ = (Class) property.getType();
								CDACommonUtils.addStatus(
									statuses,
									IStatus.WARNING,
									getPlugin(),
									15,
									mentionSection(
										class_.getQualifiedName() +
												" is missing a OCL filter, template ID, code or classCode definition",
										clazz, property), class_);
							}
						}
					}
				}
			}
		}
		for (Association association : CDACommonUtils.getAllContents(irResources, Association.class)) {
			if (CDACommonUtils.getMDHTRepresentative(association) instanceof Property) {
				Property property = (Property) CDACommonUtils.getMDHTRepresentative(association);
				if (property.eContainer() instanceof Class && CDACommonUtils.hasPropertyPath(property)) {
					Class class1 = (Class) property.eContainer();
					Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
						association, ICDAProfileConstants.ASSOCIATION_VALIDATION);
					Object severity = stereotype != null
							? association.getValue(stereotype, ICDAProfileConstants.VALIDATION_SEVERITY)
							: null;
					if (severity == null)
						CDACommonUtils.addStatus(
							statuses,
							IStatus.WARNING,
							getPlugin(),
							30,
							mentionSection(
								property.getQualifiedName() +
										" has no severity applied, hence this association will have no constraint generated",
								class1, property), property);
				}
			}
		}
		for (Property property : CDACommonUtils.getAllContents(irResources, Property.class)) {
			if (property.getAssociation() == null && property.eContainer() instanceof Class &&
					CDACommonUtils.hasPropertyPath(property)) {
				Class class1 = (Class) property.eContainer();
				Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
					property, ICDAProfileConstants.PROPERTY_VALIDATION);
				Object severity = stereotype != null
						? property.getValue(stereotype, ICDAProfileConstants.VALIDATION_SEVERITY)
						: null;
				if (severity == null)
					CDACommonUtils.addStatus(
						statuses,
						IStatus.WARNING,
						getPlugin(),
						31,
						mentionSection(
							property.getQualifiedName() +
									" has no severity applied, hence this property will have no constraint generated",
							class1, property), property);
			}
		}
		Map<String, NamedElement> nameCheck = new HashMap<String, NamedElement>();
		for (NamedElement namedElement : CDACommonUtils.getAllContents(irResources, NamedElement.class)) {
			if (namedElement.getName() != null && namedElement.getQualifiedName() != null &&
					!(namedElement instanceof InstanceValue) && !(namedElement instanceof Constraint)) {
				NamedElement existing = nameCheck.put(namedElement.getQualifiedName(), namedElement);
				if (existing != null && existing != namedElement) {
					CDACommonUtils.addStatus(
						statuses, IStatus.WARNING, getPlugin(), 32, "Two UML elements share the same qualified name: " +
								namedElement.getQualifiedName(), namedElement, existing);
					System.out.println("Two UML elements share the same qualified name: " +
							namedElement.getQualifiedName());
				}
			}
		}
	}

	/**
	 * Returns the value for the named stereotype, or its default value if the given element has that stereotype not applied
	 * 
	 * @param element
	 * @param name
	 * @return
	 */
	protected String getStereotype(NamedElement element, String name) {
		Stereotype stereotype = (Stereotype) profile.getPackagedElement(element instanceof Package
				? "SchematronSupport"
				: "SchematronConfig");
		if (element.hasValue(stereotype, name)) {
			Object object = element.getValue(stereotype, name);
			if (object != null)
				return "" + object;
		}
		return stereotype.getAttribute(name, null).getDefault();
	}

	abstract protected String toValidFileName(String filename);

	/**
	 * Generates the .sch file and the .ent files
	 * 
	 * @param pack
	 * @param monitor
	 * @throws Exception
	 */
	abstract protected void genAPICode(final Package pack, IProgressMonitor monitor) throws Exception;

	abstract protected OCLTransformation<Package, Classifier, ?, Property, ?, ?, ?, ?, ?, ?, ?, ?> createTrafo(
			final ResourceSet resourceSet);

	protected NamedElement getConstrainedElement(Constraint constraint) {
		if (constraint.getConstrainedElements().isEmpty())
			return null;
		Element x = constraint.getConstrainedElements().get(0);
		if (constraint.getConstrainedElements().size() >= 2) {
			x = constraint.getContext();
		}
		NamedElement element = CDACommonUtils.getMDHTRepresentative((NamedElement) x);

		if (Boolean.parseBoolean(getStereotype(element, "noSchematronGen"))) {
			return null;
		}

		Class clazz = (Class) constraint.getContext();
		if (constraint.getName() != null && constraint.getName().endsWith("TemplateId") &&
				creator.getTemplateIdProperty(clazz) != null && element instanceof Class) {
			element = creator.getTemplateIdProperty(clazz);
		} else if (element == constraint.getContext()) {
			element = constraint;
		}

		final OpaqueExpression spec = (constraint.getSpecification() instanceof OpaqueExpression)
				? (OpaqueExpression) constraint.getSpecification()
				: null;
		if (spec == null)
			return null;

		return element;
	}

	/**
	 * @param clazz
	 * @param element
	 * @return
	 */
	protected String getFullXPath(Class clazz, NamedElement element) {
		if (element instanceof Property) {
			Property property = (Property) element;
			// only handle property when it is not an XML attribute
			if (property.getType() instanceof Class) {
				List<Property> propertyPath = CDACommonUtils.getPropertyPath(clazz);
				propertyPath.add(property);
				return getCdaContext(propertyPath, false);
			}
		}
		return getCdaContext(clazz, false);
	}

	protected String getCdaContext(Class clazz, boolean checkRedefines) {
		List<Property> propertyPath = CDACommonUtils.getPropertyPath(clazz);
		return getCdaContext(propertyPath, checkRedefines);
	}

	/**
	 * @param propertyPath
	 * @param checkRedefines
	 *            whether skipping of predicates should be based on redefines/subsets (<code>true</code>) or singlevalued/multivalued (
	 *            <code>false</code>) considerations
	 * @return
	 */
	protected String getCdaContext(List<Property> propertyPath, boolean checkRedefines) {
		if (trafo == null) {
			return null;
		}
		String context = "/cda:ClinicalDocument";
		EObject lastPredicate = null;
		int nextProperty = 0;
		for (Property childProperty : propertyPath) {
			nextProperty++;
			context = trafo.step(context, childProperty);
			String i = trafo.newVar();
			if (lastPredicate != null) {
				context = trafo.predicate(
					context, ((CDAOCLHandler) trafo.getDomainSpecificOCLHandler()).getCodeOrClasscodeCheckForPredicate(
						lastPredicate, i), i);
				lastPredicate = null;
				continue;
			}
			if (checkRedefines && isRedefines(childProperty)) {
				// a redefined property cannot be subset, i.e. no other properties can use the CDA base property, hence no need for type checking
				continue;
			}
			Property cdaProperty = CDACommonUtils.getCDAProperty(childProperty);
			if (!checkRedefines && cdaProperty != null && !cdaProperty.isMultivalued()) {
				continue;
			}
			if (!(childProperty.getType() instanceof Class)) {
				continue;
			}
			Class class1 = (Class) childProperty.getType();
			if (propertyPath.size() > nextProperty &&
					propertyPath.get(nextProperty) == CDACommonUtils.getPropertyForTypeCheck(class1)) {
				lastPredicate = CDACommonUtils.getPredicateForTypeCheck(class1);
				continue;
			}
			String predicate = trafo.getTypeCheck(class1, i);
			if (predicate != null) {
				context = trafo.predicate(context, predicate, i);
			}
		}
		return context.toString();
	}

	private boolean isRedefines(Property property) {
		Property baseProperty = CDACommonUtils.getCDAProperty(property);
		if (baseProperty != null &&
				baseProperty != property &&
				(property.getName().equals(baseProperty.getName()) || property.getRedefinedProperties().contains(
					baseProperty)) && property.eContainer() instanceof Class) {
			Class clazz = (Class) property.eContainer();
			for (Property otherProperty : clazz.getAttributes()) {
				if (otherProperty != property && CDACommonUtils.getCDAProperty(otherProperty) == baseProperty) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	private String getXPathTest(Constraint constraint) {
		if (trafo == null) {
			return null;
		}
		String xpath = getBody(constraint, "XPath");
		String ocl = getBody(constraint, "OCL");
		if (xpath == null && ocl != null) {
			Classifier classifier = (Classifier) constraint.getContext();
			if (CDACommonUtils.getCDAType(classifier) != null)
				classifier = CDACommonUtils.getCDAType(classifier);
			ocl = ocl.replace("assignedPerson", "xyz").replace("self.xyz", "self.assignedPerson");
			xpath = trafo.transform(classifier, ocl);
		} else if (xpath == null) {
			xpath = trafo.cosmetics("true()");
		}
		return xpath;
	}

	private String resolve(String template, String name, String value) {
		if (value == null) {
			value = "n/a";
		}
		return template.replace(name, value);
	}

	/**
	 * @param params
	 *            first item is the template variable, following items UML elements representing context for the template variable (e.g. the
	 *            {uml-element-name} of a given UML element)
	 * @return whether a template variable needs to be calculated in order to be replaced in the template (<code>true</code>) or whether the template
	 *         variable is already resolved (<code>false</code>) or not required to be resolved (<code>false</code>)
	 */
	protected boolean needResolve(Object... params) {
		String name = (String) params[0];
		if (!this.template.contains(name)) {
			return false;
		}
		if (cachedResolve.containsKey(params)) {
			this.template = resolve(this.template, name, cachedResolve.get(params));
			return false;
		}
		this.templateVariableParameters = params;
		return true;
	}

	/**
	 * Replace the current template variable by the given value
	 * 
	 * @param value
	 */
	protected void resolve(String value) {
		cachedResolve.put(this.templateVariableParameters, value);
		String name = (String) this.templateVariableParameters[0];
		this.template = resolve(this.template, name, value);
	}

	protected String resolve(String template, Class clazz, NamedElement element) {
		this.template = template;
		if (needResolve("{test-types-covered}", clazz, element))
			resolve("");
		if (needResolve("{test-file-anchors}", clazz, element))
			resolve("");
		if (needResolve("{uml-element-name}", element))
			resolve(element.getName());
		if (needResolve("{uml-business-name}", element))
			resolve(getBusinessName(element));
		if (needResolve("{uml-context-class-business-name}", clazz))
			resolve(getBusinessName(clazz));
		if (needResolve("{conformance-rule}", clazz, element))
			resolve(getConformance(clazz, element));
		if (needResolve("{pdf-section-number}", clazz, element))
			resolve(getPDFSection(clazz, element));
		if (needResolve("{pdf-section-order}", clazz, element))
			resolve(getPDFSectionOrder(clazz, element));
		if (needResolve("{level-2-pdf-section-number}", clazz, element))
			resolve(getLevel2PDFSectionNumber(clazz, element));
		if (needResolve("{level-2-pdf-section-name}", clazz, element))
			resolve(getLevel2PDFSectionName(clazz, element));
		if (needResolve("{clinical-document-code}"))
			resolve(getClinicalDocumentCode(TermPackage.eINSTANCE.getCodeSystemConstraint_Code()));
		if (needResolve("{clinical-document-code-system}"))
			resolve(getClinicalDocumentCode(TermPackage.eINSTANCE.getCodeSystemConstraint_Identifier()));
		if (needResolve("{clinical-document-code-system-name}"))
			resolve(getClinicalDocumentCode(TermPackage.eINSTANCE.getCodeSystemConstraint_Name()));
		if (needResolve("{clinical-document-display-name}"))
			resolve(getClinicalDocumentCode(TermPackage.eINSTANCE.getCodeSystemConstraint_DisplayName()));
		if (needResolve("{uml-context}", clazz))
			resolve(CDACommonUtils.getUmlContext(clazz));
		if (needResolve("{clinical-document-business-name}"))
			resolve(specName);
		if (needResolve("{document-name-abbr}"))
			resolve(specInitials);
		if (needResolve("{cda-property-name}", element))
			resolve(getCdaPropertyName(element));
		if (needResolve("{cda-type}", element))
			resolve(getCdaType(element));
		if (needResolve("{uml-multiplicity}", element))
			resolve(getMultiplicityString(clazz, element));
		if (needResolve("{uml-default-value}", element))
			resolve(getDefault(element));
		if (needResolve("{template-id}", clazz))
			resolve(CDACommonUtils.getTemplateId(clazz));
		if (needResolve("{data-element-level}", clazz, element))
			resolve(getDataElementLevel(clazz, element));
		if (needResolve("{data-element-level-abbr}", clazz, element))
			resolve(getDEL(getDataElementLevel(clazz, element)));
		if (needResolve("{full-xpath}", clazz, element))
			resolve(getFullXPath(clazz, element));
		if (needResolve("{xpath-context}", clazz))
			resolve(getCdaContext(clazz, false));
		if (needResolve("{custom-validation-message}"))
			resolve(getStereotype(element, "validationMessageTemplate"));
		if (needResolve("{severity}", element))
			resolve(getSeverity(element));
		if (this.removeTabAndNewline) {
			this.template = resolve(this.template, "\"", "'");
			this.template = resolve(this.template, "\r", " ");
			this.template = resolve(this.template, "\n", " ");
			this.template = resolve(this.template, "\t", " ");
		}
		if (needResolve("{tab}"))
			resolve("\t");
		if (needResolve("{newline}"))
			resolve("\n");

		return this.template;
	}

	private String getClinicalDocumentCode(EAttribute attribute) {
		if (umlClinicalDocument != null) {
			for (Property property : umlClinicalDocument.getAllAttributes()) {
				CodeSystemConstraint codeSystemConstraint = CDACommonUtils.getCodeSystemConstraint(property);
				if (codeSystemConstraint != null) {
					String result = (String) codeSystemConstraint.eGet(attribute);
					if (result == null && attribute == TermPackage.eINSTANCE.getCodeSystemConstraint_Identifier() &&
							codeSystemConstraint.getReference() != null)
						return codeSystemConstraint.getReference().getIdentifier();
					return result;
				}
			}
		}
		return null;
	}

	private String getSeverity(NamedElement element) {
		if (element instanceof Property && ((Property) element).getAssociation() != null)
			element = ((Property) element).getAssociation();
		Validation cv = CDAProfileUtil.getValidation(element);
		return cv != null
				? cv.getSeverity().toString()
				: null;
	}

	protected String resolve(String template, Class clazz, NamedElement element, String testType) {
		this.template = template;
		if (needResolve("{test-type}", testType))
			resolve(testType);
		return resolve(this.template, clazz, element);
	}

	protected String resolve(String template, Class clazz, NamedElement element, final Constraint constraint) {
		this.template = template;
		if (needResolve("{ocl-constraint-name}", constraint))
			resolve(getConstraintName(constraint));
		if (needResolve("{ocl-constraint}", constraint))
			resolve(getBody(constraint, "OCL"));
		if (needResolve("{analysis}", constraint))
			resolve(getBody(constraint, "Analysis"));
		if (needResolve("{xpath}", constraint))
			resolve(getBody(constraint, "XPath"));
		if (needResolve("{xpath-test}", constraint))
			resolve(getXPathTest(constraint));
		return resolve(this.template, clazz, element);
	}

	abstract protected String getEntityMimeType();

	private String getDefault(NamedElement element) {
		if (element instanceof Property)
			return CDACommonUtils.getDefault((Property) element);
		return null;
	}

	private String getCdaType(NamedElement element) {
		Type cdaT = CDACommonUtils.getType(element);
		if (cdaT != null) {
			if (cdaT.eIsProxy())
				return ((BasicEObjectImpl) cdaT).eProxyURI().toString();
			else
				return cdaT.getName();
		}
		return null;
	}

	private String getCdaPropertyName(NamedElement element) {
		Property baseProperty;
		if (element instanceof Property && (baseProperty = CDACommonUtils.getCDAProperty((Property) element)) != null) {
			return baseProperty.getName();
		}
		return null;
	}

	private String getBody(Constraint constraint, String language) {
		final OpaqueExpression spec = (constraint.getSpecification() instanceof OpaqueExpression)
				? (OpaqueExpression) constraint.getSpecification()
				: null;
		if (spec == null)
			return null;
		int analysisIndex = spec.getLanguages().indexOf(language);
		if (analysisIndex >= 0 && analysisIndex < spec.getBodies().size()) {
			return spec.getBodies().get(analysisIndex);
		}
		return null;
	}

	protected String getConstraintName(Constraint constraint) {
		if (constraint.getName() != null && !"".equals(constraint.getName())) {
			return constraint.getName();
		}
		return constraint.getContext().getName() + "(" +
				(constraint.getContext().getOwnedRules().indexOf(constraint) + 1) + ")";
	}

	/**
	 * @param value
	 * @return
	 */
	protected String escapeAttributeValue(String value) {
		return StringEscapeUtils.escapeHtml(value.replace("\"", "'"));
	}

	private String getDEL(String result) {
		if (DEL_CDA_HEADER == result)
			return "1A";
		if (DEL_CDA_BODY_LEVEL_2 == result)
			return "2";
		if (DEL_CDA_BODY_LEVEL_3 == result)
			return "3A";
		return "NA";
	}

	protected String getDataElementLevel(Class context, Element constrainedElement) {
		StringBuilder unpredicatedContext = new StringBuilder("/cda:ClinicalDocument");
		List<Property> propertyPath = CDACommonUtils.getPropertyPath(context);
		if (constrainedElement instanceof Property) {
			propertyPath.add((Property) constrainedElement);
		}
		for (Property childProperty : propertyPath) {
			Property cdaProperty = CDACommonUtils.getCDAProperty(childProperty);
			if (cdaProperty != null) {
				unpredicatedContext.append("/cda:" + cdaProperty.getName());
			}
		}
		unpredicatedContext.append("/");
		String path = unpredicatedContext.toString();
		if (!path.startsWith("/cda:ClinicalDocument/cda:component")) {
			return DEL_CDA_HEADER;
		} else if (!path.contains("cda:entry/")) {
			return DEL_CDA_BODY_LEVEL_2;
		} else if (path.contains("cda:component/cda:section/")) {
			return DEL_CDA_BODY_LEVEL_3;
		}
		return DEL_CDA_NA;
	}

	/**
	 * @param element
	 * @return
	 */
	protected String getBusinessName(NamedElement element) {
		if (element instanceof Constraint)
			return getConstraintName((Constraint) element);
		String businessName = CDACommonUtils.getBusinessName(element);
		if (businessName != null)
			return businessName;
		return element.getName();
	}

	public static boolean isTemplateId(Element element) {
		if (element instanceof Property) {
			Property property = (Property) element;
			return "templateId".equals(property.getName()) && CDACommonUtils.getCDAProperty(property) == property;
		}
		return false;
	}

	static public String getPDFSection(Class context, Element constrainedElement) {
		if (isTemplateId(constrainedElement)) {
			return CDACommonUtils.getPDFSection(context, true) + "." +
					CDACommonUtils.getCustomizedBulletItem(context, 0);
		}
		return CDACommonUtils.getPDFSection(constrainedElement, true);
	}

	static public String getPDFSectionOrder(Class context, Element constrainedElement) {
		String result = "";
		for (String part : getPDFSection(context, constrainedElement).split("\\.")) {
			result += (part.length() == 1
					? "0" + part
					: part) + ".";
		}
		return result.substring(0, result.length() - 1);
	}

	static public String getLevel2PDFSectionNumber(Class context, Element constrainedElement) {
		String result = CDACommonUtils.getPDFSection(isTemplateId(constrainedElement)
				? context
				: constrainedElement, true, true);
		if (result.indexOf(" ") != -1) {
			return result.substring(0, result.indexOf(" "));
		}
		return result;
	}

	static public String getLevel2PDFSectionName(Class context, Element constrainedElement) {
		String result = CDACommonUtils.getPDFSection(isTemplateId(constrainedElement)
				? context
				: constrainedElement, true, true);
		if (result.indexOf(" ") != -1) {
			return result.substring(result.indexOf(" ") + 1);
		}
		return result;
	}

	public String getConformance(Class context, Element constrainedElement) {
		String result;
		if (isTemplateId(constrainedElement)) {
			result = CDAModelUtil.computeConformanceMessage(context, true).trim();
		} else {
			result = CDACommonUtils.getConformance(constrainedElement).trim();
		}
		if (removeTabAndNewline) {
			result = CDACommonUtils.withoutTags(result);
		}
		return result;
	}

	public String getMultiplicityString(Class context, NamedElement constrainedElement) {
		if (isTemplateId(constrainedElement)) {
			String result = CDACommonUtils.getMultiplicityRange(context);
			if (result != null)
				return result;
			return "1..1";
		} else {
			return CDACommonUtils.getMultiplicityString(constrainedElement);
		}
	}

	public void calcClasses(Class clazz, List<Class> processed) {
		if (clazz == null) {
			processed.addAll(CDACommonUtils.getAllContents(irResources, Class.class));
			return;
		}
		if (processed.contains(clazz))
			return;
		processed.add(clazz);
		for (Property property : CDACommonUtils.allAttributes(clazz)) {
			if (property.getType() instanceof Class && CDACommonUtils.inSameModel((Class) property.getType(), clazz)) {
				Class class1 = (Class) property.getType();
				calcClasses(class1, processed);
			}
		}
	}

	protected String mentionSection(String message, Class clazz, NamedElement element) {
		return "Section " + getPDFSection(clazz, element) + ": " + message;
	}

	protected String getAnchor(File file, String string, String media) {
		java.nio.file.Path pathRelative = Paths.get(genfolder.toURI()).relativize(Paths.get(file.toURI()));
		return "<a href=\"" + pathRelative + "\" type=\"" + media + "\">" + string + "</a> ";
	}

	protected void trace(String string, EObject source, EObject... targets) {
		Trace trace = TraceabilityFactory.eINSTANCE.createTrace();
		trace.setDescription(string);
		trace.getSource().add(source);
		for (EObject participant : targets) {
			trace.getTarget().add(participant);
		}
		TraceabilityUtils.addTrace(currentCategory, trace);
	}

}
