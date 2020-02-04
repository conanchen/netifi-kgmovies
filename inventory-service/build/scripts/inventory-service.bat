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
@rem  inventory-service startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and INVENTORY_SERVICE_OPTS to pass JVM options to this script.
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

set CLASSPATH=%APP_HOME%\lib\inventory-service-0.1.0.jar;%APP_HOME%\lib\netifi-spring-boot-starter-1.6.9.jar;%APP_HOME%\lib\netifi-spring-boot-autoconfigure-1.6.9.jar;%APP_HOME%\lib\netifi-spring-core-1.6.9.jar;%APP_HOME%\lib\spring-boot-starter-validation-2.1.5.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-2.1.5.RELEASE.jar;%APP_HOME%\lib\netifi-broker-client-1.6.9.jar;%APP_HOME%\lib\netifi-discovery-1.6.9.jar;%APP_HOME%\lib\netifi-broker-frames-1.6.9.jar;%APP_HOME%\lib\rsocket-rpc-core-0.2.18.jar;%APP_HOME%\lib\rsocket-transport-netty-0.12.2-RC4.jar;%APP_HOME%\lib\rsocket-core-0.12.2-RC4.jar;%APP_HOME%\lib\spring-boot-starter-logging-2.1.5.RELEASE.jar;%APP_HOME%\lib\logback-classic-1.2.3.jar;%APP_HOME%\lib\log4j-to-slf4j-2.11.2.jar;%APP_HOME%\lib\jul-to-slf4j-1.7.26.jar;%APP_HOME%\lib\slf4j-api-1.7.26.jar;%APP_HOME%\lib\spring-boot-autoconfigure-2.1.5.RELEASE.jar;%APP_HOME%\lib\opentracing-api-0.31.0.jar;%APP_HOME%\lib\micrometer-core-1.1.4.jar;%APP_HOME%\lib\netifi-broker-auth-1.6.9.jar;%APP_HOME%\lib\netifi-common-1.6.9.jar;%APP_HOME%\lib\spring-boot-2.1.5.RELEASE.jar;%APP_HOME%\lib\spring-context-5.1.7.RELEASE.jar;%APP_HOME%\lib\spring-aop-5.1.7.RELEASE.jar;%APP_HOME%\lib\spring-beans-5.1.7.RELEASE.jar;%APP_HOME%\lib\spring-expression-5.1.7.RELEASE.jar;%APP_HOME%\lib\spring-core-5.1.7.RELEASE.jar;%APP_HOME%\lib\hibernate-validator-6.0.16.Final.jar;%APP_HOME%\lib\validation-api-2.0.1.Final.jar;%APP_HOME%\lib\javax.annotation-api-1.3.2.jar;%APP_HOME%\lib\snakeyaml-1.23.jar;%APP_HOME%\lib\protobuf-java-3.6.1.jar;%APP_HOME%\lib\config-1.3.3.jar;%APP_HOME%\lib\netty-tcnative-2.0.25.Final-linux-x86_64.jar;%APP_HOME%\lib\reactor-netty-0.8.8.RELEASE.jar;%APP_HOME%\lib\reactor-core-3.2.9.RELEASE.jar;%APP_HOME%\lib\tomcat-embed-el-9.0.19.jar;%APP_HOME%\lib\HdrHistogram-2.1.9.jar;%APP_HOME%\lib\LatencyUtils-2.0.3.jar;%APP_HOME%\lib\spring-jcl-5.1.7.RELEASE.jar;%APP_HOME%\lib\netty-codec-http2-4.1.36.Final.jar;%APP_HOME%\lib\netty-handler-proxy-4.1.36.Final.jar;%APP_HOME%\lib\netty-codec-http-4.1.36.Final.jar;%APP_HOME%\lib\netty-handler-4.1.36.Final.jar;%APP_HOME%\lib\netty-transport-native-epoll-4.1.36.Final-linux-x86_64.jar;%APP_HOME%\lib\netty-codec-socks-4.1.36.Final.jar;%APP_HOME%\lib\netty-codec-4.1.36.Final.jar;%APP_HOME%\lib\netty-transport-native-unix-common-4.1.36.Final.jar;%APP_HOME%\lib\netty-transport-4.1.36.Final.jar;%APP_HOME%\lib\netty-buffer-4.1.36.Final.jar;%APP_HOME%\lib\javax.inject-1.jar;%APP_HOME%\lib\reactive-streams-1.0.2.jar;%APP_HOME%\lib\jboss-logging-3.3.2.Final.jar;%APP_HOME%\lib\classmate-1.4.0.jar;%APP_HOME%\lib\logback-core-1.2.3.jar;%APP_HOME%\lib\log4j-api-2.11.2.jar;%APP_HOME%\lib\netty-resolver-4.1.36.Final.jar;%APP_HOME%\lib\netty-common-4.1.36.Final.jar

@rem Execute inventory-service
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %INVENTORY_SERVICE_OPTS%  -classpath "%CLASSPATH%" acmeshoes.service.inventory.Application %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable INVENTORY_SERVICE_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%INVENTORY_SERVICE_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
