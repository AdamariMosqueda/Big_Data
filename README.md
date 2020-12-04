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
*spanish*
11. Que el objeto assembler convierta los valores de entrada a un vector
```Scala
val assembler = (Vector("label","Avg Session Length","Time on App","Time on Website","Length of Membership"))
```
A la variable assembler se le asigna los valores de entrada para que se carguen en el vector por medio de los nombre de las columnas

12. Utilice el objeto VectorAssembler para convertir las columnas de entradas del df a una sola columna de salida de un arreglo llamado  "features".
Configure las columnas de entrada de donde se supone que leemos los valores.
Llamar a esto nuevo assambler.
```Scala
val assembler = new VectorAssembler().setInputCols(Array("Avg Session Length","Time on App","Time on Website","Length of Membership")).setOutputCol("features")
```
Se toma la variable assembler para crear un objeto en el cual se aplica que al Array de las columnas de entrada para convertirse en una sola columna de salida con nombre features
13. Utilice el assembler para transform nuestro DataFrame a dos columnas: label and features
```Scala
val output= assembler.transform(df).select($"label", $"features")
```
Se crea una variable para en esta cargar el resultado de la transformacion de el dataframe con assembler unicamente tomando las columnas de label y features
14.  Crear un objeto para modelo de regresion linea.
```Scala
val lr = new LinearRegression()
```
Se crea un objeto con el nombre lr el cual sera el modelo para el modelo de regresion linea
15. Ajuste el modelo para los datos y llame a este modelo lrModelo
```Scala
val lrModel = lr.fit(output)
```
Se crea una variable la cual ajustara el modelo de lr ajustara los datos tomados de output nuestro 
16. Imprima the  coefficients e intercept para la regresion lineal
```Scala
  println(s"Coefficients: ${lrModel.coefficients} Intercept: ${lrModel.intercept}")
```
Imprimimos el valor de el coeficiente extrayendolo de el modelo lrmodel y el intercept igual
17. Resuma el modelo sobre el conjunto de entrenamiento imprima la salida de algunas metricas
```Scala
println(lrModel)
```
Se imprime el modelo para ver el entrenamiento que se obtuvo de los datos
18. Utilize metodo .summary de nuestro  modelo para crear un objeto llamado trainingSummary
```Scala
val trainingSummary = lrModel.summary
```
Creamos una variable en la cual se almacenara el resultado del summary de el modelo de regresion lineal
19. Muestre los valores de residuals, el RMSE, el MSE, y tambien el R^2.
```Scala
trainingSummary.residuals.show()
trainingSummary.predictions.show()
trainingSummary.r2 
trainingSummary.rootMeanSquaredError
```
Al tener una variable la cual tiene el summary de nuestro modelo podemos obtener diferentes tipos de visualizacion y calculos con ello como en este caso imprimir el residuals, predictions, el r^2 y rootMeanSquaredError
## Practice 2

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
```Scala
//Transform to vector to the ml algorith can read the input
val assembler = new VectorAssembler().setInputCols(Array("Avg Area Income", "Avg Area House Age", "Avg Area Number of Rooms", "Avg Area Number of Bedrooms", "Area Population")).setOutputCol("features")
val output = assembler.transform(df).select($"label", $"features")
output.show()
```
Se realiza la conversion de datos de  las columnas de entrada a datos excluyendo label y estas se hacen una sola columna la cual seran datos de salida, al realizar esta combinacion se le da el nomre de  features con esto se tienen agrupados los datos unicamente en dos columnas para poder aplicar el modelo, se crea una variable en la cual nuestro agrupamiento anterios en la variable assembler se transformara y se le asiganara los datos extraidos de el df de las columnas creadas en la instruccion anterior.
```Scala
//Linear regression model
val lr = new LinearRegression()
val lrModel = lr.fit(output)
val trainingSummary = lrModel.summary
```
Se crea el objeto para utilizar el modelo de regresion lineal, al tener el objeto se crea el modelo utilizando el objeto anterior y haciento un fit con los datos de ouput los cuales se tomaron de el df y por ultimo asignamos el summary de nuestro modelo a una variable la cual sera nuestra variable de entrenamiento de los datos de summary.

```Scala
trainingSummary.resuduals.show()
trainingSummary.predictions.show()
trainingSummary.r2 //variaza que hay 
trainingSummary.rootMeanSquaredError
```
Hacemos la impresion de los datos en los cuales podremos visualizar el residuo de nuestro modelo con nuestros datos de entrenamiento, la prediccion, el r^2 y el rootMeanSquaredError para su analis con el modelo de regresion lineal.
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

```Scala
val assembler = (new VectorAssembler()
                  .setInputCols(Array("Daily Time Spent on Site", "Age","Area Income","Daily Internet Usage","Hour","Male"))
                  .setOutputCol("features"))
// Utilice randomSplit para crear datos de train y test divididos en 70/30
val Array(training, test) = logregdata.randomSplit(Array(0.7, 0.3), seed = 12345)
```

```Scala
import org.apache.spark.ml.Pipeline
val lr = new LogisticRegression()
val pipeline = new Pipeline().setStages(Array(assembler, lr))
val model = pipeline.fit(training)
val results = model.transform(test)
```

```Scala
import org.apache.spark.mllib.evaluation.MulticlassMetrics
val predictionAndLabels = results.select($"prediction",$"label").as[(Double, Double)].rdd
val metrics = new MulticlassMetrics(predictionAndLabels)
println("Confusion matrix:")
println(metrics.confusionMatrix)

metrics.accuracy
```
## Practice 3
> Basic Statistics
La estadistica basica es importante para big data debido a que estas son necesrias para los diferentes tipos de analisis que se realizan en analisis de datos con los diferentes tipos de analisis que vemos en practicas posteriores.
### Correlation
El coeficiente de correlación de Pearson es una prueba que mide la relación estadística entre dos variables continuas. Si la asociación entre los elementos no es lineal, entonces el coeficiente no se encuentra representado adecuadamente. El coeficiente de correlación puede tomar un rango de valores de +1 a -1. Un valor de 0 indica que no hay asociación entre las dos variables.
```Scala
import org.apache.spark.ml.linalg.{Matrix, Vectors}
import org.apache.spark.ml.stat.Correlation
import org.apache.spark.sql.Row
```
Se importan las librerias que se necesitaran para realizar la correlation, la matriz de correlacion, la libreria de vectores y la de row para salida relacional.
```Scala
val data = Seq(
  Vectors.sparse(4, Seq((0, 1.0), (3, -2.0))),
  Vectors.dense(4.0, 5.0, 0.0, 3.0),
  Vectors.dense(6.0, 7.0, 0.0, 8.0),
  Vectors.sparse(4, Seq((0, 9.0), (3, 1.0)))
)
```
Asignamos a nuestra variable data secuencia de datos en forma de vectores, `Vectors.sparse` en cual contendra otra secuencia, dos vectores `Vectors.dense` y por ultimo otro vector `Vectors.sparse`. Los vectores sparse estan respaldados por por una matriz doble esto da como resultado en el vector sparse 1 el siguiente tamaño de vector `4,[0,3],[1.0,-2.0]`
```Scala
val df = data.map(Tuple1.apply).toDF("features")
val Row(coeff1: Matrix) = Correlation.corr(df, "features").head
println(s"Pearson correlation matrix:\n $coeff1")
```
Se crea una variable df en la cual asignamos el contenido optenido del data y le damos el nombre a este vector de features, despues con una variable tipo Row con nombre coeffi1 con datos en forma de matriz le asignamos el el valor de la correlacion con los datos de la variable df y el nombre del vector features y se imprime la matriz de correlacion 
```Scala
val Row(coeff2: Matrix) = Correlation.corr(df, "features", "spearman").head
println(s"Spearman correlation matrix:\n $coeff2")
```
En este coeff2 se vuelve a realizar el calculo de la matriz de correlacion pero ahora con la variable de spearmen el cual realiza un calculo matematico, este resultado en la matriz es el que nos indica si las variables son relacionales.
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
Al ver las matrices de correlacion de lado a lado vemos como poco a poco los valores van quedando en un numero aproximado a 0 o 1, si el valor esta mas serca de 1 significa que hay relacion entre las dos varibles.
### Hypothesis testing
La prueba de hipótesis es un acto en estadística mediante el cual un analista prueba una suposición con respecto a un parámetro de población. La metodología empleada por el analista depende de la naturaleza de los datos utilizados y el motivo del anál isis.
```Scala
import org.apache.spark.ml.linalg.{Vector, Vectors}
import org.apache.spark.ml.stat.ChiSquareTest
```
Se importan las clases que se necesitaran para crear el ChiSquareTest pruba utilizando una distribucion de vectores.
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
Se  cargan los vectores a la variable data.
```Scala
val df = data.toDF("label", "features")
val chi = ChiSquareTest.test(df, "features", "label").head
println(s"pValues = ${chi.getAs[Vector](0)}")// output -> [0.6872892787909721,0.6822703303362126]
println(s"degreesOfFreedom ${chi.getSeq[Int](1).mkString("[", ",", "]")}") //output -> degreesOfFreedom [2,3]
println(s"statistics ${chi.getAs[Vector](2)}")///output -> statistics [0.75,1.5]
```
Se crea una nueva variable df en la cual se asigna la variable data de datos seq en forma de DataFrame  tomando la clasificacion y las caracteristicas, despues se crea una variable en la cual se asignara el resutlado de la prueba de datos con el df, label y features de head.
Se imprime el valor de pValues tomando el valor de la variable chi tomando el valor del vector con el indice 0, despues se imprime el degreesOfFreedom tomando el valor numerico con el indice 1 tomando la separacion descrita en mkString, por ultimo impimir la estadistica de la variable ubicada en el vector indice 2
Con el valor de pValues nos damos cuenta que tiene un .68 osea un 68% de nivel de aceptacion
### Summarizer
Estadística de resumen de columnas vectoriales
SUM: Agrega el valor total para el campo especificado.
MEAN: Calcula el promedio para el campo especificado.
MIN: Busca el valor más pequeño para todos los registros del campo especificado.
MAX: Busca el valor más grande para todos los registros del campo especificado.
STD: Busca la desviación estándar de los valores en el campo especificado.
Varianza: Busca la varianza entre ambos valores Metricas Extras
COUNT: Busca la cantidad de valores incluidos en los cálculos estadísticos. Esto cuenta todos los valores excepto los valores nulos.
FIRST: Busca el primer registro de la entrada y utiliza el valor de campo especificado.
LAST: Busca el último registro de la entrada y utiliza el valor de campo especificado.
```Scala
// $example on$
import org.apache.spark.ml.linalg.{Vector, Vectors}
import org.apache.spark.ml.stat.Summarizer
// $example off$
import org.apache.spark.sql.SparkSession
    val spark = SparkSession.builder.appName("SummarizerExample").getOrCreate()

    import spark.implicits._
    import Summarizer._

    // $example on$
    val data = Seq(
      (Vectors.dense(2.0, 3.0, 5.0), 1.0),
      (Vectors.dense(4.0, 6.0, 7.0), 2.0)
    )

    val df = data.toDF("features", "weight")

    val (meanVal, varianceVal) = df.select(metrics("mean", "variance").summary($"features", $"weight").as("summary")).select("summary.mean", "summary.variance").as[(Vector, Vector)].first()

    println(s"with weight: mean = ${meanVal}, variance = ${varianceVal}")

    val (meanVal2, varianceVal2) = df.select(mean($"features"), variance($"features")).as[(Vector, Vector)].first() 

    println(s"without weight: mean = ${meanVal2}, sum = ${varianceVal2}")
    // $example off$
```

## Practice 4
> Decision tree classifier

Un árbol de decisión es una forma gráfica y analítica de representar todos los eventos (sucesos) que pueden surgir a partir de una decisión asumida en cierto momento.

```Scala
import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.DecisionTreeClassificationModel
import org.apache.spark.ml.classification.DecisionTreeClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer}
import org.apache.spark.sql.SparkSession
```
Antes se importan las librerías pipeline (es una técnica para implementar simultaneidad a nivel de instrucciones dentro de un solo procesador.), de clasificación donde indicamos que es  DecisionTreeClassificationModel, DecisionTreeClassifier, una de evaluación que es MulticlassClassificationEvaluation y los feature donde incluye los index.

```Scala
object DecisionTree {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("dtree").getOrCreate()
```
Se crea un objeto llamado Decision Tree, este va a tener todo el código que necesitamos, se crea la variable spark que contiene el sparksession del achivo dtree.
```Scala
val data = spark.read.format("libsvm").load("C:/sample_libsvm_data.txt")
```
Creamos la variable data que será el dataframe, este va a leer con spark el archivo sample_libsvm_data.

```Scala
val labelIndexer = new StringIndexer().setInputCol("label").setOutputCol("indexedLabel").fit(data)
val featureIndexer = new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(4).fit(data)
```
Creamos las variables labelIndexer y featureIndexer, el primero será nuestra columna “label” con la información de data, el segundo será nuestra columna features donde. 

```Scala
val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3))
```
Creamos la variable Array que contiene lo de trainingData y testData, este será igual a una división aleatoria entre 70 a 30%.

```Scala
val dt = new DecisionTreeClassifier().setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures")
val labelConverter = new IndexToString().setInputCol("prediction").setOutputCol("predictedLabel").setLabels(labelIndexer.labels)
val pipeline = new Pipeline().setStages(Array(labelIndexer, featureIndexer, dt, labelConverter))
val model = pipeline.fit(trainingData)
val predictions = model.transform(testData)
```
Ahora creamos dt que contiene las columnas creadas anteriormente, todo en la función DecisionTreeClassifier, luego hacemos una conversión para hacer la predicción de label, ahora pipeline tendrá toda esta información.

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
Como se  puede observar en las respuestas, tiene PredictedLabel y label, para que sea 100% correcta deben coincidir los valores, se puede observar que solo se equivocó en una predicción.

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
Se crea una variable evaluadora, este contendrá las predicciones, esto es para ver la exactitud de los resultados, también se crea la variable accuracy que va a tomar el “porcentaje de error” y treemodel que va imprimir el modelo.
La exactitud fue de 0.9310 y el test error fue de 0.0689 que da a entender que los errores son muy bajos lo cual fue correcto porque en las primeras 20 líneas solo apareció un error.

Ahora este fue el resultado final. Si feature 406 era menor o igual a 9.5, asume que el valor a predecir es 1.0, en caso contrario es 0.0
## Practice 5

## Practice 6
> Gradient-boosted tree classifier

El aumento de gradiente es una técnica de aprendizaje automático para problemas de regresión y clasificación que produce un modelo de predicción en forma de un conjunto de modelos de predicción débiles.

```Scala
import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.{GBTClassificationModel, GBTClassifier}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer}
```
Lo primero que se hace es importar las librerías pipeline, GBTClassificationModel (Gradient-Boosted-tree), MulticlassClassificationEvaluator y los index.

```Scala
val data = spark.read.format("libsvm").load("C:/sample_libsvm_data.txt")
```
Creamos la variable data que será el dataframe, este va a leer con spark el archivo sample_libsvm_data.

```Scala
val labelIndexer = new StringIndexer().setInputCol("label").setOutputCol("indexedLabel").fit(data)
val featureIndexer = new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(4).fit(data)
```
Creamos las variables labelIndexer y featureIndexer, el primero será nuestra columna “label” con la información de data, el segundo será nuestra columna features donde. 

```Scala
val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3))
```
Creamos la variable Array que contiene lo de trainingData y testData, este será igual a una división aleatoria entre 70 a 30%.

```Scala
val gbt = new GBTClassifier().setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures").setMaxIter(10).setFeatureSubsetStrategy("auto")
```
Se crea nuestra variable gbt que va a ser nuestro clasificador Gradient boosted tree, se pone MaxIter a 10 y que la Estrategia de subconjunto de funciones sea automática.

```Scala
val labelConverter = new IndexToString().setInputCol("prediction").setOutputCol("predictedLabel").setLabels(labelIndexer.labels)
val pipeline = new Pipeline().setStages(Array(labelIndexer, featureIndexer, gbt, labelConverter))
val model = pipeline.fit(trainingData)
```
Hacemos una conversión para hacer la predicción de label, ahora pipeline tendrá toda esta información en un modelo.

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

Declaramos nuestra variable predicciones que contiene la transformación del modelo y mostramos las primeras 20 líneas de PredictLabel, label y features. Como se puede observar en los resultados, la predicción con las primeras 20 no hubo errores, coinciden los valores de la predicción con label

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
Ahora se crea una variable evaluadora, esta contendrá las predicciones, esto es para ver la exactitud de los resultados, también se crea la variable accuracy que va a tomar el “porcentaje de error” y gbtModel  que va imprimir el modelo. Test Error fue 0 porque no hubo error con las primeras 20 filas.

Gadient Boosted realiza las decisiones con varios árboles, en este ejemplo nos imprimió hasta 10 árboles que le ayudaron a realizar una predicción más precisa.
