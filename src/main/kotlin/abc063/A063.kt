package abc063

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val a = sc.nextInt()
	val b = sc.nextInt()

	println(problemA063(a,b))
}

fun problemA063(a:Int, b:Int): Any {
	val result = a + b
	return if (result >= 10) {
		"error"
	} else {
		result
	}
}