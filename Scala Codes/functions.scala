// Function that returns x if the expression (x >= 0) is true and false otherwise
def abs (x: Double) = if (x >= 0) x else -x

// Function that returns the value of r after the for loop
// No need for the return keyword
def fac(n: Int) = 
{
    var r = 1
    for (i <- 1 to n) r = r * i
    r
}

// Return keyword must be used if working with a recursive function

// Wrong
def fac(n: Int): Int = if (n <= 0 1 else n * fac(n-1))

// Right
def fac(n: Int): Int = if (n <= 0 1 else return n * fac(n-1))