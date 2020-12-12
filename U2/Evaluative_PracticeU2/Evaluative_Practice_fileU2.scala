//Evaluative Practice Unit 2
// Naive Bayes

// Hints
//- Hay que buscar la manera con scala de tranformar datos categoricosa a numericos, una vez que cargen dataframe tendran que 
//reasignar la columna de los labels para las clases de Iris.
//- De ahi pues es cuestion de ver como funciona el modelo de multilayer perceptron para que puedan dar la entrada de datos 
//de entrenamiento y los de pruebas, basicamente separar las caracteristicas en 70% de entrenamiento y 30% de prueba.

//1. Cargar en un dataframe Iris.csv que se encuentra en https://github.com/jcromerohdz/iris, elaborar la liempieza de datos 
// necesaria para ser procesado por el siguiente algoritmo (Importante, esta limpieza debe ser por medio de un script de Scala en Spark).
import org.apache.spark.sql.SparkSession
import org.apache.spark.ml.feature.StringIndexer

val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("C:/Users/yurid/Documents/RepABigData/Big_Data/U2/Evaluative_PracticeU2/iris.csv")

val indexer = new StringIndexer().setInputCol("species").setOutputCol("speciesIndex")
val indexed = indexer.fit(data).transform(data)
indexed.show()

val data2 = indexed.select("sepal_length", "sepal_width", "petal_length", "petal_width", "speciesIndex")
data2.show(200)

//a. Utilice la librería Mllib de Spark el algoritmo de Machine Learning correspondiente a multilayer perceptron
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator

//2. ¿Cuáles son los nombres de las columnas?
data2.columns
   // Output -> Array[String] = Array(sepal_length, sepal_width, petal_length, petal_width, speciesIndex)
   
//3. ¿Cómo es el esquema?
data2.schema
// Output res3: org.apache.spark.sql.types.StructType = StructType(StructField(sepal_length,DoubleType,true), 
//StructField(sepal_width,DoubleType,true), StructField(petal_length,DoubleType,true), StructField(petal_width,DoubleType,true),
// StructField(speciesIndex,DoubleType,false))

//4. Imprime las primeras 5 columnas.
data2.show(5)
/*
+------------+-----------+------------+-----------+------------+
|sepal_length|sepal_width|petal_length|petal_width|speciesIndex|
+------------+-----------+------------+-----------+------------+
|         5.1|        3.5|         1.4|        0.2|         0.0|
|         4.9|        3.0|         1.4|        0.2|         0.0|
|         4.7|        3.2|         1.3|        0.2|         0.0|
|         4.6|        3.1|         1.5|        0.2|         0.0|
|         5.0|        3.6|         1.4|        0.2|         0.0|
+------------+-----------+------------+-----------+------------+
*/


//5. Usa el metodo describe () para aprender mas sobre los datos del DataFrame.

//6. Haga la transformación pertinente para los datos categoricos los cuales seran nuestras etiquetas a clasificar.

//7. Construya el modelos de clasificación y explique su arquitectura.

//8. Imprima los resultados del modelo  