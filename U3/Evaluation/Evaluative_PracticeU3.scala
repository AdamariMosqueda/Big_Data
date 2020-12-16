//Evaluative Practice Unit 3
// K means
//1. Importar una simple sesión Spark.
import org.apache.spark.sql.SparkSession
//2. Utilice las lineas de código para minimizar errores
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)

//3. Cree una instancia de la sesión Spark

//4. Importar la librería de Kmeans para el algoritmo de agrupamiento.

//5. Carga el dataset de Wholesale Customers Data

//6. Seleccione las siguientes columnas: Fresh, Milk, Grocery, Frozen, Detergents_Paper, Delicassen y llamar a este conjunto feature_data

//7. Importar Vector Assembler y Vector

//8. Crea un nuevo objeto Vector Assembler para las columnas de caracteristicas como un conjunto de entrada, recordando que no hay etiquetas

//9. Utilice el objeto assembler para transformar feature_data

//10. Crear un modelo Kmeans con K=3

//11. Evalúe  los grupos utilizando Within Set Sum of Squared Errors WSSSE e imprima los centroides.