package facade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * Copyright: NEHTA 2014-2015 Author: Joerg Kiegeland, Distributed Models Pty
 * Ltd
 */

// / <summary>
// / This helper class is mainly used by facades to evaluate the .NET
// equivalents of the MDHT OCL expressions
// / </summary>
abstract public class FacadeBase {

	// / <summary>
	// / Enumeration for the data element level (that a constraint operates on)
	// / </summary>
	public enum DataElementLevel {

		// / "1A"
		DEL_CDA_HEADER,

		// / "2"
		DEL_CDA_BODY_LEVEL_2,

		// / "3A"
		DEL_CDA_BODY_LEVEL_3,

		// / unknown
		NA
	};

	/// returns the CDA element
	abstract public Object getModelElement();

	// / For a singleton set, returns the one and only element
	static public <T> T One(T item) {
		return item;
	}

	// / For a singleton set, returns the one and only element
	static public <T> T One(Stream<T> list) {
		Optional<T> optional = list.findFirst();
		if (optional.isPresent())
			return optional.get();
		return null;
	}

	//
	static public <T> Stream<T> Set(List<T> item) {
		return item.stream();
	}

	// / Makes an element or elements available as set
	static public <T> Stream<T> Set(T item) {
		ArrayList<T> result = new ArrayList<T>();
		if (item != null)
			result.add(item);
		return result.stream();
	}

	// / Flattens nested set structures
	static public <T extends EObject> Stream<T> Flatten(Stream<Stream<T>> list) {
		return list.flatMap(x -> x);
	}

	static public <T> T Flatten(T list) {
		return list;
	}

	// / <summary>
	// / Mark properties for serialization by e.g. setting
	// "contextControlCodeSpecified" to true for the "contextControlCode"
	// property
	// / </summary>
	// / <param name="o">The CDA element</param>
	// / <param name="featureName">The field name</param>
	public void MarkSpecified(EObject o, EStructuralFeature feature) {
		feature.setUnsettable(true);
	}

	// / <summary>
	// / Asks if a property is specified, e.g. for the "contextControlCode"
	// property, returns the value for "contextControlCodeSpecified"
	// / </summary>
	// / <param name="o">The CDA element</param>
	// / <param name="featureName">The field name</param>
	// / <returns>The value of the Specified field, or "false" if that does not
	// exist for the field</returns>
	public boolean IsSpecified(EObject o, String featureName) {
		EStructuralFeature feature = o.eClass().getEStructuralFeature(featureName);
		return o.eIsSet(feature);
	}

	protected FeatureMap getValueForFeaturemap(String value) {
		/**
		 * @see org.openhealthtools.mdht.uml.cda.operations.SectionOperations#createStrucDocText()
		 */
		Resource.Factory factory = new GenericXMLResourceFactoryImpl();
		XMLResource resource = (XMLResource) factory.createResource(null);
		try {
			resource.load(new URIConverter.ReadableInputStream("<text>" + value + "</text>"), null);
		} catch (Exception e) {
			//do nothing
		}
		XMLTypeDocumentRoot root = (XMLTypeDocumentRoot) resource.getContents().get(0);
		AnyType any = (AnyType) root.getMixed().getValue(0);
		return any.getMixed();
	}


}