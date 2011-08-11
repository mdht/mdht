REM  This file is part of the DITA Open Toolkit project hosted on 
REM  Sourceforge.net. See the accompanying license.txt file for 
REM  applicable licenses.
REM  (c) Copyright IBM Corp. 2006 All Rights Reserved.

REM Get the absolute path of DITAOT's home directory
set DITA_DIR=%~dp0

REM Set environment variables
set ANT_OPTS=-Xmx512m %ANT_OPTS%
set ANT_OPTS=%ANT_OPTS% -Djavax.xml.transform.TransformerFactory=net.sf.saxon.TransformerFactoryImpl
set ANT_HOME=%DITA_DIR%tools\ant
set PATH=%DITA_DIR%tools\ant\bin;%PATH%
set CLASSPATH=%DITA_DIR%lib;%DITA_DIR%lib\dost.jar;%DITA_DIR%lib\commons-codec-1.4.jar;%DITA_DIR%lib\dost.jar;%DITA_DIR%lib\resolver.jar;%DITA_DIR%lib\icu4j.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%lib\saxon\saxon9.jar;%DITA_DIR%lib\saxon\saxon9-dom.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%lib\saxon\saxon9-dom4j.jar;%DITA_DIR%lib\saxon\saxon9-jdom.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%lib\saxon\saxon9-s9api.jar;%DITA_DIR%lib\saxon\saxon9-sql.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%lib\saxon\saxon9-xom.jar;%DITA_DIR%lib\saxon\saxon9-xpath.jar;%DITA_DIR%lib\saxon\saxon9-xqj.jar;%CLASSPATH%
start "DITA-OT" cmd.exe
