package abc234

import java.util.*

fun main(args: Array<String>) {
	val sc = Scanner(System.`in`)
	val t = sc.nextInt()
	val ans1 = tFunction(tFunction(t) + t)
	val ans2 = tFunction(tFunction(t))
	val ans3 = tFunction(ans1 + ans2)
	println(ans3)
}

fun tFunction(t: Int): Int {
	return (Math.pow(t.toDouble(), 2.0) + (t * 2) + 3).toInt()
}