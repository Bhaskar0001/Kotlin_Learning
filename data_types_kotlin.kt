//All data types are  no primitive datatype in kotlin all are taken as class
 //we get a lot of functionality to perform .Here we can create our own data type
fun main() {
    //Data Types-It is a static type of language-run at compile time
    /*- Data Types

  -Data types represent the type of data variabels holds.

  - Number

    Hold any type of numeric values. Numbers can be of two types

    - Integers(Byte-1bytes, Short-2Bytes, Int-4Bytes ,Long-8Bytes)
    - Floating Point(Float-4Bytes, Double-8Bytes)

  - Character

    In kotlin char represented by **Char** keywords
    2Bytes

  - Boolean

    true/false - 1bit

  - Array

    Represendted by Kotlin **Array** class and can be created using function **_arrayOf()_** and **Array()** constructor.

  - String

    In Kotlin String is represented by **String** class.

    Set of character is a string.

    "This is simple string"

    """
    This is raw string*/
              
    var ch:Char ='A'
    val num : Byte=10
    val marks = 34.54F
    val marks_obtain :Double = 34.54 //it is a double value
    val isactive: Boolean= true//
    //String. It is a data type in programming languages that is used to store and manipulate text or sequences of characters. 
    //Strings can be created by enclosing characters in single quotes (''), double quotes ("") or triple quotes (""") .
    val str :String ="Jhonny Bhaiya"
    val message:String ="Don of Vishwapur"
    println("$str.$message")
    println(str)
    println(isactive)
    println(marks_obtain)
    println(marks)
    println(num)
    println(ch)
    println("the character is $ch")
    
    
 //In Kotlin, an array is a fixed-size collection of elements of the same type
//. Arrays are zero-indexed, which means the first element is located at index 0, the second element at index 1, and so on.

// To create an array in Kotlin, you can use the `arrayOf()` function like this:
val numbers = arrayOf(1, 2, 3, 4, 5)
println(numbers[1])
numbers[2]=7
println(numbers[2]) //we can change value inside array but not that array
                    // Whole array is printed with help of loops
               





    
    
}
