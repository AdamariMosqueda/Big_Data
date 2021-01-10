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
Throughout the semester we have seen many interesting topics, of course, each one separated and with different data, but now it is time to put some of the models we saw to the test.
Using the same DB we are going to use the SVM, Logistic Regression, Decision Treey and Multilayer Perceptron models to see the difference between them and give a conclusion about which of these models is the best (for us) according to the performance, the percentage of effectiveness as well as the response time of each of this.
# THEORETICAL FRAMEWORK
Machine learning (ML) is a subset of artificial intelligence, which build a mathematical model based on sample data, known as “training data,” in order to make predictions or decisions without being explicitly programmed to perform the task.

> “A computer program is said to learn from experience E with respect to some class of tasks T and performance measure P if its performance at tasks in T, as measured by P, improves with experience E” — Mitchell T.M

In machine learning, neural networks, support vector machines, and evolutionary computation, we are usually given a training set and a test set. By the training set, it will mean the union of the labeled set and the unlabeled set of examples available to machine learners. In comparison, test set consists of examples never seen before.

## Support Vector Machine
A support vector machine (SVM) is a supervised learning algorithm that can be used for binary classification or regression. Support vector machines are very popular in applications such as natural language processing, speech, image recognition, and computer vision.

A support vector machine constructs an optimal hyperplane in the form of a decision surface, so that the margin of separation between the two classes in the data is maximally widened. Support vectors refer to a small subset of the training observations that are used as support for the optimal location of the decision surface.

Support vector machines belong to a class of Machine Learning algorithms called kernel methods and are also known as kernel machines.

The training of a support vector machine consists of two phases:
1. Transform the predictors (input data) into a highly dimensional feature space. In this phase it is enough to specify the kernel; data is never explicitly transformed into feature space. This process is commonly known as the kernel hack.
2. Solve a quadratic optimization problem that fits an optimal hyperplane to classify the transformed features into two classes. The number of transformed features is determined by the number of support vectors.

## Decision Tree
A Decision Tree (or Decision Trees) is an analytical method that, through a schematic representation of the available alternatives, facilitates making better decisions, especially when there are risks, costs, benefits and multiple options. The name is derived from the appearance of the model similar to a tree and its use is wide in the field of decision making under uncertainty (Decision Theory) along with other tools such as Break-Even Analysis.
Decision trees are especially useful when:
1. The alternatives or courses of action are well defined (for example: accept or reject a proposal, increase production capacity or not, build or not a new warehouse, etc.)
2. Uncertainties can be quantified (for example: probability of success of an advertising campaign, probable effect on sales, probability of passing stages, etc.)
3. The objectives are clear (for example: increase sales, maximize profits, minimize costs, etc.)
  
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

For this project we use Spark because it has many benefits:

1. Speed: Spark can be 100 times faster than Hadoop for large-scale data processing by exploiting in-memory computing and other optimizations. It is also fast when data is stored on disk.

2. Ease of use: Operates on large data sets, this includes a collection of over 100 operators for transforming data and familiar data frame APIs for manipulating semi-structured data.

3. A unified engine: It comes bundled with libraries that include support for SQL queries, data streaming, machine learning, and graphics processing.

Spark provides API for Python, Java and Scala, we chose Scala because it is a functional language that allows us to implement the MapReduce paradigm easily and quickly. Scala works on the JVM, which allows us to have the multiple libraries created for Java.

The data used is about a bank that can be found [here] (https://archive.ics.uci.edu/ml/datasets/Bank+Marketing), this information is about marketing campaigns (phone calls) of a bank Portuguese.

## SVM
```Scala
import org.apache.spark.ml.classification.LinearSVC
import org.apache.spark.ml.feature.StringIndexer
import org.apache.spark.ml.PipelineStage
import org.apache.spark.ml.{Pipeline, PipelineModel}
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
```
We imported several libraries, only one is needed for SVM but the data offered includes string values, so StringIndexer is used to transform and with VectorAssembler the features are joined.

```Scala
val data  = spark.read.option("header","true").option("inferSchema","true").option("delimiter", ";").format("csv").load("C:/bank-full.csv")
data.show()
```
We read the csv file, the delimiter will be; because that's how the data in the file is separated.

```Scala
val label = new StringIndexer().setInputCol("y").setOutputCol("label")
val labeltransform = label.fit(data).transform(data)
```
The y column will be our label, but it has string values so we use StringIndexer to transform this data to numeric. With Labeltransform we make a fit and transform data

```Scala
val assembler = new VectorAssembler().setInputCols (Array ("balance", "day", "duration", "pdays", "previous")).setOutputCol("features")
val data2 = assembler.transform(labeltransform)

val training = data2.select("features", "label")
```
The Assembler vector is used to join several columns in an arrangement, this was used to have features, for this we grab the columns with numerical values, we transform labeltransform because it already has a label and finally cramos training that only contains features and label.

```Scala
val lsvc = new LinearSVC().setMaxIter(10).setRegParam(0.1)
val lsvcModel = lsvc.fit(training)
println(s"Coefficients: ${lsvcModel.coefficients} Intercept: ${lsvcModel.intercept}")
```

For SVM we use training and print the Coefficients with Intercept

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

We import the necessary libraries and do everything to have the dataframe with the features and label format

```Scala
val labelIndexer = new StringIndexer().setInputCol("label").setOutputCol("indexedLabel").fit(training)
val featureIndexer = new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(4).fit(training)
```

We use StringIndexer so that label becomes indexedLabel and we do the same with features, using VectorIndexer and giving it a maximum category of 4

```Scala
val Array(trainingData, testData) = training.randomSplit(Array(0.7, 0.3))
```
We create trainingData and testData, where the first one will contain 70% of data while the other keeps 30, with randomsplit the data is applied to each one in a random way.

```Scala
val dt = new DecisionTreeClassifier().setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures")
val labelConverter = new IndexToString().setInputCol("prediction").setOutputCol("predictedLabel").setLabels(labelIndexer.labels)
val pipeline = new Pipeline().setStages(Array(labelIndexer, featureIndexer, dt, labelConverter))
val model = pipeline.fit(trainingData)
val predictions = model.transform(testData)
```

We create our Decision Tree Classifier where we declare the label column and the features column, with labelConverter we create the prediction based on labelIndexer, with pipeline (which allows us to do several processes at the same time) we join the indexers, dt and labelConverter, we create the model with the pipeline and finally we create the predictions variable with the transformation of the model.


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

We show only 20 lines to compare the label prediction, in the first test that was done it was observed that there was 100% accuracy with the first 20 lines, but in reality there is a lot of data in the dataframe.

```Scala
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("indexedLabel").setPredictionCol("prediction").setMetricName("accuracy")
val accuracy = evaluator.evaluate(predictions)
println(s"Test Error = ${(1.0 - accuracy)}")
val treeModel = model.stages(2).asInstanceOf[DecisionTreeClassificationModel]
println(s"Learned classification tree model:\n ${treeModel.toDebugString}")
```

We create the evaluator with MulticlassClassificationEvaluator, where we label, the prediction and the exactitude, with that we print the exactitude, the error and the trees.

## Logistic Regression

Code description for our Logistic Regression model

```Scala
import org.apache.spark.sql.SparkSession
import org.apache.spark.ml.feature.StringIndexer
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.log4j._
```

We import the necessary libraries to make our Logistic Regression model the libraries to evaluate and transform the data, these include string values, so StringIndexer is used to transform and with VectorAssembler the features are joined.

```Scala
Logger.getLogger("org").setLevel(Level.ERROR)

val spark = SparkSession.builder().getOrCreate()
val data  = spark.read.option("header","true").option("inferSchema","true").option("delimiter", ";").format("csv").load("bank-full.csv")
```
The library is loaded to minimize errors within the code run
We create our spark variable to start a normal session
We read the csv file, the delimiter will be `;` since this is the one that divides the data.

```Scala

val label = new StringIndexer().setInputCol("y").setOutputCol("label")
val labeltransform = label.fit(data).transform(data)
```

The `y` column will be our` label`, but it has string values so we use StringIndexer to transform this data to numeric. With Labeltransform we make a fit and transform data

```Scala
val assembler = new VectorAssembler().setInputCols (Array ("balance", "day", "duration", "pdays", "previous")).setOutputCol("features")
val data2 = assembler.transform(labeltransform)
data2.show(1)
```

The Assembler vector is used to join several columns in an arrangement, this was used to have features, for this we grab the columns with numerical values, we transform labeltransform because it already has a label.
We show how our new dataset looks

```Scala
val training = data2.select("features", "label")
training.show(1)
```

We create a training variable that only contains features and label.
We show the new clean data set.

```Scala
val splits = training.randomSplit(Array(0.7, 0.3), seed = 12345)
val train = splits(0)
val test = splits(1)
println("training set = ", train.count())
println("test set = ", test.count())
```
We create a split to divide 70% of the data in train and 30% in test
We print the account of our values for training and test

```Scala
val lr = new  LogisticRegression().setMaxIter(10).setRegParam(0.1)
val model = lr.fit(train)
val resultados = model.transform(test)
val evaluador = new MulticlassClassificationEvaluator().setMetricName("accuracy")
```
I create an `lr` object which is the LogisticRegression argument for our model
We create a variable which the model uses, it performs the fit with the train dataset after loading with the train, the model is used now transforming the data from the test data.
To evaluate the effectiveness of our model we create an object which will give us this value

```Scala
println(s"Coeficientes: ${model.coefficients}")
println(s"Intercepciones: ${model.intercept}")
println(s"Grado de exactitud = ${evaluador.evaluate(resultados)}")
```

We print our coefficients and interceptions based on the degree of accuracy of our model that we carry out.

## Multilayer Perceptron
```Scala
import org.apache.spark.ml.feature.StringIndexer
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.{Pipeline, PipelineModel}
```
We import the necessary libraries to make our Multilayer Perceptron model, the libraries to evaluate and transform the data, these include string values, so StringIndexer is used to transform and with VectorAssembler the features are joined.

```Scala
val data  = spark.read.option("header","true").option("inferSchema","true").option("delimiter", ";").format("csv").load("C:/bank-full.csv")
val label = new StringIndexer().setInputCol("y").setOutputCol("label")
val labeltransform = label.fit(data).transform(data)
val assembler = new VectorAssembler().setInputCols (Array ("balance", "day", "duration", "pdays", "previous")).setOutputCol("features")
val data2 = assembler.transform(labeltransform)
val training = data2.select("features", "label")
```
We read the csv file, the delimiter will be `;` since this is the one that divides the data.
The column will be our label, but it has string values so we use StringIndexer to transform this data to numeric. With Labeltransform we make a fit and transform data
The Assembler vector is used to join several columns in an arrangement, this was used to have features, for this we grab the columns with numerical values, we transform labeltransform because it already has a label. We show how our new dataset looks

```Scala
val splits = training.randomSplit(Array(0.7, 0.3), seed = 1234L)
val train = splits(0)
val test = splits(1)
```

We create a split to divide 70% of the data in train and 30% in test

```Scala
val layers = Array [Int] (5, 3, 3, 2)
val trainer = new MultilayerPerceptronClassifier().setLayers(layers).setBlockSize(128).setSeed(1234L).setMaxIter(100)
```
To define the layers it must be taken into account that the first number is the number of features, during all the examples 5 columns were used, the next two values are the hidden layers and the last one defines the number of classes, which in this case it is 2, if you don't know how many classes there are, when you run the line of code you get an error message saying how many classes it actually has.

```Scala
val modelML = trainer.fit(train)
val result = modelML.transform (test)
val predictionAndLabels = result.select("prediction", "label")
val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")

println(s"Test set accuracy = ${evaluator.evaluate(predictionAndLabels)}")
```
We create the model with the train fit, the result with the test transformation and create the prediction where prediction and label are selected for the result, evaluator will have the accuracy and finally the accuracy of the prediction is printed

# RESULTS
To obtain the results, it was necessary to do 10 tests for each Machine Learning algorithm to see if the results changed or were the same.

1. Suport Vector Machine

The first 5 tests yielded the same results, they were done on different days on the same computer, the results of which were:
```Scala
Coefficients: [-2.125897501491213E-6,-0.013517727458849872,7.514021888017163E-4,2.7022337506408964E-4,0.011177544540215354] 
Intercept: -1.084924165339881
```
The other 5 tests were done on a different computer

```Scala
Coefficients: [-2.1258975014911423E-6,-0.013517727458849597,7.514021888017214E-4,2.702233750640862E-4,0.011177544540215589]
Intercept: -1.0849241653398864
```

1. Decision Tree

The same thing happened that in SVM, in one computer you have 5 equal results and in the other other results came out, but those 5 results are equal.

In the first 5 tests the accuracy probability was 0.8907834778774071 (89.1%) while the error was 0.06896551724137934 (6.89%), and these were the results of the trees

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
In the other 5 tests the probability of accuracy was
```Scala
0.8933757133569313 (89.34%) 
```
while the error was
```Scala
0.10662428664306867 (10.66%)
```
These were the results of the trees
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

When performing the 5 interactions of this model, it gave us the same results, the only thing that changes is depending on the equipment that is used to run the model, as we can observe in a computer it gives different results to the other

3.1

```Scala
Coeficientes: [2.1953717210865443E-5,-0.0039087241148942735,0.0020207318126466336,0.0013950274211932889,0.04274086623441127]
Intercepciones: -2.706584067945768
```
With an effectiveness of:
```Scala
Grado de exactitud = 0.8849252856724289 `88.49 %`
```

3.2
```Scala
Coeficientes: [2.1295060967543102E-5,-0.0032248638711286446,0.002004245563577638,0.0014137466827612378,0.0371939132948556]
Intercepciones: -2.695580402935833
```
With an effectiveness of:
```Scala
Grado de exactitud = 0.8886545454545455 `88.87 %`
```

1. Multilayer Perceptron

This only gave us the percentage of accuracy, during the first 5 tests the response was
```Scala
0.8835474819081377 `(88.35%)` 
```

while in the other tests it was
```Scala
0.8829225352112676 `(88.29%)`
```


# CONCLUSIONS
As we have seen throughout the course there are different models for predicting data, of course each one has its advantages and disadvantages, it all depends on the data, what is required and the degree of accuracy you want in the predictions, as well as We can see that it also depends on the equipment in which you make the mounting of the model because between PC the percentage of effectiveness can change.
In the case of our team, the most effective model is the "Decision Tree" with a percentage that is slightly higher than the other models, so this would be the appropriate one to be used by our team in any implementation with our PCs.

# REFERENCES
[1] Zhang, X. D. (2020). Machine learning. In A Matrix Algebra Approach to Artificial Intelligence (pp. 223-440). Springer, Singapore.

[2] MathWorks (----) Support Vector Machine (SVM). From: https://la.mathworks.com/discovery/support-vector-machine.html

[3] Ilabaca, S. (----). Apache Spark. January, 2021, from Analytics Web Site: https://www.analytics10.com/que-es-apache-spark/

[4] GEO Tutorials. (2016). Decision Tree (What it is and what it is for). 2020, Operations Management Website: https://www.gestiondeoperaciones.net/procesos/arbol-de-decision/

[5] Spark. (----). Logistic regression. 2020, from Spark Website: https://spark.apache.org/docs/2.4.7/ml-classification-regression.html#logistic-regression