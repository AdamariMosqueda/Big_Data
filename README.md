**CONTENT**
- [UNIT 1](#unit-1)
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
  - [Practice 1](#practice-1-1)
  - [Practice 2](#practice-2-1)
    - [2-1](#2-1)
    - [2-2](#2-2)
  - [Practice 3](#practice-3-1)
    - [Correlation](#correlation)
    - [Hypothesis testing](#hypothesis-testing)
    - [Summarizer](#summarizer)
  - [Practice 4](#practice-4-1)
  - [Practice 5](#practice-5-1)
  - [Practice 6](#practice-6)
  - [Practice 7](#practice-7)
  - [Practice 8](#practice-8)
  - [Practice 9](#practice-9)
  - [Practice 10](#practice-10)
  - [Homework 1](#homework-1)
  - [Homework 2](#homework-2)
  - [Evaluation Unit 2](#evaluation-unit-2)
  
  <div id='pr1' />
# UNIT 1
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

# UNIT 2
## Practice 1 
In this practice, a linear regression exercise is carried out in which we must follow the instructions given to arrive at the result. 
1. It matters linear regression
```Scala
import org.apache.spark.ml.regression.LinearRegression
import org.apache.spark.sql.SparkSession
```
For this we use org.apache.spark.ml.regression, but it is not the only library that needs to be imported, as in all dataframes we must import the spark session.

- Optional: Use the following code to configure errors
```Scala
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)
```
That code was already in practice, this makes the messages appear but those messages can also be eliminated by setting it to Level.OFF.

2. Start a simple Spark Session
```Scala
val spark = SparkSession.builder().getOrCreate()
```
We create our spark variable that contains the imported spark session.

3. Use Spark for Clean-Ecommerce csv file.
```Scala
val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("Clean-Ecommerce.csv")
```
We create the data variable that will contain all the Clean.Ecommerce data, for this spark reads the information.
4. Print the schema in the DataFrame.
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
We can see that the data frame contains the Email column which is a string, the Avatar which is also a string, which later on we will understand why it is a string, the average of the duration of the session, which is a number value, Like the time in the application and on the website, finally you have what your membership has lasted with what you spend per year

5. Print a sample line of the Data Frame.
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
We can see that the first user has a purple avatar, that's why the column was a string value, it lasts longer on the web page than in the application itself, we don't know if these numbers refer to hours or minutes, but it is likely that what you spend per year are dollars.

6. Transform the data frame to take the form of ("label", "features").
```Scala
val colnames = data.columns
val firstrow = data.head (1)(0)
```
To do this we create two variables, one contains the first two columns that will be our label and features.

7. Import VectorAssembler and Vectors.
```Scala
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
```
New libraries are added here for instructions below.

8. Rename the column Yearly Amount Spent as "label".
```Scala
data.select (data ("Yearly Amount Spent"). as ("label")). show
```
We select from Data the column "Yearly Amount Spent" (YAS) and show it as label with "as".


9. Also from the data take only the numeric columns.
```Scala
data.select (data ("Yearly Amount Spent"). as ("label"), $ "Avg Session Length", $ "Time on App", $ "Time on Website", $ "Length of Membership"). show
```
We return to select YAS as label, and we identify which are the columns that contain numerical values ​​thanks to instruction 4, we also select these in the same function.

The information only shows our label column and all numeric columns.

10. Leave all this as a new Data Frame called df
To work with this information, a new data frame must be created with this same selection.
```Scala
val df = data.select (data ("Yearly Amount Spent"). as ("label"), $ "Avg Session Length", $ "Time on App", $ "Time on Website", $ "Length of Membership" )
df.show
```
11.  Let the assembler object convert the input values to a vector
```Scala
val assembler = (Vector("label","Avg Session Length","Time on App","Time on Website","Length of Membership"))
```
The assembler variable is assigned the input values so that they are loaded into the vector by means of the column names
12. Use the VectorAssembler object to convert the input columns of the df to a single output column of an array named "features".
Set the input columns where we are supposed to read the values from.
Call this new assambler.
```Scala
val assembler = new VectorAssembler().setInputCols(Array("Avg Session Length","Time on App","Time on Website","Length of Membership")).setOutputCol("features")
```
The assembler variable is taken to create an object in which that is applied to the Array of the input columns to become a single output column named features
13. Use the assembler to transform our DataFrame to two columns: label and features
```Scala
val output= assembler.transform(df).select($"label", $"features")
```
A variable is created to load the result of the transformation of the dataframe with assembler only by taking the label and features columns
14.  Create an object for a linear regression model.
```Scala
val lr = new LinearRegression()
```
An object with the name lr is created which will be the model for the linear regression model
15. Fit the model for the data and call this model lrModel
```Scala
val lrModel = lr.fit(output)
```
A variable is created which will fit the lr model and fit the data taken from our output
16. Print the coefficients and intercept for linear regression
```Scala
  println(s"Coefficients: ${lrModel.coefficients} Intercept: ${lrModel.intercept}")
```
We print the value of the coefficient extracting it from the lrmodel model and the intercept equal
17. Summarize the model on the training set print the output of some metrics
```Scala
println(lrModel)
```
The model is printed to see the training that was obtained from the data
18. Use our model's .summary method to create an object called trainingSummary
```Scala
val trainingSummary = lrModel.summary
```
We create a variable in which the result of the summary of the linear regression model will be stored
19. Show the values of residuals, the RMSE, the MSE, and also the R ^ 2.
```Scala
trainingSummary.residuals.show()
trainingSummary.predictions.show()
trainingSummary.r2 
trainingSummary.rootMeanSquaredError
```
By having a variable which has the summary of our model we can obtain different types of visualization and calculations with it, as in this case printing the residuals, predictions, the r ^ 2 and rootMeanSquaredError
## Practice 2

Practice 2 was an analysis of the code of the files lr.scala (Linear Regression) and PracticaLogisticRegression (Logistic Regression), we explained the code used in our own words

### 2-1
> Linear Regression

```Scala
import org.apache.spark.sql.SparkSession
import org.apache.spark.ml.regression.LinearRegression
```
Before, two libraries must be imported, the first SparkSession which is the one that reads the csv files and with it we can work with dataframes, the second LinearRegression which, as its name says, with it we can perform linear regressions.
```Scala
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)
```
What these lines of code do is remove many errors and messages continue to appear, but they are reduced, if you do not want even an error message to appear, you can set it to Level.OFF.

```Scala
val spark = SparkSession.builder().getOrCreate()
val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("Clean-USA-Housing.csv")
data.printSchema
data.head(1)
```
A spark variable was created, which is the one that will read the CSV file, the data frame was given the name of data, with spark.read it is possible to pass the information to this new data frame, we indicate that the format is csv and in the load goes the name of the file, it must be in the same folder where our file is (You can also place the exact link where the csv file is), print the data frame and the first row to see the information .

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
The variable colnames has the data columns, firstrow contains the first row of the dataframe, when printing "\ n" a blank space is printed, it is to make a separation when printing the results, then there is a for where ind has a range of 1 to the number of columns, print the first column, the first row, a space, enter the for again and print again until it reaches the number of columns.
```Scala
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
```
New vector libraries are imported that will be needed to perform the linear regression.
```Scala
data.columns
val df = data.select(data("Price").as("label"), $"Avg Area Income", $"Avg Area House Age", $"Avg Area Number of Rooms", $"Avg Area Number of Bedrooms", $"Area Population")
```

Print the columns to see which ones are numerical, df is a new data frame that contains the data information, Price was selected as label, "Avg Area Income", "Avg Area House Age", "Avg Area Number of Rooms "," Avg Area Number of Bedrooms ", and" Area Population ".
```Scala
//Transform to vector to the ml algorith can read the input
val assembler = new VectorAssembler().setInputCols(Array("Avg Area Income", "Avg Area House Age", "Avg Area Number of Rooms", "Avg Area Number of Bedrooms", "Area Population")).setOutputCol("features")
val output = assembler.transform(df).select($"label", $"features")
output.show()
```
The data conversion of the input columns to data is carried out excluding label and these are made a single column which will be output data, when performing this combination the name of features is given with this the data is grouped only in two columns to apply the model, a variable is created in which our previous grouping in the assembler variable will be transformed and the data extracted from the df of the columns created in the previous instruction will be assigned.
```Scala
//Linear regression model
val lr = new LinearRegression()
val lrModel = lr.fit(output)
val trainingSummary = lrModel.summary
```
The object is created to use the linear regression model, when having the object the model is created using the previous object and making a fit with the ouput data which was taken from the df and finally we assign the summary of our model to a variable which will be our training variable for the summary data.
```Scala
trainingSummary.resuduals.show()
trainingSummary.predictions.show()
trainingSummary.r2 //variaza que hay 
trainingSummary.rootMeanSquaredError
```
We print the data in which we can visualize the residual of our model with our training data, the prediction, the r ^ 2 and the rootMeanSquaredError for analysis with the linear regression model.
### 2-2 
> Logistic Regression

```Scala
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.sql.SparkSession
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)
val spark = SparkSession.builder().getOCreate()
val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("advertising.csv")
```
It starts very similar to the example of linear regression, only instead of importing the LinearRegression library we are importing LogisticRegression, we add a Logger with Level.Error to decrease the warning messages and create our spark variable, with that we give the values of the file advertising.csv to our new data frame.

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
The variable colnames has the data columns, firstrow contains the first row of the dataframe, when printing "\ n" a blank space is printed, it is to make a separation when printing the results, then there is a for where ind has a range of 1 to the number of columns, print the first column, the first row, a space, enter the for again and print again until it reaches the number of columns.
```Scala
val timedata = data.withColumn("Hour",hour(data("Timestamp")))
```
A new dataframe called timedata was created to which the same Data values will be given, with the difference that a new column called Hour will be added, after the comma hour is declared, which is the data type of time type to show and this will take them from Timestamp.
```Scala
val logregdata = timedata.select(data("Clicked on Ad").as("label"), $"Daily Time Spent on Site", $"Age", $"Area Income", $"Daily Internet Usage", $"Hour", $"Male")
```
Another Data frame is created now called logredata, this will select from timedata the column "Clicked on Ad" which will have the name of "label", and also select other columns, but only those that have numerical data ("Daily Time Spent on Site "," Age "," Area Income "," Daily Internet Usage "," Hour "and" Male ")
```Scala
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
```
New vector libraries that will be needed to perform the logistic regression are imported.
```Scala
val assembler = (new VectorAssembler()
                  .setInputCols(Array("Daily Time Spent on Site", "Age","Area Income","Daily Internet Usage","Hour","Male"))
                  .setOutputCol("features"))
// Utilice randomSplit para crear datos de train y test divididos en 70/30
val Array(training, test) = logregdata.randomSplit(Array(0.7, 0.3), seed = 12345)
```
An object called assembles is created where we will load the input columns and give it the name of features for the output
We create a variable which will be an array that will contain the training and test values, it is loaded 70 for training and 30 for testing
```Scala
import org.apache.spark.ml.Pipeline
val lr = new LogisticRegression()
val pipeline = new Pipeline().setStages(Array(assembler, lr))
val model = pipeline.fit(training)
val results = model.transform(test)
```
The pipeline library is loaded, we create our logistic regression object the pipeline object where we will embed the assembler values and that of the LR object, we create the model for the training data, then we load the model with the data in a variable test.
```Scala
import org.apache.spark.mllib.evaluation.MulticlassMetrics
val predictionAndLabels = results.select($"prediction",$"label").as[(Double, Double)].rdd
val metrics = new MulticlassMetrics(predictionAndLabels)
println("Confusion matrix:")
println(metrics.confusionMatrix)

metrics.accuracy
```
We import the library of to predict, we create our variable where we will load the result of our model and the test data, an object is created where we will load our prediction variable and finally we print our confusion matrix
## Practice 3
> Basic Statistics
Basic statistics are important for big data because they are necessary for the different types of analysis that are performed in data analysis with the different types of analysis that we see in later practices.
### Correlation
Pearson's correlation coefficient is a test that measures the statistical relationship between two continuous variables. If the association between the elements is not linear, then the coefficient is not adequately represented. The correlation coefficient can take a range of values from +1 to -1. A value of 0 indicates that there is no association between the two variables.
```Scala
import org.apache.spark.ml.linalg.{Matrix, Vectors}
import org.apache.spark.ml.stat.Correlation
import org.apache.spark.sql.Row
```
The libraries that will be needed to perform the correlation, the correlation matrix, the vector library and the row library for relational output are imported.
```Scala
val data = Seq(
  Vectors.sparse(4, Seq((0, 1.0), (3, -2.0))),
  Vectors.dense(4.0, 5.0, 0.0, 3.0),
  Vectors.dense(6.0, 7.0, 0.0, 8.0),
  Vectors.sparse(4, Seq((0, 9.0), (3, 1.0)))
)
```
We assign to our data variable data sequence in the form of vectors, `Vectors.sparse` in which it will contain another sequence, two vectors` Vectors.dense` and finally another vector `Vectors.sparse`. The sparse vectors are supported by a double matrix, this results in the sparse vector 1 the following vector size `4, [0,3], [1.0, -2.0]`
```Scala
val df = data.map(Tuple1.apply).toDF("features")
val Row(coeff1: Matrix) = Correlation.corr(df, "features").head
println(s"Pearson correlation matrix:\n $coeff1")
```
A variable df is created in which we assign the opted content of the data and we give the name to this vector of features, then with a variable type Row named coeffi1 with data in the form of a matrix we assign the value of the correlation with the data of the variable df and the name of the vector features and the correlation matrix is printed
```Scala
val Row(coeff2: Matrix) = Correlation.corr(df, "features", "spearman").head
println(s"Spearman correlation matrix:\n $coeff2")
```
In this coeff2 the calculation of the correlation matrix is performed again, but now with the spearmen variable which performs a mathematical calculation, this result in the matrix is what tells us if the variables are relational.
```Scala
//----------------------------------------coeff1
// Pearson correlation matrix:
//  1.0                   0.055641488407465814  NaN  0.4004714203168137
// 0.055641488407465814  1.0                   NaN  0.9135958615342522
// NaN                   NaN                   1.0  NaN
// 0.4004714203168137    0.9135958615342522    NaN  1.0
//-----------------------------------------coeff2
// Spearman correlation matrix:
//  1.0                  0.10540925533894532  NaN  0.40000000000000174
// 0.10540925533894532  1.0                  NaN  0.9486832980505141
// NaN                  NaN                  1.0  NaN
// 0.40000000000000174  0.9486832980505141   NaN  1.0
```
When looking at the correlation matrices from side to side we see how little by little the values are remaining in a number close to 0 or 1, if the value is closer to 1 it means that there is a relationship between the two variables.
### Hypothesis testing
Hypothesis testing is an act in statistics by which an analyst tests an assumption regarding a population parameter. The methodology used by the analyst depends on the nature of the data used and the reason for the analysis.
```Scala
import org.apache.spark.ml.linalg.{Vector, Vectors}
import org.apache.spark.ml.stat.ChiSquareTest
```
The classes that will be needed to create the ChiSquareTest test using a vector distribution are imported.
```Scala
val data = Seq(
  (0.0, Vectors.dense(0.5, 10.0)),
  (0.0, Vectors.dense(1.5, 20.0)),
  (1.0, Vectors.dense(1.5, 30.0)),
  (0.0, Vectors.dense(3.5, 30.0)),
  (0.0, Vectors.dense(3.5, 40.0)),
  (1.0, Vectors.dense(3.5, 40.0))
)
```
The vectors are loaded into the data variable.
```Scala
val df = data.toDF("label", "features")
val chi = ChiSquareTest.test(df, "features", "label").head
println(s"pValues = ${chi.getAs[Vector](0)}")// output -> [0.6872892787909721,0.6822703303362126]
println(s"degreesOfFreedom ${chi.getSeq[Int](1).mkString("[", ",", "]")}") //output -> degreesOfFreedom [2,3]
println(s"statistics ${chi.getAs[Vector](2)}")///output -> statistics [0.75,1.5]
```
A new variable df is created in which the data variable of seq data is assigned in the form of DataFrame, taking the classification and characteristics, then a variable is created in which the result of the data test will be assigned with the df, label and head features.
The value of pValues is printed taking the value of the variable chi taking the value of the vector with the index 0, then the degreesOfFreedom is printed taking the numerical value with the index 1 taking the separation described in mkString, finally printing the statistics of the variable located in vector index 2
With the value of pValues we realize that it has a .68 that is, a 68% acceptance level
### Summarizer
Vector column summary statistic
SUM: Add the total value for the specified field.
MEAN: Calculates the average for the specified field.
MIN: Finds the smallest value for all records in the specified field.
MAX: Finds the largest value for all records in the specified field.
STD: Finds the standard deviation of the values in the specified field.
Variance: Finds the variance between both values Metrics Extras
COUNT: Finds the number of values included in statistical calculations. This counts all values except null values.
FIRST: Finds the first record in the entry and uses the specified field value.
LAST: Finds the last record in the entry and uses the specified field value.
```Scala
import org.apache.spark.ml.linalg.{Vector, Vectors}
import org.apache.spark.ml.stat.Summarizer
import org.apache.spark.sql.SparkSession
```
The import of the libraries that will be needed for this practice is carried out.
```Scala
  val spark = SparkSession.builder.appName("SummarizerExample").getOrCreate()
    import spark.implicits._
    import Summarizer._
```
An object is created for a normal spark session and the attributes of the spark and Summarizer libraries are imported
```Scala
    val data = Seq(
      (Vectors.dense(2.0, 3.0, 5.0), 1.0),
      (Vectors.dense(4.0, 6.0, 7.0), 2.0)
    )
```
A variable is created in which we are going to load our vectors in matrix form
```Scala
    val df = data.toDF("features", "weight")

    val (meanVal, varianceVal) = df.select(metrics("mean", "variance").summary($"features", $"weight").as("summary")).select("summary.mean", "summary.variance").as[(Vector, Vector)].first()
```
We declare a variable df where the data of the variable "data" is loaded with the header name for each value within the vectors.
We create a variable where we will store the value of the mean and the variance of the dataframe, taking the data of features and weight to these data an alias, we select from our alias and we extract the mean and variance of each data from the separation of the vector of the first value.
```Scala
    println(s"with weight: mean = ${meanVal}, variance = ${varianceVal}")

    val (meanVal2, varianceVal2) = df.select(mean($"features"), variance($"features")).as[(Vector, Vector)].first() 

    println(s"without weight: mean = ${meanVal2}, sum = ${varianceVal2}")
```
We print the variables that we declared in the previous instruction to use them in colola
We create two new variables where we will store but now only from the features column of the vectors in the first order
We print the variables we declare.
## Practice 4
> Decision tree classifier

A decision tree is a graphical and analytical way of representing all the events (events) that can arise from a decision made at a certain time.

```Scala
import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.DecisionTreeClassificationModel
import org.apache.spark.ml.classification.DecisionTreeClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer}
import org.apache.spark.sql.SparkSession
```
Before the pipeline libraries are imported (it is a technique to implement simultaneity at the instruction level within a single processor.), Of classification where we indicate that it is DecisionTreeClassificationModel, DecisionTreeClassifier, one of evaluation that is MulticlassClassificationEvaluation and the features where it includes the indexes.
```Scala
object DecisionTree {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("dtree").getOrCreate()
```
An object called Decision Tree is created, this will have all the code we need, the spark variable is created that contains the sparksession of the dtree file.
```Scala
val data = spark.read.format("libsvm").load("C:/sample_libsvm_data.txt")
```
We create the data variable that will be the dataframe, it will read the sample_libsvm_data file with spark.
```Scala
val labelIndexer = new StringIndexer().setInputCol("label").setOutputCol("indexedLabel").fit(data)
val featureIndexer = new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(4).fit(data)
```
We create the variables labelIndexer and featureIndexer, the first will be our column "label" with the data information, the second will be our column features where.
```Scala
val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3))
```
We create the Array variable that contains the trainingData and testData, this will be equal to a random division between 70 to 30%.
```Scala
val dt = new DecisionTreeClassifier().setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures")
val labelConverter = new IndexToString().setInputCol("prediction").setOutputCol("predictedLabel").setLabels(labelIndexer.labels)
val pipeline = new Pipeline().setStages(Array(labelIndexer, featureIndexer, dt, labelConverter))
val model = pipeline.fit(trainingData)
val predictions = model.transform(testData)
```
Now we create dt that contains the previously created columns, all in the DecisionTreeClassifier function, then we do a conversion to make the label prediction, now pipeline will have all this information.

```Scala
predictions.select("predictedLabel", "label", "features").show()
/*
+--------------+-----+--------------------+
|predictedLabel|label|            features|
+--------------+-----+--------------------+
|           0.0|  0.0|(692,[100,101,102...|
|           0.0|  0.0|(692,[122,123,124...|
|           0.0|  0.0|(692,[122,123,148...|
|           0.0|  0.0|(692,[126,127,128...|
|           0.0|  0.0|(692,[127,128,129...|
|           0.0|  0.0|(692,[152,153,154...|
|           1.0|  0.0|(692,[154,155,156...|
|           1.0|  0.0|(692,[154,155,156...|
|           0.0|  0.0|(692,[155,156,180...|
|           0.0|  0.0|(692,[181,182,183...|
|           1.0|  1.0|(692,[123,124,125...|
|           1.0|  1.0|(692,[124,125,126...|
|           1.0|  1.0|(692,[125,126,127...|
|           1.0|  1.0|(692,[125,126,127...|
|           1.0|  1.0|(692,[126,127,128...|
|           1.0|  1.0|(692,[126,127,128...|
|           1.0|  1.0|(692,[126,127,128...|
|           1.0|  1.0|(692,[127,128,129...|
|           1.0|  1.0|(692,[127,128,129...|
|           1.0|  1.0|(692,[127,128,154...|
+--------------+-----+--------------------+
*/
```
As can be seen in the answers, it has PredictedLabel and label, for it to be 100% correct the values must match, it can be seen that it only made a mistake in one prediction.

```Scala
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("indexedLabel").setPredictionCol("prediction").setMetricName("accuracy")
val accuracy = evaluator.evaluate(predictions)
//accuracy: Double = 0.9310344827586207
println(s"Test Error = ${(1.0 - accuracy)}")
// Test Error = 0.06896551724137934
val treeModel = model.stages(2).asInstanceOf[DecisionTreeClassificationModel]
println(s"Learned classification tree model:\n ${treeModel.toDebugString}")
  }
}
/*
  If (feature 406 <= 9.5)
   Predict: 1.0
  Else (feature 406 > 9.5)
   Predict: 0.0
*/
```
An evaluating variable is created, this will contain the predictions, this is to see the accuracy of the results, the accuracy variable is also created that will take the "error percentage" and the treemodel that will print the model.
The accuracy was 0.9310 and the test error was 0.0689 which suggests that the errors are very low, which was correct because only one error appeared in the first 20 lines.

Now this was the end result. If feature 406 was less than or equal to 9.5, assume that the value to predict is 1.0, otherwise it is 0.0
## Practice 5
> Ramdom Forests Classifier

```Scala
import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.{RandomForestClassificationModel, RandomForestClassifier}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer}
import org.apache.spark.sql.SparkSession
```
The necessary libraries that we will use for this practice are imported
```Scala
val spark = SparkSession.builder.appName("RandomForestClassifierExample").getOrCreate()
val data = spark.read.format("libsvm").option("numFeatures", "780").load("C:/Users/yurid/Documents/RepABigData/Big_Data/U2/Practices/Practice 5__Exp3/sample_libsvm_data.txt")
```
We create the spark variable for a session
We create the data variable where we load the data from the text file.
```Scala
val labelIndexer = new StringIndexer().setInputCol("label").setOutputCol("indexedLabel").fit(data)
val featureIndexer = new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(4).fit(data)
```
We create two objects in which we enter the name of the input values and the name of the output.
```Scala
val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3))
val rf = new RandomForestClassifier().setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures").setNumTrees(10)
```
We create an arrangement where we will load the training data and the test data with a value of 70% training and 30% testing
We create the rf object, load the data and place the values of the columns that they will have and the number of trees that it will generate
```Scala
val labelConverter = new IndexToString().setInputCol("prediction").setOutputCol("predictedLabel").setLabels(labelIndexer.labels)
val pipeline = new Pipeline().setStages(Array(labelIndexer, featureIndexer, rf, labelConverter))
```
Two objects are created in which in one the prediction data will be loaded and in the other object the object variables of the indexes that had been made previously will be loaded
```Scala
val model = pipeline.fit(trainingData)
val predictions = model.transform(testData)
predictions.select("predictedLabel", "label", "features").show(5)
```
We create the variable where we will load the training data, assign these and create the prediction variable where we will load the test data
```Scala
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("indexedLabel").setPredictionCol("prediction").setMetricName("accuracy")
val accuracy = evaluator.evaluate(predictions)
println(s"Test Error = ${(1.0 - accuracy)}")
```
We create an object where the evaluation will be carried out, the indexdLabel data and the prediction data are loaded together with the accuracy, we create the accuracy variable where the evaluation and the prediction will be carried out and finally we print the value of the pureba error data
```Scala
val rfModel = model.stages(2).asInstanceOf[RandomForestClassificationModel]
println(s"Learned classification forest model:\n ${rfModel.toDebugString}")
```
We create a variable where the model will be loaded again and print the wrong data from the test data
## Practice 6
> Gradient-boosted tree classifier

Gradient augmentation is a machine learning technique for classification and regression problems that produces a prediction model in the form of a set of weak prediction models.

```Scala
import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.{GBTClassificationModel, GBTClassifier}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer}
```
The first thing to do is import the pipeline, GBTClassificationModel (Gradient-Boosted-tree), MulticlassClassificationEvaluator and index libraries.
```Scala
val data = spark.read.format("libsvm").load("C:/sample_libsvm_data.txt")
```
We create the data variable that will be the dataframe, it will read the sample_libsvm_data file with spark.
```Scala
val labelIndexer = new StringIndexer().setInputCol("label").setOutputCol("indexedLabel").fit(data)
val featureIndexer = new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(4).fit(data)
```
We create the variables labelIndexer and featureIndexer, the first will be our column "label" with the data information, the second will be our column features where.
```Scala
val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3))
```
We create the Array variable that contains the trainingData and testData, this will be equal to a random division between 70 to 30%.
```Scala
val gbt = new GBTClassifier().setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures").setMaxIter(10).setFeatureSubsetStrategy("auto")
```
Our gbt variable is created, which will be our Gradient boosted tree classifier, MaxIter is set to 10 and the Strategy of subset of functions is automatic.
```Scala
val labelConverter = new IndexToString().setInputCol("prediction").setOutputCol("predictedLabel").setLabels(labelIndexer.labels)
val pipeline = new Pipeline().setStages(Array(labelIndexer, featureIndexer, gbt, labelConverter))
val model = pipeline.fit(trainingData)
```
We do a conversion to make the label prediction, now the pipeline will have all this information in a model.
```Scala
val predictions = model.transform(testData)
predictions.select("predictedLabel", "label", "features").show(20)

/*
+--------------+-----+--------------------+
|predictedLabel|label|            features|
+--------------+-----+--------------------+
|           0.0|  0.0|(692,[100,101,102...|
|           0.0|  0.0|(692,[122,123,124...|
|           0.0|  0.0|(692,[122,123,148...|
|           0.0|  0.0|(692,[123,124,125...|
|           0.0|  0.0|(692,[123,124,125...|
|           0.0|  0.0|(692,[124,125,126...|
|           0.0|  0.0|(692,[125,126,127...|
|           0.0|  0.0|(692,[126,127,128...|
|           0.0|  0.0|(692,[126,127,128...|
|           0.0|  0.0|(692,[126,127,128...|
|           0.0|  0.0|(692,[126,127,128...|
|           0.0|  0.0|(692,[126,127,128...|
|           0.0|  0.0|(692,[126,127,128...|
|           0.0|  0.0|(692,[127,128,129...|
|           0.0|  0.0|(692,[129,130,131...|
|           0.0|  0.0|(692,[151,152,153...|
|           0.0|  0.0|(692,[152,153,154...|
|           1.0|  1.0|(692,[97,98,99,12...|
|           1.0|  1.0|(692,[119,120,121...|
|           1.0|  1.0|(692,[124,125,126...|
+--------------+-----+--------------------+
*/
```

We declare our predictions variable that contains the model transformation and display the first 20 lines of PredictLabel, label and features. As can be seen in the results, the prediction with the first 20 there were no errors, the values of the prediction with label coincide
```Scala
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("indexedLabel").setPredictionCol("prediction").setMetricName("accuracy")
val accuracy = evaluator.evaluate(predictions)
//accuracy: Double = 1.0
println(s"Test Error = ${1.0 - accuracy}")
//Test Error = 0.0
val gbtModel = model.stages(2).asInstanceOf[GBTClassificationModel]
println(s"Learned classification GBT model:\n ${gbtModel.toDebugString}")

/*
Tree 0 (weight 1.0):
    If (feature 434 <= 70.5)
     If (feature 99 in {2.0})
      Predict: -1.0
     Else (feature 99 not in {2.0})
      Predict: 1.0
    Else (feature 434 > 70.5)
     Predict: -1.0
  Tree 1 (weight 0.1):
    If (feature 517 <= 59.0)
     If (feature 239 <= 253.5)
      Predict: 0.47681168808847024
     Else (feature 239 > 253.5)
      Predict: -0.4768116880884694
    Else (feature 517 > 59.0)
     Predict: -0.47681168808847
  Tree 2 (weight 0.1):
    If (feature 462 <= 62.5)
     If (feature 293 <= 253.5)
      Predict: 0.4381935810427206
     Else (feature 293 > 253.5)
      Predict: -0.43819358104271977
    Else (feature 462 > 62.5)
     Predict: -0.4381935810427205
  Tree 3 (weight 0.1):
    If (feature 490 <= 43.0)
     If (feature 239 <= 253.5)
      Predict: 0.40514968028459825
     Else (feature 239 > 253.5)
      Predict: -0.4051496802845982
    Else (feature 490 > 43.0)
     Predict: -0.4051496802845982
  Tree 4 (weight 0.1):
    If (feature 490 <= 43.0)
     If (feature 344 <= 253.5)
      Predict: 0.37658413183529926
     Else (feature 344 > 253.5)
      Predict: -0.3765841318352994
    Else (feature 490 > 43.0)
     Predict: -0.37658413183529915
  Tree 5 (weight 0.1):
    If (feature 462 <= 62.5)
     If (feature 320 <= 253.5)
      Predict: 0.35166478958101
     Else (feature 320 > 253.5)
      Predict: -0.3516647895810099
    Else (feature 462 > 62.5)
     Predict: -0.35166478958101
  Tree 6 (weight 0.1):
    If (feature 490 <= 43.0)
     If (feature 295 <= 253.5)
      Predict: 0.32974984655529926
     Else (feature 295 > 253.5)
      Predict: -0.32974984655530015
    Else (feature 490 > 43.0)
     Predict: -0.32974984655529926
  Tree 7 (weight 0.1):
    If (feature 434 <= 70.5)
     If (feature 293 <= 253.5)
      Predict: 0.3103372455197956
     Else (feature 293 > 253.5)
      Predict: -0.31033724551979525
    Else (feature 434 > 70.5)
     Predict: -0.3103372455197956
  Tree 8 (weight 0.1):
    If (feature 434 <= 70.5)
     If (feature 568 <= 253.5)
      Predict: 0.2930291649125433
     Else (feature 568 > 253.5)
      Predict: -0.29302916491254294
    Else (feature 434 > 70.5)
     Predict: -0.29302916491254327
  Tree 9 (weight 0.1):
    If (feature 434 <= 70.5)
     If (feature 568 <= 253.5)
      Predict: 0.2775066643835825
     Else (feature 568 > 253.5)
      Predict: -0.2775066643835826
    Else (feature 434 > 70.5)
     Predict: -0.2775066643835825
*/
```
Now an evaluating variable is created, it will contain the predictions, this is to see the accuracy of the results, the accuracy variable that will take the "error percentage" and gbtModel that will print the model is also created. Test Error was 0 because there was no error with the first 20 rows.
Gadient Boosted makes the decisions with multiple trees, in this example we printed up to 10 trees which helped it make a more accurate prediction.
## Practice 7
> Multilayer Perceptron Classifier

The multilayer perceptron classifier (MLPC) is a classifier based on the feedforward artificial neural network. MLPC consists of multiple layers of nodes. Each layer is completely connected to the next layer in the network. The nodes in the input layer represent the input data. All other nodes map inputs to outputs by performing a linear combination of the inputs with the node weights and bias and applying a trigger function.
```Scala
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.sql.SparkSession
```
The first thing to do is import the MultilayerPerceptronClassifier, MulticlassCLassificationEvaluator and SparkSession libraries.
```Scala
object MultilayerPerceptronClassifierExample {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("MultilayerPerceptronClassifierExample")
      .getOrCreate()
```
An object is created that will contain all the code for the prediction, where our spark variable is created, it contains the SparkSession where the appName is "MultilayerPerceptronClassifierExample"

```Scala    
    val data = spark.read.format("libsvm").load("C:/sample_multiclass_classification_data.txt")
```
The data variable will be the dataframe that will contain all the data to predict, this will load the data from "sample_multiclass_classification_data.txt"
```Scala
    val splits = data.randomSplit(Array(0.6, 0.4), seed = 1234L)
    val train = splits(0)
    val test = splits(1)
```
We divide the information into train and test, the split will be with random values between 0.6 and 0.4 with the 1234L seed, we create train where we give it the value of 0 for splits and we also create a test where we give it the value of 1 for splits.

```Scala
    val layers = Array[Int](4, 5, 4, 3)
```
The layers are defined with an arrangement in the layers variable, the first value is the size of the input which is 4, with two intermediaries of size 5 and 4, the last value is the size of the output which will be 3, these values cannot change and must always be input 4, output 3.

``` Scala
    val trainer = new MultilayerPerceptronClassifier().setLayers(layers).setBlockSize(128).setSeed(1234L).setMaxIter(100)
    val model = trainer.fit(train)
```
We create the trainer variable that contains the MultilayerPerceptron function, in setLayer the layers are going to be defined, which was already done in the layers variable, the block size is 128 and the seed 1234L, where MaxIter will be 100. We pass this trainer variable to it to the new model variable that a transformer emits.
```Scala
    val result = model.transform(test)
    val predictionAndLabels = result.select("prediction", "label")
    val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")

    println(s"Test set accuracy = ${evaluator.evaluate(predictionAndLabels)}")
    // Output: Test set accuracy = 0.9523809523809523

    spark.stop()
  }
}
```
The model is transformed with test and we create the predictions that are the prediction and label columns of the result, the evaluator variable that will have the MulticlassClassificationEvaluator is created and we name the metric that will be "accuracy", and with that we print the accuracy where evaluator is going to evaluate "predictionAndLabels".
In the end, it gives us a simple answer that is the prediction accuracy which was 0.942, with that it gives us to understand that although it does not have an accuracy of 100%, it is too close to the real results.
## Practice 8
> Linear Support Vector

```Scala
import org.apache.spark.ml.classification.LinearSVC
import org.apache.spark.sql.SparkSession
```
The libraries that we are going to use in this practice are imported, normally we use SparkSession and add the one of the model that we will use
```Scala
val spark = SparkSession.builder.appName("LinearSVCExample").getOrCreate()
// Load training data
val training = spark.read.format("libsvm").option("numFeatures", "780").load("C:/Users/yurid/Documents/RepABigData/Big_Data/U2/Practices/Practice 8_Exp6/sample_libsvm_data.txt")
```
A spark session is created to be used then a variable is created in which we are going to load the data from our text file

```Scala
val lsvc = new LinearSVC().setMaxIter(10).setRegParam(0.1)
// Fit the model
val lsvcModel = lsvc.fit(training)
// Print the coefficients and intercept for linear svc
println(s"Coefficients: ${lsvcModel.coefficients} Intercept: ${lsvcModel.intercept}")
```
An object is created which will have a maximum of 10 iterations
We create the variable of the model
Print the coefficients
The coefficients are the weight of the supports of the vectors until it finds the optimum is that it stops
When it reaches that point it has the two vector supports and makes the separation between the line and the separation groups
The coefficients are the mathematical calculations with which the model performs the search and performs the classification
## Practice 9
> One vs Rest

This strategy consists of fitting one classifier per class. For each classifier, the class conforms to all other classes. In addition to its computational efficiency (only n_classes classifiers are needed), an advantage of this approach is its interpretability. Since each class is represented by one and only one classifier, it is possible to gain knowledge about the class by inspecting its corresponding classifier. This is the most widely used strategy for multiclass classification and is a fair option by default.

```Scala
import org.apache.spark.ml.classification.{LogisticRegression, OneVsRest}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
```
First we import our classification libraries, we are going to adjust it with Logistic Regression, and our Classification Evaluator is also imported, our SparkSession library must also be imported.

```Scala
var inputData = spark.read.format("libsvm").load("C:/sample_multiclass_classification_data.txt")
```
We create our inputData variable that will contain all the data from our sample_multiclass_classification_data file, which is the one we have worked with in another practice, this is done with a reading using spark read.

```Scala
val Array(train, test) = inputData.randomSplit(Array(0.8, 0.2))
```
We generate the train and test division, where in our random split we indicate the arrangement with the percentages, they are 80% data to deliver and 20% prediction.

```Scala
val classifier = new LogisticRegression().setMaxIter(10).setTol(1E-6).setFitIntercept(true)
```
We create our classifier variable that is to instantiate it, where MaxIter is 10, setTol is 1E-6 and we indicate that FitIntercept is true.

```Scala
val ovr = new OneVsRest().setClassifier(classifier)
```
The ovr variable is created that contains our One VS Rest classifier.

```Scala
val ovrModel = ovr.fit(train)
```
We give our multiclass model the fit of ovr where the parameter given is train

```Scala
val predictions = ovrModel.transform(test)
```
The variable that will contain the predictions is created, ovrModel is transformed to give it the test parameter.

```Scala
val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")
```
When creating the evaluator variable, we set its MetricName to be “accuracy” to see how accurate it is at the time of making the predictions.

```Scala
val accuracy = evaluator.evaluate(predictions) //Output -> accuracy: Double = 1.0
println(s"Test Error = ${1 - accuracy}") // Output -> Test Error = 0.0
```
Accuracy is given the evaluator that contains the predictions and Test Error is printed, the results returned say that Accuracy is 1 and Test Error is 0, that means that in its predictions it had a 100% correctness so the error is of 0%.


## Practice 10

> Naive Bayes

Example Iris
```scala
package spark.ml.cookbook.chapter6
import org.apache.spark.mllib.linalg.{Vector, Vectors} 
import org.apache.spark.mllib.regression.LabeledPoint 
import org.apache.spark.mllib.classification.{NaiveBayes, NaiveBayesModel}
import org.apache.spark.mllib.evaluation.{BinaryClassificationMetrics, MulticlassMetrics, MultilabelMetrics, binary}
import org.apache.spark.sql.{SQLContext, SparkSession}
import org.apache.log4j.Logger
import org.apache.log4j.Level
val data = sc.textFile("C:/iris-data-prepared.txt")
```
We import the libraries that are going to be needed for this example of naive bayes and import the data that was previously transformed for treatment
```scala
val NaiveBayesDataSet = data.map { line => val 
columns = line.split(',')
LabeledPoint(columns(4).toDouble,
Vectors.dense(
columns(0).toDouble,
columns(1).toDouble,
columns(2).toDouble,
columns(3).toDouble))
}
```
A new variable is created where a data set of the mapping of columns from 0 to 3 will be loaded, which would be the dense vector
```scala
println(" Total number of data vectors =", NaiveBayesDataSet.count())
// Output -> ( Total number of data vectors =,150)
val distinctNaiveBayesData = NaiveBayesDataSet.distinct() 
println("Distinct number of data vectors = ", 
distinctNaiveBayesData.count())
// Output -> (Distinct number of data vectors = ,147)
```
The total number of vectors is printed and the number of the different vector data is printed.

```scala
distinctNaiveBayesData.collect().take(10).foreach(println(_))
/*
(2.0,[6.3,2.9,5.6,1.8])
(2.0,[7.6,3.0,6.6,2.1])
(1.0,[4.9,2.4,3.3,1.0])
(0.0,[5.1,3.7,1.5,0.4])
(0.0,[5.5,3.5,1.3,0.2])
(0.0,[4.8,3.1,1.6,0.2])
(0.0,[5.0,3.6,1.4,0.2])
(2.0,[7.2,3.6,6.1,2.5])
(1.0,[5.0,2.3,3.3,1.0])
(0.0,[4.6,3.6,1.0,0.2])
*/
```
From the data frame that was created with the dense vectors, 10 vectors are taken and printed to see their coefficients

```scala
val allDistinctData =
distinctNaiveBayesData.randomSplit(Array(.80,.20),10L)
val trainingDataSet = allDistinctData(0)
val testingDataSet = allDistinctData(1)
```
A new variable is assigned the percentage of 80 to training data and 20 to test data with a seed of 10

```scala
println("number of training data =",trainingDataSet.count())
//(number of training data =,111)
println("number of test data =",testingDataSet.count())
//(number of test data =,36)
```
The data count that was assigned for training and testing is printed

```scala
val myNaiveBayesModel = NaiveBayes.train(trainingDataSet)
val predictedClassification = testingDataSet.map( x => 
 (myNaiveBayesModel.predict(x.features), x.label))
```
The model is created in which the training is done with the training dataset and then the prediction is made with the test data by mapping the features and label.

```scala
val metrics = new MulticlassMetrics(predictedClassification)
 val confusionMatrix = metrics.confusionMatrix 
 println("Confusion Matrix= n",confusionMatrix)
/*
16.0  0.0  0.0
0.0   7.0  5.0
0.0   0.0  8.0
*/
```
With metrics we take the metrics from the prediction we make, we see the confusion matrix to see the effectiveness in which the iris grouping was performed

```scala
 val myModelStat=Seq(metrics.precision)
 myModelStat.foreach(println(_))
```
We create a variable to see the precision of our model and later we print it

## Homework 1
In cluster analysis, the elbow method is a heuristic used in determining the number of clusters in a data set. The method consists of plotting the explained variation as a function of the number of clusters, and picking the elbow of the curve as the number of clusters to use.
<div align="right">
- Mosqueda Adamari 
</div>

[Full Version](https://github.com/AdamariMosqueda/Big_Data/blob/Unit_2/U2/Homeworks/Elbow_Mosqueda.md)

## Homework 2
**Introduction**
In this research he describes what the elbow is and in what situations it is needed, as an advance it is a method that supports us in the model of k means to group. 
<div align="right">
- Gutierrez Luna Yuridia Nayeli
</div>

[Full Version](https://github.com/AdamariMosqueda/Big_Data/blob/Unit_2/U2/Homeworks/Elbow_Gutierrez.md)

## Evaluation Unit 2
