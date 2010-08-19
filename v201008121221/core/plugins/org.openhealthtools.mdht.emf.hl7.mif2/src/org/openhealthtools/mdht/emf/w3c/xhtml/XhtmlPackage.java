/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.w3c.xhtml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * ********************************************************************************
 * Customized for HL7 use by by Lloyd McKenzie, Dec. 2005
 * 
 * Customizations (c) 2005-2006 by HL7 Inc.
 * 
 * Purpose:
 *   
 * 	Defines the available text markup for use in various descriptive elements in various artifacts.
 * 	The contents of this schema are owned and defined by the publishing committee.  I.e. They decide what sorts of markup are allowed
 * 
 * ********************************************************************************
 * MIF:
 * 2005 - Customized by excluding those elements not supported for HL7 use.
 * ********************************************************************************
 *     
 * 
 *     XHTML 1.0 (Second Edition) Strict in XML Schema
 * 
 *     This is the same as HTML 4 Strict except for
 *     changes due to the differences between XML and SGML.
 * 
 *     Namespace = http://www.w3.org/1999/xhtml
 * 
 *     For further information, see: http://www.w3.org/TR/xhtml1
 * 
 *     Copyright (c) 1998-2002 W3C (MIT, INRIA, Keio),
 *     All Rights Reserved. 
 * 
 *     The DTD version is identified by the PUBLIC and SYSTEM identifiers:
 * 
 *     PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
 *     SYSTEM "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"
 * 
 *     $Id: xhtml1-strict.xsd,v 1.2 2006/11/27 23:30:43 ggrieve Exp $
 *     
 * This schema has been customized for use by HL7.  While some of this could have been done using re-defines, errors with XMLSpy make it easier to do here.  Also, some of the constraints are not supported using the 'restriction' approach due to how the XHTML schema has been defined, though the net effect is still a legitimate constraint on the XHTML schema.
 * UML: This markup content is outside of the UML model.  It should be conveyed within UML as just a string of marked-up text.
 * these are used for image maps
 * definition lists - dt for term, dd for its definition
 * ins/del are allowed in block and inline content, but it's inappropriate to include block content within an ins element occurring in inline content.
 * Derived from IETF HTML table standard, see [RFC1942]
 * Use thead to duplicate headers when breaking table across page boundaries, or for static headers when tbody sections are rendered in scrolling panel.
 *       Use tfoot to duplicate footers when breaking table across page boundaries, or for static footers when tbody sections are rendered in scrolling panel.
 *       Use multiple tbody sections when rules are needed between groups of table rows.
 *     
 * 
 *    See http://www.w3.org/XML/1998/namespace.html and
 *    http://www.w3.org/TR/REC-xml for information about this namespace.
 * 
 *     This schema document describes the XML namespace, in a form
 *     suitable for import by other schema documents.  
 * 
 *     Note that local names in this namespace are intended to be defined
 *     only by the World Wide Web Consortium or its subgroups.  The
 *     following names are currently defined in this namespace and should
 *     not be used with conflicting semantics by any Working Group,
 *     specification, or document instance:
 * 
 *     base (as an attribute name): denotes an attribute whose value
 *          provides a URI to be used as the base for interpreting any
 *          relative URIs in the scope of the element on which it
 *          appears; its value is inherited.  This name is reserved
 *          by virtue of its definition in the XML Base specification.
 * 
 *     id   (as an attribute name): denotes an attribute whose value
 *          should be interpreted as if declared to be of type ID.
 *          The xml:id specification is not yet a W3C Recommendation,
 *          but this attribute is included here to facilitate experimentation
 *          with the mechanisms it proposes.  Note that it is _not_ included
 *          in the specialAttrs attribute group.
 * 
 *     lang (as an attribute name): denotes an attribute whose value
 *          is a language code for the natural language of the content of
 *          any element; its value is inherited.  This name is reserved
 *          by virtue of its definition in the XML specification.
 *   
 *     space (as an attribute name): denotes an attribute whose
 *          value is a keyword indicating what whitespace processing
 *          discipline is intended for the content of the element; its
 *          value is inherited.  This name is reserved by virtue of its
 *          definition in the XML specification.
 * 
 *     Father (in any context at all): denotes Jon Bosak, the chair of 
 *          the original XML Working Group.  This name is reserved by 
 *          the following decision of the W3C XML Plenary and 
 *          XML Coordination groups:
 * 
 *              In appreciation for his vision, leadership and dedication
 *              the W3C XML Plenary on this 10th day of February, 2000
 *              reserves for Jon Bosak in perpetuity the XML name
 *              xml:Father
 *   
 * This schema defines attributes and an attribute group
 *         suitable for use by
 *         schemas wishing to allow xml:base, xml:lang or xml:space attributes
 *         on elements they define.
 * 
 *         To enable this, such a schema must import this schema
 *         for the XML namespace, e.g. as follows:
 *         &lt;schema . . .&gt;
 *          . . .
 *          &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                     schemaLocation="http://www.w3.org/2001/03/xml.xsd"/&gt;
 * 
 *         Subsequently, qualified reference to any of the attributes
 *         or the group defined below will have the desired effect, e.g.
 * 
 *         &lt;type . . .&gt;
 *          . . .
 *          &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *  
 *          will define a type which will schema-validate an instance
 *          element with any of those attributes
 * In keeping with the XML Schema WG's standard versioning
 *    policy, this schema document will persist at
 *    http://www.w3.org/2005/08/xml.xsd.
 *    At the date of issue it can also be found at
 *    http://www.w3.org/2001/xml.xsd.
 *    The schema document at that URI may however change in the future,
 *    in order to remain compatible with the latest version of XML Schema
 *    itself, or with the XML namespace itself.  In other words, if the XML
 *    Schema or XML namespaces change, the version of this document at
 *    http://www.w3.org/2001/xml.xsd will change
 *    accordingly; the version at
 *    http://www.w3.org/2005/08/xml.xsd will not change.
 *   
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlFactory
 * @model kind="package"
 *        annotation="http://www.w3.org/XML/1998/namespace lang='en'"
 * @generated
 */
public interface XhtmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xhtml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/1999/xhtml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xhtml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XhtmlPackage eINSTANCE = org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl <em>AContent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getAContent()
	 * @generated
	 */
	int ACONTENT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__IMG = 5;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__TT = 6;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__I = 7;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__B = 8;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__BIG = 9;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__SMALL = 10;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__EM = 11;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__STRONG = 12;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__DFN = 13;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__CODE = 14;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__Q = 15;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__SAMP = 16;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__KBD = 17;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__VAR = 18;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__CITE = 19;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__ABBR = 20;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__ACRONYM = 21;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__SUB = 22;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__SUP = 23;

	/**
	 * The number of structural features of the '<em>AContent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT_FEATURE_COUNT = 24;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AImpl <em>A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getA()
	 * @generated
	 */
	int A = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__MIXED = ACONTENT__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__GROUP = ACONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__BR = ACONTENT__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__SPAN = ACONTENT__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__OBJECT = ACONTENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__IMG = ACONTENT__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__TT = ACONTENT__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__I = ACONTENT__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__B = ACONTENT__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__BIG = ACONTENT__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__SMALL = ACONTENT__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__EM = ACONTENT__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__STRONG = ACONTENT__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__DFN = ACONTENT__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__CODE = ACONTENT__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__Q = ACONTENT__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__SAMP = ACONTENT__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__KBD = ACONTENT__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__VAR = ACONTENT__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__CITE = ACONTENT__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__ABBR = ACONTENT__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__ACRONYM = ACONTENT__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__SUB = ACONTENT__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__SUP = ACONTENT__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__CLASS = ACONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__COORDS = ACONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__HREF = ACONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__LANG = ACONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__NAME = ACONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__SHAPE = ACONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__STYLE = ACONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__TYPE = ACONTENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_FEATURE_COUNT = ACONTENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl <em>Inline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getInline()
	 * @generated
	 */
	int INLINE = 25;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__INLINE = 1;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__A = 2;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__BR = 3;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__SPAN = 4;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__IMG = 6;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__TT = 7;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__I = 8;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__B = 9;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__BIG = 10;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__SMALL = 11;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__EM = 12;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__STRONG = 13;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__DFN = 14;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__CODE = 15;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__Q = 16;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__SAMP = 17;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__KBD = 18;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__VAR = 19;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__CITE = 20;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__ABBR = 21;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__ACRONYM = 22;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__SUB = 23;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__SUP = 24;

	/**
	 * The number of structural features of the '<em>Inline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FEATURE_COUNT = 25;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AbbrImpl <em>Abbr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AbbrImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getAbbr()
	 * @generated
	 */
	int ABBR = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abbr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AcronymImpl <em>Acronym</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AcronymImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getAcronym()
	 * @generated
	 */
	int ACRONYM = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Acronym</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BImpl <em>B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getB()
	 * @generated
	 */
	int B = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BigImpl <em>Big</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BigImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getBig()
	 * @generated
	 */
	int BIG = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Big</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCK = 1;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__P = 2;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DIV = 3;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__UL = 4;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OL = 5;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DL = 6;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__PRE = 7;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__HR = 8;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCKQUOTE = 9;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TABLE = 10;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockquoteImpl <em>Blockquote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockquoteImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getBlockquote()
	 * @generated
	 */
	int BLOCKQUOTE = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__MIXED = BLOCK__MIXED;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__BLOCK = BLOCK__BLOCK;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__P = BLOCK__P;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__DIV = BLOCK__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__UL = BLOCK__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__OL = BLOCK__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__DL = BLOCK__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__PRE = BLOCK__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__HR = BLOCK__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__BLOCKQUOTE = BLOCK__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__TABLE = BLOCK__TABLE;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__CITE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__CLASS = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__LANG = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__STYLE = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Blockquote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BrImpl <em>Br</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BrImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getBr()
	 * @generated
	 */
	int BR = 8;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR__STYLE = 1;

	/**
	 * The number of structural features of the '<em>Br</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.CaptionImpl <em>Caption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.CaptionImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getCaption()
	 * @generated
	 */
	int CAPTION = 9;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Caption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.CiteImpl <em>Cite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.CiteImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getCite()
	 * @generated
	 */
	int CITE = 10;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.CodeImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ColImpl <em>Col</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ColImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getCol()
	 * @generated
	 */
	int COL = 12;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__ALIGN = 0;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__CHAR = 1;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__CHAROFF = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__LANG = 4;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__SPAN = 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__STYLE = 6;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__VALIGN = 7;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__WIDTH = 8;

	/**
	 * The number of structural features of the '<em>Col</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ColgroupImpl <em>Colgroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ColgroupImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getColgroup()
	 * @generated
	 */
	int COLGROUP = 13;

	/**
	 * The feature id for the '<em><b>Col</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP__COL = 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP__ALIGN = 1;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP__CHAR = 2;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP__CHAROFF = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP__LANG = 5;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP__SPAN = 6;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP__STYLE = 7;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP__VALIGN = 8;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP__WIDTH = 9;

	/**
	 * The number of structural features of the '<em>Colgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 21;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__GROUP = 1;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__P = 2;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DIV = 3;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__UL = 4;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__OL = 5;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DL = 6;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__PRE = 7;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__HR = 8;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__BLOCKQUOTE = 9;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TABLE = 10;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__A = 11;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__BR = 12;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SPAN = 13;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__OBJECT = 14;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__IMG = 15;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TT = 16;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__I = 17;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__B = 18;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__BIG = 19;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SMALL = 20;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__EM = 21;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__STRONG = 22;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DFN = 23;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CODE = 24;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__Q = 25;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SAMP = 26;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__KBD = 27;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__VAR = 28;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CITE = 29;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ABBR = 30;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ACRONYM = 31;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SUB = 32;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SUP = 33;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = 34;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DdImpl <em>Dd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DdImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getDd()
	 * @generated
	 */
	int DD = 14;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__OBJECT = FLOW__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__SUP = FLOW__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__CLASS = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__LANG = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD__STYLE = FLOW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_FEATURE_COUNT = FLOW_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DelImpl <em>Del</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DelImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getDel()
	 * @generated
	 */
	int DEL = 15;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__OBJECT = FLOW__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL__SUP = FLOW__SUP;

	/**
	 * The number of structural features of the '<em>Del</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_FEATURE_COUNT = FLOW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DfnImpl <em>Dfn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DfnImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getDfn()
	 * @generated
	 */
	int DFN = 16;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dfn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DivImpl <em>Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DivImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getDiv()
	 * @generated
	 */
	int DIV = 17;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__OBJECT = FLOW__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__SUP = FLOW__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__CLASS = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hl7 Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__HL7_ID = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__LANG = FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__STYLE = FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__TITLE = FLOW_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = FLOW_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DlImpl <em>Dl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DlImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getDl()
	 * @generated
	 */
	int DL = 18;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Dt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL__DT = 1;

	/**
	 * The feature id for the '<em><b>Dd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL__DD = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL__LANG = 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL__STYLE = 5;

	/**
	 * The number of structural features of the '<em>Dl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DtImpl <em>Dt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DtImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getDt()
	 * @generated
	 */
	int DT = 19;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.EmImpl <em>Em</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.EmImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getEm()
	 * @generated
	 */
	int EM = 20;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Em</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.HrImpl <em>Hr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.HrImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getHr()
	 * @generated
	 */
	int HR = 22;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR__LANG = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR__STYLE = 2;

	/**
	 * The number of structural features of the '<em>Hr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.IImpl <em>I</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.IImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getI()
	 * @generated
	 */
	int I = 23;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>I</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ImgImpl <em>Img</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ImgImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getImg()
	 * @generated
	 */
	int IMG = 24;

	/**
	 * The feature id for the '<em><b>Thumbnail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__THUMBNAIL = 0;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__ALT = 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__CLASS = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__HEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Hl7 Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__HL7_ID = 4;

	/**
	 * The feature id for the '<em><b>Image Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__IMAGE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__LANG = 6;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__SRC = 7;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__STYLE = 8;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG__WIDTH = 9;

	/**
	 * The number of structural features of the '<em>Img</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InsImpl <em>Ins</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InsImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getIns()
	 * @generated
	 */
	int INS = 26;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__OBJECT = FLOW__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS__SUP = FLOW__SUP;

	/**
	 * The number of structural features of the '<em>Ins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_FEATURE_COUNT = FLOW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.KbdImpl <em>Kbd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.KbdImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getKbd()
	 * @generated
	 */
	int KBD = 27;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Kbd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.LiImpl <em>Li</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.LiImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getLi()
	 * @generated
	 */
	int LI = 28;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__OBJECT = FLOW__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__SUP = FLOW__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__CLASS = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__LANG = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI__STYLE = FLOW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Li</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_FEATURE_COUNT = FLOW_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 29;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__PARAM = 2;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__P = 3;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__DIV = 4;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__UL = 5;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OL = 6;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__DL = 7;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__PRE = 8;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__HR = 9;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__BLOCKQUOTE = 10;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TABLE = 11;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__A = 12;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__BR = 13;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__SPAN = 14;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OBJECT = 15;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__IMG = 16;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TT = 17;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__I = 18;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__B = 19;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__BIG = 20;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__SMALL = 21;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__EM = 22;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__STRONG = 23;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__DFN = 24;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__CODE = 25;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__Q = 26;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__SAMP = 27;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__KBD = 28;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__VAR = 29;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__CITE = 30;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ABBR = 31;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ACRONYM = 32;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__SUB = 33;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__SUP = 34;

	/**
	 * The feature id for the '<em><b>Hl7 Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__HL7_ID = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = 36;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 37;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.OlImpl <em>Ol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.OlImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getOl()
	 * @generated
	 */
	int OL = 30;

	/**
	 * The feature id for the '<em><b>Li</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL__LI = 0;

	/**
	 * The feature id for the '<em><b>Li1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL__LI1 = 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL__CLASS = 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL__LANG = 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL__STYLE = 4;

	/**
	 * The number of structural features of the '<em>Ol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PImpl <em>P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getP()
	 * @generated
	 */
	int P = 31;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ParamImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getParam()
	 * @generated
	 */
	int PARAM = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl <em>Pre Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getPreContent()
	 * @generated
	 */
	int PRE_CONTENT = 34;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__GROUP = 1;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__A = 2;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__TT = 3;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__I = 4;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__B = 5;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__BIG = 6;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__SMALL = 7;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__EM = 8;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__STRONG = 9;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__DFN = 10;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__CODE = 11;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__Q = 12;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__SAMP = 13;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__KBD = 14;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__VAR = 15;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__CITE = 16;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__ABBR = 17;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__ACRONYM = 18;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__SUB = 19;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__SUP = 20;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__BR = 21;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__SPAN = 22;

	/**
	 * The number of structural features of the '<em>Pre Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT_FEATURE_COUNT = 23;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreImpl <em>Pre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getPre()
	 * @generated
	 */
	int PRE = 33;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__MIXED = PRE_CONTENT__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__GROUP = PRE_CONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__A = PRE_CONTENT__A;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__TT = PRE_CONTENT__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__I = PRE_CONTENT__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__B = PRE_CONTENT__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__BIG = PRE_CONTENT__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__SMALL = PRE_CONTENT__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__EM = PRE_CONTENT__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__STRONG = PRE_CONTENT__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__DFN = PRE_CONTENT__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__CODE = PRE_CONTENT__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__Q = PRE_CONTENT__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__SAMP = PRE_CONTENT__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__KBD = PRE_CONTENT__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__VAR = PRE_CONTENT__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__CITE = PRE_CONTENT__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__ABBR = PRE_CONTENT__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__ACRONYM = PRE_CONTENT__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__SUB = PRE_CONTENT__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__SUP = PRE_CONTENT__SUP;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__BR = PRE_CONTENT__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__SPAN = PRE_CONTENT__SPAN;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__CLASS = PRE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__LANG = PRE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__SPACE = PRE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE__STYLE = PRE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_FEATURE_COUNT = PRE_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.QImpl <em>Q</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.QImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getQ()
	 * @generated
	 */
	int Q = 35;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Cite1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__CITE1 = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__CLASS = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__LANG = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q__STYLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Q</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Q_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SampImpl <em>Samp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SampImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getSamp()
	 * @generated
	 */
	int SAMP = 36;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Samp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SmallImpl <em>Small</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SmallImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getSmall()
	 * @generated
	 */
	int SMALL = 37;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Small</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SpanImpl <em>Span</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SpanImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getSpan()
	 * @generated
	 */
	int SPAN = 38;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.StrongImpl <em>Strong</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.StrongImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getStrong()
	 * @generated
	 */
	int STRONG = 39;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Strong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SubImpl <em>Sub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SubImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getSub()
	 * @generated
	 */
	int SUB = 40;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SupImpl <em>Sup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SupImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getSup()
	 * @generated
	 */
	int SUP = 41;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 42;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CAPTION = 0;

	/**
	 * The feature id for the '<em><b>Col</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COL = 1;

	/**
	 * The feature id for the '<em><b>Colgroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLGROUP = 2;

	/**
	 * The feature id for the '<em><b>Thead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__THEAD = 3;

	/**
	 * The feature id for the '<em><b>Tfoot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TFOOT = 4;

	/**
	 * The feature id for the '<em><b>Tbody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TBODY = 5;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TR = 6;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BORDER = 7;

	/**
	 * The feature id for the '<em><b>Cellpadding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CELLPADDING = 8;

	/**
	 * The feature id for the '<em><b>Cellspacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CELLSPACING = 9;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CLASS = 10;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FRAME = 11;

	/**
	 * The feature id for the '<em><b>Hl7 Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HL7_ID = 12;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LANG = 13;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__RULES = 14;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__STYLE = 15;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WIDTH = 16;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TbodyImpl <em>Tbody</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TbodyImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTbody()
	 * @generated
	 */
	int TBODY = 43;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY__TR = 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY__ALIGN = 1;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY__CHAR = 2;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY__CHAROFF = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY__LANG = 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY__STYLE = 6;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY__VALIGN = 7;

	/**
	 * The number of structural features of the '<em>Tbody</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TdImpl <em>Td</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TdImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTd()
	 * @generated
	 */
	int TD = 44;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__OBJECT = FLOW__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__SUP = FLOW__SUP;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__ALIGN = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__CHAR = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__CHAROFF = FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__CLASS = FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__COLSPAN = FLOW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__LANG = FLOW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__ROWSPAN = FLOW_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__STYLE = FLOW_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD__VALIGN = FLOW_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Td</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_FEATURE_COUNT = FLOW_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TfootImpl <em>Tfoot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TfootImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTfoot()
	 * @generated
	 */
	int TFOOT = 45;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT__TR = 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT__ALIGN = 1;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT__CHAR = 2;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT__CHAROFF = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT__LANG = 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT__STYLE = 6;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT__VALIGN = 7;

	/**
	 * The number of structural features of the '<em>Tfoot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ThImpl <em>Th</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ThImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTh()
	 * @generated
	 */
	int TH = 46;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__OBJECT = FLOW__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__SUP = FLOW__SUP;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__ALIGN = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__CHAR = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__CHAROFF = FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__CLASS = FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__COLSPAN = FLOW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__LANG = FLOW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__ROWSPAN = FLOW_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__STYLE = FLOW_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH__VALIGN = FLOW_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Th</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_FEATURE_COUNT = FLOW_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TheadImpl <em>Thead</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TheadImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getThead()
	 * @generated
	 */
	int THEAD = 47;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD__TR = 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD__ALIGN = 1;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD__CHAR = 2;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD__CHAROFF = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD__LANG = 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD__STYLE = 6;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD__VALIGN = 7;

	/**
	 * The number of structural features of the '<em>Thead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TrImpl <em>Tr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TrImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTr()
	 * @generated
	 */
	int TR = 48;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Th</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__TH = 1;

	/**
	 * The feature id for the '<em><b>Td</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__TD = 2;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__ALIGN = 3;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__CHAR = 4;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__CHAROFF = 5;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__CLASS = 6;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__LANG = 7;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__STYLE = 8;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR__VALIGN = 9;

	/**
	 * The number of structural features of the '<em>Tr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TtImpl <em>Tt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TtImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTt()
	 * @generated
	 */
	int TT = 49;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.UlImpl <em>Ul</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.UlImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getUl()
	 * @generated
	 */
	int UL = 50;

	/**
	 * The feature id for the '<em><b>Li</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL__LI = 0;

	/**
	 * The feature id for the '<em><b>Li1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL__LI1 = 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL__CLASS = 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL__LANG = 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL__STYLE = 4;

	/**
	 * The number of structural features of the '<em>Ul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.VarImpl <em>Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.VarImpl
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getVar()
	 * @generated
	 */
	int VAR = 51;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__INLINE = INLINE__INLINE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__LANG = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_FEATURE_COUNT = INLINE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AlignType <em>Align Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AlignType
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getAlignType()
	 * @generated
	 */
	int ALIGN_TYPE = 52;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.ImageKind <em>Image Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ImageKind
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getImageKind()
	 * @generated
	 */
	int IMAGE_KIND = 53;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.MediaType <em>Media Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.MediaType
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getMediaType()
	 * @generated
	 */
	int MEDIA_TYPE = 54;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType <em>Mif Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getMifClassType()
	 * @generated
	 */
	int MIF_CLASS_TYPE = 55;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.ObjectName <em>Object Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ObjectName
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getObjectName()
	 * @generated
	 */
	int OBJECT_NAME = 56;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.ParamName <em>Param Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ParamName
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getParamName()
	 * @generated
	 */
	int PARAM_NAME = 57;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Shape <em>Shape</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Shape
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 58;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet <em>Style Sheet</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getStyleSheet()
	 * @generated
	 */
	int STYLE_SHEET = 59;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.TFrame <em>TFrame</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.TFrame
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTFrame()
	 * @generated
	 */
	int TFRAME = 60;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.TRules <em>TRules</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.TRules
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTRules()
	 * @generated
	 */
	int TRULES = 61;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.ValignType <em>Valign Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ValignType
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getValignType()
	 * @generated
	 */
	int VALIGN_TYPE = 62;

	/**
	 * The meta object id for the '<em>Align Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AlignType
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getAlignTypeObject()
	 * @generated
	 */
	int ALIGN_TYPE_OBJECT = 63;

	/**
	 * The meta object id for the '<em>Character</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getCharacter()
	 * @generated
	 */
	int CHARACTER = 64;

	/**
	 * The meta object id for the '<em>Content Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getContentType()
	 * @generated
	 */
	int CONTENT_TYPE = 65;

	/**
	 * The meta object id for the '<em>Coords</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getCoords()
	 * @generated
	 */
	int COORDS = 66;

	/**
	 * The meta object id for the '<em>Image Kind Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ImageKind
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getImageKindObject()
	 * @generated
	 */
	int IMAGE_KIND_OBJECT = 67;

	/**
	 * The meta object id for the '<em>Length</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 68;

	/**
	 * The meta object id for the '<em>Media Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.MediaType
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getMediaTypeObject()
	 * @generated
	 */
	int MEDIA_TYPE_OBJECT = 69;

	/**
	 * The meta object id for the '<em>Mif Class Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getMifClassTypeObject()
	 * @generated
	 */
	int MIF_CLASS_TYPE_OBJECT = 70;

	/**
	 * The meta object id for the '<em>Multi Length</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getMultiLength()
	 * @generated
	 */
	int MULTI_LENGTH = 71;

	/**
	 * The meta object id for the '<em>Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 72;

	/**
	 * The meta object id for the '<em>Object Name Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ObjectName
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getObjectNameObject()
	 * @generated
	 */
	int OBJECT_NAME_OBJECT = 73;

	/**
	 * The meta object id for the '<em>Param Name Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ParamName
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getParamNameObject()
	 * @generated
	 */
	int PARAM_NAME_OBJECT = 74;

	/**
	 * The meta object id for the '<em>Param Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getParamValue()
	 * @generated
	 */
	int PARAM_VALUE = 75;

	/**
	 * The meta object id for the '<em>Pixels</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getPixels()
	 * @generated
	 */
	int PIXELS = 76;

	/**
	 * The meta object id for the '<em>Shape Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Shape
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getShapeObject()
	 * @generated
	 */
	int SHAPE_OBJECT = 77;

	/**
	 * The meta object id for the '<em>Style Sheet Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getStyleSheetObject()
	 * @generated
	 */
	int STYLE_SHEET_OBJECT = 78;

	/**
	 * The meta object id for the '<em>Text</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 79;

	/**
	 * The meta object id for the '<em>TFrame Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.TFrame
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTFrameObject()
	 * @generated
	 */
	int TFRAME_OBJECT = 80;

	/**
	 * The meta object id for the '<em>TRules Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.TRules
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTRulesObject()
	 * @generated
	 */
	int TRULES_OBJECT = 81;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getURI()
	 * @generated
	 */
	int URI = 82;

	/**
	 * The meta object id for the '<em>Valign Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ValignType
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getValignTypeObject()
	 * @generated
	 */
	int VALIGN_TYPE_OBJECT = 83;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.A <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.A
	 * @generated
	 */
	EClass getA();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.A#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.A#getClass_()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.A#getCoords <em>Coords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coords</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.A#getCoords()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Coords();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.A#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.A#getHref()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.A#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.A#getLang()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.A#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.A#getName()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.A#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.A#getShape()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Shape();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.A#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.A#getStyle()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.A#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.A#getType()
	 * @see #getA()
	 * @generated
	 */
	EAttribute getA_Type();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Abbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abbr</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Abbr
	 * @generated
	 */
	EClass getAbbr();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Abbr#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Abbr#getClass_()
	 * @see #getAbbr()
	 * @generated
	 */
	EAttribute getAbbr_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Abbr#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Abbr#getLang()
	 * @see #getAbbr()
	 * @generated
	 */
	EAttribute getAbbr_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Abbr#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Abbr#getStyle()
	 * @see #getAbbr()
	 * @generated
	 */
	EAttribute getAbbr_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent <em>AContent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AContent</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent
	 * @generated
	 */
	EClass getAContent();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getMixed()
	 * @see #getAContent()
	 * @generated
	 */
	EAttribute getAContent_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getGroup()
	 * @see #getAContent()
	 * @generated
	 */
	EAttribute getAContent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getBr()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getSpan()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getObject()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getImg()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Img();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getTt()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getI()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getB()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getBig()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getSmall()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getEm()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getStrong()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getDfn()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getCode()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getQ()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getSamp()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getKbd()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getVar()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getCite()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getAbbr()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getAcronym()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getSub()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AContent#getSup()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Sup();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Acronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acronym</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Acronym
	 * @generated
	 */
	EClass getAcronym();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Acronym#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Acronym#getClass_()
	 * @see #getAcronym()
	 * @generated
	 */
	EAttribute getAcronym_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Acronym#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Acronym#getLang()
	 * @see #getAcronym()
	 * @generated
	 */
	EAttribute getAcronym_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Acronym#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Acronym#getStyle()
	 * @see #getAcronym()
	 * @generated
	 */
	EAttribute getAcronym_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.B <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.B
	 * @generated
	 */
	EClass getB();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.B#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.B#getClass_()
	 * @see #getB()
	 * @generated
	 */
	EAttribute getB_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.B#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.B#getLang()
	 * @see #getB()
	 * @generated
	 */
	EAttribute getB_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.B#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.B#getStyle()
	 * @see #getB()
	 * @generated
	 */
	EAttribute getB_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Big <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Big
	 * @generated
	 */
	EClass getBig();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Big#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Big#getClass_()
	 * @see #getBig()
	 * @generated
	 */
	EAttribute getBig_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Big#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Big#getLang()
	 * @see #getBig()
	 * @generated
	 */
	EAttribute getBig_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Big#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Big#getStyle()
	 * @see #getBig()
	 * @generated
	 */
	EAttribute getBig_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Block#getMixed()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Block</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Block#getBlock()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Block();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Block#getP()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Block#getDiv()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Block#getUl()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Block#getOl()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dl</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Block#getDl()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Dl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Block#getPre()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Block#getHr()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Block#getBlockquote()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Block#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Block#getTable()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Table();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Blockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blockquote</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Blockquote
	 * @generated
	 */
	EClass getBlockquote();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Blockquote#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cite</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Blockquote#getCite()
	 * @see #getBlockquote()
	 * @generated
	 */
	EAttribute getBlockquote_Cite();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Blockquote#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Blockquote#getClass_()
	 * @see #getBlockquote()
	 * @generated
	 */
	EAttribute getBlockquote_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Blockquote#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Blockquote#getLang()
	 * @see #getBlockquote()
	 * @generated
	 */
	EAttribute getBlockquote_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Blockquote#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Blockquote#getStyle()
	 * @see #getBlockquote()
	 * @generated
	 */
	EAttribute getBlockquote_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Br <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Br</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Br
	 * @generated
	 */
	EClass getBr();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Br#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Br#getClass_()
	 * @see #getBr()
	 * @generated
	 */
	EAttribute getBr_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Br#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Br#getStyle()
	 * @see #getBr()
	 * @generated
	 */
	EAttribute getBr_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Caption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caption</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Caption
	 * @generated
	 */
	EClass getCaption();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Caption#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Caption#getClass_()
	 * @see #getCaption()
	 * @generated
	 */
	EAttribute getCaption_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Caption#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Caption#getLang()
	 * @see #getCaption()
	 * @generated
	 */
	EAttribute getCaption_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Caption#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Caption#getStyle()
	 * @see #getCaption()
	 * @generated
	 */
	EAttribute getCaption_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Cite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cite</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Cite
	 * @generated
	 */
	EClass getCite();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Cite#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Cite#getClass_()
	 * @see #getCite()
	 * @generated
	 */
	EAttribute getCite_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Cite#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Cite#getLang()
	 * @see #getCite()
	 * @generated
	 */
	EAttribute getCite_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Cite#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Cite#getStyle()
	 * @see #getCite()
	 * @generated
	 */
	EAttribute getCite_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Code#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Code#getClass_()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Code#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Code#getLang()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Code#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Code#getStyle()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Col <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Col</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Col
	 * @generated
	 */
	EClass getCol();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Col#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Col#getAlign()
	 * @see #getCol()
	 * @generated
	 */
	EAttribute getCol_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Col#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Col#getChar()
	 * @see #getCol()
	 * @generated
	 */
	EAttribute getCol_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Col#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Col#getCharoff()
	 * @see #getCol()
	 * @generated
	 */
	EAttribute getCol_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Col#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Col#getClass_()
	 * @see #getCol()
	 * @generated
	 */
	EAttribute getCol_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Col#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Col#getLang()
	 * @see #getCol()
	 * @generated
	 */
	EAttribute getCol_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Col#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Col#getSpan()
	 * @see #getCol()
	 * @generated
	 */
	EAttribute getCol_Span();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Col#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Col#getStyle()
	 * @see #getCol()
	 * @generated
	 */
	EAttribute getCol_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Col#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Col#getValign()
	 * @see #getCol()
	 * @generated
	 */
	EAttribute getCol_Valign();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Col#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Col#getWidth()
	 * @see #getCol()
	 * @generated
	 */
	EAttribute getCol_Width();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup <em>Colgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colgroup</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup
	 * @generated
	 */
	EClass getColgroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Col</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getCol()
	 * @see #getColgroup()
	 * @generated
	 */
	EReference getColgroup_Col();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getAlign()
	 * @see #getColgroup()
	 * @generated
	 */
	EAttribute getColgroup_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getChar()
	 * @see #getColgroup()
	 * @generated
	 */
	EAttribute getColgroup_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getCharoff()
	 * @see #getColgroup()
	 * @generated
	 */
	EAttribute getColgroup_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getClass_()
	 * @see #getColgroup()
	 * @generated
	 */
	EAttribute getColgroup_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getLang()
	 * @see #getColgroup()
	 * @generated
	 */
	EAttribute getColgroup_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getSpan()
	 * @see #getColgroup()
	 * @generated
	 */
	EAttribute getColgroup_Span();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getStyle()
	 * @see #getColgroup()
	 * @generated
	 */
	EAttribute getColgroup_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getValign()
	 * @see #getColgroup()
	 * @generated
	 */
	EAttribute getColgroup_Valign();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Colgroup#getWidth()
	 * @see #getColgroup()
	 * @generated
	 */
	EAttribute getColgroup_Width();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dd <em>Dd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dd</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dd
	 * @generated
	 */
	EClass getDd();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dd#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dd#getClass_()
	 * @see #getDd()
	 * @generated
	 */
	EAttribute getDd_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dd#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dd#getLang()
	 * @see #getDd()
	 * @generated
	 */
	EAttribute getDd_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dd#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dd#getStyle()
	 * @see #getDd()
	 * @generated
	 */
	EAttribute getDd_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Del <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Del</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Del
	 * @generated
	 */
	EClass getDel();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dfn</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dfn
	 * @generated
	 */
	EClass getDfn();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dfn#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dfn#getClass_()
	 * @see #getDfn()
	 * @generated
	 */
	EAttribute getDfn_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dfn#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dfn#getLang()
	 * @see #getDfn()
	 * @generated
	 */
	EAttribute getDfn_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dfn#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dfn#getStyle()
	 * @see #getDfn()
	 * @generated
	 */
	EAttribute getDfn_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Div
	 * @generated
	 */
	EClass getDiv();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Div#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Div#getClass_()
	 * @see #getDiv()
	 * @generated
	 */
	EAttribute getDiv_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Div#getHl7Id <em>Hl7 Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hl7 Id</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Div#getHl7Id()
	 * @see #getDiv()
	 * @generated
	 */
	EAttribute getDiv_Hl7Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Div#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Div#getLang()
	 * @see #getDiv()
	 * @generated
	 */
	EAttribute getDiv_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Div#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Div#getStyle()
	 * @see #getDiv()
	 * @generated
	 */
	EAttribute getDiv_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Div#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Div#getTitle()
	 * @see #getDiv()
	 * @generated
	 */
	EAttribute getDiv_Title();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dl</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dl
	 * @generated
	 */
	EClass getDl();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dl#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dl#getGroup()
	 * @see #getDl()
	 * @generated
	 */
	EAttribute getDl_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dl#getDt <em>Dt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dt</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dl#getDt()
	 * @see #getDl()
	 * @generated
	 */
	EReference getDl_Dt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dl#getDd <em>Dd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dd</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dl#getDd()
	 * @see #getDl()
	 * @generated
	 */
	EReference getDl_Dd();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dl#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dl#getClass_()
	 * @see #getDl()
	 * @generated
	 */
	EAttribute getDl_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dl#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dl#getLang()
	 * @see #getDl()
	 * @generated
	 */
	EAttribute getDl_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dl#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dl#getStyle()
	 * @see #getDl()
	 * @generated
	 */
	EAttribute getDl_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dt <em>Dt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dt</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dt
	 * @generated
	 */
	EClass getDt();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dt#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dt#getClass_()
	 * @see #getDt()
	 * @generated
	 */
	EAttribute getDt_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dt#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dt#getLang()
	 * @see #getDt()
	 * @generated
	 */
	EAttribute getDt_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Dt#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Dt#getStyle()
	 * @see #getDt()
	 * @generated
	 */
	EAttribute getDt_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Em <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Em</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Em
	 * @generated
	 */
	EClass getEm();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Em#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Em#getClass_()
	 * @see #getEm()
	 * @generated
	 */
	EAttribute getEm_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Em#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Em#getLang()
	 * @see #getEm()
	 * @generated
	 */
	EAttribute getEm_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Em#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Em#getStyle()
	 * @see #getEm()
	 * @generated
	 */
	EAttribute getEm_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getMixed()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getGroup()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getP()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getDiv()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getUl()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getOl()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dl</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getDl()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Dl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getPre()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getHr()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getBlockquote()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getTable()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getA()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getBr()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getSpan()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getObject()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getImg()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Img();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getTt()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getI()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getB()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getBig()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getSmall()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getEm()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getStrong()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getDfn()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getCode()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getQ()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getSamp()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getKbd()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getVar()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getCite()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getAbbr()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getAcronym()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getSub()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow#getSup()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Sup();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Hr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hr</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Hr
	 * @generated
	 */
	EClass getHr();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Hr#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Hr#getClass_()
	 * @see #getHr()
	 * @generated
	 */
	EAttribute getHr_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Hr#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Hr#getLang()
	 * @see #getHr()
	 * @generated
	 */
	EAttribute getHr_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Hr#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Hr#getStyle()
	 * @see #getHr()
	 * @generated
	 */
	EAttribute getHr_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.I <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.I
	 * @generated
	 */
	EClass getI();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.I#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.I#getClass_()
	 * @see #getI()
	 * @generated
	 */
	EAttribute getI_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.I#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.I#getLang()
	 * @see #getI()
	 * @generated
	 */
	EAttribute getI_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.I#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.I#getStyle()
	 * @see #getI()
	 * @generated
	 */
	EAttribute getI_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Img</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Img
	 * @generated
	 */
	EClass getImg();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getThumbnail <em>Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thumbnail</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Img#getThumbnail()
	 * @see #getImg()
	 * @generated
	 */
	EReference getImg_Thumbnail();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Img#getAlt()
	 * @see #getImg()
	 * @generated
	 */
	EAttribute getImg_Alt();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Img#getClass_()
	 * @see #getImg()
	 * @generated
	 */
	EAttribute getImg_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Img#getHeight()
	 * @see #getImg()
	 * @generated
	 */
	EAttribute getImg_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getHl7Id <em>Hl7 Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hl7 Id</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Img#getHl7Id()
	 * @see #getImg()
	 * @generated
	 */
	EAttribute getImg_Hl7Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getImageType <em>Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Type</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Img#getImageType()
	 * @see #getImg()
	 * @generated
	 */
	EAttribute getImg_ImageType();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Img#getLang()
	 * @see #getImg()
	 * @generated
	 */
	EAttribute getImg_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Img#getSrc()
	 * @see #getImg()
	 * @generated
	 */
	EAttribute getImg_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Img#getStyle()
	 * @see #getImg()
	 * @generated
	 */
	EAttribute getImg_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Img#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Img#getWidth()
	 * @see #getImg()
	 * @generated
	 */
	EAttribute getImg_Width();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline <em>Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline
	 * @generated
	 */
	EClass getInline();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getMixed()
	 * @see #getInline()
	 * @generated
	 */
	EAttribute getInline_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getInline <em>Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inline</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getInline()
	 * @see #getInline()
	 * @generated
	 */
	EAttribute getInline_Inline();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getA()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getBr()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getSpan()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getObject()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getImg()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Img();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getTt()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getI()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getB()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getBig()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getSmall()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getEm()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getStrong()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getDfn()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getCode()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getQ()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getSamp()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getKbd()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getVar()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getCite()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getAbbr()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getAcronym()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getSub()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Inline#getSup()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Sup();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Ins <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ins</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Ins
	 * @generated
	 */
	EClass getIns();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Kbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kbd</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Kbd
	 * @generated
	 */
	EClass getKbd();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Kbd#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Kbd#getClass_()
	 * @see #getKbd()
	 * @generated
	 */
	EAttribute getKbd_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Kbd#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Kbd#getLang()
	 * @see #getKbd()
	 * @generated
	 */
	EAttribute getKbd_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Kbd#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Kbd#getStyle()
	 * @see #getKbd()
	 * @generated
	 */
	EAttribute getKbd_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Li <em>Li</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Li</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Li
	 * @generated
	 */
	EClass getLi();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Li#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Li#getClass_()
	 * @see #getLi()
	 * @generated
	 */
	EAttribute getLi_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Li#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Li#getLang()
	 * @see #getLi()
	 * @generated
	 */
	EAttribute getLi_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Li#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Li#getStyle()
	 * @see #getLi()
	 * @generated
	 */
	EAttribute getLi_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getMixed()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getGroup()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getParam()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Param();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getP()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getDiv()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getUl()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getOl()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dl</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getDl()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Dl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getPre()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getHr()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getBlockquote()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getTable()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getA()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getBr()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getSpan()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getObject()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getImg()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Img();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getTt()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getI()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getB()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getBig()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getSmall()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getEm()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getStrong()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getDfn()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getCode()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getQ()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getSamp()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getKbd()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getVar()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getCite()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getAbbr()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getAcronym()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getSub()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getSup()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Sup();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getHl7Id <em>Hl7 Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hl7 Id</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getHl7Id()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Hl7Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Object#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Object#getName()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Name();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Ol <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ol</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Ol
	 * @generated
	 */
	EClass getOl();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Ol#getLi <em>Li</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Li</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Ol#getLi()
	 * @see #getOl()
	 * @generated
	 */
	EAttribute getOl_Li();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Ol#getLi1 <em>Li1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Li1</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Ol#getLi1()
	 * @see #getOl()
	 * @generated
	 */
	EReference getOl_Li1();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Ol#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Ol#getClass_()
	 * @see #getOl()
	 * @generated
	 */
	EAttribute getOl_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Ol#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Ol#getLang()
	 * @see #getOl()
	 * @generated
	 */
	EAttribute getOl_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Ol#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Ol#getStyle()
	 * @see #getOl()
	 * @generated
	 */
	EAttribute getOl_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.P <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>P</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.P
	 * @generated
	 */
	EClass getP();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.P#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.P#getClass_()
	 * @see #getP()
	 * @generated
	 */
	EAttribute getP_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.P#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.P#getLang()
	 * @see #getP()
	 * @generated
	 */
	EAttribute getP_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.P#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.P#getStyle()
	 * @see #getP()
	 * @generated
	 */
	EAttribute getP_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Param
	 * @generated
	 */
	EClass getParam();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Param#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Param#getName()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Param#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Param#getValue()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Value();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Pre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Pre
	 * @generated
	 */
	EClass getPre();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Pre#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Pre#getClass_()
	 * @see #getPre()
	 * @generated
	 */
	EAttribute getPre_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Pre#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Pre#getLang()
	 * @see #getPre()
	 * @generated
	 */
	EAttribute getPre_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Pre#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Pre#getSpace()
	 * @see #getPre()
	 * @generated
	 */
	EAttribute getPre_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Pre#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Pre#getStyle()
	 * @see #getPre()
	 * @generated
	 */
	EAttribute getPre_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent <em>Pre Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Content</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent
	 * @generated
	 */
	EClass getPreContent();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getMixed()
	 * @see #getPreContent()
	 * @generated
	 */
	EAttribute getPreContent_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getGroup()
	 * @see #getPreContent()
	 * @generated
	 */
	EAttribute getPreContent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getA()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getTt()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getI()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getB()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getBig()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getSmall()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getEm()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getStrong()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getDfn()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getCode()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getQ()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getSamp()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getKbd()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getVar()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getCite()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getAbbr()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getAcronym()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getSub()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getSup()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getBr()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.PreContent#getSpan()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Span();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Q <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Q</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Q
	 * @generated
	 */
	EClass getQ();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Q#getCite1 <em>Cite1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cite1</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Q#getCite1()
	 * @see #getQ()
	 * @generated
	 */
	EAttribute getQ_Cite1();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Q#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Q#getClass_()
	 * @see #getQ()
	 * @generated
	 */
	EAttribute getQ_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Q#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Q#getLang()
	 * @see #getQ()
	 * @generated
	 */
	EAttribute getQ_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Q#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Q#getStyle()
	 * @see #getQ()
	 * @generated
	 */
	EAttribute getQ_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Samp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Samp</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Samp
	 * @generated
	 */
	EClass getSamp();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Samp#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Samp#getClass_()
	 * @see #getSamp()
	 * @generated
	 */
	EAttribute getSamp_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Samp#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Samp#getLang()
	 * @see #getSamp()
	 * @generated
	 */
	EAttribute getSamp_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Samp#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Samp#getStyle()
	 * @see #getSamp()
	 * @generated
	 */
	EAttribute getSamp_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Small <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Small
	 * @generated
	 */
	EClass getSmall();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Small#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Small#getClass_()
	 * @see #getSmall()
	 * @generated
	 */
	EAttribute getSmall_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Small#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Small#getLang()
	 * @see #getSmall()
	 * @generated
	 */
	EAttribute getSmall_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Small#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Small#getStyle()
	 * @see #getSmall()
	 * @generated
	 */
	EAttribute getSmall_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Span <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Span
	 * @generated
	 */
	EClass getSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Span#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Span#getClass_()
	 * @see #getSpan()
	 * @generated
	 */
	EAttribute getSpan_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Span#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Span#getLang()
	 * @see #getSpan()
	 * @generated
	 */
	EAttribute getSpan_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Span#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Span#getStyle()
	 * @see #getSpan()
	 * @generated
	 */
	EAttribute getSpan_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Strong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Strong
	 * @generated
	 */
	EClass getStrong();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Strong#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Strong#getClass_()
	 * @see #getStrong()
	 * @generated
	 */
	EAttribute getStrong_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Strong#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Strong#getLang()
	 * @see #getStrong()
	 * @generated
	 */
	EAttribute getStrong_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Strong#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Strong#getStyle()
	 * @see #getStrong()
	 * @generated
	 */
	EAttribute getStrong_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Sub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Sub
	 * @generated
	 */
	EClass getSub();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Sub#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Sub#getClass_()
	 * @see #getSub()
	 * @generated
	 */
	EAttribute getSub_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Sub#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Sub#getLang()
	 * @see #getSub()
	 * @generated
	 */
	EAttribute getSub_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Sub#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Sub#getStyle()
	 * @see #getSub()
	 * @generated
	 */
	EAttribute getSub_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Sup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sup</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Sup
	 * @generated
	 */
	EClass getSup();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Sup#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Sup#getClass_()
	 * @see #getSup()
	 * @generated
	 */
	EAttribute getSup_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Sup#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Sup#getLang()
	 * @see #getSup()
	 * @generated
	 */
	EAttribute getSup_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Sup#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Sup#getStyle()
	 * @see #getSup()
	 * @generated
	 */
	EAttribute getSup_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caption</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table#getCaption()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Caption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Col</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table#getCol()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Col();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getColgroup <em>Colgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colgroup</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table#getColgroup()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Colgroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getThead <em>Thead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thead</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table#getThead()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Thead();

	/**
	 * Returns the meta object for the containment reference '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getTfoot <em>Tfoot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tfoot</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table#getTfoot()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Tfoot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getTbody <em>Tbody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tbody</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table#getTbody()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Tbody();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table#getTr()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Tr();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table#getBorder()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Border();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getCellpadding <em>Cellpadding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cellpadding</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table#getCellpadding()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Cellpadding();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getCellspacing <em>Cellspacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cellspacing</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table#getCellspacing()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Cellspacing();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table#getClass_()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table#getFrame()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Frame();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getHl7Id <em>Hl7 Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hl7 Id</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table#getHl7Id()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Hl7Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table#getLang()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rules</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table#getRules()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Rules();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table#getStyle()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Table#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Table#getWidth()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Width();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tbody <em>Tbody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tbody</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tbody
	 * @generated
	 */
	EClass getTbody();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tbody#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tbody#getTr()
	 * @see #getTbody()
	 * @generated
	 */
	EReference getTbody_Tr();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tbody#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tbody#getAlign()
	 * @see #getTbody()
	 * @generated
	 */
	EAttribute getTbody_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tbody#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tbody#getChar()
	 * @see #getTbody()
	 * @generated
	 */
	EAttribute getTbody_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tbody#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tbody#getCharoff()
	 * @see #getTbody()
	 * @generated
	 */
	EAttribute getTbody_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tbody#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tbody#getClass_()
	 * @see #getTbody()
	 * @generated
	 */
	EAttribute getTbody_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tbody#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tbody#getLang()
	 * @see #getTbody()
	 * @generated
	 */
	EAttribute getTbody_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tbody#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tbody#getStyle()
	 * @see #getTbody()
	 * @generated
	 */
	EAttribute getTbody_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tbody#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tbody#getValign()
	 * @see #getTbody()
	 * @generated
	 */
	EAttribute getTbody_Valign();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Td <em>Td</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Td</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Td
	 * @generated
	 */
	EClass getTd();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Td#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Td#getAlign()
	 * @see #getTd()
	 * @generated
	 */
	EAttribute getTd_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Td#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Td#getChar()
	 * @see #getTd()
	 * @generated
	 */
	EAttribute getTd_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Td#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Td#getCharoff()
	 * @see #getTd()
	 * @generated
	 */
	EAttribute getTd_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Td#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Td#getClass_()
	 * @see #getTd()
	 * @generated
	 */
	EAttribute getTd_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Td#getColspan <em>Colspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colspan</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Td#getColspan()
	 * @see #getTd()
	 * @generated
	 */
	EAttribute getTd_Colspan();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Td#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Td#getLang()
	 * @see #getTd()
	 * @generated
	 */
	EAttribute getTd_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Td#getRowspan <em>Rowspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowspan</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Td#getRowspan()
	 * @see #getTd()
	 * @generated
	 */
	EAttribute getTd_Rowspan();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Td#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Td#getStyle()
	 * @see #getTd()
	 * @generated
	 */
	EAttribute getTd_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Td#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Td#getValign()
	 * @see #getTd()
	 * @generated
	 */
	EAttribute getTd_Valign();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot <em>Tfoot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tfoot</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot
	 * @generated
	 */
	EClass getTfoot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot#getTr()
	 * @see #getTfoot()
	 * @generated
	 */
	EReference getTfoot_Tr();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot#getAlign()
	 * @see #getTfoot()
	 * @generated
	 */
	EAttribute getTfoot_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot#getChar()
	 * @see #getTfoot()
	 * @generated
	 */
	EAttribute getTfoot_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot#getCharoff()
	 * @see #getTfoot()
	 * @generated
	 */
	EAttribute getTfoot_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot#getClass_()
	 * @see #getTfoot()
	 * @generated
	 */
	EAttribute getTfoot_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot#getLang()
	 * @see #getTfoot()
	 * @generated
	 */
	EAttribute getTfoot_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot#getStyle()
	 * @see #getTfoot()
	 * @generated
	 */
	EAttribute getTfoot_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tfoot#getValign()
	 * @see #getTfoot()
	 * @generated
	 */
	EAttribute getTfoot_Valign();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Th <em>Th</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Th</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Th
	 * @generated
	 */
	EClass getTh();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Th#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Th#getAlign()
	 * @see #getTh()
	 * @generated
	 */
	EAttribute getTh_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Th#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Th#getChar()
	 * @see #getTh()
	 * @generated
	 */
	EAttribute getTh_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Th#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Th#getCharoff()
	 * @see #getTh()
	 * @generated
	 */
	EAttribute getTh_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Th#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Th#getClass_()
	 * @see #getTh()
	 * @generated
	 */
	EAttribute getTh_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Th#getColspan <em>Colspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colspan</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Th#getColspan()
	 * @see #getTh()
	 * @generated
	 */
	EAttribute getTh_Colspan();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Th#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Th#getLang()
	 * @see #getTh()
	 * @generated
	 */
	EAttribute getTh_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Th#getRowspan <em>Rowspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowspan</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Th#getRowspan()
	 * @see #getTh()
	 * @generated
	 */
	EAttribute getTh_Rowspan();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Th#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Th#getStyle()
	 * @see #getTh()
	 * @generated
	 */
	EAttribute getTh_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Th#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Th#getValign()
	 * @see #getTh()
	 * @generated
	 */
	EAttribute getTh_Valign();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Thead <em>Thead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thead</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Thead
	 * @generated
	 */
	EClass getThead();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Thead#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Thead#getTr()
	 * @see #getThead()
	 * @generated
	 */
	EReference getThead_Tr();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Thead#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Thead#getAlign()
	 * @see #getThead()
	 * @generated
	 */
	EAttribute getThead_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Thead#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Thead#getChar()
	 * @see #getThead()
	 * @generated
	 */
	EAttribute getThead_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Thead#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Thead#getCharoff()
	 * @see #getThead()
	 * @generated
	 */
	EAttribute getThead_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Thead#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Thead#getClass_()
	 * @see #getThead()
	 * @generated
	 */
	EAttribute getThead_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Thead#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Thead#getLang()
	 * @see #getThead()
	 * @generated
	 */
	EAttribute getThead_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Thead#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Thead#getStyle()
	 * @see #getThead()
	 * @generated
	 */
	EAttribute getThead_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Thead#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Thead#getValign()
	 * @see #getThead()
	 * @generated
	 */
	EAttribute getThead_Valign();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tr</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tr
	 * @generated
	 */
	EClass getTr();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getGroup()
	 * @see #getTr()
	 * @generated
	 */
	EAttribute getTr_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getTh <em>Th</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Th</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getTh()
	 * @see #getTr()
	 * @generated
	 */
	EReference getTr_Th();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getTd <em>Td</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Td</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getTd()
	 * @see #getTr()
	 * @generated
	 */
	EReference getTr_Td();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getAlign()
	 * @see #getTr()
	 * @generated
	 */
	EAttribute getTr_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getChar()
	 * @see #getTr()
	 * @generated
	 */
	EAttribute getTr_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getCharoff()
	 * @see #getTr()
	 * @generated
	 */
	EAttribute getTr_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getClass_()
	 * @see #getTr()
	 * @generated
	 */
	EAttribute getTr_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getLang()
	 * @see #getTr()
	 * @generated
	 */
	EAttribute getTr_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getStyle()
	 * @see #getTr()
	 * @generated
	 */
	EAttribute getTr_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tr#getValign()
	 * @see #getTr()
	 * @generated
	 */
	EAttribute getTr_Valign();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tt</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tt
	 * @generated
	 */
	EClass getTt();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tt#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tt#getClass_()
	 * @see #getTt()
	 * @generated
	 */
	EAttribute getTt_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tt#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tt#getLang()
	 * @see #getTt()
	 * @generated
	 */
	EAttribute getTt_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Tt#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Tt#getStyle()
	 * @see #getTt()
	 * @generated
	 */
	EAttribute getTt_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Ul <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ul</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Ul
	 * @generated
	 */
	EClass getUl();

	/**
	 * Returns the meta object for the attribute list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Ul#getLi <em>Li</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Li</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Ul#getLi()
	 * @see #getUl()
	 * @generated
	 */
	EAttribute getUl_Li();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Ul#getLi1 <em>Li1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Li1</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Ul#getLi1()
	 * @see #getUl()
	 * @generated
	 */
	EReference getUl_Li1();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Ul#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Ul#getClass_()
	 * @see #getUl()
	 * @generated
	 */
	EAttribute getUl_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Ul#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Ul#getLang()
	 * @see #getUl()
	 * @generated
	 */
	EAttribute getUl_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Ul#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Ul#getStyle()
	 * @see #getUl()
	 * @generated
	 */
	EAttribute getUl_Style();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Var
	 * @generated
	 */
	EClass getVar();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Var#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Var#getClass_()
	 * @see #getVar()
	 * @generated
	 */
	EAttribute getVar_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Var#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Var#getLang()
	 * @see #getVar()
	 * @generated
	 */
	EAttribute getVar_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Var#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Var#getStyle()
	 * @see #getVar()
	 * @generated
	 */
	EAttribute getVar_Style();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AlignType <em>Align Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Align Type</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AlignType
	 * @generated
	 */
	EEnum getAlignType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.emf.w3c.xhtml.ImageKind <em>Image Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Image Kind</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ImageKind
	 * @generated
	 */
	EEnum getImageKind();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.emf.w3c.xhtml.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Type</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.MediaType
	 * @generated
	 */
	EEnum getMediaType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType <em>Mif Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mif Class Type</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType
	 * @generated
	 */
	EEnum getMifClassType();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.emf.w3c.xhtml.ObjectName <em>Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Name</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ObjectName
	 * @generated
	 */
	EEnum getObjectName();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.emf.w3c.xhtml.ParamName <em>Param Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Param Name</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ParamName
	 * @generated
	 */
	EEnum getParamName();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shape</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Shape
	 * @generated
	 */
	EEnum getShape();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet <em>Style Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Style Sheet</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet
	 * @generated
	 */
	EEnum getStyleSheet();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.emf.w3c.xhtml.TFrame <em>TFrame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TFrame</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.TFrame
	 * @generated
	 */
	EEnum getTFrame();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.emf.w3c.xhtml.TRules <em>TRules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TRules</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.TRules
	 * @generated
	 */
	EEnum getTRules();

	/**
	 * Returns the meta object for enum '{@link org.openhealthtools.mdht.emf.w3c.xhtml.ValignType <em>Valign Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Valign Type</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ValignType
	 * @generated
	 */
	EEnum getValignType();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AlignType <em>Align Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Align Type Object</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AlignType
	 * @model instanceClass="org.openhealthtools.mdht.emf.w3c.xhtml.AlignType"
	 *        extendedMetaData="name='align_._type:Object' baseType='align_._type'"
	 * @generated
	 */
	EDataType getAlignTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Character</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Character' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='1'"
	 * @generated
	 */
	EDataType getCharacter();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Content Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='ContentType' memberTypes='MediaType http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getContentType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Coords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Coords</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Coords' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='500' pattern='[\\-\\+]?(\\d+|\\d+(\\.\\d+)?%25)(,\\s*[\\-\\+]?(\\d+|\\d+(\\.\\d+)?%25))*'"
	 * @generated
	 */
	EDataType getCoords();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.emf.w3c.xhtml.ImageKind <em>Image Kind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image Kind Object</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ImageKind
	 * @model instanceClass="org.openhealthtools.mdht.emf.w3c.xhtml.ImageKind"
	 *        extendedMetaData="name='ImageKind:Object' baseType='ImageKind'"
	 * @generated
	 */
	EDataType getImageKindObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Length</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Length' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='10' pattern='[\\-\\+]?(\\d+|\\d+(\\.\\d+)?%25)'"
	 * @generated
	 */
	EDataType getLength();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.emf.w3c.xhtml.MediaType <em>Media Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Media Type Object</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.MediaType
	 * @model instanceClass="org.openhealthtools.mdht.emf.w3c.xhtml.MediaType"
	 *        extendedMetaData="name='MediaType:Object' baseType='MediaType'"
	 * @generated
	 */
	EDataType getMediaTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType <em>Mif Class Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mif Class Type Object</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType
	 * @model instanceClass="org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType"
	 *        extendedMetaData="name='MifClassType:Object' baseType='MifClassType'"
	 * @generated
	 */
	EDataType getMifClassTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Multi Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Multi Length</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MultiLength' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='500' pattern='[\\-\\+]?(\\d+|\\d+(\\.\\d+)?%25)|[1-9]?(\\d+)?\\*'"
	 * @generated
	 */
	EDataType getMultiLength();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Number' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger' maxExclusive='100' pattern='[0-9]+'"
	 * @generated
	 */
	EDataType getNumber();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.emf.w3c.xhtml.ObjectName <em>Object Name Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object Name Object</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ObjectName
	 * @model instanceClass="org.openhealthtools.mdht.emf.w3c.xhtml.ObjectName"
	 *        extendedMetaData="name='ObjectName:Object' baseType='ObjectName'"
	 * @generated
	 */
	EDataType getObjectNameObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.emf.w3c.xhtml.ParamName <em>Param Name Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Param Name Object</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ParamName
	 * @model instanceClass="org.openhealthtools.mdht.emf.w3c.xhtml.ParamName"
	 *        extendedMetaData="name='ParamName:Object' baseType='ParamName'"
	 * @generated
	 */
	EDataType getParamNameObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Param Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Param Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ParamValue' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getParamValue();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Pixels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pixels</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Pixels' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger' maxExclusive='10000'"
	 * @generated
	 */
	EDataType getPixels();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Shape <em>Shape Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Shape Object</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Shape
	 * @model instanceClass="org.openhealthtools.mdht.emf.w3c.xhtml.Shape"
	 *        extendedMetaData="name='Shape:Object' baseType='Shape'"
	 * @generated
	 */
	EDataType getShapeObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet <em>Style Sheet Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Style Sheet Object</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet
	 * @model instanceClass="org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet"
	 *        extendedMetaData="name='StyleSheet:Object' baseType='StyleSheet'"
	 * @generated
	 */
	EDataType getStyleSheetObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Text' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='2' maxLength='255'"
	 * @generated
	 */
	EDataType getText();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.emf.w3c.xhtml.TFrame <em>TFrame Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TFrame Object</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.TFrame
	 * @model instanceClass="org.openhealthtools.mdht.emf.w3c.xhtml.TFrame"
	 *        extendedMetaData="name='TFrame:Object' baseType='TFrame'"
	 * @generated
	 */
	EDataType getTFrameObject();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.emf.w3c.xhtml.TRules <em>TRules Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TRules Object</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.TRules
	 * @model instanceClass="org.openhealthtools.mdht.emf.w3c.xhtml.TRules"
	 *        extendedMetaData="name='TRules:Object' baseType='TRules'"
	 * @generated
	 */
	EDataType getTRulesObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='URI' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI' minLength='5' maxLength='255'"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the meta object for data type '{@link org.openhealthtools.mdht.emf.w3c.xhtml.ValignType <em>Valign Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Valign Type Object</em>'.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ValignType
	 * @model instanceClass="org.openhealthtools.mdht.emf.w3c.xhtml.ValignType"
	 *        extendedMetaData="name='valign_._type:Object' baseType='valign_._type'"
	 * @generated
	 */
	EDataType getValignTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XhtmlFactory getXhtmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AImpl <em>A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getA()
		 * @generated
		 */
		EClass A = eINSTANCE.getA();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__CLASS = eINSTANCE.getA_Class();

		/**
		 * The meta object literal for the '<em><b>Coords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__COORDS = eINSTANCE.getA_Coords();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__HREF = eINSTANCE.getA_Href();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__LANG = eINSTANCE.getA_Lang();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__NAME = eINSTANCE.getA_Name();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__SHAPE = eINSTANCE.getA_Shape();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__STYLE = eINSTANCE.getA_Style();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A__TYPE = eINSTANCE.getA_Type();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AbbrImpl <em>Abbr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AbbrImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getAbbr()
		 * @generated
		 */
		EClass ABBR = eINSTANCE.getAbbr();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABBR__CLASS = eINSTANCE.getAbbr_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABBR__LANG = eINSTANCE.getAbbr_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABBR__STYLE = eINSTANCE.getAbbr_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl <em>AContent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AContentImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getAContent()
		 * @generated
		 */
		EClass ACONTENT = eINSTANCE.getAContent();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACONTENT__MIXED = eINSTANCE.getAContent_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACONTENT__GROUP = eINSTANCE.getAContent_Group();

		/**
		 * The meta object literal for the '<em><b>Br</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__BR = eINSTANCE.getAContent_Br();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__SPAN = eINSTANCE.getAContent_Span();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__OBJECT = eINSTANCE.getAContent_Object();

		/**
		 * The meta object literal for the '<em><b>Img</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__IMG = eINSTANCE.getAContent_Img();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__TT = eINSTANCE.getAContent_Tt();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__I = eINSTANCE.getAContent_I();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__B = eINSTANCE.getAContent_B();

		/**
		 * The meta object literal for the '<em><b>Big</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__BIG = eINSTANCE.getAContent_Big();

		/**
		 * The meta object literal for the '<em><b>Small</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__SMALL = eINSTANCE.getAContent_Small();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__EM = eINSTANCE.getAContent_Em();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__STRONG = eINSTANCE.getAContent_Strong();

		/**
		 * The meta object literal for the '<em><b>Dfn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__DFN = eINSTANCE.getAContent_Dfn();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__CODE = eINSTANCE.getAContent_Code();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__Q = eINSTANCE.getAContent_Q();

		/**
		 * The meta object literal for the '<em><b>Samp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__SAMP = eINSTANCE.getAContent_Samp();

		/**
		 * The meta object literal for the '<em><b>Kbd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__KBD = eINSTANCE.getAContent_Kbd();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__VAR = eINSTANCE.getAContent_Var();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__CITE = eINSTANCE.getAContent_Cite();

		/**
		 * The meta object literal for the '<em><b>Abbr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__ABBR = eINSTANCE.getAContent_Abbr();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__ACRONYM = eINSTANCE.getAContent_Acronym();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__SUB = eINSTANCE.getAContent_Sub();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__SUP = eINSTANCE.getAContent_Sup();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AcronymImpl <em>Acronym</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.AcronymImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getAcronym()
		 * @generated
		 */
		EClass ACRONYM = eINSTANCE.getAcronym();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACRONYM__CLASS = eINSTANCE.getAcronym_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACRONYM__LANG = eINSTANCE.getAcronym_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACRONYM__STYLE = eINSTANCE.getAcronym_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BImpl <em>B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getB()
		 * @generated
		 */
		EClass B = eINSTANCE.getB();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B__CLASS = eINSTANCE.getB_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B__LANG = eINSTANCE.getB_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B__STYLE = eINSTANCE.getB_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BigImpl <em>Big</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BigImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getBig()
		 * @generated
		 */
		EClass BIG = eINSTANCE.getBig();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG__CLASS = eINSTANCE.getBig_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG__LANG = eINSTANCE.getBig_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG__STYLE = eINSTANCE.getBig_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__MIXED = eINSTANCE.getBlock_Mixed();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__BLOCK = eINSTANCE.getBlock_Block();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__P = eINSTANCE.getBlock_P();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__DIV = eINSTANCE.getBlock_Div();

		/**
		 * The meta object literal for the '<em><b>Ul</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__UL = eINSTANCE.getBlock_Ul();

		/**
		 * The meta object literal for the '<em><b>Ol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__OL = eINSTANCE.getBlock_Ol();

		/**
		 * The meta object literal for the '<em><b>Dl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__DL = eINSTANCE.getBlock_Dl();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__PRE = eINSTANCE.getBlock_Pre();

		/**
		 * The meta object literal for the '<em><b>Hr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__HR = eINSTANCE.getBlock_Hr();

		/**
		 * The meta object literal for the '<em><b>Blockquote</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__BLOCKQUOTE = eINSTANCE.getBlock_Blockquote();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__TABLE = eINSTANCE.getBlock_Table();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockquoteImpl <em>Blockquote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BlockquoteImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getBlockquote()
		 * @generated
		 */
		EClass BLOCKQUOTE = eINSTANCE.getBlockquote();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKQUOTE__CITE = eINSTANCE.getBlockquote_Cite();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKQUOTE__CLASS = eINSTANCE.getBlockquote_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKQUOTE__LANG = eINSTANCE.getBlockquote_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKQUOTE__STYLE = eINSTANCE.getBlockquote_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BrImpl <em>Br</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.BrImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getBr()
		 * @generated
		 */
		EClass BR = eINSTANCE.getBr();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BR__CLASS = eINSTANCE.getBr_Class();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BR__STYLE = eINSTANCE.getBr_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.CaptionImpl <em>Caption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.CaptionImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getCaption()
		 * @generated
		 */
		EClass CAPTION = eINSTANCE.getCaption();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPTION__CLASS = eINSTANCE.getCaption_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPTION__LANG = eINSTANCE.getCaption_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPTION__STYLE = eINSTANCE.getCaption_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.CiteImpl <em>Cite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.CiteImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getCite()
		 * @generated
		 */
		EClass CITE = eINSTANCE.getCite();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITE__CLASS = eINSTANCE.getCite_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITE__LANG = eINSTANCE.getCite_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITE__STYLE = eINSTANCE.getCite_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.CodeImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE__CLASS = eINSTANCE.getCode_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE__LANG = eINSTANCE.getCode_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE__STYLE = eINSTANCE.getCode_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ColImpl <em>Col</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ColImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getCol()
		 * @generated
		 */
		EClass COL = eINSTANCE.getCol();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL__ALIGN = eINSTANCE.getCol_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL__CHAR = eINSTANCE.getCol_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL__CHAROFF = eINSTANCE.getCol_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL__CLASS = eINSTANCE.getCol_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL__LANG = eINSTANCE.getCol_Lang();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL__SPAN = eINSTANCE.getCol_Span();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL__STYLE = eINSTANCE.getCol_Style();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL__VALIGN = eINSTANCE.getCol_Valign();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL__WIDTH = eINSTANCE.getCol_Width();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ColgroupImpl <em>Colgroup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ColgroupImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getColgroup()
		 * @generated
		 */
		EClass COLGROUP = eINSTANCE.getColgroup();

		/**
		 * The meta object literal for the '<em><b>Col</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLGROUP__COL = eINSTANCE.getColgroup_Col();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP__ALIGN = eINSTANCE.getColgroup_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP__CHAR = eINSTANCE.getColgroup_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP__CHAROFF = eINSTANCE.getColgroup_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP__CLASS = eINSTANCE.getColgroup_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP__LANG = eINSTANCE.getColgroup_Lang();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP__SPAN = eINSTANCE.getColgroup_Span();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP__STYLE = eINSTANCE.getColgroup_Style();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP__VALIGN = eINSTANCE.getColgroup_Valign();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP__WIDTH = eINSTANCE.getColgroup_Width();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DdImpl <em>Dd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DdImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getDd()
		 * @generated
		 */
		EClass DD = eINSTANCE.getDd();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DD__CLASS = eINSTANCE.getDd_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DD__LANG = eINSTANCE.getDd_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DD__STYLE = eINSTANCE.getDd_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DelImpl <em>Del</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DelImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getDel()
		 * @generated
		 */
		EClass DEL = eINSTANCE.getDel();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DfnImpl <em>Dfn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DfnImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getDfn()
		 * @generated
		 */
		EClass DFN = eINSTANCE.getDfn();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFN__CLASS = eINSTANCE.getDfn_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFN__LANG = eINSTANCE.getDfn_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFN__STYLE = eINSTANCE.getDfn_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DivImpl <em>Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DivImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getDiv()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getDiv();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV__CLASS = eINSTANCE.getDiv_Class();

		/**
		 * The meta object literal for the '<em><b>Hl7 Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV__HL7_ID = eINSTANCE.getDiv_Hl7Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV__LANG = eINSTANCE.getDiv_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV__STYLE = eINSTANCE.getDiv_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV__TITLE = eINSTANCE.getDiv_Title();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DlImpl <em>Dl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DlImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getDl()
		 * @generated
		 */
		EClass DL = eINSTANCE.getDl();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DL__GROUP = eINSTANCE.getDl_Group();

		/**
		 * The meta object literal for the '<em><b>Dt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DL__DT = eINSTANCE.getDl_Dt();

		/**
		 * The meta object literal for the '<em><b>Dd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DL__DD = eINSTANCE.getDl_Dd();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DL__CLASS = eINSTANCE.getDl_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DL__LANG = eINSTANCE.getDl_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DL__STYLE = eINSTANCE.getDl_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DtImpl <em>Dt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.DtImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getDt()
		 * @generated
		 */
		EClass DT = eINSTANCE.getDt();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DT__CLASS = eINSTANCE.getDt_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DT__LANG = eINSTANCE.getDt_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DT__STYLE = eINSTANCE.getDt_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.EmImpl <em>Em</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.EmImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getEm()
		 * @generated
		 */
		EClass EM = eINSTANCE.getEm();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM__CLASS = eINSTANCE.getEm_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM__LANG = eINSTANCE.getEm_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM__STYLE = eINSTANCE.getEm_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.FlowImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__MIXED = eINSTANCE.getFlow_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__GROUP = eINSTANCE.getFlow_Group();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__P = eINSTANCE.getFlow_P();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__DIV = eINSTANCE.getFlow_Div();

		/**
		 * The meta object literal for the '<em><b>Ul</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__UL = eINSTANCE.getFlow_Ul();

		/**
		 * The meta object literal for the '<em><b>Ol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__OL = eINSTANCE.getFlow_Ol();

		/**
		 * The meta object literal for the '<em><b>Dl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__DL = eINSTANCE.getFlow_Dl();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__PRE = eINSTANCE.getFlow_Pre();

		/**
		 * The meta object literal for the '<em><b>Hr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__HR = eINSTANCE.getFlow_Hr();

		/**
		 * The meta object literal for the '<em><b>Blockquote</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__BLOCKQUOTE = eINSTANCE.getFlow_Blockquote();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__TABLE = eINSTANCE.getFlow_Table();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__A = eINSTANCE.getFlow_A();

		/**
		 * The meta object literal for the '<em><b>Br</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__BR = eINSTANCE.getFlow_Br();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SPAN = eINSTANCE.getFlow_Span();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__OBJECT = eINSTANCE.getFlow_Object();

		/**
		 * The meta object literal for the '<em><b>Img</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__IMG = eINSTANCE.getFlow_Img();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__TT = eINSTANCE.getFlow_Tt();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__I = eINSTANCE.getFlow_I();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__B = eINSTANCE.getFlow_B();

		/**
		 * The meta object literal for the '<em><b>Big</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__BIG = eINSTANCE.getFlow_Big();

		/**
		 * The meta object literal for the '<em><b>Small</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SMALL = eINSTANCE.getFlow_Small();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__EM = eINSTANCE.getFlow_Em();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__STRONG = eINSTANCE.getFlow_Strong();

		/**
		 * The meta object literal for the '<em><b>Dfn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__DFN = eINSTANCE.getFlow_Dfn();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__CODE = eINSTANCE.getFlow_Code();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__Q = eINSTANCE.getFlow_Q();

		/**
		 * The meta object literal for the '<em><b>Samp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SAMP = eINSTANCE.getFlow_Samp();

		/**
		 * The meta object literal for the '<em><b>Kbd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__KBD = eINSTANCE.getFlow_Kbd();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__VAR = eINSTANCE.getFlow_Var();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__CITE = eINSTANCE.getFlow_Cite();

		/**
		 * The meta object literal for the '<em><b>Abbr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__ABBR = eINSTANCE.getFlow_Abbr();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__ACRONYM = eINSTANCE.getFlow_Acronym();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SUB = eINSTANCE.getFlow_Sub();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SUP = eINSTANCE.getFlow_Sup();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.HrImpl <em>Hr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.HrImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getHr()
		 * @generated
		 */
		EClass HR = eINSTANCE.getHr();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HR__CLASS = eINSTANCE.getHr_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HR__LANG = eINSTANCE.getHr_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HR__STYLE = eINSTANCE.getHr_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.IImpl <em>I</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.IImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getI()
		 * @generated
		 */
		EClass I = eINSTANCE.getI();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I__CLASS = eINSTANCE.getI_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I__LANG = eINSTANCE.getI_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I__STYLE = eINSTANCE.getI_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ImgImpl <em>Img</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ImgImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getImg()
		 * @generated
		 */
		EClass IMG = eINSTANCE.getImg();

		/**
		 * The meta object literal for the '<em><b>Thumbnail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMG__THUMBNAIL = eINSTANCE.getImg_Thumbnail();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__ALT = eINSTANCE.getImg_Alt();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__CLASS = eINSTANCE.getImg_Class();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__HEIGHT = eINSTANCE.getImg_Height();

		/**
		 * The meta object literal for the '<em><b>Hl7 Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__HL7_ID = eINSTANCE.getImg_Hl7Id();

		/**
		 * The meta object literal for the '<em><b>Image Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__IMAGE_TYPE = eINSTANCE.getImg_ImageType();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__LANG = eINSTANCE.getImg_Lang();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__SRC = eINSTANCE.getImg_Src();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__STYLE = eINSTANCE.getImg_Style();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG__WIDTH = eINSTANCE.getImg_Width();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl <em>Inline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InlineImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getInline()
		 * @generated
		 */
		EClass INLINE = eINSTANCE.getInline();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE__MIXED = eINSTANCE.getInline_Mixed();

		/**
		 * The meta object literal for the '<em><b>Inline</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE__INLINE = eINSTANCE.getInline_Inline();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__A = eINSTANCE.getInline_A();

		/**
		 * The meta object literal for the '<em><b>Br</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__BR = eINSTANCE.getInline_Br();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__SPAN = eINSTANCE.getInline_Span();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__OBJECT = eINSTANCE.getInline_Object();

		/**
		 * The meta object literal for the '<em><b>Img</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__IMG = eINSTANCE.getInline_Img();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__TT = eINSTANCE.getInline_Tt();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__I = eINSTANCE.getInline_I();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__B = eINSTANCE.getInline_B();

		/**
		 * The meta object literal for the '<em><b>Big</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__BIG = eINSTANCE.getInline_Big();

		/**
		 * The meta object literal for the '<em><b>Small</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__SMALL = eINSTANCE.getInline_Small();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__EM = eINSTANCE.getInline_Em();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__STRONG = eINSTANCE.getInline_Strong();

		/**
		 * The meta object literal for the '<em><b>Dfn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__DFN = eINSTANCE.getInline_Dfn();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__CODE = eINSTANCE.getInline_Code();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__Q = eINSTANCE.getInline_Q();

		/**
		 * The meta object literal for the '<em><b>Samp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__SAMP = eINSTANCE.getInline_Samp();

		/**
		 * The meta object literal for the '<em><b>Kbd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__KBD = eINSTANCE.getInline_Kbd();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__VAR = eINSTANCE.getInline_Var();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__CITE = eINSTANCE.getInline_Cite();

		/**
		 * The meta object literal for the '<em><b>Abbr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__ABBR = eINSTANCE.getInline_Abbr();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__ACRONYM = eINSTANCE.getInline_Acronym();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__SUB = eINSTANCE.getInline_Sub();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__SUP = eINSTANCE.getInline_Sup();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InsImpl <em>Ins</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.InsImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getIns()
		 * @generated
		 */
		EClass INS = eINSTANCE.getIns();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.KbdImpl <em>Kbd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.KbdImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getKbd()
		 * @generated
		 */
		EClass KBD = eINSTANCE.getKbd();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KBD__CLASS = eINSTANCE.getKbd_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KBD__LANG = eINSTANCE.getKbd_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KBD__STYLE = eINSTANCE.getKbd_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.LiImpl <em>Li</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.LiImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getLi()
		 * @generated
		 */
		EClass LI = eINSTANCE.getLi();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LI__CLASS = eINSTANCE.getLi_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LI__LANG = eINSTANCE.getLi_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LI__STYLE = eINSTANCE.getLi_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ObjectImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__MIXED = eINSTANCE.getObject_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__GROUP = eINSTANCE.getObject_Group();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__PARAM = eINSTANCE.getObject_Param();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__P = eINSTANCE.getObject_P();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__DIV = eINSTANCE.getObject_Div();

		/**
		 * The meta object literal for the '<em><b>Ul</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__UL = eINSTANCE.getObject_Ul();

		/**
		 * The meta object literal for the '<em><b>Ol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__OL = eINSTANCE.getObject_Ol();

		/**
		 * The meta object literal for the '<em><b>Dl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__DL = eINSTANCE.getObject_Dl();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__PRE = eINSTANCE.getObject_Pre();

		/**
		 * The meta object literal for the '<em><b>Hr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__HR = eINSTANCE.getObject_Hr();

		/**
		 * The meta object literal for the '<em><b>Blockquote</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__BLOCKQUOTE = eINSTANCE.getObject_Blockquote();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__TABLE = eINSTANCE.getObject_Table();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__A = eINSTANCE.getObject_A();

		/**
		 * The meta object literal for the '<em><b>Br</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__BR = eINSTANCE.getObject_Br();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__SPAN = eINSTANCE.getObject_Span();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__OBJECT = eINSTANCE.getObject_Object();

		/**
		 * The meta object literal for the '<em><b>Img</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__IMG = eINSTANCE.getObject_Img();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__TT = eINSTANCE.getObject_Tt();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__I = eINSTANCE.getObject_I();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__B = eINSTANCE.getObject_B();

		/**
		 * The meta object literal for the '<em><b>Big</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__BIG = eINSTANCE.getObject_Big();

		/**
		 * The meta object literal for the '<em><b>Small</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__SMALL = eINSTANCE.getObject_Small();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__EM = eINSTANCE.getObject_Em();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__STRONG = eINSTANCE.getObject_Strong();

		/**
		 * The meta object literal for the '<em><b>Dfn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__DFN = eINSTANCE.getObject_Dfn();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__CODE = eINSTANCE.getObject_Code();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__Q = eINSTANCE.getObject_Q();

		/**
		 * The meta object literal for the '<em><b>Samp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__SAMP = eINSTANCE.getObject_Samp();

		/**
		 * The meta object literal for the '<em><b>Kbd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__KBD = eINSTANCE.getObject_Kbd();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__VAR = eINSTANCE.getObject_Var();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__CITE = eINSTANCE.getObject_Cite();

		/**
		 * The meta object literal for the '<em><b>Abbr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__ABBR = eINSTANCE.getObject_Abbr();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__ACRONYM = eINSTANCE.getObject_Acronym();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__SUB = eINSTANCE.getObject_Sub();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__SUP = eINSTANCE.getObject_Sup();

		/**
		 * The meta object literal for the '<em><b>Hl7 Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__HL7_ID = eINSTANCE.getObject_Hl7Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__NAME = eINSTANCE.getObject_Name();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.OlImpl <em>Ol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.OlImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getOl()
		 * @generated
		 */
		EClass OL = eINSTANCE.getOl();

		/**
		 * The meta object literal for the '<em><b>Li</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OL__LI = eINSTANCE.getOl_Li();

		/**
		 * The meta object literal for the '<em><b>Li1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OL__LI1 = eINSTANCE.getOl_Li1();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OL__CLASS = eINSTANCE.getOl_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OL__LANG = eINSTANCE.getOl_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OL__STYLE = eINSTANCE.getOl_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PImpl <em>P</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getP()
		 * @generated
		 */
		EClass P = eINSTANCE.getP();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute P__CLASS = eINSTANCE.getP_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute P__LANG = eINSTANCE.getP_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute P__STYLE = eINSTANCE.getP_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ParamImpl <em>Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ParamImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getParam()
		 * @generated
		 */
		EClass PARAM = eINSTANCE.getParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__VALUE = eINSTANCE.getParam_Value();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreImpl <em>Pre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getPre()
		 * @generated
		 */
		EClass PRE = eINSTANCE.getPre();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE__CLASS = eINSTANCE.getPre_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE__LANG = eINSTANCE.getPre_Lang();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE__SPACE = eINSTANCE.getPre_Space();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE__STYLE = eINSTANCE.getPre_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl <em>Pre Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.PreContentImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getPreContent()
		 * @generated
		 */
		EClass PRE_CONTENT = eINSTANCE.getPreContent();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_CONTENT__MIXED = eINSTANCE.getPreContent_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_CONTENT__GROUP = eINSTANCE.getPreContent_Group();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__A = eINSTANCE.getPreContent_A();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__TT = eINSTANCE.getPreContent_Tt();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__I = eINSTANCE.getPreContent_I();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__B = eINSTANCE.getPreContent_B();

		/**
		 * The meta object literal for the '<em><b>Big</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__BIG = eINSTANCE.getPreContent_Big();

		/**
		 * The meta object literal for the '<em><b>Small</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__SMALL = eINSTANCE.getPreContent_Small();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__EM = eINSTANCE.getPreContent_Em();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__STRONG = eINSTANCE.getPreContent_Strong();

		/**
		 * The meta object literal for the '<em><b>Dfn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__DFN = eINSTANCE.getPreContent_Dfn();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__CODE = eINSTANCE.getPreContent_Code();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__Q = eINSTANCE.getPreContent_Q();

		/**
		 * The meta object literal for the '<em><b>Samp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__SAMP = eINSTANCE.getPreContent_Samp();

		/**
		 * The meta object literal for the '<em><b>Kbd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__KBD = eINSTANCE.getPreContent_Kbd();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__VAR = eINSTANCE.getPreContent_Var();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__CITE = eINSTANCE.getPreContent_Cite();

		/**
		 * The meta object literal for the '<em><b>Abbr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__ABBR = eINSTANCE.getPreContent_Abbr();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__ACRONYM = eINSTANCE.getPreContent_Acronym();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__SUB = eINSTANCE.getPreContent_Sub();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__SUP = eINSTANCE.getPreContent_Sup();

		/**
		 * The meta object literal for the '<em><b>Br</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__BR = eINSTANCE.getPreContent_Br();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__SPAN = eINSTANCE.getPreContent_Span();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.QImpl <em>Q</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.QImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getQ()
		 * @generated
		 */
		EClass Q = eINSTANCE.getQ();

		/**
		 * The meta object literal for the '<em><b>Cite1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute Q__CITE1 = eINSTANCE.getQ_Cite1();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute Q__CLASS = eINSTANCE.getQ_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute Q__LANG = eINSTANCE.getQ_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute Q__STYLE = eINSTANCE.getQ_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SampImpl <em>Samp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SampImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getSamp()
		 * @generated
		 */
		EClass SAMP = eINSTANCE.getSamp();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMP__CLASS = eINSTANCE.getSamp_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMP__LANG = eINSTANCE.getSamp_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMP__STYLE = eINSTANCE.getSamp_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SmallImpl <em>Small</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SmallImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getSmall()
		 * @generated
		 */
		EClass SMALL = eINSTANCE.getSmall();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL__CLASS = eINSTANCE.getSmall_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL__LANG = eINSTANCE.getSmall_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL__STYLE = eINSTANCE.getSmall_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SpanImpl <em>Span</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SpanImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getSpan()
		 * @generated
		 */
		EClass SPAN = eINSTANCE.getSpan();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN__CLASS = eINSTANCE.getSpan_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN__LANG = eINSTANCE.getSpan_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN__STYLE = eINSTANCE.getSpan_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.StrongImpl <em>Strong</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.StrongImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getStrong()
		 * @generated
		 */
		EClass STRONG = eINSTANCE.getStrong();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRONG__CLASS = eINSTANCE.getStrong_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRONG__LANG = eINSTANCE.getStrong_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRONG__STYLE = eINSTANCE.getStrong_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SubImpl <em>Sub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SubImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getSub()
		 * @generated
		 */
		EClass SUB = eINSTANCE.getSub();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB__CLASS = eINSTANCE.getSub_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB__LANG = eINSTANCE.getSub_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB__STYLE = eINSTANCE.getSub_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SupImpl <em>Sup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.SupImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getSup()
		 * @generated
		 */
		EClass SUP = eINSTANCE.getSup();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUP__CLASS = eINSTANCE.getSup_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUP__LANG = eINSTANCE.getSup_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUP__STYLE = eINSTANCE.getSup_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TableImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__CAPTION = eINSTANCE.getTable_Caption();

		/**
		 * The meta object literal for the '<em><b>Col</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COL = eINSTANCE.getTable_Col();

		/**
		 * The meta object literal for the '<em><b>Colgroup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLGROUP = eINSTANCE.getTable_Colgroup();

		/**
		 * The meta object literal for the '<em><b>Thead</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__THEAD = eINSTANCE.getTable_Thead();

		/**
		 * The meta object literal for the '<em><b>Tfoot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TFOOT = eINSTANCE.getTable_Tfoot();

		/**
		 * The meta object literal for the '<em><b>Tbody</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TBODY = eINSTANCE.getTable_Tbody();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TR = eINSTANCE.getTable_Tr();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__BORDER = eINSTANCE.getTable_Border();

		/**
		 * The meta object literal for the '<em><b>Cellpadding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__CELLPADDING = eINSTANCE.getTable_Cellpadding();

		/**
		 * The meta object literal for the '<em><b>Cellspacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__CELLSPACING = eINSTANCE.getTable_Cellspacing();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__CLASS = eINSTANCE.getTable_Class();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__FRAME = eINSTANCE.getTable_Frame();

		/**
		 * The meta object literal for the '<em><b>Hl7 Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__HL7_ID = eINSTANCE.getTable_Hl7Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__LANG = eINSTANCE.getTable_Lang();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__RULES = eINSTANCE.getTable_Rules();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__STYLE = eINSTANCE.getTable_Style();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__WIDTH = eINSTANCE.getTable_Width();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TbodyImpl <em>Tbody</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TbodyImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTbody()
		 * @generated
		 */
		EClass TBODY = eINSTANCE.getTbody();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBODY__TR = eINSTANCE.getTbody_Tr();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY__ALIGN = eINSTANCE.getTbody_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY__CHAR = eINSTANCE.getTbody_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY__CHAROFF = eINSTANCE.getTbody_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY__CLASS = eINSTANCE.getTbody_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY__LANG = eINSTANCE.getTbody_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY__STYLE = eINSTANCE.getTbody_Style();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY__VALIGN = eINSTANCE.getTbody_Valign();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TdImpl <em>Td</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TdImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTd()
		 * @generated
		 */
		EClass TD = eINSTANCE.getTd();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD__ALIGN = eINSTANCE.getTd_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD__CHAR = eINSTANCE.getTd_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD__CHAROFF = eINSTANCE.getTd_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD__CLASS = eINSTANCE.getTd_Class();

		/**
		 * The meta object literal for the '<em><b>Colspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD__COLSPAN = eINSTANCE.getTd_Colspan();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD__LANG = eINSTANCE.getTd_Lang();

		/**
		 * The meta object literal for the '<em><b>Rowspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD__ROWSPAN = eINSTANCE.getTd_Rowspan();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD__STYLE = eINSTANCE.getTd_Style();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD__VALIGN = eINSTANCE.getTd_Valign();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TfootImpl <em>Tfoot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TfootImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTfoot()
		 * @generated
		 */
		EClass TFOOT = eINSTANCE.getTfoot();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFOOT__TR = eINSTANCE.getTfoot_Tr();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT__ALIGN = eINSTANCE.getTfoot_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT__CHAR = eINSTANCE.getTfoot_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT__CHAROFF = eINSTANCE.getTfoot_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT__CLASS = eINSTANCE.getTfoot_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT__LANG = eINSTANCE.getTfoot_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT__STYLE = eINSTANCE.getTfoot_Style();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT__VALIGN = eINSTANCE.getTfoot_Valign();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ThImpl <em>Th</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.ThImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTh()
		 * @generated
		 */
		EClass TH = eINSTANCE.getTh();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH__ALIGN = eINSTANCE.getTh_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH__CHAR = eINSTANCE.getTh_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH__CHAROFF = eINSTANCE.getTh_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH__CLASS = eINSTANCE.getTh_Class();

		/**
		 * The meta object literal for the '<em><b>Colspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH__COLSPAN = eINSTANCE.getTh_Colspan();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH__LANG = eINSTANCE.getTh_Lang();

		/**
		 * The meta object literal for the '<em><b>Rowspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH__ROWSPAN = eINSTANCE.getTh_Rowspan();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH__STYLE = eINSTANCE.getTh_Style();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH__VALIGN = eINSTANCE.getTh_Valign();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TheadImpl <em>Thead</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TheadImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getThead()
		 * @generated
		 */
		EClass THEAD = eINSTANCE.getThead();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEAD__TR = eINSTANCE.getThead_Tr();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD__ALIGN = eINSTANCE.getThead_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD__CHAR = eINSTANCE.getThead_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD__CHAROFF = eINSTANCE.getThead_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD__CLASS = eINSTANCE.getThead_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD__LANG = eINSTANCE.getThead_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD__STYLE = eINSTANCE.getThead_Style();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD__VALIGN = eINSTANCE.getThead_Valign();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TrImpl <em>Tr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TrImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTr()
		 * @generated
		 */
		EClass TR = eINSTANCE.getTr();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR__GROUP = eINSTANCE.getTr_Group();

		/**
		 * The meta object literal for the '<em><b>Th</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TR__TH = eINSTANCE.getTr_Th();

		/**
		 * The meta object literal for the '<em><b>Td</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TR__TD = eINSTANCE.getTr_Td();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR__ALIGN = eINSTANCE.getTr_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR__CHAR = eINSTANCE.getTr_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR__CHAROFF = eINSTANCE.getTr_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR__CLASS = eINSTANCE.getTr_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR__LANG = eINSTANCE.getTr_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR__STYLE = eINSTANCE.getTr_Style();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR__VALIGN = eINSTANCE.getTr_Valign();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TtImpl <em>Tt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.TtImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTt()
		 * @generated
		 */
		EClass TT = eINSTANCE.getTt();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TT__CLASS = eINSTANCE.getTt_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TT__LANG = eINSTANCE.getTt_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TT__STYLE = eINSTANCE.getTt_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.UlImpl <em>Ul</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.UlImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getUl()
		 * @generated
		 */
		EClass UL = eINSTANCE.getUl();

		/**
		 * The meta object literal for the '<em><b>Li</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UL__LI = eINSTANCE.getUl_Li();

		/**
		 * The meta object literal for the '<em><b>Li1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UL__LI1 = eINSTANCE.getUl_Li1();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UL__CLASS = eINSTANCE.getUl_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UL__LANG = eINSTANCE.getUl_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UL__STYLE = eINSTANCE.getUl_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.VarImpl <em>Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.VarImpl
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getVar()
		 * @generated
		 */
		EClass VAR = eINSTANCE.getVar();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR__CLASS = eINSTANCE.getVar_Class();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR__LANG = eINSTANCE.getVar_Lang();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR__STYLE = eINSTANCE.getVar_Style();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.AlignType <em>Align Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AlignType
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getAlignType()
		 * @generated
		 */
		EEnum ALIGN_TYPE = eINSTANCE.getAlignType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.ImageKind <em>Image Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ImageKind
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getImageKind()
		 * @generated
		 */
		EEnum IMAGE_KIND = eINSTANCE.getImageKind();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.MediaType <em>Media Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.MediaType
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getMediaType()
		 * @generated
		 */
		EEnum MEDIA_TYPE = eINSTANCE.getMediaType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType <em>Mif Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getMifClassType()
		 * @generated
		 */
		EEnum MIF_CLASS_TYPE = eINSTANCE.getMifClassType();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.ObjectName <em>Object Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ObjectName
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getObjectName()
		 * @generated
		 */
		EEnum OBJECT_NAME = eINSTANCE.getObjectName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.ParamName <em>Param Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ParamName
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getParamName()
		 * @generated
		 */
		EEnum PARAM_NAME = eINSTANCE.getParamName();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Shape <em>Shape</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Shape
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getShape()
		 * @generated
		 */
		EEnum SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet <em>Style Sheet</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getStyleSheet()
		 * @generated
		 */
		EEnum STYLE_SHEET = eINSTANCE.getStyleSheet();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.TFrame <em>TFrame</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.TFrame
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTFrame()
		 * @generated
		 */
		EEnum TFRAME = eINSTANCE.getTFrame();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.TRules <em>TRules</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.TRules
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTRules()
		 * @generated
		 */
		EEnum TRULES = eINSTANCE.getTRules();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.emf.w3c.xhtml.ValignType <em>Valign Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ValignType
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getValignType()
		 * @generated
		 */
		EEnum VALIGN_TYPE = eINSTANCE.getValignType();

		/**
		 * The meta object literal for the '<em>Align Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.AlignType
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getAlignTypeObject()
		 * @generated
		 */
		EDataType ALIGN_TYPE_OBJECT = eINSTANCE.getAlignTypeObject();

		/**
		 * The meta object literal for the '<em>Character</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getCharacter()
		 * @generated
		 */
		EDataType CHARACTER = eINSTANCE.getCharacter();

		/**
		 * The meta object literal for the '<em>Content Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getContentType()
		 * @generated
		 */
		EDataType CONTENT_TYPE = eINSTANCE.getContentType();

		/**
		 * The meta object literal for the '<em>Coords</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getCoords()
		 * @generated
		 */
		EDataType COORDS = eINSTANCE.getCoords();

		/**
		 * The meta object literal for the '<em>Image Kind Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ImageKind
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getImageKindObject()
		 * @generated
		 */
		EDataType IMAGE_KIND_OBJECT = eINSTANCE.getImageKindObject();

		/**
		 * The meta object literal for the '<em>Length</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getLength()
		 * @generated
		 */
		EDataType LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '<em>Media Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.MediaType
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getMediaTypeObject()
		 * @generated
		 */
		EDataType MEDIA_TYPE_OBJECT = eINSTANCE.getMediaTypeObject();

		/**
		 * The meta object literal for the '<em>Mif Class Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getMifClassTypeObject()
		 * @generated
		 */
		EDataType MIF_CLASS_TYPE_OBJECT = eINSTANCE.getMifClassTypeObject();

		/**
		 * The meta object literal for the '<em>Multi Length</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getMultiLength()
		 * @generated
		 */
		EDataType MULTI_LENGTH = eINSTANCE.getMultiLength();

		/**
		 * The meta object literal for the '<em>Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getNumber()
		 * @generated
		 */
		EDataType NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em>Object Name Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ObjectName
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getObjectNameObject()
		 * @generated
		 */
		EDataType OBJECT_NAME_OBJECT = eINSTANCE.getObjectNameObject();

		/**
		 * The meta object literal for the '<em>Param Name Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ParamName
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getParamNameObject()
		 * @generated
		 */
		EDataType PARAM_NAME_OBJECT = eINSTANCE.getParamNameObject();

		/**
		 * The meta object literal for the '<em>Param Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getParamValue()
		 * @generated
		 */
		EDataType PARAM_VALUE = eINSTANCE.getParamValue();

		/**
		 * The meta object literal for the '<em>Pixels</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getPixels()
		 * @generated
		 */
		EDataType PIXELS = eINSTANCE.getPixels();

		/**
		 * The meta object literal for the '<em>Shape Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Shape
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getShapeObject()
		 * @generated
		 */
		EDataType SHAPE_OBJECT = eINSTANCE.getShapeObject();

		/**
		 * The meta object literal for the '<em>Style Sheet Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getStyleSheetObject()
		 * @generated
		 */
		EDataType STYLE_SHEET_OBJECT = eINSTANCE.getStyleSheetObject();

		/**
		 * The meta object literal for the '<em>Text</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getText()
		 * @generated
		 */
		EDataType TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em>TFrame Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.TFrame
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTFrameObject()
		 * @generated
		 */
		EDataType TFRAME_OBJECT = eINSTANCE.getTFrameObject();

		/**
		 * The meta object literal for the '<em>TRules Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.TRules
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getTRulesObject()
		 * @generated
		 */
		EDataType TRULES_OBJECT = eINSTANCE.getTRulesObject();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>Valign Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.ValignType
		 * @see org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl#getValignTypeObject()
		 * @generated
		 */
		EDataType VALIGN_TYPE_OBJECT = eINSTANCE.getValignTypeObject();

	}

} //XhtmlPackage
