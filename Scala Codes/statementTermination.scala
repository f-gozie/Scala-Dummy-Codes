// Special cases for compulsory use of semi colon; When writing multiple statements on the same line
if (n > 0) { r = r * n; n -=1 }

// Special cases for using + at the end of a new line is to split same statement into multiple lines
s = s0 + (v - v0) * t + // The + tells the parser that this is not used
    0.5 * (a - a0) * t * t

// Alternative to using writing multiple statement on the same line , you can use the Kernighan & Ritchie brace style
if (n > 0){
    r = r * n
    n -= 1
}