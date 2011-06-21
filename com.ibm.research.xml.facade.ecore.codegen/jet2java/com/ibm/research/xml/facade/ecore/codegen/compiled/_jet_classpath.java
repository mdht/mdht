package com.ibm.research.xml.facade.ecore.codegen.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_classpath implements JET2Template {

    public _jet_classpath() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<classpath>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<classpathentry kind=\"src\" path=\"src\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/J2SE-1.5\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<classpathentry combineaccessrules=\"false\" kind=\"src\" path=\"/com.ibm.research.xml.facade\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<classpathentry kind=\"output\" path=\"bin\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</classpath>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
