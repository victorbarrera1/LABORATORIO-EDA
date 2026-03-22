# [cite_start]Laboratorio 1: Análisis Empírico y Teórico de Algoritmos [cite: 4, 5]

[cite_start]**Universidad:** Universidad Diego Portales[cite: 3]  
[cite_start]**Asignatura:** Estructuras de Datos y Algoritmos (2026-1) [cite: 7, 8]  
[cite_start]**Problema:** Diferencias repetidas [cite: 6]  
**Autores:** Víctor Barrera y Jesus Briceño  

## Descripción del Proyecto
Este repositorio contiene la solución al Laboratorio 1 de la asignatura Estructuras de Datos y Algoritmos. [cite_start]El proyecto consiste en realizar un estudio completo de complejidad temporal de tres soluciones algorítmicas distintas para el problema "Diferencias repetidas"[cite: 16].

El ciclo de análisis abarca:
1. [cite_start]Medir los tiempos de ejecución mediante un análisis empírico automatizado[cite: 18].
2. [cite_start]Analizar el orden de crecimiento de cada método utilizando la notación Big-O (análisis teórico)[cite: 19].
3. [cite_start]Comparar y discutir si el modelo matemático predice adecuadamente los resultados observados en los experimentos[cite: 20].

## Estructura del Repositorio
[cite_start]Para cumplir con los entregables del laboratorio, el proyecto se divide en los siguientes archivos[cite: 190, 191]:

* [cite_start]`Result.java`: Archivo principal que contiene los tres métodos de búsqueda originales (`cuentaPares`, `cuentaPares2`, `cuentaPares3`) [cite: 46-49]. [cite_start]Incluye el generador de instancias aleatorias y el sistema de medición de tiempos que exporta los resultados[cite: 64, 66, 67]. [cite_start]Siguiendo las reglas, los métodos algorítmicos no fueron modificados[cite: 51].
* [cite_start]`*.csv`: Conjunto de 6 archivos de datos generados para los tamaños de instancia $n = 32, 64, 128, 256, 512, 1024$ ($2^5$ a $2^{10}$)[cite: 78, 79, 94].
* [cite_start]`analisis.xlsx`: Archivo Excel que contiene el análisis estadístico de los microdatos medidos, histogramas por cada tamaño, cálculos de ratios y un gráfico log-log[cite: 114, 115, 122, 129, 133].
* [cite_start]`Informe.pdf`: Documento final que documenta todo el proyecto[cite: 158]. [cite_start]Incluye la explicación del diseño del software, los desafíos enfrentados, la justificación de la complejidad en Big-O y las conclusiones[cite: 161, 168, 171, 182, 186].

## Requisitos y Dependencias
[cite_start]El programa Java reutiliza el código del texto guía *Algorithms* de Sedgewick y Wayne[cite: 103]. Para compilar y ejecutar, es necesario contar con:
* Java Development Kit (JDK).
* [cite_start]La librería `algs4.jar` en la misma carpeta que el código fuente para acceder a las clases `StdRandom`, `StopwatchCPU` y `Out`[cite: 104, 107, 108].

## Cómo compilar y ejecutar (Mac/Linux)
Abre una terminal en el directorio del proyecto y ejecuta los siguientes comandos para enlazar la librería externa:

**1. Compilar:**
```bash
javac -cp .:algs4.jar Result.java