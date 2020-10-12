//Practice 2

// 1. Create a list called "list" with the elements "red", "white", "black"
val list = List("red","white","black")

// 2. Add 5 more items to "list" "green", "yellow", "blue", "orange", "pearl"
val list= collection.mutable.Set("red","white","black")
list+="green"
list+= "yellow"
list+="blue"
list+= "orange"
list+="pearl"

// 3. Bring the items from "list" "green", "yellow", "blue"
for (lists <- list) { 
    if(lists =="green" || lists =="yellow" || lists=="blue")
    println(lists)
    }

// 4. Create an Array of numbers in the range 1-1000 in steps of 5 by 5
val arrNum=Array.range(1,1000,5)

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
