package com.ibm.research.xml.facade.ecore.codegen.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_project implements JET2Template {

    public _jet_project() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<projectDescription>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<name>myProject</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<comment></comment>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<projects>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</projects>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<buildSpec>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>org.eclipse.jdt.core.javabuilder</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</buildSpec>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<natures>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<nature>org.eclipse.jdt.core.javanature</nature>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</natures>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</projectDescription>");  //$NON-NLS-1$        
    }
}
