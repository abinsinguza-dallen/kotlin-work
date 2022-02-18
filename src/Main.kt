fun main(){
    greetings("Ada")
    modulus(12, 5)
    sum(20, 30, 15, 12)
    interesting()
}
fun greetings(name:String){
    println("Hello "+name)
}
fun modulus(a: Int, b: Int):Int{
    var  modulus = a%b
    println(modulus)
    return modulus
}
fun sum(a: Int, b: Int, c: Int, d: Int): Int{
    var sum = a+b+c+d
    println(sum)
    return sum
}
fun interesting(): String {
    var interesting = "i love coding"
    println(interesting)
    return interesting
}