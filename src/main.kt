fun main(){
newArray()
    places()
    numerals()
    var w = newNames(arrayOf("Jane","Janice","Jed"))
    println(w)
}
fun newArray(){
var names = arrayOf("Tasha","Sasha","Lisa","Shila")
    println(names.contentToString())
}
fun places(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    cities.sortedArray().forEach { String->
        println(String.capitalize())

    }
}
fun numerals(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1]+numbers[4]
    println(sum)
    var x = numbers.indexOf(158)
    println(x)
    println(numbers.sortedArray().contentToString())
}
fun newNames(names3:Array<String>):String{
    var new = names3.contentToString()
    return new
    }