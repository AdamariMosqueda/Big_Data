**CONTENT**
- [Practice 1](#practice-1)
- [Practice 2](#practice-2)
  
  <div id='pr1' />

  ## Practice 1 
This practice creates algorithms and also variables can be played with, aside from defining the diference between value and variable in scala 

> 1.- Develope a scala algorithm that calcules the radius of a circle
```
import scala.math.sqrt
val r: Double= sqrt(A/3.1416)
```
This formula ( r=√ Area/π ) is used to retrieve the radius with the area. The sqrt function is used to retrieve the root. Scala does not have library predefined therefore we must first import with scala.math.sqrt

> 2.- Develop a scala algorithm tells me if a number is prime
```
if (Num%2==0){
    println("It's not a number prime ")
    }else{
        println("It's prime")
        }
```
Variable Num can be created with any desired number, a prime number is divisible only by itself and 1, with the algorithm in place if the residue of its division is 0, it prints out as a non prime, in contrary case it will inform number is prime.

> 3.- Given the variable bird = "tweet", use interpolation of string to print "I'm writing a tweet"
```
val bird = "tweet"
val tweet = s"I'm writing a $bird"
```
Variable tweet is a chain of text to which variable bird is added

> 4.- Given the variable message = "Hello Luke, I am your father!" use slilce to extract the sequence "Luke"
```
val message = "Hello Luke, I am your father!"
message slice  (6,10)
```
Message slice takes the characters its indicated, starting from character 6 it begins taking information up until character 10.

> 5.- What's the difference between value and variable in scala?
```
"var" it's a variable mutable in the program this data can be change but
in "val" this data can't change because is immutable 
```

> 6.- Given the tuple (2,4,5,1,2,3,3.1416,23) returns 3.1416
``` 
val MyTuple = (2,4,5,1,2,3,3.1416,23)
MyTuple._7
```
When MyTuple._7 is defined the number 7 element is selected from that tuple

<div id='pr2' />

## Practice 2 
In this pratice we make use of lists, arrays and maps
> 1.- Create a list called "list" with the elements "red", "white", "black"
```
val list = List("red","white","black")
```
A variable is created in list mode which will contain elements requested
>2.- Add 5 more items to "list" "green", "yellow", "blue", "orange", "pearl"
```
val list= collection.mutable.Set("red","white","black")
```
in order to add values into list, it first needs to be mutable
```
list+="green"
list+= "yellow"
list+="blue"
list+= "orange"
list+="pearl"
```
Once the list is mutable the elements requested can be added

>3.- Bring the items from "list" "green", "yellow", "blue"
```
for (lists <- list) { 
    if(lists =="green" || lists =="yellow" || lists=="blue")
    println(lists)
    }
```
In order to print the required values a cycle (for) was created which will run through the entire list searching for elements that meet the condition of if, the similitude is print after it is found

>4.-  Create an Array of numbers in the range 1-1000 in steps of 5 by 5
```
val arrNum=Array.range(1,1000,5)
```
A variable is created in Array mode, followed by the range function along side in which the initiating number is given seperated by coma then the finalizing number is added to finish off with the steps.

> 5.- What are the unique elements of the list list(1,3,3,4,6,7,3,7)  use conversion to sets
```
val list = List(1,3,3,4,6,7,3,7)
list.toSet
```
toSet converts the List to a Set, show the elements without repeating: Set(1, 6, 7, 3, 4)

> 6.- Create a map mutable named Names containing the following elements: "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"
```
val Names = collection.mutable.Map(("Jose", 20), ("Luis", 24), ("Ana", 23), ("Susana", 27))
Names
```
The first parameter is the key and the second is its value

> 6(a).- Print all of the keys of the map
```
Names.keys
```
only the maps keys will be printed: Set(Susana, Ana, Luis, Jose)

> 6(b).- Add the following value to the map("Miguel", 23)
```
Names += ("Miguel" -> 23)
```
when writting the maps name with += it allows the addage of a new key with value to a map already created: Map(Susana -> 27, Ana -> 23, Miguel -> 23, Luis -> 24, Jose -> 20)