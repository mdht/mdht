
Windows Build Read Me

In order to build using a windows machine you need to complete the following one installation steps

1 - Download and extract PDE Releng BaseBuilder which will execute the build process from here 
2 - Download and Install SVN Client from here
3 - Download and Install the following Ant Extensions
	ant-contrib-0.6-bin.zip

	svnant-1.3.0.zip

	emma-2.0.5312.zip 
	
	
4 - Copy samplebuildenv.bat to a local copy such as mybuildenv.bat and properly set all the required environment variables

5 - Use build.bat to run the build
	
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