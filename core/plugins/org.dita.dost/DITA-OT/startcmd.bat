@echo off
REM Generated file, do not edit manually
echo "NOTE: The startcmd.bat has been deprecated, use the dita.bat command instead."
pause

REM Get the absolute path of DITAOT's home directory
set DITA_DIR=%~dp0

REM Set environment variables
set ANT_OPTS=-Xmx512m %ANT_OPTS%
set ANT_OPTS=%ANT_OPTS% -Djavax.xml.transform.TransformerFactory=net.sf.saxon.TransformerFactoryImpl
set ANT_HOME=%DITA_DIR%
set PATH=%DITA_DIR%\bin;%PATH%
set CLASSPATH=%DITA_DIR%lib;%CLASSPATH%
set CLASSPATH=%DITA_DIR%lib\ant-apache-resolver-1.9.4.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%lib\ant-launcher.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%lib\ant.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%lib\commons-codec-1.9.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%lib\commons-io-2.4.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%lib\dost-configuration.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%lib\dost.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%lib\guava-19.0.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%lib\icu4j-54.1.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%lib\saxon-9.1.0.8-dom.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%lib\saxon-9.1.0.8.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%lib\xercesImpl-2.11.0.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%lib\xml-apis-1.4.01.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%lib\xml-resolver-1.2.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%plugins\org.dita.odt\lib\odt.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%plugins\org.dita.pdf2\lib\fo.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%plugins\org.dita.pdf2.axf\lib\axf.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%plugins\org.dita.pdf2.xep\lib\xep.jar;%CLASSPATH%
set CLASSPATH=%DITA_DIR%plugins\org.dita.wordrtf\lib\wordrtf.jar;%CLASSPATH%
start "DITA-OT" cmd.exe
