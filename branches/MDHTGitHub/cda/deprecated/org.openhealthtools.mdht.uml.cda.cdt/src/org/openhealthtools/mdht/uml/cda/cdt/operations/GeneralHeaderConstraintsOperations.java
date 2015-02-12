/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.AssociatedEntity;
import org.openhealthtools.mdht.uml.cda.Guardian;
import org.openhealthtools.mdht.uml.cda.IntendedRecipient;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.RelatedEntity;
import org.openhealthtools.mdht.uml.cda.RelatedSubject;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPlugin;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.Role;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Header Constraints</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsPersonHasName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Person Has Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Roles Shall Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Roles Should Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Organizations Have Contact Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTimePreciseToDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTimePreciseToYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTelephoneMatchesRegex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Telephone Matches Regex</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasTelephoneDialingDigits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Telephone Dialing Digits</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Unknown Telephone Uses Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTypeIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsOidLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Oid Length</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsSetIdAndVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id And Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsSetIdAndIdAreUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id And Id Are Unique</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCopyTimeNotPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Copy Time Not Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasPatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasProviderOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Provider Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Assigned Author Person Or Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Data Enterer Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasDataEntererTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Data Enterer Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Informant Assigned Person Or Related Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTimePreciseToSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTimePreciseToYearAndDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Year And Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralHeaderConstraintsOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralHeaderConstraintsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsPersonHasName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Person Has Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsPersonHasName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsPersonHasName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Person Has Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsPersonHasName(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.testPersonHasName()
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static  boolean validateGeneralHeaderConstraintsPersonHasName(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		/* All patient, guardianPerson, assignedPerson, maintainingPerson, relatedPerson, 
		 * intendedRecipient/informationRecipient, associatedPerson, and relatedSubject/subject 
		 * elements have a name.
		 */
		try {
			boolean hasErrors = false;
			CDAUtil.CDAXPath cdaXPath =  CDAUtil.createCDAXPath(generalHeaderConstraints);
			
			String xpath = "//*[self::cda:patient or self::cda:guardianPerson or self::cda:assignedPerson"
	            + " or self::cda:maintainingPerson or self::cda:relatedPerson or self::cda:associatedPerson"
            	+ " or self::cda:intendedRecipient/cda:informationRecipient or self::cda:relatedSubject/cda:subject]";
			List<InfrastructureRoot> nodes = cdaXPath.selectNodes(xpath, InfrastructureRoot.class);
			
			for (InfrastructureRoot node : nodes) {
				if ((node instanceof Person && ((Person)node).getNames().isEmpty())
						|| (node instanceof Patient && ((Patient)node).getNames().isEmpty())
						|| (node instanceof IntendedRecipient && ((IntendedRecipient)node).getInformationRecipient().getNames().isEmpty())
						|| (node instanceof RelatedSubject && ((RelatedSubject)node).getSubject().getNames().isEmpty())) {
					hasErrors = true;
					if (diagnostics != null) {
						diagnostics.add
							(new BasicDiagnostic
								(Diagnostic.ERROR,
								 CDTValidator.DIAGNOSTIC_SOURCE,
								 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_PERSON_HAS_NAME,
								 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsPersonHasName"),
								 new Object [] { node }));
					}
				}
			}

			if (hasErrors) {
				return false;
			}
		} catch (Exception e) {
			throw new UnsupportedOperationException(e.getLocalizedMessage());
		}
		
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Roles Shall Have Addr And Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Roles Shall Have Addr And Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static  boolean validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		/* All patientRole, assignedAuthor, assignedEntity[not(parent::dataEnterer)] 
		 * and associatedEntity elements have an addr and telecom element.
		 */
		try {
			boolean hasErrors = false;
			CDAUtil.CDAXPath cdaXPath =  CDAUtil.createCDAXPath(generalHeaderConstraints);
			
			String xpath = "//*[self::cda:patientRole or self::cda:assignedAuthor or self::cda:assignedEntity[not(parent::cda:dataEnterer)] or self::cda:associatedEntity]";
			List<InfrastructureRoot> nodes = cdaXPath.selectNodes(xpath, InfrastructureRoot.class);
			
			for (InfrastructureRoot node : nodes) {
				if ((node instanceof PatientRole && (((PatientRole)node).getAddrs().isEmpty() || ((PatientRole)node).getTelecoms().isEmpty()))
						|| (node instanceof AssignedAuthor && (((AssignedAuthor)node).getAddrs().isEmpty() || ((AssignedAuthor)node).getTelecoms().isEmpty()))
						|| (node instanceof AssignedEntity && (((AssignedEntity)node).getAddrs().isEmpty() || ((AssignedEntity)node).getTelecoms().isEmpty()))
						|| (node instanceof AssociatedEntity && (((AssociatedEntity)node).getAddrs().isEmpty() || ((AssociatedEntity)node).getTelecoms().isEmpty()))) {
					hasErrors = true;
					if (diagnostics != null) {
						diagnostics.add
							(new BasicDiagnostic
								(Diagnostic.ERROR,
								 CDTValidator.DIAGNOSTIC_SOURCE,
								 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ROLES_SHALL_HAVE_ADDR_AND_TELECOM,
								 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsRolesShallHaveAddrAndTelecom"),
								 new Object [] { node }));
					}
				}
			}
			
			if (hasErrors) {
				return false;
			}
		} catch (Exception e) {
			throw new UnsupportedOperationException(e.getLocalizedMessage());
		}
		
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Roles Should Have Addr And Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Roles Should Have Addr And Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */

	public static  boolean validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		try {
			boolean hasErrors = false;
			CDAUtil.CDAXPath cdaXPath =  CDAUtil.createCDAXPath(generalHeaderConstraints);
			
			String xpath = "//*[self::cda:guardian or self::cda:assignedEntity[parent::cda:dataEnterer] or self::cda:relatedEntity or self::cda:intendedRecipient or self::cda:relatedSubject or self::cda:participantRole]";
			List<Role> nodes = cdaXPath.selectNodes(xpath, Role.class);
			
			for (Role node : nodes) {
				
				if ((node instanceof  Guardian  && ((( Guardian  )node).getAddrs().isEmpty() || (( Guardian  )node).getTelecoms().isEmpty())) ||			
						(node instanceof  AssignedEntity && ((( AssignedEntity )node).getAddrs().isEmpty() || (( AssignedEntity )node).getTelecoms().isEmpty())) ||
						(node instanceof  RelatedEntity && ((( RelatedEntity )node).getAddrs().isEmpty() || (( RelatedEntity )node).getTelecoms().isEmpty())) ||
						(node instanceof  IntendedRecipient && ((( IntendedRecipient )node).getAddrs().isEmpty() || (( IntendedRecipient )node).getTelecoms().isEmpty())) ||
						(node instanceof  RelatedSubject && ((( RelatedSubject )node).getAddrs().isEmpty() || (( RelatedSubject )node).getTelecoms().isEmpty())) ||
						(node instanceof  ParticipantRole && ((( ParticipantRole )node).getAddrs().isEmpty() || (( ParticipantRole )node).getTelecoms().isEmpty()))) {
					hasErrors = true;
					if (diagnostics != null) {
						diagnostics
								.add(new BasicDiagnostic(
										Diagnostic.WARNING,
										CDTValidator.DIAGNOSTIC_SOURCE,
										CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM,
										CDTPlugin.INSTANCE
												.getString("GeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom"),
										new Object[] { node }));
					}
				}
			}
			
			if (hasErrors) {
				return false;
			}
		} catch (Exception e) {
			throw new UnsupportedOperationException(e.getLocalizedMessage());
		}
		
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Organizations Have Contact Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Organizations Have Contact Info</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static  boolean validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		try {
			boolean hasErrors = false;
			CDAUtil.CDAXPath cdaXPath =  CDAUtil.createCDAXPath(generalHeaderConstraints);
			
			
			String xpath = "//*[ //cda:guardianOrganization | //cda:providerOrganization | //cda:wholeOrganization | //cda:representedOrganization | //cda:representedCustodianOrganization | //cda:receivedOrganization| //cda:scopingOrganization | //cda:serviceProviderOrganization]";

			List<Organization> nodes = cdaXPath.selectNodes(xpath, Organization.class);
			
			for (Organization node : nodes) {

				if ( node.getNames().isEmpty() || node.getAddrs().isEmpty() || node.getTelecoms().isEmpty()  )  {
					hasErrors = true;
					if (diagnostics != null) {
						diagnostics
								.add(new BasicDiagnostic(
										Diagnostic.ERROR,
										CDTValidator.DIAGNOSTIC_SOURCE,
										CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ORGANIZATIONS_HAVE_CONTACT_INFO,
										CDTPlugin.INSTANCE
												.getString("GeneralHeaderConstraintsOrganizationsHaveContactInfo"),
										new Object[] { node }));
					}
				}
			}
			
			if (hasErrors) {
				return false;
			}
		} catch (Exception e) {
			throw new UnsupportedOperationException(e.getLocalizedMessage());
		}
		
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTimePreciseToDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTimePreciseToDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTimePreciseToDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTimePreciseToDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/*
	 * * @generated NOT
	 */
	
	private static boolean checkTS(TS ts,int precision)
	{
		if (ts != null) {
			if (ts instanceof IVL_TS )
			{				
				IVL_TS ets = (IVL_TS ) ts;			
				return checkTS(ets.getLow(),precision) || checkTS(ets.getCenter(),precision) || checkTS(ets.getHigh(),precision); 
			} else {
				return (!ts.isSetNullFlavor() && ts.getValue() == null) ||  (ts.getValue() != null && ts.getValue().length() < precision);
			}
		} else
		{
			return false;
		}
	}


	private static final String HP10XPATH="/cda:ClinicalDocument/cda:effectiveTime | //cda:author/cda:time | //cda:dataEnterer/cda:time | //cda:encompassingEncounter/cda:effectiveTime | //cda:legalAuthenticator/cda:time";
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	
	public static  boolean validateGeneralHeaderConstraintsTimePreciseToDay(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		
		try {
			boolean hasErrors = false;
			CDAUtil.CDAXPath cdaXPath =  CDAUtil.createCDAXPath(generalHeaderConstraints);
	
			List<TS> nodes = cdaXPath.selectNodes(HP10XPATH, TS.class);
			for (TS node : nodes) {
				if (checkTS(node,8) )  {
					hasErrors = true;
					if (diagnostics != null) {
						diagnostics
								.add(new BasicDiagnostic(
										Diagnostic.ERROR,
										CDTValidator.DIAGNOSTIC_SOURCE,
										CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_DAY,
										CDTPlugin.INSTANCE
												.getString("GeneralHeaderConstraintsTimePreciseToDay"),
										new Object[] { node }));
					}
				}
			}
			
			if (hasErrors) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new UnsupportedOperationException(e.getLocalizedMessage());
		}
		
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTimePreciseToYear(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTimePreciseToYear(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP =  "cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 4)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 4)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 4)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))";

	
	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTimePreciseToYear(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Year</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTimePreciseToYear(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	
	protected static  Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	
	
	public static  boolean validateGeneralHeaderConstraintsTimePreciseToYear(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
	            OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
	            VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {				
				pe.printStackTrace();
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		
		Object oclResultSet = VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		
		if (oclResultSet != null && oclResultSet instanceof Collection) {
			if (diagnostics != null) {
				for (EObject eObject : (Collection<EObject>) oclResultSet) {
					if (diagnostics != null) {
						diagnostics
								.add(new BasicDiagnostic(
										Diagnostic.ERROR,
										CDTValidator.DIAGNOSTIC_SOURCE,
										CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR,
										CDTPlugin.INSTANCE
												.getString("GeneralHeaderConstraintsTimePreciseToYear"),
										new Object[] { eObject }));
					}
				}
				
			}
			return false;
		}
		return true;
		
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTelephoneMatchesRegex(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Telephone Matches Regex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTelephoneMatchesRegex(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTelephoneMatchesRegex(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Telephone Matches Regex</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTelephoneMatchesRegex(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static  boolean validateGeneralHeaderConstraintsTelephoneMatchesRegex(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		try {
			
			boolean hasErrors = false;
			CDAUtil.CDAXPath cdaXPath =  CDAUtil.createCDAXPath(generalHeaderConstraints);
			
			String xpath = "//*[self::cda:telecom]";
			Pattern pattern = Pattern.compile("tel:\\+?[-0-9().]+"); 
			
			List<TEL> tels = cdaXPath.selectNodes(xpath, TEL.class);
			
			for (TEL tel : tels) {
				if (tel.getValue() != null ) {
					if (!pattern.matcher(tel.getValue()).matches()) {
						hasErrors = true;
						if (diagnostics != null) {
							diagnostics.add
								(new BasicDiagnostic
									(Diagnostic.ERROR,
									 CDTValidator.DIAGNOSTIC_SOURCE,
									 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TELEPHONE_MATCHES_REGEX,
									 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsTelephoneMatchesRegex"),
									 new Object [] { tel }));
						}
					}
				}
			}
			if (hasErrors) {
				return false;
			}
		} catch (Exception e) {
			throw new UnsupportedOperationException(e.getLocalizedMessage());
		} 
		
	return true;

	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasTelephoneDialingDigits(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Telephone Dialing Digits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasTelephoneDialingDigits(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasTelephoneDialingDigits(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Telephone Dialing Digits</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasTelephoneDialingDigits(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static  boolean validateGeneralHeaderConstraintsHasTelephoneDialingDigits(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		
		try {
			
			boolean hasErrors = false;
			
		
			CDAUtil.CDAXPath cdaXPath =  CDAUtil.createCDAXPath(generalHeaderConstraints);
			
			String xpath = "//*[self::cda:telecom]";
			
			Pattern pattern = Pattern.compile("^.*(?=.*[0-9]).*$"); 

			
			List<TEL> tels = cdaXPath.selectNodes(xpath, TEL.class);
			
			for (TEL tel : tels) {
				if (tel.getValue() != null && tel.getValue().length()>0 && tel.getValue().startsWith("tel:") ) {
					if (!pattern.matcher(tel.getValue()).matches()) {
						hasErrors = true;
						if (diagnostics != null) {
							diagnostics.add
								(new BasicDiagnostic
									(Diagnostic.ERROR,
									 CDTValidator.DIAGNOSTIC_SOURCE,
									 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_TELEPHONE_DIALING_DIGITS,
									 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasTelephoneDialingDigits"),
									 new Object [] { tel }));
						}
					}
				}
			}
			if (hasErrors) {
				return false;
			}
		} catch (Exception e) {			
			throw new UnsupportedOperationException(e.getLocalizedMessage());
		} 
		
	return true;

	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Unknown Telephone Uses Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Unknown Telephone Uses Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static  boolean validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		try {
			
			boolean hasErrors = false;
			CDAUtil.CDAXPath cdaXPath =  CDAUtil.createCDAXPath(generalHeaderConstraints);
			
			String xpath = "//*[self::cda:telecom]";
			
			List<TEL> tels = cdaXPath.selectNodes(xpath, TEL.class);
			
			for (TEL tel : tels) {
				
				//tel.getValue() == null && (tel.getValue() != null && tel.getValue().length() == 0) && tel.getNullFlavor() == null
				if (tel.getValue() == null  && !tel.isSetNullFlavor()) {
					hasErrors = true;
					if (diagnostics != null) {
						diagnostics.add
							(new BasicDiagnostic
								(Diagnostic.ERROR,
								 CDTValidator.DIAGNOSTIC_SOURCE,
								 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR,
								 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor"),
								 new Object [] { tel }));
					}
				}
			}
			if (hasErrors) {
				return false;
			}
		} catch (Exception e) {
			throw new UnsupportedOperationException(e.getLocalizedMessage());
		} 
		
	return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTypeIdExtension(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTypeIdExtension(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeId.extension = 'POCD_HD000040'";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTypeIdExtension(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTypeIdExtension(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeId.extension = 'POCD_HD000040'
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsTypeIdExtension(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsTypeIdExtension"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsOidLength(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Oid Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsOidLength(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	//
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->select((not id.root.oclIsUndefined()) and id.root.size() > 64 )";

/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsOidLength(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Oid Length</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsOidLength(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsOidLength(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Oid Length</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsOidLength(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static  Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * datatypes::II.allInstances()->select(currentII : datatypes::II | currentII.root.size() <= 64)->isEmpty()
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static  boolean validateGeneralHeaderConstraintsOidLength(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
	            OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
	            VALIDATE_GENERAL_HEADER_CONSTRAINTS_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {	
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		
		Object oclResultSet = VALIDATE_GENERAL_HEADER_CONSTRAINTS_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		
		if (oclResultSet != null && oclResultSet instanceof Set) {
			if (diagnostics != null) {
				for (EObject eObject : (Set<EObject>) oclResultSet) {
					if (diagnostics != null) {
						diagnostics
								.add(new BasicDiagnostic(
										Diagnostic.ERROR,
										CDTValidator.DIAGNOSTIC_SOURCE,
										CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_OID_LENGTH,
										CDTPlugin.INSTANCE
												.getString("GeneralHeaderConstraintsOidLength"),
										new Object[] { eObject }));
					}
				}
				
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsSetIdAndVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id And Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsSetIdAndVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())"+
"   xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsSetIdAndVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id And Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsSetIdAndVersionNumber(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())
	 *    xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsSetIdAndVersionNumber(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsSetIdAndVersionNumber"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsSetIdAndIdAreUnique(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id And Id Are Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsSetIdAndIdAreUnique(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())"+
"   implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsSetIdAndIdAreUnique(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id And Id Are Unique</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsSetIdAndIdAreUnique(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (not self.setId.oclIsUndefined() and not self.id.oclIsUndefined())
	 *    implies (self.setId.root <> self.id.root or self.setId.extension <> self.id.extension)
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsSetIdAndIdAreUnique(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsSetIdAndIdAreUnique"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCopyTimeNotPresent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Copy Time Not Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCopyTimeNotPresent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.copyTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCopyTimeNotPresent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Copy Time Not Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCopyTimeNotPresent(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.copyTime.oclIsUndefined()
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsCopyTimeNotPresent(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsCopyTimeNotPresent"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasRecordTargetPatientRole(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Record Target Patient Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasRecordTargetPatientRole(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasRecordTargetPatientRole(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Record Target Patient Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasRecordTargetPatientRole(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->size() > 0 and self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined())
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasRecordTargetPatientRole(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasRecordTargetPatientRole"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasPatientBirthTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Patient Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasPatientBirthTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"+
"   implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()"+
"      or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasPatientBirthTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Patient Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasPatientBirthTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.birthTime.value.oclIsUndefined()
	 *       or not target.patientRole.patient.birthTime.nullFlavor.oclIsUndefined()))
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasPatientBirthTime(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasPatientBirthTime"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasAdministrativeGenderCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Administrative Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasAdministrativeGenderCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"+
"   implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()"+
"      or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasAdministrativeGenderCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Administrative Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasAdministrativeGenderCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    implies (not target.patientRole.patient.administrativeGenderCode.code.oclIsUndefined()
	 *       or not target.patientRole.patient.administrativeGenderCode.nullFlavor.oclIsUndefined()))
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasAdministrativeGenderCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasAdministrativeGenderCode"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasProviderOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Provider Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasProviderOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasProviderOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Provider Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasProviderOrganization(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.providerOrganization.oclIsUndefined())
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasProviderOrganization(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasProviderOrganization"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasAuthorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Author Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasAuthorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasAuthorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Author Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasAuthorTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.time.oclIsUndefined())
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasAuthorTime(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasAuthorTime"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasAssignedAuthorId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Assigned Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasAssignedAuthorId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasAssignedAuthorId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Assigned Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasAssignedAuthorId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | author.assignedAuthor.id->size() > 0)
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasAssignedAuthorId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasAssignedAuthorId"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Assigned Author Person Or Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() "+
"   or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Assigned Author Person Or Device</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->forAll(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() 
	 *    or not author.assignedAuthor.assignedAuthoringDevice.oclIsUndefined())
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Data Enterer Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Data Enterer Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasDataEntererAssignedPerson"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasDataEntererTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Data Enterer Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasDataEntererTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasDataEntererTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Data Enterer Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasDataEntererTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.dataEnterer.oclIsUndefined() implies not self.dataEnterer.time.oclIsUndefined()
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasDataEntererTime(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasDataEntererTime"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasInformant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Informant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasInformant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasInformant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Informant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasInformant(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->size() > 0
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasInformant(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasInformant"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Informant Assigned Person Or Related Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()"+
"   or not i.relatedEntity.relatedPerson.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Informant Assigned Person Or Related Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->forAll(i : cda::Informant12 | not i.assignedEntity.assignedPerson.oclIsUndefined()
	 *    or not i.relatedEntity.relatedPerson.oclIsUndefined())
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Has Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Has Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.legalAuthenticator.oclIsUndefined() implies not self.legalAuthenticator.assignedEntity.assignedPerson.oclIsUndefined()
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Has Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |"+
"   not entity.assignedPerson.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Has Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.authenticator->forAll(auth : cda::Authenticator | auth.assignedEntity->forAll(entity : cda::AssignedEntity |
	 *    not entity.assignedPerson.oclIsUndefined()))
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthenticatorHasAssignedPerson"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTimePreciseToSecond(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Second</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTimePreciseToSecond(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- implemented in Java using XPath selector";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTimePreciseToSecond(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Second</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTimePreciseToSecond(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- implemented in Java using XPath selector
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static  boolean validateGeneralHeaderConstraintsTimePreciseToSecond(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		try {
			boolean hasErrors = false;
			CDAUtil.CDAXPath cdaXPath =  CDAUtil.createCDAXPath(generalHeaderConstraints);
	
			List<TS> nodes = cdaXPath.selectNodes(HP10XPATH, TS.class);
			for (TS node : nodes) {
				if (checkTS(node,14) )  {
					hasErrors = true;
					if (diagnostics != null) {
						diagnostics
								.add(new BasicDiagnostic(
										Diagnostic.WARNING,
										CDTValidator.DIAGNOSTIC_SOURCE,
										CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_SECOND,
										CDTPlugin.INSTANCE
												.getString("GeneralHeaderConstraintsTimePreciseToSecond"),
										new Object[] { node }));
					}
				}
			}
			
			if (hasErrors) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new UnsupportedOperationException(e.getLocalizedMessage());
		}

		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTimePreciseToYearAndDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Year And Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTimePreciseToYearAndDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "cda::OrganizationPartOf.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent.allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant.allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf.allInstances().effectiveTime->union(cda::MaintainedEntity.allInstances().effectiveTime)->union( cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::RelatedEntity.allInstances().effectiveTime)->union(cda::ServiceEvent.allInstances().effectiveTime)->union(cda::EncounterParticipant.allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTimePreciseToYearAndDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Year And Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTimePreciseToYearAndDay(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	
	protected static  Query<?, ?, ?>  VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::OrganizationPartOf::allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject)-> union(  cda::MaintainedEntity::allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union( cda::RelatedEntity::allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity::allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::RelatedEntity::allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::ServiceEvent::allInstances()->select( effectiveTime.oclIsUndefined()).oclAsType( ecore::EObject) )->union(cda::EncounterParticipant::allInstances()->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(self.participant->select( time.oclIsUndefined()).oclAsType( ecore::EObject))->union(cda::OrganizationPartOf::allInstances().effectiveTime->union(cda::MaintainedEntity::allInstances().effectiveTime)->union( cda::RelatedEntity::allInstances().effectiveTime)->union(cda::RelatedEntity::allInstances().effectiveTime)->union(cda::RelatedEntity::allInstances().effectiveTime)->union(cda::ServiceEvent::allInstances().effectiveTime)->union(cda::EncounterParticipant::allInstances().time)->union(self.participant.time)->select(current : datatypes::IVL_TS  |  ((not current.low.oclIsUndefined()) and (current.low.value.oclIsUndefined() or current.low.value.size() < 8)) or ((not current.center.oclIsUndefined()) and (current.center.value.oclIsUndefined() or current.center.value.size() < 8)) or ((not current.high.oclIsUndefined()) and (current.high.value.oclIsUndefined() or current.high.value.size() < 8)) or (current.low.oclIsUndefined() and current.center.oclIsUndefined() and current.high.oclIsUndefined()) ).oclAsType( ecore::EObject))
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static  boolean validateGeneralHeaderConstraintsTimePreciseToYearAndDay(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
	            OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
	            VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {				
				pe.printStackTrace();
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		
		Object oclResultSet = VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(generalHeaderConstraints);
		
		if (oclResultSet != null && oclResultSet instanceof Collection) {
			if (diagnostics != null) {
				for (EObject eObject : (Collection<EObject>) oclResultSet) {
					if (diagnostics != null) {
						diagnostics
								.add(new BasicDiagnostic(
										Diagnostic.WARNING,
										CDTValidator.DIAGNOSTIC_SOURCE,
										CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY,
										CDTPlugin.INSTANCE
												.getString("GeneralHeaderConstraintsTimePreciseToYearAndDay"),
										new Object[] { eObject }));
					}
				}
				
			}
			return false;
		}
		return true;

		
//		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
//			OCL.Helper helper = EOCL_ENV.createOCLHelper();
//			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
//			try {
//				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
//			}
//			catch (ParserException pe) {
//				throw new UnsupportedOperationException(pe.getLocalizedMessage());
//			}
//		}
//		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
//			if (diagnostics != null) {
//				diagnostics.add
//					(new BasicDiagnostic
//						(Diagnostic.WARNING,
//						 CDTValidator.DIAGNOSTIC_SOURCE,
//						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY,
//						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsTimePreciseToYearAndDay"),
//						 new Object [] { generalHeaderConstraints }));
//			}
//			return false;
//		}
//		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.3')
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsTemplateId"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined()
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CODE,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsCode"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.oclIsUndefined()
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsEffectiveTime"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id.oclIsUndefined()
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ID,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsId"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.languageCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.languageCode.oclIsUndefined()
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsLanguageCode"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = element.oclAsType(datatypes::CS) in "+
"value.code = 'US')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
	 * value.code = 'US')
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_REALM_CODE,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsRealmCode"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.title.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.title.oclIsUndefined()
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TITLE,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsTitle"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.typeId.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.typeId.oclIsUndefined()
	 * @param generalHeaderConstraints The receiving '<em><b>General Header Constraints</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TYPE_ID,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsTypeId"),
						 new Object [] { generalHeaderConstraints }));
			}
			return false;
		}
		return true;
	}

} // GeneralHeaderConstraintsOperations