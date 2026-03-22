# Laboratorio 1: Análisis Empírico y Teórico de Algoritmos

**Universidad:** Universidad Diego Portales 
**Autores:** Víctor Barrera y Jesus Briceño  
**Fecha:** 21 de Marzo del 2026 

## Descripción del Proyecto
Este repositorio contiene la solución al Laboratorio 1 de la asignatura Estructuras de Datos y Algoritmos. El proyecto consiste en realizar un estudio completo de complejidad temporal (tiempo de ejecución) de tres soluciones algorítmicas distintas para el problema "Diferencias repetidas".

El ciclo de análisis abarca:
1. Medir los tiempos de ejecución mediante un análisis empírico automatizado.
2. Analizar el orden de crecimiento de cada método utilizando la notación Big-O (análisis teórico).
3. Comparar y discutir si el modelo matemático predice adecuadamente los resultados observados en los experimentos.

## Estructura del Repositorio
Para cumplir con los entregables del laboratorio, el proyecto se divide en los siguientes archivos:

* `Result.java`: Archivo principal que contiene los tres métodos de búsqueda originales (`cuentaPares`, `cuentaPares2`, `cuentaPares3`). Incluye el generador de instancias aleatorias y el sistema de medición de tiempos que exporta los resultados. Siguiendo las reglas, los métodos algorítmicos no fueron modificados.
* `*.csv`: Conjunto de 6 archivos de datos generados para los tamaños de instancia n = 32, 64, 128, 256, 512, 1024.
* `analisis.xlsx`: Archivo Excel que contiene el análisis estadístico de los microdatos medidos, histogramas por cada tamaño, cálculos de ratios y un gráfico log-log.
* `Informe.pdf`: Documento final que documenta todo el proyecto. Incluye la explicación del diseño del software, los desafíos enfrentados, la justificación de la complejidad en Big-O y las conclusiones.
