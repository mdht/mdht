package com.ibm.research.xml.facade.ecore.codegen.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_dump implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_dump() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_dump_2_1 = new TagInfo("c:dump", //$NON-NLS-1$
            2, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "format", //$NON-NLS-1$
                "entities", //$NON-NLS-1$
            },
            new String[] {
                "/*", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "true", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_dump_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "dump", "c:dump", _td_c_dump_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_dump_2_1.setRuntimeParent(null);
        _jettag_c_dump_2_1.setTagInfo(_td_c_dump_2_1);
        _jettag_c_dump_2_1.doStart(context, out);
        _jettag_c_dump_2_1.doEnd();
        out.write(NL);         
    }
}
