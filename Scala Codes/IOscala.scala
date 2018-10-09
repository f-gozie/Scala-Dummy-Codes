// Different output formats

// No newline print
print("Answer: ")

// Newline print
println(42)

// C-style formatting
var name = "Agozie"
var age = 18
printf("Hello, %s! You are %d years old. \n", name, age)

// String interpolation
print(f"Hello, $name! In six months, you'll be age${age + 0.5}%7.2f years old\n")

// Must import io package to readline function
// Note that import statement should conventionally be at the top of the file
import scala.io._
val data = StdIn.readLine("Your name: ")
print("Your age: ")
val num = StdIn.readInt()
println(s"Hello, ${data}! Next year, you will be ${num + 1}.")