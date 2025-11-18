@echo off
echo ========================================
echo    TECHSOLUTIONS - Sistema Empresarial
echo ========================================
echo Compilando...

cd src
javac -cp . Main.java Dependencias/*.java Dependencias/Actores/*.java

if %errorlevel% neq 0 (
    echo Error en compilacion
    pause
    exit /b 1
)

echo Ejecutando sistema...
echo.
java -cp . Main

pause