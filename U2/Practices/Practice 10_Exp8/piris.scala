package spark.ml.cookbook.chapter6
import org.apache.spark.mllib.linalg.{Vector, Vectors} 
import org.apache.spark.mllib.regression.LabeledPoint 
import org.apache.spark.mllib.classification.{NaiveBayes, NaiveBayesModel}
import org.apache.spark.mllib.evaluation.{BinaryClassificationMetrics, MulticlassMetrics, MultilabelMetrics, binary}
import org.apache.spark.sql.{SQLContext, SparkSession}
import org.apache.log4j.Logger
import org.apache.log4j.Level

// We import our Prepared Data
val data = sc.textFile("C:/iris-data-prepared.txt")
// We transform it into a DataSet, in which we will take the species column as a reference label
// sepal_length, sepal_width, petal_length, petal_width, we transform these columns into vectors.
val NaiveBayesDataSet = data.map { line => val 
columns = line.split(',')
LabeledPoint(columns(4).toDouble,
Vectors.dense(
columns(0).toDouble,
columns(1).toDouble,
columns(2).toDouble,
columns(3).toDouble))
}

// We clean our Dataset eliminating duplicates
println(" Total number of data vectors =", NaiveBayesDataSet.count())

val distinctNaiveBayesData = NaiveBayesDataSet.distinct() 
println("Distinct number of data vectors = ", 
distinctNaiveBayesData.count())

// We print our data to see how we are saving it
distinctNaiveBayesData.collect().take(10).foreach(println(_))

// We divide our data randomly to create a training dataset and one for testing (80% - 20%)
val allDistinctData =
distinctNaiveBayesData.randomSplit(Array(.80,.20),10L)
val trainingDataSet = allDistinctData(0)
val testingDataSet = allDistinctData(1)

println("number of training data =",trainingDataSet.count())
println("number of test data =",testingDataSet.count())

// We create our model with the NaiveBayes functions offered by the scala packages and train it with our training dataset
val myNaiveBayesModel = NaiveBayes.train(trainingDataSet)

// To our Test dataset each of its values is being read by our model and it will try to predict and compare them.
val predictedClassification = testingDataSet.map( x => 
 (myNaiveBayesModel.predict(x.features), x.label))

//Metrics
val metrics = new MulticlassMetrics(predictedClassification)

// Matrix of Confusion 
 val confusionMatrix = metrics.confusionMatrix 
 println("Confusion Matrix= n",confusionMatrix)

// Precision metrics
 val myModelStat=Seq(metrics.precision)
 myModelStat.foreach(println(_))