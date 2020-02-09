@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  gapi-gateway startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and GAPI_GATEWAY_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\gapi-gateway-0.1.0.jar;%APP_HOME%\lib\graphql-spring-boot-starter-6.0.1.jar;%APP_HOME%\lib\graphql-spring-boot-autoconfigure-6.0.1.jar;%APP_HOME%\lib\graphql-kickstart-spring-boot-starter-tools-6.0.1.jar;%APP_HOME%\lib\graphql-kickstart-spring-boot-autoconfigure-tools-6.0.1.jar;%APP_HOME%\lib\graphql-java-tools-5.7.1.jar;%APP_HOME%\lib\spring-boot-starter-data-mongodb-2.2.4.RELEASE.jar;%APP_HOME%\lib\spring-data-mongodb-2.2.4.RELEASE.jar;%APP_HOME%\lib\spring-data-commons-2.2.4.RELEASE.jar;%APP_HOME%\lib\altair-spring-boot-starter-6.0.1.jar;%APP_HOME%\lib\graphiql-spring-boot-starter-6.0.1.jar;%APP_HOME%\lib\mapstruct-1.3.0.Final.jar;%APP_HOME%\lib\spring-boot-starter-websocket-2.2.4.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-web-2.2.4.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-thymeleaf-2.2.4.RELEASE.jar;%APP_HOME%\lib\netifi-spring-boot-starter-1.6.9.jar;%APP_HOME%\lib\voyager-spring-boot-starter-6.0.1.jar;%APP_HOME%\lib\jackson-module-kotlin-2.10.2.jar;%APP_HOME%\lib\kotlin-reflect-1.3.61.jar;%APP_HOME%\lib\kotlinx-coroutines-jdk8-1.3.3.jar;%APP_HOME%\lib\kotlinx-coroutines-reactive-1.3.3.jar;%APP_HOME%\lib\kotlinx-coroutines-core-1.3.3.jar;%APP_HOME%\lib\kotlin-stdlib-1.3.61.jar;%APP_HOME%\lib\graphql-java-servlet-9.0.1.jar;%APP_HOME%\lib\graphql-java-kickstart-9.0.1.jar;%APP_HOME%\lib\graphql-java-13.0.jar;%APP_HOME%\lib\netifi-spring-boot-autoconfigure-1.6.9.jar;%APP_HOME%\lib\spring-boot-starter-validation-2.2.4.RELEASE.jar;%APP_HOME%\lib\hibernate-validator-6.0.18.Final.jar;%APP_HOME%\lib\classmate-1.5.1.jar;%APP_HOME%\lib\spring-boot-starter-json-2.2.4.RELEASE.jar;%APP_HOME%\lib\jackson-datatype-jdk8-2.10.2.jar;%APP_HOME%\lib\spring-boot-starter-actuator-2.2.4.RELEASE.jar;%APP_HOME%\lib\spring-boot-actuator-autoconfigure-2.2.4.RELEASE.jar;%APP_HOME%\lib\spring-boot-actuator-2.2.4.RELEASE.jar;%APP_HOME%\lib\jackson-datatype-jsr310-2.10.2.jar;%APP_HOME%\lib\jackson-module-parameter-names-2.10.2.jar;%APP_HOME%\lib\jackson-databind-2.10.2.jar;%APP_HOME%\lib\jackson-core-2.10.2.jar;%APP_HOME%\lib\reflectasm-1.11.9.jar;%APP_HOME%\lib\altair-spring-boot-autoconfigure-6.0.1.jar;%APP_HOME%\lib\graphiql-spring-boot-autoconfigure-6.0.1.jar;%APP_HOME%\lib\voyager-spring-boot-autoconfigure-6.0.1.jar;%APP_HOME%\lib\commons-text-1.1.jar;%APP_HOME%\lib\commons-lang3-3.9.jar;%APP_HOME%\lib\guava-26.0-jre.jar;%APP_HOME%\lib\thymeleaf-spring5-3.0.11.RELEASE.jar;%APP_HOME%\lib\thymeleaf-extras-java8time-3.0.4.RELEASE.jar;%APP_HOME%\lib\netifi-spring-core-1.6.9.jar;%APP_HOME%\lib\thymeleaf-3.0.11.RELEASE.jar;%APP_HOME%\lib\netifi-broker-client-1.6.9.jar;%APP_HOME%\lib\netifi-discovery-1.6.9.jar;%APP_HOME%\lib\spring-boot-starter-2.2.4.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-logging-2.2.4.RELEASE.jar;%APP_HOME%\lib\logback-classic-1.2.3.jar;%APP_HOME%\lib\log4j-to-slf4j-2.12.1.jar;%APP_HOME%\lib\jul-to-slf4j-1.7.30.jar;%APP_HOME%\lib\netifi-broker-frames-1.6.9.jar;%APP_HOME%\lib\rsocket-rpc-core-0.2.18.jar;%APP_HOME%\lib\rsocket-transport-netty-0.12.2-RC4.jar;%APP_HOME%\lib\rsocket-core-0.12.2-RC4.jar;%APP_HOME%\lib\slf4j-api-1.7.30.jar;%APP_HOME%\lib\mongodb-driver-3.11.2.jar;%APP_HOME%\lib\spring-webmvc-5.2.3.RELEASE.jar;%APP_HOME%\lib\spring-websocket-5.2.3.RELEASE.jar;%APP_HOME%\lib\spring-web-5.2.3.RELEASE.jar;%APP_HOME%\lib\spring-tx-5.2.3.RELEASE.jar;%APP_HOME%\lib\spring-boot-autoconfigure-2.2.4.RELEASE.jar;%APP_HOME%\lib\spring-boot-2.2.4.RELEASE.jar;%APP_HOME%\lib\spring-context-5.2.3.RELEASE.jar;%APP_HOME%\lib\spring-aop-5.2.3.RELEASE.jar;%APP_HOME%\lib\spring-messaging-5.2.3.RELEASE.jar;%APP_HOME%\lib\spring-beans-5.2.3.RELEASE.jar;%APP_HOME%\lib\spring-expression-5.2.3.RELEASE.jar;%APP_HOME%\lib\spring-core-5.2.3.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-tomcat-2.2.4.RELEASE.jar;%APP_HOME%\lib\kotlin-stdlib-common-1.3.61.jar;%APP_HOME%\lib\annotations-13.0.jar;%APP_HOME%\lib\reactor-netty-0.9.4.RELEASE.jar;%APP_HOME%\lib\reactor-core-3.3.2.RELEASE.jar;%APP_HOME%\lib\reactive-streams-1.0.3.jar;%APP_HOME%\lib\antlr4-runtime-4.7.2.jar;%APP_HOME%\lib\java-dataloader-2.1.1.jar;%APP_HOME%\lib\jackson-annotations-2.10.2.jar;%APP_HOME%\lib\jsr305-3.0.2.jar;%APP_HOME%\lib\checker-qual-2.5.2.jar;%APP_HOME%\lib\error_prone_annotations-2.1.3.jar;%APP_HOME%\lib\j2objc-annotations-1.1.jar;%APP_HOME%\lib\animal-sniffer-annotations-1.14.jar;%APP_HOME%\lib\jakarta.annotation-api-1.3.5.jar;%APP_HOME%\lib\snakeyaml-1.25.jar;%APP_HOME%\lib\mongodb-driver-core-3.11.2.jar;%APP_HOME%\lib\bson-3.11.2.jar;%APP_HOME%\lib\spring-jcl-5.2.3.RELEASE.jar;%APP_HOME%\lib\graphql-kickstart-spring-support-6.0.1.jar;%APP_HOME%\lib\tomcat-embed-websocket-9.0.30.jar;%APP_HOME%\lib\tomcat-embed-core-9.0.30.jar;%APP_HOME%\lib\tomcat-embed-el-9.0.30.jar;%APP_HOME%\lib\jakarta.validation-api-2.0.2.jar;%APP_HOME%\lib\opentracing-api-0.31.0.jar;%APP_HOME%\lib\micrometer-core-1.3.2.jar;%APP_HOME%\lib\netifi-broker-auth-1.6.9.jar;%APP_HOME%\lib\netifi-common-1.6.9.jar;%APP_HOME%\lib\validation-api-2.0.1.Final.jar;%APP_HOME%\lib\javax.servlet-api-4.0.1.jar;%APP_HOME%\lib\javax.websocket-api-1.1.jar;%APP_HOME%\lib\jboss-logging-3.4.1.Final.jar;%APP_HOME%\lib\attoparser-2.0.5.RELEASE.jar;%APP_HOME%\lib\unbescape-1.1.6.RELEASE.jar;%APP_HOME%\lib\protobuf-java-3.6.1.jar;%APP_HOME%\lib\config-1.3.3.jar;%APP_HOME%\lib\netty-tcnative-2.0.25.Final-linux-x86_64.jar;%APP_HOME%\lib\HdrHistogram-2.1.11.jar;%APP_HOME%\lib\LatencyUtils-2.0.3.jar;%APP_HOME%\lib\logback-core-1.2.3.jar;%APP_HOME%\lib\log4j-api-2.12.1.jar;%APP_HOME%\lib\netty-codec-http2-4.1.45.Final.jar;%APP_HOME%\lib\netty-handler-proxy-4.1.45.Final.jar;%APP_HOME%\lib\netty-codec-http-4.1.45.Final.jar;%APP_HOME%\lib\netty-handler-4.1.45.Final.jar;%APP_HOME%\lib\netty-transport-native-epoll-4.1.45.Final-linux-x86_64.jar;%APP_HOME%\lib\netty-codec-socks-4.1.45.Final.jar;%APP_HOME%\lib\netty-codec-4.1.45.Final.jar;%APP_HOME%\lib\netty-transport-native-unix-common-4.1.45.Final.jar;%APP_HOME%\lib\netty-transport-4.1.45.Final.jar;%APP_HOME%\lib\netty-buffer-4.1.45.Final.jar;%APP_HOME%\lib\javax.inject-1.jar;%APP_HOME%\lib\javax.annotation-api-1.3.2.jar;%APP_HOME%\lib\netty-resolver-4.1.45.Final.jar;%APP_HOME%\lib\netty-common-4.1.45.Final.jar

@rem Execute gapi-gateway
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %GAPI_GATEWAY_OPTS%  -classpath "%CLASSPATH%" io.github.GraphqlApplication %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable GAPI_GATEWAY_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%GAPI_GATEWAY_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
