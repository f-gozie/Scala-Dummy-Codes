// while loop similar to java loop
while (n > 0)
{
    r = r * n
    n -= 1
}

// Using for loop with expression
for (i <- 1 to n)
    r = r * i

// Traversing a string by looping over the index values
val s = "Hello"
var sum = 0
for (i <- 0 to s.length - 1)
    sum += s(i)

// Traversing a string by directly looping over the characters
var sum = 0
for (ch <- "Hello") sum += ch
