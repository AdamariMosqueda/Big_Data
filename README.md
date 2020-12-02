**CONTENT**
- [Practice 1](#practice-1)
- [Practice 2](#practice-2)
- [Practice 3](#practice-3)
- [Practice 4](#practice-4)
- [Practice 5](#practice-5)
- [Research 1](#research-1)
- [Research 2](#research-2)
- [Research 3](#research-3)
- [Research 4](#research-4)
- [Evaluation Unit 1](#evaluation-unit-1)
- [UNIT 2](#unit-2)
- [Practice 1 U2](#practice-1-u2)
- [Practice 2 U2](#practice-2-u2)
  - [2-1](#2-1)
  - [2-2](#2-2)



  <div id='pr1' />

  ## Practice 1 
This practice creates algorithms and also variables can be played with, aside from defining the diference between value and variable in scala 

1. Develope a scala algorithm that calcules the radius of a circle
```Scala
import scala.math.sqrt
val r: Double= sqrt(A/3.1416)
```
This formula ( r=√ Area/π ) is used to retrieve the radius with the area. The sqrt function is used to retrieve the root. Scala does not have library predefined therefore we must first import with scala.math.sqrt

2. Develop a scala algorithm tells me if a number is prime
```Scala
if (Num%2==0){
    println("It's not a number prime ")
    }else{
        println("It's prime")
        }
```
Variable Num can be created with any desired number, a prime number is divisible only by itself and 1, with the algorithm in place if the residue of its division is 0, it prints out as a non prime, in contrary case it will inform number is prime.

3. Given the variable bird = "tweet", use interpolation of string to print "I'm writing a tweet"
```Scala
val bird = "tweet"
val tweet = s"I'm writing a $bird"
```
Variable tweet is a chain of text to which variable bird is added

4. Given the variable message = "Hello Luke, I am your father!" use slilce to extract the sequence "Luke"
```Scala
val message = "Hello Luke, I am your father!"
message slice  (6,10)
```
Message slice takes the characters its indicated, starting from character 6 it begins taking information up until character 10.

5. What's the difference between value and variable in scala?
```Scala
"var" it's a variable mutable in the program this data can be change but
in "val" this data can't change because is immutable 
```

6. Given the tuple (2,4,5,1,2,3,3.1416,23) returns 3.1416
``` Scala
val MyTuple = (2,4,5,1,2,3,3.1416,23)
MyTuple._7
```
When MyTuple._7 is defined the number 7 element is selected from that tuple

<div id='pr2' />

  ## Practice 2 
In this pratice we make use of lists, arrays and maps
1. Create a list called "list" with the elements "red", "white", "black"
```Scala
val list = List("red","white","black")
```
A variable is created in list mode which will contain elements requested
2. Add 5 more items to "list" "green", "yellow", "blue", "orange", "pearl"
```Scala
val list= collection.mutable.Set("red","white","black")
```
in order to add values into list, it first needs to be mutable
```Scala
list+="green"
list+= "yellow"
list+="blue"
list+= "orange"
list+="pearl"
```
Once the list is mutable the elements requested can be added

1. Bring the items from "list" "green", "yellow", "blue"
```Scala
for (lists <- list) { 
    if(lists =="green" || lists =="yellow" || lists=="blue")
    println(lists)
    }
```
In order to print the required values a cycle (for) was created which will run through the entire list searching for elements that meet the condition of if, the similitude is print after it is found

4.  Create an Array of numbers in the range 1-1000 in steps of 5 by 5
```Scala
val arrNum=Array.range(1,1000,5)
```
A variable is created in Array mode, followed by the range function along side in which the initiating number is given seperated by coma then the finalizing number is added to finish off with the steps.

5. What are the unique elements of the list list(1,3,3,4,6,7,3,7)  use conversion to sets
```Scala
val list = List(1,3,3,4,6,7,3,7)
list.toSet
```
toSet converts the List to a Set, show the elements without repeating: Set(1, 6, 7, 3, 4)

6. Create a map mutable named Names containing the following elements: "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"
```Scala
val Names = collection.mutable.Map(("Jose", 20), ("Luis", 24), ("Ana", 23), ("Susana", 27))
Names
```
The first parameter is the key and the second is its value

- 6(a).- Print all of the keys of the map
```Scala
Names.keys
```
only the maps keys will be printed: Set(Susana, Ana, Luis, Jose)

- 6(b).- Add the following value to the map("Miguel", 23)
```Scala
Names += ("Miguel" -> 23)
```
when writting the maps name with += it allows the addage of a new key with value to a map already created: Map(Susana -> 27, Ana -> 23, Miguel -> 23, Luis -> 24, Jose -> 20)

 <div id='pr3' />

  ## Practice 3
  In practice 3 we analyse the code of 4 functions and we explained with our own word, also we made the pseudocode (This one es in the practice)

>First code
```Scala
  def listEvens(list:List[Int]): String ={
    for(n <- list){
        if(n%2==0){
            println(s"$n is even")
        }else{
            println(s"$n is odd")
        }
    }
    return "Done"
}
```

The first function tells us if in a list the number is even or odd:

The function is declared with def where the parameter to be received is a list and the result is a string.
A for loop is made to print all the results to the elements of the list, where n is each element in the list and list indicates where to stop (Number of elements).
if is declared, n%2==0 indicates that the remainder of the division of n over 2 must be 0, if so, it will print that is even, otherwise it will print that it is odd.
Once the for loop ends it will print a string that says "Done" to indicate that the function has finished.


>Second Code
```Scala
def afortunado(list:List[Int]): Int={
    var res=0
    for(n <- list){
        if(n==7){
            res = res + 14
        }else{
            res = res + n
        }
    }
    return res
}
```
The number 7 is considered of fortune, this second function makes a sum between the numbers of a list, but 7 is worth double:

The function is declared with def where the parameter to be received is a list and the result is an Int. The variable res is declared as 0 which is the one that is going to increase. A for loop is made to accumulate the sum, where n is each element in the list and list indicates where to stop (Number of elements). An if is declared indicating that if the number is 7, Add 14 to the result, otherwise the result is added the number of the list and at the end of the for loop return the result of the summation.

>Third code
```Scala
def balance(list:List[Int]): Boolean={
    var primera = 0
    var segunda = 0

    segunda = list.sum

    for(i <- Range(0,list.length)){
        primera = primera + list(i)
        segunda = segunda - list(i)
        if(primera == segunda){
            return true
        }
    }
    return false 
}

val bl = List(3,2,1)
val bl2 = List(2,3,3,2)
val bl3 = List(10,30,90)

balance(bl) //TRUE output 3 = 3
balance(bl2) ///TRUE output 5 = 5
balance(bl3) //FALSE output 0 /= 130
```
A function is created which will receive as data a list, this will return a data in Boolean mode
Two variables named *primera” and “segunda” are created and initiated in 0
Variable "segunda" is assigned the value of the sum of all elements from the list it receives
Creating a cycle that will run through the entire list from 0 to the end of list
Each cycle pass will be assigned to "primera" containing the value result from "primera" that is in each cycle
The list value is added in position i ( position of the cycles pass ) 
variable "segunda" is assigned the value of "segunda" which at primera was the total sum and to this
the lists' element value is subtracted at each cycles' position
in "if", variables "primera" and "segunda" are compared for similar value at each pass to return true 
in case the "for" ends and finds no similarity it returns "false”
three lists are created with different value and are valued in function

>Fourth code
```Scala
def palindromo(palabra:String):Boolean ={
    return (palabra == palabra.reverse)
}

val palabra = "OSO" 
val palabra2 = "ANNA"
val palabra3 = "JUAN"

println(palindromo(palabra)) //TRUE output "OSO"
println(palindromo(palabra2)) //TRUE output "ANNA"
println(palindromo(palabra3)) //FALSE output "NAUJ"
```

A function is created which will receive a variable in String mode and will return a Boolean data types "TRUE or FALSE" will be returned when comparing the variable input that is the same as the variable input with the "reverse" function, this function will write the variables data in reverse


 <div id='pr4' />

  ## Practice 4
 In this practice we code five pseudocode of fibonacci sequence from [Wikipedia](https://es.wikipedia.org/wiki/Sucesión_de_Fibonacci)

 > Recursive version
 ```Scala
 def fib(N: Int): Int = {
    if (N <2){
        return N
    }
    else {
       return fib(N-1) + fib (N-2)
    }
}
```
The first code is the recursive version, the parameter to be received is the number we want to calculate and the result is Int.

If N is 0 or 1, it will return N, otherwise, it will do a sum of the function were we rest 1 at the first one, and the second one we rest 2.

An example is that if we give N the value of 2, 2 is not < than 2, so it will go to the else code, it will sum fib (2-1) + fib (2-2) and the result is fib (1) + fib (0), we know that when N is 1 or 0, it will return N, the result is 1 + 0 = 1, the result of fib(2) is 1.

Now let's see that with 3, in the else code it will sum fib(3-2) + fib(3-1), and the result is fib(2) + fib(1), since 2 is not < than 2, it will do the function again, we already know that from the previous example the answer of fib(2) is 1, the result is 1 + 1 = 2.

> Version with explicit formula
```Scala
import scala.math.sqrt
import scala.math.BigDecimal

def fib2(N: Int): Double = {
if (N <2){
        return N
    }
    else {
        var i = (1+ sqrt(5))/2
        var j = (scala.math.pow(i,N) - scala.math.pow((1-i),N))/sqrt(5)
        
        return BigDecimal(j).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    }
}
```
This one is more complicated, the result of the function is Double because the libraries to raise a number to the N potency throw the results in double.
if is the same, but else have 2 variables, i and j.

The result of i will be the same regardless of the number we give to N, is the sum of 1 and 
The square root of 5, where sqrt is the library we need (We have to import the library first), and the result is divided by 2

In j we use scala.math.pow(,), this is to raise a number to the N potency, the first parameter is the number to raise and second one is the potency.

BigDecimal() is to reduce decimals, some results came out with many decimals, so we return j with this conversion.


The difference with this function and the first one is that you will not be entering the function again and again until N is 0 or 1, it will give the precise result the first time.

> Iterative version
```Scala
def fib3(N: Int): Int = {
var a = 0
var b = 1
var c = 0

var i = 0
while (i < N) {
    c = b + a
    a = b 
    b = c

    i = i +1
}
return a
}
```
The result of the function is int, we declare variables a, b and c, this are to accumulate the sum of the fibonacci sequence, and we declared i like a counter in the while cycle, it will sum the variables until i is not < than N, and return a.

The difference with this function and the first and second one is that you will not be entering the function again and again and it does not give you the precise result the first time, but you know how many times it will go through the while cycle, not like the first function that you don't know how many times it will enter the function again

>Iterative version 2 variable
```Scala
def fib4(N: Int): Int ={
    var a=0
    var b=1
    var i=0
    while(i<N){
        b=b+a
        a=b-a
        i=i+1
    }
    return a
}
``` 
Function fib is created for “n” which will contain an assigned value of a and b and  will execute  the cycle “while” whenever variable “n” is  requested, the greatest being for varialble “b” and the latter for value "a"¸ expecting the return of value 
"a" 
Difference between this and the previous series is the sum of only two variables being used for the accumulation of the sum.

>Iterative version vector
```Scala
def fib5(N: Int): Int = {
    if (N<2) {
        return N
    }
    else {
        val Vector = Array.range (0, (N+1))
        Vector(0) = 0
        Vector(1) = 1
        var k = 2
        while (k < (N+1)) {
            Vector(k) = Vector (k-1) + Vector (k-2)
            k= k+1
        }
        return Vector(N)
    }
}

```
Fib version is created with a value of “n” in which case the value is less than 2 and cannot verify the ‘N” value a vector operations will be created
Vectors primary space will be assigned "k" variable and will contain a cycle to assist in retuning a value less than “N+1”
Such operation will contain the sum of “k-1” along with with “k-2” which will be increased at each request 
"N" value will be returned ( vector sum operation) 


 <div id='pr5' />

  ## Practice 5


1. Where. Filters rows using the given condition. 
```Scala
val wheredf = df.where($"Date" === "2006-01-06")
wheredf.show()
```

2. Computes specified statistics for numeric and string columns. Available statistics are: - count - mean - stddev - min - max - arbitrary approximate percentiles specified as a percentage

This is like "Describe", but it shows more information
```Scala
df.summary().show()
```

3. Agg. Aggregates on the entire Dataset without groups. 

In this example we use agg to obtain the max from "High"
```Scala
val aggdf = df.agg(Map("High" -> "max"))
aggdf.show()
```

4. takeAsList. Returns the first n rows in the Dataset as a list.
```Scala
df.takeAsList(5)
```

5. Explain. Prints the physical plan to the console for debugging purposes.
```Scala
df.explain()
```

6. Union. Returns a new Dataset containing union of rows in this Dataset and another Dataset.
```Scala
val df1 = Seq(("Adamari", "Mosqueda")).toDF("First Name", "LastName")
val df2 = Seq(("Nayeli", "Gutierrez")).toDF("First Name", "LastName")
df1.union(df2).show
```

7. Sort. Returns a new Dataset sorted by the given expressions. 
 
desc = Descendant
```Scala
val sortdf = df.sort($"Volume".desc)
sortdf.show()
```
8. withColumnRenamed new renamed column
``` Scala
val renamedf= df.withColumnRenamed(“Open”,”start”)
renamedf.show()
```
9. cube. Créate new “dataset”
```Scala
val cubedf=df.cube($”High”,$”Low”).agg(Map(“Low”-> “avg”))
cubedf.show()
```
10. limit. Créate new “Dataset” with  “x” string
```Scala
val limitdf= df.limit(10)
limitdf.show()
```
11. dropDuplicates. Return new “Dataset” without previous “Dataset” duplicates
```Scala
val dropdf=df.dropDuplicates(“High”)
dropdf.show()
```
12. distinct. Return new  “Dataset” only with  “Dataset” original
```Scala
val distinctdf=df.distinct()
distinctdf.show()
```
13. isStreaming. Evaluate outsource data (captured) return 
```Scala
value “Boolean”
val isStreamingdf=df.isStreaming
```
14. describe. Gives basic count information, mean, stddev, min, and max 
```Scala
val describedf=df.describe(“High”, “Low”)
describedf.show()
```
15. collect. Returns  “Dataset” separate original fixes
```Scala
val collectdf=df.collect()
collectdf
//print fixed  “Dataset”
for(arr <- collectdf) println(arr)
```

<div id='inv1' />

## Research 1

**Code Pairing**

The code pairing specifies that there are always two people working on code at the same time and that they sit together as much as possible. One is in charge of writing the code and the other of monitoring in real time. At the same time, they are constantly exchanging impressions: they discuss problems, find solutions and develop creative ideas.

[Full version](https://github.com/AdamariMosqueda/Big_Data/blob/Unit_1/U1/Investigations/CodePairing_Mosqueda.md)

<div id='inv2' />

## Research 2

**Pearson Correlation**

Pearson correlation coefficient is a test that measures the statistical relationship between two continuous variables. If the association between the elements is not linear, then the coefficient is not adequately represented.

[Full version](https://github.com/AdamariMosqueda/Big_Data/blob/Unit_1/U1/Investigations/PearsonCorrelation_Mosqueda.md)

## Research 3

**Pair coding**
In this small investigation we will see the concept of pair coding because it was not found as such, the concept of pair programming or pair programming is seen, in the breakdown of the investigation the benefits of using this type of programming are revealed and the difficulties of this.

[Full Version](https://github.com/AdamariMosqueda/Big_Data/blob/Unit_1/U1/Investigations/CodePairing_Gutierrez.md)

## Research 4

**Pearson's correlation**
This research describes the Pearson correlation coefficient in which situations its characteristics are used as well as a simple and practical example to be able to understand the subject a little better.
It is important to know in which situations we can use this coefficient, such as in the statistical relationship between two continuous variables, preferably linear, for this type of implicit relationship to exist.

[Full Version](https://github.com/AdamariMosqueda/Big_Data/blob/Unit_1/U1/Investigations/PearsonCorrelation_Gutierrez.md)

## Evaluation Unit 1

1. Start a simple Spark session.
```Scala
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()
```
The libraries that will be needed for the dataframes and the sql syntax that we will need are imported
A variable is declared to which the "Spark Session" packages are assigned

2. Upload Netflix Stock CSV file, have Spark infer the data types.

```Scala
val df = spark.read.option("header", "true").option("inferSchema","true")csv("C:/Users/yurid/Documents/RepABigData/Big_Data/Evaluation/Netflix_2011_2016.csv")
```
The variable df is created, which will be a new "data frame" and the data from the csv file is assigned to it

3. What are the column names?
```scala
df.columns
```
Date, Open, High, Low, Close, Volume, Adj Close
This instruction will show us in the form of an arrangement the name of the columns mentioned above

4. How is the scheme?

```Scala
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
 ```
 printSchema works to see the types of data that each column has, also if it allows accepting null values ​​or not.


5. Print the first 5 columns.
```Scala
df.head(5)
```
To get only the first columns use this command
```Scala
val columns= df.head(5)
colums.foreach{
    println
    }
```
To visualize the previous command in a better way, we create a variable and this we assign the command of the first 5 lines. Then we go through this arrangement and print it in a linear way with line break

6. Use describe () to learn about the DataFrame.
```Scala
df.describe().show()
```
It creates a Summary column, with the following elements: count is used to say the amount of data it has, mean is the mean, as some data is string, it sets them null, like the standard deviation, it prints the maximum values and minimums of each column

7. Create a new dataframe with a new column called “HV Ratio” which is the relationship between the price in the “High” column versus the “Volume” column of shares traded for a day. (Hint: It is a column operation).

```Scala
val df2 = df.withColumn("HV Ratio", df("High")+df("Volume"))
```
A new data frame is created where we will add the new column, this is done with the previous command in which it will be high vs volume

8. What day had the highest peak in the “Close” column?

```Scala
val DatemaxClose = df.sort($"Close".desc)
DatemaxClose.select("Date", "Close").show(1)
```
The way we found to show the date with the maximum of Close was by sort, we make Close be arranged descendingly, so the maximum value is now the first line, as we are only interested in the maximum of Close and the date we did a select of the Date and Close columns, inside show if a number is added to it it only prints that number of rows, thus we show the day that had the highest peak which was July 15, 2013


9. Write in your own words. What is the meaning of the Close column "Close"?

> This column shows us the data with which Netflix finances at the end of the day after the variation between Open, High and Low

10.  What is the maximum and minimum of the “Volume” column?

```Scala
val maxVolume = df.agg(Map("Volume" -> "max"))
maxVolume.show()
val minVolume = df.agg(Map("Volume" -> "min"))
minVolume.show()
```
The Agg function adds several rows of data in a single output, if for example you are using a group by to order the dates in which there is data, you can add a sum of all the sales of the day, it can also be used by itself just like this example.

It can also be obtained in a simpler way, in the same aggregate without the need for a mapping.
```Scala
val maxminVolume = df.agg(min("Volume"), max("Volume"))
maxminVolume.show() 
```

11. With Scala / Spark Syntax $ answer the following:
Hint: Basically very similar to the dates session, you will have to create another dataframe to answer some of the items.
```Scala
val df3=df
df3.show()
```
A new data frame is created to be used later in the following instructions
- a. How many days was the “Close” column less than $ 600?

```Scala
val infcl = df3.filter($"Close" < 600 ).count()
```
A variable is created in which we will save the value of the count of the values that are less than 600
We use "filter" with this we call the data of the close column that is less than 600 and with the count we make it count to know what the result
- b. What percentage of the time was the “High” column greater than $ 500?
```Scala
val dfporcentaje = df3.filter($"High" > 500).count()
val resultado: Double  = (dfporcentaje*100)/(df.count)
```
We do the same as part a, obtain the amount of data in which High is greater than 500, which was 62, but it does not ask us for the days, it asks us for the percentages so we made a rule of 3, to the amount of data where High is greater than 500 is multiplied by 100 and the total amount of data within the dataframe is divided.

4% of the time the High column was greater than $ 500


- c. What is the Pearson correlation between column "High" and column "Volume"?
```Scala
df3.stat.corr("High", "Volume")
df3.select(corr($"High", $"Volume")).show()
```
We found two ways of deriving the correlation coefficient.
One using stat and the other using a select, both show the same data only select shows it in a visually pleasing way and uses implicit scala language and no stats
- d. What is the maximum in the “High” column per year?
```Scala
df3.groupBy(year(df("Date"))).max("High").show()
df3.groupBy(year(df("Date"))).agg(max("High")).show()
```
For this instruction we use the groupBy function, to order by dates, we want to show it by year so we put "year", and at the end we ask it to get the maximum of High according to the grouping, it can be declared to get the max directly or you can with agg too, both codes print in the same way.


- e. What is the “Close” column average for each calendar month?
```Scala
val clavg=df3.groupBy(month(df("Date"))).avg("Close")
```
To obtain the average of each month from the close column, a variable was created in which we grouped the data by months from the "Date" column and from this we took the average of "Close"
```Scala
val sort= clavg.sort(month(df("Date")).asc)
sort.show()
```
Since it shows us the months in a random way, we decided to arrange them in an ascending way so that they were displayed in a simple way

## UNIT 2

## Practice 1 U2
En esta práctica se realizó un ejercicio de regresión linear en la cual debíamos seguir las instrucciones dadas para llegar al resultado.
1. Importa LinearRegression

```Scala
import org.apache.spark.ml.regression.LinearRegression
import org.apache.spark.sql.SparkSession
```
Para ello usamos org.apache.spark.ml.regression, pero no es la única librería que se necesita importar, como en todos los dataframes debemos importar la sesión de spark.

- Opcional: Utilice el siguiente código para configurar errores
```Scala
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)
```
Ese código ya venía en la práctica, esto hace que aparezcan los mensajes pero también se pueden eliminar esos mensajes configurandolo a Level.OFF.

2. Inicie una simple Sesión Spark
```Scala
val spark = SparkSession.builder().getOrCreate()
```
Creamos nuestra variable spark que contiene la sesión de spark importada.

3. Utilice Spark para el archivo csv Clean-Ecommerce.
```Scala
val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("Clean-Ecommerce.csv")
```
Creamos la variable data que va a contener todos los datos de Clean.Ecommerce, para ello spark lee la información.

4. Imprima el schema en el DataFrame.
```Scala
data.printSchema
/*
 |-- Email: string (nullable = true)
 |-- Avatar: string (nullable = true)
 |-- Avg Session Lenght: double (nullable = true)
 |-- Time on App: double (nullable = true)
 |-- Time on Website: double (nullable = true)
 |-- Lenght of Membership: double (nullable = true)
 |-- Yearly Amount Spent: double (nullable = true)
 */
```
Podemos observar que el data frame contiene la columna Email que es un string, el Avatar que también es un string, que más adelante se entiende el porqué es un string, el promedio de lo que dura en la sesión, que es un valor número, al igual que el tiempo en la aplicación y en la página web, por último tiene lo que ha durado su membresía con lo que gasta al año

5. Imprima un renglón de ejemplo del Data Frame.
```Scala
data.show(1)
/*
+--------------------+------+------------------+-----------------+-----------------+--------------------+-------------------+
|               Email|Avatar|Avg Session Length|      Time on App|  Time on Website|Length of Membership|Yearly Amount Spent|
+--------------------+------+------------------+-----------------+-----------------+--------------------+-------------------+
|mstephenson@ferna...|Violet| 34.49726772511229|12.65565114916675|39.57766801952616|  4.0826206329529615|  587.9510539684005|
+--------------------+------+------------------+-----------------+-----------------+--------------------+-------------------+
*/
```
Podemos observar que el primer usuario tiene un avatar violeta, por eso la columna era un valor string, dura más tiempo en la página web que en la misma aplicación, no sabemos si esos números se refieren a horas o minutos, pero pero es probable que lo que gasta al año sean dólares.

6. Transforme el data frame para que tome la forma de ("label","features").
```Scala
val colnames = data.columns
val firstrow = data.head(1)(0)
```
Para ello creamos dos variables, una contiene las primeras dos columnas que van a ser nuestro label y features.

7. Importe VectorAssembler y Vectors.
```Scala
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
```
Aquí se agregan nuevas librerías para las instrucciones de más adelante.

8. Renombre la columna Yearly Amount Spent como "label".
```Scala
data.select(data("Yearly Amount Spent").as("label")).show
```
Seleccionamos de Data la columna “Yearly Amount Spent” (YAS) y la mostramos cómo label con “as”.


9. También de los datos tome solo las columnas numéricas.
```Scala
data.select(data("Yearly Amount Spent").as("label"), $"Avg Session Length", $"Time on App",$"Time on Website", $"Length of Membership").show
```
Volvemos a seleccionar YAS como label, e identificamos cuáles son las columnas que contienen valores numéricos gracias a la instrucción 4, estos también los seleccionamos en la misma función.

La información solo muestra nuestra columna label y todas las columnas numéricas.

10. Deje todo esto como un nuevo Data Frame que se llame df
Para trabajar con esta información se debe crear un nuevo data frame con esta misma selección.
```Scala
val df = data.select(data("Yearly Amount Spent").as("label"), $"Avg Session Length", $"Time on App",$"Time on Website", $"Length of Membership")
df.show
```

11. 

## Practice 2 U2

La práctica 2 fue un análisis del código de los archivos lr.scala (Regresión lineal) y PracticaLogisticRegression (Regresión logística), explicamos el código usado con nuestras propias palabras

### 2-1
> Regresion Lineal

```Scala
import org.apache.spark.sql.SparkSession
import org.apache.spark.ml.regression.LinearRegression
```
Antes se deben importar dos librerías, la primera SparkSession que es la que lee los archivos csv y con ella podemos trabajar con dataframes, la segunda LinearRegression que como su nombre lo dice, con ella podemos realizar las regresiones lineales.
```Scala
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)
```
Lo que hacen estas líneas de código es quitar muchos errores y siguen apareciendo mensajes, pero se reducen, si no desea que aparezca tan siquiera un mensaje de error se puede configurar a Level.OFF.

```Scala
val spark = SparkSession.builder().getOrCreate()
val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("Clean-USA-Housing.csv")
data.printSchema
data.head(1)
```
Se creó una variable spark, que es la que va a leer el el archivo CSV, al data frame se le dio el nombre de data, con spark.read es posible pasar la información a este nuevo data frame, le indicamos que el formato es csv y en el load va el nombre del archivo, debe estar en la misma carpeta donde está nuestro archivo (Tambien se puede colocar el enlace exacto de donde se encuentra el archivo csv), imprime el data frame y la primera fila para ver la información.

```Scala
val colnames = data.columns
val firstrow = data.head(1)(0)
println("\n")
println("Example data row")
for(ind <- Range(1, colnames.length)){
    println(colnames(ind))
    println(firstrow(ind))
    println("\n")
}
```
La variable colnames tiene las columnas de data, firstrow contiene el primer row del dataframe, al imprimir “\n” se imprime un espacio en blanco, es para hacer una separación al imprimir los resultados, después hay un for donde ind tiene un rango de 1 a la cantidad de columnas, imprime la primera columna, la primera fila, un espacio, entra de nuevo al for y vuelve a imprimir hasta que llegue a la cantidad de columnas.

```Scala
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
```
Se importan nuevas librerías de vectores que se van a necesitar para realizar la regresión lineal.

```Scala
data.columns
val df = data.select(data("Price").as("label"), $"Avg Area Income", $"Avg Area House Age", $"Avg Area Number of Rooms", $"Avg Area Number of Bedrooms", $"Area Population")
```

Imprime las columnas para ver cuales son los que admiten numéricos, df es un nuevo data frame que contiene la información de data, de este se seleccionó Price como label, "Avg Area Income", "Avg Area House Age", "Avg Area Number of Rooms", "Avg Area Number of Bedrooms", y "Area Population".

Aquí sigue la otra mitad

### 2-2 

> Regresion Logistica

```Scala
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.sql.SparkSession
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)
val spark = SparkSession.builder().getOCreate()
val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("advertising.csv")
```
Inicia muy parecido al ejemplo de regresión lineal, solo que en lugar de importar la librería LinearRegression estamos importando LogisticRegression, agregamos un Logger con Level.Error para de disminuyan los mensajes de advertencia y creamos nuestra variable spark, con esa le damos los valores del archivo advertising.csv a nuestro nuevo dataframe data.

```Scala
val colnames = data.columns
val firstrow = data.head(1)(0)
println("\n")
println("Example data row")
for(ind <- Range(1, colnames.length)){
    println(colnames(ind))
    println(firstrow(ind))
    println("\n")
}
```
La variable colnames tiene las columnas de data, firstrow contiene el primer row del dataframe, al imprimir “\n” se imprime un espacio en blanco, es para hacer una separación al imprimir los resultados, después hay un for donde ind tiene un rango de 1 a la cantidad de columnas, imprime la primera columna, la primera fila, un espacio, entra de nuevo al for y vuelve a imprimir hasta que llegue a la cantidad de columnas.

```Scala
val timedata = data.withColumn("Hour",hour(data("Timestamp")))
```
Se creó un nuevo dataframe llamado timedata al cual se le va a dar los mismos valores de Data, con la diferencia de que se le va a agregar una nueva columna llamada Hour, después de la coma se declara hour que es el tipo de datos de tipo time que va a mostrar y esto los tomará de Timestamp.

```Scala
val logregdata = timedata.select(data("Clicked on Ad").as("label"), $"Daily Time Spent on Site", $"Age", $"Area Income", $"Daily Internet Usage", $"Hour", $"Male")
```
Se crea otro Data frame ahora llamado logredata, este va a seleccionar de timedata la columna "Clicked on Ad" la cual tendrá el nombre de "label", y también selecciona otras columnas, pero solamente las que tienen datos numéricos ("Daily Time Spent on Site", "Age", "Area Income", "Daily Internet Usage", "Hour" y "Male")

```Scala
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
```
Se importan nuevas librerías de vectores que se van a necesitar para realizar la regresión logistica.

Y aquí va la explicación de la otra mitad