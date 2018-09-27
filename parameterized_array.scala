val greetStrings = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "World!\n"

for (i <- 0 to 2)
{
	print(greetStrings(i))
}

greetStrings.update(2, "Bitches!")

for (i <- 0 to 2)
{
	print(greetStrings(i))
}
println()