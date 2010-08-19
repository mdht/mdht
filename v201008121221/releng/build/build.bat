@echo off
SETLOCAL
cls



IF '%1'=='-t' GOTO SETCOMPONENT
GOTO DONECHECKING

:SETCOMPONENT
set MDHT_COMPONENT=%2
:DONECHECKING

if not "%JAVA_HOME%" == "" goto gotJavaHome

echo The JAVA_HOME environment variable is not defined

echo This environment variable is needed to run this program

goto exit

:gotJavaHome

if not "%ANT_HOME%" == "" goto gotAntHome

echo The ANT_HOME environment variable is not defined

echo This environment variable is needed to run this program

goto exit

:gotAntHome


REM  Location of eclipse PDE Installation - PDE build application - relative path
if not "%MDHT_PDELOCATION%" == "" goto gotMDHT_PDELOCATION
set MDHT_PDELOCATION=../org.eclipse.releng.basebuilder
:gotMDHT_PDELOCATION

REM  Location of eclipse PDE Headless builder application
if not "%MDHT_LAUNCHER%" == "" goto gotMDHT_LAUNCHER
set MDHT_LAUNCHER=%MDHT_PDELOCATION%/plugins/org.eclipse.equinox.launcher.jar
:gotMDHT_LAUNCHER

REM  Location of all the installed build files used by the PDE headless build, build.properties and customTargets.xml
if not "%MDHT_BUILDER%" == "" goto gotMDHT_BUILDER
set MDHT_BUILDER=%CD%
:gotMDHT_BUILDER

REM  Location of required eclipse plugins for build - There is not reall good default for this value, so it is a required environment variable for the time being
if not "%MDHT_ECLIPSE%" == "" goto gotMDHT_ECLIPSE
echo You must MDHT_ECLIPSE to location of eclipse plugins to build such as C:\Galileo\eclipse or RSM location
goto exit
:gotMDHT_ECLIPSE

REM  Root Directory for both the Build (src files) and the eventual Repository
if not "%MDHT_LOCATION%" == "" goto gotMDHT_LOCATION
set MDHT_LOCATION=%CD%
:gotMDHT_LOCATION

REM  src location
if not "%MDHT_BUILDDIRECTORY%" == "" goto gotMDHT_BUILDDIRECTORY
set MDHT_BUILDDIRECTORY=%MDHT_LOCATION%\src
:gotMDHT_BUILDDIRECTORY

REM  Repository/Update Site location
if not "%MDHT_REPODIRECTORY%" == "" goto gotMDHT_REPODIRECTORY
set MDHT_REPODIRECTORY=%MDHT_LOCATION%\repo
:gotMDHT_REPODIRECTORY

REM  MDHT Ant Build File
if not "%MDHT_BUILD_XML%" == "" goto gotMDHT_BUILD_XML
set MDHT_BUILD_XML=%MDHT_BUILDER%/build.xml
:gotMDHT_BUILD_XML

REM  Path to P2 category definitions used to create teh P2 update site
if not "%CATEGORY_XML%" == "" goto gotCATEGORY_XML
set CATEGORY_XML=%MDHT_BUILDER%/category.xml
:gotCATEGORY_XML

REM  Build Target - N-Nightly; I-Integration; etc
if not "%MDHT_BUILDTARGET%" == "" goto gotMDHT_BUILDTARGET
set MDHT_BUILDTARGET=N
:gotMDHT_BUILDTARGET


if not "%MDHT_COMPONENT%" == "" goto gotMDHT_COMPONENT
set MDHT_COMPONENT=ALL
:gotMDHT_COMPONENT

echo "********************************************************************"
echo "MDHT BUILD ENVIRONMENT"

echo JAVA_HOME=%JAVA_HOME%

echo ANT_HOME=%ANT_HOME%

echo MDHT_LAUNCHER=%MDHT_LAUNCHER%

echo MDHT_BUILDER=%MDHT_BUILDER%

echo MDHT_ECLIPSE=%MDHT_ECLIPSE%

echo MDHT_LOCATION=%MDHT_LOCATION%

echo MDHT_BUILDDIRECTORY=%MDHT_BUILDDIRECTORY%

echo MDHT_REPODIRECTORY=%MDHT_REPODIRECTORY%

echo MDHT_BUILD_XML=%MDHT_BUILD_XML%

echo CATEGORY_XML=%CATEGORY_XML%

echo MDHT_COMPONENT=%MDHT_COMPONENT%

echo MDHT_BUILDTARGET=%MDHT_BUILDTARGET%

echo "********************************************************************"

echo Building : %JAVA_HOME%/java -cp %MDHT_LAUNCHER% org.eclipse.core.launcher.Main -application org.eclipse.ant.core.antRunner -buildfile %MDHT_BUILD_XML% -DbaseLocation=%MDHT_ECLIPSE% -Dbuilder=%MDHT_BUILDER%  -DbuildType=%MDHT_BUILDTARGET% -DbuildDirectory=%MDHT_BUILDDIRECTORY% -Drepodir=%MDHT_REPODIRECTORY% -DANT_HOME=%ANT_HOME% -Dmdhtcomponent=%MDHT_COMPONENT%

%JAVA_HOME%/bin/java -cp %MDHT_LAUNCHER% org.eclipse.core.launcher.Main -application org.eclipse.ant.core.antRunner -buildfile %MDHT_BUILD_XML% -DbaseLocation=%MDHT_ECLIPSE% -Dbuilder=%MDHT_BUILDER%  -DbuildType=%MDHT_BUILDTARGET% -DbuildDirectory=%MDHT_BUILDDIRECTORY% -Drepodir=%MDHT_REPODIRECTORY% -DANT_HOME=%ANT_HOME% -Dmdhtcomponent=%MDHT_COMPONENT%

echo Building : %JAVA_HOME%/java  -jar %MDHT_LAUNCHER% -application org.eclipse.equinox.p2.publisher.CategoryPublisher -metadataRepository file:%MDHT_REPODIRECTORY% -categoryDefinition file:%CATEGORY_XML% -Drepodir=%MDHT_REPODIRECTORY%

%JAVA_HOME%/bin/java  -jar %MDHT_LAUNCHER% -application org.eclipse.equinox.p2.publisher.CategoryPublisher -metadataRepository file:%MDHT_REPODIRECTORY% -categoryDefinition file:%CATEGORY_XML% -Drepodir=%MDHT_REPODIRECTORY%

:exit
exit /b 1

:end