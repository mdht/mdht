package org.openhealthtools.mdht.uml.cda.ui.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

public class VocabModelUtil {
	public static final String VOCAB_MODEL_URI_EMX = 
		"platform:/resource/org.openhealthtools.mdht.uml.hl7.vocab/model/vocab.emx";
	public static final String VOCAB_MODEL_URI_UML = 
		"platform:/resource/org.openhealthtools.mdht.uml.hl7.vocab/model/vocab.uml";

	public static Package getVocabModel(Package hostModel) {
		Package vocabModel = null;
		String vocabURI = (hostModel.eResource().getURI().toString().endsWith("emx"))
				? VOCAB_MODEL_URI_EMX : VOCAB_MODEL_URI_UML;
		
		ResourceSet resourceSet = hostModel.eResource().getResourceSet();
		Resource vocabResource = resourceSet.getResource(URI.createURI(vocabURI), true);
		
		if (vocabResource != null) {
			vocabModel = (Package) EcoreUtil.getObjectByType(
					vocabResource.getContents(), 
					UMLPackage.eINSTANCE.getPackage());
		}
			
		return vocabModel;
	}
	
	public static Enumeration getVocabEnumeration(Package hostModel, String enumName) {
		Enumeration vocabEnum = null;
		Package vocabModel = getVocabModel(hostModel);
		if (vocabModel != null) {
			Type type = vocabModel.getOwnedType(enumName);
			if (type instanceof Enumeration)
				vocabEnum = (Enumeration) type;
		}
		
		return vocabEnum;
	}
}
