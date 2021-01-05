import org.apache.spark.ml.classification.LinearSVC
import org.apache.spark.ml.feature.StringIndexer
import org.apache.spark.ml.PipelineStage
import org.apache.spark.ml.{Pipeline, PipelineModel}
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors

val data  = spark.read.option("header","true").option("delimiter", ";").format("csv").load("bank-full.csv")
//"duration", "contact", "month", "day", "default", "pdays" no nos sirven y hacemos un select de las que vamos a usar
val data2 = data.select("age", "job", "marital", "education", "balance", "housing", "loan","campaign", "previous", "poutcome", "y")
data2.show()

//Son varias columnas con valores string por lo que hacemos un mapeo 
val featureCol = data2.columns
val indexers = featureCol.map { colName =>new StringIndexer().setInputCol(colName).setOutputCol(colName + "Index")}
//Usamos pipelane para hacer la transformación
val pipeline = new Pipeline().setStages(indexers)      
val newDF = pipeline.fit(data2).transform(data2)
newDF.show()

val Features = (new VectorAssembler().setInputCols(Array ("ageIndex", "jobIndex", "maritalIndex", "educationIndex", "housingIndex","balanceIndex", "campaignIndex", "previousIndex", "loanIndex", "poutcomeIndex")).setOutputCol("features"))
val data3 = Features.transform (newDF)

val training = data3.select("features", "yIndex").withColumnRenamed("yIndex", "label")

//SVM

val lsvc = new LinearSVC().setMaxIter(10).setRegParam(0.1)

val lsvcModel = lsvc.fit(training)

println(s"Coefficients: ${lsvcModel.coefficients} Intercept: ${lsvcModel.intercept}")

