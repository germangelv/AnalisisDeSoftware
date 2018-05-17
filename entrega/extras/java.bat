@ECHO OFF
ECHO "Instalando Java, espere..."
IF %PROCESSOR_ARCHITECTURE%==AMD64 (
	start/wait extras\jre-8u111-windows-x64.exe /s
)
IF %PROCESSOR_ARCHITECTURE%==x86 (
	start/wait extras\jre-8u111-windows-i586.exe /s 
)
EXIT


