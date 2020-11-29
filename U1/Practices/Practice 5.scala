//1. Where. Filters rows using the given condition. 
val wheredf = df.where($"Date" === "2006-01-06")
wheredf.show()

//2. Computes specified statistics for numeric and string columns. Available statistics are:
//- count - mean - stddev - min - max - arbitrary approximate percentiles specified as a percentage
df.summary().show()

//3. Agg. Aggregates on the entire Dataset without groups.

val aggdf = df.agg(Map("High" -> "max"))
aggdf.show()

//4. takeAsList. Returns the first n rows in the Dataset as a list.
df.takeAsList(5)

//5. Explain. Prints the physical plan to the console for debugging purposes.
df.explain()

//6. Union. Returns a new Dataset containing union of rows in this Dataset and another Dataset.
val df1 = Seq(("Adamari", "Mosqueda")).toDF("First Name", "LastName")
val df2 = Seq(("Nayeli", "Gutierrez")).toDF("First Name", "LastName")
df1.union(df2).show

//7. Sort. Returns a new Dataset sorted by the given expressions. desc = Descendant
val sortdf = df.sort($"Volume".desc)
sortdf.show()
//8. withColumnRenamed. Change the name of the column from which we place the name separated with a, in new name
val renamedf= df.withColumnRenamed("Open","Inicio")
renamedf.show()
//9. cube. Créate new “dataset”
val cubedf=df.cube($"High",$"Low").agg(Map("Low"-> "avg"))
cubedf.show()
//10. limit. Créate new “Dataset” with  “x” string
val limitdf= df.limit(10)
limitdf.show()
//11. dropDuplicates. Return new “Dataset” without previous “Dataset” duplicates
val dropdf=df.dropDuplicates("High")
dropdf.show()
//12. distinct. Return new  “Dataset” only with  “Dataset” original
val distinctdf=df.distinct()
distinctdf.show()
//13. isStreaming. Evaluate outsource data (captured) return value “Boolean”
val isStreamingdf=df.isStreaming
//14. describe. Gives basic count information, mean, stddev, min, and max 
val describedf=df.describe("High", "Low")
describedf.show()
//15. collectdf. Returns  “Dataset” separate original fixes
val collectdf=df.collect()
collectdf
//Print fixed "Dataset"
for(arr <- collectdf) println(arr)