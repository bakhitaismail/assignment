fun main() {
    var userName: String = "Bakhita"
    var age: Int = 45
    println("Hello, $userName.")
    println("Hello, $userName I know you are $age years old.")
    println("Born A Crime")
    var x =add(55, 70)
    println(x)
    var y = modulus(100, 25)
    println(y)
    var z = add(15, 25, 35, 45)
    println(z)
    println("I can sing nicely!")

}
fun sayHello() {
    println("Hello,")
}
fun favoriteBook() {
    println("Born A Crime")
}
fun add(num1: Int, num2: Int): Int{
    var sum = num1+num2
    return sum

}
fun modulus(num1: Int, num2: Int): Int {
    var divider = num1%num2
    return divider
}
fun add(num1: Int, num2: Int, num3: Int, num4: Int): Int {
    var sum = num1+num2+num3+num4
    return sum

}
fun interestingFact() {
    println("I can sing nicely!")
}
