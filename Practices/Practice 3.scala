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

balance(bl) //TRUE output 3 = 3
balance(bl2) ///TRUE output 5 = 5
balance(bl3) //FALSE output 0 /= 130

//Se crea una funcion en la cual resivira como dato una lista esta regresara un dato de tipo Boolean
//Se crean dos variables llamadas primera y segunda se inicializan en 0
//A la variable "segunda" se le asigna el valor de la suma de todos los elementos de la lista que se resiva
//Se crea un ciclo para que que se recorra toda la lista desde 0 hasta el final de la lista
//Se le asigna en cada vuelta del ciclo a "primera" el resultado de el valor de "primera" que tiene en cada ciclo
//y se le suma el valor de lista en la posiscion i (posiscion en la que va la vuelta del ciclo)
//A la variable "segunda" se le asigan el valor de "segunda" que en un principio fue la suma total y a este
//se le resta el valor del elemento de la lista en la posiscion de cada ciclo
//En el  "if" se compara si el valor de la primera y la segunda variables son iguales en cada vuelta para regresar el true
//en caso de que se termine el "for" y no encuentre ninguna igualdad regresa un "false"
//Se crean tres listas diferentes con diferentes valores y se valoran en la funcion 

//Pseudocode
//funcion balance(list)
//declarar primera
//delarar  segunda
//segunda = list.sum
//Cycle for i = range 0 to list length
//primera = primera + list(i)
//segunda = segunda - list(i)
//if primera equals segunda
//return true
//end for
//return false 
//end funcion

//Code 4

def palindromo(palabra:String):Boolean ={
    return (palabra == palabra.reverse)
}

val palabra = "OSO" 
val palabra2 = "ANNA"
val palabra3 = "JUAN"

println(palindromo(palabra)) //TRUE output "OSO"
println(palindromo(palabra2)) //TRUE output "ANNA"
println(palindromo(palabra3)) //FALSE output "NAUJ"

//Se crea una funcion la cual resivira una variable de tipo String el cual regresara un dato Boolean
//Se regresara el tipo de datos "TRUE or FALSE" al comparar la variable de entrada que sea igual a la 
//variable de entrada pero con la funcion "reverse" esta funcion va a escribir el datos de nuestra variable al revez

//Pseudocode
//function palindromo (palabra)
//return Boolean (palabra equals palabra.reverse)
//end function
