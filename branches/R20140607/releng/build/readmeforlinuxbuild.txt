
Linux Build Read Me

In order to build using a linux machine you need to complete the following one installation steps
At this time - you need to use these exact version due to some svn compatibility issues with other updated builds

0 - Install clean version of Eclipse Modeling to run build - currently  eclipse-modeling-indigo

1 - Create a directory for the build such as \home\myusername\mdhtbuild

2 - Download and extract into \home\myusername\mdhtbuild PDE Releng BaseBuilder which will execute the build process from here

	http://oht-modeling.sourceforge.net/zips/org.eclipse.releng.basebuilder.zip

3 - Install SVN Client and Ant if not already installed 

	sudo apt-get install subversion
	
	sudo apt-get install ant 
	

4 - Download and Install the following Ant Extensions into your ant installation (usually /usr/share/ant/lib)

	ant-contrib-0.6-bin.zip

	http://oht-modeling.sourceforge.net/zips/ant-contrib-0.6-bin.zip

	svnant-1.3.0.zip

	http://oht-modeling.sourceforge.net/zips/svnant-1.3.0.zip

	emma-2.0.5312.zip 

	http://oht-modeling.sourceforge.net/zips/emma-2.0.5312.zip	
	
5 - using the command line svn you can get the build files using the following commands

	cd \home\myusername\mdhtbuild
	svn co https://www.projects.openhealthtools.org/svn/mdht/trunk/releng/build

6 - Modify build_config.bash as necessary


7 - Use build.bat to run the build
	
Ant Task Installation Notes
	The current build expects the jars located in the ant zip files to be physically copied to the the ANT_HOME directory 
	Here is what the directory needs to contain
	
ant-antlr.jar
ant-apache-bcel.jar
ant-apache-bsf.jar
ant-apache-log4j.jar
ant-apache-oro.jar
ant-apache-regexp.jar
ant-apache-resolver.jar
ant-commons-logging.jar
ant-commons-net.jar
ant-contrib-0.6.jar
ant-icontract.jar
ant-jai.jar
ant-javamail.jar
ant-jdepend.jar
ant-jmf.jar
ant-jsch.jar
ant-junit.jar
ant-launcher.jar
ant-netrexx.jar
ant-nodeps.jar
ant-starteam.jar
ant-stylebook.jar
ant-swing.jar
ant-trax.jar
ant-vaj.jar
ant-weblogic.jar
ant-xalan1.jar
ant-xslp.jar
ant.jar
ganymed.jar
JAVAHL-LICENSE
svnant.jar
SVNCLIENTADAPTER-LICENSE
svnClientAdapter.jar
svnjavahl.jar
svnkit.jar