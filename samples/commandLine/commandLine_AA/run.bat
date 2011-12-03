@echo off

set PAYPALLIB=../../../lib

set CLASSPATH=.
set CLASSPATH=%CLASSPATH%;%PAYPALLIB%
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\paypal_platform_base_AA.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\paypal_platform_stubs_AA.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\paypal_platform_samples.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\jaxb-api.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\jaxws-api.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\httpclient-4.0.1.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\httpcore-4.0.1.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\commons-logging-1.0.4.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\woodstox.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\jaxws-rt.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\jaxb-impl.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\jaxws-tools.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\mimepull.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\resolver.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\saaj-api.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\saaj-impl.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\stax-ex.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\activation.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\FastInfoset.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\httpmime-4.0.1.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\jaxb-xjc.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\jsr173_api.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\jsr181-api.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\jsr250-api.jar
SET CLASSPATH=%CLASSPATH%;%PAYPALLIB%\streambuffer.jar



echo Compiling SampleApp.java ...
javac -classpath "%CLASSPATH%" -encoding UTF-8 SampleApp.java

echo Running AdaptiveAccounts Tests ...

REM use (remove REM) the following line to specify custom logging.properties file to be used for logging

java  -classpath "%CLASSPATH%" -Djava.util.logging.config.file=SDKlogging.properties SampleApp

REM java  -classpath "%CLASSPATH%"  SampleApp

set CLASSPATH=