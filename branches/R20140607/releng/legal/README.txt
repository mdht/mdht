OHT Model-Driven Health Tools (MDHT) 1.0.0 Release Notes
    https://mdht.projects.openhealthtools.org


For license information, please see about.html in this release package.

Release 1.0.0 of the OHT MDHT Project has 3 distribution packages

1. All-in-One

The all-in-one ZIP is our recommended download for both new and existing users. The ZIP archive (approximately 200MB) is for Windows and contains a complete Eclipse 3.6 workbench with MDHT plug-ins and all prerequisites installed. A pre-configured workspace is included with current copies of CDA model projects. Simply unpack the ZIP anywhere on your computer, then double-click the /eclipse/eclipse.exe command. With this all-in-one download, you will not need any of the installation instructions on the remainder of this page. This is pre-configured with our MDHT Subversion location to update models; all you'll need is a general OHT site account to login to Subversion.

2. Runtime

The runtime binaries ZIP contains JAR files with generated Java code from template models, plus all necessary EMF/OCL dependencies. The runtime distribution is for application developers who are using MDHT Java libraries created from models, not for creating or editing model specifications.

3. UpdateSite

If you need to download an archive of the update site contents (due to organization firewall restrictions), download the latest update site ZIP. For most users, do not download this ZIP, but add the following URL as an Eclipse update site repository (this is pre-configured in the all-in-one):

    http://oht-modeling.sourceforge.net/updates/releases


User Documentation (User Guide and Runtime API Guide)

    https://www.projects.openhealthtools.org/sf/wiki/do/viewPage/projects.mdht/wiki/User%20Documentation

Developer Environment Setup

    https://www.projects.openhealthtools.org/sf/wiki/do/viewPage/projects.mdht/wiki/Tutorials

Demonstrations and other reference documents

    http://cdatools.org/


Issues closed by this Release

MDHT UML Editor (All-in-One, UpdateSite)
- Deleting a Class should also delete Associations from that class [artf2847]
- Issue when deleting classes with associations [artf2854]

New CDA Model Project Wizard (All-in-One, UpdateSite)
- Manifests are created incorrectly [artf2756]
- build.properties is not generated correctly to include / exclude plugin.xml and plugin.properties (where appropriate in the generated and doc projects) [artf2865]
- Model plug-in class is not generated [artf2849]
- EMF Runtime Version not set [artf2859]
- Incorrect generation of model transformation [artf2848]

Validation (Runtime)
- Incorrect Schema Reference Used By CDAUtil.load() [artf2858]


Known Bugs / Limitations

MDHT UML Editor (All-in-One, UpdateSite)
- Referenced model files are marked as 'dirty' even when not modified [artf2759]
- Copy/Paste Constraint fails to copy all of the data [artf2477]

New CDA Model Project Wizard (All-in-One, UpdateSite)
- Does not work if the all-in-one environment resides in a location that contains a space in the file path [artf2860]

MDHT > Publish context-menu action (All-in-One, UpdateSite)
- Does not work if the all-in-one environment resides in a location that contains a space in the file path [artf2861]
- Only works in Resource or UML Modeling perspective (perspectives that include Project Explorer) [artf2862]
- Does not work when resources are configured in Working Sets [artf2862]
- Does not work if there are multiple EPackages with the same namespace URI in the environment (workspace) [artf2864]

Validation (Runtime)
- Incorrect enumeration literals in an XML instance causes an exception to be thrown during deserialization [artf2827]


Support

Please submit questions to the MDHT Discussion Forums
    https://www.projects.openhealthtools.org/sf/discussion/do/listForums/projects.mdht/discussion


- MDHT Team