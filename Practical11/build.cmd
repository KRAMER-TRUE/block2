@echo off
setlocal
pushd "%~dp0"
if errorlevel 1 exit /b 1
set "PROJECT_JDK=%~1"
if not defined PROJECT_JDK set "PROJECT_JDK=%JAVA_HOME%"
set "PROJECT_COMPILER=javac.exe"
if defined PROJECT_JDK set "PROJECT_COMPILER=%PROJECT_JDK%\bin\javac.exe"
if not exist "build\classes" mkdir "build\classes"
if errorlevel 1 goto failed
"%PROJECT_COMPILER%" --release 21 -encoding UTF-8 -d "build\classes" @sources.txt
set "PROJECT_RESULT=%ERRORLEVEL%"
popd
exit /b %PROJECT_RESULT%
:failed
popd
exit /b 1
