#!/bin/bash
echo "Compilando TECHSOLUTIONS..."
cd src
javac -cp . Main.java Dependencias/*.java Dependencias/Actores/*.java
echo "Compilación completada."