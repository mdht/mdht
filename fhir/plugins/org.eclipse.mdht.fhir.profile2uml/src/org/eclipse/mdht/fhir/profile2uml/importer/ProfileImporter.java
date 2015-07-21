package org.eclipse.mdht.fhir.profile2uml.importer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.hl7.fhir.ConstraintSeverityList;
import org.hl7.fhir.ElementDefinition;
import org.hl7.fhir.ElementDefinitionConstraint;
import org.hl7.fhir.ElementDefinitionType;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureDefinitionKindList;
import org.hl7.fhir.Uri;
import org.hl7.fhir.util.FhirResourceFactoryImpl;
import org.openhealthtools.mdht.uml.validation.Diagnostic;
import org.openhealthtools.mdht.uml.validation.SeverityKind;
import org.openhealthtools.mdht.uml.validation.ValidationPackage;

public class ProfileImporter {
	public static final String MDHT_ANNOTATION_SOURCE = "org.eclipse.mdht";
	public static final String URI_ANNOTATION = "fhir.uri";

	public static final String MDHT_URI_BASE = "http://eclipse.org/mdht/fhir/StructureDefinition/";
	
	// Create non-spec class for Base, abstract parent for Element and Resource, using MDHT_URI_BASE
	public static final String BASE_CLASS_NAME = "Base";

	// Create non-spec class DataType, abstract parent for all 'type' StructureDefinitions, using MDHT_URI_BASE
	public static final String DATATYPE_CLASS_NAME = "DataType";

	public static final String ELEMENT_CLASS_NAME = "Element";
	public static final String BACKBONE_ELEMENT_CLASS_NAME = "BackboneElement";
	public static final String RESOURCE_CLASS_NAME = "Resource";
	
	public static final String UML_LIBRARIES_PATH = "org.eclipse.uml2.uml.resources/libraries/";
	public static final String XML_PRIMITIVE_TYPES_LIBRARY = UML_LIBRARIES_PATH + "XMLPrimitiveTypes.library.uml";

	private String[] constraintLanguages = { "Analysis", "XPath", "OCL" };
	
	private IContainer fhirProfileFolder;
	
	private Package model;
	private Package xmlPrimitiveTypes;
	
	private Class baseClass;
	private Class dataTypeClass;
	private Class elementClass;
	private Class resourceClass;
	
	private Map<String,Type> referenceModelTypeForName = new HashMap<String,Type>();
	private Map<String,Type> referenceModelTypeForURI = new HashMap<String,Type>();
	
	public ProfileImporter(Package model, IContainer cemlFolder) {
		this.model = model;
		this.fhirProfileFolder = cemlFolder;

		initializeLibraries(model);
		catalogMembers(model);
		initAbstractTypes(model);
	}
	
	private void initializeLibraries(Package umlPackage) {
		URI libraryURI = URI.createPlatformPluginURI(XML_PRIMITIVE_TYPES_LIBRARY, false);
		Resource libraryResource = umlPackage.eResource().getResourceSet().getResource(libraryURI, true);
		if (libraryResource != null) {
			for (EObject eObject : libraryResource.getContents()) {
				if (eObject instanceof Package) {
					xmlPrimitiveTypes = (Package) eObject;
					break;
				}
			}
		}
		
		if (xmlPrimitiveTypes != null) {
			PackageImport libraryImport = null;
			for (PackageImport pkgImport : model.getPackageImports()) {
				if (xmlPrimitiveTypes == pkgImport.getImportedPackage()) {
					libraryImport = pkgImport;
					break;
				}
			}
			if (libraryImport == null) {
				model.createPackageImport(xmlPrimitiveTypes);
			}
		}
	}
	
	private void initAbstractTypes(Package umlPackage) {
		/* - create abstract type: Base
		 * - import Element, add extends Base
		 * - import Resource, add extends Base
		 * - create abstract type: DataType, add extends Element
		 */

		baseClass = (Class) referenceModelTypeForURI.get(MDHT_URI_BASE + BASE_CLASS_NAME);
		if (baseClass == null) {
			baseClass = umlPackage.createOwnedClass(BASE_CLASS_NAME, true);
			setURIAnnotation(baseClass, MDHT_URI_BASE + BASE_CLASS_NAME);
		}
		dataTypeClass = (Class) referenceModelTypeForURI.get(MDHT_URI_BASE + DATATYPE_CLASS_NAME);
		if (dataTypeClass == null) {
			dataTypeClass = umlPackage.createOwnedClass(DATATYPE_CLASS_NAME, true);
			setURIAnnotation(dataTypeClass, MDHT_URI_BASE + DATATYPE_CLASS_NAME);
		}
		elementClass = importProfile(ELEMENT_CLASS_NAME);
		resourceClass = importProfile(RESOURCE_CLASS_NAME);
		
		if (elementClass != null && elementClass.getGeneralizations().isEmpty()) {
			elementClass.createGeneralization(baseClass);
		}
		if (resourceClass != null && resourceClass.getGeneralizations().isEmpty()) {
			resourceClass.createGeneralization(baseClass);
		}
	
		if (elementClass != null && dataTypeClass.getGeneralizations().isEmpty()) {
			dataTypeClass.createGeneralization(elementClass);
			// move DataType class to types package
			dataTypeClass.setPackage(elementClass.getNearestPackage());
		}
	}
	
	private void catalogMembers(Package umlPackage) {
		for (NamedElement member : umlPackage.getMembers()) {
			// includes unnamed Associations
			if (member instanceof Class && member.getName() != null) {
				referenceModelTypeForName.put(member.getName(), (Class)member);

				String uri = getURIAnnotation(member);
				if (uri != null) {
					referenceModelTypeForURI.put(uri, (Class)member);
				}
			}
			else if (member instanceof Package) {
				catalogMembers((Package)member);
			}
		}
	}
	
	private String getURIAnnotation(Element element) {
		String uri = null;
		EAnnotation annotation = element.getEAnnotation(MDHT_ANNOTATION_SOURCE);
		if (annotation != null) {
			uri = annotation.getDetails().get(URI_ANNOTATION);
		}
		
		return uri;
	}
	
	private void setURIAnnotation(Element element, String uri) {
		EAnnotation annotation = element.createEAnnotation(MDHT_ANNOTATION_SOURCE);
		annotation.getDetails().put(URI_ANNOTATION, uri);
	}

	public void importAllProfiles() {
		try {
			for (IResource resource : fhirProfileFolder.members()) {
				if (resource instanceof IFile) {
					String fileExt = ((IFile)resource).getFileExtension();
					if ("xml".equals(fileExt)) {
						importProfile((IFile)resource);
					}
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Class importProfile(IFile profileFile) {
		String profileName = profileFile.getName();
		profileName = profileName.substring(0, profileName.lastIndexOf("."));
		Class umlClass = (Class) model.getOwnedType(profileName, false, UMLPackage.eINSTANCE.getClass_(), false);
		
		if (umlClass == null) {
			URI uri = URI.createFileURI(profileFile.getLocation().toString());
			
			ResourceFactoryImpl resourceFactory = new FhirResourceFactoryImpl();
			Resource resource = resourceFactory.createResource(uri);
			try {
				resource.load(new HashMap<String,String>());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
	
			TreeIterator<?> iterator = EcoreUtil.getAllContents(Collections.singletonList(resource));
	
			while (iterator != null && iterator.hasNext()) {
				Object child = iterator.next();
				if (child instanceof StructureDefinition) {
					umlClass = importProfile((StructureDefinition)child);
					break;
				}
			}
		}
		
		return umlClass;
	}

	public Class importProfileForURI(String profileURI) {
		Class umlClass = (Class) referenceModelTypeForURI.get(profileURI);
		if (umlClass == null) {
			/*
			 * TODO not all URIs can be resolved to a file this way, e.g. 
			 * 
			 * http://hl7.org/fhir/StructureDefinition/observation-bodyPosition
			 * extension-observation-bodyposition.xml
			 * - extension prefix, no .profile.xml
			 * 
			 * During import, keep list of pending profiles.
			 */
			String profileName = profileURI.substring(profileURI.lastIndexOf("/") + 1);
			umlClass = importProfile(profileName);
		}
		
		return umlClass;
	}
	
	public Class importProfile(String profileName) {
		Class umlClass = (Class) referenceModelTypeForName.get(profileName);
		if (umlClass == null) {
			IFile profileFile = fhirProfileFolder.getFile(new Path(profileName.toLowerCase() + ".profile.xml"));
			
			if (profileFile.exists()) {
				umlClass = importProfile(profileFile);
			}
			else {
				System.err.println("Cannot find Profile: " + profileName);
			}
		}
		
		return umlClass;
	}
	
	public Class importProfile(StructureDefinition structureDef) {
		//TODO extensions are not supported in this iteration
		if (structureDef.getContextType() != null) {
			return null;
		}
		
		//TODO temporary workaround for bug in FHIR build tool
		if (StructureDefinitionKindList.DATATYPE == structureDef.getKind().getValue()
				&& structureDef.getBase() != null && "http://hl7.org/fhir/StructureDefinition/Element".equals(structureDef.getBase().getValue())) {
			structureDef.setBase(null);
		}
		
		String kindPackageName = structureDef.getKind().getValue().getName();
		if (structureDef.getBase() != null) {
			if (structureDef.getContextType() != null) {
				kindPackageName = "extension";
			}
			else {
				kindPackageName = "constraint";
			}
		}
		Package kindPackage = model.getNestedPackage(kindPackageName, true, UMLPackage.eINSTANCE.getPackage(), true);
		
		String profileClassName = structureDef.getId().getValue();
		boolean isAbstract = structureDef.getAbstract().isValue();
		Class profileClass = kindPackage.createOwnedClass(profileClassName, isAbstract);
		
		setURIAnnotation(profileClass, structureDef.getUrl().getValue());
		referenceModelTypeForName.put(profileClassName, profileClass);
		referenceModelTypeForURI.put(structureDef.getUrl().getValue(), profileClass);
		
		if (structureDef.getDescription() != null) {
			Comment description = profileClass.createOwnedComment();
			description.setBody(structureDef.getDescription().getValue());
		}
		if (structureDef.getRequirements() != null) {
			Comment requirements = profileClass.createOwnedComment();
			requirements.setBody(structureDef.getRequirements().getValue());
		}
		
		// Element has base = Element, check for circular generalization
		if (structureDef.getBase() != null
				&& !structureDef.getUrl().getValue().equals(structureDef.getBase().getValue())) {
			String base = structureDef.getBase().getValue();
			Class baseProfileClass = null;
			if (base.startsWith("http://")) {
				baseProfileClass = importProfileForURI(base);
			}
			else {
				baseProfileClass = importProfile(base);
			}
			
			// Add "DataType" abstract superclass for all data types
			if (StructureDefinitionKindList.DATATYPE.getLiteral().equals(kindPackageName) && baseProfileClass != null 
					&& ELEMENT_CLASS_NAME.equals(baseProfileClass.getName())) {
				baseProfileClass = dataTypeClass;
			}
			
			if (baseProfileClass != null) {
				profileClass.createGeneralization(baseProfileClass);
			}
		}
		
		Map<String,Class> nestedClassMap = new HashMap<String,Class>();

		boolean isProfileElement = true;
		for (ElementDefinition elementDef : structureDef.getDifferential().getElement()) {
			// parse path segments to identify nested classes and property names
			String path = elementDef.getPath().getValue();
//			String[] pathSegments = path.split("\\.");
			
			// Create a typeList, then create a property, and maybe a nested class
			List<Classifier> typeList = new ArrayList<Classifier>();
			for (ElementDefinitionType elementDefType : elementDef.getType()) {
				Classifier typeClass = null;
				if (!elementDefType.getProfile().isEmpty()) {
					for (Uri profileURI : elementDefType.getProfile()) {
						typeClass = importProfileForURI(profileURI.getValue());

						//TODO for now, use only first profile type
						if (typeClass != null) {
							break;
						}
					}
				}
				if (typeClass == null && elementDefType.getCode() != null && elementDefType.getCode().getValue() != null) {
					String typeCode = elementDefType.getCode().getValue();
					String[] typeCodes = typeCode.split(",");
					
					//TODO clarify interpretation of comma-separated value, e.g. in date.profile.xml
					for (int i = 0; i < typeCodes.length; i++) {
						String typeName = typeCodes[i].trim();
						if ("*".equals(typeName)) {
							// TODO this should be limited to Open Type list, http://hl7.org/fhir/2015May/datatypes.html#open
							typeClass = dataTypeClass;
						}
						else if (typeName.startsWith("xs:")) {
							typeClass = getPrimitiveType(typeName);
						}
						else {
							typeClass = importProfile(typeName);
						}
						
						//TODO for now, use only first type from comma-separated list
						if (typeClass != null) {
							break;
						}
					}
				}
				
				if (typeClass != null) {
					typeList.add(typeClass);
				}
			}
			
			if (isProfileElement) {
				// the first ElementDefinition
				isProfileElement = false;
				nestedClassMap.put(path, profileClass);
				
				if (elementDef.getName() != null && elementDef.getName().getValue() != null) {
					profileClass.setName(elementDef.getName().getValue());
				}

				// create generalization only if not created from 'base' profile
				if (profileClass.getGeneralizations().isEmpty() && typeList.size() == 1) {
					Classifier baseType = typeList.get(0);
					//TODO Element has type Element, expand check for circular generalization references
					if (!baseType.equals(profileClass)) {
						// Add "DataType" abstract superclass for all data types
						if (StructureDefinitionKindList.DATATYPE.getLiteral().equals(kindPackageName) && ELEMENT_CLASS_NAME.equals(baseType.getName())) {
							baseType = dataTypeClass;
						}
						
						profileClass.createGeneralization(baseType);
					}
				}

				addComments(profileClass, elementDef);

				// Add profile element constraints
				for (ElementDefinitionConstraint constraint : elementDef.getConstraint()) {
					addConstraint(profileClass, constraint);
				}
				
				// don't create a Property
				continue;
			}
			
			Class ownerClass = null;
			if (path.indexOf(".") == -1) {
				// for type profile definitions, e.g. code.profile.xml
				ownerClass = profileClass;
			}
			else {
				String ownerClassPath = path.substring(0, path.lastIndexOf("."));
				ownerClass = nestedClassMap.get(ownerClassPath);

				if (ownerClass == null) {
					System.err.println("Owner class should never be null: " + ownerClassPath);
					continue;
					
					//TODO for constraint profiles
					// convert property to a nested class, then add new property to this nested class
					// use previous property type as the superclass, e.g. CodeableConcept
					
				}
			}
			
			Classifier propertyType = null;
			if (elementDef.getNameReference() != null) {
				String referencedName = elementDef.getNameReference().getValue();
				propertyType = findReferencedClass(ownerClass, referencedName);
				if (propertyType == null) {
					System.err.println("Cannot find referencedName: " + referencedName + " from: " + path);
				}
			}
			else if (typeList.isEmpty()) {
				// TODO this does not work for constraint profiles..........
				
				// create a new nested class
				String nestedClassName = getClassName(elementDef);
				propertyType = (Class) ownerClass.createNestedClassifier(nestedClassName, UMLPackage.eINSTANCE.getClass_());
				nestedClassMap.put(path, (Class) propertyType);
				
				Class backboneElement = importProfile(BACKBONE_ELEMENT_CLASS_NAME);
				if (backboneElement != null) {
					propertyType.createGeneralization(backboneElement);
				}
			}
			else if (typeList.size() == 1) {
				propertyType = typeList.get(0);
			}
			else if (typeList.size() > 1) {
				// All types must be same kind, some elements mix Resource and CodeableConcept
				if (allSubclassOf(typeList, RESOURCE_CLASS_NAME)) {
					propertyType = resourceClass;
				}
				else if (allSubclassOf(typeList, DATATYPE_CLASS_NAME)) {
					propertyType = dataTypeClass;
				}
				else {
					// TODO in FHIR profiles, Reference is a kind of DataType. Using Base is too general.
					propertyType = baseClass;
				}
			}

			String propertyName = getPropertyName(elementDef);
			Property property = ownerClass.createOwnedAttribute(propertyName, propertyType);
			assignMultiplicity(property, elementDef);
			property.setIsOrdered(true);
			if (isAssociation(property)) {
				createAssociation(ownerClass, property);
			}
			//TODO redefined or subsetted from RM property

			addComments(property, elementDef);
			
			// Add constraints
			for (ElementDefinitionConstraint constraint : elementDef.getConstraint()) {
				Class context = ownerClass;
				if (property.getType().getOwner() instanceof Class) {
					// This is a context element definition for a nested class
					context = (Class) property.getType();
				}
				addConstraint(context, constraint);
			}
		}
		
		return profileClass;
	}
	
	private void addComments(Element umlElement, ElementDefinition elementDef) {
		if (elementDef.getShort() != null) {
			Comment comment = umlElement.createOwnedComment();
			comment.setBody(elementDef.getShort().getValue());
		}
		if (elementDef.getDefinition() != null) {
			Comment comment = umlElement.createOwnedComment();
			comment.setBody(elementDef.getDefinition().getValue());
			
			// assure that definition is first comment, for display in UML tooling
			umlElement.getOwnedComments().move(0, comment);
		}
		if (elementDef.getComments() != null) {
			Comment comment = umlElement.createOwnedComment();
			comment.setBody(elementDef.getComments().getValue());
		}
		if (elementDef.getRequirements() != null) {
			Comment comment = umlElement.createOwnedComment();
			comment.setBody(elementDef.getRequirements().getValue());
		}
	}

	/**
	 * Determines the class-name that the element would have if it was defining
	 * a class. This means it uses "name", if present, and the last "path"
	 * component otherwise.
	 * 
	 * @param elementDef
	 * @return
	 */
	private String getClassName(ElementDefinition elementDef) {
		String name = null;
		if (elementDef.getName() != null && elementDef.getName().getValue() != null) {
			name = elementDef.getName().getValue();
		}
		else {
			String[] path = elementDef.getPath().getValue().split("\\.");
			name = path[path.length - 1];
		}
		
		//TODO toUpperCamelCase, remove "-" etc.
		StringBuffer camelCaseNameBuffer = new StringBuffer();
		camelCaseNameBuffer.append(name.substring(0, 1).toUpperCase());
		camelCaseNameBuffer.append(name.substring(1));
		name = camelCaseNameBuffer.toString();
		
		return name;
	}
	
	/**
	 * Determines the property from the last "path" component.
	 * 
	 * @param elementDef
	 * @return
	 */
	private String getPropertyName(ElementDefinition elementDef) {
		String[] path = elementDef.getPath().getValue().split("\\.");
		if (path.length == 1) {
			// type profiles have a simple path, e.g. 'value'
			return path[0];
		}
		else {
			return path[path.length - 1];
		}
	}
	
	private PrimitiveType getPrimitiveType(String typeName) {
		PrimitiveType primitiveType = null;
		/*
		 * TODO if prefix == xs:, strip prefix and make first char upper case
		 */
		
		if (typeName.startsWith("xs:")) {
			String name = typeName.substring(3);			
			primitiveType = (PrimitiveType) xmlPrimitiveTypes.getOwnedType(name, true, UMLPackage.eINSTANCE.getPrimitiveType(), false);
		}
		
		return primitiveType;
	}
	
	/**
	 * ElementDefinition.referencedName is not guaranteed to be globally unique in a structure, but
	 * must be unique within a context class.  Start with given context class, then search within owner classes.
	 * This logic would be a lot simpler if names were globally unique within a StructureDefinition.
	 * 
	 * @param context
	 * @param referencedName
	 * @return
	 */
	private Class findReferencedClass(Class context, String referencedName) {
		return findReferencedClass(context, referencedName, new HashSet<Classifier>());
	}
	
	private Class findReferencedClass(Class context, String referencedName, Set<Classifier> excluded) {
		if (excluded.contains(context)) {
			return null;
		}
		excluded.add(context);
		
		Class referencedClass = null;
		if (referencedName.equalsIgnoreCase(context.getName())) {
			referencedClass = context;
		}
		else {
			for (Classifier nested : context.getNestedClassifiers()) {
				if (nested instanceof Class) {
					// use case-insensitive name, class name may have been changed to upper
					if (nested instanceof Class && referencedName.equalsIgnoreCase(nested.getName())) {
						referencedClass = (Class) nested;
						break;
					}
					
					// In some cases, such as ValueSet.compose.include.concept.designation
					// we need to traverse down into nested-nested classes of a parent to find the target
					referencedClass = findReferencedClass((Class)nested, referencedName, excluded);
					if (referencedClass != null) {
						break;
					}
				}
			}
		}
		
		if (referencedClass == null && context.getOwner() instanceof Class) {
			referencedClass = findReferencedClass((Class) context.getOwner(), referencedName, excluded);
		}
		return referencedClass;
	}
	
//	private boolean isKindOf(Classifier umlClass, String parentName) {
//		for (Classifier parent : umlClass.allParents()) {
//			if (parentName.equals(parent.getName())) {
//				return true;
//			}
//		}
//		return false;
//	}

	private boolean allSubclassOf(List<Classifier> typeList, String parentName) {
		for (Classifier classifier : typeList) {
			boolean foundIt = false;
			for (Classifier parent : classifier.allParents()) {
				if (parentName.equals(parent.getName())) {
					foundIt = true;
					break;
				}
			}
			if (!foundIt) {
				return false;
			}
		}
		return true;
	}

	private boolean isSubclassOf(Classifier umlClass, String parentName) {
		for (Classifier parent : umlClass.allParents()) {
			if (parentName.equals(parent.getName())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Association if property type is a subclass of DomainResource, or type is a nested class.
	 */
	private boolean isAssociation(Property property) {
		if (property.getType() instanceof Classifier 
				&& (isSubclassOf((Classifier)property.getType(), RESOURCE_CLASS_NAME) 
						|| property.getType().getOwner() instanceof Class)) {
			return true;
		}
		
		return false;
	}

	private Property createAssociation(Class sourceClass, Property targetProp) {
		if (isAssociation(targetProp)) {
			Association association = (Association) sourceClass.getNearestPackage().createOwnedType(null, UMLPackage.eINSTANCE.getAssociation());
			Property sourceProp = UMLFactory.eINSTANCE.createProperty();
			sourceProp.setType(sourceClass);
			sourceProp.setLower(1);
			sourceProp.setUpper(1);
			association.getOwnedEnds().add(sourceProp);
			association.getMemberEnds().add(targetProp);
			
			// associations to nested classes must be composite
			if (targetProp.getType().getOwner() instanceof Class) {
				targetProp.setAggregation(AggregationKind.COMPOSITE_LITERAL);
			}
		}
		
		return targetProp;
	}
	
	private void assignMultiplicity(Property property, ElementDefinition elementDef) {
		int lower = 0;
		int upper = 1;
		
		if (elementDef.getMin() != null) {
			lower = elementDef.getMin().getValue();
		}
		if (elementDef.getMax() != null) {
			String max = elementDef.getMax().getValue();
			if ("*".equals(max)) {
				upper = -1;
			}
			else {
				try {
					upper = Integer.parseInt(max);
				}
				catch (NumberFormatException e) {
					// TODO error handling
					System.err.println("Invalid max cardinality: " + max + " on " + property.getQualifiedName());
				}
			}
		}
		
		property.setLower(lower);
		property.setUpper(upper);
	}
	
	private void addConstraint(Element umlElement, ElementDefinitionConstraint fhirConstraint) {
		Constraint umlConstraint = null;

		if (umlElement instanceof Namespace) {
			umlConstraint = ((Namespace) umlElement).createOwnedRule(null);
		} else if (umlElement.getOwner() instanceof Namespace) {
			Namespace ns = (Namespace) umlElement.getOwner();
			umlConstraint = ns.createOwnedRule(null);
		}
		umlConstraint.getConstrainedElements().add(umlElement);
		
		if (fhirConstraint.getKey() != null) {
			umlConstraint.setName(fhirConstraint.getKey().getValue());
		}

		if (fhirConstraint.getRequirements() != null) {
			umlConstraint.createOwnedComment().setBody(fhirConstraint.getRequirements().getValue());
		}
		
		OpaqueExpression spec = (OpaqueExpression) umlConstraint.createSpecification(
				null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
		
//		if (fhirConstraint.getHuman() != null) {
//			spec.getLanguages().add(constraintLanguages[0]);
//			spec.getBodies().add(fhirConstraint.getHuman().getValue());
//		}
		if (fhirConstraint.getXpath() != null) {
			spec.getLanguages().add(constraintLanguages[1]);
			spec.getBodies().add(fhirConstraint.getXpath().getValue());
		}

		Stereotype diagnosticStereo = umlConstraint.getApplicableStereotype("Validation::Diagnostic");
		if (diagnosticStereo != null) {
			EObject instance = umlConstraint.applyStereotype(diagnosticStereo);
			EStructuralFeature code = instance.eClass().getEStructuralFeature("code");
			if (code != null) {
				instance.eUnset(code); // initialize the code to blank
			}
			
			Diagnostic diagnostic = (Diagnostic) EcoreUtil.getObjectByType(
				umlConstraint.getStereotypeApplications(), ValidationPackage.Literals.DIAGNOSTIC);
			if (diagnostic != null) {
				if (fhirConstraint.getSeverity() != null) {
					if (ConstraintSeverityList.WARNING == fhirConstraint.getSeverity().getValue()) {
						diagnostic.setSeverity(SeverityKind.WARNING);
					}
					else {
						diagnostic.setSeverity(SeverityKind.ERROR);
					}
				}

				if (fhirConstraint.getHuman() != null) {
					diagnostic.setMessage(fhirConstraint.getHuman().getValue());
				}
			}
		}
	}

	/*
	private void addSubsettedProperty(Class cemClass, Property property, String rmPropertyName) {
		Class rmClass = AMLUtil.referenceModelType(cemClass);
		if (rmClass != null) {
			Property rmProperty = rmClass.getOwnedAttribute(rmPropertyName, null);
			if (rmProperty != null) {
				property.getSubsettedProperties().add(rmProperty);
			}
		}
	}
	*/
	
}
