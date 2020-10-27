//1. Start a simple Spark session.
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()
//2. Upload Netflix Stock CSV file, have Spark infer the data types.
val df = spark.read.option("header", "true").option("inferSchema","true")csv("C:/Users/yurid/Documents/RepABigData/Big_Data/Evaluation/Netflix_2011_2016.csv")
//3. What are the column names?
df.columns
// Date, Open, High, Low, Close, Volume, Adj Close
//4. How is the scheme?
df.printSchema()
/*
 |-- Date: timestamp (nullable = true)
 |-- Open: double (nullable = true)
 |-- High: double (nullable = true)
 |-- Low: double (nullable = true)
 |-- Close: double (nullable = true)
 |-- Volume: integer (nullable = true)
 |-- Adj Close: double (nullable = true)
 */
//5. Print the first 5 columns.
df.head(5)
//View the lines in an orderly and separate manner
val columns= df.head(5)
columns.foreach{
    println
    }
//6. Use describe () to learn about the DataFrame.
df.describe().show()
// It creates a Summary column, with the following elements: count is used to say the amount of data it has, mean is the mean,
// as some data is a string, it sets them null, like the standard deviation, it prints the maximum and minimum values
// of each column

// 7. Create a new dataframe with a new column called "HV Ratio" which is the
// relationship between the price of the column "High" versus the column "Volume" of
// shares traded for one day. (Hint: It is a column operation).
val df2 = df.withColumn("HV Ratio", df("High")+df("Volume"))
//8. Which day had the highest peak in the “Close” column?
val DatemaxClose = df.sort($"Close".desc)
DatemaxClose.select("Date", "Close").show(1)
// 9. Write in your own words in a comment of your code. Which is the
// meaning of the Close column “Close”?
/*
This column shows us the data with which Netflix's finances at the end of the day
after the variation between Open, High and Low
*/
// 10. What is the maximum and minimum of the “Volume” column?

val maxVolume = df.agg(Map("Volume" -> "max"))
maxVolume.show()
val minVolume = df.agg(Map("Volume" -> "min"))
minVolume.show()

//11.With Scala / Spark $ syntax answer the following:
// ◦ Hint: Basically very similar to the dates session, you will have to create another
// dataframe to answer some of the items.
val df3=df
df3.show()
//a. How many days was the “Close” column less than $ 600?
val infcl = df3.filter($"Close" < 600 ).count()
//b. What percentage of the time was the “High” column greater than $ 500?
val dfporcentaje = df3.filter($"High" > 500).count()
val resultado: Double  = (dfporcentaje*100)/(df.count)
//c. What is the Pearson correlation between column "High" and column "Volume"?
df3.stat.corr("High", "Volume")
df3.select(corr($"High", $"Volume")).show()
//d. What is the maximum in the “High” column per year?
df3.groupBy(year(df("Date"))).max("High").show()
df3.groupBy(year(df("Date"))).agg(max("High")).show()
//e. What is the “Close” column average for each calendar month?
val clavg=df3.groupBy(month(df("Date"))).avg("Close")
//In an orderly manner throughout the months
val sort= clavg.sort(month(df("Date")).asc)
sort.show()