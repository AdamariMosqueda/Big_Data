
//1. Descending recursive version
def fib(N: Int): Int = {
    if (N <2){
        return N
    }
    else {
       return fib(N-1) + fib (N-2)
    }
}

//2. Version with explicit formula
//scala.math.pow is to raise a number to N potency, where its first parameter is the number to the N potency
//and the second parameter the potency, in this case to be able to raise i and 1-i to N
//the result most be Double because of scala.math.pow
import scala.math.sqrt
import scala.math.BigDecimal

def fib2(N: Int): Double = {
if (N <2){
        return N
    }
    else {
        var i = (1+ sqrt(5))/2
        var j = (scala.math.pow(i,N) - scala.math.pow((1-i),N))/sqrt(5)
        //This is to reduce decimals
        return BigDecimal(j).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    }
}


//3. Iterative version
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