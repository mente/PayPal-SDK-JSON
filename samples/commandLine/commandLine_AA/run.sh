#!/bin/sh


PROGRAM_NAME=SampleApp.java

LIB=../../../lib
THE_CLASSPATH=${LIB}/paypal_platform_base_AA.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/paypal_platform_stubs_AA.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/paypal_platform_samples.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/jaxb-api.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/jaxws-api.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/httpclient-4.0.1.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/httpcore-4.0.1.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/commons-logging-1.0.4.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/woodstox.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/jaxws-rt.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/jaxb-impl.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/jaxws-tools.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/mimepull.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/resolver.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/saaj-api.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/saaj-impl.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/stax-ex.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/activation.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/FastInfoset.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/httpmime-4.0.1.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/jaxb-xjc.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/jsr173_api.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/jsr181-api.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/jsr250-api.jar
THE_CLASSPATH=${THE_CLASSPATH}:${LIB}/streambuffer.jar

echo Compiling SampleApp.java ...
javac -classpath ".:${THE_CLASSPATH}" -encoding UTF-8 $PROGRAM_NAME

echo Running SampleApp.java ...
java -classpath ".:${THE_CLASSPATH}" -Djava.util.logging.config.file=SDKlogging.properties SampleApp

if [ $? -eq 0 ]
then
  echo "compile worked!"