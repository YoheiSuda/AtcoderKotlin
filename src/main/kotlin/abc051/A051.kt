package abc051

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val s = sc.next()
	//println(s.replace(",", " "))

//	別解
	print(s.map { if (it == ',') ' ' else it }.joinToString(""))
}