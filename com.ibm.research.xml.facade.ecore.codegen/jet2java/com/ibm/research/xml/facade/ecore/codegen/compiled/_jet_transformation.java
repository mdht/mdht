package com.ibm.research.xml.facade.ecore.codegen.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map<String, Integer> pathToTemplateOrdinalMap = new HashMap<String,Integer>(5);
    static {
        pathToTemplateOrdinalMap.put("templates/classpath.jet", //$NON-NLS-1$
                Integer.valueOf(0));
        pathToTemplateOrdinalMap.put("templates/dump.jet", //$NON-NLS-1$
                Integer.valueOf(1));
        pathToTemplateOrdinalMap.put("templates/facade.jet", //$NON-NLS-1$
                Integer.valueOf(2));
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                Integer.valueOf(3));
        pathToTemplateOrdinalMap.put("templates/project.jet", //$NON-NLS-1$
                Integer.valueOf(4));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoader#getTemplate(java.lang.String)
     */
    public JET2Template getTemplate(final String templatePath) {
        final Integer ordinal = pathToTemplateOrdinalMap.get(templatePath);
        if(ordinal != null) {
           switch (ordinal.intValue()) {
            case 0: // templates/classpath.jet
                return new com.ibm.research.xml.facade.ecore.codegen.compiled._jet_classpath();
            case 1: // templates/dump.jet
                return new com.ibm.research.xml.facade.ecore.codegen.compiled._jet_dump();
            case 2: // templates/facade.jet
                return new com.ibm.research.xml.facade.ecore.codegen.compiled._jet_facade();
            case 3: // templates/main.jet
                return new com.ibm.research.xml.facade.ecore.codegen.compiled._jet_main();
            case 4: // templates/project.jet
                return new com.ibm.research.xml.facade.ecore.codegen.compiled._jet_project();
            default:
                break;
            }
        }
        return this.delegate != null ? this.delegate.getTemplate(templatePath) : null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoaderExtension#getDelegateLoader()
     */
    public JET2TemplateLoader getDelegateLoader() {
        return this.delegate;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.jet.JET2TemplateLoaderExtension#setDelegateLoader(org.eclipse
     * .jet.JET2TemplateLoader)
     */
    public void setDelegateLoader(final JET2TemplateLoader loader) {
        this.delegate = loader;
    }
}
