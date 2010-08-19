/*******************************************************************************
 * Copyright (c) 2008, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Sean Muir (JKM Software) - Added support for MIF associations
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.mif2uml.internal.exporter;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.emf.hl7.mif2.ArtifactKind;
import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndSpecialization;
import org.openhealthtools.mdht.emf.hl7.mif2.Attribute;
import org.openhealthtools.mdht.emf.hl7.mif2.AttributeDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.ClassDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.ClassElement;
import org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralization;
import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainRef;
import org.openhealthtools.mdht.emf.hl7.mif2.ConformanceKind;
import org.openhealthtools.mdht.emf.hl7.mif2.ContextAnnotation;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef;
import org.openhealthtools.mdht.emf.hl7.mif2.DesignComment;
import org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot;
import org.openhealthtools.mdht.emf.hl7.mif2.DomainKind;
import org.openhealthtools.mdht.emf.hl7.mif2.EntryPoint;
import org.openhealthtools.mdht.emf.hl7.mif2.EntryPointAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.FlatClass;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalStaticModel;
import org.openhealthtools.mdht.emf.hl7.mif2.Header;
import org.openhealthtools.mdht.emf.hl7.mif2.Legalese;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Factory;
import org.openhealthtools.mdht.emf.hl7.mif2.ModelConformanceKind;
import org.openhealthtools.mdht.emf.hl7.mif2.OtherAnnotation;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageKind;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRootKind;
import org.openhealthtools.mdht.emf.hl7.mif2.RenderingInformation;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModel;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelRepresentationKind;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelUseKind;
import org.openhealthtools.mdht.emf.hl7.mif2.UnlimitedMultiplicity;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularySpecification;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;
import org.openhealthtools.mdht.uml.hdf.util.RIMProfileUtil;
import org.openhealthtools.mdht.uml.hl7.core.util.DatatypeConstants;
import org.openhealthtools.mdht.uml.hl7.mif2uml.internal.importer.DiagnosticsHelper;

/**
 * UMLProcessor implements the UML to MIF logic to support the MIF export.   
 *
 */
public class UMLProcessor extends UMLSwitch<Object> {
		
	/**
	 * GeneralizationProcessor creates the child class tags from uml
	 * generalizations. MIF is the opposite of UML with regard to inheritance
	 * definitions that instead of the child knowing its parent and the parent
	 * not knowing the child in uml - mif parents know all the children and the
	 * child is oblivious to its parent.
	 * 
	 * There is a one to one relationship between packages and mif model files.
	 * We therefore need to have all the mif model files open and available for
	 * modification in order to export the generalization properly.
	 * 
	 * @author eclipse
	 * 
	 */
	public class GeneralizationProcessor extends UMLSwitch<Object>
	{

		public Object caseGeneralization(Generalization generalization) {

			Classifier general = generalization.getGeneral();

			Classifier specific = generalization.getSpecific();

			boolean found = false;

			// If the mif general model where the parent class is defined has been loaded 
			if (mifModels.containsKey(general.getNearestPackage().getName())) {

				// loop over mif definitions to find parent class
				for (ClassElement classElement : mifModels.get(general.getNearestPackage().getName()).getContainedClass()) {

					if (general.getName() != null && general.getName().equals(classElement.getClass_().getName())) {

						found = true;

						ClassGeneralization classGeneralization = Mif2Factory.eINSTANCE.createClassGeneralization();

						// if the parent and child class in the generalization are in the same mif model then use name else use cmet name
						if (general.getNearestPackage().getName().equals(specific.getNearestPackage().getName())) {
							classGeneralization.setName(specific.getName());
						} else {
							String cmet = popIFCAnnotation(specific);
							classGeneralization.setName((cmet != null) ? cmet : specific.getName());

						}

						classElement.getClass_().getChildClass().add(classGeneralization);

						break;

					}
				}
			}
			
			if (!found)
			{
				diagnostics.error("Cannot resolve Generalization " , generalization);
			}

			return generalization;
		}
	}
	
	/** Errors and warnings created by this transformation. */
	private DiagnosticsHelper diagnostics = new DiagnosticsHelper();

	private final static String MIF_SCHEMA_VERSION = "2.1.2";

	private final static String STATIC_MODEL_DERIVATION_ID = "1";
	
	DocumentRoot root = null;

	private StaticModel mifModel;

	private ClassElement currentMifClass = null;

	GeneralizationProcessor generalizationProcessor = new GeneralizationProcessor();

	private HashMap<String,StaticModel > mifModels = new HashMap<String,StaticModel>();
	
	private HashMap<String,Resource > mifResources = new HashMap<String,Resource>();
	
	/**
	 * Default ctor
	 */
	public UMLProcessor() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseAssociation(org.eclipse.uml2.uml.Association)
	 */
	@Override
	public Object caseAssociation(Association association) {
		

		int sortOrder = 1;

		org.openhealthtools.mdht.emf.hl7.mif2.Association mif2Association = Mif2Factory.eINSTANCE.createAssociation();
		
		org.openhealthtools.mdht.emf.hl7.mif2.AssociationEnd mif2TraversableAssociationEnd = Mif2Factory.eINSTANCE.createAssociationEnd();
		
		org.openhealthtools.mdht.emf.hl7.mif2.NonTraversableAssociationEnd mif2NonTraversableAssociationEnd = Mif2Factory.eINSTANCE.createNonTraversableAssociationEnd();
		
		AssociationEndDerivation associationEndDerivation = Mif2Factory.eINSTANCE.createAssociationEndDerivation();
		
		associationEndDerivation.setStaticModelDerivationId(STATIC_MODEL_DERIVATION_ID);
		
		// Check to see if the association has choice items
		
		Stereotype choiceContent = HL7ResourceUtil.getAppliedHDFStereotype(association, IHDFProfileConstants.CHOICE_CONTENT);
		
		if (choiceContent != null) {

			List choiceList = (List) association.getValue(choiceContent, IHDFProfileConstants.CHOICE_MEMBERS);

			EList<AssociationEndSpecialization> currentChoiceList = mif2TraversableAssociationEnd.getChoiceItem();

			AssociationEndSpecialization associationEndSpecialization;

			for (int choiceCtr = 0; choiceCtr < choiceList.size(); choiceCtr++) {
				
				String member = IHDFProfileConstants.CHOICE_MEMBERS + "[" + choiceCtr + "]";
				String choiceTarget = member + NamedElement.SEPARATOR + IHDFProfileConstants.CHOICE_TARGET;
				String traversalName = member + NamedElement.SEPARATOR + IHDFProfileConstants.TRAVERSAL_NAME;

				Class target = (Class) association.getValue(choiceContent, choiceTarget);
				
				if (target != null) {

					String name = (String) association.getValue(choiceContent, traversalName);

					associationEndSpecialization = Mif2Factory.eINSTANCE.createAssociationEndSpecialization();
				
					String cmet = popIFCAnnotation(target);

					if (cmet != null) {
						associationEndSpecialization.setClassName(cmet);
					} else {
						if (target != null) {
							associationEndSpecialization.setClassName(target.getName());
						}
					}

					associationEndSpecialization.setTraversalName(name);

					Stereotype choiceGroup = HL7ResourceUtil.getAppliedHDFStereotype(target, IHDFProfileConstants.CHOICE_GROUP);

					currentChoiceList.add(associationEndSpecialization);

					// If the target is a choice group - create sub choice group content
					if (choiceGroup != null) {
						currentChoiceList = associationEndSpecialization.getChoiceItem();

					}
				}

			}

		}
				
		for (Property property : association.getMemberEnds())
		{			
			if (property.isNavigable()) {

				if (property.getType() != null) {
					String ownerName = property.getType().getName(); 

					String cmet = popIFCAnnotation(property.getType());

					if (cmet != null) {
						mif2TraversableAssociationEnd.setParticipantClassName(cmet);
					} else {
					mif2TraversableAssociationEnd.setParticipantClassName(ownerName);
					}
					associationEndDerivation.setClassName(ownerName);

				}

				associationEndDerivation.setAssociationEndName(createAssociationEndName(property));

				mif2TraversableAssociationEnd.setName(property.getName());

				mif2TraversableAssociationEnd.setMinimumMultiplicity(new BigInteger(String.valueOf(property.getLower())));

				if (property.getLower() > 0) {
					mif2TraversableAssociationEnd.setIsMandatory(true);
				} else {
					mif2TraversableAssociationEnd.setIsMandatory(false);
				}

				mif2TraversableAssociationEnd.setConformance(ConformanceKind.R);

				if (property.getUpper() == LiteralUnlimitedNatural.UNLIMITED) {
					mif2TraversableAssociationEnd.setMaximumMultiplicity(UnlimitedMultiplicity.get("*"));
				} else {
					mif2TraversableAssociationEnd.setMaximumMultiplicity(new BigInteger(String.valueOf(property.getUpper())));
				}

	
				String cmet = popIFCAnnotation(property.getType());

				if (cmet != null) {
					mif2NonTraversableAssociationEnd.setParticipantClassName(cmet);
				} else {
					mif2NonTraversableAssociationEnd.setParticipantClassName(property.getOtherEnd().getType().getName());
				}
				
								
				mif2Association.getTraversableConnection().add(mif2TraversableAssociationEnd);

				mif2NonTraversableAssociationEnd.getDerivedFrom().add(associationEndDerivation);

				mif2Association.getNonTraversableConnection().add(mif2NonTraversableAssociationEnd);

			}
		}	
		
	

		mifModel.getAssociation().add(mif2Association);

		return association;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseClass(org.eclipse.uml2.uml.Class)
	 */
	public Object caseClass(Class umlClass) {
		
		
		
		Stereotype appliedStereotype = RIMProfileUtil.getRIMStereotype(umlClass);

		if (appliedStereotype != null) {

			currentMifClass = Mif2Factory.eINSTANCE.createClassElement();

			FlatClass flatClass = Mif2Factory.eINSTANCE.createFlatClass();

			flatClass.setIsAbstract(umlClass.isAbstract());

			flatClass.setName(umlClass.getName());

			flatClass.getDerivedFrom().add(createRimClassDerivation(umlClass));


			
			// Ugh - nasty loop to set the annotations
			for (org.eclipse.uml2.uml.Comment comment : umlClass.getOwnedComments())
			{
				
				ComplexMarkupWithLanguage complexMarkupWithLanguage = Mif2Factory.eINSTANCE.createComplexMarkupWithLanguage();
				
				FeatureMapUtil.addText(complexMarkupWithLanguage.getMixed(), comment.getBody() );		
				
				flatClass.setAnnotations(Mif2Factory.eINSTANCE.createClassAnnotations() );
				
				flatClass.getAnnotations().setDocumentation(Mif2Factory.eINSTANCE.createDocumentation());
				
				
				  
				
				if (HL7ResourceUtil.getAppliedHDFStereotype(comment, IHDFProfileConstants.DEFINITION)!=null )
				{
					
					flatClass.getAnnotations().getDocumentation().setDefinition(Mif2Factory.eINSTANCE.createCascadableAnnotation() );
					
					flatClass.getAnnotations().getDocumentation().getDefinition().getText().add(complexMarkupWithLanguage);		
					
					
				}
				
				if (HL7ResourceUtil.getAppliedHDFStereotype(comment, IHDFProfileConstants.DESCRIPTION)!=null )
				{
					flatClass.getAnnotations().getDocumentation().setDescription(Mif2Factory.eINSTANCE.createCascadableAnnotation());
					
					flatClass.getAnnotations().getDocumentation().getDescription().getText().add(complexMarkupWithLanguage);		
				}			
			
				if (HL7ResourceUtil.getAppliedHDFStereotype(comment, IHDFProfileConstants.DESIGN_COMMENTS)!=null )
				{					
					DesignComment designComment = Mif2Factory.eINSTANCE.createDesignComment();
					
					designComment.getText().add(complexMarkupWithLanguage);
					
					flatClass.getAnnotations().getDocumentation().getDesignComments().add(designComment);		
				} 
				
//				if (comment.getAppliedStereotype(HDFOPEN_ISSUES) != null) {
//					flatClass.getAnnotations().getDocumentation().getDescription().getText().add(complexMarkupWithLanguage);
//				}

				if (HL7ResourceUtil.getAppliedHDFStereotype(comment, IHDFProfileConstants.OTHER_ANNOTATION)  != null) {
					OtherAnnotation otherAnnotation = Mif2Factory.eINSTANCE.createOtherAnnotation();
					
					otherAnnotation.getText().add(complexMarkupWithLanguage);
					
					flatClass.getAnnotations().getDocumentation().getOtherAnnotation().add(otherAnnotation);
				}

				if (HL7ResourceUtil.getAppliedHDFStereotype(comment, IHDFProfileConstants.RATIONALE)  != null) {
					
					flatClass.getAnnotations().getDocumentation().setDescription(Mif2Factory.eINSTANCE.createCascadableAnnotation());
					
					flatClass.getAnnotations().getDocumentation().getDescription().getText().add(complexMarkupWithLanguage);
				}

				if ( HL7ResourceUtil.getAppliedHDFStereotype(comment, IHDFProfileConstants.REFERENCES)  != null) {
					flatClass.getAnnotations().getDocumentation().getDescription().getText().add(complexMarkupWithLanguage);
				}

				if (HL7ResourceUtil.getAppliedHDFStereotype(comment, IHDFProfileConstants.REQUIREMENTS)  != null) {
					
					flatClass.getAnnotations().getDocumentation().setRequirements(Mif2Factory.eINSTANCE.createContextAnnotation());
					
					flatClass.getAnnotations().getDocumentation().getRequirements().getText().add(complexMarkupWithLanguage);
				}

				if (HL7ResourceUtil.getAppliedHDFStereotype(comment, IHDFProfileConstants.USAGE_NOTES)  != null) {
					
					ContextAnnotation contextAnnotation =  Mif2Factory.eINSTANCE.createContextAnnotation();
					
					contextAnnotation.getText().add(complexMarkupWithLanguage);
					
					flatClass.getAnnotations().getDocumentation().getUsageNotes().add(contextAnnotation);
				}

				if (HL7ResourceUtil.getAppliedHDFStereotype(comment, IHDFProfileConstants.WALKTHROUGH)  != null) {
					
					flatClass.getAnnotations().getDocumentation().setWalkthrough(Mif2Factory.eINSTANCE.createContextAnnotation());
					
					flatClass.getAnnotations().getDocumentation().getWalkthrough().getText().add(complexMarkupWithLanguage);
				}
				
			}		

			currentMifClass.setClass(flatClass);

			mifModel.getContainedClass().add(currentMifClass);

			// Is the class realizing a interface - if so check to see if it is a "EntryPoint" and add to the MIF
			if (!umlClass.getInterfaceRealizations().isEmpty()) {

				for (InterfaceRealization interfaceRealization : umlClass.getInterfaceRealizations()) {

					Interface contract = interfaceRealization.getContract();

					Stereotype hdfStereotype =HL7ResourceUtil.getAppliedHDFStereotype(contract, IHDFProfileConstants.ENTRY_POINT); 
					if (hdfStereotype  != null) {
						//create an empty mif2 entry point
						EntryPoint entryPoint = Mif2Factory.eINSTANCE.createEntryPoint();

						entryPoint.setId(contract.getNearestPackage().getName());

						entryPoint.setName(contract.getName());

						entryPoint.setClassName(umlClass.getName());

						EntryPointAnnotations epa = Mif2Factory.eINSTANCE.createEntryPointAnnotations();

						epa.setDocumentation(Mif2Factory.eINSTANCE.createDocumentation());

						epa.getDocumentation().setDescription(Mif2Factory.eINSTANCE.createCascadableAnnotation());

						ComplexMarkupWithLanguage complexMarkupWithLanguage = Mif2Factory.eINSTANCE.createComplexMarkupWithLanguage();
						
						EnumerationLiteral useKind = (EnumerationLiteral)contract.getValue(hdfStereotype , "useKind");
												
						if (useKind != null)
						{
							entryPoint.setUseKind(StaticModelUseKind.get(useKind.getLabel()));	
						}
			
					
					
						for (org.eclipse.uml2.uml.Comment comment : contract.getOwnedComments())
						{
							FeatureMapUtil.addText(complexMarkupWithLanguage.getMixed(), comment.getBody() );	
						}
											
						epa.getDocumentation().getDescription().getText().add(complexMarkupWithLanguage);

						entryPoint.setAnnotations(epa);

						mifModel.getEntryPoint().add(entryPoint);
					}
				}
			}
		}			

		return umlClass;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.uml.util.UMLSwitch#casePackage(org.eclipse.uml2.uml.Package)
	 */
	public Object casePackage(Package umlPackage) {

		mapMifModelAttributes(umlPackage);

		return mifModel;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseProperty(org.eclipse.uml2.uml.Property)
	 */
	public Object caseProperty(Property umlProperty) {
		
		
		Stereotype appliedStereotype = RIMProfileUtil.getRIMStereotype(umlProperty.getOwner());

		if (appliedStereotype != null) {

		Stereotype hdfStereoptype = HL7ResourceUtil.getAppliedHDFStereotype(umlProperty, IHDFProfileConstants.HDF_ATTRIBUTE); 
		
		Attribute attribute = null;
		if (hdfStereoptype != null) {
			attribute = Mif2Factory.eINSTANCE.createAttribute();
			//map attribute name
			attribute.setName(umlProperty.getName());

			//map Mif attribute multiplicity from UML Property's 
			mapMultiplicity(umlProperty, attribute);

			//get the umlProperty sortKey attribute and set it to Mif attribute sortKey
			String sortKey = (String) umlProperty.getValue(hdfStereoptype, IHDFProfileConstants.SORT_KEY);
			attribute.setSortKey(sortKey);

			Boolean isImmutable = (Boolean) umlProperty.getValue(hdfStereoptype, IHDFProfileConstants.IS_IMMUTABLE);
			if (isImmutable != null) {
				attribute.setIsImmutable(isImmutable);
			}

			Boolean isMandatory = (Boolean) umlProperty.getValue(hdfStereoptype, IHDFProfileConstants.IS_MANDATORY);
			if (isMandatory != null) {
				attribute.setIsMandatory(isMandatory);
			}

			//map attribute data type
			mapDatatype(umlProperty, attribute);
			
			AttributeDerivation attributeDerivation = Mif2Factory.eINSTANCE.createAttributeDerivation();
			
			attributeDerivation.setStaticModelDerivationId(STATIC_MODEL_DERIVATION_ID);
			
			attributeDerivation.setClassName(appliedStereotype.getName());
			
			attributeDerivation.setAttributeName(umlProperty.getName());
			
			attribute.getDerivedFrom().add(attributeDerivation );
			
			// Ugh - nasty loop to set the annotations
			for (org.eclipse.uml2.uml.Comment comment : umlProperty.getOwnedComments())
			{
				
				ComplexMarkupWithLanguage complexMarkupWithLanguage = Mif2Factory.eINSTANCE.createComplexMarkupWithLanguage();
				
				FeatureMapUtil.addText(complexMarkupWithLanguage.getMixed(), comment.getBody() );		
				
				attribute.setAnnotations(Mif2Factory.eINSTANCE.createAttributeAnnotations() );
				
				attribute.getAnnotations().setDocumentation(Mif2Factory.eINSTANCE.createDocumentation());
				
				if (HL7ResourceUtil.getAppliedHDFStereotype(comment, IHDFProfileConstants.DEFINITION) !=null )
				{
					
					attribute.getAnnotations().getDocumentation().setDefinition(Mif2Factory.eINSTANCE.createCascadableAnnotation() );
					
					attribute.getAnnotations().getDocumentation().getDefinition().getText().add(complexMarkupWithLanguage);		
					
					
				}
				
				if (HL7ResourceUtil.getAppliedHDFStereotype(comment, IHDFProfileConstants.DESCRIPTION) !=null )
				{
					attribute.getAnnotations().getDocumentation().setDescription(Mif2Factory.eINSTANCE.createCascadableAnnotation());
					
					attribute.getAnnotations().getDocumentation().getDescription().getText().add(complexMarkupWithLanguage);		
				}			
			
				if (HL7ResourceUtil.getAppliedHDFStereotype(comment, IHDFProfileConstants.DESIGN_COMMENTS) !=null )
				{					
					DesignComment designComment = Mif2Factory.eINSTANCE.createDesignComment();
					
					designComment.getText().add(complexMarkupWithLanguage);
					
					attribute.getAnnotations().getDocumentation().getDesignComments().add(designComment);		
				} 
				

				if (HL7ResourceUtil.getAppliedHDFStereotype(comment, IHDFProfileConstants.OTHER_ANNOTATION)  != null) {
					OtherAnnotation otherAnnotation = Mif2Factory.eINSTANCE.createOtherAnnotation();
					
					otherAnnotation.getText().add(complexMarkupWithLanguage);
					
					attribute.getAnnotations().getDocumentation().getOtherAnnotation().add(otherAnnotation);
				}

				if (HL7ResourceUtil.getAppliedHDFStereotype(comment, IHDFProfileConstants.RATIONALE) != null) {
					attribute.getAnnotations().getDocumentation().setDescription(Mif2Factory.eINSTANCE.createCascadableAnnotation());
					
					attribute.getAnnotations().getDocumentation().getDescription().getText().add(complexMarkupWithLanguage);
				}

				if (HL7ResourceUtil.getAppliedHDFStereotype(comment, IHDFProfileConstants.REFERENCES)  != null) {
					attribute.getAnnotations().getDocumentation().getDescription().getText().add(complexMarkupWithLanguage);
				}

				if (HL7ResourceUtil.getAppliedHDFStereotype(comment, IHDFProfileConstants.REQUIREMENTS) != null) {
					
					attribute.getAnnotations().getDocumentation().setRequirements(Mif2Factory.eINSTANCE.createContextAnnotation());
					
					attribute.getAnnotations().getDocumentation().getRequirements().getText().add(complexMarkupWithLanguage);
				}

				if (HL7ResourceUtil.getAppliedHDFStereotype(comment, IHDFProfileConstants.USAGE_NOTES)  != null) {
					
					ContextAnnotation contextAnnotation =  Mif2Factory.eINSTANCE.createContextAnnotation();
					
					contextAnnotation.getText().add(complexMarkupWithLanguage);
					
					attribute.getAnnotations().getDocumentation().getUsageNotes().add(contextAnnotation);
				}

				if (HL7ResourceUtil.getAppliedHDFStereotype(comment, IHDFProfileConstants.WALKTHROUGH) != null) {
					
					attribute.getAnnotations().getDocumentation().setWalkthrough(Mif2Factory.eINSTANCE.createContextAnnotation());
					
					attribute.getAnnotations().getDocumentation().getWalkthrough().getText().add(complexMarkupWithLanguage);
				}
				
			}		
			

			if (currentMifClass != null)
			{
				if (currentMifClass.getClass_() != null)
				{
					if (currentMifClass.getClass_().getAttribute() != null)
					{
						currentMifClass.getClass_().getAttribute().add(attribute);			
					}
				}
			}
		}
		
//		Vocabulary Version Issue currently on SMD import - Requiring codingStrength on vocabularyspecification on attributes which is not a attribute on the current MIF2 emf

		if (umlProperty.getAppliedStereotype("HDF::CodeSystemConstraint") != null) {

			Stereotype codeSystemConstraint = umlProperty.getAppliedStereotype("HDF::CodeSystemConstraint");

			VocabularySpecification vocabularySpecification = Mif2Factory.eINSTANCE.createVocabularySpecification();

			VocabularyCodeRef vocabularyCodeRef = Mif2Factory.eINSTANCE.createVocabularyCodeRef();

			vocabularyCodeRef.setCode((String) umlProperty.getValue(codeSystemConstraint, "code"));

			vocabularyCodeRef.setCodeSystemName((String) umlProperty.getValue(codeSystemConstraint, "name"));

			vocabularySpecification.setCode(vocabularyCodeRef);
						
			attribute.setVocabulary(vocabularySpecification);

		}

		if (umlProperty.getAppliedStereotype("HDF::ConceptDomainConstraint") != null) {

			Stereotype conceptDomainConstraint = umlProperty.getAppliedStereotype("HDF::ConceptDomainConstraint");

			VocabularySpecification vocabularySpecification = Mif2Factory.eINSTANCE.createVocabularySpecification();

			ConceptDomainRef conceptDomainRef = Mif2Factory.eINSTANCE.createConceptDomainRef();

			conceptDomainRef.setName((String) umlProperty.getValue(conceptDomainConstraint, "name"));

			vocabularySpecification.setConceptDomain(conceptDomainRef);

			attribute.setVocabulary(vocabularySpecification);

		}

		}
		return umlProperty;
	}
	
	/**
	 * 
	 * TODO very ugly bit of logic need to refactor
	 * 
	 * walk the steroetype hierachy to get association end name
	 * @param property
	 * @return
	 */
	private String createAssociationEndName(Property property)
	{
		String result = "*****************************unknown";
		
		Stereotype appliedStereotype = RIMProfileUtil.getRIMStereotype(property.getType());

		if (appliedStereotype != null) {
			List<String> parents = RIMProfileUtil.getAllParentNames(appliedStereotype);
			for (String parent : parents) {
				if ("Role".equals(parent)) {
					result = "participation";
				} else {
					if ("Act".equals(parent)) {
						result = "inboundRelationship";
					} else {
						if ("Entity".equals(parent)) {
							result = "scopedRole";
						} else {
							if ("Participation".equals(parent)) {
								result = "participation";
							} else {
								if ("ActRelationship".equals(parent)) {
									result = "source";
								} 
							}
						}
					}

				}
			}

		} 		
		return result;
	}

	private Header createHeader() {
		
		Header header = Mif2Factory.eINSTANCE.createHeader();

		RenderingInformation renderingInformation = Mif2Factory.eINSTANCE.createRenderingInformation();

		renderingInformation.setApplication("OHT UML to MIF Transform");

		header.setRenderingInformation(renderingInformation);

		Legalese legalese = Mif2Factory.eINSTANCE.createLegalese();

		legalese.setCopyrightOwner("Open Health Tools");

		List<BigInteger> years = new ArrayList<BigInteger>();

		years.add(BigInteger.valueOf(2009));

		legalese.setCopyrightYears(years);

		header.setLegalese(legalese);

		return header;
	}

	public StaticModel createMIFModel(Element umlElement) {

		
		// Get UML resource and create corresponding MIF resource
		Resource umlResource = umlElement.eResource();

		String packageName = ((PackageableElement) umlElement).getName();

		String[] fileName = { "MIF2Export", umlElement.getModel().getName(), packageName };

		URI mifURI = umlResource.getURI().trimSegments(1).appendSegments(fileName);

		mifURI = mifURI.appendFileExtension("mif");

		Resource mifResource = umlResource.getResourceSet().createResource(mifURI);

		mifResources.put(packageName, mifResource);

		root = Mif2Factory.eINSTANCE.createDocumentRoot();
		GlobalStaticModel staticModel = Mif2Factory.eINSTANCE.createGlobalStaticModel();
		staticModel.setName("MIF_export");
		root.setStaticModel(staticModel);

		mifModel = root.getStaticModel(); //Mif2Factory.eINSTANCE.createStaticModel();

		((GlobalStaticModel) mifModel).setSchemaVersion(MIF_SCHEMA_VERSION);

		mifModels.put(packageName, mifModel);

		mifResource.getContents().add(getMIFDocumentRoot());

		this.setMIFModelName(packageName);

		return mifModel;
	}
	
	/**
	 * createPackageRef creates and populates the MIF Package Reference Structure with hard codedind
	 * @return PackageRef
	 */
	private PackageRef createPackageRef(Package umlPackage) {
		
		Stereotype hdfPackage = HL7ResourceUtil.getAppliedHDFStereotype(umlPackage, IHDFProfileConstants.HDF_PACKAGE);  
		
		PackageRef packageRef = Mif2Factory.eINSTANCE.createPackageRef();

		packageRef.setRealmNamespace(umlPackage.getValue(hdfPackage,IHDFProfileConstants.PACKAGE_REALM_NAMESPACE)); 		
		
		packageRef.setArtifact(ArtifactKind.get((String)umlPackage.getValue(hdfPackage,IHDFProfileConstants.PACKAGE_ARTIFACT)));

		packageRef.setRoot(PackageRootKind.get((String)umlPackage.getValue(hdfPackage,IHDFProfileConstants.PACKAGE_ROOT)));

		packageRef.setSection((String)umlPackage.getValue(hdfPackage,IHDFProfileConstants.PACKAGE_SECTION));

		packageRef.setSubSection((String)umlPackage.getValue(hdfPackage, IHDFProfileConstants.PACKAGE_SUB_SECTION));

		packageRef.setDomain(DomainKind.get((String)umlPackage.getValue(hdfPackage,IHDFProfileConstants.PACKAGE_DOMAIN)));

		packageRef.setVersion((String)umlPackage.getValue(hdfPackage, IHDFProfileConstants.PACKAGE_VERSION));
						
		Object id = umlPackage.getValue(hdfPackage, IHDFProfileConstants.PACKAGE_ID);

		if (id != null) {
			packageRef.setId(BigInteger.valueOf((Long) id));
		}
		return packageRef;
	}

	/**
	 * createPackageRefFromHandle is based on HL7 file naming convention of
	 * "root=realm=artifact=version" The assumption here is this will not change
	 * but there are no guarantees. The method splits the handle on "=" and
	 * populates the PackageRef accordingly
	 * 
	 * @param handle
	 * @return
	 */
	private PackageRef createPackageRefFromHandle(String handle) {
		PackageRef packageRef = Mif2Factory.eINSTANCE.createPackageRef();

		final int ROOTSEGMENT = 0;
		final int REALMSEGMENT = 1;
		final int ARTIFACTSEGMENT = 2;
		final int VERSIONSEGMENT = 3;

		// TODO - Hard coded - need to set up datatype library env variable instead
		// DEFN=UV=DT=1.0
		String[] handleSegments = handle.split("=");

		if (handleSegments.length == 4) {

			if (PackageRootKind.get(handleSegments[ROOTSEGMENT]) != null) {
				packageRef.setRoot(PackageRootKind.get(handleSegments[ROOTSEGMENT]));
			}

			packageRef.setRealmNamespace(handleSegments[REALMSEGMENT]);

			if (ArtifactKind.get(handleSegments[ARTIFACTSEGMENT]) != null) {
				packageRef.setArtifact(ArtifactKind.get(handleSegments[ARTIFACTSEGMENT]));
			}

			packageRef.setVersion(handleSegments[VERSIONSEGMENT]);
		}

		return packageRef;

	}
	
	private ClassDerivation createRimClassDerivation(Class umlClass)
	{
		ClassDerivation rimDerivation = Mif2Factory.eINSTANCE.createClassDerivation();
		
		rimDerivation.setStaticModelDerivationId(STATIC_MODEL_DERIVATION_ID);

		rimDerivation.setClassName(rimDerivation(umlClass));
		
		return rimDerivation;
	}
	
	private StaticModelDerivation createRimStaticModelDerivation() {
				
		StaticModelDerivation staticModelDerivation = Mif2Factory.eINSTANCE.createStaticModelDerivation();
		
		staticModelDerivation.setStaticModelDerivationId(STATIC_MODEL_DERIVATION_ID);
		
		PackageRef packRef = Mif2Factory.eINSTANCE.createPackageRef();
		
		packRef.setArtifact(ArtifactKind.RIM);
		
		packRef.setRoot(PackageRootKind.DEFN);
		
		packRef.setVersion("0221");
		
		staticModelDerivation.setTargetStaticModel(packRef);
				
		return staticModelDerivation;
	}


	// "Role" - "participation"
	// "Act" "inboundRelationship"
	// "Entity" "scopedRole"
	// "Participation" "role"
	// ActRelationship source
	
	/**
	 * Process all eContents().
	 */
	public Object defaultCase(EObject eObject) {
		if (eObject == null) {
			return null;
		}
		
		
		return super.defaultCase(eObject);
	}
	

	/**
	 * @return the UML Model
	 */
	public DocumentRoot getMIFDocumentRoot() {
		if (root == null) {
//			createMIFModel(null);
		}
		return root;
	}

	
	
	public StaticModel getMIFModel()
	{
		return mifModel;
	}
	/**
	 * @param umlProperty
	 * @param attribute
	 */
	private void mapDatatype(Property umlProperty, Attribute attribute) {
		DatatypeRef argDatatype = null;
		
		if (umlProperty != null &&  umlProperty.getType() != null) {
			String type = umlProperty.getType().getName();
			DatatypeRef datatype = Mif2Factory.eINSTANCE.createDatatypeRef();
			String[] typeArray = type.split("<");
			if (typeArray != null && typeArray.length > 1) {
				String name = typeArray[0]; //first token is the name
				datatype.setName(name);
				//second token is the arguments separated by "," excluding the last char ">"
				String argString = typeArray[1].substring(0, typeArray[1].length() - 1);
				String[] argArray = argString.split(",");
				if (argArray != null && argArray.length > 1) {
					//the data type has more than one arguments
					for (int i = 0; i < argArray.length; i++) {
						argDatatype = Mif2Factory.eINSTANCE.createDatatypeRef();
						argDatatype.setName(argArray[0]);
						datatype.getArgumentDatatype().add(argDatatype);
					}
				} else {
					//the data type has only 1 argument
					argDatatype = Mif2Factory.eINSTANCE.createDatatypeRef();
					argDatatype.setName(argString);
					datatype.getArgumentDatatype().add(argDatatype);
				}
			} else {
				//the datatype has no argument
				datatype.setName(type);
			}
			//set the mif attribute datatype
			attribute.setType(datatype);
		}
	}

	/**
	 * @param umlPackage
	 */
	private void mapMifModelAttributes(Package umlPackage) {

	
		Stereotype hdfPackage = HL7ResourceUtil.getAppliedHDFStereotype(umlPackage, IHDFProfileConstants.HDF_PACKAGE);  
		
		//map the staticModel attributes
		mifModel.setConformanceLevel(ModelConformanceKind.get((String)umlPackage.getValue(hdfPackage,IHDFProfileConstants.PACKAGE_CONFORMANCE_LEVEL)));
		
		mifModel.setPackageKind(PackageKind.get((String)umlPackage.getValue(hdfPackage, IHDFProfileConstants.PACKAGE_KIND)));
		
		
		// TODO - Where do we get these items from the model? SWM
		mifModel.setRepresentationKind(StaticModelRepresentationKind.FLAT);
		
		mifModel.setIsAbstract(false);
		
		mifModel.setIsSerializable(true);
		
		//map the title set in the umlPackage annotation source "uml2.alias"
		EAnnotation annotation = umlPackage.getEAnnotation("uml2.alias");
		
		//assumption: the first item of the annotation details is uml2.alias, 
		//see Mif2Import for how this field was created
		if (annotation != null && annotation.getDetails().size() > 0){
			String title = annotation.getDetails().get(0).getKey();
			mifModel.setTitle(title);
		}
		
		mifModel.setPackageLocation(createPackageRef(umlPackage));
		
		mifModel.setHeader(createHeader());
		
		//map derivedFrom
		mifModel.getDerivedFrom().add(createRimStaticModelDerivation());
		
		// TODO These handles need to be obtained from the model or environment not hard coded. SWM 
		mifModel.setImportedDatatypeModelPackage(createPackageRefFromHandle(DatatypeConstants.HL7_DATATYPES_1_0));

		mifModel.setImportedVocabularyModelPackage(createPackageRefFromHandle("DEFN=UV=VO=586-20081030"));

		mifModel.setImportedCommonModelElementPackage(createPackageRefFromHandle("DEFN=UV=IFC=1.8.3"));



		//set schema version
//				((GlobalStaticModel)mifModel).setSchemaVersion(MIF_SCHEMA_VERSION);	
	}

	/**
	 * @param umlProperty
	 * @param attribute
	 */
	private void mapMultiplicity(Property umlProperty, Attribute attribute) {
		//map attribute min multiplicity
		attribute.setMinimumMultiplicity(new BigInteger(String.valueOf(umlProperty.getLower())));
		//map attribute max multiplicity
		//if the uml upper value is unlimited, then mif max multi is set to the UnlimitedMultiplicity enum of "*"
		if (umlProperty.getUpper() == LiteralUnlimitedNatural.UNLIMITED) {
			attribute.setMaximumMultiplicity(UnlimitedMultiplicity.get("*"));
		} else {
			//upper value is an int
			attribute.setMaximumMultiplicity(new BigInteger(String.valueOf(umlProperty.getUpper())));
		}
	}

	String popIFCAnnotation(Type type)
	{

		
		if (type == null)
		{
			return null;
		}
		

		String result = null;
		
		final String IFC_ANNOTATION_SOURCE = "org.openhealthtools.mdht.uml.hl7.mif2uml.ifc";	
		EAnnotation ifcAnnotation =  type.getEAnnotation(IFC_ANNOTATION_SOURCE);
		
		
		if (ifcAnnotation != null)
		{
		
			if (ifcAnnotation.getDetails().size() == 1)
			{
				result = ifcAnnotation.getDetails().get(0).getKey();
			} 

		} else {
			//  Some classes are not getting properly tagged during the import - use the model annotation instead
			// TODO Debug issue and remove code
			ifcAnnotation = type.getModel().getEAnnotation(IFC_ANNOTATION_SOURCE);
			if (ifcAnnotation != null && ifcAnnotation.getDetails().containsKey(type.getQualifiedName()))
			{				
				result = ifcAnnotation.getDetails().get(type.getQualifiedName());
						
			}	
		}
	
		

		
		return result;
		
	}



	private String rimDerivation(Element element)
	{
		String derivation = "";
		
		Stereotype appliedStereotype = RIMProfileUtil.getRIMStereotype(element);

		if (appliedStereotype != null) {
			derivation = appliedStereotype.getName();
		} 
		
		return derivation;
	}
	
	public void saveMIFModel()
	{
		// Save off the MIF file
	

		try {
			
			for (Resource mifResource : mifResources.values()){
				
				HashMap<Object, Object> saveOptions = new HashMap<Object, Object>();
				
				mifResource.save(saveOptions);	
			}
			
			for (StaticModel mifModel : mifModels.values()){
				
				mifModel.eResource().unload();
		
			}
			
		} catch (IOException e) {
			
			diagnostics.error("IOException! Unable to save mif models  "+e.getMessage() , null);

			return;
		}

		
	}
	
	/**
	 * @param mifModelName
	 */
	public void setMIFModelName(String mifModelName) {
		mifModel.setName(mifModelName);
	}

	public void transformElement(EObject umlElement) {

		try{
		doSwitch(umlElement);
		}
		catch(RuntimeException re)
		{
		
			re.printStackTrace();
		}
	}
	
	public void transformGeneralizations(EObject umlElement)
	{
		generalizationProcessor.doSwitch(umlElement);
	}


	
	
}
