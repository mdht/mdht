/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Description</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * 
 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">EntryDescription</i> is a subclass of <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">OpaqueData</i>. The purpose behind this is that there are certain textual fields that some CTS<sub
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub> service implementations may want constrain. As an example,
 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Designation</i> text is of type \\ <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">EntryDescription</i>, but implementations may want to restrict the <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">OpaqueData</i>
 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">value </i>attribute to a simple string rather than xs:anyType. When <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">OpaqueData</i> appears directly as a model element, implementations must be able to support the
 * full <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">OpaqueData</i> model. <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">EntryDescription</i>,
 * however, may be constrained by implementations or specialized PSMs.
 * <!-- end-model-doc -->
 * 
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getEntryDescription()
 * @model extendedMetaData="name='EntryDescription' kind='elementOnly'"
 * @generated
 */
public interface EntryDescription extends OpaqueData {
} // EntryDescription
