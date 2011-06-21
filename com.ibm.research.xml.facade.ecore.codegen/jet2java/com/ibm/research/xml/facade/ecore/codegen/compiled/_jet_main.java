package com.ibm.research.xml.facade.ecore.codegen.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_main() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_8_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "org.eclipse.jet.taglib.control.iterateSetsContext", //$NON-NLS-1$
                "true()", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_19_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            19, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/XMLFacadePackage", //$NON-NLS-1$
                "package", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_21_1 = new TagInfo("ws:project", //$NON-NLS-1$
            21, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "myProject", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_22_3 = new TagInfo("ws:file", //$NON-NLS-1$
            22, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                ".project", //$NON-NLS-1$
                "templates/project.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_23_3 = new TagInfo("ws:file", //$NON-NLS-1$
            23, 3,
            new String[] {
                "path", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                ".classpath", //$NON-NLS-1$
                "templates/classpath.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_24_3 = new TagInfo("ws:folder", //$NON-NLS-1$
            24, 3,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "src", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_package_25_5 = new TagInfo("java:package", //$NON-NLS-1$
            25, 5,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$package/@name}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_26_7 = new TagInfo("c:iterate", //$NON-NLS-1$
            26, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$package/XMLFacade", //$NON-NLS-1$
                "facade", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_27_9 = new TagInfo("java:class", //$NON-NLS-1$
            27, 9,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$facade/@name}", //$NON-NLS-1$
                "templates/facade.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_40_1 = new TagInfo("c:if", //$NON-NLS-1$
            40, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "isVariableDefined('org.eclipse.jet.resource.project.name')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_41_5 = new TagInfo("ws:file", //$NON-NLS-1$
            41, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/dump.jet", //$NON-NLS-1$
                "{$org.eclipse.jet.resource.project.name}/dump.xml", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // Main entry point for com.ibm.research.xml.facade.ecore.codegen 
        out.write(NL);         
        // 
        //  Let c:iterate tags set the XPath context object.
        //  For 100% compatibility with JET 0.9.x or earlier, remove this statement
        // 
        RuntimeTagElement _jettag_c_setVariable_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_8_1.setRuntimeParent(null);
        _jettag_c_setVariable_8_1.setTagInfo(_td_c_setVariable_8_1);
        _jettag_c_setVariable_8_1.doStart(context, out);
        _jettag_c_setVariable_8_1.doEnd();
        out.write(NL);         
        // 
        //TODO: traverse input model, performing calculations and storing 
        //the results as model annotations via c:set tag 
        out.write(NL);         
        //
        //TODO: traverse annotated model, performing text generation actions 
        //such as ws:file, ws:folder and ws:project 
        RuntimeTagElement _jettag_c_setVariable_19_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_19_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_19_1.setRuntimeParent(null);
        _jettag_c_setVariable_19_1.setTagInfo(_td_c_setVariable_19_1);
        _jettag_c_setVariable_19_1.doStart(context, out);
        _jettag_c_setVariable_19_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_project_21_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_21_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_21_1.setRuntimeParent(null);
        _jettag_ws_project_21_1.setTagInfo(_td_ws_project_21_1);
        _jettag_ws_project_21_1.doStart(context, out);
        while (_jettag_ws_project_21_1.okToProcessBody()) {
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_22_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_22_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_22_3.setRuntimeParent(_jettag_ws_project_21_1);
            _jettag_ws_file_22_3.setTagInfo(_td_ws_file_22_3);
            _jettag_ws_file_22_3.doStart(context, out);
            _jettag_ws_file_22_3.doEnd();
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_23_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_23_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_23_3.setRuntimeParent(_jettag_ws_project_21_1);
            _jettag_ws_file_23_3.setTagInfo(_td_ws_file_23_3);
            _jettag_ws_file_23_3.doStart(context, out);
            _jettag_ws_file_23_3.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_ws_folder_24_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_24_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_24_3.setRuntimeParent(_jettag_ws_project_21_1);
            _jettag_ws_folder_24_3.setTagInfo(_td_ws_folder_24_3);
            _jettag_ws_folder_24_3.doStart(context, out);
            while (_jettag_ws_folder_24_3.okToProcessBody()) {
                RuntimeTagElement _jettag_java_package_25_5 = context.getTagFactory().createRuntimeTag(_jetns_java, "package", "java:package", _td_java_package_25_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_package_25_5.setRuntimeParent(_jettag_ws_folder_24_3);
                _jettag_java_package_25_5.setTagInfo(_td_java_package_25_5);
                _jettag_java_package_25_5.doStart(context, out);
                while (_jettag_java_package_25_5.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_26_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_26_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_26_7.setRuntimeParent(_jettag_java_package_25_5);
                    _jettag_c_iterate_26_7.setTagInfo(_td_c_iterate_26_7);
                    _jettag_c_iterate_26_7.doStart(context, out);
                    while (_jettag_c_iterate_26_7.okToProcessBody()) {
                        out.write("        ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_java_class_27_9 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_27_9); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_java_class_27_9.setRuntimeParent(_jettag_c_iterate_26_7);
                        _jettag_java_class_27_9.setTagInfo(_td_java_class_27_9);
                        _jettag_java_class_27_9.doStart(context, out);
                        _jettag_java_class_27_9.doEnd();
                        out.write(NL);         
                        _jettag_c_iterate_26_7.handleBodyContent(out);
                    }
                    _jettag_c_iterate_26_7.doEnd();
                    _jettag_java_package_25_5.handleBodyContent(out);
                }
                _jettag_java_package_25_5.doEnd();
                _jettag_ws_folder_24_3.handleBodyContent(out);
            }
            _jettag_ws_folder_24_3.doEnd();
            _jettag_ws_project_21_1.handleBodyContent(out);
        }
        _jettag_ws_project_21_1.doEnd();
        out.write(NL);         
        // For debug purposes, dump the annotated input model in 
        //   the root of the project containing the original input model.
        //   
        //   Note that model formatting may not be identical, and that in
        //   the case of non-XML input models, the dump may look quite different.
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_40_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_40_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_40_1.setRuntimeParent(null);
        _jettag_c_if_40_1.setTagInfo(_td_c_if_40_1);
        _jettag_c_if_40_1.doStart(context, out);
        while (_jettag_c_if_40_1.okToProcessBody()) {
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_41_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_41_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_41_5.setRuntimeParent(_jettag_c_if_40_1);
            _jettag_ws_file_41_5.setTagInfo(_td_ws_file_41_5);
            _jettag_ws_file_41_5.doStart(context, out);
            _jettag_ws_file_41_5.doEnd();
            out.write(NL);         
            _jettag_c_if_40_1.handleBodyContent(out);
        }
        _jettag_c_if_40_1.doEnd();
    }
}
