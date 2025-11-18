@echo off
echo Compilando TECHSOLUTIONS...
cd src
javac -cp . Main.java Dependencias/*.java Dependencias/Actores/*.java
echo Compilacion completada.
pause