set REPOSITORY_PATH=D:\JAVA\Maven\apache-maven-3.6.1-bin\repository
rem 正在搜索...
for /f "delims=" %%i in ('dir /b /s "%REPOSITORY_PATH%\*lastUpdated*"') do (
    del /s /q %%i
)
for /f "delims=" %%i in ('dir /b /s "%REPOSITORY_PATH%\*unknown*"') do (
    rd /s /q %%i
)
rem 搜索完成
pause