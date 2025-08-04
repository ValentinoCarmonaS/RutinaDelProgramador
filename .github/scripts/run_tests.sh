#!/bin/bash

# Script para ejecutar todos los tests en la carpeta test/
# Funciona automáticamente con cualquier archivo .java que se agregue

echo "🚀 Ejecutando todos los tests..."
echo "=================================="

# Colores para output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

# Variables
TEST_DIR="test"
SRC_DIRS="ejercicios"
LIB_DIR="lib"
CLASSPATH=".:$LIB_DIR/*"
TEMP_DIR="temp_classes"

# Verificar que existe el directorio lib con las dependencias
if [ ! -d "$LIB_DIR" ]; then
    echo -e "${RED}❌ No se encontró el directorio $LIB_DIR${NC}"
    exit 1
fi

echo -e "${GREEN}✅ Usando librerías en $LIB_DIR/${NC}"

# Crear directorio temporal para clases compiladas
mkdir -p $TEMP_DIR

# Función para limpiar al salir
cleanup() {
    rm -rf $TEMP_DIR
}
trap cleanup EXIT

echo "📦 Compilando código fuente..."

# Compilar todas las clases fuente primero
find $SRC_DIRS -name "*.java" -exec javac -cp "$CLASSPATH" -d $TEMP_DIR {} +

if [ $? -ne 0 ]; then
    echo -e "${RED}❌ Error compilando código fuente${NC}"
    exit 1
fi

echo "📦 Compilando tests..."

# Compilar todos los tests
find $TEST_DIR -name "*.java" -exec javac -cp "$CLASSPATH:$TEMP_DIR" -d $TEMP_DIR {} +

if [ $? -ne 0 ]; then
    echo -e "${RED}❌ Error compilando tests${NC}"
    exit 1
fi

echo "🧪 Ejecutando tests..."
echo "=================================="

# Encontrar y ejecutar todas las clases de test
test_classes=$(find $TEMP_DIR/test -name "*.class" | sed 's|'$TEMP_DIR'/||g' | sed 's|/|.|g' | sed 's|\.class||g')

total_tests=0
passed_tests=0
failed_tests=0

for test_class in $test_classes; do
    echo -e "\n${YELLOW}🔍 Ejecutando: $test_class${NC}"
    echo "--------------------------------"
    
    java -cp "$CLASSPATH:$TEMP_DIR" org.junit.runner.JUnitCore $test_class
    
    if [ $? -eq 0 ]; then
        echo -e "${GREEN}✅ $test_class - PASSED${NC}"
        ((passed_tests++))
    else
        echo -e "${RED}❌ $test_class - FAILED${NC}"
        ((failed_tests++))
    fi
    ((total_tests++))
done

echo "=================================="
echo "📊 Resumen de Tests:"
echo "   Total: $total_tests"
echo -e "   ${GREEN}Pasaron: $passed_tests${NC}"
echo -e "   ${RED}Fallaron: $failed_tests${NC}"
echo "total_tests=$total_tests" >> $GITHUB_ENV

if [ $failed_tests -eq 0 ]; then
    echo -e "\n${GREEN}Todo OK${NC}"
    exit 0
else
    echo -e "\n${RED}💥 Algunos tests fallaron${NC}"
    exit 1
fi