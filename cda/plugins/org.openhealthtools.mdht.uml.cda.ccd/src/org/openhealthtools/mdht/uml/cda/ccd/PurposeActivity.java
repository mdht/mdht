/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.Act;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purpose Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     <font size="2">CCD represents the ASTM CCR &lt;Purpose&gt; object as a relationship between two classes – the source
 *     represents the act of creating a summary document, the target is the reason for creating the document, and the
 *     relationship type is "RSON" (has reason). The target act may be an Observation, Procedure, or some other kind of act,
 *     and it may represent an order, an event, etc.</font>
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#getPurposeActivity()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation moodCode='EVN' classCode='ACT' statusCode.codeSystemName='ActStatus' code.codeSystemName='SNOMED CT' constraints.validation.error='PurposeActivity_templateId PurposeActivity_hasReason PurposeActivity_reasonType PurposeActivity_classCode PurposeActivity_moodCode PurposeActivity_code PurposeActivity_statusCode' templateId.root='2.16.840.1.113883.10.20.1.30' statusCode.codeSystem='2.16.840.1.113883.5.14' code.displayName='Documentation procedure' statusCode.code='completed' code.codeSystem='2.16.840.1.113883.6.96' code.code='23745001'"
 * @generated
 */
public interface PurposeActivity extends Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | 
	 *   entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | \r\n  entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)\r\n'"
	 * @generated
	 */
	boolean PurposeActivity_hasReason(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->forAll(entryRelationship : cda::EntryRelationship |
	 *   entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON implies( 
	 *   not (entryRelationship.act.oclIsUndefined() and entryRelationship.encounter.oclIsUndefined()
	 *        and entryRelationship.observation.oclIsUndefined() and entryRelationship.procedure.oclIsUndefined()
	 *        and entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.supply.oclIsUndefined())))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->forAll(entryRelationship : cda::EntryRelationship |\r\n  entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON implies( \r\n  not (entryRelationship.act.oclIsUndefined() and entryRelationship.encounter.oclIsUndefined()\r\n       and entryRelationship.observation.oclIsUndefined() and entryRelationship.procedure.oclIsUndefined()\r\n       and entryRelationship.substanceAdministration.oclIsUndefined() and entryRelationship.supply.oclIsUndefined())))'"
	 * @generated
	 */
	boolean PurposeActivity_reasonType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.30')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'2.16.840.1.113883.10.20.1.30\')'"
	 * @generated
	 */
	boolean PurposeActivity_templateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryAct::ACT'"
	 * @generated
	 */
	boolean PurposeActivity_classCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentActMood::EVN'"
	 * @generated
	 */
	boolean PurposeActivity_moodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = '23745001' and value.codeSystem = '2.16.840.1.113883.6.96')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (\r\nvalue.code = \'23745001\' and value.codeSystem = \'2.16.840.1.113883.6.96\')'"
	 * @generated
	 */
	boolean PurposeActivity_code(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \r\nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (\r\nvalue.code = \'completed\' and value.codeSystem = \'2.16.840.1.113883.5.14\')'"
	 * @generated
	 */
	boolean PurposeActivity_statusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurposeActivity init();
} // PurposeActivity
