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
  - [Decision Tree](#decision-tree)
  - [Logistic Regression](#logistic-regression)
  - [Multilayer Perceptron](#multilayer-perceptron)
- [IMPLEMENTATION](#implementation)
  - [SVM](#svm)
  - [Decision Tree](#decision-tree-1)
  - [Logistic Regression](#logistic-regression-1)
  - [Multilayer Perceptron](#multilayer-perceptron-1)
- [RESULTS](#results)
- [CONCLUSIONS](#conclusions)
- [REFERENCES](#references)

<div align="justify"> 

# INTRODUCTION
A lo largo del semestre hemos visto muchos temas interesantes claro que cada uno separado y con datos diferentes pero ahora es tiempo de poner a pruba alguno de los modelos que vimos.
Utilizando una misma BD vamos a utilizar los modelos de SVM, Logistic Regression, Decision Treey y Multilayer Perceptron para ver la diferencia entre estos y dar una conclusion de cual e estos modelos es el mejor (para nosotro) segun el rendimiento, el porcentaje de efectividad asi como el tiempo de respuesta de cada uno de esto.

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


## Decision Tree
Un Árbol de Decisión (o Árboles de Decisiones) es un método analítico que a través de una representación esquemática de las alternativas disponible facilita la toma de mejores decisiones, especialmente cuando existen riesgos, costos, beneficios y múltiples opciones. El nombre se deriva de la apariencia del modelo parecido a un árbol y su uso es amplio en el ámbito de la toma de decisiones bajo incertidumbre (Teoría de Decisiones) junto a otras herramientas como el Análisis del Punto de Equilibrio.
Los árboles de decisión son especialmente útiles cuando:
1.	Las alternativas o cursos de acción están bien definidas (por ejemplo: aceptar o rechazar una propuesta, aumentar o no la capacidad de producción, construir o no una nueva bodega, etc.)
2.	Las incertidumbres pueden ser cuantificadas (por ejemplo: probabilidad de éxito de una campaña publicitaria, probable efecto en ventas, probabilidad de pasar de etapas, etc.)
3.	Los objetivos están claros (por ejemplo: aumentar las ventas, maximizar utilidades, minimizar costos, etc.)

## Logistic Regression
Logistic regression is a popular method to predict a categorical response. It is a special case of Generalized Linear models that predicts the probability of the outcomes. In spark.ml logistic regression can be used to predict a binary outcome by using binomial logistic regression, or it can be used to predict a multiclass outcome by using multinomial logistic regression. Use the family parameter to select between these two algorithms, or leave it unset and Spark will infer the correct variant.

>Multinomial logistic regression can be used for binary classification by setting the family param to “multinomial”. It will produce two sets of coefficients and two intercepts.

>When fitting LogisticRegressionModel without intercept on dataset with constant nonzero column, Spark MLlib outputs zero coefficients for constant nonzero columns. This behavior is the same as R glmnet but different from LIBSVM.
## Multilayer Perceptron
Multilayer perceptron classifier (MLPC) is a classifier based on the feedforward artificial neural network. MLPC consists of multiple layers of nodes. Each layer is fully connected to the next layer in the network. Nodes in the input layer represent the input data. All other nodes map inputs to outputs by a linear combination of the inputs with the node’s weights `w` and bias `b` and applying an activation function. This can be written in matrix form for MLPC with `K+1` layers as follows:

> y(x)=fK(...f2(wT2f1(wT1x+b1)+b2)...+bK)

Nodes in intermediate layers use sigmoid (logistic) function:

> f(zi)=11+e−zi

Nodes in the output layer use softmax function:

> f(zi)=ezi∑Nk=1ezk

The number of nodes N in the output layer corresponds to the number of classes.

MLPC employs backpropagation for learning the model. We use the logistic loss function for optimization and L-BFGS as an optimization routine.

</div>

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
Hicimos la importación de varias librerias, solo una se necesita para SVM pero los datos ofrecidos incluyen valores string, por lo que se uriliza StringIndexer para transformar y con VectorAssembler se juntan los features.
```Scala
val data  = spark.read.option("header","true").option("inferSchema","true").option("delimiter", ";").format("csv").load("C:/bank-full.csv")
data.show()
```
Leemos el archivo csv, el delimitador será ; porque así se encuentran separados los datos en el archivo.
```Scala
val label = new StringIndexer().setInputCol("y").setOutputCol("label")
val labeltransform = label.fit(data).transform(data)
```
La columna y será nuestro label, pero esta tiene valores string por lo que usamos StringIndexer para tranformar estos datos a numéricos. Con Labeltransform hacemos un fit y transformamos data

```Scala
val assembler = new VectorAssembler().setInputCols (Array ("balance", "day", "duration", "pdays", "previous")).setOutputCol("features")
val data2 = assembler.transform(labeltransform)

val training = data2.select("features", "label")
```
El vector Assembler se utiliza para juntas varias columnas en un arreglo, este se usó para poder tener features, para ello agarramos las columnas con valores numéricos, transformamos labeltransform porque este ya tiene label y por último cramos training que solo contiene features y label.

```Scala
val lsvc = new LinearSVC().setMaxIter(10).setRegParam(0.1)
val lsvcModel = lsvc.fit(training)
println(s"Coefficients: ${lsvcModel.coefficients} Intercept: ${lsvcModel.intercept}")
```
Para SVM usamos training e imprimimos los Coefficients con Intercept

## Decision Tree
```Scala
import org.apache.spark.ml.classification.DecisionTreeClassificationModel
import org.apache.spark.ml.classification.DecisionTreeClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.StringIndexer
import org.apache.spark.ml.{Pipeline, PipelineModel}
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.feature.IndexToString
import org.apache.spark.ml.feature.VectorIndexer

val data  = spark.read.option("header","true").option("inferSchema","true").option("delimiter", ";").format("csv").load("C:/bank-full.csv")
val label = new StringIndexer().setInputCol("y").setOutputCol("label")
val labeltransform = label.fit(data).transform(data)
val assembler = new VectorAssembler().setInputCols (Array ("balance", "day", "duration", "pdays", "previous")).setOutputCol("features")
val data2 = assembler.transform(labeltransform)
val training = data2.select("features", "label")
```
Importamos las librerías necesarios y hacemos todo para tener el dataframe con el formato de features y label

```Scala
val labelIndexer = new StringIndexer().setInputCol("label").setOutputCol("indexedLabel").fit(training)
val featureIndexer = new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(4).fit(training)
```
Usamos StringIndexer para que label se convierte en indexedLabel y lo mismo hacemos con features, usando VectorIndexer y dándole un máximo de categoría de 4

```Scala
val Array(trainingData, testData) = training.randomSplit(Array(0.7, 0.3))
```
Creamos trainingData y testData, donde el primero va a contener el 70% de datos mientras el otro se queda con el 30, con randomsplit los datos de aplican a cada uno de forma aleatoria.

```Scala
val dt = new DecisionTreeClassifier().setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures")
val labelConverter = new IndexToString().setInputCol("prediction").setOutputCol("predictedLabel").setLabels(labelIndexer.labels)
val pipeline = new Pipeline().setStages(Array(labelIndexer, featureIndexer, dt, labelConverter))
val model = pipeline.fit(trainingData)
val predictions = model.transform(testData)
```
Creamos nuestro Decision Tree Classifier donde declaramos la columna label y la columna features, con labelConverter creamos la predicción en base a labelIndexer, con pipeline (que nos permite hacer varios procesos a la vez) juntamos los indexers, dt y labelConverter, creamos el modelo con el pipeline y finalmente creamos la variable predicciones con la transformación del modelo.

```Scala
predictions.select("predictedLabel", "label", "features").show(20)
|predictedLabel|label|            features|
+--------------+-----+--------------------+
|           0.0|  0.0|[-8019.0,7.0,299....|
|           0.0|  0.0|[-6847.0,21.0,206...|
|           0.0|  0.0|[-3313.0,9.0,153....|
|           0.0|  0.0|[-2712.0,2.0,253....|
|           0.0|  0.0|[-1965.0,10.0,317...|
|           0.0|  0.0|[-1884.0,6.0,82.0...|
|           0.0|  0.0|[-1884.0,21.0,193...|
|           0.0|  0.0|[-1854.0,12.0,388...|
|           0.0|  0.0|[-1737.0,31.0,249...|
|           0.0|  0.0|[-1730.0,18.0,178...|
|           0.0|  0.0|[-1725.0,27.0,452...|
|           0.0|  0.0|[-1701.0,26.0,285...|
|           0.0|  0.0|[-1664.0,13.0,169...|
|           0.0|  0.0|[-1655.0,28.0,333...|
|           0.0|  0.0|[-1629.0,28.0,337...|
|           0.0|  0.0|[-1621.0,3.0,171....|
|           0.0|  0.0|[-1621.0,15.0,8.0...|
|           0.0|  0.0|[-1613.0,20.0,9.0...|
|           0.0|  0.0|[-1586.0,16.0,89....|
|           0.0|  0.0|[-1547.0,27.0,492...|
+--------------+-----+--------------------+
```
Mostramos solo 20 líneas para comparar la predicción de label, en la primera prueba que se hizo se pudo observar que hubo un 100% de exactitud con las primeras 20 líneas, pero en realidad hay muchos datos en el dataframe.

```Scala
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("indexedLabel").setPredictionCol("prediction").setMetricName("accuracy")
val accuracy = evaluator.evaluate(predictions)
println(s"Test Error = ${(1.0 - accuracy)}")
val treeModel = model.stages(2).asInstanceOf[DecisionTreeClassificationModel]
println(s"Learned classification tree model:\n ${treeModel.toDebugString}")
```
Creamos el evaluador con MulticlassClassificationEvaluator, donde damos label, la predicción y la exactitud, con eso imprimimos la exactitud, el error y los árboles.

## Logistic Regression

## Multilayer Perceptron
```Scala
import org.apache.spark.ml.feature.StringIndexer
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.{Pipeline, PipelineModel}
val data  = spark.read.option("header","true").option("inferSchema","true").option("delimiter", ";").format("csv").load("C:/bank-full.csv")
val label = new StringIndexer().setInputCol("y").setOutputCol("label")
val labeltransform = label.fit(data).transform(data)
val assembler = new VectorAssembler().setInputCols (Array ("balance", "day", "duration", "pdays", "previous")).setOutputCol("features")
val data2 = assembler.transform(labeltransform)
val training = data2.select("features", "label")
```

```Scala
val splits = training.randomSplit(Array(0.7, 0.3), seed = 1234L)
val train = splits(0)
val test = splits(1)
```
Creamos un split para dividir el 70% de los datos en train y el 30% en test

```Scala
val layers = Array [Int] (5, 3, 3, 2)
val trainer = new MultilayerPerceptronClassifier().setLayers(layers).setBlockSize(128).setSeed(1234L).setMaxIter(100)
```
Para definir las capas se debe tener en cuenta que el primer número es la cantidad de features, durante todos los ejemplos se usaron 5 columnas, los dos valores siguientes son las capas ocultas y el último se define el número de clases, que en este caso es de 2, si no se sabe cuantas clases son, al momento de correr la línea de código te aparece un mensaje de error diciendo cuantas clases tiene en realidad.

```Scala
val modelML = trainer.fit(train)
val result = modelML.transform (test)
val predictionAndLabels = result.select("prediction", "label")
val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")

println(s"Test set accuracy = ${evaluator.evaluate(predictionAndLabels)}")
```
Creamos el modelo con el fit de train, el resultado con la transformación de test y creamos la predicción donde al resultado se le selecciona prediction y label, evaluator tendrá la exactiud y por último se imprime la exactitud de la predicción

# RESULTS
Para obtener los resultados fue necesario hacer 10 pruebas para cada algoritmo de Machine Learning para ver si los resultados cambiaban o eran los mismos.

1. Suport Vector Machine

Las primeras 5 pruebas arrojaron los mismos resultados, se hicieron en diferentes días en la misma computadora, los resultados de ello fueron:
```Scala
Coefficients: [-2.125897501491213E-6,-0.013517727458849872,7.514021888017163E-4,2.7022337506408964E-4,0.011177544540215354] 
Intercept: -1.084924165339881
```
Las otras 5 pruebas se hicieron en una computadora distinta 

```Scala
Coefficients: [-2.1258975014911423E-6,-0.013517727458849597,7.514021888017214E-4,2.702233750640862E-4,0.011177544540215589]
Intercept: -1.0849241653398864
```

1. Decision Tree

Lo mismo ocurrió que en SVM, en una computadora se tienen 5 resultados iguales y en la otra salieron otros resultados, pero esos 5 resultados son iguales.

En la primeras 5 pruebas la probabilidad de exactitud fue de 0.8907834778774071 (89.1%) mientras el error fue de 0.06896551724137934 (6.89%), y estos fueron los resultados de los árboles 
```Scala
If (feature 2 <= 567.5)
   If (feature 2 <= 204.5)
    Predict: 0.0
   Else (feature 2 > 204.5)
    If (feature 3 <= 8.5)
     Predict: 0.0
    Else (feature 3 > 8.5)
     If (feature 3 <= 193.5)
      If (feature 3 <= 96.5)
       Predict: 1.0
      Else (feature 3 > 96.5)
       Predict: 0.0
     Else (feature 3 > 193.5)
      Predict: 0.0
  Else (feature 2 > 567.5)
   If (feature 2 <= 692.5)
    If (feature 3 <= 41.0)
     Predict: 0.0
    Else (feature 3 > 41.0)
     If (feature 3 <= 96.5)
      Predict: 1.0
     Else (feature 3 > 96.5)
      If (feature 1 <= 7.5)
       Predict: 0.0
      Else (feature 1 > 7.5)
       Predict: 1.0
   Else (feature 2 > 692.5)
    If (feature 2 <= 905.0)
     If (feature 3 <= 28.5)
      Predict: 0.0
     Else (feature 3 > 28.5)
      Predict: 1.0
    Else (feature 2 > 905.0)
     If (feature 1 <= 29.5)
      Predict: 1.0
     Else (feature 1 > 29.5)
      If (feature 2 <= 2553.0)
       Predict: 1.0
      Else (feature 2 > 2553.0)
       Predict: 0.0
```
En las otras 5 pruebas la probabilidad de exactitud fue de 
```Scala
0.8933757133569313 (89.34%) 
```
mientras el error fue de 
```Scala
0.10662428664306867 (10.66%)
```
Estos fueron los resultados de los árboles
```Scala
  If (feature 2 <= 480.5)
   If (feature 3 <= 18.5)
    Predict: 0.0
   Else (feature 3 > 18.5)
    If (feature 2 <= 170.5)
     Predict: 0.0
    Else (feature 2 > 170.5)
     If (feature 3 <= 188.5)
      If (feature 3 <= 95.5)
       Predict: 1.0
      Else (feature 3 > 95.5)
       Predict: 0.0
     Else (feature 3 > 188.5)
      If (feature 3 <= 458.5)
       Predict: 0.0
      Else (feature 3 > 458.5)
       Predict: 1.0
  Else (feature 2 > 480.5)
   If (feature 2 <= 671.5)
    If (feature 3 <= 3.5)
     Predict: 0.0
    Else (feature 3 > 3.5)
     If (feature 3 <= 95.5)
      Predict: 1.0
     Else (feature 3 > 95.5)
      If (feature 1 <= 21.5)
       Predict: 0.0
      Else (feature 1 > 21.5)
       Predict: 1.0
   Else (feature 2 > 671.5)
    If (feature 2 <= 879.0)
     If (feature 3 <= 3.5)
      Predict: 0.0
     Else (feature 3 > 3.5)
      Predict: 1.0
    Else (feature 2 > 879.0)
     If (feature 1 <= 29.5)
      If (feature 1 <= 26.5)
       Predict: 1.0
      Else (feature 1 > 26.5)
       Predict: 0.0
     Else (feature 1 > 29.5)
      Predict: 1.0
```

3. Logistic Regression

Al realizar las 5 interaciones de este modelo nos arrojo los mismos resultados, lo unico en lo que cambia es dependiendo de el equipo que se utiliza para correr el modelo como podemos observar en una computadora da diferentes resultados a la otra
3.1

3.2
```Scala
Coeficientes: [2.1295060967543102E-5,-0.0032248638711286446,0.002004245563577638,0.0014137466827612378,0.0371939132948556]
Intercepciones: -2.695580402935833
```
Con una efectividad de :
```Scala
Grado de exactitud = 0.8886545454545455 `88.87 %`
```

1. Multilayer Perceptron

Este solo nos arrojó el porcentaje de la exactitud, durante las 5 primeras pruebas la respuesta fue de 
```Scala
0.8835474819081377 `(88.35%)` 
```

mientras que en las otras pruebas fue de 
```Scala
0.8829225352112676 `(88.29%)`
```


# CONCLUSIONS
Como hemos visto a lo largo del curso hay diferentes modelos para la prediccion de datos, claro que cada uno tiene sus ventajas y desventajas, todo depende de los datos, lo que se requiera y el grado de exactitud que desees en las predicciones, asi como podemos ver que tambien depende del equipo en el cuar realices el montado del modelo por que entre PC puede cambiar el porcentaje de efectividad. 
En el caso de nuestro team el modelo con mayor efetividad es el "Decision Tree" con un porcentaje por muy poco mayor a los demas modelos por lo que este seria el adecuado a utilizar por nuestro team en cualquier implmentacion con nuestros PC.
# REFERENCES
[1] Zhang, X. D. (2020). Machine learning. In A Matrix Algebra Approach to Artificial Intelligence (pp. 223-440). Springer, Singapore.

[2] MathWorks (----) Máquina de vectores de soporte (SVM). From: https://la.mathworks.com/discovery/support-vector-machine.html

[3] Ilabaca, S. (----). Apache Spark. January, 2021, from Analytics Web Site: https://www.analytics10.com/que-es-apache-spark/

[4] GEO Tutoriales. (2016). Árbol de Decisión (Qué es y para qué sirve). 2020, de Gestión de Operaciones Sitio web: https://www.gestiondeoperaciones.net/procesos/arbol-de-decision/

[5] Spark. (----). Logistic regression. 2020, de Spark Sitio web: https://spark.apache.org/docs/2.4.7/ml-classification-regression.html#logistic-regression
