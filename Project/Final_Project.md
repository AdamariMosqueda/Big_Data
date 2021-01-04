<div align="center">

![Logos](https://i.imgur.com/DKIVS3c.png)

## TECNOLÓGICO NACIONAL DE MÉXICO | INSTITUTO TECNOLÓGICO DE TIJUANA

SUBDIRECCIÓN ACADÉMICA
 
DEPARTAMENTO DE SISTEMAS Y COMPUTACIÓN
 
SEMESTRE SEPTIEMBRE 2020 – ENERO 2021

INGENIERÍA INFORMÁTICA


### PROFESSOR

JOSÉ CHRISTIAN ROMERO HERNÁNDEZ

### CLASS

BIG DATA 

### FINAL PROJECT

### TEAM

GUTIERREZ LUNA YURIDIA NAYELI 16212353

MOSQUEDA ESPINOZA ADAMARI ANTONIA 16212363


**TIJUANA, BAJA CALIFORNIA, JANUARY 2021** 
</div>


# INDEX
- [INDEX](#index)
- [INTRODUCTION](#introduction)
- [THEORETICAL FRAMEWORK](#theoretical-framework)
  - [Support Vector Machine](#support-vector-machine)
  - [Decision Three](#decision-three)
  - [Logistic Regression](#logistic-regression)
  - [Multilayer Perceptron](#multilayer-perceptron)
- [IMPLEMENTATION](#implementation)
  - [SVM](#svm)
- [RESULTS](#results)
- [CONCLUSIONS](#conclusions)
- [REFERENCES](#references)

# INTRODUCTION
# THEORETICAL FRAMEWORK
Machine learning (ML) is a subset of artificial intelligence, which build a mathematical model based on sample data, known as “training data,” in order to make predictions or decisions without being explicitly programmed to perform the task.

> “A computer program is said to learn from experience E with respect to some class of tasks T and performance measure P if its performance at tasks in T, as measured by P, improves with experience E” — Mitchell T.M

In machine learning, neural networks, support vector machines, and evolutionary computation, we are usually given a training set and a test set. By the training set, it will mean the union of the labeled set and the unlabeled set of examples available to machine learners. In comparison, test set consists of examples never seen before.

## Support Vector Machine
Una máquina de vectores de soporte (SVM) es un algoritmo de aprendizaje supervisado que se puede emplear para clasificación binaria o regresión. Las máquinas de vectores de soporte son muy populares en aplicaciones como el procesamiento del lenguaje natural, el habla, el reconocimiento de imágenes y la visión artificial.

Una máquina de vectores de soporte construye un hiperplano óptimo en forma de superficie de decisión, de modo que el margen de separación entre las dos clases en los datos se amplía al máximo. Los vectores de soporte hacen referencia a un pequeño subconjunto de las observaciones de entrenamiento que se utilizan como soporte para la ubicación óptima de la superficie de decisión.

Las máquinas de vectores de soporte pertenecen a una clase de algoritmos de Machine Learning denominados métodos kernel y también se conocen como máquinas kernel.

El entrenamiento de una máquina de vectores de soporte consta de dos fases:
1. Transformar los predictores (datos de entrada) en un espacio de características altamente dimensional. En esta fase es suficiente con especificar el kernel; los datos nunca se transforman explícitamente al espacio de características. Este proceso se conoce comúnmente como el truco kernel.
2. Resolver un problema de optimización cuadrática que se ajuste a un hiperplano óptimo para clasificar las características transformadas en dos clases. El número de características transformadas está determinado por el número de vectores de soporte.


## Decision Three

## Logistic Regression

## Multilayer Perceptron

# IMPLEMENTATION
Para este proyecto usamos Spark porque tiene muchos beneficios:

1. Velocidad: Spark puede ser 100 veces más rápido que Hadoop para el procesamiento de datos a gran escala al explotar la computación en memoria y otras optimizaciones. También es rápido cuando los datos se almacenan en el disco.

2. Facilidad de uso: Opera en grandes conjuntos de datos, esto incluye una colección de más de 100 operadores para transformar datos y APIs de marcos de datos familiares para manipular datos semiestructurados. 

3. Un motor unificado: Viene empaquetado con bibliotecas que incluyen soporte para consultas SQL, transmisión de datos, aprendizaje automático y procesamiento de gráficos. 

Spark provee API para Python, Java y Scala, nosotras elegimos Scala porque es un lenguaje funcional que permite implementar el paradigma MapReduce de manera sencilla y rápida. Scala trabaja sobre la JVM, lo que nos permite disponer de las múltiples librerías creadas para Java.

Los datos utilizados son sobre un banco que se pueden encontrar [aquí](https://archive.ics.uci.edu/ml/datasets/Bank+Marketing), esta información es sobre campañas de marketing (llamadas telefónicoas) de un banco portugués. 

## SVM
```Scala
import org.apache.spark.ml.classification.LinearSVC
import org.apache.spark.ml.feature.StringIndexer
import org.apache.spark.ml.PipelineStage
import org.apache.spark.ml.{Pipeline, PipelineModel}
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
```
Hicimos la importación de varias librerias, solo una se necesita para SVM pero los datos ofrecidos incluyen valores string, por lo que se uriliza StringIndexer para transformar, pero hay muchas columnas por lo que se usa pipeline y con VectorAssembler se juntan los features.
```Scala
val data  = spark.read.option("header","true").option("delimiter", ";").format("csv").load("C:/bank-full.csv")
val data2 = data.select("age", "job", "marital", "education", "balance", "housing", "loan","campaign", "previous", "poutcome", "y")
data2.show()
```
No toda la información que viene en el CSV se necesita, por lo que seleccionamos las columnas con las que realmente trabajamos.

```Scala
val featureCol = data2.columns
val indexers = featureCol.map { colName =>
  new StringIndexer().setInputCol(colName).setOutputCol(colName + "Index")
}
```
Creamos la variable featureCol que contiene los nombres de las variables y creamos un mapeo con este para la variable indexer, usamos colName que hace referencia a cada valor de featureCol y creamos un nuevo StringIndexer, donde le damos colName y el nuevo nombres es una concatenación del nombre original e Index.

```Scala
val pipeline = new Pipeline().setStages(indexers)      
val newDF = pipeline.fit(data2).transform(data2)
```
Ahora para la transformación usamos Pipeline, como son muchos valores no se puede crear la transformación de forma directa, para ellos pipeline nos ayuda con la cadena de procesos, donde le damos todo lo de indexers, y creamos el dataframe que transforma data2

```Scala
val Features = (new VectorAssembler().setInputCols(Array ("ageIndex", "jobIndex", "maritalIndex", "educationIndex", "housingIndex","balanceIndex", "campaignIndex", "previousIndex", "loanIndex", "poutcomeIndex")).setOutputCol("features"))
val data3 = Features.transform (newDF)
val training = data3.select("features", "yIndex").withColumnRenamed("yIndex", "label")
```
Features va crear un VectorAssembler, donde se hace un arreglo con todas las columnas que necesitamos, hacemos la transformación y creamos training, donde va a seleccionar solo "features" y "yIndex" del dataframe transformado anteriormente, porque este contenía todas las columnas string y todas las columnas transformadas, usamos withColumnRenamed para cambiarle en nombre a "yIndex" que ahora será "label"

```Scala
val lsvc = new LinearSVC().setMaxIter(10).setRegParam(0.1)
val lsvcModel = lsvc.fit(training)
println(s"Coefficients: ${lsvcModel.coefficients} Intercept: ${lsvcModel.intercept}")
```
Ahora para SVM usamos training e imprimimos los Coefficients con Intercept

# RESULTS
Para obtener los resultados fue necesario hacer 10 pruebas para cada algoritmo de Machine Learning para ver si los resultados cambiaban o eran los mismos.

1. Suport Vector Machine

Las primeras 5 pruebas arrojaron los mismos resultados, se hicieron en diferentes días en la misma computadora, los resultados de ello fueron:
```Scala
Coefficients: [0.0012197828733809303,-0.003862246435555152,0.0,-0.023550433135035947,0.09743237045210347,-3.2106453441304507E-6,-0.04775942670569715,-0.010785376643656298,0.0026778775088146627,0.10328964513039898] 
Intercept: -1.0861190188568848
```
Las otras 5 pruebas se hicieron en una computadora distinta 

# CONCLUSIONS
# REFERENCES
[1] Zhang, X. D. (2020). Machine learning. In A Matrix Algebra Approach to Artificial Intelligence (pp. 223-440). Springer, Singapore.

[2] MathWorks (----) Máquina de vectores de soporte (SVM). From: https://la.mathworks.com/discovery/support-vector-machine.html

[3] Ilabaca, S. (----). Apache Spark. January, 2021, from Analytics Web Site: https://www.analytics10.com/que-es-apache-spark/