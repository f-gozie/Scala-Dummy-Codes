// For loop with multiple generators of the form variables <- expressions

println("For loop with multiple generators of the form variables <- expressions")
for (i <- 1 to 3; j <- 1 to 3)
{
    println(f"${10 * i + j}%3d")
}

// For loop with each generator having a guard
println("For loop with each generator having a guard")
for (i <- 1 to 3; j <- 1 to 3 if i != j)
{
    println(f"${10 * i + j}%3d")
}

// For loop that introduces variables that can be used outside the loop
println("For loop that introduces variables that can be used outside the loop")
for (i <- 1 to 3; from = 4 - i; j <- from to 3)
{
    println(f"${10 * i + j}%3d")
}

// For comprehension in which the body of the for loop begins with yield, construction a collection of values, one for each iteration
println("For comprehension in which the body of the for loop begins with yield, construction a collection of values, one for each iteration")
for (i <- 1 to 10) yield i % 3

// Using for comprehension with generators
for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar // yields "HIeflmlmop"

for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar // yields Vector('H', 'e', 'l', 'l', 'o', 'I', 'f', 'm', 'm', 'p')

// Enclosing generators, guards, and definitions for loops in braces and separating them with semi-colons
for {
    i <- 1 to 3
    from = 4 - i
    j <- from to 3
}