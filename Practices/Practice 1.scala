//1. Develop a scala algorithm that calcules the radius of a circle
val r: Double= sqrt(A/3.1416)

//2. Develop a scala algorithm tells me if a number is prime
if (Num%2==0){
    println("It's not a number prime ")
    }else{
        println("It's prime")
        }
//3. Given the variable bird = "tweet", use interpolation of string to print "I'm writing a tweet"
val bird = "tweet"
val tweet = s"I'm writing a $bird"

//4. Given the variable message = "Hello Luke, I am your father!" use slilce to extract the sequence "Luke"
val message = "Hello Luke, I am your father!"
message slice  (6,10)

//5. What's the difference between value and variable in scala?
"var" it's a variable mutable in the program this data can be change but
in "val" this data can't change because is immutable 

//6. Given the tuple (2,4,5,1,2,3,3.1416,23) returns 3.1416 
val MyTuple = (2,4,5,1,2,3,3.1416,23)
MyTuple._7