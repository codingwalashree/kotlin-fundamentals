package demo.kotlin

import demo.java.Worker

// Entry point for Kotlin program
fun main() {
    println("Welcome to Coding Wala Shree!")
    println("You are about to explore KOTLIN")
    println("See some Kotlin code for FUN")

    runDemo()
}
// normal class ready to be inherited
open class Employee(val id: Long, val name: String) {}

// data class
data class Person(val name: String) {}

// Function returning String
fun convertToUppercase(str: String) : String {  return str.uppercase()  }

// Infix functions with single-function expression
infix fun Int.add (num: Int): Int = this + num

// function returning void i.e. Unit
fun runDemo() {
    println(convertToUppercase("coding wala Shree"))
    println(1 add 2) // call infix function defined above
    val emp = Employee(1L, "ABC")
    val person = Person("ABC")
    val worker = Worker("XYZ", 34) // instantiating a Worker class written in Java
    val worker1 = Worker1("XYZ", 34) // instantiating a Worker (data) class written in Java
}