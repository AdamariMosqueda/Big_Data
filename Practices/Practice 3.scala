// Practice 3, analyse the following code with your own words


//Code 1
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
val l = List(1,2,3,4,5,6,7,8)
val l2 = List(4,3,22,55,7,8)
listEvens(l)
listEvens(l2)

// The first function tells us if in a list the number is even or odd:
// The function is declared with def where the parameter to be received is a list and the result is a string
//A for loop is made to print all the results to the elements of the list,  
// where n is each element in the list and list indicates where to stop (Number of elements)
//if is declared, n%2==0 indicates that the remainder of the division of n over 2 must be 0, 
//if so, it will print that is even, otherwise it will print that it is odd.
// Once the for loop ends it will print a string that says "Done" to indicate that
// the function has finished.


//pseudocode
//function listevens(list)
//From 0 to amount of elements in list, do
//    if n%2 = 0
//    return n is even
//    in another case
//    return n is odd
//return Done 


//Code 2
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

val af= List(1,7,7)
println(afortunado(af))

//The number 7 is considered of fortune, this second function makes a sum between the numbers of
// a list, but 7 is worth double
//The function is declared with def where the parameter to be received is a list and the result is an Int
//The variable res is declared as 0 which is the one that is going to increase
//A for loop is made to accumulate the sum, where n is each element in the list 
//and list indicates where to stop (Number of elements)
//An if is declared indicating that if the number is 7, Add 14 to the result, otherwise
// the result is added the number of the list and at the end of the for loop return the result
// of the summation.

//pseudocode
//function afortunado(list)
//declare res
//From 0 to amount of elements in list, do
//    if n equals to 7
//    res <- res + 14
//    in another case
//    res <- res + n
//Return res



//Code 3
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

balance(bl)
balance(bl2)
balance(bl3)


//Code 4
def palindromo(palabra:String):Boolean ={
    return (palabra == palabra.reverse)
}

val palabra = "OSO"
val palabra2 = "ANNA"
val palabra3 = "JUAN"

println(palindromo(palabra))
println(palindromo(palabra2))
println(palindromo(palabra3))