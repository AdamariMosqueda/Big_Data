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
