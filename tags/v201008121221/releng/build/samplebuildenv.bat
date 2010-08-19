@echo off
REM Required environment variables settings
REM Make local copy and run before build after setting to your paths
REM make sure you use 8.3 notation for the paths 
REM dir /x will give you the 8.3 equivalent  of program files for instance (usually PROGRA~1)
REM Please do not check in your local version

SET JAVA_HOME=<Fully Qualified path to Java executable>

SET MDHT_ECLIPSE=<Fully Qualified path to Eclipse or RSM executable>

SET ANT_HOME=<Fully Qualified path to Ant installation directory where all required libs are install for instance ..\plugins\org.apache.ant_1.6.5 >

REM Call to installed version of svn command line used to export from svn
call c:\Progra~1\VISUAL~1\vsvnvars.bat
