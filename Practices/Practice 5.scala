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
//8. withColumnRenamed. Cambia el nombre de la columna de la cual coloquemos el nombre separado con una , en nuevo nombre
val renamedf= df.withColumnRenamed("Open","Inicio")
renamedf.show()
//9. cube. Crea un nuevo "dataset"
val cubedf=df.cube($"High",$"Low").agg(Map("Low"-> "avg"))
cubedf.show()
//10. limit. Crea un nuevo "Dataset" con los primeros "x" renglones
val limitdf= df.limit(10)
limitdf.show()
//11. dropDuplicates. Regresa un nuevo "Dataset" sin datos duplicados del "Dataset" anterio
val dropdf=df.dropDuplicates("High")
dropdf.show()
//12. distinct. Devuelve un nuevo "Dataset" con solo filas unicas del "Dataset" original
val distinctdf=df.distinct()
distinctdf.show()
//13. isStreaming. Evalua si estan entrando datos de algun lugar (capturados) regresa un valor "Boolean"
val isStreamingdf=df.isStreaming
//14. describe. Te arroga las operaciones basicas de estadistica count, mean, stddev, min, and max 
val describedf=df.describe("High", "Low")
describedf.show()
//15. collectdf. Regresa el "Dataset" original a arreglos por separado 
val collectdf=df.collect()
collectdf
//Imprimir de manera ordenada los arreglos de el "Dataset"
for(arr <- collectdf) println(arr)