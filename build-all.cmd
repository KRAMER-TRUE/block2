@echo off
setlocal
for %%P in (8 9 10 11 13 14) do (
  echo Practical%%P
  call "%~dp0Practical%%P\build.cmd" "%~1"
  if errorlevel 1 exit /b 1
)
exit /b 0
