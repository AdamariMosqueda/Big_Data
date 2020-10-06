**CONTENT**
- [Practice 1](#practice-1)
- [Practice 2](#practice-2)
  
  <div id='pr1' />

  ## Practice 1 
  En esta práctica creamos algoritmos y jugamos con las variables, ademas de definir la diferencia entre valor y variable en scala

> 1.- Develop a scala algorithm that calcules the radius of a circle
```
import scala.math.sqrt
val r: Double= sqrt(A/3.1416)
```
La fórmula para sacar el radio con el área es r=√Area/π, utilizamos la función sqrt para sacar la raíz, scala no tiene predefinida la libreria por lo que lo importamos primero con import scala.math.sqrt

> 2.- Develop a scala algorithm tells me if a number is prime
```
if (Num%2==0){
    println("It's not a number prime ")
    }else{
        println("It's prime")
        }
```
Se crea la variable Num con el número que desee, un número primo es aquel que es divisible sólo por él mismo y por 1, con el algoritmo planteado si el residuo de su división es 0, nos imprime que no es primo, en caso contrario nos avisa que es primo

> 3.- Given the variable bird = "tweet", use interpolation of string to print "I'm writing a tweet"
```
val bird = "tweet"
val tweet = s"I'm writing a $bird"
```
La variable tweet es una cadena de texto al cual se le suma la variable bird

> 4.- Given the variable message = "Hello Luke, I am your father!" use slilce to extract the sequence "Luke"
```
val message = "Hello Luke, I am your father!"
message slice  (6,10)
```
Message slice toma los caracteres que se le indica, a partir del caracter 6 comienza a tomar la información hasta el caracter 10

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
Al definir MyTuple._7 seleccionamos el elemento número 7 de aquella tupla

<div id='pr2' />

## Practice 2 
En esta practica hacemos uso de listas, arreglos y mapas 
> 5.- What are the unique elements of the list list(1,3,3,4,6,7,3,7)  use conversion to sets
```
val list = List(1,3,3,4,6,7,3,7)
list.toSet
```
toSet converts the List to a Set, muestra los elementos sin repetir: Set(1, 6, 7, 3, 4)

> 6.- Create a map mutable named Names containing the following elements: "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"
```
val Names = collection.mutable.Map(("Jose", 20), ("Luis", 24), ("Ana", 23), ("Susana", 27))
Names
```
El primer parametro es la llave y el segundo es su valor

> 6(a).- Print all of the keys of the map
```
Names.keys
```
Va a imprimir solamente las llaves del mapa: Set(Susana, Ana, Luis, Jose)

> 6(b).- Add the following value to the map("Miguel", 23)
```
Names += ("Miguel" -> 23)
```
Al escribir el nombre del mapa con += te permite agregar una nueva llave con valor en un mapa que ya está creado: Map(Susana -> 27, Ana -> 23, Miguel -> 23, Luis -> 24, Jose -> 20)