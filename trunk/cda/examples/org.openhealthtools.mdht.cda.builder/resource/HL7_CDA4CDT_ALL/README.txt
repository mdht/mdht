CDA4CDT Test Package
Clinical Document Header Template

Version 1
February 6, 2009


Package Contents

 * A folder CDA4CDT_Rules containing XML schema files, schematron entity files and vocabulary rules for validating CDA R2 documents that claim conformance to the Common Document Header Template specified in the HL7 Trial Use specification:  HL7 Implementation Guide for CDA Release 2: History and Physical (H&P) Notes, Release 1, Draft Standard for Trial Use, August 2008.  These rules were based upon a subset of schematron rules distributed by HL7 which were written against an earlier release of the specification.  This subset was expanded by NIST to include updates which had been made to the specification after the original schematron rules had been written.  These original files are available from HL7: http://wiki.hl7.org/index.php?title=CDA_for_Common_Document_Types_%28CDA4CDT%29
The rules are split into two sections.  The first is named "HandP.sch".  This contains the rules as defined by the specification document.  The second is named	"HandP.IHE.PCC.sch".  This contains the rules as relaxed and used by the IHE Patient Care Committee Medication Documents Specification.  See <http://wiki.ihe.net/index.php?title=1.3.6.1.4.1.19376.1.5.3.1.1.1> for more information concerning how IHE PCC makes use of CDA4CDT.

 * Four sample XML files described further below.

 * An XML transform ( HumanViewCCD.xsl) for transforming the XML files into human readable output files. 

 * This file describing the contents of the package.


Introduction

The HL7 Implementation Guide for CDA Release 2: History and Physical (H&P) is published as a multi-part document. Section 2 (CDA Header – General Constraints) specifies general constraints on a CDA Header and is intended to specify a common header template for all forthcoming Implementation Guides for CDA R2, not just the current History and Physical guide. Section 3 (CDA Header – H&P Note-Specific Constraints) specifies additional constraints on a CDA Header when the medical document is indeed a History and Physical medical document. Section 4 (Body) specifies additional XML Section requirements and required content for History and Physical medical documents.

This test package is concerned only with the general constraints specified in Section 2. These constraints are intended to define minimal Header rules for any CDA R2 medical document (current and forthcoming) subject to HL7 Implementation Guides for CDA Release 2. This test package does not enforce any constraint rules specified in Section 3 or Section 4.

Section 2 consists of 52 conformance rules numbered CONF-HP-1 through CONF-HP-52. Some rules specify constraints that SHALL be satisfied, some specify constraints that SHOULD be satisfied, and some specify constraints that MAY be satisfied. Our tests consider a document to be invalid if any SHALL constraints are violated. In addition, our tests issue a Warning if any of the SHOULD constraints are violated. 

The NIST CDA Validation Site (http://xreg2.nist.gov/cda-validation/validation.html ) identifies a test option titled “CDA4CDT (header only)”. That test option implements the rules of this test package only. It does NOT test any content beyond general constraints on CDA Header. In particular, it does not test or require any Body content for a CDA R2 clinical document.

Sample XML Documents

This test package contains four example XML documents that satisfy various CDA R2 and Header constraints:

CDA4CDT_MinimalCDAR2_No_CDT_TemplateIds.xml
CDA4CDT_MinimalCDAR2_w_CDT_TemplateId.xml
CDA4CDT_Minimal_NoWarnings.xml
CDA4CDT_RepresentativeContent.xml

These XML documents are described further below.

CDA4CDT_MinimalCDAR2_No_CDT_TemplateIds.xml

This is a minimal CDA R2 document that validates to all HL7 CDA R2 tests at the NIST CDA validation site and does not produce any Warnings. It contains a CDA R2 templateId, a document Id, and a timestamp, but is essentially devoid of any other medical content. It contains required CDA R2 XML elements for <recordTarget>, <patientRole>, <author>, and <custodian>, but none of the elements have any useful name or contact information. 

When this same document is tested against the CDA4CDT (header only) package of tests, the result is a violation of three fundamental constraints from Section 2, namely: CONF-HP-1, CONF-HP-7, and CONF-HP-10, which require the presence of an appropriate additional templateId for CDT, require address and telecom elements for authors and custodians, etc., and require more precise time interval information for all participants. Note that the address and telecom elements are still not required to contain any useful information – the elements must exist but can be empty.

CDA4CDT_MinimalCDAR2_w_CDT_TemplateId.xml

This document takes the previous document with no CDT template Id, adds the necessary templateId, and makes several additional improvements so the document validates against the required constraints for CDA4CDT (header only) as implemented at the NIST validation site. This is a CDA R2 medical document with a valid Header as specified by CDA4CDT. Note that this document has very minimal patient, author and custodian information, but it returns no Errors when tested against CDA4CDT and thus has a Valid CDA4CDT header.

However, this document returns a number of Warnings when tested against the SHOULD constraints of CDA4CDT. Note that the address and telecom elements are still not required to contain any useful information – the elements must exist but can be empty. When these Warnings are eliminated, one gets a minimal, valid, no warnings document as follows.




CDA4CDT_Minimal_NoWarnings.xml

This is a valid CDA R2 medical document that contains a minimal, valid CDA4CDT Header that does not return any warnings when tested. Note that some patient information is required, i.e. administrativeGender and birthDate, but no required Id or name. The author and custodian elements are still empty of any relevant medical information and no warnings are returned for empty content. 

If this same document is tested against all constraints, including MAY constraints, then the NIST tests return another half-dozen or so notes that certain information May be present, but isn’t.


CDA4CDT_RepresentativeContent.xml

This document begins with the previous “no warnings” document and adds some content information to patient, author, custodian, informer, etc. elements. The attempt to add this information triggers a number of CDA4CDT rules that check that the format of the new information is complete and well-formed. If a non-required code is entered, these new rules will check that the code comes from the recommended code system.

The result is a nondescript medical document that contains a Header with reasonable patient, author, custodian and informer information. The Header is representative with non-trivial medical information and validates to CDA4CDT with no warnings. If tested against all rules, including MAY constraints, much of that information is not present and notes to that effect arise in the validation report.

This "representative content" document can be used with a certain bit of confidence to help guide a user into producing CDA R2 medical documents with Headers that abide by the recommended constraints of CDA4CDT.


Disclaimers

Favorable outcome in the use of the test materials on this site does not imply
conformance recognition by NIST, CCHIT, or IHE.

Links to non-Federal Government Web sites do not imply NIST endorsement of any
particular product, service, organization, company, information provider, or
content.

This software was developed at the National Institute of Standards and Technology
by employees of the Federal Government in the course of their official duties.
Pursuant to title 17 Section 105 of the United States Code this software is not
subject to copyright protection and is in the public domain.

The CDA Guideline Validator is an experimental system. NIST assumes no responsibility
whatsoever for its use by other parties, and makes no guarantees, expressed or implied,
about its quality, reliability, or any other characteristic. We would appreciate
acknowledgment if the software is used. This software can be redistributed and/or
modified freely provided that any derivative works bear some notice that they are
derived from it, and any modified versions bear some notice that they have been
modified.
