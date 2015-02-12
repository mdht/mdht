/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Property Description</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">PredicateDescription</i> that describes a predicate used for "lexical" annotation of an
 * entity or other resource. Annotation properties are "semantically weak" (see below) in the sense that they are not
 * inherited through subclass associations."For annotations properties note that annotations are not 'semantic-free' under the OWL 2 RDF-Based
 * Semantics. Just like every other triple or set of triples occurring in an RDF graph,
 * an annotation is assigned a truth value by any given OWL 2 RDF-Based interpretation. Hence, although annotations are meant to be 'semantically
 * weak', i.e., their formal meaning does not significantly exceed that originating
 * from the RDF Semantics specification, adding an annotation may still change the meaning of an ontology."
 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">
 * <sub>http://www.w3.org/TR/2009/REC-owl2-rdf-based-semantics-20091027/#Introduction_.28Informative.29</sub>
 * </i>
 * 
 * <!-- end-model-doc -->
 * 
 * 
 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getAnnotationPropertyDescription()
 * @model extendedMetaData="name='AnnotationPropertyDescription' kind='elementOnly'"
 * @generated
 */
public interface AnnotationPropertyDescription extends PredicateDescription {
} // AnnotationPropertyDescription
