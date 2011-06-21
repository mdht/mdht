package com.ibm.research.xml.facade.ecore.codegen.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_facade implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_facade() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_9 = new TagInfo("c:get", //$NON-NLS-1$
            1, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$package/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_4_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            4, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$facade/methods[emf.eClass()/@name='XMLFacadeGetterMethod']", //$NON-NLS-1$
                "getterMethods", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_5_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            5, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$facade/methods[emf.eClass()/@name='XMLFacadeSetterMethod']", //$NON-NLS-1$
                "setterMethods", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_6_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            6, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$facade/methods[emf.eClass()/@name='XMLFacadeCreateMethod']", //$NON-NLS-1$
                "createMethods", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_7_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            7, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$facade/annotations[emf.eClass()/@name='XMLFacadePrefixMappingAnnotation']", //$NON-NLS-1$
                "prefixMappings", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_8_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$facade/annotations[emf.eClass()/@name='XMLFacadeInitAnnotation']", //$NON-NLS-1$
                "initAnnotations", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_9_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$facade/annotations[emf.eClass()/@name='XMLFacadeConstraintAnnotation']", //$NON-NLS-1$
                "constraintAnnotations", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_10_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            10, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$facade/annotations[emf.eClass()/@name='XMLFacadeElementAnnotation']", //$NON-NLS-1$
                "elementAnnotation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_11_1 = new TagInfo("c:if", //$NON-NLS-1$
            11, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$getterMethods", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_14_1 = new TagInfo("c:if", //$NON-NLS-1$
            14, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$prefixMappings", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_18_1 = new TagInfo("c:if", //$NON-NLS-1$
            18, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$initAnnotations", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_22_1 = new TagInfo("c:if", //$NON-NLS-1$
            22, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$constraintAnnotations", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_27_1 = new TagInfo("c:if", //$NON-NLS-1$
            27, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$elementAnnotation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_30_1 = new TagInfo("c:if", //$NON-NLS-1$
            30, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$createMethods", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_34_1 = new TagInfo("c:if", //$NON-NLS-1$
            34, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$prefixMappings", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_36_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            36, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$prefixMappings", //$NON-NLS-1$
                "prefixMapping", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_27 = new TagInfo("c:get", //$NON-NLS-1$
            37, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$prefixMapping/@prefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_86 = new TagInfo("c:get", //$NON-NLS-1$
            37, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$prefixMapping/@namespaceURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_41_1 = new TagInfo("c:if", //$NON-NLS-1$
            41, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$initAnnotations", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_43_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            43, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$initAnnotations", //$NON-NLS-1$
                "initAnnotation", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_16 = new TagInfo("c:get", //$NON-NLS-1$
            44, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$initAnnotation/@path", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_67 = new TagInfo("c:get", //$NON-NLS-1$
            44, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$initAnnotation/@value", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_48_1 = new TagInfo("c:if", //$NON-NLS-1$
            48, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$constraintAnnotations", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_50_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            50, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$constraintAnnotations", //$NON-NLS-1$
                "constraintAnnotation", //$NON-NLS-1$
                ",", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_22 = new TagInfo("c:get", //$NON-NLS-1$
            51, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$constraintAnnotation/@test", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_94 = new TagInfo("c:get", //$NON-NLS-1$
            51, 94,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$constraintAnnotation/@severity", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_156 = new TagInfo("c:get", //$NON-NLS-1$
            51, 156,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$constraintAnnotation/@message", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_55_1 = new TagInfo("c:if", //$NON-NLS-1$
            55, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$elementAnnotation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_27 = new TagInfo("c:get", //$NON-NLS-1$
            56, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$elementAnnotation/@qualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_97 = new TagInfo("c:get", //$NON-NLS-1$
            56, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$elementAnnotation/@namespaceURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_56_148 = new TagInfo("c:if", //$NON-NLS-1$
            56, 148,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$elementAnnotation/propOrder", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_56_206 = new TagInfo("c:iterate", //$NON-NLS-1$
            56, 206,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$elementAnnotation/propOrder", //$NON-NLS-1$
                "propName", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_286 = new TagInfo("c:get", //$NON-NLS-1$
            56, 286,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$propName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_18 = new TagInfo("c:get", //$NON-NLS-1$
            58, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$facade/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_59_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            59, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$facade/methods", //$NON-NLS-1$
                "method", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_60_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            60, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$method/annotations", //$NON-NLS-1$
                "annotation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_61_6 = new TagInfo("c:choose", //$NON-NLS-1$
            61, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_62_8 = new TagInfo("c:when", //$NON-NLS-1$
            62, 8,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "emf.eClass($annotation)/@name='XMLFacadeGetAnnotation'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_8 = new TagInfo("c:get", //$NON-NLS-1$
            63, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$annotation/@path", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_65_8 = new TagInfo("c:when", //$NON-NLS-1$
            65, 8,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "emf.eClass($annotation)/@name='XMLFacadeCreateAnnotation'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_11 = new TagInfo("c:get", //$NON-NLS-1$
            66, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$annotation/@path", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_70_4 = new TagInfo("c:choose", //$NON-NLS-1$
            70, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_71_6 = new TagInfo("c:when", //$NON-NLS-1$
            71, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "emf.eClass($method)/@name='XMLFacadeGetterMethod'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_5 = new TagInfo("c:get", //$NON-NLS-1$
            72, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$method/returnType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_48 = new TagInfo("c:get", //$NON-NLS-1$
            72, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$method/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_74_6 = new TagInfo("c:when", //$NON-NLS-1$
            74, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "emf.eClass($method)/@name='XMLFacadeSetterMethod'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_76_6 = new TagInfo("c:when", //$NON-NLS-1$
            76, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "emf.eClass($method)/@name='XMLFacadeCreateMethod'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_77_2 = new TagInfo("c:get", //$NON-NLS-1$
            77, 2,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$method/returnType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_77_45 = new TagInfo("c:get", //$NON-NLS-1$
            77, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$method/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_79_6 = new TagInfo("c:when", //$NON-NLS-1$
            79, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "emf.eClass($method)/@name='XMLFacadeAddMethod'", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_9.setRuntimeParent(null);
        _jettag_c_get_1_9.setTagInfo(_td_c_get_1_9);
        _jettag_c_get_1_9.doStart(context, out);
        _jettag_c_get_1_9.doEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import com.ibm.research.xml.facade.XMLFacade;");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_4_1.setRuntimeParent(null);
        _jettag_c_setVariable_4_1.setTagInfo(_td_c_setVariable_4_1);
        _jettag_c_setVariable_4_1.doStart(context, out);
        _jettag_c_setVariable_4_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_5_1.setRuntimeParent(null);
        _jettag_c_setVariable_5_1.setTagInfo(_td_c_setVariable_5_1);
        _jettag_c_setVariable_5_1.doStart(context, out);
        _jettag_c_setVariable_5_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_6_1.setRuntimeParent(null);
        _jettag_c_setVariable_6_1.setTagInfo(_td_c_setVariable_6_1);
        _jettag_c_setVariable_6_1.doStart(context, out);
        _jettag_c_setVariable_6_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_7_1.setRuntimeParent(null);
        _jettag_c_setVariable_7_1.setTagInfo(_td_c_setVariable_7_1);
        _jettag_c_setVariable_7_1.doStart(context, out);
        _jettag_c_setVariable_7_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_8_1.setRuntimeParent(null);
        _jettag_c_setVariable_8_1.setTagInfo(_td_c_setVariable_8_1);
        _jettag_c_setVariable_8_1.doStart(context, out);
        _jettag_c_setVariable_8_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_9_1.setRuntimeParent(null);
        _jettag_c_setVariable_9_1.setTagInfo(_td_c_setVariable_9_1);
        _jettag_c_setVariable_9_1.doStart(context, out);
        _jettag_c_setVariable_9_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_10_1.setRuntimeParent(null);
        _jettag_c_setVariable_10_1.setTagInfo(_td_c_setVariable_10_1);
        _jettag_c_setVariable_10_1.doStart(context, out);
        _jettag_c_setVariable_10_1.doEnd();
        RuntimeTagElement _jettag_c_if_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_11_1.setRuntimeParent(null);
        _jettag_c_if_11_1.setTagInfo(_td_c_if_11_1);
        _jettag_c_if_11_1.doStart(context, out);
        while (_jettag_c_if_11_1.okToProcessBody()) {
            out.write("import com.ibm.research.xml.facade.annotation.Get;");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_11_1.handleBodyContent(out);
        }
        _jettag_c_if_11_1.doEnd();
        RuntimeTagElement _jettag_c_if_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_14_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_14_1.setRuntimeParent(null);
        _jettag_c_if_14_1.setTagInfo(_td_c_if_14_1);
        _jettag_c_if_14_1.doStart(context, out);
        while (_jettag_c_if_14_1.okToProcessBody()) {
            out.write("import com.ibm.research.xml.facade.annotation.PrefixMappings;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("import com.ibm.research.xml.facade.annotation.PrefixMapping;");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_14_1.handleBodyContent(out);
        }
        _jettag_c_if_14_1.doEnd();
        RuntimeTagElement _jettag_c_if_18_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_18_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_18_1.setRuntimeParent(null);
        _jettag_c_if_18_1.setTagInfo(_td_c_if_18_1);
        _jettag_c_if_18_1.doStart(context, out);
        while (_jettag_c_if_18_1.okToProcessBody()) {
            out.write("import com.ibm.research.xml.facade.annotation.Inits;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("import com.ibm.research.xml.facade.annotation.Init;");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_18_1.handleBodyContent(out);
        }
        _jettag_c_if_18_1.doEnd();
        RuntimeTagElement _jettag_c_if_22_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_22_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_22_1.setRuntimeParent(null);
        _jettag_c_if_22_1.setTagInfo(_td_c_if_22_1);
        _jettag_c_if_22_1.doStart(context, out);
        while (_jettag_c_if_22_1.okToProcessBody()) {
            out.write("import com.ibm.research.xml.facade.annotation.Constraints;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("import com.ibm.research.xml.facade.annotation.Constraint;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("import com.ibm.research.xml.facade.annotation.SeverityType;");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_22_1.handleBodyContent(out);
        }
        _jettag_c_if_22_1.doEnd();
        RuntimeTagElement _jettag_c_if_27_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_27_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_27_1.setRuntimeParent(null);
        _jettag_c_if_27_1.setTagInfo(_td_c_if_27_1);
        _jettag_c_if_27_1.doStart(context, out);
        while (_jettag_c_if_27_1.okToProcessBody()) {
            out.write("import com.ibm.research.xml.facade.annotation.Element;");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_27_1.handleBodyContent(out);
        }
        _jettag_c_if_27_1.doEnd();
        RuntimeTagElement _jettag_c_if_30_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_30_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_30_1.setRuntimeParent(null);
        _jettag_c_if_30_1.setTagInfo(_td_c_if_30_1);
        _jettag_c_if_30_1.doStart(context, out);
        while (_jettag_c_if_30_1.okToProcessBody()) {
            out.write("import com.ibm.research.xml.facade.annotation.Create;");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_30_1.handleBodyContent(out);
        }
        _jettag_c_if_30_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_34_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_34_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_34_1.setRuntimeParent(null);
        _jettag_c_if_34_1.setTagInfo(_td_c_if_34_1);
        _jettag_c_if_34_1.doStart(context, out);
        while (_jettag_c_if_34_1.okToProcessBody()) {
            out.write("@PrefixMappings({");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_36_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_36_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_36_1.setRuntimeParent(_jettag_c_if_34_1);
            _jettag_c_iterate_36_1.setTagInfo(_td_c_iterate_36_1);
            _jettag_c_iterate_36_1.doStart(context, out);
            while (_jettag_c_iterate_36_1.okToProcessBody()) {
                out.write("\t@PrefixMapping(prefix = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_37_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_27); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_27.setRuntimeParent(_jettag_c_iterate_36_1);
                _jettag_c_get_37_27.setTagInfo(_td_c_get_37_27);
                _jettag_c_get_37_27.doStart(context, out);
                _jettag_c_get_37_27.doEnd();
                out.write("\", namespaceURI = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_37_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_86); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_86.setRuntimeParent(_jettag_c_iterate_36_1);
                _jettag_c_get_37_86.setTagInfo(_td_c_get_37_86);
                _jettag_c_get_37_86.doStart(context, out);
                _jettag_c_get_37_86.doEnd();
                out.write("\")");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_iterate_36_1.handleBodyContent(out);
            }
            _jettag_c_iterate_36_1.doEnd();
            out.write("})");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_34_1.handleBodyContent(out);
        }
        _jettag_c_if_34_1.doEnd();
        RuntimeTagElement _jettag_c_if_41_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_41_1.setRuntimeParent(null);
        _jettag_c_if_41_1.setTagInfo(_td_c_if_41_1);
        _jettag_c_if_41_1.doStart(context, out);
        while (_jettag_c_if_41_1.okToProcessBody()) {
            out.write("@Inits({");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_43_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_43_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_43_1.setRuntimeParent(_jettag_c_if_41_1);
            _jettag_c_iterate_43_1.setTagInfo(_td_c_iterate_43_1);
            _jettag_c_iterate_43_1.doStart(context, out);
            while (_jettag_c_iterate_43_1.okToProcessBody()) {
                out.write("\t@Init(path = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_44_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_16.setRuntimeParent(_jettag_c_iterate_43_1);
                _jettag_c_get_44_16.setTagInfo(_td_c_get_44_16);
                _jettag_c_get_44_16.doStart(context, out);
                _jettag_c_get_44_16.doEnd();
                out.write("\", value = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_44_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_67); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_67.setRuntimeParent(_jettag_c_iterate_43_1);
                _jettag_c_get_44_67.setTagInfo(_td_c_get_44_67);
                _jettag_c_get_44_67.doStart(context, out);
                _jettag_c_get_44_67.doEnd();
                out.write("\")");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_iterate_43_1.handleBodyContent(out);
            }
            _jettag_c_iterate_43_1.doEnd();
            out.write("})");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_41_1.handleBodyContent(out);
        }
        _jettag_c_if_41_1.doEnd();
        RuntimeTagElement _jettag_c_if_48_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_48_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_48_1.setRuntimeParent(null);
        _jettag_c_if_48_1.setTagInfo(_td_c_if_48_1);
        _jettag_c_if_48_1.doStart(context, out);
        while (_jettag_c_if_48_1.okToProcessBody()) {
            out.write("@Constraints({");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_iterate_50_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_50_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_50_1.setRuntimeParent(_jettag_c_if_48_1);
            _jettag_c_iterate_50_1.setTagInfo(_td_c_iterate_50_1);
            _jettag_c_iterate_50_1.doStart(context, out);
            while (_jettag_c_iterate_50_1.okToProcessBody()) {
                out.write("\t@Constraint(test = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_51_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_51_22.setRuntimeParent(_jettag_c_iterate_50_1);
                _jettag_c_get_51_22.setTagInfo(_td_c_get_51_22);
                _jettag_c_get_51_22.doStart(context, out);
                _jettag_c_get_51_22.doEnd();
                out.write("\", severity = SeverityType.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_51_94 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_94); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_51_94.setRuntimeParent(_jettag_c_iterate_50_1);
                _jettag_c_get_51_94.setTagInfo(_td_c_get_51_94);
                _jettag_c_get_51_94.doStart(context, out);
                _jettag_c_get_51_94.doEnd();
                out.write(", message = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_51_156 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_156); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_51_156.setRuntimeParent(_jettag_c_iterate_50_1);
                _jettag_c_get_51_156.setTagInfo(_td_c_get_51_156);
                _jettag_c_get_51_156.doStart(context, out);
                _jettag_c_get_51_156.doEnd();
                out.write("\")");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_iterate_50_1.handleBodyContent(out);
            }
            _jettag_c_iterate_50_1.doEnd();
            out.write("})");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_48_1.handleBodyContent(out);
        }
        _jettag_c_if_48_1.doEnd();
        RuntimeTagElement _jettag_c_if_55_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_55_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_55_1.setRuntimeParent(null);
        _jettag_c_if_55_1.setTagInfo(_td_c_if_55_1);
        _jettag_c_if_55_1.doStart(context, out);
        while (_jettag_c_if_55_1.okToProcessBody()) {
            out.write("@Element(qualifiedName = \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_56_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_27); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_56_27.setRuntimeParent(_jettag_c_if_55_1);
            _jettag_c_get_56_27.setTagInfo(_td_c_get_56_27);
            _jettag_c_get_56_27.doStart(context, out);
            _jettag_c_get_56_27.doEnd();
            out.write("\", namespaceURI = \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_56_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_97); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_56_97.setRuntimeParent(_jettag_c_if_55_1);
            _jettag_c_get_56_97.setTagInfo(_td_c_get_56_97);
            _jettag_c_get_56_97.doStart(context, out);
            _jettag_c_get_56_97.doEnd();
            out.write("\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_if_56_148 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_56_148); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_56_148.setRuntimeParent(_jettag_c_if_55_1);
            _jettag_c_if_56_148.setTagInfo(_td_c_if_56_148);
            _jettag_c_if_56_148.doStart(context, out);
            while (_jettag_c_if_56_148.okToProcessBody()) {
                out.write(", propOrder = { ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_iterate_56_206 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_56_206); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_56_206.setRuntimeParent(_jettag_c_if_56_148);
                _jettag_c_iterate_56_206.setTagInfo(_td_c_iterate_56_206);
                _jettag_c_iterate_56_206.doStart(context, out);
                while (_jettag_c_iterate_56_206.okToProcessBody()) {
                    out.write("\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_56_286 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_286); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_56_286.setRuntimeParent(_jettag_c_iterate_56_206);
                    _jettag_c_get_56_286.setTagInfo(_td_c_get_56_286);
                    _jettag_c_get_56_286.doStart(context, out);
                    _jettag_c_get_56_286.doEnd();
                    out.write("\"");  //$NON-NLS-1$        
                    _jettag_c_iterate_56_206.handleBodyContent(out);
                }
                _jettag_c_iterate_56_206.doEnd();
                out.write(" }");  //$NON-NLS-1$        
                _jettag_c_if_56_148.handleBodyContent(out);
            }
            _jettag_c_if_56_148.doEnd();
            out.write(")");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_55_1.handleBodyContent(out);
        }
        _jettag_c_if_55_1.doEnd();
        out.write("public interface ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_58_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_58_18.setRuntimeParent(null);
        _jettag_c_get_58_18.setTagInfo(_td_c_get_58_18);
        _jettag_c_get_58_18.doStart(context, out);
        _jettag_c_get_58_18.doEnd();
        out.write(" extends XMLFacade {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_59_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_59_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_59_2.setRuntimeParent(null);
        _jettag_c_iterate_59_2.setTagInfo(_td_c_iterate_59_2);
        _jettag_c_iterate_59_2.doStart(context, out);
        while (_jettag_c_iterate_59_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_60_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_60_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_60_4.setRuntimeParent(_jettag_c_iterate_59_2);
            _jettag_c_iterate_60_4.setTagInfo(_td_c_iterate_60_4);
            _jettag_c_iterate_60_4.doStart(context, out);
            while (_jettag_c_iterate_60_4.okToProcessBody()) {
                RuntimeTagElement _jettag_c_choose_61_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_61_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_61_6.setRuntimeParent(_jettag_c_iterate_60_4);
                _jettag_c_choose_61_6.setTagInfo(_td_c_choose_61_6);
                _jettag_c_choose_61_6.doStart(context, out);
                JET2Writer _jettag_c_choose_61_6_saved_out = out;
                while (_jettag_c_choose_61_6.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_when_62_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_62_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_62_8.setRuntimeParent(_jettag_c_choose_61_6);
                    _jettag_c_when_62_8.setTagInfo(_td_c_when_62_8);
                    _jettag_c_when_62_8.doStart(context, out);
                    JET2Writer _jettag_c_when_62_8_saved_out = out;
                    while (_jettag_c_when_62_8.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t@Get(\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_63_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_8); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_63_8.setRuntimeParent(_jettag_c_when_62_8);
                        _jettag_c_get_63_8.setTagInfo(_td_c_get_63_8);
                        _jettag_c_get_63_8.doStart(context, out);
                        _jettag_c_get_63_8.doEnd();
                        out.write("\")");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_62_8.handleBodyContent(out);
                    }
                    out = _jettag_c_when_62_8_saved_out;
                    _jettag_c_when_62_8.doEnd();
                    RuntimeTagElement _jettag_c_when_65_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_65_8); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_65_8.setRuntimeParent(_jettag_c_choose_61_6);
                    _jettag_c_when_65_8.setTagInfo(_td_c_when_65_8);
                    _jettag_c_when_65_8.doStart(context, out);
                    JET2Writer _jettag_c_when_65_8_saved_out = out;
                    while (_jettag_c_when_65_8.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("\t@Create(\"");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_66_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_11); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_66_11.setRuntimeParent(_jettag_c_when_65_8);
                        _jettag_c_get_66_11.setTagInfo(_td_c_get_66_11);
                        _jettag_c_get_66_11.doStart(context, out);
                        _jettag_c_get_66_11.doEnd();
                        out.write("\")");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_c_when_65_8.handleBodyContent(out);
                    }
                    out = _jettag_c_when_65_8_saved_out;
                    _jettag_c_when_65_8.doEnd();
                    _jettag_c_choose_61_6.handleBodyContent(out);
                }
                out = _jettag_c_choose_61_6_saved_out;
                _jettag_c_choose_61_6.doEnd();
                _jettag_c_iterate_60_4.handleBodyContent(out);
            }
            _jettag_c_iterate_60_4.doEnd();
            RuntimeTagElement _jettag_c_choose_70_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_70_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_70_4.setRuntimeParent(_jettag_c_iterate_59_2);
            _jettag_c_choose_70_4.setTagInfo(_td_c_choose_70_4);
            _jettag_c_choose_70_4.doStart(context, out);
            JET2Writer _jettag_c_choose_70_4_saved_out = out;
            while (_jettag_c_choose_70_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_71_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_71_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_71_6.setRuntimeParent(_jettag_c_choose_70_4);
                _jettag_c_when_71_6.setTagInfo(_td_c_when_71_6);
                _jettag_c_when_71_6.doStart(context, out);
                JET2Writer _jettag_c_when_71_6_saved_out = out;
                while (_jettag_c_when_71_6.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("    ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_72_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_72_5.setRuntimeParent(_jettag_c_when_71_6);
                    _jettag_c_get_72_5.setTagInfo(_td_c_get_72_5);
                    _jettag_c_get_72_5.doStart(context, out);
                    _jettag_c_get_72_5.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_72_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_48); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_72_48.setRuntimeParent(_jettag_c_when_71_6);
                    _jettag_c_get_72_48.setTagInfo(_td_c_get_72_48);
                    _jettag_c_get_72_48.doStart(context, out);
                    _jettag_c_get_72_48.doEnd();
                    out.write("();");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_when_71_6.handleBodyContent(out);
                }
                out = _jettag_c_when_71_6_saved_out;
                _jettag_c_when_71_6.doEnd();
                RuntimeTagElement _jettag_c_when_74_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_74_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_74_6.setRuntimeParent(_jettag_c_choose_70_4);
                _jettag_c_when_74_6.setTagInfo(_td_c_when_74_6);
                _jettag_c_when_74_6.doStart(context, out);
                JET2Writer _jettag_c_when_74_6_saved_out = out;
                while (_jettag_c_when_74_6.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    _jettag_c_when_74_6.handleBodyContent(out);
                }
                out = _jettag_c_when_74_6_saved_out;
                _jettag_c_when_74_6.doEnd();
                RuntimeTagElement _jettag_c_when_76_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_76_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_76_6.setRuntimeParent(_jettag_c_choose_70_4);
                _jettag_c_when_76_6.setTagInfo(_td_c_when_76_6);
                _jettag_c_when_76_6.doStart(context, out);
                JET2Writer _jettag_c_when_76_6_saved_out = out;
                while (_jettag_c_when_76_6.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_77_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_77_2.setRuntimeParent(_jettag_c_when_76_6);
                    _jettag_c_get_77_2.setTagInfo(_td_c_get_77_2);
                    _jettag_c_get_77_2.doStart(context, out);
                    _jettag_c_get_77_2.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_77_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_77_45); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_77_45.setRuntimeParent(_jettag_c_when_76_6);
                    _jettag_c_get_77_45.setTagInfo(_td_c_get_77_45);
                    _jettag_c_get_77_45.doStart(context, out);
                    _jettag_c_get_77_45.doEnd();
                    out.write("();");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_when_76_6.handleBodyContent(out);
                }
                out = _jettag_c_when_76_6_saved_out;
                _jettag_c_when_76_6.doEnd();
                RuntimeTagElement _jettag_c_when_79_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_79_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_79_6.setRuntimeParent(_jettag_c_choose_70_4);
                _jettag_c_when_79_6.setTagInfo(_td_c_when_79_6);
                _jettag_c_when_79_6.doStart(context, out);
                JET2Writer _jettag_c_when_79_6_saved_out = out;
                while (_jettag_c_when_79_6.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    _jettag_c_when_79_6.handleBodyContent(out);
                }
                out = _jettag_c_when_79_6_saved_out;
                _jettag_c_when_79_6.doEnd();
                _jettag_c_choose_70_4.handleBodyContent(out);
            }
            out = _jettag_c_choose_70_4_saved_out;
            _jettag_c_choose_70_4.doEnd();
            out.write("\t  ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_59_2.handleBodyContent(out);
        }
        _jettag_c_iterate_59_2.doEnd();
        out.write("}");  //$NON-NLS-1$        
    }
}
