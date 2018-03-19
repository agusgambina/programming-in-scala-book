// Sets

// Var and Immutable Set
println("Var and Immutable Set")
var jetSet = scala.collection.immutable.Set("Boeing", "Airbus")
// As the Type is immutable and jetSet is defined with var, this will create a new Set with the same values, add "Lear" and assign to jetSet
jetSet += "Lear"
println(s"Does jetSet contains Cessna? ${jetSet.contains("Cessna")}")
println("-------------------")
println("")

// Val and Immutable Set
println("Val and Immutable Set")
val movieSet = scala.collection.mutable.Set("Pulp Fiction", "Indepence Day")
// In this example the behaviour is different. The movieSet is defined with val, which makes movieSet immutable, however the structure is mutable.
// In other words, "Shrek" will be added to movieSet without creating a new Set, it will mutate the state.
movieSet += "Shrek"
println(movieSet)
println("-------------------")
println("")

// Val and Immutable Set
println("Val and Immutable Set")
val users = scala.collection.immutable.Set("Pam", "Tom")
println("In this case is not possible to add any element without creating a new variable since the variable and the structure are immutables")
println("-------------------")
println("")

// Var and Mutable Set
println("Val and Immutable Set")
var fruits = scala.collection.mutable.Set("Apple", "Orange")
// In this case it will mutate the structure and not recreate the Set, in other words, it will add "Banana" to the same Set
fruits += "Banana"
println("-------------------")
println("")