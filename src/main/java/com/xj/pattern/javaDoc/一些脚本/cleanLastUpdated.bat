set REPOSITORY_PATH=D:\JAVA\Maven\apache-maven-3.6.1-bin\repository
rem ��������...
for /f "delims=" %%i in ('dir /b /s "%REPOSITORY_PATH%\*lastUpdated*"') do (
    del /s /q %%i
)
for /f "delims=" %%i in ('dir /b /s "%REPOSITORY_PATH%\*unknown*"') do (
    rd /s /q %%i
)
rem �������
pause