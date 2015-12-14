/**
 */
package traceability.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMIHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see traceability.util.TraceabilityResourceFactoryImpl
 * @generated
 */
public class TraceabilityResourceImpl extends XMIResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public TraceabilityResourceImpl(URI uri) {
		super(uri);
	}

	  @Override
	  protected XMLHelper createXMLHelper()
	  {
	    return new XMIHelperImpl(this) {

	    	
	    	@Override
	    	public URI deresolve(URI uri) {
	    		URI result = super.deresolve(uri);
	    		if (result.toString().contains("../"))
	    			return uri;
	    		return result;
	    	}
	  
	    };
	  }
	  


} //TraceabilityResourceImpl
