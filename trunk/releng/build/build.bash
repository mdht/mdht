#!/bin/bash

#
# default configuration file is ./config_build.sh, unless another file is 
# specified in command-line. Available config variables:

usage()
{
cat << EOF
usage: $0 options

mdht build script

OPTIONS:
   -h Show this message
   -u SVN User Name (Required)
   -p SVN Password (Required)
   -t Build Target (...)
   -f Configfile

EOF
}

clear

vflag=off
configfilename=

svnuser=
svnpasswd=

while getopts "t:f:u:p:" optionName; do
case "$optionName" in
  t)  MDHT_COMPONENT="$OPTARG";;
  f)  configfilename="$OPTARG";;
  p)  svnpasswd="$OPTARG";;
  u)  svnuser="$OPTARG";;
  
[?])  usage
	  exit 1;;
esac
done

if [[ -z $svnuser ]] || [[ -z $svnpasswd ]] 
then
     usage
     exit 1
fi

if [ -z $configfilename ]; then
  . ./build_config.bash
else
  . $configfilename
fi



echo "********************************************************************"
echo "MDHT BUILD ENVIRONMENT"

echo JAVA_HOME=$JAVA_HOME

if [ ! -d "$JAVA_HOME" ]; then
   echo Error MDHT Build Directory Setting for JAVA_HOME  does not exist - $JAVA_HOME
   exit -1
fi


echo ANT_HOME=$ANT_HOME

if [ ! -d "$ANT_HOME" ]; then
   echo Error MDHT Build Directory Setting for ANT_HOME  does not exist - $ANT_HOME
   exit -1
fi


echo MDHT_LAUNCHER=$MDHT_LAUNCHER

if [ ! -e "$MDHT_LAUNCHER" ]; then
   echo Error MDHT Build File Setting for MDHT_LAUNCHER does not exist - $MDHT_LAUNCHER
   exit -1
fi

echo MDHT_BUILDER=$MDHT_BUILDER


if [ ! -d "$MDHT_BUILDER" ]; then
   echo Error MDHT Build Directory Setting for MDHT_BUILDER  does not exist - $MDHT_BUILDER
   exit -1
fi


echo MDHT_ECLIPSE=$MDHT_ECLIPSE

if [ ! -d "$MDHT_ECLIPSE" ]; then
   echo Error MDHT Build Directory Setting for MDHT_ECLIPSE  does not exist - $MDHT_ECLIPSE
   exit -1
fi

echo MDHT_LOCATION=$MDHT_LOCATION

if [ ! -d "$MDHT_LOCATION" ]; then
   echo Error MDHT Build Directory Setting for MDHT_LOCATION  does not exist - $MDHT_LOCATION
   exit -1
fi

# No Need to check these - They are created as part of the build process so 
# as long as the location exist - we are fin
echo MDHT_BUILDDIRECTORY=$MDHT_BUILDDIRECTORY

echo MDHT_REPODIRECTORY=$MDHT_REPODIRECTORY

echo MDHT_BUILD_XML=$MDHT_BUILD_XML

if [ ! -e "$MDHT_BUILD_XML" ]; then
   echo Error MDHT Build File Setting for MDHT_BUILD_XML does not exist - $MDHT_BUILD_XML
   exit -1
fi


echo CATEGORY_XML=$CATEGORY_XML
if [ ! -e "$CATEGORY_XML" ]; then
   echo Error MDHT Build File Setting for CATEGORY_XML does not exist - $CATEGORY_XML
   exit -1
fi

echo MDHT_BUILDTARGET=$MDHT_BUILDTARGET

echo "********************************************************************"



echo Building : $JAVA_HOME/java -cp $MDHT_LAUNCHER org.eclipse.core.launcher.Main -application org.eclipse.ant.core.antRunner -buildfile $MDHT_BUILD_XML -Dsvnuser=$svnuser -Dsvnpasswd=********* -DbaseLocation=$MDHT_ECLIPSE -Dbuilder=$MDHT_BUILDER -DbuildType=$MDHT_BUILDTARGET -DbuildDirectory=${MDHT_BUILDDIRECTORY} -Drepodir=$MDHT_REPODIRECTORY -DANT_HOME=$ANT_HOME -Dmdhtcomponent=$MDHT_COMPONENT -DjavacDebugInfo=true 

$JAVA_HOME/java -cp $MDHT_LAUNCHER org.eclipse.core.launcher.Main -application org.eclipse.ant.core.antRunner -buildfile $MDHT_BUILD_XML -Dsvnuser=$svnuser -Dsvnpasswd=$svnpasswd -DbaseLocation=$MDHT_ECLIPSE -Dbuilder=$MDHT_BUILDER  -DbuildType=$MDHT_BUILDTARGET -DbuildDirectory=${MDHT_BUILDDIRECTORY} -Drepodir=$MDHT_REPODIRECTORY -DANT_HOME=$ANT_HOME -Dmdhtcomponent=$MDHT_COMPONENT -DjavacDebugInfo=true

echo Building : $JAVA_HOME/java  -jar $MDHT_LAUNCHER -application org.eclipse.equinox.p2.publisher.CategoryPublisher -metadataRepository file:$MDHT_REPODIRECTORY -categoryDefinition file:$CATEGORY_XML -DbuildType=$MDHT_BUILDTARGET

$JAVA_HOME/java  -jar $MDHT_LAUNCHER -application org.eclipse.equinox.p2.publisher.CategoryPublisher -metadataRepository file:$MDHT_REPODIRECTORY -categoryDefinition file:$CATEGORY_XML -Drepodir=$MDHT_REPODIRECTORY

