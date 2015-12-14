package %PACKAGE_NAME%;

import org.openhealthtools.mdht.uml.hl7.vocab.*;
import java.util.Map;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
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

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

public class Java8%ORIGINAL_VALIDATOR% extends %ORIGINAL_VALIDATOR% {

	public Java8%ORIGINAL_VALIDATOR%() {
		super();
	}
	

%METHODS_GO_HERE%


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
	
}