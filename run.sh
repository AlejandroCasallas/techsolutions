#!/bin/bash

echo "========================================"
echo "   TECHSOLUTIONS - Sistema Empresarial"
echo "========================================"
echo "Compilando..."

cd src

# Compilar todas las clases Java
javac -cp . Main.java Dependencias/*.java Dependencias/Actores/*.java

if [ $? -ne 0 ]; then
    echo "Error en compilación"
    exit 1
fi

echo "Ejecutando sistema..."
echo ""

# Ejecutar el programa principal
java -cp . Main