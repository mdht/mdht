#!/bin/sh
# Generated file, do not edit manually"
echo "NOTE: The startcmd.sh has been deprecated, use the 'dita' command instead."

realpath() {
  case $1 in
    /*) echo "$1" ;;
    *) echo "$PWD/${1#./}" ;;
  esac
}

if [ "${DITA_HOME:+1}" = "1" ] && [ -e "$DITA_HOME" ]; then
  export DITA_DIR="$(realpath "$DITA_HOME")"
else #elif [ "${DITA_HOME:+1}" != "1" ]; then
  export DITA_DIR="$(dirname "$(realpath "$0")")"
fi

if [ -f "$DITA_DIR"/bin/ant ] && [ ! -x "$DITA_DIR"/bin/ant ]; then
  chmod +x "$DITA_DIR"/bin/ant
fi

export ANT_OPTS="-Xmx512m $ANT_OPTS"
export ANT_OPTS="$ANT_OPTS -Djavax.xml.transform.TransformerFactory=net.sf.saxon.TransformerFactoryImpl"
export ANT_HOME="$DITA_DIR"
export PATH="$DITA_DIR"/bin:"$PATH"

NEW_CLASSPATH="$DITA_DIR/lib:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/lib/ant-apache-resolver-1.9.4.jar:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/lib/ant-launcher.jar:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/lib/ant.jar:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/lib/commons-codec-1.9.jar:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/lib/commons-io-2.4.jar:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/lib/dost-configuration.jar:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/lib/dost.jar:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/lib/guava-19.0.jar:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/lib/icu4j-54.1.jar:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/lib/saxon-9.1.0.8-dom.jar:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/lib/saxon-9.1.0.8.jar:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/lib/xercesImpl-2.11.0.jar:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/lib/xml-apis-1.4.01.jar:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/lib/xml-resolver-1.2.jar:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/plugins/org.dita.odt/lib/odt.jar:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/plugins/org.dita.pdf2/lib/fo.jar:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/plugins/org.dita.pdf2.axf/lib/axf.jar:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/plugins/org.dita.pdf2.xep/lib/xep.jar:$NEW_CLASSPATH"
NEW_CLASSPATH="$DITA_DIR/plugins/org.dita.wordrtf/lib/wordrtf.jar:$NEW_CLASSPATH"
if test -n "$CLASSPATH"; then
  export CLASSPATH="$NEW_CLASSPATH":"$CLASSPATH"
else
  export CLASSPATH="$NEW_CLASSPATH"
fi

cd "$DITA_DIR"
"$SHELL"
