package abc234

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val k = sc.nextLong()
	val str = k.toString(2).replace("1", "2")
	println(str)
}