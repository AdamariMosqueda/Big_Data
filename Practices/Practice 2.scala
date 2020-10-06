//Practice 2
// 1. Crea una lista llamada "lista" con los elementos "rojo", "blanco", "negro"
// 2. Añadir 5 elementos mas a "lista" "verde" ,"amarillo", "azul", "naranja", "perla"
// 3. Traer los elementos de "lista" "verde", "amarillo", "azul"
// 4. Crea un arreglo de numero en rango del 1-1000 en pasos de 5 en 5

// 5.  What are the unique elements of the list list(1,3,3,4,6,7,3,7)  use conversion to sets
val list = List(1,3,3,4,6,7,3,7)
list.toSet

// 6. Create a map mutable named Names containing the following elements: "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"
val Names = collection.mutable.Map(("Jose", 20), ("Luis", 24), ("Ana", 23), ("Susana", 27))
Names
// 6 a . Print all of the keys of the map
Names.keys

// 6 b . Add the following value to the map("Miguel", 23)
Names += ("Miguel" -> 23)
