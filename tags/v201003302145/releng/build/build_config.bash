############ MDHT Build Defaults for assumed setup of basebuilder installation based on following directory structure
# $HOME/releng
# $HOME/releng/build - location of build files, script files, and the location where the script will be run
# $HOME/releng/org.eclipse.releng.basebuilder - location of pde application downloaded

# JAVA_HOME - /usr/bin - is atypical location for installed java on linux machines
if [ "x" == "x$JAVA_HOME" ]; then JAVA_HOME=/usr/bin; fi

# ANT_HOME - /usr/share/ant - is atypical location for installed java on linux machines
if [ "x" == "x$ANT_HOME" ]; then ANT_HOME=/usr/share/ant; fi

# Location of eclipse PDE Installation - PDE build application - relative path
if [ "x" == "x$MDHT_PDELOCATION" ]; then MDHT_PDELOCATION=../org.eclipse.releng.basebuilder; fi

# Location of eclipse PDE Headless builder application
if [ "x" == "x$MDHT_LAUNCHER" ]; then MDHT_LAUNCHER=$MDHT_PDELOCATION/plugins/org.eclipse.equinox.launcher.jar; fi

# Location of all the installed build files used by the PDE headless build, build.properties and customTargets.xml
if [ "x" == "x$MDHT_BUILDER" ]; then MDHT_BUILDER=$PWD; fi

# Location of required eclipse plugins for build - There is not reall good default for this value, so it is a required environment variable for the time being
# if [ "x" == "x$MDHT_ECLIPSE" ]; then MDHT_ECLIPSE=/opt/IBM/SDPShared; fi

# Root Directory for both the Build (src files) and the eventual Repository
if [ "x" == "x$MDHT_LOCATION" ]; then MDHT_LOCATION=$PWD; fi

# src location
if [ "x" == "x$MDHT_BUILDDIRECTORY" ]; then MDHT_BUILDDIRECTORY=$MDHT_LOCATION/src; fi

# Repository/Update Site location
if [ "x" == "x$MDHT_REPODIRECTORY" ]; then MDHT_REPODIRECTORY=$MDHT_LOCATION/repo; fi

# MDHT Ant Build File
if [ "x" == "x$MDHT_BUILD_XML" ]; then MDHT_BUILD_XML=$MDHT_BUILDER/build.xml; fi

# Path to P2 category definitions used to create teh P2 update site
if [ "x" == "x$CATEGORY_XML" ]; then CATEGORY_XML=$MDHT_BUILDER/category.xml; fi

# Build Target - N-Nightly; I-Integration; etc
if [ "x" == "x$MDHT_BUILDTARGET" ]; then MDHT_BUILDTARGET=N; fi


# Build Target - N-Nightly; I-Integration; etc
if [ "x" == "x$MDHT_COMPONENT" ]; then MDHT_COMPONENT=ALL; fi




