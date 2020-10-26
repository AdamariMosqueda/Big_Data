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

[Full version](https://github.com/AdamariMosqueda/Big_Data/blob/Unit_1/Investigations/CodePairing_Mosqueda.md)

<div id='inv2' />

## Research 2

**Pearson Correlation**

Pearson correlation coefficient is a test that measures the statistical relationship between two continuous variables. If the association between the elements is not linear, then the coefficient is not adequately represented.

[Full version](https://github.com/AdamariMosqueda/Big_Data/blob/Unit_1/Investigations/PearsonCorrelation_Mosqueda.md)

## Research 3

**Pair coding**
In this small investigation we will see the concept of pair coding because it was not found as such, the concept of pair programming or pair programming is seen, in the breakdown of the investigation the benefits of using this type of programming are revealed and the difficulties of this.

[Full Version](https://github.com/AdamariMosqueda/Big_Data/blob/Unit_1/Investigations/CodePairing_Gutierrez.md)

## Research 4

**Pearson's correlation**
This research describes the Pearson correlation coefficient in which situations its characteristics are used as well as a simple and practical example to be able to understand the subject a little better.
It is important to know in which situations we can use this coefficient, such as in the statistical relationship between two continuous variables, preferably linear, for this type of implicit relationship to exist.

[Full Version](https://github.com/AdamariMosqueda/Big_Data/blob/Unit_1/Investigations/PearsonCorrelation_Gutierrez.md)

## Evaluation Unit 1

1. Start a simple Spark session.
```Scala
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()
```
2. Upload Netflix Stock CSV file, have Spark infer the data types.

```Scala
val df = spark.read.option("header", "true").option("inferSchema","true")csv("C:/Users/yurid/Documents/RepABigData/Big_Data/Evaluation/Netflix_2011_2016.csv")
```
3. What are the column names?
```scala
df.columns
```
Date, Open, High, Low, Close, Volume, Adj Close


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
val columns= df.head(5)
colums.foreach{
    println
    }
```
6. Use describe () to learn about the DataFrame.
```Scala
df.describe().show()
```
Nos crea una columna Summary, con los siguientes elementos: count sirve para decir la cantidad de datos que tiene, mean es la media, como unos datos son string, los pone nulos, al igual que la desviacion estandar, nos imprime los valores maximos y mínimos de cada columna


7. Create a new dataframe with a new column called “HV Ratio” which is the relationship between the price in the “High” column versus the “Volume” column of shares traded for a day. (Hint: It is a column operation).

```Scala
val df2 = df.withColumn("HV Ratio", df("High")+df("Volume"))
```
8. What day had the highest peak in the “Close” column?

```Scala
val DatemaxClose = df.sort($"Close".desc)
DatemaxClose.select("Date", "Close").show(1)
```
La forma que encontramos de mostrar la fecha con el máximo de Close fue por sort, hacemos que Close sea acomodado de forma descendente, por lo que el valor máximo ahora es el primer renglón, como solo nos interesa el máximo de Close y la fecha hicimos un select de las columnas Date y Close, dentro de show si se le agrega un número solo te imprime esa cantidad de filas, así mostramos el día que tuvo el pico más alto que fue el 15 de Julio del 2013


9. Write in your own words. What is the meaning of the Close column "Close"?

> Esta columna nos muestra los datos con los que las finanzas de Netflix al terminar el dia después de la variacion entre Open, High y Low


10.  What is the maximum and minimum of the “Volume” column?

```Scala
val maxVolume = df.agg(Map("Volume" -> "max"))
maxVolume.show()
val minVolume = df.agg(Map("Volume" -> "min"))
minVolume.show()
```
La función Agg agrega varias filas de datos en una única salida, si por ejemplo estás usando un group by para ordenar las fechas en las que hay datos, se le puede agregar una suma de todas las ventas del día, también se puede usar por sí solo como este ejemplo.

También se puede obtener de una forma más sencilla, en el mismo aggregate sin necesidad de un mapeo.
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
- a. How many days was the “Close” column less than $ 600?

```Scala
val infcl = df3.filter($"Close" < 600 ).count()
```
- b. What percentage of the time was the “High” column greater than $ 500?
```Scala
val dfporcentaje = df3.filter($"High" > 500).count()
val resultado: Double  = (dfporcentaje*100)/(df.count)
```
Hacemos lo mismo que el inciso a, obtener la cantidad de datos en las que High es mayor a 500 que fue de 62, pero no nos pide los días, nos pide los porcentajes por lo que hicimos una regla de 3, a la cantidad de datos donde High es mayor a 500 se le multiplica 100 y se le divide la cantidad total de datos dentro del dataframe.

El 4% del tiempo la columna High fue mayor que $500


- c. What is the Pearson correlation between column "High" and column "Volume"?
```Scala
df3.stat.corr("High", "Volume")
df3.select(corr($"High", $"Volume")).show()
```
- d. What is the maximum in the “High” column per year?
```Scala
df3.groupBy(year(df("Date"))).max("High").show()
df3.groupBy(year(df("Date"))).agg(max("High")).show()
```
Para esta instrucción usamos la función groupBy, para ordenar por fechas, lo queremos mostrar por año por lo que ponemos "year", y al final le pedimos que saque el máximo de High de acuerdo a la agrupación, se puede declarar que saque el max directamente o se puede con agg también, ambos códigos imprimen de la misma forma.


- e. ¿Cuál es el promedio de columna “Close” para cada mes del calendario?
```Scala
val clavg=df3.groupBy(month(df("Date"))).avg("Close")

val sort= clavg.sort(month(df("Date")).asc)
sort.show()
```