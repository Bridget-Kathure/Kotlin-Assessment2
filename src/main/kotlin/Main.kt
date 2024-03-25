fun main(){
    wordsList("Barnie bakes brown bagels and buns")
numbers(arrayOf(56.0,29.0,38.0))
    sphereVolume()
    isPalindrome("Adalab")
}

//Write and invoke a function that given the string “Barnie bakes brown bagels
//and buns” prints out a list of all the other words and characters making up the
//string excluding all possible occurrences of the letter b.

fun wordsList(text:String){
    var newSentence = text.toLowerCase()
    println(newSentence.removePrefix("b"))
}

//Write and invoke one function that takes in an array of integers and returns
//these 3 values:var  sum, count and average of all the elements.
fun numbers(array: Array<Double>):Any{
    return (array.sum())
    return (array.contentToString())
    return (array.average())
}

//The volume of a sphere is calculated using the formula below
//
//V = 4/3 π r3
//
//Write and invoke a function that is capable of accurately calculating the
//volume of any sphere given its radius. Use 3.14159 as π

fun sphereVolume(){
var radius = 12
 var pie = 3.14159
    var volume = 4/3*radius*pie
    println(volume)
}

//A palindrome is a string that reads the same forwards and backwards e.g
//madam, wow, kayak. Write and invoke a function:
//isPalindrome(word: String): Boolean
//that takes in a single word and returns true or false depending on whether the
//word is a palindrome.

fun isPalindrome(word:String):Boolean{
   if (word =="palindrome"){
       println(true) }
    else{
       println(false)}
}